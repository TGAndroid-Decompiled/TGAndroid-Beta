package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class tw extends FrameLayout {
    public final tz f30687a;

    public tw(tz tzVar, Context context) {
        super(context);
        this.f30687a = tzVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        tz tzVar = this.f30687a;
        xw xwVar = tzVar.f30761o0;
        if (view == tzVar.f30741h0) {
            canvas.save();
            canvas.clipRect(0.0f, xwVar.getY() + xwVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }
}
