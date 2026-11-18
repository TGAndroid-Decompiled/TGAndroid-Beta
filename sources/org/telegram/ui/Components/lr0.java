package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public final class lr0 extends org.telegram.ui.ActionBar.n0 {
    public final gt0 f37218a;

    public lr0(gt0 gt0Var) {
        this.f37218a = gt0Var;
    }

    @Override
    public final void g() {
        org.telegram.ui.ActionBar.r0 r0Var = this.f37218a.f35617q0;
        r0Var.setTranslationX(((View) r0Var.getParent()).getMeasuredWidth() - r0Var.getRight());
    }

    @Override
    public final void h() {
        gt0 gt0Var = this.f37218a;
        ar0 ar0Var = gt0Var.M0;
        ImageView imageView = gt0Var.f35630u0;
        gt0Var.Y0 = false;
        gt0Var.Z0 = null;
        org.telegram.ui.ActionBar.r0 r0Var = gt0Var.f35614p0;
        if (r0Var != null) {
            r0Var.setVisibility(0);
        }
        if (imageView != null && gt0Var.k0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (ar0Var != null) {
            ar0Var.d.M(new org.telegram.ui.hq(2));
            ar0Var.h = 0L;
            ar0Var.g(false);
        }
        or0 or0Var = gt0Var.W;
        if (or0Var != null) {
            org.telegram.ui.cn cnVar = or0Var.f46944a;
            org.telegram.ui.tm tmVar = cnVar.Vc;
            if (tmVar != null) {
                tmVar.h();
            }
            cnVar.H3 = false;
            cnVar.f46146r0 = false;
            cnVar.Pc(false);
            cnVar.qd();
        }
        gt0Var.X0 = false;
        gt0Var.setSearchItemVisibility(0);
        gt0Var.f35598j0.G(null, true);
        gt0Var.f35604l0.G(null, true);
        gt0Var.f35601k0.G(null, true);
        gt0Var.m0.F(null, true);
        ss0 ss0Var = gt0Var.V;
        if (ss0Var != null) {
            ss0Var.E(null, null);
        }
        gt0Var.X0(false);
        ph0 ph0Var = gt0Var.f35632v0;
        if (ph0Var != null) {
            ph0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(lr.h).start();
        }
        if (gt0Var.C0) {
            gt0Var.C0 = false;
        } else {
            gt0Var.B1(false);
        }
    }

    @Override
    public final void i() {
        boolean z10;
        gt0 gt0Var = this.f37218a;
        gt0Var.Y0 = true;
        ar0 ar0Var = gt0Var.M0;
        if (ar0Var != null) {
            if ((gt0Var.getSelectedTab() == 11 || gt0Var.getSelectedTab() == 12) && ar0Var.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ar0Var.g(z10);
        }
        ImageView imageView = gt0Var.f35630u0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.r0 r0Var = gt0Var.f35614p0;
        if (r0Var != null) {
            r0Var.setVisibility(8);
        }
        gt0Var.setSearchItemVisibility(8);
        gt0Var.X0(true);
        ph0 ph0Var = gt0Var.f35632v0;
        if (ph0Var != null) {
            ph0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(lr.h).start();
        }
    }

    @Override
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        or0 or0Var = this.f37218a.W;
        if (or0Var != null) {
            or0Var.f46944a.L9();
        }
    }

    @Override
    public final void l(EditText editText) {
        boolean z10;
        ss0 ss0Var;
        String obj = editText.getText().toString();
        gt0 gt0Var = this.f37218a;
        or0 or0Var = gt0Var.W;
        if (or0Var != null) {
            org.telegram.ui.cn cnVar = or0Var.f46944a;
            org.telegram.ui.ActionBar.r0 r0Var = cnVar.f46058k0;
            if (r0Var != null) {
                cnVar.I3 = obj;
                r0Var.Q(obj, false);
            }
            if (TextUtils.isEmpty(obj) && gt0Var.Z0 == null) {
                org.telegram.ui.cn cnVar2 = or0Var.f46944a;
                org.telegram.ui.tm tmVar = cnVar2.Vc;
                if (tmVar != null) {
                    tmVar.h();
                }
                cnVar2.H3 = false;
                cnVar2.f46146r0 = false;
                cnVar2.Pc(false);
                cnVar2.qd();
            }
        }
        gt0Var.setSearchItemVisibility(8);
        if (obj.length() == 0 && gt0Var.Z0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        gt0Var.X0 = z10;
        gt0Var.post(new ap0(this, 2));
        int i7 = gt0Var.f35609n0[0].F;
        if (i7 == 1) {
            ds0 ds0Var = gt0Var.f35598j0;
            if (ds0Var != null) {
                ds0Var.G(obj, true);
            }
        } else if (i7 == 3) {
            ds0 ds0Var2 = gt0Var.f35604l0;
            if (ds0Var2 != null) {
                ds0Var2.G(obj, true);
            }
        } else if (i7 == 4) {
            ds0 ds0Var3 = gt0Var.f35601k0;
            if (ds0Var3 != null) {
                ds0Var3.G(obj, true);
            }
        } else if (i7 == 7) {
            zr0 zr0Var = gt0Var.m0;
            if (zr0Var != null) {
                zr0Var.F(obj, true);
            }
        } else if (i7 == 11 && (ss0Var = gt0Var.V) != null) {
            ss0Var.E(gt0Var.Z0, obj);
        }
    }
}
