package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.PhotoViewer;
public final class bn extends vh implements org.telegram.ui.ActionBar.b6, st0, org.telegram.messenger.ls {
    public static final int f32284r1 = 0;
    public int A0;
    public int B0;
    public int C0;
    public final z20 D;
    public int D0;
    public hy E;
    public int E0;
    public final fi.q3 F;
    public int F0;
    public boolean G;
    public int G0;
    public boolean H;
    public int H0;
    public final boolean I;
    public int I0;
    public final int J;
    public int J0;
    public final CharSequence[] K;
    public int K0;
    public final boolean[] L;
    public int L0;
    public int M;
    public final bg.w0 M0;
    public Editable N;
    public final bg.w0 N0;
    public Editable O;
    public final bg.w0[] O0;
    public Editable P;
    public final ArrayList P0;
    public final sh.p Q;
    public int Q0;
    public boolean R;
    public int R0;
    public boolean S;
    public final int S0;
    public boolean T;
    public final int[] T0;
    public int U;
    public final m.f3 U0;
    public int V;
    public boolean V0;
    public boolean W;
    public int W0;
    public boolean X0;
    public int Y0;
    public boolean Z0;
    public boolean f32285a0;
    public boolean f32286a1;
    public boolean f32287b0;
    public int f32288b1;
    public boolean f32289c0;
    public int f32290c1;
    public boolean f32291d0;
    public int f32292d1;
    public final boolean f32293e0;
    public boolean f32294e1;
    public boolean f32295f0;
    public boolean f32296f1;
    public boolean f32297g0;
    public org.telegram.ui.Cells.a6 f32298g1;
    public boolean f32299h0;
    public boolean f32300h1;
    public boolean f32301i0;
    public boolean f32302i1;
    public an f32303j0;
    public final Paint f32304j1;
    public int f32305k0;
    public di.u2 f32306k1;
    public int f32307l0;
    public int l1;
    public int m0;
    public final sh.e f32308m1;
    public final boolean f32309n;
    public int f32310n0;
    public Drawable n1;
    public int f32311o0;
    public Drawable f32312o1;
    public int f32313p0;
    public int f32314p1;
    public int f32315q0;
    public int f32316q1;
    public final org.telegram.ui.l4 f32317r;
    public int f32318r0;
    public final org.telegram.ui.f61 f32319s;
    public int f32320s0;
    public int f32321t0;
    public int f32322u0;
    public int f32323v0;
    public final qm f32324w;
    public int f32325w0;
    public final kg.c0 f32326x;
    public int f32327x0;
    public final sm f32328y;
    public int f32329y0;
    public int f32330z0;

    public bn(di diVar, Context context, boolean z9, org.telegram.ui.ActionBar.g6 g6Var, Boolean bool) {
        super(context, g6Var, diVar);
        this.M = 1;
        this.R = true;
        this.S = true;
        this.T = true;
        this.f32287b0 = true;
        this.f32295f0 = true;
        this.f32297g0 = true;
        this.f32305k0 = -1;
        bg.w0 w0Var = new bg.w0(this);
        this.M0 = w0Var;
        bg.w0 w0Var2 = new bg.w0(this);
        this.N0 = w0Var2;
        this.O0 = new bg.w0[]{w0Var, w0Var2};
        ArrayList arrayList = new ArrayList();
        this.P0 = arrayList;
        this.T0 = new int[]{3600, 10800, 28800, 86400, 259200};
        this.U0 = new m.f3(this, 29);
        this.V0 = false;
        this.W0 = -1;
        this.f32300h1 = false;
        this.f32302i1 = false;
        Paint paint = new Paint(1);
        this.f32304j1 = paint;
        this.f32308m1 = new sh.e();
        this.f32309n = z9;
        int answersMaxCount = getAnswersMaxCount();
        this.J = answersMaxCount;
        this.K = new CharSequence[answersMaxCount];
        this.L = new boolean[answersMaxCount];
        boolean q10 = org.telegram.messenger.p10.i(org.telegram.messenger.c.a(this.f39071b.D3).f21765a).q();
        this.I = q10;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.f32289c0 = booleanValue;
            this.f32293e0 = booleanValue;
            boolean z10 = !booleanValue;
            this.T = z10;
            this.R = z10;
        }
        n0();
        paint.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Vl, this.f39070a));
        this.f39071b.f33022l3.setDelegate(this);
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(1, this, context);
        this.f32317r = l4Var;
        org.telegram.ui.f61 f61Var = new org.telegram.ui.f61(5, context, null);
        this.f32319s = f61Var;
        setBlur3Capture(f61Var);
        this.d = f61Var;
        this.h = true;
        this.f39074f = true;
        qm qmVar = new qm(this);
        this.f32324w = qmVar;
        f61Var.setItemAnimator(qmVar);
        arrayList.clear();
        qmVar.f57083m = false;
        qmVar.C = false;
        qmVar.o(xq.h);
        qmVar.n(350L);
        f61Var.setClipToPadding(false);
        f61Var.setVerticalScrollBarEnabled(false);
        f61Var.setSections(true);
        kg.c0 c0Var = new kg.c0(this, org.telegram.messenger.g0.L(65.0f) + org.telegram.messenger.g0.f22557m, f61Var, 4);
        this.f32326x = c0Var;
        f61Var.setLayoutManager(c0Var);
        c0Var.O = true;
        new v4.y(new ei.d(this, 4)).h(f61Var);
        addView(f61Var, c8.ha.e(-1, -1, 51));
        f61Var.setPreserveFocusAfterLayout(true);
        f61Var.setAdapter(l4Var);
        f61Var.setOnItemClickListener(new gm(this, g6Var, diVar, context));
        f61Var.setOnScrollListener(new ui(this, 3));
        z20 z20Var = new z20(context, 4);
        this.D = z20Var;
        z20Var.setAlpha(0.0f);
        z20Var.setVisibility(4);
        addView(z20Var, c8.ha.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        this.S0 = ((org.telegram.messenger.j0) org.telegram.messenger.qp.s1(this.f39071b.D3).f24942x7.J.f13555b).f23460c;
        this.Q = new sh.p(this.f39071b.D3);
        org.telegram.messenger.qs.f(this.f39071b.D3).c(this, org.telegram.messenger.qs.f25097w0);
        if (q10) {
            org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25018i4);
            ?? pw0Var = new pw0(context, this.f39071b.D3, null, g6Var);
            this.f32328y = pw0Var;
            pw0Var.D = true;
            pw0Var.E = true;
            pw0Var.setHorizontalPadding(org.telegram.messenger.g0.L(24.0f));
            addView((View) pw0Var, c8.ha.e(-2, 160, 51));
        }
        this.F = new fi.q3(this.f39071b.f33022l3, false, null);
        X();
    }

    public static void O(bn bnVar, int i7) {
        z20 z20Var = bnVar.D;
        v4.d1 K = bnVar.f32319s.K(bnVar.f32321t0 + i7);
        if (K != null) {
            View view = K.f57056a;
            if (view instanceof org.telegram.ui.Cells.a6) {
                org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
                if (a6Var.getTop() > org.telegram.messenger.g0.L(40.0f)) {
                    sm smVar = bnVar.f32328y;
                    if (smVar != null) {
                        smVar.f();
                    }
                    z20Var.setText(org.telegram.messenger.id.M0(2131747182, null));
                    z20Var.c(a6Var.getCheckBox());
                    ImageView imageView = z20Var.f40872b;
                    imageView.setTranslationX(imageView.getTranslationX() + org.telegram.messenger.g0.L(48.0f));
                    z20Var.setTranslationY(z20Var.getTranslationY() + org.telegram.messenger.g0.L(10.0f));
                }
            }
        }
    }

    public static void P(org.telegram.ui.Components.bn r5, android.view.View r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bn.P(org.telegram.ui.Components.bn, android.view.View, int):void");
    }

    public static void Q(bn bnVar, org.telegram.ui.Cells.a6 a6Var, boolean z9) {
        v4.d1 T;
        if (bnVar.I && z9) {
            if (bnVar.f32298g1 == a6Var && bnVar.f32286a1 && bnVar.f32300h1) {
                bnVar.b0();
                bnVar.f32286a1 = false;
            }
            org.telegram.ui.Cells.a6 a6Var2 = bnVar.f32298g1;
            bnVar.f32298g1 = a6Var;
            a6Var.setEmojiButtonVisibility(true);
            jg emojiButton = a6Var.getEmojiButton();
            hg hgVar = hg.f34292e;
            emojiButton.j(hgVar, false);
            org.telegram.ui.f61 f61Var = bnVar.f32319s;
            View F = f61Var.F(a6Var);
            if (F == null) {
                T = null;
            } else {
                T = f61Var.T(F);
            }
            sm smVar = bnVar.f32328y;
            if (smVar != null) {
                smVar.f();
                if (T != null) {
                    View view = T.f57056a;
                    if ((view instanceof org.telegram.ui.Cells.a6) && smVar.getDelegate() != view) {
                        smVar.setDelegate((org.telegram.ui.Cells.a6) view);
                    }
                }
            }
            if (a6Var2 != null && a6Var2 != a6Var) {
                if (bnVar.f32286a1) {
                    bnVar.b0();
                    bnVar.e0(false);
                    bnVar.h0();
                }
                a6Var2.setEmojiButtonVisibility(false);
                a6Var2.getEmojiButton().j(hgVar, false);
            }
        }
    }

    public static void R(bn bnVar, org.telegram.ui.Cells.a6 a6Var) {
        bnVar.f32298g1 = a6Var;
        if (bnVar.f32286a1) {
            bnVar.b0();
            bnVar.h0();
            return;
        }
        bnVar.k0(1);
    }

    public static void S(bn bnVar, int i7) {
        di diVar;
        org.telegram.ui.ActionBar.f2 f2Var;
        int i10;
        sh.e eVar = bnVar.f32308m1;
        if (eVar.b(i7) != null) {
            sh.d b10 = eVar.b(i7);
            if (b10 != null && (diVar = bnVar.f39071b) != null && (f2Var = diVar.W1) != null) {
                Activity parentActivity = f2Var.getParentActivity();
                if (b10 instanceof th.d) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(((th.d) b10).f56063b);
                    PhotoViewer.p1().H2(parentActivity, null, null);
                    PhotoViewer.p1().e2(arrayList, 0, 14, false, new jm(bnVar, i7), null);
                    return;
                } else if (b10 instanceof th.h) {
                    th.h hVar = (th.h) b10;
                    org.telegram.ui.ms.p().v(parentActivity);
                    org.telegram.ui.ms p10 = org.telegram.ui.ms.p();
                    ?? obj = new Object();
                    obj.f35766b = bnVar;
                    obj.f35765a = i7;
                    p10.u(obj);
                    org.telegram.ui.ms p11 = org.telegram.ui.ms.p();
                    TLRPC.Document document = hVar.f56075b;
                    if (org.telegram.messenger.ij.H2(document)) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    p11.s(document, null, "", null, null, i10, false, hVar.f56076c, bnVar.f39070a, 200);
                    return;
                } else if (b10 instanceof th.c) {
                    th.c cVar = (th.c) b10;
                    String str = cVar.d;
                    bnVar.l0(i7, new org.telegram.ui.ef(1, str, org.telegram.messenger.g0.i0(cVar.f56060e, true, true) + " " + cVar.f56061f), org.telegram.messenger.g0.L(240.0f), org.telegram.messenger.g0.L(60.0f));
                    return;
                } else if (b10 instanceof th.g) {
                    th.g gVar = (th.g) b10;
                    TLRPC.Document F0 = gVar.f56073b.F0();
                    String x12 = org.telegram.messenger.ij.x1(F0);
                    bnVar.l0(i7, new fi.u4(x12, org.telegram.messenger.ij.v1(F0) + " - " + org.telegram.messenger.id.R((int) org.telegram.messenger.ij.H0(F0)), gVar, 2), org.telegram.messenger.g0.L(240.0f), org.telegram.messenger.g0.L(60.0f));
                    return;
                } else if (b10 instanceof th.f) {
                    bnVar.l0(i7, new fi((th.f) b10, 1), org.telegram.messenger.g0.L(300.0f), (org.telegram.messenger.g0.L(300.0f) * 9) / 16);
                    return;
                } else if (b10 instanceof th.e) {
                    th.e eVar2 = (th.e) b10;
                    v4.d0(bnVar.getContext(), bnVar.f39070a, eVar2.f56065b, eVar2.f56069n, new cm(bnVar, i7, 1), new dm(bnVar, i7, 0));
                    return;
                } else {
                    bnVar.g0(i7);
                    return;
                }
            }
            return;
        }
        bnVar.g0(i7);
    }

    public static CharSequence d0(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        CharSequence n1 = org.telegram.messenger.g0.n1(charSequence);
        while (TextUtils.indexOf(n1, "\n\n\n") >= 0) {
            n1 = TextUtils.replace(n1, new String[]{"\n\n\n"}, new CharSequence[]{"\n\n"});
        }
        while (TextUtils.indexOf(n1, "\n\n\n") == 0) {
            n1 = TextUtils.replace(n1, new String[]{"\n\n\n"}, new CharSequence[]{"\n\n"});
        }
        return n1;
    }

    private int getAnswersMaxCount() {
        if (this.f32309n) {
            return getMessagesController().R6;
        }
        return ((org.telegram.messenger.j0) getMessagesController().f24942x7.G.f13555b).f23460c;
    }

    private int getCurrentAccount() {
        di diVar = this.f39071b;
        if (diVar != null) {
            return diVar.D3;
        }
        return org.telegram.messenger.p10.f24470s0;
    }

    private org.telegram.messenger.qp getMessagesController() {
        return org.telegram.messenger.qp.s1(getCurrentAccount());
    }

    public static di.u2 i0(org.telegram.ui.ActionBar.f2 f2Var, int i7, org.telegram.messenger.c20 c20Var, xf xfVar) {
        if (f2Var == null) {
            return null;
        }
        di.u2 u2Var = new di.u2(f2Var.getContext(), f2Var, f2Var.getResourceProvider(), xfVar);
        u2Var.T3 = new nm(u2Var, c20Var, f2Var);
        u2Var.U3 = new om(c20Var, u2Var);
        u2Var.f32987a2.i0();
        u2Var.y1(1, true);
        u2Var.V0(i7);
        u2Var.f33041q4 = new em(c20Var);
        u2Var.O1 = new pm(u2Var, c20Var, f2Var);
        u2Var.P1 = new f2(c20Var, u2Var);
        u2Var.e1();
        u2Var.A0(true);
        u2Var.show();
        return u2Var;
    }

    @Override
    public final void A() {
        org.telegram.ui.l4 l4Var = this.f32317r;
        if (l4Var != null) {
            l4Var.f();
        }
        if (this.I) {
            e0(false);
            sm smVar = this.f32328y;
            if (smVar != null) {
                smVar.f();
            }
            org.telegram.ui.Cells.a6 a6Var = this.f32298g1;
            if (a6Var != null) {
                a6Var.setEmojiButtonVisibility(false);
                this.f32298g1.getTextView().clearFocus();
                org.telegram.messenger.g0.v1(this.f32298g1.getEditField());
            }
        }
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bn.B(int, int):void");
    }

    @Override
    public final void H(vh vhVar) {
        di diVar = this.f39071b;
        try {
            diVar.R2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        if (this.f32309n) {
            diVar.R2.setTitle(org.telegram.messenger.id.M0(2131744054, null));
        } else if (this.f32293e0) {
            diVar.R2.setTitle(org.telegram.messenger.id.M0(2131748264, null));
        } else {
            diVar.R2.setTitle(org.telegram.messenger.id.M0(2131748265, null));
        }
        diVar.L1();
        this.f32326x.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f32319s.y0(1);
    }

    @Override
    public final void K(int i7, boolean z9) {
        boolean z10;
        boolean z11;
        int i10;
        int L;
        if (this.I) {
            if (i7 > org.telegram.messenger.g0.L(50.0f) && this.f32294e1 && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                if (z9) {
                    this.f32292d1 = i7;
                    org.telegram.messenger.qp.d1().edit().putInt("kbd_height_land3", this.f32292d1).commit();
                } else {
                    this.f32290c1 = i7;
                    org.telegram.messenger.qp.d1().edit().putInt("kbd_height", this.f32290c1).commit();
                }
            }
            boolean z12 = this.f32286a1;
            di diVar = this.f39071b;
            fi.q3 q3Var = this.F;
            if (z12) {
                if (z9) {
                    i10 = this.f32292d1;
                } else {
                    i10 = this.f32290c1;
                }
                if (this.f32300h1) {
                    i10 += org.telegram.messenger.g0.L(120.0f);
                }
                int i11 = i10 + org.telegram.messenger.g0.f22558n;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E.getLayoutParams();
                int i12 = layoutParams.width;
                int i13 = org.telegram.messenger.g0.f22563q.x;
                if (i12 != i13 || layoutParams.height != i11 || this.f32302i1 != this.f32300h1) {
                    layoutParams.width = i13;
                    layoutParams.height = i11;
                    this.E.setLayoutParams(layoutParams);
                    this.f32288b1 = layoutParams.height;
                    q3Var.a();
                    diVar.f33022l3.requestLayout();
                    boolean z13 = this.f32302i1;
                    if (z13 != this.f32300h1) {
                        if (z13) {
                            L = -org.telegram.messenger.g0.L(120.0f);
                        } else {
                            L = org.telegram.messenger.g0.L(120.0f);
                        }
                        U(L);
                    }
                    this.f32302i1 = this.f32300h1;
                }
            }
            if (this.Y0 != i7 || this.Z0 != z9) {
                this.Y0 = i7;
                this.Z0 = z9;
                boolean z14 = this.f32294e1;
                org.telegram.ui.Cells.a6 a6Var = this.f32298g1;
                if (a6Var != null) {
                    if (a6Var.getEditField().isFocused() && q3Var.c() && i7 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f32294e1 = z11;
                } else {
                    this.f32294e1 = false;
                }
                if (this.f32294e1 && this.f32286a1) {
                    k0(0);
                }
                if (this.f32288b1 != 0 && !(z10 = this.f32294e1) && z10 != z14 && !this.f32286a1) {
                    this.f32288b1 = 0;
                    q3Var.a();
                    diVar.f33022l3.requestLayout();
                }
                if (this.f32294e1 && this.G) {
                    this.G = false;
                    org.telegram.messenger.g0.r(this.U0);
                }
            }
        }
    }

    public final void T() {
        sm smVar = this.f32328y;
        if (smVar != null) {
            smVar.setDelegate(null);
            smVar.f();
        }
        this.f32319s.setItemAnimator(this.f32324w);
        int i7 = this.M;
        this.L[i7] = false;
        int i10 = i7 + 1;
        this.M = i10;
        int length = this.K.length;
        org.telegram.ui.l4 l4Var = this.f32317r;
        if (i10 == length) {
            l4Var.s(this.f32322u0);
        }
        l4Var.i(this.f32322u0);
        n0();
        this.f32305k0 = (this.f32321t0 + this.M) - 1;
        l4Var.g(this.f32323v0);
        l4Var.g(this.A0);
    }

    public final void U(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new org.telegram.ui.sf(this, f10, 2));
        ofFloat.addListener(new im(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f27519w);
        ofFloat.start();
    }

    public final void V() {
        boolean z9;
        if (!this.f32289c0 && !this.f32285a0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            this.T = false;
        }
        int i7 = this.C0;
        if (i7 < 0) {
            return;
        }
        v4.d1 K = this.f32319s.K(i7);
        if (K == null) {
            this.f32317r.g(this.C0);
            return;
        }
        org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) K.f57056a;
        if (!z9) {
            x5Var.setChecked(false);
        }
        x5Var.getCheckBox().f31560a.a(!z9, true);
    }

    public final boolean W() {
        boolean z9;
        int i7;
        int i10;
        if (TextUtils.isEmpty(d0(this.N)) && TextUtils.isEmpty(d0(this.O)) && TextUtils.isEmpty(d0(this.P)) && this.f32308m1.f55307a.size() == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            for (int i11 = 0; i11 < this.M && (z9 = TextUtils.isEmpty(d0(this.K[i11]))); i11++) {
            }
        }
        if (!z9) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f39071b.W1.getParentActivity());
            boolean z10 = this.f32309n;
            if (z10) {
                i7 = 2131752567;
            } else {
                i7 = 2131752573;
            }
            String M0 = org.telegram.messenger.id.M0(i7, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            u1Var.R = M0;
            if (z10) {
                i10 = 2131752568;
            } else {
                i10 = 2131752574;
            }
            u1Var.T = org.telegram.messenger.id.M0(i10, null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747580, null), new u(this, 23));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            alertDialog$Builder.p();
        }
        return z9;
    }

    public final void X() {
        int i7;
        int i10;
        int i11;
        boolean z9;
        boolean z10 = this.f32289c0;
        CharSequence[] charSequenceArr = this.K;
        if (z10) {
            int i12 = 0;
            i7 = 0;
            while (true) {
                boolean[] zArr = this.L;
                if (i12 >= zArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(d0(charSequenceArr[i12])) && zArr[i12]) {
                    i7++;
                }
                i12++;
            }
        } else {
            i7 = 0;
        }
        boolean z11 = this.f32309n;
        if (z11) {
            i10 = getMessagesController().S6;
        } else {
            i10 = 255;
        }
        if (z11) {
            i11 = getMessagesController().T6;
        } else {
            i11 = 100;
        }
        if ((!TextUtils.isEmpty(d0(this.O)) && this.O.length() > this.S0) || ((!TextUtils.isEmpty(d0(this.P)) && this.P.length() > 200) || TextUtils.isEmpty(d0(this.N)) || this.N.length() > i10)) {
            z9 = false;
        } else {
            z9 = true;
        }
        int i13 = 0;
        int i14 = 0;
        boolean z12 = false;
        while (true) {
            if (i13 >= charSequenceArr.length) {
                break;
            }
            if (!TextUtils.isEmpty(d0(charSequenceArr[i13]))) {
                if (charSequenceArr[i13].length() > i11) {
                    i14 = 0;
                    z12 = true;
                    break;
                }
                i14++;
                z12 = true;
            }
            i13++;
        }
        if (i14 < 1 || (this.f32289c0 && i7 < 1)) {
            z9 = false;
        }
        if (TextUtils.isEmpty(this.P) && TextUtils.isEmpty(this.N) && TextUtils.isEmpty(this.O) && !z12 && this.f32308m1.f55307a.size() <= 0) {
            this.f32299h0 = true;
        } else {
            this.f32299h0 = false;
        }
        boolean z13 = this.f32299h0;
        di diVar = this.f39071b;
        diVar.f28649q0 = z13;
        this.X0 = z9;
        diVar.L1();
    }

    public final void Z(org.telegram.ui.Cells.m8 m8Var, boolean z9) {
        if (this.V != 0) {
            m8Var.q(org.telegram.messenger.id.M0(2131747130, null), org.telegram.messenger.id.Q(this.V), z9, false);
        } else if (this.U != 0) {
            m8Var.q(org.telegram.messenger.id.M0(2131747132, null), org.telegram.messenger.id.G(this.U / 3600, "Hours", new Object[0]), z9, false);
        } else {
            m8Var.q(org.telegram.messenger.id.M0(2131747130, null), null, z9, false);
        }
    }

    public final void a0(th.e eVar, boolean z9) {
        boolean z10;
        TLRPC.Photo photo;
        String str = eVar.f56065b;
        sh.p pVar = this.Q;
        boolean containsKey = pVar.f55349c.containsKey(str);
        TLRPC.WebPage webPage = (TLRPC.WebPage) pVar.f55348b.get(eVar.f56065b);
        te.a aVar = eVar.f56071s;
        ImageReceiver imageReceiver = eVar.f55306a;
        if (!containsKey && !(webPage instanceof TLRPC.TL_webPagePending)) {
            z10 = false;
        } else {
            z10 = true;
        }
        eVar.f56070r.a(z10, z9);
        eVar.f56069n = webPage;
        if (webPage != null && (photo = webPage.photo) != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, 40, false, null, false);
            imageReceiver.r0(org.telegram.messenger.hc.f(org.telegram.messenger.w7.w(webPage.photo.sizes, org.telegram.messenger.g0.L(36.0f), false, w10, true), webPage.photo), "48_48", org.telegram.messenger.hc.f(w10, webPage.photo), "48_48_b", null, 0L, null, webPage, 1);
            aVar.a(true, z9);
            return;
        }
        aVar.a(false, z9);
        imageReceiver.f();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Wl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27866d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27957i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28275z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27809a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27829b7));
    }

    public final void b0() {
        if (this.f32300h1) {
            this.E.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E.getLayoutParams();
            layoutParams.height -= org.telegram.messenger.g0.L(120.0f);
            this.E.setLayoutParams(layoutParams);
            this.f32288b1 = layoutParams.height;
            this.f32302i1 = this.f32300h1;
            this.f32300h1 = false;
            U(-org.telegram.messenger.g0.L(120.0f));
        }
    }

    public final void c0(android.view.View r10, org.telegram.ui.Cells.a6 r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bn.c0(android.view.View, org.telegram.ui.Cells.a6, boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.WebPage webPage;
        if (i7 == org.telegram.messenger.qs.f25097w0) {
            a0.h hVar = (a0.h) objArr[0];
            for (Map.Entry entry : this.Q.f55348b.entrySet()) {
                if (entry.getValue() != null && (webPage = (TLRPC.WebPage) hVar.f(((TLRPC.WebPage) entry.getValue()).f27111id)) != null) {
                    entry.setValue(webPage);
                }
            }
            sh.e eVar = this.f32308m1;
            int size = eVar.f55307a.size();
            for (int i11 = 0; i11 < size; i11++) {
                sh.d dVar = (sh.d) eVar.f55307a.get(i11);
                if (dVar instanceof th.e) {
                    a0((th.e) dVar, true);
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f25018i4) {
            hy hyVar = this.E;
            if (hyVar != null) {
                hyVar.P.g1();
            }
            org.telegram.ui.Cells.a6 a6Var = this.f32298g1;
            if (a6Var != null) {
                int currentTextColor = a6Var.getEditField().getCurrentTextColor();
                this.f32298g1.getEditField().setTextColor(-1);
                this.f32298g1.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void e0(boolean z9) {
        if (this.I) {
            if (this.f32286a1) {
                hy hyVar = this.E;
                hyVar.P.C0();
                hyVar.I.scrollTo(0, 0);
                hyVar.E(1);
                hyVar.Q.h1(0, 0);
                this.E.t(false);
                if (z9) {
                    this.E.A();
                }
                this.f32300h1 = false;
                k0(0);
            }
            if (z9) {
                hy hyVar2 = this.E;
                if (hyVar2 != null && hyVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.E.getMeasuredHeight());
                    ofFloat.addUpdateListener(new fm(this, 0));
                    this.f32296f1 = true;
                    ofFloat.addListener(new im(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f27519w);
                    ofFloat.start();
                    return;
                }
                f0();
            }
        }
    }

    public final void f0() {
        hy hyVar;
        jg emojiButton;
        if (!this.f32286a1 && (hyVar = this.E) != null && hyVar.getVisibility() != 8) {
            org.telegram.ui.Cells.a6 a6Var = this.f32298g1;
            if (a6Var != null && (emojiButton = a6Var.getEmojiButton()) != null) {
                emojiButton.j(hg.f34292e, false);
            }
            this.E.setVisibility(8);
        }
        int i7 = this.f32288b1;
        this.f32288b1 = 0;
        if (i7 != 0) {
            this.F.a();
        }
    }

    public final void g0(int i7) {
        int i10;
        this.l1 = i7;
        org.telegram.ui.ActionBar.f2 f2Var = this.f39071b.W1;
        this.f32308m1.b(i7);
        if (i7 != -2 && i7 != -3) {
            i10 = 41026;
        } else {
            i10 = 74;
        }
        this.f32306k1 = i0(f2Var, i10, new cm(this, i7, 0), new xf(this, 27));
    }

    @Override
    public int getButtonsHideOffset() {
        return org.telegram.messenger.g0.L(70.0f);
    }

    @Override
    public int getCurrentItemTop() {
        View childAt;
        v4.d1 T;
        int i7;
        org.telegram.ui.f61 f61Var = this.f32319s;
        if (f61Var.getChildCount() <= 1 || (childAt = f61Var.getChildAt(1)) == null) {
            return Integer.MAX_VALUE;
        }
        View F = f61Var.F(childAt);
        if (F == null) {
            T = null;
        } else {
            T = f61Var.T(F);
        }
        yi0 yi0Var = (yi0) T;
        int y10 = (((int) childAt.getY()) - org.telegram.messenger.g0.f22557m) - org.telegram.messenger.g0.L(20.0f);
        if (y10 > 0 && yi0Var != null && yi0Var.b() == 1) {
            i7 = y10;
        } else {
            i7 = 0;
        }
        if (y10 < 0 || yi0Var == null || yi0Var.b() != 1) {
            y10 = i7;
        }
        return org.telegram.messenger.g0.L(25.0f) + y10;
    }

    public int getEmojiPadding() {
        return this.f32288b1;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(17.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.R0;
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.u6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.u6> arrayList = new ArrayList<>();
        int i7 = org.telegram.ui.ActionBar.l6.A5;
        org.telegram.ui.f61 f61Var = this.f32319s;
        arrayList.add(new org.telegram.ui.ActionBar.u6(f61Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(f61Var, 16, new Class[]{tm.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27809a7));
        int i10 = org.telegram.ui.ActionBar.l6.f28086p7;
        arrayList.add(new org.telegram.ui.ActionBar.u6(f61Var, 262144, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i10));
        int i11 = org.telegram.ui.ActionBar.l6.f28030m6;
        arrayList.add(new org.telegram.ui.ActionBar.u6(f61Var, 8388608, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"deleteImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.u6(f61Var, 8388608, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"moveImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.u6(f61Var, 262144, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.u6(f61Var, 0, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i11));
        int i12 = org.telegram.ui.ActionBar.l6.f27995k7;
        arrayList.add(new org.telegram.ui.ActionBar.u6(f61Var, 0, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.u6(f61Var, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.M6));
        int i13 = org.telegram.ui.ActionBar.l6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.u6(f61Var, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.u6(f61Var, 32, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.u6(f61Var, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i12));
        return arrayList;
    }

    public final void h0() {
        int i7;
        org.telegram.ui.Cells.a6 a6Var = this.f32298g1;
        if (a6Var != null) {
            this.F.f12652e = true;
            EditTextBoldCursor editField = a6Var.getEditField();
            editField.requestFocus();
            org.telegram.messenger.g0.K3(editField);
        }
        if (org.telegram.messenger.g0.D) {
            i7 = 0;
        } else {
            i7 = 2;
        }
        k0(i7);
        if (!org.telegram.messenger.g0.D && !this.f32294e1 && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            this.G = true;
            m.f3 f3Var = this.U0;
            org.telegram.messenger.g0.r(f3Var);
            org.telegram.messenger.g0.i3(f3Var, 100L);
        }
    }

    @Override
    public final boolean i() {
        return this.X0;
    }

    @Override
    public final int j() {
        return 1;
    }

    public final void j0(int i7, sh.d dVar) {
        int i10;
        sh.e eVar = this.f32308m1;
        if (dVar != null) {
            eVar.f55307a.put(i7, dVar);
        } else {
            eVar.f55307a.remove(i7);
        }
        if (i7 == -2) {
            i10 = this.f32310n0;
        } else if (i7 == -3) {
            i10 = this.f32313p0;
        } else {
            int i11 = this.f32321t0;
            if (i11 >= 0 && i7 >= 0 && i7 < this.M) {
                i10 = i7 + i11;
            } else {
                i10 = -1;
            }
        }
        if (i10 >= 0) {
            v4.d1 K = this.f32319s.K(i10);
            if (K != null) {
                View view = K.f57056a;
                if (view instanceof org.telegram.ui.Cells.a6) {
                    ((org.telegram.ui.Cells.a6) view).f28895e.b(dVar, true);
                }
            }
            this.f32317r.g(i10);
        }
        if (dVar instanceof th.e) {
            th.e eVar2 = (th.e) dVar;
            String str = eVar2.f56065b;
            bi.p5 p5Var = new bi.p5(13, this, dVar);
            sh.p pVar = this.Q;
            HashMap hashMap = pVar.f55349c;
            HashMap hashMap2 = pVar.f55348b;
            if (hashMap2.containsKey(str)) {
                p5Var.a((TLRPC.WebPage) hashMap2.get(str), null);
            } else {
                boolean containsKey = hashMap.containsKey(str);
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(str, arrayList);
                }
                arrayList.add(p5Var);
                if (!containsKey) {
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = str;
                    ConnectionsManager.getInstance(pVar.f55347a).sendRequestTyped(getwebpagepreview, new d3.b(1), new org.telegram.ui.Wallet.t1(4, pVar, str));
                }
            }
            a0(eVar2, false);
        }
        X();
    }

    @Override
    public final boolean k() {
        if (this.f32286a1) {
            e0(true);
            return true;
        } else if (!W()) {
            return true;
        } else {
            return false;
        }
    }

    public final void k0(int i7) {
        boolean z9;
        int i10;
        org.telegram.ui.Cells.a6 a6Var;
        if (this.I) {
            fi.q3 q3Var = this.F;
            jg jgVar = null;
            di diVar = this.f39071b;
            if (i7 == 1) {
                hy hyVar = this.E;
                if (hyVar != null && hyVar.getVisibility() == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                hy hyVar2 = this.E;
                if (hyVar2 != null && hyVar2.f34415c1 != org.telegram.messenger.p10.f24470s0) {
                    diVar.f33022l3.removeView(hyVar2);
                    this.E = null;
                }
                if (this.E == null) {
                    hy hyVar3 = new hy(null, true, false, false, getContext(), true, null, null, true, this.f39070a, false, false);
                    this.E = hyVar3;
                    hyVar3.f34413c = 3;
                    hyVar3.f34476w0 = false;
                    hyVar3.f34482x2 = false;
                    hyVar3.setShouldDrawBackground(false);
                    hy hyVar4 = this.E;
                    hyVar4.U0 = false;
                    hyVar4.setVisibility(8);
                    if (org.telegram.messenger.g0.Q1()) {
                        this.E.setForseMultiwindowLayout(true);
                    }
                    this.E.setDelegate(new hm(this));
                    diVar.f33022l3.addView(this.E);
                    this.E.setBottomInset(org.telegram.messenger.g0.f22558n);
                }
                this.E.setVisibility(0);
                this.f32286a1 = true;
                hy hyVar5 = this.E;
                if (this.f32290c1 <= 0) {
                    if (org.telegram.messenger.g0.Q1()) {
                        this.f32290c1 = org.telegram.messenger.g0.L(150.0f);
                    } else {
                        this.f32290c1 = org.telegram.messenger.qp.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                    }
                }
                if (this.f32292d1 <= 0) {
                    if (org.telegram.messenger.g0.Q1()) {
                        this.f32292d1 = org.telegram.messenger.g0.L(150.0f);
                    } else {
                        this.f32292d1 = org.telegram.messenger.qp.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                    }
                }
                Point point = org.telegram.messenger.g0.f22563q;
                if (point.x > point.y) {
                    i10 = this.f32292d1;
                } else {
                    i10 = this.f32290c1;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) hyVar5.getLayoutParams();
                layoutParams.height = org.telegram.messenger.g0.f22558n + i10;
                hyVar5.setLayoutParams(layoutParams);
                if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1() && (a6Var = this.f32298g1) != null) {
                    org.telegram.messenger.g0.v1(a6Var.getEditField());
                }
                this.f32288b1 = i10;
                q3Var.a();
                diVar.f33022l3.requestLayout();
                org.telegram.ui.Cells.a6 a6Var2 = this.f32298g1;
                if (a6Var2 != null) {
                    jgVar = a6Var2.getEmojiButton();
                }
                if (jgVar != null) {
                    jgVar.j(hg.d, true);
                }
                if (!z9 && !this.f32294e1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f32288b1, 0.0f);
                    ofFloat.addUpdateListener(new fm(this, 1));
                    ofFloat.addListener(new im(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f27519w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.a6 a6Var3 = this.f32298g1;
            if (a6Var3 != null) {
                jgVar = a6Var3.getEmojiButton();
            }
            if (jgVar != null) {
                jgVar.j(hg.f34292e, true);
            }
            hy hyVar6 = this.E;
            if (hyVar6 != null) {
                this.f32286a1 = false;
                this.f32300h1 = false;
                if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                    hyVar6.setVisibility(8);
                }
            }
            if (i7 == 0) {
                this.f32288b1 = 0;
            }
            q3Var.a();
            diVar.f33022l3.requestLayout();
        }
    }

    public final void l0(int i7, org.telegram.messenger.d20 d20Var, int i10, int i11) {
        l60 F = l60.F(this, null, new View(getContext()));
        F.f35617s = 0;
        F.f35618t = false;
        F.c(2131232331, org.telegram.messenger.id.M0(2131746271, null), new dm(this, i7, 1), false);
        F.c(2131232108, org.telegram.messenger.id.M0(2131751598, null), new dm(this, i7, 2), true);
        kk0 kk0Var = new kk0(getContext(), this.f39070a);
        F.f35612p = new org.telegram.ui.ge(kk0Var, 1);
        F.S = org.telegram.messenger.g0.L(185.0f);
        F.Y();
        kk0Var.e(F);
        fh.g c10 = kk0Var.f35365n.c(null, null, false);
        c10.p(c8.g0.k(kk0Var.f35361b));
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.Q.f11508e = true;
        c10.r(org.telegram.messenger.g0.L(16.0f));
        kk0Var.F = c10;
        kk0Var.E = (Drawable) d20Var.a(kk0Var.f35367s);
        Point point = org.telegram.messenger.g0.f22563q;
        int i12 = (point.x - i10) / 2;
        int i13 = (point.y - i11) / 2;
        int i14 = i10 + i12;
        int i15 = i11 + i13;
        c10.setBounds(i12 - org.telegram.messenger.g0.L(8.0f), i13 - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f) + i14, org.telegram.messenger.g0.L(8.0f) + i15);
        kk0Var.E.setBounds(i12, i13, i14, i15);
        ((FrameLayout.LayoutParams) kk0Var.f35370y.getLayoutParams()).gravity = 1;
        kk0Var.L = true;
        kk0Var.show();
    }

    public final void m0() {
        org.telegram.ui.ActionBar.g6 g6Var = this.f39070a;
        try {
            int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.N6, g6Var);
            int w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27995k7, g6Var);
            if (w02 != this.f32314p1 || w03 != this.f32316q1) {
                this.f32314p1 = w02;
                this.f32316q1 = w03;
                Drawable drawable = this.n1;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
                Drawable drawable2 = this.f32312o1;
                if (drawable2 != null) {
                    drawable2.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.MULTIPLY));
                }
                org.telegram.ui.f61 f61Var = this.f32319s;
                if (f61Var != null) {
                    for (int i7 = 0; i7 < f61Var.getChildCount(); i7++) {
                        View childAt = f61Var.getChildAt(i7);
                        if (childAt instanceof org.telegram.ui.Cells.m8) {
                            childAt.invalidate();
                        }
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void n0() {
        boolean z9;
        this.f32311o0 = -1;
        this.f32313p0 = -1;
        this.f32315q0 = -1;
        this.F0 = -1;
        this.B0 = -1;
        this.H0 = -1;
        this.I0 = -1;
        this.J0 = -1;
        this.K0 = -1;
        this.C0 = -1;
        this.E0 = -1;
        this.D0 = -1;
        this.G0 = -1;
        bg.w0 w0Var = this.M0;
        w0Var.f3393b = -1;
        bg.w0 w0Var2 = this.N0;
        w0Var2.f3393b = -1;
        this.L0 = -1;
        this.f32329y0 = -1;
        this.f32330z0 = -1;
        this.f32322u0 = -1;
        this.f32321t0 = -1;
        this.f32327x0 = -1;
        this.f32310n0 = -1;
        this.f32307l0 = 1;
        this.Q0 = 3;
        this.m0 = 2;
        boolean z10 = this.f32309n;
        if (!z10) {
            this.Q0 = 4;
            this.f32310n0 = 3;
        }
        int i7 = this.Q0;
        int i10 = i7 + 1;
        this.f32318r0 = i7;
        int i11 = i7 + 2;
        this.Q0 = i11;
        this.f32320s0 = i10;
        int i12 = this.M;
        if (i12 != 0) {
            this.f32321t0 = i11;
            this.Q0 = i11 + i12;
        }
        if (i12 != this.K.length) {
            int i13 = this.Q0;
            this.Q0 = i13 + 1;
            this.f32322u0 = i13;
        }
        int i14 = this.Q0;
        this.f32323v0 = i14;
        int i15 = i14 + 2;
        this.Q0 = i15;
        this.f32325w0 = i14 + 1;
        if (z10) {
            int i16 = i14 + 3;
            this.Q0 = i16;
            this.f32330z0 = i15;
            if (this.f32297g0) {
                this.Q0 = i14 + 4;
                this.f32329y0 = i16;
            }
        } else {
            TLRPC.Chat chat = ((org.telegram.ui.cn) this.f39071b.W1).f44432e;
            if (org.telegram.messenger.t3.T(chat) && !chat.megagroup) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                int i17 = this.Q0;
                this.Q0 = i17 + 1;
                this.B0 = i17;
            } else {
                this.f32285a0 = true;
            }
            int i18 = this.Q0;
            int i19 = i18 + 1;
            this.Q0 = i19;
            this.F0 = i18;
            if (!z9) {
                this.Q0 = i18 + 2;
                this.C0 = i19;
            } else {
                this.T = false;
            }
            int i20 = this.Q0;
            this.D0 = i20;
            this.E0 = i20 + 1;
            int i21 = i20 + 3;
            this.Q0 = i21;
            this.G0 = i20 + 2;
            if (z9) {
                w0Var.f3393b = i21;
                int i22 = i20 + 5;
                this.Q0 = i22;
                w0Var2.f3393b = i20 + 4;
                if (w0Var2.f3392a) {
                    this.Q0 = i20 + 6;
                    this.L0 = i22;
                }
            }
            int i23 = this.Q0;
            int i24 = i23 + 1;
            this.Q0 = i24;
            this.H0 = i23;
            if (this.U != 0 || this.V != 0) {
                this.I0 = i24;
                this.J0 = i23 + 2;
                this.Q0 = i23 + 4;
                this.K0 = i23 + 3;
            }
            int i25 = this.Q0;
            int i26 = i25 + 1;
            this.Q0 = i26;
            this.f32327x0 = i25;
            if (this.f32289c0) {
                this.f32311o0 = i26;
                this.f32313p0 = i25 + 2;
                this.Q0 = i25 + 4;
                this.f32315q0 = i25 + 3;
            }
        }
        int i27 = this.Q0;
        this.Q0 = i27 + 1;
        this.A0 = i27;
    }

    @Override
    public final void p() {
        this.H = true;
        di diVar = this.f39071b;
        org.telegram.messenger.qs.f(diVar.D3).n(this, org.telegram.messenger.qs.f25097w0);
        if (this.I) {
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25018i4);
            hy hyVar = this.E;
            if (hyVar != null) {
                diVar.f33022l3.removeView(hyVar);
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f32301i0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final boolean s() {
        if (!W()) {
            return false;
        }
        return true;
    }

    public void setDelegate(an anVar) {
        this.f32303j0 = anVar;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f39071b.f28624b.invalidate();
    }

    @Override
    public final void t() {
        this.f39071b.L1();
    }

    @Override
    public final void updateColors() {
        try {
            this.f32304j1.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Vl, this.f39070a));
            m0();
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void v(float f10) {
        this.f39071b.L1();
    }

    @Override
    public final void w(int i7) {
        int i10;
        boolean z9;
        if (i7 == 40) {
            boolean z10 = this.f32309n;
            int i11 = 0;
            int i12 = 1;
            di diVar = this.f39071b;
            CharSequence[] charSequenceArr = this.K;
            if (z10) {
                CharSequence[] charSequenceArr2 = {d0(this.N)};
                int i13 = diVar.D3;
                ArrayList<TLRPC.MessageEntity> W = org.telegram.messenger.ui.b0(i13).W(charSequenceArr2, true, true);
                CharSequence charSequence = charSequenceArr2[0];
                if (W != null) {
                    int size = W.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        TLRPC.MessageEntity messageEntity = W.get(i14);
                        if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                            messageEntity.length = charSequence.length() - messageEntity.offset;
                        }
                    }
                }
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = new TLRPC.TL_messageMediaToDo();
                TLRPC.TodoList todoList = new TLRPC.TodoList();
                tL_messageMediaToDo.todo = todoList;
                boolean z11 = this.f32297g0;
                if (z11 && this.f32295f0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                todoList.others_can_append = z9;
                todoList.others_can_complete = z11;
                todoList.title = new TLRPC.TL_textWithEntities();
                tL_messageMediaToDo.todo.title.text = charSequence.toString();
                tL_messageMediaToDo.todo.title.entities = W;
                for (int i15 = 0; i15 < charSequenceArr.length; i15++) {
                    if (!TextUtils.isEmpty(d0(charSequenceArr[i15]))) {
                        CharSequence[] charSequenceArr3 = {d0(charSequenceArr[i15])};
                        ArrayList<TLRPC.MessageEntity> W2 = org.telegram.messenger.ui.b0(i13).W(charSequenceArr3, true, true);
                        CharSequence charSequence2 = charSequenceArr3[0];
                        if (W2 != null) {
                            int size2 = W2.size();
                            for (int i16 = 0; i16 < size2; i16++) {
                                TLRPC.MessageEntity messageEntity2 = W2.get(i16);
                                if (messageEntity2.offset + messageEntity2.length > charSequence2.length()) {
                                    messageEntity2.length = charSequence2.length() - messageEntity2.offset;
                                }
                            }
                        }
                        TLRPC.TodoItem todoItem = new TLRPC.TodoItem();
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        todoItem.title = tL_textWithEntities;
                        tL_textWithEntities.text = charSequence2.toString();
                        todoItem.title.entities = W2;
                        todoItem.f27103id = tL_messageMediaToDo.todo.list.size() + 1;
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                v4.X(i13, diVar.X0() + 1, diVar.b1(), new bi.v3(this, (org.telegram.ui.cn) diVar.W1, tL_messageMediaToDo, 7));
                return;
            }
            boolean z12 = this.f32289c0;
            org.telegram.ui.f61 f61Var = this.f32319s;
            boolean[] zArr = this.L;
            if (z12 && !this.X0) {
                int i17 = 0;
                while (i11 < zArr.length) {
                    if (!TextUtils.isEmpty(d0(charSequenceArr[i11])) && zArr[i11]) {
                        i17++;
                    }
                    i11++;
                }
                if (i17 <= 0) {
                    for (int i18 = this.f32321t0; i18 < this.f32321t0 + this.M; i18++) {
                        v4.d1 K = f61Var.K(i18);
                        if (K != null) {
                            View view = K.f57056a;
                            if (view instanceof org.telegram.ui.Cells.a6) {
                                org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
                                if (a6Var.getTop() > org.telegram.messenger.g0.L(40.0f)) {
                                    sm smVar = this.f32328y;
                                    if (smVar != null) {
                                        smVar.f();
                                    }
                                    String M0 = org.telegram.messenger.id.M0(2131747155, null);
                                    z20 z20Var = this.D;
                                    z20Var.setText(M0);
                                    z20Var.c(a6Var.getCheckBox());
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            int i19 = 0;
            while (true) {
                int length = charSequenceArr.length;
                sh.e eVar = this.f32308m1;
                if (i19 < length) {
                    if (TextUtils.isEmpty(d0(charSequenceArr[i19])) && eVar.b(i19) != null) {
                        this.V0 = true;
                        this.W0 = i19;
                        f61Var.y0(this.f32321t0 + i19);
                        return;
                    }
                    i19++;
                } else {
                    CharSequence[] charSequenceArr4 = {d0(this.N)};
                    int i20 = diVar.D3;
                    ArrayList<TLRPC.MessageEntity> W3 = org.telegram.messenger.ui.b0(i20).W(charSequenceArr4, true, true);
                    CharSequence charSequence3 = charSequenceArr4[0];
                    if (W3 != null) {
                        int size3 = W3.size();
                        for (int i21 = 0; i21 < size3; i21++) {
                            TLRPC.MessageEntity messageEntity3 = W3.get(i21);
                            if (messageEntity3.offset + messageEntity3.length > charSequence3.length()) {
                                messageEntity3.length = charSequence3.length() - messageEntity3.offset;
                            }
                        }
                    }
                    TLRPC.TL_messageMediaPoll tL_messageMediaPoll = new TLRPC.TL_messageMediaPoll();
                    TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                    tL_messageMediaPoll.poll = tL_poll;
                    tL_poll.multiple_choice = this.f32287b0;
                    tL_poll.quiz = this.f32289c0;
                    tL_poll.public_voters = !this.f32285a0;
                    tL_poll.open_answers = this.T;
                    tL_poll.revoting_disabled = !this.R;
                    tL_poll.shuffle_answers = this.S;
                    tL_poll.subscribers_only = this.M0.f3392a;
                    if (this.N0.f3392a) {
                        ArrayList arrayList = this.P0;
                        if (!arrayList.isEmpty()) {
                            TLRPC.Poll poll = tL_messageMediaPoll.poll;
                            poll.flags |= 4096;
                            poll.countries_iso2.addAll(arrayList);
                        }
                    }
                    TLRPC.Poll poll2 = tL_messageMediaPoll.poll;
                    poll2.creator = true;
                    int i22 = this.U;
                    if (i22 != 0) {
                        poll2.hide_results_until_close = this.W;
                        poll2.close_period = i22;
                        poll2.flags |= 16;
                    } else {
                        int i23 = this.V;
                        if (i23 != 0) {
                            poll2.hide_results_until_close = this.W;
                            poll2.close_date = i23;
                            poll2.flags |= 32;
                        }
                    }
                    poll2.question = new TLRPC.TL_textWithEntities();
                    tL_messageMediaPoll.poll.question.text = charSequence3.toString();
                    tL_messageMediaPoll.poll.question.entities = W3;
                    ArrayList arrayList2 = new ArrayList(this.J);
                    int i24 = 0;
                    while (i24 < charSequenceArr.length) {
                        if (TextUtils.isEmpty(d0(charSequenceArr[i24]))) {
                            eVar.h(tL_messageMediaPoll.poll.answers.size());
                            i10 = i11;
                        } else {
                            CharSequence[] charSequenceArr5 = new CharSequence[i12];
                            charSequenceArr5[i11] = d0(charSequenceArr[i24]);
                            ArrayList<TLRPC.MessageEntity> W4 = org.telegram.messenger.ui.b0(i20).W(charSequenceArr5, i12, i12);
                            CharSequence charSequence4 = charSequenceArr5[i11];
                            if (W4 != null) {
                                int size4 = W4.size();
                                int i25 = i11;
                                while (i25 < size4) {
                                    TLRPC.MessageEntity messageEntity4 = W4.get(i25);
                                    int i26 = i11;
                                    if (messageEntity4.offset + messageEntity4.length > charSequence4.length()) {
                                        messageEntity4.length = charSequence4.length() - messageEntity4.offset;
                                    }
                                    i25++;
                                    i11 = i26;
                                }
                            }
                            i10 = i11;
                            TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                            TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                            tL_pollAnswer.text = tL_textWithEntities2;
                            tL_textWithEntities2.text = charSequence4.toString();
                            tL_pollAnswer.text.entities = W4;
                            byte[] bArr = new byte[1];
                            tL_pollAnswer.option = bArr;
                            bArr[i10] = (byte) (tL_messageMediaPoll.poll.answers.size() + 48);
                            if ((this.f32287b0 || this.f32289c0) && zArr[i24]) {
                                arrayList2.add(Integer.valueOf(tL_messageMediaPoll.poll.answers.size()));
                            }
                            tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                        }
                        i24++;
                        i11 = i10;
                        i12 = 1;
                    }
                    int i27 = i11;
                    tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
                    CharSequence d02 = d0(this.P);
                    if (d02 != null) {
                        tL_messageMediaPoll.results.solution = d02.toString();
                        CharSequence[] charSequenceArr6 = new CharSequence[1];
                        charSequenceArr6[i27] = d02;
                        ArrayList<TLRPC.MessageEntity> W5 = org.telegram.messenger.ui.b0(i20).W(charSequenceArr6, true, true);
                        if (W5 != null && !W5.isEmpty()) {
                            tL_messageMediaPoll.results.solution_entities = W5;
                        }
                        if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                            tL_messageMediaPoll.results.flags |= 16;
                        }
                    }
                    v4.X(i20, diVar.X0() + 1, diVar.b1(), new di.s2(this, (org.telegram.ui.cn) diVar.W1, tL_messageMediaPoll, arrayList2, 8));
                    return;
                }
            }
        }
    }
}
