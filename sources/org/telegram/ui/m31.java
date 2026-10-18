package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class m31 implements View.OnApplyWindowInsetsListener {
    public final int f39023a;
    public final Object f39024b;

    public m31(Object obj, int i10) {
        this.f39023a = i10;
        this.f39024b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f39023a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f39024b, windowInsets);
            default:
                return v51.b((o41) this.f39024b, view, windowInsets);
        }
    }
}
