package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class n71 extends Drawable {
    public static final int[] f26673r = {10, 7, 26, 16, 10, 25};
    public final Paint f26674a;
    public final TextPaint f26675b;
    public final Path f26676c;
    public boolean d;
    public final boolean e;
    public Path f26677f;
    public int f26678g;
    public float h;
    public float f26679i;
    public boolean f26680j;
    public boolean f26681k;
    public boolean f26682l;
    public long f26683m;
    public m71 f26684n;
    public long f26685o;
    public String f26686p;
    public float f26687q;

    public n71(boolean z10) {
        Paint paint = new Paint(1);
        this.f26674a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f26675b = textPaint;
        Path path = new Path();
        this.f26676c = path;
        this.f26687q = 1.0f;
        this.e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f26673r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f26676c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f26676c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f26676c.close();
    }

    public final void a() {
        m71 m71Var = this.f26684n;
        if (m71Var != null) {
            m71Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f26680j;
    }

    public final void c(org.telegram.ui.ts0 ts0Var) {
        this.f26684n = ts0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f26681k) {
            return;
        }
        if (z11 != z10) {
            this.f26685o = 0L;
            this.f26686p = null;
        }
        this.d = z10;
        this.f26680j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n71.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f26681k != z10) {
            this.f26681k = z10;
            this.f26686p = null;
            this.f26685o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f26682l = z10;
        a();
    }

    public final void g(long j3) {
        this.f26685o = j3;
        if (j3 >= 1000) {
            this.f26686p = LocaleController.formatPluralString("Seconds", (int) (j3 / 1000), new Object[0]);
        } else {
            this.f26686p = null;
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
        this.f26674a.setAlpha(i10);
        this.f26675b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f26674a.setColorFilter(colorFilter);
    }
}
