package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class lq0 extends FrameLayout {
    public int E;
    public int F;
    public boolean G;
    public final nq0 H;
    public final Paint f38485a;
    public final Paint f38486b;
    public final Paint f38487c;
    public float d;
    public float f38488e;
    public float f38489f;
    public float h;
    public int f38490n;
    public float f38491r;
    public float f38492s;
    public int v;
    public int f38493w;
    public int f38494x;
    public int f38495y;

    public lq0(nq0 nq0Var, Context context) {
        super(context);
        this.H = nq0Var;
        this.f38485a = null;
        this.f38486b = null;
        this.f38487c = null;
        this.d = 600.0f;
        this.f38488e = 600.0f;
        this.f38489f = -1.0f;
        this.h = -1.0f;
        this.f38490n = 0;
        this.f38491r = 0.0f;
        this.f38492s = 0.0f;
        Paint paint = new Paint();
        this.f38485a = paint;
        paint.setColor(1073412858);
        this.f38485a.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.f38485a.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.f38486b = paint2;
        paint2.setColor(-1);
        Paint paint3 = new Paint();
        this.f38487c = paint3;
        paint3.setColor(-939524096);
        setBackgroundColor(-13421773);
        setOnTouchListener(new d0(this, 4));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        nq0 nq0Var = this.H;
        BitmapDrawable bitmapDrawable = nq0Var.f39032b;
        if (bitmapDrawable != null) {
            try {
                int i12 = this.f38494x;
                int i13 = this.f38495y;
                bitmapDrawable.setBounds(i12, i13, this.v + i12, this.f38493w + i13);
                nq0Var.f39032b.draw(canvas);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        canvas.drawRect(this.f38494x, this.f38495y, i10 + this.v, this.h, this.f38487c);
        float f7 = this.h;
        canvas.drawRect(this.f38494x, f7, this.f38489f, f7 + this.f38488e, this.f38487c);
        float f10 = this.h;
        canvas.drawRect(this.f38489f + this.d, f10, this.f38494x + this.v, f10 + this.f38488e, this.f38487c);
        canvas.drawRect(this.f38494x, this.h + this.f38488e, i11 + this.v, this.f38495y + this.f38493w, this.f38487c);
        float f11 = this.f38489f;
        float f12 = this.h;
        canvas.drawRect(f11, f12, f11 + this.d, f12 + this.f38488e, this.f38485a);
        int dp = AndroidUtilities.dp(1.0f);
        float f13 = this.f38489f;
        float f14 = dp;
        float f15 = dp * 3;
        canvas.drawRect(f13 + f14, this.h + f14, f13 + f14 + AndroidUtilities.dp(20.0f), this.h + f15, this.f38486b);
        float f16 = this.f38489f;
        float f17 = this.h;
        canvas.drawRect(f16 + f14, f17 + f14, f16 + f15, f17 + f14 + AndroidUtilities.dp(20.0f), this.f38486b);
        float dp2 = ((this.f38489f + this.d) - f14) - AndroidUtilities.dp(20.0f);
        float f18 = this.h;
        canvas.drawRect(dp2, f18 + f14, (this.f38489f + this.d) - f14, f18 + f15, this.f38486b);
        float f19 = this.f38489f;
        float f20 = this.d;
        float f21 = this.h;
        canvas.drawRect((f19 + f20) - f15, f21 + f14, (f19 + f20) - f14, f21 + f14 + AndroidUtilities.dp(20.0f), this.f38486b);
        canvas.drawRect(this.f38489f + f14, ((this.h + this.f38488e) - f14) - AndroidUtilities.dp(20.0f), this.f38489f + f15, (this.h + this.f38488e) - f14, this.f38486b);
        float f22 = this.f38489f;
        canvas.drawRect(f22 + f14, (this.h + this.f38488e) - f15, f22 + f14 + AndroidUtilities.dp(20.0f), (this.h + this.f38488e) - f14, this.f38486b);
        float dp3 = ((this.f38489f + this.d) - f14) - AndroidUtilities.dp(20.0f);
        float f23 = this.h;
        float f24 = this.f38488e;
        canvas.drawRect(dp3, (f23 + f24) - f15, (this.f38489f + this.d) - f14, (f23 + f24) - f14, this.f38486b);
        canvas.drawRect((this.f38489f + this.d) - f15, ((this.h + this.f38488e) - f14) - AndroidUtilities.dp(20.0f), (this.f38489f + this.d) - f14, (this.h + this.f38488e) - f14, this.f38486b);
        for (int i14 = 1; i14 < 3; i14++) {
            float f25 = this.f38489f;
            float f26 = this.d;
            float f27 = i14;
            float f28 = this.h;
            canvas.drawRect(((f26 / 3.0f) * f27) + f25, f28 + f14, a4.a.e(f26, 3.0f, f27, f25 + f14), (f28 + this.f38488e) - f14, this.f38486b);
            float f29 = this.f38489f;
            float f30 = this.h;
            float f31 = this.f38488e;
            canvas.drawRect(f29 + f14, a4.a.e(f31, 3.0f, f27, f30), this.d + (f29 - f14), ((f31 / 3.0f) * f27) + f30 + f14, this.f38486b);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        nq0 nq0Var;
        Bitmap bitmap;
        float f7;
        int i14;
        int i15;
        super.onLayout(z10, i10, i11, i12, i13);
        this.E = (i12 - i10) - AndroidUtilities.dp(28.0f);
        int dp = (i13 - i11) - AndroidUtilities.dp(28.0f);
        this.F = dp;
        if (this.E != 0 && dp != 0 && (bitmap = (nq0Var = this.H).f39031a) != null) {
            float f10 = this.f38489f - this.f38494x;
            float f11 = this.v;
            float f12 = f10 / f11;
            float f13 = this.h - this.f38495y;
            float f14 = this.f38493w;
            float f15 = f13 / f14;
            float f16 = this.d / f11;
            float f17 = this.f38488e / f14;
            float width = bitmap.getWidth();
            float height = nq0Var.f39031a.getHeight();
            int i16 = this.E;
            float f18 = i16 / width;
            int i17 = this.F;
            if (f18 > i17 / height) {
                this.f38493w = i17;
                this.v = (int) Math.ceil(width * f7);
            } else {
                this.v = i16;
                this.f38493w = (int) Math.ceil(height * f18);
            }
            this.f38494x = AndroidUtilities.dp(14.0f) + ((this.E - this.v) / 2);
            int dp2 = AndroidUtilities.dp(14.0f) + ((this.F - this.f38493w) / 2);
            this.f38495y = dp2;
            if (this.f38489f == -1.0f && this.h == -1.0f) {
                if (this.G) {
                    this.h = dp2;
                    this.f38489f = this.f38494x;
                    this.d = this.v;
                    this.f38488e = this.f38493w;
                } else {
                    if (this.v > this.f38493w) {
                        this.h = dp2;
                        this.f38489f = AndroidUtilities.dp(14.0f) + ((this.E - i15) / 2);
                        float f19 = this.f38493w;
                        this.d = f19;
                        this.f38488e = f19;
                    } else {
                        this.f38489f = this.f38494x;
                        this.h = AndroidUtilities.dp(14.0f) + ((this.F - i14) / 2);
                        float f20 = this.v;
                        this.d = f20;
                        this.f38488e = f20;
                    }
                }
            } else {
                float f21 = this.v;
                this.f38489f = (f12 * f21) + this.f38494x;
                float f22 = this.f38493w;
                this.h = (f15 * f22) + dp2;
                this.d = f16 * f21;
                this.f38488e = f17 * f22;
            }
            invalidate();
        }
    }
}
