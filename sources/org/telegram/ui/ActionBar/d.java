package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.rt0;
public final class d extends y {
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
        if (kVar.L0 && this.f28754a && kVar.f27698x != 0) {
            kVar.N0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            paint.setColor(kVar.f27698x);
            canvas2 = canvas;
            kVar.K0.H(canvas2, 0.0f, kVar.N0, paint, true);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rt0 rt0Var = this.h.K0;
        if (rt0Var != null) {
            rt0Var.O.add(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        rt0 rt0Var = this.h.K0;
        if (rt0Var != null) {
            rt0Var.O.remove(this);
        }
    }

    @Override
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        k kVar = this.h;
        kVar.invalidate();
        Runnable runnable = kVar.f27656d1;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void setBackgroundColor(int i7) {
        k kVar = this.h;
        kVar.f27698x = i7;
        if (!kVar.L0) {
            super.setBackgroundColor(i7);
        }
    }
}
