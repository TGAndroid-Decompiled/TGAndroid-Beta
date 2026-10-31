package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class u8 extends View {
    public final t8 f30863a;
    public kg.k1 f30864b;
    public qz0 f30865c;
    public Paint d;

    public u8(Context context, boolean z10) {
        super(context);
        this.f30863a = new t8(this, z10);
    }

    public final void a(boolean z10) {
        this.f30863a.a(z10, true);
    }

    public final void b(int i10, int i11, TLObject tLObject) {
        this.f30863a.j(i10, i11, tLObject);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30863a.e();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30863a.f();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f30863a.g(canvas);
        if (this.f30865c != null) {
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(getWidth() - org.telegram.messenger.i0.L(22.0f), getHeight() - org.telegram.messenger.i0.L(22.0f), getWidth() - org.telegram.messenger.i0.L(0.0f), getHeight() - org.telegram.messenger.i0.L(0.0f));
            this.f30864b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + org.telegram.messenger.i0.L(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f30864b.f11142f);
            this.f30865c.c(rectF.centerX() - (this.f30865c.f29774c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        t8 t8Var = this.f30863a;
        t8Var.f30491p = measuredWidth;
        t8Var.f30490o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i10) {
        this.f30863a.h(i10);
    }

    public void setCentered(boolean z10) {
        this.f30863a.f30487l = z10;
    }

    public void setCount(int i10) {
        this.f30863a.i(i10);
    }

    public void setDelegate(Runnable runnable) {
        this.f30863a.f30485j = runnable;
    }

    public void setSize(int i10) {
        this.f30863a.f30494s = i10;
    }

    public void setStepFactor(float f7) {
        this.f30863a.f30495t = f7;
    }

    public void setStyle(int i10) {
        t8 t8Var = this.f30863a;
        t8Var.f30486k = i10;
        t8Var.d();
    }
}
