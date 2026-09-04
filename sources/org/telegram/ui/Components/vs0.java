package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public final class vs0 extends org.telegram.ui.ActionBar.g5 {
    public final xu0 f31975f;

    public vs0(xu0 xu0Var) {
        this.f31975f = xu0Var;
    }

    @Override
    public final void l() {
        org.telegram.ui.ActionBar.v0 v0Var = this.f31975f.f32707n0;
        v0Var.setTranslationX(((View) v0Var.getParent()).getMeasuredWidth() - v0Var.getRight());
    }

    @Override
    public final void m() {
        xu0 xu0Var = this.f31975f;
        ks0 ks0Var = xu0Var.J0;
        ImageView imageView = xu0Var.f32716r0;
        xu0Var.V0 = false;
        xu0Var.W0 = null;
        org.telegram.ui.ActionBar.v0 v0Var = xu0Var.m0;
        if (v0Var != null) {
            v0Var.setVisibility(0);
        }
        if (imageView != null && xu0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (ks0Var != null) {
            ks0Var.d.M(new org.telegram.ui.lr(2));
            ks0Var.h = 0L;
            ks0Var.g(false);
        }
        dt0 dt0Var = xu0Var.T;
        if (dt0Var != null) {
            org.telegram.ui.eo eoVar = dt0Var.f36437a;
            org.telegram.ui.un unVar = eoVar.f35369oc;
            if (unVar != null) {
                unVar.m();
            }
            eoVar.f35412s3 = false;
            eoVar.f35358o0 = false;
            eoVar.hc(false);
            eoVar.Ic();
        }
        xu0Var.U0 = false;
        xu0Var.f32707n0.setVisibility(0);
        xu0Var.f32694g0.G(null, true);
        xu0Var.f32698i0.G(null, true);
        xu0Var.f32696h0.G(null, true);
        xu0Var.f32700j0.F(null, true);
        iu0 iu0Var = xu0Var.S;
        if (iu0Var != null) {
            iu0Var.E(null, null);
        }
        xu0Var.K0(false);
        aj0 aj0Var = xu0Var.f32719s0;
        if (aj0Var != null) {
            aj0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(pr.h).start();
        }
        if (xu0Var.f32736z0) {
            xu0Var.f32736z0 = false;
        } else {
            xu0Var.m1(false);
        }
    }

    @Override
    public final void n() {
        boolean z10;
        xu0 xu0Var = this.f31975f;
        xu0Var.V0 = true;
        ks0 ks0Var = xu0Var.J0;
        if (ks0Var != null) {
            if ((xu0Var.getSelectedTab() == 11 || xu0Var.getSelectedTab() == 12) && ks0Var.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ks0Var.g(z10);
        }
        ImageView imageView = xu0Var.f32716r0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.v0 v0Var = xu0Var.m0;
        if (v0Var != null) {
            v0Var.setVisibility(8);
        }
        xu0Var.f32707n0.setVisibility(8);
        xu0Var.K0(true);
        aj0 aj0Var = xu0Var.f32719s0;
        if (aj0Var != null) {
            aj0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(pr.h).start();
        }
    }

    @Override
    public final void p(di.h2 h2Var) {
        dt0 dt0Var = this.f31975f.T;
        if (dt0Var != null) {
            dt0Var.f36437a.m9();
        }
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        iu0 iu0Var;
        String obj = editText.getText().toString();
        xu0 xu0Var = this.f31975f;
        dt0 dt0Var = xu0Var.T;
        if (dt0Var != null) {
            org.telegram.ui.eo eoVar = dt0Var.f36437a;
            org.telegram.ui.ActionBar.v0 v0Var = eoVar.f35298j0;
            if (v0Var != null) {
                eoVar.f35425t3 = obj;
                v0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && xu0Var.W0 == null) {
                org.telegram.ui.eo eoVar2 = dt0Var.f36437a;
                org.telegram.ui.un unVar = eoVar2.f35369oc;
                if (unVar != null) {
                    unVar.m();
                }
                eoVar2.f35412s3 = false;
                eoVar2.f35358o0 = false;
                eoVar2.hc(false);
                eoVar2.Ic();
            }
        }
        xu0Var.f32707n0.setVisibility(8);
        if (obj.length() == 0 && xu0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        xu0Var.U0 = z10;
        xu0Var.post(new jq0(this, 2));
        int i10 = xu0Var.f32702k0[0].F;
        if (i10 == 1) {
            tt0 tt0Var = xu0Var.f32694g0;
            if (tt0Var != null) {
                tt0Var.G(obj, true);
            }
        } else if (i10 == 3) {
            tt0 tt0Var2 = xu0Var.f32698i0;
            if (tt0Var2 != null) {
                tt0Var2.G(obj, true);
            }
        } else if (i10 == 4) {
            tt0 tt0Var3 = xu0Var.f32696h0;
            if (tt0Var3 != null) {
                tt0Var3.G(obj, true);
            }
        } else if (i10 == 7) {
            ot0 ot0Var = xu0Var.f32700j0;
            if (ot0Var != null) {
                ot0Var.F(obj, true);
            }
        } else if (i10 == 11 && (iu0Var = xu0Var.S) != null) {
            iu0Var.E(xu0Var.W0, obj);
        }
    }
}
