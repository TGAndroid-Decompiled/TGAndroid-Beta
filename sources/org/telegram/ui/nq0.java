package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class nq0 extends FrameLayout {
    public int E;
    public int F;
    public boolean G;
    public final pq0 H;
    public final Paint f40451a;
    public final Paint f40452b;
    public final Paint f40453c;
    public float d;
    public float f40454e;
    public float f40455f;
    public float h;
    public int f40456n;
    public float f40457r;
    public float f40458s;
    public int v;
    public int f40459w;
    public int f40460x;
    public int f40461y;

    public nq0(pq0 pq0Var, Context context) {
        super(context);
        this.H = pq0Var;
        this.f40451a = null;
        this.f40452b = null;
        this.f40453c = null;
        this.d = 600.0f;
        this.f40454e = 600.0f;
        this.f40455f = -1.0f;
        this.h = -1.0f;
        this.f40456n = 0;
        this.f40457r = 0.0f;
        this.f40458s = 0.0f;
        Paint paint = new Paint();
        this.f40451a = paint;
        paint.setColor(1073412858);
        this.f40451a.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.f40451a.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.f40452b = paint2;
        paint2.setColor(-1);
        Paint paint3 = new Paint();
        this.f40453c = paint3;
        paint3.setColor(-939524096);
        setBackgroundColor(-13421773);
        setOnTouchListener(new e0(this, 4));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        pq0 pq0Var = this.H;
        BitmapDrawable bitmapDrawable = pq0Var.f41069b;
        if (bitmapDrawable != null) {
            try {
                int i12 = this.f40460x;
                int i13 = this.f40461y;
                bitmapDrawable.setBounds(i12, i13, this.v + i12, this.f40459w + i13);
                pq0Var.f41069b.draw(canvas);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        canvas.drawRect(this.f40460x, this.f40461y, i10 + this.v, this.h, this.f40453c);
        float f7 = this.h;
        canvas.drawRect(this.f40460x, f7, this.f40455f, f7 + this.f40454e, this.f40453c);
        float f10 = this.h;
        canvas.drawRect(this.f40455f + this.d, f10, this.f40460x + this.v, f10 + this.f40454e, this.f40453c);
        canvas.drawRect(this.f40460x, this.h + this.f40454e, i11 + this.v, this.f40461y + this.f40459w, this.f40453c);
        float f11 = this.f40455f;
        float f12 = this.h;
        canvas.drawRect(f11, f12, f11 + this.d, f12 + this.f40454e, this.f40451a);
        int dp = AndroidUtilities.dp(1.0f);
        float f13 = this.f40455f;
        float f14 = dp;
        float f15 = dp * 3;
        canvas.drawRect(f13 + f14, this.h + f14, f13 + f14 + AndroidUtilities.dp(20.0f), this.h + f15, this.f40452b);
        float f16 = this.f40455f;
        float f17 = this.h;
        canvas.drawRect(f16 + f14, f17 + f14, f16 + f15, f17 + f14 + AndroidUtilities.dp(20.0f), this.f40452b);
        float dp2 = ((this.f40455f + this.d) - f14) - AndroidUtilities.dp(20.0f);
        float f18 = this.h;
        canvas.drawRect(dp2, f18 + f14, (this.f40455f + this.d) - f14, f18 + f15, this.f40452b);
        float f19 = this.f40455f;
        float f20 = this.d;
        float f21 = this.h;
        canvas.drawRect((f19 + f20) - f15, f21 + f14, (f19 + f20) - f14, f21 + f14 + AndroidUtilities.dp(20.0f), this.f40452b);
        canvas.drawRect(this.f40455f + f14, ((this.h + this.f40454e) - f14) - AndroidUtilities.dp(20.0f), this.f40455f + f15, (this.h + this.f40454e) - f14, this.f40452b);
        float f22 = this.f40455f;
        canvas.drawRect(f22 + f14, (this.h + this.f40454e) - f15, f22 + f14 + AndroidUtilities.dp(20.0f), (this.h + this.f40454e) - f14, this.f40452b);
        float dp3 = ((this.f40455f + this.d) - f14) - AndroidUtilities.dp(20.0f);
        float f23 = this.h;
        float f24 = this.f40454e;
        canvas.drawRect(dp3, (f23 + f24) - f15, (this.f40455f + this.d) - f14, (f23 + f24) - f14, this.f40452b);
        canvas.drawRect((this.f40455f + this.d) - f15, ((this.h + this.f40454e) - f14) - AndroidUtilities.dp(20.0f), (this.f40455f + this.d) - f14, (this.h + this.f40454e) - f14, this.f40452b);
        for (int i14 = 1; i14 < 3; i14++) {
            float f25 = this.f40455f;
            float f26 = this.d;
            float f27 = i14;
            float f28 = this.h;
            canvas.drawRect(((f26 / 3.0f) * f27) + f25, f28 + f14, a1.g.e(f26, 3.0f, f27, f25 + f14), (f28 + this.f40454e) - f14, this.f40452b);
            float f29 = this.f40455f;
            float f30 = this.h;
            float f31 = this.f40454e;
            canvas.drawRect(f29 + f14, a1.g.e(f31, 3.0f, f27, f30), this.d + (f29 - f14), ((f31 / 3.0f) * f27) + f30 + f14, this.f40452b);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        pq0 pq0Var;
        Bitmap bitmap;
        float f7;
        int i14;
        int i15;
        super.onLayout(z10, i10, i11, i12, i13);
        this.E = (i12 - i10) - AndroidUtilities.dp(28.0f);
        int dp = (i13 - i11) - AndroidUtilities.dp(28.0f);
        this.F = dp;
        if (this.E != 0 && dp != 0 && (bitmap = (pq0Var = this.H).f41068a) != null) {
            float f10 = this.f40455f - this.f40460x;
            float f11 = this.v;
            float f12 = f10 / f11;
            float f13 = this.h - this.f40461y;
            float f14 = this.f40459w;
            float f15 = f13 / f14;
            float f16 = this.d / f11;
            float f17 = this.f40454e / f14;
            float width = bitmap.getWidth();
            float height = pq0Var.f41068a.getHeight();
            int i16 = this.E;
            float f18 = i16 / width;
            int i17 = this.F;
            if (f18 > i17 / height) {
                this.f40459w = i17;
                this.v = (int) Math.ceil(width * f7);
            } else {
                this.v = i16;
                this.f40459w = (int) Math.ceil(height * f18);
            }
            this.f40460x = AndroidUtilities.dp(14.0f) + ((this.E - this.v) / 2);
            int dp2 = AndroidUtilities.dp(14.0f) + ((this.F - this.f40459w) / 2);
            this.f40461y = dp2;
            if (this.f40455f == -1.0f && this.h == -1.0f) {
                if (this.G) {
                    this.h = dp2;
                    this.f40455f = this.f40460x;
                    this.d = this.v;
                    this.f40454e = this.f40459w;
                } else {
                    if (this.v > this.f40459w) {
                        this.h = dp2;
                        this.f40455f = AndroidUtilities.dp(14.0f) + ((this.E - i15) / 2);
                        float f19 = this.f40459w;
                        this.d = f19;
                        this.f40454e = f19;
                    } else {
                        this.f40455f = this.f40460x;
                        this.h = AndroidUtilities.dp(14.0f) + ((this.F - i14) / 2);
                        float f20 = this.v;
                        this.d = f20;
                        this.f40454e = f20;
                    }
                }
            } else {
                float f21 = this.v;
                this.f40455f = (f12 * f21) + this.f40460x;
                float f22 = this.f40459w;
                this.h = (f15 * f22) + dp2;
                this.d = f16 * f21;
                this.f40454e = f17 * f22;
            }
            invalidate();
        }
    }
}
