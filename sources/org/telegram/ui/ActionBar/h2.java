package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class h2 extends Drawable {
    public final Paint f20931a;
    public boolean f20932b;
    public long f20933c;
    public float d;
    public float e;
    public int f20934f;
    public final boolean f20935g;
    public final DecelerateInterpolator h;
    public int f20936i;
    public int f20937j;
    public float f20938k;
    public int f20939l;

    public h2(boolean z10) {
        Paint paint = new Paint(1);
        this.f20931a = paint;
        Paint paint2 = new Paint(1);
        this.h = new DecelerateInterpolator();
        this.f20936i = -1;
        this.f20937j = -9079435;
        this.f20938k = 300.0f;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setColor(-65536);
        this.f20935g = z10;
    }

    public final void a(int i10) {
        this.f20936i = i10;
        invalidateSelf();
    }

    public final void b(int i10) {
        this.f20937j = i10;
        invalidateSelf();
    }

    public final void c(float f7, boolean z10) {
        this.f20933c = 0L;
        float f10 = this.e;
        if (f10 == 1.0f) {
            this.f20932b = true;
        } else if (f10 == 0.0f) {
            this.f20932b = false;
        }
        this.f20933c = 0L;
        if (z10) {
            if (f10 < f7) {
                this.f20934f = (int) (f10 * this.f20938k);
            } else {
                this.f20934f = (int) ((1.0f - f10) * this.f20938k);
            }
            this.f20933c = System.currentTimeMillis();
            this.d = f7;
        } else {
            this.e = f7;
            this.d = f7;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        if (this.e != this.d) {
            if (this.f20933c != 0) {
                int currentTimeMillis = this.f20934f + ((int) (System.currentTimeMillis() - this.f20933c));
                this.f20934f = currentTimeMillis;
                float f7 = currentTimeMillis;
                float f10 = this.f20938k;
                if (f7 >= f10) {
                    this.e = this.d;
                } else {
                    int i12 = (this.e > this.d ? 1 : (this.e == this.d ? 0 : -1));
                    DecelerateInterpolator decelerateInterpolator = this.h;
                    if (i12 < 0) {
                        this.e = decelerateInterpolator.getInterpolation(f7 / f10) * this.d;
                    } else {
                        this.e = 1.0f - decelerateInterpolator.getInterpolation(f7 / f10);
                    }
                }
            }
            this.f20933c = System.currentTimeMillis();
            invalidateSelf();
        }
        int f11 = i0.a.f(this.e, this.f20936i, this.f20937j);
        Paint paint = this.f20931a;
        paint.setColor(f11);
        canvas.save();
        canvas.translate(AndroidUtilities.dp(24.0f) / 2.0f, AndroidUtilities.dp(24.0f) / 2.0f);
        int i13 = this.f20939l;
        if (i13 != 0) {
            canvas.rotate(i13);
        }
        float f12 = this.e;
        canvas.translate(-AndroidUtilities.dp(0.66f), 0.0f);
        if (!this.f20935g) {
            float f13 = this.e;
            if (this.f20932b) {
                i11 = -225;
            } else {
                i11 = 135;
            }
            canvas.rotate(f13 * i11);
        } else {
            float f14 = this.e;
            if (this.f20932b) {
                i10 = -180;
            } else {
                i10 = 180;
            }
            canvas.rotate((f14 * i10) + 135.0f);
            f12 = 1.0f;
        }
        float f15 = 1.0f - f12;
        canvas.drawLine(AndroidUtilities.dp(AndroidUtilities.lerp(-6.75f, -8.0f, f12)), 0.0f, AndroidUtilities.dp(8.0f) - ((paint.getStrokeWidth() / 2.0f) * f15), 0.0f, paint);
        float dp = AndroidUtilities.dp(-0.25f);
        float dp2 = AndroidUtilities.dp(AndroidUtilities.lerp(7.0f, 8.0f, f12)) - ((paint.getStrokeWidth() / 4.0f) * f15);
        float dp3 = AndroidUtilities.dp(AndroidUtilities.lerp(-7.25f, 0.0f, f12));
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
    public final void setAlpha(int i10) {
        this.f20931a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f20931a.setColorFilter(colorFilter);
    }
}
