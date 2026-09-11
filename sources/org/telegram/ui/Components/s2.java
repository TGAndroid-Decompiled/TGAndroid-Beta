package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class s2 implements TextView.OnEditorActionListener {
    public final int f30169a;

    public s2(int i10) {
        this.f30169a = i10;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f30169a) {
            case 0:
                AndroidUtilities.hideKeyboard(textView);
                return false;
            case 1:
                if (i10 == 6) {
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 2:
                if (i10 == 6) {
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 3:
                if (i10 == 6) {
                    AndroidUtilities.hideKeyboard(textView);
                    return true;
                }
                return false;
            case 4:
                if (i10 == 6) {
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return false;
                }
                return false;
            default:
                if (i10 == 6) {
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    return false;
                }
                return false;
        }
    }
}
