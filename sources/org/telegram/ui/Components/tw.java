package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class tw extends FrameLayout {
    public final ty f40072a;

    public tw(ty tyVar, Context context) {
        super(context);
        this.f40072a = tyVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ty tyVar = this.f40072a;
        yw ywVar = tyVar.J;
        vv vvVar = tyVar.W;
        gx gxVar = tyVar.Q;
        if (view != gxVar && view != vvVar) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y10 = ywVar.getY() + ywVar.getMeasuredHeight() + 1.0f;
        if (view == gxVar && vvVar != null) {
            y10 = Math.max(y10, vvVar.getY() + vvVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y10 - (org.telegram.messenger.g0.L(16.0f) * tyVar.f40090b.f57696e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
