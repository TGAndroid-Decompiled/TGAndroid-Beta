package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class jv extends FrameLayout {
    public final gy f35081a;

    public jv(gy gyVar, Context context) {
        super(context);
        this.f35081a = gyVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        gy gyVar = this.f35081a;
        mv mvVar = gyVar.f34050o0;
        if (view == gyVar.f34031h0) {
            canvas.save();
            canvas.clipRect(0.0f, mvVar.getY() + mvVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }
}
