package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class u8 extends View {
    public final t8 f30897a;
    public kg.k1 f30898b;
    public rz0 f30899c;
    public Paint d;

    public u8(Context context, boolean z10) {
        super(context);
        this.f30897a = new t8(this, z10);
    }

    public final void a(boolean z10) {
        this.f30897a.a(z10, true);
    }

    public final void b(int i10, int i11, TLObject tLObject) {
        this.f30897a.j(i10, i11, tLObject);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30897a.e();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30897a.f();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f30897a.g(canvas);
        if (this.f30899c != null) {
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(getWidth() - org.telegram.messenger.i0.L(22.0f), getHeight() - org.telegram.messenger.i0.L(22.0f), getWidth() - org.telegram.messenger.i0.L(0.0f), getHeight() - org.telegram.messenger.i0.L(0.0f));
            this.f30898b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + org.telegram.messenger.i0.L(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f30898b.f11143f);
            this.f30899c.c(rectF.centerX() - (this.f30899c.f30126c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        t8 t8Var = this.f30897a;
        t8Var.f30563p = measuredWidth;
        t8Var.f30562o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i10) {
        this.f30897a.h(i10);
    }

    public void setCentered(boolean z10) {
        this.f30897a.f30559l = z10;
    }

    public void setCount(int i10) {
        this.f30897a.i(i10);
    }

    public void setDelegate(Runnable runnable) {
        this.f30897a.f30557j = runnable;
    }

    public void setSize(int i10) {
        this.f30897a.f30566s = i10;
    }

    public void setStepFactor(float f7) {
        this.f30897a.f30567t = f7;
    }

    public void setStyle(int i10) {
        t8 t8Var = this.f30897a;
        t8Var.f30558k = i10;
        t8Var.d();
    }
}
