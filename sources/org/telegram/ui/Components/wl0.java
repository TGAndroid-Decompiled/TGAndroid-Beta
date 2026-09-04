package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class wl0 extends Drawable {
    public long f32279a;
    public boolean f32280b;
    public Paint f32281c;
    public float d;
    public float f32282e;
    public float f32283f;
    public int f32284g;
    public int h;
    public int f32285i;
    public org.telegram.ui.Cells.t1 f32286j;
    public float f32287k;
    public int f32288l;
    public int f32289m;
    public org.telegram.ui.ActionBar.f6 f32290n;

    public final void a() {
        if (this.f32280b) {
            return;
        }
        this.f32279a = System.currentTimeMillis();
        this.f32280b = true;
        this.f32286j.invalidate();
    }

    public final void b() {
        if (!this.f32280b) {
            return;
        }
        this.f32280b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f32281c;
        paint.setColor(i0.a.d(this.f32287k, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20759ic, this.f32290n), this.f32288l));
        int i10 = this.f32289m;
        if (i10 != 255) {
            paint.setAlpha((int) ((paint.getAlpha() / 255.0f) * i10));
        }
        int i11 = getBounds().left;
        int i12 = getBounds().top;
        int i13 = 0;
        while (i13 < 3) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(AndroidUtilities.dp(2.0f) + i11, AndroidUtilities.dp((this.d * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(4.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(5.0f) + i11, AndroidUtilities.dp((this.f32282e * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(7.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i11, AndroidUtilities.dp((this.f32283f * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.f32280b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f32279a;
            this.f32279a = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f7 = (float) j3;
            float f10 = ((f7 / 300.0f) * this.f32284g) + this.d;
            this.d = f10;
            if (f10 > 1.0f) {
                this.f32284g = -1;
                this.d = 1.0f;
            } else if (f10 < 0.0f) {
                this.f32284g = 1;
                this.d = 0.0f;
            }
            float f11 = ((f7 / 310.0f) * this.h) + this.f32282e;
            this.f32282e = f11;
            if (f11 > 1.0f) {
                this.h = -1;
                this.f32282e = 1.0f;
            } else if (f11 < 0.0f) {
                this.h = 1;
                this.f32282e = 0.0f;
            }
            float f12 = ((f7 / 320.0f) * this.f32285i) + this.f32283f;
            this.f32283f = f12;
            if (f12 > 1.0f) {
                this.f32285i = -1;
                this.f32283f = 1.0f;
            } else if (f12 < 0.0f) {
                this.f32285i = 1;
                this.f32283f = 0.0f;
            }
            this.f32286j.invalidate();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(12.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(12.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f32289m = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
