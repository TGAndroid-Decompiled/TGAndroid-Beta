package org.telegram.ui.Components;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gi implements org.telegram.messenger.v10 {
    public final int f33964a;
    public final ni f33965b;
    public final org.telegram.messenger.qp f33966c;
    public final int d;

    public gi(ni niVar, org.telegram.messenger.qp qpVar, int i7, int i10) {
        this.f33964a = i10;
        this.f33965b = niVar;
        this.f33966c = qpVar;
        this.d = i7;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2;
        switch (this.f33964a) {
            case 0:
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ni niVar = this.f33965b;
                niVar.f36404d0 = -1;
                niVar.m0 = false;
                if (messages_botresults != null) {
                    this.f33966c.Y3(messages_botresults.users, false);
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
                                int i10 = niVar.f36412l0;
                                niVar.f36412l0 = i10 - 1;
                                tL_message.f26973id = i10;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                int i11 = this.d;
                                long e10 = org.telegram.messenger.p10.i(i11).e();
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
                                org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(i11, tL_message, false, true);
                                obj3.f26457e = ijVar;
                                TLRPC.Document F0 = ijVar.F0();
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
                                        obj3.f26454a = tL_documentAttributeAudio.performer;
                                        obj3.f26455b = tL_documentAttributeAudio.title;
                                        obj3.f26456c = (int) tL_documentAttributeAudio.duration;
                                        niVar.M.add(obj3);
                                    }
                                }
                            }
                        }
                    }
                    niVar.f36411k0 = messages_botresults.next_offset;
                    niVar.f36407g0 = !TextUtils.isEmpty(str);
                    niVar.T();
                    return;
                }
                return;
            default:
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ni niVar2 = this.f33965b;
                ArrayList arrayList2 = niVar2.L;
                niVar2.U = -1;
                boolean z9 = false;
                niVar2.W = false;
                if (messages_messages != null) {
                    ArrayList<TLRPC.User> arrayList3 = messages_messages.users;
                    org.telegram.messenger.qp qpVar = this.f33966c;
                    qpVar.Y3(arrayList3, false);
                    qpVar.S3(messages_messages.chats, false);
                    ArrayList<TLRPC.Message> arrayList4 = messages_messages.messages;
                    int size2 = arrayList4.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        TLRPC.Message message = arrayList4.get(i13);
                        i13++;
                        ?? obj4 = new Object();
                        org.telegram.messenger.ij ijVar2 = new org.telegram.messenger.ij(this.d, message, false, true);
                        obj4.f26457e = ijVar2;
                        TLRPC.Document F02 = ijVar2.F0();
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
                                obj4.f26454a = tL_documentAttributeAudio2.performer;
                                obj4.f26455b = tL_documentAttributeAudio2.title;
                                obj4.f26456c = (int) tL_documentAttributeAudio2.duration;
                                arrayList2.add(obj4);
                            }
                        }
                    }
                    int i15 = messages_messages.next_rate;
                    niVar2.f36402b0 = i15;
                    if (i15 != 0 || (messages_messages.count > 0 && arrayList2.size() < messages_messages.count)) {
                        z9 = true;
                    }
                    niVar2.f36403c0 = z9;
                    niVar2.T();
                    return;
                }
                return;
        }
    }
}
