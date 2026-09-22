package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class mq0 extends FrameLayout {
    public int E;
    public int F;
    public boolean G;
    public final oq0 H;
    public final Paint f35806a;
    public final Paint f35807b;
    public final Paint f35808c;
    public float d;
    public float e;
    public float f35809f;
    public float h;
    public int f35810n;
    public float f35811r;
    public float f35812s;
    public int v;
    public int f35813w;
    public int f35814x;
    public int f35815y;

    public mq0(oq0 oq0Var, Context context) {
        super(context);
        this.H = oq0Var;
        this.f35806a = null;
        this.f35807b = null;
        this.f35808c = null;
        this.d = 600.0f;
        this.e = 600.0f;
        this.f35809f = -1.0f;
        this.h = -1.0f;
        this.f35810n = 0;
        this.f35811r = 0.0f;
        this.f35812s = 0.0f;
        Paint paint = new Paint();
        this.f35806a = paint;
        paint.setColor(1073412858);
        this.f35806a.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.f35806a.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.f35807b = paint2;
        paint2.setColor(-1);
        Paint paint3 = new Paint();
        this.f35808c = paint3;
        paint3.setColor(-939524096);
        setBackgroundColor(-13421773);
        setOnTouchListener(new d0(this, 4));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        oq0 oq0Var = this.H;
        BitmapDrawable bitmapDrawable = oq0Var.f36383b;
        if (bitmapDrawable != null) {
            try {
                int i12 = this.f35814x;
                int i13 = this.f35815y;
                bitmapDrawable.setBounds(i12, i13, this.v + i12, this.f35813w + i13);
                oq0Var.f36383b.draw(canvas);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        canvas.drawRect(this.f35814x, this.f35815y, i10 + this.v, this.h, this.f35808c);
        float f7 = this.h;
        canvas.drawRect(this.f35814x, f7, this.f35809f, f7 + this.e, this.f35808c);
        float f10 = this.h;
        canvas.drawRect(this.f35809f + this.d, f10, this.f35814x + this.v, f10 + this.e, this.f35808c);
        canvas.drawRect(this.f35814x, this.h + this.e, i11 + this.v, this.f35815y + this.f35813w, this.f35808c);
        float f11 = this.f35809f;
        float f12 = this.h;
        canvas.drawRect(f11, f12, f11 + this.d, f12 + this.e, this.f35806a);
        int dp = AndroidUtilities.dp(1.0f);
        float f13 = this.f35809f;
        float f14 = dp;
        float f15 = dp * 3;
        canvas.drawRect(f13 + f14, this.h + f14, f13 + f14 + AndroidUtilities.dp(20.0f), this.h + f15, this.f35807b);
        float f16 = this.f35809f;
        float f17 = this.h;
        canvas.drawRect(f16 + f14, f17 + f14, f16 + f15, f17 + f14 + AndroidUtilities.dp(20.0f), this.f35807b);
        float dp2 = ((this.f35809f + this.d) - f14) - AndroidUtilities.dp(20.0f);
        float f18 = this.h;
        canvas.drawRect(dp2, f18 + f14, (this.f35809f + this.d) - f14, f18 + f15, this.f35807b);
        float f19 = this.f35809f;
        float f20 = this.d;
        float f21 = this.h;
        canvas.drawRect((f19 + f20) - f15, f21 + f14, (f19 + f20) - f14, f21 + f14 + AndroidUtilities.dp(20.0f), this.f35807b);
        canvas.drawRect(this.f35809f + f14, ((this.h + this.e) - f14) - AndroidUtilities.dp(20.0f), this.f35809f + f15, (this.h + this.e) - f14, this.f35807b);
        float f22 = this.f35809f;
        canvas.drawRect(f22 + f14, (this.h + this.e) - f15, f22 + f14 + AndroidUtilities.dp(20.0f), (this.h + this.e) - f14, this.f35807b);
        float dp3 = ((this.f35809f + this.d) - f14) - AndroidUtilities.dp(20.0f);
        float f23 = this.h;
        float f24 = this.e;
        canvas.drawRect(dp3, (f23 + f24) - f15, (this.f35809f + this.d) - f14, (f23 + f24) - f14, this.f35807b);
        canvas.drawRect((this.f35809f + this.d) - f15, ((this.h + this.e) - f14) - AndroidUtilities.dp(20.0f), (this.f35809f + this.d) - f14, (this.h + this.e) - f14, this.f35807b);
        for (int i14 = 1; i14 < 3; i14++) {
            float f25 = this.f35809f;
            float f26 = this.d;
            float f27 = i14;
            float f28 = this.h;
            canvas.drawRect(((f26 / 3.0f) * f27) + f25, f28 + f14, a4.a.e(f26, 3.0f, f27, f25 + f14), (f28 + this.e) - f14, this.f35807b);
            float f29 = this.f35809f;
            float f30 = this.h;
            float f31 = this.e;
            canvas.drawRect(f29 + f14, a4.a.e(f31, 3.0f, f27, f30), this.d + (f29 - f14), ((f31 / 3.0f) * f27) + f30 + f14, this.f35807b);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        oq0 oq0Var;
        Bitmap bitmap;
        float f7;
        int i14;
        int i15;
        super.onLayout(z10, i10, i11, i12, i13);
        this.E = (i12 - i10) - AndroidUtilities.dp(28.0f);
        int dp = (i13 - i11) - AndroidUtilities.dp(28.0f);
        this.F = dp;
        if (this.E != 0 && dp != 0 && (bitmap = (oq0Var = this.H).f36382a) != null) {
            float f10 = this.f35809f - this.f35814x;
            float f11 = this.v;
            float f12 = f10 / f11;
            float f13 = this.h - this.f35815y;
            float f14 = this.f35813w;
            float f15 = f13 / f14;
            float f16 = this.d / f11;
            float f17 = this.e / f14;
            float width = bitmap.getWidth();
            float height = oq0Var.f36382a.getHeight();
            int i16 = this.E;
            float f18 = i16 / width;
            int i17 = this.F;
            if (f18 > i17 / height) {
                this.f35813w = i17;
                this.v = (int) Math.ceil(width * f7);
            } else {
                this.v = i16;
                this.f35813w = (int) Math.ceil(height * f18);
            }
            this.f35814x = AndroidUtilities.dp(14.0f) + ((this.E - this.v) / 2);
            int dp2 = AndroidUtilities.dp(14.0f) + ((this.F - this.f35813w) / 2);
            this.f35815y = dp2;
            if (this.f35809f == -1.0f && this.h == -1.0f) {
                if (this.G) {
                    this.h = dp2;
                    this.f35809f = this.f35814x;
                    this.d = this.v;
                    this.e = this.f35813w;
                } else {
                    if (this.v > this.f35813w) {
                        this.h = dp2;
                        this.f35809f = AndroidUtilities.dp(14.0f) + ((this.E - i15) / 2);
                        float f19 = this.f35813w;
                        this.d = f19;
                        this.e = f19;
                    } else {
                        this.f35809f = this.f35814x;
                        this.h = AndroidUtilities.dp(14.0f) + ((this.F - i14) / 2);
                        float f20 = this.v;
                        this.d = f20;
                        this.e = f20;
                    }
                }
            } else {
                float f21 = this.v;
                this.f35809f = (f12 * f21) + this.f35814x;
                float f22 = this.f35813w;
                this.h = (f15 * f22) + dp2;
                this.d = f16 * f21;
                this.e = f17 * f22;
            }
            invalidate();
        }
    }
}
