package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class z71 extends Drawable {
    public static final int[] f31790r = {10, 7, 26, 16, 10, 25};
    public final Paint f31791a;
    public final TextPaint f31792b;
    public final Path f31793c;
    public boolean d;
    public final boolean e;
    public Path f31794f;
    public int f31795g;
    public float h;
    public float f31796i;
    public boolean f31797j;
    public boolean f31798k;
    public boolean f31799l;
    public long f31800m;
    public y71 f31801n;
    public long f31802o;
    public String f31803p;
    public float f31804q;

    public z71(boolean z10) {
        Paint paint = new Paint(1);
        this.f31791a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f31792b = textPaint;
        Path path = new Path();
        this.f31793c = path;
        this.f31804q = 1.0f;
        this.e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f31790r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f31793c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f31793c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f31793c.close();
    }

    public final void a() {
        y71 y71Var = this.f31801n;
        if (y71Var != null) {
            y71Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f31797j;
    }

    public final void c(org.telegram.ui.at0 at0Var) {
        this.f31801n = at0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f31798k) {
            return;
        }
        if (z11 != z10) {
            this.f31802o = 0L;
            this.f31803p = null;
        }
        this.d = z10;
        this.f31797j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z71.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f31798k != z10) {
            this.f31798k = z10;
            this.f31803p = null;
            this.f31802o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f31799l = z10;
        a();
    }

    public final void g(long j10) {
        this.f31802o = j10;
        if (j10 >= 1000) {
            this.f31803p = LocaleController.formatPluralString("Seconds", (int) (j10 / 1000), new Object[0]);
        } else {
            this.f31803p = null;
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
        this.f31791a.setAlpha(i10);
        this.f31792b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f31791a.setColorFilter(colorFilter);
    }
}
