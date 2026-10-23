package org.telegram.ui.ActionBar;

import android.view.View;
import android.view.WindowInsets;
public final class i3 implements View.OnApplyWindowInsetsListener {
    public final int f20949a;

    public i3(int i10) {
        this.f20949a = i10;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f20949a) {
            case 0:
                return l3.a(view, windowInsets);
            case 1:
                return org.telegram.ui.k4.e(windowInsets);
            default:
                view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                return windowInsets;
        }
    }
}
