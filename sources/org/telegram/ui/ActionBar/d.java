package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.qv0;
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
        if (kVar.H0 && this.f22472a && kVar.f21565w != 0) {
            kVar.J0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            paint.setColor(kVar.f21565w);
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
        qv0 qv0Var = this.h.G0;
        if (qv0Var != null) {
            qv0Var.Q.add(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qv0 qv0Var = this.h.G0;
        if (qv0Var != null) {
            qv0Var.Q.remove(this);
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
        kVar.f21565w = i10;
        if (!kVar.H0) {
            super.setBackgroundColor(i10);
        }
    }
}
