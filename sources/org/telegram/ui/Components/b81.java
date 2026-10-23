package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class b81 extends Drawable {
    public static final int[] f24981r = {10, 7, 26, 16, 10, 25};
    public final Paint f24982a;
    public final TextPaint f24983b;
    public final Path f24984c;
    public boolean d;
    public final boolean e;
    public Path f24985f;
    public int f24986g;
    public float h;
    public float f24987i;
    public boolean f24988j;
    public boolean f24989k;
    public boolean f24990l;
    public long f24991m;
    public a81 f24992n;
    public long f24993o;
    public String f24994p;
    public float f24995q;

    public b81(boolean z10) {
        Paint paint = new Paint(1);
        this.f24982a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f24983b = textPaint;
        Path path = new Path();
        this.f24984c = path;
        this.f24995q = 1.0f;
        this.e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f24981r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f24984c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f24984c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f24984c.close();
    }

    public final void a() {
        a81 a81Var = this.f24992n;
        if (a81Var != null) {
            a81Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f24988j;
    }

    public final void c(org.telegram.ui.cs0 cs0Var) {
        this.f24992n = cs0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f24989k) {
            return;
        }
        if (z11 != z10) {
            this.f24993o = 0L;
            this.f24994p = null;
        }
        this.d = z10;
        this.f24988j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b81.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f24989k != z10) {
            this.f24989k = z10;
            this.f24994p = null;
            this.f24993o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f24990l = z10;
        a();
    }

    public final void g(long j10) {
        this.f24993o = j10;
        if (j10 >= 1000) {
            this.f24994p = LocaleController.formatPluralString("Seconds", (int) (j10 / 1000), new Object[0]);
        } else {
            this.f24994p = null;
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
        this.f24982a.setAlpha(i10);
        this.f24983b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f24982a.setColorFilter(colorFilter);
    }
}
