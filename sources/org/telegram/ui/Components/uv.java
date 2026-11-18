package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class uv extends FrameLayout {
    public final ry f40426a;

    public uv(ry ryVar, Context context) {
        super(context);
        this.f40426a = ryVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ry ryVar = this.f40426a;
        xv xvVar = ryVar.f39379p0;
        if (view == ryVar.f39360i0) {
            canvas.save();
            canvas.clipRect(0.0f, xvVar.getY() + xvVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }
}
