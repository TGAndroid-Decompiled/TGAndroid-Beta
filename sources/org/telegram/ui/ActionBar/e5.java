package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public class e5 extends Drawable {
    public final Paint f20771a;
    public final Paint f20772b;
    public boolean f20773c;
    public long d;
    public float e;
    public float f20774f;
    public int f20775g;
    public boolean h;
    public final DecelerateInterpolator f20776i;
    public int f20777j;
    public int f20778k;
    public boolean f20779l;
    public float f20780m;
    public boolean f20781n;
    public int f20782o;

    public e5() {
        Paint paint = new Paint(1);
        this.f20771a = paint;
        Paint paint2 = new Paint(1);
        this.f20772b = paint2;
        this.h = true;
        this.f20776i = new DecelerateInterpolator();
        new RectF();
        this.f20782o = 255;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeWidth(AndroidUtilities.density * 1.66f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        this.f20780m = 1.0f;
    }

    public final void a(float f7, boolean z10) {
        this.d = 0L;
        float f10 = this.f20774f;
        if (f10 == 1.0f) {
            this.f20773c = true;
        } else if (f10 == 0.0f) {
            this.f20773c = false;
        }
        this.d = 0L;
        if (z10) {
            if (f10 < f7) {
                this.f20775g = (int) (f10 * 200.0f);
            } else {
                this.f20775g = (int) ((1.0f - f10) * 200.0f);
            }
            this.d = SystemClock.elapsedRealtime();
            this.e = f7;
        } else {
            this.f20774f = f7;
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
        float f11 = this.f20774f;
        float f12 = this.e;
        if (f11 != f12) {
            if (j10 != 0) {
                int i12 = (int) (this.f20775g + j11);
                this.f20775g = i12;
                if (i12 >= 200) {
                    this.f20774f = f12;
                } else {
                    int i13 = (f11 > f12 ? 1 : (f11 == f12 ? 0 : -1));
                    DecelerateInterpolator decelerateInterpolator = this.f20776i;
                    if (i13 < 0) {
                        this.f20774f = decelerateInterpolator.getInterpolation(i12 / 200.0f) * this.e;
                    } else {
                        this.f20774f = 1.0f - decelerateInterpolator.getInterpolation(i12 / 200.0f);
                    }
                }
            }
            invalidateSelf();
        }
        float f13 = this.f20780m;
        if (f13 < 1.0f) {
            float f14 = (((float) j11) / 200.0f) + f13;
            this.f20780m = f14;
            if (f14 > 1.0f) {
                this.f20780m = 1.0f;
            }
            invalidateSelf();
        }
        this.d = elapsedRealtime;
        canvas.save();
        canvas.translate(((AndroidUtilities.dp(24.0f) / 2) - AndroidUtilities.dp(9.0f)) - (AndroidUtilities.dp(1.0f) * this.f20774f), AndroidUtilities.dp(24.0f) / 2);
        int i14 = this.f20777j;
        if (i14 == 0) {
            i14 = h6.x0(null, h6.f21321v8, false);
        }
        int i15 = this.f20778k;
        if (i15 == 0) {
            i15 = h6.x0(null, h6.f21265s8, false);
        }
        boolean z10 = this.h;
        Paint paint = this.f20771a;
        if (z10) {
            float f15 = this.f20774f;
            if (this.f20773c) {
                i11 = -180;
            } else {
                i11 = 180;
            }
            canvas.rotate(f15 * i11, AndroidUtilities.dp(9.0f), 0.0f);
            paint.setColor(i14);
            paint.setAlpha(this.f20782o);
            if (this.f20779l) {
                f7 = com.google.android.gms.internal.cast.a6.x(1.0f, this.f20774f, paint.getStrokeWidth() / 2.0f, AndroidUtilities.dp(0.5f) * this.f20774f);
            } else {
                f7 = 0.0f;
            }
            float dp2 = (AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(3.0f) * this.f20774f)) - 0.0f;
            if (this.f20779l) {
                f10 = (1.0f - this.f20774f) * (paint.getStrokeWidth() / 2.0f);
            } else {
                f10 = 0.0f;
            }
            canvas.drawLine(f7, 0.0f, dp2 - f10, 0.0f, paint);
            abs = ((1.0f - Math.abs(this.f20774f)) * AndroidUtilities.dp(5.0f)) - (Math.abs(this.f20774f) * AndroidUtilities.dp(0.5f));
            dp = AndroidUtilities.dp(18.0f) - (Math.abs(this.f20774f) * AndroidUtilities.dp(2.5f));
            abs2 = (Math.abs(this.f20774f) * AndroidUtilities.dp(2.0f)) + AndroidUtilities.dp(5.0f);
            abs3 = Math.abs(this.f20774f) * AndroidUtilities.dp(7.5f);
            if (this.f20779l) {
                abs3 = com.google.android.gms.internal.cast.a6.x(1.0f, this.f20774f, paint.getStrokeWidth() / 2.0f, abs3);
                float dp3 = (AndroidUtilities.dp(0.5f) * this.f20774f) + abs;
                dp -= ((1.0f - this.f20774f) * (paint.getStrokeWidth() / 2.0f)) + (AndroidUtilities.dp(0.5f) * this.f20774f);
                abs2 -= AndroidUtilities.dp(0.25f) * this.f20774f;
                abs = (AndroidUtilities.dp(0.25f) * this.f20774f) + dp3;
            }
        } else {
            float f16 = this.f20774f;
            if (this.f20773c) {
                i10 = -225;
            } else {
                i10 = 135;
            }
            canvas.rotate(f16 * i10, AndroidUtilities.dp(9.0f), 0.0f);
            if (this.f20781n) {
                paint.setColor(i14);
                paint.setAlpha(this.f20782o);
                canvas.drawLine((AndroidUtilities.dp(1.0f) * this.f20774f) + ((1.0f - Math.abs(this.f20774f)) * AndroidUtilities.dpf2(2.0f)), 0.0f, ((AndroidUtilities.dp(17.0f) * this.f20774f) + ((1.0f - this.f20774f) * AndroidUtilities.dpf2(16.0f))) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f20774f)) * AndroidUtilities.dpf2(5.0f)) - (Math.abs(this.f20774f) * AndroidUtilities.dpf2(0.5f));
                dp = (Math.abs(this.f20774f) * AndroidUtilities.dpf2(9.0f)) + ((1.0f - Math.abs(this.f20774f)) * AndroidUtilities.dpf2(16.0f));
                abs2 = (Math.abs(this.f20774f) * AndroidUtilities.dpf2(3.0f)) + AndroidUtilities.dpf2(5.0f);
                abs3 = (Math.abs(this.f20774f) * AndroidUtilities.dpf2(7.0f)) + AndroidUtilities.dpf2(2.0f);
            } else {
                int x02 = h6.x0(null, h6.f21376y8, false);
                AndroidUtilities.getOffsetColor(i15, h6.x0(null, h6.f21340w8, false), this.f20774f, 1.0f);
                paint.setColor(AndroidUtilities.getOffsetColor(i14, x02, this.f20774f, 1.0f));
                paint.setAlpha(this.f20782o);
                canvas.drawLine(this.f20774f * AndroidUtilities.dp(1.0f), 0.0f, (AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(1.0f) * this.f20774f)) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f20774f)) * AndroidUtilities.dp(5.0f)) - (Math.abs(this.f20774f) * AndroidUtilities.dp(0.5f));
                dp = AndroidUtilities.dp(18.0f) - (Math.abs(this.f20774f) * AndroidUtilities.dp(9.0f));
                abs2 = (Math.abs(this.f20774f) * AndroidUtilities.dp(3.0f)) + AndroidUtilities.dp(5.0f);
                abs3 = Math.abs(this.f20774f) * AndroidUtilities.dp(9.0f);
            }
        }
        float f17 = dp;
        float f18 = abs3;
        float f19 = abs2;
        float f20 = abs;
        if (this.f20781n) {
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
        if (this.f20782o != i10) {
            this.f20782o = i10;
            this.f20771a.setAlpha(i10);
            this.f20772b.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
