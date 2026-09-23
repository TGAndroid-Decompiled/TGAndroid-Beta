package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class n41 implements View.OnApplyWindowInsetsListener {
    public final int f35434a;
    public final Object f35435b;

    public n41(Object obj, int i10) {
        this.f35434a = i10;
        this.f35435b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f35434a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f35435b, windowInsets);
            default:
                return v61.b((o51) this.f35435b, view, windowInsets);
        }
    }
}
