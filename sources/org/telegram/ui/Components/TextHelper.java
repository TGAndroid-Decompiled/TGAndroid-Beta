package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public abstract class TextHelper {
    public static TextView makeTextView(Context context, float f, int i, boolean z, Theme.ResourcesProvider resourcesProvider) {
        TextView textView = new TextView(context);
        textView.setTextSize(1, f);
        textView.setTextColor(Theme.getColor(i, resourcesProvider));
        if (z) {
            textView.setTypeface(AndroidUtilities.bold());
        }
        return textView;
    }
}
