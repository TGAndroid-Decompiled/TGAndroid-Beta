package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public final class es0 extends org.telegram.ui.ActionBar.p0 {
    public final au0 f25922a;

    public es0(au0 au0Var) {
        this.f25922a = au0Var;
    }

    @Override
    public final void g() {
        org.telegram.ui.ActionBar.t0 t0Var = this.f25922a.f24544p0;
        t0Var.setTranslationX(((View) t0Var.getParent()).getMeasuredWidth() - t0Var.getRight());
    }

    @Override
    public final void h() {
        au0 au0Var = this.f25922a;
        sr0 sr0Var = au0Var.L0;
        ImageView imageView = au0Var.f24557t0;
        au0Var.X0 = false;
        au0Var.Y0 = null;
        org.telegram.ui.ActionBar.t0 t0Var = au0Var.f24541o0;
        if (t0Var != null) {
            t0Var.setVisibility(0);
        }
        if (imageView != null && au0Var.j0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (sr0Var != null) {
            sr0Var.d.M(new org.telegram.ui.fr(2));
            sr0Var.h = 0L;
            sr0Var.g(false);
        }
        gs0 gs0Var = au0Var.V;
        if (gs0Var != null) {
            org.telegram.ui.vn vnVar = gs0Var.f43128a;
            org.telegram.ui.mn mnVar = vnVar.Kc;
            if (mnVar != null) {
                mnVar.h();
            }
            vnVar.G3 = false;
            vnVar.f42189q0 = false;
            vnVar.Gc(false);
            vnVar.hd();
        }
        au0Var.W0 = false;
        au0Var.setSearchItemVisibility(0);
        au0Var.f24524i0.G(null, true);
        au0Var.f24530k0.G(null, true);
        au0Var.f24527j0.G(null, true);
        au0Var.f24533l0.F(null, true);
        mt0 mt0Var = au0Var.U;
        if (mt0Var != null) {
            mt0Var.E(null, null);
        }
        au0Var.T0(false);
        fi0 fi0Var = au0Var.f24559u0;
        if (fi0Var != null) {
            fi0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(gr.h).start();
        }
        if (au0Var.B0) {
            au0Var.B0 = false;
        } else {
            au0Var.x1(false);
        }
    }

    @Override
    public final void i() {
        boolean z10;
        au0 au0Var = this.f25922a;
        au0Var.X0 = true;
        sr0 sr0Var = au0Var.L0;
        if (sr0Var != null) {
            if ((au0Var.getSelectedTab() == 11 || au0Var.getSelectedTab() == 12) && sr0Var.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            sr0Var.g(z10);
        }
        ImageView imageView = au0Var.f24557t0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.t0 t0Var = au0Var.f24541o0;
        if (t0Var != null) {
            t0Var.setVisibility(8);
        }
        au0Var.setSearchItemVisibility(8);
        au0Var.T0(true);
        fi0 fi0Var = au0Var.f24559u0;
        if (fi0Var != null) {
            fi0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(gr.h).start();
        }
    }

    @Override
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        gs0 gs0Var = this.f25922a.V;
        if (gs0Var != null) {
            gs0Var.f43128a.E9();
        }
    }

    @Override
    public final void l(EditText editText) {
        boolean z10;
        mt0 mt0Var;
        String obj = editText.getText().toString();
        au0 au0Var = this.f25922a;
        gs0 gs0Var = au0Var.V;
        if (gs0Var != null) {
            org.telegram.ui.vn vnVar = gs0Var.f43128a;
            org.telegram.ui.ActionBar.t0 t0Var = vnVar.f42102j0;
            if (t0Var != null) {
                vnVar.H3 = obj;
                t0Var.P(obj, false);
            }
            if (TextUtils.isEmpty(obj) && au0Var.Y0 == null) {
                org.telegram.ui.vn vnVar2 = gs0Var.f43128a;
                org.telegram.ui.mn mnVar = vnVar2.Kc;
                if (mnVar != null) {
                    mnVar.h();
                }
                vnVar2.G3 = false;
                vnVar2.f42189q0 = false;
                vnVar2.Gc(false);
                vnVar2.hd();
            }
        }
        au0Var.setSearchItemVisibility(8);
        if (obj.length() == 0 && au0Var.Y0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        au0Var.W0 = z10;
        au0Var.post(new vo0(this, 4));
        int i10 = au0Var.m0[0].E;
        if (i10 == 1) {
            vs0 vs0Var = au0Var.f24524i0;
            if (vs0Var != null) {
                vs0Var.G(obj, true);
            }
        } else if (i10 == 3) {
            vs0 vs0Var2 = au0Var.f24530k0;
            if (vs0Var2 != null) {
                vs0Var2.G(obj, true);
            }
        } else if (i10 == 4) {
            vs0 vs0Var3 = au0Var.f24527j0;
            if (vs0Var3 != null) {
                vs0Var3.G(obj, true);
            }
        } else if (i10 == 7) {
            rs0 rs0Var = au0Var.f24533l0;
            if (rs0Var != null) {
                rs0Var.F(obj, true);
            }
        } else if (i10 == 11 && (mt0Var = au0Var.U) != null) {
            mt0Var.E(obj, au0Var.Y0);
        }
    }
}
