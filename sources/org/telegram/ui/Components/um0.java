package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class um0 extends Drawable {
    public long f30968a;
    public boolean f30969b;
    public Paint f30970c;
    public float d;
    public float e;
    public float f30971f;
    public int f30972g;
    public int h;
    public int f30973i;
    public org.telegram.ui.Cells.u1 f30974j;
    public float f30975k;
    public int f30976l;
    public int f30977m;
    public org.telegram.ui.ActionBar.d6 f30978n;

    public final void a() {
        if (this.f30969b) {
            return;
        }
        this.f30968a = System.currentTimeMillis();
        this.f30969b = true;
        this.f30974j.invalidate();
    }

    public final void b() {
        if (!this.f30969b) {
            return;
        }
        this.f30969b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f30970c;
        paint.setColor(i0.a.f(this.f30975k, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21088ic, this.f30978n), this.f30976l));
        int i10 = this.f30977m;
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
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i11, AndroidUtilities.dp((this.f30971f * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.f30969b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f30968a;
            this.f30968a = currentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            float f7 = (float) j10;
            float f10 = ((f7 / 300.0f) * this.f30972g) + this.d;
            this.d = f10;
            if (f10 > 1.0f) {
                this.f30972g = -1;
                this.d = 1.0f;
            } else if (f10 < 0.0f) {
                this.f30972g = 1;
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
            float f12 = ((f7 / 320.0f) * this.f30973i) + this.f30971f;
            this.f30971f = f12;
            if (f12 > 1.0f) {
                this.f30973i = -1;
                this.f30971f = 1.0f;
            } else if (f12 < 0.0f) {
                this.f30973i = 1;
                this.f30971f = 0.0f;
            }
            this.f30974j.invalidate();
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
        this.f30977m = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
