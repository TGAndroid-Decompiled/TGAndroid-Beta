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
public final class va0 extends Drawable {
    public cw A;
    public org.telegram.ui.ActionBar.f5 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f31762a;
    public final Paint f31763b;
    public final Paint f31764c;
    public final Paint d;
    public final Paint f31765e;
    public final RectF f31766f;
    public PorterDuffColorFilter f31767g;
    public float h;
    public final DecelerateInterpolator f31768i;
    public boolean f31769j;
    public float f31770k;
    public int f31771l;
    public String f31772m;
    public int f31773n;
    public float f31774o;
    public int f31775p;
    public int f31776q;
    public float f31777r;
    public float f31778s;
    public long f31779t;
    public boolean f31780u;
    public float v;
    public float f31781w;
    public float f31782x;
    public float f31783y;
    public float f31784z;

    public va0() {
        TextPaint textPaint = new TextPaint(1);
        this.f31762a = textPaint;
        Paint paint = new Paint(1);
        this.f31763b = paint;
        this.f31764c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f31765e = paint3;
        this.f31766f = new RectF();
        this.h = 1.0f;
        this.f31768i = new DecelerateInterpolator();
        this.f31770k = 400.0f;
        this.f31771l = -1;
        this.f31774o = 1.0f;
        this.f31777r = 1.0f;
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
            Shader shader = f5Var2.f20603a;
            Matrix matrix = f5Var2.f20611k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f20618r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f20618r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f31780u) {
            return this.f31777r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f31763b.setColor(i11);
        this.d.setColor(i11);
        this.f31765e.setColor(i11);
        this.f31762a.setColor(i11);
        this.f31767g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f31775p == i10 && (i12 = this.f31776q) != i10) {
            this.f31775p = i12;
            this.f31777r = 1.0f;
        }
        if (z10) {
            int i13 = this.f31775p;
            if (i13 != i10 && (i11 = this.f31776q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f31770k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f31770k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f31770k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f31770k = 160.0f;
                } else {
                    this.f31770k = 220.0f;
                }
                if (this.f31780u) {
                    this.f31775p = i11;
                }
                this.f31780u = true;
                this.f31776q = i10;
                this.f31778s = this.f31777r;
                this.f31777r = 0.0f;
            } else {
                return;
            }
        } else if (this.f31775p == i10) {
            return;
        } else {
            this.f31780u = false;
            this.f31776q = i10;
            this.f31775p = i10;
            this.f31778s = this.f31777r;
            this.f31777r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f31782x = 0.0f;
            this.f31783y = 0.0f;
            this.f31784z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.va0.draw(android.graphics.Canvas):void");
    }

    public final void e(float f7, boolean z10) {
        if (this.f31781w == f7) {
            return;
        }
        if (!z10) {
            this.f31782x = f7;
            this.f31783y = f7;
        } else {
            if (this.f31782x > f7) {
                this.f31782x = f7;
            }
            this.f31783y = this.f31782x;
        }
        this.f31781w = f7;
        this.f31784z = 0.0f;
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
        cw cwVar = this.A;
        if (cwVar != null) {
            ((View) cwVar.f25420b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f31763b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f31763b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.f31765e.setColorFilter(colorFilter);
        this.f31762a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
