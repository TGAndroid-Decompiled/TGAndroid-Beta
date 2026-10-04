package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ka implements TextView.OnEditorActionListener {
    public final int f37903a;
    public final Object f37904b;

    public ka(Object obj, int i10) {
        this.f37903a = i10;
        this.f37904b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.v0 v0Var;
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.ActionBar.v0 v0Var2;
        switch (this.f37903a) {
            case 0:
                ma maVar = (ma) this.f37904b;
                if (i10 == 6 && (v0Var = maVar.f38510c.f40423a) != null) {
                    v0Var.performClick();
                    return true;
                }
                return false;
            case 1:
                yn ynVar = (yn) this.f37904b;
                if (i10 == 6) {
                    qh.c cVar = ynVar.f43589zc;
                    if (cVar != null && (u1Var = cVar.f45450n) != null) {
                        ynVar.ta(u1Var);
                        return true;
                    }
                } else {
                    ynVar.getClass();
                }
                return false;
            case 2:
                to toVar = (to) this.f37904b;
                if (i10 == 6 && (v0Var2 = toVar.f40882a) != null) {
                    v0Var2.performClick();
                    return true;
                }
                return false;
            case 3:
                cs csVar = (cs) this.f37904b;
                if (i10 == 5) {
                    csVar.a();
                    return true;
                }
                csVar.getClass();
                return false;
            case 4:
                d70 d70Var = (d70) this.f37904b;
                if (i10 == 6 && d70Var.o0()) {
                    return true;
                }
                return false;
            case 5:
                ne0 ne0Var = (ne0) this.f37904b;
                if (i10 == 5) {
                    ne0Var.h(null);
                    return true;
                }
                ne0Var.getClass();
                return false;
            case 6:
                ve0 ve0Var = (ve0) this.f37904b;
                if (i10 == 5) {
                    ve0Var.h(null);
                    return true;
                }
                ve0Var.getClass();
                return false;
            case 7:
                jf0 jf0Var = (jf0) this.f37904b;
                if (i10 == 5) {
                    jf0Var.h(null);
                    return true;
                }
                jf0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f37904b;
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
                gn0 gn0Var = (gn0) this.f37904b;
                if (i10 == 5) {
                    gn0Var.h(null);
                    return true;
                }
                gn0Var.getClass();
                return false;
            case 10:
                h21 h21Var = (h21) this.f37904b;
                h21Var.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = h21Var.f36836a;
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
                m71 m71Var = (m71) this.f37904b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(m71Var.f38456c0);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f37904b;
                twoStepVerificationActivity.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                twoStepVerificationActivity.t0();
                return true;
        }
    }
}
