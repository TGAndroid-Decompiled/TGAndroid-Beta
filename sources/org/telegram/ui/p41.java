package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class p41 implements View.OnApplyWindowInsetsListener {
    public final int f39353a;
    public final Object f39354b;

    public p41(Object obj, int i10) {
        this.f39353a = i10;
        this.f39354b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f39353a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f39354b, windowInsets);
            default:
                return w61.b((p51) this.f39354b, view, windowInsets);
        }
    }
}
