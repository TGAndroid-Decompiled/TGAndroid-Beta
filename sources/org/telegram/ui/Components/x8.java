package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class x8 extends View {
    public final w8 f40266a;
    public vg.x0 f40267b;
    public ly0 f40268c;
    public Paint d;

    public x8(Context context, boolean z10) {
        super(context);
        this.f40266a = new w8(this, z10);
    }

    public final void a(boolean z10) {
        this.f40266a.a(z10, true);
    }

    public final void b(int i3, int i10, TLObject tLObject) {
        this.f40266a.j(i3, i10, tLObject);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40266a.e();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40266a.f();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f40266a.g(canvas);
        if (this.f40268c != null) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(getWidth() - org.telegram.messenger.g0.L(22.0f), getHeight() - org.telegram.messenger.g0.L(22.0f), getWidth() - org.telegram.messenger.g0.L(0.0f), getHeight() - org.telegram.messenger.g0.L(0.0f));
            this.f40267b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + org.telegram.messenger.g0.L(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f40267b.f56911f);
            this.f40268c.c(rectF.centerX() - (this.f40268c.f35918c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        int measuredWidth = getMeasuredWidth();
        w8 w8Var = this.f40266a;
        w8Var.f39960p = measuredWidth;
        w8Var.f39959o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i3) {
        this.f40266a.h(i3);
    }

    public void setCentered(boolean z10) {
        this.f40266a.f39956l = z10;
    }

    public void setCount(int i3) {
        this.f40266a.i(i3);
    }

    public void setDelegate(Runnable runnable) {
        this.f40266a.f39954j = runnable;
    }

    public void setSize(int i3) {
        this.f40266a.f39963s = i3;
    }

    public void setStepFactor(float f10) {
        this.f40266a.f39964t = f10;
    }

    public void setStyle(int i3) {
        w8 w8Var = this.f40266a;
        w8Var.f39955k = i3;
        w8Var.d();
    }
}
