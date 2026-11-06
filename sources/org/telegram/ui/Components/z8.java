package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class z8 extends View {
    public final y8 f40906a;
    public ug.y0 f40907b;
    public my0 f40908c;
    public Paint d;

    public z8(Context context, boolean z9) {
        super(context);
        this.f40906a = new y8(this, z9);
    }

    public final void a(boolean z9) {
        this.f40906a.a(z9, true);
    }

    public final void b(int i7, int i10, TLObject tLObject) {
        this.f40906a.j(i7, i10, tLObject);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40906a.e();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40906a.f();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f40906a.g(canvas);
        if (this.f40908c != null) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(getWidth() - org.telegram.messenger.g0.L(22.0f), getHeight() - org.telegram.messenger.g0.L(22.0f), getWidth() - org.telegram.messenger.g0.L(0.0f), getHeight() - org.telegram.messenger.g0.L(0.0f));
            this.f40907b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + org.telegram.messenger.g0.L(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f40907b.f56776f);
            this.f40908c.c(rectF.centerX() - (this.f40908c.f36125c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int measuredWidth = getMeasuredWidth();
        y8 y8Var = this.f40906a;
        y8Var.f40589p = measuredWidth;
        y8Var.f40588o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i7) {
        this.f40906a.h(i7);
    }

    public void setCentered(boolean z9) {
        this.f40906a.f40585l = z9;
    }

    public void setCount(int i7) {
        this.f40906a.i(i7);
    }

    public void setDelegate(Runnable runnable) {
        this.f40906a.f40583j = runnable;
    }

    public void setSize(int i7) {
        this.f40906a.f40592s = i7;
    }

    public void setStepFactor(float f10) {
        this.f40906a.f40593t = f10;
    }

    public void setStyle(int i7) {
        y8 y8Var = this.f40906a;
        y8Var.f40584k = i7;
        y8Var.d();
    }
}
