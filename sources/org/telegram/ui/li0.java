package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class li0 implements TextView.OnEditorActionListener {
    public final int f47344a;
    public final yj0 f47345b;

    public li0(yj0 yj0Var, int i3) {
        this.f47344a = i3;
        this.f47345b = yj0Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
        switch (this.f47344a) {
            case 0:
                yj0 yj0Var = this.f47345b;
                if (i3 == 5) {
                    yj0Var.Z[2].requestFocus();
                    return true;
                } else if (i3 == 6) {
                    yj0Var.M.callOnClick();
                    return true;
                } else {
                    yj0Var.getClass();
                    return false;
                }
            case 1:
                yj0 yj0Var2 = this.f47345b;
                yj0Var2.getClass();
                if (i3 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = yj0Var2.Z;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr[intValue].isFocusable()) {
                        yj0Var2.Z[intValue].requestFocus();
                        return true;
                    }
                    yj0Var2.Z[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    org.telegram.messenger.g0.v1(textView);
                    return true;
                }
                return false;
            case 2:
                yj0 yj0Var3 = this.f47345b;
                yj0Var3.getClass();
                if (i3 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = yj0Var3.f52288b0;
                    if (intValue2 >= editTextBoldCursorArr2.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr2[intValue2].isFocusable()) {
                        yj0Var3.f52288b0[intValue2].requestFocus();
                        return true;
                    }
                    yj0Var3.f52288b0[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    org.telegram.messenger.g0.v1(textView);
                    return true;
                }
                return false;
            case 3:
                yj0 yj0Var4 = this.f47345b;
                yj0Var4.getClass();
                if (i3 != 6 && i3 != 5) {
                    return false;
                }
                yj0Var4.M.callOnClick();
                return true;
            case 4:
                yj0 yj0Var5 = this.f47345b;
                yj0Var5.getClass();
                if (i3 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = yj0Var5.Z;
                    if (intValue3 >= editTextBoldCursorArr3.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr3[intValue3].isFocusable()) {
                        yj0Var5.Z[intValue3].requestFocus();
                        return true;
                    }
                    yj0Var5.Z[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    org.telegram.messenger.g0.v1(textView);
                    return true;
                }
                return false;
            case 5:
                yj0 yj0Var6 = this.f47345b;
                yj0Var6.getClass();
                if (i3 != 5 && i3 != 6) {
                    return false;
                }
                yj0Var6.M.callOnClick();
                return true;
            default:
                yj0 yj0Var7 = this.f47345b;
                yj0Var7.getClass();
                if (i3 != 6 && i3 != 5) {
                    return false;
                }
                yj0Var7.M.callOnClick();
                return true;
        }
    }
}
