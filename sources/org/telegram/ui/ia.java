package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ia implements TextView.OnEditorActionListener {
    public final int f34566a;
    public final Object f34567b;

    public ia(Object obj, int i10) {
        this.f34566a = i10;
        this.f34567b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.v0 v0Var;
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.ActionBar.v0 v0Var2;
        switch (this.f34566a) {
            case 0:
                ka kaVar = (ka) this.f34567b;
                if (i10 == 6 && (v0Var = kaVar.f35087c.f36816a) != null) {
                    v0Var.performClick();
                    return true;
                }
                return false;
            case 1:
                bo boVar = (bo) this.f34567b;
                if (i10 == 6) {
                    qh.c cVar = boVar.Cc;
                    if (cVar != null && (t1Var = cVar.f41756n) != null) {
                        boVar.ua(t1Var);
                        return true;
                    }
                } else {
                    boVar.getClass();
                }
                return false;
            case 2:
                wo woVar = (wo) this.f34567b;
                if (i10 == 6 && (v0Var2 = woVar.f39269a) != null) {
                    v0Var2.performClick();
                    return true;
                }
                return false;
            case 3:
                ds dsVar = (ds) this.f34567b;
                if (i10 == 5) {
                    dsVar.a();
                    return true;
                }
                dsVar.getClass();
                return false;
            case 4:
                e70 e70Var = (e70) this.f34567b;
                if (i10 == 6 && e70Var.o0()) {
                    return true;
                }
                return false;
            case 5:
                pe0 pe0Var = (pe0) this.f34567b;
                if (i10 == 5) {
                    pe0Var.h(null);
                    return true;
                }
                pe0Var.getClass();
                return false;
            case 6:
                xe0 xe0Var = (xe0) this.f34567b;
                if (i10 == 5) {
                    xe0Var.h(null);
                    return true;
                }
                xe0Var.getClass();
                return false;
            case 7:
                lf0 lf0Var = (lf0) this.f34567b;
                if (i10 == 5) {
                    lf0Var.h(null);
                    return true;
                }
                lf0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f34567b;
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
                kn0 kn0Var = (kn0) this.f34567b;
                if (i10 == 5) {
                    kn0Var.h(null);
                    return true;
                }
                kn0Var.getClass();
                return false;
            case 10:
                o21 o21Var = (o21) this.f34567b;
                o21Var.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = o21Var.f36088a;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    editTextBoldCursorArr[intValue].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    o21Var.finishFragment();
                    return true;
                } else {
                    return false;
                }
            case 11:
                q71 q71Var = (q71) this.f34567b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(q71Var.f36790c0);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f34567b;
                twoStepVerificationActivity.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                twoStepVerificationActivity.t0();
                return true;
        }
    }
}
