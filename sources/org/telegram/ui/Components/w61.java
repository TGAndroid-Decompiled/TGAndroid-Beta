package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class w61 extends Drawable {
    public static final int[] f32197r = {10, 7, 26, 16, 10, 25};
    public final Paint f32198a;
    public final TextPaint f32199b;
    public final Path f32200c;
    public boolean d;
    public final boolean f32201e;
    public Path f32202f;
    public int f32203g;
    public float h;
    public float f32204i;
    public boolean f32205j;
    public boolean f32206k;
    public boolean f32207l;
    public long f32208m;
    public v61 f32209n;
    public long f32210o;
    public String f32211p;
    public float f32212q;

    public w61(boolean z10) {
        Paint paint = new Paint(1);
        this.f32198a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f32199b = textPaint;
        Path path = new Path();
        this.f32200c = path;
        this.f32212q = 1.0f;
        this.f32201e = z10;
        paint.setColor(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        path.reset();
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = f32197r;
            if (i10 == 0) {
                int i11 = i10 * 2;
                this.f32200c.moveTo(AndroidUtilities.dp(iArr[i11]), AndroidUtilities.dp(iArr[i11 + 1]));
            } else {
                int i12 = i10 * 2;
                this.f32200c.lineTo(AndroidUtilities.dp(iArr[i12]), AndroidUtilities.dp(iArr[i12 + 1]));
            }
        }
        this.f32200c.close();
    }

    public final void a() {
        v61 v61Var = this.f32209n;
        if (v61Var != null) {
            v61Var.invalidate();
        } else {
            invalidateSelf();
        }
    }

    public final boolean b() {
        return this.f32205j;
    }

    public final void c(org.telegram.ui.ss0 ss0Var) {
        this.f32209n = ss0Var;
    }

    public final void d(boolean z10) {
        boolean z11 = this.d;
        if (z11 == z10 && this.h >= 1.0f && this.f32206k) {
            return;
        }
        if (z11 != z10) {
            this.f32210o = 0L;
            this.f32211p = null;
        }
        this.d = z10;
        this.f32205j = true;
        this.h = 0.0f;
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w61.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        if (this.f32206k != z10) {
            this.f32206k = z10;
            this.f32211p = null;
            this.f32210o = 0L;
            this.h = 0.0f;
        }
    }

    public final void f(boolean z10) {
        this.f32207l = z10;
        a();
    }

    public final void g(long j3) {
        this.f32210o = j3;
        if (j3 >= 1000) {
            this.f32211p = LocaleController.formatPluralString("Seconds", (int) (j3 / 1000), new Object[0]);
        } else {
            this.f32211p = null;
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
        this.f32198a.setAlpha(i10);
        this.f32199b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f32198a.setColorFilter(colorFilter);
    }
}
