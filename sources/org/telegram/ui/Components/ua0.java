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
public final class ua0 extends Drawable {
    public cw A;
    public org.telegram.ui.ActionBar.d5 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f31491a;
    public final Paint f31492b;
    public final Paint f31493c;
    public final Paint d;
    public final Paint f31494e;
    public final RectF f31495f;
    public PorterDuffColorFilter f31496g;
    public float h;
    public final DecelerateInterpolator f31497i;
    public boolean f31498j;
    public float f31499k;
    public int f31500l;
    public String f31501m;
    public int f31502n;
    public float f31503o;
    public int f31504p;
    public int f31505q;
    public float f31506r;
    public float f31507s;
    public long f31508t;
    public boolean f31509u;
    public float v;
    public float f31510w;
    public float f31511x;
    public float f31512y;
    public float f31513z;

    public ua0() {
        TextPaint textPaint = new TextPaint(1);
        this.f31491a = textPaint;
        Paint paint = new Paint(1);
        this.f31492b = paint;
        this.f31493c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f31494e = paint3;
        this.f31495f = new RectF();
        this.h = 1.0f;
        this.f31497i = new DecelerateInterpolator();
        this.f31499k = 400.0f;
        this.f31500l = -1;
        this.f31503o = 1.0f;
        this.f31506r = 1.0f;
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
            Shader shader = d5Var2.f20558a;
            Matrix matrix = d5Var2.f20566k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f20573r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f20573r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f31509u) {
            return this.f31506r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f31492b.setColor(i11);
        this.d.setColor(i11);
        this.f31494e.setColor(i11);
        this.f31491a.setColor(i11);
        this.f31496g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f31504p == i10 && (i12 = this.f31505q) != i10) {
            this.f31504p = i12;
            this.f31506r = 1.0f;
        }
        if (z10) {
            int i13 = this.f31504p;
            if (i13 != i10 && (i11 = this.f31505q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f31499k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f31499k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f31499k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f31499k = 160.0f;
                } else {
                    this.f31499k = 220.0f;
                }
                if (this.f31509u) {
                    this.f31504p = i11;
                }
                this.f31509u = true;
                this.f31505q = i10;
                this.f31507s = this.f31506r;
                this.f31506r = 0.0f;
            } else {
                return;
            }
        } else if (this.f31504p == i10) {
            return;
        } else {
            this.f31509u = false;
            this.f31505q = i10;
            this.f31504p = i10;
            this.f31507s = this.f31506r;
            this.f31506r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f31511x = 0.0f;
            this.f31512y = 0.0f;
            this.f31513z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ua0.draw(android.graphics.Canvas):void");
    }

    public final void e(float f7, boolean z10) {
        if (this.f31510w == f7) {
            return;
        }
        if (!z10) {
            this.f31511x = f7;
            this.f31512y = f7;
        } else {
            if (this.f31511x > f7) {
                this.f31511x = f7;
            }
            this.f31512y = this.f31511x;
        }
        this.f31510w = f7;
        this.f31513z = 0.0f;
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
        cw cwVar = this.A;
        if (cwVar != null) {
            ((View) cwVar.f25482b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f31492b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f31492b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.f31494e.setColorFilter(colorFilter);
        this.f31491a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
