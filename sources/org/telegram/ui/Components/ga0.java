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
    public final TextPaint f26762a;
    public final Paint f26763b;
    public final Paint f26764c;
    public final Paint d;
    public final Paint f26765e;
    public final RectF f26766f;
    public PorterDuffColorFilter f26767g;
    public float h;
    public final DecelerateInterpolator f26768i;
    public boolean f26769j;
    public float f26770k;
    public int f26771l;
    public String f26772m;
    public int f26773n;
    public float f26774o;
    public int f26775p;
    public int f26776q;
    public float f26777r;
    public float f26778s;
    public long f26779t;
    public boolean f26780u;
    public float v;
    public float f26781w;
    public float f26782x;
    public float f26783y;
    public float f26784z;

    public ga0() {
        TextPaint textPaint = new TextPaint(1);
        this.f26762a = textPaint;
        Paint paint = new Paint(1);
        this.f26763b = paint;
        this.f26764c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f26765e = paint3;
        this.f26766f = new RectF();
        this.h = 1.0f;
        this.f26768i = new DecelerateInterpolator();
        this.f26770k = 400.0f;
        this.f26771l = -1;
        this.f26774o = 1.0f;
        this.f26777r = 1.0f;
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
            Shader shader = e5Var2.f20551a;
            Matrix matrix = e5Var2.f20559k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f20566r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f20566r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f26780u) {
            return this.f26777r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f26763b.setColor(i11);
        this.d.setColor(i11);
        this.f26765e.setColor(i11);
        this.f26762a.setColor(i11);
        this.f26767g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f26775p == i10 && (i12 = this.f26776q) != i10) {
            this.f26775p = i12;
            this.f26777r = 1.0f;
        }
        if (z10) {
            int i13 = this.f26775p;
            if (i13 != i10 && (i11 = this.f26776q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f26770k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f26770k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f26770k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f26770k = 160.0f;
                } else {
                    this.f26770k = 220.0f;
                }
                if (this.f26780u) {
                    this.f26775p = i11;
                }
                this.f26780u = true;
                this.f26776q = i10;
                this.f26778s = this.f26777r;
                this.f26777r = 0.0f;
            } else {
                return;
            }
        } else if (this.f26775p == i10) {
            return;
        } else {
            this.f26780u = false;
            this.f26776q = i10;
            this.f26775p = i10;
            this.f26778s = this.f26777r;
            this.f26777r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f26782x = 0.0f;
            this.f26783y = 0.0f;
            this.f26784z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ga0.draw(android.graphics.Canvas):void");
    }

    public final void e(float f7, boolean z10) {
        if (this.f26781w == f7) {
            return;
        }
        if (!z10) {
            this.f26782x = f7;
            this.f26783y = f7;
        } else {
            if (this.f26782x > f7) {
                this.f26782x = f7;
            }
            this.f26783y = this.f26782x;
        }
        this.f26781w = f7;
        this.f26784z = 0.0f;
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
            ((View) pvVar.f29746b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f26763b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f26763b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.f26765e.setColorFilter(colorFilter);
        this.f26762a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
