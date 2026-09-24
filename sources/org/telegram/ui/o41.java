package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class o41 implements View.OnApplyWindowInsetsListener {
    public final int f36024a;
    public final Object f36025b;

    public o41(Object obj, int i10) {
        this.f36024a = i10;
        this.f36025b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f36024a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f36025b, windowInsets);
            default:
                return w61.b((p51) this.f36025b, view, windowInsets);
        }
    }
}
