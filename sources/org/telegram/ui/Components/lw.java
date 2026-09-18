package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class lw extends FrameLayout {
    public final kz f26253a;

    public lw(kz kzVar, Context context) {
        super(context);
        this.f26253a = kzVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        kz kzVar = this.f26253a;
        pw pwVar = kzVar.f25927o0;
        if (view == kzVar.f25907h0) {
            canvas.save();
            canvas.clipRect(0.0f, pwVar.getY() + pwVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }
}
