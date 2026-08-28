package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public final class cs0 extends org.telegram.ui.ActionBar.e5 {
    public final eu0 f27562f;

    public cs0(eu0 eu0Var) {
        this.f27562f = eu0Var;
    }

    @Override
    public final void l() {
        org.telegram.ui.ActionBar.w0 w0Var = this.f27562f.f28143j0;
        w0Var.setTranslationX(((View) w0Var.getParent()).getMeasuredWidth() - w0Var.getRight());
    }

    @Override
    public final void m() {
        eu0 eu0Var = this.f27562f;
        rr0 rr0Var = eu0Var.F0;
        ImageView imageView = eu0Var.f28150n0;
        eu0Var.R0 = false;
        eu0Var.S0 = null;
        org.telegram.ui.ActionBar.w0 w0Var = eu0Var.f28141i0;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        if (imageView != null && eu0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (rr0Var != null) {
            rr0Var.d.M(new org.telegram.ui.yq(2));
            rr0Var.h = 0L;
            rr0Var.g(false);
        }
        ks0 ks0Var = eu0Var.P;
        if (ks0Var != null) {
            org.telegram.ui.rn rnVar = ks0Var.f42731a;
            org.telegram.ui.in inVar = rnVar.f41977kc;
            if (inVar != null) {
                inVar.m();
            }
            rnVar.f42018o3 = false;
            rnVar.f41966k0 = false;
            rnVar.hc(false);
            rnVar.Ic();
        }
        eu0Var.Q0 = false;
        eu0Var.f28143j0.setVisibility(0);
        eu0Var.f28127c0.G(null, true);
        eu0Var.f28132e0.G(null, true);
        eu0Var.f28129d0.G(null, true);
        eu0Var.f28135f0.F(null, true);
        pt0 pt0Var = eu0Var.O;
        if (pt0Var != null) {
            pt0Var.E(null, null);
        }
        eu0Var.K0(false);
        pi0 pi0Var = eu0Var.f28152o0;
        if (pi0Var != null) {
            pi0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(gr.h).start();
        }
        if (eu0Var.f28168v0) {
            eu0Var.f28168v0 = false;
        } else {
            eu0Var.m1(false);
        }
    }

    @Override
    public final void n() {
        boolean z10;
        eu0 eu0Var = this.f27562f;
        eu0Var.R0 = true;
        rr0 rr0Var = eu0Var.F0;
        if (rr0Var != null) {
            if ((eu0Var.getSelectedTab() == 11 || eu0Var.getSelectedTab() == 12) && rr0Var.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            rr0Var.g(z10);
        }
        ImageView imageView = eu0Var.f28150n0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.w0 w0Var = eu0Var.f28141i0;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        eu0Var.f28143j0.setVisibility(8);
        eu0Var.K0(true);
        pi0 pi0Var = eu0Var.f28152o0;
        if (pi0Var != null) {
            pi0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(gr.h).start();
        }
    }

    @Override
    public final void p(fg.g gVar) {
        ks0 ks0Var = this.f27562f.P;
        if (ks0Var != null) {
            ks0Var.f42731a.m9();
        }
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        pt0 pt0Var;
        String obj = editText.getText().toString();
        eu0 eu0Var = this.f27562f;
        ks0 ks0Var = eu0Var.P;
        if (ks0Var != null) {
            org.telegram.ui.rn rnVar = ks0Var.f42731a;
            org.telegram.ui.ActionBar.w0 w0Var = rnVar.f41904f0;
            if (w0Var != null) {
                rnVar.f42028p3 = obj;
                w0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && eu0Var.S0 == null) {
                org.telegram.ui.rn rnVar2 = ks0Var.f42731a;
                org.telegram.ui.in inVar = rnVar2.f41977kc;
                if (inVar != null) {
                    inVar.m();
                }
                rnVar2.f42018o3 = false;
                rnVar2.f41966k0 = false;
                rnVar2.hc(false);
                rnVar2.Ic();
            }
        }
        eu0Var.f28143j0.setVisibility(8);
        if (obj.length() == 0 && eu0Var.S0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        eu0Var.Q0 = z10;
        eu0Var.post(new tp0(this, 2));
        int i9 = eu0Var.f28137g0[0].B;
        if (i9 == 1) {
            at0 at0Var = eu0Var.f28127c0;
            if (at0Var != null) {
                at0Var.G(obj, true);
            }
        } else if (i9 == 3) {
            at0 at0Var2 = eu0Var.f28132e0;
            if (at0Var2 != null) {
                at0Var2.G(obj, true);
            }
        } else if (i9 == 4) {
            at0 at0Var3 = eu0Var.f28129d0;
            if (at0Var3 != null) {
                at0Var3.G(obj, true);
            }
        } else if (i9 == 7) {
            vs0 vs0Var = eu0Var.f28135f0;
            if (vs0Var != null) {
                vs0Var.F(obj, true);
            }
        } else if (i9 == 11 && (pt0Var = eu0Var.O) != null) {
            pt0Var.E(eu0Var.S0, obj);
        }
    }
}
