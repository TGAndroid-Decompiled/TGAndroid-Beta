package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ql0 implements TextView.OnEditorActionListener {
    public final int f36470a;
    public final in0 f36471b;

    public ql0(in0 in0Var, int i10) {
        this.f36470a = i10;
        this.f36471b = in0Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f36470a) {
            case 0:
                in0 in0Var = this.f36471b;
                if (i10 == 5) {
                    in0Var.Y[2].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    in0Var.L.callOnClick();
                    return true;
                } else {
                    in0Var.getClass();
                    return false;
                }
            case 1:
                in0 in0Var2 = this.f36471b;
                in0Var2.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = in0Var2.Y;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr[intValue].isFocusable()) {
                        in0Var2.Y[intValue].requestFocus();
                        return true;
                    }
                    in0Var2.Y[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 2:
                in0 in0Var3 = this.f36471b;
                in0Var3.getClass();
                if (i10 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = in0Var3.f34163a0;
                    if (intValue2 >= editTextBoldCursorArr2.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr2[intValue2].isFocusable()) {
                        in0Var3.f34163a0[intValue2].requestFocus();
                        return true;
                    }
                    in0Var3.f34163a0[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 3:
                in0 in0Var4 = this.f36471b;
                in0Var4.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                in0Var4.L.callOnClick();
                return true;
            case 4:
                in0 in0Var5 = this.f36471b;
                in0Var5.getClass();
                if (i10 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = in0Var5.Y;
                    if (intValue3 >= editTextBoldCursorArr3.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr3[intValue3].isFocusable()) {
                        in0Var5.Y[intValue3].requestFocus();
                        return true;
                    }
                    in0Var5.Y[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 5:
                in0 in0Var6 = this.f36471b;
                in0Var6.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                in0Var6.L.callOnClick();
                return true;
            default:
                in0 in0Var7 = this.f36471b;
                in0Var7.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                in0Var7.L.callOnClick();
                return true;
        }
    }
}
