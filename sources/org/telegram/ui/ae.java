package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ae implements TextView.OnEditorActionListener {
    public final int f35768a;
    public final Object f35769b;
    public final Object f35770c;

    public ae(int i10, Object obj, Object obj2) {
        this.f35768a = i10;
        this.f35769b = obj;
        this.f35770c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        s4.d1 T;
        int b10;
        s4.d1 T2;
        int b11;
        switch (this.f35768a) {
            case 0:
                oe oeVar = (oe) this.f35769b;
                db1 db1Var = (db1) this.f35770c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    wd wdVar = new wd(oeVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.f34412b0 = wdVar;
                    oeVar.Q0.setLoading(true);
                    twoStepVerificationActivity.s0(new xd(oeVar, db1Var, twoStepVerificationActivity, 1));
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.f35769b;
                ei.u1 u1Var = (ei.u1) this.f35770c;
                if ((i10 != 6 && keyEvent.getKeyCode() != 66) || !a2Var.isShowing()) {
                    return false;
                }
                u1Var.f(a2Var, 0);
                return true;
            case 2:
                org.telegram.ui.Components.ko koVar = (org.telegram.ui.Components.ko) this.f35770c;
                org.telegram.ui.Components.no noVar = ((org.telegram.ui.Components.lo) this.f35769b).d;
                hc1 hc1Var = noVar.f28907s;
                if (i10 == 5) {
                    View F = hc1Var.F(koVar);
                    if (F == null) {
                        T = null;
                    } else {
                        T = hc1Var.T(F);
                    }
                    if (T == null || (b10 = T.b()) == -1) {
                        return true;
                    }
                    int i11 = b10 - noVar.f28909t0;
                    int i12 = noVar.M;
                    int i13 = i12 - 1;
                    if (i11 == i13 && i12 < noVar.J) {
                        noVar.S();
                        return true;
                    } else if (i11 == i13) {
                        AndroidUtilities.hideKeyboard(koVar.getTextView());
                        return true;
                    } else {
                        s4.d1 K = hc1Var.K(b10 + 1);
                        if (K == null) {
                            return true;
                        }
                        View view = K.f47897a;
                        if (!(view instanceof org.telegram.ui.Cells.d6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.d6) view).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
            default:
                zv0 zv0Var = (zv0) this.f35770c;
                cw0 cw0Var = ((aw0) this.f35769b).d;
                if (i10 == 5) {
                    hc1 hc1Var2 = cw0Var.f36544c;
                    View F2 = hc1Var2.F(zv0Var);
                    if (F2 == null) {
                        T2 = null;
                    } else {
                        T2 = hc1Var2.T(F2);
                    }
                    if (T2 == null || (b11 = T2.b()) == -1) {
                        return true;
                    }
                    int i14 = b11 - cw0Var.f36558n0;
                    int i15 = cw0Var.f36573y;
                    int i16 = i15 - 1;
                    if (i14 == i16 && i15 < cw0Var.f36557n) {
                        cw0Var.f0();
                        return true;
                    } else if (i14 == i16) {
                        AndroidUtilities.hideKeyboard(zv0Var.getTextView());
                        return true;
                    } else {
                        s4.d1 K2 = cw0Var.f36544c.K(b11 + 1);
                        if (K2 == null) {
                            return true;
                        }
                        View view2 = K2.f47897a;
                        if (!(view2 instanceof org.telegram.ui.Cells.d6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.d6) view2).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
        }
    }
}
