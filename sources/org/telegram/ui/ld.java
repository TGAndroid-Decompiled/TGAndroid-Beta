package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
public final class ld implements TextView.OnEditorActionListener {
    public final int f49573a;
    public final Object f49574b;
    public final Object f49575c;

    public ld(int i7, Object obj, Object obj2) {
        this.f49573a = i7;
        this.f49574b = obj;
        this.f49575c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        v4.f1 T;
        int b10;
        v4.f1 T2;
        int b11;
        switch (this.f49573a) {
            case 0:
                xd xdVar = (xd) this.f49574b;
                c51 c51Var = (c51) this.f49575c;
                if (i7 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    hd hdVar = new hd(xdVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.f43872a0 = 1;
                    twoStepVerificationActivity.f43876c0 = hdVar;
                    xdVar.H0.setLoading(true);
                    twoStepVerificationActivity.x0(new id(xdVar, c51Var, twoStepVerificationActivity, 1));
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.f49574b;
                ki.m1 m1Var = (ki.m1) this.f49575c;
                if ((i7 != 6 && keyEvent.getKeyCode() != 66) || !u1Var.isShowing()) {
                    return false;
                }
                m1Var.h(u1Var, 0);
                return true;
            case 2:
                org.telegram.ui.Components.pn pnVar = (org.telegram.ui.Components.pn) this.f49575c;
                org.telegram.ui.Components.rn rnVar = (org.telegram.ui.Components.rn) ((l4) this.f49574b).f49426e;
                f61 f61Var = rnVar.f39242s;
                if (i7 == 5) {
                    View F = f61Var.F(pnVar);
                    if (F == null) {
                        T = null;
                    } else {
                        T = f61Var.T(F);
                    }
                    if (T == null || (b10 = T.b()) == -1) {
                        return true;
                    }
                    int i10 = b10 - rnVar.f39245u0;
                    int i11 = rnVar.N;
                    int i12 = i11 - 1;
                    if (i10 == i12 && i11 < rnVar.K) {
                        rnVar.U();
                        return true;
                    } else if (i10 == i12) {
                        org.telegram.messenger.g0.v1(pnVar.getTextView());
                        return true;
                    } else {
                        v4.f1 K = f61Var.K(b10 + 1);
                        if (K == null) {
                            return true;
                        }
                        View view = K.f59122a;
                        if (!(view instanceof org.telegram.ui.Cells.a6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.a6) view).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
            default:
                mr0 mr0Var = (mr0) this.f49575c;
                pr0 pr0Var = ((nr0) this.f49574b).d;
                if (i7 == 5) {
                    f61 f61Var2 = pr0Var.f50967c;
                    View F2 = f61Var2.F(mr0Var);
                    if (F2 == null) {
                        T2 = null;
                    } else {
                        T2 = f61Var2.T(F2);
                    }
                    if (T2 == null || (b11 = T2.b()) == -1) {
                        return true;
                    }
                    int i13 = b11 - pr0Var.f50982o0;
                    int i14 = pr0Var.E;
                    int i15 = i14 - 1;
                    if (i13 == i15 && i14 < pr0Var.f50980n) {
                        pr0Var.k0();
                        return true;
                    } else if (i13 == i15) {
                        org.telegram.messenger.g0.v1(mr0Var.getTextView());
                        return true;
                    } else {
                        v4.f1 K2 = pr0Var.f50967c.K(b11 + 1);
                        if (K2 == null) {
                            return true;
                        }
                        View view2 = K2.f59122a;
                        if (!(view2 instanceof org.telegram.ui.Cells.a6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.a6) view2).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
        }
    }
}
