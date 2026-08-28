package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
public final class jh0 extends Button {
    public final RectF f29737a;
    public final Paint f29738b;
    public boolean f29739c;
    public float d;
    public long f29740e;
    public int f29741f;

    public jh0(Context context) {
        super(context);
        setAllCaps(false);
        setTextSize(1, 14.0f);
        setTypeface(AndroidUtilities.bold());
        setOutlineProvider(null);
        g7.k6.a(this, 8.0f, 0.0f, 8.0f, 0.0f);
        int dp = AndroidUtilities.dp(60.0f);
        setMinWidth(dp);
        setMinimumWidth(dp);
        this.f29737a = new RectF();
        Paint paint = new Paint(1);
        this.f29738b = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public final void a(boolean z10, boolean z11) {
        float f10;
        if (this.f29739c != z10) {
            this.f29739c = z10;
            if (!z11) {
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.d = f10;
            }
            this.f29740e = System.currentTimeMillis();
            invalidate();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f29739c && this.d == 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(11.0f);
        RectF rectF = this.f29737a;
        rectF.set(measuredWidth, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f) + measuredWidth, AndroidUtilities.dp(11.0f));
        int min = Math.min(255, (int) (this.d * 255.0f));
        Paint paint = this.f29738b;
        paint.setAlpha(min);
        canvas.drawArc(rectF, this.f29741f, 220.0f, false, paint);
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(this.f29740e - System.currentTimeMillis()) < 1000) {
            long j10 = currentTimeMillis - this.f29740e;
            int i9 = (int) (this.f29741f + (((float) (360 * j10)) / 2000.0f));
            this.f29741f = i9 - ((i9 / 360) * 360);
            if (this.f29739c) {
                float f10 = this.d;
                if (f10 < 1.0f) {
                    float f11 = (((float) j10) / 200.0f) + f10;
                    this.d = f11;
                    if (f11 > 1.0f) {
                        this.d = 1.0f;
                    }
                }
            } else {
                float f12 = this.d;
                if (f12 > 0.0f) {
                    float f13 = f12 - (((float) j10) / 200.0f);
                    this.d = f13;
                    if (f13 < 0.0f) {
                        this.d = 0.0f;
                    }
                }
            }
        }
        this.f29740e = currentTimeMillis;
        postInvalidateOnAnimation();
    }

    public void setProgressColor(int i9) {
        this.f29738b.setColor(i9);
    }
}
