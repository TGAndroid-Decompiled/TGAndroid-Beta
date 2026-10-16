package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public final class vt0 extends org.telegram.ui.ActionBar.e5 {
    public final xv0 f30317f;

    public vt0(xv0 xv0Var) {
        this.f30317f = xv0Var;
    }

    @Override
    public final void l() {
        org.telegram.ui.ActionBar.u0 u0Var = this.f30317f.f31050n0;
        u0Var.setTranslationX(((View) u0Var.getParent()).getMeasuredWidth() - u0Var.getRight());
    }

    @Override
    public final void m() {
        xv0 xv0Var = this.f30317f;
        kt0 kt0Var = xv0Var.J0;
        ImageView imageView = xv0Var.f31059r0;
        xv0Var.V0 = false;
        xv0Var.W0 = null;
        org.telegram.ui.ActionBar.u0 u0Var = xv0Var.m0;
        if (u0Var != null) {
            u0Var.setVisibility(0);
        }
        if (imageView != null && xv0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (kt0Var != null) {
            kt0Var.d.M(new org.telegram.ui.or(2));
            kt0Var.h = 0L;
            kt0Var.g(false);
        }
        du0 du0Var = xv0Var.T;
        if (du0Var != null) {
            org.telegram.ui.go goVar = du0Var.f36617a;
            org.telegram.ui.wn wnVar = goVar.oc;
            if (wnVar != null) {
                wnVar.m();
            }
            goVar.f35799s3 = false;
            goVar.f35747o0 = false;
            goVar.lc(false);
            goVar.Mc();
        }
        xv0Var.U0 = false;
        xv0Var.f31050n0.setVisibility(0);
        xv0Var.f31037g0.G(null, true);
        xv0Var.f31041i0.G(null, true);
        xv0Var.f31039h0.G(null, true);
        xv0Var.f31043j0.F(null, true);
        iv0 iv0Var = xv0Var.S;
        if (iv0Var != null) {
            iv0Var.E(null, null);
        }
        xv0Var.L0(false);
        bk0 bk0Var = xv0Var.f31062s0;
        if (bk0Var != null) {
            bk0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(es.h).start();
        }
        if (xv0Var.f31079z0) {
            xv0Var.f31079z0 = false;
        } else {
            xv0Var.n1(false);
        }
    }

    @Override
    public final void n() {
        boolean z10;
        xv0 xv0Var = this.f30317f;
        xv0Var.V0 = true;
        kt0 kt0Var = xv0Var.J0;
        if (kt0Var != null) {
            if ((xv0Var.getSelectedTab() == 11 || xv0Var.getSelectedTab() == 12) && kt0Var.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            kt0Var.g(z10);
        }
        ImageView imageView = xv0Var.f31059r0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.u0 u0Var = xv0Var.m0;
        if (u0Var != null) {
            u0Var.setVisibility(8);
        }
        xv0Var.f31050n0.setVisibility(8);
        xv0Var.L0(true);
        bk0 bk0Var = xv0Var.f31062s0;
        if (bk0Var != null) {
            bk0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(es.h).start();
        }
    }

    @Override
    public final void p(di.g2 g2Var) {
        du0 du0Var = this.f30317f.T;
        if (du0Var != null) {
            du0Var.f36617a.r9();
        }
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        iv0 iv0Var;
        String obj = editText.getText().toString();
        xv0 xv0Var = this.f30317f;
        du0 du0Var = xv0Var.T;
        if (du0Var != null) {
            org.telegram.ui.go goVar = du0Var.f36617a;
            org.telegram.ui.ActionBar.u0 u0Var = goVar.f35684j0;
            if (u0Var != null) {
                goVar.f35812t3 = obj;
                u0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && xv0Var.W0 == null) {
                org.telegram.ui.go goVar2 = du0Var.f36617a;
                org.telegram.ui.wn wnVar = goVar2.oc;
                if (wnVar != null) {
                    wnVar.m();
                }
                goVar2.f35799s3 = false;
                goVar2.f35747o0 = false;
                goVar2.lc(false);
                goVar2.Mc();
            }
        }
        xv0Var.f31050n0.setVisibility(8);
        if (obj.length() == 0 && xv0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        xv0Var.U0 = z10;
        xv0Var.post(new kr0(this, 3));
        int i10 = xv0Var.f31045k0[0].F;
        if (i10 == 1) {
            tu0 tu0Var = xv0Var.f31037g0;
            if (tu0Var != null) {
                tu0Var.G(obj, true);
            }
        } else if (i10 == 3) {
            tu0 tu0Var2 = xv0Var.f31041i0;
            if (tu0Var2 != null) {
                tu0Var2.G(obj, true);
            }
        } else if (i10 == 4) {
            tu0 tu0Var3 = xv0Var.f31039h0;
            if (tu0Var3 != null) {
                tu0Var3.G(obj, true);
            }
        } else if (i10 == 7) {
            ou0 ou0Var = xv0Var.f31043j0;
            if (ou0Var != null) {
                ou0Var.F(obj, true);
            }
        } else if (i10 == 11 && (iv0Var = xv0Var.S) != null) {
            iv0Var.E(xv0Var.W0, obj);
        }
    }
}
