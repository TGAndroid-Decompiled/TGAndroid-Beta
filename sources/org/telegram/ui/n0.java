package org.telegram.ui;

import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
public final class n0 implements TextWatcher {
    public final int f39658a;
    public final Object f39659b;

    public n0(Object obj, int i10) {
        this.f39658a = i10;
        this.f39659b = obj;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String charSequence2;
        boolean z10;
        int i13 = this.f39658a;
        Object obj = this.f39659b;
        switch (i13) {
            case 0:
                return;
            case 1:
                ia iaVar = (ia) obj;
                oa oaVar = iaVar.f37987c;
                String str = oaVar.f40115r;
                if (charSequence == null) {
                    charSequence2 = "";
                } else {
                    charSequence2 = charSequence.toString();
                }
                oaVar.f40115r = charSequence2;
                oa oaVar2 = iaVar.f37987c;
                la laVar = oaVar2.E;
                if (laVar != null && str != null) {
                    laVar.b(oaVar2.f40115r);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
                return;
            case 6:
                xr xrVar = (xr) obj;
                if (charSequence.length() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xrVar.R1 = z10;
                xrVar.P1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                xrVar.U1 = ofFloat;
                ofFloat.addUpdateListener(new a3(xrVar, 8));
                if (!xrVar.R1) {
                    org.telegram.messenger.a30.j(1.5f, xrVar.U1);
                    xrVar.U1.setDuration(350L);
                } else {
                    xrVar.U1.setDuration(220L);
                }
                xrVar.U1.start();
                xrVar.m();
                return;
            case 7:
            case 8:
                return;
            case 9:
                vc0 vc0Var = (vc0) obj;
                pc0 pc0Var = vc0Var.S;
                if (vc0Var.R) {
                    vc0Var.removeCallbacks(pc0Var);
                    pc0Var.run();
                    return;
                }
                return;
            case 10:
                nd0 nd0Var = (nd0) obj;
                ld0 ld0Var = nd0Var.f39868y;
                if (nd0Var.f39867x) {
                    nd0Var.removeCallbacks(ld0Var);
                    ld0Var.run();
                    return;
                }
                return;
            case 11:
                le0 le0Var = (le0) obj;
                zd0 zd0Var = le0Var.f39258t0;
                if (le0Var.f39257s0) {
                    le0Var.removeCallbacks(zd0Var);
                    zd0Var.run();
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
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String charSequence2;
        switch (this.f39658a) {
            case 0:
                return;
            case 1:
                ia iaVar = (ia) this.f39659b;
                oa oaVar = iaVar.f37987c;
                String str = oaVar.f40115r;
                if (charSequence == null) {
                    charSequence2 = "";
                } else {
                    charSequence2 = charSequence.toString();
                }
                oaVar.f40115r = charSequence2;
                oa oaVar2 = iaVar.f37987c;
                la laVar = oaVar2.E;
                if (laVar != null && str != null) {
                    laVar.b(oaVar2.f40115r);
                }
                if (!oaVar.f40114n) {
                    oaVar.i0(oaVar.f40115r);
                    return;
                }
                return;
            case 2:
                kd kdVar = (kd) this.f39659b;
                kdVar.j0(kdVar.f38838y.getText().toString());
                return;
            case 3:
                return;
            case 4:
                cp cpVar = (cp) this.f39659b;
                if (!cpVar.m0) {
                    String obj = cpVar.f36359b.getText().toString();
                    la laVar2 = cpVar.O;
                    if (laVar2 != null) {
                        laVar2.b(obj);
                    }
                    cpVar.c0(obj);
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
                n91 n91Var = (n91) this.f39659b;
                if (!n91Var.F) {
                    n91Var.e0(n91Var.f39776a.getText().toString(), false);
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

    private final void A(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void B(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void C(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void D(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void E(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void F(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void G(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void H(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void I(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void J(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void f(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void g(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void h(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void i(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void j(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void k(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void l(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void m(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void n(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void o(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void p(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void q(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void r(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void s(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void t(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void u(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void v(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void w(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void x(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void y(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void z(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
