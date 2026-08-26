package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_language_id_common.zzii;
import java.util.ArrayList;
import java.util.Iterator;
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
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
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
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LoadingStickerDrawable;
import org.telegram.ui.Components.RecyclerListView;

public class ChatLinkActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private static final int search_button = 0;
    private int chatEndRow;
    private int chatStartRow;
    private ArrayList<TLRPC.Chat> chats;
    private boolean chatsLoaded;
    private int createChatRow;
    private TLRPC.Chat currentChat;
    private long currentChatId;
    private int detailRow;
    private EmptyTextProgressView emptyView;
    private int helpRow;
    private TLRPC.ChatFull info;
    private boolean isChannel;
    private boolean joinRequestProgress;
    private int joinToSendInfoRow;
    private boolean joinToSendProgress;
    private int joinToSendRow;
    private JoinToSendSettingsView joinToSendSettings;
    private RecyclerListView listView;
    private ListAdapter listViewAdapter;
    private boolean loadingChats;
    private int removeChatRow;
    private int rowCount;
    private SearchAdapter searchAdapter;
    private ActionBarMenuItem searchItem;
    private boolean searchWas;
    private boolean searching;
    private boolean waitingForChatCreate;
    private TLRPC.Chat waitingForFullChat;
    private AlertDialog waitingForFullChatProgressAlert;

    public static class EmptyView extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
        private static final String stickerSetName = "tg_placeholders_android";
        private int currentAccount;
        private LoadingStickerDrawable drawable;
        private BackupImageView stickerView;

        public EmptyView(Context context) {
            super(context);
            this.currentAccount = UserConfig.selectedAccount;
            setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
            setOrientation(1);
            this.stickerView = new BackupImageView(context);
            LoadingStickerDrawable loadingStickerDrawable = new LoadingStickerDrawable(this.stickerView, "M476.1,397.4c25.8-47.2,0.3-105.9-50.9-120c-2.5-6.9-7.8-12.7-15-16.4l0.4-229.4c0-12.3-10-22.4-22.4-22.4H128.5c-12.3,0-22.4,10-22.4,22.4l-0.4,229.8v0c0,6.7,2.9,12.6,7.6,16.7c-51.6,15.9-79.2,77.2-48.1,116.4c-8.7,11.7-13.4,27.5-14,47.2c-1.7,34.5,21.6,45.8,55.9,45.8c52.3,0,99.1,4.6,105.1-36.2c16.5,0.9,7.1-37.3-6.5-53.3c18.4-22.4,18.3-52.9,4.9-78.2c-0.7-5.3-3.8-9.8-8.1-12.6c-1.5-2-1.6-2-2.1-2.7c0.2-1,1.2-11.8-3.4-20.9h138.5c-4.8,8.8-4.7,17-2.9,22.1c-5.3,4.8-6.8,12.3-5.2,17c-11.4,24.9-10,53.8,4.3,77.5c-6.8,9.7-11.2,21.7-12.6,31.6c-0.2-0.2-0.4-0.3-0.6-0.5c0.8-3.3,0.4-6.4-1.3-7.8c9.3-12.1-4.5-29.2-17-21.7c-3.8-2.8-10.6-3.2-18.1-0.5c-2.4-10.6-21.1-10.6-28.6-1c-1.3,0.3-2.9,0.8-4.5,1.9c-5.2-0.9-10.9,0.1-14.1,4.4c-6.9,3-9.5,10.4-7.8,17c-0.9,1.8-1.1,4-0.8,6.3c-1.6,1.2-2.3,3.1-2,4.9c0.1,0.6,10.4,56.6,11.2,62c0.3,1.8,1.5,3.2,3.1,3.9c8.7,3.4,12,3.8,30.1,9.4c2.7,0.8,2.4,0.8,6.7-0.1c16.4-3.5,30.2-8.9,30.8-9.2c1.6-0.6,2.7-2,3.1-3.7c0.1-0.4,6.8-36.5,10-53.2c0.9,4.2,3.3,7.3,7.4,7.5c1.2,7.8,4.4,14.5,9.5,19.9c16.4,17.3,44.9,15.7,64.9,16.1c38.3,0.8,74.5,1.5,84.4-24.4C488.9,453.5,491.3,421.3,476.1,397.4z", AndroidUtilities.dp(104.0f), AndroidUtilities.dp(104.0f));
            this.drawable = loadingStickerDrawable;
            this.stickerView.setImageDrawable(loadingStickerDrawable);
            addView(this.stickerView, LayoutHelper.createLinear(104, 104, 49, 0, 2, 0, 0));
        }

        private void setSticker() {
            TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(this.currentAccount).getStickerSetByName("tg_placeholders_android");
            if (stickerSetByName == null) {
                stickerSetByName = MediaDataController.getInstance(this.currentAccount).getStickerSetByEmojiOrName("tg_placeholders_android");
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
            if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() >= 3) {
                this.stickerView.setImage(ImageLocation.getForDocument(tL_messages_stickerSet.documents.get(2)), "104_104", "tgs", this.drawable, tL_messages_stickerSet);
            } else {
                MediaDataController.getInstance(this.currentAccount).loadStickersByEmojiOrName("tg_placeholders_android", false, tL_messages_stickerSet == null);
                this.stickerView.setImageDrawable(this.drawable);
            }
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.diceStickersDidLoad && "tg_placeholders_android".equals((String) objArr[0])) {
                setSticker();
            }
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            setSticker();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.diceStickersDidLoad);
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        }
    }

    public class HintInnerCell extends FrameLayout {
        private EmptyView emptyView;
        private TextView messageTextView;

        public HintInnerCell(Context context) {
            super(context);
            EmptyView emptyView = new EmptyView(context);
            this.emptyView = emptyView;
            addView(emptyView, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            this.messageTextView = textView;
            textView.setTextColor(Theme.getColor(null, Theme.key_chats_message, false));
            this.messageTextView.setTextSize(1, 14.0f);
            this.messageTextView.setGravity(17);
            if (!ChatLinkActivity.this.isChannel) {
                TLRPC.Chat chat = ChatLinkActivity.this.getMessagesController().getChat(Long.valueOf(ChatLinkActivity.this.info.linked_chat_id));
                if (chat != null) {
                    this.messageTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("DiscussionGroupHelp", R.string.DiscussionGroupHelp, chat.title)));
                }
            } else if (ChatLinkActivity.this.info == null || ChatLinkActivity.this.info.linked_chat_id == 0) {
                this.messageTextView.setText(LocaleController.getString(R.string.DiscussionChannelHelp3));
            } else {
                TLRPC.Chat chat2 = ChatLinkActivity.this.getMessagesController().getChat(Long.valueOf(ChatLinkActivity.this.info.linked_chat_id));
                if (chat2 != null) {
                    this.messageTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("DiscussionChannelGroupSetHelp2", R.string.DiscussionChannelGroupSetHelp2, chat2.title)));
                }
            }
            addView(this.messageTextView, LayoutHelper.createFrame(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public class AnonymousClass1 extends JoinToSendSettingsView {
            final TLRPC.Chat val$chat;

            public AnonymousClass1(Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
                super(context, chat);
                this.val$chat = chat2;
            }

            public void lambda$migrateIfNeeded$0(Runnable runnable, long j) {
                if (j != 0) {
                    if (ChatLinkActivity.this.isChannel) {
                        ChatLinkActivity.this.chats.set(0, ChatLinkActivity.this.getMessagesController().getChat(Long.valueOf(j)));
                    } else {
                        ChatLinkActivity.this.currentChatId = j;
                        ChatLinkActivity chatLinkActivity = ChatLinkActivity.this;
                        chatLinkActivity.currentChat = chatLinkActivity.getMessagesController().getChat(Long.valueOf(j));
                    }
                    runnable.run();
                }
            }

            public void lambda$onJoinRequestToggle$1() {
                ChatLinkActivity.this.joinRequestProgress = false;
            }

            public void lambda$onJoinRequestToggle$2(Runnable runnable) {
                ChatLinkActivity.this.joinRequestProgress = false;
                runnable.run();
            }

            public void lambda$onJoinRequestToggle$3(TLRPC.Chat chat, boolean z, Runnable runnable) {
                chat.join_request = z;
                ChatLinkActivity.this.getMessagesController().toggleChatJoinRequest(chat.id, z, new ChatLinkActivity$ListAdapter$1$$ExternalSyntheticLambda2(this, 1), new ChatLinkActivity$ListAdapter$1$$ExternalSyntheticLambda5(this, runnable, 0));
            }

            public void lambda$onJoinToSendToggle$5() {
                ChatLinkActivity.this.joinRequestProgress = false;
            }

            public void lambda$onJoinToSendToggle$6(TLRPC.Chat chat) {
                chat.join_request = true;
                this.isJoinRequest = true;
                this.joinRequestCell.setChecked(true);
            }

            public void lambda$onJoinToSendToggle$7(boolean z, TLRPC.Chat chat) {
                ChatLinkActivity.this.joinToSendProgress = false;
                if (z || !chat.join_request) {
                    return;
                }
                chat.join_request = false;
                ChatLinkActivity.this.joinRequestProgress = true;
                ChatLinkActivity.this.getMessagesController().toggleChatJoinRequest(chat.id, false, new ChatLinkActivity$ListAdapter$1$$ExternalSyntheticLambda2(this, 0), new PhotoViewer$44$$ExternalSyntheticLambda0(10, this, chat));
            }

            public void lambda$onJoinToSendToggle$8(Runnable runnable) {
                ChatLinkActivity.this.joinToSendProgress = false;
                runnable.run();
            }

            public void lambda$onJoinToSendToggle$9(TLRPC.Chat chat, boolean z, Runnable runnable) {
                chat.join_to_send = z;
                ChatLinkActivity.this.getMessagesController().toggleChatJoinToSend(chat.id, z, new PhotoViewer$$ExternalSyntheticLambda28(this, z, chat, 3), new ChatLinkActivity$ListAdapter$1$$ExternalSyntheticLambda5(this, runnable, 1));
            }

            public void lambda$overrideCancel$4(Runnable runnable) {
                ChatLinkActivity.this.joinToSendProgress = false;
                ChatLinkActivity.this.joinRequestProgress = false;
                runnable.run();
            }

            private void migrateIfNeeded(Runnable runnable, Runnable runnable2) {
                if (ChatObject.isChannel(ChatLinkActivity.this.currentChat)) {
                    runnable2.run();
                } else {
                    ChatLinkActivity.this.getMessagesController().convertToMegaGroup(ChatLinkActivity.this.getParentActivity(), this.val$chat.id, ChatLinkActivity.this, new WearAuthSheet$$ExternalSyntheticLambda3(5, this, runnable2), runnable);
                }
            }

            private Runnable overrideCancel(Runnable runnable) {
                return new ChatLinkActivity$ListAdapter$1$$ExternalSyntheticLambda5(this, runnable, 2);
            }

            @Override
            public boolean onJoinRequestToggle(boolean z, Runnable runnable) {
                if (ChatLinkActivity.this.joinRequestProgress) {
                    return false;
                }
                ChatLinkActivity.this.joinRequestProgress = true;
                migrateIfNeeded(overrideCancel(runnable), new ChatLinkActivity$ListAdapter$1$$ExternalSyntheticLambda1(this, this.val$chat, z, runnable, 1));
                return true;
            }

            @Override
            public boolean onJoinToSendToggle(boolean z, Runnable runnable) {
                if (ChatLinkActivity.this.joinToSendProgress) {
                    return false;
                }
                ChatLinkActivity.this.joinToSendProgress = true;
                migrateIfNeeded(overrideCancel(runnable), new ChatLinkActivity$ListAdapter$1$$ExternalSyntheticLambda1(this, this.val$chat, z, runnable, 0));
                return true;
            }
        }

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public int getItemCount() {
            if (!ChatLinkActivity.this.loadingChats || ChatLinkActivity.this.chatsLoaded) {
                return ChatLinkActivity.this.rowCount;
            }
            return 0;
        }

        @Override
        public int getItemViewType(int i) {
            if (i == ChatLinkActivity.this.helpRow) {
                return 3;
            }
            if (i == ChatLinkActivity.this.createChatRow || i == ChatLinkActivity.this.removeChatRow) {
                return 2;
            }
            if (i < ChatLinkActivity.this.chatStartRow || i >= ChatLinkActivity.this.chatEndRow) {
                return i == ChatLinkActivity.this.joinToSendRow ? 4 : 1;
            }
            return 0;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            return itemViewType == 0 || itemViewType == 2;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                ManageChatUserCell manageChatUserCell = (ManageChatUserCell) viewHolder.itemView;
                manageChatUserCell.setTag(Integer.valueOf(i));
                TLRPC.Chat chat = (TLRPC.Chat) ChatLinkActivity.this.chats.get(i - ChatLinkActivity.this.chatStartRow);
                String publicUsername = ChatObject.getPublicUsername(chat);
                manageChatUserCell.setData(chat, null, TextUtils.isEmpty(publicUsername) ? null : zzii.m("@", publicUsername), (i == ChatLinkActivity.this.chatEndRow - 1 && ChatLinkActivity.this.info.linked_chat_id == 0) ? false : true);
                return;
            }
            if (itemViewType == 1) {
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                if (i == ChatLinkActivity.this.joinToSendInfoRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.ChannelSettingsJoinRequestInfo));
                    return;
                } else {
                    if (i == ChatLinkActivity.this.detailRow) {
                        if (ChatLinkActivity.this.isChannel) {
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
            if (itemViewType != 2) {
                return;
            }
            ManageChatTextCell manageChatTextCell = (ManageChatTextCell) viewHolder.itemView;
            if (!ChatLinkActivity.this.isChannel) {
                int i2 = Theme.key_text_RedRegular;
                manageChatTextCell.setColors(i2, i2);
                manageChatTextCell.setText(LocaleController.getString(R.string.DiscussionUnlinkChannel), null, R.drawable.msg_remove, false);
            } else if (ChatLinkActivity.this.info.linked_chat_id == 0) {
                manageChatTextCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                manageChatTextCell.setText(LocaleController.getString(R.string.DiscussionCreateGroup), null, R.drawable.msg_groups, true);
            } else {
                int i3 = Theme.key_text_RedRegular;
                manageChatTextCell.setColors(i3, i3);
                manageChatTextCell.setText(LocaleController.getString(R.string.DiscussionUnlinkGroup), null, R.drawable.msg_remove, false);
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View manageChatUserCell;
            if (i == 0) {
                manageChatUserCell = new ManageChatUserCell(this.mContext, 6, 2, false, null);
            } else if (i == 1) {
                manageChatUserCell = new TextInfoPrivacyCell(this.mContext, 24, null);
            } else if (i == 2) {
                manageChatUserCell = new ManageChatTextCell(this.mContext);
            } else if (i != 4) {
                manageChatUserCell = ChatLinkActivity.this.new HintInnerCell(this.mContext);
                manageChatUserCell.setTag(-33024);
            } else {
                TLRPC.Chat chat = ChatLinkActivity.this.isChannel ? (TLRPC.Chat) ChatLinkActivity.this.chats.get(0) : ChatLinkActivity.this.currentChat;
                manageChatUserCell = ChatLinkActivity.this.joinToSendSettings = new AnonymousClass1(this.mContext, chat, chat);
            }
            return new RecyclerListView.Holder(manageChatUserCell);
        }

        @Override
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ManageChatUserCell) {
                ((ManageChatUserCell) view).avatarImageView.getImageReceiver().cancelLoadImage();
            }
        }
    }

    public class SearchAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;
        private ArrayList<TLRPC.Chat> searchResult = new ArrayList<>();
        private ArrayList<CharSequence> searchResultNames = new ArrayList<>();
        private Runnable searchRunnable;

        public SearchAdapter(Context context) {
            this.mContext = context;
        }

        public void lambda$processSearch$1(String str, ArrayList arrayList) {
            Object obj;
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                updateSearchResults(new ArrayList<>(), new ArrayList<>());
                return;
            }
            String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
            if (lowerCase.equals(translitString) || translitString.length() == 0) {
                translitString = null;
            }
            int i = (translitString != null ? 1 : 0) + 1;
            String[] strArr = new String[i];
            strArr[0] = lowerCase;
            if (translitString != null) {
                strArr[1] = translitString;
            }
            ArrayList<TLRPC.Chat> arrayList2 = new ArrayList<>();
            ArrayList<CharSequence> arrayList3 = new ArrayList<>();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i2);
                String lowerCase2 = chat.title.toLowerCase();
                String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                if (lowerCase2.equals(translitString2)) {
                    translitString2 = null;
                }
                String str2 = null;
                char c = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    String str3 = strArr[i3];
                    if (!lowerCase2.startsWith(str3) && !SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str3, lowerCase2) && (translitString2 == null || (!translitString2.startsWith(str3) && !SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str3, translitString2)))) {
                        String str4 = chat.username;
                        if (str4 == null || !str4.startsWith(str3)) {
                            ArrayList<TLRPC.TL_username> arrayList4 = chat.usernames;
                            if (arrayList4 != null && !arrayList4.isEmpty()) {
                                int i4 = 0;
                                while (i4 < chat.usernames.size()) {
                                    TLRPC.TL_username tL_username = chat.usernames.get(i4);
                                    int i5 = i4;
                                    if (tL_username.active && tL_username.username.startsWith(str3)) {
                                        str2 = tL_username.username;
                                    } else {
                                        i4 = i5 + 1;
                                    }
                                }
                            }
                        } else {
                            str2 = chat.username;
                        }
                        c = 2;
                        break;
                    }
                    c = 1;
                    if (c != 0) {
                        if (c == 1) {
                            obj = null;
                            arrayList3.add(AndroidUtilities.generateSearchName(chat.title, null, str3));
                        } else {
                            obj = null;
                            arrayList3.add(AndroidUtilities.generateSearchName(zzii.m("@", str2), null, "@" + str3));
                        }
                        arrayList2.add(chat);
                        break;
                    }
                }
            }
            updateSearchResults(arrayList2, arrayList3);
        }

        public void lambda$processSearch$2(String str) {
            this.searchRunnable = null;
            Utilities.searchQueue.postRunnable(new PhotoViewer$86$$ExternalSyntheticLambda0(this, str, new ArrayList(ChatLinkActivity.this.chats), 9));
        }

        public void lambda$updateSearchResults$3(ArrayList arrayList, ArrayList arrayList2) {
            if (ChatLinkActivity.this.searching) {
                this.searchResult = arrayList;
                this.searchResultNames = arrayList2;
                if (ChatLinkActivity.this.listView.getAdapter() == ChatLinkActivity.this.searchAdapter) {
                    ChatLinkActivity.this.emptyView.showTextView();
                }
                notifyDataSetChanged();
            }
        }

        public void lambda$searchDialogs$0(String str) {
            AndroidUtilities.runOnUIThread(new ChatLinkActivity$SearchAdapter$$ExternalSyntheticLambda0(this, str, 1));
        }

        private void updateSearchResults(ArrayList<TLRPC.Chat> arrayList, ArrayList<CharSequence> arrayList2) {
            AndroidUtilities.runOnUIThread(new PhotoViewer$86$$ExternalSyntheticLambda0(this, arrayList, arrayList2, 8));
        }

        public TLRPC.Chat getItem(int i) {
            return this.searchResult.get(i);
        }

        @Override
        public int getItemCount() {
            return this.searchResult.size();
        }

        @Override
        public int getItemViewType(int i) {
            return 0;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() != 1;
        }

        @Override
        public void notifyDataSetChanged() {
            super.notifyDataSetChanged();
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLRPC.Chat chat = this.searchResult.get(i);
            String publicUsername = ChatObject.getPublicUsername(chat);
            CharSequence charSequence = this.searchResultNames.get(i);
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
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            ManageChatUserCell manageChatUserCell = new ManageChatUserCell(this.mContext, 6, 2, false, null);
            manageChatUserCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            return new RecyclerListView.Holder(manageChatUserCell);
        }

        @Override
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ManageChatUserCell) {
                ((ManageChatUserCell) view).avatarImageView.getImageReceiver().cancelLoadImage();
            }
        }

        public void searchDialogs(String str) {
            if (this.searchRunnable != null) {
                Utilities.searchQueue.cancelRunnable(this.searchRunnable);
                this.searchRunnable = null;
            }
            if (TextUtils.isEmpty(str)) {
                this.searchResult.clear();
                this.searchResultNames.clear();
                notifyDataSetChanged();
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
        this.chats = new ArrayList<>();
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

    public void lambda$createView$0() {
        getMessagesController().loadFullChat(this.currentChatId, 0, true);
    }

    public void lambda$createView$1(AlertDialog[] alertDialogArr) {
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
        AndroidUtilities.runOnUIThread(new ChatLinkActivity$$ExternalSyntheticLambda1(this, i), 1000L);
        if (this.isChannel) {
            return;
        }
        finishFragment();
    }

    public void lambda$createView$2(AlertDialog[] alertDialogArr, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda80(21, this, alertDialogArr));
    }

    public void lambda$createView$3(int i, DialogInterface dialogInterface) {
        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(i, true);
    }

    public void lambda$createView$4(AlertDialog[] alertDialogArr, int i) {
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog == null) {
            return;
        }
        alertDialog.setOnCancelListener(new ChatLinkActivity$$ExternalSyntheticLambda16(this, i, 0));
        showDialog(alertDialogArr[0]);
    }

    public void lambda$createView$5(AlertDialog alertDialog, int i) {
        int i2 = 1;
        if (this.isChannel && this.info.linked_chat_id == 0) {
            return;
        }
        AlertDialog[] alertDialogArr = {new AlertDialog(getParentActivity(), 3, null)};
        TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
        if (this.isChannel) {
            tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(this.currentChat);
            tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
        } else {
            tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
            tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(this.currentChat);
        }
        AndroidUtilities.runOnUIThread(new ChatLinkActivity$$ExternalSyntheticLambda7(this, alertDialogArr, getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new IntroActivity$$ExternalSyntheticLambda6(23, this, alertDialogArr)), i2), 500L);
    }

    public void lambda$createView$6(View view, int i) {
        TLRPC.Chat item;
        String string;
        String string2;
        if (getParentActivity() == null) {
            return;
        }
        RecyclerView.Adapter adapter = this.listView.getAdapter();
        SearchAdapter searchAdapter = this.searchAdapter;
        if (adapter == searchAdapter) {
            item = searchAdapter.getItem(i);
        } else {
            int i2 = this.chatStartRow;
            item = (i < i2 || i >= this.chatEndRow) ? null : this.chats.get(i - i2);
        }
        if (item != null) {
            if (this.isChannel && this.info.linked_chat_id == 0) {
                showLinkAlert(item, true);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", item.id);
            presentFragment(new ChatActivity(bundle));
            return;
        }
        if (i == this.createChatRow) {
            if (this.isChannel && this.info.linked_chat_id == 0) {
                Bundle bundle2 = new Bundle();
                bundle2.putLongArray("result", new long[]{getUserConfig().getClientUserId()});
                bundle2.putInt("chatType", 4);
                TLRPC.Chat chat = this.currentChat;
                if (chat != null) {
                    bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat.title));
                }
                GroupCreateFinalActivity groupCreateFinalActivity = new GroupCreateFinalActivity(bundle2);
                groupCreateFinalActivity.setDelegate(new GroupCreateFinalActivity.GroupCreateFinalActivityDelegate() {
                    @Override
                    public void didFailChatCreation() {
                    }

                    @Override
                    public void didFinishChatCreation(GroupCreateFinalActivity groupCreateFinalActivity2, long j) {
                        ChatLinkActivity chatLinkActivity = ChatLinkActivity.this;
                        chatLinkActivity.linkChat(chatLinkActivity.getMessagesController().getChat(Long.valueOf(j)), groupCreateFinalActivity2);
                    }

                    @Override
                    public void didStartChatCreation() {
                    }
                });
                presentFragment(groupCreateFinalActivity);
                return;
            }
            if (this.chats.isEmpty()) {
                return;
            }
            TLRPC.Chat chat2 = this.chats.get(0);
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            if (this.isChannel) {
                string = LocaleController.getString(R.string.DiscussionUnlinkGroup);
                string2 = LocaleController.formatString("DiscussionUnlinkChannelAlert", R.string.DiscussionUnlinkChannelAlert, chat2.title);
            } else {
                string = LocaleController.getString(R.string.DiscussionUnlinkChannel);
                string2 = LocaleController.formatString("DiscussionUnlinkGroupAlert", R.string.DiscussionUnlinkGroupAlert, chat2.title);
            }
            builder.setTitle(string);
            builder.setMessage(AndroidUtilities.replaceTags(string2));
            builder.setPositiveButton(LocaleController.getString(R.string.DiscussionUnlink), new BoostsActivity$$ExternalSyntheticLambda4(this, 11));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            AlertDialog alertDialogCreate = builder.create();
            showDialog(alertDialogCreate);
            TextView textView = (TextView) alertDialogCreate.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
            }
        }
    }

    public void lambda$getThemeDescriptions$18() {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            int childCount = recyclerListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.listView.getChildAt(i);
                if (childAt instanceof ManageChatUserCell) {
                    ((ManageChatUserCell) childAt).update(0);
                }
            }
        }
    }

    public void lambda$linkChat$10(BaseFragment baseFragment, long j) {
        if (j != 0) {
            getMessagesController().toggleChannelInvitesHistory(j, false);
            linkChat(getMessagesController().getChat(Long.valueOf(j)), baseFragment);
        }
    }

    public void lambda$linkChat$11() {
        getMessagesController().loadFullChat(this.currentChatId, 0, true);
    }

    public void lambda$linkChat$12(AlertDialog[] alertDialogArr, TLRPC.Chat chat, BaseFragment baseFragment) {
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
        AndroidUtilities.runOnUIThread(new ChatLinkActivity$$ExternalSyntheticLambda1(this, i), 1000L);
        if (baseFragment == null) {
            finishFragment();
        } else {
            removeSelfFromStack();
            baseFragment.finishFragment();
        }
    }

    public void lambda$linkChat$13(AlertDialog[] alertDialogArr, TLRPC.Chat chat, BaseFragment baseFragment, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda5(this, alertDialogArr, chat, baseFragment));
    }

    public void lambda$linkChat$14(int i, DialogInterface dialogInterface) {
        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(i, true);
    }

    public void lambda$linkChat$15(AlertDialog[] alertDialogArr, int i) {
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog == null) {
            return;
        }
        alertDialog.setOnCancelListener(new ChatLinkActivity$$ExternalSyntheticLambda16(this, i, 1));
        showDialog(alertDialogArr[0]);
    }

    public void lambda$loadChats$16(TLObject tLObject) {
        if (tLObject instanceof TLRPC.messages_Chats) {
            TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
            getMessagesController().putChats(messages_chats.chats, false);
            ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
            this.chats = arrayList;
            Iterator<TLRPC.Chat> it = arrayList.iterator();
            while (it.hasNext()) {
                TLRPC.Chat next = it.next();
                if (ChatObject.isForum(next) || ChatObject.isMonoForum(next)) {
                    it.remove();
                }
            }
        }
        this.loadingChats = false;
        this.chatsLoaded = true;
        updateRows();
    }

    public void lambda$loadChats$17(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda80(20, this, tLObject));
    }

    public void lambda$showLinkAlert$7(DialogInterface dialogInterface) {
        this.waitingForFullChat = null;
    }

    public void lambda$showLinkAlert$8() {
        AlertDialog alertDialog = this.waitingForFullChatProgressAlert;
        if (alertDialog == null) {
            return;
        }
        alertDialog.setOnCancelListener(new LinkManager$$ExternalSyntheticLambda4(this, 3));
        showDialog(this.waitingForFullChatProgressAlert);
    }

    public void lambda$showLinkAlert$9(TLRPC.ChatFull chatFull, TLRPC.Chat chat, AlertDialog alertDialog, int i) {
        if (chatFull.hidden_prehistory) {
            getMessagesController().toggleChannelInvitesHistory(chat.id, false);
        }
        linkChat(chat, null);
    }

    public void linkChat(TLRPC.Chat chat, BaseFragment baseFragment) {
        int i = 0;
        if (chat == null) {
            return;
        }
        if (!ChatObject.isChannel(chat)) {
            getMessagesController().convertToMegaGroup(getParentActivity(), chat.id, this, new DialogsActivity$$ExternalSyntheticLambda6(2, this, baseFragment));
            return;
        }
        AlertDialog[] alertDialogArr = {baseFragment == null ? new AlertDialog(getParentActivity(), 3, null) : null};
        TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(this.currentChat);
        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(chat);
        AndroidUtilities.runOnUIThread(new ChatLinkActivity$$ExternalSyntheticLambda7(this, alertDialogArr, getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new LoginActivity$$ExternalSyntheticLambda27(4, this, alertDialogArr, chat, baseFragment), 64), i), 500L);
    }

    private void loadChats() {
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
            getConnectionsManager().sendRequest(new TLRPC.TL_channels_getGroupsForDiscussion(), new LinkManager$$ExternalSyntheticLambda10(this, 7));
        }
    }

    private void showLinkAlert(TLRPC.Chat chat, boolean z) {
        String string;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(chat.id);
        int i = 0;
        if (chatFull == null) {
            if (z) {
                getMessagesController().loadFullChat(chat.id, 0, true);
                this.waitingForFullChat = chat;
                this.waitingForFullChatProgressAlert = new AlertDialog(getParentActivity(), 3, null);
                AndroidUtilities.runOnUIThread(new ChatLinkActivity$$ExternalSyntheticLambda1(this, i), 500L);
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
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        avatarDrawable.setTextSize(AndroidUtilities.dp(12.0f));
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
        backupImageView.setForUserOrChat(chat, avatarDrawable);
        builder.setPositiveButton(LocaleController.getString(R.string.DiscussionLinkGroup), new WearAuthSheet$$ExternalSyntheticLambda5(this, chatFull, chat, 19));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        showDialog(builder.create());
    }

    private void updateRows() {
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
        this.helpRow = 0;
        if (this.isChannel) {
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
        if (!this.isChannel || (this.chats.size() > 0 && this.info.linked_chat_id != 0)) {
            TLRPC.Chat chat2 = this.isChannel ? this.chats.get(0) : this.currentChat;
            if (chat2 != null && ((!ChatObject.isPublic(chat2) || this.isChannel) && (chat2.creator || ((tL_chatAdminRights = chat2.admin_rights) != null && tL_chatAdminRights.ban_users)))) {
                int i4 = this.rowCount;
                this.rowCount = i4 + 1;
                this.joinToSendRow = i4;
            }
        }
        ListAdapter listAdapter = this.listViewAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
        ActionBarMenuItem actionBarMenuItem = this.searchItem;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setVisibility(this.chats.size() <= 10 ? 8 : 0);
        }
    }

    @Override
    public View createView(Context context) {
        this.searching = false;
        this.searchWas = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Discussion));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    ChatLinkActivity.this.finishFragment();
                }
            }
        });
        ActionBarMenuItem actionBarMenuItemSearchListener = this.actionBar.createMenu().addItem(0, R.drawable.outline_header_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
            @Override
            public void onSearchCollapse() {
                ChatLinkActivity.this.searchAdapter.searchDialogs(null);
                ChatLinkActivity.this.searching = false;
                ChatLinkActivity.this.searchWas = false;
                ChatLinkActivity.this.listView.setAdapter(ChatLinkActivity.this.listViewAdapter);
                ChatLinkActivity.this.listViewAdapter.notifyDataSetChanged();
                ChatLinkActivity.this.listView.setFastScrollVisible(true);
                ChatLinkActivity.this.listView.setVerticalScrollBarEnabled(false);
                ChatLinkActivity.this.emptyView.setShowAtCenter(false);
                View view = ChatLinkActivity.this.fragmentView;
                int i = Theme.key_windowBackgroundGray;
                view.setBackgroundColor(Theme.getColor(null, i, false));
                ChatLinkActivity.this.fragmentView.setTag(Integer.valueOf(i));
                ChatLinkActivity.this.emptyView.showProgress();
            }

            @Override
            public void onSearchExpand() {
                ChatLinkActivity.this.searching = true;
                ChatLinkActivity.this.emptyView.setShowAtCenter(true);
            }

            @Override
            public void onTextChanged(EditText editText) {
                if (ChatLinkActivity.this.searchAdapter == null) {
                    return;
                }
                String string = editText.getText().toString();
                if (string.length() != 0) {
                    ChatLinkActivity.this.searchWas = true;
                    if (ChatLinkActivity.this.listView != null && ChatLinkActivity.this.listView.getAdapter() != ChatLinkActivity.this.searchAdapter) {
                        ChatLinkActivity.this.listView.setAdapter(ChatLinkActivity.this.searchAdapter);
                        View view = ChatLinkActivity.this.fragmentView;
                        int i = Theme.key_windowBackgroundWhite;
                        view.setBackgroundColor(Theme.getColor(null, i, false));
                        ChatLinkActivity.this.fragmentView.setTag(Integer.valueOf(i));
                        ChatLinkActivity.this.searchAdapter.notifyDataSetChanged();
                        ChatLinkActivity.this.listView.setFastScrollVisible(false);
                        ChatLinkActivity.this.listView.setVerticalScrollBarEnabled(true);
                        ChatLinkActivity.this.emptyView.showProgress();
                    }
                }
                ChatLinkActivity.this.searchAdapter.searchDialogs(string);
            }
        });
        this.searchItem = actionBarMenuItemSearchListener;
        actionBarMenuItemSearchListener.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.searchAdapter = new SearchAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i = Theme.key_windowBackgroundGray;
        frameLayout.setBackgroundColor(Theme.getColor(null, i, false));
        this.fragmentView.setTag(Integer.valueOf(i));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context);
        this.emptyView = emptyTextProgressView;
        emptyTextProgressView.showProgress();
        this.emptyView.setText(LocaleController.getString(R.string.NoResult));
        frameLayout2.addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.listView.setEmptyView(this.emptyView);
        CacheChatsExceptionsFragment$$ExternalSyntheticOutline0.m(1, this.listView, false);
        RecyclerListView recyclerListView2 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.listViewAdapter = listAdapter;
        recyclerListView2.setAdapter(listAdapter);
        this.listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda100(this, 10));
        updateRows();
        return this.fragmentView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        JoinToSendSettingsView joinToSendSettingsView;
        TLRPC.Chat chat;
        TLRPC.Chat chat2 = null;
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j = chatFull.id;
            if (j == this.currentChatId) {
                this.info = chatFull;
                loadChats();
                updateRows();
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
        if (this.chats.size() > 0 && (chat = getMessagesController().getChat(Long.valueOf(this.chats.get(0).id))) != null) {
            this.chats.set(0, chat);
        }
        if (!this.isChannel) {
            chat2 = this.currentChat;
        } else if (this.chats.size() > 0) {
            chat2 = this.chats.get(0);
        }
        if (chat2 == null || (joinToSendSettingsView = this.joinToSendSettings) == null) {
            return;
        }
        if (!this.joinRequestProgress) {
            joinToSendSettingsView.lambda$new$3(chat2.join_request);
        }
        if (this.joinToSendProgress) {
            return;
        }
        this.joinToSendSettings.setJoinToSend(chat2.join_to_send);
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        IntroActivity$$ExternalSyntheticLambda0 introActivity$$ExternalSyntheticLambda0 = new IntroActivity$$ExternalSyntheticLambda0(this, 8);
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
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"statusColor"}, null, null, -1, introActivity$$ExternalSyntheticLambda0, Theme.key_windowBackgroundWhiteGrayText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"statusOnlineColor"}, null, null, -1, introActivity$$ExternalSyntheticLambda0, Theme.key_windowBackgroundWhiteBlueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HintInnerCell.class}, new String[]{"messageTextView"}, null, null, -1, null, Theme.key_chats_message));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{ManageChatTextCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{ManageChatTextCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayIcon));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{ManageChatTextCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueButton));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{ManageChatTextCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueIcon));
        return arrayList;
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        loadChats();
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override
    public void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listViewAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
    }

    public void setInfo(TLRPC.ChatFull chatFull) {
        this.info = chatFull;
    }
}
