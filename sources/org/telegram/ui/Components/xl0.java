package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class xl0 extends Drawable {
    public long f29934a;
    public boolean f29935b;
    public Paint f29936c;
    public float d;
    public float e;
    public float f29937f;
    public int f29938g;
    public int h;
    public int f29939i;
    public org.telegram.ui.Cells.t1 f29940j;
    public float f29941k;
    public int f29942l;
    public int f29943m;
    public org.telegram.ui.ActionBar.f6 f29944n;

    public final void a() {
        if (this.f29935b) {
            return;
        }
        this.f29934a = System.currentTimeMillis();
        this.f29935b = true;
        this.f29940j.invalidate();
    }

    public final void b() {
        if (!this.f29935b) {
            return;
        }
        this.f29935b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f29936c;
        paint.setColor(i0.a.d(this.f29941k, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18959ic, this.f29944n), this.f29942l));
        int i10 = this.f29943m;
        if (i10 != 255) {
            paint.setAlpha((int) ((paint.getAlpha() / 255.0f) * i10));
        }
        int i11 = getBounds().left;
        int i12 = getBounds().top;
        int i13 = 0;
        while (i13 < 3) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(AndroidUtilities.dp(2.0f) + i11, AndroidUtilities.dp((this.d * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(4.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(5.0f) + i11, AndroidUtilities.dp((this.e * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(7.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i11, AndroidUtilities.dp((this.f29937f * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.f29935b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f29934a;
            this.f29934a = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f7 = (float) j3;
            float f10 = ((f7 / 300.0f) * this.f29938g) + this.d;
            this.d = f10;
            if (f10 > 1.0f) {
                this.f29938g = -1;
                this.d = 1.0f;
            } else if (f10 < 0.0f) {
                this.f29938g = 1;
                this.d = 0.0f;
            }
            float f11 = ((f7 / 310.0f) * this.h) + this.e;
            this.e = f11;
            if (f11 > 1.0f) {
                this.h = -1;
                this.e = 1.0f;
            } else if (f11 < 0.0f) {
                this.h = 1;
                this.e = 0.0f;
            }
            float f12 = ((f7 / 320.0f) * this.f29939i) + this.f29937f;
            this.f29937f = f12;
            if (f12 > 1.0f) {
                this.f29939i = -1;
                this.f29937f = 1.0f;
            } else if (f12 < 0.0f) {
                this.f29939i = 1;
                this.f29937f = 0.0f;
            }
            this.f29940j.invalidate();
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
        this.f29943m = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
