package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ka implements TextView.OnEditorActionListener {
    public final int f38491a;
    public final Object f38492b;

    public ka(Object obj, int i10) {
        this.f38491a = i10;
        this.f38492b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.u0 u0Var;
        org.telegram.ui.Cells.u1 u1Var;
        org.telegram.ui.ActionBar.u0 u0Var2;
        switch (this.f38491a) {
            case 0:
                ma maVar = (ma) this.f38492b;
                if (i10 == 6 && (u0Var = maVar.f39159c.f41405a) != null) {
                    u0Var.performClick();
                    return true;
                }
                return false;
            case 1:
                qn qnVar = (qn) this.f38492b;
                if (i10 == 6) {
                    rh.c cVar = qnVar.Dc;
                    if (cVar != null && (u1Var = cVar.f45738n) != null) {
                        qnVar.ya(u1Var);
                        return true;
                    }
                } else {
                    qnVar.getClass();
                }
                return false;
            case 2:
                io ioVar = (io) this.f38492b;
                if (i10 == 6 && (u0Var2 = ioVar.f38026a) != null) {
                    u0Var2.performClick();
                    return true;
                }
                return false;
            case 3:
                qr qrVar = (qr) this.f38492b;
                if (i10 == 5) {
                    qrVar.a();
                    return true;
                }
                qrVar.getClass();
                return false;
            case 4:
                l60 l60Var = (l60) this.f38492b;
                if (i10 == 6 && l60Var.o0()) {
                    return true;
                }
                return false;
            case 5:
                vd0 vd0Var = (vd0) this.f38492b;
                if (i10 == 5) {
                    vd0Var.h(null);
                    return true;
                }
                vd0Var.getClass();
                return false;
            case 6:
                de0 de0Var = (de0) this.f38492b;
                if (i10 == 5) {
                    de0Var.h(null);
                    return true;
                }
                de0Var.getClass();
                return false;
            case 7:
                re0 re0Var = (re0) this.f38492b;
                if (i10 == 5) {
                    re0Var.h(null);
                    return true;
                }
                re0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f38492b;
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
                rm0 rm0Var = (rm0) this.f38492b;
                if (i10 == 5) {
                    rm0Var.h(null);
                    return true;
                }
                rm0Var.getClass();
                return false;
            case 10:
                s11 s11Var = (s11) this.f38492b;
                s11Var.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = s11Var.f41309a;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    editTextBoldCursorArr[intValue].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    s11Var.finishFragment();
                    return true;
                } else {
                    return false;
                }
            case 11:
                h61 h61Var = (h61) this.f38492b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(h61Var.f37501c0);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f38492b;
                twoStepVerificationActivity.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                twoStepVerificationActivity.t0();
                return true;
        }
    }
}
