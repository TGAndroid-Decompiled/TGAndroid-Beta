package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class x61 extends Drawable {
    public static final int[] f29861r = {10, 7, 26, 16, 10, 25};
    public final Paint f29862a;
    public final TextPaint f29863b;
    public final Path f29864c;
    public boolean d;
    public final boolean e;
    public Path f29865f;
    public int f29866g;
    public float h;
    public float f29867i;
    public boolean f29868j;
    public boolean f29869k;
    public boolean f29870l;
    public long f29871m;
    public w61 f29872n;
    public long f29873o;
    public String f29874p;
    public float f29875q;

    public x61(boolean z10) {
        Paint paint = new Paint(1);
        this.f29862a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f29863b = textPaint;
        Path path = new Path();
        this.f29864c = path;
        this.f29875q = 1.0f;
        this.e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f29861r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f29864c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f29864c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f29864c.close();
    }

    public final void a() {
        w61 w61Var = this.f29872n;
        if (w61Var != null) {
            w61Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f29868j;
    }

    public final void c(org.telegram.ui.vs0 vs0Var) {
        this.f29872n = vs0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f29869k) {
            return;
        }
        if (z11 != z10) {
            this.f29873o = 0L;
            this.f29874p = null;
        }
        this.d = z10;
        this.f29868j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x61.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f29869k != z10) {
            this.f29869k = z10;
            this.f29874p = null;
            this.f29873o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f29870l = z10;
        a();
    }

    public final void g(long j3) {
        this.f29873o = j3;
        if (j3 >= 1000) {
            this.f29874p = LocaleController.formatPluralString("Seconds", (int) (j3 / 1000), new Object[0]);
        } else {
            this.f29874p = null;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(32.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(32.0f);
    }

    @Override
    public final int getMinimumHeight() {
        return AndroidUtilities.dp(32.0f);
    }

    @Override
    public final int getMinimumWidth() {
        return AndroidUtilities.dp(32.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f29862a.setAlpha(i10);
        this.f29863b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29862a.setColorFilter(colorFilter);
    }
}
