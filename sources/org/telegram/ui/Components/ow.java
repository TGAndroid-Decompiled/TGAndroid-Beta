package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class ow extends FrameLayout {
    public final mz f27191a;

    public ow(mz mzVar, Context context) {
        super(context);
        this.f27191a = mzVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        mz mzVar = this.f27191a;
        sw swVar = mzVar.f26566o0;
        if (view == mzVar.f26546h0) {
            canvas.save();
            canvas.clipRect(0.0f, swVar.getY() + swVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }
}
