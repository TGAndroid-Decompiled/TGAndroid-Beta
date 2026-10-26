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
public final class pa0 extends Drawable {
    public tv A;
    public org.telegram.ui.ActionBar.l5 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f31494a;
    public final Paint f31495b;
    public final Paint f31496c;
    public final Paint d;
    public final Paint e;
    public final RectF f31497f;
    public PorterDuffColorFilter f31498g;
    public float h;
    public final DecelerateInterpolator f31499i;
    public boolean f31500j;
    public float f31501k;
    public int f31502l;
    public String f31503m;
    public int f31504n;
    public float f31505o;
    public int f31506p;
    public int f31507q;
    public float f31508r;
    public float f31509s;
    public long f31510t;
    public boolean f31511u;
    public float v;
    public float f31512w;
    public float f31513x;
    public float f31514y;
    public float f31515z;

    public pa0() {
        TextPaint textPaint = new TextPaint(1);
        this.f31494a = textPaint;
        Paint paint = new Paint(1);
        this.f31495b = paint;
        this.f31496c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f31497f = new RectF();
        this.h = 1.0f;
        this.f31499i = new DecelerateInterpolator();
        this.f31501k = 400.0f;
        this.f31502l = -1;
        this.f31505o = 1.0f;
        this.f31508r = 1.0f;
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
        org.telegram.ui.ActionBar.l5 l5Var = this.B;
        if (l5Var != null && l5Var.k() && !this.E) {
            Rect bounds = getBounds();
            org.telegram.ui.ActionBar.l5 l5Var2 = this.B;
            Shader shader = l5Var2.f22832a;
            Matrix matrix = l5Var2.f22839k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f22846r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f22846r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f31511u) {
            return this.f31508r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f31495b.setColor(i11);
        this.d.setColor(i11);
        this.e.setColor(i11);
        this.f31494a.setColor(i11);
        this.f31498g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f31506p == i10 && (i12 = this.f31507q) != i10) {
            this.f31506p = i12;
            this.f31508r = 1.0f;
        }
        if (z10) {
            int i13 = this.f31506p;
            if (i13 != i10 && (i11 = this.f31507q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f31501k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f31501k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f31501k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f31501k = 160.0f;
                } else {
                    this.f31501k = 220.0f;
                }
                if (this.f31511u) {
                    this.f31506p = i11;
                }
                this.f31511u = true;
                this.f31507q = i10;
                this.f31509s = this.f31508r;
                this.f31508r = 0.0f;
            } else {
                return;
            }
        } else if (this.f31506p == i10) {
            return;
        } else {
            this.f31511u = false;
            this.f31507q = i10;
            this.f31506p = i10;
            this.f31509s = this.f31508r;
            this.f31508r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f31513x = 0.0f;
            this.f31514y = 0.0f;
            this.f31515z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pa0.draw(android.graphics.Canvas):void");
    }

    public final void e(float f7, boolean z10) {
        if (this.f31512w == f7) {
            return;
        }
        if (!z10) {
            this.f31513x = f7;
            this.f31514y = f7;
        } else {
            if (this.f31513x > f7) {
                this.f31513x = f7;
            }
            this.f31514y = this.f31513x;
        }
        this.f31512w = f7;
        this.f31515z = 0.0f;
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
        tv tvVar = this.A;
        if (tvVar != null) {
            ((View) tvVar.f33167b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f31495b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f31495b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
        this.f31494a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
