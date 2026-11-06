package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class oi0 implements TextView.OnEditorActionListener {
    public final int f48419a;
    public final bk0 f48420b;

    public oi0(bk0 bk0Var, int i7) {
        this.f48419a = i7;
        this.f48420b = bk0Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f48419a) {
            case 0:
                bk0 bk0Var = this.f48420b;
                if (i7 == 5) {
                    bk0Var.Y[2].requestFocus();
                    return true;
                } else if (i7 == 6) {
                    bk0Var.L.callOnClick();
                    return true;
                } else {
                    bk0Var.getClass();
                    return false;
                }
            case 1:
                bk0 bk0Var2 = this.f48420b;
                bk0Var2.getClass();
                if (i7 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = bk0Var2.Y;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr[intValue].isFocusable()) {
                        bk0Var2.Y[intValue].requestFocus();
                        return true;
                    }
                    bk0Var2.Y[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    org.telegram.messenger.g0.v1(textView);
                    return true;
                }
                return false;
            case 2:
                bk0 bk0Var3 = this.f48420b;
                bk0Var3.getClass();
                if (i7 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = bk0Var3.f44360a0;
                    if (intValue2 >= editTextBoldCursorArr2.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr2[intValue2].isFocusable()) {
                        bk0Var3.f44360a0[intValue2].requestFocus();
                        return true;
                    }
                    bk0Var3.f44360a0[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    org.telegram.messenger.g0.v1(textView);
                    return true;
                }
                return false;
            case 3:
                bk0 bk0Var4 = this.f48420b;
                bk0Var4.getClass();
                if (i7 != 6 && i7 != 5) {
                    return false;
                }
                bk0Var4.L.callOnClick();
                return true;
            case 4:
                bk0 bk0Var5 = this.f48420b;
                bk0Var5.getClass();
                if (i7 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = bk0Var5.Y;
                    if (intValue3 >= editTextBoldCursorArr3.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr3[intValue3].isFocusable()) {
                        bk0Var5.Y[intValue3].requestFocus();
                        return true;
                    }
                    bk0Var5.Y[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    org.telegram.messenger.g0.v1(textView);
                    return true;
                }
                return false;
            case 5:
                bk0 bk0Var6 = this.f48420b;
                bk0Var6.getClass();
                if (i7 != 5 && i7 != 6) {
                    return false;
                }
                bk0Var6.L.callOnClick();
                return true;
            default:
                bk0 bk0Var7 = this.f48420b;
                bk0Var7.getClass();
                if (i7 != 6 && i7 != 5) {
                    return false;
                }
                bk0Var7.L.callOnClick();
                return true;
        }
    }
}
