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
public final class ua0 extends Drawable {
    public bw A;
    public org.telegram.ui.ActionBar.f5 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint f31407a;
    public final Paint f31408b;
    public final Paint f31409c;
    public final Paint d;
    public final Paint f31410e;
    public final RectF f31411f;
    public PorterDuffColorFilter f31412g;
    public float h;
    public final DecelerateInterpolator f31413i;
    public boolean f31414j;
    public float f31415k;
    public int f31416l;
    public String f31417m;
    public int f31418n;
    public float f31419o;
    public int f31420p;
    public int f31421q;
    public float f31422r;
    public float f31423s;
    public long f31424t;
    public boolean f31425u;
    public float v;
    public float f31426w;
    public float f31427x;
    public float f31428y;
    public float f31429z;

    public ua0() {
        TextPaint textPaint = new TextPaint(1);
        this.f31407a = textPaint;
        Paint paint = new Paint(1);
        this.f31408b = paint;
        this.f31409c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f31410e = paint3;
        this.f31411f = new RectF();
        this.h = 1.0f;
        this.f31413i = new DecelerateInterpolator();
        this.f31415k = 400.0f;
        this.f31416l = -1;
        this.f31419o = 1.0f;
        this.f31422r = 1.0f;
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
            Shader shader = f5Var2.f20599a;
            Matrix matrix = f5Var2.f20607k;
            matrix.reset();
            this.B.a();
            if (z10) {
                matrix.postTranslate(-bounds.centerX(), (-this.B.f20614r) + bounds.top);
            } else {
                matrix.postTranslate(0.0f, -this.B.f20614r);
            }
            shader.setLocalMatrix(matrix);
        }
    }

    public final float b() {
        if (this.f31425u) {
            return this.f31422r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f31408b.setColor(i11);
        this.d.setColor(i11);
        this.f31410e.setColor(i11);
        this.f31407a.setColor(i11);
        this.f31412g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f31420p == i10 && (i12 = this.f31421q) != i10) {
            this.f31420p = i12;
            this.f31422r = 1.0f;
        }
        if (z10) {
            int i13 = this.f31420p;
            if (i13 != i10 && (i11 = this.f31421q) != i10) {
                if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                    this.f31415k = 300.0f;
                } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                    this.f31415k = 400.0f;
                } else if (i13 != 4 && i10 == 6) {
                    this.f31415k = 360.0f;
                } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                    this.f31415k = 160.0f;
                } else {
                    this.f31415k = 220.0f;
                }
                if (this.f31425u) {
                    this.f31420p = i11;
                }
                this.f31425u = true;
                this.f31421q = i10;
                this.f31423s = this.f31422r;
                this.f31422r = 0.0f;
            } else {
                return;
            }
        } else if (this.f31420p == i10) {
            return;
        } else {
            this.f31425u = false;
            this.f31421q = i10;
            this.f31420p = i10;
            this.f31423s = this.f31422r;
            this.f31422r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f31427x = 0.0f;
            this.f31428y = 0.0f;
            this.f31429z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ua0.draw(android.graphics.Canvas):void");
    }

    public final void e(float f7, boolean z10) {
        if (this.f31426w == f7) {
            return;
        }
        if (!z10) {
            this.f31427x = f7;
            this.f31428y = f7;
        } else {
            if (this.f31427x > f7) {
                this.f31427x = f7;
            }
            this.f31428y = this.f31427x;
        }
        this.f31426w = f7;
        this.f31429z = 0.0f;
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
        bw bwVar = this.A;
        if (bwVar != null) {
            ((View) bwVar.f25112b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.f31408b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f31408b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.f31410e.setColorFilter(colorFilter);
        this.f31407a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
