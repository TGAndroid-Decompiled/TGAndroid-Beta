package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class a51 implements View.OnApplyWindowInsetsListener {
    public final int f30805a;
    public final Object f30806b;

    public a51(Object obj, int i10) {
        this.f30805a = i10;
        this.f30806b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f30805a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f30806b, windowInsets);
            default:
                return h71.b((a61) this.f30806b, view, windowInsets);
        }
    }
}
