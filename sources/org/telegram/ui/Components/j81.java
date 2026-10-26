package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class j81 extends Drawable {
    public static final int[] f29515r = {10, 7, 26, 16, 10, 25};
    public final Paint f29516a;
    public final TextPaint f29517b;
    public final Path f29518c;
    public boolean d;
    public final boolean e;
    public Path f29519f;
    public int f29520g;
    public float h;
    public float f29521i;
    public boolean f29522j;
    public boolean f29523k;
    public boolean f29524l;
    public long f29525m;
    public i81 f29526n;
    public long f29527o;
    public String f29528p;
    public float f29529q;

    public j81(boolean z10) {
        Paint paint = new Paint(1);
        this.f29516a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f29517b = textPaint;
        Path path = new Path();
        this.f29518c = path;
        this.f29529q = 1.0f;
        this.e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f29515r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f29518c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f29518c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f29518c.close();
    }

    public final void a() {
        i81 i81Var = this.f29526n;
        if (i81Var != null) {
            i81Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f29522j;
    }

    public final void c(org.telegram.ui.gs0 gs0Var) {
        this.f29526n = gs0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f29523k) {
            return;
        }
        if (z11 != z10) {
            this.f29527o = 0L;
            this.f29528p = null;
        }
        this.d = z10;
        this.f29522j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j81.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f29523k != z10) {
            this.f29523k = z10;
            this.f29528p = null;
            this.f29527o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f29524l = z10;
        a();
    }

    public final void g(long j10) {
        this.f29527o = j10;
        if (j10 >= 1000) {
            this.f29528p = LocaleController.formatPluralString("Seconds", (int) (j10 / 1000), new Object[0]);
        } else {
            this.f29528p = null;
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
        this.f29516a.setAlpha(i10);
        this.f29517b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29516a.setColorFilter(colorFilter);
    }
}
