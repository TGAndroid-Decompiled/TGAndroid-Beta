package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.cw0;
public final class d extends a0 {
    public final l h;

    public d(l lVar, Context context, l lVar2) {
        super(context, lVar2);
        this.h = lVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        l lVar = this.h;
        Paint paint = lVar.N0;
        if (lVar.M0 && this.f18659a && lVar.f19590w != 0) {
            lVar.O0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            paint.setColor(lVar.f19590w);
            canvas2 = canvas;
            lVar.L0.J(canvas2, 0.0f, lVar.O0, paint, true);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cw0 cw0Var = this.h.L0;
        if (cw0Var != null) {
            cw0Var.T.add(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cw0 cw0Var = this.h.L0;
        if (cw0Var != null) {
            cw0Var.T.remove(this);
        }
    }

    @Override
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        l lVar = this.h;
        lVar.invalidate();
        Runnable runnable = lVar.W0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void setBackgroundColor(int i10) {
        l lVar = this.h;
        lVar.f19590w = i10;
        if (!lVar.M0) {
            super.setBackgroundColor(i10);
        }
    }
}
