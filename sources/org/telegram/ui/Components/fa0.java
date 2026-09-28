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
public final class fa0 extends Drawable {
    public nv A;
    public org.telegram.ui.ActionBar.d5 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f24184a;
    public final Paint f24185b;
    public final Paint f24186c;
    public final Paint d;
    public final Paint e;
    public final RectF f24187f;
    public PorterDuffColorFilter f24188g;
    public float h;
    public final DecelerateInterpolator f24189i;
    public boolean f24190j;
    public float f24191k;
    public int f24192l;
    public String f24193m;
    public int f24194n;
    public float f24195o;
    public int f24196p;
    public int f24197q;
    public float f24198r;
    public float f24199s;
    public long f24200t;
    public boolean f24201u;
    public float v;
    public float f24202w;
    public float f24203x;
    public float f24204y;
    public float f24205z;

    public fa0() {
        TextPaint textPaint = new TextPaint(1);
        this.f24184a = textPaint;
        Paint paint = new Paint(1);
        this.f24185b = paint;
        this.f24186c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f24187f = new RectF();
        this.h = 1.0f;
        this.f24189i = new DecelerateInterpolator();
        this.f24191k = 400.0f;
        this.f24192l = -1;
        this.f24195o = 1.0f;
        this.f24198r = 1.0f;
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
        if (this.f24201u) {
            return this.f24198r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f24185b.setColor(i11);
        this.d.setColor(i11);
        this.e.setColor(i11);
        this.f24184a.setColor(i11);
        this.f24188g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f24196p == i10 && (i12 = this.f24197q) != i10) {
            this.f24196p = i12;
            this.f24198r = 1.0f;
        }
        if (z10) {
            int i13 = this.f24196p;
            if (i13 != i10 && (i11 = this.f24197q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f24191k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f24191k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f24191k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f24191k = 160.0f;
                } else {
                    this.f24191k = 220.0f;
                }
                if (this.f24201u) {
                    this.f24196p = i11;
                }
                this.f24201u = true;
                this.f24197q = i10;
                this.f24199s = this.f24198r;
                this.f24198r = 0.0f;
            } else {
                return;
            }
        } else if (this.f24196p == i10) {
            return;
        } else {
            this.f24201u = false;
            this.f24197q = i10;
            this.f24196p = i10;
            this.f24199s = this.f24198r;
            this.f24198r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f24203x = 0.0f;
            this.f24204y = 0.0f;
            this.f24205z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fa0.draw(android.graphics.Canvas):void");
    }

    public final void e(float f7, boolean z10) {
        if (this.f24202w == f7) {
            return;
        }
        if (!z10) {
            this.f24203x = f7;
            this.f24204y = f7;
        } else {
            if (this.f24203x > f7) {
                this.f24203x = f7;
            }
            this.f24204y = this.f24203x;
        }
        this.f24202w = f7;
        this.f24205z = 0.0f;
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
            ((View) nvVar.f26863b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f24185b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f24185b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
        this.f24184a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
