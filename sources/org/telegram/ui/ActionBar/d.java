package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.ov0;
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
        Paint paint = kVar.L0;
        if (kVar.K0 && this.f21545a && kVar.f21120w != 0) {
            kVar.M0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            paint.setColor(kVar.f21120w);
            canvas2 = canvas;
            kVar.J0.J(canvas2, 0.0f, kVar.M0, paint, true);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ov0 ov0Var = this.h.J0;
        if (ov0Var != null) {
            ov0Var.T.add(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ov0 ov0Var = this.h.J0;
        if (ov0Var != null) {
            ov0Var.T.remove(this);
        }
    }

    @Override
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        k kVar = this.h;
        kVar.invalidate();
        Runnable runnable = kVar.T0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void setBackgroundColor(int i10) {
        k kVar = this.h;
        kVar.f21120w = i10;
        if (!kVar.K0) {
            super.setBackgroundColor(i10);
        }
    }
}
