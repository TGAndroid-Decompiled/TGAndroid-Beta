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
    public final vnb y;

    public CheckBoxSquare(vnb vnbVar, Context context, boolean z) {
        super(context);
        int i;
        int i2;
        int i3;
        this.y = vnbVar;
        if (aob.o0 == null) {
            aob.Q(context);
        }
        boolean z2 = this.r;
        if (z2) {
            i = aob.y5;
        } else {
            i = aob.Y6;
        }
        this.s = i;
        if (z2) {
            i2 = aob.w5;
        } else {
            i2 = aob.W6;
        }
        this.w = i2;
        if (z2) {
            i3 = aob.x5;
        } else {
            i3 = aob.X6;
        }
        this.x = i3;
        this.a = new RectF();
        Bitmap createBitmap = Bitmap.createBitmap(hl.L(18.0f), hl.L(18.0f), Bitmap.Config.ARGB_4444);
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
        vnb vnbVar = this.y;
        int v0 = aob.v0(i2, vnbVar);
        int v02 = aob.v0(this.w, vnbVar);
        float f3 = this.d;
        if (f3 <= 0.5f) {
            f2 = f3 / 0.5f;
            aob.o0.setColor(Color.rgb(Color.red(v0) + ((int) ((Color.red(v02) - Color.red(v0)) * f2)), Color.green(v0) + ((int) ((Color.green(v02) - Color.green(v0)) * f2)), Color.blue(v0) + ((int) ((Color.blue(v02) - Color.blue(v0)) * f2))));
            f = f2;
        } else {
            aob.o0.setColor(v02);
            f = 2.0f - (f3 / 0.5f);
            f2 = 1.0f;
        }
        if (this.n) {
            Paint paint = aob.o0;
            if (this.r) {
                i = aob.z5;
            } else {
                i = aob.Z6;
            }
            paint.setColor(aob.v0(i, vnbVar));
        }
        float L = hl.L(1.0f) * f;
        RectF rectF = this.a;
        rectF.set(L, L, hl.L(18.0f) - L, hl.L(18.0f) - L);
        Bitmap bitmap = this.b;
        bitmap.eraseColor(0);
        Paint paint2 = aob.o0;
        Canvas canvas2 = this.c;
        canvas2.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint2);
        if (f2 != 1.0f) {
            float min = Math.min(hl.L(7.0f), (hl.L(7.0f) * f2) + L);
            rectF.set(hl.L(1.33f) + min, hl.L(1.33f) + min, hl.L(16.66f) - min, hl.L(16.66f) - min);
            canvas2.drawRoundRect(rectF, hl.L(3.0f), hl.L(3.0f), aob.m0);
        }
        if (this.d > 0.5f) {
            aob.n0.setColor(aob.v0(this.x, vnbVar));
            float f4 = 1.0f - f;
            canvas2.drawLine(hl.L(7.0f), (int) hl.N(13.0f), (int) (hl.L(7.0f) - (hl.L(3.0f) * f4)), (int) (hl.N(13.0f) - (hl.L(3.0f) * f4)), aob.n0);
            canvas2.drawLine((int) hl.N(7.0f), (int) hl.N(13.0f), (int) ((hl.L(7.0f) * f4) + hl.N(7.0f)), (int) (hl.N(13.0f) - (hl.L(7.0f) * f4)), aob.n0);
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
