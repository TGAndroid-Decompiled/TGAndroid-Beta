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
public final class i90 extends Drawable {
    public px A;
    public org.telegram.ui.ActionBar.c5 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f27035a;
    public final Paint f27036b;
    public final Paint f27037c;
    public final Paint d;
    public final Paint e;
    public final RectF f27038f;
    public PorterDuffColorFilter f27039g;
    public float h;
    public final DecelerateInterpolator f27040i;
    public boolean f27041j;
    public float f27042k;
    public int f27043l;
    public String f27044m;
    public int f27045n;
    public float f27046o;
    public int f27047p;
    public int f27048q;
    public float f27049r;
    public float f27050s;
    public long f27051t;
    public boolean f27052u;
    public float v;
    public float f27053w;
    public float f27054x;
    public float f27055y;
    public float f27056z;

    public i90() {
        TextPaint textPaint = new TextPaint(1);
        this.f27035a = textPaint;
        Paint paint = new Paint(1);
        this.f27036b = paint;
        this.f27037c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f27038f = new RectF();
        this.h = 1.0f;
        this.f27040i = new DecelerateInterpolator();
        this.f27042k = 400.0f;
        this.f27043l = -1;
        this.f27046o = 1.0f;
        this.f27049r = 1.0f;
        paint.setColor(-1);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(3.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint3.setColor(-1);
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
        textPaint.setColor(-1);
        paint2.setColor(-1);
    }

    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.c5 c5Var = this.B;
        if (c5Var != null && c5Var.m() && !this.E) {
            Rect bounds = getBounds();
            org.telegram.ui.ActionBar.c5 c5Var2 = this.B;
            Shader shader = c5Var2.f20211a;
            Matrix matrix = c5Var2.f20218k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f20225r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f20225r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f27052u) {
            return this.f27049r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f27036b.setColor(i11);
        this.d.setColor(i11);
        this.e.setColor(i11);
        this.f27035a.setColor(i11);
        this.f27039g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f27047p == i10 && (i12 = this.f27048q) != i10) {
            this.f27047p = i12;
            this.f27049r = 1.0f;
        }
        if (z10) {
            int i13 = this.f27047p;
            if (i13 != i10 && (i11 = this.f27048q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f27042k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f27042k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f27042k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f27042k = 160.0f;
                } else {
                    this.f27042k = 220.0f;
                }
                if (this.f27052u) {
                    this.f27047p = i11;
                }
                this.f27052u = true;
                this.f27048q = i10;
                this.f27050s = this.f27049r;
                this.f27049r = 0.0f;
            } else {
                return;
            }
        } else if (this.f27047p == i10) {
            return;
        } else {
            this.f27052u = false;
            this.f27048q = i10;
            this.f27047p = i10;
            this.f27050s = this.f27049r;
            this.f27049r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f27054x = 0.0f;
            this.f27055y = 0.0f;
            this.f27056z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i90.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10, float f7) {
        if (this.f27053w == f7) {
            return;
        }
        if (!z10) {
            this.f27054x = f7;
            this.f27055y = f7;
        } else {
            if (this.f27054x > f7) {
                this.f27054x = f7;
            }
            this.f27055y = this.f27054x;
        }
        this.f27053w = f7;
        this.f27056z = 0.0f;
        invalidateSelf();
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(48.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(48.0f);
    }

    @Override
    public final int getMinimumHeight() {
        return org.telegram.messenger.i0.L(48.0f);
    }

    @Override
    public final int getMinimumWidth() {
        return org.telegram.messenger.i0.L(48.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        px pxVar = this.A;
        if (pxVar != null) {
            ((View) pxVar.f29561b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float L = (i12 - i10) / org.telegram.messenger.i0.L(48.0f);
        this.h = L;
        if (L < 0.7f) {
            this.f27036b.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27036b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
        this.f27035a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
