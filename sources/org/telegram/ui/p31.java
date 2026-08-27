package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;

public final class p31 implements View.OnApplyWindowInsetsListener {

    public final int f41257a;

    public final Object f41258b;

    public p31(Object obj, int i10) {
        this.f41257a = i10;
        this.f41258b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f41257a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f41258b, windowInsets);
            default:
                return w51.b((p41) this.f41258b, view, windowInsets);
        }
    }
}
