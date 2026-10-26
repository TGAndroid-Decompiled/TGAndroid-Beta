package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class p31 implements View.OnApplyWindowInsetsListener {
    public final int f42347a;
    public final Object f42348b;

    public p31(Object obj, int i10) {
        this.f42347a = i10;
        this.f42348b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f42347a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f42348b, windowInsets);
            default:
                return y51.b((r41) this.f42348b, view, windowInsets);
        }
    }
}
