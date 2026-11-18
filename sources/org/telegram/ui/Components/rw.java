package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class rw extends FrameLayout {
    public final ry f39318a;

    public rw(ry ryVar, Context context) {
        super(context);
        this.f39318a = ryVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ry ryVar = this.f39318a;
        ww wwVar = ryVar.J;
        sv svVar = ryVar.W;
        ex exVar = ryVar.Q;
        if (view != exVar && view != svVar) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y10 = wwVar.getY() + wwVar.getMeasuredHeight() + 1.0f;
        if (view == exVar && svVar != null) {
            y10 = Math.max(y10, svVar.getY() + svVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y10 - (org.telegram.messenger.g0.L(16.0f) * ryVar.f39336b.f57657e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
