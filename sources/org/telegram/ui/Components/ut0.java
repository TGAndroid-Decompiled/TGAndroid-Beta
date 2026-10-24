package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public final class ut0 extends org.telegram.ui.ActionBar.k5 {
    public final wv0 f31222r;

    public ut0(wv0 wv0Var) {
        this.f31222r = wv0Var;
    }

    @Override
    public final void l() {
        org.telegram.ui.ActionBar.u0 u0Var = this.f31222r.f32391n0;
        u0Var.setTranslationX(((View) u0Var.getParent()).getMeasuredWidth() - u0Var.getRight());
    }

    @Override
    public final void m() {
        wv0 wv0Var = this.f31222r;
        jt0 jt0Var = wv0Var.J0;
        ImageView imageView = wv0Var.f32400r0;
        wv0Var.V0 = false;
        wv0Var.W0 = null;
        org.telegram.ui.ActionBar.u0 u0Var = wv0Var.m0;
        if (u0Var != null) {
            u0Var.setVisibility(0);
        }
        if (imageView != null && wv0Var.b0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (jt0Var != null) {
            jt0Var.d.M(new org.telegram.ui.zq(2));
            jt0Var.h = 0L;
            jt0Var.g(false);
        }
        cu0 cu0Var = wv0Var.T;
        if (cu0Var != null) {
            org.telegram.ui.tn tnVar = cu0Var.f42454a;
            org.telegram.ui.kn knVar = tnVar.Bc;
            if (knVar != null) {
                knVar.m();
            }
            tnVar.E3 = false;
            tnVar.f41620o0 = false;
            tnVar.oc(false);
            tnVar.Pc();
        }
        wv0Var.U0 = false;
        wv0Var.f32391n0.setVisibility(0);
        wv0Var.f32378g0.G(null, true);
        wv0Var.f32382i0.G(null, true);
        wv0Var.f32380h0.G(null, true);
        wv0Var.f32384j0.F(null, true);
        hv0 hv0Var = wv0Var.S;
        if (hv0Var != null) {
            hv0Var.E(null, null);
        }
        wv0Var.N0(false);
        ak0 ak0Var = wv0Var.f32403s0;
        if (ak0Var != null) {
            ak0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(zr.h).start();
        }
        if (wv0Var.f32420z0) {
            wv0Var.f32420z0 = false;
        } else {
            wv0Var.p1(false);
        }
    }

    @Override
    public final void n() {
        boolean z10;
        wv0 wv0Var = this.f31222r;
        wv0Var.V0 = true;
        jt0 jt0Var = wv0Var.J0;
        if (jt0Var != null) {
            if ((wv0Var.getSelectedTab() == 11 || wv0Var.getSelectedTab() == 12) && jt0Var.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            jt0Var.g(z10);
        }
        ImageView imageView = wv0Var.f32400r0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.u0 u0Var = wv0Var.m0;
        if (u0Var != null) {
            u0Var.setVisibility(8);
        }
        wv0Var.f32391n0.setVisibility(8);
        wv0Var.N0(true);
        ak0 ak0Var = wv0Var.f32403s0;
        if (ak0Var != null) {
            ak0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(zr.h).start();
        }
    }

    @Override
    public final void p(ei.e2 e2Var) {
        cu0 cu0Var = this.f31222r.T;
        if (cu0Var != null) {
            cu0Var.f42454a.r9();
        }
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        hv0 hv0Var;
        String obj = editText.getText().toString();
        wv0 wv0Var = this.f31222r;
        cu0 cu0Var = wv0Var.T;
        if (cu0Var != null) {
            org.telegram.ui.tn tnVar = cu0Var.f42454a;
            org.telegram.ui.ActionBar.u0 u0Var = tnVar.f41557j0;
            if (u0Var != null) {
                tnVar.F3 = obj;
                u0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && wv0Var.W0 == null) {
                org.telegram.ui.tn tnVar2 = cu0Var.f42454a;
                org.telegram.ui.kn knVar = tnVar2.Bc;
                if (knVar != null) {
                    knVar.m();
                }
                tnVar2.E3 = false;
                tnVar2.f41620o0 = false;
                tnVar2.oc(false);
                tnVar2.Pc();
            }
        }
        wv0Var.f32391n0.setVisibility(8);
        if (obj.length() == 0 && wv0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        wv0Var.U0 = z10;
        wv0Var.post(new jr0(this, 3));
        int i10 = wv0Var.f32386k0[0].F;
        if (i10 == 1) {
            su0 su0Var = wv0Var.f32378g0;
            if (su0Var != null) {
                su0Var.G(obj, true);
            }
        } else if (i10 == 3) {
            su0 su0Var2 = wv0Var.f32382i0;
            if (su0Var2 != null) {
                su0Var2.G(obj, true);
            }
        } else if (i10 == 4) {
            su0 su0Var3 = wv0Var.f32380h0;
            if (su0Var3 != null) {
                su0Var3.G(obj, true);
            }
        } else if (i10 == 7) {
            nu0 nu0Var = wv0Var.f32384j0;
            if (nu0Var != null) {
                nu0Var.F(obj, true);
            }
        } else if (i10 == 11 && (hv0Var = wv0Var.S) != null) {
            hv0Var.E(wv0Var.W0, obj);
        }
    }
}
