package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class f30 extends org.telegram.ui.Components.zk0 {
    public final s50 T2;

    public f30(s50 s50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.T2 = s50Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Components.e20 e20Var = (org.telegram.ui.Components.e20) view;
        s50 s50Var = this.T2;
        y40 y40Var = s50Var.M;
        j30 j30Var = s50Var.W1;
        if (j30Var.f33668r == null && !s50Var.J2.k()) {
            e20Var.setAlpha(1.0f);
            e20Var.setTranslationX(0.0f);
            e20Var.setTranslationY(0.0f);
        }
        f30 f30Var = s50Var.f42446i2;
        e20Var.getClass();
        f30Var.getClass();
        if (RecyclerView.R(e20Var) == -1 && e20Var.getRenderer() != null) {
            return true;
        }
        if (e20Var.getTranslationY() == 0.0f || e20Var.getRenderer() == null || e20Var.getRenderer().f33875c == null) {
            return super.drawChild(canvas, view, j10);
        }
        float top = y40Var.getTop() - getTop();
        float measuredHeight = y40Var.getMeasuredHeight() + top;
        float f10 = j30Var.f33650c;
        canvas.save();
        float f11 = 1.0f - f10;
        canvas.clipRect(0.0f, top * f11, getMeasuredWidth(), (getMeasuredHeight() * f10) + (measuredHeight * f11));
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return zDrawChild;
    }
}
