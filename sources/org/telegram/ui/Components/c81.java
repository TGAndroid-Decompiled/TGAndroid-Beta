package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class c81 extends Drawable {
    public static final int[] f25223r = {10, 7, 26, 16, 10, 25};
    public final Paint f25224a;
    public final TextPaint f25225b;
    public final Path f25226c;
    public boolean d;
    public final boolean f25227e;
    public Path f25228f;
    public int f25229g;
    public float h;
    public float f25230i;
    public boolean f25231j;
    public boolean f25232k;
    public boolean f25233l;
    public long f25234m;
    public b81 f25235n;
    public long f25236o;
    public String f25237p;
    public float f25238q;

    public c81(boolean z10) {
        Paint paint = new Paint(1);
        this.f25224a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f25225b = textPaint;
        Path path = new Path();
        this.f25226c = path;
        this.f25238q = 1.0f;
        this.f25227e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f25223r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f25226c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f25226c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f25226c.close();
    }

    public final void a() {
        b81 b81Var = this.f25235n;
        if (b81Var != null) {
            b81Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f25231j;
    }

    public final void c(org.telegram.ui.ts0 ts0Var) {
        this.f25235n = ts0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f25232k) {
            return;
        }
        if (z11 != z10) {
            this.f25236o = 0L;
            this.f25237p = null;
        }
        this.d = z10;
        this.f25231j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c81.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f25232k != z10) {
            this.f25232k = z10;
            this.f25237p = null;
            this.f25236o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f25233l = z10;
        a();
    }

    public final void g(long j3) {
        this.f25236o = j3;
        if (j3 >= 1000) {
            this.f25237p = LocaleController.formatPluralString("Seconds", (int) (j3 / 1000), new Object[0]);
        } else {
            this.f25237p = null;
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
        this.f25224a.setAlpha(i10);
        this.f25225b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f25224a.setColorFilter(colorFilter);
    }
}
