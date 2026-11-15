package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class cz0 implements View.OnApplyWindowInsetsListener {
    public final int f46246a;
    public final Object f46247b;

    public cz0(Object obj, int i7) {
        this.f46246a = i7;
        this.f46247b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f46246a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f46247b, windowInsets);
            default:
                return j11.b((d01) this.f46247b, view, windowInsets);
        }
    }
}
