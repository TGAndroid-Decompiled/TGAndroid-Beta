package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ja implements TextView.OnEditorActionListener {
    public final int f34063a;
    public final Object f34064b;

    public ja(Object obj, int i10) {
        this.f34063a = i10;
        this.f34064b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.w0 w0Var;
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.ActionBar.w0 w0Var2;
        switch (this.f34063a) {
            case 0:
                la laVar = (la) this.f34064b;
                if (i10 == 6 && (w0Var = laVar.f34627c.f36272a) != null) {
                    w0Var.performClick();
                    return true;
                }
                return false;
            case 1:
                eo eoVar = (eo) this.f34064b;
                if (i10 == 6) {
                    ph.c cVar = eoVar.Cc;
                    if (cVar != null && (t1Var = cVar.f40399n) != null) {
                        eoVar.ua(t1Var);
                        return true;
                    }
                } else {
                    eoVar.getClass();
                }
                return false;
            case 2:
                yo yoVar = (yo) this.f34064b;
                if (i10 == 6 && (w0Var2 = yoVar.f39039a) != null) {
                    w0Var2.performClick();
                    return true;
                }
                return false;
            case 3:
                fs fsVar = (fs) this.f34064b;
                if (i10 == 5) {
                    fsVar.a();
                    return true;
                }
                fsVar.getClass();
                return false;
            case 4:
                e70 e70Var = (e70) this.f34064b;
                if (i10 == 6 && e70Var.o0()) {
                    return true;
                }
                return false;
            case 5:
                pe0 pe0Var = (pe0) this.f34064b;
                if (i10 == 5) {
                    pe0Var.h(null);
                    return true;
                }
                pe0Var.getClass();
                return false;
            case 6:
                xe0 xe0Var = (xe0) this.f34064b;
                if (i10 == 5) {
                    xe0Var.h(null);
                    return true;
                }
                xe0Var.getClass();
                return false;
            case 7:
                lf0 lf0Var = (lf0) this.f34064b;
                if (i10 == 5) {
                    lf0Var.h(null);
                    return true;
                }
                lf0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f34064b;
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
                kn0 kn0Var = (kn0) this.f34064b;
                if (i10 == 5) {
                    kn0Var.h(null);
                    return true;
                }
                kn0Var.getClass();
                return false;
            case 10:
                u21 u21Var = (u21) this.f34064b;
                u21Var.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = u21Var.f37089a;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    editTextBoldCursorArr[intValue].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    u21Var.finishFragment();
                    return true;
                } else {
                    return false;
                }
            case 11:
                v71 v71Var = (v71) this.f34064b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(v71Var.f37436c0);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f34064b;
                twoStepVerificationActivity.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                twoStepVerificationActivity.t0();
                return true;
        }
    }
}
