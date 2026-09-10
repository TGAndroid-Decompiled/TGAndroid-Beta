package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class rw extends FrameLayout {
    public final rz f26771a;

    public rw(rz rzVar, Context context) {
        super(context);
        this.f26771a = rzVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        rz rzVar = this.f26771a;
        vw vwVar = rzVar.f26840o0;
        if (view == rzVar.f26820h0) {
            canvas.save();
            canvas.clipRect(0.0f, vwVar.getY() + vwVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }
}
