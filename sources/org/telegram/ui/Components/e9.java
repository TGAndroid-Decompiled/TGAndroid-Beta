package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class e9 extends View {
    public final d9 f34700a;
    public ug.a1 f34701b;
    public xy0 f34702c;
    public Paint d;

    public e9(Context context, boolean z10) {
        super(context);
        this.f34700a = new d9(this, z10);
    }

    public final void a(boolean z10) {
        this.f34700a.a(z10, true);
    }

    public final void b(int i7, int i10, TLObject tLObject) {
        this.f34700a.j(i7, i10, tLObject);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f34700a.e();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f34700a.f();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f34700a.g(canvas);
        if (this.f34702c != null) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(getWidth() - org.telegram.messenger.g0.L(22.0f), getHeight() - org.telegram.messenger.g0.L(22.0f), getWidth() - org.telegram.messenger.g0.L(0.0f), getHeight() - org.telegram.messenger.g0.L(0.0f));
            this.f34701b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + org.telegram.messenger.g0.L(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f34701b.f58647f);
            this.f34702c.c(rectF.centerX() - (this.f34702c.f42247c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int measuredWidth = getMeasuredWidth();
        d9 d9Var = this.f34700a;
        d9Var.f34437p = measuredWidth;
        d9Var.f34436o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i7) {
        this.f34700a.h(i7);
    }

    public void setCentered(boolean z10) {
        this.f34700a.f34433l = z10;
    }

    public void setCount(int i7) {
        this.f34700a.i(i7);
    }

    public void setDelegate(Runnable runnable) {
        this.f34700a.f34431j = runnable;
    }

    public void setSize(int i7) {
        this.f34700a.f34440s = i7;
    }

    public void setStepFactor(float f10) {
        this.f34700a.f34441t = f10;
    }

    public void setStyle(int i7) {
        d9 d9Var = this.f34700a;
        d9Var.f34432k = i7;
        d9Var.d();
    }
}
