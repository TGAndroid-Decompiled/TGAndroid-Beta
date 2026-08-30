package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class y61 extends Drawable {
    public static final int[] f30892r = {10, 7, 26, 16, 10, 25};
    public final Paint f30893a;
    public final TextPaint f30894b;
    public final Path f30895c;
    public boolean d;
    public final boolean e;
    public Path f30896f;
    public int f30897g;
    public float h;
    public float f30898i;
    public boolean f30899j;
    public boolean f30900k;
    public boolean f30901l;
    public long f30902m;
    public x61 f30903n;
    public long f30904o;
    public String f30905p;
    public float f30906q;

    public y61(boolean z4) {
        Paint paint = new Paint(1);
        this.f30893a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f30894b = textPaint;
        Path path = new Path();
        this.f30895c = path;
        this.f30906q = 1.0f;
        this.e = z4;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f30892r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f30895c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f30895c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f30895c.close();
    }

    public final void a() {
        x61 x61Var = this.f30903n;
        if (x61Var != null) {
            x61Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f30899j;
    }

    public final void c(org.telegram.ui.xr0 xr0Var) {
        this.f30903n = xr0Var;
    }

    public final void d(boolean z4) {
        boolean z10 = this.d;
        if (z10 == z4 && this.h >= 1.0f && this.f30900k) {
            return;
        }
        if (z10 != z4) {
            this.f30904o = 0L;
            this.f30905p = null;
        }
        this.d = z4;
        this.f30899j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y61.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z4) {
        if (this.f30900k != z4) {
            this.f30900k = z4;
            this.f30905p = null;
            this.f30904o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z4) {
        this.f30901l = z4;
        a();
    }

    public final void g(long j10) {
        this.f30904o = j10;
        if (j10 >= 1000) {
            this.f30905p = LocaleController.formatPluralString("Seconds", (int) (j10 / 1000), new Object[0]);
        } else {
            this.f30905p = null;
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
        this.f30893a.setAlpha(i10);
        this.f30894b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f30893a.setColorFilter(colorFilter);
    }
}
