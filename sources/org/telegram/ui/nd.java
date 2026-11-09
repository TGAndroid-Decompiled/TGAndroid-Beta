package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
public final class nd implements TextView.OnEditorActionListener {
    public final int f48162a;
    public final Object f48163b;
    public final Object f48164c;

    public nd(int i7, Object obj, Object obj2) {
        this.f48162a = i7;
        this.f48163b = obj;
        this.f48164c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        v4.d1 T;
        int b10;
        v4.d1 T2;
        int b11;
        switch (this.f48162a) {
            case 0:
                zd zdVar = (zd) this.f48163b;
                d51 d51Var = (d51) this.f48164c;
                if (i7 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    id idVar = new id(zdVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.f42062b0 = idVar;
                    zdVar.G0.setLoading(true);
                    twoStepVerificationActivity.x0(new jd(zdVar, d51Var, twoStepVerificationActivity, 1));
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.f48163b;
                hi.n1 n1Var = (hi.n1) this.f48164c;
                if ((i7 != 6 && keyEvent.getKeyCode() != 66) || !u1Var.isShowing()) {
                    return false;
                }
                n1Var.g(u1Var, 0);
                return true;
            case 2:
                org.telegram.ui.Components.zm zmVar = (org.telegram.ui.Components.zm) this.f48164c;
                org.telegram.ui.Components.bn bnVar = (org.telegram.ui.Components.bn) ((l4) this.f48163b).f47458e;
                f61 f61Var = bnVar.f32319s;
                if (i7 == 5) {
                    View F = f61Var.F(zmVar);
                    if (F == null) {
                        T = null;
                    } else {
                        T = f61Var.T(F);
                    }
                    if (T == null || (b10 = T.b()) == -1) {
                        return true;
                    }
                    int i10 = b10 - bnVar.f32321t0;
                    int i11 = bnVar.M;
                    int i12 = i11 - 1;
                    if (i10 == i12 && i11 < bnVar.J) {
                        bnVar.T();
                        return true;
                    } else if (i10 == i12) {
                        org.telegram.messenger.g0.v1(zmVar.getTextView());
                        return true;
                    } else {
                        v4.d1 K = f61Var.K(b10 + 1);
                        if (K == null) {
                            return true;
                        }
                        View view = K.f57056a;
                        if (!(view instanceof org.telegram.ui.Cells.a6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.a6) view).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
            default:
                or0 or0Var = (or0) this.f48164c;
                rr0 rr0Var = ((pr0) this.f48163b).d;
                if (i7 == 5) {
                    f61 f61Var2 = rr0Var.f49569c;
                    View F2 = f61Var2.F(or0Var);
                    if (F2 == null) {
                        T2 = null;
                    } else {
                        T2 = f61Var2.T(F2);
                    }
                    if (T2 == null || (b11 = T2.b()) == -1) {
                        return true;
                    }
                    int i13 = b11 - rr0Var.f49583n0;
                    int i14 = rr0Var.D;
                    int i15 = i14 - 1;
                    if (i13 == i15 && i14 < rr0Var.f49582n) {
                        rr0Var.k0();
                        return true;
                    } else if (i13 == i15) {
                        org.telegram.messenger.g0.v1(or0Var.getTextView());
                        return true;
                    } else {
                        v4.d1 K2 = rr0Var.f49569c.K(b11 + 1);
                        if (K2 == null) {
                            return true;
                        }
                        View view2 = K2.f57056a;
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
