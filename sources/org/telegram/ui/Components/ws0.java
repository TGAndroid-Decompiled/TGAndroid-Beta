package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public final class ws0 extends org.telegram.ui.ActionBar.i5 {
    public final zu0 f32845f;

    public ws0(zu0 zu0Var) {
        this.f32845f = zu0Var;
    }

    @Override
    public final void l() {
        org.telegram.ui.ActionBar.w0 w0Var = this.f32845f.f33986k0;
        w0Var.setTranslationX(((View) w0Var.getParent()).getMeasuredWidth() - w0Var.getRight());
    }

    @Override
    public final void m() {
        zu0 zu0Var = this.f32845f;
        ls0 ls0Var = zu0Var.G0;
        ImageView imageView = zu0Var.f33993o0;
        zu0Var.S0 = false;
        zu0Var.T0 = null;
        org.telegram.ui.ActionBar.w0 w0Var = zu0Var.f33984j0;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        if (imageView != null && zu0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (ls0Var != null) {
            ls0Var.d.M(new org.telegram.ui.gr(2));
            ls0Var.h = 0L;
            ls0Var.g(false);
        }
        et0 et0Var = zu0Var.Q;
        if (et0Var != null) {
            org.telegram.ui.yn ynVar = et0Var.f43958a;
            org.telegram.ui.pn pnVar = ynVar.f43264lc;
            if (pnVar != null) {
                pnVar.m();
            }
            ynVar.f43304p3 = false;
            ynVar.f43253l0 = false;
            ynVar.hc(false);
            ynVar.Ic();
        }
        zu0Var.R0 = false;
        zu0Var.f33986k0.setVisibility(0);
        zu0Var.f33970d0.G(null, true);
        zu0Var.f33976f0.G(null, true);
        zu0Var.f33973e0.G(null, true);
        zu0Var.f33978g0.F(null, true);
        ku0 ku0Var = zu0Var.P;
        if (ku0Var != null) {
            ku0Var.E(null, null);
        }
        zu0Var.K0(false);
        lj0 lj0Var = zu0Var.f33995p0;
        if (lj0Var != null) {
            lj0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(pr.h).start();
        }
        if (zu0Var.f34012w0) {
            zu0Var.f34012w0 = false;
        } else {
            zu0Var.m1(false);
        }
    }

    @Override
    public final void n() {
        boolean z4;
        zu0 zu0Var = this.f32845f;
        zu0Var.S0 = true;
        ls0 ls0Var = zu0Var.G0;
        if (ls0Var != null) {
            if ((zu0Var.getSelectedTab() == 11 || zu0Var.getSelectedTab() == 12) && ls0Var.a()) {
                z4 = true;
            } else {
                z4 = false;
            }
            ls0Var.g(z4);
        }
        ImageView imageView = zu0Var.f33993o0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.w0 w0Var = zu0Var.f33984j0;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        zu0Var.f33986k0.setVisibility(8);
        zu0Var.K0(true);
        lj0 lj0Var = zu0Var.f33995p0;
        if (lj0Var != null) {
            lj0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(pr.h).start();
        }
    }

    @Override
    public final void p(lg.f fVar) {
        et0 et0Var = this.f32845f.Q;
        if (et0Var != null) {
            et0Var.f43958a.m9();
        }
    }

    @Override
    public final void q(EditText editText) {
        boolean z4;
        ku0 ku0Var;
        String obj = editText.getText().toString();
        zu0 zu0Var = this.f32845f;
        et0 et0Var = zu0Var.Q;
        if (et0Var != null) {
            org.telegram.ui.yn ynVar = et0Var.f43958a;
            org.telegram.ui.ActionBar.w0 w0Var = ynVar.f43191g0;
            if (w0Var != null) {
                ynVar.f43317q3 = obj;
                w0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && zu0Var.T0 == null) {
                org.telegram.ui.yn ynVar2 = et0Var.f43958a;
                org.telegram.ui.pn pnVar = ynVar2.f43264lc;
                if (pnVar != null) {
                    pnVar.m();
                }
                ynVar2.f43304p3 = false;
                ynVar2.f43253l0 = false;
                ynVar2.hc(false);
                ynVar2.Ic();
            }
        }
        zu0Var.f33986k0.setVisibility(8);
        if (obj.length() == 0 && zu0Var.T0 == null) {
            z4 = false;
        } else {
            z4 = true;
        }
        zu0Var.R0 = z4;
        zu0Var.post(new oq0(this, 2));
        int i10 = zu0Var.f33980h0[0].C;
        if (i10 == 1) {
            ut0 ut0Var = zu0Var.f33970d0;
            if (ut0Var != null) {
                ut0Var.G(obj, true);
            }
        } else if (i10 == 3) {
            ut0 ut0Var2 = zu0Var.f33976f0;
            if (ut0Var2 != null) {
                ut0Var2.G(obj, true);
            }
        } else if (i10 == 4) {
            ut0 ut0Var3 = zu0Var.f33973e0;
            if (ut0Var3 != null) {
                ut0Var3.G(obj, true);
            }
        } else if (i10 == 7) {
            pt0 pt0Var = zu0Var.f33978g0;
            if (pt0Var != null) {
                pt0Var.F(obj, true);
            }
        } else if (i10 == 11 && (ku0Var = zu0Var.P) != null) {
            ku0Var.E(zu0Var.T0, obj);
        }
    }
}
