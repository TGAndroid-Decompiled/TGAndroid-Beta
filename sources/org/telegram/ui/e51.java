package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class e51 implements View.OnApplyWindowInsetsListener {
    public final int f35466a;
    public final Object f35467b;

    public e51(Object obj, int i10) {
        this.f35466a = i10;
        this.f35467b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f35466a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f35467b, windowInsets);
            default:
                return n71.b((g61) this.f35467b, view, windowInsets);
        }
    }
}
