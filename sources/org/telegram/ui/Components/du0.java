package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public final class du0 extends org.telegram.ui.ActionBar.s0 {
    public final aw0 f27606a;

    public du0(aw0 aw0Var) {
        this.f27606a = aw0Var;
    }

    @Override
    public final void g() {
        org.telegram.ui.ActionBar.w0 w0Var = this.f27606a.f26683p0;
        w0Var.setTranslationX(((View) w0Var.getParent()).getMeasuredWidth() - w0Var.getRight());
    }

    @Override
    public final void h() {
        aw0 aw0Var = this.f27606a;
        rt0 rt0Var = aw0Var.L0;
        ImageView imageView = aw0Var.f26693t0;
        aw0Var.X0 = false;
        aw0Var.Y0 = null;
        org.telegram.ui.ActionBar.w0 w0Var = aw0Var.f26680o0;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        if (imageView != null && aw0Var.h0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (rt0Var != null) {
            rt0Var.d.M(new org.telegram.ui.ar(2));
            rt0Var.h = 0L;
            rt0Var.g(false);
        }
        fu0 fu0Var = aw0Var.V;
        if (fu0Var != null) {
            org.telegram.ui.vn vnVar = fu0Var.f45521a;
            org.telegram.ui.mn mnVar = vnVar.Kc;
            if (mnVar != null) {
                mnVar.h();
            }
            vnVar.E3 = false;
            vnVar.f44356o0 = false;
            vnVar.uc(false);
            vnVar.Vc();
        }
        aw0Var.W0 = false;
        aw0Var.setSearchItemVisibility(0);
        aw0Var.f26663i0.G(null, true);
        aw0Var.f26669k0.G(null, true);
        aw0Var.f26666j0.G(null, true);
        aw0Var.f26672l0.F(null, true);
        mv0 mv0Var = aw0Var.U;
        if (mv0Var != null) {
            mv0Var.E(null, null);
        }
        aw0Var.R0(false);
        ak0 ak0Var = aw0Var.f26695u0;
        if (ak0Var != null) {
            ak0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(ds.h).start();
        }
        if (aw0Var.B0) {
            aw0Var.B0 = false;
        } else {
            aw0Var.v1(false);
        }
    }

    @Override
    public final void i() {
        boolean z10;
        aw0 aw0Var = this.f27606a;
        aw0Var.X0 = true;
        rt0 rt0Var = aw0Var.L0;
        if (rt0Var != null) {
            if ((aw0Var.getSelectedTab() == 11 || aw0Var.getSelectedTab() == 12) && rt0Var.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            rt0Var.g(z10);
        }
        ImageView imageView = aw0Var.f26693t0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.w0 w0Var = aw0Var.f26680o0;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        aw0Var.setSearchItemVisibility(8);
        aw0Var.R0(true);
        ak0 ak0Var = aw0Var.f26695u0;
        if (ak0Var != null) {
            ak0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(ds.h).start();
        }
    }

    @Override
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        fu0 fu0Var = this.f27606a.V;
        if (fu0Var != null) {
            fu0Var.f45521a.w9();
        }
    }

    @Override
    public final void l(EditText editText) {
        boolean z10;
        mv0 mv0Var;
        String obj = editText.getText().toString();
        aw0 aw0Var = this.f27606a;
        fu0 fu0Var = aw0Var.V;
        if (fu0Var != null) {
            org.telegram.ui.vn vnVar = fu0Var.f45521a;
            org.telegram.ui.ActionBar.w0 w0Var = vnVar.f44294j0;
            if (w0Var != null) {
                vnVar.F3 = obj;
                w0Var.P(obj, false);
            }
            if (TextUtils.isEmpty(obj) && aw0Var.Y0 == null) {
                org.telegram.ui.vn vnVar2 = fu0Var.f45521a;
                org.telegram.ui.mn mnVar = vnVar2.Kc;
                if (mnVar != null) {
                    mnVar.h();
                }
                vnVar2.E3 = false;
                vnVar2.f44356o0 = false;
                vnVar2.uc(false);
                vnVar2.Vc();
            }
        }
        aw0Var.setSearchItemVisibility(8);
        if (obj.length() == 0 && aw0Var.Y0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        aw0Var.W0 = z10;
        aw0Var.post(new mp0(this, 6));
        int i10 = aw0Var.m0[0].E;
        if (i10 == 1) {
            wu0 wu0Var = aw0Var.f26663i0;
            if (wu0Var != null) {
                wu0Var.G(obj, true);
            }
        } else if (i10 == 3) {
            wu0 wu0Var2 = aw0Var.f26669k0;
            if (wu0Var2 != null) {
                wu0Var2.G(obj, true);
            }
        } else if (i10 == 4) {
            wu0 wu0Var3 = aw0Var.f26666j0;
            if (wu0Var3 != null) {
                wu0Var3.G(obj, true);
            }
        } else if (i10 == 7) {
            ru0 ru0Var = aw0Var.f26672l0;
            if (ru0Var != null) {
                ru0Var.F(obj, true);
            }
        } else if (i10 == 11 && (mv0Var = aw0Var.U) != null) {
            mv0Var.E(aw0Var.Y0, obj);
        }
    }
}
