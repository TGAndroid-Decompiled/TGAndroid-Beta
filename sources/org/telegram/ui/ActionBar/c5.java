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
    public final Paint f20271a;
    public final Paint f20272b;
    public boolean f20273c;
    public long d;
    public float f20274e;
    public float f20275f;
    public int f20276g;
    public boolean h;
    public final DecelerateInterpolator f20277i;
    public int f20278j;
    public int f20279k;
    public boolean f20280l;
    public float f20281m;
    public boolean f20282n;
    public int f20283o;

    public c5() {
        Paint paint = new Paint(1);
        this.f20271a = paint;
        Paint paint2 = new Paint(1);
        this.f20272b = paint2;
        this.h = true;
        this.f20277i = new DecelerateInterpolator();
        new RectF();
        this.f20283o = 255;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeWidth(AndroidUtilities.density * 1.66f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        this.f20281m = 1.0f;
    }

    public final void a(float f7, boolean z10) {
        this.d = 0L;
        float f10 = this.f20275f;
        if (f10 == 1.0f) {
            this.f20273c = true;
        } else if (f10 == 0.0f) {
            this.f20273c = false;
        }
        this.d = 0L;
        if (z10) {
            if (f10 < f7) {
                this.f20276g = (int) (f10 * 200.0f);
            } else {
                this.f20276g = (int) ((1.0f - f10) * 200.0f);
            }
            this.d = SystemClock.elapsedRealtime();
            this.f20274e = f7;
        } else {
            this.f20275f = f7;
            this.f20274e = f7;
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
        long j3 = this.d;
        long j10 = elapsedRealtime - j3;
        float f11 = this.f20275f;
        float f12 = this.f20274e;
        if (f11 != f12) {
            if (j3 != 0) {
                int i12 = (int) (this.f20276g + j10);
                this.f20276g = i12;
                if (i12 >= 200) {
                    this.f20275f = f12;
                } else {
                    int i13 = (f11 > f12 ? 1 : (f11 == f12 ? 0 : -1));
                    DecelerateInterpolator decelerateInterpolator = this.f20277i;
                    if (i13 < 0) {
                        this.f20275f = decelerateInterpolator.getInterpolation(i12 / 200.0f) * this.f20274e;
                    } else {
                        this.f20275f = 1.0f - decelerateInterpolator.getInterpolation(i12 / 200.0f);
                    }
                }
            }
            invalidateSelf();
        }
        float f13 = this.f20281m;
        if (f13 < 1.0f) {
            float f14 = (((float) j10) / 200.0f) + f13;
            this.f20281m = f14;
            if (f14 > 1.0f) {
                this.f20281m = 1.0f;
            }
            invalidateSelf();
        }
        this.d = elapsedRealtime;
        canvas.save();
        canvas.translate(((AndroidUtilities.dp(24.0f) / 2) - AndroidUtilities.dp(9.0f)) - (AndroidUtilities.dp(1.0f) * this.f20275f), AndroidUtilities.dp(24.0f) / 2);
        int i14 = this.f20278j;
        if (i14 == 0) {
            i14 = h6.x0(null, h6.f20895v8, false);
        }
        int i15 = this.f20279k;
        if (i15 == 0) {
            i15 = h6.x0(null, h6.f20840s8, false);
        }
        boolean z10 = this.h;
        Paint paint = this.f20271a;
        if (z10) {
            float f15 = this.f20275f;
            if (this.f20273c) {
                i11 = -180;
            } else {
                i11 = 180;
            }
            canvas.rotate(f15 * i11, AndroidUtilities.dp(9.0f), 0.0f);
            paint.setColor(i14);
            paint.setAlpha(this.f20283o);
            if (this.f20280l) {
                f7 = com.google.android.gms.internal.vision.e2.y(1.0f, this.f20275f, paint.getStrokeWidth() / 2.0f, AndroidUtilities.dp(0.5f) * this.f20275f);
            } else {
                f7 = 0.0f;
            }
            float dp2 = (AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(3.0f) * this.f20275f)) - 0.0f;
            if (this.f20280l) {
                f10 = (1.0f - this.f20275f) * (paint.getStrokeWidth() / 2.0f);
            } else {
                f10 = 0.0f;
            }
            canvas.drawLine(f7, 0.0f, dp2 - f10, 0.0f, paint);
            abs = ((1.0f - Math.abs(this.f20275f)) * AndroidUtilities.dp(5.0f)) - (Math.abs(this.f20275f) * AndroidUtilities.dp(0.5f));
            dp = AndroidUtilities.dp(18.0f) - (Math.abs(this.f20275f) * AndroidUtilities.dp(2.5f));
            abs2 = (Math.abs(this.f20275f) * AndroidUtilities.dp(2.0f)) + AndroidUtilities.dp(5.0f);
            abs3 = Math.abs(this.f20275f) * AndroidUtilities.dp(7.5f);
            if (this.f20280l) {
                abs3 = com.google.android.gms.internal.vision.e2.y(1.0f, this.f20275f, paint.getStrokeWidth() / 2.0f, abs3);
                float dp3 = (AndroidUtilities.dp(0.5f) * this.f20275f) + abs;
                dp -= ((1.0f - this.f20275f) * (paint.getStrokeWidth() / 2.0f)) + (AndroidUtilities.dp(0.5f) * this.f20275f);
                abs2 -= AndroidUtilities.dp(0.25f) * this.f20275f;
                abs = (AndroidUtilities.dp(0.25f) * this.f20275f) + dp3;
            }
        } else {
            float f16 = this.f20275f;
            if (this.f20273c) {
                i10 = -225;
            } else {
                i10 = 135;
            }
            canvas.rotate(f16 * i10, AndroidUtilities.dp(9.0f), 0.0f);
            if (this.f20282n) {
                paint.setColor(i14);
                paint.setAlpha(this.f20283o);
                canvas.drawLine((AndroidUtilities.dp(1.0f) * this.f20275f) + ((1.0f - Math.abs(this.f20275f)) * AndroidUtilities.dpf2(2.0f)), 0.0f, ((AndroidUtilities.dp(17.0f) * this.f20275f) + ((1.0f - this.f20275f) * AndroidUtilities.dpf2(16.0f))) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f20275f)) * AndroidUtilities.dpf2(5.0f)) - (Math.abs(this.f20275f) * AndroidUtilities.dpf2(0.5f));
                dp = (Math.abs(this.f20275f) * AndroidUtilities.dpf2(9.0f)) + ((1.0f - Math.abs(this.f20275f)) * AndroidUtilities.dpf2(16.0f));
                abs2 = (Math.abs(this.f20275f) * AndroidUtilities.dpf2(3.0f)) + AndroidUtilities.dpf2(5.0f);
                abs3 = (Math.abs(this.f20275f) * AndroidUtilities.dpf2(7.0f)) + AndroidUtilities.dpf2(2.0f);
            } else {
                int x02 = h6.x0(null, h6.f20948y8, false);
                AndroidUtilities.getOffsetColor(i15, h6.x0(null, h6.f20913w8, false), this.f20275f, 1.0f);
                paint.setColor(AndroidUtilities.getOffsetColor(i14, x02, this.f20275f, 1.0f));
                paint.setAlpha(this.f20283o);
                canvas.drawLine(this.f20275f * AndroidUtilities.dp(1.0f), 0.0f, (AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(1.0f) * this.f20275f)) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f20275f)) * AndroidUtilities.dp(5.0f)) - (Math.abs(this.f20275f) * AndroidUtilities.dp(0.5f));
                dp = AndroidUtilities.dp(18.0f) - (Math.abs(this.f20275f) * AndroidUtilities.dp(9.0f));
                abs2 = (Math.abs(this.f20275f) * AndroidUtilities.dp(3.0f)) + AndroidUtilities.dp(5.0f);
                abs3 = Math.abs(this.f20275f) * AndroidUtilities.dp(9.0f);
            }
        }
        float f17 = dp;
        float f18 = abs3;
        float f19 = abs2;
        float f20 = abs;
        if (this.f20282n) {
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
        if (this.f20283o != i10) {
            this.f20283o = i10;
            this.f20271a.setAlpha(i10);
            this.f20272b.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
