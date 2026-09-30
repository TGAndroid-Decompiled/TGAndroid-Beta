package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class ow extends FrameLayout {
    public final nz f27182a;

    public ow(nz nzVar, Context context) {
        super(context);
        this.f27182a = nzVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        nz nzVar = this.f27182a;
        sw swVar = nzVar.f26853o0;
        if (view == nzVar.f26833h0) {
            canvas.save();
            canvas.clipRect(0.0f, swVar.getY() + swVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }
}
