package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
public final class j51 extends Drawable {
    public static final int[] f34880r = {10, 7, 26, 16, 10, 25};
    public final Paint f34881a;
    public final TextPaint f34882b;
    public final Path f34883c;
    public boolean d;
    public final boolean f34884e;
    public Path f34885f;
    public int f34886g;
    public float h;
    public float f34887i;
    public boolean f34888j;
    public boolean f34889k;
    public boolean f34890l;
    public long f34891m;
    public i51 f34892n;
    public long f34893o;
    public String f34894p;
    public float f34895q;

    public j51(boolean z9) {
        Paint paint = new Paint(1);
        this.f34881a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f34882b = textPaint;
        Path path = new Path();
        this.f34883c = path;
        this.f34895q = 1.0f;
        this.f34884e = z9;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i7 = 0; i7 < 3; i7++) {
            int[] iArr = f34880r;
            if (i7 == 0) {
                int i10 = i7 * 2;
                this.f34883c.moveTo(org.telegram.messenger.g0.L(iArr[i10]), org.telegram.messenger.g0.L(iArr[i10 + 1]));
            } else {
                int i11 = i7 * 2;
                this.f34883c.lineTo(org.telegram.messenger.g0.L(iArr[i11]), org.telegram.messenger.g0.L(iArr[i11 + 1]));
            }
        }
        this.f34883c.close();
    }

    public final void a() {
        i51 i51Var = this.f34892n;
        if (i51Var != null) {
            i51Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f34888j;
    }

    public final void c(org.telegram.ui.ro0 ro0Var) {
        this.f34892n = ro0Var;
    }

    public final void d(boolean z9) {
        boolean z10 = this.d;
        if (z10 == z9 && this.h >= 1.0f && this.f34889k) {
            return;
        }
        if (z10 != z9) {
            this.f34893o = 0L;
            this.f34894p = null;
        }
        this.d = z9;
        this.f34888j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j51.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z9) {
        if (this.f34889k != z9) {
            this.f34889k = z9;
            this.f34894p = null;
            this.f34893o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z9) {
        this.f34890l = z9;
        a();
    }

    public final void g(long j3) {
        this.f34893o = j3;
        if (j3 >= 1000) {
            this.f34894p = org.telegram.messenger.hd.G((int) (j3 / 1000), "Seconds", new Object[0]);
        } else {
            this.f34894p = null;
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
        this.f34881a.setAlpha(i7);
        this.f34882b.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f34881a.setColorFilter(colorFilter);
    }
}
