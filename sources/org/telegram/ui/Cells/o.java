package org.telegram.ui.Cells;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.kj;
import org.telegram.messenger.r20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.za0;
import org.telegram.ui.aa0;
public final class o implements hk0 {
    public final int f22372a;
    public final Object f22373b;
    public final Object f22374c;
    public final Object d;

    public o(Object obj, Object obj2, Object obj3, int i10) {
        this.f22372a = i10;
        this.f22373b = obj;
        this.f22374c = obj2;
        this.d = obj3;
    }

    @Override
    public final void f(int i10, View view) {
        TLRPC.WebPage webPage;
        int i11;
        int i12 = this.f22372a;
        String str = null;
        Object obj = this.f22374c;
        Object obj2 = this.d;
        Object obj3 = this.f22373b;
        boolean z10 = false;
        switch (i12) {
            case 0:
                t tVar = (t) obj3;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj;
                Context context = (Context) obj2;
                s sVar = (s) view;
                aa0 aa0Var = (aa0) tVar.f23062e3.get(i10);
                if (aa0Var.e && !e20.o()) {
                    k2Var.showDialog(new kg.i1(k2Var, 10, true));
                    return;
                } else if (!w7.j6.a(aa0Var)) {
                    s4.b0 b0Var = new s4.b0(context);
                    b0Var.f48056a = i10;
                    tVar.f23063f3.w0(b0Var);
                    w7.j6.b(aa0Var);
                    int i13 = s.h;
                    sVar.b(true, true);
                    for (int i14 = 0; i14 < tVar.getChildCount(); i14++) {
                        s sVar2 = (s) tVar.getChildAt(i14);
                        if (sVar2 != sVar) {
                            sVar2.b(false, true);
                        }
                    }
                    at.e().k(292, 5, aa0Var);
                    return;
                } else {
                    return;
                }
            case 1:
                th.p1 p1Var = (th.p1) obj3;
                th.c0 c0Var = (th.c0) view;
                th.h0 h0Var = c0Var.K;
                z60 F = z60.F((ViewGroup) obj, new th.b(), view);
                F.p(15, -1, dd.a0(null, null, 2131748818, dd.x(h0Var.d, true)));
                F.k();
                F.c(2131232265, dd.L0(2131747802, null), new rh.n(27, (th.o7) obj2, h0Var), false);
                F.l(2131232102, dd.L0(2131751767, null), new rh.n(28, p1Var, c0Var), !h0Var.e);
                F.l(2131232107, dd.L0(2131751599, null), new rh.n(29, p1Var, h0Var), (p1Var.M == e20.i(p1Var.N).e() || p1Var.f()) ? true : true);
                F.Z();
                return;
            case 2:
                vh.f5 f5Var = (vh.f5) obj3;
                r20 r20Var = (r20) obj;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj2;
                if (view instanceof k7) {
                    kj message = ((k7) view).getMessage();
                    if (message != null) {
                        org.telegram.messenger.b6.q(f5Var.f21584a).v(f5Var);
                        if (f5Var.Y1 != null) {
                            org.telegram.messenger.b8.G(f5Var.f21584a).f(f5Var.Y1.F0());
                            f5Var.Y1 = null;
                        }
                        if (!message.f16736w0 && !message.f16740x0) {
                            String S0 = message.S0();
                            if (!TextUtils.isEmpty(S0)) {
                                f5Var.Y1 = message;
                                org.telegram.messenger.b6.q(f5Var.f21584a).a(S0, message, f5Var);
                                org.telegram.messenger.b8.G(f5Var.f21584a).X(message.F0(), message, 1, 0);
                                return;
                            }
                            return;
                        }
                        f5Var.X1.a(message);
                        vh.f5 f5Var2 = f5Var.S1;
                        if (f5Var2 != null) {
                            f5Var2.dismiss();
                        }
                        f5Var.dismiss();
                        return;
                    }
                    return;
                }
                b51 G = f5Var.f51159h2.G(i10 - 1);
                if (G != null && G.d == 1) {
                    new vh.f5(f5Var.getContext(), true, f5Var, r20Var, p6Var).show();
                    return;
                } else if (G != null && G.d == 2) {
                    f5Var.W1.b();
                    return;
                } else if (G != null && G.d == 3) {
                    f5Var.h1();
                    return;
                } else if (G != null && G.d == 4) {
                    f5Var.g1();
                    return;
                } else {
                    return;
                }
            default:
                vh.t5 t5Var = (vh.t5) obj3;
                Context context2 = (Context) obj2;
                vh.k4 k4Var = (vh.k4) obj;
                m3 m3Var = t5Var.R1;
                m3 m3Var2 = t5Var.Q1;
                b51 G2 = t5Var.P1.G(i10 - 1);
                if (G2 != null) {
                    if (G2.H(vh.r5.class) && (webPage = t5Var.Y1) != null && !vh.t5.g1(webPage)) {
                        jg.d3 d3Var = new jg.d3(context2, t5Var.f21584a);
                        jg.s0 s0Var = new jg.s0();
                        s0Var.f10209c = m3Var2.d.getText().toString();
                        if (t5Var.f51984e2) {
                            str = m3Var.d.getText().toString();
                        }
                        s0Var.f10208b = str;
                        TLRPC.WebPage webPage2 = t5Var.Y1;
                        s0Var.d = webPage2;
                        s0Var.e = t5Var.f51986g2;
                        s0Var.f10210f = t5Var.f51985f2;
                        ph.h1 h1Var = new ph.h1(t5Var, 29);
                        d3Var.G = s0Var;
                        if (webPage2 != null && (webPage2.photo != null || kj.K4(webPage2.document))) {
                            i11 = 0;
                        } else {
                            i11 = 8;
                        }
                        za0 za0Var = d3Var.f9941y;
                        za0Var.setVisibility(i11);
                        d3Var.f9935f.b(d3Var.f9932a, s0Var, false);
                        d3Var.f9940x.a(!s0Var.f10210f, false);
                        za0Var.a(!s0Var.e, false);
                        d3Var.H = h1Var;
                        d3Var.e.setImageDrawable(new jg.x0(k4Var, 1));
                        d3Var.show();
                        return;
                    } else if (G2.d == 2 && (view instanceof t8)) {
                        boolean z11 = !t5Var.f51984e2;
                        t5Var.f51984e2 = z11;
                        ((t8) view).setChecked(z11);
                        t5Var.P1.O(true);
                        if (t5Var.f51984e2) {
                            m3Var.requestFocus();
                            return;
                        } else {
                            m3Var2.requestFocus();
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public o(vh.t5 t5Var, Context context, vh.k4 k4Var) {
        this.f22372a = 3;
        this.f22373b = t5Var;
        this.d = context;
        this.f22374c = k4Var;
    }
}
