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
public final class ta0 extends Drawable {
    public xv A;
    public org.telegram.ui.ActionBar.d5 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f29323a;
    public final Paint f29324b;
    public final Paint f29325c;
    public final Paint d;
    public final Paint e;
    public final RectF f29326f;
    public PorterDuffColorFilter f29327g;
    public float h;
    public final DecelerateInterpolator f29328i;
    public boolean f29329j;
    public float f29330k;
    public int f29331l;
    public String f29332m;
    public int f29333n;
    public float f29334o;
    public int f29335p;
    public int f29336q;
    public float f29337r;
    public float f29338s;
    public long f29339t;
    public boolean f29340u;
    public float v;
    public float f29341w;
    public float f29342x;
    public float f29343y;
    public float f29344z;

    public ta0() {
        TextPaint textPaint = new TextPaint(1);
        this.f29323a = textPaint;
        Paint paint = new Paint(1);
        this.f29324b = paint;
        this.f29325c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f29326f = new RectF();
        this.h = 1.0f;
        this.f29328i = new DecelerateInterpolator();
        this.f29330k = 400.0f;
        this.f29331l = -1;
        this.f29334o = 1.0f;
        this.f29337r = 1.0f;
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
            Shader shader = d5Var2.f19691a;
            Matrix matrix = d5Var2.f19698k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f19705r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f19705r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f29340u) {
            return this.f29337r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f29324b.setColor(i11);
        this.d.setColor(i11);
        this.e.setColor(i11);
        this.f29323a.setColor(i11);
        this.f29327g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f29335p == i10 && (i12 = this.f29336q) != i10) {
            this.f29335p = i12;
            this.f29337r = 1.0f;
        }
        if (z10) {
            int i13 = this.f29335p;
            if (i13 != i10 && (i11 = this.f29336q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f29330k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f29330k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f29330k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f29330k = 160.0f;
                } else {
                    this.f29330k = 220.0f;
                }
                if (this.f29340u) {
                    this.f29335p = i11;
                }
                this.f29340u = true;
                this.f29336q = i10;
                this.f29338s = this.f29337r;
                this.f29337r = 0.0f;
            } else {
                return;
            }
        } else if (this.f29335p == i10) {
            return;
        } else {
            this.f29340u = false;
            this.f29336q = i10;
            this.f29335p = i10;
            this.f29338s = this.f29337r;
            this.f29337r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f29342x = 0.0f;
            this.f29343y = 0.0f;
            this.f29344z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ta0.draw(android.graphics.Canvas):void");
    }

    public final void e(float f7, boolean z10) {
        if (this.f29341w == f7) {
            return;
        }
        if (!z10) {
            this.f29342x = f7;
            this.f29343y = f7;
        } else {
            if (this.f29342x > f7) {
                this.f29342x = f7;
            }
            this.f29343y = this.f29342x;
        }
        this.f29341w = f7;
        this.f29344z = 0.0f;
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
        xv xvVar = this.A;
        if (xvVar != null) {
            ((View) xvVar.f31335b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f29324b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29324b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
        this.f29323a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
