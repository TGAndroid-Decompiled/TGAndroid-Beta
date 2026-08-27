package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class fa implements TextView.OnEditorActionListener {

    public final int f38042a;

    public final Object f38043b;

    public fa(Object obj, int i10) {
        this.f38042a = i10;
        this.f38043b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.v0 v0Var;
        org.telegram.ui.Cells.s1 s1Var;
        org.telegram.ui.ActionBar.v0 v0Var2;
        switch (this.f38042a) {
            case 0:
                ha haVar = (ha) this.f38043b;
                if (i10 != 6 || (v0Var = haVar.f38763c.f40700a) == null) {
                    return false;
                }
                v0Var.performClick();
                return true;
            case 1:
                rn rnVar = (rn) this.f38043b;
                if (i10 == 6) {
                    zg.c cVar = rnVar.f42289yc;
                    if (cVar != null && (s1Var = cVar.f50809n) != null) {
                        rnVar.ua(s1Var);
                        return true;
                    }
                } else {
                    rnVar.getClass();
                }
                return false;
            case 2:
                jo joVar = (jo) this.f38043b;
                if (i10 != 6 || (v0Var2 = joVar.f39403a) == null) {
                    return false;
                }
                v0Var2.performClick();
                return true;
            case 3:
                ur urVar = (ur) this.f38043b;
                if (i10 == 5) {
                    urVar.a();
                    return true;
                }
                urVar.getClass();
                return false;
            case 4:
                return i10 == 6 && ((o60) this.f38043b).o0();
            case 5:
                be0 be0Var = (be0) this.f38043b;
                if (i10 == 5) {
                    be0Var.h(null);
                    return true;
                }
                be0Var.getClass();
                return false;
            case 6:
                je0 je0Var = (je0) this.f38043b;
                if (i10 == 5) {
                    je0Var.h(null);
                    return true;
                }
                je0Var.getClass();
                return false;
            case 7:
                xe0 xe0Var = (xe0) this.f38043b;
                if (i10 == 5) {
                    xe0Var.h(null);
                    return true;
                }
                xe0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f38043b;
                int i11 = passcodeActivity.A;
                if (i11 == 0) {
                    passcodeActivity.h0();
                    return true;
                }
                if (i11 != 1) {
                    return false;
                }
                passcodeActivity.g0();
                return true;
            case 9:
                tm0 tm0Var = (tm0) this.f38043b;
                if (i10 == 5) {
                    tm0Var.h(null);
                    return true;
                }
                tm0Var.getClass();
                return false;
            case 10:
                j11 j11Var = (j11) this.f38043b;
                j11Var.getClass();
                if (i10 != 5) {
                    if (i10 != 6) {
                        return false;
                    }
                    j11Var.finishFragment();
                    return true;
                }
                int iIntValue = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr = j11Var.f39223a;
                if (iIntValue >= editTextBoldCursorArr.length) {
                    return true;
                }
                editTextBoldCursorArr[iIntValue].requestFocus();
                return true;
            case 11:
                k61 k61Var = (k61) this.f38043b;
                if (keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                AndroidUtilities.hideKeyboard(k61Var.Y);
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f38043b;
                twoStepVerificationActivity.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                twoStepVerificationActivity.t0();
                return true;
        }
    }
}
