package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class la implements TextView.OnEditorActionListener {
    public final int f41060a;
    public final Object f41061b;

    public la(Object obj, int i10) {
        this.f41060a = i10;
        this.f41061b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.Cells.s1 s1Var;
        switch (this.f41060a) {
            case 0:
                na naVar = (na) this.f41061b;
                if (i10 == 6) {
                    org.telegram.ui.ActionBar.u5 u5Var = naVar.f41723c.f43576a;
                    if (u5Var != null) {
                        u5Var.performClick();
                        return true;
                    }
                } else {
                    naVar.getClass();
                }
                return false;
            case 1:
                wn wnVar = (wn) this.f41061b;
                if (i10 == 6) {
                    sh.c cVar = wnVar.f45100dd;
                    if (cVar != null && (s1Var = cVar.f48657n) != null) {
                        wnVar.Ga(s1Var);
                        return true;
                    }
                } else {
                    wnVar.getClass();
                }
                return false;
            case 2:
                oo ooVar = (oo) this.f41061b;
                if (i10 == 6) {
                    org.telegram.ui.ActionBar.u5 u5Var2 = ooVar.f42129a;
                    if (u5Var2 != null) {
                        u5Var2.performClick();
                        return true;
                    }
                } else {
                    ooVar.getClass();
                }
                return false;
            case 3:
                xr xrVar = (xr) this.f41061b;
                if (i10 == 5) {
                    xrVar.a();
                    return true;
                }
                xrVar.getClass();
                return false;
            case 4:
                t60 t60Var = (t60) this.f41061b;
                if (i10 == 6 && t60Var.p0()) {
                    return true;
                }
                return false;
            case 5:
                ae0 ae0Var = (ae0) this.f41061b;
                if (i10 == 5) {
                    ae0Var.h(null);
                    return true;
                }
                ae0Var.getClass();
                return false;
            case 6:
                ie0 ie0Var = (ie0) this.f41061b;
                if (i10 == 5) {
                    ie0Var.h(null);
                    return true;
                }
                ie0Var.getClass();
                return false;
            case 7:
                xe0 xe0Var = (xe0) this.f41061b;
                if (i10 == 5) {
                    xe0Var.h(null);
                    return true;
                }
                xe0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f41061b;
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
                gn0 gn0Var = (gn0) this.f41061b;
                if (i10 == 5) {
                    gn0Var.h(null);
                    return true;
                }
                gn0Var.getClass();
                return false;
            case 10:
                d21 d21Var = (d21) this.f41061b;
                d21Var.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = d21Var.f38498a;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    editTextBoldCursorArr[intValue].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    d21Var.finishFragment();
                    return true;
                } else {
                    return false;
                }
            case 11:
                p61 p61Var = (p61) this.f41061b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(p61Var.f42318c0);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f41061b;
                twoStepVerificationActivity.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                twoStepVerificationActivity.u0();
                return true;
        }
    }
}
