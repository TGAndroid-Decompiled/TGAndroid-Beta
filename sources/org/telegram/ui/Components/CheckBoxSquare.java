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
    public final RectF f32847a;
    public final Bitmap f32848b;
    public final Canvas f32849c;
    public float d;
    public ObjectAnimator f32850e;
    public boolean f32851f;
    public boolean h;
    public boolean f32852n;
    public final boolean f32853r;
    public int f32854s;
    public int f32855w;
    public int f32856x;
    public final org.telegram.ui.ActionBar.i6 f32857y;

    public CheckBoxSquare(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context);
        int i7;
        int i10;
        int i11;
        this.f32857y = i6Var;
        if (org.telegram.ui.ActionBar.n6.f29610p0 == null) {
            org.telegram.ui.ActionBar.n6.R(context);
        }
        boolean z11 = this.f32853r;
        if (z11) {
            i7 = org.telegram.ui.ActionBar.n6.f29787y5;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.Y6;
        }
        this.f32854s = i7;
        if (z11) {
            i10 = org.telegram.ui.ActionBar.n6.f29749w5;
        } else {
            i10 = org.telegram.ui.ActionBar.n6.W6;
        }
        this.f32855w = i10;
        if (z11) {
            i11 = org.telegram.ui.ActionBar.n6.f29768x5;
        } else {
            i11 = org.telegram.ui.ActionBar.n6.X6;
        }
        this.f32856x = i11;
        this.f32847a = new RectF();
        Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), Bitmap.Config.ARGB_4444);
        this.f32848b = createBitmap;
        this.f32849c = new Canvas(createBitmap);
        this.f32853r = z10;
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.h) {
            return;
        }
        this.h = z10;
        float f10 = 0.0f;
        if (this.f32851f && z11) {
            if (z10) {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f10);
            this.f32850e = ofFloat;
            ofFloat.setDuration(300L);
            this.f32850e.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f32850e;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (z10) {
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
        this.f32851f = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32851f = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        int i7;
        if (getVisibility() != 0) {
            return;
        }
        int i10 = this.f32854s;
        org.telegram.ui.ActionBar.i6 i6Var = this.f32857y;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
        int w03 = org.telegram.ui.ActionBar.n6.w0(this.f32855w, i6Var);
        float f12 = this.d;
        if (f12 <= 0.5f) {
            f11 = f12 / 0.5f;
            org.telegram.ui.ActionBar.n6.f29610p0.setColor(Color.rgb(Color.red(w02) + ((int) ((Color.red(w03) - Color.red(w02)) * f11)), Color.green(w02) + ((int) ((Color.green(w03) - Color.green(w02)) * f11)), Color.blue(w02) + ((int) ((Color.blue(w03) - Color.blue(w02)) * f11))));
            f10 = f11;
        } else {
            org.telegram.ui.ActionBar.n6.f29610p0.setColor(w03);
            f10 = 2.0f - (f12 / 0.5f);
            f11 = 1.0f;
        }
        if (this.f32852n) {
            Paint paint = org.telegram.ui.ActionBar.n6.f29610p0;
            if (this.f32853r) {
                i7 = org.telegram.ui.ActionBar.n6.f29806z5;
            } else {
                i7 = org.telegram.ui.ActionBar.n6.Z6;
            }
            paint.setColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        }
        float L = org.telegram.messenger.g0.L(1.0f) * f10;
        RectF rectF = this.f32847a;
        rectF.set(L, L, org.telegram.messenger.g0.L(18.0f) - L, org.telegram.messenger.g0.L(18.0f) - L);
        Bitmap bitmap = this.f32848b;
        bitmap.eraseColor(0);
        Paint paint2 = org.telegram.ui.ActionBar.n6.f29610p0;
        Canvas canvas2 = this.f32849c;
        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint2);
        if (f11 != 1.0f) {
            float min = Math.min(org.telegram.messenger.g0.L(7.0f), (org.telegram.messenger.g0.L(7.0f) * f11) + L);
            rectF.set(org.telegram.messenger.g0.L(1.33f) + min, org.telegram.messenger.g0.L(1.33f) + min, org.telegram.messenger.g0.L(16.66f) - min, org.telegram.messenger.g0.L(16.66f) - min);
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.n6.f29573n0);
        }
        if (this.d > 0.5f) {
            org.telegram.ui.ActionBar.n6.f29591o0.setColor(org.telegram.ui.ActionBar.n6.w0(this.f32856x, i6Var));
            float f13 = 1.0f - f10;
            canvas2.drawLine(org.telegram.messenger.g0.L(7.0f), (int) org.telegram.messenger.g0.N(13.0f), (int) (org.telegram.messenger.g0.L(7.0f) - (org.telegram.messenger.g0.L(3.0f) * f13)), (int) (org.telegram.messenger.g0.N(13.0f) - (org.telegram.messenger.g0.L(3.0f) * f13)), org.telegram.ui.ActionBar.n6.f29591o0);
            canvas2.drawLine((int) org.telegram.messenger.g0.N(7.0f), (int) org.telegram.messenger.g0.N(13.0f), (int) ((org.telegram.messenger.g0.L(7.0f) * f13) + org.telegram.messenger.g0.N(7.0f)), (int) (org.telegram.messenger.g0.N(13.0f) - (org.telegram.messenger.g0.L(7.0f) * f13)), org.telegram.ui.ActionBar.n6.f29591o0);
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
    }

    public void setDisabled(boolean z10) {
        this.f32852n = z10;
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
