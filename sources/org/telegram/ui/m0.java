package org.telegram.ui;

import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
public final class m0 implements TextWatcher {
    public final int f49720a;
    public final Object f49721b;

    public m0(Object obj, int i7) {
        this.f49720a = i7;
        this.f49721b = obj;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        String charSequence2;
        boolean z10;
        int i12 = this.f49720a;
        Object obj = this.f49721b;
        switch (i12) {
            case 0:
                return;
            case 1:
                ga gaVar = (ga) obj;
                la laVar = gaVar.f48009c;
                String str = laVar.f49515r;
                if (charSequence == null) {
                    charSequence2 = "";
                } else {
                    charSequence2 = charSequence.toString();
                }
                laVar.f49515r = charSequence2;
                la laVar2 = gaVar.f48009c;
                ia iaVar = laVar2.F;
                if (iaVar != null && str != null) {
                    iaVar.b(laVar2.f49515r);
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
                zqVar.f47344a2 = ofFloat;
                ofFloat.addUpdateListener(new a3(zqVar, 8));
                if (!zqVar.X1) {
                    org.telegram.ui.Cells.c0.q(1.5f, zqVar.f47344a2);
                    zqVar.f47344a2.setDuration(350L);
                } else {
                    zqVar.f47344a2.setDuration(220L);
                }
                zqVar.f47344a2.start();
                zqVar.m();
                return;
            case 7:
            case 8:
                return;
            case 9:
                ob0 ob0Var = (ob0) obj;
                hb0 hb0Var = ob0Var.T;
                if (ob0Var.S) {
                    ob0Var.removeCallbacks(hb0Var);
                    hb0Var.run();
                    return;
                }
                return;
            case 10:
                gc0 gc0Var = (gc0) obj;
                ec0 ec0Var = gc0Var.f48043y;
                if (gc0Var.f48042x) {
                    gc0Var.removeCallbacks(ec0Var);
                    ec0Var.run();
                    return;
                }
                return;
            case 11:
                gd0 gd0Var = (gd0) obj;
                sc0 sc0Var = gd0Var.f48079u0;
                if (gd0Var.f48078t0) {
                    gd0Var.removeCallbacks(sc0Var);
                    sc0Var.run();
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
        switch (this.f49720a) {
            case 0:
                return;
            case 1:
                ga gaVar = (ga) this.f49721b;
                la laVar = gaVar.f48009c;
                String str = laVar.f49515r;
                if (charSequence == null) {
                    charSequence2 = "";
                } else {
                    charSequence2 = charSequence.toString();
                }
                laVar.f49515r = charSequence2;
                la laVar2 = gaVar.f48009c;
                ia iaVar = laVar2.F;
                if (iaVar != null && str != null) {
                    iaVar.b(laVar2.f49515r);
                }
                if (!laVar.f49514n) {
                    laVar.i0(laVar.f49515r);
                    return;
                }
                return;
            case 2:
                ad adVar = (ad) this.f49721b;
                adVar.j0(adVar.f45571y.getText().toString());
                return;
            case 3:
                return;
            case 4:
                jo joVar = (jo) this.f49721b;
                if (!joVar.f49036n0) {
                    String obj = joVar.f49020b.getText().toString();
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
                a81 a81Var = (a81) this.f49721b;
                if (!a81Var.G) {
                    a81Var.e0(a81Var.f45497a.getText().toString(), false);
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
