package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public final class jt0 extends org.telegram.ui.ActionBar.g5 {
    public final lv0 f25543f;

    public jt0(lv0 lv0Var) {
        this.f25543f = lv0Var;
    }

    @Override
    public final void l() {
        org.telegram.ui.ActionBar.w0 w0Var = this.f25543f.f26193n0;
        w0Var.setTranslationX(((View) w0Var.getParent()).getMeasuredWidth() - w0Var.getRight());
    }

    @Override
    public final void m() {
        lv0 lv0Var = this.f25543f;
        ys0 ys0Var = lv0Var.J0;
        ImageView imageView = lv0Var.f26202r0;
        lv0Var.V0 = false;
        lv0Var.W0 = null;
        org.telegram.ui.ActionBar.w0 w0Var = lv0Var.m0;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        if (imageView != null && lv0Var.a0(0.0f) > 0.5f) {
            imageView.setVisibility(0);
        }
        if (ys0Var != null) {
            ys0Var.d.N(new org.telegram.ui.gr(2));
            ys0Var.h = 0L;
            ys0Var.g(false);
        }
        rt0 rt0Var = lv0Var.T;
        if (rt0Var != null) {
            org.telegram.ui.yn ynVar = rt0Var.f40556a;
            org.telegram.ui.pn pnVar = ynVar.nc;
            if (pnVar != null) {
                pnVar.m();
            }
            ynVar.f39916s3 = false;
            ynVar.f39862o0 = false;
            ynVar.hc(false);
            ynVar.Ic();
        }
        lv0Var.U0 = false;
        lv0Var.f26193n0.setVisibility(0);
        lv0Var.f26180g0.G(null, true);
        lv0Var.f26184i0.G(null, true);
        lv0Var.f26182h0.G(null, true);
        lv0Var.f26186j0.F(null, true);
        wu0 wu0Var = lv0Var.S;
        if (wu0Var != null) {
            wu0Var.E(null, null);
        }
        lv0Var.K0(false);
        nj0 nj0Var = lv0Var.f26205s0;
        if (nj0Var != null) {
            nj0Var.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(sr.h).start();
        }
        if (lv0Var.f26222z0) {
            lv0Var.f26222z0 = false;
        } else {
            lv0Var.m1(false);
        }
    }

    @Override
    public final void n() {
        boolean z10;
        lv0 lv0Var = this.f25543f;
        lv0Var.V0 = true;
        ys0 ys0Var = lv0Var.J0;
        if (ys0Var != null) {
            if ((lv0Var.getSelectedTab() == 11 || lv0Var.getSelectedTab() == 12) && ys0Var.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ys0Var.g(z10);
        }
        ImageView imageView = lv0Var.f26202r0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        org.telegram.ui.ActionBar.w0 w0Var = lv0Var.m0;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        lv0Var.f26193n0.setVisibility(8);
        lv0Var.K0(true);
        nj0 nj0Var = lv0Var.f26205s0;
        if (nj0Var != null) {
            nj0Var.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(sr.h).start();
        }
    }

    @Override
    public final void p(ci.h2 h2Var) {
        rt0 rt0Var = this.f25543f.T;
        if (rt0Var != null) {
            rt0Var.f40556a.m9();
        }
    }

    @Override
    public final void q(EditText editText) {
        boolean z10;
        wu0 wu0Var;
        String obj = editText.getText().toString();
        lv0 lv0Var = this.f25543f;
        rt0 rt0Var = lv0Var.T;
        if (rt0Var != null) {
            org.telegram.ui.yn ynVar = rt0Var.f40556a;
            org.telegram.ui.ActionBar.w0 w0Var = ynVar.f39802j0;
            if (w0Var != null) {
                ynVar.f39929t3 = obj;
                w0Var.H(obj, false);
            }
            if (TextUtils.isEmpty(obj) && lv0Var.W0 == null) {
                org.telegram.ui.yn ynVar2 = rt0Var.f40556a;
                org.telegram.ui.pn pnVar = ynVar2.nc;
                if (pnVar != null) {
                    pnVar.m();
                }
                ynVar2.f39916s3 = false;
                ynVar2.f39862o0 = false;
                ynVar2.hc(false);
                ynVar2.Ic();
            }
        }
        lv0Var.f26193n0.setVisibility(8);
        if (obj.length() == 0 && lv0Var.W0 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        lv0Var.U0 = z10;
        lv0Var.post(new xq0(this, 3));
        int i10 = lv0Var.f26188k0[0].F;
        if (i10 == 1) {
            hu0 hu0Var = lv0Var.f26180g0;
            if (hu0Var != null) {
                hu0Var.G(obj, true);
            }
        } else if (i10 == 3) {
            hu0 hu0Var2 = lv0Var.f26184i0;
            if (hu0Var2 != null) {
                hu0Var2.G(obj, true);
            }
        } else if (i10 == 4) {
            hu0 hu0Var3 = lv0Var.f26182h0;
            if (hu0Var3 != null) {
                hu0Var3.G(obj, true);
            }
        } else if (i10 == 7) {
            cu0 cu0Var = lv0Var.f26186j0;
            if (cu0Var != null) {
                cu0Var.F(obj, true);
            }
        } else if (i10 == 11 && (wu0Var = lv0Var.S) != null) {
            wu0Var.E(lv0Var.W0, obj);
        }
    }
}
