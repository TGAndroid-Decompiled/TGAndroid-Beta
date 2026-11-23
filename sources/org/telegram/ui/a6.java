package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
public final class a6 implements org.telegram.ui.Components.rt0 {
    public final int f45593a;
    public final FrameLayout f45594b;

    public a6(int i7, FrameLayout frameLayout) {
        this.f45593a = i7;
        this.f45594b = frameLayout;
    }

    @Override
    public final void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.f45593a) {
            case 0:
                org.telegram.ui.Components.ek0 ek0Var = (org.telegram.ui.Components.ek0) recyclerView;
                ih.d.a(ek0Var, canvas, rectF, ek0Var, this.f45594b);
                return;
            default:
                org.telegram.ui.Components.ek0 ek0Var2 = (org.telegram.ui.Components.ek0) recyclerView;
                ih.d.a(ek0Var2, canvas, rectF, ek0Var2, this.f45594b);
                return;
        }
    }
}
