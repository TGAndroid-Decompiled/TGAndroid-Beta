package org.telegram.ui.ActionBar;

import android.view.View;
import android.view.WindowInsets;
public final class x2 implements View.OnApplyWindowInsetsListener {
    public final int f30223a;

    public x2(int i7) {
        this.f30223a = i7;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f30223a) {
            case 0:
                return a3.a(view, windowInsets);
            case 1:
                return org.telegram.ui.g4.c(windowInsets);
            default:
                view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                return windowInsets;
        }
    }
}
