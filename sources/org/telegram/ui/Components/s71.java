package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class s71 extends Drawable {
    public static final int[] f30192r = {10, 7, 26, 16, 10, 25};
    public final Paint f30193a;
    public final TextPaint f30194b;
    public final Path f30195c;
    public boolean d;
    public final boolean e;
    public Path f30196f;
    public int f30197g;
    public float h;
    public float f30198i;
    public boolean f30199j;
    public boolean f30200k;
    public boolean f30201l;
    public long f30202m;
    public r71 f30203n;
    public long f30204o;
    public String f30205p;
    public float f30206q;

    public s71(boolean z10) {
        Paint paint = new Paint(1);
        this.f30193a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f30194b = textPaint;
        Path path = new Path();
        this.f30195c = path;
        this.f30206q = 1.0f;
        this.e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f30192r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f30195c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f30195c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f30195c.close();
    }

    public final void a() {
        r71 r71Var = this.f30203n;
        if (r71Var != null) {
            r71Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f30199j;
    }

    public final void c(org.telegram.ui.zr0 zr0Var) {
        this.f30203n = zr0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f30200k) {
            return;
        }
        if (z11 != z10) {
            this.f30204o = 0L;
            this.f30205p = null;
        }
        this.d = z10;
        this.f30199j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s71.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f30200k != z10) {
            this.f30200k = z10;
            this.f30205p = null;
            this.f30204o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f30201l = z10;
        a();
    }

    public final void g(long j10) {
        this.f30204o = j10;
        if (j10 >= 1000) {
            this.f30205p = LocaleController.formatPluralString("Seconds", (int) (j10 / 1000), new Object[0]);
        } else {
            this.f30205p = null;
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
        this.f30193a.setAlpha(i10);
        this.f30194b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f30193a.setColorFilter(colorFilter);
    }
}
