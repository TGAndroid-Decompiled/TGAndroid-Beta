package org.telegram.ui.ActionBar;

import android.view.View;
import android.view.WindowInsets;
public final class h3 implements View.OnApplyWindowInsetsListener {
    public final int f18943a;

    public h3(int i10) {
        this.f18943a = i10;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f18943a) {
            case 0:
                return j3.a(view, windowInsets);
            case 1:
                return org.telegram.ui.j4.e(windowInsets);
            default:
                view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                return windowInsets;
        }
    }
}
