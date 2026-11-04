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
public final class m80 extends Drawable {
    public zw A;
    public org.telegram.ui.ActionBar.t4 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f36069a;
    public final Paint f36070b;
    public final Paint f36071c;
    public final Paint d;
    public final Paint f36072e;
    public final RectF f36073f;
    public PorterDuffColorFilter f36074g;
    public float h;
    public final DecelerateInterpolator f36075i;
    public boolean f36076j;
    public float f36077k;
    public int f36078l;
    public String f36079m;
    public int f36080n;
    public float f36081o;
    public int f36082p;
    public int f36083q;
    public float f36084r;
    public float f36085s;
    public long f36086t;
    public boolean f36087u;
    public float v;
    public float f36088w;
    public float f36089x;
    public float f36090y;
    public float f36091z;

    public m80() {
        TextPaint textPaint = new TextPaint(1);
        this.f36069a = textPaint;
        Paint paint = new Paint(1);
        this.f36070b = paint;
        this.f36071c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f36072e = paint3;
        this.f36073f = new RectF();
        this.h = 1.0f;
        this.f36075i = new DecelerateInterpolator();
        this.f36077k = 400.0f;
        this.f36078l = -1;
        this.f36081o = 1.0f;
        this.f36084r = 1.0f;
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
        org.telegram.ui.ActionBar.t4 t4Var = this.B;
        if (t4Var != null && t4Var.m() && !this.E) {
            Rect bounds = getBounds();
            org.telegram.ui.ActionBar.t4 t4Var2 = this.B;
            Shader shader = t4Var2.f28633a;
            Matrix matrix = t4Var2.f28641k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f28648r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f28648r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f36087u) {
            return this.f36084r;
        }
        return 1.0f;
    }

    public final void c(int i3) {
        int i10 = (-16777216) | i3;
        this.f36070b.setColor(i10);
        this.d.setColor(i10);
        this.f36072e.setColor(i10);
        this.f36069a.setColor(i10);
        this.f36074g = new PorterDuffColorFilter(i3, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i3, boolean z10) {
        int i10;
        int i11;
        if (this.f36082p == i3 && (i11 = this.f36083q) != i3) {
            this.f36082p = i11;
            this.f36084r = 1.0f;
        }
        if (z10) {
            int i12 = this.f36082p;
            if (i12 != i3 && (i10 = this.f36083q) != i3) {
                if ((i12 == 0 && i3 == 1) || (i12 == 1 && i3 == 0)) {
                    this.f36077k = 300.0f;
                } else if (i12 == 2 && (i3 == 3 || i3 == 14)) {
                    this.f36077k = 400.0f;
                } else if (i12 != 4 && i3 == 6) {
                    this.f36077k = 360.0f;
                } else if ((i12 == 4 && i3 == 14) || (i12 == 14 && i3 == 4)) {
                    this.f36077k = 160.0f;
                } else {
                    this.f36077k = 220.0f;
                }
                if (this.f36087u) {
                    this.f36082p = i10;
                }
                this.f36087u = true;
                this.f36083q = i3;
                this.f36085s = this.f36084r;
                this.f36084r = 0.0f;
            } else {
                return;
            }
        } else if (this.f36082p == i3) {
            return;
        } else {
            this.f36087u = false;
            this.f36083q = i3;
            this.f36082p = i3;
            this.f36085s = this.f36084r;
            this.f36084r = 1.0f;
        }
        if (i3 == 3 || i3 == 14) {
            this.v = 112.0f;
            this.f36089x = 0.0f;
            this.f36090y = 0.0f;
            this.f36091z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m80.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10, float f10) {
        if (this.f36088w == f10) {
            return;
        }
        if (!z10) {
            this.f36089x = f10;
            this.f36090y = f10;
        } else {
            if (this.f36089x > f10) {
                this.f36089x = f10;
            }
            this.f36090y = this.f36089x;
        }
        this.f36088w = f10;
        this.f36091z = 0.0f;
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
        zw zwVar = this.A;
        if (zwVar != null) {
            ((View) zwVar.f41140b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i3, int i10, int i11, int i12) {
        super.setBounds(i3, i10, i11, i12);
        float L = (i11 - i3) / org.telegram.messenger.g0.L(48.0f);
        this.h = L;
        if (L < 0.7f) {
            this.f36070b.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f36070b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.f36072e.setColorFilter(colorFilter);
        this.f36069a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i3) {
    }
}
