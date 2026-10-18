package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class r71 extends Drawable {
    public static final int[] f29868r = {10, 7, 26, 16, 10, 25};
    public final Paint f29869a;
    public final TextPaint f29870b;
    public final Path f29871c;
    public boolean d;
    public final boolean e;
    public Path f29872f;
    public int f29873g;
    public float h;
    public float f29874i;
    public boolean f29875j;
    public boolean f29876k;
    public boolean f29877l;
    public long f29878m;
    public q71 f29879n;
    public long f29880o;
    public String f29881p;
    public float f29882q;

    public r71(boolean z10) {
        Paint paint = new Paint(1);
        this.f29869a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f29870b = textPaint;
        Path path = new Path();
        this.f29871c = path;
        this.f29882q = 1.0f;
        this.e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f29868r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f29871c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f29871c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f29871c.close();
    }

    public final void a() {
        q71 q71Var = this.f29879n;
        if (q71Var != null) {
            q71Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f29875j;
    }

    public final void c(org.telegram.ui.bs0 bs0Var) {
        this.f29879n = bs0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f29876k) {
            return;
        }
        if (z11 != z10) {
            this.f29880o = 0L;
            this.f29881p = null;
        }
        this.d = z10;
        this.f29875j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r71.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f29876k != z10) {
            this.f29876k = z10;
            this.f29881p = null;
            this.f29880o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f29877l = z10;
        a();
    }

    public final void g(long j10) {
        this.f29880o = j10;
        if (j10 >= 1000) {
            this.f29881p = LocaleController.formatPluralString("Seconds", (int) (j10 / 1000), new Object[0]);
        } else {
            this.f29881p = null;
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
        this.f29869a.setAlpha(i10);
        this.f29870b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29869a.setColorFilter(colorFilter);
    }
}
