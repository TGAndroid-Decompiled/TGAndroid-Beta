package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ha implements TextView.OnEditorActionListener {
    public final int f37878a;
    public final Object f37879b;

    public ha(Object obj, int i10) {
        this.f37878a = i10;
        this.f37879b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.f37878a) {
            case 0:
                ia iaVar = (ia) this.f37879b;
                if (i10 == 6) {
                    org.telegram.ui.ActionBar.l5 l5Var = iaVar.f38220c.f40205a;
                    if (l5Var != null) {
                        l5Var.performClick();
                        return true;
                    }
                } else {
                    iaVar.getClass();
                }
                return false;
            case 1:
                un unVar = (un) this.f37879b;
                if (i10 == 6) {
                    ih.d dVar = unVar.Yc;
                    if (dVar != null && (q1Var = dVar.f8527n) != null) {
                        unVar.Ja(q1Var);
                        return true;
                    }
                } else {
                    unVar.getClass();
                }
                return false;
            case 2:
                oo ooVar = (oo) this.f37879b;
                if (i10 == 6) {
                    org.telegram.ui.ActionBar.l5 l5Var2 = ooVar.f40314a;
                    if (l5Var2 != null) {
                        l5Var2.performClick();
                        return true;
                    }
                } else {
                    ooVar.getClass();
                }
                return false;
            case 3:
                zr zrVar = (zr) this.f37879b;
                if (i10 == 5) {
                    zrVar.a();
                    return true;
                }
                zrVar.getClass();
                return false;
            case 4:
                v50 v50Var = (v50) this.f37879b;
                if (i10 == 6 && v50Var.s0()) {
                    return true;
                }
                return false;
            case 5:
                ed0 ed0Var = (ed0) this.f37879b;
                if (i10 == 5) {
                    ed0Var.h(null);
                    return true;
                }
                ed0Var.getClass();
                return false;
            case 6:
                ld0 ld0Var = (ld0) this.f37879b;
                if (i10 == 5) {
                    ld0Var.h(null);
                    return true;
                }
                ld0Var.getClass();
                return false;
            case 7:
                zd0 zd0Var = (zd0) this.f37879b;
                if (i10 == 5) {
                    zd0Var.h(null);
                    return true;
                }
                zd0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f37879b;
                int i11 = passcodeActivity.E;
                if (i11 == 0) {
                    passcodeActivity.u0();
                    return true;
                } else if (i11 == 1) {
                    passcodeActivity.t0();
                    return true;
                } else {
                    return false;
                }
            case 9:
                hl0 hl0Var = (hl0) this.f37879b;
                if (i10 == 5) {
                    hl0Var.h(null);
                    return true;
                }
                hl0Var.getClass();
                return false;
            case 10:
                jz0 jz0Var = (jz0) this.f37879b;
                jz0Var.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = jz0Var.f38635a;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    editTextBoldCursorArr[intValue].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    jz0Var.finishFragment();
                    return true;
                } else {
                    return false;
                }
            case 11:
                s31 s31Var = (s31) this.f37879b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.i0.v1(s31Var.U1);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f37879b;
                twoStepVerificationActivity.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                twoStepVerificationActivity.x0();
                return true;
        }
    }
}
