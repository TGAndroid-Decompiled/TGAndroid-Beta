package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class t90 extends Drawable {
    public mv A;
    public org.telegram.ui.ActionBar.e5 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f28116a;
    public final Paint f28117b;
    public final Paint f28118c;
    public final Paint d;
    public final Paint e;
    public final RectF f28119f;
    public PorterDuffColorFilter f28120g;
    public float h;
    public final DecelerateInterpolator f28121i;
    public boolean f28122j;
    public float f28123k;
    public int f28124l;
    public String f28125m;
    public int f28126n;
    public float f28127o;
    public int f28128p;
    public int f28129q;
    public float f28130r;
    public float f28131s;
    public long f28132t;
    public boolean f28133u;
    public float v;
    public float f28134w;
    public float f28135x;
    public float f28136y;
    public float f28137z;

    public t90() {
        TextPaint textPaint = new TextPaint(1);
        this.f28116a = textPaint;
        Paint paint = new Paint(1);
        this.f28117b = paint;
        this.f28118c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f28119f = new RectF();
        this.h = 1.0f;
        this.f28121i = new DecelerateInterpolator();
        this.f28123k = 400.0f;
        this.f28124l = -1;
        this.f28127o = 1.0f;
        this.f28130r = 1.0f;
        paint.setColor(-1);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint3.setColor(-1);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setColor(-1);
        paint2.setColor(-1);
    }

    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.e5 e5Var = this.B;
        if (e5Var != null && e5Var.l() && !this.E) {
            Rect bounds = getBounds();
            org.telegram.ui.ActionBar.e5 e5Var2 = this.B;
            Shader shader = e5Var2.f18581a;
            Matrix matrix = e5Var2.f18588k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f18595r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f18595r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f28133u) {
            return this.f28130r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f28117b.setColor(i11);
        this.d.setColor(i11);
        this.e.setColor(i11);
        this.f28116a.setColor(i11);
        this.f28120g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f28128p == i10 && (i12 = this.f28129q) != i10) {
            this.f28128p = i12;
            this.f28130r = 1.0f;
        }
        if (z10) {
            int i13 = this.f28128p;
            if (i13 != i10 && (i11 = this.f28129q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f28123k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f28123k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f28123k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f28123k = 160.0f;
                } else {
                    this.f28123k = 220.0f;
                }
                if (this.f28133u) {
                    this.f28128p = i11;
                }
                this.f28133u = true;
                this.f28129q = i10;
                this.f28131s = this.f28130r;
                this.f28130r = 0.0f;
            } else {
                return;
            }
        } else if (this.f28128p == i10) {
            return;
        } else {
            this.f28133u = false;
            this.f28129q = i10;
            this.f28128p = i10;
            this.f28131s = this.f28130r;
            this.f28130r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f28135x = 0.0f;
            this.f28136y = 0.0f;
            this.f28137z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t90.draw(android.graphics.Canvas):void");
    }

    public final void e(float f7, boolean z10) {
        if (this.f28134w == f7) {
            return;
        }
        if (!z10) {
            this.f28135x = f7;
            this.f28136y = f7;
        } else {
            if (this.f28135x > f7) {
                this.f28135x = f7;
            }
            this.f28136y = this.f28135x;
        }
        this.f28134w = f7;
        this.f28137z = 0.0f;
        invalidateSelf();
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public final int getMinimumHeight() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public final int getMinimumWidth() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        mv mvVar = this.A;
        if (mvVar != null) {
            ((View) mvVar.f26280b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f28117b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28117b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
        this.f28116a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
