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
public final class ba0 extends Drawable {
    public lv A;
    public org.telegram.ui.ActionBar.f5 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f22918a;
    public final Paint f22919b;
    public final Paint f22920c;
    public final Paint d;
    public final Paint e;
    public final RectF f22921f;
    public PorterDuffColorFilter f22922g;
    public float h;
    public final DecelerateInterpolator f22923i;
    public boolean f22924j;
    public float f22925k;
    public int f22926l;
    public String f22927m;
    public int f22928n;
    public float f22929o;
    public int f22930p;
    public int f22931q;
    public float f22932r;
    public float f22933s;
    public long f22934t;
    public boolean f22935u;
    public float v;
    public float f22936w;
    public float f22937x;
    public float f22938y;
    public float f22939z;

    public ba0() {
        TextPaint textPaint = new TextPaint(1);
        this.f22918a = textPaint;
        Paint paint = new Paint(1);
        this.f22919b = paint;
        this.f22920c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f22921f = new RectF();
        this.h = 1.0f;
        this.f22923i = new DecelerateInterpolator();
        this.f22925k = 400.0f;
        this.f22926l = -1;
        this.f22929o = 1.0f;
        this.f22932r = 1.0f;
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
            Shader shader = f5Var2.f18830a;
            Matrix matrix = f5Var2.f18837k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f18844r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f18844r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f22935u) {
            return this.f22932r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f22919b.setColor(i11);
        this.d.setColor(i11);
        this.e.setColor(i11);
        this.f22918a.setColor(i11);
        this.f22922g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f22930p == i10 && (i12 = this.f22931q) != i10) {
            this.f22930p = i12;
            this.f22932r = 1.0f;
        }
        if (z10) {
            int i13 = this.f22930p;
            if (i13 != i10 && (i11 = this.f22931q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f22925k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f22925k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f22925k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f22925k = 160.0f;
                } else {
                    this.f22925k = 220.0f;
                }
                if (this.f22935u) {
                    this.f22930p = i11;
                }
                this.f22935u = true;
                this.f22931q = i10;
                this.f22933s = this.f22932r;
                this.f22932r = 0.0f;
            } else {
                return;
            }
        } else if (this.f22930p == i10) {
            return;
        } else {
            this.f22935u = false;
            this.f22931q = i10;
            this.f22930p = i10;
            this.f22933s = this.f22932r;
            this.f22932r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f22937x = 0.0f;
            this.f22938y = 0.0f;
            this.f22939z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ba0.draw(android.graphics.Canvas):void");
    }

    public final void e(float f7, boolean z10) {
        if (this.f22936w == f7) {
            return;
        }
        if (!z10) {
            this.f22937x = f7;
            this.f22938y = f7;
        } else {
            if (this.f22937x > f7) {
                this.f22937x = f7;
            }
            this.f22938y = this.f22937x;
        }
        this.f22936w = f7;
        this.f22939z = 0.0f;
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
            ((View) lvVar.f26250b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f22919b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f22919b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
        this.f22918a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
