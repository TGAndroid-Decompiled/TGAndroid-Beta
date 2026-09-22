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
public final class s90 extends Drawable {
    public lv A;
    public org.telegram.ui.ActionBar.f5 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f27798a;
    public final Paint f27799b;
    public final Paint f27800c;
    public final Paint d;
    public final Paint e;
    public final RectF f27801f;
    public PorterDuffColorFilter f27802g;
    public float h;
    public final DecelerateInterpolator f27803i;
    public boolean f27804j;
    public float f27805k;
    public int f27806l;
    public String f27807m;
    public int f27808n;
    public float f27809o;
    public int f27810p;
    public int f27811q;
    public float f27812r;
    public float f27813s;
    public long f27814t;
    public boolean f27815u;
    public float v;
    public float f27816w;
    public float f27817x;
    public float f27818y;
    public float f27819z;

    public s90() {
        TextPaint textPaint = new TextPaint(1);
        this.f27798a = textPaint;
        Paint paint = new Paint(1);
        this.f27799b = paint;
        this.f27800c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f27801f = new RectF();
        this.h = 1.0f;
        this.f27803i = new DecelerateInterpolator();
        this.f27805k = 400.0f;
        this.f27806l = -1;
        this.f27809o = 1.0f;
        this.f27812r = 1.0f;
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
        org.telegram.ui.ActionBar.f5 f5Var = this.B;
        if (f5Var != null && f5Var.l() && !this.E) {
            Rect bounds = getBounds();
            org.telegram.ui.ActionBar.f5 f5Var2 = this.B;
            Shader shader = f5Var2.f18643a;
            Matrix matrix = f5Var2.f18650k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f18657r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f18657r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f27815u) {
            return this.f27812r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f27799b.setColor(i11);
        this.d.setColor(i11);
        this.e.setColor(i11);
        this.f27798a.setColor(i11);
        this.f27802g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f27810p == i10 && (i12 = this.f27811q) != i10) {
            this.f27810p = i12;
            this.f27812r = 1.0f;
        }
        if (z10) {
            int i13 = this.f27810p;
            if (i13 != i10 && (i11 = this.f27811q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f27805k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f27805k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f27805k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f27805k = 160.0f;
                } else {
                    this.f27805k = 220.0f;
                }
                if (this.f27815u) {
                    this.f27810p = i11;
                }
                this.f27815u = true;
                this.f27811q = i10;
                this.f27813s = this.f27812r;
                this.f27812r = 0.0f;
            } else {
                return;
            }
        } else if (this.f27810p == i10) {
            return;
        } else {
            this.f27815u = false;
            this.f27811q = i10;
            this.f27810p = i10;
            this.f27813s = this.f27812r;
            this.f27812r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f27817x = 0.0f;
            this.f27818y = 0.0f;
            this.f27819z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s90.draw(android.graphics.Canvas):void");
    }

    public final void e(float f7, boolean z10) {
        if (this.f27816w == f7) {
            return;
        }
        if (!z10) {
            this.f27817x = f7;
            this.f27818y = f7;
        } else {
            if (this.f27817x > f7) {
                this.f27817x = f7;
            }
            this.f27818y = this.f27817x;
        }
        this.f27816w = f7;
        this.f27819z = 0.0f;
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
        lv lvVar = this.A;
        if (lvVar != null) {
            ((View) lvVar.f26014b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f27799b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27799b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
        this.f27798a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
