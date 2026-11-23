package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fa implements TextView.OnEditorActionListener {
    public final int f47613a;
    public final Object f47614b;

    public fa(Object obj, int i7) {
        this.f47613a = i7;
        this.f47614b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        org.telegram.ui.Cells.r1 r1Var;
        switch (this.f47613a) {
            case 0:
                ga gaVar = (ga) this.f47614b;
                if (i7 == 6) {
                    org.telegram.ui.ActionBar.c5 c5Var = gaVar.f47966c.f49507a;
                    if (c5Var != null) {
                        c5Var.performClick();
                        return true;
                    }
                } else {
                    gaVar.getClass();
                }
                return false;
            case 1:
                bn bnVar = (bn) this.f47614b;
                if (i7 == 6) {
                    sh.b bVar = bnVar.f46050kd;
                    if (bVar != null && (r1Var = bVar.f57435n) != null) {
                        bnVar.Wa(r1Var);
                        return true;
                    }
                } else {
                    bnVar.getClass();
                }
                return false;
            case 2:
                rn rnVar = (rn) this.f47614b;
                if (i7 == 6) {
                    org.telegram.ui.ActionBar.c5 c5Var2 = rnVar.f51675a;
                    if (c5Var2 != null) {
                        c5Var2.performClick();
                        return true;
                    }
                } else {
                    rnVar.getClass();
                }
                return false;
            case 3:
                br brVar = (br) this.f47614b;
                if (i7 == 5) {
                    brVar.a();
                    return true;
                }
                brVar.getClass();
                return false;
            case 4:
                z40 z40Var = (z40) this.f47614b;
                if (i7 == 6 && z40Var.t0()) {
                    return true;
                }
                return false;
            case 5:
                xb0 xb0Var = (xb0) this.f47614b;
                if (i7 == 5) {
                    xb0Var.h(null);
                    return true;
                }
                xb0Var.getClass();
                return false;
            case 6:
                ec0 ec0Var = (ec0) this.f47614b;
                if (i7 == 5) {
                    ec0Var.h(null);
                    return true;
                }
                ec0Var.getClass();
                return false;
            case 7:
                sc0 sc0Var = (sc0) this.f47614b;
                if (i7 == 5) {
                    sc0Var.h(null);
                    return true;
                }
                sc0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f47614b;
                int i10 = passcodeActivity.F;
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
                dk0 dk0Var = (dk0) this.f47614b;
                if (i7 == 5) {
                    dk0Var.h(null);
                    return true;
                }
                dk0Var.getClass();
                return false;
            case 10:
                yx0 yx0Var = (yx0) this.f47614b;
                yx0Var.getClass();
                if (i7 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = yx0Var.f54288a;
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
                b21 b21Var = (b21) this.f47614b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(b21Var.Y1);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f47614b;
                twoStepVerificationActivity.getClass();
                if (i7 != 5 && i7 != 6) {
                    return false;
                }
                twoStepVerificationActivity.y0();
                return true;
        }
    }
}
