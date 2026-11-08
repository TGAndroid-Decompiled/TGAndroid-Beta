package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class ez0 implements View.OnApplyWindowInsetsListener {
    public final int f45406a;
    public final Object f45407b;

    public ez0(Object obj, int i7) {
        this.f45406a = i7;
        this.f45407b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f45406a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f45407b, windowInsets);
            default:
                return m11.b((g01) this.f45407b, view, windowInsets);
        }
    }
}
