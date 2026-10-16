package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class xw extends FrameLayout {
    public final wz f31081a;

    public xw(wz wzVar, Context context) {
        super(context);
        this.f31081a = wzVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        wz wzVar = this.f31081a;
        bx bxVar = wzVar.f30742o0;
        if (view == wzVar.f30722h0) {
            canvas.save();
            canvas.clipRect(0.0f, bxVar.getY() + bxVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }
}
