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
    public final RectF f32883a;
    public final Bitmap f32884b;
    public final Canvas f32885c;
    public float d;
    public ObjectAnimator f32886e;
    public boolean f32887f;
    public boolean h;
    public boolean f32888n;
    public final boolean f32889r;
    public int f32890s;
    public int f32891w;
    public int f32892x;
    public final org.telegram.ui.ActionBar.h6 f32893y;

    public CheckBoxSquare(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        super(context);
        int i7;
        int i10;
        int i11;
        this.f32893y = h6Var;
        if (org.telegram.ui.ActionBar.m6.f29595p0 == null) {
            org.telegram.ui.ActionBar.m6.R(context);
        }
        boolean z11 = this.f32889r;
        if (z11) {
            i7 = org.telegram.ui.ActionBar.m6.f29772y5;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.Y6;
        }
        this.f32890s = i7;
        if (z11) {
            i10 = org.telegram.ui.ActionBar.m6.f29734w5;
        } else {
            i10 = org.telegram.ui.ActionBar.m6.W6;
        }
        this.f32891w = i10;
        if (z11) {
            i11 = org.telegram.ui.ActionBar.m6.f29753x5;
        } else {
            i11 = org.telegram.ui.ActionBar.m6.X6;
        }
        this.f32892x = i11;
        this.f32883a = new RectF();
        Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), Bitmap.Config.ARGB_4444);
        this.f32884b = createBitmap;
        this.f32885c = new Canvas(createBitmap);
        this.f32889r = z10;
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.h) {
            return;
        }
        this.h = z10;
        float f10 = 0.0f;
        if (this.f32887f && z11) {
            if (z10) {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f10);
            this.f32886e = ofFloat;
            ofFloat.setDuration(300L);
            this.f32886e.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f32886e;
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
        this.f32887f = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32887f = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        int i7;
        if (getVisibility() != 0) {
            return;
        }
        int i10 = this.f32890s;
        org.telegram.ui.ActionBar.h6 h6Var = this.f32893y;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        int w03 = org.telegram.ui.ActionBar.m6.w0(this.f32891w, h6Var);
        float f12 = this.d;
        if (f12 <= 0.5f) {
            f11 = f12 / 0.5f;
            org.telegram.ui.ActionBar.m6.f29595p0.setColor(Color.rgb(Color.red(w02) + ((int) ((Color.red(w03) - Color.red(w02)) * f11)), Color.green(w02) + ((int) ((Color.green(w03) - Color.green(w02)) * f11)), Color.blue(w02) + ((int) ((Color.blue(w03) - Color.blue(w02)) * f11))));
            f10 = f11;
        } else {
            org.telegram.ui.ActionBar.m6.f29595p0.setColor(w03);
            f10 = 2.0f - (f12 / 0.5f);
            f11 = 1.0f;
        }
        if (this.f32888n) {
            Paint paint = org.telegram.ui.ActionBar.m6.f29595p0;
            if (this.f32889r) {
                i7 = org.telegram.ui.ActionBar.m6.f29791z5;
            } else {
                i7 = org.telegram.ui.ActionBar.m6.Z6;
            }
            paint.setColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        }
        float L = org.telegram.messenger.g0.L(1.0f) * f10;
        RectF rectF = this.f32883a;
        rectF.set(L, L, org.telegram.messenger.g0.L(18.0f) - L, org.telegram.messenger.g0.L(18.0f) - L);
        Bitmap bitmap = this.f32884b;
        bitmap.eraseColor(0);
        Paint paint2 = org.telegram.ui.ActionBar.m6.f29595p0;
        Canvas canvas2 = this.f32885c;
        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint2);
        if (f11 != 1.0f) {
            float min = Math.min(org.telegram.messenger.g0.L(7.0f), (org.telegram.messenger.g0.L(7.0f) * f11) + L);
            rectF.set(org.telegram.messenger.g0.L(1.33f) + min, org.telegram.messenger.g0.L(1.33f) + min, org.telegram.messenger.g0.L(16.66f) - min, org.telegram.messenger.g0.L(16.66f) - min);
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.m6.f29558n0);
        }
        if (this.d > 0.5f) {
            org.telegram.ui.ActionBar.m6.f29576o0.setColor(org.telegram.ui.ActionBar.m6.w0(this.f32892x, h6Var));
            float f13 = 1.0f - f10;
            canvas2.drawLine(org.telegram.messenger.g0.L(7.0f), (int) org.telegram.messenger.g0.N(13.0f), (int) (org.telegram.messenger.g0.L(7.0f) - (org.telegram.messenger.g0.L(3.0f) * f13)), (int) (org.telegram.messenger.g0.N(13.0f) - (org.telegram.messenger.g0.L(3.0f) * f13)), org.telegram.ui.ActionBar.m6.f29576o0);
            canvas2.drawLine((int) org.telegram.messenger.g0.N(7.0f), (int) org.telegram.messenger.g0.N(13.0f), (int) ((org.telegram.messenger.g0.L(7.0f) * f13) + org.telegram.messenger.g0.N(7.0f)), (int) (org.telegram.messenger.g0.N(13.0f) - (org.telegram.messenger.g0.L(7.0f) * f13)), org.telegram.ui.ActionBar.m6.f29576o0);
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
    }

    public void setDisabled(boolean z10) {
        this.f32888n = z10;
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
