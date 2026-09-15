package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class w61 extends Drawable {
    public static final int[] f29623r = {10, 7, 26, 16, 10, 25};
    public final Paint f29624a;
    public final TextPaint f29625b;
    public final Path f29626c;
    public boolean d;
    public final boolean e;
    public Path f29627f;
    public int f29628g;
    public float h;
    public float f29629i;
    public boolean f29630j;
    public boolean f29631k;
    public boolean f29632l;
    public long f29633m;
    public v61 f29634n;
    public long f29635o;
    public String f29636p;
    public float f29637q;

    public w61(boolean z10) {
        Paint paint = new Paint(1);
        this.f29624a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f29625b = textPaint;
        Path path = new Path();
        this.f29626c = path;
        this.f29637q = 1.0f;
        this.e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f29623r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f29626c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f29626c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f29626c.close();
    }

    public final void a() {
        v61 v61Var = this.f29634n;
        if (v61Var != null) {
            v61Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f29630j;
    }

    public final void c(org.telegram.ui.ts0 ts0Var) {
        this.f29634n = ts0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f29631k) {
            return;
        }
        if (z11 != z10) {
            this.f29635o = 0L;
            this.f29636p = null;
        }
        this.d = z10;
        this.f29630j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w61.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f29631k != z10) {
            this.f29631k = z10;
            this.f29636p = null;
            this.f29635o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f29632l = z10;
        a();
    }

    public final void g(long j3) {
        this.f29635o = j3;
        if (j3 >= 1000) {
            this.f29636p = LocaleController.formatPluralString("Seconds", (int) (j3 / 1000), new Object[0]);
        } else {
            this.f29636p = null;
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
        this.f29624a.setAlpha(i10);
        this.f29625b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29624a.setColorFilter(colorFilter);
    }
}
