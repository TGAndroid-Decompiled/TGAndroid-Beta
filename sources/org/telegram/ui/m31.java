package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class m31 implements View.OnApplyWindowInsetsListener {
    public final int f38998a;
    public final Object f38999b;

    public m31(Object obj, int i10) {
        this.f38998a = i10;
        this.f38999b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f38998a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f38999b, windowInsets);
            default:
                return v51.b((o41) this.f38999b, view, windowInsets);
        }
    }
}
