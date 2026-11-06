package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class ez0 implements View.OnApplyWindowInsetsListener {
    public final int f45447a;
    public final Object f45448b;

    public ez0(Object obj, int i7) {
        this.f45447a = i7;
        this.f45448b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f45447a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f45448b, windowInsets);
            default:
                return m11.b((g01) this.f45448b, view, windowInsets);
        }
    }
}
