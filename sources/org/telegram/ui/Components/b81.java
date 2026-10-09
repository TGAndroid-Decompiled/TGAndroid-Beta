package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class b81 extends Drawable {
    public static final int[] f24931r = {10, 7, 26, 16, 10, 25};
    public final Paint f24932a;
    public final TextPaint f24933b;
    public final Path f24934c;
    public boolean d;
    public final boolean f24935e;
    public Path f24936f;
    public int f24937g;
    public float h;
    public float f24938i;
    public boolean f24939j;
    public boolean f24940k;
    public boolean f24941l;
    public long f24942m;
    public a81 f24943n;
    public long f24944o;
    public String f24945p;
    public float f24946q;

    public b81(boolean z10) {
        Paint paint = new Paint(1);
        this.f24932a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f24933b = textPaint;
        Path path = new Path();
        this.f24934c = path;
        this.f24946q = 1.0f;
        this.f24935e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f24931r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f24934c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f24934c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f24934c.close();
    }

    public final void a() {
        a81 a81Var = this.f24943n;
        if (a81Var != null) {
            a81Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f24939j;
    }

    public final void c(org.telegram.ui.ts0 ts0Var) {
        this.f24943n = ts0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f24940k) {
            return;
        }
        if (z11 != z10) {
            this.f24944o = 0L;
            this.f24945p = null;
        }
        this.d = z10;
        this.f24939j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b81.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f24940k != z10) {
            this.f24940k = z10;
            this.f24945p = null;
            this.f24944o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f24941l = z10;
        a();
    }

    public final void g(long j3) {
        this.f24944o = j3;
        if (j3 >= 1000) {
            this.f24945p = LocaleController.formatPluralString("Seconds", (int) (j3 / 1000), new Object[0]);
        } else {
            this.f24945p = null;
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
        this.f24932a.setAlpha(i10);
        this.f24933b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f24932a.setColorFilter(colorFilter);
    }
}
