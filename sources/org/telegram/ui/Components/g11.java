package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.l81;
public final class g11 extends FrameLayout implements org.telegram.messenger.cs, qe.b, org.telegram.ui.ActionBar.z5 {
    public static final int m0 = 0;
    public final f11 E;
    public final ImageView F;
    public final ImageView G;
    public final ImageView H;
    public final ImageView I;
    public final FrameLayout J;
    public final w01 K;
    public long L;
    public long M;
    public final qe.a N;
    public gh.g O;
    public gh.g P;
    public float Q;
    public float R;
    public org.telegram.ui.yd S;
    public boolean T;
    public boolean U;
    public float V;
    public boolean W;
    public final qe.a f33918a;
    public boolean f33919a0;
    public final qe.a f33920b;
    public int f33921b0;
    public boolean f33922c;
    public int f33923c0;
    public boolean d;
    public Boolean f33924d0;
    public final int f33925e;
    public ValueAnimator f33926e0;
    public final long f33927f;
    public long f33928f0;
    public boolean f33929g0;
    public final org.telegram.ui.ActionBar.e6 h;
    public org.telegram.messenger.n10 f33930h0;
    public Runnable f33931i0;
    public org.telegram.messenger.n10 f33932j0;
    public boolean f33933k0;
    public final HashSet f33934l0;
    public final boolean f33935n;
    public final boolean f33936r;
    public final org.telegram.ui.wm f33937s;
    public final boolean f33938w;
    public final FrameLayout f33939x;
    public final u01 f33940y;

    public g11(Activity activity, org.telegram.ui.wm wmVar, int i3, long j10, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        FrameLayout frameLayout;
        float f10;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        boolean z13;
        xq xqVar = xq.h;
        this.f33918a = new qe.a(0, this, xqVar, 380L, true);
        this.f33920b = new qe.a(1, this, xqVar, 380L, false);
        this.N = new qe.a(0, new q01(this), xqVar, 320L, false);
        this.V = 0.0f;
        this.f33934l0 = new HashSet();
        this.f33937s = wmVar;
        this.f33922c = z10;
        this.f33925e = i3;
        this.f33927f = j10;
        this.h = e6Var;
        long j11 = -j10;
        this.f33935n = org.telegram.messenger.t3.p0(org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(j11)));
        boolean v = org.telegram.messenger.l10.v(org.telegram.messenger.hp.s1(i3).a2(Long.valueOf(j10)));
        this.f33936r = v;
        this.f33938w = !org.telegram.messenger.k5.w("topics_end_reached_", j11, org.telegram.messenger.h10.i(i3).k(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        ?? frameLayout2 = new FrameLayout(activity);
        this.f33939x = frameLayout2;
        addView(frameLayout2, b8.mf.d(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.J = frameLayout3;
        addView(frameLayout3, b8.mf.d(64, -1.0f, 115, 7.0f, 7.0f, 7.0f, 7.0f));
        u01 u01Var = new u01(this, activity, i3, new org.telegram.messenger.n10(this) {
            public final g11 f37006b;

            {
                this.f37006b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                boolean z14;
                boolean z15;
                int i12;
                long j12;
                org.telegram.messenger.c00 c00Var;
                long j13;
                boolean z16;
                ArrayList arrayList;
                boolean z17;
                boolean z18;
                long j14;
                long j15;
                boolean z19;
                boolean z20;
                int i13 = r2;
                g11 g11Var = this.f37006b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        f41 f41Var = (f41) obj2;
                        boolean z21 = g11Var.f33936r;
                        int i14 = g11Var.f33925e;
                        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i14);
                        long j16 = g11Var.f33927f;
                        long j17 = -j16;
                        TLRPC.Chat M0 = s12.M0(Long.valueOf(j17));
                        TLRPC.User a22 = org.telegram.messenger.hp.s1(i14).a2(Long.valueOf(j16));
                        org.telegram.messenger.c00 c00Var2 = org.telegram.messenger.hp.s1(i14).f23102q7;
                        ArrayList l10 = c00Var2.l(j17);
                        boolean z22 = g11Var.f33935n;
                        int i15 = a11.f31705b;
                        r31 K = r31.K(a11.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.f37632q = z22;
                        if (g11Var.f33928f0 == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        K.L(z14);
                        arrayList2.add(K);
                        if (l10 != null) {
                            int size = l10.size();
                            int i16 = 0;
                            z15 = false;
                            while (i16 < size) {
                                Object obj3 = l10.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                int i18 = size;
                                if (z21) {
                                    i12 = i17;
                                    if (tL_forumTopic.f27053id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (g11Var.f33934l0.contains(Integer.valueOf(tL_forumTopic.f27053id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z23 = tL_forumTopic.pinned;
                                    if (!z23 && z15) {
                                        if (!arrayList2.isEmpty()) {
                                            ((r31) k2.p1.h(1, arrayList2)).f37639y |= 8;
                                        }
                                        f41Var.L();
                                        z15 = false;
                                    } else if (z23 && !z15) {
                                        f41Var.M();
                                        z15 = true;
                                    }
                                    r31 K2 = r31.K(a11.class);
                                    K2.f37638x = j16;
                                    K2.d = tL_forumTopic.f27053id;
                                    K2.G = tL_forumTopic;
                                    if (z22) {
                                        j12 = j16;
                                        K2.B = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j12 = j16;
                                    }
                                    long j18 = g11Var.f33928f0;
                                    if (z22) {
                                        c00Var = c00Var2;
                                        j13 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                    } else {
                                        c00Var = c00Var2;
                                        j13 = tL_forumTopic.f27053id;
                                    }
                                    if (j18 == j13) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    K2.L(z16);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i12;
                                    c00Var2 = c00Var;
                                    j16 = j12;
                                }
                            }
                        } else {
                            z15 = false;
                        }
                        org.telegram.messenger.c00 c00Var3 = c00Var2;
                        if (z15) {
                            f41Var.L();
                        }
                        if (l10 != null && !l10.isEmpty() && !c00Var3.e(j17) && g11Var.f33938w) {
                            r31 K3 = r31.K(a11.class);
                            K3.d = -2;
                            K3.f37633r = true;
                            arrayList2.add(K3);
                            r31 K4 = r31.K(a11.class);
                            K4.d = -3;
                            K4.f37633r = true;
                            arrayList2.add(K4);
                            r31 K5 = r31.K(a11.class);
                            K5.d = -4;
                            K5.f37633r = true;
                            arrayList2.add(K5);
                        }
                        if (!z21 && !z22) {
                            if ((M0 != null && org.telegram.messenger.t3.w(15, M0)) || org.telegram.messenger.l10.v(a22)) {
                                r31 K6 = r31.K(a11.class);
                                K6.d = -2;
                                K6.B = -2L;
                                K6.G = null;
                                arrayList2.add(K6);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        ((Integer) obj).getClass();
                        g11.c(g11Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        f41 f41Var2 = (f41) obj2;
                        boolean z24 = g11Var.f33935n;
                        int i19 = g11Var.f33925e;
                        org.telegram.messenger.hp s13 = org.telegram.messenger.hp.s1(i19);
                        long j19 = g11Var.f33927f;
                        long j20 = -j19;
                        TLRPC.Chat M02 = s13.M0(Long.valueOf(j20));
                        TLRPC.User a23 = org.telegram.messenger.hp.s1(i19).a2(Long.valueOf(j19));
                        org.telegram.messenger.c00 c00Var4 = org.telegram.messenger.hp.s1(i19).f23102q7;
                        ArrayList l11 = c00Var4.l(j20);
                        boolean z25 = g11Var.f33936r;
                        if (!z25) {
                            int i20 = e11.f33270b;
                            r31 K7 = r31.K(e11.class);
                            K7.d = 0;
                            arrayList = l11;
                            K7.B = 0L;
                            K7.G = null;
                            K7.f37632q = z24;
                            K7.f37639y = z25 ? 1 : 0;
                            if (g11Var.f33928f0 == 0) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            K7.L(z20);
                            arrayList3.add(K7);
                        } else {
                            arrayList = l11;
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            boolean z26 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                int i22 = size2;
                                Object obj4 = arrayList.get(i21);
                                i21++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = a23;
                                if (z25) {
                                    z18 = z26;
                                    if (tL_forumTopic2.f27053id == 1) {
                                        size2 = i22;
                                        a23 = user;
                                        z26 = z18;
                                    }
                                } else {
                                    z18 = z26;
                                }
                                if (g11Var.f33934l0.contains(Integer.valueOf(tL_forumTopic2.f27053id))) {
                                    size2 = i22;
                                    a23 = user;
                                    z26 = z18;
                                } else {
                                    boolean z27 = tL_forumTopic2.pinned;
                                    if (!z27 && z18) {
                                        f41Var2.L();
                                        z26 = false;
                                    } else if (z27 && !z18) {
                                        f41Var2.M();
                                        z26 = true;
                                    } else {
                                        z26 = z18;
                                    }
                                    int i23 = e11.f33270b;
                                    r31 K8 = r31.K(e11.class);
                                    K8.f37638x = j19;
                                    long j21 = j19;
                                    K8.d = tL_forumTopic2.f27053id;
                                    K8.G = tL_forumTopic2;
                                    if (z24) {
                                        K8.B = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j22 = g11Var.f33928f0;
                                    if (z24) {
                                        j14 = j22;
                                        j15 = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j14 = j22;
                                        j15 = tL_forumTopic2.f27053id;
                                    }
                                    if (j14 == j15) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    K8.L(z19);
                                    arrayList3.add(K8);
                                    size2 = i22;
                                    a23 = user;
                                    j19 = j21;
                                }
                            }
                            z17 = z26;
                        } else {
                            z17 = false;
                        }
                        TLRPC.User user2 = a23;
                        if (z17) {
                            f41Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !c00Var4.e(j20) && g11Var.f33938w) {
                            int i24 = e11.f33270b;
                            r31 K9 = r31.K(e11.class);
                            K9.d = -2;
                            K9.f37633r = true;
                            K9.f37621e = false;
                            arrayList3.add(K9);
                            r31 K10 = r31.K(e11.class);
                            K10.d = -3;
                            K10.f37633r = true;
                            K10.f37621e = false;
                            arrayList3.add(K10);
                            r31 K11 = r31.K(e11.class);
                            K11.d = -4;
                            K11.f37633r = true;
                            K11.f37621e = false;
                            arrayList3.add(K11);
                        }
                        if (!z25 && !z24) {
                            if ((M02 != null && org.telegram.messenger.t3.w(15, M02)) || org.telegram.messenger.l10.v(user2)) {
                                int i25 = e11.f33270b;
                                r31 K12 = r31.K(e11.class);
                                K12.d = -2;
                                K12.B = -2L;
                                K12.G = null;
                                K12.f37632q = false;
                                arrayList3.add(K12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new q01(this), new q01(this), e6Var);
        this.f33940y = u01Var;
        u01Var.E1(new org.telegram.messenger.n10(this) {
            public final g11 f37006b;

            {
                this.f37006b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                boolean z14;
                boolean z15;
                int i12;
                long j12;
                org.telegram.messenger.c00 c00Var;
                long j13;
                boolean z16;
                ArrayList arrayList;
                boolean z17;
                boolean z18;
                long j14;
                long j15;
                boolean z19;
                boolean z20;
                int i13 = r2;
                g11 g11Var = this.f37006b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        f41 f41Var = (f41) obj2;
                        boolean z21 = g11Var.f33936r;
                        int i14 = g11Var.f33925e;
                        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i14);
                        long j16 = g11Var.f33927f;
                        long j17 = -j16;
                        TLRPC.Chat M0 = s12.M0(Long.valueOf(j17));
                        TLRPC.User a22 = org.telegram.messenger.hp.s1(i14).a2(Long.valueOf(j16));
                        org.telegram.messenger.c00 c00Var2 = org.telegram.messenger.hp.s1(i14).f23102q7;
                        ArrayList l10 = c00Var2.l(j17);
                        boolean z22 = g11Var.f33935n;
                        int i15 = a11.f31705b;
                        r31 K = r31.K(a11.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.f37632q = z22;
                        if (g11Var.f33928f0 == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        K.L(z14);
                        arrayList2.add(K);
                        if (l10 != null) {
                            int size = l10.size();
                            int i16 = 0;
                            z15 = false;
                            while (i16 < size) {
                                Object obj3 = l10.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                int i18 = size;
                                if (z21) {
                                    i12 = i17;
                                    if (tL_forumTopic.f27053id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (g11Var.f33934l0.contains(Integer.valueOf(tL_forumTopic.f27053id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z23 = tL_forumTopic.pinned;
                                    if (!z23 && z15) {
                                        if (!arrayList2.isEmpty()) {
                                            ((r31) k2.p1.h(1, arrayList2)).f37639y |= 8;
                                        }
                                        f41Var.L();
                                        z15 = false;
                                    } else if (z23 && !z15) {
                                        f41Var.M();
                                        z15 = true;
                                    }
                                    r31 K2 = r31.K(a11.class);
                                    K2.f37638x = j16;
                                    K2.d = tL_forumTopic.f27053id;
                                    K2.G = tL_forumTopic;
                                    if (z22) {
                                        j12 = j16;
                                        K2.B = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j12 = j16;
                                    }
                                    long j18 = g11Var.f33928f0;
                                    if (z22) {
                                        c00Var = c00Var2;
                                        j13 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                    } else {
                                        c00Var = c00Var2;
                                        j13 = tL_forumTopic.f27053id;
                                    }
                                    if (j18 == j13) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    K2.L(z16);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i12;
                                    c00Var2 = c00Var;
                                    j16 = j12;
                                }
                            }
                        } else {
                            z15 = false;
                        }
                        org.telegram.messenger.c00 c00Var3 = c00Var2;
                        if (z15) {
                            f41Var.L();
                        }
                        if (l10 != null && !l10.isEmpty() && !c00Var3.e(j17) && g11Var.f33938w) {
                            r31 K3 = r31.K(a11.class);
                            K3.d = -2;
                            K3.f37633r = true;
                            arrayList2.add(K3);
                            r31 K4 = r31.K(a11.class);
                            K4.d = -3;
                            K4.f37633r = true;
                            arrayList2.add(K4);
                            r31 K5 = r31.K(a11.class);
                            K5.d = -4;
                            K5.f37633r = true;
                            arrayList2.add(K5);
                        }
                        if (!z21 && !z22) {
                            if ((M0 != null && org.telegram.messenger.t3.w(15, M0)) || org.telegram.messenger.l10.v(a22)) {
                                r31 K6 = r31.K(a11.class);
                                K6.d = -2;
                                K6.B = -2L;
                                K6.G = null;
                                arrayList2.add(K6);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        ((Integer) obj).getClass();
                        g11.c(g11Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        f41 f41Var2 = (f41) obj2;
                        boolean z24 = g11Var.f33935n;
                        int i19 = g11Var.f33925e;
                        org.telegram.messenger.hp s13 = org.telegram.messenger.hp.s1(i19);
                        long j19 = g11Var.f33927f;
                        long j20 = -j19;
                        TLRPC.Chat M02 = s13.M0(Long.valueOf(j20));
                        TLRPC.User a23 = org.telegram.messenger.hp.s1(i19).a2(Long.valueOf(j19));
                        org.telegram.messenger.c00 c00Var4 = org.telegram.messenger.hp.s1(i19).f23102q7;
                        ArrayList l11 = c00Var4.l(j20);
                        boolean z25 = g11Var.f33936r;
                        if (!z25) {
                            int i20 = e11.f33270b;
                            r31 K7 = r31.K(e11.class);
                            K7.d = 0;
                            arrayList = l11;
                            K7.B = 0L;
                            K7.G = null;
                            K7.f37632q = z24;
                            K7.f37639y = z25 ? 1 : 0;
                            if (g11Var.f33928f0 == 0) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            K7.L(z20);
                            arrayList3.add(K7);
                        } else {
                            arrayList = l11;
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            boolean z26 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                int i22 = size2;
                                Object obj4 = arrayList.get(i21);
                                i21++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = a23;
                                if (z25) {
                                    z18 = z26;
                                    if (tL_forumTopic2.f27053id == 1) {
                                        size2 = i22;
                                        a23 = user;
                                        z26 = z18;
                                    }
                                } else {
                                    z18 = z26;
                                }
                                if (g11Var.f33934l0.contains(Integer.valueOf(tL_forumTopic2.f27053id))) {
                                    size2 = i22;
                                    a23 = user;
                                    z26 = z18;
                                } else {
                                    boolean z27 = tL_forumTopic2.pinned;
                                    if (!z27 && z18) {
                                        f41Var2.L();
                                        z26 = false;
                                    } else if (z27 && !z18) {
                                        f41Var2.M();
                                        z26 = true;
                                    } else {
                                        z26 = z18;
                                    }
                                    int i23 = e11.f33270b;
                                    r31 K8 = r31.K(e11.class);
                                    K8.f37638x = j19;
                                    long j21 = j19;
                                    K8.d = tL_forumTopic2.f27053id;
                                    K8.G = tL_forumTopic2;
                                    if (z24) {
                                        K8.B = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j22 = g11Var.f33928f0;
                                    if (z24) {
                                        j14 = j22;
                                        j15 = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j14 = j22;
                                        j15 = tL_forumTopic2.f27053id;
                                    }
                                    if (j14 == j15) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    K8.L(z19);
                                    arrayList3.add(K8);
                                    size2 = i22;
                                    a23 = user;
                                    j19 = j21;
                                }
                            }
                            z17 = z26;
                        } else {
                            z17 = false;
                        }
                        TLRPC.User user2 = a23;
                        if (z17) {
                            f41Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !c00Var4.e(j20) && g11Var.f33938w) {
                            int i24 = e11.f33270b;
                            r31 K9 = r31.K(e11.class);
                            K9.d = -2;
                            K9.f37633r = true;
                            K9.f37621e = false;
                            arrayList3.add(K9);
                            r31 K10 = r31.K(e11.class);
                            K10.d = -3;
                            K10.f37633r = true;
                            K10.f37621e = false;
                            arrayList3.add(K10);
                            r31 K11 = r31.K(e11.class);
                            K11.d = -4;
                            K11.f37633r = true;
                            K11.f37621e = false;
                            arrayList3.add(K11);
                        }
                        if (!z25 && !z24) {
                            if ((M02 != null && org.telegram.messenger.t3.w(15, M02)) || org.telegram.messenger.l10.v(user2)) {
                                int i25 = e11.f33270b;
                                r31 K12 = r31.K(e11.class);
                                K12.d = -2;
                                K12.B = -2L;
                                K12.G = null;
                                K12.f37632q = false;
                                arrayList3.add(K12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        u01Var.setWillNotDraw(false);
        u01Var.f35594g3.f33698r = false;
        u01Var.getContext();
        kg.f0 f0Var = new kg.f0((ViewGroup) u01Var, 7);
        u01Var.f35593f3 = f0Var;
        u01Var.setLayoutManager(f0Var);
        frameLayout2.addView(u01Var, b8.mf.d(-1, -1.0f, 119, 41.0f, 0.0f, 0.0f, 0.0f));
        u01Var.j(new v01(this, 0));
        if (v) {
            f11 f11Var = new f11(i3, activity, e6Var);
            this.E = f11Var;
            if (this.f33928f0 == 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            f11Var.c(true, false, z13);
            f11Var.setOnClickListener(new View.OnClickListener(this) {
                public final g11 f36674b;

                {
                    this.f36674b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            g11 g11Var = this.f36674b;
                            w01 w01Var = g11Var.K;
                            w01Var.z1(false);
                            u01 u01Var2 = g11Var.f33940y;
                            u01Var2.z1(false);
                            g11Var.N.a(false, true);
                            org.telegram.messenger.g0.b4(w01Var);
                            org.telegram.messenger.g0.b4(u01Var2);
                            return;
                        case 1:
                            this.f36674b.f33930h0.a(0, Boolean.FALSE);
                            return;
                        default:
                            g11.b(this.f36674b);
                            return;
                    }
                }
            });
            frameLayout = frameLayout3;
            frameLayout.addView(f11Var, b8.mf.d(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            frameLayout = frameLayout3;
            this.E = null;
        }
        ViewGroup viewGroup = frameLayout;
        w01 w01Var = new w01(activity, i3, new org.telegram.messenger.n10(this) {
            public final g11 f37006b;

            {
                this.f37006b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                boolean z14;
                boolean z15;
                int i12;
                long j12;
                org.telegram.messenger.c00 c00Var;
                long j13;
                boolean z16;
                ArrayList arrayList;
                boolean z17;
                boolean z18;
                long j14;
                long j15;
                boolean z19;
                boolean z20;
                int i13 = r2;
                g11 g11Var = this.f37006b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        f41 f41Var = (f41) obj2;
                        boolean z21 = g11Var.f33936r;
                        int i14 = g11Var.f33925e;
                        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i14);
                        long j16 = g11Var.f33927f;
                        long j17 = -j16;
                        TLRPC.Chat M0 = s12.M0(Long.valueOf(j17));
                        TLRPC.User a22 = org.telegram.messenger.hp.s1(i14).a2(Long.valueOf(j16));
                        org.telegram.messenger.c00 c00Var2 = org.telegram.messenger.hp.s1(i14).f23102q7;
                        ArrayList l10 = c00Var2.l(j17);
                        boolean z22 = g11Var.f33935n;
                        int i15 = a11.f31705b;
                        r31 K = r31.K(a11.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.f37632q = z22;
                        if (g11Var.f33928f0 == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        K.L(z14);
                        arrayList2.add(K);
                        if (l10 != null) {
                            int size = l10.size();
                            int i16 = 0;
                            z15 = false;
                            while (i16 < size) {
                                Object obj3 = l10.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                int i18 = size;
                                if (z21) {
                                    i12 = i17;
                                    if (tL_forumTopic.f27053id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (g11Var.f33934l0.contains(Integer.valueOf(tL_forumTopic.f27053id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z23 = tL_forumTopic.pinned;
                                    if (!z23 && z15) {
                                        if (!arrayList2.isEmpty()) {
                                            ((r31) k2.p1.h(1, arrayList2)).f37639y |= 8;
                                        }
                                        f41Var.L();
                                        z15 = false;
                                    } else if (z23 && !z15) {
                                        f41Var.M();
                                        z15 = true;
                                    }
                                    r31 K2 = r31.K(a11.class);
                                    K2.f37638x = j16;
                                    K2.d = tL_forumTopic.f27053id;
                                    K2.G = tL_forumTopic;
                                    if (z22) {
                                        j12 = j16;
                                        K2.B = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j12 = j16;
                                    }
                                    long j18 = g11Var.f33928f0;
                                    if (z22) {
                                        c00Var = c00Var2;
                                        j13 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                    } else {
                                        c00Var = c00Var2;
                                        j13 = tL_forumTopic.f27053id;
                                    }
                                    if (j18 == j13) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    K2.L(z16);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i12;
                                    c00Var2 = c00Var;
                                    j16 = j12;
                                }
                            }
                        } else {
                            z15 = false;
                        }
                        org.telegram.messenger.c00 c00Var3 = c00Var2;
                        if (z15) {
                            f41Var.L();
                        }
                        if (l10 != null && !l10.isEmpty() && !c00Var3.e(j17) && g11Var.f33938w) {
                            r31 K3 = r31.K(a11.class);
                            K3.d = -2;
                            K3.f37633r = true;
                            arrayList2.add(K3);
                            r31 K4 = r31.K(a11.class);
                            K4.d = -3;
                            K4.f37633r = true;
                            arrayList2.add(K4);
                            r31 K5 = r31.K(a11.class);
                            K5.d = -4;
                            K5.f37633r = true;
                            arrayList2.add(K5);
                        }
                        if (!z21 && !z22) {
                            if ((M0 != null && org.telegram.messenger.t3.w(15, M0)) || org.telegram.messenger.l10.v(a22)) {
                                r31 K6 = r31.K(a11.class);
                                K6.d = -2;
                                K6.B = -2L;
                                K6.G = null;
                                arrayList2.add(K6);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        ((Integer) obj).getClass();
                        g11.c(g11Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        f41 f41Var2 = (f41) obj2;
                        boolean z24 = g11Var.f33935n;
                        int i19 = g11Var.f33925e;
                        org.telegram.messenger.hp s13 = org.telegram.messenger.hp.s1(i19);
                        long j19 = g11Var.f33927f;
                        long j20 = -j19;
                        TLRPC.Chat M02 = s13.M0(Long.valueOf(j20));
                        TLRPC.User a23 = org.telegram.messenger.hp.s1(i19).a2(Long.valueOf(j19));
                        org.telegram.messenger.c00 c00Var4 = org.telegram.messenger.hp.s1(i19).f23102q7;
                        ArrayList l11 = c00Var4.l(j20);
                        boolean z25 = g11Var.f33936r;
                        if (!z25) {
                            int i20 = e11.f33270b;
                            r31 K7 = r31.K(e11.class);
                            K7.d = 0;
                            arrayList = l11;
                            K7.B = 0L;
                            K7.G = null;
                            K7.f37632q = z24;
                            K7.f37639y = z25 ? 1 : 0;
                            if (g11Var.f33928f0 == 0) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            K7.L(z20);
                            arrayList3.add(K7);
                        } else {
                            arrayList = l11;
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            boolean z26 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                int i22 = size2;
                                Object obj4 = arrayList.get(i21);
                                i21++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = a23;
                                if (z25) {
                                    z18 = z26;
                                    if (tL_forumTopic2.f27053id == 1) {
                                        size2 = i22;
                                        a23 = user;
                                        z26 = z18;
                                    }
                                } else {
                                    z18 = z26;
                                }
                                if (g11Var.f33934l0.contains(Integer.valueOf(tL_forumTopic2.f27053id))) {
                                    size2 = i22;
                                    a23 = user;
                                    z26 = z18;
                                } else {
                                    boolean z27 = tL_forumTopic2.pinned;
                                    if (!z27 && z18) {
                                        f41Var2.L();
                                        z26 = false;
                                    } else if (z27 && !z18) {
                                        f41Var2.M();
                                        z26 = true;
                                    } else {
                                        z26 = z18;
                                    }
                                    int i23 = e11.f33270b;
                                    r31 K8 = r31.K(e11.class);
                                    K8.f37638x = j19;
                                    long j21 = j19;
                                    K8.d = tL_forumTopic2.f27053id;
                                    K8.G = tL_forumTopic2;
                                    if (z24) {
                                        K8.B = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j22 = g11Var.f33928f0;
                                    if (z24) {
                                        j14 = j22;
                                        j15 = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j14 = j22;
                                        j15 = tL_forumTopic2.f27053id;
                                    }
                                    if (j14 == j15) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    K8.L(z19);
                                    arrayList3.add(K8);
                                    size2 = i22;
                                    a23 = user;
                                    j19 = j21;
                                }
                            }
                            z17 = z26;
                        } else {
                            z17 = false;
                        }
                        TLRPC.User user2 = a23;
                        if (z17) {
                            f41Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !c00Var4.e(j20) && g11Var.f33938w) {
                            int i24 = e11.f33270b;
                            r31 K9 = r31.K(e11.class);
                            K9.d = -2;
                            K9.f37633r = true;
                            K9.f37621e = false;
                            arrayList3.add(K9);
                            r31 K10 = r31.K(e11.class);
                            K10.d = -3;
                            K10.f37633r = true;
                            K10.f37621e = false;
                            arrayList3.add(K10);
                            r31 K11 = r31.K(e11.class);
                            K11.d = -4;
                            K11.f37633r = true;
                            K11.f37621e = false;
                            arrayList3.add(K11);
                        }
                        if (!z25 && !z24) {
                            if ((M02 != null && org.telegram.messenger.t3.w(15, M02)) || org.telegram.messenger.l10.v(user2)) {
                                int i25 = e11.f33270b;
                                r31 K12 = r31.K(e11.class);
                                K12.d = -2;
                                K12.B = -2L;
                                K12.G = null;
                                K12.f37632q = false;
                                arrayList3.add(K12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new q01(this), new q01(this), e6Var);
        this.K = w01Var;
        w01Var.E1(new org.telegram.messenger.n10(this) {
            public final g11 f37006b;

            {
                this.f37006b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                boolean z14;
                boolean z15;
                int i12;
                long j12;
                org.telegram.messenger.c00 c00Var;
                long j13;
                boolean z16;
                ArrayList arrayList;
                boolean z17;
                boolean z18;
                long j14;
                long j15;
                boolean z19;
                boolean z20;
                int i13 = r2;
                g11 g11Var = this.f37006b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        f41 f41Var = (f41) obj2;
                        boolean z21 = g11Var.f33936r;
                        int i14 = g11Var.f33925e;
                        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i14);
                        long j16 = g11Var.f33927f;
                        long j17 = -j16;
                        TLRPC.Chat M0 = s12.M0(Long.valueOf(j17));
                        TLRPC.User a22 = org.telegram.messenger.hp.s1(i14).a2(Long.valueOf(j16));
                        org.telegram.messenger.c00 c00Var2 = org.telegram.messenger.hp.s1(i14).f23102q7;
                        ArrayList l10 = c00Var2.l(j17);
                        boolean z22 = g11Var.f33935n;
                        int i15 = a11.f31705b;
                        r31 K = r31.K(a11.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.f37632q = z22;
                        if (g11Var.f33928f0 == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        K.L(z14);
                        arrayList2.add(K);
                        if (l10 != null) {
                            int size = l10.size();
                            int i16 = 0;
                            z15 = false;
                            while (i16 < size) {
                                Object obj3 = l10.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                int i18 = size;
                                if (z21) {
                                    i12 = i17;
                                    if (tL_forumTopic.f27053id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (g11Var.f33934l0.contains(Integer.valueOf(tL_forumTopic.f27053id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z23 = tL_forumTopic.pinned;
                                    if (!z23 && z15) {
                                        if (!arrayList2.isEmpty()) {
                                            ((r31) k2.p1.h(1, arrayList2)).f37639y |= 8;
                                        }
                                        f41Var.L();
                                        z15 = false;
                                    } else if (z23 && !z15) {
                                        f41Var.M();
                                        z15 = true;
                                    }
                                    r31 K2 = r31.K(a11.class);
                                    K2.f37638x = j16;
                                    K2.d = tL_forumTopic.f27053id;
                                    K2.G = tL_forumTopic;
                                    if (z22) {
                                        j12 = j16;
                                        K2.B = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j12 = j16;
                                    }
                                    long j18 = g11Var.f33928f0;
                                    if (z22) {
                                        c00Var = c00Var2;
                                        j13 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                    } else {
                                        c00Var = c00Var2;
                                        j13 = tL_forumTopic.f27053id;
                                    }
                                    if (j18 == j13) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    K2.L(z16);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i12;
                                    c00Var2 = c00Var;
                                    j16 = j12;
                                }
                            }
                        } else {
                            z15 = false;
                        }
                        org.telegram.messenger.c00 c00Var3 = c00Var2;
                        if (z15) {
                            f41Var.L();
                        }
                        if (l10 != null && !l10.isEmpty() && !c00Var3.e(j17) && g11Var.f33938w) {
                            r31 K3 = r31.K(a11.class);
                            K3.d = -2;
                            K3.f37633r = true;
                            arrayList2.add(K3);
                            r31 K4 = r31.K(a11.class);
                            K4.d = -3;
                            K4.f37633r = true;
                            arrayList2.add(K4);
                            r31 K5 = r31.K(a11.class);
                            K5.d = -4;
                            K5.f37633r = true;
                            arrayList2.add(K5);
                        }
                        if (!z21 && !z22) {
                            if ((M0 != null && org.telegram.messenger.t3.w(15, M0)) || org.telegram.messenger.l10.v(a22)) {
                                r31 K6 = r31.K(a11.class);
                                K6.d = -2;
                                K6.B = -2L;
                                K6.G = null;
                                arrayList2.add(K6);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        ((Integer) obj).getClass();
                        g11.c(g11Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        f41 f41Var2 = (f41) obj2;
                        boolean z24 = g11Var.f33935n;
                        int i19 = g11Var.f33925e;
                        org.telegram.messenger.hp s13 = org.telegram.messenger.hp.s1(i19);
                        long j19 = g11Var.f33927f;
                        long j20 = -j19;
                        TLRPC.Chat M02 = s13.M0(Long.valueOf(j20));
                        TLRPC.User a23 = org.telegram.messenger.hp.s1(i19).a2(Long.valueOf(j19));
                        org.telegram.messenger.c00 c00Var4 = org.telegram.messenger.hp.s1(i19).f23102q7;
                        ArrayList l11 = c00Var4.l(j20);
                        boolean z25 = g11Var.f33936r;
                        if (!z25) {
                            int i20 = e11.f33270b;
                            r31 K7 = r31.K(e11.class);
                            K7.d = 0;
                            arrayList = l11;
                            K7.B = 0L;
                            K7.G = null;
                            K7.f37632q = z24;
                            K7.f37639y = z25 ? 1 : 0;
                            if (g11Var.f33928f0 == 0) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            K7.L(z20);
                            arrayList3.add(K7);
                        } else {
                            arrayList = l11;
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            boolean z26 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                int i22 = size2;
                                Object obj4 = arrayList.get(i21);
                                i21++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = a23;
                                if (z25) {
                                    z18 = z26;
                                    if (tL_forumTopic2.f27053id == 1) {
                                        size2 = i22;
                                        a23 = user;
                                        z26 = z18;
                                    }
                                } else {
                                    z18 = z26;
                                }
                                if (g11Var.f33934l0.contains(Integer.valueOf(tL_forumTopic2.f27053id))) {
                                    size2 = i22;
                                    a23 = user;
                                    z26 = z18;
                                } else {
                                    boolean z27 = tL_forumTopic2.pinned;
                                    if (!z27 && z18) {
                                        f41Var2.L();
                                        z26 = false;
                                    } else if (z27 && !z18) {
                                        f41Var2.M();
                                        z26 = true;
                                    } else {
                                        z26 = z18;
                                    }
                                    int i23 = e11.f33270b;
                                    r31 K8 = r31.K(e11.class);
                                    K8.f37638x = j19;
                                    long j21 = j19;
                                    K8.d = tL_forumTopic2.f27053id;
                                    K8.G = tL_forumTopic2;
                                    if (z24) {
                                        K8.B = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j22 = g11Var.f33928f0;
                                    if (z24) {
                                        j14 = j22;
                                        j15 = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j14 = j22;
                                        j15 = tL_forumTopic2.f27053id;
                                    }
                                    if (j14 == j15) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    K8.L(z19);
                                    arrayList3.add(K8);
                                    size2 = i22;
                                    a23 = user;
                                    j19 = j21;
                                }
                            }
                            z17 = z26;
                        } else {
                            z17 = false;
                        }
                        TLRPC.User user2 = a23;
                        if (z17) {
                            f41Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !c00Var4.e(j20) && g11Var.f33938w) {
                            int i24 = e11.f33270b;
                            r31 K9 = r31.K(e11.class);
                            K9.d = -2;
                            K9.f37633r = true;
                            K9.f37621e = false;
                            arrayList3.add(K9);
                            r31 K10 = r31.K(e11.class);
                            K10.d = -3;
                            K10.f37633r = true;
                            K10.f37621e = false;
                            arrayList3.add(K10);
                            r31 K11 = r31.K(e11.class);
                            K11.d = -4;
                            K11.f37633r = true;
                            K11.f37621e = false;
                            arrayList3.add(K11);
                        }
                        if (!z25 && !z24) {
                            if ((M02 != null && org.telegram.messenger.t3.w(15, M02)) || org.telegram.messenger.l10.v(user2)) {
                                int i25 = e11.f33270b;
                                r31 K12 = r31.K(e11.class);
                                K12.d = -2;
                                K12.B = -2L;
                                K12.G = null;
                                K12.f37632q = false;
                                arrayList3.add(K12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        w01Var.f35594g3.f33698r = false;
        w01Var.setClipToPadding(false);
        w01Var.setClipChildren(false);
        if (v) {
            f10 = 90.0f;
        } else {
            f10 = 48.0f;
        }
        viewGroup.addView(w01Var, b8.mf.d(-1, -1.0f, 119, 0.0f, f10, 0.0f, 0.0f));
        w01Var.j(new v01(this, 1));
        ImageView j12 = j(activity, 2131231884, new View.OnClickListener(this) {
            public final g11 f36674b;

            {
                this.f36674b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g11 g11Var = this.f36674b;
                        w01 w01Var2 = g11Var.K;
                        w01Var2.z1(false);
                        u01 u01Var2 = g11Var.f33940y;
                        u01Var2.z1(false);
                        g11Var.N.a(false, true);
                        org.telegram.messenger.g0.b4(w01Var2);
                        org.telegram.messenger.g0.b4(u01Var2);
                        return;
                    case 1:
                        this.f36674b.f33930h0.a(0, Boolean.FALSE);
                        return;
                    default:
                        g11.b(this.f36674b);
                        return;
                }
            }
        });
        this.H = j12;
        ImageView j13 = j(activity, 2131231884, new View.OnClickListener(this) {
            public final g11 f36674b;

            {
                this.f36674b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g11 g11Var = this.f36674b;
                        w01 w01Var2 = g11Var.K;
                        w01Var2.z1(false);
                        u01 u01Var2 = g11Var.f33940y;
                        u01Var2.z1(false);
                        g11Var.N.a(false, true);
                        org.telegram.messenger.g0.b4(w01Var2);
                        org.telegram.messenger.g0.b4(u01Var2);
                        return;
                    case 1:
                        this.f36674b.f33930h0.a(0, Boolean.FALSE);
                        return;
                    default:
                        g11.b(this.f36674b);
                        return;
                }
            }
        });
        this.I = j13;
        frameLayout2.addView(j12, b8.mf.e(44, 36, 51));
        viewGroup.addView(j13, b8.mf.e(64, 48, 51));
        ImageView j14 = j(activity, 2131232357, new View.OnClickListener(this) {
            public final g11 f36674b;

            {
                this.f36674b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g11 g11Var = this.f36674b;
                        w01 w01Var2 = g11Var.K;
                        w01Var2.z1(false);
                        u01 u01Var2 = g11Var.f33940y;
                        u01Var2.z1(false);
                        g11Var.N.a(false, true);
                        org.telegram.messenger.g0.b4(w01Var2);
                        org.telegram.messenger.g0.b4(u01Var2);
                        return;
                    case 1:
                        this.f36674b.f33930h0.a(0, Boolean.FALSE);
                        return;
                    default:
                        g11.b(this.f36674b);
                        return;
                }
            }
        });
        this.F = j14;
        ImageView j15 = j(activity, 2131232357, new View.OnClickListener(this) {
            public final g11 f36674b;

            {
                this.f36674b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g11 g11Var = this.f36674b;
                        w01 w01Var2 = g11Var.K;
                        w01Var2.z1(false);
                        u01 u01Var2 = g11Var.f33940y;
                        u01Var2.z1(false);
                        g11Var.N.a(false, true);
                        org.telegram.messenger.g0.b4(w01Var2);
                        org.telegram.messenger.g0.b4(u01Var2);
                        return;
                    case 1:
                        this.f36674b.f33930h0.a(0, Boolean.FALSE);
                        return;
                    default:
                        g11.b(this.f36674b);
                        return;
                }
            }
        });
        this.G = j15;
        frameLayout2.addView(j14, b8.mf.e(44, 36, 51));
        viewGroup.addView(j15, b8.mf.e(64, 48, 51));
        org.telegram.messenger.hp.s1(i3).f23102q7.n(3, j11, false);
        SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(i3).f22999e7;
        if (z10 && org.telegram.messenger.k5.w("topicssidetabs", j10, sharedPreferences, false)) {
            this.V = 1.0f;
            z11 = true;
            this.U = true;
        } else {
            z11 = true;
        }
        if (z10 && org.telegram.messenger.k5.w("topicssidetabsb", j10, sharedPreferences, false)) {
            z12 = z11;
        } else {
            z12 = false;
        }
        this.T = z12;
        if (z12) {
            i10 = 2131231886;
        } else {
            i10 = 2131231883;
        }
        j13.setImageResource(i10);
        r(false);
        if (!this.T) {
            i11 = 2131231884;
        } else {
            i11 = 2131231886;
        }
        j12.setImageResource(i11);
        g(false);
        h();
        p();
        q();
    }

    public static void a(g11 g11Var, r31 r31Var) {
        if (g11Var.f33935n) {
            org.telegram.messenger.n10 n10Var = g11Var.f33932j0;
            if (n10Var != null) {
                n10Var.a(Long.valueOf(r31Var.B), Boolean.FALSE);
            }
        } else if (r31Var.B == -2) {
            Runnable runnable = g11Var.f33931i0;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            org.telegram.messenger.n10 n10Var2 = g11Var.f33930h0;
            if (n10Var2 != null) {
                n10Var2.a(Integer.valueOf(r31Var.d), Boolean.FALSE);
            }
        }
    }

    public static void b(g11 g11Var) {
        boolean z10 = g11Var.U;
        boolean z11 = true;
        if (!z10 && g11Var.T && g11Var.f33924d0 == null && !g11Var.W) {
            if (g11Var.d) {
                return;
            }
            g11Var.d = true;
            g11Var.r(true);
        } else if ((r2 = g11Var.f33924d0) != null) {
            z11 = false;
            g11Var.d(z11);
        } else {
            z11 = false;
            g11Var.d(z11);
        }
    }

    public static void c(g11 g11Var, ArrayList arrayList) {
        long j10 = g11Var.f33927f;
        org.telegram.messenger.c00 c00Var = org.telegram.messenger.hp.s1(g11Var.f33925e).f23102q7;
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        while (i3 < arrayList.size()) {
            i3 = com.google.android.recaptcha.internal.a.f(((r31) arrayList.get(i3)).d, i3, 1, arrayList2);
        }
        long j11 = -j10;
        c00Var.w(arrayList2, j11);
        c00Var.y(j11, false);
    }

    public static ImageView j(Context context, int i3, View.OnClickListener onClickListener) {
        ImageView e10 = org.telegram.messenger.camera.q.e(context, i3);
        e10.setScaleType(ImageView.ScaleType.CENTER);
        e10.setOnClickListener(onClickListener);
        b8.pf.a(e10);
        return e10;
    }

    private void setAttached(boolean z10) {
        if (this.f33929g0 == z10) {
            return;
        }
        this.f33929g0 = z10;
        int i3 = 0;
        int i10 = org.telegram.messenger.hs.f23292r;
        int i11 = org.telegram.messenger.hs.f23291q5;
        long j10 = this.f33927f;
        int i12 = this.f33925e;
        if (z10) {
            org.telegram.messenger.hs.f(i12).c(this, i11);
            org.telegram.messenger.hs.f(i12).c(this, i10);
            org.telegram.messenger.c00 c00Var = org.telegram.messenger.hp.s1(i12).f23102q7;
            long j11 = -j10;
            LongSparseIntArray longSparseIntArray = c00Var.f21926f;
            longSparseIntArray.put(j11, longSparseIntArray.get(j11, 0) + 1);
            c00Var.y(j11, true);
            return;
        }
        long j12 = -j10;
        LongSparseIntArray longSparseIntArray2 = org.telegram.messenger.hp.s1(i12).f23102q7.f21926f;
        int i13 = longSparseIntArray2.get(j12, 0) - 1;
        if (i13 >= 0) {
            i3 = i13;
        }
        longSparseIntArray2.put(j12, i3);
        org.telegram.messenger.hs.f(i12).n(this, i11);
        org.telegram.messenger.hs.f(i12).n(this, i10);
    }

    @Override
    public final void F(float f10, int i3) {
        if (i3 == 1 && f10 == 1.0f && this.d) {
            this.d = false;
            this.T = false;
            this.H.setImageResource(2131231884);
            this.I.setImageResource(2131231883);
            SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(this.f33925e).f22999e7.edit();
            edit.putBoolean("topicssidetabsb" + this.f33927f, false).apply();
            r(true);
        }
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        p();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28290z6));
    }

    public final void d(boolean z10) {
        float f10;
        if (this.U == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.f33926e0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (this.W) {
                this.f33924d0 = Boolean.valueOf(z10);
                return;
            }
        }
        if (!z10) {
            this.T = !this.T;
        }
        this.U = z10;
        this.W = true;
        float f11 = this.V;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f33926e0 = ofFloat;
        ofFloat.addUpdateListener(new y50(this, 28));
        this.f33926e0.addListener(new s9(21, this, z10));
        this.f33926e0.setInterpolator(ni.l.V);
        this.f33926e0.setDuration(250L);
        this.f33926e0.start();
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.hs.f23291q5;
        long j10 = this.f33927f;
        if (i3 == i11) {
            if (((Long) objArr[0]).longValue() == (-j10)) {
                q();
            }
        } else if (i3 == org.telegram.messenger.hs.f23292r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i12 = org.telegram.messenger.hp.C8;
            if ((intValue & 512) > 0) {
                org.telegram.messenger.hp.s1(this.f33925e).f23102q7.y(-j10, false);
                q();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        FrameLayout frameLayout = this.J;
        if (frameLayout.getVisibility() == 0) {
            this.O.setBounds((int) frameLayout.getTranslationX(), (int) this.R, (int) (frameLayout.getTranslationX() + org.telegram.messenger.g0.L(78.0f)), (int) (getMeasuredHeight() - this.Q));
            this.O.draw(canvas);
        }
        FrameLayout frameLayout2 = this.f33939x;
        if (frameLayout2.getVisibility() == 0) {
            this.P.setAlpha((int) (frameLayout2.getAlpha() * 255.0f));
            this.P.setBounds(0, (int) frameLayout2.getTranslationY(), getMeasuredWidth(), (int) (frameLayout2.getTranslationY() + org.telegram.messenger.g0.L(50.0f)));
            this.P.draw(canvas);
        }
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        canvas.save();
        if (view == this.J) {
            canvas.clipPath(this.O.R.f12307k);
        }
        if (view == this.f33939x) {
            canvas.clipPath(this.P.R.f12307k);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        int i3 = org.telegram.ui.ActionBar.k6.f28290z6;
        org.telegram.ui.ActionBar.e6 e6Var = this.h;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var);
        int f10 = i0.a.f(1.0f - this.V, w02, w03);
        int f11 = i0.a.f(this.V, w02, w03);
        boolean z10 = this.f33919a0;
        this.f33919a0 = true;
        ImageView imageView = this.H;
        if (imageView != null && (!z10 || f10 != this.f33921b0)) {
            imageView.setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
        }
        this.f33921b0 = f10;
        ImageView imageView2 = this.I;
        if (imageView2 != null && (!z10 || f11 != this.f33923c0)) {
            imageView2.setColorFilter(new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN));
        }
        this.f33923c0 = f11;
    }

    public final void f() {
        FrameLayout frameLayout = this.J;
        int paddingBottom = frameLayout.getPaddingBottom();
        int round = Math.round(this.Q + this.R);
        if (paddingBottom == round) {
            return;
        }
        frameLayout.setPadding(0, 0, 0, round);
    }

    public final void g(boolean z10) {
        boolean z11;
        ArrayList l10 = org.telegram.messenger.hp.s1(this.f33925e).f23102q7.l(-this.f33927f);
        if (l10 != null && !l10.isEmpty() && !this.f33933k0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f33918a.a(z11, z10);
    }

    public c11 getCurrentTabsPosition() {
        if (this.U) {
            return c11.f32502b;
        }
        if (this.T) {
            return c11.f32503c;
        }
        return c11.f32501a;
    }

    public float getSideMenuT() {
        return this.V * this.f33918a.f53840e;
    }

    public final void h() {
        int i3;
        int i10;
        int i11;
        qe.a aVar = this.N;
        float f10 = aVar.f53840e;
        ImageView imageView = this.F;
        imageView.setAlpha(f10);
        imageView.setScaleX(org.telegram.messenger.g0.T1(0.4f, 1.0f, f10));
        imageView.setScaleY(org.telegram.messenger.g0.T1(0.4f, 1.0f, f10));
        int i12 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        int i13 = 8;
        if (i12 > 0) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        imageView.setVisibility(i3);
        ImageView imageView2 = this.G;
        imageView2.setAlpha(f10);
        imageView2.setScaleX(org.telegram.messenger.g0.T1(0.4f, 1.0f, f10));
        imageView2.setScaleY(org.telegram.messenger.g0.T1(0.4f, 1.0f, f10));
        if (i12 > 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView2.setVisibility(i10);
        float f11 = 1.0f - aVar.f53840e;
        ImageView imageView3 = this.H;
        imageView3.setAlpha(f11);
        imageView3.setScaleX(org.telegram.messenger.g0.T1(0.4f, 1.0f, f11));
        imageView3.setScaleY(org.telegram.messenger.g0.T1(0.4f, 1.0f, f11));
        int i14 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        if (i14 > 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView3.setVisibility(i11);
        ImageView imageView4 = this.I;
        imageView4.setAlpha(f11);
        imageView4.setScaleX(org.telegram.messenger.g0.T1(0.4f, 1.0f, f11));
        imageView4.setScaleY(org.telegram.messenger.g0.T1(0.4f, 1.0f, f11));
        if (i14 > 0) {
            i13 = 0;
        }
        imageView4.setVisibility(i13);
    }

    public final void i() {
        int i3;
        float T1 = org.telegram.messenger.g0.T1(1.0f, 0.0f, this.V);
        FrameLayout frameLayout = this.f33939x;
        frameLayout.setAlpha(T1);
        if ((1.0f - this.f33920b.f53840e) * (1.0f - this.V) * this.f33918a.f53840e > 0.0f) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        frameLayout.setVisibility(i3);
        if (this.T) {
            frameLayout.setTranslationY(((getMeasuredHeight() - org.telegram.messenger.g0.L(50.0f)) - this.Q) + org.telegram.messenger.g0.W1(k(c11.f32503c), org.telegram.messenger.g0.L(43.0f), 0));
            return;
        }
        frameLayout.setTranslationY(this.R + org.telegram.messenger.g0.W1(k(c11.f32501a), -org.telegram.messenger.g0.L(43.0f), 0));
    }

    public final float k(c11 c11Var) {
        float f10 = (1.0f - this.f33920b.f53840e) * this.f33918a.f53840e;
        if (c11Var == c11.f32502b) {
            return this.V * f10;
        }
        if ((c11Var == c11.f32501a && !this.T) || (c11Var == c11.f32503c && this.T)) {
            return (1.0f - this.V) * f10;
        }
        return 0.0f;
    }

    public final boolean l() {
        if (this.V > 0.5f) {
            int i3 = 0;
            while (true) {
                w01 w01Var = this.K;
                if (i3 >= w01Var.getChildCount()) {
                    break;
                }
                r31 G = w01Var.f35594g3.G(RecyclerView.R(w01Var.getChildAt(i3)));
                if (G == null || !G.f37633r) {
                    i3++;
                } else {
                    return true;
                }
            }
        } else {
            int i10 = 0;
            while (true) {
                u01 u01Var = this.f33940y;
                if (i10 >= u01Var.getChildCount()) {
                    break;
                }
                r31 G2 = u01Var.f35594g3.G(RecyclerView.R(u01Var.getChildAt(i10)));
                if (G2 != null && G2.f37633r) {
                    return true;
                }
                i10++;
            }
        }
        return false;
    }

    public final void m() {
        org.telegram.messenger.c00 c00Var = org.telegram.messenger.hp.s1(this.f33925e).f23102q7;
        long j10 = this.f33927f;
        if (!c00Var.e(-j10)) {
            c00Var.o(-j10);
        }
    }

    public final void n(long j10, boolean z10) {
        if (this.f33935n) {
            org.telegram.messenger.n10 n10Var = this.f33932j0;
            if (n10Var != null) {
                n10Var.a(Long.valueOf(j10), Boolean.valueOf(z10));
                return;
            }
            return;
        }
        org.telegram.messenger.n10 n10Var2 = this.f33930h0;
        if (n10Var2 != null) {
            n10Var2.a(Integer.valueOf((int) j10), Boolean.valueOf(z10));
        }
    }

    public final boolean o(final TLRPC.TL_forumTopic tL_forumTopic, View view, boolean z10) {
        TLRPC.Chat chat;
        TLRPC.User user;
        int i3;
        int i10;
        org.telegram.messenger.hp hpVar;
        final g11 g11Var;
        final TLRPC.TL_forumTopic tL_forumTopic2;
        int i11;
        int i12;
        int i13;
        final g11 g11Var2;
        boolean z11;
        int i14;
        int i15;
        int i16;
        f60 f60Var;
        int i17 = this.f33925e;
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i17);
        long j10 = this.f33927f;
        int i18 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i18 < 0) {
            chat = s12.M0(Long.valueOf(-j10));
        } else {
            chat = null;
        }
        if (i18 > 0) {
            user = s12.a2(Long.valueOf(j10));
        } else {
            user = null;
        }
        final org.telegram.ui.wm wmVar = this.f33937s;
        final f60 I = f60.I(wmVar, view);
        if (org.telegram.messenger.t3.p0(chat)) {
            long o10 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
            if (o10 == 0 || !org.telegram.messenger.t3.A(i17, chat, 24)) {
                return false;
            }
            TLRPC.Chat chat2 = chat;
            f60 f60Var2 = I;
            f60Var2.c(2131232092, org.telegram.messenger.bd.M0(2131752089, null), new ci.l2(this, f60Var2, o10, chat2, 17), false);
            long j11 = chat2.f27001id;
            if (org.telegram.messenger.t3.p0(chat2) && org.telegram.messenger.t3.A(i17, chat2, 24)) {
                long j12 = chat2.linked_monoforum_id;
                if (j12 != 0) {
                    j11 = j12;
                }
            }
            TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i17).M0(Long.valueOf(j11));
            TLRPC.User a22 = org.telegram.messenger.hp.s1(i17).a2(Long.valueOf(o10));
            f60 f60Var3 = f60Var2;
            if (a22 != null) {
                f60Var3 = f60Var2;
                if (org.telegram.messenger.t3.w(2, M0)) {
                    f60Var2.c(2131232328, org.telegram.messenger.bd.M0(2131753726, null), null, false);
                    org.telegram.ui.ActionBar.y0 y9 = f60Var2.y();
                    y9.setVisibility(8);
                    org.telegram.messenger.hp s13 = org.telegram.messenger.hp.s1(i17);
                    ci.d3 d3Var = new ci.d3(this, y9, f60Var2, j11, a22, M0, 3);
                    f60Var3 = f60Var2;
                    s13.K0(M0, a22, d3Var);
                }
            }
            g11Var2 = this;
            f60Var = f60Var3;
        } else {
            if (!org.telegram.messenger.t3.y(15, chat) && !org.telegram.messenger.l10.v(user)) {
                i11 = 15;
                tL_forumTopic2 = tL_forumTopic;
                hpVar = s12;
                g11Var = this;
            } else {
                boolean z12 = tL_forumTopic.pinned;
                if (z12) {
                    i3 = 2131232413;
                } else {
                    i3 = 2131232293;
                }
                if (z12) {
                    i10 = 2131751453;
                } else {
                    i10 = 2131751454;
                }
                hpVar = s12;
                g11Var = this;
                tL_forumTopic2 = tL_forumTopic;
                I.c(i3, org.telegram.messenger.bd.M0(i10, null), new v60(this, I, hpVar, tL_forumTopic, 10), false);
                if (tL_forumTopic2.pinned && !z10) {
                    I.c(2131232771, org.telegram.messenger.bd.M0(2131750708, null), new r01(g11Var, 1), false);
                }
                i11 = 15;
            }
            if (org.telegram.messenger.t3.y(i11, chat) || org.telegram.messenger.l10.v(user)) {
                I.c(2131232492, org.telegram.messenger.bd.M0(2131751217, null), new Runnable(g11Var) {
                    public final g11 f38214b;

                    {
                        this.f38214b = g11Var;
                    }

                    @Override
                    public final void run() {
                        g11 g11Var3;
                        int i19 = r4;
                        g11 g11Var4 = this.f38214b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic2;
                        f60 f60Var4 = I;
                        switch (i19) {
                            case 0:
                                f60Var4.u();
                                g11Var4.f33937s.presentFragment(l81.f0(-g11Var4.f33927f, tL_forumTopic3.f27053id));
                                return;
                            case 1:
                                g11Var4.getClass();
                                f60Var4.u();
                                org.telegram.messenger.hp.s1(g11Var4.f33925e).f23102q7.z(tL_forumTopic3.f27053id, -g11Var4.f33927f, true ^ tL_forumTopic3.closed);
                                return;
                            default:
                                f60Var4.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.f27053id));
                                go goVar = new go(11);
                                g11 g11Var5 = this.f38214b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g11Var5.getContext());
                                String K0 = org.telegram.messenger.bd.K0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                                s1Var.S = K0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j13 = g11Var5.f33928f0;
                                if (hashSet.size() == 1) {
                                    g11Var3 = g11Var5;
                                    s1Var.U = org.telegram.messenger.bd.a0(null, null, 2131751499, org.telegram.messenger.hp.s1(g11Var5.f33925e).f23102q7.f(-g11Var5.f33927f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    g11Var3 = g11Var5;
                                    s1Var.U = org.telegram.messenger.bd.M0(2131751498, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new ci.x3(g11Var3, arrayList, j13, hashSet, goVar));
                                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new lf0(14));
                                s1Var.show();
                                TextView textView = (TextView) s1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            }
            final long j13 = tL_forumTopic2.f27053id;
            final int currentAccount = wmVar.getCurrentAccount();
            final org.telegram.ui.ActionBar.e6 resourceProvider = wmVar.getResourceProvider();
            final long j14 = g11Var.f33927f;
            pn pnVar = new pn(I, currentAccount, j14, j13, wmVar, resourceProvider);
            final f60 J = I.J();
            J.c(2131232057, org.telegram.messenger.bd.M0(2131753756, null), new org.telegram.ui.xp0(I, 27), false);
            J.c(2131232403, org.telegram.messenger.bd.M0(2131745285, null), new Runnable() {
                @Override
                public final void run() {
                    f60.this.u();
                    SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(currentAccount).f22989d7;
                    StringBuilder sb2 = new StringBuilder("sound_enabled_");
                    long j15 = j14;
                    long j16 = j13;
                    sb2.append(org.telegram.messenger.us.v(j15, j16, false));
                    boolean z13 = sharedPreferences.getBoolean(sb2.toString(), true);
                    boolean z14 = !z13 ? 1 : 0;
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putBoolean("sound_enabled_" + org.telegram.messenger.us.v(j15, j16, false), z14).apply();
                    J.u();
                    org.telegram.ui.ActionBar.d2 d2Var = wmVar;
                    if (fc.a(d2Var)) {
                        fc.S(z13 ? 1 : 0, d2Var, resourceProvider).j();
                    }
                }
            }, false);
            final org.telegram.ui.ActionBar.y0 y10 = J.y();
            J.c(2131232258, org.telegram.messenger.bd.M0(2131748316, null), new bi.q0(I, resourceProvider, currentAccount, pnVar, 22), false);
            J.c(2131232106, org.telegram.messenger.bd.M0(2131747925, null), new rn(I, j14, j13, wmVar, resourceProvider), false);
            J.c(0, "", new ci.p9(I, currentAccount, j14, j13, wmVar, resourceProvider), false);
            final org.telegram.ui.ActionBar.y0 y11 = J.y();
            new Runnable() {
                @Override
                public final void run() {
                    int i19;
                    int i20 = currentAccount;
                    org.telegram.messenger.hp s14 = org.telegram.messenger.hp.s1(i20);
                    long j15 = j14;
                    long j16 = j13;
                    boolean r22 = s14.r2(j15, j16, null);
                    org.telegram.ui.ActionBar.y0 y0Var = y11;
                    org.telegram.ui.ActionBar.y0 y0Var2 = y10;
                    if (r22) {
                        y0Var.j(org.telegram.messenger.bd.M0(2131743858, null), 2131232412, null);
                        i19 = org.telegram.ui.ActionBar.k6.f28254x6;
                        y0Var2.setVisibility(8);
                    } else {
                        y0Var.j(org.telegram.messenger.bd.M0(2131748314, null), 2131232256, null);
                        int i21 = org.telegram.ui.ActionBar.k6.f28122q7;
                        y0Var2.setVisibility(0);
                        if (org.telegram.messenger.hp.s1(i20).s2(j15, j16)) {
                            y0Var2.j(org.telegram.messenger.bd.M0(2131745287, null), 2131232402, null);
                        } else {
                            y0Var2.j(org.telegram.messenger.bd.M0(2131745285, null), 2131232403, null);
                        }
                        i19 = i21;
                    }
                    xn.c(y0Var, i19);
                }
            }.run();
            long j15 = g11Var.f33927f;
            org.telegram.messenger.hp hpVar2 = hpVar;
            boolean r22 = hpVar2.r2(j15, tL_forumTopic2.f27053id, null);
            if (r22) {
                i12 = 2131232412;
            } else {
                i12 = 2131232256;
            }
            int i19 = i12;
            if (r22) {
                i13 = 2131743859;
            } else {
                i13 = 2131748322;
            }
            TLRPC.Chat chat3 = chat;
            g11Var2 = this;
            final f60 f60Var4 = I;
            f60Var4.c(i19, org.telegram.messenger.bd.M0(i13, null), new org.telegram.ui.lq(g11Var2, hpVar2, tL_forumTopic, I, J, 4), false);
            if (org.telegram.messenger.t3.i(i17, chat3, tL_forumTopic) && !org.telegram.messenger.l10.u(user)) {
                boolean z13 = tL_forumTopic.closed;
                if (z13) {
                    i15 = 2131232406;
                } else {
                    i15 = 2131232404;
                }
                if (z13) {
                    i16 = 2131746094;
                } else {
                    i16 = 2131752039;
                }
                i14 = 1;
                z11 = false;
                f60Var4.c(i15, org.telegram.messenger.bd.M0(i16, null), new Runnable(g11Var2) {
                    public final g11 f38214b;

                    {
                        this.f38214b = g11Var2;
                    }

                    @Override
                    public final void run() {
                        g11 g11Var3;
                        int i192 = r4;
                        g11 g11Var4 = this.f38214b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                        f60 f60Var42 = f60Var4;
                        switch (i192) {
                            case 0:
                                f60Var42.u();
                                g11Var4.f33937s.presentFragment(l81.f0(-g11Var4.f33927f, tL_forumTopic3.f27053id));
                                return;
                            case 1:
                                g11Var4.getClass();
                                f60Var42.u();
                                org.telegram.messenger.hp.s1(g11Var4.f33925e).f23102q7.z(tL_forumTopic3.f27053id, -g11Var4.f33927f, true ^ tL_forumTopic3.closed);
                                return;
                            default:
                                f60Var42.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.f27053id));
                                go goVar = new go(11);
                                g11 g11Var5 = this.f38214b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g11Var5.getContext());
                                String K0 = org.telegram.messenger.bd.K0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                                s1Var.S = K0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = g11Var5.f33928f0;
                                if (hashSet.size() == 1) {
                                    g11Var3 = g11Var5;
                                    s1Var.U = org.telegram.messenger.bd.a0(null, null, 2131751499, org.telegram.messenger.hp.s1(g11Var5.f33925e).f23102q7.f(-g11Var5.f33927f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    g11Var3 = g11Var5;
                                    s1Var.U = org.telegram.messenger.bd.M0(2131751498, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new ci.x3(g11Var3, arrayList, j132, hashSet, goVar));
                                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new lf0(14));
                                s1Var.show();
                                TextView textView = (TextView) s1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            } else {
                z11 = false;
                i14 = 1;
            }
            f60Var = f60Var4;
            if (org.telegram.messenger.t3.e(i17, chat3, tL_forumTopic)) {
                f60Var4.c(2131232108, org.telegram.messenger.bd.K0(i14, "DeleteTopics"), new Runnable(g11Var2) {
                    public final g11 f38214b;

                    {
                        this.f38214b = g11Var2;
                    }

                    @Override
                    public final void run() {
                        g11 g11Var3;
                        int i192 = r4;
                        g11 g11Var4 = this.f38214b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                        f60 f60Var42 = f60Var4;
                        switch (i192) {
                            case 0:
                                f60Var42.u();
                                g11Var4.f33937s.presentFragment(l81.f0(-g11Var4.f33927f, tL_forumTopic3.f27053id));
                                return;
                            case 1:
                                g11Var4.getClass();
                                f60Var42.u();
                                org.telegram.messenger.hp.s1(g11Var4.f33925e).f23102q7.z(tL_forumTopic3.f27053id, -g11Var4.f33927f, true ^ tL_forumTopic3.closed);
                                return;
                            default:
                                f60Var42.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.f27053id));
                                go goVar = new go(11);
                                g11 g11Var5 = this.f38214b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g11Var5.getContext());
                                String K0 = org.telegram.messenger.bd.K0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                                s1Var.S = K0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = g11Var5.f33928f0;
                                if (hashSet.size() == 1) {
                                    g11Var3 = g11Var5;
                                    s1Var.U = org.telegram.messenger.bd.a0(null, null, 2131751499, org.telegram.messenger.hp.s1(g11Var5.f33925e).f23102q7.f(-g11Var5.f33927f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    g11Var3 = g11Var5;
                                    s1Var.U = org.telegram.messenger.bd.M0(2131751498, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new ci.x3(g11Var3, arrayList, j132, hashSet, goVar));
                                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new lf0(14));
                                s1Var.show();
                                TextView textView = (TextView) s1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, z11);
                f60Var = f60Var4;
            }
        }
        boolean z14 = view instanceof b11;
        org.telegram.ui.ActionBar.e6 e6Var = g11Var2.h;
        if (z14) {
            ?? drawable = new Drawable();
            Paint paint = new Paint(1);
            drawable.f40187a = paint;
            drawable.f40188b = new RectF();
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, e6Var));
            f60Var.W(drawable);
            f60Var.a0(org.telegram.messenger.g0.L(16.0f), 0.0f);
        } else if (z10) {
            f60Var.W(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, e6Var)));
            f60Var.V(5);
        } else {
            int L = org.telegram.messenger.g0.L(5.0f);
            int L2 = org.telegram.messenger.g0.L(5.0f);
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, e6Var);
            float f10 = 0;
            float f11 = L;
            float f12 = L2;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f11, f11, f12, f12, f10, f10}, null, null));
            shapeDrawable.getPaint().setColor(w02);
            f60Var.W(shapeDrawable);
        }
        f60Var.Z();
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setAttached(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        i();
    }

    public final void p() {
        org.telegram.ui.yd ydVar = this.S;
        if (ydVar != null) {
            ydVar.run();
        }
        i();
        float k10 = k(c11.f32502b);
        int i3 = 0;
        FrameLayout frameLayout = this.J;
        frameLayout.setTranslationX(org.telegram.messenger.g0.W1(k10, -org.telegram.messenger.g0.L(78.0f), 0));
        if (k10 <= 0.0f) {
            i3 = 8;
        }
        frameLayout.setVisibility(i3);
        e();
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        ImageView imageView = this.F;
        org.telegram.ui.ActionBar.e6 e6Var = this.h;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, e6Var, mode);
        org.telegram.ui.ActionBar.r6.t(this.G, i10, e6Var, mode);
        invalidate();
    }

    public final void q() {
        g(true);
        u01 u01Var = this.f33940y;
        boolean canScrollHorizontally = u01Var.canScrollHorizontally(-1);
        u01Var.f35594g3.O(true);
        if (!canScrollHorizontally) {
            u01Var.v0(0);
        }
        w01 w01Var = this.K;
        boolean canScrollVertically = w01Var.canScrollVertically(-1);
        w01Var.f35594g3.O(true);
        if (!canScrollVertically) {
            w01Var.v0(0);
        }
        org.telegram.messenger.g0.h3(new r01(this, 0));
    }

    public final void r(boolean z10) {
        boolean z11;
        if (this.f33922c && !this.d) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f33920b.a(z11, z10);
    }

    public void setAllTopicsHidden(boolean z10) {
        if (this.f33933k0 != z10) {
            this.f33933k0 = z10;
            g(true);
        }
    }

    public void setCurrentTopic(long j10) {
        boolean z10;
        this.f33928f0 = j10;
        u01 u01Var = this.f33940y;
        u01Var.f35594g3.O(true);
        u01Var.invalidate();
        this.K.f35594g3.O(true);
        f11 f11Var = this.E;
        if (f11Var != null) {
            if (j10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            f11Var.c(true, false, z10);
        }
    }

    public void setOnDialogSelected(org.telegram.messenger.n10 n10Var) {
        this.f33932j0 = n10Var;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.f33931i0 = runnable;
    }

    public void setOnTopicSelected(org.telegram.messenger.n10 n10Var) {
        this.f33930h0 = n10Var;
    }

    public void setSideMenuBackgroundDrawable(gh.g gVar) {
        this.O = gVar;
        gVar.r(org.telegram.messenger.g0.L(16.0f));
        this.O.q(org.telegram.messenger.g0.L(7.0f));
    }

    public void setSideMenuBackgroundMarginBottom(float f10) {
        this.Q = f10;
        i();
        f();
        invalidate();
    }

    public void setSideMenuBackgroundMarginTop(float f10) {
        this.R = f10;
        this.J.setTranslationY(f10);
        i();
        f();
        invalidate();
    }

    public void setTabsEnabled(boolean z10) {
        if (this.f33922c == z10) {
            return;
        }
        this.f33922c = z10;
        if (!z10) {
            d(false);
        }
        r(true);
    }

    public void setTopMenuBackgroundDrawable(gh.g gVar) {
        this.P = gVar;
        gVar.r(org.telegram.messenger.g0.L(18.0f));
        this.P.q(org.telegram.messenger.g0.L(7.0f));
    }

    @Override
    public final void updateColors() {
        try {
            e();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
