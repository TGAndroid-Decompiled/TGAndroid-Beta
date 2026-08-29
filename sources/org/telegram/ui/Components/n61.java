package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class n61 extends Drawable {
    public static final int[] f30902r = {10, 7, 26, 16, 10, 25};
    public final Paint f30903a;
    public final TextPaint f30904b;
    public final Path f30905c;
    public boolean d;
    public final boolean f30906e;
    public Path f30907f;
    public int f30908g;
    public float h;
    public float f30909i;
    public boolean f30910j;
    public boolean f30911k;
    public boolean f30912l;
    public long f30913m;
    public m61 f30914n;
    public long f30915o;
    public String f30916p;
    public float f30917q;

    public n61(boolean z10) {
        Paint paint = new Paint(1);
        this.f30903a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f30904b = textPaint;
        Path path = new Path();
        this.f30905c = path;
        this.f30917q = 1.0f;
        this.f30906e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f30902r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f30905c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f30905c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f30905c.close();
    }

    public final void a() {
        m61 m61Var = this.f30914n;
        if (m61Var != null) {
            m61Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f30910j;
    }

    public final void c(org.telegram.ui.pr0 pr0Var) {
        this.f30914n = pr0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f30911k) {
            return;
        }
        if (z11 != z10) {
            this.f30915o = 0L;
            this.f30916p = null;
        }
        this.d = z10;
        this.f30910j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n61.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f30911k != z10) {
            this.f30911k = z10;
            this.f30916p = null;
            this.f30915o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f30912l = z10;
        a();
    }

    public final void g(long j10) {
        this.f30915o = j10;
        if (j10 >= 1000) {
            this.f30916p = LocaleController.formatPluralString("Seconds", (int) (j10 / 1000), new Object[0]);
        } else {
            this.f30916p = null;
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
        this.f30903a.setAlpha(i10);
        this.f30904b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f30903a.setColorFilter(colorFilter);
    }
}
