package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class iv extends FrameLayout {
    public final ey f34833a;

    public iv(ey eyVar, Context context) {
        super(context);
        this.f34833a = eyVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ey eyVar = this.f34833a;
        lv lvVar = eyVar.f33564p0;
        if (view == eyVar.f33545i0) {
            canvas.save();
            canvas.clipRect(0.0f, lvVar.getY() + lvVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }
}
