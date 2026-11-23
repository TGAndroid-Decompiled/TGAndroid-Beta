package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class uv extends FrameLayout {
    public final qy f40477a;

    public uv(qy qyVar, Context context) {
        super(context);
        this.f40477a = qyVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        qy qyVar = this.f40477a;
        xv xvVar = qyVar.f39081p0;
        if (view == qyVar.f39062i0) {
            canvas.save();
            canvas.clipRect(0.0f, xvVar.getY() + xvVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }
}
