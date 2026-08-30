package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public final class vs0 extends org.telegram.ui.ActionBar.h5 {
    public final yu0 f30083f;

    public vs0(yu0 yu0Var) {
        this.f30083f = yu0Var;
    }

    @Override
    public final void l() {
        org.telegram.ui.ActionBar.w0 w0Var = this.f30083f.f31126k0;
        w0Var.setTranslationX(((View) w0Var.getParent()).getMeasuredWidth() - w0Var.getRight());
    }

    @Override
    public final void m() {
        yu0 yu0Var = this.f30083f;
        ks0 ks0Var = yu0Var.G0;
        ImageView imageView = yu0Var.f31133o0;
        yu0Var.S0 = false;
        yu0Var.T0 = null;
        org.telegram.ui.ActionBar.w0 w0Var = yu0Var.f31124j0;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        if (imageView != null && yu0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (ks0Var != null) {
            ks0Var.d.M(new org.telegram.ui.fr(2));
            ks0Var.h = 0L;
            ks0Var.g(false);
        }
        dt0 dt0Var = yu0Var.Q;
        if (dt0Var != null) {
            org.telegram.ui.yn ynVar = dt0Var.f40837a;
            org.telegram.ui.pn pnVar = ynVar.f40095lc;
            if (pnVar != null) {
                pnVar.m();
            }
            ynVar.f40135p3 = false;
            ynVar.f40084l0 = false;
            ynVar.hc(false);
            ynVar.Ic();
        }
        yu0Var.R0 = false;
        yu0Var.f31126k0.setVisibility(0);
        yu0Var.f31111d0.G(null, true);
        yu0Var.f31116f0.G(null, true);
        yu0Var.f31113e0.G(null, true);
        yu0Var.f31118g0.F(null, true);
        ju0 ju0Var = yu0Var.P;
        if (ju0Var != null) {
            ju0Var.E(null, null);
        }
        yu0Var.K0(false);
        jj0 jj0Var = yu0Var.f31135p0;
        if (jj0Var != null) {
            jj0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(nr.h).start();
        }
        if (yu0Var.f31152w0) {
            yu0Var.f31152w0 = false;
        } else {
            yu0Var.m1(false);
        }
    }

    @Override
    public final void n() {
        boolean z4;
        yu0 yu0Var = this.f30083f;
        yu0Var.S0 = true;
        ks0 ks0Var = yu0Var.G0;
        if (ks0Var != null) {
            if ((yu0Var.getSelectedTab() == 11 || yu0Var.getSelectedTab() == 12) && ks0Var.a()) {
                z4 = true;
            } else {
                z4 = false;
            }
            ks0Var.g(z4);
        }
        ImageView imageView = yu0Var.f31133o0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.w0 w0Var = yu0Var.f31124j0;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        yu0Var.f31126k0.setVisibility(8);
        yu0Var.K0(true);
        jj0 jj0Var = yu0Var.f31135p0;
        if (jj0Var != null) {
            jj0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(nr.h).start();
        }
    }

    @Override
    public final void p(kg.f fVar) {
        dt0 dt0Var = this.f30083f.Q;
        if (dt0Var != null) {
            dt0Var.f40837a.m9();
        }
    }

    @Override
    public final void q(EditText editText) {
        boolean z4;
        ju0 ju0Var;
        String obj = editText.getText().toString();
        yu0 yu0Var = this.f30083f;
        dt0 dt0Var = yu0Var.Q;
        if (dt0Var != null) {
            org.telegram.ui.yn ynVar = dt0Var.f40837a;
            org.telegram.ui.ActionBar.w0 w0Var = ynVar.f40022g0;
            if (w0Var != null) {
                ynVar.f40148q3 = obj;
                w0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && yu0Var.T0 == null) {
                org.telegram.ui.yn ynVar2 = dt0Var.f40837a;
                org.telegram.ui.pn pnVar = ynVar2.f40095lc;
                if (pnVar != null) {
                    pnVar.m();
                }
                ynVar2.f40135p3 = false;
                ynVar2.f40084l0 = false;
                ynVar2.hc(false);
                ynVar2.Ic();
            }
        }
        yu0Var.f31126k0.setVisibility(8);
        if (obj.length() == 0 && yu0Var.T0 == null) {
            z4 = false;
        } else {
            z4 = true;
        }
        yu0Var.R0 = z4;
        yu0Var.post(new nq0(this, 2));
        int i10 = yu0Var.f31120h0[0].C;
        if (i10 == 1) {
            tt0 tt0Var = yu0Var.f31111d0;
            if (tt0Var != null) {
                tt0Var.G(obj, true);
            }
        } else if (i10 == 3) {
            tt0 tt0Var2 = yu0Var.f31116f0;
            if (tt0Var2 != null) {
                tt0Var2.G(obj, true);
            }
        } else if (i10 == 4) {
            tt0 tt0Var3 = yu0Var.f31113e0;
            if (tt0Var3 != null) {
                tt0Var3.G(obj, true);
            }
        } else if (i10 == 7) {
            ot0 ot0Var = yu0Var.f31118g0;
            if (ot0Var != null) {
                ot0Var.F(obj, true);
            }
        } else if (i10 == 11 && (ju0Var = yu0Var.P) != null) {
            ju0Var.E(yu0Var.T0, obj);
        }
    }
}
