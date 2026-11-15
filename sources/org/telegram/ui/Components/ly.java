package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public class ly extends FrameLayout implements org.telegram.ui.ActionBar.z5, te.b, org.telegram.messenger.is, rh.a {
    public static final int V2 = 0;
    public final gy A0;
    public final LongSparseArray A1;
    public final GradientDrawable A2;
    public final lv B0;
    public int B1;
    public int B2;
    public final zv C0;
    public final du C1;
    public ArrayList C2;
    public final aw D0;
    public final int D1;
    public int D2;
    public final ImageView E;
    public final vv E0;
    public final int[] E1;
    public long E2;
    public final ImageView F;
    public final wv F0;
    public int F1;
    public final te.a F2;
    public AnimatorSet G;
    public jy G0;
    public int G1;
    public ArrayList G2;
    public AnimatorSet H;
    public final yv H0;
    public int H1;
    public Drawable H2;
    public float I;
    public final ph.c I0;
    public int I1;
    public int I2;
    public final qw J;
    public boolean J0;
    public int J1;
    public int J2;
    public final lw K;
    public boolean K0;
    public TLRPC.ChatFull K1;
    public int K2;
    public final org.telegram.ui.w61 L;
    public boolean L0;
    public boolean L1;
    public int L2;
    public final ph.a M;
    public final fx M0;
    public int M1;
    public boolean M2;
    public final org.telegram.ui.w61 N;
    public AnimatorSet N0;
    public final bg.q0 N1;
    public xi.e N2;
    public final ph.a O;
    public final di.ub O0;
    public boolean O1;
    public xi.e O2;
    public final View P;
    public sw P0;
    public int P1;
    public boolean P2;
    public final yw Q;
    public boolean Q0;
    public boolean Q1;
    public AnimatorSet Q2;
    public final mw R;
    public final int[] R0;
    public boolean R1;
    public h2.m0 R2;
    public final vw S;
    public final ObjectAnimator[] S0;
    public ux S1;
    public final hv S2;
    public final lx T;
    public boolean T0;
    public float T1;
    public boolean T2;
    public jy U;
    public jg.d1 U0;
    public float U1;
    public boolean U2;
    public final ph.c V;
    public boolean V0;
    public float V1;
    public final nv W;
    public boolean W0;
    public float W1;
    public String[] X0;
    public float X1;
    public final Drawable[] Y0;
    public boolean Y1;
    public final Drawable[] Z0;
    public final org.telegram.ui.ActionBar.e2 Z1;
    public final te.a f36928a;
    public AnimatorSet f36929a0;
    public final Drawable[] f36930a1;
    public final org.telegram.ui.ActionBar.e6 f36931a2;
    public final te.a f36932b;
    public final wi0 f36933b0;
    public final String[] f36934b1;
    public final org.telegram.ui.ActionBar.t5 f36935b2;
    public int f36936c;
    public final wi0 f36937c0;
    public final int f36938c1;
    public final org.telegram.ui.ActionBar.t5 f36939c2;
    public final ArrayList d;
    public boolean f36940d0;
    public final int f36941d1;
    public final boolean d2;
    public final ArrayList f36942e;
    public final boolean f36943e0;
    public final ArrayList f36944e1;
    public LongSparseArray f36945e2;
    public boolean f36946f;
    public boolean f36947f0;
    public int f36948f1;
    public PorterDuffColorFilter f36949f2;
    public boolean f36950g0;
    public int f36951g1;
    public final zj f36952g2;
    public final bw h;
    public final pv f36953h0;
    public boolean f36954h1;
    public final hw f36955h2;
    public final qv f36956i0;
    public TLRPC.TL_messages_stickerSet f36957i1;
    public boolean f36958i2;
    public final rx f36959j0;
    public ArrayList f36960j1;
    public final boolean f36961j2;
    public final qx f36962k0;
    public ArrayList f36963k1;
    public final dh.g f36964k2;
    public final tx f36965l0;
    public ArrayList l1;
    public final zg f36966l2;
    public final HashMap m0;
    public ArrayList f36967m1;
    public final ui.c f36968m2;
    public final FrameLayout f36969n;
    public final lv f36970n0;
    public final ArrayList n1;
    public final dh.c f36971n2;
    public final qx f36972o0;
    public final ArrayList f36973o1;
    public final ri.q f36974o2;
    public final sv f36975p0;
    public final ArrayList f36976p1;
    public boolean f36977p2;
    public final tw f36978q0;
    public final ArrayList f36979q1;
    public boolean f36980q2;
    public final FrameLayout f36981r;
    public boolean f36982r0;
    public final ArrayList f36983r1;
    public int f36984r2;
    public final FrameLayout f36985s;
    public int f36986s0;
    public final HashMap f36987s1;
    public float f36988s2;
    public int f36989t0;
    public final Paint f36990t1;
    public View f36991t2;
    public int f36992u0;
    public mx f36993u1;
    public int f36994u2;
    public boolean f36995v0;
    public long f36996v1;
    public int f36997v2;
    public final View f36998w;
    public boolean f36999w0;
    public boolean f37000w1;
    public long f37001w2;
    public final qb0 f37002x;
    public boolean f37003x0;
    public boolean f37004x1;
    public boolean f37005x2;
    public final cw f37006y;
    public final tv f37007y0;
    public final TLRPC.StickerSetCovered[] f37008y1;
    public boolean f37009y2;
    public final dy f37010z0;
    public final LongSparseArray f37011z1;
    public final Rect f37012z2;

    public ly(org.telegram.ui.ActionBar.e2 r43, boolean r44, boolean r45, boolean r46, android.content.Context r47, boolean r48, org.telegram.tgnet.TLRPC.ChatFull r49, android.view.ViewGroup r50, boolean r51, final org.telegram.ui.ActionBar.e6 r52, boolean r53, boolean r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ly.<init>(org.telegram.ui.ActionBar.e2, boolean, boolean, boolean, android.content.Context, boolean, org.telegram.tgnet.TLRPC$ChatFull, android.view.ViewGroup, boolean, org.telegram.ui.ActionBar.e6, boolean, boolean):void");
    }

    public static void a(ly lyVar, boolean z10) {
        qv qvVar = lyVar.f36956i0;
        if (qvVar != null) {
            int childCount = qvVar.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = qvVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.h2) {
                    ImageReceiver photoImage = ((org.telegram.ui.Cells.h2) childAt).getPhotoImage();
                    if (z10) {
                        photoImage.f22301u0 = true;
                        photoImage.P0(false);
                    } else {
                        photoImage.f22301u0 = false;
                        photoImage.Q0();
                    }
                }
            }
        }
    }

    public static void d(ly lyVar, ux uxVar, String str) {
        String str2;
        String str3;
        boolean z10;
        String str4;
        mx mxVar;
        cc ccVar;
        org.telegram.ui.ActionBar.e2 e2Var = lyVar.Z1;
        int i7 = lyVar.f36941d1;
        ArrayList arrayList = lyVar.f36983r1;
        if (uxVar != null) {
            if (uxVar.getSpan() != null) {
                if (lyVar.f36993u1 != null) {
                    long j3 = uxVar.getSpan().documentId;
                    TLRPC.Document document = uxVar.getSpan().document;
                    zw zwVar = uxVar.f40182e;
                    if (zwVar != null && zwVar.f42436i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (document == null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            zw zwVar2 = (zw) arrayList.get(i10);
                            int i11 = 0;
                            while (true) {
                                ArrayList arrayList2 = zwVar2.f42432c;
                                if (arrayList2 != null && i11 < arrayList2.size()) {
                                    if (((TLRPC.Document) zwVar2.f42432c.get(i11)).f28057id == j3) {
                                        document = (TLRPC.Document) zwVar2.f42432c.get(i11);
                                        break;
                                    }
                                    i11++;
                                }
                            }
                        }
                    }
                    if (document == null) {
                        document = g5.e(i7, j3);
                    }
                    TLRPC.Document document2 = document;
                    if (document2 != null) {
                        str4 = org.telegram.messenger.gj.U(document2);
                    } else {
                        str4 = null;
                    }
                    if (!org.telegram.messenger.gj.m3(document2) && !org.telegram.messenger.m10.i(i7).q() && (((mxVar = lyVar.f36993u1) == null || !mxVar.g()) && !lyVar.V0 && !z10)) {
                        lyVar.N(false);
                        if (e2Var != null) {
                            ccVar = cc.a0(e2Var);
                        } else {
                            ccVar = new cc(lyVar.f36981r, lyVar.f36931a2);
                        }
                        if (!lyVar.f36958i2 && e2Var != null) {
                            ccVar.K(2131624191, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131743863, null)), org.telegram.messenger.hd.M0(2131747817, null), new hv(lyVar, 4)).j();
                        } else {
                            ccVar.r(document2, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131743864, null)), org.telegram.messenger.hd.M0(2131747033, null), new hv(lyVar, 3)).j();
                        }
                        lyVar.f36958i2 = !lyVar.f36958i2;
                        return;
                    }
                    lyVar.E2 = SystemClock.elapsedRealtime();
                    lyVar.N(true);
                    lyVar.h("animated_" + j3);
                    lyVar.f36993u1.x(j3, document2, str4, uxVar.f40181c);
                    return;
                }
                return;
            }
            lyVar.E2 = SystemClock.elapsedRealtime();
            lyVar.N(true);
            if (str != null) {
                str2 = str;
            } else {
                str2 = (String) uxVar.getTag();
            }
            new SpannableStringBuilder().append((CharSequence) str2);
            if (str == null) {
                if (!uxVar.f40181c && (str3 = (String) org.telegram.messenger.j6.f24527j.get(str2)) != null) {
                    str2 = g(str2, str3);
                }
                lyVar.h(str2);
                mx mxVar2 = lyVar.f36993u1;
                if (mxVar2 != null) {
                    mxVar2.l(org.telegram.messenger.j6.c(str2));
                    return;
                }
                return;
            }
            mx mxVar3 = lyVar.f36993u1;
            if (mxVar3 != null) {
                mxVar3.l(org.telegram.messenger.j6.c(str));
            }
        }
    }

    public static void e(ly lyVar, int i7, int i10) {
        v4.e1 K;
        int[] iArr = lyVar.R0;
        if (i7 == 1) {
            lyVar.n(i10, lyVar.Q);
            return;
        }
        mx mxVar = lyVar.f36993u1;
        if ((mxVar == null || !mxVar.z()) && !lyVar.K0) {
            uj0 x10 = lyVar.x(i7);
            if (i10 > 0 && x10 != null && x10.getVisibility() == 0 && (K = x10.K(0)) != null && K.f58535a.getTop() + lyVar.f36938c1 >= x10.getPaddingTop()) {
                return;
            }
            int i11 = iArr[i7] - i10;
            iArr[i7] = i11;
            if (i11 > 0) {
                iArr[i7] = 0;
            } else if (i11 < (-org.telegram.messenger.g0.L(288.0f))) {
                iArr[i7] = -org.telegram.messenger.g0.L(288.0f);
            }
            if (i7 == 0) {
                lyVar.Z();
            } else {
                lyVar.y(i7).setTranslationY(Math.max(-org.telegram.messenger.g0.L(48.0f), iArr[i7]));
            }
        }
    }

    public static void f(ly lyVar, boolean z10) {
        int N0;
        rx rxVar = lyVar.f36959j0;
        sv svVar = lyVar.f36975p0;
        qv qvVar = lyVar.f36956i0;
        if (qvVar != null && (qvVar.getAdapter() instanceof qx)) {
            qx qxVar = (qx) qvVar.getAdapter();
            if (!qxVar.f38787s && qxVar.h == 0 && !qxVar.f38790y.isEmpty() && (N0 = rxVar.N0()) != -1 && N0 > rxVar.B() - 5) {
                String str = qxVar.f38789x;
                String str2 = qxVar.f38786r;
                boolean z11 = qxVar.f38788w;
                qxVar.F(str, str2, true, z11, z11);
            }
        }
        mx mxVar = lyVar.f36993u1;
        if (mxVar != null && mxVar.z()) {
            boolean z12 = false;
            v4.e1 K = qvVar.K(0);
            if (K == null) {
                yx.a(svVar, true, !z10);
                return;
            }
            if (K.f58535a.getTop() < qvVar.getPaddingTop()) {
                z12 = true;
            }
            yx.a(svVar, z12, !z10);
        } else if (svVar != null && qvVar != null) {
            svVar.f42173a.a(true, !z10);
        }
    }

    public static String g(String str, String str2) {
        String str3;
        String str4;
        boolean z10 = true;
        if (org.telegram.messenger.h4.c(str) != null) {
            if (org.telegram.messenger.h4.c(str) == null) {
                return str;
            }
            if (str2 == null) {
                return "🤝";
            }
            if (str2.contains("\u200d")) {
                String[] split = str2.split("\u200d");
                StringBuilder sb2 = new StringBuilder("🫱");
                String str5 = "";
                if (split.length < 1) {
                    str4 = "";
                } else {
                    str4 = split[0];
                }
                sb2.append(str4);
                sb2.append("\u200d🫲");
                if (split.length >= 2) {
                    str5 = split[1];
                }
                sb2.append(str5);
                return sb2.toString();
            }
            return "🤝".concat(str2);
        }
        if (org.telegram.messenger.j6.b(str)) {
            str = com.google.android.gms.internal.vision.e2.k(str, 2, 0);
        } else {
            z10 = false;
        }
        int length = str.length();
        if (length > 2 && str.charAt(str.length() - 2) == 8205) {
            str3 = str.substring(str.length() - 2);
            str = com.google.android.gms.internal.vision.e2.k(str, 2, 0);
        } else if (length > 3 && str.charAt(str.length() - 3) == 8205) {
            str3 = str.substring(str.length() - 3);
            str = com.google.android.gms.internal.vision.e2.k(str, 3, 0);
        } else {
            str3 = null;
        }
        String v = r.b.v(str, str2);
        if (str3 != null) {
            v = r.b.v(v, str3);
        }
        if (z10) {
            return r.b.v(v, "\u200d➡");
        }
        return v;
    }

    public static void j(int i7, View view) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i7);
    }

    public final void A() {
        yv yvVar = this.H0;
        if (yvVar != null) {
            yvVar.b();
        }
        sv svVar = this.f36975p0;
        if (svVar != null) {
            svVar.b();
        }
        nv nvVar = this.W;
        if (nvVar != null) {
            nvVar.b();
        }
    }

    public final void B() {
        xi.e eVar = this.N2;
        if (eVar != null) {
            eVar.b();
            this.N2 = null;
        }
        xi.e eVar2 = this.O2;
        if (eVar2 != null) {
            eVar2.b();
            this.O2 = null;
            this.P2 = false;
        }
    }

    public final void C(boolean z10, boolean z11) {
        xx xxVar;
        boolean z12;
        if (this.B1 != 0 && this.f37004x1) {
            this.B1 = 0;
        }
        if (this.B1 == 0 && this.f37000w1) {
            this.B1 = 1;
        }
        int i7 = this.B1;
        bw bwVar = this.h;
        if (i7 != 0 && !z10 && this.f36942e.size() != 1) {
            int i10 = this.B1;
            if (i10 == 1) {
                M(false, false);
                if (!this.f36995v0 && !this.f36999w0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                R(z12, false);
                if (bwVar.getCurrentItem() != 2) {
                    bwVar.x(2, false);
                }
                zv zvVar = this.C0;
                if (zvVar != null) {
                    this.T0 = true;
                    int i11 = this.H1;
                    if (i11 >= 0) {
                        zvVar.m(i11);
                    } else {
                        int i12 = this.G1;
                        if (i12 >= 0) {
                            zvVar.m(i12);
                        } else {
                            zvVar.m(this.F1);
                        }
                    }
                    this.T0 = false;
                    this.F0.h1(0, 0);
                }
            } else if (i10 == 2) {
                M(false, false);
                R(false, false);
                if (bwVar.getCurrentItem() != 1) {
                    bwVar.x(1, false);
                }
                tw twVar = this.f36978q0;
                if (twVar != null) {
                    twVar.m(0);
                }
                sv svVar = this.f36975p0;
                if (svVar != null && (xxVar = svVar.f42179r) != null) {
                    xxVar.I1(null);
                }
            }
        } else {
            M(true, false);
            R(false, false);
            if (bwVar.getCurrentItem() != 0) {
                bwVar.x(0, !z10);
            }
            if (z11) {
                org.telegram.messenger.g0.i3(new hv(this, 5), 350L);
            }
        }
        N(true);
    }

    public final void D() {
        dy dyVar = this.f37010z0;
        if (dyVar != null) {
            dyVar.f();
        }
        gy gyVar = this.A0;
        if (gyVar != null) {
            gyVar.f();
        }
        if (org.telegram.ui.ns.p().E) {
            org.telegram.ui.ns.p().m();
        }
        org.telegram.ui.ns.p().t();
    }

    public final void F(int i7) {
        mx mxVar = this.f36993u1;
        if ((mxVar != null && mxVar.z()) || i7 == 0) {
            return;
        }
        HorizontalScrollView y10 = y(i7);
        this.R0[i7] = 0;
        y10.setTranslationY(0);
    }

    @Override
    public final void G(int i7, float f10, float f11, te.c cVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 4;
        if (i7 == 0) {
            q(false);
            float f12 = 1.0f - this.f36928a.f57081e;
            yv yvVar = this.H0;
            yvVar.setAlpha(f12);
            if (f12 > 0.0f) {
                i12 = 0;
            } else {
                i12 = 4;
            }
            yvVar.setVisibility(i12);
            float f13 = 1.0f - f12;
            ph.c cVar2 = this.I0;
            cVar2.setAlpha(f13);
            cVar2.setTranslationY((-org.telegram.messenger.g0.L(15.0f)) * f12);
            int i15 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
            if (i15 > 0) {
                i13 = 0;
            } else {
                i13 = 4;
            }
            cVar2.setVisibility(i13);
            org.telegram.ui.w61 w61Var = this.N;
            w61Var.setAlpha(f13);
            w61Var.setTranslationY(org.telegram.messenger.g0.L(30.0f) * f12);
            if (i15 > 0) {
                i14 = 0;
            }
            w61Var.setVisibility(i14);
            S();
            this.f37007y0.invalidate();
        } else if (i7 == 1) {
            l(false);
            float f14 = 1.0f - this.f36932b.f57081e;
            nv nvVar = this.W;
            nvVar.setAlpha(f14);
            if (f14 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            nvVar.setVisibility(i10);
            float f15 = 1.0f - f14;
            ph.c cVar3 = this.V;
            cVar3.setAlpha(f15);
            cVar3.setTranslationY((-org.telegram.messenger.g0.L(15.0f)) * f14);
            int i16 = (f15 > 0.0f ? 1 : (f15 == 0.0f ? 0 : -1));
            if (i16 > 0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            cVar3.setVisibility(i11);
            org.telegram.ui.w61 w61Var2 = this.L;
            w61Var2.setAlpha(f15);
            w61Var2.setTranslationY(org.telegram.messenger.g0.L(30.0f) * f14);
            if (i16 > 0) {
                i14 = 0;
            }
            w61Var2.setVisibility(i14);
            S();
            this.K.invalidate();
        }
    }

    public final void H(int i7, int i10) {
        mw mwVar = this.R;
        View m10 = mwVar.m(i7);
        int L0 = mwVar.L0();
        int i11 = 1;
        if ((m10 == null && Math.abs(i7 - L0) > mwVar.J * 9.0f) || !org.telegram.messenger.gz.c()) {
            if (mwVar.L0() < i7) {
                i11 = 0;
            }
            wi0 wi0Var = this.f36937c0;
            wi0Var.f41354b = i11;
            wi0Var.d(i7, i10, false, false);
            return;
        }
        this.K0 = true;
        hi.l1 l1Var = new hi.l1(1, this.Q.getContext(), this);
        l1Var.f58480a = i7;
        l1Var.f55123p = i10;
        mwVar.w0(l1Var);
    }

    public final void I(int i7, int i10) {
        wv wvVar = this.F0;
        View m10 = wvVar.m(i7);
        int L0 = wvVar.L0();
        int i11 = 1;
        if (m10 == null && Math.abs(i7 - L0) > 40) {
            if (wvVar.L0() < i7) {
                i11 = 0;
            }
            wi0 wi0Var = this.f36933b0;
            wi0Var.f41354b = i11;
            wi0Var.d(i7, i10, false, false);
            return;
        }
        this.K0 = true;
        this.E0.y0(i7);
    }

    public final void J(boolean z10, boolean z11, boolean z12, boolean z13) {
        ArrayList arrayList = this.f36942e;
        arrayList.clear();
        boolean z14 = false;
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i7 >= arrayList2.size()) {
                break;
            }
            if (((hy) arrayList2.get(i7)).f35368a == 0 && z10) {
                arrayList.add((hy) arrayList2.get(i7));
            }
            if (((hy) arrayList2.get(i7)).f35368a == 1 && z12) {
                arrayList.add((hy) arrayList2.get(i7));
            }
            if (((hy) arrayList2.get(i7)).f35368a == 2 && z11) {
                arrayList.add((hy) arrayList2.get(i7));
            }
            i7++;
        }
        qb0 qb0Var = this.f37002x;
        if (qb0Var != null) {
            if (arrayList.size() > 1) {
                z14 = true;
            }
            org.telegram.messenger.g0.Y3(qb0Var, z14, 1.0f, true, z13);
        }
        bw bwVar = this.h;
        if (bwVar != null) {
            bwVar.setAdapter(null);
            bwVar.setAdapter(this.M0);
            if (qb0Var != null) {
                qb0Var.setViewPager(bwVar);
            }
        }
    }

    public final void K(final ph.a aVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z10, boolean z11) {
        String G;
        gy gyVar;
        lx lxVar;
        if (stickerSet != null) {
            if (!z10 || (lxVar = this.T) == null || lxVar.d == stickerSet.f28078id) {
                if (!z10 && (gyVar = this.A0) != null && gyVar.d != stickerSet.f28078id) {
                    return;
                }
                final boolean B0 = org.telegram.messenger.si.b0(this.f36941d1).B0(stickerSet.f28078id, true);
                if (B0) {
                    if (stickerSet.masks) {
                        G = org.telegram.messenger.hd.G(stickerSet.count, "RemoveManyMasksCount", new Object[0]);
                    } else if (stickerSet.emojis) {
                        G = org.telegram.messenger.hd.G(stickerSet.count, "RemoveManyEmojiCount", new Object[0]);
                    } else {
                        G = org.telegram.messenger.hd.G(stickerSet.count, "RemoveManyStickersCount", new Object[0]);
                    }
                } else if (stickerSet.masks) {
                    G = org.telegram.messenger.hd.G(stickerSet.count, "AddManyMasksCount", new Object[0]);
                } else if (stickerSet.emojis) {
                    G = org.telegram.messenger.hd.G(stickerSet.count, "AddManyEmojiCount", new Object[0]);
                } else {
                    G = org.telegram.messenger.hd.G(stickerSet.count, "AddManyStickersCount", new Object[0]);
                }
                aVar.i(G, z11, true);
                aVar.f55051l0.a(!B0, z11);
                aVar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        int i7;
                        ly lyVar = ly.this;
                        org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(lyVar.f36941d1);
                        Context context = lyVar.getContext();
                        if (B0) {
                            i7 = 0;
                        } else {
                            i7 = 2;
                        }
                        int i10 = i7;
                        org.telegram.ui.ActionBar.e2 e2Var = lyVar.Z1;
                        FrameLayout frameLayout = lyVar.f36985s;
                        ph.a aVar2 = aVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        b02.g2(context, tLObject2, document2, i10, e2Var, frameLayout, false, true, new di.m3(lyVar, aVar2, tLObject2, stickerSet2, document2, z12), false);
                        lyVar.K(aVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    public final void L(long j3, boolean z10, boolean z11) {
        int i7;
        View childAt;
        float f10;
        qb0 qb0Var = this.f37002x;
        if (qb0Var != null) {
            this.f37000w1 = z10;
            this.f37004x1 = z11;
            if (!z11 && !z10) {
                this.f36996v1 = 0L;
            } else {
                this.f36996v1 = j3;
            }
            if (z11) {
                i7 = 2;
            } else {
                i7 = 0;
            }
            LinearLayout linearLayout = qb0Var.d;
            if (i7 >= linearLayout.getChildCount()) {
                childAt = null;
            } else {
                childAt = linearLayout.getChildAt(i7);
            }
            if (childAt != null) {
                if (this.f36996v1 != 0) {
                    f10 = 0.15f;
                } else {
                    f10 = 1.0f;
                }
                childAt.setAlpha(f10);
                bw bwVar = this.h;
                if (z11) {
                    if (this.f36996v1 != 0 && bwVar.getCurrentItem() != 0) {
                        M(true, true);
                        R(false, true);
                        bwVar.x(0, false);
                    }
                } else if (this.f36996v1 != 0 && bwVar.getCurrentItem() != 1) {
                    M(false, true);
                    R(false, true);
                    bwVar.x(1, false);
                }
            }
        }
    }

    public final void M(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        cw cwVar = this.f37006y;
        if (!z10 || cwVar.getTag() != null) {
            if ((!z10 && cwVar.getTag() != null) || this.f36977p2) {
                return;
            }
            AnimatorSet animatorSet = this.G;
            Integer num = null;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.G = null;
            }
            if (!z10) {
                num = 1;
            }
            cwVar.setTag(num);
            int i7 = 0;
            float f14 = 0.0f;
            if (z11) {
                if (z10) {
                    cwVar.setVisibility(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.G = animatorSet2;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cwVar, View.ALPHA, f12);
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cwVar, View.SCALE_X, f13);
                if (z10) {
                    f14 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cwVar, View.SCALE_Y, f14));
                this.G.setDuration(200L);
                this.G.setInterpolator(er.f34421g);
                this.G.addListener(new iw(this, z10, 0));
                this.G.start();
                return;
            }
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            cwVar.setAlpha(f10);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            cwVar.setScaleX(f11);
            if (z10) {
                f14 = 1.0f;
            }
            cwVar.setScaleY(f14);
            if (!z10) {
                i7 = 4;
            }
            cwVar.setVisibility(i7);
        }
    }

    public final void N(boolean z10) {
        Integer num;
        this.I = 0.0f;
        mx mxVar = this.f36993u1;
        if (mxVar != null && mxVar.z()) {
            z10 = false;
        }
        FrameLayout frameLayout = this.f36969n;
        if (!z10 || frameLayout.getTag() != null) {
            if (!z10 && frameLayout.getTag() != null) {
                return;
            }
            if (z10) {
                num = null;
            } else {
                num = 1;
            }
            frameLayout.setTag(num);
            this.F2.a(z10, true);
        }
    }

    public final void O(boolean z10, boolean z11) {
        View view = this.P;
        if (!z10 || view.getTag() != null) {
            if (!z10 && view.getTag() != null) {
                return;
            }
            AnimatorSet animatorSet = this.f36929a0;
            Integer num = null;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f36929a0 = null;
            }
            if (!z10) {
                num = 1;
            }
            view.setTag(num);
            float f10 = 0.0f;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f36929a0 = animatorSet2;
                if (z10) {
                    f10 = 1.0f;
                }
                animatorSet2.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, f10));
                this.f36929a0.setDuration(200L);
                this.f36929a0.setInterpolator(er.f34421g);
                this.f36929a0.addListener(new x5(this, 24));
                this.f36929a0.start();
                return;
            }
            if (z10) {
                f10 = 1.0f;
            }
            view.setAlpha(f10);
        }
    }

    public final void P(boolean z10) {
        for (int i7 = 0; i7 < 3; i7++) {
            v4.s w10 = w(i7);
            int L0 = w10.L0();
            if (z10) {
                if (L0 == 1 || L0 == 2) {
                    w10.n0(0);
                    F(i7);
                }
            } else if (L0 == 0) {
                w10.h1(0, 0);
            }
        }
    }

    public final void Q(boolean z10, boolean z11, boolean z12) {
        float f10;
        float translationY;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.Chat M0 = org.telegram.messenger.np.s1(this.f36941d1).M0(Long.valueOf(this.f36996v1));
        if (M0 != null) {
            di.ub ubVar = this.O0;
            if (z10) {
                if (!org.telegram.messenger.t3.N(M0) && (tL_chatBannedRights = M0.default_banned_rights) != null && (tL_chatBannedRights.send_stickers || (z11 && tL_chatBannedRights.send_plain))) {
                    org.telegram.ui.ActionBar.e2 e2Var = this.Z1;
                    if (!(e2Var instanceof org.telegram.ui.an) || !((org.telegram.ui.an) e2Var).Z6()) {
                        if (z11) {
                            ubVar.setText(org.telegram.messenger.hd.M0(2131749546, null));
                        } else if (z12) {
                            ubVar.setText(org.telegram.messenger.hd.M0(2131749545, null));
                        } else {
                            ubVar.setText(org.telegram.messenger.hd.M0(2131749539, null));
                        }
                    } else {
                        return;
                    }
                } else {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = M0.banned_rights;
                    if (tL_chatBannedRights2 == null) {
                        return;
                    }
                    if (org.telegram.messenger.g0.D1(tL_chatBannedRights2)) {
                        if (z11) {
                            ubVar.setText(org.telegram.messenger.hd.M0(2131753943, null));
                        } else if (z12) {
                            ubVar.setText(org.telegram.messenger.hd.M0(2131753969, null));
                        } else {
                            ubVar.setText(org.telegram.messenger.hd.M0(2131753934, null));
                        }
                    } else {
                        if (z11) {
                            ubVar.setText(org.telegram.messenger.hd.a0("AttachPlainRestricted", null, 2131753944, org.telegram.messenger.hd.v(M0.banned_rights.until_date)));
                        }
                        if (z12) {
                            ubVar.setText(org.telegram.messenger.hd.a0("AttachGifRestricted", null, 2131753970, org.telegram.messenger.hd.v(M0.banned_rights.until_date)));
                        } else {
                            ubVar.setText(org.telegram.messenger.hd.a0("AttachStickersRestricted", null, 2131753935, org.telegram.messenger.hd.v(M0.banned_rights.until_date)));
                        }
                    }
                }
                ubVar.setVisibility(0);
            }
            AnimatorSet animatorSet = this.Q2;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.Q2 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.Q2 = animatorSet2;
            float f11 = 1.0f;
            if (z10) {
                f10 = ubVar.getAlpha();
            } else {
                f10 = 1.0f;
            }
            float f12 = 0.0f;
            if (!z10) {
                f11 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ubVar, View.ALPHA, f10, f11);
            if (z10) {
                translationY = org.telegram.messenger.g0.L(12.0f);
            } else {
                translationY = ubVar.getTranslationY();
            }
            if (!z10) {
                f12 = org.telegram.messenger.g0.L(12.0f);
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(ubVar, View.TRANSLATION_Y, translationY, f12));
            h2.m0 m0Var = this.R2;
            if (m0Var != null) {
                org.telegram.messenger.g0.r(m0Var);
            }
            if (z10) {
                h2.m0 m0Var2 = new h2.m0(this, z11, z12, 4);
                this.R2 = m0Var2;
                org.telegram.messenger.g0.i3(m0Var2, 3500L);
            }
            this.Q2.setDuration(320L);
            this.Q2.setInterpolator(er.h);
            this.Q2.start();
        }
    }

    public final void R(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        ImageView imageView = this.E;
        if (imageView != null && !this.f36980q2) {
            if (!z10 || imageView.getTag() != null) {
                if (z10 || imageView.getTag() == null) {
                    AnimatorSet animatorSet = this.H;
                    Integer num = null;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.H = null;
                    }
                    if (!z10) {
                        num = 1;
                    }
                    imageView.setTag(num);
                    int i7 = 0;
                    float f14 = 0.0f;
                    if (z11) {
                        if (z10) {
                            imageView.setVisibility(0);
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.H = animatorSet2;
                        if (z10) {
                            f12 = 1.0f;
                        } else {
                            f12 = 0.0f;
                        }
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, View.ALPHA, f12);
                        if (z10) {
                            f13 = 1.0f;
                        } else {
                            f13 = 0.0f;
                        }
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, View.SCALE_X, f13);
                        if (z10) {
                            f14 = 1.0f;
                        }
                        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(imageView, View.SCALE_Y, f14));
                        this.H.setDuration(200L);
                        this.H.setInterpolator(er.f34421g);
                        this.H.addListener(new iw(this, z10, 1));
                        this.H.start();
                        return;
                    }
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    imageView.setAlpha(f10);
                    if (z10) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    imageView.setScaleX(f11);
                    if (z10) {
                        f14 = 1.0f;
                    }
                    imageView.setScaleY(f14);
                    if (!z10) {
                        i7 = 4;
                    }
                    imageView.setVisibility(i7);
                }
            }
        }
    }

    public final void S() {
        int measuredHeight;
        int L;
        org.telegram.ui.ActionBar.e2 e2Var;
        View view = (View) getParent();
        if (view != null) {
            float y10 = getY();
            if (getLayoutParams().height > 0) {
                measuredHeight = getLayoutParams().height;
            } else {
                measuredHeight = getMeasuredHeight();
            }
            float f10 = y10 + measuredHeight;
            if ((!org.telegram.messenger.g0.E && ((e2Var = this.Z1) == null || !e2Var.isInBubbleMode())) || this.W0) {
                L = view.getHeight();
            } else {
                L = org.telegram.messenger.g0.L(1.0f);
            }
            float f11 = f10 - L;
            int i7 = (this.f36988s2 > 0.0f ? 1 : (this.f36988s2 == 0.0f ? 0 : -1));
            FrameLayout frameLayout = this.f36969n;
            if (i7 >= 0) {
                f11 += getMeasuredHeight() - this.f36988s2;
            } else if (frameLayout.getTop() - f11 < 0.0f || !this.f37009y2) {
                f11 = 0.0f;
            }
            float W1 = (-f11) + org.telegram.messenger.g0.W1(this.F2.f57081e, org.telegram.messenger.g0.L(50.0f), -this.f36984r2);
            frameLayout.setTranslationY(W1);
            if (this.f36943e0) {
                this.f36981r.setTranslationY(W1);
            }
        }
    }

    public final void T() {
        yx yxVar;
        boolean z10;
        int z11;
        boolean z12;
        int z13;
        int z14;
        int z15;
        int z16;
        int z17;
        int z18;
        int z19;
        int z20;
        cv cvVar;
        int z21;
        int z22;
        int z23;
        int z24;
        int z25;
        int z26;
        boolean z27 = this.f36995v0;
        View view = this.f36998w;
        if (!z27) {
            setBackground(null);
            view.setBackground(null);
        } else if (!org.telegram.messenger.g0.E && !this.O1) {
            int i7 = org.telegram.ui.ActionBar.j6.f29269zf;
            setBackgroundColor(z(i7));
            if (this.f36943e0) {
                view.setBackgroundColor(z(i7));
            }
        } else {
            Drawable background = getBackground();
            int z28 = z(org.telegram.ui.ActionBar.j6.f29269zf);
            if (background != null && (background != this.H2 || z28 != this.I2)) {
                this.H2 = background;
                this.I2 = z28;
                background.setColorFilter(new PorterDuffColorFilter(z28, PorterDuff.Mode.MULTIPLY));
            }
        }
        qw qwVar = this.J;
        if (qwVar != null) {
            if (this.f36995v0) {
                qwVar.setBackgroundColor(z(org.telegram.ui.ActionBar.j6.f29269zf));
                this.P.setBackgroundColor(z(org.telegram.ui.ActionBar.j6.Cf));
            } else {
                qwVar.setBackground(null);
            }
        }
        du duVar = this.C1;
        if (duVar != null) {
            duVar.f34069c.a();
        }
        int i10 = 0;
        while (true) {
            yxVar = this.W;
            z10 = this.f36961j2;
            if (i10 >= 3) {
                break;
            }
            if (i10 == 0) {
                yxVar = this.H0;
            } else if (i10 != 1) {
                yxVar = this.f36975p0;
            }
            if (yxVar != null) {
                zp zpVar = yxVar.d;
                FrameLayout frameLayout = yxVar.f42178n;
                View view2 = yxVar.f42177f;
                if (this.f36995v0) {
                    view2.setBackgroundColor(z(org.telegram.ui.ActionBar.j6.f29269zf));
                } else {
                    view2.setBackground(null);
                }
                yxVar.f42176e.setBackgroundColor(z(org.telegram.ui.ActionBar.j6.Cf));
                kl0 kl0Var = yxVar.f42175c;
                if (z10) {
                    z23 = v(0.4f);
                } else {
                    z23 = z(org.telegram.ui.ActionBar.j6.Bf);
                }
                kl0Var.a(z23);
                Drawable background2 = frameLayout.getBackground();
                if (z10) {
                    z24 = v(0.06f);
                } else {
                    z24 = z(org.telegram.ui.ActionBar.j6.Af);
                }
                org.telegram.ui.ActionBar.j6.C1(z24, background2);
                frameLayout.invalidate();
                if (z10) {
                    z25 = v(0.45f);
                } else {
                    z25 = z(org.telegram.ui.ActionBar.j6.Bf);
                }
                zpVar.setHintTextColor(z25);
                if (z10) {
                    z26 = v(0.8f);
                } else {
                    z26 = z(org.telegram.ui.ActionBar.j6.G6);
                }
                zpVar.setTextColor(z26);
            }
            i10++;
        }
        Paint paint = this.f36990t1;
        if (paint != null) {
            paint.setColor(z(org.telegram.ui.ActionBar.j6.Sf));
        }
        yw ywVar = this.Q;
        if (ywVar != null) {
            ywVar.setGlowColor(z(org.telegram.ui.ActionBar.j6.f29269zf));
        }
        vv vvVar = this.E0;
        if (vvVar != null) {
            vvVar.setGlowColor(z(org.telegram.ui.ActionBar.j6.f29269zf));
        }
        zv zvVar = this.C0;
        if (zvVar != null) {
            zvVar.setIndicatorColor(z(org.telegram.ui.ActionBar.j6.If));
            zvVar.setUnderlineColor(z(org.telegram.ui.ActionBar.j6.Cf));
            if (this.f36995v0) {
                zvVar.setBackgroundColor(z(org.telegram.ui.ActionBar.j6.f29269zf));
            } else {
                zvVar.setBackground(null);
            }
        }
        tw twVar = this.f36978q0;
        if (twVar != null) {
            twVar.setIndicatorColor(z(org.telegram.ui.ActionBar.j6.If));
            twVar.setUnderlineColor(z(org.telegram.ui.ActionBar.j6.Cf));
            if (this.f36995v0) {
                twVar.setBackgroundColor(z(org.telegram.ui.ActionBar.j6.f29269zf));
            } else {
                twVar.setBackground(null);
            }
        }
        if (z10) {
            z11 = v(0.6f);
        } else {
            z11 = z(org.telegram.ui.ActionBar.j6.Jf);
        }
        if (z11 != this.J2) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.J2 = z11;
        cw cwVar = this.f37006y;
        if (cwVar != null) {
            if (z12) {
                cwVar.setColorFilter(new PorterDuffColorFilter(z11, PorterDuff.Mode.MULTIPLY));
            }
            if (yxVar == null) {
                Drawable background3 = cwVar.getBackground();
                int i11 = org.telegram.ui.ActionBar.j6.f29269zf;
                org.telegram.ui.ActionBar.j6.H1(background3, z(i11), false);
                org.telegram.ui.ActionBar.j6.H1(cwVar.getBackground(), z(i11), true);
            }
        }
        ImageView imageView = this.E;
        if (imageView != null && z12) {
            imageView.setColorFilter(new PorterDuffColorFilter(z11, PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.F;
        if (imageView2 != null && z12) {
            imageView2.setColorFilter(new PorterDuffColorFilter(z11, PorterDuff.Mode.MULTIPLY));
        }
        di.ub ubVar = this.O0;
        if (ubVar != null) {
            if (ubVar.getBackground() instanceof ShapeDrawable) {
                ((ShapeDrawable) ubVar.getBackground()).getPaint().setColor(z(org.telegram.ui.ActionBar.j6.hg));
                ubVar.invalidate();
            }
            ubVar.setTextColor(z(org.telegram.ui.ActionBar.j6.f28914gg));
        }
        qx qxVar = this.f36962k0;
        if (qxVar != null) {
            sx sxVar = qxVar.f38783e;
            int i12 = org.telegram.ui.ActionBar.j6.Df;
            int z29 = z(i12);
            if (z29 != this.K2) {
                this.K2 = z29;
                sxVar.f39445a.setColorFilter(new PorterDuffColorFilter(z29, PorterDuff.Mode.MULTIPLY));
            }
            sxVar.f39446b.setTextColor(z(i12));
            sxVar.f39447c.setProgressColor(z(org.telegram.ui.ActionBar.j6.f28923h6));
        }
        int z30 = z(org.telegram.ui.ActionBar.j6.Fi);
        if (this.f36949f2 == null || z30 != this.L2) {
            this.L2 = z30;
            this.f36949f2 = new PorterDuffColorFilter(z30, PorterDuff.Mode.SRC_IN);
        }
        int i13 = 0;
        while (true) {
            Drawable[] drawableArr = this.Y0;
            if (i13 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i13];
            if (z10) {
                z21 = v(0.4f);
            } else {
                z21 = z(org.telegram.ui.ActionBar.j6.Ff);
            }
            org.telegram.ui.ActionBar.j6.E1(drawable, z21, false);
            Drawable drawable2 = drawableArr[i13];
            if (z10) {
                z22 = v(0.8f);
            } else {
                z22 = z(org.telegram.ui.ActionBar.j6.Gf);
            }
            org.telegram.ui.ActionBar.j6.E1(drawable2, z22, true);
            i13++;
        }
        if (qwVar != null && (cvVar = qwVar.E) != null) {
            cvVar.d();
        }
        int i14 = 0;
        while (true) {
            Drawable[] drawableArr2 = this.Z0;
            if (i14 >= drawableArr2.length) {
                break;
            }
            Drawable drawable3 = drawableArr2[i14];
            if (z10) {
                z19 = v(0.4f);
            } else {
                z19 = z(org.telegram.ui.ActionBar.j6.Ef);
            }
            org.telegram.ui.ActionBar.j6.E1(drawable3, z19, false);
            Drawable drawable4 = drawableArr2[i14];
            if (z10) {
                z20 = v(0.8f);
            } else {
                z20 = z(org.telegram.ui.ActionBar.j6.Gf);
            }
            org.telegram.ui.ActionBar.j6.E1(drawable4, z20, true);
            i14++;
        }
        int i15 = 0;
        while (true) {
            Drawable[] drawableArr3 = this.f36930a1;
            if (i15 >= drawableArr3.length) {
                break;
            }
            Drawable drawable5 = drawableArr3[i15];
            if (z10) {
                z17 = v(0.4f);
            } else {
                z17 = z(org.telegram.ui.ActionBar.j6.Ef);
            }
            org.telegram.ui.ActionBar.j6.E1(drawable5, z17, false);
            Drawable drawable6 = drawableArr3[i15];
            if (z10) {
                z18 = v(0.8f);
            } else {
                z18 = z(org.telegram.ui.ActionBar.j6.Gf);
            }
            org.telegram.ui.ActionBar.j6.E1(drawable6, z18, true);
            i15++;
        }
        org.telegram.ui.ActionBar.t5 t5Var = this.f36935b2;
        if (t5Var != null) {
            if (z10) {
                z15 = v(0.4f);
            } else {
                z15 = z(org.telegram.ui.ActionBar.j6.Ff);
            }
            org.telegram.ui.ActionBar.j6.E1(t5Var, z15, false);
            if (z10) {
                z16 = v(0.8f);
            } else {
                z16 = z(org.telegram.ui.ActionBar.j6.Gf);
            }
            org.telegram.ui.ActionBar.j6.E1(t5Var, z16, true);
        }
        org.telegram.ui.ActionBar.t5 t5Var2 = this.f36939c2;
        if (t5Var2 != null) {
            if (z10) {
                z13 = v(0.4f);
            } else {
                z13 = z(org.telegram.ui.ActionBar.j6.If);
            }
            org.telegram.ui.ActionBar.j6.E1(t5Var2, z13, false);
            if (z10) {
                z14 = v(0.8f);
            } else {
                z14 = z(org.telegram.ui.ActionBar.j6.If);
            }
            org.telegram.ui.ActionBar.j6.E1(t5Var2, z14, true);
        }
    }

    public final void U() {
        yw ywVar = this.Q;
        if (ywVar != null) {
            for (int i7 = 0; i7 < ywVar.getChildCount(); i7++) {
                View childAt = ywVar.getChildAt(i7);
                if (childAt instanceof dx) {
                    ((dx) childAt).a(true);
                }
            }
        }
    }

    public final void V(int i7) {
        int i10;
        if (!this.f36950g0) {
            int i11 = -1;
            if (i7 != -1) {
                int size = getRecentEmoji().size() + (this.f36943e0 ? 1 : 0);
                vw vwVar = this.S;
                int i12 = vwVar.f41162c;
                ArrayList arrayList = vwVar.f41170y;
                int i13 = 0;
                if (i12 >= 0) {
                    i10 = 3;
                } else {
                    i10 = 0;
                }
                int i14 = size + i10;
                if (i7 >= i14) {
                    int i15 = 0;
                    while (true) {
                        String[][] strArr = org.telegram.messenger.k6.f24643f;
                        if (i15 >= 8) {
                            break;
                        }
                        i14 += strArr[i15].length + 1;
                        if (i7 < i14) {
                            i11 = i15 + 1;
                            break;
                        }
                        i15++;
                    }
                    if (i11 < 0) {
                        ArrayList<zw> emojipacks = getEmojipacks();
                        int size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 < 0) {
                                break;
                            } else if (((Integer) arrayList.get(size2)).intValue() <= i7) {
                                zw zwVar = (zw) this.f36983r1.get(size2);
                                while (i13 < emojipacks.size()) {
                                    long j3 = emojipacks.get(i13).f42431b.f28078id;
                                    long j10 = zwVar.f42431b.f28078id;
                                    if (j3 == j10 && (!zwVar.f42435g || (!zwVar.f42434f && !this.f36979q1.contains(Long.valueOf(j10))))) {
                                        char[] cArr = org.telegram.messenger.k6.f24639a;
                                        i13 = 9 + i13;
                                        break;
                                    }
                                    i13++;
                                }
                            } else {
                                size2--;
                            }
                        }
                    }
                    i13 = i11;
                }
                if (i13 >= 0) {
                    this.J.j(i13, true);
                }
            }
        }
    }

    public final void W() {
        boolean z10;
        boolean z11;
        int i7;
        xx xxVar;
        int i10;
        boolean z12;
        boolean z13;
        tw twVar = this.f36978q0;
        int currentPosition = twVar.getCurrentPosition();
        int i11 = this.f36986s0;
        if (currentPosition == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean isEmpty = this.f36960j1.isEmpty();
        twVar.d(false);
        this.f36986s0 = -2;
        this.f36989t0 = -2;
        this.f36992u0 = -2;
        Drawable[] drawableArr = this.f36930a1;
        if (!isEmpty) {
            this.f36986s0 = 0;
            twVar.b(0, drawableArr[0]).setContentDescription(org.telegram.messenger.hd.M0(2131746364, null));
            i7 = 1;
        } else {
            i7 = 0;
        }
        this.f36989t0 = i7;
        twVar.b(1, drawableArr[1]).setContentDescription(org.telegram.messenger.hd.M0(2131750834, null));
        this.f36992u0 = i7 + 1;
        org.telegram.messenger.g0.L(13.0f);
        org.telegram.messenger.g0.L(11.0f);
        int i12 = this.f36941d1;
        ArrayList arrayList = org.telegram.messenger.np.s1(i12).f25249c4;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            String str = (String) arrayList.get(i13);
            org.telegram.messenger.f6 g10 = org.telegram.messenger.j6.g(str);
            if (g10 != null) {
                TLRPC.Document T = org.telegram.messenger.si.b0(i12).T(str);
                String i14 = i5.c.i(i13 + 3, "tab");
                int i15 = twVar.f41402y;
                twVar.f41402y = i15 + 1;
                hv0 hv0Var = (hv0) twVar.f41390n.get(i14);
                if (hv0Var != null) {
                    twVar.g(i14, hv0Var, i15);
                    i10 = currentPosition;
                    z12 = z11;
                } else {
                    i10 = currentPosition;
                    z12 = z11;
                    hv0Var = new hv0(twVar.getContext(), 2);
                    hv0Var.setFocusable(true);
                    hv0Var.setOnClickListener(new pk0(twVar, 2));
                    hv0Var.setExpanded(twVar.f41384g0);
                    hv0Var.a(twVar.f41387j0);
                    twVar.f41380e.addView(hv0Var, i15);
                }
                hv0Var.d = false;
                hv0Var.setTag(2131296461, Integer.valueOf(i15));
                hv0Var.setTag(2131296591, g10);
                hv0Var.setTag(2131296585, T);
                if (i15 == twVar.E) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                hv0Var.setSelected(z13);
                twVar.h.put(i14, hv0Var);
                hv0Var.setContentDescription(str);
            } else {
                i10 = currentPosition;
                z12 = z11;
            }
            i13++;
            currentPosition = i10;
            z11 = z12;
        }
        int i16 = currentPosition;
        boolean z14 = z11;
        twVar.h();
        twVar.q();
        if (z10 && isEmpty) {
            twVar.m(this.f36989t0);
            sv svVar = this.f36975p0;
            if (svVar != null && (xxVar = svVar.f42179r) != null) {
                xxVar.I1(null);
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = r0.i0.f55671a;
        if (twVar.isLaidOut()) {
            if (!isEmpty && !z14) {
                twVar.k(i16 + 1, 0);
            } else if (isEmpty && z14) {
                twVar.k(i16 - 1, 0);
            }
        }
    }

    public final void X() {
        qx qxVar;
        int size = this.f36960j1.size();
        long n10 = org.telegram.messenger.si.n(Integer.MAX_VALUE, this.f36960j1);
        ArrayList arrayList = new ArrayList(org.telegram.messenger.si.b0(this.f36941d1).f26481j0);
        this.f36960j1 = arrayList;
        long n11 = org.telegram.messenger.si.n(Integer.MAX_VALUE, arrayList);
        if ((this.f36978q0 != null && size == 0 && !this.f36960j1.isEmpty()) || (size != 0 && this.f36960j1.isEmpty())) {
            W();
        }
        if ((size != this.f36960j1.size() || n10 != n11) && (qxVar = this.f36972o0) != null) {
            qxVar.f();
        }
    }

    public final void Y(boolean z10) {
        boolean z11;
        TLRPC.Document document;
        boolean z12;
        int i7;
        boolean z13;
        org.telegram.ui.ActionBar.e6 e6Var;
        boolean z14;
        boolean z15;
        ArrayList<TLRPC.Document> arrayList;
        boolean z16;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet;
        int i10;
        zv zvVar = this.C0;
        if (zvVar != null) {
            org.telegram.ui.z51 z51Var = zvVar.f41380e;
            if (zvVar.f41397s != null) {
                return;
            }
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            this.J1 = -2;
            int i11 = 0;
            this.f36947f0 = false;
            this.F1 = 0;
            int currentPosition = zvVar.getCurrentPosition();
            if (getParent() != null && getVisibility() == 0 && (this.f37011z1.size() != 0 || this.A1.size() != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            zvVar.d(z11);
            int i12 = this.f36941d1;
            org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i12);
            SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(i12).f25289g7;
            ArrayList arrayList3 = this.n1;
            arrayList3.clear();
            ArrayList arrayList4 = b02.f26501t0[0];
            int size = arrayList4.size();
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList4.get(i13);
                if (!b02.B0(stickerSetCovered.set.f28078id, true)) {
                    arrayList3.add(stickerSetCovered);
                }
            }
            jy jyVar = this.G0;
            if (jyVar != null) {
                jyVar.f();
            }
            boolean isEmpty = arrayList4.isEmpty();
            long j3 = 0;
            Drawable[] drawableArr = this.Z0;
            org.telegram.ui.ActionBar.e6 e6Var2 = null;
            if (!isEmpty && (arrayList3.isEmpty() || sharedPreferences.getLong("featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList4.get(0)).set.f28078id)) {
                if (b02.f26505v0[0].isEmpty()) {
                    i10 = 2;
                } else {
                    i10 = 3;
                }
                hv0 c10 = zvVar.c(i10, drawableArr[i10]);
                c10.h.setText(org.telegram.messenger.hd.M0(2131750831, null));
                c10.setContentDescription(org.telegram.messenger.hd.M0(2131750833, null));
                int i14 = this.F1;
                this.I1 = i14;
                this.F1 = i14 + 1;
            }
            if (!this.l1.isEmpty()) {
                int i15 = this.F1;
                this.H1 = i15;
                this.F1 = i15 + 1;
                hv0 c11 = zvVar.c(1, drawableArr[1]);
                c11.h.setText(org.telegram.messenger.hd.M0(2131750838, null));
                c11.setContentDescription(org.telegram.messenger.hd.M0(2131750841, null));
            }
            if (!this.f36963k1.isEmpty()) {
                int i16 = this.F1;
                this.G1 = i16;
                this.F1 = i16 + 1;
                hv0 c12 = zvVar.c(0, drawableArr[0]);
                c12.h.setText(org.telegram.messenger.hd.M0(2131746363, null));
                c12.setContentDescription(org.telegram.messenger.hd.M0(2131746364, null));
            }
            ArrayList arrayList5 = this.f36944e1;
            arrayList5.clear();
            this.f36957i1 = null;
            this.f36951g1 = -1;
            this.f36948f1 = -10;
            if (this.G2 == null || z10) {
                this.G2 = new ArrayList(b02.s0(0));
            }
            ArrayList arrayList6 = this.G2;
            int i17 = 0;
            while (true) {
                TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f37008y1;
                if (i17 >= stickerSetCoveredArr.length) {
                    break;
                }
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCoveredArr[i17];
                long j10 = j3;
                if (stickerSetCovered2 != null) {
                    TLRPC.TL_messages_stickerSet o02 = b02.o0(stickerSetCovered2.set.f28078id);
                    if (o02 != null && (stickerSet = o02.set) != null && !stickerSet.archived) {
                        stickerSetCoveredArr[i17] = null;
                    } else {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = new TLRPC.TL_messages_stickerSet();
                        tL_messages_stickerSet.set = stickerSetCovered2.set;
                        TLRPC.Document document2 = stickerSetCovered2.cover;
                        if (document2 != null) {
                            tL_messages_stickerSet.documents.add(document2);
                        } else if (!stickerSetCovered2.covers.isEmpty()) {
                            tL_messages_stickerSet.documents.addAll(stickerSetCovered2.covers);
                        }
                        if (!tL_messages_stickerSet.documents.isEmpty()) {
                            arrayList5.add(tL_messages_stickerSet);
                        }
                    }
                }
                i17++;
                j3 = j10;
            }
            long j11 = j3;
            ArrayList w02 = org.telegram.messenger.np.s1(i12).w0(arrayList6);
            for (int i18 = 0; i18 < w02.size(); i18++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) w02.get(i18);
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                if ((stickerSet2 == null || !stickerSet2.archived) && (arrayList2 = tL_messages_stickerSet2.documents) != null && !arrayList2.isEmpty()) {
                    arrayList5.add(tL_messages_stickerSet2);
                }
            }
            if (this.K1 != null) {
                long j12 = org.telegram.messenger.np.s1(i12).f25289g7.getLong("group_hide_stickers_" + this.K1.f28052id, -1L);
                TLRPC.Chat M0 = org.telegram.messenger.np.s1(i12).M0(Long.valueOf(this.K1.f28052id));
                if (M0 != null && this.K1.stickerset != null && org.telegram.messenger.t3.N(M0)) {
                    TLRPC.StickerSet stickerSet3 = this.K1.stickerset;
                    if (stickerSet3 != null) {
                        if (j12 == stickerSet3.f28078id) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        this.f36954h1 = z16;
                    }
                } else {
                    if (j12 != -1) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    this.f36954h1 = z15;
                }
                TLRPC.ChatFull chatFull = this.K1;
                TLRPC.StickerSet stickerSet4 = chatFull.stickerset;
                if (stickerSet4 != null) {
                    TLRPC.TL_messages_stickerSet Y = b02.Y(stickerSet4);
                    if (Y != null && (arrayList = Y.documents) != null && !arrayList.isEmpty() && Y.set != null) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = new TLRPC.TL_messages_stickerSet();
                        tL_messages_stickerSet3.documents = Y.documents;
                        tL_messages_stickerSet3.packs = Y.packs;
                        tL_messages_stickerSet3.set = Y.set;
                        if (this.f36954h1) {
                            this.f36948f1 = arrayList5.size();
                            arrayList5.add(tL_messages_stickerSet3);
                        } else {
                            this.f36948f1 = 0;
                            arrayList5.add(0, tL_messages_stickerSet3);
                        }
                        if (!this.K1.can_set_stickers) {
                            tL_messages_stickerSet3 = null;
                        }
                        this.f36957i1 = tL_messages_stickerSet3;
                    }
                } else if (chatFull.can_set_stickers) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                    if (this.f36954h1) {
                        this.f36948f1 = arrayList5.size();
                        arrayList5.add(tL_messages_stickerSet4);
                    } else {
                        this.f36948f1 = 0;
                        arrayList5.add(0, tL_messages_stickerSet4);
                    }
                }
            }
            int i19 = 0;
            while (i19 < arrayList5.size()) {
                if (i19 == this.f36948f1) {
                    TLRPC.Chat M02 = org.telegram.messenger.np.s1(i12).M0(Long.valueOf(this.K1.f28052id));
                    if (M02 == null) {
                        arrayList5.remove(i11);
                        i19--;
                    } else {
                        this.f36947f0 = true;
                        String str = "chat" + M02.f28051id;
                        int i20 = zvVar.f41402y;
                        zvVar.f41402y = i20 + 1;
                        hv0 hv0Var = (hv0) zvVar.f41390n.get(str);
                        if (hv0Var != null) {
                            zvVar.g(str, hv0Var, i20);
                        } else {
                            hv0Var = new hv0(zvVar.getContext(), i11);
                            hv0Var.setFocusable(true);
                            hv0Var.setOnClickListener(new pk0(zvVar, i11));
                            z51Var.addView(hv0Var, i20);
                            hv0Var.f35361x = true;
                            t8 t8Var = new t8(e6Var2);
                            t8Var.u(org.telegram.messenger.g0.L(14.0f));
                            t8Var.q(M02);
                            int i21 = zvVar.f41373a;
                            i9 i9Var = hv0Var.f35355e;
                            i9Var.setLayerNum(i21);
                            i9Var.f(M02, t8Var);
                            i9Var.setAspectFit(true);
                            hv0Var.setExpanded(zvVar.f41384g0);
                            hv0Var.a(zvVar.f41387j0);
                            hv0Var.h.setText(M02.title);
                        }
                        hv0Var.d = true;
                        hv0Var.setTag(2131296461, Integer.valueOf(i20));
                        if (i20 == zvVar.E) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        hv0Var.setSelected(z14);
                        zvVar.h.put(str, hv0Var);
                    }
                    i7 = 0;
                    e6Var = null;
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList5.get(i19);
                    TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet5.set;
                    if (stickerSet5 != null && stickerSet5.thumb_document_id != j11) {
                        for (int i22 = 0; i22 < tL_messages_stickerSet5.documents.size(); i22++) {
                            document = tL_messages_stickerSet5.documents.get(i22);
                            if (document != null && tL_messages_stickerSet5.set.thumb_document_id == document.f28057id) {
                                break;
                            }
                        }
                    }
                    document = null;
                    if (document == null) {
                        z12 = false;
                        document = tL_messages_stickerSet5.documents.get(0);
                    } else {
                        z12 = false;
                    }
                    Object w10 = org.telegram.messenger.w7.w(tL_messages_stickerSet5.set.thumbs, 90, z12, null, z12);
                    if (w10 == null || tL_messages_stickerSet5.set.gifs) {
                        w10 = document;
                    }
                    String str2 = "set" + tL_messages_stickerSet5.set.f28078id;
                    int i23 = zvVar.f41402y;
                    zvVar.f41402y = i23 + 1;
                    hv0 hv0Var2 = (hv0) zvVar.f41390n.get(str2);
                    if (hv0Var2 != null) {
                        zvVar.g(str2, hv0Var2, i23);
                    } else {
                        hv0Var2 = new hv0(zvVar.getContext(), 0);
                        hv0Var2.setFocusable(true);
                        hv0Var2.setOnClickListener(new pk0(zvVar, 1));
                        hv0Var2.setExpanded(zvVar.f41384g0);
                        hv0Var2.a(zvVar.f41387j0);
                        z51Var.addView(hv0Var2, i23);
                    }
                    hv0Var2.f35355e.setLayerNum(zvVar.f41373a);
                    i7 = 0;
                    hv0Var2.d = false;
                    hv0Var2.setTag(w10);
                    hv0Var2.setTag(2131296461, Integer.valueOf(i23));
                    hv0Var2.setTag(2131296591, tL_messages_stickerSet5);
                    hv0Var2.setTag(2131296585, document);
                    if (i23 == zvVar.E) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    hv0Var2.setSelected(z13);
                    zvVar.h.put(str2, hv0Var2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(tL_messages_stickerSet5.set.title);
                    sb2.append(", ");
                    e6Var = null;
                    sb2.append(org.telegram.messenger.hd.M0(2131754757, null));
                    hv0Var2.setContentDescription(sb2.toString());
                }
                i19++;
                i11 = i7;
                e6Var2 = e6Var;
            }
            zvVar.h();
            zvVar.q();
            if (currentPosition != 0) {
                zvVar.k(currentPosition, currentPosition);
            }
            o();
        }
    }

    public final void Z() {
        boolean z10;
        int i7;
        aw awVar = this.D0;
        zv zvVar = this.C0;
        if (zvVar != null && awVar == null && this.f36993u1 != null) {
            zvVar.setTranslationY(this.f36993u1.p() * (-org.telegram.messenger.g0.L(50.0f)));
        }
        if (awVar == null) {
            return;
        }
        if (getVisibility() == 0 && this.L0 && this.f36993u1.p() != 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        awVar.setVisibility(i7);
        if (z10) {
            Rect rect = this.f37012z2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.f37007y0, rect, null);
            float p10 = this.f36993u1.p() * org.telegram.messenger.g0.L(50.0f);
            int i10 = rect.left;
            if (i10 != 0 || p10 != 0.0f) {
                this.Y1 = false;
            }
            awVar.setTranslationX(i10);
            float translationY = (((getTranslationY() + getTop()) - awVar.getTop()) - zvVar.getExpandedOffset()) - p10;
            if (awVar.getTranslationY() != translationY) {
                awVar.setTranslationY(translationY);
                awVar.invalidate();
            }
        }
        if (this.Y1 && z10 && this.Q0) {
            zvVar.i(true, this.X1);
            return;
        }
        this.Y1 = false;
        zvVar.i(false, this.X1);
    }

    public final void a0() {
        int i7;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        LongSparseArray longSparseArray = this.A1;
        LongSparseArray longSparseArray2 = this.f37011z1;
        int i10 = this.f36941d1;
        vv vvVar = this.E0;
        if (vvVar != null) {
            try {
                int childCount = vvVar.getChildCount();
                int i11 = 0;
                int i12 = 0;
                while (i12 < childCount) {
                    View childAt = vvVar.getChildAt(i12);
                    if (!(childAt instanceof org.telegram.ui.Cells.u3) || ((cj0) vvVar.T(childAt)) == null) {
                        i7 = i12;
                    } else {
                        org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) childAt;
                        ArrayList arrayList = org.telegram.messenger.si.b0(i10).f26505v0[i11];
                        TLRPC.StickerSetCovered stickerSet = u3Var.getStickerSet();
                        if (arrayList != null && arrayList.contains(Long.valueOf(stickerSet.set.f28078id))) {
                            z10 = true;
                        } else {
                            z10 = i11;
                        }
                        int i13 = i11;
                        while (true) {
                            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f37008y1;
                            if (i13 < stickerSetCoveredArr.length) {
                                TLRPC.StickerSetCovered stickerSetCovered = stickerSetCoveredArr[i13];
                                if (stickerSetCovered != null) {
                                    i7 = i12;
                                    if (stickerSetCovered.set.f28078id == stickerSet.set.f28078id) {
                                        z11 = true;
                                        break;
                                    }
                                } else {
                                    i7 = i12;
                                }
                                i13++;
                                i12 = i7;
                            } else {
                                i7 = i12;
                                z11 = false;
                                break;
                            }
                        }
                        u3Var.c(stickerSet, z10, true, 0, 0, z11);
                        if (z10) {
                            org.telegram.messenger.si.b0(i10).e1(stickerSet.set.f28078id);
                        }
                        if (longSparseArray2.indexOfKey(stickerSet.set.f28078id) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (longSparseArray.indexOfKey(stickerSet.set.f28078id) >= 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 || z13) {
                            if (z12 && u3Var.f31720r) {
                                longSparseArray2.remove(stickerSet.set.f28078id);
                                z12 = false;
                            } else if (z13 && !u3Var.f31720r) {
                                longSparseArray.remove(stickerSet.set.f28078id);
                            }
                        }
                        if (!z11 && z12) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        u3Var.b(z14, true);
                    }
                    i12 = i7 + 1;
                    i11 = 0;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override
    public final void b(int i7) {
        setBottomInset(i7);
    }

    @Override
    public final void c(float f10) {
        this.f36988s2 = f10;
        S();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        org.telegram.messenger.z10 z10Var;
        TLRPC.StickerSet stickerSet;
        int i11 = org.telegram.messenger.ns.f25600x0;
        vw vwVar = this.S;
        hv hvVar = this.S2;
        if (i7 == i11) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.f37010z0 != null) {
                    Y(((Boolean) objArr[1]).booleanValue());
                    a0();
                    D();
                    o();
                }
            } else if (((Integer) objArr[0]).intValue() == 5) {
                if (((Boolean) objArr[1]).booleanValue()) {
                    org.telegram.messenger.g0.r(hvVar);
                    org.telegram.messenger.g0.i3(hvVar, 100L);
                    return;
                }
                vwVar.F(false);
            }
        } else if (i7 == org.telegram.messenger.ns.f25556q3) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.K1;
            if (chatFull != null && chatFull.f28052id == longValue && booleanValue) {
                vwVar.F(true);
            }
        } else if (i7 == org.telegram.messenger.ns.X0) {
            boolean booleanValue2 = ((Boolean) objArr[0]).booleanValue();
            int intValue = ((Integer) objArr[1]).intValue();
            if (booleanValue2 || intValue == 0 || intValue == 2) {
                k(booleanValue2);
            }
        } else if (i7 == org.telegram.messenger.ns.f25614z0) {
            a0();
            qb0 qb0Var = this.f37002x;
            if (qb0Var != null) {
                int childCount = qb0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    qb0Var.getChildAt(i12).invalidate();
                }
            }
            Y(false);
        } else if (i7 == org.telegram.messenger.ns.A0) {
            if (vwVar != null) {
                vwVar.F(false);
            }
        } else {
            int i13 = org.telegram.messenger.ns.B0;
            lx lxVar = this.T;
            if (i7 == i13) {
                Long l10 = (Long) objArr[0];
                long longValue2 = l10.longValue();
                if (objArr.length > 1) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) objArr[1];
                } else {
                    tL_messages_stickerSet = null;
                }
                if (tL_messages_stickerSet != null) {
                    gy gyVar = this.A0;
                    if (gyVar != null && gyVar.d == longValue2 && gyVar.f35085f.size() < tL_messages_stickerSet.documents.size()) {
                        gyVar.f35085f = tL_messages_stickerSet.documents;
                        gyVar.f();
                    }
                    if (lxVar != null && lxVar.d == longValue2 && lxVar.f36920f.size() < tL_messages_stickerSet.documents.size()) {
                        lxVar.f36920f = tL_messages_stickerSet.documents;
                        lxVar.f();
                    }
                }
                TLRPC.ChatFull chatFull2 = this.K1;
                if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.f28078id == longValue2) {
                    Y(false);
                }
                HashMap hashMap = this.f36987s1;
                if (hashMap.containsKey(l10) && objArr.length >= 2 && ((org.telegram.messenger.z10) hashMap.get(l10)) != null && tL_messages_stickerSet != null && (z10Var = (org.telegram.messenger.z10) hashMap.remove(l10)) != null) {
                    z10Var.a(tL_messages_stickerSet);
                }
                org.telegram.messenger.g0.r(hvVar);
                org.telegram.messenger.g0.i3(hvVar, 100L);
                return;
            }
            int i14 = org.telegram.messenger.ns.f25514i4;
            yw ywVar = this.Q;
            if (i7 == i14) {
                vv vvVar = this.E0;
                if (vvVar != null) {
                    int childCount2 = vvVar.getChildCount();
                    for (int i15 = 0; i15 < childCount2; i15++) {
                        View childAt = vvVar.getChildAt(i15);
                        if ((childAt instanceof org.telegram.ui.Cells.i8) || (childAt instanceof org.telegram.ui.Cells.y7)) {
                            childAt.invalidate();
                        }
                    }
                }
                if (ywVar != null) {
                    ywVar.invalidate();
                    int childCount3 = ywVar.getChildCount();
                    for (int i16 = 0; i16 < childCount3; i16++) {
                        View childAt2 = ywVar.getChildAt(i16);
                        if (childAt2 instanceof ux) {
                            childAt2.invalidate();
                        }
                    }
                }
                du duVar = this.C1;
                if (duVar != null) {
                    duVar.f34069c.invalidate();
                }
                tw twVar = this.f36978q0;
                if (twVar != null) {
                    org.telegram.ui.z51 z51Var = twVar.f41380e;
                    int childCount4 = z51Var.getChildCount();
                    for (int i17 = 0; i17 < childCount4; i17++) {
                        z51Var.getChildAt(i17).invalidate();
                    }
                }
            } else if (i7 == org.telegram.messenger.ns.L2) {
                if (ywVar != null && this.f36943e0) {
                    if ((this.W.f42175c.f36555k == 2 || ywVar.getAdapter() == lxVar) && !TextUtils.isEmpty(lxVar.f36924w)) {
                        lxVar.F(lxVar.f36924w, true);
                    }
                }
            } else if (i7 == org.telegram.messenger.ns.f25497f5) {
                if (vwVar != null) {
                    vwVar.F(false);
                }
                U();
                Y(false);
            }
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        S();
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.h) {
            canvas.save();
            if (this.f36969n.getVisibility() != 8 && !this.f36995v0 && this.f37003x0) {
                canvas.drawColor(i0.a.o(-1, 25));
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            float R0 = org.telegram.messenger.g0.R0(this.f36984r2);
            if (R0 > 0.0f) {
                int r12 = org.telegram.ui.ActionBar.j6.r1(R0, z(org.telegram.ui.ActionBar.j6.f29269zf));
                int i7 = this.B2;
                GradientDrawable gradientDrawable = this.A2;
                if (i7 != r12) {
                    gradientDrawable.setColors(new int[]{r12, org.telegram.ui.ActionBar.j6.r1(0.66f, r12), i0.a.o(r12, 0)});
                    this.B2 = r12;
                }
                gradientDrawable.setBounds(0, getMeasuredHeight() - this.f36984r2, getMeasuredWidth(), getMeasuredHeight());
                gradientDrawable.draw(canvas);
            }
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public int getCurrentPage() {
        return this.B1;
    }

    public ArrayList<zw> getEmojipacks() {
        ArrayList<zw> arrayList = new ArrayList<>();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f36983r1;
            if (i7 < arrayList2.size()) {
                zw zwVar = (zw) arrayList2.get(i7);
                boolean z10 = zwVar.f42435g;
                ArrayList arrayList3 = this.f36979q1;
                if ((!z10 && (zwVar.f42434f || arrayList3.contains(Long.valueOf(zwVar.f42431b.f28078id)))) || (zwVar.f42435g && !zwVar.f42434f && !arrayList3.contains(Long.valueOf(zwVar.f42431b.f28078id)))) {
                    arrayList.add(zwVar);
                }
                i7++;
            } else {
                return arrayList;
            }
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.d2) {
            return org.telegram.messenger.j6.f24526i;
        }
        if (this.C2 == null) {
            this.C2 = new ArrayList();
        }
        if (org.telegram.messenger.j6.f24526i.size() != this.D2) {
            this.C2.clear();
            int i7 = 0;
            while (true) {
                ArrayList arrayList = org.telegram.messenger.j6.f24526i;
                if (i7 >= arrayList.size()) {
                    break;
                }
                if (!((String) arrayList.get(i7)).startsWith("animated_")) {
                    this.C2.add((String) arrayList.get(i7));
                }
                i7++;
            }
            this.D2 = this.C2.size();
        }
        return this.C2;
    }

    public float getStickersExpandOffset() {
        zv zvVar = this.C0;
        if (zvVar == null) {
            return 0.0f;
        }
        return zvVar.getExpandedOffset();
    }

    public final void h(String str) {
        if (str != null) {
            if (str.startsWith("animated_") || org.telegram.messenger.j6.h(str)) {
                org.telegram.messenger.j6.a(str);
                int i7 = 0;
                if (getVisibility() != 0 || this.h.getCurrentItem() != 0) {
                    org.telegram.messenger.j6.s();
                    this.S.F(false);
                }
                org.telegram.messenger.j6.r();
                if (!this.d2) {
                    ArrayList arrayList = this.C2;
                    if (arrayList == null) {
                        this.C2 = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    while (true) {
                        ArrayList arrayList2 = org.telegram.messenger.j6.f24526i;
                        if (i7 < arrayList2.size()) {
                            if (!((String) arrayList2.get(i7)).startsWith("animated_")) {
                                this.C2.add((String) arrayList2.get(i7));
                            }
                            i7++;
                        } else {
                            this.D2 = this.C2.size();
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void i(int i7, int i10, boolean z10) {
        if (i7 == 2 || x(i7).K(0) == null) {
            return;
        }
        jw jwVar = new jw(getContext(), i10);
        jwVar.f58480a = !z10 ? 1 : 0;
        w(i7).w0(jwVar);
    }

    public final void k(boolean z10) {
        if (z10) {
            X();
            return;
        }
        int size = this.f36963k1.size();
        int size2 = this.l1.size();
        int i7 = this.f36941d1;
        this.f36963k1 = org.telegram.messenger.si.b0(i7).i0(0, true);
        this.l1 = org.telegram.messenger.si.b0(i7).i0(2, false);
        if (org.telegram.messenger.m10.i(i7).q()) {
            this.f36967m1 = org.telegram.messenger.si.b0(i7).i0(7, false);
        } else {
            this.f36967m1 = new ArrayList();
        }
        for (int i10 = 0; i10 < this.l1.size(); i10++) {
            TLRPC.Document document = (TLRPC.Document) this.l1.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 < this.f36963k1.size()) {
                    TLRPC.Document document2 = (TLRPC.Document) this.f36963k1.get(i11);
                    if (document2.dc_id == document.dc_id && document2.f28057id == document.f28057id) {
                        this.f36963k1.remove(i11);
                        break;
                    }
                    i11++;
                }
            }
        }
        if (org.telegram.messenger.np.s1(i7).D3()) {
            int i12 = 0;
            while (i12 < this.l1.size()) {
                if (org.telegram.messenger.gj.X3((TLRPC.Document) this.l1.get(i12))) {
                    this.l1.remove(i12);
                    i12--;
                }
                i12++;
            }
            int i13 = 0;
            while (i13 < this.f36963k1.size()) {
                if (org.telegram.messenger.gj.X3((TLRPC.Document) this.f36963k1.get(i13))) {
                    this.f36963k1.remove(i13);
                    i13--;
                }
                i13++;
            }
        }
        if (size != this.f36963k1.size() || size2 != this.l1.size()) {
            Y(false);
        }
        dy dyVar = this.f37010z0;
        if (dyVar != null) {
            dyVar.f();
        }
        o();
    }

    public final void l(boolean z10) {
        int i7;
        boolean z11;
        mx mxVar = this.f36993u1;
        te.a aVar = this.f36932b;
        yw ywVar = this.Q;
        nv nvVar = this.W;
        if (mxVar != null && mxVar.z()) {
            v4.e1 K = ywVar.K(0);
            if (K == null) {
                yx.a(nvVar, true, !z10);
            } else {
                if (K.f58535a.getTop() < ywVar.getPaddingTop()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                yx.a(nvVar, z11, !z10);
            }
            O(false, !z10);
            nvVar.setTranslationY(aVar.f57081e * org.telegram.messenger.g0.L(15.0f));
        } else if (nvVar != null && ywVar != null) {
            v4.e1 K2 = ywVar.K(0);
            if (K2 != null) {
                i7 = K2.f58535a.getTop();
            } else {
                i7 = -this.f36938c1;
            }
            nvVar.setTranslationY((aVar.f57081e * org.telegram.messenger.g0.L(15.0f)) + i7);
            nvVar.f42173a.a(false, !z10);
            m(Math.round(this.J.getTranslationY()));
        }
    }

    public final void m(int i7) {
        ObjectAnimator objectAnimator = this.S0[1];
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        boolean z10 = false;
        v4.e1 K = this.Q.K(0);
        int L = org.telegram.messenger.g0.L(38.0f) + i7;
        if (L > 0 && (K == null || K.f58535a.getBottom() < L)) {
            z10 = true;
        }
        O(z10, !this.L1);
    }

    public final void n(int i7, View view) {
        yw ywVar;
        v4.e1 K;
        int i10;
        qw qwVar = this.J;
        int[] iArr = this.R0;
        if (view == null) {
            iArr[1] = 0;
            qwVar.setTranslationY(0);
        } else if (view.getVisibility() == 0 && !this.f36950g0) {
            mx mxVar = this.f36993u1;
            if (mxVar == null || !mxVar.z()) {
                if (i7 > 0 && (ywVar = this.Q) != null && ywVar.getVisibility() == 0 && (K = ywVar.K(0)) != null) {
                    int top = K.f58535a.getTop();
                    if (this.f36943e0) {
                        i10 = this.f36938c1;
                    } else {
                        i10 = 0;
                    }
                    if (top + i10 >= ywVar.getPaddingTop()) {
                        return;
                    }
                }
                int i11 = iArr[1] - i7;
                iArr[1] = i11;
                if (i11 > 0) {
                    iArr[1] = 0;
                } else if (i11 < (-org.telegram.messenger.g0.L(108.0f))) {
                    iArr[1] = -org.telegram.messenger.g0.L(108.0f);
                }
                qwVar.setTranslationY(Math.max(-org.telegram.messenger.g0.L(36.0f), iArr[1]));
            }
        }
    }

    public final void o() {
        int L0;
        zv zvVar = this.C0;
        if (zvVar != null && (L0 = this.F0.L0()) != -1) {
            int i7 = this.H1;
            if (i7 <= 0 && (i7 = this.G1) <= 0) {
                i7 = this.F1;
            }
            zvVar.k(this.f37010z0.F(L0), i7);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        xi.e eVar = this.N2;
        if (eVar != null) {
            eVar.b();
            this.N2 = null;
        }
        xi.e eVar2 = (xi.e) new org.telegram.messenger.ms(org.telegram.messenger.ns.f(this.f36941d1), this).f25092b;
        eVar2.f(org.telegram.messenger.ns.f25514i4);
        eVar2.c(org.telegram.messenger.ns.L2);
        eVar2.c(org.telegram.messenger.ns.f25556q3);
        this.N2 = eVar2;
        if (this.f37010z0 != null) {
            eVar2.c(org.telegram.messenger.ns.f25600x0);
            eVar2.c(org.telegram.messenger.ns.X0);
            eVar2.c(org.telegram.messenger.ns.f25614z0);
            eVar2.c(org.telegram.messenger.ns.B0);
            eVar2.c(org.telegram.messenger.ns.f25497f5);
            org.telegram.messenger.g0.h3(new hv(this, 0));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        du duVar = this.C1;
        if (duVar != null && duVar.isShowing()) {
            duVar.dismiss();
        }
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        if (p10.f49666l == this.f36955h2) {
            p10.W = null;
            p10.f49653a0 = null;
            p10.Y = null;
            p10.f49666l = null;
            p10.f49657c0 = null;
            p10.t();
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13 = i11 - i7;
        if (this.P1 != i13) {
            this.P1 = i13;
            D();
        }
        super.onLayout(z10, i7, i10, i11, i12);
        S();
        Z();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.L1 = true;
        boolean z10 = org.telegram.messenger.g0.E;
        View view = this.f36998w;
        boolean z11 = this.f36943e0;
        if (!z10 && !this.O1) {
            if (this.M1 != 0) {
                if (!this.M2) {
                    setOutlineProvider(null);
                    setClipToOutline(false);
                    setElevation(0.0f);
                }
                if (this.f36995v0) {
                    int i11 = org.telegram.ui.ActionBar.j6.f29269zf;
                    setBackgroundColor(z(i11));
                    if (z11) {
                        view.setBackgroundColor(z(i11));
                    }
                }
                this.M1 = 0;
            }
        } else if (this.M1 != 1) {
            if (!this.M2) {
                setOutlineProvider(this.N1);
                setClipToOutline(true);
                setElevation(org.telegram.messenger.g0.L(2.0f));
            }
            setBackgroundResource(2131232739);
            Drawable background = getBackground();
            int i12 = org.telegram.ui.ActionBar.j6.f29269zf;
            background.setColorFilter(new PorterDuffColorFilter(z(i12), PorterDuff.Mode.MULTIPLY));
            if (z11 && this.f36995v0) {
                view.setBackgroundColor(z(i12));
            }
            this.M1 = 1;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
        this.L1 = false;
        setTranslationY(getTranslationY());
    }

    public final void p(int i7) {
        int L0;
        int i10;
        int L02;
        if (i7 == 0) {
            if (!this.K0 && (L02 = this.F0.L0()) != -1 && this.E0 != null) {
                int i11 = this.H1;
                if (i11 <= 0 && (i11 = this.G1) <= 0) {
                    i11 = this.F1;
                }
                this.C0.k(this.f37010z0.F(L02), i11);
            }
        } else if (i7 == 2) {
            v4.h0 adapter = this.f36956i0.getAdapter();
            qx qxVar = this.f36972o0;
            if (adapter == qxVar && qxVar.J >= 0 && this.f36989t0 >= 0 && this.f36986s0 >= 0 && (L0 = this.f36959j0.L0()) != -1) {
                if (L0 >= qxVar.J) {
                    i10 = this.f36989t0;
                } else {
                    i10 = this.f36986s0;
                }
                this.f36978q0.k(i10, 0);
            }
        }
    }

    public final void q(boolean z10) {
        int i7;
        mx mxVar = this.f36993u1;
        te.a aVar = this.f36928a;
        vv vvVar = this.E0;
        boolean z11 = false;
        yv yvVar = this.H0;
        if (mxVar != null && mxVar.z()) {
            v4.e1 K = vvVar.K(0);
            if (K == null) {
                yx.a(yvVar, true, !z10);
            } else {
                if (K.f58535a.getTop() < vvVar.getPaddingTop()) {
                    z11 = true;
                }
                yx.a(yvVar, z11, !z10);
            }
            yvVar.setTranslationY(aVar.f57081e * org.telegram.messenger.g0.L(15.0f));
        } else if (yvVar != null && vvVar != null) {
            v4.e1 K2 = vvVar.K(0);
            if (K2 != null) {
                i7 = K2.f58535a.getTop();
            } else {
                i7 = -this.f36938c1;
            }
            yvVar.setTranslationY((aVar.f57081e * org.telegram.messenger.g0.L(15.0f)) + i7);
            yvVar.f42173a.a(false, !z10);
        }
    }

    public final void r() {
        HashMap hashMap = org.telegram.messenger.j6.f24520a;
        org.telegram.messenger.np.d1().edit().putBoolean("filled_default", true).commit();
        org.telegram.messenger.j6.h.clear();
        org.telegram.messenger.j6.f24526i.clear();
        org.telegram.messenger.j6.r();
        this.S.F(false);
    }

    @Override
    public final void requestLayout() {
        if (this.L1) {
            return;
        }
        super.requestLayout();
    }

    public final void s(long j3, boolean z10) {
        yx yxVar;
        v4.b0 b0Var;
        View view;
        View view2;
        int i7;
        int i10;
        TLRPC.TL_messages_stickerSet o02;
        dy dyVar;
        int E;
        AnimatorSet animatorSet = this.N0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.N0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        int i11 = 2;
        if (currentItem == 2 && j3 != -1 && (o02 = org.telegram.messenger.si.b0(this.f36941d1).o0(j3)) != null && (E = (dyVar = this.f37010z0).E(o02)) >= 0 && E < dyVar.b()) {
            I(E, org.telegram.messenger.g0.L(48.0f));
        }
        int i12 = 0;
        qx qxVar = this.f36962k0;
        if (qxVar != null) {
            qxVar.L = false;
        }
        int i13 = 0;
        while (i13 < 3) {
            View view3 = this.E0;
            View view4 = this.f36956i0;
            sv svVar = this.f36975p0;
            View view5 = this.Q;
            if (i13 == 0) {
                yxVar = this.W;
                b0Var = this.R;
                view = this.J;
                view2 = view5;
            } else if (i13 == 1) {
                b0Var = this.f36959j0;
                view = this.f36978q0;
                view2 = view4;
                yxVar = svVar;
            } else {
                yxVar = this.H0;
                b0Var = this.F0;
                view = this.C0;
                view2 = view3;
            }
            if (yxVar == null) {
                i10 = i12;
                i7 = i11;
            } else {
                int i14 = i12;
                xx xxVar = yxVar.f42179r;
                int i15 = i11;
                yxVar.d.setText("");
                if (xxVar != null) {
                    xxVar.I1(null);
                    xxVar.G1();
                }
                int i16 = this.f36938c1;
                if (i13 == currentItem && z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.N0 = animatorSet2;
                    Property property = View.TRANSLATION_Y;
                    if (view != null && i13 != 1) {
                        float[] fArr = new float[1];
                        fArr[i14] = 0.0f;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
                        float[] fArr2 = new float[1];
                        fArr2[i14] = org.telegram.messenger.g0.L(36.0f);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, property, fArr2);
                        float[] fArr3 = new float[1];
                        fArr3[i14] = org.telegram.messenger.g0.L(36.0f);
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(yxVar, property, fArr3);
                        Animator[] animatorArr = new Animator[3];
                        animatorArr[i14] = ofFloat;
                        animatorArr[1] = ofFloat2;
                        animatorArr[i15] = ofFloat3;
                        animatorSet2.playTogether(animatorArr);
                    } else {
                        float[] fArr4 = new float[1];
                        fArr4[i14] = org.telegram.messenger.g0.L(36.0f) - i16;
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view2, property, fArr4);
                        Animator[] animatorArr2 = new Animator[1];
                        animatorArr2[i14] = ofFloat4;
                        animatorSet2.playTogether(animatorArr2);
                    }
                    this.N0.setDuration(200L);
                    this.N0.setInterpolator(er.h);
                    this.N0.addListener(new fi.c3(this, b0Var, view2, 6));
                    this.N0.start();
                    i10 = i14;
                    i7 = i15;
                } else {
                    if (yxVar != svVar) {
                        yxVar.setTranslationY(org.telegram.messenger.g0.L(36.0f) - i16);
                    }
                    i7 = i15;
                    if (view != null && i13 != i7) {
                        view.setTranslationY(0.0f);
                    }
                    if (view2 == view3) {
                        i10 = i14;
                        view2.setPadding(i10, org.telegram.messenger.g0.L(36.0f), i10, org.telegram.messenger.g0.L(44.0f) + this.f36984r2);
                    } else {
                        i10 = i14;
                        if (view2 == view4) {
                            view2.setPadding(i10, org.telegram.messenger.g0.L(40.0f), i10, org.telegram.messenger.g0.L(44.0f) + this.f36984r2);
                        } else {
                            if (view2 == view5) {
                                view2.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(44.0f) + this.f36984r2);
                            }
                            i10 = 0;
                        }
                    }
                    b0Var.h1(i10, i10);
                }
            }
            i13++;
            i11 = i7;
            i12 = i10;
        }
        int i17 = i12;
        if (!z10) {
            this.f36993u1.i(i17);
        }
    }

    public void setBlurredBackgroundDrawableFactory(dh.c cVar) {
        org.telegram.ui.ActionBar.e6 e6Var = this.f36931a2;
        View view = this.f37006y;
        if (view != null) {
            fh.g c10 = cVar.c(view, null, false);
            c10.p(c8.g0.d(e6Var));
            c10.r(org.telegram.messenger.g0.L(18.0f));
            c10.q(org.telegram.messenger.g0.L(6.0f));
            view.setBackground(c10);
        }
        View view2 = this.F;
        if (view2 != null) {
            fh.g c11 = cVar.c(view2, null, false);
            c11.p(c8.g0.d(e6Var));
            c11.r(org.telegram.messenger.g0.L(18.0f));
            c11.q(org.telegram.messenger.g0.L(6.0f));
            view2.setBackground(c11);
        }
        View view3 = this.f37002x;
        if (view3 != null) {
            fh.g c12 = cVar.c(view3, null, false);
            c12.p(c8.g0.d(e6Var));
            c12.r(org.telegram.messenger.g0.L(18.0f));
            c12.q(org.telegram.messenger.g0.L(6.0f));
            view3.setBackground(c12);
        }
        View view4 = this.E;
        if (view4 != null) {
            fh.g c13 = cVar.c(view4, null, false);
            c13.p(c8.g0.d(e6Var));
            c13.r(org.telegram.messenger.g0.L(18.0f));
            c13.q(org.telegram.messenger.g0.L(6.0f));
            view4.setBackground(c13);
        }
    }

    public void setBottomInset(int i7) {
        if (this.f36984r2 != i7) {
            this.f36984r2 = i7;
            j(i7, this.L);
            j(i7, this.N);
            j(org.telegram.messenger.g0.L(44.0f) + i7, this.Q);
            j(org.telegram.messenger.g0.L(44.0f) + i7, this.E0);
            j(org.telegram.messenger.g0.L(44.0f) + i7, this.f36956i0);
            FrameLayout frameLayout = this.f36985s;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-i7);
            }
            S();
            invalidate();
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.K1 = chatFull;
        Y(false);
    }

    public void setDelegate(mx mxVar) {
        this.f36993u1 = mxVar;
    }

    public void setDragListener(sw swVar) {
        this.P0 = swVar;
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        yv yvVar = this.H0;
        if (yvVar != null) {
            yvVar.d.setEnabled(z10);
        }
        sv svVar = this.f36975p0;
        if (svVar != null) {
            svVar.d.setEnabled(z10);
        }
        nv nvVar = this.W;
        if (nvVar != null) {
            nvVar.d.setEnabled(z10);
        }
    }

    public void setForseMultiwindowLayout(boolean z10) {
        this.O1 = z10;
    }

    public void setShouldDrawBackground(boolean z10) {
        if (this.f36995v0 != z10) {
            this.f36995v0 = z10;
            updateColors();
        }
    }

    public void setShowing(boolean z10) {
        this.Q0 = z10;
        Z();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        Z();
        S();
    }

    @Override
    public void setVisibility(int i7) {
        boolean z10;
        if (getVisibility() != i7) {
            z10 = true;
        } else {
            z10 = false;
        }
        super.setVisibility(i7);
        if (z10) {
            if (i7 != 8) {
                org.telegram.messenger.j6.s();
                this.S.F(false);
                xi.e eVar = this.O2;
                int i10 = this.f36941d1;
                if (eVar == null) {
                    xi.e eVar2 = (xi.e) new org.telegram.messenger.ms(org.telegram.messenger.ns.f(i10), this).f25092b;
                    eVar2.c(org.telegram.messenger.ns.f25600x0);
                    this.O2 = eVar2;
                }
                if (this.f37010z0 != null) {
                    if (!this.P2) {
                        this.P2 = true;
                        this.O2.c(org.telegram.messenger.ns.X0);
                    }
                    Y(false);
                    D();
                }
                k(true);
                k(false);
                org.telegram.messenger.si.b0(i10).V0(0, true, true, false);
                org.telegram.messenger.si.b0(i10).V0(0, false, true, false);
                org.telegram.messenger.si.b0(i10).V0(2, false, true, false);
            }
            jg.d1 d1Var = this.U0;
            if (d1Var != null) {
                d1Var.a();
            }
        }
    }

    public final void t(boolean z10) {
        s(-1L, z10);
    }

    public final void u(boolean z10) {
        dy dyVar;
        boolean z11 = this.U2;
        this.U2 = z10;
        if (z11 && !z10) {
            int i7 = this.B1;
            if (i7 == 0) {
                vw vwVar = this.S;
                if (vwVar != null) {
                    vwVar.F(false);
                }
            } else if (i7 == 1) {
                qx qxVar = this.f36972o0;
                if (qxVar != null) {
                    qxVar.f();
                }
            } else if (i7 == 2 && (dyVar = this.f37010z0) != null) {
                dyVar.f();
            }
        }
    }

    @Override
    public final void updateColors() {
        try {
            T();
            ui.c cVar = this.f36968m2;
            if (cVar != null) {
                cVar.a(z(org.telegram.ui.ActionBar.j6.f28849d6));
            }
            qb0 qb0Var = this.f37002x;
            if (qb0Var != null) {
                qb0Var.setIndicatorColor(i0.a.o(z(org.telegram.ui.ActionBar.j6.Gf), 20));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final int v(float f10) {
        return i0.a.o(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Nl, this.f36931a2), (int) (f10 * 255.0f));
    }

    public final v4.s w(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    return this.f36959j0;
                }
                throw new IllegalArgumentException(i5.c.i(i7, "Unexpected argument: "));
            }
            return this.R;
        }
        return this.F0;
    }

    public final uj0 x(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    return this.f36956i0;
                }
                throw new IllegalArgumentException(i5.c.i(i7, "Unexpected argument: "));
            }
            return this.Q;
        }
        return this.E0;
    }

    public final HorizontalScrollView y(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    return this.f36978q0;
                }
                throw new IllegalArgumentException(i5.c.i(i7, "Unexpected argument: "));
            }
            return this.J;
        }
        return this.C0;
    }

    public final int z(int i7) {
        org.telegram.ui.ActionBar.e6 e6Var = this.f36931a2;
        if (e6Var != null) {
            return e6Var.h(i7);
        }
        return org.telegram.ui.ActionBar.j6.x0(null, i7, false);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void E(float f10, int i7) {
    }
}
