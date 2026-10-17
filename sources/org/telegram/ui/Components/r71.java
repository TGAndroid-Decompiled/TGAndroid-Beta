package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class r71 extends Drawable {
    public static final int[] f29860r = {10, 7, 26, 16, 10, 25};
    public final Paint f29861a;
    public final TextPaint f29862b;
    public final Path f29863c;
    public boolean d;
    public final boolean e;
    public Path f29864f;
    public int f29865g;
    public float h;
    public float f29866i;
    public boolean f29867j;
    public boolean f29868k;
    public boolean f29869l;
    public long f29870m;
    public q71 f29871n;
    public long f29872o;
    public String f29873p;
    public float f29874q;

    public r71(boolean z10) {
        Paint paint = new Paint(1);
        this.f29861a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f29862b = textPaint;
        Path path = new Path();
        this.f29863c = path;
        this.f29874q = 1.0f;
        this.e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f29860r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f29863c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f29863c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f29863c.close();
    }

    public final void a() {
        q71 q71Var = this.f29871n;
        if (q71Var != null) {
            q71Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f29867j;
    }

    public final void c(org.telegram.ui.bs0 bs0Var) {
        this.f29871n = bs0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f29868k) {
            return;
        }
        if (z11 != z10) {
            this.f29872o = 0L;
            this.f29873p = null;
        }
        this.d = z10;
        this.f29867j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r71.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f29868k != z10) {
            this.f29868k = z10;
            this.f29873p = null;
            this.f29872o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f29869l = z10;
        a();
    }

    public final void g(long j10) {
        this.f29872o = j10;
        if (j10 >= 1000) {
            this.f29873p = LocaleController.formatPluralString("Seconds", (int) (j10 / 1000), new Object[0]);
        } else {
            this.f29873p = null;
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
        this.f29861a.setAlpha(i10);
        this.f29862b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29861a.setColorFilter(colorFilter);
    }
}
