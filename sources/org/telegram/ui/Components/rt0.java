package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public final class rt0 extends org.telegram.ui.ActionBar.g5 {
    public final tv0 f30050r;

    public rt0(tv0 tv0Var) {
        this.f30050r = tv0Var;
    }

    @Override
    public final void l() {
        org.telegram.ui.ActionBar.u0 u0Var = this.f30050r.f30715n0;
        u0Var.setTranslationX(((View) u0Var.getParent()).getMeasuredWidth() - u0Var.getRight());
    }

    @Override
    public final void m() {
        tv0 tv0Var = this.f30050r;
        gt0 gt0Var = tv0Var.J0;
        ImageView imageView = tv0Var.f30724r0;
        tv0Var.V0 = false;
        tv0Var.W0 = null;
        org.telegram.ui.ActionBar.u0 u0Var = tv0Var.m0;
        if (u0Var != null) {
            u0Var.setVisibility(0);
        }
        if (imageView != null && tv0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (gt0Var != null) {
            gt0Var.d.M(new org.telegram.ui.xq(2));
            gt0Var.h = 0L;
            gt0Var.g(false);
        }
        zt0 zt0Var = tv0Var.T;
        if (zt0Var != null) {
            org.telegram.ui.rn rnVar = zt0Var.f41491a;
            org.telegram.ui.in inVar = rnVar.oc;
            if (inVar != null) {
                inVar.m();
            }
            rnVar.f40841s3 = false;
            rnVar.f40789o0 = false;
            rnVar.lc(false);
            rnVar.Mc();
        }
        tv0Var.U0 = false;
        tv0Var.f30715n0.setVisibility(0);
        tv0Var.f30702g0.G(null, true);
        tv0Var.f30706i0.G(null, true);
        tv0Var.f30704h0.G(null, true);
        tv0Var.f30708j0.F(null, true);
        ev0 ev0Var = tv0Var.S;
        if (ev0Var != null) {
            ev0Var.E(null, null);
        }
        tv0Var.M0(false);
        xj0 xj0Var = tv0Var.f30727s0;
        if (xj0Var != null) {
            xj0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(bs.h).start();
        }
        if (tv0Var.f30744z0) {
            tv0Var.f30744z0 = false;
        } else {
            tv0Var.o1(false);
        }
    }

    @Override
    public final void n() {
        boolean z10;
        tv0 tv0Var = this.f30050r;
        tv0Var.V0 = true;
        gt0 gt0Var = tv0Var.J0;
        if (gt0Var != null) {
            if ((tv0Var.getSelectedTab() == 11 || tv0Var.getSelectedTab() == 12) && gt0Var.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            gt0Var.g(z10);
        }
        ImageView imageView = tv0Var.f30724r0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.u0 u0Var = tv0Var.m0;
        if (u0Var != null) {
            u0Var.setVisibility(8);
        }
        tv0Var.f30715n0.setVisibility(8);
        tv0Var.M0(true);
        xj0 xj0Var = tv0Var.f30727s0;
        if (xj0Var != null) {
            xj0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(bs.h).start();
        }
    }

    @Override
    public final void p(ei.e2 e2Var) {
        zt0 zt0Var = this.f30050r.T;
        if (zt0Var != null) {
            zt0Var.f41491a.r9();
        }
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        ev0 ev0Var;
        String obj = editText.getText().toString();
        tv0 tv0Var = this.f30050r;
        zt0 zt0Var = tv0Var.T;
        if (zt0Var != null) {
            org.telegram.ui.rn rnVar = zt0Var.f41491a;
            org.telegram.ui.ActionBar.u0 u0Var = rnVar.f40726j0;
            if (u0Var != null) {
                rnVar.f40854t3 = obj;
                u0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && tv0Var.W0 == null) {
                org.telegram.ui.rn rnVar2 = zt0Var.f41491a;
                org.telegram.ui.in inVar = rnVar2.oc;
                if (inVar != null) {
                    inVar.m();
                }
                rnVar2.f40841s3 = false;
                rnVar2.f40789o0 = false;
                rnVar2.lc(false);
                rnVar2.Mc();
            }
        }
        tv0Var.f30715n0.setVisibility(8);
        if (obj.length() == 0 && tv0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        tv0Var.U0 = z10;
        tv0Var.post(new gr0(this, 2));
        int i10 = tv0Var.f30710k0[0].F;
        if (i10 == 1) {
            pu0 pu0Var = tv0Var.f30702g0;
            if (pu0Var != null) {
                pu0Var.G(obj, true);
            }
        } else if (i10 == 3) {
            pu0 pu0Var2 = tv0Var.f30706i0;
            if (pu0Var2 != null) {
                pu0Var2.G(obj, true);
            }
        } else if (i10 == 4) {
            pu0 pu0Var3 = tv0Var.f30704h0;
            if (pu0Var3 != null) {
                pu0Var3.G(obj, true);
            }
        } else if (i10 == 7) {
            ku0 ku0Var = tv0Var.f30708j0;
            if (ku0Var != null) {
                ku0Var.F(obj, true);
            }
        } else if (i10 == 11 && (ev0Var = tv0Var.S) != null) {
            ev0Var.E(tv0Var.W0, obj);
        }
    }
}
