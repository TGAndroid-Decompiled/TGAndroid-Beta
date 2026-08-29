package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class da implements TextView.OnEditorActionListener {
    public final int f37432a;
    public final Object f37433b;

    public da(Object obj, int i10) {
        this.f37432a = i10;
        this.f37433b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.w0 w0Var;
        org.telegram.ui.Cells.s1 s1Var;
        org.telegram.ui.ActionBar.w0 w0Var2;
        switch (this.f37432a) {
            case 0:
                fa faVar = (fa) this.f37433b;
                if (i10 == 6 && (w0Var = faVar.f38084c.f40139a) != null) {
                    w0Var.performClick();
                    return true;
                }
                return false;
            case 1:
                tn tnVar = (tn) this.f37433b;
                if (i10 == 6) {
                    bh.f fVar = tnVar.f43049yc;
                    if (fVar != null && (s1Var = fVar.f2659n) != null) {
                        tnVar.ua(s1Var);
                        return true;
                    }
                } else {
                    tnVar.getClass();
                }
                return false;
            case 2:
                ko koVar = (ko) this.f37433b;
                if (i10 == 6 && (w0Var2 = koVar.f39938a) != null) {
                    w0Var2.performClick();
                    return true;
                }
                return false;
            case 3:
                sr srVar = (sr) this.f37433b;
                if (i10 == 5) {
                    srVar.a();
                    return true;
                }
                srVar.getClass();
                return false;
            case 4:
                m60 m60Var = (m60) this.f37433b;
                if (i10 == 6 && m60Var.o0()) {
                    return true;
                }
                return false;
            case 5:
                xd0 xd0Var = (xd0) this.f37433b;
                if (i10 == 5) {
                    xd0Var.h(null);
                    return true;
                }
                xd0Var.getClass();
                return false;
            case 6:
                fe0 fe0Var = (fe0) this.f37433b;
                if (i10 == 5) {
                    fe0Var.h(null);
                    return true;
                }
                fe0Var.getClass();
                return false;
            case 7:
                te0 te0Var = (te0) this.f37433b;
                if (i10 == 5) {
                    te0Var.h(null);
                    return true;
                }
                te0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f37433b;
                int i11 = passcodeActivity.A;
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
                rm0 rm0Var = (rm0) this.f37433b;
                if (i10 == 5) {
                    rm0Var.h(null);
                    return true;
                }
                rm0Var.getClass();
                return false;
            case 10:
                l11 l11Var = (l11) this.f37433b;
                l11Var.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = l11Var.f40053a;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    editTextBoldCursorArr[intValue].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    l11Var.finishFragment();
                    return true;
                } else {
                    return false;
                }
            case 11:
                n61 n61Var = (n61) this.f37433b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(n61Var.Y);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f37433b;
                twoStepVerificationActivity.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                twoStepVerificationActivity.t0();
                return true;
        }
    }
}
