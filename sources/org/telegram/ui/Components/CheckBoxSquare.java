package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
public class CheckBoxSquare extends View {
    public final RectF a;
    public final Bitmap b;
    public final Canvas c;
    public float d;
    public ObjectAnimator e;
    public boolean f;
    public boolean h;
    public boolean n;
    public final boolean r;
    public int s;
    public int w;
    public int x;
    public final ylb y;

    public CheckBoxSquare(ylb ylbVar, Context context, boolean z) {
        super(context);
        int i;
        int i2;
        int i3;
        this.y = ylbVar;
        if (cmb.o0 == null) {
            cmb.Q(context);
        }
        boolean z2 = this.r;
        if (z2) {
            i = cmb.x5;
        } else {
            i = cmb.X6;
        }
        this.s = i;
        if (z2) {
            i2 = cmb.v5;
        } else {
            i2 = cmb.V6;
        }
        this.w = i2;
        if (z2) {
            i3 = cmb.w5;
        } else {
            i3 = cmb.W6;
        }
        this.x = i3;
        this.a = new RectF();
        Bitmap createBitmap = Bitmap.createBitmap(gm.L(18.0f), gm.L(18.0f), Bitmap.Config.ARGB_4444);
        this.b = createBitmap;
        this.c = new Canvas(createBitmap);
        this.r = z;
    }

    public final void a(boolean z, boolean z2) {
        if (z == this.h) {
            return;
        }
        this.h = z;
        float f = 0.0f;
        if (this.f && z2) {
            if (z) {
                f = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f);
            this.e = ofFloat;
            ofFloat.setDuration(300L);
            this.e.start();
            return;
        }
        ObjectAnimator objectAnimator = this.e;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (z) {
            f = 1.0f;
        }
        setProgress(f);
    }

    public float getProgress() {
        return this.d;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        if (getVisibility() != 0) {
            return;
        }
        int i2 = this.s;
        ylb ylbVar = this.y;
        int v0 = cmb.v0(i2, ylbVar);
        int v02 = cmb.v0(this.w, ylbVar);
        float f3 = this.d;
        if (f3 <= 0.5f) {
            f2 = f3 / 0.5f;
            cmb.o0.setColor(Color.rgb(Color.red(v0) + ((int) ((Color.red(v02) - Color.red(v0)) * f2)), Color.green(v0) + ((int) ((Color.green(v02) - Color.green(v0)) * f2)), Color.blue(v0) + ((int) ((Color.blue(v02) - Color.blue(v0)) * f2))));
            f = f2;
        } else {
            cmb.o0.setColor(v02);
            f = 2.0f - (f3 / 0.5f);
            f2 = 1.0f;
        }
        if (this.n) {
            Paint paint = cmb.o0;
            if (this.r) {
                i = cmb.y5;
            } else {
                i = cmb.Y6;
            }
            paint.setColor(cmb.v0(i, ylbVar));
        }
        float L = gm.L(1.0f) * f;
        RectF rectF = this.a;
        rectF.set(L, L, gm.L(18.0f) - L, gm.L(18.0f) - L);
        Bitmap bitmap = this.b;
        bitmap.eraseColor(0);
        Paint paint2 = cmb.o0;
        Canvas canvas2 = this.c;
        canvas2.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint2);
        if (f2 != 1.0f) {
            float min = Math.min(gm.L(7.0f), (gm.L(7.0f) * f2) + L);
            rectF.set(gm.L(1.33f) + min, gm.L(1.33f) + min, gm.L(16.66f) - min, gm.L(16.66f) - min);
            canvas2.drawRoundRect(rectF, gm.L(3.0f), gm.L(3.0f), cmb.m0);
        }
        if (this.d > 0.5f) {
            cmb.n0.setColor(cmb.v0(this.x, ylbVar));
            float f4 = 1.0f - f;
            canvas2.drawLine(gm.L(7.0f), (int) gm.N(13.0f), (int) (gm.L(7.0f) - (gm.L(3.0f) * f4)), (int) (gm.N(13.0f) - (gm.L(3.0f) * f4)), cmb.n0);
            canvas2.drawLine((int) gm.N(7.0f), (int) gm.N(13.0f), (int) ((gm.L(7.0f) * f4) + gm.N(7.0f)), (int) (gm.N(13.0f) - (gm.L(7.0f) * f4)), cmb.n0);
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setDisabled(boolean z) {
        this.n = z;
        invalidate();
    }

    public void setProgress(float f) {
        if (this.d == f) {
            return;
        }
        this.d = f;
        invalidate();
    }
}
