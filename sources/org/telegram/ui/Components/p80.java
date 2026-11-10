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
    public ax A;
    public org.telegram.ui.ActionBar.u4 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f36838a;
    public final Paint f36839b;
    public final Paint f36840c;
    public final Paint d;
    public final Paint f36841e;
    public final RectF f36842f;
    public PorterDuffColorFilter f36843g;
    public float h;
    public final DecelerateInterpolator f36844i;
    public boolean f36845j;
    public float f36846k;
    public int f36847l;
    public String f36848m;
    public int f36849n;
    public float f36850o;
    public int f36851p;
    public int f36852q;
    public float f36853r;
    public float f36854s;
    public long f36855t;
    public boolean f36856u;
    public float v;
    public float f36857w;
    public float f36858x;
    public float f36859y;
    public float f36860z;

    public p80() {
        TextPaint textPaint = new TextPaint(1);
        this.f36838a = textPaint;
        Paint paint = new Paint(1);
        this.f36839b = paint;
        this.f36840c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f36841e = paint3;
        this.f36842f = new RectF();
        this.h = 1.0f;
        this.f36844i = new DecelerateInterpolator();
        this.f36846k = 400.0f;
        this.f36847l = -1;
        this.f36850o = 1.0f;
        this.f36853r = 1.0f;
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
        org.telegram.ui.ActionBar.u4 u4Var = this.B;
        if (u4Var != null && u4Var.l() && !this.E) {
            Rect bounds = getBounds();
            org.telegram.ui.ActionBar.u4 u4Var2 = this.B;
            Shader shader = u4Var2.f28584a;
            Matrix matrix = u4Var2.f28592k;
            matrix.reset();
            this.B.a();
            if (z9) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f28599r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f28599r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f36856u) {
            return this.f36853r;
        }
        return 1.0f;
    }

    public final void c(int i7) {
        int i10 = (-16777216) | i7;
        this.f36839b.setColor(i10);
        this.d.setColor(i10);
        this.f36841e.setColor(i10);
        this.f36838a.setColor(i10);
        this.f36843g = new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i7, boolean z9) {
        int i10;
        int i11;
        if (this.f36851p == i7 && (i11 = this.f36852q) != i7) {
            this.f36851p = i11;
            this.f36853r = 1.0f;
        }
        if (z9) {
            int i12 = this.f36851p;
            if (i12 != i7 && (i10 = this.f36852q) != i7) {
                if ((i12 == 0 && i7 == 1) || (i12 == 1 && i7 == 0)) {
                    this.f36846k = 300.0f;
                } else if (i12 == 2 && (i7 == 3 || i7 == 14)) {
                    this.f36846k = 400.0f;
                } else if (i12 != 4 && i7 == 6) {
                    this.f36846k = 360.0f;
                } else if ((i12 == 4 && i7 == 14) || (i12 == 14 && i7 == 4)) {
                    this.f36846k = 160.0f;
                } else {
                    this.f36846k = 220.0f;
                }
                if (this.f36856u) {
                    this.f36851p = i10;
                }
                this.f36856u = true;
                this.f36852q = i7;
                this.f36854s = this.f36853r;
                this.f36853r = 0.0f;
            } else {
                return;
            }
        } else if (this.f36851p == i7) {
            return;
        } else {
            this.f36856u = false;
            this.f36852q = i7;
            this.f36851p = i7;
            this.f36854s = this.f36853r;
            this.f36853r = 1.0f;
        }
        if (i7 == 3 || i7 == 14) {
            this.v = 112.0f;
            this.f36858x = 0.0f;
            this.f36859y = 0.0f;
            this.f36860z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p80.draw(android.graphics.Canvas):void");
    }

    public final void e(boolean z9, float f10) {
        if (this.f36857w == f10) {
            return;
        }
        if (!z9) {
            this.f36858x = f10;
            this.f36859y = f10;
        } else {
            if (this.f36858x > f10) {
                this.f36858x = f10;
            }
            this.f36859y = this.f36858x;
        }
        this.f36857w = f10;
        this.f36860z = 0.0f;
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
        ax axVar = this.A;
        if (axVar != null) {
            ((View) axVar.f32025b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        float L = (i11 - i7) / org.telegram.messenger.g0.L(48.0f);
        this.h = L;
        if (L < 0.7f) {
            this.f36839b.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f36839b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.f36841e.setColorFilter(colorFilter);
        this.f36838a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i7) {
    }
}
