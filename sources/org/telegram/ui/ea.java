package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ea implements TextView.OnEditorActionListener {
    public final int f37882a;
    public final Object f37883b;

    public ea(Object obj, int i9) {
        this.f37882a = i9;
        this.f37883b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i9, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.w0 w0Var;
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.ActionBar.w0 w0Var2;
        switch (this.f37882a) {
            case 0:
                ga gaVar = (ga) this.f37883b;
                if (i9 == 6 && (w0Var = gaVar.f38489c.f40361a) != null) {
                    w0Var.performClick();
                    return true;
                }
                return false;
            case 1:
                qn qnVar = (qn) this.f37883b;
                if (i9 == 6) {
                    yg.c cVar = qnVar.yc;
                    if (cVar != null && (t1Var = cVar.f50213n) != null) {
                        qnVar.ua(t1Var);
                        return true;
                    }
                } else {
                    qnVar.getClass();
                }
                return false;
            case 2:
                ho hoVar = (ho) this.f37883b;
                if (i9 == 6 && (w0Var2 = hoVar.f38835a) != null) {
                    w0Var2.performClick();
                    return true;
                }
                return false;
            case 3:
                sr srVar = (sr) this.f37883b;
                if (i9 == 5) {
                    srVar.a();
                    return true;
                }
                srVar.getClass();
                return false;
            case 4:
                k60 k60Var = (k60) this.f37883b;
                if (i9 == 6 && k60Var.n0()) {
                    return true;
                }
                return false;
            case 5:
                yd0 yd0Var = (yd0) this.f37883b;
                if (i9 == 5) {
                    yd0Var.h(null);
                    return true;
                }
                yd0Var.getClass();
                return false;
            case 6:
                ge0 ge0Var = (ge0) this.f37883b;
                if (i9 == 5) {
                    ge0Var.h(null);
                    return true;
                }
                ge0Var.getClass();
                return false;
            case 7:
                ue0 ue0Var = (ue0) this.f37883b;
                if (i9 == 5) {
                    ue0Var.h(null);
                    return true;
                }
                ue0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f37883b;
                int i10 = passcodeActivity.A;
                if (i10 == 0) {
                    passcodeActivity.g0();
                    return true;
                } else if (i10 == 1) {
                    passcodeActivity.f0();
                    return true;
                } else {
                    return false;
                }
            case 9:
                sm0 sm0Var = (sm0) this.f37883b;
                if (i9 == 5) {
                    sm0Var.h(null);
                    return true;
                }
                sm0Var.getClass();
                return false;
            case 10:
                k11 k11Var = (k11) this.f37883b;
                k11Var.getClass();
                if (i9 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = k11Var.f39665a;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    editTextBoldCursorArr[intValue].requestFocus();
                    return true;
                } else if (i9 == 6) {
                    k11Var.finishFragment();
                    return true;
                } else {
                    return false;
                }
            case 11:
                l61 l61Var = (l61) this.f37883b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(l61Var.Y);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f37883b;
                twoStepVerificationActivity.getClass();
                if (i9 != 5 && i9 != 6) {
                    return false;
                }
                twoStepVerificationActivity.s0();
                return true;
        }
    }
}
