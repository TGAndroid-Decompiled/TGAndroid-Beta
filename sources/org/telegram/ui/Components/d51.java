package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
public final class d51 extends Drawable {
    public static final int[] f32936r = {10, 7, 26, 16, 10, 25};
    public final Paint f32937a;
    public final TextPaint f32938b;
    public final Path f32939c;
    public boolean d;
    public final boolean f32940e;
    public Path f32941f;
    public int f32942g;
    public float h;
    public float f32943i;
    public boolean f32944j;
    public boolean f32945k;
    public boolean f32946l;
    public long f32947m;
    public c51 f32948n;
    public long f32949o;
    public String f32950p;
    public float f32951q;

    public d51(boolean z10) {
        Paint paint = new Paint(1);
        this.f32937a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f32938b = textPaint;
        Path path = new Path();
        this.f32939c = path;
        this.f32951q = 1.0f;
        this.f32940e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i3 = 0; i3 < 3; i3++) {
            int[] iArr = f32936r;
            if (i3 == 0) {
                int i10 = i3 * 2;
                this.f32939c.moveTo(org.telegram.messenger.g0.L(iArr[i10]), org.telegram.messenger.g0.L(iArr[i10 + 1]));
            } else {
                int i11 = i3 * 2;
                this.f32939c.lineTo(org.telegram.messenger.g0.L(iArr[i11]), org.telegram.messenger.g0.L(iArr[i11 + 1]));
            }
        }
        this.f32939c.close();
    }

    public final void a() {
        c51 c51Var = this.f32948n;
        if (c51Var != null) {
            c51Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f32944j;
    }

    public final void c(org.telegram.ui.io0 io0Var) {
        this.f32948n = io0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f32945k) {
            return;
        }
        if (z11 != z10) {
            this.f32949o = 0L;
            this.f32950p = null;
        }
        this.d = z10;
        this.f32944j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d51.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f32945k != z10) {
            this.f32945k = z10;
            this.f32950p = null;
            this.f32949o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f32946l = z10;
        a();
    }

    public final void g(long j10) {
        this.f32949o = j10;
        if (j10 >= 1000) {
            this.f32950p = org.telegram.messenger.bd.G((int) (j10 / 1000), "Seconds", new Object[0]);
        } else {
            this.f32950p = null;
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
    public final void setAlpha(int i3) {
        this.f32937a.setAlpha(i3);
        this.f32938b.setAlpha(i3);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f32937a.setColorFilter(colorFilter);
    }
}
