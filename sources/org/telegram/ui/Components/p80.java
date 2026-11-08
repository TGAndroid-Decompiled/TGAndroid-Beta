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
public final class p80 extends Drawable {
    public bx A;
    public org.telegram.ui.ActionBar.t4 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f36842a;
    public final Paint f36843b;
    public final Paint f36844c;
    public final Paint d;
    public final Paint f36845e;
    public final RectF f36846f;
    public PorterDuffColorFilter f36847g;
    public float h;
    public final DecelerateInterpolator f36848i;
    public boolean f36849j;
    public float f36850k;
    public int f36851l;
    public String f36852m;
    public int f36853n;
    public float f36854o;
    public int f36855p;
    public int f36856q;
    public float f36857r;
    public float f36858s;
    public long f36859t;
    public boolean f36860u;
    public float v;
    public float f36861w;
    public float f36862x;
    public float f36863y;
    public float f36864z;

    public p80() {
        TextPaint textPaint = new TextPaint(1);
        this.f36842a = textPaint;
        Paint paint = new Paint(1);
        this.f36843b = paint;
        this.f36844c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f36845e = paint3;
        this.f36846f = new RectF();
        this.h = 1.0f;
        this.f36848i = new DecelerateInterpolator();
        this.f36850k = 400.0f;
        this.f36851l = -1;
        this.f36854o = 1.0f;
        this.f36857r = 1.0f;
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

    public final void a(boolean z9) {
        org.telegram.ui.ActionBar.t4 t4Var = this.B;
        if (t4Var != null && t4Var.l() && !this.E) {
            Rect bounds = getBounds();
            org.telegram.ui.ActionBar.t4 t4Var2 = this.B;
            Shader shader = t4Var2.f28510a;
            Matrix matrix = t4Var2.f28518k;
            matrix.reset();
            this.B.a();
            if (z9) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f28525r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f28525r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f36860u) {
            return this.f36857r;
        }
        return 1.0f;
    }

    public final void c(int i7) {
        int i10 = (-16777216) | i7;
        this.f36843b.setColor(i10);
        this.d.setColor(i10);
        this.f36845e.setColor(i10);
        this.f36842a.setColor(i10);
        this.f36847g = new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i7, boolean z9) {
        int i10;
        int i11;
        if (this.f36855p == i7 && (i11 = this.f36856q) != i7) {
            this.f36855p = i11;
            this.f36857r = 1.0f;
        }
        if (z9) {
            int i12 = this.f36855p;
            if (i12 != i7 && (i10 = this.f36856q) != i7) {
                if ((i12 == 0 && i7 == 1) || (i12 == 1 && i7 == 0)) {
                    this.f36850k = 300.0f;
                } else if (i12 == 2 && (i7 == 3 || i7 == 14)) {
                    this.f36850k = 400.0f;
                } else if (i12 != 4 && i7 == 6) {
                    this.f36850k = 360.0f;
                } else if ((i12 == 4 && i7 == 14) || (i12 == 14 && i7 == 4)) {
                    this.f36850k = 160.0f;
                } else {
                    this.f36850k = 220.0f;
                }
                if (this.f36860u) {
                    this.f36855p = i10;
                }
                this.f36860u = true;
                this.f36856q = i7;
                this.f36858s = this.f36857r;
                this.f36857r = 0.0f;
            } else {
                return;
            }
        } else if (this.f36855p == i7) {
            return;
        } else {
            this.f36860u = false;
            this.f36856q = i7;
            this.f36855p = i7;
            this.f36858s = this.f36857r;
            this.f36857r = 1.0f;
        }
        if (i7 == 3 || i7 == 14) {
            this.v = 112.0f;
            this.f36862x = 0.0f;
            this.f36863y = 0.0f;
            this.f36864z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p80.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z9, float f10) {
        if (this.f36861w == f10) {
            return;
        }
        if (!z9) {
            this.f36862x = f10;
            this.f36863y = f10;
        } else {
            if (this.f36862x > f10) {
                this.f36862x = f10;
            }
            this.f36863y = this.f36862x;
        }
        this.f36861w = f10;
        this.f36864z = 0.0f;
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
        bx bxVar = this.A;
        if (bxVar != null) {
            ((View) bxVar.f32375b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        float L = (i11 - i7) / org.telegram.messenger.g0.L(48.0f);
        this.h = L;
        if (L < 0.7f) {
            this.f36843b.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f36843b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.f36845e.setColorFilter(colorFilter);
        this.f36842a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i7) {
    }
}
