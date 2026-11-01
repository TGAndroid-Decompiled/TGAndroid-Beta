package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.DecelerateInterpolator;
public class a5 extends Drawable {
    public final Paint f20146a;
    public final Paint f20147b;
    public boolean f20148c;
    public long d;
    public float e;
    public float f20149f;
    public int f20150g;
    public boolean h;
    public final DecelerateInterpolator f20151i;
    public int f20152j;
    public int f20153k;
    public boolean f20154l;
    public float f20155m;
    public boolean f20156n;
    public int f20157o;

    public a5() {
        Paint paint = new Paint(1);
        this.f20146a = paint;
        Paint paint2 = new Paint(1);
        this.f20147b = paint2;
        this.h = true;
        this.f20151i = new DecelerateInterpolator();
        new RectF();
        this.f20157o = 255;
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint2.setStrokeWidth(org.telegram.messenger.i0.f16171p * 1.66f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        this.f20155m = 1.0f;
    }

    public final void a(boolean z10, float f7) {
        this.d = 0L;
        float f10 = this.f20149f;
        if (f10 == 1.0f) {
            this.f20148c = true;
        } else if (f10 == 0.0f) {
            this.f20148c = false;
        }
        this.d = 0L;
        if (z10) {
            if (f10 < f7) {
                this.f20150g = (int) (f10 * 200.0f);
            } else {
                this.f20150g = (int) ((1.0f - f10) * 200.0f);
            }
            this.d = SystemClock.elapsedRealtime();
            this.e = f7;
        } else {
            this.f20149f = f7;
            this.e = f7;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        float abs;
        float L;
        float abs2;
        float abs3;
        int i11;
        float f7;
        float f10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.d;
        long j11 = elapsedRealtime - j10;
        float f11 = this.f20149f;
        float f12 = this.e;
        if (f11 != f12) {
            if (j10 != 0) {
                int i12 = (int) (this.f20150g + j11);
                this.f20150g = i12;
                if (i12 >= 200) {
                    this.f20149f = f12;
                } else {
                    int i13 = (f11 > f12 ? 1 : (f11 == f12 ? 0 : -1));
                    DecelerateInterpolator decelerateInterpolator = this.f20151i;
                    if (i13 < 0) {
                        this.f20149f = decelerateInterpolator.getInterpolation(i12 / 200.0f) * this.e;
                    } else {
                        this.f20149f = 1.0f - decelerateInterpolator.getInterpolation(i12 / 200.0f);
                    }
                }
            }
            invalidateSelf();
        }
        float f13 = this.f20155m;
        if (f13 < 1.0f) {
            float f14 = (((float) j11) / 200.0f) + f13;
            this.f20155m = f14;
            if (f14 > 1.0f) {
                this.f20155m = 1.0f;
            }
            invalidateSelf();
        }
        this.d = elapsedRealtime;
        canvas.save();
        canvas.translate(((org.telegram.messenger.i0.L(24.0f) / 2) - org.telegram.messenger.i0.L(9.0f)) - (org.telegram.messenger.i0.L(1.0f) * this.f20149f), org.telegram.messenger.i0.L(24.0f) / 2);
        int i14 = this.f20152j;
        if (i14 == 0) {
            i14 = t6.x0(null, t6.f21262v8, false);
        }
        int i15 = this.f20153k;
        if (i15 == 0) {
            i15 = t6.x0(null, t6.f21207s8, false);
        }
        boolean z10 = this.h;
        Paint paint = this.f20146a;
        if (z10) {
            float f15 = this.f20149f;
            if (this.f20148c) {
                i11 = -180;
            } else {
                i11 = 180;
            }
            canvas.rotate(f15 * i11, org.telegram.messenger.i0.L(9.0f), 0.0f);
            paint.setColor(i14);
            paint.setAlpha(this.f20157o);
            if (this.f20154l) {
                f7 = c3.i0.z(1.0f, this.f20149f, paint.getStrokeWidth() / 2.0f, org.telegram.messenger.i0.L(0.5f) * this.f20149f);
            } else {
                f7 = 0.0f;
            }
            float L2 = (org.telegram.messenger.i0.L(18.0f) - (org.telegram.messenger.i0.L(3.0f) * this.f20149f)) - 0.0f;
            if (this.f20154l) {
                f10 = (1.0f - this.f20149f) * (paint.getStrokeWidth() / 2.0f);
            } else {
                f10 = 0.0f;
            }
            canvas.drawLine(f7, 0.0f, L2 - f10, 0.0f, paint);
            abs = ((1.0f - Math.abs(this.f20149f)) * org.telegram.messenger.i0.L(5.0f)) - (Math.abs(this.f20149f) * org.telegram.messenger.i0.L(0.5f));
            L = org.telegram.messenger.i0.L(18.0f) - (Math.abs(this.f20149f) * org.telegram.messenger.i0.L(2.5f));
            abs2 = (Math.abs(this.f20149f) * org.telegram.messenger.i0.L(2.0f)) + org.telegram.messenger.i0.L(5.0f);
            abs3 = Math.abs(this.f20149f) * org.telegram.messenger.i0.L(7.5f);
            if (this.f20154l) {
                abs3 = c3.i0.z(1.0f, this.f20149f, paint.getStrokeWidth() / 2.0f, abs3);
                float L3 = (org.telegram.messenger.i0.L(0.5f) * this.f20149f) + abs;
                L -= ((1.0f - this.f20149f) * (paint.getStrokeWidth() / 2.0f)) + (org.telegram.messenger.i0.L(0.5f) * this.f20149f);
                abs2 -= org.telegram.messenger.i0.L(0.25f) * this.f20149f;
                abs = (org.telegram.messenger.i0.L(0.25f) * this.f20149f) + L3;
            }
        } else {
            float f16 = this.f20149f;
            if (this.f20148c) {
                i10 = -225;
            } else {
                i10 = 135;
            }
            canvas.rotate(f16 * i10, org.telegram.messenger.i0.L(9.0f), 0.0f);
            if (this.f20156n) {
                paint.setColor(i14);
                paint.setAlpha(this.f20157o);
                canvas.drawLine((org.telegram.messenger.i0.L(1.0f) * this.f20149f) + ((1.0f - Math.abs(this.f20149f)) * org.telegram.messenger.i0.N(2.0f)), 0.0f, ((org.telegram.messenger.i0.L(17.0f) * this.f20149f) + ((1.0f - this.f20149f) * org.telegram.messenger.i0.N(16.0f))) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f20149f)) * org.telegram.messenger.i0.N(5.0f)) - (Math.abs(this.f20149f) * org.telegram.messenger.i0.N(0.5f));
                L = (Math.abs(this.f20149f) * org.telegram.messenger.i0.N(9.0f)) + ((1.0f - Math.abs(this.f20149f)) * org.telegram.messenger.i0.N(16.0f));
                abs2 = (Math.abs(this.f20149f) * org.telegram.messenger.i0.N(3.0f)) + org.telegram.messenger.i0.N(5.0f);
                abs3 = (Math.abs(this.f20149f) * org.telegram.messenger.i0.N(7.0f)) + org.telegram.messenger.i0.N(2.0f);
            } else {
                int x02 = t6.x0(null, t6.f21314y8, false);
                org.telegram.messenger.i0.S0(this.f20149f, 1.0f, i15, t6.x0(null, t6.f21280w8, false));
                paint.setColor(org.telegram.messenger.i0.S0(this.f20149f, 1.0f, i14, x02));
                paint.setAlpha(this.f20157o);
                canvas.drawLine(this.f20149f * org.telegram.messenger.i0.L(1.0f), 0.0f, (org.telegram.messenger.i0.L(18.0f) - (org.telegram.messenger.i0.L(1.0f) * this.f20149f)) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f20149f)) * org.telegram.messenger.i0.L(5.0f)) - (Math.abs(this.f20149f) * org.telegram.messenger.i0.L(0.5f));
                L = org.telegram.messenger.i0.L(18.0f) - (Math.abs(this.f20149f) * org.telegram.messenger.i0.L(9.0f));
                abs2 = (Math.abs(this.f20149f) * org.telegram.messenger.i0.L(3.0f)) + org.telegram.messenger.i0.L(5.0f);
                abs3 = Math.abs(this.f20149f) * org.telegram.messenger.i0.L(9.0f);
            }
        }
        float f17 = L;
        float f18 = abs3;
        float f19 = abs2;
        float f20 = abs;
        if (this.f20156n) {
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
        return org.telegram.messenger.i0.L(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.f20157o != i10) {
            this.f20157o = i10;
            this.f20146a.setAlpha(i10);
            this.f20147b.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
