package org.telegram.ui.Components;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fi implements org.telegram.messenger.n10 {
    public final int f33803a;
    public final ni f33804b;
    public final org.telegram.messenger.hp f33805c;
    public final int d;

    public fi(ni niVar, org.telegram.messenger.hp hpVar, int i3, int i10) {
        this.f33803a = i10;
        this.f33804b = niVar;
        this.f33805c = hpVar;
        this.d = i3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2;
        switch (this.f33803a) {
            case 0:
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ni niVar = this.f33804b;
                niVar.f36548e0 = -1;
                niVar.f36557n0 = false;
                if (messages_botresults != null) {
                    this.f33805c.Y3(messages_botresults.users, false);
                    ArrayList<TLRPC.BotInlineResult> arrayList = messages_botresults.results;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        TLRPC.BotInlineResult botInlineResult = arrayList.get(i3);
                        i3++;
                        TLRPC.BotInlineResult botInlineResult2 = botInlineResult;
                        if (botInlineResult2 instanceof TLRPC.TL_botInlineMediaResult) {
                            TLRPC.TL_botInlineMediaResult tL_botInlineMediaResult = (TLRPC.TL_botInlineMediaResult) botInlineResult2;
                            if (tL_botInlineMediaResult.document != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                int i10 = niVar.m0;
                                niVar.m0 = i10 - 1;
                                tL_message.f27022id = i10;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                int i11 = this.d;
                                long e10 = org.telegram.messenger.h10.i(i11).e();
                                tL_peerUser.user_id = e10;
                                peer.user_id = e10;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                                tL_message.flags |= 768;
                                ?? obj3 = new Object();
                                org.telegram.messenger.zi ziVar = new org.telegram.messenger.zi(i11, tL_message, false, true);
                                obj3.f24883e = ziVar;
                                TLRPC.Document F0 = ziVar.F0();
                                if (F0 != null) {
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 < F0.attributes.size()) {
                                            if (F0.attributes.get(i12) instanceof TLRPC.TL_documentAttributeAudio) {
                                                tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) F0.attributes.get(i12);
                                            } else {
                                                i12++;
                                            }
                                        } else {
                                            tL_documentAttributeAudio = null;
                                        }
                                    }
                                    if (tL_documentAttributeAudio != null) {
                                        obj3.f24880a = tL_documentAttributeAudio.performer;
                                        obj3.f24881b = tL_documentAttributeAudio.title;
                                        obj3.f24882c = (int) tL_documentAttributeAudio.duration;
                                        niVar.N.add(obj3);
                                    }
                                }
                            }
                        }
                    }
                    niVar.f36555l0 = messages_botresults.next_offset;
                    niVar.f36551h0 = !TextUtils.isEmpty(str);
                    niVar.T();
                    return;
                }
                return;
            default:
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ni niVar2 = this.f33804b;
                ArrayList arrayList2 = niVar2.M;
                niVar2.V = -1;
                boolean z10 = false;
                niVar2.f36544a0 = false;
                if (messages_messages != null) {
                    ArrayList<TLRPC.User> arrayList3 = messages_messages.users;
                    org.telegram.messenger.hp hpVar = this.f33805c;
                    hpVar.Y3(arrayList3, false);
                    hpVar.S3(messages_messages.chats, false);
                    ArrayList<TLRPC.Message> arrayList4 = messages_messages.messages;
                    int size2 = arrayList4.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        TLRPC.Message message = arrayList4.get(i13);
                        i13++;
                        ?? obj4 = new Object();
                        org.telegram.messenger.zi ziVar2 = new org.telegram.messenger.zi(this.d, message, false, true);
                        obj4.f24883e = ziVar2;
                        TLRPC.Document F02 = ziVar2.F0();
                        if (F02 != null) {
                            int i14 = 0;
                            while (true) {
                                if (i14 < F02.attributes.size()) {
                                    if (F02.attributes.get(i14) instanceof TLRPC.TL_documentAttributeAudio) {
                                        tL_documentAttributeAudio2 = (TLRPC.TL_documentAttributeAudio) F02.attributes.get(i14);
                                    } else {
                                        i14++;
                                    }
                                } else {
                                    tL_documentAttributeAudio2 = null;
                                }
                            }
                            if (tL_documentAttributeAudio2 != null) {
                                obj4.f24880a = tL_documentAttributeAudio2.performer;
                                obj4.f24881b = tL_documentAttributeAudio2.title;
                                obj4.f24882c = (int) tL_documentAttributeAudio2.duration;
                                arrayList2.add(obj4);
                            }
                        }
                    }
                    int i15 = messages_messages.next_rate;
                    niVar2.f36546c0 = i15;
                    if (i15 != 0 || (messages_messages.count > 0 && arrayList2.size() < messages_messages.count)) {
                        z10 = true;
                    }
                    niVar2.f36547d0 = z10;
                    niVar2.T();
                    return;
                }
                return;
        }
    }
}
