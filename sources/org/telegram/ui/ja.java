package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ja implements TextView.OnEditorActionListener {
    public final int f34880a;
    public final Object f34881b;

    public ja(Object obj, int i10) {
        this.f34880a = i10;
        this.f34881b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.v0 v0Var;
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.ActionBar.v0 v0Var2;
        switch (this.f34880a) {
            case 0:
                la laVar = (la) this.f34881b;
                if (i10 == 6 && (v0Var = laVar.f35385c.f37078a) != null) {
                    v0Var.performClick();
                    return true;
                }
                return false;
            case 1:
                zn znVar = (zn) this.f34881b;
                if (i10 == 6) {
                    qh.c cVar = znVar.Bc;
                    if (cVar != null && (u1Var = cVar.f42055n) != null) {
                        znVar.ua(u1Var);
                        return true;
                    }
                } else {
                    znVar.getClass();
                }
                return false;
            case 2:
                uo uoVar = (uo) this.f34881b;
                if (i10 == 6 && (v0Var2 = uoVar.f38143a) != null) {
                    v0Var2.performClick();
                    return true;
                }
                return false;
            case 3:
                ds dsVar = (ds) this.f34881b;
                if (i10 == 5) {
                    dsVar.a();
                    return true;
                }
                dsVar.getClass();
                return false;
            case 4:
                e70 e70Var = (e70) this.f34881b;
                if (i10 == 6 && e70Var.o0()) {
                    return true;
                }
                return false;
            case 5:
                re0 re0Var = (re0) this.f34881b;
                if (i10 == 5) {
                    re0Var.h(null);
                    return true;
                }
                re0Var.getClass();
                return false;
            case 6:
                ze0 ze0Var = (ze0) this.f34881b;
                if (i10 == 5) {
                    ze0Var.h(null);
                    return true;
                }
                ze0Var.getClass();
                return false;
            case 7:
                nf0 nf0Var = (nf0) this.f34881b;
                if (i10 == 5) {
                    nf0Var.h(null);
                    return true;
                }
                nf0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f34881b;
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
                ln0 ln0Var = (ln0) this.f34881b;
                if (i10 == 5) {
                    ln0Var.h(null);
                    return true;
                }
                ln0Var.getClass();
                return false;
            case 10:
                o21 o21Var = (o21) this.f34881b;
                o21Var.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = o21Var.f36171a;
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
                t71 t71Var = (t71) this.f34881b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(t71Var.f37667c0);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f34881b;
                twoStepVerificationActivity.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                twoStepVerificationActivity.t0();
                return true;
        }
    }
}
