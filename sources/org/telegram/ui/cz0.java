package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class cz0 implements View.OnApplyWindowInsetsListener {
    public final int f46274a;
    public final Object f46275b;

    public cz0(Object obj, int i7) {
        this.f46274a = i7;
        this.f46275b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f46274a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f46275b, windowInsets);
            default:
                return j11.b((d01) this.f46275b, view, windowInsets);
        }
    }
}
