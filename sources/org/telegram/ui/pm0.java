package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.widget.FrameLayout;
public final class pm0 extends FrameLayout {
    public int D;
    public int E;
    public int F;
    public boolean G;
    public final rm0 H;
    public final Paint f48751a;
    public final Paint f48752b;
    public final Paint f48753c;
    public float d;
    public float f48754e;
    public float f48755f;
    public float h;
    public int f48756n;
    public float f48757r;
    public float f48758s;
    public int f48759w;
    public int f48760x;
    public int f48761y;

    public pm0(rm0 rm0Var, Context context) {
        super(context);
        this.H = rm0Var;
        this.f48751a = null;
        this.f48752b = null;
        this.f48753c = null;
        this.d = 600.0f;
        this.f48754e = 600.0f;
        this.f48755f = -1.0f;
        this.h = -1.0f;
        this.f48756n = 0;
        this.f48757r = 0.0f;
        this.f48758s = 0.0f;
        Paint paint = new Paint();
        this.f48751a = paint;
        paint.setColor(1073412858);
        this.f48751a.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        this.f48751a.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.f48752b = paint2;
        paint2.setColor(-1);
        Paint paint3 = new Paint();
        this.f48753c = paint3;
        paint3.setColor(-939524096);
        setBackgroundColor(-13421773);
        setOnTouchListener(new d0(this, 4));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        int i10;
        rm0 rm0Var = this.H;
        BitmapDrawable bitmapDrawable = rm0Var.f49505b;
        if (bitmapDrawable != null) {
            try {
                int i11 = this.f48761y;
                int i12 = this.D;
                bitmapDrawable.setBounds(i11, i12, this.f48759w + i11, this.f48760x + i12);
                rm0Var.f49505b.draw(canvas);
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        canvas.drawRect(this.f48761y, this.D, i7 + this.f48759w, this.h, this.f48753c);
        float f10 = this.h;
        canvas.drawRect(this.f48761y, f10, this.f48755f, f10 + this.f48754e, this.f48753c);
        float f11 = this.h;
        canvas.drawRect(this.f48755f + this.d, f11, this.f48761y + this.f48759w, f11 + this.f48754e, this.f48753c);
        canvas.drawRect(this.f48761y, this.h + this.f48754e, i10 + this.f48759w, this.D + this.f48760x, this.f48753c);
        float f12 = this.f48755f;
        float f13 = this.h;
        canvas.drawRect(f12, f13, f12 + this.d, f13 + this.f48754e, this.f48751a);
        int L = org.telegram.messenger.g0.L(1.0f);
        float f14 = L;
        float f15 = this.f48755f + f14;
        float f16 = L * 3;
        canvas.drawRect(f15, this.h + f14, f15 + org.telegram.messenger.g0.L(20.0f), this.h + f16, this.f48752b);
        float f17 = this.f48755f;
        float f18 = this.h + f14;
        canvas.drawRect(f17 + f14, f18, f17 + f16, f18 + org.telegram.messenger.g0.L(20.0f), this.f48752b);
        float L2 = ((this.f48755f + this.d) - f14) - org.telegram.messenger.g0.L(20.0f);
        float f19 = this.h;
        canvas.drawRect(L2, f19 + f14, (this.f48755f + this.d) - f14, f19 + f16, this.f48752b);
        float f20 = this.f48755f + this.d;
        float f21 = this.h + f14;
        canvas.drawRect(f20 - f16, f21, f20 - f14, f21 + org.telegram.messenger.g0.L(20.0f), this.f48752b);
        canvas.drawRect(this.f48755f + f14, ((this.h + this.f48754e) - f14) - org.telegram.messenger.g0.L(20.0f), this.f48755f + f16, (this.h + this.f48754e) - f14, this.f48752b);
        float f22 = this.f48755f + f14;
        canvas.drawRect(f22, (this.h + this.f48754e) - f16, f22 + org.telegram.messenger.g0.L(20.0f), (this.h + this.f48754e) - f14, this.f48752b);
        float L3 = ((this.f48755f + this.d) - f14) - org.telegram.messenger.g0.L(20.0f);
        float f23 = this.h + this.f48754e;
        canvas.drawRect(L3, f23 - f16, (this.f48755f + this.d) - f14, f23 - f14, this.f48752b);
        canvas.drawRect((this.f48755f + this.d) - f16, ((this.h + this.f48754e) - f14) - org.telegram.messenger.g0.L(20.0f), (this.f48755f + this.d) - f14, (this.h + this.f48754e) - f14, this.f48752b);
        for (int i13 = 1; i13 < 3; i13++) {
            float f24 = this.f48755f;
            float f25 = i13;
            float f26 = (this.d / 3.0f) * f25;
            float f27 = this.h;
            canvas.drawRect(f26 + f24, f27 + f14, f24 + f14 + f26, (f27 + this.f48754e) - f14, this.f48752b);
            float f28 = this.f48755f;
            float c10 = com.google.android.recaptcha.internal.a.c(this.f48754e, 3.0f, f25, this.h);
            canvas.drawRect(f28 + f14, c10, (f28 - f14) + this.d, c10 + f14, this.f48752b);
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        rm0 rm0Var;
        Bitmap bitmap;
        float f10;
        int i13;
        int i14;
        super.onLayout(z9, i7, i10, i11, i12);
        this.E = (i11 - i7) - org.telegram.messenger.g0.L(28.0f);
        int L = (i12 - i10) - org.telegram.messenger.g0.L(28.0f);
        this.F = L;
        if (this.E != 0 && L != 0 && (bitmap = (rm0Var = this.H).f49504a) != null) {
            float f11 = this.f48755f - this.f48761y;
            float f12 = this.f48759w;
            float f13 = f11 / f12;
            float f14 = this.h - this.D;
            float f15 = this.f48760x;
            float f16 = f14 / f15;
            float f17 = this.d / f12;
            float f18 = this.f48754e / f15;
            float width = bitmap.getWidth();
            float height = rm0Var.f49504a.getHeight();
            int i15 = this.E;
            float f19 = i15 / width;
            int i16 = this.F;
            if (f19 > i16 / height) {
                this.f48760x = i16;
                this.f48759w = (int) Math.ceil(width * f10);
            } else {
                this.f48759w = i15;
                this.f48760x = (int) Math.ceil(height * f19);
            }
            this.f48761y = org.telegram.messenger.g0.L(14.0f) + ((this.E - this.f48759w) / 2);
            int L2 = org.telegram.messenger.g0.L(14.0f) + ((this.F - this.f48760x) / 2);
            this.D = L2;
            if (this.f48755f == -1.0f && this.h == -1.0f) {
                if (this.G) {
                    this.h = L2;
                    this.f48755f = this.f48761y;
                    this.d = this.f48759w;
                    this.f48754e = this.f48760x;
                } else {
                    if (this.f48759w > this.f48760x) {
                        this.h = L2;
                        this.f48755f = org.telegram.messenger.g0.L(14.0f) + ((this.E - i14) / 2);
                        float f20 = this.f48760x;
                        this.d = f20;
                        this.f48754e = f20;
                    } else {
                        this.f48755f = this.f48761y;
                        this.h = org.telegram.messenger.g0.L(14.0f) + ((this.F - i13) / 2);
                        float f21 = this.f48759w;
                        this.d = f21;
                        this.f48754e = f21;
                    }
                }
            } else {
                float f22 = this.f48759w;
                this.f48755f = (f13 * f22) + this.f48761y;
                float f23 = this.f48760x;
                this.h = (f16 * f23) + L2;
                this.d = f17 * f22;
                this.f48754e = f18 * f23;
            }
            invalidate();
        }
    }
}
