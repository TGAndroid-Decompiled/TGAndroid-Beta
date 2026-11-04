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
public class dg0 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
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
    public org.telegram.ui.Components.fh0 T;
    public LinearLayout U;
    public int V;
    public boolean W;
    public ImageReceiver X;
    public boolean Y;
    public boolean Z;
    public TLRPC.ChatFull f44691a;
    public final o4 f44692a0;
    public final long f44693b;
    public FrameLayout f44694b0;
    public final int f44695c;
    public zf0 f44696c0;
    public bg0 d;
    public mg.f f44697d0;
    public org.telegram.ui.Components.gy f44698e;
    public final boolean f44699e0;
    public org.telegram.ui.Components.tj0 f44700f;
    public o41 f44701f0;
    public u4.b0 h;
    public final org.telegram.messenger.zi f44702n;
    public d41 f44703r;
    public d41 f44704s;
    public final g2.k0 f44705w;
    public q41 f44706x;
    public final ArrayList f44707y;

    public dg0(long j10, org.telegram.messenger.zi ziVar, boolean z10) {
        super(null);
        this.f44705w = new g2.k0(15, 3);
        this.f44707y = new ArrayList();
        this.H = null;
        this.S = new a0.g(0);
        this.f44692a0 = new o4(this, 12);
        this.f44702n = ziVar;
        this.f44695c = 0;
        this.f44693b = j10;
        this.f44691a = getMessagesController().N0(j10);
        this.f44699e0 = z10;
    }

    public static void Z(dg0 dg0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        TL_stats.StatsGraph statsGraph;
        TL_stats.StatsGraph statsGraph2;
        dg0Var.E = true;
        if (tL_error != null) {
            dg0Var.m0();
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
        dg0Var.f44703r = r41.i0(statsGraph, org.telegram.messenger.bd.M0(2131743540, null), 1, false);
        dg0Var.f44704s = r41.i0(statsGraph2, org.telegram.messenger.bd.M0(2131746393, null), 2, false);
        d41 d41Var = dg0Var.f44703r;
        if (d41Var != null && d41Var.d.f20373a.length <= 5) {
            dg0Var.E = false;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            d41 d41Var2 = dg0Var.f44703r;
            tL_loadAsyncGraph.token = d41Var2.f44543g;
            long[] jArr = d41Var2.d.f20373a;
            tL_loadAsyncGraph.f27234x = jArr[jArr.length - 1];
            tL_loadAsyncGraph.flags |= 1;
            ConnectionsManager.getInstance(dg0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(dg0Var.currentAccount).sendRequest(tL_loadAsyncGraph, new y9(dg0Var, dg0Var.f44703r.f44543g + "_" + tL_loadAsyncGraph.f27234x, tL_loadAsyncGraph, 24), null, null, 0, dg0Var.f44691a.stats_dc, 1, true), dg0Var.classGuid);
            return;
        }
        dg0Var.m0();
    }

    public static void a0(dg0 dg0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z10;
        ArrayList arrayList = dg0Var.f44707y;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                dg0Var.H = tL_publicForwards.next_offset;
            } else {
                dg0Var.H = null;
            }
            int i3 = tL_publicForwards.count;
            if (i3 != 0) {
                dg0Var.V = i3;
            } else if (dg0Var.V == 0) {
                dg0Var.V = tL_publicForwards.forwards.size();
            }
            if (dg0Var.H == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            dg0Var.W = z10;
            dg0Var.getMessagesController().S3(tL_publicForwards.chats, false);
            dg0Var.getMessagesController().Y3(tL_publicForwards.users, false);
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
                    storyItem.messageId = storyItem.f27240id;
                    org.telegram.messenger.zi ziVar = new org.telegram.messenger.zi(dg0Var.currentAccount, storyItem);
                    ziVar.r0(false);
                    arrayList.add(ziVar);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new org.telegram.messenger.zi(dg0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.gy gyVar = dg0Var.f44698e;
            if (gyVar != null) {
                gyVar.c();
            }
        }
        dg0Var.G = true;
        dg0Var.F = false;
        dg0Var.m0();
    }

    public static void b0(dg0 dg0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z10;
        ArrayList arrayList = dg0Var.f44707y;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                dg0Var.H = tL_publicForwards.next_offset;
            } else {
                dg0Var.H = null;
            }
            int i3 = tL_publicForwards.count;
            if (i3 != 0) {
                dg0Var.V = i3;
            } else if (dg0Var.V == 0) {
                dg0Var.V = tL_publicForwards.forwards.size();
            }
            if (dg0Var.H == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            dg0Var.W = z10;
            dg0Var.getMessagesController().S3(tL_publicForwards.chats, false);
            dg0Var.getMessagesController().Y3(tL_publicForwards.users, false);
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
                    storyItem.messageId = storyItem.f27240id;
                    org.telegram.messenger.zi ziVar = new org.telegram.messenger.zi(dg0Var.currentAccount, storyItem);
                    ziVar.r0(false);
                    arrayList.add(ziVar);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new org.telegram.messenger.zi(dg0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.gy gyVar = dg0Var.f44698e;
            if (gyVar != null) {
                gyVar.c();
            }
        }
        dg0Var.G = true;
        dg0Var.F = false;
        dg0Var.m0();
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27843b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.fk));
    }

    @Override
    public final View createView(Context context) {
        int i3;
        CharSequence charSequence;
        String str;
        int i10;
        this.actionBar.setBackButtonImage(2131231240);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27824a7, frameLayout, getResourceProvider());
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.gy gyVar = new org.telegram.ui.Components.gy(context, null);
        this.f44698e = gyVar;
        gyVar.setText(org.telegram.messenger.bd.M0(2131748175, null));
        this.f44698e.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        this.T = imageView;
        imageView.setAutoRepeat(true);
        this.T.f(2131624228, 120, 120, null);
        this.T.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i11 = org.telegram.ui.ActionBar.k6.Cj;
        org.telegram.ui.ActionBar.r6.V(textView, i11, getResourceProvider());
        textView.setTag(Integer.valueOf(i11));
        textView.setText(org.telegram.messenger.bd.M0(2131748785, null));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i12 = org.telegram.ui.ActionBar.k6.Dj;
        org.telegram.ui.ActionBar.r6.V(textView2, i12, getResourceProvider());
        textView2.setTag(Integer.valueOf(i12));
        textView2.setText(org.telegram.messenger.bd.M0(2131748784, null));
        textView2.setGravity(1);
        this.U.addView(this.T, b8.mf.t(120, 120, 1, 0, 0, 0, 20));
        this.U.addView(textView, b8.mf.t(-2, -2, 1, 0, 0, 0, 10));
        this.U.addView(textView2, b8.mf.r(-2, -2, 1));
        float f10 = 0.0f;
        this.U.setAlpha(0.0f);
        frameLayout2.addView(this.U, b8.mf.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, getResourceProvider());
        this.f44700f = tj0Var;
        tj0Var.r1();
        org.telegram.ui.Components.tj0 tj0Var2 = this.f44700f;
        u4.b0 b0Var = new u4.b0(1, false);
        this.h = b0Var;
        tj0Var2.setLayoutManager(b0Var);
        ((u4.f1) this.f44700f.getItemAnimator()).f55567m = false;
        org.telegram.ui.Components.tj0 tj0Var3 = this.f44700f;
        bg0 bg0Var = new bg0(this, context);
        this.d = bg0Var;
        tj0Var3.setAdapter(bg0Var);
        org.telegram.ui.Components.tj0 tj0Var4 = this.f44700f;
        if (org.telegram.messenger.bd.f21784a0) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        tj0Var4.setVerticalScrollbarPosition(i3);
        this.actionBar.setAdaptiveBackground(this.f44700f);
        this.f44700f.setOnItemClickListener(new h(this, 18));
        this.f44700f.setOnItemLongClickListener(new ur(this, 24));
        this.f44700f.setOnScrollListener(new h3(this, 20));
        this.f44698e.c();
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f44694b0 = frameLayout3;
        frameLayout3.addView(this.f44700f, b8.mf.c(-1.0f, -1));
        this.f44694b0.addView(this.f44698e, b8.mf.c(-1.0f, -1));
        this.f44694b0.setVisibility(8);
        frameLayout2.addView(this.f44694b0, b8.mf.c(-1.0f, -1));
        org.telegram.messenger.g0.i3(this.f44692a0, 300L);
        m0();
        this.f44700f.setEmptyView(this.f44698e);
        this.f44696c0 = new zf0(this, context);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.X = imageReceiver;
        imageReceiver.H0(this.f44696c0);
        this.X.J0(org.telegram.messenger.g0.L(9.0f));
        this.Z = false;
        org.telegram.messenger.zi ziVar = this.f44702n;
        int i13 = 50;
        if (!ziVar.y4()) {
            if (!ziVar.n5() && (org.telegram.messenger.zi.T3(ziVar.f26868k) || ziVar.M3() || org.telegram.messenger.zi.M4(ziVar.f26868k))) {
                if (ziVar.a5()) {
                    str = ziVar.f26868k.media.webpage.type;
                } else {
                    str = null;
                }
                if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && (str == null || !str.startsWith("telegram_"))) {
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(ziVar.f26878n0, 50, false, null, false);
                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(ziVar.f26878n0, org.telegram.messenger.g0.Z0(false), false, null, false);
                    if (w10 == w11) {
                        w11 = null;
                    }
                    if (w10 != null) {
                        this.Z = true;
                        this.Y = org.telegram.messenger.zi.M4(ziVar.f26868k);
                        String r5 = org.telegram.messenger.w7.r(null, w11);
                        if (!ziVar.f26917x0 && !org.telegram.messenger.z5.q(this.currentAccount).d(ziVar) && !org.telegram.messenger.w7.G(this.currentAccount).T(r5)) {
                            this.X.s0(null, null, org.telegram.messenger.ac.f(w10, ziVar.f26872l0), "50_50", null, this.f44702n, 0);
                        } else {
                            if (ziVar.D == 1 && w11 != null) {
                                i10 = w11.size;
                            } else {
                                i10 = 0;
                            }
                            this.X.r0(org.telegram.messenger.ac.f(w11, ziVar.f26872l0), "50_50", org.telegram.messenger.ac.f(w10, ziVar.f26872l0), "50_50", null, i10, null, this.f44702n, 0);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(ziVar.f26924z)) {
                charSequence = ziVar.f26924z;
            } else if (!TextUtils.isEmpty(ziVar.f26868k.message)) {
                CharSequence charSequence2 = ziVar.v;
                if (charSequence2.length() > 150) {
                    charSequence2 = charSequence2.subSequence(0, 150);
                }
                charSequence = org.telegram.messenger.i6.m(charSequence2, this.f44696c0.getSubtitlePaint().getFontMetricsInt(), false, null, 0);
            } else {
                charSequence = ziVar.v;
            }
            if (!org.telegram.messenger.zi.M4(ziVar.f26868k) && !org.telegram.messenger.zi.T3(ziVar.f26868k)) {
                this.f44696c0.setSubtitle(charSequence);
            } else {
                zf0 zf0Var = this.f44696c0;
                if (zf0Var.getSubtitleTextView() != null) {
                    zf0Var.getSubtitleTextView().setVisibility(8);
                }
            }
        }
        if (!this.Z && !ziVar.y4()) {
            i13 = 56;
        } else {
            this.f44696c0.setRightAvatarPadding(-org.telegram.messenger.g0.L(3.0f));
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        zf0 zf0Var2 = this.f44696c0;
        if (!this.inPreviewMode) {
            f10 = i13;
        }
        kVar.addView(zf0Var2, 0, b8.mf.d(-2, -1.0f, 51, f10, 0.0f, 40.0f, 0.0f));
        k0();
        this.f44696c0.i(org.telegram.ui.ActionBar.k6.w0(i11, getResourceProvider()), org.telegram.ui.ActionBar.k6.w0(i12, getResourceProvider()));
        View subtitleTextView = this.f44696c0.getSubtitleTextView();
        if (subtitleTextView instanceof org.telegram.ui.ActionBar.k5) {
            ((org.telegram.ui.ActionBar.k5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(i12, getResourceProvider()));
        }
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, org.telegram.ui.ActionBar.k6.G6, getResourceProvider());
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.f28292z8, getResourceProvider());
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        this.actionBar.setActionBarMenuOnItemClick(new hx(this, 18));
        this.f44696c0.setOnClickListener(new b40(this, 11));
        l0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.f44691a == null && chatFull.f27002id == this.f44693b) {
                k0();
                this.f44691a = chatFull;
                i0();
                h0();
                l0();
            }
        }
    }

    public final void f0() {
        View subtitleTextView;
        org.telegram.ui.Components.tj0 tj0Var = this.f44700f;
        if (tj0Var != null) {
            int childCount = tj0Var.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                j0(this.f44700f.getChildAt(i3));
            }
            int hiddenChildCount = this.f44700f.getHiddenChildCount();
            for (int i10 = 0; i10 < hiddenChildCount; i10++) {
                j0(this.f44700f.V(i10));
            }
            int cachedChildCount = this.f44700f.getCachedChildCount();
            for (int i11 = 0; i11 < cachedChildCount; i11++) {
                j0(this.f44700f.P(i11));
            }
            int attachedScrapChildCount = this.f44700f.getAttachedScrapChildCount();
            for (int i12 = 0; i12 < attachedScrapChildCount; i12++) {
                j0(this.f44700f.O(i12));
            }
            this.f44700f.getRecycledViewPool().a();
        }
        mg.f fVar = this.f44697d0;
        if (fVar != null) {
            fVar.f19307c = true;
        }
        zf0 zf0Var = this.f44696c0;
        if (zf0Var == null) {
            subtitleTextView = null;
        } else {
            subtitleTextView = zf0Var.getSubtitleTextView();
        }
        if (subtitleTextView instanceof org.telegram.ui.ActionBar.k5) {
            ((org.telegram.ui.ActionBar.k5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Dj, getResourceProvider()));
        }
    }

    public final boolean g0(org.telegram.messenger.zi ziVar) {
        if (ziVar.y4() && (ziVar.f26871l instanceof TL_stories.TL_storyItemDeleted)) {
            org.telegram.messenger.k5.o(null, 2131744616, org.telegram.ui.Components.fc.a0(this), 2131624235, 36);
            return true;
        }
        return false;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.k5 k5Var;
        ArrayList arrayList = new ArrayList();
        h6 h6Var = new h6(13, this);
        zf0 zf0Var = this.f44696c0;
        View view = null;
        if (zf0Var != null) {
            k5Var = zf0Var.getTitleTextView();
        } else {
            k5Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(k5Var, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Cj));
        zf0 zf0Var2 = this.f44696c0;
        if (zf0Var2 != null) {
            view = zf0Var2.getSubtitleTextView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(org.telegram.ui.ActionBar.k6.Dj, view));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44700f, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.f28273y6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44700f, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.f28062n6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.F8));
        r41.n0(this.f44703r, arrayList, h6Var);
        r41.n0(this.f44704s, arrayList, h6Var);
        return arrayList;
    }

    public final void h0() {
        if (this.F) {
            return;
        }
        this.F = true;
        bg0 bg0Var = this.d;
        if (bg0Var != null) {
            bg0Var.f();
        }
        org.telegram.messenger.zi ziVar = this.f44702n;
        String str = "";
        if (ziVar.y4()) {
            TL_stats.TL_getStoryPublicForwards tL_getStoryPublicForwards = new TL_stats.TL_getStoryPublicForwards();
            tL_getStoryPublicForwards.limit = 100;
            tL_getStoryPublicForwards.f27233id = ziVar.f26871l.f27240id;
            tL_getStoryPublicForwards.peer = getMessagesController().j1(-this.f44693b);
            String str2 = this.H;
            if (str2 != null) {
                str = str2;
            }
            tL_getStoryPublicForwards.offset = str;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getStoryPublicForwards, new xf0(this, 1), null, null, 0, this.f44691a.stats_dc, 1, true), this.classGuid);
            return;
        }
        TL_stats.TL_getMessagePublicForwards tL_getMessagePublicForwards = new TL_stats.TL_getMessagePublicForwards();
        tL_getMessagePublicForwards.limit = 100;
        TLRPC.MessageFwdHeader messageFwdHeader = ziVar.f26868k.fwd_from;
        if (messageFwdHeader != null) {
            tL_getMessagePublicForwards.msg_id = messageFwdHeader.saved_from_msg_id;
            tL_getMessagePublicForwards.channel = getMessagesController().h1(-ziVar.Z0());
        } else {
            tL_getMessagePublicForwards.msg_id = ziVar.f1();
            tL_getMessagePublicForwards.channel = getMessagesController().h1(-org.telegram.messenger.zi.B0(ziVar.f26868k));
        }
        String str3 = this.H;
        if (str3 != null) {
            str = str3;
        }
        tL_getMessagePublicForwards.offset = str;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getMessagePublicForwards, new xf0(this, 2), null, null, 0, this.f44691a.stats_dc, 1, true), this.classGuid);
    }

    public final void i0() {
        TL_stats.TL_getMessageStats tL_getMessageStats;
        org.telegram.messenger.zi ziVar = this.f44702n;
        if (ziVar.y4()) {
            TL_stories.TL_stats_getStoryStats tL_stats_getStoryStats = new TL_stories.TL_stats_getStoryStats();
            tL_stats_getStoryStats.f27242id = ziVar.f26871l.f27240id;
            tL_stats_getStoryStats.peer = getMessagesController().j1(-this.f44693b);
            tL_getMessageStats = tL_stats_getStoryStats;
        } else {
            TL_stats.TL_getMessageStats tL_getMessageStats2 = new TL_stats.TL_getMessageStats();
            TLRPC.MessageFwdHeader messageFwdHeader = ziVar.f26868k.fwd_from;
            if (messageFwdHeader != null) {
                tL_getMessageStats2.msg_id = messageFwdHeader.saved_from_msg_id;
                tL_getMessageStats2.channel = getMessagesController().h1(-ziVar.Z0());
                tL_getMessageStats = tL_getMessageStats2;
            } else {
                tL_getMessageStats2.msg_id = ziVar.f1();
                tL_getMessageStats2.channel = getMessagesController().h1(-org.telegram.messenger.zi.B0(ziVar.f26868k));
                tL_getMessageStats = tL_getMessageStats2;
            }
        }
        getConnectionsManager().sendRequest(tL_getMessageStats, new xf0(this, 0), null, null, 0, this.f44691a.stats_dc, 1, true);
    }

    @Override
    public boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, getResourceProvider())) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public final void j0(View view) {
        if (view instanceof org.telegram.ui.Cells.a5) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28273y6, getResourceProvider());
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28062n6, getResourceProvider());
            a5Var.P = true;
            a5Var.I = w02;
            a5Var.J = w03;
            a5Var.d(0);
        } else if (view instanceof b41) {
            ((b41) view).d();
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, view, getResourceProvider());
        } else {
            boolean z10 = view instanceof org.telegram.ui.Cells.x6;
            if (z10 && (view.getBackground() instanceof org.telegram.ui.Components.xp) && (((org.telegram.ui.Components.xp) view.getBackground()).f40438a instanceof ColorDrawable)) {
                ((ColorDrawable) ((org.telegram.ui.Components.xp) view.getBackground()).f40438a).setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27824a7, getResourceProvider()));
                view.invalidate();
            } else if (z10) {
                org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27824a7, getResourceProvider())), org.telegram.ui.ActionBar.k6.Y0(org.telegram.messenger.t0.f25457b, 2131231229, org.telegram.ui.ActionBar.k6.f27843b7), 0, 0);
                xpVar.f40447x = true;
                view.setBackground(xpVar);
            } else if (view instanceof og.c) {
                ((og.c) view).a();
            } else if (view instanceof cg0) {
                int i3 = cg0.d;
                ((cg0) view).a();
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, view, getResourceProvider());
            }
        }
        if (view instanceof org.telegram.ui.Cells.m3) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, view, getResourceProvider());
        }
    }

    public final void k0() {
        org.telegram.messenger.zi ziVar = this.f44702n;
        if (ziVar.y4()) {
            this.f44696c0.setTitle(org.telegram.messenger.bd.M0(2131744468, null));
            zf0 zf0Var = this.f44696c0;
            if (zf0Var.getSubtitleTextView() != null) {
                zf0Var.getSubtitleTextView().setVisibility(8);
            }
            zf0 zf0Var2 = this.f44696c0;
            zf0Var2.f35122b = true;
            zf0Var2.setStoriesForceState(1);
            ArrayList arrayList = ziVar.f26878n0;
            if (arrayList != null) {
                this.f44696c0.getAvatarImageView().l(org.telegram.messenger.ac.f(org.telegram.messenger.w7.w(arrayList, org.telegram.messenger.g0.Z0(false), false, null, false), ziVar.f26872l0), "50_50", org.telegram.messenger.ac.f(org.telegram.messenger.w7.w(ziVar.f26878n0, 50, false, null, false), ziVar.f26872l0), "b1", 0, this.f44702n);
                this.f44696c0.setClipChildren(false);
                this.f44696c0.getAvatarImageView().setScaleX(0.96f);
                this.f44696c0.getAvatarImageView().setScaleY(0.96f);
                return;
            }
            return;
        }
        this.f44696c0.setTitle(org.telegram.messenger.bd.M0(2131747105, null));
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f44693b));
        if (M0 != null && !this.Z) {
            this.f44696c0.setChatAvatar(M0);
        }
    }

    public final void l0() {
        TLRPC.ChatFull chatFull;
        if (this.f44699e0 && (chatFull = this.f44691a) != null && chatFull.can_view_stats) {
            org.telegram.ui.ActionBar.x q10 = this.actionBar.q();
            ArrayList arrayList = q10.f28788e;
            if (arrayList != null) {
                arrayList.clear();
            }
            q10.removeAllViews();
            q10.a(0, 2131231244).e(1, 2131232378, org.telegram.messenger.bd.M0(2131743569, null));
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
            org.telegram.messenger.g0.r(this.f44692a0);
            if (this.f44694b0.getVisibility() == 8) {
                this.U.animate().alpha(0.0f).setListener(new y20(this, 5));
                this.f44694b0.setVisibility(0);
                this.f44694b0.setAlpha(0.0f);
                this.f44694b0.animate().alpha(1.0f).start();
            }
            int i3 = this.R;
            this.P = i3;
            this.O = i3 + 1;
            this.R = i3 + 3;
            gVar.add(Integer.valueOf(i3 + 2));
            if (this.f44703r != null) {
                int i10 = this.R;
                this.M = i10;
                this.R = i10 + 2;
                gVar.add(Integer.valueOf(i10 + 1));
            }
            if (this.f44704s != null) {
                int i11 = this.R;
                this.N = i11;
                this.R = i11 + 2;
                gVar.add(Integer.valueOf(i11 + 1));
            }
            ArrayList arrayList = this.f44707y;
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
        bg0 bg0Var = this.d;
        if (bg0Var != null) {
            bg0Var.f();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        if (this.f44691a != null) {
            i0();
            h0();
        } else {
            org.telegram.messenger.hp.s1(this.currentAccount).V2(this.classGuid, this.f44693b, true);
        }
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.T);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.T);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        bg0 bg0Var = this.d;
        if (bg0Var != null) {
            bg0Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            zf0 zf0Var = this.f44696c0;
            if (zf0Var != null) {
                zf0Var.i(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Cj, getResourceProvider()), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Dj, getResourceProvider()));
            }
            f0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public dg0(org.telegram.messenger.zi ziVar) {
        super(null);
        this.f44705w = new g2.k0(15, 3);
        this.f44707y = new ArrayList();
        this.H = null;
        this.S = new a0.g(0);
        this.f44692a0 = new o4(this, 12);
        this.f44702n = ziVar;
        if (ziVar.f26868k.fwd_from == null) {
            this.f44693b = ziVar.x0();
            this.f44695c = ziVar.f1();
        } else {
            this.f44693b = -ziVar.Z0();
            this.f44695c = ziVar.f26868k.fwd_msg_id;
        }
        this.f44691a = getMessagesController().N0(this.f44693b);
    }
}
