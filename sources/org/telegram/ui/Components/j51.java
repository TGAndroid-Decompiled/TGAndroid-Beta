package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
public final class j51 extends Drawable {
    public static final int[] f34901r = {10, 7, 26, 16, 10, 25};
    public final Paint f34902a;
    public final TextPaint f34903b;
    public final Path f34904c;
    public boolean d;
    public final boolean f34905e;
    public Path f34906f;
    public int f34907g;
    public float h;
    public float f34908i;
    public boolean f34909j;
    public boolean f34910k;
    public boolean f34911l;
    public long f34912m;
    public i51 f34913n;
    public long f34914o;
    public String f34915p;
    public float f34916q;

    public j51(boolean z9) {
        Paint paint = new Paint(1);
        this.f34902a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f34903b = textPaint;
        Path path = new Path();
        this.f34904c = path;
        this.f34916q = 1.0f;
        this.f34905e = z9;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i7 = 0; i7 < 3; i7++) {
            int[] iArr = f34901r;
            if (i7 == 0) {
                int i10 = i7 * 2;
                this.f34904c.moveTo(org.telegram.messenger.g0.L(iArr[i10]), org.telegram.messenger.g0.L(iArr[i10 + 1]));
            } else {
                int i11 = i7 * 2;
                this.f34904c.lineTo(org.telegram.messenger.g0.L(iArr[i11]), org.telegram.messenger.g0.L(iArr[i11 + 1]));
            }
        }
        this.f34904c.close();
    }

    public final void a() {
        i51 i51Var = this.f34913n;
        if (i51Var != null) {
            i51Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f34909j;
    }

    public final void c(org.telegram.ui.ro0 ro0Var) {
        this.f34913n = ro0Var;
    }

    public final void d(boolean z9) {
        boolean z10 = this.d;
        if (z10 == z9 && this.h >= 1.0f && this.f34910k) {
            return;
        }
        if (z10 != z9) {
            this.f34914o = 0L;
            this.f34915p = null;
        }
        this.d = z9;
        this.f34909j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j51.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z9) {
        if (this.f34910k != z9) {
            this.f34910k = z9;
            this.f34915p = null;
            this.f34914o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z9) {
        this.f34911l = z9;
        a();
    }

    public final void g(long j3) {
        this.f34914o = j3;
        if (j3 >= 1000) {
            this.f34915p = org.telegram.messenger.id.G((int) (j3 / 1000), "Seconds", new Object[0]);
        } else {
            this.f34915p = null;
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
        this.f34902a.setAlpha(i7);
        this.f34903b.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f34902a.setColorFilter(colorFilter);
    }
}
