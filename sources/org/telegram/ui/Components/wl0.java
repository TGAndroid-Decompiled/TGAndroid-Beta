package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class wl0 extends Drawable {
    public long f32306a;
    public boolean f32307b;
    public Paint f32308c;
    public float d;
    public float f32309e;
    public float f32310f;
    public int f32311g;
    public int h;
    public int f32312i;
    public org.telegram.ui.Cells.t1 f32313j;
    public float f32314k;
    public int f32315l;
    public int f32316m;
    public org.telegram.ui.ActionBar.f6 f32317n;

    public final void a() {
        if (this.f32307b) {
            return;
        }
        this.f32306a = System.currentTimeMillis();
        this.f32307b = true;
        this.f32313j.invalidate();
    }

    public final void b() {
        if (!this.f32307b) {
            return;
        }
        this.f32307b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f32308c;
        paint.setColor(i0.a.d(this.f32314k, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20786ic, this.f32317n), this.f32315l));
        int i10 = this.f32316m;
        if (i10 != 255) {
            paint.setAlpha((int) ((paint.getAlpha() / 255.0f) * i10));
        }
        int i11 = getBounds().left;
        int i12 = getBounds().top;
        int i13 = 0;
        while (i13 < 3) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(AndroidUtilities.dp(2.0f) + i11, AndroidUtilities.dp((this.d * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(4.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(5.0f) + i11, AndroidUtilities.dp((this.f32309e * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(7.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i11, AndroidUtilities.dp((this.f32310f * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.f32307b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f32306a;
            this.f32306a = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f7 = (float) j3;
            float f10 = ((f7 / 300.0f) * this.f32311g) + this.d;
            this.d = f10;
            if (f10 > 1.0f) {
                this.f32311g = -1;
                this.d = 1.0f;
            } else if (f10 < 0.0f) {
                this.f32311g = 1;
                this.d = 0.0f;
            }
            float f11 = ((f7 / 310.0f) * this.h) + this.f32309e;
            this.f32309e = f11;
            if (f11 > 1.0f) {
                this.h = -1;
                this.f32309e = 1.0f;
            } else if (f11 < 0.0f) {
                this.h = 1;
                this.f32309e = 0.0f;
            }
            float f12 = ((f7 / 320.0f) * this.f32312i) + this.f32310f;
            this.f32310f = f12;
            if (f12 > 1.0f) {
                this.f32312i = -1;
                this.f32310f = 1.0f;
            } else if (f12 < 0.0f) {
                this.f32312i = 1;
                this.f32310f = 0.0f;
            }
            this.f32313j.invalidate();
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
        this.f32316m = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
