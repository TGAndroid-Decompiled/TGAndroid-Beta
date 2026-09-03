package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public final class vs0 extends org.telegram.ui.ActionBar.h5 {
    public final yu0 f30047f;

    public vs0(yu0 yu0Var) {
        this.f30047f = yu0Var;
    }

    @Override
    public final void l() {
        org.telegram.ui.ActionBar.w0 w0Var = this.f30047f.f31137k0;
        w0Var.setTranslationX(((View) w0Var.getParent()).getMeasuredWidth() - w0Var.getRight());
    }

    @Override
    public final void m() {
        yu0 yu0Var = this.f30047f;
        ks0 ks0Var = yu0Var.G0;
        ImageView imageView = yu0Var.f31144o0;
        yu0Var.S0 = false;
        yu0Var.T0 = null;
        org.telegram.ui.ActionBar.w0 w0Var = yu0Var.f31135j0;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        if (imageView != null && yu0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (ks0Var != null) {
            ks0Var.d.M(new org.telegram.ui.hr(2));
            ks0Var.h = 0L;
            ks0Var.g(false);
        }
        dt0 dt0Var = yu0Var.Q;
        if (dt0Var != null) {
            org.telegram.ui.ao aoVar = dt0Var.f32924a;
            org.telegram.ui.rn rnVar = aoVar.f40661lc;
            if (rnVar != null) {
                rnVar.m();
            }
            aoVar.f40701p3 = false;
            aoVar.f40650l0 = false;
            aoVar.hc(false);
            aoVar.Ic();
        }
        yu0Var.R0 = false;
        yu0Var.f31137k0.setVisibility(0);
        yu0Var.f31122d0.G(null, true);
        yu0Var.f31127f0.G(null, true);
        yu0Var.f31124e0.G(null, true);
        yu0Var.f31129g0.F(null, true);
        ju0 ju0Var = yu0Var.P;
        if (ju0Var != null) {
            ju0Var.E(null, null);
        }
        yu0Var.K0(false);
        jj0 jj0Var = yu0Var.f31146p0;
        if (jj0Var != null) {
            jj0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(mr.h).start();
        }
        if (yu0Var.f31163w0) {
            yu0Var.f31163w0 = false;
        } else {
            yu0Var.m1(false);
        }
    }

    @Override
    public final void n() {
        boolean z4;
        yu0 yu0Var = this.f30047f;
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
        ImageView imageView = yu0Var.f31144o0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.w0 w0Var = yu0Var.f31135j0;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        yu0Var.f31137k0.setVisibility(8);
        yu0Var.K0(true);
        jj0 jj0Var = yu0Var.f31146p0;
        if (jj0Var != null) {
            jj0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(mr.h).start();
        }
    }

    @Override
    public final void p(kg.f fVar) {
        dt0 dt0Var = this.f30047f.Q;
        if (dt0Var != null) {
            dt0Var.f32924a.m9();
        }
    }

    @Override
    public final void q(EditText editText) {
        boolean z4;
        ju0 ju0Var;
        String obj = editText.getText().toString();
        yu0 yu0Var = this.f30047f;
        dt0 dt0Var = yu0Var.Q;
        if (dt0Var != null) {
            org.telegram.ui.ao aoVar = dt0Var.f32924a;
            org.telegram.ui.ActionBar.w0 w0Var = aoVar.f40588g0;
            if (w0Var != null) {
                aoVar.f40714q3 = obj;
                w0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && yu0Var.T0 == null) {
                org.telegram.ui.ao aoVar2 = dt0Var.f32924a;
                org.telegram.ui.rn rnVar = aoVar2.f40661lc;
                if (rnVar != null) {
                    rnVar.m();
                }
                aoVar2.f40701p3 = false;
                aoVar2.f40650l0 = false;
                aoVar2.hc(false);
                aoVar2.Ic();
            }
        }
        yu0Var.f31137k0.setVisibility(8);
        if (obj.length() == 0 && yu0Var.T0 == null) {
            z4 = false;
        } else {
            z4 = true;
        }
        yu0Var.R0 = z4;
        yu0Var.post(new nq0(this, 2));
        int i10 = yu0Var.f31131h0[0].C;
        if (i10 == 1) {
            tt0 tt0Var = yu0Var.f31122d0;
            if (tt0Var != null) {
                tt0Var.G(obj, true);
            }
        } else if (i10 == 3) {
            tt0 tt0Var2 = yu0Var.f31127f0;
            if (tt0Var2 != null) {
                tt0Var2.G(obj, true);
            }
        } else if (i10 == 4) {
            tt0 tt0Var3 = yu0Var.f31124e0;
            if (tt0Var3 != null) {
                tt0Var3.G(obj, true);
            }
        } else if (i10 == 7) {
            ot0 ot0Var = yu0Var.f31129g0;
            if (ot0Var != null) {
                ot0Var.F(obj, true);
            }
        } else if (i10 == 11 && (ju0Var = yu0Var.P) != null) {
            ju0Var.E(yu0Var.T0, obj);
        }
    }
}
