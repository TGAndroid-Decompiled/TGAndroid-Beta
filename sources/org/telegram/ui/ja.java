package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ja implements TextView.OnEditorActionListener {
    public final int f38885a;
    public final Object f38886b;

    public ja(Object obj, int i10) {
        this.f38885a = i10;
        this.f38886b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.v0 v0Var;
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.ActionBar.v0 v0Var2;
        switch (this.f38885a) {
            case 0:
                la laVar = (la) this.f38886b;
                if (i10 == 6 && (v0Var = laVar.f39482c.f41316a) != null) {
                    v0Var.performClick();
                    return true;
                }
                return false;
            case 1:
                zn znVar = (zn) this.f38886b;
                if (i10 == 6) {
                    qh.c cVar = znVar.Cc;
                    if (cVar != null && (u1Var = cVar.f46666n) != null) {
                        znVar.ya(u1Var);
                        return true;
                    }
                } else {
                    znVar.getClass();
                }
                return false;
            case 2:
                uo uoVar = (uo) this.f38886b;
                if (i10 == 6 && (v0Var2 = uoVar.f42462a) != null) {
                    v0Var2.performClick();
                    return true;
                }
                return false;
            case 3:
                cs csVar = (cs) this.f38886b;
                if (i10 == 5) {
                    csVar.a();
                    return true;
                }
                csVar.getClass();
                return false;
            case 4:
                c70 c70Var = (c70) this.f38886b;
                if (i10 == 6 && c70Var.o0()) {
                    return true;
                }
                return false;
            case 5:
                oe0 oe0Var = (oe0) this.f38886b;
                if (i10 == 5) {
                    oe0Var.h(null);
                    return true;
                }
                oe0Var.getClass();
                return false;
            case 6:
                we0 we0Var = (we0) this.f38886b;
                if (i10 == 5) {
                    we0Var.h(null);
                    return true;
                }
                we0Var.getClass();
                return false;
            case 7:
                kf0 kf0Var = (kf0) this.f38886b;
                if (i10 == 5) {
                    kf0Var.h(null);
                    return true;
                }
                kf0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f38886b;
                int i11 = passcodeActivity.E;
                if (i11 == 0) {
                    passcodeActivity.k0();
                    return true;
                } else if (i11 == 1) {
                    passcodeActivity.j0();
                    return true;
                } else {
                    return false;
                }
            case 9:
                jn0 jn0Var = (jn0) this.f38886b;
                if (i10 == 5) {
                    jn0Var.h(null);
                    return true;
                }
                jn0Var.getClass();
                return false;
            case 10:
                n21 n21Var = (n21) this.f38886b;
                n21Var.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = n21Var.f40050a;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    editTextBoldCursorArr[intValue].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    n21Var.finishFragment();
                    return true;
                } else {
                    return false;
                }
            case 11:
                u71 u71Var = (u71) this.f38886b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(u71Var.f42352c0);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f38886b;
                twoStepVerificationActivity.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                twoStepVerificationActivity.t0();
                return true;
        }
    }
}
