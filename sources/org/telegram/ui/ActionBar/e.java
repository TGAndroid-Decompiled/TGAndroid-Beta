package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.st0;
public final class e extends y {
    public final l h;

    public e(l lVar, Context context, l lVar2) {
        super(context, lVar2);
        this.h = lVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        l lVar = this.h;
        Paint paint = lVar.M0;
        if (lVar.L0 && this.f28770a && lVar.f27713x != 0) {
            lVar.N0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            paint.setColor(lVar.f27713x);
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
        st0 st0Var = this.h.K0;
        if (st0Var != null) {
            st0Var.O.add(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        st0 st0Var = this.h.K0;
        if (st0Var != null) {
            st0Var.O.remove(this);
        }
    }

    @Override
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        l lVar = this.h;
        lVar.invalidate();
        Runnable runnable = lVar.f27671d1;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void setBackgroundColor(int i7) {
        l lVar = this.h;
        lVar.f27713x = i7;
        if (!lVar.L0) {
            super.setBackgroundColor(i7);
        }
    }
}
