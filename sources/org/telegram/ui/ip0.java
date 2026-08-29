package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ip0 extends FrameLayout {
    public int A;
    public int B;
    public boolean C;
    public final kp0 D;
    public final Paint f39304a;
    public final Paint f39305b;
    public final Paint f39306c;
    public float d;
    public float f39307e;
    public float f39308f;
    public float h;
    public int f39309n;
    public float f39310r;
    public float f39311s;
    public int v;
    public int f39312w;
    public int f39313x;
    public int f39314y;

    public ip0(kp0 kp0Var, Context context) {
        super(context);
        this.D = kp0Var;
        this.f39304a = null;
        this.f39305b = null;
        this.f39306c = null;
        this.d = 600.0f;
        this.f39307e = 600.0f;
        this.f39308f = -1.0f;
        this.h = -1.0f;
        this.f39309n = 0;
        this.f39310r = 0.0f;
        this.f39311s = 0.0f;
        Paint paint = new Paint();
        this.f39304a = paint;
        paint.setColor(1073412858);
        this.f39304a.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.f39304a.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.f39305b = paint2;
        paint2.setColor(-1);
        Paint paint3 = new Paint();
        this.f39306c = paint3;
        paint3.setColor(-939524096);
        setBackgroundColor(-13421773);
        setOnTouchListener(new g0(this, 4));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        kp0 kp0Var = this.D;
        BitmapDrawable bitmapDrawable = kp0Var.f39989b;
        if (bitmapDrawable != null) {
            try {
                int i12 = this.f39313x;
                int i13 = this.f39314y;
                bitmapDrawable.setBounds(i12, i13, this.v + i12, this.f39312w + i13);
                kp0Var.f39989b.draw(canvas);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        canvas.drawRect(this.f39313x, this.f39314y, i10 + this.v, this.h, this.f39306c);
        float f9 = this.h;
        canvas.drawRect(this.f39313x, f9, this.f39308f, f9 + this.f39307e, this.f39306c);
        float f10 = this.h;
        canvas.drawRect(this.f39308f + this.d, f10, this.f39313x + this.v, f10 + this.f39307e, this.f39306c);
        canvas.drawRect(this.f39313x, this.h + this.f39307e, i11 + this.v, this.f39314y + this.f39312w, this.f39306c);
        float f11 = this.f39308f;
        float f12 = this.h;
        canvas.drawRect(f11, f12, f11 + this.d, f12 + this.f39307e, this.f39304a);
        int dp = AndroidUtilities.dp(1.0f);
        float f13 = this.f39308f;
        float f14 = dp;
        float f15 = dp * 3;
        canvas.drawRect(f13 + f14, this.h + f14, f13 + f14 + AndroidUtilities.dp(20.0f), this.h + f15, this.f39305b);
        float f16 = this.f39308f;
        float f17 = this.h;
        canvas.drawRect(f16 + f14, f17 + f14, f16 + f15, f17 + f14 + AndroidUtilities.dp(20.0f), this.f39305b);
        float dp2 = ((this.f39308f + this.d) - f14) - AndroidUtilities.dp(20.0f);
        float f18 = this.h;
        canvas.drawRect(dp2, f18 + f14, (this.f39308f + this.d) - f14, f18 + f15, this.f39305b);
        float f19 = this.f39308f;
        float f20 = this.d;
        float f21 = this.h;
        canvas.drawRect((f19 + f20) - f15, f21 + f14, (f19 + f20) - f14, f21 + f14 + AndroidUtilities.dp(20.0f), this.f39305b);
        canvas.drawRect(this.f39308f + f14, ((this.h + this.f39307e) - f14) - AndroidUtilities.dp(20.0f), this.f39308f + f15, (this.h + this.f39307e) - f14, this.f39305b);
        float f22 = this.f39308f;
        canvas.drawRect(f22 + f14, (this.h + this.f39307e) - f15, f22 + f14 + AndroidUtilities.dp(20.0f), (this.h + this.f39307e) - f14, this.f39305b);
        float dp3 = ((this.f39308f + this.d) - f14) - AndroidUtilities.dp(20.0f);
        float f23 = this.h;
        float f24 = this.f39307e;
        canvas.drawRect(dp3, (f23 + f24) - f15, (this.f39308f + this.d) - f14, (f23 + f24) - f14, this.f39305b);
        canvas.drawRect((this.f39308f + this.d) - f15, ((this.h + this.f39307e) - f14) - AndroidUtilities.dp(20.0f), (this.f39308f + this.d) - f14, (this.h + this.f39307e) - f14, this.f39305b);
        for (int i14 = 1; i14 < 3; i14++) {
            float f25 = this.f39308f;
            float f26 = this.d;
            float f27 = i14;
            float f28 = this.h;
            canvas.drawRect(((f26 / 3.0f) * f27) + f25, f28 + f14, u3.c.c(f26, 3.0f, f27, f25 + f14), (f28 + this.f39307e) - f14, this.f39305b);
            float f29 = this.f39308f;
            float f30 = this.h;
            float f31 = this.f39307e;
            canvas.drawRect(f29 + f14, u3.c.c(f31, 3.0f, f27, f30), this.d + (f29 - f14), ((f31 / 3.0f) * f27) + f30 + f14, this.f39305b);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        kp0 kp0Var;
        Bitmap bitmap;
        float f9;
        int i14;
        int i15;
        super.onLayout(z10, i10, i11, i12, i13);
        this.A = (i12 - i10) - AndroidUtilities.dp(28.0f);
        int dp = (i13 - i11) - AndroidUtilities.dp(28.0f);
        this.B = dp;
        if (this.A != 0 && dp != 0 && (bitmap = (kp0Var = this.D).f39988a) != null) {
            float f10 = this.f39308f - this.f39313x;
            float f11 = this.v;
            float f12 = f10 / f11;
            float f13 = this.h - this.f39314y;
            float f14 = this.f39312w;
            float f15 = f13 / f14;
            float f16 = this.d / f11;
            float f17 = this.f39307e / f14;
            float width = bitmap.getWidth();
            float height = kp0Var.f39988a.getHeight();
            int i16 = this.A;
            float f18 = i16 / width;
            int i17 = this.B;
            if (f18 > i17 / height) {
                this.f39312w = i17;
                this.v = (int) Math.ceil(width * f9);
            } else {
                this.v = i16;
                this.f39312w = (int) Math.ceil(height * f18);
            }
            this.f39313x = AndroidUtilities.dp(14.0f) + ((this.A - this.v) / 2);
            int dp2 = AndroidUtilities.dp(14.0f) + ((this.B - this.f39312w) / 2);
            this.f39314y = dp2;
            if (this.f39308f == -1.0f && this.h == -1.0f) {
                if (this.C) {
                    this.h = dp2;
                    this.f39308f = this.f39313x;
                    this.d = this.v;
                    this.f39307e = this.f39312w;
                } else {
                    if (this.v > this.f39312w) {
                        this.h = dp2;
                        this.f39308f = AndroidUtilities.dp(14.0f) + ((this.A - i15) / 2);
                        float f19 = this.f39312w;
                        this.d = f19;
                        this.f39307e = f19;
                    } else {
                        this.f39308f = this.f39313x;
                        this.h = AndroidUtilities.dp(14.0f) + ((this.B - i14) / 2);
                        float f20 = this.v;
                        this.d = f20;
                        this.f39307e = f20;
                    }
                }
            } else {
                float f21 = this.v;
                this.f39308f = (f12 * f21) + this.f39313x;
                float f22 = this.f39312w;
                this.h = (f15 * f22) + dp2;
                this.d = f16 * f21;
                this.f39307e = f17 * f22;
            }
            invalidate();
        }
    }
}
