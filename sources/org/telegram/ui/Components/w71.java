package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class w71 extends Drawable {
    public static final int[] f32540r = {10, 7, 26, 16, 10, 25};
    public final Paint f32541a;
    public final TextPaint f32542b;
    public final Path f32543c;
    public boolean d;
    public final boolean f32544e;
    public Path f32545f;
    public int f32546g;
    public float h;
    public float f32547i;
    public boolean f32548j;
    public boolean f32549k;
    public boolean f32550l;
    public long f32551m;
    public v71 f32552n;
    public long f32553o;
    public String f32554p;
    public float f32555q;

    public w71(boolean z10) {
        Paint paint = new Paint(1);
        this.f32541a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f32542b = textPaint;
        Path path = new Path();
        this.f32543c = path;
        this.f32555q = 1.0f;
        this.f32544e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f32540r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f32543c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f32543c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f32543c.close();
    }

    public final void a() {
        v71 v71Var = this.f32552n;
        if (v71Var != null) {
            v71Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f32548j;
    }

    public final void c(org.telegram.ui.os0 os0Var) {
        this.f32552n = os0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f32549k) {
            return;
        }
        if (z11 != z10) {
            this.f32553o = 0L;
            this.f32554p = null;
        }
        this.d = z10;
        this.f32548j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w71.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f32549k != z10) {
            this.f32549k = z10;
            this.f32554p = null;
            this.f32553o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f32550l = z10;
        a();
    }

    public final void g(long j3) {
        this.f32553o = j3;
        if (j3 >= 1000) {
            this.f32554p = LocaleController.formatPluralString("Seconds", (int) (j3 / 1000), new Object[0]);
        } else {
            this.f32554p = null;
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
        this.f32541a.setAlpha(i10);
        this.f32542b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f32541a.setColorFilter(colorFilter);
    }
}
