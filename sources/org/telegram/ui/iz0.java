package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class iz0 implements View.OnApplyWindowInsetsListener {
    public final int f46777a;
    public final Object f46778b;

    public iz0(Object obj, int i7) {
        this.f46777a = i7;
        this.f46778b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f46777a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f46778b, windowInsets);
            default:
                return p11.b((j01) this.f46778b, view, windowInsets);
        }
    }
}
