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
public final class f90 extends Drawable {
    public ky A;
    public org.telegram.ui.ActionBar.u4 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f35164a;
    public final Paint f35165b;
    public final Paint f35166c;
    public final Paint d;
    public final Paint f35167e;
    public final RectF f35168f;
    public PorterDuffColorFilter f35169g;
    public float h;
    public final DecelerateInterpolator f35170i;
    public boolean f35171j;
    public float f35172k;
    public int f35173l;
    public String f35174m;
    public int f35175n;
    public float f35176o;
    public int f35177p;
    public int f35178q;
    public float f35179r;
    public float f35180s;
    public long f35181t;
    public boolean f35182u;
    public float v;
    public float f35183w;
    public float f35184x;
    public float f35185y;
    public float f35186z;

    public f90() {
        TextPaint textPaint = new TextPaint(1);
        this.f35164a = textPaint;
        Paint paint = new Paint(1);
        this.f35165b = paint;
        this.f35166c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f35167e = paint3;
        this.f35168f = new RectF();
        this.h = 1.0f;
        this.f35170i = new DecelerateInterpolator();
        this.f35172k = 400.0f;
        this.f35173l = -1;
        this.f35176o = 1.0f;
        this.f35179r = 1.0f;
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
        org.telegram.ui.ActionBar.u4 u4Var = this.B;
        if (u4Var != null && u4Var.l() && !this.E) {
            Rect bounds = getBounds();
            org.telegram.ui.ActionBar.u4 u4Var2 = this.B;
            Shader shader = u4Var2.f30081a;
            Matrix matrix = u4Var2.f30089k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f30096r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f30096r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f35182u) {
            return this.f35179r;
        }
        return 1.0f;
    }

    public final void c(int i7) {
        int i10 = (-16777216) | i7;
        this.f35165b.setColor(i10);
        this.d.setColor(i10);
        this.f35167e.setColor(i10);
        this.f35164a.setColor(i10);
        this.f35169g = new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i7, boolean z10) {
        int i10;
        int i11;
        if (this.f35177p == i7 && (i11 = this.f35178q) != i7) {
            this.f35177p = i11;
            this.f35179r = 1.0f;
        }
        if (z10) {
            int i12 = this.f35177p;
            if (i12 != i7 && (i10 = this.f35178q) != i7) {
                if ((i12 == 0 && i7 == 1) || (i12 == 1 && i7 == 0)) {
                    this.f35172k = 300.0f;
                } else if (i12 == 2 && (i7 == 3 || i7 == 14)) {
                    this.f35172k = 400.0f;
                } else if (i12 != 4 && i7 == 6) {
                    this.f35172k = 360.0f;
                } else if ((i12 == 4 && i7 == 14) || (i12 == 14 && i7 == 4)) {
                    this.f35172k = 160.0f;
                } else {
                    this.f35172k = 220.0f;
                }
                if (this.f35182u) {
                    this.f35177p = i10;
                }
                this.f35182u = true;
                this.f35178q = i7;
                this.f35180s = this.f35179r;
                this.f35179r = 0.0f;
            } else {
                return;
            }
        } else if (this.f35177p == i7) {
            return;
        } else {
            this.f35182u = false;
            this.f35178q = i7;
            this.f35177p = i7;
            this.f35180s = this.f35179r;
            this.f35179r = 1.0f;
        }
        if (i7 == 3 || i7 == 14) {
            this.v = 112.0f;
            this.f35184x = 0.0f;
            this.f35185y = 0.0f;
            this.f35186z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f90.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10, float f10) {
        if (this.f35183w == f10) {
            return;
        }
        if (!z10) {
            this.f35184x = f10;
            this.f35185y = f10;
        } else {
            if (this.f35184x > f10) {
                this.f35184x = f10;
            }
            this.f35185y = this.f35184x;
        }
        this.f35183w = f10;
        this.f35186z = 0.0f;
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
        ky kyVar = this.A;
        if (kyVar != null) {
            ((View) kyVar.f37037b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        float L = (i11 - i7) / org.telegram.messenger.g0.L(48.0f);
        this.h = L;
        if (L < 0.7f) {
            this.f35165b.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f35165b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.f35167e.setColorFilter(colorFilter);
        this.f35164a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i7) {
    }
}
