package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class vv extends FrameLayout {
    public final vy f31923a;

    public vv(vy vyVar, Context context) {
        super(context);
        this.f31923a = vyVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        vy vyVar = this.f31923a;
        yv yvVar = vyVar.f31978o0;
        if (view == vyVar.f31958h0) {
            canvas.save();
            canvas.clipRect(0.0f, yvVar.getY() + yvVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }
}
