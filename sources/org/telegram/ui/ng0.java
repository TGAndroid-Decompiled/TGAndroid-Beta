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
public class ng0 extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
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
    public org.telegram.ui.Components.ph0 T;
    public LinearLayout U;
    public int V;
    public boolean W;
    public ImageReceiver X;
    public boolean Y;
    public boolean Z;
    public TLRPC.ChatFull f50176a;
    public final m4 f50177a0;
    public final long f50178b;
    public FrameLayout f50179b0;
    public final int f50180c;
    public ig0 f50181c0;
    public lg0 d;
    public lg.f f50182d0;
    public org.telegram.ui.Components.ty f50183e;
    public final boolean f50184e0;
    public org.telegram.ui.Components.ck0 f50185f;
    public z41 f50186f0;
    public v4.c0 h;
    public final org.telegram.messenger.fj f50187n;
    public o41 f50188r;
    public o41 f50189s;
    public final h2.j0 f50190w;
    public b51 f50191x;
    public final ArrayList f50192y;

    public ng0(long j3, org.telegram.messenger.fj fjVar, boolean z10) {
        super(null);
        this.f50190w = new h2.j0(15, 2);
        this.f50192y = new ArrayList();
        this.H = null;
        this.S = new a0.g(0);
        this.f50177a0 = new m4(this, 12);
        this.f50187n = fjVar;
        this.f50180c = 0;
        this.f50178b = j3;
        this.f50176a = getMessagesController().P0(j3);
        this.f50184e0 = z10;
    }

    public static void Z(ng0 ng0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        TL_stats.StatsGraph statsGraph;
        TL_stats.StatsGraph statsGraph2;
        ng0Var.E = true;
        if (tL_error != null) {
            ng0Var.m0();
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
        ng0Var.f50188r = c51.i0(statsGraph, org.telegram.messenger.gd.M0(2131743293, null), 1, false);
        ng0Var.f50189s = c51.i0(statsGraph2, org.telegram.messenger.gd.M0(2131746190, null), 2, false);
        o41 o41Var = ng0Var.f50188r;
        if (o41Var != null && o41Var.d.f20984a.length <= 5) {
            ng0Var.E = false;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            o41 o41Var2 = ng0Var.f50188r;
            tL_loadAsyncGraph.token = o41Var2.f50468g;
            long[] jArr = o41Var2.d.f20984a;
            tL_loadAsyncGraph.f28638x = jArr[jArr.length - 1];
            tL_loadAsyncGraph.flags |= 1;
            ConnectionsManager.getInstance(ng0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(ng0Var.currentAccount).sendRequest(tL_loadAsyncGraph, new z9(ng0Var, ng0Var.f50188r.f50468g + "_" + tL_loadAsyncGraph.f28638x, tL_loadAsyncGraph, 24), null, null, 0, ng0Var.f50176a.stats_dc, 1, true), ng0Var.classGuid);
            return;
        }
        ng0Var.m0();
    }

    public static void a0(ng0 ng0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z10;
        ArrayList arrayList = ng0Var.f50192y;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                ng0Var.H = tL_publicForwards.next_offset;
            } else {
                ng0Var.H = null;
            }
            int i7 = tL_publicForwards.count;
            if (i7 != 0) {
                ng0Var.V = i7;
            } else if (ng0Var.V == 0) {
                ng0Var.V = tL_publicForwards.forwards.size();
            }
            if (ng0Var.H == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ng0Var.W = z10;
            ng0Var.getMessagesController().Z3(tL_publicForwards.chats, false);
            ng0Var.getMessagesController().f4(tL_publicForwards.users, false);
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
                    storyItem.messageId = storyItem.f28644id;
                    org.telegram.messenger.fj fjVar = new org.telegram.messenger.fj(ng0Var.currentAccount, storyItem);
                    fjVar.r0(false);
                    arrayList.add(fjVar);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new org.telegram.messenger.fj(ng0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.ty tyVar = ng0Var.f50183e;
            if (tyVar != null) {
                tyVar.c();
            }
        }
        ng0Var.G = true;
        ng0Var.F = false;
        ng0Var.m0();
    }

    public static void b0(ng0 ng0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z10;
        ArrayList arrayList = ng0Var.f50192y;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                ng0Var.H = tL_publicForwards.next_offset;
            } else {
                ng0Var.H = null;
            }
            int i7 = tL_publicForwards.count;
            if (i7 != 0) {
                ng0Var.V = i7;
            } else if (ng0Var.V == 0) {
                ng0Var.V = tL_publicForwards.forwards.size();
            }
            if (ng0Var.H == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ng0Var.W = z10;
            ng0Var.getMessagesController().Z3(tL_publicForwards.chats, false);
            ng0Var.getMessagesController().f4(tL_publicForwards.users, false);
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
                    storyItem.messageId = storyItem.f28644id;
                    org.telegram.messenger.fj fjVar = new org.telegram.messenger.fj(ng0Var.currentAccount, storyItem);
                    fjVar.r0(false);
                    arrayList.add(fjVar);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new org.telegram.messenger.fj(ng0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.ty tyVar = ng0Var.f50183e;
            if (tyVar != null) {
                tyVar.c();
            }
        }
        ng0Var.G = true;
        ng0Var.F = false;
        ng0Var.m0();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29360b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29397d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29488i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29676s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ik));
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
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29339a7, frameLayout, getResourceProvider());
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.ty tyVar = new org.telegram.ui.Components.ty(context, null);
        this.f50183e = tyVar;
        tyVar.setText(org.telegram.messenger.gd.M0(2131747975, null));
        this.f50183e.setVisibility(8);
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
        int i11 = org.telegram.ui.ActionBar.n6.Fj;
        org.telegram.ui.ActionBar.u6.U(textView, i11, getResourceProvider());
        textView.setTag(Integer.valueOf(i11));
        textView.setText(org.telegram.messenger.gd.M0(2131748585, null));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i12 = org.telegram.ui.ActionBar.n6.Gj;
        org.telegram.ui.ActionBar.u6.U(textView2, i12, getResourceProvider());
        textView2.setTag(Integer.valueOf(i12));
        textView2.setText(org.telegram.messenger.gd.M0(2131748584, null));
        textView2.setGravity(1);
        this.U.addView(this.T, c8.ma.t(120, 120, 1, 0, 0, 0, 20));
        this.U.addView(textView, c8.ma.t(-2, -2, 1, 0, 0, 0, 10));
        this.U.addView(textView2, c8.ma.r(-2, -2, 1));
        float f10 = 0.0f;
        this.U.setAlpha(0.0f);
        frameLayout2.addView(this.U, c8.ma.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, getResourceProvider());
        this.f50185f = ck0Var;
        ck0Var.r1();
        org.telegram.ui.Components.ck0 ck0Var2 = this.f50185f;
        v4.c0 c0Var = new v4.c0(1, false);
        this.h = c0Var;
        ck0Var2.setLayoutManager(c0Var);
        ((v4.h1) this.f50185f.getItemAnimator()).f59151m = false;
        org.telegram.ui.Components.ck0 ck0Var3 = this.f50185f;
        lg0 lg0Var = new lg0(this, context);
        this.d = lg0Var;
        ck0Var3.setAdapter(lg0Var);
        org.telegram.ui.Components.ck0 ck0Var4 = this.f50185f;
        if (org.telegram.messenger.gd.f24216a0) {
            i7 = 1;
        } else {
            i7 = 2;
        }
        ck0Var4.setVerticalScrollbarPosition(i7);
        this.actionBar.setAdaptiveBackground(this.f50185f);
        this.f50185f.setOnItemClickListener(new h(this, 18));
        this.f50185f.setOnItemLongClickListener(new zr(this, 23));
        this.f50185f.setOnScrollListener(new g3(this, 20));
        this.f50183e.c();
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f50179b0 = frameLayout3;
        frameLayout3.addView(this.f50185f, c8.ma.c(-1.0f, -1));
        this.f50179b0.addView(this.f50183e, c8.ma.c(-1.0f, -1));
        this.f50179b0.setVisibility(8);
        frameLayout2.addView(this.f50179b0, c8.ma.c(-1.0f, -1));
        org.telegram.messenger.g0.h3(this.f50177a0, 300L);
        m0();
        this.f50185f.setEmptyView(this.f50183e);
        this.f50181c0 = new ig0(this, context);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.X = imageReceiver;
        imageReceiver.H0(this.f50181c0);
        this.X.J0(org.telegram.messenger.g0.L(9.0f));
        this.Z = false;
        org.telegram.messenger.fj fjVar = this.f50187n;
        int i13 = 50;
        if (!fjVar.x4()) {
            if (!fjVar.m5() && (org.telegram.messenger.fj.S3(fjVar.f23968k) || fjVar.L3() || org.telegram.messenger.fj.L4(fjVar.f23968k))) {
                if (fjVar.Z4()) {
                    str = fjVar.f23968k.media.webpage.type;
                } else {
                    str = null;
                }
                if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && (str == null || !str.startsWith("telegram_"))) {
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(fjVar.f23988p0, 50, false, null, false);
                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(fjVar.f23988p0, org.telegram.messenger.g0.Z0(false), false, null, false);
                    if (w10 == w11) {
                        w11 = null;
                    }
                    if (w10 != null) {
                        this.Z = true;
                        this.Y = org.telegram.messenger.fj.L4(fjVar.f23968k);
                        String r10 = org.telegram.messenger.w7.r(null, w11);
                        if (!fjVar.f24027z0 && !org.telegram.messenger.a6.q(this.currentAccount).d(fjVar) && !org.telegram.messenger.w7.G(this.currentAccount).S(r10)) {
                            this.X.s0(null, null, org.telegram.messenger.fc.f(w10, fjVar.f23981n0), "50_50", null, this.f50187n, 0);
                        } else {
                            if (fjVar.D == 1 && w11 != null) {
                                i10 = w11.size;
                            } else {
                                i10 = 0;
                            }
                            this.X.r0(org.telegram.messenger.fc.f(w11, fjVar.f23981n0), "50_50", org.telegram.messenger.fc.f(w10, fjVar.f23981n0), "50_50", null, i10, null, this.f50187n, 0);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(fjVar.f24026z)) {
                charSequence = fjVar.f24026z;
            } else if (!TextUtils.isEmpty(fjVar.f23968k.message)) {
                CharSequence charSequence2 = fjVar.v;
                if (charSequence2.length() > 150) {
                    charSequence2 = charSequence2.subSequence(0, 150);
                }
                charSequence = org.telegram.messenger.j6.m(charSequence2, this.f50181c0.getSubtitlePaint().getFontMetricsInt(), false, null, 0);
            } else {
                charSequence = fjVar.v;
            }
            if (!org.telegram.messenger.fj.L4(fjVar.f23968k) && !org.telegram.messenger.fj.S3(fjVar.f23968k)) {
                this.f50181c0.setSubtitle(charSequence);
            } else {
                ig0 ig0Var = this.f50181c0;
                if (ig0Var.getSubtitleTextView() != null) {
                    ig0Var.getSubtitleTextView().setVisibility(8);
                }
            }
        }
        if (!this.Z && !fjVar.x4()) {
            i13 = 56;
        } else {
            this.f50181c0.setRightAvatarPadding(-org.telegram.messenger.g0.L(3.0f));
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        ig0 ig0Var2 = this.f50181c0;
        if (!this.inPreviewMode) {
            f10 = i13;
        }
        kVar.addView(ig0Var2, 0, c8.ma.d(-2, -1.0f, 51, f10, 0.0f, 40.0f, 0.0f));
        k0();
        this.f50181c0.i(org.telegram.ui.ActionBar.n6.w0(i11, getResourceProvider()), org.telegram.ui.ActionBar.n6.w0(i12, getResourceProvider()));
        View subtitleTextView = this.f50181c0.getSubtitleTextView();
        if (subtitleTextView instanceof org.telegram.ui.ActionBar.n5) {
            ((org.telegram.ui.ActionBar.n5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.n6.w0(i12, getResourceProvider()));
        }
        org.telegram.ui.ActionBar.u6.l(this.actionBar, 1, org.telegram.ui.ActionBar.n6.G6, getResourceProvider());
        org.telegram.ui.ActionBar.u6.l(this.actionBar, 3, org.telegram.ui.ActionBar.n6.f29809z8, getResourceProvider());
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.actionBar.setActionBarMenuOnItemClick(new dv(this, 20));
        this.f50181c0.setOnClickListener(new j40(this, 11));
        l0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.f50176a == null && chatFull.f28406id == this.f50178b) {
                k0();
                this.f50176a = chatFull;
                i0();
                h0();
                l0();
            }
        }
    }

    public final void f0() {
        View subtitleTextView;
        org.telegram.ui.Components.ck0 ck0Var = this.f50185f;
        if (ck0Var != null) {
            int childCount = ck0Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                j0(this.f50185f.getChildAt(i7));
            }
            int hiddenChildCount = this.f50185f.getHiddenChildCount();
            for (int i10 = 0; i10 < hiddenChildCount; i10++) {
                j0(this.f50185f.V(i10));
            }
            int cachedChildCount = this.f50185f.getCachedChildCount();
            for (int i11 = 0; i11 < cachedChildCount; i11++) {
                j0(this.f50185f.P(i11));
            }
            int attachedScrapChildCount = this.f50185f.getAttachedScrapChildCount();
            for (int i12 = 0; i12 < attachedScrapChildCount; i12++) {
                j0(this.f50185f.O(i12));
            }
            this.f50185f.getRecycledViewPool().a();
        }
        lg.f fVar = this.f50182d0;
        if (fVar != null) {
            fVar.f19768c = true;
        }
        ig0 ig0Var = this.f50181c0;
        if (ig0Var == null) {
            subtitleTextView = null;
        } else {
            subtitleTextView = ig0Var.getSubtitleTextView();
        }
        if (subtitleTextView instanceof org.telegram.ui.ActionBar.n5) {
            ((org.telegram.ui.ActionBar.n5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Gj, getResourceProvider()));
        }
    }

    public final boolean g0(org.telegram.messenger.fj fjVar) {
        if (fjVar.x4() && (fjVar.f23973l instanceof TL_stories.TL_storyItemDeleted)) {
            org.telegram.messenger.f3.n(null, 2131744371, org.telegram.ui.Components.lc.b0(this), 2131624236, 36);
            return true;
        }
        return false;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.n5 n5Var;
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(13, this);
        ig0 ig0Var = this.f50181c0;
        View view = null;
        if (ig0Var != null) {
            n5Var = ig0Var.getTitleTextView();
        } else {
            n5Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6(n5Var, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Fj));
        ig0 ig0Var2 = this.f50181c0;
        if (ig0Var2 != null) {
            view = ig0Var2.getSubtitleTextView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6(org.telegram.ui.ActionBar.n6.Gj, view));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f50185f, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.f29788y6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f50185f, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.f29578n6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.F8));
        c51.n0(this.f50188r, arrayList, f6Var);
        c51.n0(this.f50189s, arrayList, f6Var);
        return arrayList;
    }

    public final void h0() {
        if (this.F) {
            return;
        }
        this.F = true;
        lg0 lg0Var = this.d;
        if (lg0Var != null) {
            lg0Var.f();
        }
        org.telegram.messenger.fj fjVar = this.f50187n;
        String str = "";
        if (fjVar.x4()) {
            TL_stats.TL_getStoryPublicForwards tL_getStoryPublicForwards = new TL_stats.TL_getStoryPublicForwards();
            tL_getStoryPublicForwards.limit = 100;
            tL_getStoryPublicForwards.f28637id = fjVar.f23973l.f28644id;
            tL_getStoryPublicForwards.peer = getMessagesController().l1(-this.f50178b);
            String str2 = this.H;
            if (str2 != null) {
                str = str2;
            }
            tL_getStoryPublicForwards.offset = str;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getStoryPublicForwards, new gg0(this, 1), null, null, 0, this.f50176a.stats_dc, 1, true), this.classGuid);
            return;
        }
        TL_stats.TL_getMessagePublicForwards tL_getMessagePublicForwards = new TL_stats.TL_getMessagePublicForwards();
        tL_getMessagePublicForwards.limit = 100;
        TLRPC.MessageFwdHeader messageFwdHeader = fjVar.f23968k.fwd_from;
        if (messageFwdHeader != null) {
            tL_getMessagePublicForwards.msg_id = messageFwdHeader.saved_from_msg_id;
            tL_getMessagePublicForwards.channel = getMessagesController().j1(-fjVar.Z0());
        } else {
            tL_getMessagePublicForwards.msg_id = fjVar.e1();
            tL_getMessagePublicForwards.channel = getMessagesController().j1(-org.telegram.messenger.fj.B0(fjVar.f23968k));
        }
        String str3 = this.H;
        if (str3 != null) {
            str = str3;
        }
        tL_getMessagePublicForwards.offset = str;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getMessagePublicForwards, new gg0(this, 2), null, null, 0, this.f50176a.stats_dc, 1, true), this.classGuid);
    }

    public final void i0() {
        TL_stats.TL_getMessageStats tL_getMessageStats;
        org.telegram.messenger.fj fjVar = this.f50187n;
        if (fjVar.x4()) {
            TL_stories.TL_stats_getStoryStats tL_stats_getStoryStats = new TL_stories.TL_stats_getStoryStats();
            tL_stats_getStoryStats.f28646id = fjVar.f23973l.f28644id;
            tL_stats_getStoryStats.peer = getMessagesController().l1(-this.f50178b);
            tL_getMessageStats = tL_stats_getStoryStats;
        } else {
            TL_stats.TL_getMessageStats tL_getMessageStats2 = new TL_stats.TL_getMessageStats();
            TLRPC.MessageFwdHeader messageFwdHeader = fjVar.f23968k.fwd_from;
            if (messageFwdHeader != null) {
                tL_getMessageStats2.msg_id = messageFwdHeader.saved_from_msg_id;
                tL_getMessageStats2.channel = getMessagesController().j1(-fjVar.Z0());
                tL_getMessageStats = tL_getMessageStats2;
            } else {
                tL_getMessageStats2.msg_id = fjVar.e1();
                tL_getMessageStats2.channel = getMessagesController().j1(-org.telegram.messenger.fj.B0(fjVar.f23968k));
                tL_getMessageStats = tL_getMessageStats2;
            }
        }
        getConnectionsManager().sendRequest(tL_getMessageStats, new gg0(this, 0), null, null, 0, this.f50176a.stats_dc, 1, true);
    }

    @Override
    public boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29396d6, getResourceProvider())) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public final void j0(View view) {
        if (view instanceof org.telegram.ui.Cells.a5) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29788y6, getResourceProvider());
            int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29578n6, getResourceProvider());
            a5Var.P = true;
            a5Var.I = w02;
            a5Var.J = w03;
            a5Var.d(0);
        } else if (view instanceof m41) {
            ((m41) view).d();
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, view, getResourceProvider());
        } else {
            boolean z10 = view instanceof org.telegram.ui.Cells.y6;
            if (z10 && (view.getBackground() instanceof org.telegram.ui.Components.mq) && (((org.telegram.ui.Components.mq) view.getBackground()).f37607a instanceof ColorDrawable)) {
                ((ColorDrawable) ((org.telegram.ui.Components.mq) view.getBackground()).f37607a).setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29339a7, getResourceProvider()));
                view.invalidate();
            } else if (z10) {
                org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(new ColorDrawable(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29339a7, getResourceProvider())), org.telegram.ui.ActionBar.n6.Y0(org.telegram.messenger.t0.f26915b, 2131231229, org.telegram.ui.ActionBar.n6.f29360b7), 0, 0);
                mqVar.f37616x = true;
                view.setBackground(mqVar);
            } else if (view instanceof ng.c) {
                ((ng.c) view).a();
            } else if (view instanceof mg0) {
                int i7 = mg0.d;
                ((mg0) view).a();
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, view, getResourceProvider());
            }
        }
        if (view instanceof org.telegram.ui.Cells.m3) {
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, view, getResourceProvider());
        }
    }

    public final void k0() {
        org.telegram.messenger.fj fjVar = this.f50187n;
        if (fjVar.x4()) {
            this.f50181c0.setTitle(org.telegram.messenger.gd.M0(2131744223, null));
            ig0 ig0Var = this.f50181c0;
            if (ig0Var.getSubtitleTextView() != null) {
                ig0Var.getSubtitleTextView().setVisibility(8);
            }
            ig0 ig0Var2 = this.f50181c0;
            ig0Var2.f33376b = true;
            ig0Var2.setStoriesForceState(1);
            ArrayList arrayList = fjVar.f23988p0;
            if (arrayList != null) {
                this.f50181c0.getAvatarImageView().l(org.telegram.messenger.fc.f(org.telegram.messenger.w7.w(arrayList, org.telegram.messenger.g0.Z0(false), false, null, false), fjVar.f23981n0), "50_50", org.telegram.messenger.fc.f(org.telegram.messenger.w7.w(fjVar.f23988p0, 50, false, null, false), fjVar.f23981n0), "b1", 0, this.f50187n);
                this.f50181c0.setClipChildren(false);
                this.f50181c0.getAvatarImageView().setScaleX(0.96f);
                this.f50181c0.getAvatarImageView().setScaleY(0.96f);
                return;
            }
            return;
        }
        this.f50181c0.setTitle(org.telegram.messenger.gd.M0(2131746904, null));
        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.f50178b));
        if (O0 != null && !this.Z) {
            this.f50181c0.setChatAvatar(O0);
        }
    }

    public final void l0() {
        TLRPC.ChatFull chatFull;
        if (this.f50184e0 && (chatFull = this.f50176a) != null && chatFull.can_view_stats) {
            org.telegram.ui.ActionBar.z t6 = this.actionBar.t();
            ArrayList arrayList = t6.f30301e;
            if (arrayList != null) {
                arrayList.clear();
            }
            t6.removeAllViews();
            t6.a(0, 2131231244).e(1, 2131232380, org.telegram.messenger.gd.M0(2131743322, null));
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
            org.telegram.messenger.g0.r(this.f50177a0);
            if (this.f50179b0.getVisibility() == 8) {
                this.U.animate().alpha(0.0f).setListener(new ay(this, 6));
                this.f50179b0.setVisibility(0);
                this.f50179b0.setAlpha(0.0f);
                this.f50179b0.animate().alpha(1.0f).start();
            }
            int i7 = this.R;
            this.P = i7;
            this.O = i7 + 1;
            this.R = i7 + 3;
            gVar.add(Integer.valueOf(i7 + 2));
            if (this.f50188r != null) {
                int i10 = this.R;
                this.M = i10;
                this.R = i10 + 2;
                gVar.add(Integer.valueOf(i10 + 1));
            }
            if (this.f50189s != null) {
                int i11 = this.R;
                this.N = i11;
                this.R = i11 + 2;
                gVar.add(Integer.valueOf(i11 + 1));
            }
            ArrayList arrayList = this.f50192y;
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
        lg0 lg0Var = this.d;
        if (lg0Var != null) {
            lg0Var.f();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        if (this.f50176a != null) {
            i0();
            h0();
        } else {
            org.telegram.messenger.mp.u1(this.currentAccount).b3(this.classGuid, this.f50178b, true);
        }
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.T);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.T);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
        lg0 lg0Var = this.d;
        if (lg0Var != null) {
            lg0Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            ig0 ig0Var = this.f50181c0;
            if (ig0Var != null) {
                ig0Var.i(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fj, getResourceProvider()), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Gj, getResourceProvider()));
            }
            f0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public ng0(org.telegram.messenger.fj fjVar) {
        super(null);
        this.f50190w = new h2.j0(15, 2);
        this.f50192y = new ArrayList();
        this.H = null;
        this.S = new a0.g(0);
        this.f50177a0 = new m4(this, 12);
        this.f50187n = fjVar;
        if (fjVar.f23968k.fwd_from == null) {
            this.f50178b = fjVar.x0();
            this.f50180c = fjVar.e1();
        } else {
            this.f50178b = -fjVar.Z0();
            this.f50180c = fjVar.f23968k.fwd_msg_id;
        }
        this.f50176a = getMessagesController().P0(this.f50178b);
    }
}
