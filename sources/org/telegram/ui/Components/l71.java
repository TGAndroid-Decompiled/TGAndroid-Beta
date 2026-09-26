package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class l71 extends Drawable {
    public static final int[] f25989r = {10, 7, 26, 16, 10, 25};
    public final Paint f25990a;
    public final TextPaint f25991b;
    public final Path f25992c;
    public boolean d;
    public final boolean e;
    public Path f25993f;
    public int f25994g;
    public float h;
    public float f25995i;
    public boolean f25996j;
    public boolean f25997k;
    public boolean f25998l;
    public long f25999m;
    public k71 f26000n;
    public long f26001o;
    public String f26002p;
    public float f26003q;

    public l71(boolean z10) {
        Paint paint = new Paint(1);
        this.f25990a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f25991b = textPaint;
        Path path = new Path();
        this.f25992c = path;
        this.f26003q = 1.0f;
        this.e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f25989r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f25992c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f25992c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f25992c.close();
    }

    public final void a() {
        k71 k71Var = this.f26000n;
        if (k71Var != null) {
            k71Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f25996j;
    }

    public final void c(org.telegram.ui.ls0 ls0Var) {
        this.f26000n = ls0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f25997k) {
            return;
        }
        if (z11 != z10) {
            this.f26001o = 0L;
            this.f26002p = null;
        }
        this.d = z10;
        this.f25996j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l71.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f25997k != z10) {
            this.f25997k = z10;
            this.f26002p = null;
            this.f26001o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f25998l = z10;
        a();
    }

    public final void g(long j3) {
        this.f26001o = j3;
        if (j3 >= 1000) {
            this.f26002p = LocaleController.formatPluralString("Seconds", (int) (j3 / 1000), new Object[0]);
        } else {
            this.f26002p = null;
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
        this.f25990a.setAlpha(i10);
        this.f25991b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f25990a.setColorFilter(colorFilter);
    }
}
