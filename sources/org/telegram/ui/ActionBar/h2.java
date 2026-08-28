package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class h2 extends Drawable {
    public final Paint f23447a;
    public boolean f23448b;
    public long f23449c;
    public float d;
    public float f23450e;
    public int f23451f;
    public final boolean f23452g;
    public final DecelerateInterpolator h;
    public int f23453i;
    public int f23454j;
    public float f23455k;
    public int f23456l;

    public h2(boolean z10) {
        Paint paint = new Paint(1);
        this.f23447a = paint;
        Paint paint2 = new Paint(1);
        this.h = new DecelerateInterpolator();
        this.f23453i = -1;
        this.f23454j = -9079435;
        this.f23455k = 300.0f;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setColor(-65536);
        this.f23452g = z10;
    }

    public final void a(int i9) {
        this.f23453i = i9;
        invalidateSelf();
    }

    public final void b(int i9) {
        this.f23454j = i9;
        invalidateSelf();
    }

    public final void c(float f10, boolean z10) {
        this.f23449c = 0L;
        float f11 = this.f23450e;
        if (f11 == 1.0f) {
            this.f23448b = true;
        } else if (f11 == 0.0f) {
            this.f23448b = false;
        }
        this.f23449c = 0L;
        if (z10) {
            if (f11 < f10) {
                this.f23451f = (int) (f11 * this.f23455k);
            } else {
                this.f23451f = (int) ((1.0f - f11) * this.f23455k);
            }
            this.f23449c = System.currentTimeMillis();
            this.d = f10;
        } else {
            this.f23450e = f10;
            this.d = f10;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i9;
        int i10;
        if (this.f23450e != this.d) {
            if (this.f23449c != 0) {
                int currentTimeMillis = this.f23451f + ((int) (System.currentTimeMillis() - this.f23449c));
                this.f23451f = currentTimeMillis;
                float f10 = currentTimeMillis;
                float f11 = this.f23455k;
                if (f10 >= f11) {
                    this.f23450e = this.d;
                } else {
                    float f12 = this.f23450e;
                    float f13 = this.d;
                    DecelerateInterpolator decelerateInterpolator = this.h;
                    if (f12 < f13) {
                        this.f23450e = decelerateInterpolator.getInterpolation(f10 / f11) * this.d;
                    } else {
                        this.f23450e = 1.0f - decelerateInterpolator.getInterpolation(f10 / f11);
                    }
                }
            }
            this.f23449c = System.currentTimeMillis();
            invalidateSelf();
        }
        int d = i0.a.d(this.f23450e, this.f23453i, this.f23454j);
        Paint paint = this.f23447a;
        paint.setColor(d);
        canvas.save();
        canvas.translate(AndroidUtilities.dp(24.0f) / 2.0f, AndroidUtilities.dp(24.0f) / 2.0f);
        int i11 = this.f23456l;
        if (i11 != 0) {
            canvas.rotate(i11);
        }
        float f14 = this.f23450e;
        canvas.translate(-AndroidUtilities.dp(0.66f), 0.0f);
        if (!this.f23452g) {
            float f15 = this.f23450e;
            if (this.f23448b) {
                i10 = -225;
            } else {
                i10 = 135;
            }
            canvas.rotate(f15 * i10);
        } else {
            float f16 = this.f23450e;
            if (this.f23448b) {
                i9 = -180;
            } else {
                i9 = 180;
            }
            canvas.rotate((f16 * i9) + 135.0f);
            f14 = 1.0f;
        }
        float f17 = 1.0f - f14;
        canvas.drawLine(AndroidUtilities.dp(AndroidUtilities.lerp(-6.75f, -8.0f, f14)), 0.0f, AndroidUtilities.dp(8.0f) - ((paint.getStrokeWidth() / 2.0f) * f17), 0.0f, paint);
        float dp = AndroidUtilities.dp(-0.25f);
        float dp2 = AndroidUtilities.dp(AndroidUtilities.lerp(7.0f, 8.0f, f14)) - ((paint.getStrokeWidth() / 4.0f) * f17);
        float dp3 = AndroidUtilities.dp(AndroidUtilities.lerp(-7.25f, 0.0f, f14));
        canvas.drawLine(dp3, -dp, 0.0f, -dp2, paint);
        canvas.drawLine(dp3, dp, 0.0f, dp2, paint);
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
    public final void setAlpha(int i9) {
        this.f23447a.setAlpha(i9);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f23447a.setColorFilter(colorFilter);
    }
}
