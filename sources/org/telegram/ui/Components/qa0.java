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
public final class qa0 extends Drawable {
    public tv A;
    public org.telegram.ui.ActionBar.l5 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f31826a;
    public final Paint f31827b;
    public final Paint f31828c;
    public final Paint d;
    public final Paint e;
    public final RectF f31829f;
    public PorterDuffColorFilter f31830g;
    public float h;
    public final DecelerateInterpolator f31831i;
    public boolean f31832j;
    public float f31833k;
    public int f31834l;
    public String f31835m;
    public int f31836n;
    public float f31837o;
    public int f31838p;
    public int f31839q;
    public float f31840r;
    public float f31841s;
    public long f31842t;
    public boolean f31843u;
    public float v;
    public float f31844w;
    public float f31845x;
    public float f31846y;
    public float f31847z;

    public qa0() {
        TextPaint textPaint = new TextPaint(1);
        this.f31826a = textPaint;
        Paint paint = new Paint(1);
        this.f31827b = paint;
        this.f31828c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f31829f = new RectF();
        this.h = 1.0f;
        this.f31831i = new DecelerateInterpolator();
        this.f31833k = 400.0f;
        this.f31834l = -1;
        this.f31837o = 1.0f;
        this.f31840r = 1.0f;
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
            Shader shader = l5Var2.f22833a;
            Matrix matrix = l5Var2.f22840k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f22847r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f22847r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f31843u) {
            return this.f31840r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f31827b.setColor(i11);
        this.d.setColor(i11);
        this.e.setColor(i11);
        this.f31826a.setColor(i11);
        this.f31830g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f31838p == i10 && (i12 = this.f31839q) != i10) {
            this.f31838p = i12;
            this.f31840r = 1.0f;
        }
        if (z10) {
            int i13 = this.f31838p;
            if (i13 != i10 && (i11 = this.f31839q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f31833k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f31833k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f31833k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f31833k = 160.0f;
                } else {
                    this.f31833k = 220.0f;
                }
                if (this.f31843u) {
                    this.f31838p = i11;
                }
                this.f31843u = true;
                this.f31839q = i10;
                this.f31841s = this.f31840r;
                this.f31840r = 0.0f;
            } else {
                return;
            }
        } else if (this.f31838p == i10) {
            return;
        } else {
            this.f31843u = false;
            this.f31839q = i10;
            this.f31838p = i10;
            this.f31841s = this.f31840r;
            this.f31840r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f31845x = 0.0f;
            this.f31846y = 0.0f;
            this.f31847z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qa0.draw(android.graphics.Canvas):void");
    }

    public final void e(float f7, boolean z10) {
        if (this.f31844w == f7) {
            return;
        }
        if (!z10) {
            this.f31845x = f7;
            this.f31846y = f7;
        } else {
            if (this.f31845x > f7) {
                this.f31845x = f7;
            }
            this.f31846y = this.f31845x;
        }
        this.f31844w = f7;
        this.f31847z = 0.0f;
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
            ((View) tvVar.f33156b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f31827b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f31827b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
        this.f31826a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
