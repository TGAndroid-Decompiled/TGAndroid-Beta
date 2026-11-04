package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.f21;
public final class z3 implements Runnable {
    public final int f26728a = 2;
    public final long f26729b;
    public final boolean f26730c;
    public final c1 d;
    public final Object f26731e;
    public final Object f26732f;
    public final Object h;

    public z3(d4 d4Var, TLObject tLObject, long j10, boolean z10, String str, Runnable runnable) {
        this.d = d4Var;
        this.f26731e = tLObject;
        this.f26729b = j10;
        this.f26730c = z10;
        this.f26732f = str;
        this.h = runnable;
    }

    @Override
    public final void run() {
        TLRPC.ChatFull N0;
        TLRPC.UserFull userFull;
        char c2;
        String str;
        TLRPC.WallPaper wallPaper = null;
        int i3 = 0;
        char c10 = 1;
        switch (this.f26728a) {
            case 0:
                d4 d4Var = (d4) this.d;
                TLObject tLObject = (TLObject) this.f26731e;
                long j10 = this.f26729b;
                boolean z10 = this.f26730c;
                String str2 = (String) this.f26732f;
                Runnable runnable = (Runnable) this.h;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    if (j10 >= 0) {
                        userFull = hp.s1(d4Var.currentAccount).b2(j10);
                        N0 = null;
                    } else {
                        N0 = hp.s1(d4Var.currentAccount).N0(-j10);
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
                                c2 = c10;
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
                                            d4Var.r(j10, wallPaper2);
                                            d4Var.getMessagesStorage().j2(userFull, false);
                                            hs f10 = hs.f(d4Var.currentAccount);
                                            Object[] objArr = new Object[2];
                                            objArr[0] = Long.valueOf(j10);
                                            objArr[c2] = userFull;
                                            f10.k(67, objArr);
                                        } else if (N0 != null) {
                                            TLRPC.WallPaper wallPaper3 = tL_messageActionSetChatWallPaper.wallpaper;
                                            N0.wallpaper = wallPaper3;
                                            N0.flags2 |= 128;
                                            d4Var.r(j10, wallPaper3);
                                            d4Var.getMessagesStorage().N1(N0, false);
                                            hs f11 = hs.f(d4Var.currentAccount);
                                            Object[] objArr2 = new Object[4];
                                            objArr2[0] = N0;
                                            objArr2[c2] = 0;
                                            Boolean bool = Boolean.FALSE;
                                            objArr2[2] = bool;
                                            objArr2[3] = bool;
                                            f11.k(30, objArr2);
                                        }
                                    }
                                }
                            } else {
                                c2 = c10;
                            }
                            i10++;
                            c10 = c2;
                        }
                    }
                    hp.s1(d4Var.currentAccount).N3(updates.updates, updates.users, updates.chats, false, updates.date);
                    if (runnable != null) {
                        runnable.run();
                    }
                    hs.f(d4Var.currentAccount).k(323, new Object[0]);
                    return;
                }
                return;
            case 1:
                hp hpVar = (hp) this.d;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = (TLRPC.TL_channels_sendAsPeers) this.f26731e;
                a0.h hVar = (a0.h) this.f26732f;
                long j11 = this.f26729b;
                cp cpVar = (cp) this.h;
                boolean z11 = this.f26730c;
                if (tL_channels_sendAsPeers == null) {
                    hVar.l(j11);
                    return;
                }
                SystemClock.elapsedRealtime();
                cpVar.f22051a = tL_channels_sendAsPeers;
                hpVar.getNotificationCenter().k(16, Long.valueOf(j11), tL_channels_sendAsPeers, Boolean.valueOf(z11));
                return;
            case 2:
                c00 c00Var = (c00) this.d;
                TLObject tLObject2 = (TLObject) this.f26731e;
                boolean z12 = this.f26730c;
                long j12 = this.f26729b;
                HashSet hashSet = (HashSet) this.f26732f;
                Runnable runnable2 = (Runnable) this.h;
                if (tLObject2 != null && z12) {
                    a0.h hVar2 = new a0.h();
                    TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject2;
                    ArrayList l10 = rg.c.l(tL_messages_savedDialogs.dialogs);
                    while (i3 < tL_messages_savedDialogs.messages.size()) {
                        hVar2.k(tL_messages_savedDialogs.messages.get(i3), tL_messages_savedDialogs.messages.get(i3).f27022id);
                        i3++;
                    }
                    g0.h3(new wh(c00Var, tL_messages_savedDialogs, j12, l10, hVar2, hashSet, runnable2));
                    return;
                } else if (tLObject2 != null) {
                    a0.h hVar3 = new a0.h();
                    TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject2;
                    while (i3 < tL_messages_forumTopics.messages.size()) {
                        hVar3.k(tL_messages_forumTopics.messages.get(i3), tL_messages_forumTopics.messages.get(i3).f27022id);
                        i3++;
                    }
                    g0.h3(new ci.z2(c00Var, tLObject2, j12, tL_messages_forumTopics, hVar3, runnable2, 4));
                    return;
                } else {
                    return;
                }
            default:
                x00 x00Var = (x00) this.d;
                HashMap hashMap = (HashMap) this.f26731e;
                long j13 = this.f26729b;
                t00 t00Var = (t00) this.f26732f;
                boolean z13 = this.f26730c;
                HashSet hashSet2 = (HashSet) this.h;
                synchronized (x00Var) {
                    try {
                        ArrayList arrayList = (ArrayList) hashMap.get(Long.valueOf(j13));
                        if (arrayList != null) {
                            arrayList.remove(t00Var);
                            if (arrayList.isEmpty()) {
                                hashMap.remove(Long.valueOf(j13));
                            }
                        }
                    } finally {
                    }
                }
                String str3 = x00Var.getMessagesController().V6;
                if (!"alternative".equals(str3) && !"system".equals(str3)) {
                    TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
                    if (z13) {
                        tL_messages_translateText.flags |= 2;
                        tL_messages_translateText.text.addAll(t00Var.f25469c);
                    } else {
                        tL_messages_translateText.flags |= 1;
                        tL_messages_translateText.peer = x00Var.getMessagesController().j1(j13);
                        tL_messages_translateText.f27125id = t00Var.f25468b;
                    }
                    tL_messages_translateText.to_lang = x00.D(t00Var.f25470e);
                    int sendRequest = x00Var.getConnectionsManager().sendRequest(tL_messages_translateText, new y3(x00Var, t00Var, z13, j13, hashSet2, 4));
                    synchronized (x00Var) {
                        t00Var.h = sendRequest;
                    }
                    return;
                }
                String str4 = t00Var.f25470e;
                while (i3 < t00Var.f25468b.size()) {
                    String str5 = str4;
                    f21.J0(((TLRPC.TL_textWithEntities) t00Var.f25469c.get(i3)).text, null, str5, new j00(x00Var, (r10) t00Var.d.get(i3), z13, ((Integer) t00Var.f25468b.get(i3)).intValue(), str4, j13, 0));
                    i3++;
                    str4 = str5;
                }
                return;
        }
    }

    public z3(hp hpVar, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, a0.h hVar, long j10, cp cpVar, boolean z10) {
        this.d = hpVar;
        this.f26731e = tL_channels_sendAsPeers;
        this.f26732f = hVar;
        this.f26729b = j10;
        this.h = cpVar;
        this.f26730c = z10;
    }

    public z3(c00 c00Var, TLObject tLObject, boolean z10, long j10, HashSet hashSet, Runnable runnable) {
        this.d = c00Var;
        this.f26731e = tLObject;
        this.f26730c = z10;
        this.f26729b = j10;
        this.f26732f = hashSet;
        this.h = runnable;
    }

    public z3(x00 x00Var, HashMap hashMap, long j10, t00 t00Var, boolean z10, HashSet hashSet) {
        this.d = x00Var;
        this.f26731e = hashMap;
        this.f26729b = j10;
        this.f26732f = t00Var;
        this.f26730c = z10;
        this.h = hashSet;
    }
}
