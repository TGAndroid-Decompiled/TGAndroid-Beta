package org.telegram.ui;

import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
public final class n0 implements TextWatcher {
    public final int f39808a;
    public final Object f39809b;

    public n0(Object obj, int i10) {
        this.f39808a = i10;
        this.f39809b = obj;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String charSequence2;
        boolean z10;
        int i13 = this.f39808a;
        Object obj = this.f39809b;
        switch (i13) {
            case 0:
                return;
            case 1:
                ia iaVar = (ia) obj;
                oa oaVar = iaVar.f38220c;
                String str = oaVar.f40210r;
                if (charSequence == null) {
                    charSequence2 = "";
                } else {
                    charSequence2 = charSequence.toString();
                }
                oaVar.f40210r = charSequence2;
                oa oaVar2 = iaVar.f38220c;
                la laVar = oaVar2.E;
                if (laVar != null && str != null) {
                    laVar.b(oaVar2.f40210r);
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
                    org.telegram.messenger.z20.j(1.5f, xrVar.U1);
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
                wc0 wc0Var = (wc0) obj;
                qc0 qc0Var = wc0Var.S;
                if (wc0Var.R) {
                    wc0Var.removeCallbacks(qc0Var);
                    qc0Var.run();
                    return;
                }
                return;
            case 10:
                od0 od0Var = (od0) obj;
                md0 md0Var = od0Var.f40241y;
                if (od0Var.f40240x) {
                    od0Var.removeCallbacks(md0Var);
                    md0Var.run();
                    return;
                }
                return;
            case 11:
                me0 me0Var = (me0) obj;
                ae0 ae0Var = me0Var.f39681t0;
                if (me0Var.f39680s0) {
                    me0Var.removeCallbacks(ae0Var);
                    ae0Var.run();
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
        switch (this.f39808a) {
            case 0:
                return;
            case 1:
                ia iaVar = (ia) this.f39809b;
                oa oaVar = iaVar.f38220c;
                String str = oaVar.f40210r;
                if (charSequence == null) {
                    charSequence2 = "";
                } else {
                    charSequence2 = charSequence.toString();
                }
                oaVar.f40210r = charSequence2;
                oa oaVar2 = iaVar.f38220c;
                la laVar = oaVar2.E;
                if (laVar != null && str != null) {
                    laVar.b(oaVar2.f40210r);
                }
                if (!oaVar.f40209n) {
                    oaVar.h0(oaVar.f40210r);
                    return;
                }
                return;
            case 2:
                kd kdVar = (kd) this.f39809b;
                kdVar.i0(kdVar.f38775y.getText().toString());
                return;
            case 3:
                return;
            case 4:
                cp cpVar = (cp) this.f39809b;
                if (!cpVar.m0) {
                    String obj = cpVar.f36498b.getText().toString();
                    la laVar2 = cpVar.O;
                    if (laVar2 != null) {
                        laVar2.b(obj);
                    }
                    cpVar.b0(obj);
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
                p91 p91Var = (p91) this.f39809b;
                if (!p91Var.F) {
                    p91Var.d0(p91Var.f40542a.getText().toString(), false);
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
