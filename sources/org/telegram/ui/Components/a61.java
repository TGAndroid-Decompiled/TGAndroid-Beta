package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class a61 extends Drawable {
    public static final int[] f26694r = {10, 7, 26, 16, 10, 25};
    public final Paint f26695a;
    public final TextPaint f26696b;
    public final Path f26697c;
    public boolean d;
    public final boolean f26698e;
    public Path f26699f;
    public int f26700g;
    public float h;
    public float f26701i;
    public boolean f26702j;
    public boolean f26703k;
    public boolean f26704l;
    public long f26705m;
    public z51 f26706n;
    public long f26707o;
    public String f26708p;
    public float f26709q;

    public a61(boolean z10) {
        Paint paint = new Paint(1);
        this.f26695a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f26696b = textPaint;
        Path path = new Path();
        this.f26697c = path;
        this.f26709q = 1.0f;
        this.f26698e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i9 = 0; i9 < 3; i9++) {
            int[] iArr = f26694r;
            if (i9 == 0) {
                int i10 = i9 * 2;
                this.f26697c.moveTo(AndroidUtilities.dp(iArr[i10]), AndroidUtilities.dp(iArr[i10 + 1]));
            } else {
                int i11 = i9 * 2;
                this.f26697c.lineTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            }
        }
        this.f26697c.close();
    }

    public final void a() {
        z51 z51Var = this.f26706n;
        if (z51Var != null) {
            z51Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f26702j;
    }

    public final void c(org.telegram.ui.qr0 qr0Var) {
        this.f26706n = qr0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f26703k) {
            return;
        }
        if (z11 != z10) {
            this.f26707o = 0L;
            this.f26708p = null;
        }
        this.d = z10;
        this.f26702j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a61.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f26703k != z10) {
            this.f26703k = z10;
            this.f26708p = null;
            this.f26707o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f26704l = z10;
        a();
    }

    public final void g(long j10) {
        this.f26707o = j10;
        if (j10 >= 1000) {
            this.f26708p = LocaleController.formatPluralString("Seconds", (int) (j10 / 1000), new Object[0]);
        } else {
            this.f26708p = null;
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
    public final void setAlpha(int i9) {
        this.f26695a.setAlpha(i9);
        this.f26696b.setAlpha(i9);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f26695a.setColorFilter(colorFilter);
    }
}
