package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public final class nr0 extends org.telegram.ui.ActionBar.m0 {
    public final jt0 f37971a;

    public nr0(jt0 jt0Var) {
        this.f37971a = jt0Var;
    }

    @Override
    public final void g() {
        org.telegram.ui.ActionBar.q0 q0Var = this.f37971a.f36659q0;
        q0Var.setTranslationX(((View) q0Var.getParent()).getMeasuredWidth() - q0Var.getRight());
    }

    @Override
    public final void h() {
        jt0 jt0Var = this.f37971a;
        cr0 cr0Var = jt0Var.M0;
        ImageView imageView = jt0Var.f36672u0;
        jt0Var.Y0 = false;
        jt0Var.Z0 = null;
        org.telegram.ui.ActionBar.q0 q0Var = jt0Var.f36656p0;
        if (q0Var != null) {
            q0Var.setVisibility(0);
        }
        if (imageView != null && jt0Var.k0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (cr0Var != null) {
            cr0Var.d.M(new org.telegram.ui.hq(2));
            cr0Var.h = 0L;
            cr0Var.g(false);
        }
        qr0 qr0Var = jt0Var.W;
        if (qr0Var != null) {
            org.telegram.ui.cn cnVar = qr0Var.f47013a;
            org.telegram.ui.tm tmVar = cnVar.Vc;
            if (tmVar != null) {
                tmVar.h();
            }
            cnVar.H3 = false;
            cnVar.f46173r0 = false;
            cnVar.Pc(false);
            cnVar.qd();
        }
        jt0Var.X0 = false;
        jt0Var.setSearchItemVisibility(0);
        jt0Var.f36640j0.G(null, true);
        jt0Var.f36646l0.G(null, true);
        jt0Var.f36643k0.G(null, true);
        jt0Var.m0.F(null, true);
        vs0 vs0Var = jt0Var.V;
        if (vs0Var != null) {
            vs0Var.E(null, null);
        }
        jt0Var.X0(false);
        rh0 rh0Var = jt0Var.f36674v0;
        if (rh0Var != null) {
            rh0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(nr.h).start();
        }
        if (jt0Var.C0) {
            jt0Var.C0 = false;
        } else {
            jt0Var.B1(false);
        }
    }

    @Override
    public final void i() {
        boolean z10;
        jt0 jt0Var = this.f37971a;
        jt0Var.Y0 = true;
        cr0 cr0Var = jt0Var.M0;
        if (cr0Var != null) {
            if ((jt0Var.getSelectedTab() == 11 || jt0Var.getSelectedTab() == 12) && cr0Var.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            cr0Var.g(z10);
        }
        ImageView imageView = jt0Var.f36672u0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.q0 q0Var = jt0Var.f36656p0;
        if (q0Var != null) {
            q0Var.setVisibility(8);
        }
        jt0Var.setSearchItemVisibility(8);
        jt0Var.X0(true);
        rh0 rh0Var = jt0Var.f36674v0;
        if (rh0Var != null) {
            rh0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(nr.h).start();
        }
    }

    @Override
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        qr0 qr0Var = this.f37971a.W;
        if (qr0Var != null) {
            qr0Var.f47013a.L9();
        }
    }

    @Override
    public final void l(EditText editText) {
        boolean z10;
        vs0 vs0Var;
        String obj = editText.getText().toString();
        jt0 jt0Var = this.f37971a;
        qr0 qr0Var = jt0Var.W;
        if (qr0Var != null) {
            org.telegram.ui.cn cnVar = qr0Var.f47013a;
            org.telegram.ui.ActionBar.q0 q0Var = cnVar.f46085k0;
            if (q0Var != null) {
                cnVar.I3 = obj;
                q0Var.Q(obj, false);
            }
            if (TextUtils.isEmpty(obj) && jt0Var.Z0 == null) {
                org.telegram.ui.cn cnVar2 = qr0Var.f47013a;
                org.telegram.ui.tm tmVar = cnVar2.Vc;
                if (tmVar != null) {
                    tmVar.h();
                }
                cnVar2.H3 = false;
                cnVar2.f46173r0 = false;
                cnVar2.Pc(false);
                cnVar2.qd();
            }
        }
        jt0Var.setSearchItemVisibility(8);
        if (obj.length() == 0 && jt0Var.Z0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        jt0Var.X0 = z10;
        jt0Var.post(new cp0(this, 2));
        int i7 = jt0Var.f36651n0[0].F;
        if (i7 == 1) {
            gs0 gs0Var = jt0Var.f36640j0;
            if (gs0Var != null) {
                gs0Var.G(obj, true);
            }
        } else if (i7 == 3) {
            gs0 gs0Var2 = jt0Var.f36646l0;
            if (gs0Var2 != null) {
                gs0Var2.G(obj, true);
            }
        } else if (i7 == 4) {
            gs0 gs0Var3 = jt0Var.f36643k0;
            if (gs0Var3 != null) {
                gs0Var3.G(obj, true);
            }
        } else if (i7 == 7) {
            bs0 bs0Var = jt0Var.m0;
            if (bs0Var != null) {
                bs0Var.F(obj, true);
            }
        } else if (i7 == 11 && (vs0Var = jt0Var.V) != null) {
            vs0Var.E(jt0Var.Z0, obj);
        }
    }
}
