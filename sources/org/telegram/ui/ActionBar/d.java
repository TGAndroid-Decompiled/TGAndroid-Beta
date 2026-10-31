package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.uu0;
public final class d extends y {
    public final l h;

    public d(l lVar, Context context, l lVar2) {
        super(context, lVar2);
        this.h = lVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        l lVar = this.h;
        Paint paint = lVar.M0;
        if (lVar.L0 && this.f21533a && lVar.f20520x != 0) {
            lVar.N0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            paint.setColor(lVar.f20520x);
            canvas2 = canvas;
            lVar.K0.H(canvas2, 0.0f, lVar.N0, paint, true);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        uu0 uu0Var = this.h.K0;
        if (uu0Var != null) {
            uu0Var.O.add(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        uu0 uu0Var = this.h.K0;
        if (uu0Var != null) {
            uu0Var.O.remove(this);
        }
    }

    @Override
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        l lVar = this.h;
        lVar.invalidate();
        Runnable runnable = lVar.f20476c1;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void setBackgroundColor(int i10) {
        l lVar = this.h;
        lVar.f20520x = i10;
        if (!lVar.L0) {
            super.setBackgroundColor(i10);
        }
    }
}
