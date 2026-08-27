package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;

public final class g2 extends Drawable {

    public final Paint f22965a;

    public boolean f22966b;

    public long f22967c;
    public float d;

    public float f22968e;

    public int f22969f;

    public final boolean f22970g;
    public final DecelerateInterpolator h;

    public int f22971i;

    public int f22972j;

    public float f22973k;

    public int f22974l;

    public g2(boolean z10) {
        Paint paint = new Paint(1);
        this.f22965a = paint;
        Paint paint2 = new Paint(1);
        this.h = new DecelerateInterpolator();
        this.f22971i = -1;
        this.f22972j = -9079435;
        this.f22973k = 300.0f;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setColor(-65536);
        this.f22970g = z10;
    }

    public final void a(int i10) {
        this.f22971i = i10;
        invalidateSelf();
    }

    public final void b(int i10) {
        this.f22972j = i10;
        invalidateSelf();
    }

    public final void c(float f10, boolean z10) {
        this.f22967c = 0L;
        float f11 = this.f22968e;
        if (f11 == 1.0f) {
            this.f22966b = true;
        } else if (f11 == 0.0f) {
            this.f22966b = false;
        }
        this.f22967c = 0L;
        if (z10) {
            if (f11 < f10) {
                this.f22969f = (int) (f11 * this.f22973k);
            } else {
                this.f22969f = (int) ((1.0f - f11) * this.f22973k);
            }
            this.f22967c = System.currentTimeMillis();
            this.d = f10;
        } else {
            this.f22968e = f10;
            this.d = f10;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f22968e != this.d) {
            if (this.f22967c != 0) {
                int iCurrentTimeMillis = this.f22969f + ((int) (System.currentTimeMillis() - this.f22967c));
                this.f22969f = iCurrentTimeMillis;
                float f10 = iCurrentTimeMillis;
                float f11 = this.f22973k;
                if (f10 >= f11) {
                    this.f22968e = this.d;
                } else {
                    float f12 = this.f22968e;
                    float f13 = this.d;
                    DecelerateInterpolator decelerateInterpolator = this.h;
                    if (f12 < f13) {
                        this.f22968e = decelerateInterpolator.getInterpolation(f10 / f11) * this.d;
                    } else {
                        this.f22968e = 1.0f - decelerateInterpolator.getInterpolation(f10 / f11);
                    }
                }
            }
            this.f22967c = System.currentTimeMillis();
            invalidateSelf();
        }
        int iD = i0.b.d(this.f22968e, this.f22971i, this.f22972j);
        Paint paint = this.f22965a;
        paint.setColor(iD);
        canvas.save();
        canvas.translate(AndroidUtilities.dp(24.0f) / 2.0f, AndroidUtilities.dp(24.0f) / 2.0f);
        int i10 = this.f22974l;
        if (i10 != 0) {
            canvas.rotate(i10);
        }
        float f14 = this.f22968e;
        canvas.translate(-AndroidUtilities.dp(0.66f), 0.0f);
        if (this.f22970g) {
            canvas.rotate((this.f22968e * (this.f22966b ? -180 : 180)) + 135.0f);
            f14 = 1.0f;
        } else {
            canvas.rotate(this.f22968e * (this.f22966b ? -225 : 135));
        }
        float f15 = 1.0f - f14;
        canvas.drawLine(AndroidUtilities.dp(AndroidUtilities.lerp(-6.75f, -8.0f, f14)), 0.0f, AndroidUtilities.dp(8.0f) - ((paint.getStrokeWidth() / 2.0f) * f15), 0.0f, paint);
        float fDp = AndroidUtilities.dp(-0.25f);
        float fDp2 = AndroidUtilities.dp(AndroidUtilities.lerp(7.0f, 8.0f, f14)) - ((paint.getStrokeWidth() / 4.0f) * f15);
        float fDp3 = AndroidUtilities.dp(AndroidUtilities.lerp(-7.25f, 0.0f, f14));
        canvas.drawLine(fDp3, -fDp, 0.0f, -fDp2, paint);
        canvas.drawLine(fDp3, fDp, 0.0f, fDp2, paint);
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
        this.f22965a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f22965a.setColorFilter(colorFilter);
    }
}
