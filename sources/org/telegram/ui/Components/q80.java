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
public final class q80 extends Drawable {
    public bx A;
    public org.telegram.ui.ActionBar.t4 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f37239a;
    public final Paint f37240b;
    public final Paint f37241c;
    public final Paint d;
    public final Paint f37242e;
    public final RectF f37243f;
    public PorterDuffColorFilter f37244g;
    public float h;
    public final DecelerateInterpolator f37245i;
    public boolean f37246j;
    public float f37247k;
    public int f37248l;
    public String f37249m;
    public int f37250n;
    public float f37251o;
    public int f37252p;
    public int f37253q;
    public float f37254r;
    public float f37255s;
    public long f37256t;
    public boolean f37257u;
    public float v;
    public float f37258w;
    public float f37259x;
    public float f37260y;
    public float f37261z;

    public q80() {
        TextPaint textPaint = new TextPaint(1);
        this.f37239a = textPaint;
        Paint paint = new Paint(1);
        this.f37240b = paint;
        this.f37241c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f37242e = paint3;
        this.f37243f = new RectF();
        this.h = 1.0f;
        this.f37245i = new DecelerateInterpolator();
        this.f37247k = 400.0f;
        this.f37248l = -1;
        this.f37251o = 1.0f;
        this.f37254r = 1.0f;
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
            Shader shader = t4Var2.f28515a;
            Matrix matrix = t4Var2.f28523k;
            matrix.reset();
            this.B.a();
            if (z9) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f28530r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f28530r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f37257u) {
            return this.f37254r;
        }
        return 1.0f;
    }

    public final void c(int i7) {
        int i10 = (-16777216) | i7;
        this.f37240b.setColor(i10);
        this.d.setColor(i10);
        this.f37242e.setColor(i10);
        this.f37239a.setColor(i10);
        this.f37244g = new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i7, boolean z9) {
        int i10;
        int i11;
        if (this.f37252p == i7 && (i11 = this.f37253q) != i7) {
            this.f37252p = i11;
            this.f37254r = 1.0f;
        }
        if (z9) {
            int i12 = this.f37252p;
            if (i12 != i7 && (i10 = this.f37253q) != i7) {
                if ((i12 == 0 && i7 == 1) || (i12 == 1 && i7 == 0)) {
                    this.f37247k = 300.0f;
                } else if (i12 == 2 && (i7 == 3 || i7 == 14)) {
                    this.f37247k = 400.0f;
                } else if (i12 != 4 && i7 == 6) {
                    this.f37247k = 360.0f;
                } else if ((i12 == 4 && i7 == 14) || (i12 == 14 && i7 == 4)) {
                    this.f37247k = 160.0f;
                } else {
                    this.f37247k = 220.0f;
                }
                if (this.f37257u) {
                    this.f37252p = i10;
                }
                this.f37257u = true;
                this.f37253q = i7;
                this.f37255s = this.f37254r;
                this.f37254r = 0.0f;
            } else {
                return;
            }
        } else if (this.f37252p == i7) {
            return;
        } else {
            this.f37257u = false;
            this.f37253q = i7;
            this.f37252p = i7;
            this.f37255s = this.f37254r;
            this.f37254r = 1.0f;
        }
        if (i7 == 3 || i7 == 14) {
            this.v = 112.0f;
            this.f37259x = 0.0f;
            this.f37260y = 0.0f;
            this.f37261z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q80.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z9, float f10) {
        if (this.f37258w == f10) {
            return;
        }
        if (!z9) {
            this.f37259x = f10;
            this.f37260y = f10;
        } else {
            if (this.f37259x > f10) {
                this.f37259x = f10;
            }
            this.f37260y = this.f37259x;
        }
        this.f37258w = f10;
        this.f37261z = 0.0f;
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
            ((View) bxVar.f32442b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        float L = (i11 - i7) / org.telegram.messenger.g0.L(48.0f);
        this.h = L;
        if (L < 0.7f) {
            this.f37240b.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f37240b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.f37242e.setColorFilter(colorFilter);
        this.f37239a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i7) {
    }
}
