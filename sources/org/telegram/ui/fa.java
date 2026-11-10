package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fa implements TextView.OnEditorActionListener {
    public final int f45664a;
    public final Object f45665b;

    public fa(Object obj, int i7) {
        this.f45664a = i7;
        this.f45665b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.f45664a) {
            case 0:
                ga gaVar = (ga) this.f45665b;
                if (i7 == 6) {
                    org.telegram.ui.ActionBar.c5 c5Var = gaVar.f46055c.f47555a;
                    if (c5Var != null) {
                        c5Var.performClick();
                        return true;
                    }
                } else {
                    gaVar.getClass();
                }
                return false;
            case 1:
                cn cnVar = (cn) this.f45665b;
                if (i7 == 6) {
                    sh.c cVar = cnVar.f44539id;
                    if (cVar != null && (q1Var = cVar.f55299n) != null) {
                        cnVar.Va(q1Var);
                        return true;
                    }
                } else {
                    cnVar.getClass();
                }
                return false;
            case 2:
                rn rnVar = (rn) this.f45665b;
                if (i7 == 6) {
                    org.telegram.ui.ActionBar.c5 c5Var2 = rnVar.f49447a;
                    if (c5Var2 != null) {
                        c5Var2.performClick();
                        return true;
                    }
                } else {
                    rnVar.getClass();
                }
                return false;
            case 3:
                br brVar = (br) this.f45665b;
                if (i7 == 5) {
                    brVar.a();
                    return true;
                }
                brVar.getClass();
                return false;
            case 4:
                z40 z40Var = (z40) this.f45665b;
                if (i7 == 6 && z40Var.t0()) {
                    return true;
                }
                return false;
            case 5:
                ac0 ac0Var = (ac0) this.f45665b;
                if (i7 == 5) {
                    ac0Var.h(null);
                    return true;
                }
                ac0Var.getClass();
                return false;
            case 6:
                hc0 hc0Var = (hc0) this.f45665b;
                if (i7 == 5) {
                    hc0Var.h(null);
                    return true;
                }
                hc0Var.getClass();
                return false;
            case 7:
                wc0 wc0Var = (wc0) this.f45665b;
                if (i7 == 5) {
                    wc0Var.h(null);
                    return true;
                }
                wc0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f45665b;
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
                ak0 ak0Var = (ak0) this.f45665b;
                if (i7 == 5) {
                    ak0Var.h(null);
                    return true;
                }
                ak0Var.getClass();
                return false;
            case 10:
                zx0 zx0Var = (zx0) this.f45665b;
                zx0Var.getClass();
                if (i7 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = zx0Var.f52694a;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    editTextBoldCursorArr[intValue].requestFocus();
                    return true;
                } else if (i7 == 6) {
                    zx0Var.finishFragment();
                    return true;
                } else {
                    return false;
                }
            case 11:
                d21 d21Var = (d21) this.f45665b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(d21Var.X1);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f45665b;
                twoStepVerificationActivity.getClass();
                if (i7 != 5 && i7 != 6) {
                    return false;
                }
                twoStepVerificationActivity.y0();
                return true;
        }
    }
}
