package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ia implements TextView.OnEditorActionListener {
    public final int f34582a;
    public final Object f34583b;

    public ia(Object obj, int i10) {
        this.f34582a = i10;
        this.f34583b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.v0 v0Var;
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.ActionBar.v0 v0Var2;
        switch (this.f34582a) {
            case 0:
                ka kaVar = (ka) this.f34583b;
                if (i10 == 6 && (v0Var = kaVar.f35110c.f36806a) != null) {
                    v0Var.performClick();
                    return true;
                }
                return false;
            case 1:
                bo boVar = (bo) this.f34583b;
                if (i10 == 6) {
                    qh.c cVar = boVar.Bc;
                    if (cVar != null && (t1Var = cVar.f41752n) != null) {
                        boVar.ua(t1Var);
                        return true;
                    }
                } else {
                    boVar.getClass();
                }
                return false;
            case 2:
                wo woVar = (wo) this.f34583b;
                if (i10 == 6 && (v0Var2 = woVar.f39265a) != null) {
                    v0Var2.performClick();
                    return true;
                }
                return false;
            case 3:
                ds dsVar = (ds) this.f34583b;
                if (i10 == 5) {
                    dsVar.a();
                    return true;
                }
                dsVar.getClass();
                return false;
            case 4:
                e70 e70Var = (e70) this.f34583b;
                if (i10 == 6 && e70Var.o0()) {
                    return true;
                }
                return false;
            case 5:
                pe0 pe0Var = (pe0) this.f34583b;
                if (i10 == 5) {
                    pe0Var.h(null);
                    return true;
                }
                pe0Var.getClass();
                return false;
            case 6:
                xe0 xe0Var = (xe0) this.f34583b;
                if (i10 == 5) {
                    xe0Var.h(null);
                    return true;
                }
                xe0Var.getClass();
                return false;
            case 7:
                lf0 lf0Var = (lf0) this.f34583b;
                if (i10 == 5) {
                    lf0Var.h(null);
                    return true;
                }
                lf0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f34583b;
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
                kn0 kn0Var = (kn0) this.f34583b;
                if (i10 == 5) {
                    kn0Var.h(null);
                    return true;
                }
                kn0Var.getClass();
                return false;
            case 10:
                p21 p21Var = (p21) this.f34583b;
                p21Var.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = p21Var.f36404a;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    editTextBoldCursorArr[intValue].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    p21Var.finishFragment();
                    return true;
                } else {
                    return false;
                }
            case 11:
                r71 r71Var = (r71) this.f34583b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(r71Var.f37053c0);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f34583b;
                twoStepVerificationActivity.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                twoStepVerificationActivity.t0();
                return true;
        }
    }
}
