package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class a81 extends Drawable {
    public static final int[] f23155r = {10, 7, 26, 16, 10, 25};
    public final Paint f23156a;
    public final TextPaint f23157b;
    public final Path f23158c;
    public boolean d;
    public final boolean e;
    public Path f23159f;
    public int f23160g;
    public float h;
    public float f23161i;
    public boolean f23162j;
    public boolean f23163k;
    public boolean f23164l;
    public long f23165m;
    public z71 f23166n;
    public long f23167o;
    public String f23168p;
    public float f23169q;

    public a81(boolean z10) {
        Paint paint = new Paint(1);
        this.f23156a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f23157b = textPaint;
        Path path = new Path();
        this.f23158c = path;
        this.f23169q = 1.0f;
        this.e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f23155r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f23158c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f23158c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f23158c.close();
    }

    public final void a() {
        z71 z71Var = this.f23166n;
        if (z71Var != null) {
            z71Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f23162j;
    }

    public final void c(org.telegram.ui.zs0 zs0Var) {
        this.f23166n = zs0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f23163k) {
            return;
        }
        if (z11 != z10) {
            this.f23167o = 0L;
            this.f23168p = null;
        }
        this.d = z10;
        this.f23162j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a81.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f23163k != z10) {
            this.f23163k = z10;
            this.f23168p = null;
            this.f23167o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f23164l = z10;
        a();
    }

    public final void g(long j10) {
        this.f23167o = j10;
        if (j10 >= 1000) {
            this.f23168p = LocaleController.formatPluralString("Seconds", (int) (j10 / 1000), new Object[0]);
        } else {
            this.f23168p = null;
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
        this.f23156a.setAlpha(i10);
        this.f23157b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f23156a.setColorFilter(colorFilter);
    }
}
