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
    public final RectF f26100a;
    public final Bitmap f26101b;
    public final Canvas f26102c;
    public float d;
    public ObjectAnimator e;
    public boolean f26103f;
    public boolean h;
    public boolean f26104n;
    public final boolean f26105r;
    public int f26106s;
    public int v;
    public int f26107w;
    public final org.telegram.ui.ActionBar.u6 f26108x;

    public CheckBoxSquare(Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context);
        int i10;
        int i11;
        int i12;
        this.f26108x = u6Var;
        if (org.telegram.ui.ActionBar.y6.f23575p0 == null) {
            org.telegram.ui.ActionBar.y6.Q(context);
        }
        boolean z11 = this.f26105r;
        if (z11) {
            i10 = org.telegram.ui.ActionBar.y6.f23748y5;
        } else {
            i10 = org.telegram.ui.ActionBar.y6.Y6;
        }
        this.f26106s = i10;
        if (z11) {
            i11 = org.telegram.ui.ActionBar.y6.f23711w5;
        } else {
            i11 = org.telegram.ui.ActionBar.y6.W6;
        }
        this.v = i11;
        if (z11) {
            i12 = org.telegram.ui.ActionBar.y6.f23731x5;
        } else {
            i12 = org.telegram.ui.ActionBar.y6.X6;
        }
        this.f26107w = i12;
        this.f26100a = new RectF();
        Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Bitmap.Config.ARGB_4444);
        this.f26101b = createBitmap;
        this.f26102c = new Canvas(createBitmap);
        this.f26105r = z10;
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.h) {
            return;
        }
        this.h = z10;
        float f7 = 0.0f;
        if (this.f26103f && z11) {
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
        this.f26103f = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26103f = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        int i10;
        if (getVisibility() != 0) {
            return;
        }
        int i11 = this.f26106s;
        org.telegram.ui.ActionBar.u6 u6Var = this.f26108x;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
        int w03 = org.telegram.ui.ActionBar.y6.w0(this.v, u6Var);
        float f11 = this.d;
        if (f11 <= 0.5f) {
            f10 = f11 / 0.5f;
            org.telegram.ui.ActionBar.y6.f23575p0.setColor(Color.rgb(Color.red(w02) + ((int) ((Color.red(w03) - Color.red(w02)) * f10)), Color.green(w02) + ((int) ((Color.green(w03) - Color.green(w02)) * f10)), Color.blue(w02) + ((int) ((Color.blue(w03) - Color.blue(w02)) * f10))));
            f7 = f10;
        } else {
            org.telegram.ui.ActionBar.y6.f23575p0.setColor(w03);
            f7 = 2.0f - (f11 / 0.5f);
            f10 = 1.0f;
        }
        if (this.f26104n) {
            Paint paint = org.telegram.ui.ActionBar.y6.f23575p0;
            if (this.f26105r) {
                i10 = org.telegram.ui.ActionBar.y6.f23767z5;
            } else {
                i10 = org.telegram.ui.ActionBar.y6.Z6;
            }
            paint.setColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        }
        float dp = AndroidUtilities.dp(1.0f) * f7;
        RectF rectF = this.f26100a;
        rectF.set(dp, dp, AndroidUtilities.dp(18.0f) - dp, AndroidUtilities.dp(18.0f) - dp);
        Bitmap bitmap = this.f26101b;
        bitmap.eraseColor(0);
        Paint paint2 = org.telegram.ui.ActionBar.y6.f23575p0;
        Canvas canvas2 = this.f26102c;
        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
        if (f10 != 1.0f) {
            float min = Math.min(AndroidUtilities.dp(7.0f), (AndroidUtilities.dp(7.0f) * f10) + dp);
            rectF.set(AndroidUtilities.dp(1.33f) + min, AndroidUtilities.dp(1.33f) + min, AndroidUtilities.dp(16.66f) - min, AndroidUtilities.dp(16.66f) - min);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.y6.f23535n0);
        }
        if (this.d > 0.5f) {
            org.telegram.ui.ActionBar.y6.f23555o0.setColor(org.telegram.ui.ActionBar.y6.w0(this.f26107w, u6Var));
            float f12 = 1.0f - f7;
            canvas2.drawLine(AndroidUtilities.dp(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) (AndroidUtilities.dp(7.0f) - (AndroidUtilities.dp(3.0f) * f12)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(3.0f) * f12)), org.telegram.ui.ActionBar.y6.f23555o0);
            canvas2.drawLine((int) AndroidUtilities.dpf2(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) ((AndroidUtilities.dp(7.0f) * f12) + AndroidUtilities.dpf2(7.0f)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(7.0f) * f12)), org.telegram.ui.ActionBar.y6.f23555o0);
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void setDisabled(boolean z10) {
        this.f26104n = z10;
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
