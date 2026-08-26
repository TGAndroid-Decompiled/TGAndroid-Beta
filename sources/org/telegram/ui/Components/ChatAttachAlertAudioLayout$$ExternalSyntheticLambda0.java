package org.telegram.ui.Components;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class ChatAttachAlertAudioLayout$$ExternalSyntheticLambda0 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final ChatAttachAlertAudioLayout f$0;
    public final MessagesController f$1;
    public final int f$2;

    public ChatAttachAlertAudioLayout$$ExternalSyntheticLambda0(ChatAttachAlertAudioLayout chatAttachAlertAudioLayout, MessagesController messagesController, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = chatAttachAlertAudioLayout;
        this.f$1 = messagesController;
        this.f$2 = i;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2;
        switch (this.$r8$classId) {
            case 0:
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                ChatAttachAlertAudioLayout chatAttachAlertAudioLayout = this.f$0;
                chatAttachAlertAudioLayout.searchChatsRequestId = -1;
                boolean z = false;
                chatAttachAlertAudioLayout.loadingSearchChats = false;
                if (messages_messages != null) {
                    ArrayList<TLRPC.User> arrayList = messages_messages.users;
                    MessagesController messagesController = this.f$1;
                    messagesController.putUsers(arrayList, false);
                    messagesController.putChats(messages_messages.chats, false);
                    ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
                    int size = arrayList2.size();
                    int i = 0;
                    while (true) {
                        ArrayList arrayList3 = chatAttachAlertAudioLayout.foundInChats;
                        if (i >= size) {
                            int i2 = messages_messages.next_rate;
                            chatAttachAlertAudioLayout.searchChatsNextRate = i2;
                            if (i2 != 0 || (messages_messages.count > 0 && arrayList3.size() < messages_messages.count)) {
                                z = true;
                            }
                            chatAttachAlertAudioLayout.searchChatsHasMore = z;
                            ChatAttachAlertAudioLayout$$ExternalSyntheticLambda2 chatAttachAlertAudioLayout$$ExternalSyntheticLambda2 = chatAttachAlertAudioLayout.updateWithSavingScrollRunnable;
                            AndroidUtilities.cancelRunOnUIThread(chatAttachAlertAudioLayout$$ExternalSyntheticLambda2);
                            AndroidUtilities.runOnUIThread(chatAttachAlertAudioLayout$$ExternalSyntheticLambda2);
                            break;
                        } else {
                            TLRPC.Message message = arrayList2.get(i);
                            i++;
                            MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                            MessageObject messageObject = new MessageObject(this.f$2, message, false, true);
                            audioEntry.messageObject = messageObject;
                            TLRPC.Document document = messageObject.getDocument();
                            if (document != null) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= document.attributes.size()) {
                                        tL_documentAttributeAudio = null;
                                    } else if (document.attributes.get(i3) instanceof TLRPC.TL_documentAttributeAudio) {
                                        tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) document.attributes.get(i3);
                                    } else {
                                        i3++;
                                    }
                                }
                                if (tL_documentAttributeAudio != null) {
                                    audioEntry.author = tL_documentAttributeAudio.performer;
                                    audioEntry.title = tL_documentAttributeAudio.title;
                                    audioEntry.duration = (int) tL_documentAttributeAudio.duration;
                                    arrayList3.add(audioEntry);
                                }
                            }
                        }
                    }
                }
                break;
            default:
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) obj;
                ChatAttachAlertAudioLayout chatAttachAlertAudioLayout2 = this.f$0;
                chatAttachAlertAudioLayout2.searchGlobalRequestId = -1;
                chatAttachAlertAudioLayout2.loadingSearchGlobal = false;
                if (messages_botresults != null) {
                    this.f$1.putUsers(messages_botresults.users, false);
                    ArrayList<TLRPC.BotInlineResult> arrayList4 = messages_botresults.results;
                    int size2 = arrayList4.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        TLRPC.BotInlineResult botInlineResult = arrayList4.get(i4);
                        i4++;
                        TLRPC.BotInlineResult botInlineResult2 = botInlineResult;
                        if (botInlineResult2 instanceof TLRPC.TL_botInlineMediaResult) {
                            TLRPC.TL_botInlineMediaResult tL_botInlineMediaResult = (TLRPC.TL_botInlineMediaResult) botInlineResult2;
                            if (tL_botInlineMediaResult.document != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                int i5 = chatAttachAlertAudioLayout2.globalAudioMessageId;
                                chatAttachAlertAudioLayout2.globalAudioMessageId = i5 - 1;
                                tL_message.id = i5;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                int i6 = this.f$2;
                                long clientUserId = UserConfig.getInstance(i6).getClientUserId();
                                tL_peerUser.user_id = clientUserId;
                                peer.user_id = clientUserId;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                                tL_message.flags |= 768;
                                MediaController.AudioEntry audioEntry2 = new MediaController.AudioEntry();
                                MessageObject messageObject2 = new MessageObject(i6, tL_message, false, true);
                                audioEntry2.messageObject = messageObject2;
                                TLRPC.Document document2 = messageObject2.getDocument();
                                if (document2 != null) {
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 >= document2.attributes.size()) {
                                            tL_documentAttributeAudio2 = null;
                                        } else if (document2.attributes.get(i7) instanceof TLRPC.TL_documentAttributeAudio) {
                                            tL_documentAttributeAudio2 = (TLRPC.TL_documentAttributeAudio) document2.attributes.get(i7);
                                        } else {
                                            i7++;
                                        }
                                    }
                                    if (tL_documentAttributeAudio2 != null) {
                                        audioEntry2.author = tL_documentAttributeAudio2.performer;
                                        audioEntry2.title = tL_documentAttributeAudio2.title;
                                        audioEntry2.duration = (int) tL_documentAttributeAudio2.duration;
                                        chatAttachAlertAudioLayout2.foundGlobal.add(audioEntry2);
                                    }
                                }
                            }
                        }
                    }
                    String str = messages_botresults.next_offset;
                    chatAttachAlertAudioLayout2.globalAudioOffset = str;
                    chatAttachAlertAudioLayout2.searchGlobalHasMore = !TextUtils.isEmpty(str);
                    ChatAttachAlertAudioLayout$$ExternalSyntheticLambda2 chatAttachAlertAudioLayout$$ExternalSyntheticLambda3 = chatAttachAlertAudioLayout2.updateWithSavingScrollRunnable;
                    AndroidUtilities.cancelRunOnUIThread(chatAttachAlertAudioLayout$$ExternalSyntheticLambda3);
                    AndroidUtilities.runOnUIThread(chatAttachAlertAudioLayout$$ExternalSyntheticLambda3);
                }
                break;
        }
    }
}
