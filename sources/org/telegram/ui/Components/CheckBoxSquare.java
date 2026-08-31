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
    public final RectF f24818a;
    public final Bitmap f24819b;
    public final Canvas f24820c;
    public float d;
    public ObjectAnimator f24821e;
    public boolean f24822f;
    public boolean h;
    public boolean f24823n;
    public final boolean f24824r;
    public int f24825s;
    public int v;
    public int f24826w;
    public final org.telegram.ui.ActionBar.g6 f24827x;

    public CheckBoxSquare(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        super(context);
        int i10;
        int i11;
        int i12;
        this.f24827x = g6Var;
        if (org.telegram.ui.ActionBar.k6.f21869p0 == null) {
            org.telegram.ui.ActionBar.k6.P(context);
        }
        boolean z10 = this.f24824r;
        if (z10) {
            i10 = org.telegram.ui.ActionBar.k6.f22035y5;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.Y6;
        }
        this.f24825s = i10;
        if (z10) {
            i11 = org.telegram.ui.ActionBar.k6.f21997w5;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.W6;
        }
        this.v = i11;
        if (z10) {
            i12 = org.telegram.ui.ActionBar.k6.f22016x5;
        } else {
            i12 = org.telegram.ui.ActionBar.k6.X6;
        }
        this.f24826w = i12;
        this.f24818a = new RectF();
        Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Bitmap.Config.ARGB_4444);
        this.f24819b = createBitmap;
        this.f24820c = new Canvas(createBitmap);
        this.f24824r = z4;
    }

    public final void a(boolean z4, boolean z10) {
        if (z4 == this.h) {
            return;
        }
        this.h = z4;
        float f10 = 0.0f;
        if (this.f24822f && z10) {
            if (z4) {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f10);
            this.f24821e = ofFloat;
            ofFloat.setDuration(300L);
            this.f24821e.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f24821e;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (z4) {
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
        this.f24822f = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24822f = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        int i10;
        if (getVisibility() != 0) {
            return;
        }
        int i11 = this.f24825s;
        org.telegram.ui.ActionBar.g6 g6Var = this.f24827x;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i11, g6Var);
        int v03 = org.telegram.ui.ActionBar.k6.v0(this.v, g6Var);
        float f12 = this.d;
        if (f12 <= 0.5f) {
            f11 = f12 / 0.5f;
            org.telegram.ui.ActionBar.k6.f21869p0.setColor(Color.rgb(Color.red(v02) + ((int) ((Color.red(v03) - Color.red(v02)) * f11)), Color.green(v02) + ((int) ((Color.green(v03) - Color.green(v02)) * f11)), Color.blue(v02) + ((int) ((Color.blue(v03) - Color.blue(v02)) * f11))));
            f10 = f11;
        } else {
            org.telegram.ui.ActionBar.k6.f21869p0.setColor(v03);
            f10 = 2.0f - (f12 / 0.5f);
            f11 = 1.0f;
        }
        if (this.f24823n) {
            Paint paint = org.telegram.ui.ActionBar.k6.f21869p0;
            if (this.f24824r) {
                i10 = org.telegram.ui.ActionBar.k6.f22052z5;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.Z6;
            }
            paint.setColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        }
        float dp = AndroidUtilities.dp(1.0f) * f10;
        RectF rectF = this.f24818a;
        rectF.set(dp, dp, AndroidUtilities.dp(18.0f) - dp, AndroidUtilities.dp(18.0f) - dp);
        Bitmap bitmap = this.f24819b;
        bitmap.eraseColor(0);
        Paint paint2 = org.telegram.ui.ActionBar.k6.f21869p0;
        Canvas canvas2 = this.f24820c;
        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
        if (f11 != 1.0f) {
            float min = Math.min(AndroidUtilities.dp(7.0f), (AndroidUtilities.dp(7.0f) * f11) + dp);
            rectF.set(AndroidUtilities.dp(1.33f) + min, AndroidUtilities.dp(1.33f) + min, AndroidUtilities.dp(16.66f) - min, AndroidUtilities.dp(16.66f) - min);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.k6.f21833n0);
        }
        if (this.d > 0.5f) {
            org.telegram.ui.ActionBar.k6.f21851o0.setColor(org.telegram.ui.ActionBar.k6.v0(this.f24826w, g6Var));
            float f13 = 1.0f - f10;
            canvas2.drawLine(AndroidUtilities.dp(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) (AndroidUtilities.dp(7.0f) - (AndroidUtilities.dp(3.0f) * f13)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(3.0f) * f13)), org.telegram.ui.ActionBar.k6.f21851o0);
            canvas2.drawLine((int) AndroidUtilities.dpf2(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) ((AndroidUtilities.dp(7.0f) * f13) + AndroidUtilities.dpf2(7.0f)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(7.0f) * f13)), org.telegram.ui.ActionBar.k6.f21851o0);
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
    }

    public void setDisabled(boolean z4) {
        this.f24823n = z4;
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
