package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class bm0 implements TextView.OnEditorActionListener {
    public final int f34350a;
    public final sn0 f34351b;

    public bm0(sn0 sn0Var, int i10) {
        this.f34350a = i10;
        this.f34351b = sn0Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f34350a) {
            case 0:
                sn0 sn0Var = this.f34351b;
                if (i10 == 5) {
                    sn0Var.Y[2].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    sn0Var.L.callOnClick();
                    return true;
                } else {
                    sn0Var.getClass();
                    return false;
                }
            case 1:
                sn0 sn0Var2 = this.f34351b;
                sn0Var2.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = sn0Var2.Y;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr[intValue].isFocusable()) {
                        sn0Var2.Y[intValue].requestFocus();
                        return true;
                    }
                    sn0Var2.Y[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 2:
                sn0 sn0Var3 = this.f34351b;
                sn0Var3.getClass();
                if (i10 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = sn0Var3.f39855a0;
                    if (intValue2 >= editTextBoldCursorArr2.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr2[intValue2].isFocusable()) {
                        sn0Var3.f39855a0[intValue2].requestFocus();
                        return true;
                    }
                    sn0Var3.f39855a0[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 3:
                sn0 sn0Var4 = this.f34351b;
                sn0Var4.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                sn0Var4.L.callOnClick();
                return true;
            case 4:
                sn0 sn0Var5 = this.f34351b;
                sn0Var5.getClass();
                if (i10 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = sn0Var5.Y;
                    if (intValue3 >= editTextBoldCursorArr3.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr3[intValue3].isFocusable()) {
                        sn0Var5.Y[intValue3].requestFocus();
                        return true;
                    }
                    sn0Var5.Y[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 5:
                sn0 sn0Var6 = this.f34351b;
                sn0Var6.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                sn0Var6.L.callOnClick();
                return true;
            default:
                sn0 sn0Var7 = this.f34351b;
                sn0Var7.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                sn0Var7.L.callOnClick();
                return true;
        }
    }
}
