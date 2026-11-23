package org.telegram.ui.Components;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xi implements org.telegram.messenger.r10 {
    public final int f42098a;
    public final ej f42099b;
    public final org.telegram.messenger.np f42100c;
    public final int d;

    public xi(ej ejVar, org.telegram.messenger.np npVar, int i7, int i10) {
        this.f42098a = i10;
        this.f42099b = ejVar;
        this.f42100c = npVar;
        this.d = i7;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2;
        switch (this.f42098a) {
            case 0:
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ej ejVar = this.f42099b;
                ejVar.f34819e0 = -1;
                ejVar.f34828n0 = false;
                if (messages_botresults != null) {
                    this.f42100c.f4(messages_botresults.users, false);
                    ArrayList<TLRPC.BotInlineResult> arrayList = messages_botresults.results;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        TLRPC.BotInlineResult botInlineResult = arrayList.get(i7);
                        i7++;
                        TLRPC.BotInlineResult botInlineResult2 = botInlineResult;
                        if (botInlineResult2 instanceof TLRPC.TL_botInlineMediaResult) {
                            TLRPC.TL_botInlineMediaResult tL_botInlineMediaResult = (TLRPC.TL_botInlineMediaResult) botInlineResult2;
                            if (tL_botInlineMediaResult.document != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                int i10 = ejVar.m0;
                                ejVar.m0 = i10 - 1;
                                tL_message.f28455id = i10;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                int i11 = this.d;
                                long e10 = org.telegram.messenger.k10.i(i11).e();
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
                                org.telegram.messenger.gj gjVar = new org.telegram.messenger.gj(i11, tL_message, false, true);
                                obj3.f27727e = gjVar;
                                TLRPC.Document F0 = gjVar.F0();
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
                                        obj3.f27724a = tL_documentAttributeAudio.performer;
                                        obj3.f27725b = tL_documentAttributeAudio.title;
                                        obj3.f27726c = (int) tL_documentAttributeAudio.duration;
                                        ejVar.N.add(obj3);
                                    }
                                }
                            }
                        }
                    }
                    ejVar.f34826l0 = messages_botresults.next_offset;
                    ejVar.f34822h0 = !TextUtils.isEmpty(str);
                    ejVar.U();
                    return;
                }
                return;
            default:
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ej ejVar2 = this.f42099b;
                ArrayList arrayList2 = ejVar2.M;
                ejVar2.V = -1;
                boolean z10 = false;
                ejVar2.f34815a0 = false;
                if (messages_messages != null) {
                    ArrayList<TLRPC.User> arrayList3 = messages_messages.users;
                    org.telegram.messenger.np npVar = this.f42100c;
                    npVar.f4(arrayList3, false);
                    npVar.Z3(messages_messages.chats, false);
                    ArrayList<TLRPC.Message> arrayList4 = messages_messages.messages;
                    int size2 = arrayList4.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        TLRPC.Message message = arrayList4.get(i13);
                        i13++;
                        ?? obj4 = new Object();
                        org.telegram.messenger.gj gjVar2 = new org.telegram.messenger.gj(this.d, message, false, true);
                        obj4.f27727e = gjVar2;
                        TLRPC.Document F02 = gjVar2.F0();
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
                                obj4.f27724a = tL_documentAttributeAudio2.performer;
                                obj4.f27725b = tL_documentAttributeAudio2.title;
                                obj4.f27726c = (int) tL_documentAttributeAudio2.duration;
                                arrayList2.add(obj4);
                            }
                        }
                    }
                    int i15 = messages_messages.next_rate;
                    ejVar2.f34817c0 = i15;
                    if (i15 != 0 || (messages_messages.count > 0 && arrayList2.size() < messages_messages.count)) {
                        z10 = true;
                    }
                    ejVar2.f34818d0 = z10;
                    ejVar2.U();
                    return;
                }
                return;
        }
    }
}
