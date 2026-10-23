package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class d30 extends org.telegram.ui.Components.jm0 {
    public final q50 V2;

    public d30(q50 q50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.V2 = q50Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Components.z20 z20Var = (org.telegram.ui.Components.z20) view;
        q50 q50Var = this.V2;
        w40 w40Var = q50Var.Q;
        h30 h30Var = q50Var.a2;
        if (h30Var.f31538r == null && !q50Var.N2.k()) {
            z20Var.setAlpha(1.0f);
            z20Var.setTranslationX(0.0f);
            z20Var.setTranslationY(0.0f);
        }
        d30 d30Var = q50Var.f40429m2;
        z20Var.getClass();
        d30Var.getClass();
        if (RecyclerView.R(z20Var) == -1 && z20Var.getRenderer() != null) {
            return true;
        }
        if (z20Var.getTranslationY() != 0.0f && z20Var.getRenderer() != null && z20Var.getRenderer().f31716c != null) {
            float top = w40Var.getTop() - getTop();
            float measuredHeight = w40Var.getMeasuredHeight() + top;
            float f7 = h30Var.f31521c;
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
