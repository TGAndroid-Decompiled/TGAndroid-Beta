package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class gz0 implements View.OnApplyWindowInsetsListener {
    public final int f48105a;
    public final Object f48106b;

    public gz0(Object obj, int i7) {
        this.f48105a = i7;
        this.f48106b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f48105a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f48106b, windowInsets);
            default:
                return n11.b((h01) this.f48106b, view, windowInsets);
        }
    }
}
