package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class h81 extends Drawable {
    public static final int[] f26684r = {10, 7, 26, 16, 10, 25};
    public final Paint f26685a;
    public final TextPaint f26686b;
    public final Path f26687c;
    public boolean d;
    public final boolean f26688e;
    public Path f26689f;
    public int f26690g;
    public float h;
    public float f26691i;
    public boolean f26692j;
    public boolean f26693k;
    public boolean f26694l;
    public long f26695m;
    public g81 f26696n;
    public long f26697o;
    public String f26698p;
    public float f26699q;

    public h81(boolean z10) {
        Paint paint = new Paint(1);
        this.f26685a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f26686b = textPaint;
        Path path = new Path();
        this.f26687c = path;
        this.f26699q = 1.0f;
        this.f26688e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f26684r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f26687c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f26687c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f26687c.close();
    }

    public final void a() {
        g81 g81Var = this.f26696n;
        if (g81Var != null) {
            g81Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f26692j;
    }

    public final void c(org.telegram.ui.vs0 vs0Var) {
        this.f26696n = vs0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f26693k) {
            return;
        }
        if (z11 != z10) {
            this.f26697o = 0L;
            this.f26698p = null;
        }
        this.d = z10;
        this.f26692j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h81.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f26693k != z10) {
            this.f26693k = z10;
            this.f26698p = null;
            this.f26697o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f26694l = z10;
        a();
    }

    public final void g(long j3) {
        this.f26697o = j3;
        if (j3 >= 1000) {
            this.f26698p = LocaleController.formatPluralString("Seconds", (int) (j3 / 1000), new Object[0]);
        } else {
            this.f26698p = null;
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
        this.f26685a.setAlpha(i10);
        this.f26686b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f26685a.setColorFilter(colorFilter);
    }
}
