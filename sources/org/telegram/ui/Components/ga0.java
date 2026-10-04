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
public final class ga0 extends Drawable {
    public pv A;
    public org.telegram.ui.ActionBar.e5 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f26763a;
    public final Paint f26764b;
    public final Paint f26765c;
    public final Paint d;
    public final Paint f26766e;
    public final RectF f26767f;
    public PorterDuffColorFilter f26768g;
    public float h;
    public final DecelerateInterpolator f26769i;
    public boolean f26770j;
    public float f26771k;
    public int f26772l;
    public String f26773m;
    public int f26774n;
    public float f26775o;
    public int f26776p;
    public int f26777q;
    public float f26778r;
    public float f26779s;
    public long f26780t;
    public boolean f26781u;
    public float v;
    public float f26782w;
    public float f26783x;
    public float f26784y;
    public float f26785z;

    public ga0() {
        TextPaint textPaint = new TextPaint(1);
        this.f26763a = textPaint;
        Paint paint = new Paint(1);
        this.f26764b = paint;
        this.f26765c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f26766e = paint3;
        this.f26767f = new RectF();
        this.h = 1.0f;
        this.f26769i = new DecelerateInterpolator();
        this.f26771k = 400.0f;
        this.f26772l = -1;
        this.f26775o = 1.0f;
        this.f26778r = 1.0f;
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
        org.telegram.ui.ActionBar.e5 e5Var = this.B;
        if (e5Var != null && e5Var.l() && !this.E) {
            Rect bounds = getBounds();
            org.telegram.ui.ActionBar.e5 e5Var2 = this.B;
            Shader shader = e5Var2.f20552a;
            Matrix matrix = e5Var2.f20560k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f20567r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f20567r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f26781u) {
            return this.f26778r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f26764b.setColor(i11);
        this.d.setColor(i11);
        this.f26766e.setColor(i11);
        this.f26763a.setColor(i11);
        this.f26768g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f26776p == i10 && (i12 = this.f26777q) != i10) {
            this.f26776p = i12;
            this.f26778r = 1.0f;
        }
        if (z10) {
            int i13 = this.f26776p;
            if (i13 != i10 && (i11 = this.f26777q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f26771k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f26771k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f26771k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f26771k = 160.0f;
                } else {
                    this.f26771k = 220.0f;
                }
                if (this.f26781u) {
                    this.f26776p = i11;
                }
                this.f26781u = true;
                this.f26777q = i10;
                this.f26779s = this.f26778r;
                this.f26778r = 0.0f;
            } else {
                return;
            }
        } else if (this.f26776p == i10) {
            return;
        } else {
            this.f26781u = false;
            this.f26777q = i10;
            this.f26776p = i10;
            this.f26779s = this.f26778r;
            this.f26778r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f26783x = 0.0f;
            this.f26784y = 0.0f;
            this.f26785z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ga0.draw(android.graphics.Canvas):void");
    }

    public final void e(float f7, boolean z10) {
        if (this.f26782w == f7) {
            return;
        }
        if (!z10) {
            this.f26783x = f7;
            this.f26784y = f7;
        } else {
            if (this.f26783x > f7) {
                this.f26783x = f7;
            }
            this.f26784y = this.f26783x;
        }
        this.f26782w = f7;
        this.f26785z = 0.0f;
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
        pv pvVar = this.A;
        if (pvVar != null) {
            ((View) pvVar.f29747b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f26764b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f26764b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.f26766e.setColorFilter(colorFilter);
        this.f26763a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
