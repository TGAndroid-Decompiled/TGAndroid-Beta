package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public final class xs0 extends org.telegram.ui.ActionBar.h5 {
    public final zu0 f29986f;

    public xs0(zu0 zu0Var) {
        this.f29986f = zu0Var;
    }

    @Override
    public final void l() {
        org.telegram.ui.ActionBar.w0 w0Var = this.f29986f.f30640n0;
        w0Var.setTranslationX(((View) w0Var.getParent()).getMeasuredWidth() - w0Var.getRight());
    }

    @Override
    public final void m() {
        zu0 zu0Var = this.f29986f;
        ms0 ms0Var = zu0Var.J0;
        ImageView imageView = zu0Var.f30649r0;
        zu0Var.V0 = false;
        zu0Var.W0 = null;
        org.telegram.ui.ActionBar.w0 w0Var = zu0Var.m0;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        if (imageView != null && zu0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (ms0Var != null) {
            ms0Var.d.N(new org.telegram.ui.kr(2));
            ms0Var.h = 0L;
            ms0Var.g(false);
        }
        ft0 ft0Var = zu0Var.T;
        if (ft0Var != null) {
            org.telegram.ui.co coVar = ft0Var.f33448a;
            org.telegram.ui.tn tnVar = coVar.nc;
            if (tnVar != null) {
                tnVar.m();
            }
            coVar.f32445s3 = false;
            coVar.f32391o0 = false;
            coVar.hc(false);
            coVar.Ic();
        }
        zu0Var.U0 = false;
        zu0Var.f30640n0.setVisibility(0);
        zu0Var.f30627g0.G(null, true);
        zu0Var.f30631i0.G(null, true);
        zu0Var.f30629h0.G(null, true);
        zu0Var.f30633j0.F(null, true);
        ku0 ku0Var = zu0Var.S;
        if (ku0Var != null) {
            ku0Var.E(null, null);
        }
        zu0Var.K0(false);
        bj0 bj0Var = zu0Var.f30652s0;
        if (bj0Var != null) {
            bj0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(qr.h).start();
        }
        if (zu0Var.f30669z0) {
            zu0Var.f30669z0 = false;
        } else {
            zu0Var.m1(false);
        }
    }

    @Override
    public final void n() {
        boolean z10;
        zu0 zu0Var = this.f29986f;
        zu0Var.V0 = true;
        ms0 ms0Var = zu0Var.J0;
        if (ms0Var != null) {
            if ((zu0Var.getSelectedTab() == 11 || zu0Var.getSelectedTab() == 12) && ms0Var.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ms0Var.g(z10);
        }
        ImageView imageView = zu0Var.f30649r0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.w0 w0Var = zu0Var.m0;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        zu0Var.f30640n0.setVisibility(8);
        zu0Var.K0(true);
        bj0 bj0Var = zu0Var.f30652s0;
        if (bj0Var != null) {
            bj0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(qr.h).start();
        }
    }

    @Override
    public final void p(ci.h2 h2Var) {
        ft0 ft0Var = this.f29986f.T;
        if (ft0Var != null) {
            ft0Var.f33448a.m9();
        }
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        ku0 ku0Var;
        String obj = editText.getText().toString();
        zu0 zu0Var = this.f29986f;
        ft0 ft0Var = zu0Var.T;
        if (ft0Var != null) {
            org.telegram.ui.co coVar = ft0Var.f33448a;
            org.telegram.ui.ActionBar.w0 w0Var = coVar.f32331j0;
            if (w0Var != null) {
                coVar.f32458t3 = obj;
                w0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && zu0Var.W0 == null) {
                org.telegram.ui.co coVar2 = ft0Var.f33448a;
                org.telegram.ui.tn tnVar = coVar2.nc;
                if (tnVar != null) {
                    tnVar.m();
                }
                coVar2.f32445s3 = false;
                coVar2.f32391o0 = false;
                coVar2.hc(false);
                coVar2.Ic();
            }
        }
        zu0Var.f30640n0.setVisibility(8);
        if (obj.length() == 0 && zu0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        zu0Var.U0 = z10;
        zu0Var.post(new kq0(this, 2));
        int i10 = zu0Var.f30635k0[0].F;
        if (i10 == 1) {
            vt0 vt0Var = zu0Var.f30627g0;
            if (vt0Var != null) {
                vt0Var.G(obj, true);
            }
        } else if (i10 == 3) {
            vt0 vt0Var2 = zu0Var.f30631i0;
            if (vt0Var2 != null) {
                vt0Var2.G(obj, true);
            }
        } else if (i10 == 4) {
            vt0 vt0Var3 = zu0Var.f30629h0;
            if (vt0Var3 != null) {
                vt0Var3.G(obj, true);
            }
        } else if (i10 == 7) {
            qt0 qt0Var = zu0Var.f30633j0;
            if (qt0Var != null) {
                qt0Var.F(obj, true);
            }
        } else if (i10 == 11 && (ku0Var = zu0Var.S) != null) {
            ku0Var.E(zu0Var.W0, obj);
        }
    }
}
