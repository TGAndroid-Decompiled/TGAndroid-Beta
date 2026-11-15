package org.telegram.ui;

import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
public final class m0 implements TextWatcher {
    public final int f49082a;
    public final Object f49083b;

    public m0(Object obj, int i7) {
        this.f49082a = i7;
        this.f49083b = obj;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        String charSequence2;
        boolean z10;
        int i12 = this.f49082a;
        Object obj = this.f49083b;
        switch (i12) {
            case 0:
                return;
            case 1:
                ga gaVar = (ga) obj;
                la laVar = gaVar.f47382c;
                String str = laVar.f48912r;
                if (charSequence == null) {
                    charSequence2 = "";
                } else {
                    charSequence2 = charSequence.toString();
                }
                laVar.f48912r = charSequence2;
                la laVar2 = gaVar.f47382c;
                ia iaVar = laVar2.F;
                if (iaVar != null && str != null) {
                    iaVar.b(laVar2.f48912r);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
                return;
            case 6:
                yq yqVar = (yq) obj;
                if (charSequence.length() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                yqVar.X1 = z10;
                yqVar.V1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                yqVar.f46445a2 = ofFloat;
                ofFloat.addUpdateListener(new a3(yqVar, 8));
                if (!yqVar.X1) {
                    org.telegram.messenger.i20.k(1.5f, yqVar.f46445a2);
                    yqVar.f46445a2.setDuration(350L);
                } else {
                    yqVar.f46445a2.setDuration(220L);
                }
                yqVar.f46445a2.start();
                yqVar.m();
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
                ec0 ec0Var = gc0Var.f47411y;
                if (gc0Var.f47410x) {
                    gc0Var.removeCallbacks(ec0Var);
                    ec0Var.run();
                    return;
                }
                return;
            case 11:
                ed0 ed0Var = (ed0) obj;
                sc0 sc0Var = ed0Var.f46748u0;
                if (ed0Var.f46747t0) {
                    ed0Var.removeCallbacks(sc0Var);
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
        switch (this.f49082a) {
            case 0:
                return;
            case 1:
                ga gaVar = (ga) this.f49083b;
                la laVar = gaVar.f47382c;
                String str = laVar.f48912r;
                if (charSequence == null) {
                    charSequence2 = "";
                } else {
                    charSequence2 = charSequence.toString();
                }
                laVar.f48912r = charSequence2;
                la laVar2 = gaVar.f47382c;
                ia iaVar = laVar2.F;
                if (iaVar != null && str != null) {
                    iaVar.b(laVar2.f48912r);
                }
                if (!laVar.f48911n) {
                    laVar.i0(laVar.f48912r);
                    return;
                }
                return;
            case 2:
                ad adVar = (ad) this.f49083b;
                adVar.j0(adVar.f45028y.getText().toString());
                return;
            case 3:
                return;
            case 4:
                ho hoVar = (ho) this.f49083b;
                if (!hoVar.f47766n0) {
                    String obj = hoVar.f47750b.getText().toString();
                    ia iaVar2 = hoVar.P;
                    if (iaVar2 != null) {
                        iaVar2.b(obj);
                    }
                    hoVar.c0(obj);
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
                w71 w71Var = (w71) this.f49083b;
                if (!w71Var.G) {
                    w71Var.e0(w71Var.f52482a.getText().toString(), false);
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
