package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class k81 extends Drawable {
    public static final int[] f29886r = {10, 7, 26, 16, 10, 25};
    public final Paint f29887a;
    public final TextPaint f29888b;
    public final Path f29889c;
    public boolean d;
    public final boolean e;
    public Path f29890f;
    public int f29891g;
    public float h;
    public float f29892i;
    public boolean f29893j;
    public boolean f29894k;
    public boolean f29895l;
    public long f29896m;
    public j81 f29897n;
    public long f29898o;
    public String f29899p;
    public float f29900q;

    public k81(boolean z10) {
        Paint paint = new Paint(1);
        this.f29887a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f29888b = textPaint;
        Path path = new Path();
        this.f29889c = path;
        this.f29900q = 1.0f;
        this.e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f29886r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f29889c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f29889c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f29889c.close();
    }

    public final void a() {
        j81 j81Var = this.f29897n;
        if (j81Var != null) {
            j81Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f29893j;
    }

    public final void c(org.telegram.ui.is0 is0Var) {
        this.f29897n = is0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f29894k) {
            return;
        }
        if (z11 != z10) {
            this.f29898o = 0L;
            this.f29899p = null;
        }
        this.d = z10;
        this.f29893j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k81.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f29894k != z10) {
            this.f29894k = z10;
            this.f29899p = null;
            this.f29898o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f29895l = z10;
        a();
    }

    public final void g(long j10) {
        this.f29898o = j10;
        if (j10 >= 1000) {
            this.f29899p = LocaleController.formatPluralString("Seconds", (int) (j10 / 1000), new Object[0]);
        } else {
            this.f29899p = null;
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
        this.f29887a.setAlpha(i10);
        this.f29888b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29887a.setColorFilter(colorFilter);
    }
}
