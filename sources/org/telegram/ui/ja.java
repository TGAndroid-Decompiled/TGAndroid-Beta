package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ja implements TextView.OnEditorActionListener {
    public final int f34765a;
    public final Object f34766b;

    public ja(Object obj, int i10) {
        this.f34765a = i10;
        this.f34766b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.v0 v0Var;
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.ActionBar.v0 v0Var2;
        switch (this.f34765a) {
            case 0:
                la laVar = (la) this.f34766b;
                if (i10 == 6 && (v0Var = laVar.f35317c.f37001a) != null) {
                    v0Var.performClick();
                    return true;
                }
                return false;
            case 1:
                zn znVar = (zn) this.f34766b;
                if (i10 == 6) {
                    qh.c cVar = znVar.Bc;
                    if (cVar != null && (u1Var = cVar.f42010n) != null) {
                        znVar.ua(u1Var);
                        return true;
                    }
                } else {
                    znVar.getClass();
                }
                return false;
            case 2:
                uo uoVar = (uo) this.f34766b;
                if (i10 == 6 && (v0Var2 = uoVar.f38034a) != null) {
                    v0Var2.performClick();
                    return true;
                }
                return false;
            case 3:
                ds dsVar = (ds) this.f34766b;
                if (i10 == 5) {
                    dsVar.a();
                    return true;
                }
                dsVar.getClass();
                return false;
            case 4:
                e70 e70Var = (e70) this.f34766b;
                if (i10 == 6 && e70Var.o0()) {
                    return true;
                }
                return false;
            case 5:
                qe0 qe0Var = (qe0) this.f34766b;
                if (i10 == 5) {
                    qe0Var.h(null);
                    return true;
                }
                qe0Var.getClass();
                return false;
            case 6:
                ye0 ye0Var = (ye0) this.f34766b;
                if (i10 == 5) {
                    ye0Var.h(null);
                    return true;
                }
                ye0Var.getClass();
                return false;
            case 7:
                mf0 mf0Var = (mf0) this.f34766b;
                if (i10 == 5) {
                    mf0Var.h(null);
                    return true;
                }
                mf0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f34766b;
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
                ln0 ln0Var = (ln0) this.f34766b;
                if (i10 == 5) {
                    ln0Var.h(null);
                    return true;
                }
                ln0Var.getClass();
                return false;
            case 10:
                o21 o21Var = (o21) this.f34766b;
                o21Var.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = o21Var.f36094a;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    editTextBoldCursorArr[intValue].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    o21Var.finishFragment();
                    return true;
                } else {
                    return false;
                }
            case 11:
                q71 q71Var = (q71) this.f34766b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(q71Var.f36712c0);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f34766b;
                twoStepVerificationActivity.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                twoStepVerificationActivity.t0();
                return true;
        }
    }
}
