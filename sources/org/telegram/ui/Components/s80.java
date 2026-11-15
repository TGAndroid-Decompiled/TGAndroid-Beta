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
public final class s80 extends Drawable {
    public gx A;
    public org.telegram.ui.ActionBar.r4 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f39213a;
    public final Paint f39214b;
    public final Paint f39215c;
    public final Paint d;
    public final Paint f39216e;
    public final RectF f39217f;
    public PorterDuffColorFilter f39218g;
    public float h;
    public final DecelerateInterpolator f39219i;
    public boolean f39220j;
    public float f39221k;
    public int f39222l;
    public String f39223m;
    public int f39224n;
    public float f39225o;
    public int f39226p;
    public int f39227q;
    public float f39228r;
    public float f39229s;
    public long f39230t;
    public boolean f39231u;
    public float v;
    public float f39232w;
    public float f39233x;
    public float f39234y;
    public float f39235z;

    public s80() {
        TextPaint textPaint = new TextPaint(1);
        this.f39213a = textPaint;
        Paint paint = new Paint(1);
        this.f39214b = paint;
        this.f39215c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f39216e = paint3;
        this.f39217f = new RectF();
        this.h = 1.0f;
        this.f39219i = new DecelerateInterpolator();
        this.f39221k = 400.0f;
        this.f39222l = -1;
        this.f39225o = 1.0f;
        this.f39228r = 1.0f;
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
        org.telegram.ui.ActionBar.r4 r4Var = this.B;
        if (r4Var != null && r4Var.l() && !this.E) {
            Rect bounds = getBounds();
            org.telegram.ui.ActionBar.r4 r4Var2 = this.B;
            Shader shader = r4Var2.f29554a;
            Matrix matrix = r4Var2.f29562k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f29569r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f29569r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f39231u) {
            return this.f39228r;
        }
        return 1.0f;
    }

    public final void c(int i7) {
        int i10 = (-16777216) | i7;
        this.f39214b.setColor(i10);
        this.d.setColor(i10);
        this.f39216e.setColor(i10);
        this.f39213a.setColor(i10);
        this.f39218g = new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i7, boolean z10) {
        int i10;
        int i11;
        if (this.f39226p == i7 && (i11 = this.f39227q) != i7) {
            this.f39226p = i11;
            this.f39228r = 1.0f;
        }
        if (z10) {
            int i12 = this.f39226p;
            if (i12 != i7 && (i10 = this.f39227q) != i7) {
                if ((i12 == 0 && i7 == 1) || (i12 == 1 && i7 == 0)) {
                    this.f39221k = 300.0f;
                } else if (i12 == 2 && (i7 == 3 || i7 == 14)) {
                    this.f39221k = 400.0f;
                } else if (i12 != 4 && i7 == 6) {
                    this.f39221k = 360.0f;
                } else if ((i12 == 4 && i7 == 14) || (i12 == 14 && i7 == 4)) {
                    this.f39221k = 160.0f;
                } else {
                    this.f39221k = 220.0f;
                }
                if (this.f39231u) {
                    this.f39226p = i10;
                }
                this.f39231u = true;
                this.f39227q = i7;
                this.f39229s = this.f39228r;
                this.f39228r = 0.0f;
            } else {
                return;
            }
        } else if (this.f39226p == i7) {
            return;
        } else {
            this.f39231u = false;
            this.f39227q = i7;
            this.f39226p = i7;
            this.f39229s = this.f39228r;
            this.f39228r = 1.0f;
        }
        if (i7 == 3 || i7 == 14) {
            this.v = 112.0f;
            this.f39233x = 0.0f;
            this.f39234y = 0.0f;
            this.f39235z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s80.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10, float f10) {
        if (this.f39232w == f10) {
            return;
        }
        if (!z10) {
            this.f39233x = f10;
            this.f39234y = f10;
        } else {
            if (this.f39233x > f10) {
                this.f39233x = f10;
            }
            this.f39234y = this.f39233x;
        }
        this.f39232w = f10;
        this.f39235z = 0.0f;
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
        gx gxVar = this.A;
        if (gxVar != null) {
            ((View) gxVar.f35079b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        float L = (i11 - i7) / org.telegram.messenger.g0.L(48.0f);
        this.h = L;
        if (L < 0.7f) {
            this.f39214b.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f39214b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.f39216e.setColorFilter(colorFilter);
        this.f39213a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i7) {
    }
}
