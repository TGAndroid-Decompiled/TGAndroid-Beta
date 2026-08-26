package org.telegram.ui.Components;

import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

public abstract class EditTextCaption$$ExternalSyntheticOutline0 {
    public static int m(float f, int i, TextView textView) {
        textView.setText(LocaleController.getString(i));
        return AndroidUtilities.dp(f);
    }
}
