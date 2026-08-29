package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.hv0;
public final class e extends a0 {
    public final l h;

    public e(l lVar, Context context, l lVar2) {
        super(context, lVar2);
        this.h = lVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        l lVar = this.h;
        Paint paint = lVar.H0;
        if (lVar.G0 && this.f22718a && lVar.f23632w != 0) {
            lVar.I0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            paint.setColor(lVar.f23632w);
            canvas2 = canvas;
            lVar.F0.J(canvas2, 0.0f, lVar.I0, paint, true);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hv0 hv0Var = this.h.F0;
        if (hv0Var != null) {
            hv0Var.P.add(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hv0 hv0Var = this.h.F0;
        if (hv0Var != null) {
            hv0Var.P.remove(this);
        }
    }

    @Override
    public final void setAlpha(float f9) {
        super.setAlpha(f9);
        l lVar = this.h;
        lVar.invalidate();
        Runnable runnable = lVar.P0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void setBackgroundColor(int i10) {
        l lVar = this.h;
        lVar.f23632w = i10;
        if (!lVar.G0) {
            super.setBackgroundColor(i10);
        }
    }
}
