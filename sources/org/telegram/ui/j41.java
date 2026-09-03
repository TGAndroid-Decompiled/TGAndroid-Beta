package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class j41 implements View.OnApplyWindowInsetsListener {
    public final int f37844a;
    public final Object f37845b;

    public j41(Object obj, int i10) {
        this.f37844a = i10;
        this.f37845b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f37844a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f37845b, windowInsets);
            default:
                return s61.b((l51) this.f37845b, view, windowInsets);
        }
    }
}
