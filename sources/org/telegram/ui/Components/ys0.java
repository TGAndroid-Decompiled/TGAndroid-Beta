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
public abstract class ys0 extends FrameLayout implements org.telegram.ui.ActionBar.z5, org.telegram.messenger.is, org.telegram.ui.Cells.p2, oj0 {
    public static final int[] f42071t2 = {0, 1, 2, 4};
    public static final tp0 f42072u2 = new tp0(0);
    public static final int f42073v2 = org.telegram.messenger.g0.L(7.0f);
    public static final int f42074w2 = org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(14.0f);
    public int A0;
    public boolean A1;
    public final Drawable B0;
    public boolean B1;
    public boolean C0;
    public int C1;
    public final NumberTextView D0;
    public int D1;
    public final pz E;
    public final LinearLayout E0;
    public VelocityTracker E1;
    public final int F;
    public final ImageView F0;
    public boolean F1;
    public final long G;
    public final org.telegram.ui.ActionBar.x1 G0;
    public final nr0 G1;
    public final org.telegram.ui.ActionBar.k H;
    public final ArrayList H0;
    public hi.l3 H1;
    public final org.telegram.ui.ActionBar.w4 I;
    public final ArrayList I0;
    public final org.telegram.ui.ActionBar.e6 I1;
    public final org.telegram.ui.ActionBar.d5 J;
    public final ArrayList J0;
    public final ui.c J1;
    public final fr0 K;
    public final ArrayList K0;
    public final xi.e K1;
    public final ss0 L;
    public final vq0 L0;
    public boolean L1;
    public final ms0 M;
    public final sq0 M0;
    public final h2.f M1;
    public final ls0 N;
    public final org.telegram.ui.Cells.t0 N0;
    public org.telegram.ui.f0 N1;
    public final ls0 O;
    public AnimatorSet O0;
    public int O1;
    public final ls0 P;
    public final wo0 P0;
    public boolean P1;
    public final hs0 Q;
    public final ArrayList Q0;
    public int Q1;
    public final or0 R;
    public float R0;
    public AnimatorSet R1;
    public final mr0 S;
    public final vr S0;
    public final SparseArray S1;
    public final kr0 T;
    public final FrameLayout T0;
    public long T1;
    public final js0 U;
    public final rq0 U0;
    public boolean U1;
    public final ks0 V;
    public final int V0;
    public int V1;
    public final gr0 W;
    public final Paint W0;
    public final cr0 W1;
    public boolean X0;
    public fi.k6 X1;
    public boolean Y0;
    public float Y1;
    public ch.p0 Z0;
    public boolean Z1;
    public boolean f42075a;
    public final vp0 f42076a0;
    public final int[] f42077a1;
    public SpannableStringBuilder f42078a2;
    public boolean f42079b;
    public final wp0 f42080b0;
    public int f42081b1;
    public int f42082b2;
    public boolean f42083c;
    public final zp0 f42084c0;
    public final SparseArray[] f42085c1;
    public boolean f42086c2;
    public boolean d;
    public final lr0 f42087d0;
    public int f42088d1;
    public int d2;
    public int f42089e;
    public final v4.y f42090e0;
    public boolean f42091e1;
    public int f42092e2;
    public int f42093f;
    public final ir0 f42094f0;
    public long f42095f1;
    public int f42096f2;
    public final vs0 f42097g0;
    public TLRPC.ChatFull f42098g1;
    public int f42099g2;
    public float h;
    public final up0 f42100h0;
    public TLRPC.UserFull f42101h1;
    public ri.q f42102h2;
    public final vs0 f42103i0;
    public AnimatorSet f42104i1;
    public float f42105i2;
    public final vr0 f42106j0;
    public boolean f42107j1;
    public final RectF f42108j2;
    public final vr0 f42109k0;
    public boolean f42110k1;
    public Runnable f42111k2;
    public final vr0 f42112l0;
    public boolean l1;
    public int f42113l2;
    public final rr0 m0;
    public final long f42114m1;
    public final HashMap f42115m2;
    public float f42116n;
    public final tr0[] f42117n0;
    public boolean n1;
    public final HashMap f42118n2;
    public final org.telegram.ui.ActionBar.q0 f42119o0;
    public boolean f42120o1;
    public int f42121o2;
    public final org.telegram.ui.ActionBar.q0 f42122p0;
    public final int[] f42123p1;
    public int f42124p2;
    public final org.telegram.ui.ActionBar.q0 f42125q0;
    public float f42126q1;
    public boolean f42127q2;
    public boolean f42128r;
    public float f42129r0;
    public boolean f42130r1;
    public int f42131r2;
    public int f42132s;
    public float f42133s0;
    public int f42134s1;
    public int f42135s2;
    public final TextView f42136t0;
    public int f42137t1;
    public final ImageView f42138u0;
    public final fq0 f42139u1;
    public final fh0 f42140v0;
    public float f42141v1;
    public int f42142w;
    public final org.telegram.ui.ActionBar.q0 f42143w0;
    public final ns0[] f42144w1;
    public int f42145x;
    public final org.telegram.ui.ActionBar.q0 f42146x0;
    public final qs0 f42147x1;
    public final Rect f42148y;
    public final org.telegram.ui.ActionBar.q0 f42149y0;
    public final org.telegram.ui.ActionBar.e2 f42150y1;
    public final org.telegram.ui.ActionBar.q0 f42151z0;
    public int f42152z1;

    public ys0(android.content.Context r34, long r35, org.telegram.ui.Components.qs0 r37, int r38, java.util.ArrayList r39, org.telegram.tgnet.TLRPC.ChatFull r40, org.telegram.tgnet.TLRPC.UserFull r41, int r42, int r43, org.telegram.ui.ActionBar.e2 r44, org.telegram.ui.Components.nr0 r45, int r46, org.telegram.ui.ActionBar.e6 r47, dh.c r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ys0.<init>(android.content.Context, long, org.telegram.ui.Components.qs0, int, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.tgnet.TLRPC$UserFull, int, int, org.telegram.ui.ActionBar.e2, org.telegram.ui.Components.nr0, int, org.telegram.ui.ActionBar.e6, dh.c):void");
    }

    public static boolean J0(int i7) {
        if ((i7 & (-65536)) == 65536) {
            return true;
        }
        return false;
    }

    public static p3 X(int i7, long j3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        p3 p3Var = new p3(context, e6Var);
        ImageView imageView = (ImageView) p3Var.d;
        TextView textView = (TextView) p3Var.f38185c;
        if (i7 == 0) {
            if (org.telegram.messenger.m5.C(j3)) {
                textView.setText(org.telegram.messenger.hd.M0(2131748196, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.hd.M0(2131748198, null));
            return p3Var;
        } else if (i7 == 1) {
            if (org.telegram.messenger.m5.C(j3)) {
                textView.setText(org.telegram.messenger.hd.M0(2131748157, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.hd.M0(2131748158, null));
            return p3Var;
        } else if (i7 == 2) {
            if (org.telegram.messenger.m5.C(j3)) {
                textView.setText(org.telegram.messenger.hd.M0(2131748152, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.hd.M0(2131748153, null));
            return p3Var;
        } else if (i7 == 3) {
            if (org.telegram.messenger.m5.C(j3)) {
                textView.setText(org.telegram.messenger.hd.M0(2131748154, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.hd.M0(2131748155, null));
            return p3Var;
        } else if (i7 == 4) {
            if (org.telegram.messenger.m5.C(j3)) {
                textView.setText(org.telegram.messenger.hd.M0(2131748159, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.hd.M0(2131748160, null));
            return p3Var;
        } else if (i7 == 5) {
            if (org.telegram.messenger.m5.C(j3)) {
                textView.setText(org.telegram.messenger.hd.M0(2131748156, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.hd.M0(2131748208, null));
            return p3Var;
        } else if (i7 == 6) {
            imageView.setImageDrawable(null);
            textView.setText(org.telegram.messenger.hd.M0(2131748206, null));
            return p3Var;
        } else {
            if (i7 == 7) {
                imageView.setImageDrawable(null);
                textView.setText("");
            }
            return p3Var;
        }
    }

    public static void a(ys0 ys0Var, TL_stories.StoryItem storyItem, fi.l6 l6Var) {
        ys0Var.getStoriesController().c(l6Var.f11998a, ys0Var.f42114m1, storyItem);
        org.telegram.messenger.g0.i3(new hh0(7, ys0Var, l6Var), 100L);
    }

    public static void d(ys0 ys0Var, int i7, TL_stories.StoryItem storyItem, String str) {
        org.telegram.ui.f0 f0Var = new org.telegram.ui.f0(ys0Var, i7, storyItem, 18);
        fi.s6 storiesController = ys0Var.getStoriesController();
        long j3 = ys0Var.f42114m1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.f0(i7, j3, arrayList);
        cc.a0(ys0Var.f42150y1).K(2131623980, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(1, "StoryRemovedFromAlbumTitle", str)), org.telegram.messenger.hd.M0(2131743885, null), f0Var).j();
    }

    public static void e(ys0 ys0Var, long j3, int i7) {
        fi.g6 B = ys0Var.getStoriesController().B(j3, true);
        int i10 = B.f11742a;
        int c10 = B.c(i7);
        if (c10 == -1) {
            return;
        }
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = org.telegram.messenger.np.s1(i10).j1(B.f11743b);
        tL_deleteAlbum.album_id = ((fi.l6) B.h.remove(c10)).f11998a;
        ConnectionsManager.getInstance(i10).sendRequest(tL_deleteAlbum, null);
        B.f(true);
    }

    public static void f(ys0 ys0Var, long j3, int i7, String str) {
        fi.g6 B = ys0Var.getStoriesController().B(j3, true);
        int i10 = B.f11742a;
        int c10 = B.c(i7);
        if (c10 == -1) {
            return;
        }
        ((fi.l6) B.h.get(c10)).f11999b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = org.telegram.messenger.np.s1(i10).j1(B.f11743b);
        tL_updateAlbum.album_id = i7;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i10).sendRequest(tL_updateAlbum, null);
        B.f(true);
    }

    public long getPlaylistTopicId() {
        if (org.telegram.messenger.t3.b0(this.f42150y1.getCurrentAccount(), this.f42114m1)) {
            return this.G;
        }
        return 0L;
    }

    public fi.s6 getStoriesController() {
        return org.telegram.messenger.np.s1(this.f42150y1.getCurrentAccount()).P1();
    }

    public static void h(ys0 ys0Var, TL_stories.StoryItem storyItem) {
        ys0Var.getStoriesController().r0(ys0Var.f42114m1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        cc.a0(ys0Var.f42150y1).G(2131623980, 5000, org.telegram.messenger.hd.G(1, "StoryArchived", new Object[0])).j();
    }

    public static void j(ys0 ys0Var, HashSet hashSet, TL_stories.StoryItem storyItem, m60 m60Var, fi.l6 l6Var) {
        String a02;
        long j3 = ys0Var.f42114m1;
        if (hashSet.contains(Integer.valueOf(l6Var.f11998a))) {
            ys0Var.getStoriesController().c(l6Var.f11998a, j3, storyItem);
            a02 = org.telegram.messenger.hd.a0(null, null, 2131744731, l6Var.f11999b);
        } else {
            fi.s6 storiesController = ys0Var.getStoriesController();
            int i7 = l6Var.f11998a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.f0(i7, j3, arrayList);
            a02 = org.telegram.messenger.hd.a0(null, null, 2131744494, l6Var.f11999b);
        }
        cc.a0(ys0Var.f42150y1).Q(2131623990, 36, org.telegram.messenger.g0.X2(a02)).j();
        m60Var.u();
    }

    public static int o(View view) {
        if (view instanceof org.telegram.ui.Cells.n7) {
            return ((org.telegram.ui.Cells.n7) view).getMessageId();
        }
        if (view instanceof org.telegram.ui.Cells.g7) {
            return ((org.telegram.ui.Cells.g7) view).getMessage().e1();
        }
        if (view instanceof org.telegram.ui.Cells.f7) {
            return ((org.telegram.ui.Cells.f7) view).getMessage().e1();
        }
        return 0;
    }

    public static TLRPC.ProfileTab o0(int i7, boolean z10) {
        if (i7 != 8 && i7 != 14 && !z10) {
            return null;
        }
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 5) {
                                if (i7 != 8) {
                                    if (i7 != 14) {
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

    public static int p0(TLRPC.ProfileTab profileTab) {
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

    public static void p1(int i7, View view) {
        if (view != null && (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams.topMargin != i7) {
                marginLayoutParams.topMargin = i7;
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public static void s(tr0 tr0Var, ns0[] ns0VarArr, boolean z10) {
        hh0 hh0Var;
        if (z10) {
            if (org.telegram.messenger.gz.f23988v1 > 0 && tr0Var.G == null && !tr0Var.I && tr0Var.h.getFastScroll() != null && tr0Var.h.getFastScroll().f42371b0 && tr0Var.h.getFastScroll().getVisibility() == 0 && ns0VarArr[0].e() >= 50) {
                int i7 = org.telegram.messenger.gz.f23988v1;
                int i10 = i7 - 1;
                if (i7 != i10) {
                    org.telegram.messenger.gz.f23988v1 = i10;
                    org.telegram.messenger.t0.f26600b.getSharedPreferences("mainconfig", 0).edit().putInt("fastScrollHintCount", org.telegram.messenger.gz.f23988v1).apply();
                }
                tr0Var.I = true;
                Context context = tr0Var.getContext();
                bi.v1 v1Var = new bi.v1(context, 20);
                TextView textView = new TextView(context);
                textView.setText(org.telegram.messenger.hd.M0(2131745408, null));
                textView.setTextSize(1, 14.0f);
                textView.setMaxLines(3);
                int i11 = org.telegram.ui.ActionBar.j6.f28914gg;
                org.telegram.ui.ActionBar.q6.U(textView, i11, null);
                int L = org.telegram.messenger.g0.L(6.0f);
                int i12 = org.telegram.ui.ActionBar.j6.hg;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.x0(null, i12, false));
                org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i12);
                v1Var.setBackground(d02);
                org.telegram.ui.ActionBar.q6.j(v1Var, d02, M, null, null);
                v1Var.addView(textView, c8.ja.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
                ?? view = new View(context);
                view.f40136a = new Random();
                Paint paint = new Paint(1);
                view.f40137b = paint;
                Paint paint2 = new Paint(1);
                view.f40138c = paint2;
                view.f40140f = 1.0f;
                view.h = 0.0f;
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, i11, false), 76));
                paint2.setColor(org.telegram.ui.ActionBar.j6.x0(null, i11, false));
                Paint paint3 = new Paint();
                view.d = paint3;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint3.setShader(new LinearGradient(0.0f, org.telegram.messenger.g0.L(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint3.setXfermode(new PorterDuffXfermode(mode));
                Paint paint4 = new Paint();
                view.f40139e = paint4;
                paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
                paint4.setXfermode(new PorterDuffXfermode(mode));
                v1Var.addView((View) view, c8.ja.d(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                tr0Var.G = v1Var;
                tr0Var.addView(v1Var, c8.ja.c(-2.0f, -2));
                tr0Var.G.setAlpha(0.0f);
                tr0Var.G.setScaleX(0.8f);
                tr0Var.G.setScaleY(0.8f);
                tr0Var.G.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                tr0Var.invalidate();
                hh0 hh0Var2 = new hh0(8, tr0Var, v1Var);
                tr0Var.H = hh0Var2;
                org.telegram.messenger.g0.i3(hh0Var2, 4000L);
            }
        } else if (tr0Var.G != null && (hh0Var = tr0Var.H) != null) {
            org.telegram.messenger.g0.r(hh0Var);
            tr0Var.H.run();
            tr0Var.H = null;
            tr0Var.G = null;
        }
    }

    public void setHeaderEnabled(boolean z10) {
        org.telegram.ui.ActionBar.w4 w4Var = this.I;
        if (w4Var != null) {
            w4Var.setEnabled(z10);
        } else {
            this.H.setEnabled(z10);
        }
    }

    private void setPageOverscan(sr0 sr0Var) {
        if (this.f42086c2 && sr0Var != null) {
            sr0Var.j3 = true;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sr0Var.getLayoutParams();
            if (marginLayoutParams != null) {
                int i7 = marginLayoutParams.topMargin;
                int i10 = -this.f42092e2;
                if (i7 != i10 || marginLayoutParams.bottomMargin != (-this.f42096f2)) {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.bottomMargin = -this.f42096f2;
                    sr0Var.setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    public void setSearchItemVisibility(int i7) {
        org.telegram.ui.ActionBar.q0 q0Var = this.f42125q0;
        if (q0Var == null) {
            return;
        }
        if (this.I != null) {
            R(true, true);
        } else {
            q0Var.setVisibility(i7);
        }
    }

    public static void t(ys0 ys0Var, int i7, boolean z10) {
        tr0[] tr0VarArr = ys0Var.f42117n0;
        if (tr0VarArr[0].F == i7) {
            return;
        }
        tr0 tr0Var = tr0VarArr[1];
        tr0Var.F = i7;
        tr0Var.setVisibility(0);
        ys0Var.w0();
        ys0Var.B1(true);
        ys0Var.f42110k1 = z10;
        ys0Var.Y0();
        ys0Var.E(!ys0Var.F0(i7));
        ys0Var.I1(true);
    }

    public static int x(ys0 ys0Var, v4.h0 h0Var) {
        if (h0Var == ys0Var.f42094f0) {
            return 8;
        }
        if (h0Var == ys0Var.f42100h0) {
            return 9;
        }
        for (xs0 xs0Var : ys0Var.f42115m2.values()) {
            if (xs0Var.f41760c == h0Var) {
                return xs0Var.f41758a;
            }
        }
        return -1;
    }

    public static int y(ys0 ys0Var, v4.h0 h0Var) {
        if (h0Var == ys0Var.f42097g0) {
            return 8;
        }
        if (h0Var == ys0Var.f42103i0) {
            return 9;
        }
        for (xs0 xs0Var : ys0Var.f42115m2.values()) {
            if (xs0Var.d == h0Var) {
                return xs0Var.f41758a;
            }
        }
        return -1;
    }

    public static boolean z0(int i7) {
        if (i7 != 8 && i7 != 9 && !J0(i7)) {
            return false;
        }
        return true;
    }

    public final SpannableStringBuilder A() {
        if (this.f42078a2 == null) {
            this.f42078a2 = new SpannableStringBuilder();
            if (B0()) {
                this.f42078a2.append((CharSequence) org.telegram.messenger.hd.M0(2131746702, null));
            } else {
                this.f42078a2.append((CharSequence) "c");
                this.f42078a2.setSpan(new eq(2131231146, 0), 0, 1, 33);
                this.f42078a2.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.hd.M0(2131744809, null));
            }
        }
        return this.f42078a2;
    }

    public boolean A0() {
        return false;
    }

    public final vs0 A1(int i7) {
        xs0 y12;
        if (i7 == 8) {
            return this.f42097g0;
        }
        if (i7 == 9) {
            return this.f42103i0;
        }
        if (!J0(i7) || (y12 = y1(i7)) == null) {
            return null;
        }
        return y12.d;
    }

    public final void B(xr0 xr0Var, org.telegram.ui.ActionBar.e2 e2Var, long j3, int i7) {
        String K;
        if (j3 > 0) {
            K = org.telegram.messenger.q10.n(org.telegram.messenger.np.s1(e2Var.getCurrentAccount()).a2(Long.valueOf(j3)));
        } else {
            K = org.telegram.messenger.t3.K(org.telegram.messenger.np.s1(e2Var.getCurrentAccount()).M0(Long.valueOf(-j3)), false);
        }
        if (K == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        com.google.android.gms.internal.vision.e2.r(sb2, org.telegram.messenger.np.s1(e2Var.getCurrentAccount()).V2, "/", K, "/a/");
        sb2.append(i7);
        String sb3 = sb2.toString();
        xr0Var.n0(2131231757, new yf(this, sb3, e2Var, 22), org.telegram.messenger.hd.M0(2131744788, null), false, true);
    }

    public final boolean B0() {
        TLRPC.User a22;
        long j3 = this.f42114m1;
        if (j3 <= 0 || (a22 = org.telegram.messenger.np.s1(this.f42150y1.getCurrentAccount()).a2(Long.valueOf(j3))) == null || !a22.bot) {
            return false;
        }
        return true;
    }

    public final void B1(boolean z10) {
        tr0[] tr0VarArr;
        tr0[] tr0VarArr2;
        org.telegram.ui.ActionBar.q0 q0Var;
        v4.v0 v0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        v4.v0 v0Var2;
        int i7;
        int i10;
        boolean z14;
        boolean z15;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z16;
        v4.v0 v0Var3;
        int i16;
        int i17;
        boolean z17;
        int i18;
        boolean z18;
        int i19;
        boolean z19;
        boolean z20;
        int i20;
        v4.v0 v0Var4;
        wp0 wp0Var = this.f42080b0;
        if (wp0Var != null) {
            wp0Var.i();
        }
        int i21 = 0;
        while (true) {
            tr0VarArr = this.f42117n0;
            if (i21 >= tr0VarArr.length) {
                break;
            }
            tr0VarArr[i21].h.C0();
            i21++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tr0VarArr[z10 ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = org.telegram.messenger.g0.L(O0());
        layoutParams.rightMargin = 0;
        layoutParams.leftMargin = 0;
        v4.h0 adapter = tr0VarArr[z10 ? 1 : 0].h.getAdapter();
        v4.h0 h0Var = this.f42094f0;
        v4.y yVar = this.f42090e0;
        if (adapter == h0Var) {
            yVar.h(null);
        }
        boolean z21 = this.Y0;
        org.telegram.ui.ActionBar.w4 w4Var = this.I;
        nr0 nr0Var = this.G1;
        org.telegram.ui.ActionBar.k kVar = this.H;
        String str = "";
        org.telegram.ui.ActionBar.q0 q0Var2 = this.f42125q0;
        hs0 hs0Var = this.Q;
        int i22 = 100;
        if (z21 && this.X0) {
            tr0 tr0Var = tr0VarArr[z10 ? 1 : 0];
            if (tr0Var.f39794f == null) {
                tr0Var.f39794f = new v4.v0();
            }
            tr0 tr0Var2 = tr0VarArr[z10 ? 1 : 0];
            v4.v0 v0Var5 = tr0Var2.f39794f;
            ks0 ks0Var = this.V;
            rr0 rr0Var = this.m0;
            vr0 vr0Var = this.f42109k0;
            vr0 vr0Var2 = this.f42112l0;
            vr0 vr0Var3 = this.f42106j0;
            if (z10) {
                int i23 = tr0Var2.F;
                if (i23 != 0) {
                    v0Var4 = v0Var5;
                    if (i23 != 2 && i23 != 5 && i23 != 6 && (i23 != 7 || nr0Var.Y())) {
                        if (q0Var2 != null) {
                            str = q0Var2.getSearchField().getText().toString();
                        }
                        String str2 = str;
                        int i24 = tr0VarArr[z10 ? 1 : 0].F;
                        if (i24 == 1) {
                            if (vr0Var3 != null) {
                                vr0Var3.G(str2, false);
                                if (adapter != vr0Var3) {
                                    i1(adapter);
                                    tr0VarArr[z10 ? 1 : 0].h.setAdapter(vr0Var3);
                                }
                            }
                        } else if (i24 == 3) {
                            if (vr0Var2 != null) {
                                vr0Var2.G(str2, false);
                                if (adapter != vr0Var2) {
                                    i1(adapter);
                                    tr0VarArr[z10 ? 1 : 0].h.setAdapter(vr0Var2);
                                }
                            }
                        } else if (i24 == 4) {
                            if (vr0Var != null) {
                                vr0Var.G(str2, false);
                                if (adapter != vr0Var) {
                                    i1(adapter);
                                    tr0VarArr[z10 ? 1 : 0].h.setAdapter(vr0Var);
                                }
                            }
                        } else if (i24 == 7) {
                            if (rr0Var != null) {
                                rr0Var.F(str2, false);
                                if (adapter != rr0Var) {
                                    i1(adapter);
                                    tr0VarArr[z10 ? 1 : 0].h.setAdapter(rr0Var);
                                }
                            }
                        } else if (i24 == 11) {
                            if (ks0Var != null) {
                                ks0Var.E(this.Z0, str2);
                                if (adapter != ks0Var) {
                                    i1(adapter);
                                    tr0VarArr[z10 ? 1 : 0].h.setAdapter(ks0Var);
                                }
                            }
                        } else if (i24 == 15 && hs0Var != null && adapter != hs0Var) {
                            i1(adapter);
                            dq0 dq0Var = tr0VarArr[z10 ? 1 : 0].h;
                            hs0Var.f35341r = dq0Var;
                            dq0Var.setAdapter(hs0Var);
                        }
                    }
                }
                this.Y0 = false;
                sq0 sq0Var = this.M0;
                if (sq0Var != null) {
                    sq0Var.g(false);
                }
                this.X0 = false;
                B1(true);
                return;
            }
            v0Var4 = v0Var5;
            if (tr0Var2.h != null) {
                int i25 = tr0Var2.F;
                if (i25 == 1) {
                    if (adapter != vr0Var3) {
                        i1(adapter);
                        tr0VarArr[z10 ? 1 : 0].h.setAdapter(vr0Var3);
                    }
                    vr0Var3.f();
                } else if (i25 == 3) {
                    if (adapter != vr0Var2) {
                        i1(adapter);
                        tr0VarArr[z10 ? 1 : 0].h.setAdapter(vr0Var2);
                    }
                    vr0Var2.f();
                } else if (i25 == 4) {
                    if (adapter != vr0Var) {
                        i1(adapter);
                        tr0VarArr[z10 ? 1 : 0].h.setAdapter(vr0Var);
                    }
                    vr0Var.f();
                } else if (i25 == 7) {
                    if (adapter != rr0Var) {
                        i1(adapter);
                        tr0VarArr[z10 ? 1 : 0].h.setAdapter(rr0Var);
                    }
                    rr0Var.f();
                } else if (i25 == 11) {
                    if (adapter != ks0Var) {
                        i1(adapter);
                        tr0VarArr[z10 ? 1 : 0].h.setAdapter(ks0Var);
                    }
                    ks0Var.f();
                }
            }
            tr0VarArr2 = tr0VarArr;
            q0Var = q0Var2;
            v0Var3 = v0Var4;
            i11 = 4;
            z13 = false;
            z16 = false;
            i13 = 8;
        } else {
            tr0 tr0Var3 = tr0VarArr[z10 ? 1 : 0];
            if (tr0Var3.f39793e == null) {
                tr0Var3.f39793e = new v4.v0();
            }
            tr0 tr0Var4 = tr0VarArr[z10 ? 1 : 0];
            v4.v0 v0Var6 = tr0Var4.f39793e;
            tr0Var4.h.setPinnedHeaderShadowDrawable(null);
            int i26 = tr0VarArr[z10 ? 1 : 0].F;
            if (i26 == 8 || J0(i26)) {
                layoutParams.topMargin = org.telegram.messenger.g0.L(O0());
            }
            dq0 dq0Var2 = tr0VarArr[z10 ? 1 : 0].h;
            int paddingLeft = dq0Var2.getPaddingLeft();
            tr0 tr0Var5 = tr0VarArr[z10 ? 1 : 0];
            tr0VarArr2 = tr0VarArr;
            dq0 dq0Var3 = tr0Var5.h;
            int j02 = j0(tr0Var5.F);
            dq0Var3.f39401h3 = j02;
            int paddingRight = tr0VarArr2[z10 ? 1 : 0].h.getPaddingRight();
            dq0 dq0Var4 = tr0VarArr2[z10 ? 1 : 0].h;
            q0Var = q0Var2;
            int i02 = i0(I0());
            dq0Var4.f39402i3 = i02;
            dq0Var2.setPadding(paddingLeft, j02, paddingRight, i02);
            int i27 = tr0VarArr2[z10 ? 1 : 0].F;
            int[] iArr = this.f42123p1;
            v4.h0 h0Var2 = this.N;
            View view = this.f42076a0;
            js0 js0Var = this.U;
            mr0 mr0Var = this.S;
            gr0 gr0Var = this.W;
            ns0[] ns0VarArr = this.f42144w1;
            if (i27 == 0) {
                v4.h0 h0Var3 = this.K;
                if (adapter != h0Var3) {
                    i1(adapter);
                    tr0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var3);
                }
                int i28 = -org.telegram.messenger.g0.L(1.0f);
                layoutParams.rightMargin = i28;
                layoutParams.leftMargin = i28;
                ns0 ns0Var = ns0VarArr[0];
                if (ns0Var.h && !ns0Var.f37695e.isEmpty()) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                i22 = iArr[0];
                tr0VarArr2[z10 ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.B0);
                ns0 ns0Var2 = ns0VarArr[0];
                if (ns0Var2.f37712x == null) {
                    ns0Var2.f37712x = new v4.v0();
                }
                v0Var = ns0VarArr[0].f37712x;
                z13 = z19;
                z11 = false;
            } else {
                if (i27 == 1) {
                    ns0 ns0Var3 = ns0VarArr[1];
                    if (ns0Var3.h && !ns0Var3.f37695e.isEmpty()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (adapter != h0Var2) {
                        i1(adapter);
                        tr0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var2);
                    }
                } else if (i27 == 2) {
                    ns0 ns0Var4 = ns0VarArr[2];
                    if (ns0Var4.h && !ns0Var4.f37695e.isEmpty()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    v4.h0 h0Var4 = this.O;
                    if (adapter != h0Var4) {
                        i1(adapter);
                        tr0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var4);
                    }
                } else {
                    if (i27 == 3) {
                        v4.h0 h0Var5 = this.M;
                        if (adapter != h0Var5) {
                            i1(adapter);
                            tr0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var5);
                        }
                    } else if (i27 == 4) {
                        ns0 ns0Var5 = ns0VarArr[4];
                        if (ns0Var5.h && !ns0Var5.f37695e.isEmpty()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        v4.h0 h0Var6 = this.P;
                        if (adapter != h0Var6) {
                            i1(adapter);
                            tr0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var6);
                        }
                    } else {
                        if (i27 == 5) {
                            v4.h0 h0Var7 = this.R;
                            if (adapter != h0Var7) {
                                i1(adapter);
                                tr0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var7);
                            }
                        } else if (i27 == 15) {
                            if (adapter != hs0Var) {
                                i1(adapter);
                                dq0 dq0Var5 = tr0VarArr2[z10 ? 1 : 0].h;
                                hs0Var.f35341r = dq0Var5;
                                dq0Var5.setAdapter(hs0Var);
                            }
                        } else if (i27 == 6) {
                            if (adapter != mr0Var) {
                                i1(adapter);
                                tr0VarArr2[z10 ? 1 : 0].h.setAdapter(mr0Var);
                            }
                        } else if (i27 == 7) {
                            v4.h0 h0Var8 = this.f42087d0;
                            if (adapter != h0Var8) {
                                i1(adapter);
                                tr0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var8);
                            }
                        } else if (z0(i27)) {
                            v4.h0 z110 = z1(tr0VarArr2[z10 ? 1 : 0].F);
                            if (adapter != z110) {
                                i1(adapter);
                                tr0VarArr2[z10 ? 1 : 0].h.setAdapter(z110);
                                tr0VarArr2[z10 ? 1 : 0].h.getClass();
                            }
                            tr0 tr0Var6 = tr0VarArr2[z10 ? 1 : 0];
                            if (tr0Var6.F != 9) {
                                yVar.h(tr0Var6.h);
                            }
                            i22 = iArr[1];
                        } else {
                            int i29 = tr0VarArr2[z10 ? 1 : 0].F;
                            if (i29 == 10) {
                                v4.h0 h0Var9 = this.T;
                                if (adapter != h0Var9) {
                                    i1(adapter);
                                    tr0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var9);
                                }
                            } else if (i29 == 11) {
                                if (adapter != js0Var) {
                                    i1(adapter);
                                    tr0VarArr2[z10 ? 1 : 0].h.setAdapter(js0Var);
                                    v4.y yVar2 = js0Var.f36177w;
                                    dq0 dq0Var6 = tr0VarArr2[z10 ? 1 : 0].h;
                                    js0Var.f36176s = dq0Var6;
                                    yVar2.h(dq0Var6);
                                }
                                v0Var = js0Var.f36175r;
                                z11 = true;
                                z13 = false;
                            } else if (i29 == 12) {
                                if (adapter != null) {
                                    i1(adapter);
                                    tr0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (gr0Var.getParent() != tr0VarArr2[z10 ? 1 : 0]) {
                                    org.telegram.messenger.g0.E2(gr0Var);
                                    tr0VarArr2[z10 ? 1 : 0].addView(gr0Var, c8.ja.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
                                    p1(org.telegram.messenger.g0.L(56.0f) + this.d2, gr0Var);
                                }
                            } else if (i29 == 13) {
                                if (adapter != null) {
                                    i1(adapter);
                                    tr0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != tr0VarArr2[z10 ? 1 : 0]) {
                                    org.telegram.messenger.g0.E2(view);
                                    tr0VarArr2[z10 ? 1 : 0].addView(view);
                                    p1(this.d2, view);
                                }
                            } else if (i29 == 14) {
                                if (adapter != null) {
                                    i1(adapter);
                                    tr0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (wp0Var != null && wp0Var.getParent() != tr0VarArr2[z10 ? 1 : 0]) {
                                    org.telegram.messenger.g0.E2(wp0Var);
                                    tr0VarArr2[z10 ? 1 : 0].addView(wp0Var);
                                    tr0VarArr2[z10 ? 1 : 0].f39798w.setVisibility(4);
                                }
                            }
                        }
                        v0Var = v0Var6;
                        z11 = false;
                        z13 = false;
                    }
                    v0Var = v0Var6;
                    z11 = true;
                    z13 = false;
                }
                z13 = z12;
                v0Var = v0Var6;
                z11 = true;
            }
            K1(tr0VarArr2[z10 ? 1 : 0]);
            if (z11) {
                tr0VarArr2[z10 ? 1 : 0].h.setSections(false);
                v0Var2 = v0Var;
            } else {
                dq0 dq0Var7 = tr0VarArr2[z10 ? 1 : 0].h;
                dq0Var7.getClass();
                v0Var2 = v0Var;
                org.telegram.ui.ActionBar.q6.l(dq0Var7, 20, org.telegram.ui.ActionBar.j6.f28941i6, dq0Var7.f40069o2);
                dq0Var7.U2 = false;
                dq0Var7.I2 = null;
                dq0Var7.J2 = null;
                dq0Var7.M2 = 0.0f;
                dq0Var7.N2 = null;
                dq0Var7.O2 = null;
                dq0Var7.K2 = null;
                ej0 ej0Var = dq0Var7.H2;
                if (ej0Var != null) {
                    dq0Var7.q0(ej0Var);
                    dq0Var7.H2 = null;
                }
                n9 n9Var = dq0Var7.S2;
                if (n9Var != null) {
                    dq0Var7.q0(n9Var);
                    dq0Var7.S2 = null;
                }
            }
            J1(tr0VarArr2[z10 ? 1 : 0]);
            tr0 tr0Var7 = tr0VarArr2[z10 ? 1 : 0];
            if (tr0Var7.F == 11) {
                tr0Var7.h.setItemAnimator(tr0Var7.d);
            } else {
                tr0Var7.h.setItemAnimator(null);
                if (js0Var != null && tr0VarArr2[z10 ? 1 : 0].h == js0Var.f36176s) {
                    v4.y yVar3 = js0Var.f36177w;
                    js0Var.f36176s = null;
                    yVar3.h(null);
                }
            }
            if (gr0Var != null && tr0VarArr2[z10 ? 1 : 0].F != 12 && gr0Var.getParent() == tr0VarArr2[z10 ? 1 : 0]) {
                gr0Var.f46216a.onRemoveFromParent();
                tr0VarArr2[z10 ? 1 : 0].removeView(gr0Var);
            }
            if (view != null && tr0VarArr2[z10 ? 1 : 0].F != 13) {
                ViewParent parent = view.getParent();
                tr0 tr0Var8 = tr0VarArr2[z10 ? 1 : 0];
                if (parent == tr0Var8) {
                    tr0Var8.removeView(view);
                }
            }
            if (wp0Var != null && tr0VarArr2[z10 ? 1 : 0].F != 14) {
                ViewParent parent2 = wp0Var.getParent();
                tr0 tr0Var9 = tr0VarArr2[z10 ? 1 : 0];
                if (parent2 == tr0Var9) {
                    tr0Var9.removeView(wp0Var);
                }
            }
            int i30 = tr0VarArr2[z10 ? 1 : 0].F;
            if (i30 != 0 && i30 != 11 && !z0(i30) && (i16 = tr0VarArr2[z10 ? 1 : 0].F) != 2 && i16 != 5 && i16 != 6 && ((i16 != 7 || nr0Var.Y()) && (i17 = tr0VarArr2[z10 ? 1 : 0].F) != 10 && i17 != 13 && i17 != 14)) {
                if (z10) {
                    if (q0Var != null && q0Var.getVisibility() == 4) {
                        if (w4Var != null) {
                            z18 = w4Var.G;
                        } else {
                            z18 = kVar.f29304o0;
                        }
                        if (!z18) {
                            if (I()) {
                                this.A0 = 1;
                                setSearchItemVisibility(0);
                            } else {
                                if (I0()) {
                                    i19 = 8;
                                } else {
                                    i19 = 4;
                                }
                                setSearchItemVisibility(i19);
                            }
                            float f10 = z10 ? 1.0f : 0.0f;
                            this.f42129r0 = l0(f10);
                            M1(1.0f - f10);
                            z17 = false;
                        }
                    }
                    z17 = false;
                    this.A0 = 0;
                    this.f42129r0 = 1.0f;
                } else {
                    z17 = false;
                    if (q0Var != null && q0Var.getVisibility() == 4) {
                        if (I()) {
                            this.A0 = 0;
                            this.f42129r0 = 1.0f;
                            setSearchItemVisibility(0);
                        } else {
                            if (I0()) {
                                i18 = 8;
                            } else {
                                i18 = 4;
                            }
                            setSearchItemVisibility(i18);
                            this.f42129r0 = 0.0f;
                        }
                    }
                }
                I1(z17);
            } else if (z10) {
                this.A0 = 2;
            } else {
                this.A0 = 0;
                if (q0Var != null) {
                    if (!I0() && !this.Y0) {
                        i7 = 4;
                    } else {
                        i7 = 8;
                    }
                    setSearchItemVisibility(i7);
                }
            }
            int i31 = tr0VarArr2[z10 ? 1 : 0].F;
            if (i31 == 6) {
                if (!mr0Var.f37365e && !mr0Var.h && mr0Var.d.isEmpty()) {
                    mr0Var.E(0L);
                }
            } else if (i31 != 7) {
                if (z0(i31)) {
                    vs0 z111 = z1(tr0VarArr2[z10 ? 1 : 0].F);
                    if (z111 != null) {
                        fi.k6 k6Var = z111.f41146s;
                        z111.P();
                        pq0 pq0Var = tr0VarArr2[z10 ? 1 : 0].f39798w;
                        if (k6Var != null && (k6Var.k() || (t0() && k6Var.g() > 0))) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        pq0Var.e(z14, z10);
                        if (k6Var != null && k6Var.g() > 0 && !G0()) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z13 = z15;
                    }
                } else {
                    int i32 = tr0VarArr2[z10 ? 1 : 0].F;
                    if (i32 != 10 && i32 != 11 && i32 != 12 && i32 != 13 && i32 != 14) {
                        if (i32 == 15) {
                            i32 = 8;
                        }
                        ns0 ns0Var6 = ns0VarArr[i32];
                        if (!ns0Var6.f37697g && !ns0Var6.f37698i[0] && ns0Var6.f37692a.isEmpty()) {
                            ns0VarArr[i32].f37697g = true;
                            h0Var2.f();
                            if (i32 == 0) {
                                int i33 = ns0VarArr[0].f37706q;
                                if (i33 == 1) {
                                    i10 = 6;
                                } else if (i33 == 2) {
                                    i10 = 7;
                                }
                                org.telegram.ui.ActionBar.e2 e2Var = this.f42150y1;
                                e2Var.getMediaDataController().N0(this.f42114m1, 50, 0, 0, i10, this.G, 1, e2Var.getClassGuid(), ns0VarArr[i10].f37705p, null, null);
                            }
                            i10 = i32;
                            org.telegram.ui.ActionBar.e2 e2Var2 = this.f42150y1;
                            e2Var2.getMediaDataController().N0(this.f42114m1, 50, 0, 0, i10, this.G, 1, e2Var2.getClassGuid(), ns0VarArr[i10].f37705p, null, null);
                        }
                    }
                }
            }
            int i34 = tr0VarArr2[z10 ? 1 : 0].F;
            if (i34 == 8 || J0(i34)) {
                i11 = 4;
                tr0 tr0Var10 = tr0VarArr2[z10 ? 1 : 0];
                pq0 pq0Var2 = tr0Var10.f39798w;
                boolean J0 = J0(tr0Var10.F);
                int w12 = w1(tr0VarArr2[z10 ? 1 : 0].F);
                i9 i9Var = pq0Var2.f33705b;
                hi.d dVar = pq0Var2.f33708f;
                if (!J0 && !H0() && !B0()) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                i9Var.setVisibility(i12);
                if (J0) {
                    dVar.setVisibility(0);
                    dVar.h(org.telegram.messenger.hd.M0(2131744805, null), false);
                    i13 = 8;
                } else if (H0()) {
                    i13 = 8;
                    dVar.setVisibility(8);
                } else {
                    i13 = 8;
                    pq0Var2.setStickerType(11);
                    if (!G0()) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                    dVar.setVisibility(i14);
                    dVar.h(A(), false);
                }
                if (J0) {
                    pq0Var2.d.setText(org.telegram.messenger.hd.M0(2131744783, null));
                    pq0Var2.f33707e.setText(org.telegram.messenger.hd.M0(2131744784, null));
                } else {
                    xh.l lVar = pq0Var2.d;
                    if (!G0()) {
                        if (I0()) {
                            i15 = 2131748176;
                        } else {
                            i15 = 2131748147;
                        }
                    } else {
                        i15 = 2131748204;
                    }
                    lVar.setText(org.telegram.messenger.hd.M0(i15, null));
                    z70 z70Var = pq0Var2.f33707e;
                    if (I0()) {
                        str = org.telegram.messenger.hd.M0(2131748148, null);
                    }
                    z70Var.setText(str);
                }
                dVar.setOnClickListener(new bi.c3(this, J0, w12, 1));
            } else {
                tr0 tr0Var11 = tr0VarArr2[z10 ? 1 : 0];
                if (tr0Var11.F == 9) {
                    if (H0()) {
                        tr0VarArr2[z10 ? 1 : 0].f39798w.f33705b.setVisibility(8);
                        tr0VarArr2[z10 ? 1 : 0].f39798w.f33708f.setVisibility(8);
                    } else {
                        tr0VarArr2[z10 ? 1 : 0].f39798w.f33705b.setVisibility(0);
                        tr0VarArr2[z10 ? 1 : 0].f39798w.setStickerType(11);
                        tr0VarArr2[z10 ? 1 : 0].f39798w.f33708f.setVisibility(0);
                        tr0VarArr2[z10 ? 1 : 0].f39798w.f33708f.h(A(), false);
                    }
                    tr0VarArr2[z10 ? 1 : 0].f39798w.d.setText(org.telegram.messenger.hd.M0(2131748246, null));
                    z70 z70Var2 = tr0VarArr2[z10 ? 1 : 0].f39798w.f33707e;
                    if (I0()) {
                        str = org.telegram.messenger.hd.M0(2131748247, null);
                    }
                    z70Var2.setText(str);
                    i11 = 4;
                    tr0VarArr2[z10 ? 1 : 0].f39798w.f33708f.setOnClickListener(new xo0(this, 4));
                    i13 = 8;
                } else {
                    i11 = 4;
                    tr0Var11.f39798w.f33705b.setVisibility(0);
                    tr0VarArr2[z10 ? 1 : 0].f39798w.setStickerType(1);
                    tr0VarArr2[z10 ? 1 : 0].f39798w.d.setText(org.telegram.messenger.hd.M0(2131748167, null));
                    tr0VarArr2[z10 ? 1 : 0].f39798w.f33707e.setText(org.telegram.messenger.hd.M0(2131745807, null));
                    i13 = 8;
                    tr0VarArr2[z10 ? 1 : 0].f39798w.f33708f.setVisibility(8);
                }
            }
            z16 = false;
            tr0VarArr2[z10 ? 1 : 0].h.setVisibility(0);
            v0Var3 = v0Var2;
        }
        int i35 = i22;
        tr0 tr0Var12 = tr0VarArr2[z10 ? 1 : 0];
        tr0Var12.f39791b = z13;
        F1(tr0Var12, z16);
        tr0VarArr2[z10 ? 1 : 0].f39799x.y1(i35);
        tr0VarArr2[z10 ? 1 : 0].h.a0();
        if (v0Var3 != null) {
            tr0VarArr2[z10 ? 1 : 0].h.setRecycledViewPool(v0Var3);
            tr0VarArr2[z10 ? 1 : 0].f39795n.setRecycledViewPool(v0Var3);
        }
        if (this.A0 == 2) {
            if (w4Var != null) {
                z20 = w4Var.G;
            } else {
                z20 = kVar.f29304o0;
            }
            if (z20) {
                this.C0 = true;
                if (w4Var != null) {
                    w4Var.m(true);
                } else {
                    kVar.n(true);
                }
                this.A0 = 0;
                this.f42129r0 = 0.0f;
                if (q0Var != null) {
                    if (I0()) {
                        i20 = i13;
                    } else {
                        i20 = i11;
                    }
                    setSearchItemVisibility(i20);
                }
                I1(false);
            }
        }
    }

    public final void C(xr0 xr0Var) {
        float f10;
        final View[] viewArr = {xr0Var.n0(2131232439, new Runnable(this) {
            public final ys0 f36875b;

            {
                this.f36875b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        ys0 ys0Var = this.f36875b;
                        ys0Var.getClass();
                        View[] viewArr2 = viewArr;
                        ys0Var.Q1(viewArr2[0], viewArr2[1]);
                        return;
                    default:
                        ys0 ys0Var2 = this.f36875b;
                        ys0Var2.getClass();
                        View[] viewArr3 = viewArr;
                        ys0Var2.R1(viewArr3[0], viewArr3[1]);
                        return;
                }
            }
        }, org.telegram.messenger.hd.M0(2131748650, null), false, false), xr0Var.n0(2131232440, new Runnable(this) {
            public final ys0 f36875b;

            {
                this.f36875b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        ys0 ys0Var = this.f36875b;
                        ys0Var.getClass();
                        View[] viewArr2 = viewArr;
                        ys0Var.Q1(viewArr2[0], viewArr2[1]);
                        return;
                    default:
                        ys0 ys0Var2 = this.f36875b;
                        ys0Var2.getClass();
                        View[] viewArr3 = viewArr;
                        ys0Var2.R1(viewArr3[0], viewArr3[1]);
                        return;
                }
            }
        }, org.telegram.messenger.hd.M0(2131748649, null), false, false)};
        View view = viewArr[0];
        float f11 = 0.5f;
        if (view != null) {
            view.setEnabled(J());
            View view2 = viewArr[0];
            if (J()) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            view2.setAlpha(f10);
        }
        View view3 = viewArr[1];
        if (view3 != null) {
            view3.setEnabled(K());
            View view4 = viewArr[1];
            if (K()) {
                f11 = 1.0f;
            }
            view4.setAlpha(f11);
        }
    }

    public final boolean C0() {
        org.telegram.ui.ActionBar.e2 e2Var;
        if (this.f42098g1 != null && (e2Var = this.f42150y1) != null) {
            return org.telegram.messenger.t3.V(e2Var.getMessagesController().M0(Long.valueOf(this.f42098g1.f28052id)));
        }
        return false;
    }

    public final void C1(org.telegram.ui.ActionBar.z0 z0Var, org.telegram.ui.ActionBar.z0 z0Var2, Runnable runnable) {
        if (this.L1) {
            return;
        }
        if (!z0Var2.getCheckView().f34663a.f32441q && z0Var.getCheckView().f34663a.f32441q) {
            float f10 = -this.f42141v1;
            this.f42141v1 = f10;
            org.telegram.messenger.g0.F3(f10, z0Var, null);
            return;
        }
        z0Var.setChecked(!z0Var.getCheckView().f34663a.f32441q);
        runnable.run();
    }

    public final void D(sr0 sr0Var, int i7, SparseBooleanArray sparseBooleanArray) {
        int childCount = sr0Var.getChildCount();
        pz pzVar = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = sr0Var.getChildAt(i10);
            if (childAt instanceof pz) {
                pzVar = childAt;
            }
        }
        if (pzVar != null) {
            sr0Var.removeView(pzVar);
        }
        getViewTreeObserver().addOnPreDrawListener(new ar0(this, sr0Var, sparseBooleanArray, pzVar, i7));
    }

    public final boolean D0() {
        int i7 = 0;
        while (true) {
            tr0[] tr0VarArr = this.f42117n0;
            if (i7 >= tr0VarArr.length) {
                return false;
            }
            tr0 tr0Var = tr0VarArr[i7];
            if (tr0Var != null) {
                dq0 dq0Var = tr0Var.h;
                if (dq0Var == null || !dq0Var.c0()) {
                    sr0 sr0Var = tr0VarArr[i7].f39795n;
                    if (sr0Var != null && sr0Var.c0()) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
            i7++;
        }
    }

    public final void D1() {
        if (this.I == null) {
            try {
                int s02 = s0(org.telegram.ui.ActionBar.j6.f29243y8);
                int s03 = s0(org.telegram.ui.ActionBar.j6.f29262z8);
                if (s02 != this.f42131r2 || s03 != this.f42135s2) {
                    this.f42131r2 = s02;
                    this.f42135s2 = s03;
                    org.telegram.ui.ActionBar.q0[] q0VarArr = {this.f42146x0, this.f42143w0, this.f42149y0, this.f42151z0, this.f42119o0};
                    for (int i7 = 0; i7 < 5; i7++) {
                        org.telegram.ui.ActionBar.q0 q0Var = q0VarArr[i7];
                        if (q0Var != null) {
                            q0Var.setIconColor(s02);
                            if (q0Var.getBackground() != null) {
                                org.telegram.ui.ActionBar.j6.H1(q0Var.getBackground(), s03, true);
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void E(boolean z10) {
        int i7;
        fh0 fh0Var = this.f42140v0;
        if (fh0Var != null && this.Z1 != z10) {
            this.Z1 = z10;
            if (!z10 && fh0Var.getAnimatedDrawable().f33573b0 < 20) {
                fh0Var.getAnimatedDrawable().P(0);
            } else {
                ch0 animatedDrawable = fh0Var.getAnimatedDrawable();
                if (this.Z1) {
                    i7 = 50;
                } else {
                    i7 = 100;
                }
                animatedDrawable.P(i7);
            }
            fh0Var.getAnimatedDrawable().start();
        }
    }

    public final boolean E0() {
        wp0 wp0Var = this.f42080b0;
        if (wp0Var == null || !wp0Var.g()) {
            zp0 zp0Var = this.f42084c0;
            if (zp0Var != null && zp0Var.f48495f) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void E1() {
        if (D0()) {
            post(new wo0(this, 13));
            return;
        }
        fr0 fr0Var = this.K;
        if (fr0Var != null) {
            fr0Var.f();
        }
        ls0 ls0Var = this.N;
        if (ls0Var != null) {
            ls0Var.f();
        }
        ls0 ls0Var2 = this.O;
        if (ls0Var2 != null) {
            ls0Var2.f();
        }
        ms0 ms0Var = this.M;
        if (ms0Var != null) {
            ms0Var.X(false);
        }
        ls0 ls0Var3 = this.P;
        if (ls0Var3 != null) {
            ls0Var3.f();
        }
        hs0 hs0Var = this.Q;
        if (hs0Var != null) {
            hs0Var.f();
        }
        or0 or0Var = this.R;
        if (or0Var != null) {
            or0Var.f();
        }
        ir0 ir0Var = this.f42094f0;
        if (ir0Var != null) {
            ir0Var.f();
        }
        for (xs0 xs0Var : this.f42115m2.values()) {
            xs0Var.f41760c.f();
        }
    }

    public final void F(int i7) {
        int i10;
        tr0 g02 = g0(this.f42134s1);
        this.f42132s = -1;
        if (g02 != null) {
            g02.h.C0();
            this.f42137t1 = i7;
            g02.f39795n.setVisibility(0);
            if (z0(this.f42134s1)) {
                g02.f39795n.setAdapter(A1(this.f42134s1));
            } else {
                g02.f39795n.setAdapter(this.L);
            }
            sr0 sr0Var = g02.f39795n;
            int paddingLeft = sr0Var.getPaddingLeft();
            sr0 sr0Var2 = g02.f39795n;
            int j02 = j0(g02.F);
            sr0Var2.f39401h3 = j02;
            int paddingRight = g02.f39795n.getPaddingRight();
            sr0 sr0Var3 = g02.f39795n;
            int i02 = i0(I0());
            sr0Var3.f39402i3 = i02;
            sr0Var.setPadding(paddingLeft, j02, paddingRight, i02);
            g02.f39796r.y1(i7);
            g02.f39795n.a0();
            int i11 = 0;
            while (true) {
                tr0[] tr0VarArr = this.f42117n0;
                if (i11 >= tr0VarArr.length) {
                    break;
                }
                tr0 tr0Var = tr0VarArr[i11];
                if (tr0Var != null && ((i10 = tr0Var.F) == 0 || z0(i10))) {
                    org.telegram.messenger.g0.a4(tr0VarArr[i11].h);
                }
                i11++;
            }
            this.f42130r1 = true;
            if (this.f42134s1 == 0) {
                this.f42144w1[0].g(true);
            }
            this.f42126q1 = 0.0f;
            j1();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.M1.d();
            ofFloat.addUpdateListener(new uq0(this, g02, 1));
            ofFloat.addListener(new ki.m2(this, z0(g02.F) ? 1 : 0, i7, 2));
            ofFloat.setInterpolator(er.f34420f);
            ofFloat.setStartDelay(100L);
            ofFloat.setDuration(350L);
            ofFloat.start();
        }
    }

    public final boolean F0(int i7) {
        if (i7 == 7) {
            return this.G1.Y();
        }
        if (!G0() && i7 != 0 && !z0(i7) && i7 != 2 && i7 != 5 && i7 != 6 && i7 != 11 && i7 != 10 && i7 != 13 && i7 != 14 && i7 != 15) {
            return true;
        }
        return false;
    }

    public final void F1(tr0 tr0Var, boolean z10) {
        boolean z11;
        Integer num = 1;
        int i7 = 0;
        if (tr0Var.f39791b && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        zi0 fastScroll = tr0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = tr0Var.f39792c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            tr0Var.f39792c.cancel();
        }
        if (!z10) {
            fastScroll.animate().setListener(null).cancel();
            if (!z11) {
                i7 = 8;
            }
            fastScroll.setVisibility(i7);
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
            tr0Var.f39792c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(num);
        } else if (!z11 && fastScroll.getTag() != null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, property, fastScroll.getAlpha(), 0.0f);
            ofFloat2.addListener(new org.telegram.ui.nn(fastScroll));
            tr0Var.f39792c = ofFloat2;
            ofFloat2.setDuration(150L).start();
            fastScroll.animate().setListener(null).cancel();
            fastScroll.setTag(null);
        }
    }

    public final void G() {
        int i7 = this.d2;
        int i10 = this.f42124p2;
        p1((org.telegram.messenger.g0.L(6.666f) + i7) - f42074w2, this.S0);
        int i11 = i7 + i10;
        p1(i11, this.L0);
        p1(i11, this.E0);
        p1(org.telegram.messenger.g0.L(52.0f) + i7 + i10, this.N0);
        p1(org.telegram.messenger.g0.L(4.0f) + i7 + i10, this.M0);
        p1(org.telegram.messenger.g0.L(48.0f) + i7 + i10, this.f42084c0);
        if (this.f42113l2 != i10) {
            this.f42113l2 = i10;
            Runnable runnable = this.f42111k2;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public boolean G0() {
        if (TextUtils.isEmpty(getStoriesHashtag()) && getStoriesArea() == null) {
            return false;
        }
        return true;
    }

    public final void G1() {
        boolean z10;
        float f10;
        org.telegram.ui.ActionBar.q0 q0Var = this.f42143w0;
        if (q0Var != null) {
            if (!this.f42150y1.getMessagesController().A2(this.f42114m1) && !u0()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                f10 = 0.5f;
            } else {
                f10 = 1.0f;
            }
            q0Var.setAlpha(f10);
            if (z10 && q0Var.getBackground() != null) {
                q0Var.setBackground(null);
            } else if (!z10 && q0Var.getBackground() == null) {
                int i7 = org.telegram.ui.ActionBar.j6.f29262z8;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(s0(i7), 5, -1);
                org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
                q0Var.setBackground(h02);
                org.telegram.ui.ActionBar.q6.j(q0Var, h02, null, M, this.I1);
            }
        }
    }

    public final boolean H() {
        boolean B0 = B0();
        long j3 = this.f42114m1;
        org.telegram.ui.ActionBar.e2 e2Var = this.f42150y1;
        if (B0) {
            TLRPC.User a22 = org.telegram.messenger.np.s1(e2Var.getCurrentAccount()).a2(Long.valueOf(j3));
            if (a22 == null || !a22.bot || !a22.bot_can_edit) {
                return false;
            }
            return true;
        } else if (!I0()) {
            if (e2Var == null || !e2Var.getMessagesController().P1().h(j3)) {
                return false;
            }
            return true;
        } else {
            return true;
        }
    }

    public boolean H0() {
        return false;
    }

    public final void H1() {
        int i7;
        wp0 wp0Var = this.f42080b0;
        if (wp0Var != null) {
            int L = org.telegram.messenger.g0.L(48.0f) + this.d2;
            vr vrVar = this.S0;
            if (vrVar != null) {
                i7 = (int) vrVar.c(org.telegram.messenger.g0.L(7.0f));
            } else {
                i7 = 0;
            }
            wp0Var.setPaddingTop(L + i7);
        }
    }

    public boolean I() {
        return !(this instanceof r20);
    }

    public boolean I0() {
        return false;
    }

    public final void I1(boolean z10) {
        wp0 wp0Var;
        zp0 zp0Var;
        boolean z11 = true;
        R(true, true);
        fh0 fh0Var = this.f42140v0;
        if (fh0Var == null) {
            return;
        }
        float f10 = 0.0f;
        if (!this.Y0 && (((wp0Var = this.f42080b0) == null || !wp0Var.g()) && ((zp0Var = this.f42084c0) == null || !zp0Var.f48495f))) {
            f10 = Utilities.i(this.f42129r0 + this.f42133s0, 1.0f, 0.0f);
        }
        fh0Var.setAlpha(f10);
        if (z10) {
            if (k0(1.0f) <= 0.5f) {
                z11 = false;
            }
            E(z11);
        } else if (this.A0 == 2) {
            if (this.f42133s0 <= 0.1f) {
                z11 = false;
            }
            E(z11);
        } else {
            if (this.f42129r0 >= 0.1f) {
                z11 = false;
            }
            E(z11);
        }
    }

    public final boolean J() {
        tr0 tr0Var;
        tr0[] tr0VarArr = this.f42117n0;
        if (tr0VarArr != null && (tr0Var = tr0VarArr[0]) != null) {
            boolean z02 = z0(tr0Var.F);
            int i7 = this.f42123p1[z02 ? 1 : 0];
            if (i7 != h0(z02 ? 1 : 0, i7, true)) {
                return true;
            }
        }
        return false;
    }

    public final void J1(tr0 tr0Var) {
        boolean z10;
        boolean b12 = tr0Var.h.b1();
        if (b12) {
            tr0Var.h.setSectionsDrawBackground(this.f42086c2);
        }
        if (this.f42086c2 && !b12 && tr0Var.F != 15) {
            z10 = true;
        } else {
            z10 = false;
        }
        tr0Var.setDrawPageBackground(z10);
        if (tr0Var.F == 15) {
            Drawable drawable = tr0Var.P;
            if (drawable == null) {
                drawable = tr0Var.getBackground();
            }
            Drawable e10 = hi.x5.e(drawable, this.f42150y1.getCurrentAccount(), this.f42114m1, org.telegram.ui.ActionBar.j6.I.q());
            if (!this.f42086c2) {
                tr0Var.setWallpaper(null);
                tr0Var.setBackground(e10);
                tr0Var.setOutlineProvider(new bg.p0(15));
                tr0Var.setClipToOutline(true);
                return;
            }
            tr0Var.setBackground(null);
            tr0Var.setClipToOutline(false);
            tr0Var.setWallpaper(e10);
            return;
        }
        tr0Var.setClipToOutline(false);
        tr0Var.setBackground(null);
        tr0Var.setWallpaper(null);
    }

    public final boolean K() {
        tr0 tr0Var;
        tr0[] tr0VarArr = this.f42117n0;
        if (tr0VarArr == null || (tr0Var = tr0VarArr[0]) == null) {
            return false;
        }
        if (this.n1 && z0(tr0Var.F)) {
            return false;
        }
        boolean z02 = z0(tr0VarArr[0].F);
        int i7 = this.f42123p1[z02 ? 1 : 0];
        if (i7 == h0(z02 ? 1 : 0, i7, false)) {
            return false;
        }
        return true;
    }

    public final boolean K0() {
        if (!H() || ((getClosestTab() != 8 && getClosestTab() != 13 && !J0(getClosestTab())) || !this.F1)) {
            wp0 wp0Var = this.f42080b0;
            if (wp0Var == null || !wp0Var.g()) {
                zp0 zp0Var = this.f42084c0;
                if ((zp0Var == null || !zp0Var.f48495f) && !this.f42130r1 && !this.f42107j1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void K1(tr0 tr0Var) {
        boolean z10;
        float f10;
        int i7;
        float f11;
        float f12;
        int i10 = tr0Var.F;
        if (i10 != 0 && !z0(i10)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 12.0f;
        }
        if (z10) {
            i7 = 8;
        } else {
            i7 = 12;
        }
        float f13 = i7 + 48;
        if (z10) {
            f11 = 0.0f;
        } else {
            f11 = 12.0f;
        }
        if (z10) {
            f12 = 0.0f;
        } else {
            f12 = 12.0f;
        }
        FrameLayout.LayoutParams d = c8.ja.d(-1, -1.0f, 119, f10, f13, f11, f12);
        d.topMargin = n0(tr0Var.F) + d.topMargin;
        ViewGroup.LayoutParams layoutParams = tr0Var.f39797s.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2.leftMargin == d.leftMargin && layoutParams2.topMargin == d.topMargin && layoutParams2.rightMargin == d.rightMargin && layoutParams2.bottomMargin == d.bottomMargin && layoutParams2.gravity == d.gravity) {
                return;
            }
        }
        tr0Var.f39797s.setLayoutParams(d);
    }

    public final void L(Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        tr0[] tr0VarArr;
        uj0 uj0Var;
        vp0 vp0Var;
        gr0 gr0Var;
        wp0 wp0Var;
        View[] viewPages;
        for (tr0 tr0Var : this.f42117n0) {
            if (tr0Var != null && tr0Var.getVisibility() == 0) {
                if (tr0Var.P != null) {
                    RectF rectF2 = this.f42108j2;
                    if (jh.k.c(tr0Var, viewGroup, rectF2)) {
                        canvas.save();
                        canvas.translate(rectF2.left, rectF2.top);
                        tr0Var.h(canvas);
                        canvas.restore();
                    }
                }
                if (tr0Var.F == 14 && (wp0Var = this.f42080b0) != null && wp0Var.getParent() == tr0Var) {
                    for (View view : wp0Var.h.getViewPages()) {
                        if ((view instanceof bi.c4) && view.getVisibility() == 0) {
                            bi.v3 v3Var = ((bi.c4) view).f3413f;
                            ih.d.a(v3Var, canvas, rectF, v3Var, viewGroup);
                        }
                    }
                } else {
                    if (tr0Var.F == 12 && (gr0Var = this.W) != null && gr0Var.getParent() == tr0Var) {
                        uj0Var = gr0Var.f46216a.A0;
                    } else if (tr0Var.F == 13 && (vp0Var = this.f42076a0) != null && vp0Var.getParent() == tr0Var) {
                        uj0Var = vp0Var.getCurrentListView();
                    } else {
                        uj0Var = tr0Var.h;
                    }
                    if (uj0Var != null && uj0Var.getVisibility() == 0) {
                        ih.d.a(uj0Var, canvas, rectF, uj0Var, viewGroup);
                    }
                }
            }
        }
    }

    public final void L0(int i7, int i10, int i11, boolean z10) {
        ns0[] ns0VarArr = this.f42144w1;
        ns0VarArr[i7].f37692a.clear();
        ns0VarArr[i7].f37693b[0].clear();
        ns0VarArr[i7].f37693b[1].clear();
        ns0 ns0Var = ns0VarArr[i7];
        ns0Var.f37699j[0] = i10;
        ns0Var.f37698i[0] = false;
        ns0Var.f37701l = false;
        ns0Var.f37702m = i11;
        ns0Var.f37703n = (ns0Var.e() - i11) - 1;
        ns0 ns0Var2 = ns0VarArr[i7];
        if (ns0Var2.f37703n < 0) {
            ns0Var2.f37703n = 0;
        }
        ns0Var2.f37700k = i10;
        ns0Var2.f37704o = true;
        ns0Var2.f37697g = false;
        ns0Var2.f37705p++;
        tr0 g02 = g0(i7);
        if (g02 != null && g02.h.getAdapter() != null) {
            g02.h.getAdapter().f();
        }
        if (z10) {
            int i12 = 0;
            while (true) {
                tr0[] tr0VarArr = this.f42117n0;
                if (i12 < tr0VarArr.length) {
                    tr0 tr0Var = tr0VarArr[i12];
                    if (tr0Var.F == i7) {
                        tr0Var.f39799x.h1(Math.min(ns0VarArr[i7].e() - 1, ns0VarArr[i7].f37702m), 0);
                    }
                    i12++;
                } else {
                    return;
                }
            }
        }
    }

    public final void L1(boolean z10) {
        int i7 = 0;
        while (true) {
            tr0[] tr0VarArr = this.f42117n0;
            if (i7 < tr0VarArr.length) {
                int childCount = tr0VarArr[i7].h.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = tr0VarArr[i7].h.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.g7) {
                        ((org.telegram.ui.Cells.g7) childAt).b(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.n7) {
                        ((org.telegram.ui.Cells.n7) childAt).i(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.j7) {
                        ((org.telegram.ui.Cells.j7) childAt).f(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.f7) {
                        ((org.telegram.ui.Cells.f7) childAt).e(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.h2) {
                        ((org.telegram.ui.Cells.h2) childAt).c(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.t2) {
                        ((org.telegram.ui.Cells.t2) childAt).e0(false, z10);
                    }
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public final void M() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ys0.M():void");
    }

    public final void M0(boolean z10) {
        long j3 = this.G;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i7 == 0 && !G0()) {
            for (int i10 = 0; i10 < 4; i10++) {
                int i11 = f42071t2[i10];
                ns0[] ns0VarArr = this.f42144w1;
                if (!ns0VarArr[i11].h || z10) {
                    long j10 = this.f42114m1;
                    if (!org.telegram.messenger.m5.C(j10)) {
                        ns0VarArr[i11].h = false;
                        TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
                        if (i11 == 0) {
                            int i12 = ns0VarArr[i11].f37706q;
                            if (i12 == 1) {
                                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterPhotos();
                            } else if (i12 == 2) {
                                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterVideo();
                            } else {
                                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
                            }
                        } else if (i11 == 1) {
                            tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterDocument();
                        } else if (i11 == 2) {
                            tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterRoundVoice();
                        } else {
                            tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterMusic();
                        }
                        tL_messages_getSearchResultsPositions.limit = 100;
                        org.telegram.ui.ActionBar.e2 e2Var = this.f42150y1;
                        tL_messages_getSearchResultsPositions.peer = e2Var.getMessagesController().j1(j10);
                        if (i7 != 0 && e2Var.getUserConfig().e() == j10) {
                            tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                            tL_messages_getSearchResultsPositions.saved_peer_id = e2Var.getMessagesController().j1(j3);
                        }
                        ConnectionsManager.getInstance(e2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(e2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new org.telegram.messenger.ee(this, ns0VarArr[i11].f37705p, i11, 2)), e2Var.getClassGuid());
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void M1(float f10) {
        org.telegram.ui.ActionBar.q0 q0Var = this.f42122p0;
        if (q0Var == null) {
            return;
        }
        tr0[] tr0VarArr = this.f42117n0;
        tr0 tr0Var = tr0VarArr[1];
        float f11 = 0.0f;
        if (tr0Var != null && tr0Var.F == 11) {
            f11 = 0.0f + f10;
        }
        int i7 = 0;
        tr0 tr0Var2 = tr0VarArr[0];
        if (tr0Var2 != null && tr0Var2.F == 11) {
            f11 += 1.0f - f10;
        }
        q0Var.setAlpha(f11);
        float f12 = (0.15f * f11) + 0.85f;
        q0Var.setScaleX(f12);
        q0Var.setScaleY(f12);
        if (f11 <= 0.01f) {
            i7 = 8;
        }
        q0Var.setVisibility(i7);
    }

    public final void N() {
        vq0 vq0Var = this.L0;
        if (!vq0Var.d(vq0Var.getCurrentTabId())) {
            int firstTabId = vq0Var.getFirstTabId();
            vq0Var.setInitialTabId(firstTabId);
            this.f42117n0[0].F = firstTabId;
            B1(false);
        }
    }

    public final void N0(int i7) {
        int i10;
        int i11 = 2;
        ns0[] ns0VarArr = this.f42144w1;
        if (i7 == 0) {
            int i12 = ns0VarArr[0].f37706q;
            if (i12 == 1) {
                i11 = 6;
            } else if (i12 == 2) {
                i11 = 7;
            } else {
                i10 = 0;
            }
            i10 = i11;
        } else if (i7 == 1) {
            i10 = 1;
        } else {
            if (i7 != 2) {
                i11 = 4;
                if (i7 != 4) {
                    i11 = 5;
                    if (i7 != 5) {
                        i11 = 3;
                    }
                }
            }
            i10 = i11;
        }
        ns0VarArr[i7].f37697g = true;
        org.telegram.ui.ActionBar.e2 e2Var = this.f42150y1;
        e2Var.getMediaDataController().N0(this.f42114m1, 50, 0, ns0VarArr[i7].f37700k, i10, this.G, 1, e2Var.getClassGuid(), ns0VarArr[i7].f37705p, null, null);
    }

    public final void N1() {
        float f10;
        float f11;
        org.telegram.ui.ActionBar.q0 q0Var = this.f42122p0;
        if (q0Var == null) {
            return;
        }
        boolean z10 = true;
        tr0 tr0Var = this.f42117n0[1];
        if (tr0Var == null || tr0Var.F != 11) {
            z10 = false;
        }
        if (z10) {
            q0Var.setVisibility(0);
        }
        ViewPropertyAnimator animate = q0Var.animate();
        float f12 = 1.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f10);
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.85f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f11);
        if (!z10) {
            f12 = 0.85f;
        }
        scaleX.scaleY(f12).withEndAction(new fp0(0, this, z10)).setDuration(420L).setInterpolator(er.h).start();
    }

    public final void O(org.telegram.ui.Components.tr0 r34, org.telegram.ui.Components.uj0 r35, v4.b0 r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ys0.O(org.telegram.ui.Components.tr0, org.telegram.ui.Components.uj0, v4.b0):void");
    }

    public int O0() {
        return 0;
    }

    public final void O1() {
        boolean z10;
        int i7;
        fi.k6 k6Var;
        boolean B0 = B0();
        org.telegram.ui.ActionBar.q0 q0Var = this.f42151z0;
        org.telegram.ui.ActionBar.q0 q0Var2 = this.f42149y0;
        int i10 = 8;
        if (B0) {
            if (q0Var2 != null) {
                q0Var2.setVisibility(8);
            }
            if (q0Var != null) {
                q0Var.setVisibility(8);
            }
        } else if (getClosestTab() == 9) {
            if (q0Var2 != null) {
                q0Var2.setVisibility(8);
            }
            if (q0Var != null) {
                q0Var.setVisibility(8);
            }
        } else if (getClosestTab() == 8) {
            int i11 = 0;
            while (true) {
                SparseArray[] sparseArrayArr = this.f42085c1;
                if (i11 < sparseArrayArr[0].size()) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) sparseArrayArr[0].valueAt(i11);
                    ir0 ir0Var = this.f42094f0;
                    if (ir0Var != null && (k6Var = ir0Var.f41146s) != null && !k6Var.m(gjVar.e1())) {
                        z10 = true;
                        break;
                    }
                    i11++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (q0Var2 != null) {
                if (z10) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                q0Var2.setVisibility(i7);
            }
            if (q0Var != null) {
                if (!z10) {
                    i10 = 0;
                }
                q0Var.setVisibility(i10);
            }
        } else if (J0(getClosestTab())) {
            if (q0Var2 != null) {
                q0Var2.setVisibility(8);
            }
            if (q0Var != null) {
                q0Var.setVisibility(8);
            }
        }
    }

    public final boolean P(MotionEvent motionEvent) {
        float f10;
        v4.h0 h0Var;
        boolean z10;
        vp0 vp0Var;
        float f11;
        boolean z11;
        tr0[] tr0VarArr = this.f42117n0;
        int i7 = tr0VarArr[0].F;
        if (i7 == 13 && (vp0Var = this.f42076a0) != null) {
            View currentView = vp0Var.f13357n.getCurrentView();
            if (currentView instanceof gi.m) {
                gi.m mVar = (gi.m) currentView;
                gi.h hVar = mVar.f13345w;
                gi.e eVar = mVar.f13341f;
                if (mVar.f13336a != null && mVar.getParent() != null) {
                    if (!mVar.f13338b || mVar.L) {
                        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
                            if (motionEvent.getActionMasked() == 2 && (mVar.L || mVar.N)) {
                                int i10 = -1;
                                int i11 = -1;
                                for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                                    if (mVar.O == motionEvent.getPointerId(i12)) {
                                        i10 = i12;
                                    }
                                    if (mVar.P == motionEvent.getPointerId(i12)) {
                                        i11 = i12;
                                    }
                                }
                                if (i10 != -1 && i11 != -1) {
                                    float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / mVar.Q;
                                    mVar.R = hypot;
                                    if (!mVar.L && (hypot > 1.01f || hypot < 0.99f)) {
                                        mVar.L = true;
                                        if (hypot > 1.0f) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        mVar.S = z11;
                                        mVar.b(z11);
                                    }
                                    if (mVar.L) {
                                        boolean z12 = mVar.S;
                                        if ((z12 && mVar.R < 1.0f) || (!z12 && mVar.R > 1.0f)) {
                                            mVar.f13339c = 0.0f;
                                        } else {
                                            if (z12) {
                                                f11 = org.telegram.messenger.k5.y(2.0f, mVar.R, 1.0f, 1.0f);
                                            } else {
                                                f11 = (1.0f - mVar.R) / 0.5f;
                                            }
                                            mVar.f13339c = Math.max(0.0f, Math.min(1.0f, f11));
                                        }
                                        float f12 = mVar.f13339c;
                                        int i13 = (f12 > 1.0f ? 1 : (f12 == 1.0f ? 0 : -1));
                                        if (i13 == 0 || f12 == 0.0f) {
                                            if (i13 == 0) {
                                                int i14 = mVar.f13340e;
                                                int ceil = (((int) Math.ceil(mVar.T / mVar.f13340e)) * i14) + ((int) ((mVar.f13337a0.H.C1 / (eVar.getMeasuredWidth() - ((int) (eVar.getMeasuredWidth() / mVar.f13340e)))) * (i14 - 1)));
                                                if (ceil >= hVar.b()) {
                                                    ceil = hVar.b() - 1;
                                                }
                                                mVar.T = ceil;
                                            }
                                            mVar.a();
                                            if (mVar.f13339c == 0.0f) {
                                                mVar.S = !mVar.S;
                                            }
                                            mVar.b(mVar.S);
                                            mVar.Q = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                        }
                                        eVar.invalidate();
                                    }
                                } else {
                                    mVar.M = false;
                                    mVar.N = false;
                                    mVar.L = false;
                                    mVar.a();
                                    return false;
                                }
                            } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((mVar.O == motionEvent.getPointerId(0) && mVar.P == motionEvent.getPointerId(1)) || (mVar.O == motionEvent.getPointerId(1) && mVar.P == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && mVar.L) {
                                mVar.N = false;
                                mVar.M = false;
                                mVar.L = false;
                                mVar.a();
                            }
                        } else {
                            if (mVar.M && !mVar.L && motionEvent.getPointerCount() == 2) {
                                mVar.Q = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                mVar.R = 1.0f;
                                mVar.O = motionEvent.getPointerId(0);
                                mVar.P = motionEvent.getPointerId(1);
                                eVar.I0(false);
                                eVar.cancelLongPress();
                                eVar.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                View view = (View) mVar.getParent();
                                mVar.V = (int) ((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view.getX()) - mVar.getX());
                                int y10 = (int) ((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view.getY()) - mVar.getY());
                                int i15 = mVar.V;
                                Rect rect = mVar.W;
                                mVar.T = -1;
                                int top = y10 - eVar.getTop();
                                for (int i16 = 0; i16 < eVar.getChildCount(); i16++) {
                                    View childAt = eVar.getChildAt(i16);
                                    childAt.getHitRect(rect);
                                    if (rect.contains(i15, top)) {
                                        mVar.T = RecyclerView.S(childAt);
                                        mVar.U = childAt.getTop();
                                    }
                                }
                                mVar.N = true;
                            }
                            if (motionEvent.getActionMasked() == 0 && (motionEvent.getY() - ((View) mVar.getParent()).getY()) - mVar.getY() > 0.0f) {
                                mVar.M = true;
                            }
                        }
                        return mVar.L;
                    }
                    return true;
                }
            }
            return false;
        }
        if ((i7 == 0 || z0(i7)) && getParent() != null) {
            if (!this.f42130r1 || this.f42075a) {
                if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
                    if (motionEvent.getActionMasked() == 2 && (this.f42075a || this.f42083c)) {
                        int i17 = -1;
                        int i18 = -1;
                        for (int i19 = 0; i19 < motionEvent.getPointerCount(); i19++) {
                            if (this.f42089e == motionEvent.getPointerId(i19)) {
                                i17 = i19;
                            }
                            if (this.f42093f == motionEvent.getPointerId(i19)) {
                                i18 = i19;
                            }
                        }
                        if (i17 != -1 && i18 != -1) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(i18) - motionEvent.getX(i17), motionEvent.getY(i18) - motionEvent.getY(i17))) / this.h;
                            this.f42116n = hypot2;
                            if (!this.f42075a && (hypot2 > 1.01f || hypot2 < 0.99f)) {
                                this.f42075a = true;
                                if (hypot2 > 1.0f) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                this.f42128r = z10;
                                t1(z10);
                            }
                            if (this.f42075a) {
                                boolean z13 = this.f42128r;
                                if ((z13 && this.f42116n < 1.0f) || (!z13 && this.f42116n > 1.0f)) {
                                    this.f42126q1 = 0.0f;
                                } else {
                                    if (z13) {
                                        f10 = org.telegram.messenger.k5.y(2.0f, this.f42116n, 1.0f, 1.0f);
                                    } else {
                                        f10 = (1.0f - this.f42116n) / 0.5f;
                                    }
                                    this.f42126q1 = Math.max(0.0f, Math.min(1.0f, f10));
                                }
                                float f13 = this.f42126q1;
                                if (f13 == 1.0f || f13 == 0.0f) {
                                    if (z0(this.f42134s1)) {
                                        h0Var = z1(this.f42134s1);
                                    } else {
                                        h0Var = this.K;
                                    }
                                    if (this.f42126q1 == 1.0f) {
                                        int i20 = this.f42137t1;
                                        int ceil2 = (((int) Math.ceil(this.f42132s / this.f42137t1)) * i20) + ((int) ((this.C1 / (tr0VarArr[0].h.getMeasuredWidth() - ((int) (tr0VarArr[0].h.getMeasuredWidth() / this.f42137t1)))) * (i20 - 1)));
                                        if (ceil2 >= h0Var.b()) {
                                            ceil2 = h0Var.b() - 1;
                                        }
                                        this.f42132s = ceil2;
                                    }
                                    d0();
                                    if (this.f42126q1 == 0.0f) {
                                        this.f42128r = !this.f42128r;
                                    }
                                    t1(this.f42128r);
                                    this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                }
                                tr0VarArr[0].h.invalidate();
                                tr0 tr0Var = tr0VarArr[0];
                                if (tr0Var.G != null) {
                                    tr0Var.invalidate();
                                }
                            }
                        } else {
                            this.f42079b = false;
                            this.f42083c = false;
                            this.f42075a = false;
                            d0();
                            return false;
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.f42089e == motionEvent.getPointerId(0) && this.f42093f == motionEvent.getPointerId(1)) || (this.f42089e == motionEvent.getPointerId(1) && this.f42093f == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.f42075a) {
                        this.f42083c = false;
                        this.f42079b = false;
                        this.f42075a = false;
                        d0();
                    }
                } else {
                    if (this.f42079b && !this.f42075a && motionEvent.getPointerCount() == 2) {
                        this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.f42116n = 1.0f;
                        this.f42089e = motionEvent.getPointerId(0);
                        this.f42093f = motionEvent.getPointerId(1);
                        tr0VarArr[0].h.I0(false);
                        tr0VarArr[0].h.cancelLongPress();
                        tr0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.f42145x = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - tr0VarArr[0].getX());
                        int y11 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - tr0VarArr[0].getY());
                        int i21 = this.f42145x;
                        this.f42132s = -1;
                        int top2 = y11 - tr0VarArr[0].h.getTop();
                        if (getY() != 0.0f && this.F == 1) {
                            top2 = 0;
                        }
                        for (int i22 = 0; i22 < tr0VarArr[0].h.getChildCount(); i22++) {
                            View childAt2 = tr0VarArr[0].h.getChildAt(i22);
                            Rect rect2 = this.f42148y;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i21, top2)) {
                                tr0VarArr[0].h.getClass();
                                this.f42132s = RecyclerView.S(childAt2);
                                this.f42142w = childAt2.getTop();
                            }
                        }
                        if (this.G1.Y() && this.f42132s == -1) {
                            this.f42132s = (int) (((this.f42123p1[z0(tr0VarArr[0].F) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i21 / tr0VarArr[0].h.getMeasuredWidth(), 0.0f))) + tr0VarArr[0].f39799x.L0());
                            this.f42142w = 0;
                        }
                        this.f42083c = true;
                    }
                    if (motionEvent.getActionMasked() == 0 && ((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - tr0VarArr[0].getY() > this.d2) {
                        this.f42079b = true;
                    }
                }
                return this.f42075a;
            }
            return true;
        }
        return false;
    }

    public void P1(boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ys0.P1(boolean):void");
    }

    public final void Q() {
        R(false, false);
    }

    public final Boolean Q1(View view, View view2) {
        if (!this.f42130r1) {
            tr0[] tr0VarArr = this.f42117n0;
            boolean z10 = false;
            tr0 tr0Var = tr0VarArr[0];
            if (tr0Var != null) {
                int i7 = tr0Var.F;
                this.f42134s1 = i7;
                boolean z02 = z0(i7);
                int[] iArr = this.f42123p1;
                int h02 = h0(z02 ? 1 : 0, iArr[z02 ? 1 : 0], true);
                if (view != null && h02 == h0(z02 ? 1 : 0, h02, true)) {
                    view.setEnabled(false);
                    view.animate().alpha(0.5f).start();
                }
                if (iArr[z02 ? 1 : 0] != h02) {
                    if (view2 != null && !view2.isEnabled()) {
                        view2.setEnabled(true);
                        view2.animate().alpha(1.0f).start();
                    }
                    if (!z02) {
                        org.telegram.messenger.gz.B(h02);
                    } else if (m0(tr0VarArr[0].F) >= 5 || J0(tr0VarArr[0].F)) {
                        org.telegram.messenger.gz.F(h02);
                    }
                    F(h02);
                }
                if (h02 != h0(z02 ? 1 : 0, h02, true)) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
            return null;
        }
        return null;
    }

    public final void R(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        if (this.I != null) {
            int closestTab = getClosestTab();
            boolean z14 = false;
            if (this.f42127q2 && !E0()) {
                z12 = true;
            } else {
                z12 = false;
            }
            org.telegram.ui.ActionBar.q0 q0Var = this.f42125q0;
            if (q0Var != null) {
                if (z12 && I() && (F0(closestTab) || (closestTab == 11 && x0()))) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                ((org.telegram.ui.ActionBar.d5) q0Var).Z(z13, z10);
            }
            org.telegram.ui.ActionBar.d5 d5Var = this.J;
            if (d5Var != null) {
                if (z12 && I() && !A0() && v0(closestTab)) {
                    z14 = true;
                }
                d5Var.Z(z14, z11);
            }
        }
    }

    public final void R0() {
        fi.k6 k6Var;
        fi.k6 k6Var2;
        this.K1.b();
        ir0 ir0Var = this.f42094f0;
        if (ir0Var != null && (k6Var2 = ir0Var.f41146s) != null && k6Var2 != null) {
            k6Var2.z(ir0Var.f41147w);
        }
        up0 up0Var = this.f42100h0;
        if (up0Var != null && (k6Var = up0Var.f41146s) != null && k6Var != null) {
            k6Var.z(up0Var.f41147w);
        }
        for (xs0 xs0Var : this.f42115m2.values()) {
            ws0 ws0Var = xs0Var.f41760c;
            fi.k6 k6Var3 = ws0Var.f41146s;
            if (k6Var3 != null && k6Var3 != null) {
                k6Var3.z(ws0Var.f41147w);
            }
        }
    }

    public final Boolean R1(View view, View view2) {
        if (!this.f42130r1) {
            tr0[] tr0VarArr = this.f42117n0;
            boolean z10 = false;
            tr0 tr0Var = tr0VarArr[0];
            if (tr0Var != null) {
                if (!this.n1 || !z0(tr0Var.F)) {
                    int i7 = tr0VarArr[0].F;
                    this.f42134s1 = i7;
                    boolean z02 = z0(i7);
                    int[] iArr = this.f42123p1;
                    int h02 = h0(z02 ? 1 : 0, iArr[z02 ? 1 : 0], false);
                    if (view2 != null && h02 == h0(z02 ? 1 : 0, h02, false)) {
                        view2.setEnabled(false);
                        view2.animate().alpha(0.5f).start();
                    }
                    if (iArr[z02 ? 1 : 0] != h02) {
                        if (view != null && !view.isEnabled()) {
                            view.setEnabled(true);
                            view.animate().alpha(1.0f).start();
                        }
                        if (!z02) {
                            org.telegram.messenger.gz.B(h02);
                        } else if (m0(tr0VarArr[0].F) >= 5 || J0(tr0VarArr[0].F)) {
                            org.telegram.messenger.gz.F(h02);
                        }
                        F(h02);
                    }
                    if (h02 != h0(z02 ? 1 : 0, h02, false)) {
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

    public final void S() {
        char c10;
        char c11;
        float abs;
        View childAt;
        int R;
        float f10;
        float measuredWidth;
        tr0[] tr0VarArr = this.f42117n0;
        tr0 tr0Var = tr0VarArr[0];
        if (tr0Var != null && tr0VarArr[1] != null) {
            float f11 = 0.0f;
            zp0 zp0Var = this.f42084c0;
            if (zp0Var != null) {
                if (z0(tr0Var.F) && tr0VarArr[0].F != 9) {
                    c10 = 1;
                } else {
                    c10 = 0;
                }
                if (tr0VarArr[1].getVisibility() == 0) {
                    if (z0(tr0VarArr[1].F) && tr0VarArr[1].F != 9) {
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
                        measuredWidth = tr0VarArr[0].getMeasuredWidth();
                    }
                    zp0Var.setTranslationX(measuredWidth);
                } else {
                    zp0Var.setTranslationX(tr0VarArr[c10 ^ 1].getTranslationX());
                    abs = 1.0f - (Math.abs(zp0Var.getTranslationX()) / zp0Var.getMeasuredWidth());
                }
                float f12 = 0.0f;
                for (int i7 = 0; i7 < tr0VarArr.length; i7++) {
                    if (tr0VarArr[i7].getVisibility() == 0) {
                        dq0 dq0Var = tr0VarArr[i7].h;
                        if (dq0Var.getChildCount() == 0) {
                            childAt = null;
                        } else {
                            childAt = dq0Var.getChildAt(0);
                        }
                        if (childAt == null) {
                            R = -1;
                        } else {
                            R = RecyclerView.R(childAt);
                        }
                        if (R == 0) {
                            f10 = childAt.getY() - dq0Var.getPaddingTop();
                        } else if (dq0Var.getChildCount() == 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = -org.telegram.messenger.g0.L(48.0f);
                        }
                        f12 += Utilities.l(1.0f - (tr0VarArr[i7].getTranslationX() / tr0VarArr[i7].getMeasuredWidth())) * f10;
                    }
                }
                float l10 = Utilities.l(1.0f - ((-f12) / org.telegram.messenger.g0.N(48.0f)));
                float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, l10);
                zp0Var.setAlpha(l10);
                zp0Var.setScaleX(T1);
                zp0Var.setScaleY(T1);
                zp0Var.setTranslationY(this.O1 + f12);
                f11 = abs;
            }
            U();
            if (this.Y1 != f11) {
                this.Y1 = f11;
                invalidate();
            }
        }
    }

    public final void S0(int i7, View view, org.telegram.messenger.gj gjVar, int i10) {
        TLRPC.WebPage webPage;
        String str;
        char c10;
        int i11;
        int i12;
        boolean z10;
        if (gjVar != null && !this.f42130r1) {
            zp0 zp0Var = this.f42084c0;
            if (zp0Var == null || !zp0Var.f48495f) {
                int i13 = 0;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                i13 = 0;
                String str2 = null;
                fi.k6 k6Var = null;
                if (this.F1) {
                    int i14 = 8;
                    if (i10 != 8 || H()) {
                        if (org.telegram.messenger.gj.B0(gjVar.f23817k) == this.f42114m1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        SparseArray[] sparseArrayArr = this.f42085c1;
                        if (sparseArrayArr[c10].indexOfKey(gjVar.e1()) >= 0) {
                            sparseArrayArr[c10].remove(gjVar.e1());
                            if (!gjVar.s(null, false)) {
                                this.f42088d1--;
                            }
                        } else {
                            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                                sparseArrayArr[c10].put(gjVar.e1(), gjVar);
                                if (!gjVar.s(null, false)) {
                                    this.f42088d1++;
                                }
                            } else {
                                return;
                            }
                        }
                        P0(sparseArrayArr[0]);
                        if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                            q1(false);
                        } else {
                            o1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                            if (this.f42088d1 == 0) {
                                i11 = 0;
                            } else {
                                i11 = 8;
                            }
                            this.f42119o0.setVisibility(i11);
                            org.telegram.ui.ActionBar.q0 q0Var = this.f42146x0;
                            if (q0Var != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14 && sparseArrayArr[0].size() == 1) {
                                    i12 = 0;
                                } else {
                                    i12 = 8;
                                }
                                q0Var.setVisibility(i12);
                            }
                            org.telegram.ui.ActionBar.q0 q0Var2 = this.f42143w0;
                            if (q0Var2 != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                                    i14 = 0;
                                }
                                q0Var2.setVisibility(i14);
                            }
                            O1();
                        }
                        this.f42091e1 = false;
                        if (view instanceof org.telegram.ui.Cells.g7) {
                            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                            if (sparseArrayArr[c10].indexOfKey(gjVar.e1()) >= 0) {
                                z11 = true;
                            }
                            g7Var.b(z11, true);
                        } else if (view instanceof org.telegram.ui.Cells.o7) {
                            org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                            if (sparseArrayArr[c10].indexOfKey(gjVar.e1()) >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            o7Var.b(0, z10, true);
                        } else if (view instanceof org.telegram.ui.Cells.j7) {
                            org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                            if (sparseArrayArr[c10].indexOfKey(gjVar.e1()) >= 0) {
                                z12 = true;
                            }
                            j7Var.f(z12, true);
                        } else if (view instanceof org.telegram.ui.Cells.f7) {
                            org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
                            if (sparseArrayArr[c10].indexOfKey(gjVar.e1()) >= 0) {
                                z13 = true;
                            }
                            f7Var.e(z13, true);
                        } else if (view instanceof org.telegram.ui.Cells.h2) {
                            org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) view;
                            if (sparseArrayArr[c10].indexOfKey(gjVar.e1()) >= 0) {
                                z14 = true;
                            }
                            h2Var.c(z14, true);
                        } else if (view instanceof org.telegram.ui.Cells.n7) {
                            org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                            if (sparseArrayArr[c10].indexOfKey(gjVar.e1()) >= 0) {
                                z15 = true;
                            }
                            n7Var.i(z15, true);
                        }
                    } else {
                        return;
                    }
                } else {
                    fq0 fq0Var = this.f42139u1;
                    ns0[] ns0VarArr = this.f42144w1;
                    org.telegram.ui.ActionBar.e2 e2Var = this.f42150y1;
                    if (i10 == 0) {
                        ns0 ns0Var = ns0VarArr[i10];
                        int i15 = i7 - ns0Var.f37702m;
                        if (i15 >= 0 && i15 < ns0Var.f37692a.size()) {
                            PhotoViewer.p1().I2(null, e2Var, null);
                            PhotoViewer.p1().a2(ns0VarArr[i10].f37692a, i15, this.f42114m1, this.f42095f1, this.G, fq0Var);
                        }
                    } else if (i10 != 2 && i10 != 4) {
                        if (i10 == 5) {
                            PhotoViewer.p1().I2(null, e2Var, null);
                            int indexOf = ns0VarArr[i10].f37692a.indexOf(gjVar);
                            if (indexOf < 0) {
                                PhotoViewer.p1().a2(org.telegram.messenger.k5.j(gjVar), 0, 0L, 0L, 0L, fq0Var);
                            } else {
                                PhotoViewer.p1().a2(ns0VarArr[i10].f37692a, indexOf, this.f42114m1, this.f42095f1, this.G, fq0Var);
                            }
                        } else if (i10 == 1) {
                            if (view instanceof org.telegram.ui.Cells.g7) {
                                org.telegram.ui.Cells.g7 g7Var2 = (org.telegram.ui.Cells.g7) view;
                                TLRPC.Document F0 = gjVar.F0();
                                if (g7Var2.H) {
                                    if (gjVar.x()) {
                                        PhotoViewer.p1().I2(null, e2Var, null);
                                        int indexOf2 = ns0VarArr[i10].f37692a.indexOf(gjVar);
                                        if (indexOf2 < 0) {
                                            PhotoViewer.p1().a2(org.telegram.messenger.k5.j(gjVar), 0, 0L, 0L, 0L, fq0Var);
                                            return;
                                        }
                                        PhotoViewer.p1().a2(ns0VarArr[i10].f37692a, indexOf2, this.f42114m1, this.f42095f1, this.G, fq0Var);
                                        return;
                                    }
                                    org.telegram.messenger.g0.s2(gjVar, e2Var.getParentActivity(), e2Var);
                                } else if (!g7Var2.G) {
                                    org.telegram.messenger.gj message = g7Var2.getMessage();
                                    message.P = true;
                                    e2Var.getFileLoader().W(F0, message, 0, 0);
                                    g7Var2.f(true);
                                } else {
                                    e2Var.getFileLoader().f(F0);
                                    g7Var2.f(true);
                                }
                            }
                        } else if (i10 == 3) {
                            try {
                                if (org.telegram.messenger.gj.n1(gjVar.f23817k) != null) {
                                    webPage = org.telegram.messenger.gj.n1(gjVar.f23817k).webpage;
                                } else {
                                    webPage = null;
                                }
                                if (webPage != null && !(webPage instanceof TLRPC.TL_webPageEmpty)) {
                                    if (webPage.cached_page != null) {
                                        LaunchActivity launchActivity = LaunchActivity.H1;
                                        if (launchActivity == null || launchActivity.N() == null || LaunchActivity.H1.N().l(gjVar) == null) {
                                            e2Var.createArticleViewer(false).L(gjVar, null, null, null);
                                            return;
                                        }
                                        return;
                                    }
                                    String str3 = webPage.embed_url;
                                    if (str3 != null && str3.length() != 0) {
                                        bu.N0(e2Var, gjVar, this.f42139u1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                        return;
                                    }
                                    str = webPage.url;
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    ArrayList arrayList = ((org.telegram.ui.Cells.j7) view).F;
                                    if (arrayList.size() > 0) {
                                        str2 = ((CharSequence) arrayList.get(0)).toString();
                                    }
                                    str = str2;
                                }
                                if (str != null) {
                                    d1(str);
                                }
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                            }
                        } else if (z0(i10)) {
                            vs0 z16 = z1(i10);
                            if (z16 != null) {
                                k6Var = z16.f41146s;
                            }
                            if (k6Var != null) {
                                fi.i9 orCreateStoryViewer = e2Var.getOrCreateStoryViewer();
                                Context context = getContext();
                                int e12 = gjVar.e1();
                                fi.b7 a10 = fi.b7.a(this.f42117n0[0].h);
                                a10.f11571e = new gx(k6Var, 19);
                                if ((e2Var instanceof ProfileActivity) && ((ProfileActivity) e2Var).f43191s1) {
                                    i13 = org.telegram.messenger.g0.L(68.0f);
                                }
                                a10.f11575s += i13;
                                orCreateStoryViewer.I(context, e12, k6Var, a10);
                            } else {
                                return;
                            }
                        }
                    } else if (view instanceof org.telegram.ui.Cells.f7) {
                        ((org.telegram.ui.Cells.f7) view).a();
                    }
                }
                G1();
            }
        }
    }

    public final boolean T() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ys0.T():boolean");
    }

    public final boolean T0(org.telegram.messenger.gj gjVar, View view, int i7, boolean z10) {
        zp0 zp0Var;
        char c10;
        int i10;
        int i11;
        final TL_stories.StoryItem storyItem;
        ir0 ir0Var;
        fi.k6 k6Var;
        if (!this.F1) {
            org.telegram.ui.ActionBar.e2 e2Var = this.f42150y1;
            if (e2Var.getParentActivity() != null && gjVar != null && ((zp0Var = this.f42084c0) == null || !zp0Var.f48495f)) {
                org.telegram.messenger.g0.v1(e2Var.getParentActivity().getCurrentFocus());
                long j3 = this.f42114m1;
                int i12 = 8;
                if (z10 && ((J0(getClosestTab()) || getClosestTab() == 8) && !this.F1)) {
                    if (view instanceof org.telegram.ui.Cells.n7) {
                        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                        n7Var.k(n7Var.f30757n, n7Var.f30762r, true);
                    }
                    TL_stories.StoryItem storyItem2 = gjVar.f23822l;
                    if (storyItem2 != null) {
                        HashSet hashSet = new HashSet();
                        ArrayList<Integer> arrayList = storyItem2.albums;
                        if (arrayList != null) {
                            hashSet.addAll(arrayList);
                        }
                        boolean J0 = J0(getClosestTab());
                        m60 I = m60.I(e2Var, view);
                        m60 J = I.J();
                        J.c(2131231240, org.telegram.messenger.hd.M0(2131753756, null), new org.telegram.ui.fq0(I, 27), false);
                        J.k();
                        m60.f(J, getStoriesController().B(j3, true), hashSet, true, new yf(this, storyItem2, I, 21), new bi.o1(this, hashSet, storyItem2, I, 11));
                        I.c(2131231765, org.telegram.messenger.hd.M0(2131744805, null), new bi.n3(I, J, 10), false);
                        I.k();
                        I.c(2131232358, org.telegram.messenger.hd.M0(2131744789, null), new ci.p0(this, gjVar, view, i7, 28), false);
                        if (J0) {
                            int w12 = w1(getClosestTab());
                            String w10 = getStoriesController().w(w12, j3);
                            I.c(2131232774, org.telegram.messenger.hd.M0(2131744790, null), new ap0(this, w12, 0), false);
                            storyItem = storyItem2;
                            I.c(2131232330, org.telegram.messenger.hd.M0(2131744791, null), new ci.p0((Object) this, w12, (Object) storyItem, w10, 29), false);
                        } else {
                            storyItem = storyItem2;
                            if (getClosestTab() == 8 && (ir0Var = this.f42094f0) != null && (k6Var = ir0Var.f41146s) != null) {
                                if (k6Var.m(storyItem.f28290id)) {
                                    I.c(2131231002, org.telegram.messenger.hd.M0(2131744787, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            int i13 = r1;
                                            TL_stories.StoryItem storyItem3 = storyItem;
                                            ys0 ys0Var = this;
                                            switch (i13) {
                                                case 0:
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ys0Var.getContext(), ys0Var.I1);
                                                    String M0 = org.telegram.messenger.hd.M0(2131751487, null);
                                                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                                                    t1Var.S = M0;
                                                    t1Var.U = org.telegram.messenger.hd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new jp0(ys0Var, storyItem3));
                                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new rb0(11));
                                                    t1Var.show();
                                                    t1Var.i();
                                                    return;
                                                case 1:
                                                    ys0Var.getClass();
                                                    ys0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f28290id))), false);
                                                    return;
                                                case 2:
                                                    ys0Var.getClass();
                                                    ys0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f28290id))), true);
                                                    return;
                                                default:
                                                    ys0.h(ys0Var, storyItem3);
                                                    return;
                                            }
                                        }
                                    }, false);
                                } else {
                                    I.c(2131230998, org.telegram.messenger.hd.M0(2131744792, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            int i13 = r1;
                                            TL_stories.StoryItem storyItem3 = storyItem;
                                            ys0 ys0Var = this;
                                            switch (i13) {
                                                case 0:
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ys0Var.getContext(), ys0Var.I1);
                                                    String M0 = org.telegram.messenger.hd.M0(2131751487, null);
                                                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                                                    t1Var.S = M0;
                                                    t1Var.U = org.telegram.messenger.hd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new jp0(ys0Var, storyItem3));
                                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new rb0(11));
                                                    t1Var.show();
                                                    t1Var.i();
                                                    return;
                                                case 1:
                                                    ys0Var.getClass();
                                                    ys0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f28290id))), false);
                                                    return;
                                                case 2:
                                                    ys0Var.getClass();
                                                    ys0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f28290id))), true);
                                                    return;
                                                default:
                                                    ys0.h(ys0Var, storyItem3);
                                                    return;
                                            }
                                        }
                                    }, false);
                                }
                            }
                            I.c(2131232052, org.telegram.messenger.hd.M0(2131744797, null), new Runnable() {
                                @Override
                                public final void run() {
                                    int i13 = r1;
                                    TL_stories.StoryItem storyItem3 = storyItem;
                                    ys0 ys0Var = this;
                                    switch (i13) {
                                        case 0:
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ys0Var.getContext(), ys0Var.I1);
                                            String M0 = org.telegram.messenger.hd.M0(2131751487, null);
                                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                                            t1Var.S = M0;
                                            t1Var.U = org.telegram.messenger.hd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new jp0(ys0Var, storyItem3));
                                            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new rb0(11));
                                            t1Var.show();
                                            t1Var.i();
                                            return;
                                        case 1:
                                            ys0Var.getClass();
                                            ys0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f28290id))), false);
                                            return;
                                        case 2:
                                            ys0Var.getClass();
                                            ys0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f28290id))), true);
                                            return;
                                        default:
                                            ys0.h(ys0Var, storyItem3);
                                            return;
                                    }
                                }
                            }, false);
                        }
                        I.c(2131232109, org.telegram.messenger.hd.M0(2131751598, null), new Runnable() {
                            @Override
                            public final void run() {
                                int i13 = r1;
                                TL_stories.StoryItem storyItem3 = storyItem;
                                ys0 ys0Var = this;
                                switch (i13) {
                                    case 0:
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ys0Var.getContext(), ys0Var.I1);
                                        String M0 = org.telegram.messenger.hd.M0(2131751487, null);
                                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                                        t1Var.S = M0;
                                        t1Var.U = org.telegram.messenger.hd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new jp0(ys0Var, storyItem3));
                                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new rb0(11));
                                        t1Var.show();
                                        t1Var.i();
                                        return;
                                    case 1:
                                        ys0Var.getClass();
                                        ys0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f28290id))), false);
                                        return;
                                    case 2:
                                        ys0Var.getClass();
                                        ys0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f28290id))), true);
                                        return;
                                    default:
                                        ys0.h(ys0Var, storyItem3);
                                        return;
                                }
                            }
                        }, true);
                        I.f37093i = 3;
                        I.f37113u = true;
                        I.v = true;
                        I.L = true;
                        I.M = 3;
                        Point point = org.telegram.messenger.g0.f23609q;
                        int min = Math.min((int) (Math.min(point.x, point.y) * 0.6777f), (int) (((Math.max(point.x, point.y) * 0.4333f) * 3.0f) / 4.0f));
                        I.N = min;
                        I.O = (min * 4) / 3;
                        I.f37112t = true;
                        I.P = true;
                        I.W = true;
                        I.Z();
                        return true;
                    }
                } else {
                    if (org.telegram.messenger.gj.B0(gjVar.f23817k) == j3) {
                        c10 = 0;
                    } else {
                        c10 = 1;
                    }
                    SparseArray[] sparseArrayArr = this.f42085c1;
                    sparseArrayArr[c10].put(gjVar.e1(), gjVar);
                    if (!gjVar.s(null, false)) {
                        this.f42088d1++;
                    }
                    if (this.f42088d1 == 0) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    this.f42119o0.setVisibility(i10);
                    org.telegram.ui.ActionBar.q0 q0Var = this.f42146x0;
                    if (q0Var != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i11 = 0;
                        } else {
                            i11 = 8;
                        }
                        q0Var.setVisibility(i11);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var2 = this.f42143w0;
                    if (q0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i12 = 0;
                        }
                        q0Var2.setVisibility(i12);
                    }
                    o1(1, false);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    int i13 = 0;
                    while (true) {
                        ArrayList arrayList3 = this.Q0;
                        if (i13 >= arrayList3.size()) {
                            break;
                        }
                        View view2 = (View) arrayList3.get(i13);
                        org.telegram.messenger.g0.y(view2);
                        arrayList2.add(ObjectAnimator.ofFloat(view2, View.SCALE_Y, 0.1f, 1.0f));
                        i13++;
                    }
                    animatorSet.playTogether(arrayList2);
                    animatorSet.setDuration(250L);
                    animatorSet.start();
                    this.f42091e1 = false;
                    if (view instanceof org.telegram.ui.Cells.g7) {
                        ((org.telegram.ui.Cells.g7) view).b(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.o7) {
                        ((org.telegram.ui.Cells.o7) view).b(i7, true, true);
                    } else if (view instanceof org.telegram.ui.Cells.j7) {
                        ((org.telegram.ui.Cells.j7) view).f(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.f7) {
                        ((org.telegram.ui.Cells.f7) view).e(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.h2) {
                        ((org.telegram.ui.Cells.h2) view).c(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.n7) {
                        ((org.telegram.ui.Cells.n7) view).i(true, true);
                    }
                    if (!this.F1) {
                        q1(true);
                    }
                    P0(sparseArrayArr[0]);
                    G1();
                    return true;
                }
            }
        }
        return false;
    }

    public final void U() {
        vr vrVar = this.S0;
        if (vrVar != null) {
            vrVar.setTranslationY(this.O1);
        }
    }

    public boolean U0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return false;
    }

    public final boolean V(boolean z10) {
        SparseArray[] sparseArrayArr;
        if (!this.F1) {
            return false;
        }
        int i7 = 1;
        while (true) {
            sparseArrayArr = this.f42085c1;
            if (i7 < 0) {
                break;
            }
            sparseArrayArr[i7].clear();
            i7--;
        }
        this.f42088d1 = 0;
        P0(sparseArrayArr[0]);
        vp0 vp0Var = this.f42076a0;
        if (vp0Var != null) {
            vp0Var.h();
            vp0Var.j();
        }
        q1(false);
        L1(z10);
        js0 js0Var = this.U;
        if (js0Var != null) {
            js0Var.f36178x.clear();
        }
        return true;
    }

    public final void V0(float f10) {
        tr0 tr0Var;
        int i7;
        int i10;
        tr0 tr0Var2;
        int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        tr0[] tr0VarArr = this.f42117n0;
        if (i11 != 0 || tr0VarArr[1].getVisibility() == 0) {
            if (this.f42110k1) {
                tr0VarArr[0].setTranslationX((-f10) * tr0Var2.getMeasuredWidth());
                tr0VarArr[1].setTranslationX(tr0VarArr[0].getMeasuredWidth() - (tr0VarArr[0].getMeasuredWidth() * f10));
            } else {
                tr0VarArr[0].setTranslationX(tr0Var.getMeasuredWidth() * f10);
                tr0VarArr[1].setTranslationX((tr0VarArr[0].getMeasuredWidth() * f10) - tr0VarArr[0].getMeasuredWidth());
            }
            Z0(getTabProgress());
            float k02 = k0(f10);
            this.f42133s0 = k02;
            int i12 = 4;
            if (k02 != 0.0f && I() && !A0()) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            this.f42138u0.setVisibility(i7);
            org.telegram.ui.ActionBar.q0 q0Var = this.f42125q0;
            if (q0Var != null && !I()) {
                if (I0()) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                setSearchItemVisibility(i10);
                this.f42129r0 = 0.0f;
            } else {
                this.f42129r0 = l0(f10);
                N1();
            }
            I1(false);
            if (i11 == 0) {
                tr0 tr0Var3 = tr0VarArr[0];
                tr0VarArr[0] = tr0VarArr[1];
                tr0VarArr[1] = tr0Var3;
                tr0Var3.setVisibility(8);
                if (q0Var != null && this.A0 == 2) {
                    if (I0()) {
                        i12 = 8;
                    }
                    setSearchItemVisibility(i12);
                }
                this.A0 = 0;
                u1();
            }
        }
    }

    public final org.telegram.ui.ActionBar.q0 W(Context context, int i7, int i10, String str) {
        org.telegram.ui.ActionBar.q0 q0Var;
        org.telegram.ui.ActionBar.w4 w4Var = this.I;
        if (w4Var != null) {
            q0Var = w4Var.o().b(i7, i10);
        } else {
            int i11 = org.telegram.ui.ActionBar.j6.f29262z8;
            int s02 = s0(i11);
            int i12 = org.telegram.ui.ActionBar.j6.f29243y8;
            org.telegram.ui.ActionBar.q0 q0Var2 = new org.telegram.ui.ActionBar.q0(context, null, s02, s0(i12), false, null);
            q0Var2.setIcon(i10);
            q0Var2.setDuplicateParentStateEnabled(false);
            this.E0.addView(q0Var2, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
            this.Q0.add(q0Var2);
            fh0 iconView = q0Var2.getIconView();
            org.telegram.ui.ActionBar.e6 e6Var = this.I1;
            if (iconView != null) {
                org.telegram.ui.ActionBar.q6.s(q0Var2.getIconView(), i12, e6Var, PorterDuff.Mode.SRC_IN);
            }
            if (q0Var2.getBackground() != null) {
                Drawable background = q0Var2.getBackground();
                org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
                q0Var2.setBackground(background);
                org.telegram.ui.ActionBar.q6.j(q0Var2, background, null, M, e6Var);
            }
            q0Var = q0Var2;
        }
        q0Var.setContentDescription(str);
        q0Var.setOnClickListener(new ci.q(this, i7, 18));
        return q0Var;
    }

    public boolean Y() {
        return this instanceof r20;
    }

    public void Y0() {
        boolean z10;
        int i7;
        boolean z11;
        boolean z12;
        boolean z13;
        if (!I0() && !A0()) {
            z10 = false;
        } else {
            z10 = true;
        }
        ts0 ts0Var = this.f42100h0.f41148x;
        if (ts0Var != null) {
            if (z10 && getClosestTab() == 9) {
                z13 = true;
            } else {
                z13 = false;
            }
            ts0Var.b(z13);
        }
        ts0 ts0Var2 = this.f42094f0.f41148x;
        if (ts0Var2 != null) {
            if (z10 && getClosestTab() == 8) {
                z12 = true;
            } else {
                z12 = false;
            }
            ts0Var2.b(z12);
        }
        for (xs0 xs0Var : this.f42115m2.values()) {
            ws0 ws0Var = xs0Var.f41760c;
            if (ws0Var.f41146s != null) {
                ts0 ts0Var3 = ws0Var.f41148x;
                if (z10 && getClosestTab() == xs0Var.f41758a) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ts0Var3.b(z11);
            }
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.f42125q0;
        if (q0Var != null) {
            sq0 sq0Var = this.M0;
            if (sq0Var != null && sq0Var.a() && getSelectedTab() == 11) {
                i7 = 2131745868;
            } else {
                i7 = 2131745836;
            }
            q0Var.setSearchFieldHint(org.telegram.messenger.hd.M0(i7, null));
        }
        S();
        R(true, true);
    }

    public final boolean Z(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x10 = (-view.getX()) - getX();
        tr0[] tr0VarArr = this.f42117n0;
        motionEvent.offsetLocation(x10 - tr0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - tr0VarArr[0].getY()) - tr0VarArr[0].h.getFastScroll().getY());
        return tr0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public void Z0(float f10) {
        Q0();
    }

    public final boolean a0(int i7) {
        ns0[] ns0VarArr = this.f42147x1.f38765n;
        if (ns0VarArr == null) {
            return false;
        }
        ns0[] ns0VarArr2 = this.f42144w1;
        if (i7 == 0) {
            ns0 ns0Var = ns0VarArr2[i7];
            if (!ns0Var.h) {
                int[] iArr = ns0Var.f37696f;
                int[] iArr2 = ns0VarArr[i7].f37696f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = ns0VarArr2[i7].f37696f;
            int[] iArr4 = ns0VarArr[i7].f37696f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        ns0VarArr2[i7].f37692a.addAll(ns0VarArr[i7].f37692a);
        ns0VarArr2[i7].f37694c.addAll(ns0VarArr[i7].f37694c);
        for (Map.Entry entry : ns0VarArr[i7].d.entrySet()) {
            ns0VarArr2[i7].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i10 = 0; i10 < 2; i10++) {
            ns0VarArr2[i7].f37693b[i10] = ns0VarArr[i7].f37693b[i10].clone();
            ns0 ns0Var2 = ns0VarArr2[i7];
            int[] iArr5 = ns0Var2.f37699j;
            ns0 ns0Var3 = ns0VarArr[i7];
            iArr5[i10] = ns0Var3.f37699j[i10];
            ns0Var2.f37698i[i10] = ns0Var3.f37698i[i10];
        }
        ns0VarArr2[i7].f37695e.addAll(ns0VarArr[i7].f37695e);
        return !ns0VarArr[i7].f37692a.isEmpty();
    }

    public final void a1(org.telegram.ui.ActionBar.e2 e2Var, long j3, int i7) {
        new org.telegram.ui.z11(e2Var, j3, this.f42123p1[1], new di.h3(this, j3, i7)).show();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28849d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ai));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Bi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29260z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.sj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29272zi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29241y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29014m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29007li));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28869e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28888f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29223x7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29146t7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29204w7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28819be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29038nd));
    }

    public final boolean b0(int r27, org.telegram.ui.Components.xr0 r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ys0.b0(int, org.telegram.ui.Components.xr0):boolean");
    }

    public final void b1(org.telegram.ui.ActionBar.e2 e2Var, long j3, int i7) {
        t4.s0(e2Var, org.telegram.messenger.hd.M0(2131751598, null), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131744795, getStoriesController().w(i7, j3))), org.telegram.messenger.hd.M0(2131751598, null), true, new di.z8(this, j3, i7, 8));
    }

    public final void c0(int i7, uj0 uj0Var, boolean z10) {
        ArrayList arrayList = this.f42144w1[i7].f37695e;
        int L0 = ((v4.b0) uj0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            yr0 yr0Var = null;
            if (arrayList != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    } else if (L0 <= ((yr0) arrayList.get(i10)).f42067b) {
                        yr0Var = (yr0) arrayList.get(i10);
                        break;
                    } else {
                        i10++;
                    }
                }
                if (yr0Var == null) {
                    yr0Var = (yr0) i5.c.h(1, arrayList);
                }
            }
            if (yr0Var != null) {
                L0(i7, yr0Var.d, yr0Var.f42067b + 1, z10);
            }
        }
    }

    public final void c1(org.telegram.ui.ActionBar.e2 e2Var, long j3, int i7) {
        String w10 = getStoriesController().w(i7, j3);
        Context context = e2Var.getContext();
        org.telegram.ui.ActionBar.e6 resourceProvider = e2Var.getResourceProvider();
        c4.n nVar = new c4.n(this, j3, i7, 5);
        Pattern pattern = t4.f39507a;
        t4.O(context, e2Var, org.telegram.messenger.hd.M0(2131744782, null), org.telegram.messenger.hd.M0(2131744781, null), org.telegram.messenger.hd.M0(2131744780, null), w10, 12, org.telegram.messenger.hd.M0(2131746278, null), resourceProvider, nVar);
    }

    public final void d0() {
        tr0[] tr0VarArr;
        tr0 tr0Var;
        boolean z10;
        int i7;
        v4.h0 adapter;
        if (this.f42130r1) {
            int i10 = 0;
            while (true) {
                tr0VarArr = this.f42117n0;
                if (i10 < tr0VarArr.length) {
                    tr0Var = tr0VarArr[i10];
                    if (tr0Var.F == this.f42134s1) {
                        break;
                    }
                    i10++;
                } else {
                    tr0Var = null;
                    break;
                }
            }
            if (tr0Var != null) {
                boolean z02 = z0(tr0Var.F);
                float f10 = this.f42126q1;
                float f11 = 1.0f;
                int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                ns0[] ns0VarArr = this.f42144w1;
                if (i11 == 0) {
                    this.f42130r1 = false;
                    int i12 = this.f42137t1;
                    int[] iArr = this.f42123p1;
                    iArr[z02 ? 1 : 0] = i12;
                    if (!z02) {
                        org.telegram.messenger.gz.B(i12);
                    } else if (m0(tr0Var.F) >= 5) {
                        org.telegram.messenger.gz.F(this.f42137t1);
                    }
                    for (int i13 = 0; i13 < tr0VarArr.length; i13++) {
                        tr0 tr0Var2 = tr0VarArr[i13];
                        if (tr0Var2 != null && tr0Var2.h != null && (((i7 = tr0Var2.F) == 0 || z0(i7)) && (adapter = tr0VarArr[i13].h.getAdapter()) != null)) {
                            int b10 = adapter.b();
                            if (i13 == 0) {
                                ns0VarArr[0].g(false);
                            }
                            tr0VarArr[i13].f39795n.setVisibility(8);
                            tr0VarArr[i13].f39799x.y1(iArr[z02 ? 1 : 0]);
                            tr0VarArr[i13].h.a0();
                            tr0VarArr[i13].h.invalidate();
                            if (adapter.b() == b10) {
                                org.telegram.messenger.g0.a4(tr0VarArr[i13].h);
                            } else {
                                adapter.f();
                            }
                        }
                    }
                    if (this.f42132s >= 0) {
                        for (int i14 = 0; i14 < tr0VarArr.length; i14++) {
                            tr0 tr0Var3 = tr0VarArr[i14];
                            if (tr0Var3.F == this.f42134s1) {
                                View m10 = tr0Var3.f39796r.m(this.f42132s);
                                if (m10 != null) {
                                    this.f42142w = m10.getTop();
                                }
                                tr0 tr0Var4 = tr0VarArr[i14];
                                tr0Var4.f39799x.h1(this.f42132s, (-tr0Var4.h.getPaddingTop()) + this.f42142w);
                            }
                        }
                        return;
                    }
                    j1();
                } else if (f10 == 0.0f) {
                    this.f42130r1 = false;
                    if (this.f42134s1 == 0) {
                        ns0VarArr[0].g(false);
                    }
                    tr0Var.f39795n.setVisibility(8);
                    tr0Var.h.invalidate();
                } else {
                    if (f10 > 0.2f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        f11 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
                    ofFloat.addUpdateListener(new uq0(this, tr0Var, 0));
                    ofFloat.addListener(new org.telegram.ui.ji(this, z10, z02 ? 1 : 0, tr0Var));
                    ofFloat.setInterpolator(er.f34420f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                }
            }
        }
    }

    public final void d1(String str) {
        boolean I3 = org.telegram.messenger.g0.I3(str);
        org.telegram.ui.ActionBar.e2 e2Var = this.f42150y1;
        if (I3) {
            t4.n0(e2Var, str, true, true);
        } else {
            vf.c.t(e2Var.getParentActivity(), str);
        }
    }

    @Override
    public final void didReceivedNotification(int r42, int r43, java.lang.Object... r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ys0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        vq0 vq0Var = this.L0;
        if (vq0Var != null) {
            canvas.save();
            canvas.translate(vq0Var.getX(), vq0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        rq0 rq0Var = this.U0;
        if (rq0Var != null) {
            int i7 = rq0Var.V;
            if ((i7 == 3 || i7 == 1) && this.S0 == null) {
                canvas.save();
                canvas.translate(rq0Var.getX(), rq0Var.getY());
                rq0Var.setDrawOverlay(true);
                rq0Var.draw(canvas);
                rq0Var.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int i7;
        if (this.f42086c2 && (view instanceof tr0) && this.f42099g2 < this.f42092e2) {
            canvas.save();
            canvas.clipRect(0, -this.f42099g2, getWidth(), getHeight() + this.f42096f2);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        } else if (view == this.U0 && this.S0 == null) {
            canvas.save();
            tr0[] tr0VarArr = this.f42117n0;
            float top = tr0VarArr[0].getTop();
            zp0 zp0Var = this.f42084c0;
            if (zp0Var != null && ((i7 = tr0VarArr[0].F) == 8 || J0(i7))) {
                top -= zp0Var.getVisualHeight();
            }
            canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + org.telegram.messenger.g0.L(12.0f));
            boolean drawChild2 = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild2;
        } else {
            return super.drawChild(canvas, view, j3);
        }
    }

    public final void e0(int i7) {
        ((WindowManager) org.telegram.messenger.t0.f26600b.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i7 == 0) {
            if (!org.telegram.messenger.g0.Q1() && org.telegram.messenger.t0.f26600b.getResources().getConfiguration().orientation == 2) {
                this.D0.setTextSize(18);
            } else {
                this.D0.setTextSize(20);
            }
        }
        if (i7 == 0) {
            this.K.f();
        }
    }

    public int e1() {
        return -1;
    }

    public final String f0(boolean z10) {
        int i7;
        int i10;
        TLRPC.MessageMedia messageMedia;
        vp0 vp0Var;
        if (!B0()) {
            return org.telegram.messenger.hd.M0(2131753014, null);
        }
        if (z10 && (vp0Var = this.f42076a0) != null) {
            return vp0Var.getBotPreviewsSubtitle();
        }
        ir0 ir0Var = this.f42094f0;
        if (ir0Var != null && ir0Var.f41146s != null) {
            i7 = 0;
            i10 = 0;
            for (int i11 = 0; i11 < ir0Var.f41146s.f11944i.size(); i11++) {
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) ir0Var.f41146s.f11944i.get(i11);
                TL_stories.StoryItem storyItem = gjVar.f23822l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    if (org.telegram.messenger.gj.K4(messageMedia.document)) {
                        i10++;
                    } else if (gjVar.f23822l.media.photo != null) {
                        i7++;
                    }
                }
            }
        } else {
            i7 = 0;
            i10 = 0;
        }
        if (i7 == 0 && i10 == 0) {
            return org.telegram.messenger.hd.M0(2131753014, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (i7 > 0) {
            sb2.append(org.telegram.messenger.hd.G(i7, "Images", new Object[0]));
        }
        if (i10 > 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(org.telegram.messenger.hd.G(i10, "Videos", new Object[0]));
        }
        return sb2.toString();
    }

    public final void f1(ArrayList arrayList, boolean z10) {
        boolean z11;
        boolean z12;
        ir0 ir0Var = this.f42094f0;
        if (ir0Var != null && ir0Var.f41146s != null) {
            org.telegram.ui.ActionBar.e2 e2Var = this.f42150y1;
            if (z10 && arrayList.size() > e2Var.getMessagesController().O5) {
                org.telegram.messenger.i20.t(org.telegram.messenger.hd.G(e2Var.getMessagesController().O5, "StoriesPinLimit", new Object[0]), cc.a0(e2Var), 2131623982, 36);
                return;
            }
            fi.k6 k6Var = ir0Var.f41146s;
            int i7 = k6Var.f11940c;
            ArrayList arrayList2 = k6Var.f11943g;
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
            if (arrayList3.size() > org.telegram.messenger.np.s1(i7).O5) {
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
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList2.size()) {
                            break;
                        } else if (arrayList2.get(i10) != arrayList3.get(i10)) {
                            z12 = true;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (z12) {
                    arrayList2.clear();
                    arrayList2.addAll(arrayList3);
                    k6Var.d(true);
                    TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                    tL_togglePinnedToTop.f28303id.addAll(arrayList2);
                    tL_togglePinnedToTop.peer = org.telegram.messenger.np.s1(i7).j1(k6Var.d);
                    ConnectionsManager.getInstance(i7).sendRequest(tL_togglePinnedToTop, new fi.m5(2));
                }
                z13 = z11;
            }
            if (z13) {
                org.telegram.messenger.i20.t(org.telegram.messenger.hd.G(e2Var.getMessagesController().O5, "StoriesPinLimit", new Object[0]), cc.a0(e2Var), 2131623982, 36);
            } else if (z10) {
                cc.a0(e2Var).I(2131624055, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(arrayList.size(), "StoriesPinned", new Object[0])), org.telegram.messenger.hd.G(arrayList.size(), "StoriesPinnedText", new Object[0])).j();
            } else {
                org.telegram.messenger.i20.t(org.telegram.messenger.hd.G(arrayList.size(), "StoriesUnpinned", new Object[0]), cc.a0(e2Var), 2131624061, 36);
            }
        }
    }

    public final tr0 g0(int i7) {
        int i10 = 0;
        while (true) {
            tr0[] tr0VarArr = this.f42117n0;
            if (i10 < tr0VarArr.length) {
                tr0 tr0Var = tr0VarArr[i10];
                if (tr0Var != null && tr0Var.F == i7) {
                    return tr0Var;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final boolean g1(MotionEvent motionEvent, boolean z10) {
        int i7;
        tr0 tr0Var;
        vp0 vp0Var;
        int i10;
        int i11;
        int closestTab = getClosestTab();
        vq0 vq0Var = this.L0;
        SparseIntArray sparseIntArray = vq0Var.P;
        int i12 = vq0Var.f32717n;
        int i13 = -1;
        if (z10) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        int i14 = sparseIntArray.get(i12 + i7, -1);
        zp0 zp0Var = this.f42084c0;
        if (zp0Var != null) {
            if (!J0(closestTab) && closestTab != 8) {
                if (J0(i14) || i14 == 8) {
                    i13 = zp0Var.getCurrentAlbumId();
                }
            } else {
                v61 v61Var = zp0Var.f48492b;
                SparseIntArray sparseIntArray2 = v61Var.f40296c0;
                int i15 = v61Var.G;
                if (z10) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                i13 = sparseIntArray2.get(i15 + i11, -1);
            }
            if (i13 == 0) {
                i14 = 8;
            } else if (i13 > 0) {
                i14 = x1(i13).f41758a;
            }
        }
        if (i14 >= 0) {
            if (this.f42125q0 != null && !I()) {
                if (I0()) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                setSearchItemVisibility(i10);
                this.f42129r0 = 0.0f;
            } else {
                this.f42129r0 = l0(0.0f);
                M1(0.0f);
            }
            if ((!this.Y0 || getSelectedTab() != 11) && (!H() || !this.F1 || (getClosestTab() != 8 && !J0(getClosestTab())))) {
                tr0[] tr0VarArr = this.f42117n0;
                tr0 tr0Var2 = tr0VarArr[0];
                if (tr0Var2 != null && tr0Var2.F == 13 && (vp0Var = this.f42076a0) != null) {
                    bi.f3 f3Var = vp0Var.f13357n;
                    if (!z10) {
                    }
                }
                tr0 tr0Var3 = tr0VarArr[0];
                wp0 wp0Var = this.f42080b0;
                if (tr0Var3 != null && tr0Var3.F == 14 && wp0Var != null) {
                    bi.f3 f3Var2 = wp0Var.h;
                    if (!z10) {
                    }
                }
                if ((!this.F1 || (tr0Var = tr0VarArr[0]) == null || tr0Var.F != 13) && ((wp0Var == null || !wp0Var.g()) && (zp0Var == null || !zp0Var.f48495f))) {
                    I1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    w0();
                    this.B1 = false;
                    this.A1 = true;
                    this.C1 = (int) motionEvent.getX();
                    setHeaderEnabled(false);
                    vq0Var.setEnabled(false);
                    tr0 tr0Var4 = tr0VarArr[1];
                    tr0Var4.F = i14;
                    tr0Var4.setVisibility(0);
                    this.f42110k1 = z10;
                    B1(true);
                    if (z10) {
                        tr0VarArr[1].setTranslationX(tr0VarArr[0].getMeasuredWidth());
                    } else {
                        tr0VarArr[1].setTranslationX(-tr0VarArr[0].getMeasuredWidth());
                    }
                    Z0(getTabProgress());
                    return true;
                }
            }
        }
        return false;
    }

    public SparseArray<org.telegram.messenger.gj> getActionModeSelected() {
        return this.f42085c1[0];
    }

    public float getBottomButtonStoriesVisibility() {
        tr0 tr0Var;
        tr0 tr0Var2;
        boolean z10;
        boolean z11;
        fi.k6 k6Var;
        fi.k6 k6Var2;
        float f10 = 1.0f;
        tr0[] tr0VarArr = this.f42117n0;
        if (tr0VarArr == null || (tr0Var = tr0VarArr[0]) == null || (tr0Var2 = tr0VarArr[1]) == null || tr0Var.f39798w == null || tr0Var2.f39798w == null) {
            return 1.0f;
        }
        int i7 = tr0Var.F;
        int i10 = tr0Var2.F;
        if (!J0(i7) && i7 != 8) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!J0(i10) && i10 != 8) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z10 && !z11) {
            return 1.0f;
        }
        float visibilityFactor = 1.0f - tr0VarArr[0].f39798w.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - tr0VarArr[1].f39798w.getVisibilityFactor();
        vs0 z12 = z1(tr0VarArr[0].F);
        if (i7 == 8 || (z12 != null && (k6Var2 = z12.f41146s) != null && k6Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        vs0 z13 = z1(i10);
        if (i10 != 8 && (z13 == null || (k6Var = z13.f41146s) == null || k6Var.g() <= 0)) {
            f10 = visibilityFactor2;
        }
        if (!z10) {
            visibilityFactor = f10;
        }
        if (!z11) {
            f10 = visibilityFactor;
        }
        return org.telegram.messenger.g0.T1(visibilityFactor, f10, Math.abs(tr0VarArr[0].getTranslationX() / tr0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        tr0[] tr0VarArr = this.f42117n0;
        tr0 tr0Var = tr0VarArr[1];
        if (tr0Var != null && tr0Var.getVisibility() == 0) {
            if (this.f42107j1 && !this.l1) {
                return tr0VarArr[1].F;
            }
            if (Math.abs(tr0VarArr[1].getTranslationX()) < tr0VarArr[1].getMeasuredWidth() / 2.0f) {
                return tr0VarArr[1].F;
            }
        }
        return getSelectedTab();
    }

    public uj0 getCurrentListView() {
        gr0 gr0Var;
        tr0 tr0Var = this.f42117n0[0];
        int i7 = tr0Var.F;
        if (i7 == 13) {
            return this.f42076a0.getCurrentListView();
        }
        if (i7 == 14) {
            return this.f42080b0.getCurrentListView();
        }
        if (i7 == 12 && (gr0Var = this.W) != null) {
            return gr0Var.f46216a.A0;
        }
        return tr0Var.h;
    }

    public int getInitialTab() {
        return 0;
    }

    public int getPhotosVideosTypeFilter() {
        return this.f42144w1[0].f37706q;
    }

    public TextView getSaveItem() {
        return this.f42136t0;
    }

    public org.telegram.ui.ActionBar.q0 getSearchItem() {
        return this.f42125q0;
    }

    public fh0 getSearchOptionsItem() {
        return this.f42140v0;
    }

    public int getSelectedTab() {
        int currentTabId = this.L0.getCurrentTabId();
        zp0 zp0Var = this.f42084c0;
        if (zp0Var != null && currentTabId == 8) {
            int currentAlbumId = zp0Var.getCurrentAlbumId();
            if (currentAlbumId == 0) {
                return 8;
            }
            if (currentAlbumId > 0) {
                return x1(currentAlbumId).f41758a;
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
        float f10 = 0.0f;
        int i7 = 0;
        while (true) {
            tr0[] tr0VarArr = this.f42117n0;
            if (i7 < tr0VarArr.length) {
                tr0 tr0Var = tr0VarArr[i7];
                if (tr0Var != null) {
                    f10 = ((1.0f - Math.abs(tr0Var.getTranslationX() / getWidth())) * tr0Var.F) + f10;
                }
                i7++;
            } else {
                return f10;
            }
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.s6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.s6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.D0, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29260z6));
        int i7 = org.telegram.ui.ActionBar.j6.f29262z8;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f42119o0, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        org.telegram.ui.ActionBar.q0 q0Var = this.f42146x0;
        if (q0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.s6(q0Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        }
        org.telegram.ui.ActionBar.q0 q0Var2 = this.f42143w0;
        if (q0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.s6(q0Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        }
        Drawable[] drawableArr = {this.G0};
        int i10 = org.telegram.ui.ActionBar.j6.f29243y8;
        ImageView imageView = this.F0;
        arrayList.add(new org.telegram.ui.ActionBar.s6(imageView, 8, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.r6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.s6(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.E0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28849d6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.L0, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29233xi));
        vq0 vq0Var = this.L0;
        arrayList.add(new org.telegram.ui.ActionBar.s6(vq0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29214wi));
        arrayList.add(new org.telegram.ui.ActionBar.s6(vq0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29195vi));
        arrayList.add(new org.telegram.ui.ActionBar.s6(vq0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29252yi));
        rq0 rq0Var = this.U0;
        if (rq0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.s6(rq0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29185v7));
            arrayList.add(new org.telegram.ui.ActionBar.s6(rq0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29166u7));
            arrayList.add(new org.telegram.ui.ActionBar.s6(rq0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29242y7));
            arrayList.add(new org.telegram.ui.ActionBar.s6(rq0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.A7));
        }
        final int i11 = 0;
        while (true) {
            tr0[] tr0VarArr = this.f42117n0;
            if (i11 < tr0VarArr.length) {
                org.telegram.ui.ActionBar.r6 r6Var = new org.telegram.ui.ActionBar.r6() {
                    @Override
                    public final void b() {
                        tr0[] tr0VarArr2 = ys0.this.f42117n0;
                        int i12 = i11;
                        dq0 dq0Var = tr0VarArr2[i12].h;
                        if (dq0Var != null) {
                            int childCount = dq0Var.getChildCount();
                            for (int i13 = 0; i13 < childCount; i13++) {
                                View childAt = tr0VarArr2[i12].h.getChildAt(i13);
                                if (childAt instanceof org.telegram.ui.Cells.o7) {
                                    org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) childAt;
                                    for (int i14 = 0; i14 < 6; i14++) {
                                        o7Var.f30811a[i14].f30649e.invalidate();
                                    }
                                } else if (childAt instanceof org.telegram.ui.Cells.f6) {
                                    ((org.telegram.ui.Cells.f6) childAt).y(0);
                                } else if (childAt instanceof org.telegram.ui.Cells.pa) {
                                    ((org.telegram.ui.Cells.pa) childAt).i(0);
                                }
                            }
                        }
                    }

                    @Override
                    public final void a(float f10) {
                    }
                };
                arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29129s8));
                arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28941i6));
                arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].f39798w, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28832c7));
                int i12 = org.telegram.ui.ActionBar.j6.f28923h6;
                arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i12));
                arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, r6Var, org.telegram.ui.ActionBar.j6.f29031n6));
                arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, r6Var, org.telegram.ui.ActionBar.j6.O7));
                arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, r6Var, org.telegram.ui.ActionBar.j6.P7));
                arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, r6Var, org.telegram.ui.ActionBar.j6.Q7));
                arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, r6Var, org.telegram.ui.ActionBar.j6.R7));
                arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, r6Var, org.telegram.ui.ActionBar.j6.S7));
                arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, r6Var, org.telegram.ui.ActionBar.j6.T7));
                arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, r6Var, org.telegram.ui.ActionBar.j6.U7));
                int i13 = org.telegram.ui.ActionBar.j6.i7;
                arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, 8192, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i13));
                int i14 = org.telegram.ui.ActionBar.j6.f28979k7;
                arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, 16384, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, 8, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.qj));
                arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i12));
                arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, 8192, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i13));
                arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, 16384, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, 8192, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i13));
                arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, 16384, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, 8192, new Class[]{org.telegram.ui.Cells.o7.class}, (Paint) null, (Drawable[]) null, r6Var, i13));
                arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, 16384, new Class[]{org.telegram.ui.Cells.o7.class}, (Paint) null, (Drawable[]) null, r6Var, i14));
                arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.h2.class}, new String[]{"backgroundPaint"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ci));
                arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, 8192, new Class[]{org.telegram.ui.Cells.h2.class}, (Paint) null, (Drawable[]) null, r6Var, i13));
                arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, 16384, new Class[]{org.telegram.ui.Cells.h2.class}, (Paint) null, (Drawable[]) null, r6Var, i14));
                arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].h, 0, (Class[]) null, (Paint) null, new Drawable[]{this.B0}, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28813b7));
                arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].f39798w.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.s6(tr0VarArr[i11].f39798w.f33707e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29241y6));
                i11++;
            } else {
                return arrayList;
            }
        }
    }

    public int getTopPanelShift() {
        return this.f42124p2;
    }

    public final int h0(int i7, int i10, boolean z10) {
        int i11;
        int i12 = 1;
        if (!z10) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        int i13 = i10 + i11;
        if (i13 > 6) {
            if (!z10) {
                i13 = 9;
            } else {
                i13 = 6;
            }
        }
        return Utilities.j(i13, 9, (this.n1 && i7 == 1) ? 2 : 2);
    }

    public final int i0(boolean z10) {
        int i7;
        int i10 = this.f42082b2 + this.f42096f2;
        if (z10) {
            i7 = org.telegram.messenger.g0.L(52.0f);
        } else {
            i7 = 0;
        }
        return i10 + i7;
    }

    public final void i1(v4.h0 h0Var) {
        if (h0Var instanceof ss0) {
            ArrayList arrayList = this.H0;
            ArrayList arrayList2 = this.I0;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        } else if (h0Var == this.P) {
            ArrayList arrayList3 = this.J0;
            ArrayList arrayList4 = this.K0;
            arrayList3.addAll(arrayList4);
            arrayList4.clear();
        } else {
            hs0 hs0Var = this.Q;
            if (h0Var == hs0Var) {
                hs0Var.f35341r = null;
            }
        }
    }

    public final int j0(int i7) {
        int i10;
        int n02 = n0(i7) + org.telegram.messenger.g0.L(54.0f) + this.d2 + this.f42092e2 + this.f42124p2;
        if (i7 == 9) {
            i10 = org.telegram.messenger.g0.L(64.0f);
        } else {
            i10 = 0;
        }
        return n02 + i10;
    }

    public final void j1() {
        int i7;
        int i10 = 0;
        while (true) {
            tr0[] tr0VarArr = this.f42117n0;
            if (i10 < tr0VarArr.length) {
                dq0 dq0Var = tr0VarArr[i10].h;
                if (dq0Var != null) {
                    int i11 = 0;
                    int i12 = 0;
                    for (int i13 = 0; i13 < dq0Var.getChildCount(); i13++) {
                        View childAt = dq0Var.getChildAt(i13);
                        if (childAt instanceof org.telegram.ui.Cells.n7) {
                            org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) childAt;
                            int messageId = n7Var.getMessageId();
                            i12 = n7Var.getTop();
                            i11 = messageId;
                        }
                        if (childAt instanceof org.telegram.ui.Cells.g7) {
                            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) childAt;
                            int e12 = g7Var.getMessage().e1();
                            i12 = g7Var.getTop();
                            i11 = e12;
                        }
                        if (childAt instanceof org.telegram.ui.Cells.f7) {
                            org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) childAt;
                            i11 = f7Var.getMessage().e1();
                            i12 = f7Var.getTop();
                        }
                        if (i11 != 0) {
                            break;
                        }
                    }
                    if (i11 != 0) {
                        int i14 = tr0VarArr[i10].F;
                        int i15 = -1;
                        if (z0(i14)) {
                            vs0 z12 = z1(i14);
                            if (z12 != null && z12.f41146s != null) {
                                int i16 = 0;
                                while (true) {
                                    if (i16 >= z12.f41146s.f11944i.size()) {
                                        break;
                                    } else if (i11 == ((org.telegram.messenger.gj) z12.f41146s.f11944i.get(i16)).e1()) {
                                        i15 = i16;
                                        break;
                                    } else {
                                        i16++;
                                    }
                                }
                            }
                            i7 = i15;
                        } else if (i14 >= 0) {
                            ns0[] ns0VarArr = this.f42144w1;
                            if (i14 < ns0VarArr.length) {
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= ns0VarArr[i14].f37692a.size()) {
                                        break;
                                    } else if (i11 == ((org.telegram.messenger.gj) ns0VarArr[i14].f37692a.get(i17)).e1()) {
                                        i15 = i17;
                                        break;
                                    } else {
                                        i17++;
                                    }
                                }
                                i7 = ns0VarArr[i14].f37702m + i15;
                            }
                        }
                        if (i15 >= 0) {
                            ((v4.b0) dq0Var.getLayoutManager()).h1(i7, (-tr0VarArr[i10].h.getPaddingTop()) + i12);
                            if (this.f42130r1) {
                                tr0 tr0Var = tr0VarArr[i10];
                                tr0Var.f39796r.h1(i7, (-tr0Var.h.getPaddingTop()) + i12);
                            }
                        }
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final float k0(float f10) {
        float f11 = 0.0f;
        if (A0()) {
            return 0.0f;
        }
        tr0[] tr0VarArr = this.f42117n0;
        tr0 tr0Var = tr0VarArr[1];
        if (tr0Var != null && v0(tr0Var.F)) {
            f11 = 0.0f + f10;
        }
        tr0 tr0Var2 = tr0VarArr[0];
        if (tr0Var2 != null && v0(tr0Var2.F)) {
            return (1.0f - f10) + f11;
        }
        return f11;
    }

    public final void k1(int i7) {
        vq0 vq0Var;
        if (!this.P1 && (vq0Var = this.L0) != null) {
            vq0Var.g(null, i7, vq0Var.Q.get(i7));
        }
    }

    public final float l0(float f10) {
        float f11 = 0.0f;
        if (A0()) {
            return 0.0f;
        }
        tr0[] tr0VarArr = this.f42117n0;
        tr0 tr0Var = tr0VarArr[1];
        if (tr0Var != null && F0(tr0Var.F) && tr0VarArr[1].F != 11) {
            f11 = 0.0f + f10;
        }
        tr0 tr0Var2 = tr0VarArr[0];
        if (tr0Var2 != null && F0(tr0Var2.F) && tr0VarArr[0].F != 11) {
            return (1.0f - f10) + f11;
        }
        return f11;
    }

    public final void l1(float f10, int i7) {
        int i10;
        vq0 vq0Var = this.L0;
        if (vq0Var != null) {
            if (J0(i7)) {
                i10 = 8;
            } else {
                i10 = i7;
            }
            vq0Var.i(f10, i10);
        }
        zp0 zp0Var = this.f42084c0;
        if (zp0Var != null) {
            v61 v61Var = zp0Var.f48492b;
            if (J0(i7)) {
                v61Var.f(f10, w1(i7));
            } else if (i7 == 8) {
                v61Var.f(f10, 0);
            }
        }
    }

    @Override
    public final boolean m() {
        return false;
    }

    public final int m0(int i7) {
        vs0 z12;
        fi.k6 k6Var;
        if (z0(i7) && (z12 = z1(i7)) != null && (k6Var = z12.f41146s) != null) {
            return k6Var.g();
        }
        return 0;
    }

    public final void m1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i7 = 0;
        while (true) {
            tr0[] tr0VarArr = this.f42117n0;
            if (i7 < tr0VarArr.length) {
                tr0 tr0Var = tr0VarArr[i7];
                if (tr0Var.F != 7 || tr0Var.h.getAdapter() == null || tr0VarArr[i7].h.getAdapter().b() == 0 || this.f42150y1.getMessagesController().P1().f12326j.size() <= 0) {
                    i7++;
                } else {
                    return;
                }
            } else {
                if (this.G == 0) {
                    lr0 lr0Var = this.f42087d0;
                    lr0Var.d = chatFull;
                    lr0Var.f36893e = arrayList;
                }
                P1(true);
                for (int i10 = 0; i10 < tr0VarArr.length; i10++) {
                    tr0 tr0Var2 = tr0VarArr[i10];
                    if (tr0Var2.F == 7 && tr0Var2.h.getAdapter() != null) {
                        org.telegram.messenger.g0.r2(tr0VarArr[i10].h);
                    }
                }
                return;
            }
        }
    }

    public final int n0(int i7) {
        float f10;
        zp0 zp0Var = this.f42084c0;
        if (zp0Var != null && (J0(i7) || i7 == 8)) {
            f10 = zp0Var.getVisibilityFactor() * org.telegram.messenger.g0.L(40.0f);
        } else {
            f10 = 0.0f;
        }
        return (int) f10;
    }

    public final void n1(int i7, int i10, int i11, int i12) {
        tr0[] tr0VarArr;
        boolean z10;
        boolean z11 = true;
        this.f42086c2 = true;
        this.d2 = i7;
        this.f42092e2 = i10;
        this.f42096f2 = i11;
        this.f42082b2 = i12;
        G();
        wp0 wp0Var = this.f42080b0;
        if (wp0Var != null) {
            if (wp0Var.M != i10 || wp0Var.N != i11) {
                wp0Var.M = i10;
                wp0Var.N = i11;
                if (i10 == 0 && i11 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                wp0Var.setClipChildren(z10);
                wp0Var.h.setClipChildren((i10 == 0 && i11 == 0) ? false : false);
                wp0Var.n();
            }
            H1();
        }
        for (tr0 tr0Var : this.f42117n0) {
            if (tr0Var != null) {
                tr0Var.setClipChildren(false);
                J1(tr0Var);
                setPageOverscan(tr0Var.h);
                setPageOverscan(tr0Var.f39795n);
                int paddingTop = tr0Var.h.getPaddingTop();
                dq0 dq0Var = tr0Var.h;
                int paddingLeft = dq0Var.getPaddingLeft();
                dq0 dq0Var2 = tr0Var.h;
                int j02 = j0(tr0Var.F);
                dq0Var2.f39401h3 = j02;
                int paddingRight = tr0Var.h.getPaddingRight();
                dq0 dq0Var3 = tr0Var.h;
                int i02 = i0(I0());
                dq0Var3.f39402i3 = i02;
                dq0Var.setPadding(paddingLeft, j02, paddingRight, i02);
                int paddingTop2 = paddingTop - tr0Var.h.getPaddingTop();
                if (paddingTop2 != 0) {
                    org.telegram.messenger.g0.J(tr0Var.h, new ep0(tr0Var, paddingTop2, 1));
                }
                tr0Var.f39798w.setPadding(0, i7, 0, i12);
                gr0 gr0Var = this.W;
                if (gr0Var != null && gr0Var.getParent() == tr0Var) {
                    p1(org.telegram.messenger.g0.L(56.0f) + i7, gr0Var);
                }
                vp0 vp0Var = this.f42076a0;
                if (vp0Var != null && vp0Var.getParent() == tr0Var) {
                    p1(i7, vp0Var);
                }
            }
        }
        setClipChildren(false);
        requestLayout();
        invalidate();
    }

    public final void o1(int i7, boolean z10) {
        this.D0.a(i7, z10);
        org.telegram.ui.ActionBar.w4 w4Var = this.I;
        if (w4Var != null) {
            w4Var.A(i7, z10);
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i7 = 0;
        while (true) {
            tr0[] tr0VarArr = this.f42117n0;
            if (i7 < tr0VarArr.length) {
                dq0 dq0Var = tr0VarArr[i7].h;
                if (dq0Var != null) {
                    dq0Var.getViewTreeObserver().addOnPreDrawListener(new br0(this, i7, 0));
                }
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!T() && !this.L0.I && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i7);
        nr0 nr0Var = this.G1;
        if (nr0Var.f() != null) {
            i11 = nr0Var.f().getHeight();
        } else {
            i11 = 0;
        }
        if (i11 == 0) {
            i11 = View.MeasureSpec.getSize(i10);
        }
        setMeasuredDimension(size, i11);
        int childCount = getChildCount();
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            if (childAt == null || childAt.getVisibility() == 8) {
                i12 = i7;
            } else if (childAt instanceof tr0) {
                i12 = i7;
                measureChildWithMargins(childAt, i12, 0, View.MeasureSpec.makeMeasureSpec(i11, 1073741824), 0);
                dq0 dq0Var = ((tr0) childAt).h;
                dq0Var.setPadding(0, dq0Var.f39399f3, 0, dq0Var.f39400g3);
            } else {
                i12 = i7;
                i13 = i10;
                measureChildWithMargins(childAt, i12, 0, i13, 0);
                i14++;
                i7 = i12;
                i10 = i13;
            }
            i13 = i10;
            i14++;
            i7 = i12;
            i10 = i13;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        boolean z10;
        boolean z11;
        int i10;
        boolean z12 = false;
        if (!this.P1) {
            org.telegram.ui.ActionBar.e2 e2Var = this.f42150y1;
            if (e2Var.getParentLayout() != null && !((ActionBarLayout) e2Var.getParentLayout()).i() && !T() && !this.f42075a) {
                if (motionEvent != null) {
                    if (this.E1 == null) {
                        this.E1 = VelocityTracker.obtain();
                    }
                    this.E1.addMovement(motionEvent);
                    hi.l3 l3Var = this.H1;
                    if (l3Var != null) {
                        l3Var.f(true);
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.A1 && !this.B1) {
                    if (motionEvent.getY() >= org.telegram.messenger.g0.L(90.0f) + this.d2) {
                        this.f42152z1 = motionEvent.getPointerId(0);
                        this.B1 = true;
                        this.C1 = (int) motionEvent.getX();
                        this.D1 = (int) motionEvent.getY();
                        this.E1.clear();
                        return this.A1;
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f42152z1) {
                    int x10 = (int) (motionEvent.getX() - this.C1);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.D1);
                    boolean z13 = this.A1;
                    tr0[] tr0VarArr = this.f42117n0;
                    if (z13 && (((z10 = this.f42110k1) && x10 > 0) || (!z10 && x10 < 0))) {
                        if (x10 < 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!g1(motionEvent, z11)) {
                            this.B1 = true;
                            this.A1 = false;
                            tr0VarArr[0].setTranslationX(0.0f);
                            tr0 tr0Var = tr0VarArr[1];
                            if (this.f42110k1) {
                                i10 = tr0VarArr[0].getMeasuredWidth();
                            } else {
                                i10 = -tr0VarArr[0].getMeasuredWidth();
                            }
                            tr0Var.setTranslationX(i10);
                            l1(0.0f, tr0VarArr[1].F);
                            Z0(getTabProgress());
                        }
                    }
                    if (this.B1 && !this.A1) {
                        if (Math.abs(x10) >= org.telegram.messenger.g0.a1(true, 0.3f) && Math.abs(x10) > abs) {
                            if (x10 < 0) {
                                z12 = true;
                            }
                            g1(motionEvent, z12);
                        }
                    } else if (this.A1) {
                        tr0VarArr[0].setTranslationX(x10);
                        if (this.f42110k1) {
                            tr0VarArr[1].setTranslationX(tr0VarArr[0].getMeasuredWidth() + x10);
                        } else {
                            tr0VarArr[1].setTranslationX(x10 - tr0VarArr[0].getMeasuredWidth());
                        }
                        float abs2 = Math.abs(x10) / tr0VarArr[0].getMeasuredWidth();
                        if (!I()) {
                            this.f42129r0 = 0.0f;
                        } else {
                            this.f42129r0 = l0(abs2);
                            M1(abs2);
                            float k02 = k0(abs2);
                            this.f42133s0 = k02;
                            if (k02 != 0.0f && I() && !A0()) {
                                i7 = 0;
                            } else {
                                i7 = 4;
                            }
                            this.f42138u0.setVisibility(i7);
                        }
                        I1(false);
                        l1(abs2, tr0VarArr[1].F);
                        Z0(getTabProgress());
                        Y0();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f42152z1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    v1(motionEvent);
                }
                return this.A1;
            }
        }
        return false;
    }

    public final float q0(int i7, boolean z10) {
        float width = getWidth();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            tr0[] tr0VarArr = this.f42117n0;
            if (i10 >= tr0VarArr.length) {
                break;
            }
            tr0 tr0Var = tr0VarArr[i10];
            if (tr0Var != null) {
                int i12 = tr0Var.F;
                if ((z10 && i7 == 8 && J0(i12)) || i12 == i7) {
                    i11++;
                    width = tr0VarArr[i10].getTranslationX();
                }
            }
            i10++;
        }
        if (i11 == 2) {
            return 0.0f;
        }
        return width;
    }

    public void q1(boolean z10) {
        float f10;
        if (this.F1 != z10) {
            this.F1 = z10;
            org.telegram.ui.ActionBar.w4 w4Var = this.I;
            if (w4Var != null) {
                if (z10) {
                    O1();
                    w4Var.F();
                } else {
                    w4Var.u();
                }
                R(true, true);
                return;
            }
            AnimatorSet animatorSet = this.R1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            LinearLayout linearLayout = this.E0;
            if (z10) {
                linearLayout.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.R1 = animatorSet2;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(linearLayout, View.ALPHA, f10));
            this.R1.setDuration(180L);
            this.R1.addListener(new org.telegram.ui.nn(20, this, z10));
            this.R1.start();
            if (z10) {
                O1();
            }
        }
    }

    public final float r0(int i7, boolean z10) {
        float f10 = 0.0f;
        int i10 = 0;
        while (true) {
            tr0[] tr0VarArr = this.f42117n0;
            if (i10 < tr0VarArr.length) {
                tr0 tr0Var = tr0VarArr[i10];
                if (tr0Var != null) {
                    int i11 = tr0Var.F;
                    if ((z10 && i7 == 8 && J0(i11)) || i11 == i7) {
                        f10 = (1.0f - Math.abs(tr0VarArr[i10].getTranslationX() / getWidth())) + f10;
                    }
                }
                i10++;
            } else {
                return f10;
            }
        }
    }

    public final void r1(int r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ys0.r1(int, boolean):void");
    }

    public final int s0(int i7) {
        org.telegram.ui.ActionBar.e6 e6Var = this.I1;
        if (e6Var != null) {
            return e6Var.h(i7);
        }
        return org.telegram.ui.ActionBar.j6.x0(null, i7, false);
    }

    public final void s1(int i7) {
        int w12 = w1(getClosestTab());
        zp0 zp0Var = this.f42084c0;
        if (w12 != i7) {
            if (zp0Var != null) {
                zp0Var.f48492b.d(i7, zp0Var.d.i(i7));
                return;
            }
            return;
        }
        zp0Var.setReorderingAlbums(true);
        xs0 x12 = x1(i7);
        tr0 g02 = g0(x12.f41758a);
        if (g02 == null) {
            return;
        }
        dq0 dq0Var = g02.h;
        for (int i10 = 0; i10 < dq0Var.getChildCount(); i10++) {
            View childAt = dq0Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.n7) {
                ((org.telegram.ui.Cells.n7) childAt).l(true, true);
            }
        }
        ws0 ws0Var = x12.f41760c;
        if (ws0Var != null && !ws0Var.f41149y) {
            ws0Var.f41149y = true;
        }
        I1(true);
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        boolean z10;
        int i7;
        TLRPC.ChatFull chatFull2 = this.f42098g1;
        if (chatFull2 != null && chatFull2.stories_pinned_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f42098g1 = chatFull;
        if (chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.f42095f1 == 0) {
                this.f42095f1 = -j3;
                int i10 = 0;
                while (true) {
                    ns0[] ns0VarArr = this.f42144w1;
                    if (i10 >= ns0VarArr.length) {
                        break;
                    }
                    if (ns0VarArr[i10].f37693b[1].size() == 0) {
                        ns0 ns0Var = ns0VarArr[i10];
                        ns0Var.f37699j[1] = this.f42098g1.migrated_from_max_id;
                        ns0Var.f37698i[1] = false;
                    }
                    i10++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.f42098g1;
        if (chatFull3 != null && z10 != chatFull3.stories_pinned_available) {
            vq0 vq0Var = this.L0;
            if (vq0Var != null) {
                if (A0()) {
                    i7 = 9;
                } else {
                    i7 = 8;
                }
                vq0Var.setInitialTabId(i7);
            }
            P1(true);
            B1(false);
        }
    }

    public void setCommonGroupsCount(int i7) {
        if (this.G == 0) {
            this.f42077a1[6] = i7;
        }
        P1(true);
        N();
    }

    public void setForwardRestrictedHint(hi.l3 l3Var) {
        this.H1 = l3Var;
    }

    public void setMergeDialogId(long j3) {
        this.f42095f1 = j3;
    }

    public void setNewMediaCounts(int[] iArr) {
        int[] iArr2;
        int i7 = 0;
        while (true) {
            iArr2 = this.f42077a1;
            if (i7 > 6 || iArr2[i7] >= 0) {
                break;
            }
            i7++;
        }
        System.arraycopy(iArr, 0, iArr2, 0, 6);
        P1(true);
        N();
        if (iArr2[0] >= 0) {
            M0(false);
        }
    }

    public void setOnTopPanelShiftChanged(Runnable runnable) {
        this.f42111k2 = runnable;
    }

    @Override
    public final void setPadding(int i7, int i10, int i11, int i12) {
        this.O1 = i10;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            tr0[] tr0VarArr = this.f42117n0;
            if (i14 >= tr0VarArr.length) {
                break;
            }
            tr0VarArr[i14].setTranslationY(this.O1);
            i14++;
        }
        if (this.S0 != null) {
            U();
        } else {
            rq0 rq0Var = this.U0;
            if (rq0Var != null) {
                rq0Var.setTranslationY(org.telegram.messenger.g0.L(48.0f) + i10);
            }
        }
        this.R0 = i10;
        org.telegram.ui.Cells.t0 t0Var = this.N0;
        if (t0Var.getTag() == null) {
            i13 = -org.telegram.messenger.g0.L(48.0f);
        }
        t0Var.setTranslationY(i13 + this.R0);
    }

    public void setPagesGlassEngine(ri.q qVar) {
        tr0[] tr0VarArr;
        this.f42102h2 = qVar;
        wp0 wp0Var = this.f42080b0;
        if (wp0Var != null) {
            wp0Var.setGlassEngine(qVar);
        }
        for (tr0 tr0Var : this.f42117n0) {
            if (tr0Var != null) {
                tr0Var.h.setCaptureSectionsDecoratorAllowed(true);
                qVar.b(tr0Var.h);
            }
        }
    }

    public void setPagesPaddingBottom(int i7) {
        if (this.f42082b2 != i7) {
            this.f42082b2 = i7;
            tr0[] tr0VarArr = this.f42117n0;
            if (tr0VarArr != null) {
                for (tr0 tr0Var : tr0VarArr) {
                    if (tr0Var != null) {
                        dq0 dq0Var = tr0Var.h;
                        int paddingLeft = dq0Var.getPaddingLeft();
                        dq0 dq0Var2 = tr0Var.h;
                        int i10 = dq0Var2.f39399f3;
                        int paddingRight = dq0Var2.getPaddingRight();
                        dq0 dq0Var3 = tr0Var.h;
                        int i02 = i0(I0());
                        dq0Var3.f39402i3 = i02;
                        dq0Var.setPadding(paddingLeft, i10, paddingRight, i02);
                    }
                }
            }
        }
    }

    public void setPagesVisibleOverscanTop(int i7) {
        if (this.f42099g2 != i7) {
            this.f42099g2 = i7;
            invalidate();
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
        }
    }

    public void setPinnedToTop(boolean z10) {
        if (this.d != z10) {
            this.d = z10;
            int i7 = 0;
            while (true) {
                tr0[] tr0VarArr = this.f42117n0;
                if (i7 < tr0VarArr.length) {
                    F1(tr0VarArr[i7], true);
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        boolean z10;
        TLRPC.UserFull userFull2 = this.f42101h1;
        if (userFull2 != null && userFull2.stories_pinned_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f42101h1 = userFull;
        P1(true);
        if (userFull != null && z10 != userFull.stories_pinned_available) {
            k1(8);
        }
    }

    public void setVisibleHeight(int i7) {
        float f10;
        this.Q1 = i7;
        int i10 = 0;
        while (true) {
            tr0[] tr0VarArr = this.f42117n0;
            if (i10 >= tr0VarArr.length) {
                break;
            }
            int measuredHeight = getMeasuredHeight();
            if (tr0VarArr[i10].F == 8) {
                f10 = 280.0f;
            } else {
                f10 = 120.0f;
            }
            float f11 = (-(measuredHeight - Math.max(i7, org.telegram.messenger.g0.L(f10)))) / 2.0f;
            tr0VarArr[i10].f39798w.setTranslationY(f11);
            tr0VarArr[i10].f39797s.setTranslationY(-f11);
            i10++;
        }
        vp0 vp0Var = this.f42076a0;
        if (vp0Var != null) {
            vp0Var.setVisibleHeight(i7);
        }
        wp0 wp0Var = this.f42080b0;
        if (wp0Var != null) {
            wp0Var.setVisibleHeight(i7);
        }
    }

    public final boolean t0() {
        if (this.f42150y1.getConnectionsManager().getConnectionState() == 3) {
            return true;
        }
        return false;
    }

    public final void t1(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ys0.t1(boolean):void");
    }

    @Override
    public final void u(org.telegram.ui.Cells.t2 t2Var) {
        int i7;
        org.telegram.ui.ActionBar.e2 e2Var = this.f42150y1;
        if (e2Var != null && e2Var.getMessagesController().P1().K(t2Var.getDialogId())) {
            e2Var.getOrCreateStoryViewer().getClass();
            fi.i9 orCreateStoryViewer = e2Var.getOrCreateStoryViewer();
            Context context = e2Var.getContext();
            long dialogId = t2Var.getDialogId();
            fi.b7 a10 = fi.b7.a((uj0) t2Var.getParent());
            if ((e2Var instanceof ProfileActivity) && ((ProfileActivity) e2Var).f43191s1) {
                i7 = org.telegram.messenger.g0.L(68.0f);
            } else {
                i7 = 0;
            }
            a10.f11575s += i7;
            orCreateStoryViewer.J(context, dialogId, a10);
        }
    }

    public final boolean u0() {
        SparseArray[] sparseArrayArr;
        org.telegram.messenger.gj gjVar;
        TLRPC.Message message;
        boolean z10 = false;
        for (int i7 = 1; i7 >= 0; i7--) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (true) {
                sparseArrayArr = this.f42085c1;
                if (i10 >= sparseArrayArr[i7].size()) {
                    break;
                }
                arrayList.add(Integer.valueOf(sparseArrayArr[i7].keyAt(i10)));
                i10++;
            }
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                Object obj = arrayList.get(i11);
                i11++;
                Integer num = (Integer) obj;
                if (num.intValue() > 0 && (gjVar = (org.telegram.messenger.gj) sparseArrayArr[i7].get(num.intValue())) != null && (message = gjVar.f23817k) != null && message.noforwards) {
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

    public final void u1() {
        int i7 = 0;
        while (true) {
            tr0[] tr0VarArr = this.f42117n0;
            if (i7 < tr0VarArr.length) {
                int childCount = tr0VarArr[i7].h.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = tr0VarArr[i7].h.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.h2) {
                        ImageReceiver photoImage = ((org.telegram.ui.Cells.h2) childAt).getPhotoImage();
                        if (i7 == 0) {
                            photoImage.f22301u0 = true;
                            photoImage.P0(false);
                        } else {
                            photoImage.f22301u0 = false;
                            photoImage.Q0();
                        }
                    }
                }
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void updateColors() {
        tr0[] tr0VarArr;
        try {
            this.J1.a(s0(org.telegram.ui.ActionBar.j6.f28849d6));
            org.telegram.ui.ActionBar.x1 x1Var = this.G0;
            if (x1Var != null) {
                x1Var.a(s0(org.telegram.ui.ActionBar.j6.f29243y8));
            }
            NumberTextView numberTextView = this.D0;
            if (numberTextView != null) {
                numberTextView.setTextColor(s0(org.telegram.ui.ActionBar.j6.f29243y8));
            }
            D1();
            invalidate();
            for (tr0 tr0Var : this.f42117n0) {
                if (tr0Var != null && tr0Var.M) {
                    tr0Var.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final boolean v0(int i7) {
        if (i7 != 0) {
            if (((i7 != 8 && !J0(i7)) || !TextUtils.isEmpty(getStoriesHashtag())) && i7 != 9 && i7 != 11 && i7 != 13) {
                if (i7 != 14 || this.f42080b0 == null) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void v1(MotionEvent motionEvent) {
        float f10;
        float f11;
        boolean z10;
        float measuredWidth;
        tr0 tr0Var;
        tr0 tr0Var2;
        int measuredWidth2;
        tr0 tr0Var3;
        tr0 tr0Var4;
        boolean z11;
        VelocityTracker velocityTracker = this.E1;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.V0);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f10 = this.E1.getXVelocity();
                f11 = this.E1.getYVelocity();
                if (!this.A1 && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                    if (f10 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    g1(motionEvent, z11);
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
            }
            if (this.A1) {
                tr0[] tr0VarArr = this.f42117n0;
                float x10 = tr0VarArr[0].getX();
                this.f42104i1 = new AnimatorSet();
                if (Math.abs(x10) < tr0VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.l1 = z10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new f60(this, 18));
                boolean z12 = this.l1;
                Property property = View.TRANSLATION_X;
                if (z12) {
                    measuredWidth = Math.abs(x10);
                    if (this.f42110k1) {
                        this.f42104i1.playTogether(ObjectAnimator.ofFloat(tr0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(tr0VarArr[1], property, tr0Var4.getMeasuredWidth()), ofFloat);
                    } else {
                        this.f42104i1.playTogether(ObjectAnimator.ofFloat(tr0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(tr0VarArr[1], property, -tr0Var3.getMeasuredWidth()), ofFloat);
                    }
                } else {
                    measuredWidth = tr0VarArr[0].getMeasuredWidth() - Math.abs(x10);
                    if (this.f42110k1) {
                        this.f42104i1.playTogether(ObjectAnimator.ofFloat(tr0VarArr[0], property, -tr0Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(tr0VarArr[1], property, 0.0f), ofFloat);
                    } else {
                        this.f42104i1.playTogether(ObjectAnimator.ofFloat(tr0VarArr[0], property, tr0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(tr0VarArr[1], property, 0.0f), ofFloat);
                    }
                }
                this.f42104i1.setInterpolator(f42072u2);
                int measuredWidth3 = getMeasuredWidth();
                float f12 = measuredWidth3 / 2;
                float I = (org.telegram.messenger.g0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f12) + f12;
                float abs = Math.abs(f10);
                if (abs > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(I / abs) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                this.f42104i1.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                this.f42104i1.addListener(new yq0(this, 1));
                this.f42104i1.start();
                this.f42107j1 = true;
                this.A1 = false;
                Y0();
            } else {
                this.B1 = false;
                setHeaderEnabled(true);
                this.L0.setEnabled(true);
            }
            VelocityTracker velocityTracker2 = this.E1;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.E1 = null;
            }
        }
    }

    public final void w0() {
        org.telegram.messenger.g0.r(this.P0);
        org.telegram.ui.Cells.t0 t0Var = this.N0;
        if (t0Var.getTag() == null) {
            return;
        }
        t0Var.setTag(null);
        AnimatorSet animatorSet = this.O0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.O0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.O0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.O0.playTogether(ObjectAnimator.ofFloat(t0Var, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(t0Var, View.TRANSLATION_Y, (-org.telegram.messenger.g0.L(48.0f)) + this.R0));
        this.O0.setInterpolator(er.f34421g);
        this.O0.addListener(new yq0(this, 0));
        this.O0.start();
    }

    public final int w1(int i7) {
        xs0 y12 = y1(i7);
        if (y12 == null) {
            return -1;
        }
        return y12.f41759b;
    }

    public boolean x0() {
        return false;
    }

    public final xs0 x1(int i7) {
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = this.f42115m2;
        xs0 xs0Var = (xs0) hashMap.get(valueOf);
        if (xs0Var == null) {
            xs0 xs0Var2 = new xs0(this, getContext(), i7);
            hashMap.put(Integer.valueOf(i7), xs0Var2);
            this.f42118n2.put(Integer.valueOf(xs0Var2.f41758a), Integer.valueOf(i7));
            return xs0Var2;
        }
        return xs0Var;
    }

    public boolean y0() {
        return !(this instanceof r20);
    }

    public final xs0 y1(int i7) {
        Integer num = (Integer) this.f42118n2.get(Integer.valueOf(i7));
        if (num == null) {
            return null;
        }
        return (xs0) this.f42115m2.get(num);
    }

    public final void z(View view) {
        tr0[] tr0VarArr = this.f42117n0;
        addView(view, Math.max(indexOfChild(tr0VarArr[0]), indexOfChild(tr0VarArr[1])) + 1, c8.ja.e(-1, 0, 48));
        view.getLayoutParams().height = 0;
    }

    public final vs0 z1(int i7) {
        xs0 y12;
        if (i7 == 8) {
            return this.f42094f0;
        }
        if (i7 == 9) {
            return this.f42100h0;
        }
        if (J0(i7) && (y12 = y1(i7)) != null) {
            return y12.f41760c;
        }
        return null;
    }

    public void P0(SparseArray sparseArray) {
    }

    public void X0(boolean z10) {
    }

    public int h1(int i7) {
        return i7;
    }

    @Override
    public final void l(org.telegram.ui.Cells.t2 t2Var) {
    }

    @Override
    public final void r(org.telegram.ui.Cells.t2 t2Var) {
    }

    @Override
    public final void w(org.telegram.ui.Cells.t2 t2Var) {
    }

    public void Q0() {
    }

    public void W0() {
    }

    @Override
    public final void q() {
    }
}
