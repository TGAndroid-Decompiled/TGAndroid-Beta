package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.pv0;
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
        Paint paint = kVar.I0;
        if (kVar.H0 && this.f22474a && kVar.f21567w != 0) {
            kVar.J0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            paint.setColor(kVar.f21567w);
            canvas2 = canvas;
            kVar.G0.J(canvas2, 0.0f, kVar.J0, paint, true);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        pv0 pv0Var = this.h.G0;
        if (pv0Var != null) {
            pv0Var.Q.add(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        pv0 pv0Var = this.h.G0;
        if (pv0Var != null) {
            pv0Var.Q.remove(this);
        }
    }

    @Override
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        k kVar = this.h;
        kVar.invalidate();
        Runnable runnable = kVar.Q0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void setBackgroundColor(int i10) {
        k kVar = this.h;
        kVar.f21567w = i10;
        if (!kVar.H0) {
            super.setBackgroundColor(i10);
        }
    }
}
