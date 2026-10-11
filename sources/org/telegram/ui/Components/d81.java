package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class d81 extends Drawable {
    public static final int[] f25476r = {10, 7, 26, 16, 10, 25};
    public final Paint f25477a;
    public final TextPaint f25478b;
    public final Path f25479c;
    public boolean d;
    public final boolean f25480e;
    public Path f25481f;
    public int f25482g;
    public float h;
    public float f25483i;
    public boolean f25484j;
    public boolean f25485k;
    public boolean f25486l;
    public long f25487m;
    public c81 f25488n;
    public long f25489o;
    public String f25490p;
    public float f25491q;

    public d81(boolean z10) {
        Paint paint = new Paint(1);
        this.f25477a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f25478b = textPaint;
        Path path = new Path();
        this.f25479c = path;
        this.f25491q = 1.0f;
        this.f25480e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f25476r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f25479c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f25479c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f25479c.close();
    }

    public final void a() {
        c81 c81Var = this.f25488n;
        if (c81Var != null) {
            c81Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f25484j;
    }

    public final void c(org.telegram.ui.ss0 ss0Var) {
        this.f25488n = ss0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f25485k) {
            return;
        }
        if (z11 != z10) {
            this.f25489o = 0L;
            this.f25490p = null;
        }
        this.d = z10;
        this.f25484j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d81.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f25485k != z10) {
            this.f25485k = z10;
            this.f25490p = null;
            this.f25489o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f25486l = z10;
        a();
    }

    public final void g(long j3) {
        this.f25489o = j3;
        if (j3 >= 1000) {
            this.f25490p = LocaleController.formatPluralString("Seconds", (int) (j3 / 1000), new Object[0]);
        } else {
            this.f25490p = null;
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
        this.f25477a.setAlpha(i10);
        this.f25478b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f25477a.setColorFilter(colorFilter);
    }
}
