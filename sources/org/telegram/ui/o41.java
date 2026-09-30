package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class o41 implements View.OnApplyWindowInsetsListener {
    public final int f36186a;
    public final Object f36187b;

    public o41(Object obj, int i10) {
        this.f36186a = i10;
        this.f36187b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f36186a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f36187b, windowInsets);
            default:
                return w61.b((p51) this.f36187b, view, windowInsets);
        }
    }
}
