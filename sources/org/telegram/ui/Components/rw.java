package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class rw extends FrameLayout {
    public final rz f30278a;

    public rw(rz rzVar, Context context) {
        super(context);
        this.f30278a = rzVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        rz rzVar = this.f30278a;
        vw vwVar = rzVar.f30345o0;
        if (view == rzVar.f30325h0) {
            canvas.save();
            canvas.clipRect(0.0f, vwVar.getY() + vwVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }
}
