package org.telegram.ui;

import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
public final class m0 implements TextWatcher {
    public final int f47764a;
    public final Object f47765b;

    public m0(Object obj, int i7) {
        this.f47764a = i7;
        this.f47765b = obj;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        String charSequence2;
        boolean z9;
        int i12 = this.f47764a;
        Object obj = this.f47765b;
        switch (i12) {
            case 0:
                return;
            case 1:
                ga gaVar = (ga) obj;
                la laVar = gaVar.f46055c;
                String str = laVar.f47561r;
                if (charSequence == null) {
                    charSequence2 = "";
                } else {
                    charSequence2 = charSequence.toString();
                }
                laVar.f47561r = charSequence2;
                la laVar2 = gaVar.f46055c;
                ia iaVar = laVar2.E;
                if (iaVar != null && str != null) {
                    iaVar.b(laVar2.f47561r);
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
                    z9 = true;
                } else {
                    z9 = false;
                }
                zqVar.R1 = z9;
                zqVar.P1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                zqVar.U1 = ofFloat;
                ofFloat.addUpdateListener(new a3(zqVar, 8));
                if (!zqVar.R1) {
                    org.telegram.messenger.camera.q.i(1.5f, zqVar.U1);
                    zqVar.U1.setDuration(350L);
                } else {
                    zqVar.U1.setDuration(220L);
                }
                zqVar.U1.start();
                zqVar.m();
                return;
            case 7:
            case 8:
                return;
            case 9:
                rb0 rb0Var = (rb0) obj;
                kb0 kb0Var = rb0Var.S;
                if (rb0Var.R) {
                    rb0Var.removeCallbacks(kb0Var);
                    kb0Var.run();
                    return;
                }
                return;
            case 10:
                kc0 kc0Var = (kc0) obj;
                ic0 ic0Var = kc0Var.f47266y;
                if (kc0Var.f47265x) {
                    kc0Var.removeCallbacks(ic0Var);
                    ic0Var.run();
                    return;
                }
                return;
            case 11:
                jd0 jd0Var = (jd0) obj;
                xc0 xc0Var = jd0Var.f46984t0;
                if (jd0Var.f46983s0) {
                    jd0Var.removeCallbacks(xc0Var);
                    xc0Var.run();
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
        switch (this.f47764a) {
            case 0:
                return;
            case 1:
                ga gaVar = (ga) this.f47765b;
                la laVar = gaVar.f46055c;
                String str = laVar.f47561r;
                if (charSequence == null) {
                    charSequence2 = "";
                } else {
                    charSequence2 = charSequence.toString();
                }
                laVar.f47561r = charSequence2;
                la laVar2 = gaVar.f46055c;
                ia iaVar = laVar2.E;
                if (iaVar != null && str != null) {
                    iaVar.b(laVar2.f47561r);
                }
                if (!laVar.f47560n) {
                    laVar.i0(laVar.f47561r);
                    return;
                }
                return;
            case 2:
                bd bdVar = (bd) this.f47765b;
                bdVar.j0(bdVar.f44041y.getText().toString());
                return;
            case 3:
                return;
            case 4:
                io ioVar = (io) this.f47765b;
                if (!ioVar.m0) {
                    String obj = ioVar.f46683b.getText().toString();
                    ia iaVar2 = ioVar.O;
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
                a81 a81Var = (a81) this.f47765b;
                if (!a81Var.F) {
                    a81Var.e0(a81Var.f43602a.getText().toString(), false);
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
