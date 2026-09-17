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
    public final RectF f23917a;
    public final Bitmap f23918b;
    public final Canvas f23919c;
    public float d;
    public ObjectAnimator f23920e;
    public boolean f23921f;
    public boolean h;
    public boolean f23922n;
    public final boolean f23923r;
    public int f23924s;
    public int v;
    public int f23925w;
    public final org.telegram.ui.ActionBar.f6 f23926x;

    public CheckBoxSquare(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        int i10;
        int i11;
        int i12;
        this.f23926x = f6Var;
        if (org.telegram.ui.ActionBar.j6.f20875p0 == null) {
            org.telegram.ui.ActionBar.j6.P(context);
        }
        boolean z11 = this.f23923r;
        if (z11) {
            i10 = org.telegram.ui.ActionBar.j6.f21042y5;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.Y6;
        }
        this.f23924s = i10;
        if (z11) {
            i11 = org.telegram.ui.ActionBar.j6.f21008w5;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.W6;
        }
        this.v = i11;
        if (z11) {
            i12 = org.telegram.ui.ActionBar.j6.f21025x5;
        } else {
            i12 = org.telegram.ui.ActionBar.j6.X6;
        }
        this.f23925w = i12;
        this.f23917a = new RectF();
        Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Bitmap.Config.ARGB_4444);
        this.f23918b = createBitmap;
        this.f23919c = new Canvas(createBitmap);
        this.f23923r = z10;
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.h) {
            return;
        }
        this.h = z10;
        float f7 = 0.0f;
        if (this.f23921f && z11) {
            if (z10) {
                f7 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f7);
            this.f23920e = ofFloat;
            ofFloat.setDuration(300L);
            this.f23920e.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f23920e;
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
        this.f23921f = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23921f = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        int i10;
        if (getVisibility() != 0) {
            return;
        }
        int i11 = this.f23924s;
        org.telegram.ui.ActionBar.f6 f6Var = this.f23926x;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        int v03 = org.telegram.ui.ActionBar.j6.v0(this.v, f6Var);
        float f11 = this.d;
        if (f11 <= 0.5f) {
            f10 = f11 / 0.5f;
            org.telegram.ui.ActionBar.j6.f20875p0.setColor(Color.rgb(Color.red(v02) + ((int) ((Color.red(v03) - Color.red(v02)) * f10)), Color.green(v02) + ((int) ((Color.green(v03) - Color.green(v02)) * f10)), Color.blue(v02) + ((int) ((Color.blue(v03) - Color.blue(v02)) * f10))));
            f7 = f10;
        } else {
            org.telegram.ui.ActionBar.j6.f20875p0.setColor(v03);
            f7 = 2.0f - (f11 / 0.5f);
            f10 = 1.0f;
        }
        if (this.f23922n) {
            Paint paint = org.telegram.ui.ActionBar.j6.f20875p0;
            if (this.f23923r) {
                i10 = org.telegram.ui.ActionBar.j6.f21061z5;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.Z6;
            }
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        }
        float dp = AndroidUtilities.dp(1.0f) * f7;
        RectF rectF = this.f23917a;
        rectF.set(dp, dp, AndroidUtilities.dp(18.0f) - dp, AndroidUtilities.dp(18.0f) - dp);
        Bitmap bitmap = this.f23918b;
        bitmap.eraseColor(0);
        Paint paint2 = org.telegram.ui.ActionBar.j6.f20875p0;
        Canvas canvas2 = this.f23919c;
        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
        if (f10 != 1.0f) {
            float min = Math.min(AndroidUtilities.dp(7.0f), (AndroidUtilities.dp(7.0f) * f10) + dp);
            rectF.set(AndroidUtilities.dp(1.33f) + min, AndroidUtilities.dp(1.33f) + min, AndroidUtilities.dp(16.66f) - min, AndroidUtilities.dp(16.66f) - min);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.j6.f20841n0);
        }
        if (this.d > 0.5f) {
            org.telegram.ui.ActionBar.j6.f20857o0.setColor(org.telegram.ui.ActionBar.j6.v0(this.f23925w, f6Var));
            float f12 = 1.0f - f7;
            canvas2.drawLine(AndroidUtilities.dp(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) (AndroidUtilities.dp(7.0f) - (AndroidUtilities.dp(3.0f) * f12)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(3.0f) * f12)), org.telegram.ui.ActionBar.j6.f20857o0);
            canvas2.drawLine((int) AndroidUtilities.dpf2(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) ((AndroidUtilities.dp(7.0f) * f12) + AndroidUtilities.dpf2(7.0f)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(7.0f) * f12)), org.telegram.ui.ActionBar.j6.f20857o0);
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void setDisabled(boolean z10) {
        this.f23922n = z10;
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
