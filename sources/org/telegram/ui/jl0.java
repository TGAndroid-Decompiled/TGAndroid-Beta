package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jl0 implements TextView.OnEditorActionListener {
    public final int f38598a;
    public final an0 f38599b;

    public jl0(an0 an0Var, int i10) {
        this.f38598a = i10;
        this.f38599b = an0Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f38598a) {
            case 0:
                an0 an0Var = this.f38599b;
                if (i10 == 5) {
                    an0Var.Y[2].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    an0Var.L.callOnClick();
                    return true;
                } else {
                    an0Var.getClass();
                    return false;
                }
            case 1:
                an0 an0Var2 = this.f38599b;
                an0Var2.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = an0Var2.Y;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr[intValue].isFocusable()) {
                        an0Var2.Y[intValue].requestFocus();
                        return true;
                    }
                    an0Var2.Y[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 2:
                an0 an0Var3 = this.f38599b;
                an0Var3.getClass();
                if (i10 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = an0Var3.f35702a0;
                    if (intValue2 >= editTextBoldCursorArr2.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr2[intValue2].isFocusable()) {
                        an0Var3.f35702a0[intValue2].requestFocus();
                        return true;
                    }
                    an0Var3.f35702a0[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 3:
                an0 an0Var4 = this.f38599b;
                an0Var4.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                an0Var4.L.callOnClick();
                return true;
            case 4:
                an0 an0Var5 = this.f38599b;
                an0Var5.getClass();
                if (i10 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = an0Var5.Y;
                    if (intValue3 >= editTextBoldCursorArr3.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr3[intValue3].isFocusable()) {
                        an0Var5.Y[intValue3].requestFocus();
                        return true;
                    }
                    an0Var5.Y[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 5:
                an0 an0Var6 = this.f38599b;
                an0Var6.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                an0Var6.L.callOnClick();
                return true;
            default:
                an0 an0Var7 = this.f38599b;
                an0Var7.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                an0Var7.L.callOnClick();
                return true;
        }
    }
}
