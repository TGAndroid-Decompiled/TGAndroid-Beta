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
    public final RectF f26098a;
    public final Bitmap f26099b;
    public final Canvas f26100c;
    public float d;
    public ObjectAnimator e;
    public boolean f26101f;
    public boolean h;
    public boolean f26102n;
    public final boolean f26103r;
    public int f26104s;
    public int v;
    public int f26105w;
    public final org.telegram.ui.ActionBar.u6 f26106x;

    public CheckBoxSquare(Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context);
        int i10;
        int i11;
        int i12;
        this.f26106x = u6Var;
        if (org.telegram.ui.ActionBar.y6.f23574p0 == null) {
            org.telegram.ui.ActionBar.y6.Q(context);
        }
        boolean z11 = this.f26103r;
        if (z11) {
            i10 = org.telegram.ui.ActionBar.y6.f23747y5;
        } else {
            i10 = org.telegram.ui.ActionBar.y6.Y6;
        }
        this.f26104s = i10;
        if (z11) {
            i11 = org.telegram.ui.ActionBar.y6.f23710w5;
        } else {
            i11 = org.telegram.ui.ActionBar.y6.W6;
        }
        this.v = i11;
        if (z11) {
            i12 = org.telegram.ui.ActionBar.y6.f23730x5;
        } else {
            i12 = org.telegram.ui.ActionBar.y6.X6;
        }
        this.f26105w = i12;
        this.f26098a = new RectF();
        Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Bitmap.Config.ARGB_4444);
        this.f26099b = createBitmap;
        this.f26100c = new Canvas(createBitmap);
        this.f26103r = z10;
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.h) {
            return;
        }
        this.h = z10;
        float f7 = 0.0f;
        if (this.f26101f && z11) {
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
        this.f26101f = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26101f = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        int i10;
        if (getVisibility() != 0) {
            return;
        }
        int i11 = this.f26104s;
        org.telegram.ui.ActionBar.u6 u6Var = this.f26106x;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
        int w03 = org.telegram.ui.ActionBar.y6.w0(this.v, u6Var);
        float f11 = this.d;
        if (f11 <= 0.5f) {
            f10 = f11 / 0.5f;
            org.telegram.ui.ActionBar.y6.f23574p0.setColor(Color.rgb(Color.red(w02) + ((int) ((Color.red(w03) - Color.red(w02)) * f10)), Color.green(w02) + ((int) ((Color.green(w03) - Color.green(w02)) * f10)), Color.blue(w02) + ((int) ((Color.blue(w03) - Color.blue(w02)) * f10))));
            f7 = f10;
        } else {
            org.telegram.ui.ActionBar.y6.f23574p0.setColor(w03);
            f7 = 2.0f - (f11 / 0.5f);
            f10 = 1.0f;
        }
        if (this.f26102n) {
            Paint paint = org.telegram.ui.ActionBar.y6.f23574p0;
            if (this.f26103r) {
                i10 = org.telegram.ui.ActionBar.y6.f23766z5;
            } else {
                i10 = org.telegram.ui.ActionBar.y6.Z6;
            }
            paint.setColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        }
        float dp = AndroidUtilities.dp(1.0f) * f7;
        RectF rectF = this.f26098a;
        rectF.set(dp, dp, AndroidUtilities.dp(18.0f) - dp, AndroidUtilities.dp(18.0f) - dp);
        Bitmap bitmap = this.f26099b;
        bitmap.eraseColor(0);
        Paint paint2 = org.telegram.ui.ActionBar.y6.f23574p0;
        Canvas canvas2 = this.f26100c;
        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
        if (f10 != 1.0f) {
            float min = Math.min(AndroidUtilities.dp(7.0f), (AndroidUtilities.dp(7.0f) * f10) + dp);
            rectF.set(AndroidUtilities.dp(1.33f) + min, AndroidUtilities.dp(1.33f) + min, AndroidUtilities.dp(16.66f) - min, AndroidUtilities.dp(16.66f) - min);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.y6.f23534n0);
        }
        if (this.d > 0.5f) {
            org.telegram.ui.ActionBar.y6.f23554o0.setColor(org.telegram.ui.ActionBar.y6.w0(this.f26105w, u6Var));
            float f12 = 1.0f - f7;
            canvas2.drawLine(AndroidUtilities.dp(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) (AndroidUtilities.dp(7.0f) - (AndroidUtilities.dp(3.0f) * f12)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(3.0f) * f12)), org.telegram.ui.ActionBar.y6.f23554o0);
            canvas2.drawLine((int) AndroidUtilities.dpf2(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) ((AndroidUtilities.dp(7.0f) * f12) + AndroidUtilities.dpf2(7.0f)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(7.0f) * f12)), org.telegram.ui.ActionBar.y6.f23554o0);
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void setDisabled(boolean z10) {
        this.f26102n = z10;
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
