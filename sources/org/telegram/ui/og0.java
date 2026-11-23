package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
public class og0 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs {
    public boolean E;
    public boolean F;
    public boolean G;
    public String H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public final a0.g S;
    public org.telegram.ui.Components.rh0 T;
    public LinearLayout U;
    public int V;
    public boolean W;
    public ImageReceiver X;
    public boolean Y;
    public boolean Z;
    public TLRPC.ChatFull f50582a;
    public final m4 f50583a0;
    public final long f50584b;
    public FrameLayout f50585b0;
    public final int f50586c;
    public ig0 f50587c0;
    public mg0 d;
    public lg.f f50588d0;
    public org.telegram.ui.Components.vy f50589e;
    public final boolean f50590e0;
    public org.telegram.ui.Components.ek0 f50591f;
    public z41 f50592f0;
    public v4.c0 h;
    public final org.telegram.messenger.gj f50593n;
    public o41 f50594r;
    public o41 f50595s;
    public final h2.j0 f50596w;
    public b51 f50597x;
    public final ArrayList f50598y;

    public og0(long j3, org.telegram.messenger.gj gjVar, boolean z10) {
        super(null);
        this.f50596w = new h2.j0(15, 2);
        this.f50598y = new ArrayList();
        this.H = null;
        this.S = new a0.g(0);
        this.f50583a0 = new m4(this, 12);
        this.f50593n = gjVar;
        this.f50586c = 0;
        this.f50584b = j3;
        this.f50582a = getMessagesController().P0(j3);
        this.f50590e0 = z10;
    }

    public static void Z(og0 og0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        TL_stats.StatsGraph statsGraph;
        TL_stats.StatsGraph statsGraph2;
        og0Var.E = true;
        if (tL_error != null) {
            og0Var.m0();
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
        og0Var.f50594r = c51.i0(statsGraph, org.telegram.messenger.hd.N0(2131743285, null), 1, false);
        og0Var.f50595s = c51.i0(statsGraph2, org.telegram.messenger.hd.N0(2131746189, null), 2, false);
        o41 o41Var = og0Var.f50594r;
        if (o41Var != null && o41Var.d.f21012a.length <= 5) {
            og0Var.E = false;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            o41 o41Var2 = og0Var.f50594r;
            tL_loadAsyncGraph.token = o41Var2.f50477g;
            long[] jArr = o41Var2.d.f21012a;
            tL_loadAsyncGraph.f28667x = jArr[jArr.length - 1];
            tL_loadAsyncGraph.flags |= 1;
            ConnectionsManager.getInstance(og0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(og0Var.currentAccount).sendRequest(tL_loadAsyncGraph, new z9(og0Var, og0Var.f50594r.f50477g + "_" + tL_loadAsyncGraph.f28667x, tL_loadAsyncGraph, 24), null, null, 0, og0Var.f50582a.stats_dc, 1, true), og0Var.classGuid);
            return;
        }
        og0Var.m0();
    }

    public static void a0(og0 og0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z10;
        ArrayList arrayList = og0Var.f50598y;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                og0Var.H = tL_publicForwards.next_offset;
            } else {
                og0Var.H = null;
            }
            int i7 = tL_publicForwards.count;
            if (i7 != 0) {
                og0Var.V = i7;
            } else if (og0Var.V == 0) {
                og0Var.V = tL_publicForwards.forwards.size();
            }
            if (og0Var.H == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            og0Var.W = z10;
            og0Var.getMessagesController().Z3(tL_publicForwards.chats, false);
            og0Var.getMessagesController().f4(tL_publicForwards.users, false);
            ArrayList<TL_stats.PublicForward> arrayList2 = tL_publicForwards.forwards;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TL_stats.PublicForward publicForward = arrayList2.get(i10);
                i10++;
                TL_stats.PublicForward publicForward2 = publicForward;
                if (publicForward2 instanceof TL_stories.TL_publicForwardStory) {
                    TL_stories.TL_publicForwardStory tL_publicForwardStory = (TL_stories.TL_publicForwardStory) publicForward2;
                    tL_publicForwardStory.story.dialogId = org.telegram.messenger.n5.o(tL_publicForwardStory.peer);
                    TL_stories.StoryItem storyItem = tL_publicForwardStory.story;
                    storyItem.messageId = storyItem.f28673id;
                    org.telegram.messenger.gj gjVar = new org.telegram.messenger.gj(og0Var.currentAccount, storyItem);
                    gjVar.r0(false);
                    arrayList.add(gjVar);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new org.telegram.messenger.gj(og0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.vy vyVar = og0Var.f50589e;
            if (vyVar != null) {
                vyVar.c();
            }
        }
        og0Var.G = true;
        og0Var.F = false;
        og0Var.m0();
    }

    public static void b0(og0 og0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z10;
        ArrayList arrayList = og0Var.f50598y;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                og0Var.H = tL_publicForwards.next_offset;
            } else {
                og0Var.H = null;
            }
            int i7 = tL_publicForwards.count;
            if (i7 != 0) {
                og0Var.V = i7;
            } else if (og0Var.V == 0) {
                og0Var.V = tL_publicForwards.forwards.size();
            }
            if (og0Var.H == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            og0Var.W = z10;
            og0Var.getMessagesController().Z3(tL_publicForwards.chats, false);
            og0Var.getMessagesController().f4(tL_publicForwards.users, false);
            ArrayList<TL_stats.PublicForward> arrayList2 = tL_publicForwards.forwards;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TL_stats.PublicForward publicForward = arrayList2.get(i10);
                i10++;
                TL_stats.PublicForward publicForward2 = publicForward;
                if (publicForward2 instanceof TL_stories.TL_publicForwardStory) {
                    TL_stories.TL_publicForwardStory tL_publicForwardStory = (TL_stories.TL_publicForwardStory) publicForward2;
                    tL_publicForwardStory.story.dialogId = org.telegram.messenger.n5.o(tL_publicForwardStory.peer);
                    TL_stories.StoryItem storyItem = tL_publicForwardStory.story;
                    storyItem.messageId = storyItem.f28673id;
                    org.telegram.messenger.gj gjVar = new org.telegram.messenger.gj(og0Var.currentAccount, storyItem);
                    gjVar.r0(false);
                    arrayList.add(gjVar);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new org.telegram.messenger.gj(og0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.vy vyVar = og0Var.f50589e;
            if (vyVar != null) {
                vyVar.c();
            }
        }
        og0Var.G = true;
        og0Var.F = false;
        og0Var.m0();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29345b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29382d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29473i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29661s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.ik));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        CharSequence charSequence;
        String str;
        int i10;
        this.actionBar.setBackButtonImage(2131231240);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29324a7, frameLayout, getResourceProvider());
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.vy vyVar = new org.telegram.ui.Components.vy(context, null);
        this.f50589e = vyVar;
        vyVar.setText(org.telegram.messenger.hd.N0(2131747974, null));
        this.f50589e.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        this.T = imageView;
        imageView.setAutoRepeat(true);
        this.T.f(2131624229, 120, 120, null);
        this.T.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i11 = org.telegram.ui.ActionBar.m6.Fj;
        org.telegram.ui.ActionBar.t6.U(textView, i11, getResourceProvider());
        textView.setTag(Integer.valueOf(i11));
        textView.setText(org.telegram.messenger.hd.N0(2131748584, null));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i12 = org.telegram.ui.ActionBar.m6.Gj;
        org.telegram.ui.ActionBar.t6.U(textView2, i12, getResourceProvider());
        textView2.setTag(Integer.valueOf(i12));
        textView2.setText(org.telegram.messenger.hd.N0(2131748583, null));
        textView2.setGravity(1);
        this.U.addView(this.T, c8.ma.t(120, 120, 1, 0, 0, 0, 20));
        this.U.addView(textView, c8.ma.t(-2, -2, 1, 0, 0, 0, 10));
        this.U.addView(textView2, c8.ma.r(-2, -2, 1));
        float f10 = 0.0f;
        this.U.setAlpha(0.0f);
        frameLayout2.addView(this.U, c8.ma.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, getResourceProvider());
        this.f50591f = ek0Var;
        ek0Var.r1();
        org.telegram.ui.Components.ek0 ek0Var2 = this.f50591f;
        v4.c0 c0Var = new v4.c0(1, false);
        this.h = c0Var;
        ek0Var2.setLayoutManager(c0Var);
        ((v4.h1) this.f50591f.getItemAnimator()).f59194m = false;
        org.telegram.ui.Components.ek0 ek0Var3 = this.f50591f;
        mg0 mg0Var = new mg0(this, context);
        this.d = mg0Var;
        ek0Var3.setAdapter(mg0Var);
        org.telegram.ui.Components.ek0 ek0Var4 = this.f50591f;
        if (org.telegram.messenger.hd.f24444a0) {
            i7 = 1;
        } else {
            i7 = 2;
        }
        ek0Var4.setVerticalScrollbarPosition(i7);
        this.actionBar.setAdaptiveBackground(this.f50591f);
        this.f50591f.setOnItemClickListener(new h(this, 18));
        this.f50591f.setOnItemLongClickListener(new zr(this, 23));
        this.f50591f.setOnScrollListener(new g3(this, 20));
        this.f50589e.c();
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f50585b0 = frameLayout3;
        frameLayout3.addView(this.f50591f, c8.ma.c(-1.0f, -1));
        this.f50585b0.addView(this.f50589e, c8.ma.c(-1.0f, -1));
        this.f50585b0.setVisibility(8);
        frameLayout2.addView(this.f50585b0, c8.ma.c(-1.0f, -1));
        org.telegram.messenger.g0.h3(this.f50583a0, 300L);
        m0();
        this.f50591f.setEmptyView(this.f50589e);
        this.f50587c0 = new ig0(this, context);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.X = imageReceiver;
        imageReceiver.H0(this.f50587c0);
        this.X.J0(org.telegram.messenger.g0.L(9.0f));
        this.Z = false;
        org.telegram.messenger.gj gjVar = this.f50593n;
        int i13 = 50;
        if (!gjVar.x4()) {
            if (!gjVar.m5() && (org.telegram.messenger.gj.S3(gjVar.f24213k) || gjVar.L3() || org.telegram.messenger.gj.L4(gjVar.f24213k))) {
                if (gjVar.Z4()) {
                    str = gjVar.f24213k.media.webpage.type;
                } else {
                    str = null;
                }
                if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && (str == null || !str.startsWith("telegram_"))) {
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(gjVar.f24233p0, 50, false, null, false);
                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(gjVar.f24233p0, org.telegram.messenger.g0.Z0(false), false, null, false);
                    if (w10 == w11) {
                        w11 = null;
                    }
                    if (w10 != null) {
                        this.Z = true;
                        this.Y = org.telegram.messenger.gj.L4(gjVar.f24213k);
                        String r10 = org.telegram.messenger.w7.r(null, w11);
                        if (!gjVar.f24272z0 && !org.telegram.messenger.a6.q(this.currentAccount).d(gjVar) && !org.telegram.messenger.w7.G(this.currentAccount).S(r10)) {
                            this.X.s0(null, null, org.telegram.messenger.gc.f(w10, gjVar.f24226n0), "50_50", null, this.f50593n, 0);
                        } else {
                            if (gjVar.D == 1 && w11 != null) {
                                i10 = w11.size;
                            } else {
                                i10 = 0;
                            }
                            this.X.r0(org.telegram.messenger.gc.f(w11, gjVar.f24226n0), "50_50", org.telegram.messenger.gc.f(w10, gjVar.f24226n0), "50_50", null, i10, null, this.f50593n, 0);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(gjVar.f24271z)) {
                charSequence = gjVar.f24271z;
            } else if (!TextUtils.isEmpty(gjVar.f24213k.message)) {
                CharSequence charSequence2 = gjVar.v;
                if (charSequence2.length() > 150) {
                    charSequence2 = charSequence2.subSequence(0, 150);
                }
                charSequence = org.telegram.messenger.j6.m(charSequence2, this.f50587c0.getSubtitlePaint().getFontMetricsInt(), false, null, 0);
            } else {
                charSequence = gjVar.v;
            }
            if (!org.telegram.messenger.gj.L4(gjVar.f24213k) && !org.telegram.messenger.gj.S3(gjVar.f24213k)) {
                this.f50587c0.setSubtitle(charSequence);
            } else {
                ig0 ig0Var = this.f50587c0;
                if (ig0Var.getSubtitleTextView() != null) {
                    ig0Var.getSubtitleTextView().setVisibility(8);
                }
            }
        }
        if (!this.Z && !gjVar.x4()) {
            i13 = 56;
        } else {
            this.f50587c0.setRightAvatarPadding(-org.telegram.messenger.g0.L(3.0f));
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        ig0 ig0Var2 = this.f50587c0;
        if (!this.inPreviewMode) {
            f10 = i13;
        }
        kVar.addView(ig0Var2, 0, c8.ma.d(-2, -1.0f, 51, f10, 0.0f, 40.0f, 0.0f));
        k0();
        this.f50587c0.i(org.telegram.ui.ActionBar.m6.w0(i11, getResourceProvider()), org.telegram.ui.ActionBar.m6.w0(i12, getResourceProvider()));
        View subtitleTextView = this.f50587c0.getSubtitleTextView();
        if (subtitleTextView instanceof org.telegram.ui.ActionBar.m5) {
            ((org.telegram.ui.ActionBar.m5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.m6.w0(i12, getResourceProvider()));
        }
        org.telegram.ui.ActionBar.t6.l(this.actionBar, 1, org.telegram.ui.ActionBar.m6.G6, getResourceProvider());
        org.telegram.ui.ActionBar.t6.l(this.actionBar, 3, org.telegram.ui.ActionBar.m6.f29794z8, getResourceProvider());
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.actionBar.setActionBarMenuOnItemClick(new dv(this, 20));
        this.f50587c0.setOnClickListener(new j40(this, 11));
        l0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.f50582a == null && chatFull.f28435id == this.f50584b) {
                k0();
                this.f50582a = chatFull;
                i0();
                h0();
                l0();
            }
        }
    }

    public final void f0() {
        View subtitleTextView;
        org.telegram.ui.Components.ek0 ek0Var = this.f50591f;
        if (ek0Var != null) {
            int childCount = ek0Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                j0(this.f50591f.getChildAt(i7));
            }
            int hiddenChildCount = this.f50591f.getHiddenChildCount();
            for (int i10 = 0; i10 < hiddenChildCount; i10++) {
                j0(this.f50591f.V(i10));
            }
            int cachedChildCount = this.f50591f.getCachedChildCount();
            for (int i11 = 0; i11 < cachedChildCount; i11++) {
                j0(this.f50591f.P(i11));
            }
            int attachedScrapChildCount = this.f50591f.getAttachedScrapChildCount();
            for (int i12 = 0; i12 < attachedScrapChildCount; i12++) {
                j0(this.f50591f.O(i12));
            }
            this.f50591f.getRecycledViewPool().a();
        }
        lg.f fVar = this.f50588d0;
        if (fVar != null) {
            fVar.f19796c = true;
        }
        ig0 ig0Var = this.f50587c0;
        if (ig0Var == null) {
            subtitleTextView = null;
        } else {
            subtitleTextView = ig0Var.getSubtitleTextView();
        }
        if (subtitleTextView instanceof org.telegram.ui.ActionBar.m5) {
            ((org.telegram.ui.ActionBar.m5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Gj, getResourceProvider()));
        }
    }

    public final boolean g0(org.telegram.messenger.gj gjVar) {
        if (gjVar.x4() && (gjVar.f24218l instanceof TL_stories.TL_storyItemDeleted)) {
            org.telegram.messenger.f3.n(null, 2131744363, org.telegram.ui.Components.lc.b0(this), 2131624236, 36);
            return true;
        }
        return false;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.m5 m5Var;
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(13, this);
        ig0 ig0Var = this.f50587c0;
        View view = null;
        if (ig0Var != null) {
            m5Var = ig0Var.getTitleTextView();
        } else {
            m5Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(m5Var, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Fj));
        ig0 ig0Var2 = this.f50587c0;
        if (ig0Var2 != null) {
            view = ig0Var2.getSubtitleTextView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(org.telegram.ui.ActionBar.m6.Gj, view));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f50591f, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.f29773y6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f50591f, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.f29563n6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.F8));
        c51.n0(this.f50594r, arrayList, f6Var);
        c51.n0(this.f50595s, arrayList, f6Var);
        return arrayList;
    }

    public final void h0() {
        if (this.F) {
            return;
        }
        this.F = true;
        mg0 mg0Var = this.d;
        if (mg0Var != null) {
            mg0Var.f();
        }
        org.telegram.messenger.gj gjVar = this.f50593n;
        String str = "";
        if (gjVar.x4()) {
            TL_stats.TL_getStoryPublicForwards tL_getStoryPublicForwards = new TL_stats.TL_getStoryPublicForwards();
            tL_getStoryPublicForwards.limit = 100;
            tL_getStoryPublicForwards.f28666id = gjVar.f24218l.f28673id;
            tL_getStoryPublicForwards.peer = getMessagesController().l1(-this.f50584b);
            String str2 = this.H;
            if (str2 != null) {
                str = str2;
            }
            tL_getStoryPublicForwards.offset = str;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getStoryPublicForwards, new gg0(this, 1), null, null, 0, this.f50582a.stats_dc, 1, true), this.classGuid);
            return;
        }
        TL_stats.TL_getMessagePublicForwards tL_getMessagePublicForwards = new TL_stats.TL_getMessagePublicForwards();
        tL_getMessagePublicForwards.limit = 100;
        TLRPC.MessageFwdHeader messageFwdHeader = gjVar.f24213k.fwd_from;
        if (messageFwdHeader != null) {
            tL_getMessagePublicForwards.msg_id = messageFwdHeader.saved_from_msg_id;
            tL_getMessagePublicForwards.channel = getMessagesController().j1(-gjVar.Z0());
        } else {
            tL_getMessagePublicForwards.msg_id = gjVar.e1();
            tL_getMessagePublicForwards.channel = getMessagesController().j1(-org.telegram.messenger.gj.B0(gjVar.f24213k));
        }
        String str3 = this.H;
        if (str3 != null) {
            str = str3;
        }
        tL_getMessagePublicForwards.offset = str;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getMessagePublicForwards, new gg0(this, 2), null, null, 0, this.f50582a.stats_dc, 1, true), this.classGuid);
    }

    public final void i0() {
        TL_stats.TL_getMessageStats tL_getMessageStats;
        org.telegram.messenger.gj gjVar = this.f50593n;
        if (gjVar.x4()) {
            TL_stories.TL_stats_getStoryStats tL_stats_getStoryStats = new TL_stories.TL_stats_getStoryStats();
            tL_stats_getStoryStats.f28675id = gjVar.f24218l.f28673id;
            tL_stats_getStoryStats.peer = getMessagesController().l1(-this.f50584b);
            tL_getMessageStats = tL_stats_getStoryStats;
        } else {
            TL_stats.TL_getMessageStats tL_getMessageStats2 = new TL_stats.TL_getMessageStats();
            TLRPC.MessageFwdHeader messageFwdHeader = gjVar.f24213k.fwd_from;
            if (messageFwdHeader != null) {
                tL_getMessageStats2.msg_id = messageFwdHeader.saved_from_msg_id;
                tL_getMessageStats2.channel = getMessagesController().j1(-gjVar.Z0());
                tL_getMessageStats = tL_getMessageStats2;
            } else {
                tL_getMessageStats2.msg_id = gjVar.e1();
                tL_getMessageStats2.channel = getMessagesController().j1(-org.telegram.messenger.gj.B0(gjVar.f24213k));
                tL_getMessageStats = tL_getMessageStats2;
            }
        }
        getConnectionsManager().sendRequest(tL_getMessageStats, new gg0(this, 0), null, null, 0, this.f50582a.stats_dc, 1, true);
    }

    @Override
    public boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29381d6, getResourceProvider())) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public final void j0(View view) {
        if (view instanceof org.telegram.ui.Cells.b5) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29773y6, getResourceProvider());
            int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29563n6, getResourceProvider());
            b5Var.P = true;
            b5Var.I = w02;
            b5Var.J = w03;
            b5Var.d(0);
        } else if (view instanceof m41) {
            ((m41) view).d();
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29381d6, view, getResourceProvider());
        } else {
            boolean z10 = view instanceof org.telegram.ui.Cells.z6;
            if (z10 && (view.getBackground() instanceof org.telegram.ui.Components.oq) && (((org.telegram.ui.Components.oq) view.getBackground()).f38329a instanceof ColorDrawable)) {
                ((ColorDrawable) ((org.telegram.ui.Components.oq) view.getBackground()).f38329a).setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29324a7, getResourceProvider()));
                view.invalidate();
            } else if (z10) {
                org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(new ColorDrawable(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29324a7, getResourceProvider())), org.telegram.ui.ActionBar.m6.Y0(org.telegram.messenger.t0.f26931b, 2131231229, org.telegram.ui.ActionBar.m6.f29345b7), 0, 0);
                oqVar.f38338x = true;
                view.setBackground(oqVar);
            } else if (view instanceof ng.c) {
                ((ng.c) view).a();
            } else if (view instanceof ng0) {
                int i7 = ng0.d;
                ((ng0) view).a();
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29381d6, view, getResourceProvider());
            }
        }
        if (view instanceof org.telegram.ui.Cells.n3) {
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29381d6, view, getResourceProvider());
        }
    }

    public final void k0() {
        org.telegram.messenger.gj gjVar = this.f50593n;
        if (gjVar.x4()) {
            this.f50587c0.setTitle(org.telegram.messenger.hd.N0(2131744215, null));
            ig0 ig0Var = this.f50587c0;
            if (ig0Var.getSubtitleTextView() != null) {
                ig0Var.getSubtitleTextView().setVisibility(8);
            }
            ig0 ig0Var2 = this.f50587c0;
            ig0Var2.f34229b = true;
            ig0Var2.setStoriesForceState(1);
            ArrayList arrayList = gjVar.f24233p0;
            if (arrayList != null) {
                this.f50587c0.getAvatarImageView().l(org.telegram.messenger.gc.f(org.telegram.messenger.w7.w(arrayList, org.telegram.messenger.g0.Z0(false), false, null, false), gjVar.f24226n0), "50_50", org.telegram.messenger.gc.f(org.telegram.messenger.w7.w(gjVar.f24233p0, 50, false, null, false), gjVar.f24226n0), "b1", 0, this.f50593n);
                this.f50587c0.setClipChildren(false);
                this.f50587c0.getAvatarImageView().setScaleX(0.96f);
                this.f50587c0.getAvatarImageView().setScaleY(0.96f);
                return;
            }
            return;
        }
        this.f50587c0.setTitle(org.telegram.messenger.hd.N0(2131746903, null));
        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.f50584b));
        if (O0 != null && !this.Z) {
            this.f50587c0.setChatAvatar(O0);
        }
    }

    public final void l0() {
        TLRPC.ChatFull chatFull;
        if (this.f50590e0 && (chatFull = this.f50582a) != null && chatFull.can_view_stats) {
            org.telegram.ui.ActionBar.y s5 = this.actionBar.s();
            ArrayList arrayList = s5.f30285e;
            if (arrayList != null) {
                arrayList.clear();
            }
            s5.removeAllViews();
            s5.a(0, 2131231244).e(1, 2131232380, org.telegram.messenger.hd.N0(2131743314, null));
        }
    }

    public final void m0() {
        a0.g gVar = this.S;
        gVar.clear();
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.P = -1;
        this.O = -1;
        this.R = 0;
        if (this.G && this.E) {
            org.telegram.messenger.g0.r(this.f50583a0);
            if (this.f50585b0.getVisibility() == 8) {
                this.U.animate().alpha(0.0f).setListener(new ay(this, 6));
                this.f50585b0.setVisibility(0);
                this.f50585b0.setAlpha(0.0f);
                this.f50585b0.animate().alpha(1.0f).start();
            }
            int i7 = this.R;
            this.P = i7;
            this.O = i7 + 1;
            this.R = i7 + 3;
            gVar.add(Integer.valueOf(i7 + 2));
            if (this.f50594r != null) {
                int i10 = this.R;
                this.M = i10;
                this.R = i10 + 2;
                gVar.add(Integer.valueOf(i10 + 1));
            }
            if (this.f50595s != null) {
                int i11 = this.R;
                this.N = i11;
                this.R = i11 + 2;
                gVar.add(Integer.valueOf(i11 + 1));
            }
            ArrayList arrayList = this.f50598y;
            if (!arrayList.isEmpty()) {
                int i12 = this.R;
                int i13 = i12 + 1;
                this.R = i13;
                this.I = i12;
                this.J = i13;
                int size = arrayList.size() + i13;
                this.K = size;
                this.Q = size;
                this.R = size + 2;
                gVar.add(Integer.valueOf(size + 1));
                if (!this.W) {
                    int i14 = this.R;
                    this.R = i14 + 1;
                    this.L = i14;
                }
            }
        }
        mg0 mg0Var = this.d;
        if (mg0Var != null) {
            mg0Var.f();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        if (this.f50582a != null) {
            i0();
            h0();
        } else {
            org.telegram.messenger.np.u1(this.currentAccount).b3(this.classGuid, this.f50584b, true);
        }
        org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.T);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.T);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
        mg0 mg0Var = this.d;
        if (mg0Var != null) {
            mg0Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            ig0 ig0Var = this.f50587c0;
            if (ig0Var != null) {
                ig0Var.i(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fj, getResourceProvider()), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Gj, getResourceProvider()));
            }
            f0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public og0(org.telegram.messenger.gj gjVar) {
        super(null);
        this.f50596w = new h2.j0(15, 2);
        this.f50598y = new ArrayList();
        this.H = null;
        this.S = new a0.g(0);
        this.f50583a0 = new m4(this, 12);
        this.f50593n = gjVar;
        if (gjVar.f24213k.fwd_from == null) {
            this.f50584b = gjVar.x0();
            this.f50586c = gjVar.e1();
        } else {
            this.f50584b = -gjVar.Z0();
            this.f50586c = gjVar.f24213k.fwd_msg_id;
        }
        this.f50582a = getMessagesController().P0(this.f50584b);
    }
}
