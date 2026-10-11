package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class dn0 extends Drawable {
    public long f25631a;
    public boolean f25632b;
    public Paint f25633c;
    public float d;
    public float f25634e;
    public float f25635f;
    public int f25636g;
    public int h;
    public int f25637i;
    public org.telegram.ui.Cells.u1 f25638j;
    public float f25639k;
    public int f25640l;
    public int f25641m;
    public org.telegram.ui.ActionBar.d6 f25642n;

    public final void a() {
        if (this.f25632b) {
            return;
        }
        this.f25631a = System.currentTimeMillis();
        this.f25632b = true;
        this.f25638j.invalidate();
    }

    public final void b() {
        if (!this.f25632b) {
            return;
        }
        this.f25632b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f25633c;
        paint.setColor(i0.a.d(this.f25639k, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20883ic, this.f25642n), this.f25640l));
        int i10 = this.f25641m;
        if (i10 != 255) {
            paint.setAlpha((int) ((paint.getAlpha() / 255.0f) * i10));
        }
        int i11 = getBounds().left;
        int i12 = getBounds().top;
        int i13 = 0;
        while (i13 < 3) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(AndroidUtilities.dp(2.0f) + i11, AndroidUtilities.dp((this.d * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(4.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(5.0f) + i11, AndroidUtilities.dp((this.f25634e * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(7.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i11, AndroidUtilities.dp((this.f25635f * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.f25632b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f25631a;
            this.f25631a = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f7 = (float) j3;
            float f10 = ((f7 / 300.0f) * this.f25636g) + this.d;
            this.d = f10;
            if (f10 > 1.0f) {
                this.f25636g = -1;
                this.d = 1.0f;
            } else if (f10 < 0.0f) {
                this.f25636g = 1;
                this.d = 0.0f;
            }
            float f11 = ((f7 / 310.0f) * this.h) + this.f25634e;
            this.f25634e = f11;
            if (f11 > 1.0f) {
                this.h = -1;
                this.f25634e = 1.0f;
            } else if (f11 < 0.0f) {
                this.h = 1;
                this.f25634e = 0.0f;
            }
            float f12 = ((f7 / 320.0f) * this.f25637i) + this.f25635f;
            this.f25635f = f12;
            if (f12 > 1.0f) {
                this.f25637i = -1;
                this.f25635f = 1.0f;
            } else if (f12 < 0.0f) {
                this.f25637i = 1;
                this.f25635f = 0.0f;
            }
            this.f25638j.invalidate();
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
        this.f25641m = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
