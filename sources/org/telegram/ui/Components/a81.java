package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class a81 extends Drawable {
    public static final int[] f24654r = {10, 7, 26, 16, 10, 25};
    public final Paint f24655a;
    public final TextPaint f24656b;
    public final Path f24657c;
    public boolean d;
    public final boolean e;
    public Path f24658f;
    public int f24659g;
    public float h;
    public float f24660i;
    public boolean f24661j;
    public boolean f24662k;
    public boolean f24663l;
    public long f24664m;
    public z71 f24665n;
    public long f24666o;
    public String f24667p;
    public float f24668q;

    public a81(boolean z10) {
        Paint paint = new Paint(1);
        this.f24655a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f24656b = textPaint;
        Path path = new Path();
        this.f24657c = path;
        this.f24668q = 1.0f;
        this.e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f24654r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f24657c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f24657c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f24657c.close();
    }

    public final void a() {
        z71 z71Var = this.f24665n;
        if (z71Var != null) {
            z71Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f24661j;
    }

    public final void c(org.telegram.ui.bs0 bs0Var) {
        this.f24665n = bs0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f24662k) {
            return;
        }
        if (z11 != z10) {
            this.f24666o = 0L;
            this.f24667p = null;
        }
        this.d = z10;
        this.f24661j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a81.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f24662k != z10) {
            this.f24662k = z10;
            this.f24667p = null;
            this.f24666o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f24663l = z10;
        a();
    }

    public final void g(long j10) {
        this.f24666o = j10;
        if (j10 >= 1000) {
            this.f24667p = LocaleController.formatPluralString("Seconds", (int) (j10 / 1000), new Object[0]);
        } else {
            this.f24667p = null;
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
        this.f24655a.setAlpha(i10);
        this.f24656b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f24655a.setColorFilter(colorFilter);
    }
}
