package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public final class ht0 extends org.telegram.ui.ActionBar.e5 {
    public final jv0 f24867f;

    public ht0(jv0 jv0Var) {
        this.f24867f = jv0Var;
    }

    @Override
    public final void l() {
        org.telegram.ui.ActionBar.u0 u0Var = this.f24867f.f25540n0;
        u0Var.setTranslationX(((View) u0Var.getParent()).getMeasuredWidth() - u0Var.getRight());
    }

    @Override
    public final void m() {
        jv0 jv0Var = this.f24867f;
        ws0 ws0Var = jv0Var.J0;
        ImageView imageView = jv0Var.f25549r0;
        jv0Var.V0 = false;
        jv0Var.W0 = null;
        org.telegram.ui.ActionBar.u0 u0Var = jv0Var.m0;
        if (u0Var != null) {
            u0Var.setVisibility(0);
        }
        if (imageView != null && jv0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (ws0Var != null) {
            ws0Var.d.M(new org.telegram.ui.fr(2));
            ws0Var.h = 0L;
            ws0Var.g(false);
        }
        pt0 pt0Var = jv0Var.T;
        if (pt0Var != null) {
            org.telegram.ui.xn xnVar = pt0Var.f40193a;
            org.telegram.ui.on onVar = xnVar.nc;
            if (onVar != null) {
                onVar.m();
            }
            xnVar.f39634s3 = false;
            xnVar.f39580o0 = false;
            xnVar.hc(false);
            xnVar.Ic();
        }
        jv0Var.U0 = false;
        jv0Var.f25540n0.setVisibility(0);
        jv0Var.f25527g0.G(null, true);
        jv0Var.f25531i0.G(null, true);
        jv0Var.f25529h0.G(null, true);
        jv0Var.f25533j0.F(null, true);
        uu0 uu0Var = jv0Var.S;
        if (uu0Var != null) {
            uu0Var.E(null, null);
        }
        jv0Var.K0(false);
        lj0 lj0Var = jv0Var.f25552s0;
        if (lj0Var != null) {
            lj0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(rr.h).start();
        }
        if (jv0Var.f25569z0) {
            jv0Var.f25569z0 = false;
        } else {
            jv0Var.m1(false);
        }
    }

    @Override
    public final void n() {
        boolean z10;
        jv0 jv0Var = this.f24867f;
        jv0Var.V0 = true;
        ws0 ws0Var = jv0Var.J0;
        if (ws0Var != null) {
            if ((jv0Var.getSelectedTab() == 11 || jv0Var.getSelectedTab() == 12) && ws0Var.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ws0Var.g(z10);
        }
        ImageView imageView = jv0Var.f25549r0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.u0 u0Var = jv0Var.m0;
        if (u0Var != null) {
            u0Var.setVisibility(8);
        }
        jv0Var.f25540n0.setVisibility(8);
        jv0Var.K0(true);
        lj0 lj0Var = jv0Var.f25552s0;
        if (lj0Var != null) {
            lj0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(rr.h).start();
        }
    }

    @Override
    public final void p(ci.h2 h2Var) {
        pt0 pt0Var = this.f24867f.T;
        if (pt0Var != null) {
            pt0Var.f40193a.m9();
        }
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        uu0 uu0Var;
        String obj = editText.getText().toString();
        jv0 jv0Var = this.f24867f;
        pt0 pt0Var = jv0Var.T;
        if (pt0Var != null) {
            org.telegram.ui.xn xnVar = pt0Var.f40193a;
            org.telegram.ui.ActionBar.u0 u0Var = xnVar.f39520j0;
            if (u0Var != null) {
                xnVar.f39647t3 = obj;
                u0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && jv0Var.W0 == null) {
                org.telegram.ui.xn xnVar2 = pt0Var.f40193a;
                org.telegram.ui.on onVar = xnVar2.nc;
                if (onVar != null) {
                    onVar.m();
                }
                xnVar2.f39634s3 = false;
                xnVar2.f39580o0 = false;
                xnVar2.hc(false);
                xnVar2.Ic();
            }
        }
        jv0Var.f25540n0.setVisibility(8);
        if (obj.length() == 0 && jv0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        jv0Var.U0 = z10;
        jv0Var.post(new wq0(this, 3));
        int i10 = jv0Var.f25535k0[0].F;
        if (i10 == 1) {
            fu0 fu0Var = jv0Var.f25527g0;
            if (fu0Var != null) {
                fu0Var.G(obj, true);
            }
        } else if (i10 == 3) {
            fu0 fu0Var2 = jv0Var.f25531i0;
            if (fu0Var2 != null) {
                fu0Var2.G(obj, true);
            }
        } else if (i10 == 4) {
            fu0 fu0Var3 = jv0Var.f25529h0;
            if (fu0Var3 != null) {
                fu0Var3.G(obj, true);
            }
        } else if (i10 == 7) {
            au0 au0Var = jv0Var.f25533j0;
            if (au0Var != null) {
                au0Var.F(obj, true);
            }
        } else if (i10 == 11 && (uu0Var = jv0Var.S) != null) {
            uu0Var.E(jv0Var.W0, obj);
        }
    }
}
