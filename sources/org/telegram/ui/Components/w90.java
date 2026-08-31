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
public final class w90 extends Drawable {
    public hv A;
    public org.telegram.ui.ActionBar.h5 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f32687a;
    public final Paint f32688b;
    public final Paint f32689c;
    public final Paint d;
    public final Paint f32690e;
    public final RectF f32691f;
    public PorterDuffColorFilter f32692g;
    public float h;
    public final DecelerateInterpolator f32693i;
    public boolean f32694j;
    public float f32695k;
    public int f32696l;
    public String f32697m;
    public int f32698n;
    public float f32699o;
    public int f32700p;
    public int f32701q;
    public float f32702r;
    public float f32703s;
    public long f32704t;
    public boolean f32705u;
    public float v;
    public float f32706w;
    public float f32707x;
    public float f32708y;
    public float f32709z;

    public w90() {
        TextPaint textPaint = new TextPaint(1);
        this.f32687a = textPaint;
        Paint paint = new Paint(1);
        this.f32688b = paint;
        this.f32689c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f32690e = paint3;
        this.f32691f = new RectF();
        this.h = 1.0f;
        this.f32693i = new DecelerateInterpolator();
        this.f32695k = 400.0f;
        this.f32696l = -1;
        this.f32699o = 1.0f;
        this.f32702r = 1.0f;
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

    public final void a(boolean z4) {
        org.telegram.ui.ActionBar.h5 h5Var = this.B;
        if (h5Var != null && h5Var.l() && !this.E) {
            Rect bounds = getBounds();
            org.telegram.ui.ActionBar.h5 h5Var2 = this.B;
            Shader shader = h5Var2.f21419a;
            Matrix matrix = h5Var2.f21427k;
            matrix.reset();
            this.B.a();
            if (z4) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f21434r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f21434r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f32705u) {
            return this.f32702r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f32688b.setColor(i11);
        this.d.setColor(i11);
        this.f32690e.setColor(i11);
        this.f32687a.setColor(i11);
        this.f32692g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z4) {
        int i11;
        int i12;
        if (this.f32700p == i10 && (i12 = this.f32701q) != i10) {
            this.f32700p = i12;
            this.f32702r = 1.0f;
        }
        if (z4) {
            int i13 = this.f32700p;
            if (i13 != i10 && (i11 = this.f32701q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f32695k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f32695k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f32695k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f32695k = 160.0f;
                } else {
                    this.f32695k = 220.0f;
                }
                if (this.f32705u) {
                    this.f32700p = i11;
                }
                this.f32705u = true;
                this.f32701q = i10;
                this.f32703s = this.f32702r;
                this.f32702r = 0.0f;
            } else {
                return;
            }
        } else if (this.f32700p == i10) {
            return;
        } else {
            this.f32705u = false;
            this.f32701q = i10;
            this.f32700p = i10;
            this.f32703s = this.f32702r;
            this.f32702r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f32707x = 0.0f;
            this.f32708y = 0.0f;
            this.f32709z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w90.draw(android.graphics.Canvas):void");
    }

    public final void e(float f10, boolean z4) {
        if (this.f32706w == f10) {
            return;
        }
        if (!z4) {
            this.f32707x = f10;
            this.f32708y = f10;
        } else {
            if (this.f32707x > f10) {
                this.f32707x = f10;
            }
            this.f32708y = this.f32707x;
        }
        this.f32706w = f10;
        this.f32709z = 0.0f;
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
        hv hvVar = this.A;
        if (hvVar != null) {
            ((View) hvVar.f27591b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f32688b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f32688b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.f32690e.setColorFilter(colorFilter);
        this.f32687a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
