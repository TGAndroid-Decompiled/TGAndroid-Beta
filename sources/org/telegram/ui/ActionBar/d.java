package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.aw0;
public final class d extends z {
    public final k h;

    public d(k kVar, Context context, k kVar2) {
        super(context, kVar2);
        this.h = kVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        k kVar = this.h;
        Paint paint = kVar.M0;
        if (kVar.L0 && this.f19954a && kVar.f19555w != 0) {
            kVar.N0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            paint.setColor(kVar.f19555w);
            canvas2 = canvas;
            kVar.K0.J(canvas2, 0.0f, kVar.N0, paint, true);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        aw0 aw0Var = this.h.K0;
        if (aw0Var != null) {
            aw0Var.T.add(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        aw0 aw0Var = this.h.K0;
        if (aw0Var != null) {
            aw0Var.T.remove(this);
        }
    }

    @Override
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        k kVar = this.h;
        kVar.invalidate();
        Runnable runnable = kVar.U0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void setBackgroundColor(int i10) {
        k kVar = this.h;
        kVar.f19555w = i10;
        if (!kVar.L0) {
            super.setBackgroundColor(i10);
        }
    }
}
