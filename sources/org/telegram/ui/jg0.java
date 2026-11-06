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
public class jg0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
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
    public org.telegram.ui.Components.ch0 S;
    public LinearLayout T;
    public int U;
    public boolean V;
    public ImageReceiver W;
    public boolean X;
    public boolean Y;
    public final m4 Z;
    public TLRPC.ChatFull f46937a;
    public FrameLayout f46938a0;
    public final long f46939b;
    public fg0 f46940b0;
    public final int f46941c;
    public lg.f f46942c0;
    public hg0 d;
    public final boolean f46943d0;
    public org.telegram.ui.Components.iy f46944e;
    public z41 f46945e0;
    public org.telegram.ui.Components.pj0 f46946f;
    public v4.b0 h;
    public final org.telegram.messenger.ij f46947n;
    public o41 f46948r;
    public o41 f46949s;
    public final h2.j0 f46950w;
    public b51 f46951x;
    public final ArrayList f46952y;

    public jg0(long j3, org.telegram.messenger.ij ijVar, boolean z9) {
        super(null);
        this.f46950w = new h2.j0(15, 2);
        this.f46952y = new ArrayList();
        this.G = null;
        this.R = new a0.g(0);
        this.Z = new m4(this, 12);
        this.f46947n = ijVar;
        this.f46941c = 0;
        this.f46939b = j3;
        this.f46937a = getMessagesController().N0(j3);
        this.f46943d0 = z9;
    }

    public static void Z(jg0 jg0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        TL_stats.StatsGraph statsGraph;
        TL_stats.StatsGraph statsGraph2;
        jg0Var.D = true;
        if (tL_error != null) {
            jg0Var.m0();
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
        jg0Var.f46948r = c51.i0(statsGraph, org.telegram.messenger.hd.M0(2131743531, null), 1, false);
        jg0Var.f46949s = c51.i0(statsGraph2, org.telegram.messenger.hd.M0(2131746384, null), 2, false);
        o41 o41Var = jg0Var.f46948r;
        if (o41Var != null && o41Var.d.f20020a.length <= 5) {
            jg0Var.D = false;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            o41 o41Var2 = jg0Var.f46948r;
            tL_loadAsyncGraph.token = o41Var2.f48230g;
            long[] jArr = o41Var2.d.f20020a;
            tL_loadAsyncGraph.f27185x = jArr[jArr.length - 1];
            tL_loadAsyncGraph.flags |= 1;
            ConnectionsManager.getInstance(jg0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(jg0Var.currentAccount).sendRequest(tL_loadAsyncGraph, new z9(jg0Var, jg0Var.f46948r.f48230g + "_" + tL_loadAsyncGraph.f27185x, tL_loadAsyncGraph, 24), null, null, 0, jg0Var.f46937a.stats_dc, 1, true), jg0Var.classGuid);
            return;
        }
        jg0Var.m0();
    }

    public static void a0(jg0 jg0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z9;
        ArrayList arrayList = jg0Var.f46952y;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                jg0Var.G = tL_publicForwards.next_offset;
            } else {
                jg0Var.G = null;
            }
            int i7 = tL_publicForwards.count;
            if (i7 != 0) {
                jg0Var.U = i7;
            } else if (jg0Var.U == 0) {
                jg0Var.U = tL_publicForwards.forwards.size();
            }
            if (jg0Var.G == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            jg0Var.V = z9;
            jg0Var.getMessagesController().S3(tL_publicForwards.chats, false);
            jg0Var.getMessagesController().Y3(tL_publicForwards.users, false);
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
                    storyItem.messageId = storyItem.f27191id;
                    org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(jg0Var.currentAccount, storyItem);
                    ijVar.r0(false);
                    arrayList.add(ijVar);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new org.telegram.messenger.ij(jg0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.iy iyVar = jg0Var.f46944e;
            if (iyVar != null) {
                iyVar.c();
            }
        }
        jg0Var.F = true;
        jg0Var.E = false;
        jg0Var.m0();
    }

    public static void b0(jg0 jg0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z9;
        ArrayList arrayList = jg0Var.f46952y;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                jg0Var.G = tL_publicForwards.next_offset;
            } else {
                jg0Var.G = null;
            }
            int i7 = tL_publicForwards.count;
            if (i7 != 0) {
                jg0Var.U = i7;
            } else if (jg0Var.U == 0) {
                jg0Var.U = tL_publicForwards.forwards.size();
            }
            if (jg0Var.G == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            jg0Var.V = z9;
            jg0Var.getMessagesController().S3(tL_publicForwards.chats, false);
            jg0Var.getMessagesController().Y3(tL_publicForwards.users, false);
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
                    storyItem.messageId = storyItem.f27191id;
                    org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(jg0Var.currentAccount, storyItem);
                    ijVar.r0(false);
                    arrayList.add(ijVar);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new org.telegram.messenger.ij(jg0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.iy iyVar = jg0Var.f46944e;
            if (iyVar != null) {
                iyVar.c();
            }
        }
        jg0Var.F = true;
        jg0Var.E = false;
        jg0Var.m0();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27812b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27849d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27940i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28128s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.fk));
    }

    @Override
    public final android.view.View createView(android.content.Context r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jg0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.f46937a == null && chatFull.f26953id == this.f46939b) {
                k0();
                this.f46937a = chatFull;
                i0();
                h0();
                l0();
            }
        }
    }

    public final void f0() {
        View subtitleTextView;
        org.telegram.ui.Components.pj0 pj0Var = this.f46946f;
        if (pj0Var != null) {
            int childCount = pj0Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                j0(this.f46946f.getChildAt(i7));
            }
            int hiddenChildCount = this.f46946f.getHiddenChildCount();
            for (int i10 = 0; i10 < hiddenChildCount; i10++) {
                j0(this.f46946f.V(i10));
            }
            int cachedChildCount = this.f46946f.getCachedChildCount();
            for (int i11 = 0; i11 < cachedChildCount; i11++) {
                j0(this.f46946f.P(i11));
            }
            int attachedScrapChildCount = this.f46946f.getAttachedScrapChildCount();
            for (int i12 = 0; i12 < attachedScrapChildCount; i12++) {
                j0(this.f46946f.O(i12));
            }
            this.f46946f.getRecycledViewPool().a();
        }
        lg.f fVar = this.f46942c0;
        if (fVar != null) {
            fVar.f18265c = true;
        }
        fg0 fg0Var = this.f46940b0;
        if (fg0Var == null) {
            subtitleTextView = null;
        } else {
            subtitleTextView = fg0Var.getSubtitleTextView();
        }
        if (subtitleTextView instanceof org.telegram.ui.ActionBar.k5) {
            ((org.telegram.ui.ActionBar.k5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Dj, getResourceProvider()));
        }
    }

    public final boolean g0(org.telegram.messenger.ij ijVar) {
        if (ijVar.y4() && (ijVar.f23241l instanceof TL_stories.TL_storyItemDeleted)) {
            org.telegram.messenger.k5.o(null, 2131744607, org.telegram.ui.Components.hc.a0(this), 2131624235, 36);
            return true;
        }
        return false;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.k5 k5Var;
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(13, this);
        fg0 fg0Var = this.f46940b0;
        View view = null;
        if (fg0Var != null) {
            k5Var = fg0Var.getTitleTextView();
        } else {
            k5Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(k5Var, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Cj));
        fg0 fg0Var2 = this.f46940b0;
        if (fg0Var2 != null) {
            view = fg0Var2.getSubtitleTextView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(org.telegram.ui.ActionBar.k6.Dj, view));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46946f, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.f28240y6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46946f, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.f28030n6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.F8));
        c51.n0(this.f46948r, arrayList, f6Var);
        c51.n0(this.f46949s, arrayList, f6Var);
        return arrayList;
    }

    public final void h0() {
        if (this.E) {
            return;
        }
        this.E = true;
        hg0 hg0Var = this.d;
        if (hg0Var != null) {
            hg0Var.f();
        }
        org.telegram.messenger.ij ijVar = this.f46947n;
        String str = "";
        if (ijVar.y4()) {
            TL_stats.TL_getStoryPublicForwards tL_getStoryPublicForwards = new TL_stats.TL_getStoryPublicForwards();
            tL_getStoryPublicForwards.limit = 100;
            tL_getStoryPublicForwards.f27184id = ijVar.f23241l.f27191id;
            tL_getStoryPublicForwards.peer = getMessagesController().j1(-this.f46939b);
            String str2 = this.G;
            if (str2 != null) {
                str = str2;
            }
            tL_getStoryPublicForwards.offset = str;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getStoryPublicForwards, new dg0(this, 1), null, null, 0, this.f46937a.stats_dc, 1, true), this.classGuid);
            return;
        }
        TL_stats.TL_getMessagePublicForwards tL_getMessagePublicForwards = new TL_stats.TL_getMessagePublicForwards();
        tL_getMessagePublicForwards.limit = 100;
        TLRPC.MessageFwdHeader messageFwdHeader = ijVar.f23237k.fwd_from;
        if (messageFwdHeader != null) {
            tL_getMessagePublicForwards.msg_id = messageFwdHeader.saved_from_msg_id;
            tL_getMessagePublicForwards.channel = getMessagesController().h1(-ijVar.Z0());
        } else {
            tL_getMessagePublicForwards.msg_id = ijVar.f1();
            tL_getMessagePublicForwards.channel = getMessagesController().h1(-org.telegram.messenger.ij.B0(ijVar.f23237k));
        }
        String str3 = this.G;
        if (str3 != null) {
            str = str3;
        }
        tL_getMessagePublicForwards.offset = str;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getMessagePublicForwards, new dg0(this, 2), null, null, 0, this.f46937a.stats_dc, 1, true), this.classGuid);
    }

    public final void i0() {
        TL_stats.TL_getMessageStats tL_getMessageStats;
        org.telegram.messenger.ij ijVar = this.f46947n;
        if (ijVar.y4()) {
            TL_stories.TL_stats_getStoryStats tL_stats_getStoryStats = new TL_stories.TL_stats_getStoryStats();
            tL_stats_getStoryStats.f27193id = ijVar.f23241l.f27191id;
            tL_stats_getStoryStats.peer = getMessagesController().j1(-this.f46939b);
            tL_getMessageStats = tL_stats_getStoryStats;
        } else {
            TL_stats.TL_getMessageStats tL_getMessageStats2 = new TL_stats.TL_getMessageStats();
            TLRPC.MessageFwdHeader messageFwdHeader = ijVar.f23237k.fwd_from;
            if (messageFwdHeader != null) {
                tL_getMessageStats2.msg_id = messageFwdHeader.saved_from_msg_id;
                tL_getMessageStats2.channel = getMessagesController().h1(-ijVar.Z0());
                tL_getMessageStats = tL_getMessageStats2;
            } else {
                tL_getMessageStats2.msg_id = ijVar.f1();
                tL_getMessageStats2.channel = getMessagesController().h1(-org.telegram.messenger.ij.B0(ijVar.f23237k));
                tL_getMessageStats = tL_getMessageStats2;
            }
        }
        getConnectionsManager().sendRequest(tL_getMessageStats, new dg0(this, 0), null, null, 0, this.f46937a.stats_dc, 1, true);
    }

    @Override
    public boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27848d6, getResourceProvider())) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public final void j0(View view) {
        if (view instanceof org.telegram.ui.Cells.a5) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28240y6, getResourceProvider());
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28030n6, getResourceProvider());
            a5Var.O = true;
            a5Var.H = w02;
            a5Var.I = w03;
            a5Var.d(0);
        } else if (view instanceof l41) {
            ((l41) view).d();
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27848d6, view, getResourceProvider());
        } else {
            boolean z9 = view instanceof org.telegram.ui.Cells.y6;
            if (z9 && (view.getBackground() instanceof org.telegram.ui.Components.xp) && (((org.telegram.ui.Components.xp) view.getBackground()).f40296a instanceof ColorDrawable)) {
                ((ColorDrawable) ((org.telegram.ui.Components.xp) view.getBackground()).f40296a).setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27792a7, getResourceProvider()));
                view.invalidate();
            } else if (z9) {
                org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27792a7, getResourceProvider())), org.telegram.ui.ActionBar.k6.Y0(org.telegram.messenger.t0.f25555b, 2131231229, org.telegram.ui.ActionBar.k6.f27812b7), 0, 0);
                xpVar.f40305x = true;
                view.setBackground(xpVar);
            } else if (view instanceof ng.c) {
                ((ng.c) view).a();
            } else if (view instanceof ig0) {
                int i7 = ig0.d;
                ((ig0) view).a();
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27848d6, view, getResourceProvider());
            }
        }
        if (view instanceof org.telegram.ui.Cells.m3) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27848d6, view, getResourceProvider());
        }
    }

    public final void k0() {
        org.telegram.messenger.ij ijVar = this.f46947n;
        if (ijVar.y4()) {
            this.f46940b0.setTitle(org.telegram.messenger.hd.M0(2131744459, null));
            fg0 fg0Var = this.f46940b0;
            if (fg0Var.getSubtitleTextView() != null) {
                fg0Var.getSubtitleTextView().setVisibility(8);
            }
            fg0 fg0Var2 = this.f46940b0;
            fg0Var2.f35342b = true;
            fg0Var2.setStoriesForceState(1);
            ArrayList arrayList = ijVar.f23248n0;
            if (arrayList != null) {
                this.f46940b0.getAvatarImageView().l(org.telegram.messenger.hc.f(org.telegram.messenger.w7.w(arrayList, org.telegram.messenger.g0.Z0(false), false, null, false), ijVar.f23242l0), "50_50", org.telegram.messenger.hc.f(org.telegram.messenger.w7.w(ijVar.f23248n0, 50, false, null, false), ijVar.f23242l0), "b1", 0, this.f46947n);
                this.f46940b0.setClipChildren(false);
                this.f46940b0.getAvatarImageView().setScaleX(0.96f);
                this.f46940b0.getAvatarImageView().setScaleY(0.96f);
                return;
            }
            return;
        }
        this.f46940b0.setTitle(org.telegram.messenger.hd.M0(2131747096, null));
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f46939b));
        if (M0 != null && !this.Y) {
            this.f46940b0.setChatAvatar(M0);
        }
    }

    public final void l0() {
        TLRPC.ChatFull chatFull;
        if (this.f46943d0 && (chatFull = this.f46937a) != null && chatFull.can_view_stats) {
            org.telegram.ui.ActionBar.y q10 = this.actionBar.q();
            ArrayList arrayList = q10.f28757e;
            if (arrayList != null) {
                arrayList.clear();
            }
            q10.removeAllViews();
            q10.a(0, 2131231244).e(1, 2131232378, org.telegram.messenger.hd.M0(2131743560, null));
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
            if (this.f46938a0.getVisibility() == 8) {
                this.T.animate().alpha(0.0f).setListener(new d30(this, 5));
                this.f46938a0.setVisibility(0);
                this.f46938a0.setAlpha(0.0f);
                this.f46938a0.animate().alpha(1.0f).start();
            }
            int i7 = this.Q;
            this.O = i7;
            this.N = i7 + 1;
            this.Q = i7 + 3;
            gVar.add(Integer.valueOf(i7 + 2));
            if (this.f46948r != null) {
                int i10 = this.Q;
                this.L = i10;
                this.Q = i10 + 2;
                gVar.add(Integer.valueOf(i10 + 1));
            }
            if (this.f46949s != null) {
                int i11 = this.Q;
                this.M = i11;
                this.Q = i11 + 2;
                gVar.add(Integer.valueOf(i11 + 1));
            }
            ArrayList arrayList = this.f46952y;
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
        hg0 hg0Var = this.d;
        if (hg0Var != null) {
            hg0Var.f();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        if (this.f46937a != null) {
            i0();
            h0();
        } else {
            org.telegram.messenger.qp.s1(this.currentAccount).V2(this.classGuid, this.f46939b, true);
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
        hg0 hg0Var = this.d;
        if (hg0Var != null) {
            hg0Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            fg0 fg0Var = this.f46940b0;
            if (fg0Var != null) {
                fg0Var.i(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Cj, getResourceProvider()), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Dj, getResourceProvider()));
            }
            f0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public jg0(org.telegram.messenger.ij ijVar) {
        super(null);
        this.f46950w = new h2.j0(15, 2);
        this.f46952y = new ArrayList();
        this.G = null;
        this.R = new a0.g(0);
        this.Z = new m4(this, 12);
        this.f46947n = ijVar;
        if (ijVar.f23237k.fwd_from == null) {
            this.f46939b = ijVar.x0();
            this.f46941c = ijVar.f1();
        } else {
            this.f46939b = -ijVar.Z0();
            this.f46941c = ijVar.f23237k.fwd_msg_id;
        }
        this.f46937a = getMessagesController().N0(this.f46939b);
    }
}
