package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public final class ft0 extends org.telegram.ui.ActionBar.i5 {
    public final iv0 f23081f;

    public ft0(iv0 iv0Var) {
        this.f23081f = iv0Var;
    }

    @Override
    public final void l() {
        org.telegram.ui.ActionBar.w0 w0Var = this.f23081f.f24112n0;
        w0Var.setTranslationX(((View) w0Var.getParent()).getMeasuredWidth() - w0Var.getRight());
    }

    @Override
    public final void m() {
        iv0 iv0Var = this.f23081f;
        us0 us0Var = iv0Var.J0;
        ImageView imageView = iv0Var.f24121r0;
        iv0Var.V0 = false;
        iv0Var.W0 = null;
        org.telegram.ui.ActionBar.w0 w0Var = iv0Var.m0;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        if (imageView != null && iv0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (us0Var != null) {
            us0Var.d.M(new org.telegram.ui.mr(2));
            us0Var.h = 0L;
            us0Var.g(false);
        }
        nt0 nt0Var = iv0Var.T;
        if (nt0Var != null) {
            org.telegram.ui.fo foVar = nt0Var.f33142a;
            org.telegram.ui.vn vnVar = foVar.f32438oc;
            if (vnVar != null) {
                vnVar.m();
            }
            foVar.f32481s3 = false;
            foVar.f32427o0 = false;
            foVar.hc(false);
            foVar.Ic();
        }
        iv0Var.U0 = false;
        iv0Var.f24112n0.setVisibility(0);
        iv0Var.f24099g0.G(null, true);
        iv0Var.f24103i0.G(null, true);
        iv0Var.f24101h0.G(null, true);
        iv0Var.f24105j0.F(null, true);
        tu0 tu0Var = iv0Var.S;
        if (tu0Var != null) {
            tu0Var.E(null, null);
        }
        iv0Var.K0(false);
        kj0 kj0Var = iv0Var.f24124s0;
        if (kj0Var != null) {
            kj0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(wr.h).start();
        }
        if (iv0Var.f24141z0) {
            iv0Var.f24141z0 = false;
        } else {
            iv0Var.m1(false);
        }
    }

    @Override
    public final void n() {
        boolean z10;
        iv0 iv0Var = this.f23081f;
        iv0Var.V0 = true;
        us0 us0Var = iv0Var.J0;
        if (us0Var != null) {
            if ((iv0Var.getSelectedTab() == 11 || iv0Var.getSelectedTab() == 12) && us0Var.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            us0Var.g(z10);
        }
        ImageView imageView = iv0Var.f24121r0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.w0 w0Var = iv0Var.m0;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        iv0Var.f24112n0.setVisibility(8);
        iv0Var.K0(true);
        kj0 kj0Var = iv0Var.f24124s0;
        if (kj0Var != null) {
            kj0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(wr.h).start();
        }
    }

    @Override
    public final void p(bi.t2 t2Var) {
        nt0 nt0Var = this.f23081f.T;
        if (nt0Var != null) {
            nt0Var.f33142a.m9();
        }
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        tu0 tu0Var;
        String obj = editText.getText().toString();
        iv0 iv0Var = this.f23081f;
        nt0 nt0Var = iv0Var.T;
        if (nt0Var != null) {
            org.telegram.ui.fo foVar = nt0Var.f33142a;
            org.telegram.ui.ActionBar.w0 w0Var = foVar.f32367j0;
            if (w0Var != null) {
                foVar.f32494t3 = obj;
                w0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && iv0Var.W0 == null) {
                org.telegram.ui.fo foVar2 = nt0Var.f33142a;
                org.telegram.ui.vn vnVar = foVar2.f32438oc;
                if (vnVar != null) {
                    vnVar.m();
                }
                foVar2.f32481s3 = false;
                foVar2.f32427o0 = false;
                foVar2.hc(false);
                foVar2.Ic();
            }
        }
        iv0Var.f24112n0.setVisibility(8);
        if (obj.length() == 0 && iv0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        iv0Var.U0 = z10;
        iv0Var.post(new uq0(this, 2));
        int i10 = iv0Var.f24107k0[0].F;
        if (i10 == 1) {
            du0 du0Var = iv0Var.f24099g0;
            if (du0Var != null) {
                du0Var.G(obj, true);
            }
        } else if (i10 == 3) {
            du0 du0Var2 = iv0Var.f24103i0;
            if (du0Var2 != null) {
                du0Var2.G(obj, true);
            }
        } else if (i10 == 4) {
            du0 du0Var3 = iv0Var.f24101h0;
            if (du0Var3 != null) {
                du0Var3.G(obj, true);
            }
        } else if (i10 == 7) {
            yt0 yt0Var = iv0Var.f24105j0;
            if (yt0Var != null) {
                yt0Var.F(obj, true);
            }
        } else if (i10 == 11 && (tu0Var = iv0Var.S) != null) {
            tu0Var.E(iv0Var.W0, obj);
        }
    }
}
