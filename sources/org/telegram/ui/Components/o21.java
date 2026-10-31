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
import org.telegram.ui.la1;
public final class o21 extends FrameLayout implements org.telegram.messenger.us, fe.e, org.telegram.ui.ActionBar.k6 {
    public static final int f28940o0 = 0;
    public final boolean D;
    public final FrameLayout E;
    public final c21 F;
    public final n21 G;
    public final ImageView H;
    public final ImageView I;
    public final ImageView J;
    public final ImageView K;
    public final FrameLayout L;
    public final e21 M;
    public long N;
    public long O;
    public final fe.b P;
    public vg.f Q;
    public vg.f R;
    public float S;
    public float T;
    public org.telegram.ui.me U;
    public boolean V;
    public boolean W;
    public final fe.b f28941a;
    public float f28942a0;
    public final fe.b f28943b;
    public boolean f28944b0;
    public final boolean f28945c;
    public boolean f28946c0;
    public final boolean d;
    public int f28947d0;
    public boolean e;
    public int f28948e0;
    public org.telegram.ui.me f28949f;
    public Boolean f28950f0;
    public ValueAnimator f28951g0;
    public boolean h;
    public long f28952h0;
    public boolean f28953i0;
    public org.telegram.messenger.j20 f28954j0;
    public Runnable f28955k0;
    public org.telegram.messenger.j20 f28956l0;
    public boolean m0;
    public final int f28957n;
    public final HashSet f28958n0;
    public final long f28959r;
    public final org.telegram.ui.ActionBar.p6 f28960s;
    public final boolean f28961w;
    public final boolean f28962x;
    public final org.telegram.ui.un f28963y;

    public o21(Activity activity, org.telegram.ui.un unVar, int i10, long j10, boolean z10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity);
        boolean z11;
        float f7;
        boolean z12;
        boolean z13;
        int i11;
        boolean z14;
        boolean z15;
        gr grVar = gr.h;
        this.f28941a = new fe.b(0, this, grVar, 380L, true);
        this.f28943b = new fe.b(1, this, grVar, 380L, false);
        this.P = new fe.b(0, new w11(this), grVar, 320L, false);
        this.f28942a0 = 0.0f;
        this.f28958n0 = new HashSet();
        this.f28963y = unVar;
        this.f28945c = z10;
        if (z10 && org.telegram.messenger.h20.u(org.telegram.messenger.vp.r1(i10).Z1(Long.valueOf(j10)))) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.d = z11;
        this.f28957n = i10;
        this.f28959r = j10;
        this.f28960s = p6Var;
        long j11 = -j10;
        this.f28961w = org.telegram.messenger.w3.p0(org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(j11)));
        boolean v = org.telegram.messenger.h20.v(org.telegram.messenger.vp.r1(i10).Z1(Long.valueOf(j10)));
        this.f28962x = v;
        this.D = !org.telegram.messenger.m5.w("topics_end_reached_", j11, org.telegram.messenger.d20.i(i10).k(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.E = frameLayout;
        addView(frameLayout, w7.b6.d(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.L = frameLayout2;
        addView(frameLayout2, w7.b6.d(64, -1.0f, 115, 7.0f, 7.0f, 7.0f, 7.0f));
        c21 c21Var = new c21(this, activity, i10, new org.telegram.messenger.j20(this) {
            public final o21 f31116b;

            {
                this.f31116b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                boolean z16;
                boolean z17;
                int i12;
                long j12;
                org.telegram.messenger.x00 x00Var;
                long j13;
                boolean z18;
                ArrayList arrayList;
                boolean z19;
                boolean z20;
                long j14;
                long j15;
                boolean z21;
                boolean z22;
                int i13 = r2;
                o21 o21Var = this.f31116b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        p51 p51Var = (p51) obj2;
                        boolean z23 = o21Var.f28962x;
                        int i14 = o21Var.f28957n;
                        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i14);
                        long j16 = o21Var.f28959r;
                        long j17 = -j16;
                        TLRPC.Chat L0 = r12.L0(Long.valueOf(j17));
                        TLRPC.User Z1 = org.telegram.messenger.vp.r1(i14).Z1(Long.valueOf(j16));
                        org.telegram.messenger.x00 x00Var2 = org.telegram.messenger.vp.r1(i14).f18891r7;
                        ArrayList l4 = x00Var2.l(j17);
                        boolean z24 = o21Var.f28961w;
                        int i15 = i21.f26870b;
                        a51 K = a51.K(i21.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.f24297q = z24;
                        if (o21Var.f28952h0 == 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        K.L(z16);
                        arrayList2.add(K);
                        if (l4 != null) {
                            int size = l4.size();
                            int i16 = 0;
                            z17 = false;
                            while (i16 < size) {
                                Object obj3 = l4.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                int i18 = size;
                                if (z23) {
                                    i12 = i17;
                                    if (tL_forumTopic.f19845id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (o21Var.f28958n0.contains(Integer.valueOf(tL_forumTopic.f19845id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z25 = tL_forumTopic.pinned;
                                    if (!z25 && z17) {
                                        if (!arrayList2.isEmpty()) {
                                            ((a51) i0.a.g(1, arrayList2)).f24304y |= 8;
                                        }
                                        p51Var.L();
                                        z17 = false;
                                    } else if (z25 && !z17) {
                                        p51Var.M();
                                        z17 = true;
                                    }
                                    a51 K2 = a51.K(i21.class);
                                    K2.f24303x = j16;
                                    K2.d = tL_forumTopic.f19845id;
                                    K2.G = tL_forumTopic;
                                    if (z24) {
                                        j12 = j16;
                                        K2.B = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j12 = j16;
                                    }
                                    long j18 = o21Var.f28952h0;
                                    if (z24) {
                                        x00Var = x00Var2;
                                        j13 = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
                                    } else {
                                        x00Var = x00Var2;
                                        j13 = tL_forumTopic.f19845id;
                                    }
                                    if (j18 == j13) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    K2.L(z18);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i12;
                                    x00Var2 = x00Var;
                                    j16 = j12;
                                }
                            }
                        } else {
                            z17 = false;
                        }
                        org.telegram.messenger.x00 x00Var3 = x00Var2;
                        if (z17) {
                            p51Var.L();
                        }
                        if (l4 != null && !l4.isEmpty() && !x00Var3.e(j17) && o21Var.D) {
                            a51 K3 = a51.K(i21.class);
                            K3.d = -2;
                            K3.f24298r = true;
                            arrayList2.add(K3);
                            a51 K4 = a51.K(i21.class);
                            K4.d = -3;
                            K4.f24298r = true;
                            arrayList2.add(K4);
                            a51 K5 = a51.K(i21.class);
                            K5.d = -4;
                            K5.f24298r = true;
                            arrayList2.add(K5);
                        }
                        if (!z23 && !z24) {
                            if ((L0 != null && org.telegram.messenger.w3.w(15, L0)) || org.telegram.messenger.h20.v(Z1)) {
                                a51 K6 = a51.K(i21.class);
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
                        o21.c(o21Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        p51 p51Var2 = (p51) obj2;
                        boolean z26 = o21Var.f28961w;
                        int i19 = o21Var.f28957n;
                        org.telegram.messenger.vp r13 = org.telegram.messenger.vp.r1(i19);
                        long j19 = o21Var.f28959r;
                        long j20 = -j19;
                        TLRPC.Chat L02 = r13.L0(Long.valueOf(j20));
                        TLRPC.User Z12 = org.telegram.messenger.vp.r1(i19).Z1(Long.valueOf(j19));
                        org.telegram.messenger.x00 x00Var4 = org.telegram.messenger.vp.r1(i19).f18891r7;
                        ArrayList l10 = x00Var4.l(j20);
                        boolean z27 = o21Var.f28962x;
                        if (!z27) {
                            int i20 = m21.f28264b;
                            a51 K7 = a51.K(m21.class);
                            K7.d = 0;
                            arrayList = l10;
                            K7.B = 0L;
                            K7.G = null;
                            K7.f24297q = z26;
                            K7.f24304y = z27 ? 1 : 0;
                            if (o21Var.f28952h0 == 0) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            K7.L(z22);
                            arrayList3.add(K7);
                        } else {
                            arrayList = l10;
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            boolean z28 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                int i22 = size2;
                                Object obj4 = arrayList.get(i21);
                                i21++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = Z12;
                                if (z27) {
                                    z20 = z28;
                                    if (tL_forumTopic2.f19845id == 1) {
                                        size2 = i22;
                                        Z12 = user;
                                        z28 = z20;
                                    }
                                } else {
                                    z20 = z28;
                                }
                                if (o21Var.f28958n0.contains(Integer.valueOf(tL_forumTopic2.f19845id))) {
                                    size2 = i22;
                                    Z12 = user;
                                    z28 = z20;
                                } else {
                                    boolean z29 = tL_forumTopic2.pinned;
                                    if (!z29 && z20) {
                                        p51Var2.L();
                                        z28 = false;
                                    } else if (z29 && !z20) {
                                        p51Var2.M();
                                        z28 = true;
                                    } else {
                                        z28 = z20;
                                    }
                                    int i23 = m21.f28264b;
                                    a51 K8 = a51.K(m21.class);
                                    K8.f24303x = j19;
                                    long j21 = j19;
                                    K8.d = tL_forumTopic2.f19845id;
                                    K8.G = tL_forumTopic2;
                                    if (z26) {
                                        K8.B = org.telegram.messenger.o5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j22 = o21Var.f28952h0;
                                    if (z26) {
                                        j14 = j22;
                                        j15 = org.telegram.messenger.o5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j14 = j22;
                                        j15 = tL_forumTopic2.f19845id;
                                    }
                                    if (j14 == j15) {
                                        z21 = true;
                                    } else {
                                        z21 = false;
                                    }
                                    K8.L(z21);
                                    arrayList3.add(K8);
                                    size2 = i22;
                                    Z12 = user;
                                    j19 = j21;
                                }
                            }
                            z19 = z28;
                        } else {
                            z19 = false;
                        }
                        TLRPC.User user2 = Z12;
                        if (z19) {
                            p51Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !x00Var4.e(j20) && o21Var.D) {
                            int i24 = m21.f28264b;
                            a51 K9 = a51.K(m21.class);
                            K9.d = -2;
                            K9.f24298r = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            a51 K10 = a51.K(m21.class);
                            K10.d = -3;
                            K10.f24298r = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            a51 K11 = a51.K(m21.class);
                            K11.d = -4;
                            K11.f24298r = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z27 && !z26) {
                            if ((L02 != null && org.telegram.messenger.w3.w(15, L02)) || org.telegram.messenger.h20.v(user2)) {
                                int i25 = m21.f28264b;
                                a51 K12 = a51.K(m21.class);
                                K12.d = -2;
                                K12.B = -2L;
                                K12.G = null;
                                K12.f24297q = false;
                                arrayList3.add(K12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new w11(this), new w11(this), p6Var);
        this.F = c21Var;
        c21Var.E1(new org.telegram.messenger.j20(this) {
            public final o21 f31116b;

            {
                this.f31116b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                boolean z16;
                boolean z17;
                int i12;
                long j12;
                org.telegram.messenger.x00 x00Var;
                long j13;
                boolean z18;
                ArrayList arrayList;
                boolean z19;
                boolean z20;
                long j14;
                long j15;
                boolean z21;
                boolean z22;
                int i13 = r2;
                o21 o21Var = this.f31116b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        p51 p51Var = (p51) obj2;
                        boolean z23 = o21Var.f28962x;
                        int i14 = o21Var.f28957n;
                        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i14);
                        long j16 = o21Var.f28959r;
                        long j17 = -j16;
                        TLRPC.Chat L0 = r12.L0(Long.valueOf(j17));
                        TLRPC.User Z1 = org.telegram.messenger.vp.r1(i14).Z1(Long.valueOf(j16));
                        org.telegram.messenger.x00 x00Var2 = org.telegram.messenger.vp.r1(i14).f18891r7;
                        ArrayList l4 = x00Var2.l(j17);
                        boolean z24 = o21Var.f28961w;
                        int i15 = i21.f26870b;
                        a51 K = a51.K(i21.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.f24297q = z24;
                        if (o21Var.f28952h0 == 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        K.L(z16);
                        arrayList2.add(K);
                        if (l4 != null) {
                            int size = l4.size();
                            int i16 = 0;
                            z17 = false;
                            while (i16 < size) {
                                Object obj3 = l4.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                int i18 = size;
                                if (z23) {
                                    i12 = i17;
                                    if (tL_forumTopic.f19845id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (o21Var.f28958n0.contains(Integer.valueOf(tL_forumTopic.f19845id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z25 = tL_forumTopic.pinned;
                                    if (!z25 && z17) {
                                        if (!arrayList2.isEmpty()) {
                                            ((a51) i0.a.g(1, arrayList2)).f24304y |= 8;
                                        }
                                        p51Var.L();
                                        z17 = false;
                                    } else if (z25 && !z17) {
                                        p51Var.M();
                                        z17 = true;
                                    }
                                    a51 K2 = a51.K(i21.class);
                                    K2.f24303x = j16;
                                    K2.d = tL_forumTopic.f19845id;
                                    K2.G = tL_forumTopic;
                                    if (z24) {
                                        j12 = j16;
                                        K2.B = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j12 = j16;
                                    }
                                    long j18 = o21Var.f28952h0;
                                    if (z24) {
                                        x00Var = x00Var2;
                                        j13 = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
                                    } else {
                                        x00Var = x00Var2;
                                        j13 = tL_forumTopic.f19845id;
                                    }
                                    if (j18 == j13) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    K2.L(z18);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i12;
                                    x00Var2 = x00Var;
                                    j16 = j12;
                                }
                            }
                        } else {
                            z17 = false;
                        }
                        org.telegram.messenger.x00 x00Var3 = x00Var2;
                        if (z17) {
                            p51Var.L();
                        }
                        if (l4 != null && !l4.isEmpty() && !x00Var3.e(j17) && o21Var.D) {
                            a51 K3 = a51.K(i21.class);
                            K3.d = -2;
                            K3.f24298r = true;
                            arrayList2.add(K3);
                            a51 K4 = a51.K(i21.class);
                            K4.d = -3;
                            K4.f24298r = true;
                            arrayList2.add(K4);
                            a51 K5 = a51.K(i21.class);
                            K5.d = -4;
                            K5.f24298r = true;
                            arrayList2.add(K5);
                        }
                        if (!z23 && !z24) {
                            if ((L0 != null && org.telegram.messenger.w3.w(15, L0)) || org.telegram.messenger.h20.v(Z1)) {
                                a51 K6 = a51.K(i21.class);
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
                        o21.c(o21Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        p51 p51Var2 = (p51) obj2;
                        boolean z26 = o21Var.f28961w;
                        int i19 = o21Var.f28957n;
                        org.telegram.messenger.vp r13 = org.telegram.messenger.vp.r1(i19);
                        long j19 = o21Var.f28959r;
                        long j20 = -j19;
                        TLRPC.Chat L02 = r13.L0(Long.valueOf(j20));
                        TLRPC.User Z12 = org.telegram.messenger.vp.r1(i19).Z1(Long.valueOf(j19));
                        org.telegram.messenger.x00 x00Var4 = org.telegram.messenger.vp.r1(i19).f18891r7;
                        ArrayList l10 = x00Var4.l(j20);
                        boolean z27 = o21Var.f28962x;
                        if (!z27) {
                            int i20 = m21.f28264b;
                            a51 K7 = a51.K(m21.class);
                            K7.d = 0;
                            arrayList = l10;
                            K7.B = 0L;
                            K7.G = null;
                            K7.f24297q = z26;
                            K7.f24304y = z27 ? 1 : 0;
                            if (o21Var.f28952h0 == 0) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            K7.L(z22);
                            arrayList3.add(K7);
                        } else {
                            arrayList = l10;
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            boolean z28 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                int i22 = size2;
                                Object obj4 = arrayList.get(i21);
                                i21++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = Z12;
                                if (z27) {
                                    z20 = z28;
                                    if (tL_forumTopic2.f19845id == 1) {
                                        size2 = i22;
                                        Z12 = user;
                                        z28 = z20;
                                    }
                                } else {
                                    z20 = z28;
                                }
                                if (o21Var.f28958n0.contains(Integer.valueOf(tL_forumTopic2.f19845id))) {
                                    size2 = i22;
                                    Z12 = user;
                                    z28 = z20;
                                } else {
                                    boolean z29 = tL_forumTopic2.pinned;
                                    if (!z29 && z20) {
                                        p51Var2.L();
                                        z28 = false;
                                    } else if (z29 && !z20) {
                                        p51Var2.M();
                                        z28 = true;
                                    } else {
                                        z28 = z20;
                                    }
                                    int i23 = m21.f28264b;
                                    a51 K8 = a51.K(m21.class);
                                    K8.f24303x = j19;
                                    long j21 = j19;
                                    K8.d = tL_forumTopic2.f19845id;
                                    K8.G = tL_forumTopic2;
                                    if (z26) {
                                        K8.B = org.telegram.messenger.o5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j22 = o21Var.f28952h0;
                                    if (z26) {
                                        j14 = j22;
                                        j15 = org.telegram.messenger.o5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j14 = j22;
                                        j15 = tL_forumTopic2.f19845id;
                                    }
                                    if (j14 == j15) {
                                        z21 = true;
                                    } else {
                                        z21 = false;
                                    }
                                    K8.L(z21);
                                    arrayList3.add(K8);
                                    size2 = i22;
                                    Z12 = user;
                                    j19 = j21;
                                }
                            }
                            z19 = z28;
                        } else {
                            z19 = false;
                        }
                        TLRPC.User user2 = Z12;
                        if (z19) {
                            p51Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !x00Var4.e(j20) && o21Var.D) {
                            int i24 = m21.f28264b;
                            a51 K9 = a51.K(m21.class);
                            K9.d = -2;
                            K9.f24298r = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            a51 K10 = a51.K(m21.class);
                            K10.d = -3;
                            K10.f24298r = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            a51 K11 = a51.K(m21.class);
                            K11.d = -4;
                            K11.f24298r = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z27 && !z26) {
                            if ((L02 != null && org.telegram.messenger.w3.w(15, L02)) || org.telegram.messenger.h20.v(user2)) {
                                int i25 = m21.f28264b;
                                a51 K12 = a51.K(m21.class);
                                K12.d = -2;
                                K12.B = -2L;
                                K12.G = null;
                                K12.f24297q = false;
                                arrayList3.add(K12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        c21Var.setWillNotDraw(false);
        c21Var.f30819f3.f29295r = false;
        c21Var.getContext();
        org.telegram.ui.br brVar = new org.telegram.ui.br((ViewGroup) c21Var, 6);
        c21Var.f30818e3 = brVar;
        c21Var.setLayoutManager(brVar);
        frameLayout.addView(c21Var, w7.b6.d(-1, -1.0f, 119, 41.0f, 0.0f, 0.0f, 0.0f));
        c21Var.j(new d21(this, 0));
        if (v) {
            n21 n21Var = new n21(i10, activity, p6Var);
            this.G = n21Var;
            if (this.f28952h0 == 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            n21Var.c(true, false, z15);
            n21Var.setOnClickListener(new View.OnClickListener(this) {
                public final o21 f30762b;

                {
                    this.f30762b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            o21 o21Var = this.f30762b;
                            e21 e21Var = o21Var.M;
                            e21Var.z1(false);
                            c21 c21Var2 = o21Var.F;
                            c21Var2.z1(false);
                            o21Var.P.a(false, true);
                            org.telegram.messenger.i0.a4(e21Var);
                            org.telegram.messenger.i0.a4(c21Var2);
                            return;
                        case 1:
                            this.f30762b.f28954j0.a(0, Boolean.FALSE);
                            return;
                        default:
                            o21.b(this.f30762b);
                            return;
                    }
                }
            });
            frameLayout2.addView(n21Var, w7.b6.d(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            this.G = null;
        }
        e21 e21Var = new e21(activity, i10, new org.telegram.messenger.j20(this) {
            public final o21 f31116b;

            {
                this.f31116b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                boolean z16;
                boolean z17;
                int i12;
                long j12;
                org.telegram.messenger.x00 x00Var;
                long j13;
                boolean z18;
                ArrayList arrayList;
                boolean z19;
                boolean z20;
                long j14;
                long j15;
                boolean z21;
                boolean z22;
                int i13 = r2;
                o21 o21Var = this.f31116b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        p51 p51Var = (p51) obj2;
                        boolean z23 = o21Var.f28962x;
                        int i14 = o21Var.f28957n;
                        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i14);
                        long j16 = o21Var.f28959r;
                        long j17 = -j16;
                        TLRPC.Chat L0 = r12.L0(Long.valueOf(j17));
                        TLRPC.User Z1 = org.telegram.messenger.vp.r1(i14).Z1(Long.valueOf(j16));
                        org.telegram.messenger.x00 x00Var2 = org.telegram.messenger.vp.r1(i14).f18891r7;
                        ArrayList l4 = x00Var2.l(j17);
                        boolean z24 = o21Var.f28961w;
                        int i15 = i21.f26870b;
                        a51 K = a51.K(i21.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.f24297q = z24;
                        if (o21Var.f28952h0 == 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        K.L(z16);
                        arrayList2.add(K);
                        if (l4 != null) {
                            int size = l4.size();
                            int i16 = 0;
                            z17 = false;
                            while (i16 < size) {
                                Object obj3 = l4.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                int i18 = size;
                                if (z23) {
                                    i12 = i17;
                                    if (tL_forumTopic.f19845id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (o21Var.f28958n0.contains(Integer.valueOf(tL_forumTopic.f19845id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z25 = tL_forumTopic.pinned;
                                    if (!z25 && z17) {
                                        if (!arrayList2.isEmpty()) {
                                            ((a51) i0.a.g(1, arrayList2)).f24304y |= 8;
                                        }
                                        p51Var.L();
                                        z17 = false;
                                    } else if (z25 && !z17) {
                                        p51Var.M();
                                        z17 = true;
                                    }
                                    a51 K2 = a51.K(i21.class);
                                    K2.f24303x = j16;
                                    K2.d = tL_forumTopic.f19845id;
                                    K2.G = tL_forumTopic;
                                    if (z24) {
                                        j12 = j16;
                                        K2.B = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j12 = j16;
                                    }
                                    long j18 = o21Var.f28952h0;
                                    if (z24) {
                                        x00Var = x00Var2;
                                        j13 = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
                                    } else {
                                        x00Var = x00Var2;
                                        j13 = tL_forumTopic.f19845id;
                                    }
                                    if (j18 == j13) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    K2.L(z18);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i12;
                                    x00Var2 = x00Var;
                                    j16 = j12;
                                }
                            }
                        } else {
                            z17 = false;
                        }
                        org.telegram.messenger.x00 x00Var3 = x00Var2;
                        if (z17) {
                            p51Var.L();
                        }
                        if (l4 != null && !l4.isEmpty() && !x00Var3.e(j17) && o21Var.D) {
                            a51 K3 = a51.K(i21.class);
                            K3.d = -2;
                            K3.f24298r = true;
                            arrayList2.add(K3);
                            a51 K4 = a51.K(i21.class);
                            K4.d = -3;
                            K4.f24298r = true;
                            arrayList2.add(K4);
                            a51 K5 = a51.K(i21.class);
                            K5.d = -4;
                            K5.f24298r = true;
                            arrayList2.add(K5);
                        }
                        if (!z23 && !z24) {
                            if ((L0 != null && org.telegram.messenger.w3.w(15, L0)) || org.telegram.messenger.h20.v(Z1)) {
                                a51 K6 = a51.K(i21.class);
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
                        o21.c(o21Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        p51 p51Var2 = (p51) obj2;
                        boolean z26 = o21Var.f28961w;
                        int i19 = o21Var.f28957n;
                        org.telegram.messenger.vp r13 = org.telegram.messenger.vp.r1(i19);
                        long j19 = o21Var.f28959r;
                        long j20 = -j19;
                        TLRPC.Chat L02 = r13.L0(Long.valueOf(j20));
                        TLRPC.User Z12 = org.telegram.messenger.vp.r1(i19).Z1(Long.valueOf(j19));
                        org.telegram.messenger.x00 x00Var4 = org.telegram.messenger.vp.r1(i19).f18891r7;
                        ArrayList l10 = x00Var4.l(j20);
                        boolean z27 = o21Var.f28962x;
                        if (!z27) {
                            int i20 = m21.f28264b;
                            a51 K7 = a51.K(m21.class);
                            K7.d = 0;
                            arrayList = l10;
                            K7.B = 0L;
                            K7.G = null;
                            K7.f24297q = z26;
                            K7.f24304y = z27 ? 1 : 0;
                            if (o21Var.f28952h0 == 0) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            K7.L(z22);
                            arrayList3.add(K7);
                        } else {
                            arrayList = l10;
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            boolean z28 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                int i22 = size2;
                                Object obj4 = arrayList.get(i21);
                                i21++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = Z12;
                                if (z27) {
                                    z20 = z28;
                                    if (tL_forumTopic2.f19845id == 1) {
                                        size2 = i22;
                                        Z12 = user;
                                        z28 = z20;
                                    }
                                } else {
                                    z20 = z28;
                                }
                                if (o21Var.f28958n0.contains(Integer.valueOf(tL_forumTopic2.f19845id))) {
                                    size2 = i22;
                                    Z12 = user;
                                    z28 = z20;
                                } else {
                                    boolean z29 = tL_forumTopic2.pinned;
                                    if (!z29 && z20) {
                                        p51Var2.L();
                                        z28 = false;
                                    } else if (z29 && !z20) {
                                        p51Var2.M();
                                        z28 = true;
                                    } else {
                                        z28 = z20;
                                    }
                                    int i23 = m21.f28264b;
                                    a51 K8 = a51.K(m21.class);
                                    K8.f24303x = j19;
                                    long j21 = j19;
                                    K8.d = tL_forumTopic2.f19845id;
                                    K8.G = tL_forumTopic2;
                                    if (z26) {
                                        K8.B = org.telegram.messenger.o5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j22 = o21Var.f28952h0;
                                    if (z26) {
                                        j14 = j22;
                                        j15 = org.telegram.messenger.o5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j14 = j22;
                                        j15 = tL_forumTopic2.f19845id;
                                    }
                                    if (j14 == j15) {
                                        z21 = true;
                                    } else {
                                        z21 = false;
                                    }
                                    K8.L(z21);
                                    arrayList3.add(K8);
                                    size2 = i22;
                                    Z12 = user;
                                    j19 = j21;
                                }
                            }
                            z19 = z28;
                        } else {
                            z19 = false;
                        }
                        TLRPC.User user2 = Z12;
                        if (z19) {
                            p51Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !x00Var4.e(j20) && o21Var.D) {
                            int i24 = m21.f28264b;
                            a51 K9 = a51.K(m21.class);
                            K9.d = -2;
                            K9.f24298r = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            a51 K10 = a51.K(m21.class);
                            K10.d = -3;
                            K10.f24298r = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            a51 K11 = a51.K(m21.class);
                            K11.d = -4;
                            K11.f24298r = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z27 && !z26) {
                            if ((L02 != null && org.telegram.messenger.w3.w(15, L02)) || org.telegram.messenger.h20.v(user2)) {
                                int i25 = m21.f28264b;
                                a51 K12 = a51.K(m21.class);
                                K12.d = -2;
                                K12.B = -2L;
                                K12.G = null;
                                K12.f24297q = false;
                                arrayList3.add(K12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new w11(this), new w11(this), p6Var);
        this.M = e21Var;
        e21Var.E1(new org.telegram.messenger.j20(this) {
            public final o21 f31116b;

            {
                this.f31116b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                boolean z16;
                boolean z17;
                int i12;
                long j12;
                org.telegram.messenger.x00 x00Var;
                long j13;
                boolean z18;
                ArrayList arrayList;
                boolean z19;
                boolean z20;
                long j14;
                long j15;
                boolean z21;
                boolean z22;
                int i13 = r2;
                o21 o21Var = this.f31116b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        p51 p51Var = (p51) obj2;
                        boolean z23 = o21Var.f28962x;
                        int i14 = o21Var.f28957n;
                        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i14);
                        long j16 = o21Var.f28959r;
                        long j17 = -j16;
                        TLRPC.Chat L0 = r12.L0(Long.valueOf(j17));
                        TLRPC.User Z1 = org.telegram.messenger.vp.r1(i14).Z1(Long.valueOf(j16));
                        org.telegram.messenger.x00 x00Var2 = org.telegram.messenger.vp.r1(i14).f18891r7;
                        ArrayList l4 = x00Var2.l(j17);
                        boolean z24 = o21Var.f28961w;
                        int i15 = i21.f26870b;
                        a51 K = a51.K(i21.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.f24297q = z24;
                        if (o21Var.f28952h0 == 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        K.L(z16);
                        arrayList2.add(K);
                        if (l4 != null) {
                            int size = l4.size();
                            int i16 = 0;
                            z17 = false;
                            while (i16 < size) {
                                Object obj3 = l4.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                int i18 = size;
                                if (z23) {
                                    i12 = i17;
                                    if (tL_forumTopic.f19845id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (o21Var.f28958n0.contains(Integer.valueOf(tL_forumTopic.f19845id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z25 = tL_forumTopic.pinned;
                                    if (!z25 && z17) {
                                        if (!arrayList2.isEmpty()) {
                                            ((a51) i0.a.g(1, arrayList2)).f24304y |= 8;
                                        }
                                        p51Var.L();
                                        z17 = false;
                                    } else if (z25 && !z17) {
                                        p51Var.M();
                                        z17 = true;
                                    }
                                    a51 K2 = a51.K(i21.class);
                                    K2.f24303x = j16;
                                    K2.d = tL_forumTopic.f19845id;
                                    K2.G = tL_forumTopic;
                                    if (z24) {
                                        j12 = j16;
                                        K2.B = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j12 = j16;
                                    }
                                    long j18 = o21Var.f28952h0;
                                    if (z24) {
                                        x00Var = x00Var2;
                                        j13 = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
                                    } else {
                                        x00Var = x00Var2;
                                        j13 = tL_forumTopic.f19845id;
                                    }
                                    if (j18 == j13) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    K2.L(z18);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i12;
                                    x00Var2 = x00Var;
                                    j16 = j12;
                                }
                            }
                        } else {
                            z17 = false;
                        }
                        org.telegram.messenger.x00 x00Var3 = x00Var2;
                        if (z17) {
                            p51Var.L();
                        }
                        if (l4 != null && !l4.isEmpty() && !x00Var3.e(j17) && o21Var.D) {
                            a51 K3 = a51.K(i21.class);
                            K3.d = -2;
                            K3.f24298r = true;
                            arrayList2.add(K3);
                            a51 K4 = a51.K(i21.class);
                            K4.d = -3;
                            K4.f24298r = true;
                            arrayList2.add(K4);
                            a51 K5 = a51.K(i21.class);
                            K5.d = -4;
                            K5.f24298r = true;
                            arrayList2.add(K5);
                        }
                        if (!z23 && !z24) {
                            if ((L0 != null && org.telegram.messenger.w3.w(15, L0)) || org.telegram.messenger.h20.v(Z1)) {
                                a51 K6 = a51.K(i21.class);
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
                        o21.c(o21Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        p51 p51Var2 = (p51) obj2;
                        boolean z26 = o21Var.f28961w;
                        int i19 = o21Var.f28957n;
                        org.telegram.messenger.vp r13 = org.telegram.messenger.vp.r1(i19);
                        long j19 = o21Var.f28959r;
                        long j20 = -j19;
                        TLRPC.Chat L02 = r13.L0(Long.valueOf(j20));
                        TLRPC.User Z12 = org.telegram.messenger.vp.r1(i19).Z1(Long.valueOf(j19));
                        org.telegram.messenger.x00 x00Var4 = org.telegram.messenger.vp.r1(i19).f18891r7;
                        ArrayList l10 = x00Var4.l(j20);
                        boolean z27 = o21Var.f28962x;
                        if (!z27) {
                            int i20 = m21.f28264b;
                            a51 K7 = a51.K(m21.class);
                            K7.d = 0;
                            arrayList = l10;
                            K7.B = 0L;
                            K7.G = null;
                            K7.f24297q = z26;
                            K7.f24304y = z27 ? 1 : 0;
                            if (o21Var.f28952h0 == 0) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            K7.L(z22);
                            arrayList3.add(K7);
                        } else {
                            arrayList = l10;
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            boolean z28 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                int i22 = size2;
                                Object obj4 = arrayList.get(i21);
                                i21++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = Z12;
                                if (z27) {
                                    z20 = z28;
                                    if (tL_forumTopic2.f19845id == 1) {
                                        size2 = i22;
                                        Z12 = user;
                                        z28 = z20;
                                    }
                                } else {
                                    z20 = z28;
                                }
                                if (o21Var.f28958n0.contains(Integer.valueOf(tL_forumTopic2.f19845id))) {
                                    size2 = i22;
                                    Z12 = user;
                                    z28 = z20;
                                } else {
                                    boolean z29 = tL_forumTopic2.pinned;
                                    if (!z29 && z20) {
                                        p51Var2.L();
                                        z28 = false;
                                    } else if (z29 && !z20) {
                                        p51Var2.M();
                                        z28 = true;
                                    } else {
                                        z28 = z20;
                                    }
                                    int i23 = m21.f28264b;
                                    a51 K8 = a51.K(m21.class);
                                    K8.f24303x = j19;
                                    long j21 = j19;
                                    K8.d = tL_forumTopic2.f19845id;
                                    K8.G = tL_forumTopic2;
                                    if (z26) {
                                        K8.B = org.telegram.messenger.o5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j22 = o21Var.f28952h0;
                                    if (z26) {
                                        j14 = j22;
                                        j15 = org.telegram.messenger.o5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j14 = j22;
                                        j15 = tL_forumTopic2.f19845id;
                                    }
                                    if (j14 == j15) {
                                        z21 = true;
                                    } else {
                                        z21 = false;
                                    }
                                    K8.L(z21);
                                    arrayList3.add(K8);
                                    size2 = i22;
                                    Z12 = user;
                                    j19 = j21;
                                }
                            }
                            z19 = z28;
                        } else {
                            z19 = false;
                        }
                        TLRPC.User user2 = Z12;
                        if (z19) {
                            p51Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !x00Var4.e(j20) && o21Var.D) {
                            int i24 = m21.f28264b;
                            a51 K9 = a51.K(m21.class);
                            K9.d = -2;
                            K9.f24298r = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            a51 K10 = a51.K(m21.class);
                            K10.d = -3;
                            K10.f24298r = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            a51 K11 = a51.K(m21.class);
                            K11.d = -4;
                            K11.f24298r = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z27 && !z26) {
                            if ((L02 != null && org.telegram.messenger.w3.w(15, L02)) || org.telegram.messenger.h20.v(user2)) {
                                int i25 = m21.f28264b;
                                a51 K12 = a51.K(m21.class);
                                K12.d = -2;
                                K12.B = -2L;
                                K12.G = null;
                                K12.f24297q = false;
                                arrayList3.add(K12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        e21Var.f30819f3.f29295r = false;
        e21Var.setClipToPadding(false);
        e21Var.setClipChildren(false);
        if (v) {
            f7 = 90.0f;
        } else {
            f7 = 48.0f;
        }
        frameLayout2.addView(e21Var, w7.b6.d(-1, -1.0f, 119, 0.0f, f7, 0.0f, 0.0f));
        e21Var.j(new d21(this, 1));
        ImageView j12 = j(activity, 2131231883, new View.OnClickListener(this) {
            public final o21 f30762b;

            {
                this.f30762b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        o21 o21Var = this.f30762b;
                        e21 e21Var2 = o21Var.M;
                        e21Var2.z1(false);
                        c21 c21Var2 = o21Var.F;
                        c21Var2.z1(false);
                        o21Var.P.a(false, true);
                        org.telegram.messenger.i0.a4(e21Var2);
                        org.telegram.messenger.i0.a4(c21Var2);
                        return;
                    case 1:
                        this.f30762b.f28954j0.a(0, Boolean.FALSE);
                        return;
                    default:
                        o21.b(this.f30762b);
                        return;
                }
            }
        });
        this.J = j12;
        ImageView j13 = j(activity, 2131231883, new View.OnClickListener(this) {
            public final o21 f30762b;

            {
                this.f30762b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        o21 o21Var = this.f30762b;
                        e21 e21Var2 = o21Var.M;
                        e21Var2.z1(false);
                        c21 c21Var2 = o21Var.F;
                        c21Var2.z1(false);
                        o21Var.P.a(false, true);
                        org.telegram.messenger.i0.a4(e21Var2);
                        org.telegram.messenger.i0.a4(c21Var2);
                        return;
                    case 1:
                        this.f30762b.f28954j0.a(0, Boolean.FALSE);
                        return;
                    default:
                        o21.b(this.f30762b);
                        return;
                }
            }
        });
        this.K = j13;
        frameLayout.addView(j12, w7.b6.e(44, 36, 51));
        frameLayout2.addView(j13, w7.b6.e(64, 48, 51));
        ImageView j14 = j(activity, 2131232356, new View.OnClickListener(this) {
            public final o21 f30762b;

            {
                this.f30762b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        o21 o21Var = this.f30762b;
                        e21 e21Var2 = o21Var.M;
                        e21Var2.z1(false);
                        c21 c21Var2 = o21Var.F;
                        c21Var2.z1(false);
                        o21Var.P.a(false, true);
                        org.telegram.messenger.i0.a4(e21Var2);
                        org.telegram.messenger.i0.a4(c21Var2);
                        return;
                    case 1:
                        this.f30762b.f28954j0.a(0, Boolean.FALSE);
                        return;
                    default:
                        o21.b(this.f30762b);
                        return;
                }
            }
        });
        this.H = j14;
        ImageView j15 = j(activity, 2131232356, new View.OnClickListener(this) {
            public final o21 f30762b;

            {
                this.f30762b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        o21 o21Var = this.f30762b;
                        e21 e21Var2 = o21Var.M;
                        e21Var2.z1(false);
                        c21 c21Var2 = o21Var.F;
                        c21Var2.z1(false);
                        o21Var.P.a(false, true);
                        org.telegram.messenger.i0.a4(e21Var2);
                        org.telegram.messenger.i0.a4(c21Var2);
                        return;
                    case 1:
                        this.f30762b.f28954j0.a(0, Boolean.FALSE);
                        return;
                    default:
                        o21.b(this.f30762b);
                        return;
                }
            }
        });
        this.I = j15;
        frameLayout.addView(j14, w7.b6.e(44, 36, 51));
        frameLayout2.addView(j15, w7.b6.e(64, 48, 51));
        org.telegram.messenger.vp.r1(i10).f18891r7.n(3, j11, false);
        SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(i10).f7;
        if (z10 && org.telegram.messenger.m5.w("topicssidetabs", j10, sharedPreferences, false)) {
            this.f28942a0 = 1.0f;
            z12 = true;
            this.W = true;
        } else {
            z12 = true;
        }
        if (z10 && org.telegram.messenger.m5.w("topicssidetabsb", j10, sharedPreferences, false)) {
            z13 = z12;
        } else {
            z13 = false;
        }
        this.V = z13;
        if (z13) {
            i11 = 2131231885;
        } else {
            i11 = 2131231882;
        }
        j13.setImageResource(i11);
        if (z11 && !this.W && org.telegram.messenger.m5.w("topicssidepanel", j10, sharedPreferences, false)) {
            z14 = z12;
        } else {
            z14 = false;
        }
        this.e = z14;
        r(false);
        s();
        g(false);
        h();
        p();
        q();
    }

    public static void a(o21 o21Var, a51 a51Var) {
        if (o21Var.f28961w) {
            org.telegram.messenger.j20 j20Var = o21Var.f28956l0;
            if (j20Var != null) {
                j20Var.a(Long.valueOf(a51Var.B), Boolean.FALSE);
            }
        } else if (a51Var.B == -2) {
            Runnable runnable = o21Var.f28955k0;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            org.telegram.messenger.j20 j20Var2 = o21Var.f28954j0;
            if (j20Var2 != null) {
                j20Var2.a(Integer.valueOf(a51Var.d), Boolean.FALSE);
            }
        }
    }

    public static void b(o21 o21Var) {
        boolean z10 = o21Var.W;
        boolean z11 = true;
        if (!z10 && o21Var.V && o21Var.f28950f0 == null && !o21Var.f28944b0) {
            if (o21Var.d) {
                o21Var.setSidebarMode(true);
            } else if (o21Var.h) {
            } else {
                o21Var.h = true;
                o21Var.r(true);
            }
        } else if ((r2 = o21Var.f28950f0) != null) {
            z11 = false;
            o21Var.d(z11);
        } else {
            z11 = false;
            o21Var.d(z11);
        }
    }

    public static void c(o21 o21Var, ArrayList arrayList) {
        long j10 = o21Var.f28959r;
        org.telegram.messenger.x00 x00Var = org.telegram.messenger.vp.r1(o21Var.f28957n).f18891r7;
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            i10 = c3.i0.j(((a51) arrayList.get(i10)).d, i10, 1, arrayList2);
        }
        long j11 = -j10;
        x00Var.w(arrayList2, j11);
        x00Var.y(j11, false);
    }

    public static ImageView j(Context context, int i10, View.OnClickListener onClickListener) {
        ImageView e = org.telegram.messenger.z20.e(context, i10);
        e.setScaleType(ImageView.ScaleType.CENTER);
        e.setOnClickListener(onClickListener);
        w7.e6.a(e);
        return e;
    }

    private void setAttached(boolean z10) {
        if (this.f28953i0 == z10) {
            return;
        }
        this.f28953i0 = z10;
        int i10 = 0;
        int i11 = org.telegram.messenger.zs.f19676r;
        int i12 = org.telegram.messenger.zs.f19675q5;
        long j10 = this.f28959r;
        int i13 = this.f28957n;
        if (z10) {
            org.telegram.messenger.zs.f(i13).c(this, i12);
            org.telegram.messenger.zs.f(i13).c(this, i11);
            org.telegram.messenger.x00 x00Var = org.telegram.messenger.vp.r1(i13).f18891r7;
            long j11 = -j10;
            LongSparseIntArray longSparseIntArray = x00Var.f19174f;
            longSparseIntArray.put(j11, longSparseIntArray.get(j11, 0) + 1);
            x00Var.y(j11, true);
            return;
        }
        long j12 = -j10;
        LongSparseIntArray longSparseIntArray2 = org.telegram.messenger.vp.r1(i13).f18891r7.f19174f;
        int i14 = longSparseIntArray2.get(j12, 0) - 1;
        if (i14 >= 0) {
            i10 = i14;
        }
        longSparseIntArray2.put(j12, i10);
        org.telegram.messenger.zs.f(i13).n(this, i12);
        org.telegram.messenger.zs.f(i13).n(this, i11);
    }

    @Override
    public final void E(float f7, int i10) {
        if (i10 == 1 && f7 == 1.0f && this.h) {
            this.h = false;
            this.V = false;
            s();
            this.K.setImageResource(2131231882);
            SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(this.f28957n).f7.edit();
            edit.putBoolean("topicssidetabsb" + this.f28959r, false).apply();
            r(true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21330z6));
    }

    public final void d(boolean z10) {
        float f7;
        if (this.W == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.f28951g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (this.f28944b0) {
                this.f28950f0 = Boolean.valueOf(z10);
                return;
            }
        }
        if (!z10) {
            this.V = !this.V;
        }
        this.W = z10;
        this.f28944b0 = true;
        float f10 = this.f28942a0;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f28951g0 = ofFloat;
        ofFloat.addUpdateListener(new r60(this, 28));
        this.f28951g0.addListener(new ha0(7, this, z10));
        this.f28951g0.setInterpolator(ci.o.V);
        this.f28951g0.setDuration(250L);
        this.f28951g0.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = org.telegram.messenger.zs.f19675q5;
        long j10 = this.f28959r;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() == (-j10)) {
                q();
            }
        } else if (i10 == org.telegram.messenger.zs.f19676r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i13 = org.telegram.messenger.vp.D8;
            if ((intValue & 512) > 0) {
                org.telegram.messenger.vp.r1(this.f28957n).f18891r7.y(-j10, false);
                q();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        FrameLayout frameLayout = this.L;
        if (frameLayout.getVisibility() == 0) {
            this.Q.setBounds((int) frameLayout.getTranslationX(), (int) this.T, (int) (frameLayout.getTranslationX() + org.telegram.messenger.i0.L(78.0f)), (int) (getMeasuredHeight() - this.S));
            this.Q.draw(canvas);
        }
        FrameLayout frameLayout2 = this.E;
        if (frameLayout2.getVisibility() == 0) {
            this.R.setAlpha((int) (frameLayout2.getAlpha() * 255.0f));
            this.R.setBounds(0, (int) frameLayout2.getTranslationY(), getMeasuredWidth(), (int) (frameLayout2.getTranslationY() + org.telegram.messenger.i0.L(50.0f)));
            this.R.draw(canvas);
        }
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        canvas.save();
        if (view == this.L) {
            canvas.clipPath(this.Q.M.f50837k);
        }
        if (view == this.E) {
            canvas.clipPath(this.R.M.f50837k);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        int i10 = org.telegram.ui.ActionBar.t6.f21330z6;
        org.telegram.ui.ActionBar.p6 p6Var = this.f28960s;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var);
        int f7 = i0.b.f(1.0f - this.f28942a0, w02, w03);
        int f10 = i0.b.f(this.f28942a0, w02, w03);
        boolean z10 = this.f28946c0;
        this.f28946c0 = true;
        ImageView imageView = this.J;
        if (imageView != null && (!z10 || f7 != this.f28947d0)) {
            imageView.setColorFilter(new PorterDuffColorFilter(f7, PorterDuff.Mode.SRC_IN));
        }
        this.f28947d0 = f7;
        ImageView imageView2 = this.K;
        if (imageView2 != null && (!z10 || f10 != this.f28948e0)) {
            imageView2.setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
        }
        this.f28948e0 = f10;
    }

    public final void f() {
        FrameLayout frameLayout = this.L;
        int paddingBottom = frameLayout.getPaddingBottom();
        int round = Math.round(this.S + this.T);
        if (paddingBottom == round) {
            return;
        }
        frameLayout.setPadding(0, 0, 0, round);
    }

    public final void g(boolean z10) {
        boolean z11;
        ArrayList l4 = org.telegram.messenger.vp.r1(this.f28957n).f18891r7.l(-this.f28959r);
        if (l4 != null && !l4.isEmpty() && !this.m0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f28941a.a(z11, z10);
    }

    public k21 getCurrentTabsPosition() {
        if (this.W) {
            return k21.f27623b;
        }
        if (this.V) {
            return k21.f27624c;
        }
        return k21.f27622a;
    }

    public float getSideMenuT() {
        return this.f28942a0 * this.f28941a.e;
    }

    public final void h() {
        int i10;
        int i11;
        int i12;
        fe.b bVar = this.P;
        float f7 = bVar.e;
        ImageView imageView = this.H;
        imageView.setAlpha(f7);
        imageView.setScaleX(org.telegram.messenger.i0.T1(0.4f, 1.0f, f7));
        imageView.setScaleY(org.telegram.messenger.i0.T1(0.4f, 1.0f, f7));
        int i13 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        int i14 = 8;
        if (i13 > 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = this.I;
        imageView2.setAlpha(f7);
        imageView2.setScaleX(org.telegram.messenger.i0.T1(0.4f, 1.0f, f7));
        imageView2.setScaleY(org.telegram.messenger.i0.T1(0.4f, 1.0f, f7));
        if (i13 > 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView2.setVisibility(i11);
        float f10 = 1.0f - bVar.e;
        ImageView imageView3 = this.J;
        imageView3.setAlpha(f10);
        imageView3.setScaleX(org.telegram.messenger.i0.T1(0.4f, 1.0f, f10));
        imageView3.setScaleY(org.telegram.messenger.i0.T1(0.4f, 1.0f, f10));
        int i15 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i15 > 0) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        imageView3.setVisibility(i12);
        ImageView imageView4 = this.K;
        imageView4.setAlpha(f10);
        imageView4.setScaleX(org.telegram.messenger.i0.T1(0.4f, 1.0f, f10));
        imageView4.setScaleY(org.telegram.messenger.i0.T1(0.4f, 1.0f, f10));
        if (i15 > 0) {
            i14 = 0;
        }
        imageView4.setVisibility(i14);
    }

    public final void i() {
        int i10;
        float T1 = org.telegram.messenger.i0.T1(1.0f, 0.0f, this.f28942a0);
        FrameLayout frameLayout = this.E;
        frameLayout.setAlpha(T1);
        if ((1.0f - this.f28943b.e) * (1.0f - this.f28942a0) * this.f28941a.e > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        if (this.V) {
            frameLayout.setTranslationY(((getMeasuredHeight() - org.telegram.messenger.i0.L(50.0f)) - this.S) + org.telegram.messenger.i0.W1(k(k21.f27624c), org.telegram.messenger.i0.L(43.0f), 0));
            return;
        }
        frameLayout.setTranslationY(this.T + org.telegram.messenger.i0.W1(k(k21.f27622a), -org.telegram.messenger.i0.L(43.0f), 0));
    }

    public final float k(k21 k21Var) {
        float f7 = (1.0f - this.f28943b.e) * this.f28941a.e;
        if (k21Var == k21.f27623b) {
            return this.f28942a0 * f7;
        }
        if ((k21Var == k21.f27622a && !this.V) || (k21Var == k21.f27624c && this.V)) {
            return (1.0f - this.f28942a0) * f7;
        }
        return 0.0f;
    }

    public final boolean l() {
        if (this.f28942a0 > 0.5f) {
            int i10 = 0;
            while (true) {
                e21 e21Var = this.M;
                if (i10 >= e21Var.getChildCount()) {
                    break;
                }
                a51 G = e21Var.f30819f3.G(RecyclerView.R(e21Var.getChildAt(i10)));
                if (G == null || !G.f24298r) {
                    i10++;
                } else {
                    return true;
                }
            }
        } else {
            int i11 = 0;
            while (true) {
                c21 c21Var = this.F;
                if (i11 >= c21Var.getChildCount()) {
                    break;
                }
                a51 G2 = c21Var.f30819f3.G(RecyclerView.R(c21Var.getChildAt(i11)));
                if (G2 != null && G2.f24298r) {
                    return true;
                }
                i11++;
            }
        }
        return false;
    }

    public final void m() {
        org.telegram.messenger.x00 x00Var = org.telegram.messenger.vp.r1(this.f28957n).f18891r7;
        long j10 = this.f28959r;
        if (!x00Var.e(-j10)) {
            x00Var.o(-j10);
        }
    }

    public final void n(long j10, boolean z10) {
        if (this.f28961w) {
            org.telegram.messenger.j20 j20Var = this.f28956l0;
            if (j20Var != null) {
                j20Var.a(Long.valueOf(j10), Boolean.valueOf(z10));
                return;
            }
            return;
        }
        org.telegram.messenger.j20 j20Var2 = this.f28954j0;
        if (j20Var2 != null) {
            j20Var2.a(Integer.valueOf((int) j10), Boolean.valueOf(z10));
        }
    }

    public final boolean o(final TLRPC.TL_forumTopic tL_forumTopic, View view, boolean z10) {
        TLRPC.Chat chat;
        TLRPC.User user;
        int i10;
        int i11;
        org.telegram.messenger.vp vpVar;
        final o21 o21Var;
        final TLRPC.TL_forumTopic tL_forumTopic2;
        int i12;
        int i13;
        int i14;
        final o21 o21Var2;
        boolean z11;
        int i15;
        int i16;
        int i17;
        z60 z60Var;
        int i18 = this.f28957n;
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i18);
        long j10 = this.f28959r;
        int i19 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i19 < 0) {
            chat = r12.L0(Long.valueOf(-j10));
        } else {
            chat = null;
        }
        if (i19 > 0) {
            user = r12.Z1(Long.valueOf(j10));
        } else {
            user = null;
        }
        final org.telegram.ui.un unVar = this.f28963y;
        final z60 I = z60.I(unVar, view);
        if (org.telegram.messenger.w3.p0(chat)) {
            long o10 = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
            if (o10 == 0 || !org.telegram.messenger.w3.A(i18, chat, 24)) {
                return false;
            }
            TLRPC.Chat chat2 = chat;
            z60 z60Var2 = I;
            z60Var2.c(2131232091, org.telegram.messenger.cd.L0(2131752089, null), new ag.a3(this, z60Var2, o10, chat2, 5), false);
            long j11 = chat2.f19793id;
            if (org.telegram.messenger.w3.p0(chat2) && org.telegram.messenger.w3.A(i18, chat2, 24)) {
                long j12 = chat2.linked_monoforum_id;
                if (j12 != 0) {
                    j11 = j12;
                }
            }
            TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i18).L0(Long.valueOf(j11));
            TLRPC.User Z1 = org.telegram.messenger.vp.r1(i18).Z1(Long.valueOf(o10));
            z60 z60Var3 = z60Var2;
            if (Z1 != null) {
                z60Var3 = z60Var2;
                if (org.telegram.messenger.w3.w(2, L0)) {
                    z60Var2.c(2131232327, org.telegram.messenger.cd.L0(2131753726, null), null, false);
                    org.telegram.ui.ActionBar.b1 y3 = z60Var2.y();
                    y3.setVisibility(8);
                    org.telegram.messenger.vp r13 = org.telegram.messenger.vp.r1(i18);
                    y11 y11Var = new y11(this, y3, z60Var2, j11, Z1, L0);
                    z60Var3 = z60Var2;
                    r13.K(true, L0, Z1, y11Var);
                }
            }
            o21Var2 = this;
            z60Var = z60Var3;
        } else {
            if (!org.telegram.messenger.w3.y(15, chat) && !org.telegram.messenger.h20.v(user)) {
                i12 = 15;
                tL_forumTopic2 = tL_forumTopic;
                vpVar = r12;
                o21Var = this;
            } else {
                boolean z12 = tL_forumTopic.pinned;
                if (z12) {
                    i10 = 2131232412;
                } else {
                    i10 = 2131232292;
                }
                if (z12) {
                    i11 = 2131751453;
                } else {
                    i11 = 2131751454;
                }
                vpVar = r12;
                o21Var = this;
                tL_forumTopic2 = tL_forumTopic;
                I.c(i10, org.telegram.messenger.cd.L0(i11, null), new org.telegram.ui.fp((Object) this, (Object) I, (Object) vpVar, (Object) tL_forumTopic, 24), false);
                if (tL_forumTopic2.pinned && !z10) {
                    I.c(2131232770, org.telegram.messenger.cd.L0(2131750708, null), new x11(o21Var, 1), false);
                }
                i12 = 15;
            }
            if (org.telegram.messenger.w3.y(i12, chat) || org.telegram.messenger.h20.v(user)) {
                I.c(2131232491, org.telegram.messenger.cd.L0(2131751217, null), new Runnable(o21Var) {
                    public final o21 f24509b;

                    {
                        this.f24509b = o21Var;
                    }

                    @Override
                    public final void run() {
                        int i20;
                        int i21 = r4;
                        o21 o21Var3 = this.f24509b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic2;
                        z60 z60Var4 = I;
                        switch (i21) {
                            case 0:
                                z60Var4.u();
                                o21Var3.f28963y.presentFragment(la1.e0(-o21Var3.f28959r, tL_forumTopic3.f19845id));
                                return;
                            case 1:
                                o21Var3.getClass();
                                z60Var4.u();
                                org.telegram.messenger.vp.r1(o21Var3.f28957n).f18891r7.z(tL_forumTopic3.f19845id, -o21Var3.f28959r, true ^ tL_forumTopic3.closed);
                                return;
                            default:
                                z60Var4.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.f19845id));
                                org.telegram.messenger.rz rzVar = new org.telegram.messenger.rz(28);
                                o21 o21Var4 = this.f24509b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o21Var4.getContext());
                                String J0 = org.telegram.messenger.cd.J0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                                x1Var.R = J0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j13 = o21Var4.f28952h0;
                                if (hashSet.size() == 1) {
                                    i20 = 0;
                                    x1Var.T = org.telegram.messenger.cd.a0(null, null, 2131751499, org.telegram.messenger.vp.r1(o21Var4.f28957n).f18891r7.f(-o21Var4.f28959r, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    i20 = 0;
                                    x1Var.T = org.telegram.messenger.cd.L0(2131751498, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new org.telegram.ui.lh(o21Var4, arrayList, j13, hashSet, rzVar));
                                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new z11(i20));
                                x1Var.show();
                                TextView textView = (TextView) x1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            }
            final long j13 = tL_forumTopic2.f19845id;
            final int currentAccount = unVar.getCurrentAccount();
            final org.telegram.ui.ActionBar.p6 resourceProvider = unVar.getResourceProvider();
            final long j14 = o21Var.f28959r;
            yn ynVar = new yn(I, currentAccount, j14, j13, unVar, resourceProvider);
            final z60 J = I.J();
            J.c(2131232056, org.telegram.messenger.cd.L0(2131753756, null), new org.telegram.ui.rr0(I, 27), false);
            J.c(2131232402, org.telegram.messenger.cd.L0(2131745293, null), new Runnable() {
                @Override
                public final void run() {
                    z60.this.u();
                    SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(currentAccount).e7;
                    StringBuilder sb2 = new StringBuilder("sound_enabled_");
                    long j15 = j14;
                    long j16 = j13;
                    sb2.append(org.telegram.messenger.ot.v(j15, j16, false));
                    boolean z13 = sharedPreferences.getBoolean(sb2.toString(), true);
                    boolean z14 = !z13 ? 1 : 0;
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putBoolean("sound_enabled_" + org.telegram.messenger.ot.v(j15, j16, false), z14).apply();
                    J.u();
                    org.telegram.ui.ActionBar.k2 k2Var = unVar;
                    if (cc.a(k2Var)) {
                        cc.S(z13 ? 1 : 0, k2Var, resourceProvider).j();
                    }
                }
            }, false);
            final org.telegram.ui.ActionBar.b1 y10 = J.y();
            J.c(2131232257, org.telegram.messenger.cd.L0(2131748323, null), new ag.g3(I, resourceProvider, currentAccount, ynVar, 16), false);
            J.c(2131232105, org.telegram.messenger.cd.L0(2131747933, null), new mg.n0(I, j14, j13, unVar, resourceProvider), false);
            J.c(0, "", new org.telegram.messenger.mn(I, currentAccount, j14, j13, unVar, resourceProvider), false);
            final org.telegram.ui.ActionBar.b1 y11 = J.y();
            new Runnable() {
                @Override
                public final void run() {
                    int i20;
                    int i21 = currentAccount;
                    org.telegram.messenger.vp r14 = org.telegram.messenger.vp.r1(i21);
                    long j15 = j14;
                    long j16 = j13;
                    boolean q22 = r14.q2(j15, j16, null);
                    org.telegram.ui.ActionBar.b1 b1Var = y11;
                    org.telegram.ui.ActionBar.b1 b1Var2 = y10;
                    if (q22) {
                        b1Var.j(org.telegram.messenger.cd.L0(2131743873, null), 2131232411, null);
                        i20 = org.telegram.ui.ActionBar.t6.f21295x6;
                        b1Var2.setVisibility(8);
                    } else {
                        b1Var.j(org.telegram.messenger.cd.L0(2131748321, null), 2131232255, null);
                        int i22 = org.telegram.ui.ActionBar.t6.f21170q7;
                        b1Var2.setVisibility(0);
                        if (org.telegram.messenger.vp.r1(i21).r2(j15, j16)) {
                            b1Var2.j(org.telegram.messenger.cd.L0(2131745295, null), 2131232401, null);
                        } else {
                            b1Var2.j(org.telegram.messenger.cd.L0(2131745293, null), 2131232402, null);
                        }
                        i20 = i22;
                    }
                    go.c(b1Var, i20);
                }
            }.run();
            long j15 = o21Var.f28959r;
            org.telegram.messenger.vp vpVar2 = vpVar;
            boolean q22 = vpVar2.q2(j15, tL_forumTopic2.f19845id, null);
            if (q22) {
                i13 = 2131232411;
            } else {
                i13 = 2131232255;
            }
            int i20 = i13;
            if (q22) {
                i14 = 2131743874;
            } else {
                i14 = 2131748329;
            }
            TLRPC.Chat chat3 = chat;
            o21Var2 = this;
            final z60 z60Var4 = I;
            z60Var4.c(i20, org.telegram.messenger.cd.L0(i14, null), new ag.e3(o21Var2, vpVar2, tL_forumTopic, I, J, 22), false);
            if (org.telegram.messenger.w3.i(i18, chat3, tL_forumTopic) && !org.telegram.messenger.h20.u(user)) {
                boolean z13 = tL_forumTopic.closed;
                if (z13) {
                    i16 = 2131232405;
                } else {
                    i16 = 2131232403;
                }
                if (z13) {
                    i17 = 2131746101;
                } else {
                    i17 = 2131752039;
                }
                i15 = 1;
                z11 = false;
                z60Var4.c(i16, org.telegram.messenger.cd.L0(i17, null), new Runnable(o21Var2) {
                    public final o21 f24509b;

                    {
                        this.f24509b = o21Var2;
                    }

                    @Override
                    public final void run() {
                        int i202;
                        int i21 = r4;
                        o21 o21Var3 = this.f24509b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                        z60 z60Var42 = z60Var4;
                        switch (i21) {
                            case 0:
                                z60Var42.u();
                                o21Var3.f28963y.presentFragment(la1.e0(-o21Var3.f28959r, tL_forumTopic3.f19845id));
                                return;
                            case 1:
                                o21Var3.getClass();
                                z60Var42.u();
                                org.telegram.messenger.vp.r1(o21Var3.f28957n).f18891r7.z(tL_forumTopic3.f19845id, -o21Var3.f28959r, true ^ tL_forumTopic3.closed);
                                return;
                            default:
                                z60Var42.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.f19845id));
                                org.telegram.messenger.rz rzVar = new org.telegram.messenger.rz(28);
                                o21 o21Var4 = this.f24509b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o21Var4.getContext());
                                String J0 = org.telegram.messenger.cd.J0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                                x1Var.R = J0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = o21Var4.f28952h0;
                                if (hashSet.size() == 1) {
                                    i202 = 0;
                                    x1Var.T = org.telegram.messenger.cd.a0(null, null, 2131751499, org.telegram.messenger.vp.r1(o21Var4.f28957n).f18891r7.f(-o21Var4.f28959r, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    i202 = 0;
                                    x1Var.T = org.telegram.messenger.cd.L0(2131751498, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new org.telegram.ui.lh(o21Var4, arrayList, j132, hashSet, rzVar));
                                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new z11(i202));
                                x1Var.show();
                                TextView textView = (TextView) x1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            } else {
                z11 = false;
                i15 = 1;
            }
            z60Var = z60Var4;
            if (org.telegram.messenger.w3.e(i18, chat3, tL_forumTopic)) {
                z60Var4.c(2131232107, org.telegram.messenger.cd.J0(i15, "DeleteTopics"), new Runnable(o21Var2) {
                    public final o21 f24509b;

                    {
                        this.f24509b = o21Var2;
                    }

                    @Override
                    public final void run() {
                        int i202;
                        int i21 = r4;
                        o21 o21Var3 = this.f24509b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                        z60 z60Var42 = z60Var4;
                        switch (i21) {
                            case 0:
                                z60Var42.u();
                                o21Var3.f28963y.presentFragment(la1.e0(-o21Var3.f28959r, tL_forumTopic3.f19845id));
                                return;
                            case 1:
                                o21Var3.getClass();
                                z60Var42.u();
                                org.telegram.messenger.vp.r1(o21Var3.f28957n).f18891r7.z(tL_forumTopic3.f19845id, -o21Var3.f28959r, true ^ tL_forumTopic3.closed);
                                return;
                            default:
                                z60Var42.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.f19845id));
                                org.telegram.messenger.rz rzVar = new org.telegram.messenger.rz(28);
                                o21 o21Var4 = this.f24509b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o21Var4.getContext());
                                String J0 = org.telegram.messenger.cd.J0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                                x1Var.R = J0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = o21Var4.f28952h0;
                                if (hashSet.size() == 1) {
                                    i202 = 0;
                                    x1Var.T = org.telegram.messenger.cd.a0(null, null, 2131751499, org.telegram.messenger.vp.r1(o21Var4.f28957n).f18891r7.f(-o21Var4.f28959r, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    i202 = 0;
                                    x1Var.T = org.telegram.messenger.cd.L0(2131751498, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new org.telegram.ui.lh(o21Var4, arrayList, j132, hashSet, rzVar));
                                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new z11(i202));
                                x1Var.show();
                                TextView textView = (TextView) x1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, z11);
                z60Var = z60Var4;
            }
        }
        boolean z14 = view instanceof j21;
        org.telegram.ui.ActionBar.p6 p6Var = o21Var2.f28960s;
        if (z14) {
            ?? drawable = new Drawable();
            Paint paint = new Paint(1);
            drawable.f25955a = paint;
            drawable.f25956b = new RectF();
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G8, p6Var));
            z60Var.W(drawable);
            z60Var.a0(org.telegram.messenger.i0.L(16.0f), 0.0f);
        } else if (z10) {
            z60Var.W(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(16.0f), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, p6Var)));
            z60Var.V(5);
        } else {
            int L = org.telegram.messenger.i0.L(5.0f);
            int L2 = org.telegram.messenger.i0.L(5.0f);
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, p6Var);
            float f7 = 0;
            float f10 = L;
            float f11 = L2;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f7, f7, f10, f10, f11, f11, f7, f7}, null, null));
            shapeDrawable.getPaint().setColor(w02);
            z60Var.W(shapeDrawable);
        }
        z60Var.Z();
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
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        i();
    }

    public final void p() {
        org.telegram.ui.me meVar = this.U;
        if (meVar != null) {
            meVar.run();
        }
        i();
        float k10 = k(k21.f27623b);
        int i10 = 0;
        FrameLayout frameLayout = this.L;
        frameLayout.setTranslationX(org.telegram.messenger.i0.W1(k10, -org.telegram.messenger.i0.L(78.0f), 0));
        if (k10 <= 0.0f) {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        e();
        int i11 = org.telegram.ui.ActionBar.t6.Ci;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        ImageView imageView = this.H;
        org.telegram.ui.ActionBar.p6 p6Var = this.f28960s;
        org.telegram.ui.ActionBar.a7.t(imageView, i11, p6Var, mode);
        org.telegram.ui.ActionBar.a7.t(this.I, i11, p6Var, mode);
        invalidate();
    }

    public final void q() {
        g(true);
        c21 c21Var = this.F;
        boolean canScrollHorizontally = c21Var.canScrollHorizontally(-1);
        c21Var.f30819f3.O(true);
        if (!canScrollHorizontally) {
            c21Var.v0(0);
        }
        e21 e21Var = this.M;
        boolean canScrollVertically = e21Var.canScrollVertically(-1);
        e21Var.f30819f3.O(true);
        if (!canScrollVertically) {
            e21Var.v0(0);
        }
        org.telegram.messenger.i0.g3(new x11(this, 0));
    }

    public final void r(boolean z10) {
        boolean z11;
        if (this.f28945c && !this.e && !this.h) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f28943b.a(z11, z10);
    }

    public final void s() {
        int i10;
        if (!this.V) {
            i10 = 2131231883;
        } else if (this.d) {
            i10 = 2131231884;
        } else {
            i10 = 2131231885;
        }
        this.J.setImageResource(i10);
    }

    public void setAllTopicsHidden(boolean z10) {
        if (this.m0 != z10) {
            this.m0 = z10;
            g(true);
        }
    }

    public void setCurrentTopic(long j10) {
        boolean z10;
        this.f28952h0 = j10;
        c21 c21Var = this.F;
        c21Var.f30819f3.O(true);
        c21Var.invalidate();
        this.M.f30819f3.O(true);
        n21 n21Var = this.G;
        if (n21Var != null) {
            if (j10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            n21Var.c(true, false, z10);
        }
    }

    public void setOnDialogSelected(org.telegram.messenger.j20 j20Var) {
        this.f28956l0 = j20Var;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.f28955k0 = runnable;
    }

    public void setOnTopicSelected(org.telegram.messenger.j20 j20Var) {
        this.f28954j0 = j20Var;
    }

    public void setSideMenuBackgroundDrawable(vg.f fVar) {
        this.Q = fVar;
        fVar.q(org.telegram.messenger.i0.L(16.0f));
        this.Q.p(org.telegram.messenger.i0.L(7.0f));
    }

    public void setSideMenuBackgroundMarginBottom(float f7) {
        this.S = f7;
        i();
        f();
        invalidate();
    }

    public void setSideMenuBackgroundMarginTop(float f7) {
        this.T = f7;
        this.L.setTranslationY(f7);
        i();
        f();
        invalidate();
    }

    public void setSidebarMode(boolean z10) {
        if (this.d && this.e != z10) {
            this.e = z10;
            if (!z10) {
                this.V = false;
                s();
                this.K.setImageResource(2131231882);
            }
            r(true);
            SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(this.f28957n).f7.edit();
            StringBuilder sb2 = new StringBuilder("topicssidepanel");
            long j10 = this.f28959r;
            sb2.append(j10);
            edit.putBoolean(sb2.toString(), z10).putBoolean(a1.g.l(j10, "topicssidetabsb"), this.V).apply();
            org.telegram.ui.me meVar = this.f28949f;
            if (meVar != null) {
                meVar.run();
            }
        }
    }

    public void setTopMenuBackgroundDrawable(vg.f fVar) {
        this.R = fVar;
        fVar.q(org.telegram.messenger.i0.L(18.0f));
        this.R.p(org.telegram.messenger.i0.L(7.0f));
    }

    @Override
    public final void updateColors() {
        try {
            e();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        p();
    }
}
