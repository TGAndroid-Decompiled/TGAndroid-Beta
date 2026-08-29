package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class ew extends FrameLayout {
    public final fz f28193a;

    public ew(fz fzVar, Context context) {
        super(context);
        this.f28193a = fzVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        fz fzVar = this.f28193a;
        iw iwVar = fzVar.f28608k0;
        if (view == fzVar.f28585d0) {
            canvas.save();
            canvas.clipRect(0.0f, iwVar.getY() + iwVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }
}
