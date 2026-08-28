package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class gl0 implements TextView.OnEditorActionListener {
    public final int f38564a;
    public final wm0 f38565b;

    public gl0(wm0 wm0Var, int i9) {
        this.f38564a = i9;
        this.f38565b = wm0Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i9, KeyEvent keyEvent) {
        switch (this.f38564a) {
            case 0:
                wm0 wm0Var = this.f38565b;
                if (i9 == 5) {
                    wm0Var.U[2].requestFocus();
                    return true;
                } else if (i9 == 6) {
                    wm0Var.H.callOnClick();
                    return true;
                } else {
                    wm0Var.getClass();
                    return false;
                }
            case 1:
                wm0 wm0Var2 = this.f38565b;
                wm0Var2.getClass();
                if (i9 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = wm0Var2.U;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr[intValue].isFocusable()) {
                        wm0Var2.U[intValue].requestFocus();
                        return true;
                    }
                    wm0Var2.U[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 2:
                wm0 wm0Var3 = this.f38565b;
                wm0Var3.getClass();
                if (i9 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = wm0Var3.W;
                    if (intValue2 >= editTextBoldCursorArr2.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr2[intValue2].isFocusable()) {
                        wm0Var3.W[intValue2].requestFocus();
                        return true;
                    }
                    wm0Var3.W[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 3:
                wm0 wm0Var4 = this.f38565b;
                wm0Var4.getClass();
                if (i9 != 6 && i9 != 5) {
                    return false;
                }
                wm0Var4.H.callOnClick();
                return true;
            case 4:
                wm0 wm0Var5 = this.f38565b;
                wm0Var5.getClass();
                if (i9 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = wm0Var5.U;
                    if (intValue3 >= editTextBoldCursorArr3.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr3[intValue3].isFocusable()) {
                        wm0Var5.U[intValue3].requestFocus();
                        return true;
                    }
                    wm0Var5.U[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 5:
                wm0 wm0Var6 = this.f38565b;
                wm0Var6.getClass();
                if (i9 != 5 && i9 != 6) {
                    return false;
                }
                wm0Var6.H.callOnClick();
                return true;
            default:
                wm0 wm0Var7 = this.f38565b;
                wm0Var7.getClass();
                if (i9 != 6 && i9 != 5) {
                    return false;
                }
                wm0Var7.H.callOnClick();
                return true;
        }
    }
}
