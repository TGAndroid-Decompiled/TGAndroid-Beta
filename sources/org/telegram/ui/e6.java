package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
public final class e6 implements org.telegram.ui.Components.kw0 {
    public final int f39003a;
    public final FrameLayout f39004b;

    public e6(int i10, FrameLayout frameLayout) {
        this.f39003a = i10;
        this.f39004b = frameLayout;
    }

    @Override
    public final void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.f39003a) {
            case 0:
                org.telegram.ui.Components.mm0 mm0Var = (org.telegram.ui.Components.mm0) recyclerView;
                ih.d.a(mm0Var, canvas, rectF, mm0Var, this.f39004b);
                return;
            default:
                org.telegram.ui.Components.mm0 mm0Var2 = (org.telegram.ui.Components.mm0) recyclerView;
                ih.d.a(mm0Var2, canvas, rectF, mm0Var2, this.f39004b);
                return;
        }
    }
}
