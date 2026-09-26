package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class k71 extends Drawable {
    public static final int[] f25677r = {10, 7, 26, 16, 10, 25};
    public final Paint f25678a;
    public final TextPaint f25679b;
    public final Path f25680c;
    public boolean d;
    public final boolean e;
    public Path f25681f;
    public int f25682g;
    public float h;
    public float f25683i;
    public boolean f25684j;
    public boolean f25685k;
    public boolean f25686l;
    public long f25687m;
    public j71 f25688n;
    public long f25689o;
    public String f25690p;
    public float f25691q;

    public k71(boolean z10) {
        Paint paint = new Paint(1);
        this.f25678a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f25679b = textPaint;
        Path path = new Path();
        this.f25680c = path;
        this.f25691q = 1.0f;
        this.e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f25677r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f25680c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f25680c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f25680c.close();
    }

    public final void a() {
        j71 j71Var = this.f25688n;
        if (j71Var != null) {
            j71Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f25684j;
    }

    public final void c(org.telegram.ui.ls0 ls0Var) {
        this.f25688n = ls0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f25685k) {
            return;
        }
        if (z11 != z10) {
            this.f25689o = 0L;
            this.f25690p = null;
        }
        this.d = z10;
        this.f25684j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k71.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f25685k != z10) {
            this.f25685k = z10;
            this.f25690p = null;
            this.f25689o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f25686l = z10;
        a();
    }

    public final void g(long j3) {
        this.f25689o = j3;
        if (j3 >= 1000) {
            this.f25690p = LocaleController.formatPluralString("Seconds", (int) (j3 / 1000), new Object[0]);
        } else {
            this.f25690p = null;
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
        this.f25678a.setAlpha(i10);
        this.f25679b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f25678a.setColorFilter(colorFilter);
    }
}
