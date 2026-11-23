package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.du0;
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
        Paint paint = kVar.N0;
        if (kVar.M0 && this.f30248a && kVar.f29137x != 0) {
            kVar.O0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            paint.setColor(kVar.f29137x);
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
        du0 du0Var = this.h.L0;
        if (du0Var != null) {
            du0Var.P.add(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        du0 du0Var = this.h.L0;
        if (du0Var != null) {
            du0Var.P.remove(this);
        }
    }

    @Override
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        k kVar = this.h;
        kVar.invalidate();
        Runnable runnable = kVar.f29098e1;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void setBackgroundColor(int i7) {
        k kVar = this.h;
        kVar.f29137x = i7;
        if (!kVar.M0) {
            super.setBackgroundColor(i7);
        }
    }
}
