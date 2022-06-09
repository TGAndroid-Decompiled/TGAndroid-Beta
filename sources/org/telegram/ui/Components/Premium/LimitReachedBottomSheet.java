package org.telegram.ui.Components.Premium;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$TL_boolTrue;
import org.telegram.tgnet.TLRPC$TL_channels_getAdminedPublicChannels;
import org.telegram.tgnet.TLRPC$TL_channels_getInactiveChannels;
import org.telegram.tgnet.TLRPC$TL_channels_updateUsername;
import org.telegram.tgnet.TLRPC$TL_dialogFolder;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messages_chats;
import org.telegram.tgnet.TLRPC$TL_messages_inactiveChats;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.AdminedChannelCell;
import org.telegram.ui.Cells.GroupCreateUserCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerItemsEnterAnimator;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.PremiumPreviewFragment;

public class LimitReachedBottomSheet extends BottomSheetWithRecyclerListView {
    View divider;
    RecyclerItemsEnterAnimator enterAnimator;
    LimitParams limitParams;
    LimitPreviewView limitPreviewView;
    public Runnable onShowPremiumScreenRunnable;
    public Runnable onSuccessRunnable;
    BaseFragment parentFragment;
    public boolean parentIsChannel;
    PremiumButtonView premiumButtonView;
    int rowCount;
    final int type;
    ArrayList<TLRPC$Chat> chats = new ArrayList<>();
    int headerRow = -1;
    int dividerRow = -1;
    int chatsTitleRow = -1;
    int chatStartRow = -1;
    int loadingRow = -1;
    private int currentValue = -1;
    HashSet<TLRPC$Chat> selectedChats = new HashSet<>();
    private ArrayList<TLRPC$Chat> inactiveChats = new ArrayList<>();
    private ArrayList<String> inactiveChatsSignatures = new ArrayList<>();
    private boolean loading = false;

    public static class LimitParams {
        int icon = 0;
        String descriptionStr = null;
        String descriptionStrPremium = null;
        String descriptionStrLocked = null;
        int defaultLimit = 0;
        int premiumLimit = 0;
    }

    private static boolean hasFixedSize(int i) {
        return i == 0 || i == 3 || i == 4 || i == 6 || i == 7;
    }

    public LimitReachedBottomSheet(BaseFragment baseFragment, Context context, int i, int i2) {
        super(baseFragment, false, hasFixedSize(i));
        fixNavigationBar();
        this.parentFragment = baseFragment;
        this.type = i;
        this.currentAccount = i2;
        updateRows();
        if (i == 2) {
            loadAdminedChannels();
        } else if (i == 5) {
            loadInactiveChannels();
        }
    }

    @Override
    public void onViewCreated(FrameLayout frameLayout) {
        super.onViewCreated(frameLayout);
        Context context = frameLayout.getContext();
        this.premiumButtonView = new PremiumButtonView(context, true);
        if (UserConfig.getInstance(this.currentAccount).isPremium() || MessagesController.getInstance(this.currentAccount).premiumLocked) {
            this.premiumButtonView.buttonTextView.setText(LocaleController.getString((int) R.string.OK));
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString("IncreaseLimit", R.string.IncreaseLimit)).append((CharSequence) " d");
            spannableStringBuilder.setSpan(new ColoredImageSpan(ContextCompat.getDrawable(context, R.drawable.msg_limit_2x)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            this.premiumButtonView.buttonTextView.setText(spannableStringBuilder);
        }
        if (!this.hasFixedSize) {
            View view = new View(this, context) {
                @Override
                protected void onDraw(Canvas canvas) {
                    super.onDraw(canvas);
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, Theme.dividerPaint);
                }
            };
            this.divider = view;
            view.setBackgroundColor(Theme.getColor("dialogBackground"));
            frameLayout.addView(this.divider, LayoutHelper.createFrame(-1, 72.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        frameLayout.addView(this.premiumButtonView, LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
        this.recyclerListView.setPadding(0, 0, 0, AndroidUtilities.dp(72.0f));
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view2, int i) {
                LimitReachedBottomSheet.this.lambda$onViewCreated$0(view2, i);
            }
        });
        this.recyclerListView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view2, int i) {
                boolean lambda$onViewCreated$1;
                lambda$onViewCreated$1 = LimitReachedBottomSheet.this.lambda$onViewCreated$1(view2, i);
                return lambda$onViewCreated$1;
            }
        });
        this.premiumButtonView.buttonTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                LimitReachedBottomSheet.this.lambda$onViewCreated$2(view2);
            }
        });
        this.premiumButtonView.overlayTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                LimitReachedBottomSheet.this.lambda$onViewCreated$3(view2);
            }
        });
        this.enterAnimator = new RecyclerItemsEnterAnimator(this.recyclerListView, true);
    }

    public void lambda$onViewCreated$0(View view, int i) {
        if (view instanceof AdminedChannelCell) {
            AdminedChannelCell adminedChannelCell = (AdminedChannelCell) view;
            TLRPC$Chat currentChannel = adminedChannelCell.getCurrentChannel();
            if (this.selectedChats.contains(currentChannel)) {
                this.selectedChats.remove(currentChannel);
            } else {
                this.selectedChats.add(currentChannel);
            }
            adminedChannelCell.setChecked(this.selectedChats.contains(currentChannel), true);
            updateButton();
        } else if (view instanceof GroupCreateUserCell) {
            GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) view;
            TLRPC$Chat tLRPC$Chat = (TLRPC$Chat) groupCreateUserCell.getObject();
            if (this.selectedChats.contains(tLRPC$Chat)) {
                this.selectedChats.remove(tLRPC$Chat);
            } else {
                this.selectedChats.add(tLRPC$Chat);
            }
            groupCreateUserCell.setChecked(this.selectedChats.contains(tLRPC$Chat), true);
            updateButton();
        }
    }

    public boolean lambda$onViewCreated$1(View view, int i) {
        this.recyclerListView.getOnItemClickListener().onItemClick(view, i);
        view.performHapticFeedback(0);
        return false;
    }

    public void lambda$onViewCreated$2(View view) {
        if (UserConfig.getInstance(this.currentAccount).isPremium() || MessagesController.getInstance(this.currentAccount).premiumLocked) {
            dismiss();
            return;
        }
        BaseFragment baseFragment = this.parentFragment;
        if (baseFragment != null) {
            if (baseFragment.getVisibleDialog() != null) {
                this.parentFragment.getVisibleDialog().dismiss();
            }
            this.parentFragment.presentFragment(new PremiumPreviewFragment());
            Runnable runnable = this.onShowPremiumScreenRunnable;
            if (runnable != null) {
                runnable.run();
            }
            dismiss();
        }
    }

    public void lambda$onViewCreated$3(View view) {
        if (!this.selectedChats.isEmpty()) {
            int i = this.type;
            if (i == 2) {
                revokeSelectedLinks();
            } else if (i == 5) {
                leaveFromSelectedGroups();
            }
        }
    }

    private void leaveFromSelectedGroups() {
        final TLRPC$User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        final ArrayList arrayList = new ArrayList(this.selectedChats);
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle(LocaleController.formatPluralString("LeaveCommunities", arrayList.size(), new Object[0]));
        if (arrayList.size() == 1) {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("ChannelLeaveAlertWithName", R.string.ChannelLeaveAlertWithName, ((TLRPC$Chat) arrayList.get(0)).title)));
        } else {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("ChatsLeaveAlert", R.string.ChatsLeaveAlert, new Object[0])));
        }
        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString("RevokeButton", R.string.RevokeButton), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                LimitReachedBottomSheet.this.lambda$leaveFromSelectedGroups$4(arrayList, user, dialogInterface, i);
            }
        });
        AlertDialog create = builder.create();
        create.show();
        TextView textView = (TextView) create.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor("dialogTextRed2"));
        }
    }

    public void lambda$leaveFromSelectedGroups$4(ArrayList arrayList, TLRPC$User tLRPC$User, DialogInterface dialogInterface, int i) {
        dismiss();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TLRPC$Chat tLRPC$Chat = (TLRPC$Chat) arrayList.get(i2);
            MessagesController.getInstance(this.currentAccount).putChat(tLRPC$Chat, false);
            MessagesController.getInstance(this.currentAccount).deleteParticipantFromChat(tLRPC$Chat.id, tLRPC$User, null);
        }
    }

    private void updateButton() {
        if (this.selectedChats.size() > 0) {
            String str = null;
            int i = this.type;
            if (i == 2) {
                str = LocaleController.formatPluralString("RevokeLinks", this.selectedChats.size(), new Object[0]);
            } else if (i == 5) {
                str = LocaleController.formatPluralString("LeaveCommunities", this.selectedChats.size(), new Object[0]);
            }
            this.premiumButtonView.setOverlayText(str, true);
            return;
        }
        this.premiumButtonView.clearOverlayText();
    }

    @Override
    public CharSequence getTitle() {
        return LocaleController.getString("LimitReached", R.string.LimitReached);
    }

    @Override
    public RecyclerListView.SelectionAdapter createAdapter() {
        return new RecyclerListView.SelectionAdapter() {
            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return viewHolder.getItemViewType() == 1 || viewHolder.getItemViewType() == 4;
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                HeaderView headerView;
                Context context = viewGroup.getContext();
                if (i == 1) {
                    headerView = new AdminedChannelCell(context, new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(((AdminedChannelCell) view.getParent()).getCurrentChannel());
                            LimitReachedBottomSheet.this.revokeLinks(arrayList);
                        }
                    }, true, 9);
                } else if (i == 2) {
                    headerView = new ShadowSectionCell(context, 12, Theme.getColor("windowBackgroundGray"));
                } else if (i == 3) {
                    HeaderCell headerCell = new HeaderCell(context);
                    headerCell.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                    headerView = headerCell;
                } else if (i == 4) {
                    headerView = new GroupCreateUserCell(context, 1, 8, false);
                } else if (i != 5) {
                    headerView = new HeaderView(LimitReachedBottomSheet.this, context);
                } else {
                    FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, null);
                    flickerLoadingView.setViewType(LimitReachedBottomSheet.this.type == 2 ? 22 : 21);
                    flickerLoadingView.setIsSingleCell(true);
                    flickerLoadingView.setIgnoreHeightCheck(true);
                    flickerLoadingView.setItemsCount(10);
                    headerView = flickerLoadingView;
                }
                headerView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                return new RecyclerListView.Holder(headerView);
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                boolean z = false;
                if (viewHolder.getItemViewType() == 4) {
                    TLRPC$Chat tLRPC$Chat = (TLRPC$Chat) LimitReachedBottomSheet.this.inactiveChats.get(i - LimitReachedBottomSheet.this.chatStartRow);
                    GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) viewHolder.itemView;
                    groupCreateUserCell.setObject(tLRPC$Chat, tLRPC$Chat.title, (String) LimitReachedBottomSheet.this.inactiveChatsSignatures.get(i - LimitReachedBottomSheet.this.chatStartRow), true);
                    groupCreateUserCell.setChecked(LimitReachedBottomSheet.this.selectedChats.contains(tLRPC$Chat), false);
                } else if (viewHolder.getItemViewType() == 1) {
                    LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
                    TLRPC$Chat tLRPC$Chat2 = limitReachedBottomSheet.chats.get(i - limitReachedBottomSheet.chatStartRow);
                    AdminedChannelCell adminedChannelCell = (AdminedChannelCell) viewHolder.itemView;
                    TLRPC$Chat currentChannel = adminedChannelCell.getCurrentChannel();
                    adminedChannelCell.setChannel(tLRPC$Chat2, false);
                    boolean contains = LimitReachedBottomSheet.this.selectedChats.contains(tLRPC$Chat2);
                    if (currentChannel == tLRPC$Chat2) {
                        z = true;
                    }
                    adminedChannelCell.setChecked(contains, z);
                } else if (viewHolder.getItemViewType() == 3) {
                    HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                    if (LimitReachedBottomSheet.this.type == 2) {
                        headerCell.setText(LocaleController.getString("YourPublicCommunities", R.string.YourPublicCommunities));
                    } else {
                        headerCell.setText(LocaleController.getString("LastActiveCommunities", R.string.LastActiveCommunities));
                    }
                }
            }

            @Override
            public int getItemViewType(int i) {
                LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
                if (limitReachedBottomSheet.headerRow == i) {
                    return 0;
                }
                if (limitReachedBottomSheet.dividerRow == i) {
                    return 2;
                }
                if (limitReachedBottomSheet.chatsTitleRow == i) {
                    return 3;
                }
                if (limitReachedBottomSheet.loadingRow == i) {
                    return 5;
                }
                return limitReachedBottomSheet.type == 5 ? 4 : 1;
            }

            @Override
            public int getItemCount() {
                return LimitReachedBottomSheet.this.rowCount;
            }
        };
    }

    public void setCurrentValue(int i) {
        this.currentValue = i;
    }

    public class HeaderView extends LinearLayout {
        @SuppressLint({"SetTextI18n"})
        public HeaderView(LimitReachedBottomSheet limitReachedBottomSheet, Context context) {
            super(context);
            String str;
            float f;
            int i;
            float f2;
            float f3;
            setOrientation(1);
            setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
            LimitParams limitParams = LimitReachedBottomSheet.getLimitParams(limitReachedBottomSheet.type, ((BottomSheet) limitReachedBottomSheet).currentAccount);
            limitReachedBottomSheet.limitParams = limitParams;
            int i2 = limitParams.icon;
            boolean z = MessagesController.getInstance(((BottomSheet) limitReachedBottomSheet).currentAccount).premiumLocked;
            if (z) {
                str = limitReachedBottomSheet.limitParams.descriptionStrLocked;
            } else {
                str = UserConfig.getInstance(((BottomSheet) limitReachedBottomSheet).currentAccount).isPremium() ? limitReachedBottomSheet.limitParams.descriptionStrPremium : limitReachedBottomSheet.limitParams.descriptionStr;
            }
            LimitParams limitParams2 = limitReachedBottomSheet.limitParams;
            int i3 = limitParams2.defaultLimit;
            int i4 = limitParams2.premiumLimit;
            int i5 = limitReachedBottomSheet.currentValue;
            int i6 = limitReachedBottomSheet.type;
            if (i6 == 3) {
                i5 = MessagesController.getInstance(((BottomSheet) limitReachedBottomSheet).currentAccount).dialogFilters.size() - 1;
            } else if (i6 == 7) {
                i5 = UserConfig.getActivatedAccountsCount();
            }
            if (limitReachedBottomSheet.type == 0) {
                ArrayList<TLRPC$Dialog> dialogs = MessagesController.getInstance(((BottomSheet) limitReachedBottomSheet).currentAccount).getDialogs(0);
                int size = dialogs.size();
                int i7 = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    TLRPC$Dialog tLRPC$Dialog = dialogs.get(i8);
                    if (!(tLRPC$Dialog instanceof TLRPC$TL_dialogFolder) && tLRPC$Dialog.pinned) {
                        i7++;
                    }
                }
                i5 = i7;
            }
            if (UserConfig.getInstance(((BottomSheet) limitReachedBottomSheet).currentAccount).isPremium()) {
                f = 1.0f;
                i5 = i4;
            } else {
                i5 = i5 < 0 ? i3 : i5;
                if (limitReachedBottomSheet.type != 7) {
                    f3 = i5;
                    f2 = i4;
                } else if (i5 > i3) {
                    f3 = i5 - i3;
                    f2 = i4 - i3;
                } else {
                    f = 0.5f;
                }
                f = f3 / f2;
            }
            LimitPreviewView limitPreviewView = new LimitPreviewView(context, i2, i5, i4);
            limitReachedBottomSheet.limitPreviewView = limitPreviewView;
            limitPreviewView.setBagePosition(f);
            limitReachedBottomSheet.limitPreviewView.setType(limitReachedBottomSheet.type);
            limitReachedBottomSheet.limitPreviewView.defaultCount.setVisibility(8);
            if (z) {
                limitReachedBottomSheet.limitPreviewView.setPremiumLocked();
            } else {
                if (!UserConfig.getInstance(((BottomSheet) limitReachedBottomSheet).currentAccount).isPremium() && ((i = limitReachedBottomSheet.type) == 2 || i == 5)) {
                    limitReachedBottomSheet.limitPreviewView.setDelayedAnimation();
                }
                if (UserConfig.getInstance(((BottomSheet) limitReachedBottomSheet).currentAccount).isPremium()) {
                    limitReachedBottomSheet.limitPreviewView.premiumCount.setVisibility(8);
                    if (limitReachedBottomSheet.type == 6) {
                        limitReachedBottomSheet.limitPreviewView.defaultCount.setText("2 GB");
                    } else {
                        limitReachedBottomSheet.limitPreviewView.defaultCount.setText(Integer.toString(i3));
                    }
                    limitReachedBottomSheet.limitPreviewView.defaultCount.setVisibility(0);
                }
            }
            addView(limitReachedBottomSheet.limitPreviewView, LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            if (limitReachedBottomSheet.type == 6) {
                textView.setText(LocaleController.getString("FileTooLarge", R.string.FileTooLarge));
            } else {
                textView.setText(LocaleController.getString("LimitReached", R.string.LimitReached));
            }
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            addView(textView, LayoutHelper.createLinear(-2, -2, 1, 0, 22, 0, 10));
            TextView textView2 = new TextView(context);
            textView2.setText(AndroidUtilities.replaceTags(str));
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            addView(textView2, LayoutHelper.createLinear(-2, -2, 0, 24, 0, 24, 24));
        }
    }

    public static LimitParams getLimitParams(int i, int i2) {
        LimitParams limitParams = new LimitParams();
        if (i == 0) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).dialogFiltersPinnedLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).dialogFiltersPinnedLimitPremium;
            limitParams.icon = R.drawable.msg_limit_pin;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedPinDialogs", R.string.LimitReachedPinDialogs, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedPinDialogsPremium", R.string.LimitReachedPinDialogsPremium, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedPinDialogsLocked", R.string.LimitReachedPinDialogsLocked, Integer.valueOf(limitParams.defaultLimit));
        } else if (i == 2) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).publicLinksLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).publicLinksLimitPremium;
            limitParams.icon = R.drawable.msg_limit_links;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedPublicLinks", R.string.LimitReachedPublicLinks, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedPublicLinksPremium", R.string.LimitReachedPublicLinksPremium, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedPublicLinksLocked", R.string.LimitReachedPublicLinksLocked, Integer.valueOf(limitParams.defaultLimit));
        } else if (i == 3) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).dialogFiltersLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).dialogFiltersLimitPremium;
            limitParams.icon = R.drawable.msg_limit_folder;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedFolders", R.string.LimitReachedFolders, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedFoldersPremium", R.string.LimitReachedFoldersPremium, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedFoldersLocked", R.string.LimitReachedFoldersLocked, Integer.valueOf(limitParams.defaultLimit));
        } else if (i == 4) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).dialogFiltersChatsLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).dialogFiltersChatsLimitPremium;
            limitParams.icon = R.drawable.msg_limit_chats;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedChatInFolders", R.string.LimitReachedChatInFolders, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedChatInFoldersPremium", R.string.LimitReachedChatInFoldersPremium, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedChatInFoldersLocked", R.string.LimitReachedChatInFoldersLocked, Integer.valueOf(limitParams.defaultLimit));
        } else if (i == 5) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).channelsLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).channelsLimitPremium;
            limitParams.icon = R.drawable.msg_limit_groups;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedCommunities", R.string.LimitReachedCommunities, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedCommunitiesPremium", R.string.LimitReachedCommunitiesPremium, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedCommunitiesLocked", R.string.LimitReachedCommunitiesLocked, Integer.valueOf(limitParams.defaultLimit));
        } else if (i == 6) {
            limitParams.defaultLimit = 100;
            limitParams.premiumLimit = 200;
            limitParams.icon = R.drawable.msg_limit_folder;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedFileSize", R.string.LimitReachedFileSize, "2 GB", "4 GB");
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedFileSizePremium", R.string.LimitReachedFileSizePremium, "4 GB");
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedFileSizeLocked", R.string.LimitReachedFileSizeLocked, Integer.valueOf(limitParams.defaultLimit));
        } else if (i == 7) {
            limitParams.defaultLimit = 3;
            limitParams.premiumLimit = 4;
            limitParams.icon = R.drawable.msg_limit_accounts;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 3, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedAccountsPremium", R.string.LimitReachedAccountsPremium, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedAccountsPremium", R.string.LimitReachedAccountsPremium, Integer.valueOf(limitParams.defaultLimit));
        }
        return limitParams;
    }

    private void loadAdminedChannels() {
        this.loading = true;
        updateRows();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC$TL_channels_getAdminedPublicChannels(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                LimitReachedBottomSheet.this.lambda$loadAdminedChannels$6(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadAdminedChannels$6(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LimitReachedBottomSheet.this.lambda$loadAdminedChannels$5(tLObject);
            }
        });
    }

    public void lambda$loadAdminedChannels$5(TLObject tLObject) {
        if (tLObject != null) {
            this.chats.clear();
            this.chats.addAll(((TLRPC$TL_messages_chats) tLObject).chats);
            int i = 0;
            this.loading = false;
            this.enterAnimator.showItemsAnimated(this.chatsTitleRow + 4);
            int i2 = 0;
            while (true) {
                if (i2 >= this.recyclerListView.getChildCount()) {
                    break;
                } else if (this.recyclerListView.getChildAt(i2) instanceof HeaderView) {
                    i = this.recyclerListView.getChildAt(i2).getTop();
                    break;
                } else {
                    i2++;
                }
            }
            updateRows();
            if (this.headerRow >= 0 && i != 0) {
                ((LinearLayoutManager) this.recyclerListView.getLayoutManager()).scrollToPositionWithOffset(this.headerRow + 1, i);
            }
        }
        int max = Math.max(this.chats.size(), this.limitParams.defaultLimit);
        this.limitPreviewView.setIconValue(max);
        this.limitPreviewView.setBagePosition(max / this.limitParams.premiumLimit);
        this.limitPreviewView.startDelayedAnimation();
    }

    private void updateRows() {
        this.rowCount = 0;
        this.dividerRow = -1;
        this.chatStartRow = -1;
        this.loadingRow = -1;
        this.rowCount = 0 + 1;
        this.headerRow = 0;
        if (!hasFixedSize(this.type)) {
            int i = this.rowCount;
            int i2 = i + 1;
            this.rowCount = i2;
            this.dividerRow = i;
            int i3 = i2 + 1;
            this.rowCount = i3;
            this.chatsTitleRow = i2;
            if (this.loading) {
                this.rowCount = i3 + 1;
                this.loadingRow = i3;
            } else {
                this.chatStartRow = i3;
                if (this.type == 5) {
                    this.rowCount = i3 + this.inactiveChats.size();
                } else {
                    this.rowCount = i3 + this.chats.size();
                }
            }
        }
        notifyDataSetChanged();
    }

    private void revokeSelectedLinks() {
        revokeLinks(new ArrayList<>(this.selectedChats));
    }

    public void revokeLinks(final ArrayList<TLRPC$Chat> arrayList) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle(LocaleController.formatPluralString("RevokeLinks", arrayList.size(), new Object[0]));
        if (arrayList.size() == 1) {
            TLRPC$Chat tLRPC$Chat = arrayList.get(0);
            if (this.parentIsChannel) {
                builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + tLRPC$Chat.username, tLRPC$Chat.title)));
            } else {
                builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + tLRPC$Chat.username, tLRPC$Chat.title)));
            }
        } else if (this.parentIsChannel) {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlertChannel", R.string.RevokeLinksAlertChannel, new Object[0])));
        } else {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlert", R.string.RevokeLinksAlert, new Object[0])));
        }
        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString("RevokeButton", R.string.RevokeButton), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                LimitReachedBottomSheet.this.lambda$revokeLinks$8(arrayList, dialogInterface, i);
            }
        });
        AlertDialog create = builder.create();
        create.show();
        TextView textView = (TextView) create.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor("dialogTextRed2"));
        }
    }

    public void lambda$revokeLinks$8(ArrayList arrayList, DialogInterface dialogInterface, int i) {
        dismiss();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TLRPC$TL_channels_updateUsername tLRPC$TL_channels_updateUsername = new TLRPC$TL_channels_updateUsername();
            tLRPC$TL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC$Chat) arrayList.get(i2));
            tLRPC$TL_channels_updateUsername.username = "";
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_channels_updateUsername, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    LimitReachedBottomSheet.this.lambda$revokeLinks$7(tLObject, tLRPC$TL_error);
                }
            }, 64);
        }
    }

    public void lambda$revokeLinks$7(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_boolTrue) {
            AndroidUtilities.runOnUIThread(this.onSuccessRunnable);
        }
    }

    private void loadInactiveChannels() {
        this.loading = true;
        updateRows();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC$TL_channels_getInactiveChannels(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                LimitReachedBottomSheet.this.lambda$loadInactiveChannels$10(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadInactiveChannels$10(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        String str;
        if (tLRPC$TL_error == null) {
            final TLRPC$TL_messages_inactiveChats tLRPC$TL_messages_inactiveChats = (TLRPC$TL_messages_inactiveChats) tLObject;
            final ArrayList arrayList = new ArrayList();
            for (int i = 0; i < tLRPC$TL_messages_inactiveChats.chats.size(); i++) {
                TLRPC$Chat tLRPC$Chat = tLRPC$TL_messages_inactiveChats.chats.get(i);
                int currentTime = (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - tLRPC$TL_messages_inactiveChats.dates.get(i).intValue()) / 86400;
                if (currentTime < 30) {
                    str = LocaleController.formatPluralString("Days", currentTime, new Object[0]);
                } else if (currentTime < 365) {
                    str = LocaleController.formatPluralString("Months", currentTime / 30, new Object[0]);
                } else {
                    str = LocaleController.formatPluralString("Years", currentTime / 365, new Object[0]);
                }
                if (ChatObject.isMegagroup(tLRPC$Chat)) {
                    arrayList.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", tLRPC$Chat.participants_count, new Object[0]), str));
                } else if (ChatObject.isChannel(tLRPC$Chat)) {
                    arrayList.add(LocaleController.formatString("InactiveChannelSignature", R.string.InactiveChannelSignature, str));
                } else {
                    arrayList.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", tLRPC$Chat.participants_count, new Object[0]), str));
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LimitReachedBottomSheet.this.lambda$loadInactiveChannels$9(arrayList, tLRPC$TL_messages_inactiveChats);
                }
            });
        }
    }

    public void lambda$loadInactiveChannels$9(ArrayList arrayList, TLRPC$TL_messages_inactiveChats tLRPC$TL_messages_inactiveChats) {
        this.inactiveChatsSignatures.clear();
        this.inactiveChats.clear();
        this.inactiveChatsSignatures.addAll(arrayList);
        this.inactiveChats.addAll(tLRPC$TL_messages_inactiveChats.chats);
        int i = 0;
        this.loading = false;
        this.enterAnimator.showItemsAnimated(this.chatsTitleRow + 4);
        int i2 = 0;
        while (true) {
            if (i2 >= this.recyclerListView.getChildCount()) {
                break;
            } else if (this.recyclerListView.getChildAt(i2) instanceof HeaderView) {
                i = this.recyclerListView.getChildAt(i2).getTop();
                break;
            } else {
                i2++;
            }
        }
        updateRows();
        if (this.headerRow >= 0 && i != 0) {
            ((LinearLayoutManager) this.recyclerListView.getLayoutManager()).scrollToPositionWithOffset(this.headerRow + 1, i);
        }
        int max = Math.max(this.inactiveChats.size(), this.limitParams.defaultLimit);
        this.limitPreviewView.setIconValue(max);
        this.limitPreviewView.setBagePosition(max / this.limitParams.premiumLimit);
        this.limitPreviewView.startDelayedAnimation();
    }
}
