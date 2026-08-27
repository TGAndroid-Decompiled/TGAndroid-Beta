package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;

public final class lh0 extends Button {

    public final RectF f30382a;

    public final Paint f30383b;

    public boolean f30384c;
    public float d;

    public long f30385e;

    public int f30386f;

    public lh0(Context context) {
        super(context);
        setAllCaps(false);
        setTextSize(1, 14.0f);
        setTypeface(AndroidUtilities.bold());
        setOutlineProvider(null);
        h7.f6.a(this, 8.0f, 0.0f, 8.0f, 0.0f);
        int iDp = AndroidUtilities.dp(60.0f);
        setMinWidth(iDp);
        setMinimumWidth(iDp);
        this.f30382a = new RectF();
        Paint paint = new Paint(1);
        this.f30383b = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public final void a(boolean z10, boolean z11) {
        if (this.f30384c != z10) {
            this.f30384c = z10;
            if (!z11) {
                this.d = z10 ? 1.0f : 0.0f;
            }
            this.f30385e = System.currentTimeMillis();
            invalidate();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f30384c || this.d != 0.0f) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(11.0f);
            float f10 = measuredWidth;
            float fDp = AndroidUtilities.dp(3.0f);
            float fDp2 = AndroidUtilities.dp(8.0f) + measuredWidth;
            float fDp3 = AndroidUtilities.dp(11.0f);
            RectF rectF = this.f30382a;
            rectF.set(f10, fDp, fDp2, fDp3);
            int iMin = Math.min(255, (int) (this.d * 255.0f));
            Paint paint = this.f30383b;
            paint.setAlpha(iMin);
            canvas.drawArc(rectF, this.f30386f, 220.0f, false, paint);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (Math.abs(this.f30385e - System.currentTimeMillis()) < 1000) {
                long j10 = jCurrentTimeMillis - this.f30385e;
                int i10 = (int) (this.f30386f + ((360 * j10) / 2000.0f));
                this.f30386f = i10 - ((i10 / 360) * 360);
                if (this.f30384c) {
                    float f11 = this.d;
                    if (f11 < 1.0f) {
                        float f12 = (j10 / 200.0f) + f11;
                        this.d = f12;
                        if (f12 > 1.0f) {
                            this.d = 1.0f;
                        }
                    }
                } else {
                    float f13 = this.d;
                    if (f13 > 0.0f) {
                        float f14 = f13 - (j10 / 200.0f);
                        this.d = f14;
                        if (f14 < 0.0f) {
                            this.d = 0.0f;
                        }
                    }
                }
            }
            this.f30385e = jCurrentTimeMillis;
            postInvalidateOnAnimation();
        }
    }

    public void setProgressColor(int i10) {
        this.f30383b.setColor(i10);
    }
}
