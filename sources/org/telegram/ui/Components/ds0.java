package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public final class ds0 extends org.telegram.ui.ActionBar.e5 {

    public final hu0 f27839f;

    public ds0(hu0 hu0Var) {
        this.f27839f = hu0Var;
    }

    @Override
    public final void l() {
        org.telegram.ui.ActionBar.v0 v0Var = this.f27839f.f29128j0;
        v0Var.setTranslationX(((View) v0Var.getParent()).getMeasuredWidth() - v0Var.getRight());
    }

    @Override
    public final void m() {
        hu0 hu0Var = this.f27839f;
        sr0 sr0Var = hu0Var.F0;
        ImageView imageView = hu0Var.f29135n0;
        hu0Var.R0 = false;
        hu0Var.S0 = null;
        org.telegram.ui.ActionBar.v0 v0Var = hu0Var.f29126i0;
        if (v0Var != null) {
            v0Var.setVisibility(0);
        }
        if (imageView != null && hu0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (sr0Var != null) {
            sr0Var.d.M(new org.telegram.ui.ar(2));
            sr0Var.h = 0L;
            sr0Var.g(false);
        }
        ms0 ms0Var = hu0Var.P;
        if (ms0Var != null) {
            org.telegram.ui.sn snVar = ms0Var.f42977a;
            org.telegram.ui.jn jnVar = snVar.kc;
            if (jnVar != null) {
                jnVar.m();
            }
            snVar.f42154o3 = false;
            snVar.f42103k0 = false;
            snVar.hc(false);
            snVar.Ic();
        }
        hu0Var.Q0 = false;
        hu0Var.f29128j0.setVisibility(0);
        hu0Var.f29112c0.G(null, true);
        hu0Var.f29117e0.G(null, true);
        hu0Var.f29114d0.G(null, true);
        hu0Var.f29120f0.F(null, true);
        st0 st0Var = hu0Var.O;
        if (st0Var != null) {
            st0Var.E(null, null);
        }
        hu0Var.K0(false);
        ri0 ri0Var = hu0Var.f29137o0;
        if (ri0Var != null) {
            ri0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(er.h).start();
        }
        if (hu0Var.f29153v0) {
            hu0Var.f29153v0 = false;
        } else {
            hu0Var.m1(false);
        }
    }

    @Override
    public final void n() {
        hu0 hu0Var = this.f27839f;
        hu0Var.R0 = true;
        sr0 sr0Var = hu0Var.F0;
        if (sr0Var != null) {
            sr0Var.g((hu0Var.getSelectedTab() == 11 || hu0Var.getSelectedTab() == 12) && sr0Var.a());
        }
        ImageView imageView = hu0Var.f29135n0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.v0 v0Var = hu0Var.f29126i0;
        if (v0Var != null) {
            v0Var.setVisibility(8);
        }
        hu0Var.f29128j0.setVisibility(8);
        hu0Var.K0(true);
        ri0 ri0Var = hu0Var.f29137o0;
        if (ri0Var != null) {
            ri0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(er.h).start();
        }
    }

    @Override
    public final void p(gg.g gVar) {
        ms0 ms0Var = this.f27839f.P;
        if (ms0Var != null) {
            ms0Var.f42977a.m9();
        }
    }

    @Override
    public final void q(EditText editText) {
        st0 st0Var;
        String string = editText.getText().toString();
        hu0 hu0Var = this.f27839f;
        ms0 ms0Var = hu0Var.P;
        if (ms0Var != null) {
            org.telegram.ui.sn snVar = ms0Var.f42977a;
            org.telegram.ui.ActionBar.v0 v0Var = snVar.f42040f0;
            if (v0Var != null) {
                snVar.f42167p3 = string;
                v0Var.H(string, false);
            }
            if (TextUtils.isEmpty(string) && hu0Var.S0 == null) {
                org.telegram.ui.sn snVar2 = ms0Var.f42977a;
                org.telegram.ui.jn jnVar = snVar2.kc;
                if (jnVar != null) {
                    jnVar.m();
                }
                snVar2.f42154o3 = false;
                snVar2.f42103k0 = false;
                snVar2.hc(false);
                snVar2.Ic();
            }
        }
        hu0Var.f29128j0.setVisibility(8);
        hu0Var.Q0 = (string.length() == 0 && hu0Var.S0 == null) ? false : true;
        hu0Var.post(new up0(this, 2));
        int i10 = hu0Var.f29122g0[0].B;
        if (i10 == 1) {
            ct0 ct0Var = hu0Var.f29112c0;
            if (ct0Var == null) {
                return;
            }
            ct0Var.G(string, true);
            return;
        }
        if (i10 == 3) {
            ct0 ct0Var2 = hu0Var.f29117e0;
            if (ct0Var2 == null) {
                return;
            }
            ct0Var2.G(string, true);
            return;
        }
        if (i10 == 4) {
            ct0 ct0Var3 = hu0Var.f29114d0;
            if (ct0Var3 == null) {
                return;
            }
            ct0Var3.G(string, true);
            return;
        }
        if (i10 == 7) {
            xs0 xs0Var = hu0Var.f29120f0;
            if (xs0Var == null) {
                return;
            }
            xs0Var.F(string, true);
            return;
        }
        if (i10 != 11 || (st0Var = hu0Var.O) == null) {
            return;
        }
        st0Var.E(hu0Var.S0, string);
    }
}
