package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class k71 extends Drawable {
    public static final int[] f25678r = {10, 7, 26, 16, 10, 25};
    public final Paint f25679a;
    public final TextPaint f25680b;
    public final Path f25681c;
    public boolean d;
    public final boolean e;
    public Path f25682f;
    public int f25683g;
    public float h;
    public float f25684i;
    public boolean f25685j;
    public boolean f25686k;
    public boolean f25687l;
    public long f25688m;
    public j71 f25689n;
    public long f25690o;
    public String f25691p;
    public float f25692q;

    public k71(boolean z10) {
        Paint paint = new Paint(1);
        this.f25679a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f25680b = textPaint;
        Path path = new Path();
        this.f25681c = path;
        this.f25692q = 1.0f;
        this.e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f25678r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f25681c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f25681c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f25681c.close();
    }

    public final void a() {
        j71 j71Var = this.f25689n;
        if (j71Var != null) {
            j71Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f25685j;
    }

    public final void c(org.telegram.ui.ls0 ls0Var) {
        this.f25689n = ls0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f25686k) {
            return;
        }
        if (z11 != z10) {
            this.f25690o = 0L;
            this.f25691p = null;
        }
        this.d = z10;
        this.f25685j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k71.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f25686k != z10) {
            this.f25686k = z10;
            this.f25691p = null;
            this.f25690o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f25687l = z10;
        a();
    }

    public final void g(long j3) {
        this.f25690o = j3;
        if (j3 >= 1000) {
            this.f25691p = LocaleController.formatPluralString("Seconds", (int) (j3 / 1000), new Object[0]);
        } else {
            this.f25691p = null;
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
        this.f25679a.setAlpha(i10);
        this.f25680b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f25679a.setColorFilter(colorFilter);
    }
}
