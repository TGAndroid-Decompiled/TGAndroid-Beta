package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public final class qt0 extends org.telegram.ui.ActionBar.g5 {
    public final sv0 f29742r;

    public qt0(sv0 sv0Var) {
        this.f29742r = sv0Var;
    }

    @Override
    public final void l() {
        org.telegram.ui.ActionBar.u0 u0Var = this.f29742r.f30369n0;
        u0Var.setTranslationX(((View) u0Var.getParent()).getMeasuredWidth() - u0Var.getRight());
    }

    @Override
    public final void m() {
        sv0 sv0Var = this.f29742r;
        ft0 ft0Var = sv0Var.J0;
        ImageView imageView = sv0Var.f30378r0;
        sv0Var.V0 = false;
        sv0Var.W0 = null;
        org.telegram.ui.ActionBar.u0 u0Var = sv0Var.m0;
        if (u0Var != null) {
            u0Var.setVisibility(0);
        }
        if (imageView != null && sv0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (ft0Var != null) {
            ft0Var.d.M(new org.telegram.ui.zq(2));
            ft0Var.h = 0L;
            ft0Var.g(false);
        }
        yt0 yt0Var = sv0Var.T;
        if (yt0Var != null) {
            org.telegram.ui.tn tnVar = yt0Var.f42016a;
            org.telegram.ui.kn knVar = tnVar.oc;
            if (knVar != null) {
                knVar.m();
            }
            tnVar.f41371s3 = false;
            tnVar.f41319o0 = false;
            tnVar.lc(false);
            tnVar.Mc();
        }
        sv0Var.U0 = false;
        sv0Var.f30369n0.setVisibility(0);
        sv0Var.f30356g0.G(null, true);
        sv0Var.f30360i0.G(null, true);
        sv0Var.f30358h0.G(null, true);
        sv0Var.f30362j0.F(null, true);
        dv0 dv0Var = sv0Var.S;
        if (dv0Var != null) {
            dv0Var.E(null, null);
        }
        sv0Var.M0(false);
        xj0 xj0Var = sv0Var.f30381s0;
        if (xj0Var != null) {
            xj0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(bs.h).start();
        }
        if (sv0Var.f30398z0) {
            sv0Var.f30398z0 = false;
        } else {
            sv0Var.o1(false);
        }
    }

    @Override
    public final void n() {
        boolean z10;
        sv0 sv0Var = this.f29742r;
        sv0Var.V0 = true;
        ft0 ft0Var = sv0Var.J0;
        if (ft0Var != null) {
            if ((sv0Var.getSelectedTab() == 11 || sv0Var.getSelectedTab() == 12) && ft0Var.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ft0Var.g(z10);
        }
        ImageView imageView = sv0Var.f30378r0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.u0 u0Var = sv0Var.m0;
        if (u0Var != null) {
            u0Var.setVisibility(8);
        }
        sv0Var.f30369n0.setVisibility(8);
        sv0Var.M0(true);
        xj0 xj0Var = sv0Var.f30381s0;
        if (xj0Var != null) {
            xj0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(bs.h).start();
        }
    }

    @Override
    public final void p(ei.e2 e2Var) {
        yt0 yt0Var = this.f29742r.T;
        if (yt0Var != null) {
            yt0Var.f42016a.r9();
        }
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        dv0 dv0Var;
        String obj = editText.getText().toString();
        sv0 sv0Var = this.f29742r;
        yt0 yt0Var = sv0Var.T;
        if (yt0Var != null) {
            org.telegram.ui.tn tnVar = yt0Var.f42016a;
            org.telegram.ui.ActionBar.u0 u0Var = tnVar.f41256j0;
            if (u0Var != null) {
                tnVar.f41384t3 = obj;
                u0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && sv0Var.W0 == null) {
                org.telegram.ui.tn tnVar2 = yt0Var.f42016a;
                org.telegram.ui.kn knVar = tnVar2.oc;
                if (knVar != null) {
                    knVar.m();
                }
                tnVar2.f41371s3 = false;
                tnVar2.f41319o0 = false;
                tnVar2.lc(false);
                tnVar2.Mc();
            }
        }
        sv0Var.f30369n0.setVisibility(8);
        if (obj.length() == 0 && sv0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        sv0Var.U0 = z10;
        sv0Var.post(new fr0(this, 2));
        int i10 = sv0Var.f30364k0[0].F;
        if (i10 == 1) {
            ou0 ou0Var = sv0Var.f30356g0;
            if (ou0Var != null) {
                ou0Var.G(obj, true);
            }
        } else if (i10 == 3) {
            ou0 ou0Var2 = sv0Var.f30360i0;
            if (ou0Var2 != null) {
                ou0Var2.G(obj, true);
            }
        } else if (i10 == 4) {
            ou0 ou0Var3 = sv0Var.f30358h0;
            if (ou0Var3 != null) {
                ou0Var3.G(obj, true);
            }
        } else if (i10 == 7) {
            ju0 ju0Var = sv0Var.f30362j0;
            if (ju0Var != null) {
                ju0Var.F(obj, true);
            }
        } else if (i10 == 11 && (dv0Var = sv0Var.S) != null) {
            dv0Var.E(sv0Var.W0, obj);
        }
    }
}
