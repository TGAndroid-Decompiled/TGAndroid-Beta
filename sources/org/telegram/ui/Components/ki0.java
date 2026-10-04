package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
public final class ki0 extends Button {
    public final RectF f28117a;
    public final Paint f28118b;
    public boolean f28119c;
    public float d;
    public long f28120e;
    public int f28121f;

    public ki0(Context context) {
        super(context);
        setAllCaps(false);
        setTextSize(1, 14.0f);
        setTypeface(AndroidUtilities.bold());
        setOutlineProvider(null);
        w7.f6.a(this, 8.0f, 0.0f, 8.0f, 0.0f);
        int dp = AndroidUtilities.dp(60.0f);
        setMinWidth(dp);
        setMinimumWidth(dp);
        this.f28117a = new RectF();
        Paint paint = new Paint(1);
        this.f28118b = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public final void a(boolean z10, boolean z11) {
        float f7;
        if (this.f28119c != z10) {
            this.f28119c = z10;
            if (!z11) {
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                this.d = f7;
            }
            this.f28120e = System.currentTimeMillis();
            invalidate();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f28119c && this.d == 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(11.0f);
        RectF rectF = this.f28117a;
        rectF.set(measuredWidth, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f) + measuredWidth, AndroidUtilities.dp(11.0f));
        int min = Math.min(255, (int) (this.d * 255.0f));
        Paint paint = this.f28118b;
        paint.setAlpha(min);
        canvas.drawArc(rectF, this.f28121f, 220.0f, false, paint);
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(this.f28120e - System.currentTimeMillis()) < 1000) {
            long j3 = currentTimeMillis - this.f28120e;
            int i10 = (int) (this.f28121f + (((float) (360 * j3)) / 2000.0f));
            this.f28121f = i10 - ((i10 / 360) * 360);
            if (this.f28119c) {
                float f7 = this.d;
                if (f7 < 1.0f) {
                    float f10 = (((float) j3) / 200.0f) + f7;
                    this.d = f10;
                    if (f10 > 1.0f) {
                        this.d = 1.0f;
                    }
                }
            } else {
                float f11 = this.d;
                if (f11 > 0.0f) {
                    float f12 = f11 - (((float) j3) / 200.0f);
                    this.d = f12;
                    if (f12 < 0.0f) {
                        this.d = 0.0f;
                    }
                }
            }
        }
        this.f28120e = currentTimeMillis;
        postInvalidateOnAnimation();
    }

    public void setProgressColor(int i10) {
        this.f28118b.setColor(i10);
    }
}
