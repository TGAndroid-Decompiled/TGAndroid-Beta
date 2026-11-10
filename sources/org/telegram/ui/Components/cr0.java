package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public final class cr0 extends org.telegram.ui.ActionBar.n0 {
    public final ys0 f32743a;

    public cr0(ys0 ys0Var) {
        this.f32743a = ys0Var;
    }

    @Override
    public final void g() {
        org.telegram.ui.ActionBar.r0 r0Var = this.f32743a.f40695p0;
        r0Var.setTranslationX(((View) r0Var.getParent()).getMeasuredWidth() - r0Var.getRight());
    }

    @Override
    public final void h() {
        ys0 ys0Var = this.f32743a;
        rq0 rq0Var = ys0Var.L0;
        ImageView imageView = ys0Var.f40708t0;
        ys0Var.X0 = false;
        ys0Var.Y0 = null;
        org.telegram.ui.ActionBar.r0 r0Var = ys0Var.f40692o0;
        if (r0Var != null) {
            r0Var.setVisibility(0);
        }
        if (imageView != null && ys0Var.k0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (rq0Var != null) {
            rq0Var.d.M(new org.telegram.ui.hq(2));
            rq0Var.h = 0L;
            rq0Var.g(false);
        }
        fr0 fr0Var = ys0Var.V;
        if (fr0Var != null) {
            org.telegram.ui.dn dnVar = fr0Var.f45407a;
            org.telegram.ui.um umVar = dnVar.Tc;
            if (umVar != null) {
                umVar.h();
            }
            dnVar.G3 = false;
            dnVar.f44625q0 = false;
            dnVar.Oc(false);
            dnVar.pd();
        }
        ys0Var.W0 = false;
        ys0Var.setSearchItemVisibility(0);
        ys0Var.f40676i0.G(null, true);
        ys0Var.f40682k0.G(null, true);
        ys0Var.f40679j0.G(null, true);
        ys0Var.f40685l0.F(null, true);
        ks0 ks0Var = ys0Var.U;
        if (ks0Var != null) {
            ks0Var.E(null, null);
        }
        ys0Var.X0(false);
        ch0 ch0Var = ys0Var.f40710u0;
        if (ch0Var != null) {
            ch0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(wq.h).start();
        }
        if (ys0Var.B0) {
            ys0Var.B0 = false;
        } else {
            ys0Var.B1(false);
        }
    }

    @Override
    public final void i() {
        boolean z9;
        ys0 ys0Var = this.f32743a;
        ys0Var.X0 = true;
        rq0 rq0Var = ys0Var.L0;
        if (rq0Var != null) {
            if ((ys0Var.getSelectedTab() == 11 || ys0Var.getSelectedTab() == 12) && rq0Var.a()) {
                z9 = true;
            } else {
                z9 = false;
            }
            rq0Var.g(z9);
        }
        ImageView imageView = ys0Var.f40708t0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.r0 r0Var = ys0Var.f40692o0;
        if (r0Var != null) {
            r0Var.setVisibility(8);
        }
        ys0Var.setSearchItemVisibility(8);
        ys0Var.X0(true);
        ch0 ch0Var = ys0Var.f40710u0;
        if (ch0Var != null) {
            ch0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(wq.h).start();
        }
    }

    @Override
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        fr0 fr0Var = this.f32743a.V;
        if (fr0Var != null) {
            fr0Var.f45407a.K9();
        }
    }

    @Override
    public final void l(EditText editText) {
        boolean z9;
        ks0 ks0Var;
        String obj = editText.getText().toString();
        ys0 ys0Var = this.f32743a;
        fr0 fr0Var = ys0Var.V;
        if (fr0Var != null) {
            org.telegram.ui.dn dnVar = fr0Var.f45407a;
            org.telegram.ui.ActionBar.r0 r0Var = dnVar.f44540j0;
            if (r0Var != null) {
                dnVar.H3 = obj;
                r0Var.P(obj, false);
            }
            if (TextUtils.isEmpty(obj) && ys0Var.Y0 == null) {
                org.telegram.ui.dn dnVar2 = fr0Var.f45407a;
                org.telegram.ui.um umVar = dnVar2.Tc;
                if (umVar != null) {
                    umVar.h();
                }
                dnVar2.G3 = false;
                dnVar2.f44625q0 = false;
                dnVar2.Oc(false);
                dnVar2.pd();
            }
        }
        ys0Var.setSearchItemVisibility(8);
        if (obj.length() == 0 && ys0Var.Y0 == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        ys0Var.W0 = z9;
        ys0Var.post(new ob0(this, 29));
        int i7 = ys0Var.m0[0].E;
        if (i7 == 1) {
            vr0 vr0Var = ys0Var.f40676i0;
            if (vr0Var != null) {
                vr0Var.G(obj, true);
            }
        } else if (i7 == 3) {
            vr0 vr0Var2 = ys0Var.f40682k0;
            if (vr0Var2 != null) {
                vr0Var2.G(obj, true);
            }
        } else if (i7 == 4) {
            vr0 vr0Var3 = ys0Var.f40679j0;
            if (vr0Var3 != null) {
                vr0Var3.G(obj, true);
            }
        } else if (i7 == 7) {
            rr0 rr0Var = ys0Var.f40685l0;
            if (rr0Var != null) {
                rr0Var.F(obj, true);
            }
        } else if (i7 == 11 && (ks0Var = ys0Var.U) != null) {
            ks0Var.E(ys0Var.Y0, obj);
        }
    }
}
