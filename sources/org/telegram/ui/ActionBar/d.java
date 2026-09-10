package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.aw0;
public final class d extends z {
    public final l h;

    public d(l lVar, Context context, l lVar2) {
        super(context, lVar2);
        this.h = lVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        l lVar = this.h;
        Paint paint = lVar.L0;
        if (lVar.K0 && this.f18792a && lVar.f18406w != 0) {
            lVar.M0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            paint.setColor(lVar.f18406w);
            canvas2 = canvas;
            lVar.J0.J(canvas2, 0.0f, lVar.M0, paint, true);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        aw0 aw0Var = this.h.J0;
        if (aw0Var != null) {
            aw0Var.T.add(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        aw0 aw0Var = this.h.J0;
        if (aw0Var != null) {
            aw0Var.T.remove(this);
        }
    }

    @Override
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        l lVar = this.h;
        lVar.invalidate();
        Runnable runnable = lVar.T0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void setBackgroundColor(int i10) {
        l lVar = this.h;
        lVar.f18406w = i10;
        if (!lVar.K0) {
            super.setBackgroundColor(i10);
        }
    }
}
