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
    public final TextPaint f26920a;
    public final Paint f26921b;
    public final Paint f26922c;
    public final Paint d;
    public final Paint e;
    public final RectF f26923f;
    public PorterDuffColorFilter f26924g;
    public float h;
    public final DecelerateInterpolator f26925i;
    public boolean f26926j;
    public float f26927k;
    public int f26928l;
    public String f26929m;
    public int f26930n;
    public float f26931o;
    public int f26932p;
    public int f26933q;
    public float f26934r;
    public float f26935s;
    public long f26936t;
    public boolean f26937u;
    public float v;
    public float f26938w;
    public float f26939x;
    public float f26940y;
    public float f26941z;

    public i90() {
        TextPaint textPaint = new TextPaint(1);
        this.f26920a = textPaint;
        Paint paint = new Paint(1);
        this.f26921b = paint;
        this.f26922c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f26923f = new RectF();
        this.h = 1.0f;
        this.f26925i = new DecelerateInterpolator();
        this.f26927k = 400.0f;
        this.f26928l = -1;
        this.f26931o = 1.0f;
        this.f26934r = 1.0f;
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
            Shader shader = c5Var2.f20210a;
            Matrix matrix = c5Var2.f20217k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f20224r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f20224r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f26937u) {
            return this.f26934r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f26921b.setColor(i11);
        this.d.setColor(i11);
        this.e.setColor(i11);
        this.f26920a.setColor(i11);
        this.f26924g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f26932p == i10 && (i12 = this.f26933q) != i10) {
            this.f26932p = i12;
            this.f26934r = 1.0f;
        }
        if (z10) {
            int i13 = this.f26932p;
            if (i13 != i10 && (i11 = this.f26933q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f26927k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f26927k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f26927k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f26927k = 160.0f;
                } else {
                    this.f26927k = 220.0f;
                }
                if (this.f26937u) {
                    this.f26932p = i11;
                }
                this.f26937u = true;
                this.f26933q = i10;
                this.f26935s = this.f26934r;
                this.f26934r = 0.0f;
            } else {
                return;
            }
        } else if (this.f26932p == i10) {
            return;
        } else {
            this.f26937u = false;
            this.f26933q = i10;
            this.f26932p = i10;
            this.f26935s = this.f26934r;
            this.f26934r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f26939x = 0.0f;
            this.f26940y = 0.0f;
            this.f26941z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i90.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10, float f7) {
        if (this.f26938w == f7) {
            return;
        }
        if (!z10) {
            this.f26939x = f7;
            this.f26940y = f7;
        } else {
            if (this.f26939x > f7) {
                this.f26939x = f7;
            }
            this.f26940y = this.f26939x;
        }
        this.f26938w = f7;
        this.f26941z = 0.0f;
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
            ((View) pxVar.f29448b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float L = (i12 - i10) / org.telegram.messenger.i0.L(48.0f);
        this.h = L;
        if (L < 0.7f) {
            this.f26921b.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f26921b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
        this.f26920a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
