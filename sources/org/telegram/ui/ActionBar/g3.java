package org.telegram.ui.ActionBar;

import android.view.View;
import android.view.WindowInsets;
public final class g3 implements View.OnApplyWindowInsetsListener {
    public final int f22984a;

    public g3(int i10) {
        this.f22984a = i10;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f22984a) {
            case 0:
                return i3.a(view, windowInsets);
            case 1:
                return org.telegram.ui.m4.e(windowInsets);
            default:
                view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                return windowInsets;
        }
    }
}
