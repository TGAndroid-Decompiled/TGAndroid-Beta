package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class la implements TextView.OnEditorActionListener {
    public final int f35301a;
    public final Object f35302b;

    public la(Object obj, int i10) {
        this.f35301a = i10;
        this.f35302b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.w0 w0Var;
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.ActionBar.w0 w0Var2;
        switch (this.f35301a) {
            case 0:
                na naVar = (na) this.f35302b;
                if (i10 == 6 && (w0Var = naVar.f35906c.f37735a) != null) {
                    w0Var.performClick();
                    return true;
                }
                return false;
            case 1:
                xn xnVar = (xn) this.f35302b;
                if (i10 == 6) {
                    qh.c cVar = xnVar.Bc;
                    if (cVar != null && (u1Var = cVar.f42071n) != null) {
                        xnVar.ua(u1Var);
                        return true;
                    }
                } else {
                    xnVar.getClass();
                }
                return false;
            case 2:
                so soVar = (so) this.f35302b;
                if (i10 == 6 && (w0Var2 = soVar.f37503a) != null) {
                    w0Var2.performClick();
                    return true;
                }
                return false;
            case 3:
                bs bsVar = (bs) this.f35302b;
                if (i10 == 5) {
                    bsVar.a();
                    return true;
                }
                bsVar.getClass();
                return false;
            case 4:
                c70 c70Var = (c70) this.f35302b;
                if (i10 == 6 && c70Var.o0()) {
                    return true;
                }
                return false;
            case 5:
                me0 me0Var = (me0) this.f35302b;
                if (i10 == 5) {
                    me0Var.h(null);
                    return true;
                }
                me0Var.getClass();
                return false;
            case 6:
                ue0 ue0Var = (ue0) this.f35302b;
                if (i10 == 5) {
                    ue0Var.h(null);
                    return true;
                }
                ue0Var.getClass();
                return false;
            case 7:
                if0 if0Var = (if0) this.f35302b;
                if (i10 == 5) {
                    if0Var.h(null);
                    return true;
                }
                if0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f35302b;
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
                fn0 fn0Var = (fn0) this.f35302b;
                if (i10 == 5) {
                    fn0Var.h(null);
                    return true;
                }
                fn0Var.getClass();
                return false;
            case 10:
                h21 h21Var = (h21) this.f35302b;
                h21Var.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = h21Var.f34107a;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    editTextBoldCursorArr[intValue].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    h21Var.finishFragment();
                    return true;
                } else {
                    return false;
                }
            case 11:
                m71 m71Var = (m71) this.f35302b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(m71Var.f35539c0);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f35302b;
                twoStepVerificationActivity.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                twoStepVerificationActivity.t0();
                return true;
        }
    }
}
