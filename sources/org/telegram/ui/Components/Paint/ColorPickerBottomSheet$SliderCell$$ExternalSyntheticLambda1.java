package org.telegram.ui.Components.Paint;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class ColorPickerBottomSheet$SliderCell$$ExternalSyntheticLambda1 implements TextView.OnEditorActionListener {
    public final int $r8$classId;

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.$r8$classId) {
            case 0:
                if (i == 6) {
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                }
                break;
            default:
                if (i == 6) {
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                }
                break;
        }
        return false;
    }
}
