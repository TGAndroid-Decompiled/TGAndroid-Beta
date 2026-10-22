package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class k31 implements View.OnApplyWindowInsetsListener {
    public final int f38413a;
    public final Object f38414b;

    public k31(Object obj, int i10) {
        this.f38413a = i10;
        this.f38414b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f38413a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f38414b, windowInsets);
            default:
                return t51.b((m41) this.f38414b, view, windowInsets);
        }
    }
}
