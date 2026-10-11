package org.telegram.ui.ActionBar;

import android.view.View;
import android.view.WindowInsets;
public final class f3 implements View.OnApplyWindowInsetsListener {
    public final int f20597a;

    public f3(int i10) {
        this.f20597a = i10;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f20597a) {
            case 0:
                return h3.a(view, windowInsets);
            case 1:
                return org.telegram.ui.h4.e(windowInsets);
            default:
                view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                return windowInsets;
        }
    }
}
