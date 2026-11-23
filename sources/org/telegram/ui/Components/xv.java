package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class xv extends FrameLayout {
    public final ty f42228a;

    public xv(ty tyVar, Context context) {
        super(context);
        this.f42228a = tyVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ty tyVar = this.f42228a;
        aw awVar = tyVar.f40126p0;
        if (view == tyVar.f40107i0) {
            canvas.save();
            canvas.clipRect(0.0f, awVar.getY() + awVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }
}
