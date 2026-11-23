package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class wv extends FrameLayout {
    public final ty f41860a;

    public wv(ty tyVar, Context context) {
        super(context);
        this.f41860a = tyVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ty tyVar = this.f41860a;
        zv zvVar = tyVar.f40108p0;
        if (view == tyVar.f40089i0) {
            canvas.save();
            canvas.clipRect(0.0f, zvVar.getY() + zvVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }
}
