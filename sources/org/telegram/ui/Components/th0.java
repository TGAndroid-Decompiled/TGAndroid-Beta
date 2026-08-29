package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
public final class th0 extends Button {
    public final RectF f32957a;
    public final Paint f32958b;
    public boolean f32959c;
    public float d;
    public long f32960e;
    public int f32961f;

    public th0(Context context) {
        super(context);
        setAllCaps(false);
        setTextSize(1, 14.0f);
        setTypeface(AndroidUtilities.bold());
        setOutlineProvider(null);
        i7.l6.a(this, 8.0f, 0.0f, 8.0f, 0.0f);
        int dp = AndroidUtilities.dp(60.0f);
        setMinWidth(dp);
        setMinimumWidth(dp);
        this.f32957a = new RectF();
        Paint paint = new Paint(1);
        this.f32958b = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public final void a(boolean z10, boolean z11) {
        float f9;
        if (this.f32959c != z10) {
            this.f32959c = z10;
            if (!z11) {
                if (z10) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                this.d = f9;
            }
            this.f32960e = System.currentTimeMillis();
            invalidate();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f32959c && this.d == 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(11.0f);
        RectF rectF = this.f32957a;
        rectF.set(measuredWidth, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f) + measuredWidth, AndroidUtilities.dp(11.0f));
        int min = Math.min(255, (int) (this.d * 255.0f));
        Paint paint = this.f32958b;
        paint.setAlpha(min);
        canvas.drawArc(rectF, this.f32961f, 220.0f, false, paint);
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(this.f32960e - System.currentTimeMillis()) < 1000) {
            long j10 = currentTimeMillis - this.f32960e;
            int i10 = (int) (this.f32961f + (((float) (360 * j10)) / 2000.0f));
            this.f32961f = i10 - ((i10 / 360) * 360);
            if (this.f32959c) {
                float f9 = this.d;
                if (f9 < 1.0f) {
                    float f10 = (((float) j10) / 200.0f) + f9;
                    this.d = f10;
                    if (f10 > 1.0f) {
                        this.d = 1.0f;
                    }
                }
            } else {
                float f11 = this.d;
                if (f11 > 0.0f) {
                    float f12 = f11 - (((float) j10) / 200.0f);
                    this.d = f12;
                    if (f12 < 0.0f) {
                        this.d = 0.0f;
                    }
                }
            }
        }
        this.f32960e = currentTimeMillis;
        postInvalidateOnAnimation();
    }

    public void setProgressColor(int i10) {
        this.f32958b.setColor(i10);
    }
}
