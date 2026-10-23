package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ka implements TextView.OnEditorActionListener {
    public final int f38911a;
    public final Object f38912b;

    public ka(Object obj, int i10) {
        this.f38911a = i10;
        this.f38912b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.u0 u0Var;
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.ActionBar.u0 u0Var2;
        switch (this.f38911a) {
            case 0:
                ma maVar = (ma) this.f38912b;
                if (i10 == 6 && (u0Var = maVar.f39461c.f41331a) != null) {
                    u0Var.performClick();
                    return true;
                }
                return false;
            case 1:
                sn snVar = (sn) this.f38912b;
                if (i10 == 6) {
                    rh.c cVar = snVar.Qc;
                    if (cVar != null && (t1Var = cVar.f46171n) != null) {
                        snVar.ya(t1Var);
                        return true;
                    }
                } else {
                    snVar.getClass();
                }
                return false;
            case 2:
                ko koVar = (ko) this.f38912b;
                if (i10 == 6 && (u0Var2 = koVar.f38983a) != null) {
                    u0Var2.performClick();
                    return true;
                }
                return false;
            case 3:
                sr srVar = (sr) this.f38912b;
                if (i10 == 5) {
                    srVar.a();
                    return true;
                }
                srVar.getClass();
                return false;
            case 4:
                p60 p60Var = (p60) this.f38912b;
                if (i10 == 6 && p60Var.o0()) {
                    return true;
                }
                return false;
            case 5:
                be0 be0Var = (be0) this.f38912b;
                if (i10 == 5) {
                    be0Var.h(null);
                    return true;
                }
                be0Var.getClass();
                return false;
            case 6:
                je0 je0Var = (je0) this.f38912b;
                if (i10 == 5) {
                    je0Var.h(null);
                    return true;
                }
                je0Var.getClass();
                return false;
            case 7:
                ye0 ye0Var = (ye0) this.f38912b;
                if (i10 == 5) {
                    ye0Var.h(null);
                    return true;
                }
                ye0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f38912b;
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
                wm0 wm0Var = (wm0) this.f38912b;
                if (i10 == 5) {
                    wm0Var.h(null);
                    return true;
                }
                wm0Var.getClass();
                return false;
            case 10:
                w11 w11Var = (w11) this.f38912b;
                w11Var.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = w11Var.f42891a;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    editTextBoldCursorArr[intValue].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    w11Var.finishFragment();
                    return true;
                } else {
                    return false;
                }
            case 11:
                l61 l61Var = (l61) this.f38912b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(l61Var.f39142c0);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f38912b;
                twoStepVerificationActivity.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                twoStepVerificationActivity.t0();
                return true;
        }
    }
}
