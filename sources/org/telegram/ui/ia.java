package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ia implements TextView.OnEditorActionListener {
    public final int f34081a;
    public final Object f34082b;

    public ia(Object obj, int i10) {
        this.f34081a = i10;
        this.f34082b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.v0 v0Var;
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.ActionBar.v0 v0Var2;
        switch (this.f34081a) {
            case 0:
                ka kaVar = (ka) this.f34082b;
                if (i10 == 6 && (v0Var = kaVar.f34635c.f36335a) != null) {
                    v0Var.performClick();
                    return true;
                }
                return false;
            case 1:
                xn xnVar = (xn) this.f34082b;
                if (i10 == 6) {
                    qh.c cVar = xnVar.Bc;
                    if (cVar != null && (t1Var = cVar.f41708n) != null) {
                        xnVar.ua(t1Var);
                        return true;
                    }
                } else {
                    xnVar.getClass();
                }
                return false;
            case 2:
                so soVar = (so) this.f34082b;
                if (i10 == 6 && (v0Var2 = soVar.f37343a) != null) {
                    v0Var2.performClick();
                    return true;
                }
                return false;
            case 3:
                zr zrVar = (zr) this.f34082b;
                if (i10 == 5) {
                    zrVar.a();
                    return true;
                }
                zrVar.getClass();
                return false;
            case 4:
                b70 b70Var = (b70) this.f34082b;
                if (i10 == 6 && b70Var.o0()) {
                    return true;
                }
                return false;
            case 5:
                ke0 ke0Var = (ke0) this.f34082b;
                if (i10 == 5) {
                    ke0Var.h(null);
                    return true;
                }
                ke0Var.getClass();
                return false;
            case 6:
                se0 se0Var = (se0) this.f34082b;
                if (i10 == 5) {
                    se0Var.h(null);
                    return true;
                }
                se0Var.getClass();
                return false;
            case 7:
                gf0 gf0Var = (gf0) this.f34082b;
                if (i10 == 5) {
                    gf0Var.h(null);
                    return true;
                }
                gf0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f34082b;
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
                en0 en0Var = (en0) this.f34082b;
                if (i10 == 5) {
                    en0Var.h(null);
                    return true;
                }
                en0Var.getClass();
                return false;
            case 10:
                h21 h21Var = (h21) this.f34082b;
                h21Var.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = h21Var.f33711a;
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
                j71 j71Var = (j71) this.f34082b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(j71Var.f34349c0);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f34082b;
                twoStepVerificationActivity.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                twoStepVerificationActivity.t0();
                return true;
        }
    }
}
