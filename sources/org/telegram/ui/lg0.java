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
public class lg0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
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
    public org.telegram.ui.Components.dh0 S;
    public LinearLayout T;
    public int U;
    public boolean V;
    public ImageReceiver W;
    public boolean X;
    public boolean Y;
    public final m4 Z;
    public TLRPC.ChatFull f47601a;
    public FrameLayout f47602a0;
    public final long f47603b;
    public hg0 f47604b0;
    public final int f47605c;
    public lg.f f47606c0;
    public jg0 d;
    public final boolean f47607d0;
    public org.telegram.ui.Components.jy f47608e;
    public a51 f47609e0;
    public org.telegram.ui.Components.qj0 f47610f;
    public v4.b0 h;
    public final org.telegram.messenger.ij f47611n;
    public p41 f47612r;
    public p41 f47613s;
    public final h2.j0 f47614w;
    public c51 f47615x;
    public final ArrayList f47616y;

    public lg0(long j3, org.telegram.messenger.ij ijVar, boolean z9) {
        super(null);
        this.f47614w = new h2.j0(15, 2);
        this.f47616y = new ArrayList();
        this.G = null;
        this.R = new a0.g(0);
        this.Z = new m4(this, 12);
        this.f47611n = ijVar;
        this.f47605c = 0;
        this.f47603b = j3;
        this.f47601a = getMessagesController().N0(j3);
        this.f47607d0 = z9;
    }

    public static void Z(lg0 lg0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        TL_stats.StatsGraph statsGraph;
        TL_stats.StatsGraph statsGraph2;
        lg0Var.D = true;
        if (tL_error != null) {
            lg0Var.m0();
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
        lg0Var.f47612r = d51.i0(statsGraph, org.telegram.messenger.id.M0(2131743530, null), 1, false);
        lg0Var.f47613s = d51.i0(statsGraph2, org.telegram.messenger.id.M0(2131746385, null), 2, false);
        p41 p41Var = lg0Var.f47612r;
        if (p41Var != null && p41Var.d.f20023a.length <= 5) {
            lg0Var.D = false;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            p41 p41Var2 = lg0Var.f47612r;
            tL_loadAsyncGraph.token = p41Var2.f48625g;
            long[] jArr = p41Var2.d.f20023a;
            tL_loadAsyncGraph.f27189x = jArr[jArr.length - 1];
            tL_loadAsyncGraph.flags |= 1;
            ConnectionsManager.getInstance(lg0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(lg0Var.currentAccount).sendRequest(tL_loadAsyncGraph, new z9(lg0Var, lg0Var.f47612r.f48625g + "_" + tL_loadAsyncGraph.f27189x, tL_loadAsyncGraph, 24), null, null, 0, lg0Var.f47601a.stats_dc, 1, true), lg0Var.classGuid);
            return;
        }
        lg0Var.m0();
    }

    public static void a0(lg0 lg0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z9;
        ArrayList arrayList = lg0Var.f47616y;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                lg0Var.G = tL_publicForwards.next_offset;
            } else {
                lg0Var.G = null;
            }
            int i7 = tL_publicForwards.count;
            if (i7 != 0) {
                lg0Var.U = i7;
            } else if (lg0Var.U == 0) {
                lg0Var.U = tL_publicForwards.forwards.size();
            }
            if (lg0Var.G == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            lg0Var.V = z9;
            lg0Var.getMessagesController().S3(tL_publicForwards.chats, false);
            lg0Var.getMessagesController().Y3(tL_publicForwards.users, false);
            ArrayList<TL_stats.PublicForward> arrayList2 = tL_publicForwards.forwards;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TL_stats.PublicForward publicForward = arrayList2.get(i10);
                i10++;
                TL_stats.PublicForward publicForward2 = publicForward;
                if (publicForward2 instanceof TL_stories.TL_publicForwardStory) {
                    TL_stories.TL_publicForwardStory tL_publicForwardStory = (TL_stories.TL_publicForwardStory) publicForward2;
                    tL_publicForwardStory.story.dialogId = org.telegram.messenger.m5.o(tL_publicForwardStory.peer);
                    TL_stories.StoryItem storyItem = tL_publicForwardStory.story;
                    storyItem.messageId = storyItem.f27195id;
                    org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(lg0Var.currentAccount, storyItem);
                    ijVar.r0(false);
                    arrayList.add(ijVar);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new org.telegram.messenger.ij(lg0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.jy jyVar = lg0Var.f47608e;
            if (jyVar != null) {
                jyVar.c();
            }
        }
        lg0Var.F = true;
        lg0Var.E = false;
        lg0Var.m0();
    }

    public static void b0(lg0 lg0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z9;
        ArrayList arrayList = lg0Var.f47616y;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                lg0Var.G = tL_publicForwards.next_offset;
            } else {
                lg0Var.G = null;
            }
            int i7 = tL_publicForwards.count;
            if (i7 != 0) {
                lg0Var.U = i7;
            } else if (lg0Var.U == 0) {
                lg0Var.U = tL_publicForwards.forwards.size();
            }
            if (lg0Var.G == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            lg0Var.V = z9;
            lg0Var.getMessagesController().S3(tL_publicForwards.chats, false);
            lg0Var.getMessagesController().Y3(tL_publicForwards.users, false);
            ArrayList<TL_stats.PublicForward> arrayList2 = tL_publicForwards.forwards;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TL_stats.PublicForward publicForward = arrayList2.get(i10);
                i10++;
                TL_stats.PublicForward publicForward2 = publicForward;
                if (publicForward2 instanceof TL_stories.TL_publicForwardStory) {
                    TL_stories.TL_publicForwardStory tL_publicForwardStory = (TL_stories.TL_publicForwardStory) publicForward2;
                    tL_publicForwardStory.story.dialogId = org.telegram.messenger.m5.o(tL_publicForwardStory.peer);
                    TL_stories.StoryItem storyItem = tL_publicForwardStory.story;
                    storyItem.messageId = storyItem.f27195id;
                    org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(lg0Var.currentAccount, storyItem);
                    ijVar.r0(false);
                    arrayList.add(ijVar);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new org.telegram.messenger.ij(lg0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.jy jyVar = lg0Var.f47608e;
            if (jyVar != null) {
                jyVar.c();
            }
        }
        lg0Var.F = true;
        lg0Var.E = false;
        lg0Var.m0();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27829b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27866d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27957i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28145s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.fk));
    }

    @Override
    public final android.view.View createView(android.content.Context r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lg0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.f47601a == null && chatFull.f26957id == this.f47603b) {
                k0();
                this.f47601a = chatFull;
                i0();
                h0();
                l0();
            }
        }
    }

    public final void f0() {
        View subtitleTextView;
        org.telegram.ui.Components.qj0 qj0Var = this.f47610f;
        if (qj0Var != null) {
            int childCount = qj0Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                j0(this.f47610f.getChildAt(i7));
            }
            int hiddenChildCount = this.f47610f.getHiddenChildCount();
            for (int i10 = 0; i10 < hiddenChildCount; i10++) {
                j0(this.f47610f.V(i10));
            }
            int cachedChildCount = this.f47610f.getCachedChildCount();
            for (int i11 = 0; i11 < cachedChildCount; i11++) {
                j0(this.f47610f.P(i11));
            }
            int attachedScrapChildCount = this.f47610f.getAttachedScrapChildCount();
            for (int i12 = 0; i12 < attachedScrapChildCount; i12++) {
                j0(this.f47610f.O(i12));
            }
            this.f47610f.getRecycledViewPool().a();
        }
        lg.f fVar = this.f47606c0;
        if (fVar != null) {
            fVar.f18268c = true;
        }
        hg0 hg0Var = this.f47604b0;
        if (hg0Var == null) {
            subtitleTextView = null;
        } else {
            subtitleTextView = hg0Var.getSubtitleTextView();
        }
        if (subtitleTextView instanceof org.telegram.ui.ActionBar.l5) {
            ((org.telegram.ui.ActionBar.l5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Dj, getResourceProvider()));
        }
    }

    public final boolean g0(org.telegram.messenger.ij ijVar) {
        if (ijVar.x4() && (ijVar.f23266l instanceof TL_stories.TL_storyItemDeleted)) {
            org.telegram.messenger.k5.o(null, 2131744606, org.telegram.ui.Components.hc.a0(this), 2131624235, 36);
            return true;
        }
        return false;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.l5 l5Var;
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(13, this);
        hg0 hg0Var = this.f47604b0;
        View view = null;
        if (hg0Var != null) {
            l5Var = hg0Var.getTitleTextView();
        } else {
            l5Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.u6(l5Var, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Cj));
        hg0 hg0Var2 = this.f47604b0;
        if (hg0Var2 != null) {
            view = hg0Var2.getSubtitleTextView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.u6(org.telegram.ui.ActionBar.l6.Dj, view));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f47610f, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.l6.f28257y6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f47610f, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.l6.f28047n6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.F8));
        d51.n0(this.f47612r, arrayList, f6Var);
        d51.n0(this.f47613s, arrayList, f6Var);
        return arrayList;
    }

    public final void h0() {
        if (this.E) {
            return;
        }
        this.E = true;
        jg0 jg0Var = this.d;
        if (jg0Var != null) {
            jg0Var.f();
        }
        org.telegram.messenger.ij ijVar = this.f47611n;
        String str = "";
        if (ijVar.x4()) {
            TL_stats.TL_getStoryPublicForwards tL_getStoryPublicForwards = new TL_stats.TL_getStoryPublicForwards();
            tL_getStoryPublicForwards.limit = 100;
            tL_getStoryPublicForwards.f27188id = ijVar.f23266l.f27195id;
            tL_getStoryPublicForwards.peer = getMessagesController().j1(-this.f47603b);
            String str2 = this.G;
            if (str2 != null) {
                str = str2;
            }
            tL_getStoryPublicForwards.offset = str;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getStoryPublicForwards, new fg0(this, 1), null, null, 0, this.f47601a.stats_dc, 1, true), this.classGuid);
            return;
        }
        TL_stats.TL_getMessagePublicForwards tL_getMessagePublicForwards = new TL_stats.TL_getMessagePublicForwards();
        tL_getMessagePublicForwards.limit = 100;
        TLRPC.MessageFwdHeader messageFwdHeader = ijVar.f23262k.fwd_from;
        if (messageFwdHeader != null) {
            tL_getMessagePublicForwards.msg_id = messageFwdHeader.saved_from_msg_id;
            tL_getMessagePublicForwards.channel = getMessagesController().h1(-ijVar.Z0());
        } else {
            tL_getMessagePublicForwards.msg_id = ijVar.e1();
            tL_getMessagePublicForwards.channel = getMessagesController().h1(-org.telegram.messenger.ij.B0(ijVar.f23262k));
        }
        String str3 = this.G;
        if (str3 != null) {
            str = str3;
        }
        tL_getMessagePublicForwards.offset = str;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getMessagePublicForwards, new fg0(this, 2), null, null, 0, this.f47601a.stats_dc, 1, true), this.classGuid);
    }

    public final void i0() {
        TL_stats.TL_getMessageStats tL_getMessageStats;
        org.telegram.messenger.ij ijVar = this.f47611n;
        if (ijVar.x4()) {
            TL_stories.TL_stats_getStoryStats tL_stats_getStoryStats = new TL_stories.TL_stats_getStoryStats();
            tL_stats_getStoryStats.f27197id = ijVar.f23266l.f27195id;
            tL_stats_getStoryStats.peer = getMessagesController().j1(-this.f47603b);
            tL_getMessageStats = tL_stats_getStoryStats;
        } else {
            TL_stats.TL_getMessageStats tL_getMessageStats2 = new TL_stats.TL_getMessageStats();
            TLRPC.MessageFwdHeader messageFwdHeader = ijVar.f23262k.fwd_from;
            if (messageFwdHeader != null) {
                tL_getMessageStats2.msg_id = messageFwdHeader.saved_from_msg_id;
                tL_getMessageStats2.channel = getMessagesController().h1(-ijVar.Z0());
                tL_getMessageStats = tL_getMessageStats2;
            } else {
                tL_getMessageStats2.msg_id = ijVar.e1();
                tL_getMessageStats2.channel = getMessagesController().h1(-org.telegram.messenger.ij.B0(ijVar.f23262k));
                tL_getMessageStats = tL_getMessageStats2;
            }
        }
        getConnectionsManager().sendRequest(tL_getMessageStats, new fg0(this, 0), null, null, 0, this.f47601a.stats_dc, 1, true);
    }

    @Override
    public boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27865d6, getResourceProvider())) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public final void j0(View view) {
        if (view instanceof org.telegram.ui.Cells.a5) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28257y6, getResourceProvider());
            int w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28047n6, getResourceProvider());
            a5Var.O = true;
            a5Var.H = w02;
            a5Var.I = w03;
            a5Var.d(0);
        } else if (view instanceof m41) {
            ((m41) view).d();
            org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, view, getResourceProvider());
        } else {
            boolean z9 = view instanceof org.telegram.ui.Cells.y6;
            if (z9 && (view.getBackground() instanceof org.telegram.ui.Components.xp) && (((org.telegram.ui.Components.xp) view.getBackground()).f40444a instanceof ColorDrawable)) {
                ((ColorDrawable) ((org.telegram.ui.Components.xp) view.getBackground()).f40444a).setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27809a7, getResourceProvider()));
                view.invalidate();
            } else if (z9) {
                org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(new ColorDrawable(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27809a7, getResourceProvider())), org.telegram.ui.ActionBar.l6.Y0(org.telegram.messenger.t0.f25566b, 2131231229, org.telegram.ui.ActionBar.l6.f27829b7), 0, 0);
                xpVar.f40453x = true;
                view.setBackground(xpVar);
            } else if (view instanceof ng.c) {
                ((ng.c) view).a();
            } else if (view instanceof kg0) {
                int i7 = kg0.d;
                ((kg0) view).a();
                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, view, getResourceProvider());
            }
        }
        if (view instanceof org.telegram.ui.Cells.m3) {
            org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, view, getResourceProvider());
        }
    }

    public final void k0() {
        org.telegram.messenger.ij ijVar = this.f47611n;
        if (ijVar.x4()) {
            this.f47604b0.setTitle(org.telegram.messenger.id.M0(2131744458, null));
            hg0 hg0Var = this.f47604b0;
            if (hg0Var.getSubtitleTextView() != null) {
                hg0Var.getSubtitleTextView().setVisibility(8);
            }
            hg0 hg0Var2 = this.f47604b0;
            hg0Var2.f35401b = true;
            hg0Var2.setStoriesForceState(1);
            ArrayList arrayList = ijVar.f23273n0;
            if (arrayList != null) {
                this.f47604b0.getAvatarImageView().l(org.telegram.messenger.hc.f(org.telegram.messenger.w7.w(arrayList, org.telegram.messenger.g0.Z0(false), false, null, false), ijVar.f23267l0), "50_50", org.telegram.messenger.hc.f(org.telegram.messenger.w7.w(ijVar.f23273n0, 50, false, null, false), ijVar.f23267l0), "b1", 0, this.f47611n);
                this.f47604b0.setClipChildren(false);
                this.f47604b0.getAvatarImageView().setScaleX(0.96f);
                this.f47604b0.getAvatarImageView().setScaleY(0.96f);
                return;
            }
            return;
        }
        this.f47604b0.setTitle(org.telegram.messenger.id.M0(2131747097, null));
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f47603b));
        if (M0 != null && !this.Y) {
            this.f47604b0.setChatAvatar(M0);
        }
    }

    public final void l0() {
        TLRPC.ChatFull chatFull;
        if (this.f47607d0 && (chatFull = this.f47601a) != null && chatFull.can_view_stats) {
            org.telegram.ui.ActionBar.y r10 = this.actionBar.r();
            ArrayList arrayList = r10.f28761e;
            if (arrayList != null) {
                arrayList.clear();
            }
            r10.removeAllViews();
            r10.a(0, 2131231244).e(1, 2131232378, org.telegram.messenger.id.M0(2131743559, null));
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
            org.telegram.messenger.g0.r(this.Z);
            if (this.f47602a0.getVisibility() == 8) {
                this.T.animate().alpha(0.0f).setListener(new f30(this, 5));
                this.f47602a0.setVisibility(0);
                this.f47602a0.setAlpha(0.0f);
                this.f47602a0.animate().alpha(1.0f).start();
            }
            int i7 = this.Q;
            this.O = i7;
            this.N = i7 + 1;
            this.Q = i7 + 3;
            gVar.add(Integer.valueOf(i7 + 2));
            if (this.f47612r != null) {
                int i10 = this.Q;
                this.L = i10;
                this.Q = i10 + 2;
                gVar.add(Integer.valueOf(i10 + 1));
            }
            if (this.f47613s != null) {
                int i11 = this.Q;
                this.M = i11;
                this.Q = i11 + 2;
                gVar.add(Integer.valueOf(i11 + 1));
            }
            ArrayList arrayList = this.f47616y;
            if (!arrayList.isEmpty()) {
                int i12 = this.Q;
                int i13 = i12 + 1;
                this.Q = i13;
                this.H = i12;
                this.I = i13;
                int size = arrayList.size() + i13;
                this.J = size;
                this.P = size;
                this.Q = size + 2;
                gVar.add(Integer.valueOf(size + 1));
                if (!this.V) {
                    int i14 = this.Q;
                    this.Q = i14 + 1;
                    this.K = i14;
                }
            }
        }
        jg0 jg0Var = this.d;
        if (jg0Var != null) {
            jg0Var.f();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        if (this.f47601a != null) {
            i0();
            h0();
        } else {
            org.telegram.messenger.qp.s1(this.currentAccount).V2(this.classGuid, this.f47603b, true);
        }
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.T);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.T);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        jg0 jg0Var = this.d;
        if (jg0Var != null) {
            jg0Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            hg0 hg0Var = this.f47604b0;
            if (hg0Var != null) {
                hg0Var.i(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Cj, getResourceProvider()), org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Dj, getResourceProvider()));
            }
            f0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public lg0(org.telegram.messenger.ij ijVar) {
        super(null);
        this.f47614w = new h2.j0(15, 2);
        this.f47616y = new ArrayList();
        this.G = null;
        this.R = new a0.g(0);
        this.Z = new m4(this, 12);
        this.f47611n = ijVar;
        if (ijVar.f23262k.fwd_from == null) {
            this.f47603b = ijVar.x0();
            this.f47605c = ijVar.e1();
        } else {
            this.f47603b = -ijVar.Z0();
            this.f47605c = ijVar.f23262k.fwd_msg_id;
        }
        this.f47601a = getMessagesController().N0(this.f47603b);
    }
}
