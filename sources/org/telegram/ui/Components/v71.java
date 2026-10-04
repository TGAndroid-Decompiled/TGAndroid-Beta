package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class v71 extends Drawable {
    public static final int[] f31582r = {10, 7, 26, 16, 10, 25};
    public final Paint f31583a;
    public final TextPaint f31584b;
    public final Path f31585c;
    public boolean d;
    public final boolean f31586e;
    public Path f31587f;
    public int f31588g;
    public float h;
    public float f31589i;
    public boolean f31590j;
    public boolean f31591k;
    public boolean f31592l;
    public long f31593m;
    public u71 f31594n;
    public long f31595o;
    public String f31596p;
    public float f31597q;

    public v71(boolean z10) {
        Paint paint = new Paint(1);
        this.f31583a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f31584b = textPaint;
        Path path = new Path();
        this.f31585c = path;
        this.f31597q = 1.0f;
        this.f31586e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f31582r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f31585c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f31585c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f31585c.close();
    }

    public final void a() {
        u71 u71Var = this.f31594n;
        if (u71Var != null) {
            u71Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f31590j;
    }

    public final void c(org.telegram.ui.os0 os0Var) {
        this.f31594n = os0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f31591k) {
            return;
        }
        if (z11 != z10) {
            this.f31595o = 0L;
            this.f31596p = null;
        }
        this.d = z10;
        this.f31590j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v71.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f31591k != z10) {
            this.f31591k = z10;
            this.f31596p = null;
            this.f31595o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f31592l = z10;
        a();
    }

    public final void g(long j3) {
        this.f31595o = j3;
        if (j3 >= 1000) {
            this.f31596p = LocaleController.formatPluralString("Seconds", (int) (j3 / 1000), new Object[0]);
        } else {
            this.f31596p = null;
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
        this.f31583a.setAlpha(i10);
        this.f31584b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f31583a.setColorFilter(colorFilter);
    }
}
