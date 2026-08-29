package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class dl0 implements TextView.OnEditorActionListener {
    public final int f37557a;
    public final vm0 f37558b;

    public dl0(vm0 vm0Var, int i10) {
        this.f37557a = i10;
        this.f37558b = vm0Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f37557a) {
            case 0:
                vm0 vm0Var = this.f37558b;
                if (i10 == 5) {
                    vm0Var.U[2].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    vm0Var.H.callOnClick();
                    return true;
                } else {
                    vm0Var.getClass();
                    return false;
                }
            case 1:
                vm0 vm0Var2 = this.f37558b;
                vm0Var2.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = vm0Var2.U;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr[intValue].isFocusable()) {
                        vm0Var2.U[intValue].requestFocus();
                        return true;
                    }
                    vm0Var2.U[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 2:
                vm0 vm0Var3 = this.f37558b;
                vm0Var3.getClass();
                if (i10 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = vm0Var3.W;
                    if (intValue2 >= editTextBoldCursorArr2.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr2[intValue2].isFocusable()) {
                        vm0Var3.W[intValue2].requestFocus();
                        return true;
                    }
                    vm0Var3.W[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 3:
                vm0 vm0Var4 = this.f37558b;
                vm0Var4.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                vm0Var4.H.callOnClick();
                return true;
            case 4:
                vm0 vm0Var5 = this.f37558b;
                vm0Var5.getClass();
                if (i10 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = vm0Var5.U;
                    if (intValue3 >= editTextBoldCursorArr3.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr3[intValue3].isFocusable()) {
                        vm0Var5.U[intValue3].requestFocus();
                        return true;
                    }
                    vm0Var5.U[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 5:
                vm0 vm0Var6 = this.f37558b;
                vm0Var6.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                vm0Var6.H.callOnClick();
                return true;
            default:
                vm0 vm0Var7 = this.f37558b;
                vm0Var7.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                vm0Var7.H.callOnClick();
                return true;
        }
    }
}
