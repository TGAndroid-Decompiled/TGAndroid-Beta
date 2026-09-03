package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ol0 implements TextView.OnEditorActionListener {
    public final int f39757a;
    public final fn0 f39758b;

    public ol0(fn0 fn0Var, int i10) {
        this.f39757a = i10;
        this.f39758b = fn0Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f39757a) {
            case 0:
                fn0 fn0Var = this.f39758b;
                if (i10 == 5) {
                    fn0Var.V[2].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    fn0Var.I.callOnClick();
                    return true;
                } else {
                    fn0Var.getClass();
                    return false;
                }
            case 1:
                fn0 fn0Var2 = this.f39758b;
                fn0Var2.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = fn0Var2.V;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr[intValue].isFocusable()) {
                        fn0Var2.V[intValue].requestFocus();
                        return true;
                    }
                    fn0Var2.V[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 2:
                fn0 fn0Var3 = this.f39758b;
                fn0Var3.getClass();
                if (i10 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = fn0Var3.X;
                    if (intValue2 >= editTextBoldCursorArr2.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr2[intValue2].isFocusable()) {
                        fn0Var3.X[intValue2].requestFocus();
                        return true;
                    }
                    fn0Var3.X[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 3:
                fn0 fn0Var4 = this.f39758b;
                fn0Var4.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                fn0Var4.I.callOnClick();
                return true;
            case 4:
                fn0 fn0Var5 = this.f39758b;
                fn0Var5.getClass();
                if (i10 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = fn0Var5.V;
                    if (intValue3 >= editTextBoldCursorArr3.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr3[intValue3].isFocusable()) {
                        fn0Var5.V[intValue3].requestFocus();
                        return true;
                    }
                    fn0Var5.V[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 5:
                fn0 fn0Var6 = this.f39758b;
                fn0Var6.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                fn0Var6.I.callOnClick();
                return true;
            default:
                fn0 fn0Var7 = this.f39758b;
                fn0Var7.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                fn0Var7.I.callOnClick();
                return true;
        }
    }
}
