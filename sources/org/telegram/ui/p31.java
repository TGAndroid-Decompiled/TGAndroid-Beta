package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class p31 implements View.OnApplyWindowInsetsListener {
    public final int f42344a;
    public final Object f42345b;

    public p31(Object obj, int i10) {
        this.f42344a = i10;
        this.f42345b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f42344a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f42345b, windowInsets);
            default:
                return y51.b((r41) this.f42345b, view, windowInsets);
        }
    }
}
