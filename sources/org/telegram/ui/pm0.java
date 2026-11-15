package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.widget.FrameLayout;
public final class pm0 extends FrameLayout {
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final rm0 I;
    public final Paint f50304a;
    public final Paint f50305b;
    public final Paint f50306c;
    public float d;
    public float f50307e;
    public float f50308f;
    public float h;
    public int f50309n;
    public float f50310r;
    public float f50311s;
    public int f50312w;
    public int f50313x;
    public int f50314y;

    public pm0(rm0 rm0Var, Context context) {
        super(context);
        this.I = rm0Var;
        this.f50304a = null;
        this.f50305b = null;
        this.f50306c = null;
        this.d = 600.0f;
        this.f50307e = 600.0f;
        this.f50308f = -1.0f;
        this.h = -1.0f;
        this.f50309n = 0;
        this.f50310r = 0.0f;
        this.f50311s = 0.0f;
        Paint paint = new Paint();
        this.f50304a = paint;
        paint.setColor(1073412858);
        this.f50304a.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        this.f50304a.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.f50305b = paint2;
        paint2.setColor(-1);
        Paint paint3 = new Paint();
        this.f50306c = paint3;
        paint3.setColor(-939524096);
        setBackgroundColor(-13421773);
        setOnTouchListener(new c0(this, 4));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        int i10;
        rm0 rm0Var = this.I;
        BitmapDrawable bitmapDrawable = rm0Var.f50972b;
        if (bitmapDrawable != null) {
            try {
                int i11 = this.f50314y;
                int i12 = this.E;
                bitmapDrawable.setBounds(i11, i12, this.f50312w + i11, this.f50313x + i12);
                rm0Var.f50972b.draw(canvas);
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        canvas.drawRect(this.f50314y, this.E, i7 + this.f50312w, this.h, this.f50306c);
        float f10 = this.h;
        canvas.drawRect(this.f50314y, f10, this.f50308f, f10 + this.f50307e, this.f50306c);
        float f11 = this.h;
        canvas.drawRect(this.f50308f + this.d, f11, this.f50314y + this.f50312w, f11 + this.f50307e, this.f50306c);
        canvas.drawRect(this.f50314y, this.h + this.f50307e, i10 + this.f50312w, this.E + this.f50313x, this.f50306c);
        float f12 = this.f50308f;
        float f13 = this.h;
        canvas.drawRect(f12, f13, f12 + this.d, f13 + this.f50307e, this.f50304a);
        int L = org.telegram.messenger.g0.L(1.0f);
        float f14 = L;
        float f15 = this.f50308f + f14;
        float f16 = L * 3;
        canvas.drawRect(f15, this.h + f14, f15 + org.telegram.messenger.g0.L(20.0f), this.h + f16, this.f50305b);
        float f17 = this.f50308f;
        float f18 = this.h + f14;
        canvas.drawRect(f17 + f14, f18, f17 + f16, f18 + org.telegram.messenger.g0.L(20.0f), this.f50305b);
        float L2 = ((this.f50308f + this.d) - f14) - org.telegram.messenger.g0.L(20.0f);
        float f19 = this.h;
        canvas.drawRect(L2, f19 + f14, (this.f50308f + this.d) - f14, f19 + f16, this.f50305b);
        float f20 = this.f50308f + this.d;
        float f21 = this.h + f14;
        canvas.drawRect(f20 - f16, f21, f20 - f14, f21 + org.telegram.messenger.g0.L(20.0f), this.f50305b);
        canvas.drawRect(this.f50308f + f14, ((this.h + this.f50307e) - f14) - org.telegram.messenger.g0.L(20.0f), this.f50308f + f16, (this.h + this.f50307e) - f14, this.f50305b);
        float f22 = this.f50308f + f14;
        canvas.drawRect(f22, (this.h + this.f50307e) - f16, f22 + org.telegram.messenger.g0.L(20.0f), (this.h + this.f50307e) - f14, this.f50305b);
        float L3 = ((this.f50308f + this.d) - f14) - org.telegram.messenger.g0.L(20.0f);
        float f23 = this.h + this.f50307e;
        canvas.drawRect(L3, f23 - f16, (this.f50308f + this.d) - f14, f23 - f14, this.f50305b);
        canvas.drawRect((this.f50308f + this.d) - f16, ((this.h + this.f50307e) - f14) - org.telegram.messenger.g0.L(20.0f), (this.f50308f + this.d) - f14, (this.h + this.f50307e) - f14, this.f50305b);
        for (int i13 = 1; i13 < 3; i13++) {
            float f24 = this.f50308f;
            float f25 = i13;
            float f26 = (this.d / 3.0f) * f25;
            float f27 = this.h;
            canvas.drawRect(f26 + f24, f27 + f14, f24 + f14 + f26, (f27 + this.f50307e) - f14, this.f50305b);
            float f28 = this.f50308f;
            float c10 = com.google.android.gms.internal.vision.e2.c(this.f50307e, 3.0f, f25, this.h);
            canvas.drawRect(f28 + f14, c10, (f28 - f14) + this.d, c10 + f14, this.f50305b);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        rm0 rm0Var;
        Bitmap bitmap;
        float f10;
        int i13;
        int i14;
        super.onLayout(z10, i7, i10, i11, i12);
        this.F = (i11 - i7) - org.telegram.messenger.g0.L(28.0f);
        int L = (i12 - i10) - org.telegram.messenger.g0.L(28.0f);
        this.G = L;
        if (this.F != 0 && L != 0 && (bitmap = (rm0Var = this.I).f50971a) != null) {
            float f11 = this.f50308f - this.f50314y;
            float f12 = this.f50312w;
            float f13 = f11 / f12;
            float f14 = this.h - this.E;
            float f15 = this.f50313x;
            float f16 = f14 / f15;
            float f17 = this.d / f12;
            float f18 = this.f50307e / f15;
            float width = bitmap.getWidth();
            float height = rm0Var.f50971a.getHeight();
            int i15 = this.F;
            float f19 = i15 / width;
            int i16 = this.G;
            if (f19 > i16 / height) {
                this.f50313x = i16;
                this.f50312w = (int) Math.ceil(width * f10);
            } else {
                this.f50312w = i15;
                this.f50313x = (int) Math.ceil(height * f19);
            }
            this.f50314y = org.telegram.messenger.g0.L(14.0f) + ((this.F - this.f50312w) / 2);
            int L2 = org.telegram.messenger.g0.L(14.0f) + ((this.G - this.f50313x) / 2);
            this.E = L2;
            if (this.f50308f == -1.0f && this.h == -1.0f) {
                if (this.H) {
                    this.h = L2;
                    this.f50308f = this.f50314y;
                    this.d = this.f50312w;
                    this.f50307e = this.f50313x;
                } else {
                    if (this.f50312w > this.f50313x) {
                        this.h = L2;
                        this.f50308f = org.telegram.messenger.g0.L(14.0f) + ((this.F - i14) / 2);
                        float f20 = this.f50313x;
                        this.d = f20;
                        this.f50307e = f20;
                    } else {
                        this.f50308f = this.f50314y;
                        this.h = org.telegram.messenger.g0.L(14.0f) + ((this.G - i13) / 2);
                        float f21 = this.f50312w;
                        this.d = f21;
                        this.f50307e = f21;
                    }
                }
            } else {
                float f22 = this.f50312w;
                this.f50308f = (f13 * f22) + this.f50314y;
                float f23 = this.f50313x;
                this.h = (f16 * f23) + L2;
                this.d = f17 * f22;
                this.f50307e = f18 * f23;
            }
            invalidate();
        }
    }
}
