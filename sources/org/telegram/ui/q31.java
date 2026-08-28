package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class q31 implements View.OnApplyWindowInsetsListener {
    public final int f41662a;
    public final Object f41663b;

    public q31(Object obj, int i9) {
        this.f41662a = i9;
        this.f41663b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f41662a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f41663b, windowInsets);
            default:
                return x51.b((q41) this.f41663b, view, windowInsets);
        }
    }
}
