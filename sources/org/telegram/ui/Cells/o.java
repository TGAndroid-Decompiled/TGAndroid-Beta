package org.telegram.ui.Cells;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.za0;
import org.telegram.ui.ba0;
public final class o implements gk0 {
    public final int f22371a;
    public final Object f22372b;
    public final Object f22373c;
    public final Object d;

    public o(Object obj, Object obj2, Object obj3, int i10) {
        this.f22371a = i10;
        this.f22372b = obj;
        this.f22373c = obj2;
        this.d = obj3;
    }

    @Override
    public final void f(int i10, View view) {
        TLRPC.WebPage webPage;
        int i11;
        int i12 = this.f22371a;
        String str = null;
        Object obj = this.f22373c;
        Object obj2 = this.d;
        Object obj3 = this.f22372b;
        boolean z10 = false;
        switch (i12) {
            case 0:
                t tVar = (t) obj3;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj;
                Context context = (Context) obj2;
                s sVar = (s) view;
                ba0 ba0Var = (ba0) tVar.f23061e3.get(i10);
                if (ba0Var.e && !d20.o()) {
                    k2Var.showDialog(new kg.i1(k2Var, 10, true));
                    return;
                } else if (!w7.j6.a(ba0Var)) {
                    s4.b0 b0Var = new s4.b0(context);
                    b0Var.f48045a = i10;
                    tVar.f23062f3.w0(b0Var);
                    w7.j6.b(ba0Var);
                    int i13 = s.h;
                    sVar.b(true, true);
                    for (int i14 = 0; i14 < tVar.getChildCount(); i14++) {
                        s sVar2 = (s) tVar.getChildAt(i14);
                        if (sVar2 != sVar) {
                            sVar2.b(false, true);
                        }
                    }
                    zs.e().k(292, 5, ba0Var);
                    return;
                } else {
                    return;
                }
            case 1:
                th.p1 p1Var = (th.p1) obj3;
                th.c0 c0Var = (th.c0) view;
                th.h0 h0Var = c0Var.K;
                z60 F = z60.F((ViewGroup) obj, new th.b(), view);
                F.p(15, -1, cd.a0(null, null, 2131748818, cd.x(h0Var.d, true)));
                F.k();
                F.c(2131232265, cd.L0(2131747802, null), new rh.o(26, (th.o7) obj2, h0Var), false);
                F.l(2131232102, cd.L0(2131751767, null), new rh.o(27, p1Var, c0Var), !h0Var.e);
                F.l(2131232107, cd.L0(2131751599, null), new rh.o(28, p1Var, h0Var), (p1Var.M == d20.i(p1Var.N).e() || p1Var.f()) ? true : true);
                F.Z();
                return;
            case 2:
                vh.f5 f5Var = (vh.f5) obj3;
                q20 q20Var = (q20) obj;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj2;
                if (view instanceof k7) {
                    jj message = ((k7) view).getMessage();
                    if (message != null) {
                        org.telegram.messenger.b6.q(f5Var.f21583a).v(f5Var);
                        if (f5Var.Y1 != null) {
                            org.telegram.messenger.b8.G(f5Var.f21583a).f(f5Var.Y1.F0());
                            f5Var.Y1 = null;
                        }
                        if (!message.f16383w0 && !message.f16387x0) {
                            String S0 = message.S0();
                            if (!TextUtils.isEmpty(S0)) {
                                f5Var.Y1 = message;
                                org.telegram.messenger.b6.q(f5Var.f21583a).a(S0, message, f5Var);
                                org.telegram.messenger.b8.G(f5Var.f21583a).X(message.F0(), message, 1, 0);
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
                a51 G = f5Var.f51144h2.G(i10 - 1);
                if (G != null && G.d == 1) {
                    new vh.f5(f5Var.getContext(), true, f5Var, q20Var, p6Var).show();
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
                a51 G2 = t5Var.P1.G(i10 - 1);
                if (G2 != null) {
                    if (G2.H(vh.r5.class) && (webPage = t5Var.Y1) != null && !vh.t5.g1(webPage)) {
                        jg.d3 d3Var = new jg.d3(context2, t5Var.f21583a);
                        jg.s0 s0Var = new jg.s0();
                        s0Var.f10208c = m3Var2.d.getText().toString();
                        if (t5Var.f51968e2) {
                            str = m3Var.d.getText().toString();
                        }
                        s0Var.f10207b = str;
                        TLRPC.WebPage webPage2 = t5Var.Y1;
                        s0Var.d = webPage2;
                        s0Var.e = t5Var.f51970g2;
                        s0Var.f10209f = t5Var.f51969f2;
                        ph.h1 h1Var = new ph.h1(t5Var, 29);
                        d3Var.G = s0Var;
                        if (webPage2 != null && (webPage2.photo != null || jj.K4(webPage2.document))) {
                            i11 = 0;
                        } else {
                            i11 = 8;
                        }
                        za0 za0Var = d3Var.f9940y;
                        za0Var.setVisibility(i11);
                        d3Var.f9934f.b(d3Var.f9931a, s0Var, false);
                        d3Var.f9939x.a(!s0Var.f10209f, false);
                        za0Var.a(!s0Var.e, false);
                        d3Var.H = h1Var;
                        d3Var.e.setImageDrawable(new jg.x0(k4Var, 1));
                        d3Var.show();
                        return;
                    } else if (G2.d == 2 && (view instanceof t8)) {
                        boolean z11 = !t5Var.f51968e2;
                        t5Var.f51968e2 = z11;
                        ((t8) view).setChecked(z11);
                        t5Var.P1.O(true);
                        if (t5Var.f51968e2) {
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
        this.f22371a = 3;
        this.f22372b = t5Var;
        this.d = context;
        this.f22373c = k4Var;
    }
}
