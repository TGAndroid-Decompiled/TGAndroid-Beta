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
public final class ei0 extends FrameLayout {
    public ci0 E;
    public di0 F;
    public di0 G;
    public bi0 H;
    public final ArrayList I;
    public final ArrayList J;
    public y90 K;
    public final org.telegram.ui.ActionBar.i6 L;
    public int f34710a;
    public final int f34711b;
    public final org.telegram.messenger.fj f34712c;
    public final TLRPC.Reaction d;
    public final wh0 f34713e;
    public final xh0 f34714f;
    public final zh0 h;
    public final ArrayList f34715n;
    public final LongSparseArray f34716r;
    public String f34717s;
    public boolean f34718w;
    public boolean f34719x;
    public boolean f34720y;

    public ei0(Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7, org.telegram.messenger.fj fjVar, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(context);
        TLRPC.Reaction reaction;
        int i10;
        int i11;
        this.f34715n = new ArrayList();
        this.f34716r = new LongSparseArray();
        this.f34720y = true;
        ArrayList arrayList = new ArrayList();
        this.I = arrayList;
        this.J = new ArrayList();
        this.f34711b = i7;
        this.f34712c = fjVar;
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
        this.f34710a = i10;
        wh0 wh0Var = new wh0(this, context, i6Var);
        this.f34713e = wh0Var;
        v4.c0 c0Var = new v4.c0();
        wh0Var.setLayoutManager(c0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            wh0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29488i6, false)));
        }
        xh0 xh0Var = new xh0(this, i7, context, i6Var, z10);
        this.f34714f = xh0Var;
        wh0Var.setAdapter(xh0Var);
        wh0Var.setOnItemClickListener(new n(this, 10));
        wh0Var.setOnItemLongClickListener(new iy(this, 14));
        wh0Var.j(new yh0(this, c0Var));
        wh0Var.setVerticalScrollBarEnabled(true);
        wh0Var.setAlpha(0.0f);
        addView(wh0Var, c8.ma.c(-1.0f, -1));
        zh0 zh0Var = new zh0(this, context, i6Var);
        this.h = zh0Var;
        zh0Var.e(org.telegram.ui.ActionBar.n6.G8, org.telegram.ui.ActionBar.n6.f29488i6, -1);
        zh0Var.setIsSingleCell(true);
        zh0Var.setItemsCount(this.f34710a);
        addView(zh0Var, c8.ma.c(-1.0f, -1));
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
        zh0Var.setViewType(i11);
    }

    public static void a(ei0 ei0Var, TLObject tLObject) {
        ArrayList arrayList = ei0Var.I;
        LongSparseArray longSparseArray = ei0Var.f34716r;
        ArrayList arrayList2 = ei0Var.f34715n;
        int i7 = ei0Var.f34711b;
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
                if (d.f5479g != 0) {
                    hashSet.add(d);
                }
                arrayList3.add(tL_messages_messageReactionsList.reactions.get(i10));
                longSparseArray.put(B1, arrayList3);
            }
            if (ei0Var.d == null) {
                arrayList.clear();
                arrayList.addAll(hashSet);
                ei0Var.i();
            }
            Collections.sort(arrayList2, Comparator$CC.comparingInt(new bg.d(21)));
            ei0Var.f34714f.f();
            if (!ei0Var.f34719x) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.setInterpolator(lr.f37208f);
                duration.addUpdateListener(new e60(ei0Var, 6));
                duration.addListener(new q60(ei0Var, 12));
                duration.start();
                ei0Var.j();
                ei0Var.f34719x = true;
            }
            String str = tL_messages_messageReactionsList.next_offset;
            ei0Var.f34717s = str;
            if (str == null) {
                ei0Var.f34720y = false;
            }
            ei0Var.f34718w = false;
            return;
        }
        ei0Var.f34718w = false;
    }

    public int getLoadCount() {
        if (this.d == null) {
            return 100;
        }
        return 50;
    }

    public final void c() {
        this.f34718w = true;
        int i7 = this.f34711b;
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        org.telegram.messenger.fj fjVar = this.f34712c;
        tL_messages_getMessageReactionsList.peer = u12.l1(org.telegram.messenger.fj.B0(fjVar.f23968k));
        tL_messages_getMessageReactionsList.f28500id = fjVar.e1();
        tL_messages_getMessageReactionsList.limit = getLoadCount();
        TLRPC.Reaction reaction = this.d;
        tL_messages_getMessageReactionsList.reaction = reaction;
        String str = this.f34717s;
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

    public final void e(org.telegram.ui.z6 z6Var) {
        this.E = z6Var;
    }

    public final void f(org.telegram.ui.kf kfVar) {
        this.G = kfVar;
    }

    public final void g(org.telegram.ui.jf jfVar) {
        this.F = jfVar;
    }

    public final void h(List list) {
        ArrayList arrayList = this.f34715n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                th0 th0Var = (th0) it.next();
                TLObject tLObject = th0Var.f40004a;
                if (th0Var.f40006c > 0) {
                    int i7 = 0;
                    while (true) {
                        if (i7 < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i7);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && org.telegram.messenger.fj.B1(messagePeerReaction.peer_id) == th0Var.f40005b) {
                                messagePeerReaction.date = th0Var.f40006c;
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
            th0 th0Var2 = (th0) it2.next();
            long j3 = th0Var2.f40005b;
            TLObject tLObject2 = th0Var2.f40004a;
            LongSparseArray longSparseArray = this.f34716r;
            if (((ArrayList) longSparseArray.get(j3)) == null) {
                TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
                tL_messagePeerReaction.reaction = null;
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_messagePeerReaction.peer_id = tL_peerUser;
                    tL_peerUser.user_id = ((TLRPC.User) tLObject2).f28554id;
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    tL_messagePeerReaction.peer_id = tL_peerChat;
                    tL_peerChat.chat_id = ((TLRPC.Chat) tLObject2).f28405id;
                }
                tL_messagePeerReaction.date = th0Var2.f40006c;
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
        this.f34714f.f();
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
            i7 = this.f34711b;
            if (i10 >= size) {
                break;
            }
            TLRPC.InputStickerSet i12 = org.telegram.messenger.fj.i1(o5.e(i7, ((ch.p0) arrayList3.get(i10)).f5479g));
            if (i12 != null && !hashSet.contains(Long.valueOf(i12.f28425id))) {
                arrayList2.add(i12);
                hashSet.add(Long.valueOf(i12.f28425id));
            }
            i10++;
        }
        if (org.telegram.messenger.mp.u1(i7).K3()) {
            return;
        }
        arrayList.addAll(arrayList2);
        y90 y90Var = new y90(this.f34711b, 1, getContext(), arrayList2, this.L);
        this.K = y90Var;
        y90Var.L = false;
    }

    public final void j() {
        if (this.E != null) {
            int size = this.f34715n.size();
            if (size == 0) {
                size = this.f34710a;
            }
            int L = org.telegram.messenger.g0.L(size * 50);
            y90 y90Var = this.K;
            if (y90Var != null) {
                L = org.telegram.messenger.f3.C(8.0f, y90Var.getMeasuredHeight(), L);
            }
            wh0 wh0Var = this.f34713e;
            if (wh0Var.getMeasuredHeight() != 0) {
                L = Math.min(wh0Var.getMeasuredHeight(), L);
            }
            this.E.b(this, L);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f34719x && !this.f34718w) {
            c();
        }
    }

    public void setPredictiveCount(int i7) {
        this.f34710a = i7;
        this.h.setItemsCount(i7);
    }
}
