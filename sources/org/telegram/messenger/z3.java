package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.k21;
public final class z3 implements Runnable {
    public final int f26808a = 0;
    public final long f26809b;
    public final boolean f26810c;
    public final c1 d;
    public final Object f26811e;
    public final Object f26812f;
    public final Object h;

    public z3(d4 d4Var, TLObject tLObject, long j3, boolean z9, String str, Runnable runnable) {
        this.d = d4Var;
        this.f26811e = tLObject;
        this.f26809b = j3;
        this.f26810c = z9;
        this.f26812f = str;
        this.h = runnable;
    }

    @Override
    public final void run() {
        TLRPC.ChatFull N0;
        TLRPC.UserFull userFull;
        char c10;
        String str;
        TLRPC.WallPaper wallPaper = null;
        int i7 = 0;
        char c11 = 1;
        switch (this.f26808a) {
            case 0:
                d4 d4Var = (d4) this.d;
                TLObject tLObject = (TLObject) this.f26811e;
                long j3 = this.f26809b;
                boolean z9 = this.f26810c;
                String str2 = (String) this.f26812f;
                Runnable runnable = (Runnable) this.h;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    if (j3 >= 0) {
                        userFull = qp.s1(d4Var.currentAccount).b2(j3);
                        N0 = null;
                    } else {
                        N0 = qp.s1(d4Var.currentAccount).N0(-j3);
                        userFull = null;
                    }
                    if (userFull != null) {
                        wallPaper = userFull.wallpaper;
                    } else if (N0 != null) {
                        wallPaper = N0.wallpaper;
                    }
                    int i10 = 0;
                    while (true) {
                        if (i10 < updates.updates.size()) {
                            if (updates.updates.get(i10) instanceof TL_update.TL_updateNewMessage) {
                                TLRPC.MessageAction messageAction = ((TL_update.TL_updateNewMessage) updates.updates.get(i10)).message.action;
                                c10 = c11;
                                if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                                    if (z9) {
                                        TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = (TLRPC.TL_messageActionSetChatWallPaper) messageAction;
                                        tL_messageActionSetChatWallPaper.wallpaper.uploadingImage = str2;
                                        if (wallPaper != null && (str = wallPaper.uploadingImage) != null && str.equals(str2)) {
                                            tL_messageActionSetChatWallPaper.wallpaper.stripedThumb = wallPaper.stripedThumb;
                                        }
                                        if (userFull != null) {
                                            TLRPC.WallPaper wallPaper2 = tL_messageActionSetChatWallPaper.wallpaper;
                                            userFull.wallpaper = wallPaper2;
                                            userFull.flags |= 16777216;
                                            d4Var.r(j3, wallPaper2);
                                            d4Var.getMessagesStorage().j2(userFull, false);
                                            qs f10 = qs.f(d4Var.currentAccount);
                                            Object[] objArr = new Object[2];
                                            objArr[0] = Long.valueOf(j3);
                                            objArr[c10] = userFull;
                                            f10.k(67, objArr);
                                        } else if (N0 != null) {
                                            TLRPC.WallPaper wallPaper3 = tL_messageActionSetChatWallPaper.wallpaper;
                                            N0.wallpaper = wallPaper3;
                                            N0.flags2 |= 128;
                                            d4Var.r(j3, wallPaper3);
                                            d4Var.getMessagesStorage().N1(N0, false);
                                            qs f11 = qs.f(d4Var.currentAccount);
                                            Object[] objArr2 = new Object[4];
                                            objArr2[0] = N0;
                                            objArr2[c10] = 0;
                                            Boolean bool = Boolean.FALSE;
                                            objArr2[2] = bool;
                                            objArr2[3] = bool;
                                            f11.k(30, objArr2);
                                        }
                                    }
                                }
                            } else {
                                c10 = c11;
                            }
                            i10++;
                            c11 = c10;
                        }
                    }
                    qp.s1(d4Var.currentAccount).N3(updates.updates, updates.users, updates.chats, false, updates.date);
                    if (runnable != null) {
                        runnable.run();
                    }
                    qs.f(d4Var.currentAccount).k(323, new Object[0]);
                    return;
                }
                return;
            case 1:
                qp qpVar = (qp) this.d;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = (TLRPC.TL_channels_sendAsPeers) this.f26811e;
                a0.h hVar = (a0.h) this.f26812f;
                long j10 = this.f26809b;
                lp lpVar = (lp) this.h;
                boolean z10 = this.f26810c;
                if (tL_channels_sendAsPeers == null) {
                    hVar.l(j10);
                    return;
                }
                SystemClock.elapsedRealtime();
                lpVar.f23928a = tL_channels_sendAsPeers;
                qpVar.getNotificationCenter().k(16, Long.valueOf(j10), tL_channels_sendAsPeers, Boolean.valueOf(z10));
                return;
            case 2:
                k00 k00Var = (k00) this.d;
                TLObject tLObject2 = (TLObject) this.f26811e;
                boolean z11 = this.f26810c;
                long j11 = this.f26809b;
                HashSet hashSet = (HashSet) this.f26812f;
                Runnable runnable2 = (Runnable) this.h;
                if (tLObject2 != null && z11) {
                    a0.h hVar2 = new a0.h();
                    TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject2;
                    ArrayList l10 = qg.d.l(tL_messages_savedDialogs.dialogs);
                    while (i7 < tL_messages_savedDialogs.messages.size()) {
                        hVar2.k(tL_messages_savedDialogs.messages.get(i7), tL_messages_savedDialogs.messages.get(i7).f26981id);
                        i7++;
                    }
                    g0.h3(new fi(k00Var, tL_messages_savedDialogs, j11, l10, hVar2, hashSet, runnable2));
                    return;
                } else if (tLObject2 != null) {
                    a0.h hVar3 = new a0.h();
                    TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject2;
                    while (i7 < tL_messages_forumTopics.messages.size()) {
                        hVar3.k(tL_messages_forumTopics.messages.get(i7), tL_messages_forumTopics.messages.get(i7).f26981id);
                        i7++;
                    }
                    g0.h3(new bi.m3(k00Var, tLObject2, j11, tL_messages_forumTopics, hVar3, runnable2, 4));
                    return;
                } else {
                    return;
                }
            default:
                f10 f10Var = (f10) this.d;
                HashMap hashMap = (HashMap) this.f26811e;
                long j12 = this.f26809b;
                b10 b10Var = (b10) this.f26812f;
                boolean z12 = this.f26810c;
                HashSet hashSet2 = (HashSet) this.h;
                synchronized (f10Var) {
                    try {
                        ArrayList arrayList = (ArrayList) hashMap.get(Long.valueOf(j12));
                        if (arrayList != null) {
                            arrayList.remove(b10Var);
                            if (arrayList.isEmpty()) {
                                hashMap.remove(Long.valueOf(j12));
                            }
                        }
                    } finally {
                    }
                }
                String str3 = f10Var.getMessagesController().V6;
                if (!"alternative".equals(str3) && !"system".equals(str3)) {
                    TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
                    if (z12) {
                        tL_messages_translateText.flags |= 2;
                        tL_messages_translateText.text.addAll(b10Var.f21604c);
                    } else {
                        tL_messages_translateText.flags |= 1;
                        tL_messages_translateText.peer = f10Var.getMessagesController().j1(j12);
                        tL_messages_translateText.f27084id = b10Var.f21603b;
                    }
                    tL_messages_translateText.to_lang = f10.D(b10Var.f21605e);
                    int sendRequest = f10Var.getConnectionsManager().sendRequest(tL_messages_translateText, new y3(f10Var, b10Var, z12, j12, hashSet2, 4));
                    synchronized (f10Var) {
                        b10Var.h = sendRequest;
                    }
                    return;
                }
                String str4 = b10Var.f21605e;
                while (i7 < b10Var.f21603b.size()) {
                    String str5 = str4;
                    k21.J0(((TLRPC.TL_textWithEntities) b10Var.f21604c.get(i7)).text, null, str5, new r00(f10Var, (z10) b10Var.d.get(i7), z12, ((Integer) b10Var.f21603b.get(i7)).intValue(), str4, j12, 0));
                    i7++;
                    str4 = str5;
                }
                return;
        }
    }

    public z3(qp qpVar, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, a0.h hVar, long j3, lp lpVar, boolean z9) {
        this.d = qpVar;
        this.f26811e = tL_channels_sendAsPeers;
        this.f26812f = hVar;
        this.f26809b = j3;
        this.h = lpVar;
        this.f26810c = z9;
    }

    public z3(k00 k00Var, TLObject tLObject, boolean z9, long j3, HashSet hashSet, Runnable runnable) {
        this.d = k00Var;
        this.f26811e = tLObject;
        this.f26810c = z9;
        this.f26809b = j3;
        this.f26812f = hashSet;
        this.h = runnable;
    }

    public z3(f10 f10Var, HashMap hashMap, long j3, b10 b10Var, boolean z9, HashSet hashSet) {
        this.d = f10Var;
        this.f26811e = hashMap;
        this.f26809b = j3;
        this.f26812f = b10Var;
        this.f26810c = z9;
        this.h = hashSet;
    }
}
