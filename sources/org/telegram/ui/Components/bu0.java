package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public final class bu0 extends org.telegram.ui.ActionBar.e5 {
    public final dw0 f25025f;

    public bu0(dw0 dw0Var) {
        this.f25025f = dw0Var;
    }

    @Override
    public final void l() {
        org.telegram.ui.ActionBar.u0 u0Var = this.f25025f.f25716n0;
        u0Var.setTranslationX(((View) u0Var.getParent()).getMeasuredWidth() - u0Var.getRight());
    }

    @Override
    public final void m() {
        dw0 dw0Var = this.f25025f;
        qt0 qt0Var = dw0Var.J0;
        ImageView imageView = dw0Var.f25725r0;
        dw0Var.V0 = false;
        dw0Var.W0 = null;
        org.telegram.ui.ActionBar.u0 u0Var = dw0Var.m0;
        if (u0Var != null) {
            u0Var.setVisibility(0);
        }
        if (imageView != null && dw0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (qt0Var != null) {
            qt0Var.d.M(new org.telegram.ui.ir(2));
            qt0Var.h = 0L;
            qt0Var.g(false);
        }
        ju0 ju0Var = dw0Var.T;
        if (ju0Var != null) {
            org.telegram.ui.ao aoVar = ju0Var.f36419a;
            org.telegram.ui.rn rnVar = aoVar.f44884oc;
            if (rnVar != null) {
                rnVar.m();
            }
            aoVar.f44927s3 = false;
            aoVar.f44873o0 = false;
            aoVar.lc(false);
            aoVar.Mc();
        }
        dw0Var.U0 = false;
        dw0Var.f25716n0.setVisibility(0);
        dw0Var.f25703g0.G(null, true);
        dw0Var.f25707i0.G(null, true);
        dw0Var.f25705h0.G(null, true);
        dw0Var.f25709j0.F(null, true);
        ov0 ov0Var = dw0Var.S;
        if (ov0Var != null) {
            ov0Var.E(null, null);
        }
        dw0Var.K0(false);
        hk0 hk0Var = dw0Var.f25728s0;
        if (hk0Var != null) {
            hk0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(is.h).start();
        }
        if (dw0Var.f25745z0) {
            dw0Var.f25745z0 = false;
        } else {
            dw0Var.m1(false);
        }
    }

    @Override
    public final void n() {
        boolean z10;
        dw0 dw0Var = this.f25025f;
        dw0Var.V0 = true;
        qt0 qt0Var = dw0Var.J0;
        if (qt0Var != null) {
            if ((dw0Var.getSelectedTab() == 11 || dw0Var.getSelectedTab() == 12) && qt0Var.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            qt0Var.g(z10);
        }
        ImageView imageView = dw0Var.f25725r0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.u0 u0Var = dw0Var.m0;
        if (u0Var != null) {
            u0Var.setVisibility(8);
        }
        dw0Var.f25716n0.setVisibility(8);
        dw0Var.K0(true);
        hk0 hk0Var = dw0Var.f25728s0;
        if (hk0Var != null) {
            hk0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(is.h).start();
        }
    }

    @Override
    public final void p(ci.g2 g2Var) {
        ju0 ju0Var = this.f25025f.T;
        if (ju0Var != null) {
            ju0Var.f36419a.r9();
        }
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        ov0 ov0Var;
        String obj = editText.getText().toString();
        dw0 dw0Var = this.f25025f;
        ju0 ju0Var = dw0Var.T;
        if (ju0Var != null) {
            org.telegram.ui.ao aoVar = ju0Var.f36419a;
            org.telegram.ui.ActionBar.u0 u0Var = aoVar.f44813j0;
            if (u0Var != null) {
                aoVar.f44940t3 = obj;
                u0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && dw0Var.W0 == null) {
                org.telegram.ui.ao aoVar2 = ju0Var.f36419a;
                org.telegram.ui.rn rnVar = aoVar2.f44884oc;
                if (rnVar != null) {
                    rnVar.m();
                }
                aoVar2.f44927s3 = false;
                aoVar2.f44873o0 = false;
                aoVar2.lc(false);
                aoVar2.Mc();
            }
        }
        dw0Var.f25716n0.setVisibility(8);
        if (obj.length() == 0 && dw0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        dw0Var.U0 = z10;
        dw0Var.post(new qr0(this, 2));
        int i10 = dw0Var.f25711k0[0].F;
        if (i10 == 1) {
            zu0 zu0Var = dw0Var.f25703g0;
            if (zu0Var != null) {
                zu0Var.G(obj, true);
            }
        } else if (i10 == 3) {
            zu0 zu0Var2 = dw0Var.f25707i0;
            if (zu0Var2 != null) {
                zu0Var2.G(obj, true);
            }
        } else if (i10 == 4) {
            zu0 zu0Var3 = dw0Var.f25705h0;
            if (zu0Var3 != null) {
                zu0Var3.G(obj, true);
            }
        } else if (i10 == 7) {
            uu0 uu0Var = dw0Var.f25709j0;
            if (uu0Var != null) {
                uu0Var.F(obj, true);
            }
        } else if (i10 == 11 && (ov0Var = dw0Var.S) != null) {
            ov0Var.E(dw0Var.W0, obj);
        }
    }
}
