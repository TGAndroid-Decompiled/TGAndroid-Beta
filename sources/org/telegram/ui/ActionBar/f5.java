package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public class f5 extends Drawable {
    public final Paint f19684a;
    public final Paint f19685b;
    public boolean f19686c;
    public long d;
    public float e;
    public float f19687f;
    public int f19688g;
    public boolean h;
    public final DecelerateInterpolator f19689i;
    public int f19690j;
    public int f19691k;
    public boolean f19692l;
    public float f19693m;
    public boolean f19694n;
    public int f19695o;

    public f5() {
        Paint paint = new Paint(1);
        this.f19684a = paint;
        Paint paint2 = new Paint(1);
        this.f19685b = paint2;
        this.h = true;
        this.f19689i = new DecelerateInterpolator();
        new RectF();
        this.f19695o = 255;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeWidth(AndroidUtilities.density * 1.66f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        this.f19693m = 1.0f;
    }

    public final void a(float f10, boolean z4) {
        this.d = 0L;
        float f11 = this.f19687f;
        if (f11 == 1.0f) {
            this.f19686c = true;
        } else if (f11 == 0.0f) {
            this.f19686c = false;
        }
        this.d = 0L;
        if (z4) {
            if (f11 < f10) {
                this.f19688g = (int) (f11 * 200.0f);
            } else {
                this.f19688g = (int) ((1.0f - f11) * 200.0f);
            }
            this.d = SystemClock.elapsedRealtime();
            this.e = f10;
        } else {
            this.f19687f = f10;
            this.e = f10;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        float abs;
        float dp;
        float abs2;
        float abs3;
        int i11;
        float f10;
        float f11;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.d;
        long j11 = elapsedRealtime - j10;
        float f12 = this.f19687f;
        float f13 = this.e;
        if (f12 != f13) {
            if (j10 != 0) {
                int i12 = (int) (this.f19688g + j11);
                this.f19688g = i12;
                if (i12 >= 200) {
                    this.f19687f = f13;
                } else {
                    DecelerateInterpolator decelerateInterpolator = this.f19689i;
                    if (f12 < f13) {
                        this.f19687f = decelerateInterpolator.getInterpolation(i12 / 200.0f) * this.e;
                    } else {
                        this.f19687f = 1.0f - decelerateInterpolator.getInterpolation(i12 / 200.0f);
                    }
                }
            }
            invalidateSelf();
        }
        float f14 = this.f19693m;
        if (f14 < 1.0f) {
            float f15 = (((float) j11) / 200.0f) + f14;
            this.f19693m = f15;
            if (f15 > 1.0f) {
                this.f19693m = 1.0f;
            }
            invalidateSelf();
        }
        this.d = elapsedRealtime;
        canvas.save();
        canvas.translate(((AndroidUtilities.dp(24.0f) / 2) - AndroidUtilities.dp(9.0f)) - (AndroidUtilities.dp(1.0f) * this.f19687f), AndroidUtilities.dp(24.0f) / 2);
        int i13 = this.f19690j;
        if (i13 == 0) {
            i13 = j6.w0(null, j6.f20227v8, false);
        }
        int i14 = this.f19691k;
        if (i14 == 0) {
            i14 = j6.w0(null, j6.f20176s8, false);
        }
        boolean z4 = this.h;
        Paint paint = this.f19684a;
        if (z4) {
            float f16 = this.f19687f;
            if (this.f19686c) {
                i11 = -180;
            } else {
                i11 = 180;
            }
            canvas.rotate(f16 * i11, AndroidUtilities.dp(9.0f), 0.0f);
            paint.setColor(i13);
            paint.setAlpha(this.f19695o);
            if (this.f19692l) {
                float dp2 = AndroidUtilities.dp(0.5f) * this.f19687f;
                f10 = e2.c.w(1.0f, this.f19687f, paint.getStrokeWidth() / 2.0f, dp2);
            } else {
                f10 = 0.0f;
            }
            float dp3 = (AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(3.0f) * this.f19687f)) - 0.0f;
            if (this.f19692l) {
                f11 = (1.0f - this.f19687f) * (paint.getStrokeWidth() / 2.0f);
            } else {
                f11 = 0.0f;
            }
            canvas.drawLine(f10, 0.0f, dp3 - f11, 0.0f, paint);
            abs = ((1.0f - Math.abs(this.f19687f)) * AndroidUtilities.dp(5.0f)) - (Math.abs(this.f19687f) * AndroidUtilities.dp(0.5f));
            dp = AndroidUtilities.dp(18.0f) - (Math.abs(this.f19687f) * AndroidUtilities.dp(2.5f));
            abs2 = (Math.abs(this.f19687f) * AndroidUtilities.dp(2.0f)) + AndroidUtilities.dp(5.0f);
            abs3 = Math.abs(this.f19687f) * AndroidUtilities.dp(7.5f);
            if (this.f19692l) {
                abs3 = e2.c.w(1.0f, this.f19687f, paint.getStrokeWidth() / 2.0f, abs3);
                float dp4 = (AndroidUtilities.dp(0.5f) * this.f19687f) + abs;
                dp -= ((1.0f - this.f19687f) * (paint.getStrokeWidth() / 2.0f)) + (AndroidUtilities.dp(0.5f) * this.f19687f);
                abs2 -= AndroidUtilities.dp(0.25f) * this.f19687f;
                abs = (AndroidUtilities.dp(0.25f) * this.f19687f) + dp4;
            }
        } else {
            float f17 = this.f19687f;
            if (this.f19686c) {
                i10 = -225;
            } else {
                i10 = 135;
            }
            canvas.rotate(f17 * i10, AndroidUtilities.dp(9.0f), 0.0f);
            if (this.f19694n) {
                paint.setColor(i13);
                paint.setAlpha(this.f19695o);
                canvas.drawLine((AndroidUtilities.dp(1.0f) * this.f19687f) + ((1.0f - Math.abs(this.f19687f)) * AndroidUtilities.dpf2(2.0f)), 0.0f, ((AndroidUtilities.dp(17.0f) * this.f19687f) + ((1.0f - this.f19687f) * AndroidUtilities.dpf2(16.0f))) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f19687f)) * AndroidUtilities.dpf2(5.0f)) - (Math.abs(this.f19687f) * AndroidUtilities.dpf2(0.5f));
                dp = (Math.abs(this.f19687f) * AndroidUtilities.dpf2(9.0f)) + ((1.0f - Math.abs(this.f19687f)) * AndroidUtilities.dpf2(16.0f));
                abs2 = (Math.abs(this.f19687f) * AndroidUtilities.dpf2(3.0f)) + AndroidUtilities.dpf2(5.0f);
                abs3 = (Math.abs(this.f19687f) * AndroidUtilities.dpf2(7.0f)) + AndroidUtilities.dpf2(2.0f);
            } else {
                int w02 = j6.w0(null, j6.f20283y8, false);
                AndroidUtilities.getOffsetColor(i14, j6.w0(null, j6.f20246w8, false), this.f19687f, 1.0f);
                paint.setColor(AndroidUtilities.getOffsetColor(i13, w02, this.f19687f, 1.0f));
                paint.setAlpha(this.f19695o);
                canvas.drawLine(this.f19687f * AndroidUtilities.dp(1.0f), 0.0f, (AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(1.0f) * this.f19687f)) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f19687f)) * AndroidUtilities.dp(5.0f)) - (Math.abs(this.f19687f) * AndroidUtilities.dp(0.5f));
                dp = AndroidUtilities.dp(18.0f) - (Math.abs(this.f19687f) * AndroidUtilities.dp(9.0f));
                abs2 = (Math.abs(this.f19687f) * AndroidUtilities.dp(3.0f)) + AndroidUtilities.dp(5.0f);
                abs3 = Math.abs(this.f19687f) * AndroidUtilities.dp(9.0f);
            }
        }
        float f18 = dp;
        float f19 = abs3;
        float f20 = abs2;
        float f21 = abs;
        if (this.f19694n) {
            canvas.drawLine(f19, -f20, f18, -f21, paint);
            canvas.drawLine(f19, f20, f18, f21, paint);
        } else {
            canvas.drawLine(f19, -f20, f18 - 0.0f, -f21, paint);
            canvas.drawLine(f19, f20, f18, f21, paint);
        }
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.f19695o != i10) {
            this.f19695o = i10;
            this.f19684a.setAlpha(i10);
            this.f19685b.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
