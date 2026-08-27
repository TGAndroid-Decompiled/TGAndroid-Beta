package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;

public class c5 extends Drawable {

    public final Paint f22819a;

    public final Paint f22820b;

    public boolean f22821c;
    public long d;

    public float f22822e;

    public float f22823f;

    public int f22824g;
    public boolean h;

    public final DecelerateInterpolator f22825i;

    public int f22826j;

    public int f22827k;

    public boolean f22828l;

    public float f22829m;

    public boolean f22830n;

    public int f22831o;

    public c5() {
        Paint paint = new Paint(1);
        this.f22819a = paint;
        Paint paint2 = new Paint(1);
        this.f22820b = paint2;
        this.h = true;
        this.f22825i = new DecelerateInterpolator();
        new RectF();
        this.f22831o = 255;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeWidth(AndroidUtilities.density * 1.66f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        this.f22829m = 1.0f;
    }

    public final void a(float f10, boolean z10) {
        this.d = 0L;
        float f11 = this.f22823f;
        if (f11 == 1.0f) {
            this.f22821c = true;
        } else if (f11 == 0.0f) {
            this.f22821c = false;
        }
        this.d = 0L;
        if (z10) {
            if (f11 < f10) {
                this.f22824g = (int) (f11 * 200.0f);
            } else {
                this.f22824g = (int) ((1.0f - f11) * 200.0f);
            }
            this.d = SystemClock.elapsedRealtime();
            this.f22822e = f10;
        } else {
            this.f22823f = f10;
            this.f22822e = f10;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        float fAbs;
        float fDp;
        float fAbs2;
        float fAbs3;
        float fZ;
        float strokeWidth;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.d;
        long j11 = jElapsedRealtime - j10;
        float f10 = this.f22823f;
        float f11 = this.f22822e;
        if (f10 != f11) {
            if (j10 != 0) {
                int i10 = (int) (((long) this.f22824g) + j11);
                this.f22824g = i10;
                if (i10 >= 200) {
                    this.f22823f = f11;
                } else {
                    DecelerateInterpolator decelerateInterpolator = this.f22825i;
                    if (f10 < f11) {
                        this.f22823f = decelerateInterpolator.getInterpolation(i10 / 200.0f) * this.f22822e;
                    } else {
                        this.f22823f = 1.0f - decelerateInterpolator.getInterpolation(i10 / 200.0f);
                    }
                }
            }
            invalidateSelf();
        }
        float f12 = this.f22829m;
        if (f12 < 1.0f) {
            float f13 = (j11 / 200.0f) + f12;
            this.f22829m = f13;
            if (f13 > 1.0f) {
                this.f22829m = 1.0f;
            }
            invalidateSelf();
        }
        this.d = jElapsedRealtime;
        canvas.save();
        canvas.translate(((AndroidUtilities.dp(24.0f) / 2) - AndroidUtilities.dp(9.0f)) - (AndroidUtilities.dp(1.0f) * this.f22823f), AndroidUtilities.dp(24.0f) / 2);
        int iW0 = this.f22826j;
        if (iW0 == 0) {
            iW0 = g6.w0(null, g6.f23375v8, false);
        }
        int iW1 = this.f22827k;
        if (iW1 == 0) {
            iW1 = g6.w0(null, g6.f23322s8, false);
        }
        boolean z10 = this.h;
        Paint paint = this.f22819a;
        if (z10) {
            canvas.rotate(this.f22823f * (this.f22821c ? -180 : 180), AndroidUtilities.dp(9.0f), 0.0f);
            paint.setColor(iW0);
            paint.setAlpha(this.f22831o);
            if (this.f22828l) {
                fZ = com.google.android.recaptcha.internal.a.z(1.0f, this.f22823f, paint.getStrokeWidth() / 2.0f, AndroidUtilities.dp(0.5f) * this.f22823f);
            } else {
                fZ = 0.0f;
            }
            float fDp2 = (AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(3.0f) * this.f22823f)) - 0.0f;
            if (this.f22828l) {
                strokeWidth = (1.0f - this.f22823f) * (paint.getStrokeWidth() / 2.0f);
            } else {
                strokeWidth = 0.0f;
            }
            canvas.drawLine(fZ, 0.0f, fDp2 - strokeWidth, 0.0f, paint);
            fAbs = ((1.0f - Math.abs(this.f22823f)) * AndroidUtilities.dp(5.0f)) - (Math.abs(this.f22823f) * AndroidUtilities.dp(0.5f));
            fDp = AndroidUtilities.dp(18.0f) - (Math.abs(this.f22823f) * AndroidUtilities.dp(2.5f));
            fAbs2 = (Math.abs(this.f22823f) * AndroidUtilities.dp(2.0f)) + AndroidUtilities.dp(5.0f);
            fAbs3 = Math.abs(this.f22823f) * AndroidUtilities.dp(7.5f);
            if (this.f22828l) {
                fAbs3 = com.google.android.recaptcha.internal.a.z(1.0f, this.f22823f, paint.getStrokeWidth() / 2.0f, fAbs3);
                float fDp3 = (AndroidUtilities.dp(0.5f) * this.f22823f) + fAbs;
                fDp -= ((1.0f - this.f22823f) * (paint.getStrokeWidth() / 2.0f)) + (AndroidUtilities.dp(0.5f) * this.f22823f);
                fAbs2 -= AndroidUtilities.dp(0.25f) * this.f22823f;
                fAbs = (AndroidUtilities.dp(0.25f) * this.f22823f) + fDp3;
            }
        } else {
            canvas.rotate(this.f22823f * (this.f22821c ? -225 : 135), AndroidUtilities.dp(9.0f), 0.0f);
            if (this.f22830n) {
                paint.setColor(iW0);
                paint.setAlpha(this.f22831o);
                canvas.drawLine((AndroidUtilities.dp(1.0f) * this.f22823f) + ((1.0f - Math.abs(this.f22823f)) * AndroidUtilities.dpf2(2.0f)), 0.0f, ((AndroidUtilities.dp(17.0f) * this.f22823f) + ((1.0f - this.f22823f) * AndroidUtilities.dpf2(16.0f))) - 0.0f, 0.0f, paint);
                fAbs = ((1.0f - Math.abs(this.f22823f)) * AndroidUtilities.dpf2(5.0f)) - (Math.abs(this.f22823f) * AndroidUtilities.dpf2(0.5f));
                fDp = (Math.abs(this.f22823f) * AndroidUtilities.dpf2(9.0f)) + ((1.0f - Math.abs(this.f22823f)) * AndroidUtilities.dpf2(16.0f));
                fAbs2 = (Math.abs(this.f22823f) * AndroidUtilities.dpf2(3.0f)) + AndroidUtilities.dpf2(5.0f);
                fAbs3 = (Math.abs(this.f22823f) * AndroidUtilities.dpf2(7.0f)) + AndroidUtilities.dpf2(2.0f);
            } else {
                int iW2 = g6.w0(null, g6.f23425y8, false);
                AndroidUtilities.getOffsetColor(iW1, g6.w0(null, g6.f23393w8, false), this.f22823f, 1.0f);
                paint.setColor(AndroidUtilities.getOffsetColor(iW0, iW2, this.f22823f, 1.0f));
                paint.setAlpha(this.f22831o);
                canvas.drawLine(this.f22823f * AndroidUtilities.dp(1.0f), 0.0f, (AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(1.0f) * this.f22823f)) - 0.0f, 0.0f, paint);
                fAbs = ((1.0f - Math.abs(this.f22823f)) * AndroidUtilities.dp(5.0f)) - (Math.abs(this.f22823f) * AndroidUtilities.dp(0.5f));
                fDp = AndroidUtilities.dp(18.0f) - (Math.abs(this.f22823f) * AndroidUtilities.dp(9.0f));
                fAbs2 = (Math.abs(this.f22823f) * AndroidUtilities.dp(3.0f)) + AndroidUtilities.dp(5.0f);
                fAbs3 = Math.abs(this.f22823f) * AndroidUtilities.dp(9.0f);
            }
        }
        float f14 = fDp;
        float f15 = fAbs3;
        float f16 = fAbs2;
        float f17 = fAbs;
        if (this.f22830n) {
            canvas.drawLine(f15, -f16, f14, -f17, paint);
            canvas.drawLine(f15, f16, f14, f17, paint);
        } else {
            canvas.drawLine(f15, -f16, f14 - 0.0f, -f17, paint);
            canvas.drawLine(f15, f16, f14, f17, paint);
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
        if (this.f22831o != i10) {
            this.f22831o = i10;
            this.f22819a.setAlpha(i10);
            this.f22820b.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
