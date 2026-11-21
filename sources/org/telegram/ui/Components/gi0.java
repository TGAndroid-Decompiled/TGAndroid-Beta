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
    public aa0 K;
    public final org.telegram.ui.ActionBar.h6 L;
    public int f35561a;
    public final int f35562b;
    public final org.telegram.messenger.fj f35563c;
    public final TLRPC.Reaction d;
    public final yh0 f35564e;
    public final zh0 f35565f;
    public final bi0 h;
    public final ArrayList f35566n;
    public final LongSparseArray f35567r;
    public String f35568s;
    public boolean f35569w;
    public boolean f35570x;
    public boolean f35571y;

    public gi0(Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7, org.telegram.messenger.fj fjVar, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(context);
        TLRPC.Reaction reaction;
        int i10;
        int i11;
        this.f35566n = new ArrayList();
        this.f35567r = new LongSparseArray();
        this.f35571y = true;
        ArrayList arrayList = new ArrayList();
        this.I = arrayList;
        this.J = new ArrayList();
        this.f35562b = i7;
        this.f35563c = fjVar;
        if (reactionCount == null) {
            reaction = null;
        } else {
            reaction = reactionCount.reaction;
        }
        this.d = reaction;
        this.L = h6Var;
        if (reactionCount == null) {
            i10 = 6;
        } else {
            i10 = reactionCount.count;
        }
        this.f35561a = i10;
        yh0 yh0Var = new yh0(this, context, h6Var);
        this.f35564e = yh0Var;
        v4.c0 c0Var = new v4.c0();
        yh0Var.setLayoutManager(c0Var);
        if (Build.VERSION.SDK_INT >= 29) {
            yh0Var.setVerticalScrollbarThumbDrawable(new ColorDrawable(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29470i6, false)));
        }
        zh0 zh0Var = new zh0(this, i7, context, h6Var, z10);
        this.f35565f = zh0Var;
        yh0Var.setAdapter(zh0Var);
        yh0Var.setOnItemClickListener(new o(this, 10));
        yh0Var.setOnItemLongClickListener(new ky(this, 14));
        yh0Var.j(new ai0(this, c0Var));
        yh0Var.setVerticalScrollBarEnabled(true);
        yh0Var.setAlpha(0.0f);
        addView(yh0Var, c8.ma.c(-1.0f, -1));
        bi0 bi0Var = new bi0(this, context, h6Var);
        this.h = bi0Var;
        bi0Var.e(org.telegram.ui.ActionBar.m6.G8, org.telegram.ui.ActionBar.m6.f29470i6, -1);
        bi0Var.setIsSingleCell(true);
        bi0Var.setItemsCount(this.f35561a);
        addView(bi0Var, c8.ma.c(-1.0f, -1));
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
        LongSparseArray longSparseArray = gi0Var.f35567r;
        ArrayList arrayList2 = gi0Var.f35566n;
        int i7 = gi0Var.f35562b;
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
                if (d.f5505g != 0) {
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
            gi0Var.f35565f.f();
            if (!gi0Var.f35570x) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.setInterpolator(nr.f37956f);
                duration.addUpdateListener(new h60(gi0Var, 6));
                duration.addListener(new s60(gi0Var, 12));
                duration.start();
                gi0Var.j();
                gi0Var.f35570x = true;
            }
            String str = tL_messages_messageReactionsList.next_offset;
            gi0Var.f35568s = str;
            if (str == null) {
                gi0Var.f35571y = false;
            }
            gi0Var.f35569w = false;
            return;
        }
        gi0Var.f35569w = false;
    }

    public int getLoadCount() {
        if (this.d == null) {
            return 100;
        }
        return 50;
    }

    public final void c() {
        this.f35569w = true;
        int i7 = this.f35562b;
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        org.telegram.messenger.fj fjVar = this.f35563c;
        tL_messages_getMessageReactionsList.peer = u12.l1(org.telegram.messenger.fj.B0(fjVar.f23993k));
        tL_messages_getMessageReactionsList.f28526id = fjVar.e1();
        tL_messages_getMessageReactionsList.limit = getLoadCount();
        TLRPC.Reaction reaction = this.d;
        tL_messages_getMessageReactionsList.reaction = reaction;
        String str = this.f35568s;
        tL_messages_getMessageReactionsList.offset = str;
        if (reaction != null) {
            tL_messages_getMessageReactionsList.flags = 1 | tL_messages_getMessageReactionsList.flags;
        }
        if (str != null) {
            tL_messages_getMessageReactionsList.flags |= 2;
        }
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getMessageReactionsList, new f2(this, 10), 64);
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
        ArrayList arrayList = this.f35566n;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                vh0 vh0Var = (vh0) it.next();
                TLObject tLObject = vh0Var.f40830a;
                if (vh0Var.f40832c > 0) {
                    int i7 = 0;
                    while (true) {
                        if (i7 < arrayList.size()) {
                            TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) arrayList.get(i7);
                            if (messagePeerReaction != null && messagePeerReaction.date <= 0 && org.telegram.messenger.fj.B1(messagePeerReaction.peer_id) == vh0Var.f40831b) {
                                messagePeerReaction.date = vh0Var.f40832c;
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
            long j3 = vh0Var2.f40831b;
            TLObject tLObject2 = vh0Var2.f40830a;
            LongSparseArray longSparseArray = this.f35567r;
            if (((ArrayList) longSparseArray.get(j3)) == null) {
                TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
                tL_messagePeerReaction.reaction = null;
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_messagePeerReaction.peer_id = tL_peerUser;
                    tL_peerUser.user_id = ((TLRPC.User) tLObject2).f28580id;
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    tL_messagePeerReaction.peer_id = tL_peerChat;
                    tL_peerChat.chat_id = ((TLRPC.Chat) tLObject2).f28431id;
                }
                tL_messagePeerReaction.date = vh0Var2.f40832c;
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
        this.f35565f.f();
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
            i7 = this.f35562b;
            if (i10 >= size) {
                break;
            }
            TLRPC.InputStickerSet i12 = org.telegram.messenger.fj.i1(p5.e(i7, ((ch.p0) arrayList3.get(i10)).f5505g));
            if (i12 != null && !hashSet.contains(Long.valueOf(i12.f28451id))) {
                arrayList2.add(i12);
                hashSet.add(Long.valueOf(i12.f28451id));
            }
            i10++;
        }
        if (org.telegram.messenger.mp.u1(i7).K3()) {
            return;
        }
        arrayList.addAll(arrayList2);
        aa0 aa0Var = new aa0(this.f35562b, 1, getContext(), arrayList2, this.L);
        this.K = aa0Var;
        aa0Var.L = false;
    }

    public final void j() {
        if (this.E != null) {
            int size = this.f35566n.size();
            if (size == 0) {
                size = this.f35561a;
            }
            int L = org.telegram.messenger.g0.L(size * 50);
            aa0 aa0Var = this.K;
            if (aa0Var != null) {
                L = org.telegram.messenger.f3.C(8.0f, aa0Var.getMeasuredHeight(), L);
            }
            yh0 yh0Var = this.f35564e;
            if (yh0Var.getMeasuredHeight() != 0) {
                L = Math.min(yh0Var.getMeasuredHeight(), L);
            }
            this.E.b(this, L);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f35570x && !this.f35569w) {
            c();
        }
    }

    public void setPredictiveCount(int i7) {
        this.f35561a = i7;
        this.h.setItemsCount(i7);
    }
}
