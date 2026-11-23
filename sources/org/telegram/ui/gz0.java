package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class gz0 implements View.OnApplyWindowInsetsListener {
    public final int f48186a;
    public final Object f48187b;

    public gz0(Object obj, int i7) {
        this.f48186a = i7;
        this.f48187b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f48186a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f48187b, windowInsets);
            default:
                return o11.b((i01) this.f48187b, view, windowInsets);
        }
    }
}
