package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
public final class nd implements TextView.OnEditorActionListener {
    public final int f48190a;
    public final Object f48191b;
    public final Object f48192c;

    public nd(int i7, Object obj, Object obj2) {
        this.f48190a = i7;
        this.f48191b = obj;
        this.f48192c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        v4.d1 T;
        int b10;
        v4.d1 T2;
        int b11;
        switch (this.f48190a) {
            case 0:
                zd zdVar = (zd) this.f48191b;
                e51 e51Var = (e51) this.f48192c;
                if (i7 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    id idVar = new id(zdVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.f42053b0 = idVar;
                    zdVar.G0.setLoading(true);
                    twoStepVerificationActivity.x0(new jd(zdVar, e51Var, twoStepVerificationActivity, 1));
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.f48191b;
                hi.n1 n1Var = (hi.n1) this.f48192c;
                if ((i7 != 6 && keyEvent.getKeyCode() != 66) || !u1Var.isShowing()) {
                    return false;
                }
                n1Var.g(u1Var, 0);
                return true;
            case 2:
                org.telegram.ui.Components.ym ymVar = (org.telegram.ui.Components.ym) this.f48192c;
                org.telegram.ui.Components.an anVar = (org.telegram.ui.Components.an) ((l4) this.f48191b).f47512e;
                g61 g61Var = anVar.f31922s;
                if (i7 == 5) {
                    View F = g61Var.F(ymVar);
                    if (F == null) {
                        T = null;
                    } else {
                        T = g61Var.T(F);
                    }
                    if (T == null || (b10 = T.b()) == -1) {
                        return true;
                    }
                    int i10 = b10 - anVar.f31924t0;
                    int i11 = anVar.M;
                    int i12 = i11 - 1;
                    if (i10 == i12 && i11 < anVar.J) {
                        anVar.T();
                        return true;
                    } else if (i10 == i12) {
                        org.telegram.messenger.g0.v1(ymVar.getTextView());
                        return true;
                    } else {
                        v4.d1 K = g61Var.K(b10 + 1);
                        if (K == null) {
                            return true;
                        }
                        View view = K.f57052a;
                        if (!(view instanceof org.telegram.ui.Cells.a6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.a6) view).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
            default:
                pr0 pr0Var = (pr0) this.f48192c;
                sr0 sr0Var = ((qr0) this.f48191b).d;
                if (i7 == 5) {
                    g61 g61Var2 = sr0Var.f49923c;
                    View F2 = g61Var2.F(pr0Var);
                    if (F2 == null) {
                        T2 = null;
                    } else {
                        T2 = g61Var2.T(F2);
                    }
                    if (T2 == null || (b11 = T2.b()) == -1) {
                        return true;
                    }
                    int i13 = b11 - sr0Var.f49937n0;
                    int i14 = sr0Var.D;
                    int i15 = i14 - 1;
                    if (i13 == i15 && i14 < sr0Var.f49936n) {
                        sr0Var.k0();
                        return true;
                    } else if (i13 == i15) {
                        org.telegram.messenger.g0.v1(pr0Var.getTextView());
                        return true;
                    } else {
                        v4.d1 K2 = sr0Var.f49923c.K(b11 + 1);
                        if (K2 == null) {
                            return true;
                        }
                        View view2 = K2.f57052a;
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
