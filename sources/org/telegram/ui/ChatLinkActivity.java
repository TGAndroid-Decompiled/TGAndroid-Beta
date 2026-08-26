package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_language_id_common.zzil;
import com.google.android.gms.internal.mlkit_vision_common.zzku;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController$$ExternalSyntheticOutline1;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.ManageChatTextCell;
import org.telegram.ui.Cells.ManageChatUserCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.EmptyTextProgressView;
import org.telegram.ui.Components.JoinToSendSettingsView;
import org.telegram.ui.Components.JoinToSendSettingsView$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.JoinToSendSettingsView$$ExternalSyntheticLambda5;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LoadingStickerDrawable;
import org.telegram.ui.Components.RecyclerListView;

public final class ChatLinkActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public int chatEndRow;
    public int chatStartRow;
    public ArrayList chats;
    public boolean chatsLoaded;
    public int createChatRow;
    public TLRPC.Chat currentChat;
    public long currentChatId;
    public int detailRow;
    public EmptyTextProgressView emptyView;
    public TLRPC.ChatFull info;
    public final boolean isChannel;
    public boolean joinRequestProgress;
    public int joinToSendInfoRow;
    public boolean joinToSendProgress;
    public int joinToSendRow;
    public ListAdapter.AnonymousClass1 joinToSendSettings;
    public RecyclerListView listView;
    public ListAdapter listViewAdapter;
    public boolean loadingChats;
    public int removeChatRow;
    public int rowCount;
    public SearchAdapter searchAdapter;
    public ActionBarMenuItem searchItem;
    public boolean searching;
    public TLRPC.Chat waitingForFullChat;
    public AlertDialog waitingForFullChatProgressAlert;

    public final class EmptyView extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
        public final int currentAccount;
        public final LoadingStickerDrawable drawable;
        public final BackupImageView stickerView;

        public EmptyView(Context context) {
            super(context);
            this.currentAccount = UserConfig.selectedAccount;
            setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
            setOrientation(1);
            BackupImageView backupImageView = new BackupImageView(context);
            this.stickerView = backupImageView;
            LoadingStickerDrawable loadingStickerDrawable = new LoadingStickerDrawable(backupImageView, "M476.1,397.4c25.8-47.2,0.3-105.9-50.9-120c-2.5-6.9-7.8-12.7-15-16.4l0.4-229.4c0-12.3-10-22.4-22.4-22.4H128.5c-12.3,0-22.4,10-22.4,22.4l-0.4,229.8v0c0,6.7,2.9,12.6,7.6,16.7c-51.6,15.9-79.2,77.2-48.1,116.4c-8.7,11.7-13.4,27.5-14,47.2c-1.7,34.5,21.6,45.8,55.9,45.8c52.3,0,99.1,4.6,105.1-36.2c16.5,0.9,7.1-37.3-6.5-53.3c18.4-22.4,18.3-52.9,4.9-78.2c-0.7-5.3-3.8-9.8-8.1-12.6c-1.5-2-1.6-2-2.1-2.7c0.2-1,1.2-11.8-3.4-20.9h138.5c-4.8,8.8-4.7,17-2.9,22.1c-5.3,4.8-6.8,12.3-5.2,17c-11.4,24.9-10,53.8,4.3,77.5c-6.8,9.7-11.2,21.7-12.6,31.6c-0.2-0.2-0.4-0.3-0.6-0.5c0.8-3.3,0.4-6.4-1.3-7.8c9.3-12.1-4.5-29.2-17-21.7c-3.8-2.8-10.6-3.2-18.1-0.5c-2.4-10.6-21.1-10.6-28.6-1c-1.3,0.3-2.9,0.8-4.5,1.9c-5.2-0.9-10.9,0.1-14.1,4.4c-6.9,3-9.5,10.4-7.8,17c-0.9,1.8-1.1,4-0.8,6.3c-1.6,1.2-2.3,3.1-2,4.9c0.1,0.6,10.4,56.6,11.2,62c0.3,1.8,1.5,3.2,3.1,3.9c8.7,3.4,12,3.8,30.1,9.4c2.7,0.8,2.4,0.8,6.7-0.1c16.4-3.5,30.2-8.9,30.8-9.2c1.6-0.6,2.7-2,3.1-3.7c0.1-0.4,6.8-36.5,10-53.2c0.9,4.2,3.3,7.3,7.4,7.5c1.2,7.8,4.4,14.5,9.5,19.9c16.4,17.3,44.9,15.7,64.9,16.1c38.3,0.8,74.5,1.5,84.4-24.4C488.9,453.5,491.3,421.3,476.1,397.4z", AndroidUtilities.dp(104.0f), AndroidUtilities.dp(104.0f));
            this.drawable = loadingStickerDrawable;
            backupImageView.setImageDrawable(loadingStickerDrawable);
            addView(backupImageView, LayoutHelper.createLinear(104, 104, 49, 0, 2, 0, 0));
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.diceStickersDidLoad && "tg_placeholders_android".equals((String) objArr[0])) {
                setSticker$2();
            }
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            setSticker$2();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.diceStickersDidLoad);
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        }

        public final void setSticker$2() {
            int i = this.currentAccount;
            TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i).getStickerSetByName("tg_placeholders_android");
            if (stickerSetByName == null) {
                stickerSetByName = MediaDataController.getInstance(i).getStickerSetByEmojiOrName("tg_placeholders_android");
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
            BackupImageView backupImageView = this.stickerView;
            if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() >= 3) {
                backupImageView.setImage(ImageLocation.getForDocument(tL_messages_stickerSet.documents.get(2)), "104_104", null, null, this.drawable, "tgs", 0, tL_messages_stickerSet);
            } else {
                MediaDataController.getInstance(i).loadStickersByEmojiOrName("tg_placeholders_android", false, tL_messages_stickerSet == null);
                backupImageView.setImageDrawable(this.drawable);
            }
        }
    }

    public final class HintInnerCell extends FrameLayout {
        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }
    }

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;

        public final class AnonymousClass1 extends JoinToSendSettingsView {
            public final TLRPC.Chat val$chat;

            public AnonymousClass1(Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
                super(context, chat);
                this.val$chat = chat2;
            }

            public final void migrateIfNeeded(ChatLinkActivity$$ExternalSyntheticLambda9 chatLinkActivity$$ExternalSyntheticLambda9, Runnable runnable) {
                ChatLinkActivity chatLinkActivity = ChatLinkActivity.this;
                if (ChatObject.isChannel(chatLinkActivity.currentChat)) {
                    runnable.run();
                } else {
                    chatLinkActivity.getMessagesController().convertToMegaGroup(chatLinkActivity.getParentActivity(), this.val$chat.id, chatLinkActivity, new ChatActivity$$ExternalSyntheticLambda189(9, this, runnable), chatLinkActivity$$ExternalSyntheticLambda9);
                }
            }

            @Override
            public final boolean onJoinRequestToggle(JoinToSendSettingsView$$ExternalSyntheticLambda4 joinToSendSettingsView$$ExternalSyntheticLambda4, boolean z) {
                ChatLinkActivity chatLinkActivity = ChatLinkActivity.this;
                if (chatLinkActivity.joinRequestProgress) {
                    return false;
                }
                chatLinkActivity.joinRequestProgress = true;
                migrateIfNeeded(new ChatLinkActivity$$ExternalSyntheticLambda9(10, this, joinToSendSettingsView$$ExternalSyntheticLambda4), new QrActivity$$ExternalSyntheticLambda15(this, this.val$chat, z, joinToSendSettingsView$$ExternalSyntheticLambda4, 9));
                return true;
            }

            @Override
            public final boolean onJoinToSendToggle(JoinToSendSettingsView$$ExternalSyntheticLambda5 joinToSendSettingsView$$ExternalSyntheticLambda5, boolean z) {
                ChatLinkActivity chatLinkActivity = ChatLinkActivity.this;
                if (chatLinkActivity.joinToSendProgress) {
                    return false;
                }
                chatLinkActivity.joinToSendProgress = true;
                migrateIfNeeded(new ChatLinkActivity$$ExternalSyntheticLambda9(10, this, joinToSendSettingsView$$ExternalSyntheticLambda5), new QrActivity$$ExternalSyntheticLambda15(this, this.val$chat, z, joinToSendSettingsView$$ExternalSyntheticLambda5, 8));
                return true;
            }
        }

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            ChatLinkActivity chatLinkActivity = ChatLinkActivity.this;
            if (!chatLinkActivity.loadingChats || chatLinkActivity.chatsLoaded) {
                return chatLinkActivity.rowCount;
            }
            return 0;
        }

        @Override
        public final int getItemViewType(int i) {
            ChatLinkActivity chatLinkActivity = ChatLinkActivity.this;
            chatLinkActivity.getClass();
            if (i == 0) {
                return 3;
            }
            if (i == chatLinkActivity.createChatRow || i == chatLinkActivity.removeChatRow) {
                return 2;
            }
            if (i < chatLinkActivity.chatStartRow || i >= chatLinkActivity.chatEndRow) {
                return i == chatLinkActivity.joinToSendRow ? 4 : 1;
            }
            return 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mItemViewType;
            return i == 0 || i == 2;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2 = viewHolder.mItemViewType;
            ChatLinkActivity chatLinkActivity = ChatLinkActivity.this;
            View view = viewHolder.itemView;
            if (i2 == 0) {
                ManageChatUserCell manageChatUserCell = (ManageChatUserCell) view;
                manageChatUserCell.setTag(Integer.valueOf(i));
                TLRPC.Chat chat = (TLRPC.Chat) chatLinkActivity.chats.get(i - chatLinkActivity.chatStartRow);
                String publicUsername = ChatObject.getPublicUsername(chat);
                manageChatUserCell.setData(chat, null, TextUtils.isEmpty(publicUsername) ? null : zzil.m("@", publicUsername), (i == chatLinkActivity.chatEndRow - 1 && chatLinkActivity.info.linked_chat_id == 0) ? false : true);
                return;
            }
            boolean z = chatLinkActivity.isChannel;
            if (i2 == 1) {
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                if (i == chatLinkActivity.joinToSendInfoRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.ChannelSettingsJoinRequestInfo));
                    return;
                } else {
                    if (i == chatLinkActivity.detailRow) {
                        if (z) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.DiscussionChannelHelp2));
                            return;
                        } else {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.DiscussionGroupHelp2));
                            return;
                        }
                    }
                    return;
                }
            }
            if (i2 != 2) {
                return;
            }
            ManageChatTextCell manageChatTextCell = (ManageChatTextCell) view;
            if (!z) {
                int i3 = Theme.key_text_RedRegular;
                manageChatTextCell.setColors(i3, i3);
                manageChatTextCell.setText(LocaleController.getString(R.string.DiscussionUnlinkChannel), R.drawable.msg_remove, 5, false);
            } else if (chatLinkActivity.info.linked_chat_id == 0) {
                manageChatTextCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                manageChatTextCell.setText(LocaleController.getString(R.string.DiscussionCreateGroup), R.drawable.msg_groups, 5, true);
            } else {
                int i4 = Theme.key_text_RedRegular;
                manageChatTextCell.setColors(i4, i4);
                manageChatTextCell.setText(LocaleController.getString(R.string.DiscussionUnlinkGroup), R.drawable.msg_remove, 5, false);
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View manageChatUserCell;
            if (i != 0) {
                Context context = this.mContext;
                if (i == 1) {
                    manageChatUserCell = new TextInfoPrivacyCell(context, 24, null);
                } else if (i != 2) {
                    ChatLinkActivity chatLinkActivity = ChatLinkActivity.this;
                    boolean z = chatLinkActivity.isChannel;
                    if (i != 4) {
                        HintInnerCell hintInnerCell = new HintInnerCell(context);
                        hintInnerCell.addView(new EmptyView(context), LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                        TextView textView = new TextView(context);
                        textView.setTextColor(Theme.getColor(null, Theme.key_chats_message, false));
                        textView.setTextSize(1, 14.0f);
                        textView.setGravity(17);
                        if (z) {
                            TLRPC.ChatFull chatFull = chatLinkActivity.info;
                            if (chatFull == null || chatFull.linked_chat_id == 0) {
                                textView.setText(LocaleController.getString(R.string.DiscussionChannelHelp3));
                            } else {
                                TLRPC.Chat chat = chatLinkActivity.getMessagesController().getChat(Long.valueOf(chatLinkActivity.info.linked_chat_id));
                                if (chat != null) {
                                    textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("DiscussionChannelGroupSetHelp2", R.string.DiscussionChannelGroupSetHelp2, chat.title)));
                                }
                            }
                        } else {
                            TLRPC.Chat chat2 = chatLinkActivity.getMessagesController().getChat(Long.valueOf(chatLinkActivity.info.linked_chat_id));
                            if (chat2 != null) {
                                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("DiscussionGroupHelp", R.string.DiscussionGroupHelp, chat2.title)));
                            }
                        }
                        hintInnerCell.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                        hintInnerCell.setTag(-33024);
                        manageChatUserCell = hintInnerCell;
                    } else {
                        TLRPC.Chat chat3 = z ? (TLRPC.Chat) chatLinkActivity.chats.get(0) : chatLinkActivity.currentChat;
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, chat3, chat3);
                        chatLinkActivity.joinToSendSettings = anonymousClass1;
                        manageChatUserCell = anonymousClass1;
                    }
                } else {
                    manageChatUserCell = new ManageChatTextCell(context);
                }
            } else {
                manageChatUserCell = new ManageChatUserCell(this.mContext, 6, 2, false, null);
            }
            return new RecyclerListView.Holder(manageChatUserCell);
        }

        @Override
        public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ManageChatUserCell) {
                ((ManageChatUserCell) view).avatarImageView.getImageReceiver().cancelLoadImage();
            }
        }
    }

    public final class SearchAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;
        public ArrayList searchResult = new ArrayList();
        public ArrayList searchResultNames = new ArrayList();
        public ChatLinkActivity$SearchAdapter$$ExternalSyntheticLambda0 searchRunnable;

        public SearchAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            return this.searchResult.size();
        }

        @Override
        public final int getItemViewType(int i) {
            return 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.mItemViewType != 1;
        }

        @Override
        public final void notifyDataSetChanged() {
            this.mObservable.notifyChanged();
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLRPC.Chat chat = (TLRPC.Chat) this.searchResult.get(i);
            String publicUsername = ChatObject.getPublicUsername(chat);
            CharSequence charSequence = (CharSequence) this.searchResultNames.get(i);
            CharSequence charSequence2 = null;
            if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
                if (charSequence.toString().startsWith("@" + publicUsername)) {
                    charSequence2 = charSequence;
                    charSequence = null;
                }
            }
            ManageChatUserCell manageChatUserCell = (ManageChatUserCell) viewHolder.itemView;
            manageChatUserCell.setTag(Integer.valueOf(i));
            manageChatUserCell.setData(chat, charSequence, charSequence2, false);
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            ManageChatUserCell manageChatUserCell = new ManageChatUserCell(this.mContext, 6, 2, false, null);
            manageChatUserCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            return new RecyclerListView.Holder(manageChatUserCell);
        }

        @Override
        public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ManageChatUserCell) {
                ((ManageChatUserCell) view).avatarImageView.getImageReceiver().cancelLoadImage();
            }
        }

        public final void searchDialogs(String str) {
            if (this.searchRunnable != null) {
                Utilities.searchQueue.cancelRunnable(this.searchRunnable);
                this.searchRunnable = null;
            }
            if (TextUtils.isEmpty(str)) {
                this.searchResult.clear();
                this.searchResultNames.clear();
                this.mObservable.notifyChanged();
            } else {
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                ChatLinkActivity$SearchAdapter$$ExternalSyntheticLambda0 chatLinkActivity$SearchAdapter$$ExternalSyntheticLambda0 = new ChatLinkActivity$SearchAdapter$$ExternalSyntheticLambda0(this, str, 0);
                this.searchRunnable = chatLinkActivity$SearchAdapter$$ExternalSyntheticLambda0;
                dispatchQueue.postRunnable(chatLinkActivity$SearchAdapter$$ExternalSyntheticLambda0, 300L);
            }
        }
    }

    public ChatLinkActivity(long j) {
        super(null);
        this.chats = new ArrayList();
        boolean z = false;
        this.joinToSendProgress = false;
        this.joinRequestProgress = false;
        this.currentChatId = j;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j));
        this.currentChat = chat;
        if (ChatObject.isChannel(chat) && !this.currentChat.megagroup) {
            z = true;
        }
        this.isChannel = z;
    }

    @Override
    public final View createView(Context context) {
        this.searching = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Discussion));
        this.actionBar.setActionBarMenuOnItemClick(new CallLogActivity.AnonymousClass1(this, 23));
        ActionBarMenuItem actionBarMenuItemAddItem = this.actionBar.createMenu().addItem(0, R.drawable.outline_header_search);
        actionBarMenuItemAddItem.setIsSearchField$1();
        actionBarMenuItemAddItem.listener = new TopicsFragment.AnonymousClass3(this, 3);
        this.searchItem = actionBarMenuItemAddItem;
        actionBarMenuItemAddItem.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.searchAdapter = new SearchAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i = Theme.key_windowBackgroundGray;
        frameLayout.setBackgroundColor(Theme.getColor(null, i, false));
        this.fragmentView.setTag(Integer.valueOf(i));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context, null);
        this.emptyView = emptyTextProgressView;
        emptyTextProgressView.showProgress();
        this.emptyView.setText(LocaleController.getString(R.string.NoResult));
        frameLayout2.addView(this.emptyView, LayoutHelper.createFrame(-1.0f, -1));
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.listView.setEmptyView(this.emptyView);
        zzku.m(this.listView);
        RecyclerListView recyclerListView2 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.listViewAdapter = listAdapter;
        recyclerListView2.setAdapter(listAdapter);
        this.listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setOnItemClickListener(new ChatLinkActivity$$ExternalSyntheticLambda4(this, 0));
        updateRows$3();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ListAdapter.AnonymousClass1 anonymousClass1;
        TLRPC.Chat chat;
        TLRPC.Chat chat2 = null;
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j = chatFull.id;
            if (j == this.currentChatId) {
                this.info = chatFull;
                loadChats();
                updateRows$3();
                return;
            }
            TLRPC.Chat chat3 = this.waitingForFullChat;
            if (chat3 == null || chat3.id != j) {
                return;
            }
            try {
                this.waitingForFullChatProgressAlert.dismiss();
            } catch (Throwable unused) {
            }
            this.waitingForFullChatProgressAlert = null;
            showLinkAlert(this.waitingForFullChat, false);
            this.waitingForFullChat = null;
            return;
        }
        if (i != NotificationCenter.updateInterfaces) {
            if (i == NotificationCenter.dialogDeleted) {
                if ((-this.currentChatId) == ((Long) objArr[0]).longValue()) {
                    INavigationLayout iNavigationLayout = this.parentLayout;
                    if (iNavigationLayout == null || ((ActionBarLayout) iNavigationLayout).getLastFragment() != this) {
                        removeSelfFromStack();
                        return;
                    } else {
                        finishFragment();
                        return;
                    }
                }
                return;
            }
            return;
        }
        if ((((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_CHAT) == 0 || this.currentChat == null) {
            return;
        }
        TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(this.currentChat.id));
        if (chat4 != null) {
            this.currentChat = chat4;
        }
        if (this.chats.size() > 0 && (chat = getMessagesController().getChat(Long.valueOf(((TLRPC.Chat) this.chats.get(0)).id))) != null) {
            this.chats.set(0, chat);
        }
        if (!this.isChannel) {
            chat2 = this.currentChat;
        } else if (this.chats.size() > 0) {
            chat2 = (TLRPC.Chat) this.chats.get(0);
        }
        if (chat2 == null || (anonymousClass1 = this.joinToSendSettings) == null) {
            return;
        }
        if (!this.joinRequestProgress) {
            anonymousClass1.setJoinRequest(chat2.join_request);
        }
        if (this.joinToSendProgress) {
            return;
        }
        this.joinToSendSettings.setJoinToSend(chat2.join_to_send);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ChatActivity$$ExternalSyntheticLambda94 chatActivity$$ExternalSyntheticLambda94 = new ChatActivity$$ExternalSyntheticLambda94(this, 8);
        int i = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{ManageChatUserCell.class, ManageChatTextCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.fragmentView, 262145, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.fragmentView, 262145, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{TextInfoPrivacyCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"statusColor"}, null, null, -1, chatActivity$$ExternalSyntheticLambda94, Theme.key_windowBackgroundWhiteGrayText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"statusOnlineColor"}, null, null, -1, chatActivity$$ExternalSyntheticLambda94, Theme.key_windowBackgroundWhiteBlueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HintInnerCell.class}, new String[]{"messageTextView"}, null, null, -1, null, Theme.key_chats_message));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{ManageChatTextCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{ManageChatTextCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayIcon));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{ManageChatTextCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueButton));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{ManageChatTextCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueIcon));
        return arrayList;
    }

    public final void lambda$createView$1(AlertDialog[] alertDialogArr) {
        int i = 2;
        try {
            alertDialogArr[0].dismiss();
        } catch (Throwable unused) {
        }
        alertDialogArr[0] = null;
        this.info.linked_chat_id = 0L;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
        int i2 = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i2, this.info, 0, bool, bool);
        AndroidUtilities.runOnUIThread(new ChatLinkActivity$$ExternalSyntheticLambda0(this, i), 1000L);
        if (this.isChannel) {
            return;
        }
        finishFragment();
    }

    public final void lambda$createView$3(int i) {
        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(i, true);
    }

    public final void lambda$linkChat$12(AlertDialog[] alertDialogArr, TLRPC.Chat chat, GroupCreateFinalActivity groupCreateFinalActivity) {
        int i = 1;
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog != null) {
            try {
                alertDialog.dismiss();
            } catch (Throwable unused) {
            }
            alertDialogArr[0] = null;
        }
        this.info.linked_chat_id = chat.id;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
        int i2 = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i2, this.info, 0, bool, bool);
        AndroidUtilities.runOnUIThread(new ChatLinkActivity$$ExternalSyntheticLambda0(this, i), 1000L);
        if (groupCreateFinalActivity == null) {
            finishFragment();
        } else {
            removeSelfFromStack();
            groupCreateFinalActivity.finishFragment();
        }
    }

    public final void lambda$linkChat$14(int i) {
        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(i, true);
    }

    public final void linkChat(TLRPC.Chat chat, GroupCreateFinalActivity groupCreateFinalActivity) {
        int i = 0;
        if (chat == null) {
            return;
        }
        if (!ChatObject.isChannel(chat)) {
            getMessagesController().convertToMegaGroup(getParentActivity(), chat.id, this, new ChatActivity$$ExternalSyntheticLambda189(8, this, groupCreateFinalActivity));
            return;
        }
        AlertDialog[] alertDialogArr = {groupCreateFinalActivity == null ? new AlertDialog(getParentActivity(), 3, null) : null};
        TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(this.currentChat);
        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(chat);
        AndroidUtilities.runOnUIThread(new ChatLinkActivity$$ExternalSyntheticLambda8(this, alertDialogArr, getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new LoginActivity$$ExternalSyntheticLambda42(this, alertDialogArr, chat, groupCreateFinalActivity, 4), 64), i), 500L);
    }

    public final void loadChats() {
        if (this.info.linked_chat_id != 0) {
            this.chats.clear();
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.info.linked_chat_id));
            if (chat != null) {
                this.chats.add(chat);
            }
            ActionBarMenuItem actionBarMenuItem = this.searchItem;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setVisibility(8);
            }
        }
        if (!this.loadingChats && this.isChannel && this.info.linked_chat_id == 0) {
            this.loadingChats = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_channels_getGroupsForDiscussion(), new CallLogActivity$$ExternalSyntheticLambda1(this, 14));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        loadChats();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override
    public final void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listViewAdapter;
        if (listAdapter != null) {
            listAdapter.mObservable.notifyChanged();
        }
    }

    public final void showLinkAlert(TLRPC.Chat chat, boolean z) {
        String string;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(chat.id);
        int i = 0;
        if (chatFull == null) {
            if (z) {
                getMessagesController().loadFullChat(chat.id, 0, true);
                this.waitingForFullChat = chat;
                this.waitingForFullChatProgressAlert = new AlertDialog(getParentActivity(), 3, null);
                AndroidUtilities.runOnUIThread(new ChatLinkActivity$$ExternalSyntheticLambda0(this, i), 500L);
                return;
            }
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        TextView textView = new TextView(getParentActivity());
        textView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        if (ChatObject.isPublic(chat)) {
            string = !ChatObject.isPublic(this.currentChat) ? LocaleController.formatString("DiscussionLinkGroupPrivateAlert", R.string.DiscussionLinkGroupPrivateAlert, chat.title, this.currentChat.title) : LocaleController.formatString("DiscussionLinkGroupPublicAlert", R.string.DiscussionLinkGroupPublicAlert, chat.title, this.currentChat.title);
        } else {
            string = LocaleController.formatString("DiscussionLinkGroupPublicPrivateAlert", R.string.DiscussionLinkGroupPublicPrivateAlert, chat.title, this.currentChat.title);
        }
        if (chatFull.hidden_prehistory) {
            string = NotificationsController$$ExternalSyntheticOutline1.m(Log.m(string, "\n\n"), R.string.DiscussionLinkGroupAlertHistory);
        }
        textView.setText(AndroidUtilities.replaceTags(string));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        builder.setView(frameLayout);
        AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        avatarDrawable.namePaint.setTextSize(AndroidUtilities.dp(12.0f));
        BackupImageView backupImageView = new BackupImageView(getParentActivity());
        backupImageView.setRoundRadius(AndroidUtilities.dp(20.0f));
        frameLayout.addView(backupImageView, LayoutHelper.createFrame(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView2 = new TextView(getParentActivity());
        textView2.setTextColor(Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false));
        textView2.setTextSize(1, 20.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText(chat.title);
        boolean z2 = LocaleController.isRTL;
        frameLayout.addView(textView2, LayoutHelper.createFrame(-1, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 21 : 76, 11.0f, z2 ? 76 : 21, 0.0f));
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        avatarDrawable.setInfo(this.currentAccount, chat);
        backupImageView.imageReceiver.setForUserOrChat(chat, avatarDrawable);
        backupImageView.onNewImageSet();
        builder.setPositiveButton(LocaleController.getString(R.string.DiscussionLinkGroup), new ChatActivity$$ExternalSyntheticLambda248(this, chatFull, chat, 17));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        showDialog(builder.alertDialog);
    }

    public final void updateRows$3() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.currentChatId));
        this.currentChat = chat;
        if (chat == null) {
            return;
        }
        this.createChatRow = -1;
        this.chatStartRow = -1;
        this.chatEndRow = -1;
        this.removeChatRow = -1;
        this.detailRow = -1;
        this.joinToSendRow = -1;
        this.joinToSendInfoRow = -1;
        this.rowCount = 1;
        boolean z = this.isChannel;
        if (z) {
            if (this.info.linked_chat_id == 0) {
                this.rowCount = 2;
                this.createChatRow = 1;
            }
            int i = this.rowCount;
            this.chatStartRow = i;
            int size = this.chats.size() + i;
            this.rowCount = size;
            this.chatEndRow = size;
            if (this.info.linked_chat_id != 0) {
                this.rowCount = size + 1;
                this.createChatRow = size;
            }
        } else {
            this.chatStartRow = 1;
            int size2 = this.chats.size();
            int i2 = size2 + 1;
            this.chatEndRow = i2;
            this.rowCount = size2 + 2;
            this.createChatRow = i2;
        }
        int i3 = this.rowCount;
        this.rowCount = i3 + 1;
        this.detailRow = i3;
        if (!z || (this.chats.size() > 0 && this.info.linked_chat_id != 0)) {
            TLRPC.Chat chat2 = z ? (TLRPC.Chat) this.chats.get(0) : this.currentChat;
            if (chat2 != null && ((!ChatObject.isPublic(chat2) || z) && (chat2.creator || ((tL_chatAdminRights = chat2.admin_rights) != null && tL_chatAdminRights.ban_users)))) {
                int i4 = this.rowCount;
                this.rowCount = i4 + 1;
                this.joinToSendRow = i4;
            }
        }
        ListAdapter listAdapter = this.listViewAdapter;
        if (listAdapter != null) {
            listAdapter.mObservable.notifyChanged();
        }
        ActionBarMenuItem actionBarMenuItem = this.searchItem;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setVisibility(this.chats.size() <= 10 ? 8 : 0);
        }
    }
}
