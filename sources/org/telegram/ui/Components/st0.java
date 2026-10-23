package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public final class st0 extends org.telegram.ui.ActionBar.g5 {
    public final uv0 f30361r;

    public st0(uv0 uv0Var) {
        this.f30361r = uv0Var;
    }

    @Override
    public final void l() {
        org.telegram.ui.ActionBar.u0 u0Var = this.f30361r.f31056n0;
        u0Var.setTranslationX(((View) u0Var.getParent()).getMeasuredWidth() - u0Var.getRight());
    }

    @Override
    public final void m() {
        uv0 uv0Var = this.f30361r;
        ht0 ht0Var = uv0Var.J0;
        ImageView imageView = uv0Var.f31065r0;
        uv0Var.V0 = false;
        uv0Var.W0 = null;
        org.telegram.ui.ActionBar.u0 u0Var = uv0Var.m0;
        if (u0Var != null) {
            u0Var.setVisibility(0);
        }
        if (imageView != null && uv0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (ht0Var != null) {
            ht0Var.d.M(new org.telegram.ui.xq(2));
            ht0Var.h = 0L;
            ht0Var.g(false);
        }
        au0 au0Var = uv0Var.T;
        if (au0Var != null) {
            org.telegram.ui.rn rnVar = au0Var.f41500a;
            org.telegram.ui.in inVar = rnVar.oc;
            if (inVar != null) {
                inVar.m();
            }
            rnVar.f40843s3 = false;
            rnVar.f40791o0 = false;
            rnVar.mc(false);
            rnVar.Nc();
        }
        uv0Var.U0 = false;
        uv0Var.f31056n0.setVisibility(0);
        uv0Var.f31043g0.G(null, true);
        uv0Var.f31047i0.G(null, true);
        uv0Var.f31045h0.G(null, true);
        uv0Var.f31049j0.F(null, true);
        fv0 fv0Var = uv0Var.S;
        if (fv0Var != null) {
            fv0Var.E(null, null);
        }
        uv0Var.M0(false);
        yj0 yj0Var = uv0Var.f31068s0;
        if (yj0Var != null) {
            yj0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(bs.h).start();
        }
        if (uv0Var.f31085z0) {
            uv0Var.f31085z0 = false;
        } else {
            uv0Var.o1(false);
        }
    }

    @Override
    public final void n() {
        boolean z10;
        uv0 uv0Var = this.f30361r;
        uv0Var.V0 = true;
        ht0 ht0Var = uv0Var.J0;
        if (ht0Var != null) {
            if ((uv0Var.getSelectedTab() == 11 || uv0Var.getSelectedTab() == 12) && ht0Var.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ht0Var.g(z10);
        }
        ImageView imageView = uv0Var.f31065r0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.u0 u0Var = uv0Var.m0;
        if (u0Var != null) {
            u0Var.setVisibility(8);
        }
        uv0Var.f31056n0.setVisibility(8);
        uv0Var.M0(true);
        yj0 yj0Var = uv0Var.f31068s0;
        if (yj0Var != null) {
            yj0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(bs.h).start();
        }
    }

    @Override
    public final void p(ei.e2 e2Var) {
        au0 au0Var = this.f30361r.T;
        if (au0Var != null) {
            au0Var.f41500a.r9();
        }
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        fv0 fv0Var;
        String obj = editText.getText().toString();
        uv0 uv0Var = this.f30361r;
        au0 au0Var = uv0Var.T;
        if (au0Var != null) {
            org.telegram.ui.rn rnVar = au0Var.f41500a;
            org.telegram.ui.ActionBar.u0 u0Var = rnVar.f40728j0;
            if (u0Var != null) {
                rnVar.f40856t3 = obj;
                u0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && uv0Var.W0 == null) {
                org.telegram.ui.rn rnVar2 = au0Var.f41500a;
                org.telegram.ui.in inVar = rnVar2.oc;
                if (inVar != null) {
                    inVar.m();
                }
                rnVar2.f40843s3 = false;
                rnVar2.f40791o0 = false;
                rnVar2.mc(false);
                rnVar2.Nc();
            }
        }
        uv0Var.f31056n0.setVisibility(8);
        if (obj.length() == 0 && uv0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        uv0Var.U0 = z10;
        uv0Var.post(new hr0(this, 2));
        int i10 = uv0Var.f31051k0[0].F;
        if (i10 == 1) {
            qu0 qu0Var = uv0Var.f31043g0;
            if (qu0Var != null) {
                qu0Var.G(obj, true);
            }
        } else if (i10 == 3) {
            qu0 qu0Var2 = uv0Var.f31047i0;
            if (qu0Var2 != null) {
                qu0Var2.G(obj, true);
            }
        } else if (i10 == 4) {
            qu0 qu0Var3 = uv0Var.f31045h0;
            if (qu0Var3 != null) {
                qu0Var3.G(obj, true);
            }
        } else if (i10 == 7) {
            lu0 lu0Var = uv0Var.f31049j0;
            if (lu0Var != null) {
                lu0Var.F(obj, true);
            }
        } else if (i10 == 11 && (fv0Var = uv0Var.S) != null) {
            fv0Var.E(uv0Var.W0, obj);
        }
    }
}
