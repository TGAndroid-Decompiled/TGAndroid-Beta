package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public final class zt0 extends org.telegram.ui.ActionBar.g5 {
    public final bw0 f33648f;

    public zt0(bw0 bw0Var) {
        this.f33648f = bw0Var;
    }

    @Override
    public final void l() {
        org.telegram.ui.ActionBar.v0 v0Var = this.f33648f.f25147n0;
        v0Var.setTranslationX(((View) v0Var.getParent()).getMeasuredWidth() - v0Var.getRight());
    }

    @Override
    public final void m() {
        bw0 bw0Var = this.f33648f;
        ot0 ot0Var = bw0Var.J0;
        ImageView imageView = bw0Var.f25156r0;
        bw0Var.V0 = false;
        bw0Var.W0 = null;
        org.telegram.ui.ActionBar.v0 v0Var = bw0Var.m0;
        if (v0Var != null) {
            v0Var.setVisibility(0);
        }
        if (imageView != null && bw0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (ot0Var != null) {
            ot0Var.d.M(new org.telegram.ui.ir(2));
            ot0Var.h = 0L;
            ot0Var.g(false);
        }
        hu0 hu0Var = bw0Var.T;
        if (hu0Var != null) {
            org.telegram.ui.ao aoVar = hu0Var.f36357a;
            org.telegram.ui.rn rnVar = aoVar.f44883oc;
            if (rnVar != null) {
                rnVar.m();
            }
            aoVar.f44926s3 = false;
            aoVar.f44872o0 = false;
            aoVar.lc(false);
            aoVar.Mc();
        }
        bw0Var.U0 = false;
        bw0Var.f25147n0.setVisibility(0);
        bw0Var.f25134g0.G(null, true);
        bw0Var.f25138i0.G(null, true);
        bw0Var.f25136h0.G(null, true);
        bw0Var.f25140j0.F(null, true);
        mv0 mv0Var = bw0Var.S;
        if (mv0Var != null) {
            mv0Var.E(null, null);
        }
        bw0Var.K0(false);
        fk0 fk0Var = bw0Var.f25159s0;
        if (fk0Var != null) {
            fk0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(hs.h).start();
        }
        if (bw0Var.f25176z0) {
            bw0Var.f25176z0 = false;
        } else {
            bw0Var.m1(false);
        }
    }

    @Override
    public final void n() {
        boolean z10;
        bw0 bw0Var = this.f33648f;
        bw0Var.V0 = true;
        ot0 ot0Var = bw0Var.J0;
        if (ot0Var != null) {
            if ((bw0Var.getSelectedTab() == 11 || bw0Var.getSelectedTab() == 12) && ot0Var.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ot0Var.g(z10);
        }
        ImageView imageView = bw0Var.f25156r0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.v0 v0Var = bw0Var.m0;
        if (v0Var != null) {
            v0Var.setVisibility(8);
        }
        bw0Var.f25147n0.setVisibility(8);
        bw0Var.K0(true);
        fk0 fk0Var = bw0Var.f25159s0;
        if (fk0Var != null) {
            fk0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(hs.h).start();
        }
    }

    @Override
    public final void p(ci.g2 g2Var) {
        hu0 hu0Var = this.f33648f.T;
        if (hu0Var != null) {
            hu0Var.f36357a.r9();
        }
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        mv0 mv0Var;
        String obj = editText.getText().toString();
        bw0 bw0Var = this.f33648f;
        hu0 hu0Var = bw0Var.T;
        if (hu0Var != null) {
            org.telegram.ui.ao aoVar = hu0Var.f36357a;
            org.telegram.ui.ActionBar.v0 v0Var = aoVar.f44812j0;
            if (v0Var != null) {
                aoVar.f44939t3 = obj;
                v0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && bw0Var.W0 == null) {
                org.telegram.ui.ao aoVar2 = hu0Var.f36357a;
                org.telegram.ui.rn rnVar = aoVar2.f44883oc;
                if (rnVar != null) {
                    rnVar.m();
                }
                aoVar2.f44926s3 = false;
                aoVar2.f44872o0 = false;
                aoVar2.lc(false);
                aoVar2.Mc();
            }
        }
        bw0Var.f25147n0.setVisibility(8);
        if (obj.length() == 0 && bw0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        bw0Var.U0 = z10;
        bw0Var.post(new or0(this, 2));
        int i10 = bw0Var.f25142k0[0].F;
        if (i10 == 1) {
            xu0 xu0Var = bw0Var.f25134g0;
            if (xu0Var != null) {
                xu0Var.G(obj, true);
            }
        } else if (i10 == 3) {
            xu0 xu0Var2 = bw0Var.f25138i0;
            if (xu0Var2 != null) {
                xu0Var2.G(obj, true);
            }
        } else if (i10 == 4) {
            xu0 xu0Var3 = bw0Var.f25136h0;
            if (xu0Var3 != null) {
                xu0Var3.G(obj, true);
            }
        } else if (i10 == 7) {
            su0 su0Var = bw0Var.f25140j0;
            if (su0Var != null) {
                su0Var.F(obj, true);
            }
        } else if (i10 == 11 && (mv0Var = bw0Var.S) != null) {
            mv0Var.E(bw0Var.W0, obj);
        }
    }
}
