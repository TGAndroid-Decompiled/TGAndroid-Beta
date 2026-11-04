package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class q10 extends org.telegram.ui.Components.tj0 {
    public final x30 f48729f3;

    public q10(x30 x30Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f48729f3 = x30Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Components.d10 d10Var = (org.telegram.ui.Components.d10) view;
        x30 x30Var = this.f48729f3;
        f30 f30Var = x30Var.I1;
        u10 u10Var = x30Var.S3;
        if (u10Var.f39690r == null && !x30Var.F4.k()) {
            d10Var.setAlpha(1.0f);
            d10Var.setTranslationX(0.0f);
            d10Var.setTranslationY(0.0f);
        }
        q10 q10Var = x30Var.f51733e4;
        d10Var.getClass();
        q10Var.getClass();
        if (RecyclerView.R(d10Var) == -1 && d10Var.getRenderer() != null) {
            return true;
        }
        if (d10Var.getTranslationY() != 0.0f && d10Var.getRenderer() != null && d10Var.getRenderer().f39550c != null) {
            float top = f30Var.getTop() - getTop();
            float measuredHeight = f30Var.getMeasuredHeight() + top;
            float f10 = u10Var.f39672c;
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
