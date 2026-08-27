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

    public final RectF f26318a;

    public final Bitmap f26319b;

    public final Canvas f26320c;
    public float d;

    public ObjectAnimator f26321e;

    public boolean f26322f;
    public boolean h;

    public boolean f26323n;

    public final boolean f26324r;

    public int f26325s;
    public int v;

    public int f26326w;

    public final org.telegram.ui.ActionBar.c6 f26327x;

    public CheckBoxSquare(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.f26327x = c6Var;
        if (org.telegram.ui.ActionBar.g6.f23263p0 == null) {
            org.telegram.ui.ActionBar.g6.P(context);
        }
        boolean z11 = this.f26324r;
        this.f26325s = z11 ? org.telegram.ui.ActionBar.g6.f23422y5 : org.telegram.ui.ActionBar.g6.Y6;
        this.v = z11 ? org.telegram.ui.ActionBar.g6.f23390w5 : org.telegram.ui.ActionBar.g6.W6;
        this.f26326w = z11 ? org.telegram.ui.ActionBar.g6.f23405x5 : org.telegram.ui.ActionBar.g6.X6;
        this.f26318a = new RectF();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Bitmap.Config.ARGB_4444);
        this.f26319b = bitmapCreateBitmap;
        this.f26320c = new Canvas(bitmapCreateBitmap);
        this.f26324r = z10;
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.h) {
            return;
        }
        this.h = z10;
        if (this.f26322f && z11) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "progress", z10 ? 1.0f : 0.0f);
            this.f26321e = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(300L);
            this.f26321e.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f26321e;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setProgress(z10 ? 1.0f : 0.0f);
    }

    public float getProgress() {
        return this.d;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26322f = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26322f = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        if (getVisibility() != 0) {
            return;
        }
        int i10 = this.f26325s;
        org.telegram.ui.ActionBar.c6 c6Var = this.f26327x;
        int iV0 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        int iV1 = org.telegram.ui.ActionBar.g6.v0(this.v, c6Var);
        float f12 = this.d;
        if (f12 <= 0.5f) {
            f11 = f12 / 0.5f;
            org.telegram.ui.ActionBar.g6.f23263p0.setColor(Color.rgb(Color.red(iV0) + ((int) ((Color.red(iV1) - Color.red(iV0)) * f11)), Color.green(iV0) + ((int) ((Color.green(iV1) - Color.green(iV0)) * f11)), Color.blue(iV0) + ((int) ((Color.blue(iV1) - Color.blue(iV0)) * f11))));
            f10 = f11;
        } else {
            org.telegram.ui.ActionBar.g6.f23263p0.setColor(iV1);
            f10 = 2.0f - (f12 / 0.5f);
            f11 = 1.0f;
        }
        if (this.f26323n) {
            org.telegram.ui.ActionBar.g6.f23263p0.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26324r ? org.telegram.ui.ActionBar.g6.f23440z5 : org.telegram.ui.ActionBar.g6.Z6, c6Var));
        }
        float fDp = AndroidUtilities.dp(1.0f) * f10;
        float fDp2 = AndroidUtilities.dp(18.0f) - fDp;
        float fDp3 = AndroidUtilities.dp(18.0f) - fDp;
        RectF rectF = this.f26318a;
        rectF.set(fDp, fDp, fDp2, fDp3);
        Bitmap bitmap = this.f26319b;
        bitmap.eraseColor(0);
        float fDp4 = AndroidUtilities.dp(4.0f);
        float fDp5 = AndroidUtilities.dp(4.0f);
        Paint paint = org.telegram.ui.ActionBar.g6.f23263p0;
        Canvas canvas2 = this.f26320c;
        canvas2.drawRoundRect(rectF, fDp4, fDp5, paint);
        if (f11 != 1.0f) {
            float fMin = Math.min(AndroidUtilities.dp(7.0f), (AndroidUtilities.dp(7.0f) * f11) + fDp);
            rectF.set(AndroidUtilities.dp(1.33f) + fMin, AndroidUtilities.dp(1.33f) + fMin, AndroidUtilities.dp(16.66f) - fMin, AndroidUtilities.dp(16.66f) - fMin);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.g6.f23228n0);
        }
        if (this.d > 0.5f) {
            org.telegram.ui.ActionBar.g6.f23245o0.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26326w, c6Var));
            float f13 = 1.0f - f10;
            canvas2.drawLine(AndroidUtilities.dp(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) (AndroidUtilities.dp(7.0f) - (AndroidUtilities.dp(3.0f) * f13)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(3.0f) * f13)), org.telegram.ui.ActionBar.g6.f23245o0);
            canvas2.drawLine((int) AndroidUtilities.dpf2(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) ((AndroidUtilities.dp(7.0f) * f13) + AndroidUtilities.dpf2(7.0f)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(7.0f) * f13)), org.telegram.ui.ActionBar.g6.f23245o0);
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void setDisabled(boolean z10) {
        this.f26323n = z10;
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
