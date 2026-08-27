package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class gl0 implements TextView.OnEditorActionListener {

    public final int f38441a;

    public final xm0 f38442b;

    public gl0(xm0 xm0Var, int i10) {
        this.f38441a = i10;
        this.f38442b = xm0Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f38441a) {
            case 0:
                xm0 xm0Var = this.f38442b;
                if (i10 == 5) {
                    xm0Var.U[2].requestFocus();
                    return true;
                }
                if (i10 == 6) {
                    xm0Var.H.callOnClick();
                    return true;
                }
                xm0Var.getClass();
                return false;
            case 1:
                xm0 xm0Var2 = this.f38442b;
                xm0Var2.getClass();
                if (i10 != 5) {
                    return false;
                }
                int iIntValue = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr = xm0Var2.U;
                if (iIntValue >= editTextBoldCursorArr.length) {
                    return true;
                }
                if (editTextBoldCursorArr[iIntValue].isFocusable()) {
                    xm0Var2.U[iIntValue].requestFocus();
                    return true;
                }
                xm0Var2.U[iIntValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
                return true;
            case 2:
                xm0 xm0Var3 = this.f38442b;
                xm0Var3.getClass();
                if (i10 != 5) {
                    return false;
                }
                int iIntValue2 = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr2 = xm0Var3.W;
                if (iIntValue2 >= editTextBoldCursorArr2.length) {
                    return true;
                }
                if (editTextBoldCursorArr2[iIntValue2].isFocusable()) {
                    xm0Var3.W[iIntValue2].requestFocus();
                    return true;
                }
                xm0Var3.W[iIntValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
                return true;
            case 3:
                xm0 xm0Var4 = this.f38442b;
                xm0Var4.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                xm0Var4.H.callOnClick();
                return true;
            case 4:
                xm0 xm0Var5 = this.f38442b;
                xm0Var5.getClass();
                if (i10 != 5) {
                    return false;
                }
                int iIntValue3 = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr3 = xm0Var5.U;
                if (iIntValue3 >= editTextBoldCursorArr3.length) {
                    return true;
                }
                if (editTextBoldCursorArr3[iIntValue3].isFocusable()) {
                    xm0Var5.U[iIntValue3].requestFocus();
                    return true;
                }
                xm0Var5.U[iIntValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
                return true;
            case 5:
                xm0 xm0Var6 = this.f38442b;
                xm0Var6.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                xm0Var6.H.callOnClick();
                return true;
            default:
                xm0 xm0Var7 = this.f38442b;
                xm0Var7.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                xm0Var7.H.callOnClick();
                return true;
        }
    }
}
