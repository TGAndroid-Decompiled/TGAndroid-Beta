package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public class i5 extends Drawable {
    public final Paint f20952a;
    public final Paint f20953b;
    public boolean f20954c;
    public long d;
    public float e;
    public float f20955f;
    public int f20956g;
    public boolean h;
    public final DecelerateInterpolator f20957i;
    public int f20958j;
    public int f20959k;
    public boolean f20960l;
    public float f20961m;
    public boolean f20962n;
    public int f20963o;

    public i5() {
        Paint paint = new Paint(1);
        this.f20952a = paint;
        Paint paint2 = new Paint(1);
        this.f20953b = paint2;
        this.h = true;
        this.f20957i = new DecelerateInterpolator();
        new RectF();
        this.f20963o = 255;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeWidth(AndroidUtilities.density * 1.66f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        this.f20961m = 1.0f;
    }

    public final void a(float f7, boolean z10) {
        this.d = 0L;
        float f10 = this.f20955f;
        if (f10 == 1.0f) {
            this.f20954c = true;
        } else if (f10 == 0.0f) {
            this.f20954c = false;
        }
        this.d = 0L;
        if (z10) {
            if (f10 < f7) {
                this.f20956g = (int) (f10 * 200.0f);
            } else {
                this.f20956g = (int) ((1.0f - f10) * 200.0f);
            }
            this.d = SystemClock.elapsedRealtime();
            this.e = f7;
        } else {
            this.f20955f = f7;
            this.e = f7;
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
        float f7;
        float f10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.d;
        long j11 = elapsedRealtime - j10;
        float f11 = this.f20955f;
        float f12 = this.e;
        if (f11 != f12) {
            if (j10 != 0) {
                int i12 = (int) (this.f20956g + j11);
                this.f20956g = i12;
                if (i12 >= 200) {
                    this.f20955f = f12;
                } else {
                    int i13 = (f11 > f12 ? 1 : (f11 == f12 ? 0 : -1));
                    DecelerateInterpolator decelerateInterpolator = this.f20957i;
                    if (i13 < 0) {
                        this.f20955f = decelerateInterpolator.getInterpolation(i12 / 200.0f) * this.e;
                    } else {
                        this.f20955f = 1.0f - decelerateInterpolator.getInterpolation(i12 / 200.0f);
                    }
                }
            }
            invalidateSelf();
        }
        float f13 = this.f20961m;
        if (f13 < 1.0f) {
            float f14 = (((float) j11) / 200.0f) + f13;
            this.f20961m = f14;
            if (f14 > 1.0f) {
                this.f20961m = 1.0f;
            }
            invalidateSelf();
        }
        this.d = elapsedRealtime;
        canvas.save();
        canvas.translate(((AndroidUtilities.dp(24.0f) / 2) - AndroidUtilities.dp(9.0f)) - (AndroidUtilities.dp(1.0f) * this.f20955f), AndroidUtilities.dp(24.0f) / 2);
        int i14 = this.f20958j;
        if (i14 == 0) {
            i14 = k6.x0(null, k6.f21518v8, false);
        }
        int i15 = this.f20959k;
        if (i15 == 0) {
            i15 = k6.x0(null, k6.f21462s8, false);
        }
        boolean z10 = this.h;
        Paint paint = this.f20952a;
        if (z10) {
            float f15 = this.f20955f;
            if (this.f20954c) {
                i11 = -180;
            } else {
                i11 = 180;
            }
            canvas.rotate(f15 * i11, AndroidUtilities.dp(9.0f), 0.0f);
            paint.setColor(i14);
            paint.setAlpha(this.f20963o);
            if (this.f20960l) {
                f7 = com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f20955f, paint.getStrokeWidth() / 2.0f, AndroidUtilities.dp(0.5f) * this.f20955f);
            } else {
                f7 = 0.0f;
            }
            float dp2 = (AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(3.0f) * this.f20955f)) - 0.0f;
            if (this.f20960l) {
                f10 = (1.0f - this.f20955f) * (paint.getStrokeWidth() / 2.0f);
            } else {
                f10 = 0.0f;
            }
            canvas.drawLine(f7, 0.0f, dp2 - f10, 0.0f, paint);
            abs = ((1.0f - Math.abs(this.f20955f)) * AndroidUtilities.dp(5.0f)) - (Math.abs(this.f20955f) * AndroidUtilities.dp(0.5f));
            dp = AndroidUtilities.dp(18.0f) - (Math.abs(this.f20955f) * AndroidUtilities.dp(2.5f));
            abs2 = (Math.abs(this.f20955f) * AndroidUtilities.dp(2.0f)) + AndroidUtilities.dp(5.0f);
            abs3 = Math.abs(this.f20955f) * AndroidUtilities.dp(7.5f);
            if (this.f20960l) {
                abs3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f20955f, paint.getStrokeWidth() / 2.0f, abs3);
                float dp3 = (AndroidUtilities.dp(0.5f) * this.f20955f) + abs;
                dp -= ((1.0f - this.f20955f) * (paint.getStrokeWidth() / 2.0f)) + (AndroidUtilities.dp(0.5f) * this.f20955f);
                abs2 -= AndroidUtilities.dp(0.25f) * this.f20955f;
                abs = (AndroidUtilities.dp(0.25f) * this.f20955f) + dp3;
            }
        } else {
            float f16 = this.f20955f;
            if (this.f20954c) {
                i10 = -225;
            } else {
                i10 = 135;
            }
            canvas.rotate(f16 * i10, AndroidUtilities.dp(9.0f), 0.0f);
            if (this.f20962n) {
                paint.setColor(i14);
                paint.setAlpha(this.f20963o);
                canvas.drawLine((AndroidUtilities.dp(1.0f) * this.f20955f) + ((1.0f - Math.abs(this.f20955f)) * AndroidUtilities.dpf2(2.0f)), 0.0f, ((AndroidUtilities.dp(17.0f) * this.f20955f) + ((1.0f - this.f20955f) * AndroidUtilities.dpf2(16.0f))) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f20955f)) * AndroidUtilities.dpf2(5.0f)) - (Math.abs(this.f20955f) * AndroidUtilities.dpf2(0.5f));
                dp = (Math.abs(this.f20955f) * AndroidUtilities.dpf2(9.0f)) + ((1.0f - Math.abs(this.f20955f)) * AndroidUtilities.dpf2(16.0f));
                abs2 = (Math.abs(this.f20955f) * AndroidUtilities.dpf2(3.0f)) + AndroidUtilities.dpf2(5.0f);
                abs3 = (Math.abs(this.f20955f) * AndroidUtilities.dpf2(7.0f)) + AndroidUtilities.dpf2(2.0f);
            } else {
                int x02 = k6.x0(null, k6.f21573y8, false);
                AndroidUtilities.getOffsetColor(i15, k6.x0(null, k6.f21537w8, false), this.f20955f, 1.0f);
                paint.setColor(AndroidUtilities.getOffsetColor(i14, x02, this.f20955f, 1.0f));
                paint.setAlpha(this.f20963o);
                canvas.drawLine(this.f20955f * AndroidUtilities.dp(1.0f), 0.0f, (AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(1.0f) * this.f20955f)) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f20955f)) * AndroidUtilities.dp(5.0f)) - (Math.abs(this.f20955f) * AndroidUtilities.dp(0.5f));
                dp = AndroidUtilities.dp(18.0f) - (Math.abs(this.f20955f) * AndroidUtilities.dp(9.0f));
                abs2 = (Math.abs(this.f20955f) * AndroidUtilities.dp(3.0f)) + AndroidUtilities.dp(5.0f);
                abs3 = Math.abs(this.f20955f) * AndroidUtilities.dp(9.0f);
            }
        }
        float f17 = dp;
        float f18 = abs3;
        float f19 = abs2;
        float f20 = abs;
        if (this.f20962n) {
            canvas.drawLine(f18, -f19, f17, -f20, paint);
            canvas.drawLine(f18, f19, f17, f20, paint);
        } else {
            canvas.drawLine(f18, -f19, f17 - 0.0f, -f20, paint);
            canvas.drawLine(f18, f19, f17, f20, paint);
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
        if (this.f20963o != i10) {
            this.f20963o = i10;
            this.f20952a.setAlpha(i10);
            this.f20953b.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
