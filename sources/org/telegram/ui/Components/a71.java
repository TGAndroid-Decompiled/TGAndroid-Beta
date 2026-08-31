package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class a71 extends Drawable {
    public static final int[] f25176r = {10, 7, 26, 16, 10, 25};
    public final Paint f25177a;
    public final TextPaint f25178b;
    public final Path f25179c;
    public boolean d;
    public final boolean f25180e;
    public Path f25181f;
    public int f25182g;
    public float h;
    public float f25183i;
    public boolean f25184j;
    public boolean f25185k;
    public boolean f25186l;
    public long f25187m;
    public z61 f25188n;
    public long f25189o;
    public String f25190p;
    public float f25191q;

    public a71(boolean z4) {
        Paint paint = new Paint(1);
        this.f25177a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f25178b = textPaint;
        Path path = new Path();
        this.f25179c = path;
        this.f25191q = 1.0f;
        this.f25180e = z4;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f25176r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f25179c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f25179c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f25179c.close();
    }

    public final void a() {
        z61 z61Var = this.f25188n;
        if (z61Var != null) {
            z61Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f25184j;
    }

    public final void c(org.telegram.ui.zr0 zr0Var) {
        this.f25188n = zr0Var;
    }

    public final void d(boolean z4) {
        boolean z10 = this.d;
        if (z10 == z4 && this.h >= 1.0f && this.f25185k) {
            return;
        }
        if (z10 != z4) {
            this.f25189o = 0L;
            this.f25190p = null;
        }
        this.d = z4;
        this.f25184j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a71.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z4) {
        if (this.f25185k != z4) {
            this.f25185k = z4;
            this.f25190p = null;
            this.f25189o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z4) {
        this.f25186l = z4;
        a();
    }

    public final void g(long j10) {
        this.f25189o = j10;
        if (j10 >= 1000) {
            this.f25190p = LocaleController.formatPluralString("Seconds", (int) (j10 / 1000), new Object[0]);
        } else {
            this.f25190p = null;
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
        this.f25177a.setAlpha(i10);
        this.f25178b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f25177a.setColorFilter(colorFilter);
    }
}
