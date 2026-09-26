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
import org.telegram.messenger.AndroidUtilities;
public final class ea0 extends Drawable {
    public nv A;
    public org.telegram.ui.ActionBar.d5 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f23896a;
    public final Paint f23897b;
    public final Paint f23898c;
    public final Paint d;
    public final Paint e;
    public final RectF f23899f;
    public PorterDuffColorFilter f23900g;
    public float h;
    public final DecelerateInterpolator f23901i;
    public boolean f23902j;
    public float f23903k;
    public int f23904l;
    public String f23905m;
    public int f23906n;
    public float f23907o;
    public int f23908p;
    public int f23909q;
    public float f23910r;
    public float f23911s;
    public long f23912t;
    public boolean f23913u;
    public float v;
    public float f23914w;
    public float f23915x;
    public float f23916y;
    public float f23917z;

    public ea0() {
        TextPaint textPaint = new TextPaint(1);
        this.f23896a = textPaint;
        Paint paint = new Paint(1);
        this.f23897b = paint;
        this.f23898c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f23899f = new RectF();
        this.h = 1.0f;
        this.f23901i = new DecelerateInterpolator();
        this.f23903k = 400.0f;
        this.f23904l = -1;
        this.f23907o = 1.0f;
        this.f23910r = 1.0f;
        paint.setColor(-1);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint3.setColor(-1);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setColor(-1);
        paint2.setColor(-1);
    }

    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var = this.B;
        if (d5Var != null && d5Var.l() && !this.E) {
            Rect bounds = getBounds();
            org.telegram.ui.ActionBar.d5 d5Var2 = this.B;
            Shader shader = d5Var2.f18807a;
            Matrix matrix = d5Var2.f18814k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f18821r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f18821r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f23913u) {
            return this.f23910r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f23897b.setColor(i11);
        this.d.setColor(i11);
        this.e.setColor(i11);
        this.f23896a.setColor(i11);
        this.f23900g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f23908p == i10 && (i12 = this.f23909q) != i10) {
            this.f23908p = i12;
            this.f23910r = 1.0f;
        }
        if (z10) {
            int i13 = this.f23908p;
            if (i13 != i10 && (i11 = this.f23909q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f23903k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f23903k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f23903k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f23903k = 160.0f;
                } else {
                    this.f23903k = 220.0f;
                }
                if (this.f23913u) {
                    this.f23908p = i11;
                }
                this.f23913u = true;
                this.f23909q = i10;
                this.f23911s = this.f23910r;
                this.f23910r = 0.0f;
            } else {
                return;
            }
        } else if (this.f23908p == i10) {
            return;
        } else {
            this.f23913u = false;
            this.f23909q = i10;
            this.f23908p = i10;
            this.f23911s = this.f23910r;
            this.f23910r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f23915x = 0.0f;
            this.f23916y = 0.0f;
            this.f23917z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ea0.draw(android.graphics.Canvas):void");
    }

    public final void e(float f7, boolean z10) {
        if (this.f23914w == f7) {
            return;
        }
        if (!z10) {
            this.f23915x = f7;
            this.f23916y = f7;
        } else {
            if (this.f23915x > f7) {
                this.f23915x = f7;
            }
            this.f23916y = this.f23915x;
        }
        this.f23914w = f7;
        this.f23917z = 0.0f;
        invalidateSelf();
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public final int getMinimumHeight() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public final int getMinimumWidth() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        nv nvVar = this.A;
        if (nvVar != null) {
            ((View) nvVar.f26880b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f23897b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f23897b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
        this.f23896a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
