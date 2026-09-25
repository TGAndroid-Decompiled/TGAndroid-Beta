package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class pl0 implements TextView.OnEditorActionListener {
    public final int f36574a;
    public final gn0 f36575b;

    public pl0(gn0 gn0Var, int i10) {
        this.f36574a = i10;
        this.f36575b = gn0Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f36574a) {
            case 0:
                gn0 gn0Var = this.f36575b;
                if (i10 == 5) {
                    gn0Var.Y[2].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    gn0Var.L.callOnClick();
                    return true;
                } else {
                    gn0Var.getClass();
                    return false;
                }
            case 1:
                gn0 gn0Var2 = this.f36575b;
                gn0Var2.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = gn0Var2.Y;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr[intValue].isFocusable()) {
                        gn0Var2.Y[intValue].requestFocus();
                        return true;
                    }
                    gn0Var2.Y[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 2:
                gn0 gn0Var3 = this.f36575b;
                gn0Var3.getClass();
                if (i10 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = gn0Var3.f33971a0;
                    if (intValue2 >= editTextBoldCursorArr2.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr2[intValue2].isFocusable()) {
                        gn0Var3.f33971a0[intValue2].requestFocus();
                        return true;
                    }
                    gn0Var3.f33971a0[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 3:
                gn0 gn0Var4 = this.f36575b;
                gn0Var4.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                gn0Var4.L.callOnClick();
                return true;
            case 4:
                gn0 gn0Var5 = this.f36575b;
                gn0Var5.getClass();
                if (i10 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = gn0Var5.Y;
                    if (intValue3 >= editTextBoldCursorArr3.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr3[intValue3].isFocusable()) {
                        gn0Var5.Y[intValue3].requestFocus();
                        return true;
                    }
                    gn0Var5.Y[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 5:
                gn0 gn0Var6 = this.f36575b;
                gn0Var6.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                gn0Var6.L.callOnClick();
                return true;
            default:
                gn0 gn0Var7 = this.f36575b;
                gn0Var7.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                gn0Var7.L.callOnClick();
                return true;
        }
    }
}
