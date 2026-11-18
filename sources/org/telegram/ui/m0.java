package org.telegram.ui;

import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
public final class m0 implements TextWatcher {
    public final int f49679a;
    public final Object f49680b;

    public m0(Object obj, int i7) {
        this.f49679a = i7;
        this.f49680b = obj;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        String charSequence2;
        boolean z10;
        int i12 = this.f49679a;
        Object obj = this.f49680b;
        switch (i12) {
            case 0:
                return;
            case 1:
                ga gaVar = (ga) obj;
                la laVar = gaVar.f47945c;
                String str = laVar.f49493r;
                if (charSequence == null) {
                    charSequence2 = "";
                } else {
                    charSequence2 = charSequence.toString();
                }
                laVar.f49493r = charSequence2;
                la laVar2 = gaVar.f47945c;
                ia iaVar = laVar2.F;
                if (iaVar != null && str != null) {
                    iaVar.b(laVar2.f49493r);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
                return;
            case 6:
                zq zqVar = (zq) obj;
                if (charSequence.length() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zqVar.X1 = z10;
                zqVar.V1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                zqVar.f47300a2 = ofFloat;
                ofFloat.addUpdateListener(new a3(zqVar, 8));
                if (!zqVar.X1) {
                    org.telegram.ui.Cells.c0.q(1.5f, zqVar.f47300a2);
                    zqVar.f47300a2.setDuration(350L);
                } else {
                    zqVar.f47300a2.setDuration(220L);
                }
                zqVar.f47300a2.start();
                zqVar.m();
                return;
            case 7:
            case 8:
                return;
            case 9:
                pb0 pb0Var = (pb0) obj;
                ib0 ib0Var = pb0Var.T;
                if (pb0Var.S) {
                    pb0Var.removeCallbacks(ib0Var);
                    ib0Var.run();
                    return;
                }
                return;
            case 10:
                hc0 hc0Var = (hc0) obj;
                fc0 fc0Var = hc0Var.f48250y;
                if (hc0Var.f48249x) {
                    hc0Var.removeCallbacks(fc0Var);
                    fc0Var.run();
                    return;
                }
                return;
            case 11:
                hd0 hd0Var = (hd0) obj;
                tc0 tc0Var = hd0Var.f48330u0;
                if (hd0Var.f48329t0) {
                    hd0Var.removeCallbacks(tc0Var);
                    tc0Var.run();
                    return;
                }
                return;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            default:
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        String charSequence2;
        switch (this.f49679a) {
            case 0:
                return;
            case 1:
                ga gaVar = (ga) this.f49680b;
                la laVar = gaVar.f47945c;
                String str = laVar.f49493r;
                if (charSequence == null) {
                    charSequence2 = "";
                } else {
                    charSequence2 = charSequence.toString();
                }
                laVar.f49493r = charSequence2;
                la laVar2 = gaVar.f47945c;
                ia iaVar = laVar2.F;
                if (iaVar != null && str != null) {
                    iaVar.b(laVar2.f49493r);
                }
                if (!laVar.f49492n) {
                    laVar.i0(laVar.f49493r);
                    return;
                }
                return;
            case 2:
                ad adVar = (ad) this.f49680b;
                adVar.j0(adVar.f45565y.getText().toString());
                return;
            case 3:
                return;
            case 4:
                jo joVar = (jo) this.f49680b;
                if (!joVar.f49013n0) {
                    String obj = joVar.f48997b.getText().toString();
                    ia iaVar2 = joVar.P;
                    if (iaVar2 != null) {
                        iaVar2.b(obj);
                    }
                    joVar.c0(obj);
                    return;
                }
                return;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return;
            case 16:
                a81 a81Var = (a81) this.f49680b;
                if (!a81Var.G) {
                    a81Var.e0(a81Var.f45491a.getText().toString(), false);
                    return;
                }
                return;
            case 17:
            case 18:
            default:
                return;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void d(Editable editable) {
    }

    private final void e(Editable editable) {
    }

    private final void A(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void B(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void C(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void D(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void E(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void F(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void G(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void H(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void I(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void J(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void g(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void h(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void i(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void j(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void k(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void l(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void m(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void n(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void o(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void p(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void q(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void r(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void s(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void t(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void u(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void v(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void w(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void x(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void y(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void z(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
