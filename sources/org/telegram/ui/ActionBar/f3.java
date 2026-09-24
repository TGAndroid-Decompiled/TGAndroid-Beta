package org.telegram.ui.ActionBar;

import android.view.View;
import android.view.WindowInsets;
public final class f3 implements View.OnApplyWindowInsetsListener {
    public final int f18863a;

    public f3(int i10) {
        this.f18863a = i10;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f18863a) {
            case 0:
                return h3.a(view, windowInsets);
            case 1:
                return org.telegram.ui.i4.e(windowInsets);
            default:
                view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                return windowInsets;
        }
    }
}
