package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class PassportActivity$$ExternalSyntheticLambda3 implements TextView.OnEditorActionListener {
    public final int $r8$classId;
    public final PassportActivity f$0;

    public PassportActivity$$ExternalSyntheticLambda3(PassportActivity passportActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = passportActivity;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.$r8$classId) {
            case 0:
                PassportActivity passportActivity = this.f$0;
                passportActivity.getClass();
                if (i != 6 && i != 5) {
                    return false;
                }
                passportActivity.doneItem.callOnClick();
                return true;
            case 1:
                PassportActivity passportActivity2 = this.f$0;
                if (i == 5) {
                    passportActivity2.inputFields[2].requestFocus();
                    return true;
                }
                if (i == 6) {
                    passportActivity2.doneItem.callOnClick();
                    return true;
                }
                passportActivity2.getClass();
                return false;
            case 2:
                PassportActivity passportActivity3 = this.f$0;
                passportActivity3.getClass();
                if (i != 5) {
                    return false;
                }
                int iIntValue = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr = passportActivity3.inputFields;
                if (iIntValue >= editTextBoldCursorArr.length) {
                    return true;
                }
                if (editTextBoldCursorArr[iIntValue].isFocusable()) {
                    passportActivity3.inputFields[iIntValue].requestFocus();
                    return true;
                }
                passportActivity3.inputFields[iIntValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
                return true;
            case 3:
                PassportActivity passportActivity4 = this.f$0;
                passportActivity4.getClass();
                if (i != 5) {
                    return false;
                }
                int iIntValue2 = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr2 = passportActivity4.inputExtraFields;
                if (iIntValue2 >= editTextBoldCursorArr2.length) {
                    return true;
                }
                if (editTextBoldCursorArr2[iIntValue2].isFocusable()) {
                    passportActivity4.inputExtraFields[iIntValue2].requestFocus();
                    return true;
                }
                passportActivity4.inputExtraFields[iIntValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
                return true;
            case 4:
                PassportActivity passportActivity5 = this.f$0;
                passportActivity5.getClass();
                if (i != 5) {
                    return false;
                }
                int iIntValue3 = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr3 = passportActivity5.inputFields;
                if (iIntValue3 >= editTextBoldCursorArr3.length) {
                    return true;
                }
                if (editTextBoldCursorArr3[iIntValue3].isFocusable()) {
                    passportActivity5.inputFields[iIntValue3].requestFocus();
                    return true;
                }
                passportActivity5.inputFields[iIntValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
                return true;
            case 5:
                PassportActivity passportActivity6 = this.f$0;
                passportActivity6.getClass();
                if (i != 5 && i != 6) {
                    return false;
                }
                passportActivity6.doneItem.callOnClick();
                return true;
            default:
                PassportActivity passportActivity7 = this.f$0;
                passportActivity7.getClass();
                if (i != 6 && i != 5) {
                    return false;
                }
                passportActivity7.doneItem.callOnClick();
                return true;
        }
    }
}
