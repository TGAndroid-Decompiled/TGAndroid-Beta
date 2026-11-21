package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class e9 extends View {
    public final d9 f34702a;
    public ug.a1 f34703b;
    public xy0 f34704c;
    public Paint d;

    public e9(Context context, boolean z10) {
        super(context);
        this.f34702a = new d9(this, z10);
    }

    public final void a(boolean z10) {
        this.f34702a.a(z10, true);
    }

    public final void b(int i7, int i10, TLObject tLObject) {
        this.f34702a.j(i7, i10, tLObject);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f34702a.e();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f34702a.f();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f34702a.g(canvas);
        if (this.f34704c != null) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(getWidth() - org.telegram.messenger.g0.L(22.0f), getHeight() - org.telegram.messenger.g0.L(22.0f), getWidth() - org.telegram.messenger.g0.L(0.0f), getHeight() - org.telegram.messenger.g0.L(0.0f));
            this.f34703b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + org.telegram.messenger.g0.L(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f34703b.f58643f);
            this.f34704c.c(rectF.centerX() - (this.f34704c.f42254c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int measuredWidth = getMeasuredWidth();
        d9 d9Var = this.f34702a;
        d9Var.f34442p = measuredWidth;
        d9Var.f34441o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i7) {
        this.f34702a.h(i7);
    }

    public void setCentered(boolean z10) {
        this.f34702a.f34438l = z10;
    }

    public void setCount(int i7) {
        this.f34702a.i(i7);
    }

    public void setDelegate(Runnable runnable) {
        this.f34702a.f34436j = runnable;
    }

    public void setSize(int i7) {
        this.f34702a.f34445s = i7;
    }

    public void setStepFactor(float f10) {
        this.f34702a.f34446t = f10;
    }

    public void setStyle(int i7) {
        d9 d9Var = this.f34702a;
        d9Var.f34437k = i7;
        d9Var.d();
    }
}
