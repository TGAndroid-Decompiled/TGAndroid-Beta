package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public final class au0 extends org.telegram.ui.ActionBar.e5 {
    public final cw0 f24678f;

    public au0(cw0 cw0Var) {
        this.f24678f = cw0Var;
    }

    @Override
    public final void l() {
        org.telegram.ui.ActionBar.u0 u0Var = this.f24678f.f25517n0;
        u0Var.setTranslationX(((View) u0Var.getParent()).getMeasuredWidth() - u0Var.getRight());
    }

    @Override
    public final void m() {
        cw0 cw0Var = this.f24678f;
        pt0 pt0Var = cw0Var.J0;
        ImageView imageView = cw0Var.f25526r0;
        cw0Var.V0 = false;
        cw0Var.W0 = null;
        org.telegram.ui.ActionBar.u0 u0Var = cw0Var.m0;
        if (u0Var != null) {
            u0Var.setVisibility(0);
        }
        if (imageView != null && cw0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (pt0Var != null) {
            pt0Var.d.M(new org.telegram.ui.ir(2));
            pt0Var.h = 0L;
            pt0Var.g(false);
        }
        iu0 iu0Var = cw0Var.T;
        if (iu0Var != null) {
            org.telegram.ui.ao aoVar = iu0Var.f36453a;
            org.telegram.ui.rn rnVar = aoVar.f44918oc;
            if (rnVar != null) {
                rnVar.m();
            }
            aoVar.f44961s3 = false;
            aoVar.f44907o0 = false;
            aoVar.lc(false);
            aoVar.Mc();
        }
        cw0Var.U0 = false;
        cw0Var.f25517n0.setVisibility(0);
        cw0Var.f25504g0.G(null, true);
        cw0Var.f25508i0.G(null, true);
        cw0Var.f25506h0.G(null, true);
        cw0Var.f25510j0.F(null, true);
        nv0 nv0Var = cw0Var.S;
        if (nv0Var != null) {
            nv0Var.E(null, null);
        }
        cw0Var.K0(false);
        gk0 gk0Var = cw0Var.f25529s0;
        if (gk0Var != null) {
            gk0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(is.h).start();
        }
        if (cw0Var.f25546z0) {
            cw0Var.f25546z0 = false;
        } else {
            cw0Var.m1(false);
        }
    }

    @Override
    public final void n() {
        boolean z10;
        cw0 cw0Var = this.f24678f;
        cw0Var.V0 = true;
        pt0 pt0Var = cw0Var.J0;
        if (pt0Var != null) {
            if ((cw0Var.getSelectedTab() == 11 || cw0Var.getSelectedTab() == 12) && pt0Var.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            pt0Var.g(z10);
        }
        ImageView imageView = cw0Var.f25526r0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.u0 u0Var = cw0Var.m0;
        if (u0Var != null) {
            u0Var.setVisibility(8);
        }
        cw0Var.f25517n0.setVisibility(8);
        cw0Var.K0(true);
        gk0 gk0Var = cw0Var.f25529s0;
        if (gk0Var != null) {
            gk0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(is.h).start();
        }
    }

    @Override
    public final void p(ci.g2 g2Var) {
        iu0 iu0Var = this.f24678f.T;
        if (iu0Var != null) {
            iu0Var.f36453a.r9();
        }
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        nv0 nv0Var;
        String obj = editText.getText().toString();
        cw0 cw0Var = this.f24678f;
        iu0 iu0Var = cw0Var.T;
        if (iu0Var != null) {
            org.telegram.ui.ao aoVar = iu0Var.f36453a;
            org.telegram.ui.ActionBar.u0 u0Var = aoVar.f44847j0;
            if (u0Var != null) {
                aoVar.f44974t3 = obj;
                u0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && cw0Var.W0 == null) {
                org.telegram.ui.ao aoVar2 = iu0Var.f36453a;
                org.telegram.ui.rn rnVar = aoVar2.f44918oc;
                if (rnVar != null) {
                    rnVar.m();
                }
                aoVar2.f44961s3 = false;
                aoVar2.f44907o0 = false;
                aoVar2.lc(false);
                aoVar2.Mc();
            }
        }
        cw0Var.f25517n0.setVisibility(8);
        if (obj.length() == 0 && cw0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        cw0Var.U0 = z10;
        cw0Var.post(new pr0(this, 3));
        int i10 = cw0Var.f25512k0[0].F;
        if (i10 == 1) {
            yu0 yu0Var = cw0Var.f25504g0;
            if (yu0Var != null) {
                yu0Var.G(obj, true);
            }
        } else if (i10 == 3) {
            yu0 yu0Var2 = cw0Var.f25508i0;
            if (yu0Var2 != null) {
                yu0Var2.G(obj, true);
            }
        } else if (i10 == 4) {
            yu0 yu0Var3 = cw0Var.f25506h0;
            if (yu0Var3 != null) {
                yu0Var3.G(obj, true);
            }
        } else if (i10 == 7) {
            tu0 tu0Var = cw0Var.f25510j0;
            if (tu0Var != null) {
                tu0Var.F(obj, true);
            }
        } else if (i10 == 11 && (nv0Var = cw0Var.S) != null) {
            nv0Var.E(cw0Var.W0, obj);
        }
    }
}
