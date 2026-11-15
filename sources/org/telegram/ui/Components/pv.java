package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class pv extends FrameLayout {
    public final ly f38415a;

    public pv(ly lyVar, Context context) {
        super(context);
        this.f38415a = lyVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ly lyVar = this.f38415a;
        sv svVar = lyVar.f36975p0;
        if (view == lyVar.f36956i0) {
            canvas.save();
            canvas.clipRect(0.0f, svVar.getY() + svVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }
}
