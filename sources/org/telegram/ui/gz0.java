package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class gz0 implements View.OnApplyWindowInsetsListener {
    public final int f48148a;
    public final Object f48149b;

    public gz0(Object obj, int i7) {
        this.f48148a = i7;
        this.f48149b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f48148a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f48149b, windowInsets);
            default:
                return n11.b((h01) this.f48149b, view, windowInsets);
        }
    }
}
