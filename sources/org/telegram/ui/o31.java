package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class o31 implements View.OnApplyWindowInsetsListener {
    public final int f40057a;
    public final Object f40058b;

    public o31(Object obj, int i10) {
        this.f40057a = i10;
        this.f40058b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f40057a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f40058b, windowInsets);
            default:
                return x51.b((q41) this.f40058b, view, windowInsets);
        }
    }
}
