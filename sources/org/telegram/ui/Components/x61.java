package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class x61 extends Drawable {
    public static final int[] f29864r = {10, 7, 26, 16, 10, 25};
    public final Paint f29865a;
    public final TextPaint f29866b;
    public final Path f29867c;
    public boolean d;
    public final boolean e;
    public Path f29868f;
    public int f29869g;
    public float h;
    public float f29870i;
    public boolean f29871j;
    public boolean f29872k;
    public boolean f29873l;
    public long f29874m;
    public w61 f29875n;
    public long f29876o;
    public String f29877p;
    public float f29878q;

    public x61(boolean z10) {
        Paint paint = new Paint(1);
        this.f29865a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f29866b = textPaint;
        Path path = new Path();
        this.f29867c = path;
        this.f29878q = 1.0f;
        this.e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f29864r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f29867c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f29867c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f29867c.close();
    }

    public final void a() {
        w61 w61Var = this.f29875n;
        if (w61Var != null) {
            w61Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f29871j;
    }

    public final void c(org.telegram.ui.vs0 vs0Var) {
        this.f29875n = vs0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f29872k) {
            return;
        }
        if (z11 != z10) {
            this.f29876o = 0L;
            this.f29877p = null;
        }
        this.d = z10;
        this.f29871j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x61.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f29872k != z10) {
            this.f29872k = z10;
            this.f29877p = null;
            this.f29876o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f29873l = z10;
        a();
    }

    public final void g(long j3) {
        this.f29876o = j3;
        if (j3 >= 1000) {
            this.f29877p = LocaleController.formatPluralString("Seconds", (int) (j3 / 1000), new Object[0]);
        } else {
            this.f29877p = null;
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
        this.f29865a.setAlpha(i10);
        this.f29866b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29865a.setColorFilter(colorFilter);
    }
}
