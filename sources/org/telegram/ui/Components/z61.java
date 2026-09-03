package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class z61 extends Drawable {
    public static final int[] f33812r = {10, 7, 26, 16, 10, 25};
    public final Paint f33813a;
    public final TextPaint f33814b;
    public final Path f33815c;
    public boolean d;
    public final boolean f33816e;
    public Path f33817f;
    public int f33818g;
    public float h;
    public float f33819i;
    public boolean f33820j;
    public boolean f33821k;
    public boolean f33822l;
    public long f33823m;
    public y61 f33824n;
    public long f33825o;
    public String f33826p;
    public float f33827q;

    public z61(boolean z4) {
        Paint paint = new Paint(1);
        this.f33813a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f33814b = textPaint;
        Path path = new Path();
        this.f33815c = path;
        this.f33827q = 1.0f;
        this.f33816e = z4;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f33812r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f33815c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f33815c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f33815c.close();
    }

    public final void a() {
        y61 y61Var = this.f33824n;
        if (y61Var != null) {
            y61Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f33820j;
    }

    public final void c(org.telegram.ui.es0 es0Var) {
        this.f33824n = es0Var;
    }

    public final void d(boolean z4) {
        boolean z10 = this.d;
        if (z10 == z4 && this.h >= 1.0f && this.f33821k) {
            return;
        }
        if (z10 != z4) {
            this.f33825o = 0L;
            this.f33826p = null;
        }
        this.d = z4;
        this.f33820j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z61.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z4) {
        if (this.f33821k != z4) {
            this.f33821k = z4;
            this.f33826p = null;
            this.f33825o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z4) {
        this.f33822l = z4;
        a();
    }

    public final void g(long j10) {
        this.f33825o = j10;
        if (j10 >= 1000) {
            this.f33826p = LocaleController.formatPluralString("Seconds", (int) (j10 / 1000), new Object[0]);
        } else {
            this.f33826p = null;
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
        this.f33813a.setAlpha(i10);
        this.f33814b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f33813a.setColorFilter(colorFilter);
    }
}
