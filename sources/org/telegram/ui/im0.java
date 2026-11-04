package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.widget.FrameLayout;
public final class im0 extends FrameLayout {
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final km0 I;
    public final Paint f46303a;
    public final Paint f46304b;
    public final Paint f46305c;
    public float d;
    public float f46306e;
    public float f46307f;
    public float h;
    public int f46308n;
    public float f46309r;
    public float f46310s;
    public int f46311w;
    public int f46312x;
    public int f46313y;

    public im0(km0 km0Var, Context context) {
        super(context);
        this.I = km0Var;
        this.f46303a = null;
        this.f46304b = null;
        this.f46305c = null;
        this.d = 600.0f;
        this.f46306e = 600.0f;
        this.f46307f = -1.0f;
        this.h = -1.0f;
        this.f46308n = 0;
        this.f46309r = 0.0f;
        this.f46310s = 0.0f;
        Paint paint = new Paint();
        this.f46303a = paint;
        paint.setColor(1073412858);
        this.f46303a.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        this.f46303a.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.f46304b = paint2;
        paint2.setColor(-1);
        Paint paint3 = new Paint();
        this.f46305c = paint3;
        paint3.setColor(-939524096);
        setBackgroundColor(-13421773);
        setOnTouchListener(new e0(this, 4));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i3;
        int i10;
        km0 km0Var = this.I;
        BitmapDrawable bitmapDrawable = km0Var.f46985b;
        if (bitmapDrawable != null) {
            try {
                int i11 = this.f46313y;
                int i12 = this.E;
                bitmapDrawable.setBounds(i11, i12, this.f46311w + i11, this.f46312x + i12);
                km0Var.f46985b.draw(canvas);
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        canvas.drawRect(this.f46313y, this.E, i3 + this.f46311w, this.h, this.f46305c);
        float f10 = this.h;
        canvas.drawRect(this.f46313y, f10, this.f46307f, f10 + this.f46306e, this.f46305c);
        float f11 = this.h;
        canvas.drawRect(this.f46307f + this.d, f11, this.f46313y + this.f46311w, f11 + this.f46306e, this.f46305c);
        canvas.drawRect(this.f46313y, this.h + this.f46306e, i10 + this.f46311w, this.E + this.f46312x, this.f46305c);
        float f12 = this.f46307f;
        float f13 = this.h;
        canvas.drawRect(f12, f13, f12 + this.d, f13 + this.f46306e, this.f46303a);
        int L = org.telegram.messenger.g0.L(1.0f);
        float f14 = L;
        float f15 = this.f46307f + f14;
        float f16 = L * 3;
        canvas.drawRect(f15, this.h + f14, f15 + org.telegram.messenger.g0.L(20.0f), this.h + f16, this.f46304b);
        float f17 = this.f46307f;
        float f18 = this.h + f14;
        canvas.drawRect(f17 + f14, f18, f17 + f16, f18 + org.telegram.messenger.g0.L(20.0f), this.f46304b);
        float L2 = ((this.f46307f + this.d) - f14) - org.telegram.messenger.g0.L(20.0f);
        float f19 = this.h;
        canvas.drawRect(L2, f19 + f14, (this.f46307f + this.d) - f14, f19 + f16, this.f46304b);
        float f20 = this.f46307f + this.d;
        float f21 = this.h + f14;
        canvas.drawRect(f20 - f16, f21, f20 - f14, f21 + org.telegram.messenger.g0.L(20.0f), this.f46304b);
        canvas.drawRect(this.f46307f + f14, ((this.h + this.f46306e) - f14) - org.telegram.messenger.g0.L(20.0f), this.f46307f + f16, (this.h + this.f46306e) - f14, this.f46304b);
        float f22 = this.f46307f + f14;
        canvas.drawRect(f22, (this.h + this.f46306e) - f16, f22 + org.telegram.messenger.g0.L(20.0f), (this.h + this.f46306e) - f14, this.f46304b);
        float L3 = ((this.f46307f + this.d) - f14) - org.telegram.messenger.g0.L(20.0f);
        float f23 = this.h + this.f46306e;
        canvas.drawRect(L3, f23 - f16, (this.f46307f + this.d) - f14, f23 - f14, this.f46304b);
        canvas.drawRect((this.f46307f + this.d) - f16, ((this.h + this.f46306e) - f14) - org.telegram.messenger.g0.L(20.0f), (this.f46307f + this.d) - f14, (this.h + this.f46306e) - f14, this.f46304b);
        for (int i13 = 1; i13 < 3; i13++) {
            float f24 = this.f46307f;
            float f25 = i13;
            float f26 = (this.d / 3.0f) * f25;
            float f27 = this.h;
            canvas.drawRect(f26 + f24, f27 + f14, f24 + f14 + f26, (f27 + this.f46306e) - f14, this.f46304b);
            float f28 = this.f46307f;
            float A = a1.g.A(this.f46306e, 3.0f, f25, this.h);
            canvas.drawRect(f28 + f14, A, (f28 - f14) + this.d, A + f14, this.f46304b);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        km0 km0Var;
        Bitmap bitmap;
        float f10;
        int i13;
        int i14;
        super.onLayout(z10, i3, i10, i11, i12);
        this.F = (i11 - i3) - org.telegram.messenger.g0.L(28.0f);
        int L = (i12 - i10) - org.telegram.messenger.g0.L(28.0f);
        this.G = L;
        if (this.F != 0 && L != 0 && (bitmap = (km0Var = this.I).f46984a) != null) {
            float f11 = this.f46307f - this.f46313y;
            float f12 = this.f46311w;
            float f13 = f11 / f12;
            float f14 = this.h - this.E;
            float f15 = this.f46312x;
            float f16 = f14 / f15;
            float f17 = this.d / f12;
            float f18 = this.f46306e / f15;
            float width = bitmap.getWidth();
            float height = km0Var.f46984a.getHeight();
            int i15 = this.F;
            float f19 = i15 / width;
            int i16 = this.G;
            if (f19 > i16 / height) {
                this.f46312x = i16;
                this.f46311w = (int) Math.ceil(width * f10);
            } else {
                this.f46311w = i15;
                this.f46312x = (int) Math.ceil(height * f19);
            }
            this.f46313y = org.telegram.messenger.g0.L(14.0f) + ((this.F - this.f46311w) / 2);
            int L2 = org.telegram.messenger.g0.L(14.0f) + ((this.G - this.f46312x) / 2);
            this.E = L2;
            if (this.f46307f == -1.0f && this.h == -1.0f) {
                if (this.H) {
                    this.h = L2;
                    this.f46307f = this.f46313y;
                    this.d = this.f46311w;
                    this.f46306e = this.f46312x;
                } else {
                    if (this.f46311w > this.f46312x) {
                        this.h = L2;
                        this.f46307f = org.telegram.messenger.g0.L(14.0f) + ((this.F - i14) / 2);
                        float f20 = this.f46312x;
                        this.d = f20;
                        this.f46306e = f20;
                    } else {
                        this.f46307f = this.f46313y;
                        this.h = org.telegram.messenger.g0.L(14.0f) + ((this.G - i13) / 2);
                        float f21 = this.f46311w;
                        this.d = f21;
                        this.f46306e = f21;
                    }
                }
            } else {
                float f22 = this.f46311w;
                this.f46307f = (f13 * f22) + this.f46313y;
                float f23 = this.f46312x;
                this.h = (f16 * f23) + L2;
                this.d = f17 * f22;
                this.f46306e = f18 * f23;
            }
            invalidate();
        }
    }
}
