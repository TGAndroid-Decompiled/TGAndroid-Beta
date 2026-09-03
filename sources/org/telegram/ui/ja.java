package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ja implements TextView.OnEditorActionListener {
    public final int f35132a;
    public final Object f35133b;

    public ja(Object obj, int i10) {
        this.f35132a = i10;
        this.f35133b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.w0 w0Var;
        org.telegram.ui.Cells.s1 s1Var;
        org.telegram.ui.ActionBar.w0 w0Var2;
        switch (this.f35132a) {
            case 0:
                la laVar = (la) this.f35133b;
                if (i10 == 6 && (w0Var = laVar.f35722c.f37775a) != null) {
                    w0Var.performClick();
                    return true;
                }
                return false;
            case 1:
                zn znVar = (zn) this.f35133b;
                if (i10 == 6) {
                    dh.f fVar = znVar.f40836zc;
                    if (fVar != null && (s1Var = fVar.f4901n) != null) {
                        znVar.ua(s1Var);
                        return true;
                    }
                } else {
                    znVar.getClass();
                }
                return false;
            case 2:
                ro roVar = (ro) this.f35133b;
                if (i10 == 6 && (w0Var2 = roVar.f37900a) != null) {
                    w0Var2.performClick();
                    return true;
                }
                return false;
            case 3:
                as asVar = (as) this.f35133b;
                if (i10 == 5) {
                    asVar.a();
                    return true;
                }
                asVar.getClass();
                return false;
            case 4:
                a70 a70Var = (a70) this.f35133b;
                if (i10 == 6 && a70Var.o0()) {
                    return true;
                }
                return false;
            case 5:
                je0 je0Var = (je0) this.f35133b;
                if (i10 == 5) {
                    je0Var.h(null);
                    return true;
                }
                je0Var.getClass();
                return false;
            case 6:
                re0 re0Var = (re0) this.f35133b;
                if (i10 == 5) {
                    re0Var.h(null);
                    return true;
                }
                re0Var.getClass();
                return false;
            case 7:
                ff0 ff0Var = (ff0) this.f35133b;
                if (i10 == 5) {
                    ff0Var.h(null);
                    return true;
                }
                ff0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f35133b;
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
                bn0 bn0Var = (bn0) this.f35133b;
                if (i10 == 5) {
                    bn0Var.h(null);
                    return true;
                }
                bn0Var.getClass();
                return false;
            case 10:
                d21 d21Var = (d21) this.f35133b;
                d21Var.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = d21Var.f33303a;
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
                i71 i71Var = (i71) this.f35133b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(i71Var.Z);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f35133b;
                twoStepVerificationActivity.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                twoStepVerificationActivity.t0();
                return true;
        }
    }
}
