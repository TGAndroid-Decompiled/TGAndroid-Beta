package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public final class ht0 extends org.telegram.ui.ActionBar.g5 {
    public final jv0 f24758f;

    public ht0(jv0 jv0Var) {
        this.f24758f = jv0Var;
    }

    @Override
    public final void l() {
        org.telegram.ui.ActionBar.v0 v0Var = this.f24758f.f25509n0;
        v0Var.setTranslationX(((View) v0Var.getParent()).getMeasuredWidth() - v0Var.getRight());
    }

    @Override
    public final void m() {
        jv0 jv0Var = this.f24758f;
        ws0 ws0Var = jv0Var.J0;
        ImageView imageView = jv0Var.f25518r0;
        jv0Var.V0 = false;
        jv0Var.W0 = null;
        org.telegram.ui.ActionBar.v0 v0Var = jv0Var.m0;
        if (v0Var != null) {
            v0Var.setVisibility(0);
        }
        if (imageView != null && jv0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (ws0Var != null) {
            ws0Var.d.N(new org.telegram.ui.ir(2));
            ws0Var.h = 0L;
            ws0Var.g(false);
        }
        pt0 pt0Var = jv0Var.T;
        if (pt0Var != null) {
            org.telegram.ui.ao aoVar = pt0Var.f32501a;
            org.telegram.ui.rn rnVar = aoVar.nc;
            if (rnVar != null) {
                rnVar.m();
            }
            aoVar.f40469s3 = false;
            aoVar.f40415o0 = false;
            aoVar.hc(false);
            aoVar.Ic();
        }
        jv0Var.U0 = false;
        jv0Var.f25509n0.setVisibility(0);
        jv0Var.f25496g0.G(null, true);
        jv0Var.f25500i0.G(null, true);
        jv0Var.f25498h0.G(null, true);
        jv0Var.f25502j0.F(null, true);
        uu0 uu0Var = jv0Var.S;
        if (uu0Var != null) {
            uu0Var.E(null, null);
        }
        jv0Var.K0(false);
        kj0 kj0Var = jv0Var.f25521s0;
        if (kj0Var != null) {
            kj0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(qr.h).start();
        }
        if (jv0Var.f25538z0) {
            jv0Var.f25538z0 = false;
        } else {
            jv0Var.m1(false);
        }
    }

    @Override
    public final void n() {
        boolean z10;
        jv0 jv0Var = this.f24758f;
        jv0Var.V0 = true;
        ws0 ws0Var = jv0Var.J0;
        if (ws0Var != null) {
            if ((jv0Var.getSelectedTab() == 11 || jv0Var.getSelectedTab() == 12) && ws0Var.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ws0Var.g(z10);
        }
        ImageView imageView = jv0Var.f25518r0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.v0 v0Var = jv0Var.m0;
        if (v0Var != null) {
            v0Var.setVisibility(8);
        }
        jv0Var.f25509n0.setVisibility(8);
        jv0Var.K0(true);
        kj0 kj0Var = jv0Var.f25521s0;
        if (kj0Var != null) {
            kj0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(qr.h).start();
        }
    }

    @Override
    public final void p(ci.h2 h2Var) {
        pt0 pt0Var = this.f24758f.T;
        if (pt0Var != null) {
            pt0Var.f32501a.m9();
        }
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        uu0 uu0Var;
        String obj = editText.getText().toString();
        jv0 jv0Var = this.f24758f;
        pt0 pt0Var = jv0Var.T;
        if (pt0Var != null) {
            org.telegram.ui.ao aoVar = pt0Var.f32501a;
            org.telegram.ui.ActionBar.v0 v0Var = aoVar.f40355j0;
            if (v0Var != null) {
                aoVar.f40482t3 = obj;
                v0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && jv0Var.W0 == null) {
                org.telegram.ui.ao aoVar2 = pt0Var.f32501a;
                org.telegram.ui.rn rnVar = aoVar2.nc;
                if (rnVar != null) {
                    rnVar.m();
                }
                aoVar2.f40469s3 = false;
                aoVar2.f40415o0 = false;
                aoVar2.hc(false);
                aoVar2.Ic();
            }
        }
        jv0Var.f25509n0.setVisibility(8);
        if (obj.length() == 0 && jv0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        jv0Var.U0 = z10;
        jv0Var.post(new wq0(this, 2));
        int i10 = jv0Var.f25504k0[0].F;
        if (i10 == 1) {
            fu0 fu0Var = jv0Var.f25496g0;
            if (fu0Var != null) {
                fu0Var.G(obj, true);
            }
        } else if (i10 == 3) {
            fu0 fu0Var2 = jv0Var.f25500i0;
            if (fu0Var2 != null) {
                fu0Var2.G(obj, true);
            }
        } else if (i10 == 4) {
            fu0 fu0Var3 = jv0Var.f25498h0;
            if (fu0Var3 != null) {
                fu0Var3.G(obj, true);
            }
        } else if (i10 == 7) {
            au0 au0Var = jv0Var.f25502j0;
            if (au0Var != null) {
                au0Var.F(obj, true);
            }
        } else if (i10 == 11 && (uu0Var = jv0Var.S) != null) {
            uu0Var.E(jv0Var.W0, obj);
        }
    }
}
