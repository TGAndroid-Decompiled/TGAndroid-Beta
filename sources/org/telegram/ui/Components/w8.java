package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class w8 extends View {
    public final v8 f41314a;
    public ug.z0 f41315b;
    public oy0 f41316c;
    public Paint d;

    public w8(Context context, boolean z10) {
        super(context);
        this.f41314a = new v8(this, z10);
    }

    public final void a(boolean z10) {
        this.f41314a.a(z10, true);
    }

    public final void b(int i7, int i10, TLObject tLObject) {
        this.f41314a.j(i7, i10, tLObject);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41314a.e();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41314a.f();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f41314a.g(canvas);
        if (this.f41316c != null) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(getWidth() - org.telegram.messenger.g0.L(22.0f), getHeight() - org.telegram.messenger.g0.L(22.0f), getWidth() - org.telegram.messenger.g0.L(0.0f), getHeight() - org.telegram.messenger.g0.L(0.0f));
            this.f41315b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + org.telegram.messenger.g0.L(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f41315b.f58392f);
            this.f41316c.c(rectF.centerX() - (this.f41316c.f38103c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int measuredWidth = getMeasuredWidth();
        v8 v8Var = this.f41314a;
        v8Var.f40336p = measuredWidth;
        v8Var.f40335o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i7) {
        this.f41314a.h(i7);
    }

    public void setCentered(boolean z10) {
        this.f41314a.f40332l = z10;
    }

    public void setCount(int i7) {
        this.f41314a.i(i7);
    }

    public void setDelegate(Runnable runnable) {
        this.f41314a.f40330j = runnable;
    }

    public void setSize(int i7) {
        this.f41314a.f40339s = i7;
    }

    public void setStepFactor(float f10) {
        this.f41314a.f40340t = f10;
    }

    public void setStyle(int i7) {
        v8 v8Var = this.f41314a;
        v8Var.f40331k = i7;
        v8Var.d();
    }
}
