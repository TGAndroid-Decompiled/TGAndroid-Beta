package org.telegram.ui;

import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
public final class m0 implements TextWatcher {
    public final int f47587a;
    public final Object f47588b;

    public m0(Object obj, int i7) {
        this.f47587a = i7;
        this.f47588b = obj;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        String charSequence2;
        boolean z9;
        int i12 = this.f47587a;
        Object obj = this.f47588b;
        switch (i12) {
            case 0:
                return;
            case 1:
                ga gaVar = (ga) obj;
                la laVar = gaVar.f45903c;
                String str = laVar.f47461r;
                if (charSequence == null) {
                    charSequence2 = "";
                } else {
                    charSequence2 = charSequence.toString();
                }
                laVar.f47461r = charSequence2;
                la laVar2 = gaVar.f45903c;
                ia iaVar = laVar2.E;
                if (iaVar != null && str != null) {
                    iaVar.b(laVar2.f47461r);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
                return;
            case 6:
                wq wqVar = (wq) obj;
                if (charSequence.length() != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                wqVar.R1 = z9;
                wqVar.P1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                wqVar.U1 = ofFloat;
                ofFloat.addUpdateListener(new a3(wqVar, 8));
                if (!wqVar.R1) {
                    org.telegram.messenger.camera.q.i(1.5f, wqVar.U1);
                    wqVar.U1.setDuration(350L);
                } else {
                    wqVar.U1.setDuration(220L);
                }
                wqVar.U1.start();
                wqVar.m();
                return;
            case 7:
            case 8:
                return;
            case 9:
                ob0 ob0Var = (ob0) obj;
                hb0 hb0Var = ob0Var.S;
                if (ob0Var.R) {
                    ob0Var.removeCallbacks(hb0Var);
                    hb0Var.run();
                    return;
                }
                return;
            case 10:
                hc0 hc0Var = (hc0) obj;
                fc0 fc0Var = hc0Var.f46318y;
                if (hc0Var.f46317x) {
                    hc0Var.removeCallbacks(fc0Var);
                    fc0Var.run();
                    return;
                }
                return;
            case 11:
                gd0 gd0Var = (gd0) obj;
                tc0 tc0Var = gd0Var.f45953t0;
                if (gd0Var.f45952s0) {
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
        switch (this.f47587a) {
            case 0:
                return;
            case 1:
                ga gaVar = (ga) this.f47588b;
                la laVar = gaVar.f45903c;
                String str = laVar.f47461r;
                if (charSequence == null) {
                    charSequence2 = "";
                } else {
                    charSequence2 = charSequence.toString();
                }
                laVar.f47461r = charSequence2;
                la laVar2 = gaVar.f45903c;
                ia iaVar = laVar2.E;
                if (iaVar != null && str != null) {
                    iaVar.b(laVar2.f47461r);
                }
                if (!laVar.f47460n) {
                    laVar.i0(laVar.f47461r);
                    return;
                }
                return;
            case 2:
                bd bdVar = (bd) this.f47588b;
                bdVar.j0(bdVar.f44268y.getText().toString());
                return;
            case 3:
                return;
            case 4:
                go goVar = (go) this.f47588b;
                if (!goVar.m0) {
                    String obj = goVar.f46021b.getText().toString();
                    ia iaVar2 = goVar.O;
                    if (iaVar2 != null) {
                        iaVar2.b(obj);
                    }
                    goVar.c0(obj);
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
                x71 x71Var = (x71) this.f47588b;
                if (!x71Var.F) {
                    x71Var.e0(x71Var.f51772a.getText().toString(), false);
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
