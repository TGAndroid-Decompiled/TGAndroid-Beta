package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class n71 extends Drawable {
    public static final int[] f26604r = {10, 7, 26, 16, 10, 25};
    public final Paint f26605a;
    public final TextPaint f26606b;
    public final Path f26607c;
    public boolean d;
    public final boolean e;
    public Path f26608f;
    public int f26609g;
    public float h;
    public float f26610i;
    public boolean f26611j;
    public boolean f26612k;
    public boolean f26613l;
    public long f26614m;
    public m71 f26615n;
    public long f26616o;
    public String f26617p;
    public float f26618q;

    public n71(boolean z10) {
        Paint paint = new Paint(1);
        this.f26605a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f26606b = textPaint;
        Path path = new Path();
        this.f26607c = path;
        this.f26618q = 1.0f;
        this.e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f26604r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f26607c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f26607c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f26607c.close();
    }

    public final void a() {
        m71 m71Var = this.f26615n;
        if (m71Var != null) {
            m71Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f26611j;
    }

    public final void c(org.telegram.ui.ls0 ls0Var) {
        this.f26615n = ls0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f26612k) {
            return;
        }
        if (z11 != z10) {
            this.f26616o = 0L;
            this.f26617p = null;
        }
        this.d = z10;
        this.f26611j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n71.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f26612k != z10) {
            this.f26612k = z10;
            this.f26617p = null;
            this.f26616o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f26613l = z10;
        a();
    }

    public final void g(long j3) {
        this.f26616o = j3;
        if (j3 >= 1000) {
            this.f26617p = LocaleController.formatPluralString("Seconds", (int) (j3 / 1000), new Object[0]);
        } else {
            this.f26617p = null;
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
        this.f26605a.setAlpha(i10);
        this.f26606b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f26605a.setColorFilter(colorFilter);
    }
}
