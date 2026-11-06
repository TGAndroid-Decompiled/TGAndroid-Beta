package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class fw extends FrameLayout {
    public final gy f33640a;

    public fw(gy gyVar, Context context) {
        super(context);
        this.f33640a = gyVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        gy gyVar = this.f33640a;
        kw kwVar = gyVar.I;
        hv hvVar = gyVar.V;
        sw swVar = gyVar.P;
        if (view != swVar && view != hvVar) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y10 = kwVar.getY() + kwVar.getMeasuredHeight() + 1.0f;
        if (view == swVar && hvVar != null) {
            y10 = Math.max(y10, hvVar.getY() + hvVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y10 - (org.telegram.messenger.g0.L(16.0f) * gyVar.f34018b.f55395e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
