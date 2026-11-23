package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
public final class a61 extends Drawable {
    public static final int[] f33346r = {10, 7, 26, 16, 10, 25};
    public final Paint f33347a;
    public final TextPaint f33348b;
    public final Path f33349c;
    public boolean d;
    public final boolean f33350e;
    public Path f33351f;
    public int f33352g;
    public float h;
    public float f33353i;
    public boolean f33354j;
    public boolean f33355k;
    public boolean f33356l;
    public long f33357m;
    public z51 f33358n;
    public long f33359o;
    public String f33360p;
    public float f33361q;

    public a61(boolean z10) {
        Paint paint = new Paint(1);
        this.f33347a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f33348b = textPaint;
        Path path = new Path();
        this.f33349c = path;
        this.f33361q = 1.0f;
        this.f33350e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i7 = 0; i7 < 3; i7++) {
            int[] iArr = f33346r;
            if (i7 == 0) {
                int i10 = i7 * 2;
                this.f33349c.moveTo(org.telegram.messenger.g0.L(iArr[i10]), org.telegram.messenger.g0.L(iArr[i10 + 1]));
            } else {
                int i11 = i7 * 2;
                this.f33349c.lineTo(org.telegram.messenger.g0.L(iArr[i11]), org.telegram.messenger.g0.L(iArr[i11 + 1]));
            }
        }
        this.f33349c.close();
    }

    public final void a() {
        z51 z51Var = this.f33358n;
        if (z51Var != null) {
            z51Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f33354j;
    }

    public final void c(org.telegram.ui.so0 so0Var) {
        this.f33358n = so0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f33355k) {
            return;
        }
        if (z11 != z10) {
            this.f33359o = 0L;
            this.f33360p = null;
        }
        this.d = z10;
        this.f33354j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a61.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f33355k != z10) {
            this.f33355k = z10;
            this.f33360p = null;
            this.f33359o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f33356l = z10;
        a();
    }

    public final void g(long j3) {
        this.f33359o = j3;
        if (j3 >= 1000) {
            this.f33360p = org.telegram.messenger.hd.G((int) (j3 / 1000), "Seconds", new Object[0]);
        } else {
            this.f33360p = null;
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
        this.f33347a.setAlpha(i7);
        this.f33348b.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f33347a.setColorFilter(colorFilter);
    }
}
