package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class k31 implements View.OnApplyWindowInsetsListener {
    public final int f38403a;
    public final Object f38404b;

    public k31(Object obj, int i10) {
        this.f38403a = i10;
        this.f38404b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f38403a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f38404b, windowInsets);
            default:
                return t51.b((m41) this.f38404b, view, windowInsets);
        }
    }
}
