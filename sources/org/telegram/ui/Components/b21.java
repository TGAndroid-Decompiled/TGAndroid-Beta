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
import org.telegram.ui.w81;
public final class b21 extends FrameLayout implements org.telegram.messenger.fs, te.b, org.telegram.ui.ActionBar.b6 {
    public static final int m0 = 0;
    public final a21 E;
    public final ImageView F;
    public final ImageView G;
    public final ImageView H;
    public final ImageView I;
    public final FrameLayout J;
    public final q11 K;
    public long L;
    public long M;
    public final te.a N;
    public fh.g O;
    public fh.g P;
    public float Q;
    public float R;
    public org.telegram.ui.zd S;
    public boolean T;
    public boolean U;
    public float V;
    public boolean W;
    public final te.a f33703a;
    public boolean f33704a0;
    public final te.a f33705b;
    public int f33706b0;
    public boolean f33707c;
    public int f33708c0;
    public boolean d;
    public Boolean f33709d0;
    public final int f33710e;
    public ValueAnimator f33711e0;
    public final long f33712f;
    public long f33713f0;
    public boolean f33714g0;
    public final org.telegram.ui.ActionBar.h6 h;
    public org.telegram.messenger.q10 f33715h0;
    public Runnable f33716i0;
    public org.telegram.messenger.q10 f33717j0;
    public boolean f33718k0;
    public final HashSet f33719l0;
    public final boolean f33720n;
    public final boolean f33721r;
    public final org.telegram.ui.bn f33722s;
    public final boolean f33723w;
    public final FrameLayout f33724x;
    public final o11 f33725y;

    public b21(Activity activity, org.telegram.ui.bn bnVar, int i7, long j3, boolean z10, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity);
        FrameLayout frameLayout;
        float f10;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        boolean z13;
        nr nrVar = nr.h;
        this.f33703a = new te.a(0, this, nrVar, 380L, true);
        this.f33705b = new te.a(1, this, nrVar, 380L, false);
        this.N = new te.a(0, new k11(this), nrVar, 320L, false);
        this.V = 0.0f;
        this.f33719l0 = new HashSet();
        this.f33722s = bnVar;
        this.f33707c = z10;
        this.f33710e = i7;
        this.f33712f = j3;
        this.h = h6Var;
        long j10 = -j3;
        this.f33720n = org.telegram.messenger.v3.p0(org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(j10)));
        boolean w10 = org.telegram.messenger.o10.w(org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(j3)));
        this.f33721r = w10;
        this.f33723w = !org.telegram.messenger.f3.w("topics_end_reached_", j10, org.telegram.messenger.j10.i(i7).k(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        ?? frameLayout2 = new FrameLayout(activity);
        this.f33724x = frameLayout2;
        addView(frameLayout2, c8.ma.d(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.J = frameLayout3;
        addView(frameLayout3, c8.ma.d(64, -1.0f, 115, 7.0f, 7.0f, 7.0f, 7.0f));
        o11 o11Var = new o11(this, activity, i7, new org.telegram.messenger.q10(this) {
            public final b21 f36362b;

            {
                this.f36362b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                boolean z14;
                boolean z15;
                int i12;
                long j11;
                org.telegram.messenger.e00 e00Var;
                long j12;
                boolean z16;
                ArrayList arrayList;
                boolean z17;
                boolean z18;
                long j13;
                long j14;
                boolean z19;
                boolean z20;
                int i13 = r2;
                b21 b21Var = this.f36362b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        c51 c51Var = (c51) obj2;
                        boolean z21 = b21Var.f33721r;
                        int i14 = b21Var.f33710e;
                        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i14);
                        long j15 = b21Var.f33712f;
                        long j16 = -j15;
                        TLRPC.Chat O0 = u12.O0(Long.valueOf(j16));
                        TLRPC.User c22 = org.telegram.messenger.mp.u1(i14).c2(Long.valueOf(j15));
                        org.telegram.messenger.e00 e00Var2 = org.telegram.messenger.mp.u1(i14).f25797t7;
                        ArrayList l10 = e00Var2.l(j16);
                        boolean z22 = b21Var.f33720n;
                        int i15 = v11.f40641b;
                        o41 K = o41.K(v11.class);
                        K.d = 0;
                        K.C = 0L;
                        K.H = null;
                        K.f38103r = z22;
                        if (b21Var.f33713f0 == 0) {
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
                                    if (tL_forumTopic.f28483id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (b21Var.f33719l0.contains(Integer.valueOf(tL_forumTopic.f28483id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z23 = tL_forumTopic.pinned;
                                    if (!z23 && z15) {
                                        if (!arrayList2.isEmpty()) {
                                            ((o41) i5.c.h(1, arrayList2)).f38110z |= 8;
                                        }
                                        c51Var.L();
                                        z15 = false;
                                    } else if (z23 && !z15) {
                                        c51Var.M();
                                        z15 = true;
                                    }
                                    o41 K2 = o41.K(v11.class);
                                    K2.f38109y = j15;
                                    K2.d = tL_forumTopic.f28483id;
                                    K2.H = tL_forumTopic;
                                    if (z22) {
                                        j11 = j15;
                                        K2.C = org.telegram.messenger.n5.o(tL_forumTopic.from_id);
                                        K2.J = false;
                                    } else {
                                        j11 = j15;
                                    }
                                    long j17 = b21Var.f33713f0;
                                    if (z22) {
                                        e00Var = e00Var2;
                                        j12 = org.telegram.messenger.n5.o(tL_forumTopic.from_id);
                                    } else {
                                        e00Var = e00Var2;
                                        j12 = tL_forumTopic.f28483id;
                                    }
                                    if (j17 == j12) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    K2.L(z16);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i12;
                                    e00Var2 = e00Var;
                                    j15 = j11;
                                }
                            }
                        } else {
                            z15 = false;
                        }
                        org.telegram.messenger.e00 e00Var3 = e00Var2;
                        if (z15) {
                            c51Var.L();
                        }
                        if (l10 != null && !l10.isEmpty() && !e00Var3.e(j16) && b21Var.f33723w) {
                            o41 K3 = o41.K(v11.class);
                            K3.d = -2;
                            K3.f38104s = true;
                            arrayList2.add(K3);
                            o41 K4 = o41.K(v11.class);
                            K4.d = -3;
                            K4.f38104s = true;
                            arrayList2.add(K4);
                            o41 K5 = o41.K(v11.class);
                            K5.d = -4;
                            K5.f38104s = true;
                            arrayList2.add(K5);
                        }
                        if (!z21 && !z22) {
                            if ((O0 != null && org.telegram.messenger.v3.w(15, O0)) || org.telegram.messenger.o10.w(c22)) {
                                o41 K6 = o41.K(v11.class);
                                K6.d = -2;
                                K6.C = -2L;
                                K6.H = null;
                                arrayList2.add(K6);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        ((Integer) obj).getClass();
                        b21.c(b21Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        c51 c51Var2 = (c51) obj2;
                        boolean z24 = b21Var.f33720n;
                        int i19 = b21Var.f33710e;
                        org.telegram.messenger.mp u13 = org.telegram.messenger.mp.u1(i19);
                        long j18 = b21Var.f33712f;
                        long j19 = -j18;
                        TLRPC.Chat O02 = u13.O0(Long.valueOf(j19));
                        TLRPC.User c23 = org.telegram.messenger.mp.u1(i19).c2(Long.valueOf(j18));
                        org.telegram.messenger.e00 e00Var4 = org.telegram.messenger.mp.u1(i19).f25797t7;
                        ArrayList l11 = e00Var4.l(j19);
                        boolean z25 = b21Var.f33721r;
                        if (!z25) {
                            int i20 = z11.f42633b;
                            o41 K7 = o41.K(z11.class);
                            K7.d = 0;
                            arrayList = l11;
                            K7.C = 0L;
                            K7.H = null;
                            K7.f38103r = z24;
                            K7.f38110z = z25 ? 1 : 0;
                            if (b21Var.f33713f0 == 0) {
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
                                TLRPC.User user = c23;
                                if (z25) {
                                    z18 = z26;
                                    if (tL_forumTopic2.f28483id == 1) {
                                        size2 = i22;
                                        c23 = user;
                                        z26 = z18;
                                    }
                                } else {
                                    z18 = z26;
                                }
                                if (b21Var.f33719l0.contains(Integer.valueOf(tL_forumTopic2.f28483id))) {
                                    size2 = i22;
                                    c23 = user;
                                    z26 = z18;
                                } else {
                                    boolean z27 = tL_forumTopic2.pinned;
                                    if (!z27 && z18) {
                                        c51Var2.L();
                                        z26 = false;
                                    } else if (z27 && !z18) {
                                        c51Var2.M();
                                        z26 = true;
                                    } else {
                                        z26 = z18;
                                    }
                                    int i23 = z11.f42633b;
                                    o41 K8 = o41.K(z11.class);
                                    K8.f38109y = j18;
                                    long j20 = j18;
                                    K8.d = tL_forumTopic2.f28483id;
                                    K8.H = tL_forumTopic2;
                                    if (z24) {
                                        K8.C = org.telegram.messenger.n5.o(tL_forumTopic2.from_id);
                                        K8.J = false;
                                    }
                                    long j21 = b21Var.f33713f0;
                                    if (z24) {
                                        j13 = j21;
                                        j14 = org.telegram.messenger.n5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j13 = j21;
                                        j14 = tL_forumTopic2.f28483id;
                                    }
                                    if (j13 == j14) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    K8.L(z19);
                                    arrayList3.add(K8);
                                    size2 = i22;
                                    c23 = user;
                                    j18 = j20;
                                }
                            }
                            z17 = z26;
                        } else {
                            z17 = false;
                        }
                        TLRPC.User user2 = c23;
                        if (z17) {
                            c51Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !e00Var4.e(j19) && b21Var.f33723w) {
                            int i24 = z11.f42633b;
                            o41 K9 = o41.K(z11.class);
                            K9.d = -2;
                            K9.f38104s = true;
                            K9.f38091e = false;
                            arrayList3.add(K9);
                            o41 K10 = o41.K(z11.class);
                            K10.d = -3;
                            K10.f38104s = true;
                            K10.f38091e = false;
                            arrayList3.add(K10);
                            o41 K11 = o41.K(z11.class);
                            K11.d = -4;
                            K11.f38104s = true;
                            K11.f38091e = false;
                            arrayList3.add(K11);
                        }
                        if (!z25 && !z24) {
                            if ((O02 != null && org.telegram.messenger.v3.w(15, O02)) || org.telegram.messenger.o10.w(user2)) {
                                int i25 = z11.f42633b;
                                o41 K12 = o41.K(z11.class);
                                K12.d = -2;
                                K12.C = -2L;
                                K12.H = null;
                                K12.f38103r = false;
                                arrayList3.add(K12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new k11(this), new k11(this), h6Var);
        this.f33725y = o11Var;
        o11Var.E1(new org.telegram.messenger.q10(this) {
            public final b21 f36362b;

            {
                this.f36362b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                boolean z14;
                boolean z15;
                int i12;
                long j11;
                org.telegram.messenger.e00 e00Var;
                long j12;
                boolean z16;
                ArrayList arrayList;
                boolean z17;
                boolean z18;
                long j13;
                long j14;
                boolean z19;
                boolean z20;
                int i13 = r2;
                b21 b21Var = this.f36362b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        c51 c51Var = (c51) obj2;
                        boolean z21 = b21Var.f33721r;
                        int i14 = b21Var.f33710e;
                        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i14);
                        long j15 = b21Var.f33712f;
                        long j16 = -j15;
                        TLRPC.Chat O0 = u12.O0(Long.valueOf(j16));
                        TLRPC.User c22 = org.telegram.messenger.mp.u1(i14).c2(Long.valueOf(j15));
                        org.telegram.messenger.e00 e00Var2 = org.telegram.messenger.mp.u1(i14).f25797t7;
                        ArrayList l10 = e00Var2.l(j16);
                        boolean z22 = b21Var.f33720n;
                        int i15 = v11.f40641b;
                        o41 K = o41.K(v11.class);
                        K.d = 0;
                        K.C = 0L;
                        K.H = null;
                        K.f38103r = z22;
                        if (b21Var.f33713f0 == 0) {
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
                                    if (tL_forumTopic.f28483id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (b21Var.f33719l0.contains(Integer.valueOf(tL_forumTopic.f28483id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z23 = tL_forumTopic.pinned;
                                    if (!z23 && z15) {
                                        if (!arrayList2.isEmpty()) {
                                            ((o41) i5.c.h(1, arrayList2)).f38110z |= 8;
                                        }
                                        c51Var.L();
                                        z15 = false;
                                    } else if (z23 && !z15) {
                                        c51Var.M();
                                        z15 = true;
                                    }
                                    o41 K2 = o41.K(v11.class);
                                    K2.f38109y = j15;
                                    K2.d = tL_forumTopic.f28483id;
                                    K2.H = tL_forumTopic;
                                    if (z22) {
                                        j11 = j15;
                                        K2.C = org.telegram.messenger.n5.o(tL_forumTopic.from_id);
                                        K2.J = false;
                                    } else {
                                        j11 = j15;
                                    }
                                    long j17 = b21Var.f33713f0;
                                    if (z22) {
                                        e00Var = e00Var2;
                                        j12 = org.telegram.messenger.n5.o(tL_forumTopic.from_id);
                                    } else {
                                        e00Var = e00Var2;
                                        j12 = tL_forumTopic.f28483id;
                                    }
                                    if (j17 == j12) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    K2.L(z16);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i12;
                                    e00Var2 = e00Var;
                                    j15 = j11;
                                }
                            }
                        } else {
                            z15 = false;
                        }
                        org.telegram.messenger.e00 e00Var3 = e00Var2;
                        if (z15) {
                            c51Var.L();
                        }
                        if (l10 != null && !l10.isEmpty() && !e00Var3.e(j16) && b21Var.f33723w) {
                            o41 K3 = o41.K(v11.class);
                            K3.d = -2;
                            K3.f38104s = true;
                            arrayList2.add(K3);
                            o41 K4 = o41.K(v11.class);
                            K4.d = -3;
                            K4.f38104s = true;
                            arrayList2.add(K4);
                            o41 K5 = o41.K(v11.class);
                            K5.d = -4;
                            K5.f38104s = true;
                            arrayList2.add(K5);
                        }
                        if (!z21 && !z22) {
                            if ((O0 != null && org.telegram.messenger.v3.w(15, O0)) || org.telegram.messenger.o10.w(c22)) {
                                o41 K6 = o41.K(v11.class);
                                K6.d = -2;
                                K6.C = -2L;
                                K6.H = null;
                                arrayList2.add(K6);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        ((Integer) obj).getClass();
                        b21.c(b21Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        c51 c51Var2 = (c51) obj2;
                        boolean z24 = b21Var.f33720n;
                        int i19 = b21Var.f33710e;
                        org.telegram.messenger.mp u13 = org.telegram.messenger.mp.u1(i19);
                        long j18 = b21Var.f33712f;
                        long j19 = -j18;
                        TLRPC.Chat O02 = u13.O0(Long.valueOf(j19));
                        TLRPC.User c23 = org.telegram.messenger.mp.u1(i19).c2(Long.valueOf(j18));
                        org.telegram.messenger.e00 e00Var4 = org.telegram.messenger.mp.u1(i19).f25797t7;
                        ArrayList l11 = e00Var4.l(j19);
                        boolean z25 = b21Var.f33721r;
                        if (!z25) {
                            int i20 = z11.f42633b;
                            o41 K7 = o41.K(z11.class);
                            K7.d = 0;
                            arrayList = l11;
                            K7.C = 0L;
                            K7.H = null;
                            K7.f38103r = z24;
                            K7.f38110z = z25 ? 1 : 0;
                            if (b21Var.f33713f0 == 0) {
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
                                TLRPC.User user = c23;
                                if (z25) {
                                    z18 = z26;
                                    if (tL_forumTopic2.f28483id == 1) {
                                        size2 = i22;
                                        c23 = user;
                                        z26 = z18;
                                    }
                                } else {
                                    z18 = z26;
                                }
                                if (b21Var.f33719l0.contains(Integer.valueOf(tL_forumTopic2.f28483id))) {
                                    size2 = i22;
                                    c23 = user;
                                    z26 = z18;
                                } else {
                                    boolean z27 = tL_forumTopic2.pinned;
                                    if (!z27 && z18) {
                                        c51Var2.L();
                                        z26 = false;
                                    } else if (z27 && !z18) {
                                        c51Var2.M();
                                        z26 = true;
                                    } else {
                                        z26 = z18;
                                    }
                                    int i23 = z11.f42633b;
                                    o41 K8 = o41.K(z11.class);
                                    K8.f38109y = j18;
                                    long j20 = j18;
                                    K8.d = tL_forumTopic2.f28483id;
                                    K8.H = tL_forumTopic2;
                                    if (z24) {
                                        K8.C = org.telegram.messenger.n5.o(tL_forumTopic2.from_id);
                                        K8.J = false;
                                    }
                                    long j21 = b21Var.f33713f0;
                                    if (z24) {
                                        j13 = j21;
                                        j14 = org.telegram.messenger.n5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j13 = j21;
                                        j14 = tL_forumTopic2.f28483id;
                                    }
                                    if (j13 == j14) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    K8.L(z19);
                                    arrayList3.add(K8);
                                    size2 = i22;
                                    c23 = user;
                                    j18 = j20;
                                }
                            }
                            z17 = z26;
                        } else {
                            z17 = false;
                        }
                        TLRPC.User user2 = c23;
                        if (z17) {
                            c51Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !e00Var4.e(j19) && b21Var.f33723w) {
                            int i24 = z11.f42633b;
                            o41 K9 = o41.K(z11.class);
                            K9.d = -2;
                            K9.f38104s = true;
                            K9.f38091e = false;
                            arrayList3.add(K9);
                            o41 K10 = o41.K(z11.class);
                            K10.d = -3;
                            K10.f38104s = true;
                            K10.f38091e = false;
                            arrayList3.add(K10);
                            o41 K11 = o41.K(z11.class);
                            K11.d = -4;
                            K11.f38104s = true;
                            K11.f38091e = false;
                            arrayList3.add(K11);
                        }
                        if (!z25 && !z24) {
                            if ((O02 != null && org.telegram.messenger.v3.w(15, O02)) || org.telegram.messenger.o10.w(user2)) {
                                int i25 = z11.f42633b;
                                o41 K12 = o41.K(z11.class);
                                K12.d = -2;
                                K12.C = -2L;
                                K12.H = null;
                                K12.f38103r = false;
                                arrayList3.add(K12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        o11Var.setWillNotDraw(false);
        o11Var.f35796g3.f34068r = false;
        o11Var.getContext();
        jg.i0 i0Var = new jg.i0((ViewGroup) o11Var, 7);
        o11Var.f35795f3 = i0Var;
        o11Var.setLayoutManager(i0Var);
        frameLayout2.addView(o11Var, c8.ma.d(-1, -1.0f, 119, 41.0f, 0.0f, 0.0f, 0.0f));
        o11Var.j(new p11(this, 0));
        if (w10) {
            a21 a21Var = new a21(i7, activity, h6Var);
            this.E = a21Var;
            if (this.f33713f0 == 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            a21Var.c(true, false, z13);
            a21Var.setOnClickListener(new View.OnClickListener(this) {
                public final b21 f36120b;

                {
                    this.f36120b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            b21 b21Var = this.f36120b;
                            q11 q11Var = b21Var.K;
                            q11Var.z1(false);
                            o11 o11Var2 = b21Var.f33725y;
                            o11Var2.z1(false);
                            b21Var.N.a(false, true);
                            org.telegram.messenger.g0.Z3(q11Var);
                            org.telegram.messenger.g0.Z3(o11Var2);
                            return;
                        case 1:
                            this.f36120b.f33715h0.a(0, Boolean.FALSE);
                            return;
                        default:
                            b21.b(this.f36120b);
                            return;
                    }
                }
            });
            frameLayout = frameLayout3;
            frameLayout.addView(a21Var, c8.ma.d(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            frameLayout = frameLayout3;
            this.E = null;
        }
        ViewGroup viewGroup = frameLayout;
        q11 q11Var = new q11(activity, i7, new org.telegram.messenger.q10(this) {
            public final b21 f36362b;

            {
                this.f36362b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                boolean z14;
                boolean z15;
                int i12;
                long j11;
                org.telegram.messenger.e00 e00Var;
                long j12;
                boolean z16;
                ArrayList arrayList;
                boolean z17;
                boolean z18;
                long j13;
                long j14;
                boolean z19;
                boolean z20;
                int i13 = r2;
                b21 b21Var = this.f36362b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        c51 c51Var = (c51) obj2;
                        boolean z21 = b21Var.f33721r;
                        int i14 = b21Var.f33710e;
                        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i14);
                        long j15 = b21Var.f33712f;
                        long j16 = -j15;
                        TLRPC.Chat O0 = u12.O0(Long.valueOf(j16));
                        TLRPC.User c22 = org.telegram.messenger.mp.u1(i14).c2(Long.valueOf(j15));
                        org.telegram.messenger.e00 e00Var2 = org.telegram.messenger.mp.u1(i14).f25797t7;
                        ArrayList l10 = e00Var2.l(j16);
                        boolean z22 = b21Var.f33720n;
                        int i15 = v11.f40641b;
                        o41 K = o41.K(v11.class);
                        K.d = 0;
                        K.C = 0L;
                        K.H = null;
                        K.f38103r = z22;
                        if (b21Var.f33713f0 == 0) {
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
                                    if (tL_forumTopic.f28483id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (b21Var.f33719l0.contains(Integer.valueOf(tL_forumTopic.f28483id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z23 = tL_forumTopic.pinned;
                                    if (!z23 && z15) {
                                        if (!arrayList2.isEmpty()) {
                                            ((o41) i5.c.h(1, arrayList2)).f38110z |= 8;
                                        }
                                        c51Var.L();
                                        z15 = false;
                                    } else if (z23 && !z15) {
                                        c51Var.M();
                                        z15 = true;
                                    }
                                    o41 K2 = o41.K(v11.class);
                                    K2.f38109y = j15;
                                    K2.d = tL_forumTopic.f28483id;
                                    K2.H = tL_forumTopic;
                                    if (z22) {
                                        j11 = j15;
                                        K2.C = org.telegram.messenger.n5.o(tL_forumTopic.from_id);
                                        K2.J = false;
                                    } else {
                                        j11 = j15;
                                    }
                                    long j17 = b21Var.f33713f0;
                                    if (z22) {
                                        e00Var = e00Var2;
                                        j12 = org.telegram.messenger.n5.o(tL_forumTopic.from_id);
                                    } else {
                                        e00Var = e00Var2;
                                        j12 = tL_forumTopic.f28483id;
                                    }
                                    if (j17 == j12) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    K2.L(z16);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i12;
                                    e00Var2 = e00Var;
                                    j15 = j11;
                                }
                            }
                        } else {
                            z15 = false;
                        }
                        org.telegram.messenger.e00 e00Var3 = e00Var2;
                        if (z15) {
                            c51Var.L();
                        }
                        if (l10 != null && !l10.isEmpty() && !e00Var3.e(j16) && b21Var.f33723w) {
                            o41 K3 = o41.K(v11.class);
                            K3.d = -2;
                            K3.f38104s = true;
                            arrayList2.add(K3);
                            o41 K4 = o41.K(v11.class);
                            K4.d = -3;
                            K4.f38104s = true;
                            arrayList2.add(K4);
                            o41 K5 = o41.K(v11.class);
                            K5.d = -4;
                            K5.f38104s = true;
                            arrayList2.add(K5);
                        }
                        if (!z21 && !z22) {
                            if ((O0 != null && org.telegram.messenger.v3.w(15, O0)) || org.telegram.messenger.o10.w(c22)) {
                                o41 K6 = o41.K(v11.class);
                                K6.d = -2;
                                K6.C = -2L;
                                K6.H = null;
                                arrayList2.add(K6);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        ((Integer) obj).getClass();
                        b21.c(b21Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        c51 c51Var2 = (c51) obj2;
                        boolean z24 = b21Var.f33720n;
                        int i19 = b21Var.f33710e;
                        org.telegram.messenger.mp u13 = org.telegram.messenger.mp.u1(i19);
                        long j18 = b21Var.f33712f;
                        long j19 = -j18;
                        TLRPC.Chat O02 = u13.O0(Long.valueOf(j19));
                        TLRPC.User c23 = org.telegram.messenger.mp.u1(i19).c2(Long.valueOf(j18));
                        org.telegram.messenger.e00 e00Var4 = org.telegram.messenger.mp.u1(i19).f25797t7;
                        ArrayList l11 = e00Var4.l(j19);
                        boolean z25 = b21Var.f33721r;
                        if (!z25) {
                            int i20 = z11.f42633b;
                            o41 K7 = o41.K(z11.class);
                            K7.d = 0;
                            arrayList = l11;
                            K7.C = 0L;
                            K7.H = null;
                            K7.f38103r = z24;
                            K7.f38110z = z25 ? 1 : 0;
                            if (b21Var.f33713f0 == 0) {
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
                                TLRPC.User user = c23;
                                if (z25) {
                                    z18 = z26;
                                    if (tL_forumTopic2.f28483id == 1) {
                                        size2 = i22;
                                        c23 = user;
                                        z26 = z18;
                                    }
                                } else {
                                    z18 = z26;
                                }
                                if (b21Var.f33719l0.contains(Integer.valueOf(tL_forumTopic2.f28483id))) {
                                    size2 = i22;
                                    c23 = user;
                                    z26 = z18;
                                } else {
                                    boolean z27 = tL_forumTopic2.pinned;
                                    if (!z27 && z18) {
                                        c51Var2.L();
                                        z26 = false;
                                    } else if (z27 && !z18) {
                                        c51Var2.M();
                                        z26 = true;
                                    } else {
                                        z26 = z18;
                                    }
                                    int i23 = z11.f42633b;
                                    o41 K8 = o41.K(z11.class);
                                    K8.f38109y = j18;
                                    long j20 = j18;
                                    K8.d = tL_forumTopic2.f28483id;
                                    K8.H = tL_forumTopic2;
                                    if (z24) {
                                        K8.C = org.telegram.messenger.n5.o(tL_forumTopic2.from_id);
                                        K8.J = false;
                                    }
                                    long j21 = b21Var.f33713f0;
                                    if (z24) {
                                        j13 = j21;
                                        j14 = org.telegram.messenger.n5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j13 = j21;
                                        j14 = tL_forumTopic2.f28483id;
                                    }
                                    if (j13 == j14) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    K8.L(z19);
                                    arrayList3.add(K8);
                                    size2 = i22;
                                    c23 = user;
                                    j18 = j20;
                                }
                            }
                            z17 = z26;
                        } else {
                            z17 = false;
                        }
                        TLRPC.User user2 = c23;
                        if (z17) {
                            c51Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !e00Var4.e(j19) && b21Var.f33723w) {
                            int i24 = z11.f42633b;
                            o41 K9 = o41.K(z11.class);
                            K9.d = -2;
                            K9.f38104s = true;
                            K9.f38091e = false;
                            arrayList3.add(K9);
                            o41 K10 = o41.K(z11.class);
                            K10.d = -3;
                            K10.f38104s = true;
                            K10.f38091e = false;
                            arrayList3.add(K10);
                            o41 K11 = o41.K(z11.class);
                            K11.d = -4;
                            K11.f38104s = true;
                            K11.f38091e = false;
                            arrayList3.add(K11);
                        }
                        if (!z25 && !z24) {
                            if ((O02 != null && org.telegram.messenger.v3.w(15, O02)) || org.telegram.messenger.o10.w(user2)) {
                                int i25 = z11.f42633b;
                                o41 K12 = o41.K(z11.class);
                                K12.d = -2;
                                K12.C = -2L;
                                K12.H = null;
                                K12.f38103r = false;
                                arrayList3.add(K12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new k11(this), new k11(this), h6Var);
        this.K = q11Var;
        q11Var.E1(new org.telegram.messenger.q10(this) {
            public final b21 f36362b;

            {
                this.f36362b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                boolean z14;
                boolean z15;
                int i12;
                long j11;
                org.telegram.messenger.e00 e00Var;
                long j12;
                boolean z16;
                ArrayList arrayList;
                boolean z17;
                boolean z18;
                long j13;
                long j14;
                boolean z19;
                boolean z20;
                int i13 = r2;
                b21 b21Var = this.f36362b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        c51 c51Var = (c51) obj2;
                        boolean z21 = b21Var.f33721r;
                        int i14 = b21Var.f33710e;
                        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i14);
                        long j15 = b21Var.f33712f;
                        long j16 = -j15;
                        TLRPC.Chat O0 = u12.O0(Long.valueOf(j16));
                        TLRPC.User c22 = org.telegram.messenger.mp.u1(i14).c2(Long.valueOf(j15));
                        org.telegram.messenger.e00 e00Var2 = org.telegram.messenger.mp.u1(i14).f25797t7;
                        ArrayList l10 = e00Var2.l(j16);
                        boolean z22 = b21Var.f33720n;
                        int i15 = v11.f40641b;
                        o41 K = o41.K(v11.class);
                        K.d = 0;
                        K.C = 0L;
                        K.H = null;
                        K.f38103r = z22;
                        if (b21Var.f33713f0 == 0) {
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
                                    if (tL_forumTopic.f28483id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (b21Var.f33719l0.contains(Integer.valueOf(tL_forumTopic.f28483id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z23 = tL_forumTopic.pinned;
                                    if (!z23 && z15) {
                                        if (!arrayList2.isEmpty()) {
                                            ((o41) i5.c.h(1, arrayList2)).f38110z |= 8;
                                        }
                                        c51Var.L();
                                        z15 = false;
                                    } else if (z23 && !z15) {
                                        c51Var.M();
                                        z15 = true;
                                    }
                                    o41 K2 = o41.K(v11.class);
                                    K2.f38109y = j15;
                                    K2.d = tL_forumTopic.f28483id;
                                    K2.H = tL_forumTopic;
                                    if (z22) {
                                        j11 = j15;
                                        K2.C = org.telegram.messenger.n5.o(tL_forumTopic.from_id);
                                        K2.J = false;
                                    } else {
                                        j11 = j15;
                                    }
                                    long j17 = b21Var.f33713f0;
                                    if (z22) {
                                        e00Var = e00Var2;
                                        j12 = org.telegram.messenger.n5.o(tL_forumTopic.from_id);
                                    } else {
                                        e00Var = e00Var2;
                                        j12 = tL_forumTopic.f28483id;
                                    }
                                    if (j17 == j12) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    K2.L(z16);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i12;
                                    e00Var2 = e00Var;
                                    j15 = j11;
                                }
                            }
                        } else {
                            z15 = false;
                        }
                        org.telegram.messenger.e00 e00Var3 = e00Var2;
                        if (z15) {
                            c51Var.L();
                        }
                        if (l10 != null && !l10.isEmpty() && !e00Var3.e(j16) && b21Var.f33723w) {
                            o41 K3 = o41.K(v11.class);
                            K3.d = -2;
                            K3.f38104s = true;
                            arrayList2.add(K3);
                            o41 K4 = o41.K(v11.class);
                            K4.d = -3;
                            K4.f38104s = true;
                            arrayList2.add(K4);
                            o41 K5 = o41.K(v11.class);
                            K5.d = -4;
                            K5.f38104s = true;
                            arrayList2.add(K5);
                        }
                        if (!z21 && !z22) {
                            if ((O0 != null && org.telegram.messenger.v3.w(15, O0)) || org.telegram.messenger.o10.w(c22)) {
                                o41 K6 = o41.K(v11.class);
                                K6.d = -2;
                                K6.C = -2L;
                                K6.H = null;
                                arrayList2.add(K6);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        ((Integer) obj).getClass();
                        b21.c(b21Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        c51 c51Var2 = (c51) obj2;
                        boolean z24 = b21Var.f33720n;
                        int i19 = b21Var.f33710e;
                        org.telegram.messenger.mp u13 = org.telegram.messenger.mp.u1(i19);
                        long j18 = b21Var.f33712f;
                        long j19 = -j18;
                        TLRPC.Chat O02 = u13.O0(Long.valueOf(j19));
                        TLRPC.User c23 = org.telegram.messenger.mp.u1(i19).c2(Long.valueOf(j18));
                        org.telegram.messenger.e00 e00Var4 = org.telegram.messenger.mp.u1(i19).f25797t7;
                        ArrayList l11 = e00Var4.l(j19);
                        boolean z25 = b21Var.f33721r;
                        if (!z25) {
                            int i20 = z11.f42633b;
                            o41 K7 = o41.K(z11.class);
                            K7.d = 0;
                            arrayList = l11;
                            K7.C = 0L;
                            K7.H = null;
                            K7.f38103r = z24;
                            K7.f38110z = z25 ? 1 : 0;
                            if (b21Var.f33713f0 == 0) {
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
                                TLRPC.User user = c23;
                                if (z25) {
                                    z18 = z26;
                                    if (tL_forumTopic2.f28483id == 1) {
                                        size2 = i22;
                                        c23 = user;
                                        z26 = z18;
                                    }
                                } else {
                                    z18 = z26;
                                }
                                if (b21Var.f33719l0.contains(Integer.valueOf(tL_forumTopic2.f28483id))) {
                                    size2 = i22;
                                    c23 = user;
                                    z26 = z18;
                                } else {
                                    boolean z27 = tL_forumTopic2.pinned;
                                    if (!z27 && z18) {
                                        c51Var2.L();
                                        z26 = false;
                                    } else if (z27 && !z18) {
                                        c51Var2.M();
                                        z26 = true;
                                    } else {
                                        z26 = z18;
                                    }
                                    int i23 = z11.f42633b;
                                    o41 K8 = o41.K(z11.class);
                                    K8.f38109y = j18;
                                    long j20 = j18;
                                    K8.d = tL_forumTopic2.f28483id;
                                    K8.H = tL_forumTopic2;
                                    if (z24) {
                                        K8.C = org.telegram.messenger.n5.o(tL_forumTopic2.from_id);
                                        K8.J = false;
                                    }
                                    long j21 = b21Var.f33713f0;
                                    if (z24) {
                                        j13 = j21;
                                        j14 = org.telegram.messenger.n5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j13 = j21;
                                        j14 = tL_forumTopic2.f28483id;
                                    }
                                    if (j13 == j14) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    K8.L(z19);
                                    arrayList3.add(K8);
                                    size2 = i22;
                                    c23 = user;
                                    j18 = j20;
                                }
                            }
                            z17 = z26;
                        } else {
                            z17 = false;
                        }
                        TLRPC.User user2 = c23;
                        if (z17) {
                            c51Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !e00Var4.e(j19) && b21Var.f33723w) {
                            int i24 = z11.f42633b;
                            o41 K9 = o41.K(z11.class);
                            K9.d = -2;
                            K9.f38104s = true;
                            K9.f38091e = false;
                            arrayList3.add(K9);
                            o41 K10 = o41.K(z11.class);
                            K10.d = -3;
                            K10.f38104s = true;
                            K10.f38091e = false;
                            arrayList3.add(K10);
                            o41 K11 = o41.K(z11.class);
                            K11.d = -4;
                            K11.f38104s = true;
                            K11.f38091e = false;
                            arrayList3.add(K11);
                        }
                        if (!z25 && !z24) {
                            if ((O02 != null && org.telegram.messenger.v3.w(15, O02)) || org.telegram.messenger.o10.w(user2)) {
                                int i25 = z11.f42633b;
                                o41 K12 = o41.K(z11.class);
                                K12.d = -2;
                                K12.C = -2L;
                                K12.H = null;
                                K12.f38103r = false;
                                arrayList3.add(K12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        q11Var.f35796g3.f34068r = false;
        q11Var.setClipToPadding(false);
        q11Var.setClipChildren(false);
        if (w10) {
            f10 = 90.0f;
        } else {
            f10 = 48.0f;
        }
        viewGroup.addView(q11Var, c8.ma.d(-1, -1.0f, 119, 0.0f, f10, 0.0f, 0.0f));
        q11Var.j(new p11(this, 1));
        ImageView j11 = j(activity, 2131231885, new View.OnClickListener(this) {
            public final b21 f36120b;

            {
                this.f36120b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        b21 b21Var = this.f36120b;
                        q11 q11Var2 = b21Var.K;
                        q11Var2.z1(false);
                        o11 o11Var2 = b21Var.f33725y;
                        o11Var2.z1(false);
                        b21Var.N.a(false, true);
                        org.telegram.messenger.g0.Z3(q11Var2);
                        org.telegram.messenger.g0.Z3(o11Var2);
                        return;
                    case 1:
                        this.f36120b.f33715h0.a(0, Boolean.FALSE);
                        return;
                    default:
                        b21.b(this.f36120b);
                        return;
                }
            }
        });
        this.H = j11;
        ImageView j12 = j(activity, 2131231885, new View.OnClickListener(this) {
            public final b21 f36120b;

            {
                this.f36120b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        b21 b21Var = this.f36120b;
                        q11 q11Var2 = b21Var.K;
                        q11Var2.z1(false);
                        o11 o11Var2 = b21Var.f33725y;
                        o11Var2.z1(false);
                        b21Var.N.a(false, true);
                        org.telegram.messenger.g0.Z3(q11Var2);
                        org.telegram.messenger.g0.Z3(o11Var2);
                        return;
                    case 1:
                        this.f36120b.f33715h0.a(0, Boolean.FALSE);
                        return;
                    default:
                        b21.b(this.f36120b);
                        return;
                }
            }
        });
        this.I = j12;
        frameLayout2.addView(j11, c8.ma.e(44, 36, 51));
        viewGroup.addView(j12, c8.ma.e(64, 48, 51));
        ImageView j13 = j(activity, 2131232359, new View.OnClickListener(this) {
            public final b21 f36120b;

            {
                this.f36120b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        b21 b21Var = this.f36120b;
                        q11 q11Var2 = b21Var.K;
                        q11Var2.z1(false);
                        o11 o11Var2 = b21Var.f33725y;
                        o11Var2.z1(false);
                        b21Var.N.a(false, true);
                        org.telegram.messenger.g0.Z3(q11Var2);
                        org.telegram.messenger.g0.Z3(o11Var2);
                        return;
                    case 1:
                        this.f36120b.f33715h0.a(0, Boolean.FALSE);
                        return;
                    default:
                        b21.b(this.f36120b);
                        return;
                }
            }
        });
        this.F = j13;
        ImageView j14 = j(activity, 2131232359, new View.OnClickListener(this) {
            public final b21 f36120b;

            {
                this.f36120b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        b21 b21Var = this.f36120b;
                        q11 q11Var2 = b21Var.K;
                        q11Var2.z1(false);
                        o11 o11Var2 = b21Var.f33725y;
                        o11Var2.z1(false);
                        b21Var.N.a(false, true);
                        org.telegram.messenger.g0.Z3(q11Var2);
                        org.telegram.messenger.g0.Z3(o11Var2);
                        return;
                    case 1:
                        this.f36120b.f33715h0.a(0, Boolean.FALSE);
                        return;
                    default:
                        b21.b(this.f36120b);
                        return;
                }
            }
        });
        this.G = j14;
        frameLayout2.addView(j13, c8.ma.e(44, 36, 51));
        viewGroup.addView(j14, c8.ma.e(64, 48, 51));
        org.telegram.messenger.mp.u1(i7).f25797t7.n(3, j10, false);
        SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(i7).h7;
        if (z10 && org.telegram.messenger.f3.w("topicssidetabs", j3, sharedPreferences, false)) {
            this.V = 1.0f;
            z11 = true;
            this.U = true;
        } else {
            z11 = true;
        }
        if (z10 && org.telegram.messenger.f3.w("topicssidetabsb", j3, sharedPreferences, false)) {
            z12 = z11;
        } else {
            z12 = false;
        }
        this.T = z12;
        if (z12) {
            i10 = 2131231887;
        } else {
            i10 = 2131231884;
        }
        j12.setImageResource(i10);
        r(false);
        if (!this.T) {
            i11 = 2131231885;
        } else {
            i11 = 2131231887;
        }
        j11.setImageResource(i11);
        g(false);
        h();
        p();
        q();
    }

    public static void a(b21 b21Var, o41 o41Var) {
        if (b21Var.f33720n) {
            org.telegram.messenger.q10 q10Var = b21Var.f33717j0;
            if (q10Var != null) {
                q10Var.a(Long.valueOf(o41Var.C), Boolean.FALSE);
            }
        } else if (o41Var.C == -2) {
            Runnable runnable = b21Var.f33716i0;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            org.telegram.messenger.q10 q10Var2 = b21Var.f33715h0;
            if (q10Var2 != null) {
                q10Var2.a(Integer.valueOf(o41Var.d), Boolean.FALSE);
            }
        }
    }

    public static void b(b21 b21Var) {
        boolean z10 = b21Var.U;
        boolean z11 = true;
        if (!z10 && b21Var.T && b21Var.f33709d0 == null && !b21Var.W) {
            if (b21Var.d) {
                return;
            }
            b21Var.d = true;
            b21Var.r(true);
        } else if ((r2 = b21Var.f33709d0) != null) {
            z11 = false;
            b21Var.d(z11);
        } else {
            z11 = false;
            b21Var.d(z11);
        }
    }

    public static void c(b21 b21Var, ArrayList arrayList) {
        long j3 = b21Var.f33712f;
        org.telegram.messenger.e00 e00Var = org.telegram.messenger.mp.u1(b21Var.f33710e).f25797t7;
        ArrayList arrayList2 = new ArrayList();
        int i7 = 0;
        while (i7 < arrayList.size()) {
            i7 = com.google.android.gms.internal.vision.e2.f(((o41) arrayList.get(i7)).d, i7, 1, arrayList2);
        }
        long j10 = -j3;
        e00Var.w(arrayList2, j10);
        e00Var.y(j10, false);
    }

    public static ImageView j(Context context, int i7, View.OnClickListener onClickListener) {
        ImageView e10 = org.telegram.messenger.n10.e(context, i7);
        e10.setScaleType(ImageView.ScaleType.CENTER);
        e10.setOnClickListener(onClickListener);
        c8.ra.a(e10);
        return e10;
    }

    private void setAttached(boolean z10) {
        if (this.f33714g0 == z10) {
            return;
        }
        this.f33714g0 = z10;
        int i7 = 0;
        int i10 = org.telegram.messenger.ks.f25205r;
        int i11 = org.telegram.messenger.ks.f25224t5;
        long j3 = this.f33712f;
        int i12 = this.f33710e;
        if (z10) {
            org.telegram.messenger.ks.f(i12).c(this, i11);
            org.telegram.messenger.ks.f(i12).c(this, i10);
            org.telegram.messenger.e00 e00Var = org.telegram.messenger.mp.u1(i12).f25797t7;
            long j10 = -j3;
            LongSparseIntArray longSparseIntArray = e00Var.f23654r;
            longSparseIntArray.put(j10, longSparseIntArray.get(j10, 0) + 1);
            e00Var.y(j10, true);
            return;
        }
        long j11 = -j3;
        LongSparseIntArray longSparseIntArray2 = org.telegram.messenger.mp.u1(i12).f25797t7.f23654r;
        int i13 = longSparseIntArray2.get(j11, 0) - 1;
        if (i13 >= 0) {
            i7 = i13;
        }
        longSparseIntArray2.put(j11, i7);
        org.telegram.messenger.ks.f(i12).n(this, i11);
        org.telegram.messenger.ks.f(i12).n(this, i10);
    }

    @Override
    public final void D(float f10, int i7) {
        if (i7 == 1 && f10 == 1.0f && this.d) {
            this.d = false;
            this.T = false;
            this.H.setImageResource(2131231885);
            this.I.setImageResource(2131231884);
            SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(this.f33710e).h7.edit();
            edit.putBoolean("topicssidetabsb" + this.f33712f, false).apply();
            r(true);
        }
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        p();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29789z6));
    }

    public final void d(boolean z10) {
        float f10;
        if (this.U == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.f33711e0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (this.W) {
                this.f33709d0 = Boolean.valueOf(z10);
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
        this.f33711e0 = ofFloat;
        ofFloat.addUpdateListener(new h60(this, 28));
        this.f33711e0.addListener(new org.telegram.ui.on(22, this, z10));
        this.f33711e0.setInterpolator(pi.k.V);
        this.f33711e0.setDuration(250L);
        this.f33711e0.start();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ks.f25224t5;
        long j3 = this.f33712f;
        if (i7 == i11) {
            if (((Long) objArr[0]).longValue() == (-j3)) {
                q();
            }
        } else if (i7 == org.telegram.messenger.ks.f25205r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i12 = org.telegram.messenger.mp.I8;
            if ((intValue & 512) > 0) {
                org.telegram.messenger.mp.u1(this.f33710e).f25797t7.y(-j3, false);
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
        FrameLayout frameLayout2 = this.f33724x;
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        canvas.save();
        if (view == this.J) {
            canvas.clipPath(this.O.R.f11673k);
        }
        if (view == this.f33724x) {
            canvas.clipPath(this.P.R.f11673k);
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        int i7 = org.telegram.ui.ActionBar.m6.f29789z6;
        org.telegram.ui.ActionBar.h6 h6Var = this.h;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, h6Var);
        int f10 = i0.a.f(1.0f - this.V, w02, w03);
        int f11 = i0.a.f(this.V, w02, w03);
        boolean z10 = this.f33704a0;
        this.f33704a0 = true;
        ImageView imageView = this.H;
        if (imageView != null && (!z10 || f10 != this.f33706b0)) {
            imageView.setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
        }
        this.f33706b0 = f10;
        ImageView imageView2 = this.I;
        if (imageView2 != null && (!z10 || f11 != this.f33708c0)) {
            imageView2.setColorFilter(new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN));
        }
        this.f33708c0 = f11;
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
        ArrayList l10 = org.telegram.messenger.mp.u1(this.f33710e).f25797t7.l(-this.f33712f);
        if (l10 != null && !l10.isEmpty() && !this.f33718k0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f33703a.a(z11, z10);
    }

    public x11 getCurrentTabsPosition() {
        if (this.U) {
            return x11.f41954b;
        }
        if (this.T) {
            return x11.f41955c;
        }
        return x11.f41953a;
    }

    public float getSideMenuT() {
        return this.V * this.f33703a.f57696e;
    }

    public final void h() {
        int i7;
        int i10;
        int i11;
        te.a aVar = this.N;
        float f10 = aVar.f57696e;
        ImageView imageView = this.F;
        imageView.setAlpha(f10);
        imageView.setScaleX(org.telegram.messenger.g0.T1(0.4f, 1.0f, f10));
        imageView.setScaleY(org.telegram.messenger.g0.T1(0.4f, 1.0f, f10));
        int i12 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        int i13 = 8;
        if (i12 > 0) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        imageView.setVisibility(i7);
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
        float f11 = 1.0f - aVar.f57696e;
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
        int i7;
        float T1 = org.telegram.messenger.g0.T1(1.0f, 0.0f, this.V);
        FrameLayout frameLayout = this.f33724x;
        frameLayout.setAlpha(T1);
        if ((1.0f - this.f33705b.f57696e) * (1.0f - this.V) * this.f33703a.f57696e > 0.0f) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        frameLayout.setVisibility(i7);
        if (this.T) {
            frameLayout.setTranslationY(((getMeasuredHeight() - org.telegram.messenger.g0.L(50.0f)) - this.Q) + org.telegram.messenger.g0.W1(k(x11.f41955c), org.telegram.messenger.g0.L(43.0f), 0));
            return;
        }
        frameLayout.setTranslationY(this.R + org.telegram.messenger.g0.W1(k(x11.f41953a), -org.telegram.messenger.g0.L(43.0f), 0));
    }

    public final float k(x11 x11Var) {
        float f10 = (1.0f - this.f33705b.f57696e) * this.f33703a.f57696e;
        if (x11Var == x11.f41954b) {
            return this.V * f10;
        }
        if ((x11Var == x11.f41953a && !this.T) || (x11Var == x11.f41955c && this.T)) {
            return (1.0f - this.V) * f10;
        }
        return 0.0f;
    }

    public final boolean l() {
        if (this.V > 0.5f) {
            int i7 = 0;
            while (true) {
                q11 q11Var = this.K;
                if (i7 >= q11Var.getChildCount()) {
                    break;
                }
                o41 G = q11Var.f35796g3.G(RecyclerView.R(q11Var.getChildAt(i7)));
                if (G == null || !G.f38104s) {
                    i7++;
                } else {
                    return true;
                }
            }
        } else {
            int i10 = 0;
            while (true) {
                o11 o11Var = this.f33725y;
                if (i10 >= o11Var.getChildCount()) {
                    break;
                }
                o41 G2 = o11Var.f35796g3.G(RecyclerView.R(o11Var.getChildAt(i10)));
                if (G2 != null && G2.f38104s) {
                    return true;
                }
                i10++;
            }
        }
        return false;
    }

    public final void m() {
        org.telegram.messenger.e00 e00Var = org.telegram.messenger.mp.u1(this.f33710e).f25797t7;
        long j3 = this.f33712f;
        if (!e00Var.e(-j3)) {
            e00Var.o(-j3);
        }
    }

    public final void n(long j3, boolean z10) {
        if (this.f33720n) {
            org.telegram.messenger.q10 q10Var = this.f33717j0;
            if (q10Var != null) {
                q10Var.a(Long.valueOf(j3), Boolean.valueOf(z10));
                return;
            }
            return;
        }
        org.telegram.messenger.q10 q10Var2 = this.f33715h0;
        if (q10Var2 != null) {
            q10Var2.a(Integer.valueOf((int) j3), Boolean.valueOf(z10));
        }
    }

    public final boolean o(final TLRPC.TL_forumTopic tL_forumTopic, View view, boolean z10) {
        TLRPC.Chat chat;
        TLRPC.User user;
        int i7;
        int i10;
        org.telegram.messenger.mp mpVar;
        final b21 b21Var;
        final TLRPC.TL_forumTopic tL_forumTopic2;
        int i11;
        int i12;
        int i13;
        final b21 b21Var2;
        boolean z11;
        int i14;
        int i15;
        int i16;
        a70 a70Var;
        int i17 = this.f33710e;
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i17);
        long j3 = this.f33712f;
        int i18 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i18 < 0) {
            chat = u12.O0(Long.valueOf(-j3));
        } else {
            chat = null;
        }
        if (i18 > 0) {
            user = u12.c2(Long.valueOf(j3));
        } else {
            user = null;
        }
        final org.telegram.ui.bn bnVar = this.f33722s;
        final a70 J = a70.J(bnVar, view);
        if (org.telegram.messenger.v3.p0(chat)) {
            long o4 = org.telegram.messenger.n5.o(tL_forumTopic.from_id);
            if (o4 == 0 || !org.telegram.messenger.v3.A(i17, chat, 24)) {
                return false;
            }
            TLRPC.Chat chat2 = chat;
            a70 a70Var2 = J;
            a70Var2.c(2131232094, org.telegram.messenger.gd.N0(2131752077, null), new di.j2(this, a70Var2, o4, chat2, 16), false);
            long j10 = chat2.f28431id;
            if (org.telegram.messenger.v3.p0(chat2) && org.telegram.messenger.v3.A(i17, chat2, 24)) {
                long j11 = chat2.linked_monoforum_id;
                if (j11 != 0) {
                    j10 = j11;
                }
            }
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i17).O0(Long.valueOf(j10));
            TLRPC.User c22 = org.telegram.messenger.mp.u1(i17).c2(Long.valueOf(o4));
            a70 a70Var3 = a70Var2;
            if (c22 != null) {
                a70Var3 = a70Var2;
                if (org.telegram.messenger.v3.w(2, O0)) {
                    a70Var2.c(2131232330, org.telegram.messenger.gd.N0(2131753723, null), null, false);
                    org.telegram.ui.ActionBar.y0 z12 = a70Var2.z();
                    z12.setVisibility(8);
                    org.telegram.messenger.mp u13 = org.telegram.messenger.mp.u1(i17);
                    di.p2 p2Var = new di.p2(this, z12, a70Var2, j10, c22, O0);
                    a70Var3 = a70Var2;
                    u13.M0(O0, c22, p2Var);
                }
            }
            b21Var2 = this;
            a70Var = a70Var3;
        } else {
            if (!org.telegram.messenger.v3.y(15, chat) && !org.telegram.messenger.o10.w(user)) {
                i11 = 15;
                tL_forumTopic2 = tL_forumTopic;
                mpVar = u12;
                b21Var = this;
            } else {
                boolean z13 = tL_forumTopic.pinned;
                if (z13) {
                    i7 = 2131232415;
                } else {
                    i7 = 2131232295;
                }
                if (z13) {
                    i10 = 2131751440;
                } else {
                    i10 = 2131751441;
                }
                mpVar = u12;
                b21Var = this;
                tL_forumTopic2 = tL_forumTopic;
                J.c(i7, org.telegram.messenger.gd.N0(i10, null), new q20(this, J, mpVar, tL_forumTopic, 11), false);
                if (tL_forumTopic2.pinned && !z10) {
                    J.c(2131232775, org.telegram.messenger.gd.N0(2131750693, null), new l11(b21Var, 1), false);
                }
                i11 = 15;
            }
            if (org.telegram.messenger.v3.y(i11, chat) || org.telegram.messenger.o10.w(user)) {
                J.c(2131232494, org.telegram.messenger.gd.N0(2131751204, null), new Runnable(b21Var) {
                    public final b21 f37744b;

                    {
                        this.f37744b = b21Var;
                    }

                    @Override
                    public final void run() {
                        b21 b21Var3;
                        int i19 = r4;
                        b21 b21Var4 = this.f37744b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic2;
                        a70 a70Var4 = J;
                        switch (i19) {
                            case 0:
                                a70Var4.v();
                                b21Var4.f33722s.presentFragment(w81.f0(-b21Var4.f33712f, tL_forumTopic3.f28483id));
                                return;
                            case 1:
                                b21Var4.getClass();
                                a70Var4.v();
                                org.telegram.messenger.mp.u1(b21Var4.f33710e).f25797t7.z(tL_forumTopic3.f28483id, -b21Var4.f33712f, true ^ tL_forumTopic3.closed);
                                return;
                            default:
                                a70Var4.v();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.f28483id));
                                me meVar = new me(15);
                                b21 b21Var5 = this.f37744b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b21Var5.getContext());
                                String K0 = org.telegram.messenger.gd.K0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
                                t1Var.S = K0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j12 = b21Var5.f33713f0;
                                if (hashSet.size() == 1) {
                                    b21Var3 = b21Var5;
                                    t1Var.U = org.telegram.messenger.gd.a0(null, null, 2131751486, org.telegram.messenger.mp.u1(b21Var5.f33710e).f25797t7.f(-b21Var5.f33712f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    b21Var3 = b21Var5;
                                    t1Var.U = org.telegram.messenger.gd.N0(2131751485, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new di.t1(b21Var3, arrayList, j12, hashSet, meVar));
                                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), new xb0(20));
                                t1Var.show();
                                TextView textView = (TextView) t1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29619q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            }
            final long j12 = tL_forumTopic2.f28483id;
            final int currentAccount = bnVar.getCurrentAccount();
            final org.telegram.ui.ActionBar.h6 resourceProvider = bnVar.getResourceProvider();
            final long j13 = b21Var.f33712f;
            bi.l4 l4Var = new bi.l4(J, currentAccount, j13, j12, bnVar, resourceProvider);
            final a70 K = J.K();
            K.c(2131232059, org.telegram.messenger.gd.N0(2131753753, null), new org.telegram.ui.hq0(J, 27), false);
            K.c(2131232405, org.telegram.messenger.gd.N0(2131745079, null), new Runnable() {
                @Override
                public final void run() {
                    a70.this.v();
                    SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(currentAccount).f25686g7;
                    StringBuilder sb2 = new StringBuilder("sound_enabled_");
                    long j14 = j13;
                    long j15 = j12;
                    sb2.append(org.telegram.messenger.xs.v(j14, j15, false));
                    boolean z14 = sharedPreferences.getBoolean(sb2.toString(), true);
                    boolean z15 = !z14 ? 1 : 0;
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putBoolean("sound_enabled_" + org.telegram.messenger.xs.v(j14, j15, false), z15).apply();
                    K.v();
                    org.telegram.ui.ActionBar.g2 g2Var = bnVar;
                    if (lc.a(g2Var)) {
                        lc.S(z14 ? 1 : 0, g2Var, resourceProvider).j();
                    }
                }
            }, false);
            final org.telegram.ui.ActionBar.y0 z14 = K.z();
            K.c(2131232260, org.telegram.messenger.gd.N0(2131748115, null), new bi.x4(J, resourceProvider, currentAccount, l4Var, 22), false);
            K.c(2131232108, org.telegram.messenger.gd.N0(2131747723, null), new ko(J, j13, j12, bnVar, resourceProvider), false);
            K.c(0, "", new di.j9(J, currentAccount, j13, j12, bnVar, resourceProvider), false);
            final org.telegram.ui.ActionBar.y0 z15 = K.z();
            new Runnable() {
                @Override
                public final void run() {
                    int i19;
                    int i20 = currentAccount;
                    org.telegram.messenger.mp u14 = org.telegram.messenger.mp.u1(i20);
                    long j14 = j13;
                    long j15 = j12;
                    boolean u22 = u14.u2(j14, j15, null);
                    org.telegram.ui.ActionBar.y0 y0Var = z15;
                    org.telegram.ui.ActionBar.y0 y0Var2 = z14;
                    if (u22) {
                        y0Var.j(org.telegram.messenger.gd.N0(2131743605, null), 2131232414, null);
                        i19 = org.telegram.ui.ActionBar.m6.f29751x6;
                        y0Var2.setVisibility(8);
                    } else {
                        y0Var.j(org.telegram.messenger.gd.N0(2131748113, null), 2131232258, null);
                        int i21 = org.telegram.ui.ActionBar.m6.f29619q7;
                        y0Var2.setVisibility(0);
                        if (org.telegram.messenger.mp.u1(i20).v2(j14, j15)) {
                            y0Var2.j(org.telegram.messenger.gd.N0(2131745081, null), 2131232404, null);
                        } else {
                            y0Var2.j(org.telegram.messenger.gd.N0(2131745079, null), 2131232405, null);
                        }
                        i19 = i21;
                    }
                    ro.c(y0Var, i19);
                }
            }.run();
            long j14 = b21Var.f33712f;
            org.telegram.messenger.mp mpVar2 = mpVar;
            boolean u22 = mpVar2.u2(j14, tL_forumTopic2.f28483id, null);
            if (u22) {
                i12 = 2131232414;
            } else {
                i12 = 2131232258;
            }
            int i19 = i12;
            if (u22) {
                i13 = 2131743606;
            } else {
                i13 = 2131748121;
            }
            TLRPC.Chat chat3 = chat;
            b21Var2 = this;
            final a70 a70Var4 = J;
            a70Var4.c(i19, org.telegram.messenger.gd.N0(i13, null), new org.telegram.ui.wn(b21Var2, mpVar2, tL_forumTopic, J, K, 7), false);
            if (org.telegram.messenger.v3.i(i17, chat3, tL_forumTopic) && !org.telegram.messenger.o10.v(user)) {
                boolean z16 = tL_forumTopic.closed;
                if (z16) {
                    i15 = 2131232408;
                } else {
                    i15 = 2131232406;
                }
                if (z16) {
                    i16 = 2131745888;
                } else {
                    i16 = 2131752027;
                }
                i14 = 1;
                z11 = false;
                a70Var4.c(i15, org.telegram.messenger.gd.N0(i16, null), new Runnable(b21Var2) {
                    public final b21 f37744b;

                    {
                        this.f37744b = b21Var2;
                    }

                    @Override
                    public final void run() {
                        b21 b21Var3;
                        int i192 = r4;
                        b21 b21Var4 = this.f37744b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                        a70 a70Var42 = a70Var4;
                        switch (i192) {
                            case 0:
                                a70Var42.v();
                                b21Var4.f33722s.presentFragment(w81.f0(-b21Var4.f33712f, tL_forumTopic3.f28483id));
                                return;
                            case 1:
                                b21Var4.getClass();
                                a70Var42.v();
                                org.telegram.messenger.mp.u1(b21Var4.f33710e).f25797t7.z(tL_forumTopic3.f28483id, -b21Var4.f33712f, true ^ tL_forumTopic3.closed);
                                return;
                            default:
                                a70Var42.v();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.f28483id));
                                me meVar = new me(15);
                                b21 b21Var5 = this.f37744b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b21Var5.getContext());
                                String K0 = org.telegram.messenger.gd.K0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
                                t1Var.S = K0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j122 = b21Var5.f33713f0;
                                if (hashSet.size() == 1) {
                                    b21Var3 = b21Var5;
                                    t1Var.U = org.telegram.messenger.gd.a0(null, null, 2131751486, org.telegram.messenger.mp.u1(b21Var5.f33710e).f25797t7.f(-b21Var5.f33712f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    b21Var3 = b21Var5;
                                    t1Var.U = org.telegram.messenger.gd.N0(2131751485, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new di.t1(b21Var3, arrayList, j122, hashSet, meVar));
                                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), new xb0(20));
                                t1Var.show();
                                TextView textView = (TextView) t1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29619q7, null);
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
            a70Var = a70Var4;
            if (org.telegram.messenger.v3.e(i17, chat3, tL_forumTopic)) {
                a70Var4.c(2131232110, org.telegram.messenger.gd.K0(i14, "DeleteTopics"), new Runnable(b21Var2) {
                    public final b21 f37744b;

                    {
                        this.f37744b = b21Var2;
                    }

                    @Override
                    public final void run() {
                        b21 b21Var3;
                        int i192 = r4;
                        b21 b21Var4 = this.f37744b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                        a70 a70Var42 = a70Var4;
                        switch (i192) {
                            case 0:
                                a70Var42.v();
                                b21Var4.f33722s.presentFragment(w81.f0(-b21Var4.f33712f, tL_forumTopic3.f28483id));
                                return;
                            case 1:
                                b21Var4.getClass();
                                a70Var42.v();
                                org.telegram.messenger.mp.u1(b21Var4.f33710e).f25797t7.z(tL_forumTopic3.f28483id, -b21Var4.f33712f, true ^ tL_forumTopic3.closed);
                                return;
                            default:
                                a70Var42.v();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.f28483id));
                                me meVar = new me(15);
                                b21 b21Var5 = this.f37744b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b21Var5.getContext());
                                String K0 = org.telegram.messenger.gd.K0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
                                t1Var.S = K0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j122 = b21Var5.f33713f0;
                                if (hashSet.size() == 1) {
                                    b21Var3 = b21Var5;
                                    t1Var.U = org.telegram.messenger.gd.a0(null, null, 2131751486, org.telegram.messenger.mp.u1(b21Var5.f33710e).f25797t7.f(-b21Var5.f33712f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    b21Var3 = b21Var5;
                                    t1Var.U = org.telegram.messenger.gd.N0(2131751485, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new di.t1(b21Var3, arrayList, j122, hashSet, meVar));
                                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), new xb0(20));
                                t1Var.show();
                                TextView textView = (TextView) t1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29619q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, z11);
                a70Var = a70Var4;
            }
        }
        boolean z17 = view instanceof w11;
        org.telegram.ui.ActionBar.h6 h6Var = b21Var2.h;
        if (z17) {
            ?? drawable = new Drawable();
            Paint paint = new Paint(1);
            drawable.f39042a = paint;
            drawable.f39043b = new RectF();
            paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G8, h6Var));
            a70Var.X(drawable);
            a70Var.b0(org.telegram.messenger.g0.L(16.0f), 0.0f);
        } else if (z10) {
            a70Var.X(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29378d6, h6Var)));
            a70Var.W(5);
        } else {
            int L = org.telegram.messenger.g0.L(5.0f);
            int L2 = org.telegram.messenger.g0.L(5.0f);
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29378d6, h6Var);
            float f10 = 0;
            float f11 = L;
            float f12 = L2;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f11, f11, f12, f12, f10, f10}, null, null));
            shapeDrawable.getPaint().setColor(w02);
            a70Var.X(shapeDrawable);
        }
        a70Var.a0();
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
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        i();
    }

    public final void p() {
        org.telegram.ui.zd zdVar = this.S;
        if (zdVar != null) {
            zdVar.run();
        }
        i();
        float k10 = k(x11.f41954b);
        int i7 = 0;
        FrameLayout frameLayout = this.J;
        frameLayout.setTranslationX(org.telegram.messenger.g0.W1(k10, -org.telegram.messenger.g0.L(78.0f), 0));
        if (k10 <= 0.0f) {
            i7 = 8;
        }
        frameLayout.setVisibility(i7);
        e();
        int i10 = org.telegram.ui.ActionBar.m6.Fi;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        ImageView imageView = this.F;
        org.telegram.ui.ActionBar.h6 h6Var = this.h;
        org.telegram.ui.ActionBar.t6.s(imageView, i10, h6Var, mode);
        org.telegram.ui.ActionBar.t6.s(this.G, i10, h6Var, mode);
        invalidate();
    }

    public final void q() {
        g(true);
        o11 o11Var = this.f33725y;
        boolean canScrollHorizontally = o11Var.canScrollHorizontally(-1);
        o11Var.f35796g3.O(true);
        if (!canScrollHorizontally) {
            o11Var.v0(0);
        }
        q11 q11Var = this.K;
        boolean canScrollVertically = q11Var.canScrollVertically(-1);
        q11Var.f35796g3.O(true);
        if (!canScrollVertically) {
            q11Var.v0(0);
        }
        org.telegram.messenger.g0.g3(new l11(this, 0));
    }

    public final void r(boolean z10) {
        boolean z11;
        if (this.f33707c && !this.d) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f33705b.a(z11, z10);
    }

    public void setAllTopicsHidden(boolean z10) {
        if (this.f33718k0 != z10) {
            this.f33718k0 = z10;
            g(true);
        }
    }

    public void setCurrentTopic(long j3) {
        boolean z10;
        this.f33713f0 = j3;
        o11 o11Var = this.f33725y;
        o11Var.f35796g3.O(true);
        o11Var.invalidate();
        this.K.f35796g3.O(true);
        a21 a21Var = this.E;
        if (a21Var != null) {
            if (j3 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            a21Var.c(true, false, z10);
        }
    }

    public void setOnDialogSelected(org.telegram.messenger.q10 q10Var) {
        this.f33717j0 = q10Var;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.f33716i0 = runnable;
    }

    public void setOnTopicSelected(org.telegram.messenger.q10 q10Var) {
        this.f33715h0 = q10Var;
    }

    public void setSideMenuBackgroundDrawable(fh.g gVar) {
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
        if (this.f33707c == z10) {
            return;
        }
        this.f33707c = z10;
        if (!z10) {
            d(false);
        }
        r(true);
    }

    public void setTopMenuBackgroundDrawable(fh.g gVar) {
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
