package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class j71 extends Drawable {
    public static final int[] f24261r = {10, 7, 26, 16, 10, 25};
    public final Paint f24262a;
    public final TextPaint f24263b;
    public final Path f24264c;
    public boolean d;
    public final boolean e;
    public Path f24265f;
    public int f24266g;
    public float h;
    public float f24267i;
    public boolean f24268j;
    public boolean f24269k;
    public boolean f24270l;
    public long f24271m;
    public i71 f24272n;
    public long f24273o;
    public String f24274p;
    public float f24275q;

    public j71(boolean z10) {
        Paint paint = new Paint(1);
        this.f24262a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f24263b = textPaint;
        Path path = new Path();
        this.f24264c = path;
        this.f24275q = 1.0f;
        this.e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f24261r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f24264c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f24264c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f24264c.close();
    }

    public final void a() {
        i71 i71Var = this.f24272n;
        if (i71Var != null) {
            i71Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f24268j;
    }

    public final void c(org.telegram.ui.ss0 ss0Var) {
        this.f24272n = ss0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f24269k) {
            return;
        }
        if (z11 != z10) {
            this.f24273o = 0L;
            this.f24274p = null;
        }
        this.d = z10;
        this.f24268j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j71.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f24269k != z10) {
            this.f24269k = z10;
            this.f24274p = null;
            this.f24273o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f24270l = z10;
        a();
    }

    public final void g(long j3) {
        this.f24273o = j3;
        if (j3 >= 1000) {
            this.f24274p = LocaleController.formatPluralString("Seconds", (int) (j3 / 1000), new Object[0]);
        } else {
            this.f24274p = null;
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
        this.f24262a.setAlpha(i10);
        this.f24263b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f24262a.setColorFilter(colorFilter);
    }
}
