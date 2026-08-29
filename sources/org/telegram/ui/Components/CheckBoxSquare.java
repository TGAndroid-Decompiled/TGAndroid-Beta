package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public class CheckBoxSquare extends View {
    public final RectF f26333a;
    public final Bitmap f26334b;
    public final Canvas f26335c;
    public float d;
    public ObjectAnimator f26336e;
    public boolean f26337f;
    public boolean h;
    public boolean f26338n;
    public final boolean f26339r;
    public int f26340s;
    public int v;
    public int f26341w;
    public final org.telegram.ui.ActionBar.c6 f26342x;

    public CheckBoxSquare(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        int i10;
        int i11;
        int i12;
        this.f26342x = c6Var;
        if (org.telegram.ui.ActionBar.g6.f23272p0 == null) {
            org.telegram.ui.ActionBar.g6.P(context);
        }
        boolean z11 = this.f26339r;
        if (z11) {
            i10 = org.telegram.ui.ActionBar.g6.f23432y5;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.Y6;
        }
        this.f26340s = i10;
        if (z11) {
            i11 = org.telegram.ui.ActionBar.g6.f23400w5;
        } else {
            i11 = org.telegram.ui.ActionBar.g6.W6;
        }
        this.v = i11;
        if (z11) {
            i12 = org.telegram.ui.ActionBar.g6.f23417x5;
        } else {
            i12 = org.telegram.ui.ActionBar.g6.X6;
        }
        this.f26341w = i12;
        this.f26333a = new RectF();
        Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Bitmap.Config.ARGB_4444);
        this.f26334b = createBitmap;
        this.f26335c = new Canvas(createBitmap);
        this.f26339r = z10;
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.h) {
            return;
        }
        this.h = z10;
        float f9 = 0.0f;
        if (this.f26337f && z11) {
            if (z10) {
                f9 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f9);
            this.f26336e = ofFloat;
            ofFloat.setDuration(300L);
            this.f26336e.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f26336e;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (z10) {
            f9 = 1.0f;
        }
        setProgress(f9);
    }

    public float getProgress() {
        return this.d;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26337f = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26337f = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f9;
        float f10;
        int i10;
        if (getVisibility() != 0) {
            return;
        }
        int i11 = this.f26340s;
        org.telegram.ui.ActionBar.c6 c6Var = this.f26342x;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        int v03 = org.telegram.ui.ActionBar.g6.v0(this.v, c6Var);
        float f11 = this.d;
        if (f11 <= 0.5f) {
            f10 = f11 / 0.5f;
            org.telegram.ui.ActionBar.g6.f23272p0.setColor(Color.rgb(Color.red(v02) + ((int) ((Color.red(v03) - Color.red(v02)) * f10)), Color.green(v02) + ((int) ((Color.green(v03) - Color.green(v02)) * f10)), Color.blue(v02) + ((int) ((Color.blue(v03) - Color.blue(v02)) * f10))));
            f9 = f10;
        } else {
            org.telegram.ui.ActionBar.g6.f23272p0.setColor(v03);
            f9 = 2.0f - (f11 / 0.5f);
            f10 = 1.0f;
        }
        if (this.f26338n) {
            Paint paint = org.telegram.ui.ActionBar.g6.f23272p0;
            if (this.f26339r) {
                i10 = org.telegram.ui.ActionBar.g6.f23449z5;
            } else {
                i10 = org.telegram.ui.ActionBar.g6.Z6;
            }
            paint.setColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        }
        float dp = AndroidUtilities.dp(1.0f) * f9;
        RectF rectF = this.f26333a;
        rectF.set(dp, dp, AndroidUtilities.dp(18.0f) - dp, AndroidUtilities.dp(18.0f) - dp);
        Bitmap bitmap = this.f26334b;
        bitmap.eraseColor(0);
        Paint paint2 = org.telegram.ui.ActionBar.g6.f23272p0;
        Canvas canvas2 = this.f26335c;
        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
        if (f10 != 1.0f) {
            float min = Math.min(AndroidUtilities.dp(7.0f), (AndroidUtilities.dp(7.0f) * f10) + dp);
            rectF.set(AndroidUtilities.dp(1.33f) + min, AndroidUtilities.dp(1.33f) + min, AndroidUtilities.dp(16.66f) - min, AndroidUtilities.dp(16.66f) - min);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.g6.f23235n0);
        }
        if (this.d > 0.5f) {
            org.telegram.ui.ActionBar.g6.f23254o0.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26341w, c6Var));
            float f12 = 1.0f - f9;
            canvas2.drawLine(AndroidUtilities.dp(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) (AndroidUtilities.dp(7.0f) - (AndroidUtilities.dp(3.0f) * f12)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(3.0f) * f12)), org.telegram.ui.ActionBar.g6.f23254o0);
            canvas2.drawLine((int) AndroidUtilities.dpf2(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) ((AndroidUtilities.dp(7.0f) * f12) + AndroidUtilities.dpf2(7.0f)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(7.0f) * f12)), org.telegram.ui.ActionBar.g6.f23254o0);
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void setDisabled(boolean z10) {
        this.f26338n = z10;
        invalidate();
    }

    public void setProgress(float f9) {
        if (this.d == f9) {
            return;
        }
        this.d = f9;
        invalidate();
    }
}
