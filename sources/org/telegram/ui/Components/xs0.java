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
public abstract class xs0 extends FrameLayout implements org.telegram.ui.ActionBar.a6, org.telegram.messenger.ls, org.telegram.ui.Cells.p2, jj0 {
    public static final int[] f40365s2 = {0, 1, 2, 4};
    public static final qp0 f40366t2 = new qp0(0);
    public static final int f40367u2 = org.telegram.messenger.g0.L(7.0f);
    public static final int f40368v2 = org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(14.0f);
    public final Drawable A0;
    public boolean A1;
    public boolean B0;
    public int B1;
    public final NumberTextView C0;
    public int C1;
    public final lz D;
    public final LinearLayout D0;
    public VelocityTracker D1;
    public final int E;
    public final ImageView E0;
    public boolean E1;
    public final long F;
    public final org.telegram.ui.ActionBar.y1 F0;
    public final mr0 F1;
    public final org.telegram.ui.ActionBar.k G;
    public final ArrayList G0;
    public fi.m3 G1;
    public final org.telegram.ui.ActionBar.y4 H;
    public final ArrayList H0;
    public final org.telegram.ui.ActionBar.f6 H1;
    public final org.telegram.ui.ActionBar.f5 I;
    public final ArrayList I0;
    public final ri.c I1;
    public final dr0 J;
    public final ArrayList J0;
    public final ab.b0 J1;
    public final rs0 K;
    public final tq0 K0;
    public boolean K1;
    public final ls0 L;
    public final qq0 L0;
    public final h2.f L1;
    public final ks0 M;
    public final org.telegram.ui.Cells.t0 M0;
    public org.telegram.ui.q8 M1;
    public final ks0 N;
    public AnimatorSet N0;
    public int N1;
    public final ks0 O;
    public final so0 O0;
    public boolean O1;
    public final gs0 P;
    public final ArrayList P0;
    public int P1;
    public final nr0 Q;
    public float Q0;
    public AnimatorSet Q1;
    public final lr0 R;
    public final pr R0;
    public final SparseArray R1;
    public final jr0 S;
    public final FrameLayout S0;
    public long S1;
    public final is0 T;
    public final oq0 T0;
    public boolean T1;
    public final js0 U;
    public final int U0;
    public int U1;
    public final er0 V;
    public final Paint V0;
    public final ar0 V1;
    public final sp0 W;
    public boolean W0;
    public di.q6 W1;
    public boolean X0;
    public float X1;
    public ch.o0 Y0;
    public boolean Y1;
    public final int[] Z0;
    public SpannableStringBuilder Z1;
    public boolean f40369a;
    public final up0 f40370a0;
    public int f40371a1;
    public int f40372a2;
    public boolean f40373b;
    public final yp0 f40374b0;
    public final SparseArray[] f40375b1;
    public boolean f40376b2;
    public boolean f40377c;
    public final kr0 f40378c0;
    public int f40379c1;
    public int f40380c2;
    public boolean d;
    public final v4.y f40381d0;
    public boolean f40382d1;
    public int d2;
    public int f40383e;
    public final gr0 f40384e0;
    public long f40385e1;
    public int f40386e2;
    public int f40387f;
    public final us0 f40388f0;
    public TLRPC.ChatFull f40389f1;
    public int f40390f2;
    public final rp0 f40391g0;
    public TLRPC.UserFull f40392g1;
    public oi.q f40393g2;
    public float h;
    public final us0 f40394h0;
    public AnimatorSet f40395h1;
    public float f40396h2;
    public final ur0 f40397i0;
    public boolean f40398i1;
    public final RectF f40399i2;
    public final ur0 f40400j0;
    public boolean f40401j1;
    public Runnable f40402j2;
    public final ur0 f40403k0;
    public boolean f40404k1;
    public int f40405k2;
    public final qr0 f40406l0;
    public final long l1;
    public final HashMap f40407l2;
    public final sr0[] m0;
    public boolean f40408m1;
    public final HashMap f40409m2;
    public float f40410n;
    public final org.telegram.ui.ActionBar.r0 f40411n0;
    public boolean n1;
    public int f40412n2;
    public final org.telegram.ui.ActionBar.r0 f40413o0;
    public final int[] f40414o1;
    public int f40415o2;
    public final org.telegram.ui.ActionBar.r0 f40416p0;
    public float f40417p1;
    public boolean f40418p2;
    public float f40419q0;
    public boolean f40420q1;
    public int f40421q2;
    public boolean f40422r;
    public float f40423r0;
    public int f40424r1;
    public int f40425r2;
    public int f40426s;
    public final TextView f40427s0;
    public int f40428s1;
    public final ImageView f40429t0;
    public final eq0 f40430t1;
    public final ch0 f40431u0;
    public float f40432u1;
    public final org.telegram.ui.ActionBar.r0 f40433v0;
    public final ms0[] f40434v1;
    public int f40435w;
    public final org.telegram.ui.ActionBar.r0 f40436w0;
    public final ps0 f40437w1;
    public int f40438x;
    public final org.telegram.ui.ActionBar.r0 f40439x0;
    public final org.telegram.ui.ActionBar.f2 f40440x1;
    public final Rect f40441y;
    public final org.telegram.ui.ActionBar.r0 f40442y0;
    public int f40443y1;
    public int f40444z0;
    public boolean f40445z1;

    public xs0(android.content.Context r34, long r35, org.telegram.ui.Components.ps0 r37, int r38, java.util.ArrayList r39, org.telegram.tgnet.TLRPC.ChatFull r40, org.telegram.tgnet.TLRPC.UserFull r41, int r42, int r43, org.telegram.ui.ActionBar.f2 r44, org.telegram.ui.Components.mr0 r45, int r46, org.telegram.ui.ActionBar.f6 r47, dh.c r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xs0.<init>(android.content.Context, long, org.telegram.ui.Components.ps0, int, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.tgnet.TLRPC$UserFull, int, int, org.telegram.ui.ActionBar.f2, org.telegram.ui.Components.mr0, int, org.telegram.ui.ActionBar.f6, dh.c):void");
    }

    public static boolean I0(int i7) {
        if ((i7 & (-65536)) == 65536) {
            return true;
        }
        return false;
    }

    public static r3 X(int i7, long j3, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        r3 r3Var = new r3(context, f6Var);
        ImageView imageView = (ImageView) r3Var.d;
        TextView textView = (TextView) r3Var.f37480c;
        if (i7 == 0) {
            if (org.telegram.messenger.m5.C(j3)) {
                textView.setText(org.telegram.messenger.hd.M0(2131748195, null));
                return r3Var;
            }
            textView.setText(org.telegram.messenger.hd.M0(2131748197, null));
            return r3Var;
        } else if (i7 == 1) {
            if (org.telegram.messenger.m5.C(j3)) {
                textView.setText(org.telegram.messenger.hd.M0(2131748156, null));
                return r3Var;
            }
            textView.setText(org.telegram.messenger.hd.M0(2131748157, null));
            return r3Var;
        } else if (i7 == 2) {
            if (org.telegram.messenger.m5.C(j3)) {
                textView.setText(org.telegram.messenger.hd.M0(2131748151, null));
                return r3Var;
            }
            textView.setText(org.telegram.messenger.hd.M0(2131748152, null));
            return r3Var;
        } else if (i7 == 3) {
            if (org.telegram.messenger.m5.C(j3)) {
                textView.setText(org.telegram.messenger.hd.M0(2131748153, null));
                return r3Var;
            }
            textView.setText(org.telegram.messenger.hd.M0(2131748154, null));
            return r3Var;
        } else if (i7 == 4) {
            if (org.telegram.messenger.m5.C(j3)) {
                textView.setText(org.telegram.messenger.hd.M0(2131748158, null));
                return r3Var;
            }
            textView.setText(org.telegram.messenger.hd.M0(2131748159, null));
            return r3Var;
        } else if (i7 == 5) {
            if (org.telegram.messenger.m5.C(j3)) {
                textView.setText(org.telegram.messenger.hd.M0(2131748155, null));
                return r3Var;
            }
            textView.setText(org.telegram.messenger.hd.M0(2131748207, null));
            return r3Var;
        } else if (i7 == 6) {
            imageView.setImageDrawable(null);
            textView.setText(org.telegram.messenger.hd.M0(2131748205, null));
            return r3Var;
        } else {
            if (i7 == 7) {
                imageView.setImageDrawable(null);
                textView.setText("");
            }
            return r3Var;
        }
    }

    public static void a(xs0 xs0Var, TL_stories.StoryItem storyItem, di.r6 r6Var) {
        xs0Var.getStoriesController().c(r6Var.f9701a, xs0Var.l1, storyItem);
        org.telegram.messenger.g0.i3(new v80(13, xs0Var, r6Var), 100L);
    }

    public static void d(xs0 xs0Var, int i7, TL_stories.StoryItem storyItem, String str) {
        org.telegram.ui.q8 q8Var = new org.telegram.ui.q8(xs0Var, i7, storyItem, 15);
        di.y6 storiesController = xs0Var.getStoriesController();
        long j3 = xs0Var.l1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.f0(i7, j3, arrayList);
        hc.a0(xs0Var.f40440x1).K(2131623979, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(1, "StoryRemovedFromAlbumTitle", str)), org.telegram.messenger.hd.M0(2131743886, null), q8Var).j();
    }

    public static void e(xs0 xs0Var, long j3, int i7) {
        di.m6 B = xs0Var.getStoriesController().B(j3, true);
        int i10 = B.f9354a;
        int c10 = B.c(i7);
        if (c10 == -1) {
            return;
        }
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = org.telegram.messenger.qp.s1(i10).j1(B.f9355b);
        tL_deleteAlbum.album_id = ((di.r6) B.h.remove(c10)).f9701a;
        ConnectionsManager.getInstance(i10).sendRequest(tL_deleteAlbum, null);
        B.f(true);
    }

    public static void f(xs0 xs0Var, long j3, int i7, String str) {
        di.m6 B = xs0Var.getStoriesController().B(j3, true);
        int i10 = B.f9354a;
        int c10 = B.c(i7);
        if (c10 == -1) {
            return;
        }
        ((di.r6) B.h.get(c10)).f9702b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = org.telegram.messenger.qp.s1(i10).j1(B.f9355b);
        tL_updateAlbum.album_id = i7;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i10).sendRequest(tL_updateAlbum, null);
        B.f(true);
    }

    public long getPlaylistTopicId() {
        if (org.telegram.messenger.t3.b0(this.f40440x1.getCurrentAccount(), this.l1)) {
            return this.F;
        }
        return 0L;
    }

    public di.y6 getStoriesController() {
        return org.telegram.messenger.qp.s1(this.f40440x1.getCurrentAccount()).P1();
    }

    public static void h(xs0 xs0Var, TL_stories.StoryItem storyItem) {
        xs0Var.getStoriesController().r0(xs0Var.l1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        hc.a0(xs0Var.f40440x1).G(2131623979, 5000, org.telegram.messenger.hd.G(1, "StoryArchived", new Object[0])).j();
    }

    public static void j(xs0 xs0Var, HashSet hashSet, TL_stories.StoryItem storyItem, k60 k60Var, di.r6 r6Var) {
        String a02;
        long j3 = xs0Var.l1;
        if (hashSet.contains(Integer.valueOf(r6Var.f9701a))) {
            xs0Var.getStoriesController().c(r6Var.f9701a, j3, storyItem);
            a02 = org.telegram.messenger.hd.a0(null, null, 2131744732, r6Var.f9702b);
        } else {
            di.y6 storiesController = xs0Var.getStoriesController();
            int i7 = r6Var.f9701a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.f0(i7, j3, arrayList);
            a02 = org.telegram.messenger.hd.a0(null, null, 2131744495, r6Var.f9702b);
        }
        hc.a0(xs0Var.f40440x1).Q(2131623989, 36, org.telegram.messenger.g0.X2(a02)).j();
        k60Var.u();
    }

    public static void n1(int i7, View view) {
        if (view != null && (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams.topMargin != i7) {
                marginLayoutParams.topMargin = i7;
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public static int o(View view) {
        if (view instanceof org.telegram.ui.Cells.o7) {
            return ((org.telegram.ui.Cells.o7) view).getMessageId();
        }
        if (view instanceof org.telegram.ui.Cells.h7) {
            return ((org.telegram.ui.Cells.h7) view).getMessage().f1();
        }
        if (view instanceof org.telegram.ui.Cells.g7) {
            return ((org.telegram.ui.Cells.g7) view).getMessage().f1();
        }
        return 0;
    }

    public static TLRPC.ProfileTab o0(int i7, boolean z9) {
        if (i7 != 8 && i7 != 14 && !z9) {
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

    public static void s(sr0 sr0Var, ms0[] ms0VarArr, boolean z9) {
        v80 v80Var;
        if (z9) {
            if (org.telegram.messenger.iz.f23423v1 > 0 && sr0Var.F == null && !sr0Var.H && sr0Var.h.getFastScroll() != null && sr0Var.h.getFastScroll().f38638a0 && sr0Var.h.getFastScroll().getVisibility() == 0 && ms0VarArr[0].e() >= 50) {
                int i7 = org.telegram.messenger.iz.f23423v1;
                int i10 = i7 - 1;
                if (i7 != i10) {
                    org.telegram.messenger.iz.f23423v1 = i10;
                    org.telegram.messenger.t0.f25563b.getSharedPreferences("mainconfig", 0).edit().putInt("fastScrollHintCount", org.telegram.messenger.iz.f23423v1).apply();
                }
                sr0Var.H = true;
                Context context = sr0Var.getContext();
                di.a4 a4Var = new di.a4(context, 18);
                TextView textView = new TextView(context);
                textView.setText(org.telegram.messenger.hd.M0(2131745409, null));
                textView.setTextSize(1, 14.0f);
                textView.setMaxLines(3);
                int i11 = org.telegram.ui.ActionBar.k6.f27858dg;
                org.telegram.ui.ActionBar.r6.V(textView, i11, null);
                int L = org.telegram.messenger.g0.L(6.0f);
                int i12 = org.telegram.ui.ActionBar.k6.f27877eg;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.x0(null, i12, false));
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
                a4Var.setBackground(d02);
                org.telegram.ui.ActionBar.r6.k(a4Var, d02, N, null, null);
                a4Var.addView(textView, c8.ha.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
                ?? view = new View(context);
                view.f37366a = new Random();
                Paint paint = new Paint(1);
                view.f37367b = paint;
                Paint paint2 = new Paint(1);
                view.f37368c = paint2;
                view.f37370f = 1.0f;
                view.h = 0.0f;
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i11, false), 76));
                paint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
                Paint paint3 = new Paint();
                view.d = paint3;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint3.setShader(new LinearGradient(0.0f, org.telegram.messenger.g0.L(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint3.setXfermode(new PorterDuffXfermode(mode));
                Paint paint4 = new Paint();
                view.f37369e = paint4;
                paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
                paint4.setXfermode(new PorterDuffXfermode(mode));
                a4Var.addView((View) view, c8.ha.d(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                sr0Var.F = a4Var;
                sr0Var.addView(a4Var, c8.ha.c(-2.0f, -2));
                sr0Var.F.setAlpha(0.0f);
                sr0Var.F.setScaleX(0.8f);
                sr0Var.F.setScaleY(0.8f);
                sr0Var.F.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                sr0Var.invalidate();
                v80 v80Var2 = new v80(14, sr0Var, a4Var);
                sr0Var.G = v80Var2;
                org.telegram.messenger.g0.i3(v80Var2, 4000L);
            }
        } else if (sr0Var.F != null && (v80Var = sr0Var.G) != null) {
            org.telegram.messenger.g0.r(v80Var);
            sr0Var.G.run();
            sr0Var.G = null;
            sr0Var.F = null;
        }
    }

    public void setHeaderEnabled(boolean z9) {
        org.telegram.ui.ActionBar.y4 y4Var = this.H;
        if (y4Var != null) {
            y4Var.setEnabled(z9);
        } else {
            this.G.setEnabled(z9);
        }
    }

    private void setPageOverscan(rr0 rr0Var) {
        if (this.f40376b2 && rr0Var != null) {
            rr0Var.f37730i3 = true;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rr0Var.getLayoutParams();
            if (marginLayoutParams != null) {
                int i7 = marginLayoutParams.topMargin;
                int i10 = -this.d2;
                if (i7 != i10 || marginLayoutParams.bottomMargin != (-this.f40386e2)) {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.bottomMargin = -this.f40386e2;
                    rr0Var.setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    public void setSearchItemVisibility(int i7) {
        org.telegram.ui.ActionBar.r0 r0Var = this.f40416p0;
        if (r0Var == null) {
            return;
        }
        if (this.H != null) {
            R(true, true);
        } else {
            r0Var.setVisibility(i7);
        }
    }

    public static void t(xs0 xs0Var, int i7, boolean z9) {
        sr0[] sr0VarArr = xs0Var.m0;
        if (sr0VarArr[0].E == i7) {
            return;
        }
        sr0 sr0Var = sr0VarArr[1];
        sr0Var.E = i7;
        sr0Var.setVisibility(0);
        xs0Var.w0();
        xs0Var.z1(true);
        xs0Var.f40401j1 = z9;
        xs0Var.W0();
        xs0Var.E(!xs0Var.E0(i7));
        xs0Var.G1(true);
    }

    public static int x(xs0 xs0Var, v4.g0 g0Var) {
        if (g0Var == xs0Var.f40384e0) {
            return 8;
        }
        if (g0Var == xs0Var.f40391g0) {
            return 9;
        }
        for (ws0 ws0Var : xs0Var.f40407l2.values()) {
            if (ws0Var.f40087c == g0Var) {
                return ws0Var.f40085a;
            }
        }
        return -1;
    }

    public static int y(xs0 xs0Var, v4.g0 g0Var) {
        if (g0Var == xs0Var.f40388f0) {
            return 8;
        }
        if (g0Var == xs0Var.f40394h0) {
            return 9;
        }
        for (ws0 ws0Var : xs0Var.f40407l2.values()) {
            if (ws0Var.d == g0Var) {
                return ws0Var.f40085a;
            }
        }
        return -1;
    }

    public static boolean z0(int i7) {
        if (i7 != 8 && i7 != 9 && !I0(i7)) {
            return false;
        }
        return true;
    }

    public final SpannableStringBuilder A() {
        if (this.Z1 == null) {
            this.Z1 = new SpannableStringBuilder();
            if (B0()) {
                this.Z1.append((CharSequence) org.telegram.messenger.hd.M0(2131746701, null));
            } else {
                this.Z1.append((CharSequence) "c");
                this.Z1.setSpan(new wp(2131231146, 0), 0, 1, 33);
                this.Z1.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.hd.M0(2131744810, null));
            }
        }
        return this.Z1;
    }

    public boolean A0() {
        return false;
    }

    public final void A1(org.telegram.ui.ActionBar.z0 z0Var, org.telegram.ui.ActionBar.z0 z0Var2, Runnable runnable) {
        if (this.K1) {
            return;
        }
        if (!z0Var2.getCheckView().f40058a.f31259q && z0Var.getCheckView().f40058a.f31259q) {
            float f10 = -this.f40432u1;
            this.f40432u1 = f10;
            org.telegram.messenger.g0.G3(f10, z0Var, null);
            return;
        }
        z0Var.setChecked(!z0Var.getCheckView().f40058a.f31259q);
        runnable.run();
    }

    public final void B(wr0 wr0Var, org.telegram.ui.ActionBar.f2 f2Var, long j3, int i7) {
        String K;
        if (j3 > 0) {
            K = org.telegram.messenger.t10.n(org.telegram.messenger.qp.s1(f2Var.getCurrentAccount()).a2(Long.valueOf(j3)));
        } else {
            K = org.telegram.messenger.t3.K(org.telegram.messenger.qp.s1(f2Var.getCurrentAccount()).M0(Long.valueOf(-j3)), false);
        }
        if (K == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        com.google.android.recaptcha.internal.a.s(sb2, org.telegram.messenger.qp.s1(f2Var.getCurrentAccount()).U2, "/", K, "/a/");
        sb2.append(i7);
        String sb3 = sb2.toString();
        wr0Var.b0(2131231757, new ng(this, sb3, f2Var, 20), org.telegram.messenger.hd.M0(2131744789, null), false, true);
    }

    public final boolean B0() {
        TLRPC.User a22;
        long j3 = this.l1;
        if (j3 <= 0 || (a22 = org.telegram.messenger.qp.s1(this.f40440x1.getCurrentAccount()).a2(Long.valueOf(j3))) == null || !a22.bot) {
            return false;
        }
        return true;
    }

    public final void B1() {
        if (this.H == null) {
            try {
                int s02 = s0(org.telegram.ui.ActionBar.k6.f28243y8);
                int s03 = s0(org.telegram.ui.ActionBar.k6.f28261z8);
                if (s02 != this.f40421q2 || s03 != this.f40425r2) {
                    this.f40421q2 = s02;
                    this.f40425r2 = s03;
                    org.telegram.ui.ActionBar.r0[] r0VarArr = {this.f40436w0, this.f40433v0, this.f40439x0, this.f40442y0, this.f40411n0};
                    for (int i7 = 0; i7 < 5; i7++) {
                        org.telegram.ui.ActionBar.r0 r0Var = r0VarArr[i7];
                        if (r0Var != null) {
                            r0Var.setIconColor(s02);
                            if (r0Var.getBackground() != null) {
                                org.telegram.ui.ActionBar.k6.H1(r0Var.getBackground(), s03, true);
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void C(wr0 wr0Var) {
        float f10;
        final View[] viewArr = {wr0Var.b0(2131232438, new Runnable(this) {
            public final xs0 f34738b;

            {
                this.f34738b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        xs0 xs0Var = this.f34738b;
                        xs0Var.getClass();
                        View[] viewArr2 = viewArr;
                        xs0Var.O1(viewArr2[0], viewArr2[1]);
                        return;
                    default:
                        xs0 xs0Var2 = this.f34738b;
                        xs0Var2.getClass();
                        View[] viewArr3 = viewArr;
                        xs0Var2.P1(viewArr3[0], viewArr3[1]);
                        return;
                }
            }
        }, org.telegram.messenger.hd.M0(2131748649, null), false, false), wr0Var.b0(2131232439, new Runnable(this) {
            public final xs0 f34738b;

            {
                this.f34738b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        xs0 xs0Var = this.f34738b;
                        xs0Var.getClass();
                        View[] viewArr2 = viewArr;
                        xs0Var.O1(viewArr2[0], viewArr2[1]);
                        return;
                    default:
                        xs0 xs0Var2 = this.f34738b;
                        xs0Var2.getClass();
                        View[] viewArr3 = viewArr;
                        xs0Var2.P1(viewArr3[0], viewArr3[1]);
                        return;
                }
            }
        }, org.telegram.messenger.hd.M0(2131748648, null), false, false)};
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
        org.telegram.ui.ActionBar.f2 f2Var;
        if (this.f40389f1 != null && (f2Var = this.f40440x1) != null) {
            return org.telegram.messenger.t3.V(f2Var.getMessagesController().M0(Long.valueOf(this.f40389f1.f26954id)));
        }
        return false;
    }

    public final void C1() {
        if (D0()) {
            post(new so0(this, 13));
            return;
        }
        dr0 dr0Var = this.J;
        if (dr0Var != null) {
            dr0Var.f();
        }
        ks0 ks0Var = this.M;
        if (ks0Var != null) {
            ks0Var.f();
        }
        ks0 ks0Var2 = this.N;
        if (ks0Var2 != null) {
            ks0Var2.f();
        }
        ls0 ls0Var = this.L;
        if (ls0Var != null) {
            ls0Var.X(false);
        }
        ks0 ks0Var3 = this.O;
        if (ks0Var3 != null) {
            ks0Var3.f();
        }
        gs0 gs0Var = this.P;
        if (gs0Var != null) {
            gs0Var.f();
        }
        nr0 nr0Var = this.Q;
        if (nr0Var != null) {
            nr0Var.f();
        }
        gr0 gr0Var = this.f40384e0;
        if (gr0Var != null) {
            gr0Var.f();
        }
        for (ws0 ws0Var : this.f40407l2.values()) {
            ws0Var.f40087c.f();
        }
    }

    public final void D(rr0 rr0Var, int i7, SparseBooleanArray sparseBooleanArray) {
        int childCount = rr0Var.getChildCount();
        lz lzVar = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = rr0Var.getChildAt(i10);
            if (childAt instanceof lz) {
                lzVar = childAt;
            }
        }
        if (lzVar != null) {
            rr0Var.removeView(lzVar);
        }
        getViewTreeObserver().addOnPreDrawListener(new yq0(this, rr0Var, sparseBooleanArray, lzVar, i7));
    }

    public final boolean D0() {
        int i7 = 0;
        while (true) {
            sr0[] sr0VarArr = this.m0;
            if (i7 >= sr0VarArr.length) {
                return false;
            }
            sr0 sr0Var = sr0VarArr[i7];
            if (sr0Var != null) {
                cq0 cq0Var = sr0Var.h;
                if (cq0Var == null || !cq0Var.c0()) {
                    rr0 rr0Var = sr0VarArr[i7].f38110n;
                    if (rr0Var != null && rr0Var.c0()) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
            i7++;
        }
    }

    public final void D1(sr0 sr0Var, boolean z9) {
        boolean z10;
        Integer num = 1;
        int i7 = 0;
        if (sr0Var.f38106b && this.d) {
            z10 = true;
        } else {
            z10 = false;
        }
        ui0 fastScroll = sr0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = sr0Var.f38107c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            sr0Var.f38107c.cancel();
        }
        if (!z9) {
            fastScroll.animate().setListener(null).cancel();
            if (!z10) {
                i7 = 8;
            }
            fastScroll.setVisibility(i7);
            if (!z10) {
                num = null;
            }
            fastScroll.setTag(num);
            fastScroll.setAlpha(1.0f);
            fastScroll.setScaleX(1.0f);
            fastScroll.setScaleY(1.0f);
            return;
        }
        Property property = View.ALPHA;
        if (z10 && fastScroll.getTag() == null) {
            fastScroll.animate().setListener(null).cancel();
            if (fastScroll.getVisibility() != 0) {
                fastScroll.setVisibility(0);
                fastScroll.setAlpha(0.0f);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fastScroll, property, fastScroll.getAlpha(), 1.0f);
            sr0Var.f38107c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(num);
        } else if (!z10 && fastScroll.getTag() != null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, property, fastScroll.getAlpha(), 0.0f);
            ofFloat2.addListener(new t9(fastScroll));
            sr0Var.f38107c = ofFloat2;
            ofFloat2.setDuration(150L).start();
            fastScroll.animate().setListener(null).cancel();
            fastScroll.setTag(null);
        }
    }

    public final void E(boolean z9) {
        int i7;
        ch0 ch0Var = this.f40431u0;
        if (ch0Var != null && this.Y1 != z9) {
            this.Y1 = z9;
            if (!z9 && ch0Var.getAnimatedDrawable().f40970a0 < 20) {
                ch0Var.getAnimatedDrawable().P(0);
            } else {
                zg0 animatedDrawable = ch0Var.getAnimatedDrawable();
                if (this.Y1) {
                    i7 = 50;
                } else {
                    i7 = 100;
                }
                animatedDrawable.P(i7);
            }
            ch0Var.getAnimatedDrawable().start();
        }
    }

    public final boolean E0(int i7) {
        if (i7 == 7) {
            return this.F1.X();
        }
        if (!F0() && i7 != 0 && !z0(i7) && i7 != 2 && i7 != 5 && i7 != 6 && i7 != 11 && i7 != 10 && i7 != 13 && i7 != 14 && i7 != 15) {
            return true;
        }
        return false;
    }

    public final void E1() {
        boolean z9;
        float f10;
        org.telegram.ui.ActionBar.r0 r0Var = this.f40433v0;
        if (r0Var != null) {
            if (!this.f40440x1.getMessagesController().A2(this.l1) && !u0()) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9) {
                f10 = 0.5f;
            } else {
                f10 = 1.0f;
            }
            r0Var.setAlpha(f10);
            if (z9 && r0Var.getBackground() != null) {
                r0Var.setBackground(null);
            } else if (!z9 && r0Var.getBackground() == null) {
                int i7 = org.telegram.ui.ActionBar.k6.f28261z8;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(s0(i7), 5, -1);
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
                r0Var.setBackground(h02);
                org.telegram.ui.ActionBar.r6.k(r0Var, h02, null, N, this.H1);
            }
        }
    }

    public final void F(int i7) {
        int i10;
        sr0 g02 = g0(this.f40424r1);
        this.f40426s = -1;
        if (g02 != null) {
            g02.h.C0();
            this.f40428s1 = i7;
            g02.f38110n.setVisibility(0);
            if (z0(this.f40424r1)) {
                g02.f38110n.setAdapter(y1(this.f40424r1));
            } else {
                g02.f38110n.setAdapter(this.K);
            }
            rr0 rr0Var = g02.f38110n;
            int paddingLeft = rr0Var.getPaddingLeft();
            rr0 rr0Var2 = g02.f38110n;
            int j02 = j0(g02.E);
            rr0Var2.f37728g3 = j02;
            int paddingRight = g02.f38110n.getPaddingRight();
            rr0 rr0Var3 = g02.f38110n;
            int i02 = i0(H0());
            rr0Var3.f37729h3 = i02;
            rr0Var.setPadding(paddingLeft, j02, paddingRight, i02);
            g02.f38111r.y1(i7);
            g02.f38110n.a0();
            int i11 = 0;
            while (true) {
                sr0[] sr0VarArr = this.m0;
                if (i11 >= sr0VarArr.length) {
                    break;
                }
                sr0 sr0Var = sr0VarArr[i11];
                if (sr0Var != null && ((i10 = sr0Var.E) == 0 || z0(i10))) {
                    org.telegram.messenger.g0.b4(sr0VarArr[i11].h);
                }
                i11++;
            }
            this.f40420q1 = true;
            if (this.f40424r1 == 0) {
                this.f40434v1[0].g(true);
            }
            this.f40417p1 = 0.0f;
            h1();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.L1.d();
            ofFloat.addUpdateListener(new sq0(this, g02, 1));
            ofFloat.addListener(new hi.p2(this, z0(g02.E) ? 1 : 0, i7, 2));
            ofFloat.setInterpolator(xq.f40345f);
            ofFloat.setStartDelay(100L);
            ofFloat.setDuration(350L);
            ofFloat.start();
        }
    }

    public boolean F0() {
        if (TextUtils.isEmpty(getStoriesHashtag()) && getStoriesArea() == null) {
            return false;
        }
        return true;
    }

    public final void F1() {
        int i7;
        up0 up0Var = this.f40370a0;
        if (up0Var != null) {
            int L = org.telegram.messenger.g0.L(48.0f) + this.f40380c2;
            pr prVar = this.R0;
            if (prVar != null) {
                i7 = (int) prVar.c(org.telegram.messenger.g0.L(7.0f));
            } else {
                i7 = 0;
            }
            up0Var.setPaddingTop(L + i7);
        }
    }

    public final void G() {
        int i7 = this.f40380c2;
        int i10 = this.f40415o2;
        n1((org.telegram.messenger.g0.L(6.666f) + i7) - f40368v2, this.R0);
        int i11 = i7 + i10;
        n1(i11, this.K0);
        n1(i11, this.D0);
        n1(org.telegram.messenger.g0.L(52.0f) + i7 + i10, this.M0);
        n1(org.telegram.messenger.g0.L(4.0f) + i7 + i10, this.L0);
        n1(org.telegram.messenger.g0.L(48.0f) + i7 + i10, this.f40374b0);
        if (this.f40405k2 != i10) {
            this.f40405k2 = i10;
            Runnable runnable = this.f40402j2;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public boolean G0() {
        return false;
    }

    public final void G1(boolean z9) {
        up0 up0Var;
        yp0 yp0Var;
        boolean z10 = true;
        R(true, true);
        ch0 ch0Var = this.f40431u0;
        if (ch0Var == null) {
            return;
        }
        float f10 = 0.0f;
        if (!this.X0 && (((up0Var = this.f40370a0) == null || !up0Var.g()) && ((yp0Var = this.f40374b0) == null || !yp0Var.f47339f))) {
            f10 = Utilities.i(this.f40419q0 + this.f40423r0, 1.0f, 0.0f);
        }
        ch0Var.setAlpha(f10);
        if (z9) {
            if (k0(1.0f) <= 0.5f) {
                z10 = false;
            }
            E(z10);
        } else if (this.f40444z0 == 2) {
            if (this.f40423r0 <= 0.1f) {
                z10 = false;
            }
            E(z10);
        } else {
            if (this.f40419q0 >= 0.1f) {
                z10 = false;
            }
            E(z10);
        }
    }

    public final boolean H() {
        boolean B0 = B0();
        long j3 = this.l1;
        org.telegram.ui.ActionBar.f2 f2Var = this.f40440x1;
        if (B0) {
            TLRPC.User a22 = org.telegram.messenger.qp.s1(f2Var.getCurrentAccount()).a2(Long.valueOf(j3));
            if (a22 == null || !a22.bot || !a22.bot_can_edit) {
                return false;
            }
            return true;
        } else if (!H0()) {
            if (f2Var == null || !f2Var.getMessagesController().P1().h(j3)) {
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

    public final void H1(sr0 sr0Var) {
        boolean z9;
        boolean b12 = sr0Var.h.b1();
        if (b12) {
            sr0Var.h.setSectionsDrawBackground(this.f40376b2);
        }
        if (this.f40376b2 && !b12 && sr0Var.E != 15) {
            z9 = true;
        } else {
            z9 = false;
        }
        sr0Var.setDrawPageBackground(z9);
        if (sr0Var.E == 15) {
            Drawable drawable = sr0Var.O;
            if (drawable == null) {
                drawable = sr0Var.getBackground();
            }
            Drawable e10 = fi.y5.e(drawable, this.f40440x1.getCurrentAccount(), this.l1, org.telegram.ui.ActionBar.k6.I.q());
            if (!this.f40376b2) {
                sr0Var.setWallpaper(null);
                sr0Var.setBackground(e10);
                sr0Var.setOutlineProvider(new bg.q0(15));
                sr0Var.setClipToOutline(true);
                return;
            }
            sr0Var.setBackground(null);
            sr0Var.setClipToOutline(false);
            sr0Var.setWallpaper(e10);
            return;
        }
        sr0Var.setClipToOutline(false);
        sr0Var.setBackground(null);
        sr0Var.setWallpaper(null);
    }

    public boolean I() {
        return !(this instanceof o20);
    }

    public final void I1(sr0 sr0Var) {
        boolean z9;
        float f10;
        int i7;
        float f11;
        float f12;
        int i10 = sr0Var.E;
        if (i10 != 0 && !z0(i10)) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = 12.0f;
        }
        if (z9) {
            i7 = 8;
        } else {
            i7 = 12;
        }
        float f13 = i7 + 48;
        if (z9) {
            f11 = 0.0f;
        } else {
            f11 = 12.0f;
        }
        if (z9) {
            f12 = 0.0f;
        } else {
            f12 = 12.0f;
        }
        FrameLayout.LayoutParams d = c8.ha.d(-1, -1.0f, 119, f10, f13, f11, f12);
        d.topMargin = n0(sr0Var.E) + d.topMargin;
        ViewGroup.LayoutParams layoutParams = sr0Var.f38112s.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2.leftMargin == d.leftMargin && layoutParams2.topMargin == d.topMargin && layoutParams2.rightMargin == d.rightMargin && layoutParams2.bottomMargin == d.bottomMargin && layoutParams2.gravity == d.gravity) {
                return;
            }
        }
        sr0Var.f38112s.setLayoutParams(d);
    }

    public final boolean J() {
        sr0 sr0Var;
        sr0[] sr0VarArr = this.m0;
        if (sr0VarArr != null && (sr0Var = sr0VarArr[0]) != null) {
            boolean z02 = z0(sr0Var.E);
            int i7 = this.f40414o1[z02 ? 1 : 0];
            if (i7 != h0(z02 ? 1 : 0, i7, true)) {
                return true;
            }
        }
        return false;
    }

    public final boolean J0() {
        if (!H() || ((getClosestTab() != 8 && getClosestTab() != 13 && !I0(getClosestTab())) || !this.E1)) {
            up0 up0Var = this.f40370a0;
            if (up0Var == null || !up0Var.g()) {
                yp0 yp0Var = this.f40374b0;
                if ((yp0Var == null || !yp0Var.f47339f) && !this.f40420q1 && !this.f40398i1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void J1(boolean z9) {
        int i7 = 0;
        while (true) {
            sr0[] sr0VarArr = this.m0;
            if (i7 < sr0VarArr.length) {
                int childCount = sr0VarArr[i7].h.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = sr0VarArr[i7].h.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.h7) {
                        ((org.telegram.ui.Cells.h7) childAt).b(false, z9);
                    } else if (childAt instanceof org.telegram.ui.Cells.o7) {
                        ((org.telegram.ui.Cells.o7) childAt).i(false, z9);
                    } else if (childAt instanceof org.telegram.ui.Cells.k7) {
                        ((org.telegram.ui.Cells.k7) childAt).f(false, z9);
                    } else if (childAt instanceof org.telegram.ui.Cells.g7) {
                        ((org.telegram.ui.Cells.g7) childAt).e(false, z9);
                    } else if (childAt instanceof org.telegram.ui.Cells.h2) {
                        ((org.telegram.ui.Cells.h2) childAt).c(false, z9);
                    } else if (childAt instanceof org.telegram.ui.Cells.t2) {
                        ((org.telegram.ui.Cells.t2) childAt).c0(false, z9);
                    }
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public final boolean K() {
        sr0 sr0Var;
        sr0[] sr0VarArr = this.m0;
        if (sr0VarArr == null || (sr0Var = sr0VarArr[0]) == null) {
            return false;
        }
        if (this.f40408m1 && z0(sr0Var.E)) {
            return false;
        }
        boolean z02 = z0(sr0VarArr[0].E);
        int i7 = this.f40414o1[z02 ? 1 : 0];
        if (i7 == h0(z02 ? 1 : 0, i7, false)) {
            return false;
        }
        return true;
    }

    public final void K0(int i7, int i10, int i11, boolean z9) {
        ms0[] ms0VarArr = this.f40434v1;
        ms0VarArr[i7].f36063a.clear();
        ms0VarArr[i7].f36064b[0].clear();
        ms0VarArr[i7].f36064b[1].clear();
        ms0 ms0Var = ms0VarArr[i7];
        ms0Var.f36070j[0] = i10;
        ms0Var.f36069i[0] = false;
        ms0Var.f36072l = false;
        ms0Var.f36073m = i11;
        ms0Var.f36074n = (ms0Var.e() - i11) - 1;
        ms0 ms0Var2 = ms0VarArr[i7];
        if (ms0Var2.f36074n < 0) {
            ms0Var2.f36074n = 0;
        }
        ms0Var2.f36071k = i10;
        ms0Var2.f36075o = true;
        ms0Var2.f36068g = false;
        ms0Var2.f36076p++;
        sr0 g02 = g0(i7);
        if (g02 != null && g02.h.getAdapter() != null) {
            g02.h.getAdapter().f();
        }
        if (z9) {
            int i12 = 0;
            while (true) {
                sr0[] sr0VarArr = this.m0;
                if (i12 < sr0VarArr.length) {
                    sr0 sr0Var = sr0VarArr[i12];
                    if (sr0Var.E == i7) {
                        sr0Var.f38114x.h1(Math.min(ms0VarArr[i7].e() - 1, ms0VarArr[i7].f36073m), 0);
                    }
                    i12++;
                } else {
                    return;
                }
            }
        }
    }

    public final void K1(float f10) {
        org.telegram.ui.ActionBar.r0 r0Var = this.f40413o0;
        if (r0Var == null) {
            return;
        }
        sr0[] sr0VarArr = this.m0;
        sr0 sr0Var = sr0VarArr[1];
        float f11 = 0.0f;
        if (sr0Var != null && sr0Var.E == 11) {
            f11 = 0.0f + f10;
        }
        int i7 = 0;
        sr0 sr0Var2 = sr0VarArr[0];
        if (sr0Var2 != null && sr0Var2.E == 11) {
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

    public final void L(Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        sr0[] sr0VarArr;
        pj0 pj0Var;
        sp0 sp0Var;
        er0 er0Var;
        up0 up0Var;
        View[] viewPages;
        for (sr0 sr0Var : this.m0) {
            if (sr0Var != null && sr0Var.getVisibility() == 0) {
                if (sr0Var.O != null) {
                    RectF rectF2 = this.f40399i2;
                    if (jh.k.c(sr0Var, viewGroup, rectF2)) {
                        canvas.save();
                        canvas.translate(rectF2.left, rectF2.top);
                        sr0Var.g(canvas);
                        canvas.restore();
                    }
                }
                if (sr0Var.E == 14 && (up0Var = this.f40370a0) != null && up0Var.getParent() == sr0Var) {
                    for (View view : up0Var.h.getViewPages()) {
                        if ((view instanceof zh.a2) && view.getVisibility() == 0) {
                            fi.w3 w3Var = ((zh.a2) view).f60115f;
                            ih.d.a(w3Var, canvas, rectF, w3Var, viewGroup);
                        }
                    }
                } else {
                    if (sr0Var.E == 12 && (er0Var = this.V) != null && er0Var.getParent() == sr0Var) {
                        pj0Var = er0Var.f44857a.f44037z0;
                    } else if (sr0Var.E == 13 && (sp0Var = this.W) != null && sp0Var.getParent() == sr0Var) {
                        pj0Var = sp0Var.getCurrentListView();
                    } else {
                        pj0Var = sr0Var.h;
                    }
                    if (pj0Var != null && pj0Var.getVisibility() == 0) {
                        ih.d.a(pj0Var, canvas, rectF, pj0Var, viewGroup);
                    }
                }
            }
        }
    }

    public final void L0(boolean z9) {
        long j3 = this.F;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i7 == 0 && !F0()) {
            for (int i10 = 0; i10 < 4; i10++) {
                int i11 = f40365s2[i10];
                ms0[] ms0VarArr = this.f40434v1;
                if (!ms0VarArr[i11].h || z9) {
                    long j10 = this.l1;
                    if (!org.telegram.messenger.m5.C(j10)) {
                        ms0VarArr[i11].h = false;
                        TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
                        if (i11 == 0) {
                            int i12 = ms0VarArr[i11].f36077q;
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
                        org.telegram.ui.ActionBar.f2 f2Var = this.f40440x1;
                        tL_messages_getSearchResultsPositions.peer = f2Var.getMessagesController().j1(j10);
                        if (i7 != 0 && f2Var.getUserConfig().e() == j10) {
                            tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                            tL_messages_getSearchResultsPositions.saved_peer_id = f2Var.getMessagesController().j1(j3);
                        }
                        ConnectionsManager.getInstance(f2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(f2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new org.telegram.messenger.fe(this, ms0VarArr[i11].f36076p, i11, 2)), f2Var.getClassGuid());
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void L1() {
        float f10;
        float f11;
        org.telegram.ui.ActionBar.r0 r0Var = this.f40413o0;
        if (r0Var == null) {
            return;
        }
        boolean z9 = true;
        sr0 sr0Var = this.m0[1];
        if (sr0Var == null || sr0Var.E != 11) {
            z9 = false;
        }
        if (z9) {
            r0Var.setVisibility(0);
        }
        ViewPropertyAnimator animate = r0Var.animate();
        float f12 = 1.0f;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f10);
        if (z9) {
            f11 = 1.0f;
        } else {
            f11 = 0.85f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f11);
        if (!z9) {
            f12 = 0.85f;
        }
        scaleX.scaleY(f12).withEndAction(new bi.k1(29, this, z9)).setDuration(420L).setInterpolator(xq.h).start();
    }

    public final void M() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xs0.M():void");
    }

    public final void M0(int i7) {
        int i10;
        int i11 = 2;
        ms0[] ms0VarArr = this.f40434v1;
        if (i7 == 0) {
            int i12 = ms0VarArr[0].f36077q;
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
        ms0VarArr[i7].f36068g = true;
        org.telegram.ui.ActionBar.f2 f2Var = this.f40440x1;
        f2Var.getMediaDataController().N0(this.l1, 50, 0, ms0VarArr[i7].f36071k, i10, this.F, 1, f2Var.getClassGuid(), ms0VarArr[i7].f36076p, null, null);
    }

    public final void M1() {
        boolean z9;
        int i7;
        di.q6 q6Var;
        boolean B0 = B0();
        org.telegram.ui.ActionBar.r0 r0Var = this.f40442y0;
        org.telegram.ui.ActionBar.r0 r0Var2 = this.f40439x0;
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
                SparseArray[] sparseArrayArr = this.f40375b1;
                if (i11 < sparseArrayArr[0].size()) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) sparseArrayArr[0].valueAt(i11);
                    gr0 gr0Var = this.f40384e0;
                    if (gr0Var != null && (q6Var = gr0Var.f38717s) != null && !q6Var.m(ijVar.f1())) {
                        z9 = true;
                        break;
                    }
                    i11++;
                } else {
                    z9 = false;
                    break;
                }
            }
            if (r0Var2 != null) {
                if (z9) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                r0Var2.setVisibility(i7);
            }
            if (r0Var != null) {
                if (!z9) {
                    i10 = 0;
                }
                r0Var.setVisibility(i10);
            }
        } else if (I0(getClosestTab())) {
            if (r0Var2 != null) {
                r0Var2.setVisibility(8);
            }
            if (r0Var != null) {
                r0Var.setVisibility(8);
            }
        }
    }

    public final void N() {
        tq0 tq0Var = this.K0;
        if (!tq0Var.d(tq0Var.getCurrentTabId())) {
            int firstTabId = tq0Var.getFirstTabId();
            tq0Var.setInitialTabId(firstTabId);
            this.m0[0].E = firstTabId;
            z1(false);
        }
    }

    public int N0() {
        return 0;
    }

    public void N1(boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xs0.N1(boolean):void");
    }

    public final void O(org.telegram.ui.Components.sr0 r34, org.telegram.ui.Components.pj0 r35, v4.b0 r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xs0.O(org.telegram.ui.Components.sr0, org.telegram.ui.Components.pj0, v4.b0):void");
    }

    public final Boolean O1(View view, View view2) {
        if (!this.f40420q1) {
            sr0[] sr0VarArr = this.m0;
            boolean z9 = false;
            sr0 sr0Var = sr0VarArr[0];
            if (sr0Var != null) {
                int i7 = sr0Var.E;
                this.f40424r1 = i7;
                boolean z02 = z0(i7);
                int[] iArr = this.f40414o1;
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
                        org.telegram.messenger.iz.B(h02);
                    } else if (m0(sr0VarArr[0].E) >= 5 || I0(sr0VarArr[0].E)) {
                        org.telegram.messenger.iz.F(h02);
                    }
                    F(h02);
                }
                if (h02 != h0(z02 ? 1 : 0, h02, true)) {
                    z9 = true;
                }
                return Boolean.valueOf(z9);
            }
            return null;
        }
        return null;
    }

    public final boolean P(MotionEvent motionEvent) {
        float f10;
        v4.g0 g0Var;
        boolean z9;
        sp0 sp0Var;
        float f11;
        boolean z10;
        sr0[] sr0VarArr = this.m0;
        int i7 = sr0VarArr[0].E;
        if (i7 == 13 && (sp0Var = this.W) != null) {
            View currentView = sp0Var.f10849n.getCurrentView();
            if (currentView instanceof ei.n) {
                ei.n nVar = (ei.n) currentView;
                ei.i iVar = nVar.f10837w;
                ei.f fVar = nVar.f10833f;
                if (nVar.f10829a != null && nVar.getParent() != null) {
                    if (!nVar.f10830b || nVar.K) {
                        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
                            if (motionEvent.getActionMasked() == 2 && (nVar.K || nVar.M)) {
                                int i10 = -1;
                                int i11 = -1;
                                for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                                    if (nVar.N == motionEvent.getPointerId(i12)) {
                                        i10 = i12;
                                    }
                                    if (nVar.O == motionEvent.getPointerId(i12)) {
                                        i11 = i12;
                                    }
                                }
                                if (i10 != -1 && i11 != -1) {
                                    float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / nVar.P;
                                    nVar.Q = hypot;
                                    if (!nVar.K && (hypot > 1.01f || hypot < 0.99f)) {
                                        nVar.K = true;
                                        if (hypot > 1.0f) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        nVar.R = z10;
                                        nVar.b(z10);
                                    }
                                    if (nVar.K) {
                                        boolean z11 = nVar.R;
                                        if ((z11 && nVar.Q < 1.0f) || (!z11 && nVar.Q > 1.0f)) {
                                            nVar.f10831c = 0.0f;
                                        } else {
                                            if (z11) {
                                                f11 = org.telegram.messenger.k5.y(2.0f, nVar.Q, 1.0f, 1.0f);
                                            } else {
                                                f11 = (1.0f - nVar.Q) / 0.5f;
                                            }
                                            nVar.f10831c = Math.max(0.0f, Math.min(1.0f, f11));
                                        }
                                        float f12 = nVar.f10831c;
                                        int i13 = (f12 > 1.0f ? 1 : (f12 == 1.0f ? 0 : -1));
                                        if (i13 == 0 || f12 == 0.0f) {
                                            if (i13 == 0) {
                                                int i14 = nVar.f10832e;
                                                int ceil = (((int) Math.ceil(nVar.S / nVar.f10832e)) * i14) + ((int) ((nVar.W.G.B1 / (fVar.getMeasuredWidth() - ((int) (fVar.getMeasuredWidth() / nVar.f10832e)))) * (i14 - 1)));
                                                if (ceil >= iVar.b()) {
                                                    ceil = iVar.b() - 1;
                                                }
                                                nVar.S = ceil;
                                            }
                                            nVar.a();
                                            if (nVar.f10831c == 0.0f) {
                                                nVar.R = !nVar.R;
                                            }
                                            nVar.b(nVar.R);
                                            nVar.P = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                        }
                                        fVar.invalidate();
                                    }
                                } else {
                                    nVar.L = false;
                                    nVar.M = false;
                                    nVar.K = false;
                                    nVar.a();
                                    return false;
                                }
                            } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((nVar.N == motionEvent.getPointerId(0) && nVar.O == motionEvent.getPointerId(1)) || (nVar.N == motionEvent.getPointerId(1) && nVar.O == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && nVar.K) {
                                nVar.M = false;
                                nVar.L = false;
                                nVar.K = false;
                                nVar.a();
                            }
                        } else {
                            if (nVar.L && !nVar.K && motionEvent.getPointerCount() == 2) {
                                nVar.P = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                nVar.Q = 1.0f;
                                nVar.N = motionEvent.getPointerId(0);
                                nVar.O = motionEvent.getPointerId(1);
                                fVar.I0(false);
                                fVar.cancelLongPress();
                                fVar.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                View view = (View) nVar.getParent();
                                nVar.U = (int) ((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view.getX()) - nVar.getX());
                                int y10 = (int) ((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view.getY()) - nVar.getY());
                                int i15 = nVar.U;
                                Rect rect = nVar.V;
                                nVar.S = -1;
                                int top = y10 - fVar.getTop();
                                for (int i16 = 0; i16 < fVar.getChildCount(); i16++) {
                                    View childAt = fVar.getChildAt(i16);
                                    childAt.getHitRect(rect);
                                    if (rect.contains(i15, top)) {
                                        nVar.S = RecyclerView.S(childAt);
                                        nVar.T = childAt.getTop();
                                    }
                                }
                                nVar.M = true;
                            }
                            if (motionEvent.getActionMasked() == 0 && (motionEvent.getY() - ((View) nVar.getParent()).getY()) - nVar.getY() > 0.0f) {
                                nVar.L = true;
                            }
                        }
                        return nVar.K;
                    }
                    return true;
                }
            }
            return false;
        }
        if ((i7 == 0 || z0(i7)) && getParent() != null) {
            if (!this.f40420q1 || this.f40369a) {
                if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
                    if (motionEvent.getActionMasked() == 2 && (this.f40369a || this.f40377c)) {
                        int i17 = -1;
                        int i18 = -1;
                        for (int i19 = 0; i19 < motionEvent.getPointerCount(); i19++) {
                            if (this.f40383e == motionEvent.getPointerId(i19)) {
                                i17 = i19;
                            }
                            if (this.f40387f == motionEvent.getPointerId(i19)) {
                                i18 = i19;
                            }
                        }
                        if (i17 != -1 && i18 != -1) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(i18) - motionEvent.getX(i17), motionEvent.getY(i18) - motionEvent.getY(i17))) / this.h;
                            this.f40410n = hypot2;
                            if (!this.f40369a && (hypot2 > 1.01f || hypot2 < 0.99f)) {
                                this.f40369a = true;
                                if (hypot2 > 1.0f) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                this.f40422r = z9;
                                r1(z9);
                            }
                            if (this.f40369a) {
                                boolean z12 = this.f40422r;
                                if ((z12 && this.f40410n < 1.0f) || (!z12 && this.f40410n > 1.0f)) {
                                    this.f40417p1 = 0.0f;
                                } else {
                                    if (z12) {
                                        f10 = org.telegram.messenger.k5.y(2.0f, this.f40410n, 1.0f, 1.0f);
                                    } else {
                                        f10 = (1.0f - this.f40410n) / 0.5f;
                                    }
                                    this.f40417p1 = Math.max(0.0f, Math.min(1.0f, f10));
                                }
                                float f13 = this.f40417p1;
                                if (f13 == 1.0f || f13 == 0.0f) {
                                    if (z0(this.f40424r1)) {
                                        g0Var = x1(this.f40424r1);
                                    } else {
                                        g0Var = this.J;
                                    }
                                    if (this.f40417p1 == 1.0f) {
                                        int i20 = this.f40428s1;
                                        int ceil2 = (((int) Math.ceil(this.f40426s / this.f40428s1)) * i20) + ((int) ((this.B1 / (sr0VarArr[0].h.getMeasuredWidth() - ((int) (sr0VarArr[0].h.getMeasuredWidth() / this.f40428s1)))) * (i20 - 1)));
                                        if (ceil2 >= g0Var.b()) {
                                            ceil2 = g0Var.b() - 1;
                                        }
                                        this.f40426s = ceil2;
                                    }
                                    d0();
                                    if (this.f40417p1 == 0.0f) {
                                        this.f40422r = !this.f40422r;
                                    }
                                    r1(this.f40422r);
                                    this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                }
                                sr0VarArr[0].h.invalidate();
                                sr0 sr0Var = sr0VarArr[0];
                                if (sr0Var.F != null) {
                                    sr0Var.invalidate();
                                }
                            }
                        } else {
                            this.f40373b = false;
                            this.f40377c = false;
                            this.f40369a = false;
                            d0();
                            return false;
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.f40383e == motionEvent.getPointerId(0) && this.f40387f == motionEvent.getPointerId(1)) || (this.f40383e == motionEvent.getPointerId(1) && this.f40387f == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.f40369a) {
                        this.f40377c = false;
                        this.f40373b = false;
                        this.f40369a = false;
                        d0();
                    }
                } else {
                    if (this.f40373b && !this.f40369a && motionEvent.getPointerCount() == 2) {
                        this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.f40410n = 1.0f;
                        this.f40383e = motionEvent.getPointerId(0);
                        this.f40387f = motionEvent.getPointerId(1);
                        sr0VarArr[0].h.I0(false);
                        sr0VarArr[0].h.cancelLongPress();
                        sr0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.f40438x = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - sr0VarArr[0].getX());
                        int y11 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - sr0VarArr[0].getY());
                        int i21 = this.f40438x;
                        this.f40426s = -1;
                        int top2 = y11 - sr0VarArr[0].h.getTop();
                        if (getY() != 0.0f && this.E == 1) {
                            top2 = 0;
                        }
                        for (int i22 = 0; i22 < sr0VarArr[0].h.getChildCount(); i22++) {
                            View childAt2 = sr0VarArr[0].h.getChildAt(i22);
                            Rect rect2 = this.f40441y;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i21, top2)) {
                                sr0VarArr[0].h.getClass();
                                this.f40426s = RecyclerView.S(childAt2);
                                this.f40435w = childAt2.getTop();
                            }
                        }
                        if (this.F1.X() && this.f40426s == -1) {
                            this.f40426s = (int) (((this.f40414o1[z0(sr0VarArr[0].E) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i21 / sr0VarArr[0].h.getMeasuredWidth(), 0.0f))) + sr0VarArr[0].f38114x.L0());
                            this.f40435w = 0;
                        }
                        this.f40377c = true;
                    }
                    if (motionEvent.getActionMasked() == 0 && ((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - sr0VarArr[0].getY() > this.f40380c2) {
                        this.f40373b = true;
                    }
                }
                return this.f40369a;
            }
            return true;
        }
        return false;
    }

    public final Boolean P1(View view, View view2) {
        if (!this.f40420q1) {
            sr0[] sr0VarArr = this.m0;
            boolean z9 = false;
            sr0 sr0Var = sr0VarArr[0];
            if (sr0Var != null) {
                if (!this.f40408m1 || !z0(sr0Var.E)) {
                    int i7 = sr0VarArr[0].E;
                    this.f40424r1 = i7;
                    boolean z02 = z0(i7);
                    int[] iArr = this.f40414o1;
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
                            org.telegram.messenger.iz.B(h02);
                        } else if (m0(sr0VarArr[0].E) >= 5 || I0(sr0VarArr[0].E)) {
                            org.telegram.messenger.iz.F(h02);
                        }
                        F(h02);
                    }
                    if (h02 != h0(z02 ? 1 : 0, h02, false)) {
                        z9 = true;
                    }
                    return Boolean.valueOf(z9);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void Q() {
        R(false, false);
    }

    public final void Q0() {
        di.q6 q6Var;
        di.q6 q6Var2;
        this.J1.b();
        gr0 gr0Var = this.f40384e0;
        if (gr0Var != null && (q6Var2 = gr0Var.f38717s) != null && q6Var2 != null) {
            q6Var2.z(gr0Var.f38718w);
        }
        rp0 rp0Var = this.f40391g0;
        if (rp0Var != null && (q6Var = rp0Var.f38717s) != null && q6Var != null) {
            q6Var.z(rp0Var.f38718w);
        }
        for (ws0 ws0Var : this.f40407l2.values()) {
            vs0 vs0Var = ws0Var.f40087c;
            di.q6 q6Var3 = vs0Var.f38717s;
            if (q6Var3 != null && q6Var3 != null) {
                q6Var3.z(vs0Var.f38718w);
            }
        }
    }

    public final void R(boolean z9, boolean z10) {
        boolean z11;
        if (this.H != null) {
            int closestTab = getClosestTab();
            boolean z12 = false;
            org.telegram.ui.ActionBar.r0 r0Var = this.f40416p0;
            if (r0Var != null) {
                if (this.f40418p2 && I() && (E0(closestTab) || (closestTab == 11 && x0()))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ((org.telegram.ui.ActionBar.f5) r0Var).Y(z11, z9);
            }
            org.telegram.ui.ActionBar.f5 f5Var = this.I;
            if (f5Var != null) {
                if (this.f40418p2 && I() && !A0() && v0(closestTab)) {
                    z12 = true;
                }
                f5Var.Y(z12, z10);
            }
        }
    }

    public final void R0(int i7, View view, org.telegram.messenger.ij ijVar, int i10) {
        TLRPC.WebPage webPage;
        String str;
        char c10;
        int i11;
        int i12;
        boolean z9;
        if (ijVar != null && !this.f40420q1) {
            yp0 yp0Var = this.f40374b0;
            if (yp0Var == null || !yp0Var.f47339f) {
                int i13 = 0;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                i13 = 0;
                String str2 = null;
                di.q6 q6Var = null;
                if (this.E1) {
                    int i14 = 8;
                    if (i10 != 8 || H()) {
                        if (org.telegram.messenger.ij.B0(ijVar.f23244k) == this.l1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        SparseArray[] sparseArrayArr = this.f40375b1;
                        if (sparseArrayArr[c10].indexOfKey(ijVar.f1()) >= 0) {
                            sparseArrayArr[c10].remove(ijVar.f1());
                            if (!ijVar.s(null, false)) {
                                this.f40379c1--;
                            }
                        } else {
                            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                                sparseArrayArr[c10].put(ijVar.f1(), ijVar);
                                if (!ijVar.s(null, false)) {
                                    this.f40379c1++;
                                }
                            } else {
                                return;
                            }
                        }
                        O0(sparseArrayArr[0]);
                        if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                            o1(false);
                        } else {
                            m1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                            if (this.f40379c1 == 0) {
                                i11 = 0;
                            } else {
                                i11 = 8;
                            }
                            this.f40411n0.setVisibility(i11);
                            org.telegram.ui.ActionBar.r0 r0Var = this.f40436w0;
                            if (r0Var != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14 && sparseArrayArr[0].size() == 1) {
                                    i12 = 0;
                                } else {
                                    i12 = 8;
                                }
                                r0Var.setVisibility(i12);
                            }
                            org.telegram.ui.ActionBar.r0 r0Var2 = this.f40433v0;
                            if (r0Var2 != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                                    i14 = 0;
                                }
                                r0Var2.setVisibility(i14);
                            }
                            M1();
                        }
                        this.f40382d1 = false;
                        if (view instanceof org.telegram.ui.Cells.h7) {
                            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                            if (sparseArrayArr[c10].indexOfKey(ijVar.f1()) >= 0) {
                                z10 = true;
                            }
                            h7Var.b(z10, true);
                        } else if (view instanceof org.telegram.ui.Cells.p7) {
                            org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
                            if (sparseArrayArr[c10].indexOfKey(ijVar.f1()) >= 0) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            p7Var.b(0, z9, true);
                        } else if (view instanceof org.telegram.ui.Cells.k7) {
                            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                            if (sparseArrayArr[c10].indexOfKey(ijVar.f1()) >= 0) {
                                z11 = true;
                            }
                            k7Var.f(z11, true);
                        } else if (view instanceof org.telegram.ui.Cells.g7) {
                            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                            if (sparseArrayArr[c10].indexOfKey(ijVar.f1()) >= 0) {
                                z12 = true;
                            }
                            g7Var.e(z12, true);
                        } else if (view instanceof org.telegram.ui.Cells.h2) {
                            org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) view;
                            if (sparseArrayArr[c10].indexOfKey(ijVar.f1()) >= 0) {
                                z13 = true;
                            }
                            h2Var.c(z13, true);
                        } else if (view instanceof org.telegram.ui.Cells.o7) {
                            org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                            if (sparseArrayArr[c10].indexOfKey(ijVar.f1()) >= 0) {
                                z14 = true;
                            }
                            o7Var.i(z14, true);
                        }
                    } else {
                        return;
                    }
                } else {
                    eq0 eq0Var = this.f40430t1;
                    ms0[] ms0VarArr = this.f40434v1;
                    org.telegram.ui.ActionBar.f2 f2Var = this.f40440x1;
                    if (i10 == 0) {
                        ms0 ms0Var = ms0VarArr[i10];
                        int i15 = i7 - ms0Var.f36073m;
                        if (i15 >= 0 && i15 < ms0Var.f36063a.size()) {
                            PhotoViewer.p1().H2(null, f2Var, null);
                            PhotoViewer.p1().Z1(ms0VarArr[i10].f36063a, i15, this.l1, this.f40385e1, this.F, eq0Var);
                        }
                    } else if (i10 != 2 && i10 != 4) {
                        if (i10 == 5) {
                            PhotoViewer.p1().H2(null, f2Var, null);
                            int indexOf = ms0VarArr[i10].f36063a.indexOf(ijVar);
                            if (indexOf < 0) {
                                PhotoViewer.p1().Z1(org.telegram.messenger.k5.k(ijVar), 0, 0L, 0L, 0L, eq0Var);
                            } else {
                                PhotoViewer.p1().Z1(ms0VarArr[i10].f36063a, indexOf, this.l1, this.f40385e1, this.F, eq0Var);
                            }
                        } else if (i10 == 1) {
                            if (view instanceof org.telegram.ui.Cells.h7) {
                                org.telegram.ui.Cells.h7 h7Var2 = (org.telegram.ui.Cells.h7) view;
                                TLRPC.Document F0 = ijVar.F0();
                                if (h7Var2.G) {
                                    if (ijVar.x()) {
                                        PhotoViewer.p1().H2(null, f2Var, null);
                                        int indexOf2 = ms0VarArr[i10].f36063a.indexOf(ijVar);
                                        if (indexOf2 < 0) {
                                            PhotoViewer.p1().Z1(org.telegram.messenger.k5.k(ijVar), 0, 0L, 0L, 0L, eq0Var);
                                            return;
                                        }
                                        PhotoViewer.p1().Z1(ms0VarArr[i10].f36063a, indexOf2, this.l1, this.f40385e1, this.F, eq0Var);
                                        return;
                                    }
                                    org.telegram.messenger.g0.s2(ijVar, f2Var.getParentActivity(), f2Var);
                                } else if (!h7Var2.F) {
                                    org.telegram.messenger.ij message = h7Var2.getMessage();
                                    message.P = true;
                                    f2Var.getFileLoader().W(F0, message, 0, 0);
                                    h7Var2.f(true);
                                } else {
                                    f2Var.getFileLoader().f(F0);
                                    h7Var2.f(true);
                                }
                            }
                        } else if (i10 == 3) {
                            try {
                                if (org.telegram.messenger.ij.o1(ijVar.f23244k) != null) {
                                    webPage = org.telegram.messenger.ij.o1(ijVar.f23244k).webpage;
                                } else {
                                    webPage = null;
                                }
                                if (webPage != null && !(webPage instanceof TLRPC.TL_webPageEmpty)) {
                                    if (webPage.cached_page != null) {
                                        LaunchActivity launchActivity = LaunchActivity.G1;
                                        if (launchActivity == null || launchActivity.O() == null || LaunchActivity.G1.O().l(ijVar) == null) {
                                            f2Var.createArticleViewer(false).L(ijVar, null, null, null);
                                            return;
                                        }
                                        return;
                                    }
                                    String str3 = webPage.embed_url;
                                    if (str3 != null && str3.length() != 0) {
                                        vt.N0(f2Var, ijVar, this.f40430t1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                        return;
                                    }
                                    str = webPage.url;
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    ArrayList arrayList = ((org.telegram.ui.Cells.k7) view).E;
                                    if (arrayList.size() > 0) {
                                        str2 = ((CharSequence) arrayList.get(0)).toString();
                                    }
                                    str = str2;
                                }
                                if (str != null) {
                                    b1(str);
                                }
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                            }
                        } else if (z0(i10)) {
                            us0 x12 = x1(i10);
                            if (x12 != null) {
                                q6Var = x12.f38717s;
                            }
                            if (q6Var != null) {
                                di.p9 orCreateStoryViewer = f2Var.getOrCreateStoryViewer();
                                Context context = getContext();
                                int f12 = ijVar.f1();
                                di.h7 a10 = di.h7.a(this.m0[0].h);
                                a10.f9089e = new ax(q6Var, 19);
                                if ((f2Var instanceof ProfileActivity) && ((ProfileActivity) f2Var).f41808r1) {
                                    i13 = org.telegram.messenger.g0.L(68.0f);
                                }
                                a10.f9093s += i13;
                                orCreateStoryViewer.I(context, f12, q6Var, a10);
                            } else {
                                return;
                            }
                        }
                    } else if (view instanceof org.telegram.ui.Cells.g7) {
                        ((org.telegram.ui.Cells.g7) view).a();
                    }
                }
                E1();
            }
        }
    }

    public final void S() {
        char c10;
        char c11;
        float abs;
        View childAt;
        int R;
        float f10;
        float measuredWidth;
        sr0[] sr0VarArr = this.m0;
        sr0 sr0Var = sr0VarArr[0];
        if (sr0Var != null && sr0VarArr[1] != null) {
            float f11 = 0.0f;
            yp0 yp0Var = this.f40374b0;
            if (yp0Var != null) {
                if (z0(sr0Var.E) && sr0VarArr[0].E != 9) {
                    c10 = 1;
                } else {
                    c10 = 0;
                }
                if (sr0VarArr[1].getVisibility() == 0) {
                    if (z0(sr0VarArr[1].E) && sr0VarArr[1].E != 9) {
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
                        measuredWidth = sr0VarArr[0].getMeasuredWidth();
                    }
                    yp0Var.setTranslationX(measuredWidth);
                } else {
                    yp0Var.setTranslationX(sr0VarArr[c10 ^ 1].getTranslationX());
                    abs = 1.0f - (Math.abs(yp0Var.getTranslationX()) / yp0Var.getMeasuredWidth());
                }
                float f12 = 0.0f;
                for (int i7 = 0; i7 < sr0VarArr.length; i7++) {
                    if (sr0VarArr[i7].getVisibility() == 0) {
                        cq0 cq0Var = sr0VarArr[i7].h;
                        if (cq0Var.getChildCount() == 0) {
                            childAt = null;
                        } else {
                            childAt = cq0Var.getChildAt(0);
                        }
                        if (childAt == null) {
                            R = -1;
                        } else {
                            R = RecyclerView.R(childAt);
                        }
                        if (R == 0) {
                            f10 = childAt.getY() - cq0Var.getPaddingTop();
                        } else if (cq0Var.getChildCount() == 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = -org.telegram.messenger.g0.L(48.0f);
                        }
                        f12 += Utilities.l(1.0f - (sr0VarArr[i7].getTranslationX() / sr0VarArr[i7].getMeasuredWidth())) * f10;
                    }
                }
                float l10 = Utilities.l(1.0f - ((-f12) / org.telegram.messenger.g0.N(48.0f)));
                float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, l10);
                yp0Var.setAlpha(l10);
                yp0Var.setScaleX(T1);
                yp0Var.setScaleY(T1);
                yp0Var.setTranslationY(this.N1 + f12);
                f11 = abs;
            }
            U();
            if (this.X1 != f11) {
                this.X1 = f11;
                invalidate();
            }
        }
    }

    public final boolean S0(org.telegram.messenger.ij ijVar, View view, int i7, boolean z9) {
        yp0 yp0Var;
        char c10;
        int i10;
        int i11;
        final TL_stories.StoryItem storyItem;
        gr0 gr0Var;
        di.q6 q6Var;
        if (!this.E1) {
            org.telegram.ui.ActionBar.f2 f2Var = this.f40440x1;
            if (f2Var.getParentActivity() != null && ijVar != null && ((yp0Var = this.f40374b0) == null || !yp0Var.f47339f)) {
                org.telegram.messenger.g0.v1(f2Var.getParentActivity().getCurrentFocus());
                long j3 = this.l1;
                int i12 = 8;
                if (z9 && ((I0(getClosestTab()) || getClosestTab() == 8) && !this.E1)) {
                    if (view instanceof org.telegram.ui.Cells.o7) {
                        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                        o7Var.k(o7Var.f29674n, o7Var.f29679r, true);
                    }
                    TL_stories.StoryItem storyItem2 = ijVar.f23248l;
                    if (storyItem2 != null) {
                        HashSet hashSet = new HashSet();
                        ArrayList<Integer> arrayList = storyItem2.albums;
                        if (arrayList != null) {
                            hashSet.addAll(arrayList);
                        }
                        boolean I0 = I0(getClosestTab());
                        k60 I = k60.I(f2Var, view);
                        k60 J = I.J();
                        J.c(2131231240, org.telegram.messenger.hd.M0(2131753756, null), new org.telegram.ui.gq0(I, 27), false);
                        J.k();
                        k60.f(J, getStoriesController().B(j3, true), hashSet, true, new ng(this, storyItem2, I, 19), new di.s2(this, hashSet, storyItem2, I, 10));
                        I.c(2131231765, org.telegram.messenger.hd.M0(2131744806, null), new hi.h2(I, J, 9), false);
                        I.k();
                        I.c(2131232357, org.telegram.messenger.hd.M0(2131744790, null), new ai.a1(this, ijVar, view, i7, 28), false);
                        if (I0) {
                            int u12 = u1(getClosestTab());
                            String w10 = getStoriesController().w(u12, j3);
                            I.c(2131232773, org.telegram.messenger.hd.M0(2131744791, null), new wo0(this, u12, 0), false);
                            storyItem = storyItem2;
                            I.c(2131232329, org.telegram.messenger.hd.M0(2131744792, null), new ai.a1((Object) this, u12, (Object) storyItem, w10, 29), false);
                        } else {
                            storyItem = storyItem2;
                            if (getClosestTab() == 8 && (gr0Var = this.f40384e0) != null && (q6Var = gr0Var.f38717s) != null) {
                                if (q6Var.m(storyItem.f27192id)) {
                                    I.c(2131231002, org.telegram.messenger.hd.M0(2131744788, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            int i13 = r1;
                                            TL_stories.StoryItem storyItem3 = storyItem;
                                            xs0 xs0Var = this;
                                            switch (i13) {
                                                case 0:
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, xs0Var.getContext(), xs0Var.H1);
                                                    String M0 = org.telegram.messenger.hd.M0(2131751488, null);
                                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                                                    u1Var.R = M0;
                                                    u1Var.T = org.telegram.messenger.hd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751599, null), new fp0(xs0Var, storyItem3));
                                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new il0(7));
                                                    u1Var.show();
                                                    u1Var.i();
                                                    return;
                                                case 1:
                                                    xs0Var.getClass();
                                                    xs0Var.d1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f27192id))), false);
                                                    return;
                                                case 2:
                                                    xs0Var.getClass();
                                                    xs0Var.d1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f27192id))), true);
                                                    return;
                                                default:
                                                    xs0.h(xs0Var, storyItem3);
                                                    return;
                                            }
                                        }
                                    }, false);
                                } else {
                                    I.c(2131230998, org.telegram.messenger.hd.M0(2131744793, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            int i13 = r1;
                                            TL_stories.StoryItem storyItem3 = storyItem;
                                            xs0 xs0Var = this;
                                            switch (i13) {
                                                case 0:
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, xs0Var.getContext(), xs0Var.H1);
                                                    String M0 = org.telegram.messenger.hd.M0(2131751488, null);
                                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                                                    u1Var.R = M0;
                                                    u1Var.T = org.telegram.messenger.hd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751599, null), new fp0(xs0Var, storyItem3));
                                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new il0(7));
                                                    u1Var.show();
                                                    u1Var.i();
                                                    return;
                                                case 1:
                                                    xs0Var.getClass();
                                                    xs0Var.d1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f27192id))), false);
                                                    return;
                                                case 2:
                                                    xs0Var.getClass();
                                                    xs0Var.d1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f27192id))), true);
                                                    return;
                                                default:
                                                    xs0.h(xs0Var, storyItem3);
                                                    return;
                                            }
                                        }
                                    }, false);
                                }
                            }
                            I.c(2131232051, org.telegram.messenger.hd.M0(2131744798, null), new Runnable() {
                                @Override
                                public final void run() {
                                    int i13 = r1;
                                    TL_stories.StoryItem storyItem3 = storyItem;
                                    xs0 xs0Var = this;
                                    switch (i13) {
                                        case 0:
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, xs0Var.getContext(), xs0Var.H1);
                                            String M0 = org.telegram.messenger.hd.M0(2131751488, null);
                                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                                            u1Var.R = M0;
                                            u1Var.T = org.telegram.messenger.hd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751599, null), new fp0(xs0Var, storyItem3));
                                            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new il0(7));
                                            u1Var.show();
                                            u1Var.i();
                                            return;
                                        case 1:
                                            xs0Var.getClass();
                                            xs0Var.d1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f27192id))), false);
                                            return;
                                        case 2:
                                            xs0Var.getClass();
                                            xs0Var.d1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f27192id))), true);
                                            return;
                                        default:
                                            xs0.h(xs0Var, storyItem3);
                                            return;
                                    }
                                }
                            }, false);
                        }
                        I.c(2131232108, org.telegram.messenger.hd.M0(2131751599, null), new Runnable() {
                            @Override
                            public final void run() {
                                int i13 = r1;
                                TL_stories.StoryItem storyItem3 = storyItem;
                                xs0 xs0Var = this;
                                switch (i13) {
                                    case 0:
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, xs0Var.getContext(), xs0Var.H1);
                                        String M0 = org.telegram.messenger.hd.M0(2131751488, null);
                                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                                        u1Var.R = M0;
                                        u1Var.T = org.telegram.messenger.hd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751599, null), new fp0(xs0Var, storyItem3));
                                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new il0(7));
                                        u1Var.show();
                                        u1Var.i();
                                        return;
                                    case 1:
                                        xs0Var.getClass();
                                        xs0Var.d1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f27192id))), false);
                                        return;
                                    case 2:
                                        xs0Var.getClass();
                                        xs0Var.d1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f27192id))), true);
                                        return;
                                    default:
                                        xs0.h(xs0Var, storyItem3);
                                        return;
                                }
                            }
                        }, true);
                        I.f35187i = 3;
                        I.f35207u = true;
                        I.v = true;
                        I.L = true;
                        I.M = 3;
                        Point point = org.telegram.messenger.g0.f22544q;
                        int min = Math.min((int) (Math.min(point.x, point.y) * 0.6777f), (int) (((Math.max(point.x, point.y) * 0.4333f) * 3.0f) / 4.0f));
                        I.N = min;
                        I.O = (min * 4) / 3;
                        I.f35206t = true;
                        I.P = true;
                        I.W = true;
                        I.Z();
                        return true;
                    }
                } else {
                    if (org.telegram.messenger.ij.B0(ijVar.f23244k) == j3) {
                        c10 = 0;
                    } else {
                        c10 = 1;
                    }
                    SparseArray[] sparseArrayArr = this.f40375b1;
                    sparseArrayArr[c10].put(ijVar.f1(), ijVar);
                    if (!ijVar.s(null, false)) {
                        this.f40379c1++;
                    }
                    if (this.f40379c1 == 0) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    this.f40411n0.setVisibility(i10);
                    org.telegram.ui.ActionBar.r0 r0Var = this.f40436w0;
                    if (r0Var != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i11 = 0;
                        } else {
                            i11 = 8;
                        }
                        r0Var.setVisibility(i11);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var2 = this.f40433v0;
                    if (r0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i12 = 0;
                        }
                        r0Var2.setVisibility(i12);
                    }
                    m1(1, false);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    int i13 = 0;
                    while (true) {
                        ArrayList arrayList3 = this.P0;
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
                    this.f40382d1 = false;
                    if (view instanceof org.telegram.ui.Cells.h7) {
                        ((org.telegram.ui.Cells.h7) view).b(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.p7) {
                        ((org.telegram.ui.Cells.p7) view).b(i7, true, true);
                    } else if (view instanceof org.telegram.ui.Cells.k7) {
                        ((org.telegram.ui.Cells.k7) view).f(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.g7) {
                        ((org.telegram.ui.Cells.g7) view).e(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.h2) {
                        ((org.telegram.ui.Cells.h2) view).c(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.o7) {
                        ((org.telegram.ui.Cells.o7) view).i(true, true);
                    }
                    if (!this.E1) {
                        o1(true);
                    }
                    O0(sparseArrayArr[0]);
                    E1();
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean T() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xs0.T():boolean");
    }

    public boolean T0(TLRPC.ChatParticipant chatParticipant, boolean z9, View view) {
        return false;
    }

    public final void U() {
        pr prVar = this.R0;
        if (prVar != null) {
            prVar.setTranslationY(this.N1);
        }
    }

    public final void U0(float f10) {
        sr0 sr0Var;
        int i7;
        int i10;
        sr0 sr0Var2;
        int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        sr0[] sr0VarArr = this.m0;
        if (i11 != 0 || sr0VarArr[1].getVisibility() == 0) {
            if (this.f40401j1) {
                sr0VarArr[0].setTranslationX((-f10) * sr0Var2.getMeasuredWidth());
                sr0VarArr[1].setTranslationX(sr0VarArr[0].getMeasuredWidth() - (sr0VarArr[0].getMeasuredWidth() * f10));
            } else {
                sr0VarArr[0].setTranslationX(sr0Var.getMeasuredWidth() * f10);
                sr0VarArr[1].setTranslationX((sr0VarArr[0].getMeasuredWidth() * f10) - sr0VarArr[0].getMeasuredWidth());
            }
            X0(getTabProgress());
            float k02 = k0(f10);
            this.f40423r0 = k02;
            int i12 = 4;
            if (k02 != 0.0f && I() && !A0()) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            this.f40429t0.setVisibility(i7);
            org.telegram.ui.ActionBar.r0 r0Var = this.f40416p0;
            if (r0Var != null && !I()) {
                if (H0()) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                setSearchItemVisibility(i10);
                this.f40419q0 = 0.0f;
            } else {
                this.f40419q0 = l0(f10);
                L1();
            }
            G1(false);
            if (i11 == 0) {
                sr0 sr0Var3 = sr0VarArr[0];
                sr0VarArr[0] = sr0VarArr[1];
                sr0VarArr[1] = sr0Var3;
                sr0Var3.setVisibility(8);
                if (r0Var != null && this.f40444z0 == 2) {
                    if (H0()) {
                        i12 = 8;
                    }
                    setSearchItemVisibility(i12);
                }
                this.f40444z0 = 0;
                s1();
            }
        }
    }

    public final boolean V(boolean z9) {
        SparseArray[] sparseArrayArr;
        if (!this.E1) {
            return false;
        }
        int i7 = 1;
        while (true) {
            sparseArrayArr = this.f40375b1;
            if (i7 < 0) {
                break;
            }
            sparseArrayArr[i7].clear();
            i7--;
        }
        this.f40379c1 = 0;
        O0(sparseArrayArr[0]);
        sp0 sp0Var = this.W;
        if (sp0Var != null) {
            sp0Var.h();
            sp0Var.j();
        }
        o1(false);
        J1(z9);
        is0 is0Var = this.T;
        if (is0Var != null) {
            is0Var.f34776x.clear();
        }
        return true;
    }

    public final org.telegram.ui.ActionBar.r0 W(Context context, int i7, int i10, String str) {
        org.telegram.ui.ActionBar.r0 r0Var;
        org.telegram.ui.ActionBar.y4 y4Var = this.H;
        if (y4Var != null) {
            r0Var = y4Var.l().b(i7, i10);
        } else {
            int i11 = org.telegram.ui.ActionBar.k6.f28261z8;
            int s02 = s0(i11);
            int i12 = org.telegram.ui.ActionBar.k6.f28243y8;
            org.telegram.ui.ActionBar.r0 r0Var2 = new org.telegram.ui.ActionBar.r0(context, null, s02, s0(i12), false, null);
            r0Var2.setIcon(i10);
            r0Var2.setDuplicateParentStateEnabled(false);
            this.D0.addView(r0Var2, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
            this.P0.add(r0Var2);
            ch0 iconView = r0Var2.getIconView();
            org.telegram.ui.ActionBar.f6 f6Var = this.H1;
            if (iconView != null) {
                org.telegram.ui.ActionBar.r6.t(r0Var2.getIconView(), i12, f6Var, PorterDuff.Mode.SRC_IN);
            }
            if (r0Var2.getBackground() != null) {
                Drawable background = r0Var2.getBackground();
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
                r0Var2.setBackground(background);
                org.telegram.ui.ActionBar.r6.k(r0Var2, background, null, N, f6Var);
            }
            r0Var = r0Var2;
        }
        r0Var.setContentDescription(str);
        r0Var.setOnClickListener(new ai.v(this, i7, 18));
        return r0Var;
    }

    public void W0() {
        boolean z9;
        int i7;
        boolean z10;
        boolean z11;
        boolean z12;
        if (!H0() && !A0()) {
            z9 = false;
        } else {
            z9 = true;
        }
        ss0 ss0Var = this.f40391g0.f38719x;
        if (ss0Var != null) {
            if (z9 && getClosestTab() == 9) {
                z12 = true;
            } else {
                z12 = false;
            }
            ss0Var.b(z12);
        }
        ss0 ss0Var2 = this.f40384e0.f38719x;
        if (ss0Var2 != null) {
            if (z9 && getClosestTab() == 8) {
                z11 = true;
            } else {
                z11 = false;
            }
            ss0Var2.b(z11);
        }
        for (ws0 ws0Var : this.f40407l2.values()) {
            vs0 vs0Var = ws0Var.f40087c;
            if (vs0Var.f38717s != null) {
                ss0 ss0Var3 = vs0Var.f38719x;
                if (z9 && getClosestTab() == ws0Var.f40085a) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ss0Var3.b(z10);
            }
        }
        org.telegram.ui.ActionBar.r0 r0Var = this.f40416p0;
        if (r0Var != null) {
            qq0 qq0Var = this.L0;
            if (qq0Var != null && qq0Var.a() && getSelectedTab() == 11) {
                i7 = 2131745869;
            } else {
                i7 = 2131745837;
            }
            r0Var.setSearchFieldHint(org.telegram.messenger.hd.M0(i7, null));
        }
        S();
        R(true, true);
    }

    public void X0(float f10) {
        P0();
    }

    public boolean Y() {
        return this instanceof o20;
    }

    public final void Y0(org.telegram.ui.ActionBar.f2 f2Var, long j3, int i7) {
        new org.telegram.ui.c21(f2Var, j3, this.f40414o1[1], new bi.f4(this, j3, i7)).show();
    }

    public final boolean Z(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x10 = (-view.getX()) - getX();
        sr0[] sr0VarArr = this.m0;
        motionEvent.offsetLocation(x10 - sr0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - sr0VarArr[0].getY()) - sr0VarArr[0].h.getFastScroll().getY());
        return sr0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public final void Z0(org.telegram.ui.ActionBar.f2 f2Var, long j3, int i7) {
        v4.s0(f2Var, org.telegram.messenger.hd.M0(2131751599, null), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131744796, getStoriesController().w(i7, j3))), org.telegram.messenger.hd.M0(2131751599, null), true, new bi.ia(this, j3, i7, 8));
    }

    public final boolean a0(int i7) {
        ms0[] ms0VarArr = this.f40437w1.f37067n;
        if (ms0VarArr == null) {
            return false;
        }
        ms0[] ms0VarArr2 = this.f40434v1;
        if (i7 == 0) {
            ms0 ms0Var = ms0VarArr2[i7];
            if (!ms0Var.h) {
                int[] iArr = ms0Var.f36067f;
                int[] iArr2 = ms0VarArr[i7].f36067f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = ms0VarArr2[i7].f36067f;
            int[] iArr4 = ms0VarArr[i7].f36067f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        ms0VarArr2[i7].f36063a.addAll(ms0VarArr[i7].f36063a);
        ms0VarArr2[i7].f36065c.addAll(ms0VarArr[i7].f36065c);
        for (Map.Entry entry : ms0VarArr[i7].d.entrySet()) {
            ms0VarArr2[i7].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i10 = 0; i10 < 2; i10++) {
            ms0VarArr2[i7].f36064b[i10] = ms0VarArr[i7].f36064b[i10].clone();
            ms0 ms0Var2 = ms0VarArr2[i7];
            int[] iArr5 = ms0Var2.f36070j;
            ms0 ms0Var3 = ms0VarArr[i7];
            iArr5[i10] = ms0Var3.f36070j[i10];
            ms0Var2.f36069i[i10] = ms0Var3.f36069i[i10];
        }
        ms0VarArr2[i7].f36066e.addAll(ms0VarArr[i7].f36066e);
        return !ms0VarArr[i7].f36063a.isEmpty();
    }

    public final void a1(org.telegram.ui.ActionBar.f2 f2Var, long j3, int i7) {
        String w10 = getStoriesController().w(i7, j3);
        Context context = f2Var.getContext();
        org.telegram.ui.ActionBar.f6 resourceProvider = f2Var.getResourceProvider();
        c4.n nVar = new c4.n(this, j3, i7, 5);
        Pattern pattern = v4.f38813a;
        v4.O(context, f2Var, org.telegram.messenger.hd.M0(2131744783, null), org.telegram.messenger.hd.M0(2131744782, null), org.telegram.messenger.hd.M0(2131744781, null), w10, 12, org.telegram.messenger.hd.M0(2131746277, null), resourceProvider, nVar);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.zi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27849d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28233xi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.yi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28259z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.pj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28214wi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28241y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28014m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27951ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27869e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27888f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28223x7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28146t7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28204w7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27984kd));
    }

    public final boolean b0(int r27, org.telegram.ui.Components.wr0 r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xs0.b0(int, org.telegram.ui.Components.wr0):boolean");
    }

    public final void b1(String str) {
        boolean J3 = org.telegram.messenger.g0.J3(str);
        org.telegram.ui.ActionBar.f2 f2Var = this.f40440x1;
        if (J3) {
            v4.n0(f2Var, str, true, true);
        } else {
            vf.c.t(f2Var.getParentActivity(), str);
        }
    }

    public final void c0(int i7, pj0 pj0Var, boolean z9) {
        ArrayList arrayList = this.f40434v1[i7].f36066e;
        int L0 = ((v4.b0) pj0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            xr0 xr0Var = null;
            if (arrayList != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    } else if (L0 <= ((xr0) arrayList.get(i10)).f40363b) {
                        xr0Var = (xr0) arrayList.get(i10);
                        break;
                    } else {
                        i10++;
                    }
                }
                if (xr0Var == null) {
                    xr0Var = (xr0) jg.g.i(1, arrayList);
                }
            }
            if (xr0Var != null) {
                K0(i7, xr0Var.d, xr0Var.f40363b + 1, z9);
            }
        }
    }

    public int c1() {
        return -1;
    }

    public final void d0() {
        sr0[] sr0VarArr;
        sr0 sr0Var;
        boolean z9;
        int i7;
        v4.g0 adapter;
        if (this.f40420q1) {
            int i10 = 0;
            while (true) {
                sr0VarArr = this.m0;
                if (i10 < sr0VarArr.length) {
                    sr0Var = sr0VarArr[i10];
                    if (sr0Var.E == this.f40424r1) {
                        break;
                    }
                    i10++;
                } else {
                    sr0Var = null;
                    break;
                }
            }
            if (sr0Var != null) {
                boolean z02 = z0(sr0Var.E);
                float f10 = this.f40417p1;
                float f11 = 1.0f;
                int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                ms0[] ms0VarArr = this.f40434v1;
                if (i11 == 0) {
                    this.f40420q1 = false;
                    int i12 = this.f40428s1;
                    int[] iArr = this.f40414o1;
                    iArr[z02 ? 1 : 0] = i12;
                    if (!z02) {
                        org.telegram.messenger.iz.B(i12);
                    } else if (m0(sr0Var.E) >= 5) {
                        org.telegram.messenger.iz.F(this.f40428s1);
                    }
                    for (int i13 = 0; i13 < sr0VarArr.length; i13++) {
                        sr0 sr0Var2 = sr0VarArr[i13];
                        if (sr0Var2 != null && sr0Var2.h != null && (((i7 = sr0Var2.E) == 0 || z0(i7)) && (adapter = sr0VarArr[i13].h.getAdapter()) != null)) {
                            int b10 = adapter.b();
                            if (i13 == 0) {
                                ms0VarArr[0].g(false);
                            }
                            sr0VarArr[i13].f38110n.setVisibility(8);
                            sr0VarArr[i13].f38114x.y1(iArr[z02 ? 1 : 0]);
                            sr0VarArr[i13].h.a0();
                            sr0VarArr[i13].h.invalidate();
                            if (adapter.b() == b10) {
                                org.telegram.messenger.g0.b4(sr0VarArr[i13].h);
                            } else {
                                adapter.f();
                            }
                        }
                    }
                    if (this.f40426s >= 0) {
                        for (int i14 = 0; i14 < sr0VarArr.length; i14++) {
                            sr0 sr0Var3 = sr0VarArr[i14];
                            if (sr0Var3.E == this.f40424r1) {
                                View m10 = sr0Var3.f38111r.m(this.f40426s);
                                if (m10 != null) {
                                    this.f40435w = m10.getTop();
                                }
                                sr0 sr0Var4 = sr0VarArr[i14];
                                sr0Var4.f38114x.h1(this.f40426s, (-sr0Var4.h.getPaddingTop()) + this.f40435w);
                            }
                        }
                        return;
                    }
                    h1();
                } else if (f10 == 0.0f) {
                    this.f40420q1 = false;
                    if (this.f40424r1 == 0) {
                        ms0VarArr[0].g(false);
                    }
                    sr0Var.f38110n.setVisibility(8);
                    sr0Var.h.invalidate();
                } else {
                    if (f10 > 0.2f) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (!z9) {
                        f11 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
                    ofFloat.addUpdateListener(new sq0(this, sr0Var, 0));
                    ofFloat.addListener(new org.telegram.ui.ji(this, z9, z02 ? 1 : 0, sr0Var));
                    ofFloat.setInterpolator(xq.f40345f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                }
            }
        }
    }

    public final void d1(ArrayList arrayList, boolean z9) {
        boolean z10;
        boolean z11;
        gr0 gr0Var = this.f40384e0;
        if (gr0Var != null && gr0Var.f38717s != null) {
            org.telegram.ui.ActionBar.f2 f2Var = this.f40440x1;
            if (z9 && arrayList.size() > f2Var.getMessagesController().N5) {
                org.telegram.messenger.camera.q.s(org.telegram.messenger.hd.G(f2Var.getMessagesController().N5, "StoriesPinLimit", new Object[0]), hc.a0(f2Var), 2131623981, 36);
                return;
            }
            di.q6 q6Var = gr0Var.f38717s;
            int i7 = q6Var.f9639c;
            ArrayList arrayList2 = q6Var.f9642g;
            ArrayList arrayList3 = new ArrayList(arrayList2);
            boolean z12 = true;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Integer num = (Integer) arrayList.get(size);
                num.getClass();
                if (z9 && !arrayList3.contains(num)) {
                    arrayList3.add(0, num);
                } else if (!z9 && arrayList3.contains(num)) {
                    arrayList3.remove(num);
                }
            }
            if (arrayList3.size() > org.telegram.messenger.qp.s1(i7).N5) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (arrayList2.size() != arrayList3.size()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList2.size()) {
                            break;
                        } else if (arrayList2.get(i10) != arrayList3.get(i10)) {
                            z11 = true;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (z11) {
                    arrayList2.clear();
                    arrayList2.addAll(arrayList3);
                    q6Var.d(true);
                    TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                    tL_togglePinnedToTop.f27205id.addAll(arrayList2);
                    tL_togglePinnedToTop.peer = org.telegram.messenger.qp.s1(i7).j1(q6Var.d);
                    ConnectionsManager.getInstance(i7).sendRequest(tL_togglePinnedToTop, new di.u5(2));
                }
                z12 = z10;
            }
            if (z12) {
                org.telegram.messenger.camera.q.s(org.telegram.messenger.hd.G(f2Var.getMessagesController().N5, "StoriesPinLimit", new Object[0]), hc.a0(f2Var), 2131623981, 36);
            } else if (z9) {
                hc.a0(f2Var).I(2131624054, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(arrayList.size(), "StoriesPinned", new Object[0])), org.telegram.messenger.hd.G(arrayList.size(), "StoriesPinnedText", new Object[0])).j();
            } else {
                org.telegram.messenger.camera.q.s(org.telegram.messenger.hd.G(arrayList.size(), "StoriesUnpinned", new Object[0]), hc.a0(f2Var), 2131624060, 36);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r42, int r43, java.lang.Object... r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xs0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        tq0 tq0Var = this.K0;
        if (tq0Var != null) {
            canvas.save();
            canvas.translate(tq0Var.getX(), tq0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        oq0 oq0Var = this.T0;
        if (oq0Var != null) {
            int i7 = oq0Var.U;
            if ((i7 == 3 || i7 == 1) && this.R0 == null) {
                canvas.save();
                canvas.translate(oq0Var.getX(), oq0Var.getY());
                oq0Var.setDrawOverlay(true);
                oq0Var.draw(canvas);
                oq0Var.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int i7;
        if (this.f40376b2 && (view instanceof sr0) && this.f40390f2 < this.d2) {
            canvas.save();
            canvas.clipRect(0, -this.f40390f2, getWidth(), getHeight() + this.f40386e2);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        } else if (view == this.T0 && this.R0 == null) {
            canvas.save();
            sr0[] sr0VarArr = this.m0;
            float top = sr0VarArr[0].getTop();
            yp0 yp0Var = this.f40374b0;
            if (yp0Var != null && ((i7 = sr0VarArr[0].E) == 8 || I0(i7))) {
                top -= yp0Var.getVisualHeight();
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
        ((WindowManager) org.telegram.messenger.t0.f25563b.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i7 == 0) {
            if (!org.telegram.messenger.g0.Q1() && org.telegram.messenger.t0.f25563b.getResources().getConfiguration().orientation == 2) {
                this.C0.setTextSize(18);
            } else {
                this.C0.setTextSize(20);
            }
        }
        if (i7 == 0) {
            this.J.f();
        }
    }

    public final boolean e1(MotionEvent motionEvent, boolean z9) {
        int i7;
        sr0 sr0Var;
        sp0 sp0Var;
        int i10;
        int i11;
        int closestTab = getClosestTab();
        tq0 tq0Var = this.K0;
        SparseIntArray sparseIntArray = tq0Var.O;
        int i12 = tq0Var.f31534n;
        int i13 = -1;
        if (z9) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        int i14 = sparseIntArray.get(i12 + i7, -1);
        yp0 yp0Var = this.f40374b0;
        if (yp0Var != null) {
            if (!I0(closestTab) && closestTab != 8) {
                if (I0(i14) || i14 == 8) {
                    i13 = yp0Var.getCurrentAlbumId();
                }
            } else {
                u61 u61Var = yp0Var.f47336b;
                SparseIntArray sparseIntArray2 = u61Var.f38513b0;
                int i15 = u61Var.F;
                if (z9) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                i13 = sparseIntArray2.get(i15 + i11, -1);
            }
            if (i13 == 0) {
                i14 = 8;
            } else if (i13 > 0) {
                i14 = v1(i13).f40085a;
            }
        }
        if (i14 >= 0) {
            if (this.f40416p0 != null && !I()) {
                if (H0()) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                setSearchItemVisibility(i10);
                this.f40419q0 = 0.0f;
            } else {
                this.f40419q0 = l0(0.0f);
                K1(0.0f);
            }
            if ((!this.X0 || getSelectedTab() != 11) && (!H() || !this.E1 || (getClosestTab() != 8 && !I0(getClosestTab())))) {
                sr0[] sr0VarArr = this.m0;
                sr0 sr0Var2 = sr0VarArr[0];
                if (sr0Var2 != null && sr0Var2.E == 13 && (sp0Var = this.W) != null) {
                    ei.a aVar = sp0Var.f10849n;
                    if (!z9) {
                    }
                }
                sr0 sr0Var3 = sr0VarArr[0];
                up0 up0Var = this.f40370a0;
                if (sr0Var3 != null && sr0Var3.E == 14 && up0Var != null) {
                    ei.a aVar2 = up0Var.h;
                    if (!z9) {
                    }
                }
                if ((!this.E1 || (sr0Var = sr0VarArr[0]) == null || sr0Var.E != 13) && ((up0Var == null || !up0Var.g()) && (yp0Var == null || !yp0Var.f47339f))) {
                    G1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    w0();
                    this.A1 = false;
                    this.f40445z1 = true;
                    this.B1 = (int) motionEvent.getX();
                    setHeaderEnabled(false);
                    tq0Var.setEnabled(false);
                    sr0 sr0Var4 = sr0VarArr[1];
                    sr0Var4.E = i14;
                    sr0Var4.setVisibility(0);
                    this.f40401j1 = z9;
                    z1(true);
                    if (z9) {
                        sr0VarArr[1].setTranslationX(sr0VarArr[0].getMeasuredWidth());
                    } else {
                        sr0VarArr[1].setTranslationX(-sr0VarArr[0].getMeasuredWidth());
                    }
                    X0(getTabProgress());
                    return true;
                }
            }
        }
        return false;
    }

    public final String f0(boolean z9) {
        int i7;
        int i10;
        TLRPC.MessageMedia messageMedia;
        sp0 sp0Var;
        if (!B0()) {
            return org.telegram.messenger.hd.M0(2131753014, null);
        }
        if (z9 && (sp0Var = this.W) != null) {
            return sp0Var.getBotPreviewsSubtitle();
        }
        gr0 gr0Var = this.f40384e0;
        if (gr0Var != null && gr0Var.f38717s != null) {
            i7 = 0;
            i10 = 0;
            for (int i11 = 0; i11 < gr0Var.f38717s.f9643i.size(); i11++) {
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) gr0Var.f38717s.f9643i.get(i11);
                TL_stories.StoryItem storyItem = ijVar.f23248l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    if (org.telegram.messenger.ij.L4(messageMedia.document)) {
                        i10++;
                    } else if (ijVar.f23248l.media.photo != null) {
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

    public final sr0 g0(int i7) {
        int i10 = 0;
        while (true) {
            sr0[] sr0VarArr = this.m0;
            if (i10 < sr0VarArr.length) {
                sr0 sr0Var = sr0VarArr[i10];
                if (sr0Var != null && sr0Var.E == i7) {
                    return sr0Var;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final void g1(v4.g0 g0Var) {
        if (g0Var instanceof rs0) {
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
            gs0 gs0Var = this.P;
            if (g0Var == gs0Var) {
                gs0Var.f33994r = null;
            }
        }
    }

    public SparseArray<org.telegram.messenger.ij> getActionModeSelected() {
        return this.f40375b1[0];
    }

    public float getBottomButtonStoriesVisibility() {
        sr0 sr0Var;
        sr0 sr0Var2;
        boolean z9;
        boolean z10;
        di.q6 q6Var;
        di.q6 q6Var2;
        float f10 = 1.0f;
        sr0[] sr0VarArr = this.m0;
        if (sr0VarArr == null || (sr0Var = sr0VarArr[0]) == null || (sr0Var2 = sr0VarArr[1]) == null || sr0Var.f38113w == null || sr0Var2.f38113w == null) {
            return 1.0f;
        }
        int i7 = sr0Var.E;
        int i10 = sr0Var2.E;
        if (!I0(i7) && i7 != 8) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!I0(i10) && i10 != 8) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z9 && !z10) {
            return 1.0f;
        }
        float visibilityFactor = 1.0f - sr0VarArr[0].f38113w.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - sr0VarArr[1].f38113w.getVisibilityFactor();
        us0 x12 = x1(sr0VarArr[0].E);
        if (i7 == 8 || (x12 != null && (q6Var2 = x12.f38717s) != null && q6Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        us0 x13 = x1(i10);
        if (i10 != 8 && (x13 == null || (q6Var = x13.f38717s) == null || q6Var.g() <= 0)) {
            f10 = visibilityFactor2;
        }
        if (!z9) {
            visibilityFactor = f10;
        }
        if (!z10) {
            f10 = visibilityFactor;
        }
        return org.telegram.messenger.g0.T1(visibilityFactor, f10, Math.abs(sr0VarArr[0].getTranslationX() / sr0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        sr0[] sr0VarArr = this.m0;
        sr0 sr0Var = sr0VarArr[1];
        if (sr0Var != null && sr0Var.getVisibility() == 0) {
            if (this.f40398i1 && !this.f40404k1) {
                return sr0VarArr[1].E;
            }
            if (Math.abs(sr0VarArr[1].getTranslationX()) < sr0VarArr[1].getMeasuredWidth() / 2.0f) {
                return sr0VarArr[1].E;
            }
        }
        return getSelectedTab();
    }

    public pj0 getCurrentListView() {
        er0 er0Var;
        sr0 sr0Var = this.m0[0];
        int i7 = sr0Var.E;
        if (i7 == 13) {
            return this.W.getCurrentListView();
        }
        if (i7 == 14) {
            return this.f40370a0.getCurrentListView();
        }
        if (i7 == 12 && (er0Var = this.V) != null) {
            return er0Var.f44857a.f44037z0;
        }
        return sr0Var.h;
    }

    public int getInitialTab() {
        return 0;
    }

    public int getPhotosVideosTypeFilter() {
        return this.f40434v1[0].f36077q;
    }

    public TextView getSaveItem() {
        return this.f40427s0;
    }

    public org.telegram.ui.ActionBar.r0 getSearchItem() {
        return this.f40416p0;
    }

    public ch0 getSearchOptionsItem() {
        return this.f40431u0;
    }

    public int getSelectedTab() {
        int currentTabId = this.K0.getCurrentTabId();
        yp0 yp0Var = this.f40374b0;
        if (yp0Var != null && currentTabId == 8) {
            int currentAlbumId = yp0Var.getCurrentAlbumId();
            if (currentAlbumId == 0) {
                return 8;
            }
            if (currentAlbumId > 0) {
                return v1(currentAlbumId).f40085a;
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
            sr0[] sr0VarArr = this.m0;
            if (i7 < sr0VarArr.length) {
                sr0 sr0Var = sr0VarArr[i7];
                if (sr0Var != null) {
                    f10 = ((1.0f - Math.abs(sr0Var.getTranslationX() / getWidth())) * sr0Var.E) + f10;
                }
                i7++;
            } else {
                return f10;
            }
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.t6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.t6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.C0, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28259z6));
        int i7 = org.telegram.ui.ActionBar.k6.f28261z8;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40411n0, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        org.telegram.ui.ActionBar.r0 r0Var = this.f40436w0;
        if (r0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(r0Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        }
        org.telegram.ui.ActionBar.r0 r0Var2 = this.f40433v0;
        if (r0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(r0Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        }
        Drawable[] drawableArr = {this.F0};
        int i10 = org.telegram.ui.ActionBar.k6.f28243y8;
        ImageView imageView = this.E0;
        arrayList.add(new org.telegram.ui.ActionBar.t6(imageView, 8, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.D0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27849d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.K0, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28177ui));
        tq0 tq0Var = this.K0;
        arrayList.add(new org.telegram.ui.ActionBar.t6(tq0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28157ti));
        arrayList.add(new org.telegram.ui.ActionBar.t6(tq0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28138si));
        arrayList.add(new org.telegram.ui.ActionBar.t6(tq0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28195vi));
        oq0 oq0Var = this.T0;
        if (oq0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(oq0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28185v7));
            arrayList.add(new org.telegram.ui.ActionBar.t6(oq0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28166u7));
            arrayList.add(new org.telegram.ui.ActionBar.t6(oq0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28242y7));
            arrayList.add(new org.telegram.ui.ActionBar.t6(oq0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.A7));
        }
        final int i11 = 0;
        while (true) {
            sr0[] sr0VarArr = this.m0;
            if (i11 < sr0VarArr.length) {
                org.telegram.ui.ActionBar.s6 s6Var = new org.telegram.ui.ActionBar.s6() {
                    @Override
                    public final void b() {
                        sr0[] sr0VarArr2 = xs0.this.m0;
                        int i12 = i11;
                        cq0 cq0Var = sr0VarArr2[i12].h;
                        if (cq0Var != null) {
                            int childCount = cq0Var.getChildCount();
                            for (int i13 = 0; i13 < childCount; i13++) {
                                View childAt = sr0VarArr2[i12].h.getChildAt(i13);
                                if (childAt instanceof org.telegram.ui.Cells.p7) {
                                    org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) childAt;
                                    for (int i14 = 0; i14 < 6; i14++) {
                                        p7Var.f29734a[i14].f29560e.invalidate();
                                    }
                                } else if (childAt instanceof org.telegram.ui.Cells.g6) {
                                    ((org.telegram.ui.Cells.g6) childAt).y(0);
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
                arrayList.add(new org.telegram.ui.ActionBar.t6(sr0VarArr[i11].h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28129s8));
                arrayList.add(new org.telegram.ui.ActionBar.t6(sr0VarArr[i11].h, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27941i6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(sr0VarArr[i11].f38113w, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27832c7));
                int i12 = org.telegram.ui.ActionBar.k6.f27923h6;
                arrayList.add(new org.telegram.ui.ActionBar.t6(sr0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
                arrayList.add(new org.telegram.ui.ActionBar.t6(sr0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.f28031n6));
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.O7));
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.P7));
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.Q7));
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.R7));
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.S7));
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.T7));
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.U7));
                int i13 = org.telegram.ui.ActionBar.k6.i7;
                arrayList.add(new org.telegram.ui.ActionBar.t6(sr0VarArr[i11].h, 8192, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i13));
                int i14 = org.telegram.ui.ActionBar.k6.f27979k7;
                arrayList.add(new org.telegram.ui.ActionBar.t6(sr0VarArr[i11].h, 16384, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.t6(sr0VarArr[i11].h, 8, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.nj));
                arrayList.add(new org.telegram.ui.ActionBar.t6(sr0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
                arrayList.add(new org.telegram.ui.ActionBar.t6(sr0VarArr[i11].h, 8192, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i13));
                arrayList.add(new org.telegram.ui.ActionBar.t6(sr0VarArr[i11].h, 16384, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.t6(sr0VarArr[i11].h, 8192, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i13));
                arrayList.add(new org.telegram.ui.ActionBar.t6(sr0VarArr[i11].h, 16384, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.t6(sr0VarArr[i11].h, 8192, new Class[]{org.telegram.ui.Cells.p7.class}, (Paint) null, (Drawable[]) null, s6Var, i13));
                arrayList.add(new org.telegram.ui.ActionBar.t6(sr0VarArr[i11].h, 16384, new Class[]{org.telegram.ui.Cells.p7.class}, (Paint) null, (Drawable[]) null, s6Var, i14));
                arrayList.add(new org.telegram.ui.ActionBar.t6(sr0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.h2.class}, new String[]{"backgroundPaint"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.zi));
                arrayList.add(new org.telegram.ui.ActionBar.t6(sr0VarArr[i11].h, 8192, new Class[]{org.telegram.ui.Cells.h2.class}, (Paint) null, (Drawable[]) null, s6Var, i13));
                arrayList.add(new org.telegram.ui.ActionBar.t6(sr0VarArr[i11].h, 16384, new Class[]{org.telegram.ui.Cells.h2.class}, (Paint) null, (Drawable[]) null, s6Var, i14));
                arrayList.add(new org.telegram.ui.ActionBar.t6(sr0VarArr[i11].h, 0, (Class[]) null, (Paint) null, new Drawable[]{this.A0}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27813b7));
                arrayList.add(new org.telegram.ui.ActionBar.t6(sr0VarArr[i11].f38113w.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(sr0VarArr[i11].f38113w.f31925e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28241y6));
                i11++;
            } else {
                return arrayList;
            }
        }
    }

    public int getTopPanelShift() {
        return this.f40415o2;
    }

    public final int h0(int i7, int i10, boolean z9) {
        int i11;
        int i12 = 1;
        if (!z9) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        int i13 = i10 + i11;
        if (i13 > 6) {
            if (!z9) {
                i13 = 9;
            } else {
                i13 = 6;
            }
        }
        return Utilities.j(i13, 9, (this.f40408m1 && i7 == 1) ? 2 : 2);
    }

    public final void h1() {
        int i7;
        int i10 = 0;
        while (true) {
            sr0[] sr0VarArr = this.m0;
            if (i10 < sr0VarArr.length) {
                cq0 cq0Var = sr0VarArr[i10].h;
                if (cq0Var != null) {
                    int i11 = 0;
                    int i12 = 0;
                    for (int i13 = 0; i13 < cq0Var.getChildCount(); i13++) {
                        View childAt = cq0Var.getChildAt(i13);
                        if (childAt instanceof org.telegram.ui.Cells.o7) {
                            org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) childAt;
                            int messageId = o7Var.getMessageId();
                            i12 = o7Var.getTop();
                            i11 = messageId;
                        }
                        if (childAt instanceof org.telegram.ui.Cells.h7) {
                            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                            int f12 = h7Var.getMessage().f1();
                            i12 = h7Var.getTop();
                            i11 = f12;
                        }
                        if (childAt instanceof org.telegram.ui.Cells.g7) {
                            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) childAt;
                            i11 = g7Var.getMessage().f1();
                            i12 = g7Var.getTop();
                        }
                        if (i11 != 0) {
                            break;
                        }
                    }
                    if (i11 != 0) {
                        int i14 = sr0VarArr[i10].E;
                        int i15 = -1;
                        if (z0(i14)) {
                            us0 x12 = x1(i14);
                            if (x12 != null && x12.f38717s != null) {
                                int i16 = 0;
                                while (true) {
                                    if (i16 >= x12.f38717s.f9643i.size()) {
                                        break;
                                    } else if (i11 == ((org.telegram.messenger.ij) x12.f38717s.f9643i.get(i16)).f1()) {
                                        i15 = i16;
                                        break;
                                    } else {
                                        i16++;
                                    }
                                }
                            }
                            i7 = i15;
                        } else if (i14 >= 0) {
                            ms0[] ms0VarArr = this.f40434v1;
                            if (i14 < ms0VarArr.length) {
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= ms0VarArr[i14].f36063a.size()) {
                                        break;
                                    } else if (i11 == ((org.telegram.messenger.ij) ms0VarArr[i14].f36063a.get(i17)).f1()) {
                                        i15 = i17;
                                        break;
                                    } else {
                                        i17++;
                                    }
                                }
                                i7 = ms0VarArr[i14].f36073m + i15;
                            }
                        }
                        if (i15 >= 0) {
                            ((v4.b0) cq0Var.getLayoutManager()).h1(i7, (-sr0VarArr[i10].h.getPaddingTop()) + i12);
                            if (this.f40420q1) {
                                sr0 sr0Var = sr0VarArr[i10];
                                sr0Var.f38111r.h1(i7, (-sr0Var.h.getPaddingTop()) + i12);
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

    public final int i0(boolean z9) {
        int i7;
        int i10 = this.f40372a2 + this.f40386e2;
        if (z9) {
            i7 = org.telegram.messenger.g0.L(52.0f);
        } else {
            i7 = 0;
        }
        return i10 + i7;
    }

    public final void i1(int i7) {
        tq0 tq0Var;
        if (!this.O1 && (tq0Var = this.K0) != null) {
            tq0Var.g(null, i7, tq0Var.P.get(i7));
        }
    }

    public final int j0(int i7) {
        int i10;
        int n02 = n0(i7) + org.telegram.messenger.g0.L(54.0f) + this.f40380c2 + this.d2 + this.f40415o2;
        if (i7 == 9) {
            i10 = org.telegram.messenger.g0.L(64.0f);
        } else {
            i10 = 0;
        }
        return n02 + i10;
    }

    public final void j1(float f10, int i7) {
        int i10;
        tq0 tq0Var = this.K0;
        if (tq0Var != null) {
            if (I0(i7)) {
                i10 = 8;
            } else {
                i10 = i7;
            }
            tq0Var.i(f10, i10);
        }
        yp0 yp0Var = this.f40374b0;
        if (yp0Var != null) {
            u61 u61Var = yp0Var.f47336b;
            if (I0(i7)) {
                u61Var.f(f10, u1(i7));
            } else if (i7 == 8) {
                u61Var.f(f10, 0);
            }
        }
    }

    public final float k0(float f10) {
        float f11 = 0.0f;
        if (A0()) {
            return 0.0f;
        }
        sr0[] sr0VarArr = this.m0;
        sr0 sr0Var = sr0VarArr[1];
        if (sr0Var != null && v0(sr0Var.E)) {
            f11 = 0.0f + f10;
        }
        sr0 sr0Var2 = sr0VarArr[0];
        if (sr0Var2 != null && v0(sr0Var2.E)) {
            return (1.0f - f10) + f11;
        }
        return f11;
    }

    public final void k1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i7 = 0;
        while (true) {
            sr0[] sr0VarArr = this.m0;
            if (i7 < sr0VarArr.length) {
                sr0 sr0Var = sr0VarArr[i7];
                if (sr0Var.E != 7 || sr0Var.h.getAdapter() == null || sr0VarArr[i7].h.getAdapter().b() == 0 || this.f40440x1.getMessagesController().P1().f9970j.size() <= 0) {
                    i7++;
                } else {
                    return;
                }
            } else {
                if (this.F == 0) {
                    kr0 kr0Var = this.f40378c0;
                    kr0Var.d = chatFull;
                    kr0Var.f35398e = arrayList;
                }
                N1(true);
                for (int i10 = 0; i10 < sr0VarArr.length; i10++) {
                    sr0 sr0Var2 = sr0VarArr[i10];
                    if (sr0Var2.E == 7 && sr0Var2.h.getAdapter() != null) {
                        org.telegram.messenger.g0.r2(sr0VarArr[i10].h);
                    }
                }
                return;
            }
        }
    }

    public final float l0(float f10) {
        float f11 = 0.0f;
        if (A0()) {
            return 0.0f;
        }
        sr0[] sr0VarArr = this.m0;
        sr0 sr0Var = sr0VarArr[1];
        if (sr0Var != null && E0(sr0Var.E) && sr0VarArr[1].E != 11) {
            f11 = 0.0f + f10;
        }
        sr0 sr0Var2 = sr0VarArr[0];
        if (sr0Var2 != null && E0(sr0Var2.E) && sr0VarArr[0].E != 11) {
            return (1.0f - f10) + f11;
        }
        return f11;
    }

    public final void l1(int i7, int i10, int i11, int i12) {
        sr0[] sr0VarArr;
        boolean z9;
        boolean z10 = true;
        this.f40376b2 = true;
        this.f40380c2 = i7;
        this.d2 = i10;
        this.f40386e2 = i11;
        this.f40372a2 = i12;
        G();
        up0 up0Var = this.f40370a0;
        if (up0Var != null) {
            if (up0Var.L != i10 || up0Var.M != i11) {
                up0Var.L = i10;
                up0Var.M = i11;
                if (i10 == 0 && i11 == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                up0Var.setClipChildren(z9);
                up0Var.h.setClipChildren((i10 == 0 && i11 == 0) ? false : false);
                up0Var.n();
            }
            F1();
        }
        for (sr0 sr0Var : this.m0) {
            if (sr0Var != null) {
                sr0Var.setClipChildren(false);
                H1(sr0Var);
                setPageOverscan(sr0Var.h);
                setPageOverscan(sr0Var.f38110n);
                int paddingTop = sr0Var.h.getPaddingTop();
                cq0 cq0Var = sr0Var.h;
                int paddingLeft = cq0Var.getPaddingLeft();
                cq0 cq0Var2 = sr0Var.h;
                int j02 = j0(sr0Var.E);
                cq0Var2.f37728g3 = j02;
                int paddingRight = sr0Var.h.getPaddingRight();
                cq0 cq0Var3 = sr0Var.h;
                int i02 = i0(H0());
                cq0Var3.f37729h3 = i02;
                cq0Var.setPadding(paddingLeft, j02, paddingRight, i02);
                int paddingTop2 = paddingTop - sr0Var.h.getPaddingTop();
                if (paddingTop2 != 0) {
                    org.telegram.messenger.g0.J(sr0Var.h, new bp0(sr0Var, paddingTop2, 1));
                }
                sr0Var.f38113w.setPadding(0, i7, 0, i12);
                er0 er0Var = this.V;
                if (er0Var != null && er0Var.getParent() == sr0Var) {
                    n1(org.telegram.messenger.g0.L(56.0f) + i7, er0Var);
                }
                sp0 sp0Var = this.W;
                if (sp0Var != null && sp0Var.getParent() == sr0Var) {
                    n1(i7, sp0Var);
                }
            }
        }
        setClipChildren(false);
        requestLayout();
        invalidate();
    }

    @Override
    public final boolean m() {
        return false;
    }

    public final int m0(int i7) {
        us0 x12;
        di.q6 q6Var;
        if (z0(i7) && (x12 = x1(i7)) != null && (q6Var = x12.f38717s) != null) {
            return q6Var.g();
        }
        return 0;
    }

    public final void m1(int i7, boolean z9) {
        this.C0.a(i7, z9);
        org.telegram.ui.ActionBar.y4 y4Var = this.H;
        if (y4Var != null) {
            y4Var.x(i7, z9);
        }
    }

    public final int n0(int i7) {
        float f10;
        yp0 yp0Var = this.f40374b0;
        if (yp0Var != null && (I0(i7) || i7 == 8)) {
            f10 = yp0Var.getVisibilityFactor() * org.telegram.messenger.g0.L(40.0f);
        } else {
            f10 = 0.0f;
        }
        return (int) f10;
    }

    public void o1(boolean z9) {
        float f10;
        if (this.E1 != z9) {
            this.E1 = z9;
            org.telegram.ui.ActionBar.y4 y4Var = this.H;
            if (y4Var != null) {
                if (z9) {
                    M1();
                    y4Var.B();
                } else {
                    y4Var.r();
                }
                R(true, true);
                return;
            }
            AnimatorSet animatorSet = this.Q1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            LinearLayout linearLayout = this.D0;
            if (z9) {
                linearLayout.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.Q1 = animatorSet2;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(linearLayout, View.ALPHA, f10));
            this.Q1.setDuration(180L);
            this.Q1.addListener(new t9(19, this, z9));
            this.Q1.start();
            if (z9) {
                M1();
            }
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i7 = 0;
        while (true) {
            sr0[] sr0VarArr = this.m0;
            if (i7 < sr0VarArr.length) {
                cq0 cq0Var = sr0VarArr[i7].h;
                if (cq0Var != null) {
                    cq0Var.getViewTreeObserver().addOnPreDrawListener(new zq0(this, i7, 0));
                }
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!T() && !this.K0.H && !onTouchEvent(motionEvent)) {
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
        mr0 mr0Var = this.F1;
        if (mr0Var.f() != null) {
            i11 = mr0Var.f().getHeight();
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
            } else if (childAt instanceof sr0) {
                i12 = i7;
                measureChildWithMargins(childAt, i12, 0, View.MeasureSpec.makeMeasureSpec(i11, 1073741824), 0);
                cq0 cq0Var = ((sr0) childAt).h;
                cq0Var.setPadding(0, cq0Var.f37726e3, 0, cq0Var.f37727f3);
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
        boolean z9;
        boolean z10;
        int i10;
        boolean z11 = false;
        if (!this.O1) {
            org.telegram.ui.ActionBar.f2 f2Var = this.f40440x1;
            if (f2Var.getParentLayout() != null && !((ActionBarLayout) f2Var.getParentLayout()).i() && !T() && !this.f40369a) {
                if (motionEvent != null) {
                    if (this.D1 == null) {
                        this.D1 = VelocityTracker.obtain();
                    }
                    this.D1.addMovement(motionEvent);
                    fi.m3 m3Var = this.G1;
                    if (m3Var != null) {
                        m3Var.f(true);
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.f40445z1 && !this.A1) {
                    if (motionEvent.getY() >= org.telegram.messenger.g0.L(90.0f) + this.f40380c2) {
                        this.f40443y1 = motionEvent.getPointerId(0);
                        this.A1 = true;
                        this.B1 = (int) motionEvent.getX();
                        this.C1 = (int) motionEvent.getY();
                        this.D1.clear();
                        return this.f40445z1;
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f40443y1) {
                    int x10 = (int) (motionEvent.getX() - this.B1);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.C1);
                    boolean z12 = this.f40445z1;
                    sr0[] sr0VarArr = this.m0;
                    if (z12 && (((z9 = this.f40401j1) && x10 > 0) || (!z9 && x10 < 0))) {
                        if (x10 < 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!e1(motionEvent, z10)) {
                            this.A1 = true;
                            this.f40445z1 = false;
                            sr0VarArr[0].setTranslationX(0.0f);
                            sr0 sr0Var = sr0VarArr[1];
                            if (this.f40401j1) {
                                i10 = sr0VarArr[0].getMeasuredWidth();
                            } else {
                                i10 = -sr0VarArr[0].getMeasuredWidth();
                            }
                            sr0Var.setTranslationX(i10);
                            j1(0.0f, sr0VarArr[1].E);
                            X0(getTabProgress());
                        }
                    }
                    if (this.A1 && !this.f40445z1) {
                        if (Math.abs(x10) >= org.telegram.messenger.g0.a1(true, 0.3f) && Math.abs(x10) > abs) {
                            if (x10 < 0) {
                                z11 = true;
                            }
                            e1(motionEvent, z11);
                        }
                    } else if (this.f40445z1) {
                        sr0VarArr[0].setTranslationX(x10);
                        if (this.f40401j1) {
                            sr0VarArr[1].setTranslationX(sr0VarArr[0].getMeasuredWidth() + x10);
                        } else {
                            sr0VarArr[1].setTranslationX(x10 - sr0VarArr[0].getMeasuredWidth());
                        }
                        float abs2 = Math.abs(x10) / sr0VarArr[0].getMeasuredWidth();
                        if (!I()) {
                            this.f40419q0 = 0.0f;
                        } else {
                            this.f40419q0 = l0(abs2);
                            K1(abs2);
                            float k02 = k0(abs2);
                            this.f40423r0 = k02;
                            if (k02 != 0.0f && I() && !A0()) {
                                i7 = 0;
                            } else {
                                i7 = 4;
                            }
                            this.f40429t0.setVisibility(i7);
                        }
                        G1(false);
                        j1(abs2, sr0VarArr[1].E);
                        X0(getTabProgress());
                        W0();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f40443y1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    t1(motionEvent);
                }
                return this.f40445z1;
            }
        }
        return false;
    }

    public final void p1(int r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xs0.p1(int, boolean):void");
    }

    public final float q0(int i7, boolean z9) {
        float width = getWidth();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            sr0[] sr0VarArr = this.m0;
            if (i10 >= sr0VarArr.length) {
                break;
            }
            sr0 sr0Var = sr0VarArr[i10];
            if (sr0Var != null) {
                int i12 = sr0Var.E;
                if ((z9 && i7 == 8 && I0(i12)) || i12 == i7) {
                    i11++;
                    width = sr0VarArr[i10].getTranslationX();
                }
            }
            i10++;
        }
        if (i11 == 2) {
            return 0.0f;
        }
        return width;
    }

    public final void q1(int i7) {
        int u12 = u1(getClosestTab());
        yp0 yp0Var = this.f40374b0;
        if (u12 != i7) {
            if (yp0Var != null) {
                yp0Var.f47336b.d(i7, yp0Var.d.i(i7));
                return;
            }
            return;
        }
        yp0Var.setReorderingAlbums(true);
        ws0 v12 = v1(i7);
        sr0 g02 = g0(v12.f40085a);
        if (g02 == null) {
            return;
        }
        cq0 cq0Var = g02.h;
        for (int i10 = 0; i10 < cq0Var.getChildCount(); i10++) {
            View childAt = cq0Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.o7) {
                ((org.telegram.ui.Cells.o7) childAt).l(true, true);
            }
        }
        vs0 vs0Var = v12.f40087c;
        if (vs0Var != null && !vs0Var.f38720y) {
            vs0Var.f38720y = true;
        }
        G1(true);
    }

    public final float r0(int i7, boolean z9) {
        float f10 = 0.0f;
        int i10 = 0;
        while (true) {
            sr0[] sr0VarArr = this.m0;
            if (i10 < sr0VarArr.length) {
                sr0 sr0Var = sr0VarArr[i10];
                if (sr0Var != null) {
                    int i11 = sr0Var.E;
                    if ((z9 && i7 == 8 && I0(i11)) || i11 == i7) {
                        f10 = (1.0f - Math.abs(sr0VarArr[i10].getTranslationX() / getWidth())) + f10;
                    }
                }
                i10++;
            } else {
                return f10;
            }
        }
    }

    public final void r1(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xs0.r1(boolean):void");
    }

    public final int s0(int i7) {
        org.telegram.ui.ActionBar.f6 f6Var = this.H1;
        if (f6Var != null) {
            return f6Var.h(i7);
        }
        return org.telegram.ui.ActionBar.k6.x0(null, i7, false);
    }

    public final void s1() {
        int i7 = 0;
        while (true) {
            sr0[] sr0VarArr = this.m0;
            if (i7 < sr0VarArr.length) {
                int childCount = sr0VarArr[i7].h.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = sr0VarArr[i7].h.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.h2) {
                        ImageReceiver photoImage = ((org.telegram.ui.Cells.h2) childAt).getPhotoImage();
                        if (i7 == 0) {
                            photoImage.f21217t0 = true;
                            photoImage.P0(false);
                        } else {
                            photoImage.f21217t0 = false;
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

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        boolean z9;
        int i7;
        TLRPC.ChatFull chatFull2 = this.f40389f1;
        if (chatFull2 != null && chatFull2.stories_pinned_available) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f40389f1 = chatFull;
        if (chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.f40385e1 == 0) {
                this.f40385e1 = -j3;
                int i10 = 0;
                while (true) {
                    ms0[] ms0VarArr = this.f40434v1;
                    if (i10 >= ms0VarArr.length) {
                        break;
                    }
                    if (ms0VarArr[i10].f36064b[1].size() == 0) {
                        ms0 ms0Var = ms0VarArr[i10];
                        ms0Var.f36070j[1] = this.f40389f1.migrated_from_max_id;
                        ms0Var.f36069i[1] = false;
                    }
                    i10++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.f40389f1;
        if (chatFull3 != null && z9 != chatFull3.stories_pinned_available) {
            tq0 tq0Var = this.K0;
            if (tq0Var != null) {
                if (A0()) {
                    i7 = 9;
                } else {
                    i7 = 8;
                }
                tq0Var.setInitialTabId(i7);
            }
            N1(true);
            z1(false);
        }
    }

    public void setCommonGroupsCount(int i7) {
        if (this.F == 0) {
            this.Z0[6] = i7;
        }
        N1(true);
        N();
    }

    public void setForwardRestrictedHint(fi.m3 m3Var) {
        this.G1 = m3Var;
    }

    public void setMergeDialogId(long j3) {
        this.f40385e1 = j3;
    }

    public void setNewMediaCounts(int[] iArr) {
        int[] iArr2;
        int i7 = 0;
        while (true) {
            iArr2 = this.Z0;
            if (i7 > 6 || iArr2[i7] >= 0) {
                break;
            }
            i7++;
        }
        System.arraycopy(iArr, 0, iArr2, 0, 6);
        N1(true);
        N();
        if (iArr2[0] >= 0) {
            L0(false);
        }
    }

    public void setOnTopPanelShiftChanged(Runnable runnable) {
        this.f40402j2 = runnable;
    }

    @Override
    public final void setPadding(int i7, int i10, int i11, int i12) {
        this.N1 = i10;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            sr0[] sr0VarArr = this.m0;
            if (i14 >= sr0VarArr.length) {
                break;
            }
            sr0VarArr[i14].setTranslationY(this.N1);
            i14++;
        }
        if (this.R0 != null) {
            U();
        } else {
            oq0 oq0Var = this.T0;
            if (oq0Var != null) {
                oq0Var.setTranslationY(org.telegram.messenger.g0.L(48.0f) + i10);
            }
        }
        this.Q0 = i10;
        org.telegram.ui.Cells.t0 t0Var = this.M0;
        if (t0Var.getTag() == null) {
            i13 = -org.telegram.messenger.g0.L(48.0f);
        }
        t0Var.setTranslationY(i13 + this.Q0);
    }

    public void setPagesGlassEngine(oi.q qVar) {
        sr0[] sr0VarArr;
        this.f40393g2 = qVar;
        up0 up0Var = this.f40370a0;
        if (up0Var != null) {
            up0Var.setGlassEngine(qVar);
        }
        for (sr0 sr0Var : this.m0) {
            if (sr0Var != null) {
                sr0Var.h.setCaptureSectionsDecoratorAllowed(true);
                qVar.b(sr0Var.h);
            }
        }
    }

    public void setPagesPaddingBottom(int i7) {
        if (this.f40372a2 != i7) {
            this.f40372a2 = i7;
            sr0[] sr0VarArr = this.m0;
            if (sr0VarArr != null) {
                for (sr0 sr0Var : sr0VarArr) {
                    if (sr0Var != null) {
                        cq0 cq0Var = sr0Var.h;
                        int paddingLeft = cq0Var.getPaddingLeft();
                        cq0 cq0Var2 = sr0Var.h;
                        int i10 = cq0Var2.f37726e3;
                        int paddingRight = cq0Var2.getPaddingRight();
                        cq0 cq0Var3 = sr0Var.h;
                        int i02 = i0(H0());
                        cq0Var3.f37729h3 = i02;
                        cq0Var.setPadding(paddingLeft, i10, paddingRight, i02);
                    }
                }
            }
        }
    }

    public void setPagesVisibleOverscanTop(int i7) {
        if (this.f40390f2 != i7) {
            this.f40390f2 = i7;
            invalidate();
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
        }
    }

    public void setPinnedToTop(boolean z9) {
        if (this.d != z9) {
            this.d = z9;
            int i7 = 0;
            while (true) {
                sr0[] sr0VarArr = this.m0;
                if (i7 < sr0VarArr.length) {
                    D1(sr0VarArr[i7], true);
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        boolean z9;
        TLRPC.UserFull userFull2 = this.f40392g1;
        if (userFull2 != null && userFull2.stories_pinned_available) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f40392g1 = userFull;
        N1(true);
        if (userFull != null && z9 != userFull.stories_pinned_available) {
            i1(8);
        }
    }

    public void setVisibleHeight(int i7) {
        float f10;
        this.P1 = i7;
        int i10 = 0;
        while (true) {
            sr0[] sr0VarArr = this.m0;
            if (i10 >= sr0VarArr.length) {
                break;
            }
            int measuredHeight = getMeasuredHeight();
            if (sr0VarArr[i10].E == 8) {
                f10 = 280.0f;
            } else {
                f10 = 120.0f;
            }
            float f11 = (-(measuredHeight - Math.max(i7, org.telegram.messenger.g0.L(f10)))) / 2.0f;
            sr0VarArr[i10].f38113w.setTranslationY(f11);
            sr0VarArr[i10].f38112s.setTranslationY(-f11);
            i10++;
        }
        sp0 sp0Var = this.W;
        if (sp0Var != null) {
            sp0Var.setVisibleHeight(i7);
        }
        up0 up0Var = this.f40370a0;
        if (up0Var != null) {
            up0Var.setVisibleHeight(i7);
        }
    }

    public final boolean t0() {
        if (this.f40440x1.getConnectionsManager().getConnectionState() == 3) {
            return true;
        }
        return false;
    }

    public final void t1(MotionEvent motionEvent) {
        float f10;
        float f11;
        boolean z9;
        float measuredWidth;
        sr0 sr0Var;
        sr0 sr0Var2;
        int measuredWidth2;
        sr0 sr0Var3;
        sr0 sr0Var4;
        boolean z10;
        VelocityTracker velocityTracker = this.D1;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.U0);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f10 = this.D1.getXVelocity();
                f11 = this.D1.getYVelocity();
                if (!this.f40445z1 && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                    if (f10 < 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e1(motionEvent, z10);
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
            }
            if (this.f40445z1) {
                sr0[] sr0VarArr = this.m0;
                float x10 = sr0VarArr[0].getX();
                this.f40395h1 = new AnimatorSet();
                if (Math.abs(x10) < sr0VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11))) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.f40404k1 = z9;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new c60(this, 18));
                boolean z11 = this.f40404k1;
                Property property = View.TRANSLATION_X;
                if (z11) {
                    measuredWidth = Math.abs(x10);
                    if (this.f40401j1) {
                        this.f40395h1.playTogether(ObjectAnimator.ofFloat(sr0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(sr0VarArr[1], property, sr0Var4.getMeasuredWidth()), ofFloat);
                    } else {
                        this.f40395h1.playTogether(ObjectAnimator.ofFloat(sr0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(sr0VarArr[1], property, -sr0Var3.getMeasuredWidth()), ofFloat);
                    }
                } else {
                    measuredWidth = sr0VarArr[0].getMeasuredWidth() - Math.abs(x10);
                    if (this.f40401j1) {
                        this.f40395h1.playTogether(ObjectAnimator.ofFloat(sr0VarArr[0], property, -sr0Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(sr0VarArr[1], property, 0.0f), ofFloat);
                    } else {
                        this.f40395h1.playTogether(ObjectAnimator.ofFloat(sr0VarArr[0], property, sr0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(sr0VarArr[1], property, 0.0f), ofFloat);
                    }
                }
                this.f40395h1.setInterpolator(f40366t2);
                int measuredWidth3 = getMeasuredWidth();
                float f12 = measuredWidth3 / 2;
                float I = (org.telegram.messenger.g0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f12) + f12;
                float abs = Math.abs(f10);
                if (abs > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(I / abs) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                this.f40395h1.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                this.f40395h1.addListener(new wq0(this, 1));
                this.f40395h1.start();
                this.f40398i1 = true;
                this.f40445z1 = false;
                W0();
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

    @Override
    public final void u(org.telegram.ui.Cells.t2 t2Var) {
        int i7;
        org.telegram.ui.ActionBar.f2 f2Var = this.f40440x1;
        if (f2Var != null && f2Var.getMessagesController().P1().K(t2Var.getDialogId())) {
            f2Var.getOrCreateStoryViewer().getClass();
            di.p9 orCreateStoryViewer = f2Var.getOrCreateStoryViewer();
            Context context = f2Var.getContext();
            long dialogId = t2Var.getDialogId();
            di.h7 a10 = di.h7.a((pj0) t2Var.getParent());
            if ((f2Var instanceof ProfileActivity) && ((ProfileActivity) f2Var).f41808r1) {
                i7 = org.telegram.messenger.g0.L(68.0f);
            } else {
                i7 = 0;
            }
            a10.f9093s += i7;
            orCreateStoryViewer.J(context, dialogId, a10);
        }
    }

    public final boolean u0() {
        SparseArray[] sparseArrayArr;
        org.telegram.messenger.ij ijVar;
        TLRPC.Message message;
        boolean z9 = false;
        for (int i7 = 1; i7 >= 0; i7--) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (true) {
                sparseArrayArr = this.f40375b1;
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
                if (num.intValue() > 0 && (ijVar = (org.telegram.messenger.ij) sparseArrayArr[i7].get(num.intValue())) != null && (message = ijVar.f23244k) != null && message.noforwards) {
                    z9 = true;
                    break;
                }
            }
            if (z9) {
                return z9;
            }
        }
        return z9;
    }

    public final int u1(int i7) {
        ws0 w12 = w1(i7);
        if (w12 == null) {
            return -1;
        }
        return w12.f40086b;
    }

    @Override
    public final void updateColors() {
        sr0[] sr0VarArr;
        try {
            this.I1.a(s0(org.telegram.ui.ActionBar.k6.f27849d6));
            org.telegram.ui.ActionBar.y1 y1Var = this.F0;
            if (y1Var != null) {
                y1Var.a(s0(org.telegram.ui.ActionBar.k6.f28243y8));
            }
            NumberTextView numberTextView = this.C0;
            if (numberTextView != null) {
                numberTextView.setTextColor(s0(org.telegram.ui.ActionBar.k6.f28243y8));
            }
            B1();
            invalidate();
            for (sr0 sr0Var : this.m0) {
                if (sr0Var != null && sr0Var.L) {
                    sr0Var.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final boolean v0(int i7) {
        if (i7 != 0) {
            if (((i7 != 8 && !I0(i7)) || !TextUtils.isEmpty(getStoriesHashtag())) && i7 != 9 && i7 != 11 && i7 != 13) {
                if (i7 != 14 || this.f40370a0 == null) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final ws0 v1(int i7) {
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = this.f40407l2;
        ws0 ws0Var = (ws0) hashMap.get(valueOf);
        if (ws0Var == null) {
            ws0 ws0Var2 = new ws0(this, getContext(), i7);
            hashMap.put(Integer.valueOf(i7), ws0Var2);
            this.f40409m2.put(Integer.valueOf(ws0Var2.f40085a), Integer.valueOf(i7));
            return ws0Var2;
        }
        return ws0Var;
    }

    public final void w0() {
        org.telegram.messenger.g0.r(this.O0);
        org.telegram.ui.Cells.t0 t0Var = this.M0;
        if (t0Var.getTag() == null) {
            return;
        }
        t0Var.setTag(null);
        AnimatorSet animatorSet = this.N0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.N0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.N0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.N0.playTogether(ObjectAnimator.ofFloat(t0Var, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(t0Var, View.TRANSLATION_Y, (-org.telegram.messenger.g0.L(48.0f)) + this.Q0));
        this.N0.setInterpolator(xq.f40346g);
        this.N0.addListener(new wq0(this, 0));
        this.N0.start();
    }

    public final ws0 w1(int i7) {
        Integer num = (Integer) this.f40409m2.get(Integer.valueOf(i7));
        if (num == null) {
            return null;
        }
        return (ws0) this.f40407l2.get(num);
    }

    public boolean x0() {
        return false;
    }

    public final us0 x1(int i7) {
        ws0 w12;
        if (i7 == 8) {
            return this.f40384e0;
        }
        if (i7 == 9) {
            return this.f40391g0;
        }
        if (I0(i7) && (w12 = w1(i7)) != null) {
            return w12.f40087c;
        }
        return null;
    }

    public boolean y0() {
        return !(this instanceof o20);
    }

    public final us0 y1(int i7) {
        ws0 w12;
        if (i7 == 8) {
            return this.f40388f0;
        }
        if (i7 == 9) {
            return this.f40394h0;
        }
        if (!I0(i7) || (w12 = w1(i7)) == null) {
            return null;
        }
        return w12.d;
    }

    public final void z(View view) {
        sr0[] sr0VarArr = this.m0;
        addView(view, Math.max(indexOfChild(sr0VarArr[0]), indexOfChild(sr0VarArr[1])) + 1, c8.ha.e(-1, 0, 48));
        view.getLayoutParams().height = 0;
    }

    public final void z1(boolean z9) {
        sr0[] sr0VarArr;
        sr0[] sr0VarArr2;
        org.telegram.ui.ActionBar.r0 r0Var;
        v4.u0 u0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        v4.u0 u0Var2;
        int i7;
        int i10;
        boolean z13;
        boolean z14;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z15;
        v4.u0 u0Var3;
        int i16;
        int i17;
        boolean z16;
        int i18;
        boolean z17;
        int i19;
        boolean z18;
        boolean z19;
        int i20;
        v4.u0 u0Var4;
        up0 up0Var = this.f40370a0;
        if (up0Var != null) {
            up0Var.i();
        }
        int i21 = 0;
        while (true) {
            sr0VarArr = this.m0;
            if (i21 >= sr0VarArr.length) {
                break;
            }
            sr0VarArr[i21].h.C0();
            i21++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) sr0VarArr[z9 ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = org.telegram.messenger.g0.L(N0());
        layoutParams.rightMargin = 0;
        layoutParams.leftMargin = 0;
        v4.g0 adapter = sr0VarArr[z9 ? 1 : 0].h.getAdapter();
        v4.g0 g0Var = this.f40384e0;
        v4.y yVar = this.f40381d0;
        if (adapter == g0Var) {
            yVar.h(null);
        }
        boolean z20 = this.X0;
        org.telegram.ui.ActionBar.y4 y4Var = this.H;
        mr0 mr0Var = this.F1;
        org.telegram.ui.ActionBar.k kVar = this.G;
        String str = "";
        org.telegram.ui.ActionBar.r0 r0Var2 = this.f40416p0;
        gs0 gs0Var = this.P;
        int i22 = 100;
        if (z20 && this.W0) {
            sr0 sr0Var = sr0VarArr[z9 ? 1 : 0];
            if (sr0Var.f38109f == null) {
                sr0Var.f38109f = new v4.u0();
            }
            sr0 sr0Var2 = sr0VarArr[z9 ? 1 : 0];
            v4.u0 u0Var5 = sr0Var2.f38109f;
            js0 js0Var = this.U;
            qr0 qr0Var = this.f40406l0;
            ur0 ur0Var = this.f40400j0;
            ur0 ur0Var2 = this.f40403k0;
            ur0 ur0Var3 = this.f40397i0;
            if (z9) {
                int i23 = sr0Var2.E;
                if (i23 != 0) {
                    u0Var4 = u0Var5;
                    if (i23 != 2 && i23 != 5 && i23 != 6 && (i23 != 7 || mr0Var.X())) {
                        if (r0Var2 != null) {
                            str = r0Var2.getSearchField().getText().toString();
                        }
                        String str2 = str;
                        int i24 = sr0VarArr[z9 ? 1 : 0].E;
                        if (i24 == 1) {
                            if (ur0Var3 != null) {
                                ur0Var3.G(str2, false);
                                if (adapter != ur0Var3) {
                                    g1(adapter);
                                    sr0VarArr[z9 ? 1 : 0].h.setAdapter(ur0Var3);
                                }
                            }
                        } else if (i24 == 3) {
                            if (ur0Var2 != null) {
                                ur0Var2.G(str2, false);
                                if (adapter != ur0Var2) {
                                    g1(adapter);
                                    sr0VarArr[z9 ? 1 : 0].h.setAdapter(ur0Var2);
                                }
                            }
                        } else if (i24 == 4) {
                            if (ur0Var != null) {
                                ur0Var.G(str2, false);
                                if (adapter != ur0Var) {
                                    g1(adapter);
                                    sr0VarArr[z9 ? 1 : 0].h.setAdapter(ur0Var);
                                }
                            }
                        } else if (i24 == 7) {
                            if (qr0Var != null) {
                                qr0Var.F(str2, false);
                                if (adapter != qr0Var) {
                                    g1(adapter);
                                    sr0VarArr[z9 ? 1 : 0].h.setAdapter(qr0Var);
                                }
                            }
                        } else if (i24 == 11) {
                            if (js0Var != null) {
                                js0Var.E(this.Y0, str2);
                                if (adapter != js0Var) {
                                    g1(adapter);
                                    sr0VarArr[z9 ? 1 : 0].h.setAdapter(js0Var);
                                }
                            }
                        } else if (i24 == 15 && gs0Var != null && adapter != gs0Var) {
                            g1(adapter);
                            cq0 cq0Var = sr0VarArr[z9 ? 1 : 0].h;
                            gs0Var.f33994r = cq0Var;
                            cq0Var.setAdapter(gs0Var);
                        }
                    }
                }
                this.X0 = false;
                qq0 qq0Var = this.L0;
                if (qq0Var != null) {
                    qq0Var.g(false);
                }
                this.W0 = false;
                z1(true);
                return;
            }
            u0Var4 = u0Var5;
            if (sr0Var2.h != null) {
                int i25 = sr0Var2.E;
                if (i25 == 1) {
                    if (adapter != ur0Var3) {
                        g1(adapter);
                        sr0VarArr[z9 ? 1 : 0].h.setAdapter(ur0Var3);
                    }
                    ur0Var3.f();
                } else if (i25 == 3) {
                    if (adapter != ur0Var2) {
                        g1(adapter);
                        sr0VarArr[z9 ? 1 : 0].h.setAdapter(ur0Var2);
                    }
                    ur0Var2.f();
                } else if (i25 == 4) {
                    if (adapter != ur0Var) {
                        g1(adapter);
                        sr0VarArr[z9 ? 1 : 0].h.setAdapter(ur0Var);
                    }
                    ur0Var.f();
                } else if (i25 == 7) {
                    if (adapter != qr0Var) {
                        g1(adapter);
                        sr0VarArr[z9 ? 1 : 0].h.setAdapter(qr0Var);
                    }
                    qr0Var.f();
                } else if (i25 == 11) {
                    if (adapter != js0Var) {
                        g1(adapter);
                        sr0VarArr[z9 ? 1 : 0].h.setAdapter(js0Var);
                    }
                    js0Var.f();
                }
            }
            sr0VarArr2 = sr0VarArr;
            r0Var = r0Var2;
            u0Var3 = u0Var4;
            i11 = 4;
            z12 = false;
            z15 = false;
            i13 = 8;
        } else {
            sr0 sr0Var3 = sr0VarArr[z9 ? 1 : 0];
            if (sr0Var3.f38108e == null) {
                sr0Var3.f38108e = new v4.u0();
            }
            sr0 sr0Var4 = sr0VarArr[z9 ? 1 : 0];
            v4.u0 u0Var6 = sr0Var4.f38108e;
            sr0Var4.h.setPinnedHeaderShadowDrawable(null);
            int i26 = sr0VarArr[z9 ? 1 : 0].E;
            if (i26 == 8 || I0(i26)) {
                layoutParams.topMargin = org.telegram.messenger.g0.L(N0());
            }
            cq0 cq0Var2 = sr0VarArr[z9 ? 1 : 0].h;
            int paddingLeft = cq0Var2.getPaddingLeft();
            sr0 sr0Var5 = sr0VarArr[z9 ? 1 : 0];
            sr0VarArr2 = sr0VarArr;
            cq0 cq0Var3 = sr0Var5.h;
            int j02 = j0(sr0Var5.E);
            cq0Var3.f37728g3 = j02;
            int paddingRight = sr0VarArr2[z9 ? 1 : 0].h.getPaddingRight();
            cq0 cq0Var4 = sr0VarArr2[z9 ? 1 : 0].h;
            r0Var = r0Var2;
            int i02 = i0(H0());
            cq0Var4.f37729h3 = i02;
            cq0Var2.setPadding(paddingLeft, j02, paddingRight, i02);
            int i27 = sr0VarArr2[z9 ? 1 : 0].E;
            int[] iArr = this.f40414o1;
            v4.g0 g0Var2 = this.M;
            View view = this.W;
            is0 is0Var = this.T;
            lr0 lr0Var = this.R;
            er0 er0Var = this.V;
            ms0[] ms0VarArr = this.f40434v1;
            if (i27 == 0) {
                v4.g0 g0Var3 = this.J;
                if (adapter != g0Var3) {
                    g1(adapter);
                    sr0VarArr2[z9 ? 1 : 0].h.setAdapter(g0Var3);
                }
                int i28 = -org.telegram.messenger.g0.L(1.0f);
                layoutParams.rightMargin = i28;
                layoutParams.leftMargin = i28;
                ms0 ms0Var = ms0VarArr[0];
                if (ms0Var.h && !ms0Var.f36066e.isEmpty()) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                i22 = iArr[0];
                sr0VarArr2[z9 ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.A0);
                ms0 ms0Var2 = ms0VarArr[0];
                if (ms0Var2.f36083x == null) {
                    ms0Var2.f36083x = new v4.u0();
                }
                u0Var = ms0VarArr[0].f36083x;
                z12 = z18;
                z10 = false;
            } else {
                if (i27 == 1) {
                    ms0 ms0Var3 = ms0VarArr[1];
                    if (ms0Var3.h && !ms0Var3.f36066e.isEmpty()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (adapter != g0Var2) {
                        g1(adapter);
                        sr0VarArr2[z9 ? 1 : 0].h.setAdapter(g0Var2);
                    }
                } else if (i27 == 2) {
                    ms0 ms0Var4 = ms0VarArr[2];
                    if (ms0Var4.h && !ms0Var4.f36066e.isEmpty()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    v4.g0 g0Var4 = this.N;
                    if (adapter != g0Var4) {
                        g1(adapter);
                        sr0VarArr2[z9 ? 1 : 0].h.setAdapter(g0Var4);
                    }
                } else {
                    if (i27 == 3) {
                        v4.g0 g0Var5 = this.L;
                        if (adapter != g0Var5) {
                            g1(adapter);
                            sr0VarArr2[z9 ? 1 : 0].h.setAdapter(g0Var5);
                        }
                    } else if (i27 == 4) {
                        ms0 ms0Var5 = ms0VarArr[4];
                        if (ms0Var5.h && !ms0Var5.f36066e.isEmpty()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        v4.g0 g0Var6 = this.O;
                        if (adapter != g0Var6) {
                            g1(adapter);
                            sr0VarArr2[z9 ? 1 : 0].h.setAdapter(g0Var6);
                        }
                    } else {
                        if (i27 == 5) {
                            v4.g0 g0Var7 = this.Q;
                            if (adapter != g0Var7) {
                                g1(adapter);
                                sr0VarArr2[z9 ? 1 : 0].h.setAdapter(g0Var7);
                            }
                        } else if (i27 == 15) {
                            if (adapter != gs0Var) {
                                g1(adapter);
                                cq0 cq0Var5 = sr0VarArr2[z9 ? 1 : 0].h;
                                gs0Var.f33994r = cq0Var5;
                                cq0Var5.setAdapter(gs0Var);
                            }
                        } else if (i27 == 6) {
                            if (adapter != lr0Var) {
                                g1(adapter);
                                sr0VarArr2[z9 ? 1 : 0].h.setAdapter(lr0Var);
                            }
                        } else if (i27 == 7) {
                            v4.g0 g0Var8 = this.f40378c0;
                            if (adapter != g0Var8) {
                                g1(adapter);
                                sr0VarArr2[z9 ? 1 : 0].h.setAdapter(g0Var8);
                            }
                        } else if (z0(i27)) {
                            v4.g0 x12 = x1(sr0VarArr2[z9 ? 1 : 0].E);
                            if (adapter != x12) {
                                g1(adapter);
                                sr0VarArr2[z9 ? 1 : 0].h.setAdapter(x12);
                                sr0VarArr2[z9 ? 1 : 0].h.getClass();
                            }
                            sr0 sr0Var6 = sr0VarArr2[z9 ? 1 : 0];
                            if (sr0Var6.E != 9) {
                                yVar.h(sr0Var6.h);
                            }
                            i22 = iArr[1];
                        } else {
                            int i29 = sr0VarArr2[z9 ? 1 : 0].E;
                            if (i29 == 10) {
                                v4.g0 g0Var9 = this.S;
                                if (adapter != g0Var9) {
                                    g1(adapter);
                                    sr0VarArr2[z9 ? 1 : 0].h.setAdapter(g0Var9);
                                }
                            } else if (i29 == 11) {
                                if (adapter != is0Var) {
                                    g1(adapter);
                                    sr0VarArr2[z9 ? 1 : 0].h.setAdapter(is0Var);
                                    v4.y yVar2 = is0Var.f34775w;
                                    cq0 cq0Var6 = sr0VarArr2[z9 ? 1 : 0].h;
                                    is0Var.f34774s = cq0Var6;
                                    yVar2.h(cq0Var6);
                                }
                                u0Var = is0Var.f34773r;
                                z10 = true;
                                z12 = false;
                            } else if (i29 == 12) {
                                if (adapter != null) {
                                    g1(adapter);
                                    sr0VarArr2[z9 ? 1 : 0].h.setAdapter(null);
                                }
                                if (er0Var.getParent() != sr0VarArr2[z9 ? 1 : 0]) {
                                    org.telegram.messenger.g0.E2(er0Var);
                                    sr0VarArr2[z9 ? 1 : 0].addView(er0Var, c8.ha.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
                                    n1(org.telegram.messenger.g0.L(56.0f) + this.f40380c2, er0Var);
                                }
                            } else if (i29 == 13) {
                                if (adapter != null) {
                                    g1(adapter);
                                    sr0VarArr2[z9 ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != sr0VarArr2[z9 ? 1 : 0]) {
                                    org.telegram.messenger.g0.E2(view);
                                    sr0VarArr2[z9 ? 1 : 0].addView(view);
                                    n1(this.f40380c2, view);
                                }
                            } else if (i29 == 14) {
                                if (adapter != null) {
                                    g1(adapter);
                                    sr0VarArr2[z9 ? 1 : 0].h.setAdapter(null);
                                }
                                if (up0Var != null && up0Var.getParent() != sr0VarArr2[z9 ? 1 : 0]) {
                                    org.telegram.messenger.g0.E2(up0Var);
                                    sr0VarArr2[z9 ? 1 : 0].addView(up0Var);
                                    sr0VarArr2[z9 ? 1 : 0].f38113w.setVisibility(4);
                                }
                            }
                        }
                        u0Var = u0Var6;
                        z10 = false;
                        z12 = false;
                    }
                    u0Var = u0Var6;
                    z10 = true;
                    z12 = false;
                }
                z12 = z11;
                u0Var = u0Var6;
                z10 = true;
            }
            I1(sr0VarArr2[z9 ? 1 : 0]);
            if (z10) {
                sr0VarArr2[z9 ? 1 : 0].h.setSections(false);
                u0Var2 = u0Var;
            } else {
                cq0 cq0Var7 = sr0VarArr2[z9 ? 1 : 0].h;
                cq0Var7.getClass();
                u0Var2 = u0Var;
                org.telegram.ui.ActionBar.r6.m(cq0Var7, 20, org.telegram.ui.ActionBar.k6.f27941i6, cq0Var7.f36955n2);
                cq0Var7.T2 = false;
                cq0Var7.H2 = null;
                cq0Var7.I2 = null;
                cq0Var7.L2 = 0.0f;
                cq0Var7.M2 = null;
                cq0Var7.N2 = null;
                cq0Var7.J2 = null;
                zi0 zi0Var = cq0Var7.G2;
                if (zi0Var != null) {
                    cq0Var7.q0(zi0Var);
                    cq0Var7.G2 = null;
                }
                q9 q9Var = cq0Var7.R2;
                if (q9Var != null) {
                    cq0Var7.q0(q9Var);
                    cq0Var7.R2 = null;
                }
            }
            H1(sr0VarArr2[z9 ? 1 : 0]);
            sr0 sr0Var7 = sr0VarArr2[z9 ? 1 : 0];
            if (sr0Var7.E == 11) {
                sr0Var7.h.setItemAnimator(sr0Var7.d);
            } else {
                sr0Var7.h.setItemAnimator(null);
                if (is0Var != null && sr0VarArr2[z9 ? 1 : 0].h == is0Var.f34774s) {
                    v4.y yVar3 = is0Var.f34775w;
                    is0Var.f34774s = null;
                    yVar3.h(null);
                }
            }
            if (er0Var != null && sr0VarArr2[z9 ? 1 : 0].E != 12 && er0Var.getParent() == sr0VarArr2[z9 ? 1 : 0]) {
                er0Var.f44857a.onRemoveFromParent();
                sr0VarArr2[z9 ? 1 : 0].removeView(er0Var);
            }
            if (view != null && sr0VarArr2[z9 ? 1 : 0].E != 13) {
                ViewParent parent = view.getParent();
                sr0 sr0Var8 = sr0VarArr2[z9 ? 1 : 0];
                if (parent == sr0Var8) {
                    sr0Var8.removeView(view);
                }
            }
            if (up0Var != null && sr0VarArr2[z9 ? 1 : 0].E != 14) {
                ViewParent parent2 = up0Var.getParent();
                sr0 sr0Var9 = sr0VarArr2[z9 ? 1 : 0];
                if (parent2 == sr0Var9) {
                    sr0Var9.removeView(up0Var);
                }
            }
            int i30 = sr0VarArr2[z9 ? 1 : 0].E;
            if (i30 != 0 && i30 != 11 && !z0(i30) && (i16 = sr0VarArr2[z9 ? 1 : 0].E) != 2 && i16 != 5 && i16 != 6 && ((i16 != 7 || mr0Var.X()) && (i17 = sr0VarArr2[z9 ? 1 : 0].E) != 10 && i17 != 13 && i17 != 14)) {
                if (z9) {
                    if (r0Var != null && r0Var.getVisibility() == 4) {
                        if (y4Var != null) {
                            z17 = y4Var.F;
                        } else {
                            z17 = kVar.f27677n0;
                        }
                        if (!z17) {
                            if (I()) {
                                this.f40444z0 = 1;
                                setSearchItemVisibility(0);
                            } else {
                                if (H0()) {
                                    i19 = 8;
                                } else {
                                    i19 = 4;
                                }
                                setSearchItemVisibility(i19);
                            }
                            float f10 = z9 ? 1.0f : 0.0f;
                            this.f40419q0 = l0(f10);
                            K1(1.0f - f10);
                            z16 = false;
                        }
                    }
                    z16 = false;
                    this.f40444z0 = 0;
                    this.f40419q0 = 1.0f;
                } else {
                    z16 = false;
                    if (r0Var != null && r0Var.getVisibility() == 4) {
                        if (I()) {
                            this.f40444z0 = 0;
                            this.f40419q0 = 1.0f;
                            setSearchItemVisibility(0);
                        } else {
                            if (H0()) {
                                i18 = 8;
                            } else {
                                i18 = 4;
                            }
                            setSearchItemVisibility(i18);
                            this.f40419q0 = 0.0f;
                        }
                    }
                }
                G1(z16);
            } else if (z9) {
                this.f40444z0 = 2;
            } else {
                this.f40444z0 = 0;
                if (r0Var != null) {
                    if (!H0() && !this.X0) {
                        i7 = 4;
                    } else {
                        i7 = 8;
                    }
                    setSearchItemVisibility(i7);
                }
            }
            int i31 = sr0VarArr2[z9 ? 1 : 0].E;
            if (i31 == 6) {
                if (!lr0Var.f35752e && !lr0Var.h && lr0Var.d.isEmpty()) {
                    lr0.E(lr0Var, 0L);
                }
            } else if (i31 != 7) {
                if (z0(i31)) {
                    us0 x13 = x1(sr0VarArr2[z9 ? 1 : 0].E);
                    if (x13 != null) {
                        di.q6 q6Var = x13.f38717s;
                        x13.P();
                        nq0 nq0Var = sr0VarArr2[z9 ? 1 : 0].f38113w;
                        if (q6Var != null && (q6Var.k() || (t0() && q6Var.g() > 0))) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        nq0Var.e(z13, z9);
                        if (q6Var != null && q6Var.g() > 0 && !F0()) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z12 = z14;
                    }
                } else {
                    int i32 = sr0VarArr2[z9 ? 1 : 0].E;
                    if (i32 != 10 && i32 != 11 && i32 != 12 && i32 != 13 && i32 != 14) {
                        if (i32 == 15) {
                            i32 = 8;
                        }
                        ms0 ms0Var6 = ms0VarArr[i32];
                        if (!ms0Var6.f36068g && !ms0Var6.f36069i[0] && ms0Var6.f36063a.isEmpty()) {
                            ms0VarArr[i32].f36068g = true;
                            g0Var2.f();
                            if (i32 == 0) {
                                int i33 = ms0VarArr[0].f36077q;
                                if (i33 == 1) {
                                    i10 = 6;
                                } else if (i33 == 2) {
                                    i10 = 7;
                                }
                                org.telegram.ui.ActionBar.f2 f2Var = this.f40440x1;
                                f2Var.getMediaDataController().N0(this.l1, 50, 0, 0, i10, this.F, 1, f2Var.getClassGuid(), ms0VarArr[i10].f36076p, null, null);
                            }
                            i10 = i32;
                            org.telegram.ui.ActionBar.f2 f2Var2 = this.f40440x1;
                            f2Var2.getMediaDataController().N0(this.l1, 50, 0, 0, i10, this.F, 1, f2Var2.getClassGuid(), ms0VarArr[i10].f36076p, null, null);
                        }
                    }
                }
            }
            int i34 = sr0VarArr2[z9 ? 1 : 0].E;
            if (i34 == 8 || I0(i34)) {
                i11 = 4;
                sr0 sr0Var10 = sr0VarArr2[z9 ? 1 : 0];
                nq0 nq0Var2 = sr0Var10.f38113w;
                boolean I0 = I0(sr0Var10.E);
                int u12 = u1(sr0VarArr2[z9 ? 1 : 0].E);
                l9 l9Var = nq0Var2.f31923b;
                fi.d dVar = nq0Var2.f31926f;
                if (!I0 && !G0() && !B0()) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                l9Var.setVisibility(i12);
                if (I0) {
                    dVar.setVisibility(0);
                    dVar.h(org.telegram.messenger.hd.M0(2131744806, null), false);
                    i13 = 8;
                } else if (G0()) {
                    i13 = 8;
                    dVar.setVisibility(8);
                } else {
                    i13 = 8;
                    nq0Var2.setStickerType(11);
                    if (!F0()) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                    dVar.setVisibility(i14);
                    dVar.h(A(), false);
                }
                if (I0) {
                    nq0Var2.d.setText(org.telegram.messenger.hd.M0(2131744784, null));
                    nq0Var2.f31925e.setText(org.telegram.messenger.hd.M0(2131744785, null));
                } else {
                    xh.l lVar = nq0Var2.d;
                    if (!F0()) {
                        if (H0()) {
                            i15 = 2131748175;
                        } else {
                            i15 = 2131748146;
                        }
                    } else {
                        i15 = 2131748203;
                    }
                    lVar.setText(org.telegram.messenger.hd.M0(i15, null));
                    w70 w70Var = nq0Var2.f31925e;
                    if (H0()) {
                        str = org.telegram.messenger.hd.M0(2131748147, null);
                    }
                    w70Var.setText(str);
                }
                z15 = false;
                dVar.setOnClickListener(new yo0(this, I0, u12, 0));
            } else {
                sr0 sr0Var11 = sr0VarArr2[z9 ? 1 : 0];
                if (sr0Var11.E == 9) {
                    if (G0()) {
                        sr0VarArr2[z9 ? 1 : 0].f38113w.f31923b.setVisibility(8);
                        sr0VarArr2[z9 ? 1 : 0].f38113w.f31926f.setVisibility(8);
                    } else {
                        sr0VarArr2[z9 ? 1 : 0].f38113w.f31923b.setVisibility(0);
                        sr0VarArr2[z9 ? 1 : 0].f38113w.setStickerType(11);
                        sr0VarArr2[z9 ? 1 : 0].f38113w.f31926f.setVisibility(0);
                        sr0VarArr2[z9 ? 1 : 0].f38113w.f31926f.h(A(), false);
                    }
                    sr0VarArr2[z9 ? 1 : 0].f38113w.d.setText(org.telegram.messenger.hd.M0(2131748245, null));
                    w70 w70Var2 = sr0VarArr2[z9 ? 1 : 0].f38113w.f31925e;
                    if (H0()) {
                        str = org.telegram.messenger.hd.M0(2131748246, null);
                    }
                    w70Var2.setText(str);
                    i11 = 4;
                    sr0VarArr2[z9 ? 1 : 0].f38113w.f31926f.setOnClickListener(new to0(this, 4));
                    z15 = false;
                    i13 = 8;
                } else {
                    i11 = 4;
                    sr0Var11.f38113w.f31923b.setVisibility(0);
                    sr0VarArr2[z9 ? 1 : 0].f38113w.setStickerType(1);
                    sr0VarArr2[z9 ? 1 : 0].f38113w.d.setText(org.telegram.messenger.hd.M0(2131748166, null));
                    sr0VarArr2[z9 ? 1 : 0].f38113w.f31925e.setText(org.telegram.messenger.hd.M0(2131745808, null));
                    i13 = 8;
                    sr0VarArr2[z9 ? 1 : 0].f38113w.f31926f.setVisibility(8);
                    z15 = false;
                }
            }
            sr0VarArr2[z9 ? 1 : 0].h.setVisibility(z15 ? 1 : 0);
            u0Var3 = u0Var2;
        }
        int i35 = i22;
        sr0 sr0Var12 = sr0VarArr2[z9 ? 1 : 0];
        sr0Var12.f38106b = z12;
        D1(sr0Var12, z15);
        sr0VarArr2[z9 ? 1 : 0].f38114x.y1(i35);
        sr0VarArr2[z9 ? 1 : 0].h.a0();
        if (u0Var3 != null) {
            sr0VarArr2[z9 ? 1 : 0].h.setRecycledViewPool(u0Var3);
            sr0VarArr2[z9 ? 1 : 0].f38110n.setRecycledViewPool(u0Var3);
        }
        if (this.f40444z0 == 2) {
            if (y4Var != null) {
                z19 = y4Var.F;
            } else {
                z19 = kVar.f27677n0;
            }
            if (z19) {
                this.B0 = true;
                if (y4Var != null) {
                    y4Var.j(true);
                } else {
                    kVar.k();
                }
                this.f40444z0 = 0;
                this.f40419q0 = 0.0f;
                if (r0Var != null) {
                    if (H0()) {
                        i20 = i13;
                    } else {
                        i20 = i11;
                    }
                    setSearchItemVisibility(i20);
                }
                G1(false);
            }
        }
    }

    public void O0(SparseArray sparseArray) {
    }

    public void V0(boolean z9) {
    }

    public int f1(int i7) {
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

    public void P0() {
    }

    @Override
    public final void q() {
    }
}
