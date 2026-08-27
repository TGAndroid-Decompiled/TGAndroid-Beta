package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class o2 implements TextView.OnEditorActionListener {

    public final int f31141a;

    public o2(int i10) {
        this.f31141a = i10;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f31141a) {
            case 0:
                AndroidUtilities.hideKeyboard(textView);
                return false;
            case 1:
                if (i10 != 6) {
                    return false;
                }
                AndroidUtilities.hideKeyboard(textView);
                return true;
            case 2:
                if (i10 != 6) {
                    return false;
                }
                AndroidUtilities.hideKeyboard(textView);
                return true;
            case 3:
                if (i10 != 6) {
                    return false;
                }
                AndroidUtilities.hideKeyboard(textView);
                return true;
            case 4:
                if (i10 != 6) {
                    return false;
                }
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
                return false;
            default:
                if (i10 != 6) {
                    return false;
                }
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
                return false;
        }
    }
}
