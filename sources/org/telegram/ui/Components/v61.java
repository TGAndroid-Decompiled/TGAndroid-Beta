package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class v61 extends Drawable {
    public static final int[] f28670r = {10, 7, 26, 16, 10, 25};
    public final Paint f28671a;
    public final TextPaint f28672b;
    public final Path f28673c;
    public boolean d;
    public final boolean e;
    public Path f28674f;
    public int f28675g;
    public float h;
    public float f28676i;
    public boolean f28677j;
    public boolean f28678k;
    public boolean f28679l;
    public long f28680m;
    public u61 f28681n;
    public long f28682o;
    public String f28683p;
    public float f28684q;

    public v61(boolean z10) {
        Paint paint = new Paint(1);
        this.f28671a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f28672b = textPaint;
        Path path = new Path();
        this.f28673c = path;
        this.f28684q = 1.0f;
        this.e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f28670r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f28673c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f28673c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f28673c.close();
    }

    public final void a() {
        u61 u61Var = this.f28681n;
        if (u61Var != null) {
            u61Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f28677j;
    }

    public final void c(org.telegram.ui.ms0 ms0Var) {
        this.f28681n = ms0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f28678k) {
            return;
        }
        if (z11 != z10) {
            this.f28682o = 0L;
            this.f28683p = null;
        }
        this.d = z10;
        this.f28677j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v61.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f28678k != z10) {
            this.f28678k = z10;
            this.f28683p = null;
            this.f28682o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f28679l = z10;
        a();
    }

    public final void g(long j3) {
        this.f28682o = j3;
        if (j3 >= 1000) {
            this.f28683p = LocaleController.formatPluralString("Seconds", (int) (j3 / 1000), new Object[0]);
        } else {
            this.f28683p = null;
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
        this.f28671a.setAlpha(i10);
        this.f28672b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28671a.setColorFilter(colorFilter);
    }
}
