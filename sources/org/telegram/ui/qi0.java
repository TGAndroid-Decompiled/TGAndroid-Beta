package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class qi0 implements TextView.OnEditorActionListener {
    public final int f49066a;
    public final dk0 f49067b;

    public qi0(dk0 dk0Var, int i7) {
        this.f49066a = i7;
        this.f49067b = dk0Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f49066a) {
            case 0:
                dk0 dk0Var = this.f49067b;
                if (i7 == 5) {
                    dk0Var.Y[2].requestFocus();
                    return true;
                } else if (i7 == 6) {
                    dk0Var.L.callOnClick();
                    return true;
                } else {
                    dk0Var.getClass();
                    return false;
                }
            case 1:
                dk0 dk0Var2 = this.f49067b;
                dk0Var2.getClass();
                if (i7 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = dk0Var2.Y;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr[intValue].isFocusable()) {
                        dk0Var2.Y[intValue].requestFocus();
                        return true;
                    }
                    dk0Var2.Y[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    org.telegram.messenger.g0.v1(textView);
                    return true;
                }
                return false;
            case 2:
                dk0 dk0Var3 = this.f49067b;
                dk0Var3.getClass();
                if (i7 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = dk0Var3.f44992a0;
                    if (intValue2 >= editTextBoldCursorArr2.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr2[intValue2].isFocusable()) {
                        dk0Var3.f44992a0[intValue2].requestFocus();
                        return true;
                    }
                    dk0Var3.f44992a0[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    org.telegram.messenger.g0.v1(textView);
                    return true;
                }
                return false;
            case 3:
                dk0 dk0Var4 = this.f49067b;
                dk0Var4.getClass();
                if (i7 != 6 && i7 != 5) {
                    return false;
                }
                dk0Var4.L.callOnClick();
                return true;
            case 4:
                dk0 dk0Var5 = this.f49067b;
                dk0Var5.getClass();
                if (i7 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = dk0Var5.Y;
                    if (intValue3 >= editTextBoldCursorArr3.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr3[intValue3].isFocusable()) {
                        dk0Var5.Y[intValue3].requestFocus();
                        return true;
                    }
                    dk0Var5.Y[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    org.telegram.messenger.g0.v1(textView);
                    return true;
                }
                return false;
            case 5:
                dk0 dk0Var6 = this.f49067b;
                dk0Var6.getClass();
                if (i7 != 5 && i7 != 6) {
                    return false;
                }
                dk0Var6.L.callOnClick();
                return true;
            default:
                dk0 dk0Var7 = this.f49067b;
                dk0Var7.getClass();
                if (i7 != 6 && i7 != 5) {
                    return false;
                }
                dk0Var7.L.callOnClick();
                return true;
        }
    }
}
