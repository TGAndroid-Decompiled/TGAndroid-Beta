package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class i30 extends org.telegram.ui.Components.mm0 {
    public final v50 f40131f3;

    public i30(v50 v50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f40131f3 = v50Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Components.b30 b30Var = (org.telegram.ui.Components.b30) view;
        v50 v50Var = this.f40131f3;
        b50 b50Var = v50Var.Q;
        m30 m30Var = v50Var.a2;
        if (m30Var.f33922r == null && !v50Var.N2.k()) {
            b30Var.setAlpha(1.0f);
            b30Var.setTranslationX(0.0f);
            b30Var.setTranslationY(0.0f);
        }
        i30 i30Var = v50Var.f44659m2;
        b30Var.getClass();
        i30Var.getClass();
        if (RecyclerView.R(b30Var) == -1 && b30Var.getRenderer() != null) {
            return true;
        }
        if (b30Var.getTranslationY() != 0.0f && b30Var.getRenderer() != null && b30Var.getRenderer().f34078c != null) {
            float top = b50Var.getTop() - getTop();
            float measuredHeight = b50Var.getMeasuredHeight() + top;
            float f7 = m30Var.f33905c;
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
