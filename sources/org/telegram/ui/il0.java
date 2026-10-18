package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class il0 implements TextView.OnEditorActionListener {
    public final int f37912a;
    public final xm0 f37913b;

    public il0(xm0 xm0Var, int i10) {
        this.f37912a = i10;
        this.f37913b = xm0Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f37912a) {
            case 0:
                xm0 xm0Var = this.f37913b;
                if (i10 == 5) {
                    xm0Var.Y[2].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    xm0Var.L.callOnClick();
                    return true;
                } else {
                    xm0Var.getClass();
                    return false;
                }
            case 1:
                xm0 xm0Var2 = this.f37913b;
                xm0Var2.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = xm0Var2.Y;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr[intValue].isFocusable()) {
                        xm0Var2.Y[intValue].requestFocus();
                        return true;
                    }
                    xm0Var2.Y[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 2:
                xm0 xm0Var3 = this.f37913b;
                xm0Var3.getClass();
                if (i10 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = xm0Var3.f43146a0;
                    if (intValue2 >= editTextBoldCursorArr2.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr2[intValue2].isFocusable()) {
                        xm0Var3.f43146a0[intValue2].requestFocus();
                        return true;
                    }
                    xm0Var3.f43146a0[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 3:
                xm0 xm0Var4 = this.f37913b;
                xm0Var4.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                xm0Var4.L.callOnClick();
                return true;
            case 4:
                xm0 xm0Var5 = this.f37913b;
                xm0Var5.getClass();
                if (i10 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = xm0Var5.Y;
                    if (intValue3 >= editTextBoldCursorArr3.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr3[intValue3].isFocusable()) {
                        xm0Var5.Y[intValue3].requestFocus();
                        return true;
                    }
                    xm0Var5.Y[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 5:
                xm0 xm0Var6 = this.f37913b;
                xm0Var6.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                xm0Var6.L.callOnClick();
                return true;
            default:
                xm0 xm0Var7 = this.f37913b;
                xm0Var7.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                xm0Var7.L.callOnClick();
                return true;
        }
    }
}
