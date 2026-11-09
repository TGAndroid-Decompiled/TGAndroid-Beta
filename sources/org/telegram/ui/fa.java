package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fa implements TextView.OnEditorActionListener {
    public final int f45672a;
    public final Object f45673b;

    public fa(Object obj, int i7) {
        this.f45672a = i7;
        this.f45673b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.f45672a) {
            case 0:
                ga gaVar = (ga) this.f45673b;
                if (i7 == 6) {
                    org.telegram.ui.ActionBar.b5 b5Var = gaVar.f45943c.f47538a;
                    if (b5Var != null) {
                        b5Var.performClick();
                        return true;
                    }
                } else {
                    gaVar.getClass();
                }
                return false;
            case 1:
                cn cnVar = (cn) this.f45673b;
                if (i7 == 6) {
                    sh.c cVar = cnVar.f44498id;
                    if (cVar != null && (q1Var = cVar.f55300n) != null) {
                        cnVar.Va(q1Var);
                        return true;
                    }
                } else {
                    cnVar.getClass();
                }
                return false;
            case 2:
                rn rnVar = (rn) this.f45673b;
                if (i7 == 6) {
                    org.telegram.ui.ActionBar.b5 b5Var2 = rnVar.f49509a;
                    if (b5Var2 != null) {
                        b5Var2.performClick();
                        return true;
                    }
                } else {
                    rnVar.getClass();
                }
                return false;
            case 3:
                ar arVar = (ar) this.f45673b;
                if (i7 == 5) {
                    arVar.a();
                    return true;
                }
                arVar.getClass();
                return false;
            case 4:
                y40 y40Var = (y40) this.f45673b;
                if (i7 == 6 && y40Var.t0()) {
                    return true;
                }
                return false;
            case 5:
                zb0 zb0Var = (zb0) this.f45673b;
                if (i7 == 5) {
                    zb0Var.h(null);
                    return true;
                }
                zb0Var.getClass();
                return false;
            case 6:
                gc0 gc0Var = (gc0) this.f45673b;
                if (i7 == 5) {
                    gc0Var.h(null);
                    return true;
                }
                gc0Var.getClass();
                return false;
            case 7:
                uc0 uc0Var = (uc0) this.f45673b;
                if (i7 == 5) {
                    uc0Var.h(null);
                    return true;
                }
                uc0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f45673b;
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
                zj0 zj0Var = (zj0) this.f45673b;
                if (i7 == 5) {
                    zj0Var.h(null);
                    return true;
                }
                zj0Var.getClass();
                return false;
            case 10:
                yx0 yx0Var = (yx0) this.f45673b;
                yx0Var.getClass();
                if (i7 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = yx0Var.f52344a;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    editTextBoldCursorArr[intValue].requestFocus();
                    return true;
                } else if (i7 == 6) {
                    yx0Var.finishFragment();
                    return true;
                } else {
                    return false;
                }
            case 11:
                c21 c21Var = (c21) this.f45673b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(c21Var.U1);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f45673b;
                twoStepVerificationActivity.getClass();
                if (i7 != 5 && i7 != 6) {
                    return false;
                }
                twoStepVerificationActivity.y0();
                return true;
        }
    }
}
