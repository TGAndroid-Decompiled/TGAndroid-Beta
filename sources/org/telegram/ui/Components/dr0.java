package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public final class dr0 extends org.telegram.ui.ActionBar.m0 {
    public final ys0 f34042a;

    public dr0(ys0 ys0Var) {
        this.f34042a = ys0Var;
    }

    @Override
    public final void g() {
        org.telegram.ui.ActionBar.q0 q0Var = this.f34042a.f42127q0;
        q0Var.setTranslationX(((View) q0Var.getParent()).getMeasuredWidth() - q0Var.getRight());
    }

    @Override
    public final void h() {
        ys0 ys0Var = this.f34042a;
        sq0 sq0Var = ys0Var.M0;
        ImageView imageView = ys0Var.f42140u0;
        ys0Var.Y0 = false;
        ys0Var.Z0 = null;
        org.telegram.ui.ActionBar.q0 q0Var = ys0Var.f42124p0;
        if (q0Var != null) {
            q0Var.setVisibility(0);
        }
        if (imageView != null && ys0Var.k0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (sq0Var != null) {
            sq0Var.d.M(new org.telegram.ui.gq(2));
            sq0Var.h = 0L;
            sq0Var.g(false);
        }
        gr0 gr0Var = ys0Var.W;
        if (gr0Var != null) {
            org.telegram.ui.bn bnVar = gr0Var.f46179a;
            org.telegram.ui.sm smVar = bnVar.Uc;
            if (smVar != null) {
                smVar.h();
            }
            bnVar.H3 = false;
            bnVar.f45339r0 = false;
            bnVar.Pc(false);
            bnVar.qd();
        }
        ys0Var.X0 = false;
        ys0Var.setSearchItemVisibility(0);
        ys0Var.f42108j0.G(null, true);
        ys0Var.f42114l0.G(null, true);
        ys0Var.f42111k0.G(null, true);
        ys0Var.m0.F(null, true);
        ks0 ks0Var = ys0Var.V;
        if (ks0Var != null) {
            ks0Var.E(null, null);
        }
        ys0Var.X0(false);
        fh0 fh0Var = ys0Var.f42142v0;
        if (fh0Var != null) {
            fh0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(er.h).start();
        }
        if (ys0Var.C0) {
            ys0Var.C0 = false;
        } else {
            ys0Var.B1(false);
        }
    }

    @Override
    public final void i() {
        boolean z10;
        ys0 ys0Var = this.f34042a;
        ys0Var.Y0 = true;
        sq0 sq0Var = ys0Var.M0;
        if (sq0Var != null) {
            if ((ys0Var.getSelectedTab() == 11 || ys0Var.getSelectedTab() == 12) && sq0Var.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            sq0Var.g(z10);
        }
        ImageView imageView = ys0Var.f42140u0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.q0 q0Var = ys0Var.f42124p0;
        if (q0Var != null) {
            q0Var.setVisibility(8);
        }
        ys0Var.setSearchItemVisibility(8);
        ys0Var.X0(true);
        fh0 fh0Var = ys0Var.f42142v0;
        if (fh0Var != null) {
            fh0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(er.h).start();
        }
    }

    @Override
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        gr0 gr0Var = this.f34042a.W;
        if (gr0Var != null) {
            gr0Var.f46179a.L9();
        }
    }

    @Override
    public final void l(EditText editText) {
        boolean z10;
        ks0 ks0Var;
        String obj = editText.getText().toString();
        ys0 ys0Var = this.f34042a;
        gr0 gr0Var = ys0Var.W;
        if (gr0Var != null) {
            org.telegram.ui.bn bnVar = gr0Var.f46179a;
            org.telegram.ui.ActionBar.q0 q0Var = bnVar.f45252k0;
            if (q0Var != null) {
                bnVar.I3 = obj;
                q0Var.Q(obj, false);
            }
            if (TextUtils.isEmpty(obj) && ys0Var.Z0 == null) {
                org.telegram.ui.bn bnVar2 = gr0Var.f46179a;
                org.telegram.ui.sm smVar = bnVar2.Uc;
                if (smVar != null) {
                    smVar.h();
                }
                bnVar2.H3 = false;
                bnVar2.f45339r0 = false;
                bnVar2.Pc(false);
                bnVar2.qd();
            }
        }
        ys0Var.setSearchItemVisibility(8);
        if (obj.length() == 0 && ys0Var.Z0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        ys0Var.X0 = z10;
        ys0Var.post(new ro0(this, 2));
        int i7 = ys0Var.f42119n0[0].F;
        if (i7 == 1) {
            vr0 vr0Var = ys0Var.f42108j0;
            if (vr0Var != null) {
                vr0Var.G(obj, true);
            }
        } else if (i7 == 3) {
            vr0 vr0Var2 = ys0Var.f42114l0;
            if (vr0Var2 != null) {
                vr0Var2.G(obj, true);
            }
        } else if (i7 == 4) {
            vr0 vr0Var3 = ys0Var.f42111k0;
            if (vr0Var3 != null) {
                vr0Var3.G(obj, true);
            }
        } else if (i7 == 7) {
            rr0 rr0Var = ys0Var.m0;
            if (rr0Var != null) {
                rr0Var.F(obj, true);
            }
        } else if (i7 == 11 && (ks0Var = ys0Var.V) != null) {
            ks0Var.E(ys0Var.Z0, obj);
        }
    }
}
