package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ce implements TextView.OnEditorActionListener {
    public final int f34572a;
    public final Object f34573b;
    public final Object f34574c;

    public ce(int i10, Object obj, Object obj2) {
        this.f34572a = i10;
        this.f34573b = obj;
        this.f34574c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        s4.b1 T;
        int b10;
        s4.b1 T2;
        int b11;
        switch (this.f34572a) {
            case 0:
                qe qeVar = (qe) this.f34573b;
                hb1 hb1Var = (hb1) this.f34574c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    yd ydVar = new yd(qeVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.f32584b0 = ydVar;
                    qeVar.Q0.setLoading(true);
                    twoStepVerificationActivity.s0(new zd(qeVar, hb1Var, twoStepVerificationActivity, 1));
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.f34573b;
                fi.t1 t1Var = (fi.t1) this.f34574c;
                if ((i10 != 6 && keyEvent.getKeyCode() != 66) || !a2Var.isShowing()) {
                    return false;
                }
                t1Var.g(a2Var, 0);
                return true;
            case 2:
                org.telegram.ui.Components.fo foVar = (org.telegram.ui.Components.fo) this.f34574c;
                org.telegram.ui.Components.io ioVar = ((org.telegram.ui.Components.go) this.f34573b).d;
                kc1 kc1Var = ioVar.f25694s;
                if (i10 == 5) {
                    View F = kc1Var.F(foVar);
                    if (F == null) {
                        T = null;
                    } else {
                        T = kc1Var.T(F);
                    }
                    if (T == null || (b10 = T.b()) == -1) {
                        return true;
                    }
                    int i11 = b10 - ioVar.f25696t0;
                    int i12 = ioVar.M;
                    int i13 = i12 - 1;
                    if (i11 == i13 && i12 < ioVar.J) {
                        ioVar.S();
                        return true;
                    } else if (i11 == i13) {
                        AndroidUtilities.hideKeyboard(foVar.getTextView());
                        return true;
                    } else {
                        s4.b1 K = kc1Var.K(b10 + 1);
                        if (K == null) {
                            return true;
                        }
                        View view = K.f44838a;
                        if (!(view instanceof org.telegram.ui.Cells.d6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.d6) view).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
            default:
                cw0 cw0Var = (cw0) this.f34574c;
                fw0 fw0Var = ((dw0) this.f34573b).d;
                if (i10 == 5) {
                    kc1 kc1Var2 = fw0Var.f35983c;
                    View F2 = kc1Var2.F(cw0Var);
                    if (F2 == null) {
                        T2 = null;
                    } else {
                        T2 = kc1Var2.T(F2);
                    }
                    if (T2 == null || (b11 = T2.b()) == -1) {
                        return true;
                    }
                    int i14 = b11 - fw0Var.f35996n0;
                    int i15 = fw0Var.f36011y;
                    int i16 = i15 - 1;
                    if (i14 == i16 && i15 < fw0Var.f35995n) {
                        fw0Var.f0();
                        return true;
                    } else if (i14 == i16) {
                        AndroidUtilities.hideKeyboard(cw0Var.getTextView());
                        return true;
                    } else {
                        s4.b1 K2 = fw0Var.f35983c.K(b11 + 1);
                        if (K2 == null) {
                            return true;
                        }
                        View view2 = K2.f44838a;
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
