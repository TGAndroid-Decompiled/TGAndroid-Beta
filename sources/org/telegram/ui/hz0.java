package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class hz0 implements View.OnApplyWindowInsetsListener {
    public final int f46433a;
    public final Object f46434b;

    public hz0(Object obj, int i7) {
        this.f46433a = i7;
        this.f46434b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f46433a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f46434b, windowInsets);
            default:
                return o11.b((i01) this.f46434b, view, windowInsets);
        }
    }
}
