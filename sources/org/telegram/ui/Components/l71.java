package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class l71 extends Drawable {
    public static final int[] f26051r = {10, 7, 26, 16, 10, 25};
    public final Paint f26052a;
    public final TextPaint f26053b;
    public final Path f26054c;
    public boolean d;
    public final boolean e;
    public Path f26055f;
    public int f26056g;
    public float h;
    public float f26057i;
    public boolean f26058j;
    public boolean f26059k;
    public boolean f26060l;
    public long f26061m;
    public k71 f26062n;
    public long f26063o;
    public String f26064p;
    public float f26065q;

    public l71(boolean z10) {
        Paint paint = new Paint(1);
        this.f26052a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f26053b = textPaint;
        Path path = new Path();
        this.f26054c = path;
        this.f26065q = 1.0f;
        this.e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f26051r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f26054c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f26054c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f26054c.close();
    }

    public final void a() {
        k71 k71Var = this.f26062n;
        if (k71Var != null) {
            k71Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f26058j;
    }

    public final void c(org.telegram.ui.ts0 ts0Var) {
        this.f26062n = ts0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f26059k) {
            return;
        }
        if (z11 != z10) {
            this.f26063o = 0L;
            this.f26064p = null;
        }
        this.d = z10;
        this.f26058j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l71.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f26059k != z10) {
            this.f26059k = z10;
            this.f26064p = null;
            this.f26063o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f26060l = z10;
        a();
    }

    public final void g(long j3) {
        this.f26063o = j3;
        if (j3 >= 1000) {
            this.f26064p = LocaleController.formatPluralString("Seconds", (int) (j3 / 1000), new Object[0]);
        } else {
            this.f26064p = null;
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
        this.f26052a.setAlpha(i10);
        this.f26053b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f26052a.setColorFilter(colorFilter);
    }
}
