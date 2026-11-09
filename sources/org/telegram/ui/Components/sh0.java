package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.util.LongSparseArray;
import android.widget.FrameLayout;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sh0 extends FrameLayout {
    public qh0 D;
    public rh0 E;
    public rh0 F;
    public ph0 G;
    public final ArrayList H;
    public final ArrayList I;
    public m90 J;
    public final org.telegram.ui.ActionBar.g6 K;
    public int f38063a;
    public final int f38064b;
    public final org.telegram.messenger.ij f38065c;
    public final TLRPC.Reaction d;
    public final kh0 f38066e;
    public final lh0 f38067f;
    public final nh0 h;
    public final ArrayList f38068n;
    public final LongSparseArray f38069r;
    public String f38070s;
    public boolean f38071w;
    public boolean f38072x;
    public boolean f38073y;

    public sh0(Context context, org.telegram.ui.ActionBar.g6 g6Var, int i7, org.telegram.messenger.ij ijVar, TLRPC.ReactionCount reactionCount, boolean z9) {
        super(context);
        TLRPC.Reaction reaction;
        int i10;
        int i11;
        this.f38068n = new ArrayList();
        this.f38069r = new LongSparseArray();
        this.f38073y = true;
        ArrayList arrayList = new ArrayList();
        this.H = arrayList;
        this.I = new ArrayList();
        this.f38064b = i7;
        this.f38065c = ijVar;
        if (reactionCount == null) {
            reaction = null;
        } else {
            reaction = reactionCount.reaction;
        }
        this.d = reaction;
        this.K = g6Var;
        if (reactionCount == null) {
            i10 = 6;
        } else {
            i10 = reactionCount.count;
        }
        this.f38063a = i10;
        kh0 kh0Var = new kh0(this, context, g6Var);
        this.f38066e = kh0Var;
        v4.b0 b0Var = new v4.b0();
        kh0Var.setLayoutManager(b0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            kh0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27957i6, false)));
        }
        lh0 lh0Var = new lh0(this, i7, context, g6Var, z9);
        this.f38067f = lh0Var;
        kh0Var.setAdapter(lh0Var);
        kh0Var.setOnItemClickListener(new k(this, 10));
        kh0Var.setOnItemLongClickListener(new bx(this, 15));
        kh0Var.j(new mh0(this, b0Var));
        kh0Var.setVerticalScrollBarEnabled(true);
        kh0Var.setAlpha(0.0f);
        addView(kh0Var, c8.ha.c(-1.0f, -1));
        nh0 nh0Var = new nh0(this, context, g6Var);
        this.h = nh0Var;
        nh0Var.e(org.telegram.ui.ActionBar.l6.G8, org.telegram.ui.ActionBar.l6.f27957i6, -1);
        nh0Var.setIsSingleCell(true);
        nh0Var.setItemsCount(this.f38063a);
        addView(nh0Var, c8.ha.c(-1.0f, -1));
        if (reaction != null && (reaction instanceof TLRPC.TL_reactionCustomEmoji) && !org.telegram.messenger.qp.s1(i7).D3()) {
            arrayList.clear();
            arrayList.add(ch.o0.d(reaction));
            i();
        }
        if (arrayList.isEmpty()) {
            i11 = 16;
        } else {
            i11 = 23;
        }
        nh0Var.setViewType(i11);
    }

    public static void a(sh0 sh0Var, TLObject tLObject) {
        ArrayList arrayList = sh0Var.H;
        LongSparseArray longSparseArray = sh0Var.f38069r;
        ArrayList arrayList2 = sh0Var.f38068n;
        int i7 = sh0Var.f38064b;
        if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
            TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
            org.telegram.messenger.qp.s1(i7).Y3(tL_messages_messageReactionsList.users, false);
            org.telegram.messenger.qp.s1(i7).S3(tL_messages_messageReactionsList.chats, false);
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < tL_messages_messageReactionsList.reactions.size(); i10++) {
                arrayList2.add(tL_messages_messageReactionsList.reactions.get(i10));
                long B1 = org.telegram.messenger.ij.B1(tL_messages_messageReactionsList.reactions.get(i10).peer_id);
                ArrayList arrayList3 = (ArrayList) longSparseArray.get(B1);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                }
                int i11 = 0;
                while (i11 < arrayList3.size()) {
                    if (((TLRPC.MessagePeerReaction) arrayList3.get(i11)).reaction == null) {
                        arrayList3.remove(i11);
                        i11--;
                    }
                    i11++;
                }
                ch.o0 d = ch.o0.d(tL_messages_messageReactionsList.reactions.get(i10).reaction);
                if (d.f6355g != 0) {
                    hashSet.add(d);
                }
                arrayList3.add(tL_messages_messageReactionsList.reactions.get(i10));
                longSparseArray.put(B1, arrayList3);
            }
            if (sh0Var.d == null) {
                arrayList.clear();
                arrayList.addAll(hashSet);
                sh0Var.i();
            }
            Collections.sort(arrayList2, Comparator$CC.comparingInt(new bg.d(21)));
            sh0Var.f38067f.f();
            if (!sh0Var.f38072x) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.setInterpolator(xq.f40458f);
                duration.addUpdateListener(new d60(sh0Var, 4));
                duration.addListener(new f60(sh0Var, 12));
                duration.start();
                sh0Var.j();
                sh0Var.f38072x = true;
            }
            String str = tL_messages_messageReactionsList.next_offset;
            sh0Var.f38070s = str;
            if (str == null) {
                sh0Var.f38073y = false;
            }
            sh0Var.f38071w = false;
            return;
        }
        sh0Var.f38071w = false;
    }

    public int getLoadCount() {
        if (this.d == null) {
            return 100;
        }
        return 50;
    }

    public final void c() {
        this.f38071w = true;
        int i7 = this.f38064b;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        org.telegram.messenger.ij ijVar = this.f38065c;
        tL_messages_getMessageReactionsList.peer = s12.j1(org.telegram.messenger.ij.B0(ijVar.f23262k));
        tL_messages_getMessageReactionsList.f27051id = ijVar.e1();
        tL_messages_getMessageReactionsList.limit = getLoadCount();
        TLRPC.Reaction reaction = this.d;
        tL_messages_getMessageReactionsList.reaction = reaction;
        String str = this.f38070s;
        tL_messages_getMessageReactionsList.offset = str;
        if (reaction != null) {
            tL_messages_getMessageReactionsList.flags = 1 | tL_messages_getMessageReactionsList.flags;
        }
        if (str != null) {
            tL_messages_getMessageReactionsList.flags |= 2;
        }
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getMessageReactionsList, new x1(this, 10), 64);
    }

    public final void d(org.telegram.ui.fe feVar) {
        this.G = feVar;
    }

    public final void e(org.telegram.ui.a7 a7Var) {
        this.D = a7Var;
    }

    public final void f(org.telegram.ui.kf kfVar) {
        this.F = kfVar;
    }

    public final void g(org.telegram.ui.jf jfVar) {
        this.E = jfVar;
    }

    public final void h(List list) {
        ArrayList arrayList = this.f38068n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hh0 hh0Var = (hh0) it.next();
                TLObject tLObject = hh0Var.f34299a;
                if (hh0Var.f34301c > 0) {
                    int i7 = 0;
                    while (true) {
                        if (i7 < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i7);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && org.telegram.messenger.ij.B1(messagePeerReaction.peer_id) == hh0Var.f34300b) {
                                messagePeerReaction.date = hh0Var.f34301c;
                                messagePeerReaction.dateIsSeen = true;
                                break;
                            }
                            i7++;
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            hh0 hh0Var2 = (hh0) it2.next();
            long j3 = hh0Var2.f34300b;
            TLObject tLObject2 = hh0Var2.f34299a;
            LongSparseArray longSparseArray = this.f38069r;
            if (((ArrayList) longSparseArray.get(j3)) == null) {
                TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
                tL_messagePeerReaction.reaction = null;
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_messagePeerReaction.peer_id = tL_peerUser;
                    tL_peerUser.user_id = ((TLRPC.User) tLObject2).f27105id;
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    tL_messagePeerReaction.peer_id = tL_peerChat;
                    tL_peerChat.chat_id = ((TLRPC.Chat) tLObject2).f26956id;
                }
                tL_messagePeerReaction.date = hh0Var2.f34301c;
                tL_messagePeerReaction.dateIsSeen = true;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(tL_messagePeerReaction);
                longSparseArray.put(org.telegram.messenger.ij.B1(tL_messagePeerReaction.peer_id), arrayList3);
                arrayList2.add(tL_messagePeerReaction);
            }
        }
        arrayList.isEmpty();
        arrayList.addAll(arrayList2);
        Collections.sort(arrayList, Comparator$CC.comparingInt(new bg.d(20)));
        this.f38067f.f();
        j();
    }

    public final void i() {
        int i7;
        ArrayList arrayList = this.I;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList3 = this.H;
            int size = arrayList3.size();
            i7 = this.f38064b;
            if (i10 >= size) {
                break;
            }
            TLRPC.InputStickerSet i12 = org.telegram.messenger.ij.i1(i5.e(i7, ((ch.o0) arrayList3.get(i10)).f6355g));
            if (i12 != null && !hashSet.contains(Long.valueOf(i12.f26976id))) {
                arrayList2.add(i12);
                hashSet.add(Long.valueOf(i12.f26976id));
            }
            i10++;
        }
        if (org.telegram.messenger.qp.s1(i7).D3()) {
            return;
        }
        arrayList.addAll(arrayList2);
        m90 m90Var = new m90(this.f38064b, 1, getContext(), arrayList2, this.K);
        this.J = m90Var;
        m90Var.K = false;
    }

    public final void j() {
        if (this.D != null) {
            int size = this.f38068n.size();
            if (size == 0) {
                size = this.f38063a;
            }
            int L = org.telegram.messenger.g0.L(size * 50);
            m90 m90Var = this.J;
            if (m90Var != null) {
                L = org.telegram.messenger.k5.C(8.0f, m90Var.getMeasuredHeight(), L);
            }
            kh0 kh0Var = this.f38066e;
            if (kh0Var.getMeasuredHeight() != 0) {
                L = Math.min(kh0Var.getMeasuredHeight(), L);
            }
            this.D.b(this, L);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f38072x && !this.f38071w) {
            c();
        }
    }

    public void setPredictiveCount(int i7) {
        this.f38063a = i7;
        this.h.setItemsCount(i7);
    }
}
