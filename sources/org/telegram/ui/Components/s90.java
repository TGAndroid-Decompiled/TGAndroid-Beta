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
    public final TextPaint f27805a;
    public final Paint f27806b;
    public final Paint f27807c;
    public final Paint d;
    public final Paint e;
    public final RectF f27808f;
    public PorterDuffColorFilter f27809g;
    public float h;
    public final DecelerateInterpolator f27810i;
    public boolean f27811j;
    public float f27812k;
    public int f27813l;
    public String f27814m;
    public int f27815n;
    public float f27816o;
    public int f27817p;
    public int f27818q;
    public float f27819r;
    public float f27820s;
    public long f27821t;
    public boolean f27822u;
    public float v;
    public float f27823w;
    public float f27824x;
    public float f27825y;
    public float f27826z;

    public s90() {
        TextPaint textPaint = new TextPaint(1);
        this.f27805a = textPaint;
        Paint paint = new Paint(1);
        this.f27806b = paint;
        this.f27807c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f27808f = new RectF();
        this.h = 1.0f;
        this.f27810i = new DecelerateInterpolator();
        this.f27812k = 400.0f;
        this.f27813l = -1;
        this.f27816o = 1.0f;
        this.f27819r = 1.0f;
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
            Shader shader = g5Var2.f18674a;
            Matrix matrix = g5Var2.f18681k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f18688r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f18688r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f27822u) {
            return this.f27819r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f27806b.setColor(i11);
        this.d.setColor(i11);
        this.e.setColor(i11);
        this.f27805a.setColor(i11);
        this.f27809g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f27817p == i10 && (i12 = this.f27818q) != i10) {
            this.f27817p = i12;
            this.f27819r = 1.0f;
        }
        if (z10) {
            int i13 = this.f27817p;
            if (i13 != i10 && (i11 = this.f27818q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f27812k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f27812k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f27812k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f27812k = 160.0f;
                } else {
                    this.f27812k = 220.0f;
                }
                if (this.f27822u) {
                    this.f27817p = i11;
                }
                this.f27822u = true;
                this.f27818q = i10;
                this.f27820s = this.f27819r;
                this.f27819r = 0.0f;
            } else {
                return;
            }
        } else if (this.f27817p == i10) {
            return;
        } else {
            this.f27822u = false;
            this.f27818q = i10;
            this.f27817p = i10;
            this.f27820s = this.f27819r;
            this.f27819r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f27824x = 0.0f;
            this.f27825y = 0.0f;
            this.f27826z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s90.draw(android.graphics.Canvas):void");
    }

    public final void e(float f7, boolean z10) {
        if (this.f27823w == f7) {
            return;
        }
        if (!z10) {
            this.f27824x = f7;
            this.f27825y = f7;
        } else {
            if (this.f27824x > f7) {
                this.f27824x = f7;
            }
            this.f27825y = this.f27824x;
        }
        this.f27823w = f7;
        this.f27826z = 0.0f;
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
            ((View) lvVar.f25976b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f27806b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27806b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
        this.f27805a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
