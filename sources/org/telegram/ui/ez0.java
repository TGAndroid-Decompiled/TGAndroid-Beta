package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class ez0 implements View.OnApplyWindowInsetsListener {
    public final int f45448a;
    public final Object f45449b;

    public ez0(Object obj, int i7) {
        this.f45448a = i7;
        this.f45449b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f45448a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f45449b, windowInsets);
            default:
                return m11.b((g01) this.f45449b, view, windowInsets);
        }
    }
}
