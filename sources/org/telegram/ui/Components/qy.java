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
public class qy extends FrameLayout implements org.telegram.ui.ActionBar.c6, te.b, org.telegram.messenger.fs, rh.a {
    public static final int V2 = 0;
    public final ly A0;
    public final LongSparseArray A1;
    public final GradientDrawable A2;
    public final qv B0;
    public int B1;
    public int B2;
    public final ew C0;
    public final iu C1;
    public ArrayList C2;
    public final fw D0;
    public final int D1;
    public int D2;
    public final ImageView E;
    public final aw E0;
    public final int[] E1;
    public long E2;
    public final ImageView F;
    public final bw F0;
    public int F1;
    public final te.a F2;
    public AnimatorSet G;
    public oy G0;
    public int G1;
    public ArrayList G2;
    public AnimatorSet H;
    public final dw H0;
    public int H1;
    public Drawable H2;
    public float I;
    public final ph.c I0;
    public int I1;
    public int I2;
    public final vw J;
    public boolean J0;
    public int J1;
    public int J2;
    public final qw K;
    public boolean K0;
    public TLRPC.ChatFull K1;
    public int K2;
    public final org.telegram.ui.w61 L;
    public boolean L0;
    public boolean L1;
    public int L2;
    public final ph.a M;
    public final kx M0;
    public int M1;
    public boolean M2;
    public final org.telegram.ui.w61 N;
    public AnimatorSet N0;
    public final bg.r0 N1;
    public xi.e N2;
    public final ph.a O;
    public final di.xb O0;
    public boolean O1;
    public xi.e O2;
    public final View P;
    public xw P0;
    public int P1;
    public boolean P2;
    public final dx Q;
    public boolean Q0;
    public boolean Q1;
    public AnimatorSet Q2;
    public final rw R;
    public final int[] R0;
    public boolean R1;
    public h2.m0 R2;
    public final ax S;
    public final ObjectAnimator[] S0;
    public yx S1;
    public final mv S2;
    public final px T;
    public boolean T0;
    public float T1;
    public boolean T2;
    public oy U;
    public jg.d1 U0;
    public float U1;
    public boolean U2;
    public final ph.c V;
    public boolean V0;
    public float V1;
    public final sv W;
    public boolean W0;
    public float W1;
    public String[] X0;
    public float X1;
    public final Drawable[] Y0;
    public boolean Y1;
    public final Drawable[] Z0;
    public final org.telegram.ui.ActionBar.g2 Z1;
    public final te.a f39034a;
    public AnimatorSet f39035a0;
    public final Drawable[] f39036a1;
    public final org.telegram.ui.ActionBar.i6 f39037a2;
    public final te.a f39038b;
    public final org.telegram.ui.ActionBar.l5 f39039b0;
    public final String[] f39040b1;
    public final org.telegram.ui.ActionBar.w5 f39041b2;
    public int f39042c;
    public final org.telegram.ui.ActionBar.l5 f39043c0;
    public final int f39044c1;
    public final org.telegram.ui.ActionBar.w5 f39045c2;
    public final ArrayList d;
    public boolean f39046d0;
    public final int f39047d1;
    public final boolean d2;
    public final ArrayList f39048e;
    public final boolean f39049e0;
    public final ArrayList f39050e1;
    public LongSparseArray f39051e2;
    public boolean f39052f;
    public boolean f39053f0;
    public int f39054f1;
    public PorterDuffColorFilter f39055f2;
    public boolean f39056g0;
    public int f39057g1;
    public final rc f39058g2;
    public final gw h;
    public final uv f39059h0;
    public boolean f39060h1;
    public final mw f39061h2;
    public final vv f39062i0;
    public TLRPC.TL_messages_stickerSet f39063i1;
    public boolean f39064i2;
    public final vx f39065j0;
    public ArrayList f39066j1;
    public final boolean f39067j2;
    public final ux f39068k0;
    public ArrayList f39069k1;
    public final dh.g f39070k2;
    public final xx f39071l0;
    public ArrayList l1;
    public final jh f39072l2;
    public final HashMap m0;
    public ArrayList f39073m1;
    public final ui.c f39074m2;
    public final FrameLayout f39075n;
    public final qv f39076n0;
    public final ArrayList n1;
    public final dh.c f39077n2;
    public final ux f39078o0;
    public final ArrayList f39079o1;
    public final ri.q f39080o2;
    public final xv f39081p0;
    public final ArrayList f39082p1;
    public boolean f39083p2;
    public final yw f39084q0;
    public final ArrayList f39085q1;
    public boolean f39086q2;
    public final FrameLayout f39087r;
    public boolean f39088r0;
    public final ArrayList f39089r1;
    public int f39090r2;
    public final FrameLayout f39091s;
    public int f39092s0;
    public final HashMap f39093s1;
    public float f39094s2;
    public int f39095t0;
    public final Paint f39096t1;
    public View f39097t2;
    public int f39098u0;
    public qx f39099u1;
    public int f39100u2;
    public boolean f39101v0;
    public long f39102v1;
    public int f39103v2;
    public final View f39104w;
    public boolean f39105w0;
    public boolean f39106w1;
    public long f39107w2;
    public final zb0 f39108x;
    public boolean f39109x0;
    public boolean f39110x1;
    public boolean f39111x2;
    public final hw f39112y;
    public final yv f39113y0;
    public final TLRPC.StickerSetCovered[] f39114y1;
    public boolean f39115y2;
    public final iy f39116z0;
    public final LongSparseArray f39117z1;
    public final Rect f39118z2;

    public qy(org.telegram.ui.ActionBar.g2 r41, boolean r42, boolean r43, boolean r44, android.content.Context r45, boolean r46, org.telegram.tgnet.TLRPC.ChatFull r47, android.view.ViewGroup r48, boolean r49, final org.telegram.ui.ActionBar.i6 r50, boolean r51, boolean r52) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qy.<init>(org.telegram.ui.ActionBar.g2, boolean, boolean, boolean, android.content.Context, boolean, org.telegram.tgnet.TLRPC$ChatFull, android.view.ViewGroup, boolean, org.telegram.ui.ActionBar.i6, boolean, boolean):void");
    }

    public static void a(qy qyVar, boolean z10) {
        vv vvVar = qyVar.f39062i0;
        if (vvVar != null) {
            int childCount = vvVar.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = vvVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.i2) {
                    ImageReceiver photoImage = ((org.telegram.ui.Cells.i2) childAt).getPhotoImage();
                    if (z10) {
                        photoImage.f22762u0 = true;
                        photoImage.Q0(false);
                    } else {
                        photoImage.f22762u0 = false;
                        photoImage.R0();
                    }
                }
            }
        }
    }

    public static void d(qy qyVar, yx yxVar, String str) {
        String str2;
        String str3;
        boolean z10;
        String str4;
        qx qxVar;
        kc kcVar;
        org.telegram.ui.ActionBar.g2 g2Var = qyVar.Z1;
        int i7 = qyVar.f39047d1;
        ArrayList arrayList = qyVar.f39089r1;
        if (yxVar != null) {
            if (yxVar.getSpan() != null) {
                if (qyVar.f39099u1 != null) {
                    long j3 = yxVar.getSpan().documentId;
                    TLRPC.Document document = yxVar.getSpan().document;
                    ex exVar = yxVar.f42581e;
                    if (exVar != null && exVar.f34861i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (document == null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ex exVar2 = (ex) arrayList.get(i10);
                            int i11 = 0;
                            while (true) {
                                ArrayList arrayList2 = exVar2.f34857c;
                                if (arrayList2 != null && i11 < arrayList2.size()) {
                                    if (((TLRPC.Document) exVar2.f34857c.get(i11)).f28498id == j3) {
                                        document = (TLRPC.Document) exVar2.f34857c.get(i11);
                                        break;
                                    }
                                    i11++;
                                }
                            }
                        }
                    }
                    if (document == null) {
                        document = o5.e(i7, j3);
                    }
                    TLRPC.Document document2 = document;
                    if (document2 != null) {
                        str4 = org.telegram.messenger.fj.U(document2);
                    } else {
                        str4 = null;
                    }
                    if (!org.telegram.messenger.fj.m3(document2) && !org.telegram.messenger.i10.i(i7).q() && (((qxVar = qyVar.f39099u1) == null || !qxVar.g()) && !qyVar.V0 && !z10)) {
                        qyVar.N(false);
                        if (g2Var != null) {
                            kcVar = kc.b0(g2Var);
                        } else {
                            kcVar = new kc(qyVar.f39087r, qyVar.f39037a2);
                        }
                        if (!qyVar.f39064i2 && g2Var != null) {
                            kcVar.K(2131624191, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131743616, null)), org.telegram.messenger.gd.N0(2131747623, null), new mv(qyVar, 4)).j();
                        } else {
                            kcVar.r(document2, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131743617, null)), org.telegram.messenger.gd.N0(2131746839, null), new mv(qyVar, 3)).j();
                        }
                        qyVar.f39064i2 = !qyVar.f39064i2;
                        return;
                    }
                    qyVar.E2 = SystemClock.elapsedRealtime();
                    qyVar.N(true);
                    qyVar.h("animated_" + j3);
                    qyVar.f39099u1.x(j3, document2, str4, yxVar.f42580c);
                    return;
                }
                return;
            }
            qyVar.E2 = SystemClock.elapsedRealtime();
            qyVar.N(true);
            if (str != null) {
                str2 = str;
            } else {
                str2 = (String) yxVar.getTag();
            }
            new SpannableStringBuilder().append((CharSequence) str2);
            if (str == null) {
                if (!yxVar.f42580c && (str3 = (String) org.telegram.messenger.j6.f24927j.get(str2)) != null) {
                    str2 = g(str2, str3);
                }
                qyVar.h(str2);
                qx qxVar2 = qyVar.f39099u1;
                if (qxVar2 != null) {
                    qxVar2.l(org.telegram.messenger.j6.c(str2));
                    return;
                }
                return;
            }
            qx qxVar3 = qyVar.f39099u1;
            if (qxVar3 != null) {
                qxVar3.l(org.telegram.messenger.j6.c(str));
            }
        }
    }

    public static void e(qy qyVar, int i7, int i10) {
        v4.f1 K;
        int[] iArr = qyVar.R0;
        if (i7 == 1) {
            qyVar.n(i10, qyVar.Q);
            return;
        }
        qx qxVar = qyVar.f39099u1;
        if ((qxVar == null || !qxVar.z()) && !qyVar.K0) {
            ek0 x10 = qyVar.x(i7);
            if (i10 > 0 && x10 != null && x10.getVisibility() == 0 && (K = x10.K(0)) != null && K.f59245a.getTop() + qyVar.f39044c1 >= x10.getPaddingTop()) {
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
                qyVar.Z();
            } else {
                qyVar.y(i7).setTranslationY(Math.max(-org.telegram.messenger.g0.L(48.0f), iArr[i7]));
            }
        }
    }

    public static void f(qy qyVar, boolean z10) {
        int N0;
        vx vxVar = qyVar.f39065j0;
        xv xvVar = qyVar.f39081p0;
        vv vvVar = qyVar.f39062i0;
        if (vvVar != null && (vvVar.getAdapter() instanceof ux)) {
            ux uxVar = (ux) vvVar.getAdapter();
            if (!uxVar.f40496s && uxVar.h == 0 && !uxVar.f40499y.isEmpty() && (N0 = vxVar.N0()) != -1 && N0 > vxVar.B() - 5) {
                String str = uxVar.f40498x;
                String str2 = uxVar.f40495r;
                boolean z11 = uxVar.f40497w;
                uxVar.F(str, str2, true, z11, z11);
            }
        }
        qx qxVar = qyVar.f39099u1;
        if (qxVar != null && qxVar.z()) {
            boolean z12 = false;
            v4.f1 K = vvVar.K(0);
            if (K == null) {
                dy.a(xvVar, true, !z10);
                return;
            }
            if (K.f59245a.getTop() < vvVar.getPaddingTop()) {
                z12 = true;
            }
            dy.a(xvVar, z12, !z10);
        } else if (xvVar != null && vvVar != null) {
            xvVar.f34480a.a(true, !z10);
        }
    }

    public static String g(String str, String str2) {
        String str3;
        String str4;
        boolean z10 = true;
        if (org.telegram.messenger.j4.c(str) != null) {
            if (org.telegram.messenger.j4.c(str) == null) {
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
        String v = p5.c.v(str, str2);
        if (str3 != null) {
            v = p5.c.v(v, str3);
        }
        if (z10) {
            return p5.c.v(v, "\u200d➡");
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
        dw dwVar = this.H0;
        if (dwVar != null) {
            dwVar.b();
        }
        xv xvVar = this.f39081p0;
        if (xvVar != null) {
            xvVar.b();
        }
        sv svVar = this.W;
        if (svVar != null) {
            svVar.b();
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
        cy cyVar;
        boolean z12;
        if (this.B1 != 0 && this.f39110x1) {
            this.B1 = 0;
        }
        if (this.B1 == 0 && this.f39106w1) {
            this.B1 = 1;
        }
        int i7 = this.B1;
        gw gwVar = this.h;
        if (i7 != 0 && !z10 && this.f39048e.size() != 1) {
            int i10 = this.B1;
            if (i10 == 1) {
                M(false, false);
                if (!this.f39101v0 && !this.f39105w0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                R(z12, false);
                if (gwVar.getCurrentItem() != 2) {
                    gwVar.x(2, false);
                }
                ew ewVar = this.C0;
                if (ewVar != null) {
                    this.T0 = true;
                    int i11 = this.H1;
                    if (i11 >= 0) {
                        ewVar.m(i11);
                    } else {
                        int i12 = this.G1;
                        if (i12 >= 0) {
                            ewVar.m(i12);
                        } else {
                            ewVar.m(this.F1);
                        }
                    }
                    this.T0 = false;
                    this.F0.h1(0, 0);
                }
            } else if (i10 == 2) {
                M(false, false);
                R(false, false);
                if (gwVar.getCurrentItem() != 1) {
                    gwVar.x(1, false);
                }
                yw ywVar = this.f39084q0;
                if (ywVar != null) {
                    ywVar.m(0);
                }
                xv xvVar = this.f39081p0;
                if (xvVar != null && (cyVar = xvVar.f34486r) != null) {
                    cyVar.I1(null);
                }
            }
        } else {
            M(true, false);
            R(false, false);
            if (gwVar.getCurrentItem() != 0) {
                gwVar.x(0, !z10);
            }
            if (z11) {
                org.telegram.messenger.g0.h3(new mv(this, 5), 350L);
            }
        }
        N(true);
    }

    public final void D() {
        iy iyVar = this.f39116z0;
        if (iyVar != null) {
            iyVar.f();
        }
        ly lyVar = this.A0;
        if (lyVar != null) {
            lyVar.f();
        }
        if (org.telegram.ui.ns.p().E) {
            org.telegram.ui.ns.p().m();
        }
        org.telegram.ui.ns.p().t();
    }

    public final void E(int i7) {
        qx qxVar = this.f39099u1;
        if ((qxVar != null && qxVar.z()) || i7 == 0) {
            return;
        }
        HorizontalScrollView y10 = y(i7);
        this.R0[i7] = 0;
        y10.setTranslationY(0);
    }

    public final void F(int i7, int i10) {
        rw rwVar = this.R;
        View m10 = rwVar.m(i7);
        int L0 = rwVar.L0();
        int i11 = 1;
        if ((m10 == null && Math.abs(i7 - L0) > rwVar.J * 9.0f) || !org.telegram.messenger.bz.c()) {
            if (rwVar.L0() < i7) {
                i11 = 0;
            }
            org.telegram.ui.ActionBar.l5 l5Var = this.f39043c0;
            l5Var.f29284b = i11;
            l5Var.k(i7, i10, false, false);
            return;
        }
        this.K0 = true;
        hi.t1 t1Var = new hi.t1(1, this.Q.getContext(), this);
        t1Var.f59190a = i7;
        t1Var.f55822p = i10;
        rwVar.w0(t1Var);
    }

    public final void H(int i7, int i10) {
        bw bwVar = this.F0;
        View m10 = bwVar.m(i7);
        int L0 = bwVar.L0();
        int i11 = 1;
        if (m10 == null && Math.abs(i7 - L0) > 40) {
            if (bwVar.L0() < i7) {
                i11 = 0;
            }
            org.telegram.ui.ActionBar.l5 l5Var = this.f39039b0;
            l5Var.f29284b = i11;
            l5Var.k(i7, i10, false, false);
            return;
        }
        this.K0 = true;
        this.E0.y0(i7);
    }

    public final void I(boolean z10, boolean z11, boolean z12, boolean z13) {
        ArrayList arrayList = this.f39048e;
        arrayList.clear();
        boolean z14 = false;
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i7 >= arrayList2.size()) {
                break;
            }
            if (((my) arrayList2.get(i7)).f37567a == 0 && z10) {
                arrayList.add((my) arrayList2.get(i7));
            }
            if (((my) arrayList2.get(i7)).f37567a == 1 && z12) {
                arrayList.add((my) arrayList2.get(i7));
            }
            if (((my) arrayList2.get(i7)).f37567a == 2 && z11) {
                arrayList.add((my) arrayList2.get(i7));
            }
            i7++;
        }
        zb0 zb0Var = this.f39108x;
        if (zb0Var != null) {
            if (arrayList.size() > 1) {
                z14 = true;
            }
            org.telegram.messenger.g0.X3(zb0Var, z14, 1.0f, true, z13);
        }
        gw gwVar = this.h;
        if (gwVar != null) {
            gwVar.setAdapter(null);
            gwVar.setAdapter(this.M0);
            if (zb0Var != null) {
                zb0Var.setViewPager(gwVar);
            }
        }
    }

    public final void J(final ph.a aVar, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z10, boolean z11) {
        String G;
        ly lyVar;
        px pxVar;
        if (stickerSet != null) {
            if (!z10 || (pxVar = this.T) == null || pxVar.d == stickerSet.f28519id) {
                if (!z10 && (lyVar = this.A0) != null && lyVar.d != stickerSet.f28519id) {
                    return;
                }
                final boolean E0 = org.telegram.messenger.ri.d0(this.f39047d1).E0(stickerSet.f28519id, true);
                if (E0) {
                    if (stickerSet.masks) {
                        G = org.telegram.messenger.gd.G(stickerSet.count, "RemoveManyMasksCount", new Object[0]);
                    } else if (stickerSet.emojis) {
                        G = org.telegram.messenger.gd.G(stickerSet.count, "RemoveManyEmojiCount", new Object[0]);
                    } else {
                        G = org.telegram.messenger.gd.G(stickerSet.count, "RemoveManyStickersCount", new Object[0]);
                    }
                } else if (stickerSet.masks) {
                    G = org.telegram.messenger.gd.G(stickerSet.count, "AddManyMasksCount", new Object[0]);
                } else if (stickerSet.emojis) {
                    G = org.telegram.messenger.gd.G(stickerSet.count, "AddManyEmojiCount", new Object[0]);
                } else {
                    G = org.telegram.messenger.gd.G(stickerSet.count, "AddManyStickersCount", new Object[0]);
                }
                aVar.i(G, z11, true);
                aVar.m0.a(!E0, z11);
                aVar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        int i7;
                        qy qyVar = qy.this;
                        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(qyVar.f39047d1);
                        Context context = qyVar.getContext();
                        if (E0) {
                            i7 = 0;
                        } else {
                            i7 = 2;
                        }
                        int i10 = i7;
                        org.telegram.ui.ActionBar.g2 g2Var = qyVar.Z1;
                        FrameLayout frameLayout = qyVar.f39091s;
                        ph.a aVar2 = aVar;
                        TLObject tLObject2 = tLObject;
                        TLRPC.StickerSet stickerSet2 = stickerSet;
                        TLRPC.Document document2 = document;
                        boolean z12 = z10;
                        d02.l2(context, tLObject2, document2, i10, g2Var, frameLayout, false, true, new di.o3(qyVar, aVar2, tLObject2, stickerSet2, document2, z12), false);
                        qyVar.J(aVar2, tLObject2, stickerSet2, document2, z12, true);
                    }
                });
            }
        }
    }

    @Override
    public final void K(int i7, float f10, float f11, te.c cVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 4;
        if (i7 == 0) {
            q(false);
            float f12 = 1.0f - this.f39034a.f57779e;
            dw dwVar = this.H0;
            dwVar.setAlpha(f12);
            if (f12 > 0.0f) {
                i12 = 0;
            } else {
                i12 = 4;
            }
            dwVar.setVisibility(i12);
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
            this.f39113y0.invalidate();
        } else if (i7 == 1) {
            l(false);
            float f14 = 1.0f - this.f39038b.f57779e;
            sv svVar = this.W;
            svVar.setAlpha(f14);
            if (f14 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            svVar.setVisibility(i10);
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

    public final void L(long j3, boolean z10, boolean z11) {
        int i7;
        View childAt;
        float f10;
        zb0 zb0Var = this.f39108x;
        if (zb0Var != null) {
            this.f39106w1 = z10;
            this.f39110x1 = z11;
            if (!z11 && !z10) {
                this.f39102v1 = 0L;
            } else {
                this.f39102v1 = j3;
            }
            if (z11) {
                i7 = 2;
            } else {
                i7 = 0;
            }
            LinearLayout linearLayout = zb0Var.d;
            if (i7 >= linearLayout.getChildCount()) {
                childAt = null;
            } else {
                childAt = linearLayout.getChildAt(i7);
            }
            if (childAt != null) {
                if (this.f39102v1 != 0) {
                    f10 = 0.15f;
                } else {
                    f10 = 1.0f;
                }
                childAt.setAlpha(f10);
                gw gwVar = this.h;
                if (z11) {
                    if (this.f39102v1 != 0 && gwVar.getCurrentItem() != 0) {
                        M(true, true);
                        R(false, true);
                        gwVar.x(0, false);
                    }
                } else if (this.f39102v1 != 0 && gwVar.getCurrentItem() != 1) {
                    M(false, true);
                    R(false, true);
                    gwVar.x(1, false);
                }
            }
        }
    }

    public final void M(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        hw hwVar = this.f39112y;
        if (!z10 || hwVar.getTag() != null) {
            if ((!z10 && hwVar.getTag() != null) || this.f39083p2) {
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
            hwVar.setTag(num);
            int i7 = 0;
            float f14 = 0.0f;
            if (z11) {
                if (z10) {
                    hwVar.setVisibility(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.G = animatorSet2;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(hwVar, View.ALPHA, f12);
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(hwVar, View.SCALE_X, f13);
                if (z10) {
                    f14 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(hwVar, View.SCALE_Y, f14));
                this.G.setDuration(200L);
                this.G.setInterpolator(kr.f36859g);
                this.G.addListener(new nw(this, z10, 0));
                this.G.start();
                return;
            }
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            hwVar.setAlpha(f10);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            hwVar.setScaleX(f11);
            if (z10) {
                f14 = 1.0f;
            }
            hwVar.setScaleY(f14);
            if (!z10) {
                i7 = 4;
            }
            hwVar.setVisibility(i7);
        }
    }

    public final void N(boolean z10) {
        Integer num;
        this.I = 0.0f;
        qx qxVar = this.f39099u1;
        if (qxVar != null && qxVar.z()) {
            z10 = false;
        }
        FrameLayout frameLayout = this.f39075n;
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
            AnimatorSet animatorSet = this.f39035a0;
            Integer num = null;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f39035a0 = null;
            }
            if (!z10) {
                num = 1;
            }
            view.setTag(num);
            float f10 = 0.0f;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f39035a0 = animatorSet2;
                if (z10) {
                    f10 = 1.0f;
                }
                animatorSet2.playTogether(ObjectAnimator.ofFloat(view, View.ALPHA, f10));
                this.f39035a0.setDuration(200L);
                this.f39035a0.setInterpolator(kr.f36859g);
                this.f39035a0.addListener(new x(this, 25));
                this.f39035a0.start();
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
            v4.t w10 = w(i7);
            int L0 = w10.L0();
            if (z10) {
                if (L0 == 1 || L0 == 2) {
                    w10.n0(0);
                    E(i7);
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
        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.f39047d1).O0(Long.valueOf(this.f39102v1));
        if (O0 != null) {
            di.xb xbVar = this.O0;
            if (z10) {
                if (!org.telegram.messenger.v3.N(O0) && (tL_chatBannedRights = O0.default_banned_rights) != null && (tL_chatBannedRights.send_stickers || (z11 && tL_chatBannedRights.send_plain))) {
                    org.telegram.ui.ActionBar.g2 g2Var = this.Z1;
                    if (!(g2Var instanceof org.telegram.ui.bn) || !((org.telegram.ui.bn) g2Var).Z6()) {
                        if (z11) {
                            xbVar.setText(org.telegram.messenger.gd.N0(2131749370, null));
                        } else if (z12) {
                            xbVar.setText(org.telegram.messenger.gd.N0(2131749369, null));
                        } else {
                            xbVar.setText(org.telegram.messenger.gd.N0(2131749363, null));
                        }
                    } else {
                        return;
                    }
                } else {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = O0.banned_rights;
                    if (tL_chatBannedRights2 == null) {
                        return;
                    }
                    if (org.telegram.messenger.g0.D1(tL_chatBannedRights2)) {
                        if (z11) {
                            xbVar.setText(org.telegram.messenger.gd.N0(2131753940, null));
                        } else if (z12) {
                            xbVar.setText(org.telegram.messenger.gd.N0(2131753966, null));
                        } else {
                            xbVar.setText(org.telegram.messenger.gd.N0(2131753931, null));
                        }
                    } else {
                        if (z11) {
                            xbVar.setText(org.telegram.messenger.gd.a0("AttachPlainRestricted", null, 2131753941, org.telegram.messenger.gd.v(O0.banned_rights.until_date)));
                        }
                        if (z12) {
                            xbVar.setText(org.telegram.messenger.gd.a0("AttachGifRestricted", null, 2131753967, org.telegram.messenger.gd.v(O0.banned_rights.until_date)));
                        } else {
                            xbVar.setText(org.telegram.messenger.gd.a0("AttachStickersRestricted", null, 2131753932, org.telegram.messenger.gd.v(O0.banned_rights.until_date)));
                        }
                    }
                }
                xbVar.setVisibility(0);
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
                f10 = xbVar.getAlpha();
            } else {
                f10 = 1.0f;
            }
            float f12 = 0.0f;
            if (!z10) {
                f11 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(xbVar, View.ALPHA, f10, f11);
            if (z10) {
                translationY = org.telegram.messenger.g0.L(12.0f);
            } else {
                translationY = xbVar.getTranslationY();
            }
            if (!z10) {
                f12 = org.telegram.messenger.g0.L(12.0f);
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(xbVar, View.TRANSLATION_Y, translationY, f12));
            h2.m0 m0Var = this.R2;
            if (m0Var != null) {
                org.telegram.messenger.g0.r(m0Var);
            }
            if (z10) {
                h2.m0 m0Var2 = new h2.m0(this, z11, z12, 4);
                this.R2 = m0Var2;
                org.telegram.messenger.g0.h3(m0Var2, 3500L);
            }
            this.Q2.setDuration(320L);
            this.Q2.setInterpolator(kr.h);
            this.Q2.start();
        }
    }

    public final void R(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        ImageView imageView = this.E;
        if (imageView != null && !this.f39086q2) {
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
                        this.H.setInterpolator(kr.f36859g);
                        this.H.addListener(new nw(this, z10, 1));
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
        org.telegram.ui.ActionBar.g2 g2Var;
        View view = (View) getParent();
        if (view != null) {
            float y10 = getY();
            if (getLayoutParams().height > 0) {
                measuredHeight = getLayoutParams().height;
            } else {
                measuredHeight = getMeasuredHeight();
            }
            float f10 = y10 + measuredHeight;
            if ((!org.telegram.messenger.g0.E && ((g2Var = this.Z1) == null || !g2Var.isInBubbleMode())) || this.W0) {
                L = view.getHeight();
            } else {
                L = org.telegram.messenger.g0.L(1.0f);
            }
            float f11 = f10 - L;
            int i7 = (this.f39094s2 > 0.0f ? 1 : (this.f39094s2 == 0.0f ? 0 : -1));
            FrameLayout frameLayout = this.f39075n;
            if (i7 >= 0) {
                f11 += getMeasuredHeight() - this.f39094s2;
            } else if (frameLayout.getTop() - f11 < 0.0f || !this.f39115y2) {
                f11 = 0.0f;
            }
            float W1 = (-f11) + org.telegram.messenger.g0.W1(this.F2.f57779e, org.telegram.messenger.g0.L(50.0f), -this.f39090r2);
            frameLayout.setTranslationY(W1);
            if (this.f39049e0) {
                this.f39087r.setTranslationY(W1);
            }
        }
    }

    public final void T() {
        dy dyVar;
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
        hv hvVar;
        int z21;
        int z22;
        int z23;
        int z24;
        int z25;
        int z26;
        boolean z27 = this.f39101v0;
        View view = this.f39104w;
        if (!z27) {
            setBackground(null);
            view.setBackground(null);
        } else if (!org.telegram.messenger.g0.E && !this.O1) {
            int i7 = org.telegram.ui.ActionBar.n6.f29871zf;
            setBackgroundColor(z(i7));
            if (this.f39049e0) {
                view.setBackgroundColor(z(i7));
            }
        } else {
            Drawable background = getBackground();
            int z28 = z(org.telegram.ui.ActionBar.n6.f29871zf);
            if (background != null && (background != this.H2 || z28 != this.I2)) {
                this.H2 = background;
                this.I2 = z28;
                background.setColorFilter(new PorterDuffColorFilter(z28, PorterDuff.Mode.MULTIPLY));
            }
        }
        vw vwVar = this.J;
        if (vwVar != null) {
            if (this.f39101v0) {
                vwVar.setBackgroundColor(z(org.telegram.ui.ActionBar.n6.f29871zf));
                this.P.setBackgroundColor(z(org.telegram.ui.ActionBar.n6.Cf));
            } else {
                vwVar.setBackground(null);
            }
        }
        iu iuVar = this.C1;
        if (iuVar != null) {
            iuVar.f36173c.a();
        }
        int i10 = 0;
        while (true) {
            dyVar = this.W;
            z10 = this.f39067j2;
            if (i10 >= 3) {
                break;
            }
            if (i10 == 0) {
                dyVar = this.H0;
            } else if (i10 != 1) {
                dyVar = this.f39081p0;
            }
            if (dyVar != null) {
                fq fqVar = dyVar.d;
                FrameLayout frameLayout = dyVar.f34485n;
                View view2 = dyVar.f34484f;
                if (this.f39101v0) {
                    view2.setBackgroundColor(z(org.telegram.ui.ActionBar.n6.f29871zf));
                } else {
                    view2.setBackground(null);
                }
                dyVar.f34483e.setBackgroundColor(z(org.telegram.ui.ActionBar.n6.Cf));
                ul0 ul0Var = dyVar.f34482c;
                if (z10) {
                    z23 = v(0.4f);
                } else {
                    z23 = z(org.telegram.ui.ActionBar.n6.Bf);
                }
                ul0Var.a(z23);
                Drawable background2 = frameLayout.getBackground();
                if (z10) {
                    z24 = v(0.06f);
                } else {
                    z24 = z(org.telegram.ui.ActionBar.n6.Af);
                }
                org.telegram.ui.ActionBar.n6.C1(z24, background2);
                frameLayout.invalidate();
                if (z10) {
                    z25 = v(0.45f);
                } else {
                    z25 = z(org.telegram.ui.ActionBar.n6.Bf);
                }
                fqVar.setHintTextColor(z25);
                if (z10) {
                    z26 = v(0.8f);
                } else {
                    z26 = z(org.telegram.ui.ActionBar.n6.G6);
                }
                fqVar.setTextColor(z26);
            }
            i10++;
        }
        Paint paint = this.f39096t1;
        if (paint != null) {
            paint.setColor(z(org.telegram.ui.ActionBar.n6.Sf));
        }
        dx dxVar = this.Q;
        if (dxVar != null) {
            dxVar.setGlowColor(z(org.telegram.ui.ActionBar.n6.f29871zf));
        }
        aw awVar = this.E0;
        if (awVar != null) {
            awVar.setGlowColor(z(org.telegram.ui.ActionBar.n6.f29871zf));
        }
        ew ewVar = this.C0;
        if (ewVar != null) {
            ewVar.setIndicatorColor(z(org.telegram.ui.ActionBar.n6.If));
            ewVar.setUnderlineColor(z(org.telegram.ui.ActionBar.n6.Cf));
            if (this.f39101v0) {
                ewVar.setBackgroundColor(z(org.telegram.ui.ActionBar.n6.f29871zf));
            } else {
                ewVar.setBackground(null);
            }
        }
        yw ywVar = this.f39084q0;
        if (ywVar != null) {
            ywVar.setIndicatorColor(z(org.telegram.ui.ActionBar.n6.If));
            ywVar.setUnderlineColor(z(org.telegram.ui.ActionBar.n6.Cf));
            if (this.f39101v0) {
                ywVar.setBackgroundColor(z(org.telegram.ui.ActionBar.n6.f29871zf));
            } else {
                ywVar.setBackground(null);
            }
        }
        if (z10) {
            z11 = v(0.6f);
        } else {
            z11 = z(org.telegram.ui.ActionBar.n6.Jf);
        }
        if (z11 != this.J2) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.J2 = z11;
        hw hwVar = this.f39112y;
        if (hwVar != null) {
            if (z12) {
                hwVar.setColorFilter(new PorterDuffColorFilter(z11, PorterDuff.Mode.MULTIPLY));
            }
            if (dyVar == null) {
                Drawable background3 = hwVar.getBackground();
                int i11 = org.telegram.ui.ActionBar.n6.f29871zf;
                org.telegram.ui.ActionBar.n6.H1(background3, z(i11), false);
                org.telegram.ui.ActionBar.n6.H1(hwVar.getBackground(), z(i11), true);
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
        di.xb xbVar = this.O0;
        if (xbVar != null) {
            if (xbVar.getBackground() instanceof ShapeDrawable) {
                ((ShapeDrawable) xbVar.getBackground()).getPaint().setColor(z(org.telegram.ui.ActionBar.n6.hg));
                xbVar.invalidate();
            }
            xbVar.setTextColor(z(org.telegram.ui.ActionBar.n6.f29516gg));
        }
        ux uxVar = this.f39068k0;
        if (uxVar != null) {
            wx wxVar = uxVar.f40492e;
            int i12 = org.telegram.ui.ActionBar.n6.Df;
            int z29 = z(i12);
            if (z29 != this.K2) {
                this.K2 = z29;
                wxVar.f41749a.setColorFilter(new PorterDuffColorFilter(z29, PorterDuff.Mode.MULTIPLY));
            }
            wxVar.f41750b.setTextColor(z(i12));
            wxVar.f41751c.setProgressColor(z(org.telegram.ui.ActionBar.n6.f29525h6));
        }
        int z30 = z(org.telegram.ui.ActionBar.n6.Fi);
        if (this.f39055f2 == null || z30 != this.L2) {
            this.L2 = z30;
            this.f39055f2 = new PorterDuffColorFilter(z30, PorterDuff.Mode.SRC_IN);
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
                z21 = z(org.telegram.ui.ActionBar.n6.Ff);
            }
            org.telegram.ui.ActionBar.n6.E1(drawable, z21, false);
            Drawable drawable2 = drawableArr[i13];
            if (z10) {
                z22 = v(0.8f);
            } else {
                z22 = z(org.telegram.ui.ActionBar.n6.Gf);
            }
            org.telegram.ui.ActionBar.n6.E1(drawable2, z22, true);
            i13++;
        }
        if (vwVar != null && (hvVar = vwVar.E) != null) {
            hvVar.d();
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
                z19 = z(org.telegram.ui.ActionBar.n6.Ef);
            }
            org.telegram.ui.ActionBar.n6.E1(drawable3, z19, false);
            Drawable drawable4 = drawableArr2[i14];
            if (z10) {
                z20 = v(0.8f);
            } else {
                z20 = z(org.telegram.ui.ActionBar.n6.Gf);
            }
            org.telegram.ui.ActionBar.n6.E1(drawable4, z20, true);
            i14++;
        }
        int i15 = 0;
        while (true) {
            Drawable[] drawableArr3 = this.f39036a1;
            if (i15 >= drawableArr3.length) {
                break;
            }
            Drawable drawable5 = drawableArr3[i15];
            if (z10) {
                z17 = v(0.4f);
            } else {
                z17 = z(org.telegram.ui.ActionBar.n6.Ef);
            }
            org.telegram.ui.ActionBar.n6.E1(drawable5, z17, false);
            Drawable drawable6 = drawableArr3[i15];
            if (z10) {
                z18 = v(0.8f);
            } else {
                z18 = z(org.telegram.ui.ActionBar.n6.Gf);
            }
            org.telegram.ui.ActionBar.n6.E1(drawable6, z18, true);
            i15++;
        }
        org.telegram.ui.ActionBar.w5 w5Var = this.f39041b2;
        if (w5Var != null) {
            if (z10) {
                z15 = v(0.4f);
            } else {
                z15 = z(org.telegram.ui.ActionBar.n6.Ff);
            }
            org.telegram.ui.ActionBar.n6.E1(w5Var, z15, false);
            if (z10) {
                z16 = v(0.8f);
            } else {
                z16 = z(org.telegram.ui.ActionBar.n6.Gf);
            }
            org.telegram.ui.ActionBar.n6.E1(w5Var, z16, true);
        }
        org.telegram.ui.ActionBar.w5 w5Var2 = this.f39045c2;
        if (w5Var2 != null) {
            if (z10) {
                z13 = v(0.4f);
            } else {
                z13 = z(org.telegram.ui.ActionBar.n6.If);
            }
            org.telegram.ui.ActionBar.n6.E1(w5Var2, z13, false);
            if (z10) {
                z14 = v(0.8f);
            } else {
                z14 = z(org.telegram.ui.ActionBar.n6.If);
            }
            org.telegram.ui.ActionBar.n6.E1(w5Var2, z14, true);
        }
    }

    public final void U() {
        dx dxVar = this.Q;
        if (dxVar != null) {
            for (int i7 = 0; i7 < dxVar.getChildCount(); i7++) {
                View childAt = dxVar.getChildAt(i7);
                if (childAt instanceof ix) {
                    ((ix) childAt).a(true);
                }
            }
        }
    }

    public final void V(int i7) {
        int i10;
        if (!this.f39056g0) {
            int i11 = -1;
            if (i7 != -1) {
                int size = getRecentEmoji().size() + (this.f39049e0 ? 1 : 0);
                ax axVar = this.S;
                int i12 = axVar.f33566c;
                ArrayList arrayList = axVar.f33574y;
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
                        String[][] strArr = org.telegram.messenger.k6.f25090f;
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
                        ArrayList<ex> emojipacks = getEmojipacks();
                        int size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 < 0) {
                                break;
                            } else if (((Integer) arrayList.get(size2)).intValue() <= i7) {
                                ex exVar = (ex) this.f39089r1.get(size2);
                                while (i13 < emojipacks.size()) {
                                    long j3 = emojipacks.get(i13).f34856b.f28519id;
                                    long j10 = exVar.f34856b.f28519id;
                                    if (j3 == j10 && (!exVar.f34860g || (!exVar.f34859f && !this.f39085q1.contains(Long.valueOf(j10))))) {
                                        char[] cArr = org.telegram.messenger.k6.f25086a;
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
        cy cyVar;
        int i10;
        boolean z12;
        boolean z13;
        yw ywVar = this.f39084q0;
        int currentPosition = ywVar.getCurrentPosition();
        int i11 = this.f39092s0;
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
        boolean isEmpty = this.f39066j1.isEmpty();
        ywVar.d(false);
        this.f39092s0 = -2;
        this.f39095t0 = -2;
        this.f39098u0 = -2;
        Drawable[] drawableArr = this.f39036a1;
        if (!isEmpty) {
            this.f39092s0 = 0;
            ywVar.b(0, drawableArr[0]).setContentDescription(org.telegram.messenger.gd.N0(2131746168, null));
            i7 = 1;
        } else {
            i7 = 0;
        }
        this.f39095t0 = i7;
        ywVar.b(1, drawableArr[1]).setContentDescription(org.telegram.messenger.gd.N0(2131750822, null));
        this.f39098u0 = i7 + 1;
        org.telegram.messenger.g0.L(13.0f);
        org.telegram.messenger.g0.L(11.0f);
        int i12 = this.f39047d1;
        ArrayList arrayList = org.telegram.messenger.mp.u1(i12).f25731e4;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            String str = (String) arrayList.get(i13);
            org.telegram.messenger.f6 g10 = org.telegram.messenger.j6.g(str);
            if (g10 != null) {
                TLRPC.Document V = org.telegram.messenger.ri.d0(i12).V(str);
                String i14 = i5.c.i(i13 + 3, "tab");
                int i15 = ywVar.f35498y;
                ywVar.f35498y = i15 + 1;
                rv0 rv0Var = (rv0) ywVar.f35486n.get(i14);
                if (rv0Var != null) {
                    ywVar.g(i14, rv0Var, i15);
                    i10 = currentPosition;
                    z12 = z11;
                } else {
                    i10 = currentPosition;
                    z12 = z11;
                    rv0Var = new rv0(ywVar.getContext(), 2);
                    rv0Var.setFocusable(true);
                    rv0Var.setOnClickListener(new zk0(ywVar, 2));
                    rv0Var.setExpanded(ywVar.f35480g0);
                    rv0Var.a(ywVar.f35483j0);
                    ywVar.f35476e.addView(rv0Var, i15);
                }
                rv0Var.d = false;
                rv0Var.setTag(2131296463, Integer.valueOf(i15));
                rv0Var.setTag(2131296593, g10);
                rv0Var.setTag(2131296587, V);
                if (i15 == ywVar.E) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                rv0Var.setSelected(z13);
                ywVar.h.put(i14, rv0Var);
                rv0Var.setContentDescription(str);
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
        ywVar.h();
        ywVar.q();
        if (z10 && isEmpty) {
            ywVar.m(this.f39095t0);
            xv xvVar = this.f39081p0;
            if (xvVar != null && (cyVar = xvVar.f34486r) != null) {
                cyVar.I1(null);
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = r0.i0.f56367a;
        if (ywVar.isLaidOut()) {
            if (!isEmpty && !z14) {
                ywVar.k(i16 + 1, 0);
            } else if (isEmpty && z14) {
                ywVar.k(i16 - 1, 0);
            }
        }
    }

    public final void X() {
        ux uxVar;
        int size = this.f39066j1.size();
        long p10 = org.telegram.messenger.ri.p(Integer.MAX_VALUE, this.f39066j1);
        ArrayList arrayList = new ArrayList(org.telegram.messenger.ri.d0(this.f39047d1).f26720j0);
        this.f39066j1 = arrayList;
        long p11 = org.telegram.messenger.ri.p(Integer.MAX_VALUE, arrayList);
        if ((this.f39084q0 != null && size == 0 && !this.f39066j1.isEmpty()) || (size != 0 && this.f39066j1.isEmpty())) {
            W();
        }
        if ((size != this.f39066j1.size() || p10 != p11) && (uxVar = this.f39078o0) != null) {
            uxVar.f();
        }
    }

    public final void Y(boolean z10) {
        boolean z11;
        TLRPC.Document document;
        boolean z12;
        int i7;
        boolean z13;
        org.telegram.ui.ActionBar.i6 i6Var;
        boolean z14;
        boolean z15;
        ArrayList<TLRPC.Document> arrayList;
        boolean z16;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet;
        int i10;
        ew ewVar = this.C0;
        if (ewVar != null) {
            org.telegram.ui.b61 b61Var = ewVar.f35476e;
            if (ewVar.f35493s != null) {
                return;
            }
            this.G1 = -2;
            this.H1 = -2;
            this.I1 = -2;
            this.J1 = -2;
            int i11 = 0;
            this.f39053f0 = false;
            this.F1 = 0;
            int currentPosition = ewVar.getCurrentPosition();
            if (getParent() != null && getVisibility() == 0 && (this.f39117z1.size() != 0 || this.A1.size() != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            ewVar.d(z11);
            int i12 = this.f39047d1;
            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i12);
            SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(i12).i7;
            ArrayList arrayList3 = this.n1;
            arrayList3.clear();
            ArrayList arrayList4 = d02.f26740t0[0];
            int size = arrayList4.size();
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList4.get(i13);
                if (!d02.E0(stickerSetCovered.set.f28519id, true)) {
                    arrayList3.add(stickerSetCovered);
                }
            }
            oy oyVar = this.G0;
            if (oyVar != null) {
                oyVar.f();
            }
            boolean isEmpty = arrayList4.isEmpty();
            long j3 = 0;
            Drawable[] drawableArr = this.Z0;
            org.telegram.ui.ActionBar.i6 i6Var2 = null;
            if (!isEmpty && (arrayList3.isEmpty() || sharedPreferences.getLong("featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList4.get(0)).set.f28519id)) {
                if (d02.f26744v0[0].isEmpty()) {
                    i10 = 2;
                } else {
                    i10 = 3;
                }
                rv0 c10 = ewVar.c(i10, drawableArr[i10]);
                c10.h.setText(org.telegram.messenger.gd.N0(2131750819, null));
                c10.setContentDescription(org.telegram.messenger.gd.N0(2131750821, null));
                int i14 = this.F1;
                this.I1 = i14;
                this.F1 = i14 + 1;
            }
            if (!this.l1.isEmpty()) {
                int i15 = this.F1;
                this.H1 = i15;
                this.F1 = i15 + 1;
                rv0 c11 = ewVar.c(1, drawableArr[1]);
                c11.h.setText(org.telegram.messenger.gd.N0(2131750826, null));
                c11.setContentDescription(org.telegram.messenger.gd.N0(2131750829, null));
            }
            if (!this.f39069k1.isEmpty()) {
                int i16 = this.F1;
                this.G1 = i16;
                this.F1 = i16 + 1;
                rv0 c12 = ewVar.c(0, drawableArr[0]);
                c12.h.setText(org.telegram.messenger.gd.N0(2131746167, null));
                c12.setContentDescription(org.telegram.messenger.gd.N0(2131746168, null));
            }
            ArrayList arrayList5 = this.f39050e1;
            arrayList5.clear();
            this.f39063i1 = null;
            this.f39057g1 = -1;
            this.f39054f1 = -10;
            if (this.G2 == null || z10) {
                this.G2 = new ArrayList(d02.u0(0));
            }
            ArrayList arrayList6 = this.G2;
            int i17 = 0;
            while (true) {
                TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f39114y1;
                if (i17 >= stickerSetCoveredArr.length) {
                    break;
                }
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCoveredArr[i17];
                long j10 = j3;
                if (stickerSetCovered2 != null) {
                    TLRPC.TL_messages_stickerSet q02 = d02.q0(stickerSetCovered2.set.f28519id);
                    if (q02 != null && (stickerSet = q02.set) != null && !stickerSet.archived) {
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
            ArrayList y02 = org.telegram.messenger.mp.u1(i12).y0(arrayList6);
            for (int i18 = 0; i18 < y02.size(); i18++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) y02.get(i18);
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                if ((stickerSet2 == null || !stickerSet2.archived) && (arrayList2 = tL_messages_stickerSet2.documents) != null && !arrayList2.isEmpty()) {
                    arrayList5.add(tL_messages_stickerSet2);
                }
            }
            if (this.K1 != null) {
                long j12 = org.telegram.messenger.mp.u1(i12).i7.getLong("group_hide_stickers_" + this.K1.f28493id, -1L);
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i12).O0(Long.valueOf(this.K1.f28493id));
                if (O0 != null && this.K1.stickerset != null && org.telegram.messenger.v3.N(O0)) {
                    TLRPC.StickerSet stickerSet3 = this.K1.stickerset;
                    if (stickerSet3 != null) {
                        if (j12 == stickerSet3.f28519id) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        this.f39060h1 = z16;
                    }
                } else {
                    if (j12 != -1) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    this.f39060h1 = z15;
                }
                TLRPC.ChatFull chatFull = this.K1;
                TLRPC.StickerSet stickerSet4 = chatFull.stickerset;
                if (stickerSet4 != null) {
                    TLRPC.TL_messages_stickerSet a02 = d02.a0(stickerSet4);
                    if (a02 != null && (arrayList = a02.documents) != null && !arrayList.isEmpty() && a02.set != null) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = new TLRPC.TL_messages_stickerSet();
                        tL_messages_stickerSet3.documents = a02.documents;
                        tL_messages_stickerSet3.packs = a02.packs;
                        tL_messages_stickerSet3.set = a02.set;
                        if (this.f39060h1) {
                            this.f39054f1 = arrayList5.size();
                            arrayList5.add(tL_messages_stickerSet3);
                        } else {
                            this.f39054f1 = 0;
                            arrayList5.add(0, tL_messages_stickerSet3);
                        }
                        if (!this.K1.can_set_stickers) {
                            tL_messages_stickerSet3 = null;
                        }
                        this.f39063i1 = tL_messages_stickerSet3;
                    }
                } else if (chatFull.can_set_stickers) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                    if (this.f39060h1) {
                        this.f39054f1 = arrayList5.size();
                        arrayList5.add(tL_messages_stickerSet4);
                    } else {
                        this.f39054f1 = 0;
                        arrayList5.add(0, tL_messages_stickerSet4);
                    }
                }
            }
            int i19 = 0;
            while (i19 < arrayList5.size()) {
                if (i19 == this.f39054f1) {
                    TLRPC.Chat O02 = org.telegram.messenger.mp.u1(i12).O0(Long.valueOf(this.K1.f28493id));
                    if (O02 == null) {
                        arrayList5.remove(i11);
                        i19--;
                    } else {
                        this.f39053f0 = true;
                        String str = "chat" + O02.f28492id;
                        int i20 = ewVar.f35498y;
                        ewVar.f35498y = i20 + 1;
                        rv0 rv0Var = (rv0) ewVar.f35486n.get(str);
                        if (rv0Var != null) {
                            ewVar.g(str, rv0Var, i20);
                        } else {
                            rv0Var = new rv0(ewVar.getContext(), i11);
                            rv0Var.setFocusable(true);
                            rv0Var.setOnClickListener(new zk0(ewVar, i11));
                            b61Var.addView(rv0Var, i20);
                            rv0Var.f39426x = true;
                            a9 a9Var = new a9(i6Var2);
                            a9Var.u(org.telegram.messenger.g0.L(14.0f));
                            a9Var.q(O02);
                            int i21 = ewVar.f35469a;
                            p9 p9Var = rv0Var.f39420e;
                            p9Var.setLayerNum(i21);
                            p9Var.f(O02, a9Var);
                            p9Var.setAspectFit(true);
                            rv0Var.setExpanded(ewVar.f35480g0);
                            rv0Var.a(ewVar.f35483j0);
                            rv0Var.h.setText(O02.title);
                        }
                        rv0Var.d = true;
                        rv0Var.setTag(2131296463, Integer.valueOf(i20));
                        if (i20 == ewVar.E) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        rv0Var.setSelected(z14);
                        ewVar.h.put(str, rv0Var);
                    }
                    i7 = 0;
                    i6Var = null;
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) arrayList5.get(i19);
                    TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet5.set;
                    if (stickerSet5 != null && stickerSet5.thumb_document_id != j11) {
                        for (int i22 = 0; i22 < tL_messages_stickerSet5.documents.size(); i22++) {
                            document = tL_messages_stickerSet5.documents.get(i22);
                            if (document != null && tL_messages_stickerSet5.set.thumb_document_id == document.f28498id) {
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
                    String str2 = "set" + tL_messages_stickerSet5.set.f28519id;
                    int i23 = ewVar.f35498y;
                    ewVar.f35498y = i23 + 1;
                    rv0 rv0Var2 = (rv0) ewVar.f35486n.get(str2);
                    if (rv0Var2 != null) {
                        ewVar.g(str2, rv0Var2, i23);
                    } else {
                        rv0Var2 = new rv0(ewVar.getContext(), 0);
                        rv0Var2.setFocusable(true);
                        rv0Var2.setOnClickListener(new zk0(ewVar, 1));
                        rv0Var2.setExpanded(ewVar.f35480g0);
                        rv0Var2.a(ewVar.f35483j0);
                        b61Var.addView(rv0Var2, i23);
                    }
                    rv0Var2.f39420e.setLayerNum(ewVar.f35469a);
                    i7 = 0;
                    rv0Var2.d = false;
                    rv0Var2.setTag(w10);
                    rv0Var2.setTag(2131296463, Integer.valueOf(i23));
                    rv0Var2.setTag(2131296593, tL_messages_stickerSet5);
                    rv0Var2.setTag(2131296587, document);
                    if (i23 == ewVar.E) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    rv0Var2.setSelected(z13);
                    ewVar.h.put(str2, rv0Var2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(tL_messages_stickerSet5.set.title);
                    sb2.append(", ");
                    i6Var = null;
                    sb2.append(org.telegram.messenger.gd.N0(2131754756, null));
                    rv0Var2.setContentDescription(sb2.toString());
                }
                i19++;
                i11 = i7;
                i6Var2 = i6Var;
            }
            ewVar.h();
            ewVar.q();
            if (currentPosition != 0) {
                ewVar.k(currentPosition, currentPosition);
            }
            o();
        }
    }

    public final void Z() {
        boolean z10;
        int i7;
        fw fwVar = this.D0;
        ew ewVar = this.C0;
        if (ewVar != null && fwVar == null && this.f39099u1 != null) {
            ewVar.setTranslationY(this.f39099u1.p() * (-org.telegram.messenger.g0.L(50.0f)));
        }
        if (fwVar == null) {
            return;
        }
        if (getVisibility() == 0 && this.L0 && this.f39099u1.p() != 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        fwVar.setVisibility(i7);
        if (z10) {
            Rect rect = this.f39118z2;
            rect.setEmpty();
            this.h.getChildVisibleRect(this.f39113y0, rect, null);
            float p10 = this.f39099u1.p() * org.telegram.messenger.g0.L(50.0f);
            int i10 = rect.left;
            if (i10 != 0 || p10 != 0.0f) {
                this.Y1 = false;
            }
            fwVar.setTranslationX(i10);
            float translationY = (((getTranslationY() + getTop()) - fwVar.getTop()) - ewVar.getExpandedOffset()) - p10;
            if (fwVar.getTranslationY() != translationY) {
                fwVar.setTranslationY(translationY);
                fwVar.invalidate();
            }
        }
        if (this.Y1 && z10 && this.Q0) {
            ewVar.i(true, this.X1);
            return;
        }
        this.Y1 = false;
        ewVar.i(false, this.X1);
    }

    public final void a0() {
        int i7;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        LongSparseArray longSparseArray = this.A1;
        LongSparseArray longSparseArray2 = this.f39117z1;
        int i10 = this.f39047d1;
        aw awVar = this.E0;
        if (awVar != null) {
            try {
                int childCount = awVar.getChildCount();
                int i11 = 0;
                int i12 = 0;
                while (i12 < childCount) {
                    View childAt = awVar.getChildAt(i12);
                    if (!(childAt instanceof org.telegram.ui.Cells.v3) || ((mj0) awVar.T(childAt)) == null) {
                        i7 = i12;
                    } else {
                        org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) childAt;
                        ArrayList arrayList = org.telegram.messenger.ri.d0(i10).f26744v0[i11];
                        TLRPC.StickerSetCovered stickerSet = v3Var.getStickerSet();
                        if (arrayList != null && arrayList.contains(Long.valueOf(stickerSet.set.f28519id))) {
                            z10 = true;
                        } else {
                            z10 = i11;
                        }
                        int i13 = i11;
                        while (true) {
                            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.f39114y1;
                            if (i13 < stickerSetCoveredArr.length) {
                                TLRPC.StickerSetCovered stickerSetCovered = stickerSetCoveredArr[i13];
                                if (stickerSetCovered != null) {
                                    i7 = i12;
                                    if (stickerSetCovered.set.f28519id == stickerSet.set.f28519id) {
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
                        v3Var.c(stickerSet, z10, true, 0, 0, z11);
                        if (z10) {
                            org.telegram.messenger.ri.d0(i10).h1(stickerSet.set.f28519id);
                        }
                        if (longSparseArray2.indexOfKey(stickerSet.set.f28519id) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (longSparseArray.indexOfKey(stickerSet.set.f28519id) >= 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 || z13) {
                            if (z12 && v3Var.f32242r) {
                                longSparseArray2.remove(stickerSet.set.f28519id);
                                z12 = false;
                            } else if (z13 && !v3Var.f32242r) {
                                longSparseArray.remove(stickerSet.set.f28519id);
                            }
                        }
                        if (!z11 && z12) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        v3Var.b(z14, true);
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
        this.f39094s2 = f10;
        S();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        org.telegram.messenger.w10 w10Var;
        TLRPC.StickerSet stickerSet;
        int i11 = org.telegram.messenger.ks.f25317x0;
        ax axVar = this.S;
        mv mvVar = this.S2;
        if (i7 == i11) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.f39116z0 != null) {
                    Y(((Boolean) objArr[1]).booleanValue());
                    a0();
                    D();
                    o();
                }
            } else if (((Integer) objArr[0]).intValue() == 5) {
                if (((Boolean) objArr[1]).booleanValue()) {
                    org.telegram.messenger.g0.r(mvVar);
                    org.telegram.messenger.g0.h3(mvVar, 100L);
                    return;
                }
                axVar.F(false);
            }
        } else if (i7 == org.telegram.messenger.ks.f25287s3) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.K1;
            if (chatFull != null && chatFull.f28493id == longValue && booleanValue) {
                axVar.F(true);
            }
        } else if (i7 == org.telegram.messenger.ks.X0) {
            boolean booleanValue2 = ((Boolean) objArr[0]).booleanValue();
            int intValue = ((Integer) objArr[1]).intValue();
            if (booleanValue2 || intValue == 0 || intValue == 2) {
                k(booleanValue2);
            }
        } else if (i7 == org.telegram.messenger.ks.f25331z0) {
            a0();
            zb0 zb0Var = this.f39108x;
            if (zb0Var != null) {
                int childCount = zb0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    zb0Var.getChildAt(i12).invalidate();
                }
            }
            Y(false);
        } else if (i7 == org.telegram.messenger.ks.A0) {
            if (axVar != null) {
                axVar.F(false);
            }
        } else {
            int i13 = org.telegram.messenger.ks.B0;
            px pxVar = this.T;
            if (i7 == i13) {
                Long l10 = (Long) objArr[0];
                long longValue2 = l10.longValue();
                if (objArr.length > 1) {
                    tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) objArr[1];
                } else {
                    tL_messages_stickerSet = null;
                }
                if (tL_messages_stickerSet != null) {
                    ly lyVar = this.A0;
                    if (lyVar != null && lyVar.d == longValue2 && lyVar.f37252f.size() < tL_messages_stickerSet.documents.size()) {
                        lyVar.f37252f = tL_messages_stickerSet.documents;
                        lyVar.f();
                    }
                    if (pxVar != null && pxVar.d == longValue2 && pxVar.f38603f.size() < tL_messages_stickerSet.documents.size()) {
                        pxVar.f38603f = tL_messages_stickerSet.documents;
                        pxVar.f();
                    }
                }
                TLRPC.ChatFull chatFull2 = this.K1;
                if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.f28519id == longValue2) {
                    Y(false);
                }
                HashMap hashMap = this.f39093s1;
                if (hashMap.containsKey(l10) && objArr.length >= 2 && ((org.telegram.messenger.w10) hashMap.get(l10)) != null && tL_messages_stickerSet != null && (w10Var = (org.telegram.messenger.w10) hashMap.remove(l10)) != null) {
                    w10Var.a(tL_messages_stickerSet);
                }
                org.telegram.messenger.g0.r(mvVar);
                org.telegram.messenger.g0.h3(mvVar, 100L);
                return;
            }
            int i14 = org.telegram.messenger.ks.f25247l4;
            dx dxVar = this.Q;
            if (i7 == i14) {
                aw awVar = this.E0;
                if (awVar != null) {
                    int childCount2 = awVar.getChildCount();
                    for (int i15 = 0; i15 < childCount2; i15++) {
                        View childAt = awVar.getChildAt(i15);
                        if ((childAt instanceof org.telegram.ui.Cells.j8) || (childAt instanceof org.telegram.ui.Cells.z7)) {
                            childAt.invalidate();
                        }
                    }
                }
                if (dxVar != null) {
                    dxVar.invalidate();
                    int childCount3 = dxVar.getChildCount();
                    for (int i16 = 0; i16 < childCount3; i16++) {
                        View childAt2 = dxVar.getChildAt(i16);
                        if (childAt2 instanceof yx) {
                            childAt2.invalidate();
                        }
                    }
                }
                iu iuVar = this.C1;
                if (iuVar != null) {
                    iuVar.f36173c.invalidate();
                }
                yw ywVar = this.f39084q0;
                if (ywVar != null) {
                    org.telegram.ui.b61 b61Var = ywVar.f35476e;
                    int childCount4 = b61Var.getChildCount();
                    for (int i17 = 0; i17 < childCount4; i17++) {
                        b61Var.getChildAt(i17).invalidate();
                    }
                }
            } else if (i7 == org.telegram.messenger.ks.L2) {
                if (dxVar != null && this.f39049e0) {
                    if ((this.W.f34482c.f40411k == 2 || dxVar.getAdapter() == pxVar) && !TextUtils.isEmpty(pxVar.f38607w)) {
                        pxVar.F(pxVar.f38607w, true);
                    }
                }
            } else if (i7 == org.telegram.messenger.ks.f25232i5) {
                if (axVar != null) {
                    axVar.F(false);
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
            if (this.f39075n.getVisibility() != 8 && !this.f39101v0 && this.f39109x0) {
                canvas.drawColor(i0.a.o(-1, 25));
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            float R0 = org.telegram.messenger.g0.R0(this.f39090r2);
            if (R0 > 0.0f) {
                int r12 = org.telegram.ui.ActionBar.n6.r1(R0, z(org.telegram.ui.ActionBar.n6.f29871zf));
                int i7 = this.B2;
                GradientDrawable gradientDrawable = this.A2;
                if (i7 != r12) {
                    gradientDrawable.setColors(new int[]{r12, org.telegram.ui.ActionBar.n6.r1(0.66f, r12), i0.a.o(r12, 0)});
                    this.B2 = r12;
                }
                gradientDrawable.setBounds(0, getMeasuredHeight() - this.f39090r2, getMeasuredWidth(), getMeasuredHeight());
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

    public ArrayList<ex> getEmojipacks() {
        ArrayList<ex> arrayList = new ArrayList<>();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f39089r1;
            if (i7 < arrayList2.size()) {
                ex exVar = (ex) arrayList2.get(i7);
                boolean z10 = exVar.f34860g;
                ArrayList arrayList3 = this.f39085q1;
                if ((!z10 && (exVar.f34859f || arrayList3.contains(Long.valueOf(exVar.f34856b.f28519id)))) || (exVar.f34860g && !exVar.f34859f && !arrayList3.contains(Long.valueOf(exVar.f34856b.f28519id)))) {
                    arrayList.add(exVar);
                }
                i7++;
            } else {
                return arrayList;
            }
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.d2) {
            return org.telegram.messenger.j6.f24926i;
        }
        if (this.C2 == null) {
            this.C2 = new ArrayList();
        }
        if (org.telegram.messenger.j6.f24926i.size() != this.D2) {
            this.C2.clear();
            int i7 = 0;
            while (true) {
                ArrayList arrayList = org.telegram.messenger.j6.f24926i;
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
        ew ewVar = this.C0;
        if (ewVar == null) {
            return 0.0f;
        }
        return ewVar.getExpandedOffset();
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
                        ArrayList arrayList2 = org.telegram.messenger.j6.f24926i;
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
        ow owVar = new ow(getContext(), i10);
        owVar.f59190a = !z10 ? 1 : 0;
        w(i7).w0(owVar);
    }

    public final void k(boolean z10) {
        if (z10) {
            X();
            return;
        }
        int size = this.f39069k1.size();
        int size2 = this.l1.size();
        int i7 = this.f39047d1;
        this.f39069k1 = org.telegram.messenger.ri.d0(i7).k0(0, true);
        this.l1 = org.telegram.messenger.ri.d0(i7).k0(2, false);
        if (org.telegram.messenger.i10.i(i7).q()) {
            this.f39073m1 = org.telegram.messenger.ri.d0(i7).k0(7, false);
        } else {
            this.f39073m1 = new ArrayList();
        }
        for (int i10 = 0; i10 < this.l1.size(); i10++) {
            TLRPC.Document document = (TLRPC.Document) this.l1.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 < this.f39069k1.size()) {
                    TLRPC.Document document2 = (TLRPC.Document) this.f39069k1.get(i11);
                    if (document2.dc_id == document.dc_id && document2.f28498id == document.f28498id) {
                        this.f39069k1.remove(i11);
                        break;
                    }
                    i11++;
                }
            }
        }
        if (org.telegram.messenger.mp.u1(i7).K3()) {
            int i12 = 0;
            while (i12 < this.l1.size()) {
                if (org.telegram.messenger.fj.X3((TLRPC.Document) this.l1.get(i12))) {
                    this.l1.remove(i12);
                    i12--;
                }
                i12++;
            }
            int i13 = 0;
            while (i13 < this.f39069k1.size()) {
                if (org.telegram.messenger.fj.X3((TLRPC.Document) this.f39069k1.get(i13))) {
                    this.f39069k1.remove(i13);
                    i13--;
                }
                i13++;
            }
        }
        if (size != this.f39069k1.size() || size2 != this.l1.size()) {
            Y(false);
        }
        iy iyVar = this.f39116z0;
        if (iyVar != null) {
            iyVar.f();
        }
        o();
    }

    public final void l(boolean z10) {
        int i7;
        boolean z11;
        qx qxVar = this.f39099u1;
        te.a aVar = this.f39038b;
        dx dxVar = this.Q;
        sv svVar = this.W;
        if (qxVar != null && qxVar.z()) {
            v4.f1 K = dxVar.K(0);
            if (K == null) {
                dy.a(svVar, true, !z10);
            } else {
                if (K.f59245a.getTop() < dxVar.getPaddingTop()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                dy.a(svVar, z11, !z10);
            }
            O(false, !z10);
            svVar.setTranslationY(aVar.f57779e * org.telegram.messenger.g0.L(15.0f));
        } else if (svVar != null && dxVar != null) {
            v4.f1 K2 = dxVar.K(0);
            if (K2 != null) {
                i7 = K2.f59245a.getTop();
            } else {
                i7 = -this.f39044c1;
            }
            svVar.setTranslationY((aVar.f57779e * org.telegram.messenger.g0.L(15.0f)) + i7);
            svVar.f34480a.a(false, !z10);
            m(Math.round(this.J.getTranslationY()));
        }
    }

    public final void m(int i7) {
        ObjectAnimator objectAnimator = this.S0[1];
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        boolean z10 = false;
        v4.f1 K = this.Q.K(0);
        int L = org.telegram.messenger.g0.L(38.0f) + i7;
        if (L > 0 && (K == null || K.f59245a.getBottom() < L)) {
            z10 = true;
        }
        O(z10, !this.L1);
    }

    public final void n(int i7, View view) {
        dx dxVar;
        v4.f1 K;
        int i10;
        vw vwVar = this.J;
        int[] iArr = this.R0;
        if (view == null) {
            iArr[1] = 0;
            vwVar.setTranslationY(0);
        } else if (view.getVisibility() == 0 && !this.f39056g0) {
            qx qxVar = this.f39099u1;
            if (qxVar == null || !qxVar.z()) {
                if (i7 > 0 && (dxVar = this.Q) != null && dxVar.getVisibility() == 0 && (K = dxVar.K(0)) != null) {
                    int top = K.f59245a.getTop();
                    if (this.f39049e0) {
                        i10 = this.f39044c1;
                    } else {
                        i10 = 0;
                    }
                    if (top + i10 >= dxVar.getPaddingTop()) {
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
                vwVar.setTranslationY(Math.max(-org.telegram.messenger.g0.L(36.0f), iArr[1]));
            }
        }
    }

    public final void o() {
        int L0;
        ew ewVar = this.C0;
        if (ewVar != null && (L0 = this.F0.L0()) != -1) {
            int i7 = this.H1;
            if (i7 <= 0 && (i7 = this.G1) <= 0) {
                i7 = this.F1;
            }
            ewVar.k(this.f39116z0.F(L0), i7);
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
        xi.e eVar2 = (xi.e) new org.telegram.messenger.js(org.telegram.messenger.ks.f(this.f39047d1), this).f25029b;
        eVar2.f(org.telegram.messenger.ks.f25247l4);
        eVar2.c(org.telegram.messenger.ks.L2);
        eVar2.c(org.telegram.messenger.ks.f25287s3);
        this.N2 = eVar2;
        if (this.f39116z0 != null) {
            eVar2.c(org.telegram.messenger.ks.f25317x0);
            eVar2.c(org.telegram.messenger.ks.X0);
            eVar2.c(org.telegram.messenger.ks.f25331z0);
            eVar2.c(org.telegram.messenger.ks.B0);
            eVar2.c(org.telegram.messenger.ks.f25232i5);
            org.telegram.messenger.g0.g3(new mv(this, 0));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        iu iuVar = this.C1;
        if (iuVar != null && iuVar.isShowing()) {
            iuVar.dismiss();
        }
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        if (p10.f50414l == this.f39061h2) {
            p10.W = null;
            p10.f50401a0 = null;
            p10.Y = null;
            p10.f50414l = null;
            p10.f50405c0 = null;
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
        View view = this.f39104w;
        boolean z11 = this.f39049e0;
        if (!z10 && !this.O1) {
            if (this.M1 != 0) {
                if (!this.M2) {
                    setOutlineProvider(null);
                    setClipToOutline(false);
                    setElevation(0.0f);
                }
                if (this.f39101v0) {
                    int i11 = org.telegram.ui.ActionBar.n6.f29871zf;
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
            setBackgroundResource(2131232743);
            Drawable background = getBackground();
            int i12 = org.telegram.ui.ActionBar.n6.f29871zf;
            background.setColorFilter(new PorterDuffColorFilter(z(i12), PorterDuff.Mode.MULTIPLY));
            if (z11 && this.f39101v0) {
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
                this.C0.k(this.f39116z0.F(L02), i11);
            }
        } else if (i7 == 2) {
            v4.i0 adapter = this.f39062i0.getAdapter();
            ux uxVar = this.f39078o0;
            if (adapter == uxVar && uxVar.J >= 0 && this.f39095t0 >= 0 && this.f39092s0 >= 0 && (L0 = this.f39065j0.L0()) != -1) {
                if (L0 >= uxVar.J) {
                    i10 = this.f39095t0;
                } else {
                    i10 = this.f39092s0;
                }
                this.f39084q0.k(i10, 0);
            }
        }
    }

    public final void q(boolean z10) {
        int i7;
        qx qxVar = this.f39099u1;
        te.a aVar = this.f39034a;
        aw awVar = this.E0;
        boolean z11 = false;
        dw dwVar = this.H0;
        if (qxVar != null && qxVar.z()) {
            v4.f1 K = awVar.K(0);
            if (K == null) {
                dy.a(dwVar, true, !z10);
            } else {
                if (K.f59245a.getTop() < awVar.getPaddingTop()) {
                    z11 = true;
                }
                dy.a(dwVar, z11, !z10);
            }
            dwVar.setTranslationY(aVar.f57779e * org.telegram.messenger.g0.L(15.0f));
        } else if (dwVar != null && awVar != null) {
            v4.f1 K2 = awVar.K(0);
            if (K2 != null) {
                i7 = K2.f59245a.getTop();
            } else {
                i7 = -this.f39044c1;
            }
            dwVar.setTranslationY((aVar.f57779e * org.telegram.messenger.g0.L(15.0f)) + i7);
            dwVar.f34480a.a(false, !z10);
        }
    }

    public final void r() {
        HashMap hashMap = org.telegram.messenger.j6.f24920a;
        org.telegram.messenger.mp.f1().edit().putBoolean("filled_default", true).commit();
        org.telegram.messenger.j6.h.clear();
        org.telegram.messenger.j6.f24926i.clear();
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
        dy dyVar;
        v4.c0 c0Var;
        View view;
        ek0 ek0Var;
        int i7;
        int i10;
        TLRPC.TL_messages_stickerSet q02;
        iy iyVar;
        int E;
        AnimatorSet animatorSet = this.N0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.N0 = null;
        }
        int currentItem = this.h.getCurrentItem();
        int i11 = 2;
        if (currentItem == 2 && j3 != -1 && (q02 = org.telegram.messenger.ri.d0(this.f39047d1).q0(j3)) != null && (E = (iyVar = this.f39116z0).E(q02)) >= 0 && E < iyVar.b()) {
            H(E, org.telegram.messenger.g0.L(48.0f));
        }
        int i12 = 0;
        ux uxVar = this.f39068k0;
        if (uxVar != null) {
            uxVar.L = false;
        }
        int i13 = 0;
        while (i13 < 3) {
            ek0 ek0Var2 = this.E0;
            ek0 ek0Var3 = this.f39062i0;
            xv xvVar = this.f39081p0;
            ek0 ek0Var4 = this.Q;
            if (i13 == 0) {
                dyVar = this.W;
                c0Var = this.R;
                view = this.J;
                ek0Var = ek0Var4;
            } else if (i13 == 1) {
                c0Var = this.f39065j0;
                view = this.f39084q0;
                ek0Var = ek0Var3;
                dyVar = xvVar;
            } else {
                dyVar = this.H0;
                c0Var = this.F0;
                view = this.C0;
                ek0Var = ek0Var2;
            }
            if (dyVar == null) {
                i10 = i12;
                i7 = i11;
            } else {
                int i14 = i12;
                cy cyVar = dyVar.f34486r;
                int i15 = i11;
                dyVar.d.setText("");
                if (cyVar != null) {
                    cyVar.I1(null);
                    cyVar.G1();
                }
                int i16 = this.f39044c1;
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
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ek0Var, property, fArr2);
                        float[] fArr3 = new float[1];
                        fArr3[i14] = org.telegram.messenger.g0.L(36.0f);
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(dyVar, property, fArr3);
                        Animator[] animatorArr = new Animator[3];
                        animatorArr[i14] = ofFloat;
                        animatorArr[1] = ofFloat2;
                        animatorArr[i15] = ofFloat3;
                        animatorSet2.playTogether(animatorArr);
                    } else {
                        float[] fArr4 = new float[1];
                        fArr4[i14] = org.telegram.messenger.g0.L(36.0f) - i16;
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(ek0Var, property, fArr4);
                        Animator[] animatorArr2 = new Animator[1];
                        animatorArr2[i14] = ofFloat4;
                        animatorSet2.playTogether(animatorArr2);
                    }
                    this.N0.setDuration(200L);
                    this.N0.setInterpolator(kr.h);
                    this.N0.addListener(new fi.a3(this, c0Var, ek0Var, 6));
                    this.N0.start();
                    i10 = i14;
                    i7 = i15;
                } else {
                    if (dyVar != xvVar) {
                        dyVar.setTranslationY(org.telegram.messenger.g0.L(36.0f) - i16);
                    }
                    i7 = i15;
                    if (view != null && i13 != i7) {
                        view.setTranslationY(0.0f);
                    }
                    if (ek0Var == ek0Var2) {
                        i10 = i14;
                        ek0Var.setPadding(i10, org.telegram.messenger.g0.L(36.0f), i10, org.telegram.messenger.g0.L(44.0f) + this.f39090r2);
                    } else {
                        i10 = i14;
                        if (ek0Var == ek0Var3) {
                            ek0Var.setPadding(i10, org.telegram.messenger.g0.L(40.0f), i10, org.telegram.messenger.g0.L(44.0f) + this.f39090r2);
                        } else {
                            if (ek0Var == ek0Var4) {
                                ek0Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(44.0f) + this.f39090r2);
                            }
                            i10 = 0;
                        }
                    }
                    c0Var.h1(i10, i10);
                }
            }
            i13++;
            i11 = i7;
            i12 = i10;
        }
        int i17 = i12;
        if (!z10) {
            this.f39099u1.i(i17);
        }
    }

    public void setBlurredBackgroundDrawableFactory(dh.c cVar) {
        org.telegram.ui.ActionBar.i6 i6Var = this.f39037a2;
        View view = this.f39112y;
        if (view != null) {
            fh.g c10 = cVar.c(view, null, false);
            c10.p(c8.j0.e(i6Var));
            c10.r(org.telegram.messenger.g0.L(18.0f));
            c10.q(org.telegram.messenger.g0.L(6.0f));
            view.setBackground(c10);
        }
        View view2 = this.F;
        if (view2 != null) {
            fh.g c11 = cVar.c(view2, null, false);
            c11.p(c8.j0.e(i6Var));
            c11.r(org.telegram.messenger.g0.L(18.0f));
            c11.q(org.telegram.messenger.g0.L(6.0f));
            view2.setBackground(c11);
        }
        View view3 = this.f39108x;
        if (view3 != null) {
            fh.g c12 = cVar.c(view3, null, false);
            c12.p(c8.j0.e(i6Var));
            c12.r(org.telegram.messenger.g0.L(18.0f));
            c12.q(org.telegram.messenger.g0.L(6.0f));
            view3.setBackground(c12);
        }
        View view4 = this.E;
        if (view4 != null) {
            fh.g c13 = cVar.c(view4, null, false);
            c13.p(c8.j0.e(i6Var));
            c13.r(org.telegram.messenger.g0.L(18.0f));
            c13.q(org.telegram.messenger.g0.L(6.0f));
            view4.setBackground(c13);
        }
    }

    public void setBottomInset(int i7) {
        if (this.f39090r2 != i7) {
            this.f39090r2 = i7;
            j(i7, this.L);
            j(i7, this.N);
            j(org.telegram.messenger.g0.L(44.0f) + i7, this.Q);
            j(org.telegram.messenger.g0.L(44.0f) + i7, this.E0);
            j(org.telegram.messenger.g0.L(44.0f) + i7, this.f39062i0);
            FrameLayout frameLayout = this.f39091s;
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

    public void setDelegate(qx qxVar) {
        this.f39099u1 = qxVar;
    }

    public void setDragListener(xw xwVar) {
        this.P0 = xwVar;
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        dw dwVar = this.H0;
        if (dwVar != null) {
            dwVar.d.setEnabled(z10);
        }
        xv xvVar = this.f39081p0;
        if (xvVar != null) {
            xvVar.d.setEnabled(z10);
        }
        sv svVar = this.W;
        if (svVar != null) {
            svVar.d.setEnabled(z10);
        }
    }

    public void setForseMultiwindowLayout(boolean z10) {
        this.O1 = z10;
    }

    public void setShouldDrawBackground(boolean z10) {
        if (this.f39101v0 != z10) {
            this.f39101v0 = z10;
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
                int i10 = this.f39047d1;
                if (eVar == null) {
                    xi.e eVar2 = (xi.e) new org.telegram.messenger.js(org.telegram.messenger.ks.f(i10), this).f25029b;
                    eVar2.c(org.telegram.messenger.ks.f25317x0);
                    this.O2 = eVar2;
                }
                if (this.f39116z0 != null) {
                    if (!this.P2) {
                        this.P2 = true;
                        this.O2.c(org.telegram.messenger.ks.X0);
                    }
                    Y(false);
                    D();
                }
                k(true);
                k(false);
                org.telegram.messenger.ri.d0(i10).Y0(0, true, true, false);
                org.telegram.messenger.ri.d0(i10).Y0(0, false, true, false);
                org.telegram.messenger.ri.d0(i10).Y0(2, false, true, false);
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
        iy iyVar;
        boolean z11 = this.U2;
        this.U2 = z10;
        if (z11 && !z10) {
            int i7 = this.B1;
            if (i7 == 0) {
                ax axVar = this.S;
                if (axVar != null) {
                    axVar.F(false);
                }
            } else if (i7 == 1) {
                ux uxVar = this.f39078o0;
                if (uxVar != null) {
                    uxVar.f();
                }
            } else if (i7 == 2 && (iyVar = this.f39116z0) != null) {
                iyVar.f();
            }
        }
    }

    @Override
    public final void updateColors() {
        try {
            T();
            ui.c cVar = this.f39074m2;
            if (cVar != null) {
                cVar.a(z(org.telegram.ui.ActionBar.n6.f29451d6));
            }
            zb0 zb0Var = this.f39108x;
            if (zb0Var != null) {
                zb0Var.setIndicatorColor(i0.a.o(z(org.telegram.ui.ActionBar.n6.Gf), 20));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final int v(float f10) {
        return i0.a.o(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Nl, this.f39037a2), (int) (f10 * 255.0f));
    }

    public final v4.t w(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    return this.f39065j0;
                }
                throw new IllegalArgumentException(i5.c.i(i7, "Unexpected argument: "));
            }
            return this.R;
        }
        return this.F0;
    }

    public final ek0 x(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    return this.f39062i0;
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
                    return this.f39084q0;
                }
                throw new IllegalArgumentException(i5.c.i(i7, "Unexpected argument: "));
            }
            return this.J;
        }
        return this.C0;
    }

    public final int z(int i7) {
        org.telegram.ui.ActionBar.i6 i6Var = this.f39037a2;
        if (i6Var != null) {
            return i6Var.i(i7);
        }
        return org.telegram.ui.ActionBar.n6.x0(null, i7, false);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void G(float f10, int i7) {
    }
}
