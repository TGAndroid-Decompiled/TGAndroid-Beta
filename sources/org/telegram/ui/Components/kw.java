package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class kw extends FrameLayout {
    public final mz f28466a;

    public kw(mz mzVar, Context context) {
        super(context);
        this.f28466a = mzVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        mz mzVar = this.f28466a;
        ow owVar = mzVar.f29300l0;
        if (view == mzVar.f29278e0) {
            canvas.save();
            canvas.clipRect(0.0f, owVar.getY() + owVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }
}
