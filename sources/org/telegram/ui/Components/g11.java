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
import org.telegram.ui.u81;
public final class g11 extends FrameLayout implements org.telegram.messenger.ls, te.b, org.telegram.ui.ActionBar.a6 {
    public static final int f33778l0 = 0;
    public final f11 D;
    public final ImageView E;
    public final ImageView F;
    public final ImageView G;
    public final ImageView H;
    public final FrameLayout I;
    public final w01 J;
    public long K;
    public long L;
    public final te.a M;
    public fh.g N;
    public fh.g O;
    public float P;
    public float Q;
    public org.telegram.ui.ae R;
    public boolean S;
    public boolean T;
    public float U;
    public boolean V;
    public boolean W;
    public final te.a f33779a;
    public int f33780a0;
    public final te.a f33781b;
    public int f33782b0;
    public boolean f33783c;
    public Boolean f33784c0;
    public boolean d;
    public ValueAnimator f33785d0;
    public final int f33786e;
    public long f33787e0;
    public final long f33788f;
    public boolean f33789f0;
    public org.telegram.messenger.v10 f33790g0;
    public final org.telegram.ui.ActionBar.f6 h;
    public Runnable f33791h0;
    public org.telegram.messenger.v10 f33792i0;
    public boolean f33793j0;
    public final HashSet f33794k0;
    public final boolean f33795n;
    public final boolean f33796r;
    public final org.telegram.ui.an f33797s;
    public final boolean f33798w;
    public final FrameLayout f33799x;
    public final u01 f33800y;

    public g11(Activity activity, org.telegram.ui.an anVar, int i7, long j3, boolean z9, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        FrameLayout frameLayout;
        float f10;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        boolean z12;
        xq xqVar = xq.h;
        this.f33779a = new te.a(0, this, xqVar, 380L, true);
        this.f33781b = new te.a(1, this, xqVar, 380L, false);
        this.M = new te.a(0, new q01(this), xqVar, 320L, false);
        this.U = 0.0f;
        this.f33794k0 = new HashSet();
        this.f33797s = anVar;
        this.f33783c = z9;
        this.f33786e = i7;
        this.f33788f = j3;
        this.h = f6Var;
        long j10 = -j3;
        this.f33795n = org.telegram.messenger.t3.p0(org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(j10)));
        boolean v = org.telegram.messenger.t10.v(org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(j3)));
        this.f33796r = v;
        this.f33798w = !org.telegram.messenger.k5.w("topics_end_reached_", j10, org.telegram.messenger.p10.i(i7).k(), false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        ?? frameLayout2 = new FrameLayout(activity);
        this.f33799x = frameLayout2;
        addView(frameLayout2, c8.ha.d(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.I = frameLayout3;
        addView(frameLayout3, c8.ha.d(64, -1.0f, 115, 7.0f, 7.0f, 7.0f, 7.0f));
        u01 u01Var = new u01(this, activity, i7, new org.telegram.messenger.v10(this) {
            public final g11 f36841b;

            {
                this.f36841b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                boolean z13;
                boolean z14;
                int i12;
                long j11;
                org.telegram.messenger.k00 k00Var;
                long j12;
                boolean z15;
                ArrayList arrayList;
                boolean z16;
                boolean z17;
                long j13;
                long j14;
                boolean z18;
                boolean z19;
                int i13 = r2;
                g11 g11Var = this.f36841b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        f41 f41Var = (f41) obj2;
                        boolean z20 = g11Var.f33796r;
                        int i14 = g11Var.f33786e;
                        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i14);
                        long j15 = g11Var.f33788f;
                        long j16 = -j15;
                        TLRPC.Chat M0 = s12.M0(Long.valueOf(j16));
                        TLRPC.User a22 = org.telegram.messenger.qp.s1(i14).a2(Long.valueOf(j15));
                        org.telegram.messenger.k00 k00Var2 = org.telegram.messenger.qp.s1(i14).f24862q7;
                        ArrayList l10 = k00Var2.l(j16);
                        boolean z21 = g11Var.f33795n;
                        int i15 = a11.f31649b;
                        r31 K = r31.K(a11.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.f37603q = z21;
                        if (g11Var.f33787e0 == 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        K.L(z13);
                        arrayList2.add(K);
                        if (l10 != null) {
                            int size = l10.size();
                            int i16 = 0;
                            z14 = false;
                            while (i16 < size) {
                                Object obj3 = l10.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                int i18 = size;
                                if (z20) {
                                    i12 = i17;
                                    if (tL_forumTopic.f27004id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (g11Var.f33794k0.contains(Integer.valueOf(tL_forumTopic.f27004id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z22 = tL_forumTopic.pinned;
                                    if (!z22 && z14) {
                                        if (!arrayList2.isEmpty()) {
                                            ((r31) jg.g.i(1, arrayList2)).f37610y |= 8;
                                        }
                                        f41Var.L();
                                        z14 = false;
                                    } else if (z22 && !z14) {
                                        f41Var.M();
                                        z14 = true;
                                    }
                                    r31 K2 = r31.K(a11.class);
                                    K2.f37609x = j15;
                                    K2.d = tL_forumTopic.f27004id;
                                    K2.G = tL_forumTopic;
                                    if (z21) {
                                        j11 = j15;
                                        K2.B = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j11 = j15;
                                    }
                                    long j17 = g11Var.f33787e0;
                                    if (z21) {
                                        k00Var = k00Var2;
                                        j12 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                    } else {
                                        k00Var = k00Var2;
                                        j12 = tL_forumTopic.f27004id;
                                    }
                                    if (j17 == j12) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    K2.L(z15);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i12;
                                    k00Var2 = k00Var;
                                    j15 = j11;
                                }
                            }
                        } else {
                            z14 = false;
                        }
                        org.telegram.messenger.k00 k00Var3 = k00Var2;
                        if (z14) {
                            f41Var.L();
                        }
                        if (l10 != null && !l10.isEmpty() && !k00Var3.e(j16) && g11Var.f33798w) {
                            r31 K3 = r31.K(a11.class);
                            K3.d = -2;
                            K3.f37604r = true;
                            arrayList2.add(K3);
                            r31 K4 = r31.K(a11.class);
                            K4.d = -3;
                            K4.f37604r = true;
                            arrayList2.add(K4);
                            r31 K5 = r31.K(a11.class);
                            K5.d = -4;
                            K5.f37604r = true;
                            arrayList2.add(K5);
                        }
                        if (!z20 && !z21) {
                            if ((M0 != null && org.telegram.messenger.t3.w(15, M0)) || org.telegram.messenger.t10.v(a22)) {
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
                        boolean z23 = g11Var.f33795n;
                        int i19 = g11Var.f33786e;
                        org.telegram.messenger.qp s13 = org.telegram.messenger.qp.s1(i19);
                        long j18 = g11Var.f33788f;
                        long j19 = -j18;
                        TLRPC.Chat M02 = s13.M0(Long.valueOf(j19));
                        TLRPC.User a23 = org.telegram.messenger.qp.s1(i19).a2(Long.valueOf(j18));
                        org.telegram.messenger.k00 k00Var4 = org.telegram.messenger.qp.s1(i19).f24862q7;
                        ArrayList l11 = k00Var4.l(j19);
                        boolean z24 = g11Var.f33796r;
                        if (!z24) {
                            int i20 = e11.f33095b;
                            r31 K7 = r31.K(e11.class);
                            K7.d = 0;
                            arrayList = l11;
                            K7.B = 0L;
                            K7.G = null;
                            K7.f37603q = z23;
                            K7.f37610y = z24 ? 1 : 0;
                            if (g11Var.f33787e0 == 0) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            K7.L(z19);
                            arrayList3.add(K7);
                        } else {
                            arrayList = l11;
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            boolean z25 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                int i22 = size2;
                                Object obj4 = arrayList.get(i21);
                                i21++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = a23;
                                if (z24) {
                                    z17 = z25;
                                    if (tL_forumTopic2.f27004id == 1) {
                                        size2 = i22;
                                        a23 = user;
                                        z25 = z17;
                                    }
                                } else {
                                    z17 = z25;
                                }
                                if (g11Var.f33794k0.contains(Integer.valueOf(tL_forumTopic2.f27004id))) {
                                    size2 = i22;
                                    a23 = user;
                                    z25 = z17;
                                } else {
                                    boolean z26 = tL_forumTopic2.pinned;
                                    if (!z26 && z17) {
                                        f41Var2.L();
                                        z25 = false;
                                    } else if (z26 && !z17) {
                                        f41Var2.M();
                                        z25 = true;
                                    } else {
                                        z25 = z17;
                                    }
                                    int i23 = e11.f33095b;
                                    r31 K8 = r31.K(e11.class);
                                    K8.f37609x = j18;
                                    long j20 = j18;
                                    K8.d = tL_forumTopic2.f27004id;
                                    K8.G = tL_forumTopic2;
                                    if (z23) {
                                        K8.B = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j21 = g11Var.f33787e0;
                                    if (z23) {
                                        j13 = j21;
                                        j14 = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j13 = j21;
                                        j14 = tL_forumTopic2.f27004id;
                                    }
                                    if (j13 == j14) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    K8.L(z18);
                                    arrayList3.add(K8);
                                    size2 = i22;
                                    a23 = user;
                                    j18 = j20;
                                }
                            }
                            z16 = z25;
                        } else {
                            z16 = false;
                        }
                        TLRPC.User user2 = a23;
                        if (z16) {
                            f41Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !k00Var4.e(j19) && g11Var.f33798w) {
                            int i24 = e11.f33095b;
                            r31 K9 = r31.K(e11.class);
                            K9.d = -2;
                            K9.f37604r = true;
                            K9.f37592e = false;
                            arrayList3.add(K9);
                            r31 K10 = r31.K(e11.class);
                            K10.d = -3;
                            K10.f37604r = true;
                            K10.f37592e = false;
                            arrayList3.add(K10);
                            r31 K11 = r31.K(e11.class);
                            K11.d = -4;
                            K11.f37604r = true;
                            K11.f37592e = false;
                            arrayList3.add(K11);
                        }
                        if (!z24 && !z23) {
                            if ((M02 != null && org.telegram.messenger.t3.w(15, M02)) || org.telegram.messenger.t10.v(user2)) {
                                int i25 = e11.f33095b;
                                r31 K12 = r31.K(e11.class);
                                K12.d = -2;
                                K12.B = -2L;
                                K12.G = null;
                                K12.f37603q = false;
                                arrayList3.add(K12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new q01(this), new q01(this), f6Var);
        this.f33800y = u01Var;
        u01Var.E1(new org.telegram.messenger.v10(this) {
            public final g11 f36841b;

            {
                this.f36841b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                boolean z13;
                boolean z14;
                int i12;
                long j11;
                org.telegram.messenger.k00 k00Var;
                long j12;
                boolean z15;
                ArrayList arrayList;
                boolean z16;
                boolean z17;
                long j13;
                long j14;
                boolean z18;
                boolean z19;
                int i13 = r2;
                g11 g11Var = this.f36841b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        f41 f41Var = (f41) obj2;
                        boolean z20 = g11Var.f33796r;
                        int i14 = g11Var.f33786e;
                        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i14);
                        long j15 = g11Var.f33788f;
                        long j16 = -j15;
                        TLRPC.Chat M0 = s12.M0(Long.valueOf(j16));
                        TLRPC.User a22 = org.telegram.messenger.qp.s1(i14).a2(Long.valueOf(j15));
                        org.telegram.messenger.k00 k00Var2 = org.telegram.messenger.qp.s1(i14).f24862q7;
                        ArrayList l10 = k00Var2.l(j16);
                        boolean z21 = g11Var.f33795n;
                        int i15 = a11.f31649b;
                        r31 K = r31.K(a11.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.f37603q = z21;
                        if (g11Var.f33787e0 == 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        K.L(z13);
                        arrayList2.add(K);
                        if (l10 != null) {
                            int size = l10.size();
                            int i16 = 0;
                            z14 = false;
                            while (i16 < size) {
                                Object obj3 = l10.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                int i18 = size;
                                if (z20) {
                                    i12 = i17;
                                    if (tL_forumTopic.f27004id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (g11Var.f33794k0.contains(Integer.valueOf(tL_forumTopic.f27004id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z22 = tL_forumTopic.pinned;
                                    if (!z22 && z14) {
                                        if (!arrayList2.isEmpty()) {
                                            ((r31) jg.g.i(1, arrayList2)).f37610y |= 8;
                                        }
                                        f41Var.L();
                                        z14 = false;
                                    } else if (z22 && !z14) {
                                        f41Var.M();
                                        z14 = true;
                                    }
                                    r31 K2 = r31.K(a11.class);
                                    K2.f37609x = j15;
                                    K2.d = tL_forumTopic.f27004id;
                                    K2.G = tL_forumTopic;
                                    if (z21) {
                                        j11 = j15;
                                        K2.B = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j11 = j15;
                                    }
                                    long j17 = g11Var.f33787e0;
                                    if (z21) {
                                        k00Var = k00Var2;
                                        j12 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                    } else {
                                        k00Var = k00Var2;
                                        j12 = tL_forumTopic.f27004id;
                                    }
                                    if (j17 == j12) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    K2.L(z15);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i12;
                                    k00Var2 = k00Var;
                                    j15 = j11;
                                }
                            }
                        } else {
                            z14 = false;
                        }
                        org.telegram.messenger.k00 k00Var3 = k00Var2;
                        if (z14) {
                            f41Var.L();
                        }
                        if (l10 != null && !l10.isEmpty() && !k00Var3.e(j16) && g11Var.f33798w) {
                            r31 K3 = r31.K(a11.class);
                            K3.d = -2;
                            K3.f37604r = true;
                            arrayList2.add(K3);
                            r31 K4 = r31.K(a11.class);
                            K4.d = -3;
                            K4.f37604r = true;
                            arrayList2.add(K4);
                            r31 K5 = r31.K(a11.class);
                            K5.d = -4;
                            K5.f37604r = true;
                            arrayList2.add(K5);
                        }
                        if (!z20 && !z21) {
                            if ((M0 != null && org.telegram.messenger.t3.w(15, M0)) || org.telegram.messenger.t10.v(a22)) {
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
                        boolean z23 = g11Var.f33795n;
                        int i19 = g11Var.f33786e;
                        org.telegram.messenger.qp s13 = org.telegram.messenger.qp.s1(i19);
                        long j18 = g11Var.f33788f;
                        long j19 = -j18;
                        TLRPC.Chat M02 = s13.M0(Long.valueOf(j19));
                        TLRPC.User a23 = org.telegram.messenger.qp.s1(i19).a2(Long.valueOf(j18));
                        org.telegram.messenger.k00 k00Var4 = org.telegram.messenger.qp.s1(i19).f24862q7;
                        ArrayList l11 = k00Var4.l(j19);
                        boolean z24 = g11Var.f33796r;
                        if (!z24) {
                            int i20 = e11.f33095b;
                            r31 K7 = r31.K(e11.class);
                            K7.d = 0;
                            arrayList = l11;
                            K7.B = 0L;
                            K7.G = null;
                            K7.f37603q = z23;
                            K7.f37610y = z24 ? 1 : 0;
                            if (g11Var.f33787e0 == 0) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            K7.L(z19);
                            arrayList3.add(K7);
                        } else {
                            arrayList = l11;
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            boolean z25 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                int i22 = size2;
                                Object obj4 = arrayList.get(i21);
                                i21++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = a23;
                                if (z24) {
                                    z17 = z25;
                                    if (tL_forumTopic2.f27004id == 1) {
                                        size2 = i22;
                                        a23 = user;
                                        z25 = z17;
                                    }
                                } else {
                                    z17 = z25;
                                }
                                if (g11Var.f33794k0.contains(Integer.valueOf(tL_forumTopic2.f27004id))) {
                                    size2 = i22;
                                    a23 = user;
                                    z25 = z17;
                                } else {
                                    boolean z26 = tL_forumTopic2.pinned;
                                    if (!z26 && z17) {
                                        f41Var2.L();
                                        z25 = false;
                                    } else if (z26 && !z17) {
                                        f41Var2.M();
                                        z25 = true;
                                    } else {
                                        z25 = z17;
                                    }
                                    int i23 = e11.f33095b;
                                    r31 K8 = r31.K(e11.class);
                                    K8.f37609x = j18;
                                    long j20 = j18;
                                    K8.d = tL_forumTopic2.f27004id;
                                    K8.G = tL_forumTopic2;
                                    if (z23) {
                                        K8.B = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j21 = g11Var.f33787e0;
                                    if (z23) {
                                        j13 = j21;
                                        j14 = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j13 = j21;
                                        j14 = tL_forumTopic2.f27004id;
                                    }
                                    if (j13 == j14) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    K8.L(z18);
                                    arrayList3.add(K8);
                                    size2 = i22;
                                    a23 = user;
                                    j18 = j20;
                                }
                            }
                            z16 = z25;
                        } else {
                            z16 = false;
                        }
                        TLRPC.User user2 = a23;
                        if (z16) {
                            f41Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !k00Var4.e(j19) && g11Var.f33798w) {
                            int i24 = e11.f33095b;
                            r31 K9 = r31.K(e11.class);
                            K9.d = -2;
                            K9.f37604r = true;
                            K9.f37592e = false;
                            arrayList3.add(K9);
                            r31 K10 = r31.K(e11.class);
                            K10.d = -3;
                            K10.f37604r = true;
                            K10.f37592e = false;
                            arrayList3.add(K10);
                            r31 K11 = r31.K(e11.class);
                            K11.d = -4;
                            K11.f37604r = true;
                            K11.f37592e = false;
                            arrayList3.add(K11);
                        }
                        if (!z24 && !z23) {
                            if ((M02 != null && org.telegram.messenger.t3.w(15, M02)) || org.telegram.messenger.t10.v(user2)) {
                                int i25 = e11.f33095b;
                                r31 K12 = r31.K(e11.class);
                                K12.d = -2;
                                K12.B = -2L;
                                K12.G = null;
                                K12.f37603q = false;
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
        u01Var.f35167f3.f33473r = false;
        u01Var.getContext();
        jg.i0 i0Var = new jg.i0((ViewGroup) u01Var, 7);
        u01Var.f35166e3 = i0Var;
        u01Var.setLayoutManager(i0Var);
        frameLayout2.addView(u01Var, c8.ha.d(-1, -1.0f, 119, 41.0f, 0.0f, 0.0f, 0.0f));
        u01Var.j(new v01(this, 0));
        if (v) {
            f11 f11Var = new f11(i7, activity, f6Var);
            this.D = f11Var;
            if (this.f33787e0 == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            f11Var.c(true, false, z12);
            f11Var.setOnClickListener(new View.OnClickListener(this) {
                public final g11 f36558b;

                {
                    this.f36558b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            g11 g11Var = this.f36558b;
                            w01 w01Var = g11Var.J;
                            w01Var.z1(false);
                            u01 u01Var2 = g11Var.f33800y;
                            u01Var2.z1(false);
                            g11Var.M.a(false, true);
                            org.telegram.messenger.g0.b4(w01Var);
                            org.telegram.messenger.g0.b4(u01Var2);
                            return;
                        case 1:
                            this.f36558b.f33790g0.a(0, Boolean.FALSE);
                            return;
                        default:
                            g11.b(this.f36558b);
                            return;
                    }
                }
            });
            frameLayout = frameLayout3;
            frameLayout.addView(f11Var, c8.ha.d(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            frameLayout = frameLayout3;
            this.D = null;
        }
        ViewGroup viewGroup = frameLayout;
        w01 w01Var = new w01(activity, i7, new org.telegram.messenger.v10(this) {
            public final g11 f36841b;

            {
                this.f36841b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                boolean z13;
                boolean z14;
                int i12;
                long j11;
                org.telegram.messenger.k00 k00Var;
                long j12;
                boolean z15;
                ArrayList arrayList;
                boolean z16;
                boolean z17;
                long j13;
                long j14;
                boolean z18;
                boolean z19;
                int i13 = r2;
                g11 g11Var = this.f36841b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        f41 f41Var = (f41) obj2;
                        boolean z20 = g11Var.f33796r;
                        int i14 = g11Var.f33786e;
                        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i14);
                        long j15 = g11Var.f33788f;
                        long j16 = -j15;
                        TLRPC.Chat M0 = s12.M0(Long.valueOf(j16));
                        TLRPC.User a22 = org.telegram.messenger.qp.s1(i14).a2(Long.valueOf(j15));
                        org.telegram.messenger.k00 k00Var2 = org.telegram.messenger.qp.s1(i14).f24862q7;
                        ArrayList l10 = k00Var2.l(j16);
                        boolean z21 = g11Var.f33795n;
                        int i15 = a11.f31649b;
                        r31 K = r31.K(a11.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.f37603q = z21;
                        if (g11Var.f33787e0 == 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        K.L(z13);
                        arrayList2.add(K);
                        if (l10 != null) {
                            int size = l10.size();
                            int i16 = 0;
                            z14 = false;
                            while (i16 < size) {
                                Object obj3 = l10.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                int i18 = size;
                                if (z20) {
                                    i12 = i17;
                                    if (tL_forumTopic.f27004id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (g11Var.f33794k0.contains(Integer.valueOf(tL_forumTopic.f27004id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z22 = tL_forumTopic.pinned;
                                    if (!z22 && z14) {
                                        if (!arrayList2.isEmpty()) {
                                            ((r31) jg.g.i(1, arrayList2)).f37610y |= 8;
                                        }
                                        f41Var.L();
                                        z14 = false;
                                    } else if (z22 && !z14) {
                                        f41Var.M();
                                        z14 = true;
                                    }
                                    r31 K2 = r31.K(a11.class);
                                    K2.f37609x = j15;
                                    K2.d = tL_forumTopic.f27004id;
                                    K2.G = tL_forumTopic;
                                    if (z21) {
                                        j11 = j15;
                                        K2.B = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j11 = j15;
                                    }
                                    long j17 = g11Var.f33787e0;
                                    if (z21) {
                                        k00Var = k00Var2;
                                        j12 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                    } else {
                                        k00Var = k00Var2;
                                        j12 = tL_forumTopic.f27004id;
                                    }
                                    if (j17 == j12) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    K2.L(z15);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i12;
                                    k00Var2 = k00Var;
                                    j15 = j11;
                                }
                            }
                        } else {
                            z14 = false;
                        }
                        org.telegram.messenger.k00 k00Var3 = k00Var2;
                        if (z14) {
                            f41Var.L();
                        }
                        if (l10 != null && !l10.isEmpty() && !k00Var3.e(j16) && g11Var.f33798w) {
                            r31 K3 = r31.K(a11.class);
                            K3.d = -2;
                            K3.f37604r = true;
                            arrayList2.add(K3);
                            r31 K4 = r31.K(a11.class);
                            K4.d = -3;
                            K4.f37604r = true;
                            arrayList2.add(K4);
                            r31 K5 = r31.K(a11.class);
                            K5.d = -4;
                            K5.f37604r = true;
                            arrayList2.add(K5);
                        }
                        if (!z20 && !z21) {
                            if ((M0 != null && org.telegram.messenger.t3.w(15, M0)) || org.telegram.messenger.t10.v(a22)) {
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
                        boolean z23 = g11Var.f33795n;
                        int i19 = g11Var.f33786e;
                        org.telegram.messenger.qp s13 = org.telegram.messenger.qp.s1(i19);
                        long j18 = g11Var.f33788f;
                        long j19 = -j18;
                        TLRPC.Chat M02 = s13.M0(Long.valueOf(j19));
                        TLRPC.User a23 = org.telegram.messenger.qp.s1(i19).a2(Long.valueOf(j18));
                        org.telegram.messenger.k00 k00Var4 = org.telegram.messenger.qp.s1(i19).f24862q7;
                        ArrayList l11 = k00Var4.l(j19);
                        boolean z24 = g11Var.f33796r;
                        if (!z24) {
                            int i20 = e11.f33095b;
                            r31 K7 = r31.K(e11.class);
                            K7.d = 0;
                            arrayList = l11;
                            K7.B = 0L;
                            K7.G = null;
                            K7.f37603q = z23;
                            K7.f37610y = z24 ? 1 : 0;
                            if (g11Var.f33787e0 == 0) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            K7.L(z19);
                            arrayList3.add(K7);
                        } else {
                            arrayList = l11;
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            boolean z25 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                int i22 = size2;
                                Object obj4 = arrayList.get(i21);
                                i21++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = a23;
                                if (z24) {
                                    z17 = z25;
                                    if (tL_forumTopic2.f27004id == 1) {
                                        size2 = i22;
                                        a23 = user;
                                        z25 = z17;
                                    }
                                } else {
                                    z17 = z25;
                                }
                                if (g11Var.f33794k0.contains(Integer.valueOf(tL_forumTopic2.f27004id))) {
                                    size2 = i22;
                                    a23 = user;
                                    z25 = z17;
                                } else {
                                    boolean z26 = tL_forumTopic2.pinned;
                                    if (!z26 && z17) {
                                        f41Var2.L();
                                        z25 = false;
                                    } else if (z26 && !z17) {
                                        f41Var2.M();
                                        z25 = true;
                                    } else {
                                        z25 = z17;
                                    }
                                    int i23 = e11.f33095b;
                                    r31 K8 = r31.K(e11.class);
                                    K8.f37609x = j18;
                                    long j20 = j18;
                                    K8.d = tL_forumTopic2.f27004id;
                                    K8.G = tL_forumTopic2;
                                    if (z23) {
                                        K8.B = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j21 = g11Var.f33787e0;
                                    if (z23) {
                                        j13 = j21;
                                        j14 = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j13 = j21;
                                        j14 = tL_forumTopic2.f27004id;
                                    }
                                    if (j13 == j14) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    K8.L(z18);
                                    arrayList3.add(K8);
                                    size2 = i22;
                                    a23 = user;
                                    j18 = j20;
                                }
                            }
                            z16 = z25;
                        } else {
                            z16 = false;
                        }
                        TLRPC.User user2 = a23;
                        if (z16) {
                            f41Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !k00Var4.e(j19) && g11Var.f33798w) {
                            int i24 = e11.f33095b;
                            r31 K9 = r31.K(e11.class);
                            K9.d = -2;
                            K9.f37604r = true;
                            K9.f37592e = false;
                            arrayList3.add(K9);
                            r31 K10 = r31.K(e11.class);
                            K10.d = -3;
                            K10.f37604r = true;
                            K10.f37592e = false;
                            arrayList3.add(K10);
                            r31 K11 = r31.K(e11.class);
                            K11.d = -4;
                            K11.f37604r = true;
                            K11.f37592e = false;
                            arrayList3.add(K11);
                        }
                        if (!z24 && !z23) {
                            if ((M02 != null && org.telegram.messenger.t3.w(15, M02)) || org.telegram.messenger.t10.v(user2)) {
                                int i25 = e11.f33095b;
                                r31 K12 = r31.K(e11.class);
                                K12.d = -2;
                                K12.B = -2L;
                                K12.G = null;
                                K12.f37603q = false;
                                arrayList3.add(K12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, new q01(this), new q01(this), f6Var);
        this.J = w01Var;
        w01Var.E1(new org.telegram.messenger.v10(this) {
            public final g11 f36841b;

            {
                this.f36841b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                boolean z13;
                boolean z14;
                int i12;
                long j11;
                org.telegram.messenger.k00 k00Var;
                long j12;
                boolean z15;
                ArrayList arrayList;
                boolean z16;
                boolean z17;
                long j13;
                long j14;
                boolean z18;
                boolean z19;
                int i13 = r2;
                g11 g11Var = this.f36841b;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) obj;
                        f41 f41Var = (f41) obj2;
                        boolean z20 = g11Var.f33796r;
                        int i14 = g11Var.f33786e;
                        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i14);
                        long j15 = g11Var.f33788f;
                        long j16 = -j15;
                        TLRPC.Chat M0 = s12.M0(Long.valueOf(j16));
                        TLRPC.User a22 = org.telegram.messenger.qp.s1(i14).a2(Long.valueOf(j15));
                        org.telegram.messenger.k00 k00Var2 = org.telegram.messenger.qp.s1(i14).f24862q7;
                        ArrayList l10 = k00Var2.l(j16);
                        boolean z21 = g11Var.f33795n;
                        int i15 = a11.f31649b;
                        r31 K = r31.K(a11.class);
                        K.d = 0;
                        K.B = 0L;
                        K.G = null;
                        K.f37603q = z21;
                        if (g11Var.f33787e0 == 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        K.L(z13);
                        arrayList2.add(K);
                        if (l10 != null) {
                            int size = l10.size();
                            int i16 = 0;
                            z14 = false;
                            while (i16 < size) {
                                Object obj3 = l10.get(i16);
                                int i17 = i16 + 1;
                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                                int i18 = size;
                                if (z20) {
                                    i12 = i17;
                                    if (tL_forumTopic.f27004id == 1) {
                                        size = i18;
                                        i16 = i12;
                                    }
                                } else {
                                    i12 = i17;
                                }
                                if (g11Var.f33794k0.contains(Integer.valueOf(tL_forumTopic.f27004id))) {
                                    size = i18;
                                    i16 = i12;
                                } else {
                                    boolean z22 = tL_forumTopic.pinned;
                                    if (!z22 && z14) {
                                        if (!arrayList2.isEmpty()) {
                                            ((r31) jg.g.i(1, arrayList2)).f37610y |= 8;
                                        }
                                        f41Var.L();
                                        z14 = false;
                                    } else if (z22 && !z14) {
                                        f41Var.M();
                                        z14 = true;
                                    }
                                    r31 K2 = r31.K(a11.class);
                                    K2.f37609x = j15;
                                    K2.d = tL_forumTopic.f27004id;
                                    K2.G = tL_forumTopic;
                                    if (z21) {
                                        j11 = j15;
                                        K2.B = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                        K2.I = false;
                                    } else {
                                        j11 = j15;
                                    }
                                    long j17 = g11Var.f33787e0;
                                    if (z21) {
                                        k00Var = k00Var2;
                                        j12 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                                    } else {
                                        k00Var = k00Var2;
                                        j12 = tL_forumTopic.f27004id;
                                    }
                                    if (j17 == j12) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    K2.L(z15);
                                    arrayList2.add(K2);
                                    size = i18;
                                    i16 = i12;
                                    k00Var2 = k00Var;
                                    j15 = j11;
                                }
                            }
                        } else {
                            z14 = false;
                        }
                        org.telegram.messenger.k00 k00Var3 = k00Var2;
                        if (z14) {
                            f41Var.L();
                        }
                        if (l10 != null && !l10.isEmpty() && !k00Var3.e(j16) && g11Var.f33798w) {
                            r31 K3 = r31.K(a11.class);
                            K3.d = -2;
                            K3.f37604r = true;
                            arrayList2.add(K3);
                            r31 K4 = r31.K(a11.class);
                            K4.d = -3;
                            K4.f37604r = true;
                            arrayList2.add(K4);
                            r31 K5 = r31.K(a11.class);
                            K5.d = -4;
                            K5.f37604r = true;
                            arrayList2.add(K5);
                        }
                        if (!z20 && !z21) {
                            if ((M0 != null && org.telegram.messenger.t3.w(15, M0)) || org.telegram.messenger.t10.v(a22)) {
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
                        boolean z23 = g11Var.f33795n;
                        int i19 = g11Var.f33786e;
                        org.telegram.messenger.qp s13 = org.telegram.messenger.qp.s1(i19);
                        long j18 = g11Var.f33788f;
                        long j19 = -j18;
                        TLRPC.Chat M02 = s13.M0(Long.valueOf(j19));
                        TLRPC.User a23 = org.telegram.messenger.qp.s1(i19).a2(Long.valueOf(j18));
                        org.telegram.messenger.k00 k00Var4 = org.telegram.messenger.qp.s1(i19).f24862q7;
                        ArrayList l11 = k00Var4.l(j19);
                        boolean z24 = g11Var.f33796r;
                        if (!z24) {
                            int i20 = e11.f33095b;
                            r31 K7 = r31.K(e11.class);
                            K7.d = 0;
                            arrayList = l11;
                            K7.B = 0L;
                            K7.G = null;
                            K7.f37603q = z23;
                            K7.f37610y = z24 ? 1 : 0;
                            if (g11Var.f33787e0 == 0) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            K7.L(z19);
                            arrayList3.add(K7);
                        } else {
                            arrayList = l11;
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            boolean z25 = false;
                            int i21 = 0;
                            while (i21 < size2) {
                                int i22 = size2;
                                Object obj4 = arrayList.get(i21);
                                i21++;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj4;
                                TLRPC.User user = a23;
                                if (z24) {
                                    z17 = z25;
                                    if (tL_forumTopic2.f27004id == 1) {
                                        size2 = i22;
                                        a23 = user;
                                        z25 = z17;
                                    }
                                } else {
                                    z17 = z25;
                                }
                                if (g11Var.f33794k0.contains(Integer.valueOf(tL_forumTopic2.f27004id))) {
                                    size2 = i22;
                                    a23 = user;
                                    z25 = z17;
                                } else {
                                    boolean z26 = tL_forumTopic2.pinned;
                                    if (!z26 && z17) {
                                        f41Var2.L();
                                        z25 = false;
                                    } else if (z26 && !z17) {
                                        f41Var2.M();
                                        z25 = true;
                                    } else {
                                        z25 = z17;
                                    }
                                    int i23 = e11.f33095b;
                                    r31 K8 = r31.K(e11.class);
                                    K8.f37609x = j18;
                                    long j20 = j18;
                                    K8.d = tL_forumTopic2.f27004id;
                                    K8.G = tL_forumTopic2;
                                    if (z23) {
                                        K8.B = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                        K8.I = false;
                                    }
                                    long j21 = g11Var.f33787e0;
                                    if (z23) {
                                        j13 = j21;
                                        j14 = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                    } else {
                                        j13 = j21;
                                        j14 = tL_forumTopic2.f27004id;
                                    }
                                    if (j13 == j14) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    K8.L(z18);
                                    arrayList3.add(K8);
                                    size2 = i22;
                                    a23 = user;
                                    j18 = j20;
                                }
                            }
                            z16 = z25;
                        } else {
                            z16 = false;
                        }
                        TLRPC.User user2 = a23;
                        if (z16) {
                            f41Var2.L();
                        }
                        if (arrayList != null && !arrayList.isEmpty() && !k00Var4.e(j19) && g11Var.f33798w) {
                            int i24 = e11.f33095b;
                            r31 K9 = r31.K(e11.class);
                            K9.d = -2;
                            K9.f37604r = true;
                            K9.f37592e = false;
                            arrayList3.add(K9);
                            r31 K10 = r31.K(e11.class);
                            K10.d = -3;
                            K10.f37604r = true;
                            K10.f37592e = false;
                            arrayList3.add(K10);
                            r31 K11 = r31.K(e11.class);
                            K11.d = -4;
                            K11.f37604r = true;
                            K11.f37592e = false;
                            arrayList3.add(K11);
                        }
                        if (!z24 && !z23) {
                            if ((M02 != null && org.telegram.messenger.t3.w(15, M02)) || org.telegram.messenger.t10.v(user2)) {
                                int i25 = e11.f33095b;
                                r31 K12 = r31.K(e11.class);
                                K12.d = -2;
                                K12.B = -2L;
                                K12.G = null;
                                K12.f37603q = false;
                                arrayList3.add(K12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }, false);
        w01Var.f35167f3.f33473r = false;
        w01Var.setClipToPadding(false);
        w01Var.setClipChildren(false);
        if (v) {
            f10 = 90.0f;
        } else {
            f10 = 48.0f;
        }
        viewGroup.addView(w01Var, c8.ha.d(-1, -1.0f, 119, 0.0f, f10, 0.0f, 0.0f));
        w01Var.j(new v01(this, 1));
        ImageView j11 = j(activity, 2131231884, new View.OnClickListener(this) {
            public final g11 f36558b;

            {
                this.f36558b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g11 g11Var = this.f36558b;
                        w01 w01Var2 = g11Var.J;
                        w01Var2.z1(false);
                        u01 u01Var2 = g11Var.f33800y;
                        u01Var2.z1(false);
                        g11Var.M.a(false, true);
                        org.telegram.messenger.g0.b4(w01Var2);
                        org.telegram.messenger.g0.b4(u01Var2);
                        return;
                    case 1:
                        this.f36558b.f33790g0.a(0, Boolean.FALSE);
                        return;
                    default:
                        g11.b(this.f36558b);
                        return;
                }
            }
        });
        this.G = j11;
        ImageView j12 = j(activity, 2131231884, new View.OnClickListener(this) {
            public final g11 f36558b;

            {
                this.f36558b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g11 g11Var = this.f36558b;
                        w01 w01Var2 = g11Var.J;
                        w01Var2.z1(false);
                        u01 u01Var2 = g11Var.f33800y;
                        u01Var2.z1(false);
                        g11Var.M.a(false, true);
                        org.telegram.messenger.g0.b4(w01Var2);
                        org.telegram.messenger.g0.b4(u01Var2);
                        return;
                    case 1:
                        this.f36558b.f33790g0.a(0, Boolean.FALSE);
                        return;
                    default:
                        g11.b(this.f36558b);
                        return;
                }
            }
        });
        this.H = j12;
        frameLayout2.addView(j11, c8.ha.e(44, 36, 51));
        viewGroup.addView(j12, c8.ha.e(64, 48, 51));
        ImageView j13 = j(activity, 2131232357, new View.OnClickListener(this) {
            public final g11 f36558b;

            {
                this.f36558b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g11 g11Var = this.f36558b;
                        w01 w01Var2 = g11Var.J;
                        w01Var2.z1(false);
                        u01 u01Var2 = g11Var.f33800y;
                        u01Var2.z1(false);
                        g11Var.M.a(false, true);
                        org.telegram.messenger.g0.b4(w01Var2);
                        org.telegram.messenger.g0.b4(u01Var2);
                        return;
                    case 1:
                        this.f36558b.f33790g0.a(0, Boolean.FALSE);
                        return;
                    default:
                        g11.b(this.f36558b);
                        return;
                }
            }
        });
        this.E = j13;
        ImageView j14 = j(activity, 2131232357, new View.OnClickListener(this) {
            public final g11 f36558b;

            {
                this.f36558b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g11 g11Var = this.f36558b;
                        w01 w01Var2 = g11Var.J;
                        w01Var2.z1(false);
                        u01 u01Var2 = g11Var.f33800y;
                        u01Var2.z1(false);
                        g11Var.M.a(false, true);
                        org.telegram.messenger.g0.b4(w01Var2);
                        org.telegram.messenger.g0.b4(u01Var2);
                        return;
                    case 1:
                        this.f36558b.f33790g0.a(0, Boolean.FALSE);
                        return;
                    default:
                        g11.b(this.f36558b);
                        return;
                }
            }
        });
        this.F = j14;
        frameLayout2.addView(j13, c8.ha.e(44, 36, 51));
        viewGroup.addView(j14, c8.ha.e(64, 48, 51));
        org.telegram.messenger.qp.s1(i7).f24862q7.n(3, j10, false);
        SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i7).f24759e7;
        if (z9 && org.telegram.messenger.k5.w("topicssidetabs", j3, sharedPreferences, false)) {
            this.U = 1.0f;
            z10 = true;
            this.T = true;
        } else {
            z10 = true;
        }
        if (z9 && org.telegram.messenger.k5.w("topicssidetabsb", j3, sharedPreferences, false)) {
            z11 = z10;
        } else {
            z11 = false;
        }
        this.S = z11;
        if (z11) {
            i10 = 2131231886;
        } else {
            i10 = 2131231883;
        }
        j12.setImageResource(i10);
        r(false);
        if (!this.S) {
            i11 = 2131231884;
        } else {
            i11 = 2131231886;
        }
        j11.setImageResource(i11);
        g(false);
        h();
        p();
        q();
    }

    public static void a(g11 g11Var, r31 r31Var) {
        if (g11Var.f33795n) {
            org.telegram.messenger.v10 v10Var = g11Var.f33792i0;
            if (v10Var != null) {
                v10Var.a(Long.valueOf(r31Var.B), Boolean.FALSE);
            }
        } else if (r31Var.B == -2) {
            Runnable runnable = g11Var.f33791h0;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            org.telegram.messenger.v10 v10Var2 = g11Var.f33790g0;
            if (v10Var2 != null) {
                v10Var2.a(Integer.valueOf(r31Var.d), Boolean.FALSE);
            }
        }
    }

    public static void b(g11 g11Var) {
        boolean z9 = g11Var.T;
        boolean z10 = true;
        if (!z9 && g11Var.S && g11Var.f33784c0 == null && !g11Var.V) {
            if (g11Var.d) {
                return;
            }
            g11Var.d = true;
            g11Var.r(true);
        } else if ((r2 = g11Var.f33784c0) != null) {
            z10 = false;
            g11Var.d(z10);
        } else {
            z10 = false;
            g11Var.d(z10);
        }
    }

    public static void c(g11 g11Var, ArrayList arrayList) {
        long j3 = g11Var.f33788f;
        org.telegram.messenger.k00 k00Var = org.telegram.messenger.qp.s1(g11Var.f33786e).f24862q7;
        ArrayList arrayList2 = new ArrayList();
        int i7 = 0;
        while (i7 < arrayList.size()) {
            i7 = com.google.android.recaptcha.internal.a.f(((r31) arrayList.get(i7)).d, i7, 1, arrayList2);
        }
        long j10 = -j3;
        k00Var.w(arrayList2, j10);
        k00Var.y(j10, false);
    }

    public static ImageView j(Context context, int i7, View.OnClickListener onClickListener) {
        ImageView e10 = org.telegram.messenger.camera.q.e(context, i7);
        e10.setScaleType(ImageView.ScaleType.CENTER);
        e10.setOnClickListener(onClickListener);
        c8.ka.a(e10);
        return e10;
    }

    private void setAttached(boolean z9) {
        if (this.f33789f0 == z9) {
            return;
        }
        this.f33789f0 = z9;
        int i7 = 0;
        int i10 = org.telegram.messenger.qs.f25046r;
        int i11 = org.telegram.messenger.qs.f25045q5;
        long j3 = this.f33788f;
        int i12 = this.f33786e;
        if (z9) {
            org.telegram.messenger.qs.f(i12).c(this, i11);
            org.telegram.messenger.qs.f(i12).c(this, i10);
            org.telegram.messenger.k00 k00Var = org.telegram.messenger.qp.s1(i12).f24862q7;
            long j10 = -j3;
            LongSparseIntArray longSparseIntArray = k00Var.f23634f;
            longSparseIntArray.put(j10, longSparseIntArray.get(j10, 0) + 1);
            k00Var.y(j10, true);
            return;
        }
        long j11 = -j3;
        LongSparseIntArray longSparseIntArray2 = org.telegram.messenger.qp.s1(i12).f24862q7.f23634f;
        int i13 = longSparseIntArray2.get(j11, 0) - 1;
        if (i13 >= 0) {
            i7 = i13;
        }
        longSparseIntArray2.put(j11, i7);
        org.telegram.messenger.qs.f(i12).n(this, i11);
        org.telegram.messenger.qs.f(i12).n(this, i10);
    }

    @Override
    public final void F(float f10, int i7) {
        if (i7 == 1 && f10 == 1.0f && this.d) {
            this.d = false;
            this.S = false;
            this.G.setImageResource(2131231884);
            this.H.setImageResource(2131231883);
            SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(this.f33786e).f24759e7.edit();
            edit.putBoolean("topicssidetabsb" + this.f33788f, false).apply();
            r(true);
        }
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        p();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28258z6));
    }

    public final void d(boolean z9) {
        float f10;
        if (this.T == z9) {
            return;
        }
        ValueAnimator valueAnimator = this.f33785d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (this.V) {
                this.f33784c0 = Boolean.valueOf(z9);
                return;
            }
        }
        if (!z9) {
            this.S = !this.S;
        }
        this.T = z9;
        this.V = true;
        float f11 = this.U;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f33785d0 = ofFloat;
        ofFloat.addUpdateListener(new c60(this, 27));
        this.f33785d0.addListener(new t9(21, this, z9));
        this.f33785d0.setInterpolator(mi.l.V);
        this.f33785d0.setDuration(250L);
        this.f33785d0.start();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.f25045q5;
        long j3 = this.f33788f;
        if (i7 == i11) {
            if (((Long) objArr[0]).longValue() == (-j3)) {
                q();
            }
        } else if (i7 == org.telegram.messenger.qs.f25046r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i12 = org.telegram.messenger.qp.C8;
            if ((intValue & 512) > 0) {
                org.telegram.messenger.qp.s1(this.f33786e).f24862q7.y(-j3, false);
                q();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        FrameLayout frameLayout = this.I;
        if (frameLayout.getVisibility() == 0) {
            this.N.setBounds((int) frameLayout.getTranslationX(), (int) this.Q, (int) (frameLayout.getTranslationX() + org.telegram.messenger.g0.L(78.0f)), (int) (getMeasuredHeight() - this.P));
            this.N.draw(canvas);
        }
        FrameLayout frameLayout2 = this.f33799x;
        if (frameLayout2.getVisibility() == 0) {
            this.O.setAlpha((int) (frameLayout2.getAlpha() * 255.0f));
            this.O.setBounds(0, (int) frameLayout2.getTranslationY(), getMeasuredWidth(), (int) (frameLayout2.getTranslationY() + org.telegram.messenger.g0.L(50.0f)));
            this.O.draw(canvas);
        }
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        canvas.save();
        if (view == this.I) {
            canvas.clipPath(this.N.Q.f11513k);
        }
        if (view == this.f33799x) {
            canvas.clipPath(this.O.Q.f11513k);
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        int i7 = org.telegram.ui.ActionBar.k6.f28258z6;
        org.telegram.ui.ActionBar.f6 f6Var = this.h;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, f6Var);
        int f10 = i0.a.f(1.0f - this.U, w02, w03);
        int f11 = i0.a.f(this.U, w02, w03);
        boolean z9 = this.W;
        this.W = true;
        ImageView imageView = this.G;
        if (imageView != null && (!z9 || f10 != this.f33780a0)) {
            imageView.setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
        }
        this.f33780a0 = f10;
        ImageView imageView2 = this.H;
        if (imageView2 != null && (!z9 || f11 != this.f33782b0)) {
            imageView2.setColorFilter(new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN));
        }
        this.f33782b0 = f11;
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

    public final void g(boolean z9) {
        boolean z10;
        ArrayList l10 = org.telegram.messenger.qp.s1(this.f33786e).f24862q7.l(-this.f33788f);
        if (l10 != null && !l10.isEmpty() && !this.f33793j0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f33779a.a(z10, z9);
    }

    public c11 getCurrentTabsPosition() {
        if (this.T) {
            return c11.f32361b;
        }
        if (this.S) {
            return c11.f32362c;
        }
        return c11.f32360a;
    }

    public float getSideMenuT() {
        return this.U * this.f33779a.f55370e;
    }

    public final void h() {
        int i7;
        int i10;
        int i11;
        te.a aVar = this.M;
        float f10 = aVar.f55370e;
        ImageView imageView = this.E;
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
        ImageView imageView2 = this.F;
        imageView2.setAlpha(f10);
        imageView2.setScaleX(org.telegram.messenger.g0.T1(0.4f, 1.0f, f10));
        imageView2.setScaleY(org.telegram.messenger.g0.T1(0.4f, 1.0f, f10));
        if (i12 > 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView2.setVisibility(i10);
        float f11 = 1.0f - aVar.f55370e;
        ImageView imageView3 = this.G;
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
        ImageView imageView4 = this.H;
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
        float T1 = org.telegram.messenger.g0.T1(1.0f, 0.0f, this.U);
        FrameLayout frameLayout = this.f33799x;
        frameLayout.setAlpha(T1);
        if ((1.0f - this.f33781b.f55370e) * (1.0f - this.U) * this.f33779a.f55370e > 0.0f) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        frameLayout.setVisibility(i7);
        if (this.S) {
            frameLayout.setTranslationY(((getMeasuredHeight() - org.telegram.messenger.g0.L(50.0f)) - this.P) + org.telegram.messenger.g0.W1(k(c11.f32362c), org.telegram.messenger.g0.L(43.0f), 0));
            return;
        }
        frameLayout.setTranslationY(this.Q + org.telegram.messenger.g0.W1(k(c11.f32360a), -org.telegram.messenger.g0.L(43.0f), 0));
    }

    public final float k(c11 c11Var) {
        float f10 = (1.0f - this.f33781b.f55370e) * this.f33779a.f55370e;
        if (c11Var == c11.f32361b) {
            return this.U * f10;
        }
        if ((c11Var == c11.f32360a && !this.S) || (c11Var == c11.f32362c && this.S)) {
            return (1.0f - this.U) * f10;
        }
        return 0.0f;
    }

    public final boolean l() {
        if (this.U > 0.5f) {
            int i7 = 0;
            while (true) {
                w01 w01Var = this.J;
                if (i7 >= w01Var.getChildCount()) {
                    break;
                }
                r31 G = w01Var.f35167f3.G(RecyclerView.R(w01Var.getChildAt(i7)));
                if (G == null || !G.f37604r) {
                    i7++;
                } else {
                    return true;
                }
            }
        } else {
            int i10 = 0;
            while (true) {
                u01 u01Var = this.f33800y;
                if (i10 >= u01Var.getChildCount()) {
                    break;
                }
                r31 G2 = u01Var.f35167f3.G(RecyclerView.R(u01Var.getChildAt(i10)));
                if (G2 != null && G2.f37604r) {
                    return true;
                }
                i10++;
            }
        }
        return false;
    }

    public final void m() {
        org.telegram.messenger.k00 k00Var = org.telegram.messenger.qp.s1(this.f33786e).f24862q7;
        long j3 = this.f33788f;
        if (!k00Var.e(-j3)) {
            k00Var.o(-j3);
        }
    }

    public final void n(long j3, boolean z9) {
        if (this.f33795n) {
            org.telegram.messenger.v10 v10Var = this.f33792i0;
            if (v10Var != null) {
                v10Var.a(Long.valueOf(j3), Boolean.valueOf(z9));
                return;
            }
            return;
        }
        org.telegram.messenger.v10 v10Var2 = this.f33790g0;
        if (v10Var2 != null) {
            v10Var2.a(Integer.valueOf((int) j3), Boolean.valueOf(z9));
        }
    }

    public final boolean o(final TLRPC.TL_forumTopic tL_forumTopic, View view, boolean z9) {
        TLRPC.Chat chat;
        TLRPC.User user;
        int i7;
        int i10;
        org.telegram.messenger.qp qpVar;
        final g11 g11Var;
        final TLRPC.TL_forumTopic tL_forumTopic2;
        int i11;
        int i12;
        int i13;
        final g11 g11Var2;
        boolean z10;
        int i14;
        int i15;
        int i16;
        k60 k60Var;
        int i17 = this.f33786e;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i17);
        long j3 = this.f33788f;
        int i18 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i18 < 0) {
            chat = s12.M0(Long.valueOf(-j3));
        } else {
            chat = null;
        }
        if (i18 > 0) {
            user = s12.a2(Long.valueOf(j3));
        } else {
            user = null;
        }
        final org.telegram.ui.an anVar = this.f33797s;
        final k60 I = k60.I(anVar, view);
        if (org.telegram.messenger.t3.p0(chat)) {
            long o4 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
            if (o4 == 0 || !org.telegram.messenger.t3.A(i17, chat, 24)) {
                return false;
            }
            TLRPC.Chat chat2 = chat;
            k60 k60Var2 = I;
            k60Var2.c(2131232092, org.telegram.messenger.hd.M0(2131752089, null), new bi.w2(this, k60Var2, o4, chat2, 17), false);
            long j10 = chat2.f26952id;
            if (org.telegram.messenger.t3.p0(chat2) && org.telegram.messenger.t3.A(i17, chat2, 24)) {
                long j11 = chat2.linked_monoforum_id;
                if (j11 != 0) {
                    j10 = j11;
                }
            }
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i17).M0(Long.valueOf(j10));
            TLRPC.User a22 = org.telegram.messenger.qp.s1(i17).a2(Long.valueOf(o4));
            k60 k60Var3 = k60Var2;
            if (a22 != null) {
                k60Var3 = k60Var2;
                if (org.telegram.messenger.t3.w(2, M0)) {
                    k60Var2.c(2131232328, org.telegram.messenger.hd.M0(2131753726, null), null, false);
                    org.telegram.ui.ActionBar.z0 y10 = k60Var2.y();
                    y10.setVisibility(8);
                    org.telegram.messenger.qp s13 = org.telegram.messenger.qp.s1(i17);
                    bi.q3 q3Var = new bi.q3(this, y10, k60Var2, j10, a22, M0, 3);
                    k60Var3 = k60Var2;
                    s13.K0(M0, a22, q3Var);
                }
            }
            g11Var2 = this;
            k60Var = k60Var3;
        } else {
            if (!org.telegram.messenger.t3.y(15, chat) && !org.telegram.messenger.t10.v(user)) {
                i11 = 15;
                tL_forumTopic2 = tL_forumTopic;
                qpVar = s12;
                g11Var = this;
            } else {
                boolean z11 = tL_forumTopic.pinned;
                if (z11) {
                    i7 = 2131232413;
                } else {
                    i7 = 2131232293;
                }
                if (z11) {
                    i10 = 2131751453;
                } else {
                    i10 = 2131751454;
                }
                qpVar = s12;
                g11Var = this;
                tL_forumTopic2 = tL_forumTopic;
                I.c(i7, org.telegram.messenger.hd.M0(i10, null), new kn0(this, I, qpVar, tL_forumTopic, 4), false);
                if (tL_forumTopic2.pinned && !z9) {
                    I.c(2131232773, org.telegram.messenger.hd.M0(2131750708, null), new r01(g11Var, 1), false);
                }
                i11 = 15;
            }
            if (org.telegram.messenger.t3.y(i11, chat) || org.telegram.messenger.t10.v(user)) {
                I.c(2131232492, org.telegram.messenger.hd.M0(2131751217, null), new Runnable(g11Var) {
                    public final g11 f38213b;

                    {
                        this.f38213b = g11Var;
                    }

                    @Override
                    public final void run() {
                        g11 g11Var3;
                        int i19 = r4;
                        g11 g11Var4 = this.f38213b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic2;
                        k60 k60Var4 = I;
                        switch (i19) {
                            case 0:
                                k60Var4.u();
                                g11Var4.f33797s.presentFragment(u81.f0(-g11Var4.f33788f, tL_forumTopic3.f27004id));
                                return;
                            case 1:
                                g11Var4.getClass();
                                k60Var4.u();
                                org.telegram.messenger.qp.s1(g11Var4.f33786e).f24862q7.z(tL_forumTopic3.f27004id, -g11Var4.f33788f, true ^ tL_forumTopic3.closed);
                                return;
                            default:
                                k60Var4.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.f27004id));
                                l10 l10Var = new l10(7);
                                g11 g11Var5 = this.f38213b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g11Var5.getContext());
                                String K0 = org.telegram.messenger.hd.K0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                                u1Var.R = K0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j12 = g11Var5.f33787e0;
                                if (hashSet.size() == 1) {
                                    g11Var3 = g11Var5;
                                    u1Var.T = org.telegram.messenger.hd.a0(null, null, 2131751499, org.telegram.messenger.qp.s1(g11Var5.f33786e).f24862q7.f(-g11Var5.f33788f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    g11Var3 = g11Var5;
                                    u1Var.T = org.telegram.messenger.hd.M0(2131751498, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751599, null), new bi.n4(g11Var3, arrayList, j12, hashSet, l10Var));
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new il0(13));
                                u1Var.show();
                                TextView textView = (TextView) u1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28089q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            }
            final long j12 = tL_forumTopic2.f27004id;
            final int currentAccount = anVar.getCurrentAccount();
            final org.telegram.ui.ActionBar.f6 resourceProvider = anVar.getResourceProvider();
            final long j13 = g11Var.f33788f;
            qn qnVar = new qn(I, currentAccount, j13, j12, anVar, resourceProvider);
            final k60 J = I.J();
            J.c(2131232057, org.telegram.messenger.hd.M0(2131753756, null), new org.telegram.ui.fq0(I, 27), false);
            J.c(2131232403, org.telegram.messenger.hd.M0(2131745276, null), new Runnable() {
                @Override
                public final void run() {
                    k60.this.u();
                    SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(currentAccount).f24749d7;
                    StringBuilder sb2 = new StringBuilder("sound_enabled_");
                    long j14 = j13;
                    long j15 = j12;
                    sb2.append(org.telegram.messenger.dt.v(j14, j15, false));
                    boolean z12 = sharedPreferences.getBoolean(sb2.toString(), true);
                    boolean z13 = !z12 ? 1 : 0;
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putBoolean("sound_enabled_" + org.telegram.messenger.dt.v(j14, j15, false), z13).apply();
                    J.u();
                    org.telegram.ui.ActionBar.f2 f2Var = anVar;
                    if (hc.a(f2Var)) {
                        hc.S(z12 ? 1 : 0, f2Var, resourceProvider).j();
                    }
                }
            }, false);
            final org.telegram.ui.ActionBar.z0 y11 = J.y();
            J.c(2131232258, org.telegram.messenger.hd.M0(2131748307, null), new ai.a1(I, resourceProvider, currentAccount, qnVar, 21), false);
            J.c(2131232106, org.telegram.messenger.hd.M0(2131747916, null), new sn(I, j13, j12, anVar, resourceProvider), false);
            J.c(0, "", new bi.ra(I, currentAccount, j13, j12, anVar, resourceProvider), false);
            final org.telegram.ui.ActionBar.z0 y12 = J.y();
            new Runnable() {
                @Override
                public final void run() {
                    int i19;
                    int i20 = currentAccount;
                    org.telegram.messenger.qp s14 = org.telegram.messenger.qp.s1(i20);
                    long j14 = j13;
                    long j15 = j12;
                    boolean r22 = s14.r2(j14, j15, null);
                    org.telegram.ui.ActionBar.z0 z0Var = y12;
                    org.telegram.ui.ActionBar.z0 z0Var2 = y11;
                    if (r22) {
                        z0Var.j(org.telegram.messenger.hd.M0(2131743849, null), 2131232412, null);
                        i19 = org.telegram.ui.ActionBar.k6.f28221x6;
                        z0Var2.setVisibility(8);
                    } else {
                        z0Var.j(org.telegram.messenger.hd.M0(2131748305, null), 2131232256, null);
                        int i21 = org.telegram.ui.ActionBar.k6.f28089q7;
                        z0Var2.setVisibility(0);
                        if (org.telegram.messenger.qp.s1(i20).s2(j14, j15)) {
                            z0Var2.j(org.telegram.messenger.hd.M0(2131745278, null), 2131232402, null);
                        } else {
                            z0Var2.j(org.telegram.messenger.hd.M0(2131745276, null), 2131232403, null);
                        }
                        i19 = i21;
                    }
                    yn.c(z0Var, i19);
                }
            }.run();
            long j14 = g11Var.f33788f;
            org.telegram.messenger.qp qpVar2 = qpVar;
            boolean r22 = qpVar2.r2(j14, tL_forumTopic2.f27004id, null);
            if (r22) {
                i12 = 2131232412;
            } else {
                i12 = 2131232256;
            }
            int i19 = i12;
            if (r22) {
                i13 = 2131743850;
            } else {
                i13 = 2131748313;
            }
            TLRPC.Chat chat3 = chat;
            g11Var2 = this;
            final k60 k60Var4 = I;
            k60Var4.c(i19, org.telegram.messenger.hd.M0(i13, null), new jv0(g11Var2, qpVar2, tL_forumTopic, I, J, 2), false);
            if (org.telegram.messenger.t3.i(i17, chat3, tL_forumTopic) && !org.telegram.messenger.t10.u(user)) {
                boolean z12 = tL_forumTopic.closed;
                if (z12) {
                    i15 = 2131232406;
                } else {
                    i15 = 2131232404;
                }
                if (z12) {
                    i16 = 2131746085;
                } else {
                    i16 = 2131752039;
                }
                i14 = 1;
                z10 = false;
                k60Var4.c(i15, org.telegram.messenger.hd.M0(i16, null), new Runnable(g11Var2) {
                    public final g11 f38213b;

                    {
                        this.f38213b = g11Var2;
                    }

                    @Override
                    public final void run() {
                        g11 g11Var3;
                        int i192 = r4;
                        g11 g11Var4 = this.f38213b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                        k60 k60Var42 = k60Var4;
                        switch (i192) {
                            case 0:
                                k60Var42.u();
                                g11Var4.f33797s.presentFragment(u81.f0(-g11Var4.f33788f, tL_forumTopic3.f27004id));
                                return;
                            case 1:
                                g11Var4.getClass();
                                k60Var42.u();
                                org.telegram.messenger.qp.s1(g11Var4.f33786e).f24862q7.z(tL_forumTopic3.f27004id, -g11Var4.f33788f, true ^ tL_forumTopic3.closed);
                                return;
                            default:
                                k60Var42.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.f27004id));
                                l10 l10Var = new l10(7);
                                g11 g11Var5 = this.f38213b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g11Var5.getContext());
                                String K0 = org.telegram.messenger.hd.K0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                                u1Var.R = K0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j122 = g11Var5.f33787e0;
                                if (hashSet.size() == 1) {
                                    g11Var3 = g11Var5;
                                    u1Var.T = org.telegram.messenger.hd.a0(null, null, 2131751499, org.telegram.messenger.qp.s1(g11Var5.f33786e).f24862q7.f(-g11Var5.f33788f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    g11Var3 = g11Var5;
                                    u1Var.T = org.telegram.messenger.hd.M0(2131751498, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751599, null), new bi.n4(g11Var3, arrayList, j122, hashSet, l10Var));
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new il0(13));
                                u1Var.show();
                                TextView textView = (TextView) u1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28089q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
            } else {
                z10 = false;
                i14 = 1;
            }
            k60Var = k60Var4;
            if (org.telegram.messenger.t3.e(i17, chat3, tL_forumTopic)) {
                k60Var4.c(2131232108, org.telegram.messenger.hd.K0(i14, "DeleteTopics"), new Runnable(g11Var2) {
                    public final g11 f38213b;

                    {
                        this.f38213b = g11Var2;
                    }

                    @Override
                    public final void run() {
                        g11 g11Var3;
                        int i192 = r4;
                        g11 g11Var4 = this.f38213b;
                        TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                        k60 k60Var42 = k60Var4;
                        switch (i192) {
                            case 0:
                                k60Var42.u();
                                g11Var4.f33797s.presentFragment(u81.f0(-g11Var4.f33788f, tL_forumTopic3.f27004id));
                                return;
                            case 1:
                                g11Var4.getClass();
                                k60Var42.u();
                                org.telegram.messenger.qp.s1(g11Var4.f33786e).f24862q7.z(tL_forumTopic3.f27004id, -g11Var4.f33788f, true ^ tL_forumTopic3.closed);
                                return;
                            default:
                                k60Var42.u();
                                HashSet hashSet = new HashSet();
                                hashSet.add(Integer.valueOf(tL_forumTopic3.f27004id));
                                l10 l10Var = new l10(7);
                                g11 g11Var5 = this.f38213b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g11Var5.getContext());
                                String K0 = org.telegram.messenger.hd.K0(hashSet.size(), "DeleteTopics");
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                                u1Var.R = K0;
                                ArrayList arrayList = new ArrayList(hashSet);
                                long j122 = g11Var5.f33787e0;
                                if (hashSet.size() == 1) {
                                    g11Var3 = g11Var5;
                                    u1Var.T = org.telegram.messenger.hd.a0(null, null, 2131751499, org.telegram.messenger.qp.s1(g11Var5.f33786e).f24862q7.f(-g11Var5.f33788f, ((Integer) arrayList.get(0)).intValue()).title);
                                } else {
                                    g11Var3 = g11Var5;
                                    u1Var.T = org.telegram.messenger.hd.M0(2131751498, null);
                                }
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751599, null), new bi.n4(g11Var3, arrayList, j122, hashSet, l10Var));
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new il0(13));
                                u1Var.show();
                                TextView textView = (TextView) u1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28089q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, z10);
                k60Var = k60Var4;
            }
        }
        boolean z13 = view instanceof b11;
        org.telegram.ui.ActionBar.f6 f6Var = g11Var2.h;
        if (z13) {
            ?? drawable = new Drawable();
            Paint paint = new Paint(1);
            drawable.f40122a = paint;
            drawable.f40123b = new RectF();
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, f6Var));
            k60Var.W(drawable);
            k60Var.a0(org.telegram.messenger.g0.L(16.0f), 0.0f);
        } else if (z9) {
            k60Var.W(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27848d6, f6Var)));
            k60Var.V(5);
        } else {
            int L = org.telegram.messenger.g0.L(5.0f);
            int L2 = org.telegram.messenger.g0.L(5.0f);
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27848d6, f6Var);
            float f10 = 0;
            float f11 = L;
            float f12 = L2;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f11, f11, f12, f12, f10, f10}, null, null));
            shapeDrawable.getPaint().setColor(w02);
            k60Var.W(shapeDrawable);
        }
        k60Var.Z();
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
        org.telegram.ui.ae aeVar = this.R;
        if (aeVar != null) {
            aeVar.run();
        }
        i();
        float k10 = k(c11.f32361b);
        int i7 = 0;
        FrameLayout frameLayout = this.I;
        frameLayout.setTranslationX(org.telegram.messenger.g0.W1(k10, -org.telegram.messenger.g0.L(78.0f), 0));
        if (k10 <= 0.0f) {
            i7 = 8;
        }
        frameLayout.setVisibility(i7);
        e();
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        ImageView imageView = this.E;
        org.telegram.ui.ActionBar.f6 f6Var = this.h;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, f6Var, mode);
        org.telegram.ui.ActionBar.r6.t(this.F, i10, f6Var, mode);
        invalidate();
    }

    public final void q() {
        g(true);
        u01 u01Var = this.f33800y;
        boolean canScrollHorizontally = u01Var.canScrollHorizontally(-1);
        u01Var.f35167f3.O(true);
        if (!canScrollHorizontally) {
            u01Var.v0(0);
        }
        w01 w01Var = this.J;
        boolean canScrollVertically = w01Var.canScrollVertically(-1);
        w01Var.f35167f3.O(true);
        if (!canScrollVertically) {
            w01Var.v0(0);
        }
        org.telegram.messenger.g0.h3(new r01(this, 0));
    }

    public final void r(boolean z9) {
        boolean z10;
        if (this.f33783c && !this.d) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f33781b.a(z10, z9);
    }

    public void setAllTopicsHidden(boolean z9) {
        if (this.f33793j0 != z9) {
            this.f33793j0 = z9;
            g(true);
        }
    }

    public void setCurrentTopic(long j3) {
        boolean z9;
        this.f33787e0 = j3;
        u01 u01Var = this.f33800y;
        u01Var.f35167f3.O(true);
        u01Var.invalidate();
        this.J.f35167f3.O(true);
        f11 f11Var = this.D;
        if (f11Var != null) {
            if (j3 == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            f11Var.c(true, false, z9);
        }
    }

    public void setOnDialogSelected(org.telegram.messenger.v10 v10Var) {
        this.f33792i0 = v10Var;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.f33791h0 = runnable;
    }

    public void setOnTopicSelected(org.telegram.messenger.v10 v10Var) {
        this.f33790g0 = v10Var;
    }

    public void setSideMenuBackgroundDrawable(fh.g gVar) {
        this.N = gVar;
        gVar.r(org.telegram.messenger.g0.L(16.0f));
        this.N.q(org.telegram.messenger.g0.L(7.0f));
    }

    public void setSideMenuBackgroundMarginBottom(float f10) {
        this.P = f10;
        i();
        f();
        invalidate();
    }

    public void setSideMenuBackgroundMarginTop(float f10) {
        this.Q = f10;
        this.I.setTranslationY(f10);
        i();
        f();
        invalidate();
    }

    public void setTabsEnabled(boolean z9) {
        if (this.f33783c == z9) {
            return;
        }
        this.f33783c = z9;
        if (!z9) {
            d(false);
        }
        r(true);
    }

    public void setTopMenuBackgroundDrawable(fh.g gVar) {
        this.O = gVar;
        gVar.r(org.telegram.messenger.g0.L(18.0f));
        this.O.q(org.telegram.messenger.g0.L(7.0f));
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
