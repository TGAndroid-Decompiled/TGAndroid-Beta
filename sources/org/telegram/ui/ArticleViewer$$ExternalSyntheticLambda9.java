package org.telegram.ui;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

public final class ArticleViewer$$ExternalSyntheticLambda9 implements View.OnApplyWindowInsetsListener {
    public final int $r8$classId;

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.$r8$classId) {
            case 0:
                return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
            case 1:
                view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
            case 2:
                view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                return windowInsets;
            default:
                view.requestLayout();
                return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
        }
    }
}
