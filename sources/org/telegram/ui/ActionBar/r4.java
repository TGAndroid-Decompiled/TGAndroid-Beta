package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.DecelerateInterpolator;
public class r4 extends Drawable {
    public final Paint f28466a;
    public final Paint f28467b;
    public boolean f28468c;
    public long d;
    public float f28469e;
    public float f28470f;
    public int f28471g;
    public boolean h;
    public final DecelerateInterpolator f28472i;
    public int f28473j;
    public int f28474k;
    public boolean f28475l;
    public float f28476m;
    public boolean f28477n;
    public int f28478o;

    public r4() {
        Paint paint = new Paint(1);
        this.f28466a = paint;
        Paint paint2 = new Paint(1);
        this.f28467b = paint2;
        this.h = true;
        this.f28472i = new DecelerateInterpolator();
        new RectF();
        this.f28478o = 255;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setStrokeWidth(org.telegram.messenger.g0.f22562p * 1.66f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        this.f28476m = 1.0f;
    }

    public final void a(boolean z9, float f10) {
        this.d = 0L;
        float f11 = this.f28470f;
        if (f11 == 1.0f) {
            this.f28468c = true;
        } else if (f11 == 0.0f) {
            this.f28468c = false;
        }
        this.d = 0L;
        if (z9) {
            if (f11 < f10) {
                this.f28471g = (int) (f11 * 200.0f);
            } else {
                this.f28471g = (int) ((1.0f - f11) * 200.0f);
            }
            this.d = SystemClock.elapsedRealtime();
            this.f28469e = f10;
        } else {
            this.f28470f = f10;
            this.f28469e = f10;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i7;
        float abs;
        float L;
        float abs2;
        float abs3;
        int i10;
        float f10;
        float f11;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.d;
        long j10 = elapsedRealtime - j3;
        float f12 = this.f28470f;
        float f13 = this.f28469e;
        if (f12 != f13) {
            if (j3 != 0) {
                int i11 = (int) (this.f28471g + j10);
                this.f28471g = i11;
                if (i11 >= 200) {
                    this.f28470f = f13;
                } else {
                    int i12 = (f12 > f13 ? 1 : (f12 == f13 ? 0 : -1));
                    DecelerateInterpolator decelerateInterpolator = this.f28472i;
                    if (i12 < 0) {
                        this.f28470f = decelerateInterpolator.getInterpolation(i11 / 200.0f) * this.f28469e;
                    } else {
                        this.f28470f = 1.0f - decelerateInterpolator.getInterpolation(i11 / 200.0f);
                    }
                }
            }
            invalidateSelf();
        }
        float f14 = this.f28476m;
        if (f14 < 1.0f) {
            float f15 = (((float) j10) / 200.0f) + f14;
            this.f28476m = f15;
            if (f15 > 1.0f) {
                this.f28476m = 1.0f;
            }
            invalidateSelf();
        }
        this.d = elapsedRealtime;
        canvas.save();
        canvas.translate(((org.telegram.messenger.g0.L(24.0f) / 2) - org.telegram.messenger.g0.L(9.0f)) - (org.telegram.messenger.g0.L(1.0f) * this.f28470f), org.telegram.messenger.g0.L(24.0f) / 2);
        int i13 = this.f28473j;
        if (i13 == 0) {
            i13 = l6.x0(null, l6.f28202v8, false);
        }
        int i14 = this.f28474k;
        if (i14 == 0) {
            i14 = l6.x0(null, l6.f28145s8, false);
        }
        boolean z9 = this.h;
        Paint paint = this.f28466a;
        if (z9) {
            float f16 = this.f28470f;
            if (this.f28468c) {
                i10 = -180;
            } else {
                i10 = 180;
            }
            canvas.rotate(f16 * i10, org.telegram.messenger.g0.L(9.0f), 0.0f);
            paint.setColor(i13);
            paint.setAlpha(this.f28478o);
            if (this.f28475l) {
                f10 = com.google.android.recaptcha.internal.a.z(1.0f, this.f28470f, paint.getStrokeWidth() / 2.0f, org.telegram.messenger.g0.L(0.5f) * this.f28470f);
            } else {
                f10 = 0.0f;
            }
            float L2 = (org.telegram.messenger.g0.L(18.0f) - (org.telegram.messenger.g0.L(3.0f) * this.f28470f)) - 0.0f;
            if (this.f28475l) {
                f11 = (1.0f - this.f28470f) * (paint.getStrokeWidth() / 2.0f);
            } else {
                f11 = 0.0f;
            }
            canvas.drawLine(f10, 0.0f, L2 - f11, 0.0f, paint);
            abs = ((1.0f - Math.abs(this.f28470f)) * org.telegram.messenger.g0.L(5.0f)) - (Math.abs(this.f28470f) * org.telegram.messenger.g0.L(0.5f));
            L = org.telegram.messenger.g0.L(18.0f) - (Math.abs(this.f28470f) * org.telegram.messenger.g0.L(2.5f));
            abs2 = (Math.abs(this.f28470f) * org.telegram.messenger.g0.L(2.0f)) + org.telegram.messenger.g0.L(5.0f);
            abs3 = Math.abs(this.f28470f) * org.telegram.messenger.g0.L(7.5f);
            if (this.f28475l) {
                abs3 = com.google.android.recaptcha.internal.a.z(1.0f, this.f28470f, paint.getStrokeWidth() / 2.0f, abs3);
                float L3 = (org.telegram.messenger.g0.L(0.5f) * this.f28470f) + abs;
                L -= ((1.0f - this.f28470f) * (paint.getStrokeWidth() / 2.0f)) + (org.telegram.messenger.g0.L(0.5f) * this.f28470f);
                abs2 -= org.telegram.messenger.g0.L(0.25f) * this.f28470f;
                abs = (org.telegram.messenger.g0.L(0.25f) * this.f28470f) + L3;
            }
        } else {
            float f17 = this.f28470f;
            if (this.f28468c) {
                i7 = -225;
            } else {
                i7 = 135;
            }
            canvas.rotate(f17 * i7, org.telegram.messenger.g0.L(9.0f), 0.0f);
            if (this.f28477n) {
                paint.setColor(i13);
                paint.setAlpha(this.f28478o);
                canvas.drawLine((org.telegram.messenger.g0.L(1.0f) * this.f28470f) + ((1.0f - Math.abs(this.f28470f)) * org.telegram.messenger.g0.N(2.0f)), 0.0f, ((org.telegram.messenger.g0.L(17.0f) * this.f28470f) + ((1.0f - this.f28470f) * org.telegram.messenger.g0.N(16.0f))) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f28470f)) * org.telegram.messenger.g0.N(5.0f)) - (Math.abs(this.f28470f) * org.telegram.messenger.g0.N(0.5f));
                L = (Math.abs(this.f28470f) * org.telegram.messenger.g0.N(9.0f)) + ((1.0f - Math.abs(this.f28470f)) * org.telegram.messenger.g0.N(16.0f));
                abs2 = (Math.abs(this.f28470f) * org.telegram.messenger.g0.N(3.0f)) + org.telegram.messenger.g0.N(5.0f);
                abs3 = (Math.abs(this.f28470f) * org.telegram.messenger.g0.N(7.0f)) + org.telegram.messenger.g0.N(2.0f);
            } else {
                int x02 = l6.x0(null, l6.f28259y8, false);
                org.telegram.messenger.g0.S0(this.f28470f, 1.0f, i14, l6.x0(null, l6.f28221w8, false));
                paint.setColor(org.telegram.messenger.g0.S0(this.f28470f, 1.0f, i13, x02));
                paint.setAlpha(this.f28478o);
                canvas.drawLine(this.f28470f * org.telegram.messenger.g0.L(1.0f), 0.0f, (org.telegram.messenger.g0.L(18.0f) - (org.telegram.messenger.g0.L(1.0f) * this.f28470f)) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f28470f)) * org.telegram.messenger.g0.L(5.0f)) - (Math.abs(this.f28470f) * org.telegram.messenger.g0.L(0.5f));
                L = org.telegram.messenger.g0.L(18.0f) - (Math.abs(this.f28470f) * org.telegram.messenger.g0.L(9.0f));
                abs2 = (Math.abs(this.f28470f) * org.telegram.messenger.g0.L(3.0f)) + org.telegram.messenger.g0.L(5.0f);
                abs3 = Math.abs(this.f28470f) * org.telegram.messenger.g0.L(9.0f);
            }
        }
        float f18 = L;
        float f19 = abs3;
        float f20 = abs2;
        float f21 = abs;
        if (this.f28477n) {
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
        return org.telegram.messenger.g0.L(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        if (this.f28478o != i7) {
            this.f28478o = i7;
            this.f28466a.setAlpha(i7);
            this.f28467b.setAlpha(i7);
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
