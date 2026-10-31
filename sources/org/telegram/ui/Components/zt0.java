package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
public abstract class zt0 extends FrameLayout implements org.telegram.ui.ActionBar.k6, org.telegram.messenger.us, org.telegram.ui.Cells.r2, nk0 {
    public static final int[] f33165s2 = {0, 1, 2, 4};
    public static final qq0 f33166t2 = new qq0(0);
    public static final int f33167u2 = org.telegram.messenger.i0.L(7.0f);
    public static final int f33168v2 = org.telegram.messenger.i0.L(7.0f) + org.telegram.messenger.i0.L(14.0f);
    public final Drawable A0;
    public boolean A1;
    public boolean B0;
    public int B1;
    public final NumberTextView C0;
    public int C1;
    public final zz D;
    public final LinearLayout D0;
    public VelocityTracker D1;
    public final int E;
    public final ImageView E0;
    public boolean E1;
    public final long F;
    public final org.telegram.ui.ActionBar.c2 F0;
    public final ms0 F1;
    public final org.telegram.ui.ActionBar.l G;
    public final ArrayList G0;
    public q30 G1;
    public final org.telegram.ui.ActionBar.i5 H;
    public final ArrayList H0;
    public final org.telegram.ui.ActionBar.p6 H1;
    public final org.telegram.ui.ActionBar.p5 I;
    public final ArrayList I0;
    public final hi.c I1;
    public final es0 J;
    public final ArrayList J0;
    public final xa.n J1;
    public final tt0 K;
    public final ur0 K0;
    public boolean K1;
    public final nt0 L;
    public final rr0 L0;
    public final e2.f L1;
    public final mt0 M;
    public final org.telegram.ui.Cells.s0 M0;
    public ji0 M1;
    public final mt0 N;
    public AnimatorSet N0;
    public int N1;
    public final mt0 O;
    public final vp0 O0;
    public boolean O1;
    public final gt0 P;
    public final ArrayList P0;
    public int P1;
    public final ns0 Q;
    public float Q0;
    public AnimatorSet Q1;
    public final ls0 R;
    public final zr R0;
    public final SparseArray R1;
    public final js0 S;
    public final FrameLayout S0;
    public long S1;
    public final it0 T;
    public final pr0 T0;
    public boolean T1;
    public final lt0 U;
    public final int U0;
    public int U1;
    public final fs0 V;
    public final Paint V0;
    public final bs0 V1;
    public final uq0 W;
    public boolean W0;
    public th.x4 W1;
    public boolean X0;
    public float X1;
    public sg.o0 Y0;
    public boolean Y1;
    public final int[] Z0;
    public SpannableStringBuilder Z1;
    public boolean f33169a;
    public final vq0 f33170a0;
    public int f33171a1;
    public int a2;
    public boolean f33172b;
    public final zq0 f33173b0;
    public final SparseArray[] f33174b1;
    public boolean f33175b2;
    public boolean f33176c;
    public final ks0 f33177c0;
    public int f33178c1;
    public int f33179c2;
    public boolean d;
    public final s4.x f33180d0;
    public boolean f33181d1;
    public int f33182d2;
    public int e;
    public final hs0 f33183e0;
    public long f33184e1;
    public int f33185e2;
    public int f33186f;
    public final wt0 f33187f0;
    public TLRPC.ChatFull f33188f1;
    public int f33189f2;
    public final tq0 f33190g0;
    public TLRPC.UserFull f33191g1;
    public ei.r f33192g2;
    public float h;
    public final wt0 f33193h0;
    public AnimatorSet f33194h1;
    public float f33195h2;
    public final us0 f33196i0;
    public boolean f33197i1;
    public final RectF f33198i2;
    public final us0 f33199j0;
    public boolean f33200j1;
    public Runnable f33201j2;
    public final us0 f33202k0;
    public boolean f33203k1;
    public int f33204k2;
    public final qs0 f33205l0;
    public final long l1;
    public final HashMap f33206l2;
    public final ss0[] m0;
    public boolean f33207m1;
    public final HashMap f33208m2;
    public float f33209n;
    public final org.telegram.ui.ActionBar.t0 f33210n0;
    public boolean f33211n1;
    public int f33212n2;
    public final org.telegram.ui.ActionBar.t0 f33213o0;
    public final int[] f33214o1;
    public int f33215o2;
    public final org.telegram.ui.ActionBar.t0 f33216p0;
    public float f33217p1;
    public boolean f33218p2;
    public float f33219q0;
    public boolean f33220q1;
    public int f33221q2;
    public boolean f33222r;
    public float f33223r0;
    public int f33224r1;
    public int f33225r2;
    public int f33226s;
    public final TextView f33227s0;
    public int f33228s1;
    public final ImageView f33229t0;
    public final fr0 f33230t1;
    public final ei0 f33231u0;
    public float f33232u1;
    public final org.telegram.ui.ActionBar.t0 f33233v0;
    public final ot0[] f33234v1;
    public int f33235w;
    public final org.telegram.ui.ActionBar.t0 f33236w0;
    public final rt0 f33237w1;
    public int f33238x;
    public final org.telegram.ui.ActionBar.t0 f33239x0;
    public final org.telegram.ui.ActionBar.k2 f33240x1;
    public final Rect f33241y;
    public final org.telegram.ui.ActionBar.t0 f33242y0;
    public int f33243y1;
    public int f33244z0;
    public boolean f33245z1;

    public zt0(android.content.Context r34, long r35, org.telegram.ui.Components.rt0 r37, int r38, java.util.ArrayList r39, org.telegram.tgnet.TLRPC.ChatFull r40, org.telegram.tgnet.TLRPC.UserFull r41, int r42, int r43, org.telegram.ui.ActionBar.k2 r44, org.telegram.ui.Components.ms0 r45, int r46, org.telegram.ui.ActionBar.p6 r47, tg.b r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zt0.<init>(android.content.Context, long, org.telegram.ui.Components.rt0, int, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.tgnet.TLRPC$UserFull, int, int, org.telegram.ui.ActionBar.k2, org.telegram.ui.Components.ms0, int, org.telegram.ui.ActionBar.p6, tg.b):void");
    }

    public static boolean F0(int i10) {
        if ((i10 & (-65536)) == 65536) {
            return true;
        }
        return false;
    }

    public static p3 V(int i10, long j10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        p3 p3Var = new p3(context, p6Var);
        ImageView imageView = (ImageView) p3Var.d;
        TextView textView = (TextView) p3Var.f29276c;
        if (i10 == 0) {
            if (org.telegram.messenger.o5.C(j10)) {
                textView.setText(org.telegram.messenger.cd.L0(2131748213, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.cd.L0(2131748215, null));
            return p3Var;
        } else if (i10 == 1) {
            if (org.telegram.messenger.o5.C(j10)) {
                textView.setText(org.telegram.messenger.cd.L0(2131748173, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.cd.L0(2131748174, null));
            return p3Var;
        } else if (i10 == 2) {
            if (org.telegram.messenger.o5.C(j10)) {
                textView.setText(org.telegram.messenger.cd.L0(2131748168, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.cd.L0(2131748169, null));
            return p3Var;
        } else if (i10 == 3) {
            if (org.telegram.messenger.o5.C(j10)) {
                textView.setText(org.telegram.messenger.cd.L0(2131748170, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.cd.L0(2131748171, null));
            return p3Var;
        } else if (i10 == 4) {
            if (org.telegram.messenger.o5.C(j10)) {
                textView.setText(org.telegram.messenger.cd.L0(2131748175, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.cd.L0(2131748176, null));
            return p3Var;
        } else if (i10 == 5) {
            if (org.telegram.messenger.o5.C(j10)) {
                textView.setText(org.telegram.messenger.cd.L0(2131748172, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.cd.L0(2131748225, null));
            return p3Var;
        } else if (i10 == 6) {
            imageView.setImageDrawable(null);
            textView.setText(org.telegram.messenger.cd.L0(2131748223, null));
            return p3Var;
        } else {
            if (i10 == 7) {
                imageView.setImageDrawable(null);
                textView.setText("");
            }
            return p3Var;
        }
    }

    public static void a(zt0 zt0Var, TL_stories.StoryItem storyItem, th.y4 y4Var) {
        zt0Var.getStoriesController().c(y4Var.f49680a, zt0Var.l1, storyItem);
        org.telegram.messenger.i0.h3(new gi0(7, zt0Var, y4Var), 100L);
    }

    public static void d(zt0 zt0Var, long j10, int i10, String str) {
        th.t4 B = zt0Var.getStoriesController().B(j10, true);
        int i11 = B.f49458a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        ((th.y4) B.h.get(c10)).f49681b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = org.telegram.messenger.vp.r1(i11).i1(B.f49459b);
        tL_updateAlbum.album_id = i10;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i11).sendRequest(tL_updateAlbum, null);
        B.f(true);
    }

    public static void e(zt0 zt0Var, int i10, TL_stories.StoryItem storyItem, String str) {
        ji0 ji0Var = new ji0(zt0Var, i10, storyItem, 2);
        th.e5 storiesController = zt0Var.getStoriesController();
        long j10 = zt0Var.l1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.f0(i10, j10, arrayList);
        cc.a0(zt0Var.f33240x1).K(2131623979, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G(1, "StoryRemovedFromAlbumTitle", str)), org.telegram.messenger.cd.L0(2131743910, null), ji0Var).j();
    }

    public static void g(zt0 zt0Var, long j10, int i10) {
        th.t4 B = zt0Var.getStoriesController().B(j10, true);
        int i11 = B.f49458a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = org.telegram.messenger.vp.r1(i11).i1(B.f49459b);
        tL_deleteAlbum.album_id = ((th.y4) B.h.remove(c10)).f49680a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_deleteAlbum, null);
        B.f(true);
    }

    public th.e5 getStoriesController() {
        return org.telegram.messenger.vp.r1(this.f33240x1.getCurrentAccount()).O1();
    }

    public static void h(zt0 zt0Var, TL_stories.StoryItem storyItem) {
        zt0Var.getStoriesController().r0(zt0Var.l1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        cc.a0(zt0Var.f33240x1).G(2131623979, 5000, org.telegram.messenger.cd.G(1, "StoryArchived", new Object[0])).j();
    }

    public static void j(zt0 zt0Var, HashSet hashSet, TL_stories.StoryItem storyItem, z60 z60Var, th.y4 y4Var) {
        String a02;
        long j10 = zt0Var.l1;
        if (hashSet.contains(Integer.valueOf(y4Var.f49680a))) {
            zt0Var.getStoriesController().c(y4Var.f49680a, j10, storyItem);
            a02 = org.telegram.messenger.cd.a0(null, null, 2131744749, y4Var.f49681b);
        } else {
            th.e5 storiesController = zt0Var.getStoriesController();
            int i10 = y4Var.f49680a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.f0(i10, j10, arrayList);
            a02 = org.telegram.messenger.cd.a0(null, null, 2131744520, y4Var.f49681b);
        }
        cc.a0(zt0Var.f33240x1).Q(2131623989, 36, org.telegram.messenger.i0.W2(a02)).j();
        z60Var.u();
    }

    public static void k1(int i10, View view) {
        if (view != null && (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams.topMargin != i10) {
                marginLayoutParams.topMargin = i10;
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public static TLRPC.ProfileTab m0(int i10, boolean z10) {
        if (i10 != 8 && i10 != 14 && !z10) {
            return null;
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                if (i10 != 8) {
                                    if (i10 != 14) {
                                        return null;
                                    }
                                    return new TLRPC.TL_profileTabGifts();
                                }
                                return new TLRPC.TL_profileTabPosts();
                            }
                            return new TLRPC.TL_profileTabGifs();
                        }
                        return new TLRPC.TL_profileTabMusic();
                    }
                    return new TLRPC.TL_profileTabLinks();
                }
                return new TLRPC.TL_profileTabVoice();
            }
            return new TLRPC.TL_profileTabFiles();
        }
        return new TLRPC.TL_profileTabMedia();
    }

    public static int n(View view) {
        if (view instanceof org.telegram.ui.Cells.s7) {
            return ((org.telegram.ui.Cells.s7) view).getMessageId();
        }
        if (view instanceof org.telegram.ui.Cells.l7) {
            return ((org.telegram.ui.Cells.l7) view).getMessage().f1();
        }
        if (view instanceof org.telegram.ui.Cells.k7) {
            return ((org.telegram.ui.Cells.k7) view).getMessage().f1();
        }
        return 0;
    }

    public static int n0(TLRPC.ProfileTab profileTab) {
        if (profileTab instanceof TLRPC.TL_profileTabPosts) {
            return 8;
        }
        if (profileTab instanceof TLRPC.TL_profileTabMedia) {
            return 0;
        }
        if (profileTab instanceof TLRPC.TL_profileTabGifts) {
            return 14;
        }
        if (profileTab instanceof TLRPC.TL_profileTabMusic) {
            return 4;
        }
        if (profileTab instanceof TLRPC.TL_profileTabVoice) {
            return 2;
        }
        if (profileTab instanceof TLRPC.TL_profileTabLinks) {
            return 3;
        }
        if (profileTab instanceof TLRPC.TL_profileTabFiles) {
            return 1;
        }
        if (profileTab instanceof TLRPC.TL_profileTabGifs) {
            return 5;
        }
        return -1;
    }

    public static void p(ss0 ss0Var, ot0[] ot0VarArr, boolean z10) {
        gi0 gi0Var;
        if (z10) {
            if (org.telegram.messenger.tz.f18190v1 > 0 && ss0Var.F == null && !ss0Var.H && ss0Var.h.getFastScroll() != null && ss0Var.h.getFastScroll().f33077a0 && ss0Var.h.getFastScroll().getVisibility() == 0 && ot0VarArr[0].e() >= 50) {
                int i10 = org.telegram.messenger.tz.f18190v1;
                int i11 = i10 - 1;
                if (i10 != i11) {
                    org.telegram.messenger.tz.f18190v1 = i11;
                    org.telegram.messenger.w0.f19025b.getSharedPreferences("mainconfig", 0).edit().putInt("fastScrollHintCount", org.telegram.messenger.tz.f18190v1).apply();
                }
                ss0Var.H = true;
                Context context = ss0Var.getContext();
                org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(context, 22);
                TextView textView = new TextView(context);
                textView.setText(org.telegram.messenger.cd.L0(2131745426, null));
                textView.setTextSize(1, 14.0f);
                textView.setMaxLines(3);
                int i12 = org.telegram.ui.ActionBar.t6.f20939dg;
                org.telegram.ui.ActionBar.a7.V(textView, i12, null);
                int L = org.telegram.messenger.i0.L(6.0f);
                int i13 = org.telegram.ui.ActionBar.t6.f20956eg;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.x0(null, i13, false));
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i13);
                a5Var.setBackground(d02);
                org.telegram.ui.ActionBar.a7.k(a5Var, d02, N, null, null);
                a5Var.addView(textView, w7.b6.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
                ?? view = new View(context);
                view.f30668a = new Random();
                Paint paint = new Paint(1);
                view.f30669b = paint;
                Paint paint2 = new Paint(1);
                view.f30670c = paint2;
                view.f30671f = 1.0f;
                view.h = 0.0f;
                paint.setColor(i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i12, false), 76));
                paint2.setColor(org.telegram.ui.ActionBar.t6.x0(null, i12, false));
                Paint paint3 = new Paint();
                view.d = paint3;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint3.setShader(new LinearGradient(0.0f, org.telegram.messenger.i0.L(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint3.setXfermode(new PorterDuffXfermode(mode));
                Paint paint4 = new Paint();
                view.e = paint4;
                paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.i0.L(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
                paint4.setXfermode(new PorterDuffXfermode(mode));
                a5Var.addView((View) view, w7.b6.d(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                ss0Var.F = a5Var;
                ss0Var.addView(a5Var, w7.b6.c(-2.0f, -2));
                ss0Var.F.setAlpha(0.0f);
                ss0Var.F.setScaleX(0.8f);
                ss0Var.F.setScaleY(0.8f);
                ss0Var.F.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                ss0Var.invalidate();
                gi0 gi0Var2 = new gi0(8, ss0Var, a5Var);
                ss0Var.G = gi0Var2;
                org.telegram.messenger.i0.h3(gi0Var2, 4000L);
            }
        } else if (ss0Var.F != null && (gi0Var = ss0Var.G) != null) {
            org.telegram.messenger.i0.r(gi0Var);
            ss0Var.G.run();
            ss0Var.G = null;
            ss0Var.F = null;
        }
    }

    public static void s(zt0 zt0Var, int i10, boolean z10) {
        ss0[] ss0VarArr = zt0Var.m0;
        if (ss0VarArr[0].E == i10) {
            return;
        }
        ss0 ss0Var = ss0VarArr[1];
        ss0Var.E = i10;
        ss0Var.setVisibility(0);
        zt0Var.u0();
        zt0Var.w1(true);
        zt0Var.f33200j1 = z10;
        zt0Var.T0();
        zt0Var.D(!zt0Var.B0(i10));
        zt0Var.D1(true);
    }

    public void setHeaderEnabled(boolean z10) {
        org.telegram.ui.ActionBar.i5 i5Var = this.H;
        if (i5Var != null) {
            i5Var.setEnabled(z10);
        } else {
            this.G.setEnabled(z10);
        }
    }

    private void setPageOverscan(rs0 rs0Var) {
        if (this.f33175b2 && rs0Var != null) {
            rs0Var.f30015i3 = true;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rs0Var.getLayoutParams();
            if (marginLayoutParams != null) {
                int i10 = marginLayoutParams.topMargin;
                int i11 = -this.f33182d2;
                if (i10 != i11 || marginLayoutParams.bottomMargin != (-this.f33185e2)) {
                    marginLayoutParams.topMargin = i11;
                    marginLayoutParams.bottomMargin = -this.f33185e2;
                    rs0Var.setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    public void setSearchItemVisibility(int i10) {
        org.telegram.ui.ActionBar.t0 t0Var = this.f33216p0;
        if (t0Var == null) {
            return;
        }
        if (this.H != null) {
            P(true, true);
        } else {
            t0Var.setVisibility(i10);
        }
    }

    public static int v(zt0 zt0Var, s4.g0 g0Var) {
        if (g0Var == zt0Var.f33183e0) {
            return 8;
        }
        if (g0Var == zt0Var.f33190g0) {
            return 9;
        }
        for (yt0 yt0Var : zt0Var.f33206l2.values()) {
            if (yt0Var.f32790c == g0Var) {
                return yt0Var.f32788a;
            }
        }
        return -1;
    }

    public static int w(zt0 zt0Var, s4.g0 g0Var) {
        if (g0Var == zt0Var.f33187f0) {
            return 8;
        }
        if (g0Var == zt0Var.f33193h0) {
            return 9;
        }
        for (yt0 yt0Var : zt0Var.f33206l2.values()) {
            if (yt0Var.d == g0Var) {
                return yt0Var.f32788a;
            }
        }
        return -1;
    }

    public static boolean x0(int i10) {
        if (i10 != 8 && i10 != 9 && !F0(i10)) {
            return false;
        }
        return true;
    }

    public final void A(ws0 ws0Var, org.telegram.ui.ActionBar.k2 k2Var, long j10, int i10) {
        String K;
        if (j10 > 0) {
            K = org.telegram.messenger.h20.n(org.telegram.messenger.vp.r1(k2Var.getCurrentAccount()).Z1(Long.valueOf(j10)));
        } else {
            K = org.telegram.messenger.w3.K(org.telegram.messenger.vp.r1(k2Var.getCurrentAccount()).L0(Long.valueOf(-j10)), false);
        }
        if (K == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        c3.i0.r(sb2, org.telegram.messenger.vp.r1(k2Var.getCurrentAccount()).U2, "/", K, "/a/");
        sb2.append(i10);
        String sb3 = sb2.toString();
        ws0Var.k0(2131231756, new jg(this, sb3, k2Var, 20), org.telegram.messenger.cd.L0(2131744806, null), false, true);
    }

    public final boolean A0() {
        org.telegram.ui.ActionBar.k2 k2Var;
        if (this.f33188f1 != null && (k2Var = this.f33240x1) != null) {
            return org.telegram.messenger.w3.V(k2Var.getMessagesController().L0(Long.valueOf(this.f33188f1.f19794id)));
        }
        return false;
    }

    public final void A1(ss0 ss0Var, boolean z10) {
        boolean z11;
        Integer num = 1;
        int i10 = 0;
        if (ss0Var.f30349b && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        zj0 fastScroll = ss0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = ss0Var.f30350c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            ss0Var.f30350c.cancel();
        }
        if (!z10) {
            fastScroll.animate().setListener(null).cancel();
            if (!z11) {
                i10 = 8;
            }
            fastScroll.setVisibility(i10);
            if (!z11) {
                num = null;
            }
            fastScroll.setTag(num);
            fastScroll.setAlpha(1.0f);
            fastScroll.setScaleX(1.0f);
            fastScroll.setScaleY(1.0f);
            return;
        }
        Property property = View.ALPHA;
        if (z11 && fastScroll.getTag() == null) {
            fastScroll.animate().setListener(null).cancel();
            if (fastScroll.getVisibility() != 0) {
                fastScroll.setVisibility(0);
                fastScroll.setAlpha(0.0f);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fastScroll, property, fastScroll.getAlpha(), 1.0f);
            ss0Var.f30350c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(num);
        } else if (!z11 && fastScroll.getTag() != null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, property, fastScroll.getAlpha(), 0.0f);
            ofFloat2.addListener(new eg.m(fastScroll));
            ss0Var.f30350c = ofFloat2;
            ofFloat2.setDuration(150L).start();
            fastScroll.animate().setListener(null).cancel();
            fastScroll.setTag(null);
        }
    }

    public final void B(ws0 ws0Var) {
        float f7;
        final View[] viewArr = {ws0Var.k0(2131232437, new Runnable(this) {
            public final zt0 f27890b;

            {
                this.f27890b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        zt0 zt0Var = this.f27890b;
                        zt0Var.getClass();
                        View[] viewArr2 = viewArr;
                        zt0Var.L1(viewArr2[0], viewArr2[1]);
                        return;
                    default:
                        zt0 zt0Var2 = this.f27890b;
                        zt0Var2.getClass();
                        View[] viewArr3 = viewArr;
                        zt0Var2.M1(viewArr3[0], viewArr3[1]);
                        return;
                }
            }
        }, org.telegram.messenger.cd.L0(2131748665, null), false, false), ws0Var.k0(2131232438, new Runnable(this) {
            public final zt0 f27890b;

            {
                this.f27890b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        zt0 zt0Var = this.f27890b;
                        zt0Var.getClass();
                        View[] viewArr2 = viewArr;
                        zt0Var.L1(viewArr2[0], viewArr2[1]);
                        return;
                    default:
                        zt0 zt0Var2 = this.f27890b;
                        zt0Var2.getClass();
                        View[] viewArr3 = viewArr;
                        zt0Var2.M1(viewArr3[0], viewArr3[1]);
                        return;
                }
            }
        }, org.telegram.messenger.cd.L0(2131748664, null), false, false)};
        View view = viewArr[0];
        float f10 = 0.5f;
        if (view != null) {
            view.setEnabled(I());
            View view2 = viewArr[0];
            if (I()) {
                f7 = 1.0f;
            } else {
                f7 = 0.5f;
            }
            view2.setAlpha(f7);
        }
        View view3 = viewArr[1];
        if (view3 != null) {
            view3.setEnabled(J());
            View view4 = viewArr[1];
            if (J()) {
                f10 = 1.0f;
            }
            view4.setAlpha(f10);
        }
    }

    public final boolean B0(int i10) {
        if (i10 == 7) {
            return this.F1.X();
        }
        if (!C0() && i10 != 0 && !x0(i10) && i10 != 2 && i10 != 5 && i10 != 6 && i10 != 11 && i10 != 10 && i10 != 13 && i10 != 14 && i10 != 15) {
            return true;
        }
        return false;
    }

    public final void B1() {
        boolean z10;
        float f7;
        org.telegram.ui.ActionBar.t0 t0Var = this.f33233v0;
        if (t0Var != null) {
            if (!this.f33240x1.getMessagesController().z2(this.l1) && !s0()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                f7 = 0.5f;
            } else {
                f7 = 1.0f;
            }
            t0Var.setAlpha(f7);
            if (z10 && t0Var.getBackground() != null) {
                t0Var.setBackground(null);
            } else if (!z10 && t0Var.getBackground() == null) {
                int i10 = org.telegram.ui.ActionBar.t6.f21332z8;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(q0(i10), 5, -1);
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
                t0Var.setBackground(h02);
                org.telegram.ui.ActionBar.a7.k(t0Var, h02, null, N, this.H1);
            }
        }
    }

    public final void C(rs0 rs0Var, int i10, SparseBooleanArray sparseBooleanArray) {
        int childCount = rs0Var.getChildCount();
        zz zzVar = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = rs0Var.getChildAt(i11);
            if (childAt instanceof zz) {
                zzVar = childAt;
            }
        }
        if (zzVar != null) {
            rs0Var.removeView(zzVar);
        }
        getViewTreeObserver().addOnPreDrawListener(new zr0(this, rs0Var, sparseBooleanArray, zzVar, i10));
    }

    public boolean C0() {
        if (TextUtils.isEmpty(getStoriesHashtag()) && getStoriesArea() == null) {
            return false;
        }
        return true;
    }

    public final void C1() {
        int i10;
        vq0 vq0Var = this.f33170a0;
        if (vq0Var != null) {
            int L = org.telegram.messenger.i0.L(48.0f) + this.f33179c2;
            zr zrVar = this.R0;
            if (zrVar != null) {
                i10 = (int) zrVar.c(org.telegram.messenger.i0.L(7.0f));
            } else {
                i10 = 0;
            }
            vq0Var.setPaddingTop(L + i10);
        }
    }

    public final void D(boolean z10) {
        int i10;
        ei0 ei0Var = this.f33231u0;
        if (ei0Var != null && this.Y1 != z10) {
            this.Y1 = z10;
            if (!z10 && ei0Var.getAnimatedDrawable().f24752a0 < 20) {
                ei0Var.getAnimatedDrawable().P(0);
            } else {
                bi0 animatedDrawable = ei0Var.getAnimatedDrawable();
                if (this.Y1) {
                    i10 = 50;
                } else {
                    i10 = 100;
                }
                animatedDrawable.P(i10);
            }
            ei0Var.getAnimatedDrawable().start();
        }
    }

    public boolean D0() {
        return false;
    }

    public final void D1(boolean z10) {
        vq0 vq0Var;
        zq0 zq0Var;
        boolean z11 = true;
        P(true, true);
        ei0 ei0Var = this.f33231u0;
        if (ei0Var == null) {
            return;
        }
        float f7 = 0.0f;
        if (!this.X0 && (((vq0Var = this.f33170a0) == null || !vq0Var.g()) && ((zq0Var = this.f33173b0) == null || !zq0Var.f44256f))) {
            f7 = Utilities.i(this.f33219q0 + this.f33223r0, 1.0f, 0.0f);
        }
        ei0Var.setAlpha(f7);
        if (z10) {
            if (i0(1.0f) <= 0.5f) {
                z11 = false;
            }
            D(z11);
        } else if (this.f33244z0 == 2) {
            if (this.f33223r0 <= 0.1f) {
                z11 = false;
            }
            D(z11);
        } else {
            if (this.f33219q0 >= 0.1f) {
                z11 = false;
            }
            D(z11);
        }
    }

    public final void E(int i10) {
        int i11;
        ss0 e02 = e0(this.f33224r1);
        this.f33226s = -1;
        if (e02 != null) {
            e02.h.C0();
            this.f33228s1 = i10;
            e02.f30352n.setVisibility(0);
            if (x0(this.f33224r1)) {
                e02.f30352n.setAdapter(v1(this.f33224r1));
            } else {
                e02.f30352n.setAdapter(this.K);
            }
            rs0 rs0Var = e02.f30352n;
            int paddingLeft = rs0Var.getPaddingLeft();
            rs0 rs0Var2 = e02.f30352n;
            int h02 = h0(e02.E);
            rs0Var2.f30013g3 = h02;
            int paddingRight = e02.f30352n.getPaddingRight();
            rs0 rs0Var3 = e02.f30352n;
            int g02 = g0(E0());
            rs0Var3.f30014h3 = g02;
            rs0Var.setPadding(paddingLeft, h02, paddingRight, g02);
            e02.f30353r.y1(i10);
            e02.f30352n.a0();
            int i12 = 0;
            while (true) {
                ss0[] ss0VarArr = this.m0;
                if (i12 >= ss0VarArr.length) {
                    break;
                }
                ss0 ss0Var = ss0VarArr[i12];
                if (ss0Var != null && ((i11 = ss0Var.E) == 0 || x0(i11))) {
                    org.telegram.messenger.i0.a4(ss0VarArr[i12].h);
                }
                i12++;
            }
            this.f33220q1 = true;
            if (this.f33224r1 == 0) {
                this.f33234v1[0].g(true);
            }
            this.f33217p1 = 0.0f;
            e1();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.L1.d();
            ofFloat.addUpdateListener(new tr0(this, e02, 1));
            ofFloat.addListener(new x10(this, x0(e02.E) ? 1 : 0, i10, 1));
            ofFloat.setInterpolator(gr.f26495f);
            ofFloat.setStartDelay(100L);
            ofFloat.setDuration(350L);
            ofFloat.start();
        }
    }

    public boolean E0() {
        return false;
    }

    public final void E1(ss0 ss0Var) {
        boolean z10;
        boolean b12 = ss0Var.h.b1();
        if (b12) {
            ss0Var.h.setSectionsDrawBackground(this.f33175b2);
        }
        if (this.f33175b2 && !b12 && ss0Var.E != 15) {
            z10 = true;
        } else {
            z10 = false;
        }
        ss0Var.setDrawPageBackground(z10);
        if (ss0Var.E == 15) {
            Drawable drawable = ss0Var.O;
            if (drawable == null) {
                drawable = ss0Var.getBackground();
            }
            Drawable e = vh.k4.e(drawable, this.f33240x1.getCurrentAccount(), this.l1, org.telegram.ui.ActionBar.t6.I.q());
            if (!this.f33175b2) {
                ss0Var.setWallpaper(null);
                ss0Var.setBackground(e);
                ss0Var.setOutlineProvider(new bi.d2(15));
                ss0Var.setClipToOutline(true);
                return;
            }
            ss0Var.setBackground(null);
            ss0Var.setClipToOutline(false);
            ss0Var.setWallpaper(e);
            return;
        }
        ss0Var.setClipToOutline(false);
        ss0Var.setBackground(null);
        ss0Var.setWallpaper(null);
    }

    public final void F() {
        int i10 = this.f33179c2;
        int i11 = this.f33215o2;
        k1((org.telegram.messenger.i0.L(6.666f) + i10) - f33168v2, this.R0);
        int i12 = i10 + i11;
        k1(i12, this.K0);
        k1(i12, this.D0);
        k1(org.telegram.messenger.i0.L(52.0f) + i10 + i11, this.M0);
        k1(org.telegram.messenger.i0.L(4.0f) + i10 + i11, this.L0);
        k1(org.telegram.messenger.i0.L(48.0f) + i10 + i11, this.f33173b0);
        if (this.f33204k2 != i11) {
            this.f33204k2 = i11;
            Runnable runnable = this.f33201j2;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void F1(ss0 ss0Var) {
        boolean z10;
        float f7;
        int i10;
        float f10;
        float f11;
        int i11 = ss0Var.E;
        if (i11 != 0 && !x0(i11)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 12.0f;
        }
        if (z10) {
            i10 = 8;
        } else {
            i10 = 12;
        }
        float f12 = i10 + 48;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 12.0f;
        }
        if (z10) {
            f11 = 0.0f;
        } else {
            f11 = 12.0f;
        }
        FrameLayout.LayoutParams d = w7.b6.d(-1, -1.0f, 119, f7, f12, f10, f11);
        d.topMargin = l0(ss0Var.E) + d.topMargin;
        ViewGroup.LayoutParams layoutParams = ss0Var.f30354s.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2.leftMargin == d.leftMargin && layoutParams2.topMargin == d.topMargin && layoutParams2.rightMargin == d.rightMargin && layoutParams2.bottomMargin == d.bottomMargin && layoutParams2.gravity == d.gravity) {
                return;
            }
        }
        ss0Var.f30354s.setLayoutParams(d);
    }

    public final boolean G() {
        boolean z02 = z0();
        long j10 = this.l1;
        org.telegram.ui.ActionBar.k2 k2Var = this.f33240x1;
        if (z02) {
            TLRPC.User Z1 = org.telegram.messenger.vp.r1(k2Var.getCurrentAccount()).Z1(Long.valueOf(j10));
            if (Z1 == null || !Z1.bot || !Z1.bot_can_edit) {
                return false;
            }
            return true;
        } else if (!E0()) {
            if (k2Var == null || !k2Var.getMessagesController().O1().h(j10)) {
                return false;
            }
            return true;
        } else {
            return true;
        }
    }

    public final boolean G0() {
        if (!G() || ((getClosestTab() != 8 && getClosestTab() != 13 && !F0(getClosestTab())) || !this.E1)) {
            vq0 vq0Var = this.f33170a0;
            if (vq0Var == null || !vq0Var.g()) {
                zq0 zq0Var = this.f33173b0;
                if ((zq0Var == null || !zq0Var.f44256f) && !this.f33220q1 && !this.f33197i1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void G1(boolean z10) {
        int i10 = 0;
        while (true) {
            ss0[] ss0VarArr = this.m0;
            if (i10 < ss0VarArr.length) {
                int childCount = ss0VarArr[i10].h.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = ss0VarArr[i10].h.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.l7) {
                        ((org.telegram.ui.Cells.l7) childAt).b(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.s7) {
                        ((org.telegram.ui.Cells.s7) childAt).i(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.o7) {
                        ((org.telegram.ui.Cells.o7) childAt).f(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.k7) {
                        ((org.telegram.ui.Cells.k7) childAt).e(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.h2) {
                        ((org.telegram.ui.Cells.h2) childAt).c(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.v2) {
                        ((org.telegram.ui.Cells.v2) childAt).c0(false, z10);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public boolean H() {
        return !(this instanceof g30);
    }

    public final void H0(int i10, int i11, int i12, boolean z10) {
        ot0[] ot0VarArr = this.f33234v1;
        ot0VarArr[i10].f29177a.clear();
        ot0VarArr[i10].f29178b[0].clear();
        ot0VarArr[i10].f29178b[1].clear();
        ot0 ot0Var = ot0VarArr[i10];
        ot0Var.f29183j[0] = i11;
        ot0Var.f29182i[0] = false;
        ot0Var.f29185l = false;
        ot0Var.f29186m = i12;
        ot0Var.f29187n = (ot0Var.e() - i12) - 1;
        ot0 ot0Var2 = ot0VarArr[i10];
        if (ot0Var2.f29187n < 0) {
            ot0Var2.f29187n = 0;
        }
        ot0Var2.f29184k = i11;
        ot0Var2.f29188o = true;
        ot0Var2.f29181g = false;
        ot0Var2.f29189p++;
        ss0 e02 = e0(i10);
        if (e02 != null && e02.h.getAdapter() != null) {
            e02.h.getAdapter().f();
        }
        if (z10) {
            int i13 = 0;
            while (true) {
                ss0[] ss0VarArr = this.m0;
                if (i13 < ss0VarArr.length) {
                    ss0 ss0Var = ss0VarArr[i13];
                    if (ss0Var.E == i10) {
                        ss0Var.f30356x.h1(Math.min(ot0VarArr[i10].e() - 1, ot0VarArr[i10].f29186m), 0);
                    }
                    i13++;
                } else {
                    return;
                }
            }
        }
    }

    public final void H1(float f7) {
        org.telegram.ui.ActionBar.t0 t0Var = this.f33213o0;
        if (t0Var == null) {
            return;
        }
        ss0[] ss0VarArr = this.m0;
        ss0 ss0Var = ss0VarArr[1];
        float f10 = 0.0f;
        if (ss0Var != null && ss0Var.E == 11) {
            f10 = 0.0f + f7;
        }
        int i10 = 0;
        ss0 ss0Var2 = ss0VarArr[0];
        if (ss0Var2 != null && ss0Var2.E == 11) {
            f10 += 1.0f - f7;
        }
        t0Var.setAlpha(f10);
        float f11 = (0.15f * f10) + 0.85f;
        t0Var.setScaleX(f11);
        t0Var.setScaleY(f11);
        if (f10 <= 0.01f) {
            i10 = 8;
        }
        t0Var.setVisibility(i10);
    }

    public final boolean I() {
        ss0 ss0Var;
        ss0[] ss0VarArr = this.m0;
        if (ss0VarArr != null && (ss0Var = ss0VarArr[0]) != null) {
            boolean x02 = x0(ss0Var.E);
            int i10 = this.f33214o1[x02 ? 1 : 0];
            if (i10 != f0(x02 ? 1 : 0, i10, true)) {
                return true;
            }
        }
        return false;
    }

    public final void I0(boolean z10) {
        long j10 = this.F;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0 && !C0()) {
            for (int i11 = 0; i11 < 4; i11++) {
                int i12 = f33165s2[i11];
                ot0[] ot0VarArr = this.f33234v1;
                if (!ot0VarArr[i12].h || z10) {
                    long j11 = this.l1;
                    if (!org.telegram.messenger.o5.C(j11)) {
                        ot0VarArr[i12].h = false;
                        TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
                        if (i12 == 0) {
                            int i13 = ot0VarArr[i12].f29190q;
                            if (i13 == 1) {
                                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterPhotos();
                            } else if (i13 == 2) {
                                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterVideo();
                            } else {
                                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
                            }
                        } else if (i12 == 1) {
                            tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterDocument();
                        } else if (i12 == 2) {
                            tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterRoundVoice();
                        } else {
                            tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterMusic();
                        }
                        tL_messages_getSearchResultsPositions.limit = 100;
                        org.telegram.ui.ActionBar.k2 k2Var = this.f33240x1;
                        tL_messages_getSearchResultsPositions.peer = k2Var.getMessagesController().i1(j11);
                        if (i10 != 0 && k2Var.getUserConfig().e() == j11) {
                            tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                            tL_messages_getSearchResultsPositions.saved_peer_id = k2Var.getMessagesController().i1(j10);
                        }
                        ConnectionsManager.getInstance(k2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(k2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new org.telegram.messenger.de(this, ot0VarArr[i12].f29189p, i12, 2)), k2Var.getClassGuid());
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void I1() {
        float f7;
        float f10;
        org.telegram.ui.ActionBar.t0 t0Var = this.f33213o0;
        if (t0Var == null) {
            return;
        }
        boolean z10 = true;
        ss0 ss0Var = this.m0[1];
        if (ss0Var == null || ss0Var.E != 11) {
            z10 = false;
        }
        if (z10) {
            t0Var.setVisibility(0);
        }
        ViewPropertyAnimator animate = t0Var.animate();
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f7);
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.85f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f10);
        if (!z10) {
            f11 = 0.85f;
        }
        scaleX.scaleY(f11).withEndAction(new k2.v(19, this, z10)).setDuration(420L).setInterpolator(gr.h).start();
    }

    public final boolean J() {
        ss0 ss0Var;
        ss0[] ss0VarArr = this.m0;
        if (ss0VarArr == null || (ss0Var = ss0VarArr[0]) == null) {
            return false;
        }
        if (this.f33207m1 && x0(ss0Var.E)) {
            return false;
        }
        boolean x02 = x0(ss0VarArr[0].E);
        int i10 = this.f33214o1[x02 ? 1 : 0];
        if (i10 == f0(x02 ? 1 : 0, i10, false)) {
            return false;
        }
        return true;
    }

    public final void J0(int i10) {
        int i11;
        int i12 = 2;
        ot0[] ot0VarArr = this.f33234v1;
        if (i10 == 0) {
            int i13 = ot0VarArr[0].f29190q;
            if (i13 == 1) {
                i12 = 6;
            } else if (i13 == 2) {
                i12 = 7;
            } else {
                i11 = 0;
            }
            i11 = i12;
        } else if (i10 == 1) {
            i11 = 1;
        } else {
            if (i10 != 2) {
                i12 = 4;
                if (i10 != 4) {
                    i12 = 5;
                    if (i10 != 5) {
                        i12 = 3;
                    }
                }
            }
            i11 = i12;
        }
        ot0VarArr[i10].f29181g = true;
        org.telegram.ui.ActionBar.k2 k2Var = this.f33240x1;
        k2Var.getMediaDataController().N0(this.l1, 50, 0, ot0VarArr[i10].f29184k, i11, this.F, 1, k2Var.getClassGuid(), ot0VarArr[i10].f29189p, null, null);
    }

    public final void J1() {
        boolean z10;
        int i10;
        th.x4 x4Var;
        boolean z02 = z0();
        org.telegram.ui.ActionBar.t0 t0Var = this.f33242y0;
        org.telegram.ui.ActionBar.t0 t0Var2 = this.f33239x0;
        int i11 = 8;
        if (z02) {
            if (t0Var2 != null) {
                t0Var2.setVisibility(8);
            }
            if (t0Var != null) {
                t0Var.setVisibility(8);
            }
        } else if (getClosestTab() == 9) {
            if (t0Var2 != null) {
                t0Var2.setVisibility(8);
            }
            if (t0Var != null) {
                t0Var.setVisibility(8);
            }
        } else if (getClosestTab() == 8) {
            int i12 = 0;
            while (true) {
                SparseArray[] sparseArrayArr = this.f33174b1;
                if (i12 < sparseArrayArr[0].size()) {
                    org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) sparseArrayArr[0].valueAt(i12);
                    hs0 hs0Var = this.f33183e0;
                    if (hs0Var != null && (x4Var = hs0Var.f32251s) != null && !x4Var.m(jjVar.f1())) {
                        z10 = true;
                        break;
                    }
                    i12++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (t0Var2 != null) {
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                t0Var2.setVisibility(i10);
            }
            if (t0Var != null) {
                if (!z10) {
                    i11 = 0;
                }
                t0Var.setVisibility(i11);
            }
        } else if (F0(getClosestTab())) {
            if (t0Var2 != null) {
                t0Var2.setVisibility(8);
            }
            if (t0Var != null) {
                t0Var.setVisibility(8);
            }
        }
    }

    public final void K(Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        ss0[] ss0VarArr;
        tk0 tk0Var;
        uq0 uq0Var;
        fs0 fs0Var;
        vq0 vq0Var;
        View[] viewPages;
        for (ss0 ss0Var : this.m0) {
            if (ss0Var != null && ss0Var.getVisibility() == 0) {
                if (ss0Var.O != null) {
                    RectF rectF2 = this.f33198i2;
                    if (zg.h.c(ss0Var, viewGroup, rectF2)) {
                        canvas.save();
                        canvas.translate(rectF2.left, rectF2.top);
                        ss0Var.e(canvas);
                        canvas.restore();
                    }
                }
                if (ss0Var.E == 14 && (vq0Var = this.f33170a0) != null && vq0Var.getParent() == ss0Var) {
                    for (View view : vq0Var.h.getViewPages()) {
                        if ((view instanceof ph.f2) && view.getVisibility() == 0) {
                            ii iiVar = ((ph.f2) view).f45045f;
                            yg.d.a(iiVar, canvas, rectF, iiVar, viewGroup);
                        }
                    }
                } else {
                    if (ss0Var.E == 12 && (fs0Var = this.V) != null && fs0Var.getParent() == ss0Var) {
                        tk0Var = fs0Var.f43336a.f42492z0;
                    } else if (ss0Var.E == 13 && (uq0Var = this.W) != null && uq0Var.getParent() == ss0Var) {
                        tk0Var = uq0Var.getCurrentListView();
                    } else {
                        tk0Var = ss0Var.h;
                    }
                    if (tk0Var != null && tk0Var.getVisibility() == 0) {
                        yg.d.a(tk0Var, canvas, rectF, tk0Var, viewGroup);
                    }
                }
            }
        }
    }

    public int K0() {
        return 0;
    }

    public void K1(boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zt0.K1(boolean):void");
    }

    public final void L() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zt0.L():void");
    }

    public final Boolean L1(View view, View view2) {
        if (!this.f33220q1) {
            ss0[] ss0VarArr = this.m0;
            boolean z10 = false;
            ss0 ss0Var = ss0VarArr[0];
            if (ss0Var != null) {
                int i10 = ss0Var.E;
                this.f33224r1 = i10;
                boolean x02 = x0(i10);
                int[] iArr = this.f33214o1;
                int f02 = f0(x02 ? 1 : 0, iArr[x02 ? 1 : 0], true);
                if (view != null && f02 == f0(x02 ? 1 : 0, f02, true)) {
                    view.setEnabled(false);
                    view.animate().alpha(0.5f).start();
                }
                if (iArr[x02 ? 1 : 0] != f02) {
                    if (view2 != null && !view2.isEnabled()) {
                        view2.setEnabled(true);
                        view2.animate().alpha(1.0f).start();
                    }
                    if (!x02) {
                        org.telegram.messenger.tz.B(f02);
                    } else if (k0(ss0VarArr[0].E) >= 5 || F0(ss0VarArr[0].E)) {
                        org.telegram.messenger.tz.F(f02);
                    }
                    E(f02);
                }
                if (f02 != f0(x02 ? 1 : 0, f02, true)) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
            return null;
        }
        return null;
    }

    public final void M() {
        ur0 ur0Var = this.K0;
        if (!ur0Var.d(ur0Var.getCurrentTabId())) {
            int firstTabId = ur0Var.getFirstTabId();
            ur0Var.setInitialTabId(firstTabId);
            this.m0[0].E = firstTabId;
            w1(false);
        }
    }

    public final Boolean M1(View view, View view2) {
        if (!this.f33220q1) {
            ss0[] ss0VarArr = this.m0;
            boolean z10 = false;
            ss0 ss0Var = ss0VarArr[0];
            if (ss0Var != null) {
                if (!this.f33207m1 || !x0(ss0Var.E)) {
                    int i10 = ss0VarArr[0].E;
                    this.f33224r1 = i10;
                    boolean x02 = x0(i10);
                    int[] iArr = this.f33214o1;
                    int f02 = f0(x02 ? 1 : 0, iArr[x02 ? 1 : 0], false);
                    if (view2 != null && f02 == f0(x02 ? 1 : 0, f02, false)) {
                        view2.setEnabled(false);
                        view2.animate().alpha(0.5f).start();
                    }
                    if (iArr[x02 ? 1 : 0] != f02) {
                        if (view != null && !view.isEnabled()) {
                            view.setEnabled(true);
                            view.animate().alpha(1.0f).start();
                        }
                        if (!x02) {
                            org.telegram.messenger.tz.B(f02);
                        } else if (k0(ss0VarArr[0].E) >= 5 || F0(ss0VarArr[0].E)) {
                            org.telegram.messenger.tz.F(f02);
                        }
                        E(f02);
                    }
                    if (f02 != f0(x02 ? 1 : 0, f02, false)) {
                        z10 = true;
                    }
                    return Boolean.valueOf(z10);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void N(org.telegram.ui.Components.ss0 r34, org.telegram.ui.Components.tk0 r35, s4.a0 r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zt0.N(org.telegram.ui.Components.ss0, org.telegram.ui.Components.tk0, s4.a0):void");
    }

    public final void N0() {
        th.x4 x4Var;
        th.x4 x4Var2;
        this.J1.a();
        hs0 hs0Var = this.f33183e0;
        if (hs0Var != null && (x4Var2 = hs0Var.f32251s) != null && x4Var2 != null) {
            x4Var2.z(hs0Var.f32252w);
        }
        tq0 tq0Var = this.f33190g0;
        if (tq0Var != null && (x4Var = tq0Var.f32251s) != null && x4Var != null) {
            x4Var.z(tq0Var.f32252w);
        }
        for (yt0 yt0Var : this.f33206l2.values()) {
            xt0 xt0Var = yt0Var.f32790c;
            th.x4 x4Var3 = xt0Var.f32251s;
            if (x4Var3 != null && x4Var3 != null) {
                x4Var3.z(xt0Var.f32252w);
            }
        }
    }

    public final boolean O(MotionEvent motionEvent) {
        float f7;
        s4.g0 g0Var;
        boolean z10;
        uq0 uq0Var;
        float f10;
        boolean z11;
        ss0[] ss0VarArr = this.m0;
        int i10 = ss0VarArr[0].E;
        if (i10 == 13 && (uq0Var = this.W) != null) {
            View currentView = uq0Var.f50263n.getCurrentView();
            if (currentView instanceof uh.i) {
                uh.i iVar = (uh.i) currentView;
                uh.e eVar = iVar.f50252w;
                uh.c cVar = iVar.f50248f;
                if (iVar.f50245a != null && iVar.getParent() != null) {
                    if (!iVar.f50246b || iVar.K) {
                        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
                            if (motionEvent.getActionMasked() == 2 && (iVar.K || iVar.M)) {
                                int i11 = -1;
                                int i12 = -1;
                                for (int i13 = 0; i13 < motionEvent.getPointerCount(); i13++) {
                                    if (iVar.N == motionEvent.getPointerId(i13)) {
                                        i11 = i13;
                                    }
                                    if (iVar.O == motionEvent.getPointerId(i13)) {
                                        i12 = i13;
                                    }
                                }
                                if (i11 != -1 && i12 != -1) {
                                    float hypot = ((float) Math.hypot(motionEvent.getX(i12) - motionEvent.getX(i11), motionEvent.getY(i12) - motionEvent.getY(i11))) / iVar.P;
                                    iVar.Q = hypot;
                                    if (!iVar.K && (hypot > 1.01f || hypot < 0.99f)) {
                                        iVar.K = true;
                                        if (hypot > 1.0f) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        iVar.R = z11;
                                        iVar.b(z11);
                                    }
                                    if (iVar.K) {
                                        boolean z12 = iVar.R;
                                        if ((z12 && iVar.Q < 1.0f) || (!z12 && iVar.Q > 1.0f)) {
                                            iVar.f50247c = 0.0f;
                                        } else {
                                            if (z12) {
                                                f10 = org.telegram.messenger.m5.y(2.0f, iVar.Q, 1.0f, 1.0f);
                                            } else {
                                                f10 = (1.0f - iVar.Q) / 0.5f;
                                            }
                                            iVar.f50247c = Math.max(0.0f, Math.min(1.0f, f10));
                                        }
                                        float f11 = iVar.f50247c;
                                        int i14 = (f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1));
                                        if (i14 == 0 || f11 == 0.0f) {
                                            if (i14 == 0) {
                                                int i15 = iVar.e;
                                                int ceil = (((int) Math.ceil(iVar.S / iVar.e)) * i15) + ((int) ((iVar.W.G.B1 / (cVar.getMeasuredWidth() - ((int) (cVar.getMeasuredWidth() / iVar.e)))) * (i15 - 1)));
                                                if (ceil >= eVar.b()) {
                                                    ceil = eVar.b() - 1;
                                                }
                                                iVar.S = ceil;
                                            }
                                            iVar.a();
                                            if (iVar.f50247c == 0.0f) {
                                                iVar.R = !iVar.R;
                                            }
                                            iVar.b(iVar.R);
                                            iVar.P = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                        }
                                        cVar.invalidate();
                                    }
                                } else {
                                    iVar.L = false;
                                    iVar.M = false;
                                    iVar.K = false;
                                    iVar.a();
                                    return false;
                                }
                            } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((iVar.N == motionEvent.getPointerId(0) && iVar.O == motionEvent.getPointerId(1)) || (iVar.N == motionEvent.getPointerId(1) && iVar.O == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && iVar.K) {
                                iVar.M = false;
                                iVar.L = false;
                                iVar.K = false;
                                iVar.a();
                            }
                        } else {
                            if (iVar.L && !iVar.K && motionEvent.getPointerCount() == 2) {
                                iVar.P = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                iVar.Q = 1.0f;
                                iVar.N = motionEvent.getPointerId(0);
                                iVar.O = motionEvent.getPointerId(1);
                                cVar.I0(false);
                                cVar.cancelLongPress();
                                cVar.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                View view = (View) iVar.getParent();
                                iVar.U = (int) ((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view.getX()) - iVar.getX());
                                int y3 = (int) ((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view.getY()) - iVar.getY());
                                int i16 = iVar.U;
                                Rect rect = iVar.V;
                                iVar.S = -1;
                                int top = y3 - cVar.getTop();
                                for (int i17 = 0; i17 < cVar.getChildCount(); i17++) {
                                    View childAt = cVar.getChildAt(i17);
                                    childAt.getHitRect(rect);
                                    if (rect.contains(i16, top)) {
                                        iVar.S = RecyclerView.S(childAt);
                                        iVar.T = childAt.getTop();
                                    }
                                }
                                iVar.M = true;
                            }
                            if (motionEvent.getActionMasked() == 0 && (motionEvent.getY() - ((View) iVar.getParent()).getY()) - iVar.getY() > 0.0f) {
                                iVar.L = true;
                            }
                        }
                        return iVar.K;
                    }
                    return true;
                }
            }
            return false;
        }
        if ((i10 == 0 || x0(i10)) && getParent() != null) {
            if (!this.f33220q1 || this.f33169a) {
                if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
                    if (motionEvent.getActionMasked() == 2 && (this.f33169a || this.f33176c)) {
                        int i18 = -1;
                        int i19 = -1;
                        for (int i20 = 0; i20 < motionEvent.getPointerCount(); i20++) {
                            if (this.e == motionEvent.getPointerId(i20)) {
                                i18 = i20;
                            }
                            if (this.f33186f == motionEvent.getPointerId(i20)) {
                                i19 = i20;
                            }
                        }
                        if (i18 != -1 && i19 != -1) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(i19) - motionEvent.getX(i18), motionEvent.getY(i19) - motionEvent.getY(i18))) / this.h;
                            this.f33209n = hypot2;
                            if (!this.f33169a && (hypot2 > 1.01f || hypot2 < 0.99f)) {
                                this.f33169a = true;
                                if (hypot2 > 1.0f) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                this.f33222r = z10;
                                o1(z10);
                            }
                            if (this.f33169a) {
                                boolean z13 = this.f33222r;
                                if ((z13 && this.f33209n < 1.0f) || (!z13 && this.f33209n > 1.0f)) {
                                    this.f33217p1 = 0.0f;
                                } else {
                                    if (z13) {
                                        f7 = org.telegram.messenger.m5.y(2.0f, this.f33209n, 1.0f, 1.0f);
                                    } else {
                                        f7 = (1.0f - this.f33209n) / 0.5f;
                                    }
                                    this.f33217p1 = Math.max(0.0f, Math.min(1.0f, f7));
                                }
                                float f12 = this.f33217p1;
                                if (f12 == 1.0f || f12 == 0.0f) {
                                    if (x0(this.f33224r1)) {
                                        g0Var = u1(this.f33224r1);
                                    } else {
                                        g0Var = this.J;
                                    }
                                    if (this.f33217p1 == 1.0f) {
                                        int i21 = this.f33228s1;
                                        int ceil2 = (((int) Math.ceil(this.f33226s / this.f33228s1)) * i21) + ((int) ((this.B1 / (ss0VarArr[0].h.getMeasuredWidth() - ((int) (ss0VarArr[0].h.getMeasuredWidth() / this.f33228s1)))) * (i21 - 1)));
                                        if (ceil2 >= g0Var.b()) {
                                            ceil2 = g0Var.b() - 1;
                                        }
                                        this.f33226s = ceil2;
                                    }
                                    b0();
                                    if (this.f33217p1 == 0.0f) {
                                        this.f33222r = !this.f33222r;
                                    }
                                    o1(this.f33222r);
                                    this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                }
                                ss0VarArr[0].h.invalidate();
                                ss0 ss0Var = ss0VarArr[0];
                                if (ss0Var.F != null) {
                                    ss0Var.invalidate();
                                }
                            }
                        } else {
                            this.f33172b = false;
                            this.f33176c = false;
                            this.f33169a = false;
                            b0();
                            return false;
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.e == motionEvent.getPointerId(0) && this.f33186f == motionEvent.getPointerId(1)) || (this.e == motionEvent.getPointerId(1) && this.f33186f == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.f33169a) {
                        this.f33176c = false;
                        this.f33172b = false;
                        this.f33169a = false;
                        b0();
                    }
                } else {
                    if (this.f33172b && !this.f33169a && motionEvent.getPointerCount() == 2) {
                        this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.f33209n = 1.0f;
                        this.e = motionEvent.getPointerId(0);
                        this.f33186f = motionEvent.getPointerId(1);
                        ss0VarArr[0].h.I0(false);
                        ss0VarArr[0].h.cancelLongPress();
                        ss0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.f33238x = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - ss0VarArr[0].getX());
                        int y10 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - ss0VarArr[0].getY());
                        int i22 = this.f33238x;
                        this.f33226s = -1;
                        int top2 = y10 - ss0VarArr[0].h.getTop();
                        if (getY() != 0.0f && this.E == 1) {
                            top2 = 0;
                        }
                        for (int i23 = 0; i23 < ss0VarArr[0].h.getChildCount(); i23++) {
                            View childAt2 = ss0VarArr[0].h.getChildAt(i23);
                            Rect rect2 = this.f33241y;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i22, top2)) {
                                ss0VarArr[0].h.getClass();
                                this.f33226s = RecyclerView.S(childAt2);
                                this.f33235w = childAt2.getTop();
                            }
                        }
                        if (this.F1.X() && this.f33226s == -1) {
                            this.f33226s = (int) (((this.f33214o1[x0(ss0VarArr[0].E) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i22 / ss0VarArr[0].h.getMeasuredWidth(), 0.0f))) + ss0VarArr[0].f30356x.L0());
                            this.f33235w = 0;
                        }
                        this.f33176c = true;
                    }
                    if (motionEvent.getActionMasked() == 0 && ((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - ss0VarArr[0].getY() > this.f33179c2) {
                        this.f33172b = true;
                    }
                }
                return this.f33169a;
            }
            return true;
        }
        return false;
    }

    public final void O0(int i10, View view, org.telegram.messenger.jj jjVar, int i11) {
        TLRPC.WebPage webPage;
        String str;
        char c10;
        int i12;
        int i13;
        boolean z10;
        if (jjVar != null && !this.f33220q1) {
            zq0 zq0Var = this.f33173b0;
            if (zq0Var == null || !zq0Var.f44256f) {
                int i14 = 0;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                i14 = 0;
                String str2 = null;
                th.x4 x4Var = null;
                if (this.E1) {
                    int i15 = 8;
                    if (i11 != 8 || G()) {
                        if (org.telegram.messenger.jj.B0(jjVar.f16337k) == this.l1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        SparseArray[] sparseArrayArr = this.f33174b1;
                        if (sparseArrayArr[c10].indexOfKey(jjVar.f1()) >= 0) {
                            sparseArrayArr[c10].remove(jjVar.f1());
                            if (!jjVar.s(null, false)) {
                                this.f33178c1--;
                            }
                        } else {
                            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                                sparseArrayArr[c10].put(jjVar.f1(), jjVar);
                                if (!jjVar.s(null, false)) {
                                    this.f33178c1++;
                                }
                            } else {
                                return;
                            }
                        }
                        L0(sparseArrayArr[0]);
                        if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                            l1(false);
                        } else {
                            j1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                            if (this.f33178c1 == 0) {
                                i12 = 0;
                            } else {
                                i12 = 8;
                            }
                            this.f33210n0.setVisibility(i12);
                            org.telegram.ui.ActionBar.t0 t0Var = this.f33236w0;
                            if (t0Var != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14 && sparseArrayArr[0].size() == 1) {
                                    i13 = 0;
                                } else {
                                    i13 = 8;
                                }
                                t0Var.setVisibility(i13);
                            }
                            org.telegram.ui.ActionBar.t0 t0Var2 = this.f33233v0;
                            if (t0Var2 != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                                    i15 = 0;
                                }
                                t0Var2.setVisibility(i15);
                            }
                            J1();
                        }
                        this.f33181d1 = false;
                        if (view instanceof org.telegram.ui.Cells.l7) {
                            org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                            if (sparseArrayArr[c10].indexOfKey(jjVar.f1()) >= 0) {
                                z11 = true;
                            }
                            l7Var.b(z11, true);
                        } else if (view instanceof org.telegram.ui.Cells.t7) {
                            org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                            if (sparseArrayArr[c10].indexOfKey(jjVar.f1()) >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            t7Var.b(0, z10, true);
                        } else if (view instanceof org.telegram.ui.Cells.o7) {
                            org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                            if (sparseArrayArr[c10].indexOfKey(jjVar.f1()) >= 0) {
                                z12 = true;
                            }
                            o7Var.f(z12, true);
                        } else if (view instanceof org.telegram.ui.Cells.k7) {
                            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                            if (sparseArrayArr[c10].indexOfKey(jjVar.f1()) >= 0) {
                                z13 = true;
                            }
                            k7Var.e(z13, true);
                        } else if (view instanceof org.telegram.ui.Cells.h2) {
                            org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) view;
                            if (sparseArrayArr[c10].indexOfKey(jjVar.f1()) >= 0) {
                                z14 = true;
                            }
                            h2Var.c(z14, true);
                        } else if (view instanceof org.telegram.ui.Cells.s7) {
                            org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                            if (sparseArrayArr[c10].indexOfKey(jjVar.f1()) >= 0) {
                                z15 = true;
                            }
                            s7Var.i(z15, true);
                        }
                    } else {
                        return;
                    }
                } else {
                    fr0 fr0Var = this.f33230t1;
                    ot0[] ot0VarArr = this.f33234v1;
                    org.telegram.ui.ActionBar.k2 k2Var = this.f33240x1;
                    if (i11 == 0) {
                        ot0 ot0Var = ot0VarArr[i11];
                        int i16 = i10 - ot0Var.f29186m;
                        if (i16 >= 0 && i16 < ot0Var.f29177a.size()) {
                            PhotoViewer.v1().N2(null, k2Var, null);
                            PhotoViewer.v1().e2(ot0VarArr[i11].f29177a, i16, this.l1, this.f33184e1, this.F, fr0Var);
                        }
                    } else if (i11 != 2 && i11 != 4) {
                        if (i11 == 5) {
                            PhotoViewer.v1().N2(null, k2Var, null);
                            int indexOf = ot0VarArr[i11].f29177a.indexOf(jjVar);
                            if (indexOf < 0) {
                                PhotoViewer.v1().e2(org.telegram.messenger.m5.j(jjVar), 0, 0L, 0L, 0L, fr0Var);
                            } else {
                                PhotoViewer.v1().e2(ot0VarArr[i11].f29177a, indexOf, this.l1, this.f33184e1, this.F, fr0Var);
                            }
                        } else if (i11 == 1) {
                            if (view instanceof org.telegram.ui.Cells.l7) {
                                org.telegram.ui.Cells.l7 l7Var2 = (org.telegram.ui.Cells.l7) view;
                                TLRPC.Document F0 = jjVar.F0();
                                if (l7Var2.G) {
                                    if (jjVar.x()) {
                                        PhotoViewer.v1().N2(null, k2Var, null);
                                        int indexOf2 = ot0VarArr[i11].f29177a.indexOf(jjVar);
                                        if (indexOf2 < 0) {
                                            PhotoViewer.v1().e2(org.telegram.messenger.m5.j(jjVar), 0, 0L, 0L, 0L, fr0Var);
                                            return;
                                        }
                                        PhotoViewer.v1().e2(ot0VarArr[i11].f29177a, indexOf2, this.l1, this.f33184e1, this.F, fr0Var);
                                        return;
                                    }
                                    org.telegram.messenger.i0.s2(jjVar, k2Var.getParentActivity(), k2Var);
                                } else if (!l7Var2.F) {
                                    org.telegram.messenger.jj message = l7Var2.getMessage();
                                    message.P = true;
                                    k2Var.getFileLoader().X(F0, message, 0, 0);
                                    l7Var2.f(true);
                                } else {
                                    k2Var.getFileLoader().f(F0);
                                    l7Var2.f(true);
                                }
                            }
                        } else if (i11 == 3) {
                            try {
                                if (org.telegram.messenger.jj.o1(jjVar.f16337k) != null) {
                                    webPage = org.telegram.messenger.jj.o1(jjVar.f16337k).webpage;
                                } else {
                                    webPage = null;
                                }
                                if (webPage != null && !(webPage instanceof TLRPC.TL_webPageEmpty)) {
                                    if (webPage.cached_page != null) {
                                        LaunchActivity launchActivity = LaunchActivity.I1;
                                        if (launchActivity == null || launchActivity.O() == null || LaunchActivity.I1.O().k(jjVar) == null) {
                                            k2Var.createArticleViewer(false).L(jjVar, null, null, null);
                                            return;
                                        }
                                        return;
                                    }
                                    String str3 = webPage.embed_url;
                                    if (str3 != null && str3.length() != 0) {
                                        hu.K0(k2Var, jjVar, this.f33230t1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                        return;
                                    }
                                    str = webPage.url;
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    ArrayList arrayList = ((org.telegram.ui.Cells.o7) view).E;
                                    if (arrayList.size() > 0) {
                                        str2 = ((CharSequence) arrayList.get(0)).toString();
                                    }
                                    str = str2;
                                }
                                if (str != null) {
                                    Y0(str);
                                }
                            } catch (Exception e) {
                                org.telegram.messenger.f8.g(e, true);
                            }
                        } else if (x0(i11)) {
                            wt0 u12 = u1(i11);
                            if (u12 != null) {
                                x4Var = u12.f32251s;
                            }
                            if (x4Var != null) {
                                th.o7 orCreateStoryViewer = k2Var.getOrCreateStoryViewer();
                                Context context = getContext();
                                int f12 = jjVar.f1();
                                th.n5 a2 = th.n5.a(this.m0[0].h);
                                a2.e = new px(x4Var, 19);
                                if ((k2Var instanceof ProfileActivity) && ((ProfileActivity) k2Var).f33892r1) {
                                    i14 = org.telegram.messenger.i0.L(68.0f);
                                }
                                a2.f49265s += i14;
                                orCreateStoryViewer.Q(context, f12, x4Var, a2);
                            } else {
                                return;
                            }
                        }
                    } else if (view instanceof org.telegram.ui.Cells.k7) {
                        ((org.telegram.ui.Cells.k7) view).a();
                    }
                }
                B1();
            }
        }
    }

    public final void P(boolean z10, boolean z11) {
        boolean z12;
        if (this.H != null) {
            int closestTab = getClosestTab();
            boolean z13 = false;
            org.telegram.ui.ActionBar.t0 t0Var = this.f33216p0;
            if (t0Var != null) {
                if (this.f33218p2 && H() && (B0(closestTab) || (closestTab == 11 && v0()))) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ((org.telegram.ui.ActionBar.p5) t0Var).Y(z12, z10);
            }
            org.telegram.ui.ActionBar.p5 p5Var = this.I;
            if (p5Var != null) {
                if (this.f33218p2 && H() && !y0() && t0(closestTab)) {
                    z13 = true;
                }
                p5Var.Y(z13, z11);
            }
        }
    }

    public final boolean P0(org.telegram.messenger.jj jjVar, View view, int i10, boolean z10) {
        zq0 zq0Var;
        char c10;
        int i11;
        int i12;
        final TL_stories.StoryItem storyItem;
        hs0 hs0Var;
        th.x4 x4Var;
        if (!this.E1) {
            org.telegram.ui.ActionBar.k2 k2Var = this.f33240x1;
            if (k2Var.getParentActivity() != null && jjVar != null && ((zq0Var = this.f33173b0) == null || !zq0Var.f44256f)) {
                org.telegram.messenger.i0.v1(k2Var.getParentActivity().getCurrentFocus());
                long j10 = this.l1;
                int i13 = 8;
                if (z10 && ((F0(getClosestTab()) || getClosestTab() == 8) && !this.E1)) {
                    if (view instanceof org.telegram.ui.Cells.s7) {
                        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                        s7Var.k(s7Var.f23033n, s7Var.f23038r, true);
                    }
                    TL_stories.StoryItem storyItem2 = jjVar.f16341l;
                    if (storyItem2 != null) {
                        HashSet hashSet = new HashSet();
                        ArrayList<Integer> arrayList = storyItem2.albums;
                        if (arrayList != null) {
                            hashSet.addAll(arrayList);
                        }
                        boolean F0 = F0(getClosestTab());
                        z60 I = z60.I(k2Var, view);
                        z60 J = I.J();
                        J.c(2131231241, org.telegram.messenger.cd.L0(2131753756, null), new org.telegram.ui.rr0(I, 27), false);
                        J.k();
                        z60.f(J, getStoriesController().B(j10, true), hashSet, true, new jg(this, storyItem2, I, 19), new ag.m2(this, hashSet, storyItem2, I, 10));
                        I.c(2131231764, org.telegram.messenger.cd.L0(2131744823, null), new bi.k(I, J, 8), false);
                        I.k();
                        I.c(2131232356, org.telegram.messenger.cd.L0(2131744807, null), new ag.g3(this, jjVar, view, i10, 23), false);
                        if (F0) {
                            int r12 = r1(getClosestTab());
                            String w9 = getStoriesController().w(r12, j10);
                            I.c(2131232770, org.telegram.messenger.cd.L0(2131744808, null), new yp0(this, r12, 0), false);
                            storyItem = storyItem2;
                            I.c(2131232328, org.telegram.messenger.cd.L0(2131744809, null), new ag.g3(this, r12, storyItem, w9, 24), false);
                        } else {
                            storyItem = storyItem2;
                            if (getClosestTab() == 8 && (hs0Var = this.f33183e0) != null && (x4Var = hs0Var.f32251s) != null) {
                                if (x4Var.m(storyItem.f20031id)) {
                                    I.c(2131231002, org.telegram.messenger.cd.L0(2131744805, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            int i14 = r1;
                                            TL_stories.StoryItem storyItem3 = storyItem;
                                            zt0 zt0Var = this;
                                            switch (i14) {
                                                case 0:
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zt0Var.getContext(), zt0Var.H1);
                                                    String L0 = org.telegram.messenger.cd.L0(2131751488, null);
                                                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                                                    x1Var.R = L0;
                                                    x1Var.T = org.telegram.messenger.cd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new jq0(zt0Var, storyItem3));
                                                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new au(24));
                                                    x1Var.show();
                                                    x1Var.i();
                                                    return;
                                                case 1:
                                                    zt0Var.getClass();
                                                    zt0Var.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f20031id))), false);
                                                    return;
                                                case 2:
                                                    zt0Var.getClass();
                                                    zt0Var.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f20031id))), true);
                                                    return;
                                                default:
                                                    zt0.h(zt0Var, storyItem3);
                                                    return;
                                            }
                                        }
                                    }, false);
                                } else {
                                    I.c(2131230998, org.telegram.messenger.cd.L0(2131744810, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            int i14 = r1;
                                            TL_stories.StoryItem storyItem3 = storyItem;
                                            zt0 zt0Var = this;
                                            switch (i14) {
                                                case 0:
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zt0Var.getContext(), zt0Var.H1);
                                                    String L0 = org.telegram.messenger.cd.L0(2131751488, null);
                                                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                                                    x1Var.R = L0;
                                                    x1Var.T = org.telegram.messenger.cd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new jq0(zt0Var, storyItem3));
                                                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new au(24));
                                                    x1Var.show();
                                                    x1Var.i();
                                                    return;
                                                case 1:
                                                    zt0Var.getClass();
                                                    zt0Var.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f20031id))), false);
                                                    return;
                                                case 2:
                                                    zt0Var.getClass();
                                                    zt0Var.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f20031id))), true);
                                                    return;
                                                default:
                                                    zt0.h(zt0Var, storyItem3);
                                                    return;
                                            }
                                        }
                                    }, false);
                                }
                            }
                            I.c(2131232050, org.telegram.messenger.cd.L0(2131744815, null), new Runnable() {
                                @Override
                                public final void run() {
                                    int i14 = r1;
                                    TL_stories.StoryItem storyItem3 = storyItem;
                                    zt0 zt0Var = this;
                                    switch (i14) {
                                        case 0:
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zt0Var.getContext(), zt0Var.H1);
                                            String L0 = org.telegram.messenger.cd.L0(2131751488, null);
                                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                                            x1Var.R = L0;
                                            x1Var.T = org.telegram.messenger.cd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new jq0(zt0Var, storyItem3));
                                            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new au(24));
                                            x1Var.show();
                                            x1Var.i();
                                            return;
                                        case 1:
                                            zt0Var.getClass();
                                            zt0Var.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f20031id))), false);
                                            return;
                                        case 2:
                                            zt0Var.getClass();
                                            zt0Var.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f20031id))), true);
                                            return;
                                        default:
                                            zt0.h(zt0Var, storyItem3);
                                            return;
                                    }
                                }
                            }, false);
                        }
                        I.c(2131232107, org.telegram.messenger.cd.L0(2131751599, null), new Runnable() {
                            @Override
                            public final void run() {
                                int i14 = r1;
                                TL_stories.StoryItem storyItem3 = storyItem;
                                zt0 zt0Var = this;
                                switch (i14) {
                                    case 0:
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zt0Var.getContext(), zt0Var.H1);
                                        String L0 = org.telegram.messenger.cd.L0(2131751488, null);
                                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                                        x1Var.R = L0;
                                        x1Var.T = org.telegram.messenger.cd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new jq0(zt0Var, storyItem3));
                                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new au(24));
                                        x1Var.show();
                                        x1Var.i();
                                        return;
                                    case 1:
                                        zt0Var.getClass();
                                        zt0Var.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f20031id))), false);
                                        return;
                                    case 2:
                                        zt0Var.getClass();
                                        zt0Var.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f20031id))), true);
                                        return;
                                    default:
                                        zt0.h(zt0Var, storyItem3);
                                        return;
                                }
                            }
                        }, true);
                        I.f32923i = 3;
                        I.f32943u = true;
                        I.v = true;
                        I.L = true;
                        I.M = 3;
                        Point point = org.telegram.messenger.i0.f16026q;
                        int min = Math.min((int) (Math.min(point.x, point.y) * 0.6777f), (int) (((Math.max(point.x, point.y) * 0.4333f) * 3.0f) / 4.0f));
                        I.N = min;
                        I.O = (min * 4) / 3;
                        I.f32942t = true;
                        I.P = true;
                        I.W = true;
                        I.Z();
                        return true;
                    }
                } else {
                    if (org.telegram.messenger.jj.B0(jjVar.f16337k) == j10) {
                        c10 = 0;
                    } else {
                        c10 = 1;
                    }
                    SparseArray[] sparseArrayArr = this.f33174b1;
                    sparseArrayArr[c10].put(jjVar.f1(), jjVar);
                    if (!jjVar.s(null, false)) {
                        this.f33178c1++;
                    }
                    if (this.f33178c1 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    this.f33210n0.setVisibility(i11);
                    org.telegram.ui.ActionBar.t0 t0Var = this.f33236w0;
                    if (t0Var != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i12 = 0;
                        } else {
                            i12 = 8;
                        }
                        t0Var.setVisibility(i12);
                    }
                    org.telegram.ui.ActionBar.t0 t0Var2 = this.f33233v0;
                    if (t0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i13 = 0;
                        }
                        t0Var2.setVisibility(i13);
                    }
                    j1(1, false);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    int i14 = 0;
                    while (true) {
                        ArrayList arrayList3 = this.P0;
                        if (i14 >= arrayList3.size()) {
                            break;
                        }
                        View view2 = (View) arrayList3.get(i14);
                        org.telegram.messenger.i0.y(view2);
                        arrayList2.add(ObjectAnimator.ofFloat(view2, View.SCALE_Y, 0.1f, 1.0f));
                        i14++;
                    }
                    animatorSet.playTogether(arrayList2);
                    animatorSet.setDuration(250L);
                    animatorSet.start();
                    this.f33181d1 = false;
                    if (view instanceof org.telegram.ui.Cells.l7) {
                        ((org.telegram.ui.Cells.l7) view).b(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.t7) {
                        ((org.telegram.ui.Cells.t7) view).b(i10, true, true);
                    } else if (view instanceof org.telegram.ui.Cells.o7) {
                        ((org.telegram.ui.Cells.o7) view).f(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.k7) {
                        ((org.telegram.ui.Cells.k7) view).e(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.h2) {
                        ((org.telegram.ui.Cells.h2) view).c(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.s7) {
                        ((org.telegram.ui.Cells.s7) view).i(true, true);
                    }
                    if (!this.E1) {
                        l1(true);
                    }
                    L0(sparseArrayArr[0]);
                    B1();
                    return true;
                }
            }
        }
        return false;
    }

    public final void Q() {
        char c10;
        char c11;
        float abs;
        View childAt;
        int R;
        float f7;
        float measuredWidth;
        ss0[] ss0VarArr = this.m0;
        ss0 ss0Var = ss0VarArr[0];
        if (ss0Var != null && ss0VarArr[1] != null) {
            float f10 = 0.0f;
            zq0 zq0Var = this.f33173b0;
            if (zq0Var != null) {
                if (x0(ss0Var.E) && ss0VarArr[0].E != 9) {
                    c10 = 1;
                } else {
                    c10 = 0;
                }
                if (ss0VarArr[1].getVisibility() == 0) {
                    if (x0(ss0VarArr[1].E) && ss0VarArr[1].E != 9) {
                        c11 = 1;
                    } else {
                        c11 = 0;
                    }
                } else {
                    c11 = c10;
                }
                if (c10 == c11) {
                    if (c10 != 0) {
                        abs = 1.0f;
                    } else {
                        abs = 0.0f;
                    }
                    if (c10 != 0) {
                        measuredWidth = 0.0f;
                    } else {
                        measuredWidth = ss0VarArr[0].getMeasuredWidth();
                    }
                    zq0Var.setTranslationX(measuredWidth);
                } else {
                    zq0Var.setTranslationX(ss0VarArr[c10 ^ 1].getTranslationX());
                    abs = 1.0f - (Math.abs(zq0Var.getTranslationX()) / zq0Var.getMeasuredWidth());
                }
                float f11 = 0.0f;
                for (int i10 = 0; i10 < ss0VarArr.length; i10++) {
                    if (ss0VarArr[i10].getVisibility() == 0) {
                        dr0 dr0Var = ss0VarArr[i10].h;
                        if (dr0Var.getChildCount() == 0) {
                            childAt = null;
                        } else {
                            childAt = dr0Var.getChildAt(0);
                        }
                        if (childAt == null) {
                            R = -1;
                        } else {
                            R = RecyclerView.R(childAt);
                        }
                        if (R == 0) {
                            f7 = childAt.getY() - dr0Var.getPaddingTop();
                        } else if (dr0Var.getChildCount() == 0) {
                            f7 = 0.0f;
                        } else {
                            f7 = -org.telegram.messenger.i0.L(48.0f);
                        }
                        f11 += Utilities.l(1.0f - (ss0VarArr[i10].getTranslationX() / ss0VarArr[i10].getMeasuredWidth())) * f7;
                    }
                }
                float l4 = Utilities.l(1.0f - ((-f11) / org.telegram.messenger.i0.N(48.0f)));
                float T1 = org.telegram.messenger.i0.T1(0.9f, 1.0f, l4);
                zq0Var.setAlpha(l4);
                zq0Var.setScaleX(T1);
                zq0Var.setScaleY(T1);
                zq0Var.setTranslationY(this.N1 + f11);
                f10 = abs;
            }
            S();
            if (this.X1 != f10) {
                this.X1 = f10;
                invalidate();
            }
        }
    }

    public boolean Q0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return false;
    }

    public final boolean R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zt0.R():boolean");
    }

    public final void R0(float f7) {
        ss0 ss0Var;
        int i10;
        int i11;
        ss0 ss0Var2;
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        ss0[] ss0VarArr = this.m0;
        if (i12 != 0 || ss0VarArr[1].getVisibility() == 0) {
            if (this.f33200j1) {
                ss0VarArr[0].setTranslationX((-f7) * ss0Var2.getMeasuredWidth());
                ss0VarArr[1].setTranslationX(ss0VarArr[0].getMeasuredWidth() - (ss0VarArr[0].getMeasuredWidth() * f7));
            } else {
                ss0VarArr[0].setTranslationX(ss0Var.getMeasuredWidth() * f7);
                ss0VarArr[1].setTranslationX((ss0VarArr[0].getMeasuredWidth() * f7) - ss0VarArr[0].getMeasuredWidth());
            }
            U0(getTabProgress());
            float i02 = i0(f7);
            this.f33223r0 = i02;
            int i13 = 4;
            if (i02 != 0.0f && H() && !y0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            this.f33229t0.setVisibility(i10);
            org.telegram.ui.ActionBar.t0 t0Var = this.f33216p0;
            if (t0Var != null && !H()) {
                if (E0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                setSearchItemVisibility(i11);
                this.f33219q0 = 0.0f;
            } else {
                this.f33219q0 = j0(f7);
                I1();
            }
            D1(false);
            if (i12 == 0) {
                ss0 ss0Var3 = ss0VarArr[0];
                ss0VarArr[0] = ss0VarArr[1];
                ss0VarArr[1] = ss0Var3;
                ss0Var3.setVisibility(8);
                if (t0Var != null && this.f33244z0 == 2) {
                    if (E0()) {
                        i13 = 8;
                    }
                    setSearchItemVisibility(i13);
                }
                this.f33244z0 = 0;
                p1();
            }
        }
    }

    public final void S() {
        zr zrVar = this.R0;
        if (zrVar != null) {
            zrVar.setTranslationY(this.N1);
        }
    }

    public final boolean T(boolean z10) {
        SparseArray[] sparseArrayArr;
        if (!this.E1) {
            return false;
        }
        int i10 = 1;
        while (true) {
            sparseArrayArr = this.f33174b1;
            if (i10 < 0) {
                break;
            }
            sparseArrayArr[i10].clear();
            i10--;
        }
        this.f33178c1 = 0;
        L0(sparseArrayArr[0]);
        uq0 uq0Var = this.W;
        if (uq0Var != null) {
            uq0Var.h();
            uq0Var.j();
        }
        l1(false);
        G1(z10);
        it0 it0Var = this.T;
        if (it0Var != null) {
            it0Var.f27083x.clear();
        }
        return true;
    }

    public void T0() {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (!E0() && !y0()) {
            z10 = false;
        } else {
            z10 = true;
        }
        ut0 ut0Var = this.f33190g0.f32253x;
        if (ut0Var != null) {
            if (z10 && getClosestTab() == 9) {
                z13 = true;
            } else {
                z13 = false;
            }
            ut0Var.b(z13);
        }
        ut0 ut0Var2 = this.f33183e0.f32253x;
        if (ut0Var2 != null) {
            if (z10 && getClosestTab() == 8) {
                z12 = true;
            } else {
                z12 = false;
            }
            ut0Var2.b(z12);
        }
        for (yt0 yt0Var : this.f33206l2.values()) {
            xt0 xt0Var = yt0Var.f32790c;
            if (xt0Var.f32251s != null) {
                ut0 ut0Var3 = xt0Var.f32253x;
                if (z10 && getClosestTab() == yt0Var.f32788a) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ut0Var3.b(z11);
            }
        }
        org.telegram.ui.ActionBar.t0 t0Var = this.f33216p0;
        if (t0Var != null) {
            rr0 rr0Var = this.L0;
            if (rr0Var != null && rr0Var.a() && getSelectedTab() == 11) {
                i10 = 2131745885;
            } else {
                i10 = 2131745853;
            }
            t0Var.setSearchFieldHint(org.telegram.messenger.cd.L0(i10, null));
        }
        Q();
        P(true, true);
    }

    public final org.telegram.ui.ActionBar.t0 U(Context context, int i10, int i11, String str) {
        org.telegram.ui.ActionBar.t0 t0Var;
        org.telegram.ui.ActionBar.i5 i5Var = this.H;
        if (i5Var != null) {
            t0Var = i5Var.l().b(i10, i11);
        } else {
            int i12 = org.telegram.ui.ActionBar.t6.f21332z8;
            int q02 = q0(i12);
            int i13 = org.telegram.ui.ActionBar.t6.f21313y8;
            org.telegram.ui.ActionBar.t0 t0Var2 = new org.telegram.ui.ActionBar.t0(context, null, q02, q0(i13), false, null);
            t0Var2.setIcon(i11);
            t0Var2.setDuplicateParentStateEnabled(false);
            this.D0.addView(t0Var2, new LinearLayout.LayoutParams(org.telegram.messenger.i0.L(54.0f), -1));
            this.P0.add(t0Var2);
            ei0 iconView = t0Var2.getIconView();
            org.telegram.ui.ActionBar.p6 p6Var = this.H1;
            if (iconView != null) {
                org.telegram.ui.ActionBar.a7.t(t0Var2.getIconView(), i13, p6Var, PorterDuff.Mode.SRC_IN);
            }
            if (t0Var2.getBackground() != null) {
                Drawable background = t0Var2.getBackground();
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
                t0Var2.setBackground(background);
                org.telegram.ui.ActionBar.a7.k(t0Var2, background, null, N, p6Var);
            }
            t0Var = t0Var2;
        }
        t0Var.setContentDescription(str);
        t0Var.setOnClickListener(new bh.f(this, i10, 13));
        return t0Var;
    }

    public void U0(float f7) {
        M0();
    }

    public final void V0(org.telegram.ui.ActionBar.k2 k2Var, long j10, int i10) {
        new org.telegram.ui.t31(k2Var, j10, this.f33214o1[1], new zb(this, j10, i10)).show();
    }

    public boolean W() {
        return this instanceof g30;
    }

    public final void W0(org.telegram.ui.ActionBar.k2 k2Var, long j10, int i10) {
        s4.u0(k2Var, org.telegram.messenger.cd.L0(2131751599, null), org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131744813, getStoriesController().w(i10, j10))), org.telegram.messenger.cd.L0(2131751599, null), true, new org.telegram.messenger.dd(this, j10, i10, 6));
    }

    public final boolean X(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x10 = (-view.getX()) - getX();
        ss0[] ss0VarArr = this.m0;
        motionEvent.offsetLocation(x10 - ss0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - ss0VarArr[0].getY()) - ss0VarArr[0].h.getFastScroll().getY());
        return ss0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public final void X0(org.telegram.ui.ActionBar.k2 k2Var, long j10, int i10) {
        String w9 = getStoriesController().w(i10, j10);
        Context context = k2Var.getContext();
        org.telegram.ui.ActionBar.p6 resourceProvider = k2Var.getResourceProvider();
        j2.d dVar = new j2.d(this, j10, i10, 6);
        Pattern pattern = s4.f30123a;
        s4.Q(context, k2Var, org.telegram.messenger.cd.L0(2131744800, null), org.telegram.messenger.cd.L0(2131744799, null), org.telegram.messenger.cd.L0(2131744798, null), w9, 12, org.telegram.messenger.cd.L0(2131746293, null), resourceProvider, dVar);
    }

    public final boolean Y(int i10) {
        ot0[] ot0VarArr = this.f33237w1.f30020n;
        if (ot0VarArr == null) {
            return false;
        }
        ot0[] ot0VarArr2 = this.f33234v1;
        if (i10 == 0) {
            ot0 ot0Var = ot0VarArr2[i10];
            if (!ot0Var.h) {
                int[] iArr = ot0Var.f29180f;
                int[] iArr2 = ot0VarArr[i10].f29180f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = ot0VarArr2[i10].f29180f;
            int[] iArr4 = ot0VarArr[i10].f29180f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        ot0VarArr2[i10].f29177a.addAll(ot0VarArr[i10].f29177a);
        ot0VarArr2[i10].f29179c.addAll(ot0VarArr[i10].f29179c);
        for (Map.Entry entry : ot0VarArr[i10].d.entrySet()) {
            ot0VarArr2[i10].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i11 = 0; i11 < 2; i11++) {
            ot0VarArr2[i10].f29178b[i11] = ot0VarArr[i10].f29178b[i11].clone();
            ot0 ot0Var2 = ot0VarArr2[i10];
            int[] iArr5 = ot0Var2.f29183j;
            ot0 ot0Var3 = ot0VarArr[i10];
            iArr5[i11] = ot0Var3.f29183j[i11];
            ot0Var2.f29182i[i11] = ot0Var3.f29182i[i11];
        }
        ot0VarArr2[i10].e.addAll(ot0VarArr[i10].e);
        return !ot0VarArr[i10].f29177a.isEmpty();
    }

    public final void Y0(String str) {
        boolean I3 = org.telegram.messenger.i0.I3(str);
        org.telegram.ui.ActionBar.k2 k2Var = this.f33240x1;
        if (I3) {
            s4.p0(k2Var, str, true, true);
        } else {
            gf.f.r(k2Var.getParentActivity(), str);
        }
    }

    public final boolean Z(int r28, org.telegram.ui.Components.ws0 r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zt0.Z(int, org.telegram.ui.Components.ws0):boolean");
    }

    public int Z0() {
        return -1;
    }

    public final void a0(int i10, tk0 tk0Var, boolean z10) {
        ArrayList arrayList = this.f33234v1[i10].e;
        int L0 = ((s4.a0) tk0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            xs0 xs0Var = null;
            if (arrayList != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    } else if (L0 <= ((xs0) arrayList.get(i11)).f32543b) {
                        xs0Var = (xs0) arrayList.get(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                if (xs0Var == null) {
                    xs0Var = (xs0) i0.a.g(1, arrayList);
                }
            }
            if (xs0Var != null) {
                H0(i10, xs0Var.d, xs0Var.f32543b + 1, z10);
            }
        }
    }

    public final void a1(ArrayList arrayList, boolean z10) {
        boolean z11;
        boolean z12;
        hs0 hs0Var = this.f33183e0;
        if (hs0Var != null && hs0Var.f32251s != null) {
            org.telegram.ui.ActionBar.k2 k2Var = this.f33240x1;
            if (z10 && arrayList.size() > k2Var.getMessagesController().O5) {
                org.telegram.messenger.z20.s(org.telegram.messenger.cd.G(k2Var.getMessagesController().O5, "StoriesPinLimit", new Object[0]), cc.a0(k2Var), 2131623981, 36);
                return;
            }
            th.x4 x4Var = hs0Var.f32251s;
            int i10 = x4Var.f49633c;
            ArrayList arrayList2 = x4Var.f49635g;
            ArrayList arrayList3 = new ArrayList(arrayList2);
            boolean z13 = true;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Integer num = (Integer) arrayList.get(size);
                num.getClass();
                if (z10 && !arrayList3.contains(num)) {
                    arrayList3.add(0, num);
                } else if (!z10 && arrayList3.contains(num)) {
                    arrayList3.remove(num);
                }
            }
            if (arrayList3.size() > org.telegram.messenger.vp.r1(i10).O5) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                if (arrayList2.size() != arrayList3.size()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList2.size()) {
                            break;
                        } else if (arrayList2.get(i11) != arrayList3.get(i11)) {
                            z12 = true;
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                if (z12) {
                    arrayList2.clear();
                    arrayList2.addAll(arrayList3);
                    x4Var.d(true);
                    TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                    tL_togglePinnedToTop.f20044id.addAll(arrayList2);
                    tL_togglePinnedToTop.peer = org.telegram.messenger.vp.r1(i10).i1(x4Var.d);
                    ConnectionsManager.getInstance(i10).sendRequest(tL_togglePinnedToTop, new ag.c3(26));
                }
                z13 = z11;
            }
            if (z13) {
                org.telegram.messenger.z20.s(org.telegram.messenger.cd.G(k2Var.getMessagesController().O5, "StoriesPinLimit", new Object[0]), cc.a0(k2Var), 2131623981, 36);
            } else if (z10) {
                cc.a0(k2Var).I(2131624053, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G(arrayList.size(), "StoriesPinned", new Object[0])), org.telegram.messenger.cd.G(arrayList.size(), "StoriesPinnedText", new Object[0])).j();
            } else {
                org.telegram.messenger.z20.s(org.telegram.messenger.cd.G(arrayList.size(), "StoriesUnpinned", new Object[0]), cc.a0(k2Var), 2131624059, 36);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.zi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20929d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.xi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.yi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21330z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.pj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.wi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21311y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21095m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21030ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21296x7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21224t7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21278w7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21065kd));
    }

    public final void b0() {
        ss0[] ss0VarArr;
        ss0 ss0Var;
        boolean z10;
        int i10;
        s4.g0 adapter;
        if (this.f33220q1) {
            int i11 = 0;
            while (true) {
                ss0VarArr = this.m0;
                if (i11 < ss0VarArr.length) {
                    ss0Var = ss0VarArr[i11];
                    if (ss0Var.E == this.f33224r1) {
                        break;
                    }
                    i11++;
                } else {
                    ss0Var = null;
                    break;
                }
            }
            if (ss0Var != null) {
                boolean x02 = x0(ss0Var.E);
                float f7 = this.f33217p1;
                float f10 = 1.0f;
                int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                ot0[] ot0VarArr = this.f33234v1;
                if (i12 == 0) {
                    this.f33220q1 = false;
                    int i13 = this.f33228s1;
                    int[] iArr = this.f33214o1;
                    iArr[x02 ? 1 : 0] = i13;
                    if (!x02) {
                        org.telegram.messenger.tz.B(i13);
                    } else if (k0(ss0Var.E) >= 5) {
                        org.telegram.messenger.tz.F(this.f33228s1);
                    }
                    for (int i14 = 0; i14 < ss0VarArr.length; i14++) {
                        ss0 ss0Var2 = ss0VarArr[i14];
                        if (ss0Var2 != null && ss0Var2.h != null && (((i10 = ss0Var2.E) == 0 || x0(i10)) && (adapter = ss0VarArr[i14].h.getAdapter()) != null)) {
                            int b10 = adapter.b();
                            if (i14 == 0) {
                                ot0VarArr[0].g(false);
                            }
                            ss0VarArr[i14].f30352n.setVisibility(8);
                            ss0VarArr[i14].f30356x.y1(iArr[x02 ? 1 : 0]);
                            ss0VarArr[i14].h.a0();
                            ss0VarArr[i14].h.invalidate();
                            if (adapter.b() == b10) {
                                org.telegram.messenger.i0.a4(ss0VarArr[i14].h);
                            } else {
                                adapter.f();
                            }
                        }
                    }
                    if (this.f33226s >= 0) {
                        for (int i15 = 0; i15 < ss0VarArr.length; i15++) {
                            ss0 ss0Var3 = ss0VarArr[i15];
                            if (ss0Var3.E == this.f33224r1) {
                                View m10 = ss0Var3.f30353r.m(this.f33226s);
                                if (m10 != null) {
                                    this.f33235w = m10.getTop();
                                }
                                ss0 ss0Var4 = ss0VarArr[i15];
                                ss0Var4.f30356x.h1(this.f33226s, (-ss0Var4.h.getPaddingTop()) + this.f33235w);
                            }
                        }
                        return;
                    }
                    e1();
                } else if (f7 == 0.0f) {
                    this.f33220q1 = false;
                    if (this.f33224r1 == 0) {
                        ot0VarArr[0].g(false);
                    }
                    ss0Var.f30352n.setVisibility(8);
                    ss0Var.h.invalidate();
                } else {
                    if (f7 > 0.2f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        f10 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f10);
                    ofFloat.addUpdateListener(new tr0(this, ss0Var, 0));
                    ofFloat.addListener(new org.telegram.ui.dj(this, z10, x02 ? 1 : 0, ss0Var));
                    ofFloat.setInterpolator(gr.f26495f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                }
            }
        }
    }

    public final boolean b1(MotionEvent motionEvent, boolean z10) {
        int i10;
        ss0 ss0Var;
        uq0 uq0Var;
        int i11;
        int i12;
        int closestTab = getClosestTab();
        ur0 ur0Var = this.K0;
        SparseIntArray sparseIntArray = ur0Var.O;
        int i13 = ur0Var.f24181n;
        int i14 = -1;
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i15 = sparseIntArray.get(i13 + i10, -1);
        zq0 zq0Var = this.f33173b0;
        if (zq0Var != null) {
            if (!F0(closestTab) && closestTab != 8) {
                if (F0(i15) || i15 == 8) {
                    i14 = zq0Var.getCurrentAlbumId();
                }
            } else {
                v71 v71Var = zq0Var.f44254b;
                SparseIntArray sparseIntArray2 = v71Var.f31163b0;
                int i16 = v71Var.F;
                if (z10) {
                    i12 = 1;
                } else {
                    i12 = -1;
                }
                i14 = sparseIntArray2.get(i16 + i12, -1);
            }
            if (i14 == 0) {
                i15 = 8;
            } else if (i14 > 0) {
                i15 = s1(i14).f32788a;
            }
        }
        if (i15 >= 0) {
            if (this.f33216p0 != null && !H()) {
                if (E0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                setSearchItemVisibility(i11);
                this.f33219q0 = 0.0f;
            } else {
                this.f33219q0 = j0(0.0f);
                H1(0.0f);
            }
            if ((!this.X0 || getSelectedTab() != 11) && (!G() || !this.E1 || (getClosestTab() != 8 && !F0(getClosestTab())))) {
                ss0[] ss0VarArr = this.m0;
                ss0 ss0Var2 = ss0VarArr[0];
                if (ss0Var2 != null && ss0Var2.E == 13 && (uq0Var = this.W) != null) {
                    org.telegram.ui.xy0 xy0Var = uq0Var.f50263n;
                    if (!z10) {
                    }
                }
                ss0 ss0Var3 = ss0VarArr[0];
                vq0 vq0Var = this.f33170a0;
                if (ss0Var3 != null && ss0Var3.E == 14 && vq0Var != null) {
                    org.telegram.ui.xy0 xy0Var2 = vq0Var.h;
                    if (!z10) {
                    }
                }
                if ((!this.E1 || (ss0Var = ss0VarArr[0]) == null || ss0Var.E != 13) && ((vq0Var == null || !vq0Var.g()) && (zq0Var == null || !zq0Var.f44256f))) {
                    D1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    u0();
                    this.A1 = false;
                    this.f33245z1 = true;
                    this.B1 = (int) motionEvent.getX();
                    setHeaderEnabled(false);
                    ur0Var.setEnabled(false);
                    ss0 ss0Var4 = ss0VarArr[1];
                    ss0Var4.E = i15;
                    ss0Var4.setVisibility(0);
                    this.f33200j1 = z10;
                    w1(true);
                    if (z10) {
                        ss0VarArr[1].setTranslationX(ss0VarArr[0].getMeasuredWidth());
                    } else {
                        ss0VarArr[1].setTranslationX(-ss0VarArr[0].getMeasuredWidth());
                    }
                    U0(getTabProgress());
                    return true;
                }
            }
        }
        return false;
    }

    public final void c0(int i10) {
        ((WindowManager) org.telegram.messenger.w0.f19025b.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i10 == 0) {
            if (!org.telegram.messenger.i0.Q1() && org.telegram.messenger.w0.f19025b.getResources().getConfiguration().orientation == 2) {
                this.C0.setTextSize(18);
            } else {
                this.C0.setTextSize(20);
            }
        }
        if (i10 == 0) {
            this.J.f();
        }
    }

    public final String d0(boolean z10) {
        int i10;
        int i11;
        TLRPC.MessageMedia messageMedia;
        uq0 uq0Var;
        if (!z0()) {
            return org.telegram.messenger.cd.L0(2131753014, null);
        }
        if (z10 && (uq0Var = this.W) != null) {
            return uq0Var.getBotPreviewsSubtitle();
        }
        hs0 hs0Var = this.f33183e0;
        if (hs0Var != null && hs0Var.f32251s != null) {
            i10 = 0;
            i11 = 0;
            for (int i12 = 0; i12 < hs0Var.f32251s.f49636i.size(); i12++) {
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) hs0Var.f32251s.f49636i.get(i12);
                TL_stories.StoryItem storyItem = jjVar.f16341l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    if (org.telegram.messenger.jj.K4(messageMedia.document)) {
                        i11++;
                    } else if (jjVar.f16341l.media.photo != null) {
                        i10++;
                    }
                }
            }
        } else {
            i10 = 0;
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return org.telegram.messenger.cd.L0(2131753014, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (i10 > 0) {
            sb2.append(org.telegram.messenger.cd.G(i10, "Images", new Object[0]));
        }
        if (i11 > 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(org.telegram.messenger.cd.G(i11, "Videos", new Object[0]));
        }
        return sb2.toString();
    }

    public final void d1(s4.g0 g0Var) {
        if (g0Var instanceof tt0) {
            ArrayList arrayList = this.G0;
            ArrayList arrayList2 = this.H0;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        } else if (g0Var == this.O) {
            ArrayList arrayList3 = this.I0;
            ArrayList arrayList4 = this.J0;
            arrayList3.addAll(arrayList4);
            arrayList4.clear();
        } else {
            gt0 gt0Var = this.P;
            if (g0Var == gt0Var) {
                gt0Var.f26521r = null;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r42, int r43, java.lang.Object... r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zt0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ur0 ur0Var = this.K0;
        if (ur0Var != null) {
            canvas.save();
            canvas.translate(ur0Var.getX(), ur0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        pr0 pr0Var = this.T0;
        if (pr0Var != null) {
            int i10 = pr0Var.U;
            if ((i10 == 3 || i10 == 1) && this.R0 == null) {
                canvas.save();
                canvas.translate(pr0Var.getX(), pr0Var.getY());
                pr0Var.setDrawOverlay(true);
                pr0Var.draw(canvas);
                pr0Var.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int i10;
        if (this.f33175b2 && (view instanceof ss0) && this.f33189f2 < this.f33182d2) {
            canvas.save();
            canvas.clipRect(0, -this.f33189f2, getWidth(), getHeight() + this.f33185e2);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        } else if (view == this.T0 && this.R0 == null) {
            canvas.save();
            ss0[] ss0VarArr = this.m0;
            float top = ss0VarArr[0].getTop();
            zq0 zq0Var = this.f33173b0;
            if (zq0Var != null && ((i10 = ss0VarArr[0].E) == 8 || F0(i10))) {
                top -= zq0Var.getVisualHeight();
            }
            canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + org.telegram.messenger.i0.L(12.0f));
            boolean drawChild2 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild2;
        } else {
            return super.drawChild(canvas, view, j10);
        }
    }

    public final ss0 e0(int i10) {
        int i11 = 0;
        while (true) {
            ss0[] ss0VarArr = this.m0;
            if (i11 < ss0VarArr.length) {
                ss0 ss0Var = ss0VarArr[i11];
                if (ss0Var != null && ss0Var.E == i10) {
                    return ss0Var;
                }
                i11++;
            } else {
                return null;
            }
        }
    }

    public final void e1() {
        int i10;
        int i11 = 0;
        while (true) {
            ss0[] ss0VarArr = this.m0;
            if (i11 < ss0VarArr.length) {
                dr0 dr0Var = ss0VarArr[i11].h;
                if (dr0Var != null) {
                    int i12 = 0;
                    int i13 = 0;
                    for (int i14 = 0; i14 < dr0Var.getChildCount(); i14++) {
                        View childAt = dr0Var.getChildAt(i14);
                        if (childAt instanceof org.telegram.ui.Cells.s7) {
                            org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) childAt;
                            int messageId = s7Var.getMessageId();
                            i13 = s7Var.getTop();
                            i12 = messageId;
                        }
                        if (childAt instanceof org.telegram.ui.Cells.l7) {
                            org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) childAt;
                            int f12 = l7Var.getMessage().f1();
                            i13 = l7Var.getTop();
                            i12 = f12;
                        }
                        if (childAt instanceof org.telegram.ui.Cells.k7) {
                            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) childAt;
                            i12 = k7Var.getMessage().f1();
                            i13 = k7Var.getTop();
                        }
                        if (i12 != 0) {
                            break;
                        }
                    }
                    if (i12 != 0) {
                        int i15 = ss0VarArr[i11].E;
                        int i16 = -1;
                        if (x0(i15)) {
                            wt0 u12 = u1(i15);
                            if (u12 != null && u12.f32251s != null) {
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= u12.f32251s.f49636i.size()) {
                                        break;
                                    } else if (i12 == ((org.telegram.messenger.jj) u12.f32251s.f49636i.get(i17)).f1()) {
                                        i16 = i17;
                                        break;
                                    } else {
                                        i17++;
                                    }
                                }
                            }
                            i10 = i16;
                        } else if (i15 >= 0) {
                            ot0[] ot0VarArr = this.f33234v1;
                            if (i15 < ot0VarArr.length) {
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= ot0VarArr[i15].f29177a.size()) {
                                        break;
                                    } else if (i12 == ((org.telegram.messenger.jj) ot0VarArr[i15].f29177a.get(i18)).f1()) {
                                        i16 = i18;
                                        break;
                                    } else {
                                        i18++;
                                    }
                                }
                                i10 = ot0VarArr[i15].f29186m + i16;
                            }
                        }
                        if (i16 >= 0) {
                            ((s4.a0) dr0Var.getLayoutManager()).h1(i10, (-ss0VarArr[i11].h.getPaddingTop()) + i13);
                            if (this.f33220q1) {
                                ss0 ss0Var = ss0VarArr[i11];
                                ss0Var.f30353r.h1(i10, (-ss0Var.h.getPaddingTop()) + i13);
                            }
                        }
                    }
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public final int f0(int i10, int i11, boolean z10) {
        int i12;
        int i13 = 1;
        if (!z10) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        int i14 = i11 + i12;
        if (i14 > 6) {
            if (!z10) {
                i14 = 9;
            } else {
                i14 = 6;
            }
        }
        return Utilities.j(i14, 9, (this.f33207m1 && i10 == 1) ? 2 : 2);
    }

    public final void f1(int i10) {
        ur0 ur0Var;
        if (!this.O1 && (ur0Var = this.K0) != null) {
            ur0Var.g(null, i10, ur0Var.P.get(i10));
        }
    }

    public final int g0(boolean z10) {
        int i10;
        int i11 = this.a2 + this.f33185e2;
        if (z10) {
            i10 = org.telegram.messenger.i0.L(52.0f);
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    public final void g1(float f7, int i10) {
        int i11;
        ur0 ur0Var = this.K0;
        if (ur0Var != null) {
            if (F0(i10)) {
                i11 = 8;
            } else {
                i11 = i10;
            }
            ur0Var.i(f7, i11);
        }
        zq0 zq0Var = this.f33173b0;
        if (zq0Var != null) {
            v71 v71Var = zq0Var.f44254b;
            if (F0(i10)) {
                v71Var.f(f7, r1(i10));
            } else if (i10 == 8) {
                v71Var.f(f7, 0);
            }
        }
    }

    public SparseArray<org.telegram.messenger.jj> getActionModeSelected() {
        return this.f33174b1[0];
    }

    public float getBottomButtonStoriesVisibility() {
        ss0 ss0Var;
        ss0 ss0Var2;
        boolean z10;
        boolean z11;
        th.x4 x4Var;
        th.x4 x4Var2;
        float f7 = 1.0f;
        ss0[] ss0VarArr = this.m0;
        if (ss0VarArr == null || (ss0Var = ss0VarArr[0]) == null || (ss0Var2 = ss0VarArr[1]) == null || ss0Var.f30355w == null || ss0Var2.f30355w == null) {
            return 1.0f;
        }
        int i10 = ss0Var.E;
        int i11 = ss0Var2.E;
        if (!F0(i10) && i10 != 8) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!F0(i11) && i11 != 8) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z10 && !z11) {
            return 1.0f;
        }
        float visibilityFactor = 1.0f - ss0VarArr[0].f30355w.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - ss0VarArr[1].f30355w.getVisibilityFactor();
        wt0 u12 = u1(ss0VarArr[0].E);
        if (i10 == 8 || (u12 != null && (x4Var2 = u12.f32251s) != null && x4Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        wt0 u13 = u1(i11);
        if (i11 != 8 && (u13 == null || (x4Var = u13.f32251s) == null || x4Var.g() <= 0)) {
            f7 = visibilityFactor2;
        }
        if (!z10) {
            visibilityFactor = f7;
        }
        if (!z11) {
            f7 = visibilityFactor;
        }
        return org.telegram.messenger.i0.T1(visibilityFactor, f7, Math.abs(ss0VarArr[0].getTranslationX() / ss0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        ss0[] ss0VarArr = this.m0;
        ss0 ss0Var = ss0VarArr[1];
        if (ss0Var != null && ss0Var.getVisibility() == 0) {
            if (this.f33197i1 && !this.f33203k1) {
                return ss0VarArr[1].E;
            }
            if (Math.abs(ss0VarArr[1].getTranslationX()) < ss0VarArr[1].getMeasuredWidth() / 2.0f) {
                return ss0VarArr[1].E;
            }
        }
        return getSelectedTab();
    }

    public tk0 getCurrentListView() {
        fs0 fs0Var;
        ss0 ss0Var = this.m0[0];
        int i10 = ss0Var.E;
        if (i10 == 13) {
            return this.W.getCurrentListView();
        }
        if (i10 == 14) {
            return this.f33170a0.getCurrentListView();
        }
        if (i10 == 12 && (fs0Var = this.V) != null) {
            return fs0Var.f43336a.f42492z0;
        }
        return ss0Var.h;
    }

    public int getInitialTab() {
        return 0;
    }

    public int getPhotosVideosTypeFilter() {
        return this.f33234v1[0].f29190q;
    }

    public TextView getSaveItem() {
        return this.f33227s0;
    }

    public org.telegram.ui.ActionBar.t0 getSearchItem() {
        return this.f33216p0;
    }

    public ei0 getSearchOptionsItem() {
        return this.f33231u0;
    }

    public int getSelectedTab() {
        int currentTabId = this.K0.getCurrentTabId();
        zq0 zq0Var = this.f33173b0;
        if (zq0Var != null && currentTabId == 8) {
            int currentAlbumId = zq0Var.getCurrentAlbumId();
            if (currentAlbumId == 0) {
                return 8;
            }
            if (currentAlbumId > 0) {
                return s1(currentAlbumId).f32788a;
            }
            return currentTabId;
        }
        return currentTabId;
    }

    public TL_stories.MediaArea getStoriesArea() {
        return null;
    }

    public String getStoriesHashtag() {
        return null;
    }

    public String getStoriesHashtagUsername() {
        return null;
    }

    @Deprecated
    public float getTabProgress() {
        float f7 = 0.0f;
        int i10 = 0;
        while (true) {
            ss0[] ss0VarArr = this.m0;
            if (i10 < ss0VarArr.length) {
                ss0 ss0Var = ss0VarArr[i10];
                if (ss0Var != null) {
                    f7 = ((1.0f - Math.abs(ss0Var.getTranslationX() / getWidth())) * ss0Var.E) + f7;
                }
                i10++;
            } else {
                return f7;
            }
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.c7> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.c7> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.C0, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21330z6));
        int i10 = org.telegram.ui.ActionBar.t6.f21332z8;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33210n0, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        org.telegram.ui.ActionBar.t0 t0Var = this.f33236w0;
        if (t0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        }
        org.telegram.ui.ActionBar.t0 t0Var2 = this.f33233v0;
        if (t0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        }
        Drawable[] drawableArr = {this.F0};
        int i11 = org.telegram.ui.ActionBar.t6.f21313y8;
        ImageView imageView = this.E0;
        arrayList.add(new org.telegram.ui.ActionBar.c7(imageView, 8, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.D0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20929d6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.K0, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.ui));
        ur0 ur0Var = this.K0;
        arrayList.add(new org.telegram.ui.ActionBar.c7(ur0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.c7(ur0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.si));
        arrayList.add(new org.telegram.ui.ActionBar.c7(ur0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.vi));
        pr0 pr0Var = this.T0;
        if (pr0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.c7(pr0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21260v7));
            arrayList.add(new org.telegram.ui.ActionBar.c7(pr0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21243u7));
            arrayList.add(new org.telegram.ui.ActionBar.c7(pr0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21312y7));
            arrayList.add(new org.telegram.ui.ActionBar.c7(pr0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.A7));
        }
        final int i12 = 0;
        while (true) {
            ss0[] ss0VarArr = this.m0;
            if (i12 < ss0VarArr.length) {
                org.telegram.ui.ActionBar.b7 b7Var = new org.telegram.ui.ActionBar.b7() {
                    @Override
                    public final void b() {
                        ss0[] ss0VarArr2 = zt0.this.m0;
                        int i13 = i12;
                        dr0 dr0Var = ss0VarArr2[i13].h;
                        if (dr0Var != null) {
                            int childCount = dr0Var.getChildCount();
                            for (int i14 = 0; i14 < childCount; i14++) {
                                View childAt = ss0VarArr2[i13].h.getChildAt(i14);
                                if (childAt instanceof org.telegram.ui.Cells.t7) {
                                    org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) childAt;
                                    for (int i15 = 0; i15 < 6; i15++) {
                                        t7Var.f23092a[i15].e.invalidate();
                                    }
                                } else if (childAt instanceof org.telegram.ui.Cells.k6) {
                                    ((org.telegram.ui.Cells.k6) childAt).A(0);
                                } else if (childAt instanceof org.telegram.ui.Cells.pa) {
                                    ((org.telegram.ui.Cells.pa) childAt).i(0);
                                }
                            }
                        }
                    }

                    @Override
                    public final void a(float f7) {
                    }
                };
                arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21206s8));
                arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21020i6));
                arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].f30355w, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20911c7));
                int i13 = org.telegram.ui.ActionBar.t6.f21002h6;
                arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i13));
                arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.t6.f21115n6));
                arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.t6.O7));
                arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.t6.P7));
                arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.t6.Q7));
                arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.t6.R7));
                arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.t6.S7));
                arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.t6.T7));
                arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.t6.U7));
                int i14 = org.telegram.ui.ActionBar.t6.f21021i7;
                arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, 8192, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i14));
                int i15 = org.telegram.ui.ActionBar.t6.f21059k7;
                arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, 16384, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, 8, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.nj));
                arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i13));
                arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, 8192, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, 16384, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, 8192, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, 16384, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, 8192, new Class[]{org.telegram.ui.Cells.t7.class}, (Paint) null, (Drawable[]) null, b7Var, i14));
                arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, 16384, new Class[]{org.telegram.ui.Cells.t7.class}, (Paint) null, (Drawable[]) null, b7Var, i15));
                arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, 0, new Class[]{org.telegram.ui.Cells.h2.class}, new String[]{"backgroundPaint"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.zi));
                arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, 8192, new Class[]{org.telegram.ui.Cells.h2.class}, (Paint) null, (Drawable[]) null, b7Var, i14));
                arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, 16384, new Class[]{org.telegram.ui.Cells.h2.class}, (Paint) null, (Drawable[]) null, b7Var, i15));
                arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].h, 0, (Class[]) null, (Paint) null, new Drawable[]{this.A0}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20892b7));
                arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].f30355w.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.c7(ss0VarArr[i12].f30355w.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21311y6));
                i12++;
            } else {
                return arrayList;
            }
        }
    }

    public int getTopPanelShift() {
        return this.f33215o2;
    }

    public final int h0(int i10) {
        int i11;
        int l02 = l0(i10) + org.telegram.messenger.i0.L(54.0f) + this.f33179c2 + this.f33182d2 + this.f33215o2;
        if (i10 == 9) {
            i11 = org.telegram.messenger.i0.L(64.0f);
        } else {
            i11 = 0;
        }
        return l02 + i11;
    }

    public final void h1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i10 = 0;
        while (true) {
            ss0[] ss0VarArr = this.m0;
            if (i10 < ss0VarArr.length) {
                ss0 ss0Var = ss0VarArr[i10];
                if (ss0Var.E != 7 || ss0Var.h.getAdapter() == null || ss0VarArr[i10].h.getAdapter().b() == 0 || this.f33240x1.getMessagesController().O1().f48910j.size() <= 0) {
                    i10++;
                } else {
                    return;
                }
            } else {
                if (this.F == 0) {
                    ks0 ks0Var = this.f33177c0;
                    ks0Var.d = chatFull;
                    ks0Var.e = arrayList;
                }
                K1(true);
                for (int i11 = 0; i11 < ss0VarArr.length; i11++) {
                    ss0 ss0Var2 = ss0VarArr[i11];
                    if (ss0Var2.E == 7 && ss0Var2.h.getAdapter() != null) {
                        org.telegram.messenger.i0.r2(ss0VarArr[i11].h);
                    }
                }
                return;
            }
        }
    }

    public final float i0(float f7) {
        float f10 = 0.0f;
        if (y0()) {
            return 0.0f;
        }
        ss0[] ss0VarArr = this.m0;
        ss0 ss0Var = ss0VarArr[1];
        if (ss0Var != null && t0(ss0Var.E)) {
            f10 = 0.0f + f7;
        }
        ss0 ss0Var2 = ss0VarArr[0];
        if (ss0Var2 != null && t0(ss0Var2.E)) {
            return (1.0f - f7) + f10;
        }
        return f10;
    }

    public final void i1(int i10, int i11, int i12, int i13) {
        ss0[] ss0VarArr;
        boolean z10;
        boolean z11 = true;
        this.f33175b2 = true;
        this.f33179c2 = i10;
        this.f33182d2 = i11;
        this.f33185e2 = i12;
        this.a2 = i13;
        F();
        vq0 vq0Var = this.f33170a0;
        if (vq0Var != null) {
            if (vq0Var.L != i11 || vq0Var.M != i12) {
                vq0Var.L = i11;
                vq0Var.M = i12;
                if (i11 == 0 && i12 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                vq0Var.setClipChildren(z10);
                vq0Var.h.setClipChildren((i11 == 0 && i12 == 0) ? false : false);
                vq0Var.n();
            }
            C1();
        }
        for (ss0 ss0Var : this.m0) {
            if (ss0Var != null) {
                ss0Var.setClipChildren(false);
                E1(ss0Var);
                setPageOverscan(ss0Var.h);
                setPageOverscan(ss0Var.f30352n);
                int paddingTop = ss0Var.h.getPaddingTop();
                dr0 dr0Var = ss0Var.h;
                int paddingLeft = dr0Var.getPaddingLeft();
                dr0 dr0Var2 = ss0Var.h;
                int h02 = h0(ss0Var.E);
                dr0Var2.f30013g3 = h02;
                int paddingRight = ss0Var.h.getPaddingRight();
                dr0 dr0Var3 = ss0Var.h;
                int g02 = g0(E0());
                dr0Var3.f30014h3 = g02;
                dr0Var.setPadding(paddingLeft, h02, paddingRight, g02);
                int paddingTop2 = paddingTop - ss0Var.h.getPaddingTop();
                if (paddingTop2 != 0) {
                    org.telegram.messenger.i0.J(ss0Var.h, new dq0(ss0Var, paddingTop2, 1));
                }
                ss0Var.f30355w.setPadding(0, i10, 0, i13);
                fs0 fs0Var = this.V;
                if (fs0Var != null && fs0Var.getParent() == ss0Var) {
                    k1(org.telegram.messenger.i0.L(56.0f) + i10, fs0Var);
                }
                uq0 uq0Var = this.W;
                if (uq0Var != null && uq0Var.getParent() == ss0Var) {
                    k1(i10, uq0Var);
                }
            }
        }
        setClipChildren(false);
        requestLayout();
        invalidate();
    }

    public final float j0(float f7) {
        float f10 = 0.0f;
        if (y0()) {
            return 0.0f;
        }
        ss0[] ss0VarArr = this.m0;
        ss0 ss0Var = ss0VarArr[1];
        if (ss0Var != null && B0(ss0Var.E) && ss0VarArr[1].E != 11) {
            f10 = 0.0f + f7;
        }
        ss0 ss0Var2 = ss0VarArr[0];
        if (ss0Var2 != null && B0(ss0Var2.E) && ss0VarArr[0].E != 11) {
            return (1.0f - f7) + f10;
        }
        return f10;
    }

    public final void j1(int i10, boolean z10) {
        this.C0.a(i10, z10);
        org.telegram.ui.ActionBar.i5 i5Var = this.H;
        if (i5Var != null) {
            i5Var.y(i10, z10);
        }
    }

    public final int k0(int i10) {
        wt0 u12;
        th.x4 x4Var;
        if (x0(i10) && (u12 = u1(i10)) != null && (x4Var = u12.f32251s) != null) {
            return x4Var.g();
        }
        return 0;
    }

    public final int l0(int i10) {
        float f7;
        zq0 zq0Var = this.f33173b0;
        if (zq0Var != null && (F0(i10) || i10 == 8)) {
            f7 = zq0Var.getVisibilityFactor() * org.telegram.messenger.i0.L(40.0f);
        } else {
            f7 = 0.0f;
        }
        return (int) f7;
    }

    public void l1(boolean z10) {
        float f7;
        if (this.E1 != z10) {
            this.E1 = z10;
            org.telegram.ui.ActionBar.i5 i5Var = this.H;
            if (i5Var != null) {
                if (z10) {
                    J1();
                    i5Var.C();
                } else {
                    i5Var.r();
                }
                P(true, true);
                return;
            }
            AnimatorSet animatorSet = this.Q1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            LinearLayout linearLayout = this.D0;
            if (z10) {
                linearLayout.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.Q1 = animatorSet2;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(linearLayout, View.ALPHA, f7));
            this.Q1.setDuration(180L);
            this.Q1.addListener(new ha0(5, this, z10));
            this.Q1.start();
            if (z10) {
                J1();
            }
        }
    }

    @Override
    public final boolean m() {
        return false;
    }

    public final void m1(int r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zt0.m1(int, boolean):void");
    }

    public final void n1(int i10) {
        int r12 = r1(getClosestTab());
        zq0 zq0Var = this.f33173b0;
        if (r12 != i10) {
            if (zq0Var != null) {
                zq0Var.f44254b.d(i10, zq0Var.d.i(i10));
                return;
            }
            return;
        }
        zq0Var.setReorderingAlbums(true);
        yt0 s12 = s1(i10);
        ss0 e02 = e0(s12.f32788a);
        if (e02 == null) {
            return;
        }
        dr0 dr0Var = e02.h;
        for (int i11 = 0; i11 < dr0Var.getChildCount(); i11++) {
            View childAt = dr0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.s7) {
                ((org.telegram.ui.Cells.s7) childAt).l(true, true);
            }
        }
        xt0 xt0Var = s12.f32790c;
        if (xt0Var != null && !xt0Var.f32254y) {
            xt0Var.f32254y = true;
        }
        D1(true);
    }

    public final float o0(int i10, boolean z10) {
        float width = getWidth();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ss0[] ss0VarArr = this.m0;
            if (i11 >= ss0VarArr.length) {
                break;
            }
            ss0 ss0Var = ss0VarArr[i11];
            if (ss0Var != null) {
                int i13 = ss0Var.E;
                if ((z10 && i10 == 8 && F0(i13)) || i13 == i10) {
                    i12++;
                    width = ss0VarArr[i11].getTranslationX();
                }
            }
            i11++;
        }
        if (i12 == 2) {
            return 0.0f;
        }
        return width;
    }

    public final void o1(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zt0.o1(boolean):void");
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i10 = 0;
        while (true) {
            ss0[] ss0VarArr = this.m0;
            if (i10 < ss0VarArr.length) {
                dr0 dr0Var = ss0VarArr[i10].h;
                if (dr0Var != null) {
                    dr0Var.getViewTreeObserver().addOnPreDrawListener(new as0(this, i10, 0));
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!R() && !this.K0.H && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i10);
        ms0 ms0Var = this.F1;
        if (ms0Var.f() != null) {
            i12 = ms0Var.f().getHeight();
        } else {
            i12 = 0;
        }
        if (i12 == 0) {
            i12 = View.MeasureSpec.getSize(i11);
        }
        setMeasuredDimension(size, i12);
        int childCount = getChildCount();
        int i15 = 0;
        while (i15 < childCount) {
            View childAt = getChildAt(i15);
            if (childAt == null || childAt.getVisibility() == 8) {
                i13 = i10;
            } else if (childAt instanceof ss0) {
                i13 = i10;
                measureChildWithMargins(childAt, i13, 0, View.MeasureSpec.makeMeasureSpec(i12, 1073741824), 0);
                dr0 dr0Var = ((ss0) childAt).h;
                dr0Var.setPadding(0, dr0Var.f30011e3, 0, dr0Var.f30012f3);
            } else {
                i13 = i10;
                i14 = i11;
                measureChildWithMargins(childAt, i13, 0, i14, 0);
                i15++;
                i10 = i13;
                i11 = i14;
            }
            i14 = i11;
            i15++;
            i10 = i13;
            i11 = i14;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        boolean z12 = false;
        if (!this.O1) {
            org.telegram.ui.ActionBar.k2 k2Var = this.f33240x1;
            if (k2Var.getParentLayout() != null && !((ActionBarLayout) k2Var.getParentLayout()).i() && !R() && !this.f33169a) {
                if (motionEvent != null) {
                    if (this.D1 == null) {
                        this.D1 = VelocityTracker.obtain();
                    }
                    this.D1.addMovement(motionEvent);
                    q30 q30Var = this.G1;
                    if (q30Var != null) {
                        q30Var.b(true);
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.f33245z1 && !this.A1) {
                    if (motionEvent.getY() >= org.telegram.messenger.i0.L(90.0f) + this.f33179c2) {
                        this.f33243y1 = motionEvent.getPointerId(0);
                        this.A1 = true;
                        this.B1 = (int) motionEvent.getX();
                        this.C1 = (int) motionEvent.getY();
                        this.D1.clear();
                        return this.f33245z1;
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f33243y1) {
                    int x10 = (int) (motionEvent.getX() - this.B1);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.C1);
                    boolean z13 = this.f33245z1;
                    ss0[] ss0VarArr = this.m0;
                    if (z13 && (((z10 = this.f33200j1) && x10 > 0) || (!z10 && x10 < 0))) {
                        if (x10 < 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!b1(motionEvent, z11)) {
                            this.A1 = true;
                            this.f33245z1 = false;
                            ss0VarArr[0].setTranslationX(0.0f);
                            ss0 ss0Var = ss0VarArr[1];
                            if (this.f33200j1) {
                                i11 = ss0VarArr[0].getMeasuredWidth();
                            } else {
                                i11 = -ss0VarArr[0].getMeasuredWidth();
                            }
                            ss0Var.setTranslationX(i11);
                            g1(0.0f, ss0VarArr[1].E);
                            U0(getTabProgress());
                        }
                    }
                    if (this.A1 && !this.f33245z1) {
                        if (Math.abs(x10) >= org.telegram.messenger.i0.a1(true, 0.3f) && Math.abs(x10) > abs) {
                            if (x10 < 0) {
                                z12 = true;
                            }
                            b1(motionEvent, z12);
                        }
                    } else if (this.f33245z1) {
                        ss0VarArr[0].setTranslationX(x10);
                        if (this.f33200j1) {
                            ss0VarArr[1].setTranslationX(ss0VarArr[0].getMeasuredWidth() + x10);
                        } else {
                            ss0VarArr[1].setTranslationX(x10 - ss0VarArr[0].getMeasuredWidth());
                        }
                        float abs2 = Math.abs(x10) / ss0VarArr[0].getMeasuredWidth();
                        if (!H()) {
                            this.f33219q0 = 0.0f;
                        } else {
                            this.f33219q0 = j0(abs2);
                            H1(abs2);
                            float i02 = i0(abs2);
                            this.f33223r0 = i02;
                            if (i02 != 0.0f && H() && !y0()) {
                                i10 = 0;
                            } else {
                                i10 = 4;
                            }
                            this.f33229t0.setVisibility(i10);
                        }
                        D1(false);
                        g1(abs2, ss0VarArr[1].E);
                        U0(getTabProgress());
                        T0();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f33243y1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    q1(motionEvent);
                }
                return this.f33245z1;
            }
        }
        return false;
    }

    public final float p0(int i10, boolean z10) {
        float f7 = 0.0f;
        int i11 = 0;
        while (true) {
            ss0[] ss0VarArr = this.m0;
            if (i11 < ss0VarArr.length) {
                ss0 ss0Var = ss0VarArr[i11];
                if (ss0Var != null) {
                    int i12 = ss0Var.E;
                    if ((z10 && i10 == 8 && F0(i12)) || i12 == i10) {
                        f7 = (1.0f - Math.abs(ss0VarArr[i11].getTranslationX() / getWidth())) + f7;
                    }
                }
                i11++;
            } else {
                return f7;
            }
        }
    }

    public final void p1() {
        int i10 = 0;
        while (true) {
            ss0[] ss0VarArr = this.m0;
            if (i10 < ss0VarArr.length) {
                int childCount = ss0VarArr[i10].h.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = ss0VarArr[i10].h.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.h2) {
                        ImageReceiver photoImage = ((org.telegram.ui.Cells.h2) childAt).getPhotoImage();
                        if (i10 == 0) {
                            photoImage.f14408t0 = true;
                            photoImage.P0(false);
                        } else {
                            photoImage.f14408t0 = false;
                            photoImage.Q0();
                        }
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final int q0(int i10) {
        org.telegram.ui.ActionBar.p6 p6Var = this.H1;
        if (p6Var != null) {
            return p6Var.h(i10);
        }
        return org.telegram.ui.ActionBar.t6.x0(null, i10, false);
    }

    public final void q1(MotionEvent motionEvent) {
        float f7;
        float f10;
        boolean z10;
        float measuredWidth;
        ss0 ss0Var;
        ss0 ss0Var2;
        int measuredWidth2;
        ss0 ss0Var3;
        ss0 ss0Var4;
        boolean z11;
        VelocityTracker velocityTracker = this.D1;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.U0);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f7 = this.D1.getXVelocity();
                f10 = this.D1.getYVelocity();
                if (!this.f33245z1 && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
                    if (f7 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    b1(motionEvent, z11);
                }
            } else {
                f7 = 0.0f;
                f10 = 0.0f;
            }
            if (this.f33245z1) {
                ss0[] ss0VarArr = this.m0;
                float x10 = ss0VarArr[0].getX();
                this.f33194h1 = new AnimatorSet();
                if (Math.abs(x10) < ss0VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f33203k1 = z10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r60(this, 19));
                boolean z12 = this.f33203k1;
                Property property = View.TRANSLATION_X;
                if (z12) {
                    measuredWidth = Math.abs(x10);
                    if (this.f33200j1) {
                        this.f33194h1.playTogether(ObjectAnimator.ofFloat(ss0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(ss0VarArr[1], property, ss0Var4.getMeasuredWidth()), ofFloat);
                    } else {
                        this.f33194h1.playTogether(ObjectAnimator.ofFloat(ss0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(ss0VarArr[1], property, -ss0Var3.getMeasuredWidth()), ofFloat);
                    }
                } else {
                    measuredWidth = ss0VarArr[0].getMeasuredWidth() - Math.abs(x10);
                    if (this.f33200j1) {
                        this.f33194h1.playTogether(ObjectAnimator.ofFloat(ss0VarArr[0], property, -ss0Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(ss0VarArr[1], property, 0.0f), ofFloat);
                    } else {
                        this.f33194h1.playTogether(ObjectAnimator.ofFloat(ss0VarArr[0], property, ss0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(ss0VarArr[1], property, 0.0f), ofFloat);
                    }
                }
                this.f33194h1.setInterpolator(f33166t2);
                int measuredWidth3 = getMeasuredWidth();
                float f11 = measuredWidth3 / 2;
                float I = (org.telegram.messenger.i0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f11) + f11;
                float abs = Math.abs(f7);
                if (abs > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(I / abs) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                this.f33194h1.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                this.f33194h1.addListener(new xr0(this, 1));
                this.f33194h1.start();
                this.f33197i1 = true;
                this.f33245z1 = false;
                T0();
            } else {
                this.A1 = false;
                setHeaderEnabled(true);
                this.K0.setEnabled(true);
            }
            VelocityTracker velocityTracker2 = this.D1;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.D1 = null;
            }
        }
    }

    public final boolean r0() {
        if (this.f33240x1.getConnectionsManager().getConnectionState() == 3) {
            return true;
        }
        return false;
    }

    public final int r1(int i10) {
        yt0 t12 = t1(i10);
        if (t12 == null) {
            return -1;
        }
        return t12.f32789b;
    }

    public final boolean s0() {
        SparseArray[] sparseArrayArr;
        org.telegram.messenger.jj jjVar;
        TLRPC.Message message;
        boolean z10 = false;
        for (int i10 = 1; i10 >= 0; i10--) {
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            while (true) {
                sparseArrayArr = this.f33174b1;
                if (i11 >= sparseArrayArr[i10].size()) {
                    break;
                }
                arrayList.add(Integer.valueOf(sparseArrayArr[i10].keyAt(i11)));
                i11++;
            }
            int size = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    break;
                }
                Object obj = arrayList.get(i12);
                i12++;
                Integer num = (Integer) obj;
                if (num.intValue() > 0 && (jjVar = (org.telegram.messenger.jj) sparseArrayArr[i10].get(num.intValue())) != null && (message = jjVar.f16337k) != null && message.noforwards) {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                return z10;
            }
        }
        return z10;
    }

    public final yt0 s1(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = this.f33206l2;
        yt0 yt0Var = (yt0) hashMap.get(valueOf);
        if (yt0Var == null) {
            yt0 yt0Var2 = new yt0(this, getContext(), i10);
            hashMap.put(Integer.valueOf(i10), yt0Var2);
            this.f33208m2.put(Integer.valueOf(yt0Var2.f32788a), Integer.valueOf(i10));
            return yt0Var2;
        }
        return yt0Var;
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        boolean z10;
        int i10;
        TLRPC.ChatFull chatFull2 = this.f33188f1;
        if (chatFull2 != null && chatFull2.stories_pinned_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f33188f1 = chatFull;
        if (chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.f33184e1 == 0) {
                this.f33184e1 = -j10;
                int i11 = 0;
                while (true) {
                    ot0[] ot0VarArr = this.f33234v1;
                    if (i11 >= ot0VarArr.length) {
                        break;
                    }
                    if (ot0VarArr[i11].f29178b[1].size() == 0) {
                        ot0 ot0Var = ot0VarArr[i11];
                        ot0Var.f29183j[1] = this.f33188f1.migrated_from_max_id;
                        ot0Var.f29182i[1] = false;
                    }
                    i11++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.f33188f1;
        if (chatFull3 != null && z10 != chatFull3.stories_pinned_available) {
            ur0 ur0Var = this.K0;
            if (ur0Var != null) {
                if (y0()) {
                    i10 = 9;
                } else {
                    i10 = 8;
                }
                ur0Var.setInitialTabId(i10);
            }
            K1(true);
            w1(false);
        }
    }

    public void setCommonGroupsCount(int i10) {
        if (this.F == 0) {
            this.Z0[6] = i10;
        }
        K1(true);
        M();
    }

    public void setForwardRestrictedHint(q30 q30Var) {
        this.G1 = q30Var;
    }

    public void setMergeDialogId(long j10) {
        this.f33184e1 = j10;
    }

    public void setNewMediaCounts(int[] iArr) {
        int[] iArr2;
        int i10 = 0;
        while (true) {
            iArr2 = this.Z0;
            if (i10 > 6 || iArr2[i10] >= 0) {
                break;
            }
            i10++;
        }
        System.arraycopy(iArr, 0, iArr2, 0, 6);
        K1(true);
        M();
        if (iArr2[0] >= 0) {
            I0(false);
        }
    }

    public void setOnTopPanelShiftChanged(Runnable runnable) {
        this.f33201j2 = runnable;
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.N1 = i11;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            ss0[] ss0VarArr = this.m0;
            if (i15 >= ss0VarArr.length) {
                break;
            }
            ss0VarArr[i15].setTranslationY(this.N1);
            i15++;
        }
        if (this.R0 != null) {
            S();
        } else {
            pr0 pr0Var = this.T0;
            if (pr0Var != null) {
                pr0Var.setTranslationY(org.telegram.messenger.i0.L(48.0f) + i11);
            }
        }
        this.Q0 = i11;
        org.telegram.ui.Cells.s0 s0Var = this.M0;
        if (s0Var.getTag() == null) {
            i14 = -org.telegram.messenger.i0.L(48.0f);
        }
        s0Var.setTranslationY(i14 + this.Q0);
    }

    public void setPagesGlassEngine(ei.r rVar) {
        ss0[] ss0VarArr;
        this.f33192g2 = rVar;
        vq0 vq0Var = this.f33170a0;
        if (vq0Var != null) {
            vq0Var.setGlassEngine(rVar);
        }
        for (ss0 ss0Var : this.m0) {
            if (ss0Var != null) {
                ss0Var.h.setCaptureSectionsDecoratorAllowed(true);
                rVar.b(ss0Var.h);
            }
        }
    }

    public void setPagesPaddingBottom(int i10) {
        if (this.a2 != i10) {
            this.a2 = i10;
            ss0[] ss0VarArr = this.m0;
            if (ss0VarArr != null) {
                for (ss0 ss0Var : ss0VarArr) {
                    if (ss0Var != null) {
                        dr0 dr0Var = ss0Var.h;
                        int paddingLeft = dr0Var.getPaddingLeft();
                        dr0 dr0Var2 = ss0Var.h;
                        int i11 = dr0Var2.f30011e3;
                        int paddingRight = dr0Var2.getPaddingRight();
                        dr0 dr0Var3 = ss0Var.h;
                        int g02 = g0(E0());
                        dr0Var3.f30014h3 = g02;
                        dr0Var.setPadding(paddingLeft, i11, paddingRight, g02);
                    }
                }
            }
        }
    }

    public void setPagesVisibleOverscanTop(int i10) {
        if (this.f33189f2 != i10) {
            this.f33189f2 = i10;
            invalidate();
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
        }
    }

    public void setPinnedToTop(boolean z10) {
        if (this.d != z10) {
            this.d = z10;
            int i10 = 0;
            while (true) {
                ss0[] ss0VarArr = this.m0;
                if (i10 < ss0VarArr.length) {
                    A1(ss0VarArr[i10], true);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        boolean z10;
        TLRPC.UserFull userFull2 = this.f33191g1;
        if (userFull2 != null && userFull2.stories_pinned_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f33191g1 = userFull;
        K1(true);
        if (userFull != null && z10 != userFull.stories_pinned_available) {
            f1(8);
        }
    }

    public void setVisibleHeight(int i10) {
        float f7;
        this.P1 = i10;
        int i11 = 0;
        while (true) {
            ss0[] ss0VarArr = this.m0;
            if (i11 >= ss0VarArr.length) {
                break;
            }
            int measuredHeight = getMeasuredHeight();
            if (ss0VarArr[i11].E == 8) {
                f7 = 280.0f;
            } else {
                f7 = 120.0f;
            }
            float f10 = (-(measuredHeight - Math.max(i10, org.telegram.messenger.i0.L(f7)))) / 2.0f;
            ss0VarArr[i11].f30355w.setTranslationY(f10);
            ss0VarArr[i11].f30354s.setTranslationY(-f10);
            i11++;
        }
        uq0 uq0Var = this.W;
        if (uq0Var != null) {
            uq0Var.setVisibleHeight(i10);
        }
        vq0 vq0Var = this.f33170a0;
        if (vq0Var != null) {
            vq0Var.setVisibleHeight(i10);
        }
    }

    public final boolean t0(int i10) {
        if (i10 != 0) {
            if (((i10 != 8 && !F0(i10)) || !TextUtils.isEmpty(getStoriesHashtag())) && i10 != 9 && i10 != 11 && i10 != 13) {
                if (i10 != 14 || this.f33170a0 == null) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final yt0 t1(int i10) {
        Integer num = (Integer) this.f33208m2.get(Integer.valueOf(i10));
        if (num == null) {
            return null;
        }
        return (yt0) this.f33206l2.get(num);
    }

    @Override
    public final void u(org.telegram.ui.Cells.v2 v2Var) {
        int i10;
        org.telegram.ui.ActionBar.k2 k2Var = this.f33240x1;
        if (k2Var != null && k2Var.getMessagesController().O1().K(v2Var.getDialogId())) {
            k2Var.getOrCreateStoryViewer().getClass();
            th.o7 orCreateStoryViewer = k2Var.getOrCreateStoryViewer();
            Context context = k2Var.getContext();
            long dialogId = v2Var.getDialogId();
            th.n5 a2 = th.n5.a((tk0) v2Var.getParent());
            if ((k2Var instanceof ProfileActivity) && ((ProfileActivity) k2Var).f33892r1) {
                i10 = org.telegram.messenger.i0.L(68.0f);
            } else {
                i10 = 0;
            }
            a2.f49265s += i10;
            orCreateStoryViewer.R(context, dialogId, a2);
        }
    }

    public final void u0() {
        org.telegram.messenger.i0.r(this.O0);
        org.telegram.ui.Cells.s0 s0Var = this.M0;
        if (s0Var.getTag() == null) {
            return;
        }
        s0Var.setTag(null);
        AnimatorSet animatorSet = this.N0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.N0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.N0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.N0.playTogether(ObjectAnimator.ofFloat(s0Var, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(s0Var, View.TRANSLATION_Y, (-org.telegram.messenger.i0.L(48.0f)) + this.Q0));
        this.N0.setInterpolator(gr.f26496g);
        this.N0.addListener(new xr0(this, 0));
        this.N0.start();
    }

    public final wt0 u1(int i10) {
        yt0 t12;
        if (i10 == 8) {
            return this.f33183e0;
        }
        if (i10 == 9) {
            return this.f33190g0;
        }
        if (F0(i10) && (t12 = t1(i10)) != null) {
            return t12.f32790c;
        }
        return null;
    }

    @Override
    public final void updateColors() {
        ss0[] ss0VarArr;
        try {
            this.I1.a(q0(org.telegram.ui.ActionBar.t6.f20929d6));
            org.telegram.ui.ActionBar.c2 c2Var = this.F0;
            if (c2Var != null) {
                c2Var.a(q0(org.telegram.ui.ActionBar.t6.f21313y8));
            }
            NumberTextView numberTextView = this.C0;
            if (numberTextView != null) {
                numberTextView.setTextColor(q0(org.telegram.ui.ActionBar.t6.f21313y8));
            }
            y1();
            invalidate();
            for (ss0 ss0Var : this.m0) {
                if (ss0Var != null && ss0Var.L) {
                    ss0Var.invalidate();
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public boolean v0() {
        return false;
    }

    public final wt0 v1(int i10) {
        yt0 t12;
        if (i10 == 8) {
            return this.f33187f0;
        }
        if (i10 == 9) {
            return this.f33193h0;
        }
        if (!F0(i10) || (t12 = t1(i10)) == null) {
            return null;
        }
        return t12.d;
    }

    public boolean w0() {
        return !(this instanceof g30);
    }

    public final void w1(boolean z10) {
        ss0[] ss0VarArr;
        ss0[] ss0VarArr2;
        org.telegram.ui.ActionBar.t0 t0Var;
        s4.u0 u0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        s4.u0 u0Var2;
        int i10;
        int i11;
        boolean z14;
        boolean z15;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z16;
        s4.u0 u0Var3;
        int i17;
        int i18;
        boolean z17;
        int i19;
        boolean z18;
        int i20;
        boolean z19;
        boolean z20;
        int i21;
        s4.u0 u0Var4;
        vq0 vq0Var = this.f33170a0;
        if (vq0Var != null) {
            vq0Var.i();
        }
        int i22 = 0;
        while (true) {
            ss0VarArr = this.m0;
            if (i22 >= ss0VarArr.length) {
                break;
            }
            ss0VarArr[i22].h.C0();
            i22++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ss0VarArr[z10 ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = org.telegram.messenger.i0.L(K0());
        layoutParams.rightMargin = 0;
        layoutParams.leftMargin = 0;
        s4.g0 adapter = ss0VarArr[z10 ? 1 : 0].h.getAdapter();
        s4.g0 g0Var = this.f33183e0;
        s4.x xVar = this.f33180d0;
        if (adapter == g0Var) {
            xVar.h(null);
        }
        boolean z21 = this.X0;
        org.telegram.ui.ActionBar.i5 i5Var = this.H;
        ms0 ms0Var = this.F1;
        org.telegram.ui.ActionBar.l lVar = this.G;
        String str = "";
        org.telegram.ui.ActionBar.t0 t0Var2 = this.f33216p0;
        gt0 gt0Var = this.P;
        int i23 = 100;
        if (z21 && this.W0) {
            ss0 ss0Var = ss0VarArr[z10 ? 1 : 0];
            if (ss0Var.f30351f == null) {
                ss0Var.f30351f = new s4.u0();
            }
            ss0 ss0Var2 = ss0VarArr[z10 ? 1 : 0];
            s4.u0 u0Var5 = ss0Var2.f30351f;
            lt0 lt0Var = this.U;
            qs0 qs0Var = this.f33205l0;
            us0 us0Var = this.f33199j0;
            us0 us0Var2 = this.f33202k0;
            us0 us0Var3 = this.f33196i0;
            if (z10) {
                int i24 = ss0Var2.E;
                if (i24 != 0) {
                    u0Var4 = u0Var5;
                    if (i24 != 2 && i24 != 5 && i24 != 6 && (i24 != 7 || ms0Var.X())) {
                        if (t0Var2 != null) {
                            str = t0Var2.getSearchField().getText().toString();
                        }
                        String str2 = str;
                        int i25 = ss0VarArr[z10 ? 1 : 0].E;
                        if (i25 == 1) {
                            if (us0Var3 != null) {
                                us0Var3.G(str2, false);
                                if (adapter != us0Var3) {
                                    d1(adapter);
                                    ss0VarArr[z10 ? 1 : 0].h.setAdapter(us0Var3);
                                }
                            }
                        } else if (i25 == 3) {
                            if (us0Var2 != null) {
                                us0Var2.G(str2, false);
                                if (adapter != us0Var2) {
                                    d1(adapter);
                                    ss0VarArr[z10 ? 1 : 0].h.setAdapter(us0Var2);
                                }
                            }
                        } else if (i25 == 4) {
                            if (us0Var != null) {
                                us0Var.G(str2, false);
                                if (adapter != us0Var) {
                                    d1(adapter);
                                    ss0VarArr[z10 ? 1 : 0].h.setAdapter(us0Var);
                                }
                            }
                        } else if (i25 == 7) {
                            if (qs0Var != null) {
                                qs0Var.F(str2, false);
                                if (adapter != qs0Var) {
                                    d1(adapter);
                                    ss0VarArr[z10 ? 1 : 0].h.setAdapter(qs0Var);
                                }
                            }
                        } else if (i25 == 11) {
                            if (lt0Var != null) {
                                lt0Var.E(str2, this.Y0);
                                if (adapter != lt0Var) {
                                    d1(adapter);
                                    ss0VarArr[z10 ? 1 : 0].h.setAdapter(lt0Var);
                                }
                            }
                        } else if (i25 == 15 && gt0Var != null && adapter != gt0Var) {
                            d1(adapter);
                            dr0 dr0Var = ss0VarArr[z10 ? 1 : 0].h;
                            gt0Var.f26521r = dr0Var;
                            dr0Var.setAdapter(gt0Var);
                        }
                    }
                }
                this.X0 = false;
                rr0 rr0Var = this.L0;
                if (rr0Var != null) {
                    rr0Var.g(false);
                }
                this.W0 = false;
                w1(true);
                return;
            }
            u0Var4 = u0Var5;
            if (ss0Var2.h != null) {
                int i26 = ss0Var2.E;
                if (i26 == 1) {
                    if (adapter != us0Var3) {
                        d1(adapter);
                        ss0VarArr[z10 ? 1 : 0].h.setAdapter(us0Var3);
                    }
                    us0Var3.f();
                } else if (i26 == 3) {
                    if (adapter != us0Var2) {
                        d1(adapter);
                        ss0VarArr[z10 ? 1 : 0].h.setAdapter(us0Var2);
                    }
                    us0Var2.f();
                } else if (i26 == 4) {
                    if (adapter != us0Var) {
                        d1(adapter);
                        ss0VarArr[z10 ? 1 : 0].h.setAdapter(us0Var);
                    }
                    us0Var.f();
                } else if (i26 == 7) {
                    if (adapter != qs0Var) {
                        d1(adapter);
                        ss0VarArr[z10 ? 1 : 0].h.setAdapter(qs0Var);
                    }
                    qs0Var.f();
                } else if (i26 == 11) {
                    if (adapter != lt0Var) {
                        d1(adapter);
                        ss0VarArr[z10 ? 1 : 0].h.setAdapter(lt0Var);
                    }
                    lt0Var.f();
                }
            }
            ss0VarArr2 = ss0VarArr;
            t0Var = t0Var2;
            u0Var3 = u0Var4;
            i12 = 4;
            z13 = false;
            z16 = false;
            i14 = 8;
        } else {
            ss0 ss0Var3 = ss0VarArr[z10 ? 1 : 0];
            if (ss0Var3.e == null) {
                ss0Var3.e = new s4.u0();
            }
            ss0 ss0Var4 = ss0VarArr[z10 ? 1 : 0];
            s4.u0 u0Var6 = ss0Var4.e;
            ss0Var4.h.setPinnedHeaderShadowDrawable(null);
            int i27 = ss0VarArr[z10 ? 1 : 0].E;
            if (i27 == 8 || F0(i27)) {
                layoutParams.topMargin = org.telegram.messenger.i0.L(K0());
            }
            dr0 dr0Var2 = ss0VarArr[z10 ? 1 : 0].h;
            int paddingLeft = dr0Var2.getPaddingLeft();
            ss0 ss0Var5 = ss0VarArr[z10 ? 1 : 0];
            ss0VarArr2 = ss0VarArr;
            dr0 dr0Var3 = ss0Var5.h;
            int h02 = h0(ss0Var5.E);
            dr0Var3.f30013g3 = h02;
            int paddingRight = ss0VarArr2[z10 ? 1 : 0].h.getPaddingRight();
            dr0 dr0Var4 = ss0VarArr2[z10 ? 1 : 0].h;
            t0Var = t0Var2;
            int g02 = g0(E0());
            dr0Var4.f30014h3 = g02;
            dr0Var2.setPadding(paddingLeft, h02, paddingRight, g02);
            int i28 = ss0VarArr2[z10 ? 1 : 0].E;
            int[] iArr = this.f33214o1;
            s4.g0 g0Var2 = this.M;
            View view = this.W;
            it0 it0Var = this.T;
            ls0 ls0Var = this.R;
            fs0 fs0Var = this.V;
            ot0[] ot0VarArr = this.f33234v1;
            if (i28 == 0) {
                s4.g0 g0Var3 = this.J;
                if (adapter != g0Var3) {
                    d1(adapter);
                    ss0VarArr2[z10 ? 1 : 0].h.setAdapter(g0Var3);
                }
                int i29 = -org.telegram.messenger.i0.L(1.0f);
                layoutParams.rightMargin = i29;
                layoutParams.leftMargin = i29;
                ot0 ot0Var = ot0VarArr[0];
                if (ot0Var.h && !ot0Var.e.isEmpty()) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                i23 = iArr[0];
                ss0VarArr2[z10 ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.A0);
                ot0 ot0Var2 = ot0VarArr[0];
                if (ot0Var2.f29196x == null) {
                    ot0Var2.f29196x = new s4.u0();
                }
                u0Var = ot0VarArr[0].f29196x;
                z13 = z19;
                z11 = false;
            } else {
                if (i28 == 1) {
                    ot0 ot0Var3 = ot0VarArr[1];
                    if (ot0Var3.h && !ot0Var3.e.isEmpty()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (adapter != g0Var2) {
                        d1(adapter);
                        ss0VarArr2[z10 ? 1 : 0].h.setAdapter(g0Var2);
                    }
                } else if (i28 == 2) {
                    ot0 ot0Var4 = ot0VarArr[2];
                    if (ot0Var4.h && !ot0Var4.e.isEmpty()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    s4.g0 g0Var4 = this.N;
                    if (adapter != g0Var4) {
                        d1(adapter);
                        ss0VarArr2[z10 ? 1 : 0].h.setAdapter(g0Var4);
                    }
                } else {
                    if (i28 == 3) {
                        s4.g0 g0Var5 = this.L;
                        if (adapter != g0Var5) {
                            d1(adapter);
                            ss0VarArr2[z10 ? 1 : 0].h.setAdapter(g0Var5);
                        }
                    } else if (i28 == 4) {
                        ot0 ot0Var5 = ot0VarArr[4];
                        if (ot0Var5.h && !ot0Var5.e.isEmpty()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        s4.g0 g0Var6 = this.O;
                        if (adapter != g0Var6) {
                            d1(adapter);
                            ss0VarArr2[z10 ? 1 : 0].h.setAdapter(g0Var6);
                        }
                    } else {
                        if (i28 == 5) {
                            s4.g0 g0Var7 = this.Q;
                            if (adapter != g0Var7) {
                                d1(adapter);
                                ss0VarArr2[z10 ? 1 : 0].h.setAdapter(g0Var7);
                            }
                        } else if (i28 == 15) {
                            if (adapter != gt0Var) {
                                d1(adapter);
                                dr0 dr0Var5 = ss0VarArr2[z10 ? 1 : 0].h;
                                gt0Var.f26521r = dr0Var5;
                                dr0Var5.setAdapter(gt0Var);
                            }
                        } else if (i28 == 6) {
                            if (adapter != ls0Var) {
                                d1(adapter);
                                ss0VarArr2[z10 ? 1 : 0].h.setAdapter(ls0Var);
                            }
                        } else if (i28 == 7) {
                            s4.g0 g0Var8 = this.f33177c0;
                            if (adapter != g0Var8) {
                                d1(adapter);
                                ss0VarArr2[z10 ? 1 : 0].h.setAdapter(g0Var8);
                            }
                        } else if (x0(i28)) {
                            s4.g0 u12 = u1(ss0VarArr2[z10 ? 1 : 0].E);
                            if (adapter != u12) {
                                d1(adapter);
                                ss0VarArr2[z10 ? 1 : 0].h.setAdapter(u12);
                                ss0VarArr2[z10 ? 1 : 0].h.getClass();
                            }
                            ss0 ss0Var6 = ss0VarArr2[z10 ? 1 : 0];
                            if (ss0Var6.E != 9) {
                                xVar.h(ss0Var6.h);
                            }
                            i23 = iArr[1];
                        } else {
                            int i30 = ss0VarArr2[z10 ? 1 : 0].E;
                            if (i30 == 10) {
                                s4.g0 g0Var9 = this.S;
                                if (adapter != g0Var9) {
                                    d1(adapter);
                                    ss0VarArr2[z10 ? 1 : 0].h.setAdapter(g0Var9);
                                }
                            } else if (i30 == 11) {
                                if (adapter != it0Var) {
                                    d1(adapter);
                                    ss0VarArr2[z10 ? 1 : 0].h.setAdapter(it0Var);
                                    s4.x xVar2 = it0Var.f27082w;
                                    dr0 dr0Var6 = ss0VarArr2[z10 ? 1 : 0].h;
                                    it0Var.f27081s = dr0Var6;
                                    xVar2.h(dr0Var6);
                                }
                                u0Var = it0Var.f27080r;
                                z11 = true;
                                z13 = false;
                            } else if (i30 == 12) {
                                if (adapter != null) {
                                    d1(adapter);
                                    ss0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (fs0Var.getParent() != ss0VarArr2[z10 ? 1 : 0]) {
                                    org.telegram.messenger.i0.E2(fs0Var);
                                    ss0VarArr2[z10 ? 1 : 0].addView(fs0Var, w7.b6.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
                                    k1(org.telegram.messenger.i0.L(56.0f) + this.f33179c2, fs0Var);
                                }
                            } else if (i30 == 13) {
                                if (adapter != null) {
                                    d1(adapter);
                                    ss0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != ss0VarArr2[z10 ? 1 : 0]) {
                                    org.telegram.messenger.i0.E2(view);
                                    ss0VarArr2[z10 ? 1 : 0].addView(view);
                                    k1(this.f33179c2, view);
                                }
                            } else if (i30 == 14) {
                                if (adapter != null) {
                                    d1(adapter);
                                    ss0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (vq0Var != null && vq0Var.getParent() != ss0VarArr2[z10 ? 1 : 0]) {
                                    org.telegram.messenger.i0.E2(vq0Var);
                                    ss0VarArr2[z10 ? 1 : 0].addView(vq0Var);
                                    ss0VarArr2[z10 ? 1 : 0].f30355w.setVisibility(4);
                                }
                            }
                        }
                        u0Var = u0Var6;
                        z11 = false;
                        z13 = false;
                    }
                    u0Var = u0Var6;
                    z11 = true;
                    z13 = false;
                }
                z13 = z12;
                u0Var = u0Var6;
                z11 = true;
            }
            F1(ss0VarArr2[z10 ? 1 : 0]);
            if (z11) {
                ss0VarArr2[z10 ? 1 : 0].h.setSections(false);
                u0Var2 = u0Var;
            } else {
                dr0 dr0Var7 = ss0VarArr2[z10 ? 1 : 0].h;
                dr0Var7.getClass();
                u0Var2 = u0Var;
                org.telegram.ui.ActionBar.a7.m(dr0Var7, 20, org.telegram.ui.ActionBar.t6.f21020i6, dr0Var7.f30625n2);
                dr0Var7.T2 = false;
                dr0Var7.H2 = null;
                dr0Var7.I2 = null;
                dr0Var7.L2 = 0.0f;
                dr0Var7.M2 = null;
                dr0Var7.N2 = null;
                dr0Var7.J2 = null;
                ek0 ek0Var = dr0Var7.G2;
                if (ek0Var != null) {
                    dr0Var7.q0(ek0Var);
                    dr0Var7.G2 = null;
                }
                l9 l9Var = dr0Var7.R2;
                if (l9Var != null) {
                    dr0Var7.q0(l9Var);
                    dr0Var7.R2 = null;
                }
            }
            E1(ss0VarArr2[z10 ? 1 : 0]);
            ss0 ss0Var7 = ss0VarArr2[z10 ? 1 : 0];
            if (ss0Var7.E == 11) {
                ss0Var7.h.setItemAnimator(ss0Var7.d);
            } else {
                ss0Var7.h.setItemAnimator(null);
                if (it0Var != null && ss0VarArr2[z10 ? 1 : 0].h == it0Var.f27081s) {
                    s4.x xVar3 = it0Var.f27082w;
                    it0Var.f27081s = null;
                    xVar3.h(null);
                }
            }
            if (fs0Var != null && ss0VarArr2[z10 ? 1 : 0].E != 12 && fs0Var.getParent() == ss0VarArr2[z10 ? 1 : 0]) {
                fs0Var.f43336a.onRemoveFromParent();
                ss0VarArr2[z10 ? 1 : 0].removeView(fs0Var);
            }
            if (view != null && ss0VarArr2[z10 ? 1 : 0].E != 13) {
                ViewParent parent = view.getParent();
                ss0 ss0Var8 = ss0VarArr2[z10 ? 1 : 0];
                if (parent == ss0Var8) {
                    ss0Var8.removeView(view);
                }
            }
            if (vq0Var != null && ss0VarArr2[z10 ? 1 : 0].E != 14) {
                ViewParent parent2 = vq0Var.getParent();
                ss0 ss0Var9 = ss0VarArr2[z10 ? 1 : 0];
                if (parent2 == ss0Var9) {
                    ss0Var9.removeView(vq0Var);
                }
            }
            int i31 = ss0VarArr2[z10 ? 1 : 0].E;
            if (i31 != 0 && i31 != 11 && !x0(i31) && (i17 = ss0VarArr2[z10 ? 1 : 0].E) != 2 && i17 != 5 && i17 != 6 && ((i17 != 7 || ms0Var.X()) && (i18 = ss0VarArr2[z10 ? 1 : 0].E) != 10 && i18 != 13 && i18 != 14)) {
                if (z10) {
                    if (t0Var != null && t0Var.getVisibility() == 4) {
                        if (i5Var != null) {
                            z18 = i5Var.F;
                        } else {
                            z18 = lVar.f20497n0;
                        }
                        if (!z18) {
                            if (H()) {
                                this.f33244z0 = 1;
                                setSearchItemVisibility(0);
                            } else {
                                if (E0()) {
                                    i20 = 8;
                                } else {
                                    i20 = 4;
                                }
                                setSearchItemVisibility(i20);
                            }
                            float f7 = z10 ? 1.0f : 0.0f;
                            this.f33219q0 = j0(f7);
                            H1(1.0f - f7);
                            z17 = false;
                        }
                    }
                    z17 = false;
                    this.f33244z0 = 0;
                    this.f33219q0 = 1.0f;
                } else {
                    z17 = false;
                    if (t0Var != null && t0Var.getVisibility() == 4) {
                        if (H()) {
                            this.f33244z0 = 0;
                            this.f33219q0 = 1.0f;
                            setSearchItemVisibility(0);
                        } else {
                            if (E0()) {
                                i19 = 8;
                            } else {
                                i19 = 4;
                            }
                            setSearchItemVisibility(i19);
                            this.f33219q0 = 0.0f;
                        }
                    }
                }
                D1(z17);
            } else if (z10) {
                this.f33244z0 = 2;
            } else {
                this.f33244z0 = 0;
                if (t0Var != null) {
                    if (!E0() && !this.X0) {
                        i10 = 4;
                    } else {
                        i10 = 8;
                    }
                    setSearchItemVisibility(i10);
                }
            }
            int i32 = ss0VarArr2[z10 ? 1 : 0].E;
            if (i32 == 6) {
                if (!ls0Var.e && !ls0Var.h && ls0Var.d.isEmpty()) {
                    ls0.E(ls0Var, 0L);
                }
            } else if (i32 != 7) {
                if (x0(i32)) {
                    wt0 u13 = u1(ss0VarArr2[z10 ? 1 : 0].E);
                    if (u13 != null) {
                        th.x4 x4Var = u13.f32251s;
                        u13.P();
                        or0 or0Var = ss0VarArr2[z10 ? 1 : 0].f30355w;
                        if (x4Var != null && (x4Var.k() || (r0() && x4Var.g() > 0))) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        or0Var.e(z14, z10);
                        if (x4Var != null && x4Var.g() > 0 && !C0()) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z13 = z15;
                    }
                } else {
                    int i33 = ss0VarArr2[z10 ? 1 : 0].E;
                    if (i33 != 10 && i33 != 11 && i33 != 12 && i33 != 13 && i33 != 14) {
                        if (i33 == 15) {
                            i33 = 8;
                        }
                        ot0 ot0Var6 = ot0VarArr[i33];
                        if (!ot0Var6.f29181g && !ot0Var6.f29182i[0] && ot0Var6.f29177a.isEmpty()) {
                            ot0VarArr[i33].f29181g = true;
                            g0Var2.f();
                            if (i33 == 0) {
                                int i34 = ot0VarArr[0].f29190q;
                                if (i34 == 1) {
                                    i11 = 6;
                                } else if (i34 == 2) {
                                    i11 = 7;
                                }
                                org.telegram.ui.ActionBar.k2 k2Var = this.f33240x1;
                                k2Var.getMediaDataController().N0(this.l1, 50, 0, 0, i11, this.F, 1, k2Var.getClassGuid(), ot0VarArr[i11].f29189p, null, null);
                            }
                            i11 = i33;
                            org.telegram.ui.ActionBar.k2 k2Var2 = this.f33240x1;
                            k2Var2.getMediaDataController().N0(this.l1, 50, 0, 0, i11, this.F, 1, k2Var2.getClassGuid(), ot0VarArr[i11].f29189p, null, null);
                        }
                    }
                }
            }
            int i35 = ss0VarArr2[z10 ? 1 : 0].E;
            if (i35 == 8 || F0(i35)) {
                i12 = 4;
                ss0 ss0Var10 = ss0VarArr2[z10 ? 1 : 0];
                or0 or0Var2 = ss0Var10.f30355w;
                boolean F0 = F0(ss0Var10.E);
                int r12 = r1(ss0VarArr2[z10 ? 1 : 0].E);
                g9 g9Var = or0Var2.f25550b;
                vh.d dVar = or0Var2.f25552f;
                if (!F0 && !D0() && !z0()) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                g9Var.setVisibility(i13);
                if (F0) {
                    dVar.setVisibility(0);
                    dVar.h(org.telegram.messenger.cd.L0(2131744823, null), false);
                    i14 = 8;
                } else if (D0()) {
                    i14 = 8;
                    dVar.setVisibility(8);
                } else {
                    i14 = 8;
                    or0Var2.setStickerType(11);
                    if (!C0()) {
                        i15 = 0;
                    } else {
                        i15 = 8;
                    }
                    dVar.setVisibility(i15);
                    dVar.h(z(), false);
                }
                if (F0) {
                    or0Var2.d.setText(org.telegram.messenger.cd.L0(2131744801, null));
                    or0Var2.e.setText(org.telegram.messenger.cd.L0(2131744802, null));
                } else {
                    nh.p pVar = or0Var2.d;
                    if (!C0()) {
                        if (E0()) {
                            i16 = 2131748192;
                        } else {
                            i16 = 2131748163;
                        }
                    } else {
                        i16 = 2131748221;
                    }
                    pVar.setText(org.telegram.messenger.cd.L0(i16, null));
                    p80 p80Var = or0Var2.e;
                    if (E0()) {
                        str = org.telegram.messenger.cd.L0(2131748164, null);
                    }
                    p80Var.setText(str);
                }
                z16 = false;
                dVar.setOnClickListener(new aq0(this, F0, r12, 0));
            } else {
                ss0 ss0Var11 = ss0VarArr2[z10 ? 1 : 0];
                if (ss0Var11.E == 9) {
                    if (D0()) {
                        ss0VarArr2[z10 ? 1 : 0].f30355w.f25550b.setVisibility(8);
                        ss0VarArr2[z10 ? 1 : 0].f30355w.f25552f.setVisibility(8);
                    } else {
                        ss0VarArr2[z10 ? 1 : 0].f30355w.f25550b.setVisibility(0);
                        ss0VarArr2[z10 ? 1 : 0].f30355w.setStickerType(11);
                        ss0VarArr2[z10 ? 1 : 0].f30355w.f25552f.setVisibility(0);
                        ss0VarArr2[z10 ? 1 : 0].f30355w.f25552f.h(z(), false);
                    }
                    ss0VarArr2[z10 ? 1 : 0].f30355w.d.setText(org.telegram.messenger.cd.L0(2131748263, null));
                    p80 p80Var2 = ss0VarArr2[z10 ? 1 : 0].f30355w.e;
                    if (E0()) {
                        str = org.telegram.messenger.cd.L0(2131748264, null);
                    }
                    p80Var2.setText(str);
                    i12 = 4;
                    ss0VarArr2[z10 ? 1 : 0].f30355w.f25552f.setOnClickListener(new up0(this, 4));
                    z16 = false;
                    i14 = 8;
                } else {
                    i12 = 4;
                    ss0Var11.f30355w.f25550b.setVisibility(0);
                    ss0VarArr2[z10 ? 1 : 0].f30355w.setStickerType(1);
                    ss0VarArr2[z10 ? 1 : 0].f30355w.d.setText(org.telegram.messenger.cd.L0(2131748183, null));
                    ss0VarArr2[z10 ? 1 : 0].f30355w.e.setText(org.telegram.messenger.cd.L0(2131745824, null));
                    i14 = 8;
                    ss0VarArr2[z10 ? 1 : 0].f30355w.f25552f.setVisibility(8);
                    z16 = false;
                }
            }
            ss0VarArr2[z10 ? 1 : 0].h.setVisibility(z16 ? 1 : 0);
            u0Var3 = u0Var2;
        }
        int i36 = i23;
        ss0 ss0Var12 = ss0VarArr2[z10 ? 1 : 0];
        ss0Var12.f30349b = z13;
        A1(ss0Var12, z16);
        ss0VarArr2[z10 ? 1 : 0].f30356x.y1(i36);
        ss0VarArr2[z10 ? 1 : 0].h.a0();
        if (u0Var3 != null) {
            ss0VarArr2[z10 ? 1 : 0].h.setRecycledViewPool(u0Var3);
            ss0VarArr2[z10 ? 1 : 0].f30352n.setRecycledViewPool(u0Var3);
        }
        if (this.f33244z0 == 2) {
            if (i5Var != null) {
                z20 = i5Var.F;
            } else {
                z20 = lVar.f20497n0;
            }
            if (z20) {
                this.B0 = true;
                if (i5Var != null) {
                    i5Var.j(true);
                } else {
                    lVar.k(true);
                }
                this.f33244z0 = 0;
                this.f33219q0 = 0.0f;
                if (t0Var != null) {
                    if (E0()) {
                        i21 = i14;
                    } else {
                        i21 = i12;
                    }
                    setSearchItemVisibility(i21);
                }
                D1(false);
            }
        }
    }

    public final void x1(org.telegram.ui.ActionBar.b1 b1Var, org.telegram.ui.ActionBar.b1 b1Var2, Runnable runnable) {
        if (this.K1) {
            return;
        }
        if (!b1Var2.getCheckView().f25836a.f23919q && b1Var.getCheckView().f25836a.f23919q) {
            float f7 = -this.f33232u1;
            this.f33232u1 = f7;
            org.telegram.messenger.i0.F3(f7, b1Var, null);
            return;
        }
        b1Var.setChecked(!b1Var.getCheckView().f25836a.f23919q);
        runnable.run();
    }

    public final void y(View view) {
        ss0[] ss0VarArr = this.m0;
        addView(view, Math.max(indexOfChild(ss0VarArr[0]), indexOfChild(ss0VarArr[1])) + 1, w7.b6.e(-1, 0, 48));
        view.getLayoutParams().height = 0;
    }

    public boolean y0() {
        return false;
    }

    public final void y1() {
        if (this.H == null) {
            try {
                int q02 = q0(org.telegram.ui.ActionBar.t6.f21313y8);
                int q03 = q0(org.telegram.ui.ActionBar.t6.f21332z8);
                if (q02 != this.f33221q2 || q03 != this.f33225r2) {
                    this.f33221q2 = q02;
                    this.f33225r2 = q03;
                    org.telegram.ui.ActionBar.t0[] t0VarArr = {this.f33236w0, this.f33233v0, this.f33239x0, this.f33242y0, this.f33210n0};
                    for (int i10 = 0; i10 < 5; i10++) {
                        org.telegram.ui.ActionBar.t0 t0Var = t0VarArr[i10];
                        if (t0Var != null) {
                            t0Var.setIconColor(q02);
                            if (t0Var.getBackground() != null) {
                                org.telegram.ui.ActionBar.t6.H1(t0Var.getBackground(), q03, true);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    public final SpannableStringBuilder z() {
        if (this.Z1 == null) {
            this.Z1 = new SpannableStringBuilder();
            if (z0()) {
                this.Z1.append((CharSequence) org.telegram.messenger.cd.L0(2131746717, null));
            } else {
                this.Z1.append((CharSequence) "c");
                this.Z1.setSpan(new dq(2131231146, 0), 0, 1, 33);
                this.Z1.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.cd.L0(2131744827, null));
            }
        }
        return this.Z1;
    }

    public final boolean z0() {
        TLRPC.User Z1;
        long j10 = this.l1;
        if (j10 <= 0 || (Z1 = org.telegram.messenger.vp.r1(this.f33240x1.getCurrentAccount()).Z1(Long.valueOf(j10))) == null || !Z1.bot) {
            return false;
        }
        return true;
    }

    public final void z1() {
        es0 es0Var = this.J;
        if (es0Var != null) {
            es0Var.f();
        }
        mt0 mt0Var = this.M;
        if (mt0Var != null) {
            mt0Var.f();
        }
        mt0 mt0Var2 = this.N;
        if (mt0Var2 != null) {
            mt0Var2.f();
        }
        nt0 nt0Var = this.L;
        if (nt0Var != null) {
            nt0Var.X(false);
        }
        mt0 mt0Var3 = this.O;
        if (mt0Var3 != null) {
            mt0Var3.f();
        }
        gt0 gt0Var = this.P;
        if (gt0Var != null) {
            gt0Var.f();
        }
        ns0 ns0Var = this.Q;
        if (ns0Var != null) {
            ns0Var.f();
        }
        hs0 hs0Var = this.f33183e0;
        if (hs0Var != null) {
            hs0Var.f();
        }
        for (yt0 yt0Var : this.f33206l2.values()) {
            yt0Var.f32790c.f();
        }
    }

    public void L0(SparseArray sparseArray) {
    }

    public void S0(boolean z10) {
    }

    public int c1(int i10) {
        return i10;
    }

    @Override
    public final void l(org.telegram.ui.Cells.v2 v2Var) {
    }

    @Override
    public final void r(org.telegram.ui.Cells.v2 v2Var) {
    }

    @Override
    public final void x(org.telegram.ui.Cells.v2 v2Var) {
    }

    public void M0() {
    }

    @Override
    public final void q() {
    }
}
