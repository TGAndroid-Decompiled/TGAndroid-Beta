package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class la implements TextView.OnEditorActionListener {
    public final int f41225a;
    public final Object f41226b;

    public la(Object obj, int i10) {
        this.f41225a = i10;
        this.f41226b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.Cells.s1 s1Var;
        switch (this.f41225a) {
            case 0:
                na naVar = (na) this.f41226b;
                if (i10 == 6) {
                    org.telegram.ui.ActionBar.u5 u5Var = naVar.f41823c.f43704a;
                    if (u5Var != null) {
                        u5Var.performClick();
                        return true;
                    }
                } else {
                    naVar.getClass();
                }
                return false;
            case 1:
                un unVar = (un) this.f41226b;
                if (i10 == 6) {
                    sh.c cVar = unVar.Zc;
                    if (cVar != null && (s1Var = cVar.f48619n) != null) {
                        unVar.Da(s1Var);
                        return true;
                    }
                } else {
                    unVar.getClass();
                }
                return false;
            case 2:
                mo moVar = (mo) this.f41226b;
                if (i10 == 6) {
                    org.telegram.ui.ActionBar.u5 u5Var2 = moVar.f41594a;
                    if (u5Var2 != null) {
                        u5Var2.performClick();
                        return true;
                    }
                } else {
                    moVar.getClass();
                }
                return false;
            case 3:
                vr vrVar = (vr) this.f41226b;
                if (i10 == 5) {
                    vrVar.a();
                    return true;
                }
                vrVar.getClass();
                return false;
            case 4:
                r60 r60Var = (r60) this.f41226b;
                if (i10 == 6 && r60Var.p0()) {
                    return true;
                }
                return false;
            case 5:
                yd0 yd0Var = (yd0) this.f41226b;
                if (i10 == 5) {
                    yd0Var.h(null);
                    return true;
                }
                yd0Var.getClass();
                return false;
            case 6:
                ge0 ge0Var = (ge0) this.f41226b;
                if (i10 == 5) {
                    ge0Var.h(null);
                    return true;
                }
                ge0Var.getClass();
                return false;
            case 7:
                ve0 ve0Var = (ve0) this.f41226b;
                if (i10 == 5) {
                    ve0Var.h(null);
                    return true;
                }
                ve0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f41226b;
                int i11 = passcodeActivity.E;
                if (i11 == 0) {
                    passcodeActivity.r0();
                    return true;
                } else if (i11 == 1) {
                    passcodeActivity.q0();
                    return true;
                } else {
                    return false;
                }
            case 9:
                en0 en0Var = (en0) this.f41226b;
                if (i10 == 5) {
                    en0Var.h(null);
                    return true;
                }
                en0Var.getClass();
                return false;
            case 10:
                b21 b21Var = (b21) this.f41226b;
                b21Var.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = b21Var.f37952a;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    editTextBoldCursorArr[intValue].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    b21Var.finishFragment();
                    return true;
                } else {
                    return false;
                }
            case 11:
                m61 m61Var = (m61) this.f41226b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(m61Var.f41472c0);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f41226b;
                twoStepVerificationActivity.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                twoStepVerificationActivity.u0();
                return true;
        }
    }
}
