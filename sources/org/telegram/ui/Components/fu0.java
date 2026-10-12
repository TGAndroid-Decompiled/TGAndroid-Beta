package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public final class fu0 extends org.telegram.ui.ActionBar.e5 {
    public final hw0 f26175f;

    public fu0(hw0 hw0Var) {
        this.f26175f = hw0Var;
    }

    @Override
    public final void l() {
        org.telegram.ui.ActionBar.u0 u0Var = this.f26175f.f26953n0;
        u0Var.setTranslationX(((View) u0Var.getParent()).getMeasuredWidth() - u0Var.getRight());
    }

    @Override
    public final void m() {
        hw0 hw0Var = this.f26175f;
        ut0 ut0Var = hw0Var.J0;
        ImageView imageView = hw0Var.f26962r0;
        hw0Var.V0 = false;
        hw0Var.W0 = null;
        org.telegram.ui.ActionBar.u0 u0Var = hw0Var.m0;
        if (u0Var != null) {
            u0Var.setVisibility(0);
        }
        if (imageView != null && hw0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (ut0Var != null) {
            ut0Var.d.M(new org.telegram.ui.lr(2));
            ut0Var.h = 0L;
            ut0Var.g(false);
        }
        nu0 nu0Var = hw0Var.T;
        if (nu0Var != null) {
            org.telegram.ui.fo foVar = nu0Var.f38105a;
            org.telegram.ui.vn vnVar = foVar.f37373oc;
            if (vnVar != null) {
                vnVar.m();
            }
            foVar.f37416s3 = false;
            foVar.f37362o0 = false;
            foVar.lc(false);
            foVar.Mc();
        }
        hw0Var.U0 = false;
        hw0Var.f26953n0.setVisibility(0);
        hw0Var.f26940g0.G(null, true);
        hw0Var.f26944i0.G(null, true);
        hw0Var.f26942h0.G(null, true);
        hw0Var.f26946j0.F(null, true);
        sv0 sv0Var = hw0Var.S;
        if (sv0Var != null) {
            sv0Var.E(null, null);
        }
        hw0Var.K0(false);
        ik0 ik0Var = hw0Var.f26965s0;
        if (ik0Var != null) {
            ik0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(js.h).start();
        }
        if (hw0Var.f26982z0) {
            hw0Var.f26982z0 = false;
        } else {
            hw0Var.m1(false);
        }
    }

    @Override
    public final void n() {
        boolean z10;
        hw0 hw0Var = this.f26175f;
        hw0Var.V0 = true;
        ut0 ut0Var = hw0Var.J0;
        if (ut0Var != null) {
            if ((hw0Var.getSelectedTab() == 11 || hw0Var.getSelectedTab() == 12) && ut0Var.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ut0Var.g(z10);
        }
        ImageView imageView = hw0Var.f26962r0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.u0 u0Var = hw0Var.m0;
        if (u0Var != null) {
            u0Var.setVisibility(8);
        }
        hw0Var.f26953n0.setVisibility(8);
        hw0Var.K0(true);
        ik0 ik0Var = hw0Var.f26965s0;
        if (ik0Var != null) {
            ik0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(js.h).start();
        }
    }

    @Override
    public final void p(ci.g2 g2Var) {
        nu0 nu0Var = this.f26175f.T;
        if (nu0Var != null) {
            nu0Var.f38105a.r9();
        }
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        sv0 sv0Var;
        String obj = editText.getText().toString();
        hw0 hw0Var = this.f26175f;
        nu0 nu0Var = hw0Var.T;
        if (nu0Var != null) {
            org.telegram.ui.fo foVar = nu0Var.f38105a;
            org.telegram.ui.ActionBar.u0 u0Var = foVar.f37302j0;
            if (u0Var != null) {
                foVar.f37429t3 = obj;
                u0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && hw0Var.W0 == null) {
                org.telegram.ui.fo foVar2 = nu0Var.f38105a;
                org.telegram.ui.vn vnVar = foVar2.f37373oc;
                if (vnVar != null) {
                    vnVar.m();
                }
                foVar2.f37416s3 = false;
                foVar2.f37362o0 = false;
                foVar2.lc(false);
                foVar2.Mc();
            }
        }
        hw0Var.f26953n0.setVisibility(8);
        if (obj.length() == 0 && hw0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        hw0Var.U0 = z10;
        hw0Var.post(new ur0(this, 3));
        int i10 = hw0Var.f26948k0[0].F;
        if (i10 == 1) {
            dv0 dv0Var = hw0Var.f26940g0;
            if (dv0Var != null) {
                dv0Var.G(obj, true);
            }
        } else if (i10 == 3) {
            dv0 dv0Var2 = hw0Var.f26944i0;
            if (dv0Var2 != null) {
                dv0Var2.G(obj, true);
            }
        } else if (i10 == 4) {
            dv0 dv0Var3 = hw0Var.f26942h0;
            if (dv0Var3 != null) {
                dv0Var3.G(obj, true);
            }
        } else if (i10 == 7) {
            yu0 yu0Var = hw0Var.f26946j0;
            if (yu0Var != null) {
                yu0Var.F(obj, true);
            }
        } else if (i10 == 11 && (sv0Var = hw0Var.S) != null) {
            sv0Var.E(hw0Var.W0, obj);
        }
    }
}
