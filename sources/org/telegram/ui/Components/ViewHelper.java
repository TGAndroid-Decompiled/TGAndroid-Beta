package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public abstract class ViewHelper {
    public static void setPadding(View view, float f, float f2, float f3, float f4) {
        view.setPadding(AndroidUtilities.dp(f), AndroidUtilities.dp(f2), AndroidUtilities.dp(f3), AndroidUtilities.dp(f4));
    }
}
