package org.telegram.ui;

import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
public final class m0 implements TextWatcher {
    public final int f49700a;
    public final Object f49701b;

    public m0(Object obj, int i7) {
        this.f49700a = i7;
        this.f49701b = obj;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        String charSequence2;
        boolean z10;
        int i12 = this.f49700a;
        Object obj = this.f49701b;
        switch (i12) {
            case 0:
                return;
            case 1:
                ga gaVar = (ga) obj;
                la laVar = gaVar.f47966c;
                String str = laVar.f49513r;
                if (charSequence == null) {
                    charSequence2 = "";
                } else {
                    charSequence2 = charSequence.toString();
                }
                laVar.f49513r = charSequence2;
                la laVar2 = gaVar.f47966c;
                ia iaVar = laVar2.F;
                if (iaVar != null && str != null) {
                    iaVar.b(laVar2.f49513r);
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
                zqVar.f47329a2 = ofFloat;
                ofFloat.addUpdateListener(new a3(zqVar, 8));
                if (!zqVar.X1) {
                    org.telegram.ui.Cells.c0.q(1.5f, zqVar.f47329a2);
                    zqVar.f47329a2.setDuration(350L);
                } else {
                    zqVar.f47329a2.setDuration(220L);
                }
                zqVar.f47329a2.start();
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
                fc0 fc0Var = hc0Var.f48293y;
                if (hc0Var.f48292x) {
                    hc0Var.removeCallbacks(fc0Var);
                    fc0Var.run();
                    return;
                }
                return;
            case 11:
                gd0 gd0Var = (gd0) obj;
                tc0 tc0Var = gd0Var.f48027u0;
                if (gd0Var.f48026t0) {
                    gd0Var.removeCallbacks(tc0Var);
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
        switch (this.f49700a) {
            case 0:
                return;
            case 1:
                ga gaVar = (ga) this.f49701b;
                la laVar = gaVar.f47966c;
                String str = laVar.f49513r;
                if (charSequence == null) {
                    charSequence2 = "";
                } else {
                    charSequence2 = charSequence.toString();
                }
                laVar.f49513r = charSequence2;
                la laVar2 = gaVar.f47966c;
                ia iaVar = laVar2.F;
                if (iaVar != null && str != null) {
                    iaVar.b(laVar2.f49513r);
                }
                if (!laVar.f49512n) {
                    laVar.i0(laVar.f49513r);
                    return;
                }
                return;
            case 2:
                ad adVar = (ad) this.f49701b;
                adVar.j0(adVar.f45575y.getText().toString());
                return;
            case 3:
                return;
            case 4:
                io ioVar = (io) this.f49701b;
                if (!ioVar.f48795n0) {
                    String obj = ioVar.f48779b.getText().toString();
                    ia iaVar2 = ioVar.P;
                    if (iaVar2 != null) {
                        iaVar2.b(obj);
                    }
                    ioVar.c0(obj);
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
                a81 a81Var = (a81) this.f49701b;
                if (!a81Var.G) {
                    a81Var.e0(a81Var.f45501a.getText().toString(), false);
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
