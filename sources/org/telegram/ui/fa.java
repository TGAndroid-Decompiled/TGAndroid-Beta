package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fa implements TextView.OnEditorActionListener {
    public final int f47734a;
    public final Object f47735b;

    public fa(Object obj, int i7) {
        this.f47734a = i7;
        this.f47735b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        org.telegram.ui.Cells.r1 r1Var;
        switch (this.f47734a) {
            case 0:
                ga gaVar = (ga) this.f47735b;
                if (i7 == 6) {
                    org.telegram.ui.ActionBar.c5 c5Var = gaVar.f48196c.f49660a;
                    if (c5Var != null) {
                        c5Var.performClick();
                        return true;
                    }
                } else {
                    gaVar.getClass();
                }
                return false;
            case 1:
                bn bnVar = (bn) this.f47735b;
                if (i7 == 6) {
                    sh.b bVar = bnVar.f46265kd;
                    if (bVar != null && (r1Var = bVar.f57546n) != null) {
                        bnVar.Wa(r1Var);
                        return true;
                    }
                } else {
                    bnVar.getClass();
                }
                return false;
            case 2:
                rn rnVar = (rn) this.f47735b;
                if (i7 == 6) {
                    org.telegram.ui.ActionBar.c5 c5Var2 = rnVar.f51764a;
                    if (c5Var2 != null) {
                        c5Var2.performClick();
                        return true;
                    }
                } else {
                    rnVar.getClass();
                }
                return false;
            case 3:
                br brVar = (br) this.f47735b;
                if (i7 == 5) {
                    brVar.a();
                    return true;
                }
                brVar.getClass();
                return false;
            case 4:
                y40 y40Var = (y40) this.f47735b;
                if (i7 == 6 && y40Var.t0()) {
                    return true;
                }
                return false;
            case 5:
                wb0 wb0Var = (wb0) this.f47735b;
                if (i7 == 5) {
                    wb0Var.h(null);
                    return true;
                }
                wb0Var.getClass();
                return false;
            case 6:
                dc0 dc0Var = (dc0) this.f47735b;
                if (i7 == 5) {
                    dc0Var.h(null);
                    return true;
                }
                dc0Var.getClass();
                return false;
            case 7:
                rc0 rc0Var = (rc0) this.f47735b;
                if (i7 == 5) {
                    rc0Var.h(null);
                    return true;
                }
                rc0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f47735b;
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
                bk0 bk0Var = (bk0) this.f47735b;
                if (i7 == 5) {
                    bk0Var.h(null);
                    return true;
                }
                bk0Var.getClass();
                return false;
            case 10:
                wx0 wx0Var = (wx0) this.f47735b;
                wx0Var.getClass();
                if (i7 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = wx0Var.f53782a;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    editTextBoldCursorArr[intValue].requestFocus();
                    return true;
                } else if (i7 == 6) {
                    wx0Var.finishFragment();
                    return true;
                } else {
                    return false;
                }
            case 11:
                a21 a21Var = (a21) this.f47735b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(a21Var.Y1);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f47735b;
                twoStepVerificationActivity.getClass();
                if (i7 != 5 && i7 != 6) {
                    return false;
                }
                twoStepVerificationActivity.y0();
                return true;
        }
    }
}
