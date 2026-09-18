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
    public org.telegram.ui.ActionBar.g5 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f27808a;
    public final Paint f27809b;
    public final Paint f27810c;
    public final Paint d;
    public final Paint e;
    public final RectF f27811f;
    public PorterDuffColorFilter f27812g;
    public float h;
    public final DecelerateInterpolator f27813i;
    public boolean f27814j;
    public float f27815k;
    public int f27816l;
    public String f27817m;
    public int f27818n;
    public float f27819o;
    public int f27820p;
    public int f27821q;
    public float f27822r;
    public float f27823s;
    public long f27824t;
    public boolean f27825u;
    public float v;
    public float f27826w;
    public float f27827x;
    public float f27828y;
    public float f27829z;

    public s90() {
        TextPaint textPaint = new TextPaint(1);
        this.f27808a = textPaint;
        Paint paint = new Paint(1);
        this.f27809b = paint;
        this.f27810c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f27811f = new RectF();
        this.h = 1.0f;
        this.f27813i = new DecelerateInterpolator();
        this.f27815k = 400.0f;
        this.f27816l = -1;
        this.f27819o = 1.0f;
        this.f27822r = 1.0f;
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
        org.telegram.ui.ActionBar.g5 g5Var = this.B;
        if (g5Var != null && g5Var.l() && !this.E) {
            Rect bounds = getBounds();
            org.telegram.ui.ActionBar.g5 g5Var2 = this.B;
            Shader shader = g5Var2.f18675a;
            Matrix matrix = g5Var2.f18682k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f18689r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f18689r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f27825u) {
            return this.f27822r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f27809b.setColor(i11);
        this.d.setColor(i11);
        this.e.setColor(i11);
        this.f27808a.setColor(i11);
        this.f27812g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f27820p == i10 && (i12 = this.f27821q) != i10) {
            this.f27820p = i12;
            this.f27822r = 1.0f;
        }
        if (z10) {
            int i13 = this.f27820p;
            if (i13 != i10 && (i11 = this.f27821q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f27815k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f27815k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f27815k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f27815k = 160.0f;
                } else {
                    this.f27815k = 220.0f;
                }
                if (this.f27825u) {
                    this.f27820p = i11;
                }
                this.f27825u = true;
                this.f27821q = i10;
                this.f27823s = this.f27822r;
                this.f27822r = 0.0f;
            } else {
                return;
            }
        } else if (this.f27820p == i10) {
            return;
        } else {
            this.f27825u = false;
            this.f27821q = i10;
            this.f27820p = i10;
            this.f27823s = this.f27822r;
            this.f27822r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f27827x = 0.0f;
            this.f27828y = 0.0f;
            this.f27829z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s90.draw(android.graphics.Canvas):void");
    }

    public final void e(float f7, boolean z10) {
        if (this.f27826w == f7) {
            return;
        }
        if (!z10) {
            this.f27827x = f7;
            this.f27828y = f7;
        } else {
            if (this.f27827x > f7) {
                this.f27827x = f7;
            }
            this.f27828y = this.f27827x;
        }
        this.f27826w = f7;
        this.f27829z = 0.0f;
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
            ((View) lvVar.f25979b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f27809b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27809b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
        this.f27808a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
