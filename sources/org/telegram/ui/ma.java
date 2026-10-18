package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ma implements TextView.OnEditorActionListener {
    public final int f39103a;
    public final Object f39104b;

    public ma(Object obj, int i10) {
        this.f39103a = i10;
        this.f39104b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.u0 u0Var;
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.ActionBar.u0 u0Var2;
        switch (this.f39103a) {
            case 0:
                oa oaVar = (oa) this.f39104b;
                if (i10 == 6 && (u0Var = oaVar.f39719c.f41946a) != null) {
                    u0Var.performClick();
                    return true;
                }
                return false;
            case 1:
                sn snVar = (sn) this.f39104b;
                if (i10 == 6) {
                    rh.c cVar = snVar.Cc;
                    if (cVar != null && (u1Var = cVar.f45784n) != null) {
                        snVar.ya(u1Var);
                        return true;
                    }
                } else {
                    snVar.getClass();
                }
                return false;
            case 2:
                ko koVar = (ko) this.f39104b;
                if (i10 == 6 && (u0Var2 = koVar.f38591a) != null) {
                    u0Var2.performClick();
                    return true;
                }
                return false;
            case 3:
                sr srVar = (sr) this.f39104b;
                if (i10 == 5) {
                    srVar.a();
                    return true;
                }
                srVar.getClass();
                return false;
            case 4:
                n60 n60Var = (n60) this.f39104b;
                if (i10 == 6 && n60Var.o0()) {
                    return true;
                }
                return false;
            case 5:
                xd0 xd0Var = (xd0) this.f39104b;
                if (i10 == 5) {
                    xd0Var.h(null);
                    return true;
                }
                xd0Var.getClass();
                return false;
            case 6:
                fe0 fe0Var = (fe0) this.f39104b;
                if (i10 == 5) {
                    fe0Var.h(null);
                    return true;
                }
                fe0Var.getClass();
                return false;
            case 7:
                te0 te0Var = (te0) this.f39104b;
                if (i10 == 5) {
                    te0Var.h(null);
                    return true;
                }
                te0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f39104b;
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
                tm0 tm0Var = (tm0) this.f39104b;
                if (i10 == 5) {
                    tm0Var.h(null);
                    return true;
                }
                tm0Var.getClass();
                return false;
            case 10:
                u11 u11Var = (u11) this.f39104b;
                u11Var.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = u11Var.f41873a;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    editTextBoldCursorArr[intValue].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    u11Var.finishFragment();
                    return true;
                } else {
                    return false;
                }
            case 11:
                j61 j61Var = (j61) this.f39104b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(j61Var.f38073c0);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f39104b;
                twoStepVerificationActivity.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                twoStepVerificationActivity.t0();
                return true;
        }
    }
}
