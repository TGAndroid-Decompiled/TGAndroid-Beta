package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class xl0 extends Drawable {
    public long f29931a;
    public boolean f29932b;
    public Paint f29933c;
    public float d;
    public float e;
    public float f29934f;
    public int f29935g;
    public int h;
    public int f29936i;
    public org.telegram.ui.Cells.t1 f29937j;
    public float f29938k;
    public int f29939l;
    public int f29940m;
    public org.telegram.ui.ActionBar.f6 f29941n;

    public final void a() {
        if (this.f29932b) {
            return;
        }
        this.f29931a = System.currentTimeMillis();
        this.f29932b = true;
        this.f29937j.invalidate();
    }

    public final void b() {
        if (!this.f29932b) {
            return;
        }
        this.f29932b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f29933c;
        paint.setColor(i0.a.d(this.f29938k, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18958ic, this.f29941n), this.f29939l));
        int i10 = this.f29940m;
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
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i11, AndroidUtilities.dp((this.f29934f * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.f29932b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f29931a;
            this.f29931a = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f7 = (float) j3;
            float f10 = ((f7 / 300.0f) * this.f29935g) + this.d;
            this.d = f10;
            if (f10 > 1.0f) {
                this.f29935g = -1;
                this.d = 1.0f;
            } else if (f10 < 0.0f) {
                this.f29935g = 1;
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
            float f12 = ((f7 / 320.0f) * this.f29936i) + this.f29934f;
            this.f29934f = f12;
            if (f12 > 1.0f) {
                this.f29936i = -1;
                this.f29934f = 1.0f;
            } else if (f12 < 0.0f) {
                this.f29936i = 1;
                this.f29934f = 0.0f;
            }
            this.f29937j.invalidate();
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
        this.f29940m = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
