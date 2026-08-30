package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ha implements TextView.OnEditorActionListener {
    public final int f34800a;
    public final Object f34801b;

    public ha(Object obj, int i10) {
        this.f34800a = i10;
        this.f34801b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.w0 w0Var;
        org.telegram.ui.Cells.t1 t1Var;
        org.telegram.ui.ActionBar.w0 w0Var2;
        switch (this.f34800a) {
            case 0:
                ja jaVar = (ja) this.f34801b;
                if (i10 == 6 && (w0Var = jaVar.f35305c.f37251a) != null) {
                    w0Var.performClick();
                    return true;
                }
                return false;
            case 1:
                xn xnVar = (xn) this.f34801b;
                if (i10 == 6) {
                    dh.f fVar = xnVar.f40270zc;
                    if (fVar != null && (t1Var = fVar.f4895n) != null) {
                        xnVar.ua(t1Var);
                        return true;
                    }
                } else {
                    xnVar.getClass();
                }
                return false;
            case 2:
                po poVar = (po) this.f34801b;
                if (i10 == 6 && (w0Var2 = poVar.f37380a) != null) {
                    w0Var2.performClick();
                    return true;
                }
                return false;
            case 3:
                yr yrVar = (yr) this.f34801b;
                if (i10 == 5) {
                    yrVar.a();
                    return true;
                }
                yrVar.getClass();
                return false;
            case 4:
                y60 y60Var = (y60) this.f34801b;
                if (i10 == 6 && y60Var.o0()) {
                    return true;
                }
                return false;
            case 5:
                he0 he0Var = (he0) this.f34801b;
                if (i10 == 5) {
                    he0Var.h(null);
                    return true;
                }
                he0Var.getClass();
                return false;
            case 6:
                pe0 pe0Var = (pe0) this.f34801b;
                if (i10 == 5) {
                    pe0Var.h(null);
                    return true;
                }
                pe0Var.getClass();
                return false;
            case 7:
                df0 df0Var = (df0) this.f34801b;
                if (i10 == 5) {
                    df0Var.h(null);
                    return true;
                }
                df0Var.getClass();
                return false;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f34801b;
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
                zm0 zm0Var = (zm0) this.f34801b;
                if (i10 == 5) {
                    zm0Var.h(null);
                    return true;
                }
                zm0Var.getClass();
                return false;
            case 10:
                w11 w11Var = (w11) this.f34801b;
                w11Var.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = w11Var.f39299a;
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
                b71 b71Var = (b71) this.f34801b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(b71Var.Z);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f34801b;
                twoStepVerificationActivity.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                twoStepVerificationActivity.t0();
                return true;
        }
    }
}
