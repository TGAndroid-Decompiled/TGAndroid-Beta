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
    public final TextPaint f39216a;
    public final Paint f39217b;
    public final Paint f39218c;
    public final Paint d;
    public final Paint f39219e;
    public final RectF f39220f;
    public PorterDuffColorFilter f39221g;
    public float h;
    public final DecelerateInterpolator f39222i;
    public boolean f39223j;
    public float f39224k;
    public int f39225l;
    public String f39226m;
    public int f39227n;
    public float f39228o;
    public int f39229p;
    public int f39230q;
    public float f39231r;
    public float f39232s;
    public long f39233t;
    public boolean f39234u;
    public float v;
    public float f39235w;
    public float f39236x;
    public float f39237y;
    public float f39238z;

    public s80() {
        TextPaint textPaint = new TextPaint(1);
        this.f39216a = textPaint;
        Paint paint = new Paint(1);
        this.f39217b = paint;
        this.f39218c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f39219e = paint3;
        this.f39220f = new RectF();
        this.h = 1.0f;
        this.f39222i = new DecelerateInterpolator();
        this.f39224k = 400.0f;
        this.f39225l = -1;
        this.f39228o = 1.0f;
        this.f39231r = 1.0f;
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
        if (this.f39234u) {
            return this.f39231r;
        }
        return 1.0f;
    }

    public final void c(int i7) {
        int i10 = (-16777216) | i7;
        this.f39217b.setColor(i10);
        this.d.setColor(i10);
        this.f39219e.setColor(i10);
        this.f39216a.setColor(i10);
        this.f39221g = new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i7, boolean z10) {
        int i10;
        int i11;
        if (this.f39229p == i7 && (i11 = this.f39230q) != i7) {
            this.f39229p = i11;
            this.f39231r = 1.0f;
        }
        if (z10) {
            int i12 = this.f39229p;
            if (i12 != i7 && (i10 = this.f39230q) != i7) {
                if ((i12 == 0 && i7 == 1) || (i12 == 1 && i7 == 0)) {
                    this.f39224k = 300.0f;
                } else if (i12 == 2 && (i7 == 3 || i7 == 14)) {
                    this.f39224k = 400.0f;
                } else if (i12 != 4 && i7 == 6) {
                    this.f39224k = 360.0f;
                } else if ((i12 == 4 && i7 == 14) || (i12 == 14 && i7 == 4)) {
                    this.f39224k = 160.0f;
                } else {
                    this.f39224k = 220.0f;
                }
                if (this.f39234u) {
                    this.f39229p = i10;
                }
                this.f39234u = true;
                this.f39230q = i7;
                this.f39232s = this.f39231r;
                this.f39231r = 0.0f;
            } else {
                return;
            }
        } else if (this.f39229p == i7) {
            return;
        } else {
            this.f39234u = false;
            this.f39230q = i7;
            this.f39229p = i7;
            this.f39232s = this.f39231r;
            this.f39231r = 1.0f;
        }
        if (i7 == 3 || i7 == 14) {
            this.v = 112.0f;
            this.f39236x = 0.0f;
            this.f39237y = 0.0f;
            this.f39238z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s80.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10, float f10) {
        if (this.f39235w == f10) {
            return;
        }
        if (!z10) {
            this.f39236x = f10;
            this.f39237y = f10;
        } else {
            if (this.f39236x > f10) {
                this.f39236x = f10;
            }
            this.f39237y = this.f39236x;
        }
        this.f39235w = f10;
        this.f39238z = 0.0f;
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
            this.f39217b.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f39217b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.f39219e.setColorFilter(colorFilter);
        this.f39216a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i7) {
    }
}
