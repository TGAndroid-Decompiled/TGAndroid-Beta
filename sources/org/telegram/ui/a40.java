package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class a40 extends org.telegram.ui.Components.mm0 {
    public final n60 V2;

    public a40(n60 n60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.V2 = n60Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Components.e30 e30Var = (org.telegram.ui.Components.e30) view;
        n60 n60Var = this.V2;
        t50 t50Var = n60Var.Q;
        e40 e40Var = n60Var.a2;
        if (e40Var.f30300r == null && !n60Var.N2.k()) {
            e30Var.setAlpha(1.0f);
            e30Var.setTranslationX(0.0f);
            e30Var.setTranslationY(0.0f);
        }
        a40 a40Var = n60Var.f38491m2;
        e30Var.getClass();
        a40Var.getClass();
        if (RecyclerView.R(e30Var) == -1 && e30Var.getRenderer() != null) {
            return true;
        }
        if (e30Var.getTranslationY() != 0.0f && e30Var.getRenderer() != null && e30Var.getRenderer().f30480c != null) {
            float top = t50Var.getTop() - getTop();
            float measuredHeight = t50Var.getMeasuredHeight() + top;
            float f7 = e40Var.f30283c;
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
