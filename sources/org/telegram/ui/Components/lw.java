package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class lw extends FrameLayout {
    public final ly f36909a;

    public lw(ly lyVar, Context context) {
        super(context);
        this.f36909a = lyVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ly lyVar = this.f36909a;
        qw qwVar = lyVar.J;
        nv nvVar = lyVar.W;
        yw ywVar = lyVar.Q;
        if (view != ywVar && view != nvVar) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y10 = qwVar.getY() + qwVar.getMeasuredHeight() + 1.0f;
        if (view == ywVar && nvVar != null) {
            y10 = Math.max(y10, nvVar.getY() + nvVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y10 - (org.telegram.messenger.g0.L(16.0f) * lyVar.f36932b.f57081e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
