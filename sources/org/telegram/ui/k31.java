package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class k31 implements View.OnApplyWindowInsetsListener {
    public final int f38414a;
    public final Object f38415b;

    public k31(Object obj, int i10) {
        this.f38414a = i10;
        this.f38415b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f38414a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f38415b, windowInsets);
            default:
                return t51.b((m41) this.f38415b, view, windowInsets);
        }
    }
}
