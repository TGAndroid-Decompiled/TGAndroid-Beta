package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class m31 implements View.OnApplyWindowInsetsListener {
    public final int f38979a;
    public final Object f38980b;

    public m31(Object obj, int i10) {
        this.f38979a = i10;
        this.f38980b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f38979a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f38980b, windowInsets);
            default:
                return v51.b((o41) this.f38980b, view, windowInsets);
        }
    }
}
