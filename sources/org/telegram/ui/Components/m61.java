package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
public final class m61 extends Drawable {
    public static final int[] f28313r = {10, 7, 26, 16, 10, 25};
    public final Paint f28314a;
    public final TextPaint f28315b;
    public final Path f28316c;
    public boolean d;
    public final boolean e;
    public Path f28317f;
    public int f28318g;
    public float h;
    public float f28319i;
    public boolean f28320j;
    public boolean f28321k;
    public boolean f28322l;
    public long f28323m;
    public l61 f28324n;
    public long f28325o;
    public String f28326p;
    public float f28327q;

    public m61(boolean z10) {
        Paint paint = new Paint(1);
        this.f28314a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f28315b = textPaint;
        Path path = new Path();
        this.f28316c = path;
        this.f28327q = 1.0f;
        this.e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.i0.L(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f28313r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f28316c.moveTo(org.telegram.messenger.i0.L(iArr[i11]), org.telegram.messenger.i0.L(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f28316c.lineTo(org.telegram.messenger.i0.L(iArr[i12]), org.telegram.messenger.i0.L(iArr[i12 + 1]));
            }
        }
        this.f28316c.close();
    }

    public final void a() {
        l61 l61Var = this.f28324n;
        if (l61Var != null) {
            l61Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f28320j;
    }

    public final void c(org.telegram.ui.bq0 bq0Var) {
        this.f28324n = bq0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f28321k) {
            return;
        }
        if (z11 != z10) {
            this.f28325o = 0L;
            this.f28326p = null;
        }
        this.d = z10;
        this.f28320j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m61.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f28321k != z10) {
            this.f28321k = z10;
            this.f28326p = null;
            this.f28325o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f28322l = z10;
        a();
    }

    public final void g(long j10) {
        this.f28325o = j10;
        if (j10 >= 1000) {
            this.f28326p = org.telegram.messenger.cd.G((int) (j10 / 1000), "Seconds", new Object[0]);
        } else {
            this.f28326p = null;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(32.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(32.0f);
    }

    @Override
    public final int getMinimumHeight() {
        return org.telegram.messenger.i0.L(32.0f);
    }

    @Override
    public final int getMinimumWidth() {
        return org.telegram.messenger.i0.L(32.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f28314a.setAlpha(i10);
        this.f28315b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28314a.setColorFilter(colorFilter);
    }
}
