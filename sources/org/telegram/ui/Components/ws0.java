package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public final class ws0 extends org.telegram.ui.ActionBar.g5 {
    public final yu0 f29775f;

    public ws0(yu0 yu0Var) {
        this.f29775f = yu0Var;
    }

    @Override
    public final void l() {
        org.telegram.ui.ActionBar.v0 v0Var = this.f29775f.f30370n0;
        v0Var.setTranslationX(((View) v0Var.getParent()).getMeasuredWidth() - v0Var.getRight());
    }

    @Override
    public final void m() {
        yu0 yu0Var = this.f29775f;
        ls0 ls0Var = yu0Var.J0;
        ImageView imageView = yu0Var.f30379r0;
        yu0Var.V0 = false;
        yu0Var.W0 = null;
        org.telegram.ui.ActionBar.v0 v0Var = yu0Var.m0;
        if (v0Var != null) {
            v0Var.setVisibility(0);
        }
        if (imageView != null && yu0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (ls0Var != null) {
            ls0Var.d.M(new org.telegram.ui.kr(2));
            ls0Var.h = 0L;
            ls0Var.g(false);
        }
        et0 et0Var = yu0Var.T;
        if (et0Var != null) {
            org.telegram.ui.co coVar = et0Var.f33379a;
            org.telegram.ui.tn tnVar = coVar.nc;
            if (tnVar != null) {
                tnVar.m();
            }
            coVar.f32458s3 = false;
            coVar.f32404o0 = false;
            coVar.hc(false);
            coVar.Ic();
        }
        yu0Var.U0 = false;
        yu0Var.f30370n0.setVisibility(0);
        yu0Var.f30357g0.G(null, true);
        yu0Var.f30361i0.G(null, true);
        yu0Var.f30359h0.G(null, true);
        yu0Var.f30363j0.F(null, true);
        ju0 ju0Var = yu0Var.S;
        if (ju0Var != null) {
            ju0Var.E(null, null);
        }
        yu0Var.K0(false);
        aj0 aj0Var = yu0Var.f30382s0;
        if (aj0Var != null) {
            aj0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(qr.h).start();
        }
        if (yu0Var.f30399z0) {
            yu0Var.f30399z0 = false;
        } else {
            yu0Var.m1(false);
        }
    }

    @Override
    public final void n() {
        boolean z10;
        yu0 yu0Var = this.f29775f;
        yu0Var.V0 = true;
        ls0 ls0Var = yu0Var.J0;
        if (ls0Var != null) {
            if ((yu0Var.getSelectedTab() == 11 || yu0Var.getSelectedTab() == 12) && ls0Var.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ls0Var.g(z10);
        }
        ImageView imageView = yu0Var.f30379r0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.v0 v0Var = yu0Var.m0;
        if (v0Var != null) {
            v0Var.setVisibility(8);
        }
        yu0Var.f30370n0.setVisibility(8);
        yu0Var.K0(true);
        aj0 aj0Var = yu0Var.f30382s0;
        if (aj0Var != null) {
            aj0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(qr.h).start();
        }
    }

    @Override
    public final void p(ci.h2 h2Var) {
        et0 et0Var = this.f29775f.T;
        if (et0Var != null) {
            et0Var.f33379a.m9();
        }
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        ju0 ju0Var;
        String obj = editText.getText().toString();
        yu0 yu0Var = this.f29775f;
        et0 et0Var = yu0Var.T;
        if (et0Var != null) {
            org.telegram.ui.co coVar = et0Var.f33379a;
            org.telegram.ui.ActionBar.v0 v0Var = coVar.f32344j0;
            if (v0Var != null) {
                coVar.f32471t3 = obj;
                v0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && yu0Var.W0 == null) {
                org.telegram.ui.co coVar2 = et0Var.f33379a;
                org.telegram.ui.tn tnVar = coVar2.nc;
                if (tnVar != null) {
                    tnVar.m();
                }
                coVar2.f32458s3 = false;
                coVar2.f32404o0 = false;
                coVar2.hc(false);
                coVar2.Ic();
            }
        }
        yu0Var.f30370n0.setVisibility(8);
        if (obj.length() == 0 && yu0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        yu0Var.U0 = z10;
        yu0Var.post(new jq0(this, 2));
        int i10 = yu0Var.f30365k0[0].F;
        if (i10 == 1) {
            ut0 ut0Var = yu0Var.f30357g0;
            if (ut0Var != null) {
                ut0Var.G(obj, true);
            }
        } else if (i10 == 3) {
            ut0 ut0Var2 = yu0Var.f30361i0;
            if (ut0Var2 != null) {
                ut0Var2.G(obj, true);
            }
        } else if (i10 == 4) {
            ut0 ut0Var3 = yu0Var.f30359h0;
            if (ut0Var3 != null) {
                ut0Var3.G(obj, true);
            }
        } else if (i10 == 7) {
            pt0 pt0Var = yu0Var.f30363j0;
            if (pt0Var != null) {
                pt0Var.F(obj, true);
            }
        } else if (i10 == 11 && (ju0Var = yu0Var.S) != null) {
            ju0Var.E(yu0Var.W0, obj);
        }
    }
}
