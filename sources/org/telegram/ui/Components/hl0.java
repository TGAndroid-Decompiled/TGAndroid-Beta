package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class hl0 extends Drawable {
    public long f29111a;
    public boolean f29112b;
    public Paint f29113c;
    public float d;
    public float f29114e;
    public float f29115f;
    public int f29116g;
    public int h;
    public int f29117i;
    public org.telegram.ui.Cells.t1 f29118j;
    public float f29119k;
    public int f29120l;
    public int f29121m;
    public org.telegram.ui.ActionBar.b6 f29122n;

    public final void a() {
        if (this.f29112b) {
            return;
        }
        this.f29111a = System.currentTimeMillis();
        this.f29112b = true;
        this.f29118j.invalidate();
    }

    public final void b() {
        if (!this.f29112b) {
            return;
        }
        this.f29112b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f29113c;
        paint.setColor(i0.a.d(this.f29119k, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23097ic, this.f29122n), this.f29120l));
        int i9 = this.f29121m;
        if (i9 != 255) {
            paint.setAlpha((int) ((paint.getAlpha() / 255.0f) * i9));
        }
        int i10 = getBounds().left;
        int i11 = getBounds().top;
        int i12 = 0;
        while (i12 < 3) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(AndroidUtilities.dp(2.0f) + i10, AndroidUtilities.dp((this.d * 7.0f) + 2.0f) + i11, AndroidUtilities.dp(4.0f) + i10, AndroidUtilities.dp(10.0f) + i11, paint);
            canvas2.drawRect(AndroidUtilities.dp(5.0f) + i10, AndroidUtilities.dp((this.f29114e * 7.0f) + 2.0f) + i11, AndroidUtilities.dp(7.0f) + i10, AndroidUtilities.dp(10.0f) + i11, paint);
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i10, AndroidUtilities.dp((this.f29115f * 7.0f) + 2.0f) + i11, AndroidUtilities.dp(10.0f) + i10, AndroidUtilities.dp(10.0f) + i11, paint);
            i12++;
            canvas = canvas2;
        }
        if (this.f29112b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f29111a;
            this.f29111a = currentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            float f10 = (float) j10;
            float f11 = ((f10 / 300.0f) * this.f29116g) + this.d;
            this.d = f11;
            if (f11 > 1.0f) {
                this.f29116g = -1;
                this.d = 1.0f;
            } else if (f11 < 0.0f) {
                this.f29116g = 1;
                this.d = 0.0f;
            }
            float f12 = ((f10 / 310.0f) * this.h) + this.f29114e;
            this.f29114e = f12;
            if (f12 > 1.0f) {
                this.h = -1;
                this.f29114e = 1.0f;
            } else if (f12 < 0.0f) {
                this.h = 1;
                this.f29114e = 0.0f;
            }
            float f13 = ((f10 / 320.0f) * this.f29117i) + this.f29115f;
            this.f29115f = f13;
            if (f13 > 1.0f) {
                this.f29117i = -1;
                this.f29115f = 1.0f;
            } else if (f13 < 0.0f) {
                this.f29117i = 1;
                this.f29115f = 0.0f;
            }
            this.f29118j.invalidate();
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
    public final void setAlpha(int i9) {
        this.f29121m = i9;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
