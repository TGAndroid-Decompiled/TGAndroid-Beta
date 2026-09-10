package org.telegram.ui.ActionBar;

import android.view.View;
import android.view.WindowInsets;
public final class i3 implements View.OnApplyWindowInsetsListener {
    public final int f17828a;

    public i3(int i10) {
        this.f17828a = i10;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f17828a) {
            case 0:
                return k3.a(view, windowInsets);
            case 1:
                return org.telegram.ui.j4.e(windowInsets);
            default:
                view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                return windowInsets;
        }
    }
}
