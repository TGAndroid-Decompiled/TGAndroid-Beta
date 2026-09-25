package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class o41 implements View.OnApplyWindowInsetsListener {
    public final int f36049a;
    public final Object f36050b;

    public o41(Object obj, int i10) {
        this.f36049a = i10;
        this.f36050b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f36049a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f36050b, windowInsets);
            default:
                return w61.b((p51) this.f36050b, view, windowInsets);
        }
    }
}
