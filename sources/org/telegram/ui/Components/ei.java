package org.telegram.ui.Components;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ei implements org.telegram.messenger.j20 {
    public final int f25804a;
    public final mi f25805b;
    public final org.telegram.messenger.vp f25806c;
    public final int d;

    public ei(mi miVar, org.telegram.messenger.vp vpVar, int i10, int i11) {
        this.f25804a = i11;
        this.f25805b = miVar;
        this.f25806c = vpVar;
        this.d = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2;
        switch (this.f25804a) {
            case 0:
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                mi miVar = this.f25805b;
                miVar.f28478d0 = -1;
                miVar.m0 = false;
                if (messages_botresults != null) {
                    this.f25806c.V3(messages_botresults.users, false);
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
                                int i11 = miVar.f28486l0;
                                miVar.f28486l0 = i11 - 1;
                                tL_message.f19814id = i11;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                int i12 = this.d;
                                long e = org.telegram.messenger.d20.i(i12).e();
                                tL_peerUser.user_id = e;
                                peer.user_id = e;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                                tL_message.flags |= 768;
                                ?? obj3 = new Object();
                                org.telegram.messenger.jj jjVar = new org.telegram.messenger.jj(i12, tL_message, false, true);
                                obj3.e = jjVar;
                                TLRPC.Document F0 = jjVar.F0();
                                if (F0 != null) {
                                    int i13 = 0;
                                    while (true) {
                                        if (i13 < F0.attributes.size()) {
                                            if (F0.attributes.get(i13) instanceof TLRPC.TL_documentAttributeAudio) {
                                                tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) F0.attributes.get(i13);
                                            } else {
                                                i13++;
                                            }
                                        } else {
                                            tL_documentAttributeAudio = null;
                                        }
                                    }
                                    if (tL_documentAttributeAudio != null) {
                                        obj3.f19245a = tL_documentAttributeAudio.performer;
                                        obj3.f19246b = tL_documentAttributeAudio.title;
                                        obj3.f19247c = (int) tL_documentAttributeAudio.duration;
                                        miVar.M.add(obj3);
                                    }
                                }
                            }
                        }
                    }
                    miVar.f28485k0 = messages_botresults.next_offset;
                    miVar.f28481g0 = !TextUtils.isEmpty(str);
                    miVar.S();
                    return;
                }
                return;
            default:
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                mi miVar2 = this.f25805b;
                ArrayList arrayList2 = miVar2.L;
                miVar2.U = -1;
                boolean z10 = false;
                miVar2.W = false;
                if (messages_messages != null) {
                    ArrayList<TLRPC.User> arrayList3 = messages_messages.users;
                    org.telegram.messenger.vp vpVar = this.f25806c;
                    vpVar.V3(arrayList3, false);
                    vpVar.P3(messages_messages.chats, false);
                    ArrayList<TLRPC.Message> arrayList4 = messages_messages.messages;
                    int size2 = arrayList4.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        TLRPC.Message message = arrayList4.get(i14);
                        i14++;
                        ?? obj4 = new Object();
                        org.telegram.messenger.jj jjVar2 = new org.telegram.messenger.jj(this.d, message, false, true);
                        obj4.e = jjVar2;
                        TLRPC.Document F02 = jjVar2.F0();
                        if (F02 != null) {
                            int i15 = 0;
                            while (true) {
                                if (i15 < F02.attributes.size()) {
                                    if (F02.attributes.get(i15) instanceof TLRPC.TL_documentAttributeAudio) {
                                        tL_documentAttributeAudio2 = (TLRPC.TL_documentAttributeAudio) F02.attributes.get(i15);
                                    } else {
                                        i15++;
                                    }
                                } else {
                                    tL_documentAttributeAudio2 = null;
                                }
                            }
                            if (tL_documentAttributeAudio2 != null) {
                                obj4.f19245a = tL_documentAttributeAudio2.performer;
                                obj4.f19246b = tL_documentAttributeAudio2.title;
                                obj4.f19247c = (int) tL_documentAttributeAudio2.duration;
                                arrayList2.add(obj4);
                            }
                        }
                    }
                    int i16 = messages_messages.next_rate;
                    miVar2.f28476b0 = i16;
                    if (i16 != 0 || (messages_messages.count > 0 && arrayList2.size() < messages_messages.count)) {
                        z10 = true;
                    }
                    miVar2.f28477c0 = z10;
                    miVar2.S();
                    return;
                }
                return;
        }
    }
}
