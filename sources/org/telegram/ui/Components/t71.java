package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class t71 extends Drawable {
    public static final int[] f30462r = {10, 7, 26, 16, 10, 25};
    public final Paint f30463a;
    public final TextPaint f30464b;
    public final Path f30465c;
    public boolean d;
    public final boolean e;
    public Path f30466f;
    public int f30467g;
    public float h;
    public float f30468i;
    public boolean f30469j;
    public boolean f30470k;
    public boolean f30471l;
    public long f30472m;
    public s71 f30473n;
    public long f30474o;
    public String f30475p;
    public float f30476q;

    public t71(boolean z10) {
        Paint paint = new Paint(1);
        this.f30463a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f30464b = textPaint;
        Path path = new Path();
        this.f30465c = path;
        this.f30476q = 1.0f;
        this.e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f30462r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f30465c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f30465c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f30465c.close();
    }

    public final void a() {
        s71 s71Var = this.f30473n;
        if (s71Var != null) {
            s71Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f30469j;
    }

    public final void c(org.telegram.ui.zr0 zr0Var) {
        this.f30473n = zr0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f30470k) {
            return;
        }
        if (z11 != z10) {
            this.f30474o = 0L;
            this.f30475p = null;
        }
        this.d = z10;
        this.f30469j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t71.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f30470k != z10) {
            this.f30470k = z10;
            this.f30475p = null;
            this.f30474o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f30471l = z10;
        a();
    }

    public final void g(long j10) {
        this.f30474o = j10;
        if (j10 >= 1000) {
            this.f30475p = LocaleController.formatPluralString("Seconds", (int) (j10 / 1000), new Object[0]);
        } else {
            this.f30475p = null;
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
        this.f30463a.setAlpha(i10);
        this.f30464b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f30463a.setColorFilter(colorFilter);
    }
}
