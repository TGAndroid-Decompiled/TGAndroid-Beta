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
    public final RectF f21978a;
    public final Bitmap f21979b;
    public final Canvas f21980c;
    public float d;
    public ObjectAnimator e;
    public boolean f21981f;
    public boolean h;
    public boolean f21982n;
    public final boolean f21983r;
    public int f21984s;
    public int v;
    public int f21985w;
    public final org.telegram.ui.ActionBar.e6 f21986x;

    public CheckBoxSquare(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        int i10;
        int i11;
        int i12;
        this.f21986x = e6Var;
        if (org.telegram.ui.ActionBar.i6.f19047p0 == null) {
            org.telegram.ui.ActionBar.i6.P(context);
        }
        boolean z11 = this.f21983r;
        if (z11) {
            i10 = org.telegram.ui.ActionBar.i6.f19214y5;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.Y6;
        }
        this.f21984s = i10;
        if (z11) {
            i11 = org.telegram.ui.ActionBar.i6.f19180w5;
        } else {
            i11 = org.telegram.ui.ActionBar.i6.W6;
        }
        this.v = i11;
        if (z11) {
            i12 = org.telegram.ui.ActionBar.i6.f19197x5;
        } else {
            i12 = org.telegram.ui.ActionBar.i6.X6;
        }
        this.f21985w = i12;
        this.f21978a = new RectF();
        Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Bitmap.Config.ARGB_4444);
        this.f21979b = createBitmap;
        this.f21980c = new Canvas(createBitmap);
        this.f21983r = z10;
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.h) {
            return;
        }
        this.h = z10;
        float f7 = 0.0f;
        if (this.f21981f && z11) {
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
        this.f21981f = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f21981f = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        int i10;
        if (getVisibility() != 0) {
            return;
        }
        int i11 = this.f21984s;
        org.telegram.ui.ActionBar.e6 e6Var = this.f21986x;
        int v02 = org.telegram.ui.ActionBar.i6.v0(i11, e6Var);
        int v03 = org.telegram.ui.ActionBar.i6.v0(this.v, e6Var);
        float f11 = this.d;
        if (f11 <= 0.5f) {
            f10 = f11 / 0.5f;
            org.telegram.ui.ActionBar.i6.f19047p0.setColor(Color.rgb(Color.red(v02) + ((int) ((Color.red(v03) - Color.red(v02)) * f10)), Color.green(v02) + ((int) ((Color.green(v03) - Color.green(v02)) * f10)), Color.blue(v02) + ((int) ((Color.blue(v03) - Color.blue(v02)) * f10))));
            f7 = f10;
        } else {
            org.telegram.ui.ActionBar.i6.f19047p0.setColor(v03);
            f7 = 2.0f - (f11 / 0.5f);
            f10 = 1.0f;
        }
        if (this.f21982n) {
            Paint paint = org.telegram.ui.ActionBar.i6.f19047p0;
            if (this.f21983r) {
                i10 = org.telegram.ui.ActionBar.i6.f19233z5;
            } else {
                i10 = org.telegram.ui.ActionBar.i6.Z6;
            }
            paint.setColor(org.telegram.ui.ActionBar.i6.v0(i10, e6Var));
        }
        float dp = AndroidUtilities.dp(1.0f) * f7;
        RectF rectF = this.f21978a;
        rectF.set(dp, dp, AndroidUtilities.dp(18.0f) - dp, AndroidUtilities.dp(18.0f) - dp);
        Bitmap bitmap = this.f21979b;
        bitmap.eraseColor(0);
        Paint paint2 = org.telegram.ui.ActionBar.i6.f19047p0;
        Canvas canvas2 = this.f21980c;
        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
        if (f10 != 1.0f) {
            float min = Math.min(AndroidUtilities.dp(7.0f), (AndroidUtilities.dp(7.0f) * f10) + dp);
            rectF.set(AndroidUtilities.dp(1.33f) + min, AndroidUtilities.dp(1.33f) + min, AndroidUtilities.dp(16.66f) - min, AndroidUtilities.dp(16.66f) - min);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.i6.f19012n0);
        }
        if (this.d > 0.5f) {
            org.telegram.ui.ActionBar.i6.f19029o0.setColor(org.telegram.ui.ActionBar.i6.v0(this.f21985w, e6Var));
            float f12 = 1.0f - f7;
            canvas2.drawLine(AndroidUtilities.dp(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) (AndroidUtilities.dp(7.0f) - (AndroidUtilities.dp(3.0f) * f12)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(3.0f) * f12)), org.telegram.ui.ActionBar.i6.f19029o0);
            canvas2.drawLine((int) AndroidUtilities.dpf2(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) ((AndroidUtilities.dp(7.0f) * f12) + AndroidUtilities.dpf2(7.0f)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(7.0f) * f12)), org.telegram.ui.ActionBar.i6.f19029o0);
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void setDisabled(boolean z10) {
        this.f21982n = z10;
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
