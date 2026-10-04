package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public final class nt0 extends org.telegram.ui.ActionBar.f5 {
    public final pv0 f29062f;

    public nt0(pv0 pv0Var) {
        this.f29062f = pv0Var;
    }

    @Override
    public final void l() {
        org.telegram.ui.ActionBar.v0 v0Var = this.f29062f.f29781n0;
        v0Var.setTranslationX(((View) v0Var.getParent()).getMeasuredWidth() - v0Var.getRight());
    }

    @Override
    public final void m() {
        pv0 pv0Var = this.f29062f;
        ct0 ct0Var = pv0Var.J0;
        ImageView imageView = pv0Var.f29790r0;
        pv0Var.V0 = false;
        pv0Var.W0 = null;
        org.telegram.ui.ActionBar.v0 v0Var = pv0Var.m0;
        if (v0Var != null) {
            v0Var.setVisibility(0);
        }
        if (imageView != null && pv0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (ct0Var != null) {
            ct0Var.d.M(new org.telegram.ui.hr(2));
            ct0Var.h = 0L;
            ct0Var.g(false);
        }
        vt0 vt0Var = pv0Var.T;
        if (vt0Var != null) {
            org.telegram.ui.zn znVar = vt0Var.f34865a;
            org.telegram.ui.qn qnVar = znVar.f43411lc;
            if (qnVar != null) {
                qnVar.m();
            }
            znVar.f43463q3 = false;
            znVar.m0 = false;
            znVar.gc(false);
            znVar.Hc();
        }
        pv0Var.U0 = false;
        pv0Var.f29781n0.setVisibility(0);
        pv0Var.f29768g0.G(null, true);
        pv0Var.f29772i0.G(null, true);
        pv0Var.f29770h0.G(null, true);
        pv0Var.f29774j0.F(null, true);
        av0 av0Var = pv0Var.S;
        if (av0Var != null) {
            av0Var.E(null, null);
        }
        pv0Var.K0(false);
        nj0 nj0Var = pv0Var.f29793s0;
        if (nj0Var != null) {
            nj0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(tr.h).start();
        }
        if (pv0Var.f29810z0) {
            pv0Var.f29810z0 = false;
        } else {
            pv0Var.m1(false);
        }
    }

    @Override
    public final void n() {
        boolean z10;
        pv0 pv0Var = this.f29062f;
        pv0Var.V0 = true;
        ct0 ct0Var = pv0Var.J0;
        if (ct0Var != null) {
            if ((pv0Var.getSelectedTab() == 11 || pv0Var.getSelectedTab() == 12) && ct0Var.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ct0Var.g(z10);
        }
        ImageView imageView = pv0Var.f29790r0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.v0 v0Var = pv0Var.m0;
        if (v0Var != null) {
            v0Var.setVisibility(8);
        }
        pv0Var.f29781n0.setVisibility(8);
        pv0Var.K0(true);
        nj0 nj0Var = pv0Var.f29793s0;
        if (nj0Var != null) {
            nj0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(tr.h).start();
        }
    }

    @Override
    public final void p(ci.h2 h2Var) {
        vt0 vt0Var = this.f29062f.T;
        if (vt0Var != null) {
            vt0Var.f34865a.n9();
        }
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        av0 av0Var;
        String obj = editText.getText().toString();
        pv0 pv0Var = this.f29062f;
        vt0 vt0Var = pv0Var.T;
        if (vt0Var != null) {
            org.telegram.ui.zn znVar = vt0Var.f34865a;
            org.telegram.ui.ActionBar.v0 v0Var = znVar.f43351h0;
            if (v0Var != null) {
                znVar.f43476r3 = obj;
                v0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && pv0Var.W0 == null) {
                org.telegram.ui.zn znVar2 = vt0Var.f34865a;
                org.telegram.ui.qn qnVar = znVar2.f43411lc;
                if (qnVar != null) {
                    qnVar.m();
                }
                znVar2.f43463q3 = false;
                znVar2.m0 = false;
                znVar2.gc(false);
                znVar2.Hc();
            }
        }
        pv0Var.f29781n0.setVisibility(8);
        if (obj.length() == 0 && pv0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        pv0Var.U0 = z10;
        pv0Var.post(new br0(this, 3));
        int i10 = pv0Var.f29776k0[0].F;
        if (i10 == 1) {
            lu0 lu0Var = pv0Var.f29768g0;
            if (lu0Var != null) {
                lu0Var.G(obj, true);
            }
        } else if (i10 == 3) {
            lu0 lu0Var2 = pv0Var.f29772i0;
            if (lu0Var2 != null) {
                lu0Var2.G(obj, true);
            }
        } else if (i10 == 4) {
            lu0 lu0Var3 = pv0Var.f29770h0;
            if (lu0Var3 != null) {
                lu0Var3.G(obj, true);
            }
        } else if (i10 == 7) {
            gu0 gu0Var = pv0Var.f29774j0;
            if (gu0Var != null) {
                gu0Var.F(obj, true);
            }
        } else if (i10 == 11 && (av0Var = pv0Var.S) != null) {
            av0Var.E(pv0Var.W0, obj);
        }
    }
}
