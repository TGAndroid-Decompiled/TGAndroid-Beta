package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
public final class i51 extends Drawable {
    public static final int[] f34458r = {10, 7, 26, 16, 10, 25};
    public final Paint f34459a;
    public final TextPaint f34460b;
    public final Path f34461c;
    public boolean d;
    public final boolean f34462e;
    public Path f34463f;
    public int f34464g;
    public float h;
    public float f34465i;
    public boolean f34466j;
    public boolean f34467k;
    public boolean f34468l;
    public long f34469m;
    public h51 f34470n;
    public long f34471o;
    public String f34472p;
    public float f34473q;

    public i51(boolean z9) {
        Paint paint = new Paint(1);
        this.f34459a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f34460b = textPaint;
        Path path = new Path();
        this.f34461c = path;
        this.f34473q = 1.0f;
        this.f34462e = z9;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i7 = 0; i7 < 3; i7++) {
            int[] iArr = f34458r;
            if (i7 == 0) {
                int i10 = i7 * 2;
                this.f34461c.moveTo(org.telegram.messenger.g0.L(iArr[i10]), org.telegram.messenger.g0.L(iArr[i10 + 1]));
            } else {
                int i11 = i7 * 2;
                this.f34461c.lineTo(org.telegram.messenger.g0.L(iArr[i11]), org.telegram.messenger.g0.L(iArr[i11 + 1]));
            }
        }
        this.f34461c.close();
    }

    public final void a() {
        h51 h51Var = this.f34470n;
        if (h51Var != null) {
            h51Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f34466j;
    }

    public final void c(org.telegram.ui.ro0 ro0Var) {
        this.f34470n = ro0Var;
    }

    public final void d(boolean z9) {
        boolean z10 = this.d;
        if (z10 == z9 && this.h >= 1.0f && this.f34467k) {
            return;
        }
        if (z10 != z9) {
            this.f34471o = 0L;
            this.f34472p = null;
        }
        this.d = z9;
        this.f34466j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i51.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z9) {
        if (this.f34467k != z9) {
            this.f34467k = z9;
            this.f34472p = null;
            this.f34471o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z9) {
        this.f34468l = z9;
        a();
    }

    public final void g(long j3) {
        this.f34471o = j3;
        if (j3 >= 1000) {
            this.f34472p = org.telegram.messenger.hd.G((int) (j3 / 1000), "Seconds", new Object[0]);
        } else {
            this.f34472p = null;
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
        this.f34459a.setAlpha(i7);
        this.f34460b.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f34459a.setColorFilter(colorFilter);
    }
}
