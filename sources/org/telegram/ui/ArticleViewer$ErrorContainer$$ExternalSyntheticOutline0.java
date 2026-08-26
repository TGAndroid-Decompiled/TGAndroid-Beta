package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

public abstract class ArticleViewer$ErrorContainer$$ExternalSyntheticOutline0 {
    public static void m(int i, Object[] objArr, TextView textView) {
        textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i, objArr)));
    }
}
