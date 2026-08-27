package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.zu0;

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
        Paint paint = kVar.H0;
        if (kVar.G0 && this.f23983a && kVar.f23598w != 0) {
            kVar.I0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            paint.setColor(kVar.f23598w);
            canvas2 = canvas;
            kVar.F0.J(canvas2, 0.0f, kVar.I0, paint, true);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zu0 zu0Var = this.h.F0;
        if (zu0Var != null) {
            zu0Var.P.add(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zu0 zu0Var = this.h.F0;
        if (zu0Var != null) {
            zu0Var.P.remove(this);
        }
    }

    @Override
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        k kVar = this.h;
        kVar.invalidate();
        Runnable runnable = kVar.P0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void setBackgroundColor(int i10) {
        k kVar = this.h;
        kVar.f23598w = i10;
        if (kVar.G0) {
            return;
        }
        super.setBackgroundColor(i10);
    }
}
