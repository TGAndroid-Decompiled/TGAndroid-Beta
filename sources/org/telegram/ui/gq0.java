package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class gq0 extends FrameLayout {
    public int E;
    public int F;
    public boolean G;
    public final iq0 H;
    public final Paint f36698a;
    public final Paint f36699b;
    public final Paint f36700c;
    public float d;
    public float f36701e;
    public float f36702f;
    public float h;
    public int f36703n;
    public float f36704r;
    public float f36705s;
    public int v;
    public int f36706w;
    public int f36707x;
    public int f36708y;

    public gq0(iq0 iq0Var, Context context) {
        super(context);
        this.H = iq0Var;
        this.f36698a = null;
        this.f36699b = null;
        this.f36700c = null;
        this.d = 600.0f;
        this.f36701e = 600.0f;
        this.f36702f = -1.0f;
        this.h = -1.0f;
        this.f36703n = 0;
        this.f36704r = 0.0f;
        this.f36705s = 0.0f;
        Paint paint = new Paint();
        this.f36698a = paint;
        paint.setColor(1073412858);
        this.f36698a.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.f36698a.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.f36699b = paint2;
        paint2.setColor(-1);
        Paint paint3 = new Paint();
        this.f36700c = paint3;
        paint3.setColor(-939524096);
        setBackgroundColor(-13421773);
        setOnTouchListener(new e0(this, 4));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        iq0 iq0Var = this.H;
        BitmapDrawable bitmapDrawable = iq0Var.f37483b;
        if (bitmapDrawable != null) {
            try {
                int i12 = this.f36707x;
                int i13 = this.f36708y;
                bitmapDrawable.setBounds(i12, i13, this.v + i12, this.f36706w + i13);
                iq0Var.f37483b.draw(canvas);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        canvas.drawRect(this.f36707x, this.f36708y, i10 + this.v, this.h, this.f36700c);
        float f7 = this.h;
        canvas.drawRect(this.f36707x, f7, this.f36702f, f7 + this.f36701e, this.f36700c);
        float f10 = this.h;
        canvas.drawRect(this.f36702f + this.d, f10, this.f36707x + this.v, f10 + this.f36701e, this.f36700c);
        canvas.drawRect(this.f36707x, this.h + this.f36701e, i11 + this.v, this.f36708y + this.f36706w, this.f36700c);
        float f11 = this.f36702f;
        float f12 = this.h;
        canvas.drawRect(f11, f12, f11 + this.d, f12 + this.f36701e, this.f36698a);
        int dp = AndroidUtilities.dp(1.0f);
        float f13 = this.f36702f;
        float f14 = dp;
        float f15 = dp * 3;
        canvas.drawRect(f13 + f14, this.h + f14, f13 + f14 + AndroidUtilities.dp(20.0f), this.h + f15, this.f36699b);
        float f16 = this.f36702f;
        float f17 = this.h;
        canvas.drawRect(f16 + f14, f17 + f14, f16 + f15, f17 + f14 + AndroidUtilities.dp(20.0f), this.f36699b);
        float dp2 = ((this.f36702f + this.d) - f14) - AndroidUtilities.dp(20.0f);
        float f18 = this.h;
        canvas.drawRect(dp2, f18 + f14, (this.f36702f + this.d) - f14, f18 + f15, this.f36699b);
        float f19 = this.f36702f;
        float f20 = this.d;
        float f21 = this.h;
        canvas.drawRect((f19 + f20) - f15, f21 + f14, (f19 + f20) - f14, f21 + f14 + AndroidUtilities.dp(20.0f), this.f36699b);
        canvas.drawRect(this.f36702f + f14, ((this.h + this.f36701e) - f14) - AndroidUtilities.dp(20.0f), this.f36702f + f15, (this.h + this.f36701e) - f14, this.f36699b);
        float f22 = this.f36702f;
        canvas.drawRect(f22 + f14, (this.h + this.f36701e) - f15, f22 + f14 + AndroidUtilities.dp(20.0f), (this.h + this.f36701e) - f14, this.f36699b);
        float dp3 = ((this.f36702f + this.d) - f14) - AndroidUtilities.dp(20.0f);
        float f23 = this.h;
        float f24 = this.f36701e;
        canvas.drawRect(dp3, (f23 + f24) - f15, (this.f36702f + this.d) - f14, (f23 + f24) - f14, this.f36699b);
        canvas.drawRect((this.f36702f + this.d) - f15, ((this.h + this.f36701e) - f14) - AndroidUtilities.dp(20.0f), (this.f36702f + this.d) - f14, (this.h + this.f36701e) - f14, this.f36699b);
        for (int i14 = 1; i14 < 3; i14++) {
            float f25 = this.f36702f;
            float f26 = this.d;
            float f27 = i14;
            float f28 = this.h;
            canvas.drawRect(((f26 / 3.0f) * f27) + f25, f28 + f14, a4.a.e(f26, 3.0f, f27, f25 + f14), (f28 + this.f36701e) - f14, this.f36699b);
            float f29 = this.f36702f;
            float f30 = this.h;
            float f31 = this.f36701e;
            canvas.drawRect(f29 + f14, a4.a.e(f31, 3.0f, f27, f30), this.d + (f29 - f14), ((f31 / 3.0f) * f27) + f30 + f14, this.f36699b);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        iq0 iq0Var;
        Bitmap bitmap;
        float f7;
        int i14;
        int i15;
        super.onLayout(z10, i10, i11, i12, i13);
        this.E = (i12 - i10) - AndroidUtilities.dp(28.0f);
        int dp = (i13 - i11) - AndroidUtilities.dp(28.0f);
        this.F = dp;
        if (this.E != 0 && dp != 0 && (bitmap = (iq0Var = this.H).f37482a) != null) {
            float f10 = this.f36702f - this.f36707x;
            float f11 = this.v;
            float f12 = f10 / f11;
            float f13 = this.h - this.f36708y;
            float f14 = this.f36706w;
            float f15 = f13 / f14;
            float f16 = this.d / f11;
            float f17 = this.f36701e / f14;
            float width = bitmap.getWidth();
            float height = iq0Var.f37482a.getHeight();
            int i16 = this.E;
            float f18 = i16 / width;
            int i17 = this.F;
            if (f18 > i17 / height) {
                this.f36706w = i17;
                this.v = (int) Math.ceil(width * f7);
            } else {
                this.v = i16;
                this.f36706w = (int) Math.ceil(height * f18);
            }
            this.f36707x = AndroidUtilities.dp(14.0f) + ((this.E - this.v) / 2);
            int dp2 = AndroidUtilities.dp(14.0f) + ((this.F - this.f36706w) / 2);
            this.f36708y = dp2;
            if (this.f36702f == -1.0f && this.h == -1.0f) {
                if (this.G) {
                    this.h = dp2;
                    this.f36702f = this.f36707x;
                    this.d = this.v;
                    this.f36701e = this.f36706w;
                } else {
                    if (this.v > this.f36706w) {
                        this.h = dp2;
                        this.f36702f = AndroidUtilities.dp(14.0f) + ((this.E - i15) / 2);
                        float f19 = this.f36706w;
                        this.d = f19;
                        this.f36701e = f19;
                    } else {
                        this.f36702f = this.f36707x;
                        this.h = AndroidUtilities.dp(14.0f) + ((this.F - i14) / 2);
                        float f20 = this.v;
                        this.d = f20;
                        this.f36701e = f20;
                    }
                }
            } else {
                float f21 = this.v;
                this.f36702f = (f12 * f21) + this.f36707x;
                float f22 = this.f36706w;
                this.h = (f15 * f22) + dp2;
                this.d = f16 * f21;
                this.f36701e = f17 * f22;
            }
            invalidate();
        }
    }
}
