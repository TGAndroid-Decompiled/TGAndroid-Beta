package org.telegram.ui.ActionBar;

import android.view.View;
import android.view.WindowInsets;
public final class y2 implements View.OnApplyWindowInsetsListener {
    public final int f30271a;

    public y2(int i7) {
        this.f30271a = i7;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f30271a) {
            case 0:
                return b3.a(view, windowInsets);
            case 1:
                return org.telegram.ui.g4.c(windowInsets);
            default:
                view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                return windowInsets;
        }
    }
}
