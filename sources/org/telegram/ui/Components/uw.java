package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class uw extends FrameLayout {
    public final vy f31066a;

    public uw(vy vyVar, Context context) {
        super(context);
        this.f31066a = vyVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        vy vyVar = this.f31066a;
        zw zwVar = vyVar.I;
        tv tvVar = vyVar.V;
        hx hxVar = vyVar.P;
        if (view != hxVar && view != tvVar) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float y3 = zwVar.getY() + zwVar.getMeasuredHeight() + 1.0f;
        if (view == hxVar && tvVar != null) {
            y3 = Math.max(y3, tvVar.getY() + tvVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (org.telegram.messenger.i0.L(16.0f) * vyVar.f31859b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }
}
