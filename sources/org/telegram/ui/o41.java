package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class o41 implements View.OnApplyWindowInsetsListener {
    public final int f36047a;
    public final Object f36048b;

    public o41(Object obj, int i10) {
        this.f36047a = i10;
        this.f36048b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f36047a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f36048b, windowInsets);
            default:
                return w61.b((p51) this.f36048b, view, windowInsets);
        }
    }
}
