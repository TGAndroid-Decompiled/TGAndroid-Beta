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
public abstract class jt0 extends FrameLayout implements org.telegram.ui.ActionBar.b6, org.telegram.messenger.gs, org.telegram.ui.Cells.q2, yj0 {
    public static final int[] f36604t2 = {0, 1, 2, 4};
    public static final dq0 f36605u2 = new dq0(0);
    public static final int f36606v2 = org.telegram.messenger.g0.L(7.0f);
    public static final int f36607w2 = org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(14.0f);
    public int A0;
    public boolean A1;
    public final Drawable B0;
    public boolean B1;
    public boolean C0;
    public int C1;
    public final NumberTextView D0;
    public int D1;
    public final yz E;
    public final LinearLayout E0;
    public VelocityTracker E1;
    public final int F;
    public final ImageView F0;
    public boolean F1;
    public final long G;
    public final org.telegram.ui.ActionBar.x1 G0;
    public final xr0 G1;
    public final org.telegram.ui.ActionBar.k H;
    public final ArrayList H0;
    public hi.l3 H1;
    public final org.telegram.ui.ActionBar.z4 I;
    public final ArrayList I0;
    public final org.telegram.ui.ActionBar.h6 I1;
    public final org.telegram.ui.ActionBar.g5 J;
    public final ArrayList J0;
    public final ui.c J1;
    public final pr0 K;
    public final ArrayList K0;
    public final xi.e K1;
    public final dt0 L;
    public final fr0 L0;
    public boolean L1;
    public final xs0 M;
    public final cr0 M0;
    public final h2.f M1;
    public final ws0 N;
    public final org.telegram.ui.Cells.v0 N0;
    public org.telegram.ui.f0 N1;
    public final ws0 O;
    public AnimatorSet O0;
    public int O1;
    public final ws0 P;
    public final hp0 P0;
    public boolean P1;
    public final ss0 Q;
    public final ArrayList Q0;
    public int Q1;
    public final yr0 R;
    public float R0;
    public AnimatorSet R1;
    public final wr0 S;
    public final es S0;
    public final SparseArray S1;
    public final ur0 T;
    public final FrameLayout T0;
    public long T1;
    public final us0 U;
    public final br0 U0;
    public boolean U1;
    public final vs0 V;
    public final int V0;
    public int V1;
    public final qr0 W;
    public final Paint W0;
    public final mr0 W1;
    public boolean X0;
    public fi.h6 X1;
    public boolean Y0;
    public float Y1;
    public ch.p0 Z0;
    public boolean Z1;
    public boolean f36608a;
    public final fq0 f36609a0;
    public final int[] f36610a1;
    public SpannableStringBuilder f36611a2;
    public boolean f36612b;
    public final gq0 f36613b0;
    public int f36614b1;
    public int f36615b2;
    public boolean f36616c;
    public final jq0 f36617c0;
    public final SparseArray[] f36618c1;
    public boolean f36619c2;
    public boolean d;
    public final vr0 f36620d0;
    public int f36621d1;
    public int d2;
    public int f36622e;
    public final v4.z f36623e0;
    public boolean f36624e1;
    public int f36625e2;
    public int f36626f;
    public final sr0 f36627f0;
    public long f36628f1;
    public int f36629f2;
    public final gt0 f36630g0;
    public TLRPC.ChatFull f36631g1;
    public int f36632g2;
    public float h;
    public final eq0 f36633h0;
    public TLRPC.UserFull f36634h1;
    public ri.q f36635h2;
    public final gt0 f36636i0;
    public AnimatorSet f36637i1;
    public float f36638i2;
    public final gs0 f36639j0;
    public boolean f36640j1;
    public final RectF f36641j2;
    public final gs0 f36642k0;
    public boolean f36643k1;
    public Runnable f36644k2;
    public final gs0 f36645l0;
    public boolean l1;
    public int f36646l2;
    public final bs0 m0;
    public final long f36647m1;
    public final HashMap f36648m2;
    public float f36649n;
    public final ds0[] f36650n0;
    public boolean n1;
    public final HashMap f36651n2;
    public final org.telegram.ui.ActionBar.q0 f36652o0;
    public boolean f36653o1;
    public int f36654o2;
    public final org.telegram.ui.ActionBar.q0 f36655p0;
    public final int[] f36656p1;
    public int f36657p2;
    public final org.telegram.ui.ActionBar.q0 f36658q0;
    public float f36659q1;
    public boolean f36660q2;
    public boolean f36661r;
    public float f36662r0;
    public boolean f36663r1;
    public int f36664r2;
    public int f36665s;
    public float f36666s0;
    public int f36667s1;
    public int f36668s2;
    public final TextView f36669t0;
    public int f36670t1;
    public final ImageView f36671u0;
    public final pq0 f36672u1;
    public final rh0 f36673v0;
    public float f36674v1;
    public int f36675w;
    public final org.telegram.ui.ActionBar.q0 f36676w0;
    public final ys0[] f36677w1;
    public int f36678x;
    public final org.telegram.ui.ActionBar.q0 f36679x0;
    public final bt0 f36680x1;
    public final Rect f36681y;
    public final org.telegram.ui.ActionBar.q0 f36682y0;
    public final org.telegram.ui.ActionBar.g2 f36683y1;
    public final org.telegram.ui.ActionBar.q0 f36684z0;
    public int f36685z1;

    public jt0(android.content.Context r34, long r35, org.telegram.ui.Components.bt0 r37, int r38, java.util.ArrayList r39, org.telegram.tgnet.TLRPC.ChatFull r40, org.telegram.tgnet.TLRPC.UserFull r41, int r42, int r43, org.telegram.ui.ActionBar.g2 r44, org.telegram.ui.Components.xr0 r45, int r46, org.telegram.ui.ActionBar.h6 r47, dh.c r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jt0.<init>(android.content.Context, long, org.telegram.ui.Components.bt0, int, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.tgnet.TLRPC$UserFull, int, int, org.telegram.ui.ActionBar.g2, org.telegram.ui.Components.xr0, int, org.telegram.ui.ActionBar.h6, dh.c):void");
    }

    public static boolean J0(int i7) {
        if ((i7 & (-65536)) == 65536) {
            return true;
        }
        return false;
    }

    public static y3 X(int i7, long j3, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        y3 y3Var = new y3(context, h6Var);
        ImageView imageView = (ImageView) y3Var.d;
        TextView textView = (TextView) y3Var.f42309c;
        if (i7 == 0) {
            if (org.telegram.messenger.n5.C(j3)) {
                textView.setText(org.telegram.messenger.hd.N0(2131748003, null));
                return y3Var;
            }
            textView.setText(org.telegram.messenger.hd.N0(2131748005, null));
            return y3Var;
        } else if (i7 == 1) {
            if (org.telegram.messenger.n5.C(j3)) {
                textView.setText(org.telegram.messenger.hd.N0(2131747964, null));
                return y3Var;
            }
            textView.setText(org.telegram.messenger.hd.N0(2131747965, null));
            return y3Var;
        } else if (i7 == 2) {
            if (org.telegram.messenger.n5.C(j3)) {
                textView.setText(org.telegram.messenger.hd.N0(2131747959, null));
                return y3Var;
            }
            textView.setText(org.telegram.messenger.hd.N0(2131747960, null));
            return y3Var;
        } else if (i7 == 3) {
            if (org.telegram.messenger.n5.C(j3)) {
                textView.setText(org.telegram.messenger.hd.N0(2131747961, null));
                return y3Var;
            }
            textView.setText(org.telegram.messenger.hd.N0(2131747962, null));
            return y3Var;
        } else if (i7 == 4) {
            if (org.telegram.messenger.n5.C(j3)) {
                textView.setText(org.telegram.messenger.hd.N0(2131747966, null));
                return y3Var;
            }
            textView.setText(org.telegram.messenger.hd.N0(2131747967, null));
            return y3Var;
        } else if (i7 == 5) {
            if (org.telegram.messenger.n5.C(j3)) {
                textView.setText(org.telegram.messenger.hd.N0(2131747963, null));
                return y3Var;
            }
            textView.setText(org.telegram.messenger.hd.N0(2131748015, null));
            return y3Var;
        } else if (i7 == 6) {
            imageView.setImageDrawable(null);
            textView.setText(org.telegram.messenger.hd.N0(2131748013, null));
            return y3Var;
        } else {
            if (i7 == 7) {
                imageView.setImageDrawable(null);
                textView.setText("");
            }
            return y3Var;
        }
    }

    public static void a(jt0 jt0Var, TL_stories.StoryItem storyItem, fi.i6 i6Var) {
        jt0Var.getStoriesController().c(i6Var.f12144a, jt0Var.f36647m1, storyItem);
        org.telegram.messenger.g0.h3(new fm0(5, jt0Var, i6Var), 100L);
    }

    public static void d(jt0 jt0Var, int i7, TL_stories.StoryItem storyItem, String str) {
        org.telegram.ui.f0 f0Var = new org.telegram.ui.f0(jt0Var, i7, storyItem, 18);
        fi.p6 storiesController = jt0Var.getStoriesController();
        long j3 = jt0Var.f36647m1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.f0(i7, j3, arrayList);
        lc.b0(jt0Var.f36683y1).K(2131623980, org.telegram.messenger.g0.W2(org.telegram.messenger.hd.G(1, "StoryRemovedFromAlbumTitle", str)), org.telegram.messenger.hd.N0(2131743640, null), f0Var).j();
    }

    public static void e(jt0 jt0Var, long j3, int i7) {
        fi.d6 B = jt0Var.getStoriesController().B(j3, true);
        int i10 = B.f11894a;
        int c10 = B.c(i7);
        if (c10 == -1) {
            return;
        }
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = org.telegram.messenger.np.u1(i10).l1(B.f11895b);
        tL_deleteAlbum.album_id = ((fi.i6) B.h.remove(c10)).f12144a;
        ConnectionsManager.getInstance(i10).sendRequest(tL_deleteAlbum, null);
        B.f(true);
    }

    public static void f(jt0 jt0Var, long j3, int i7, String str) {
        fi.d6 B = jt0Var.getStoriesController().B(j3, true);
        int i10 = B.f11894a;
        int c10 = B.c(i7);
        if (c10 == -1) {
            return;
        }
        ((fi.i6) B.h.get(c10)).f12145b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = org.telegram.messenger.np.u1(i10).l1(B.f11895b);
        tL_updateAlbum.album_id = i7;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i10).sendRequest(tL_updateAlbum, null);
        B.f(true);
    }

    public long getPlaylistTopicId() {
        if (org.telegram.messenger.v3.b0(this.f36683y1.getCurrentAccount(), this.f36647m1)) {
            return this.G;
        }
        return 0L;
    }

    public fi.p6 getStoriesController() {
        return org.telegram.messenger.np.u1(this.f36683y1.getCurrentAccount()).R1();
    }

    public static void h(jt0 jt0Var, TL_stories.StoryItem storyItem) {
        jt0Var.getStoriesController().r0(jt0Var.f36647m1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        lc.b0(jt0Var.f36683y1).G(2131623980, 5000, org.telegram.messenger.hd.G(1, "StoryArchived", new Object[0])).j();
    }

    public static void j(jt0 jt0Var, HashSet hashSet, TL_stories.StoryItem storyItem, a70 a70Var, fi.i6 i6Var) {
        String a02;
        long j3 = jt0Var.f36647m1;
        if (hashSet.contains(Integer.valueOf(i6Var.f12144a))) {
            jt0Var.getStoriesController().c(i6Var.f12144a, j3, storyItem);
            a02 = org.telegram.messenger.hd.a0(null, null, 2131744488, i6Var.f12145b);
        } else {
            fi.p6 storiesController = jt0Var.getStoriesController();
            int i7 = i6Var.f12144a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.f0(i7, j3, arrayList);
            a02 = org.telegram.messenger.hd.a0(null, null, 2131744251, i6Var.f12145b);
        }
        lc.b0(jt0Var.f36683y1).Q(2131623990, 36, org.telegram.messenger.g0.W2(a02)).j();
        a70Var.v();
    }

    public static int o(View view) {
        if (view instanceof org.telegram.ui.Cells.p7) {
            return ((org.telegram.ui.Cells.p7) view).getMessageId();
        }
        if (view instanceof org.telegram.ui.Cells.i7) {
            return ((org.telegram.ui.Cells.i7) view).getMessage().e1();
        }
        if (view instanceof org.telegram.ui.Cells.h7) {
            return ((org.telegram.ui.Cells.h7) view).getMessage().e1();
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

    public static void s(ds0 ds0Var, ys0[] ys0VarArr, boolean z10) {
        fm0 fm0Var;
        if (z10) {
            if (org.telegram.messenger.cz.f23449v1 > 0 && ds0Var.G == null && !ds0Var.I && ds0Var.h.getFastScroll() != null && ds0Var.h.getFastScroll().f36525b0 && ds0Var.h.getFastScroll().getVisibility() == 0 && ys0VarArr[0].e() >= 50) {
                int i7 = org.telegram.messenger.cz.f23449v1;
                int i10 = i7 - 1;
                if (i7 != i10) {
                    org.telegram.messenger.cz.f23449v1 = i10;
                    org.telegram.messenger.t0.f26931b.getSharedPreferences("mainconfig", 0).edit().putInt("fastScrollHintCount", org.telegram.messenger.cz.f23449v1).apply();
                }
                ds0Var.I = true;
                Context context = ds0Var.getContext();
                bi.t2 t2Var = new bi.t2(context, 20);
                TextView textView = new TextView(context);
                org.telegram.messenger.o10.l(14.0f, 2131745212, 1, textView, null);
                textView.setMaxLines(3);
                int i11 = org.telegram.ui.ActionBar.m6.f29446gg;
                org.telegram.ui.ActionBar.t6.U(textView, i11, null);
                int L = org.telegram.messenger.g0.L(6.0f);
                int i12 = org.telegram.ui.ActionBar.m6.hg;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.x0(null, i12, false));
                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i12);
                t2Var.setBackground(d02);
                org.telegram.ui.ActionBar.t6.j(t2Var, d02, M, null, null);
                t2Var.addView(textView, c8.ma.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
                ?? view = new View(context);
                view.f35295a = new Random();
                Paint paint = new Paint(1);
                view.f35296b = paint;
                Paint paint2 = new Paint(1);
                view.f35297c = paint2;
                view.f35299f = 1.0f;
                view.h = 0.0f;
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i11, false), 76));
                paint2.setColor(org.telegram.ui.ActionBar.m6.x0(null, i11, false));
                Paint paint3 = new Paint();
                view.d = paint3;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint3.setShader(new LinearGradient(0.0f, org.telegram.messenger.g0.L(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint3.setXfermode(new PorterDuffXfermode(mode));
                Paint paint4 = new Paint();
                view.f35298e = paint4;
                paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
                paint4.setXfermode(new PorterDuffXfermode(mode));
                t2Var.addView((View) view, c8.ma.d(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                ds0Var.G = t2Var;
                ds0Var.addView(t2Var, c8.ma.c(-2.0f, -2));
                ds0Var.G.setAlpha(0.0f);
                ds0Var.G.setScaleX(0.8f);
                ds0Var.G.setScaleY(0.8f);
                ds0Var.G.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                ds0Var.invalidate();
                fm0 fm0Var2 = new fm0(6, ds0Var, t2Var);
                ds0Var.H = fm0Var2;
                org.telegram.messenger.g0.h3(fm0Var2, 4000L);
            }
        } else if (ds0Var.G != null && (fm0Var = ds0Var.H) != null) {
            org.telegram.messenger.g0.r(fm0Var);
            ds0Var.H.run();
            ds0Var.H = null;
            ds0Var.G = null;
        }
    }

    public void setHeaderEnabled(boolean z10) {
        org.telegram.ui.ActionBar.z4 z4Var = this.I;
        if (z4Var != null) {
            z4Var.setEnabled(z10);
        } else {
            this.H.setEnabled(z10);
        }
    }

    private void setPageOverscan(cs0 cs0Var) {
        if (this.f36619c2 && cs0Var != null) {
            cs0Var.j3 = true;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cs0Var.getLayoutParams();
            if (marginLayoutParams != null) {
                int i7 = marginLayoutParams.topMargin;
                int i10 = -this.f36625e2;
                if (i7 != i10 || marginLayoutParams.bottomMargin != (-this.f36629f2)) {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.bottomMargin = -this.f36629f2;
                    cs0Var.setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    public void setSearchItemVisibility(int i7) {
        org.telegram.ui.ActionBar.q0 q0Var = this.f36658q0;
        if (q0Var == null) {
            return;
        }
        if (this.I != null) {
            R(true, true);
        } else {
            q0Var.setVisibility(i7);
        }
    }

    public static void t(jt0 jt0Var, int i7, boolean z10) {
        ds0[] ds0VarArr = jt0Var.f36650n0;
        if (ds0VarArr[0].F == i7) {
            return;
        }
        ds0 ds0Var = ds0VarArr[1];
        ds0Var.F = i7;
        ds0Var.setVisibility(0);
        jt0Var.w0();
        jt0Var.B1(true);
        jt0Var.f36643k1 = z10;
        jt0Var.Y0();
        jt0Var.E(!jt0Var.F0(i7));
        jt0Var.I1(true);
    }

    public static int x(jt0 jt0Var, v4.i0 i0Var) {
        if (i0Var == jt0Var.f36627f0) {
            return 8;
        }
        if (i0Var == jt0Var.f36633h0) {
            return 9;
        }
        for (it0 it0Var : jt0Var.f36648m2.values()) {
            if (it0Var.f36309c == i0Var) {
                return it0Var.f36307a;
            }
        }
        return -1;
    }

    public static int y(jt0 jt0Var, v4.i0 i0Var) {
        if (i0Var == jt0Var.f36630g0) {
            return 8;
        }
        if (i0Var == jt0Var.f36636i0) {
            return 9;
        }
        for (it0 it0Var : jt0Var.f36648m2.values()) {
            if (it0Var.d == i0Var) {
                return it0Var.f36307a;
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
        if (this.f36611a2 == null) {
            this.f36611a2 = new SpannableStringBuilder();
            if (B0()) {
                this.f36611a2.append((CharSequence) org.telegram.messenger.hd.N0(2131746506, null));
            } else {
                this.f36611a2.append((CharSequence) "c");
                this.f36611a2.setSpan(new nq(2131231146, 0), 0, 1, 33);
                this.f36611a2.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.hd.N0(2131744566, null));
            }
        }
        return this.f36611a2;
    }

    public boolean A0() {
        return false;
    }

    public final gt0 A1(int i7) {
        it0 y12;
        if (i7 == 8) {
            return this.f36630g0;
        }
        if (i7 == 9) {
            return this.f36636i0;
        }
        if (!J0(i7) || (y12 = y1(i7)) == null) {
            return null;
        }
        return y12.d;
    }

    public final void B(is0 is0Var, org.telegram.ui.ActionBar.g2 g2Var, long j3, int i7) {
        String K;
        if (j3 > 0) {
            K = org.telegram.messenger.p10.o(org.telegram.messenger.np.u1(g2Var.getCurrentAccount()).c2(Long.valueOf(j3)));
        } else {
            K = org.telegram.messenger.v3.K(org.telegram.messenger.np.u1(g2Var.getCurrentAccount()).O0(Long.valueOf(-j3)), false);
        }
        if (K == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        com.google.android.gms.internal.vision.e2.r(sb2, org.telegram.messenger.np.u1(g2Var.getCurrentAccount()).X2, "/", K, "/a/");
        sb2.append(i7);
        String sb3 = sb2.toString();
        is0Var.i0(2131231758, new g(this, sb3, g2Var, 26), org.telegram.messenger.hd.N0(2131744545, null), false, true);
    }

    public final boolean B0() {
        TLRPC.User c22;
        long j3 = this.f36647m1;
        if (j3 <= 0 || (c22 = org.telegram.messenger.np.u1(this.f36683y1.getCurrentAccount()).c2(Long.valueOf(j3))) == null || !c22.bot) {
            return false;
        }
        return true;
    }

    public final void B1(boolean z10) {
        ds0[] ds0VarArr;
        ds0[] ds0VarArr2;
        org.telegram.ui.ActionBar.q0 q0Var;
        v4.w0 w0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        v4.w0 w0Var2;
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
        v4.w0 w0Var3;
        int i16;
        int i17;
        boolean z17;
        int i18;
        boolean z18;
        int i19;
        boolean z19;
        boolean z20;
        int i20;
        v4.w0 w0Var4;
        gq0 gq0Var = this.f36613b0;
        if (gq0Var != null) {
            gq0Var.i();
        }
        int i21 = 0;
        while (true) {
            ds0VarArr = this.f36650n0;
            if (i21 >= ds0VarArr.length) {
                break;
            }
            ds0VarArr[i21].h.C0();
            i21++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ds0VarArr[z10 ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = org.telegram.messenger.g0.L(O0());
        layoutParams.rightMargin = 0;
        layoutParams.leftMargin = 0;
        v4.i0 adapter = ds0VarArr[z10 ? 1 : 0].h.getAdapter();
        v4.i0 i0Var = this.f36627f0;
        v4.z zVar = this.f36623e0;
        if (adapter == i0Var) {
            zVar.h(null);
        }
        boolean z21 = this.Y0;
        org.telegram.ui.ActionBar.z4 z4Var = this.I;
        xr0 xr0Var = this.G1;
        org.telegram.ui.ActionBar.k kVar = this.H;
        String str = "";
        org.telegram.ui.ActionBar.q0 q0Var2 = this.f36658q0;
        ss0 ss0Var = this.Q;
        int i22 = 100;
        if (z21 && this.X0) {
            ds0 ds0Var = ds0VarArr[z10 ? 1 : 0];
            if (ds0Var.f34560f == null) {
                ds0Var.f34560f = new v4.w0();
            }
            ds0 ds0Var2 = ds0VarArr[z10 ? 1 : 0];
            v4.w0 w0Var5 = ds0Var2.f34560f;
            vs0 vs0Var = this.V;
            bs0 bs0Var = this.m0;
            gs0 gs0Var = this.f36642k0;
            gs0 gs0Var2 = this.f36645l0;
            gs0 gs0Var3 = this.f36639j0;
            if (z10) {
                int i23 = ds0Var2.F;
                if (i23 != 0) {
                    w0Var4 = w0Var5;
                    if (i23 != 2 && i23 != 5 && i23 != 6 && (i23 != 7 || xr0Var.Y())) {
                        if (q0Var2 != null) {
                            str = q0Var2.getSearchField().getText().toString();
                        }
                        String str2 = str;
                        int i24 = ds0VarArr[z10 ? 1 : 0].F;
                        if (i24 == 1) {
                            if (gs0Var3 != null) {
                                gs0Var3.G(str2, false);
                                if (adapter != gs0Var3) {
                                    i1(adapter);
                                    ds0VarArr[z10 ? 1 : 0].h.setAdapter(gs0Var3);
                                }
                            }
                        } else if (i24 == 3) {
                            if (gs0Var2 != null) {
                                gs0Var2.G(str2, false);
                                if (adapter != gs0Var2) {
                                    i1(adapter);
                                    ds0VarArr[z10 ? 1 : 0].h.setAdapter(gs0Var2);
                                }
                            }
                        } else if (i24 == 4) {
                            if (gs0Var != null) {
                                gs0Var.G(str2, false);
                                if (adapter != gs0Var) {
                                    i1(adapter);
                                    ds0VarArr[z10 ? 1 : 0].h.setAdapter(gs0Var);
                                }
                            }
                        } else if (i24 == 7) {
                            if (bs0Var != null) {
                                bs0Var.F(str2, false);
                                if (adapter != bs0Var) {
                                    i1(adapter);
                                    ds0VarArr[z10 ? 1 : 0].h.setAdapter(bs0Var);
                                }
                            }
                        } else if (i24 == 11) {
                            if (vs0Var != null) {
                                vs0Var.E(this.Z0, str2);
                                if (adapter != vs0Var) {
                                    i1(adapter);
                                    ds0VarArr[z10 ? 1 : 0].h.setAdapter(vs0Var);
                                }
                            }
                        } else if (i24 == 15 && ss0Var != null && adapter != ss0Var) {
                            i1(adapter);
                            nq0 nq0Var = ds0VarArr[z10 ? 1 : 0].h;
                            ss0Var.f39684r = nq0Var;
                            nq0Var.setAdapter(ss0Var);
                        }
                    }
                }
                this.Y0 = false;
                cr0 cr0Var = this.M0;
                if (cr0Var != null) {
                    cr0Var.g(false);
                }
                this.X0 = false;
                B1(true);
                return;
            }
            w0Var4 = w0Var5;
            if (ds0Var2.h != null) {
                int i25 = ds0Var2.F;
                if (i25 == 1) {
                    if (adapter != gs0Var3) {
                        i1(adapter);
                        ds0VarArr[z10 ? 1 : 0].h.setAdapter(gs0Var3);
                    }
                    gs0Var3.f();
                } else if (i25 == 3) {
                    if (adapter != gs0Var2) {
                        i1(adapter);
                        ds0VarArr[z10 ? 1 : 0].h.setAdapter(gs0Var2);
                    }
                    gs0Var2.f();
                } else if (i25 == 4) {
                    if (adapter != gs0Var) {
                        i1(adapter);
                        ds0VarArr[z10 ? 1 : 0].h.setAdapter(gs0Var);
                    }
                    gs0Var.f();
                } else if (i25 == 7) {
                    if (adapter != bs0Var) {
                        i1(adapter);
                        ds0VarArr[z10 ? 1 : 0].h.setAdapter(bs0Var);
                    }
                    bs0Var.f();
                } else if (i25 == 11) {
                    if (adapter != vs0Var) {
                        i1(adapter);
                        ds0VarArr[z10 ? 1 : 0].h.setAdapter(vs0Var);
                    }
                    vs0Var.f();
                }
            }
            ds0VarArr2 = ds0VarArr;
            q0Var = q0Var2;
            w0Var3 = w0Var4;
            i11 = 4;
            z13 = false;
            z16 = false;
            i13 = 8;
        } else {
            ds0 ds0Var3 = ds0VarArr[z10 ? 1 : 0];
            if (ds0Var3.f34559e == null) {
                ds0Var3.f34559e = new v4.w0();
            }
            ds0 ds0Var4 = ds0VarArr[z10 ? 1 : 0];
            v4.w0 w0Var6 = ds0Var4.f34559e;
            ds0Var4.h.setPinnedHeaderShadowDrawable(null);
            int i26 = ds0VarArr[z10 ? 1 : 0].F;
            if (i26 == 8 || J0(i26)) {
                layoutParams.topMargin = org.telegram.messenger.g0.L(O0());
            }
            nq0 nq0Var2 = ds0VarArr[z10 ? 1 : 0].h;
            int paddingLeft = nq0Var2.getPaddingLeft();
            ds0 ds0Var5 = ds0VarArr[z10 ? 1 : 0];
            ds0VarArr2 = ds0VarArr;
            nq0 nq0Var3 = ds0Var5.h;
            int j02 = j0(ds0Var5.F);
            nq0Var3.f34295h3 = j02;
            int paddingRight = ds0VarArr2[z10 ? 1 : 0].h.getPaddingRight();
            nq0 nq0Var4 = ds0VarArr2[z10 ? 1 : 0].h;
            q0Var = q0Var2;
            int i02 = i0(I0());
            nq0Var4.f34296i3 = i02;
            nq0Var2.setPadding(paddingLeft, j02, paddingRight, i02);
            int i27 = ds0VarArr2[z10 ? 1 : 0].F;
            int[] iArr = this.f36656p1;
            v4.i0 i0Var2 = this.N;
            View view = this.f36609a0;
            us0 us0Var = this.U;
            wr0 wr0Var = this.S;
            qr0 qr0Var = this.W;
            ys0[] ys0VarArr = this.f36677w1;
            if (i27 == 0) {
                v4.i0 i0Var3 = this.K;
                if (adapter != i0Var3) {
                    i1(adapter);
                    ds0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var3);
                }
                int i28 = -org.telegram.messenger.g0.L(1.0f);
                layoutParams.rightMargin = i28;
                layoutParams.leftMargin = i28;
                ys0 ys0Var = ys0VarArr[0];
                if (ys0Var.h && !ys0Var.f42516e.isEmpty()) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                i22 = iArr[0];
                ds0VarArr2[z10 ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.B0);
                ys0 ys0Var2 = ys0VarArr[0];
                if (ys0Var2.f42533x == null) {
                    ys0Var2.f42533x = new v4.w0();
                }
                w0Var = ys0VarArr[0].f42533x;
                z13 = z19;
                z11 = false;
            } else {
                if (i27 == 1) {
                    ys0 ys0Var3 = ys0VarArr[1];
                    if (ys0Var3.h && !ys0Var3.f42516e.isEmpty()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (adapter != i0Var2) {
                        i1(adapter);
                        ds0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var2);
                    }
                } else if (i27 == 2) {
                    ys0 ys0Var4 = ys0VarArr[2];
                    if (ys0Var4.h && !ys0Var4.f42516e.isEmpty()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    v4.i0 i0Var4 = this.O;
                    if (adapter != i0Var4) {
                        i1(adapter);
                        ds0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var4);
                    }
                } else {
                    if (i27 == 3) {
                        v4.i0 i0Var5 = this.M;
                        if (adapter != i0Var5) {
                            i1(adapter);
                            ds0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var5);
                        }
                    } else if (i27 == 4) {
                        ys0 ys0Var5 = ys0VarArr[4];
                        if (ys0Var5.h && !ys0Var5.f42516e.isEmpty()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        v4.i0 i0Var6 = this.P;
                        if (adapter != i0Var6) {
                            i1(adapter);
                            ds0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var6);
                        }
                    } else {
                        if (i27 == 5) {
                            v4.i0 i0Var7 = this.R;
                            if (adapter != i0Var7) {
                                i1(adapter);
                                ds0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var7);
                            }
                        } else if (i27 == 15) {
                            if (adapter != ss0Var) {
                                i1(adapter);
                                nq0 nq0Var5 = ds0VarArr2[z10 ? 1 : 0].h;
                                ss0Var.f39684r = nq0Var5;
                                nq0Var5.setAdapter(ss0Var);
                            }
                        } else if (i27 == 6) {
                            if (adapter != wr0Var) {
                                i1(adapter);
                                ds0VarArr2[z10 ? 1 : 0].h.setAdapter(wr0Var);
                            }
                        } else if (i27 == 7) {
                            v4.i0 i0Var8 = this.f36620d0;
                            if (adapter != i0Var8) {
                                i1(adapter);
                                ds0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var8);
                            }
                        } else if (z0(i27)) {
                            v4.i0 z110 = z1(ds0VarArr2[z10 ? 1 : 0].F);
                            if (adapter != z110) {
                                i1(adapter);
                                ds0VarArr2[z10 ? 1 : 0].h.setAdapter(z110);
                                ds0VarArr2[z10 ? 1 : 0].h.getClass();
                            }
                            ds0 ds0Var6 = ds0VarArr2[z10 ? 1 : 0];
                            if (ds0Var6.F != 9) {
                                zVar.h(ds0Var6.h);
                            }
                            i22 = iArr[1];
                        } else {
                            int i29 = ds0VarArr2[z10 ? 1 : 0].F;
                            if (i29 == 10) {
                                v4.i0 i0Var9 = this.T;
                                if (adapter != i0Var9) {
                                    i1(adapter);
                                    ds0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var9);
                                }
                            } else if (i29 == 11) {
                                if (adapter != us0Var) {
                                    i1(adapter);
                                    ds0VarArr2[z10 ? 1 : 0].h.setAdapter(us0Var);
                                    v4.z zVar2 = us0Var.f40578w;
                                    nq0 nq0Var6 = ds0VarArr2[z10 ? 1 : 0].h;
                                    us0Var.f40577s = nq0Var6;
                                    zVar2.h(nq0Var6);
                                }
                                w0Var = us0Var.f40576r;
                                z11 = true;
                                z13 = false;
                            } else if (i29 == 12) {
                                if (adapter != null) {
                                    i1(adapter);
                                    ds0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (qr0Var.getParent() != ds0VarArr2[z10 ? 1 : 0]) {
                                    org.telegram.messenger.g0.E2(qr0Var);
                                    ds0VarArr2[z10 ? 1 : 0].addView(qr0Var, c8.ma.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
                                    p1(org.telegram.messenger.g0.L(56.0f) + this.d2, qr0Var);
                                }
                            } else if (i29 == 13) {
                                if (adapter != null) {
                                    i1(adapter);
                                    ds0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != ds0VarArr2[z10 ? 1 : 0]) {
                                    org.telegram.messenger.g0.E2(view);
                                    ds0VarArr2[z10 ? 1 : 0].addView(view);
                                    p1(this.d2, view);
                                }
                            } else if (i29 == 14) {
                                if (adapter != null) {
                                    i1(adapter);
                                    ds0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (gq0Var != null && gq0Var.getParent() != ds0VarArr2[z10 ? 1 : 0]) {
                                    org.telegram.messenger.g0.E2(gq0Var);
                                    ds0VarArr2[z10 ? 1 : 0].addView(gq0Var);
                                    ds0VarArr2[z10 ? 1 : 0].f34564w.setVisibility(4);
                                }
                            }
                        }
                        w0Var = w0Var6;
                        z11 = false;
                        z13 = false;
                    }
                    w0Var = w0Var6;
                    z11 = true;
                    z13 = false;
                }
                z13 = z12;
                w0Var = w0Var6;
                z11 = true;
            }
            K1(ds0VarArr2[z10 ? 1 : 0]);
            if (z11) {
                ds0VarArr2[z10 ? 1 : 0].h.setSections(false);
                w0Var2 = w0Var;
            } else {
                nq0 nq0Var7 = ds0VarArr2[z10 ? 1 : 0].h;
                nq0Var7.getClass();
                w0Var2 = w0Var;
                org.telegram.ui.ActionBar.t6.l(nq0Var7, 20, org.telegram.ui.ActionBar.m6.f29473i6, nq0Var7.f34873o2);
                nq0Var7.U2 = false;
                nq0Var7.I2 = null;
                nq0Var7.J2 = null;
                nq0Var7.M2 = 0.0f;
                nq0Var7.N2 = null;
                nq0Var7.O2 = null;
                nq0Var7.K2 = null;
                oj0 oj0Var = nq0Var7.H2;
                if (oj0Var != null) {
                    nq0Var7.q0(oj0Var);
                    nq0Var7.H2 = null;
                }
                v9 v9Var = nq0Var7.S2;
                if (v9Var != null) {
                    nq0Var7.q0(v9Var);
                    nq0Var7.S2 = null;
                }
            }
            J1(ds0VarArr2[z10 ? 1 : 0]);
            ds0 ds0Var7 = ds0VarArr2[z10 ? 1 : 0];
            if (ds0Var7.F == 11) {
                ds0Var7.h.setItemAnimator(ds0Var7.d);
            } else {
                ds0Var7.h.setItemAnimator(null);
                if (us0Var != null && ds0VarArr2[z10 ? 1 : 0].h == us0Var.f40577s) {
                    v4.z zVar3 = us0Var.f40578w;
                    us0Var.f40577s = null;
                    zVar3.h(null);
                }
            }
            if (qr0Var != null && ds0VarArr2[z10 ? 1 : 0].F != 12 && qr0Var.getParent() == ds0VarArr2[z10 ? 1 : 0]) {
                qr0Var.f47013a.onRemoveFromParent();
                ds0VarArr2[z10 ? 1 : 0].removeView(qr0Var);
            }
            if (view != null && ds0VarArr2[z10 ? 1 : 0].F != 13) {
                ViewParent parent = view.getParent();
                ds0 ds0Var8 = ds0VarArr2[z10 ? 1 : 0];
                if (parent == ds0Var8) {
                    ds0Var8.removeView(view);
                }
            }
            if (gq0Var != null && ds0VarArr2[z10 ? 1 : 0].F != 14) {
                ViewParent parent2 = gq0Var.getParent();
                ds0 ds0Var9 = ds0VarArr2[z10 ? 1 : 0];
                if (parent2 == ds0Var9) {
                    ds0Var9.removeView(gq0Var);
                }
            }
            int i30 = ds0VarArr2[z10 ? 1 : 0].F;
            if (i30 != 0 && i30 != 11 && !z0(i30) && (i16 = ds0VarArr2[z10 ? 1 : 0].F) != 2 && i16 != 5 && i16 != 6 && ((i16 != 7 || xr0Var.Y()) && (i17 = ds0VarArr2[z10 ? 1 : 0].F) != 10 && i17 != 13 && i17 != 14)) {
                if (z10) {
                    if (q0Var != null && q0Var.getVisibility() == 4) {
                        if (z4Var != null) {
                            z18 = z4Var.G;
                        } else {
                            z18 = kVar.f29150o0;
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
                            this.f36662r0 = l0(f10);
                            M1(1.0f - f10);
                            z17 = false;
                        }
                    }
                    z17 = false;
                    this.A0 = 0;
                    this.f36662r0 = 1.0f;
                } else {
                    z17 = false;
                    if (q0Var != null && q0Var.getVisibility() == 4) {
                        if (I()) {
                            this.A0 = 0;
                            this.f36662r0 = 1.0f;
                            setSearchItemVisibility(0);
                        } else {
                            if (I0()) {
                                i18 = 8;
                            } else {
                                i18 = 4;
                            }
                            setSearchItemVisibility(i18);
                            this.f36662r0 = 0.0f;
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
            int i31 = ds0VarArr2[z10 ? 1 : 0].F;
            if (i31 == 6) {
                if (!wr0Var.f41882e && !wr0Var.h && wr0Var.d.isEmpty()) {
                    wr0Var.E(0L);
                }
            } else if (i31 != 7) {
                if (z0(i31)) {
                    gt0 z111 = z1(ds0VarArr2[z10 ? 1 : 0].F);
                    if (z111 != null) {
                        fi.h6 h6Var = z111.f35670s;
                        z111.P();
                        zq0 zq0Var = ds0VarArr2[z10 ? 1 : 0].f34564w;
                        if (h6Var != null && (h6Var.k() || (t0() && h6Var.g() > 0))) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        zq0Var.e(z14, z10);
                        if (h6Var != null && h6Var.g() > 0 && !G0()) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z13 = z15;
                    }
                } else {
                    int i32 = ds0VarArr2[z10 ? 1 : 0].F;
                    if (i32 != 10 && i32 != 11 && i32 != 12 && i32 != 13 && i32 != 14) {
                        if (i32 == 15) {
                            i32 = 8;
                        }
                        ys0 ys0Var6 = ys0VarArr[i32];
                        if (!ys0Var6.f42518g && !ys0Var6.f42519i[0] && ys0Var6.f42513a.isEmpty()) {
                            ys0VarArr[i32].f42518g = true;
                            i0Var2.f();
                            if (i32 == 0) {
                                int i33 = ys0VarArr[0].f42527q;
                                if (i33 == 1) {
                                    i10 = 6;
                                } else if (i33 == 2) {
                                    i10 = 7;
                                }
                                org.telegram.ui.ActionBar.g2 g2Var = this.f36683y1;
                                g2Var.getMediaDataController().Q0(this.f36647m1, 50, 0, 0, i10, this.G, 1, g2Var.getClassGuid(), ys0VarArr[i10].f42526p, null, null);
                            }
                            i10 = i32;
                            org.telegram.ui.ActionBar.g2 g2Var2 = this.f36683y1;
                            g2Var2.getMediaDataController().Q0(this.f36647m1, 50, 0, 0, i10, this.G, 1, g2Var2.getClassGuid(), ys0VarArr[i10].f42526p, null, null);
                        }
                    }
                }
            }
            int i34 = ds0VarArr2[z10 ? 1 : 0].F;
            if (i34 == 8 || J0(i34)) {
                i11 = 4;
                ds0 ds0Var10 = ds0VarArr2[z10 ? 1 : 0];
                zq0 zq0Var2 = ds0Var10.f34564w;
                boolean J0 = J0(ds0Var10.F);
                int w12 = w1(ds0VarArr2[z10 ? 1 : 0].F);
                q9 q9Var = zq0Var2.f37993b;
                hi.e eVar = zq0Var2.f37996f;
                if (!J0 && !H0() && !B0()) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                q9Var.setVisibility(i12);
                if (J0) {
                    eVar.setVisibility(0);
                    eVar.h(org.telegram.messenger.hd.N0(2131744562, null), false);
                    i13 = 8;
                } else if (H0()) {
                    i13 = 8;
                    eVar.setVisibility(8);
                } else {
                    i13 = 8;
                    zq0Var2.setStickerType(11);
                    if (!G0()) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                    eVar.setVisibility(i14);
                    eVar.h(A(), false);
                }
                if (J0) {
                    zq0Var2.d.setText(org.telegram.messenger.hd.N0(2131744540, null));
                    zq0Var2.f37995e.setText(org.telegram.messenger.hd.N0(2131744541, null));
                } else {
                    xh.l lVar = zq0Var2.d;
                    if (!G0()) {
                        if (I0()) {
                            i15 = 2131747983;
                        } else {
                            i15 = 2131747954;
                        }
                    } else {
                        i15 = 2131748011;
                    }
                    lVar.setText(org.telegram.messenger.hd.N0(i15, null));
                    m80 m80Var = zq0Var2.f37995e;
                    if (I0()) {
                        str = org.telegram.messenger.hd.N0(2131747955, null);
                    }
                    m80Var.setText(str);
                }
                eVar.setOnClickListener(new bi.m5(this, J0, w12, 1));
            } else {
                ds0 ds0Var11 = ds0VarArr2[z10 ? 1 : 0];
                if (ds0Var11.F == 9) {
                    if (H0()) {
                        ds0VarArr2[z10 ? 1 : 0].f34564w.f37993b.setVisibility(8);
                        ds0VarArr2[z10 ? 1 : 0].f34564w.f37996f.setVisibility(8);
                    } else {
                        ds0VarArr2[z10 ? 1 : 0].f34564w.f37993b.setVisibility(0);
                        ds0VarArr2[z10 ? 1 : 0].f34564w.setStickerType(11);
                        ds0VarArr2[z10 ? 1 : 0].f34564w.f37996f.setVisibility(0);
                        ds0VarArr2[z10 ? 1 : 0].f34564w.f37996f.h(A(), false);
                    }
                    ds0VarArr2[z10 ? 1 : 0].f34564w.d.setText(org.telegram.messenger.hd.N0(2131748053, null));
                    m80 m80Var2 = ds0VarArr2[z10 ? 1 : 0].f34564w.f37995e;
                    if (I0()) {
                        str = org.telegram.messenger.hd.N0(2131748054, null);
                    }
                    m80Var2.setText(str);
                    i11 = 4;
                    ds0VarArr2[z10 ? 1 : 0].f34564w.f37996f.setOnClickListener(new ip0(this, 4));
                    i13 = 8;
                } else {
                    i11 = 4;
                    ds0Var11.f34564w.f37993b.setVisibility(0);
                    ds0VarArr2[z10 ? 1 : 0].f34564w.setStickerType(1);
                    ds0VarArr2[z10 ? 1 : 0].f34564w.d.setText(org.telegram.messenger.hd.N0(2131747974, null));
                    ds0VarArr2[z10 ? 1 : 0].f34564w.f37995e.setText(org.telegram.messenger.hd.N0(2131745611, null));
                    i13 = 8;
                    ds0VarArr2[z10 ? 1 : 0].f34564w.f37996f.setVisibility(8);
                }
            }
            z16 = false;
            ds0VarArr2[z10 ? 1 : 0].h.setVisibility(0);
            w0Var3 = w0Var2;
        }
        int i35 = i22;
        ds0 ds0Var12 = ds0VarArr2[z10 ? 1 : 0];
        ds0Var12.f34557b = z13;
        F1(ds0Var12, z16);
        ds0VarArr2[z10 ? 1 : 0].f34565x.y1(i35);
        ds0VarArr2[z10 ? 1 : 0].h.a0();
        if (w0Var3 != null) {
            ds0VarArr2[z10 ? 1 : 0].h.setRecycledViewPool(w0Var3);
            ds0VarArr2[z10 ? 1 : 0].f34561n.setRecycledViewPool(w0Var3);
        }
        if (this.A0 == 2) {
            if (z4Var != null) {
                z20 = z4Var.G;
            } else {
                z20 = kVar.f29150o0;
            }
            if (z20) {
                this.C0 = true;
                if (z4Var != null) {
                    z4Var.o(true);
                } else {
                    kVar.n(true);
                }
                this.A0 = 0;
                this.f36662r0 = 0.0f;
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

    public final void C(is0 is0Var) {
        float f10;
        final View[] viewArr = {is0Var.i0(2131232440, new Runnable(this) {
            public final jt0 f42187b;

            {
                this.f42187b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        jt0 jt0Var = this.f42187b;
                        jt0Var.getClass();
                        View[] viewArr2 = viewArr;
                        jt0Var.Q1(viewArr2[0], viewArr2[1]);
                        return;
                    default:
                        jt0 jt0Var2 = this.f42187b;
                        jt0Var2.getClass();
                        View[] viewArr3 = viewArr;
                        jt0Var2.R1(viewArr3[0], viewArr3[1]);
                        return;
                }
            }
        }, org.telegram.messenger.hd.N0(2131748457, null), false, false), is0Var.i0(2131232441, new Runnable(this) {
            public final jt0 f42187b;

            {
                this.f42187b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        jt0 jt0Var = this.f42187b;
                        jt0Var.getClass();
                        View[] viewArr2 = viewArr;
                        jt0Var.Q1(viewArr2[0], viewArr2[1]);
                        return;
                    default:
                        jt0 jt0Var2 = this.f42187b;
                        jt0Var2.getClass();
                        View[] viewArr3 = viewArr;
                        jt0Var2.R1(viewArr3[0], viewArr3[1]);
                        return;
                }
            }
        }, org.telegram.messenger.hd.N0(2131748456, null), false, false)};
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
        org.telegram.ui.ActionBar.g2 g2Var;
        if (this.f36631g1 != null && (g2Var = this.f36683y1) != null) {
            return org.telegram.messenger.v3.V(g2Var.getMessagesController().O0(Long.valueOf(this.f36631g1.f28435id)));
        }
        return false;
    }

    public final void C1(org.telegram.ui.ActionBar.y0 y0Var, org.telegram.ui.ActionBar.y0 y0Var2, Runnable runnable) {
        if (this.L1) {
            return;
        }
        if (!y0Var2.getCheckView().f38320a.f32874q && y0Var.getCheckView().f38320a.f32874q) {
            float f10 = -this.f36674v1;
            this.f36674v1 = f10;
            org.telegram.messenger.g0.E3(f10, y0Var, null);
            return;
        }
        y0Var.setChecked(!y0Var.getCheckView().f38320a.f32874q);
        runnable.run();
    }

    public final void D(cs0 cs0Var, int i7, SparseBooleanArray sparseBooleanArray) {
        int childCount = cs0Var.getChildCount();
        yz yzVar = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = cs0Var.getChildAt(i10);
            if (childAt instanceof yz) {
                yzVar = childAt;
            }
        }
        if (yzVar != null) {
            cs0Var.removeView(yzVar);
        }
        getViewTreeObserver().addOnPreDrawListener(new kr0(this, cs0Var, sparseBooleanArray, yzVar, i7));
    }

    public final boolean D0() {
        int i7 = 0;
        while (true) {
            ds0[] ds0VarArr = this.f36650n0;
            if (i7 >= ds0VarArr.length) {
                return false;
            }
            ds0 ds0Var = ds0VarArr[i7];
            if (ds0Var != null) {
                nq0 nq0Var = ds0Var.h;
                if (nq0Var == null || !nq0Var.c0()) {
                    cs0 cs0Var = ds0VarArr[i7].f34561n;
                    if (cs0Var != null && cs0Var.c0()) {
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
                int s02 = s0(org.telegram.ui.ActionBar.m6.f29775y8);
                int s03 = s0(org.telegram.ui.ActionBar.m6.f29794z8);
                if (s02 != this.f36664r2 || s03 != this.f36668s2) {
                    this.f36664r2 = s02;
                    this.f36668s2 = s03;
                    org.telegram.ui.ActionBar.q0[] q0VarArr = {this.f36679x0, this.f36676w0, this.f36682y0, this.f36684z0, this.f36652o0};
                    for (int i7 = 0; i7 < 5; i7++) {
                        org.telegram.ui.ActionBar.q0 q0Var = q0VarArr[i7];
                        if (q0Var != null) {
                            q0Var.setIconColor(s02);
                            if (q0Var.getBackground() != null) {
                                org.telegram.ui.ActionBar.m6.H1(q0Var.getBackground(), s03, true);
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
        rh0 rh0Var = this.f36673v0;
        if (rh0Var != null && this.Z1 != z10) {
            this.Z1 = z10;
            if (!z10 && rh0Var.getAnimatedDrawable().f38206b0 < 20) {
                rh0Var.getAnimatedDrawable().P(0);
            } else {
                oh0 animatedDrawable = rh0Var.getAnimatedDrawable();
                if (this.Z1) {
                    i7 = 50;
                } else {
                    i7 = 100;
                }
                animatedDrawable.P(i7);
            }
            rh0Var.getAnimatedDrawable().start();
        }
    }

    public final boolean E0() {
        gq0 gq0Var = this.f36613b0;
        if (gq0Var == null || !gq0Var.g()) {
            jq0 jq0Var = this.f36617c0;
            if (jq0Var != null && jq0Var.f50351f) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void E1() {
        if (D0()) {
            post(new hp0(this, 13));
            return;
        }
        pr0 pr0Var = this.K;
        if (pr0Var != null) {
            pr0Var.f();
        }
        ws0 ws0Var = this.N;
        if (ws0Var != null) {
            ws0Var.f();
        }
        ws0 ws0Var2 = this.O;
        if (ws0Var2 != null) {
            ws0Var2.f();
        }
        xs0 xs0Var = this.M;
        if (xs0Var != null) {
            xs0Var.X(false);
        }
        ws0 ws0Var3 = this.P;
        if (ws0Var3 != null) {
            ws0Var3.f();
        }
        ss0 ss0Var = this.Q;
        if (ss0Var != null) {
            ss0Var.f();
        }
        yr0 yr0Var = this.R;
        if (yr0Var != null) {
            yr0Var.f();
        }
        sr0 sr0Var = this.f36627f0;
        if (sr0Var != null) {
            sr0Var.f();
        }
        for (it0 it0Var : this.f36648m2.values()) {
            it0Var.f36309c.f();
        }
    }

    public final void F(int i7) {
        int i10;
        ds0 g02 = g0(this.f36667s1);
        this.f36665s = -1;
        if (g02 != null) {
            g02.h.C0();
            this.f36670t1 = i7;
            g02.f34561n.setVisibility(0);
            if (z0(this.f36667s1)) {
                g02.f34561n.setAdapter(A1(this.f36667s1));
            } else {
                g02.f34561n.setAdapter(this.L);
            }
            cs0 cs0Var = g02.f34561n;
            int paddingLeft = cs0Var.getPaddingLeft();
            cs0 cs0Var2 = g02.f34561n;
            int j02 = j0(g02.F);
            cs0Var2.f34295h3 = j02;
            int paddingRight = g02.f34561n.getPaddingRight();
            cs0 cs0Var3 = g02.f34561n;
            int i02 = i0(I0());
            cs0Var3.f34296i3 = i02;
            cs0Var.setPadding(paddingLeft, j02, paddingRight, i02);
            g02.f34562r.y1(i7);
            g02.f34561n.a0();
            int i11 = 0;
            while (true) {
                ds0[] ds0VarArr = this.f36650n0;
                if (i11 >= ds0VarArr.length) {
                    break;
                }
                ds0 ds0Var = ds0VarArr[i11];
                if (ds0Var != null && ((i10 = ds0Var.F) == 0 || z0(i10))) {
                    org.telegram.messenger.g0.Z3(ds0VarArr[i11].h);
                }
                i11++;
            }
            this.f36663r1 = true;
            if (this.f36667s1 == 0) {
                this.f36677w1[0].g(true);
            }
            this.f36659q1 = 0.0f;
            j1();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.M1.d();
            ofFloat.addUpdateListener(new er0(this, g02, 1));
            ofFloat.addListener(new ki.h2(this, z0(g02.F) ? 1 : 0, i7, 2));
            ofFloat.setInterpolator(nr.f37960f);
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

    public final void F1(ds0 ds0Var, boolean z10) {
        boolean z11;
        Integer num = 1;
        int i7 = 0;
        if (ds0Var.f34557b && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        jj0 fastScroll = ds0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = ds0Var.f34558c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            ds0Var.f34558c.cancel();
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
            ds0Var.f34558c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(num);
        } else if (!z11 && fastScroll.getTag() != null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, property, fastScroll.getAlpha(), 0.0f);
            ofFloat2.addListener(new org.telegram.ui.on(fastScroll));
            ds0Var.f34558c = ofFloat2;
            ofFloat2.setDuration(150L).start();
            fastScroll.animate().setListener(null).cancel();
            fastScroll.setTag(null);
        }
    }

    public final void G() {
        int i7 = this.d2;
        int i10 = this.f36657p2;
        p1((org.telegram.messenger.g0.L(6.666f) + i7) - f36607w2, this.S0);
        int i11 = i7 + i10;
        p1(i11, this.L0);
        p1(i11, this.E0);
        p1(org.telegram.messenger.g0.L(52.0f) + i7 + i10, this.N0);
        p1(org.telegram.messenger.g0.L(4.0f) + i7 + i10, this.M0);
        p1(org.telegram.messenger.g0.L(48.0f) + i7 + i10, this.f36617c0);
        if (this.f36646l2 != i10) {
            this.f36646l2 = i10;
            Runnable runnable = this.f36644k2;
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
        org.telegram.ui.ActionBar.q0 q0Var = this.f36676w0;
        if (q0Var != null) {
            if (!this.f36683y1.getMessagesController().G2(this.f36647m1) && !u0()) {
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
                int i7 = org.telegram.ui.ActionBar.m6.f29794z8;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(s0(i7), 5, -1);
                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
                q0Var.setBackground(h02);
                org.telegram.ui.ActionBar.t6.j(q0Var, h02, null, M, this.I1);
            }
        }
    }

    public final boolean H() {
        boolean B0 = B0();
        long j3 = this.f36647m1;
        org.telegram.ui.ActionBar.g2 g2Var = this.f36683y1;
        if (B0) {
            TLRPC.User c22 = org.telegram.messenger.np.u1(g2Var.getCurrentAccount()).c2(Long.valueOf(j3));
            if (c22 == null || !c22.bot || !c22.bot_can_edit) {
                return false;
            }
            return true;
        } else if (!I0()) {
            if (g2Var == null || !g2Var.getMessagesController().R1().h(j3)) {
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
        gq0 gq0Var = this.f36613b0;
        if (gq0Var != null) {
            int L = org.telegram.messenger.g0.L(48.0f) + this.d2;
            es esVar = this.S0;
            if (esVar != null) {
                i7 = (int) esVar.d(org.telegram.messenger.g0.L(7.0f));
            } else {
                i7 = 0;
            }
            gq0Var.setPaddingTop(L + i7);
        }
    }

    public boolean I() {
        return !(this instanceof c30);
    }

    public boolean I0() {
        return false;
    }

    public final void I1(boolean z10) {
        gq0 gq0Var;
        jq0 jq0Var;
        boolean z11 = true;
        R(true, true);
        rh0 rh0Var = this.f36673v0;
        if (rh0Var == null) {
            return;
        }
        float f10 = 0.0f;
        if (!this.Y0 && (((gq0Var = this.f36613b0) == null || !gq0Var.g()) && ((jq0Var = this.f36617c0) == null || !jq0Var.f50351f))) {
            f10 = Utilities.i(this.f36662r0 + this.f36666s0, 1.0f, 0.0f);
        }
        rh0Var.setAlpha(f10);
        if (z10) {
            if (k0(1.0f) <= 0.5f) {
                z11 = false;
            }
            E(z11);
        } else if (this.A0 == 2) {
            if (this.f36666s0 <= 0.1f) {
                z11 = false;
            }
            E(z11);
        } else {
            if (this.f36662r0 >= 0.1f) {
                z11 = false;
            }
            E(z11);
        }
    }

    public final boolean J() {
        ds0 ds0Var;
        ds0[] ds0VarArr = this.f36650n0;
        if (ds0VarArr != null && (ds0Var = ds0VarArr[0]) != null) {
            boolean z02 = z0(ds0Var.F);
            int i7 = this.f36656p1[z02 ? 1 : 0];
            if (i7 != h0(z02 ? 1 : 0, i7, true)) {
                return true;
            }
        }
        return false;
    }

    public final void J1(ds0 ds0Var) {
        boolean z10;
        boolean b12 = ds0Var.h.b1();
        if (b12) {
            ds0Var.h.setSectionsDrawBackground(this.f36619c2);
        }
        if (this.f36619c2 && !b12 && ds0Var.F != 15) {
            z10 = true;
        } else {
            z10 = false;
        }
        ds0Var.setDrawPageBackground(z10);
        if (ds0Var.F == 15) {
            Drawable drawable = ds0Var.P;
            if (drawable == null) {
                drawable = ds0Var.getBackground();
            }
            Drawable e10 = hi.v5.e(drawable, this.f36683y1.getCurrentAccount(), this.f36647m1, org.telegram.ui.ActionBar.m6.I.q());
            if (!this.f36619c2) {
                ds0Var.setWallpaper(null);
                ds0Var.setBackground(e10);
                ds0Var.setOutlineProvider(new bg.q0(15));
                ds0Var.setClipToOutline(true);
                return;
            }
            ds0Var.setBackground(null);
            ds0Var.setClipToOutline(false);
            ds0Var.setWallpaper(e10);
            return;
        }
        ds0Var.setClipToOutline(false);
        ds0Var.setBackground(null);
        ds0Var.setWallpaper(null);
    }

    public final boolean K() {
        ds0 ds0Var;
        ds0[] ds0VarArr = this.f36650n0;
        if (ds0VarArr == null || (ds0Var = ds0VarArr[0]) == null) {
            return false;
        }
        if (this.n1 && z0(ds0Var.F)) {
            return false;
        }
        boolean z02 = z0(ds0VarArr[0].F);
        int i7 = this.f36656p1[z02 ? 1 : 0];
        if (i7 == h0(z02 ? 1 : 0, i7, false)) {
            return false;
        }
        return true;
    }

    public final boolean K0() {
        if (!H() || ((getClosestTab() != 8 && getClosestTab() != 13 && !J0(getClosestTab())) || !this.F1)) {
            gq0 gq0Var = this.f36613b0;
            if (gq0Var == null || !gq0Var.g()) {
                jq0 jq0Var = this.f36617c0;
                if ((jq0Var == null || !jq0Var.f50351f) && !this.f36663r1 && !this.f36640j1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void K1(ds0 ds0Var) {
        boolean z10;
        float f10;
        int i7;
        float f11;
        float f12;
        int i10 = ds0Var.F;
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
        FrameLayout.LayoutParams d = c8.ma.d(-1, -1.0f, 119, f10, f13, f11, f12);
        d.topMargin = n0(ds0Var.F) + d.topMargin;
        ViewGroup.LayoutParams layoutParams = ds0Var.f34563s.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2.leftMargin == d.leftMargin && layoutParams2.topMargin == d.topMargin && layoutParams2.rightMargin == d.rightMargin && layoutParams2.bottomMargin == d.bottomMargin && layoutParams2.gravity == d.gravity) {
                return;
            }
        }
        ds0Var.f34563s.setLayoutParams(d);
    }

    public final void L(Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        ds0[] ds0VarArr;
        ek0 ek0Var;
        fq0 fq0Var;
        qr0 qr0Var;
        gq0 gq0Var;
        View[] viewPages;
        for (ds0 ds0Var : this.f36650n0) {
            if (ds0Var != null && ds0Var.getVisibility() == 0) {
                if (ds0Var.P != null) {
                    RectF rectF2 = this.f36641j2;
                    if (jh.k.c(ds0Var, viewGroup, rectF2)) {
                        canvas.save();
                        canvas.translate(rectF2.left, rectF2.top);
                        ds0Var.h(canvas);
                        canvas.restore();
                    }
                }
                if (ds0Var.F == 14 && (gq0Var = this.f36613b0) != null && gq0Var.getParent() == ds0Var) {
                    for (View view : gq0Var.h.getViewPages()) {
                        if ((view instanceof bi.m6) && view.getVisibility() == 0) {
                            bi.f6 f6Var = ((bi.m6) view).f3901f;
                            ih.d.a(f6Var, canvas, rectF, f6Var, viewGroup);
                        }
                    }
                } else {
                    if (ds0Var.F == 12 && (qr0Var = this.W) != null && qr0Var.getParent() == ds0Var) {
                        ek0Var = qr0Var.f47013a.A0;
                    } else if (ds0Var.F == 13 && (fq0Var = this.f36609a0) != null && fq0Var.getParent() == ds0Var) {
                        ek0Var = fq0Var.getCurrentListView();
                    } else {
                        ek0Var = ds0Var.h;
                    }
                    if (ek0Var != null && ek0Var.getVisibility() == 0) {
                        ih.d.a(ek0Var, canvas, rectF, ek0Var, viewGroup);
                    }
                }
            }
        }
    }

    public final void L0(int i7, int i10, int i11, boolean z10) {
        ys0[] ys0VarArr = this.f36677w1;
        ys0VarArr[i7].f42513a.clear();
        ys0VarArr[i7].f42514b[0].clear();
        ys0VarArr[i7].f42514b[1].clear();
        ys0 ys0Var = ys0VarArr[i7];
        ys0Var.f42520j[0] = i10;
        ys0Var.f42519i[0] = false;
        ys0Var.f42522l = false;
        ys0Var.f42523m = i11;
        ys0Var.f42524n = (ys0Var.e() - i11) - 1;
        ys0 ys0Var2 = ys0VarArr[i7];
        if (ys0Var2.f42524n < 0) {
            ys0Var2.f42524n = 0;
        }
        ys0Var2.f42521k = i10;
        ys0Var2.f42525o = true;
        ys0Var2.f42518g = false;
        ys0Var2.f42526p++;
        ds0 g02 = g0(i7);
        if (g02 != null && g02.h.getAdapter() != null) {
            g02.h.getAdapter().f();
        }
        if (z10) {
            int i12 = 0;
            while (true) {
                ds0[] ds0VarArr = this.f36650n0;
                if (i12 < ds0VarArr.length) {
                    ds0 ds0Var = ds0VarArr[i12];
                    if (ds0Var.F == i7) {
                        ds0Var.f34565x.h1(Math.min(ys0VarArr[i7].e() - 1, ys0VarArr[i7].f42523m), 0);
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
            ds0[] ds0VarArr = this.f36650n0;
            if (i7 < ds0VarArr.length) {
                int childCount = ds0VarArr[i7].h.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = ds0VarArr[i7].h.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.i7) {
                        ((org.telegram.ui.Cells.i7) childAt).b(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.p7) {
                        ((org.telegram.ui.Cells.p7) childAt).i(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.l7) {
                        ((org.telegram.ui.Cells.l7) childAt).f(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.h7) {
                        ((org.telegram.ui.Cells.h7) childAt).e(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.i2) {
                        ((org.telegram.ui.Cells.i2) childAt).c(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.u2) {
                        ((org.telegram.ui.Cells.u2) childAt).c0(false, z10);
                    }
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public final void M() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jt0.M():void");
    }

    public final void M0(boolean z10) {
        long j3 = this.G;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i7 == 0 && !G0()) {
            for (int i10 = 0; i10 < 4; i10++) {
                int i11 = f36604t2[i10];
                ys0[] ys0VarArr = this.f36677w1;
                if (!ys0VarArr[i11].h || z10) {
                    long j10 = this.f36647m1;
                    if (!org.telegram.messenger.n5.C(j10)) {
                        ys0VarArr[i11].h = false;
                        TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
                        if (i11 == 0) {
                            int i12 = ys0VarArr[i11].f42527q;
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
                        org.telegram.ui.ActionBar.g2 g2Var = this.f36683y1;
                        tL_messages_getSearchResultsPositions.peer = g2Var.getMessagesController().l1(j10);
                        if (i7 != 0 && g2Var.getUserConfig().e() == j10) {
                            tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                            tL_messages_getSearchResultsPositions.saved_peer_id = g2Var.getMessagesController().l1(j3);
                        }
                        ConnectionsManager.getInstance(g2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(g2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new org.telegram.messenger.ee(this, ys0VarArr[i11].f42526p, i11, 2)), g2Var.getClassGuid());
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
        org.telegram.ui.ActionBar.q0 q0Var = this.f36655p0;
        if (q0Var == null) {
            return;
        }
        ds0[] ds0VarArr = this.f36650n0;
        ds0 ds0Var = ds0VarArr[1];
        float f11 = 0.0f;
        if (ds0Var != null && ds0Var.F == 11) {
            f11 = 0.0f + f10;
        }
        int i7 = 0;
        ds0 ds0Var2 = ds0VarArr[0];
        if (ds0Var2 != null && ds0Var2.F == 11) {
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
        fr0 fr0Var = this.L0;
        if (!fr0Var.d(fr0Var.getCurrentTabId())) {
            int firstTabId = fr0Var.getFirstTabId();
            fr0Var.setInitialTabId(firstTabId);
            this.f36650n0[0].F = firstTabId;
            B1(false);
        }
    }

    public final void N0(int i7) {
        int i10;
        int i11 = 2;
        ys0[] ys0VarArr = this.f36677w1;
        if (i7 == 0) {
            int i12 = ys0VarArr[0].f42527q;
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
        ys0VarArr[i7].f42518g = true;
        org.telegram.ui.ActionBar.g2 g2Var = this.f36683y1;
        g2Var.getMediaDataController().Q0(this.f36647m1, 50, 0, ys0VarArr[i7].f42521k, i10, this.G, 1, g2Var.getClassGuid(), ys0VarArr[i7].f42526p, null, null);
    }

    public final void N1() {
        float f10;
        float f11;
        org.telegram.ui.ActionBar.q0 q0Var = this.f36655p0;
        if (q0Var == null) {
            return;
        }
        boolean z10 = true;
        ds0 ds0Var = this.f36650n0[1];
        if (ds0Var == null || ds0Var.F != 11) {
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
        scaleX.scaleY(f12).withEndAction(new rp0(0, this, z10)).setDuration(420L).setInterpolator(nr.h).start();
    }

    public final void O(org.telegram.ui.Components.ds0 r34, org.telegram.ui.Components.ek0 r35, v4.c0 r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jt0.O(org.telegram.ui.Components.ds0, org.telegram.ui.Components.ek0, v4.c0):void");
    }

    public int O0() {
        return 0;
    }

    public final void O1() {
        boolean z10;
        int i7;
        fi.h6 h6Var;
        boolean B0 = B0();
        org.telegram.ui.ActionBar.q0 q0Var = this.f36684z0;
        org.telegram.ui.ActionBar.q0 q0Var2 = this.f36682y0;
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
                SparseArray[] sparseArrayArr = this.f36618c1;
                if (i11 < sparseArrayArr[0].size()) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) sparseArrayArr[0].valueAt(i11);
                    sr0 sr0Var = this.f36627f0;
                    if (sr0Var != null && (h6Var = sr0Var.f35670s) != null && !h6Var.m(gjVar.e1())) {
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
        v4.i0 i0Var;
        boolean z10;
        fq0 fq0Var;
        float f11;
        boolean z11;
        ds0[] ds0VarArr = this.f36650n0;
        int i7 = ds0VarArr[0].F;
        if (i7 == 13 && (fq0Var = this.f36609a0) != null) {
            View currentView = fq0Var.f13701n.getCurrentView();
            if (currentView instanceof gi.m) {
                gi.m mVar = (gi.m) currentView;
                gi.h hVar = mVar.f13689w;
                gi.e eVar = mVar.f13685f;
                if (mVar.f13680a != null && mVar.getParent() != null) {
                    if (!mVar.f13682b || mVar.L) {
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
                                            mVar.f13683c = 0.0f;
                                        } else {
                                            if (z12) {
                                                f11 = org.telegram.messenger.f3.y(2.0f, mVar.R, 1.0f, 1.0f);
                                            } else {
                                                f11 = (1.0f - mVar.R) / 0.5f;
                                            }
                                            mVar.f13683c = Math.max(0.0f, Math.min(1.0f, f11));
                                        }
                                        float f12 = mVar.f13683c;
                                        int i13 = (f12 > 1.0f ? 1 : (f12 == 1.0f ? 0 : -1));
                                        if (i13 == 0 || f12 == 0.0f) {
                                            if (i13 == 0) {
                                                int i14 = mVar.f13684e;
                                                int ceil = (((int) Math.ceil(mVar.T / mVar.f13684e)) * i14) + ((int) ((mVar.f13681a0.H.C1 / (eVar.getMeasuredWidth() - ((int) (eVar.getMeasuredWidth() / mVar.f13684e)))) * (i14 - 1)));
                                                if (ceil >= hVar.b()) {
                                                    ceil = hVar.b() - 1;
                                                }
                                                mVar.T = ceil;
                                            }
                                            mVar.a();
                                            if (mVar.f13683c == 0.0f) {
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
            if (!this.f36663r1 || this.f36608a) {
                if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
                    if (motionEvent.getActionMasked() == 2 && (this.f36608a || this.f36616c)) {
                        int i17 = -1;
                        int i18 = -1;
                        for (int i19 = 0; i19 < motionEvent.getPointerCount(); i19++) {
                            if (this.f36622e == motionEvent.getPointerId(i19)) {
                                i17 = i19;
                            }
                            if (this.f36626f == motionEvent.getPointerId(i19)) {
                                i18 = i19;
                            }
                        }
                        if (i17 != -1 && i18 != -1) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(i18) - motionEvent.getX(i17), motionEvent.getY(i18) - motionEvent.getY(i17))) / this.h;
                            this.f36649n = hypot2;
                            if (!this.f36608a && (hypot2 > 1.01f || hypot2 < 0.99f)) {
                                this.f36608a = true;
                                if (hypot2 > 1.0f) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                this.f36661r = z10;
                                t1(z10);
                            }
                            if (this.f36608a) {
                                boolean z13 = this.f36661r;
                                if ((z13 && this.f36649n < 1.0f) || (!z13 && this.f36649n > 1.0f)) {
                                    this.f36659q1 = 0.0f;
                                } else {
                                    if (z13) {
                                        f10 = org.telegram.messenger.f3.y(2.0f, this.f36649n, 1.0f, 1.0f);
                                    } else {
                                        f10 = (1.0f - this.f36649n) / 0.5f;
                                    }
                                    this.f36659q1 = Math.max(0.0f, Math.min(1.0f, f10));
                                }
                                float f13 = this.f36659q1;
                                if (f13 == 1.0f || f13 == 0.0f) {
                                    if (z0(this.f36667s1)) {
                                        i0Var = z1(this.f36667s1);
                                    } else {
                                        i0Var = this.K;
                                    }
                                    if (this.f36659q1 == 1.0f) {
                                        int i20 = this.f36670t1;
                                        int ceil2 = (((int) Math.ceil(this.f36665s / this.f36670t1)) * i20) + ((int) ((this.C1 / (ds0VarArr[0].h.getMeasuredWidth() - ((int) (ds0VarArr[0].h.getMeasuredWidth() / this.f36670t1)))) * (i20 - 1)));
                                        if (ceil2 >= i0Var.b()) {
                                            ceil2 = i0Var.b() - 1;
                                        }
                                        this.f36665s = ceil2;
                                    }
                                    d0();
                                    if (this.f36659q1 == 0.0f) {
                                        this.f36661r = !this.f36661r;
                                    }
                                    t1(this.f36661r);
                                    this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                }
                                ds0VarArr[0].h.invalidate();
                                ds0 ds0Var = ds0VarArr[0];
                                if (ds0Var.G != null) {
                                    ds0Var.invalidate();
                                }
                            }
                        } else {
                            this.f36612b = false;
                            this.f36616c = false;
                            this.f36608a = false;
                            d0();
                            return false;
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.f36622e == motionEvent.getPointerId(0) && this.f36626f == motionEvent.getPointerId(1)) || (this.f36622e == motionEvent.getPointerId(1) && this.f36626f == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.f36608a) {
                        this.f36616c = false;
                        this.f36612b = false;
                        this.f36608a = false;
                        d0();
                    }
                } else {
                    if (this.f36612b && !this.f36608a && motionEvent.getPointerCount() == 2) {
                        this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.f36649n = 1.0f;
                        this.f36622e = motionEvent.getPointerId(0);
                        this.f36626f = motionEvent.getPointerId(1);
                        ds0VarArr[0].h.I0(false);
                        ds0VarArr[0].h.cancelLongPress();
                        ds0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.f36678x = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - ds0VarArr[0].getX());
                        int y11 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - ds0VarArr[0].getY());
                        int i21 = this.f36678x;
                        this.f36665s = -1;
                        int top2 = y11 - ds0VarArr[0].h.getTop();
                        if (getY() != 0.0f && this.F == 1) {
                            top2 = 0;
                        }
                        for (int i22 = 0; i22 < ds0VarArr[0].h.getChildCount(); i22++) {
                            View childAt2 = ds0VarArr[0].h.getChildAt(i22);
                            Rect rect2 = this.f36681y;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i21, top2)) {
                                ds0VarArr[0].h.getClass();
                                this.f36665s = RecyclerView.S(childAt2);
                                this.f36675w = childAt2.getTop();
                            }
                        }
                        if (this.G1.Y() && this.f36665s == -1) {
                            this.f36665s = (int) (((this.f36656p1[z0(ds0VarArr[0].F) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i21 / ds0VarArr[0].h.getMeasuredWidth(), 0.0f))) + ds0VarArr[0].f34565x.L0());
                            this.f36675w = 0;
                        }
                        this.f36616c = true;
                    }
                    if (motionEvent.getActionMasked() == 0 && ((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - ds0VarArr[0].getY() > this.d2) {
                        this.f36612b = true;
                    }
                }
                return this.f36608a;
            }
            return true;
        }
        return false;
    }

    public void P1(boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jt0.P1(boolean):void");
    }

    public final void Q() {
        R(false, false);
    }

    public final Boolean Q1(View view, View view2) {
        if (!this.f36663r1) {
            ds0[] ds0VarArr = this.f36650n0;
            boolean z10 = false;
            ds0 ds0Var = ds0VarArr[0];
            if (ds0Var != null) {
                int i7 = ds0Var.F;
                this.f36667s1 = i7;
                boolean z02 = z0(i7);
                int[] iArr = this.f36656p1;
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
                        org.telegram.messenger.cz.B(h02);
                    } else if (m0(ds0VarArr[0].F) >= 5 || J0(ds0VarArr[0].F)) {
                        org.telegram.messenger.cz.F(h02);
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
            if (this.f36660q2 && !E0()) {
                z12 = true;
            } else {
                z12 = false;
            }
            org.telegram.ui.ActionBar.q0 q0Var = this.f36658q0;
            if (q0Var != null) {
                if (z12 && I() && (F0(closestTab) || (closestTab == 11 && x0()))) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                ((org.telegram.ui.ActionBar.g5) q0Var).Z(z13, z10);
            }
            org.telegram.ui.ActionBar.g5 g5Var = this.J;
            if (g5Var != null) {
                if (z12 && I() && !A0() && v0(closestTab)) {
                    z14 = true;
                }
                g5Var.Z(z14, z11);
            }
        }
    }

    public final void R0() {
        fi.h6 h6Var;
        fi.h6 h6Var2;
        this.K1.b();
        sr0 sr0Var = this.f36627f0;
        if (sr0Var != null && (h6Var2 = sr0Var.f35670s) != null && h6Var2 != null) {
            h6Var2.z(sr0Var.f35671w);
        }
        eq0 eq0Var = this.f36633h0;
        if (eq0Var != null && (h6Var = eq0Var.f35670s) != null && h6Var != null) {
            h6Var.z(eq0Var.f35671w);
        }
        for (it0 it0Var : this.f36648m2.values()) {
            ht0 ht0Var = it0Var.f36309c;
            fi.h6 h6Var3 = ht0Var.f35670s;
            if (h6Var3 != null && h6Var3 != null) {
                h6Var3.z(ht0Var.f35671w);
            }
        }
    }

    public final Boolean R1(View view, View view2) {
        if (!this.f36663r1) {
            ds0[] ds0VarArr = this.f36650n0;
            boolean z10 = false;
            ds0 ds0Var = ds0VarArr[0];
            if (ds0Var != null) {
                if (!this.n1 || !z0(ds0Var.F)) {
                    int i7 = ds0VarArr[0].F;
                    this.f36667s1 = i7;
                    boolean z02 = z0(i7);
                    int[] iArr = this.f36656p1;
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
                            org.telegram.messenger.cz.B(h02);
                        } else if (m0(ds0VarArr[0].F) >= 5 || J0(ds0VarArr[0].F)) {
                            org.telegram.messenger.cz.F(h02);
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
        ds0[] ds0VarArr = this.f36650n0;
        ds0 ds0Var = ds0VarArr[0];
        if (ds0Var != null && ds0VarArr[1] != null) {
            float f11 = 0.0f;
            jq0 jq0Var = this.f36617c0;
            if (jq0Var != null) {
                if (z0(ds0Var.F) && ds0VarArr[0].F != 9) {
                    c10 = 1;
                } else {
                    c10 = 0;
                }
                if (ds0VarArr[1].getVisibility() == 0) {
                    if (z0(ds0VarArr[1].F) && ds0VarArr[1].F != 9) {
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
                        measuredWidth = ds0VarArr[0].getMeasuredWidth();
                    }
                    jq0Var.setTranslationX(measuredWidth);
                } else {
                    jq0Var.setTranslationX(ds0VarArr[c10 ^ 1].getTranslationX());
                    abs = 1.0f - (Math.abs(jq0Var.getTranslationX()) / jq0Var.getMeasuredWidth());
                }
                float f12 = 0.0f;
                for (int i7 = 0; i7 < ds0VarArr.length; i7++) {
                    if (ds0VarArr[i7].getVisibility() == 0) {
                        nq0 nq0Var = ds0VarArr[i7].h;
                        if (nq0Var.getChildCount() == 0) {
                            childAt = null;
                        } else {
                            childAt = nq0Var.getChildAt(0);
                        }
                        if (childAt == null) {
                            R = -1;
                        } else {
                            R = RecyclerView.R(childAt);
                        }
                        if (R == 0) {
                            f10 = childAt.getY() - nq0Var.getPaddingTop();
                        } else if (nq0Var.getChildCount() == 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = -org.telegram.messenger.g0.L(48.0f);
                        }
                        f12 += Utilities.l(1.0f - (ds0VarArr[i7].getTranslationX() / ds0VarArr[i7].getMeasuredWidth())) * f10;
                    }
                }
                float l10 = Utilities.l(1.0f - ((-f12) / org.telegram.messenger.g0.N(48.0f)));
                float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, l10);
                jq0Var.setAlpha(l10);
                jq0Var.setScaleX(T1);
                jq0Var.setScaleY(T1);
                jq0Var.setTranslationY(this.O1 + f12);
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
        if (gjVar != null && !this.f36663r1) {
            jq0 jq0Var = this.f36617c0;
            if (jq0Var == null || !jq0Var.f50351f) {
                int i13 = 0;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                i13 = 0;
                String str2 = null;
                fi.h6 h6Var = null;
                if (this.F1) {
                    int i14 = 8;
                    if (i10 != 8 || H()) {
                        if (org.telegram.messenger.gj.B0(gjVar.f24213k) == this.f36647m1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        SparseArray[] sparseArrayArr = this.f36618c1;
                        if (sparseArrayArr[c10].indexOfKey(gjVar.e1()) >= 0) {
                            sparseArrayArr[c10].remove(gjVar.e1());
                            if (!gjVar.s(null, false)) {
                                this.f36621d1--;
                            }
                        } else {
                            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                                sparseArrayArr[c10].put(gjVar.e1(), gjVar);
                                if (!gjVar.s(null, false)) {
                                    this.f36621d1++;
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
                            if (this.f36621d1 == 0) {
                                i11 = 0;
                            } else {
                                i11 = 8;
                            }
                            this.f36652o0.setVisibility(i11);
                            org.telegram.ui.ActionBar.q0 q0Var = this.f36679x0;
                            if (q0Var != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14 && sparseArrayArr[0].size() == 1) {
                                    i12 = 0;
                                } else {
                                    i12 = 8;
                                }
                                q0Var.setVisibility(i12);
                            }
                            org.telegram.ui.ActionBar.q0 q0Var2 = this.f36676w0;
                            if (q0Var2 != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                                    i14 = 0;
                                }
                                q0Var2.setVisibility(i14);
                            }
                            O1();
                        }
                        this.f36624e1 = false;
                        if (view instanceof org.telegram.ui.Cells.i7) {
                            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                            if (sparseArrayArr[c10].indexOfKey(gjVar.e1()) >= 0) {
                                z11 = true;
                            }
                            i7Var.b(z11, true);
                        } else if (view instanceof org.telegram.ui.Cells.q7) {
                            org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) view;
                            if (sparseArrayArr[c10].indexOfKey(gjVar.e1()) >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            q7Var.b(0, z10, true);
                        } else if (view instanceof org.telegram.ui.Cells.l7) {
                            org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                            if (sparseArrayArr[c10].indexOfKey(gjVar.e1()) >= 0) {
                                z12 = true;
                            }
                            l7Var.f(z12, true);
                        } else if (view instanceof org.telegram.ui.Cells.h7) {
                            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                            if (sparseArrayArr[c10].indexOfKey(gjVar.e1()) >= 0) {
                                z13 = true;
                            }
                            h7Var.e(z13, true);
                        } else if (view instanceof org.telegram.ui.Cells.i2) {
                            org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) view;
                            if (sparseArrayArr[c10].indexOfKey(gjVar.e1()) >= 0) {
                                z14 = true;
                            }
                            i2Var.c(z14, true);
                        } else if (view instanceof org.telegram.ui.Cells.p7) {
                            org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
                            if (sparseArrayArr[c10].indexOfKey(gjVar.e1()) >= 0) {
                                z15 = true;
                            }
                            p7Var.i(z15, true);
                        }
                    } else {
                        return;
                    }
                } else {
                    pq0 pq0Var = this.f36672u1;
                    ys0[] ys0VarArr = this.f36677w1;
                    org.telegram.ui.ActionBar.g2 g2Var = this.f36683y1;
                    if (i10 == 0) {
                        ys0 ys0Var = ys0VarArr[i10];
                        int i15 = i7 - ys0Var.f42523m;
                        if (i15 >= 0 && i15 < ys0Var.f42513a.size()) {
                            PhotoViewer.p1().I2(null, g2Var, null);
                            PhotoViewer.p1().a2(ys0VarArr[i10].f42513a, i15, this.f36647m1, this.f36628f1, this.G, pq0Var);
                        }
                    } else if (i10 != 2 && i10 != 4) {
                        if (i10 == 5) {
                            PhotoViewer.p1().I2(null, g2Var, null);
                            int indexOf = ys0VarArr[i10].f42513a.indexOf(gjVar);
                            if (indexOf < 0) {
                                PhotoViewer.p1().a2(org.telegram.messenger.f3.i(gjVar), 0, 0L, 0L, 0L, pq0Var);
                            } else {
                                PhotoViewer.p1().a2(ys0VarArr[i10].f42513a, indexOf, this.f36647m1, this.f36628f1, this.G, pq0Var);
                            }
                        } else if (i10 == 1) {
                            if (view instanceof org.telegram.ui.Cells.i7) {
                                org.telegram.ui.Cells.i7 i7Var2 = (org.telegram.ui.Cells.i7) view;
                                TLRPC.Document F0 = gjVar.F0();
                                if (i7Var2.H) {
                                    if (gjVar.x()) {
                                        PhotoViewer.p1().I2(null, g2Var, null);
                                        int indexOf2 = ys0VarArr[i10].f42513a.indexOf(gjVar);
                                        if (indexOf2 < 0) {
                                            PhotoViewer.p1().a2(org.telegram.messenger.f3.i(gjVar), 0, 0L, 0L, 0L, pq0Var);
                                            return;
                                        }
                                        PhotoViewer.p1().a2(ys0VarArr[i10].f42513a, indexOf2, this.f36647m1, this.f36628f1, this.G, pq0Var);
                                        return;
                                    }
                                    org.telegram.messenger.g0.s2(gjVar, g2Var.getParentActivity(), g2Var);
                                } else if (!i7Var2.G) {
                                    org.telegram.messenger.gj message = i7Var2.getMessage();
                                    message.P = true;
                                    g2Var.getFileLoader().W(F0, message, 0, 0);
                                    i7Var2.f(true);
                                } else {
                                    g2Var.getFileLoader().f(F0);
                                    i7Var2.f(true);
                                }
                            }
                        } else if (i10 == 3) {
                            try {
                                if (org.telegram.messenger.gj.n1(gjVar.f24213k) != null) {
                                    webPage = org.telegram.messenger.gj.n1(gjVar.f24213k).webpage;
                                } else {
                                    webPage = null;
                                }
                                if (webPage != null && !(webPage instanceof TLRPC.TL_webPageEmpty)) {
                                    if (webPage.cached_page != null) {
                                        LaunchActivity launchActivity = LaunchActivity.H1;
                                        if (launchActivity == null || launchActivity.N() == null || LaunchActivity.H1.N().l(gjVar) == null) {
                                            g2Var.createArticleViewer(false).L(gjVar, null, null, null);
                                            return;
                                        }
                                        return;
                                    }
                                    String str3 = webPage.embed_url;
                                    if (str3 != null && str3.length() != 0) {
                                        iu.O0(g2Var, gjVar, this.f36672u1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                        return;
                                    }
                                    str = webPage.url;
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    ArrayList arrayList = ((org.telegram.ui.Cells.l7) view).F;
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
                            gt0 z16 = z1(i10);
                            if (z16 != null) {
                                h6Var = z16.f35670s;
                            }
                            if (h6Var != null) {
                                fi.f9 orCreateStoryViewer = g2Var.getOrCreateStoryViewer();
                                Context context = getContext();
                                int e12 = gjVar.e1();
                                fi.y6 a10 = fi.y6.a(this.f36650n0[0].h);
                                a10.f12828e = new ky(h6Var, 18);
                                if ((g2Var instanceof ProfileActivity) && ((ProfileActivity) g2Var).f43682s1) {
                                    i13 = org.telegram.messenger.g0.L(68.0f);
                                }
                                a10.f12832s += i13;
                                orCreateStoryViewer.I(context, e12, h6Var, a10);
                            } else {
                                return;
                            }
                        }
                    } else if (view instanceof org.telegram.ui.Cells.h7) {
                        ((org.telegram.ui.Cells.h7) view).a();
                    }
                }
                G1();
            }
        }
    }

    public final boolean T() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jt0.T():boolean");
    }

    public final boolean T0(org.telegram.messenger.gj gjVar, View view, int i7, boolean z10) {
        jq0 jq0Var;
        char c10;
        int i10;
        int i11;
        final TL_stories.StoryItem storyItem;
        sr0 sr0Var;
        fi.h6 h6Var;
        if (!this.F1) {
            org.telegram.ui.ActionBar.g2 g2Var = this.f36683y1;
            if (g2Var.getParentActivity() != null && gjVar != null && ((jq0Var = this.f36617c0) == null || !jq0Var.f50351f)) {
                org.telegram.messenger.g0.v1(g2Var.getParentActivity().getCurrentFocus());
                long j3 = this.f36647m1;
                int i12 = 8;
                if (z10 && ((J0(getClosestTab()) || getClosestTab() == 8) && !this.F1)) {
                    if (view instanceof org.telegram.ui.Cells.p7) {
                        org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
                        p7Var.k(p7Var.f31270n, p7Var.f31275r, true);
                    }
                    TL_stories.StoryItem storyItem2 = gjVar.f24218l;
                    if (storyItem2 != null) {
                        HashSet hashSet = new HashSet();
                        ArrayList<Integer> arrayList = storyItem2.albums;
                        if (arrayList != null) {
                            hashSet.addAll(arrayList);
                        }
                        boolean J0 = J0(getClosestTab());
                        a70 J = a70.J(g2Var, view);
                        a70 K = J.K();
                        K.c(2131231240, org.telegram.messenger.hd.N0(2131753753, null), new org.telegram.ui.hq0(J, 27), false);
                        K.k();
                        a70.f(K, getStoriesController().B(j3, true), hashSet, true, new g(this, storyItem2, J, 25), new bi.m2(this, hashSet, storyItem2, J, 11));
                        J.c(2131231766, org.telegram.messenger.hd.N0(2131744562, null), new bi.x5(J, K, 10), false);
                        J.k();
                        J.c(2131232359, org.telegram.messenger.hd.N0(2131744546, null), new lp0(this, gjVar, view, i7, 0), false);
                        if (J0) {
                            int w12 = w1(getClosestTab());
                            String w10 = getStoriesController().w(w12, j3);
                            J.c(2131232775, org.telegram.messenger.hd.N0(2131744547, null), new mp0(this, w12, 0), false);
                            storyItem = storyItem2;
                            J.c(2131232331, org.telegram.messenger.hd.N0(2131744548, null), new lp0(this, w12, storyItem, w10, 1), false);
                        } else {
                            storyItem = storyItem2;
                            if (getClosestTab() == 8 && (sr0Var = this.f36627f0) != null && (h6Var = sr0Var.f35670s) != null) {
                                if (h6Var.m(storyItem.f28673id)) {
                                    J.c(2131231002, org.telegram.messenger.hd.N0(2131744544, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            int i13 = r1;
                                            TL_stories.StoryItem storyItem3 = storyItem;
                                            jt0 jt0Var = this;
                                            switch (i13) {
                                                case 0:
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, jt0Var.getContext(), jt0Var.I1);
                                                    String N0 = org.telegram.messenger.hd.N0(2131751475, null);
                                                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                                                    t1Var.S = N0;
                                                    t1Var.U = org.telegram.messenger.hd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new vp0(jt0Var, storyItem3));
                                                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), new xb0(12));
                                                    t1Var.show();
                                                    t1Var.i();
                                                    return;
                                                case 1:
                                                    jt0Var.getClass();
                                                    jt0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f28673id))), false);
                                                    return;
                                                case 2:
                                                    jt0Var.getClass();
                                                    jt0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f28673id))), true);
                                                    return;
                                                default:
                                                    jt0.h(jt0Var, storyItem3);
                                                    return;
                                            }
                                        }
                                    }, false);
                                } else {
                                    J.c(2131230998, org.telegram.messenger.hd.N0(2131744549, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            int i13 = r1;
                                            TL_stories.StoryItem storyItem3 = storyItem;
                                            jt0 jt0Var = this;
                                            switch (i13) {
                                                case 0:
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, jt0Var.getContext(), jt0Var.I1);
                                                    String N0 = org.telegram.messenger.hd.N0(2131751475, null);
                                                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                                                    t1Var.S = N0;
                                                    t1Var.U = org.telegram.messenger.hd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new vp0(jt0Var, storyItem3));
                                                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), new xb0(12));
                                                    t1Var.show();
                                                    t1Var.i();
                                                    return;
                                                case 1:
                                                    jt0Var.getClass();
                                                    jt0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f28673id))), false);
                                                    return;
                                                case 2:
                                                    jt0Var.getClass();
                                                    jt0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f28673id))), true);
                                                    return;
                                                default:
                                                    jt0.h(jt0Var, storyItem3);
                                                    return;
                                            }
                                        }
                                    }, false);
                                }
                            }
                            J.c(2131232053, org.telegram.messenger.hd.N0(2131744554, null), new Runnable() {
                                @Override
                                public final void run() {
                                    int i13 = r1;
                                    TL_stories.StoryItem storyItem3 = storyItem;
                                    jt0 jt0Var = this;
                                    switch (i13) {
                                        case 0:
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, jt0Var.getContext(), jt0Var.I1);
                                            String N0 = org.telegram.messenger.hd.N0(2131751475, null);
                                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                                            t1Var.S = N0;
                                            t1Var.U = org.telegram.messenger.hd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new vp0(jt0Var, storyItem3));
                                            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), new xb0(12));
                                            t1Var.show();
                                            t1Var.i();
                                            return;
                                        case 1:
                                            jt0Var.getClass();
                                            jt0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f28673id))), false);
                                            return;
                                        case 2:
                                            jt0Var.getClass();
                                            jt0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f28673id))), true);
                                            return;
                                        default:
                                            jt0.h(jt0Var, storyItem3);
                                            return;
                                    }
                                }
                            }, false);
                        }
                        J.c(2131232110, org.telegram.messenger.hd.N0(2131751586, null), new Runnable() {
                            @Override
                            public final void run() {
                                int i13 = r1;
                                TL_stories.StoryItem storyItem3 = storyItem;
                                jt0 jt0Var = this;
                                switch (i13) {
                                    case 0:
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, jt0Var.getContext(), jt0Var.I1);
                                        String N0 = org.telegram.messenger.hd.N0(2131751475, null);
                                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                                        t1Var.S = N0;
                                        t1Var.U = org.telegram.messenger.hd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new vp0(jt0Var, storyItem3));
                                        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), new xb0(12));
                                        t1Var.show();
                                        t1Var.i();
                                        return;
                                    case 1:
                                        jt0Var.getClass();
                                        jt0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f28673id))), false);
                                        return;
                                    case 2:
                                        jt0Var.getClass();
                                        jt0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f28673id))), true);
                                        return;
                                    default:
                                        jt0.h(jt0Var, storyItem3);
                                        return;
                                }
                            }
                        }, true);
                        J.f33378i = 3;
                        J.f33401u = true;
                        J.v = true;
                        J.L = true;
                        J.M = 3;
                        Point point = org.telegram.messenger.g0.f24046q;
                        int min = Math.min((int) (Math.min(point.x, point.y) * 0.6777f), (int) (((Math.max(point.x, point.y) * 0.4333f) * 3.0f) / 4.0f));
                        J.N = min;
                        J.O = (min * 4) / 3;
                        J.f33399t = true;
                        J.S = true;
                        J.Z = true;
                        J.a0();
                        return true;
                    }
                } else {
                    if (org.telegram.messenger.gj.B0(gjVar.f24213k) == j3) {
                        c10 = 0;
                    } else {
                        c10 = 1;
                    }
                    SparseArray[] sparseArrayArr = this.f36618c1;
                    sparseArrayArr[c10].put(gjVar.e1(), gjVar);
                    if (!gjVar.s(null, false)) {
                        this.f36621d1++;
                    }
                    if (this.f36621d1 == 0) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    this.f36652o0.setVisibility(i10);
                    org.telegram.ui.ActionBar.q0 q0Var = this.f36679x0;
                    if (q0Var != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i11 = 0;
                        } else {
                            i11 = 8;
                        }
                        q0Var.setVisibility(i11);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var2 = this.f36676w0;
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
                    this.f36624e1 = false;
                    if (view instanceof org.telegram.ui.Cells.i7) {
                        ((org.telegram.ui.Cells.i7) view).b(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.q7) {
                        ((org.telegram.ui.Cells.q7) view).b(i7, true, true);
                    } else if (view instanceof org.telegram.ui.Cells.l7) {
                        ((org.telegram.ui.Cells.l7) view).f(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.h7) {
                        ((org.telegram.ui.Cells.h7) view).e(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.i2) {
                        ((org.telegram.ui.Cells.i2) view).c(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.p7) {
                        ((org.telegram.ui.Cells.p7) view).i(true, true);
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
        es esVar = this.S0;
        if (esVar != null) {
            esVar.setTranslationY(this.O1);
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
            sparseArrayArr = this.f36618c1;
            if (i7 < 0) {
                break;
            }
            sparseArrayArr[i7].clear();
            i7--;
        }
        this.f36621d1 = 0;
        P0(sparseArrayArr[0]);
        fq0 fq0Var = this.f36609a0;
        if (fq0Var != null) {
            fq0Var.h();
            fq0Var.j();
        }
        q1(false);
        L1(z10);
        us0 us0Var = this.U;
        if (us0Var != null) {
            us0Var.f40579x.clear();
        }
        return true;
    }

    public final void V0(float f10) {
        ds0 ds0Var;
        int i7;
        int i10;
        ds0 ds0Var2;
        int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        ds0[] ds0VarArr = this.f36650n0;
        if (i11 != 0 || ds0VarArr[1].getVisibility() == 0) {
            if (this.f36643k1) {
                ds0VarArr[0].setTranslationX((-f10) * ds0Var2.getMeasuredWidth());
                ds0VarArr[1].setTranslationX(ds0VarArr[0].getMeasuredWidth() - (ds0VarArr[0].getMeasuredWidth() * f10));
            } else {
                ds0VarArr[0].setTranslationX(ds0Var.getMeasuredWidth() * f10);
                ds0VarArr[1].setTranslationX((ds0VarArr[0].getMeasuredWidth() * f10) - ds0VarArr[0].getMeasuredWidth());
            }
            Z0(getTabProgress());
            float k02 = k0(f10);
            this.f36666s0 = k02;
            int i12 = 4;
            if (k02 != 0.0f && I() && !A0()) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            this.f36671u0.setVisibility(i7);
            org.telegram.ui.ActionBar.q0 q0Var = this.f36658q0;
            if (q0Var != null && !I()) {
                if (I0()) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                setSearchItemVisibility(i10);
                this.f36662r0 = 0.0f;
            } else {
                this.f36662r0 = l0(f10);
                N1();
            }
            I1(false);
            if (i11 == 0) {
                ds0 ds0Var3 = ds0VarArr[0];
                ds0VarArr[0] = ds0VarArr[1];
                ds0VarArr[1] = ds0Var3;
                ds0Var3.setVisibility(8);
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
        org.telegram.ui.ActionBar.z4 z4Var = this.I;
        if (z4Var != null) {
            q0Var = z4Var.q().b(i7, i10);
        } else {
            int i11 = org.telegram.ui.ActionBar.m6.f29794z8;
            int s02 = s0(i11);
            int i12 = org.telegram.ui.ActionBar.m6.f29775y8;
            org.telegram.ui.ActionBar.q0 q0Var2 = new org.telegram.ui.ActionBar.q0(context, null, s02, s0(i12), false, null);
            q0Var2.setIcon(i10);
            q0Var2.setDuplicateParentStateEnabled(false);
            this.E0.addView(q0Var2, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
            this.Q0.add(q0Var2);
            rh0 iconView = q0Var2.getIconView();
            org.telegram.ui.ActionBar.h6 h6Var = this.I1;
            if (iconView != null) {
                org.telegram.ui.ActionBar.t6.s(q0Var2.getIconView(), i12, h6Var, PorterDuff.Mode.SRC_IN);
            }
            if (q0Var2.getBackground() != null) {
                Drawable background = q0Var2.getBackground();
                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
                q0Var2.setBackground(background);
                org.telegram.ui.ActionBar.t6.j(q0Var2, background, null, M, h6Var);
            }
            q0Var = q0Var2;
        }
        q0Var.setContentDescription(str);
        q0Var.setOnClickListener(new ci.q(this, i7, 20));
        return q0Var;
    }

    public boolean Y() {
        return this instanceof c30;
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
        et0 et0Var = this.f36633h0.f35672x;
        if (et0Var != null) {
            if (z10 && getClosestTab() == 9) {
                z13 = true;
            } else {
                z13 = false;
            }
            et0Var.b(z13);
        }
        et0 et0Var2 = this.f36627f0.f35672x;
        if (et0Var2 != null) {
            if (z10 && getClosestTab() == 8) {
                z12 = true;
            } else {
                z12 = false;
            }
            et0Var2.b(z12);
        }
        for (it0 it0Var : this.f36648m2.values()) {
            ht0 ht0Var = it0Var.f36309c;
            if (ht0Var.f35670s != null) {
                et0 et0Var3 = ht0Var.f35672x;
                if (z10 && getClosestTab() == it0Var.f36307a) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                et0Var3.b(z11);
            }
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.f36658q0;
        if (q0Var != null) {
            cr0 cr0Var = this.M0;
            if (cr0Var != null && cr0Var.a() && getSelectedTab() == 11) {
                i7 = 2131745672;
            } else {
                i7 = 2131745640;
            }
            q0Var.setSearchFieldHint(org.telegram.messenger.hd.N0(i7, null));
        }
        S();
        R(true, true);
    }

    public final boolean Z(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x10 = (-view.getX()) - getX();
        ds0[] ds0VarArr = this.f36650n0;
        motionEvent.offsetLocation(x10 - ds0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - ds0VarArr[0].getY()) - ds0VarArr[0].h.getFastScroll().getY());
        return ds0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public void Z0(float f10) {
        Q0();
    }

    public final boolean a0(int i7) {
        ys0[] ys0VarArr = this.f36680x1.f33921n;
        if (ys0VarArr == null) {
            return false;
        }
        ys0[] ys0VarArr2 = this.f36677w1;
        if (i7 == 0) {
            ys0 ys0Var = ys0VarArr2[i7];
            if (!ys0Var.h) {
                int[] iArr = ys0Var.f42517f;
                int[] iArr2 = ys0VarArr[i7].f42517f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = ys0VarArr2[i7].f42517f;
            int[] iArr4 = ys0VarArr[i7].f42517f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        ys0VarArr2[i7].f42513a.addAll(ys0VarArr[i7].f42513a);
        ys0VarArr2[i7].f42515c.addAll(ys0VarArr[i7].f42515c);
        for (Map.Entry entry : ys0VarArr[i7].d.entrySet()) {
            ys0VarArr2[i7].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i10 = 0; i10 < 2; i10++) {
            ys0VarArr2[i7].f42514b[i10] = ys0VarArr[i7].f42514b[i10].clone();
            ys0 ys0Var2 = ys0VarArr2[i7];
            int[] iArr5 = ys0Var2.f42520j;
            ys0 ys0Var3 = ys0VarArr[i7];
            iArr5[i10] = ys0Var3.f42520j[i10];
            ys0Var2.f42519i[i10] = ys0Var3.f42519i[i10];
        }
        ys0VarArr2[i7].f42516e.addAll(ys0VarArr[i7].f42516e);
        return !ys0VarArr[i7].f42513a.isEmpty();
    }

    public final void a1(int i7, long j3, org.telegram.ui.ActionBar.g2 g2Var) {
        new org.telegram.ui.e21(g2Var, j3, this.f36656p1[1], new bi.a5(this, j3, i7, 2)).show();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29381d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ai));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Bi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29792z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.sj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29804zi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29773y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29546m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29539li));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29401e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29420f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29382d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29755x7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29678t7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29736w7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29351be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29570nd));
    }

    public final boolean b0(int r27, org.telegram.ui.Components.is0 r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jt0.b0(int, org.telegram.ui.Components.is0):boolean");
    }

    public final void b1(int i7, long j3, org.telegram.ui.ActionBar.g2 g2Var) {
        c5.s0(g2Var, org.telegram.messenger.hd.N0(2131751586, null), org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131744552, getStoriesController().w(i7, j3))), org.telegram.messenger.hd.N0(2131751586, null), true, new di.c9(this, j3, i7, 8));
    }

    public final void c0(int i7, ek0 ek0Var, boolean z10) {
        ArrayList arrayList = this.f36677w1[i7].f42516e;
        int L0 = ((v4.c0) ek0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            js0 js0Var = null;
            if (arrayList != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    } else if (L0 <= ((js0) arrayList.get(i10)).f36599b) {
                        js0Var = (js0) arrayList.get(i10);
                        break;
                    } else {
                        i10++;
                    }
                }
                if (js0Var == null) {
                    js0Var = (js0) i5.c.h(1, arrayList);
                }
            }
            if (js0Var != null) {
                L0(i7, js0Var.d, js0Var.f36599b + 1, z10);
            }
        }
    }

    public final void c1(int i7, long j3, org.telegram.ui.ActionBar.g2 g2Var) {
        String w10 = getStoriesController().w(i7, j3);
        Context context = g2Var.getContext();
        org.telegram.ui.ActionBar.h6 resourceProvider = g2Var.getResourceProvider();
        c4.n nVar = new c4.n(this, j3, i7, 5);
        Pattern pattern = c5.f34013a;
        c5.O(context, g2Var, org.telegram.messenger.hd.N0(2131744539, null), org.telegram.messenger.hd.N0(2131744538, null), org.telegram.messenger.hd.N0(2131744537, null), w10, 12, org.telegram.messenger.hd.N0(2131746082, null), resourceProvider, nVar);
    }

    public final void d0() {
        ds0[] ds0VarArr;
        ds0 ds0Var;
        boolean z10;
        int i7;
        v4.i0 adapter;
        if (this.f36663r1) {
            int i10 = 0;
            while (true) {
                ds0VarArr = this.f36650n0;
                if (i10 < ds0VarArr.length) {
                    ds0Var = ds0VarArr[i10];
                    if (ds0Var.F == this.f36667s1) {
                        break;
                    }
                    i10++;
                } else {
                    ds0Var = null;
                    break;
                }
            }
            if (ds0Var != null) {
                boolean z02 = z0(ds0Var.F);
                float f10 = this.f36659q1;
                float f11 = 1.0f;
                int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                ys0[] ys0VarArr = this.f36677w1;
                if (i11 == 0) {
                    this.f36663r1 = false;
                    int i12 = this.f36670t1;
                    int[] iArr = this.f36656p1;
                    iArr[z02 ? 1 : 0] = i12;
                    if (!z02) {
                        org.telegram.messenger.cz.B(i12);
                    } else if (m0(ds0Var.F) >= 5) {
                        org.telegram.messenger.cz.F(this.f36670t1);
                    }
                    for (int i13 = 0; i13 < ds0VarArr.length; i13++) {
                        ds0 ds0Var2 = ds0VarArr[i13];
                        if (ds0Var2 != null && ds0Var2.h != null && (((i7 = ds0Var2.F) == 0 || z0(i7)) && (adapter = ds0VarArr[i13].h.getAdapter()) != null)) {
                            int b10 = adapter.b();
                            if (i13 == 0) {
                                ys0VarArr[0].g(false);
                            }
                            ds0VarArr[i13].f34561n.setVisibility(8);
                            ds0VarArr[i13].f34565x.y1(iArr[z02 ? 1 : 0]);
                            ds0VarArr[i13].h.a0();
                            ds0VarArr[i13].h.invalidate();
                            if (adapter.b() == b10) {
                                org.telegram.messenger.g0.Z3(ds0VarArr[i13].h);
                            } else {
                                adapter.f();
                            }
                        }
                    }
                    if (this.f36665s >= 0) {
                        for (int i14 = 0; i14 < ds0VarArr.length; i14++) {
                            ds0 ds0Var3 = ds0VarArr[i14];
                            if (ds0Var3.F == this.f36667s1) {
                                View m10 = ds0Var3.f34562r.m(this.f36665s);
                                if (m10 != null) {
                                    this.f36675w = m10.getTop();
                                }
                                ds0 ds0Var4 = ds0VarArr[i14];
                                ds0Var4.f34565x.h1(this.f36665s, (-ds0Var4.h.getPaddingTop()) + this.f36675w);
                            }
                        }
                        return;
                    }
                    j1();
                } else if (f10 == 0.0f) {
                    this.f36663r1 = false;
                    if (this.f36667s1 == 0) {
                        ys0VarArr[0].g(false);
                    }
                    ds0Var.f34561n.setVisibility(8);
                    ds0Var.h.invalidate();
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
                    ofFloat.addUpdateListener(new er0(this, ds0Var, 0));
                    ofFloat.addListener(new org.telegram.ui.ki(this, z10, z02 ? 1 : 0, ds0Var));
                    ofFloat.setInterpolator(nr.f37960f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                }
            }
        }
    }

    public final void d1(String str) {
        boolean H3 = org.telegram.messenger.g0.H3(str);
        org.telegram.ui.ActionBar.g2 g2Var = this.f36683y1;
        if (H3) {
            c5.n0(g2Var, str, true, true);
        } else {
            vf.c.t(g2Var.getParentActivity(), str);
        }
    }

    @Override
    public final void didReceivedNotification(int r42, int r43, java.lang.Object... r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jt0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        fr0 fr0Var = this.L0;
        if (fr0Var != null) {
            canvas.save();
            canvas.translate(fr0Var.getX(), fr0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        br0 br0Var = this.U0;
        if (br0Var != null) {
            int i7 = br0Var.V;
            if ((i7 == 3 || i7 == 1) && this.S0 == null) {
                canvas.save();
                canvas.translate(br0Var.getX(), br0Var.getY());
                br0Var.setDrawOverlay(true);
                br0Var.draw(canvas);
                br0Var.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int i7;
        if (this.f36619c2 && (view instanceof ds0) && this.f36632g2 < this.f36625e2) {
            canvas.save();
            canvas.clipRect(0, -this.f36632g2, getWidth(), getHeight() + this.f36629f2);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        } else if (view == this.U0 && this.S0 == null) {
            canvas.save();
            ds0[] ds0VarArr = this.f36650n0;
            float top = ds0VarArr[0].getTop();
            jq0 jq0Var = this.f36617c0;
            if (jq0Var != null && ((i7 = ds0VarArr[0].F) == 8 || J0(i7))) {
                top -= jq0Var.getVisualHeight();
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
        ((WindowManager) org.telegram.messenger.t0.f26931b.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i7 == 0) {
            if (!org.telegram.messenger.g0.Q1() && org.telegram.messenger.t0.f26931b.getResources().getConfiguration().orientation == 2) {
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
        fq0 fq0Var;
        if (!B0()) {
            return org.telegram.messenger.hd.N0(2131753002, null);
        }
        if (z10 && (fq0Var = this.f36609a0) != null) {
            return fq0Var.getBotPreviewsSubtitle();
        }
        sr0 sr0Var = this.f36627f0;
        if (sr0Var != null && sr0Var.f35670s != null) {
            i7 = 0;
            i10 = 0;
            for (int i11 = 0; i11 < sr0Var.f35670s.f12089i.size(); i11++) {
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) sr0Var.f35670s.f12089i.get(i11);
                TL_stories.StoryItem storyItem = gjVar.f24218l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    if (org.telegram.messenger.gj.K4(messageMedia.document)) {
                        i10++;
                    } else if (gjVar.f24218l.media.photo != null) {
                        i7++;
                    }
                }
            }
        } else {
            i7 = 0;
            i10 = 0;
        }
        if (i7 == 0 && i10 == 0) {
            return org.telegram.messenger.hd.N0(2131753002, null);
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
        sr0 sr0Var = this.f36627f0;
        if (sr0Var != null && sr0Var.f35670s != null) {
            org.telegram.ui.ActionBar.g2 g2Var = this.f36683y1;
            if (z10 && arrayList.size() > g2Var.getMessagesController().Q5) {
                org.telegram.messenger.o10.u(org.telegram.messenger.hd.G(g2Var.getMessagesController().Q5, "StoriesPinLimit", new Object[0]), lc.b0(g2Var), 2131623982, 36);
                return;
            }
            fi.h6 h6Var = sr0Var.f35670s;
            int i7 = h6Var.f12085c;
            ArrayList arrayList2 = h6Var.f12088g;
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
            if (arrayList3.size() > org.telegram.messenger.np.u1(i7).Q5) {
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
                    h6Var.d(true);
                    TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                    tL_togglePinnedToTop.f28686id.addAll(arrayList2);
                    tL_togglePinnedToTop.peer = org.telegram.messenger.np.u1(i7).l1(h6Var.d);
                    ConnectionsManager.getInstance(i7).sendRequest(tL_togglePinnedToTop, new fi.l5(2));
                }
                z13 = z11;
            }
            if (z13) {
                org.telegram.messenger.o10.u(org.telegram.messenger.hd.G(g2Var.getMessagesController().Q5, "StoriesPinLimit", new Object[0]), lc.b0(g2Var), 2131623982, 36);
            } else if (z10) {
                lc.b0(g2Var).I(2131624055, org.telegram.messenger.g0.W2(org.telegram.messenger.hd.G(arrayList.size(), "StoriesPinned", new Object[0])), org.telegram.messenger.hd.G(arrayList.size(), "StoriesPinnedText", new Object[0])).j();
            } else {
                org.telegram.messenger.o10.u(org.telegram.messenger.hd.G(arrayList.size(), "StoriesUnpinned", new Object[0]), lc.b0(g2Var), 2131624061, 36);
            }
        }
    }

    public final ds0 g0(int i7) {
        int i10 = 0;
        while (true) {
            ds0[] ds0VarArr = this.f36650n0;
            if (i10 < ds0VarArr.length) {
                ds0 ds0Var = ds0VarArr[i10];
                if (ds0Var != null && ds0Var.F == i7) {
                    return ds0Var;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final boolean g1(MotionEvent motionEvent, boolean z10) {
        int i7;
        ds0 ds0Var;
        fq0 fq0Var;
        int i10;
        int i11;
        int closestTab = getClosestTab();
        fr0 fr0Var = this.L0;
        SparseIntArray sparseIntArray = fr0Var.P;
        int i12 = fr0Var.f33150n;
        int i13 = -1;
        if (z10) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        int i14 = sparseIntArray.get(i12 + i7, -1);
        jq0 jq0Var = this.f36617c0;
        if (jq0Var != null) {
            if (!J0(closestTab) && closestTab != 8) {
                if (J0(i14) || i14 == 8) {
                    i13 = jq0Var.getCurrentAlbumId();
                }
            } else {
                i71 i71Var = jq0Var.f50348b;
                SparseIntArray sparseIntArray2 = i71Var.f36198c0;
                int i15 = i71Var.G;
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
                i14 = x1(i13).f36307a;
            }
        }
        if (i14 >= 0) {
            if (this.f36658q0 != null && !I()) {
                if (I0()) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                setSearchItemVisibility(i10);
                this.f36662r0 = 0.0f;
            } else {
                this.f36662r0 = l0(0.0f);
                M1(0.0f);
            }
            if ((!this.Y0 || getSelectedTab() != 11) && (!H() || !this.F1 || (getClosestTab() != 8 && !J0(getClosestTab())))) {
                ds0[] ds0VarArr = this.f36650n0;
                ds0 ds0Var2 = ds0VarArr[0];
                if (ds0Var2 != null && ds0Var2.F == 13 && (fq0Var = this.f36609a0) != null) {
                    bi.p5 p5Var = fq0Var.f13701n;
                    if (!z10) {
                    }
                }
                ds0 ds0Var3 = ds0VarArr[0];
                gq0 gq0Var = this.f36613b0;
                if (ds0Var3 != null && ds0Var3.F == 14 && gq0Var != null) {
                    bi.p5 p5Var2 = gq0Var.h;
                    if (!z10) {
                    }
                }
                if ((!this.F1 || (ds0Var = ds0VarArr[0]) == null || ds0Var.F != 13) && ((gq0Var == null || !gq0Var.g()) && (jq0Var == null || !jq0Var.f50351f))) {
                    I1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    w0();
                    this.B1 = false;
                    this.A1 = true;
                    this.C1 = (int) motionEvent.getX();
                    setHeaderEnabled(false);
                    fr0Var.setEnabled(false);
                    ds0 ds0Var4 = ds0VarArr[1];
                    ds0Var4.F = i14;
                    ds0Var4.setVisibility(0);
                    this.f36643k1 = z10;
                    B1(true);
                    if (z10) {
                        ds0VarArr[1].setTranslationX(ds0VarArr[0].getMeasuredWidth());
                    } else {
                        ds0VarArr[1].setTranslationX(-ds0VarArr[0].getMeasuredWidth());
                    }
                    Z0(getTabProgress());
                    return true;
                }
            }
        }
        return false;
    }

    public SparseArray<org.telegram.messenger.gj> getActionModeSelected() {
        return this.f36618c1[0];
    }

    public float getBottomButtonStoriesVisibility() {
        ds0 ds0Var;
        ds0 ds0Var2;
        boolean z10;
        boolean z11;
        fi.h6 h6Var;
        fi.h6 h6Var2;
        float f10 = 1.0f;
        ds0[] ds0VarArr = this.f36650n0;
        if (ds0VarArr == null || (ds0Var = ds0VarArr[0]) == null || (ds0Var2 = ds0VarArr[1]) == null || ds0Var.f34564w == null || ds0Var2.f34564w == null) {
            return 1.0f;
        }
        int i7 = ds0Var.F;
        int i10 = ds0Var2.F;
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
        float visibilityFactor = 1.0f - ds0VarArr[0].f34564w.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - ds0VarArr[1].f34564w.getVisibilityFactor();
        gt0 z12 = z1(ds0VarArr[0].F);
        if (i7 == 8 || (z12 != null && (h6Var2 = z12.f35670s) != null && h6Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        gt0 z13 = z1(i10);
        if (i10 != 8 && (z13 == null || (h6Var = z13.f35670s) == null || h6Var.g() <= 0)) {
            f10 = visibilityFactor2;
        }
        if (!z10) {
            visibilityFactor = f10;
        }
        if (!z11) {
            f10 = visibilityFactor;
        }
        return org.telegram.messenger.g0.T1(visibilityFactor, f10, Math.abs(ds0VarArr[0].getTranslationX() / ds0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        ds0[] ds0VarArr = this.f36650n0;
        ds0 ds0Var = ds0VarArr[1];
        if (ds0Var != null && ds0Var.getVisibility() == 0) {
            if (this.f36640j1 && !this.l1) {
                return ds0VarArr[1].F;
            }
            if (Math.abs(ds0VarArr[1].getTranslationX()) < ds0VarArr[1].getMeasuredWidth() / 2.0f) {
                return ds0VarArr[1].F;
            }
        }
        return getSelectedTab();
    }

    public ek0 getCurrentListView() {
        qr0 qr0Var;
        ds0 ds0Var = this.f36650n0[0];
        int i7 = ds0Var.F;
        if (i7 == 13) {
            return this.f36609a0.getCurrentListView();
        }
        if (i7 == 14) {
            return this.f36613b0.getCurrentListView();
        }
        if (i7 == 12 && (qr0Var = this.W) != null) {
            return qr0Var.f47013a.A0;
        }
        return ds0Var.h;
    }

    public int getInitialTab() {
        return 0;
    }

    public int getPhotosVideosTypeFilter() {
        return this.f36677w1[0].f42527q;
    }

    public TextView getSaveItem() {
        return this.f36669t0;
    }

    public org.telegram.ui.ActionBar.q0 getSearchItem() {
        return this.f36658q0;
    }

    public rh0 getSearchOptionsItem() {
        return this.f36673v0;
    }

    public int getSelectedTab() {
        int currentTabId = this.L0.getCurrentTabId();
        jq0 jq0Var = this.f36617c0;
        if (jq0Var != null && currentTabId == 8) {
            int currentAlbumId = jq0Var.getCurrentAlbumId();
            if (currentAlbumId == 0) {
                return 8;
            }
            if (currentAlbumId > 0) {
                return x1(currentAlbumId).f36307a;
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
            ds0[] ds0VarArr = this.f36650n0;
            if (i7 < ds0VarArr.length) {
                ds0 ds0Var = ds0VarArr[i7];
                if (ds0Var != null) {
                    f10 = ((1.0f - Math.abs(ds0Var.getTranslationX() / getWidth())) * ds0Var.F) + f10;
                }
                i7++;
            } else {
                return f10;
            }
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.v6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.v6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.D0, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29792z6));
        int i7 = org.telegram.ui.ActionBar.m6.f29794z8;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f36652o0, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        org.telegram.ui.ActionBar.q0 q0Var = this.f36679x0;
        if (q0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.v6(q0Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        }
        org.telegram.ui.ActionBar.q0 q0Var2 = this.f36676w0;
        if (q0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.v6(q0Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        }
        Drawable[] drawableArr = {this.G0};
        int i10 = org.telegram.ui.ActionBar.m6.f29775y8;
        ImageView imageView = this.F0;
        arrayList.add(new org.telegram.ui.ActionBar.v6(imageView, 8, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.E0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29381d6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.L0, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29765xi));
        fr0 fr0Var = this.L0;
        arrayList.add(new org.telegram.ui.ActionBar.v6(fr0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29746wi));
        arrayList.add(new org.telegram.ui.ActionBar.v6(fr0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29727vi));
        arrayList.add(new org.telegram.ui.ActionBar.v6(fr0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29784yi));
        br0 br0Var = this.U0;
        if (br0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.v6(br0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29717v7));
            arrayList.add(new org.telegram.ui.ActionBar.v6(br0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29698u7));
            arrayList.add(new org.telegram.ui.ActionBar.v6(br0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29774y7));
            arrayList.add(new org.telegram.ui.ActionBar.v6(br0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.A7));
        }
        final int i11 = 0;
        while (true) {
            ds0[] ds0VarArr = this.f36650n0;
            if (i11 < ds0VarArr.length) {
                org.telegram.ui.ActionBar.u6 u6Var = new org.telegram.ui.ActionBar.u6() {
                    @Override
                    public final void b() {
                        ds0[] ds0VarArr2 = jt0.this.f36650n0;
                        int i12 = i11;
                        nq0 nq0Var = ds0VarArr2[i12].h;
                        if (nq0Var != null) {
                            int childCount = nq0Var.getChildCount();
                            for (int i13 = 0; i13 < childCount; i13++) {
                                View childAt = ds0VarArr2[i12].h.getChildAt(i13);
                                if (childAt instanceof org.telegram.ui.Cells.q7) {
                                    org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) childAt;
                                    for (int i14 = 0; i14 < 6; i14++) {
                                        q7Var.f31322a[i14].f31161e.invalidate();
                                    }
                                } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                                    ((org.telegram.ui.Cells.h6) childAt).y(0);
                                } else if (childAt instanceof org.telegram.ui.Cells.ra) {
                                    ((org.telegram.ui.Cells.ra) childAt).i(0);
                                }
                            }
                        }
                    }

                    @Override
                    public final void a(float f10) {
                    }
                };
                arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29661s8));
                arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29473i6));
                arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].f34564w, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29364c7));
                int i12 = org.telegram.ui.ActionBar.m6.f29455h6;
                arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i12));
                arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.ra.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, u6Var, org.telegram.ui.ActionBar.m6.f29563n6));
                arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u6Var, org.telegram.ui.ActionBar.m6.O7));
                arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u6Var, org.telegram.ui.ActionBar.m6.P7));
                arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u6Var, org.telegram.ui.ActionBar.m6.Q7));
                arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u6Var, org.telegram.ui.ActionBar.m6.R7));
                arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u6Var, org.telegram.ui.ActionBar.m6.S7));
                arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u6Var, org.telegram.ui.ActionBar.m6.T7));
                arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u6Var, org.telegram.ui.ActionBar.m6.U7));
                int i13 = org.telegram.ui.ActionBar.m6.i7;
                arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i13));
                int i14 = org.telegram.ui.ActionBar.m6.f29511k7;
                arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.qj));
                arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i12));
                arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, 8192, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i13));
                arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, 16384, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, 8192, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i13));
                arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, 16384, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, 8192, new Class[]{org.telegram.ui.Cells.q7.class}, (Paint) null, (Drawable[]) null, u6Var, i13));
                arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, 16384, new Class[]{org.telegram.ui.Cells.q7.class}, (Paint) null, (Drawable[]) null, u6Var, i14));
                arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.i2.class}, new String[]{"backgroundPaint"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ci));
                arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, 8192, new Class[]{org.telegram.ui.Cells.i2.class}, (Paint) null, (Drawable[]) null, u6Var, i13));
                arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, 16384, new Class[]{org.telegram.ui.Cells.i2.class}, (Paint) null, (Drawable[]) null, u6Var, i14));
                arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].h, 0, (Class[]) null, (Paint) null, new Drawable[]{this.B0}, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29345b7));
                arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].f34564w.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.v6(ds0VarArr[i11].f34564w.f37995e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29773y6));
                i11++;
            } else {
                return arrayList;
            }
        }
    }

    public int getTopPanelShift() {
        return this.f36657p2;
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
        int i10 = this.f36615b2 + this.f36629f2;
        if (z10) {
            i7 = org.telegram.messenger.g0.L(52.0f);
        } else {
            i7 = 0;
        }
        return i10 + i7;
    }

    public final void i1(v4.i0 i0Var) {
        if (i0Var instanceof dt0) {
            ArrayList arrayList = this.H0;
            ArrayList arrayList2 = this.I0;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        } else if (i0Var == this.P) {
            ArrayList arrayList3 = this.J0;
            ArrayList arrayList4 = this.K0;
            arrayList3.addAll(arrayList4);
            arrayList4.clear();
        } else {
            ss0 ss0Var = this.Q;
            if (i0Var == ss0Var) {
                ss0Var.f39684r = null;
            }
        }
    }

    public final int j0(int i7) {
        int i10;
        int n02 = n0(i7) + org.telegram.messenger.g0.L(54.0f) + this.d2 + this.f36625e2 + this.f36657p2;
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
            ds0[] ds0VarArr = this.f36650n0;
            if (i10 < ds0VarArr.length) {
                nq0 nq0Var = ds0VarArr[i10].h;
                if (nq0Var != null) {
                    int i11 = 0;
                    int i12 = 0;
                    for (int i13 = 0; i13 < nq0Var.getChildCount(); i13++) {
                        View childAt = nq0Var.getChildAt(i13);
                        if (childAt instanceof org.telegram.ui.Cells.p7) {
                            org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) childAt;
                            int messageId = p7Var.getMessageId();
                            i12 = p7Var.getTop();
                            i11 = messageId;
                        }
                        if (childAt instanceof org.telegram.ui.Cells.i7) {
                            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) childAt;
                            int e12 = i7Var.getMessage().e1();
                            i12 = i7Var.getTop();
                            i11 = e12;
                        }
                        if (childAt instanceof org.telegram.ui.Cells.h7) {
                            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                            i11 = h7Var.getMessage().e1();
                            i12 = h7Var.getTop();
                        }
                        if (i11 != 0) {
                            break;
                        }
                    }
                    if (i11 != 0) {
                        int i14 = ds0VarArr[i10].F;
                        int i15 = -1;
                        if (z0(i14)) {
                            gt0 z12 = z1(i14);
                            if (z12 != null && z12.f35670s != null) {
                                int i16 = 0;
                                while (true) {
                                    if (i16 >= z12.f35670s.f12089i.size()) {
                                        break;
                                    } else if (i11 == ((org.telegram.messenger.gj) z12.f35670s.f12089i.get(i16)).e1()) {
                                        i15 = i16;
                                        break;
                                    } else {
                                        i16++;
                                    }
                                }
                            }
                            i7 = i15;
                        } else if (i14 >= 0) {
                            ys0[] ys0VarArr = this.f36677w1;
                            if (i14 < ys0VarArr.length) {
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= ys0VarArr[i14].f42513a.size()) {
                                        break;
                                    } else if (i11 == ((org.telegram.messenger.gj) ys0VarArr[i14].f42513a.get(i17)).e1()) {
                                        i15 = i17;
                                        break;
                                    } else {
                                        i17++;
                                    }
                                }
                                i7 = ys0VarArr[i14].f42523m + i15;
                            }
                        }
                        if (i15 >= 0) {
                            ((v4.c0) nq0Var.getLayoutManager()).h1(i7, (-ds0VarArr[i10].h.getPaddingTop()) + i12);
                            if (this.f36663r1) {
                                ds0 ds0Var = ds0VarArr[i10];
                                ds0Var.f34562r.h1(i7, (-ds0Var.h.getPaddingTop()) + i12);
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
        ds0[] ds0VarArr = this.f36650n0;
        ds0 ds0Var = ds0VarArr[1];
        if (ds0Var != null && v0(ds0Var.F)) {
            f11 = 0.0f + f10;
        }
        ds0 ds0Var2 = ds0VarArr[0];
        if (ds0Var2 != null && v0(ds0Var2.F)) {
            return (1.0f - f10) + f11;
        }
        return f11;
    }

    public final void k1(int i7) {
        fr0 fr0Var;
        if (!this.P1 && (fr0Var = this.L0) != null) {
            fr0Var.g(null, i7, fr0Var.Q.get(i7));
        }
    }

    public final float l0(float f10) {
        float f11 = 0.0f;
        if (A0()) {
            return 0.0f;
        }
        ds0[] ds0VarArr = this.f36650n0;
        ds0 ds0Var = ds0VarArr[1];
        if (ds0Var != null && F0(ds0Var.F) && ds0VarArr[1].F != 11) {
            f11 = 0.0f + f10;
        }
        ds0 ds0Var2 = ds0VarArr[0];
        if (ds0Var2 != null && F0(ds0Var2.F) && ds0VarArr[0].F != 11) {
            return (1.0f - f10) + f11;
        }
        return f11;
    }

    public final void l1(float f10, int i7) {
        int i10;
        fr0 fr0Var = this.L0;
        if (fr0Var != null) {
            if (J0(i7)) {
                i10 = 8;
            } else {
                i10 = i7;
            }
            fr0Var.i(f10, i10);
        }
        jq0 jq0Var = this.f36617c0;
        if (jq0Var != null) {
            i71 i71Var = jq0Var.f50348b;
            if (J0(i7)) {
                i71Var.g(f10, w1(i7));
            } else if (i7 == 8) {
                i71Var.g(f10, 0);
            }
        }
    }

    @Override
    public final boolean m() {
        return false;
    }

    public final int m0(int i7) {
        gt0 z12;
        fi.h6 h6Var;
        if (z0(i7) && (z12 = z1(i7)) != null && (h6Var = z12.f35670s) != null) {
            return h6Var.g();
        }
        return 0;
    }

    public final void m1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i7 = 0;
        while (true) {
            ds0[] ds0VarArr = this.f36650n0;
            if (i7 < ds0VarArr.length) {
                ds0 ds0Var = ds0VarArr[i7];
                if (ds0Var.F != 7 || ds0Var.h.getAdapter() == null || ds0VarArr[i7].h.getAdapter().b() == 0 || this.f36683y1.getMessagesController().R1().f12432j.size() <= 0) {
                    i7++;
                } else {
                    return;
                }
            } else {
                if (this.G == 0) {
                    vr0 vr0Var = this.f36620d0;
                    vr0Var.d = chatFull;
                    vr0Var.f41545e = arrayList;
                }
                P1(true);
                for (int i10 = 0; i10 < ds0VarArr.length; i10++) {
                    ds0 ds0Var2 = ds0VarArr[i10];
                    if (ds0Var2.F == 7 && ds0Var2.h.getAdapter() != null) {
                        org.telegram.messenger.g0.r2(ds0VarArr[i10].h);
                    }
                }
                return;
            }
        }
    }

    public final int n0(int i7) {
        float f10;
        jq0 jq0Var = this.f36617c0;
        if (jq0Var != null && (J0(i7) || i7 == 8)) {
            f10 = jq0Var.getVisibilityFactor() * org.telegram.messenger.g0.L(40.0f);
        } else {
            f10 = 0.0f;
        }
        return (int) f10;
    }

    public final void n1(int i7, int i10, int i11, int i12) {
        ds0[] ds0VarArr;
        boolean z10;
        boolean z11 = true;
        this.f36619c2 = true;
        this.d2 = i7;
        this.f36625e2 = i10;
        this.f36629f2 = i11;
        this.f36615b2 = i12;
        G();
        gq0 gq0Var = this.f36613b0;
        if (gq0Var != null) {
            if (gq0Var.M != i10 || gq0Var.N != i11) {
                gq0Var.M = i10;
                gq0Var.N = i11;
                if (i10 == 0 && i11 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                gq0Var.setClipChildren(z10);
                gq0Var.h.setClipChildren((i10 == 0 && i11 == 0) ? false : false);
                gq0Var.n();
            }
            H1();
        }
        for (ds0 ds0Var : this.f36650n0) {
            if (ds0Var != null) {
                ds0Var.setClipChildren(false);
                J1(ds0Var);
                setPageOverscan(ds0Var.h);
                setPageOverscan(ds0Var.f34561n);
                int paddingTop = ds0Var.h.getPaddingTop();
                nq0 nq0Var = ds0Var.h;
                int paddingLeft = nq0Var.getPaddingLeft();
                nq0 nq0Var2 = ds0Var.h;
                int j02 = j0(ds0Var.F);
                nq0Var2.f34295h3 = j02;
                int paddingRight = ds0Var.h.getPaddingRight();
                nq0 nq0Var3 = ds0Var.h;
                int i02 = i0(I0());
                nq0Var3.f34296i3 = i02;
                nq0Var.setPadding(paddingLeft, j02, paddingRight, i02);
                int paddingTop2 = paddingTop - ds0Var.h.getPaddingTop();
                if (paddingTop2 != 0) {
                    org.telegram.messenger.g0.J(ds0Var.h, new qp0(ds0Var, paddingTop2, 1));
                }
                ds0Var.f34564w.setPadding(0, i7, 0, i12);
                qr0 qr0Var = this.W;
                if (qr0Var != null && qr0Var.getParent() == ds0Var) {
                    p1(org.telegram.messenger.g0.L(56.0f) + i7, qr0Var);
                }
                fq0 fq0Var = this.f36609a0;
                if (fq0Var != null && fq0Var.getParent() == ds0Var) {
                    p1(i7, fq0Var);
                }
            }
        }
        setClipChildren(false);
        requestLayout();
        invalidate();
    }

    public final void o1(int i7, boolean z10) {
        this.D0.a(i7, z10);
        org.telegram.ui.ActionBar.z4 z4Var = this.I;
        if (z4Var != null) {
            z4Var.E(i7, z10);
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i7 = 0;
        while (true) {
            ds0[] ds0VarArr = this.f36650n0;
            if (i7 < ds0VarArr.length) {
                nq0 nq0Var = ds0VarArr[i7].h;
                if (nq0Var != null) {
                    nq0Var.getViewTreeObserver().addOnPreDrawListener(new lr0(this, i7, 0));
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
        xr0 xr0Var = this.G1;
        if (xr0Var.f() != null) {
            i11 = xr0Var.f().getHeight();
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
            } else if (childAt instanceof ds0) {
                i12 = i7;
                measureChildWithMargins(childAt, i12, 0, View.MeasureSpec.makeMeasureSpec(i11, 1073741824), 0);
                nq0 nq0Var = ((ds0) childAt).h;
                nq0Var.setPadding(0, nq0Var.f34293f3, 0, nq0Var.f34294g3);
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
            org.telegram.ui.ActionBar.g2 g2Var = this.f36683y1;
            if (g2Var.getParentLayout() != null && !((ActionBarLayout) g2Var.getParentLayout()).i() && !T() && !this.f36608a) {
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
                        this.f36685z1 = motionEvent.getPointerId(0);
                        this.B1 = true;
                        this.C1 = (int) motionEvent.getX();
                        this.D1 = (int) motionEvent.getY();
                        this.E1.clear();
                        return this.A1;
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f36685z1) {
                    int x10 = (int) (motionEvent.getX() - this.C1);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.D1);
                    boolean z13 = this.A1;
                    ds0[] ds0VarArr = this.f36650n0;
                    if (z13 && (((z10 = this.f36643k1) && x10 > 0) || (!z10 && x10 < 0))) {
                        if (x10 < 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!g1(motionEvent, z11)) {
                            this.B1 = true;
                            this.A1 = false;
                            ds0VarArr[0].setTranslationX(0.0f);
                            ds0 ds0Var = ds0VarArr[1];
                            if (this.f36643k1) {
                                i10 = ds0VarArr[0].getMeasuredWidth();
                            } else {
                                i10 = -ds0VarArr[0].getMeasuredWidth();
                            }
                            ds0Var.setTranslationX(i10);
                            l1(0.0f, ds0VarArr[1].F);
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
                        ds0VarArr[0].setTranslationX(x10);
                        if (this.f36643k1) {
                            ds0VarArr[1].setTranslationX(ds0VarArr[0].getMeasuredWidth() + x10);
                        } else {
                            ds0VarArr[1].setTranslationX(x10 - ds0VarArr[0].getMeasuredWidth());
                        }
                        float abs2 = Math.abs(x10) / ds0VarArr[0].getMeasuredWidth();
                        if (!I()) {
                            this.f36662r0 = 0.0f;
                        } else {
                            this.f36662r0 = l0(abs2);
                            M1(abs2);
                            float k02 = k0(abs2);
                            this.f36666s0 = k02;
                            if (k02 != 0.0f && I() && !A0()) {
                                i7 = 0;
                            } else {
                                i7 = 4;
                            }
                            this.f36671u0.setVisibility(i7);
                        }
                        I1(false);
                        l1(abs2, ds0VarArr[1].F);
                        Z0(getTabProgress());
                        Y0();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f36685z1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
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
            ds0[] ds0VarArr = this.f36650n0;
            if (i10 >= ds0VarArr.length) {
                break;
            }
            ds0 ds0Var = ds0VarArr[i10];
            if (ds0Var != null) {
                int i12 = ds0Var.F;
                if ((z10 && i7 == 8 && J0(i12)) || i12 == i7) {
                    i11++;
                    width = ds0VarArr[i10].getTranslationX();
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
            org.telegram.ui.ActionBar.z4 z4Var = this.I;
            if (z4Var != null) {
                if (z10) {
                    O1();
                    z4Var.J();
                } else {
                    z4Var.w();
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
            this.R1.addListener(new org.telegram.ui.on(20, this, z10));
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
            ds0[] ds0VarArr = this.f36650n0;
            if (i10 < ds0VarArr.length) {
                ds0 ds0Var = ds0VarArr[i10];
                if (ds0Var != null) {
                    int i11 = ds0Var.F;
                    if ((z10 && i7 == 8 && J0(i11)) || i11 == i7) {
                        f10 = (1.0f - Math.abs(ds0VarArr[i10].getTranslationX() / getWidth())) + f10;
                    }
                }
                i10++;
            } else {
                return f10;
            }
        }
    }

    public final void r1(int r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jt0.r1(int, boolean):void");
    }

    public final int s0(int i7) {
        org.telegram.ui.ActionBar.h6 h6Var = this.I1;
        if (h6Var != null) {
            return h6Var.k(i7);
        }
        return org.telegram.ui.ActionBar.m6.x0(null, i7, false);
    }

    public final void s1(int i7) {
        int w12 = w1(getClosestTab());
        jq0 jq0Var = this.f36617c0;
        if (w12 != i7) {
            if (jq0Var != null) {
                jq0Var.f50348b.e(i7, jq0Var.d.i(i7));
                return;
            }
            return;
        }
        jq0Var.setReorderingAlbums(true);
        it0 x12 = x1(i7);
        ds0 g02 = g0(x12.f36307a);
        if (g02 == null) {
            return;
        }
        nq0 nq0Var = g02.h;
        for (int i10 = 0; i10 < nq0Var.getChildCount(); i10++) {
            View childAt = nq0Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.p7) {
                ((org.telegram.ui.Cells.p7) childAt).l(true, true);
            }
        }
        ht0 ht0Var = x12.f36309c;
        if (ht0Var != null && !ht0Var.f35673y) {
            ht0Var.f35673y = true;
        }
        I1(true);
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        boolean z10;
        int i7;
        TLRPC.ChatFull chatFull2 = this.f36631g1;
        if (chatFull2 != null && chatFull2.stories_pinned_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f36631g1 = chatFull;
        if (chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.f36628f1 == 0) {
                this.f36628f1 = -j3;
                int i10 = 0;
                while (true) {
                    ys0[] ys0VarArr = this.f36677w1;
                    if (i10 >= ys0VarArr.length) {
                        break;
                    }
                    if (ys0VarArr[i10].f42514b[1].size() == 0) {
                        ys0 ys0Var = ys0VarArr[i10];
                        ys0Var.f42520j[1] = this.f36631g1.migrated_from_max_id;
                        ys0Var.f42519i[1] = false;
                    }
                    i10++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.f36631g1;
        if (chatFull3 != null && z10 != chatFull3.stories_pinned_available) {
            fr0 fr0Var = this.L0;
            if (fr0Var != null) {
                if (A0()) {
                    i7 = 9;
                } else {
                    i7 = 8;
                }
                fr0Var.setInitialTabId(i7);
            }
            P1(true);
            B1(false);
        }
    }

    public void setCommonGroupsCount(int i7) {
        if (this.G == 0) {
            this.f36610a1[6] = i7;
        }
        P1(true);
        N();
    }

    public void setForwardRestrictedHint(hi.l3 l3Var) {
        this.H1 = l3Var;
    }

    public void setMergeDialogId(long j3) {
        this.f36628f1 = j3;
    }

    public void setNewMediaCounts(int[] iArr) {
        int[] iArr2;
        int i7 = 0;
        while (true) {
            iArr2 = this.f36610a1;
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
        this.f36644k2 = runnable;
    }

    @Override
    public final void setPadding(int i7, int i10, int i11, int i12) {
        this.O1 = i10;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            ds0[] ds0VarArr = this.f36650n0;
            if (i14 >= ds0VarArr.length) {
                break;
            }
            ds0VarArr[i14].setTranslationY(this.O1);
            i14++;
        }
        if (this.S0 != null) {
            U();
        } else {
            br0 br0Var = this.U0;
            if (br0Var != null) {
                br0Var.setTranslationY(org.telegram.messenger.g0.L(48.0f) + i10);
            }
        }
        this.R0 = i10;
        org.telegram.ui.Cells.v0 v0Var = this.N0;
        if (v0Var.getTag() == null) {
            i13 = -org.telegram.messenger.g0.L(48.0f);
        }
        v0Var.setTranslationY(i13 + this.R0);
    }

    public void setPagesGlassEngine(ri.q qVar) {
        ds0[] ds0VarArr;
        this.f36635h2 = qVar;
        gq0 gq0Var = this.f36613b0;
        if (gq0Var != null) {
            gq0Var.setGlassEngine(qVar);
        }
        for (ds0 ds0Var : this.f36650n0) {
            if (ds0Var != null) {
                ds0Var.h.setCaptureSectionsDecoratorAllowed(true);
                qVar.b(ds0Var.h);
            }
        }
    }

    public void setPagesPaddingBottom(int i7) {
        if (this.f36615b2 != i7) {
            this.f36615b2 = i7;
            ds0[] ds0VarArr = this.f36650n0;
            if (ds0VarArr != null) {
                for (ds0 ds0Var : ds0VarArr) {
                    if (ds0Var != null) {
                        nq0 nq0Var = ds0Var.h;
                        int paddingLeft = nq0Var.getPaddingLeft();
                        nq0 nq0Var2 = ds0Var.h;
                        int i10 = nq0Var2.f34293f3;
                        int paddingRight = nq0Var2.getPaddingRight();
                        nq0 nq0Var3 = ds0Var.h;
                        int i02 = i0(I0());
                        nq0Var3.f34296i3 = i02;
                        nq0Var.setPadding(paddingLeft, i10, paddingRight, i02);
                    }
                }
            }
        }
    }

    public void setPagesVisibleOverscanTop(int i7) {
        if (this.f36632g2 != i7) {
            this.f36632g2 = i7;
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
                ds0[] ds0VarArr = this.f36650n0;
                if (i7 < ds0VarArr.length) {
                    F1(ds0VarArr[i7], true);
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        boolean z10;
        TLRPC.UserFull userFull2 = this.f36634h1;
        if (userFull2 != null && userFull2.stories_pinned_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f36634h1 = userFull;
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
            ds0[] ds0VarArr = this.f36650n0;
            if (i10 >= ds0VarArr.length) {
                break;
            }
            int measuredHeight = getMeasuredHeight();
            if (ds0VarArr[i10].F == 8) {
                f10 = 280.0f;
            } else {
                f10 = 120.0f;
            }
            float f11 = (-(measuredHeight - Math.max(i7, org.telegram.messenger.g0.L(f10)))) / 2.0f;
            ds0VarArr[i10].f34564w.setTranslationY(f11);
            ds0VarArr[i10].f34563s.setTranslationY(-f11);
            i10++;
        }
        fq0 fq0Var = this.f36609a0;
        if (fq0Var != null) {
            fq0Var.setVisibleHeight(i7);
        }
        gq0 gq0Var = this.f36613b0;
        if (gq0Var != null) {
            gq0Var.setVisibleHeight(i7);
        }
    }

    public final boolean t0() {
        if (this.f36683y1.getConnectionsManager().getConnectionState() == 3) {
            return true;
        }
        return false;
    }

    public final void t1(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jt0.t1(boolean):void");
    }

    @Override
    public final void u(org.telegram.ui.Cells.u2 u2Var) {
        int i7;
        org.telegram.ui.ActionBar.g2 g2Var = this.f36683y1;
        if (g2Var != null && g2Var.getMessagesController().R1().K(u2Var.getDialogId())) {
            g2Var.getOrCreateStoryViewer().getClass();
            fi.f9 orCreateStoryViewer = g2Var.getOrCreateStoryViewer();
            Context context = g2Var.getContext();
            long dialogId = u2Var.getDialogId();
            fi.y6 a10 = fi.y6.a((ek0) u2Var.getParent());
            if ((g2Var instanceof ProfileActivity) && ((ProfileActivity) g2Var).f43682s1) {
                i7 = org.telegram.messenger.g0.L(68.0f);
            } else {
                i7 = 0;
            }
            a10.f12832s += i7;
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
                sparseArrayArr = this.f36618c1;
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
                if (num.intValue() > 0 && (gjVar = (org.telegram.messenger.gj) sparseArrayArr[i7].get(num.intValue())) != null && (message = gjVar.f24213k) != null && message.noforwards) {
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
            ds0[] ds0VarArr = this.f36650n0;
            if (i7 < ds0VarArr.length) {
                int childCount = ds0VarArr[i7].h.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = ds0VarArr[i7].h.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.i2) {
                        ImageReceiver photoImage = ((org.telegram.ui.Cells.i2) childAt).getPhotoImage();
                        if (i7 == 0) {
                            photoImage.f22695u0 = true;
                            photoImage.P0(false);
                        } else {
                            photoImage.f22695u0 = false;
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
        ds0[] ds0VarArr;
        try {
            this.J1.a(s0(org.telegram.ui.ActionBar.m6.f29381d6));
            org.telegram.ui.ActionBar.x1 x1Var = this.G0;
            if (x1Var != null) {
                x1Var.a(s0(org.telegram.ui.ActionBar.m6.f29775y8));
            }
            NumberTextView numberTextView = this.D0;
            if (numberTextView != null) {
                numberTextView.setTextColor(s0(org.telegram.ui.ActionBar.m6.f29775y8));
            }
            D1();
            invalidate();
            for (ds0 ds0Var : this.f36650n0) {
                if (ds0Var != null && ds0Var.M) {
                    ds0Var.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final boolean v0(int i7) {
        if (i7 != 0) {
            if (((i7 != 8 && !J0(i7)) || !TextUtils.isEmpty(getStoriesHashtag())) && i7 != 9 && i7 != 11 && i7 != 13) {
                if (i7 != 14 || this.f36613b0 == null) {
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
        ds0 ds0Var;
        ds0 ds0Var2;
        int measuredWidth2;
        ds0 ds0Var3;
        ds0 ds0Var4;
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
                ds0[] ds0VarArr = this.f36650n0;
                float x10 = ds0VarArr[0].getX();
                this.f36637i1 = new AnimatorSet();
                if (Math.abs(x10) < ds0VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.l1 = z10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new h60(this, 20));
                boolean z12 = this.l1;
                Property property = View.TRANSLATION_X;
                if (z12) {
                    measuredWidth = Math.abs(x10);
                    if (this.f36643k1) {
                        this.f36637i1.playTogether(ObjectAnimator.ofFloat(ds0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(ds0VarArr[1], property, ds0Var4.getMeasuredWidth()), ofFloat);
                    } else {
                        this.f36637i1.playTogether(ObjectAnimator.ofFloat(ds0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(ds0VarArr[1], property, -ds0Var3.getMeasuredWidth()), ofFloat);
                    }
                } else {
                    measuredWidth = ds0VarArr[0].getMeasuredWidth() - Math.abs(x10);
                    if (this.f36643k1) {
                        this.f36637i1.playTogether(ObjectAnimator.ofFloat(ds0VarArr[0], property, -ds0Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(ds0VarArr[1], property, 0.0f), ofFloat);
                    } else {
                        this.f36637i1.playTogether(ObjectAnimator.ofFloat(ds0VarArr[0], property, ds0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(ds0VarArr[1], property, 0.0f), ofFloat);
                    }
                }
                this.f36637i1.setInterpolator(f36605u2);
                int measuredWidth3 = getMeasuredWidth();
                float f12 = measuredWidth3 / 2;
                float I = (org.telegram.messenger.g0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f12) + f12;
                float abs = Math.abs(f10);
                if (abs > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(I / abs) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                this.f36637i1.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                this.f36637i1.addListener(new ir0(this, 1));
                this.f36637i1.start();
                this.f36640j1 = true;
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
        org.telegram.ui.Cells.v0 v0Var = this.N0;
        if (v0Var.getTag() == null) {
            return;
        }
        v0Var.setTag(null);
        AnimatorSet animatorSet = this.O0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.O0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.O0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.O0.playTogether(ObjectAnimator.ofFloat(v0Var, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(v0Var, View.TRANSLATION_Y, (-org.telegram.messenger.g0.L(48.0f)) + this.R0));
        this.O0.setInterpolator(nr.f37961g);
        this.O0.addListener(new ir0(this, 0));
        this.O0.start();
    }

    public final int w1(int i7) {
        it0 y12 = y1(i7);
        if (y12 == null) {
            return -1;
        }
        return y12.f36308b;
    }

    public boolean x0() {
        return false;
    }

    public final it0 x1(int i7) {
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = this.f36648m2;
        it0 it0Var = (it0) hashMap.get(valueOf);
        if (it0Var == null) {
            it0 it0Var2 = new it0(this, getContext(), i7);
            hashMap.put(Integer.valueOf(i7), it0Var2);
            this.f36651n2.put(Integer.valueOf(it0Var2.f36307a), Integer.valueOf(i7));
            return it0Var2;
        }
        return it0Var;
    }

    public boolean y0() {
        return !(this instanceof c30);
    }

    public final it0 y1(int i7) {
        Integer num = (Integer) this.f36651n2.get(Integer.valueOf(i7));
        if (num == null) {
            return null;
        }
        return (it0) this.f36648m2.get(num);
    }

    public final void z(View view) {
        ds0[] ds0VarArr = this.f36650n0;
        addView(view, Math.max(indexOfChild(ds0VarArr[0]), indexOfChild(ds0VarArr[1])) + 1, c8.ma.e(-1, 0, 48));
        view.getLayoutParams().height = 0;
    }

    public final gt0 z1(int i7) {
        it0 y12;
        if (i7 == 8) {
            return this.f36627f0;
        }
        if (i7 == 9) {
            return this.f36633h0;
        }
        if (J0(i7) && (y12 = y1(i7)) != null) {
            return y12.f36309c;
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
    public final void l(org.telegram.ui.Cells.u2 u2Var) {
    }

    @Override
    public final void r(org.telegram.ui.Cells.u2 u2Var) {
    }

    @Override
    public final void w(org.telegram.ui.Cells.u2 u2Var) {
    }

    public void Q0() {
    }

    public void W0() {
    }

    @Override
    public final void q() {
    }
}
