package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
public final class a61 extends Drawable {
    public static final int[] f33312r = {10, 7, 26, 16, 10, 25};
    public final Paint f33313a;
    public final TextPaint f33314b;
    public final Path f33315c;
    public boolean d;
    public final boolean f33316e;
    public Path f33317f;
    public int f33318g;
    public float h;
    public float f33319i;
    public boolean f33320j;
    public boolean f33321k;
    public boolean f33322l;
    public long f33323m;
    public z51 f33324n;
    public long f33325o;
    public String f33326p;
    public float f33327q;

    public a61(boolean z10) {
        Paint paint = new Paint(1);
        this.f33313a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f33314b = textPaint;
        Path path = new Path();
        this.f33315c = path;
        this.f33327q = 1.0f;
        this.f33316e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i7 = 0; i7 < 3; i7++) {
            int[] iArr = f33312r;
            if (i7 == 0) {
                int i10 = i7 * 2;
                this.f33315c.moveTo(org.telegram.messenger.g0.L(iArr[i10]), org.telegram.messenger.g0.L(iArr[i10 + 1]));
            } else {
                int i11 = i7 * 2;
                this.f33315c.lineTo(org.telegram.messenger.g0.L(iArr[i11]), org.telegram.messenger.g0.L(iArr[i11 + 1]));
            }
        }
        this.f33315c.close();
    }

    public final void a() {
        z51 z51Var = this.f33324n;
        if (z51Var != null) {
            z51Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f33320j;
    }

    public final void c(org.telegram.ui.to0 to0Var) {
        this.f33324n = to0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f33321k) {
            return;
        }
        if (z11 != z10) {
            this.f33325o = 0L;
            this.f33326p = null;
        }
        this.d = z10;
        this.f33320j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a61.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f33321k != z10) {
            this.f33321k = z10;
            this.f33326p = null;
            this.f33325o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f33322l = z10;
        a();
    }

    public final void g(long j3) {
        this.f33325o = j3;
        if (j3 >= 1000) {
            this.f33326p = org.telegram.messenger.hd.G((int) (j3 / 1000), "Seconds", new Object[0]);
        } else {
            this.f33326p = null;
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
        this.f33313a.setAlpha(i7);
        this.f33314b.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f33313a.setColorFilter(colorFilter);
    }
}
