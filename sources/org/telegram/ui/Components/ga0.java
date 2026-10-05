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
    public final TextPaint f26817a;
    public final Paint f26818b;
    public final Paint f26819c;
    public final Paint d;
    public final Paint f26820e;
    public final RectF f26821f;
    public PorterDuffColorFilter f26822g;
    public float h;
    public final DecelerateInterpolator f26823i;
    public boolean f26824j;
    public float f26825k;
    public int f26826l;
    public String f26827m;
    public int f26828n;
    public float f26829o;
    public int f26830p;
    public int f26831q;
    public float f26832r;
    public float f26833s;
    public long f26834t;
    public boolean f26835u;
    public float v;
    public float f26836w;
    public float f26837x;
    public float f26838y;
    public float f26839z;

    public ga0() {
        TextPaint textPaint = new TextPaint(1);
        this.f26817a = textPaint;
        Paint paint = new Paint(1);
        this.f26818b = paint;
        this.f26819c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f26820e = paint3;
        this.f26821f = new RectF();
        this.h = 1.0f;
        this.f26823i = new DecelerateInterpolator();
        this.f26825k = 400.0f;
        this.f26826l = -1;
        this.f26829o = 1.0f;
        this.f26832r = 1.0f;
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
            Shader shader = e5Var2.f20561a;
            Matrix matrix = e5Var2.f20569k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f20576r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f20576r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f26835u) {
            return this.f26832r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f26818b.setColor(i11);
        this.d.setColor(i11);
        this.f26820e.setColor(i11);
        this.f26817a.setColor(i11);
        this.f26822g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f26830p == i10 && (i12 = this.f26831q) != i10) {
            this.f26830p = i12;
            this.f26832r = 1.0f;
        }
        if (z10) {
            int i13 = this.f26830p;
            if (i13 != i10 && (i11 = this.f26831q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f26825k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f26825k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f26825k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f26825k = 160.0f;
                } else {
                    this.f26825k = 220.0f;
                }
                if (this.f26835u) {
                    this.f26830p = i11;
                }
                this.f26835u = true;
                this.f26831q = i10;
                this.f26833s = this.f26832r;
                this.f26832r = 0.0f;
            } else {
                return;
            }
        } else if (this.f26830p == i10) {
            return;
        } else {
            this.f26835u = false;
            this.f26831q = i10;
            this.f26830p = i10;
            this.f26833s = this.f26832r;
            this.f26832r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f26837x = 0.0f;
            this.f26838y = 0.0f;
            this.f26839z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ga0.draw(android.graphics.Canvas):void");
    }

    public final void e(float f7, boolean z10) {
        if (this.f26836w == f7) {
            return;
        }
        if (!z10) {
            this.f26837x = f7;
            this.f26838y = f7;
        } else {
            if (this.f26837x > f7) {
                this.f26837x = f7;
            }
            this.f26838y = this.f26837x;
        }
        this.f26836w = f7;
        this.f26839z = 0.0f;
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
            ((View) pvVar.f29849b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f26818b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f26818b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.f26820e.setColorFilter(colorFilter);
        this.f26817a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
