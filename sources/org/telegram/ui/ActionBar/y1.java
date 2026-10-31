package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ju0;
import org.telegram.ui.Components.tk0;
public final class y1 implements r0.m, ju0 {
    public final int f21553a;
    public final FrameLayout f21554b;

    public y1(int i10, FrameLayout frameLayout) {
        this.f21553a = i10;
        this.f21554b = frameLayout;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        r0.g1 g1Var = j1Var.f46132a;
        Rect rect = new Rect();
        if (Build.VERSION.SDK_INT >= 30) {
            i0.c f7 = g1Var.f(527);
            rect.set(f7.f7765a, f7.f7766b, f7.f7767c, f7.d);
        } else {
            rect.set(g1Var.i().f7765a, g1Var.i().f7766b, g1Var.i().f7767c, g1Var.i().d);
        }
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom + org.telegram.messenger.i0.f16021n;
        FrameLayout frameLayout = this.f21554b;
        frameLayout.setPadding(i10, i11, i12, i13);
        frameLayout.requestLayout();
        return j1Var;
    }

    @Override
    public void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.f21553a) {
            case 1:
                tk0 tk0Var = (tk0) recyclerView;
                yg.d.a(tk0Var, canvas, rectF, tk0Var, this.f21554b);
                return;
            case 2:
                tk0 tk0Var2 = (tk0) recyclerView;
                yg.d.a(tk0Var2, canvas, rectF, tk0Var2, this.f21554b);
                return;
            default:
                tk0 tk0Var3 = (tk0) recyclerView;
                yg.d.a(tk0Var3, canvas, rectF, tk0Var3, this.f21554b);
                return;
        }
    }
}
