package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class mw extends FrameLayout {
    public final kz f26498a;

    public mw(kz kzVar, Context context) {
        super(context);
        this.f26498a = kzVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        kz kzVar = this.f26498a;
        qw qwVar = kzVar.f25933o0;
        if (view == kzVar.f25913h0) {
            canvas.save();
            canvas.clipRect(0.0f, qwVar.getY() + qwVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }
}
