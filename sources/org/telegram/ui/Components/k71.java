package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class k71 extends Drawable {
    public static final int[] f25659r = {10, 7, 26, 16, 10, 25};
    public final Paint f25660a;
    public final TextPaint f25661b;
    public final Path f25662c;
    public boolean d;
    public final boolean e;
    public Path f25663f;
    public int f25664g;
    public float h;
    public float f25665i;
    public boolean f25666j;
    public boolean f25667k;
    public boolean f25668l;
    public long f25669m;
    public j71 f25670n;
    public long f25671o;
    public String f25672p;
    public float f25673q;

    public k71(boolean z10) {
        Paint paint = new Paint(1);
        this.f25660a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f25661b = textPaint;
        Path path = new Path();
        this.f25662c = path;
        this.f25673q = 1.0f;
        this.e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f25659r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f25662c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f25662c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f25662c.close();
    }

    public final void a() {
        j71 j71Var = this.f25670n;
        if (j71Var != null) {
            j71Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f25666j;
    }

    public final void c(org.telegram.ui.ls0 ls0Var) {
        this.f25670n = ls0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f25667k) {
            return;
        }
        if (z11 != z10) {
            this.f25671o = 0L;
            this.f25672p = null;
        }
        this.d = z10;
        this.f25666j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k71.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f25667k != z10) {
            this.f25667k = z10;
            this.f25672p = null;
            this.f25671o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f25668l = z10;
        a();
    }

    public final void g(long j3) {
        this.f25671o = j3;
        if (j3 >= 1000) {
            this.f25672p = LocaleController.formatPluralString("Seconds", (int) (j3 / 1000), new Object[0]);
        } else {
            this.f25672p = null;
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
        this.f25660a.setAlpha(i10);
        this.f25661b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f25660a.setColorFilter(colorFilter);
    }
}
