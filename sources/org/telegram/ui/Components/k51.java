package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
public final class k51 extends Drawable {
    public static final int[] f35243r = {10, 7, 26, 16, 10, 25};
    public final Paint f35244a;
    public final TextPaint f35245b;
    public final Path f35246c;
    public boolean d;
    public final boolean f35247e;
    public Path f35248f;
    public int f35249g;
    public float h;
    public float f35250i;
    public boolean f35251j;
    public boolean f35252k;
    public boolean f35253l;
    public long f35254m;
    public j51 f35255n;
    public long f35256o;
    public String f35257p;
    public float f35258q;

    public k51(boolean z9) {
        Paint paint = new Paint(1);
        this.f35244a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f35245b = textPaint;
        Path path = new Path();
        this.f35246c = path;
        this.f35258q = 1.0f;
        this.f35247e = z9;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i7 = 0; i7 < 3; i7++) {
            int[] iArr = f35243r;
            if (i7 == 0) {
                int i10 = i7 * 2;
                this.f35246c.moveTo(org.telegram.messenger.g0.L(iArr[i10]), org.telegram.messenger.g0.L(iArr[i10 + 1]));
            } else {
                int i11 = i7 * 2;
                this.f35246c.lineTo(org.telegram.messenger.g0.L(iArr[i11]), org.telegram.messenger.g0.L(iArr[i11 + 1]));
            }
        }
        this.f35246c.close();
    }

    public final void a() {
        j51 j51Var = this.f35255n;
        if (j51Var != null) {
            j51Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f35251j;
    }

    public final void c(org.telegram.ui.to0 to0Var) {
        this.f35255n = to0Var;
    }

    public final void d(boolean z9) {
        boolean z10 = this.d;
        if (z10 == z9 && this.h >= 1.0f && this.f35252k) {
            return;
        }
        if (z10 != z9) {
            this.f35256o = 0L;
            this.f35257p = null;
        }
        this.d = z9;
        this.f35251j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k51.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z9) {
        if (this.f35252k != z9) {
            this.f35252k = z9;
            this.f35257p = null;
            this.f35256o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z9) {
        this.f35253l = z9;
        a();
    }

    public final void g(long j3) {
        this.f35256o = j3;
        if (j3 >= 1000) {
            this.f35257p = org.telegram.messenger.id.G((int) (j3 / 1000), "Seconds", new Object[0]);
        } else {
            this.f35257p = null;
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
        this.f35244a.setAlpha(i7);
        this.f35245b.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f35244a.setColorFilter(colorFilter);
    }
}
