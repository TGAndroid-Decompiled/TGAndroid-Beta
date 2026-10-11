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
    public final RectF f24098a;
    public final Bitmap f24099b;
    public final Canvas f24100c;
    public float d;
    public ObjectAnimator f24101e;
    public boolean f24102f;
    public boolean h;
    public boolean f24103n;
    public final boolean f24104r;
    public int f24105s;
    public int v;
    public int f24106w;
    public final org.telegram.ui.ActionBar.d6 f24107x;

    public CheckBoxSquare(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        int i10;
        int i11;
        int i12;
        this.f24107x = d6Var;
        if (org.telegram.ui.ActionBar.h6.f21001p0 == null) {
            org.telegram.ui.ActionBar.h6.Q(context);
        }
        boolean z11 = this.f24104r;
        if (z11) {
            i10 = org.telegram.ui.ActionBar.h6.f21170y5;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.Y6;
        }
        this.f24105s = i10;
        if (z11) {
            i11 = org.telegram.ui.ActionBar.h6.f21135w5;
        } else {
            i11 = org.telegram.ui.ActionBar.h6.W6;
        }
        this.v = i11;
        if (z11) {
            i12 = org.telegram.ui.ActionBar.h6.f21154x5;
        } else {
            i12 = org.telegram.ui.ActionBar.h6.X6;
        }
        this.f24106w = i12;
        this.f24098a = new RectF();
        Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Bitmap.Config.ARGB_4444);
        this.f24099b = createBitmap;
        this.f24100c = new Canvas(createBitmap);
        this.f24104r = z10;
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.h) {
            return;
        }
        this.h = z10;
        float f7 = 0.0f;
        if (this.f24102f && z11) {
            if (z10) {
                f7 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f7);
            this.f24101e = ofFloat;
            ofFloat.setDuration(300L);
            this.f24101e.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f24101e;
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
        this.f24102f = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24102f = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        int i10;
        if (getVisibility() != 0) {
            return;
        }
        int i11 = this.f24105s;
        org.telegram.ui.ActionBar.d6 d6Var = this.f24107x;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        int w03 = org.telegram.ui.ActionBar.h6.w0(this.v, d6Var);
        float f11 = this.d;
        if (f11 <= 0.5f) {
            f10 = f11 / 0.5f;
            org.telegram.ui.ActionBar.h6.f21001p0.setColor(Color.rgb(Color.red(w02) + ((int) ((Color.red(w03) - Color.red(w02)) * f10)), Color.green(w02) + ((int) ((Color.green(w03) - Color.green(w02)) * f10)), Color.blue(w02) + ((int) ((Color.blue(w03) - Color.blue(w02)) * f10))));
            f7 = f10;
        } else {
            org.telegram.ui.ActionBar.h6.f21001p0.setColor(w03);
            f7 = 2.0f - (f11 / 0.5f);
            f10 = 1.0f;
        }
        if (this.f24103n) {
            Paint paint = org.telegram.ui.ActionBar.h6.f21001p0;
            if (this.f24104r) {
                i10 = org.telegram.ui.ActionBar.h6.f21188z5;
            } else {
                i10 = org.telegram.ui.ActionBar.h6.Z6;
            }
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        }
        float dp = AndroidUtilities.dp(1.0f) * f7;
        RectF rectF = this.f24098a;
        rectF.set(dp, dp, AndroidUtilities.dp(18.0f) - dp, AndroidUtilities.dp(18.0f) - dp);
        Bitmap bitmap = this.f24099b;
        bitmap.eraseColor(0);
        Paint paint2 = org.telegram.ui.ActionBar.h6.f21001p0;
        Canvas canvas2 = this.f24100c;
        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
        if (f10 != 1.0f) {
            float min = Math.min(AndroidUtilities.dp(7.0f), (AndroidUtilities.dp(7.0f) * f10) + dp);
            rectF.set(AndroidUtilities.dp(1.33f) + min, AndroidUtilities.dp(1.33f) + min, AndroidUtilities.dp(16.66f) - min, AndroidUtilities.dp(16.66f) - min);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.h6.f20965n0);
        }
        if (this.d > 0.5f) {
            org.telegram.ui.ActionBar.h6.f20983o0.setColor(org.telegram.ui.ActionBar.h6.w0(this.f24106w, d6Var));
            float f12 = 1.0f - f7;
            canvas2.drawLine(AndroidUtilities.dp(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) (AndroidUtilities.dp(7.0f) - (AndroidUtilities.dp(3.0f) * f12)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(3.0f) * f12)), org.telegram.ui.ActionBar.h6.f20983o0);
            canvas2.drawLine((int) AndroidUtilities.dpf2(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) ((AndroidUtilities.dp(7.0f) * f12) + AndroidUtilities.dpf2(7.0f)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(7.0f) * f12)), org.telegram.ui.ActionBar.h6.f20983o0);
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void setDisabled(boolean z10) {
        this.f24103n = z10;
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
