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
    public final Paint f36699a;
    public final Paint f36700b;
    public final Paint f36701c;
    public float d;
    public float f36702e;
    public float f36703f;
    public float h;
    public int f36704n;
    public float f36705r;
    public float f36706s;
    public int v;
    public int f36707w;
    public int f36708x;
    public int f36709y;

    public gq0(iq0 iq0Var, Context context) {
        super(context);
        this.H = iq0Var;
        this.f36699a = null;
        this.f36700b = null;
        this.f36701c = null;
        this.d = 600.0f;
        this.f36702e = 600.0f;
        this.f36703f = -1.0f;
        this.h = -1.0f;
        this.f36704n = 0;
        this.f36705r = 0.0f;
        this.f36706s = 0.0f;
        Paint paint = new Paint();
        this.f36699a = paint;
        paint.setColor(1073412858);
        this.f36699a.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.f36699a.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.f36700b = paint2;
        paint2.setColor(-1);
        Paint paint3 = new Paint();
        this.f36701c = paint3;
        paint3.setColor(-939524096);
        setBackgroundColor(-13421773);
        setOnTouchListener(new e0(this, 4));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        iq0 iq0Var = this.H;
        BitmapDrawable bitmapDrawable = iq0Var.f37484b;
        if (bitmapDrawable != null) {
            try {
                int i12 = this.f36708x;
                int i13 = this.f36709y;
                bitmapDrawable.setBounds(i12, i13, this.v + i12, this.f36707w + i13);
                iq0Var.f37484b.draw(canvas);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        canvas.drawRect(this.f36708x, this.f36709y, i10 + this.v, this.h, this.f36701c);
        float f7 = this.h;
        canvas.drawRect(this.f36708x, f7, this.f36703f, f7 + this.f36702e, this.f36701c);
        float f10 = this.h;
        canvas.drawRect(this.f36703f + this.d, f10, this.f36708x + this.v, f10 + this.f36702e, this.f36701c);
        canvas.drawRect(this.f36708x, this.h + this.f36702e, i11 + this.v, this.f36709y + this.f36707w, this.f36701c);
        float f11 = this.f36703f;
        float f12 = this.h;
        canvas.drawRect(f11, f12, f11 + this.d, f12 + this.f36702e, this.f36699a);
        int dp = AndroidUtilities.dp(1.0f);
        float f13 = this.f36703f;
        float f14 = dp;
        float f15 = dp * 3;
        canvas.drawRect(f13 + f14, this.h + f14, f13 + f14 + AndroidUtilities.dp(20.0f), this.h + f15, this.f36700b);
        float f16 = this.f36703f;
        float f17 = this.h;
        canvas.drawRect(f16 + f14, f17 + f14, f16 + f15, f17 + f14 + AndroidUtilities.dp(20.0f), this.f36700b);
        float dp2 = ((this.f36703f + this.d) - f14) - AndroidUtilities.dp(20.0f);
        float f18 = this.h;
        canvas.drawRect(dp2, f18 + f14, (this.f36703f + this.d) - f14, f18 + f15, this.f36700b);
        float f19 = this.f36703f;
        float f20 = this.d;
        float f21 = this.h;
        canvas.drawRect((f19 + f20) - f15, f21 + f14, (f19 + f20) - f14, f21 + f14 + AndroidUtilities.dp(20.0f), this.f36700b);
        canvas.drawRect(this.f36703f + f14, ((this.h + this.f36702e) - f14) - AndroidUtilities.dp(20.0f), this.f36703f + f15, (this.h + this.f36702e) - f14, this.f36700b);
        float f22 = this.f36703f;
        canvas.drawRect(f22 + f14, (this.h + this.f36702e) - f15, f22 + f14 + AndroidUtilities.dp(20.0f), (this.h + this.f36702e) - f14, this.f36700b);
        float dp3 = ((this.f36703f + this.d) - f14) - AndroidUtilities.dp(20.0f);
        float f23 = this.h;
        float f24 = this.f36702e;
        canvas.drawRect(dp3, (f23 + f24) - f15, (this.f36703f + this.d) - f14, (f23 + f24) - f14, this.f36700b);
        canvas.drawRect((this.f36703f + this.d) - f15, ((this.h + this.f36702e) - f14) - AndroidUtilities.dp(20.0f), (this.f36703f + this.d) - f14, (this.h + this.f36702e) - f14, this.f36700b);
        for (int i14 = 1; i14 < 3; i14++) {
            float f25 = this.f36703f;
            float f26 = this.d;
            float f27 = i14;
            float f28 = this.h;
            canvas.drawRect(((f26 / 3.0f) * f27) + f25, f28 + f14, a4.a.e(f26, 3.0f, f27, f25 + f14), (f28 + this.f36702e) - f14, this.f36700b);
            float f29 = this.f36703f;
            float f30 = this.h;
            float f31 = this.f36702e;
            canvas.drawRect(f29 + f14, a4.a.e(f31, 3.0f, f27, f30), this.d + (f29 - f14), ((f31 / 3.0f) * f27) + f30 + f14, this.f36700b);
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
        if (this.E != 0 && dp != 0 && (bitmap = (iq0Var = this.H).f37483a) != null) {
            float f10 = this.f36703f - this.f36708x;
            float f11 = this.v;
            float f12 = f10 / f11;
            float f13 = this.h - this.f36709y;
            float f14 = this.f36707w;
            float f15 = f13 / f14;
            float f16 = this.d / f11;
            float f17 = this.f36702e / f14;
            float width = bitmap.getWidth();
            float height = iq0Var.f37483a.getHeight();
            int i16 = this.E;
            float f18 = i16 / width;
            int i17 = this.F;
            if (f18 > i17 / height) {
                this.f36707w = i17;
                this.v = (int) Math.ceil(width * f7);
            } else {
                this.v = i16;
                this.f36707w = (int) Math.ceil(height * f18);
            }
            this.f36708x = AndroidUtilities.dp(14.0f) + ((this.E - this.v) / 2);
            int dp2 = AndroidUtilities.dp(14.0f) + ((this.F - this.f36707w) / 2);
            this.f36709y = dp2;
            if (this.f36703f == -1.0f && this.h == -1.0f) {
                if (this.G) {
                    this.h = dp2;
                    this.f36703f = this.f36708x;
                    this.d = this.v;
                    this.f36702e = this.f36707w;
                } else {
                    if (this.v > this.f36707w) {
                        this.h = dp2;
                        this.f36703f = AndroidUtilities.dp(14.0f) + ((this.E - i15) / 2);
                        float f19 = this.f36707w;
                        this.d = f19;
                        this.f36702e = f19;
                    } else {
                        this.f36703f = this.f36708x;
                        this.h = AndroidUtilities.dp(14.0f) + ((this.F - i14) / 2);
                        float f20 = this.v;
                        this.d = f20;
                        this.f36702e = f20;
                    }
                }
            } else {
                float f21 = this.v;
                this.f36703f = (f12 * f21) + this.f36708x;
                float f22 = this.f36707w;
                this.h = (f15 * f22) + dp2;
                this.d = f16 * f21;
                this.f36702e = f17 * f22;
            }
            invalidate();
        }
    }
}
