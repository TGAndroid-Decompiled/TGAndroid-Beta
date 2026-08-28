package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class c30 extends org.telegram.ui.Components.wk0 {
    public final o50 T2;

    public c30(o50 o50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.T2 = o50Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Components.b20 b20Var = (org.telegram.ui.Components.b20) view;
        o50 o50Var = this.T2;
        u40 u40Var = o50Var.M;
        g30 g30Var = o50Var.W1;
        if (g30Var.f33618r == null && !o50Var.J2.k()) {
            b20Var.setAlpha(1.0f);
            b20Var.setTranslationX(0.0f);
            b20Var.setTranslationY(0.0f);
        }
        c30 c30Var = o50Var.f40917i2;
        b20Var.getClass();
        c30Var.getClass();
        if (RecyclerView.R(b20Var) == -1 && b20Var.getRenderer() != null) {
            return true;
        }
        if (b20Var.getTranslationY() != 0.0f && b20Var.getRenderer() != null && b20Var.getRenderer().f33825c != null) {
            float top = u40Var.getTop() - getTop();
            float measuredHeight = u40Var.getMeasuredHeight() + top;
            float f10 = g30Var.f33600c;
            canvas.save();
            float f11 = 1.0f - f10;
            canvas.clipRect(0.0f, top * f11, getMeasuredWidth(), (getMeasuredHeight() * f10) + (measuredHeight * f11));
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }
}
