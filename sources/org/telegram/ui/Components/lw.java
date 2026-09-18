package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class lw extends FrameLayout {
    public final kz f25982a;

    public lw(kz kzVar, Context context) {
        super(context);
        this.f25982a = kzVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        kz kzVar = this.f25982a;
        pw pwVar = kzVar.f25751o0;
        if (view == kzVar.f25731h0) {
            canvas.save();
            canvas.clipRect(0.0f, pwVar.getY() + pwVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }
}
