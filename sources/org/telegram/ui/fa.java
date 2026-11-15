package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fa implements TextView.OnEditorActionListener {
    public final int f47079a;
    public final Object f47080b;

    public fa(Object obj, int i7) {
        this.f47079a = i7;
        this.f47080b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.f47079a) {
            case 0:
                ga gaVar = (ga) this.f47080b;
                if (i7 == 6) {
                    org.telegram.ui.ActionBar.z4 z4Var = gaVar.f47382c.f48906a;
                    if (z4Var != null) {
                        z4Var.performClick();
                        return true;
                    }
                } else {
                    gaVar.getClass();
                }
                return false;
            case 1:
                an anVar = (an) this.f47080b;
                if (i7 == 6) {
                    sh.b bVar = anVar.f45251jd;
                    if (bVar != null && (q1Var = bVar.f56851n) != null) {
                        anVar.Wa(q1Var);
                        return true;
                    }
                } else {
                    anVar.getClass();
                }
                return false;
            case 2:
                qn qnVar = (qn) this.f47080b;
                if (i7 == 6) {
                    org.telegram.ui.ActionBar.z4 z4Var2 = qnVar.f50660a;
                    if (z4Var2 != null) {
                        z4Var2.performClick();
                        return true;
                    }
                } else {
                    qnVar.getClass();
                }
                return false;
            case 3:
                ar arVar = (ar) this.f47080b;
                if (i7 == 5) {
                    arVar.a();
                    return true;
                }
                arVar.getClass();
                return false;
            case 4:
                w40 w40Var = (w40) this.f47080b;
                if (i7 == 6 && w40Var.t0()) {
                    return true;
                }
                return false;
            case 5:
                wb0 wb0Var = (wb0) this.f47080b;
                if (i7 == 5) {
                    wb0Var.h(null);
                    return true;
                }
                wb0Var.getClass();
                return false;
            case 6:
                dc0 dc0Var = (dc0) this.f47080b;
                if (i7 == 5) {
                    dc0Var.h(null);
                    return true;
                }
                dc0Var.getClass();
                return false;
            case 7:
                rc0 rc0Var = (rc0) this.f47080b;
                if (i7 == 5) {
                    rc0Var.h(null);
                    return true;
                }
                rc0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f47080b;
                int i10 = passcodeActivity.F;
                if (i10 == 0) {
                    passcodeActivity.v0();
                    return true;
                } else if (i10 == 1) {
                    passcodeActivity.u0();
                    return true;
                } else {
                    return false;
                }
            case 9:
                ak0 ak0Var = (ak0) this.f47080b;
                if (i7 == 5) {
                    ak0Var.h(null);
                    return true;
                }
                ak0Var.getClass();
                return false;
            case 10:
                tx0 tx0Var = (tx0) this.f47080b;
                tx0Var.getClass();
                if (i7 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = tx0Var.f51686a;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    editTextBoldCursorArr[intValue].requestFocus();
                    return true;
                } else if (i7 == 6) {
                    tx0Var.finishFragment();
                    return true;
                } else {
                    return false;
                }
            case 11:
                x11 x11Var = (x11) this.f47080b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(x11Var.Y1);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f47080b;
                twoStepVerificationActivity.getClass();
                if (i7 != 5 && i7 != 6) {
                    return false;
                }
                twoStepVerificationActivity.y0();
                return true;
        }
    }
}
