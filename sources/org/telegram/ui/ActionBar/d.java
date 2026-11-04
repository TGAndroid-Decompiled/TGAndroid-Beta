package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.qt0;
public final class d extends x {
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
        if (kVar.M0 && this.f28785a && kVar.f27749x != 0) {
            kVar.O0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            paint.setColor(kVar.f27749x);
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
        qt0 qt0Var = this.h.L0;
        if (qt0Var != null) {
            qt0Var.P.add(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qt0 qt0Var = this.h.L0;
        if (qt0Var != null) {
            qt0Var.P.remove(this);
        }
    }

    @Override
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        k kVar = this.h;
        kVar.invalidate();
        Runnable runnable = kVar.f27710e1;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void setBackgroundColor(int i3) {
        k kVar = this.h;
        kVar.f27749x = i3;
        if (!kVar.M0) {
            super.setBackgroundColor(i3);
        }
    }
}
