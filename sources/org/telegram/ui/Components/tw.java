package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class tw extends FrameLayout {
    public final ty f40047a;

    public tw(ty tyVar, Context context) {
        super(context);
        this.f40047a = tyVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ty tyVar = this.f40047a;
        yw ywVar = tyVar.J;
        uv uvVar = tyVar.W;
        gx gxVar = tyVar.Q;
        if (view != gxVar && view != uvVar) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y10 = ywVar.getY() + ywVar.getMeasuredHeight() + 1.0f;
        if (view == gxVar && uvVar != null) {
            y10 = Math.max(y10, uvVar.getY() + uvVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y10 - (org.telegram.messenger.g0.L(16.0f) * tyVar.f40065b.f57665e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
