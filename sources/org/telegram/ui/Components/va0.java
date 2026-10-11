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
    public org.telegram.ui.ActionBar.d5 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f31712a;
    public final Paint f31713b;
    public final Paint f31714c;
    public final Paint d;
    public final Paint f31715e;
    public final RectF f31716f;
    public PorterDuffColorFilter f31717g;
    public float h;
    public final DecelerateInterpolator f31718i;
    public boolean f31719j;
    public float f31720k;
    public int f31721l;
    public String f31722m;
    public int f31723n;
    public float f31724o;
    public int f31725p;
    public int f31726q;
    public float f31727r;
    public float f31728s;
    public long f31729t;
    public boolean f31730u;
    public float v;
    public float f31731w;
    public float f31732x;
    public float f31733y;
    public float f31734z;

    public va0() {
        TextPaint textPaint = new TextPaint(1);
        this.f31712a = textPaint;
        Paint paint = new Paint(1);
        this.f31713b = paint;
        this.f31714c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f31715e = paint3;
        this.f31716f = new RectF();
        this.h = 1.0f;
        this.f31718i = new DecelerateInterpolator();
        this.f31720k = 400.0f;
        this.f31721l = -1;
        this.f31724o = 1.0f;
        this.f31727r = 1.0f;
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
        org.telegram.ui.ActionBar.d5 d5Var = this.B;
        if (d5Var != null && d5Var.l() && !this.E) {
            Rect bounds = getBounds();
            org.telegram.ui.ActionBar.d5 d5Var2 = this.B;
            Shader shader = d5Var2.f20522a;
            Matrix matrix = d5Var2.f20530k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f20537r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f20537r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f31730u) {
            return this.f31727r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f31713b.setColor(i11);
        this.d.setColor(i11);
        this.f31715e.setColor(i11);
        this.f31712a.setColor(i11);
        this.f31717g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f31725p == i10 && (i12 = this.f31726q) != i10) {
            this.f31725p = i12;
            this.f31727r = 1.0f;
        }
        if (z10) {
            int i13 = this.f31725p;
            if (i13 != i10 && (i11 = this.f31726q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f31720k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f31720k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f31720k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f31720k = 160.0f;
                } else {
                    this.f31720k = 220.0f;
                }
                if (this.f31730u) {
                    this.f31725p = i11;
                }
                this.f31730u = true;
                this.f31726q = i10;
                this.f31728s = this.f31727r;
                this.f31727r = 0.0f;
            } else {
                return;
            }
        } else if (this.f31725p == i10) {
            return;
        } else {
            this.f31730u = false;
            this.f31726q = i10;
            this.f31725p = i10;
            this.f31728s = this.f31727r;
            this.f31727r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f31732x = 0.0f;
            this.f31733y = 0.0f;
            this.f31734z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.va0.draw(android.graphics.Canvas):void");
    }

    public final void e(float f7, boolean z10) {
        if (this.f31731w == f7) {
            return;
        }
        if (!z10) {
            this.f31732x = f7;
            this.f31733y = f7;
        } else {
            if (this.f31732x > f7) {
                this.f31732x = f7;
            }
            this.f31733y = this.f31732x;
        }
        this.f31731w = f7;
        this.f31734z = 0.0f;
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
            ((View) cwVar.f25331b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f31713b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f31713b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.f31715e.setColorFilter(colorFilter);
        this.f31712a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
