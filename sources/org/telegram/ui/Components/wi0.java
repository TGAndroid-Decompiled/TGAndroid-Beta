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
public final class wi0 extends FrameLayout {
    public ui0 D;
    public vi0 E;
    public vi0 F;
    public ti0 G;
    public final ArrayList H;
    public final ArrayList I;
    public da0 J;
    public final org.telegram.ui.ActionBar.p6 K;
    public int f32251a;
    public final int f32252b;
    public final org.telegram.messenger.kj f32253c;
    public final TLRPC.Reaction d;
    public final oi0 e;
    public final pi0 f32254f;
    public final ri0 h;
    public final ArrayList f32255n;
    public final LongSparseArray f32256r;
    public String f32257s;
    public boolean f32258w;
    public boolean f32259x;
    public boolean f32260y;

    public wi0(Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10, org.telegram.messenger.kj kjVar, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(context);
        TLRPC.Reaction reaction;
        int i11;
        int i12;
        this.f32255n = new ArrayList();
        this.f32256r = new LongSparseArray();
        this.f32260y = true;
        ArrayList arrayList = new ArrayList();
        this.H = arrayList;
        this.I = new ArrayList();
        this.f32252b = i10;
        this.f32253c = kjVar;
        if (reactionCount == null) {
            reaction = null;
        } else {
            reaction = reactionCount.reaction;
        }
        this.d = reaction;
        this.K = p6Var;
        if (reactionCount == null) {
            i11 = 6;
        } else {
            i11 = reactionCount.count;
        }
        this.f32251a = i11;
        oi0 oi0Var = new oi0(this, context, p6Var);
        this.e = oi0Var;
        s4.a0 a0Var = new s4.a0();
        oi0Var.setLayoutManager(a0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            oi0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21021i6, false)));
        }
        pi0 pi0Var = new pi0(this, i10, context, p6Var, z10);
        this.f32254f = pi0Var;
        oi0Var.setAdapter(pi0Var);
        oi0Var.setOnItemClickListener(new k(this, 10));
        oi0Var.setOnItemLongClickListener(new px(this, 15));
        oi0Var.j(new qi0(this, a0Var));
        oi0Var.setVerticalScrollBarEnabled(true);
        oi0Var.setAlpha(0.0f);
        addView(oi0Var, w7.b6.c(-1.0f, -1));
        ri0 ri0Var = new ri0(this, context, p6Var);
        this.h = ri0Var;
        ri0Var.e(org.telegram.ui.ActionBar.t6.G8, org.telegram.ui.ActionBar.t6.f21021i6, -1);
        ri0Var.setIsSingleCell(true);
        ri0Var.setItemsCount(this.f32251a);
        addView(ri0Var, w7.b6.c(-1.0f, -1));
        if (reaction != null && (reaction instanceof TLRPC.TL_reactionCustomEmoji) && !org.telegram.messenger.wp.r1(i10).A3()) {
            arrayList.clear();
            arrayList.add(sg.o0.d(reaction));
            i();
        }
        if (arrayList.isEmpty()) {
            i12 = 16;
        } else {
            i12 = 23;
        }
        ri0Var.setViewType(i12);
    }

    public static void a(wi0 wi0Var, TLObject tLObject) {
        ArrayList arrayList = wi0Var.H;
        LongSparseArray longSparseArray = wi0Var.f32256r;
        ArrayList arrayList2 = wi0Var.f32255n;
        int i10 = wi0Var.f32252b;
        if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
            TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
            org.telegram.messenger.wp.r1(i10).V3(tL_messages_messageReactionsList.users, false);
            org.telegram.messenger.wp.r1(i10).P3(tL_messages_messageReactionsList.chats, false);
            HashSet hashSet = new HashSet();
            for (int i11 = 0; i11 < tL_messages_messageReactionsList.reactions.size(); i11++) {
                arrayList2.add(tL_messages_messageReactionsList.reactions.get(i11));
                long C1 = org.telegram.messenger.kj.C1(tL_messages_messageReactionsList.reactions.get(i11).peer_id);
                ArrayList arrayList3 = (ArrayList) longSparseArray.get(C1);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                }
                int i12 = 0;
                while (i12 < arrayList3.size()) {
                    if (((TLRPC.MessagePeerReaction) arrayList3.get(i12)).reaction == null) {
                        arrayList3.remove(i12);
                        i12--;
                    }
                    i12++;
                }
                sg.o0 d = sg.o0.d(tL_messages_messageReactionsList.reactions.get(i11).reaction);
                if (d.f48446g != 0) {
                    hashSet.add(d);
                }
                arrayList3.add(tL_messages_messageReactionsList.reactions.get(i11));
                longSparseArray.put(C1, arrayList3);
            }
            if (wi0Var.d == null) {
                arrayList.clear();
                arrayList.addAll(hashSet);
                wi0Var.i();
            }
            Collections.sort(arrayList2, Comparator$CC.comparingInt(new bi.t6(12)));
            wi0Var.f32254f.f();
            if (!wi0Var.f32259x) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.setInterpolator(gr.f26523f);
                duration.addUpdateListener(new r60(wi0Var, 5));
                duration.addListener(new t60(wi0Var, 12));
                duration.start();
                wi0Var.j();
                wi0Var.f32259x = true;
            }
            String str = tL_messages_messageReactionsList.next_offset;
            wi0Var.f32257s = str;
            if (str == null) {
                wi0Var.f32260y = false;
            }
            wi0Var.f32258w = false;
            return;
        }
        wi0Var.f32258w = false;
    }

    public int getLoadCount() {
        if (this.d == null) {
            return 100;
        }
        return 50;
    }

    public final void c() {
        this.f32258w = true;
        int i10 = this.f32252b;
        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i10);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        org.telegram.messenger.kj kjVar = this.f32253c;
        tL_messages_getMessageReactionsList.peer = r12.i1(org.telegram.messenger.kj.B0(kjVar.f16690k));
        tL_messages_getMessageReactionsList.f19889id = kjVar.f1();
        tL_messages_getMessageReactionsList.limit = getLoadCount();
        TLRPC.Reaction reaction = this.d;
        tL_messages_getMessageReactionsList.reaction = reaction;
        String str = this.f32257s;
        tL_messages_getMessageReactionsList.offset = str;
        if (reaction != null) {
            tL_messages_getMessageReactionsList.flags = 1 | tL_messages_getMessageReactionsList.flags;
        }
        if (str != null) {
            tL_messages_getMessageReactionsList.flags |= 2;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReactionsList, new x1(this, 10), 64);
    }

    public final void d(org.telegram.ui.re reVar) {
        this.G = reVar;
    }

    public final void e(org.telegram.ui.a7 a7Var) {
        this.D = a7Var;
    }

    public final void f(org.telegram.ui.xf xfVar) {
        this.F = xfVar;
    }

    public final void g(org.telegram.ui.wf wfVar) {
        this.E = wfVar;
    }

    public final void h(List list) {
        ArrayList arrayList = this.f32255n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                li0 li0Var = (li0) it.next();
                TLObject tLObject = li0Var.f28176a;
                if (li0Var.f28178c > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i10);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && org.telegram.messenger.kj.C1(messagePeerReaction.peer_id) == li0Var.f28177b) {
                                messagePeerReaction.date = li0Var.f28178c;
                                messagePeerReaction.dateIsSeen = true;
                                break;
                            }
                            i10++;
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
            li0 li0Var2 = (li0) it2.next();
            long j10 = li0Var2.f28177b;
            TLObject tLObject2 = li0Var2.f28176a;
            LongSparseArray longSparseArray = this.f32256r;
            if (((ArrayList) longSparseArray.get(j10)) == null) {
                TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
                tL_messagePeerReaction.reaction = null;
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_messagePeerReaction.peer_id = tL_peerUser;
                    tL_peerUser.user_id = ((TLRPC.User) tLObject2).f19943id;
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    tL_messagePeerReaction.peer_id = tL_peerChat;
                    tL_peerChat.chat_id = ((TLRPC.Chat) tLObject2).f19794id;
                }
                tL_messagePeerReaction.date = li0Var2.f28178c;
                tL_messagePeerReaction.dateIsSeen = true;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(tL_messagePeerReaction);
                longSparseArray.put(org.telegram.messenger.kj.C1(tL_messagePeerReaction.peer_id), arrayList3);
                arrayList2.add(tL_messagePeerReaction);
            }
        }
        arrayList.isEmpty();
        arrayList.addAll(arrayList2);
        Collections.sort(arrayList, Comparator$CC.comparingInt(new bi.t6(11)));
        this.f32254f.f();
        j();
    }

    public final void i() {
        int i10;
        ArrayList arrayList = this.I;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        int i11 = 0;
        while (true) {
            ArrayList arrayList3 = this.H;
            int size = arrayList3.size();
            i10 = this.f32252b;
            if (i11 >= size) {
                break;
            }
            TLRPC.InputStickerSet j12 = org.telegram.messenger.kj.j1(f5.e(i10, ((sg.o0) arrayList3.get(i11)).f48446g));
            if (j12 != null && !hashSet.contains(Long.valueOf(j12.f19814id))) {
                arrayList2.add(j12);
                hashSet.add(Long.valueOf(j12.f19814id));
            }
            i11++;
        }
        if (org.telegram.messenger.wp.r1(i10).A3()) {
            return;
        }
        arrayList.addAll(arrayList2);
        da0 da0Var = new da0(this.f32252b, 1, getContext(), arrayList2, this.K);
        this.J = da0Var;
        da0Var.K = false;
    }

    public final void j() {
        if (this.D != null) {
            int size = this.f32255n.size();
            if (size == 0) {
                size = this.f32251a;
            }
            int L = org.telegram.messenger.i0.L(size * 50);
            da0 da0Var = this.J;
            if (da0Var != null) {
                L = org.telegram.messenger.m5.C(8.0f, da0Var.getMeasuredHeight(), L);
            }
            oi0 oi0Var = this.e;
            if (oi0Var.getMeasuredHeight() != 0) {
                L = Math.min(oi0Var.getMeasuredHeight(), L);
            }
            this.D.c(this, L);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f32259x && !this.f32258w) {
            c();
        }
    }

    public void setPredictiveCount(int i10) {
        this.f32251a = i10;
        this.h.setItemsCount(i10);
    }
}
