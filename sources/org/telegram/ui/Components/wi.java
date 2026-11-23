package org.telegram.ui.Components;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class wi implements org.telegram.messenger.p10 {
    public final int f41666a;
    public final dj f41667b;
    public final org.telegram.messenger.mp f41668c;
    public final int d;

    public wi(dj djVar, org.telegram.messenger.mp mpVar, int i7, int i10) {
        this.f41666a = i10;
        this.f41667b = djVar;
        this.f41668c = mpVar;
        this.d = i7;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2;
        switch (this.f41666a) {
            case 0:
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                dj djVar = this.f41667b;
                djVar.f34355e0 = -1;
                djVar.f34364n0 = false;
                if (messages_botresults != null) {
                    this.f41668c.f4(messages_botresults.users, false);
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
                                int i10 = djVar.m0;
                                djVar.m0 = i10 - 1;
                                tL_message.f28513id = i10;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                int i11 = this.d;
                                long e10 = org.telegram.messenger.i10.i(i11).e();
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
                                org.telegram.messenger.fj fjVar = new org.telegram.messenger.fj(i11, tL_message, false, true);
                                obj3.f27454e = fjVar;
                                TLRPC.Document F0 = fjVar.F0();
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
                                        obj3.f27451a = tL_documentAttributeAudio.performer;
                                        obj3.f27452b = tL_documentAttributeAudio.title;
                                        obj3.f27453c = (int) tL_documentAttributeAudio.duration;
                                        djVar.N.add(obj3);
                                    }
                                }
                            }
                        }
                    }
                    djVar.f34362l0 = messages_botresults.next_offset;
                    djVar.f34358h0 = !TextUtils.isEmpty(str);
                    djVar.U();
                    return;
                }
                return;
            default:
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                dj djVar2 = this.f41667b;
                ArrayList arrayList2 = djVar2.M;
                djVar2.V = -1;
                boolean z10 = false;
                djVar2.f34351a0 = false;
                if (messages_messages != null) {
                    ArrayList<TLRPC.User> arrayList3 = messages_messages.users;
                    org.telegram.messenger.mp mpVar = this.f41668c;
                    mpVar.f4(arrayList3, false);
                    mpVar.Z3(messages_messages.chats, false);
                    ArrayList<TLRPC.Message> arrayList4 = messages_messages.messages;
                    int size2 = arrayList4.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        TLRPC.Message message = arrayList4.get(i13);
                        i13++;
                        ?? obj4 = new Object();
                        org.telegram.messenger.fj fjVar2 = new org.telegram.messenger.fj(this.d, message, false, true);
                        obj4.f27454e = fjVar2;
                        TLRPC.Document F02 = fjVar2.F0();
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
                                obj4.f27451a = tL_documentAttributeAudio2.performer;
                                obj4.f27452b = tL_documentAttributeAudio2.title;
                                obj4.f27453c = (int) tL_documentAttributeAudio2.duration;
                                arrayList2.add(obj4);
                            }
                        }
                    }
                    int i15 = messages_messages.next_rate;
                    djVar2.f34353c0 = i15;
                    if (i15 != 0 || (messages_messages.count > 0 && arrayList2.size() < messages_messages.count)) {
                        z10 = true;
                    }
                    djVar2.f34354d0 = z10;
                    djVar2.U();
                    return;
                }
                return;
        }
    }
}
