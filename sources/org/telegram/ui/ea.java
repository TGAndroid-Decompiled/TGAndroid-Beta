package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ea implements TextView.OnEditorActionListener {
    public final int f44942a;
    public final Object f44943b;

    public ea(Object obj, int i3) {
        this.f44942a = i3;
        this.f44943b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.f44942a) {
            case 0:
                fa faVar = (fa) this.f44943b;
                if (i3 == 6) {
                    org.telegram.ui.ActionBar.b5 b5Var = faVar.f45227c.f46838a;
                    if (b5Var != null) {
                        b5Var.performClick();
                        return true;
                    }
                } else {
                    faVar.getClass();
                }
                return false;
            case 1:
                wm wmVar = (wm) this.f44943b;
                if (i3 == 6) {
                    th.b bVar = wmVar.f51345hd;
                    if (bVar != null && (q1Var = bVar.f55392n) != null) {
                        wmVar.Ta(q1Var);
                        return true;
                    }
                } else {
                    wmVar.getClass();
                }
                return false;
            case 2:
                ln lnVar = (ln) this.f44943b;
                if (i3 == 6) {
                    org.telegram.ui.ActionBar.b5 b5Var2 = lnVar.f47364a;
                    if (b5Var2 != null) {
                        b5Var2.performClick();
                        return true;
                    }
                } else {
                    lnVar.getClass();
                }
                return false;
            case 3:
                xq xqVar = (xq) this.f44943b;
                if (i3 == 5) {
                    xqVar.a();
                    return true;
                }
                xqVar.getClass();
                return false;
            case 4:
                r40 r40Var = (r40) this.f44943b;
                if (i3 == 6 && r40Var.t0()) {
                    return true;
                }
                return false;
            case 5:
                vb0 vb0Var = (vb0) this.f44943b;
                if (i3 == 5) {
                    vb0Var.h(null);
                    return true;
                }
                vb0Var.getClass();
                return false;
            case 6:
                cc0 cc0Var = (cc0) this.f44943b;
                if (i3 == 5) {
                    cc0Var.h(null);
                    return true;
                }
                cc0Var.getClass();
                return false;
            case 7:
                qc0 qc0Var = (qc0) this.f44943b;
                if (i3 == 5) {
                    qc0Var.h(null);
                    return true;
                }
                qc0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f44943b;
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
                uj0 uj0Var = (uj0) this.f44943b;
                if (i3 == 5) {
                    uj0Var.h(null);
                    return true;
                }
                uj0Var.getClass();
                return false;
            case 10:
                mx0 mx0Var = (mx0) this.f44943b;
                mx0Var.getClass();
                if (i3 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = mx0Var.f47810a;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    editTextBoldCursorArr[intValue].requestFocus();
                    return true;
                } else if (i3 == 6) {
                    mx0Var.finishFragment();
                    return true;
                } else {
                    return false;
                }
            case 11:
                q11 q11Var = (q11) this.f44943b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(q11Var.V1);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f44943b;
                twoStepVerificationActivity.getClass();
                if (i3 != 5 && i3 != 6) {
                    return false;
                }
                twoStepVerificationActivity.y0();
                return true;
        }
    }
}
