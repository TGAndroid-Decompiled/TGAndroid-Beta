package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class d9 extends View {
    public final c9 f34245a;
    public ug.a1 f34246b;
    public wy0 f34247c;
    public Paint d;

    public d9(Context context, boolean z10) {
        super(context);
        this.f34245a = new c9(this, z10);
    }

    public final void a(boolean z10) {
        this.f34245a.a(z10, true);
    }

    public final void b(int i7, int i10, TLObject tLObject) {
        this.f34245a.j(i7, i10, tLObject);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f34245a.e();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f34245a.f();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f34245a.g(canvas);
        if (this.f34247c != null) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(getWidth() - org.telegram.messenger.g0.L(22.0f), getHeight() - org.telegram.messenger.g0.L(22.0f), getWidth() - org.telegram.messenger.g0.L(0.0f), getHeight() - org.telegram.messenger.g0.L(0.0f));
            this.f34246b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + org.telegram.messenger.g0.L(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f34246b.f58727f);
            this.f34247c.c(rectF.centerX() - (this.f34247c.f41763c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int measuredWidth = getMeasuredWidth();
        c9 c9Var = this.f34245a;
        c9Var.f33962p = measuredWidth;
        c9Var.f33961o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i7) {
        this.f34245a.h(i7);
    }

    public void setCentered(boolean z10) {
        this.f34245a.f33958l = z10;
    }

    public void setCount(int i7) {
        this.f34245a.i(i7);
    }

    public void setDelegate(Runnable runnable) {
        this.f34245a.f33956j = runnable;
    }

    public void setSize(int i7) {
        this.f34245a.f33965s = i7;
    }

    public void setStepFactor(float f10) {
        this.f34245a.f33966t = f10;
    }

    public void setStyle(int i7) {
        c9 c9Var = this.f34245a;
        c9Var.f33957k = i7;
        c9Var.d();
    }
}
