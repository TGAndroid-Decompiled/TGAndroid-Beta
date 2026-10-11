package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ia implements TextView.OnEditorActionListener {
    public final int f38667a;
    public final Object f38668b;

    public ia(Object obj, int i10) {
        this.f38667a = i10;
        this.f38668b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.u0 u0Var;
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.ActionBar.u0 u0Var2;
        switch (this.f38667a) {
            case 0:
                ka kaVar = (ka) this.f38668b;
                if (i10 == 6 && (u0Var = kaVar.f39278c.f41112a) != null) {
                    u0Var.performClick();
                    return true;
                }
                return false;
            case 1:
                zn znVar = (zn) this.f38668b;
                if (i10 == 6) {
                    qh.c cVar = znVar.Cc;
                    if (cVar != null && (u1Var = cVar.f46777n) != null) {
                        znVar.ya(u1Var);
                        return true;
                    }
                } else {
                    znVar.getClass();
                }
                return false;
            case 2:
                uo uoVar = (uo) this.f38668b;
                if (i10 == 6 && (u0Var2 = uoVar.f42688a) != null) {
                    u0Var2.performClick();
                    return true;
                }
                return false;
            case 3:
                bs bsVar = (bs) this.f38668b;
                if (i10 == 5) {
                    bsVar.a();
                    return true;
                }
                bsVar.getClass();
                return false;
            case 4:
                c70 c70Var = (c70) this.f38668b;
                if (i10 == 6 && c70Var.o0()) {
                    return true;
                }
                return false;
            case 5:
                ne0 ne0Var = (ne0) this.f38668b;
                if (i10 == 5) {
                    ne0Var.h(null);
                    return true;
                }
                ne0Var.getClass();
                return false;
            case 6:
                ve0 ve0Var = (ve0) this.f38668b;
                if (i10 == 5) {
                    ve0Var.h(null);
                    return true;
                }
                ve0Var.getClass();
                return false;
            case 7:
                jf0 jf0Var = (jf0) this.f38668b;
                if (i10 == 5) {
                    jf0Var.h(null);
                    return true;
                }
                jf0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f38668b;
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
                in0 in0Var = (in0) this.f38668b;
                if (i10 == 5) {
                    in0Var.h(null);
                    return true;
                }
                in0Var.getClass();
                return false;
            case 10:
                m21 m21Var = (m21) this.f38668b;
                m21Var.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = m21Var.f39827a;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    editTextBoldCursorArr[intValue].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    m21Var.finishFragment();
                    return true;
                } else {
                    return false;
                }
            case 11:
                t71 t71Var = (t71) this.f38668b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(t71Var.f42143c0);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f38668b;
                twoStepVerificationActivity.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                twoStepVerificationActivity.t0();
                return true;
        }
    }
}
