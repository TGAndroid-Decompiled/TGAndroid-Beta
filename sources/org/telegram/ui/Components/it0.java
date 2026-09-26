package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public final class it0 extends org.telegram.ui.ActionBar.e5 {
    public final kv0 f25188f;

    public it0(kv0 kv0Var) {
        this.f25188f = kv0Var;
    }

    @Override
    public final void l() {
        org.telegram.ui.ActionBar.u0 u0Var = this.f25188f.f25847n0;
        u0Var.setTranslationX(((View) u0Var.getParent()).getMeasuredWidth() - u0Var.getRight());
    }

    @Override
    public final void m() {
        kv0 kv0Var = this.f25188f;
        xs0 xs0Var = kv0Var.J0;
        ImageView imageView = kv0Var.f25856r0;
        kv0Var.V0 = false;
        kv0Var.W0 = null;
        org.telegram.ui.ActionBar.u0 u0Var = kv0Var.m0;
        if (u0Var != null) {
            u0Var.setVisibility(0);
        }
        if (imageView != null && kv0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (xs0Var != null) {
            xs0Var.d.M(new org.telegram.ui.fr(2));
            xs0Var.h = 0L;
            xs0Var.g(false);
        }
        qt0 qt0Var = kv0Var.T;
        if (qt0Var != null) {
            org.telegram.ui.xn xnVar = qt0Var.f40192a;
            org.telegram.ui.on onVar = xnVar.nc;
            if (onVar != null) {
                onVar.m();
            }
            xnVar.f39633s3 = false;
            xnVar.f39579o0 = false;
            xnVar.hc(false);
            xnVar.Ic();
        }
        kv0Var.U0 = false;
        kv0Var.f25847n0.setVisibility(0);
        kv0Var.f25834g0.G(null, true);
        kv0Var.f25838i0.G(null, true);
        kv0Var.f25836h0.G(null, true);
        kv0Var.f25840j0.F(null, true);
        vu0 vu0Var = kv0Var.S;
        if (vu0Var != null) {
            vu0Var.E(null, null);
        }
        kv0Var.K0(false);
        mj0 mj0Var = kv0Var.f25859s0;
        if (mj0Var != null) {
            mj0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(sr.h).start();
        }
        if (kv0Var.f25876z0) {
            kv0Var.f25876z0 = false;
        } else {
            kv0Var.m1(false);
        }
    }

    @Override
    public final void n() {
        boolean z10;
        kv0 kv0Var = this.f25188f;
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
        ImageView imageView = kv0Var.f25856r0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.u0 u0Var = kv0Var.m0;
        if (u0Var != null) {
            u0Var.setVisibility(8);
        }
        kv0Var.f25847n0.setVisibility(8);
        kv0Var.K0(true);
        mj0 mj0Var = kv0Var.f25859s0;
        if (mj0Var != null) {
            mj0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(sr.h).start();
        }
    }

    @Override
    public final void p(ci.h2 h2Var) {
        qt0 qt0Var = this.f25188f.T;
        if (qt0Var != null) {
            qt0Var.f40192a.m9();
        }
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        vu0 vu0Var;
        String obj = editText.getText().toString();
        kv0 kv0Var = this.f25188f;
        qt0 qt0Var = kv0Var.T;
        if (qt0Var != null) {
            org.telegram.ui.xn xnVar = qt0Var.f40192a;
            org.telegram.ui.ActionBar.u0 u0Var = xnVar.f39519j0;
            if (u0Var != null) {
                xnVar.f39646t3 = obj;
                u0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && kv0Var.W0 == null) {
                org.telegram.ui.xn xnVar2 = qt0Var.f40192a;
                org.telegram.ui.on onVar = xnVar2.nc;
                if (onVar != null) {
                    onVar.m();
                }
                xnVar2.f39633s3 = false;
                xnVar2.f39579o0 = false;
                xnVar2.hc(false);
                xnVar2.Ic();
            }
        }
        kv0Var.f25847n0.setVisibility(8);
        if (obj.length() == 0 && kv0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        kv0Var.U0 = z10;
        kv0Var.post(new xq0(this, 3));
        int i10 = kv0Var.f25842k0[0].F;
        if (i10 == 1) {
            gu0 gu0Var = kv0Var.f25834g0;
            if (gu0Var != null) {
                gu0Var.G(obj, true);
            }
        } else if (i10 == 3) {
            gu0 gu0Var2 = kv0Var.f25838i0;
            if (gu0Var2 != null) {
                gu0Var2.G(obj, true);
            }
        } else if (i10 == 4) {
            gu0 gu0Var3 = kv0Var.f25836h0;
            if (gu0Var3 != null) {
                gu0Var3.G(obj, true);
            }
        } else if (i10 == 7) {
            bu0 bu0Var = kv0Var.f25840j0;
            if (bu0Var != null) {
                bu0Var.F(obj, true);
            }
        } else if (i10 == 11 && (vu0Var = kv0Var.S) != null) {
            vu0Var.E(kv0Var.W0, obj);
        }
    }
}
