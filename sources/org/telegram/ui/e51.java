package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class e51 implements View.OnApplyWindowInsetsListener {
    public final int f35204a;
    public final Object f35205b;

    public e51(Object obj, int i10) {
        this.f35204a = i10;
        this.f35205b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f35204a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f35205b, windowInsets);
            default:
                return n71.b((g61) this.f35205b, view, windowInsets);
        }
    }
}
