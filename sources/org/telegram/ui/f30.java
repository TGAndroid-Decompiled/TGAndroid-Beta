package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class f30 extends org.telegram.ui.Components.im0 {
    public final s50 V2;

    public f30(s50 s50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.V2 = s50Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Components.z20 z20Var = (org.telegram.ui.Components.z20) view;
        s50 s50Var = this.V2;
        y40 y40Var = s50Var.Q;
        j30 j30Var = s50Var.a2;
        if (j30Var.f31580r == null && !s50Var.N2.k()) {
            z20Var.setAlpha(1.0f);
            z20Var.setTranslationX(0.0f);
            z20Var.setTranslationY(0.0f);
        }
        f30 f30Var = s50Var.f40983m2;
        z20Var.getClass();
        f30Var.getClass();
        if (RecyclerView.R(z20Var) == -1 && z20Var.getRenderer() != null) {
            return true;
        }
        if (z20Var.getTranslationY() != 0.0f && z20Var.getRenderer() != null && z20Var.getRenderer().f31758c != null) {
            float top = y40Var.getTop() - getTop();
            float measuredHeight = y40Var.getMeasuredHeight() + top;
            float f7 = j30Var.f31563c;
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
