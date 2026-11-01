package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
public class qh0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public boolean D;
    public boolean E;
    public boolean F;
    public String G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public final a0.g R;
    public org.telegram.ui.Components.fi0 S;
    public LinearLayout T;
    public int U;
    public boolean V;
    public ImageReceiver W;
    public boolean X;
    public boolean Y;
    public final m4 Z;
    public TLRPC.ChatFull f40780a;
    public FrameLayout f40781a0;
    public final long f40782b;
    public mh0 f40783b0;
    public final int f40784c;
    public bg.h f40785c0;
    public oh0 d;
    public final boolean f40786d0;
    public org.telegram.ui.Components.xy e;
    public p61 f40787e0;
    public org.telegram.ui.Components.uk0 f40788f;
    public s4.a0 h;
    public final org.telegram.messenger.kj f40789n;
    public e61 f40790r;
    public e61 f40791s;
    public final e2.j0 f40792w;
    public r61 f40793x;
    public final ArrayList f40794y;

    public qh0(long j10, org.telegram.messenger.kj kjVar, boolean z10) {
        super(null);
        this.f40792w = new e2.j0(15, 3);
        this.f40794y = new ArrayList();
        this.G = null;
        this.R = new a0.g(0);
        this.Z = new m4(this, 12);
        this.f40789n = kjVar;
        this.f40784c = 0;
        this.f40782b = j10;
        this.f40780a = getMessagesController().M0(j10);
        this.f40786d0 = z10;
    }

    public static void Z(qh0 qh0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        TL_stats.StatsGraph statsGraph;
        TL_stats.StatsGraph statsGraph2;
        qh0Var.D = true;
        if (tL_error != null) {
            qh0Var.m0();
            return;
        }
        if (tLObject instanceof TL_stories.TL_stats_storyStats) {
            TL_stories.TL_stats_storyStats tL_stats_storyStats = (TL_stories.TL_stats_storyStats) tLObject;
            statsGraph = tL_stats_storyStats.views_graph;
            statsGraph2 = tL_stats_storyStats.reactions_by_emotion_graph;
        } else {
            TL_stats.TL_messageStats tL_messageStats = (TL_stats.TL_messageStats) tLObject;
            statsGraph = tL_messageStats.views_graph;
            statsGraph2 = tL_messageStats.reactions_by_emotion_graph;
        }
        qh0Var.f40790r = s61.i0(statsGraph, org.telegram.messenger.dd.L0(2131743556, null), 1, false);
        qh0Var.f40791s = s61.i0(statsGraph2, org.telegram.messenger.dd.L0(2131746400, null), 2, false);
        e61 e61Var = qh0Var.f40790r;
        if (e61Var != null && e61Var.d.f4164a.length <= 5) {
            qh0Var.D = false;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            e61 e61Var2 = qh0Var.f40790r;
            tL_loadAsyncGraph.token = e61Var2.f36752g;
            long[] jArr = e61Var2.d.f4164a;
            tL_loadAsyncGraph.f20026x = jArr[jArr.length - 1];
            tL_loadAsyncGraph.flags |= 1;
            ConnectionsManager.getInstance(qh0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(qh0Var.currentAccount).sendRequest(tL_loadAsyncGraph, new aa(qh0Var, qh0Var.f40790r.f36752g + "_" + tL_loadAsyncGraph.f20026x, tL_loadAsyncGraph, 24), null, null, 0, qh0Var.f40780a.stats_dc, 1, true), qh0Var.classGuid);
            return;
        }
        qh0Var.m0();
    }

    public static void a0(qh0 qh0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z10;
        ArrayList arrayList = qh0Var.f40794y;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                qh0Var.G = tL_publicForwards.next_offset;
            } else {
                qh0Var.G = null;
            }
            int i10 = tL_publicForwards.count;
            if (i10 != 0) {
                qh0Var.U = i10;
            } else if (qh0Var.U == 0) {
                qh0Var.U = tL_publicForwards.forwards.size();
            }
            if (qh0Var.G == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            qh0Var.V = z10;
            qh0Var.getMessagesController().P3(tL_publicForwards.chats, false);
            qh0Var.getMessagesController().V3(tL_publicForwards.users, false);
            ArrayList<TL_stats.PublicForward> arrayList2 = tL_publicForwards.forwards;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                TL_stats.PublicForward publicForward = arrayList2.get(i11);
                i11++;
                TL_stats.PublicForward publicForward2 = publicForward;
                if (publicForward2 instanceof TL_stories.TL_publicForwardStory) {
                    TL_stories.TL_publicForwardStory tL_publicForwardStory = (TL_stories.TL_publicForwardStory) publicForward2;
                    tL_publicForwardStory.story.dialogId = org.telegram.messenger.o5.o(tL_publicForwardStory.peer);
                    TL_stories.StoryItem storyItem = tL_publicForwardStory.story;
                    storyItem.messageId = storyItem.f20032id;
                    org.telegram.messenger.kj kjVar = new org.telegram.messenger.kj(qh0Var.currentAccount, storyItem);
                    kjVar.r0(false);
                    arrayList.add(kjVar);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new org.telegram.messenger.kj(qh0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.xy xyVar = qh0Var.e;
            if (xyVar != null) {
                xyVar.c();
            }
        }
        qh0Var.F = true;
        qh0Var.E = false;
        qh0Var.m0();
    }

    public static void b0(qh0 qh0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z10;
        ArrayList arrayList = qh0Var.f40794y;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                qh0Var.G = tL_publicForwards.next_offset;
            } else {
                qh0Var.G = null;
            }
            int i10 = tL_publicForwards.count;
            if (i10 != 0) {
                qh0Var.U = i10;
            } else if (qh0Var.U == 0) {
                qh0Var.U = tL_publicForwards.forwards.size();
            }
            if (qh0Var.G == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            qh0Var.V = z10;
            qh0Var.getMessagesController().P3(tL_publicForwards.chats, false);
            qh0Var.getMessagesController().V3(tL_publicForwards.users, false);
            ArrayList<TL_stats.PublicForward> arrayList2 = tL_publicForwards.forwards;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                TL_stats.PublicForward publicForward = arrayList2.get(i11);
                i11++;
                TL_stats.PublicForward publicForward2 = publicForward;
                if (publicForward2 instanceof TL_stories.TL_publicForwardStory) {
                    TL_stories.TL_publicForwardStory tL_publicForwardStory = (TL_stories.TL_publicForwardStory) publicForward2;
                    tL_publicForwardStory.story.dialogId = org.telegram.messenger.o5.o(tL_publicForwardStory.peer);
                    TL_stories.StoryItem storyItem = tL_publicForwardStory.story;
                    storyItem.messageId = storyItem.f20032id;
                    org.telegram.messenger.kj kjVar = new org.telegram.messenger.kj(qh0Var.currentAccount, storyItem);
                    kjVar.r0(false);
                    arrayList.add(kjVar);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new org.telegram.messenger.kj(qh0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.xy xyVar = qh0Var.e;
            if (xyVar != null) {
                xyVar.c();
            }
        }
        qh0Var.F = true;
        qh0Var.E = false;
        qh0Var.m0();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20893b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20931d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21021i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.fk));
    }

    @Override
    public final android.view.View createView(android.content.Context r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qh0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.f40780a == null && chatFull.f19795id == this.f40782b) {
                k0();
                this.f40780a = chatFull;
                i0();
                h0();
                l0();
            }
        }
    }

    public final void f0() {
        View subtitleTextView;
        org.telegram.ui.Components.uk0 uk0Var = this.f40788f;
        if (uk0Var != null) {
            int childCount = uk0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                j0(this.f40788f.getChildAt(i10));
            }
            int hiddenChildCount = this.f40788f.getHiddenChildCount();
            for (int i11 = 0; i11 < hiddenChildCount; i11++) {
                j0(this.f40788f.V(i11));
            }
            int cachedChildCount = this.f40788f.getCachedChildCount();
            for (int i12 = 0; i12 < cachedChildCount; i12++) {
                j0(this.f40788f.P(i12));
            }
            int attachedScrapChildCount = this.f40788f.getAttachedScrapChildCount();
            for (int i13 = 0; i13 < attachedScrapChildCount; i13++) {
                j0(this.f40788f.O(i13));
            }
            this.f40788f.getRecycledViewPool().a();
        }
        bg.h hVar = this.f40785c0;
        if (hVar != null) {
            hVar.f2686c = true;
        }
        mh0 mh0Var = this.f40783b0;
        if (mh0Var == null) {
            subtitleTextView = null;
        } else {
            subtitleTextView = mh0Var.getSubtitleTextView();
        }
        if (subtitleTextView instanceof org.telegram.ui.ActionBar.u5) {
            ((org.telegram.ui.ActionBar.u5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Dj, getResourceProvider()));
        }
    }

    public final boolean g0(org.telegram.messenger.kj kjVar) {
        if (kjVar.x4() && (kjVar.f16694l instanceof TL_stories.TL_storyItemDeleted)) {
            org.telegram.messenger.m5.n(null, 2131744625, org.telegram.ui.Components.cc.a0(this), 2131624233, 36);
            return true;
        }
        return false;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.u5 u5Var;
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(13, this);
        mh0 mh0Var = this.f40783b0;
        View view = null;
        if (mh0Var != null) {
            u5Var = mh0Var.getTitleTextView();
        } else {
            u5Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(u5Var, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Cj));
        mh0 mh0Var2 = this.f40783b0;
        if (mh0Var2 != null) {
            view = mh0Var2.getSubtitleTextView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(org.telegram.ui.ActionBar.t6.Dj, view));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40788f, 0, new Class[]{org.telegram.ui.Cells.e5.class}, new String[]{"statusColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.f21312y6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40788f, 0, new Class[]{org.telegram.ui.Cells.e5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.f21116n6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.F8));
        s61.n0(this.f40790r, arrayList, g6Var);
        s61.n0(this.f40791s, arrayList, g6Var);
        return arrayList;
    }

    public final void h0() {
        if (this.E) {
            return;
        }
        this.E = true;
        oh0 oh0Var = this.d;
        if (oh0Var != null) {
            oh0Var.f();
        }
        org.telegram.messenger.kj kjVar = this.f40789n;
        String str = "";
        if (kjVar.x4()) {
            TL_stats.TL_getStoryPublicForwards tL_getStoryPublicForwards = new TL_stats.TL_getStoryPublicForwards();
            tL_getStoryPublicForwards.limit = 100;
            tL_getStoryPublicForwards.f20025id = kjVar.f16694l.f20032id;
            tL_getStoryPublicForwards.peer = getMessagesController().i1(-this.f40782b);
            String str2 = this.G;
            if (str2 != null) {
                str = str2;
            }
            tL_getStoryPublicForwards.offset = str;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getStoryPublicForwards, new kh0(this, 1), null, null, 0, this.f40780a.stats_dc, 1, true), this.classGuid);
            return;
        }
        TL_stats.TL_getMessagePublicForwards tL_getMessagePublicForwards = new TL_stats.TL_getMessagePublicForwards();
        tL_getMessagePublicForwards.limit = 100;
        TLRPC.MessageFwdHeader messageFwdHeader = kjVar.f16690k.fwd_from;
        if (messageFwdHeader != null) {
            tL_getMessagePublicForwards.msg_id = messageFwdHeader.saved_from_msg_id;
            tL_getMessagePublicForwards.channel = getMessagesController().g1(-kjVar.Z0());
        } else {
            tL_getMessagePublicForwards.msg_id = kjVar.f1();
            tL_getMessagePublicForwards.channel = getMessagesController().g1(-org.telegram.messenger.kj.B0(kjVar.f16690k));
        }
        String str3 = this.G;
        if (str3 != null) {
            str = str3;
        }
        tL_getMessagePublicForwards.offset = str;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getMessagePublicForwards, new kh0(this, 2), null, null, 0, this.f40780a.stats_dc, 1, true), this.classGuid);
    }

    public final void i0() {
        TL_stats.TL_getMessageStats tL_getMessageStats;
        org.telegram.messenger.kj kjVar = this.f40789n;
        if (kjVar.x4()) {
            TL_stories.TL_stats_getStoryStats tL_stats_getStoryStats = new TL_stories.TL_stats_getStoryStats();
            tL_stats_getStoryStats.f20034id = kjVar.f16694l.f20032id;
            tL_stats_getStoryStats.peer = getMessagesController().i1(-this.f40782b);
            tL_getMessageStats = tL_stats_getStoryStats;
        } else {
            TL_stats.TL_getMessageStats tL_getMessageStats2 = new TL_stats.TL_getMessageStats();
            TLRPC.MessageFwdHeader messageFwdHeader = kjVar.f16690k.fwd_from;
            if (messageFwdHeader != null) {
                tL_getMessageStats2.msg_id = messageFwdHeader.saved_from_msg_id;
                tL_getMessageStats2.channel = getMessagesController().g1(-kjVar.Z0());
                tL_getMessageStats = tL_getMessageStats2;
            } else {
                tL_getMessageStats2.msg_id = kjVar.f1();
                tL_getMessageStats2.channel = getMessagesController().g1(-org.telegram.messenger.kj.B0(kjVar.f16690k));
                tL_getMessageStats = tL_getMessageStats2;
            }
        }
        getConnectionsManager().sendRequest(tL_getMessageStats, new kh0(this, 0), null, null, 0, this.f40780a.stats_dc, 1, true);
    }

    @Override
    public boolean isLightStatusBar() {
        if (i0.b.h(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, getResourceProvider())) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public final void j0(View view) {
        if (view instanceof org.telegram.ui.Cells.e5) {
            org.telegram.ui.Cells.e5 e5Var = (org.telegram.ui.Cells.e5) view;
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21312y6, getResourceProvider());
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21116n6, getResourceProvider());
            e5Var.O = true;
            e5Var.H = w02;
            e5Var.I = w03;
            e5Var.d(0);
        } else if (view instanceof c61) {
            ((c61) view).d();
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, view, getResourceProvider());
        } else {
            boolean z10 = view instanceof org.telegram.ui.Cells.c7;
            if (z10 && (view.getBackground() instanceof org.telegram.ui.Components.eq) && (((org.telegram.ui.Components.eq) view.getBackground()).f25901a instanceof ColorDrawable)) {
                ((ColorDrawable) ((org.telegram.ui.Components.eq) view.getBackground()).f25901a).setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20873a7, getResourceProvider()));
                view.invalidate();
            } else if (z10) {
                org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(new ColorDrawable(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20873a7, getResourceProvider())), org.telegram.ui.ActionBar.t6.Y0(org.telegram.messenger.w0.f18945b, 2131231230, org.telegram.ui.ActionBar.t6.f20893b7), 0, 0);
                eqVar.f25909x = true;
                view.setBackground(eqVar);
            } else if (view instanceof dg.d) {
                ((dg.d) view).a();
            } else if (view instanceof ph0) {
                int i10 = ph0.d;
                ((ph0) view).a();
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, view, getResourceProvider());
            }
        }
        if (view instanceof org.telegram.ui.Cells.o3) {
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, view, getResourceProvider());
        }
    }

    public final void k0() {
        org.telegram.messenger.kj kjVar = this.f40789n;
        if (kjVar.x4()) {
            this.f40783b0.setTitle(org.telegram.messenger.dd.L0(2131744484, null));
            mh0 mh0Var = this.f40783b0;
            if (mh0Var.getSubtitleTextView() != null) {
                mh0Var.getSubtitleTextView().setVisibility(8);
            }
            mh0 mh0Var2 = this.f40783b0;
            mh0Var2.f30347b = true;
            mh0Var2.setStoriesForceState(1);
            ArrayList arrayList = kjVar.f16701n0;
            if (arrayList != null) {
                this.f40783b0.getAvatarImageView().l(org.telegram.messenger.jc.f(org.telegram.messenger.b8.w(arrayList, org.telegram.messenger.i0.Z0(false), false, null, false), kjVar.f16695l0), "50_50", org.telegram.messenger.jc.f(org.telegram.messenger.b8.w(kjVar.f16701n0, 50, false, null, false), kjVar.f16695l0), "b1", 0, this.f40789n);
                this.f40783b0.setClipChildren(false);
                this.f40783b0.getAvatarImageView().setScaleX(0.96f);
                this.f40783b0.getAvatarImageView().setScaleY(0.96f);
                return;
            }
            return;
        }
        this.f40783b0.setTitle(org.telegram.messenger.dd.L0(2131747112, null));
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.f40782b));
        if (L0 != null && !this.Y) {
            this.f40783b0.setChatAvatar(L0);
        }
    }

    public final void l0() {
        TLRPC.ChatFull chatFull;
        if (this.f40786d0 && (chatFull = this.f40780a) != null && chatFull.can_view_stats) {
            org.telegram.ui.ActionBar.y p5 = this.actionBar.p();
            ArrayList arrayList = p5.e;
            if (arrayList != null) {
                arrayList.clear();
            }
            p5.removeAllViews();
            p5.a(0, 2131231245).e(1, 2131232377, org.telegram.messenger.dd.L0(2131743585, null));
        }
    }

    public final void m0() {
        a0.g gVar = this.R;
        gVar.clear();
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.O = -1;
        this.N = -1;
        this.Q = 0;
        if (this.F && this.D) {
            org.telegram.messenger.i0.r(this.Z);
            if (this.f40781a0.getVisibility() == 8) {
                this.T.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.voip.i2(this, 16));
                this.f40781a0.setVisibility(0);
                this.f40781a0.setAlpha(0.0f);
                this.f40781a0.animate().alpha(1.0f).start();
            }
            int i10 = this.Q;
            this.O = i10;
            this.N = i10 + 1;
            this.Q = i10 + 3;
            gVar.add(Integer.valueOf(i10 + 2));
            if (this.f40790r != null) {
                int i11 = this.Q;
                this.L = i11;
                this.Q = i11 + 2;
                gVar.add(Integer.valueOf(i11 + 1));
            }
            if (this.f40791s != null) {
                int i12 = this.Q;
                this.M = i12;
                this.Q = i12 + 2;
                gVar.add(Integer.valueOf(i12 + 1));
            }
            ArrayList arrayList = this.f40794y;
            if (!arrayList.isEmpty()) {
                int i13 = this.Q;
                int i14 = i13 + 1;
                this.Q = i14;
                this.H = i13;
                this.I = i14;
                int size = arrayList.size() + i14;
                this.J = size;
                this.P = size;
                this.Q = size + 2;
                gVar.add(Integer.valueOf(size + 1));
                if (!this.V) {
                    int i15 = this.Q;
                    this.Q = i15 + 1;
                    this.K = i15;
                }
            }
        }
        oh0 oh0Var = this.d;
        if (oh0Var != null) {
            oh0Var.f();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        if (this.f40780a != null) {
            i0();
            h0();
        } else {
            org.telegram.messenger.wp.r1(this.currentAccount).T2(this.classGuid, this.f40782b, true);
        }
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.T);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.T);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        oh0 oh0Var = this.d;
        if (oh0Var != null) {
            oh0Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            mh0 mh0Var = this.f40783b0;
            if (mh0Var != null) {
                mh0Var.i(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Cj, getResourceProvider()), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Dj, getResourceProvider()));
            }
            f0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public qh0(org.telegram.messenger.kj kjVar) {
        super(null);
        this.f40792w = new e2.j0(15, 3);
        this.f40794y = new ArrayList();
        this.G = null;
        this.R = new a0.g(0);
        this.Z = new m4(this, 12);
        this.f40789n = kjVar;
        if (kjVar.f16690k.fwd_from == null) {
            this.f40782b = kjVar.x0();
            this.f40784c = kjVar.f1();
        } else {
            this.f40782b = -kjVar.Z0();
            this.f40784c = kjVar.f16690k.fwd_msg_id;
        }
        this.f40780a = getMessagesController().M0(this.f40782b);
    }
}
