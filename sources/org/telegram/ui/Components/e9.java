package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class e9 extends View {
    public final d9 f34690a;
    public ug.a1 f34691b;
    public xy0 f34692c;
    public Paint d;

    public e9(Context context, boolean z10) {
        super(context);
        this.f34690a = new d9(this, z10);
    }

    public final void a(boolean z10) {
        this.f34690a.a(z10, true);
    }

    public final void b(int i7, int i10, TLObject tLObject) {
        this.f34690a.j(i7, i10, tLObject);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f34690a.e();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f34690a.f();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f34690a.g(canvas);
        if (this.f34692c != null) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(getWidth() - org.telegram.messenger.g0.L(22.0f), getHeight() - org.telegram.messenger.g0.L(22.0f), getWidth() - org.telegram.messenger.g0.L(0.0f), getHeight() - org.telegram.messenger.g0.L(0.0f));
            this.f34691b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + org.telegram.messenger.g0.L(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f34691b.f58612f);
            this.f34692c.c(rectF.centerX() - (this.f34692c.f42224c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int measuredWidth = getMeasuredWidth();
        d9 d9Var = this.f34690a;
        d9Var.f34400p = measuredWidth;
        d9Var.f34399o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i7) {
        this.f34690a.h(i7);
    }

    public void setCentered(boolean z10) {
        this.f34690a.f34396l = z10;
    }

    public void setCount(int i7) {
        this.f34690a.i(i7);
    }

    public void setDelegate(Runnable runnable) {
        this.f34690a.f34394j = runnable;
    }

    public void setSize(int i7) {
        this.f34690a.f34403s = i7;
    }

    public void setStepFactor(float f10) {
        this.f34690a.f34404t = f10;
    }

    public void setStyle(int i7) {
        d9 d9Var = this.f34690a;
        d9Var.f34395k = i7;
        d9Var.d();
    }
}
