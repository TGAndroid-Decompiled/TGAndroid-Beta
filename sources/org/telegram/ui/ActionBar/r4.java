package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.DecelerateInterpolator;
public class r4 extends Drawable {
    public final Paint f28465a;
    public final Paint f28466b;
    public boolean f28467c;
    public long d;
    public float f28468e;
    public float f28469f;
    public int f28470g;
    public boolean h;
    public final DecelerateInterpolator f28471i;
    public int f28472j;
    public int f28473k;
    public boolean f28474l;
    public float f28475m;
    public boolean f28476n;
    public int f28477o;

    public r4() {
        Paint paint = new Paint(1);
        this.f28465a = paint;
        Paint paint2 = new Paint(1);
        this.f28466b = paint2;
        this.h = true;
        this.f28471i = new DecelerateInterpolator();
        new RectF();
        this.f28477o = 255;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setStrokeWidth(org.telegram.messenger.g0.f22562p * 1.66f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        this.f28475m = 1.0f;
    }

    public final void a(boolean z9, float f10) {
        this.d = 0L;
        float f11 = this.f28469f;
        if (f11 == 1.0f) {
            this.f28467c = true;
        } else if (f11 == 0.0f) {
            this.f28467c = false;
        }
        this.d = 0L;
        if (z9) {
            if (f11 < f10) {
                this.f28470g = (int) (f11 * 200.0f);
            } else {
                this.f28470g = (int) ((1.0f - f11) * 200.0f);
            }
            this.d = SystemClock.elapsedRealtime();
            this.f28468e = f10;
        } else {
            this.f28469f = f10;
            this.f28468e = f10;
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
        float f12 = this.f28469f;
        float f13 = this.f28468e;
        if (f12 != f13) {
            if (j3 != 0) {
                int i11 = (int) (this.f28470g + j10);
                this.f28470g = i11;
                if (i11 >= 200) {
                    this.f28469f = f13;
                } else {
                    int i12 = (f12 > f13 ? 1 : (f12 == f13 ? 0 : -1));
                    DecelerateInterpolator decelerateInterpolator = this.f28471i;
                    if (i12 < 0) {
                        this.f28469f = decelerateInterpolator.getInterpolation(i11 / 200.0f) * this.f28468e;
                    } else {
                        this.f28469f = 1.0f - decelerateInterpolator.getInterpolation(i11 / 200.0f);
                    }
                }
            }
            invalidateSelf();
        }
        float f14 = this.f28475m;
        if (f14 < 1.0f) {
            float f15 = (((float) j10) / 200.0f) + f14;
            this.f28475m = f15;
            if (f15 > 1.0f) {
                this.f28475m = 1.0f;
            }
            invalidateSelf();
        }
        this.d = elapsedRealtime;
        canvas.save();
        canvas.translate(((org.telegram.messenger.g0.L(24.0f) / 2) - org.telegram.messenger.g0.L(9.0f)) - (org.telegram.messenger.g0.L(1.0f) * this.f28469f), org.telegram.messenger.g0.L(24.0f) / 2);
        int i13 = this.f28472j;
        if (i13 == 0) {
            i13 = k6.x0(null, k6.f28189v8, false);
        }
        int i14 = this.f28473k;
        if (i14 == 0) {
            i14 = k6.x0(null, k6.f28132s8, false);
        }
        boolean z9 = this.h;
        Paint paint = this.f28465a;
        if (z9) {
            float f16 = this.f28469f;
            if (this.f28467c) {
                i10 = -180;
            } else {
                i10 = 180;
            }
            canvas.rotate(f16 * i10, org.telegram.messenger.g0.L(9.0f), 0.0f);
            paint.setColor(i13);
            paint.setAlpha(this.f28477o);
            if (this.f28474l) {
                f10 = com.google.android.recaptcha.internal.a.z(1.0f, this.f28469f, paint.getStrokeWidth() / 2.0f, org.telegram.messenger.g0.L(0.5f) * this.f28469f);
            } else {
                f10 = 0.0f;
            }
            float L2 = (org.telegram.messenger.g0.L(18.0f) - (org.telegram.messenger.g0.L(3.0f) * this.f28469f)) - 0.0f;
            if (this.f28474l) {
                f11 = (1.0f - this.f28469f) * (paint.getStrokeWidth() / 2.0f);
            } else {
                f11 = 0.0f;
            }
            canvas.drawLine(f10, 0.0f, L2 - f11, 0.0f, paint);
            abs = ((1.0f - Math.abs(this.f28469f)) * org.telegram.messenger.g0.L(5.0f)) - (Math.abs(this.f28469f) * org.telegram.messenger.g0.L(0.5f));
            L = org.telegram.messenger.g0.L(18.0f) - (Math.abs(this.f28469f) * org.telegram.messenger.g0.L(2.5f));
            abs2 = (Math.abs(this.f28469f) * org.telegram.messenger.g0.L(2.0f)) + org.telegram.messenger.g0.L(5.0f);
            abs3 = Math.abs(this.f28469f) * org.telegram.messenger.g0.L(7.5f);
            if (this.f28474l) {
                abs3 = com.google.android.recaptcha.internal.a.z(1.0f, this.f28469f, paint.getStrokeWidth() / 2.0f, abs3);
                float L3 = (org.telegram.messenger.g0.L(0.5f) * this.f28469f) + abs;
                L -= ((1.0f - this.f28469f) * (paint.getStrokeWidth() / 2.0f)) + (org.telegram.messenger.g0.L(0.5f) * this.f28469f);
                abs2 -= org.telegram.messenger.g0.L(0.25f) * this.f28469f;
                abs = (org.telegram.messenger.g0.L(0.25f) * this.f28469f) + L3;
            }
        } else {
            float f17 = this.f28469f;
            if (this.f28467c) {
                i7 = -225;
            } else {
                i7 = 135;
            }
            canvas.rotate(f17 * i7, org.telegram.messenger.g0.L(9.0f), 0.0f);
            if (this.f28476n) {
                paint.setColor(i13);
                paint.setAlpha(this.f28477o);
                canvas.drawLine((org.telegram.messenger.g0.L(1.0f) * this.f28469f) + ((1.0f - Math.abs(this.f28469f)) * org.telegram.messenger.g0.N(2.0f)), 0.0f, ((org.telegram.messenger.g0.L(17.0f) * this.f28469f) + ((1.0f - this.f28469f) * org.telegram.messenger.g0.N(16.0f))) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f28469f)) * org.telegram.messenger.g0.N(5.0f)) - (Math.abs(this.f28469f) * org.telegram.messenger.g0.N(0.5f));
                L = (Math.abs(this.f28469f) * org.telegram.messenger.g0.N(9.0f)) + ((1.0f - Math.abs(this.f28469f)) * org.telegram.messenger.g0.N(16.0f));
                abs2 = (Math.abs(this.f28469f) * org.telegram.messenger.g0.N(3.0f)) + org.telegram.messenger.g0.N(5.0f);
                abs3 = (Math.abs(this.f28469f) * org.telegram.messenger.g0.N(7.0f)) + org.telegram.messenger.g0.N(2.0f);
            } else {
                int x02 = k6.x0(null, k6.f28246y8, false);
                org.telegram.messenger.g0.S0(this.f28469f, 1.0f, i14, k6.x0(null, k6.f28208w8, false));
                paint.setColor(org.telegram.messenger.g0.S0(this.f28469f, 1.0f, i13, x02));
                paint.setAlpha(this.f28477o);
                canvas.drawLine(this.f28469f * org.telegram.messenger.g0.L(1.0f), 0.0f, (org.telegram.messenger.g0.L(18.0f) - (org.telegram.messenger.g0.L(1.0f) * this.f28469f)) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f28469f)) * org.telegram.messenger.g0.L(5.0f)) - (Math.abs(this.f28469f) * org.telegram.messenger.g0.L(0.5f));
                L = org.telegram.messenger.g0.L(18.0f) - (Math.abs(this.f28469f) * org.telegram.messenger.g0.L(9.0f));
                abs2 = (Math.abs(this.f28469f) * org.telegram.messenger.g0.L(3.0f)) + org.telegram.messenger.g0.L(5.0f);
                abs3 = Math.abs(this.f28469f) * org.telegram.messenger.g0.L(9.0f);
            }
        }
        float f18 = L;
        float f19 = abs3;
        float f20 = abs2;
        float f21 = abs;
        if (this.f28476n) {
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
        if (this.f28477o != i7) {
            this.f28477o = i7;
            this.f28465a.setAlpha(i7);
            this.f28466b.setAlpha(i7);
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
