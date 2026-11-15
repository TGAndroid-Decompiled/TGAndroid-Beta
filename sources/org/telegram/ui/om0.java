package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.widget.FrameLayout;
public final class om0 extends FrameLayout {
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final qm0 I;
    public final Paint f50017a;
    public final Paint f50018b;
    public final Paint f50019c;
    public float d;
    public float f50020e;
    public float f50021f;
    public float h;
    public int f50022n;
    public float f50023r;
    public float f50024s;
    public int f50025w;
    public int f50026x;
    public int f50027y;

    public om0(qm0 qm0Var, Context context) {
        super(context);
        this.I = qm0Var;
        this.f50017a = null;
        this.f50018b = null;
        this.f50019c = null;
        this.d = 600.0f;
        this.f50020e = 600.0f;
        this.f50021f = -1.0f;
        this.h = -1.0f;
        this.f50022n = 0;
        this.f50023r = 0.0f;
        this.f50024s = 0.0f;
        Paint paint = new Paint();
        this.f50017a = paint;
        paint.setColor(1073412858);
        this.f50017a.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        this.f50017a.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.f50018b = paint2;
        paint2.setColor(-1);
        Paint paint3 = new Paint();
        this.f50019c = paint3;
        paint3.setColor(-939524096);
        setBackgroundColor(-13421773);
        setOnTouchListener(new c0(this, 4));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        int i10;
        qm0 qm0Var = this.I;
        BitmapDrawable bitmapDrawable = qm0Var.f50657b;
        if (bitmapDrawable != null) {
            try {
                int i11 = this.f50027y;
                int i12 = this.E;
                bitmapDrawable.setBounds(i11, i12, this.f50025w + i11, this.f50026x + i12);
                qm0Var.f50657b.draw(canvas);
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        canvas.drawRect(this.f50027y, this.E, i7 + this.f50025w, this.h, this.f50019c);
        float f10 = this.h;
        canvas.drawRect(this.f50027y, f10, this.f50021f, f10 + this.f50020e, this.f50019c);
        float f11 = this.h;
        canvas.drawRect(this.f50021f + this.d, f11, this.f50027y + this.f50025w, f11 + this.f50020e, this.f50019c);
        canvas.drawRect(this.f50027y, this.h + this.f50020e, i10 + this.f50025w, this.E + this.f50026x, this.f50019c);
        float f12 = this.f50021f;
        float f13 = this.h;
        canvas.drawRect(f12, f13, f12 + this.d, f13 + this.f50020e, this.f50017a);
        int L = org.telegram.messenger.g0.L(1.0f);
        float f14 = L;
        float f15 = this.f50021f + f14;
        float f16 = L * 3;
        canvas.drawRect(f15, this.h + f14, f15 + org.telegram.messenger.g0.L(20.0f), this.h + f16, this.f50018b);
        float f17 = this.f50021f;
        float f18 = this.h + f14;
        canvas.drawRect(f17 + f14, f18, f17 + f16, f18 + org.telegram.messenger.g0.L(20.0f), this.f50018b);
        float L2 = ((this.f50021f + this.d) - f14) - org.telegram.messenger.g0.L(20.0f);
        float f19 = this.h;
        canvas.drawRect(L2, f19 + f14, (this.f50021f + this.d) - f14, f19 + f16, this.f50018b);
        float f20 = this.f50021f + this.d;
        float f21 = this.h + f14;
        canvas.drawRect(f20 - f16, f21, f20 - f14, f21 + org.telegram.messenger.g0.L(20.0f), this.f50018b);
        canvas.drawRect(this.f50021f + f14, ((this.h + this.f50020e) - f14) - org.telegram.messenger.g0.L(20.0f), this.f50021f + f16, (this.h + this.f50020e) - f14, this.f50018b);
        float f22 = this.f50021f + f14;
        canvas.drawRect(f22, (this.h + this.f50020e) - f16, f22 + org.telegram.messenger.g0.L(20.0f), (this.h + this.f50020e) - f14, this.f50018b);
        float L3 = ((this.f50021f + this.d) - f14) - org.telegram.messenger.g0.L(20.0f);
        float f23 = this.h + this.f50020e;
        canvas.drawRect(L3, f23 - f16, (this.f50021f + this.d) - f14, f23 - f14, this.f50018b);
        canvas.drawRect((this.f50021f + this.d) - f16, ((this.h + this.f50020e) - f14) - org.telegram.messenger.g0.L(20.0f), (this.f50021f + this.d) - f14, (this.h + this.f50020e) - f14, this.f50018b);
        for (int i13 = 1; i13 < 3; i13++) {
            float f24 = this.f50021f;
            float f25 = i13;
            float f26 = (this.d / 3.0f) * f25;
            float f27 = this.h;
            canvas.drawRect(f26 + f24, f27 + f14, f24 + f14 + f26, (f27 + this.f50020e) - f14, this.f50018b);
            float f28 = this.f50021f;
            float c10 = com.google.android.gms.internal.vision.e2.c(this.f50020e, 3.0f, f25, this.h);
            canvas.drawRect(f28 + f14, c10, (f28 - f14) + this.d, c10 + f14, this.f50018b);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        qm0 qm0Var;
        Bitmap bitmap;
        float f10;
        int i13;
        int i14;
        super.onLayout(z10, i7, i10, i11, i12);
        this.F = (i11 - i7) - org.telegram.messenger.g0.L(28.0f);
        int L = (i12 - i10) - org.telegram.messenger.g0.L(28.0f);
        this.G = L;
        if (this.F != 0 && L != 0 && (bitmap = (qm0Var = this.I).f50656a) != null) {
            float f11 = this.f50021f - this.f50027y;
            float f12 = this.f50025w;
            float f13 = f11 / f12;
            float f14 = this.h - this.E;
            float f15 = this.f50026x;
            float f16 = f14 / f15;
            float f17 = this.d / f12;
            float f18 = this.f50020e / f15;
            float width = bitmap.getWidth();
            float height = qm0Var.f50656a.getHeight();
            int i15 = this.F;
            float f19 = i15 / width;
            int i16 = this.G;
            if (f19 > i16 / height) {
                this.f50026x = i16;
                this.f50025w = (int) Math.ceil(width * f10);
            } else {
                this.f50025w = i15;
                this.f50026x = (int) Math.ceil(height * f19);
            }
            this.f50027y = org.telegram.messenger.g0.L(14.0f) + ((this.F - this.f50025w) / 2);
            int L2 = org.telegram.messenger.g0.L(14.0f) + ((this.G - this.f50026x) / 2);
            this.E = L2;
            if (this.f50021f == -1.0f && this.h == -1.0f) {
                if (this.H) {
                    this.h = L2;
                    this.f50021f = this.f50027y;
                    this.d = this.f50025w;
                    this.f50020e = this.f50026x;
                } else {
                    if (this.f50025w > this.f50026x) {
                        this.h = L2;
                        this.f50021f = org.telegram.messenger.g0.L(14.0f) + ((this.F - i14) / 2);
                        float f20 = this.f50026x;
                        this.d = f20;
                        this.f50020e = f20;
                    } else {
                        this.f50021f = this.f50027y;
                        this.h = org.telegram.messenger.g0.L(14.0f) + ((this.G - i13) / 2);
                        float f21 = this.f50025w;
                        this.d = f21;
                        this.f50020e = f21;
                    }
                }
            } else {
                float f22 = this.f50025w;
                this.f50021f = (f13 * f22) + this.f50027y;
                float f23 = this.f50026x;
                this.h = (f16 * f23) + L2;
                this.d = f17 * f22;
                this.f50020e = f18 * f23;
            }
            invalidate();
        }
    }
}
