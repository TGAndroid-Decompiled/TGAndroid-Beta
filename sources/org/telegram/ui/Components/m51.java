package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
public final class m51 extends Drawable {
    public static final int[] f37061r = {10, 7, 26, 16, 10, 25};
    public final Paint f37062a;
    public final TextPaint f37063b;
    public final Path f37064c;
    public boolean d;
    public final boolean f37065e;
    public Path f37066f;
    public int f37067g;
    public float h;
    public float f37068i;
    public boolean f37069j;
    public boolean f37070k;
    public boolean f37071l;
    public long f37072m;
    public l51 f37073n;
    public long f37074o;
    public String f37075p;
    public float f37076q;

    public m51(boolean z10) {
        Paint paint = new Paint(1);
        this.f37062a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f37063b = textPaint;
        Path path = new Path();
        this.f37064c = path;
        this.f37076q = 1.0f;
        this.f37065e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i7 = 0; i7 < 3; i7++) {
            int[] iArr = f37061r;
            if (i7 == 0) {
                int i10 = i7 * 2;
                this.f37064c.moveTo(org.telegram.messenger.g0.L(iArr[i10]), org.telegram.messenger.g0.L(iArr[i10 + 1]));
            } else {
                int i11 = i7 * 2;
                this.f37064c.lineTo(org.telegram.messenger.g0.L(iArr[i11]), org.telegram.messenger.g0.L(iArr[i11 + 1]));
            }
        }
        this.f37064c.close();
    }

    public final void a() {
        l51 l51Var = this.f37073n;
        if (l51Var != null) {
            l51Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f37069j;
    }

    public final void c(org.telegram.ui.po0 po0Var) {
        this.f37073n = po0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f37070k) {
            return;
        }
        if (z11 != z10) {
            this.f37074o = 0L;
            this.f37075p = null;
        }
        this.d = z10;
        this.f37069j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m51.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f37070k != z10) {
            this.f37070k = z10;
            this.f37075p = null;
            this.f37074o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f37071l = z10;
        a();
    }

    public final void g(long j3) {
        this.f37074o = j3;
        if (j3 >= 1000) {
            this.f37075p = org.telegram.messenger.hd.G((int) (j3 / 1000), "Seconds", new Object[0]);
        } else {
            this.f37075p = null;
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
        this.f37062a.setAlpha(i7);
        this.f37063b.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f37062a.setColorFilter(colorFilter);
    }
}
