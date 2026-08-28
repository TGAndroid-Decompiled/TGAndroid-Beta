package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class jp0 extends FrameLayout {
    public int A;
    public int B;
    public boolean C;
    public final lp0 D;
    public final Paint f39540a;
    public final Paint f39541b;
    public final Paint f39542c;
    public float d;
    public float f39543e;
    public float f39544f;
    public float h;
    public int f39545n;
    public float f39546r;
    public float f39547s;
    public int v;
    public int f39548w;
    public int f39549x;
    public int f39550y;

    public jp0(lp0 lp0Var, Context context) {
        super(context);
        this.D = lp0Var;
        this.f39540a = null;
        this.f39541b = null;
        this.f39542c = null;
        this.d = 600.0f;
        this.f39543e = 600.0f;
        this.f39544f = -1.0f;
        this.h = -1.0f;
        this.f39545n = 0;
        this.f39546r = 0.0f;
        this.f39547s = 0.0f;
        Paint paint = new Paint();
        this.f39540a = paint;
        paint.setColor(1073412858);
        this.f39540a.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.f39540a.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.f39541b = paint2;
        paint2.setColor(-1);
        Paint paint3 = new Paint();
        this.f39542c = paint3;
        paint3.setColor(-939524096);
        setBackgroundColor(-13421773);
        setOnTouchListener(new f0(this, 4));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i9;
        int i10;
        lp0 lp0Var = this.D;
        BitmapDrawable bitmapDrawable = lp0Var.f40205b;
        if (bitmapDrawable != null) {
            try {
                int i11 = this.f39549x;
                int i12 = this.f39550y;
                bitmapDrawable.setBounds(i11, i12, this.v + i11, this.f39548w + i12);
                lp0Var.f40205b.draw(canvas);
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        canvas.drawRect(this.f39549x, this.f39550y, i9 + this.v, this.h, this.f39542c);
        float f10 = this.h;
        canvas.drawRect(this.f39549x, f10, this.f39544f, f10 + this.f39543e, this.f39542c);
        float f11 = this.h;
        canvas.drawRect(this.f39544f + this.d, f11, this.f39549x + this.v, f11 + this.f39543e, this.f39542c);
        canvas.drawRect(this.f39549x, this.h + this.f39543e, i10 + this.v, this.f39550y + this.f39548w, this.f39542c);
        float f12 = this.f39544f;
        float f13 = this.h;
        canvas.drawRect(f12, f13, f12 + this.d, f13 + this.f39543e, this.f39540a);
        int dp = AndroidUtilities.dp(1.0f);
        float f14 = this.f39544f;
        float f15 = dp;
        float f16 = dp * 3;
        canvas.drawRect(f14 + f15, this.h + f15, f14 + f15 + AndroidUtilities.dp(20.0f), this.h + f16, this.f39541b);
        float f17 = this.f39544f;
        float f18 = this.h;
        canvas.drawRect(f17 + f15, f18 + f15, f17 + f16, f18 + f15 + AndroidUtilities.dp(20.0f), this.f39541b);
        float dp2 = ((this.f39544f + this.d) - f15) - AndroidUtilities.dp(20.0f);
        float f19 = this.h;
        canvas.drawRect(dp2, f19 + f15, (this.f39544f + this.d) - f15, f19 + f16, this.f39541b);
        float f20 = this.f39544f;
        float f21 = this.d;
        float f22 = this.h;
        canvas.drawRect((f20 + f21) - f16, f22 + f15, (f20 + f21) - f15, f22 + f15 + AndroidUtilities.dp(20.0f), this.f39541b);
        canvas.drawRect(this.f39544f + f15, ((this.h + this.f39543e) - f15) - AndroidUtilities.dp(20.0f), this.f39544f + f16, (this.h + this.f39543e) - f15, this.f39541b);
        float f23 = this.f39544f;
        canvas.drawRect(f23 + f15, (this.h + this.f39543e) - f16, f23 + f15 + AndroidUtilities.dp(20.0f), (this.h + this.f39543e) - f15, this.f39541b);
        float dp3 = ((this.f39544f + this.d) - f15) - AndroidUtilities.dp(20.0f);
        float f24 = this.h;
        float f25 = this.f39543e;
        canvas.drawRect(dp3, (f24 + f25) - f16, (this.f39544f + this.d) - f15, (f24 + f25) - f15, this.f39541b);
        canvas.drawRect((this.f39544f + this.d) - f16, ((this.h + this.f39543e) - f15) - AndroidUtilities.dp(20.0f), (this.f39544f + this.d) - f15, (this.h + this.f39543e) - f15, this.f39541b);
        for (int i13 = 1; i13 < 3; i13++) {
            float f26 = this.f39544f;
            float f27 = this.d;
            float f28 = i13;
            float f29 = this.h;
            canvas.drawRect(((f27 / 3.0f) * f28) + f26, f29 + f15, org.telegram.ui.Cells.j2.b(f27, 3.0f, f28, f26 + f15), (f29 + this.f39543e) - f15, this.f39541b);
            float f30 = this.f39544f;
            float f31 = this.h;
            float f32 = this.f39543e;
            canvas.drawRect(f30 + f15, org.telegram.ui.Cells.j2.b(f32, 3.0f, f28, f31), this.d + (f30 - f15), ((f32 / 3.0f) * f28) + f31 + f15, this.f39541b);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        lp0 lp0Var;
        Bitmap bitmap;
        float f10;
        int i13;
        int i14;
        super.onLayout(z10, i9, i10, i11, i12);
        this.A = (i11 - i9) - AndroidUtilities.dp(28.0f);
        int dp = (i12 - i10) - AndroidUtilities.dp(28.0f);
        this.B = dp;
        if (this.A != 0 && dp != 0 && (bitmap = (lp0Var = this.D).f40204a) != null) {
            float f11 = this.f39544f - this.f39549x;
            float f12 = this.v;
            float f13 = f11 / f12;
            float f14 = this.h - this.f39550y;
            float f15 = this.f39548w;
            float f16 = f14 / f15;
            float f17 = this.d / f12;
            float f18 = this.f39543e / f15;
            float width = bitmap.getWidth();
            float height = lp0Var.f40204a.getHeight();
            int i15 = this.A;
            float f19 = i15 / width;
            int i16 = this.B;
            if (f19 > i16 / height) {
                this.f39548w = i16;
                this.v = (int) Math.ceil(width * f10);
            } else {
                this.v = i15;
                this.f39548w = (int) Math.ceil(height * f19);
            }
            this.f39549x = AndroidUtilities.dp(14.0f) + ((this.A - this.v) / 2);
            int dp2 = AndroidUtilities.dp(14.0f) + ((this.B - this.f39548w) / 2);
            this.f39550y = dp2;
            if (this.f39544f == -1.0f && this.h == -1.0f) {
                if (this.C) {
                    this.h = dp2;
                    this.f39544f = this.f39549x;
                    this.d = this.v;
                    this.f39543e = this.f39548w;
                } else {
                    if (this.v > this.f39548w) {
                        this.h = dp2;
                        this.f39544f = AndroidUtilities.dp(14.0f) + ((this.A - i14) / 2);
                        float f20 = this.f39548w;
                        this.d = f20;
                        this.f39543e = f20;
                    } else {
                        this.f39544f = this.f39549x;
                        this.h = AndroidUtilities.dp(14.0f) + ((this.B - i13) / 2);
                        float f21 = this.v;
                        this.d = f21;
                        this.f39543e = f21;
                    }
                }
            } else {
                float f22 = this.v;
                this.f39544f = (f13 * f22) + this.f39549x;
                float f23 = this.f39548w;
                this.h = (f16 * f23) + dp2;
                this.d = f17 * f22;
                this.f39543e = f18 * f23;
            }
            invalidate();
        }
    }
}
