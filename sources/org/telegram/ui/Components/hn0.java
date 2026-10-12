package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class hn0 extends Drawable {
    public long f26824a;
    public boolean f26825b;
    public Paint f26826c;
    public float d;
    public float f26827e;
    public float f26828f;
    public int f26829g;
    public int h;
    public int f26830i;
    public org.telegram.ui.Cells.u1 f26831j;
    public float f26832k;
    public int f26833l;
    public int f26834m;
    public org.telegram.ui.ActionBar.c6 f26835n;

    public final void a() {
        if (this.f26825b) {
            return;
        }
        this.f26824a = System.currentTimeMillis();
        this.f26825b = true;
        this.f26831j.invalidate();
    }

    public final void b() {
        if (!this.f26825b) {
            return;
        }
        this.f26825b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f26826c;
        paint.setColor(i0.a.d(this.f26832k, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20657ic, this.f26835n), this.f26833l));
        int i10 = this.f26834m;
        if (i10 != 255) {
            paint.setAlpha((int) ((paint.getAlpha() / 255.0f) * i10));
        }
        int i11 = getBounds().left;
        int i12 = getBounds().top;
        int i13 = 0;
        while (i13 < 3) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(AndroidUtilities.dp(2.0f) + i11, AndroidUtilities.dp((this.d * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(4.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(5.0f) + i11, AndroidUtilities.dp((this.f26827e * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(7.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i11, AndroidUtilities.dp((this.f26828f * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.f26825b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f26824a;
            this.f26824a = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f7 = (float) j3;
            float f10 = ((f7 / 300.0f) * this.f26829g) + this.d;
            this.d = f10;
            if (f10 > 1.0f) {
                this.f26829g = -1;
                this.d = 1.0f;
            } else if (f10 < 0.0f) {
                this.f26829g = 1;
                this.d = 0.0f;
            }
            float f11 = ((f7 / 310.0f) * this.h) + this.f26827e;
            this.f26827e = f11;
            if (f11 > 1.0f) {
                this.h = -1;
                this.f26827e = 1.0f;
            } else if (f11 < 0.0f) {
                this.h = 1;
                this.f26827e = 0.0f;
            }
            float f12 = ((f7 / 320.0f) * this.f26830i) + this.f26828f;
            this.f26828f = f12;
            if (f12 > 1.0f) {
                this.f26830i = -1;
                this.f26828f = 1.0f;
            } else if (f12 < 0.0f) {
                this.f26830i = 1;
                this.f26828f = 0.0f;
            }
            this.f26831j.invalidate();
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
        this.f26834m = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
