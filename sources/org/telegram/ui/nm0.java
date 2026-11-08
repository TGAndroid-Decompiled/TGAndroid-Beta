package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.widget.FrameLayout;
public final class nm0 extends FrameLayout {
    public int D;
    public int E;
    public int F;
    public boolean G;
    public final pm0 H;
    public final Paint f48080a;
    public final Paint f48081b;
    public final Paint f48082c;
    public float d;
    public float f48083e;
    public float f48084f;
    public float h;
    public int f48085n;
    public float f48086r;
    public float f48087s;
    public int f48088w;
    public int f48089x;
    public int f48090y;

    public nm0(pm0 pm0Var, Context context) {
        super(context);
        this.H = pm0Var;
        this.f48080a = null;
        this.f48081b = null;
        this.f48082c = null;
        this.d = 600.0f;
        this.f48083e = 600.0f;
        this.f48084f = -1.0f;
        this.h = -1.0f;
        this.f48085n = 0;
        this.f48086r = 0.0f;
        this.f48087s = 0.0f;
        Paint paint = new Paint();
        this.f48080a = paint;
        paint.setColor(1073412858);
        this.f48080a.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        this.f48080a.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.f48081b = paint2;
        paint2.setColor(-1);
        Paint paint3 = new Paint();
        this.f48082c = paint3;
        paint3.setColor(-939524096);
        setBackgroundColor(-13421773);
        setOnTouchListener(new d0(this, 4));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        int i10;
        pm0 pm0Var = this.H;
        BitmapDrawable bitmapDrawable = pm0Var.f48855b;
        if (bitmapDrawable != null) {
            try {
                int i11 = this.f48090y;
                int i12 = this.D;
                bitmapDrawable.setBounds(i11, i12, this.f48088w + i11, this.f48089x + i12);
                pm0Var.f48855b.draw(canvas);
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        canvas.drawRect(this.f48090y, this.D, i7 + this.f48088w, this.h, this.f48082c);
        float f10 = this.h;
        canvas.drawRect(this.f48090y, f10, this.f48084f, f10 + this.f48083e, this.f48082c);
        float f11 = this.h;
        canvas.drawRect(this.f48084f + this.d, f11, this.f48090y + this.f48088w, f11 + this.f48083e, this.f48082c);
        canvas.drawRect(this.f48090y, this.h + this.f48083e, i10 + this.f48088w, this.D + this.f48089x, this.f48082c);
        float f12 = this.f48084f;
        float f13 = this.h;
        canvas.drawRect(f12, f13, f12 + this.d, f13 + this.f48083e, this.f48080a);
        int L = org.telegram.messenger.g0.L(1.0f);
        float f14 = L;
        float f15 = this.f48084f + f14;
        float f16 = L * 3;
        canvas.drawRect(f15, this.h + f14, f15 + org.telegram.messenger.g0.L(20.0f), this.h + f16, this.f48081b);
        float f17 = this.f48084f;
        float f18 = this.h + f14;
        canvas.drawRect(f17 + f14, f18, f17 + f16, f18 + org.telegram.messenger.g0.L(20.0f), this.f48081b);
        float L2 = ((this.f48084f + this.d) - f14) - org.telegram.messenger.g0.L(20.0f);
        float f19 = this.h;
        canvas.drawRect(L2, f19 + f14, (this.f48084f + this.d) - f14, f19 + f16, this.f48081b);
        float f20 = this.f48084f + this.d;
        float f21 = this.h + f14;
        canvas.drawRect(f20 - f16, f21, f20 - f14, f21 + org.telegram.messenger.g0.L(20.0f), this.f48081b);
        canvas.drawRect(this.f48084f + f14, ((this.h + this.f48083e) - f14) - org.telegram.messenger.g0.L(20.0f), this.f48084f + f16, (this.h + this.f48083e) - f14, this.f48081b);
        float f22 = this.f48084f + f14;
        canvas.drawRect(f22, (this.h + this.f48083e) - f16, f22 + org.telegram.messenger.g0.L(20.0f), (this.h + this.f48083e) - f14, this.f48081b);
        float L3 = ((this.f48084f + this.d) - f14) - org.telegram.messenger.g0.L(20.0f);
        float f23 = this.h + this.f48083e;
        canvas.drawRect(L3, f23 - f16, (this.f48084f + this.d) - f14, f23 - f14, this.f48081b);
        canvas.drawRect((this.f48084f + this.d) - f16, ((this.h + this.f48083e) - f14) - org.telegram.messenger.g0.L(20.0f), (this.f48084f + this.d) - f14, (this.h + this.f48083e) - f14, this.f48081b);
        for (int i13 = 1; i13 < 3; i13++) {
            float f24 = this.f48084f;
            float f25 = i13;
            float f26 = (this.d / 3.0f) * f25;
            float f27 = this.h;
            canvas.drawRect(f26 + f24, f27 + f14, f24 + f14 + f26, (f27 + this.f48083e) - f14, this.f48081b);
            float f28 = this.f48084f;
            float c10 = com.google.android.recaptcha.internal.a.c(this.f48083e, 3.0f, f25, this.h);
            canvas.drawRect(f28 + f14, c10, (f28 - f14) + this.d, c10 + f14, this.f48081b);
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        pm0 pm0Var;
        Bitmap bitmap;
        float f10;
        int i13;
        int i14;
        super.onLayout(z9, i7, i10, i11, i12);
        this.E = (i11 - i7) - org.telegram.messenger.g0.L(28.0f);
        int L = (i12 - i10) - org.telegram.messenger.g0.L(28.0f);
        this.F = L;
        if (this.E != 0 && L != 0 && (bitmap = (pm0Var = this.H).f48854a) != null) {
            float f11 = this.f48084f - this.f48090y;
            float f12 = this.f48088w;
            float f13 = f11 / f12;
            float f14 = this.h - this.D;
            float f15 = this.f48089x;
            float f16 = f14 / f15;
            float f17 = this.d / f12;
            float f18 = this.f48083e / f15;
            float width = bitmap.getWidth();
            float height = pm0Var.f48854a.getHeight();
            int i15 = this.E;
            float f19 = i15 / width;
            int i16 = this.F;
            if (f19 > i16 / height) {
                this.f48089x = i16;
                this.f48088w = (int) Math.ceil(width * f10);
            } else {
                this.f48088w = i15;
                this.f48089x = (int) Math.ceil(height * f19);
            }
            this.f48090y = org.telegram.messenger.g0.L(14.0f) + ((this.E - this.f48088w) / 2);
            int L2 = org.telegram.messenger.g0.L(14.0f) + ((this.F - this.f48089x) / 2);
            this.D = L2;
            if (this.f48084f == -1.0f && this.h == -1.0f) {
                if (this.G) {
                    this.h = L2;
                    this.f48084f = this.f48090y;
                    this.d = this.f48088w;
                    this.f48083e = this.f48089x;
                } else {
                    if (this.f48088w > this.f48089x) {
                        this.h = L2;
                        this.f48084f = org.telegram.messenger.g0.L(14.0f) + ((this.E - i14) / 2);
                        float f20 = this.f48089x;
                        this.d = f20;
                        this.f48083e = f20;
                    } else {
                        this.f48084f = this.f48090y;
                        this.h = org.telegram.messenger.g0.L(14.0f) + ((this.F - i13) / 2);
                        float f21 = this.f48088w;
                        this.d = f21;
                        this.f48083e = f21;
                    }
                }
            } else {
                float f22 = this.f48088w;
                this.f48084f = (f13 * f22) + this.f48090y;
                float f23 = this.f48089x;
                this.h = (f16 * f23) + L2;
                this.d = f17 * f22;
                this.f48083e = f18 * f23;
            }
            invalidate();
        }
    }
}
