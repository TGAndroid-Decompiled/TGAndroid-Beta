package org.telegram.ui.Components;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class qi implements Utilities.Callback2 {
    public final int f31953a;
    public final yi f31954b;
    public final MessagesController f31955c;
    public final int d;

    public qi(yi yiVar, MessagesController messagesController, int i10, int i11) {
        this.f31953a = i11;
        this.f31954b = yiVar;
        this.f31955c = messagesController;
        this.d = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String str;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2;
        switch (this.f31953a) {
            case 0:
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                yi yiVar = this.f31954b;
                yiVar.f35065a0 = -1;
                yiVar.f35074j0 = false;
                if (messages_botresults != null) {
                    this.f31955c.putUsers(messages_botresults.users, false);
                    ArrayList<TLRPC.BotInlineResult> arrayList = messages_botresults.results;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        TLRPC.BotInlineResult botInlineResult = arrayList.get(i10);
                        i10++;
                        TLRPC.BotInlineResult botInlineResult2 = botInlineResult;
                        if (botInlineResult2 instanceof TLRPC.TL_botInlineMediaResult) {
                            TLRPC.TL_botInlineMediaResult tL_botInlineMediaResult = (TLRPC.TL_botInlineMediaResult) botInlineResult2;
                            if (tL_botInlineMediaResult.document != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                int i11 = yiVar.f35073i0;
                                yiVar.f35073i0 = i11 - 1;
                                tL_message.f22413id = i11;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                int i12 = this.d;
                                long clientUserId = UserConfig.getInstance(i12).getClientUserId();
                                tL_peerUser.user_id = clientUserId;
                                peer.user_id = clientUserId;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                                tL_message.flags |= 768;
                                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                MessageObject messageObject = new MessageObject(i12, tL_message, false, true);
                                audioEntry.messageObject = messageObject;
                                TLRPC.Document document = messageObject.getDocument();
                                if (document != null) {
                                    int i13 = 0;
                                    while (true) {
                                        if (i13 < document.attributes.size()) {
                                            if (document.attributes.get(i13) instanceof TLRPC.TL_documentAttributeAudio) {
                                                tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) document.attributes.get(i13);
                                            } else {
                                                i13++;
                                            }
                                        } else {
                                            tL_documentAttributeAudio = null;
                                        }
                                    }
                                    if (tL_documentAttributeAudio != null) {
                                        audioEntry.author = tL_documentAttributeAudio.performer;
                                        audioEntry.title = tL_documentAttributeAudio.title;
                                        audioEntry.duration = (int) tL_documentAttributeAudio.duration;
                                        yiVar.J.add(audioEntry);
                                    }
                                }
                            }
                        }
                    }
                    yiVar.f35072h0 = messages_botresults.next_offset;
                    yiVar.f35068d0 = !TextUtils.isEmpty(str);
                    yiVar.P();
                    return;
                }
                return;
            default:
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                yi yiVar2 = this.f31954b;
                ArrayList arrayList2 = yiVar2.I;
                yiVar2.R = -1;
                boolean z10 = false;
                yiVar2.T = false;
                if (messages_messages != null) {
                    ArrayList<TLRPC.User> arrayList3 = messages_messages.users;
                    MessagesController messagesController = this.f31955c;
                    messagesController.putUsers(arrayList3, false);
                    messagesController.putChats(messages_messages.chats, false);
                    ArrayList<TLRPC.Message> arrayList4 = messages_messages.messages;
                    int size2 = arrayList4.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        TLRPC.Message message = arrayList4.get(i14);
                        i14++;
                        MediaController.AudioEntry audioEntry2 = new MediaController.AudioEntry();
                        MessageObject messageObject2 = new MessageObject(this.d, message, false, true);
                        audioEntry2.messageObject = messageObject2;
                        TLRPC.Document document2 = messageObject2.getDocument();
                        if (document2 != null) {
                            int i15 = 0;
                            while (true) {
                                if (i15 < document2.attributes.size()) {
                                    if (document2.attributes.get(i15) instanceof TLRPC.TL_documentAttributeAudio) {
                                        tL_documentAttributeAudio2 = (TLRPC.TL_documentAttributeAudio) document2.attributes.get(i15);
                                    } else {
                                        i15++;
                                    }
                                } else {
                                    tL_documentAttributeAudio2 = null;
                                }
                            }
                            if (tL_documentAttributeAudio2 != null) {
                                audioEntry2.author = tL_documentAttributeAudio2.performer;
                                audioEntry2.title = tL_documentAttributeAudio2.title;
                                audioEntry2.duration = (int) tL_documentAttributeAudio2.duration;
                                arrayList2.add(audioEntry2);
                            }
                        }
                    }
                    int i16 = messages_messages.next_rate;
                    yiVar2.V = i16;
                    if (i16 != 0 || (messages_messages.count > 0 && arrayList2.size() < messages_messages.count)) {
                        z10 = true;
                    }
                    yiVar2.W = z10;
                    yiVar2.P();
                    return;
                }
                return;
        }
    }
}
