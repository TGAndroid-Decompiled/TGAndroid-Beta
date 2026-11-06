package org.telegram.ui.ActionBar;

import android.view.View;
import android.view.WindowInsets;
public final class w2 implements View.OnApplyWindowInsetsListener {
    public final int f28694a;

    public w2(int i7) {
        this.f28694a = i7;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f28694a) {
            case 0:
                return z2.a(view, windowInsets);
            case 1:
                return org.telegram.ui.g4.c(windowInsets);
            default:
                view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                return windowInsets;
        }
    }
}
