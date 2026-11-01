package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ha implements TextView.OnEditorActionListener {
    public final int f37765a;
    public final Object f37766b;

    public ha(Object obj, int i10) {
        this.f37765a = i10;
        this.f37766b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.f37765a) {
            case 0:
                ia iaVar = (ia) this.f37766b;
                if (i10 == 6) {
                    org.telegram.ui.ActionBar.l5 l5Var = iaVar.f37987c.f40110a;
                    if (l5Var != null) {
                        l5Var.performClick();
                        return true;
                    }
                } else {
                    iaVar.getClass();
                }
                return false;
            case 1:
                un unVar = (un) this.f37766b;
                if (i10 == 6) {
                    ih.d dVar = unVar.Zc;
                    if (dVar != null && (q1Var = dVar.f8528n) != null) {
                        unVar.Oa(q1Var);
                        return true;
                    }
                } else {
                    unVar.getClass();
                }
                return false;
            case 2:
                oo ooVar = (oo) this.f37766b;
                if (i10 == 6) {
                    org.telegram.ui.ActionBar.l5 l5Var2 = ooVar.f40203a;
                    if (l5Var2 != null) {
                        l5Var2.performClick();
                        return true;
                    }
                } else {
                    ooVar.getClass();
                }
                return false;
            case 3:
                zr zrVar = (zr) this.f37766b;
                if (i10 == 5) {
                    zrVar.a();
                    return true;
                }
                zrVar.getClass();
                return false;
            case 4:
                u50 u50Var = (u50) this.f37766b;
                if (i10 == 6 && u50Var.t0()) {
                    return true;
                }
                return false;
            case 5:
                dd0 dd0Var = (dd0) this.f37766b;
                if (i10 == 5) {
                    dd0Var.h(null);
                    return true;
                }
                dd0Var.getClass();
                return false;
            case 6:
                kd0 kd0Var = (kd0) this.f37766b;
                if (i10 == 5) {
                    kd0Var.h(null);
                    return true;
                }
                kd0Var.getClass();
                return false;
            case 7:
                yd0 yd0Var = (yd0) this.f37766b;
                if (i10 == 5) {
                    yd0Var.h(null);
                    return true;
                }
                yd0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f37766b;
                int i11 = passcodeActivity.E;
                if (i11 == 0) {
                    passcodeActivity.v0();
                    return true;
                } else if (i11 == 1) {
                    passcodeActivity.u0();
                    return true;
                } else {
                    return false;
                }
            case 9:
                fl0 fl0Var = (fl0) this.f37766b;
                if (i10 == 5) {
                    fl0Var.h(null);
                    return true;
                }
                fl0Var.getClass();
                return false;
            case 10:
                iz0 iz0Var = (iz0) this.f37766b;
                iz0Var.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = iz0Var.f38218a;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    editTextBoldCursorArr[intValue].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    iz0Var.finishFragment();
                    return true;
                } else {
                    return false;
                }
            case 11:
                q31 q31Var = (q31) this.f37766b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.i0.v1(q31Var.U1);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f37766b;
                twoStepVerificationActivity.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                twoStepVerificationActivity.y0();
                return true;
        }
    }
}
