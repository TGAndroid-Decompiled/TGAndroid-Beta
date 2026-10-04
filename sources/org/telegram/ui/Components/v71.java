package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class v71 extends Drawable {
    public static final int[] f31588r = {10, 7, 26, 16, 10, 25};
    public final Paint f31589a;
    public final TextPaint f31590b;
    public final Path f31591c;
    public boolean d;
    public final boolean f31592e;
    public Path f31593f;
    public int f31594g;
    public float h;
    public float f31595i;
    public boolean f31596j;
    public boolean f31597k;
    public boolean f31598l;
    public long f31599m;
    public u71 f31600n;
    public long f31601o;
    public String f31602p;
    public float f31603q;

    public v71(boolean z10) {
        Paint paint = new Paint(1);
        this.f31589a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f31590b = textPaint;
        Path path = new Path();
        this.f31591c = path;
        this.f31603q = 1.0f;
        this.f31592e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f31588r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f31591c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f31591c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f31591c.close();
    }

    public final void a() {
        u71 u71Var = this.f31600n;
        if (u71Var != null) {
            u71Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f31596j;
    }

    public final void c(org.telegram.ui.os0 os0Var) {
        this.f31600n = os0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f31597k) {
            return;
        }
        if (z11 != z10) {
            this.f31601o = 0L;
            this.f31602p = null;
        }
        this.d = z10;
        this.f31596j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v71.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f31597k != z10) {
            this.f31597k = z10;
            this.f31602p = null;
            this.f31601o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f31598l = z10;
        a();
    }

    public final void g(long j3) {
        this.f31601o = j3;
        if (j3 >= 1000) {
            this.f31602p = LocaleController.formatPluralString("Seconds", (int) (j3 / 1000), new Object[0]);
        } else {
            this.f31602p = null;
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
        this.f31589a.setAlpha(i10);
        this.f31590b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f31589a.setColorFilter(colorFilter);
    }
}
