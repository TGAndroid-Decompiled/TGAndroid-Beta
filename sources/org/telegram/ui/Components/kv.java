package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class kv extends FrameLayout {
    public final hy f35437a;

    public kv(hy hyVar, Context context) {
        super(context);
        this.f35437a = hyVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        hy hyVar = this.f35437a;
        nv nvVar = hyVar.f34434o0;
        if (view == hyVar.f34415h0) {
            canvas.save();
            canvas.clipRect(0.0f, nvVar.getY() + nvVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }
}
