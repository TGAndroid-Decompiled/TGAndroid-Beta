package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ia implements TextView.OnEditorActionListener {
    public final int f34466a;
    public final Object f34467b;

    public ia(Object obj, int i10) {
        this.f34466a = i10;
        this.f34467b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.u0 u0Var;
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.ActionBar.u0 u0Var2;
        switch (this.f34466a) {
            case 0:
                ka kaVar = (ka) this.f34467b;
                if (i10 == 6 && (u0Var = kaVar.f35011c.f36829a) != null) {
                    u0Var.performClick();
                    return true;
                }
                return false;
            case 1:
                wn wnVar = (wn) this.f34467b;
                if (i10 == 6) {
                    qh.c cVar = wnVar.Bc;
                    if (cVar != null && (u1Var = cVar.f42040n) != null) {
                        wnVar.ua(u1Var);
                        return true;
                    }
                } else {
                    wnVar.getClass();
                }
                return false;
            case 2:
                ro roVar = (ro) this.f34467b;
                if (i10 == 6 && (u0Var2 = roVar.f37388a) != null) {
                    u0Var2.performClick();
                    return true;
                }
                return false;
            case 3:
                yr yrVar = (yr) this.f34467b;
                if (i10 == 5) {
                    yrVar.a();
                    return true;
                }
                yrVar.getClass();
                return false;
            case 4:
                z60 z60Var = (z60) this.f34467b;
                if (i10 == 6 && z60Var.o0()) {
                    return true;
                }
                return false;
            case 5:
                je0 je0Var = (je0) this.f34467b;
                if (i10 == 5) {
                    je0Var.h(null);
                    return true;
                }
                je0Var.getClass();
                return false;
            case 6:
                re0 re0Var = (re0) this.f34467b;
                if (i10 == 5) {
                    re0Var.h(null);
                    return true;
                }
                re0Var.getClass();
                return false;
            case 7:
                ff0 ff0Var = (ff0) this.f34467b;
                if (i10 == 5) {
                    ff0Var.h(null);
                    return true;
                }
                ff0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f34467b;
                int i11 = passcodeActivity.E;
                if (i11 == 0) {
                    passcodeActivity.h0();
                    return true;
                } else if (i11 == 1) {
                    passcodeActivity.g0();
                    return true;
                } else {
                    return false;
                }
            case 9:
                cn0 cn0Var = (cn0) this.f34467b;
                if (i10 == 5) {
                    cn0Var.h(null);
                    return true;
                }
                cn0Var.getClass();
                return false;
            case 10:
                f21 f21Var = (f21) this.f34467b;
                f21Var.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = f21Var.f33522a;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    editTextBoldCursorArr[intValue].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    f21Var.finishFragment();
                    return true;
                } else {
                    return false;
                }
            case 11:
                k71 k71Var = (k71) this.f34467b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(k71Var.f34961c0);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f34467b;
                twoStepVerificationActivity.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                twoStepVerificationActivity.t0();
                return true;
        }
    }
}
