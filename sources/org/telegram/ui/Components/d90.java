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
public final class d90 extends Drawable {
    public iy A;
    public org.telegram.ui.ActionBar.v4 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f34326a;
    public final Paint f34327b;
    public final Paint f34328c;
    public final Paint d;
    public final Paint f34329e;
    public final RectF f34330f;
    public PorterDuffColorFilter f34331g;
    public float h;
    public final DecelerateInterpolator f34332i;
    public boolean f34333j;
    public float f34334k;
    public int f34335l;
    public String f34336m;
    public int f34337n;
    public float f34338o;
    public int f34339p;
    public int f34340q;
    public float f34341r;
    public float f34342s;
    public long f34343t;
    public boolean f34344u;
    public float v;
    public float f34345w;
    public float f34346x;
    public float f34347y;
    public float f34348z;

    public d90() {
        TextPaint textPaint = new TextPaint(1);
        this.f34326a = textPaint;
        Paint paint = new Paint(1);
        this.f34327b = paint;
        this.f34328c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f34329e = paint3;
        this.f34330f = new RectF();
        this.h = 1.0f;
        this.f34332i = new DecelerateInterpolator();
        this.f34334k = 400.0f;
        this.f34335l = -1;
        this.f34338o = 1.0f;
        this.f34341r = 1.0f;
        paint.setColor(-1);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint3.setColor(-1);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setColor(-1);
        paint2.setColor(-1);
    }

    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.v4 v4Var = this.B;
        if (v4Var != null && v4Var.l() && !this.E) {
            Rect bounds = getBounds();
            org.telegram.ui.ActionBar.v4 v4Var2 = this.B;
            Shader shader = v4Var2.f30097a;
            Matrix matrix = v4Var2.f30105k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f30112r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f30112r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f34344u) {
            return this.f34341r;
        }
        return 1.0f;
    }

    public final void c(int i7) {
        int i10 = (-16777216) | i7;
        this.f34327b.setColor(i10);
        this.d.setColor(i10);
        this.f34329e.setColor(i10);
        this.f34326a.setColor(i10);
        this.f34331g = new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i7, boolean z10) {
        int i10;
        int i11;
        if (this.f34339p == i7 && (i11 = this.f34340q) != i7) {
            this.f34339p = i11;
            this.f34341r = 1.0f;
        }
        if (z10) {
            int i12 = this.f34339p;
            if (i12 != i7 && (i10 = this.f34340q) != i7) {
                if ((i12 == 0 && i7 == 1) || (i12 == 1 && i7 == 0)) {
                    this.f34334k = 300.0f;
                } else if (i12 == 2 && (i7 == 3 || i7 == 14)) {
                    this.f34334k = 400.0f;
                } else if (i12 != 4 && i7 == 6) {
                    this.f34334k = 360.0f;
                } else if ((i12 == 4 && i7 == 14) || (i12 == 14 && i7 == 4)) {
                    this.f34334k = 160.0f;
                } else {
                    this.f34334k = 220.0f;
                }
                if (this.f34344u) {
                    this.f34339p = i10;
                }
                this.f34344u = true;
                this.f34340q = i7;
                this.f34342s = this.f34341r;
                this.f34341r = 0.0f;
            } else {
                return;
            }
        } else if (this.f34339p == i7) {
            return;
        } else {
            this.f34344u = false;
            this.f34340q = i7;
            this.f34339p = i7;
            this.f34342s = this.f34341r;
            this.f34341r = 1.0f;
        }
        if (i7 == 3 || i7 == 14) {
            this.v = 112.0f;
            this.f34346x = 0.0f;
            this.f34347y = 0.0f;
            this.f34348z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d90.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10, float f10) {
        if (this.f34345w == f10) {
            return;
        }
        if (!z10) {
            this.f34346x = f10;
            this.f34347y = f10;
        } else {
            if (this.f34346x > f10) {
                this.f34346x = f10;
            }
            this.f34347y = this.f34346x;
        }
        this.f34345w = f10;
        this.f34348z = 0.0f;
        invalidateSelf();
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(48.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(48.0f);
    }

    @Override
    public final int getMinimumHeight() {
        return org.telegram.messenger.g0.L(48.0f);
    }

    @Override
    public final int getMinimumWidth() {
        return org.telegram.messenger.g0.L(48.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        iy iyVar = this.A;
        if (iyVar != null) {
            ((View) iyVar.f36266b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        float L = (i11 - i7) / org.telegram.messenger.g0.L(48.0f);
        this.h = L;
        if (L < 0.7f) {
            this.f34327b.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f34327b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.f34329e.setColorFilter(colorFilter);
        this.f34326a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i7) {
    }
}
