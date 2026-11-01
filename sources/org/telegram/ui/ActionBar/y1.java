package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ku0;
import org.telegram.ui.Components.uk0;
public final class y1 implements r0.m, ku0 {
    public final int f21554a;
    public final FrameLayout f21555b;

    public y1(int i10, FrameLayout frameLayout) {
        this.f21554a = i10;
        this.f21555b = frameLayout;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        r0.g1 g1Var = j1Var.f46143a;
        Rect rect = new Rect();
        if (Build.VERSION.SDK_INT >= 30) {
            i0.c f7 = g1Var.f(527);
            rect.set(f7.f7766a, f7.f7767b, f7.f7768c, f7.d);
        } else {
            rect.set(g1Var.i().f7766a, g1Var.i().f7767b, g1Var.i().f7768c, g1Var.i().d);
        }
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom + org.telegram.messenger.i0.f16167n;
        FrameLayout frameLayout = this.f21555b;
        frameLayout.setPadding(i10, i11, i12, i13);
        frameLayout.requestLayout();
        return j1Var;
    }

    @Override
    public void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.f21554a) {
            case 1:
                uk0 uk0Var = (uk0) recyclerView;
                yg.d.a(uk0Var, canvas, rectF, uk0Var, this.f21555b);
                return;
            case 2:
                uk0 uk0Var2 = (uk0) recyclerView;
                yg.d.a(uk0Var2, canvas, rectF, uk0Var2, this.f21555b);
                return;
            default:
                uk0 uk0Var3 = (uk0) recyclerView;
                yg.d.a(uk0Var3, canvas, rectF, uk0Var3, this.f21555b);
                return;
        }
    }
}
