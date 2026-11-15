package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.DecelerateInterpolator;
public class p4 extends Drawable {
    public final Paint f29476a;
    public final Paint f29477b;
    public boolean f29478c;
    public long d;
    public float f29479e;
    public float f29480f;
    public int f29481g;
    public boolean h;
    public final DecelerateInterpolator f29482i;
    public int f29483j;
    public int f29484k;
    public boolean f29485l;
    public float f29486m;
    public boolean f29487n;
    public int f29488o;

    public p4() {
        Paint paint = new Paint(1);
        this.f29476a = paint;
        Paint paint2 = new Paint(1);
        this.f29477b = paint2;
        this.h = true;
        this.f29482i = new DecelerateInterpolator();
        new RectF();
        this.f29488o = 255;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setStrokeWidth(org.telegram.messenger.g0.f23610p * 1.66f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        this.f29486m = 1.0f;
    }

    public final void a(boolean z10, float f10) {
        this.d = 0L;
        float f11 = this.f29480f;
        if (f11 == 1.0f) {
            this.f29478c = true;
        } else if (f11 == 0.0f) {
            this.f29478c = false;
        }
        this.d = 0L;
        if (z10) {
            if (f11 < f10) {
                this.f29481g = (int) (f11 * 200.0f);
            } else {
                this.f29481g = (int) ((1.0f - f11) * 200.0f);
            }
            this.d = SystemClock.elapsedRealtime();
            this.f29479e = f10;
        } else {
            this.f29480f = f10;
            this.f29479e = f10;
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
        float f12 = this.f29480f;
        float f13 = this.f29479e;
        if (f12 != f13) {
            if (j3 != 0) {
                int i11 = (int) (this.f29481g + j10);
                this.f29481g = i11;
                if (i11 >= 200) {
                    this.f29480f = f13;
                } else {
                    int i12 = (f12 > f13 ? 1 : (f12 == f13 ? 0 : -1));
                    DecelerateInterpolator decelerateInterpolator = this.f29482i;
                    if (i12 < 0) {
                        this.f29480f = decelerateInterpolator.getInterpolation(i11 / 200.0f) * this.f29479e;
                    } else {
                        this.f29480f = 1.0f - decelerateInterpolator.getInterpolation(i11 / 200.0f);
                    }
                }
            }
            invalidateSelf();
        }
        float f14 = this.f29486m;
        if (f14 < 1.0f) {
            float f15 = (((float) j10) / 200.0f) + f14;
            this.f29486m = f15;
            if (f15 > 1.0f) {
                this.f29486m = 1.0f;
            }
            invalidateSelf();
        }
        this.d = elapsedRealtime;
        canvas.save();
        canvas.translate(((org.telegram.messenger.g0.L(24.0f) / 2) - org.telegram.messenger.g0.L(9.0f)) - (org.telegram.messenger.g0.L(1.0f) * this.f29480f), org.telegram.messenger.g0.L(24.0f) / 2);
        int i13 = this.f29483j;
        if (i13 == 0) {
            i13 = j6.x0(null, j6.f29186v8, false);
        }
        int i14 = this.f29484k;
        if (i14 == 0) {
            i14 = j6.x0(null, j6.f29129s8, false);
        }
        boolean z10 = this.h;
        Paint paint = this.f29476a;
        if (z10) {
            float f16 = this.f29480f;
            if (this.f29478c) {
                i10 = -180;
            } else {
                i10 = 180;
            }
            canvas.rotate(f16 * i10, org.telegram.messenger.g0.L(9.0f), 0.0f);
            paint.setColor(i13);
            paint.setAlpha(this.f29488o);
            if (this.f29485l) {
                f10 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f29480f, paint.getStrokeWidth() / 2.0f, org.telegram.messenger.g0.L(0.5f) * this.f29480f);
            } else {
                f10 = 0.0f;
            }
            float L2 = (org.telegram.messenger.g0.L(18.0f) - (org.telegram.messenger.g0.L(3.0f) * this.f29480f)) - 0.0f;
            if (this.f29485l) {
                f11 = (1.0f - this.f29480f) * (paint.getStrokeWidth() / 2.0f);
            } else {
                f11 = 0.0f;
            }
            canvas.drawLine(f10, 0.0f, L2 - f11, 0.0f, paint);
            abs = ((1.0f - Math.abs(this.f29480f)) * org.telegram.messenger.g0.L(5.0f)) - (Math.abs(this.f29480f) * org.telegram.messenger.g0.L(0.5f));
            L = org.telegram.messenger.g0.L(18.0f) - (Math.abs(this.f29480f) * org.telegram.messenger.g0.L(2.5f));
            abs2 = (Math.abs(this.f29480f) * org.telegram.messenger.g0.L(2.0f)) + org.telegram.messenger.g0.L(5.0f);
            abs3 = Math.abs(this.f29480f) * org.telegram.messenger.g0.L(7.5f);
            if (this.f29485l) {
                abs3 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f29480f, paint.getStrokeWidth() / 2.0f, abs3);
                float L3 = (org.telegram.messenger.g0.L(0.5f) * this.f29480f) + abs;
                L -= ((1.0f - this.f29480f) * (paint.getStrokeWidth() / 2.0f)) + (org.telegram.messenger.g0.L(0.5f) * this.f29480f);
                abs2 -= org.telegram.messenger.g0.L(0.25f) * this.f29480f;
                abs = (org.telegram.messenger.g0.L(0.25f) * this.f29480f) + L3;
            }
        } else {
            float f17 = this.f29480f;
            if (this.f29478c) {
                i7 = -225;
            } else {
                i7 = 135;
            }
            canvas.rotate(f17 * i7, org.telegram.messenger.g0.L(9.0f), 0.0f);
            if (this.f29487n) {
                paint.setColor(i13);
                paint.setAlpha(this.f29488o);
                canvas.drawLine((org.telegram.messenger.g0.L(1.0f) * this.f29480f) + ((1.0f - Math.abs(this.f29480f)) * org.telegram.messenger.g0.N(2.0f)), 0.0f, ((org.telegram.messenger.g0.L(17.0f) * this.f29480f) + ((1.0f - this.f29480f) * org.telegram.messenger.g0.N(16.0f))) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f29480f)) * org.telegram.messenger.g0.N(5.0f)) - (Math.abs(this.f29480f) * org.telegram.messenger.g0.N(0.5f));
                L = (Math.abs(this.f29480f) * org.telegram.messenger.g0.N(9.0f)) + ((1.0f - Math.abs(this.f29480f)) * org.telegram.messenger.g0.N(16.0f));
                abs2 = (Math.abs(this.f29480f) * org.telegram.messenger.g0.N(3.0f)) + org.telegram.messenger.g0.N(5.0f);
                abs3 = (Math.abs(this.f29480f) * org.telegram.messenger.g0.N(7.0f)) + org.telegram.messenger.g0.N(2.0f);
            } else {
                int x02 = j6.x0(null, j6.f29243y8, false);
                org.telegram.messenger.g0.S0(this.f29480f, 1.0f, i14, j6.x0(null, j6.f29205w8, false));
                paint.setColor(org.telegram.messenger.g0.S0(this.f29480f, 1.0f, i13, x02));
                paint.setAlpha(this.f29488o);
                canvas.drawLine(this.f29480f * org.telegram.messenger.g0.L(1.0f), 0.0f, (org.telegram.messenger.g0.L(18.0f) - (org.telegram.messenger.g0.L(1.0f) * this.f29480f)) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f29480f)) * org.telegram.messenger.g0.L(5.0f)) - (Math.abs(this.f29480f) * org.telegram.messenger.g0.L(0.5f));
                L = org.telegram.messenger.g0.L(18.0f) - (Math.abs(this.f29480f) * org.telegram.messenger.g0.L(9.0f));
                abs2 = (Math.abs(this.f29480f) * org.telegram.messenger.g0.L(3.0f)) + org.telegram.messenger.g0.L(5.0f);
                abs3 = Math.abs(this.f29480f) * org.telegram.messenger.g0.L(9.0f);
            }
        }
        float f18 = L;
        float f19 = abs3;
        float f20 = abs2;
        float f21 = abs;
        if (this.f29487n) {
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
        if (this.f29488o != i7) {
            this.f29488o = i7;
            this.f29476a.setAlpha(i7);
            this.f29477b.setAlpha(i7);
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
