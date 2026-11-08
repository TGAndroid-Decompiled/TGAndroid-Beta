package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class gw extends FrameLayout {
    public final hy f34030a;

    public gw(hy hyVar, Context context) {
        super(context);
        this.f34030a = hyVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        hy hyVar = this.f34030a;
        lw lwVar = hyVar.I;
        iv ivVar = hyVar.V;
        tw twVar = hyVar.P;
        if (view != twVar && view != ivVar) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y10 = lwVar.getY() + lwVar.getMeasuredHeight() + 1.0f;
        if (view == twVar && ivVar != null) {
            y10 = Math.max(y10, ivVar.getY() + ivVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y10 - (org.telegram.messenger.g0.L(16.0f) * hyVar.f34394b.f55486e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
