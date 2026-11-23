package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class fz0 implements View.OnApplyWindowInsetsListener {
    public final int f47997a;
    public final Object f47998b;

    public fz0(Object obj, int i7) {
        this.f47997a = i7;
        this.f47998b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f47997a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f47998b, windowInsets);
            default:
                return m11.b((g01) this.f47998b, view, windowInsets);
        }
    }
}
