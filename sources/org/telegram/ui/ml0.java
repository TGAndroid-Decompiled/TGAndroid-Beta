package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ml0 implements TextView.OnEditorActionListener {
    public final int f36345a;
    public final dn0 f36346b;

    public ml0(dn0 dn0Var, int i10) {
        this.f36345a = i10;
        this.f36346b = dn0Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f36345a) {
            case 0:
                dn0 dn0Var = this.f36346b;
                if (i10 == 5) {
                    dn0Var.V[2].requestFocus();
                    return true;
                } else if (i10 == 6) {
                    dn0Var.I.callOnClick();
                    return true;
                } else {
                    dn0Var.getClass();
                    return false;
                }
            case 1:
                dn0 dn0Var2 = this.f36346b;
                dn0Var2.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = dn0Var2.V;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr[intValue].isFocusable()) {
                        dn0Var2.V[intValue].requestFocus();
                        return true;
                    }
                    dn0Var2.V[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 2:
                dn0 dn0Var3 = this.f36346b;
                dn0Var3.getClass();
                if (i10 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = dn0Var3.X;
                    if (intValue2 >= editTextBoldCursorArr2.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr2[intValue2].isFocusable()) {
                        dn0Var3.X[intValue2].requestFocus();
                        return true;
                    }
                    dn0Var3.X[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 3:
                dn0 dn0Var4 = this.f36346b;
                dn0Var4.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                dn0Var4.I.callOnClick();
                return true;
            case 4:
                dn0 dn0Var5 = this.f36346b;
                dn0Var5.getClass();
                if (i10 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = dn0Var5.V;
                    if (intValue3 >= editTextBoldCursorArr3.length) {
                        return true;
                    }
                    if (editTextBoldCursorArr3[intValue3].isFocusable()) {
                        dn0Var5.V[intValue3].requestFocus();
                        return true;
                    }
                    dn0Var5.V[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 5:
                dn0 dn0Var6 = this.f36346b;
                dn0Var6.getClass();
                if (i10 != 5 && i10 != 6) {
                    return false;
                }
                dn0Var6.I.callOnClick();
                return true;
            default:
                dn0 dn0Var7 = this.f36346b;
                dn0Var7.getClass();
                if (i10 != 6 && i10 != 5) {
                    return false;
                }
                dn0Var7.I.callOnClick();
                return true;
        }
    }
}
