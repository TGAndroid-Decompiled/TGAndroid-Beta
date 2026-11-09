package org.telegram.ui;

import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
public final class m0 implements TextWatcher {
    public final int f47713a;
    public final Object f47714b;

    public m0(Object obj, int i7) {
        this.f47713a = i7;
        this.f47714b = obj;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m0.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        String charSequence2;
        boolean z9;
        int i12 = this.f47713a;
        Object obj = this.f47714b;
        switch (i12) {
            case 0:
                return;
            case 1:
                ga gaVar = (ga) obj;
                la laVar = gaVar.f45943c;
                String str = laVar.f47544r;
                if (charSequence == null) {
                    charSequence2 = "";
                } else {
                    charSequence2 = charSequence.toString();
                }
                laVar.f47544r = charSequence2;
                la laVar2 = gaVar.f45943c;
                ia iaVar = laVar2.E;
                if (iaVar != null && str != null) {
                    iaVar.b(laVar2.f47544r);
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
                    z9 = true;
                } else {
                    z9 = false;
                }
                yqVar.R1 = z9;
                yqVar.P1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                yqVar.U1 = ofFloat;
                ofFloat.addUpdateListener(new a3(yqVar, 8));
                if (!yqVar.R1) {
                    org.telegram.messenger.camera.q.i(1.5f, yqVar.U1);
                    yqVar.U1.setDuration(350L);
                } else {
                    yqVar.U1.setDuration(220L);
                }
                yqVar.U1.start();
                yqVar.m();
                return;
            case 7:
            case 8:
                return;
            case 9:
                qb0 qb0Var = (qb0) obj;
                jb0 jb0Var = qb0Var.S;
                if (qb0Var.R) {
                    qb0Var.removeCallbacks(jb0Var);
                    jb0Var.run();
                    return;
                }
                return;
            case 10:
                jc0 jc0Var = (jc0) obj;
                hc0 hc0Var = jc0Var.f46926y;
                if (jc0Var.f46925x) {
                    jc0Var.removeCallbacks(hc0Var);
                    hc0Var.run();
                    return;
                }
                return;
            case 11:
                id0 id0Var = (id0) obj;
                vc0 vc0Var = id0Var.f46648t0;
                if (id0Var.f46647s0) {
                    id0Var.removeCallbacks(vc0Var);
                    vc0Var.run();
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
        switch (this.f47713a) {
            case 0:
                return;
            case 1:
                ga gaVar = (ga) this.f47714b;
                la laVar = gaVar.f45943c;
                String str = laVar.f47544r;
                if (charSequence == null) {
                    charSequence2 = "";
                } else {
                    charSequence2 = charSequence.toString();
                }
                laVar.f47544r = charSequence2;
                la laVar2 = gaVar.f45943c;
                ia iaVar = laVar2.E;
                if (iaVar != null && str != null) {
                    iaVar.b(laVar2.f47544r);
                }
                if (!laVar.f47543n) {
                    laVar.i0(laVar.f47544r);
                    return;
                }
                return;
            case 2:
                bd bdVar = (bd) this.f47714b;
                bdVar.j0(bdVar.f44012y.getText().toString());
                return;
            case 3:
                return;
            case 4:
                io ioVar = (io) this.f47714b;
                if (!ioVar.m0) {
                    String obj = ioVar.f46710b.getText().toString();
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
                z71 z71Var = (z71) this.f47714b;
                if (!z71Var.F) {
                    z71Var.e0(z71Var.f52457a.getText().toString(), false);
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
