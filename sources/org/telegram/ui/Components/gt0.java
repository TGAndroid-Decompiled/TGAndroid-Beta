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
public abstract class gt0 extends FrameLayout implements org.telegram.ui.ActionBar.c6, org.telegram.messenger.fs, org.telegram.ui.Cells.q2, wj0 {
    public static final int[] f35563t2 = {0, 1, 2, 4};
    public static final bq0 f35564u2 = new bq0(0);
    public static final int f35565v2 = org.telegram.messenger.g0.L(7.0f);
    public static final int f35566w2 = org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(14.0f);
    public int A0;
    public boolean A1;
    public final Drawable B0;
    public boolean B1;
    public boolean C0;
    public int C1;
    public final NumberTextView D0;
    public int D1;
    public final wz E;
    public final LinearLayout E0;
    public VelocityTracker E1;
    public final int F;
    public final ImageView F0;
    public boolean F1;
    public final long G;
    public final org.telegram.ui.ActionBar.y1 G0;
    public final vr0 G1;
    public final org.telegram.ui.ActionBar.k H;
    public final ArrayList H0;
    public hi.m3 H1;
    public final org.telegram.ui.ActionBar.a5 I;
    public final ArrayList I0;
    public final org.telegram.ui.ActionBar.i6 I1;
    public final org.telegram.ui.ActionBar.h5 J;
    public final ArrayList J0;
    public final ui.c J1;
    public final nr0 K;
    public final ArrayList K0;
    public final xi.e K1;
    public final at0 L;
    public final dr0 L0;
    public boolean L1;
    public final us0 M;
    public final ar0 M0;
    public final h2.f M1;
    public final ts0 N;
    public final org.telegram.ui.Cells.v0 N0;
    public org.telegram.ui.b0 N1;
    public final ts0 O;
    public AnimatorSet O0;
    public int O1;
    public final ts0 P;
    public final fp0 P0;
    public boolean P1;
    public final ps0 Q;
    public final ArrayList Q0;
    public int Q1;
    public final wr0 R;
    public float R0;
    public AnimatorSet R1;
    public final ur0 S;
    public final cs S0;
    public final SparseArray S1;
    public final sr0 T;
    public final FrameLayout T0;
    public long T1;
    public final rs0 U;
    public final zq0 U0;
    public boolean U1;
    public final ss0 V;
    public final int V0;
    public int V1;
    public final or0 W;
    public final Paint W0;
    public final kr0 W1;
    public boolean X0;
    public fi.h6 X1;
    public boolean Y0;
    public float Y1;
    public ch.p0 Z0;
    public boolean Z1;
    public boolean f35567a;
    public final dq0 f35568a0;
    public final int[] f35569a1;
    public SpannableStringBuilder f35570a2;
    public boolean f35571b;
    public final eq0 f35572b0;
    public int f35573b1;
    public int f35574b2;
    public boolean f35575c;
    public final hq0 f35576c0;
    public final SparseArray[] f35577c1;
    public boolean f35578c2;
    public boolean d;
    public final tr0 f35579d0;
    public int f35580d1;
    public int d2;
    public int f35581e;
    public final v4.z f35582e0;
    public boolean f35583e1;
    public int f35584e2;
    public int f35585f;
    public final qr0 f35586f0;
    public long f35587f1;
    public int f35588f2;
    public final dt0 f35589g0;
    public TLRPC.ChatFull f35590g1;
    public int f35591g2;
    public float h;
    public final cq0 f35592h0;
    public TLRPC.UserFull f35593h1;
    public ri.q f35594h2;
    public final dt0 f35595i0;
    public AnimatorSet f35596i1;
    public float f35597i2;
    public final ds0 f35598j0;
    public boolean f35599j1;
    public final RectF f35600j2;
    public final ds0 f35601k0;
    public boolean f35602k1;
    public Runnable f35603k2;
    public final ds0 f35604l0;
    public boolean l1;
    public int f35605l2;
    public final zr0 m0;
    public final long f35606m1;
    public final HashMap f35607m2;
    public float f35608n;
    public final bs0[] f35609n0;
    public boolean n1;
    public final HashMap f35610n2;
    public final org.telegram.ui.ActionBar.r0 f35611o0;
    public boolean f35612o1;
    public int f35613o2;
    public final org.telegram.ui.ActionBar.r0 f35614p0;
    public final int[] f35615p1;
    public int f35616p2;
    public final org.telegram.ui.ActionBar.r0 f35617q0;
    public float f35618q1;
    public boolean f35619q2;
    public boolean f35620r;
    public float f35621r0;
    public boolean f35622r1;
    public int f35623r2;
    public int f35624s;
    public float f35625s0;
    public int f35626s1;
    public int f35627s2;
    public final TextView f35628t0;
    public int f35629t1;
    public final ImageView f35630u0;
    public final nq0 f35631u1;
    public final ph0 f35632v0;
    public float f35633v1;
    public int f35634w;
    public final org.telegram.ui.ActionBar.r0 f35635w0;
    public final vs0[] f35636w1;
    public int f35637x;
    public final org.telegram.ui.ActionBar.r0 f35638x0;
    public final ys0 f35639x1;
    public final Rect f35640y;
    public final org.telegram.ui.ActionBar.r0 f35641y0;
    public final org.telegram.ui.ActionBar.h2 f35642y1;
    public final org.telegram.ui.ActionBar.r0 f35643z0;
    public int f35644z1;

    public gt0(android.content.Context r34, long r35, org.telegram.ui.Components.ys0 r37, int r38, java.util.ArrayList r39, org.telegram.tgnet.TLRPC.ChatFull r40, org.telegram.tgnet.TLRPC.UserFull r41, int r42, int r43, org.telegram.ui.ActionBar.h2 r44, org.telegram.ui.Components.vr0 r45, int r46, org.telegram.ui.ActionBar.i6 r47, dh.c r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gt0.<init>(android.content.Context, long, org.telegram.ui.Components.ys0, int, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.tgnet.TLRPC$UserFull, int, int, org.telegram.ui.ActionBar.h2, org.telegram.ui.Components.vr0, int, org.telegram.ui.ActionBar.i6, dh.c):void");
    }

    public static boolean J0(int i7) {
        if ((i7 & (-65536)) == 65536) {
            return true;
        }
        return false;
    }

    public static x3 X(int i7, long j3, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        x3 x3Var = new x3(context, i6Var);
        ImageView imageView = (ImageView) x3Var.d;
        TextView textView = (TextView) x3Var.f41871c;
        if (i7 == 0) {
            if (org.telegram.messenger.n5.C(j3)) {
                textView.setText(org.telegram.messenger.gd.M0(2131748004, null));
                return x3Var;
            }
            textView.setText(org.telegram.messenger.gd.M0(2131748006, null));
            return x3Var;
        } else if (i7 == 1) {
            if (org.telegram.messenger.n5.C(j3)) {
                textView.setText(org.telegram.messenger.gd.M0(2131747965, null));
                return x3Var;
            }
            textView.setText(org.telegram.messenger.gd.M0(2131747966, null));
            return x3Var;
        } else if (i7 == 2) {
            if (org.telegram.messenger.n5.C(j3)) {
                textView.setText(org.telegram.messenger.gd.M0(2131747960, null));
                return x3Var;
            }
            textView.setText(org.telegram.messenger.gd.M0(2131747961, null));
            return x3Var;
        } else if (i7 == 3) {
            if (org.telegram.messenger.n5.C(j3)) {
                textView.setText(org.telegram.messenger.gd.M0(2131747962, null));
                return x3Var;
            }
            textView.setText(org.telegram.messenger.gd.M0(2131747963, null));
            return x3Var;
        } else if (i7 == 4) {
            if (org.telegram.messenger.n5.C(j3)) {
                textView.setText(org.telegram.messenger.gd.M0(2131747967, null));
                return x3Var;
            }
            textView.setText(org.telegram.messenger.gd.M0(2131747968, null));
            return x3Var;
        } else if (i7 == 5) {
            if (org.telegram.messenger.n5.C(j3)) {
                textView.setText(org.telegram.messenger.gd.M0(2131747964, null));
                return x3Var;
            }
            textView.setText(org.telegram.messenger.gd.M0(2131748016, null));
            return x3Var;
        } else if (i7 == 6) {
            imageView.setImageDrawable(null);
            textView.setText(org.telegram.messenger.gd.M0(2131748014, null));
            return x3Var;
        } else {
            if (i7 == 7) {
                imageView.setImageDrawable(null);
                textView.setText("");
            }
            return x3Var;
        }
    }

    public static void a(gt0 gt0Var, TL_stories.StoryItem storyItem, fi.i6 i6Var) {
        gt0Var.getStoriesController().c(i6Var.f12109a, gt0Var.f35606m1, storyItem);
        org.telegram.messenger.g0.h3(new hn0(3, gt0Var, i6Var), 100L);
    }

    public static void d(gt0 gt0Var, int i7, TL_stories.StoryItem storyItem, String str) {
        org.telegram.ui.b0 b0Var = new org.telegram.ui.b0(gt0Var, i7, storyItem, 19);
        fi.p6 storiesController = gt0Var.getStoriesController();
        long j3 = gt0Var.f35606m1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.f0(i7, j3, arrayList);
        lc.b0(gt0Var.f35642y1).K(2131623980, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(1, "StoryRemovedFromAlbumTitle", str)), org.telegram.messenger.gd.M0(2131743648, null), b0Var).j();
    }

    public static void e(gt0 gt0Var, long j3, int i7) {
        fi.d6 B = gt0Var.getStoriesController().B(j3, true);
        int i10 = B.f11850a;
        int c10 = B.c(i7);
        if (c10 == -1) {
            return;
        }
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = org.telegram.messenger.mp.u1(i10).l1(B.f11851b);
        tL_deleteAlbum.album_id = ((fi.i6) B.h.remove(c10)).f12109a;
        ConnectionsManager.getInstance(i10).sendRequest(tL_deleteAlbum, null);
        B.f(true);
    }

    public static void f(gt0 gt0Var, long j3, int i7, String str) {
        fi.d6 B = gt0Var.getStoriesController().B(j3, true);
        int i10 = B.f11850a;
        int c10 = B.c(i7);
        if (c10 == -1) {
            return;
        }
        ((fi.i6) B.h.get(c10)).f12110b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = org.telegram.messenger.mp.u1(i10).l1(B.f11851b);
        tL_updateAlbum.album_id = i7;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i10).sendRequest(tL_updateAlbum, null);
        B.f(true);
    }

    public long getPlaylistTopicId() {
        if (org.telegram.messenger.v3.b0(this.f35642y1.getCurrentAccount(), this.f35606m1)) {
            return this.G;
        }
        return 0L;
    }

    public fi.p6 getStoriesController() {
        return org.telegram.messenger.mp.u1(this.f35642y1.getCurrentAccount()).R1();
    }

    public static void h(gt0 gt0Var, TL_stories.StoryItem storyItem) {
        gt0Var.getStoriesController().r0(gt0Var.f35606m1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        lc.b0(gt0Var.f35642y1).G(2131623980, 5000, org.telegram.messenger.gd.G(1, "StoryArchived", new Object[0])).j();
    }

    public static void j(gt0 gt0Var, HashSet hashSet, TL_stories.StoryItem storyItem, y60 y60Var, fi.i6 i6Var) {
        String a02;
        long j3 = gt0Var.f35606m1;
        if (hashSet.contains(Integer.valueOf(i6Var.f12109a))) {
            gt0Var.getStoriesController().c(i6Var.f12109a, j3, storyItem);
            a02 = org.telegram.messenger.gd.a0(null, null, 2131744496, i6Var.f12110b);
        } else {
            fi.p6 storiesController = gt0Var.getStoriesController();
            int i7 = i6Var.f12109a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.f0(i7, j3, arrayList);
            a02 = org.telegram.messenger.gd.a0(null, null, 2131744259, i6Var.f12110b);
        }
        lc.b0(gt0Var.f35642y1).Q(2131623990, 36, org.telegram.messenger.g0.W2(a02)).j();
        y60Var.v();
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

    public static void s(bs0 bs0Var, vs0[] vs0VarArr, boolean z10) {
        hn0 hn0Var;
        if (z10) {
            if (org.telegram.messenger.bz.f23204v1 > 0 && bs0Var.G == null && !bs0Var.I && bs0Var.h.getFastScroll() != null && bs0Var.h.getFastScroll().f35895b0 && bs0Var.h.getFastScroll().getVisibility() == 0 && vs0VarArr[0].e() >= 50) {
                int i7 = org.telegram.messenger.bz.f23204v1;
                int i10 = i7 - 1;
                if (i7 != i10) {
                    org.telegram.messenger.bz.f23204v1 = i10;
                    org.telegram.messenger.t0.f26913b.getSharedPreferences("mainconfig", 0).edit().putInt("fastScrollHintCount", org.telegram.messenger.bz.f23204v1).apply();
                }
                bs0Var.I = true;
                Context context = bs0Var.getContext();
                bi.p2 p2Var = new bi.p2(context, 20);
                TextView textView = new TextView(context);
                org.telegram.messenger.n10.l(14.0f, 2131745213, 1, textView, null);
                textView.setMaxLines(3);
                int i11 = org.telegram.ui.ActionBar.n6.f29459gg;
                org.telegram.ui.ActionBar.u6.U(textView, i11, null);
                int L = org.telegram.messenger.g0.L(6.0f);
                int i12 = org.telegram.ui.ActionBar.n6.hg;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.x0(null, i12, false));
                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i12);
                p2Var.setBackground(d02);
                org.telegram.ui.ActionBar.u6.j(p2Var, d02, M, null, null);
                p2Var.addView(textView, c8.ma.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
                ?? view = new View(context);
                view.f34475a = new Random();
                Paint paint = new Paint(1);
                view.f34476b = paint;
                Paint paint2 = new Paint(1);
                view.f34477c = paint2;
                view.f34479f = 1.0f;
                view.h = 0.0f;
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i11, false), 76));
                paint2.setColor(org.telegram.ui.ActionBar.n6.x0(null, i11, false));
                Paint paint3 = new Paint();
                view.d = paint3;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint3.setShader(new LinearGradient(0.0f, org.telegram.messenger.g0.L(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint3.setXfermode(new PorterDuffXfermode(mode));
                Paint paint4 = new Paint();
                view.f34478e = paint4;
                paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
                paint4.setXfermode(new PorterDuffXfermode(mode));
                p2Var.addView((View) view, c8.ma.d(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                bs0Var.G = p2Var;
                bs0Var.addView(p2Var, c8.ma.c(-2.0f, -2));
                bs0Var.G.setAlpha(0.0f);
                bs0Var.G.setScaleX(0.8f);
                bs0Var.G.setScaleY(0.8f);
                bs0Var.G.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                bs0Var.invalidate();
                hn0 hn0Var2 = new hn0(4, bs0Var, p2Var);
                bs0Var.H = hn0Var2;
                org.telegram.messenger.g0.h3(hn0Var2, 4000L);
            }
        } else if (bs0Var.G != null && (hn0Var = bs0Var.H) != null) {
            org.telegram.messenger.g0.r(hn0Var);
            bs0Var.H.run();
            bs0Var.H = null;
            bs0Var.G = null;
        }
    }

    public void setHeaderEnabled(boolean z10) {
        org.telegram.ui.ActionBar.a5 a5Var = this.I;
        if (a5Var != null) {
            a5Var.setEnabled(z10);
        } else {
            this.H.setEnabled(z10);
        }
    }

    private void setPageOverscan(as0 as0Var) {
        if (this.f35578c2 && as0Var != null) {
            as0Var.j3 = true;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) as0Var.getLayoutParams();
            if (marginLayoutParams != null) {
                int i7 = marginLayoutParams.topMargin;
                int i10 = -this.f35584e2;
                if (i7 != i10 || marginLayoutParams.bottomMargin != (-this.f35588f2)) {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.bottomMargin = -this.f35588f2;
                    as0Var.setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    public void setSearchItemVisibility(int i7) {
        org.telegram.ui.ActionBar.r0 r0Var = this.f35617q0;
        if (r0Var == null) {
            return;
        }
        if (this.I != null) {
            R(true, true);
        } else {
            r0Var.setVisibility(i7);
        }
    }

    public static void t(gt0 gt0Var, int i7, boolean z10) {
        bs0[] bs0VarArr = gt0Var.f35609n0;
        if (bs0VarArr[0].F == i7) {
            return;
        }
        bs0 bs0Var = bs0VarArr[1];
        bs0Var.F = i7;
        bs0Var.setVisibility(0);
        gt0Var.w0();
        gt0Var.B1(true);
        gt0Var.f35602k1 = z10;
        gt0Var.Y0();
        gt0Var.E(!gt0Var.F0(i7));
        gt0Var.I1(true);
    }

    public static int x(gt0 gt0Var, v4.i0 i0Var) {
        if (i0Var == gt0Var.f35586f0) {
            return 8;
        }
        if (i0Var == gt0Var.f35592h0) {
            return 9;
        }
        for (ft0 ft0Var : gt0Var.f35607m2.values()) {
            if (ft0Var.f35166c == i0Var) {
                return ft0Var.f35164a;
            }
        }
        return -1;
    }

    public static int y(gt0 gt0Var, v4.i0 i0Var) {
        if (i0Var == gt0Var.f35589g0) {
            return 8;
        }
        if (i0Var == gt0Var.f35595i0) {
            return 9;
        }
        for (ft0 ft0Var : gt0Var.f35607m2.values()) {
            if (ft0Var.d == i0Var) {
                return ft0Var.f35164a;
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
        if (this.f35570a2 == null) {
            this.f35570a2 = new SpannableStringBuilder();
            if (B0()) {
                this.f35570a2.append((CharSequence) org.telegram.messenger.gd.M0(2131746507, null));
            } else {
                this.f35570a2.append((CharSequence) "c");
                this.f35570a2.setSpan(new lq(2131231146, 0), 0, 1, 33);
                this.f35570a2.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.gd.M0(2131744574, null));
            }
        }
        return this.f35570a2;
    }

    public boolean A0() {
        return false;
    }

    public final dt0 A1(int i7) {
        ft0 y12;
        if (i7 == 8) {
            return this.f35589g0;
        }
        if (i7 == 9) {
            return this.f35595i0;
        }
        if (!J0(i7) || (y12 = y1(i7)) == null) {
            return null;
        }
        return y12.d;
    }

    public final void B(fs0 fs0Var, org.telegram.ui.ActionBar.h2 h2Var, long j3, int i7) {
        String K;
        if (j3 > 0) {
            K = org.telegram.messenger.o10.o(org.telegram.messenger.mp.u1(h2Var.getCurrentAccount()).c2(Long.valueOf(j3)));
        } else {
            K = org.telegram.messenger.v3.K(org.telegram.messenger.mp.u1(h2Var.getCurrentAccount()).O0(Long.valueOf(-j3)), false);
        }
        if (K == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        com.google.android.gms.internal.vision.e2.r(sb2, org.telegram.messenger.mp.u1(h2Var.getCurrentAccount()).X2, "/", K, "/a/");
        sb2.append(i7);
        String sb3 = sb2.toString();
        fs0Var.i0(2131231758, new k7(this, sb3, h2Var, 25), org.telegram.messenger.gd.M0(2131744553, null), false, true);
    }

    public final boolean B0() {
        TLRPC.User c22;
        long j3 = this.f35606m1;
        if (j3 <= 0 || (c22 = org.telegram.messenger.mp.u1(this.f35642y1.getCurrentAccount()).c2(Long.valueOf(j3))) == null || !c22.bot) {
            return false;
        }
        return true;
    }

    public final void B1(boolean z10) {
        bs0[] bs0VarArr;
        bs0[] bs0VarArr2;
        org.telegram.ui.ActionBar.r0 r0Var;
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
        eq0 eq0Var = this.f35572b0;
        if (eq0Var != null) {
            eq0Var.i();
        }
        int i21 = 0;
        while (true) {
            bs0VarArr = this.f35609n0;
            if (i21 >= bs0VarArr.length) {
                break;
            }
            bs0VarArr[i21].h.C0();
            i21++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) bs0VarArr[z10 ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = org.telegram.messenger.g0.L(O0());
        layoutParams.rightMargin = 0;
        layoutParams.leftMargin = 0;
        v4.i0 adapter = bs0VarArr[z10 ? 1 : 0].h.getAdapter();
        v4.i0 i0Var = this.f35586f0;
        v4.z zVar = this.f35582e0;
        if (adapter == i0Var) {
            zVar.h(null);
        }
        boolean z21 = this.Y0;
        org.telegram.ui.ActionBar.a5 a5Var = this.I;
        vr0 vr0Var = this.G1;
        org.telegram.ui.ActionBar.k kVar = this.H;
        String str = "";
        org.telegram.ui.ActionBar.r0 r0Var2 = this.f35617q0;
        ps0 ps0Var = this.Q;
        int i22 = 100;
        if (z21 && this.X0) {
            bs0 bs0Var = bs0VarArr[z10 ? 1 : 0];
            if (bs0Var.f33770f == null) {
                bs0Var.f33770f = new v4.w0();
            }
            bs0 bs0Var2 = bs0VarArr[z10 ? 1 : 0];
            v4.w0 w0Var5 = bs0Var2.f33770f;
            ss0 ss0Var = this.V;
            zr0 zr0Var = this.m0;
            ds0 ds0Var = this.f35601k0;
            ds0 ds0Var2 = this.f35604l0;
            ds0 ds0Var3 = this.f35598j0;
            if (z10) {
                int i23 = bs0Var2.F;
                if (i23 != 0) {
                    w0Var4 = w0Var5;
                    if (i23 != 2 && i23 != 5 && i23 != 6 && (i23 != 7 || vr0Var.Y())) {
                        if (r0Var2 != null) {
                            str = r0Var2.getSearchField().getText().toString();
                        }
                        String str2 = str;
                        int i24 = bs0VarArr[z10 ? 1 : 0].F;
                        if (i24 == 1) {
                            if (ds0Var3 != null) {
                                ds0Var3.G(str2, false);
                                if (adapter != ds0Var3) {
                                    i1(adapter);
                                    bs0VarArr[z10 ? 1 : 0].h.setAdapter(ds0Var3);
                                }
                            }
                        } else if (i24 == 3) {
                            if (ds0Var2 != null) {
                                ds0Var2.G(str2, false);
                                if (adapter != ds0Var2) {
                                    i1(adapter);
                                    bs0VarArr[z10 ? 1 : 0].h.setAdapter(ds0Var2);
                                }
                            }
                        } else if (i24 == 4) {
                            if (ds0Var != null) {
                                ds0Var.G(str2, false);
                                if (adapter != ds0Var) {
                                    i1(adapter);
                                    bs0VarArr[z10 ? 1 : 0].h.setAdapter(ds0Var);
                                }
                            }
                        } else if (i24 == 7) {
                            if (zr0Var != null) {
                                zr0Var.F(str2, false);
                                if (adapter != zr0Var) {
                                    i1(adapter);
                                    bs0VarArr[z10 ? 1 : 0].h.setAdapter(zr0Var);
                                }
                            }
                        } else if (i24 == 11) {
                            if (ss0Var != null) {
                                ss0Var.E(this.Z0, str2);
                                if (adapter != ss0Var) {
                                    i1(adapter);
                                    bs0VarArr[z10 ? 1 : 0].h.setAdapter(ss0Var);
                                }
                            }
                        } else if (i24 == 15 && ps0Var != null && adapter != ps0Var) {
                            i1(adapter);
                            lq0 lq0Var = bs0VarArr[z10 ? 1 : 0].h;
                            ps0Var.f38547r = lq0Var;
                            lq0Var.setAdapter(ps0Var);
                        }
                    }
                }
                this.Y0 = false;
                ar0 ar0Var = this.M0;
                if (ar0Var != null) {
                    ar0Var.g(false);
                }
                this.X0 = false;
                B1(true);
                return;
            }
            w0Var4 = w0Var5;
            if (bs0Var2.h != null) {
                int i25 = bs0Var2.F;
                if (i25 == 1) {
                    if (adapter != ds0Var3) {
                        i1(adapter);
                        bs0VarArr[z10 ? 1 : 0].h.setAdapter(ds0Var3);
                    }
                    ds0Var3.f();
                } else if (i25 == 3) {
                    if (adapter != ds0Var2) {
                        i1(adapter);
                        bs0VarArr[z10 ? 1 : 0].h.setAdapter(ds0Var2);
                    }
                    ds0Var2.f();
                } else if (i25 == 4) {
                    if (adapter != ds0Var) {
                        i1(adapter);
                        bs0VarArr[z10 ? 1 : 0].h.setAdapter(ds0Var);
                    }
                    ds0Var.f();
                } else if (i25 == 7) {
                    if (adapter != zr0Var) {
                        i1(adapter);
                        bs0VarArr[z10 ? 1 : 0].h.setAdapter(zr0Var);
                    }
                    zr0Var.f();
                } else if (i25 == 11) {
                    if (adapter != ss0Var) {
                        i1(adapter);
                        bs0VarArr[z10 ? 1 : 0].h.setAdapter(ss0Var);
                    }
                    ss0Var.f();
                }
            }
            bs0VarArr2 = bs0VarArr;
            r0Var = r0Var2;
            w0Var3 = w0Var4;
            i11 = 4;
            z13 = false;
            z16 = false;
            i13 = 8;
        } else {
            bs0 bs0Var3 = bs0VarArr[z10 ? 1 : 0];
            if (bs0Var3.f33769e == null) {
                bs0Var3.f33769e = new v4.w0();
            }
            bs0 bs0Var4 = bs0VarArr[z10 ? 1 : 0];
            v4.w0 w0Var6 = bs0Var4.f33769e;
            bs0Var4.h.setPinnedHeaderShadowDrawable(null);
            int i26 = bs0VarArr[z10 ? 1 : 0].F;
            if (i26 == 8 || J0(i26)) {
                layoutParams.topMargin = org.telegram.messenger.g0.L(O0());
            }
            lq0 lq0Var2 = bs0VarArr[z10 ? 1 : 0].h;
            int paddingLeft = lq0Var2.getPaddingLeft();
            bs0 bs0Var5 = bs0VarArr[z10 ? 1 : 0];
            bs0VarArr2 = bs0VarArr;
            lq0 lq0Var3 = bs0Var5.h;
            int j02 = j0(bs0Var5.F);
            lq0Var3.f33442h3 = j02;
            int paddingRight = bs0VarArr2[z10 ? 1 : 0].h.getPaddingRight();
            lq0 lq0Var4 = bs0VarArr2[z10 ? 1 : 0].h;
            r0Var = r0Var2;
            int i02 = i0(I0());
            lq0Var4.f33443i3 = i02;
            lq0Var2.setPadding(paddingLeft, j02, paddingRight, i02);
            int i27 = bs0VarArr2[z10 ? 1 : 0].F;
            int[] iArr = this.f35615p1;
            v4.i0 i0Var2 = this.N;
            View view = this.f35568a0;
            rs0 rs0Var = this.U;
            ur0 ur0Var = this.S;
            or0 or0Var = this.W;
            vs0[] vs0VarArr = this.f35636w1;
            if (i27 == 0) {
                v4.i0 i0Var3 = this.K;
                if (adapter != i0Var3) {
                    i1(adapter);
                    bs0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var3);
                }
                int i28 = -org.telegram.messenger.g0.L(1.0f);
                layoutParams.rightMargin = i28;
                layoutParams.leftMargin = i28;
                vs0 vs0Var = vs0VarArr[0];
                if (vs0Var.h && !vs0Var.f41415e.isEmpty()) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                i22 = iArr[0];
                bs0VarArr2[z10 ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.B0);
                vs0 vs0Var2 = vs0VarArr[0];
                if (vs0Var2.f41432x == null) {
                    vs0Var2.f41432x = new v4.w0();
                }
                w0Var = vs0VarArr[0].f41432x;
                z13 = z19;
                z11 = false;
            } else {
                if (i27 == 1) {
                    vs0 vs0Var3 = vs0VarArr[1];
                    if (vs0Var3.h && !vs0Var3.f41415e.isEmpty()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (adapter != i0Var2) {
                        i1(adapter);
                        bs0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var2);
                    }
                } else if (i27 == 2) {
                    vs0 vs0Var4 = vs0VarArr[2];
                    if (vs0Var4.h && !vs0Var4.f41415e.isEmpty()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    v4.i0 i0Var4 = this.O;
                    if (adapter != i0Var4) {
                        i1(adapter);
                        bs0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var4);
                    }
                } else {
                    if (i27 == 3) {
                        v4.i0 i0Var5 = this.M;
                        if (adapter != i0Var5) {
                            i1(adapter);
                            bs0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var5);
                        }
                    } else if (i27 == 4) {
                        vs0 vs0Var5 = vs0VarArr[4];
                        if (vs0Var5.h && !vs0Var5.f41415e.isEmpty()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        v4.i0 i0Var6 = this.P;
                        if (adapter != i0Var6) {
                            i1(adapter);
                            bs0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var6);
                        }
                    } else {
                        if (i27 == 5) {
                            v4.i0 i0Var7 = this.R;
                            if (adapter != i0Var7) {
                                i1(adapter);
                                bs0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var7);
                            }
                        } else if (i27 == 15) {
                            if (adapter != ps0Var) {
                                i1(adapter);
                                lq0 lq0Var5 = bs0VarArr2[z10 ? 1 : 0].h;
                                ps0Var.f38547r = lq0Var5;
                                lq0Var5.setAdapter(ps0Var);
                            }
                        } else if (i27 == 6) {
                            if (adapter != ur0Var) {
                                i1(adapter);
                                bs0VarArr2[z10 ? 1 : 0].h.setAdapter(ur0Var);
                            }
                        } else if (i27 == 7) {
                            v4.i0 i0Var8 = this.f35579d0;
                            if (adapter != i0Var8) {
                                i1(adapter);
                                bs0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var8);
                            }
                        } else if (z0(i27)) {
                            v4.i0 z110 = z1(bs0VarArr2[z10 ? 1 : 0].F);
                            if (adapter != z110) {
                                i1(adapter);
                                bs0VarArr2[z10 ? 1 : 0].h.setAdapter(z110);
                                bs0VarArr2[z10 ? 1 : 0].h.getClass();
                            }
                            bs0 bs0Var6 = bs0VarArr2[z10 ? 1 : 0];
                            if (bs0Var6.F != 9) {
                                zVar.h(bs0Var6.h);
                            }
                            i22 = iArr[1];
                        } else {
                            int i29 = bs0VarArr2[z10 ? 1 : 0].F;
                            if (i29 == 10) {
                                v4.i0 i0Var9 = this.T;
                                if (adapter != i0Var9) {
                                    i1(adapter);
                                    bs0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var9);
                                }
                            } else if (i29 == 11) {
                                if (adapter != rs0Var) {
                                    i1(adapter);
                                    bs0VarArr2[z10 ? 1 : 0].h.setAdapter(rs0Var);
                                    v4.z zVar2 = rs0Var.f39298w;
                                    lq0 lq0Var6 = bs0VarArr2[z10 ? 1 : 0].h;
                                    rs0Var.f39297s = lq0Var6;
                                    zVar2.h(lq0Var6);
                                }
                                w0Var = rs0Var.f39296r;
                                z11 = true;
                                z13 = false;
                            } else if (i29 == 12) {
                                if (adapter != null) {
                                    i1(adapter);
                                    bs0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (or0Var.getParent() != bs0VarArr2[z10 ? 1 : 0]) {
                                    org.telegram.messenger.g0.E2(or0Var);
                                    bs0VarArr2[z10 ? 1 : 0].addView(or0Var, c8.ma.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
                                    p1(org.telegram.messenger.g0.L(56.0f) + this.d2, or0Var);
                                }
                            } else if (i29 == 13) {
                                if (adapter != null) {
                                    i1(adapter);
                                    bs0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != bs0VarArr2[z10 ? 1 : 0]) {
                                    org.telegram.messenger.g0.E2(view);
                                    bs0VarArr2[z10 ? 1 : 0].addView(view);
                                    p1(this.d2, view);
                                }
                            } else if (i29 == 14) {
                                if (adapter != null) {
                                    i1(adapter);
                                    bs0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (eq0Var != null && eq0Var.getParent() != bs0VarArr2[z10 ? 1 : 0]) {
                                    org.telegram.messenger.g0.E2(eq0Var);
                                    bs0VarArr2[z10 ? 1 : 0].addView(eq0Var);
                                    bs0VarArr2[z10 ? 1 : 0].f33774w.setVisibility(4);
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
            K1(bs0VarArr2[z10 ? 1 : 0]);
            if (z11) {
                bs0VarArr2[z10 ? 1 : 0].h.setSections(false);
                w0Var2 = w0Var;
            } else {
                lq0 lq0Var7 = bs0VarArr2[z10 ? 1 : 0].h;
                lq0Var7.getClass();
                w0Var2 = w0Var;
                org.telegram.ui.ActionBar.u6.l(lq0Var7, 20, org.telegram.ui.ActionBar.n6.f29486i6, lq0Var7.f34074o2);
                lq0Var7.U2 = false;
                lq0Var7.I2 = null;
                lq0Var7.J2 = null;
                lq0Var7.M2 = 0.0f;
                lq0Var7.N2 = null;
                lq0Var7.O2 = null;
                lq0Var7.K2 = null;
                mj0 mj0Var = lq0Var7.H2;
                if (mj0Var != null) {
                    lq0Var7.q0(mj0Var);
                    lq0Var7.H2 = null;
                }
                v9 v9Var = lq0Var7.S2;
                if (v9Var != null) {
                    lq0Var7.q0(v9Var);
                    lq0Var7.S2 = null;
                }
            }
            J1(bs0VarArr2[z10 ? 1 : 0]);
            bs0 bs0Var7 = bs0VarArr2[z10 ? 1 : 0];
            if (bs0Var7.F == 11) {
                bs0Var7.h.setItemAnimator(bs0Var7.d);
            } else {
                bs0Var7.h.setItemAnimator(null);
                if (rs0Var != null && bs0VarArr2[z10 ? 1 : 0].h == rs0Var.f39297s) {
                    v4.z zVar3 = rs0Var.f39298w;
                    rs0Var.f39297s = null;
                    zVar3.h(null);
                }
            }
            if (or0Var != null && bs0VarArr2[z10 ? 1 : 0].F != 12 && or0Var.getParent() == bs0VarArr2[z10 ? 1 : 0]) {
                or0Var.f46944a.onRemoveFromParent();
                bs0VarArr2[z10 ? 1 : 0].removeView(or0Var);
            }
            if (view != null && bs0VarArr2[z10 ? 1 : 0].F != 13) {
                ViewParent parent = view.getParent();
                bs0 bs0Var8 = bs0VarArr2[z10 ? 1 : 0];
                if (parent == bs0Var8) {
                    bs0Var8.removeView(view);
                }
            }
            if (eq0Var != null && bs0VarArr2[z10 ? 1 : 0].F != 14) {
                ViewParent parent2 = eq0Var.getParent();
                bs0 bs0Var9 = bs0VarArr2[z10 ? 1 : 0];
                if (parent2 == bs0Var9) {
                    bs0Var9.removeView(eq0Var);
                }
            }
            int i30 = bs0VarArr2[z10 ? 1 : 0].F;
            if (i30 != 0 && i30 != 11 && !z0(i30) && (i16 = bs0VarArr2[z10 ? 1 : 0].F) != 2 && i16 != 5 && i16 != 6 && ((i16 != 7 || vr0Var.Y()) && (i17 = bs0VarArr2[z10 ? 1 : 0].F) != 10 && i17 != 13 && i17 != 14)) {
                if (z10) {
                    if (r0Var != null && r0Var.getVisibility() == 4) {
                        if (a5Var != null) {
                            z18 = a5Var.G;
                        } else {
                            z18 = kVar.f29086o0;
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
                            this.f35621r0 = l0(f10);
                            M1(1.0f - f10);
                            z17 = false;
                        }
                    }
                    z17 = false;
                    this.A0 = 0;
                    this.f35621r0 = 1.0f;
                } else {
                    z17 = false;
                    if (r0Var != null && r0Var.getVisibility() == 4) {
                        if (I()) {
                            this.A0 = 0;
                            this.f35621r0 = 1.0f;
                            setSearchItemVisibility(0);
                        } else {
                            if (I0()) {
                                i18 = 8;
                            } else {
                                i18 = 4;
                            }
                            setSearchItemVisibility(i18);
                            this.f35621r0 = 0.0f;
                        }
                    }
                }
                I1(z17);
            } else if (z10) {
                this.A0 = 2;
            } else {
                this.A0 = 0;
                if (r0Var != null) {
                    if (!I0() && !this.Y0) {
                        i7 = 4;
                    } else {
                        i7 = 8;
                    }
                    setSearchItemVisibility(i7);
                }
            }
            int i31 = bs0VarArr2[z10 ? 1 : 0].F;
            if (i31 == 6) {
                if (!ur0Var.f40405e && !ur0Var.h && ur0Var.d.isEmpty()) {
                    ur0Var.E(0L);
                }
            } else if (i31 != 7) {
                if (z0(i31)) {
                    dt0 z111 = z1(bs0VarArr2[z10 ? 1 : 0].F);
                    if (z111 != null) {
                        fi.h6 h6Var = z111.f34504s;
                        z111.P();
                        xq0 xq0Var = bs0VarArr2[z10 ? 1 : 0].f33774w;
                        if (h6Var != null && (h6Var.k() || (t0() && h6Var.g() > 0))) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        xq0Var.e(z14, z10);
                        if (h6Var != null && h6Var.g() > 0 && !G0()) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z13 = z15;
                    }
                } else {
                    int i32 = bs0VarArr2[z10 ? 1 : 0].F;
                    if (i32 != 10 && i32 != 11 && i32 != 12 && i32 != 13 && i32 != 14) {
                        if (i32 == 15) {
                            i32 = 8;
                        }
                        vs0 vs0Var6 = vs0VarArr[i32];
                        if (!vs0Var6.f41417g && !vs0Var6.f41418i[0] && vs0Var6.f41412a.isEmpty()) {
                            vs0VarArr[i32].f41417g = true;
                            i0Var2.f();
                            if (i32 == 0) {
                                int i33 = vs0VarArr[0].f41426q;
                                if (i33 == 1) {
                                    i10 = 6;
                                } else if (i33 == 2) {
                                    i10 = 7;
                                }
                                org.telegram.ui.ActionBar.h2 h2Var = this.f35642y1;
                                h2Var.getMediaDataController().Q0(this.f35606m1, 50, 0, 0, i10, this.G, 1, h2Var.getClassGuid(), vs0VarArr[i10].f41425p, null, null);
                            }
                            i10 = i32;
                            org.telegram.ui.ActionBar.h2 h2Var2 = this.f35642y1;
                            h2Var2.getMediaDataController().Q0(this.f35606m1, 50, 0, 0, i10, this.G, 1, h2Var2.getClassGuid(), vs0VarArr[i10].f41425p, null, null);
                        }
                    }
                }
            }
            int i34 = bs0VarArr2[z10 ? 1 : 0].F;
            if (i34 == 8 || J0(i34)) {
                i11 = 4;
                bs0 bs0Var10 = bs0VarArr2[z10 ? 1 : 0];
                xq0 xq0Var2 = bs0Var10.f33774w;
                boolean J0 = J0(bs0Var10.F);
                int w12 = w1(bs0VarArr2[z10 ? 1 : 0].F);
                q9 q9Var = xq0Var2.f36894b;
                hi.d dVar = xq0Var2.f36897f;
                if (!J0 && !H0() && !B0()) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                q9Var.setVisibility(i12);
                if (J0) {
                    dVar.setVisibility(0);
                    dVar.h(org.telegram.messenger.gd.M0(2131744570, null), false);
                    i13 = 8;
                } else if (H0()) {
                    i13 = 8;
                    dVar.setVisibility(8);
                } else {
                    i13 = 8;
                    xq0Var2.setStickerType(11);
                    if (!G0()) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                    dVar.setVisibility(i14);
                    dVar.h(A(), false);
                }
                if (J0) {
                    xq0Var2.d.setText(org.telegram.messenger.gd.M0(2131744548, null));
                    xq0Var2.f36896e.setText(org.telegram.messenger.gd.M0(2131744549, null));
                } else {
                    xh.l lVar = xq0Var2.d;
                    if (!G0()) {
                        if (I0()) {
                            i15 = 2131747984;
                        } else {
                            i15 = 2131747955;
                        }
                    } else {
                        i15 = 2131748012;
                    }
                    lVar.setText(org.telegram.messenger.gd.M0(i15, null));
                    k80 k80Var = xq0Var2.f36896e;
                    if (I0()) {
                        str = org.telegram.messenger.gd.M0(2131747956, null);
                    }
                    k80Var.setText(str);
                }
                dVar.setOnClickListener(new bi.j5(this, J0, w12, 1));
            } else {
                bs0 bs0Var11 = bs0VarArr2[z10 ? 1 : 0];
                if (bs0Var11.F == 9) {
                    if (H0()) {
                        bs0VarArr2[z10 ? 1 : 0].f33774w.f36894b.setVisibility(8);
                        bs0VarArr2[z10 ? 1 : 0].f33774w.f36897f.setVisibility(8);
                    } else {
                        bs0VarArr2[z10 ? 1 : 0].f33774w.f36894b.setVisibility(0);
                        bs0VarArr2[z10 ? 1 : 0].f33774w.setStickerType(11);
                        bs0VarArr2[z10 ? 1 : 0].f33774w.f36897f.setVisibility(0);
                        bs0VarArr2[z10 ? 1 : 0].f33774w.f36897f.h(A(), false);
                    }
                    bs0VarArr2[z10 ? 1 : 0].f33774w.d.setText(org.telegram.messenger.gd.M0(2131748054, null));
                    k80 k80Var2 = bs0VarArr2[z10 ? 1 : 0].f33774w.f36896e;
                    if (I0()) {
                        str = org.telegram.messenger.gd.M0(2131748055, null);
                    }
                    k80Var2.setText(str);
                    i11 = 4;
                    bs0VarArr2[z10 ? 1 : 0].f33774w.f36897f.setOnClickListener(new gp0(this, 4));
                    i13 = 8;
                } else {
                    i11 = 4;
                    bs0Var11.f33774w.f36894b.setVisibility(0);
                    bs0VarArr2[z10 ? 1 : 0].f33774w.setStickerType(1);
                    bs0VarArr2[z10 ? 1 : 0].f33774w.d.setText(org.telegram.messenger.gd.M0(2131747975, null));
                    bs0VarArr2[z10 ? 1 : 0].f33774w.f36896e.setText(org.telegram.messenger.gd.M0(2131745612, null));
                    i13 = 8;
                    bs0VarArr2[z10 ? 1 : 0].f33774w.f36897f.setVisibility(8);
                }
            }
            z16 = false;
            bs0VarArr2[z10 ? 1 : 0].h.setVisibility(0);
            w0Var3 = w0Var2;
        }
        int i35 = i22;
        bs0 bs0Var12 = bs0VarArr2[z10 ? 1 : 0];
        bs0Var12.f33767b = z13;
        F1(bs0Var12, z16);
        bs0VarArr2[z10 ? 1 : 0].f33775x.y1(i35);
        bs0VarArr2[z10 ? 1 : 0].h.a0();
        if (w0Var3 != null) {
            bs0VarArr2[z10 ? 1 : 0].h.setRecycledViewPool(w0Var3);
            bs0VarArr2[z10 ? 1 : 0].f33771n.setRecycledViewPool(w0Var3);
        }
        if (this.A0 == 2) {
            if (a5Var != null) {
                z20 = a5Var.G;
            } else {
                z20 = kVar.f29086o0;
            }
            if (z20) {
                this.C0 = true;
                if (a5Var != null) {
                    a5Var.o(true);
                } else {
                    kVar.o(true);
                }
                this.A0 = 0;
                this.f35621r0 = 0.0f;
                if (r0Var != null) {
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

    public final void C(fs0 fs0Var) {
        float f10;
        final View[] viewArr = {fs0Var.i0(2131232440, new Runnable(this) {
            public final gt0 f41386b;

            {
                this.f41386b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        gt0 gt0Var = this.f41386b;
                        gt0Var.getClass();
                        View[] viewArr2 = viewArr;
                        gt0Var.Q1(viewArr2[0], viewArr2[1]);
                        return;
                    default:
                        gt0 gt0Var2 = this.f41386b;
                        gt0Var2.getClass();
                        View[] viewArr3 = viewArr;
                        gt0Var2.R1(viewArr3[0], viewArr3[1]);
                        return;
                }
            }
        }, org.telegram.messenger.gd.M0(2131748458, null), false, false), fs0Var.i0(2131232441, new Runnable(this) {
            public final gt0 f41386b;

            {
                this.f41386b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        gt0 gt0Var = this.f41386b;
                        gt0Var.getClass();
                        View[] viewArr2 = viewArr;
                        gt0Var.Q1(viewArr2[0], viewArr2[1]);
                        return;
                    default:
                        gt0 gt0Var2 = this.f41386b;
                        gt0Var2.getClass();
                        View[] viewArr3 = viewArr;
                        gt0Var2.R1(viewArr3[0], viewArr3[1]);
                        return;
                }
            }
        }, org.telegram.messenger.gd.M0(2131748457, null), false, false)};
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
        org.telegram.ui.ActionBar.h2 h2Var;
        if (this.f35590g1 != null && (h2Var = this.f35642y1) != null) {
            return org.telegram.messenger.v3.V(h2Var.getMessagesController().O0(Long.valueOf(this.f35590g1.f28404id)));
        }
        return false;
    }

    public final void C1(org.telegram.ui.ActionBar.z0 z0Var, org.telegram.ui.ActionBar.z0 z0Var2, Runnable runnable) {
        if (this.L1) {
            return;
        }
        if (!z0Var2.getCheckView().f37598a.f32838q && z0Var.getCheckView().f37598a.f32838q) {
            float f10 = -this.f35633v1;
            this.f35633v1 = f10;
            org.telegram.messenger.g0.E3(f10, z0Var, null);
            return;
        }
        z0Var.setChecked(!z0Var.getCheckView().f37598a.f32838q);
        runnable.run();
    }

    public final void D(as0 as0Var, int i7, SparseBooleanArray sparseBooleanArray) {
        int childCount = as0Var.getChildCount();
        wz wzVar = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = as0Var.getChildAt(i10);
            if (childAt instanceof wz) {
                wzVar = childAt;
            }
        }
        if (wzVar != null) {
            as0Var.removeView(wzVar);
        }
        getViewTreeObserver().addOnPreDrawListener(new ir0(this, as0Var, sparseBooleanArray, wzVar, i7));
    }

    public final boolean D0() {
        int i7 = 0;
        while (true) {
            bs0[] bs0VarArr = this.f35609n0;
            if (i7 >= bs0VarArr.length) {
                return false;
            }
            bs0 bs0Var = bs0VarArr[i7];
            if (bs0Var != null) {
                lq0 lq0Var = bs0Var.h;
                if (lq0Var == null || !lq0Var.c0()) {
                    as0 as0Var = bs0VarArr[i7].f33771n;
                    if (as0Var != null && as0Var.c0()) {
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
                int s02 = s0(org.telegram.ui.ActionBar.n6.f29788y8);
                int s03 = s0(org.telegram.ui.ActionBar.n6.f29807z8);
                if (s02 != this.f35623r2 || s03 != this.f35627s2) {
                    this.f35623r2 = s02;
                    this.f35627s2 = s03;
                    org.telegram.ui.ActionBar.r0[] r0VarArr = {this.f35638x0, this.f35635w0, this.f35641y0, this.f35643z0, this.f35611o0};
                    for (int i7 = 0; i7 < 5; i7++) {
                        org.telegram.ui.ActionBar.r0 r0Var = r0VarArr[i7];
                        if (r0Var != null) {
                            r0Var.setIconColor(s02);
                            if (r0Var.getBackground() != null) {
                                org.telegram.ui.ActionBar.n6.H1(r0Var.getBackground(), s03, true);
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
        ph0 ph0Var = this.f35632v0;
        if (ph0Var != null && this.Z1 != z10) {
            this.Z1 = z10;
            if (!z10 && ph0Var.getAnimatedDrawable().f37482b0 < 20) {
                ph0Var.getAnimatedDrawable().P(0);
            } else {
                mh0 animatedDrawable = ph0Var.getAnimatedDrawable();
                if (this.Z1) {
                    i7 = 50;
                } else {
                    i7 = 100;
                }
                animatedDrawable.P(i7);
            }
            ph0Var.getAnimatedDrawable().start();
        }
    }

    public final boolean E0() {
        eq0 eq0Var = this.f35572b0;
        if (eq0Var == null || !eq0Var.g()) {
            hq0 hq0Var = this.f35576c0;
            if (hq0Var != null && hq0Var.f50340f) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void E1() {
        if (D0()) {
            post(new fp0(this, 13));
            return;
        }
        nr0 nr0Var = this.K;
        if (nr0Var != null) {
            nr0Var.f();
        }
        ts0 ts0Var = this.N;
        if (ts0Var != null) {
            ts0Var.f();
        }
        ts0 ts0Var2 = this.O;
        if (ts0Var2 != null) {
            ts0Var2.f();
        }
        us0 us0Var = this.M;
        if (us0Var != null) {
            us0Var.X(false);
        }
        ts0 ts0Var3 = this.P;
        if (ts0Var3 != null) {
            ts0Var3.f();
        }
        ps0 ps0Var = this.Q;
        if (ps0Var != null) {
            ps0Var.f();
        }
        wr0 wr0Var = this.R;
        if (wr0Var != null) {
            wr0Var.f();
        }
        qr0 qr0Var = this.f35586f0;
        if (qr0Var != null) {
            qr0Var.f();
        }
        for (ft0 ft0Var : this.f35607m2.values()) {
            ft0Var.f35166c.f();
        }
    }

    public final void F(int i7) {
        int i10;
        bs0 g02 = g0(this.f35626s1);
        this.f35624s = -1;
        if (g02 != null) {
            g02.h.C0();
            this.f35629t1 = i7;
            g02.f33771n.setVisibility(0);
            if (z0(this.f35626s1)) {
                g02.f33771n.setAdapter(A1(this.f35626s1));
            } else {
                g02.f33771n.setAdapter(this.L);
            }
            as0 as0Var = g02.f33771n;
            int paddingLeft = as0Var.getPaddingLeft();
            as0 as0Var2 = g02.f33771n;
            int j02 = j0(g02.F);
            as0Var2.f33442h3 = j02;
            int paddingRight = g02.f33771n.getPaddingRight();
            as0 as0Var3 = g02.f33771n;
            int i02 = i0(I0());
            as0Var3.f33443i3 = i02;
            as0Var.setPadding(paddingLeft, j02, paddingRight, i02);
            g02.f33772r.y1(i7);
            g02.f33771n.a0();
            int i11 = 0;
            while (true) {
                bs0[] bs0VarArr = this.f35609n0;
                if (i11 >= bs0VarArr.length) {
                    break;
                }
                bs0 bs0Var = bs0VarArr[i11];
                if (bs0Var != null && ((i10 = bs0Var.F) == 0 || z0(i10))) {
                    org.telegram.messenger.g0.Z3(bs0VarArr[i11].h);
                }
                i11++;
            }
            this.f35622r1 = true;
            if (this.f35626s1 == 0) {
                this.f35636w1[0].g(true);
            }
            this.f35618q1 = 0.0f;
            j1();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.M1.d();
            ofFloat.addUpdateListener(new cr0(this, g02, 1));
            ofFloat.addListener(new ki.i2(this, z0(g02.F) ? 1 : 0, i7, 2));
            ofFloat.setInterpolator(lr.f37208f);
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

    public final void F1(bs0 bs0Var, boolean z10) {
        boolean z11;
        Integer num = 1;
        int i7 = 0;
        if (bs0Var.f33767b && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        hj0 fastScroll = bs0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = bs0Var.f33768c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            bs0Var.f33768c.cancel();
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
            bs0Var.f33768c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(num);
        } else if (!z11 && fastScroll.getTag() != null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, property, fastScroll.getAlpha(), 0.0f);
            ofFloat2.addListener(new org.telegram.ui.on(fastScroll));
            bs0Var.f33768c = ofFloat2;
            ofFloat2.setDuration(150L).start();
            fastScroll.animate().setListener(null).cancel();
            fastScroll.setTag(null);
        }
    }

    public final void G() {
        int i7 = this.d2;
        int i10 = this.f35616p2;
        p1((org.telegram.messenger.g0.L(6.666f) + i7) - f35566w2, this.S0);
        int i11 = i7 + i10;
        p1(i11, this.L0);
        p1(i11, this.E0);
        p1(org.telegram.messenger.g0.L(52.0f) + i7 + i10, this.N0);
        p1(org.telegram.messenger.g0.L(4.0f) + i7 + i10, this.M0);
        p1(org.telegram.messenger.g0.L(48.0f) + i7 + i10, this.f35576c0);
        if (this.f35605l2 != i10) {
            this.f35605l2 = i10;
            Runnable runnable = this.f35603k2;
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
        org.telegram.ui.ActionBar.r0 r0Var = this.f35635w0;
        if (r0Var != null) {
            if (!this.f35642y1.getMessagesController().G2(this.f35606m1) && !u0()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                f10 = 0.5f;
            } else {
                f10 = 1.0f;
            }
            r0Var.setAlpha(f10);
            if (z10 && r0Var.getBackground() != null) {
                r0Var.setBackground(null);
            } else if (!z10 && r0Var.getBackground() == null) {
                int i7 = org.telegram.ui.ActionBar.n6.f29807z8;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(s0(i7), 5, -1);
                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
                r0Var.setBackground(h02);
                org.telegram.ui.ActionBar.u6.j(r0Var, h02, null, M, this.I1);
            }
        }
    }

    public final boolean H() {
        boolean B0 = B0();
        long j3 = this.f35606m1;
        org.telegram.ui.ActionBar.h2 h2Var = this.f35642y1;
        if (B0) {
            TLRPC.User c22 = org.telegram.messenger.mp.u1(h2Var.getCurrentAccount()).c2(Long.valueOf(j3));
            if (c22 == null || !c22.bot || !c22.bot_can_edit) {
                return false;
            }
            return true;
        } else if (!I0()) {
            if (h2Var == null || !h2Var.getMessagesController().R1().h(j3)) {
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
        eq0 eq0Var = this.f35572b0;
        if (eq0Var != null) {
            int L = org.telegram.messenger.g0.L(48.0f) + this.d2;
            cs csVar = this.S0;
            if (csVar != null) {
                i7 = (int) csVar.d(org.telegram.messenger.g0.L(7.0f));
            } else {
                i7 = 0;
            }
            eq0Var.setPaddingTop(L + i7);
        }
    }

    public boolean I() {
        return !(this instanceof z20);
    }

    public boolean I0() {
        return false;
    }

    public final void I1(boolean z10) {
        eq0 eq0Var;
        hq0 hq0Var;
        boolean z11 = true;
        R(true, true);
        ph0 ph0Var = this.f35632v0;
        if (ph0Var == null) {
            return;
        }
        float f10 = 0.0f;
        if (!this.Y0 && (((eq0Var = this.f35572b0) == null || !eq0Var.g()) && ((hq0Var = this.f35576c0) == null || !hq0Var.f50340f))) {
            f10 = Utilities.i(this.f35621r0 + this.f35625s0, 1.0f, 0.0f);
        }
        ph0Var.setAlpha(f10);
        if (z10) {
            if (k0(1.0f) <= 0.5f) {
                z11 = false;
            }
            E(z11);
        } else if (this.A0 == 2) {
            if (this.f35625s0 <= 0.1f) {
                z11 = false;
            }
            E(z11);
        } else {
            if (this.f35621r0 >= 0.1f) {
                z11 = false;
            }
            E(z11);
        }
    }

    public final boolean J() {
        bs0 bs0Var;
        bs0[] bs0VarArr = this.f35609n0;
        if (bs0VarArr != null && (bs0Var = bs0VarArr[0]) != null) {
            boolean z02 = z0(bs0Var.F);
            int i7 = this.f35615p1[z02 ? 1 : 0];
            if (i7 != h0(z02 ? 1 : 0, i7, true)) {
                return true;
            }
        }
        return false;
    }

    public final void J1(bs0 bs0Var) {
        boolean z10;
        boolean b12 = bs0Var.h.b1();
        if (b12) {
            bs0Var.h.setSectionsDrawBackground(this.f35578c2);
        }
        if (this.f35578c2 && !b12 && bs0Var.F != 15) {
            z10 = true;
        } else {
            z10 = false;
        }
        bs0Var.setDrawPageBackground(z10);
        if (bs0Var.F == 15) {
            Drawable drawable = bs0Var.P;
            if (drawable == null) {
                drawable = bs0Var.getBackground();
            }
            Drawable e10 = hi.w5.e(drawable, this.f35642y1.getCurrentAccount(), this.f35606m1, org.telegram.ui.ActionBar.n6.I.q());
            if (!this.f35578c2) {
                bs0Var.setWallpaper(null);
                bs0Var.setBackground(e10);
                bs0Var.setOutlineProvider(new bg.q0(15));
                bs0Var.setClipToOutline(true);
                return;
            }
            bs0Var.setBackground(null);
            bs0Var.setClipToOutline(false);
            bs0Var.setWallpaper(e10);
            return;
        }
        bs0Var.setClipToOutline(false);
        bs0Var.setBackground(null);
        bs0Var.setWallpaper(null);
    }

    public final boolean K() {
        bs0 bs0Var;
        bs0[] bs0VarArr = this.f35609n0;
        if (bs0VarArr == null || (bs0Var = bs0VarArr[0]) == null) {
            return false;
        }
        if (this.n1 && z0(bs0Var.F)) {
            return false;
        }
        boolean z02 = z0(bs0VarArr[0].F);
        int i7 = this.f35615p1[z02 ? 1 : 0];
        if (i7 == h0(z02 ? 1 : 0, i7, false)) {
            return false;
        }
        return true;
    }

    public final boolean K0() {
        if (!H() || ((getClosestTab() != 8 && getClosestTab() != 13 && !J0(getClosestTab())) || !this.F1)) {
            eq0 eq0Var = this.f35572b0;
            if (eq0Var == null || !eq0Var.g()) {
                hq0 hq0Var = this.f35576c0;
                if ((hq0Var == null || !hq0Var.f50340f) && !this.f35622r1 && !this.f35599j1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void K1(bs0 bs0Var) {
        boolean z10;
        float f10;
        int i7;
        float f11;
        float f12;
        int i10 = bs0Var.F;
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
        d.topMargin = n0(bs0Var.F) + d.topMargin;
        ViewGroup.LayoutParams layoutParams = bs0Var.f33773s.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2.leftMargin == d.leftMargin && layoutParams2.topMargin == d.topMargin && layoutParams2.rightMargin == d.rightMargin && layoutParams2.bottomMargin == d.bottomMargin && layoutParams2.gravity == d.gravity) {
                return;
            }
        }
        bs0Var.f33773s.setLayoutParams(d);
    }

    public final void L(Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        bs0[] bs0VarArr;
        ck0 ck0Var;
        dq0 dq0Var;
        or0 or0Var;
        eq0 eq0Var;
        View[] viewPages;
        for (bs0 bs0Var : this.f35609n0) {
            if (bs0Var != null && bs0Var.getVisibility() == 0) {
                if (bs0Var.P != null) {
                    RectF rectF2 = this.f35600j2;
                    if (jh.k.c(bs0Var, viewGroup, rectF2)) {
                        canvas.save();
                        canvas.translate(rectF2.left, rectF2.top);
                        bs0Var.h(canvas);
                        canvas.restore();
                    }
                }
                if (bs0Var.F == 14 && (eq0Var = this.f35572b0) != null && eq0Var.getParent() == bs0Var) {
                    for (View view : eq0Var.h.getViewPages()) {
                        if ((view instanceof bi.j6) && view.getVisibility() == 0) {
                            bi.c6 c6Var = ((bi.j6) view).f3760f;
                            ih.d.a(c6Var, canvas, rectF, c6Var, viewGroup);
                        }
                    }
                } else {
                    if (bs0Var.F == 12 && (or0Var = this.W) != null && or0Var.getParent() == bs0Var) {
                        ck0Var = or0Var.f46944a.A0;
                    } else if (bs0Var.F == 13 && (dq0Var = this.f35568a0) != null && dq0Var.getParent() == bs0Var) {
                        ck0Var = dq0Var.getCurrentListView();
                    } else {
                        ck0Var = bs0Var.h;
                    }
                    if (ck0Var != null && ck0Var.getVisibility() == 0) {
                        ih.d.a(ck0Var, canvas, rectF, ck0Var, viewGroup);
                    }
                }
            }
        }
    }

    public final void L0(int i7, int i10, int i11, boolean z10) {
        vs0[] vs0VarArr = this.f35636w1;
        vs0VarArr[i7].f41412a.clear();
        vs0VarArr[i7].f41413b[0].clear();
        vs0VarArr[i7].f41413b[1].clear();
        vs0 vs0Var = vs0VarArr[i7];
        vs0Var.f41419j[0] = i10;
        vs0Var.f41418i[0] = false;
        vs0Var.f41421l = false;
        vs0Var.f41422m = i11;
        vs0Var.f41423n = (vs0Var.e() - i11) - 1;
        vs0 vs0Var2 = vs0VarArr[i7];
        if (vs0Var2.f41423n < 0) {
            vs0Var2.f41423n = 0;
        }
        vs0Var2.f41420k = i10;
        vs0Var2.f41424o = true;
        vs0Var2.f41417g = false;
        vs0Var2.f41425p++;
        bs0 g02 = g0(i7);
        if (g02 != null && g02.h.getAdapter() != null) {
            g02.h.getAdapter().f();
        }
        if (z10) {
            int i12 = 0;
            while (true) {
                bs0[] bs0VarArr = this.f35609n0;
                if (i12 < bs0VarArr.length) {
                    bs0 bs0Var = bs0VarArr[i12];
                    if (bs0Var.F == i7) {
                        bs0Var.f33775x.h1(Math.min(vs0VarArr[i7].e() - 1, vs0VarArr[i7].f41422m), 0);
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
            bs0[] bs0VarArr = this.f35609n0;
            if (i7 < bs0VarArr.length) {
                int childCount = bs0VarArr[i7].h.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = bs0VarArr[i7].h.getChildAt(i10);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gt0.M():void");
    }

    public final void M0(boolean z10) {
        long j3 = this.G;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i7 == 0 && !G0()) {
            for (int i10 = 0; i10 < 4; i10++) {
                int i11 = f35563t2[i10];
                vs0[] vs0VarArr = this.f35636w1;
                if (!vs0VarArr[i11].h || z10) {
                    long j10 = this.f35606m1;
                    if (!org.telegram.messenger.n5.C(j10)) {
                        vs0VarArr[i11].h = false;
                        TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
                        if (i11 == 0) {
                            int i12 = vs0VarArr[i11].f41426q;
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
                        org.telegram.ui.ActionBar.h2 h2Var = this.f35642y1;
                        tL_messages_getSearchResultsPositions.peer = h2Var.getMessagesController().l1(j10);
                        if (i7 != 0 && h2Var.getUserConfig().e() == j10) {
                            tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                            tL_messages_getSearchResultsPositions.saved_peer_id = h2Var.getMessagesController().l1(j3);
                        }
                        ConnectionsManager.getInstance(h2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(h2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new org.telegram.messenger.de(this, vs0VarArr[i11].f41425p, i11, 2)), h2Var.getClassGuid());
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
        org.telegram.ui.ActionBar.r0 r0Var = this.f35614p0;
        if (r0Var == null) {
            return;
        }
        bs0[] bs0VarArr = this.f35609n0;
        bs0 bs0Var = bs0VarArr[1];
        float f11 = 0.0f;
        if (bs0Var != null && bs0Var.F == 11) {
            f11 = 0.0f + f10;
        }
        int i7 = 0;
        bs0 bs0Var2 = bs0VarArr[0];
        if (bs0Var2 != null && bs0Var2.F == 11) {
            f11 += 1.0f - f10;
        }
        r0Var.setAlpha(f11);
        float f12 = (0.15f * f11) + 0.85f;
        r0Var.setScaleX(f12);
        r0Var.setScaleY(f12);
        if (f11 <= 0.01f) {
            i7 = 8;
        }
        r0Var.setVisibility(i7);
    }

    public final void N() {
        dr0 dr0Var = this.L0;
        if (!dr0Var.d(dr0Var.getCurrentTabId())) {
            int firstTabId = dr0Var.getFirstTabId();
            dr0Var.setInitialTabId(firstTabId);
            this.f35609n0[0].F = firstTabId;
            B1(false);
        }
    }

    public final void N0(int i7) {
        int i10;
        int i11 = 2;
        vs0[] vs0VarArr = this.f35636w1;
        if (i7 == 0) {
            int i12 = vs0VarArr[0].f41426q;
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
        vs0VarArr[i7].f41417g = true;
        org.telegram.ui.ActionBar.h2 h2Var = this.f35642y1;
        h2Var.getMediaDataController().Q0(this.f35606m1, 50, 0, vs0VarArr[i7].f41420k, i10, this.G, 1, h2Var.getClassGuid(), vs0VarArr[i7].f41425p, null, null);
    }

    public final void N1() {
        float f10;
        float f11;
        org.telegram.ui.ActionBar.r0 r0Var = this.f35614p0;
        if (r0Var == null) {
            return;
        }
        boolean z10 = true;
        bs0 bs0Var = this.f35609n0[1];
        if (bs0Var == null || bs0Var.F != 11) {
            z10 = false;
        }
        if (z10) {
            r0Var.setVisibility(0);
        }
        ViewPropertyAnimator animate = r0Var.animate();
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
        scaleX.scaleY(f12).withEndAction(new pp0(0, this, z10)).setDuration(420L).setInterpolator(lr.h).start();
    }

    public final void O(org.telegram.ui.Components.bs0 r34, org.telegram.ui.Components.ck0 r35, v4.c0 r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gt0.O(org.telegram.ui.Components.bs0, org.telegram.ui.Components.ck0, v4.c0):void");
    }

    public int O0() {
        return 0;
    }

    public final void O1() {
        boolean z10;
        int i7;
        fi.h6 h6Var;
        boolean B0 = B0();
        org.telegram.ui.ActionBar.r0 r0Var = this.f35643z0;
        org.telegram.ui.ActionBar.r0 r0Var2 = this.f35641y0;
        int i10 = 8;
        if (B0) {
            if (r0Var2 != null) {
                r0Var2.setVisibility(8);
            }
            if (r0Var != null) {
                r0Var.setVisibility(8);
            }
        } else if (getClosestTab() == 9) {
            if (r0Var2 != null) {
                r0Var2.setVisibility(8);
            }
            if (r0Var != null) {
                r0Var.setVisibility(8);
            }
        } else if (getClosestTab() == 8) {
            int i11 = 0;
            while (true) {
                SparseArray[] sparseArrayArr = this.f35577c1;
                if (i11 < sparseArrayArr[0].size()) {
                    org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) sparseArrayArr[0].valueAt(i11);
                    qr0 qr0Var = this.f35586f0;
                    if (qr0Var != null && (h6Var = qr0Var.f34504s) != null && !h6Var.m(fjVar.e1())) {
                        z10 = true;
                        break;
                    }
                    i11++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (r0Var2 != null) {
                if (z10) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                r0Var2.setVisibility(i7);
            }
            if (r0Var != null) {
                if (!z10) {
                    i10 = 0;
                }
                r0Var.setVisibility(i10);
            }
        } else if (J0(getClosestTab())) {
            if (r0Var2 != null) {
                r0Var2.setVisibility(8);
            }
            if (r0Var != null) {
                r0Var.setVisibility(8);
            }
        }
    }

    public final boolean P(MotionEvent motionEvent) {
        float f10;
        v4.i0 i0Var;
        boolean z10;
        dq0 dq0Var;
        float f11;
        boolean z11;
        bs0[] bs0VarArr = this.f35609n0;
        int i7 = bs0VarArr[0].F;
        if (i7 == 13 && (dq0Var = this.f35568a0) != null) {
            View currentView = dq0Var.f13669n.getCurrentView();
            if (currentView instanceof gi.m) {
                gi.m mVar = (gi.m) currentView;
                gi.h hVar = mVar.f13657w;
                gi.e eVar = mVar.f13653f;
                if (mVar.f13648a != null && mVar.getParent() != null) {
                    if (!mVar.f13650b || mVar.L) {
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
                                            mVar.f13651c = 0.0f;
                                        } else {
                                            if (z12) {
                                                f11 = org.telegram.messenger.f3.y(2.0f, mVar.R, 1.0f, 1.0f);
                                            } else {
                                                f11 = (1.0f - mVar.R) / 0.5f;
                                            }
                                            mVar.f13651c = Math.max(0.0f, Math.min(1.0f, f11));
                                        }
                                        float f12 = mVar.f13651c;
                                        int i13 = (f12 > 1.0f ? 1 : (f12 == 1.0f ? 0 : -1));
                                        if (i13 == 0 || f12 == 0.0f) {
                                            if (i13 == 0) {
                                                int i14 = mVar.f13652e;
                                                int ceil = (((int) Math.ceil(mVar.T / mVar.f13652e)) * i14) + ((int) ((mVar.f13649a0.H.C1 / (eVar.getMeasuredWidth() - ((int) (eVar.getMeasuredWidth() / mVar.f13652e)))) * (i14 - 1)));
                                                if (ceil >= hVar.b()) {
                                                    ceil = hVar.b() - 1;
                                                }
                                                mVar.T = ceil;
                                            }
                                            mVar.a();
                                            if (mVar.f13651c == 0.0f) {
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
            if (!this.f35622r1 || this.f35567a) {
                if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
                    if (motionEvent.getActionMasked() == 2 && (this.f35567a || this.f35575c)) {
                        int i17 = -1;
                        int i18 = -1;
                        for (int i19 = 0; i19 < motionEvent.getPointerCount(); i19++) {
                            if (this.f35581e == motionEvent.getPointerId(i19)) {
                                i17 = i19;
                            }
                            if (this.f35585f == motionEvent.getPointerId(i19)) {
                                i18 = i19;
                            }
                        }
                        if (i17 != -1 && i18 != -1) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(i18) - motionEvent.getX(i17), motionEvent.getY(i18) - motionEvent.getY(i17))) / this.h;
                            this.f35608n = hypot2;
                            if (!this.f35567a && (hypot2 > 1.01f || hypot2 < 0.99f)) {
                                this.f35567a = true;
                                if (hypot2 > 1.0f) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                this.f35620r = z10;
                                t1(z10);
                            }
                            if (this.f35567a) {
                                boolean z13 = this.f35620r;
                                if ((z13 && this.f35608n < 1.0f) || (!z13 && this.f35608n > 1.0f)) {
                                    this.f35618q1 = 0.0f;
                                } else {
                                    if (z13) {
                                        f10 = org.telegram.messenger.f3.y(2.0f, this.f35608n, 1.0f, 1.0f);
                                    } else {
                                        f10 = (1.0f - this.f35608n) / 0.5f;
                                    }
                                    this.f35618q1 = Math.max(0.0f, Math.min(1.0f, f10));
                                }
                                float f13 = this.f35618q1;
                                if (f13 == 1.0f || f13 == 0.0f) {
                                    if (z0(this.f35626s1)) {
                                        i0Var = z1(this.f35626s1);
                                    } else {
                                        i0Var = this.K;
                                    }
                                    if (this.f35618q1 == 1.0f) {
                                        int i20 = this.f35629t1;
                                        int ceil2 = (((int) Math.ceil(this.f35624s / this.f35629t1)) * i20) + ((int) ((this.C1 / (bs0VarArr[0].h.getMeasuredWidth() - ((int) (bs0VarArr[0].h.getMeasuredWidth() / this.f35629t1)))) * (i20 - 1)));
                                        if (ceil2 >= i0Var.b()) {
                                            ceil2 = i0Var.b() - 1;
                                        }
                                        this.f35624s = ceil2;
                                    }
                                    d0();
                                    if (this.f35618q1 == 0.0f) {
                                        this.f35620r = !this.f35620r;
                                    }
                                    t1(this.f35620r);
                                    this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                }
                                bs0VarArr[0].h.invalidate();
                                bs0 bs0Var = bs0VarArr[0];
                                if (bs0Var.G != null) {
                                    bs0Var.invalidate();
                                }
                            }
                        } else {
                            this.f35571b = false;
                            this.f35575c = false;
                            this.f35567a = false;
                            d0();
                            return false;
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.f35581e == motionEvent.getPointerId(0) && this.f35585f == motionEvent.getPointerId(1)) || (this.f35581e == motionEvent.getPointerId(1) && this.f35585f == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.f35567a) {
                        this.f35575c = false;
                        this.f35571b = false;
                        this.f35567a = false;
                        d0();
                    }
                } else {
                    if (this.f35571b && !this.f35567a && motionEvent.getPointerCount() == 2) {
                        this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.f35608n = 1.0f;
                        this.f35581e = motionEvent.getPointerId(0);
                        this.f35585f = motionEvent.getPointerId(1);
                        bs0VarArr[0].h.I0(false);
                        bs0VarArr[0].h.cancelLongPress();
                        bs0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.f35637x = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - bs0VarArr[0].getX());
                        int y11 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - bs0VarArr[0].getY());
                        int i21 = this.f35637x;
                        this.f35624s = -1;
                        int top2 = y11 - bs0VarArr[0].h.getTop();
                        if (getY() != 0.0f && this.F == 1) {
                            top2 = 0;
                        }
                        for (int i22 = 0; i22 < bs0VarArr[0].h.getChildCount(); i22++) {
                            View childAt2 = bs0VarArr[0].h.getChildAt(i22);
                            Rect rect2 = this.f35640y;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i21, top2)) {
                                bs0VarArr[0].h.getClass();
                                this.f35624s = RecyclerView.S(childAt2);
                                this.f35634w = childAt2.getTop();
                            }
                        }
                        if (this.G1.Y() && this.f35624s == -1) {
                            this.f35624s = (int) (((this.f35615p1[z0(bs0VarArr[0].F) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i21 / bs0VarArr[0].h.getMeasuredWidth(), 0.0f))) + bs0VarArr[0].f33775x.L0());
                            this.f35634w = 0;
                        }
                        this.f35575c = true;
                    }
                    if (motionEvent.getActionMasked() == 0 && ((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - bs0VarArr[0].getY() > this.d2) {
                        this.f35571b = true;
                    }
                }
                return this.f35567a;
            }
            return true;
        }
        return false;
    }

    public void P1(boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gt0.P1(boolean):void");
    }

    public final void Q() {
        R(false, false);
    }

    public final Boolean Q1(View view, View view2) {
        if (!this.f35622r1) {
            bs0[] bs0VarArr = this.f35609n0;
            boolean z10 = false;
            bs0 bs0Var = bs0VarArr[0];
            if (bs0Var != null) {
                int i7 = bs0Var.F;
                this.f35626s1 = i7;
                boolean z02 = z0(i7);
                int[] iArr = this.f35615p1;
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
                        org.telegram.messenger.bz.B(h02);
                    } else if (m0(bs0VarArr[0].F) >= 5 || J0(bs0VarArr[0].F)) {
                        org.telegram.messenger.bz.F(h02);
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
            if (this.f35619q2 && !E0()) {
                z12 = true;
            } else {
                z12 = false;
            }
            org.telegram.ui.ActionBar.r0 r0Var = this.f35617q0;
            if (r0Var != null) {
                if (z12 && I() && (F0(closestTab) || (closestTab == 11 && x0()))) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                ((org.telegram.ui.ActionBar.h5) r0Var).Z(z13, z10);
            }
            org.telegram.ui.ActionBar.h5 h5Var = this.J;
            if (h5Var != null) {
                if (z12 && I() && !A0() && v0(closestTab)) {
                    z14 = true;
                }
                h5Var.Z(z14, z11);
            }
        }
    }

    public final void R0() {
        fi.h6 h6Var;
        fi.h6 h6Var2;
        this.K1.b();
        qr0 qr0Var = this.f35586f0;
        if (qr0Var != null && (h6Var2 = qr0Var.f34504s) != null && h6Var2 != null) {
            h6Var2.z(qr0Var.f34505w);
        }
        cq0 cq0Var = this.f35592h0;
        if (cq0Var != null && (h6Var = cq0Var.f34504s) != null && h6Var != null) {
            h6Var.z(cq0Var.f34505w);
        }
        for (ft0 ft0Var : this.f35607m2.values()) {
            et0 et0Var = ft0Var.f35166c;
            fi.h6 h6Var3 = et0Var.f34504s;
            if (h6Var3 != null && h6Var3 != null) {
                h6Var3.z(et0Var.f34505w);
            }
        }
    }

    public final Boolean R1(View view, View view2) {
        if (!this.f35622r1) {
            bs0[] bs0VarArr = this.f35609n0;
            boolean z10 = false;
            bs0 bs0Var = bs0VarArr[0];
            if (bs0Var != null) {
                if (!this.n1 || !z0(bs0Var.F)) {
                    int i7 = bs0VarArr[0].F;
                    this.f35626s1 = i7;
                    boolean z02 = z0(i7);
                    int[] iArr = this.f35615p1;
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
                            org.telegram.messenger.bz.B(h02);
                        } else if (m0(bs0VarArr[0].F) >= 5 || J0(bs0VarArr[0].F)) {
                            org.telegram.messenger.bz.F(h02);
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
        bs0[] bs0VarArr = this.f35609n0;
        bs0 bs0Var = bs0VarArr[0];
        if (bs0Var != null && bs0VarArr[1] != null) {
            float f11 = 0.0f;
            hq0 hq0Var = this.f35576c0;
            if (hq0Var != null) {
                if (z0(bs0Var.F) && bs0VarArr[0].F != 9) {
                    c10 = 1;
                } else {
                    c10 = 0;
                }
                if (bs0VarArr[1].getVisibility() == 0) {
                    if (z0(bs0VarArr[1].F) && bs0VarArr[1].F != 9) {
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
                        measuredWidth = bs0VarArr[0].getMeasuredWidth();
                    }
                    hq0Var.setTranslationX(measuredWidth);
                } else {
                    hq0Var.setTranslationX(bs0VarArr[c10 ^ 1].getTranslationX());
                    abs = 1.0f - (Math.abs(hq0Var.getTranslationX()) / hq0Var.getMeasuredWidth());
                }
                float f12 = 0.0f;
                for (int i7 = 0; i7 < bs0VarArr.length; i7++) {
                    if (bs0VarArr[i7].getVisibility() == 0) {
                        lq0 lq0Var = bs0VarArr[i7].h;
                        if (lq0Var.getChildCount() == 0) {
                            childAt = null;
                        } else {
                            childAt = lq0Var.getChildAt(0);
                        }
                        if (childAt == null) {
                            R = -1;
                        } else {
                            R = RecyclerView.R(childAt);
                        }
                        if (R == 0) {
                            f10 = childAt.getY() - lq0Var.getPaddingTop();
                        } else if (lq0Var.getChildCount() == 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = -org.telegram.messenger.g0.L(48.0f);
                        }
                        f12 += Utilities.l(1.0f - (bs0VarArr[i7].getTranslationX() / bs0VarArr[i7].getMeasuredWidth())) * f10;
                    }
                }
                float l10 = Utilities.l(1.0f - ((-f12) / org.telegram.messenger.g0.N(48.0f)));
                float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, l10);
                hq0Var.setAlpha(l10);
                hq0Var.setScaleX(T1);
                hq0Var.setScaleY(T1);
                hq0Var.setTranslationY(this.O1 + f12);
                f11 = abs;
            }
            U();
            if (this.Y1 != f11) {
                this.Y1 = f11;
                invalidate();
            }
        }
    }

    public final void S0(int i7, View view, org.telegram.messenger.fj fjVar, int i10) {
        TLRPC.WebPage webPage;
        String str;
        char c10;
        int i11;
        int i12;
        boolean z10;
        if (fjVar != null && !this.f35622r1) {
            hq0 hq0Var = this.f35576c0;
            if (hq0Var == null || !hq0Var.f50340f) {
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
                        if (org.telegram.messenger.fj.B0(fjVar.f23965k) == this.f35606m1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        SparseArray[] sparseArrayArr = this.f35577c1;
                        if (sparseArrayArr[c10].indexOfKey(fjVar.e1()) >= 0) {
                            sparseArrayArr[c10].remove(fjVar.e1());
                            if (!fjVar.s(null, false)) {
                                this.f35580d1--;
                            }
                        } else {
                            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                                sparseArrayArr[c10].put(fjVar.e1(), fjVar);
                                if (!fjVar.s(null, false)) {
                                    this.f35580d1++;
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
                            if (this.f35580d1 == 0) {
                                i11 = 0;
                            } else {
                                i11 = 8;
                            }
                            this.f35611o0.setVisibility(i11);
                            org.telegram.ui.ActionBar.r0 r0Var = this.f35638x0;
                            if (r0Var != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14 && sparseArrayArr[0].size() == 1) {
                                    i12 = 0;
                                } else {
                                    i12 = 8;
                                }
                                r0Var.setVisibility(i12);
                            }
                            org.telegram.ui.ActionBar.r0 r0Var2 = this.f35635w0;
                            if (r0Var2 != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                                    i14 = 0;
                                }
                                r0Var2.setVisibility(i14);
                            }
                            O1();
                        }
                        this.f35583e1 = false;
                        if (view instanceof org.telegram.ui.Cells.i7) {
                            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                            if (sparseArrayArr[c10].indexOfKey(fjVar.e1()) >= 0) {
                                z11 = true;
                            }
                            i7Var.b(z11, true);
                        } else if (view instanceof org.telegram.ui.Cells.q7) {
                            org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) view;
                            if (sparseArrayArr[c10].indexOfKey(fjVar.e1()) >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            q7Var.b(0, z10, true);
                        } else if (view instanceof org.telegram.ui.Cells.l7) {
                            org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                            if (sparseArrayArr[c10].indexOfKey(fjVar.e1()) >= 0) {
                                z12 = true;
                            }
                            l7Var.f(z12, true);
                        } else if (view instanceof org.telegram.ui.Cells.h7) {
                            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                            if (sparseArrayArr[c10].indexOfKey(fjVar.e1()) >= 0) {
                                z13 = true;
                            }
                            h7Var.e(z13, true);
                        } else if (view instanceof org.telegram.ui.Cells.i2) {
                            org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) view;
                            if (sparseArrayArr[c10].indexOfKey(fjVar.e1()) >= 0) {
                                z14 = true;
                            }
                            i2Var.c(z14, true);
                        } else if (view instanceof org.telegram.ui.Cells.p7) {
                            org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
                            if (sparseArrayArr[c10].indexOfKey(fjVar.e1()) >= 0) {
                                z15 = true;
                            }
                            p7Var.i(z15, true);
                        }
                    } else {
                        return;
                    }
                } else {
                    nq0 nq0Var = this.f35631u1;
                    vs0[] vs0VarArr = this.f35636w1;
                    org.telegram.ui.ActionBar.h2 h2Var = this.f35642y1;
                    if (i10 == 0) {
                        vs0 vs0Var = vs0VarArr[i10];
                        int i15 = i7 - vs0Var.f41422m;
                        if (i15 >= 0 && i15 < vs0Var.f41412a.size()) {
                            PhotoViewer.p1().I2(null, h2Var, null);
                            PhotoViewer.p1().a2(vs0VarArr[i10].f41412a, i15, this.f35606m1, this.f35587f1, this.G, nq0Var);
                        }
                    } else if (i10 != 2 && i10 != 4) {
                        if (i10 == 5) {
                            PhotoViewer.p1().I2(null, h2Var, null);
                            int indexOf = vs0VarArr[i10].f41412a.indexOf(fjVar);
                            if (indexOf < 0) {
                                PhotoViewer.p1().a2(org.telegram.messenger.f3.i(fjVar), 0, 0L, 0L, 0L, nq0Var);
                            } else {
                                PhotoViewer.p1().a2(vs0VarArr[i10].f41412a, indexOf, this.f35606m1, this.f35587f1, this.G, nq0Var);
                            }
                        } else if (i10 == 1) {
                            if (view instanceof org.telegram.ui.Cells.i7) {
                                org.telegram.ui.Cells.i7 i7Var2 = (org.telegram.ui.Cells.i7) view;
                                TLRPC.Document F0 = fjVar.F0();
                                if (i7Var2.H) {
                                    if (fjVar.x()) {
                                        PhotoViewer.p1().I2(null, h2Var, null);
                                        int indexOf2 = vs0VarArr[i10].f41412a.indexOf(fjVar);
                                        if (indexOf2 < 0) {
                                            PhotoViewer.p1().a2(org.telegram.messenger.f3.i(fjVar), 0, 0L, 0L, 0L, nq0Var);
                                            return;
                                        }
                                        PhotoViewer.p1().a2(vs0VarArr[i10].f41412a, indexOf2, this.f35606m1, this.f35587f1, this.G, nq0Var);
                                        return;
                                    }
                                    org.telegram.messenger.g0.s2(fjVar, h2Var.getParentActivity(), h2Var);
                                } else if (!i7Var2.G) {
                                    org.telegram.messenger.fj message = i7Var2.getMessage();
                                    message.P = true;
                                    h2Var.getFileLoader().W(F0, message, 0, 0);
                                    i7Var2.f(true);
                                } else {
                                    h2Var.getFileLoader().f(F0);
                                    i7Var2.f(true);
                                }
                            }
                        } else if (i10 == 3) {
                            try {
                                if (org.telegram.messenger.fj.n1(fjVar.f23965k) != null) {
                                    webPage = org.telegram.messenger.fj.n1(fjVar.f23965k).webpage;
                                } else {
                                    webPage = null;
                                }
                                if (webPage != null && !(webPage instanceof TLRPC.TL_webPageEmpty)) {
                                    if (webPage.cached_page != null) {
                                        LaunchActivity launchActivity = LaunchActivity.H1;
                                        if (launchActivity == null || launchActivity.N() == null || LaunchActivity.H1.N().l(fjVar) == null) {
                                            h2Var.createArticleViewer(false).L(fjVar, null, null, null);
                                            return;
                                        }
                                        return;
                                    }
                                    String str3 = webPage.embed_url;
                                    if (str3 != null && str3.length() != 0) {
                                        gu.O0(h2Var, fjVar, this.f35631u1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
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
                            dt0 z16 = z1(i10);
                            if (z16 != null) {
                                h6Var = z16.f34504s;
                            }
                            if (h6Var != null) {
                                fi.f9 orCreateStoryViewer = h2Var.getOrCreateStoryViewer();
                                Context context = getContext();
                                int e12 = fjVar.e1();
                                fi.y6 a10 = fi.y6.a(this.f35609n0[0].h);
                                a10.f12784e = new iy(h6Var, 18);
                                if ((h2Var instanceof ProfileActivity) && ((ProfileActivity) h2Var).f43637s1) {
                                    i13 = org.telegram.messenger.g0.L(68.0f);
                                }
                                a10.f12788s += i13;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gt0.T():boolean");
    }

    public final boolean T0(org.telegram.messenger.fj fjVar, View view, int i7, boolean z10) {
        hq0 hq0Var;
        char c10;
        int i10;
        int i11;
        final TL_stories.StoryItem storyItem;
        qr0 qr0Var;
        fi.h6 h6Var;
        if (!this.F1) {
            org.telegram.ui.ActionBar.h2 h2Var = this.f35642y1;
            if (h2Var.getParentActivity() != null && fjVar != null && ((hq0Var = this.f35576c0) == null || !hq0Var.f50340f)) {
                org.telegram.messenger.g0.v1(h2Var.getParentActivity().getCurrentFocus());
                long j3 = this.f35606m1;
                int i12 = 8;
                if (z10 && ((J0(getClosestTab()) || getClosestTab() == 8) && !this.F1)) {
                    if (view instanceof org.telegram.ui.Cells.p7) {
                        org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
                        p7Var.k(p7Var.f31239n, p7Var.f31244r, true);
                    }
                    TL_stories.StoryItem storyItem2 = fjVar.f23970l;
                    if (storyItem2 != null) {
                        HashSet hashSet = new HashSet();
                        ArrayList<Integer> arrayList = storyItem2.albums;
                        if (arrayList != null) {
                            hashSet.addAll(arrayList);
                        }
                        boolean J0 = J0(getClosestTab());
                        y60 J = y60.J(h2Var, view);
                        y60 K = J.K();
                        K.c(2131231240, org.telegram.messenger.gd.M0(2131753754, null), new org.telegram.ui.hq0(J, 27), false);
                        K.k();
                        y60.f(K, getStoriesController().B(j3, true), hashSet, true, new k7((Object) this, (Object) storyItem2, (Object) J, 24), new bi.i2(this, hashSet, storyItem2, J, 11));
                        J.c(2131231766, org.telegram.messenger.gd.M0(2131744570, null), new bi.u5(J, K, 10), false);
                        J.k();
                        J.c(2131232359, org.telegram.messenger.gd.M0(2131744554, null), new bi.t4(this, fjVar, view, i7, 29), false);
                        if (J0) {
                            int w12 = w1(getClosestTab());
                            String w10 = getStoriesController().w(w12, j3);
                            J.c(2131232775, org.telegram.messenger.gd.M0(2131744555, null), new jp0(this, w12, 0), false);
                            storyItem = storyItem2;
                            J.c(2131232331, org.telegram.messenger.gd.M0(2131744556, null), new kp0(this, w12, storyItem, w10, 0), false);
                        } else {
                            storyItem = storyItem2;
                            if (getClosestTab() == 8 && (qr0Var = this.f35586f0) != null && (h6Var = qr0Var.f34504s) != null) {
                                if (h6Var.m(storyItem.f28642id)) {
                                    J.c(2131231002, org.telegram.messenger.gd.M0(2131744552, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            int i13 = r1;
                                            TL_stories.StoryItem storyItem3 = storyItem;
                                            gt0 gt0Var = this;
                                            switch (i13) {
                                                case 0:
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, gt0Var.getContext(), gt0Var.I1);
                                                    String M0 = org.telegram.messenger.gd.M0(2131751476, null);
                                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                                                    u1Var.S = M0;
                                                    u1Var.U = org.telegram.messenger.gd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new tp0(gt0Var, storyItem3));
                                                    alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), new wb0(12));
                                                    u1Var.show();
                                                    u1Var.i();
                                                    return;
                                                case 1:
                                                    gt0Var.getClass();
                                                    gt0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f28642id))), false);
                                                    return;
                                                case 2:
                                                    gt0Var.getClass();
                                                    gt0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f28642id))), true);
                                                    return;
                                                default:
                                                    gt0.h(gt0Var, storyItem3);
                                                    return;
                                            }
                                        }
                                    }, false);
                                } else {
                                    J.c(2131230998, org.telegram.messenger.gd.M0(2131744557, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            int i13 = r1;
                                            TL_stories.StoryItem storyItem3 = storyItem;
                                            gt0 gt0Var = this;
                                            switch (i13) {
                                                case 0:
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, gt0Var.getContext(), gt0Var.I1);
                                                    String M0 = org.telegram.messenger.gd.M0(2131751476, null);
                                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                                                    u1Var.S = M0;
                                                    u1Var.U = org.telegram.messenger.gd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new tp0(gt0Var, storyItem3));
                                                    alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), new wb0(12));
                                                    u1Var.show();
                                                    u1Var.i();
                                                    return;
                                                case 1:
                                                    gt0Var.getClass();
                                                    gt0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f28642id))), false);
                                                    return;
                                                case 2:
                                                    gt0Var.getClass();
                                                    gt0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f28642id))), true);
                                                    return;
                                                default:
                                                    gt0.h(gt0Var, storyItem3);
                                                    return;
                                            }
                                        }
                                    }, false);
                                }
                            }
                            J.c(2131232053, org.telegram.messenger.gd.M0(2131744562, null), new Runnable() {
                                @Override
                                public final void run() {
                                    int i13 = r1;
                                    TL_stories.StoryItem storyItem3 = storyItem;
                                    gt0 gt0Var = this;
                                    switch (i13) {
                                        case 0:
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, gt0Var.getContext(), gt0Var.I1);
                                            String M0 = org.telegram.messenger.gd.M0(2131751476, null);
                                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                                            u1Var.S = M0;
                                            u1Var.U = org.telegram.messenger.gd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new tp0(gt0Var, storyItem3));
                                            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), new wb0(12));
                                            u1Var.show();
                                            u1Var.i();
                                            return;
                                        case 1:
                                            gt0Var.getClass();
                                            gt0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f28642id))), false);
                                            return;
                                        case 2:
                                            gt0Var.getClass();
                                            gt0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f28642id))), true);
                                            return;
                                        default:
                                            gt0.h(gt0Var, storyItem3);
                                            return;
                                    }
                                }
                            }, false);
                        }
                        J.c(2131232110, org.telegram.messenger.gd.M0(2131751587, null), new Runnable() {
                            @Override
                            public final void run() {
                                int i13 = r1;
                                TL_stories.StoryItem storyItem3 = storyItem;
                                gt0 gt0Var = this;
                                switch (i13) {
                                    case 0:
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, gt0Var.getContext(), gt0Var.I1);
                                        String M0 = org.telegram.messenger.gd.M0(2131751476, null);
                                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                                        u1Var.S = M0;
                                        u1Var.U = org.telegram.messenger.gd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new tp0(gt0Var, storyItem3));
                                        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), new wb0(12));
                                        u1Var.show();
                                        u1Var.i();
                                        return;
                                    case 1:
                                        gt0Var.getClass();
                                        gt0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f28642id))), false);
                                        return;
                                    case 2:
                                        gt0Var.getClass();
                                        gt0Var.f1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f28642id))), true);
                                        return;
                                    default:
                                        gt0.h(gt0Var, storyItem3);
                                        return;
                                }
                            }
                        }, true);
                        J.f42356i = 3;
                        J.f42379u = true;
                        J.v = true;
                        J.L = true;
                        J.M = 3;
                        Point point = org.telegram.messenger.g0.f24118q;
                        int min = Math.min((int) (Math.min(point.x, point.y) * 0.6777f), (int) (((Math.max(point.x, point.y) * 0.4333f) * 3.0f) / 4.0f));
                        J.N = min;
                        J.O = (min * 4) / 3;
                        J.f42377t = true;
                        J.S = true;
                        J.Z = true;
                        J.a0();
                        return true;
                    }
                } else {
                    if (org.telegram.messenger.fj.B0(fjVar.f23965k) == j3) {
                        c10 = 0;
                    } else {
                        c10 = 1;
                    }
                    SparseArray[] sparseArrayArr = this.f35577c1;
                    sparseArrayArr[c10].put(fjVar.e1(), fjVar);
                    if (!fjVar.s(null, false)) {
                        this.f35580d1++;
                    }
                    if (this.f35580d1 == 0) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    this.f35611o0.setVisibility(i10);
                    org.telegram.ui.ActionBar.r0 r0Var = this.f35638x0;
                    if (r0Var != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i11 = 0;
                        } else {
                            i11 = 8;
                        }
                        r0Var.setVisibility(i11);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var2 = this.f35635w0;
                    if (r0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i12 = 0;
                        }
                        r0Var2.setVisibility(i12);
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
                    this.f35583e1 = false;
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
        cs csVar = this.S0;
        if (csVar != null) {
            csVar.setTranslationY(this.O1);
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
            sparseArrayArr = this.f35577c1;
            if (i7 < 0) {
                break;
            }
            sparseArrayArr[i7].clear();
            i7--;
        }
        this.f35580d1 = 0;
        P0(sparseArrayArr[0]);
        dq0 dq0Var = this.f35568a0;
        if (dq0Var != null) {
            dq0Var.h();
            dq0Var.j();
        }
        q1(false);
        L1(z10);
        rs0 rs0Var = this.U;
        if (rs0Var != null) {
            rs0Var.f39299x.clear();
        }
        return true;
    }

    public final void V0(float f10) {
        bs0 bs0Var;
        int i7;
        int i10;
        bs0 bs0Var2;
        int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        bs0[] bs0VarArr = this.f35609n0;
        if (i11 != 0 || bs0VarArr[1].getVisibility() == 0) {
            if (this.f35602k1) {
                bs0VarArr[0].setTranslationX((-f10) * bs0Var2.getMeasuredWidth());
                bs0VarArr[1].setTranslationX(bs0VarArr[0].getMeasuredWidth() - (bs0VarArr[0].getMeasuredWidth() * f10));
            } else {
                bs0VarArr[0].setTranslationX(bs0Var.getMeasuredWidth() * f10);
                bs0VarArr[1].setTranslationX((bs0VarArr[0].getMeasuredWidth() * f10) - bs0VarArr[0].getMeasuredWidth());
            }
            Z0(getTabProgress());
            float k02 = k0(f10);
            this.f35625s0 = k02;
            int i12 = 4;
            if (k02 != 0.0f && I() && !A0()) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            this.f35630u0.setVisibility(i7);
            org.telegram.ui.ActionBar.r0 r0Var = this.f35617q0;
            if (r0Var != null && !I()) {
                if (I0()) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                setSearchItemVisibility(i10);
                this.f35621r0 = 0.0f;
            } else {
                this.f35621r0 = l0(f10);
                N1();
            }
            I1(false);
            if (i11 == 0) {
                bs0 bs0Var3 = bs0VarArr[0];
                bs0VarArr[0] = bs0VarArr[1];
                bs0VarArr[1] = bs0Var3;
                bs0Var3.setVisibility(8);
                if (r0Var != null && this.A0 == 2) {
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

    public final org.telegram.ui.ActionBar.r0 W(Context context, int i7, int i10, String str) {
        org.telegram.ui.ActionBar.r0 r0Var;
        org.telegram.ui.ActionBar.a5 a5Var = this.I;
        if (a5Var != null) {
            r0Var = a5Var.q().b(i7, i10);
        } else {
            int i11 = org.telegram.ui.ActionBar.n6.f29807z8;
            int s02 = s0(i11);
            int i12 = org.telegram.ui.ActionBar.n6.f29788y8;
            org.telegram.ui.ActionBar.r0 r0Var2 = new org.telegram.ui.ActionBar.r0(context, null, s02, s0(i12), false, null);
            r0Var2.setIcon(i10);
            r0Var2.setDuplicateParentStateEnabled(false);
            this.E0.addView(r0Var2, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
            this.Q0.add(r0Var2);
            ph0 iconView = r0Var2.getIconView();
            org.telegram.ui.ActionBar.i6 i6Var = this.I1;
            if (iconView != null) {
                org.telegram.ui.ActionBar.u6.s(r0Var2.getIconView(), i12, i6Var, PorterDuff.Mode.SRC_IN);
            }
            if (r0Var2.getBackground() != null) {
                Drawable background = r0Var2.getBackground();
                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
                r0Var2.setBackground(background);
                org.telegram.ui.ActionBar.u6.j(r0Var2, background, null, M, i6Var);
            }
            r0Var = r0Var2;
        }
        r0Var.setContentDescription(str);
        r0Var.setOnClickListener(new ci.q(this, i7, 20));
        return r0Var;
    }

    public boolean Y() {
        return this instanceof z20;
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
        bt0 bt0Var = this.f35592h0.f34506x;
        if (bt0Var != null) {
            if (z10 && getClosestTab() == 9) {
                z13 = true;
            } else {
                z13 = false;
            }
            bt0Var.b(z13);
        }
        bt0 bt0Var2 = this.f35586f0.f34506x;
        if (bt0Var2 != null) {
            if (z10 && getClosestTab() == 8) {
                z12 = true;
            } else {
                z12 = false;
            }
            bt0Var2.b(z12);
        }
        for (ft0 ft0Var : this.f35607m2.values()) {
            et0 et0Var = ft0Var.f35166c;
            if (et0Var.f34504s != null) {
                bt0 bt0Var3 = et0Var.f34506x;
                if (z10 && getClosestTab() == ft0Var.f35164a) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bt0Var3.b(z11);
            }
        }
        org.telegram.ui.ActionBar.r0 r0Var = this.f35617q0;
        if (r0Var != null) {
            ar0 ar0Var = this.M0;
            if (ar0Var != null && ar0Var.a() && getSelectedTab() == 11) {
                i7 = 2131745673;
            } else {
                i7 = 2131745641;
            }
            r0Var.setSearchFieldHint(org.telegram.messenger.gd.M0(i7, null));
        }
        S();
        R(true, true);
    }

    public final boolean Z(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x10 = (-view.getX()) - getX();
        bs0[] bs0VarArr = this.f35609n0;
        motionEvent.offsetLocation(x10 - bs0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - bs0VarArr[0].getY()) - bs0VarArr[0].h.getFastScroll().getY());
        return bs0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public void Z0(float f10) {
        Q0();
    }

    public final boolean a0(int i7) {
        vs0[] vs0VarArr = this.f35639x1.f42631n;
        if (vs0VarArr == null) {
            return false;
        }
        vs0[] vs0VarArr2 = this.f35636w1;
        if (i7 == 0) {
            vs0 vs0Var = vs0VarArr2[i7];
            if (!vs0Var.h) {
                int[] iArr = vs0Var.f41416f;
                int[] iArr2 = vs0VarArr[i7].f41416f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = vs0VarArr2[i7].f41416f;
            int[] iArr4 = vs0VarArr[i7].f41416f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        vs0VarArr2[i7].f41412a.addAll(vs0VarArr[i7].f41412a);
        vs0VarArr2[i7].f41414c.addAll(vs0VarArr[i7].f41414c);
        for (Map.Entry entry : vs0VarArr[i7].d.entrySet()) {
            vs0VarArr2[i7].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i10 = 0; i10 < 2; i10++) {
            vs0VarArr2[i7].f41413b[i10] = vs0VarArr[i7].f41413b[i10].clone();
            vs0 vs0Var2 = vs0VarArr2[i7];
            int[] iArr5 = vs0Var2.f41419j;
            vs0 vs0Var3 = vs0VarArr[i7];
            iArr5[i10] = vs0Var3.f41419j[i10];
            vs0Var2.f41418i[i10] = vs0Var3.f41418i[i10];
        }
        vs0VarArr2[i7].f41415e.addAll(vs0VarArr[i7].f41415e);
        return !vs0VarArr[i7].f41412a.isEmpty();
    }

    public final void a1(int i7, long j3, org.telegram.ui.ActionBar.h2 h2Var) {
        new org.telegram.ui.d21(h2Var, j3, this.f35615p1[1], new bi.x4(this, j3, i7, 2)).show();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29394d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ai));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Bi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29805z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.sj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29817zi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29786y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29559m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29552li));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29414e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29433f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29395d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29768x7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29691t7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29749w7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29364be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29583nd));
    }

    public final boolean b0(int r27, org.telegram.ui.Components.fs0 r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gt0.b0(int, org.telegram.ui.Components.fs0):boolean");
    }

    public final void b1(int i7, long j3, org.telegram.ui.ActionBar.h2 h2Var) {
        b5.s0(h2Var, org.telegram.messenger.gd.M0(2131751587, null), org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131744560, getStoriesController().w(i7, j3))), org.telegram.messenger.gd.M0(2131751587, null), true, new di.b9(this, j3, i7, 8));
    }

    public final void c0(int i7, ck0 ck0Var, boolean z10) {
        ArrayList arrayList = this.f35636w1[i7].f41415e;
        int L0 = ((v4.c0) ck0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            gs0 gs0Var = null;
            if (arrayList != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    } else if (L0 <= ((gs0) arrayList.get(i10)).f35558b) {
                        gs0Var = (gs0) arrayList.get(i10);
                        break;
                    } else {
                        i10++;
                    }
                }
                if (gs0Var == null) {
                    gs0Var = (gs0) i5.c.h(1, arrayList);
                }
            }
            if (gs0Var != null) {
                L0(i7, gs0Var.d, gs0Var.f35558b + 1, z10);
            }
        }
    }

    public final void c1(int i7, long j3, org.telegram.ui.ActionBar.h2 h2Var) {
        String w10 = getStoriesController().w(i7, j3);
        Context context = h2Var.getContext();
        org.telegram.ui.ActionBar.i6 resourceProvider = h2Var.getResourceProvider();
        c4.n nVar = new c4.n(this, j3, i7, 5);
        Pattern pattern = b5.f33529a;
        b5.O(context, h2Var, org.telegram.messenger.gd.M0(2131744547, null), org.telegram.messenger.gd.M0(2131744546, null), org.telegram.messenger.gd.M0(2131744545, null), w10, 12, org.telegram.messenger.gd.M0(2131746083, null), resourceProvider, nVar);
    }

    public final void d0() {
        bs0[] bs0VarArr;
        bs0 bs0Var;
        boolean z10;
        int i7;
        v4.i0 adapter;
        if (this.f35622r1) {
            int i10 = 0;
            while (true) {
                bs0VarArr = this.f35609n0;
                if (i10 < bs0VarArr.length) {
                    bs0Var = bs0VarArr[i10];
                    if (bs0Var.F == this.f35626s1) {
                        break;
                    }
                    i10++;
                } else {
                    bs0Var = null;
                    break;
                }
            }
            if (bs0Var != null) {
                boolean z02 = z0(bs0Var.F);
                float f10 = this.f35618q1;
                float f11 = 1.0f;
                int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                vs0[] vs0VarArr = this.f35636w1;
                if (i11 == 0) {
                    this.f35622r1 = false;
                    int i12 = this.f35629t1;
                    int[] iArr = this.f35615p1;
                    iArr[z02 ? 1 : 0] = i12;
                    if (!z02) {
                        org.telegram.messenger.bz.B(i12);
                    } else if (m0(bs0Var.F) >= 5) {
                        org.telegram.messenger.bz.F(this.f35629t1);
                    }
                    for (int i13 = 0; i13 < bs0VarArr.length; i13++) {
                        bs0 bs0Var2 = bs0VarArr[i13];
                        if (bs0Var2 != null && bs0Var2.h != null && (((i7 = bs0Var2.F) == 0 || z0(i7)) && (adapter = bs0VarArr[i13].h.getAdapter()) != null)) {
                            int b10 = adapter.b();
                            if (i13 == 0) {
                                vs0VarArr[0].g(false);
                            }
                            bs0VarArr[i13].f33771n.setVisibility(8);
                            bs0VarArr[i13].f33775x.y1(iArr[z02 ? 1 : 0]);
                            bs0VarArr[i13].h.a0();
                            bs0VarArr[i13].h.invalidate();
                            if (adapter.b() == b10) {
                                org.telegram.messenger.g0.Z3(bs0VarArr[i13].h);
                            } else {
                                adapter.f();
                            }
                        }
                    }
                    if (this.f35624s >= 0) {
                        for (int i14 = 0; i14 < bs0VarArr.length; i14++) {
                            bs0 bs0Var3 = bs0VarArr[i14];
                            if (bs0Var3.F == this.f35626s1) {
                                View m10 = bs0Var3.f33772r.m(this.f35624s);
                                if (m10 != null) {
                                    this.f35634w = m10.getTop();
                                }
                                bs0 bs0Var4 = bs0VarArr[i14];
                                bs0Var4.f33775x.h1(this.f35624s, (-bs0Var4.h.getPaddingTop()) + this.f35634w);
                            }
                        }
                        return;
                    }
                    j1();
                } else if (f10 == 0.0f) {
                    this.f35622r1 = false;
                    if (this.f35626s1 == 0) {
                        vs0VarArr[0].g(false);
                    }
                    bs0Var.f33771n.setVisibility(8);
                    bs0Var.h.invalidate();
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
                    ofFloat.addUpdateListener(new cr0(this, bs0Var, 0));
                    ofFloat.addListener(new org.telegram.ui.ki(this, z10, z02 ? 1 : 0, bs0Var));
                    ofFloat.setInterpolator(lr.f37208f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                }
            }
        }
    }

    public final void d1(String str) {
        boolean H3 = org.telegram.messenger.g0.H3(str);
        org.telegram.ui.ActionBar.h2 h2Var = this.f35642y1;
        if (H3) {
            b5.n0(h2Var, str, true, true);
        } else {
            vf.c.t(h2Var.getParentActivity(), str);
        }
    }

    @Override
    public final void didReceivedNotification(int r42, int r43, java.lang.Object... r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gt0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        dr0 dr0Var = this.L0;
        if (dr0Var != null) {
            canvas.save();
            canvas.translate(dr0Var.getX(), dr0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        zq0 zq0Var = this.U0;
        if (zq0Var != null) {
            int i7 = zq0Var.V;
            if ((i7 == 3 || i7 == 1) && this.S0 == null) {
                canvas.save();
                canvas.translate(zq0Var.getX(), zq0Var.getY());
                zq0Var.setDrawOverlay(true);
                zq0Var.draw(canvas);
                zq0Var.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int i7;
        if (this.f35578c2 && (view instanceof bs0) && this.f35591g2 < this.f35584e2) {
            canvas.save();
            canvas.clipRect(0, -this.f35591g2, getWidth(), getHeight() + this.f35588f2);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        } else if (view == this.U0 && this.S0 == null) {
            canvas.save();
            bs0[] bs0VarArr = this.f35609n0;
            float top = bs0VarArr[0].getTop();
            hq0 hq0Var = this.f35576c0;
            if (hq0Var != null && ((i7 = bs0VarArr[0].F) == 8 || J0(i7))) {
                top -= hq0Var.getVisualHeight();
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
        ((WindowManager) org.telegram.messenger.t0.f26913b.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i7 == 0) {
            if (!org.telegram.messenger.g0.Q1() && org.telegram.messenger.t0.f26913b.getResources().getConfiguration().orientation == 2) {
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
        dq0 dq0Var;
        if (!B0()) {
            return org.telegram.messenger.gd.M0(2131753003, null);
        }
        if (z10 && (dq0Var = this.f35568a0) != null) {
            return dq0Var.getBotPreviewsSubtitle();
        }
        qr0 qr0Var = this.f35586f0;
        if (qr0Var != null && qr0Var.f34504s != null) {
            i7 = 0;
            i10 = 0;
            for (int i11 = 0; i11 < qr0Var.f34504s.f12045i.size(); i11++) {
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) qr0Var.f34504s.f12045i.get(i11);
                TL_stories.StoryItem storyItem = fjVar.f23970l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    if (org.telegram.messenger.fj.K4(messageMedia.document)) {
                        i10++;
                    } else if (fjVar.f23970l.media.photo != null) {
                        i7++;
                    }
                }
            }
        } else {
            i7 = 0;
            i10 = 0;
        }
        if (i7 == 0 && i10 == 0) {
            return org.telegram.messenger.gd.M0(2131753003, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (i7 > 0) {
            sb2.append(org.telegram.messenger.gd.G(i7, "Images", new Object[0]));
        }
        if (i10 > 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(org.telegram.messenger.gd.G(i10, "Videos", new Object[0]));
        }
        return sb2.toString();
    }

    public final void f1(ArrayList arrayList, boolean z10) {
        boolean z11;
        boolean z12;
        qr0 qr0Var = this.f35586f0;
        if (qr0Var != null && qr0Var.f34504s != null) {
            org.telegram.ui.ActionBar.h2 h2Var = this.f35642y1;
            if (z10 && arrayList.size() > h2Var.getMessagesController().Q5) {
                org.telegram.messenger.n10.u(org.telegram.messenger.gd.G(h2Var.getMessagesController().Q5, "StoriesPinLimit", new Object[0]), lc.b0(h2Var), 2131623982, 36);
                return;
            }
            fi.h6 h6Var = qr0Var.f34504s;
            int i7 = h6Var.f12041c;
            ArrayList arrayList2 = h6Var.f12044g;
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
            if (arrayList3.size() > org.telegram.messenger.mp.u1(i7).Q5) {
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
                    tL_togglePinnedToTop.f28655id.addAll(arrayList2);
                    tL_togglePinnedToTop.peer = org.telegram.messenger.mp.u1(i7).l1(h6Var.d);
                    ConnectionsManager.getInstance(i7).sendRequest(tL_togglePinnedToTop, new fi.k5(2));
                }
                z13 = z11;
            }
            if (z13) {
                org.telegram.messenger.n10.u(org.telegram.messenger.gd.G(h2Var.getMessagesController().Q5, "StoriesPinLimit", new Object[0]), lc.b0(h2Var), 2131623982, 36);
            } else if (z10) {
                lc.b0(h2Var).I(2131624055, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(arrayList.size(), "StoriesPinned", new Object[0])), org.telegram.messenger.gd.G(arrayList.size(), "StoriesPinnedText", new Object[0])).j();
            } else {
                org.telegram.messenger.n10.u(org.telegram.messenger.gd.G(arrayList.size(), "StoriesUnpinned", new Object[0]), lc.b0(h2Var), 2131624061, 36);
            }
        }
    }

    public final bs0 g0(int i7) {
        int i10 = 0;
        while (true) {
            bs0[] bs0VarArr = this.f35609n0;
            if (i10 < bs0VarArr.length) {
                bs0 bs0Var = bs0VarArr[i10];
                if (bs0Var != null && bs0Var.F == i7) {
                    return bs0Var;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final boolean g1(MotionEvent motionEvent, boolean z10) {
        int i7;
        bs0 bs0Var;
        dq0 dq0Var;
        int i10;
        int i11;
        int closestTab = getClosestTab();
        dr0 dr0Var = this.L0;
        SparseIntArray sparseIntArray = dr0Var.P;
        int i12 = dr0Var.f33114n;
        int i13 = -1;
        if (z10) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        int i14 = sparseIntArray.get(i12 + i7, -1);
        hq0 hq0Var = this.f35576c0;
        if (hq0Var != null) {
            if (!J0(closestTab) && closestTab != 8) {
                if (J0(i14) || i14 == 8) {
                    i13 = hq0Var.getCurrentAlbumId();
                }
            } else {
                f71 f71Var = hq0Var.f50337b;
                SparseIntArray sparseIntArray2 = f71Var.f34995c0;
                int i15 = f71Var.G;
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
                i14 = x1(i13).f35164a;
            }
        }
        if (i14 >= 0) {
            if (this.f35617q0 != null && !I()) {
                if (I0()) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                setSearchItemVisibility(i10);
                this.f35621r0 = 0.0f;
            } else {
                this.f35621r0 = l0(0.0f);
                M1(0.0f);
            }
            if ((!this.Y0 || getSelectedTab() != 11) && (!H() || !this.F1 || (getClosestTab() != 8 && !J0(getClosestTab())))) {
                bs0[] bs0VarArr = this.f35609n0;
                bs0 bs0Var2 = bs0VarArr[0];
                if (bs0Var2 != null && bs0Var2.F == 13 && (dq0Var = this.f35568a0) != null) {
                    bi.m5 m5Var = dq0Var.f13669n;
                    if (!z10) {
                    }
                }
                bs0 bs0Var3 = bs0VarArr[0];
                eq0 eq0Var = this.f35572b0;
                if (bs0Var3 != null && bs0Var3.F == 14 && eq0Var != null) {
                    bi.m5 m5Var2 = eq0Var.h;
                    if (!z10) {
                    }
                }
                if ((!this.F1 || (bs0Var = bs0VarArr[0]) == null || bs0Var.F != 13) && ((eq0Var == null || !eq0Var.g()) && (hq0Var == null || !hq0Var.f50340f))) {
                    I1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    w0();
                    this.B1 = false;
                    this.A1 = true;
                    this.C1 = (int) motionEvent.getX();
                    setHeaderEnabled(false);
                    dr0Var.setEnabled(false);
                    bs0 bs0Var4 = bs0VarArr[1];
                    bs0Var4.F = i14;
                    bs0Var4.setVisibility(0);
                    this.f35602k1 = z10;
                    B1(true);
                    if (z10) {
                        bs0VarArr[1].setTranslationX(bs0VarArr[0].getMeasuredWidth());
                    } else {
                        bs0VarArr[1].setTranslationX(-bs0VarArr[0].getMeasuredWidth());
                    }
                    Z0(getTabProgress());
                    return true;
                }
            }
        }
        return false;
    }

    public SparseArray<org.telegram.messenger.fj> getActionModeSelected() {
        return this.f35577c1[0];
    }

    public float getBottomButtonStoriesVisibility() {
        bs0 bs0Var;
        bs0 bs0Var2;
        boolean z10;
        boolean z11;
        fi.h6 h6Var;
        fi.h6 h6Var2;
        float f10 = 1.0f;
        bs0[] bs0VarArr = this.f35609n0;
        if (bs0VarArr == null || (bs0Var = bs0VarArr[0]) == null || (bs0Var2 = bs0VarArr[1]) == null || bs0Var.f33774w == null || bs0Var2.f33774w == null) {
            return 1.0f;
        }
        int i7 = bs0Var.F;
        int i10 = bs0Var2.F;
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
        float visibilityFactor = 1.0f - bs0VarArr[0].f33774w.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - bs0VarArr[1].f33774w.getVisibilityFactor();
        dt0 z12 = z1(bs0VarArr[0].F);
        if (i7 == 8 || (z12 != null && (h6Var2 = z12.f34504s) != null && h6Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        dt0 z13 = z1(i10);
        if (i10 != 8 && (z13 == null || (h6Var = z13.f34504s) == null || h6Var.g() <= 0)) {
            f10 = visibilityFactor2;
        }
        if (!z10) {
            visibilityFactor = f10;
        }
        if (!z11) {
            f10 = visibilityFactor;
        }
        return org.telegram.messenger.g0.T1(visibilityFactor, f10, Math.abs(bs0VarArr[0].getTranslationX() / bs0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        bs0[] bs0VarArr = this.f35609n0;
        bs0 bs0Var = bs0VarArr[1];
        if (bs0Var != null && bs0Var.getVisibility() == 0) {
            if (this.f35599j1 && !this.l1) {
                return bs0VarArr[1].F;
            }
            if (Math.abs(bs0VarArr[1].getTranslationX()) < bs0VarArr[1].getMeasuredWidth() / 2.0f) {
                return bs0VarArr[1].F;
            }
        }
        return getSelectedTab();
    }

    public ck0 getCurrentListView() {
        or0 or0Var;
        bs0 bs0Var = this.f35609n0[0];
        int i7 = bs0Var.F;
        if (i7 == 13) {
            return this.f35568a0.getCurrentListView();
        }
        if (i7 == 14) {
            return this.f35572b0.getCurrentListView();
        }
        if (i7 == 12 && (or0Var = this.W) != null) {
            return or0Var.f46944a.A0;
        }
        return bs0Var.h;
    }

    public int getInitialTab() {
        return 0;
    }

    public int getPhotosVideosTypeFilter() {
        return this.f35636w1[0].f41426q;
    }

    public TextView getSaveItem() {
        return this.f35628t0;
    }

    public org.telegram.ui.ActionBar.r0 getSearchItem() {
        return this.f35617q0;
    }

    public ph0 getSearchOptionsItem() {
        return this.f35632v0;
    }

    public int getSelectedTab() {
        int currentTabId = this.L0.getCurrentTabId();
        hq0 hq0Var = this.f35576c0;
        if (hq0Var != null && currentTabId == 8) {
            int currentAlbumId = hq0Var.getCurrentAlbumId();
            if (currentAlbumId == 0) {
                return 8;
            }
            if (currentAlbumId > 0) {
                return x1(currentAlbumId).f35164a;
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
            bs0[] bs0VarArr = this.f35609n0;
            if (i7 < bs0VarArr.length) {
                bs0 bs0Var = bs0VarArr[i7];
                if (bs0Var != null) {
                    f10 = ((1.0f - Math.abs(bs0Var.getTranslationX() / getWidth())) * bs0Var.F) + f10;
                }
                i7++;
            } else {
                return f10;
            }
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.w6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.w6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.D0, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29805z6));
        int i7 = org.telegram.ui.ActionBar.n6.f29807z8;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f35611o0, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        org.telegram.ui.ActionBar.r0 r0Var = this.f35638x0;
        if (r0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.w6(r0Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        }
        org.telegram.ui.ActionBar.r0 r0Var2 = this.f35635w0;
        if (r0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.w6(r0Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        }
        Drawable[] drawableArr = {this.G0};
        int i10 = org.telegram.ui.ActionBar.n6.f29788y8;
        ImageView imageView = this.F0;
        arrayList.add(new org.telegram.ui.ActionBar.w6(imageView, 8, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.E0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29394d6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.L0, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29778xi));
        dr0 dr0Var = this.L0;
        arrayList.add(new org.telegram.ui.ActionBar.w6(dr0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29759wi));
        arrayList.add(new org.telegram.ui.ActionBar.w6(dr0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29740vi));
        arrayList.add(new org.telegram.ui.ActionBar.w6(dr0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29797yi));
        zq0 zq0Var = this.U0;
        if (zq0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.w6(zq0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29730v7));
            arrayList.add(new org.telegram.ui.ActionBar.w6(zq0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29711u7));
            arrayList.add(new org.telegram.ui.ActionBar.w6(zq0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29787y7));
            arrayList.add(new org.telegram.ui.ActionBar.w6(zq0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.A7));
        }
        final int i11 = 0;
        while (true) {
            bs0[] bs0VarArr = this.f35609n0;
            if (i11 < bs0VarArr.length) {
                org.telegram.ui.ActionBar.v6 v6Var = new org.telegram.ui.ActionBar.v6() {
                    @Override
                    public final void b() {
                        bs0[] bs0VarArr2 = gt0.this.f35609n0;
                        int i12 = i11;
                        lq0 lq0Var = bs0VarArr2[i12].h;
                        if (lq0Var != null) {
                            int childCount = lq0Var.getChildCount();
                            for (int i13 = 0; i13 < childCount; i13++) {
                                View childAt = bs0VarArr2[i12].h.getChildAt(i13);
                                if (childAt instanceof org.telegram.ui.Cells.q7) {
                                    org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) childAt;
                                    for (int i14 = 0; i14 < 6; i14++) {
                                        q7Var.f31291a[i14].f31130e.invalidate();
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
                arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29674s8));
                arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29486i6));
                arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].f33774w, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29377c7));
                int i12 = org.telegram.ui.ActionBar.n6.f29468h6;
                arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i12));
                arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.ra.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, v6Var, org.telegram.ui.ActionBar.n6.f29576n6));
                arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, v6Var, org.telegram.ui.ActionBar.n6.O7));
                arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, v6Var, org.telegram.ui.ActionBar.n6.P7));
                arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, v6Var, org.telegram.ui.ActionBar.n6.Q7));
                arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, v6Var, org.telegram.ui.ActionBar.n6.R7));
                arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, v6Var, org.telegram.ui.ActionBar.n6.S7));
                arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, v6Var, org.telegram.ui.ActionBar.n6.T7));
                arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, v6Var, org.telegram.ui.ActionBar.n6.U7));
                int i13 = org.telegram.ui.ActionBar.n6.i7;
                arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i13));
                int i14 = org.telegram.ui.ActionBar.n6.f29524k7;
                arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.qj));
                arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i12));
                arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, 8192, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i13));
                arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, 16384, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, 8192, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i13));
                arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, 16384, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, 8192, new Class[]{org.telegram.ui.Cells.q7.class}, (Paint) null, (Drawable[]) null, v6Var, i13));
                arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, 16384, new Class[]{org.telegram.ui.Cells.q7.class}, (Paint) null, (Drawable[]) null, v6Var, i14));
                arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.i2.class}, new String[]{"backgroundPaint"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ci));
                arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, 8192, new Class[]{org.telegram.ui.Cells.i2.class}, (Paint) null, (Drawable[]) null, v6Var, i13));
                arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, 16384, new Class[]{org.telegram.ui.Cells.i2.class}, (Paint) null, (Drawable[]) null, v6Var, i14));
                arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].h, 0, (Class[]) null, (Paint) null, new Drawable[]{this.B0}, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29358b7));
                arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].f33774w.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.w6(bs0VarArr[i11].f33774w.f36896e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29786y6));
                i11++;
            } else {
                return arrayList;
            }
        }
    }

    public int getTopPanelShift() {
        return this.f35616p2;
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
        int i10 = this.f35574b2 + this.f35588f2;
        if (z10) {
            i7 = org.telegram.messenger.g0.L(52.0f);
        } else {
            i7 = 0;
        }
        return i10 + i7;
    }

    public final void i1(v4.i0 i0Var) {
        if (i0Var instanceof at0) {
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
            ps0 ps0Var = this.Q;
            if (i0Var == ps0Var) {
                ps0Var.f38547r = null;
            }
        }
    }

    public final int j0(int i7) {
        int i10;
        int n02 = n0(i7) + org.telegram.messenger.g0.L(54.0f) + this.d2 + this.f35584e2 + this.f35616p2;
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
            bs0[] bs0VarArr = this.f35609n0;
            if (i10 < bs0VarArr.length) {
                lq0 lq0Var = bs0VarArr[i10].h;
                if (lq0Var != null) {
                    int i11 = 0;
                    int i12 = 0;
                    for (int i13 = 0; i13 < lq0Var.getChildCount(); i13++) {
                        View childAt = lq0Var.getChildAt(i13);
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
                        int i14 = bs0VarArr[i10].F;
                        int i15 = -1;
                        if (z0(i14)) {
                            dt0 z12 = z1(i14);
                            if (z12 != null && z12.f34504s != null) {
                                int i16 = 0;
                                while (true) {
                                    if (i16 >= z12.f34504s.f12045i.size()) {
                                        break;
                                    } else if (i11 == ((org.telegram.messenger.fj) z12.f34504s.f12045i.get(i16)).e1()) {
                                        i15 = i16;
                                        break;
                                    } else {
                                        i16++;
                                    }
                                }
                            }
                            i7 = i15;
                        } else if (i14 >= 0) {
                            vs0[] vs0VarArr = this.f35636w1;
                            if (i14 < vs0VarArr.length) {
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= vs0VarArr[i14].f41412a.size()) {
                                        break;
                                    } else if (i11 == ((org.telegram.messenger.fj) vs0VarArr[i14].f41412a.get(i17)).e1()) {
                                        i15 = i17;
                                        break;
                                    } else {
                                        i17++;
                                    }
                                }
                                i7 = vs0VarArr[i14].f41422m + i15;
                            }
                        }
                        if (i15 >= 0) {
                            ((v4.c0) lq0Var.getLayoutManager()).h1(i7, (-bs0VarArr[i10].h.getPaddingTop()) + i12);
                            if (this.f35622r1) {
                                bs0 bs0Var = bs0VarArr[i10];
                                bs0Var.f33772r.h1(i7, (-bs0Var.h.getPaddingTop()) + i12);
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
        bs0[] bs0VarArr = this.f35609n0;
        bs0 bs0Var = bs0VarArr[1];
        if (bs0Var != null && v0(bs0Var.F)) {
            f11 = 0.0f + f10;
        }
        bs0 bs0Var2 = bs0VarArr[0];
        if (bs0Var2 != null && v0(bs0Var2.F)) {
            return (1.0f - f10) + f11;
        }
        return f11;
    }

    public final void k1(int i7) {
        dr0 dr0Var;
        if (!this.P1 && (dr0Var = this.L0) != null) {
            dr0Var.g(null, i7, dr0Var.Q.get(i7));
        }
    }

    public final float l0(float f10) {
        float f11 = 0.0f;
        if (A0()) {
            return 0.0f;
        }
        bs0[] bs0VarArr = this.f35609n0;
        bs0 bs0Var = bs0VarArr[1];
        if (bs0Var != null && F0(bs0Var.F) && bs0VarArr[1].F != 11) {
            f11 = 0.0f + f10;
        }
        bs0 bs0Var2 = bs0VarArr[0];
        if (bs0Var2 != null && F0(bs0Var2.F) && bs0VarArr[0].F != 11) {
            return (1.0f - f10) + f11;
        }
        return f11;
    }

    public final void l1(float f10, int i7) {
        int i10;
        dr0 dr0Var = this.L0;
        if (dr0Var != null) {
            if (J0(i7)) {
                i10 = 8;
            } else {
                i10 = i7;
            }
            dr0Var.i(f10, i10);
        }
        hq0 hq0Var = this.f35576c0;
        if (hq0Var != null) {
            f71 f71Var = hq0Var.f50337b;
            if (J0(i7)) {
                f71Var.g(f10, w1(i7));
            } else if (i7 == 8) {
                f71Var.g(f10, 0);
            }
        }
    }

    @Override
    public final boolean m() {
        return false;
    }

    public final int m0(int i7) {
        dt0 z12;
        fi.h6 h6Var;
        if (z0(i7) && (z12 = z1(i7)) != null && (h6Var = z12.f34504s) != null) {
            return h6Var.g();
        }
        return 0;
    }

    public final void m1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i7 = 0;
        while (true) {
            bs0[] bs0VarArr = this.f35609n0;
            if (i7 < bs0VarArr.length) {
                bs0 bs0Var = bs0VarArr[i7];
                if (bs0Var.F != 7 || bs0Var.h.getAdapter() == null || bs0VarArr[i7].h.getAdapter().b() == 0 || this.f35642y1.getMessagesController().R1().f12389j.size() <= 0) {
                    i7++;
                } else {
                    return;
                }
            } else {
                if (this.G == 0) {
                    tr0 tr0Var = this.f35579d0;
                    tr0Var.d = chatFull;
                    tr0Var.f40090e = arrayList;
                }
                P1(true);
                for (int i10 = 0; i10 < bs0VarArr.length; i10++) {
                    bs0 bs0Var2 = bs0VarArr[i10];
                    if (bs0Var2.F == 7 && bs0Var2.h.getAdapter() != null) {
                        org.telegram.messenger.g0.r2(bs0VarArr[i10].h);
                    }
                }
                return;
            }
        }
    }

    public final int n0(int i7) {
        float f10;
        hq0 hq0Var = this.f35576c0;
        if (hq0Var != null && (J0(i7) || i7 == 8)) {
            f10 = hq0Var.getVisibilityFactor() * org.telegram.messenger.g0.L(40.0f);
        } else {
            f10 = 0.0f;
        }
        return (int) f10;
    }

    public final void n1(int i7, int i10, int i11, int i12) {
        bs0[] bs0VarArr;
        boolean z10;
        boolean z11 = true;
        this.f35578c2 = true;
        this.d2 = i7;
        this.f35584e2 = i10;
        this.f35588f2 = i11;
        this.f35574b2 = i12;
        G();
        eq0 eq0Var = this.f35572b0;
        if (eq0Var != null) {
            if (eq0Var.M != i10 || eq0Var.N != i11) {
                eq0Var.M = i10;
                eq0Var.N = i11;
                if (i10 == 0 && i11 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                eq0Var.setClipChildren(z10);
                eq0Var.h.setClipChildren((i10 == 0 && i11 == 0) ? false : false);
                eq0Var.n();
            }
            H1();
        }
        for (bs0 bs0Var : this.f35609n0) {
            if (bs0Var != null) {
                bs0Var.setClipChildren(false);
                J1(bs0Var);
                setPageOverscan(bs0Var.h);
                setPageOverscan(bs0Var.f33771n);
                int paddingTop = bs0Var.h.getPaddingTop();
                lq0 lq0Var = bs0Var.h;
                int paddingLeft = lq0Var.getPaddingLeft();
                lq0 lq0Var2 = bs0Var.h;
                int j02 = j0(bs0Var.F);
                lq0Var2.f33442h3 = j02;
                int paddingRight = bs0Var.h.getPaddingRight();
                lq0 lq0Var3 = bs0Var.h;
                int i02 = i0(I0());
                lq0Var3.f33443i3 = i02;
                lq0Var.setPadding(paddingLeft, j02, paddingRight, i02);
                int paddingTop2 = paddingTop - bs0Var.h.getPaddingTop();
                if (paddingTop2 != 0) {
                    org.telegram.messenger.g0.J(bs0Var.h, new op0(bs0Var, paddingTop2, 1));
                }
                bs0Var.f33774w.setPadding(0, i7, 0, i12);
                or0 or0Var = this.W;
                if (or0Var != null && or0Var.getParent() == bs0Var) {
                    p1(org.telegram.messenger.g0.L(56.0f) + i7, or0Var);
                }
                dq0 dq0Var = this.f35568a0;
                if (dq0Var != null && dq0Var.getParent() == bs0Var) {
                    p1(i7, dq0Var);
                }
            }
        }
        setClipChildren(false);
        requestLayout();
        invalidate();
    }

    public final void o1(int i7, boolean z10) {
        this.D0.a(i7, z10);
        org.telegram.ui.ActionBar.a5 a5Var = this.I;
        if (a5Var != null) {
            a5Var.E(i7, z10);
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i7 = 0;
        while (true) {
            bs0[] bs0VarArr = this.f35609n0;
            if (i7 < bs0VarArr.length) {
                lq0 lq0Var = bs0VarArr[i7].h;
                if (lq0Var != null) {
                    lq0Var.getViewTreeObserver().addOnPreDrawListener(new jr0(this, i7, 0));
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
        vr0 vr0Var = this.G1;
        if (vr0Var.f() != null) {
            i11 = vr0Var.f().getHeight();
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
            } else if (childAt instanceof bs0) {
                i12 = i7;
                measureChildWithMargins(childAt, i12, 0, View.MeasureSpec.makeMeasureSpec(i11, 1073741824), 0);
                lq0 lq0Var = ((bs0) childAt).h;
                lq0Var.setPadding(0, lq0Var.f33440f3, 0, lq0Var.f33441g3);
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
            org.telegram.ui.ActionBar.h2 h2Var = this.f35642y1;
            if (h2Var.getParentLayout() != null && !((ActionBarLayout) h2Var.getParentLayout()).i() && !T() && !this.f35567a) {
                if (motionEvent != null) {
                    if (this.E1 == null) {
                        this.E1 = VelocityTracker.obtain();
                    }
                    this.E1.addMovement(motionEvent);
                    hi.m3 m3Var = this.H1;
                    if (m3Var != null) {
                        m3Var.f(true);
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.A1 && !this.B1) {
                    if (motionEvent.getY() >= org.telegram.messenger.g0.L(90.0f) + this.d2) {
                        this.f35644z1 = motionEvent.getPointerId(0);
                        this.B1 = true;
                        this.C1 = (int) motionEvent.getX();
                        this.D1 = (int) motionEvent.getY();
                        this.E1.clear();
                        return this.A1;
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f35644z1) {
                    int x10 = (int) (motionEvent.getX() - this.C1);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.D1);
                    boolean z13 = this.A1;
                    bs0[] bs0VarArr = this.f35609n0;
                    if (z13 && (((z10 = this.f35602k1) && x10 > 0) || (!z10 && x10 < 0))) {
                        if (x10 < 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!g1(motionEvent, z11)) {
                            this.B1 = true;
                            this.A1 = false;
                            bs0VarArr[0].setTranslationX(0.0f);
                            bs0 bs0Var = bs0VarArr[1];
                            if (this.f35602k1) {
                                i10 = bs0VarArr[0].getMeasuredWidth();
                            } else {
                                i10 = -bs0VarArr[0].getMeasuredWidth();
                            }
                            bs0Var.setTranslationX(i10);
                            l1(0.0f, bs0VarArr[1].F);
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
                        bs0VarArr[0].setTranslationX(x10);
                        if (this.f35602k1) {
                            bs0VarArr[1].setTranslationX(bs0VarArr[0].getMeasuredWidth() + x10);
                        } else {
                            bs0VarArr[1].setTranslationX(x10 - bs0VarArr[0].getMeasuredWidth());
                        }
                        float abs2 = Math.abs(x10) / bs0VarArr[0].getMeasuredWidth();
                        if (!I()) {
                            this.f35621r0 = 0.0f;
                        } else {
                            this.f35621r0 = l0(abs2);
                            M1(abs2);
                            float k02 = k0(abs2);
                            this.f35625s0 = k02;
                            if (k02 != 0.0f && I() && !A0()) {
                                i7 = 0;
                            } else {
                                i7 = 4;
                            }
                            this.f35630u0.setVisibility(i7);
                        }
                        I1(false);
                        l1(abs2, bs0VarArr[1].F);
                        Z0(getTabProgress());
                        Y0();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f35644z1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
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
            bs0[] bs0VarArr = this.f35609n0;
            if (i10 >= bs0VarArr.length) {
                break;
            }
            bs0 bs0Var = bs0VarArr[i10];
            if (bs0Var != null) {
                int i12 = bs0Var.F;
                if ((z10 && i7 == 8 && J0(i12)) || i12 == i7) {
                    i11++;
                    width = bs0VarArr[i10].getTranslationX();
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
            org.telegram.ui.ActionBar.a5 a5Var = this.I;
            if (a5Var != null) {
                if (z10) {
                    O1();
                    a5Var.J();
                } else {
                    a5Var.w();
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
            bs0[] bs0VarArr = this.f35609n0;
            if (i10 < bs0VarArr.length) {
                bs0 bs0Var = bs0VarArr[i10];
                if (bs0Var != null) {
                    int i11 = bs0Var.F;
                    if ((z10 && i7 == 8 && J0(i11)) || i11 == i7) {
                        f10 = (1.0f - Math.abs(bs0VarArr[i10].getTranslationX() / getWidth())) + f10;
                    }
                }
                i10++;
            } else {
                return f10;
            }
        }
    }

    public final void r1(int r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gt0.r1(int, boolean):void");
    }

    public final int s0(int i7) {
        org.telegram.ui.ActionBar.i6 i6Var = this.I1;
        if (i6Var != null) {
            return i6Var.k(i7);
        }
        return org.telegram.ui.ActionBar.n6.x0(null, i7, false);
    }

    public final void s1(int i7) {
        int w12 = w1(getClosestTab());
        hq0 hq0Var = this.f35576c0;
        if (w12 != i7) {
            if (hq0Var != null) {
                hq0Var.f50337b.e(i7, hq0Var.d.i(i7));
                return;
            }
            return;
        }
        hq0Var.setReorderingAlbums(true);
        ft0 x12 = x1(i7);
        bs0 g02 = g0(x12.f35164a);
        if (g02 == null) {
            return;
        }
        lq0 lq0Var = g02.h;
        for (int i10 = 0; i10 < lq0Var.getChildCount(); i10++) {
            View childAt = lq0Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.p7) {
                ((org.telegram.ui.Cells.p7) childAt).l(true, true);
            }
        }
        et0 et0Var = x12.f35166c;
        if (et0Var != null && !et0Var.f34507y) {
            et0Var.f34507y = true;
        }
        I1(true);
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        boolean z10;
        int i7;
        TLRPC.ChatFull chatFull2 = this.f35590g1;
        if (chatFull2 != null && chatFull2.stories_pinned_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f35590g1 = chatFull;
        if (chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.f35587f1 == 0) {
                this.f35587f1 = -j3;
                int i10 = 0;
                while (true) {
                    vs0[] vs0VarArr = this.f35636w1;
                    if (i10 >= vs0VarArr.length) {
                        break;
                    }
                    if (vs0VarArr[i10].f41413b[1].size() == 0) {
                        vs0 vs0Var = vs0VarArr[i10];
                        vs0Var.f41419j[1] = this.f35590g1.migrated_from_max_id;
                        vs0Var.f41418i[1] = false;
                    }
                    i10++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.f35590g1;
        if (chatFull3 != null && z10 != chatFull3.stories_pinned_available) {
            dr0 dr0Var = this.L0;
            if (dr0Var != null) {
                if (A0()) {
                    i7 = 9;
                } else {
                    i7 = 8;
                }
                dr0Var.setInitialTabId(i7);
            }
            P1(true);
            B1(false);
        }
    }

    public void setCommonGroupsCount(int i7) {
        if (this.G == 0) {
            this.f35569a1[6] = i7;
        }
        P1(true);
        N();
    }

    public void setForwardRestrictedHint(hi.m3 m3Var) {
        this.H1 = m3Var;
    }

    public void setMergeDialogId(long j3) {
        this.f35587f1 = j3;
    }

    public void setNewMediaCounts(int[] iArr) {
        int[] iArr2;
        int i7 = 0;
        while (true) {
            iArr2 = this.f35569a1;
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
        this.f35603k2 = runnable;
    }

    @Override
    public final void setPadding(int i7, int i10, int i11, int i12) {
        this.O1 = i10;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            bs0[] bs0VarArr = this.f35609n0;
            if (i14 >= bs0VarArr.length) {
                break;
            }
            bs0VarArr[i14].setTranslationY(this.O1);
            i14++;
        }
        if (this.S0 != null) {
            U();
        } else {
            zq0 zq0Var = this.U0;
            if (zq0Var != null) {
                zq0Var.setTranslationY(org.telegram.messenger.g0.L(48.0f) + i10);
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
        bs0[] bs0VarArr;
        this.f35594h2 = qVar;
        eq0 eq0Var = this.f35572b0;
        if (eq0Var != null) {
            eq0Var.setGlassEngine(qVar);
        }
        for (bs0 bs0Var : this.f35609n0) {
            if (bs0Var != null) {
                bs0Var.h.setCaptureSectionsDecoratorAllowed(true);
                qVar.b(bs0Var.h);
            }
        }
    }

    public void setPagesPaddingBottom(int i7) {
        if (this.f35574b2 != i7) {
            this.f35574b2 = i7;
            bs0[] bs0VarArr = this.f35609n0;
            if (bs0VarArr != null) {
                for (bs0 bs0Var : bs0VarArr) {
                    if (bs0Var != null) {
                        lq0 lq0Var = bs0Var.h;
                        int paddingLeft = lq0Var.getPaddingLeft();
                        lq0 lq0Var2 = bs0Var.h;
                        int i10 = lq0Var2.f33440f3;
                        int paddingRight = lq0Var2.getPaddingRight();
                        lq0 lq0Var3 = bs0Var.h;
                        int i02 = i0(I0());
                        lq0Var3.f33443i3 = i02;
                        lq0Var.setPadding(paddingLeft, i10, paddingRight, i02);
                    }
                }
            }
        }
    }

    public void setPagesVisibleOverscanTop(int i7) {
        if (this.f35591g2 != i7) {
            this.f35591g2 = i7;
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
                bs0[] bs0VarArr = this.f35609n0;
                if (i7 < bs0VarArr.length) {
                    F1(bs0VarArr[i7], true);
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        boolean z10;
        TLRPC.UserFull userFull2 = this.f35593h1;
        if (userFull2 != null && userFull2.stories_pinned_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f35593h1 = userFull;
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
            bs0[] bs0VarArr = this.f35609n0;
            if (i10 >= bs0VarArr.length) {
                break;
            }
            int measuredHeight = getMeasuredHeight();
            if (bs0VarArr[i10].F == 8) {
                f10 = 280.0f;
            } else {
                f10 = 120.0f;
            }
            float f11 = (-(measuredHeight - Math.max(i7, org.telegram.messenger.g0.L(f10)))) / 2.0f;
            bs0VarArr[i10].f33774w.setTranslationY(f11);
            bs0VarArr[i10].f33773s.setTranslationY(-f11);
            i10++;
        }
        dq0 dq0Var = this.f35568a0;
        if (dq0Var != null) {
            dq0Var.setVisibleHeight(i7);
        }
        eq0 eq0Var = this.f35572b0;
        if (eq0Var != null) {
            eq0Var.setVisibleHeight(i7);
        }
    }

    public final boolean t0() {
        if (this.f35642y1.getConnectionsManager().getConnectionState() == 3) {
            return true;
        }
        return false;
    }

    public final void t1(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gt0.t1(boolean):void");
    }

    @Override
    public final void u(org.telegram.ui.Cells.u2 u2Var) {
        int i7;
        org.telegram.ui.ActionBar.h2 h2Var = this.f35642y1;
        if (h2Var != null && h2Var.getMessagesController().R1().K(u2Var.getDialogId())) {
            h2Var.getOrCreateStoryViewer().getClass();
            fi.f9 orCreateStoryViewer = h2Var.getOrCreateStoryViewer();
            Context context = h2Var.getContext();
            long dialogId = u2Var.getDialogId();
            fi.y6 a10 = fi.y6.a((ck0) u2Var.getParent());
            if ((h2Var instanceof ProfileActivity) && ((ProfileActivity) h2Var).f43637s1) {
                i7 = org.telegram.messenger.g0.L(68.0f);
            } else {
                i7 = 0;
            }
            a10.f12788s += i7;
            orCreateStoryViewer.J(context, dialogId, a10);
        }
    }

    public final boolean u0() {
        SparseArray[] sparseArrayArr;
        org.telegram.messenger.fj fjVar;
        TLRPC.Message message;
        boolean z10 = false;
        for (int i7 = 1; i7 >= 0; i7--) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (true) {
                sparseArrayArr = this.f35577c1;
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
                if (num.intValue() > 0 && (fjVar = (org.telegram.messenger.fj) sparseArrayArr[i7].get(num.intValue())) != null && (message = fjVar.f23965k) != null && message.noforwards) {
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
            bs0[] bs0VarArr = this.f35609n0;
            if (i7 < bs0VarArr.length) {
                int childCount = bs0VarArr[i7].h.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = bs0VarArr[i7].h.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.i2) {
                        ImageReceiver photoImage = ((org.telegram.ui.Cells.i2) childAt).getPhotoImage();
                        if (i7 == 0) {
                            photoImage.f22664u0 = true;
                            photoImage.P0(false);
                        } else {
                            photoImage.f22664u0 = false;
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
        bs0[] bs0VarArr;
        try {
            this.J1.a(s0(org.telegram.ui.ActionBar.n6.f29394d6));
            org.telegram.ui.ActionBar.y1 y1Var = this.G0;
            if (y1Var != null) {
                y1Var.a(s0(org.telegram.ui.ActionBar.n6.f29788y8));
            }
            NumberTextView numberTextView = this.D0;
            if (numberTextView != null) {
                numberTextView.setTextColor(s0(org.telegram.ui.ActionBar.n6.f29788y8));
            }
            D1();
            invalidate();
            for (bs0 bs0Var : this.f35609n0) {
                if (bs0Var != null && bs0Var.M) {
                    bs0Var.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final boolean v0(int i7) {
        if (i7 != 0) {
            if (((i7 != 8 && !J0(i7)) || !TextUtils.isEmpty(getStoriesHashtag())) && i7 != 9 && i7 != 11 && i7 != 13) {
                if (i7 != 14 || this.f35572b0 == null) {
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
        bs0 bs0Var;
        bs0 bs0Var2;
        int measuredWidth2;
        bs0 bs0Var3;
        bs0 bs0Var4;
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
                bs0[] bs0VarArr = this.f35609n0;
                float x10 = bs0VarArr[0].getX();
                this.f35596i1 = new AnimatorSet();
                if (Math.abs(x10) < bs0VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.l1 = z10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new e60(this, 20));
                boolean z12 = this.l1;
                Property property = View.TRANSLATION_X;
                if (z12) {
                    measuredWidth = Math.abs(x10);
                    if (this.f35602k1) {
                        this.f35596i1.playTogether(ObjectAnimator.ofFloat(bs0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(bs0VarArr[1], property, bs0Var4.getMeasuredWidth()), ofFloat);
                    } else {
                        this.f35596i1.playTogether(ObjectAnimator.ofFloat(bs0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(bs0VarArr[1], property, -bs0Var3.getMeasuredWidth()), ofFloat);
                    }
                } else {
                    measuredWidth = bs0VarArr[0].getMeasuredWidth() - Math.abs(x10);
                    if (this.f35602k1) {
                        this.f35596i1.playTogether(ObjectAnimator.ofFloat(bs0VarArr[0], property, -bs0Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(bs0VarArr[1], property, 0.0f), ofFloat);
                    } else {
                        this.f35596i1.playTogether(ObjectAnimator.ofFloat(bs0VarArr[0], property, bs0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(bs0VarArr[1], property, 0.0f), ofFloat);
                    }
                }
                this.f35596i1.setInterpolator(f35564u2);
                int measuredWidth3 = getMeasuredWidth();
                float f12 = measuredWidth3 / 2;
                float I = (org.telegram.messenger.g0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f12) + f12;
                float abs = Math.abs(f10);
                if (abs > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(I / abs) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                this.f35596i1.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                this.f35596i1.addListener(new gr0(this, 1));
                this.f35596i1.start();
                this.f35599j1 = true;
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
        this.O0.setInterpolator(lr.f37209g);
        this.O0.addListener(new gr0(this, 0));
        this.O0.start();
    }

    public final int w1(int i7) {
        ft0 y12 = y1(i7);
        if (y12 == null) {
            return -1;
        }
        return y12.f35165b;
    }

    public boolean x0() {
        return false;
    }

    public final ft0 x1(int i7) {
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = this.f35607m2;
        ft0 ft0Var = (ft0) hashMap.get(valueOf);
        if (ft0Var == null) {
            ft0 ft0Var2 = new ft0(this, getContext(), i7);
            hashMap.put(Integer.valueOf(i7), ft0Var2);
            this.f35610n2.put(Integer.valueOf(ft0Var2.f35164a), Integer.valueOf(i7));
            return ft0Var2;
        }
        return ft0Var;
    }

    public boolean y0() {
        return !(this instanceof z20);
    }

    public final ft0 y1(int i7) {
        Integer num = (Integer) this.f35610n2.get(Integer.valueOf(i7));
        if (num == null) {
            return null;
        }
        return (ft0) this.f35607m2.get(num);
    }

    public final void z(View view) {
        bs0[] bs0VarArr = this.f35609n0;
        addView(view, Math.max(indexOfChild(bs0VarArr[0]), indexOfChild(bs0VarArr[1])) + 1, c8.ma.e(-1, 0, 48));
        view.getLayoutParams().height = 0;
    }

    public final dt0 z1(int i7) {
        ft0 y12;
        if (i7 == 8) {
            return this.f35586f0;
        }
        if (i7 == 9) {
            return this.f35592h0;
        }
        if (J0(i7) && (y12 = y1(i7)) != null) {
            return y12.f35166c;
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
