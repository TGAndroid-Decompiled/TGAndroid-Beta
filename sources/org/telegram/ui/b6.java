package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
public final class b6 implements org.telegram.ui.Components.ft0 {
    public final int f43934a;
    public final FrameLayout f43935b;

    public b6(int i3, FrameLayout frameLayout) {
        this.f43934a = i3;
        this.f43935b = frameLayout;
    }

    @Override
    public final void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.f43934a) {
            case 0:
                org.telegram.ui.Components.tj0 tj0Var = (org.telegram.ui.Components.tj0) recyclerView;
                jh.d.a(tj0Var, canvas, rectF, tj0Var, this.f43935b);
                return;
            default:
                org.telegram.ui.Components.tj0 tj0Var2 = (org.telegram.ui.Components.tj0) recyclerView;
                jh.d.a(tj0Var2, canvas, rectF, tj0Var2, this.f43935b);
                return;
        }
    }
}
