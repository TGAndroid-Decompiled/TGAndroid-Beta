package org.telegram.ui.Components.Premium;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$TL_boolTrue;
import org.telegram.tgnet.TLRPC$TL_channels_getAdminedPublicChannels;
import org.telegram.tgnet.TLRPC$TL_channels_getInactiveChannels;
import org.telegram.tgnet.TLRPC$TL_channels_updateUsername;
import org.telegram.tgnet.TLRPC$TL_chatInviteExported;
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
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerItemsEnterAnimator;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.PremiumPreviewFragment;
public class LimitReachedBottomSheet extends BottomSheetWithRecyclerListView {
    private boolean canSendLink;
    int chatEndRow;
    int chatStartRow;
    ArrayList<TLRPC$Chat> chats;
    int chatsTitleRow;
    private int currentValue;
    private long dialogId;
    View divider;
    int dividerRow;
    int emptyViewDividerRow;
    RecyclerItemsEnterAnimator enterAnimator;
    private TLRPC$Chat fromChat;
    int headerRow;
    private ArrayList<TLRPC$Chat> inactiveChats;
    private ArrayList<String> inactiveChatsSignatures;
    private boolean isVeryLargeFile;
    LimitParams limitParams;
    LimitPreviewView limitPreviewView;
    private int linkRow;
    private boolean loading;
    int loadingRow;
    public Runnable onShowPremiumScreenRunnable;
    public Runnable onSuccessRunnable;
    BaseFragment parentFragment;
    public boolean parentIsChannel;
    PremiumButtonView premiumButtonView;
    private ArrayList<TLRPC$User> restrictedUsers;
    int rowCount;
    HashSet<Object> selectedChats;
    final int type;

    public static class LimitParams {
        int icon = 0;
        String descriptionStr = null;
        String descriptionStrPremium = null;
        String descriptionStrLocked = null;
        int defaultLimit = 0;
        int premiumLimit = 0;
    }

    private static boolean hasFixedSize(int i) {
        return i == 0 || i == 3 || i == 4 || i == 6 || i == 7 || i == 12 || i == 13 || i == 14 || i == 15 || i == 16;
    }

    public static String limitTypeToServerString(int i) {
        switch (i) {
            case 0:
                return "double_limits__dialog_pinned";
            case 1:
            case 7:
            case 11:
            default:
                return null;
            case 2:
                return "double_limits__channels_public";
            case 3:
                return "double_limits__dialog_filters";
            case 4:
                return "double_limits__dialog_filters_chats";
            case 5:
                return "double_limits__channels";
            case 6:
                return "double_limits__upload_max_fileparts";
            case 8:
                return "double_limits__caption_length";
            case 9:
                return "double_limits__saved_gifs";
            case 10:
                return "double_limits__stickers_faved";
            case 12:
                return "double_limits__chatlist_invites";
            case 13:
                return "double_limits__chatlists_joined";
        }
    }

    public LimitReachedBottomSheet(BaseFragment baseFragment, Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
        super(baseFragment, false, hasFixedSize(i), false, resourcesProvider);
        this.linkRow = -1;
        this.chats = new ArrayList<>();
        this.headerRow = -1;
        this.dividerRow = -1;
        this.chatsTitleRow = -1;
        this.chatStartRow = -1;
        this.chatEndRow = -1;
        this.loadingRow = -1;
        this.emptyViewDividerRow = -1;
        this.currentValue = -1;
        this.selectedChats = new HashSet<>();
        this.inactiveChats = new ArrayList<>();
        this.inactiveChatsSignatures = new ArrayList<>();
        this.restrictedUsers = new ArrayList<>();
        this.loading = false;
        fixNavigationBar(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider));
        this.parentFragment = baseFragment;
        this.currentAccount = i2;
        this.type = i;
        updateTitle();
        updateRows();
        if (i == 2) {
            loadAdminedChannels();
        } else if (i == 5) {
            loadInactiveChannels();
        }
        updatePremiumButtonText();
    }

    @Override
    public void onViewCreated(FrameLayout frameLayout) {
        super.onViewCreated(frameLayout);
        Context context = frameLayout.getContext();
        this.premiumButtonView = new PremiumButtonView(context, true);
        if (!this.hasFixedSize) {
            View view = new View(context) {
                @Override
                protected void onDraw(Canvas canvas) {
                    super.onDraw(canvas);
                    LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
                    if (limitReachedBottomSheet.chatEndRow - limitReachedBottomSheet.chatStartRow > 1) {
                        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, Theme.dividerPaint);
                    }
                }
            };
            this.divider = view;
            view.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider));
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
        this.premiumButtonView.buttonLayout.setOnClickListener(new View.OnClickListener() {
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
            if (this.canSendLink || this.type != 11) {
                GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) view;
                Object object = groupCreateUserCell.getObject();
                if (this.selectedChats.contains(object)) {
                    this.selectedChats.remove(object);
                } else {
                    this.selectedChats.add(object);
                }
                groupCreateUserCell.setChecked(this.selectedChats.contains(object), true);
                updateButton();
            }
        }
    }

    public boolean lambda$onViewCreated$1(View view, int i) {
        this.recyclerListView.getOnItemClickListener().onItemClick(view, i);
        view.performHapticFeedback(0);
        return false;
    }

    public void lambda$onViewCreated$2(View view) {
        if (this.type == 11) {
            return;
        }
        if (UserConfig.getInstance(this.currentAccount).isPremium() || MessagesController.getInstance(this.currentAccount).premiumLocked || this.isVeryLargeFile) {
            dismiss();
            return;
        }
        BaseFragment baseFragment = this.parentFragment;
        if (baseFragment == null) {
            return;
        }
        if (baseFragment.getVisibleDialog() != null) {
            this.parentFragment.getVisibleDialog().dismiss();
        }
        this.parentFragment.presentFragment(new PremiumPreviewFragment(limitTypeToServerString(this.type)));
        Runnable runnable = this.onShowPremiumScreenRunnable;
        if (runnable != null) {
            runnable.run();
        }
        dismiss();
    }

    public void lambda$onViewCreated$3(View view) {
        if (this.type == 11) {
            if (this.selectedChats.isEmpty()) {
                dismiss();
            } else {
                sendInviteMessages();
            }
        } else if (this.selectedChats.isEmpty()) {
        } else {
            int i = this.type;
            if (i == 2) {
                revokeSelectedLinks();
            } else if (i == 5) {
                leaveFromSelectedGroups();
            }
        }
    }

    private void sendInviteMessages() {
        String str;
        TLRPC$ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.fromChat.id);
        if (chatFull == null) {
            dismiss();
            return;
        }
        if (this.fromChat.username != null) {
            str = "@" + this.fromChat.username;
        } else {
            TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported = chatFull.exported_invite;
            if (tLRPC$TL_chatInviteExported != null) {
                str = tLRPC$TL_chatInviteExported.link;
            } else {
                dismiss();
                return;
            }
        }
        Iterator<Object> it = this.selectedChats.iterator();
        while (it.hasNext()) {
            SendMessagesHelper.getInstance(this.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(str, ((TLRPC$User) it.next()).id, null, null, null, true, null, null, null, false, 0, null, false));
            str = str;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LimitReachedBottomSheet.this.lambda$sendInviteMessages$4();
            }
        });
        dismiss();
    }

    public void lambda$sendInviteMessages$4() {
        BulletinFactory global = BulletinFactory.global();
        if (global != null) {
            if (this.selectedChats.size() == 1) {
                global.createSimpleBulletin(R.raw.voip_invite, AndroidUtilities.replaceTags(LocaleController.formatString("InviteLinkSentSingle", R.string.InviteLinkSentSingle, ContactsController.formatName((TLRPC$User) this.selectedChats.iterator().next())))).show();
            } else {
                global.createSimpleBulletin(R.raw.voip_invite, AndroidUtilities.replaceTags(LocaleController.formatPluralString("InviteLinkSent", this.selectedChats.size(), Integer.valueOf(this.selectedChats.size())))).show();
            }
        }
    }

    public void updatePremiumButtonText() {
        if (UserConfig.getInstance(this.currentAccount).isPremium() || MessagesController.getInstance(this.currentAccount).premiumLocked || this.isVeryLargeFile) {
            this.premiumButtonView.buttonTextView.setText(LocaleController.getString("OK", R.string.OK));
            this.premiumButtonView.hideIcon();
            return;
        }
        this.premiumButtonView.buttonTextView.setText(LocaleController.getString("IncreaseLimit", R.string.IncreaseLimit));
        LimitParams limitParams = this.limitParams;
        if (limitParams != null) {
            int i = limitParams.defaultLimit;
            int i2 = i + 1;
            int i3 = limitParams.premiumLimit;
            if (i2 == i3) {
                this.premiumButtonView.setIcon(R.raw.addone_icon);
                return;
            } else if (i != 0 && i3 != 0 && i3 / i >= 1.6f && i3 / i <= 2.5f) {
                this.premiumButtonView.setIcon(R.raw.double_icon);
                return;
            } else {
                this.premiumButtonView.hideIcon();
                return;
            }
        }
        this.premiumButtonView.hideIcon();
    }

    private void leaveFromSelectedGroups() {
        final TLRPC$User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        final ArrayList arrayList = new ArrayList();
        Iterator<Object> it = this.selectedChats.iterator();
        while (it.hasNext()) {
            arrayList.add((TLRPC$Chat) it.next());
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), this.resourcesProvider);
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
                LimitReachedBottomSheet.this.lambda$leaveFromSelectedGroups$5(arrayList, user, dialogInterface, i);
            }
        });
        AlertDialog create = builder.create();
        create.show();
        TextView textView = (TextView) create.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(Theme.key_text_RedBold, this.resourcesProvider));
        }
    }

    public void lambda$leaveFromSelectedGroups$5(ArrayList arrayList, TLRPC$User tLRPC$User, DialogInterface dialogInterface, int i) {
        dismiss();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TLRPC$Chat tLRPC$Chat = (TLRPC$Chat) arrayList.get(i2);
            MessagesController.getInstance(this.currentAccount).putChat(tLRPC$Chat, false);
            MessagesController.getInstance(this.currentAccount).deleteParticipantFromChat(tLRPC$Chat.id, tLRPC$User);
        }
    }

    private void updateButton() {
        if (this.type == 11) {
            this.premiumButtonView.checkCounterView();
            if (!this.canSendLink) {
                this.premiumButtonView.setOverlayText(LocaleController.getString("Close", R.string.Close), true, true);
            } else if (this.selectedChats.size() > 0) {
                this.premiumButtonView.setOverlayText(LocaleController.getString("SendInviteLink", R.string.SendInviteLink), true, true);
            } else {
                this.premiumButtonView.setOverlayText(LocaleController.getString("ActionSkip", R.string.ActionSkip), true, true);
            }
            this.premiumButtonView.counterView.setCount(this.selectedChats.size(), true);
            this.premiumButtonView.invalidate();
        } else if (this.selectedChats.size() > 0) {
            String str = null;
            int i = this.type;
            if (i == 2) {
                str = LocaleController.formatPluralString("RevokeLinks", this.selectedChats.size(), new Object[0]);
            } else if (i == 5) {
                str = LocaleController.formatPluralString("LeaveCommunities", this.selectedChats.size(), new Object[0]);
            }
            this.premiumButtonView.setOverlayText(str, true, true);
        } else {
            this.premiumButtonView.clearOverlayText();
        }
    }

    @Override
    public CharSequence getTitle() {
        if (this.type == 11) {
            return LocaleController.getString("ChannelInviteViaLink", R.string.ChannelInviteViaLink);
        }
        return LocaleController.getString("LimitReached", R.string.LimitReached);
    }

    @Override
    public RecyclerListView.SelectionAdapter createAdapter() {
        return new RecyclerListView.SelectionAdapter() {
            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
                if (limitReachedBottomSheet.type != 11 || limitReachedBottomSheet.canSendLink) {
                    return viewHolder.getItemViewType() == 1 || viewHolder.getItemViewType() == 4;
                }
                return false;
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                FrameLayout frameLayout;
                Context context = viewGroup.getContext();
                switch (i) {
                    case 1:
                        frameLayout = new AdminedChannelCell(context, new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(((AdminedChannelCell) view.getParent()).getCurrentChannel());
                                LimitReachedBottomSheet.this.revokeLinks(arrayList);
                            }
                        }, true, 9);
                        break;
                    case 2:
                        frameLayout = new ShadowSectionCell(context, 12, Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                        break;
                    case 3:
                        View headerCell = new HeaderCell(context);
                        headerCell.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                        frameLayout = headerCell;
                        break;
                    case 4:
                        frameLayout = new GroupCreateUserCell(context, 1, 8, false);
                        break;
                    case 5:
                        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, null);
                        flickerLoadingView.setViewType(LimitReachedBottomSheet.this.type == 2 ? 22 : 21);
                        flickerLoadingView.setIsSingleCell(true);
                        flickerLoadingView.setIgnoreHeightCheck(true);
                        flickerLoadingView.setItemsCount(10);
                        frameLayout = flickerLoadingView;
                        break;
                    case 6:
                        frameLayout = new View(this, LimitReachedBottomSheet.this.getContext()) {
                            @Override
                            protected void onMeasure(int i2, int i3) {
                                super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), 1073741824));
                            }
                        };
                        break;
                    case 7:
                        FrameLayout frameLayout2 = new FrameLayout(LimitReachedBottomSheet.this.getContext());
                        TextView textView = new TextView(context);
                        textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(13.0f));
                        textView.setTextSize(1, 16.0f);
                        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                        textView.setSingleLine(true);
                        frameLayout2.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                        textView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(8.0f), Theme.getColor(Theme.key_graySection, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider), ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_listSelector, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider), 76)));
                        textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                        textView.setText(LimitReachedBottomSheet.this.getBoostLink());
                        textView.setGravity(17);
                        frameLayout = frameLayout2;
                        break;
                    default:
                        frameLayout = new HeaderView(LimitReachedBottomSheet.this, context);
                        break;
                }
                frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                return new RecyclerListView.Holder(frameLayout);
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                if (viewHolder.getItemViewType() == 4) {
                    GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) viewHolder.itemView;
                    LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
                    int i2 = limitReachedBottomSheet.type;
                    if (i2 == 5) {
                        TLRPC$Chat tLRPC$Chat = (TLRPC$Chat) limitReachedBottomSheet.inactiveChats.get(i - LimitReachedBottomSheet.this.chatStartRow);
                        groupCreateUserCell.setObject(tLRPC$Chat, tLRPC$Chat.title, (String) LimitReachedBottomSheet.this.inactiveChatsSignatures.get(i - LimitReachedBottomSheet.this.chatStartRow), ((float) i) != ((float) LimitReachedBottomSheet.this.chatEndRow) - 1.0f);
                        groupCreateUserCell.setChecked(LimitReachedBottomSheet.this.selectedChats.contains(tLRPC$Chat), false);
                    } else if (i2 == 11) {
                        TLRPC$User tLRPC$User = (TLRPC$User) limitReachedBottomSheet.restrictedUsers.get(i - LimitReachedBottomSheet.this.chatStartRow);
                        groupCreateUserCell.setObject(tLRPC$User, ContactsController.formatName(tLRPC$User.first_name, tLRPC$User.last_name), LocaleController.formatUserStatus(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, tLRPC$User, null, null), ((float) i) != ((float) LimitReachedBottomSheet.this.chatEndRow) - 1.0f);
                        groupCreateUserCell.setChecked(LimitReachedBottomSheet.this.selectedChats.contains(tLRPC$User), false);
                    }
                } else if (viewHolder.getItemViewType() == 1) {
                    LimitReachedBottomSheet limitReachedBottomSheet2 = LimitReachedBottomSheet.this;
                    TLRPC$Chat tLRPC$Chat2 = limitReachedBottomSheet2.chats.get(i - limitReachedBottomSheet2.chatStartRow);
                    AdminedChannelCell adminedChannelCell = (AdminedChannelCell) viewHolder.itemView;
                    TLRPC$Chat currentChannel = adminedChannelCell.getCurrentChannel();
                    adminedChannelCell.setChannel(tLRPC$Chat2, false);
                    adminedChannelCell.setChecked(LimitReachedBottomSheet.this.selectedChats.contains(tLRPC$Chat2), currentChannel == tLRPC$Chat2);
                } else if (viewHolder.getItemViewType() == 3) {
                    HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                    LimitReachedBottomSheet limitReachedBottomSheet3 = LimitReachedBottomSheet.this;
                    int i3 = limitReachedBottomSheet3.type;
                    if (i3 != 11) {
                        if (i3 == 2) {
                            headerCell.setText(LocaleController.getString("YourPublicCommunities", R.string.YourPublicCommunities));
                        } else {
                            headerCell.setText(LocaleController.getString("LastActiveCommunities", R.string.LastActiveCommunities));
                        }
                    } else if (!limitReachedBottomSheet3.canSendLink) {
                        if (LimitReachedBottomSheet.this.restrictedUsers.size() == 1) {
                            headerCell.setText(LocaleController.getString("ChannelInviteViaLinkRestricted2", R.string.ChannelInviteViaLinkRestricted2));
                        } else {
                            headerCell.setText(LocaleController.getString("ChannelInviteViaLinkRestricted3", R.string.ChannelInviteViaLinkRestricted3));
                        }
                    } else {
                        headerCell.setText(LocaleController.getString("ChannelInviteViaLink", R.string.ChannelInviteViaLink));
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
                if (limitReachedBottomSheet.emptyViewDividerRow == i) {
                    return 6;
                }
                if (limitReachedBottomSheet.linkRow == i) {
                    return 7;
                }
                int i2 = LimitReachedBottomSheet.this.type;
                return (i2 == 5 || i2 == 11) ? 4 : 1;
            }

            @Override
            public int getItemCount() {
                return LimitReachedBottomSheet.this.rowCount;
            }
        };
    }

    public String getBoostLink() {
        TLRPC$Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
        return "https://" + ChatObject.getPublicUsername(chat) + "?boost";
    }

    public void setCurrentValue(int i) {
        this.currentValue = i;
    }

    public void setVeryLargeFile(boolean z) {
        this.isVeryLargeFile = z;
        updatePremiumButtonText();
    }

    public void setRestrictedUsers(TLRPC$Chat tLRPC$Chat, ArrayList<TLRPC$User> arrayList) {
        this.fromChat = tLRPC$Chat;
        this.canSendLink = ChatObject.canUserDoAdminAction(tLRPC$Chat, 3);
        this.restrictedUsers = new ArrayList<>(arrayList);
        this.selectedChats.clear();
        if (this.canSendLink) {
            this.selectedChats.addAll(this.restrictedUsers);
        }
        updateRows();
        updateButton();
    }

    public class HeaderView extends LinearLayout {
        @SuppressLint({"SetTextI18n"})
        public HeaderView(LimitReachedBottomSheet limitReachedBottomSheet, Context context) {
            super(context);
            String str;
            boolean z;
            String str2;
            int i;
            float f;
            float f2;
            float f3;
            String formatPluralString;
            setOrientation(1);
            setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
            LimitParams limitParams = LimitReachedBottomSheet.getLimitParams(limitReachedBottomSheet.type, ((BottomSheet) limitReachedBottomSheet).currentAccount);
            limitReachedBottomSheet.limitParams = limitParams;
            int i2 = limitParams.icon;
            boolean z2 = MessagesController.getInstance(((BottomSheet) limitReachedBottomSheet).currentAccount).premiumLocked;
            if (limitReachedBottomSheet.type == 11) {
                if (!limitReachedBottomSheet.canSendLink) {
                    if (ChatObject.isChannelAndNotMegaGroup(limitReachedBottomSheet.fromChat)) {
                        formatPluralString = limitReachedBottomSheet.restrictedUsers.size() == 1 ? LocaleController.formatString("InviteChannelRestrictedUsers2One", R.string.InviteChannelRestrictedUsers2One, ContactsController.formatName((TLRPC$User) limitReachedBottomSheet.restrictedUsers.get(0))) : LocaleController.formatPluralString("InviteChannelRestrictedUsers2", limitReachedBottomSheet.restrictedUsers.size(), Integer.valueOf(limitReachedBottomSheet.restrictedUsers.size()));
                    } else {
                        formatPluralString = limitReachedBottomSheet.restrictedUsers.size() == 1 ? LocaleController.formatString("InviteRestrictedUsers2One", R.string.InviteRestrictedUsers2One, ContactsController.formatName((TLRPC$User) limitReachedBottomSheet.restrictedUsers.get(0))) : LocaleController.formatPluralString("InviteRestrictedUsers2", limitReachedBottomSheet.restrictedUsers.size(), Integer.valueOf(limitReachedBottomSheet.restrictedUsers.size()));
                    }
                } else if (!ChatObject.isChannelAndNotMegaGroup(limitReachedBottomSheet.fromChat)) {
                    if (limitReachedBottomSheet.restrictedUsers.size() != 1) {
                        formatPluralString = LocaleController.formatPluralString("InviteRestrictedUsers", limitReachedBottomSheet.restrictedUsers.size(), Integer.valueOf(limitReachedBottomSheet.restrictedUsers.size()));
                    } else {
                        formatPluralString = LocaleController.formatString("InviteRestrictedUsersOne", R.string.InviteRestrictedUsersOne, ContactsController.formatName((TLRPC$User) limitReachedBottomSheet.restrictedUsers.get(0)));
                    }
                } else {
                    formatPluralString = limitReachedBottomSheet.restrictedUsers.size() == 1 ? LocaleController.formatString("InviteChannelRestrictedUsersOne", R.string.InviteChannelRestrictedUsersOne, ContactsController.formatName((TLRPC$User) limitReachedBottomSheet.restrictedUsers.get(0))) : LocaleController.formatPluralString("InviteChannelRestrictedUsers", limitReachedBottomSheet.restrictedUsers.size(), Integer.valueOf(limitReachedBottomSheet.restrictedUsers.size()));
                }
                str2 = formatPluralString;
                z = true;
            } else {
                if (!z2) {
                    str = (UserConfig.getInstance(((BottomSheet) limitReachedBottomSheet).currentAccount).isPremium() || limitReachedBottomSheet.isVeryLargeFile) ? limitReachedBottomSheet.limitParams.descriptionStrPremium : limitReachedBottomSheet.limitParams.descriptionStr;
                } else {
                    str = limitReachedBottomSheet.limitParams.descriptionStrLocked;
                }
                z = z2;
                str2 = str;
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
            if (UserConfig.getInstance(((BottomSheet) limitReachedBottomSheet).currentAccount).isPremium() || limitReachedBottomSheet.isVeryLargeFile) {
                i = i4;
                f = 1.0f;
            } else {
                i5 = i5 < 0 ? i3 : i5;
                if (limitReachedBottomSheet.type != 7) {
                    f2 = i5;
                    f3 = i4;
                } else if (i5 > i3) {
                    f2 = i5 - i3;
                    f3 = i4 - i3;
                } else {
                    i = i5;
                    f = 0.5f;
                }
                float f4 = f2 / f3;
                i = i5;
                f = f4;
            }
            LimitPreviewView limitPreviewView = new LimitPreviewView(context, i2, i, i4, i3 / i4, ((BottomSheet) limitReachedBottomSheet).resourcesProvider);
            limitReachedBottomSheet.limitPreviewView = limitPreviewView;
            limitPreviewView.setBagePosition(f);
            limitReachedBottomSheet.limitPreviewView.setType(limitReachedBottomSheet.type);
            limitReachedBottomSheet.limitPreviewView.defaultCount.setVisibility(8);
            if (!z) {
                if (UserConfig.getInstance(((BottomSheet) limitReachedBottomSheet).currentAccount).isPremium() || limitReachedBottomSheet.isVeryLargeFile) {
                    limitReachedBottomSheet.limitPreviewView.premiumCount.setVisibility(8);
                    if (limitReachedBottomSheet.type == 6) {
                        limitReachedBottomSheet.limitPreviewView.defaultCount.setText("2 GB");
                    } else {
                        limitReachedBottomSheet.limitPreviewView.defaultCount.setText(Integer.toString(i3));
                    }
                    limitReachedBottomSheet.limitPreviewView.defaultCount.setVisibility(0);
                }
            } else {
                limitReachedBottomSheet.limitPreviewView.setPremiumLocked();
            }
            int i9 = limitReachedBottomSheet.type;
            if (i9 == 2 || i9 == 5) {
                limitReachedBottomSheet.limitPreviewView.setDelayedAnimation();
            }
            addView(limitReachedBottomSheet.limitPreviewView, LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            int i10 = limitReachedBottomSheet.type;
            if (i10 == 11) {
                if (limitReachedBottomSheet.canSendLink) {
                    textView.setText(LocaleController.getString("ChannelInviteViaLink", R.string.ChannelInviteViaLink));
                } else {
                    textView.setText(LocaleController.getString("ChannelInviteViaLinkRestricted", R.string.ChannelInviteViaLinkRestricted));
                }
            } else if (i10 == 6) {
                textView.setText(LocaleController.getString("FileTooLarge", R.string.FileTooLarge));
            } else {
                textView.setText(LocaleController.getString("LimitReached", R.string.LimitReached));
            }
            textView.setTextSize(1, 20.0f);
            int i11 = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(i11, ((BottomSheet) limitReachedBottomSheet).resourcesProvider));
            addView(textView, LayoutHelper.createLinear(-2, -2, 1, 0, z ? 8 : 22, 0, 10));
            TextView textView2 = new TextView(context);
            textView2.setText(AndroidUtilities.replaceTags(str2));
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setTextColor(Theme.getColor(i11, ((BottomSheet) limitReachedBottomSheet).resourcesProvider));
            addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 24, 0, 24, 24));
            limitReachedBottomSheet.updatePremiumButtonText();
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
        } else if (i == 12) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).chatlistInvitesLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).chatlistInvitesLimitPremium;
            limitParams.icon = R.drawable.msg_limit_links;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedFolderLinks", R.string.LimitReachedFolderLinks, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedFolderLinksPremium", R.string.LimitReachedFolderLinksPremium, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedFolderLinksLocked", R.string.LimitReachedFolderLinksLocked, Integer.valueOf(limitParams.defaultLimit));
        } else if (i == 13) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).chatlistJoinedLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).chatlistJoinedLimitPremium;
            limitParams.icon = R.drawable.msg_limit_folder;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedSharedFolders", R.string.LimitReachedSharedFolders, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedSharedFoldersPremium", R.string.LimitReachedSharedFoldersPremium, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedSharedFoldersLocked", R.string.LimitReachedSharedFoldersLocked, Integer.valueOf(limitParams.defaultLimit));
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
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedFileSizeLocked", R.string.LimitReachedFileSizeLocked, "2 GB");
        } else if (i == 7) {
            limitParams.defaultLimit = 3;
            limitParams.premiumLimit = 4;
            limitParams.icon = R.drawable.msg_limit_accounts;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 3, Integer.valueOf(limitParams.premiumLimit));
            int i3 = R.string.LimitReachedAccountsPremium;
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedAccountsPremium", i3, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedAccountsPremium", i3, Integer.valueOf(limitParams.defaultLimit));
        } else if (i == 11) {
            limitParams.defaultLimit = 0;
            limitParams.premiumLimit = 0;
            limitParams.icon = R.drawable.msg_limit_links;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 0, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrPremium = "";
            limitParams.descriptionStrLocked = "";
        } else if (i == 14) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).storyExpiringLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).storyExpiringLimitPremium;
            limitParams.icon = R.drawable.msg_limit_stories;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedStoriesCount", R.string.LimitReachedStoriesCount, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            int i4 = R.string.LimitReachedStoriesCountPremium;
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedStoriesCountPremium", i4, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedStoriesCountPremium", i4, Integer.valueOf(limitParams.defaultLimit));
        } else if (i == 15) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).storiesSentWeeklyLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).storiesSentWeeklyLimitPremium;
            limitParams.icon = R.drawable.msg_limit_stories;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedStoriesWeekly", R.string.LimitReachedStoriesWeekly, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            int i5 = R.string.LimitReachedStoriesWeeklyPremium;
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", i5, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", i5, Integer.valueOf(limitParams.defaultLimit));
        } else if (i == 16) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).storiesSentMonthlyLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).storiesSentMonthlyLimitPremium;
            limitParams.icon = R.drawable.msg_limit_stories;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedStoriesMonthly", R.string.LimitReachedStoriesMonthly, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            int i6 = R.string.LimitReachedStoriesMonthlyPremium;
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", i6, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", i6, Integer.valueOf(limitParams.defaultLimit));
        }
        return limitParams;
    }

    private void loadAdminedChannels() {
        this.loading = true;
        updateRows();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC$TL_channels_getAdminedPublicChannels(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                LimitReachedBottomSheet.this.lambda$loadAdminedChannels$7(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadAdminedChannels$7(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LimitReachedBottomSheet.this.lambda$loadAdminedChannels$6(tLObject);
            }
        });
    }

    public void lambda$loadAdminedChannels$6(TLObject tLObject) {
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
        this.chatEndRow = -1;
        this.loadingRow = -1;
        this.linkRow = -1;
        this.emptyViewDividerRow = -1;
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
                int i4 = this.type;
                if (i4 == 11) {
                    this.rowCount = i3 + this.restrictedUsers.size();
                } else if (i4 == 5) {
                    this.rowCount = i3 + this.inactiveChats.size();
                } else {
                    this.rowCount = i3 + this.chats.size();
                }
                int i5 = this.rowCount;
                this.chatEndRow = i5;
                if (i5 - this.chatStartRow > 1) {
                    this.rowCount = i5 + 1;
                    this.emptyViewDividerRow = i5;
                }
            }
        }
        notifyDataSetChanged();
    }

    private void revokeSelectedLinks() {
        ArrayList<TLRPC$Chat> arrayList = new ArrayList<>();
        Iterator<Object> it = this.selectedChats.iterator();
        while (it.hasNext()) {
            this.chats.add((TLRPC$Chat) it.next());
        }
        revokeLinks(arrayList);
    }

    public void revokeLinks(final ArrayList<TLRPC$Chat> arrayList) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), this.resourcesProvider);
        builder.setTitle(LocaleController.formatPluralString("RevokeLinks", arrayList.size(), new Object[0]));
        if (arrayList.size() == 1) {
            TLRPC$Chat tLRPC$Chat = arrayList.get(0);
            if (this.parentIsChannel) {
                int i = R.string.RevokeLinkAlertChannel;
                builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", i, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(tLRPC$Chat), tLRPC$Chat.title)));
            } else {
                int i2 = R.string.RevokeLinkAlert;
                builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", i2, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(tLRPC$Chat), tLRPC$Chat.title)));
            }
        } else if (this.parentIsChannel) {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlertChannel", R.string.RevokeLinksAlertChannel, new Object[0])));
        } else {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlert", R.string.RevokeLinksAlert, new Object[0])));
        }
        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString("RevokeButton", R.string.RevokeButton), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i3) {
                LimitReachedBottomSheet.this.lambda$revokeLinks$9(arrayList, dialogInterface, i3);
            }
        });
        AlertDialog create = builder.create();
        create.show();
        TextView textView = (TextView) create.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(Theme.key_text_RedBold, this.resourcesProvider));
        }
    }

    public void lambda$revokeLinks$9(ArrayList arrayList, DialogInterface dialogInterface, int i) {
        dismiss();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TLRPC$TL_channels_updateUsername tLRPC$TL_channels_updateUsername = new TLRPC$TL_channels_updateUsername();
            tLRPC$TL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC$Chat) arrayList.get(i2));
            tLRPC$TL_channels_updateUsername.username = "";
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_channels_updateUsername, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    LimitReachedBottomSheet.this.lambda$revokeLinks$8(tLObject, tLRPC$TL_error);
                }
            }, 64);
        }
    }

    public void lambda$revokeLinks$8(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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
                LimitReachedBottomSheet.this.lambda$loadInactiveChannels$11(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadInactiveChannels$11(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        String formatPluralString;
        if (tLRPC$TL_error == null) {
            final TLRPC$TL_messages_inactiveChats tLRPC$TL_messages_inactiveChats = (TLRPC$TL_messages_inactiveChats) tLObject;
            final ArrayList arrayList = new ArrayList();
            for (int i = 0; i < tLRPC$TL_messages_inactiveChats.chats.size(); i++) {
                TLRPC$Chat tLRPC$Chat = tLRPC$TL_messages_inactiveChats.chats.get(i);
                int currentTime = (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - tLRPC$TL_messages_inactiveChats.dates.get(i).intValue()) / 86400;
                if (currentTime < 30) {
                    formatPluralString = LocaleController.formatPluralString("Days", currentTime, new Object[0]);
                } else if (currentTime < 365) {
                    formatPluralString = LocaleController.formatPluralString("Months", currentTime / 30, new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("Years", currentTime / 365, new Object[0]);
                }
                if (ChatObject.isMegagroup(tLRPC$Chat)) {
                    arrayList.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", tLRPC$Chat.participants_count, new Object[0]), formatPluralString));
                } else if (ChatObject.isChannel(tLRPC$Chat)) {
                    arrayList.add(LocaleController.formatString("InactiveChannelSignature", R.string.InactiveChannelSignature, formatPluralString));
                } else {
                    arrayList.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", tLRPC$Chat.participants_count, new Object[0]), formatPluralString));
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LimitReachedBottomSheet.this.lambda$loadInactiveChannels$10(arrayList, tLRPC$TL_messages_inactiveChats);
                }
            });
        }
    }

    public void lambda$loadInactiveChannels$10(ArrayList arrayList, TLRPC$TL_messages_inactiveChats tLRPC$TL_messages_inactiveChats) {
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
        if (this.limitParams == null) {
            this.limitParams = getLimitParams(this.type, this.currentAccount);
        }
        int max = Math.max(this.inactiveChats.size(), this.limitParams.defaultLimit);
        LimitPreviewView limitPreviewView = this.limitPreviewView;
        if (limitPreviewView != null) {
            limitPreviewView.setIconValue(max);
            this.limitPreviewView.setBagePosition(max / this.limitParams.premiumLimit);
            this.limitPreviewView.startDelayedAnimation();
        }
    }
}
