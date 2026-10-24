package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class g30 extends org.telegram.ui.Components.lm0 {
    public final u50 Y2;

    public g30(u50 u50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.Y2 = u50Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Components.x20 x20Var = (org.telegram.ui.Components.x20) view;
        u50 u50Var = this.Y2;
        z40 z40Var = u50Var.Q;
        k30 k30Var = u50Var.a2;
        if (k30Var.f31689r == null && !u50Var.N2.k()) {
            x20Var.setAlpha(1.0f);
            x20Var.setTranslationX(0.0f);
            x20Var.setTranslationY(0.0f);
        }
        g30 g30Var = u50Var.f42266m2;
        x20Var.getClass();
        g30Var.getClass();
        if (RecyclerView.R(x20Var) == -1 && x20Var.getRenderer() != null) {
            return true;
        }
        if (x20Var.getTranslationY() != 0.0f && x20Var.getRenderer() != null && x20Var.getRenderer().f31867c != null) {
            float top = z40Var.getTop() - getTop();
            float measuredHeight = z40Var.getMeasuredHeight() + top;
            float f7 = k30Var.f31672c;
            canvas.save();
            float f10 = 1.0f - f7;
            canvas.clipRect(0.0f, top * f10, getMeasuredWidth(), (getMeasuredHeight() * f7) + (measuredHeight * f10));
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }
}
