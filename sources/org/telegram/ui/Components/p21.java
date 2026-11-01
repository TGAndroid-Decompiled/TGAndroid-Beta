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
import org.telegram.ui.ja1;
public final class p21 extends FrameLayout implements org.telegram.messenger.vs, fe.e, org.telegram.ui.ActionBar.k6 {
    public static final int f29321l0 = 0;
    public final o21 D;
    public final ImageView E;
    public final ImageView F;
    public final ImageView G;
    public final ImageView H;
    public final FrameLayout I;
    public final f21 J;
    public long K;
    public long L;
    public final fe.b M;
    public vg.f N;
    public vg.f O;
    public float P;
    public float Q;
    public org.telegram.ui.me R;
    public boolean S;
    public boolean T;
    public float U;
    public boolean V;
    public boolean W;
    public final fe.b f29322a;
    public int f29323a0;
    public final fe.b f29324b;
    public int f29325b0;
    public boolean f29326c;
    public Boolean f29327c0;
    public boolean d;
    public ValueAnimator f29328d0;
    public final int e;
    public long f29329e0;
    public final long f29330f;
    public boolean f29331f0;
    public org.telegram.messenger.k20 f29332g0;
    public final org.telegram.ui.ActionBar.p6 h;
    public Runnable f29333h0;
    public org.telegram.messenger.k20 f29334i0;
    public boolean f29335j0;
    public final HashSet f29336k0;
    public final boolean f29337n;
    public final boolean f29338r;
    public final org.telegram.ui.un f29339s;
    public final boolean f29340w;
    public final FrameLayout f29341x;
    public final d21 f29342y;

    public p21(Activity activity, org.telegram.ui.un unVar, int i10, long j10, boolean z10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity);
        FrameLayout frameLayout;
        float f7;
        boolean z11;
        boolean z12;
        int i11;
        int i12;
        boolean z13;
        gr grVar = gr.h;
        this.f29322a = new fe.b(0, this, grVar, 380L, true);
        this.f29324b = new fe.b(1, this, grVar, 380L, false);
        this.M = new fe.b(0, new x11(this), grVar, 320L, false);
        this.U = 0.0f;
        this.f29336k0 = new HashSet();
        this.f29339s = unVar;
        this.f29326c = z10;
        this.e = i10;
        this.f29330f = j10;
        this.h = p6Var;
        long j11 = -j10;
        this.f29337n = org.telegram.messenger.w3.p0(org.telegram.messenger.wp.r1(i10).L0(Long.valueOf(j11)));
        boolean v = org.telegram.messenger.i20.v(org.telegram.messenger.wp.r1(i10).Z1(Long.valueOf(j10)));
        this.f29338r = v;
        this.f29340w = !org.telegram.messenger.m5.w("topics_end_reached_", j11, org.telegram.messenger.e20.i(i10).k(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        ?? frameLayout2 = new FrameLayout(activity);
        this.f29341x = frameLayout2;
        addView(frameLayout2, w7.b6.d(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.I = frameLayout3;
        addView(frameLayout3, w7.b6.d(64, -1.0f, 115, 7.0f, 7.0f, 7.0f, 7.0f));
        d21 d21Var = new d21(this, activity, i10, new org.telegram.messenger.k20(this) {
            public final p21 f32051b;

            {
                this.f32051b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                boolean z14;
                boolean z15;
                int i13;
                long j12;
                org.telegram.messenger.y00 y00Var;
                long j13;
                boolean z16;
                ArrayList arrayList;
                boolean z17;
                boolean z18;
                long j14;
                long j15;
                boolean z19;
                boolean z20;
                int i14 = r2;
                p21 p21Var = this.f32051b;
                switch (i14) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        q51 q51Var = (q51) obj2;
                        boolean z21 = p21Var.f29338r;
                        int i15 = p21Var.e;
                        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i15);
                        long j16 = p21Var.f29330f;
                        long j17 = -j16;
                        TLRPC.Chat L0 = r12.L0(Long.valueOf(j17));
                        TLRPC.User Z1 = org.telegram.messenger.wp.r1(i15).Z1(Long.valueOf(j16));
                        org.telegram.messenger.y00 y00Var2 = org.telegram.messenger.wp.r1(i15).f19234r7;
                        ArrayList l4 = y00Var2.l(j17);
                        boolean z22 = p21Var.f29337n;
                        int i16 = j21.f27254b;
                        b51 K = b51.K(j21.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.f24648q = z22;
                        if (p21Var.f29329e0 == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        K.L(z14);
                        arrayList2.add(K);
                        if (l4 != null) {
                            int size = l4.size();
                            int i17 = 0;
                            z15 = false;
                            while (i17 < size) {
                                Object obj3 = l4.get(i17);
                                int i18 = i17 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                int i19 = size;
                                if (z21) {
                                    i13 = i18;
                                    if (tL_forumTopic.f19846id == 1) {
                                        size = i19;
                                        i17 = i13;
                                    }
                                } else {
                                    i13 = i18;
                                }
                                if (p21Var.f29336k0.contains(Integer.valueOf(tL_forumTopic.f19846id))) {
                                    size = i19;
                                    i17 = i13;
                                } else {
                                    boolean z23 = tL_forumTopic.pinned;
                                    if (!z23 && z15) {
                                        if (!arrayList2.isEmpty()) {
                                            ((b51) i0.a.g(1, arrayList2)).f24655y |= 8;
                                        }
                                        q51Var.L();
                                        z15 = false;
                                    } else if (z23 && !z15) {
                                        q51Var.M();
                                        z15 = true;
                                    }
                                    b51 K2 = b51.K(j21.class);
                                    K2.f24654x = j16;
                                    K2.d = tL_forumTopic.f19846id;
                                    K2.G = tL_forumTopic;
                                    if (z22) {
                                        j12 = j16;
                                        K2.B = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j12 = j16;
                                    }
                                    long j18 = p21Var.f29329e0;
                                    if (z22) {
                                        y00Var = y00Var2;
                                        j13 = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
                                    } else {
                                        y00Var = y00Var2;
                                        j13 = tL_forumTopic.f19846id;
                                    }
                                    if (j18 == j13) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    K2.L(z16);
                                    arrayList2.add(K2);
                                    size = i19;
                                    i17 = i13;
                                    y00Var2 = y00Var;
                                    j16 = j12;
                                }
                            }
                        } else {
                            z15 = false;
                        }
                        org.telegram.messenger.y00 y00Var3 = y00Var2;
                        if (z15) {
                            q51Var.L();
                        }
                        if (l4 != null && !l4.isEmpty() && !y00Var3.e(j17) && p21Var.f29340w) {
                            b51 K3 = b51.K(j21.class);
                            K3.d = -2;
                            K3.f24649r = true;
                            arrayList2.add(K3);
                            b51 K4 = b51.K(j21.class);
                            K4.d = -3;
                            K4.f24649r = true;
                            arrayList2.add(K4);
                            b51 K5 = b51.K(j21.class);
                            K5.d = -4;
                            K5.f24649r = true;
                            arrayList2.add(K5);
                        }
                        if (!z21 && !z22) {
                            if ((L0 != null && org.telegram.messenger.w3.w(15, L0)) || org.telegram.messenger.i20.v(Z1)) {
                                b51 K6 = b51.K(j21.class);
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
                        p21.c(p21Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        q51 q51Var2 = (q51) obj2;
                        boolean z24 = p21Var.f29337n;
                        int i20 = p21Var.e;
                        org.telegram.messenger.wp r13 = org.telegram.messenger.wp.r1(i20);
                        long j19 = p21Var.f29330f;
                        long j20 = -j19;
                        TLRPC.Chat L02 = r13.L0(Long.valueOf(j20));
                        TLRPC.User Z12 = org.telegram.messenger.wp.r1(i20).Z1(Long.valueOf(j19));
                        org.telegram.messenger.y00 y00Var4 = org.telegram.messenger.wp.r1(i20).f19234r7;
                        ArrayList l10 = y00Var4.l(j20);
                        boolean z25 = p21Var.f29338r;
                        if (!z25) {
                            int i21 = n21.f28642b;
                            b51 K7 = b51.K(n21.class);
                            K7.d = 0;
                            arrayList = l10;
                            K7.B = 0L;
                            K7.G = null;
                            K7.f24648q = z24;
                            K7.f24655y = z25 ? 1 : 0;
                            if (p21Var.f29329e0 == 0) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            K7.L(z20);
                            arrayList3.add(K7);
                        } else {
                            arrayList = l10;
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            boolean z26 = false;
                            int i22 = 0;
                            while (i22 < size2) {
                                int i23 = size2;
                                Object obj4 = arrayList.get(i22);
                                i22++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = Z12;
                                if (z25) {
                                    z18 = z26;
                                    if (tL_forumTopic2.f19846id == 1) {
                                        size2 = i23;
                                        Z12 = user;
                                        z26 = z18;
                                    }
                                } else {
                                    z18 = z26;
                                }
                                if (p21Var.f29336k0.contains(Integer.valueOf(tL_forumTopic2.f19846id))) {
                                    size2 = i23;
                                    Z12 = user;
                                    z26 = z18;
                                } else {
                                    boolean z27 = tL_forumTopic2.pinned;
                                    if (!z27 && z18) {
                                        q51Var2.L();
                                        z26 = false;
                                    } else if (z27 && !z18) {
                                        q51Var2.M();
                                        z26 = true;
                                    } else {
                                        z26 = z18;
                                    }
                                    int i24 = n21.f28642b;
                                    b51 K8 = b51.K(n21.class);
                                    K8.f24654x = j19;
                                    long j21 = j19;
                                    K8.d = tL_forumTopic2.f19846id;
                                    K8.G = tL_forumTopic2;
                                    if (z24) {
                                        K8.B = org.telegram.messenger.o5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j22 = p21Var.f29329e0;
                                    if (z24) {
                                        j14 = j22;
                                        j15 = org.telegram.messenger.o5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j14 = j22;
                                        j15 = tL_forumTopic2.f19846id;
                                    }
                                    if (j14 == j15) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    K8.L(z19);
                                    arrayList3.add(K8);
                                    size2 = i23;
                                    Z12 = user;
                                    j19 = j21;
                                }
                            }
                            z17 = z26;
                        } else {
                            z17 = false;
                        }
                        TLRPC.User user2 = Z12;
                        if (z17) {
                            q51Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !y00Var4.e(j20) && p21Var.f29340w) {
                            int i25 = n21.f28642b;
                            b51 K9 = b51.K(n21.class);
                            K9.d = -2;
                            K9.f24649r = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            b51 K10 = b51.K(n21.class);
                            K10.d = -3;
                            K10.f24649r = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            b51 K11 = b51.K(n21.class);
                            K11.d = -4;
                            K11.f24649r = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z25 && !z24) {
                            if ((L02 != null && org.telegram.messenger.w3.w(15, L02)) || org.telegram.messenger.i20.v(user2)) {
                                int i26 = n21.f28642b;
                                b51 K12 = b51.K(n21.class);
                                K12.d = -2;
                                K12.B = -2L;
                                K12.G = null;
                                K12.f24648q = false;
                                arrayList3.add(K12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new x11(this), new x11(this), p6Var);
        this.f29342y = d21Var;
        d21Var.E1(new org.telegram.messenger.k20(this) {
            public final p21 f32051b;

            {
                this.f32051b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                boolean z14;
                boolean z15;
                int i13;
                long j12;
                org.telegram.messenger.y00 y00Var;
                long j13;
                boolean z16;
                ArrayList arrayList;
                boolean z17;
                boolean z18;
                long j14;
                long j15;
                boolean z19;
                boolean z20;
                int i14 = r2;
                p21 p21Var = this.f32051b;
                switch (i14) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        q51 q51Var = (q51) obj2;
                        boolean z21 = p21Var.f29338r;
                        int i15 = p21Var.e;
                        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i15);
                        long j16 = p21Var.f29330f;
                        long j17 = -j16;
                        TLRPC.Chat L0 = r12.L0(Long.valueOf(j17));
                        TLRPC.User Z1 = org.telegram.messenger.wp.r1(i15).Z1(Long.valueOf(j16));
                        org.telegram.messenger.y00 y00Var2 = org.telegram.messenger.wp.r1(i15).f19234r7;
                        ArrayList l4 = y00Var2.l(j17);
                        boolean z22 = p21Var.f29337n;
                        int i16 = j21.f27254b;
                        b51 K = b51.K(j21.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.f24648q = z22;
                        if (p21Var.f29329e0 == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        K.L(z14);
                        arrayList2.add(K);
                        if (l4 != null) {
                            int size = l4.size();
                            int i17 = 0;
                            z15 = false;
                            while (i17 < size) {
                                Object obj3 = l4.get(i17);
                                int i18 = i17 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                int i19 = size;
                                if (z21) {
                                    i13 = i18;
                                    if (tL_forumTopic.f19846id == 1) {
                                        size = i19;
                                        i17 = i13;
                                    }
                                } else {
                                    i13 = i18;
                                }
                                if (p21Var.f29336k0.contains(Integer.valueOf(tL_forumTopic.f19846id))) {
                                    size = i19;
                                    i17 = i13;
                                } else {
                                    boolean z23 = tL_forumTopic.pinned;
                                    if (!z23 && z15) {
                                        if (!arrayList2.isEmpty()) {
                                            ((b51) i0.a.g(1, arrayList2)).f24655y |= 8;
                                        }
                                        q51Var.L();
                                        z15 = false;
                                    } else if (z23 && !z15) {
                                        q51Var.M();
                                        z15 = true;
                                    }
                                    b51 K2 = b51.K(j21.class);
                                    K2.f24654x = j16;
                                    K2.d = tL_forumTopic.f19846id;
                                    K2.G = tL_forumTopic;
                                    if (z22) {
                                        j12 = j16;
                                        K2.B = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j12 = j16;
                                    }
                                    long j18 = p21Var.f29329e0;
                                    if (z22) {
                                        y00Var = y00Var2;
                                        j13 = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
                                    } else {
                                        y00Var = y00Var2;
                                        j13 = tL_forumTopic.f19846id;
                                    }
                                    if (j18 == j13) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    K2.L(z16);
                                    arrayList2.add(K2);
                                    size = i19;
                                    i17 = i13;
                                    y00Var2 = y00Var;
                                    j16 = j12;
                                }
                            }
                        } else {
                            z15 = false;
                        }
                        org.telegram.messenger.y00 y00Var3 = y00Var2;
                        if (z15) {
                            q51Var.L();
                        }
                        if (l4 != null && !l4.isEmpty() && !y00Var3.e(j17) && p21Var.f29340w) {
                            b51 K3 = b51.K(j21.class);
                            K3.d = -2;
                            K3.f24649r = true;
                            arrayList2.add(K3);
                            b51 K4 = b51.K(j21.class);
                            K4.d = -3;
                            K4.f24649r = true;
                            arrayList2.add(K4);
                            b51 K5 = b51.K(j21.class);
                            K5.d = -4;
                            K5.f24649r = true;
                            arrayList2.add(K5);
                        }
                        if (!z21 && !z22) {
                            if ((L0 != null && org.telegram.messenger.w3.w(15, L0)) || org.telegram.messenger.i20.v(Z1)) {
                                b51 K6 = b51.K(j21.class);
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
                        p21.c(p21Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        q51 q51Var2 = (q51) obj2;
                        boolean z24 = p21Var.f29337n;
                        int i20 = p21Var.e;
                        org.telegram.messenger.wp r13 = org.telegram.messenger.wp.r1(i20);
                        long j19 = p21Var.f29330f;
                        long j20 = -j19;
                        TLRPC.Chat L02 = r13.L0(Long.valueOf(j20));
                        TLRPC.User Z12 = org.telegram.messenger.wp.r1(i20).Z1(Long.valueOf(j19));
                        org.telegram.messenger.y00 y00Var4 = org.telegram.messenger.wp.r1(i20).f19234r7;
                        ArrayList l10 = y00Var4.l(j20);
                        boolean z25 = p21Var.f29338r;
                        if (!z25) {
                            int i21 = n21.f28642b;
                            b51 K7 = b51.K(n21.class);
                            K7.d = 0;
                            arrayList = l10;
                            K7.B = 0L;
                            K7.G = null;
                            K7.f24648q = z24;
                            K7.f24655y = z25 ? 1 : 0;
                            if (p21Var.f29329e0 == 0) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            K7.L(z20);
                            arrayList3.add(K7);
                        } else {
                            arrayList = l10;
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            boolean z26 = false;
                            int i22 = 0;
                            while (i22 < size2) {
                                int i23 = size2;
                                Object obj4 = arrayList.get(i22);
                                i22++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = Z12;
                                if (z25) {
                                    z18 = z26;
                                    if (tL_forumTopic2.f19846id == 1) {
                                        size2 = i23;
                                        Z12 = user;
                                        z26 = z18;
                                    }
                                } else {
                                    z18 = z26;
                                }
                                if (p21Var.f29336k0.contains(Integer.valueOf(tL_forumTopic2.f19846id))) {
                                    size2 = i23;
                                    Z12 = user;
                                    z26 = z18;
                                } else {
                                    boolean z27 = tL_forumTopic2.pinned;
                                    if (!z27 && z18) {
                                        q51Var2.L();
                                        z26 = false;
                                    } else if (z27 && !z18) {
                                        q51Var2.M();
                                        z26 = true;
                                    } else {
                                        z26 = z18;
                                    }
                                    int i24 = n21.f28642b;
                                    b51 K8 = b51.K(n21.class);
                                    K8.f24654x = j19;
                                    long j21 = j19;
                                    K8.d = tL_forumTopic2.f19846id;
                                    K8.G = tL_forumTopic2;
                                    if (z24) {
                                        K8.B = org.telegram.messenger.o5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j22 = p21Var.f29329e0;
                                    if (z24) {
                                        j14 = j22;
                                        j15 = org.telegram.messenger.o5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j14 = j22;
                                        j15 = tL_forumTopic2.f19846id;
                                    }
                                    if (j14 == j15) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    K8.L(z19);
                                    arrayList3.add(K8);
                                    size2 = i23;
                                    Z12 = user;
                                    j19 = j21;
                                }
                            }
                            z17 = z26;
                        } else {
                            z17 = false;
                        }
                        TLRPC.User user2 = Z12;
                        if (z17) {
                            q51Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !y00Var4.e(j20) && p21Var.f29340w) {
                            int i25 = n21.f28642b;
                            b51 K9 = b51.K(n21.class);
                            K9.d = -2;
                            K9.f24649r = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            b51 K10 = b51.K(n21.class);
                            K10.d = -3;
                            K10.f24649r = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            b51 K11 = b51.K(n21.class);
                            K11.d = -4;
                            K11.f24649r = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z25 && !z24) {
                            if ((L02 != null && org.telegram.messenger.w3.w(15, L02)) || org.telegram.messenger.i20.v(user2)) {
                                int i26 = n21.f28642b;
                                b51 K12 = b51.K(n21.class);
                                K12.d = -2;
                                K12.B = -2L;
                                K12.G = null;
                                K12.f24648q = false;
                                arrayList3.add(K12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        d21Var.setWillNotDraw(false);
        d21Var.f31183f3.f29638r = false;
        d21Var.getContext();
        org.telegram.ui.br brVar = new org.telegram.ui.br((ViewGroup) d21Var, 6);
        d21Var.f31182e3 = brVar;
        d21Var.setLayoutManager(brVar);
        frameLayout2.addView(d21Var, w7.b6.d(-1, -1.0f, 119, 41.0f, 0.0f, 0.0f, 0.0f));
        d21Var.j(new e21(this, 0));
        if (v) {
            o21 o21Var = new o21(i10, activity, p6Var);
            this.D = o21Var;
            if (this.f29329e0 == 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            o21Var.c(true, false, z13);
            o21Var.setOnClickListener(new View.OnClickListener(this) {
                public final p21 f31139b;

                {
                    this.f31139b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            p21 p21Var = this.f31139b;
                            f21 f21Var = p21Var.J;
                            f21Var.z1(false);
                            d21 d21Var2 = p21Var.f29342y;
                            d21Var2.z1(false);
                            p21Var.M.a(false, true);
                            org.telegram.messenger.i0.a4(f21Var);
                            org.telegram.messenger.i0.a4(d21Var2);
                            return;
                        case 1:
                            this.f31139b.f29332g0.a(0, Boolean.FALSE);
                            return;
                        default:
                            p21.b(this.f31139b);
                            return;
                    }
                }
            });
            frameLayout = frameLayout3;
            frameLayout.addView(o21Var, w7.b6.d(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            frameLayout = frameLayout3;
            this.D = null;
        }
        ViewGroup viewGroup = frameLayout;
        f21 f21Var = new f21(activity, i10, new org.telegram.messenger.k20(this) {
            public final p21 f32051b;

            {
                this.f32051b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                boolean z14;
                boolean z15;
                int i13;
                long j12;
                org.telegram.messenger.y00 y00Var;
                long j13;
                boolean z16;
                ArrayList arrayList;
                boolean z17;
                boolean z18;
                long j14;
                long j15;
                boolean z19;
                boolean z20;
                int i14 = r2;
                p21 p21Var = this.f32051b;
                switch (i14) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        q51 q51Var = (q51) obj2;
                        boolean z21 = p21Var.f29338r;
                        int i15 = p21Var.e;
                        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i15);
                        long j16 = p21Var.f29330f;
                        long j17 = -j16;
                        TLRPC.Chat L0 = r12.L0(Long.valueOf(j17));
                        TLRPC.User Z1 = org.telegram.messenger.wp.r1(i15).Z1(Long.valueOf(j16));
                        org.telegram.messenger.y00 y00Var2 = org.telegram.messenger.wp.r1(i15).f19234r7;
                        ArrayList l4 = y00Var2.l(j17);
                        boolean z22 = p21Var.f29337n;
                        int i16 = j21.f27254b;
                        b51 K = b51.K(j21.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.f24648q = z22;
                        if (p21Var.f29329e0 == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        K.L(z14);
                        arrayList2.add(K);
                        if (l4 != null) {
                            int size = l4.size();
                            int i17 = 0;
                            z15 = false;
                            while (i17 < size) {
                                Object obj3 = l4.get(i17);
                                int i18 = i17 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                int i19 = size;
                                if (z21) {
                                    i13 = i18;
                                    if (tL_forumTopic.f19846id == 1) {
                                        size = i19;
                                        i17 = i13;
                                    }
                                } else {
                                    i13 = i18;
                                }
                                if (p21Var.f29336k0.contains(Integer.valueOf(tL_forumTopic.f19846id))) {
                                    size = i19;
                                    i17 = i13;
                                } else {
                                    boolean z23 = tL_forumTopic.pinned;
                                    if (!z23 && z15) {
                                        if (!arrayList2.isEmpty()) {
                                            ((b51) i0.a.g(1, arrayList2)).f24655y |= 8;
                                        }
                                        q51Var.L();
                                        z15 = false;
                                    } else if (z23 && !z15) {
                                        q51Var.M();
                                        z15 = true;
                                    }
                                    b51 K2 = b51.K(j21.class);
                                    K2.f24654x = j16;
                                    K2.d = tL_forumTopic.f19846id;
                                    K2.G = tL_forumTopic;
                                    if (z22) {
                                        j12 = j16;
                                        K2.B = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j12 = j16;
                                    }
                                    long j18 = p21Var.f29329e0;
                                    if (z22) {
                                        y00Var = y00Var2;
                                        j13 = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
                                    } else {
                                        y00Var = y00Var2;
                                        j13 = tL_forumTopic.f19846id;
                                    }
                                    if (j18 == j13) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    K2.L(z16);
                                    arrayList2.add(K2);
                                    size = i19;
                                    i17 = i13;
                                    y00Var2 = y00Var;
                                    j16 = j12;
                                }
                            }
                        } else {
                            z15 = false;
                        }
                        org.telegram.messenger.y00 y00Var3 = y00Var2;
                        if (z15) {
                            q51Var.L();
                        }
                        if (l4 != null && !l4.isEmpty() && !y00Var3.e(j17) && p21Var.f29340w) {
                            b51 K3 = b51.K(j21.class);
                            K3.d = -2;
                            K3.f24649r = true;
                            arrayList2.add(K3);
                            b51 K4 = b51.K(j21.class);
                            K4.d = -3;
                            K4.f24649r = true;
                            arrayList2.add(K4);
                            b51 K5 = b51.K(j21.class);
                            K5.d = -4;
                            K5.f24649r = true;
                            arrayList2.add(K5);
                        }
                        if (!z21 && !z22) {
                            if ((L0 != null && org.telegram.messenger.w3.w(15, L0)) || org.telegram.messenger.i20.v(Z1)) {
                                b51 K6 = b51.K(j21.class);
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
                        p21.c(p21Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        q51 q51Var2 = (q51) obj2;
                        boolean z24 = p21Var.f29337n;
                        int i20 = p21Var.e;
                        org.telegram.messenger.wp r13 = org.telegram.messenger.wp.r1(i20);
                        long j19 = p21Var.f29330f;
                        long j20 = -j19;
                        TLRPC.Chat L02 = r13.L0(Long.valueOf(j20));
                        TLRPC.User Z12 = org.telegram.messenger.wp.r1(i20).Z1(Long.valueOf(j19));
                        org.telegram.messenger.y00 y00Var4 = org.telegram.messenger.wp.r1(i20).f19234r7;
                        ArrayList l10 = y00Var4.l(j20);
                        boolean z25 = p21Var.f29338r;
                        if (!z25) {
                            int i21 = n21.f28642b;
                            b51 K7 = b51.K(n21.class);
                            K7.d = 0;
                            arrayList = l10;
                            K7.B = 0L;
                            K7.G = null;
                            K7.f24648q = z24;
                            K7.f24655y = z25 ? 1 : 0;
                            if (p21Var.f29329e0 == 0) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            K7.L(z20);
                            arrayList3.add(K7);
                        } else {
                            arrayList = l10;
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            boolean z26 = false;
                            int i22 = 0;
                            while (i22 < size2) {
                                int i23 = size2;
                                Object obj4 = arrayList.get(i22);
                                i22++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = Z12;
                                if (z25) {
                                    z18 = z26;
                                    if (tL_forumTopic2.f19846id == 1) {
                                        size2 = i23;
                                        Z12 = user;
                                        z26 = z18;
                                    }
                                } else {
                                    z18 = z26;
                                }
                                if (p21Var.f29336k0.contains(Integer.valueOf(tL_forumTopic2.f19846id))) {
                                    size2 = i23;
                                    Z12 = user;
                                    z26 = z18;
                                } else {
                                    boolean z27 = tL_forumTopic2.pinned;
                                    if (!z27 && z18) {
                                        q51Var2.L();
                                        z26 = false;
                                    } else if (z27 && !z18) {
                                        q51Var2.M();
                                        z26 = true;
                                    } else {
                                        z26 = z18;
                                    }
                                    int i24 = n21.f28642b;
                                    b51 K8 = b51.K(n21.class);
                                    K8.f24654x = j19;
                                    long j21 = j19;
                                    K8.d = tL_forumTopic2.f19846id;
                                    K8.G = tL_forumTopic2;
                                    if (z24) {
                                        K8.B = org.telegram.messenger.o5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j22 = p21Var.f29329e0;
                                    if (z24) {
                                        j14 = j22;
                                        j15 = org.telegram.messenger.o5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j14 = j22;
                                        j15 = tL_forumTopic2.f19846id;
                                    }
                                    if (j14 == j15) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    K8.L(z19);
                                    arrayList3.add(K8);
                                    size2 = i23;
                                    Z12 = user;
                                    j19 = j21;
                                }
                            }
                            z17 = z26;
                        } else {
                            z17 = false;
                        }
                        TLRPC.User user2 = Z12;
                        if (z17) {
                            q51Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !y00Var4.e(j20) && p21Var.f29340w) {
                            int i25 = n21.f28642b;
                            b51 K9 = b51.K(n21.class);
                            K9.d = -2;
                            K9.f24649r = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            b51 K10 = b51.K(n21.class);
                            K10.d = -3;
                            K10.f24649r = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            b51 K11 = b51.K(n21.class);
                            K11.d = -4;
                            K11.f24649r = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z25 && !z24) {
                            if ((L02 != null && org.telegram.messenger.w3.w(15, L02)) || org.telegram.messenger.i20.v(user2)) {
                                int i26 = n21.f28642b;
                                b51 K12 = b51.K(n21.class);
                                K12.d = -2;
                                K12.B = -2L;
                                K12.G = null;
                                K12.f24648q = false;
                                arrayList3.add(K12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new x11(this), new x11(this), p6Var);
        this.J = f21Var;
        f21Var.E1(new org.telegram.messenger.k20(this) {
            public final p21 f32051b;

            {
                this.f32051b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                boolean z14;
                boolean z15;
                int i13;
                long j12;
                org.telegram.messenger.y00 y00Var;
                long j13;
                boolean z16;
                ArrayList arrayList;
                boolean z17;
                boolean z18;
                long j14;
                long j15;
                boolean z19;
                boolean z20;
                int i14 = r2;
                p21 p21Var = this.f32051b;
                switch (i14) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        q51 q51Var = (q51) obj2;
                        boolean z21 = p21Var.f29338r;
                        int i15 = p21Var.e;
                        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i15);
                        long j16 = p21Var.f29330f;
                        long j17 = -j16;
                        TLRPC.Chat L0 = r12.L0(Long.valueOf(j17));
                        TLRPC.User Z1 = org.telegram.messenger.wp.r1(i15).Z1(Long.valueOf(j16));
                        org.telegram.messenger.y00 y00Var2 = org.telegram.messenger.wp.r1(i15).f19234r7;
                        ArrayList l4 = y00Var2.l(j17);
                        boolean z22 = p21Var.f29337n;
                        int i16 = j21.f27254b;
                        b51 K = b51.K(j21.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.f24648q = z22;
                        if (p21Var.f29329e0 == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        K.L(z14);
                        arrayList2.add(K);
                        if (l4 != null) {
                            int size = l4.size();
                            int i17 = 0;
                            z15 = false;
                            while (i17 < size) {
                                Object obj3 = l4.get(i17);
                                int i18 = i17 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                int i19 = size;
                                if (z21) {
                                    i13 = i18;
                                    if (tL_forumTopic.f19846id == 1) {
                                        size = i19;
                                        i17 = i13;
                                    }
                                } else {
                                    i13 = i18;
                                }
                                if (p21Var.f29336k0.contains(Integer.valueOf(tL_forumTopic.f19846id))) {
                                    size = i19;
                                    i17 = i13;
                                } else {
                                    boolean z23 = tL_forumTopic.pinned;
                                    if (!z23 && z15) {
                                        if (!arrayList2.isEmpty()) {
                                            ((b51) i0.a.g(1, arrayList2)).f24655y |= 8;
                                        }
                                        q51Var.L();
                                        z15 = false;
                                    } else if (z23 && !z15) {
                                        q51Var.M();
                                        z15 = true;
                                    }
                                    b51 K2 = b51.K(j21.class);
                                    K2.f24654x = j16;
                                    K2.d = tL_forumTopic.f19846id;
                                    K2.G = tL_forumTopic;
                                    if (z22) {
                                        j12 = j16;
                                        K2.B = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j12 = j16;
                                    }
                                    long j18 = p21Var.f29329e0;
                                    if (z22) {
                                        y00Var = y00Var2;
                                        j13 = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
                                    } else {
                                        y00Var = y00Var2;
                                        j13 = tL_forumTopic.f19846id;
                                    }
                                    if (j18 == j13) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    K2.L(z16);
                                    arrayList2.add(K2);
                                    size = i19;
                                    i17 = i13;
                                    y00Var2 = y00Var;
                                    j16 = j12;
                                }
                            }
                        } else {
                            z15 = false;
                        }
                        org.telegram.messenger.y00 y00Var3 = y00Var2;
                        if (z15) {
                            q51Var.L();
                        }
                        if (l4 != null && !l4.isEmpty() && !y00Var3.e(j17) && p21Var.f29340w) {
                            b51 K3 = b51.K(j21.class);
                            K3.d = -2;
                            K3.f24649r = true;
                            arrayList2.add(K3);
                            b51 K4 = b51.K(j21.class);
                            K4.d = -3;
                            K4.f24649r = true;
                            arrayList2.add(K4);
                            b51 K5 = b51.K(j21.class);
                            K5.d = -4;
                            K5.f24649r = true;
                            arrayList2.add(K5);
                        }
                        if (!z21 && !z22) {
                            if ((L0 != null && org.telegram.messenger.w3.w(15, L0)) || org.telegram.messenger.i20.v(Z1)) {
                                b51 K6 = b51.K(j21.class);
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
                        p21.c(p21Var, (ArrayList) obj2);
                        return;
                    default:
                        ArrayList arrayList3 = (ArrayList) obj;
                        q51 q51Var2 = (q51) obj2;
                        boolean z24 = p21Var.f29337n;
                        int i20 = p21Var.e;
                        org.telegram.messenger.wp r13 = org.telegram.messenger.wp.r1(i20);
                        long j19 = p21Var.f29330f;
                        long j20 = -j19;
                        TLRPC.Chat L02 = r13.L0(Long.valueOf(j20));
                        TLRPC.User Z12 = org.telegram.messenger.wp.r1(i20).Z1(Long.valueOf(j19));
                        org.telegram.messenger.y00 y00Var4 = org.telegram.messenger.wp.r1(i20).f19234r7;
                        ArrayList l10 = y00Var4.l(j20);
                        boolean z25 = p21Var.f29338r;
                        if (!z25) {
                            int i21 = n21.f28642b;
                            b51 K7 = b51.K(n21.class);
                            K7.d = 0;
                            arrayList = l10;
                            K7.B = 0L;
                            K7.G = null;
                            K7.f24648q = z24;
                            K7.f24655y = z25 ? 1 : 0;
                            if (p21Var.f29329e0 == 0) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            K7.L(z20);
                            arrayList3.add(K7);
                        } else {
                            arrayList = l10;
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            boolean z26 = false;
                            int i22 = 0;
                            while (i22 < size2) {
                                int i23 = size2;
                                Object obj4 = arrayList.get(i22);
                                i22++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = Z12;
                                if (z25) {
                                    z18 = z26;
                                    if (tL_forumTopic2.f19846id == 1) {
                                        size2 = i23;
                                        Z12 = user;
                                        z26 = z18;
                                    }
                                } else {
                                    z18 = z26;
                                }
                                if (p21Var.f29336k0.contains(Integer.valueOf(tL_forumTopic2.f19846id))) {
                                    size2 = i23;
                                    Z12 = user;
                                    z26 = z18;
                                } else {
                                    boolean z27 = tL_forumTopic2.pinned;
                                    if (!z27 && z18) {
                                        q51Var2.L();
                                        z26 = false;
                                    } else if (z27 && !z18) {
                                        q51Var2.M();
                                        z26 = true;
                                    } else {
                                        z26 = z18;
                                    }
                                    int i24 = n21.f28642b;
                                    b51 K8 = b51.K(n21.class);
                                    K8.f24654x = j19;
                                    long j21 = j19;
                                    K8.d = tL_forumTopic2.f19846id;
                                    K8.G = tL_forumTopic2;
                                    if (z24) {
                                        K8.B = org.telegram.messenger.o5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j22 = p21Var.f29329e0;
                                    if (z24) {
                                        j14 = j22;
                                        j15 = org.telegram.messenger.o5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j14 = j22;
                                        j15 = tL_forumTopic2.f19846id;
                                    }
                                    if (j14 == j15) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    K8.L(z19);
                                    arrayList3.add(K8);
                                    size2 = i23;
                                    Z12 = user;
                                    j19 = j21;
                                }
                            }
                            z17 = z26;
                        } else {
                            z17 = false;
                        }
                        TLRPC.User user2 = Z12;
                        if (z17) {
                            q51Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !y00Var4.e(j20) && p21Var.f29340w) {
                            int i25 = n21.f28642b;
                            b51 K9 = b51.K(n21.class);
                            K9.d = -2;
                            K9.f24649r = true;
                            K9.e = false;
                            arrayList3.add(K9);
                            b51 K10 = b51.K(n21.class);
                            K10.d = -3;
                            K10.f24649r = true;
                            K10.e = false;
                            arrayList3.add(K10);
                            b51 K11 = b51.K(n21.class);
                            K11.d = -4;
                            K11.f24649r = true;
                            K11.e = false;
                            arrayList3.add(K11);
                        }
                        if (!z25 && !z24) {
                            if ((L02 != null && org.telegram.messenger.w3.w(15, L02)) || org.telegram.messenger.i20.v(user2)) {
                                int i26 = n21.f28642b;
                                b51 K12 = b51.K(n21.class);
                                K12.d = -2;
                                K12.B = -2L;
                                K12.G = null;
                                K12.f24648q = false;
                                arrayList3.add(K12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        f21Var.f31183f3.f29638r = false;
        f21Var.setClipToPadding(false);
        f21Var.setClipChildren(false);
        if (v) {
            f7 = 90.0f;
        } else {
            f7 = 48.0f;
        }
        viewGroup.addView(f21Var, w7.b6.d(-1, -1.0f, 119, 0.0f, f7, 0.0f, 0.0f));
        f21Var.j(new e21(this, 1));
        ImageView j12 = j(activity, 2131231883, new View.OnClickListener(this) {
            public final p21 f31139b;

            {
                this.f31139b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        p21 p21Var = this.f31139b;
                        f21 f21Var2 = p21Var.J;
                        f21Var2.z1(false);
                        d21 d21Var2 = p21Var.f29342y;
                        d21Var2.z1(false);
                        p21Var.M.a(false, true);
                        org.telegram.messenger.i0.a4(f21Var2);
                        org.telegram.messenger.i0.a4(d21Var2);
                        return;
                    case 1:
                        this.f31139b.f29332g0.a(0, Boolean.FALSE);
                        return;
                    default:
                        p21.b(this.f31139b);
                        return;
                }
            }
        });
        this.G = j12;
        ImageView j13 = j(activity, 2131231883, new View.OnClickListener(this) {
            public final p21 f31139b;

            {
                this.f31139b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        p21 p21Var = this.f31139b;
                        f21 f21Var2 = p21Var.J;
                        f21Var2.z1(false);
                        d21 d21Var2 = p21Var.f29342y;
                        d21Var2.z1(false);
                        p21Var.M.a(false, true);
                        org.telegram.messenger.i0.a4(f21Var2);
                        org.telegram.messenger.i0.a4(d21Var2);
                        return;
                    case 1:
                        this.f31139b.f29332g0.a(0, Boolean.FALSE);
                        return;
                    default:
                        p21.b(this.f31139b);
                        return;
                }
            }
        });
        this.H = j13;
        frameLayout2.addView(j12, w7.b6.e(44, 36, 51));
        viewGroup.addView(j13, w7.b6.e(64, 48, 51));
        ImageView j14 = j(activity, 2131232356, new View.OnClickListener(this) {
            public final p21 f31139b;

            {
                this.f31139b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        p21 p21Var = this.f31139b;
                        f21 f21Var2 = p21Var.J;
                        f21Var2.z1(false);
                        d21 d21Var2 = p21Var.f29342y;
                        d21Var2.z1(false);
                        p21Var.M.a(false, true);
                        org.telegram.messenger.i0.a4(f21Var2);
                        org.telegram.messenger.i0.a4(d21Var2);
                        return;
                    case 1:
                        this.f31139b.f29332g0.a(0, Boolean.FALSE);
                        return;
                    default:
                        p21.b(this.f31139b);
                        return;
                }
            }
        });
        this.E = j14;
        ImageView j15 = j(activity, 2131232356, new View.OnClickListener(this) {
            public final p21 f31139b;

            {
                this.f31139b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        p21 p21Var = this.f31139b;
                        f21 f21Var2 = p21Var.J;
                        f21Var2.z1(false);
                        d21 d21Var2 = p21Var.f29342y;
                        d21Var2.z1(false);
                        p21Var.M.a(false, true);
                        org.telegram.messenger.i0.a4(f21Var2);
                        org.telegram.messenger.i0.a4(d21Var2);
                        return;
                    case 1:
                        this.f31139b.f29332g0.a(0, Boolean.FALSE);
                        return;
                    default:
                        p21.b(this.f31139b);
                        return;
                }
            }
        });
        this.F = j15;
        frameLayout2.addView(j14, w7.b6.e(44, 36, 51));
        viewGroup.addView(j15, w7.b6.e(64, 48, 51));
        org.telegram.messenger.wp.r1(i10).f19234r7.n(3, j11, false);
        SharedPreferences sharedPreferences = org.telegram.messenger.wp.r1(i10).f7;
        if (z10 && org.telegram.messenger.m5.w("topicssidetabs", j10, sharedPreferences, false)) {
            this.U = 1.0f;
            z11 = true;
            this.T = true;
        } else {
            z11 = true;
        }
        if (z10 && org.telegram.messenger.m5.w("topicssidetabsb", j10, sharedPreferences, false)) {
            z12 = z11;
        } else {
            z12 = false;
        }
        this.S = z12;
        if (z12) {
            i11 = 2131231885;
        } else {
            i11 = 2131231882;
        }
        j13.setImageResource(i11);
        r(false);
        if (!this.S) {
            i12 = 2131231883;
        } else {
            i12 = 2131231885;
        }
        j12.setImageResource(i12);
        g(false);
        h();
        p();
        q();
    }

    public static void a(p21 p21Var, b51 b51Var) {
        if (p21Var.f29337n) {
            org.telegram.messenger.k20 k20Var = p21Var.f29334i0;
            if (k20Var != null) {
                k20Var.a(Long.valueOf(b51Var.B), Boolean.FALSE);
            }
        } else if (b51Var.B == -2) {
            Runnable runnable = p21Var.f29333h0;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            org.telegram.messenger.k20 k20Var2 = p21Var.f29332g0;
            if (k20Var2 != null) {
                k20Var2.a(Integer.valueOf(b51Var.d), Boolean.FALSE);
            }
        }
    }

    public static void b(p21 p21Var) {
        boolean z10 = p21Var.T;
        boolean z11 = true;
        if (!z10 && p21Var.S && p21Var.f29327c0 == null && !p21Var.V) {
            if (p21Var.d) {
                return;
            }
            p21Var.d = true;
            p21Var.r(true);
        } else if ((r2 = p21Var.f29327c0) != null) {
            z11 = false;
            p21Var.d(z11);
        } else {
            z11 = false;
            p21Var.d(z11);
        }
    }

    public static void c(p21 p21Var, ArrayList arrayList) {
        long j10 = p21Var.f29330f;
        org.telegram.messenger.y00 y00Var = org.telegram.messenger.wp.r1(p21Var.e).f19234r7;
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            i10 = c3.i0.j(((b51) arrayList.get(i10)).d, i10, 1, arrayList2);
        }
        long j11 = -j10;
        y00Var.w(arrayList2, j11);
        y00Var.y(j11, false);
    }

    public static ImageView j(Context context, int i10, View.OnClickListener onClickListener) {
        ImageView e = org.telegram.messenger.a30.e(context, i10);
        e.setScaleType(ImageView.ScaleType.CENTER);
        e.setOnClickListener(onClickListener);
        w7.e6.a(e);
        return e;
    }

    private void setAttached(boolean z10) {
        if (this.f29331f0 == z10) {
            return;
        }
        this.f29331f0 = z10;
        int i10 = 0;
        int i11 = org.telegram.messenger.at.f14772r;
        int i12 = org.telegram.messenger.at.f14771q5;
        long j10 = this.f29330f;
        int i13 = this.e;
        if (z10) {
            org.telegram.messenger.at.f(i13).c(this, i12);
            org.telegram.messenger.at.f(i13).c(this, i11);
            org.telegram.messenger.y00 y00Var = org.telegram.messenger.wp.r1(i13).f19234r7;
            long j11 = -j10;
            LongSparseIntArray longSparseIntArray = y00Var.f19514f;
            longSparseIntArray.put(j11, longSparseIntArray.get(j11, 0) + 1);
            y00Var.y(j11, true);
            return;
        }
        long j12 = -j10;
        LongSparseIntArray longSparseIntArray2 = org.telegram.messenger.wp.r1(i13).f19234r7.f19514f;
        int i14 = longSparseIntArray2.get(j12, 0) - 1;
        if (i14 >= 0) {
            i10 = i14;
        }
        longSparseIntArray2.put(j12, i10);
        org.telegram.messenger.at.f(i13).n(this, i12);
        org.telegram.messenger.at.f(i13).n(this, i11);
    }

    @Override
    public final void E(float f7, int i10) {
        if (i10 == 1 && f7 == 1.0f && this.d) {
            this.d = false;
            this.S = false;
            this.G.setImageResource(2131231883);
            this.H.setImageResource(2131231882);
            SharedPreferences.Editor edit = org.telegram.messenger.wp.r1(this.e).f7.edit();
            edit.putBoolean("topicssidetabsb" + this.f29330f, false).apply();
            r(true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21331z6));
    }

    public final void d(boolean z10) {
        float f7;
        if (this.T == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.f29328d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (this.V) {
                this.f29327c0 = Boolean.valueOf(z10);
                return;
            }
        }
        if (!z10) {
            this.S = !this.S;
        }
        this.T = z10;
        this.V = true;
        float f10 = this.U;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f29328d0 = ofFloat;
        ofFloat.addUpdateListener(new r60(this, 28));
        this.f29328d0.addListener(new ha0(7, this, z10));
        this.f29328d0.setInterpolator(ci.o.V);
        this.f29328d0.setDuration(250L);
        this.f29328d0.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = org.telegram.messenger.at.f14771q5;
        long j10 = this.f29330f;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() == (-j10)) {
                q();
            }
        } else if (i10 == org.telegram.messenger.at.f14772r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i13 = org.telegram.messenger.wp.D8;
            if ((intValue & 512) > 0) {
                org.telegram.messenger.wp.r1(this.e).f19234r7.y(-j10, false);
                q();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        FrameLayout frameLayout = this.I;
        if (frameLayout.getVisibility() == 0) {
            this.N.setBounds((int) frameLayout.getTranslationX(), (int) this.Q, (int) (frameLayout.getTranslationX() + org.telegram.messenger.i0.L(78.0f)), (int) (getMeasuredHeight() - this.P));
            this.N.draw(canvas);
        }
        FrameLayout frameLayout2 = this.f29341x;
        if (frameLayout2.getVisibility() == 0) {
            this.O.setAlpha((int) (frameLayout2.getAlpha() * 255.0f));
            this.O.setBounds(0, (int) frameLayout2.getTranslationY(), getMeasuredWidth(), (int) (frameLayout2.getTranslationY() + org.telegram.messenger.i0.L(50.0f)));
            this.O.draw(canvas);
        }
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        canvas.save();
        if (view == this.I) {
            canvas.clipPath(this.N.P.f50852k);
        }
        if (view == this.f29341x) {
            canvas.clipPath(this.O.P.f50852k);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        int i10 = org.telegram.ui.ActionBar.t6.f21331z6;
        org.telegram.ui.ActionBar.p6 p6Var = this.h;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var);
        int f7 = i0.b.f(1.0f - this.U, w02, w03);
        int f10 = i0.b.f(this.U, w02, w03);
        boolean z10 = this.W;
        this.W = true;
        ImageView imageView = this.G;
        if (imageView != null && (!z10 || f7 != this.f29323a0)) {
            imageView.setColorFilter(new PorterDuffColorFilter(f7, PorterDuff.Mode.SRC_IN));
        }
        this.f29323a0 = f7;
        ImageView imageView2 = this.H;
        if (imageView2 != null && (!z10 || f10 != this.f29325b0)) {
            imageView2.setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
        }
        this.f29325b0 = f10;
    }

    public final void f() {
        FrameLayout frameLayout = this.I;
        int paddingBottom = frameLayout.getPaddingBottom();
        int round = Math.round(this.P + this.Q);
        if (paddingBottom == round) {
            return;
        }
        frameLayout.setPadding(0, 0, 0, round);
    }

    public final void g(boolean z10) {
        boolean z11;
        ArrayList l4 = org.telegram.messenger.wp.r1(this.e).f19234r7.l(-this.f29330f);
        if (l4 != null && !l4.isEmpty() && !this.f29335j0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f29322a.a(z11, z10);
    }

    public l21 getCurrentTabsPosition() {
        if (this.T) {
            return l21.f28036b;
        }
        if (this.S) {
            return l21.f28037c;
        }
        return l21.f28035a;
    }

    public float getSideMenuT() {
        return this.U * this.f29322a.e;
    }

    public final void h() {
        int i10;
        int i11;
        int i12;
        fe.b bVar = this.M;
        float f7 = bVar.e;
        ImageView imageView = this.E;
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
        ImageView imageView2 = this.F;
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
        ImageView imageView3 = this.G;
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
        ImageView imageView4 = this.H;
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
        float T1 = org.telegram.messenger.i0.T1(1.0f, 0.0f, this.U);
        FrameLayout frameLayout = this.f29341x;
        frameLayout.setAlpha(T1);
        if ((1.0f - this.f29324b.e) * (1.0f - this.U) * this.f29322a.e > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        if (this.S) {
            frameLayout.setTranslationY(((getMeasuredHeight() - org.telegram.messenger.i0.L(50.0f)) - this.P) + org.telegram.messenger.i0.W1(k(l21.f28037c), org.telegram.messenger.i0.L(43.0f), 0));
            return;
        }
        frameLayout.setTranslationY(this.Q + org.telegram.messenger.i0.W1(k(l21.f28035a), -org.telegram.messenger.i0.L(43.0f), 0));
    }

    public final float k(l21 l21Var) {
        float f7 = (1.0f - this.f29324b.e) * this.f29322a.e;
        if (l21Var == l21.f28036b) {
            return this.U * f7;
        }
        if ((l21Var == l21.f28035a && !this.S) || (l21Var == l21.f28037c && this.S)) {
            return (1.0f - this.U) * f7;
        }
        return 0.0f;
    }

    public final boolean l() {
        if (this.U > 0.5f) {
            int i10 = 0;
            while (true) {
                f21 f21Var = this.J;
                if (i10 >= f21Var.getChildCount()) {
                    break;
                }
                b51 G = f21Var.f31183f3.G(RecyclerView.R(f21Var.getChildAt(i10)));
                if (G == null || !G.f24649r) {
                    i10++;
                } else {
                    return true;
                }
            }
        } else {
            int i11 = 0;
            while (true) {
                d21 d21Var = this.f29342y;
                if (i11 >= d21Var.getChildCount()) {
                    break;
                }
                b51 G2 = d21Var.f31183f3.G(RecyclerView.R(d21Var.getChildAt(i11)));
                if (G2 != null && G2.f24649r) {
                    return true;
                }
                i11++;
            }
        }
        return false;
    }

    public final void m() {
        org.telegram.messenger.y00 y00Var = org.telegram.messenger.wp.r1(this.e).f19234r7;
        long j10 = this.f29330f;
        if (!y00Var.e(-j10)) {
            y00Var.o(-j10);
        }
    }

    public final void n(long j10, boolean z10) {
        if (this.f29337n) {
            org.telegram.messenger.k20 k20Var = this.f29334i0;
            if (k20Var != null) {
                k20Var.a(Long.valueOf(j10), Boolean.valueOf(z10));
                return;
            }
            return;
        }
        org.telegram.messenger.k20 k20Var2 = this.f29332g0;
        if (k20Var2 != null) {
            k20Var2.a(Integer.valueOf((int) j10), Boolean.valueOf(z10));
        }
    }

    public final boolean o(final TLRPC.TL_forumTopic tL_forumTopic, View view, boolean z10) {
        TLRPC.Chat chat;
        TLRPC.User user;
        int i10;
        int i11;
        org.telegram.messenger.wp wpVar;
        final p21 p21Var;
        final TLRPC.TL_forumTopic tL_forumTopic2;
        int i12;
        int i13;
        int i14;
        final p21 p21Var2;
        boolean z11;
        int i15;
        int i16;
        int i17;
        z60 z60Var;
        int i18 = this.e;
        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i18);
        long j10 = this.f29330f;
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
        final org.telegram.ui.un unVar = this.f29339s;
        final z60 I = z60.I(unVar, view);
        if (org.telegram.messenger.w3.p0(chat)) {
            long o10 = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
            if (o10 == 0 || !org.telegram.messenger.w3.A(i18, chat, 24)) {
                return false;
            }
            TLRPC.Chat chat2 = chat;
            z60 z60Var2 = I;
            z60Var2.c(2131232091, org.telegram.messenger.dd.L0(2131752089, null), new ag.a3(this, z60Var2, o10, chat2, 5), false);
            long j11 = chat2.f19794id;
            if (org.telegram.messenger.w3.p0(chat2) && org.telegram.messenger.w3.A(i18, chat2, 24)) {
                long j12 = chat2.linked_monoforum_id;
                if (j12 != 0) {
                    j11 = j12;
                }
            }
            TLRPC.Chat L0 = org.telegram.messenger.wp.r1(i18).L0(Long.valueOf(j11));
            TLRPC.User Z1 = org.telegram.messenger.wp.r1(i18).Z1(Long.valueOf(o10));
            z60 z60Var3 = z60Var2;
            if (Z1 != null) {
                z60Var3 = z60Var2;
                if (org.telegram.messenger.w3.w(2, L0)) {
                    z60Var2.c(2131232327, org.telegram.messenger.dd.L0(2131753726, null), null, false);
                    org.telegram.ui.ActionBar.b1 y3 = z60Var2.y();
                    y3.setVisibility(8);
                    org.telegram.messenger.wp r13 = org.telegram.messenger.wp.r1(i18);
                    z11 z11Var = new z11(this, y3, z60Var2, j11, Z1, L0);
                    z60Var3 = z60Var2;
                    r13.K(true, L0, Z1, z11Var);
                }
            }
            p21Var2 = this;
            z60Var = z60Var3;
        } else {
            if (!org.telegram.messenger.w3.y(15, chat) && !org.telegram.messenger.i20.v(user)) {
                i12 = 15;
                tL_forumTopic2 = tL_forumTopic;
                wpVar = r12;
                p21Var = this;
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
                wpVar = r12;
                p21Var = this;
                tL_forumTopic2 = tL_forumTopic;
                I.c(i10, org.telegram.messenger.dd.L0(i11, null), new org.telegram.ui.fp((Object) this, (Object) I, (Object) wpVar, (Object) tL_forumTopic, 24), false);
                if (tL_forumTopic2.pinned && !z10) {
                    I.c(2131232770, org.telegram.messenger.dd.L0(2131750708, null), new y11(p21Var, 1), false);
                }
                i12 = 15;
            }
            if (org.telegram.messenger.w3.y(i12, chat) || org.telegram.messenger.i20.v(user)) {
                I.c(2131232491, org.telegram.messenger.dd.L0(2131751217, null), new Runnable(p21Var) {
                    public final p21 f24988b;

                    {
                        this.f24988b = p21Var;
                    }

                    @Override
                    public final void run() {
                        int i20;
                        int i21 = r4;
                        p21 p21Var3 = this.f24988b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic2;
                        z60 z60Var4 = I;
                        switch (i21) {
                            case 0:
                                z60Var4.u();
                                p21Var3.f29339s.presentFragment(ja1.f0(-p21Var3.f29330f, tL_forumTopic3.f19846id));
                                return;
                            case 1:
                                p21Var3.getClass();
                                z60Var4.u();
                                org.telegram.messenger.wp.r1(p21Var3.e).f19234r7.z(tL_forumTopic3.f19846id, -p21Var3.f29330f, true ^ tL_forumTopic3.closed);
                                return;
                            default:
                                z60Var4.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.f19846id));
                                org.telegram.messenger.sz szVar = new org.telegram.messenger.sz(28);
                                p21 p21Var4 = this.f24988b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p21Var4.getContext());
                                String J0 = org.telegram.messenger.dd.J0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                                x1Var.R = J0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j13 = p21Var4.f29329e0;
                                if (hashSet.size() == 1) {
                                    i20 = 0;
                                    x1Var.T = org.telegram.messenger.dd.a0(null, null, 2131751499, org.telegram.messenger.wp.r1(p21Var4.e).f19234r7.f(-p21Var4.f29330f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    i20 = 0;
                                    x1Var.T = org.telegram.messenger.dd.L0(2131751498, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new org.telegram.ui.lh(p21Var4, arrayList, j13, hashSet, szVar));
                                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), new a21(i20));
                                x1Var.show();
                                TextView textView = (TextView) x1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            }
            final long j13 = tL_forumTopic2.f19846id;
            final int currentAccount = unVar.getCurrentAccount();
            final org.telegram.ui.ActionBar.p6 resourceProvider = unVar.getResourceProvider();
            final long j14 = p21Var.f29330f;
            yn ynVar = new yn(I, currentAccount, j14, j13, unVar, resourceProvider);
            final z60 J = I.J();
            J.c(2131232056, org.telegram.messenger.dd.L0(2131753756, null), new org.telegram.ui.qr0(I, 27), false);
            J.c(2131232402, org.telegram.messenger.dd.L0(2131745293, null), new Runnable() {
                @Override
                public final void run() {
                    z60.this.u();
                    SharedPreferences sharedPreferences = org.telegram.messenger.wp.r1(currentAccount).e7;
                    StringBuilder sb2 = new StringBuilder("sound_enabled_");
                    long j15 = j14;
                    long j16 = j13;
                    sb2.append(org.telegram.messenger.pt.v(j15, j16, false));
                    boolean z13 = sharedPreferences.getBoolean(sb2.toString(), true);
                    boolean z14 = !z13 ? 1 : 0;
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putBoolean("sound_enabled_" + org.telegram.messenger.pt.v(j15, j16, false), z14).apply();
                    J.u();
                    org.telegram.ui.ActionBar.k2 k2Var = unVar;
                    if (cc.a(k2Var)) {
                        cc.S(z13 ? 1 : 0, k2Var, resourceProvider).j();
                    }
                }
            }, false);
            final org.telegram.ui.ActionBar.b1 y10 = J.y();
            J.c(2131232257, org.telegram.messenger.dd.L0(2131748323, null), new ag.g3(I, resourceProvider, currentAccount, ynVar, 16), false);
            J.c(2131232105, org.telegram.messenger.dd.L0(2131747933, null), new mg.n0(I, j14, j13, unVar, resourceProvider), false);
            J.c(0, "", new org.telegram.messenger.nn(I, currentAccount, j14, j13, unVar, resourceProvider), false);
            final org.telegram.ui.ActionBar.b1 y11 = J.y();
            new Runnable() {
                @Override
                public final void run() {
                    int i20;
                    int i21 = currentAccount;
                    org.telegram.messenger.wp r14 = org.telegram.messenger.wp.r1(i21);
                    long j15 = j14;
                    long j16 = j13;
                    boolean q22 = r14.q2(j15, j16, null);
                    org.telegram.ui.ActionBar.b1 b1Var = y11;
                    org.telegram.ui.ActionBar.b1 b1Var2 = y10;
                    if (q22) {
                        b1Var.j(org.telegram.messenger.dd.L0(2131743873, null), 2131232411, null);
                        i20 = org.telegram.ui.ActionBar.t6.f21296x6;
                        b1Var2.setVisibility(8);
                    } else {
                        b1Var.j(org.telegram.messenger.dd.L0(2131748321, null), 2131232255, null);
                        int i22 = org.telegram.ui.ActionBar.t6.f21171q7;
                        b1Var2.setVisibility(0);
                        if (org.telegram.messenger.wp.r1(i21).r2(j15, j16)) {
                            b1Var2.j(org.telegram.messenger.dd.L0(2131745295, null), 2131232401, null);
                        } else {
                            b1Var2.j(org.telegram.messenger.dd.L0(2131745293, null), 2131232402, null);
                        }
                        i20 = i22;
                    }
                    go.c(b1Var, i20);
                }
            }.run();
            long j15 = p21Var.f29330f;
            org.telegram.messenger.wp wpVar2 = wpVar;
            boolean q22 = wpVar2.q2(j15, tL_forumTopic2.f19846id, null);
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
            p21Var2 = this;
            final z60 z60Var4 = I;
            z60Var4.c(i20, org.telegram.messenger.dd.L0(i14, null), new ag.e3(p21Var2, wpVar2, tL_forumTopic, I, J, 22), false);
            if (org.telegram.messenger.w3.i(i18, chat3, tL_forumTopic) && !org.telegram.messenger.i20.u(user)) {
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
                z60Var4.c(i16, org.telegram.messenger.dd.L0(i17, null), new Runnable(p21Var2) {
                    public final p21 f24988b;

                    {
                        this.f24988b = p21Var2;
                    }

                    @Override
                    public final void run() {
                        int i202;
                        int i21 = r4;
                        p21 p21Var3 = this.f24988b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                        z60 z60Var42 = z60Var4;
                        switch (i21) {
                            case 0:
                                z60Var42.u();
                                p21Var3.f29339s.presentFragment(ja1.f0(-p21Var3.f29330f, tL_forumTopic3.f19846id));
                                return;
                            case 1:
                                p21Var3.getClass();
                                z60Var42.u();
                                org.telegram.messenger.wp.r1(p21Var3.e).f19234r7.z(tL_forumTopic3.f19846id, -p21Var3.f29330f, true ^ tL_forumTopic3.closed);
                                return;
                            default:
                                z60Var42.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.f19846id));
                                org.telegram.messenger.sz szVar = new org.telegram.messenger.sz(28);
                                p21 p21Var4 = this.f24988b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p21Var4.getContext());
                                String J0 = org.telegram.messenger.dd.J0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                                x1Var.R = J0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = p21Var4.f29329e0;
                                if (hashSet.size() == 1) {
                                    i202 = 0;
                                    x1Var.T = org.telegram.messenger.dd.a0(null, null, 2131751499, org.telegram.messenger.wp.r1(p21Var4.e).f19234r7.f(-p21Var4.f29330f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    i202 = 0;
                                    x1Var.T = org.telegram.messenger.dd.L0(2131751498, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new org.telegram.ui.lh(p21Var4, arrayList, j132, hashSet, szVar));
                                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), new a21(i202));
                                x1Var.show();
                                TextView textView = (TextView) x1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, null);
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
                z60Var4.c(2131232107, org.telegram.messenger.dd.J0(i15, "DeleteTopics"), new Runnable(p21Var2) {
                    public final p21 f24988b;

                    {
                        this.f24988b = p21Var2;
                    }

                    @Override
                    public final void run() {
                        int i202;
                        int i21 = r4;
                        p21 p21Var3 = this.f24988b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                        z60 z60Var42 = z60Var4;
                        switch (i21) {
                            case 0:
                                z60Var42.u();
                                p21Var3.f29339s.presentFragment(ja1.f0(-p21Var3.f29330f, tL_forumTopic3.f19846id));
                                return;
                            case 1:
                                p21Var3.getClass();
                                z60Var42.u();
                                org.telegram.messenger.wp.r1(p21Var3.e).f19234r7.z(tL_forumTopic3.f19846id, -p21Var3.f29330f, true ^ tL_forumTopic3.closed);
                                return;
                            default:
                                z60Var42.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.f19846id));
                                org.telegram.messenger.sz szVar = new org.telegram.messenger.sz(28);
                                p21 p21Var4 = this.f24988b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p21Var4.getContext());
                                String J0 = org.telegram.messenger.dd.J0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                                x1Var.R = J0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j132 = p21Var4.f29329e0;
                                if (hashSet.size() == 1) {
                                    i202 = 0;
                                    x1Var.T = org.telegram.messenger.dd.a0(null, null, 2131751499, org.telegram.messenger.wp.r1(p21Var4.e).f19234r7.f(-p21Var4.f29330f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    i202 = 0;
                                    x1Var.T = org.telegram.messenger.dd.L0(2131751498, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new org.telegram.ui.lh(p21Var4, arrayList, j132, hashSet, szVar));
                                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), new a21(i202));
                                x1Var.show();
                                TextView textView = (TextView) x1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, z11);
                z60Var = z60Var4;
            }
        }
        boolean z14 = view instanceof k21;
        org.telegram.ui.ActionBar.p6 p6Var = p21Var2.h;
        if (z14) {
            ?? drawable = new Drawable();
            Paint paint = new Paint(1);
            drawable.f26311a = paint;
            drawable.f26312b = new RectF();
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G8, p6Var));
            z60Var.W(drawable);
            z60Var.a0(org.telegram.messenger.i0.L(16.0f), 0.0f);
        } else if (z10) {
            z60Var.W(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(16.0f), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, p6Var)));
            z60Var.V(5);
        } else {
            int L = org.telegram.messenger.i0.L(5.0f);
            int L2 = org.telegram.messenger.i0.L(5.0f);
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, p6Var);
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
        org.telegram.ui.me meVar = this.R;
        if (meVar != null) {
            meVar.run();
        }
        i();
        float k10 = k(l21.f28036b);
        int i10 = 0;
        FrameLayout frameLayout = this.I;
        frameLayout.setTranslationX(org.telegram.messenger.i0.W1(k10, -org.telegram.messenger.i0.L(78.0f), 0));
        if (k10 <= 0.0f) {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        e();
        int i11 = org.telegram.ui.ActionBar.t6.Ci;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        ImageView imageView = this.E;
        org.telegram.ui.ActionBar.p6 p6Var = this.h;
        org.telegram.ui.ActionBar.a7.t(imageView, i11, p6Var, mode);
        org.telegram.ui.ActionBar.a7.t(this.F, i11, p6Var, mode);
        invalidate();
    }

    public final void q() {
        g(true);
        d21 d21Var = this.f29342y;
        boolean canScrollHorizontally = d21Var.canScrollHorizontally(-1);
        d21Var.f31183f3.O(true);
        if (!canScrollHorizontally) {
            d21Var.v0(0);
        }
        f21 f21Var = this.J;
        boolean canScrollVertically = f21Var.canScrollVertically(-1);
        f21Var.f31183f3.O(true);
        if (!canScrollVertically) {
            f21Var.v0(0);
        }
        org.telegram.messenger.i0.g3(new y11(this, 0));
    }

    public final void r(boolean z10) {
        boolean z11;
        if (this.f29326c && !this.d) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f29324b.a(z11, z10);
    }

    public void setAllTopicsHidden(boolean z10) {
        if (this.f29335j0 != z10) {
            this.f29335j0 = z10;
            g(true);
        }
    }

    public void setCurrentTopic(long j10) {
        boolean z10;
        this.f29329e0 = j10;
        d21 d21Var = this.f29342y;
        d21Var.f31183f3.O(true);
        d21Var.invalidate();
        this.J.f31183f3.O(true);
        o21 o21Var = this.D;
        if (o21Var != null) {
            if (j10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            o21Var.c(true, false, z10);
        }
    }

    public void setOnDialogSelected(org.telegram.messenger.k20 k20Var) {
        this.f29334i0 = k20Var;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.f29333h0 = runnable;
    }

    public void setOnTopicSelected(org.telegram.messenger.k20 k20Var) {
        this.f29332g0 = k20Var;
    }

    public void setSideMenuBackgroundDrawable(vg.f fVar) {
        this.N = fVar;
        fVar.q(org.telegram.messenger.i0.L(16.0f));
        this.N.p(org.telegram.messenger.i0.L(7.0f));
    }

    public void setSideMenuBackgroundMarginBottom(float f7) {
        this.P = f7;
        i();
        f();
        invalidate();
    }

    public void setSideMenuBackgroundMarginTop(float f7) {
        this.Q = f7;
        this.I.setTranslationY(f7);
        i();
        f();
        invalidate();
    }

    public void setTabsEnabled(boolean z10) {
        if (this.f29326c == z10) {
            return;
        }
        this.f29326c = z10;
        if (!z10) {
            d(false);
        }
        r(true);
    }

    public void setTopMenuBackgroundDrawable(vg.f fVar) {
        this.O = fVar;
        fVar.q(org.telegram.messenger.i0.L(18.0f));
        this.O.p(org.telegram.messenger.i0.L(7.0f));
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
