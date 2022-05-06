package org.telegram.ui.Components.Premium;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
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
import org.telegram.tgnet.TLRPC$TL_boolTrue;
import org.telegram.tgnet.TLRPC$TL_channels_getAdminedPublicChannels;
import org.telegram.tgnet.TLRPC$TL_channels_getInactiveChannels;
import org.telegram.tgnet.TLRPC$TL_channels_updateUsername;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messages_chats;
import org.telegram.tgnet.TLRPC$TL_messages_inactiveChats;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.AlertDialog;
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

public class LimitReachedBottomSheet extends BottomSheetWithRecyclerListView {
    RecyclerItemsEnterAnimator enterAnimator;
    public Runnable onSuccessRunnable;
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
    HashSet<TLRPC$Chat> selectedChats = new HashSet<>();
    private ArrayList<TLRPC$Chat> inactiveChats = new ArrayList<>();
    private ArrayList<String> inactiveChatsSignatures = new ArrayList<>();
    private boolean loading = false;

    private static boolean hasFixedSize(int i) {
        return i == 0 || i == 3 || i == 4;
    }

    public LimitReachedBottomSheet(Context context, int i, int i2) {
        super(context, false, hasFixedSize(i));
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
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString("IncreaseLimit", R.string.IncreaseLimit)).append((CharSequence) " d");
        spannableStringBuilder.setSpan(new ColoredImageSpan(ContextCompat.getDrawable(context, R.drawable.msg_limit_2x)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        this.premiumButtonView.buttonTextView.setText(spannableStringBuilder);
        frameLayout.addView(this.premiumButtonView, LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
        View view = new View(context);
        view.setBackgroundColor(Theme.getColor("divider"));
        frameLayout.addView(view, LayoutHelper.createFrame(-1, 1.0f, 80, 0.0f, 0.0f, 0.0f, 72.0f));
        view.getLayoutParams().height = 1;
        this.recyclerListView.setPadding(0, 0, 0, AndroidUtilities.dp(72.0f));
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view2, int i) {
                LimitReachedBottomSheet.this.lambda$onViewCreated$0(view2, i);
            }
        });
        this.premiumButtonView.buttonTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                LimitReachedBottomSheet.this.lambda$onViewCreated$1(view2);
            }
        });
        this.premiumButtonView.overlayTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                LimitReachedBottomSheet.this.lambda$onViewCreated$2(view2);
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

    public void lambda$onViewCreated$1(View view) {
        dismiss();
    }

    public void lambda$onViewCreated$2(View view) {
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
        builder.setTitle(LocaleController.formatPluralString("LeaveCommunities", arrayList.size()));
        if (arrayList.size() == 1) {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("ChannelLeaveAlertWithName", R.string.ChannelLeaveAlertWithName, ((TLRPC$Chat) arrayList.get(0)).title)));
        } else {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("ChatsLeaveAlert", R.string.ChatsLeaveAlert, new Object[0])));
        }
        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString("RevokeButton", R.string.RevokeButton), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                LimitReachedBottomSheet.this.lambda$leaveFromSelectedGroups$3(arrayList, user, dialogInterface, i);
            }
        });
        AlertDialog create = builder.create();
        create.show();
        TextView textView = (TextView) create.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor("dialogTextRed2"));
        }
    }

    public void lambda$leaveFromSelectedGroups$3(ArrayList arrayList, TLRPC$User tLRPC$User, DialogInterface dialogInterface, int i) {
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
                str = LocaleController.formatPluralString("RevokeLinks", this.selectedChats.size());
            } else if (i == 5) {
                str = LocaleController.formatPluralString("LeaveCommunities", this.selectedChats.size());
            }
            this.premiumButtonView.setOverlayText(str);
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
                    headerView = new AdminedChannelCell(context, null, true, 9);
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
                    adminedChannelCell.setChannel(tLRPC$Chat2, i == getItemCount() - 1);
                    boolean contains = LimitReachedBottomSheet.this.selectedChats.contains(tLRPC$Chat2);
                    if (currentChannel == tLRPC$Chat2) {
                        z = true;
                    }
                    adminedChannelCell.setChecked(contains, z);
                } else if (viewHolder.getItemViewType() == 3) {
                    ((HeaderCell) viewHolder.itemView).setText(LocaleController.getString("YourPublicCommunities", R.string.YourPublicCommunities));
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

    public class HeaderView extends LinearLayout {
        public HeaderView(LimitReachedBottomSheet limitReachedBottomSheet, Context context) {
            super(context);
            int i;
            String str;
            int i2;
            setOrientation(1);
            int i3 = limitReachedBottomSheet.type;
            if (i3 == 0) {
                i2 = MessagesController.getInstance(((BottomSheet) limitReachedBottomSheet).currentAccount).dialogFiltersPinnedLimitDefault;
                i = R.drawable.msg_limit_pin;
                str = LocaleController.formatString("LimitReachedPinDialogs", R.string.LimitReachedPinDialogs, Integer.valueOf(i2), Integer.valueOf(MessagesController.getInstance(((BottomSheet) limitReachedBottomSheet).currentAccount).dialogFiltersPinnedLimitPremium));
            } else if (i3 == 2) {
                i2 = MessagesController.getInstance(((BottomSheet) limitReachedBottomSheet).currentAccount).channelsLimitDefault;
                i = R.drawable.msg_limit_links;
                str = LocaleController.formatString("LimitReachedPublicLinks", R.string.LimitReachedPublicLinks, Integer.valueOf(i2), Integer.valueOf(MessagesController.getInstance(((BottomSheet) limitReachedBottomSheet).currentAccount).channelsLimitPremium));
            } else if (i3 == 3) {
                i2 = MessagesController.getInstance(((BottomSheet) limitReachedBottomSheet).currentAccount).dialogFiltersLimitDefault;
                i = R.drawable.msg_limit_folder;
                str = LocaleController.formatString("LimitReachedFolders", R.string.LimitReachedFolders, Integer.valueOf(i2), Integer.valueOf(MessagesController.getInstance(((BottomSheet) limitReachedBottomSheet).currentAccount).dialogFiltersLimitPremium));
            } else if (i3 == 4) {
                i2 = MessagesController.getInstance(((BottomSheet) limitReachedBottomSheet).currentAccount).dialogFiltersChatsLimitDefault;
                i = R.drawable.msg_limit_chats;
                str = LocaleController.formatString("LimitReachedChatInFolders", R.string.LimitReachedChatInFolders, Integer.valueOf(i2), Integer.valueOf(MessagesController.getInstance(((BottomSheet) limitReachedBottomSheet).currentAccount).dialogFiltersChatsLimitPremium));
            } else if (i3 == 5) {
                i2 = MessagesController.getInstance(((BottomSheet) limitReachedBottomSheet).currentAccount).channelsLimitDefault;
                i = R.drawable.msg_limit_groups;
                str = LocaleController.formatString("LimitReachedCommunities", R.string.LimitReachedCommunities, Integer.valueOf(i2), Integer.valueOf(MessagesController.getInstance(((BottomSheet) limitReachedBottomSheet).currentAccount).channelsLimitPremium));
            } else {
                str = null;
                i2 = 0;
                i = 0;
            }
            TextView textView = new TextView(this, context, limitReachedBottomSheet) {
                Paint paint = new Paint(1);

                @Override
                protected void onMeasure(int i4, int i5) {
                    super.onMeasure(i4, i5);
                    LinearGradient linearGradient = new LinearGradient((-getMeasuredWidth()) / 2, 0.0f, getMeasuredWidth(), 0.0f, new int[]{-9015575, -1026983, -1792170}, (float[]) null, Shader.TileMode.CLAMP);
                    Matrix matrix = new Matrix();
                    matrix.postTranslate(getMeasuredWidth() / 4.0f, 0.0f);
                    linearGradient.setLocalMatrix(matrix);
                    this.paint.setShader(linearGradient);
                }

                @Override
                protected void onDraw(Canvas canvas) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, this.paint);
                    super.onDraw(canvas);
                }
            };
            textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "d ").setSpan(new ColoredImageSpan(i), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) Integer.toString(i2));
            textView.setText(spannableStringBuilder);
            textView.setTextSize(1, 22.0f);
            textView.setTextColor(-1);
            textView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
            addView(textView, LayoutHelper.createLinear(-2, -2, 0.0f, 17, 0, 16, 0, 0));
            TextView textView2 = new TextView(context);
            textView2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            textView2.setText(LocaleController.getString("LimitReached", R.string.LimitReached));
            textView2.setTextSize(1, 20.0f);
            textView2.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 0, 22, 0, 18));
            TextView textView3 = new TextView(context);
            textView3.setText(AndroidUtilities.replaceTags(str));
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(1);
            textView3.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText"));
            addView(textView3, LayoutHelper.createLinear(-2, -2, 0, 24, 0, 24, 24));
        }
    }

    private void loadAdminedChannels() {
        this.loading = true;
        updateRows();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC$TL_channels_getAdminedPublicChannels(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                LimitReachedBottomSheet.this.lambda$loadAdminedChannels$5(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadAdminedChannels$5(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LimitReachedBottomSheet.this.lambda$loadAdminedChannels$4(tLObject);
            }
        });
    }

    public void lambda$loadAdminedChannels$4(TLObject tLObject) {
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
        final ArrayList arrayList = new ArrayList(this.selectedChats);
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle(LocaleController.formatPluralString("RevokeLinks", arrayList.size()));
        if (arrayList.size() == 1) {
            TLRPC$Chat tLRPC$Chat = (TLRPC$Chat) arrayList.get(0);
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
                LimitReachedBottomSheet.this.lambda$revokeSelectedLinks$7(arrayList, dialogInterface, i);
            }
        });
        AlertDialog create = builder.create();
        create.show();
        TextView textView = (TextView) create.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor("dialogTextRed2"));
        }
    }

    public void lambda$revokeSelectedLinks$7(ArrayList arrayList, DialogInterface dialogInterface, int i) {
        dismiss();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TLRPC$TL_channels_updateUsername tLRPC$TL_channels_updateUsername = new TLRPC$TL_channels_updateUsername();
            tLRPC$TL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC$Chat) arrayList.get(i2));
            tLRPC$TL_channels_updateUsername.username = "";
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_channels_updateUsername, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    LimitReachedBottomSheet.this.lambda$revokeSelectedLinks$6(tLObject, tLRPC$TL_error);
                }
            }, 64);
        }
    }

    public void lambda$revokeSelectedLinks$6(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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
                LimitReachedBottomSheet.this.lambda$loadInactiveChannels$9(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadInactiveChannels$9(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        String str;
        if (tLRPC$TL_error == null) {
            final TLRPC$TL_messages_inactiveChats tLRPC$TL_messages_inactiveChats = (TLRPC$TL_messages_inactiveChats) tLObject;
            final ArrayList arrayList = new ArrayList();
            for (int i = 0; i < tLRPC$TL_messages_inactiveChats.chats.size(); i++) {
                TLRPC$Chat tLRPC$Chat = tLRPC$TL_messages_inactiveChats.chats.get(i);
                int currentTime = (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - tLRPC$TL_messages_inactiveChats.dates.get(i).intValue()) / 86400;
                if (currentTime < 30) {
                    str = LocaleController.formatPluralString("Days", currentTime);
                } else if (currentTime < 365) {
                    str = LocaleController.formatPluralString("Months", currentTime / 30);
                } else {
                    str = LocaleController.formatPluralString("Years", currentTime / 365);
                }
                if (ChatObject.isMegagroup(tLRPC$Chat)) {
                    arrayList.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", tLRPC$Chat.participants_count), str));
                } else if (ChatObject.isChannel(tLRPC$Chat)) {
                    arrayList.add(LocaleController.formatString("InactiveChannelSignature", R.string.InactiveChannelSignature, str));
                } else {
                    arrayList.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", tLRPC$Chat.participants_count), str));
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LimitReachedBottomSheet.this.lambda$loadInactiveChannels$8(arrayList, tLRPC$TL_messages_inactiveChats);
                }
            }, 4000L);
        }
    }

    public void lambda$loadInactiveChannels$8(ArrayList arrayList, TLRPC$TL_messages_inactiveChats tLRPC$TL_messages_inactiveChats) {
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
    }
}
