package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class n31 implements View.OnApplyWindowInsetsListener {
    public final int f39714a;
    public final Object f39715b;

    public n31(Object obj, int i10) {
        this.f39714a = i10;
        this.f39715b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f39714a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f39715b, windowInsets);
            default:
                return w51.b((p41) this.f39715b, view, windowInsets);
        }
    }
}
