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
public abstract class au0 extends FrameLayout implements org.telegram.ui.ActionBar.k6, org.telegram.messenger.vs, org.telegram.ui.Cells.r2, ok0 {
    public static final int[] f24493s2 = {0, 1, 2, 4};
    public static final rq0 f24494t2 = new rq0(0);
    public static final int f24495u2 = org.telegram.messenger.i0.L(7.0f);
    public static final int f24496v2 = org.telegram.messenger.i0.L(7.0f) + org.telegram.messenger.i0.L(14.0f);
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
    public final ns0 F1;
    public final org.telegram.ui.ActionBar.l G;
    public final ArrayList G0;
    public q30 G1;
    public final org.telegram.ui.ActionBar.i5 H;
    public final ArrayList H0;
    public final org.telegram.ui.ActionBar.p6 H1;
    public final org.telegram.ui.ActionBar.p5 I;
    public final ArrayList I0;
    public final hi.c I1;
    public final fs0 J;
    public final ArrayList J0;
    public final xa.n J1;
    public final ut0 K;
    public final vr0 K0;
    public boolean K1;
    public final ot0 L;
    public final sr0 L0;
    public final e2.f L1;
    public final nt0 M;
    public final org.telegram.ui.Cells.s0 M0;
    public ki0 M1;
    public final nt0 N;
    public AnimatorSet N0;
    public int N1;
    public final nt0 O;
    public final wp0 O0;
    public boolean O1;
    public final ht0 P;
    public final ArrayList P0;
    public int P1;
    public final os0 Q;
    public float Q0;
    public AnimatorSet Q1;
    public final ms0 R;
    public final zr R0;
    public final SparseArray R1;
    public final ks0 S;
    public final FrameLayout S0;
    public long S1;
    public final jt0 T;
    public final qr0 T0;
    public boolean T1;
    public final mt0 U;
    public final int U0;
    public int U1;
    public final gs0 V;
    public final Paint V0;
    public final cs0 V1;
    public final vq0 W;
    public boolean W0;
    public th.x4 W1;
    public boolean X0;
    public float X1;
    public sg.o0 Y0;
    public boolean Y1;
    public final int[] Z0;
    public SpannableStringBuilder Z1;
    public boolean f24497a;
    public final wq0 f24498a0;
    public int f24499a1;
    public int a2;
    public boolean f24500b;
    public final ar0 f24501b0;
    public final SparseArray[] f24502b1;
    public boolean f24503b2;
    public boolean f24504c;
    public final ls0 f24505c0;
    public int f24506c1;
    public int f24507c2;
    public boolean d;
    public final s4.x f24508d0;
    public boolean f24509d1;
    public int f24510d2;
    public int e;
    public final is0 f24511e0;
    public long f24512e1;
    public int f24513e2;
    public int f24514f;
    public final xt0 f24515f0;
    public TLRPC.ChatFull f24516f1;
    public int f24517f2;
    public final uq0 f24518g0;
    public TLRPC.UserFull f24519g1;
    public ei.r f24520g2;
    public float h;
    public final xt0 f24521h0;
    public AnimatorSet f24522h1;
    public float f24523h2;
    public final vs0 f24524i0;
    public boolean f24525i1;
    public final RectF f24526i2;
    public final vs0 f24527j0;
    public boolean f24528j1;
    public Runnable f24529j2;
    public final vs0 f24530k0;
    public boolean f24531k1;
    public int f24532k2;
    public final rs0 f24533l0;
    public final long l1;
    public final HashMap f24534l2;
    public final ts0[] m0;
    public boolean f24535m1;
    public final HashMap f24536m2;
    public float f24537n;
    public final org.telegram.ui.ActionBar.t0 f24538n0;
    public boolean f24539n1;
    public int f24540n2;
    public final org.telegram.ui.ActionBar.t0 f24541o0;
    public final int[] f24542o1;
    public int f24543o2;
    public final org.telegram.ui.ActionBar.t0 f24544p0;
    public float f24545p1;
    public boolean f24546p2;
    public float f24547q0;
    public boolean f24548q1;
    public int f24549q2;
    public boolean f24550r;
    public float f24551r0;
    public int f24552r1;
    public int f24553r2;
    public int f24554s;
    public final TextView f24555s0;
    public int f24556s1;
    public final ImageView f24557t0;
    public final gr0 f24558t1;
    public final fi0 f24559u0;
    public float f24560u1;
    public final org.telegram.ui.ActionBar.t0 f24561v0;
    public final pt0[] f24562v1;
    public int f24563w;
    public final org.telegram.ui.ActionBar.t0 f24564w0;
    public final st0 f24565w1;
    public int f24566x;
    public final org.telegram.ui.ActionBar.t0 f24567x0;
    public final org.telegram.ui.ActionBar.k2 f24568x1;
    public final Rect f24569y;
    public final org.telegram.ui.ActionBar.t0 f24570y0;
    public int f24571y1;
    public int f24572z0;
    public boolean f24573z1;

    public au0(android.content.Context r33, long r34, org.telegram.ui.Components.st0 r36, int r37, java.util.ArrayList r38, org.telegram.tgnet.TLRPC.ChatFull r39, org.telegram.tgnet.TLRPC.UserFull r40, int r41, int r42, org.telegram.ui.ActionBar.k2 r43, org.telegram.ui.Components.ns0 r44, int r45, org.telegram.ui.ActionBar.p6 r46, tg.b r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.au0.<init>(android.content.Context, long, org.telegram.ui.Components.st0, int, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.tgnet.TLRPC$UserFull, int, int, org.telegram.ui.ActionBar.k2, org.telegram.ui.Components.ns0, int, org.telegram.ui.ActionBar.p6, tg.b):void");
    }

    public static boolean G0(int i10) {
        if ((i10 & (-65536)) == 65536) {
            return true;
        }
        return false;
    }

    public static p3 W(int i10, long j10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        p3 p3Var = new p3(context, p6Var);
        ImageView imageView = (ImageView) p3Var.d;
        TextView textView = (TextView) p3Var.f29345c;
        if (i10 == 0) {
            if (org.telegram.messenger.o5.C(j10)) {
                textView.setText(org.telegram.messenger.dd.L0(2131748213, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.dd.L0(2131748215, null));
            return p3Var;
        } else if (i10 == 1) {
            if (org.telegram.messenger.o5.C(j10)) {
                textView.setText(org.telegram.messenger.dd.L0(2131748173, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.dd.L0(2131748174, null));
            return p3Var;
        } else if (i10 == 2) {
            if (org.telegram.messenger.o5.C(j10)) {
                textView.setText(org.telegram.messenger.dd.L0(2131748168, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.dd.L0(2131748169, null));
            return p3Var;
        } else if (i10 == 3) {
            if (org.telegram.messenger.o5.C(j10)) {
                textView.setText(org.telegram.messenger.dd.L0(2131748170, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.dd.L0(2131748171, null));
            return p3Var;
        } else if (i10 == 4) {
            if (org.telegram.messenger.o5.C(j10)) {
                textView.setText(org.telegram.messenger.dd.L0(2131748175, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.dd.L0(2131748176, null));
            return p3Var;
        } else if (i10 == 5) {
            if (org.telegram.messenger.o5.C(j10)) {
                textView.setText(org.telegram.messenger.dd.L0(2131748172, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.dd.L0(2131748225, null));
            return p3Var;
        } else if (i10 == 6) {
            imageView.setImageDrawable(null);
            textView.setText(org.telegram.messenger.dd.L0(2131748223, null));
            return p3Var;
        } else {
            if (i10 == 7) {
                imageView.setImageDrawable(null);
                textView.setText("");
            }
            return p3Var;
        }
    }

    public static void a(au0 au0Var, TL_stories.StoryItem storyItem, th.y4 y4Var) {
        au0Var.getStoriesController().c(y4Var.f49694a, au0Var.l1, storyItem);
        org.telegram.messenger.i0.h3(new hi0(7, au0Var, y4Var), 100L);
    }

    public static void d(au0 au0Var, long j10, int i10, String str) {
        th.t4 B = au0Var.getStoriesController().B(j10, true);
        int i11 = B.f49472a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        ((th.y4) B.h.get(c10)).f49695b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = org.telegram.messenger.wp.r1(i11).i1(B.f49473b);
        tL_updateAlbum.album_id = i10;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i11).sendRequest(tL_updateAlbum, null);
        B.f(true);
    }

    public static void e(au0 au0Var, int i10, TL_stories.StoryItem storyItem, String str) {
        ki0 ki0Var = new ki0(au0Var, i10, storyItem, 2);
        th.e5 storiesController = au0Var.getStoriesController();
        long j10 = au0Var.l1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.f0(i10, j10, arrayList);
        cc.a0(au0Var.f24568x1).K(2131623979, org.telegram.messenger.i0.W2(org.telegram.messenger.dd.G(1, "StoryRemovedFromAlbumTitle", str)), org.telegram.messenger.dd.L0(2131743910, null), ki0Var).j();
    }

    public static void g(au0 au0Var, long j10, int i10) {
        th.t4 B = au0Var.getStoriesController().B(j10, true);
        int i11 = B.f49472a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = org.telegram.messenger.wp.r1(i11).i1(B.f49473b);
        tL_deleteAlbum.album_id = ((th.y4) B.h.remove(c10)).f49694a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_deleteAlbum, null);
        B.f(true);
    }

    public th.e5 getStoriesController() {
        return org.telegram.messenger.wp.r1(this.f24568x1.getCurrentAccount()).O1();
    }

    public static void h(au0 au0Var, TL_stories.StoryItem storyItem) {
        au0Var.getStoriesController().r0(au0Var.l1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        cc.a0(au0Var.f24568x1).G(2131623979, 5000, org.telegram.messenger.dd.G(1, "StoryArchived", new Object[0])).j();
    }

    public static void j(au0 au0Var, HashSet hashSet, TL_stories.StoryItem storyItem, z60 z60Var, th.y4 y4Var) {
        String a02;
        long j10 = au0Var.l1;
        if (hashSet.contains(Integer.valueOf(y4Var.f49694a))) {
            au0Var.getStoriesController().c(y4Var.f49694a, j10, storyItem);
            a02 = org.telegram.messenger.dd.a0(null, null, 2131744749, y4Var.f49695b);
        } else {
            th.e5 storiesController = au0Var.getStoriesController();
            int i10 = y4Var.f49694a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.f0(i10, j10, arrayList);
            a02 = org.telegram.messenger.dd.a0(null, null, 2131744520, y4Var.f49695b);
        }
        cc.a0(au0Var.f24568x1).Q(2131623989, 36, org.telegram.messenger.i0.W2(a02)).j();
        z60Var.u();
    }

    public static void l1(int i10, View view) {
        if (view != null && (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams.topMargin != i10) {
                marginLayoutParams.topMargin = i10;
                view.setLayoutParams(marginLayoutParams);
            }
        }
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

    public static TLRPC.ProfileTab n0(int i10, boolean z10) {
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

    public static int o0(TLRPC.ProfileTab profileTab) {
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

    public static void p(ts0 ts0Var, pt0[] pt0VarArr, boolean z10) {
        hi0 hi0Var;
        if (z10) {
            if (org.telegram.messenger.uz.f18559v1 > 0 && ts0Var.F == null && !ts0Var.H && ts0Var.h.getFastScroll() != null && ts0Var.h.getFastScroll().f24412a0 && ts0Var.h.getFastScroll().getVisibility() == 0 && pt0VarArr[0].e() >= 50) {
                int i10 = org.telegram.messenger.uz.f18559v1;
                int i11 = i10 - 1;
                if (i10 != i11) {
                    org.telegram.messenger.uz.f18559v1 = i11;
                    org.telegram.messenger.w0.f18945b.getSharedPreferences("mainconfig", 0).edit().putInt("fastScrollHintCount", org.telegram.messenger.uz.f18559v1).apply();
                }
                ts0Var.H = true;
                Context context = ts0Var.getContext();
                org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(context, 22);
                TextView textView = new TextView(context);
                textView.setText(org.telegram.messenger.dd.L0(2131745426, null));
                textView.setTextSize(1, 14.0f);
                textView.setMaxLines(3);
                int i12 = org.telegram.ui.ActionBar.t6.f20940dg;
                org.telegram.ui.ActionBar.a7.V(textView, i12, null);
                int L = org.telegram.messenger.i0.L(6.0f);
                int i13 = org.telegram.ui.ActionBar.t6.f20957eg;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.x0(null, i13, false));
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i13);
                a5Var.setBackground(d02);
                org.telegram.ui.ActionBar.a7.k(a5Var, d02, N, null, null);
                a5Var.addView(textView, w7.b6.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
                ?? view = new View(context);
                view.f31057a = new Random();
                Paint paint = new Paint(1);
                view.f31058b = paint;
                Paint paint2 = new Paint(1);
                view.f31059c = paint2;
                view.f31060f = 1.0f;
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
                ts0Var.F = a5Var;
                ts0Var.addView(a5Var, w7.b6.c(-2.0f, -2));
                ts0Var.F.setAlpha(0.0f);
                ts0Var.F.setScaleX(0.8f);
                ts0Var.F.setScaleY(0.8f);
                ts0Var.F.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                ts0Var.invalidate();
                hi0 hi0Var2 = new hi0(8, ts0Var, a5Var);
                ts0Var.G = hi0Var2;
                org.telegram.messenger.i0.h3(hi0Var2, 4000L);
            }
        } else if (ts0Var.F != null && (hi0Var = ts0Var.G) != null) {
            org.telegram.messenger.i0.r(hi0Var);
            ts0Var.G.run();
            ts0Var.G = null;
            ts0Var.F = null;
        }
    }

    public static void s(au0 au0Var, int i10, boolean z10) {
        ts0[] ts0VarArr = au0Var.m0;
        if (ts0VarArr[0].E == i10) {
            return;
        }
        ts0 ts0Var = ts0VarArr[1];
        ts0Var.E = i10;
        ts0Var.setVisibility(0);
        au0Var.v0();
        au0Var.x1(true);
        au0Var.f24528j1 = z10;
        au0Var.U0();
        au0Var.D(!au0Var.C0(i10));
        au0Var.E1(true);
    }

    public void setHeaderEnabled(boolean z10) {
        org.telegram.ui.ActionBar.i5 i5Var = this.H;
        if (i5Var != null) {
            i5Var.setEnabled(z10);
        } else {
            this.G.setEnabled(z10);
        }
    }

    private void setPageOverscan(ss0 ss0Var) {
        if (this.f24503b2 && ss0Var != null) {
            ss0Var.f30439i3 = true;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ss0Var.getLayoutParams();
            if (marginLayoutParams != null) {
                int i10 = marginLayoutParams.topMargin;
                int i11 = -this.f24510d2;
                if (i10 != i11 || marginLayoutParams.bottomMargin != (-this.f24513e2)) {
                    marginLayoutParams.topMargin = i11;
                    marginLayoutParams.bottomMargin = -this.f24513e2;
                    ss0Var.setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    public void setSearchItemVisibility(int i10) {
        org.telegram.ui.ActionBar.t0 t0Var = this.f24544p0;
        if (t0Var == null) {
            return;
        }
        if (this.H != null) {
            Q(true, true);
        } else {
            t0Var.setVisibility(i10);
        }
    }

    public static int v(au0 au0Var, s4.g0 g0Var) {
        if (g0Var == au0Var.f24511e0) {
            return 8;
        }
        if (g0Var == au0Var.f24518g0) {
            return 9;
        }
        for (zt0 zt0Var : au0Var.f24534l2.values()) {
            if (zt0Var.f33224c == g0Var) {
                return zt0Var.f33222a;
            }
        }
        return -1;
    }

    public static int w(au0 au0Var, s4.g0 g0Var) {
        if (g0Var == au0Var.f24515f0) {
            return 8;
        }
        if (g0Var == au0Var.f24521h0) {
            return 9;
        }
        for (zt0 zt0Var : au0Var.f24534l2.values()) {
            if (zt0Var.d == g0Var) {
                return zt0Var.f33222a;
            }
        }
        return -1;
    }

    public static boolean y0(int i10) {
        if (i10 != 8 && i10 != 9 && !G0(i10)) {
            return false;
        }
        return true;
    }

    public final void A(xs0 xs0Var, org.telegram.ui.ActionBar.k2 k2Var, long j10, int i10) {
        String K;
        if (j10 > 0) {
            K = org.telegram.messenger.i20.n(org.telegram.messenger.wp.r1(k2Var.getCurrentAccount()).Z1(Long.valueOf(j10)));
        } else {
            K = org.telegram.messenger.w3.K(org.telegram.messenger.wp.r1(k2Var.getCurrentAccount()).L0(Long.valueOf(-j10)), false);
        }
        if (K == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        c3.i0.r(sb2, org.telegram.messenger.wp.r1(k2Var.getCurrentAccount()).U2, "/", K, "/a/");
        sb2.append(i10);
        String sb3 = sb2.toString();
        xs0Var.k0(2131231756, new jg(this, sb3, k2Var, 20), org.telegram.messenger.dd.L0(2131744806, null), false, true);
    }

    public final boolean A0() {
        TLRPC.User Z1;
        long j10 = this.l1;
        if (j10 <= 0 || (Z1 = org.telegram.messenger.wp.r1(this.f24568x1.getCurrentAccount()).Z1(Long.valueOf(j10))) == null || !Z1.bot) {
            return false;
        }
        return true;
    }

    public final void A1() {
        fs0 fs0Var = this.J;
        if (fs0Var != null) {
            fs0Var.f();
        }
        nt0 nt0Var = this.M;
        if (nt0Var != null) {
            nt0Var.f();
        }
        nt0 nt0Var2 = this.N;
        if (nt0Var2 != null) {
            nt0Var2.f();
        }
        ot0 ot0Var = this.L;
        if (ot0Var != null) {
            ot0Var.X(false);
        }
        nt0 nt0Var3 = this.O;
        if (nt0Var3 != null) {
            nt0Var3.f();
        }
        ht0 ht0Var = this.P;
        if (ht0Var != null) {
            ht0Var.f();
        }
        os0 os0Var = this.Q;
        if (os0Var != null) {
            os0Var.f();
        }
        is0 is0Var = this.f24511e0;
        if (is0Var != null) {
            is0Var.f();
        }
        for (zt0 zt0Var : this.f24534l2.values()) {
            zt0Var.f33224c.f();
        }
    }

    public final void B(xs0 xs0Var) {
        float f7;
        final View[] viewArr = {xs0Var.k0(2131232437, new Runnable(this) {
            public final au0 f28242b;

            {
                this.f28242b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        au0 au0Var = this.f28242b;
                        au0Var.getClass();
                        View[] viewArr2 = viewArr;
                        au0Var.M1(viewArr2[0], viewArr2[1]);
                        return;
                    default:
                        au0 au0Var2 = this.f28242b;
                        au0Var2.getClass();
                        View[] viewArr3 = viewArr;
                        au0Var2.N1(viewArr3[0], viewArr3[1]);
                        return;
                }
            }
        }, org.telegram.messenger.dd.L0(2131748665, null), false, false), xs0Var.k0(2131232438, new Runnable(this) {
            public final au0 f28242b;

            {
                this.f28242b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        au0 au0Var = this.f28242b;
                        au0Var.getClass();
                        View[] viewArr2 = viewArr;
                        au0Var.M1(viewArr2[0], viewArr2[1]);
                        return;
                    default:
                        au0 au0Var2 = this.f28242b;
                        au0Var2.getClass();
                        View[] viewArr3 = viewArr;
                        au0Var2.N1(viewArr3[0], viewArr3[1]);
                        return;
                }
            }
        }, org.telegram.messenger.dd.L0(2131748664, null), false, false)};
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

    public final boolean B0() {
        org.telegram.ui.ActionBar.k2 k2Var;
        if (this.f24516f1 != null && (k2Var = this.f24568x1) != null) {
            return org.telegram.messenger.w3.V(k2Var.getMessagesController().L0(Long.valueOf(this.f24516f1.f19795id)));
        }
        return false;
    }

    public final void B1(ts0 ts0Var, boolean z10) {
        boolean z11;
        Integer num = 1;
        int i10 = 0;
        if (ts0Var.f30716b && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        ak0 fastScroll = ts0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = ts0Var.f30717c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            ts0Var.f30717c.cancel();
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
            ts0Var.f30717c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(num);
        } else if (!z11 && fastScroll.getTag() != null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, property, fastScroll.getAlpha(), 0.0f);
            ofFloat2.addListener(new eg.m(fastScroll));
            ts0Var.f30717c = ofFloat2;
            ofFloat2.setDuration(150L).start();
            fastScroll.animate().setListener(null).cancel();
            fastScroll.setTag(null);
        }
    }

    public final void C(ss0 ss0Var, int i10, SparseBooleanArray sparseBooleanArray) {
        int childCount = ss0Var.getChildCount();
        zz zzVar = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = ss0Var.getChildAt(i11);
            if (childAt instanceof zz) {
                zzVar = childAt;
            }
        }
        if (zzVar != null) {
            ss0Var.removeView(zzVar);
        }
        getViewTreeObserver().addOnPreDrawListener(new as0(this, ss0Var, sparseBooleanArray, zzVar, i10));
    }

    public final boolean C0(int i10) {
        if (i10 == 7) {
            return this.F1.Y();
        }
        if (!D0() && i10 != 0 && !y0(i10) && i10 != 2 && i10 != 5 && i10 != 6 && i10 != 11 && i10 != 10 && i10 != 13 && i10 != 14 && i10 != 15) {
            return true;
        }
        return false;
    }

    public final void C1() {
        boolean z10;
        float f7;
        org.telegram.ui.ActionBar.t0 t0Var = this.f24561v0;
        if (t0Var != null) {
            if (!this.f24568x1.getMessagesController().z2(this.l1) && !t0()) {
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
                int i10 = org.telegram.ui.ActionBar.t6.f21333z8;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(r0(i10), 5, -1);
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
                t0Var.setBackground(h02);
                org.telegram.ui.ActionBar.a7.k(t0Var, h02, null, N, this.H1);
            }
        }
    }

    public final void D(boolean z10) {
        int i10;
        fi0 fi0Var = this.f24559u0;
        if (fi0Var != null && this.Y1 != z10) {
            this.Y1 = z10;
            if (!z10 && fi0Var.getAnimatedDrawable().f25131a0 < 20) {
                fi0Var.getAnimatedDrawable().P(0);
            } else {
                ci0 animatedDrawable = fi0Var.getAnimatedDrawable();
                if (this.Y1) {
                    i10 = 50;
                } else {
                    i10 = 100;
                }
                animatedDrawable.P(i10);
            }
            fi0Var.getAnimatedDrawable().start();
        }
    }

    public boolean D0() {
        if (TextUtils.isEmpty(getStoriesHashtag()) && getStoriesArea() == null) {
            return false;
        }
        return true;
    }

    public final void D1() {
        int i10;
        wq0 wq0Var = this.f24498a0;
        if (wq0Var != null) {
            int L = org.telegram.messenger.i0.L(48.0f) + this.f24507c2;
            zr zrVar = this.R0;
            if (zrVar != null) {
                i10 = (int) zrVar.c(org.telegram.messenger.i0.L(7.0f));
            } else {
                i10 = 0;
            }
            wq0Var.setPaddingTop(L + i10);
        }
    }

    public final void E(int i10) {
        int i11;
        ts0 f02 = f0(this.f24552r1);
        this.f24554s = -1;
        if (f02 != null) {
            f02.h.C0();
            this.f24556s1 = i10;
            f02.f30719n.setVisibility(0);
            if (y0(this.f24552r1)) {
                f02.f30719n.setAdapter(w1(this.f24552r1));
            } else {
                f02.f30719n.setAdapter(this.K);
            }
            ss0 ss0Var = f02.f30719n;
            int paddingLeft = ss0Var.getPaddingLeft();
            ss0 ss0Var2 = f02.f30719n;
            int i02 = i0(f02.E);
            ss0Var2.f30437g3 = i02;
            int paddingRight = f02.f30719n.getPaddingRight();
            ss0 ss0Var3 = f02.f30719n;
            int h02 = h0(F0());
            ss0Var3.f30438h3 = h02;
            ss0Var.setPadding(paddingLeft, i02, paddingRight, h02);
            f02.f30720r.y1(i10);
            f02.f30719n.a0();
            int i12 = 0;
            while (true) {
                ts0[] ts0VarArr = this.m0;
                if (i12 >= ts0VarArr.length) {
                    break;
                }
                ts0 ts0Var = ts0VarArr[i12];
                if (ts0Var != null && ((i11 = ts0Var.E) == 0 || y0(i11))) {
                    org.telegram.messenger.i0.a4(ts0VarArr[i12].h);
                }
                i12++;
            }
            this.f24548q1 = true;
            if (this.f24552r1 == 0) {
                this.f24562v1[0].g(true);
            }
            this.f24545p1 = 0.0f;
            f1();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.L1.d();
            ofFloat.addUpdateListener(new ur0(this, f02, 1));
            ofFloat.addListener(new x10(this, y0(f02.E) ? 1 : 0, i10, 1));
            ofFloat.setInterpolator(gr.f26523f);
            ofFloat.setStartDelay(100L);
            ofFloat.setDuration(350L);
            ofFloat.start();
        }
    }

    public boolean E0() {
        return false;
    }

    public final void E1(boolean z10) {
        wq0 wq0Var;
        ar0 ar0Var;
        boolean z11 = true;
        Q(true, true);
        fi0 fi0Var = this.f24559u0;
        if (fi0Var == null) {
            return;
        }
        float f7 = 0.0f;
        if (!this.X0 && (((wq0Var = this.f24498a0) == null || !wq0Var.g()) && ((ar0Var = this.f24501b0) == null || !ar0Var.f43750f))) {
            f7 = Utilities.i(this.f24547q0 + this.f24551r0, 1.0f, 0.0f);
        }
        fi0Var.setAlpha(f7);
        if (z10) {
            if (j0(1.0f) <= 0.5f) {
                z11 = false;
            }
            D(z11);
        } else if (this.f24572z0 == 2) {
            if (this.f24551r0 <= 0.1f) {
                z11 = false;
            }
            D(z11);
        } else {
            if (this.f24547q0 >= 0.1f) {
                z11 = false;
            }
            D(z11);
        }
    }

    public final void F() {
        int i10 = this.f24507c2;
        int i11 = this.f24543o2;
        l1((org.telegram.messenger.i0.L(6.666f) + i10) - f24496v2, this.R0);
        int i12 = i10 + i11;
        l1(i12, this.K0);
        l1(i12, this.D0);
        l1(org.telegram.messenger.i0.L(52.0f) + i10 + i11, this.M0);
        l1(org.telegram.messenger.i0.L(4.0f) + i10 + i11, this.L0);
        l1(org.telegram.messenger.i0.L(48.0f) + i10 + i11, this.f24501b0);
        if (this.f24532k2 != i11) {
            this.f24532k2 = i11;
            Runnable runnable = this.f24529j2;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public boolean F0() {
        return false;
    }

    public final void F1(ts0 ts0Var) {
        boolean z10;
        boolean b12 = ts0Var.h.b1();
        if (b12) {
            ts0Var.h.setSectionsDrawBackground(this.f24503b2);
        }
        if (this.f24503b2 && !b12 && ts0Var.E != 15) {
            z10 = true;
        } else {
            z10 = false;
        }
        ts0Var.setDrawPageBackground(z10);
        if (ts0Var.E == 15) {
            Drawable drawable = ts0Var.O;
            if (drawable == null) {
                drawable = ts0Var.getBackground();
            }
            Drawable e = vh.k4.e(drawable, this.f24568x1.getCurrentAccount(), this.l1, org.telegram.ui.ActionBar.t6.I.q());
            if (!this.f24503b2) {
                ts0Var.setWallpaper(null);
                ts0Var.setBackground(e);
                ts0Var.setOutlineProvider(new bi.d2(15));
                ts0Var.setClipToOutline(true);
                return;
            }
            ts0Var.setBackground(null);
            ts0Var.setClipToOutline(false);
            ts0Var.setWallpaper(e);
            return;
        }
        ts0Var.setClipToOutline(false);
        ts0Var.setBackground(null);
        ts0Var.setWallpaper(null);
    }

    public final boolean G() {
        boolean A0 = A0();
        long j10 = this.l1;
        org.telegram.ui.ActionBar.k2 k2Var = this.f24568x1;
        if (A0) {
            TLRPC.User Z1 = org.telegram.messenger.wp.r1(k2Var.getCurrentAccount()).Z1(Long.valueOf(j10));
            if (Z1 == null || !Z1.bot || !Z1.bot_can_edit) {
                return false;
            }
            return true;
        } else if (!F0()) {
            if (k2Var == null || !k2Var.getMessagesController().O1().h(j10)) {
                return false;
            }
            return true;
        } else {
            return true;
        }
    }

    public final void G1(ts0 ts0Var) {
        boolean z10;
        float f7;
        int i10;
        float f10;
        float f11;
        int i11 = ts0Var.E;
        if (i11 != 0 && !y0(i11)) {
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
        d.topMargin = m0(ts0Var.E) + d.topMargin;
        ViewGroup.LayoutParams layoutParams = ts0Var.f30721s.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2.leftMargin == d.leftMargin && layoutParams2.topMargin == d.topMargin && layoutParams2.rightMargin == d.rightMargin && layoutParams2.bottomMargin == d.bottomMargin && layoutParams2.gravity == d.gravity) {
                return;
            }
        }
        ts0Var.f30721s.setLayoutParams(d);
    }

    public boolean H() {
        return !(this instanceof g30);
    }

    public final boolean H0() {
        if (!G() || ((getClosestTab() != 8 && getClosestTab() != 13 && !G0(getClosestTab())) || !this.E1)) {
            wq0 wq0Var = this.f24498a0;
            if (wq0Var == null || !wq0Var.g()) {
                ar0 ar0Var = this.f24501b0;
                if ((ar0Var == null || !ar0Var.f43750f) && !this.f24548q1 && !this.f24525i1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void H1(boolean z10) {
        int i10 = 0;
        while (true) {
            ts0[] ts0VarArr = this.m0;
            if (i10 < ts0VarArr.length) {
                int childCount = ts0VarArr[i10].h.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = ts0VarArr[i10].h.getChildAt(i11);
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

    public final boolean I() {
        ts0 ts0Var;
        ts0[] ts0VarArr = this.m0;
        if (ts0VarArr != null && (ts0Var = ts0VarArr[0]) != null) {
            boolean y02 = y0(ts0Var.E);
            int i10 = this.f24542o1[y02 ? 1 : 0];
            if (i10 != g0(y02 ? 1 : 0, i10, true)) {
                return true;
            }
        }
        return false;
    }

    public final void I0(int i10, int i11, int i12, boolean z10) {
        pt0[] pt0VarArr = this.f24562v1;
        pt0VarArr[i10].f29532a.clear();
        pt0VarArr[i10].f29533b[0].clear();
        pt0VarArr[i10].f29533b[1].clear();
        pt0 pt0Var = pt0VarArr[i10];
        pt0Var.f29538j[0] = i11;
        pt0Var.f29537i[0] = false;
        pt0Var.f29540l = false;
        pt0Var.f29541m = i12;
        pt0Var.f29542n = (pt0Var.e() - i12) - 1;
        pt0 pt0Var2 = pt0VarArr[i10];
        if (pt0Var2.f29542n < 0) {
            pt0Var2.f29542n = 0;
        }
        pt0Var2.f29539k = i11;
        pt0Var2.f29543o = true;
        pt0Var2.f29536g = false;
        pt0Var2.f29544p++;
        ts0 f02 = f0(i10);
        if (f02 != null && f02.h.getAdapter() != null) {
            f02.h.getAdapter().f();
        }
        if (z10) {
            int i13 = 0;
            while (true) {
                ts0[] ts0VarArr = this.m0;
                if (i13 < ts0VarArr.length) {
                    ts0 ts0Var = ts0VarArr[i13];
                    if (ts0Var.E == i10) {
                        ts0Var.f30723x.h1(Math.min(pt0VarArr[i10].e() - 1, pt0VarArr[i10].f29541m), 0);
                    }
                    i13++;
                } else {
                    return;
                }
            }
        }
    }

    public final void I1(float f7) {
        org.telegram.ui.ActionBar.t0 t0Var = this.f24541o0;
        if (t0Var == null) {
            return;
        }
        ts0[] ts0VarArr = this.m0;
        ts0 ts0Var = ts0VarArr[1];
        float f10 = 0.0f;
        if (ts0Var != null && ts0Var.E == 11) {
            f10 = 0.0f + f7;
        }
        int i10 = 0;
        ts0 ts0Var2 = ts0VarArr[0];
        if (ts0Var2 != null && ts0Var2.E == 11) {
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

    public final boolean J() {
        ts0 ts0Var;
        ts0[] ts0VarArr = this.m0;
        if (ts0VarArr == null || (ts0Var = ts0VarArr[0]) == null) {
            return false;
        }
        if (this.f24535m1 && y0(ts0Var.E)) {
            return false;
        }
        boolean y02 = y0(ts0VarArr[0].E);
        int i10 = this.f24542o1[y02 ? 1 : 0];
        if (i10 == g0(y02 ? 1 : 0, i10, false)) {
            return false;
        }
        return true;
    }

    public final void J0(boolean z10) {
        long j10 = this.F;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0 && !D0()) {
            for (int i11 = 0; i11 < 4; i11++) {
                int i12 = f24493s2[i11];
                pt0[] pt0VarArr = this.f24562v1;
                if (!pt0VarArr[i12].h || z10) {
                    long j11 = this.l1;
                    if (!org.telegram.messenger.o5.C(j11)) {
                        pt0VarArr[i12].h = false;
                        TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
                        if (i12 == 0) {
                            int i13 = pt0VarArr[i12].f29545q;
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
                        org.telegram.ui.ActionBar.k2 k2Var = this.f24568x1;
                        tL_messages_getSearchResultsPositions.peer = k2Var.getMessagesController().i1(j11);
                        if (i10 != 0 && k2Var.getUserConfig().e() == j11) {
                            tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                            tL_messages_getSearchResultsPositions.saved_peer_id = k2Var.getMessagesController().i1(j10);
                        }
                        ConnectionsManager.getInstance(k2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(k2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new org.telegram.messenger.ee(this, pt0VarArr[i12].f29544p, i12, 2)), k2Var.getClassGuid());
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void J1() {
        float f7;
        float f10;
        org.telegram.ui.ActionBar.t0 t0Var = this.f24541o0;
        if (t0Var == null) {
            return;
        }
        boolean z10 = true;
        ts0 ts0Var = this.m0[1];
        if (ts0Var == null || ts0Var.E != 11) {
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

    public final void K(Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        ts0[] ts0VarArr;
        uk0 uk0Var;
        vq0 vq0Var;
        gs0 gs0Var;
        wq0 wq0Var;
        View[] viewPages;
        for (ts0 ts0Var : this.m0) {
            if (ts0Var != null && ts0Var.getVisibility() == 0) {
                if (ts0Var.O != null) {
                    RectF rectF2 = this.f24526i2;
                    if (zg.h.c(ts0Var, viewGroup, rectF2)) {
                        canvas.save();
                        canvas.translate(rectF2.left, rectF2.top);
                        ts0Var.g(canvas);
                        canvas.restore();
                    }
                }
                if (ts0Var.E == 14 && (wq0Var = this.f24498a0) != null && wq0Var.getParent() == ts0Var) {
                    for (View view : wq0Var.h.getViewPages()) {
                        if ((view instanceof ph.f2) && view.getVisibility() == 0) {
                            ii iiVar = ((ph.f2) view).f45056f;
                            yg.d.a(iiVar, canvas, rectF, iiVar, viewGroup);
                        }
                    }
                } else {
                    if (ts0Var.E == 12 && (gs0Var = this.V) != null && gs0Var.getParent() == ts0Var) {
                        uk0Var = gs0Var.f43128a.f42303z0;
                    } else if (ts0Var.E == 13 && (vq0Var = this.W) != null && vq0Var.getParent() == ts0Var) {
                        uk0Var = vq0Var.getCurrentListView();
                    } else {
                        uk0Var = ts0Var.h;
                    }
                    if (uk0Var != null && uk0Var.getVisibility() == 0) {
                        yg.d.a(uk0Var, canvas, rectF, uk0Var, viewGroup);
                    }
                }
            }
        }
    }

    public final void K0(int i10) {
        int i11;
        int i12 = 2;
        pt0[] pt0VarArr = this.f24562v1;
        if (i10 == 0) {
            int i13 = pt0VarArr[0].f29545q;
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
        pt0VarArr[i10].f29536g = true;
        org.telegram.ui.ActionBar.k2 k2Var = this.f24568x1;
        k2Var.getMediaDataController().N0(this.l1, 50, 0, pt0VarArr[i10].f29539k, i11, this.F, 1, k2Var.getClassGuid(), pt0VarArr[i10].f29544p, null, null);
    }

    public final void K1() {
        boolean z10;
        int i10;
        th.x4 x4Var;
        boolean A0 = A0();
        org.telegram.ui.ActionBar.t0 t0Var = this.f24570y0;
        org.telegram.ui.ActionBar.t0 t0Var2 = this.f24567x0;
        int i11 = 8;
        if (A0) {
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
                SparseArray[] sparseArrayArr = this.f24502b1;
                if (i12 < sparseArrayArr[0].size()) {
                    org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) sparseArrayArr[0].valueAt(i12);
                    is0 is0Var = this.f24511e0;
                    if (is0Var != null && (x4Var = is0Var.f32635s) != null && !x4Var.m(kjVar.f1())) {
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
        } else if (G0(getClosestTab())) {
            if (t0Var2 != null) {
                t0Var2.setVisibility(8);
            }
            if (t0Var != null) {
                t0Var.setVisibility(8);
            }
        }
    }

    public final void L() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.au0.L():void");
    }

    public int L0() {
        return 0;
    }

    public void L1(boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.au0.L1(boolean):void");
    }

    public final void M() {
        vr0 vr0Var = this.K0;
        if (!vr0Var.d(vr0Var.getCurrentTabId())) {
            int firstTabId = vr0Var.getFirstTabId();
            vr0Var.setInitialTabId(firstTabId);
            this.m0[0].E = firstTabId;
            x1(false);
        }
    }

    public final Boolean M1(View view, View view2) {
        if (!this.f24548q1) {
            ts0[] ts0VarArr = this.m0;
            boolean z10 = false;
            ts0 ts0Var = ts0VarArr[0];
            if (ts0Var != null) {
                int i10 = ts0Var.E;
                this.f24552r1 = i10;
                boolean y02 = y0(i10);
                int[] iArr = this.f24542o1;
                int g02 = g0(y02 ? 1 : 0, iArr[y02 ? 1 : 0], true);
                if (view != null && g02 == g0(y02 ? 1 : 0, g02, true)) {
                    view.setEnabled(false);
                    view.animate().alpha(0.5f).start();
                }
                if (iArr[y02 ? 1 : 0] != g02) {
                    if (view2 != null && !view2.isEnabled()) {
                        view2.setEnabled(true);
                        view2.animate().alpha(1.0f).start();
                    }
                    if (!y02) {
                        org.telegram.messenger.uz.B(g02);
                    } else if (l0(ts0VarArr[0].E) >= 5 || G0(ts0VarArr[0].E)) {
                        org.telegram.messenger.uz.F(g02);
                    }
                    E(g02);
                }
                if (g02 != g0(y02 ? 1 : 0, g02, true)) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
            return null;
        }
        return null;
    }

    public final void N(org.telegram.ui.Components.ts0 r34, org.telegram.ui.Components.uk0 r35, s4.a0 r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.au0.N(org.telegram.ui.Components.ts0, org.telegram.ui.Components.uk0, s4.a0):void");
    }

    public final Boolean N1(View view, View view2) {
        if (!this.f24548q1) {
            ts0[] ts0VarArr = this.m0;
            boolean z10 = false;
            ts0 ts0Var = ts0VarArr[0];
            if (ts0Var != null) {
                if (!this.f24535m1 || !y0(ts0Var.E)) {
                    int i10 = ts0VarArr[0].E;
                    this.f24552r1 = i10;
                    boolean y02 = y0(i10);
                    int[] iArr = this.f24542o1;
                    int g02 = g0(y02 ? 1 : 0, iArr[y02 ? 1 : 0], false);
                    if (view2 != null && g02 == g0(y02 ? 1 : 0, g02, false)) {
                        view2.setEnabled(false);
                        view2.animate().alpha(0.5f).start();
                    }
                    if (iArr[y02 ? 1 : 0] != g02) {
                        if (view != null && !view.isEnabled()) {
                            view.setEnabled(true);
                            view.animate().alpha(1.0f).start();
                        }
                        if (!y02) {
                            org.telegram.messenger.uz.B(g02);
                        } else if (l0(ts0VarArr[0].E) >= 5 || G0(ts0VarArr[0].E)) {
                            org.telegram.messenger.uz.F(g02);
                        }
                        E(g02);
                    }
                    if (g02 != g0(y02 ? 1 : 0, g02, false)) {
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

    public final boolean O(MotionEvent motionEvent) {
        float f7;
        s4.g0 g0Var;
        boolean z10;
        vq0 vq0Var;
        float f10;
        boolean z11;
        ts0[] ts0VarArr = this.m0;
        int i10 = ts0VarArr[0].E;
        if (i10 == 13 && (vq0Var = this.W) != null) {
            View currentView = vq0Var.f50277n.getCurrentView();
            if (currentView instanceof uh.i) {
                uh.i iVar = (uh.i) currentView;
                uh.e eVar = iVar.f50266w;
                uh.c cVar = iVar.f50262f;
                if (iVar.f50259a != null && iVar.getParent() != null) {
                    if (!iVar.f50260b || iVar.K) {
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
                                            iVar.f50261c = 0.0f;
                                        } else {
                                            if (z12) {
                                                f10 = org.telegram.messenger.m5.y(2.0f, iVar.Q, 1.0f, 1.0f);
                                            } else {
                                                f10 = (1.0f - iVar.Q) / 0.5f;
                                            }
                                            iVar.f50261c = Math.max(0.0f, Math.min(1.0f, f10));
                                        }
                                        float f11 = iVar.f50261c;
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
                                            if (iVar.f50261c == 0.0f) {
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
        if ((i10 == 0 || y0(i10)) && getParent() != null) {
            if (!this.f24548q1 || this.f24497a) {
                if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
                    if (motionEvent.getActionMasked() == 2 && (this.f24497a || this.f24504c)) {
                        int i18 = -1;
                        int i19 = -1;
                        for (int i20 = 0; i20 < motionEvent.getPointerCount(); i20++) {
                            if (this.e == motionEvent.getPointerId(i20)) {
                                i18 = i20;
                            }
                            if (this.f24514f == motionEvent.getPointerId(i20)) {
                                i19 = i20;
                            }
                        }
                        if (i18 != -1 && i19 != -1) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(i19) - motionEvent.getX(i18), motionEvent.getY(i19) - motionEvent.getY(i18))) / this.h;
                            this.f24537n = hypot2;
                            if (!this.f24497a && (hypot2 > 1.01f || hypot2 < 0.99f)) {
                                this.f24497a = true;
                                if (hypot2 > 1.0f) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                this.f24550r = z10;
                                p1(z10);
                            }
                            if (this.f24497a) {
                                boolean z13 = this.f24550r;
                                if ((z13 && this.f24537n < 1.0f) || (!z13 && this.f24537n > 1.0f)) {
                                    this.f24545p1 = 0.0f;
                                } else {
                                    if (z13) {
                                        f7 = org.telegram.messenger.m5.y(2.0f, this.f24537n, 1.0f, 1.0f);
                                    } else {
                                        f7 = (1.0f - this.f24537n) / 0.5f;
                                    }
                                    this.f24545p1 = Math.max(0.0f, Math.min(1.0f, f7));
                                }
                                float f12 = this.f24545p1;
                                if (f12 == 1.0f || f12 == 0.0f) {
                                    if (y0(this.f24552r1)) {
                                        g0Var = v1(this.f24552r1);
                                    } else {
                                        g0Var = this.J;
                                    }
                                    if (this.f24545p1 == 1.0f) {
                                        int i21 = this.f24556s1;
                                        int ceil2 = (((int) Math.ceil(this.f24554s / this.f24556s1)) * i21) + ((int) ((this.B1 / (ts0VarArr[0].h.getMeasuredWidth() - ((int) (ts0VarArr[0].h.getMeasuredWidth() / this.f24556s1)))) * (i21 - 1)));
                                        if (ceil2 >= g0Var.b()) {
                                            ceil2 = g0Var.b() - 1;
                                        }
                                        this.f24554s = ceil2;
                                    }
                                    c0();
                                    if (this.f24545p1 == 0.0f) {
                                        this.f24550r = !this.f24550r;
                                    }
                                    p1(this.f24550r);
                                    this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                }
                                ts0VarArr[0].h.invalidate();
                                ts0 ts0Var = ts0VarArr[0];
                                if (ts0Var.F != null) {
                                    ts0Var.invalidate();
                                }
                            }
                        } else {
                            this.f24500b = false;
                            this.f24504c = false;
                            this.f24497a = false;
                            c0();
                            return false;
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.e == motionEvent.getPointerId(0) && this.f24514f == motionEvent.getPointerId(1)) || (this.e == motionEvent.getPointerId(1) && this.f24514f == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.f24497a) {
                        this.f24504c = false;
                        this.f24500b = false;
                        this.f24497a = false;
                        c0();
                    }
                } else {
                    if (this.f24500b && !this.f24497a && motionEvent.getPointerCount() == 2) {
                        this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.f24537n = 1.0f;
                        this.e = motionEvent.getPointerId(0);
                        this.f24514f = motionEvent.getPointerId(1);
                        ts0VarArr[0].h.I0(false);
                        ts0VarArr[0].h.cancelLongPress();
                        ts0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.f24566x = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - ts0VarArr[0].getX());
                        int y10 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - ts0VarArr[0].getY());
                        int i22 = this.f24566x;
                        this.f24554s = -1;
                        int top2 = y10 - ts0VarArr[0].h.getTop();
                        if (getY() != 0.0f && this.E == 1) {
                            top2 = 0;
                        }
                        for (int i23 = 0; i23 < ts0VarArr[0].h.getChildCount(); i23++) {
                            View childAt2 = ts0VarArr[0].h.getChildAt(i23);
                            Rect rect2 = this.f24569y;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i22, top2)) {
                                ts0VarArr[0].h.getClass();
                                this.f24554s = RecyclerView.S(childAt2);
                                this.f24563w = childAt2.getTop();
                            }
                        }
                        if (this.F1.Y() && this.f24554s == -1) {
                            this.f24554s = (int) (((this.f24542o1[y0(ts0VarArr[0].E) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i22 / ts0VarArr[0].h.getMeasuredWidth(), 0.0f))) + ts0VarArr[0].f30723x.L0());
                            this.f24563w = 0;
                        }
                        this.f24504c = true;
                    }
                    if (motionEvent.getActionMasked() == 0 && ((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - ts0VarArr[0].getY() > this.f24507c2) {
                        this.f24500b = true;
                    }
                }
                return this.f24497a;
            }
            return true;
        }
        return false;
    }

    public final void O0() {
        th.x4 x4Var;
        th.x4 x4Var2;
        this.J1.a();
        is0 is0Var = this.f24511e0;
        if (is0Var != null && (x4Var2 = is0Var.f32635s) != null && x4Var2 != null) {
            x4Var2.z(is0Var.f32636w);
        }
        uq0 uq0Var = this.f24518g0;
        if (uq0Var != null && (x4Var = uq0Var.f32635s) != null && x4Var != null) {
            x4Var.z(uq0Var.f32636w);
        }
        for (zt0 zt0Var : this.f24534l2.values()) {
            yt0 yt0Var = zt0Var.f33224c;
            th.x4 x4Var3 = yt0Var.f32635s;
            if (x4Var3 != null && x4Var3 != null) {
                x4Var3.z(yt0Var.f32636w);
            }
        }
    }

    public final void P() {
        Q(false, false);
    }

    public final void P0(int i10, View view, org.telegram.messenger.kj kjVar, int i11) {
        TLRPC.WebPage webPage;
        String str;
        char c10;
        int i12;
        int i13;
        boolean z10;
        if (kjVar != null && !this.f24548q1) {
            ar0 ar0Var = this.f24501b0;
            if (ar0Var == null || !ar0Var.f43750f) {
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
                        if (org.telegram.messenger.kj.B0(kjVar.f16690k) == this.l1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        SparseArray[] sparseArrayArr = this.f24502b1;
                        if (sparseArrayArr[c10].indexOfKey(kjVar.f1()) >= 0) {
                            sparseArrayArr[c10].remove(kjVar.f1());
                            if (!kjVar.s(null, false)) {
                                this.f24506c1--;
                            }
                        } else {
                            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                                sparseArrayArr[c10].put(kjVar.f1(), kjVar);
                                if (!kjVar.s(null, false)) {
                                    this.f24506c1++;
                                }
                            } else {
                                return;
                            }
                        }
                        M0(sparseArrayArr[0]);
                        if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                            m1(false);
                        } else {
                            k1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                            if (this.f24506c1 == 0) {
                                i12 = 0;
                            } else {
                                i12 = 8;
                            }
                            this.f24538n0.setVisibility(i12);
                            org.telegram.ui.ActionBar.t0 t0Var = this.f24564w0;
                            if (t0Var != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14 && sparseArrayArr[0].size() == 1) {
                                    i13 = 0;
                                } else {
                                    i13 = 8;
                                }
                                t0Var.setVisibility(i13);
                            }
                            org.telegram.ui.ActionBar.t0 t0Var2 = this.f24561v0;
                            if (t0Var2 != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                                    i15 = 0;
                                }
                                t0Var2.setVisibility(i15);
                            }
                            K1();
                        }
                        this.f24509d1 = false;
                        if (view instanceof org.telegram.ui.Cells.l7) {
                            org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                            if (sparseArrayArr[c10].indexOfKey(kjVar.f1()) >= 0) {
                                z11 = true;
                            }
                            l7Var.b(z11, true);
                        } else if (view instanceof org.telegram.ui.Cells.t7) {
                            org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                            if (sparseArrayArr[c10].indexOfKey(kjVar.f1()) >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            t7Var.b(0, z10, true);
                        } else if (view instanceof org.telegram.ui.Cells.o7) {
                            org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                            if (sparseArrayArr[c10].indexOfKey(kjVar.f1()) >= 0) {
                                z12 = true;
                            }
                            o7Var.f(z12, true);
                        } else if (view instanceof org.telegram.ui.Cells.k7) {
                            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                            if (sparseArrayArr[c10].indexOfKey(kjVar.f1()) >= 0) {
                                z13 = true;
                            }
                            k7Var.e(z13, true);
                        } else if (view instanceof org.telegram.ui.Cells.h2) {
                            org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) view;
                            if (sparseArrayArr[c10].indexOfKey(kjVar.f1()) >= 0) {
                                z14 = true;
                            }
                            h2Var.c(z14, true);
                        } else if (view instanceof org.telegram.ui.Cells.s7) {
                            org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                            if (sparseArrayArr[c10].indexOfKey(kjVar.f1()) >= 0) {
                                z15 = true;
                            }
                            s7Var.i(z15, true);
                        }
                    } else {
                        return;
                    }
                } else {
                    gr0 gr0Var = this.f24558t1;
                    pt0[] pt0VarArr = this.f24562v1;
                    org.telegram.ui.ActionBar.k2 k2Var = this.f24568x1;
                    if (i11 == 0) {
                        pt0 pt0Var = pt0VarArr[i11];
                        int i16 = i10 - pt0Var.f29541m;
                        if (i16 >= 0 && i16 < pt0Var.f29532a.size()) {
                            PhotoViewer.v1().N2(null, k2Var, null);
                            PhotoViewer.v1().e2(pt0VarArr[i11].f29532a, i16, this.l1, this.f24512e1, this.F, gr0Var);
                        }
                    } else if (i11 != 2 && i11 != 4) {
                        if (i11 == 5) {
                            PhotoViewer.v1().N2(null, k2Var, null);
                            int indexOf = pt0VarArr[i11].f29532a.indexOf(kjVar);
                            if (indexOf < 0) {
                                PhotoViewer.v1().e2(org.telegram.messenger.m5.j(kjVar), 0, 0L, 0L, 0L, gr0Var);
                            } else {
                                PhotoViewer.v1().e2(pt0VarArr[i11].f29532a, indexOf, this.l1, this.f24512e1, this.F, gr0Var);
                            }
                        } else if (i11 == 1) {
                            if (view instanceof org.telegram.ui.Cells.l7) {
                                org.telegram.ui.Cells.l7 l7Var2 = (org.telegram.ui.Cells.l7) view;
                                TLRPC.Document F0 = kjVar.F0();
                                if (l7Var2.G) {
                                    if (kjVar.x()) {
                                        PhotoViewer.v1().N2(null, k2Var, null);
                                        int indexOf2 = pt0VarArr[i11].f29532a.indexOf(kjVar);
                                        if (indexOf2 < 0) {
                                            PhotoViewer.v1().e2(org.telegram.messenger.m5.j(kjVar), 0, 0L, 0L, 0L, gr0Var);
                                            return;
                                        }
                                        PhotoViewer.v1().e2(pt0VarArr[i11].f29532a, indexOf2, this.l1, this.f24512e1, this.F, gr0Var);
                                        return;
                                    }
                                    org.telegram.messenger.i0.s2(kjVar, k2Var.getParentActivity(), k2Var);
                                } else if (!l7Var2.F) {
                                    org.telegram.messenger.kj message = l7Var2.getMessage();
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
                                if (org.telegram.messenger.kj.o1(kjVar.f16690k) != null) {
                                    webPage = org.telegram.messenger.kj.o1(kjVar.f16690k).webpage;
                                } else {
                                    webPage = null;
                                }
                                if (webPage != null && !(webPage instanceof TLRPC.TL_webPageEmpty)) {
                                    if (webPage.cached_page != null) {
                                        LaunchActivity launchActivity = LaunchActivity.I1;
                                        if (launchActivity == null || launchActivity.N() == null || LaunchActivity.I1.N().k(kjVar) == null) {
                                            k2Var.createArticleViewer(false).L(kjVar, null, null, null);
                                            return;
                                        }
                                        return;
                                    }
                                    String str3 = webPage.embed_url;
                                    if (str3 != null && str3.length() != 0) {
                                        hu.K0(k2Var, kjVar, this.f24558t1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
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
                                    Z0(str);
                                }
                            } catch (Exception e) {
                                org.telegram.messenger.f8.g(e, true);
                            }
                        } else if (y0(i11)) {
                            xt0 v12 = v1(i11);
                            if (v12 != null) {
                                x4Var = v12.f32635s;
                            }
                            if (x4Var != null) {
                                th.o7 orCreateStoryViewer = k2Var.getOrCreateStoryViewer();
                                Context context = getContext();
                                int f12 = kjVar.f1();
                                th.n5 a2 = th.n5.a(this.m0[0].h);
                                a2.e = new px(x4Var, 19);
                                if ((k2Var instanceof ProfileActivity) && ((ProfileActivity) k2Var).f33899r1) {
                                    i14 = org.telegram.messenger.i0.L(68.0f);
                                }
                                a2.f49279s += i14;
                                orCreateStoryViewer.Q(context, f12, x4Var, a2);
                            } else {
                                return;
                            }
                        }
                    } else if (view instanceof org.telegram.ui.Cells.k7) {
                        ((org.telegram.ui.Cells.k7) view).a();
                    }
                }
                C1();
            }
        }
    }

    public final void Q(boolean z10, boolean z11) {
        boolean z12;
        if (this.H != null) {
            int closestTab = getClosestTab();
            boolean z13 = false;
            org.telegram.ui.ActionBar.t0 t0Var = this.f24544p0;
            if (t0Var != null) {
                if (this.f24546p2 && H() && (C0(closestTab) || (closestTab == 11 && w0()))) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ((org.telegram.ui.ActionBar.p5) t0Var).Y(z12, z10);
            }
            org.telegram.ui.ActionBar.p5 p5Var = this.I;
            if (p5Var != null) {
                if (this.f24546p2 && H() && !z0() && u0(closestTab)) {
                    z13 = true;
                }
                p5Var.Y(z13, z11);
            }
        }
    }

    public final boolean Q0(org.telegram.messenger.kj kjVar, View view, int i10, boolean z10) {
        ar0 ar0Var;
        char c10;
        int i11;
        int i12;
        final TL_stories.StoryItem storyItem;
        is0 is0Var;
        th.x4 x4Var;
        if (!this.E1) {
            org.telegram.ui.ActionBar.k2 k2Var = this.f24568x1;
            if (k2Var.getParentActivity() != null && kjVar != null && ((ar0Var = this.f24501b0) == null || !ar0Var.f43750f)) {
                org.telegram.messenger.i0.v1(k2Var.getParentActivity().getCurrentFocus());
                long j10 = this.l1;
                int i13 = 8;
                if (z10 && ((G0(getClosestTab()) || getClosestTab() == 8) && !this.E1)) {
                    if (view instanceof org.telegram.ui.Cells.s7) {
                        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                        s7Var.k(s7Var.f23034n, s7Var.f23039r, true);
                    }
                    TL_stories.StoryItem storyItem2 = kjVar.f16694l;
                    if (storyItem2 != null) {
                        HashSet hashSet = new HashSet();
                        ArrayList<Integer> arrayList = storyItem2.albums;
                        if (arrayList != null) {
                            hashSet.addAll(arrayList);
                        }
                        boolean G0 = G0(getClosestTab());
                        z60 I = z60.I(k2Var, view);
                        z60 J = I.J();
                        J.c(2131231241, org.telegram.messenger.dd.L0(2131753756, null), new org.telegram.ui.qr0(I, 27), false);
                        J.k();
                        z60.f(J, getStoriesController().B(j10, true), hashSet, true, new jg(this, storyItem2, I, 19), new ag.m2(this, hashSet, storyItem2, I, 10));
                        I.c(2131231764, org.telegram.messenger.dd.L0(2131744823, null), new bi.k(I, J, 8), false);
                        I.k();
                        I.c(2131232356, org.telegram.messenger.dd.L0(2131744807, null), new ag.g3(this, kjVar, view, i10, 23), false);
                        if (G0) {
                            int s12 = s1(getClosestTab());
                            String w9 = getStoriesController().w(s12, j10);
                            I.c(2131232770, org.telegram.messenger.dd.L0(2131744808, null), new zp0(this, s12, 0), false);
                            storyItem = storyItem2;
                            I.c(2131232328, org.telegram.messenger.dd.L0(2131744809, null), new ag.g3(this, s12, storyItem, w9, 24), false);
                        } else {
                            storyItem = storyItem2;
                            if (getClosestTab() == 8 && (is0Var = this.f24511e0) != null && (x4Var = is0Var.f32635s) != null) {
                                if (x4Var.m(storyItem.f20032id)) {
                                    I.c(2131231002, org.telegram.messenger.dd.L0(2131744805, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            int i14 = r1;
                                            TL_stories.StoryItem storyItem3 = storyItem;
                                            au0 au0Var = this;
                                            switch (i14) {
                                                case 0:
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, au0Var.getContext(), au0Var.H1);
                                                    String L0 = org.telegram.messenger.dd.L0(2131751488, null);
                                                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                                                    x1Var.R = L0;
                                                    x1Var.T = org.telegram.messenger.dd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new kq0(au0Var, storyItem3));
                                                    alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), new au(24));
                                                    x1Var.show();
                                                    x1Var.i();
                                                    return;
                                                case 1:
                                                    au0Var.getClass();
                                                    au0Var.b1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f20032id))), false);
                                                    return;
                                                case 2:
                                                    au0Var.getClass();
                                                    au0Var.b1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f20032id))), true);
                                                    return;
                                                default:
                                                    au0.h(au0Var, storyItem3);
                                                    return;
                                            }
                                        }
                                    }, false);
                                } else {
                                    I.c(2131230998, org.telegram.messenger.dd.L0(2131744810, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            int i14 = r1;
                                            TL_stories.StoryItem storyItem3 = storyItem;
                                            au0 au0Var = this;
                                            switch (i14) {
                                                case 0:
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, au0Var.getContext(), au0Var.H1);
                                                    String L0 = org.telegram.messenger.dd.L0(2131751488, null);
                                                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                                                    x1Var.R = L0;
                                                    x1Var.T = org.telegram.messenger.dd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new kq0(au0Var, storyItem3));
                                                    alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), new au(24));
                                                    x1Var.show();
                                                    x1Var.i();
                                                    return;
                                                case 1:
                                                    au0Var.getClass();
                                                    au0Var.b1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f20032id))), false);
                                                    return;
                                                case 2:
                                                    au0Var.getClass();
                                                    au0Var.b1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f20032id))), true);
                                                    return;
                                                default:
                                                    au0.h(au0Var, storyItem3);
                                                    return;
                                            }
                                        }
                                    }, false);
                                }
                            }
                            I.c(2131232050, org.telegram.messenger.dd.L0(2131744815, null), new Runnable() {
                                @Override
                                public final void run() {
                                    int i14 = r1;
                                    TL_stories.StoryItem storyItem3 = storyItem;
                                    au0 au0Var = this;
                                    switch (i14) {
                                        case 0:
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, au0Var.getContext(), au0Var.H1);
                                            String L0 = org.telegram.messenger.dd.L0(2131751488, null);
                                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                                            x1Var.R = L0;
                                            x1Var.T = org.telegram.messenger.dd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new kq0(au0Var, storyItem3));
                                            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), new au(24));
                                            x1Var.show();
                                            x1Var.i();
                                            return;
                                        case 1:
                                            au0Var.getClass();
                                            au0Var.b1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f20032id))), false);
                                            return;
                                        case 2:
                                            au0Var.getClass();
                                            au0Var.b1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f20032id))), true);
                                            return;
                                        default:
                                            au0.h(au0Var, storyItem3);
                                            return;
                                    }
                                }
                            }, false);
                        }
                        I.c(2131232107, org.telegram.messenger.dd.L0(2131751599, null), new Runnable() {
                            @Override
                            public final void run() {
                                int i14 = r1;
                                TL_stories.StoryItem storyItem3 = storyItem;
                                au0 au0Var = this;
                                switch (i14) {
                                    case 0:
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, au0Var.getContext(), au0Var.H1);
                                        String L0 = org.telegram.messenger.dd.L0(2131751488, null);
                                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                                        x1Var.R = L0;
                                        x1Var.T = org.telegram.messenger.dd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new kq0(au0Var, storyItem3));
                                        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), new au(24));
                                        x1Var.show();
                                        x1Var.i();
                                        return;
                                    case 1:
                                        au0Var.getClass();
                                        au0Var.b1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f20032id))), false);
                                        return;
                                    case 2:
                                        au0Var.getClass();
                                        au0Var.b1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f20032id))), true);
                                        return;
                                    default:
                                        au0.h(au0Var, storyItem3);
                                        return;
                                }
                            }
                        }, true);
                        I.f33026i = 3;
                        I.f33046u = true;
                        I.v = true;
                        I.L = true;
                        I.M = 3;
                        Point point = org.telegram.messenger.i0.f16172q;
                        int min = Math.min((int) (Math.min(point.x, point.y) * 0.6777f), (int) (((Math.max(point.x, point.y) * 0.4333f) * 3.0f) / 4.0f));
                        I.N = min;
                        I.O = (min * 4) / 3;
                        I.f33045t = true;
                        I.P = true;
                        I.W = true;
                        I.Z();
                        return true;
                    }
                } else {
                    if (org.telegram.messenger.kj.B0(kjVar.f16690k) == j10) {
                        c10 = 0;
                    } else {
                        c10 = 1;
                    }
                    SparseArray[] sparseArrayArr = this.f24502b1;
                    sparseArrayArr[c10].put(kjVar.f1(), kjVar);
                    if (!kjVar.s(null, false)) {
                        this.f24506c1++;
                    }
                    if (this.f24506c1 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    this.f24538n0.setVisibility(i11);
                    org.telegram.ui.ActionBar.t0 t0Var = this.f24564w0;
                    if (t0Var != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i12 = 0;
                        } else {
                            i12 = 8;
                        }
                        t0Var.setVisibility(i12);
                    }
                    org.telegram.ui.ActionBar.t0 t0Var2 = this.f24561v0;
                    if (t0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i13 = 0;
                        }
                        t0Var2.setVisibility(i13);
                    }
                    k1(1, false);
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
                    this.f24509d1 = false;
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
                        m1(true);
                    }
                    M0(sparseArrayArr[0]);
                    C1();
                    return true;
                }
            }
        }
        return false;
    }

    public final void R() {
        char c10;
        char c11;
        float abs;
        View childAt;
        int R;
        float f7;
        float measuredWidth;
        ts0[] ts0VarArr = this.m0;
        ts0 ts0Var = ts0VarArr[0];
        if (ts0Var != null && ts0VarArr[1] != null) {
            float f10 = 0.0f;
            ar0 ar0Var = this.f24501b0;
            if (ar0Var != null) {
                if (y0(ts0Var.E) && ts0VarArr[0].E != 9) {
                    c10 = 1;
                } else {
                    c10 = 0;
                }
                if (ts0VarArr[1].getVisibility() == 0) {
                    if (y0(ts0VarArr[1].E) && ts0VarArr[1].E != 9) {
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
                        measuredWidth = ts0VarArr[0].getMeasuredWidth();
                    }
                    ar0Var.setTranslationX(measuredWidth);
                } else {
                    ar0Var.setTranslationX(ts0VarArr[c10 ^ 1].getTranslationX());
                    abs = 1.0f - (Math.abs(ar0Var.getTranslationX()) / ar0Var.getMeasuredWidth());
                }
                float f11 = 0.0f;
                for (int i10 = 0; i10 < ts0VarArr.length; i10++) {
                    if (ts0VarArr[i10].getVisibility() == 0) {
                        er0 er0Var = ts0VarArr[i10].h;
                        if (er0Var.getChildCount() == 0) {
                            childAt = null;
                        } else {
                            childAt = er0Var.getChildAt(0);
                        }
                        if (childAt == null) {
                            R = -1;
                        } else {
                            R = RecyclerView.R(childAt);
                        }
                        if (R == 0) {
                            f7 = childAt.getY() - er0Var.getPaddingTop();
                        } else if (er0Var.getChildCount() == 0) {
                            f7 = 0.0f;
                        } else {
                            f7 = -org.telegram.messenger.i0.L(48.0f);
                        }
                        f11 += Utilities.l(1.0f - (ts0VarArr[i10].getTranslationX() / ts0VarArr[i10].getMeasuredWidth())) * f7;
                    }
                }
                float l4 = Utilities.l(1.0f - ((-f11) / org.telegram.messenger.i0.N(48.0f)));
                float T1 = org.telegram.messenger.i0.T1(0.9f, 1.0f, l4);
                ar0Var.setAlpha(l4);
                ar0Var.setScaleX(T1);
                ar0Var.setScaleY(T1);
                ar0Var.setTranslationY(this.N1 + f11);
                f10 = abs;
            }
            T();
            if (this.X1 != f10) {
                this.X1 = f10;
                invalidate();
            }
        }
    }

    public boolean R0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return false;
    }

    public final boolean S() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.au0.S():boolean");
    }

    public final void S0(float f7) {
        ts0 ts0Var;
        int i10;
        int i11;
        ts0 ts0Var2;
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        ts0[] ts0VarArr = this.m0;
        if (i12 != 0 || ts0VarArr[1].getVisibility() == 0) {
            if (this.f24528j1) {
                ts0VarArr[0].setTranslationX((-f7) * ts0Var2.getMeasuredWidth());
                ts0VarArr[1].setTranslationX(ts0VarArr[0].getMeasuredWidth() - (ts0VarArr[0].getMeasuredWidth() * f7));
            } else {
                ts0VarArr[0].setTranslationX(ts0Var.getMeasuredWidth() * f7);
                ts0VarArr[1].setTranslationX((ts0VarArr[0].getMeasuredWidth() * f7) - ts0VarArr[0].getMeasuredWidth());
            }
            V0(getTabProgress());
            float j02 = j0(f7);
            this.f24551r0 = j02;
            int i13 = 4;
            if (j02 != 0.0f && H() && !z0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            this.f24557t0.setVisibility(i10);
            org.telegram.ui.ActionBar.t0 t0Var = this.f24544p0;
            if (t0Var != null && !H()) {
                if (F0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                setSearchItemVisibility(i11);
                this.f24547q0 = 0.0f;
            } else {
                this.f24547q0 = k0(f7);
                J1();
            }
            E1(false);
            if (i12 == 0) {
                ts0 ts0Var3 = ts0VarArr[0];
                ts0VarArr[0] = ts0VarArr[1];
                ts0VarArr[1] = ts0Var3;
                ts0Var3.setVisibility(8);
                if (t0Var != null && this.f24572z0 == 2) {
                    if (F0()) {
                        i13 = 8;
                    }
                    setSearchItemVisibility(i13);
                }
                this.f24572z0 = 0;
                q1();
            }
        }
    }

    public final void T() {
        zr zrVar = this.R0;
        if (zrVar != null) {
            zrVar.setTranslationY(this.N1);
        }
    }

    public final boolean U(boolean z10) {
        SparseArray[] sparseArrayArr;
        if (!this.E1) {
            return false;
        }
        int i10 = 1;
        while (true) {
            sparseArrayArr = this.f24502b1;
            if (i10 < 0) {
                break;
            }
            sparseArrayArr[i10].clear();
            i10--;
        }
        this.f24506c1 = 0;
        M0(sparseArrayArr[0]);
        vq0 vq0Var = this.W;
        if (vq0Var != null) {
            vq0Var.h();
            vq0Var.j();
        }
        m1(false);
        H1(z10);
        jt0 jt0Var = this.T;
        if (jt0Var != null) {
            jt0Var.f27571x.clear();
        }
        return true;
    }

    public void U0() {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (!F0() && !z0()) {
            z10 = false;
        } else {
            z10 = true;
        }
        vt0 vt0Var = this.f24518g0.f32637x;
        if (vt0Var != null) {
            if (z10 && getClosestTab() == 9) {
                z13 = true;
            } else {
                z13 = false;
            }
            vt0Var.b(z13);
        }
        vt0 vt0Var2 = this.f24511e0.f32637x;
        if (vt0Var2 != null) {
            if (z10 && getClosestTab() == 8) {
                z12 = true;
            } else {
                z12 = false;
            }
            vt0Var2.b(z12);
        }
        for (zt0 zt0Var : this.f24534l2.values()) {
            yt0 yt0Var = zt0Var.f33224c;
            if (yt0Var.f32635s != null) {
                vt0 vt0Var3 = yt0Var.f32637x;
                if (z10 && getClosestTab() == zt0Var.f33222a) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                vt0Var3.b(z11);
            }
        }
        org.telegram.ui.ActionBar.t0 t0Var = this.f24544p0;
        if (t0Var != null) {
            sr0 sr0Var = this.L0;
            if (sr0Var != null && sr0Var.a() && getSelectedTab() == 11) {
                i10 = 2131745885;
            } else {
                i10 = 2131745853;
            }
            t0Var.setSearchFieldHint(org.telegram.messenger.dd.L0(i10, null));
        }
        R();
        Q(true, true);
    }

    public final org.telegram.ui.ActionBar.t0 V(Context context, int i10, int i11, String str) {
        org.telegram.ui.ActionBar.t0 t0Var;
        org.telegram.ui.ActionBar.i5 i5Var = this.H;
        if (i5Var != null) {
            t0Var = i5Var.l().b(i10, i11);
        } else {
            int i12 = org.telegram.ui.ActionBar.t6.f21333z8;
            int r02 = r0(i12);
            int i13 = org.telegram.ui.ActionBar.t6.f21314y8;
            org.telegram.ui.ActionBar.t0 t0Var2 = new org.telegram.ui.ActionBar.t0(context, null, r02, r0(i13), false, null);
            t0Var2.setIcon(i11);
            t0Var2.setDuplicateParentStateEnabled(false);
            this.D0.addView(t0Var2, new LinearLayout.LayoutParams(org.telegram.messenger.i0.L(54.0f), -1));
            this.P0.add(t0Var2);
            fi0 iconView = t0Var2.getIconView();
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

    public void V0(float f7) {
        N0();
    }

    public final void W0(org.telegram.ui.ActionBar.k2 k2Var, long j10, int i10) {
        new org.telegram.ui.r31(k2Var, j10, this.f24542o1[1], new zb(this, j10, i10)).show();
    }

    public boolean X() {
        return this instanceof g30;
    }

    public final void X0(org.telegram.ui.ActionBar.k2 k2Var, long j10, int i10) {
        s4.u0(k2Var, org.telegram.messenger.dd.L0(2131751599, null), org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131744813, getStoriesController().w(i10, j10))), org.telegram.messenger.dd.L0(2131751599, null), true, new org.telegram.messenger.ed(this, j10, i10, 6));
    }

    public final boolean Y(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x10 = (-view.getX()) - getX();
        ts0[] ts0VarArr = this.m0;
        motionEvent.offsetLocation(x10 - ts0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - ts0VarArr[0].getY()) - ts0VarArr[0].h.getFastScroll().getY());
        return ts0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public final void Y0(org.telegram.ui.ActionBar.k2 k2Var, long j10, int i10) {
        String w9 = getStoriesController().w(i10, j10);
        Context context = k2Var.getContext();
        org.telegram.ui.ActionBar.p6 resourceProvider = k2Var.getResourceProvider();
        j2.d dVar = new j2.d(this, j10, i10, 6);
        Pattern pattern = s4.f30174a;
        s4.Q(context, k2Var, org.telegram.messenger.dd.L0(2131744800, null), org.telegram.messenger.dd.L0(2131744799, null), org.telegram.messenger.dd.L0(2131744798, null), w9, 12, org.telegram.messenger.dd.L0(2131746293, null), resourceProvider, dVar);
    }

    public final boolean Z(int i10) {
        pt0[] pt0VarArr = this.f24565w1.f30444n;
        if (pt0VarArr == null) {
            return false;
        }
        pt0[] pt0VarArr2 = this.f24562v1;
        if (i10 == 0) {
            pt0 pt0Var = pt0VarArr2[i10];
            if (!pt0Var.h) {
                int[] iArr = pt0Var.f29535f;
                int[] iArr2 = pt0VarArr[i10].f29535f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = pt0VarArr2[i10].f29535f;
            int[] iArr4 = pt0VarArr[i10].f29535f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        pt0VarArr2[i10].f29532a.addAll(pt0VarArr[i10].f29532a);
        pt0VarArr2[i10].f29534c.addAll(pt0VarArr[i10].f29534c);
        for (Map.Entry entry : pt0VarArr[i10].d.entrySet()) {
            pt0VarArr2[i10].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i11 = 0; i11 < 2; i11++) {
            pt0VarArr2[i10].f29533b[i11] = pt0VarArr[i10].f29533b[i11].clone();
            pt0 pt0Var2 = pt0VarArr2[i10];
            int[] iArr5 = pt0Var2.f29538j;
            pt0 pt0Var3 = pt0VarArr[i10];
            iArr5[i11] = pt0Var3.f29538j[i11];
            pt0Var2.f29537i[i11] = pt0Var3.f29537i[i11];
        }
        pt0VarArr2[i10].e.addAll(pt0VarArr[i10].e);
        return !pt0VarArr[i10].f29532a.isEmpty();
    }

    public final void Z0(String str) {
        boolean I3 = org.telegram.messenger.i0.I3(str);
        org.telegram.ui.ActionBar.k2 k2Var = this.f24568x1;
        if (I3) {
            s4.p0(k2Var, str, true, true);
        } else {
            gf.f.r(k2Var.getParentActivity(), str);
        }
    }

    public final boolean a0(int r28, org.telegram.ui.Components.xs0 r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.au0.a0(int, org.telegram.ui.Components.xs0):boolean");
    }

    public int a1() {
        return -1;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.zi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.xi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.yi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21331z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.pj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.wi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21312y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21096m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21031ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20931d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21297x7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21279w7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21066kd));
    }

    public final void b0(int i10, uk0 uk0Var, boolean z10) {
        ArrayList arrayList = this.f24562v1[i10].e;
        int L0 = ((s4.a0) uk0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            ys0 ys0Var = null;
            if (arrayList != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    } else if (L0 <= ((ys0) arrayList.get(i11)).f32902b) {
                        ys0Var = (ys0) arrayList.get(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                if (ys0Var == null) {
                    ys0Var = (ys0) i0.a.g(1, arrayList);
                }
            }
            if (ys0Var != null) {
                I0(i10, ys0Var.d, ys0Var.f32902b + 1, z10);
            }
        }
    }

    public final void b1(ArrayList arrayList, boolean z10) {
        boolean z11;
        boolean z12;
        is0 is0Var = this.f24511e0;
        if (is0Var != null && is0Var.f32635s != null) {
            org.telegram.ui.ActionBar.k2 k2Var = this.f24568x1;
            if (z10 && arrayList.size() > k2Var.getMessagesController().O5) {
                org.telegram.messenger.a30.s(org.telegram.messenger.dd.G(k2Var.getMessagesController().O5, "StoriesPinLimit", new Object[0]), cc.a0(k2Var), 2131623981, 36);
                return;
            }
            th.x4 x4Var = is0Var.f32635s;
            int i10 = x4Var.f49647c;
            ArrayList arrayList2 = x4Var.f49649g;
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
            if (arrayList3.size() > org.telegram.messenger.wp.r1(i10).O5) {
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
                    tL_togglePinnedToTop.f20045id.addAll(arrayList2);
                    tL_togglePinnedToTop.peer = org.telegram.messenger.wp.r1(i10).i1(x4Var.d);
                    ConnectionsManager.getInstance(i10).sendRequest(tL_togglePinnedToTop, new ag.c3(26));
                }
                z13 = z11;
            }
            if (z13) {
                org.telegram.messenger.a30.s(org.telegram.messenger.dd.G(k2Var.getMessagesController().O5, "StoriesPinLimit", new Object[0]), cc.a0(k2Var), 2131623981, 36);
            } else if (z10) {
                cc.a0(k2Var).I(2131624053, org.telegram.messenger.i0.W2(org.telegram.messenger.dd.G(arrayList.size(), "StoriesPinned", new Object[0])), org.telegram.messenger.dd.G(arrayList.size(), "StoriesPinnedText", new Object[0])).j();
            } else {
                org.telegram.messenger.a30.s(org.telegram.messenger.dd.G(arrayList.size(), "StoriesUnpinned", new Object[0]), cc.a0(k2Var), 2131624059, 36);
            }
        }
    }

    public final void c0() {
        ts0[] ts0VarArr;
        ts0 ts0Var;
        boolean z10;
        int i10;
        s4.g0 adapter;
        if (this.f24548q1) {
            int i11 = 0;
            while (true) {
                ts0VarArr = this.m0;
                if (i11 < ts0VarArr.length) {
                    ts0Var = ts0VarArr[i11];
                    if (ts0Var.E == this.f24552r1) {
                        break;
                    }
                    i11++;
                } else {
                    ts0Var = null;
                    break;
                }
            }
            if (ts0Var != null) {
                boolean y02 = y0(ts0Var.E);
                float f7 = this.f24545p1;
                float f10 = 1.0f;
                int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                pt0[] pt0VarArr = this.f24562v1;
                if (i12 == 0) {
                    this.f24548q1 = false;
                    int i13 = this.f24556s1;
                    int[] iArr = this.f24542o1;
                    iArr[y02 ? 1 : 0] = i13;
                    if (!y02) {
                        org.telegram.messenger.uz.B(i13);
                    } else if (l0(ts0Var.E) >= 5) {
                        org.telegram.messenger.uz.F(this.f24556s1);
                    }
                    for (int i14 = 0; i14 < ts0VarArr.length; i14++) {
                        ts0 ts0Var2 = ts0VarArr[i14];
                        if (ts0Var2 != null && ts0Var2.h != null && (((i10 = ts0Var2.E) == 0 || y0(i10)) && (adapter = ts0VarArr[i14].h.getAdapter()) != null)) {
                            int b10 = adapter.b();
                            if (i14 == 0) {
                                pt0VarArr[0].g(false);
                            }
                            ts0VarArr[i14].f30719n.setVisibility(8);
                            ts0VarArr[i14].f30723x.y1(iArr[y02 ? 1 : 0]);
                            ts0VarArr[i14].h.a0();
                            ts0VarArr[i14].h.invalidate();
                            if (adapter.b() == b10) {
                                org.telegram.messenger.i0.a4(ts0VarArr[i14].h);
                            } else {
                                adapter.f();
                            }
                        }
                    }
                    if (this.f24554s >= 0) {
                        for (int i15 = 0; i15 < ts0VarArr.length; i15++) {
                            ts0 ts0Var3 = ts0VarArr[i15];
                            if (ts0Var3.E == this.f24552r1) {
                                View m10 = ts0Var3.f30720r.m(this.f24554s);
                                if (m10 != null) {
                                    this.f24563w = m10.getTop();
                                }
                                ts0 ts0Var4 = ts0VarArr[i15];
                                ts0Var4.f30723x.h1(this.f24554s, (-ts0Var4.h.getPaddingTop()) + this.f24563w);
                            }
                        }
                        return;
                    }
                    f1();
                } else if (f7 == 0.0f) {
                    this.f24548q1 = false;
                    if (this.f24552r1 == 0) {
                        pt0VarArr[0].g(false);
                    }
                    ts0Var.f30719n.setVisibility(8);
                    ts0Var.h.invalidate();
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
                    ofFloat.addUpdateListener(new ur0(this, ts0Var, 0));
                    ofFloat.addListener(new org.telegram.ui.dj(this, z10, y02 ? 1 : 0, ts0Var));
                    ofFloat.setInterpolator(gr.f26523f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                }
            }
        }
    }

    public final boolean c1(MotionEvent motionEvent, boolean z10) {
        int i10;
        ts0 ts0Var;
        vq0 vq0Var;
        int i11;
        int i12;
        int closestTab = getClosestTab();
        vr0 vr0Var = this.K0;
        SparseIntArray sparseIntArray = vr0Var.O;
        int i13 = vr0Var.f24182n;
        int i14 = -1;
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i15 = sparseIntArray.get(i13 + i10, -1);
        ar0 ar0Var = this.f24501b0;
        if (ar0Var != null) {
            if (!G0(closestTab) && closestTab != 8) {
                if (G0(i15) || i15 == 8) {
                    i14 = ar0Var.getCurrentAlbumId();
                }
            } else {
                w71 w71Var = ar0Var.f43748b;
                SparseIntArray sparseIntArray2 = w71Var.f32141b0;
                int i16 = w71Var.F;
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
                i15 = t1(i14).f33222a;
            }
        }
        if (i15 >= 0) {
            if (this.f24544p0 != null && !H()) {
                if (F0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                setSearchItemVisibility(i11);
                this.f24547q0 = 0.0f;
            } else {
                this.f24547q0 = k0(0.0f);
                I1(0.0f);
            }
            if ((!this.X0 || getSelectedTab() != 11) && (!G() || !this.E1 || (getClosestTab() != 8 && !G0(getClosestTab())))) {
                ts0[] ts0VarArr = this.m0;
                ts0 ts0Var2 = ts0VarArr[0];
                if (ts0Var2 != null && ts0Var2.E == 13 && (vq0Var = this.W) != null) {
                    org.telegram.ui.wy0 wy0Var = vq0Var.f50277n;
                    if (!z10) {
                    }
                }
                ts0 ts0Var3 = ts0VarArr[0];
                wq0 wq0Var = this.f24498a0;
                if (ts0Var3 != null && ts0Var3.E == 14 && wq0Var != null) {
                    org.telegram.ui.wy0 wy0Var2 = wq0Var.h;
                    if (!z10) {
                    }
                }
                if ((!this.E1 || (ts0Var = ts0VarArr[0]) == null || ts0Var.E != 13) && ((wq0Var == null || !wq0Var.g()) && (ar0Var == null || !ar0Var.f43750f))) {
                    E1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    v0();
                    this.A1 = false;
                    this.f24573z1 = true;
                    this.B1 = (int) motionEvent.getX();
                    setHeaderEnabled(false);
                    vr0Var.setEnabled(false);
                    ts0 ts0Var4 = ts0VarArr[1];
                    ts0Var4.E = i15;
                    ts0Var4.setVisibility(0);
                    this.f24528j1 = z10;
                    x1(true);
                    if (z10) {
                        ts0VarArr[1].setTranslationX(ts0VarArr[0].getMeasuredWidth());
                    } else {
                        ts0VarArr[1].setTranslationX(-ts0VarArr[0].getMeasuredWidth());
                    }
                    V0(getTabProgress());
                    return true;
                }
            }
        }
        return false;
    }

    public final void d0(int i10) {
        ((WindowManager) org.telegram.messenger.w0.f18945b.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i10 == 0) {
            if (!org.telegram.messenger.i0.Q1() && org.telegram.messenger.w0.f18945b.getResources().getConfiguration().orientation == 2) {
                this.C0.setTextSize(18);
            } else {
                this.C0.setTextSize(20);
            }
        }
        if (i10 == 0) {
            this.J.f();
        }
    }

    @Override
    public final void didReceivedNotification(int r42, int r43, java.lang.Object... r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.au0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        vr0 vr0Var = this.K0;
        if (vr0Var != null) {
            canvas.save();
            canvas.translate(vr0Var.getX(), vr0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        qr0 qr0Var = this.T0;
        if (qr0Var != null) {
            int i10 = qr0Var.U;
            if ((i10 == 3 || i10 == 1) && this.R0 == null) {
                canvas.save();
                canvas.translate(qr0Var.getX(), qr0Var.getY());
                qr0Var.setDrawOverlay(true);
                qr0Var.draw(canvas);
                qr0Var.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int i10;
        if (this.f24503b2 && (view instanceof ts0) && this.f24517f2 < this.f24510d2) {
            canvas.save();
            canvas.clipRect(0, -this.f24517f2, getWidth(), getHeight() + this.f24513e2);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        } else if (view == this.T0 && this.R0 == null) {
            canvas.save();
            ts0[] ts0VarArr = this.m0;
            float top = ts0VarArr[0].getTop();
            ar0 ar0Var = this.f24501b0;
            if (ar0Var != null && ((i10 = ts0VarArr[0].E) == 8 || G0(i10))) {
                top -= ar0Var.getVisualHeight();
            }
            canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + org.telegram.messenger.i0.L(12.0f));
            boolean drawChild2 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild2;
        } else {
            return super.drawChild(canvas, view, j10);
        }
    }

    public final String e0(boolean z10) {
        int i10;
        int i11;
        TLRPC.MessageMedia messageMedia;
        vq0 vq0Var;
        if (!A0()) {
            return org.telegram.messenger.dd.L0(2131753014, null);
        }
        if (z10 && (vq0Var = this.W) != null) {
            return vq0Var.getBotPreviewsSubtitle();
        }
        is0 is0Var = this.f24511e0;
        if (is0Var != null && is0Var.f32635s != null) {
            i10 = 0;
            i11 = 0;
            for (int i12 = 0; i12 < is0Var.f32635s.f49650i.size(); i12++) {
                org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) is0Var.f32635s.f49650i.get(i12);
                TL_stories.StoryItem storyItem = kjVar.f16694l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    if (org.telegram.messenger.kj.K4(messageMedia.document)) {
                        i11++;
                    } else if (kjVar.f16694l.media.photo != null) {
                        i10++;
                    }
                }
            }
        } else {
            i10 = 0;
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return org.telegram.messenger.dd.L0(2131753014, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (i10 > 0) {
            sb2.append(org.telegram.messenger.dd.G(i10, "Images", new Object[0]));
        }
        if (i11 > 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(org.telegram.messenger.dd.G(i11, "Videos", new Object[0]));
        }
        return sb2.toString();
    }

    public final void e1(s4.g0 g0Var) {
        if (g0Var instanceof ut0) {
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
            ht0 ht0Var = this.P;
            if (g0Var == ht0Var) {
                ht0Var.f26918r = null;
            }
        }
    }

    public final ts0 f0(int i10) {
        int i11 = 0;
        while (true) {
            ts0[] ts0VarArr = this.m0;
            if (i11 < ts0VarArr.length) {
                ts0 ts0Var = ts0VarArr[i11];
                if (ts0Var != null && ts0Var.E == i10) {
                    return ts0Var;
                }
                i11++;
            } else {
                return null;
            }
        }
    }

    public final void f1() {
        int i10;
        int i11 = 0;
        while (true) {
            ts0[] ts0VarArr = this.m0;
            if (i11 < ts0VarArr.length) {
                er0 er0Var = ts0VarArr[i11].h;
                if (er0Var != null) {
                    int i12 = 0;
                    int i13 = 0;
                    for (int i14 = 0; i14 < er0Var.getChildCount(); i14++) {
                        View childAt = er0Var.getChildAt(i14);
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
                        int i15 = ts0VarArr[i11].E;
                        int i16 = -1;
                        if (y0(i15)) {
                            xt0 v12 = v1(i15);
                            if (v12 != null && v12.f32635s != null) {
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= v12.f32635s.f49650i.size()) {
                                        break;
                                    } else if (i12 == ((org.telegram.messenger.kj) v12.f32635s.f49650i.get(i17)).f1()) {
                                        i16 = i17;
                                        break;
                                    } else {
                                        i17++;
                                    }
                                }
                            }
                            i10 = i16;
                        } else if (i15 >= 0) {
                            pt0[] pt0VarArr = this.f24562v1;
                            if (i15 < pt0VarArr.length) {
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= pt0VarArr[i15].f29532a.size()) {
                                        break;
                                    } else if (i12 == ((org.telegram.messenger.kj) pt0VarArr[i15].f29532a.get(i18)).f1()) {
                                        i16 = i18;
                                        break;
                                    } else {
                                        i18++;
                                    }
                                }
                                i10 = pt0VarArr[i15].f29541m + i16;
                            }
                        }
                        if (i16 >= 0) {
                            ((s4.a0) er0Var.getLayoutManager()).h1(i10, (-ts0VarArr[i11].h.getPaddingTop()) + i13);
                            if (this.f24548q1) {
                                ts0 ts0Var = ts0VarArr[i11];
                                ts0Var.f30720r.h1(i10, (-ts0Var.h.getPaddingTop()) + i13);
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

    public final int g0(int i10, int i11, boolean z10) {
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
        return Utilities.j(i14, 9, (this.f24535m1 && i10 == 1) ? 2 : 2);
    }

    public final void g1(int i10) {
        vr0 vr0Var;
        if (!this.O1 && (vr0Var = this.K0) != null) {
            vr0Var.g(null, i10, vr0Var.P.get(i10));
        }
    }

    public SparseArray<org.telegram.messenger.kj> getActionModeSelected() {
        return this.f24502b1[0];
    }

    public float getBottomButtonStoriesVisibility() {
        ts0 ts0Var;
        ts0 ts0Var2;
        boolean z10;
        boolean z11;
        th.x4 x4Var;
        th.x4 x4Var2;
        float f7 = 1.0f;
        ts0[] ts0VarArr = this.m0;
        if (ts0VarArr == null || (ts0Var = ts0VarArr[0]) == null || (ts0Var2 = ts0VarArr[1]) == null || ts0Var.f30722w == null || ts0Var2.f30722w == null) {
            return 1.0f;
        }
        int i10 = ts0Var.E;
        int i11 = ts0Var2.E;
        if (!G0(i10) && i10 != 8) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!G0(i11) && i11 != 8) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z10 && !z11) {
            return 1.0f;
        }
        float visibilityFactor = 1.0f - ts0VarArr[0].f30722w.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - ts0VarArr[1].f30722w.getVisibilityFactor();
        xt0 v12 = v1(ts0VarArr[0].E);
        if (i10 == 8 || (v12 != null && (x4Var2 = v12.f32635s) != null && x4Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        xt0 v13 = v1(i11);
        if (i11 != 8 && (v13 == null || (x4Var = v13.f32635s) == null || x4Var.g() <= 0)) {
            f7 = visibilityFactor2;
        }
        if (!z10) {
            visibilityFactor = f7;
        }
        if (!z11) {
            f7 = visibilityFactor;
        }
        return org.telegram.messenger.i0.T1(visibilityFactor, f7, Math.abs(ts0VarArr[0].getTranslationX() / ts0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        ts0[] ts0VarArr = this.m0;
        ts0 ts0Var = ts0VarArr[1];
        if (ts0Var != null && ts0Var.getVisibility() == 0) {
            if (this.f24525i1 && !this.f24531k1) {
                return ts0VarArr[1].E;
            }
            if (Math.abs(ts0VarArr[1].getTranslationX()) < ts0VarArr[1].getMeasuredWidth() / 2.0f) {
                return ts0VarArr[1].E;
            }
        }
        return getSelectedTab();
    }

    public uk0 getCurrentListView() {
        gs0 gs0Var;
        ts0 ts0Var = this.m0[0];
        int i10 = ts0Var.E;
        if (i10 == 13) {
            return this.W.getCurrentListView();
        }
        if (i10 == 14) {
            return this.f24498a0.getCurrentListView();
        }
        if (i10 == 12 && (gs0Var = this.V) != null) {
            return gs0Var.f43128a.f42303z0;
        }
        return ts0Var.h;
    }

    public int getInitialTab() {
        return 0;
    }

    public int getPhotosVideosTypeFilter() {
        return this.f24562v1[0].f29545q;
    }

    public TextView getSaveItem() {
        return this.f24555s0;
    }

    public org.telegram.ui.ActionBar.t0 getSearchItem() {
        return this.f24544p0;
    }

    public fi0 getSearchOptionsItem() {
        return this.f24559u0;
    }

    public int getSelectedTab() {
        int currentTabId = this.K0.getCurrentTabId();
        ar0 ar0Var = this.f24501b0;
        if (ar0Var != null && currentTabId == 8) {
            int currentAlbumId = ar0Var.getCurrentAlbumId();
            if (currentAlbumId == 0) {
                return 8;
            }
            if (currentAlbumId > 0) {
                return t1(currentAlbumId).f33222a;
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
            ts0[] ts0VarArr = this.m0;
            if (i10 < ts0VarArr.length) {
                ts0 ts0Var = ts0VarArr[i10];
                if (ts0Var != null) {
                    f7 = ((1.0f - Math.abs(ts0Var.getTranslationX() / getWidth())) * ts0Var.E) + f7;
                }
                i10++;
            } else {
                return f7;
            }
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.c7> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.c7> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.C0, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21331z6));
        int i10 = org.telegram.ui.ActionBar.t6.f21333z8;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f24538n0, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        org.telegram.ui.ActionBar.t0 t0Var = this.f24564w0;
        if (t0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        }
        org.telegram.ui.ActionBar.t0 t0Var2 = this.f24561v0;
        if (t0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        }
        Drawable[] drawableArr = {this.F0};
        int i11 = org.telegram.ui.ActionBar.t6.f21314y8;
        ImageView imageView = this.E0;
        arrayList.add(new org.telegram.ui.ActionBar.c7(imageView, 8, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.D0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20930d6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.K0, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.ui));
        vr0 vr0Var = this.K0;
        arrayList.add(new org.telegram.ui.ActionBar.c7(vr0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.c7(vr0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.si));
        arrayList.add(new org.telegram.ui.ActionBar.c7(vr0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.vi));
        qr0 qr0Var = this.T0;
        if (qr0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.c7(qr0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21261v7));
            arrayList.add(new org.telegram.ui.ActionBar.c7(qr0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21244u7));
            arrayList.add(new org.telegram.ui.ActionBar.c7(qr0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21313y7));
            arrayList.add(new org.telegram.ui.ActionBar.c7(qr0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.A7));
        }
        final int i12 = 0;
        while (true) {
            ts0[] ts0VarArr = this.m0;
            if (i12 < ts0VarArr.length) {
                org.telegram.ui.ActionBar.b7 b7Var = new org.telegram.ui.ActionBar.b7() {
                    @Override
                    public final void b() {
                        ts0[] ts0VarArr2 = au0.this.m0;
                        int i13 = i12;
                        er0 er0Var = ts0VarArr2[i13].h;
                        if (er0Var != null) {
                            int childCount = er0Var.getChildCount();
                            for (int i14 = 0; i14 < childCount; i14++) {
                                View childAt = ts0VarArr2[i13].h.getChildAt(i14);
                                if (childAt instanceof org.telegram.ui.Cells.t7) {
                                    org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) childAt;
                                    for (int i15 = 0; i15 < 6; i15++) {
                                        t7Var.f23093a[i15].e.invalidate();
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
                arrayList.add(new org.telegram.ui.ActionBar.c7(ts0VarArr[i12].h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21207s8));
                arrayList.add(new org.telegram.ui.ActionBar.c7(ts0VarArr[i12].h, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21021i6));
                arrayList.add(new org.telegram.ui.ActionBar.c7(ts0VarArr[i12].f30722w, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20912c7));
                int i13 = org.telegram.ui.ActionBar.t6.f21003h6;
                arrayList.add(new org.telegram.ui.ActionBar.c7(ts0VarArr[i12].h, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i13));
                arrayList.add(new org.telegram.ui.ActionBar.c7(ts0VarArr[i12].h, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.t6.f21116n6));
                arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.t6.O7));
                arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.t6.P7));
                arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.t6.Q7));
                arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.t6.R7));
                arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.t6.S7));
                arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.t6.T7));
                arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.t6.U7));
                int i14 = org.telegram.ui.ActionBar.t6.f21022i7;
                arrayList.add(new org.telegram.ui.ActionBar.c7(ts0VarArr[i12].h, 8192, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i14));
                int i15 = org.telegram.ui.ActionBar.t6.f21060k7;
                arrayList.add(new org.telegram.ui.ActionBar.c7(ts0VarArr[i12].h, 16384, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.c7(ts0VarArr[i12].h, 8, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.nj));
                arrayList.add(new org.telegram.ui.ActionBar.c7(ts0VarArr[i12].h, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i13));
                arrayList.add(new org.telegram.ui.ActionBar.c7(ts0VarArr[i12].h, 8192, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.c7(ts0VarArr[i12].h, 16384, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.c7(ts0VarArr[i12].h, 8192, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.c7(ts0VarArr[i12].h, 16384, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.c7(ts0VarArr[i12].h, 8192, new Class[]{org.telegram.ui.Cells.t7.class}, (Paint) null, (Drawable[]) null, b7Var, i14));
                arrayList.add(new org.telegram.ui.ActionBar.c7(ts0VarArr[i12].h, 16384, new Class[]{org.telegram.ui.Cells.t7.class}, (Paint) null, (Drawable[]) null, b7Var, i15));
                arrayList.add(new org.telegram.ui.ActionBar.c7(ts0VarArr[i12].h, 0, new Class[]{org.telegram.ui.Cells.h2.class}, new String[]{"backgroundPaint"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.zi));
                arrayList.add(new org.telegram.ui.ActionBar.c7(ts0VarArr[i12].h, 8192, new Class[]{org.telegram.ui.Cells.h2.class}, (Paint) null, (Drawable[]) null, b7Var, i14));
                arrayList.add(new org.telegram.ui.ActionBar.c7(ts0VarArr[i12].h, 16384, new Class[]{org.telegram.ui.Cells.h2.class}, (Paint) null, (Drawable[]) null, b7Var, i15));
                arrayList.add(new org.telegram.ui.ActionBar.c7(ts0VarArr[i12].h, 0, (Class[]) null, (Paint) null, new Drawable[]{this.A0}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20893b7));
                arrayList.add(new org.telegram.ui.ActionBar.c7(ts0VarArr[i12].f30722w.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.c7(ts0VarArr[i12].f30722w.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21312y6));
                i12++;
            } else {
                return arrayList;
            }
        }
    }

    public int getTopPanelShift() {
        return this.f24543o2;
    }

    public final int h0(boolean z10) {
        int i10;
        int i11 = this.a2 + this.f24513e2;
        if (z10) {
            i10 = org.telegram.messenger.i0.L(52.0f);
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    public final void h1(float f7, int i10) {
        int i11;
        vr0 vr0Var = this.K0;
        if (vr0Var != null) {
            if (G0(i10)) {
                i11 = 8;
            } else {
                i11 = i10;
            }
            vr0Var.i(f7, i11);
        }
        ar0 ar0Var = this.f24501b0;
        if (ar0Var != null) {
            w71 w71Var = ar0Var.f43748b;
            if (G0(i10)) {
                w71Var.f(f7, s1(i10));
            } else if (i10 == 8) {
                w71Var.f(f7, 0);
            }
        }
    }

    public final int i0(int i10) {
        int i11;
        int m0 = m0(i10) + org.telegram.messenger.i0.L(54.0f) + this.f24507c2 + this.f24510d2 + this.f24543o2;
        if (i10 == 9) {
            i11 = org.telegram.messenger.i0.L(64.0f);
        } else {
            i11 = 0;
        }
        return m0 + i11;
    }

    public final void i1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i10 = 0;
        while (true) {
            ts0[] ts0VarArr = this.m0;
            if (i10 < ts0VarArr.length) {
                ts0 ts0Var = ts0VarArr[i10];
                if (ts0Var.E != 7 || ts0Var.h.getAdapter() == null || ts0VarArr[i10].h.getAdapter().b() == 0 || this.f24568x1.getMessagesController().O1().f48924j.size() <= 0) {
                    i10++;
                } else {
                    return;
                }
            } else {
                if (this.F == 0) {
                    ls0 ls0Var = this.f24505c0;
                    ls0Var.d = chatFull;
                    ls0Var.e = arrayList;
                }
                L1(true);
                for (int i11 = 0; i11 < ts0VarArr.length; i11++) {
                    ts0 ts0Var2 = ts0VarArr[i11];
                    if (ts0Var2.E == 7 && ts0Var2.h.getAdapter() != null) {
                        org.telegram.messenger.i0.r2(ts0VarArr[i11].h);
                    }
                }
                return;
            }
        }
    }

    public final float j0(float f7) {
        float f10 = 0.0f;
        if (z0()) {
            return 0.0f;
        }
        ts0[] ts0VarArr = this.m0;
        ts0 ts0Var = ts0VarArr[1];
        if (ts0Var != null && u0(ts0Var.E)) {
            f10 = 0.0f + f7;
        }
        ts0 ts0Var2 = ts0VarArr[0];
        if (ts0Var2 != null && u0(ts0Var2.E)) {
            return (1.0f - f7) + f10;
        }
        return f10;
    }

    public final void j1(int i10, int i11, int i12, int i13) {
        ts0[] ts0VarArr;
        boolean z10;
        boolean z11 = true;
        this.f24503b2 = true;
        this.f24507c2 = i10;
        this.f24510d2 = i11;
        this.f24513e2 = i12;
        this.a2 = i13;
        F();
        wq0 wq0Var = this.f24498a0;
        if (wq0Var != null) {
            if (wq0Var.L != i11 || wq0Var.M != i12) {
                wq0Var.L = i11;
                wq0Var.M = i12;
                if (i11 == 0 && i12 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                wq0Var.setClipChildren(z10);
                wq0Var.h.setClipChildren((i11 == 0 && i12 == 0) ? false : false);
                wq0Var.n();
            }
            D1();
        }
        for (ts0 ts0Var : this.m0) {
            if (ts0Var != null) {
                ts0Var.setClipChildren(false);
                F1(ts0Var);
                setPageOverscan(ts0Var.h);
                setPageOverscan(ts0Var.f30719n);
                int paddingTop = ts0Var.h.getPaddingTop();
                er0 er0Var = ts0Var.h;
                int paddingLeft = er0Var.getPaddingLeft();
                er0 er0Var2 = ts0Var.h;
                int i02 = i0(ts0Var.E);
                er0Var2.f30437g3 = i02;
                int paddingRight = ts0Var.h.getPaddingRight();
                er0 er0Var3 = ts0Var.h;
                int h02 = h0(F0());
                er0Var3.f30438h3 = h02;
                er0Var.setPadding(paddingLeft, i02, paddingRight, h02);
                int paddingTop2 = paddingTop - ts0Var.h.getPaddingTop();
                if (paddingTop2 != 0) {
                    org.telegram.messenger.i0.J(ts0Var.h, new eq0(ts0Var, paddingTop2, 1));
                }
                ts0Var.f30722w.setPadding(0, i10, 0, i13);
                gs0 gs0Var = this.V;
                if (gs0Var != null && gs0Var.getParent() == ts0Var) {
                    l1(org.telegram.messenger.i0.L(56.0f) + i10, gs0Var);
                }
                vq0 vq0Var = this.W;
                if (vq0Var != null && vq0Var.getParent() == ts0Var) {
                    l1(i10, vq0Var);
                }
            }
        }
        setClipChildren(false);
        requestLayout();
        invalidate();
    }

    public final float k0(float f7) {
        float f10 = 0.0f;
        if (z0()) {
            return 0.0f;
        }
        ts0[] ts0VarArr = this.m0;
        ts0 ts0Var = ts0VarArr[1];
        if (ts0Var != null && C0(ts0Var.E) && ts0VarArr[1].E != 11) {
            f10 = 0.0f + f7;
        }
        ts0 ts0Var2 = ts0VarArr[0];
        if (ts0Var2 != null && C0(ts0Var2.E) && ts0VarArr[0].E != 11) {
            return (1.0f - f7) + f10;
        }
        return f10;
    }

    public final void k1(int i10, boolean z10) {
        this.C0.a(i10, z10);
        org.telegram.ui.ActionBar.i5 i5Var = this.H;
        if (i5Var != null) {
            i5Var.y(i10, z10);
        }
    }

    public final int l0(int i10) {
        xt0 v12;
        th.x4 x4Var;
        if (y0(i10) && (v12 = v1(i10)) != null && (x4Var = v12.f32635s) != null) {
            return x4Var.g();
        }
        return 0;
    }

    @Override
    public final boolean m() {
        return false;
    }

    public final int m0(int i10) {
        float f7;
        ar0 ar0Var = this.f24501b0;
        if (ar0Var != null && (G0(i10) || i10 == 8)) {
            f7 = ar0Var.getVisibilityFactor() * org.telegram.messenger.i0.L(40.0f);
        } else {
            f7 = 0.0f;
        }
        return (int) f7;
    }

    public void m1(boolean z10) {
        float f7;
        if (this.E1 != z10) {
            this.E1 = z10;
            org.telegram.ui.ActionBar.i5 i5Var = this.H;
            if (i5Var != null) {
                if (z10) {
                    K1();
                    i5Var.C();
                } else {
                    i5Var.r();
                }
                Q(true, true);
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
                K1();
            }
        }
    }

    public final void n1(int r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.au0.n1(int, boolean):void");
    }

    public final void o1(int i10) {
        int s12 = s1(getClosestTab());
        ar0 ar0Var = this.f24501b0;
        if (s12 != i10) {
            if (ar0Var != null) {
                ar0Var.f43748b.d(i10, ar0Var.d.i(i10));
                return;
            }
            return;
        }
        ar0Var.setReorderingAlbums(true);
        zt0 t12 = t1(i10);
        ts0 f02 = f0(t12.f33222a);
        if (f02 == null) {
            return;
        }
        er0 er0Var = f02.h;
        for (int i11 = 0; i11 < er0Var.getChildCount(); i11++) {
            View childAt = er0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.s7) {
                ((org.telegram.ui.Cells.s7) childAt).l(true, true);
            }
        }
        yt0 yt0Var = t12.f33224c;
        if (yt0Var != null && !yt0Var.f32638y) {
            yt0Var.f32638y = true;
        }
        E1(true);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i10 = 0;
        while (true) {
            ts0[] ts0VarArr = this.m0;
            if (i10 < ts0VarArr.length) {
                er0 er0Var = ts0VarArr[i10].h;
                if (er0Var != null) {
                    er0Var.getViewTreeObserver().addOnPreDrawListener(new bs0(this, i10, 0));
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!S() && !this.K0.H && !onTouchEvent(motionEvent)) {
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
        ns0 ns0Var = this.F1;
        if (ns0Var.f() != null) {
            i12 = ns0Var.f().getHeight();
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
            } else if (childAt instanceof ts0) {
                i13 = i10;
                measureChildWithMargins(childAt, i13, 0, View.MeasureSpec.makeMeasureSpec(i12, 1073741824), 0);
                er0 er0Var = ((ts0) childAt).h;
                er0Var.setPadding(0, er0Var.f30435e3, 0, er0Var.f30436f3);
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
            org.telegram.ui.ActionBar.k2 k2Var = this.f24568x1;
            if (k2Var.getParentLayout() != null && !((ActionBarLayout) k2Var.getParentLayout()).i() && !S() && !this.f24497a) {
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
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.f24573z1 && !this.A1) {
                    if (motionEvent.getY() >= org.telegram.messenger.i0.L(90.0f) + this.f24507c2) {
                        this.f24571y1 = motionEvent.getPointerId(0);
                        this.A1 = true;
                        this.B1 = (int) motionEvent.getX();
                        this.C1 = (int) motionEvent.getY();
                        this.D1.clear();
                        return this.f24573z1;
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f24571y1) {
                    int x10 = (int) (motionEvent.getX() - this.B1);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.C1);
                    boolean z13 = this.f24573z1;
                    ts0[] ts0VarArr = this.m0;
                    if (z13 && (((z10 = this.f24528j1) && x10 > 0) || (!z10 && x10 < 0))) {
                        if (x10 < 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!c1(motionEvent, z11)) {
                            this.A1 = true;
                            this.f24573z1 = false;
                            ts0VarArr[0].setTranslationX(0.0f);
                            ts0 ts0Var = ts0VarArr[1];
                            if (this.f24528j1) {
                                i11 = ts0VarArr[0].getMeasuredWidth();
                            } else {
                                i11 = -ts0VarArr[0].getMeasuredWidth();
                            }
                            ts0Var.setTranslationX(i11);
                            h1(0.0f, ts0VarArr[1].E);
                            V0(getTabProgress());
                        }
                    }
                    if (this.A1 && !this.f24573z1) {
                        if (Math.abs(x10) >= org.telegram.messenger.i0.a1(true, 0.3f) && Math.abs(x10) > abs) {
                            if (x10 < 0) {
                                z12 = true;
                            }
                            c1(motionEvent, z12);
                        }
                    } else if (this.f24573z1) {
                        ts0VarArr[0].setTranslationX(x10);
                        if (this.f24528j1) {
                            ts0VarArr[1].setTranslationX(ts0VarArr[0].getMeasuredWidth() + x10);
                        } else {
                            ts0VarArr[1].setTranslationX(x10 - ts0VarArr[0].getMeasuredWidth());
                        }
                        float abs2 = Math.abs(x10) / ts0VarArr[0].getMeasuredWidth();
                        if (!H()) {
                            this.f24547q0 = 0.0f;
                        } else {
                            this.f24547q0 = k0(abs2);
                            I1(abs2);
                            float j02 = j0(abs2);
                            this.f24551r0 = j02;
                            if (j02 != 0.0f && H() && !z0()) {
                                i10 = 0;
                            } else {
                                i10 = 4;
                            }
                            this.f24557t0.setVisibility(i10);
                        }
                        E1(false);
                        h1(abs2, ts0VarArr[1].E);
                        V0(getTabProgress());
                        U0();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f24571y1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    r1(motionEvent);
                }
                return this.f24573z1;
            }
        }
        return false;
    }

    public final float p0(int i10, boolean z10) {
        float width = getWidth();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ts0[] ts0VarArr = this.m0;
            if (i11 >= ts0VarArr.length) {
                break;
            }
            ts0 ts0Var = ts0VarArr[i11];
            if (ts0Var != null) {
                int i13 = ts0Var.E;
                if ((z10 && i10 == 8 && G0(i13)) || i13 == i10) {
                    i12++;
                    width = ts0VarArr[i11].getTranslationX();
                }
            }
            i11++;
        }
        if (i12 == 2) {
            return 0.0f;
        }
        return width;
    }

    public final void p1(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.au0.p1(boolean):void");
    }

    public final float q0(int i10, boolean z10) {
        float f7 = 0.0f;
        int i11 = 0;
        while (true) {
            ts0[] ts0VarArr = this.m0;
            if (i11 < ts0VarArr.length) {
                ts0 ts0Var = ts0VarArr[i11];
                if (ts0Var != null) {
                    int i12 = ts0Var.E;
                    if ((z10 && i10 == 8 && G0(i12)) || i12 == i10) {
                        f7 = (1.0f - Math.abs(ts0VarArr[i11].getTranslationX() / getWidth())) + f7;
                    }
                }
                i11++;
            } else {
                return f7;
            }
        }
    }

    public final void q1() {
        int i10 = 0;
        while (true) {
            ts0[] ts0VarArr = this.m0;
            if (i10 < ts0VarArr.length) {
                int childCount = ts0VarArr[i10].h.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = ts0VarArr[i10].h.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.h2) {
                        ImageReceiver photoImage = ((org.telegram.ui.Cells.h2) childAt).getPhotoImage();
                        if (i10 == 0) {
                            photoImage.f14409t0 = true;
                            photoImage.P0(false);
                        } else {
                            photoImage.f14409t0 = false;
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

    public final int r0(int i10) {
        org.telegram.ui.ActionBar.p6 p6Var = this.H1;
        if (p6Var != null) {
            return p6Var.h(i10);
        }
        return org.telegram.ui.ActionBar.t6.x0(null, i10, false);
    }

    public final void r1(MotionEvent motionEvent) {
        float f7;
        float f10;
        boolean z10;
        float measuredWidth;
        ts0 ts0Var;
        ts0 ts0Var2;
        int measuredWidth2;
        ts0 ts0Var3;
        ts0 ts0Var4;
        boolean z11;
        VelocityTracker velocityTracker = this.D1;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.U0);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f7 = this.D1.getXVelocity();
                f10 = this.D1.getYVelocity();
                if (!this.f24573z1 && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
                    if (f7 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c1(motionEvent, z11);
                }
            } else {
                f7 = 0.0f;
                f10 = 0.0f;
            }
            if (this.f24573z1) {
                ts0[] ts0VarArr = this.m0;
                float x10 = ts0VarArr[0].getX();
                this.f24522h1 = new AnimatorSet();
                if (Math.abs(x10) < ts0VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f24531k1 = z10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r60(this, 19));
                boolean z12 = this.f24531k1;
                Property property = View.TRANSLATION_X;
                if (z12) {
                    measuredWidth = Math.abs(x10);
                    if (this.f24528j1) {
                        this.f24522h1.playTogether(ObjectAnimator.ofFloat(ts0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(ts0VarArr[1], property, ts0Var4.getMeasuredWidth()), ofFloat);
                    } else {
                        this.f24522h1.playTogether(ObjectAnimator.ofFloat(ts0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(ts0VarArr[1], property, -ts0Var3.getMeasuredWidth()), ofFloat);
                    }
                } else {
                    measuredWidth = ts0VarArr[0].getMeasuredWidth() - Math.abs(x10);
                    if (this.f24528j1) {
                        this.f24522h1.playTogether(ObjectAnimator.ofFloat(ts0VarArr[0], property, -ts0Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(ts0VarArr[1], property, 0.0f), ofFloat);
                    } else {
                        this.f24522h1.playTogether(ObjectAnimator.ofFloat(ts0VarArr[0], property, ts0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(ts0VarArr[1], property, 0.0f), ofFloat);
                    }
                }
                this.f24522h1.setInterpolator(f24494t2);
                int measuredWidth3 = getMeasuredWidth();
                float f11 = measuredWidth3 / 2;
                float I = (org.telegram.messenger.i0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f11) + f11;
                float abs = Math.abs(f7);
                if (abs > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(I / abs) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                this.f24522h1.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                this.f24522h1.addListener(new yr0(this, 1));
                this.f24522h1.start();
                this.f24525i1 = true;
                this.f24573z1 = false;
                U0();
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

    public final boolean s0() {
        if (this.f24568x1.getConnectionsManager().getConnectionState() == 3) {
            return true;
        }
        return false;
    }

    public final int s1(int i10) {
        zt0 u12 = u1(i10);
        if (u12 == null) {
            return -1;
        }
        return u12.f33223b;
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        boolean z10;
        int i10;
        TLRPC.ChatFull chatFull2 = this.f24516f1;
        if (chatFull2 != null && chatFull2.stories_pinned_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f24516f1 = chatFull;
        if (chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.f24512e1 == 0) {
                this.f24512e1 = -j10;
                int i11 = 0;
                while (true) {
                    pt0[] pt0VarArr = this.f24562v1;
                    if (i11 >= pt0VarArr.length) {
                        break;
                    }
                    if (pt0VarArr[i11].f29533b[1].size() == 0) {
                        pt0 pt0Var = pt0VarArr[i11];
                        pt0Var.f29538j[1] = this.f24516f1.migrated_from_max_id;
                        pt0Var.f29537i[1] = false;
                    }
                    i11++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.f24516f1;
        if (chatFull3 != null && z10 != chatFull3.stories_pinned_available) {
            vr0 vr0Var = this.K0;
            if (vr0Var != null) {
                if (z0()) {
                    i10 = 9;
                } else {
                    i10 = 8;
                }
                vr0Var.setInitialTabId(i10);
            }
            L1(true);
            x1(false);
        }
    }

    public void setCommonGroupsCount(int i10) {
        if (this.F == 0) {
            this.Z0[6] = i10;
        }
        L1(true);
        M();
    }

    public void setForwardRestrictedHint(q30 q30Var) {
        this.G1 = q30Var;
    }

    public void setMergeDialogId(long j10) {
        this.f24512e1 = j10;
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
        L1(true);
        M();
        if (iArr2[0] >= 0) {
            J0(false);
        }
    }

    public void setOnTopPanelShiftChanged(Runnable runnable) {
        this.f24529j2 = runnable;
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.N1 = i11;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            ts0[] ts0VarArr = this.m0;
            if (i15 >= ts0VarArr.length) {
                break;
            }
            ts0VarArr[i15].setTranslationY(this.N1);
            i15++;
        }
        if (this.R0 != null) {
            T();
        } else {
            qr0 qr0Var = this.T0;
            if (qr0Var != null) {
                qr0Var.setTranslationY(org.telegram.messenger.i0.L(48.0f) + i11);
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
        ts0[] ts0VarArr;
        this.f24520g2 = rVar;
        wq0 wq0Var = this.f24498a0;
        if (wq0Var != null) {
            wq0Var.setGlassEngine(rVar);
        }
        for (ts0 ts0Var : this.m0) {
            if (ts0Var != null) {
                ts0Var.h.setCaptureSectionsDecoratorAllowed(true);
                rVar.b(ts0Var.h);
            }
        }
    }

    public void setPagesPaddingBottom(int i10) {
        if (this.a2 != i10) {
            this.a2 = i10;
            ts0[] ts0VarArr = this.m0;
            if (ts0VarArr != null) {
                for (ts0 ts0Var : ts0VarArr) {
                    if (ts0Var != null) {
                        er0 er0Var = ts0Var.h;
                        int paddingLeft = er0Var.getPaddingLeft();
                        er0 er0Var2 = ts0Var.h;
                        int i11 = er0Var2.f30435e3;
                        int paddingRight = er0Var2.getPaddingRight();
                        er0 er0Var3 = ts0Var.h;
                        int h02 = h0(F0());
                        er0Var3.f30438h3 = h02;
                        er0Var.setPadding(paddingLeft, i11, paddingRight, h02);
                    }
                }
            }
        }
    }

    public void setPagesVisibleOverscanTop(int i10) {
        if (this.f24517f2 != i10) {
            this.f24517f2 = i10;
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
                ts0[] ts0VarArr = this.m0;
                if (i10 < ts0VarArr.length) {
                    B1(ts0VarArr[i10], true);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        boolean z10;
        TLRPC.UserFull userFull2 = this.f24519g1;
        if (userFull2 != null && userFull2.stories_pinned_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f24519g1 = userFull;
        L1(true);
        if (userFull != null && z10 != userFull.stories_pinned_available) {
            g1(8);
        }
    }

    public void setVisibleHeight(int i10) {
        float f7;
        this.P1 = i10;
        int i11 = 0;
        while (true) {
            ts0[] ts0VarArr = this.m0;
            if (i11 >= ts0VarArr.length) {
                break;
            }
            int measuredHeight = getMeasuredHeight();
            if (ts0VarArr[i11].E == 8) {
                f7 = 280.0f;
            } else {
                f7 = 120.0f;
            }
            float f10 = (-(measuredHeight - Math.max(i10, org.telegram.messenger.i0.L(f7)))) / 2.0f;
            ts0VarArr[i11].f30722w.setTranslationY(f10);
            ts0VarArr[i11].f30721s.setTranslationY(-f10);
            i11++;
        }
        vq0 vq0Var = this.W;
        if (vq0Var != null) {
            vq0Var.setVisibleHeight(i10);
        }
        wq0 wq0Var = this.f24498a0;
        if (wq0Var != null) {
            wq0Var.setVisibleHeight(i10);
        }
    }

    public final boolean t0() {
        SparseArray[] sparseArrayArr;
        org.telegram.messenger.kj kjVar;
        TLRPC.Message message;
        boolean z10 = false;
        for (int i10 = 1; i10 >= 0; i10--) {
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            while (true) {
                sparseArrayArr = this.f24502b1;
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
                if (num.intValue() > 0 && (kjVar = (org.telegram.messenger.kj) sparseArrayArr[i10].get(num.intValue())) != null && (message = kjVar.f16690k) != null && message.noforwards) {
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

    public final zt0 t1(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = this.f24534l2;
        zt0 zt0Var = (zt0) hashMap.get(valueOf);
        if (zt0Var == null) {
            zt0 zt0Var2 = new zt0(this, getContext(), i10);
            hashMap.put(Integer.valueOf(i10), zt0Var2);
            this.f24536m2.put(Integer.valueOf(zt0Var2.f33222a), Integer.valueOf(i10));
            return zt0Var2;
        }
        return zt0Var;
    }

    @Override
    public final void u(org.telegram.ui.Cells.v2 v2Var) {
        int i10;
        org.telegram.ui.ActionBar.k2 k2Var = this.f24568x1;
        if (k2Var != null && k2Var.getMessagesController().O1().K(v2Var.getDialogId())) {
            k2Var.getOrCreateStoryViewer().getClass();
            th.o7 orCreateStoryViewer = k2Var.getOrCreateStoryViewer();
            Context context = k2Var.getContext();
            long dialogId = v2Var.getDialogId();
            th.n5 a2 = th.n5.a((uk0) v2Var.getParent());
            if ((k2Var instanceof ProfileActivity) && ((ProfileActivity) k2Var).f33899r1) {
                i10 = org.telegram.messenger.i0.L(68.0f);
            } else {
                i10 = 0;
            }
            a2.f49279s += i10;
            orCreateStoryViewer.R(context, dialogId, a2);
        }
    }

    public final boolean u0(int i10) {
        if (i10 != 0) {
            if (((i10 != 8 && !G0(i10)) || !TextUtils.isEmpty(getStoriesHashtag())) && i10 != 9 && i10 != 11 && i10 != 13) {
                if (i10 != 14 || this.f24498a0 == null) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final zt0 u1(int i10) {
        Integer num = (Integer) this.f24536m2.get(Integer.valueOf(i10));
        if (num == null) {
            return null;
        }
        return (zt0) this.f24534l2.get(num);
    }

    @Override
    public final void updateColors() {
        ts0[] ts0VarArr;
        try {
            this.I1.a(r0(org.telegram.ui.ActionBar.t6.f20930d6));
            org.telegram.ui.ActionBar.c2 c2Var = this.F0;
            if (c2Var != null) {
                c2Var.a(r0(org.telegram.ui.ActionBar.t6.f21314y8));
            }
            NumberTextView numberTextView = this.C0;
            if (numberTextView != null) {
                numberTextView.setTextColor(r0(org.telegram.ui.ActionBar.t6.f21314y8));
            }
            z1();
            invalidate();
            for (ts0 ts0Var : this.m0) {
                if (ts0Var != null && ts0Var.L) {
                    ts0Var.invalidate();
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void v0() {
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
        this.N0.setInterpolator(gr.f26524g);
        this.N0.addListener(new yr0(this, 0));
        this.N0.start();
    }

    public final xt0 v1(int i10) {
        zt0 u12;
        if (i10 == 8) {
            return this.f24511e0;
        }
        if (i10 == 9) {
            return this.f24518g0;
        }
        if (G0(i10) && (u12 = u1(i10)) != null) {
            return u12.f33224c;
        }
        return null;
    }

    public boolean w0() {
        return false;
    }

    public final xt0 w1(int i10) {
        zt0 u12;
        if (i10 == 8) {
            return this.f24515f0;
        }
        if (i10 == 9) {
            return this.f24521h0;
        }
        if (!G0(i10) || (u12 = u1(i10)) == null) {
            return null;
        }
        return u12.d;
    }

    public boolean x0() {
        return !(this instanceof g30);
    }

    public final void x1(boolean z10) {
        ts0[] ts0VarArr;
        ts0[] ts0VarArr2;
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
        wq0 wq0Var = this.f24498a0;
        if (wq0Var != null) {
            wq0Var.i();
        }
        int i22 = 0;
        while (true) {
            ts0VarArr = this.m0;
            if (i22 >= ts0VarArr.length) {
                break;
            }
            ts0VarArr[i22].h.C0();
            i22++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ts0VarArr[z10 ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = org.telegram.messenger.i0.L(L0());
        layoutParams.rightMargin = 0;
        layoutParams.leftMargin = 0;
        s4.g0 adapter = ts0VarArr[z10 ? 1 : 0].h.getAdapter();
        s4.g0 g0Var = this.f24511e0;
        s4.x xVar = this.f24508d0;
        if (adapter == g0Var) {
            xVar.h(null);
        }
        boolean z21 = this.X0;
        org.telegram.ui.ActionBar.i5 i5Var = this.H;
        ns0 ns0Var = this.F1;
        org.telegram.ui.ActionBar.l lVar = this.G;
        String str = "";
        org.telegram.ui.ActionBar.t0 t0Var2 = this.f24544p0;
        ht0 ht0Var = this.P;
        int i23 = 100;
        if (z21 && this.W0) {
            ts0 ts0Var = ts0VarArr[z10 ? 1 : 0];
            if (ts0Var.f30718f == null) {
                ts0Var.f30718f = new s4.u0();
            }
            ts0 ts0Var2 = ts0VarArr[z10 ? 1 : 0];
            s4.u0 u0Var5 = ts0Var2.f30718f;
            mt0 mt0Var = this.U;
            rs0 rs0Var = this.f24533l0;
            vs0 vs0Var = this.f24527j0;
            vs0 vs0Var2 = this.f24530k0;
            vs0 vs0Var3 = this.f24524i0;
            if (z10) {
                int i24 = ts0Var2.E;
                if (i24 != 0) {
                    u0Var4 = u0Var5;
                    if (i24 != 2 && i24 != 5 && i24 != 6 && (i24 != 7 || ns0Var.Y())) {
                        if (t0Var2 != null) {
                            str = t0Var2.getSearchField().getText().toString();
                        }
                        String str2 = str;
                        int i25 = ts0VarArr[z10 ? 1 : 0].E;
                        if (i25 == 1) {
                            if (vs0Var3 != null) {
                                vs0Var3.G(str2, false);
                                if (adapter != vs0Var3) {
                                    e1(adapter);
                                    ts0VarArr[z10 ? 1 : 0].h.setAdapter(vs0Var3);
                                }
                            }
                        } else if (i25 == 3) {
                            if (vs0Var2 != null) {
                                vs0Var2.G(str2, false);
                                if (adapter != vs0Var2) {
                                    e1(adapter);
                                    ts0VarArr[z10 ? 1 : 0].h.setAdapter(vs0Var2);
                                }
                            }
                        } else if (i25 == 4) {
                            if (vs0Var != null) {
                                vs0Var.G(str2, false);
                                if (adapter != vs0Var) {
                                    e1(adapter);
                                    ts0VarArr[z10 ? 1 : 0].h.setAdapter(vs0Var);
                                }
                            }
                        } else if (i25 == 7) {
                            if (rs0Var != null) {
                                rs0Var.F(str2, false);
                                if (adapter != rs0Var) {
                                    e1(adapter);
                                    ts0VarArr[z10 ? 1 : 0].h.setAdapter(rs0Var);
                                }
                            }
                        } else if (i25 == 11) {
                            if (mt0Var != null) {
                                mt0Var.E(str2, this.Y0);
                                if (adapter != mt0Var) {
                                    e1(adapter);
                                    ts0VarArr[z10 ? 1 : 0].h.setAdapter(mt0Var);
                                }
                            }
                        } else if (i25 == 15 && ht0Var != null && adapter != ht0Var) {
                            e1(adapter);
                            er0 er0Var = ts0VarArr[z10 ? 1 : 0].h;
                            ht0Var.f26918r = er0Var;
                            er0Var.setAdapter(ht0Var);
                        }
                    }
                }
                this.X0 = false;
                sr0 sr0Var = this.L0;
                if (sr0Var != null) {
                    sr0Var.g(false);
                }
                this.W0 = false;
                x1(true);
                return;
            }
            u0Var4 = u0Var5;
            if (ts0Var2.h != null) {
                int i26 = ts0Var2.E;
                if (i26 == 1) {
                    if (adapter != vs0Var3) {
                        e1(adapter);
                        ts0VarArr[z10 ? 1 : 0].h.setAdapter(vs0Var3);
                    }
                    vs0Var3.f();
                } else if (i26 == 3) {
                    if (adapter != vs0Var2) {
                        e1(adapter);
                        ts0VarArr[z10 ? 1 : 0].h.setAdapter(vs0Var2);
                    }
                    vs0Var2.f();
                } else if (i26 == 4) {
                    if (adapter != vs0Var) {
                        e1(adapter);
                        ts0VarArr[z10 ? 1 : 0].h.setAdapter(vs0Var);
                    }
                    vs0Var.f();
                } else if (i26 == 7) {
                    if (adapter != rs0Var) {
                        e1(adapter);
                        ts0VarArr[z10 ? 1 : 0].h.setAdapter(rs0Var);
                    }
                    rs0Var.f();
                } else if (i26 == 11) {
                    if (adapter != mt0Var) {
                        e1(adapter);
                        ts0VarArr[z10 ? 1 : 0].h.setAdapter(mt0Var);
                    }
                    mt0Var.f();
                }
            }
            ts0VarArr2 = ts0VarArr;
            t0Var = t0Var2;
            u0Var3 = u0Var4;
            i12 = 4;
            z13 = false;
            z16 = false;
            i14 = 8;
        } else {
            ts0 ts0Var3 = ts0VarArr[z10 ? 1 : 0];
            if (ts0Var3.e == null) {
                ts0Var3.e = new s4.u0();
            }
            ts0 ts0Var4 = ts0VarArr[z10 ? 1 : 0];
            s4.u0 u0Var6 = ts0Var4.e;
            ts0Var4.h.setPinnedHeaderShadowDrawable(null);
            int i27 = ts0VarArr[z10 ? 1 : 0].E;
            if (i27 == 8 || G0(i27)) {
                layoutParams.topMargin = org.telegram.messenger.i0.L(L0());
            }
            er0 er0Var2 = ts0VarArr[z10 ? 1 : 0].h;
            int paddingLeft = er0Var2.getPaddingLeft();
            ts0 ts0Var5 = ts0VarArr[z10 ? 1 : 0];
            ts0VarArr2 = ts0VarArr;
            er0 er0Var3 = ts0Var5.h;
            int i02 = i0(ts0Var5.E);
            er0Var3.f30437g3 = i02;
            int paddingRight = ts0VarArr2[z10 ? 1 : 0].h.getPaddingRight();
            er0 er0Var4 = ts0VarArr2[z10 ? 1 : 0].h;
            t0Var = t0Var2;
            int h02 = h0(F0());
            er0Var4.f30438h3 = h02;
            er0Var2.setPadding(paddingLeft, i02, paddingRight, h02);
            int i28 = ts0VarArr2[z10 ? 1 : 0].E;
            int[] iArr = this.f24542o1;
            s4.g0 g0Var2 = this.M;
            View view = this.W;
            jt0 jt0Var = this.T;
            ms0 ms0Var = this.R;
            gs0 gs0Var = this.V;
            pt0[] pt0VarArr = this.f24562v1;
            if (i28 == 0) {
                s4.g0 g0Var3 = this.J;
                if (adapter != g0Var3) {
                    e1(adapter);
                    ts0VarArr2[z10 ? 1 : 0].h.setAdapter(g0Var3);
                }
                int i29 = -org.telegram.messenger.i0.L(1.0f);
                layoutParams.rightMargin = i29;
                layoutParams.leftMargin = i29;
                pt0 pt0Var = pt0VarArr[0];
                if (pt0Var.h && !pt0Var.e.isEmpty()) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                i23 = iArr[0];
                ts0VarArr2[z10 ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.A0);
                pt0 pt0Var2 = pt0VarArr[0];
                if (pt0Var2.f29551x == null) {
                    pt0Var2.f29551x = new s4.u0();
                }
                u0Var = pt0VarArr[0].f29551x;
                z13 = z19;
                z11 = false;
            } else {
                if (i28 == 1) {
                    pt0 pt0Var3 = pt0VarArr[1];
                    if (pt0Var3.h && !pt0Var3.e.isEmpty()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (adapter != g0Var2) {
                        e1(adapter);
                        ts0VarArr2[z10 ? 1 : 0].h.setAdapter(g0Var2);
                    }
                } else if (i28 == 2) {
                    pt0 pt0Var4 = pt0VarArr[2];
                    if (pt0Var4.h && !pt0Var4.e.isEmpty()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    s4.g0 g0Var4 = this.N;
                    if (adapter != g0Var4) {
                        e1(adapter);
                        ts0VarArr2[z10 ? 1 : 0].h.setAdapter(g0Var4);
                    }
                } else {
                    if (i28 == 3) {
                        s4.g0 g0Var5 = this.L;
                        if (adapter != g0Var5) {
                            e1(adapter);
                            ts0VarArr2[z10 ? 1 : 0].h.setAdapter(g0Var5);
                        }
                    } else if (i28 == 4) {
                        pt0 pt0Var5 = pt0VarArr[4];
                        if (pt0Var5.h && !pt0Var5.e.isEmpty()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        s4.g0 g0Var6 = this.O;
                        if (adapter != g0Var6) {
                            e1(adapter);
                            ts0VarArr2[z10 ? 1 : 0].h.setAdapter(g0Var6);
                        }
                    } else {
                        if (i28 == 5) {
                            s4.g0 g0Var7 = this.Q;
                            if (adapter != g0Var7) {
                                e1(adapter);
                                ts0VarArr2[z10 ? 1 : 0].h.setAdapter(g0Var7);
                            }
                        } else if (i28 == 15) {
                            if (adapter != ht0Var) {
                                e1(adapter);
                                er0 er0Var5 = ts0VarArr2[z10 ? 1 : 0].h;
                                ht0Var.f26918r = er0Var5;
                                er0Var5.setAdapter(ht0Var);
                            }
                        } else if (i28 == 6) {
                            if (adapter != ms0Var) {
                                e1(adapter);
                                ts0VarArr2[z10 ? 1 : 0].h.setAdapter(ms0Var);
                            }
                        } else if (i28 == 7) {
                            s4.g0 g0Var8 = this.f24505c0;
                            if (adapter != g0Var8) {
                                e1(adapter);
                                ts0VarArr2[z10 ? 1 : 0].h.setAdapter(g0Var8);
                            }
                        } else if (y0(i28)) {
                            s4.g0 v12 = v1(ts0VarArr2[z10 ? 1 : 0].E);
                            if (adapter != v12) {
                                e1(adapter);
                                ts0VarArr2[z10 ? 1 : 0].h.setAdapter(v12);
                                ts0VarArr2[z10 ? 1 : 0].h.getClass();
                            }
                            ts0 ts0Var6 = ts0VarArr2[z10 ? 1 : 0];
                            if (ts0Var6.E != 9) {
                                xVar.h(ts0Var6.h);
                            }
                            i23 = iArr[1];
                        } else {
                            int i30 = ts0VarArr2[z10 ? 1 : 0].E;
                            if (i30 == 10) {
                                s4.g0 g0Var9 = this.S;
                                if (adapter != g0Var9) {
                                    e1(adapter);
                                    ts0VarArr2[z10 ? 1 : 0].h.setAdapter(g0Var9);
                                }
                            } else if (i30 == 11) {
                                if (adapter != jt0Var) {
                                    e1(adapter);
                                    ts0VarArr2[z10 ? 1 : 0].h.setAdapter(jt0Var);
                                    s4.x xVar2 = jt0Var.f27570w;
                                    er0 er0Var6 = ts0VarArr2[z10 ? 1 : 0].h;
                                    jt0Var.f27569s = er0Var6;
                                    xVar2.h(er0Var6);
                                }
                                u0Var = jt0Var.f27568r;
                                z11 = true;
                                z13 = false;
                            } else if (i30 == 12) {
                                if (adapter != null) {
                                    e1(adapter);
                                    ts0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (gs0Var.getParent() != ts0VarArr2[z10 ? 1 : 0]) {
                                    org.telegram.messenger.i0.E2(gs0Var);
                                    ts0VarArr2[z10 ? 1 : 0].addView(gs0Var, w7.b6.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
                                    l1(org.telegram.messenger.i0.L(56.0f) + this.f24507c2, gs0Var);
                                }
                            } else if (i30 == 13) {
                                if (adapter != null) {
                                    e1(adapter);
                                    ts0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != ts0VarArr2[z10 ? 1 : 0]) {
                                    org.telegram.messenger.i0.E2(view);
                                    ts0VarArr2[z10 ? 1 : 0].addView(view);
                                    l1(this.f24507c2, view);
                                }
                            } else if (i30 == 14) {
                                if (adapter != null) {
                                    e1(adapter);
                                    ts0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (wq0Var != null && wq0Var.getParent() != ts0VarArr2[z10 ? 1 : 0]) {
                                    org.telegram.messenger.i0.E2(wq0Var);
                                    ts0VarArr2[z10 ? 1 : 0].addView(wq0Var);
                                    ts0VarArr2[z10 ? 1 : 0].f30722w.setVisibility(4);
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
            G1(ts0VarArr2[z10 ? 1 : 0]);
            if (z11) {
                ts0VarArr2[z10 ? 1 : 0].h.setSections(false);
                u0Var2 = u0Var;
            } else {
                er0 er0Var7 = ts0VarArr2[z10 ? 1 : 0].h;
                er0Var7.getClass();
                u0Var2 = u0Var;
                org.telegram.ui.ActionBar.a7.m(er0Var7, 20, org.telegram.ui.ActionBar.t6.f21021i6, er0Var7.f31008n2);
                er0Var7.T2 = false;
                er0Var7.H2 = null;
                er0Var7.I2 = null;
                er0Var7.L2 = 0.0f;
                er0Var7.M2 = null;
                er0Var7.N2 = null;
                er0Var7.J2 = null;
                fk0 fk0Var = er0Var7.G2;
                if (fk0Var != null) {
                    er0Var7.q0(fk0Var);
                    er0Var7.G2 = null;
                }
                l9 l9Var = er0Var7.R2;
                if (l9Var != null) {
                    er0Var7.q0(l9Var);
                    er0Var7.R2 = null;
                }
            }
            F1(ts0VarArr2[z10 ? 1 : 0]);
            ts0 ts0Var7 = ts0VarArr2[z10 ? 1 : 0];
            if (ts0Var7.E == 11) {
                ts0Var7.h.setItemAnimator(ts0Var7.d);
            } else {
                ts0Var7.h.setItemAnimator(null);
                if (jt0Var != null && ts0VarArr2[z10 ? 1 : 0].h == jt0Var.f27569s) {
                    s4.x xVar3 = jt0Var.f27570w;
                    jt0Var.f27569s = null;
                    xVar3.h(null);
                }
            }
            if (gs0Var != null && ts0VarArr2[z10 ? 1 : 0].E != 12 && gs0Var.getParent() == ts0VarArr2[z10 ? 1 : 0]) {
                gs0Var.f43128a.onRemoveFromParent();
                ts0VarArr2[z10 ? 1 : 0].removeView(gs0Var);
            }
            if (view != null && ts0VarArr2[z10 ? 1 : 0].E != 13) {
                ViewParent parent = view.getParent();
                ts0 ts0Var8 = ts0VarArr2[z10 ? 1 : 0];
                if (parent == ts0Var8) {
                    ts0Var8.removeView(view);
                }
            }
            if (wq0Var != null && ts0VarArr2[z10 ? 1 : 0].E != 14) {
                ViewParent parent2 = wq0Var.getParent();
                ts0 ts0Var9 = ts0VarArr2[z10 ? 1 : 0];
                if (parent2 == ts0Var9) {
                    ts0Var9.removeView(wq0Var);
                }
            }
            int i31 = ts0VarArr2[z10 ? 1 : 0].E;
            if (i31 != 0 && i31 != 11 && !y0(i31) && (i17 = ts0VarArr2[z10 ? 1 : 0].E) != 2 && i17 != 5 && i17 != 6 && ((i17 != 7 || ns0Var.Y()) && (i18 = ts0VarArr2[z10 ? 1 : 0].E) != 10 && i18 != 13 && i18 != 14)) {
                if (z10) {
                    if (t0Var != null && t0Var.getVisibility() == 4) {
                        if (i5Var != null) {
                            z18 = i5Var.F;
                        } else {
                            z18 = lVar.f20498n0;
                        }
                        if (!z18) {
                            if (H()) {
                                this.f24572z0 = 1;
                                setSearchItemVisibility(0);
                            } else {
                                if (F0()) {
                                    i20 = 8;
                                } else {
                                    i20 = 4;
                                }
                                setSearchItemVisibility(i20);
                            }
                            float f7 = z10 ? 1.0f : 0.0f;
                            this.f24547q0 = k0(f7);
                            I1(1.0f - f7);
                            z17 = false;
                        }
                    }
                    z17 = false;
                    this.f24572z0 = 0;
                    this.f24547q0 = 1.0f;
                } else {
                    z17 = false;
                    if (t0Var != null && t0Var.getVisibility() == 4) {
                        if (H()) {
                            this.f24572z0 = 0;
                            this.f24547q0 = 1.0f;
                            setSearchItemVisibility(0);
                        } else {
                            if (F0()) {
                                i19 = 8;
                            } else {
                                i19 = 4;
                            }
                            setSearchItemVisibility(i19);
                            this.f24547q0 = 0.0f;
                        }
                    }
                }
                E1(z17);
            } else if (z10) {
                this.f24572z0 = 2;
            } else {
                this.f24572z0 = 0;
                if (t0Var != null) {
                    if (!F0() && !this.X0) {
                        i10 = 4;
                    } else {
                        i10 = 8;
                    }
                    setSearchItemVisibility(i10);
                }
            }
            int i32 = ts0VarArr2[z10 ? 1 : 0].E;
            if (i32 == 6) {
                if (!ms0Var.e && !ms0Var.h && ms0Var.d.isEmpty()) {
                    ms0.E(ms0Var, 0L);
                }
            } else if (i32 != 7) {
                if (y0(i32)) {
                    xt0 v13 = v1(ts0VarArr2[z10 ? 1 : 0].E);
                    if (v13 != null) {
                        th.x4 x4Var = v13.f32635s;
                        v13.P();
                        pr0 pr0Var = ts0VarArr2[z10 ? 1 : 0].f30722w;
                        if (x4Var != null && (x4Var.k() || (s0() && x4Var.g() > 0))) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        pr0Var.e(z14, z10);
                        if (x4Var != null && x4Var.g() > 0 && !D0()) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z13 = z15;
                    }
                } else {
                    int i33 = ts0VarArr2[z10 ? 1 : 0].E;
                    if (i33 != 10 && i33 != 11 && i33 != 12 && i33 != 13 && i33 != 14) {
                        if (i33 == 15) {
                            i33 = 8;
                        }
                        pt0 pt0Var6 = pt0VarArr[i33];
                        if (!pt0Var6.f29536g && !pt0Var6.f29537i[0] && pt0Var6.f29532a.isEmpty()) {
                            pt0VarArr[i33].f29536g = true;
                            g0Var2.f();
                            if (i33 == 0) {
                                int i34 = pt0VarArr[0].f29545q;
                                if (i34 == 1) {
                                    i11 = 6;
                                } else if (i34 == 2) {
                                    i11 = 7;
                                }
                                org.telegram.ui.ActionBar.k2 k2Var = this.f24568x1;
                                k2Var.getMediaDataController().N0(this.l1, 50, 0, 0, i11, this.F, 1, k2Var.getClassGuid(), pt0VarArr[i11].f29544p, null, null);
                            }
                            i11 = i33;
                            org.telegram.ui.ActionBar.k2 k2Var2 = this.f24568x1;
                            k2Var2.getMediaDataController().N0(this.l1, 50, 0, 0, i11, this.F, 1, k2Var2.getClassGuid(), pt0VarArr[i11].f29544p, null, null);
                        }
                    }
                }
            }
            int i35 = ts0VarArr2[z10 ? 1 : 0].E;
            if (i35 == 8 || G0(i35)) {
                i12 = 4;
                ts0 ts0Var10 = ts0VarArr2[z10 ? 1 : 0];
                pr0 pr0Var2 = ts0Var10.f30722w;
                boolean G0 = G0(ts0Var10.E);
                int s12 = s1(ts0VarArr2[z10 ? 1 : 0].E);
                g9 g9Var = pr0Var2.f25947b;
                vh.d dVar = pr0Var2.f25949f;
                if (!G0 && !E0() && !A0()) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                g9Var.setVisibility(i13);
                if (G0) {
                    dVar.setVisibility(0);
                    dVar.h(org.telegram.messenger.dd.L0(2131744823, null), false);
                    i14 = 8;
                } else if (E0()) {
                    i14 = 8;
                    dVar.setVisibility(8);
                } else {
                    i14 = 8;
                    pr0Var2.setStickerType(11);
                    if (!D0()) {
                        i15 = 0;
                    } else {
                        i15 = 8;
                    }
                    dVar.setVisibility(i15);
                    dVar.h(z(), false);
                }
                if (G0) {
                    pr0Var2.d.setText(org.telegram.messenger.dd.L0(2131744801, null));
                    pr0Var2.e.setText(org.telegram.messenger.dd.L0(2131744802, null));
                } else {
                    nh.p pVar = pr0Var2.d;
                    if (!D0()) {
                        if (F0()) {
                            i16 = 2131748192;
                        } else {
                            i16 = 2131748163;
                        }
                    } else {
                        i16 = 2131748221;
                    }
                    pVar.setText(org.telegram.messenger.dd.L0(i16, null));
                    p80 p80Var = pr0Var2.e;
                    if (F0()) {
                        str = org.telegram.messenger.dd.L0(2131748164, null);
                    }
                    p80Var.setText(str);
                }
                z16 = false;
                dVar.setOnClickListener(new bq0(this, G0, s12, 0));
            } else {
                ts0 ts0Var11 = ts0VarArr2[z10 ? 1 : 0];
                if (ts0Var11.E == 9) {
                    if (E0()) {
                        ts0VarArr2[z10 ? 1 : 0].f30722w.f25947b.setVisibility(8);
                        ts0VarArr2[z10 ? 1 : 0].f30722w.f25949f.setVisibility(8);
                    } else {
                        ts0VarArr2[z10 ? 1 : 0].f30722w.f25947b.setVisibility(0);
                        ts0VarArr2[z10 ? 1 : 0].f30722w.setStickerType(11);
                        ts0VarArr2[z10 ? 1 : 0].f30722w.f25949f.setVisibility(0);
                        ts0VarArr2[z10 ? 1 : 0].f30722w.f25949f.h(z(), false);
                    }
                    ts0VarArr2[z10 ? 1 : 0].f30722w.d.setText(org.telegram.messenger.dd.L0(2131748263, null));
                    p80 p80Var2 = ts0VarArr2[z10 ? 1 : 0].f30722w.e;
                    if (F0()) {
                        str = org.telegram.messenger.dd.L0(2131748264, null);
                    }
                    p80Var2.setText(str);
                    i12 = 4;
                    ts0VarArr2[z10 ? 1 : 0].f30722w.f25949f.setOnClickListener(new vp0(this, 4));
                    z16 = false;
                    i14 = 8;
                } else {
                    i12 = 4;
                    ts0Var11.f30722w.f25947b.setVisibility(0);
                    ts0VarArr2[z10 ? 1 : 0].f30722w.setStickerType(1);
                    ts0VarArr2[z10 ? 1 : 0].f30722w.d.setText(org.telegram.messenger.dd.L0(2131748183, null));
                    ts0VarArr2[z10 ? 1 : 0].f30722w.e.setText(org.telegram.messenger.dd.L0(2131745824, null));
                    i14 = 8;
                    ts0VarArr2[z10 ? 1 : 0].f30722w.f25949f.setVisibility(8);
                    z16 = false;
                }
            }
            ts0VarArr2[z10 ? 1 : 0].h.setVisibility(z16 ? 1 : 0);
            u0Var3 = u0Var2;
        }
        int i36 = i23;
        ts0 ts0Var12 = ts0VarArr2[z10 ? 1 : 0];
        ts0Var12.f30716b = z13;
        B1(ts0Var12, z16);
        ts0VarArr2[z10 ? 1 : 0].f30723x.y1(i36);
        ts0VarArr2[z10 ? 1 : 0].h.a0();
        if (u0Var3 != null) {
            ts0VarArr2[z10 ? 1 : 0].h.setRecycledViewPool(u0Var3);
            ts0VarArr2[z10 ? 1 : 0].f30719n.setRecycledViewPool(u0Var3);
        }
        if (this.f24572z0 == 2) {
            if (i5Var != null) {
                z20 = i5Var.F;
            } else {
                z20 = lVar.f20498n0;
            }
            if (z20) {
                this.B0 = true;
                if (i5Var != null) {
                    i5Var.j(true);
                } else {
                    lVar.k(true);
                }
                this.f24572z0 = 0;
                this.f24547q0 = 0.0f;
                if (t0Var != null) {
                    if (F0()) {
                        i21 = i14;
                    } else {
                        i21 = i12;
                    }
                    setSearchItemVisibility(i21);
                }
                E1(false);
            }
        }
    }

    public final void y(View view) {
        ts0[] ts0VarArr = this.m0;
        addView(view, Math.max(indexOfChild(ts0VarArr[0]), indexOfChild(ts0VarArr[1])) + 1, w7.b6.e(-1, 0, 48));
        view.getLayoutParams().height = 0;
    }

    public final void y1(org.telegram.ui.ActionBar.b1 b1Var, org.telegram.ui.ActionBar.b1 b1Var2, Runnable runnable) {
        if (this.K1) {
            return;
        }
        if (!b1Var2.getCheckView().f25895a.f23920q && b1Var.getCheckView().f25895a.f23920q) {
            float f7 = -this.f24560u1;
            this.f24560u1 = f7;
            org.telegram.messenger.i0.F3(f7, b1Var, null);
            return;
        }
        b1Var.setChecked(!b1Var.getCheckView().f25895a.f23920q);
        runnable.run();
    }

    public final SpannableStringBuilder z() {
        if (this.Z1 == null) {
            this.Z1 = new SpannableStringBuilder();
            if (A0()) {
                this.Z1.append((CharSequence) org.telegram.messenger.dd.L0(2131746717, null));
            } else {
                this.Z1.append((CharSequence) "c");
                this.Z1.setSpan(new dq(2131231146, 0), 0, 1, 33);
                this.Z1.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.dd.L0(2131744827, null));
            }
        }
        return this.Z1;
    }

    public boolean z0() {
        return false;
    }

    public final void z1() {
        if (this.H == null) {
            try {
                int r02 = r0(org.telegram.ui.ActionBar.t6.f21314y8);
                int r03 = r0(org.telegram.ui.ActionBar.t6.f21333z8);
                if (r02 != this.f24549q2 || r03 != this.f24553r2) {
                    this.f24549q2 = r02;
                    this.f24553r2 = r03;
                    org.telegram.ui.ActionBar.t0[] t0VarArr = {this.f24564w0, this.f24561v0, this.f24567x0, this.f24570y0, this.f24538n0};
                    for (int i10 = 0; i10 < 5; i10++) {
                        org.telegram.ui.ActionBar.t0 t0Var = t0VarArr[i10];
                        if (t0Var != null) {
                            t0Var.setIconColor(r02);
                            if (t0Var.getBackground() != null) {
                                org.telegram.ui.ActionBar.t6.H1(t0Var.getBackground(), r03, true);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    public void M0(SparseArray sparseArray) {
    }

    public void T0(boolean z10) {
    }

    public int d1(int i10) {
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

    public void N0() {
    }

    @Override
    public final void q() {
    }
}
