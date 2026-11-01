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
    public final RectF f23929a;
    public final Bitmap f23930b;
    public final Canvas f23931c;
    public float d;
    public ObjectAnimator e;
    public boolean f23932f;
    public boolean h;
    public boolean f23933n;
    public final boolean f23934r;
    public int f23935s;
    public int f23936w;
    public int f23937x;
    public final org.telegram.ui.ActionBar.p6 f23938y;

    public CheckBoxSquare(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        int i10;
        int i11;
        int i12;
        this.f23938y = p6Var;
        if (org.telegram.ui.ActionBar.t6.f21148p0 == null) {
            org.telegram.ui.ActionBar.t6.R(context);
        }
        boolean z11 = this.f23934r;
        if (z11) {
            i10 = org.telegram.ui.ActionBar.t6.f21311y5;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.Y6;
        }
        this.f23935s = i10;
        if (z11) {
            i11 = org.telegram.ui.ActionBar.t6.f21277w5;
        } else {
            i11 = org.telegram.ui.ActionBar.t6.W6;
        }
        this.f23936w = i11;
        if (z11) {
            i12 = org.telegram.ui.ActionBar.t6.f21295x5;
        } else {
            i12 = org.telegram.ui.ActionBar.t6.X6;
        }
        this.f23937x = i12;
        this.f23929a = new RectF();
        Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f), Bitmap.Config.ARGB_4444);
        this.f23930b = createBitmap;
        this.f23931c = new Canvas(createBitmap);
        this.f23934r = z10;
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.h) {
            return;
        }
        this.h = z10;
        float f7 = 0.0f;
        if (this.f23932f && z11) {
            if (z10) {
                f7 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f7);
            this.e = ofFloat;
            ofFloat.setDuration(300L);
            this.e.start();
            return;
        }
        ObjectAnimator objectAnimator = this.e;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (z10) {
            f7 = 1.0f;
        }
        setProgress(f7);
    }

    public float getProgress() {
        return this.d;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f23932f = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23932f = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        int i10;
        if (getVisibility() != 0) {
            return;
        }
        int i11 = this.f23935s;
        org.telegram.ui.ActionBar.p6 p6Var = this.f23938y;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
        int w03 = org.telegram.ui.ActionBar.t6.w0(this.f23936w, p6Var);
        float f11 = this.d;
        if (f11 <= 0.5f) {
            f10 = f11 / 0.5f;
            org.telegram.ui.ActionBar.t6.f21148p0.setColor(Color.rgb(Color.red(w02) + ((int) ((Color.red(w03) - Color.red(w02)) * f10)), Color.green(w02) + ((int) ((Color.green(w03) - Color.green(w02)) * f10)), Color.blue(w02) + ((int) ((Color.blue(w03) - Color.blue(w02)) * f10))));
            f7 = f10;
        } else {
            org.telegram.ui.ActionBar.t6.f21148p0.setColor(w03);
            f7 = 2.0f - (f11 / 0.5f);
            f10 = 1.0f;
        }
        if (this.f23933n) {
            Paint paint = org.telegram.ui.ActionBar.t6.f21148p0;
            if (this.f23934r) {
                i10 = org.telegram.ui.ActionBar.t6.f21330z5;
            } else {
                i10 = org.telegram.ui.ActionBar.t6.Z6;
            }
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        }
        float L = org.telegram.messenger.i0.L(1.0f) * f7;
        RectF rectF = this.f23929a;
        rectF.set(L, L, org.telegram.messenger.i0.L(18.0f) - L, org.telegram.messenger.i0.L(18.0f) - L);
        Bitmap bitmap = this.f23930b;
        bitmap.eraseColor(0);
        Paint paint2 = org.telegram.ui.ActionBar.t6.f21148p0;
        Canvas canvas2 = this.f23931c;
        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint2);
        if (f10 != 1.0f) {
            float min = Math.min(org.telegram.messenger.i0.L(7.0f), (org.telegram.messenger.i0.L(7.0f) * f10) + L);
            rectF.set(org.telegram.messenger.i0.L(1.33f) + min, org.telegram.messenger.i0.L(1.33f) + min, org.telegram.messenger.i0.L(16.66f) - min, org.telegram.messenger.i0.L(16.66f) - min);
            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.ui.ActionBar.t6.f21110n0);
        }
        if (this.d > 0.5f) {
            org.telegram.ui.ActionBar.t6.f21129o0.setColor(org.telegram.ui.ActionBar.t6.w0(this.f23937x, p6Var));
            float f12 = 1.0f - f7;
            canvas2.drawLine(org.telegram.messenger.i0.L(7.0f), (int) org.telegram.messenger.i0.N(13.0f), (int) (org.telegram.messenger.i0.L(7.0f) - (org.telegram.messenger.i0.L(3.0f) * f12)), (int) (org.telegram.messenger.i0.N(13.0f) - (org.telegram.messenger.i0.L(3.0f) * f12)), org.telegram.ui.ActionBar.t6.f21129o0);
            canvas2.drawLine((int) org.telegram.messenger.i0.N(7.0f), (int) org.telegram.messenger.i0.N(13.0f), (int) ((org.telegram.messenger.i0.L(7.0f) * f12) + org.telegram.messenger.i0.N(7.0f)), (int) (org.telegram.messenger.i0.N(13.0f) - (org.telegram.messenger.i0.L(7.0f) * f12)), org.telegram.ui.ActionBar.t6.f21129o0);
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void setDisabled(boolean z10) {
        this.f23933n = z10;
        invalidate();
    }

    public void setProgress(float f7) {
        if (this.d == f7) {
            return;
        }
        this.d = f7;
        invalidate();
    }
}
