package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public class d5 extends Drawable {
    public final Paint f20532a;
    public final Paint f20533b;
    public boolean f20534c;
    public long d;
    public float f20535e;
    public float f20536f;
    public int f20537g;
    public boolean h;
    public final DecelerateInterpolator f20538i;
    public int f20539j;
    public int f20540k;
    public boolean f20541l;
    public float f20542m;
    public boolean f20543n;
    public int f20544o;

    public d5() {
        Paint paint = new Paint(1);
        this.f20532a = paint;
        Paint paint2 = new Paint(1);
        this.f20533b = paint2;
        this.h = true;
        this.f20538i = new DecelerateInterpolator();
        new RectF();
        this.f20544o = 255;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeWidth(AndroidUtilities.density * 1.66f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        this.f20542m = 1.0f;
    }

    public final void a(float f7, boolean z10) {
        this.d = 0L;
        float f10 = this.f20536f;
        if (f10 == 1.0f) {
            this.f20534c = true;
        } else if (f10 == 0.0f) {
            this.f20534c = false;
        }
        this.d = 0L;
        if (z10) {
            if (f10 < f7) {
                this.f20537g = (int) (f10 * 200.0f);
            } else {
                this.f20537g = (int) ((1.0f - f10) * 200.0f);
            }
            this.d = SystemClock.elapsedRealtime();
            this.f20535e = f7;
        } else {
            this.f20536f = f7;
            this.f20535e = f7;
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
        float f11 = this.f20536f;
        float f12 = this.f20535e;
        if (f11 != f12) {
            if (j3 != 0) {
                int i12 = (int) (this.f20537g + j10);
                this.f20537g = i12;
                if (i12 >= 200) {
                    this.f20536f = f12;
                } else {
                    DecelerateInterpolator decelerateInterpolator = this.f20538i;
                    if (f11 < f12) {
                        this.f20536f = decelerateInterpolator.getInterpolation(i12 / 200.0f) * this.f20535e;
                    } else {
                        this.f20536f = 1.0f - decelerateInterpolator.getInterpolation(i12 / 200.0f);
                    }
                }
            }
            invalidateSelf();
        }
        float f13 = this.f20542m;
        if (f13 < 1.0f) {
            float f14 = (((float) j10) / 200.0f) + f13;
            this.f20542m = f14;
            if (f14 > 1.0f) {
                this.f20542m = 1.0f;
            }
            invalidateSelf();
        }
        this.d = elapsedRealtime;
        canvas.save();
        canvas.translate(((AndroidUtilities.dp(24.0f) / 2) - AndroidUtilities.dp(9.0f)) - (AndroidUtilities.dp(1.0f) * this.f20536f), AndroidUtilities.dp(24.0f) / 2);
        int i13 = this.f20539j;
        if (i13 == 0) {
            i13 = i6.w0(null, i6.f21159v8, false);
        }
        int i14 = this.f20540k;
        if (i14 == 0) {
            i14 = i6.w0(null, i6.f21104s8, false);
        }
        boolean z10 = this.h;
        Paint paint = this.f20532a;
        if (z10) {
            float f15 = this.f20536f;
            if (this.f20534c) {
                i11 = -180;
            } else {
                i11 = 180;
            }
            canvas.rotate(f15 * i11, AndroidUtilities.dp(9.0f), 0.0f);
            paint.setColor(i13);
            paint.setAlpha(this.f20544o);
            if (this.f20541l) {
                float dp2 = AndroidUtilities.dp(0.5f) * this.f20536f;
                f7 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f20536f, paint.getStrokeWidth() / 2.0f, dp2);
            } else {
                f7 = 0.0f;
            }
            float dp3 = (AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(3.0f) * this.f20536f)) - 0.0f;
            if (this.f20541l) {
                f10 = (1.0f - this.f20536f) * (paint.getStrokeWidth() / 2.0f);
            } else {
                f10 = 0.0f;
            }
            canvas.drawLine(f7, 0.0f, dp3 - f10, 0.0f, paint);
            abs = ((1.0f - Math.abs(this.f20536f)) * AndroidUtilities.dp(5.0f)) - (Math.abs(this.f20536f) * AndroidUtilities.dp(0.5f));
            dp = AndroidUtilities.dp(18.0f) - (Math.abs(this.f20536f) * AndroidUtilities.dp(2.5f));
            abs2 = (Math.abs(this.f20536f) * AndroidUtilities.dp(2.0f)) + AndroidUtilities.dp(5.0f);
            abs3 = Math.abs(this.f20536f) * AndroidUtilities.dp(7.5f);
            if (this.f20541l) {
                abs3 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f20536f, paint.getStrokeWidth() / 2.0f, abs3);
                float dp4 = (AndroidUtilities.dp(0.5f) * this.f20536f) + abs;
                dp -= ((1.0f - this.f20536f) * (paint.getStrokeWidth() / 2.0f)) + (AndroidUtilities.dp(0.5f) * this.f20536f);
                abs2 -= AndroidUtilities.dp(0.25f) * this.f20536f;
                abs = (AndroidUtilities.dp(0.25f) * this.f20536f) + dp4;
            }
        } else {
            float f16 = this.f20536f;
            if (this.f20534c) {
                i10 = -225;
            } else {
                i10 = 135;
            }
            canvas.rotate(f16 * i10, AndroidUtilities.dp(9.0f), 0.0f);
            if (this.f20543n) {
                paint.setColor(i13);
                paint.setAlpha(this.f20544o);
                canvas.drawLine((AndroidUtilities.dp(1.0f) * this.f20536f) + ((1.0f - Math.abs(this.f20536f)) * AndroidUtilities.dpf2(2.0f)), 0.0f, ((AndroidUtilities.dp(17.0f) * this.f20536f) + ((1.0f - this.f20536f) * AndroidUtilities.dpf2(16.0f))) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f20536f)) * AndroidUtilities.dpf2(5.0f)) - (Math.abs(this.f20536f) * AndroidUtilities.dpf2(0.5f));
                dp = (Math.abs(this.f20536f) * AndroidUtilities.dpf2(9.0f)) + ((1.0f - Math.abs(this.f20536f)) * AndroidUtilities.dpf2(16.0f));
                abs2 = (Math.abs(this.f20536f) * AndroidUtilities.dpf2(3.0f)) + AndroidUtilities.dpf2(5.0f);
                abs3 = (Math.abs(this.f20536f) * AndroidUtilities.dpf2(7.0f)) + AndroidUtilities.dpf2(2.0f);
            } else {
                int w02 = i6.w0(null, i6.f21211y8, false);
                AndroidUtilities.getOffsetColor(i14, i6.w0(null, i6.f21177w8, false), this.f20536f, 1.0f);
                paint.setColor(AndroidUtilities.getOffsetColor(i13, w02, this.f20536f, 1.0f));
                paint.setAlpha(this.f20544o);
                canvas.drawLine(this.f20536f * AndroidUtilities.dp(1.0f), 0.0f, (AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(1.0f) * this.f20536f)) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f20536f)) * AndroidUtilities.dp(5.0f)) - (Math.abs(this.f20536f) * AndroidUtilities.dp(0.5f));
                dp = AndroidUtilities.dp(18.0f) - (Math.abs(this.f20536f) * AndroidUtilities.dp(9.0f));
                abs2 = (Math.abs(this.f20536f) * AndroidUtilities.dp(3.0f)) + AndroidUtilities.dp(5.0f);
                abs3 = Math.abs(this.f20536f) * AndroidUtilities.dp(9.0f);
            }
        }
        float f17 = dp;
        float f18 = abs3;
        float f19 = abs2;
        float f20 = abs;
        if (this.f20543n) {
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
        if (this.f20544o != i10) {
            this.f20544o = i10;
            this.f20532a.setAlpha(i10);
            this.f20533b.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
