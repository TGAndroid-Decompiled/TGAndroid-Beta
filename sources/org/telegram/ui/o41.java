package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class o41 implements View.OnApplyWindowInsetsListener {
    public final int f36042a;
    public final Object f36043b;

    public o41(Object obj, int i10) {
        this.f36042a = i10;
        this.f36043b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f36042a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f36043b, windowInsets);
            default:
                return w61.b((p51) this.f36043b, view, windowInsets);
        }
    }
}
