package org.telegram.p009ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

public final class ViewHelper {
    public static void setPadding(View view, float f, float f2, float f3, float f4) {
        view.setPadding(AndroidUtilities.m35dp(f), AndroidUtilities.m35dp(f2), AndroidUtilities.m35dp(f3), AndroidUtilities.m35dp(f4));
    }

    public static void setPaddingRelative(View view, float f, float f2, float f3, float f4) {
        boolean z = LocaleController.isRTL;
        float f5 = z ? f3 : f;
        if (!z) {
            f = f3;
        }
        setPadding(view, f5, f2, f, f4);
    }
}
