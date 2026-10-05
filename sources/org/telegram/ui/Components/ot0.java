package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public final class ot0 extends org.telegram.ui.ActionBar.f5 {
    public final qv0 f29547f;

    public ot0(qv0 qv0Var) {
        this.f29547f = qv0Var;
    }

    @Override
    public final void l() {
        org.telegram.ui.ActionBar.v0 v0Var = this.f29547f.f30244n0;
        v0Var.setTranslationX(((View) v0Var.getParent()).getMeasuredWidth() - v0Var.getRight());
    }

    @Override
    public final void m() {
        qv0 qv0Var = this.f29547f;
        dt0 dt0Var = qv0Var.J0;
        ImageView imageView = qv0Var.f30253r0;
        qv0Var.V0 = false;
        qv0Var.W0 = null;
        org.telegram.ui.ActionBar.v0 v0Var = qv0Var.m0;
        if (v0Var != null) {
            v0Var.setVisibility(0);
        }
        if (imageView != null && qv0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (dt0Var != null) {
            dt0Var.d.M(new org.telegram.ui.hr(2));
            dt0Var.h = 0L;
            dt0Var.g(false);
        }
        wt0 wt0Var = qv0Var.T;
        if (wt0Var != null) {
            org.telegram.ui.zn znVar = wt0Var.f34922a;
            org.telegram.ui.qn qnVar = znVar.f43412lc;
            if (qnVar != null) {
                qnVar.m();
            }
            znVar.f43464q3 = false;
            znVar.m0 = false;
            znVar.gc(false);
            znVar.Hc();
        }
        qv0Var.U0 = false;
        qv0Var.f30244n0.setVisibility(0);
        qv0Var.f30231g0.G(null, true);
        qv0Var.f30235i0.G(null, true);
        qv0Var.f30233h0.G(null, true);
        qv0Var.f30237j0.F(null, true);
        bv0 bv0Var = qv0Var.S;
        if (bv0Var != null) {
            bv0Var.E(null, null);
        }
        qv0Var.K0(false);
        nj0 nj0Var = qv0Var.f30256s0;
        if (nj0Var != null) {
            nj0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(tr.h).start();
        }
        if (qv0Var.f30273z0) {
            qv0Var.f30273z0 = false;
        } else {
            qv0Var.m1(false);
        }
    }

    @Override
    public final void n() {
        boolean z10;
        qv0 qv0Var = this.f29547f;
        qv0Var.V0 = true;
        dt0 dt0Var = qv0Var.J0;
        if (dt0Var != null) {
            if ((qv0Var.getSelectedTab() == 11 || qv0Var.getSelectedTab() == 12) && dt0Var.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            dt0Var.g(z10);
        }
        ImageView imageView = qv0Var.f30253r0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.v0 v0Var = qv0Var.m0;
        if (v0Var != null) {
            v0Var.setVisibility(8);
        }
        qv0Var.f30244n0.setVisibility(8);
        qv0Var.K0(true);
        nj0 nj0Var = qv0Var.f30256s0;
        if (nj0Var != null) {
            nj0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(tr.h).start();
        }
    }

    @Override
    public final void p(ci.h2 h2Var) {
        wt0 wt0Var = this.f29547f.T;
        if (wt0Var != null) {
            wt0Var.f34922a.n9();
        }
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        bv0 bv0Var;
        String obj = editText.getText().toString();
        qv0 qv0Var = this.f29547f;
        wt0 wt0Var = qv0Var.T;
        if (wt0Var != null) {
            org.telegram.ui.zn znVar = wt0Var.f34922a;
            org.telegram.ui.ActionBar.v0 v0Var = znVar.f43352h0;
            if (v0Var != null) {
                znVar.f43477r3 = obj;
                v0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && qv0Var.W0 == null) {
                org.telegram.ui.zn znVar2 = wt0Var.f34922a;
                org.telegram.ui.qn qnVar = znVar2.f43412lc;
                if (qnVar != null) {
                    qnVar.m();
                }
                znVar2.f43464q3 = false;
                znVar2.m0 = false;
                znVar2.gc(false);
                znVar2.Hc();
            }
        }
        qv0Var.f30244n0.setVisibility(8);
        if (obj.length() == 0 && qv0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        qv0Var.U0 = z10;
        qv0Var.post(new gq0(this, 4));
        int i10 = qv0Var.f30239k0[0].F;
        if (i10 == 1) {
            mu0 mu0Var = qv0Var.f30231g0;
            if (mu0Var != null) {
                mu0Var.G(obj, true);
            }
        } else if (i10 == 3) {
            mu0 mu0Var2 = qv0Var.f30235i0;
            if (mu0Var2 != null) {
                mu0Var2.G(obj, true);
            }
        } else if (i10 == 4) {
            mu0 mu0Var3 = qv0Var.f30233h0;
            if (mu0Var3 != null) {
                mu0Var3.G(obj, true);
            }
        } else if (i10 == 7) {
            hu0 hu0Var = qv0Var.f30237j0;
            if (hu0Var != null) {
                hu0Var.F(obj, true);
            }
        } else if (i10 == 11 && (bv0Var = qv0Var.S) != null) {
            bv0Var.E(qv0Var.W0, obj);
        }
    }
}
