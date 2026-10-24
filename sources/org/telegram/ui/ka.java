package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ka implements TextView.OnEditorActionListener {
    public final int f38880a;
    public final Object f38881b;

    public ka(Object obj, int i10) {
        this.f38880a = i10;
        this.f38881b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.u0 u0Var;
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.ActionBar.u0 u0Var2;
        switch (this.f38880a) {
            case 0:
                ma maVar = (ma) this.f38881b;
                if (i10 == 6 && (u0Var = maVar.f39523c.f41326a) != null) {
                    u0Var.performClick();
                    return true;
                }
                return false;
            case 1:
                sn snVar = (sn) this.f38881b;
                if (i10 == 6) {
                    rh.c cVar = snVar.Qc;
                    if (cVar != null && (t1Var = cVar.f46170n) != null) {
                        snVar.ya(t1Var);
                        return true;
                    }
                } else {
                    snVar.getClass();
                }
                return false;
            case 2:
                ko koVar = (ko) this.f38881b;
                if (i10 == 6 && (u0Var2 = koVar.f38951a) != null) {
                    u0Var2.performClick();
                    return true;
                }
                return false;
            case 3:
                sr srVar = (sr) this.f38881b;
                if (i10 == 5) {
                    srVar.a();
                    return true;
                }
                srVar.getClass();
                return false;
            case 4:
                p60 p60Var = (p60) this.f38881b;
                if (i10 == 6 && p60Var.o0()) {
                    return true;
                }
                return false;
            case 5:
                ae0 ae0Var = (ae0) this.f38881b;
                if (i10 == 5) {
                    ae0Var.h(null);
                    return true;
                }
                ae0Var.getClass();
                return false;
            case 6:
                ie0 ie0Var = (ie0) this.f38881b;
                if (i10 == 5) {
                    ie0Var.h(null);
                    return true;
                }
                ie0Var.getClass();
                return false;
            case 7:
                xe0 xe0Var = (xe0) this.f38881b;
                if (i10 == 5) {
                    xe0Var.h(null);
                    return true;
                }
                xe0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f38881b;
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
                vm0 vm0Var = (vm0) this.f38881b;
                if (i10 == 5) {
                    vm0Var.h(null);
                    return true;
                }
                vm0Var.getClass();
                return false;
            case 10:
                v11 v11Var = (v11) this.f38881b;
                v11Var.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = v11Var.f42536a;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    editTextBoldCursorArr[intValue].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    v11Var.finishFragment();
                    return true;
                } else {
                    return false;
                }
            case 11:
                k61 k61Var = (k61) this.f38881b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(k61Var.f38802c0);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f38881b;
                twoStepVerificationActivity.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                twoStepVerificationActivity.t0();
                return true;
        }
    }
}
