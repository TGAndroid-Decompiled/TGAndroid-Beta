package org.telegram.ui.ActionBar;

import android.view.View;
import android.view.WindowInsets;
public final class u2 implements View.OnApplyWindowInsetsListener {
    public final int f28674a;

    public u2(int i3) {
        this.f28674a = i3;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f28674a) {
            case 0:
                return x2.a(view, windowInsets);
            case 1:
                return org.telegram.ui.i4.c(windowInsets);
            default:
                view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                return windowInsets;
        }
    }
}
