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
public final class gi0 extends FrameLayout {
    public ei0 E;
    public fi0 F;
    public fi0 G;
    public di0 H;
    public final ArrayList I;
    public final ArrayList J;
    public x90 K;
    public final org.telegram.ui.ActionBar.i6 L;
    public int f35440a;
    public final int f35441b;
    public final org.telegram.messenger.fj f35442c;
    public final TLRPC.Reaction d;
    public final yh0 f35443e;
    public final zh0 f35444f;
    public final bi0 h;
    public final ArrayList f35445n;
    public final LongSparseArray f35446r;
    public String f35447s;
    public boolean f35448w;
    public boolean f35449x;
    public boolean f35450y;

    public gi0(Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7, org.telegram.messenger.fj fjVar, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(context);
        TLRPC.Reaction reaction;
        int i10;
        int i11;
        this.f35445n = new ArrayList();
        this.f35446r = new LongSparseArray();
        this.f35450y = true;
        ArrayList arrayList = new ArrayList();
        this.I = arrayList;
        this.J = new ArrayList();
        this.f35441b = i7;
        this.f35442c = fjVar;
        if (reactionCount == null) {
            reaction = null;
        } else {
            reaction = reactionCount.reaction;
        }
        this.d = reaction;
        this.L = i6Var;
        if (reactionCount == null) {
            i10 = 6;
        } else {
            i10 = reactionCount.count;
        }
        this.f35440a = i10;
        yh0 yh0Var = new yh0(this, context, i6Var);
        this.f35443e = yh0Var;
        v4.c0 c0Var = new v4.c0();
        yh0Var.setLayoutManager(c0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            yh0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29543i6, false)));
        }
        zh0 zh0Var = new zh0(this, i7, context, i6Var, z10);
        this.f35444f = zh0Var;
        yh0Var.setAdapter(zh0Var);
        yh0Var.setOnItemClickListener(new n(this, 10));
        yh0Var.setOnItemLongClickListener(new hy(this, 14));
        yh0Var.j(new ai0(this, c0Var));
        yh0Var.setVerticalScrollBarEnabled(true);
        yh0Var.setAlpha(0.0f);
        addView(yh0Var, c8.na.c(-1.0f, -1));
        bi0 bi0Var = new bi0(this, context, i6Var);
        this.h = bi0Var;
        bi0Var.e(org.telegram.ui.ActionBar.n6.G8, org.telegram.ui.ActionBar.n6.f29543i6, -1);
        bi0Var.setIsSingleCell(true);
        bi0Var.setItemsCount(this.f35440a);
        addView(bi0Var, c8.na.c(-1.0f, -1));
        if (reaction != null && (reaction instanceof TLRPC.TL_reactionCustomEmoji) && !org.telegram.messenger.mp.u1(i7).K3()) {
            arrayList.clear();
            arrayList.add(ch.p0.d(reaction));
            i();
        }
        if (arrayList.isEmpty()) {
            i11 = 16;
        } else {
            i11 = 23;
        }
        bi0Var.setViewType(i11);
    }

    public static void a(gi0 gi0Var, TLObject tLObject) {
        ArrayList arrayList = gi0Var.I;
        LongSparseArray longSparseArray = gi0Var.f35446r;
        ArrayList arrayList2 = gi0Var.f35445n;
        int i7 = gi0Var.f35441b;
        if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
            TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
            org.telegram.messenger.mp.u1(i7).f4(tL_messages_messageReactionsList.users, false);
            org.telegram.messenger.mp.u1(i7).Z3(tL_messages_messageReactionsList.chats, false);
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < tL_messages_messageReactionsList.reactions.size(); i10++) {
                arrayList2.add(tL_messages_messageReactionsList.reactions.get(i10));
                long B1 = org.telegram.messenger.fj.B1(tL_messages_messageReactionsList.reactions.get(i10).peer_id);
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
                ch.p0 d = ch.p0.d(tL_messages_messageReactionsList.reactions.get(i10).reaction);
                if (d.f5471g != 0) {
                    hashSet.add(d);
                }
                arrayList3.add(tL_messages_messageReactionsList.reactions.get(i10));
                longSparseArray.put(B1, arrayList3);
            }
            if (gi0Var.d == null) {
                arrayList.clear();
                arrayList.addAll(hashSet);
                gi0Var.i();
            }
            Collections.sort(arrayList2, Comparator$CC.comparingInt(new bg.d(21)));
            gi0Var.f35444f.f();
            if (!gi0Var.f35449x) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.setInterpolator(kr.f36858f);
                duration.addUpdateListener(new e60(gi0Var, 6));
                duration.addListener(new p60(gi0Var, 12));
                duration.start();
                gi0Var.j();
                gi0Var.f35449x = true;
            }
            String str = tL_messages_messageReactionsList.next_offset;
            gi0Var.f35447s = str;
            if (str == null) {
                gi0Var.f35450y = false;
            }
            gi0Var.f35448w = false;
            return;
        }
        gi0Var.f35448w = false;
    }

    public int getLoadCount() {
        if (this.d == null) {
            return 100;
        }
        return 50;
    }

    public final void c() {
        this.f35448w = true;
        int i7 = this.f35441b;
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        org.telegram.messenger.fj fjVar = this.f35442c;
        tL_messages_getMessageReactionsList.peer = u12.l1(org.telegram.messenger.fj.B0(fjVar.f24073k));
        tL_messages_getMessageReactionsList.f28587id = fjVar.e1();
        tL_messages_getMessageReactionsList.limit = getLoadCount();
        TLRPC.Reaction reaction = this.d;
        tL_messages_getMessageReactionsList.reaction = reaction;
        String str = this.f35447s;
        tL_messages_getMessageReactionsList.offset = str;
        if (reaction != null) {
            tL_messages_getMessageReactionsList.flags = 1 | tL_messages_getMessageReactionsList.flags;
        }
        if (str != null) {
            tL_messages_getMessageReactionsList.flags |= 2;
        }
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getMessageReactionsList, new e2(this, 10), 64);
    }

    public final void d(org.telegram.ui.ee eeVar) {
        this.H = eeVar;
    }

    public final void e(org.telegram.ui.a7 a7Var) {
        this.E = a7Var;
    }

    public final void f(org.telegram.ui.kf kfVar) {
        this.G = kfVar;
    }

    public final void g(org.telegram.ui.jf jfVar) {
        this.F = jfVar;
    }

    public final void h(List list) {
        ArrayList arrayList = this.f35445n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                vh0 vh0Var = (vh0) it.next();
                TLObject tLObject = vh0Var.f40703a;
                if (vh0Var.f40705c > 0) {
                    int i7 = 0;
                    while (true) {
                        if (i7 < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i7);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && org.telegram.messenger.fj.B1(messagePeerReaction.peer_id) == vh0Var.f40704b) {
                                messagePeerReaction.date = vh0Var.f40705c;
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
            vh0 vh0Var2 = (vh0) it2.next();
            long j3 = vh0Var2.f40704b;
            TLObject tLObject2 = vh0Var2.f40703a;
            LongSparseArray longSparseArray = this.f35446r;
            if (((ArrayList) longSparseArray.get(j3)) == null) {
                TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
                tL_messagePeerReaction.reaction = null;
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_messagePeerReaction.peer_id = tL_peerUser;
                    tL_peerUser.user_id = ((TLRPC.User) tLObject2).f28641id;
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    tL_messagePeerReaction.peer_id = tL_peerChat;
                    tL_peerChat.chat_id = ((TLRPC.Chat) tLObject2).f28492id;
                }
                tL_messagePeerReaction.date = vh0Var2.f40705c;
                tL_messagePeerReaction.dateIsSeen = true;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(tL_messagePeerReaction);
                longSparseArray.put(org.telegram.messenger.fj.B1(tL_messagePeerReaction.peer_id), arrayList3);
                arrayList2.add(tL_messagePeerReaction);
            }
        }
        arrayList.isEmpty();
        arrayList.addAll(arrayList2);
        Collections.sort(arrayList, Comparator$CC.comparingInt(new bg.d(20)));
        this.f35444f.f();
        j();
    }

    public final void i() {
        int i7;
        ArrayList arrayList = this.J;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList3 = this.I;
            int size = arrayList3.size();
            i7 = this.f35441b;
            if (i10 >= size) {
                break;
            }
            TLRPC.InputStickerSet i12 = org.telegram.messenger.fj.i1(o5.e(i7, ((ch.p0) arrayList3.get(i10)).f5471g));
            if (i12 != null && !hashSet.contains(Long.valueOf(i12.f28512id))) {
                arrayList2.add(i12);
                hashSet.add(Long.valueOf(i12.f28512id));
            }
            i10++;
        }
        if (org.telegram.messenger.mp.u1(i7).K3()) {
            return;
        }
        arrayList.addAll(arrayList2);
        x90 x90Var = new x90(this.f35441b, 1, getContext(), arrayList2, this.L);
        this.K = x90Var;
        x90Var.L = false;
    }

    public final void j() {
        if (this.E != null) {
            int size = this.f35445n.size();
            if (size == 0) {
                size = this.f35440a;
            }
            int L = org.telegram.messenger.g0.L(size * 50);
            x90 x90Var = this.K;
            if (x90Var != null) {
                L = org.telegram.messenger.f3.C(8.0f, x90Var.getMeasuredHeight(), L);
            }
            yh0 yh0Var = this.f35443e;
            if (yh0Var.getMeasuredHeight() != 0) {
                L = Math.min(yh0Var.getMeasuredHeight(), L);
            }
            this.E.b(this, L);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f35449x && !this.f35448w) {
            c();
        }
    }

    public void setPredictiveCount(int i7) {
        this.f35440a = i7;
        this.h.setItemsCount(i7);
    }
}
