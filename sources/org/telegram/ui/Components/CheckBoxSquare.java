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
    public final RectF f31343a;
    public final Bitmap f31344b;
    public final Canvas f31345c;
    public float d;
    public ObjectAnimator f31346e;
    public boolean f31347f;
    public boolean h;
    public boolean f31348n;
    public final boolean f31349r;
    public int f31350s;
    public int f31351w;
    public int f31352x;
    public final org.telegram.ui.ActionBar.e6 f31353y;

    public CheckBoxSquare(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        int i3;
        int i10;
        int i11;
        this.f31353y = e6Var;
        if (org.telegram.ui.ActionBar.k6.f28095p0 == null) {
            org.telegram.ui.ActionBar.k6.R(context);
        }
        boolean z11 = this.f31349r;
        if (z11) {
            i3 = org.telegram.ui.ActionBar.k6.f28272y5;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.Y6;
        }
        this.f31350s = i3;
        if (z11) {
            i10 = org.telegram.ui.ActionBar.k6.f28233w5;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.W6;
        }
        this.f31351w = i10;
        if (z11) {
            i11 = org.telegram.ui.ActionBar.k6.f28253x5;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.X6;
        }
        this.f31352x = i11;
        this.f31343a = new RectF();
        Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), Bitmap.Config.ARGB_4444);
        this.f31344b = createBitmap;
        this.f31345c = new Canvas(createBitmap);
        this.f31349r = z10;
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.h) {
            return;
        }
        this.h = z10;
        float f10 = 0.0f;
        if (this.f31347f && z11) {
            if (z10) {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f10);
            this.f31346e = ofFloat;
            ofFloat.setDuration(300L);
            this.f31346e.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f31346e;
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
        this.f31347f = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31347f = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        int i3;
        if (getVisibility() != 0) {
            return;
        }
        int i10 = this.f31350s;
        org.telegram.ui.ActionBar.e6 e6Var = this.f31353y;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, e6Var);
        int w03 = org.telegram.ui.ActionBar.k6.w0(this.f31351w, e6Var);
        float f12 = this.d;
        if (f12 <= 0.5f) {
            f11 = f12 / 0.5f;
            org.telegram.ui.ActionBar.k6.f28095p0.setColor(Color.rgb(Color.red(w02) + ((int) ((Color.red(w03) - Color.red(w02)) * f11)), Color.green(w02) + ((int) ((Color.green(w03) - Color.green(w02)) * f11)), Color.blue(w02) + ((int) ((Color.blue(w03) - Color.blue(w02)) * f11))));
            f10 = f11;
        } else {
            org.telegram.ui.ActionBar.k6.f28095p0.setColor(w03);
            f10 = 2.0f - (f12 / 0.5f);
            f11 = 1.0f;
        }
        if (this.f31348n) {
            Paint paint = org.telegram.ui.ActionBar.k6.f28095p0;
            if (this.f31349r) {
                i3 = org.telegram.ui.ActionBar.k6.f28289z5;
            } else {
                i3 = org.telegram.ui.ActionBar.k6.Z6;
            }
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        }
        float L = org.telegram.messenger.g0.L(1.0f) * f10;
        RectF rectF = this.f31343a;
        rectF.set(L, L, org.telegram.messenger.g0.L(18.0f) - L, org.telegram.messenger.g0.L(18.0f) - L);
        Bitmap bitmap = this.f31344b;
        bitmap.eraseColor(0);
        Paint paint2 = org.telegram.ui.ActionBar.k6.f28095p0;
        Canvas canvas2 = this.f31345c;
        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint2);
        if (f11 != 1.0f) {
            float min = Math.min(org.telegram.messenger.g0.L(7.0f), (org.telegram.messenger.g0.L(7.0f) * f11) + L);
            rectF.set(org.telegram.messenger.g0.L(1.33f) + min, org.telegram.messenger.g0.L(1.33f) + min, org.telegram.messenger.g0.L(16.66f) - min, org.telegram.messenger.g0.L(16.66f) - min);
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.k6.f28057n0);
        }
        if (this.d > 0.5f) {
            org.telegram.ui.ActionBar.k6.f28075o0.setColor(org.telegram.ui.ActionBar.k6.w0(this.f31352x, e6Var));
            float f13 = 1.0f - f10;
            canvas2.drawLine(org.telegram.messenger.g0.L(7.0f), (int) org.telegram.messenger.g0.N(13.0f), (int) (org.telegram.messenger.g0.L(7.0f) - (org.telegram.messenger.g0.L(3.0f) * f13)), (int) (org.telegram.messenger.g0.N(13.0f) - (org.telegram.messenger.g0.L(3.0f) * f13)), org.telegram.ui.ActionBar.k6.f28075o0);
            canvas2.drawLine((int) org.telegram.messenger.g0.N(7.0f), (int) org.telegram.messenger.g0.N(13.0f), (int) ((org.telegram.messenger.g0.L(7.0f) * f13) + org.telegram.messenger.g0.N(7.0f)), (int) (org.telegram.messenger.g0.N(13.0f) - (org.telegram.messenger.g0.L(7.0f) * f13)), org.telegram.ui.ActionBar.k6.f28075o0);
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
    }

    public void setDisabled(boolean z10) {
        this.f31348n = z10;
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
