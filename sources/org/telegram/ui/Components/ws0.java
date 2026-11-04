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
public abstract class ws0 extends FrameLayout implements org.telegram.ui.ActionBar.z5, org.telegram.messenger.cs, org.telegram.ui.Cells.p2, nj0 {
    public static final int[] f40063t2 = {0, 1, 2, 4};
    public static final qp0 f40064u2 = new qp0(0);
    public static final int f40065v2 = org.telegram.messenger.g0.L(7.0f);
    public static final int f40066w2 = org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(14.0f);
    public int A0;
    public boolean A1;
    public final Drawable B0;
    public boolean B1;
    public boolean C0;
    public int C1;
    public final NumberTextView D0;
    public int D1;
    public final iz E;
    public final LinearLayout E0;
    public VelocityTracker E1;
    public final int F;
    public final ImageView F0;
    public boolean F1;
    public final long G;
    public final org.telegram.ui.ActionBar.w1 G0;
    public final lr0 G1;
    public final org.telegram.ui.ActionBar.k H;
    public final ArrayList H0;
    public gi.l3 H1;
    public final org.telegram.ui.ActionBar.y4 I;
    public final ArrayList I0;
    public final org.telegram.ui.ActionBar.e6 I1;
    public final org.telegram.ui.ActionBar.f5 J;
    public final ArrayList J0;
    public final si.c J1;
    public final dr0 K;
    public final ArrayList K0;
    public final za.p K1;
    public final qs0 L;
    public final tq0 L0;
    public boolean L1;
    public final ks0 M;
    public final qq0 M0;
    public final g2.g M1;
    public final js0 N;
    public final org.telegram.ui.Cells.t0 N0;
    public org.telegram.ui.f4 N1;
    public final js0 O;
    public AnimatorSet O0;
    public int O1;
    public final js0 P;
    public final uo0 P0;
    public boolean P1;
    public final fs0 Q;
    public final ArrayList Q0;
    public int Q1;
    public final mr0 R;
    public float R0;
    public AnimatorSet R1;
    public final kr0 S;
    public final pr S0;
    public final SparseArray S1;
    public final ir0 T;
    public final FrameLayout T0;
    public long T1;
    public final hs0 U;
    public final oq0 U0;
    public boolean U1;
    public final is0 V;
    public final int V0;
    public int V1;
    public final er0 W;
    public final Paint W0;
    public final ar0 W1;
    public boolean X0;
    public ei.r6 X1;
    public boolean Y0;
    public float Y1;
    public dh.n0 Z0;
    public boolean Z1;
    public boolean f40067a;
    public final tp0 f40068a0;
    public final int[] f40069a1;
    public SpannableStringBuilder f40070a2;
    public boolean f40071b;
    public final vp0 f40072b0;
    public int f40073b1;
    public int f40074b2;
    public boolean f40075c;
    public final yp0 f40076c0;
    public final SparseArray[] f40077c1;
    public boolean c2;
    public boolean d;
    public final jr0 f40078d0;
    public int f40079d1;
    public int f40080d2;
    public int f40081e;
    public final u4.y f40082e0;
    public boolean f40083e1;
    public int f40084e2;
    public int f40085f;
    public final gr0 f40086f0;
    public long f40087f1;
    public int f40088f2;
    public final ts0 f40089g0;
    public TLRPC.ChatFull f40090g1;
    public int f40091g2;
    public float h;
    public final rp0 f40092h0;
    public TLRPC.UserFull f40093h1;
    public pi.q f40094h2;
    public final ts0 f40095i0;
    public AnimatorSet f40096i1;
    public float f40097i2;
    public final tr0 f40098j0;
    public boolean f40099j1;
    public final RectF f40100j2;
    public final tr0 f40101k0;
    public boolean k1;
    public Runnable f40102k2;
    public final tr0 f40103l0;
    public boolean f40104l1;
    public int f40105l2;
    public final pr0 m0;
    public final long m1;
    public final HashMap f40106m2;
    public float f40107n;
    public final rr0[] f40108n0;
    public boolean f40109n1;
    public final HashMap f40110n2;
    public final org.telegram.ui.ActionBar.q0 f40111o0;
    public boolean f40112o1;
    public int f40113o2;
    public final org.telegram.ui.ActionBar.q0 f40114p0;
    public final int[] f40115p1;
    public int f40116p2;
    public final org.telegram.ui.ActionBar.q0 f40117q0;
    public float f40118q1;
    public boolean f40119q2;
    public boolean f40120r;
    public float f40121r0;
    public boolean f40122r1;
    public int f40123r2;
    public int f40124s;
    public float f40125s0;
    public int f40126s1;
    public int f40127s2;
    public final TextView f40128t0;
    public int f40129t1;
    public final ImageView f40130u0;
    public final eq0 f40131u1;
    public final fh0 f40132v0;
    public float f40133v1;
    public int f40134w;
    public final org.telegram.ui.ActionBar.q0 f40135w0;
    public final ls0[] f40136w1;
    public int f40137x;
    public final org.telegram.ui.ActionBar.q0 f40138x0;
    public final os0 f40139x1;
    public final Rect f40140y;
    public final org.telegram.ui.ActionBar.q0 f40141y0;
    public final org.telegram.ui.ActionBar.d2 f40142y1;
    public final org.telegram.ui.ActionBar.q0 f40143z0;
    public int f40144z1;

    public ws0(android.content.Context r34, long r35, org.telegram.ui.Components.os0 r37, int r38, java.util.ArrayList r39, org.telegram.tgnet.TLRPC.ChatFull r40, org.telegram.tgnet.TLRPC.UserFull r41, int r42, int r43, org.telegram.ui.ActionBar.d2 r44, org.telegram.ui.Components.lr0 r45, int r46, org.telegram.ui.ActionBar.e6 r47, eh.c r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ws0.<init>(android.content.Context, long, org.telegram.ui.Components.os0, int, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.tgnet.TLRPC$UserFull, int, int, org.telegram.ui.ActionBar.d2, org.telegram.ui.Components.lr0, int, org.telegram.ui.ActionBar.e6, eh.c):void");
    }

    public static boolean I0(int i3) {
        if ((i3 & (-65536)) == 65536) {
            return true;
        }
        return false;
    }

    public static p3 X(int i3, long j10, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        p3 p3Var = new p3(context, e6Var);
        ImageView imageView = (ImageView) p3Var.d;
        TextView textView = (TextView) p3Var.f37049c;
        if (i3 == 0) {
            if (org.telegram.messenger.m5.C(j10)) {
                textView.setText(org.telegram.messenger.bd.M0(2131748204, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.bd.M0(2131748206, null));
            return p3Var;
        } else if (i3 == 1) {
            if (org.telegram.messenger.m5.C(j10)) {
                textView.setText(org.telegram.messenger.bd.M0(2131748165, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.bd.M0(2131748166, null));
            return p3Var;
        } else if (i3 == 2) {
            if (org.telegram.messenger.m5.C(j10)) {
                textView.setText(org.telegram.messenger.bd.M0(2131748160, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.bd.M0(2131748161, null));
            return p3Var;
        } else if (i3 == 3) {
            if (org.telegram.messenger.m5.C(j10)) {
                textView.setText(org.telegram.messenger.bd.M0(2131748162, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.bd.M0(2131748163, null));
            return p3Var;
        } else if (i3 == 4) {
            if (org.telegram.messenger.m5.C(j10)) {
                textView.setText(org.telegram.messenger.bd.M0(2131748167, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.bd.M0(2131748168, null));
            return p3Var;
        } else if (i3 == 5) {
            if (org.telegram.messenger.m5.C(j10)) {
                textView.setText(org.telegram.messenger.bd.M0(2131748164, null));
                return p3Var;
            }
            textView.setText(org.telegram.messenger.bd.M0(2131748216, null));
            return p3Var;
        } else if (i3 == 6) {
            imageView.setImageDrawable(null);
            textView.setText(org.telegram.messenger.bd.M0(2131748214, null));
            return p3Var;
        } else {
            if (i3 == 7) {
                imageView.setImageDrawable(null);
                textView.setText("");
            }
            return p3Var;
        }
    }

    public static void a(ws0 ws0Var, TL_stories.StoryItem storyItem, ei.s6 s6Var) {
        ws0Var.getStoriesController().c(s6Var.f11008a, ws0Var.m1, storyItem);
        org.telegram.messenger.g0.i3(new j50(18, ws0Var, s6Var), 100L);
    }

    public static void d(ws0 ws0Var, int i3, TL_stories.StoryItem storyItem, String str) {
        org.telegram.ui.f4 f4Var = new org.telegram.ui.f4(ws0Var, i3, storyItem, 16);
        ei.z6 storiesController = ws0Var.getStoriesController();
        long j10 = ws0Var.m1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.f0(i3, j10, arrayList);
        fc.a0(ws0Var.f40142y1).K(2131623979, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(1, "StoryRemovedFromAlbumTitle", str)), org.telegram.messenger.bd.M0(2131743895, null), f4Var).j();
    }

    public static void e(ws0 ws0Var, long j10, int i3) {
        ei.n6 B = ws0Var.getStoriesController().B(j10, true);
        int i10 = B.f10669a;
        int c2 = B.c(i3);
        if (c2 == -1) {
            return;
        }
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = org.telegram.messenger.hp.s1(i10).j1(B.f10670b);
        tL_deleteAlbum.album_id = ((ei.s6) B.h.remove(c2)).f11008a;
        ConnectionsManager.getInstance(i10).sendRequest(tL_deleteAlbum, null);
        B.f(true);
    }

    public static void f(ws0 ws0Var, long j10, int i3, String str) {
        ei.n6 B = ws0Var.getStoriesController().B(j10, true);
        int i10 = B.f10669a;
        int c2 = B.c(i3);
        if (c2 == -1) {
            return;
        }
        ((ei.s6) B.h.get(c2)).f11009b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = org.telegram.messenger.hp.s1(i10).j1(B.f10670b);
        tL_updateAlbum.album_id = i3;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i10).sendRequest(tL_updateAlbum, null);
        B.f(true);
    }

    public long getPlaylistTopicId() {
        if (org.telegram.messenger.t3.b0(this.f40142y1.getCurrentAccount(), this.m1)) {
            return this.G;
        }
        return 0L;
    }

    public ei.z6 getStoriesController() {
        return org.telegram.messenger.hp.s1(this.f40142y1.getCurrentAccount()).P1();
    }

    public static void h(ws0 ws0Var, TL_stories.StoryItem storyItem) {
        ws0Var.getStoriesController().r0(ws0Var.m1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        fc.a0(ws0Var.f40142y1).G(2131623979, 5000, org.telegram.messenger.bd.G(1, "StoryArchived", new Object[0])).j();
    }

    public static void j(ws0 ws0Var, HashSet hashSet, TL_stories.StoryItem storyItem, f60 f60Var, ei.s6 s6Var) {
        String a02;
        long j10 = ws0Var.m1;
        if (hashSet.contains(Integer.valueOf(s6Var.f11008a))) {
            ws0Var.getStoriesController().c(s6Var.f11008a, j10, storyItem);
            a02 = org.telegram.messenger.bd.a0(null, null, 2131744741, s6Var.f11009b);
        } else {
            ei.z6 storiesController = ws0Var.getStoriesController();
            int i3 = s6Var.f11008a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.f0(i3, j10, arrayList);
            a02 = org.telegram.messenger.bd.a0(null, null, 2131744504, s6Var.f11009b);
        }
        fc.a0(ws0Var.f40142y1).Q(2131623989, 36, org.telegram.messenger.g0.X2(a02)).j();
        f60Var.u();
    }

    public static void n1(int i3, View view) {
        if (view != null && (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams.topMargin != i3) {
                marginLayoutParams.topMargin = i3;
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public static int o(View view) {
        if (view instanceof org.telegram.ui.Cells.n7) {
            return ((org.telegram.ui.Cells.n7) view).getMessageId();
        }
        if (view instanceof org.telegram.ui.Cells.g7) {
            return ((org.telegram.ui.Cells.g7) view).getMessage().f1();
        }
        if (view instanceof org.telegram.ui.Cells.f7) {
            return ((org.telegram.ui.Cells.f7) view).getMessage().f1();
        }
        return 0;
    }

    public static TLRPC.ProfileTab o0(int i3, boolean z10) {
        if (i3 != 8 && i3 != 14 && !z10) {
            return null;
        }
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 != 5) {
                                if (i3 != 8) {
                                    if (i3 != 14) {
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

    public static void s(rr0 rr0Var, ls0[] ls0VarArr, boolean z10) {
        j50 j50Var;
        if (z10) {
            if (org.telegram.messenger.az.f21671v1 > 0 && rr0Var.G == null && !rr0Var.I && rr0Var.h.getFastScroll() != null && rr0Var.h.getFastScroll().f40731b0 && rr0Var.h.getFastScroll().getVisibility() == 0 && ls0VarArr[0].e() >= 50) {
                int i3 = org.telegram.messenger.az.f21671v1;
                int i10 = i3 - 1;
                if (i3 != i10) {
                    org.telegram.messenger.az.f21671v1 = i10;
                    org.telegram.messenger.t0.f25457b.getSharedPreferences("mainconfig", 0).edit().putInt("fastScrollHintCount", org.telegram.messenger.az.f21671v1).apply();
                }
                rr0Var.I = true;
                Context context = rr0Var.getContext();
                ai.d2 d2Var = new ai.d2(context, 20);
                TextView textView = new TextView(context);
                textView.setText(org.telegram.messenger.bd.M0(2131745418, null));
                textView.setTextSize(1, 14.0f);
                textView.setMaxLines(3);
                int i11 = org.telegram.ui.ActionBar.k6.f27888dg;
                org.telegram.ui.ActionBar.r6.V(textView, i11, null);
                int L = org.telegram.messenger.g0.L(6.0f);
                int i12 = org.telegram.ui.ActionBar.k6.f27907eg;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.x0(null, i12, false));
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
                d2Var.setBackground(d02);
                org.telegram.ui.ActionBar.r6.k(d2Var, d02, N, null, null);
                d2Var.addView(textView, b8.mf.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
                ?? view = new View(context);
                view.f38096a = new Random();
                Paint paint = new Paint(1);
                view.f38097b = paint;
                Paint paint2 = new Paint(1);
                view.f38098c = paint2;
                view.f38100f = 1.0f;
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
                view.f38099e = paint4;
                paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
                paint4.setXfermode(new PorterDuffXfermode(mode));
                d2Var.addView((View) view, b8.mf.d(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                rr0Var.G = d2Var;
                rr0Var.addView(d2Var, b8.mf.c(-2.0f, -2));
                rr0Var.G.setAlpha(0.0f);
                rr0Var.G.setScaleX(0.8f);
                rr0Var.G.setScaleY(0.8f);
                rr0Var.G.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                rr0Var.invalidate();
                j50 j50Var2 = new j50(19, rr0Var, d2Var);
                rr0Var.H = j50Var2;
                org.telegram.messenger.g0.i3(j50Var2, 4000L);
            }
        } else if (rr0Var.G != null && (j50Var = rr0Var.H) != null) {
            org.telegram.messenger.g0.r(j50Var);
            rr0Var.H.run();
            rr0Var.H = null;
            rr0Var.G = null;
        }
    }

    public void setHeaderEnabled(boolean z10) {
        org.telegram.ui.ActionBar.y4 y4Var = this.I;
        if (y4Var != null) {
            y4Var.setEnabled(z10);
        } else {
            this.H.setEnabled(z10);
        }
    }

    private void setPageOverscan(qr0 qr0Var) {
        if (this.c2 && qr0Var != null) {
            qr0Var.f37518j3 = true;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qr0Var.getLayoutParams();
            if (marginLayoutParams != null) {
                int i3 = marginLayoutParams.topMargin;
                int i10 = -this.f40084e2;
                if (i3 != i10 || marginLayoutParams.bottomMargin != (-this.f40088f2)) {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.bottomMargin = -this.f40088f2;
                    qr0Var.setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    public void setSearchItemVisibility(int i3) {
        org.telegram.ui.ActionBar.q0 q0Var = this.f40117q0;
        if (q0Var == null) {
            return;
        }
        if (this.I != null) {
            R(true, true);
        } else {
            q0Var.setVisibility(i3);
        }
    }

    public static void t(ws0 ws0Var, int i3, boolean z10) {
        rr0[] rr0VarArr = ws0Var.f40108n0;
        if (rr0VarArr[0].F == i3) {
            return;
        }
        rr0 rr0Var = rr0VarArr[1];
        rr0Var.F = i3;
        rr0Var.setVisibility(0);
        ws0Var.w0();
        ws0Var.z1(true);
        ws0Var.k1 = z10;
        ws0Var.W0();
        ws0Var.E(!ws0Var.E0(i3));
        ws0Var.G1(true);
    }

    public static int x(ws0 ws0Var, u4.h0 h0Var) {
        if (h0Var == ws0Var.f40086f0) {
            return 8;
        }
        if (h0Var == ws0Var.f40092h0) {
            return 9;
        }
        for (vs0 vs0Var : ws0Var.f40106m2.values()) {
            if (vs0Var.f39782c == h0Var) {
                return vs0Var.f39780a;
            }
        }
        return -1;
    }

    public static int y(ws0 ws0Var, u4.h0 h0Var) {
        if (h0Var == ws0Var.f40089g0) {
            return 8;
        }
        if (h0Var == ws0Var.f40095i0) {
            return 9;
        }
        for (vs0 vs0Var : ws0Var.f40106m2.values()) {
            if (vs0Var.d == h0Var) {
                return vs0Var.f39780a;
            }
        }
        return -1;
    }

    public static boolean z0(int i3) {
        if (i3 != 8 && i3 != 9 && !I0(i3)) {
            return false;
        }
        return true;
    }

    public final SpannableStringBuilder A() {
        if (this.f40070a2 == null) {
            this.f40070a2 = new SpannableStringBuilder();
            if (B0()) {
                this.f40070a2.append((CharSequence) org.telegram.messenger.bd.M0(2131746710, null));
            } else {
                this.f40070a2.append((CharSequence) "c");
                this.f40070a2.setSpan(new wp(2131231146, 0), 0, 1, 33);
                this.f40070a2.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.bd.M0(2131744819, null));
            }
        }
        return this.f40070a2;
    }

    public boolean A0() {
        return false;
    }

    public final void A1(org.telegram.ui.ActionBar.y0 y0Var, org.telegram.ui.ActionBar.y0 y0Var2, Runnable runnable) {
        if (this.L1) {
            return;
        }
        if (!y0Var2.getCheckView().f40035a.f31334q && y0Var.getCheckView().f40035a.f31334q) {
            float f10 = -this.f40133v1;
            this.f40133v1 = f10;
            org.telegram.messenger.g0.G3(f10, y0Var, null);
            return;
        }
        y0Var.setChecked(!y0Var.getCheckView().f40035a.f31334q);
        runnable.run();
    }

    public final void B(vr0 vr0Var, org.telegram.ui.ActionBar.d2 d2Var, long j10, int i3) {
        String K;
        if (j10 > 0) {
            K = org.telegram.messenger.l10.n(org.telegram.messenger.hp.s1(d2Var.getCurrentAccount()).a2(Long.valueOf(j10)));
        } else {
            K = org.telegram.messenger.t3.K(org.telegram.messenger.hp.s1(d2Var.getCurrentAccount()).M0(Long.valueOf(-j10)), false);
        }
        if (K == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        com.google.android.recaptcha.internal.a.s(sb2, org.telegram.messenger.hp.s1(d2Var.getCurrentAccount()).V2, "/", K, "/a/");
        sb2.append(i3);
        String sb3 = sb2.toString();
        vr0Var.n(2131231757, new e7(this, sb3, d2Var, 24), org.telegram.messenger.bd.M0(2131744798, null), false, true);
    }

    public final boolean B0() {
        TLRPC.User a22;
        long j10 = this.m1;
        if (j10 <= 0 || (a22 = org.telegram.messenger.hp.s1(this.f40142y1.getCurrentAccount()).a2(Long.valueOf(j10))) == null || !a22.bot) {
            return false;
        }
        return true;
    }

    public final void B1() {
        if (this.I == null) {
            try {
                int s02 = s0(org.telegram.ui.ActionBar.k6.f28275y8);
                int s03 = s0(org.telegram.ui.ActionBar.k6.f28292z8);
                if (s02 != this.f40123r2 || s03 != this.f40127s2) {
                    this.f40123r2 = s02;
                    this.f40127s2 = s03;
                    org.telegram.ui.ActionBar.q0[] q0VarArr = {this.f40138x0, this.f40135w0, this.f40141y0, this.f40143z0, this.f40111o0};
                    for (int i3 = 0; i3 < 5; i3++) {
                        org.telegram.ui.ActionBar.q0 q0Var = q0VarArr[i3];
                        if (q0Var != null) {
                            q0Var.setIconColor(s02);
                            if (q0Var.getBackground() != null) {
                                org.telegram.ui.ActionBar.k6.H1(q0Var.getBackground(), s03, true);
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void C(vr0 vr0Var) {
        float f10;
        final View[] viewArr = {vr0Var.n(2131232438, new Runnable(this) {
            public final ws0 f35165b;

            {
                this.f35165b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        ws0 ws0Var = this.f35165b;
                        ws0Var.getClass();
                        View[] viewArr2 = viewArr;
                        ws0Var.O1(viewArr2[0], viewArr2[1]);
                        return;
                    default:
                        ws0 ws0Var2 = this.f35165b;
                        ws0Var2.getClass();
                        View[] viewArr3 = viewArr;
                        ws0Var2.P1(viewArr3[0], viewArr3[1]);
                        return;
                }
            }
        }, org.telegram.messenger.bd.M0(2131748658, null), false, false), vr0Var.n(2131232439, new Runnable(this) {
            public final ws0 f35165b;

            {
                this.f35165b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        ws0 ws0Var = this.f35165b;
                        ws0Var.getClass();
                        View[] viewArr2 = viewArr;
                        ws0Var.O1(viewArr2[0], viewArr2[1]);
                        return;
                    default:
                        ws0 ws0Var2 = this.f35165b;
                        ws0Var2.getClass();
                        View[] viewArr3 = viewArr;
                        ws0Var2.P1(viewArr3[0], viewArr3[1]);
                        return;
                }
            }
        }, org.telegram.messenger.bd.M0(2131748657, null), false, false)};
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
        org.telegram.ui.ActionBar.d2 d2Var;
        if (this.f40090g1 != null && (d2Var = this.f40142y1) != null) {
            return org.telegram.messenger.t3.V(d2Var.getMessagesController().M0(Long.valueOf(this.f40090g1.f27002id)));
        }
        return false;
    }

    public final void C1() {
        if (D0()) {
            post(new uo0(this, 13));
            return;
        }
        dr0 dr0Var = this.K;
        if (dr0Var != null) {
            dr0Var.f();
        }
        js0 js0Var = this.N;
        if (js0Var != null) {
            js0Var.f();
        }
        js0 js0Var2 = this.O;
        if (js0Var2 != null) {
            js0Var2.f();
        }
        ks0 ks0Var = this.M;
        if (ks0Var != null) {
            ks0Var.X(false);
        }
        js0 js0Var3 = this.P;
        if (js0Var3 != null) {
            js0Var3.f();
        }
        fs0 fs0Var = this.Q;
        if (fs0Var != null) {
            fs0Var.f();
        }
        mr0 mr0Var = this.R;
        if (mr0Var != null) {
            mr0Var.f();
        }
        gr0 gr0Var = this.f40086f0;
        if (gr0Var != null) {
            gr0Var.f();
        }
        for (vs0 vs0Var : this.f40106m2.values()) {
            vs0Var.f39782c.f();
        }
    }

    public final void D(qr0 qr0Var, int i3, SparseBooleanArray sparseBooleanArray) {
        int childCount = qr0Var.getChildCount();
        iz izVar = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = qr0Var.getChildAt(i10);
            if (childAt instanceof iz) {
                izVar = childAt;
            }
        }
        if (izVar != null) {
            qr0Var.removeView(izVar);
        }
        getViewTreeObserver().addOnPreDrawListener(new yq0(this, qr0Var, sparseBooleanArray, izVar, i3));
    }

    public final boolean D0() {
        int i3 = 0;
        while (true) {
            rr0[] rr0VarArr = this.f40108n0;
            if (i3 >= rr0VarArr.length) {
                return false;
            }
            rr0 rr0Var = rr0VarArr[i3];
            if (rr0Var != null) {
                cq0 cq0Var = rr0Var.h;
                if (cq0Var == null || !cq0Var.c0()) {
                    qr0 qr0Var = rr0VarArr[i3].f37787n;
                    if (qr0Var != null && qr0Var.c0()) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
            i3++;
        }
    }

    public final void D1(rr0 rr0Var, boolean z10) {
        boolean z11;
        Integer num = 1;
        int i3 = 0;
        if (rr0Var.f37783b && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        yi0 fastScroll = rr0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = rr0Var.f37784c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            rr0Var.f37784c.cancel();
        }
        if (!z10) {
            fastScroll.animate().setListener(null).cancel();
            if (!z11) {
                i3 = 8;
            }
            fastScroll.setVisibility(i3);
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
            rr0Var.f37784c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(num);
        } else if (!z11 && fastScroll.getTag() != null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, property, fastScroll.getAlpha(), 0.0f);
            ofFloat2.addListener(new s9(fastScroll));
            rr0Var.f37784c = ofFloat2;
            ofFloat2.setDuration(150L).start();
            fastScroll.animate().setListener(null).cancel();
            fastScroll.setTag(null);
        }
    }

    public final void E(boolean z10) {
        int i3;
        fh0 fh0Var = this.f40132v0;
        if (fh0Var != null && this.Z1 != z10) {
            this.Z1 = z10;
            if (!z10 && fh0Var.getAnimatedDrawable().f32721b0 < 20) {
                fh0Var.getAnimatedDrawable().P(0);
            } else {
                ch0 animatedDrawable = fh0Var.getAnimatedDrawable();
                if (this.Z1) {
                    i3 = 50;
                } else {
                    i3 = 100;
                }
                animatedDrawable.P(i3);
            }
            fh0Var.getAnimatedDrawable().start();
        }
    }

    public final boolean E0(int i3) {
        if (i3 == 7) {
            return this.G1.X();
        }
        if (!F0() && i3 != 0 && !z0(i3) && i3 != 2 && i3 != 5 && i3 != 6 && i3 != 11 && i3 != 10 && i3 != 13 && i3 != 14 && i3 != 15) {
            return true;
        }
        return false;
    }

    public final void E1() {
        boolean z10;
        float f10;
        org.telegram.ui.ActionBar.q0 q0Var = this.f40135w0;
        if (q0Var != null) {
            if (!this.f40142y1.getMessagesController().A2(this.m1) && !u0()) {
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
                int i3 = org.telegram.ui.ActionBar.k6.f28292z8;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(s0(i3), 5, -1);
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
                q0Var.setBackground(h02);
                org.telegram.ui.ActionBar.r6.k(q0Var, h02, null, N, this.I1);
            }
        }
    }

    public final void F(int i3) {
        int i10;
        rr0 g02 = g0(this.f40126s1);
        this.f40124s = -1;
        if (g02 != null) {
            g02.h.C0();
            this.f40129t1 = i3;
            g02.f37787n.setVisibility(0);
            if (z0(this.f40126s1)) {
                g02.f37787n.setAdapter(y1(this.f40126s1));
            } else {
                g02.f37787n.setAdapter(this.L);
            }
            qr0 qr0Var = g02.f37787n;
            int paddingLeft = qr0Var.getPaddingLeft();
            qr0 qr0Var2 = g02.f37787n;
            int j02 = j0(g02.F);
            qr0Var2.f37517h3 = j02;
            int paddingRight = g02.f37787n.getPaddingRight();
            qr0 qr0Var3 = g02.f37787n;
            int i02 = i0(H0());
            qr0Var3.i3 = i02;
            qr0Var.setPadding(paddingLeft, j02, paddingRight, i02);
            g02.f37788r.y1(i3);
            g02.f37787n.a0();
            int i11 = 0;
            while (true) {
                rr0[] rr0VarArr = this.f40108n0;
                if (i11 >= rr0VarArr.length) {
                    break;
                }
                rr0 rr0Var = rr0VarArr[i11];
                if (rr0Var != null && ((i10 = rr0Var.F) == 0 || z0(i10))) {
                    org.telegram.messenger.g0.b4(rr0VarArr[i11].h);
                }
                i11++;
            }
            this.f40122r1 = true;
            if (this.f40126s1 == 0) {
                this.f40136w1[0].g(true);
            }
            this.f40118q1 = 0.0f;
            h1();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.M1.d();
            ofFloat.addUpdateListener(new sq0(this, g02, 1));
            ofFloat.addListener(new ii.p2(this, z0(g02.F) ? 1 : 0, i3, 2));
            ofFloat.setInterpolator(xq.f40452f);
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
        int i3;
        vp0 vp0Var = this.f40072b0;
        if (vp0Var != null) {
            int L = org.telegram.messenger.g0.L(48.0f) + this.f40080d2;
            pr prVar = this.S0;
            if (prVar != null) {
                i3 = (int) prVar.c(org.telegram.messenger.g0.L(7.0f));
            } else {
                i3 = 0;
            }
            vp0Var.setPaddingTop(L + i3);
        }
    }

    public final void G() {
        int i3 = this.f40080d2;
        int i10 = this.f40116p2;
        n1((org.telegram.messenger.g0.L(6.666f) + i3) - f40066w2, this.S0);
        int i11 = i3 + i10;
        n1(i11, this.L0);
        n1(i11, this.E0);
        n1(org.telegram.messenger.g0.L(52.0f) + i3 + i10, this.N0);
        n1(org.telegram.messenger.g0.L(4.0f) + i3 + i10, this.M0);
        n1(org.telegram.messenger.g0.L(48.0f) + i3 + i10, this.f40076c0);
        if (this.f40105l2 != i10) {
            this.f40105l2 = i10;
            Runnable runnable = this.f40102k2;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public boolean G0() {
        return false;
    }

    public final void G1(boolean z10) {
        vp0 vp0Var;
        yp0 yp0Var;
        boolean z11 = true;
        R(true, true);
        fh0 fh0Var = this.f40132v0;
        if (fh0Var == null) {
            return;
        }
        float f10 = 0.0f;
        if (!this.Y0 && (((vp0Var = this.f40072b0) == null || !vp0Var.g()) && ((yp0Var = this.f40076c0) == null || !yp0Var.f44470f))) {
            f10 = Utilities.i(this.f40121r0 + this.f40125s0, 1.0f, 0.0f);
        }
        fh0Var.setAlpha(f10);
        if (z10) {
            if (k0(1.0f) <= 0.5f) {
                z11 = false;
            }
            E(z11);
        } else if (this.A0 == 2) {
            if (this.f40125s0 <= 0.1f) {
                z11 = false;
            }
            E(z11);
        } else {
            if (this.f40121r0 >= 0.1f) {
                z11 = false;
            }
            E(z11);
        }
    }

    public final boolean H() {
        boolean B0 = B0();
        long j10 = this.m1;
        org.telegram.ui.ActionBar.d2 d2Var = this.f40142y1;
        if (B0) {
            TLRPC.User a22 = org.telegram.messenger.hp.s1(d2Var.getCurrentAccount()).a2(Long.valueOf(j10));
            if (a22 == null || !a22.bot || !a22.bot_can_edit) {
                return false;
            }
            return true;
        } else if (!H0()) {
            if (d2Var == null || !d2Var.getMessagesController().P1().h(j10)) {
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

    public final void H1(rr0 rr0Var) {
        boolean z10;
        boolean b12 = rr0Var.h.b1();
        if (b12) {
            rr0Var.h.setSectionsDrawBackground(this.c2);
        }
        if (this.c2 && !b12 && rr0Var.F != 15) {
            z10 = true;
        } else {
            z10 = false;
        }
        rr0Var.setDrawPageBackground(z10);
        if (rr0Var.F == 15) {
            Drawable drawable = rr0Var.P;
            if (drawable == null) {
                drawable = rr0Var.getBackground();
            }
            Drawable e10 = gi.y5.e(drawable, this.f40142y1.getCurrentAccount(), this.m1, org.telegram.ui.ActionBar.k6.I.q());
            if (!this.c2) {
                rr0Var.setWallpaper(null);
                rr0Var.setBackground(e10);
                rr0Var.setOutlineProvider(new cg.p0(18));
                rr0Var.setClipToOutline(true);
                return;
            }
            rr0Var.setBackground(null);
            rr0Var.setClipToOutline(false);
            rr0Var.setWallpaper(e10);
            return;
        }
        rr0Var.setClipToOutline(false);
        rr0Var.setBackground(null);
        rr0Var.setWallpaper(null);
    }

    public boolean I() {
        return !(this instanceof k20);
    }

    public final void I1(rr0 rr0Var) {
        boolean z10;
        float f10;
        int i3;
        float f11;
        float f12;
        int i10 = rr0Var.F;
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
            i3 = 8;
        } else {
            i3 = 12;
        }
        float f13 = i3 + 48;
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
        FrameLayout.LayoutParams d = b8.mf.d(-1, -1.0f, 119, f10, f13, f11, f12);
        d.topMargin = n0(rr0Var.F) + d.topMargin;
        ViewGroup.LayoutParams layoutParams = rr0Var.f37789s.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2.leftMargin == d.leftMargin && layoutParams2.topMargin == d.topMargin && layoutParams2.rightMargin == d.rightMargin && layoutParams2.bottomMargin == d.bottomMargin && layoutParams2.gravity == d.gravity) {
                return;
            }
        }
        rr0Var.f37789s.setLayoutParams(d);
    }

    public final boolean J() {
        rr0 rr0Var;
        rr0[] rr0VarArr = this.f40108n0;
        if (rr0VarArr != null && (rr0Var = rr0VarArr[0]) != null) {
            boolean z02 = z0(rr0Var.F);
            int i3 = this.f40115p1[z02 ? 1 : 0];
            if (i3 != h0(z02 ? 1 : 0, i3, true)) {
                return true;
            }
        }
        return false;
    }

    public final boolean J0() {
        if (!H() || ((getClosestTab() != 8 && getClosestTab() != 13 && !I0(getClosestTab())) || !this.F1)) {
            vp0 vp0Var = this.f40072b0;
            if (vp0Var == null || !vp0Var.g()) {
                yp0 yp0Var = this.f40076c0;
                if ((yp0Var == null || !yp0Var.f44470f) && !this.f40122r1 && !this.f40099j1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void J1(boolean z10) {
        int i3 = 0;
        while (true) {
            rr0[] rr0VarArr = this.f40108n0;
            if (i3 < rr0VarArr.length) {
                int childCount = rr0VarArr[i3].h.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = rr0VarArr[i3].h.getChildAt(i10);
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
                        ((org.telegram.ui.Cells.t2) childAt).c0(false, z10);
                    }
                }
                i3++;
            } else {
                return;
            }
        }
    }

    public final boolean K() {
        rr0 rr0Var;
        rr0[] rr0VarArr = this.f40108n0;
        if (rr0VarArr == null || (rr0Var = rr0VarArr[0]) == null) {
            return false;
        }
        if (this.f40109n1 && z0(rr0Var.F)) {
            return false;
        }
        boolean z02 = z0(rr0VarArr[0].F);
        int i3 = this.f40115p1[z02 ? 1 : 0];
        if (i3 == h0(z02 ? 1 : 0, i3, false)) {
            return false;
        }
        return true;
    }

    public final void K0(int i3, int i10, int i11, boolean z10) {
        ls0[] ls0VarArr = this.f40136w1;
        ls0VarArr[i3].f35854a.clear();
        ls0VarArr[i3].f35855b[0].clear();
        ls0VarArr[i3].f35855b[1].clear();
        ls0 ls0Var = ls0VarArr[i3];
        ls0Var.f35861j[0] = i10;
        ls0Var.f35860i[0] = false;
        ls0Var.f35863l = false;
        ls0Var.f35864m = i11;
        ls0Var.f35865n = (ls0Var.e() - i11) - 1;
        ls0 ls0Var2 = ls0VarArr[i3];
        if (ls0Var2.f35865n < 0) {
            ls0Var2.f35865n = 0;
        }
        ls0Var2.f35862k = i10;
        ls0Var2.f35866o = true;
        ls0Var2.f35859g = false;
        ls0Var2.f35867p++;
        rr0 g02 = g0(i3);
        if (g02 != null && g02.h.getAdapter() != null) {
            g02.h.getAdapter().f();
        }
        if (z10) {
            int i12 = 0;
            while (true) {
                rr0[] rr0VarArr = this.f40108n0;
                if (i12 < rr0VarArr.length) {
                    rr0 rr0Var = rr0VarArr[i12];
                    if (rr0Var.F == i3) {
                        rr0Var.f37791x.h1(Math.min(ls0VarArr[i3].e() - 1, ls0VarArr[i3].f35864m), 0);
                    }
                    i12++;
                } else {
                    return;
                }
            }
        }
    }

    public final void K1(float f10) {
        org.telegram.ui.ActionBar.q0 q0Var = this.f40114p0;
        if (q0Var == null) {
            return;
        }
        rr0[] rr0VarArr = this.f40108n0;
        rr0 rr0Var = rr0VarArr[1];
        float f11 = 0.0f;
        if (rr0Var != null && rr0Var.F == 11) {
            f11 = 0.0f + f10;
        }
        int i3 = 0;
        rr0 rr0Var2 = rr0VarArr[0];
        if (rr0Var2 != null && rr0Var2.F == 11) {
            f11 += 1.0f - f10;
        }
        q0Var.setAlpha(f11);
        float f12 = (0.15f * f11) + 0.85f;
        q0Var.setScaleX(f12);
        q0Var.setScaleY(f12);
        if (f11 <= 0.01f) {
            i3 = 8;
        }
        q0Var.setVisibility(i3);
    }

    public final void L(Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        rr0[] rr0VarArr;
        tj0 tj0Var;
        tp0 tp0Var;
        er0 er0Var;
        vp0 vp0Var;
        View[] viewPages;
        for (rr0 rr0Var : this.f40108n0) {
            if (rr0Var != null && rr0Var.getVisibility() == 0) {
                if (rr0Var.P != null) {
                    RectF rectF2 = this.f40100j2;
                    if (kh.k.c(rr0Var, viewGroup, rectF2)) {
                        canvas.save();
                        canvas.translate(rectF2.left, rectF2.top);
                        rr0Var.g(canvas);
                        canvas.restore();
                    }
                }
                if (rr0Var.F == 14 && (vp0Var = this.f40072b0) != null && vp0Var.getParent() == rr0Var) {
                    for (View view : vp0Var.h.getViewPages()) {
                        if ((view instanceof ai.o4) && view.getVisibility() == 0) {
                            ai.h4 h4Var = ((ai.o4) view).f860f;
                            jh.d.a(h4Var, canvas, rectF, h4Var, viewGroup);
                        }
                    }
                } else {
                    if (rr0Var.F == 12 && (er0Var = this.W) != null && er0Var.getParent() == rr0Var) {
                        tj0Var = er0Var.f52363a.A0;
                    } else if (rr0Var.F == 13 && (tp0Var = this.f40068a0) != null && tp0Var.getParent() == rr0Var) {
                        tj0Var = tp0Var.getCurrentListView();
                    } else {
                        tj0Var = rr0Var.h;
                    }
                    if (tj0Var != null && tj0Var.getVisibility() == 0) {
                        jh.d.a(tj0Var, canvas, rectF, tj0Var, viewGroup);
                    }
                }
            }
        }
    }

    public final void L0(boolean z10) {
        long j10 = this.G;
        int i3 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i3 == 0 && !F0()) {
            for (int i10 = 0; i10 < 4; i10++) {
                int i11 = f40063t2[i10];
                ls0[] ls0VarArr = this.f40136w1;
                if (!ls0VarArr[i11].h || z10) {
                    long j11 = this.m1;
                    if (!org.telegram.messenger.m5.C(j11)) {
                        ls0VarArr[i11].h = false;
                        TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
                        if (i11 == 0) {
                            int i12 = ls0VarArr[i11].f35868q;
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
                        org.telegram.ui.ActionBar.d2 d2Var = this.f40142y1;
                        tL_messages_getSearchResultsPositions.peer = d2Var.getMessagesController().j1(j11);
                        if (i3 != 0 && d2Var.getUserConfig().e() == j11) {
                            tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                            tL_messages_getSearchResultsPositions.saved_peer_id = d2Var.getMessagesController().j1(j10);
                        }
                        ConnectionsManager.getInstance(d2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(d2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new org.telegram.messenger.zd(this, ls0VarArr[i11].f35867p, i11, 2)), d2Var.getClassGuid());
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
        org.telegram.ui.ActionBar.q0 q0Var = this.f40114p0;
        if (q0Var == null) {
            return;
        }
        boolean z10 = true;
        rr0 rr0Var = this.f40108n0[1];
        if (rr0Var == null || rr0Var.F != 11) {
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
        scaleX.scaleY(f12).withEndAction(new ci.e1(29, this, z10)).setDuration(420L).setInterpolator(xq.h).start();
    }

    public final void M() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ws0.M():void");
    }

    public final void M0(int i3) {
        int i10;
        int i11 = 2;
        ls0[] ls0VarArr = this.f40136w1;
        if (i3 == 0) {
            int i12 = ls0VarArr[0].f35868q;
            if (i12 == 1) {
                i11 = 6;
            } else if (i12 == 2) {
                i11 = 7;
            } else {
                i10 = 0;
            }
            i10 = i11;
        } else if (i3 == 1) {
            i10 = 1;
        } else {
            if (i3 != 2) {
                i11 = 4;
                if (i3 != 4) {
                    i11 = 5;
                    if (i3 != 5) {
                        i11 = 3;
                    }
                }
            }
            i10 = i11;
        }
        ls0VarArr[i3].f35859g = true;
        org.telegram.ui.ActionBar.d2 d2Var = this.f40142y1;
        d2Var.getMediaDataController().N0(this.m1, 50, 0, ls0VarArr[i3].f35862k, i10, this.G, 1, d2Var.getClassGuid(), ls0VarArr[i3].f35867p, null, null);
    }

    public final void M1() {
        boolean z10;
        int i3;
        ei.r6 r6Var;
        boolean B0 = B0();
        org.telegram.ui.ActionBar.q0 q0Var = this.f40143z0;
        org.telegram.ui.ActionBar.q0 q0Var2 = this.f40141y0;
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
                SparseArray[] sparseArrayArr = this.f40077c1;
                if (i11 < sparseArrayArr[0].size()) {
                    org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) sparseArrayArr[0].valueAt(i11);
                    gr0 gr0Var = this.f40086f0;
                    if (gr0Var != null && (r6Var = gr0Var.f38550s) != null && !r6Var.m(ziVar.f1())) {
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
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                q0Var2.setVisibility(i3);
            }
            if (q0Var != null) {
                if (!z10) {
                    i10 = 0;
                }
                q0Var.setVisibility(i10);
            }
        } else if (I0(getClosestTab())) {
            if (q0Var2 != null) {
                q0Var2.setVisibility(8);
            }
            if (q0Var != null) {
                q0Var.setVisibility(8);
            }
        }
    }

    public final void N() {
        tq0 tq0Var = this.L0;
        if (!tq0Var.d(tq0Var.getCurrentTabId())) {
            int firstTabId = tq0Var.getFirstTabId();
            tq0Var.setInitialTabId(firstTabId);
            this.f40108n0[0].F = firstTabId;
            z1(false);
        }
    }

    public int N0() {
        return 0;
    }

    public void N1(boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ws0.N1(boolean):void");
    }

    public final void O(org.telegram.ui.Components.rr0 r34, org.telegram.ui.Components.tj0 r35, u4.b0 r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ws0.O(org.telegram.ui.Components.rr0, org.telegram.ui.Components.tj0, u4.b0):void");
    }

    public final Boolean O1(View view, View view2) {
        if (!this.f40122r1) {
            rr0[] rr0VarArr = this.f40108n0;
            boolean z10 = false;
            rr0 rr0Var = rr0VarArr[0];
            if (rr0Var != null) {
                int i3 = rr0Var.F;
                this.f40126s1 = i3;
                boolean z02 = z0(i3);
                int[] iArr = this.f40115p1;
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
                        org.telegram.messenger.az.B(h02);
                    } else if (m0(rr0VarArr[0].F) >= 5 || I0(rr0VarArr[0].F)) {
                        org.telegram.messenger.az.F(h02);
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

    public final boolean P(MotionEvent motionEvent) {
        float f10;
        u4.h0 h0Var;
        boolean z10;
        tp0 tp0Var;
        float f11;
        boolean z11;
        rr0[] rr0VarArr = this.f40108n0;
        int i3 = rr0VarArr[0].F;
        if (i3 == 13 && (tp0Var = this.f40068a0) != null) {
            View currentView = tp0Var.f11636n.getCurrentView();
            if (currentView instanceof fi.m) {
                fi.m mVar = (fi.m) currentView;
                fi.h hVar = mVar.f11624w;
                fi.e eVar = mVar.f11620f;
                if (mVar.f11615a != null && mVar.getParent() != null) {
                    if (!mVar.f11617b || mVar.L) {
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
                                            mVar.f11618c = 0.0f;
                                        } else {
                                            if (z12) {
                                                f11 = org.telegram.messenger.k5.y(2.0f, mVar.R, 1.0f, 1.0f);
                                            } else {
                                                f11 = (1.0f - mVar.R) / 0.5f;
                                            }
                                            mVar.f11618c = Math.max(0.0f, Math.min(1.0f, f11));
                                        }
                                        float f12 = mVar.f11618c;
                                        int i13 = (f12 > 1.0f ? 1 : (f12 == 1.0f ? 0 : -1));
                                        if (i13 == 0 || f12 == 0.0f) {
                                            if (i13 == 0) {
                                                int i14 = mVar.f11619e;
                                                int ceil = (((int) Math.ceil(mVar.T / mVar.f11619e)) * i14) + ((int) ((mVar.f11616a0.H.C1 / (eVar.getMeasuredWidth() - ((int) (eVar.getMeasuredWidth() / mVar.f11619e)))) * (i14 - 1)));
                                                if (ceil >= hVar.b()) {
                                                    ceil = hVar.b() - 1;
                                                }
                                                mVar.T = ceil;
                                            }
                                            mVar.a();
                                            if (mVar.f11618c == 0.0f) {
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
                                int y9 = (int) ((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view.getY()) - mVar.getY());
                                int i15 = mVar.V;
                                Rect rect = mVar.W;
                                mVar.T = -1;
                                int top = y9 - eVar.getTop();
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
        if ((i3 == 0 || z0(i3)) && getParent() != null) {
            if (!this.f40122r1 || this.f40067a) {
                if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
                    if (motionEvent.getActionMasked() == 2 && (this.f40067a || this.f40075c)) {
                        int i17 = -1;
                        int i18 = -1;
                        for (int i19 = 0; i19 < motionEvent.getPointerCount(); i19++) {
                            if (this.f40081e == motionEvent.getPointerId(i19)) {
                                i17 = i19;
                            }
                            if (this.f40085f == motionEvent.getPointerId(i19)) {
                                i18 = i19;
                            }
                        }
                        if (i17 != -1 && i18 != -1) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(i18) - motionEvent.getX(i17), motionEvent.getY(i18) - motionEvent.getY(i17))) / this.h;
                            this.f40107n = hypot2;
                            if (!this.f40067a && (hypot2 > 1.01f || hypot2 < 0.99f)) {
                                this.f40067a = true;
                                if (hypot2 > 1.0f) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                this.f40120r = z10;
                                r1(z10);
                            }
                            if (this.f40067a) {
                                boolean z13 = this.f40120r;
                                if ((z13 && this.f40107n < 1.0f) || (!z13 && this.f40107n > 1.0f)) {
                                    this.f40118q1 = 0.0f;
                                } else {
                                    if (z13) {
                                        f10 = org.telegram.messenger.k5.y(2.0f, this.f40107n, 1.0f, 1.0f);
                                    } else {
                                        f10 = (1.0f - this.f40107n) / 0.5f;
                                    }
                                    this.f40118q1 = Math.max(0.0f, Math.min(1.0f, f10));
                                }
                                float f13 = this.f40118q1;
                                if (f13 == 1.0f || f13 == 0.0f) {
                                    if (z0(this.f40126s1)) {
                                        h0Var = x1(this.f40126s1);
                                    } else {
                                        h0Var = this.K;
                                    }
                                    if (this.f40118q1 == 1.0f) {
                                        int i20 = this.f40129t1;
                                        int ceil2 = (((int) Math.ceil(this.f40124s / this.f40129t1)) * i20) + ((int) ((this.C1 / (rr0VarArr[0].h.getMeasuredWidth() - ((int) (rr0VarArr[0].h.getMeasuredWidth() / this.f40129t1)))) * (i20 - 1)));
                                        if (ceil2 >= h0Var.b()) {
                                            ceil2 = h0Var.b() - 1;
                                        }
                                        this.f40124s = ceil2;
                                    }
                                    d0();
                                    if (this.f40118q1 == 0.0f) {
                                        this.f40120r = !this.f40120r;
                                    }
                                    r1(this.f40120r);
                                    this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                }
                                rr0VarArr[0].h.invalidate();
                                rr0 rr0Var = rr0VarArr[0];
                                if (rr0Var.G != null) {
                                    rr0Var.invalidate();
                                }
                            }
                        } else {
                            this.f40071b = false;
                            this.f40075c = false;
                            this.f40067a = false;
                            d0();
                            return false;
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.f40081e == motionEvent.getPointerId(0) && this.f40085f == motionEvent.getPointerId(1)) || (this.f40081e == motionEvent.getPointerId(1) && this.f40085f == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.f40067a) {
                        this.f40075c = false;
                        this.f40071b = false;
                        this.f40067a = false;
                        d0();
                    }
                } else {
                    if (this.f40071b && !this.f40067a && motionEvent.getPointerCount() == 2) {
                        this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.f40107n = 1.0f;
                        this.f40081e = motionEvent.getPointerId(0);
                        this.f40085f = motionEvent.getPointerId(1);
                        rr0VarArr[0].h.I0(false);
                        rr0VarArr[0].h.cancelLongPress();
                        rr0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.f40137x = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - rr0VarArr[0].getX());
                        int y10 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - rr0VarArr[0].getY());
                        int i21 = this.f40137x;
                        this.f40124s = -1;
                        int top2 = y10 - rr0VarArr[0].h.getTop();
                        if (getY() != 0.0f && this.F == 1) {
                            top2 = 0;
                        }
                        for (int i22 = 0; i22 < rr0VarArr[0].h.getChildCount(); i22++) {
                            View childAt2 = rr0VarArr[0].h.getChildAt(i22);
                            Rect rect2 = this.f40140y;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i21, top2)) {
                                rr0VarArr[0].h.getClass();
                                this.f40124s = RecyclerView.S(childAt2);
                                this.f40134w = childAt2.getTop();
                            }
                        }
                        if (this.G1.X() && this.f40124s == -1) {
                            this.f40124s = (int) (((this.f40115p1[z0(rr0VarArr[0].F) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i21 / rr0VarArr[0].h.getMeasuredWidth(), 0.0f))) + rr0VarArr[0].f37791x.L0());
                            this.f40134w = 0;
                        }
                        this.f40075c = true;
                    }
                    if (motionEvent.getActionMasked() == 0 && ((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - rr0VarArr[0].getY() > this.f40080d2) {
                        this.f40071b = true;
                    }
                }
                return this.f40067a;
            }
            return true;
        }
        return false;
    }

    public final Boolean P1(View view, View view2) {
        if (!this.f40122r1) {
            rr0[] rr0VarArr = this.f40108n0;
            boolean z10 = false;
            rr0 rr0Var = rr0VarArr[0];
            if (rr0Var != null) {
                if (!this.f40109n1 || !z0(rr0Var.F)) {
                    int i3 = rr0VarArr[0].F;
                    this.f40126s1 = i3;
                    boolean z02 = z0(i3);
                    int[] iArr = this.f40115p1;
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
                            org.telegram.messenger.az.B(h02);
                        } else if (m0(rr0VarArr[0].F) >= 5 || I0(rr0VarArr[0].F)) {
                            org.telegram.messenger.az.F(h02);
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

    public final void Q() {
        R(false, false);
    }

    public final void Q0() {
        ei.r6 r6Var;
        ei.r6 r6Var2;
        this.K1.a();
        gr0 gr0Var = this.f40086f0;
        if (gr0Var != null && (r6Var2 = gr0Var.f38550s) != null && r6Var2 != null) {
            r6Var2.z(gr0Var.f38551w);
        }
        rp0 rp0Var = this.f40092h0;
        if (rp0Var != null && (r6Var = rp0Var.f38550s) != null && r6Var != null) {
            r6Var.z(rp0Var.f38551w);
        }
        for (vs0 vs0Var : this.f40106m2.values()) {
            us0 us0Var = vs0Var.f39782c;
            ei.r6 r6Var3 = us0Var.f38550s;
            if (r6Var3 != null && r6Var3 != null) {
                r6Var3.z(us0Var.f38551w);
            }
        }
    }

    public final void R(boolean z10, boolean z11) {
        boolean z12;
        if (this.I != null) {
            int closestTab = getClosestTab();
            boolean z13 = false;
            org.telegram.ui.ActionBar.q0 q0Var = this.f40117q0;
            if (q0Var != null) {
                if (this.f40119q2 && I() && (E0(closestTab) || (closestTab == 11 && x0()))) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ((org.telegram.ui.ActionBar.f5) q0Var).Y(z12, z10);
            }
            org.telegram.ui.ActionBar.f5 f5Var = this.J;
            if (f5Var != null) {
                if (this.f40119q2 && I() && !A0() && v0(closestTab)) {
                    z13 = true;
                }
                f5Var.Y(z13, z11);
            }
        }
    }

    public final void R0(int i3, View view, org.telegram.messenger.zi ziVar, int i10) {
        TLRPC.WebPage webPage;
        String str;
        char c2;
        int i11;
        int i12;
        boolean z10;
        if (ziVar != null && !this.f40122r1) {
            yp0 yp0Var = this.f40076c0;
            if (yp0Var == null || !yp0Var.f44470f) {
                int i13 = 0;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                i13 = 0;
                String str2 = null;
                ei.r6 r6Var = null;
                if (this.F1) {
                    int i14 = 8;
                    if (i10 != 8 || H()) {
                        if (org.telegram.messenger.zi.B0(ziVar.f26868k) == this.m1) {
                            c2 = 0;
                        } else {
                            c2 = 1;
                        }
                        SparseArray[] sparseArrayArr = this.f40077c1;
                        if (sparseArrayArr[c2].indexOfKey(ziVar.f1()) >= 0) {
                            sparseArrayArr[c2].remove(ziVar.f1());
                            if (!ziVar.s(null, false)) {
                                this.f40079d1--;
                            }
                        } else {
                            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                                sparseArrayArr[c2].put(ziVar.f1(), ziVar);
                                if (!ziVar.s(null, false)) {
                                    this.f40079d1++;
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
                            if (this.f40079d1 == 0) {
                                i11 = 0;
                            } else {
                                i11 = 8;
                            }
                            this.f40111o0.setVisibility(i11);
                            org.telegram.ui.ActionBar.q0 q0Var = this.f40138x0;
                            if (q0Var != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14 && sparseArrayArr[0].size() == 1) {
                                    i12 = 0;
                                } else {
                                    i12 = 8;
                                }
                                q0Var.setVisibility(i12);
                            }
                            org.telegram.ui.ActionBar.q0 q0Var2 = this.f40135w0;
                            if (q0Var2 != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                                    i14 = 0;
                                }
                                q0Var2.setVisibility(i14);
                            }
                            M1();
                        }
                        this.f40083e1 = false;
                        if (view instanceof org.telegram.ui.Cells.g7) {
                            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                            if (sparseArrayArr[c2].indexOfKey(ziVar.f1()) >= 0) {
                                z11 = true;
                            }
                            g7Var.b(z11, true);
                        } else if (view instanceof org.telegram.ui.Cells.o7) {
                            org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                            if (sparseArrayArr[c2].indexOfKey(ziVar.f1()) >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            o7Var.b(0, z10, true);
                        } else if (view instanceof org.telegram.ui.Cells.j7) {
                            org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                            if (sparseArrayArr[c2].indexOfKey(ziVar.f1()) >= 0) {
                                z12 = true;
                            }
                            j7Var.f(z12, true);
                        } else if (view instanceof org.telegram.ui.Cells.f7) {
                            org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
                            if (sparseArrayArr[c2].indexOfKey(ziVar.f1()) >= 0) {
                                z13 = true;
                            }
                            f7Var.e(z13, true);
                        } else if (view instanceof org.telegram.ui.Cells.h2) {
                            org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) view;
                            if (sparseArrayArr[c2].indexOfKey(ziVar.f1()) >= 0) {
                                z14 = true;
                            }
                            h2Var.c(z14, true);
                        } else if (view instanceof org.telegram.ui.Cells.n7) {
                            org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                            if (sparseArrayArr[c2].indexOfKey(ziVar.f1()) >= 0) {
                                z15 = true;
                            }
                            n7Var.i(z15, true);
                        }
                    } else {
                        return;
                    }
                } else {
                    eq0 eq0Var = this.f40131u1;
                    ls0[] ls0VarArr = this.f40136w1;
                    org.telegram.ui.ActionBar.d2 d2Var = this.f40142y1;
                    if (i10 == 0) {
                        ls0 ls0Var = ls0VarArr[i10];
                        int i15 = i3 - ls0Var.f35864m;
                        if (i15 >= 0 && i15 < ls0Var.f35854a.size()) {
                            PhotoViewer.v1().N2(null, d2Var, null);
                            PhotoViewer.v1().e2(ls0VarArr[i10].f35854a, i15, this.m1, this.f40087f1, this.G, eq0Var);
                        }
                    } else if (i10 != 2 && i10 != 4) {
                        if (i10 == 5) {
                            PhotoViewer.v1().N2(null, d2Var, null);
                            int indexOf = ls0VarArr[i10].f35854a.indexOf(ziVar);
                            if (indexOf < 0) {
                                PhotoViewer.v1().e2(org.telegram.messenger.k5.k(ziVar), 0, 0L, 0L, 0L, eq0Var);
                            } else {
                                PhotoViewer.v1().e2(ls0VarArr[i10].f35854a, indexOf, this.m1, this.f40087f1, this.G, eq0Var);
                            }
                        } else if (i10 == 1) {
                            if (view instanceof org.telegram.ui.Cells.g7) {
                                org.telegram.ui.Cells.g7 g7Var2 = (org.telegram.ui.Cells.g7) view;
                                TLRPC.Document F0 = ziVar.F0();
                                if (g7Var2.H) {
                                    if (ziVar.x()) {
                                        PhotoViewer.v1().N2(null, d2Var, null);
                                        int indexOf2 = ls0VarArr[i10].f35854a.indexOf(ziVar);
                                        if (indexOf2 < 0) {
                                            PhotoViewer.v1().e2(org.telegram.messenger.k5.k(ziVar), 0, 0L, 0L, 0L, eq0Var);
                                            return;
                                        }
                                        PhotoViewer.v1().e2(ls0VarArr[i10].f35854a, indexOf2, this.m1, this.f40087f1, this.G, eq0Var);
                                        return;
                                    }
                                    org.telegram.messenger.g0.s2(ziVar, d2Var.getParentActivity(), d2Var);
                                } else if (!g7Var2.G) {
                                    org.telegram.messenger.zi message = g7Var2.getMessage();
                                    message.P = true;
                                    d2Var.getFileLoader().X(F0, message, 0, 0);
                                    g7Var2.f(true);
                                } else {
                                    d2Var.getFileLoader().f(F0);
                                    g7Var2.f(true);
                                }
                            }
                        } else if (i10 == 3) {
                            try {
                                if (org.telegram.messenger.zi.o1(ziVar.f26868k) != null) {
                                    webPage = org.telegram.messenger.zi.o1(ziVar.f26868k).webpage;
                                } else {
                                    webPage = null;
                                }
                                if (webPage != null && !(webPage instanceof TLRPC.TL_webPageEmpty)) {
                                    if (webPage.cached_page != null) {
                                        LaunchActivity launchActivity = LaunchActivity.K1;
                                        if (launchActivity == null || launchActivity.O() == null || LaunchActivity.K1.O().l(ziVar) == null) {
                                            d2Var.createArticleViewer(false).L(ziVar, null, null, null);
                                            return;
                                        }
                                        return;
                                    }
                                    String str3 = webPage.embed_url;
                                    if (str3 != null && str3.length() != 0) {
                                        ut.K0(d2Var, ziVar, this.f40131u1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
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
                                    b1(str);
                                }
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                            }
                        } else if (z0(i10)) {
                            ts0 x12 = x1(i10);
                            if (x12 != null) {
                                r6Var = x12.f38550s;
                            }
                            if (r6Var != null) {
                                ei.r9 orCreateStoryViewer = d2Var.getOrCreateStoryViewer();
                                Context context = getContext();
                                int f12 = ziVar.f1();
                                ei.i7 a10 = ei.i7.a(this.f40108n0[0].h);
                                a10.f10418e = new zw(r6Var, 19);
                                if ((d2Var instanceof ProfileActivity) && ((ProfileActivity) d2Var).f41847s1) {
                                    i13 = org.telegram.messenger.g0.L(68.0f);
                                }
                                a10.f10422s += i13;
                                orCreateStoryViewer.Q(context, f12, r6Var, a10);
                            } else {
                                return;
                            }
                        }
                    } else if (view instanceof org.telegram.ui.Cells.f7) {
                        ((org.telegram.ui.Cells.f7) view).a();
                    }
                }
                E1();
            }
        }
    }

    public final void S() {
        char c2;
        char c10;
        float abs;
        View childAt;
        int R;
        float f10;
        float measuredWidth;
        rr0[] rr0VarArr = this.f40108n0;
        rr0 rr0Var = rr0VarArr[0];
        if (rr0Var != null && rr0VarArr[1] != null) {
            float f11 = 0.0f;
            yp0 yp0Var = this.f40076c0;
            if (yp0Var != null) {
                if (z0(rr0Var.F) && rr0VarArr[0].F != 9) {
                    c2 = 1;
                } else {
                    c2 = 0;
                }
                if (rr0VarArr[1].getVisibility() == 0) {
                    if (z0(rr0VarArr[1].F) && rr0VarArr[1].F != 9) {
                        c10 = 1;
                    } else {
                        c10 = 0;
                    }
                } else {
                    c10 = c2;
                }
                if (c2 == c10) {
                    if (c2 != 0) {
                        abs = 1.0f;
                    } else {
                        abs = 0.0f;
                    }
                    if (c2 != 0) {
                        measuredWidth = 0.0f;
                    } else {
                        measuredWidth = rr0VarArr[0].getMeasuredWidth();
                    }
                    yp0Var.setTranslationX(measuredWidth);
                } else {
                    yp0Var.setTranslationX(rr0VarArr[c2 ^ 1].getTranslationX());
                    abs = 1.0f - (Math.abs(yp0Var.getTranslationX()) / yp0Var.getMeasuredWidth());
                }
                float f12 = 0.0f;
                for (int i3 = 0; i3 < rr0VarArr.length; i3++) {
                    if (rr0VarArr[i3].getVisibility() == 0) {
                        cq0 cq0Var = rr0VarArr[i3].h;
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
                        f12 += Utilities.l(1.0f - (rr0VarArr[i3].getTranslationX() / rr0VarArr[i3].getMeasuredWidth())) * f10;
                    }
                }
                float l10 = Utilities.l(1.0f - ((-f12) / org.telegram.messenger.g0.N(48.0f)));
                float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, l10);
                yp0Var.setAlpha(l10);
                yp0Var.setScaleX(T1);
                yp0Var.setScaleY(T1);
                yp0Var.setTranslationY(this.O1 + f12);
                f11 = abs;
            }
            U();
            if (this.Y1 != f11) {
                this.Y1 = f11;
                invalidate();
            }
        }
    }

    public final boolean S0(org.telegram.messenger.zi ziVar, View view, int i3, boolean z10) {
        yp0 yp0Var;
        char c2;
        int i10;
        int i11;
        final TL_stories.StoryItem storyItem;
        gr0 gr0Var;
        ei.r6 r6Var;
        if (!this.F1) {
            org.telegram.ui.ActionBar.d2 d2Var = this.f40142y1;
            if (d2Var.getParentActivity() != null && ziVar != null && ((yp0Var = this.f40076c0) == null || !yp0Var.f44470f)) {
                org.telegram.messenger.g0.v1(d2Var.getParentActivity().getCurrentFocus());
                long j10 = this.m1;
                int i12 = 8;
                if (z10 && ((I0(getClosestTab()) || getClosestTab() == 8) && !this.F1)) {
                    if (view instanceof org.telegram.ui.Cells.n7) {
                        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                        n7Var.k(n7Var.f29696n, n7Var.f29701r, true);
                    }
                    TL_stories.StoryItem storyItem2 = ziVar.f26871l;
                    if (storyItem2 != null) {
                        HashSet hashSet = new HashSet();
                        ArrayList<Integer> arrayList = storyItem2.albums;
                        if (arrayList != null) {
                            hashSet.addAll(arrayList);
                        }
                        boolean I0 = I0(getClosestTab());
                        f60 I = f60.I(d2Var, view);
                        f60 J = I.J();
                        J.c(2131231240, org.telegram.messenger.bd.M0(2131753756, null), new org.telegram.ui.xp0(I, 27), false);
                        J.k();
                        f60.f(J, getStoriesController().B(j10, true), hashSet, true, new e7((Object) this, (Object) storyItem2, (Object) I, 23), new ai.v1(this, hashSet, storyItem2, I, 11));
                        I.c(2131231765, org.telegram.messenger.bd.M0(2131744815, null), new ai.y3(I, J, 10), false);
                        I.k();
                        I.c(2131232357, org.telegram.messenger.bd.M0(2131744799, null), new bi.q0(this, ziVar, view, i3, 29), false);
                        if (I0) {
                            int u12 = u1(getClosestTab());
                            String w10 = getStoriesController().w(u12, j10);
                            I.c(2131232771, org.telegram.messenger.bd.M0(2131744800, null), new yo0(this, u12, 0), false);
                            storyItem = storyItem2;
                            I.c(2131232329, org.telegram.messenger.bd.M0(2131744801, null), new zo0(this, u12, storyItem, w10, 0), false);
                        } else {
                            storyItem = storyItem2;
                            if (getClosestTab() == 8 && (gr0Var = this.f40086f0) != null && (r6Var = gr0Var.f38550s) != null) {
                                if (r6Var.m(storyItem.f27240id)) {
                                    I.c(2131231002, org.telegram.messenger.bd.M0(2131744797, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            int i13 = r1;
                                            TL_stories.StoryItem storyItem3 = storyItem;
                                            ws0 ws0Var = this;
                                            switch (i13) {
                                                case 0:
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ws0Var.getContext(), ws0Var.I1);
                                                    String M0 = org.telegram.messenger.bd.M0(2131751488, null);
                                                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                                                    s1Var.S = M0;
                                                    s1Var.U = org.telegram.messenger.bd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new hp0(ws0Var, storyItem3));
                                                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new lf0(8));
                                                    s1Var.show();
                                                    s1Var.i();
                                                    return;
                                                case 1:
                                                    ws0Var.getClass();
                                                    ws0Var.d1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f27240id))), false);
                                                    return;
                                                case 2:
                                                    ws0Var.getClass();
                                                    ws0Var.d1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f27240id))), true);
                                                    return;
                                                default:
                                                    ws0.h(ws0Var, storyItem3);
                                                    return;
                                            }
                                        }
                                    }, false);
                                } else {
                                    I.c(2131230998, org.telegram.messenger.bd.M0(2131744802, null), new Runnable() {
                                        @Override
                                        public final void run() {
                                            int i13 = r1;
                                            TL_stories.StoryItem storyItem3 = storyItem;
                                            ws0 ws0Var = this;
                                            switch (i13) {
                                                case 0:
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ws0Var.getContext(), ws0Var.I1);
                                                    String M0 = org.telegram.messenger.bd.M0(2131751488, null);
                                                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                                                    s1Var.S = M0;
                                                    s1Var.U = org.telegram.messenger.bd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new hp0(ws0Var, storyItem3));
                                                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new lf0(8));
                                                    s1Var.show();
                                                    s1Var.i();
                                                    return;
                                                case 1:
                                                    ws0Var.getClass();
                                                    ws0Var.d1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f27240id))), false);
                                                    return;
                                                case 2:
                                                    ws0Var.getClass();
                                                    ws0Var.d1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f27240id))), true);
                                                    return;
                                                default:
                                                    ws0.h(ws0Var, storyItem3);
                                                    return;
                                            }
                                        }
                                    }, false);
                                }
                            }
                            I.c(2131232051, org.telegram.messenger.bd.M0(2131744807, null), new Runnable() {
                                @Override
                                public final void run() {
                                    int i13 = r1;
                                    TL_stories.StoryItem storyItem3 = storyItem;
                                    ws0 ws0Var = this;
                                    switch (i13) {
                                        case 0:
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ws0Var.getContext(), ws0Var.I1);
                                            String M0 = org.telegram.messenger.bd.M0(2131751488, null);
                                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                                            s1Var.S = M0;
                                            s1Var.U = org.telegram.messenger.bd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new hp0(ws0Var, storyItem3));
                                            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new lf0(8));
                                            s1Var.show();
                                            s1Var.i();
                                            return;
                                        case 1:
                                            ws0Var.getClass();
                                            ws0Var.d1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f27240id))), false);
                                            return;
                                        case 2:
                                            ws0Var.getClass();
                                            ws0Var.d1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f27240id))), true);
                                            return;
                                        default:
                                            ws0.h(ws0Var, storyItem3);
                                            return;
                                    }
                                }
                            }, false);
                        }
                        I.c(2131232108, org.telegram.messenger.bd.M0(2131751599, null), new Runnable() {
                            @Override
                            public final void run() {
                                int i13 = r1;
                                TL_stories.StoryItem storyItem3 = storyItem;
                                ws0 ws0Var = this;
                                switch (i13) {
                                    case 0:
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ws0Var.getContext(), ws0Var.I1);
                                        String M0 = org.telegram.messenger.bd.M0(2131751488, null);
                                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                                        s1Var.S = M0;
                                        s1Var.U = org.telegram.messenger.bd.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new hp0(ws0Var, storyItem3));
                                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new lf0(8));
                                        s1Var.show();
                                        s1Var.i();
                                        return;
                                    case 1:
                                        ws0Var.getClass();
                                        ws0Var.d1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f27240id))), false);
                                        return;
                                    case 2:
                                        ws0Var.getClass();
                                        ws0Var.d1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.f27240id))), true);
                                        return;
                                    default:
                                        ws0.h(ws0Var, storyItem3);
                                        return;
                                }
                            }
                        }, true);
                        I.f33729i = 3;
                        I.f33749u = true;
                        I.v = true;
                        I.L = true;
                        I.M = 3;
                        Point point = org.telegram.messenger.g0.f22608q;
                        int min = Math.min((int) (Math.min(point.x, point.y) * 0.6777f), (int) (((Math.max(point.x, point.y) * 0.4333f) * 3.0f) / 4.0f));
                        I.N = min;
                        I.O = (min * 4) / 3;
                        I.f33748t = true;
                        I.P = true;
                        I.W = true;
                        I.Z();
                        return true;
                    }
                } else {
                    if (org.telegram.messenger.zi.B0(ziVar.f26868k) == j10) {
                        c2 = 0;
                    } else {
                        c2 = 1;
                    }
                    SparseArray[] sparseArrayArr = this.f40077c1;
                    sparseArrayArr[c2].put(ziVar.f1(), ziVar);
                    if (!ziVar.s(null, false)) {
                        this.f40079d1++;
                    }
                    if (this.f40079d1 == 0) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    this.f40111o0.setVisibility(i10);
                    org.telegram.ui.ActionBar.q0 q0Var = this.f40138x0;
                    if (q0Var != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i11 = 0;
                        } else {
                            i11 = 8;
                        }
                        q0Var.setVisibility(i11);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var2 = this.f40135w0;
                    if (q0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i12 = 0;
                        }
                        q0Var2.setVisibility(i12);
                    }
                    m1(1, false);
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
                    this.f40083e1 = false;
                    if (view instanceof org.telegram.ui.Cells.g7) {
                        ((org.telegram.ui.Cells.g7) view).b(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.o7) {
                        ((org.telegram.ui.Cells.o7) view).b(i3, true, true);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ws0.T():boolean");
    }

    public boolean T0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return false;
    }

    public final void U() {
        pr prVar = this.S0;
        if (prVar != null) {
            prVar.setTranslationY(this.O1);
        }
    }

    public final void U0(float f10) {
        rr0 rr0Var;
        int i3;
        int i10;
        rr0 rr0Var2;
        int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        rr0[] rr0VarArr = this.f40108n0;
        if (i11 != 0 || rr0VarArr[1].getVisibility() == 0) {
            if (this.k1) {
                rr0VarArr[0].setTranslationX((-f10) * rr0Var2.getMeasuredWidth());
                rr0VarArr[1].setTranslationX(rr0VarArr[0].getMeasuredWidth() - (rr0VarArr[0].getMeasuredWidth() * f10));
            } else {
                rr0VarArr[0].setTranslationX(rr0Var.getMeasuredWidth() * f10);
                rr0VarArr[1].setTranslationX((rr0VarArr[0].getMeasuredWidth() * f10) - rr0VarArr[0].getMeasuredWidth());
            }
            X0(getTabProgress());
            float k02 = k0(f10);
            this.f40125s0 = k02;
            int i12 = 4;
            if (k02 != 0.0f && I() && !A0()) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            this.f40130u0.setVisibility(i3);
            org.telegram.ui.ActionBar.q0 q0Var = this.f40117q0;
            if (q0Var != null && !I()) {
                if (H0()) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                setSearchItemVisibility(i10);
                this.f40121r0 = 0.0f;
            } else {
                this.f40121r0 = l0(f10);
                L1();
            }
            G1(false);
            if (i11 == 0) {
                rr0 rr0Var3 = rr0VarArr[0];
                rr0VarArr[0] = rr0VarArr[1];
                rr0VarArr[1] = rr0Var3;
                rr0Var3.setVisibility(8);
                if (q0Var != null && this.A0 == 2) {
                    if (H0()) {
                        i12 = 8;
                    }
                    setSearchItemVisibility(i12);
                }
                this.A0 = 0;
                s1();
            }
        }
    }

    public final boolean V(boolean z10) {
        SparseArray[] sparseArrayArr;
        if (!this.F1) {
            return false;
        }
        int i3 = 1;
        while (true) {
            sparseArrayArr = this.f40077c1;
            if (i3 < 0) {
                break;
            }
            sparseArrayArr[i3].clear();
            i3--;
        }
        this.f40079d1 = 0;
        O0(sparseArrayArr[0]);
        tp0 tp0Var = this.f40068a0;
        if (tp0Var != null) {
            tp0Var.h();
            tp0Var.j();
        }
        o1(false);
        J1(z10);
        hs0 hs0Var = this.U;
        if (hs0Var != null) {
            hs0Var.f34498x.clear();
        }
        return true;
    }

    public final org.telegram.ui.ActionBar.q0 W(Context context, int i3, int i10, String str) {
        org.telegram.ui.ActionBar.q0 q0Var;
        org.telegram.ui.ActionBar.y4 y4Var = this.I;
        if (y4Var != null) {
            q0Var = y4Var.l().b(i3, i10);
        } else {
            int i11 = org.telegram.ui.ActionBar.k6.f28292z8;
            int s02 = s0(i11);
            int i12 = org.telegram.ui.ActionBar.k6.f28275y8;
            org.telegram.ui.ActionBar.q0 q0Var2 = new org.telegram.ui.ActionBar.q0(context, null, s02, s0(i12), false, null);
            q0Var2.setIcon(i10);
            q0Var2.setDuplicateParentStateEnabled(false);
            this.E0.addView(q0Var2, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
            this.Q0.add(q0Var2);
            fh0 iconView = q0Var2.getIconView();
            org.telegram.ui.ActionBar.e6 e6Var = this.I1;
            if (iconView != null) {
                org.telegram.ui.ActionBar.r6.t(q0Var2.getIconView(), i12, e6Var, PorterDuff.Mode.SRC_IN);
            }
            if (q0Var2.getBackground() != null) {
                Drawable background = q0Var2.getBackground();
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
                q0Var2.setBackground(background);
                org.telegram.ui.ActionBar.r6.k(q0Var2, background, null, N, e6Var);
            }
            q0Var = q0Var2;
        }
        q0Var.setContentDescription(str);
        q0Var.setOnClickListener(new bi.q(this, i3, 18));
        return q0Var;
    }

    public void W0() {
        boolean z10;
        int i3;
        boolean z11;
        boolean z12;
        boolean z13;
        if (!H0() && !A0()) {
            z10 = false;
        } else {
            z10 = true;
        }
        rs0 rs0Var = this.f40092h0.f38552x;
        if (rs0Var != null) {
            if (z10 && getClosestTab() == 9) {
                z13 = true;
            } else {
                z13 = false;
            }
            rs0Var.b(z13);
        }
        rs0 rs0Var2 = this.f40086f0.f38552x;
        if (rs0Var2 != null) {
            if (z10 && getClosestTab() == 8) {
                z12 = true;
            } else {
                z12 = false;
            }
            rs0Var2.b(z12);
        }
        for (vs0 vs0Var : this.f40106m2.values()) {
            us0 us0Var = vs0Var.f39782c;
            if (us0Var.f38550s != null) {
                rs0 rs0Var3 = us0Var.f38552x;
                if (z10 && getClosestTab() == vs0Var.f39780a) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                rs0Var3.b(z11);
            }
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.f40117q0;
        if (q0Var != null) {
            qq0 qq0Var = this.M0;
            if (qq0Var != null && qq0Var.a() && getSelectedTab() == 11) {
                i3 = 2131745878;
            } else {
                i3 = 2131745846;
            }
            q0Var.setSearchFieldHint(org.telegram.messenger.bd.M0(i3, null));
        }
        S();
        R(true, true);
    }

    public void X0(float f10) {
        P0();
    }

    public boolean Y() {
        return this instanceof k20;
    }

    public final void Y0(org.telegram.ui.ActionBar.d2 d2Var, long j10, int i3) {
        new org.telegram.ui.s11(d2Var, j10, this.f40115p1[1], new ci.q3(this, j10, i3)).show();
    }

    public final boolean Z(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x10 = (-view.getX()) - getX();
        rr0[] rr0VarArr = this.f40108n0;
        motionEvent.offsetLocation(x10 - rr0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - rr0VarArr[0].getY()) - rr0VarArr[0].h.getFastScroll().getY());
        return rr0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public final void Z0(org.telegram.ui.ActionBar.d2 d2Var, long j10, int i3) {
        t4.u0(d2Var, org.telegram.messenger.bd.M0(2131751599, null), org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131744805, getStoriesController().w(i3, j10))), org.telegram.messenger.bd.M0(2131751599, null), true, new ci.i9(this, j10, i3, 8));
    }

    public final boolean a0(int i3) {
        ls0[] ls0VarArr = this.f40139x1.f36939n;
        if (ls0VarArr == null) {
            return false;
        }
        ls0[] ls0VarArr2 = this.f40136w1;
        if (i3 == 0) {
            ls0 ls0Var = ls0VarArr2[i3];
            if (!ls0Var.h) {
                int[] iArr = ls0Var.f35858f;
                int[] iArr2 = ls0VarArr[i3].f35858f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = ls0VarArr2[i3].f35858f;
            int[] iArr4 = ls0VarArr[i3].f35858f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        ls0VarArr2[i3].f35854a.addAll(ls0VarArr[i3].f35854a);
        ls0VarArr2[i3].f35856c.addAll(ls0VarArr[i3].f35856c);
        for (Map.Entry entry : ls0VarArr[i3].d.entrySet()) {
            ls0VarArr2[i3].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i10 = 0; i10 < 2; i10++) {
            ls0VarArr2[i3].f35855b[i10] = ls0VarArr[i3].f35855b[i10].clone();
            ls0 ls0Var2 = ls0VarArr2[i3];
            int[] iArr5 = ls0Var2.f35861j;
            ls0 ls0Var3 = ls0VarArr[i3];
            iArr5[i10] = ls0Var3.f35861j[i10];
            ls0Var2.f35860i[i10] = ls0Var3.f35860i[i10];
        }
        ls0VarArr2[i3].f35857e.addAll(ls0VarArr[i3].f35857e);
        return !ls0VarArr[i3].f35854a.isEmpty();
    }

    public final void a1(org.telegram.ui.ActionBar.d2 d2Var, long j10, int i3) {
        String w10 = getStoriesController().w(i3, j10);
        Context context = d2Var.getContext();
        org.telegram.ui.ActionBar.e6 resourceProvider = d2Var.getResourceProvider();
        b4.o oVar = new b4.o(this, j10, i3, 7);
        Pattern pattern = t4.f38241a;
        t4.Q(context, d2Var, org.telegram.messenger.bd.M0(2131744792, null), org.telegram.messenger.bd.M0(2131744791, null), org.telegram.messenger.bd.M0(2131744790, null), w10, 12, org.telegram.messenger.bd.M0(2131746286, null), resourceProvider, oVar);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.zi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27878d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28265xi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.yi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28290z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.pj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28246wi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28273y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28043m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27981ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27899e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27918f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28255x7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28178t7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28235w7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28014kd));
    }

    public final boolean b0(int r27, org.telegram.ui.Components.vr0 r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ws0.b0(int, org.telegram.ui.Components.vr0):boolean");
    }

    public final void b1(String str) {
        boolean J3 = org.telegram.messenger.g0.J3(str);
        org.telegram.ui.ActionBar.d2 d2Var = this.f40142y1;
        if (J3) {
            t4.p0(d2Var, str, true, true);
        } else {
            sf.c.t(d2Var.getParentActivity(), str);
        }
    }

    public final void c0(int i3, tj0 tj0Var, boolean z10) {
        ArrayList arrayList = this.f40136w1[i3].f35857e;
        int L0 = ((u4.b0) tj0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            wr0 wr0Var = null;
            if (arrayList != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    } else if (L0 <= ((wr0) arrayList.get(i10)).f40061b) {
                        wr0Var = (wr0) arrayList.get(i10);
                        break;
                    } else {
                        i10++;
                    }
                }
                if (wr0Var == null) {
                    wr0Var = (wr0) k2.p1.h(1, arrayList);
                }
            }
            if (wr0Var != null) {
                K0(i3, wr0Var.d, wr0Var.f40061b + 1, z10);
            }
        }
    }

    public int c1() {
        return -1;
    }

    public final void d0() {
        rr0[] rr0VarArr;
        rr0 rr0Var;
        boolean z10;
        int i3;
        u4.h0 adapter;
        if (this.f40122r1) {
            int i10 = 0;
            while (true) {
                rr0VarArr = this.f40108n0;
                if (i10 < rr0VarArr.length) {
                    rr0Var = rr0VarArr[i10];
                    if (rr0Var.F == this.f40126s1) {
                        break;
                    }
                    i10++;
                } else {
                    rr0Var = null;
                    break;
                }
            }
            if (rr0Var != null) {
                boolean z02 = z0(rr0Var.F);
                float f10 = this.f40118q1;
                float f11 = 1.0f;
                int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                ls0[] ls0VarArr = this.f40136w1;
                if (i11 == 0) {
                    this.f40122r1 = false;
                    int i12 = this.f40129t1;
                    int[] iArr = this.f40115p1;
                    iArr[z02 ? 1 : 0] = i12;
                    if (!z02) {
                        org.telegram.messenger.az.B(i12);
                    } else if (m0(rr0Var.F) >= 5) {
                        org.telegram.messenger.az.F(this.f40129t1);
                    }
                    for (int i13 = 0; i13 < rr0VarArr.length; i13++) {
                        rr0 rr0Var2 = rr0VarArr[i13];
                        if (rr0Var2 != null && rr0Var2.h != null && (((i3 = rr0Var2.F) == 0 || z0(i3)) && (adapter = rr0VarArr[i13].h.getAdapter()) != null)) {
                            int b10 = adapter.b();
                            if (i13 == 0) {
                                ls0VarArr[0].g(false);
                            }
                            rr0VarArr[i13].f37787n.setVisibility(8);
                            rr0VarArr[i13].f37791x.y1(iArr[z02 ? 1 : 0]);
                            rr0VarArr[i13].h.a0();
                            rr0VarArr[i13].h.invalidate();
                            if (adapter.b() == b10) {
                                org.telegram.messenger.g0.b4(rr0VarArr[i13].h);
                            } else {
                                adapter.f();
                            }
                        }
                    }
                    if (this.f40124s >= 0) {
                        for (int i14 = 0; i14 < rr0VarArr.length; i14++) {
                            rr0 rr0Var3 = rr0VarArr[i14];
                            if (rr0Var3.F == this.f40126s1) {
                                View m10 = rr0Var3.f37788r.m(this.f40124s);
                                if (m10 != null) {
                                    this.f40134w = m10.getTop();
                                }
                                rr0 rr0Var4 = rr0VarArr[i14];
                                rr0Var4.f37791x.h1(this.f40124s, (-rr0Var4.h.getPaddingTop()) + this.f40134w);
                            }
                        }
                        return;
                    }
                    h1();
                } else if (f10 == 0.0f) {
                    this.f40122r1 = false;
                    if (this.f40126s1 == 0) {
                        ls0VarArr[0].g(false);
                    }
                    rr0Var.f37787n.setVisibility(8);
                    rr0Var.h.invalidate();
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
                    ofFloat.addUpdateListener(new sq0(this, rr0Var, 0));
                    ofFloat.addListener(new org.telegram.ui.fi(this, z10, z02 ? 1 : 0, rr0Var));
                    ofFloat.setInterpolator(xq.f40452f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                }
            }
        }
    }

    public final void d1(ArrayList arrayList, boolean z10) {
        boolean z11;
        boolean z12;
        gr0 gr0Var = this.f40086f0;
        if (gr0Var != null && gr0Var.f38550s != null) {
            org.telegram.ui.ActionBar.d2 d2Var = this.f40142y1;
            if (z10 && arrayList.size() > d2Var.getMessagesController().N5) {
                org.telegram.messenger.camera.q.s(org.telegram.messenger.bd.G(d2Var.getMessagesController().N5, "StoriesPinLimit", new Object[0]), fc.a0(d2Var), 2131623981, 36);
                return;
            }
            ei.r6 r6Var = gr0Var.f38550s;
            int i3 = r6Var.f10872c;
            ArrayList arrayList2 = r6Var.f10875g;
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
            if (arrayList3.size() > org.telegram.messenger.hp.s1(i3).N5) {
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
                    r6Var.d(true);
                    TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                    tL_togglePinnedToTop.f27253id.addAll(arrayList2);
                    tL_togglePinnedToTop.peer = org.telegram.messenger.hp.s1(i3).j1(r6Var.d);
                    ConnectionsManager.getInstance(i3).sendRequest(tL_togglePinnedToTop, new ei.u5(2));
                }
                z13 = z11;
            }
            if (z13) {
                org.telegram.messenger.camera.q.s(org.telegram.messenger.bd.G(d2Var.getMessagesController().N5, "StoriesPinLimit", new Object[0]), fc.a0(d2Var), 2131623981, 36);
            } else if (z10) {
                fc.a0(d2Var).I(2131624054, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(arrayList.size(), "StoriesPinned", new Object[0])), org.telegram.messenger.bd.G(arrayList.size(), "StoriesPinnedText", new Object[0])).j();
            } else {
                org.telegram.messenger.camera.q.s(org.telegram.messenger.bd.G(arrayList.size(), "StoriesUnpinned", new Object[0]), fc.a0(d2Var), 2131624060, 36);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r42, int r43, java.lang.Object... r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ws0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        tq0 tq0Var = this.L0;
        if (tq0Var != null) {
            canvas.save();
            canvas.translate(tq0Var.getX(), tq0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        oq0 oq0Var = this.U0;
        if (oq0Var != null) {
            int i3 = oq0Var.V;
            if ((i3 == 3 || i3 == 1) && this.S0 == null) {
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int i3;
        if (this.c2 && (view instanceof rr0) && this.f40091g2 < this.f40084e2) {
            canvas.save();
            canvas.clipRect(0, -this.f40091g2, getWidth(), getHeight() + this.f40088f2);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        } else if (view == this.U0 && this.S0 == null) {
            canvas.save();
            rr0[] rr0VarArr = this.f40108n0;
            float top = rr0VarArr[0].getTop();
            yp0 yp0Var = this.f40076c0;
            if (yp0Var != null && ((i3 = rr0VarArr[0].F) == 8 || I0(i3))) {
                top -= yp0Var.getVisualHeight();
            }
            canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + org.telegram.messenger.g0.L(12.0f));
            boolean drawChild2 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild2;
        } else {
            return super.drawChild(canvas, view, j10);
        }
    }

    public final void e0(int i3) {
        ((WindowManager) org.telegram.messenger.t0.f25457b.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i3 == 0) {
            if (!org.telegram.messenger.g0.Q1() && org.telegram.messenger.t0.f25457b.getResources().getConfiguration().orientation == 2) {
                this.D0.setTextSize(18);
            } else {
                this.D0.setTextSize(20);
            }
        }
        if (i3 == 0) {
            this.K.f();
        }
    }

    public final boolean e1(MotionEvent motionEvent, boolean z10) {
        int i3;
        rr0 rr0Var;
        tp0 tp0Var;
        int i10;
        int i11;
        int closestTab = getClosestTab();
        tq0 tq0Var = this.L0;
        SparseIntArray sparseIntArray = tq0Var.P;
        int i12 = tq0Var.f31610n;
        int i13 = -1;
        if (z10) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        int i14 = sparseIntArray.get(i12 + i3, -1);
        yp0 yp0Var = this.f40076c0;
        if (yp0Var != null) {
            if (!I0(closestTab) && closestTab != 8) {
                if (I0(i14) || i14 == 8) {
                    i13 = yp0Var.getCurrentAlbumId();
                }
            } else {
                m61 m61Var = yp0Var.f44467b;
                SparseIntArray sparseIntArray2 = m61Var.f36031c0;
                int i15 = m61Var.G;
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
                i14 = v1(i13).f39780a;
            }
        }
        if (i14 >= 0) {
            if (this.f40117q0 != null && !I()) {
                if (H0()) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                setSearchItemVisibility(i10);
                this.f40121r0 = 0.0f;
            } else {
                this.f40121r0 = l0(0.0f);
                K1(0.0f);
            }
            if ((!this.Y0 || getSelectedTab() != 11) && (!H() || !this.F1 || (getClosestTab() != 8 && !I0(getClosestTab())))) {
                rr0[] rr0VarArr = this.f40108n0;
                rr0 rr0Var2 = rr0VarArr[0];
                if (rr0Var2 != null && rr0Var2.F == 13 && (tp0Var = this.f40068a0) != null) {
                    ai.q3 q3Var = tp0Var.f11636n;
                    if (!z10) {
                    }
                }
                rr0 rr0Var3 = rr0VarArr[0];
                vp0 vp0Var = this.f40072b0;
                if (rr0Var3 != null && rr0Var3.F == 14 && vp0Var != null) {
                    ai.q3 q3Var2 = vp0Var.h;
                    if (!z10) {
                    }
                }
                if ((!this.F1 || (rr0Var = rr0VarArr[0]) == null || rr0Var.F != 13) && ((vp0Var == null || !vp0Var.g()) && (yp0Var == null || !yp0Var.f44470f))) {
                    G1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    w0();
                    this.B1 = false;
                    this.A1 = true;
                    this.C1 = (int) motionEvent.getX();
                    setHeaderEnabled(false);
                    tq0Var.setEnabled(false);
                    rr0 rr0Var4 = rr0VarArr[1];
                    rr0Var4.F = i14;
                    rr0Var4.setVisibility(0);
                    this.k1 = z10;
                    z1(true);
                    if (z10) {
                        rr0VarArr[1].setTranslationX(rr0VarArr[0].getMeasuredWidth());
                    } else {
                        rr0VarArr[1].setTranslationX(-rr0VarArr[0].getMeasuredWidth());
                    }
                    X0(getTabProgress());
                    return true;
                }
            }
        }
        return false;
    }

    public final String f0(boolean z10) {
        int i3;
        int i10;
        TLRPC.MessageMedia messageMedia;
        tp0 tp0Var;
        if (!B0()) {
            return org.telegram.messenger.bd.M0(2131753014, null);
        }
        if (z10 && (tp0Var = this.f40068a0) != null) {
            return tp0Var.getBotPreviewsSubtitle();
        }
        gr0 gr0Var = this.f40086f0;
        if (gr0Var != null && gr0Var.f38550s != null) {
            i3 = 0;
            i10 = 0;
            for (int i11 = 0; i11 < gr0Var.f38550s.f10876i.size(); i11++) {
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) gr0Var.f38550s.f10876i.get(i11);
                TL_stories.StoryItem storyItem = ziVar.f26871l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    if (org.telegram.messenger.zi.L4(messageMedia.document)) {
                        i10++;
                    } else if (ziVar.f26871l.media.photo != null) {
                        i3++;
                    }
                }
            }
        } else {
            i3 = 0;
            i10 = 0;
        }
        if (i3 == 0 && i10 == 0) {
            return org.telegram.messenger.bd.M0(2131753014, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (i3 > 0) {
            sb2.append(org.telegram.messenger.bd.G(i3, "Images", new Object[0]));
        }
        if (i10 > 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(org.telegram.messenger.bd.G(i10, "Videos", new Object[0]));
        }
        return sb2.toString();
    }

    public final rr0 g0(int i3) {
        int i10 = 0;
        while (true) {
            rr0[] rr0VarArr = this.f40108n0;
            if (i10 < rr0VarArr.length) {
                rr0 rr0Var = rr0VarArr[i10];
                if (rr0Var != null && rr0Var.F == i3) {
                    return rr0Var;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final void g1(u4.h0 h0Var) {
        if (h0Var instanceof qs0) {
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
            fs0 fs0Var = this.Q;
            if (h0Var == fs0Var) {
                fs0Var.f33863r = null;
            }
        }
    }

    public SparseArray<org.telegram.messenger.zi> getActionModeSelected() {
        return this.f40077c1[0];
    }

    public float getBottomButtonStoriesVisibility() {
        rr0 rr0Var;
        rr0 rr0Var2;
        boolean z10;
        boolean z11;
        ei.r6 r6Var;
        ei.r6 r6Var2;
        float f10 = 1.0f;
        rr0[] rr0VarArr = this.f40108n0;
        if (rr0VarArr == null || (rr0Var = rr0VarArr[0]) == null || (rr0Var2 = rr0VarArr[1]) == null || rr0Var.f37790w == null || rr0Var2.f37790w == null) {
            return 1.0f;
        }
        int i3 = rr0Var.F;
        int i10 = rr0Var2.F;
        if (!I0(i3) && i3 != 8) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!I0(i10) && i10 != 8) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z10 && !z11) {
            return 1.0f;
        }
        float visibilityFactor = 1.0f - rr0VarArr[0].f37790w.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - rr0VarArr[1].f37790w.getVisibilityFactor();
        ts0 x12 = x1(rr0VarArr[0].F);
        if (i3 == 8 || (x12 != null && (r6Var2 = x12.f38550s) != null && r6Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        ts0 x13 = x1(i10);
        if (i10 != 8 && (x13 == null || (r6Var = x13.f38550s) == null || r6Var.g() <= 0)) {
            f10 = visibilityFactor2;
        }
        if (!z10) {
            visibilityFactor = f10;
        }
        if (!z11) {
            f10 = visibilityFactor;
        }
        return org.telegram.messenger.g0.T1(visibilityFactor, f10, Math.abs(rr0VarArr[0].getTranslationX() / rr0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        rr0[] rr0VarArr = this.f40108n0;
        rr0 rr0Var = rr0VarArr[1];
        if (rr0Var != null && rr0Var.getVisibility() == 0) {
            if (this.f40099j1 && !this.f40104l1) {
                return rr0VarArr[1].F;
            }
            if (Math.abs(rr0VarArr[1].getTranslationX()) < rr0VarArr[1].getMeasuredWidth() / 2.0f) {
                return rr0VarArr[1].F;
            }
        }
        return getSelectedTab();
    }

    public tj0 getCurrentListView() {
        er0 er0Var;
        rr0 rr0Var = this.f40108n0[0];
        int i3 = rr0Var.F;
        if (i3 == 13) {
            return this.f40068a0.getCurrentListView();
        }
        if (i3 == 14) {
            return this.f40072b0.getCurrentListView();
        }
        if (i3 == 12 && (er0Var = this.W) != null) {
            return er0Var.f52363a.A0;
        }
        return rr0Var.h;
    }

    public int getInitialTab() {
        return 0;
    }

    public int getPhotosVideosTypeFilter() {
        return this.f40136w1[0].f35868q;
    }

    public TextView getSaveItem() {
        return this.f40128t0;
    }

    public org.telegram.ui.ActionBar.q0 getSearchItem() {
        return this.f40117q0;
    }

    public fh0 getSearchOptionsItem() {
        return this.f40132v0;
    }

    public int getSelectedTab() {
        int currentTabId = this.L0.getCurrentTabId();
        yp0 yp0Var = this.f40076c0;
        if (yp0Var != null && currentTabId == 8) {
            int currentAlbumId = yp0Var.getCurrentAlbumId();
            if (currentAlbumId == 0) {
                return 8;
            }
            if (currentAlbumId > 0) {
                return v1(currentAlbumId).f39780a;
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
        int i3 = 0;
        while (true) {
            rr0[] rr0VarArr = this.f40108n0;
            if (i3 < rr0VarArr.length) {
                rr0 rr0Var = rr0VarArr[i3];
                if (rr0Var != null) {
                    f10 = ((1.0f - Math.abs(rr0Var.getTranslationX() / getWidth())) * rr0Var.F) + f10;
                }
                i3++;
            } else {
                return f10;
            }
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.t6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.t6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.D0, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28290z6));
        int i3 = org.telegram.ui.ActionBar.k6.f28292z8;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40111o0, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        org.telegram.ui.ActionBar.q0 q0Var = this.f40138x0;
        if (q0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        }
        org.telegram.ui.ActionBar.q0 q0Var2 = this.f40135w0;
        if (q0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        }
        Drawable[] drawableArr = {this.G0};
        int i10 = org.telegram.ui.ActionBar.k6.f28275y8;
        ImageView imageView = this.F0;
        arrayList.add(new org.telegram.ui.ActionBar.t6(imageView, 8, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.E0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27878d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.L0, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28207ui));
        tq0 tq0Var = this.L0;
        arrayList.add(new org.telegram.ui.ActionBar.t6(tq0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28188ti));
        arrayList.add(new org.telegram.ui.ActionBar.t6(tq0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28169si));
        arrayList.add(new org.telegram.ui.ActionBar.t6(tq0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28226vi));
        oq0 oq0Var = this.U0;
        if (oq0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(oq0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28215v7));
            arrayList.add(new org.telegram.ui.ActionBar.t6(oq0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28197u7));
            arrayList.add(new org.telegram.ui.ActionBar.t6(oq0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28274y7));
            arrayList.add(new org.telegram.ui.ActionBar.t6(oq0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.A7));
        }
        final int i11 = 0;
        while (true) {
            rr0[] rr0VarArr = this.f40108n0;
            if (i11 < rr0VarArr.length) {
                org.telegram.ui.ActionBar.s6 s6Var = new org.telegram.ui.ActionBar.s6() {
                    @Override
                    public final void b() {
                        rr0[] rr0VarArr2 = ws0.this.f40108n0;
                        int i12 = i11;
                        cq0 cq0Var = rr0VarArr2[i12].h;
                        if (cq0Var != null) {
                            int childCount = cq0Var.getChildCount();
                            for (int i13 = 0; i13 < childCount; i13++) {
                                View childAt = rr0VarArr2[i12].h.getChildAt(i13);
                                if (childAt instanceof org.telegram.ui.Cells.o7) {
                                    org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) childAt;
                                    for (int i14 = 0; i14 < 6; i14++) {
                                        o7Var.f29750a[i14].f29588e.invalidate();
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
                arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28160s8));
                arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27972i6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].f37790w, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27862c7));
                int i12 = org.telegram.ui.ActionBar.k6.f27955h6;
                arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
                arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.f28062n6));
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.O7));
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.P7));
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.Q7));
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.R7));
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.S7));
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.T7));
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.U7));
                int i13 = org.telegram.ui.ActionBar.k6.f27973i7;
                arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, 8192, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i13));
                int i14 = org.telegram.ui.ActionBar.k6.f28008k7;
                arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, 16384, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, 8, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.nj));
                arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
                arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, 8192, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i13));
                arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, 16384, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, 8192, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i13));
                arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, 16384, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, 8192, new Class[]{org.telegram.ui.Cells.o7.class}, (Paint) null, (Drawable[]) null, s6Var, i13));
                arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, 16384, new Class[]{org.telegram.ui.Cells.o7.class}, (Paint) null, (Drawable[]) null, s6Var, i14));
                arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, 0, new Class[]{org.telegram.ui.Cells.h2.class}, new String[]{"backgroundPaint"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.zi));
                arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, 8192, new Class[]{org.telegram.ui.Cells.h2.class}, (Paint) null, (Drawable[]) null, s6Var, i13));
                arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, 16384, new Class[]{org.telegram.ui.Cells.h2.class}, (Paint) null, (Drawable[]) null, s6Var, i14));
                arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].h, 0, (Class[]) null, (Paint) null, new Drawable[]{this.B0}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27843b7));
                arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].f37790w.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(rr0VarArr[i11].f37790w.f41128e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28273y6));
                i11++;
            } else {
                return arrayList;
            }
        }
    }

    public int getTopPanelShift() {
        return this.f40116p2;
    }

    public final int h0(int i3, int i10, boolean z10) {
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
        return Utilities.j(i13, 9, (this.f40109n1 && i3 == 1) ? 2 : 2);
    }

    public final void h1() {
        int i3;
        int i10 = 0;
        while (true) {
            rr0[] rr0VarArr = this.f40108n0;
            if (i10 < rr0VarArr.length) {
                cq0 cq0Var = rr0VarArr[i10].h;
                if (cq0Var != null) {
                    int i11 = 0;
                    int i12 = 0;
                    for (int i13 = 0; i13 < cq0Var.getChildCount(); i13++) {
                        View childAt = cq0Var.getChildAt(i13);
                        if (childAt instanceof org.telegram.ui.Cells.n7) {
                            org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) childAt;
                            int messageId = n7Var.getMessageId();
                            i12 = n7Var.getTop();
                            i11 = messageId;
                        }
                        if (childAt instanceof org.telegram.ui.Cells.g7) {
                            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) childAt;
                            int f12 = g7Var.getMessage().f1();
                            i12 = g7Var.getTop();
                            i11 = f12;
                        }
                        if (childAt instanceof org.telegram.ui.Cells.f7) {
                            org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) childAt;
                            i11 = f7Var.getMessage().f1();
                            i12 = f7Var.getTop();
                        }
                        if (i11 != 0) {
                            break;
                        }
                    }
                    if (i11 != 0) {
                        int i14 = rr0VarArr[i10].F;
                        int i15 = -1;
                        if (z0(i14)) {
                            ts0 x12 = x1(i14);
                            if (x12 != null && x12.f38550s != null) {
                                int i16 = 0;
                                while (true) {
                                    if (i16 >= x12.f38550s.f10876i.size()) {
                                        break;
                                    } else if (i11 == ((org.telegram.messenger.zi) x12.f38550s.f10876i.get(i16)).f1()) {
                                        i15 = i16;
                                        break;
                                    } else {
                                        i16++;
                                    }
                                }
                            }
                            i3 = i15;
                        } else if (i14 >= 0) {
                            ls0[] ls0VarArr = this.f40136w1;
                            if (i14 < ls0VarArr.length) {
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= ls0VarArr[i14].f35854a.size()) {
                                        break;
                                    } else if (i11 == ((org.telegram.messenger.zi) ls0VarArr[i14].f35854a.get(i17)).f1()) {
                                        i15 = i17;
                                        break;
                                    } else {
                                        i17++;
                                    }
                                }
                                i3 = ls0VarArr[i14].f35864m + i15;
                            }
                        }
                        if (i15 >= 0) {
                            ((u4.b0) cq0Var.getLayoutManager()).h1(i3, (-rr0VarArr[i10].h.getPaddingTop()) + i12);
                            if (this.f40122r1) {
                                rr0 rr0Var = rr0VarArr[i10];
                                rr0Var.f37788r.h1(i3, (-rr0Var.h.getPaddingTop()) + i12);
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

    public final int i0(boolean z10) {
        int i3;
        int i10 = this.f40074b2 + this.f40088f2;
        if (z10) {
            i3 = org.telegram.messenger.g0.L(52.0f);
        } else {
            i3 = 0;
        }
        return i10 + i3;
    }

    public final void i1(int i3) {
        tq0 tq0Var;
        if (!this.P1 && (tq0Var = this.L0) != null) {
            tq0Var.g(null, i3, tq0Var.Q.get(i3));
        }
    }

    public final int j0(int i3) {
        int i10;
        int n02 = n0(i3) + org.telegram.messenger.g0.L(54.0f) + this.f40080d2 + this.f40084e2 + this.f40116p2;
        if (i3 == 9) {
            i10 = org.telegram.messenger.g0.L(64.0f);
        } else {
            i10 = 0;
        }
        return n02 + i10;
    }

    public final void j1(float f10, int i3) {
        int i10;
        tq0 tq0Var = this.L0;
        if (tq0Var != null) {
            if (I0(i3)) {
                i10 = 8;
            } else {
                i10 = i3;
            }
            tq0Var.i(f10, i10);
        }
        yp0 yp0Var = this.f40076c0;
        if (yp0Var != null) {
            m61 m61Var = yp0Var.f44467b;
            if (I0(i3)) {
                m61Var.f(f10, u1(i3));
            } else if (i3 == 8) {
                m61Var.f(f10, 0);
            }
        }
    }

    public final float k0(float f10) {
        float f11 = 0.0f;
        if (A0()) {
            return 0.0f;
        }
        rr0[] rr0VarArr = this.f40108n0;
        rr0 rr0Var = rr0VarArr[1];
        if (rr0Var != null && v0(rr0Var.F)) {
            f11 = 0.0f + f10;
        }
        rr0 rr0Var2 = rr0VarArr[0];
        if (rr0Var2 != null && v0(rr0Var2.F)) {
            return (1.0f - f10) + f11;
        }
        return f11;
    }

    public final void k1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i3 = 0;
        while (true) {
            rr0[] rr0VarArr = this.f40108n0;
            if (i3 < rr0VarArr.length) {
                rr0 rr0Var = rr0VarArr[i3];
                if (rr0Var.F != 7 || rr0Var.h.getAdapter() == null || rr0VarArr[i3].h.getAdapter().b() == 0 || this.f40142y1.getMessagesController().P1().f11281j.size() <= 0) {
                    i3++;
                } else {
                    return;
                }
            } else {
                if (this.G == 0) {
                    jr0 jr0Var = this.f40078d0;
                    jr0Var.d = chatFull;
                    jr0Var.f35172e = arrayList;
                }
                N1(true);
                for (int i10 = 0; i10 < rr0VarArr.length; i10++) {
                    rr0 rr0Var2 = rr0VarArr[i10];
                    if (rr0Var2.F == 7 && rr0Var2.h.getAdapter() != null) {
                        org.telegram.messenger.g0.r2(rr0VarArr[i10].h);
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
        rr0[] rr0VarArr = this.f40108n0;
        rr0 rr0Var = rr0VarArr[1];
        if (rr0Var != null && E0(rr0Var.F) && rr0VarArr[1].F != 11) {
            f11 = 0.0f + f10;
        }
        rr0 rr0Var2 = rr0VarArr[0];
        if (rr0Var2 != null && E0(rr0Var2.F) && rr0VarArr[0].F != 11) {
            return (1.0f - f10) + f11;
        }
        return f11;
    }

    public final void l1(int i3, int i10, int i11, int i12) {
        rr0[] rr0VarArr;
        boolean z10;
        boolean z11 = true;
        this.c2 = true;
        this.f40080d2 = i3;
        this.f40084e2 = i10;
        this.f40088f2 = i11;
        this.f40074b2 = i12;
        G();
        vp0 vp0Var = this.f40072b0;
        if (vp0Var != null) {
            if (vp0Var.M != i10 || vp0Var.N != i11) {
                vp0Var.M = i10;
                vp0Var.N = i11;
                if (i10 == 0 && i11 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                vp0Var.setClipChildren(z10);
                vp0Var.h.setClipChildren((i10 == 0 && i11 == 0) ? false : false);
                vp0Var.n();
            }
            F1();
        }
        for (rr0 rr0Var : this.f40108n0) {
            if (rr0Var != null) {
                rr0Var.setClipChildren(false);
                H1(rr0Var);
                setPageOverscan(rr0Var.h);
                setPageOverscan(rr0Var.f37787n);
                int paddingTop = rr0Var.h.getPaddingTop();
                cq0 cq0Var = rr0Var.h;
                int paddingLeft = cq0Var.getPaddingLeft();
                cq0 cq0Var2 = rr0Var.h;
                int j02 = j0(rr0Var.F);
                cq0Var2.f37517h3 = j02;
                int paddingRight = rr0Var.h.getPaddingRight();
                cq0 cq0Var3 = rr0Var.h;
                int i02 = i0(H0());
                cq0Var3.i3 = i02;
                cq0Var.setPadding(paddingLeft, j02, paddingRight, i02);
                int paddingTop2 = paddingTop - rr0Var.h.getPaddingTop();
                if (paddingTop2 != 0) {
                    org.telegram.messenger.g0.J(rr0Var.h, new dp0(rr0Var, paddingTop2, 1));
                }
                rr0Var.f37790w.setPadding(0, i3, 0, i12);
                er0 er0Var = this.W;
                if (er0Var != null && er0Var.getParent() == rr0Var) {
                    n1(org.telegram.messenger.g0.L(56.0f) + i3, er0Var);
                }
                tp0 tp0Var = this.f40068a0;
                if (tp0Var != null && tp0Var.getParent() == rr0Var) {
                    n1(i3, tp0Var);
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

    public final int m0(int i3) {
        ts0 x12;
        ei.r6 r6Var;
        if (z0(i3) && (x12 = x1(i3)) != null && (r6Var = x12.f38550s) != null) {
            return r6Var.g();
        }
        return 0;
    }

    public final void m1(int i3, boolean z10) {
        this.D0.a(i3, z10);
        org.telegram.ui.ActionBar.y4 y4Var = this.I;
        if (y4Var != null) {
            y4Var.x(i3, z10);
        }
    }

    public final int n0(int i3) {
        float f10;
        yp0 yp0Var = this.f40076c0;
        if (yp0Var != null && (I0(i3) || i3 == 8)) {
            f10 = yp0Var.getVisibilityFactor() * org.telegram.messenger.g0.L(40.0f);
        } else {
            f10 = 0.0f;
        }
        return (int) f10;
    }

    public void o1(boolean z10) {
        float f10;
        if (this.F1 != z10) {
            this.F1 = z10;
            org.telegram.ui.ActionBar.y4 y4Var = this.I;
            if (y4Var != null) {
                if (z10) {
                    M1();
                    y4Var.B();
                } else {
                    y4Var.r();
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
            this.R1.addListener(new s9(19, this, z10));
            this.R1.start();
            if (z10) {
                M1();
            }
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i3 = 0;
        while (true) {
            rr0[] rr0VarArr = this.f40108n0;
            if (i3 < rr0VarArr.length) {
                cq0 cq0Var = rr0VarArr[i3].h;
                if (cq0Var != null) {
                    cq0Var.getViewTreeObserver().addOnPreDrawListener(new zq0(this, i3, 0));
                }
                i3++;
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
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i3);
        lr0 lr0Var = this.G1;
        if (lr0Var.f() != null) {
            i11 = lr0Var.f().getHeight();
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
                i12 = i3;
            } else if (childAt instanceof rr0) {
                i12 = i3;
                measureChildWithMargins(childAt, i12, 0, View.MeasureSpec.makeMeasureSpec(i11, 1073741824), 0);
                cq0 cq0Var = ((rr0) childAt).h;
                cq0Var.setPadding(0, cq0Var.f37515f3, 0, cq0Var.f37516g3);
            } else {
                i12 = i3;
                i13 = i10;
                measureChildWithMargins(childAt, i12, 0, i13, 0);
                i14++;
                i3 = i12;
                i10 = i13;
            }
            i13 = i10;
            i14++;
            i3 = i12;
            i10 = i13;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i3;
        boolean z10;
        boolean z11;
        int i10;
        boolean z12 = false;
        if (!this.P1) {
            org.telegram.ui.ActionBar.d2 d2Var = this.f40142y1;
            if (d2Var.getParentLayout() != null && !((ActionBarLayout) d2Var.getParentLayout()).i() && !T() && !this.f40067a) {
                if (motionEvent != null) {
                    if (this.E1 == null) {
                        this.E1 = VelocityTracker.obtain();
                    }
                    this.E1.addMovement(motionEvent);
                    gi.l3 l3Var = this.H1;
                    if (l3Var != null) {
                        l3Var.f(true);
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.A1 && !this.B1) {
                    if (motionEvent.getY() >= org.telegram.messenger.g0.L(90.0f) + this.f40080d2) {
                        this.f40144z1 = motionEvent.getPointerId(0);
                        this.B1 = true;
                        this.C1 = (int) motionEvent.getX();
                        this.D1 = (int) motionEvent.getY();
                        this.E1.clear();
                        return this.A1;
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f40144z1) {
                    int x10 = (int) (motionEvent.getX() - this.C1);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.D1);
                    boolean z13 = this.A1;
                    rr0[] rr0VarArr = this.f40108n0;
                    if (z13 && (((z10 = this.k1) && x10 > 0) || (!z10 && x10 < 0))) {
                        if (x10 < 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!e1(motionEvent, z11)) {
                            this.B1 = true;
                            this.A1 = false;
                            rr0VarArr[0].setTranslationX(0.0f);
                            rr0 rr0Var = rr0VarArr[1];
                            if (this.k1) {
                                i10 = rr0VarArr[0].getMeasuredWidth();
                            } else {
                                i10 = -rr0VarArr[0].getMeasuredWidth();
                            }
                            rr0Var.setTranslationX(i10);
                            j1(0.0f, rr0VarArr[1].F);
                            X0(getTabProgress());
                        }
                    }
                    if (this.B1 && !this.A1) {
                        if (Math.abs(x10) >= org.telegram.messenger.g0.a1(true, 0.3f) && Math.abs(x10) > abs) {
                            if (x10 < 0) {
                                z12 = true;
                            }
                            e1(motionEvent, z12);
                        }
                    } else if (this.A1) {
                        rr0VarArr[0].setTranslationX(x10);
                        if (this.k1) {
                            rr0VarArr[1].setTranslationX(rr0VarArr[0].getMeasuredWidth() + x10);
                        } else {
                            rr0VarArr[1].setTranslationX(x10 - rr0VarArr[0].getMeasuredWidth());
                        }
                        float abs2 = Math.abs(x10) / rr0VarArr[0].getMeasuredWidth();
                        if (!I()) {
                            this.f40121r0 = 0.0f;
                        } else {
                            this.f40121r0 = l0(abs2);
                            K1(abs2);
                            float k02 = k0(abs2);
                            this.f40125s0 = k02;
                            if (k02 != 0.0f && I() && !A0()) {
                                i3 = 0;
                            } else {
                                i3 = 4;
                            }
                            this.f40130u0.setVisibility(i3);
                        }
                        G1(false);
                        j1(abs2, rr0VarArr[1].F);
                        X0(getTabProgress());
                        W0();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f40144z1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    t1(motionEvent);
                }
                return this.A1;
            }
        }
        return false;
    }

    public final void p1(int r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ws0.p1(int, boolean):void");
    }

    public final float q0(int i3, boolean z10) {
        float width = getWidth();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            rr0[] rr0VarArr = this.f40108n0;
            if (i10 >= rr0VarArr.length) {
                break;
            }
            rr0 rr0Var = rr0VarArr[i10];
            if (rr0Var != null) {
                int i12 = rr0Var.F;
                if ((z10 && i3 == 8 && I0(i12)) || i12 == i3) {
                    i11++;
                    width = rr0VarArr[i10].getTranslationX();
                }
            }
            i10++;
        }
        if (i11 == 2) {
            return 0.0f;
        }
        return width;
    }

    public final void q1(int i3) {
        int u12 = u1(getClosestTab());
        yp0 yp0Var = this.f40076c0;
        if (u12 != i3) {
            if (yp0Var != null) {
                yp0Var.f44467b.d(i3, yp0Var.d.i(i3));
                return;
            }
            return;
        }
        yp0Var.setReorderingAlbums(true);
        vs0 v12 = v1(i3);
        rr0 g02 = g0(v12.f39780a);
        if (g02 == null) {
            return;
        }
        cq0 cq0Var = g02.h;
        for (int i10 = 0; i10 < cq0Var.getChildCount(); i10++) {
            View childAt = cq0Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.n7) {
                ((org.telegram.ui.Cells.n7) childAt).l(true, true);
            }
        }
        us0 us0Var = v12.f39782c;
        if (us0Var != null && !us0Var.f38553y) {
            us0Var.f38553y = true;
        }
        G1(true);
    }

    public final float r0(int i3, boolean z10) {
        float f10 = 0.0f;
        int i10 = 0;
        while (true) {
            rr0[] rr0VarArr = this.f40108n0;
            if (i10 < rr0VarArr.length) {
                rr0 rr0Var = rr0VarArr[i10];
                if (rr0Var != null) {
                    int i11 = rr0Var.F;
                    if ((z10 && i3 == 8 && I0(i11)) || i11 == i3) {
                        f10 = (1.0f - Math.abs(rr0VarArr[i10].getTranslationX() / getWidth())) + f10;
                    }
                }
                i10++;
            } else {
                return f10;
            }
        }
    }

    public final void r1(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ws0.r1(boolean):void");
    }

    public final int s0(int i3) {
        org.telegram.ui.ActionBar.e6 e6Var = this.I1;
        if (e6Var != null) {
            return e6Var.h(i3);
        }
        return org.telegram.ui.ActionBar.k6.x0(null, i3, false);
    }

    public final void s1() {
        int i3 = 0;
        while (true) {
            rr0[] rr0VarArr = this.f40108n0;
            if (i3 < rr0VarArr.length) {
                int childCount = rr0VarArr[i3].h.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = rr0VarArr[i3].h.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.h2) {
                        ImageReceiver photoImage = ((org.telegram.ui.Cells.h2) childAt).getPhotoImage();
                        if (i3 == 0) {
                            photoImage.f21272u0 = true;
                            photoImage.P0(false);
                        } else {
                            photoImage.f21272u0 = false;
                            photoImage.Q0();
                        }
                    }
                }
                i3++;
            } else {
                return;
            }
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        boolean z10;
        int i3;
        TLRPC.ChatFull chatFull2 = this.f40090g1;
        if (chatFull2 != null && chatFull2.stories_pinned_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f40090g1 = chatFull;
        if (chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.f40087f1 == 0) {
                this.f40087f1 = -j10;
                int i10 = 0;
                while (true) {
                    ls0[] ls0VarArr = this.f40136w1;
                    if (i10 >= ls0VarArr.length) {
                        break;
                    }
                    if (ls0VarArr[i10].f35855b[1].size() == 0) {
                        ls0 ls0Var = ls0VarArr[i10];
                        ls0Var.f35861j[1] = this.f40090g1.migrated_from_max_id;
                        ls0Var.f35860i[1] = false;
                    }
                    i10++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.f40090g1;
        if (chatFull3 != null && z10 != chatFull3.stories_pinned_available) {
            tq0 tq0Var = this.L0;
            if (tq0Var != null) {
                if (A0()) {
                    i3 = 9;
                } else {
                    i3 = 8;
                }
                tq0Var.setInitialTabId(i3);
            }
            N1(true);
            z1(false);
        }
    }

    public void setCommonGroupsCount(int i3) {
        if (this.G == 0) {
            this.f40069a1[6] = i3;
        }
        N1(true);
        N();
    }

    public void setForwardRestrictedHint(gi.l3 l3Var) {
        this.H1 = l3Var;
    }

    public void setMergeDialogId(long j10) {
        this.f40087f1 = j10;
    }

    public void setNewMediaCounts(int[] iArr) {
        int[] iArr2;
        int i3 = 0;
        while (true) {
            iArr2 = this.f40069a1;
            if (i3 > 6 || iArr2[i3] >= 0) {
                break;
            }
            i3++;
        }
        System.arraycopy(iArr, 0, iArr2, 0, 6);
        N1(true);
        N();
        if (iArr2[0] >= 0) {
            L0(false);
        }
    }

    public void setOnTopPanelShiftChanged(Runnable runnable) {
        this.f40102k2 = runnable;
    }

    @Override
    public final void setPadding(int i3, int i10, int i11, int i12) {
        this.O1 = i10;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            rr0[] rr0VarArr = this.f40108n0;
            if (i14 >= rr0VarArr.length) {
                break;
            }
            rr0VarArr[i14].setTranslationY(this.O1);
            i14++;
        }
        if (this.S0 != null) {
            U();
        } else {
            oq0 oq0Var = this.U0;
            if (oq0Var != null) {
                oq0Var.setTranslationY(org.telegram.messenger.g0.L(48.0f) + i10);
            }
        }
        this.R0 = i10;
        org.telegram.ui.Cells.t0 t0Var = this.N0;
        if (t0Var.getTag() == null) {
            i13 = -org.telegram.messenger.g0.L(48.0f);
        }
        t0Var.setTranslationY(i13 + this.R0);
    }

    public void setPagesGlassEngine(pi.q qVar) {
        rr0[] rr0VarArr;
        this.f40094h2 = qVar;
        vp0 vp0Var = this.f40072b0;
        if (vp0Var != null) {
            vp0Var.setGlassEngine(qVar);
        }
        for (rr0 rr0Var : this.f40108n0) {
            if (rr0Var != null) {
                rr0Var.h.setCaptureSectionsDecoratorAllowed(true);
                qVar.b(rr0Var.h);
            }
        }
    }

    public void setPagesPaddingBottom(int i3) {
        if (this.f40074b2 != i3) {
            this.f40074b2 = i3;
            rr0[] rr0VarArr = this.f40108n0;
            if (rr0VarArr != null) {
                for (rr0 rr0Var : rr0VarArr) {
                    if (rr0Var != null) {
                        cq0 cq0Var = rr0Var.h;
                        int paddingLeft = cq0Var.getPaddingLeft();
                        cq0 cq0Var2 = rr0Var.h;
                        int i10 = cq0Var2.f37515f3;
                        int paddingRight = cq0Var2.getPaddingRight();
                        cq0 cq0Var3 = rr0Var.h;
                        int i02 = i0(H0());
                        cq0Var3.i3 = i02;
                        cq0Var.setPadding(paddingLeft, i10, paddingRight, i02);
                    }
                }
            }
        }
    }

    public void setPagesVisibleOverscanTop(int i3) {
        if (this.f40091g2 != i3) {
            this.f40091g2 = i3;
            invalidate();
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
        }
    }

    public void setPinnedToTop(boolean z10) {
        if (this.d != z10) {
            this.d = z10;
            int i3 = 0;
            while (true) {
                rr0[] rr0VarArr = this.f40108n0;
                if (i3 < rr0VarArr.length) {
                    D1(rr0VarArr[i3], true);
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        boolean z10;
        TLRPC.UserFull userFull2 = this.f40093h1;
        if (userFull2 != null && userFull2.stories_pinned_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f40093h1 = userFull;
        N1(true);
        if (userFull != null && z10 != userFull.stories_pinned_available) {
            i1(8);
        }
    }

    public void setVisibleHeight(int i3) {
        float f10;
        this.Q1 = i3;
        int i10 = 0;
        while (true) {
            rr0[] rr0VarArr = this.f40108n0;
            if (i10 >= rr0VarArr.length) {
                break;
            }
            int measuredHeight = getMeasuredHeight();
            if (rr0VarArr[i10].F == 8) {
                f10 = 280.0f;
            } else {
                f10 = 120.0f;
            }
            float f11 = (-(measuredHeight - Math.max(i3, org.telegram.messenger.g0.L(f10)))) / 2.0f;
            rr0VarArr[i10].f37790w.setTranslationY(f11);
            rr0VarArr[i10].f37789s.setTranslationY(-f11);
            i10++;
        }
        tp0 tp0Var = this.f40068a0;
        if (tp0Var != null) {
            tp0Var.setVisibleHeight(i3);
        }
        vp0 vp0Var = this.f40072b0;
        if (vp0Var != null) {
            vp0Var.setVisibleHeight(i3);
        }
    }

    public final boolean t0() {
        if (this.f40142y1.getConnectionsManager().getConnectionState() == 3) {
            return true;
        }
        return false;
    }

    public final void t1(MotionEvent motionEvent) {
        float f10;
        float f11;
        boolean z10;
        float measuredWidth;
        rr0 rr0Var;
        rr0 rr0Var2;
        int measuredWidth2;
        rr0 rr0Var3;
        rr0 rr0Var4;
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
                    e1(motionEvent, z11);
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
            }
            if (this.A1) {
                rr0[] rr0VarArr = this.f40108n0;
                float x10 = rr0VarArr[0].getX();
                this.f40096i1 = new AnimatorSet();
                if (Math.abs(x10) < rr0VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f40104l1 = z10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new y50(this, 19));
                boolean z12 = this.f40104l1;
                Property property = View.TRANSLATION_X;
                if (z12) {
                    measuredWidth = Math.abs(x10);
                    if (this.k1) {
                        this.f40096i1.playTogether(ObjectAnimator.ofFloat(rr0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(rr0VarArr[1], property, rr0Var4.getMeasuredWidth()), ofFloat);
                    } else {
                        this.f40096i1.playTogether(ObjectAnimator.ofFloat(rr0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(rr0VarArr[1], property, -rr0Var3.getMeasuredWidth()), ofFloat);
                    }
                } else {
                    measuredWidth = rr0VarArr[0].getMeasuredWidth() - Math.abs(x10);
                    if (this.k1) {
                        this.f40096i1.playTogether(ObjectAnimator.ofFloat(rr0VarArr[0], property, -rr0Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(rr0VarArr[1], property, 0.0f), ofFloat);
                    } else {
                        this.f40096i1.playTogether(ObjectAnimator.ofFloat(rr0VarArr[0], property, rr0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(rr0VarArr[1], property, 0.0f), ofFloat);
                    }
                }
                this.f40096i1.setInterpolator(f40064u2);
                int measuredWidth3 = getMeasuredWidth();
                float f12 = measuredWidth3 / 2;
                float I = (org.telegram.messenger.g0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f12) + f12;
                float abs = Math.abs(f10);
                if (abs > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(I / abs) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                this.f40096i1.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                this.f40096i1.addListener(new wq0(this, 1));
                this.f40096i1.start();
                this.f40099j1 = true;
                this.A1 = false;
                W0();
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

    @Override
    public final void u(org.telegram.ui.Cells.t2 t2Var) {
        int i3;
        org.telegram.ui.ActionBar.d2 d2Var = this.f40142y1;
        if (d2Var != null && d2Var.getMessagesController().P1().K(t2Var.getDialogId())) {
            d2Var.getOrCreateStoryViewer().getClass();
            ei.r9 orCreateStoryViewer = d2Var.getOrCreateStoryViewer();
            Context context = d2Var.getContext();
            long dialogId = t2Var.getDialogId();
            ei.i7 a10 = ei.i7.a((tj0) t2Var.getParent());
            if ((d2Var instanceof ProfileActivity) && ((ProfileActivity) d2Var).f41847s1) {
                i3 = org.telegram.messenger.g0.L(68.0f);
            } else {
                i3 = 0;
            }
            a10.f10422s += i3;
            orCreateStoryViewer.R(context, dialogId, a10);
        }
    }

    public final boolean u0() {
        SparseArray[] sparseArrayArr;
        org.telegram.messenger.zi ziVar;
        TLRPC.Message message;
        boolean z10 = false;
        for (int i3 = 1; i3 >= 0; i3--) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (true) {
                sparseArrayArr = this.f40077c1;
                if (i10 >= sparseArrayArr[i3].size()) {
                    break;
                }
                arrayList.add(Integer.valueOf(sparseArrayArr[i3].keyAt(i10)));
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
                if (num.intValue() > 0 && (ziVar = (org.telegram.messenger.zi) sparseArrayArr[i3].get(num.intValue())) != null && (message = ziVar.f26868k) != null && message.noforwards) {
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

    public final int u1(int i3) {
        vs0 w12 = w1(i3);
        if (w12 == null) {
            return -1;
        }
        return w12.f39781b;
    }

    @Override
    public final void updateColors() {
        rr0[] rr0VarArr;
        try {
            this.J1.a(s0(org.telegram.ui.ActionBar.k6.f27878d6));
            org.telegram.ui.ActionBar.w1 w1Var = this.G0;
            if (w1Var != null) {
                w1Var.a(s0(org.telegram.ui.ActionBar.k6.f28275y8));
            }
            NumberTextView numberTextView = this.D0;
            if (numberTextView != null) {
                numberTextView.setTextColor(s0(org.telegram.ui.ActionBar.k6.f28275y8));
            }
            B1();
            invalidate();
            for (rr0 rr0Var : this.f40108n0) {
                if (rr0Var != null && rr0Var.M) {
                    rr0Var.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final boolean v0(int i3) {
        if (i3 != 0) {
            if (((i3 != 8 && !I0(i3)) || !TextUtils.isEmpty(getStoriesHashtag())) && i3 != 9 && i3 != 11 && i3 != 13) {
                if (i3 != 14 || this.f40072b0 == null) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final vs0 v1(int i3) {
        Integer valueOf = Integer.valueOf(i3);
        HashMap hashMap = this.f40106m2;
        vs0 vs0Var = (vs0) hashMap.get(valueOf);
        if (vs0Var == null) {
            vs0 vs0Var2 = new vs0(this, getContext(), i3);
            hashMap.put(Integer.valueOf(i3), vs0Var2);
            this.f40110n2.put(Integer.valueOf(vs0Var2.f39780a), Integer.valueOf(i3));
            return vs0Var2;
        }
        return vs0Var;
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
        this.O0.setInterpolator(xq.f40453g);
        this.O0.addListener(new wq0(this, 0));
        this.O0.start();
    }

    public final vs0 w1(int i3) {
        Integer num = (Integer) this.f40110n2.get(Integer.valueOf(i3));
        if (num == null) {
            return null;
        }
        return (vs0) this.f40106m2.get(num);
    }

    public boolean x0() {
        return false;
    }

    public final ts0 x1(int i3) {
        vs0 w12;
        if (i3 == 8) {
            return this.f40086f0;
        }
        if (i3 == 9) {
            return this.f40092h0;
        }
        if (I0(i3) && (w12 = w1(i3)) != null) {
            return w12.f39782c;
        }
        return null;
    }

    public boolean y0() {
        return !(this instanceof k20);
    }

    public final ts0 y1(int i3) {
        vs0 w12;
        if (i3 == 8) {
            return this.f40089g0;
        }
        if (i3 == 9) {
            return this.f40095i0;
        }
        if (!I0(i3) || (w12 = w1(i3)) == null) {
            return null;
        }
        return w12.d;
    }

    public final void z(View view) {
        rr0[] rr0VarArr = this.f40108n0;
        addView(view, Math.max(indexOfChild(rr0VarArr[0]), indexOfChild(rr0VarArr[1])) + 1, b8.mf.e(-1, 0, 48));
        view.getLayoutParams().height = 0;
    }

    public final void z1(boolean z10) {
        rr0[] rr0VarArr;
        rr0[] rr0VarArr2;
        org.telegram.ui.ActionBar.q0 q0Var;
        u4.v0 v0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        u4.v0 v0Var2;
        int i3;
        int i10;
        boolean z14;
        boolean z15;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z16;
        u4.v0 v0Var3;
        int i16;
        int i17;
        boolean z17;
        int i18;
        boolean z18;
        int i19;
        boolean z19;
        boolean z20;
        int i20;
        u4.v0 v0Var4;
        vp0 vp0Var = this.f40072b0;
        if (vp0Var != null) {
            vp0Var.i();
        }
        int i21 = 0;
        while (true) {
            rr0VarArr = this.f40108n0;
            if (i21 >= rr0VarArr.length) {
                break;
            }
            rr0VarArr[i21].h.C0();
            i21++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rr0VarArr[z10 ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = org.telegram.messenger.g0.L(N0());
        layoutParams.rightMargin = 0;
        layoutParams.leftMargin = 0;
        u4.h0 adapter = rr0VarArr[z10 ? 1 : 0].h.getAdapter();
        u4.h0 h0Var = this.f40086f0;
        u4.y yVar = this.f40082e0;
        if (adapter == h0Var) {
            yVar.h(null);
        }
        boolean z21 = this.Y0;
        org.telegram.ui.ActionBar.y4 y4Var = this.I;
        lr0 lr0Var = this.G1;
        org.telegram.ui.ActionBar.k kVar = this.H;
        String str = "";
        org.telegram.ui.ActionBar.q0 q0Var2 = this.f40117q0;
        fs0 fs0Var = this.Q;
        int i22 = 100;
        if (z21 && this.X0) {
            rr0 rr0Var = rr0VarArr[z10 ? 1 : 0];
            if (rr0Var.f37786f == null) {
                rr0Var.f37786f = new u4.v0();
            }
            rr0 rr0Var2 = rr0VarArr[z10 ? 1 : 0];
            u4.v0 v0Var5 = rr0Var2.f37786f;
            is0 is0Var = this.V;
            pr0 pr0Var = this.m0;
            tr0 tr0Var = this.f40101k0;
            tr0 tr0Var2 = this.f40103l0;
            tr0 tr0Var3 = this.f40098j0;
            if (z10) {
                int i23 = rr0Var2.F;
                if (i23 != 0) {
                    v0Var4 = v0Var5;
                    if (i23 != 2 && i23 != 5 && i23 != 6 && (i23 != 7 || lr0Var.X())) {
                        if (q0Var2 != null) {
                            str = q0Var2.getSearchField().getText().toString();
                        }
                        String str2 = str;
                        int i24 = rr0VarArr[z10 ? 1 : 0].F;
                        if (i24 == 1) {
                            if (tr0Var3 != null) {
                                tr0Var3.G(str2, false);
                                if (adapter != tr0Var3) {
                                    g1(adapter);
                                    rr0VarArr[z10 ? 1 : 0].h.setAdapter(tr0Var3);
                                }
                            }
                        } else if (i24 == 3) {
                            if (tr0Var2 != null) {
                                tr0Var2.G(str2, false);
                                if (adapter != tr0Var2) {
                                    g1(adapter);
                                    rr0VarArr[z10 ? 1 : 0].h.setAdapter(tr0Var2);
                                }
                            }
                        } else if (i24 == 4) {
                            if (tr0Var != null) {
                                tr0Var.G(str2, false);
                                if (adapter != tr0Var) {
                                    g1(adapter);
                                    rr0VarArr[z10 ? 1 : 0].h.setAdapter(tr0Var);
                                }
                            }
                        } else if (i24 == 7) {
                            if (pr0Var != null) {
                                pr0Var.F(str2, false);
                                if (adapter != pr0Var) {
                                    g1(adapter);
                                    rr0VarArr[z10 ? 1 : 0].h.setAdapter(pr0Var);
                                }
                            }
                        } else if (i24 == 11) {
                            if (is0Var != null) {
                                is0Var.E(this.Z0, str2);
                                if (adapter != is0Var) {
                                    g1(adapter);
                                    rr0VarArr[z10 ? 1 : 0].h.setAdapter(is0Var);
                                }
                            }
                        } else if (i24 == 15 && fs0Var != null && adapter != fs0Var) {
                            g1(adapter);
                            cq0 cq0Var = rr0VarArr[z10 ? 1 : 0].h;
                            fs0Var.f33863r = cq0Var;
                            cq0Var.setAdapter(fs0Var);
                        }
                    }
                }
                this.Y0 = false;
                qq0 qq0Var = this.M0;
                if (qq0Var != null) {
                    qq0Var.g(false);
                }
                this.X0 = false;
                z1(true);
                return;
            }
            v0Var4 = v0Var5;
            if (rr0Var2.h != null) {
                int i25 = rr0Var2.F;
                if (i25 == 1) {
                    if (adapter != tr0Var3) {
                        g1(adapter);
                        rr0VarArr[z10 ? 1 : 0].h.setAdapter(tr0Var3);
                    }
                    tr0Var3.f();
                } else if (i25 == 3) {
                    if (adapter != tr0Var2) {
                        g1(adapter);
                        rr0VarArr[z10 ? 1 : 0].h.setAdapter(tr0Var2);
                    }
                    tr0Var2.f();
                } else if (i25 == 4) {
                    if (adapter != tr0Var) {
                        g1(adapter);
                        rr0VarArr[z10 ? 1 : 0].h.setAdapter(tr0Var);
                    }
                    tr0Var.f();
                } else if (i25 == 7) {
                    if (adapter != pr0Var) {
                        g1(adapter);
                        rr0VarArr[z10 ? 1 : 0].h.setAdapter(pr0Var);
                    }
                    pr0Var.f();
                } else if (i25 == 11) {
                    if (adapter != is0Var) {
                        g1(adapter);
                        rr0VarArr[z10 ? 1 : 0].h.setAdapter(is0Var);
                    }
                    is0Var.f();
                }
            }
            rr0VarArr2 = rr0VarArr;
            q0Var = q0Var2;
            v0Var3 = v0Var4;
            i11 = 4;
            z13 = false;
            z16 = false;
            i13 = 8;
        } else {
            rr0 rr0Var3 = rr0VarArr[z10 ? 1 : 0];
            if (rr0Var3.f37785e == null) {
                rr0Var3.f37785e = new u4.v0();
            }
            rr0 rr0Var4 = rr0VarArr[z10 ? 1 : 0];
            u4.v0 v0Var6 = rr0Var4.f37785e;
            rr0Var4.h.setPinnedHeaderShadowDrawable(null);
            int i26 = rr0VarArr[z10 ? 1 : 0].F;
            if (i26 == 8 || I0(i26)) {
                layoutParams.topMargin = org.telegram.messenger.g0.L(N0());
            }
            cq0 cq0Var2 = rr0VarArr[z10 ? 1 : 0].h;
            int paddingLeft = cq0Var2.getPaddingLeft();
            rr0 rr0Var5 = rr0VarArr[z10 ? 1 : 0];
            rr0VarArr2 = rr0VarArr;
            cq0 cq0Var3 = rr0Var5.h;
            int j02 = j0(rr0Var5.F);
            cq0Var3.f37517h3 = j02;
            int paddingRight = rr0VarArr2[z10 ? 1 : 0].h.getPaddingRight();
            cq0 cq0Var4 = rr0VarArr2[z10 ? 1 : 0].h;
            q0Var = q0Var2;
            int i02 = i0(H0());
            cq0Var4.i3 = i02;
            cq0Var2.setPadding(paddingLeft, j02, paddingRight, i02);
            int i27 = rr0VarArr2[z10 ? 1 : 0].F;
            int[] iArr = this.f40115p1;
            u4.h0 h0Var2 = this.N;
            View view = this.f40068a0;
            hs0 hs0Var = this.U;
            kr0 kr0Var = this.S;
            er0 er0Var = this.W;
            ls0[] ls0VarArr = this.f40136w1;
            if (i27 == 0) {
                u4.h0 h0Var3 = this.K;
                if (adapter != h0Var3) {
                    g1(adapter);
                    rr0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var3);
                }
                int i28 = -org.telegram.messenger.g0.L(1.0f);
                layoutParams.rightMargin = i28;
                layoutParams.leftMargin = i28;
                ls0 ls0Var = ls0VarArr[0];
                if (ls0Var.h && !ls0Var.f35857e.isEmpty()) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                i22 = iArr[0];
                rr0VarArr2[z10 ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.B0);
                ls0 ls0Var2 = ls0VarArr[0];
                if (ls0Var2.f35874x == null) {
                    ls0Var2.f35874x = new u4.v0();
                }
                v0Var = ls0VarArr[0].f35874x;
                z13 = z19;
                z11 = false;
            } else {
                if (i27 == 1) {
                    ls0 ls0Var3 = ls0VarArr[1];
                    if (ls0Var3.h && !ls0Var3.f35857e.isEmpty()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (adapter != h0Var2) {
                        g1(adapter);
                        rr0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var2);
                    }
                } else if (i27 == 2) {
                    ls0 ls0Var4 = ls0VarArr[2];
                    if (ls0Var4.h && !ls0Var4.f35857e.isEmpty()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    u4.h0 h0Var4 = this.O;
                    if (adapter != h0Var4) {
                        g1(adapter);
                        rr0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var4);
                    }
                } else {
                    if (i27 == 3) {
                        u4.h0 h0Var5 = this.M;
                        if (adapter != h0Var5) {
                            g1(adapter);
                            rr0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var5);
                        }
                    } else if (i27 == 4) {
                        ls0 ls0Var5 = ls0VarArr[4];
                        if (ls0Var5.h && !ls0Var5.f35857e.isEmpty()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        u4.h0 h0Var6 = this.P;
                        if (adapter != h0Var6) {
                            g1(adapter);
                            rr0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var6);
                        }
                    } else {
                        if (i27 == 5) {
                            u4.h0 h0Var7 = this.R;
                            if (adapter != h0Var7) {
                                g1(adapter);
                                rr0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var7);
                            }
                        } else if (i27 == 15) {
                            if (adapter != fs0Var) {
                                g1(adapter);
                                cq0 cq0Var5 = rr0VarArr2[z10 ? 1 : 0].h;
                                fs0Var.f33863r = cq0Var5;
                                cq0Var5.setAdapter(fs0Var);
                            }
                        } else if (i27 == 6) {
                            if (adapter != kr0Var) {
                                g1(adapter);
                                rr0VarArr2[z10 ? 1 : 0].h.setAdapter(kr0Var);
                            }
                        } else if (i27 == 7) {
                            u4.h0 h0Var8 = this.f40078d0;
                            if (adapter != h0Var8) {
                                g1(adapter);
                                rr0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var8);
                            }
                        } else if (z0(i27)) {
                            u4.h0 x12 = x1(rr0VarArr2[z10 ? 1 : 0].F);
                            if (adapter != x12) {
                                g1(adapter);
                                rr0VarArr2[z10 ? 1 : 0].h.setAdapter(x12);
                                rr0VarArr2[z10 ? 1 : 0].h.getClass();
                            }
                            rr0 rr0Var6 = rr0VarArr2[z10 ? 1 : 0];
                            if (rr0Var6.F != 9) {
                                yVar.h(rr0Var6.h);
                            }
                            i22 = iArr[1];
                        } else {
                            int i29 = rr0VarArr2[z10 ? 1 : 0].F;
                            if (i29 == 10) {
                                u4.h0 h0Var9 = this.T;
                                if (adapter != h0Var9) {
                                    g1(adapter);
                                    rr0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var9);
                                }
                            } else if (i29 == 11) {
                                if (adapter != hs0Var) {
                                    g1(adapter);
                                    rr0VarArr2[z10 ? 1 : 0].h.setAdapter(hs0Var);
                                    u4.y yVar2 = hs0Var.f34497w;
                                    cq0 cq0Var6 = rr0VarArr2[z10 ? 1 : 0].h;
                                    hs0Var.f34496s = cq0Var6;
                                    yVar2.h(cq0Var6);
                                }
                                v0Var = hs0Var.f34495r;
                                z11 = true;
                                z13 = false;
                            } else if (i29 == 12) {
                                if (adapter != null) {
                                    g1(adapter);
                                    rr0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (er0Var.getParent() != rr0VarArr2[z10 ? 1 : 0]) {
                                    org.telegram.messenger.g0.E2(er0Var);
                                    rr0VarArr2[z10 ? 1 : 0].addView(er0Var, b8.mf.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
                                    n1(org.telegram.messenger.g0.L(56.0f) + this.f40080d2, er0Var);
                                }
                            } else if (i29 == 13) {
                                if (adapter != null) {
                                    g1(adapter);
                                    rr0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != rr0VarArr2[z10 ? 1 : 0]) {
                                    org.telegram.messenger.g0.E2(view);
                                    rr0VarArr2[z10 ? 1 : 0].addView(view);
                                    n1(this.f40080d2, view);
                                }
                            } else if (i29 == 14) {
                                if (adapter != null) {
                                    g1(adapter);
                                    rr0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (vp0Var != null && vp0Var.getParent() != rr0VarArr2[z10 ? 1 : 0]) {
                                    org.telegram.messenger.g0.E2(vp0Var);
                                    rr0VarArr2[z10 ? 1 : 0].addView(vp0Var);
                                    rr0VarArr2[z10 ? 1 : 0].f37790w.setVisibility(4);
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
            I1(rr0VarArr2[z10 ? 1 : 0]);
            if (z11) {
                rr0VarArr2[z10 ? 1 : 0].h.setSections(false);
                v0Var2 = v0Var;
            } else {
                cq0 cq0Var7 = rr0VarArr2[z10 ? 1 : 0].h;
                cq0Var7.getClass();
                v0Var2 = v0Var;
                org.telegram.ui.ActionBar.r6.m(cq0Var7, 20, org.telegram.ui.ActionBar.k6.f27972i6, cq0Var7.f38460o2);
                cq0Var7.U2 = false;
                cq0Var7.I2 = null;
                cq0Var7.J2 = null;
                cq0Var7.M2 = 0.0f;
                cq0Var7.N2 = null;
                cq0Var7.O2 = null;
                cq0Var7.K2 = null;
                dj0 dj0Var = cq0Var7.H2;
                if (dj0Var != null) {
                    cq0Var7.q0(dj0Var);
                    cq0Var7.H2 = null;
                }
                p9 p9Var = cq0Var7.S2;
                if (p9Var != null) {
                    cq0Var7.q0(p9Var);
                    cq0Var7.S2 = null;
                }
            }
            H1(rr0VarArr2[z10 ? 1 : 0]);
            rr0 rr0Var7 = rr0VarArr2[z10 ? 1 : 0];
            if (rr0Var7.F == 11) {
                rr0Var7.h.setItemAnimator(rr0Var7.d);
            } else {
                rr0Var7.h.setItemAnimator(null);
                if (hs0Var != null && rr0VarArr2[z10 ? 1 : 0].h == hs0Var.f34496s) {
                    u4.y yVar3 = hs0Var.f34497w;
                    hs0Var.f34496s = null;
                    yVar3.h(null);
                }
            }
            if (er0Var != null && rr0VarArr2[z10 ? 1 : 0].F != 12 && er0Var.getParent() == rr0VarArr2[z10 ? 1 : 0]) {
                er0Var.f52363a.onRemoveFromParent();
                rr0VarArr2[z10 ? 1 : 0].removeView(er0Var);
            }
            if (view != null && rr0VarArr2[z10 ? 1 : 0].F != 13) {
                ViewParent parent = view.getParent();
                rr0 rr0Var8 = rr0VarArr2[z10 ? 1 : 0];
                if (parent == rr0Var8) {
                    rr0Var8.removeView(view);
                }
            }
            if (vp0Var != null && rr0VarArr2[z10 ? 1 : 0].F != 14) {
                ViewParent parent2 = vp0Var.getParent();
                rr0 rr0Var9 = rr0VarArr2[z10 ? 1 : 0];
                if (parent2 == rr0Var9) {
                    rr0Var9.removeView(vp0Var);
                }
            }
            int i30 = rr0VarArr2[z10 ? 1 : 0].F;
            if (i30 != 0 && i30 != 11 && !z0(i30) && (i16 = rr0VarArr2[z10 ? 1 : 0].F) != 2 && i16 != 5 && i16 != 6 && ((i16 != 7 || lr0Var.X()) && (i17 = rr0VarArr2[z10 ? 1 : 0].F) != 10 && i17 != 13 && i17 != 14)) {
                if (z10) {
                    if (q0Var != null && q0Var.getVisibility() == 4) {
                        if (y4Var != null) {
                            z18 = y4Var.G;
                        } else {
                            z18 = kVar.f27728o0;
                        }
                        if (!z18) {
                            if (I()) {
                                this.A0 = 1;
                                setSearchItemVisibility(0);
                            } else {
                                if (H0()) {
                                    i19 = 8;
                                } else {
                                    i19 = 4;
                                }
                                setSearchItemVisibility(i19);
                            }
                            float f10 = z10 ? 1.0f : 0.0f;
                            this.f40121r0 = l0(f10);
                            K1(1.0f - f10);
                            z17 = false;
                        }
                    }
                    z17 = false;
                    this.A0 = 0;
                    this.f40121r0 = 1.0f;
                } else {
                    z17 = false;
                    if (q0Var != null && q0Var.getVisibility() == 4) {
                        if (I()) {
                            this.A0 = 0;
                            this.f40121r0 = 1.0f;
                            setSearchItemVisibility(0);
                        } else {
                            if (H0()) {
                                i18 = 8;
                            } else {
                                i18 = 4;
                            }
                            setSearchItemVisibility(i18);
                            this.f40121r0 = 0.0f;
                        }
                    }
                }
                G1(z17);
            } else if (z10) {
                this.A0 = 2;
            } else {
                this.A0 = 0;
                if (q0Var != null) {
                    if (!H0() && !this.Y0) {
                        i3 = 4;
                    } else {
                        i3 = 8;
                    }
                    setSearchItemVisibility(i3);
                }
            }
            int i31 = rr0VarArr2[z10 ? 1 : 0].F;
            if (i31 == 6) {
                if (!kr0Var.f35471e && !kr0Var.h && kr0Var.d.isEmpty()) {
                    kr0.E(kr0Var, 0L);
                }
            } else if (i31 != 7) {
                if (z0(i31)) {
                    ts0 x13 = x1(rr0VarArr2[z10 ? 1 : 0].F);
                    if (x13 != null) {
                        ei.r6 r6Var = x13.f38550s;
                        x13.P();
                        nq0 nq0Var = rr0VarArr2[z10 ? 1 : 0].f37790w;
                        if (r6Var != null && (r6Var.k() || (t0() && r6Var.g() > 0))) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        nq0Var.e(z14, z10);
                        if (r6Var != null && r6Var.g() > 0 && !F0()) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z13 = z15;
                    }
                } else {
                    int i32 = rr0VarArr2[z10 ? 1 : 0].F;
                    if (i32 != 10 && i32 != 11 && i32 != 12 && i32 != 13 && i32 != 14) {
                        if (i32 == 15) {
                            i32 = 8;
                        }
                        ls0 ls0Var6 = ls0VarArr[i32];
                        if (!ls0Var6.f35859g && !ls0Var6.f35860i[0] && ls0Var6.f35854a.isEmpty()) {
                            ls0VarArr[i32].f35859g = true;
                            h0Var2.f();
                            if (i32 == 0) {
                                int i33 = ls0VarArr[0].f35868q;
                                if (i33 == 1) {
                                    i10 = 6;
                                } else if (i33 == 2) {
                                    i10 = 7;
                                }
                                org.telegram.ui.ActionBar.d2 d2Var = this.f40142y1;
                                d2Var.getMediaDataController().N0(this.m1, 50, 0, 0, i10, this.G, 1, d2Var.getClassGuid(), ls0VarArr[i10].f35867p, null, null);
                            }
                            i10 = i32;
                            org.telegram.ui.ActionBar.d2 d2Var2 = this.f40142y1;
                            d2Var2.getMediaDataController().N0(this.m1, 50, 0, 0, i10, this.G, 1, d2Var2.getClassGuid(), ls0VarArr[i10].f35867p, null, null);
                        }
                    }
                }
            }
            int i34 = rr0VarArr2[z10 ? 1 : 0].F;
            if (i34 == 8 || I0(i34)) {
                i11 = 4;
                rr0 rr0Var10 = rr0VarArr2[z10 ? 1 : 0];
                nq0 nq0Var2 = rr0Var10.f37790w;
                boolean I0 = I0(rr0Var10.F);
                int u12 = u1(rr0VarArr2[z10 ? 1 : 0].F);
                k9 k9Var = nq0Var2.f41126b;
                gi.d dVar = nq0Var2.f41129f;
                if (!I0 && !G0() && !B0()) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                k9Var.setVisibility(i12);
                if (I0) {
                    dVar.setVisibility(0);
                    dVar.h(org.telegram.messenger.bd.M0(2131744815, null), false);
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
                    nq0Var2.d.setText(org.telegram.messenger.bd.M0(2131744793, null));
                    nq0Var2.f41128e.setText(org.telegram.messenger.bd.M0(2131744794, null));
                } else {
                    yh.l lVar = nq0Var2.d;
                    if (!F0()) {
                        if (H0()) {
                            i15 = 2131748184;
                        } else {
                            i15 = 2131748155;
                        }
                    } else {
                        i15 = 2131748212;
                    }
                    lVar.setText(org.telegram.messenger.bd.M0(i15, null));
                    s70 s70Var = nq0Var2.f41128e;
                    if (H0()) {
                        str = org.telegram.messenger.bd.M0(2131748156, null);
                    }
                    s70Var.setText(str);
                }
                dVar.setOnClickListener(new ai.n3(this, I0, u12, 1));
            } else {
                rr0 rr0Var11 = rr0VarArr2[z10 ? 1 : 0];
                if (rr0Var11.F == 9) {
                    if (G0()) {
                        rr0VarArr2[z10 ? 1 : 0].f37790w.f41126b.setVisibility(8);
                        rr0VarArr2[z10 ? 1 : 0].f37790w.f41129f.setVisibility(8);
                    } else {
                        rr0VarArr2[z10 ? 1 : 0].f37790w.f41126b.setVisibility(0);
                        rr0VarArr2[z10 ? 1 : 0].f37790w.setStickerType(11);
                        rr0VarArr2[z10 ? 1 : 0].f37790w.f41129f.setVisibility(0);
                        rr0VarArr2[z10 ? 1 : 0].f37790w.f41129f.h(A(), false);
                    }
                    rr0VarArr2[z10 ? 1 : 0].f37790w.d.setText(org.telegram.messenger.bd.M0(2131748254, null));
                    s70 s70Var2 = rr0VarArr2[z10 ? 1 : 0].f37790w.f41128e;
                    if (H0()) {
                        str = org.telegram.messenger.bd.M0(2131748255, null);
                    }
                    s70Var2.setText(str);
                    i11 = 4;
                    rr0VarArr2[z10 ? 1 : 0].f37790w.f41129f.setOnClickListener(new vo0(this, 4));
                    i13 = 8;
                } else {
                    i11 = 4;
                    rr0Var11.f37790w.f41126b.setVisibility(0);
                    rr0VarArr2[z10 ? 1 : 0].f37790w.setStickerType(1);
                    rr0VarArr2[z10 ? 1 : 0].f37790w.d.setText(org.telegram.messenger.bd.M0(2131748175, null));
                    rr0VarArr2[z10 ? 1 : 0].f37790w.f41128e.setText(org.telegram.messenger.bd.M0(2131745817, null));
                    i13 = 8;
                    rr0VarArr2[z10 ? 1 : 0].f37790w.f41129f.setVisibility(8);
                }
            }
            z16 = false;
            rr0VarArr2[z10 ? 1 : 0].h.setVisibility(0);
            v0Var3 = v0Var2;
        }
        int i35 = i22;
        rr0 rr0Var12 = rr0VarArr2[z10 ? 1 : 0];
        rr0Var12.f37783b = z13;
        D1(rr0Var12, z16);
        rr0VarArr2[z10 ? 1 : 0].f37791x.y1(i35);
        rr0VarArr2[z10 ? 1 : 0].h.a0();
        if (v0Var3 != null) {
            rr0VarArr2[z10 ? 1 : 0].h.setRecycledViewPool(v0Var3);
            rr0VarArr2[z10 ? 1 : 0].f37787n.setRecycledViewPool(v0Var3);
        }
        if (this.A0 == 2) {
            if (y4Var != null) {
                z20 = y4Var.G;
            } else {
                z20 = kVar.f27728o0;
            }
            if (z20) {
                this.C0 = true;
                if (y4Var != null) {
                    y4Var.j(true);
                } else {
                    kVar.l(true);
                }
                this.A0 = 0;
                this.f40121r0 = 0.0f;
                if (q0Var != null) {
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

    public void V0(boolean z10) {
    }

    public int f1(int i3) {
        return i3;
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
