package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class z8 extends View {
    public final y8 f40861a;
    public ug.y0 f40862b;
    public ly0 f40863c;
    public Paint d;

    public z8(Context context, boolean z9) {
        super(context);
        this.f40861a = new y8(this, z9);
    }

    public final void a(boolean z9) {
        this.f40861a.a(z9, true);
    }

    public final void b(int i7, int i10, TLObject tLObject) {
        this.f40861a.j(i7, i10, tLObject);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40861a.e();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40861a.f();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f40861a.g(canvas);
        if (this.f40863c != null) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(getWidth() - org.telegram.messenger.g0.L(22.0f), getHeight() - org.telegram.messenger.g0.L(22.0f), getWidth() - org.telegram.messenger.g0.L(0.0f), getHeight() - org.telegram.messenger.g0.L(0.0f));
            this.f40862b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + org.telegram.messenger.g0.L(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f40862b.f56752f);
            this.f40863c.c(rectF.centerX() - (this.f40863c.f35777c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int measuredWidth = getMeasuredWidth();
        y8 y8Var = this.f40861a;
        y8Var.f40558p = measuredWidth;
        y8Var.f40557o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i7) {
        this.f40861a.h(i7);
    }

    public void setCentered(boolean z9) {
        this.f40861a.f40554l = z9;
    }

    public void setCount(int i7) {
        this.f40861a.i(i7);
    }

    public void setDelegate(Runnable runnable) {
        this.f40861a.f40552j = runnable;
    }

    public void setSize(int i7) {
        this.f40861a.f40561s = i7;
    }

    public void setStepFactor(float f10) {
        this.f40861a.f40562t = f10;
    }

    public void setStyle(int i7) {
        y8 y8Var = this.f40861a;
        y8Var.f40553k = i7;
        y8Var.d();
    }
}
