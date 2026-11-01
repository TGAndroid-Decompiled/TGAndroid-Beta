package org.telegram.ui.ActionBar;

import android.view.View;
import android.view.WindowInsets;
public final class a3 implements View.OnApplyWindowInsetsListener {
    public final int f20144a;

    public a3(int i10) {
        this.f20144a = i10;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f20144a) {
            case 0:
                return d3.a(view, windowInsets);
            case 1:
                return org.telegram.ui.h4.c(windowInsets);
            default:
                view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                return windowInsets;
        }
    }
}
