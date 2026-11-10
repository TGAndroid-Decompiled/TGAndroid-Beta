package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class y8 extends View {
    public final x8 f40530a;
    public ug.y0 f40531b;
    public my0 f40532c;
    public Paint d;

    public y8(Context context, boolean z9) {
        super(context);
        this.f40530a = new x8(this, z9);
    }

    public final void a(boolean z9) {
        this.f40530a.a(z9, true);
    }

    public final void b(int i7, int i10, TLObject tLObject) {
        this.f40530a.j(i7, i10, tLObject);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40530a.e();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40530a.f();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f40530a.g(canvas);
        if (this.f40532c != null) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(getWidth() - org.telegram.messenger.g0.L(22.0f), getHeight() - org.telegram.messenger.g0.L(22.0f), getWidth() - org.telegram.messenger.g0.L(0.0f), getHeight() - org.telegram.messenger.g0.L(0.0f));
            this.f40531b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + org.telegram.messenger.g0.L(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f40531b.f56877f);
            this.f40532c.c(rectF.centerX() - (this.f40532c.f36133c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int measuredWidth = getMeasuredWidth();
        x8 x8Var = this.f40530a;
        x8Var.f40244p = measuredWidth;
        x8Var.f40243o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i7) {
        this.f40530a.h(i7);
    }

    public void setCentered(boolean z9) {
        this.f40530a.f40240l = z9;
    }

    public void setCount(int i7) {
        this.f40530a.i(i7);
    }

    public void setDelegate(Runnable runnable) {
        this.f40530a.f40238j = runnable;
    }

    public void setSize(int i7) {
        this.f40530a.f40247s = i7;
    }

    public void setStepFactor(float f10) {
        this.f40530a.f40248t = f10;
    }

    public void setStyle(int i7) {
        x8 x8Var = this.f40530a;
        x8Var.f40239k = i7;
        x8Var.d();
    }
}
