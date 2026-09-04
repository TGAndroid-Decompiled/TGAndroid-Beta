package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
public final class xh0 extends Button {
    public final RectF f32543a;
    public final Paint f32544b;
    public boolean f32545c;
    public float d;
    public long f32546e;
    public int f32547f;

    public xh0(Context context) {
        super(context);
        setAllCaps(false);
        setTextSize(1, 14.0f);
        setTypeface(AndroidUtilities.bold());
        setOutlineProvider(null);
        w7.d6.a(this, 8.0f, 0.0f, 8.0f, 0.0f);
        int dp = AndroidUtilities.dp(60.0f);
        setMinWidth(dp);
        setMinimumWidth(dp);
        this.f32543a = new RectF();
        Paint paint = new Paint(1);
        this.f32544b = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public final void a(boolean z10, boolean z11) {
        float f7;
        if (this.f32545c != z10) {
            this.f32545c = z10;
            if (!z11) {
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                this.d = f7;
            }
            this.f32546e = System.currentTimeMillis();
            invalidate();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f32545c && this.d == 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(11.0f);
        RectF rectF = this.f32543a;
        rectF.set(measuredWidth, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f) + measuredWidth, AndroidUtilities.dp(11.0f));
        int min = Math.min(255, (int) (this.d * 255.0f));
        Paint paint = this.f32544b;
        paint.setAlpha(min);
        canvas.drawArc(rectF, this.f32547f, 220.0f, false, paint);
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(this.f32546e - System.currentTimeMillis()) < 1000) {
            long j3 = currentTimeMillis - this.f32546e;
            int i10 = (int) (this.f32547f + (((float) (360 * j3)) / 2000.0f));
            this.f32547f = i10 - ((i10 / 360) * 360);
            if (this.f32545c) {
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
        this.f32546e = currentTimeMillis;
        postInvalidateOnAnimation();
    }

    public void setProgressColor(int i10) {
        this.f32544b.setColor(i10);
    }
}
