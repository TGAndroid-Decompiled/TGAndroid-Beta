package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class nm0 extends Drawable {
    public long f29107a;
    public boolean f29108b;
    public Paint f29109c;
    public float d;
    public float f29110e;
    public float f29111f;
    public int f29112g;
    public int h;
    public int f29113i;
    public org.telegram.ui.Cells.u1 f29114j;
    public float f29115k;
    public int f29116l;
    public int f29117m;
    public org.telegram.ui.ActionBar.d6 f29118n;

    public final void a() {
        if (this.f29108b) {
            return;
        }
        this.f29107a = System.currentTimeMillis();
        this.f29108b = true;
        this.f29114j.invalidate();
    }

    public final void b() {
        if (!this.f29108b) {
            return;
        }
        this.f29108b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f29109c;
        paint.setColor(i0.a.d(this.f29115k, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20924ic, this.f29118n), this.f29116l));
        int i10 = this.f29117m;
        if (i10 != 255) {
            paint.setAlpha((int) ((paint.getAlpha() / 255.0f) * i10));
        }
        int i11 = getBounds().left;
        int i12 = getBounds().top;
        int i13 = 0;
        while (i13 < 3) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(AndroidUtilities.dp(2.0f) + i11, AndroidUtilities.dp((this.d * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(4.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(5.0f) + i11, AndroidUtilities.dp((this.f29110e * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(7.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i11, AndroidUtilities.dp((this.f29111f * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.f29108b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f29107a;
            this.f29107a = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f7 = (float) j3;
            float f10 = ((f7 / 300.0f) * this.f29112g) + this.d;
            this.d = f10;
            if (f10 > 1.0f) {
                this.f29112g = -1;
                this.d = 1.0f;
            } else if (f10 < 0.0f) {
                this.f29112g = 1;
                this.d = 0.0f;
            }
            float f11 = ((f7 / 310.0f) * this.h) + this.f29110e;
            this.f29110e = f11;
            if (f11 > 1.0f) {
                this.h = -1;
                this.f29110e = 1.0f;
            } else if (f11 < 0.0f) {
                this.h = 1;
                this.f29110e = 0.0f;
            }
            float f12 = ((f7 / 320.0f) * this.f29113i) + this.f29111f;
            this.f29111f = f12;
            if (f12 > 1.0f) {
                this.f29113i = -1;
                this.f29111f = 1.0f;
            } else if (f12 < 0.0f) {
                this.f29113i = 1;
                this.f29111f = 0.0f;
            }
            this.f29114j.invalidate();
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
        this.f29117m = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
