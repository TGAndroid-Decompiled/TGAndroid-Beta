package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public final class ns0 extends org.telegram.ui.ActionBar.e5 {
    public final qu0 f31131f;

    public ns0(qu0 qu0Var) {
        this.f31131f = qu0Var;
    }

    @Override
    public final void l() {
        org.telegram.ui.ActionBar.w0 w0Var = this.f31131f.f32076j0;
        w0Var.setTranslationX(((View) w0Var.getParent()).getMeasuredWidth() - w0Var.getRight());
    }

    @Override
    public final void m() {
        qu0 qu0Var = this.f31131f;
        cs0 cs0Var = qu0Var.F0;
        ImageView imageView = qu0Var.f32083n0;
        qu0Var.R0 = false;
        qu0Var.S0 = null;
        org.telegram.ui.ActionBar.w0 w0Var = qu0Var.f32074i0;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        if (imageView != null && qu0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (cs0Var != null) {
            cs0Var.d.M(new org.telegram.ui.zq(2));
            cs0Var.h = 0L;
            cs0Var.g(false);
        }
        vs0 vs0Var = qu0Var.P;
        if (vs0Var != null) {
            org.telegram.ui.un unVar = vs0Var.f43683a;
            org.telegram.ui.ln lnVar = unVar.f42875kc;
            if (lnVar != null) {
                lnVar.m();
            }
            unVar.f42915o3 = false;
            unVar.f42864k0 = false;
            unVar.hc(false);
            unVar.Ic();
        }
        qu0Var.Q0 = false;
        qu0Var.f32076j0.setVisibility(0);
        qu0Var.f32060c0.G(null, true);
        qu0Var.f32065e0.G(null, true);
        qu0Var.f32062d0.G(null, true);
        qu0Var.f32068f0.F(null, true);
        bu0 bu0Var = qu0Var.O;
        if (bu0Var != null) {
            bu0Var.E(null, null);
        }
        qu0Var.K0(false);
        aj0 aj0Var = qu0Var.f32085o0;
        if (aj0Var != null) {
            aj0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(jr.h).start();
        }
        if (qu0Var.f32101v0) {
            qu0Var.f32101v0 = false;
        } else {
            qu0Var.m1(false);
        }
    }

    @Override
    public final void n() {
        boolean z10;
        qu0 qu0Var = this.f31131f;
        qu0Var.R0 = true;
        cs0 cs0Var = qu0Var.F0;
        if (cs0Var != null) {
            if ((qu0Var.getSelectedTab() == 11 || qu0Var.getSelectedTab() == 12) && cs0Var.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            cs0Var.g(z10);
        }
        ImageView imageView = qu0Var.f32083n0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.w0 w0Var = qu0Var.f32074i0;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        qu0Var.f32076j0.setVisibility(8);
        qu0Var.K0(true);
        aj0 aj0Var = qu0Var.f32085o0;
        if (aj0Var != null) {
            aj0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(jr.h).start();
        }
    }

    @Override
    public final void p(ig.f fVar) {
        vs0 vs0Var = this.f31131f.P;
        if (vs0Var != null) {
            vs0Var.f43683a.m9();
        }
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        bu0 bu0Var;
        String obj = editText.getText().toString();
        qu0 qu0Var = this.f31131f;
        vs0 vs0Var = qu0Var.P;
        if (vs0Var != null) {
            org.telegram.ui.un unVar = vs0Var.f43683a;
            org.telegram.ui.ActionBar.w0 w0Var = unVar.f42802f0;
            if (w0Var != null) {
                unVar.f42927p3 = obj;
                w0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && qu0Var.S0 == null) {
                org.telegram.ui.un unVar2 = vs0Var.f43683a;
                org.telegram.ui.ln lnVar = unVar2.f42875kc;
                if (lnVar != null) {
                    lnVar.m();
                }
                unVar2.f42915o3 = false;
                unVar2.f42864k0 = false;
                unVar2.hc(false);
                unVar2.Ic();
            }
        }
        qu0Var.f32076j0.setVisibility(8);
        if (obj.length() == 0 && qu0Var.S0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        qu0Var.Q0 = z10;
        qu0Var.post(new fq0(this, 2));
        int i10 = qu0Var.f32070g0[0].B;
        if (i10 == 1) {
            lt0 lt0Var = qu0Var.f32060c0;
            if (lt0Var != null) {
                lt0Var.G(obj, true);
            }
        } else if (i10 == 3) {
            lt0 lt0Var2 = qu0Var.f32065e0;
            if (lt0Var2 != null) {
                lt0Var2.G(obj, true);
            }
        } else if (i10 == 4) {
            lt0 lt0Var3 = qu0Var.f32062d0;
            if (lt0Var3 != null) {
                lt0Var3.G(obj, true);
            }
        } else if (i10 == 7) {
            gt0 gt0Var = qu0Var.f32068f0;
            if (gt0Var != null) {
                gt0Var.F(obj, true);
            }
        } else if (i10 == 11 && (bu0Var = qu0Var.O) != null) {
            bu0Var.E(qu0Var.S0, obj);
        }
    }
}
