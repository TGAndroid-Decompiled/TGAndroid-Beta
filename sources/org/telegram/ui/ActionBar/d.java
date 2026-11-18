package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.au0;
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
        Paint paint = kVar.N0;
        if (kVar.M0 && this.f30298a && kVar.f29109x != 0) {
            kVar.O0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            paint.setColor(kVar.f29109x);
            canvas2 = canvas;
            kVar.L0.H(canvas2, 0.0f, kVar.O0, paint, true);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        au0 au0Var = this.h.L0;
        if (au0Var != null) {
            au0Var.P.add(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        au0 au0Var = this.h.L0;
        if (au0Var != null) {
            au0Var.P.remove(this);
        }
    }

    @Override
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        k kVar = this.h;
        kVar.invalidate();
        Runnable runnable = kVar.f29070e1;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void setBackgroundColor(int i7) {
        k kVar = this.h;
        kVar.f29109x = i7;
        if (!kVar.M0) {
            super.setBackgroundColor(i7);
        }
    }
}
