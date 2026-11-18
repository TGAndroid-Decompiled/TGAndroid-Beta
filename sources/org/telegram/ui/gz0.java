package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class gz0 implements View.OnApplyWindowInsetsListener {
    public final int f48177a;
    public final Object f48178b;

    public gz0(Object obj, int i7) {
        this.f48177a = i7;
        this.f48178b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f48177a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f48178b, windowInsets);
            default:
                return n11.b((h01) this.f48178b, view, windowInsets);
        }
    }
}
