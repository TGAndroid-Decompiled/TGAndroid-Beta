package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class gz0 implements View.OnApplyWindowInsetsListener {
    public final int f48182a;
    public final Object f48183b;

    public gz0(Object obj, int i7) {
        this.f48182a = i7;
        this.f48183b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f48182a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f48183b, windowInsets);
            default:
                return o11.b((i01) this.f48183b, view, windowInsets);
        }
    }
}
