package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.DecelerateInterpolator;
public class s4 extends Drawable {
    public final Paint f29989a;
    public final Paint f29990b;
    public boolean f29991c;
    public long d;
    public float f29992e;
    public float f29993f;
    public int f29994g;
    public boolean h;
    public final DecelerateInterpolator f29995i;
    public int f29996j;
    public int f29997k;
    public boolean f29998l;
    public float f29999m;
    public boolean f30000n;
    public int f30001o;

    public s4() {
        Paint paint = new Paint(1);
        this.f29989a = paint;
        Paint paint2 = new Paint(1);
        this.f29990b = paint2;
        this.h = true;
        this.f29995i = new DecelerateInterpolator();
        new RectF();
        this.f30001o = 255;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setStrokeWidth(org.telegram.messenger.g0.f24045p * 1.66f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        this.f29999m = 1.0f;
    }

    public final void a(boolean z10, float f10) {
        this.d = 0L;
        float f11 = this.f29993f;
        if (f11 == 1.0f) {
            this.f29991c = true;
        } else if (f11 == 0.0f) {
            this.f29991c = false;
        }
        this.d = 0L;
        if (z10) {
            if (f11 < f10) {
                this.f29994g = (int) (f11 * 200.0f);
            } else {
                this.f29994g = (int) ((1.0f - f11) * 200.0f);
            }
            this.d = SystemClock.elapsedRealtime();
            this.f29992e = f10;
        } else {
            this.f29993f = f10;
            this.f29992e = f10;
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
        float f12 = this.f29993f;
        float f13 = this.f29992e;
        if (f12 != f13) {
            if (j3 != 0) {
                int i11 = (int) (this.f29994g + j10);
                this.f29994g = i11;
                if (i11 >= 200) {
                    this.f29993f = f13;
                } else {
                    int i12 = (f12 > f13 ? 1 : (f12 == f13 ? 0 : -1));
                    DecelerateInterpolator decelerateInterpolator = this.f29995i;
                    if (i12 < 0) {
                        this.f29993f = decelerateInterpolator.getInterpolation(i11 / 200.0f) * this.f29992e;
                    } else {
                        this.f29993f = 1.0f - decelerateInterpolator.getInterpolation(i11 / 200.0f);
                    }
                }
            }
            invalidateSelf();
        }
        float f14 = this.f29999m;
        if (f14 < 1.0f) {
            float f15 = (((float) j10) / 200.0f) + f14;
            this.f29999m = f15;
            if (f15 > 1.0f) {
                this.f29999m = 1.0f;
            }
            invalidateSelf();
        }
        this.d = elapsedRealtime;
        canvas.save();
        canvas.translate(((org.telegram.messenger.g0.L(24.0f) / 2) - org.telegram.messenger.g0.L(9.0f)) - (org.telegram.messenger.g0.L(1.0f) * this.f29993f), org.telegram.messenger.g0.L(24.0f) / 2);
        int i13 = this.f29996j;
        if (i13 == 0) {
            i13 = m6.x0(null, m6.f29718v8, false);
        }
        int i14 = this.f29997k;
        if (i14 == 0) {
            i14 = m6.x0(null, m6.f29661s8, false);
        }
        boolean z10 = this.h;
        Paint paint = this.f29989a;
        if (z10) {
            float f16 = this.f29993f;
            if (this.f29991c) {
                i10 = -180;
            } else {
                i10 = 180;
            }
            canvas.rotate(f16 * i10, org.telegram.messenger.g0.L(9.0f), 0.0f);
            paint.setColor(i13);
            paint.setAlpha(this.f30001o);
            if (this.f29998l) {
                f10 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f29993f, paint.getStrokeWidth() / 2.0f, org.telegram.messenger.g0.L(0.5f) * this.f29993f);
            } else {
                f10 = 0.0f;
            }
            float L2 = (org.telegram.messenger.g0.L(18.0f) - (org.telegram.messenger.g0.L(3.0f) * this.f29993f)) - 0.0f;
            if (this.f29998l) {
                f11 = (1.0f - this.f29993f) * (paint.getStrokeWidth() / 2.0f);
            } else {
                f11 = 0.0f;
            }
            canvas.drawLine(f10, 0.0f, L2 - f11, 0.0f, paint);
            abs = ((1.0f - Math.abs(this.f29993f)) * org.telegram.messenger.g0.L(5.0f)) - (Math.abs(this.f29993f) * org.telegram.messenger.g0.L(0.5f));
            L = org.telegram.messenger.g0.L(18.0f) - (Math.abs(this.f29993f) * org.telegram.messenger.g0.L(2.5f));
            abs2 = (Math.abs(this.f29993f) * org.telegram.messenger.g0.L(2.0f)) + org.telegram.messenger.g0.L(5.0f);
            abs3 = Math.abs(this.f29993f) * org.telegram.messenger.g0.L(7.5f);
            if (this.f29998l) {
                abs3 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f29993f, paint.getStrokeWidth() / 2.0f, abs3);
                float L3 = (org.telegram.messenger.g0.L(0.5f) * this.f29993f) + abs;
                L -= ((1.0f - this.f29993f) * (paint.getStrokeWidth() / 2.0f)) + (org.telegram.messenger.g0.L(0.5f) * this.f29993f);
                abs2 -= org.telegram.messenger.g0.L(0.25f) * this.f29993f;
                abs = (org.telegram.messenger.g0.L(0.25f) * this.f29993f) + L3;
            }
        } else {
            float f17 = this.f29993f;
            if (this.f29991c) {
                i7 = -225;
            } else {
                i7 = 135;
            }
            canvas.rotate(f17 * i7, org.telegram.messenger.g0.L(9.0f), 0.0f);
            if (this.f30000n) {
                paint.setColor(i13);
                paint.setAlpha(this.f30001o);
                canvas.drawLine((org.telegram.messenger.g0.L(1.0f) * this.f29993f) + ((1.0f - Math.abs(this.f29993f)) * org.telegram.messenger.g0.N(2.0f)), 0.0f, ((org.telegram.messenger.g0.L(17.0f) * this.f29993f) + ((1.0f - this.f29993f) * org.telegram.messenger.g0.N(16.0f))) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f29993f)) * org.telegram.messenger.g0.N(5.0f)) - (Math.abs(this.f29993f) * org.telegram.messenger.g0.N(0.5f));
                L = (Math.abs(this.f29993f) * org.telegram.messenger.g0.N(9.0f)) + ((1.0f - Math.abs(this.f29993f)) * org.telegram.messenger.g0.N(16.0f));
                abs2 = (Math.abs(this.f29993f) * org.telegram.messenger.g0.N(3.0f)) + org.telegram.messenger.g0.N(5.0f);
                abs3 = (Math.abs(this.f29993f) * org.telegram.messenger.g0.N(7.0f)) + org.telegram.messenger.g0.N(2.0f);
            } else {
                int x02 = m6.x0(null, m6.f29775y8, false);
                org.telegram.messenger.g0.S0(this.f29993f, 1.0f, i14, m6.x0(null, m6.f29737w8, false));
                paint.setColor(org.telegram.messenger.g0.S0(this.f29993f, 1.0f, i13, x02));
                paint.setAlpha(this.f30001o);
                canvas.drawLine(this.f29993f * org.telegram.messenger.g0.L(1.0f), 0.0f, (org.telegram.messenger.g0.L(18.0f) - (org.telegram.messenger.g0.L(1.0f) * this.f29993f)) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f29993f)) * org.telegram.messenger.g0.L(5.0f)) - (Math.abs(this.f29993f) * org.telegram.messenger.g0.L(0.5f));
                L = org.telegram.messenger.g0.L(18.0f) - (Math.abs(this.f29993f) * org.telegram.messenger.g0.L(9.0f));
                abs2 = (Math.abs(this.f29993f) * org.telegram.messenger.g0.L(3.0f)) + org.telegram.messenger.g0.L(5.0f);
                abs3 = Math.abs(this.f29993f) * org.telegram.messenger.g0.L(9.0f);
            }
        }
        float f18 = L;
        float f19 = abs3;
        float f20 = abs2;
        float f21 = abs;
        if (this.f30000n) {
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
        if (this.f30001o != i7) {
            this.f30001o = i7;
            this.f29989a.setAlpha(i7);
            this.f29990b.setAlpha(i7);
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
