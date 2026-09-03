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
    public final TextPaint f32692a;
    public final Paint f32693b;
    public final Paint f32694c;
    public final Paint d;
    public final Paint f32695e;
    public final RectF f32696f;
    public PorterDuffColorFilter f32697g;
    public float h;
    public final DecelerateInterpolator f32698i;
    public boolean f32699j;
    public float f32700k;
    public int f32701l;
    public String f32702m;
    public int f32703n;
    public float f32704o;
    public int f32705p;
    public int f32706q;
    public float f32707r;
    public float f32708s;
    public long f32709t;
    public boolean f32710u;
    public float v;
    public float f32711w;
    public float f32712x;
    public float f32713y;
    public float f32714z;

    public w90() {
        TextPaint textPaint = new TextPaint(1);
        this.f32692a = textPaint;
        Paint paint = new Paint(1);
        this.f32693b = paint;
        this.f32694c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f32695e = paint3;
        this.f32696f = new RectF();
        this.h = 1.0f;
        this.f32698i = new DecelerateInterpolator();
        this.f32700k = 400.0f;
        this.f32701l = -1;
        this.f32704o = 1.0f;
        this.f32707r = 1.0f;
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
            Shader shader = h5Var2.f21421a;
            Matrix matrix = h5Var2.f21429k;
            matrix.reset();
            this.B.a();
            if (z4) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f21436r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f21436r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f32710u) {
            return this.f32707r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f32693b.setColor(i11);
        this.d.setColor(i11);
        this.f32695e.setColor(i11);
        this.f32692a.setColor(i11);
        this.f32697g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z4) {
        int i11;
        int i12;
        if (this.f32705p == i10 && (i12 = this.f32706q) != i10) {
            this.f32705p = i12;
            this.f32707r = 1.0f;
        }
        if (z4) {
            int i13 = this.f32705p;
            if (i13 != i10 && (i11 = this.f32706q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f32700k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f32700k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f32700k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f32700k = 160.0f;
                } else {
                    this.f32700k = 220.0f;
                }
                if (this.f32710u) {
                    this.f32705p = i11;
                }
                this.f32710u = true;
                this.f32706q = i10;
                this.f32708s = this.f32707r;
                this.f32707r = 0.0f;
            } else {
                return;
            }
        } else if (this.f32705p == i10) {
            return;
        } else {
            this.f32710u = false;
            this.f32706q = i10;
            this.f32705p = i10;
            this.f32708s = this.f32707r;
            this.f32707r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f32712x = 0.0f;
            this.f32713y = 0.0f;
            this.f32714z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w90.draw(android.graphics.Canvas):void");
    }

    public final void e(float f10, boolean z4) {
        if (this.f32711w == f10) {
            return;
        }
        if (!z4) {
            this.f32712x = f10;
            this.f32713y = f10;
        } else {
            if (this.f32712x > f10) {
                this.f32712x = f10;
            }
            this.f32713y = this.f32712x;
        }
        this.f32711w = f10;
        this.f32714z = 0.0f;
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
            ((View) hvVar.f27638b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f32693b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f32693b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.f32695e.setColorFilter(colorFilter);
        this.f32692a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
