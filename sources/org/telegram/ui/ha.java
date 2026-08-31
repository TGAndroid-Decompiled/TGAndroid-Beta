package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ha implements TextView.OnEditorActionListener {
    public final int f37410a;
    public final Object f37411b;

    public ha(Object obj, int i10) {
        this.f37410a = i10;
        this.f37411b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.w0 w0Var;
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.ActionBar.w0 w0Var2;
        switch (this.f37410a) {
            case 0:
                ja jaVar = (ja) this.f37411b;
                if (i10 == 6 && (w0Var = jaVar.f38064c.f39991a) != null) {
                    w0Var.performClick();
                    return true;
                }
                return false;
            case 1:
                xn xnVar = (xn) this.f37411b;
                if (i10 == 6) {
                    eh.f fVar = xnVar.f43439zc;
                    if (fVar != null && (t1Var = fVar.f5628n) != null) {
                        xnVar.ua(t1Var);
                        return true;
                    }
                } else {
                    xnVar.getClass();
                }
                return false;
            case 2:
                po poVar = (po) this.f37411b;
                if (i10 == 6 && (w0Var2 = poVar.f40094a) != null) {
                    w0Var2.performClick();
                    return true;
                }
                return false;
            case 3:
                zr zrVar = (zr) this.f37411b;
                if (i10 == 5) {
                    zrVar.a();
                    return true;
                }
                zrVar.getClass();
                return false;
            case 4:
                z60 z60Var = (z60) this.f37411b;
                if (i10 == 6 && z60Var.o0()) {
                    return true;
                }
                return false;
            case 5:
                ie0 ie0Var = (ie0) this.f37411b;
                if (i10 == 5) {
                    ie0Var.h(null);
                    return true;
                }
                ie0Var.getClass();
                return false;
            case 6:
                qe0 qe0Var = (qe0) this.f37411b;
                if (i10 == 5) {
                    qe0Var.h(null);
                    return true;
                }
                qe0Var.getClass();
                return false;
            case 7:
                ef0 ef0Var = (ef0) this.f37411b;
                if (i10 == 5) {
                    ef0Var.h(null);
                    return true;
                }
                ef0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f37411b;
                int i11 = passcodeActivity.B;
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
                bn0 bn0Var = (bn0) this.f37411b;
                if (i10 == 5) {
                    bn0Var.h(null);
                    return true;
                }
                bn0Var.getClass();
                return false;
            case 10:
                z11 z11Var = (z11) this.f37411b;
                z11Var.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = z11Var.f43772a;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    editTextBoldCursorArr[intValue].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    z11Var.finishFragment();
                    return true;
                } else {
                    return false;
                }
            case 11:
                c71 c71Var = (c71) this.f37411b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(c71Var.Z);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f37411b;
                twoStepVerificationActivity.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                twoStepVerificationActivity.t0();
                return true;
        }
    }
}
