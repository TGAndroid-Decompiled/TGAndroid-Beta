package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class m71 extends Drawable {
    public static final int[] f26369r = {10, 7, 26, 16, 10, 25};
    public final Paint f26370a;
    public final TextPaint f26371b;
    public final Path f26372c;
    public boolean d;
    public final boolean e;
    public Path f26373f;
    public int f26374g;
    public float h;
    public float f26375i;
    public boolean f26376j;
    public boolean f26377k;
    public boolean f26378l;
    public long f26379m;
    public l71 f26380n;
    public long f26381o;
    public String f26382p;
    public float f26383q;

    public m71(boolean z10) {
        Paint paint = new Paint(1);
        this.f26370a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f26371b = textPaint;
        Path path = new Path();
        this.f26372c = path;
        this.f26383q = 1.0f;
        this.e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f26369r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f26372c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f26372c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f26372c.close();
    }

    public final void a() {
        l71 l71Var = this.f26380n;
        if (l71Var != null) {
            l71Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f26376j;
    }

    public final void c(org.telegram.ui.os0 os0Var) {
        this.f26380n = os0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f26377k) {
            return;
        }
        if (z11 != z10) {
            this.f26381o = 0L;
            this.f26382p = null;
        }
        this.d = z10;
        this.f26376j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m71.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f26377k != z10) {
            this.f26377k = z10;
            this.f26382p = null;
            this.f26381o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f26378l = z10;
        a();
    }

    public final void g(long j3) {
        this.f26381o = j3;
        if (j3 >= 1000) {
            this.f26382p = LocaleController.formatPluralString("Seconds", (int) (j3 / 1000), new Object[0]);
        } else {
            this.f26382p = null;
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
        this.f26370a.setAlpha(i10);
        this.f26371b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f26370a.setColorFilter(colorFilter);
    }
}
