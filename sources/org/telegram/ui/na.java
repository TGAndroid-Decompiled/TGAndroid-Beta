package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class na implements TextView.OnEditorActionListener {
    public final int f38342a;
    public final Object f38343b;

    public na(Object obj, int i10) {
        this.f38342a = i10;
        this.f38343b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.u0 u0Var;
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.ActionBar.u0 u0Var2;
        switch (this.f38342a) {
            case 0:
                pa paVar = (pa) this.f38343b;
                if (i10 == 6 && (u0Var = paVar.f38862c.f40622a) != null) {
                    u0Var.performClick();
                    return true;
                }
                return false;
            case 1:
                fo foVar = (fo) this.f38343b;
                if (i10 == 6) {
                    rh.c cVar = foVar.Cc;
                    if (cVar != null && (u1Var = cVar.f44415n) != null) {
                        foVar.ya(u1Var);
                        return true;
                    }
                } else {
                    foVar.getClass();
                }
                return false;
            case 2:
                zo zoVar = (zo) this.f38343b;
                if (i10 == 6 && (u0Var2 = zoVar.f42363a) != null) {
                    u0Var2.performClick();
                    return true;
                }
                return false;
            case 3:
                hs hsVar = (hs) this.f38343b;
                if (i10 == 5) {
                    hsVar.a();
                    return true;
                }
                hsVar.getClass();
                return false;
            case 4:
                j70 j70Var = (j70) this.f38343b;
                if (i10 == 6 && j70Var.o0()) {
                    return true;
                }
                return false;
            case 5:
                te0 te0Var = (te0) this.f38343b;
                if (i10 == 5) {
                    te0Var.h(null);
                    return true;
                }
                te0Var.getClass();
                return false;
            case 6:
                bf0 bf0Var = (bf0) this.f38343b;
                if (i10 == 5) {
                    bf0Var.h(null);
                    return true;
                }
                bf0Var.getClass();
                return false;
            case 7:
                pf0 pf0Var = (pf0) this.f38343b;
                if (i10 == 5) {
                    pf0Var.h(null);
                    return true;
                }
                pf0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f38343b;
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
                on0 on0Var = (on0) this.f38343b;
                if (i10 == 5) {
                    on0Var.h(null);
                    return true;
                }
                on0Var.getClass();
                return false;
            case 10:
                v21 v21Var = (v21) this.f38343b;
                v21Var.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = v21Var.f40556a;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    editTextBoldCursorArr[intValue].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    v21Var.finishFragment();
                    return true;
                } else {
                    return false;
                }
            case 11:
                b81 b81Var = (b81) this.f38343b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(b81Var.f34235c0);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f38343b;
                twoStepVerificationActivity.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                twoStepVerificationActivity.t0();
                return true;
        }
    }
}
