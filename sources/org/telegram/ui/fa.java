package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fa implements TextView.OnEditorActionListener {
    public final int f45578a;
    public final Object f45579b;

    public fa(Object obj, int i7) {
        this.f45578a = i7;
        this.f45579b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.f45578a) {
            case 0:
                ga gaVar = (ga) this.f45579b;
                if (i7 == 6) {
                    org.telegram.ui.ActionBar.b5 b5Var = gaVar.f45930c.f47482a;
                    if (b5Var != null) {
                        b5Var.performClick();
                        return true;
                    }
                } else {
                    gaVar.getClass();
                }
                return false;
            case 1:
                an anVar = (an) this.f45579b;
                if (i7 == 6) {
                    sh.b bVar = anVar.f43812gd;
                    if (bVar != null && (q1Var = bVar.f55196n) != null) {
                        anVar.Ta(q1Var);
                        return true;
                    }
                } else {
                    anVar.getClass();
                }
                return false;
            case 2:
                pn pnVar = (pn) this.f45579b;
                if (i7 == 6) {
                    org.telegram.ui.ActionBar.b5 b5Var2 = pnVar.f48857a;
                    if (b5Var2 != null) {
                        b5Var2.performClick();
                        return true;
                    }
                } else {
                    pnVar.getClass();
                }
                return false;
            case 3:
                yq yqVar = (yq) this.f45579b;
                if (i7 == 5) {
                    yqVar.a();
                    return true;
                }
                yqVar.getClass();
                return false;
            case 4:
                w40 w40Var = (w40) this.f45579b;
                if (i7 == 6 && w40Var.t0()) {
                    return true;
                }
                return false;
            case 5:
                xb0 xb0Var = (xb0) this.f45579b;
                if (i7 == 5) {
                    xb0Var.h(null);
                    return true;
                }
                xb0Var.getClass();
                return false;
            case 6:
                ec0 ec0Var = (ec0) this.f45579b;
                if (i7 == 5) {
                    ec0Var.h(null);
                    return true;
                }
                ec0Var.getClass();
                return false;
            case 7:
                sc0 sc0Var = (sc0) this.f45579b;
                if (i7 == 5) {
                    sc0Var.h(null);
                    return true;
                }
                sc0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f45579b;
                int i10 = passcodeActivity.E;
                if (i10 == 0) {
                    passcodeActivity.v0();
                    return true;
                } else if (i10 == 1) {
                    passcodeActivity.u0();
                    return true;
                } else {
                    return false;
                }
            case 9:
                xj0 xj0Var = (xj0) this.f45579b;
                if (i7 == 5) {
                    xj0Var.h(null);
                    return true;
                }
                xj0Var.getClass();
                return false;
            case 10:
                ux0 ux0Var = (ux0) this.f45579b;
                ux0Var.getClass();
                if (i7 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = ux0Var.f50519a;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    editTextBoldCursorArr[intValue].requestFocus();
                    return true;
                } else if (i7 == 6) {
                    ux0Var.finishFragment();
                    return true;
                } else {
                    return false;
                }
            case 11:
                a21 a21Var = (a21) this.f45579b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(a21Var.U1);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f45579b;
                twoStepVerificationActivity.getClass();
                if (i7 != 5 && i7 != 6) {
                    return false;
                }
                twoStepVerificationActivity.y0();
                return true;
        }
    }
}
