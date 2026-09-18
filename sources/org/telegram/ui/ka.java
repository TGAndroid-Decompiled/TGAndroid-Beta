package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ka implements TextView.OnEditorActionListener {
    public final int f35173a;
    public final Object f35174b;

    public ka(Object obj, int i10) {
        this.f35173a = i10;
        this.f35174b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.w0 w0Var;
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.ActionBar.w0 w0Var2;
        switch (this.f35173a) {
            case 0:
                ma maVar = (ma) this.f35174b;
                if (i10 == 6 && (w0Var = maVar.f35740c.f37434a) != null) {
                    w0Var.performClick();
                    return true;
                }
                return false;
            case 1:
                bo boVar = (bo) this.f35174b;
                if (i10 == 6) {
                    qh.c cVar = boVar.Bc;
                    if (cVar != null && (t1Var = cVar.f41783n) != null) {
                        boVar.ua(t1Var);
                        return true;
                    }
                } else {
                    boVar.getClass();
                }
                return false;
            case 2:
                wo woVar = (wo) this.f35174b;
                if (i10 == 6 && (w0Var2 = woVar.f39087a) != null) {
                    w0Var2.performClick();
                    return true;
                }
                return false;
            case 3:
                fs fsVar = (fs) this.f35174b;
                if (i10 == 5) {
                    fsVar.a();
                    return true;
                }
                fsVar.getClass();
                return false;
            case 4:
                g70 g70Var = (g70) this.f35174b;
                if (i10 == 6 && g70Var.o0()) {
                    return true;
                }
                return false;
            case 5:
                re0 re0Var = (re0) this.f35174b;
                if (i10 == 5) {
                    re0Var.h(null);
                    return true;
                }
                re0Var.getClass();
                return false;
            case 6:
                ze0 ze0Var = (ze0) this.f35174b;
                if (i10 == 5) {
                    ze0Var.h(null);
                    return true;
                }
                ze0Var.getClass();
                return false;
            case 7:
                nf0 nf0Var = (nf0) this.f35174b;
                if (i10 == 5) {
                    nf0Var.h(null);
                    return true;
                }
                nf0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f35174b;
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
                mn0 mn0Var = (mn0) this.f35174b;
                if (i10 == 5) {
                    mn0Var.h(null);
                    return true;
                }
                mn0Var.getClass();
                return false;
            case 10:
                q21 q21Var = (q21) this.f35174b;
                q21Var.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = q21Var.f36786a;
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
                s71 s71Var = (s71) this.f35174b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(s71Var.f37408c0);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f35174b;
                twoStepVerificationActivity.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                twoStepVerificationActivity.t0();
                return true;
        }
    }
}
