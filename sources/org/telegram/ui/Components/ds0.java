package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public final class ds0 extends org.telegram.ui.ActionBar.p0 {
    public final zt0 f25530a;

    public ds0(zt0 zt0Var) {
        this.f25530a = zt0Var;
    }

    @Override
    public final void g() {
        org.telegram.ui.ActionBar.t0 t0Var = this.f25530a.f33216p0;
        t0Var.setTranslationX(((View) t0Var.getParent()).getMeasuredWidth() - t0Var.getRight());
    }

    @Override
    public final void h() {
        zt0 zt0Var = this.f25530a;
        rr0 rr0Var = zt0Var.L0;
        ImageView imageView = zt0Var.f33229t0;
        zt0Var.X0 = false;
        zt0Var.Y0 = null;
        org.telegram.ui.ActionBar.t0 t0Var = zt0Var.f33213o0;
        if (t0Var != null) {
            t0Var.setVisibility(0);
        }
        if (imageView != null && zt0Var.i0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (rr0Var != null) {
            rr0Var.d.M(new org.telegram.ui.fr(2));
            rr0Var.h = 0L;
            rr0Var.g(false);
        }
        fs0 fs0Var = zt0Var.V;
        if (fs0Var != null) {
            org.telegram.ui.vn vnVar = fs0Var.f43336a;
            org.telegram.ui.mn mnVar = vnVar.Jc;
            if (mnVar != null) {
                mnVar.h();
            }
            vnVar.G3 = false;
            vnVar.f42378q0 = false;
            vnVar.Bc(false);
            vnVar.cd();
        }
        zt0Var.W0 = false;
        zt0Var.setSearchItemVisibility(0);
        zt0Var.f33196i0.G(null, true);
        zt0Var.f33202k0.G(null, true);
        zt0Var.f33199j0.G(null, true);
        zt0Var.f33205l0.F(null, true);
        lt0 lt0Var = zt0Var.U;
        if (lt0Var != null) {
            lt0Var.E(null, null);
        }
        zt0Var.S0(false);
        ei0 ei0Var = zt0Var.f33231u0;
        if (ei0Var != null) {
            ei0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(gr.h).start();
        }
        if (zt0Var.B0) {
            zt0Var.B0 = false;
        } else {
            zt0Var.w1(false);
        }
    }

    @Override
    public final void i() {
        boolean z10;
        zt0 zt0Var = this.f25530a;
        zt0Var.X0 = true;
        rr0 rr0Var = zt0Var.L0;
        if (rr0Var != null) {
            if ((zt0Var.getSelectedTab() == 11 || zt0Var.getSelectedTab() == 12) && rr0Var.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            rr0Var.g(z10);
        }
        ImageView imageView = zt0Var.f33229t0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.t0 t0Var = zt0Var.f33213o0;
        if (t0Var != null) {
            t0Var.setVisibility(8);
        }
        zt0Var.setSearchItemVisibility(8);
        zt0Var.S0(true);
        ei0 ei0Var = zt0Var.f33231u0;
        if (ei0Var != null) {
            ei0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(gr.h).start();
        }
    }

    @Override
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        fs0 fs0Var = this.f25530a.V;
        if (fs0Var != null) {
            fs0Var.f43336a.z9();
        }
    }

    @Override
    public final void l(EditText editText) {
        boolean z10;
        lt0 lt0Var;
        String obj = editText.getText().toString();
        zt0 zt0Var = this.f25530a;
        fs0 fs0Var = zt0Var.V;
        if (fs0Var != null) {
            org.telegram.ui.vn vnVar = fs0Var.f43336a;
            org.telegram.ui.ActionBar.t0 t0Var = vnVar.f42291j0;
            if (t0Var != null) {
                vnVar.H3 = obj;
                t0Var.P(obj, false);
            }
            if (TextUtils.isEmpty(obj) && zt0Var.Y0 == null) {
                org.telegram.ui.vn vnVar2 = fs0Var.f43336a;
                org.telegram.ui.mn mnVar = vnVar2.Jc;
                if (mnVar != null) {
                    mnVar.h();
                }
                vnVar2.G3 = false;
                vnVar2.f42378q0 = false;
                vnVar2.Bc(false);
                vnVar2.cd();
            }
        }
        zt0Var.setSearchItemVisibility(8);
        if (obj.length() == 0 && zt0Var.Y0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        zt0Var.W0 = z10;
        zt0Var.post(new uo0(this, 4));
        int i10 = zt0Var.m0[0].E;
        if (i10 == 1) {
            us0 us0Var = zt0Var.f33196i0;
            if (us0Var != null) {
                us0Var.G(obj, true);
            }
        } else if (i10 == 3) {
            us0 us0Var2 = zt0Var.f33202k0;
            if (us0Var2 != null) {
                us0Var2.G(obj, true);
            }
        } else if (i10 == 4) {
            us0 us0Var3 = zt0Var.f33199j0;
            if (us0Var3 != null) {
                us0Var3.G(obj, true);
            }
        } else if (i10 == 7) {
            qs0 qs0Var = zt0Var.f33205l0;
            if (qs0Var != null) {
                qs0Var.F(obj, true);
            }
        } else if (i10 == 11 && (lt0Var = zt0Var.U) != null) {
            lt0Var.E(obj, zt0Var.Y0);
        }
    }
}
