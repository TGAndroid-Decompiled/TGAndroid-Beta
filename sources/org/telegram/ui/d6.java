package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
public final class d6 implements org.telegram.ui.Components.zv0 {
    public final int f35651a;
    public final FrameLayout f35652b;

    public d6(int i10, FrameLayout frameLayout) {
        this.f35651a = i10;
        this.f35652b = frameLayout;
    }

    @Override
    public final void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.f35651a) {
            case 0:
                org.telegram.ui.Components.zl0 zl0Var = (org.telegram.ui.Components.zl0) recyclerView;
                gh.d.a(zl0Var, canvas, rectF, zl0Var, this.f35652b);
                return;
            default:
                org.telegram.ui.Components.zl0 zl0Var2 = (org.telegram.ui.Components.zl0) recyclerView;
                gh.d.a(zl0Var2, canvas, rectF, zl0Var2, this.f35652b);
                return;
        }
    }
}
