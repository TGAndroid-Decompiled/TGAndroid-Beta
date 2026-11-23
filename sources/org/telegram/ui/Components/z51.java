package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
public final class z51 extends Drawable {
    public static final int[] f42704r = {10, 7, 26, 16, 10, 25};
    public final Paint f42705a;
    public final TextPaint f42706b;
    public final Path f42707c;
    public boolean d;
    public final boolean f42708e;
    public Path f42709f;
    public int f42710g;
    public float h;
    public float f42711i;
    public boolean f42712j;
    public boolean f42713k;
    public boolean f42714l;
    public long f42715m;
    public y51 f42716n;
    public long f42717o;
    public String f42718p;
    public float f42719q;

    public z51(boolean z10) {
        Paint paint = new Paint(1);
        this.f42705a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f42706b = textPaint;
        Path path = new Path();
        this.f42707c = path;
        this.f42719q = 1.0f;
        this.f42708e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i7 = 0; i7 < 3; i7++) {
            int[] iArr = f42704r;
            if (i7 == 0) {
                int i10 = i7 * 2;
                this.f42707c.moveTo(org.telegram.messenger.g0.L(iArr[i10]), org.telegram.messenger.g0.L(iArr[i10 + 1]));
            } else {
                int i11 = i7 * 2;
                this.f42707c.lineTo(org.telegram.messenger.g0.L(iArr[i11]), org.telegram.messenger.g0.L(iArr[i11 + 1]));
            }
        }
        this.f42707c.close();
    }

    public final void a() {
        y51 y51Var = this.f42716n;
        if (y51Var != null) {
            y51Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f42712j;
    }

    public final void c(org.telegram.ui.fo0 fo0Var) {
        this.f42716n = fo0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f42713k) {
            return;
        }
        if (z11 != z10) {
            this.f42717o = 0L;
            this.f42718p = null;
        }
        this.d = z10;
        this.f42712j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z51.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f42713k != z10) {
            this.f42713k = z10;
            this.f42718p = null;
            this.f42717o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f42714l = z10;
        a();
    }

    public final void g(long j3) {
        this.f42717o = j3;
        if (j3 >= 1000) {
            this.f42718p = org.telegram.messenger.gd.G((int) (j3 / 1000), "Seconds", new Object[0]);
        } else {
            this.f42718p = null;
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
        this.f42705a.setAlpha(i7);
        this.f42706b.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f42705a.setColorFilter(colorFilter);
    }
}
