package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ia implements TextView.OnEditorActionListener {
    public final int f37304a;
    public final Object f37305b;

    public ia(Object obj, int i10) {
        this.f37304a = i10;
        this.f37305b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.v0 v0Var;
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.ActionBar.v0 v0Var2;
        switch (this.f37304a) {
            case 0:
                ka kaVar = (ka) this.f37305b;
                if (i10 == 6 && (v0Var = kaVar.f38010c.f39826a) != null) {
                    v0Var.performClick();
                    return true;
                }
                return false;
            case 1:
                co coVar = (co) this.f37305b;
                if (i10 == 6) {
                    rh.c cVar = coVar.Cc;
                    if (cVar != null && (t1Var = cVar.f45636n) != null) {
                        coVar.ua(t1Var);
                        return true;
                    }
                } else {
                    coVar.getClass();
                }
                return false;
            case 2:
                xo xoVar = (xo) this.f37305b;
                if (i10 == 6 && (v0Var2 = xoVar.f42794a) != null) {
                    v0Var2.performClick();
                    return true;
                }
                return false;
            case 3:
                es esVar = (es) this.f37305b;
                if (i10 == 5) {
                    esVar.a();
                    return true;
                }
                esVar.getClass();
                return false;
            case 4:
                f70 f70Var = (f70) this.f37305b;
                if (i10 == 6 && f70Var.o0()) {
                    return true;
                }
                return false;
            case 5:
                pe0 pe0Var = (pe0) this.f37305b;
                if (i10 == 5) {
                    pe0Var.h(null);
                    return true;
                }
                pe0Var.getClass();
                return false;
            case 6:
                xe0 xe0Var = (xe0) this.f37305b;
                if (i10 == 5) {
                    xe0Var.h(null);
                    return true;
                }
                xe0Var.getClass();
                return false;
            case 7:
                lf0 lf0Var = (lf0) this.f37305b;
                if (i10 == 5) {
                    lf0Var.h(null);
                    return true;
                }
                lf0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f37305b;
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
                ln0 ln0Var = (ln0) this.f37305b;
                if (i10 == 5) {
                    ln0Var.h(null);
                    return true;
                }
                ln0Var.getClass();
                return false;
            case 10:
                q21 q21Var = (q21) this.f37305b;
                q21Var.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = q21Var.f39708a;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    editTextBoldCursorArr[intValue].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    q21Var.finishFragment();
                    return true;
                } else {
                    return false;
                }
            case 11:
                t71 t71Var = (t71) this.f37305b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(t71Var.f40677c0);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f37305b;
                twoStepVerificationActivity.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                twoStepVerificationActivity.t0();
                return true;
        }
    }
}
