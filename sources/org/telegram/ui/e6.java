package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
public final class e6 implements org.telegram.ui.Components.lw0 {
    public final int f38762a;
    public final FrameLayout f38763b;

    public e6(int i10, FrameLayout frameLayout) {
        this.f38762a = i10;
        this.f38763b = frameLayout;
    }

    @Override
    public final void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.f38762a) {
            case 0:
                org.telegram.ui.Components.nm0 nm0Var = (org.telegram.ui.Components.nm0) recyclerView;
                ih.d.a(nm0Var, canvas, rectF, nm0Var, this.f38763b);
                return;
            default:
                org.telegram.ui.Components.nm0 nm0Var2 = (org.telegram.ui.Components.nm0) recyclerView;
                ih.d.a(nm0Var2, canvas, rectF, nm0Var2, this.f38763b);
                return;
        }
    }
}
