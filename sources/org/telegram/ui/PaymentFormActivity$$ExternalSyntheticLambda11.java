package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class PaymentFormActivity$$ExternalSyntheticLambda11 implements TextView.OnEditorActionListener {
    public final int $r8$classId;

    public PaymentFormActivity$$ExternalSyntheticLambda11(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.$r8$classId) {
            case 0:
                if (i != 6) {
                    return false;
                }
                AndroidUtilities.hideKeyboard(textView);
                return true;
            case 1:
                AndroidUtilities.hideKeyboard(textView);
                return false;
            case 2:
                if (i != 6) {
                    return false;
                }
                AndroidUtilities.hideKeyboard(textView);
                return true;
            case 3:
                if (i != 6) {
                    return false;
                }
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
                return false;
            case 4:
                if (i != 6) {
                    return false;
                }
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
                return false;
            default:
                if (i != 6) {
                    return false;
                }
                AndroidUtilities.hideKeyboard(textView);
                return true;
        }
    }
}
