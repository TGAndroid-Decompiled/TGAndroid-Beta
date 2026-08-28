package org.telegram.ui.ActionBar;

import android.view.View;
import android.view.WindowInsets;
public final class g3 implements View.OnApplyWindowInsetsListener {
    public final int f23424a;

    public g3(int i9) {
        this.f23424a = i9;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f23424a) {
            case 0:
                return i3.a(view, windowInsets);
            case 1:
                return org.telegram.ui.l4.e(windowInsets);
            default:
                view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                return windowInsets;
        }
    }
}
