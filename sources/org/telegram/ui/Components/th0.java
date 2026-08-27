package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

public final class th0 extends Drawable {

    public final Drawable f32782a;

    public final Drawable f32783b;

    public final Paint f32784c;
    public final RectF d;

    public int f32785e;

    public long f32786f;

    public float f32787g;
    public boolean h;

    public boolean f32788i;

    public th0(Context context) {
        Paint paint = new Paint(1);
        this.f32784c = paint;
        this.d = new RectF();
        this.f32785e = 0;
        this.f32782a = context.getResources().getDrawable(R.drawable.outline_shield_plain_24).mutate();
        this.f32783b = context.getResources().getDrawable(R.drawable.outline_shield_check).mutate();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f32786f = SystemClock.elapsedRealtime();
    }

    public final void a(Drawable drawable) {
        Rect bounds = getBounds();
        drawable.setBounds(org.telegram.messenger.rl.v(2, bounds.centerX(), drawable), org.telegram.messenger.rl.e(2, bounds.centerY(), drawable), org.telegram.messenger.rl.A(2, bounds.centerX(), drawable), org.telegram.messenger.rl.y(2, bounds.centerY(), drawable));
    }

    public final void b(boolean z10, boolean z11, boolean z12) {
        this.f32788i = z10;
        this.h = z11;
        this.f32786f = SystemClock.elapsedRealtime();
        if (!z12) {
            this.f32787g = this.h ? 1.0f : 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        float f10;
        float f11;
        float f12;
        float f13;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - this.f32786f;
        this.f32786f = jElapsedRealtime;
        boolean z11 = this.f32788i;
        Drawable drawable = this.f32782a;
        if (z11) {
            if (!this.h || this.f32787g != 1.0f) {
                a(drawable);
                drawable.draw(canvas);
                int i10 = (int) ((1.0f - this.f32787g) * 255.0f);
                Paint paint = this.f32784c;
                paint.setAlpha(i10);
                this.f32785e += (int) ((360 * j10) / 1000.0f);
                int iWidth = getBounds().width();
                int iHeight = getBounds().height();
                int iDp = AndroidUtilities.dp(4.0f);
                int i11 = (iWidth / 2) - iDp;
                int i12 = (iHeight / 2) - iDp;
                RectF rectF = this.d;
                rectF.set(i11, i12, i11 + iDp + iDp, i12 + iDp + iDp);
                canvas2 = canvas;
                canvas2.drawArc(rectF, this.f32785e - 90, 90.0f, false, paint);
                invalidateSelf();
            }
            if (this.f32788i && (this.h || this.f32787g != 0.0f)) {
                int i13 = (int) (this.f32787g * 255.0f);
                Drawable drawable2 = this.f32783b;
                drawable2.setAlpha(i13);
                a(drawable2);
                drawable2.draw(canvas2);
            }
            z10 = this.h;
            if (z10) {
                f12 = this.f32787g;
                if (f12 != 1.0f) {
                    f13 = (j10 / 300.0f) + f12;
                    this.f32787g = f13;
                    if (f13 > 1.0f) {
                        this.f32787g = 1.0f;
                    }
                    invalidateSelf();
                    return;
                }
            }
            if (z10) {
            }
            f10 = this.f32787g;
            if (f10 != 0.0f) {
                f11 = f10 - (j10 / 300.0f);
                this.f32787g = f11;
                if (f11 < 0.0f) {
                    this.f32787g = 0.0f;
                }
                invalidateSelf();
            }
        }
        a(drawable);
        drawable.draw(canvas);
        canvas2 = canvas;
        if (this.f32788i) {
            int i14 = (int) (this.f32787g * 255.0f);
            Drawable drawable3 = this.f32783b;
            drawable3.setAlpha(i14);
            a(drawable3);
            drawable3.draw(canvas2);
        }
        z10 = this.h;
        if (z10) {
            f12 = this.f32787g;
            if (f12 != 1.0f) {
                f13 = (j10 / 300.0f) + f12;
                this.f32787g = f13;
                if (f13 > 1.0f) {
                    this.f32787g = 1.0f;
                }
                invalidateSelf();
                return;
            }
        }
        if (z10) {
            f10 = this.f32787g;
            if (f10 != 0.0f) {
                f11 = f10 - (j10 / 300.0f);
                this.f32787g = f11;
                if (f11 < 0.0f) {
                    this.f32787g = 0.0f;
                }
                invalidateSelf();
            }
        }
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
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f32782a.setColorFilter(colorFilter);
        this.f32783b.setColorFilter(colorFilter);
        this.f32784c.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
