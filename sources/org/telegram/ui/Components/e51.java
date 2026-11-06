package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
public final class e51 extends Drawable {
    public static final int[] f33143r = {10, 7, 26, 16, 10, 25};
    public final Paint f33144a;
    public final TextPaint f33145b;
    public final Path f33146c;
    public boolean d;
    public final boolean f33147e;
    public Path f33148f;
    public int f33149g;
    public float h;
    public float f33150i;
    public boolean f33151j;
    public boolean f33152k;
    public boolean f33153l;
    public long f33154m;
    public d51 f33155n;
    public long f33156o;
    public String f33157p;
    public float f33158q;

    public e51(boolean z9) {
        Paint paint = new Paint(1);
        this.f33144a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f33145b = textPaint;
        Path path = new Path();
        this.f33146c = path;
        this.f33158q = 1.0f;
        this.f33147e = z9;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i7 = 0; i7 < 3; i7++) {
            int[] iArr = f33143r;
            if (i7 == 0) {
                int i10 = i7 * 2;
                this.f33146c.moveTo(org.telegram.messenger.g0.L(iArr[i10]), org.telegram.messenger.g0.L(iArr[i10 + 1]));
            } else {
                int i11 = i7 * 2;
                this.f33146c.lineTo(org.telegram.messenger.g0.L(iArr[i11]), org.telegram.messenger.g0.L(iArr[i11 + 1]));
            }
        }
        this.f33146c.close();
    }

    public final void a() {
        d51 d51Var = this.f33155n;
        if (d51Var != null) {
            d51Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f33151j;
    }

    public final void c(org.telegram.ui.qo0 qo0Var) {
        this.f33155n = qo0Var;
    }

    public final void d(boolean z9) {
        boolean z10 = this.d;
        if (z10 == z9 && this.h >= 1.0f && this.f33152k) {
            return;
        }
        if (z10 != z9) {
            this.f33156o = 0L;
            this.f33157p = null;
        }
        this.d = z9;
        this.f33151j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e51.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z9) {
        if (this.f33152k != z9) {
            this.f33152k = z9;
            this.f33157p = null;
            this.f33156o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z9) {
        this.f33153l = z9;
        a();
    }

    public final void g(long j3) {
        this.f33156o = j3;
        if (j3 >= 1000) {
            this.f33157p = org.telegram.messenger.hd.G((int) (j3 / 1000), "Seconds", new Object[0]);
        } else {
            this.f33157p = null;
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
        this.f33144a.setAlpha(i7);
        this.f33145b.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f33144a.setColorFilter(colorFilter);
    }
}
