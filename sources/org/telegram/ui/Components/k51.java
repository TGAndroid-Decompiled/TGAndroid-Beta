package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
public final class k51 extends Drawable {
    public static final int[] f35170r = {10, 7, 26, 16, 10, 25};
    public final Paint f35171a;
    public final TextPaint f35172b;
    public final Path f35173c;
    public boolean d;
    public final boolean f35174e;
    public Path f35175f;
    public int f35176g;
    public float h;
    public float f35177i;
    public boolean f35178j;
    public boolean f35179k;
    public boolean f35180l;
    public long f35181m;
    public j51 f35182n;
    public long f35183o;
    public String f35184p;
    public float f35185q;

    public k51(boolean z9) {
        Paint paint = new Paint(1);
        this.f35171a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f35172b = textPaint;
        Path path = new Path();
        this.f35173c = path;
        this.f35185q = 1.0f;
        this.f35174e = z9;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i7 = 0; i7 < 3; i7++) {
            int[] iArr = f35170r;
            if (i7 == 0) {
                int i10 = i7 * 2;
                this.f35173c.moveTo(org.telegram.messenger.g0.L(iArr[i10]), org.telegram.messenger.g0.L(iArr[i10 + 1]));
            } else {
                int i11 = i7 * 2;
                this.f35173c.lineTo(org.telegram.messenger.g0.L(iArr[i11]), org.telegram.messenger.g0.L(iArr[i11 + 1]));
            }
        }
        this.f35173c.close();
    }

    public final void a() {
        j51 j51Var = this.f35182n;
        if (j51Var != null) {
            j51Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f35178j;
    }

    public final void c(org.telegram.ui.uo0 uo0Var) {
        this.f35182n = uo0Var;
    }

    public final void d(boolean z9) {
        boolean z10 = this.d;
        if (z10 == z9 && this.h >= 1.0f && this.f35179k) {
            return;
        }
        if (z10 != z9) {
            this.f35183o = 0L;
            this.f35184p = null;
        }
        this.d = z9;
        this.f35178j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k51.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z9) {
        if (this.f35179k != z9) {
            this.f35179k = z9;
            this.f35184p = null;
            this.f35183o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z9) {
        this.f35180l = z9;
        a();
    }

    public final void g(long j3) {
        this.f35183o = j3;
        if (j3 >= 1000) {
            this.f35184p = org.telegram.messenger.id.G((int) (j3 / 1000), "Seconds", new Object[0]);
        } else {
            this.f35184p = null;
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
        this.f35171a.setAlpha(i7);
        this.f35172b.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f35171a.setColorFilter(colorFilter);
    }
}
