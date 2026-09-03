package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class j41 implements View.OnApplyWindowInsetsListener {
    public final int f35083a;
    public final Object f35084b;

    public j41(Object obj, int i10) {
        this.f35083a = i10;
        this.f35084b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f35083a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f35084b, windowInsets);
            default:
                return t61.b((l51) this.f35084b, view, windowInsets);
        }
    }
}
