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
    public final Paint f20557a;
    public final Paint f20558b;
    public boolean f20559c;
    public long d;
    public float f20560e;
    public float f20561f;
    public int f20562g;
    public boolean h;
    public final DecelerateInterpolator f20563i;
    public int f20564j;
    public int f20565k;
    public boolean f20566l;
    public float f20567m;
    public boolean f20568n;
    public int f20569o;

    public e5() {
        Paint paint = new Paint(1);
        this.f20557a = paint;
        Paint paint2 = new Paint(1);
        this.f20558b = paint2;
        this.h = true;
        this.f20563i = new DecelerateInterpolator();
        new RectF();
        this.f20569o = 255;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeWidth(AndroidUtilities.density * 1.66f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        this.f20567m = 1.0f;
    }

    public final void a(float f7, boolean z10) {
        this.d = 0L;
        float f10 = this.f20561f;
        if (f10 == 1.0f) {
            this.f20559c = true;
        } else if (f10 == 0.0f) {
            this.f20559c = false;
        }
        this.d = 0L;
        if (z10) {
            if (f10 < f7) {
                this.f20562g = (int) (f10 * 200.0f);
            } else {
                this.f20562g = (int) ((1.0f - f10) * 200.0f);
            }
            this.d = SystemClock.elapsedRealtime();
            this.f20560e = f7;
        } else {
            this.f20561f = f7;
            this.f20560e = f7;
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
        float f11 = this.f20561f;
        float f12 = this.f20560e;
        if (f11 != f12) {
            if (j3 != 0) {
                int i12 = (int) (this.f20562g + j10);
                this.f20562g = i12;
                if (i12 >= 200) {
                    this.f20561f = f12;
                } else {
                    int i13 = (f11 > f12 ? 1 : (f11 == f12 ? 0 : -1));
                    DecelerateInterpolator decelerateInterpolator = this.f20563i;
                    if (i13 < 0) {
                        this.f20561f = decelerateInterpolator.getInterpolation(i12 / 200.0f) * this.f20560e;
                    } else {
                        this.f20561f = 1.0f - decelerateInterpolator.getInterpolation(i12 / 200.0f);
                    }
                }
            }
            invalidateSelf();
        }
        float f13 = this.f20567m;
        if (f13 < 1.0f) {
            float f14 = (((float) j10) / 200.0f) + f13;
            this.f20567m = f14;
            if (f14 > 1.0f) {
                this.f20567m = 1.0f;
            }
            invalidateSelf();
        }
        this.d = elapsedRealtime;
        canvas.save();
        canvas.translate(((AndroidUtilities.dp(24.0f) / 2) - AndroidUtilities.dp(9.0f)) - (AndroidUtilities.dp(1.0f) * this.f20561f), AndroidUtilities.dp(24.0f) / 2);
        int i14 = this.f20564j;
        if (i14 == 0) {
            i14 = i6.x0(null, i6.f21130v8, false);
        }
        int i15 = this.f20565k;
        if (i15 == 0) {
            i15 = i6.x0(null, i6.f21075s8, false);
        }
        boolean z10 = this.h;
        Paint paint = this.f20557a;
        if (z10) {
            float f15 = this.f20561f;
            if (this.f20559c) {
                i11 = -180;
            } else {
                i11 = 180;
            }
            canvas.rotate(f15 * i11, AndroidUtilities.dp(9.0f), 0.0f);
            paint.setColor(i14);
            paint.setAlpha(this.f20569o);
            if (this.f20566l) {
                f7 = com.google.android.gms.internal.vision.e2.y(1.0f, this.f20561f, paint.getStrokeWidth() / 2.0f, AndroidUtilities.dp(0.5f) * this.f20561f);
            } else {
                f7 = 0.0f;
            }
            float dp2 = (AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(3.0f) * this.f20561f)) - 0.0f;
            if (this.f20566l) {
                f10 = (1.0f - this.f20561f) * (paint.getStrokeWidth() / 2.0f);
            } else {
                f10 = 0.0f;
            }
            canvas.drawLine(f7, 0.0f, dp2 - f10, 0.0f, paint);
            abs = ((1.0f - Math.abs(this.f20561f)) * AndroidUtilities.dp(5.0f)) - (Math.abs(this.f20561f) * AndroidUtilities.dp(0.5f));
            dp = AndroidUtilities.dp(18.0f) - (Math.abs(this.f20561f) * AndroidUtilities.dp(2.5f));
            abs2 = (Math.abs(this.f20561f) * AndroidUtilities.dp(2.0f)) + AndroidUtilities.dp(5.0f);
            abs3 = Math.abs(this.f20561f) * AndroidUtilities.dp(7.5f);
            if (this.f20566l) {
                abs3 = com.google.android.gms.internal.vision.e2.y(1.0f, this.f20561f, paint.getStrokeWidth() / 2.0f, abs3);
                float dp3 = (AndroidUtilities.dp(0.5f) * this.f20561f) + abs;
                dp -= ((1.0f - this.f20561f) * (paint.getStrokeWidth() / 2.0f)) + (AndroidUtilities.dp(0.5f) * this.f20561f);
                abs2 -= AndroidUtilities.dp(0.25f) * this.f20561f;
                abs = (AndroidUtilities.dp(0.25f) * this.f20561f) + dp3;
            }
        } else {
            float f16 = this.f20561f;
            if (this.f20559c) {
                i10 = -225;
            } else {
                i10 = 135;
            }
            canvas.rotate(f16 * i10, AndroidUtilities.dp(9.0f), 0.0f);
            if (this.f20568n) {
                paint.setColor(i14);
                paint.setAlpha(this.f20569o);
                canvas.drawLine((AndroidUtilities.dp(1.0f) * this.f20561f) + ((1.0f - Math.abs(this.f20561f)) * AndroidUtilities.dpf2(2.0f)), 0.0f, ((AndroidUtilities.dp(17.0f) * this.f20561f) + ((1.0f - this.f20561f) * AndroidUtilities.dpf2(16.0f))) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f20561f)) * AndroidUtilities.dpf2(5.0f)) - (Math.abs(this.f20561f) * AndroidUtilities.dpf2(0.5f));
                dp = (Math.abs(this.f20561f) * AndroidUtilities.dpf2(9.0f)) + ((1.0f - Math.abs(this.f20561f)) * AndroidUtilities.dpf2(16.0f));
                abs2 = (Math.abs(this.f20561f) * AndroidUtilities.dpf2(3.0f)) + AndroidUtilities.dpf2(5.0f);
                abs3 = (Math.abs(this.f20561f) * AndroidUtilities.dpf2(7.0f)) + AndroidUtilities.dpf2(2.0f);
            } else {
                int x02 = i6.x0(null, i6.f21183y8, false);
                AndroidUtilities.getOffsetColor(i15, i6.x0(null, i6.f21148w8, false), this.f20561f, 1.0f);
                paint.setColor(AndroidUtilities.getOffsetColor(i14, x02, this.f20561f, 1.0f));
                paint.setAlpha(this.f20569o);
                canvas.drawLine(this.f20561f * AndroidUtilities.dp(1.0f), 0.0f, (AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(1.0f) * this.f20561f)) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f20561f)) * AndroidUtilities.dp(5.0f)) - (Math.abs(this.f20561f) * AndroidUtilities.dp(0.5f));
                dp = AndroidUtilities.dp(18.0f) - (Math.abs(this.f20561f) * AndroidUtilities.dp(9.0f));
                abs2 = (Math.abs(this.f20561f) * AndroidUtilities.dp(3.0f)) + AndroidUtilities.dp(5.0f);
                abs3 = Math.abs(this.f20561f) * AndroidUtilities.dp(9.0f);
            }
        }
        float f17 = dp;
        float f18 = abs3;
        float f19 = abs2;
        float f20 = abs;
        if (this.f20568n) {
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
        if (this.f20569o != i10) {
            this.f20569o = i10;
            this.f20557a.setAlpha(i10);
            this.f20558b.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
