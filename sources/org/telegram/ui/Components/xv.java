package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

public final class xv extends FrameLayout {

    public final yy f34721a;

    public xv(yy yyVar, Context context) {
        super(context);
        this.f34721a = yyVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        yy yyVar = this.f34721a;
        bw bwVar = yyVar.f35010k0;
        if (view != yyVar.f34987d0) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipRect(0.0f, bwVar.getY() + bwVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return zDrawChild;
    }
}
