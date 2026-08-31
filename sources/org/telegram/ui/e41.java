package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class e41 implements View.OnApplyWindowInsetsListener {
    public final int f36394a;
    public final Object f36395b;

    public e41(Object obj, int i10) {
        this.f36394a = i10;
        this.f36395b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f36394a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f36395b, windowInsets);
            default:
                return n61.b((g51) this.f36395b, view, windowInsets);
        }
    }
}
