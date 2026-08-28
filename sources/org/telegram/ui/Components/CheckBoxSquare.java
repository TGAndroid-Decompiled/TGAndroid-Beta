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
    public final RectF f26322a;
    public final Bitmap f26323b;
    public final Canvas f26324c;
    public float d;
    public ObjectAnimator f26325e;
    public boolean f26326f;
    public boolean h;
    public boolean f26327n;
    public final boolean f26328r;
    public int f26329s;
    public int v;
    public int f26330w;
    public final org.telegram.ui.ActionBar.b6 f26331x;

    public CheckBoxSquare(Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        int i9;
        int i10;
        int i11;
        this.f26331x = b6Var;
        if (org.telegram.ui.ActionBar.f6.f23206p0 == null) {
            org.telegram.ui.ActionBar.f6.P(context);
        }
        boolean z11 = this.f26328r;
        if (z11) {
            i9 = org.telegram.ui.ActionBar.f6.f23368y5;
        } else {
            i9 = org.telegram.ui.ActionBar.f6.Y6;
        }
        this.f26329s = i9;
        if (z11) {
            i10 = org.telegram.ui.ActionBar.f6.f23333w5;
        } else {
            i10 = org.telegram.ui.ActionBar.f6.W6;
        }
        this.v = i10;
        if (z11) {
            i11 = org.telegram.ui.ActionBar.f6.f23350x5;
        } else {
            i11 = org.telegram.ui.ActionBar.f6.X6;
        }
        this.f26330w = i11;
        this.f26322a = new RectF();
        Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Bitmap.Config.ARGB_4444);
        this.f26323b = createBitmap;
        this.f26324c = new Canvas(createBitmap);
        this.f26328r = z10;
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.h) {
            return;
        }
        this.h = z10;
        float f10 = 0.0f;
        if (this.f26326f && z11) {
            if (z10) {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f10);
            this.f26325e = ofFloat;
            ofFloat.setDuration(300L);
            this.f26325e.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f26325e;
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
        this.f26326f = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26326f = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        int i9;
        if (getVisibility() != 0) {
            return;
        }
        int i10 = this.f26329s;
        org.telegram.ui.ActionBar.b6 b6Var = this.f26331x;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i10, b6Var);
        int v03 = org.telegram.ui.ActionBar.f6.v0(this.v, b6Var);
        float f12 = this.d;
        if (f12 <= 0.5f) {
            f11 = f12 / 0.5f;
            org.telegram.ui.ActionBar.f6.f23206p0.setColor(Color.rgb(Color.red(v02) + ((int) ((Color.red(v03) - Color.red(v02)) * f11)), Color.green(v02) + ((int) ((Color.green(v03) - Color.green(v02)) * f11)), Color.blue(v02) + ((int) ((Color.blue(v03) - Color.blue(v02)) * f11))));
            f10 = f11;
        } else {
            org.telegram.ui.ActionBar.f6.f23206p0.setColor(v03);
            f10 = 2.0f - (f12 / 0.5f);
            f11 = 1.0f;
        }
        if (this.f26327n) {
            Paint paint = org.telegram.ui.ActionBar.f6.f23206p0;
            if (this.f26328r) {
                i9 = org.telegram.ui.ActionBar.f6.f23385z5;
            } else {
                i9 = org.telegram.ui.ActionBar.f6.Z6;
            }
            paint.setColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        }
        float dp = AndroidUtilities.dp(1.0f) * f10;
        RectF rectF = this.f26322a;
        rectF.set(dp, dp, AndroidUtilities.dp(18.0f) - dp, AndroidUtilities.dp(18.0f) - dp);
        Bitmap bitmap = this.f26323b;
        bitmap.eraseColor(0);
        Paint paint2 = org.telegram.ui.ActionBar.f6.f23206p0;
        Canvas canvas2 = this.f26324c;
        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
        if (f11 != 1.0f) {
            float min = Math.min(AndroidUtilities.dp(7.0f), (AndroidUtilities.dp(7.0f) * f11) + dp);
            rectF.set(AndroidUtilities.dp(1.33f) + min, AndroidUtilities.dp(1.33f) + min, AndroidUtilities.dp(16.66f) - min, AndroidUtilities.dp(16.66f) - min);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.f6.f23173n0);
        }
        if (this.d > 0.5f) {
            org.telegram.ui.ActionBar.f6.f23191o0.setColor(org.telegram.ui.ActionBar.f6.v0(this.f26330w, b6Var));
            float f13 = 1.0f - f10;
            canvas2.drawLine(AndroidUtilities.dp(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) (AndroidUtilities.dp(7.0f) - (AndroidUtilities.dp(3.0f) * f13)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(3.0f) * f13)), org.telegram.ui.ActionBar.f6.f23191o0);
            canvas2.drawLine((int) AndroidUtilities.dpf2(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) ((AndroidUtilities.dp(7.0f) * f13) + AndroidUtilities.dpf2(7.0f)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(7.0f) * f13)), org.telegram.ui.ActionBar.f6.f23191o0);
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
    }

    public void setDisabled(boolean z10) {
        this.f26327n = z10;
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
