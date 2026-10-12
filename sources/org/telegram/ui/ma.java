package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ma implements TextView.OnEditorActionListener {
    public final int f39977a;
    public final Object f39978b;

    public ma(Object obj, int i10) {
        this.f39977a = i10;
        this.f39978b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.u0 u0Var;
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.ActionBar.u0 u0Var2;
        switch (this.f39977a) {
            case 0:
                oa oaVar = (oa) this.f39978b;
                if (i10 == 6 && (u0Var = oaVar.f40612c.f42432a) != null) {
                    u0Var.performClick();
                    return true;
                }
                return false;
            case 1:
                eo eoVar = (eo) this.f39978b;
                if (i10 == 6) {
                    qh.c cVar = eoVar.Cc;
                    if (cVar != null && (u1Var = cVar.f46613n) != null) {
                        eoVar.ya(u1Var);
                        return true;
                    }
                } else {
                    eoVar.getClass();
                }
                return false;
            case 2:
                xo xoVar = (xo) this.f39978b;
                if (i10 == 6 && (u0Var2 = xoVar.f44052a) != null) {
                    u0Var2.performClick();
                    return true;
                }
                return false;
            case 3:
                fs fsVar = (fs) this.f39978b;
                if (i10 == 5) {
                    fsVar.a();
                    return true;
                }
                fsVar.getClass();
                return false;
            case 4:
                e70 e70Var = (e70) this.f39978b;
                if (i10 == 6 && e70Var.o0()) {
                    return true;
                }
                return false;
            case 5:
                pe0 pe0Var = (pe0) this.f39978b;
                if (i10 == 5) {
                    pe0Var.h(null);
                    return true;
                }
                pe0Var.getClass();
                return false;
            case 6:
                xe0 xe0Var = (xe0) this.f39978b;
                if (i10 == 5) {
                    xe0Var.h(null);
                    return true;
                }
                xe0Var.getClass();
                return false;
            case 7:
                lf0 lf0Var = (lf0) this.f39978b;
                if (i10 == 5) {
                    lf0Var.h(null);
                    return true;
                }
                lf0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f39978b;
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
                ln0 ln0Var = (ln0) this.f39978b;
                if (i10 == 5) {
                    ln0Var.h(null);
                    return true;
                }
                ln0Var.getClass();
                return false;
            case 10:
                q21 q21Var = (q21) this.f39978b;
                q21Var.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = q21Var.f41152a;
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
                x71 x71Var = (x71) this.f39978b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(x71Var.f43795c0);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f39978b;
                twoStepVerificationActivity.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                twoStepVerificationActivity.t0();
                return true;
        }
    }
}
