package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
public final class x51 extends Drawable {
    public static final int[] f41907r = {10, 7, 26, 16, 10, 25};
    public final Paint f41908a;
    public final TextPaint f41909b;
    public final Path f41910c;
    public boolean d;
    public final boolean f41911e;
    public Path f41912f;
    public int f41913g;
    public float h;
    public float f41914i;
    public boolean f41915j;
    public boolean f41916k;
    public boolean f41917l;
    public long f41918m;
    public w51 f41919n;
    public long f41920o;
    public String f41921p;
    public float f41922q;

    public x51(boolean z10) {
        Paint paint = new Paint(1);
        this.f41908a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f41909b = textPaint;
        Path path = new Path();
        this.f41910c = path;
        this.f41922q = 1.0f;
        this.f41911e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i7 = 0; i7 < 3; i7++) {
            int[] iArr = f41907r;
            if (i7 == 0) {
                int i10 = i7 * 2;
                this.f41910c.moveTo(org.telegram.messenger.g0.L(iArr[i10]), org.telegram.messenger.g0.L(iArr[i10 + 1]));
            } else {
                int i11 = i7 * 2;
                this.f41910c.lineTo(org.telegram.messenger.g0.L(iArr[i11]), org.telegram.messenger.g0.L(iArr[i11 + 1]));
            }
        }
        this.f41910c.close();
    }

    public final void a() {
        w51 w51Var = this.f41919n;
        if (w51Var != null) {
            w51Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f41915j;
    }

    public final void c(org.telegram.ui.so0 so0Var) {
        this.f41919n = so0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f41916k) {
            return;
        }
        if (z11 != z10) {
            this.f41920o = 0L;
            this.f41921p = null;
        }
        this.d = z10;
        this.f41915j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x51.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f41916k != z10) {
            this.f41916k = z10;
            this.f41921p = null;
            this.f41920o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f41917l = z10;
        a();
    }

    public final void g(long j3) {
        this.f41920o = j3;
        if (j3 >= 1000) {
            this.f41921p = org.telegram.messenger.gd.G((int) (j3 / 1000), "Seconds", new Object[0]);
        } else {
            this.f41921p = null;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(32.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(32.0f);
    }

    @Override
    public final int getMinimumHeight() {
        return org.telegram.messenger.g0.L(32.0f);
    }

    @Override
    public final int getMinimumWidth() {
        return org.telegram.messenger.g0.L(32.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f41908a.setAlpha(i7);
        this.f41909b.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f41908a.setColorFilter(colorFilter);
    }
}
