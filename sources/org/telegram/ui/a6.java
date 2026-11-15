package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
public final class a6 implements org.telegram.ui.Components.ht0 {
    public final int f44943a;
    public final FrameLayout f44944b;

    public a6(int i7, FrameLayout frameLayout) {
        this.f44943a = i7;
        this.f44944b = frameLayout;
    }

    @Override
    public final void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.f44943a) {
            case 0:
                org.telegram.ui.Components.uj0 uj0Var = (org.telegram.ui.Components.uj0) recyclerView;
                ih.d.a(uj0Var, canvas, rectF, uj0Var, this.f44944b);
                return;
            default:
                org.telegram.ui.Components.uj0 uj0Var2 = (org.telegram.ui.Components.uj0) recyclerView;
                ih.d.a(uj0Var2, canvas, rectF, uj0Var2, this.f44944b);
                return;
        }
    }
}
