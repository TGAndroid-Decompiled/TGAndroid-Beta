package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class c41 implements View.OnApplyWindowInsetsListener {
    public final int f33091a;
    public final Object f33092b;

    public c41(Object obj, int i10) {
        this.f33091a = i10;
        this.f33092b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f33091a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f33092b, windowInsets);
            default:
                return m61.b((e51) this.f33092b, view, windowInsets);
        }
    }
}
