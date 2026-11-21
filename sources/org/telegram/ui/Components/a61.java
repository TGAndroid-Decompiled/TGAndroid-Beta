package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
public final class a61 extends Drawable {
    public static final int[] f33333r = {10, 7, 26, 16, 10, 25};
    public final Paint f33334a;
    public final TextPaint f33335b;
    public final Path f33336c;
    public boolean d;
    public final boolean f33337e;
    public Path f33338f;
    public int f33339g;
    public float h;
    public float f33340i;
    public boolean f33341j;
    public boolean f33342k;
    public boolean f33343l;
    public long f33344m;
    public z51 f33345n;
    public long f33346o;
    public String f33347p;
    public float f33348q;

    public a61(boolean z10) {
        Paint paint = new Paint(1);
        this.f33334a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f33335b = textPaint;
        Path path = new Path();
        this.f33336c = path;
        this.f33348q = 1.0f;
        this.f33337e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i7 = 0; i7 < 3; i7++) {
            int[] iArr = f33333r;
            if (i7 == 0) {
                int i10 = i7 * 2;
                this.f33336c.moveTo(org.telegram.messenger.g0.L(iArr[i10]), org.telegram.messenger.g0.L(iArr[i10 + 1]));
            } else {
                int i11 = i7 * 2;
                this.f33336c.lineTo(org.telegram.messenger.g0.L(iArr[i11]), org.telegram.messenger.g0.L(iArr[i11 + 1]));
            }
        }
        this.f33336c.close();
    }

    public final void a() {
        z51 z51Var = this.f33345n;
        if (z51Var != null) {
            z51Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f33341j;
    }

    public final void c(org.telegram.ui.so0 so0Var) {
        this.f33345n = so0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f33342k) {
            return;
        }
        if (z11 != z10) {
            this.f33346o = 0L;
            this.f33347p = null;
        }
        this.d = z10;
        this.f33341j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a61.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f33342k != z10) {
            this.f33342k = z10;
            this.f33347p = null;
            this.f33346o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f33343l = z10;
        a();
    }

    public final void g(long j3) {
        this.f33346o = j3;
        if (j3 >= 1000) {
            this.f33347p = org.telegram.messenger.gd.G((int) (j3 / 1000), "Seconds", new Object[0]);
        } else {
            this.f33347p = null;
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
        this.f33334a.setAlpha(i7);
        this.f33335b.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f33334a.setColorFilter(colorFilter);
    }
}
