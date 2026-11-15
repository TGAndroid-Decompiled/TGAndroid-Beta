package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.p21;
public final class z3 implements Runnable {
    public final int f27879a = 3;
    public final long f27880b;
    public final boolean f27881c;
    public final c1 d;
    public final Object f27882e;
    public final Object f27883f;
    public final Object h;

    public z3(d4 d4Var, TLObject tLObject, long j3, boolean z10, String str, Runnable runnable) {
        this.d = d4Var;
        this.f27882e = tLObject;
        this.f27880b = j3;
        this.f27881c = z10;
        this.f27883f = str;
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
        switch (this.f27879a) {
            case 0:
                d4 d4Var = (d4) this.d;
                TLObject tLObject = (TLObject) this.f27882e;
                long j3 = this.f27880b;
                boolean z10 = this.f27881c;
                String str2 = (String) this.f27883f;
                Runnable runnable = (Runnable) this.h;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    if (j3 >= 0) {
                        userFull = np.s1(d4Var.currentAccount).b2(j3);
                        N0 = null;
                    } else {
                        N0 = np.s1(d4Var.currentAccount).N0(-j3);
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
                                    if (z10) {
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
                                            ns f10 = ns.f(d4Var.currentAccount);
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
                                            ns f11 = ns.f(d4Var.currentAccount);
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
                    np.s1(d4Var.currentAccount).N3(updates.updates, updates.users, updates.chats, false, updates.date);
                    if (runnable != null) {
                        runnable.run();
                    }
                    ns.f(d4Var.currentAccount).k(323, new Object[0]);
                    return;
                }
                return;
            case 1:
                np npVar = (np) this.d;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = (TLRPC.TL_channels_sendAsPeers) this.f27882e;
                a0.h hVar = (a0.h) this.f27883f;
                long j10 = this.f27880b;
                ip ipVar = (ip) this.h;
                boolean z11 = this.f27881c;
                if (tL_channels_sendAsPeers == null) {
                    hVar.l(j10);
                    return;
                }
                SystemClock.elapsedRealtime();
                ipVar.f24427a = tL_channels_sendAsPeers;
                npVar.getNotificationCenter().k(16, Long.valueOf(j10), tL_channels_sendAsPeers, Boolean.valueOf(z11));
                return;
            case 2:
                h00 h00Var = (h00) this.d;
                TLObject tLObject2 = (TLObject) this.f27882e;
                boolean z12 = this.f27881c;
                long j11 = this.f27880b;
                HashSet hashSet = (HashSet) this.f27883f;
                Runnable runnable2 = (Runnable) this.h;
                if (tLObject2 != null && z12) {
                    a0.h hVar2 = new a0.h();
                    TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject2;
                    ArrayList l10 = qg.c.l(tL_messages_savedDialogs.dialogs);
                    while (i7 < tL_messages_savedDialogs.messages.size()) {
                        hVar2.k(tL_messages_savedDialogs.messages.get(i7), tL_messages_savedDialogs.messages.get(i7).f28072id);
                        i7++;
                    }
                    g0.h3(new di(h00Var, tL_messages_savedDialogs, j11, l10, hVar2, hashSet, runnable2));
                    return;
                } else if (tLObject2 != null) {
                    a0.h hVar3 = new a0.h();
                    TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject2;
                    while (i7 < tL_messages_forumTopics.messages.size()) {
                        hVar3.k(tL_messages_forumTopics.messages.get(i7), tL_messages_forumTopics.messages.get(i7).f28072id);
                        i7++;
                    }
                    g0.h3(new ai.e(h00Var, tLObject2, j11, tL_messages_forumTopics, hVar3, runnable2, 5));
                    return;
                } else {
                    return;
                }
            default:
                c10 c10Var = (c10) this.d;
                HashMap hashMap = (HashMap) this.f27882e;
                long j12 = this.f27880b;
                y00 y00Var = (y00) this.f27883f;
                boolean z13 = this.f27881c;
                HashSet hashSet2 = (HashSet) this.h;
                synchronized (c10Var) {
                    try {
                        ArrayList arrayList = (ArrayList) hashMap.get(Long.valueOf(j12));
                        if (arrayList != null) {
                            arrayList.remove(y00Var);
                            if (arrayList.isEmpty()) {
                                hashMap.remove(Long.valueOf(j12));
                            }
                        }
                    } finally {
                    }
                }
                String str3 = c10Var.getMessagesController().W6;
                if (!"alternative".equals(str3) && !"system".equals(str3)) {
                    TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
                    if (z13) {
                        tL_messages_translateText.flags |= 2;
                        tL_messages_translateText.text.addAll(y00Var.f27639c);
                    } else {
                        tL_messages_translateText.flags |= 1;
                        tL_messages_translateText.peer = c10Var.getMessagesController().j1(j12);
                        tL_messages_translateText.f28175id = y00Var.f27638b;
                    }
                    tL_messages_translateText.to_lang = c10.D(y00Var.f27640e);
                    int sendRequest = c10Var.getConnectionsManager().sendRequest(tL_messages_translateText, new y3(c10Var, y00Var, z13, j12, hashSet2, 4));
                    synchronized (c10Var) {
                        y00Var.h = sendRequest;
                    }
                    return;
                }
                String str4 = y00Var.f27640e;
                while (i7 < y00Var.f27638b.size()) {
                    String str5 = str4;
                    p21.J0(((TLRPC.TL_textWithEntities) y00Var.f27639c.get(i7)).text, null, str5, new o00(c10Var, (w10) y00Var.d.get(i7), z13, ((Integer) y00Var.f27638b.get(i7)).intValue(), str4, j12, 0));
                    i7++;
                    str4 = str5;
                }
                return;
        }
    }

    public z3(np npVar, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, a0.h hVar, long j3, ip ipVar, boolean z10) {
        this.d = npVar;
        this.f27882e = tL_channels_sendAsPeers;
        this.f27883f = hVar;
        this.f27880b = j3;
        this.h = ipVar;
        this.f27881c = z10;
    }

    public z3(h00 h00Var, TLObject tLObject, boolean z10, long j3, HashSet hashSet, Runnable runnable) {
        this.d = h00Var;
        this.f27882e = tLObject;
        this.f27881c = z10;
        this.f27880b = j3;
        this.f27883f = hashSet;
        this.h = runnable;
    }

    public z3(c10 c10Var, HashMap hashMap, long j3, y00 y00Var, boolean z10, HashSet hashSet) {
        this.d = c10Var;
        this.f27882e = hashMap;
        this.f27880b = j3;
        this.f27883f = y00Var;
        this.f27881c = z10;
        this.h = hashSet;
    }
}
