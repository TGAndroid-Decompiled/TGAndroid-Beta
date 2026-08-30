package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class iw extends FrameLayout {
    public final kz f25792a;

    public iw(kz kzVar, Context context) {
        super(context);
        this.f25792a = kzVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        kz kzVar = this.f25792a;
        mw mwVar = kzVar.f26445l0;
        if (view == kzVar.f26423e0) {
            canvas.save();
            canvas.clipRect(0.0f, mwVar.getY() + mwVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }
}
