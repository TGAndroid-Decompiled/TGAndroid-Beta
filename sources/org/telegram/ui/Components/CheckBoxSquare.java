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
    public final RectF f31277a;
    public final Bitmap f31278b;
    public final Canvas f31279c;
    public float d;
    public ObjectAnimator f31280e;
    public boolean f31281f;
    public boolean h;
    public boolean f31282n;
    public final boolean f31283r;
    public int f31284s;
    public int f31285w;
    public int f31286x;
    public final org.telegram.ui.ActionBar.g6 f31287y;

    public CheckBoxSquare(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z9) {
        super(context);
        int i7;
        int i10;
        int i11;
        this.f31287y = g6Var;
        if (org.telegram.ui.ActionBar.l6.f28079p0 == null) {
            org.telegram.ui.ActionBar.l6.R(context);
        }
        boolean z10 = this.f31283r;
        if (z10) {
            i7 = org.telegram.ui.ActionBar.l6.f28256y5;
        } else {
            i7 = org.telegram.ui.ActionBar.l6.Y6;
        }
        this.f31284s = i7;
        if (z10) {
            i10 = org.telegram.ui.ActionBar.l6.f28218w5;
        } else {
            i10 = org.telegram.ui.ActionBar.l6.W6;
        }
        this.f31285w = i10;
        if (z10) {
            i11 = org.telegram.ui.ActionBar.l6.f28237x5;
        } else {
            i11 = org.telegram.ui.ActionBar.l6.X6;
        }
        this.f31286x = i11;
        this.f31277a = new RectF();
        Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), Bitmap.Config.ARGB_4444);
        this.f31278b = createBitmap;
        this.f31279c = new Canvas(createBitmap);
        this.f31283r = z9;
    }

    public final void a(boolean z9, boolean z10) {
        if (z9 == this.h) {
            return;
        }
        this.h = z9;
        float f10 = 0.0f;
        if (this.f31281f && z10) {
            if (z9) {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f10);
            this.f31280e = ofFloat;
            ofFloat.setDuration(300L);
            this.f31280e.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f31280e;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (z9) {
            f10 = 1.0f;
        }
        setProgress(f10);
    }

    public float getProgress() {
        return this.d;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31281f = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31281f = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        int i7;
        if (getVisibility() != 0) {
            return;
        }
        int i10 = this.f31284s;
        org.telegram.ui.ActionBar.g6 g6Var = this.f31287y;
        int w02 = org.telegram.ui.ActionBar.l6.w0(i10, g6Var);
        int w03 = org.telegram.ui.ActionBar.l6.w0(this.f31285w, g6Var);
        float f12 = this.d;
        if (f12 <= 0.5f) {
            f11 = f12 / 0.5f;
            org.telegram.ui.ActionBar.l6.f28079p0.setColor(Color.rgb(Color.red(w02) + ((int) ((Color.red(w03) - Color.red(w02)) * f11)), Color.green(w02) + ((int) ((Color.green(w03) - Color.green(w02)) * f11)), Color.blue(w02) + ((int) ((Color.blue(w03) - Color.blue(w02)) * f11))));
            f10 = f11;
        } else {
            org.telegram.ui.ActionBar.l6.f28079p0.setColor(w03);
            f10 = 2.0f - (f12 / 0.5f);
            f11 = 1.0f;
        }
        if (this.f31282n) {
            Paint paint = org.telegram.ui.ActionBar.l6.f28079p0;
            if (this.f31283r) {
                i7 = org.telegram.ui.ActionBar.l6.f28274z5;
            } else {
                i7 = org.telegram.ui.ActionBar.l6.Z6;
            }
            paint.setColor(org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
        }
        float L = org.telegram.messenger.g0.L(1.0f) * f10;
        RectF rectF = this.f31277a;
        rectF.set(L, L, org.telegram.messenger.g0.L(18.0f) - L, org.telegram.messenger.g0.L(18.0f) - L);
        Bitmap bitmap = this.f31278b;
        bitmap.eraseColor(0);
        Paint paint2 = org.telegram.ui.ActionBar.l6.f28079p0;
        Canvas canvas2 = this.f31279c;
        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint2);
        if (f11 != 1.0f) {
            float min = Math.min(org.telegram.messenger.g0.L(7.0f), (org.telegram.messenger.g0.L(7.0f) * f11) + L);
            rectF.set(org.telegram.messenger.g0.L(1.33f) + min, org.telegram.messenger.g0.L(1.33f) + min, org.telegram.messenger.g0.L(16.66f) - min, org.telegram.messenger.g0.L(16.66f) - min);
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.l6.f28042n0);
        }
        if (this.d > 0.5f) {
            org.telegram.ui.ActionBar.l6.f28060o0.setColor(org.telegram.ui.ActionBar.l6.w0(this.f31286x, g6Var));
            float f13 = 1.0f - f10;
            canvas2.drawLine(org.telegram.messenger.g0.L(7.0f), (int) org.telegram.messenger.g0.N(13.0f), (int) (org.telegram.messenger.g0.L(7.0f) - (org.telegram.messenger.g0.L(3.0f) * f13)), (int) (org.telegram.messenger.g0.N(13.0f) - (org.telegram.messenger.g0.L(3.0f) * f13)), org.telegram.ui.ActionBar.l6.f28060o0);
            canvas2.drawLine((int) org.telegram.messenger.g0.N(7.0f), (int) org.telegram.messenger.g0.N(13.0f), (int) ((org.telegram.messenger.g0.L(7.0f) * f13) + org.telegram.messenger.g0.N(7.0f)), (int) (org.telegram.messenger.g0.N(13.0f) - (org.telegram.messenger.g0.L(7.0f) * f13)), org.telegram.ui.ActionBar.l6.f28060o0);
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
    }

    public void setDisabled(boolean z9) {
        this.f31282n = z9;
        invalidate();
    }

    public void setProgress(float f10) {
        if (this.d == f10) {
            return;
        }
        this.d = f10;
        invalidate();
    }
}
