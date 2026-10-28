package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public final class eu0 extends org.telegram.ui.ActionBar.s0 {
    public final bw0 f27934a;

    public eu0(bw0 bw0Var) {
        this.f27934a = bw0Var;
    }

    @Override
    public final void g() {
        org.telegram.ui.ActionBar.w0 w0Var = this.f27934a.f26971p0;
        w0Var.setTranslationX(((View) w0Var.getParent()).getMeasuredWidth() - w0Var.getRight());
    }

    @Override
    public final void h() {
        bw0 bw0Var = this.f27934a;
        st0 st0Var = bw0Var.L0;
        ImageView imageView = bw0Var.f26981t0;
        bw0Var.X0 = false;
        bw0Var.Y0 = null;
        org.telegram.ui.ActionBar.w0 w0Var = bw0Var.f26968o0;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        if (imageView != null && bw0Var.h0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (st0Var != null) {
            st0Var.d.M(new org.telegram.ui.cr(2));
            st0Var.h = 0L;
            st0Var.g(false);
        }
        gu0 gu0Var = bw0Var.V;
        if (gu0Var != null) {
            org.telegram.ui.xn xnVar = gu0Var.f46049a;
            org.telegram.ui.on onVar = xnVar.Oc;
            if (onVar != null) {
                onVar.h();
            }
            xnVar.E3 = false;
            xnVar.f45224o0 = false;
            xnVar.yc(false);
            xnVar.Zc();
        }
        bw0Var.W0 = false;
        bw0Var.setSearchItemVisibility(0);
        bw0Var.f26951i0.G(null, true);
        bw0Var.f26957k0.G(null, true);
        bw0Var.f26954j0.G(null, true);
        bw0Var.f26960l0.F(null, true);
        nv0 nv0Var = bw0Var.U;
        if (nv0Var != null) {
            nv0Var.E(null, null);
        }
        bw0Var.R0(false);
        bk0 bk0Var = bw0Var.f26983u0;
        if (bk0Var != null) {
            bk0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(ds.h).start();
        }
        if (bw0Var.B0) {
            bw0Var.B0 = false;
        } else {
            bw0Var.v1(false);
        }
    }

    @Override
    public final void i() {
        boolean z10;
        bw0 bw0Var = this.f27934a;
        bw0Var.X0 = true;
        st0 st0Var = bw0Var.L0;
        if (st0Var != null) {
            if ((bw0Var.getSelectedTab() == 11 || bw0Var.getSelectedTab() == 12) && st0Var.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            st0Var.g(z10);
        }
        ImageView imageView = bw0Var.f26981t0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.w0 w0Var = bw0Var.f26968o0;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        bw0Var.setSearchItemVisibility(8);
        bw0Var.R0(true);
        bk0 bk0Var = bw0Var.f26983u0;
        if (bk0Var != null) {
            bk0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(ds.h).start();
        }
    }

    @Override
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        gu0 gu0Var = this.f27934a.V;
        if (gu0Var != null) {
            gu0Var.f46049a.z9();
        }
    }

    @Override
    public final void l(EditText editText) {
        boolean z10;
        nv0 nv0Var;
        String obj = editText.getText().toString();
        bw0 bw0Var = this.f27934a;
        gu0 gu0Var = bw0Var.V;
        if (gu0Var != null) {
            org.telegram.ui.xn xnVar = gu0Var.f46049a;
            org.telegram.ui.ActionBar.w0 w0Var = xnVar.f45162j0;
            if (w0Var != null) {
                xnVar.F3 = obj;
                w0Var.P(obj, false);
            }
            if (TextUtils.isEmpty(obj) && bw0Var.Y0 == null) {
                org.telegram.ui.xn xnVar2 = gu0Var.f46049a;
                org.telegram.ui.on onVar = xnVar2.Oc;
                if (onVar != null) {
                    onVar.h();
                }
                xnVar2.E3 = false;
                xnVar2.f45224o0 = false;
                xnVar2.yc(false);
                xnVar2.Zc();
            }
        }
        bw0Var.setSearchItemVisibility(8);
        if (obj.length() == 0 && bw0Var.Y0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        bw0Var.W0 = z10;
        bw0Var.post(new np0(this, 6));
        int i10 = bw0Var.m0[0].E;
        if (i10 == 1) {
            xu0 xu0Var = bw0Var.f26951i0;
            if (xu0Var != null) {
                xu0Var.G(obj, true);
            }
        } else if (i10 == 3) {
            xu0 xu0Var2 = bw0Var.f26957k0;
            if (xu0Var2 != null) {
                xu0Var2.G(obj, true);
            }
        } else if (i10 == 4) {
            xu0 xu0Var3 = bw0Var.f26954j0;
            if (xu0Var3 != null) {
                xu0Var3.G(obj, true);
            }
        } else if (i10 == 7) {
            su0 su0Var = bw0Var.f26960l0;
            if (su0Var != null) {
                su0Var.F(obj, true);
            }
        } else if (i10 == 11 && (nv0Var = bw0Var.U) != null) {
            nv0Var.E(bw0Var.Y0, obj);
        }
    }
}
