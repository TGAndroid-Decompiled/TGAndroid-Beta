package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public final class kt0 extends org.telegram.ui.ActionBar.e5 {
    public final mv0 f25824f;

    public kt0(mv0 mv0Var) {
        this.f25824f = mv0Var;
    }

    @Override
    public final void l() {
        org.telegram.ui.ActionBar.u0 u0Var = this.f25824f.f26430n0;
        u0Var.setTranslationX(((View) u0Var.getParent()).getMeasuredWidth() - u0Var.getRight());
    }

    @Override
    public final void m() {
        mv0 mv0Var = this.f25824f;
        zs0 zs0Var = mv0Var.J0;
        ImageView imageView = mv0Var.f26439r0;
        mv0Var.V0 = false;
        mv0Var.W0 = null;
        org.telegram.ui.ActionBar.u0 u0Var = mv0Var.m0;
        if (u0Var != null) {
            u0Var.setVisibility(0);
        }
        if (imageView != null && mv0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (zs0Var != null) {
            zs0Var.d.M(new org.telegram.ui.fr(2));
            zs0Var.h = 0L;
            zs0Var.g(false);
        }
        st0 st0Var = mv0Var.T;
        if (st0Var != null) {
            org.telegram.ui.xn xnVar = st0Var.f40301a;
            org.telegram.ui.on onVar = xnVar.nc;
            if (onVar != null) {
                onVar.m();
            }
            xnVar.f39727s3 = false;
            xnVar.f39673o0 = false;
            xnVar.hc(false);
            xnVar.Ic();
        }
        mv0Var.U0 = false;
        mv0Var.f26430n0.setVisibility(0);
        mv0Var.f26417g0.G(null, true);
        mv0Var.f26421i0.G(null, true);
        mv0Var.f26419h0.G(null, true);
        mv0Var.f26423j0.F(null, true);
        xu0 xu0Var = mv0Var.S;
        if (xu0Var != null) {
            xu0Var.E(null, null);
        }
        mv0Var.K0(false);
        oj0 oj0Var = mv0Var.f26442s0;
        if (oj0Var != null) {
            oj0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(tr.h).start();
        }
        if (mv0Var.f26459z0) {
            mv0Var.f26459z0 = false;
        } else {
            mv0Var.m1(false);
        }
    }

    @Override
    public final void n() {
        boolean z10;
        mv0 mv0Var = this.f25824f;
        mv0Var.V0 = true;
        zs0 zs0Var = mv0Var.J0;
        if (zs0Var != null) {
            if ((mv0Var.getSelectedTab() == 11 || mv0Var.getSelectedTab() == 12) && zs0Var.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            zs0Var.g(z10);
        }
        ImageView imageView = mv0Var.f26439r0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.u0 u0Var = mv0Var.m0;
        if (u0Var != null) {
            u0Var.setVisibility(8);
        }
        mv0Var.f26430n0.setVisibility(8);
        mv0Var.K0(true);
        oj0 oj0Var = mv0Var.f26442s0;
        if (oj0Var != null) {
            oj0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(tr.h).start();
        }
    }

    @Override
    public final void p(ci.h2 h2Var) {
        st0 st0Var = this.f25824f.T;
        if (st0Var != null) {
            st0Var.f40301a.m9();
        }
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        xu0 xu0Var;
        String obj = editText.getText().toString();
        mv0 mv0Var = this.f25824f;
        st0 st0Var = mv0Var.T;
        if (st0Var != null) {
            org.telegram.ui.xn xnVar = st0Var.f40301a;
            org.telegram.ui.ActionBar.u0 u0Var = xnVar.f39613j0;
            if (u0Var != null) {
                xnVar.f39740t3 = obj;
                u0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && mv0Var.W0 == null) {
                org.telegram.ui.xn xnVar2 = st0Var.f40301a;
                org.telegram.ui.on onVar = xnVar2.nc;
                if (onVar != null) {
                    onVar.m();
                }
                xnVar2.f39727s3 = false;
                xnVar2.f39673o0 = false;
                xnVar2.hc(false);
                xnVar2.Ic();
            }
        }
        mv0Var.f26430n0.setVisibility(8);
        if (obj.length() == 0 && mv0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        mv0Var.U0 = z10;
        mv0Var.post(new zq0(this, 3));
        int i10 = mv0Var.f26425k0[0].F;
        if (i10 == 1) {
            iu0 iu0Var = mv0Var.f26417g0;
            if (iu0Var != null) {
                iu0Var.G(obj, true);
            }
        } else if (i10 == 3) {
            iu0 iu0Var2 = mv0Var.f26421i0;
            if (iu0Var2 != null) {
                iu0Var2.G(obj, true);
            }
        } else if (i10 == 4) {
            iu0 iu0Var3 = mv0Var.f26419h0;
            if (iu0Var3 != null) {
                iu0Var3.G(obj, true);
            }
        } else if (i10 == 7) {
            du0 du0Var = mv0Var.f26423j0;
            if (du0Var != null) {
                du0Var.F(obj, true);
            }
        } else if (i10 == 11 && (xu0Var = mv0Var.S) != null) {
            xu0Var.E(mv0Var.W0, obj);
        }
    }
}
