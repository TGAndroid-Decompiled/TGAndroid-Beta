package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.DecelerateInterpolator;
public class r4 extends Drawable {
    public final Paint f28501a;
    public final Paint f28502b;
    public boolean f28503c;
    public long d;
    public float f28504e;
    public float f28505f;
    public int f28506g;
    public boolean h;
    public final DecelerateInterpolator f28507i;
    public int f28508j;
    public int f28509k;
    public boolean f28510l;
    public float f28511m;
    public boolean f28512n;
    public int f28513o;

    public r4() {
        Paint paint = new Paint(1);
        this.f28501a = paint;
        Paint paint2 = new Paint(1);
        this.f28502b = paint2;
        this.h = true;
        this.f28507i = new DecelerateInterpolator();
        new RectF();
        this.f28513o = 255;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setStrokeWidth(org.telegram.messenger.g0.f22607p * 1.66f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        this.f28511m = 1.0f;
    }

    public final void a(boolean z10, float f10) {
        this.d = 0L;
        float f11 = this.f28505f;
        if (f11 == 1.0f) {
            this.f28503c = true;
        } else if (f11 == 0.0f) {
            this.f28503c = false;
        }
        this.d = 0L;
        if (z10) {
            if (f11 < f10) {
                this.f28506g = (int) (f11 * 200.0f);
            } else {
                this.f28506g = (int) ((1.0f - f11) * 200.0f);
            }
            this.d = SystemClock.elapsedRealtime();
            this.f28504e = f10;
        } else {
            this.f28505f = f10;
            this.f28504e = f10;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i3;
        float abs;
        float L;
        float abs2;
        float abs3;
        int i10;
        float f10;
        float f11;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.d;
        long j11 = elapsedRealtime - j10;
        float f12 = this.f28505f;
        float f13 = this.f28504e;
        if (f12 != f13) {
            if (j10 != 0) {
                int i11 = (int) (this.f28506g + j11);
                this.f28506g = i11;
                if (i11 >= 200) {
                    this.f28505f = f13;
                } else {
                    int i12 = (f12 > f13 ? 1 : (f12 == f13 ? 0 : -1));
                    DecelerateInterpolator decelerateInterpolator = this.f28507i;
                    if (i12 < 0) {
                        this.f28505f = decelerateInterpolator.getInterpolation(i11 / 200.0f) * this.f28504e;
                    } else {
                        this.f28505f = 1.0f - decelerateInterpolator.getInterpolation(i11 / 200.0f);
                    }
                }
            }
            invalidateSelf();
        }
        float f14 = this.f28511m;
        if (f14 < 1.0f) {
            float f15 = (((float) j11) / 200.0f) + f14;
            this.f28511m = f15;
            if (f15 > 1.0f) {
                this.f28511m = 1.0f;
            }
            invalidateSelf();
        }
        this.d = elapsedRealtime;
        canvas.save();
        canvas.translate(((org.telegram.messenger.g0.L(24.0f) / 2) - org.telegram.messenger.g0.L(9.0f)) - (org.telegram.messenger.g0.L(1.0f) * this.f28505f), org.telegram.messenger.g0.L(24.0f) / 2);
        int i13 = this.f28508j;
        if (i13 == 0) {
            i13 = k6.x0(null, k6.f28216v8, false);
        }
        int i14 = this.f28509k;
        if (i14 == 0) {
            i14 = k6.x0(null, k6.f28160s8, false);
        }
        boolean z10 = this.h;
        Paint paint = this.f28501a;
        if (z10) {
            float f16 = this.f28505f;
            if (this.f28503c) {
                i10 = -180;
            } else {
                i10 = 180;
            }
            canvas.rotate(f16 * i10, org.telegram.messenger.g0.L(9.0f), 0.0f);
            paint.setColor(i13);
            paint.setAlpha(this.f28513o);
            if (this.f28510l) {
                f10 = com.google.android.recaptcha.internal.a.y(1.0f, this.f28505f, paint.getStrokeWidth() / 2.0f, org.telegram.messenger.g0.L(0.5f) * this.f28505f);
            } else {
                f10 = 0.0f;
            }
            float L2 = (org.telegram.messenger.g0.L(18.0f) - (org.telegram.messenger.g0.L(3.0f) * this.f28505f)) - 0.0f;
            if (this.f28510l) {
                f11 = (1.0f - this.f28505f) * (paint.getStrokeWidth() / 2.0f);
            } else {
                f11 = 0.0f;
            }
            canvas.drawLine(f10, 0.0f, L2 - f11, 0.0f, paint);
            abs = ((1.0f - Math.abs(this.f28505f)) * org.telegram.messenger.g0.L(5.0f)) - (Math.abs(this.f28505f) * org.telegram.messenger.g0.L(0.5f));
            L = org.telegram.messenger.g0.L(18.0f) - (Math.abs(this.f28505f) * org.telegram.messenger.g0.L(2.5f));
            abs2 = (Math.abs(this.f28505f) * org.telegram.messenger.g0.L(2.0f)) + org.telegram.messenger.g0.L(5.0f);
            abs3 = Math.abs(this.f28505f) * org.telegram.messenger.g0.L(7.5f);
            if (this.f28510l) {
                abs3 = com.google.android.recaptcha.internal.a.y(1.0f, this.f28505f, paint.getStrokeWidth() / 2.0f, abs3);
                float L3 = (org.telegram.messenger.g0.L(0.5f) * this.f28505f) + abs;
                L -= ((1.0f - this.f28505f) * (paint.getStrokeWidth() / 2.0f)) + (org.telegram.messenger.g0.L(0.5f) * this.f28505f);
                abs2 -= org.telegram.messenger.g0.L(0.25f) * this.f28505f;
                abs = (org.telegram.messenger.g0.L(0.25f) * this.f28505f) + L3;
            }
        } else {
            float f17 = this.f28505f;
            if (this.f28503c) {
                i3 = -225;
            } else {
                i3 = 135;
            }
            canvas.rotate(f17 * i3, org.telegram.messenger.g0.L(9.0f), 0.0f);
            if (this.f28512n) {
                paint.setColor(i13);
                paint.setAlpha(this.f28513o);
                canvas.drawLine((org.telegram.messenger.g0.L(1.0f) * this.f28505f) + ((1.0f - Math.abs(this.f28505f)) * org.telegram.messenger.g0.N(2.0f)), 0.0f, ((org.telegram.messenger.g0.L(17.0f) * this.f28505f) + ((1.0f - this.f28505f) * org.telegram.messenger.g0.N(16.0f))) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f28505f)) * org.telegram.messenger.g0.N(5.0f)) - (Math.abs(this.f28505f) * org.telegram.messenger.g0.N(0.5f));
                L = (Math.abs(this.f28505f) * org.telegram.messenger.g0.N(9.0f)) + ((1.0f - Math.abs(this.f28505f)) * org.telegram.messenger.g0.N(16.0f));
                abs2 = (Math.abs(this.f28505f) * org.telegram.messenger.g0.N(3.0f)) + org.telegram.messenger.g0.N(5.0f);
                abs3 = (Math.abs(this.f28505f) * org.telegram.messenger.g0.N(7.0f)) + org.telegram.messenger.g0.N(2.0f);
            } else {
                int x02 = k6.x0(null, k6.f28275y8, false);
                org.telegram.messenger.g0.S0(this.f28505f, 1.0f, i14, k6.x0(null, k6.f28236w8, false));
                paint.setColor(org.telegram.messenger.g0.S0(this.f28505f, 1.0f, i13, x02));
                paint.setAlpha(this.f28513o);
                canvas.drawLine(this.f28505f * org.telegram.messenger.g0.L(1.0f), 0.0f, (org.telegram.messenger.g0.L(18.0f) - (org.telegram.messenger.g0.L(1.0f) * this.f28505f)) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f28505f)) * org.telegram.messenger.g0.L(5.0f)) - (Math.abs(this.f28505f) * org.telegram.messenger.g0.L(0.5f));
                L = org.telegram.messenger.g0.L(18.0f) - (Math.abs(this.f28505f) * org.telegram.messenger.g0.L(9.0f));
                abs2 = (Math.abs(this.f28505f) * org.telegram.messenger.g0.L(3.0f)) + org.telegram.messenger.g0.L(5.0f);
                abs3 = Math.abs(this.f28505f) * org.telegram.messenger.g0.L(9.0f);
            }
        }
        float f18 = L;
        float f19 = abs3;
        float f20 = abs2;
        float f21 = abs;
        if (this.f28512n) {
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
    public final void setAlpha(int i3) {
        if (this.f28513o != i3) {
            this.f28513o = i3;
            this.f28501a.setAlpha(i3);
            this.f28502b.setAlpha(i3);
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
