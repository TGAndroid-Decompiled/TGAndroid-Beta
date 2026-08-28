package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class yv extends FrameLayout {
    public final wy f35083a;

    public yv(wy wyVar, Context context) {
        super(context);
        this.f35083a = wyVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        wy wyVar = this.f35083a;
        cw cwVar = wyVar.f34417k0;
        if (view == wyVar.f34394d0) {
            canvas.save();
            canvas.clipRect(0.0f, cwVar.getY() + cwVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }
}
