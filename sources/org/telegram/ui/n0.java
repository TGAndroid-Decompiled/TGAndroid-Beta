package org.telegram.ui;

import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
public final class n0 implements TextWatcher {
    public final int f47844a;
    public final Object f47845b;

    public n0(Object obj, int i3) {
        this.f47844a = i3;
        this.f47845b = obj;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        String charSequence2;
        boolean z10;
        int i12 = this.f47844a;
        Object obj = this.f47845b;
        switch (i12) {
            case 0:
                return;
            case 1:
                fa faVar = (fa) obj;
                ka kaVar = faVar.f45227c;
                String str = kaVar.f46844r;
                if (charSequence == null) {
                    charSequence2 = "";
                } else {
                    charSequence2 = charSequence.toString();
                }
                kaVar.f46844r = charSequence2;
                ka kaVar2 = faVar.f45227c;
                ha haVar = kaVar2.F;
                if (haVar != null && str != null) {
                    haVar.b(kaVar2.f46844r);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
                return;
            case 6:
                vq vqVar = (vq) obj;
                if (charSequence.length() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                vqVar.S1 = z10;
                vqVar.Q1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                vqVar.V1 = ofFloat;
                ofFloat.addUpdateListener(new b3(vqVar, 8));
                if (!vqVar.S1) {
                    org.telegram.messenger.camera.q.i(1.5f, vqVar.V1);
                    vqVar.V1.setDuration(350L);
                } else {
                    vqVar.V1.setDuration(220L);
                }
                vqVar.V1.start();
                vqVar.m();
                return;
            case 7:
            case 8:
                return;
            case 9:
                lb0 lb0Var = (lb0) obj;
                db0 db0Var = lb0Var.T;
                if (lb0Var.S) {
                    lb0Var.removeCallbacks(db0Var);
                    db0Var.run();
                    return;
                }
                return;
            case 10:
                fc0 fc0Var = (fc0) obj;
                dc0 dc0Var = fc0Var.f45257y;
                if (fc0Var.f45256x) {
                    fc0Var.removeCallbacks(dc0Var);
                    dc0Var.run();
                    return;
                }
                return;
            case 11:
                dd0 dd0Var = (dd0) obj;
                rc0 rc0Var = dd0Var.f44662u0;
                if (dd0Var.f44661t0) {
                    dd0Var.removeCallbacks(rc0Var);
                    rc0Var.run();
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
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        String charSequence2;
        switch (this.f47844a) {
            case 0:
                return;
            case 1:
                fa faVar = (fa) this.f47845b;
                ka kaVar = faVar.f45227c;
                String str = kaVar.f46844r;
                if (charSequence == null) {
                    charSequence2 = "";
                } else {
                    charSequence2 = charSequence.toString();
                }
                kaVar.f46844r = charSequence2;
                ka kaVar2 = faVar.f45227c;
                ha haVar = kaVar2.F;
                if (haVar != null && str != null) {
                    haVar.b(kaVar2.f46844r);
                }
                if (!kaVar.f46843n) {
                    kaVar.i0(kaVar.f46844r);
                    return;
                }
                return;
            case 2:
                ad adVar = (ad) this.f47845b;
                adVar.j0(adVar.f43758y.getText().toString());
                return;
            case 3:
                return;
            case 4:
                bo boVar = (bo) this.f47845b;
                if (!boVar.f44106n0) {
                    String obj = boVar.f44090b.getText().toString();
                    ha haVar2 = boVar.P;
                    if (haVar2 != null) {
                        haVar2.b(obj);
                    }
                    boVar.c0(obj);
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
                o71 o71Var = (o71) this.f47845b;
                if (!o71Var.G) {
                    o71Var.e0(o71Var.f48219a.getText().toString(), false);
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

    private final void A(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void B(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void C(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void D(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void E(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void F(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void G(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void H(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void I(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void J(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void g(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void h(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void i(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void j(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void k(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void l(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void m(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void n(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void o(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void p(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void q(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void r(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void s(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void t(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void u(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void v(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void w(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void x(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void y(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void z(int i3, int i10, int i11, CharSequence charSequence) {
    }
}
