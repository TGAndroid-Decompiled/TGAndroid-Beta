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
    public final Paint f48081a;
    public final Paint f48082b;
    public final Paint f48083c;
    public float d;
    public float f48084e;
    public float f48085f;
    public float h;
    public int f48086n;
    public float f48087r;
    public float f48088s;
    public int f48089w;
    public int f48090x;
    public int f48091y;

    public nm0(pm0 pm0Var, Context context) {
        super(context);
        this.H = pm0Var;
        this.f48081a = null;
        this.f48082b = null;
        this.f48083c = null;
        this.d = 600.0f;
        this.f48084e = 600.0f;
        this.f48085f = -1.0f;
        this.h = -1.0f;
        this.f48086n = 0;
        this.f48087r = 0.0f;
        this.f48088s = 0.0f;
        Paint paint = new Paint();
        this.f48081a = paint;
        paint.setColor(1073412858);
        this.f48081a.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        this.f48081a.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.f48082b = paint2;
        paint2.setColor(-1);
        Paint paint3 = new Paint();
        this.f48083c = paint3;
        paint3.setColor(-939524096);
        setBackgroundColor(-13421773);
        setOnTouchListener(new d0(this, 4));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        int i10;
        pm0 pm0Var = this.H;
        BitmapDrawable bitmapDrawable = pm0Var.f48853b;
        if (bitmapDrawable != null) {
            try {
                int i11 = this.f48091y;
                int i12 = this.D;
                bitmapDrawable.setBounds(i11, i12, this.f48089w + i11, this.f48090x + i12);
                pm0Var.f48853b.draw(canvas);
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        canvas.drawRect(this.f48091y, this.D, i7 + this.f48089w, this.h, this.f48083c);
        float f10 = this.h;
        canvas.drawRect(this.f48091y, f10, this.f48085f, f10 + this.f48084e, this.f48083c);
        float f11 = this.h;
        canvas.drawRect(this.f48085f + this.d, f11, this.f48091y + this.f48089w, f11 + this.f48084e, this.f48083c);
        canvas.drawRect(this.f48091y, this.h + this.f48084e, i10 + this.f48089w, this.D + this.f48090x, this.f48083c);
        float f12 = this.f48085f;
        float f13 = this.h;
        canvas.drawRect(f12, f13, f12 + this.d, f13 + this.f48084e, this.f48081a);
        int L = org.telegram.messenger.g0.L(1.0f);
        float f14 = L;
        float f15 = this.f48085f + f14;
        float f16 = L * 3;
        canvas.drawRect(f15, this.h + f14, f15 + org.telegram.messenger.g0.L(20.0f), this.h + f16, this.f48082b);
        float f17 = this.f48085f;
        float f18 = this.h + f14;
        canvas.drawRect(f17 + f14, f18, f17 + f16, f18 + org.telegram.messenger.g0.L(20.0f), this.f48082b);
        float L2 = ((this.f48085f + this.d) - f14) - org.telegram.messenger.g0.L(20.0f);
        float f19 = this.h;
        canvas.drawRect(L2, f19 + f14, (this.f48085f + this.d) - f14, f19 + f16, this.f48082b);
        float f20 = this.f48085f + this.d;
        float f21 = this.h + f14;
        canvas.drawRect(f20 - f16, f21, f20 - f14, f21 + org.telegram.messenger.g0.L(20.0f), this.f48082b);
        canvas.drawRect(this.f48085f + f14, ((this.h + this.f48084e) - f14) - org.telegram.messenger.g0.L(20.0f), this.f48085f + f16, (this.h + this.f48084e) - f14, this.f48082b);
        float f22 = this.f48085f + f14;
        canvas.drawRect(f22, (this.h + this.f48084e) - f16, f22 + org.telegram.messenger.g0.L(20.0f), (this.h + this.f48084e) - f14, this.f48082b);
        float L3 = ((this.f48085f + this.d) - f14) - org.telegram.messenger.g0.L(20.0f);
        float f23 = this.h + this.f48084e;
        canvas.drawRect(L3, f23 - f16, (this.f48085f + this.d) - f14, f23 - f14, this.f48082b);
        canvas.drawRect((this.f48085f + this.d) - f16, ((this.h + this.f48084e) - f14) - org.telegram.messenger.g0.L(20.0f), (this.f48085f + this.d) - f14, (this.h + this.f48084e) - f14, this.f48082b);
        for (int i13 = 1; i13 < 3; i13++) {
            float f24 = this.f48085f;
            float f25 = i13;
            float f26 = (this.d / 3.0f) * f25;
            float f27 = this.h;
            canvas.drawRect(f26 + f24, f27 + f14, f24 + f14 + f26, (f27 + this.f48084e) - f14, this.f48082b);
            float f28 = this.f48085f;
            float c10 = com.google.android.recaptcha.internal.a.c(this.f48084e, 3.0f, f25, this.h);
            canvas.drawRect(f28 + f14, c10, (f28 - f14) + this.d, c10 + f14, this.f48082b);
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
        if (this.E != 0 && L != 0 && (bitmap = (pm0Var = this.H).f48852a) != null) {
            float f11 = this.f48085f - this.f48091y;
            float f12 = this.f48089w;
            float f13 = f11 / f12;
            float f14 = this.h - this.D;
            float f15 = this.f48090x;
            float f16 = f14 / f15;
            float f17 = this.d / f12;
            float f18 = this.f48084e / f15;
            float width = bitmap.getWidth();
            float height = pm0Var.f48852a.getHeight();
            int i15 = this.E;
            float f19 = i15 / width;
            int i16 = this.F;
            if (f19 > i16 / height) {
                this.f48090x = i16;
                this.f48089w = (int) Math.ceil(width * f10);
            } else {
                this.f48089w = i15;
                this.f48090x = (int) Math.ceil(height * f19);
            }
            this.f48091y = org.telegram.messenger.g0.L(14.0f) + ((this.E - this.f48089w) / 2);
            int L2 = org.telegram.messenger.g0.L(14.0f) + ((this.F - this.f48090x) / 2);
            this.D = L2;
            if (this.f48085f == -1.0f && this.h == -1.0f) {
                if (this.G) {
                    this.h = L2;
                    this.f48085f = this.f48091y;
                    this.d = this.f48089w;
                    this.f48084e = this.f48090x;
                } else {
                    if (this.f48089w > this.f48090x) {
                        this.h = L2;
                        this.f48085f = org.telegram.messenger.g0.L(14.0f) + ((this.E - i14) / 2);
                        float f20 = this.f48090x;
                        this.d = f20;
                        this.f48084e = f20;
                    } else {
                        this.f48085f = this.f48091y;
                        this.h = org.telegram.messenger.g0.L(14.0f) + ((this.F - i13) / 2);
                        float f21 = this.f48089w;
                        this.d = f21;
                        this.f48084e = f21;
                    }
                }
            } else {
                float f22 = this.f48089w;
                this.f48085f = (f13 * f22) + this.f48091y;
                float f23 = this.f48090x;
                this.h = (f16 * f23) + L2;
                this.d = f17 * f22;
                this.f48084e = f18 * f23;
            }
            invalidate();
        }
    }
}
