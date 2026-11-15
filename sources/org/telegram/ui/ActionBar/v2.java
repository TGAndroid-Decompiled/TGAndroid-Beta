package org.telegram.ui.ActionBar;

import android.view.View;
import android.view.WindowInsets;
public final class v2 implements View.OnApplyWindowInsetsListener {
    public final int f29753a;

    public v2(int i7) {
        this.f29753a = i7;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f29753a) {
            case 0:
                return y2.a(view, windowInsets);
            case 1:
                return org.telegram.ui.g4.c(windowInsets);
            default:
                view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                return windowInsets;
        }
    }
}
