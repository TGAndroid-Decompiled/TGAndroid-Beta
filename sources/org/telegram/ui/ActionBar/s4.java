package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.DecelerateInterpolator;
public class s4 extends Drawable {
    public final Paint f29986a;
    public final Paint f29987b;
    public boolean f29988c;
    public long d;
    public float f29989e;
    public float f29990f;
    public int f29991g;
    public boolean h;
    public final DecelerateInterpolator f29992i;
    public int f29993j;
    public int f29994k;
    public boolean f29995l;
    public float f29996m;
    public boolean f29997n;
    public int f29998o;

    public s4() {
        Paint paint = new Paint(1);
        this.f29986a = paint;
        Paint paint2 = new Paint(1);
        this.f29987b = paint2;
        this.h = true;
        this.f29992i = new DecelerateInterpolator();
        new RectF();
        this.f29998o = 255;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setStrokeWidth(org.telegram.messenger.g0.f24145p * 1.66f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        this.f29996m = 1.0f;
    }

    public final void a(boolean z10, float f10) {
        this.d = 0L;
        float f11 = this.f29990f;
        if (f11 == 1.0f) {
            this.f29988c = true;
        } else if (f11 == 0.0f) {
            this.f29988c = false;
        }
        this.d = 0L;
        if (z10) {
            if (f11 < f10) {
                this.f29991g = (int) (f11 * 200.0f);
            } else {
                this.f29991g = (int) ((1.0f - f11) * 200.0f);
            }
            this.d = SystemClock.elapsedRealtime();
            this.f29989e = f10;
        } else {
            this.f29990f = f10;
            this.f29989e = f10;
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
        float f12 = this.f29990f;
        float f13 = this.f29989e;
        if (f12 != f13) {
            if (j3 != 0) {
                int i11 = (int) (this.f29991g + j10);
                this.f29991g = i11;
                if (i11 >= 200) {
                    this.f29990f = f13;
                } else {
                    int i12 = (f12 > f13 ? 1 : (f12 == f13 ? 0 : -1));
                    DecelerateInterpolator decelerateInterpolator = this.f29992i;
                    if (i12 < 0) {
                        this.f29990f = decelerateInterpolator.getInterpolation(i11 / 200.0f) * this.f29989e;
                    } else {
                        this.f29990f = 1.0f - decelerateInterpolator.getInterpolation(i11 / 200.0f);
                    }
                }
            }
            invalidateSelf();
        }
        float f14 = this.f29996m;
        if (f14 < 1.0f) {
            float f15 = (((float) j10) / 200.0f) + f14;
            this.f29996m = f15;
            if (f15 > 1.0f) {
                this.f29996m = 1.0f;
            }
            invalidateSelf();
        }
        this.d = elapsedRealtime;
        canvas.save();
        canvas.translate(((org.telegram.messenger.g0.L(24.0f) / 2) - org.telegram.messenger.g0.L(9.0f)) - (org.telegram.messenger.g0.L(1.0f) * this.f29990f), org.telegram.messenger.g0.L(24.0f) / 2);
        int i13 = this.f29993j;
        if (i13 == 0) {
            i13 = m6.x0(null, m6.f29715v8, false);
        }
        int i14 = this.f29994k;
        if (i14 == 0) {
            i14 = m6.x0(null, m6.f29658s8, false);
        }
        boolean z10 = this.h;
        Paint paint = this.f29986a;
        if (z10) {
            float f16 = this.f29990f;
            if (this.f29988c) {
                i10 = -180;
            } else {
                i10 = 180;
            }
            canvas.rotate(f16 * i10, org.telegram.messenger.g0.L(9.0f), 0.0f);
            paint.setColor(i13);
            paint.setAlpha(this.f29998o);
            if (this.f29995l) {
                f10 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f29990f, paint.getStrokeWidth() / 2.0f, org.telegram.messenger.g0.L(0.5f) * this.f29990f);
            } else {
                f10 = 0.0f;
            }
            float L2 = (org.telegram.messenger.g0.L(18.0f) - (org.telegram.messenger.g0.L(3.0f) * this.f29990f)) - 0.0f;
            if (this.f29995l) {
                f11 = (1.0f - this.f29990f) * (paint.getStrokeWidth() / 2.0f);
            } else {
                f11 = 0.0f;
            }
            canvas.drawLine(f10, 0.0f, L2 - f11, 0.0f, paint);
            abs = ((1.0f - Math.abs(this.f29990f)) * org.telegram.messenger.g0.L(5.0f)) - (Math.abs(this.f29990f) * org.telegram.messenger.g0.L(0.5f));
            L = org.telegram.messenger.g0.L(18.0f) - (Math.abs(this.f29990f) * org.telegram.messenger.g0.L(2.5f));
            abs2 = (Math.abs(this.f29990f) * org.telegram.messenger.g0.L(2.0f)) + org.telegram.messenger.g0.L(5.0f);
            abs3 = Math.abs(this.f29990f) * org.telegram.messenger.g0.L(7.5f);
            if (this.f29995l) {
                abs3 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f29990f, paint.getStrokeWidth() / 2.0f, abs3);
                float L3 = (org.telegram.messenger.g0.L(0.5f) * this.f29990f) + abs;
                L -= ((1.0f - this.f29990f) * (paint.getStrokeWidth() / 2.0f)) + (org.telegram.messenger.g0.L(0.5f) * this.f29990f);
                abs2 -= org.telegram.messenger.g0.L(0.25f) * this.f29990f;
                abs = (org.telegram.messenger.g0.L(0.25f) * this.f29990f) + L3;
            }
        } else {
            float f17 = this.f29990f;
            if (this.f29988c) {
                i7 = -225;
            } else {
                i7 = 135;
            }
            canvas.rotate(f17 * i7, org.telegram.messenger.g0.L(9.0f), 0.0f);
            if (this.f29997n) {
                paint.setColor(i13);
                paint.setAlpha(this.f29998o);
                canvas.drawLine((org.telegram.messenger.g0.L(1.0f) * this.f29990f) + ((1.0f - Math.abs(this.f29990f)) * org.telegram.messenger.g0.N(2.0f)), 0.0f, ((org.telegram.messenger.g0.L(17.0f) * this.f29990f) + ((1.0f - this.f29990f) * org.telegram.messenger.g0.N(16.0f))) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f29990f)) * org.telegram.messenger.g0.N(5.0f)) - (Math.abs(this.f29990f) * org.telegram.messenger.g0.N(0.5f));
                L = (Math.abs(this.f29990f) * org.telegram.messenger.g0.N(9.0f)) + ((1.0f - Math.abs(this.f29990f)) * org.telegram.messenger.g0.N(16.0f));
                abs2 = (Math.abs(this.f29990f) * org.telegram.messenger.g0.N(3.0f)) + org.telegram.messenger.g0.N(5.0f);
                abs3 = (Math.abs(this.f29990f) * org.telegram.messenger.g0.N(7.0f)) + org.telegram.messenger.g0.N(2.0f);
            } else {
                int x02 = m6.x0(null, m6.f29772y8, false);
                org.telegram.messenger.g0.S0(this.f29990f, 1.0f, i14, m6.x0(null, m6.f29734w8, false));
                paint.setColor(org.telegram.messenger.g0.S0(this.f29990f, 1.0f, i13, x02));
                paint.setAlpha(this.f29998o);
                canvas.drawLine(this.f29990f * org.telegram.messenger.g0.L(1.0f), 0.0f, (org.telegram.messenger.g0.L(18.0f) - (org.telegram.messenger.g0.L(1.0f) * this.f29990f)) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f29990f)) * org.telegram.messenger.g0.L(5.0f)) - (Math.abs(this.f29990f) * org.telegram.messenger.g0.L(0.5f));
                L = org.telegram.messenger.g0.L(18.0f) - (Math.abs(this.f29990f) * org.telegram.messenger.g0.L(9.0f));
                abs2 = (Math.abs(this.f29990f) * org.telegram.messenger.g0.L(3.0f)) + org.telegram.messenger.g0.L(5.0f);
                abs3 = Math.abs(this.f29990f) * org.telegram.messenger.g0.L(9.0f);
            }
        }
        float f18 = L;
        float f19 = abs3;
        float f20 = abs2;
        float f21 = abs;
        if (this.f29997n) {
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
        if (this.f29998o != i7) {
            this.f29998o = i7;
            this.f29986a.setAlpha(i7);
            this.f29987b.setAlpha(i7);
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
