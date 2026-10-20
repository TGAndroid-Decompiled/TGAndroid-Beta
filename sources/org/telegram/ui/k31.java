package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class k31 implements View.OnApplyWindowInsetsListener {
    public final int f38409a;
    public final Object f38410b;

    public k31(Object obj, int i10) {
        this.f38409a = i10;
        this.f38410b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f38409a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f38410b, windowInsets);
            default:
                return t51.b((m41) this.f38410b, view, windowInsets);
        }
    }
}
