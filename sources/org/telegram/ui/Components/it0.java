package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public final class it0 extends org.telegram.ui.ActionBar.g5 {
    public final kv0 f25042f;

    public it0(kv0 kv0Var) {
        this.f25042f = kv0Var;
    }

    @Override
    public final void l() {
        org.telegram.ui.ActionBar.v0 v0Var = this.f25042f.f25829n0;
        v0Var.setTranslationX(((View) v0Var.getParent()).getMeasuredWidth() - v0Var.getRight());
    }

    @Override
    public final void m() {
        kv0 kv0Var = this.f25042f;
        xs0 xs0Var = kv0Var.J0;
        ImageView imageView = kv0Var.f25838r0;
        kv0Var.V0 = false;
        kv0Var.W0 = null;
        org.telegram.ui.ActionBar.v0 v0Var = kv0Var.m0;
        if (v0Var != null) {
            v0Var.setVisibility(0);
        }
        if (imageView != null && kv0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (xs0Var != null) {
            xs0Var.d.N(new org.telegram.ui.ir(2));
            xs0Var.h = 0L;
            xs0Var.g(false);
        }
        qt0 qt0Var = kv0Var.T;
        if (qt0Var != null) {
            org.telegram.ui.ao aoVar = qt0Var.f32418a;
            org.telegram.ui.rn rnVar = aoVar.nc;
            if (rnVar != null) {
                rnVar.m();
            }
            aoVar.f40427s3 = false;
            aoVar.f40373o0 = false;
            aoVar.hc(false);
            aoVar.Ic();
        }
        kv0Var.U0 = false;
        kv0Var.f25829n0.setVisibility(0);
        kv0Var.f25816g0.G(null, true);
        kv0Var.f25820i0.G(null, true);
        kv0Var.f25818h0.G(null, true);
        kv0Var.f25822j0.F(null, true);
        vu0 vu0Var = kv0Var.S;
        if (vu0Var != null) {
            vu0Var.E(null, null);
        }
        kv0Var.K0(false);
        lj0 lj0Var = kv0Var.f25841s0;
        if (lj0Var != null) {
            lj0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(qr.h).start();
        }
        if (kv0Var.f25858z0) {
            kv0Var.f25858z0 = false;
        } else {
            kv0Var.m1(false);
        }
    }

    @Override
    public final void n() {
        boolean z10;
        kv0 kv0Var = this.f25042f;
        kv0Var.V0 = true;
        xs0 xs0Var = kv0Var.J0;
        if (xs0Var != null) {
            if ((kv0Var.getSelectedTab() == 11 || kv0Var.getSelectedTab() == 12) && xs0Var.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            xs0Var.g(z10);
        }
        ImageView imageView = kv0Var.f25838r0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.v0 v0Var = kv0Var.m0;
        if (v0Var != null) {
            v0Var.setVisibility(8);
        }
        kv0Var.f25829n0.setVisibility(8);
        kv0Var.K0(true);
        lj0 lj0Var = kv0Var.f25841s0;
        if (lj0Var != null) {
            lj0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(qr.h).start();
        }
    }

    @Override
    public final void p(ci.h2 h2Var) {
        qt0 qt0Var = this.f25042f.T;
        if (qt0Var != null) {
            qt0Var.f32418a.m9();
        }
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        vu0 vu0Var;
        String obj = editText.getText().toString();
        kv0 kv0Var = this.f25042f;
        qt0 qt0Var = kv0Var.T;
        if (qt0Var != null) {
            org.telegram.ui.ao aoVar = qt0Var.f32418a;
            org.telegram.ui.ActionBar.v0 v0Var = aoVar.f40313j0;
            if (v0Var != null) {
                aoVar.f40440t3 = obj;
                v0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && kv0Var.W0 == null) {
                org.telegram.ui.ao aoVar2 = qt0Var.f32418a;
                org.telegram.ui.rn rnVar = aoVar2.nc;
                if (rnVar != null) {
                    rnVar.m();
                }
                aoVar2.f40427s3 = false;
                aoVar2.f40373o0 = false;
                aoVar2.hc(false);
                aoVar2.Ic();
            }
        }
        kv0Var.f25829n0.setVisibility(8);
        if (obj.length() == 0 && kv0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        kv0Var.U0 = z10;
        kv0Var.post(new xq0(this, 2));
        int i10 = kv0Var.f25824k0[0].F;
        if (i10 == 1) {
            gu0 gu0Var = kv0Var.f25816g0;
            if (gu0Var != null) {
                gu0Var.G(obj, true);
            }
        } else if (i10 == 3) {
            gu0 gu0Var2 = kv0Var.f25820i0;
            if (gu0Var2 != null) {
                gu0Var2.G(obj, true);
            }
        } else if (i10 == 4) {
            gu0 gu0Var3 = kv0Var.f25818h0;
            if (gu0Var3 != null) {
                gu0Var3.G(obj, true);
            }
        } else if (i10 == 7) {
            bu0 bu0Var = kv0Var.f25822j0;
            if (bu0Var != null) {
                bu0Var.F(obj, true);
            }
        } else if (i10 == 11 && (vu0Var = kv0Var.S) != null) {
            vu0Var.E(kv0Var.W0, obj);
        }
    }
}
