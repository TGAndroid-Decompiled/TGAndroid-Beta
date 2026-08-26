package org.telegram.ui.ActionBar;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

public final class BottomSheetTabDialog$$ExternalSyntheticLambda0 implements View.OnApplyWindowInsetsListener {
    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }
}
