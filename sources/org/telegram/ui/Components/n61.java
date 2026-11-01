package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
public final class n61 extends Drawable {
    public static final int[] f28679r = {10, 7, 26, 16, 10, 25};
    public final Paint f28680a;
    public final TextPaint f28681b;
    public final Path f28682c;
    public boolean d;
    public final boolean e;
    public Path f28683f;
    public int f28684g;
    public float h;
    public float f28685i;
    public boolean f28686j;
    public boolean f28687k;
    public boolean f28688l;
    public long f28689m;
    public m61 f28690n;
    public long f28691o;
    public String f28692p;
    public float f28693q;

    public n61(boolean z10) {
        Paint paint = new Paint(1);
        this.f28680a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f28681b = textPaint;
        Path path = new Path();
        this.f28682c = path;
        this.f28693q = 1.0f;
        this.e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.i0.L(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f28679r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f28682c.moveTo(org.telegram.messenger.i0.L(iArr[i11]), org.telegram.messenger.i0.L(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f28682c.lineTo(org.telegram.messenger.i0.L(iArr[i12]), org.telegram.messenger.i0.L(iArr[i12 + 1]));
            }
        }
        this.f28682c.close();
    }

    public final void a() {
        m61 m61Var = this.f28690n;
        if (m61Var != null) {
            m61Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f28686j;
    }

    public final void c(org.telegram.ui.zp0 zp0Var) {
        this.f28690n = zp0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f28687k) {
            return;
        }
        if (z11 != z10) {
            this.f28691o = 0L;
            this.f28692p = null;
        }
        this.d = z10;
        this.f28686j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n61.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f28687k != z10) {
            this.f28687k = z10;
            this.f28692p = null;
            this.f28691o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f28688l = z10;
        a();
    }

    public final void g(long j10) {
        this.f28691o = j10;
        if (j10 >= 1000) {
            this.f28692p = org.telegram.messenger.dd.G((int) (j10 / 1000), "Seconds", new Object[0]);
        } else {
            this.f28692p = null;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(32.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(32.0f);
    }

    @Override
    public final int getMinimumHeight() {
        return org.telegram.messenger.i0.L(32.0f);
    }

    @Override
    public final int getMinimumWidth() {
        return org.telegram.messenger.i0.L(32.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f28680a.setAlpha(i10);
        this.f28681b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28680a.setColorFilter(colorFilter);
    }
}
