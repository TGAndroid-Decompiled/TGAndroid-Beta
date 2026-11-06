package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.DecelerateInterpolator;
public class r4 extends Drawable {
    public final Paint f28461a;
    public final Paint f28462b;
    public boolean f28463c;
    public long d;
    public float f28464e;
    public float f28465f;
    public int f28466g;
    public boolean h;
    public final DecelerateInterpolator f28467i;
    public int f28468j;
    public int f28469k;
    public boolean f28470l;
    public float f28471m;
    public boolean f28472n;
    public int f28473o;

    public r4() {
        Paint paint = new Paint(1);
        this.f28461a = paint;
        Paint paint2 = new Paint(1);
        this.f28462b = paint2;
        this.h = true;
        this.f28467i = new DecelerateInterpolator();
        new RectF();
        this.f28473o = 255;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setStrokeWidth(org.telegram.messenger.g0.f22536p * 1.66f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        this.f28471m = 1.0f;
    }

    public final void a(boolean z9, float f10) {
        this.d = 0L;
        float f11 = this.f28465f;
        if (f11 == 1.0f) {
            this.f28463c = true;
        } else if (f11 == 0.0f) {
            this.f28463c = false;
        }
        this.d = 0L;
        if (z9) {
            if (f11 < f10) {
                this.f28466g = (int) (f11 * 200.0f);
            } else {
                this.f28466g = (int) ((1.0f - f11) * 200.0f);
            }
            this.d = SystemClock.elapsedRealtime();
            this.f28464e = f10;
        } else {
            this.f28465f = f10;
            this.f28464e = f10;
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
        float f12 = this.f28465f;
        float f13 = this.f28464e;
        if (f12 != f13) {
            if (j3 != 0) {
                int i11 = (int) (this.f28466g + j10);
                this.f28466g = i11;
                if (i11 >= 200) {
                    this.f28465f = f13;
                } else {
                    int i12 = (f12 > f13 ? 1 : (f12 == f13 ? 0 : -1));
                    DecelerateInterpolator decelerateInterpolator = this.f28467i;
                    if (i12 < 0) {
                        this.f28465f = decelerateInterpolator.getInterpolation(i11 / 200.0f) * this.f28464e;
                    } else {
                        this.f28465f = 1.0f - decelerateInterpolator.getInterpolation(i11 / 200.0f);
                    }
                }
            }
            invalidateSelf();
        }
        float f14 = this.f28471m;
        if (f14 < 1.0f) {
            float f15 = (((float) j10) / 200.0f) + f14;
            this.f28471m = f15;
            if (f15 > 1.0f) {
                this.f28471m = 1.0f;
            }
            invalidateSelf();
        }
        this.d = elapsedRealtime;
        canvas.save();
        canvas.translate(((org.telegram.messenger.g0.L(24.0f) / 2) - org.telegram.messenger.g0.L(9.0f)) - (org.telegram.messenger.g0.L(1.0f) * this.f28465f), org.telegram.messenger.g0.L(24.0f) / 2);
        int i13 = this.f28468j;
        if (i13 == 0) {
            i13 = k6.x0(null, k6.f28185v8, false);
        }
        int i14 = this.f28469k;
        if (i14 == 0) {
            i14 = k6.x0(null, k6.f28128s8, false);
        }
        boolean z9 = this.h;
        Paint paint = this.f28461a;
        if (z9) {
            float f16 = this.f28465f;
            if (this.f28463c) {
                i10 = -180;
            } else {
                i10 = 180;
            }
            canvas.rotate(f16 * i10, org.telegram.messenger.g0.L(9.0f), 0.0f);
            paint.setColor(i13);
            paint.setAlpha(this.f28473o);
            if (this.f28470l) {
                f10 = com.google.android.recaptcha.internal.a.z(1.0f, this.f28465f, paint.getStrokeWidth() / 2.0f, org.telegram.messenger.g0.L(0.5f) * this.f28465f);
            } else {
                f10 = 0.0f;
            }
            float L2 = (org.telegram.messenger.g0.L(18.0f) - (org.telegram.messenger.g0.L(3.0f) * this.f28465f)) - 0.0f;
            if (this.f28470l) {
                f11 = (1.0f - this.f28465f) * (paint.getStrokeWidth() / 2.0f);
            } else {
                f11 = 0.0f;
            }
            canvas.drawLine(f10, 0.0f, L2 - f11, 0.0f, paint);
            abs = ((1.0f - Math.abs(this.f28465f)) * org.telegram.messenger.g0.L(5.0f)) - (Math.abs(this.f28465f) * org.telegram.messenger.g0.L(0.5f));
            L = org.telegram.messenger.g0.L(18.0f) - (Math.abs(this.f28465f) * org.telegram.messenger.g0.L(2.5f));
            abs2 = (Math.abs(this.f28465f) * org.telegram.messenger.g0.L(2.0f)) + org.telegram.messenger.g0.L(5.0f);
            abs3 = Math.abs(this.f28465f) * org.telegram.messenger.g0.L(7.5f);
            if (this.f28470l) {
                abs3 = com.google.android.recaptcha.internal.a.z(1.0f, this.f28465f, paint.getStrokeWidth() / 2.0f, abs3);
                float L3 = (org.telegram.messenger.g0.L(0.5f) * this.f28465f) + abs;
                L -= ((1.0f - this.f28465f) * (paint.getStrokeWidth() / 2.0f)) + (org.telegram.messenger.g0.L(0.5f) * this.f28465f);
                abs2 -= org.telegram.messenger.g0.L(0.25f) * this.f28465f;
                abs = (org.telegram.messenger.g0.L(0.25f) * this.f28465f) + L3;
            }
        } else {
            float f17 = this.f28465f;
            if (this.f28463c) {
                i7 = -225;
            } else {
                i7 = 135;
            }
            canvas.rotate(f17 * i7, org.telegram.messenger.g0.L(9.0f), 0.0f);
            if (this.f28472n) {
                paint.setColor(i13);
                paint.setAlpha(this.f28473o);
                canvas.drawLine((org.telegram.messenger.g0.L(1.0f) * this.f28465f) + ((1.0f - Math.abs(this.f28465f)) * org.telegram.messenger.g0.N(2.0f)), 0.0f, ((org.telegram.messenger.g0.L(17.0f) * this.f28465f) + ((1.0f - this.f28465f) * org.telegram.messenger.g0.N(16.0f))) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f28465f)) * org.telegram.messenger.g0.N(5.0f)) - (Math.abs(this.f28465f) * org.telegram.messenger.g0.N(0.5f));
                L = (Math.abs(this.f28465f) * org.telegram.messenger.g0.N(9.0f)) + ((1.0f - Math.abs(this.f28465f)) * org.telegram.messenger.g0.N(16.0f));
                abs2 = (Math.abs(this.f28465f) * org.telegram.messenger.g0.N(3.0f)) + org.telegram.messenger.g0.N(5.0f);
                abs3 = (Math.abs(this.f28465f) * org.telegram.messenger.g0.N(7.0f)) + org.telegram.messenger.g0.N(2.0f);
            } else {
                int x02 = k6.x0(null, k6.f28242y8, false);
                org.telegram.messenger.g0.S0(this.f28465f, 1.0f, i14, k6.x0(null, k6.f28204w8, false));
                paint.setColor(org.telegram.messenger.g0.S0(this.f28465f, 1.0f, i13, x02));
                paint.setAlpha(this.f28473o);
                canvas.drawLine(this.f28465f * org.telegram.messenger.g0.L(1.0f), 0.0f, (org.telegram.messenger.g0.L(18.0f) - (org.telegram.messenger.g0.L(1.0f) * this.f28465f)) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f28465f)) * org.telegram.messenger.g0.L(5.0f)) - (Math.abs(this.f28465f) * org.telegram.messenger.g0.L(0.5f));
                L = org.telegram.messenger.g0.L(18.0f) - (Math.abs(this.f28465f) * org.telegram.messenger.g0.L(9.0f));
                abs2 = (Math.abs(this.f28465f) * org.telegram.messenger.g0.L(3.0f)) + org.telegram.messenger.g0.L(5.0f);
                abs3 = Math.abs(this.f28465f) * org.telegram.messenger.g0.L(9.0f);
            }
        }
        float f18 = L;
        float f19 = abs3;
        float f20 = abs2;
        float f21 = abs;
        if (this.f28472n) {
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
        if (this.f28473o != i7) {
            this.f28473o = i7;
            this.f28461a.setAlpha(i7);
            this.f28462b.setAlpha(i7);
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
