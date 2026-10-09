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
    public final RectF f24106a;
    public final Bitmap f24107b;
    public final Canvas f24108c;
    public float d;
    public ObjectAnimator f24109e;
    public boolean f24110f;
    public boolean h;
    public boolean f24111n;
    public final boolean f24112r;
    public int f24113s;
    public int v;
    public int f24114w;
    public final org.telegram.ui.ActionBar.e6 f24115x;

    public CheckBoxSquare(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        int i10;
        int i11;
        int i12;
        this.f24115x = e6Var;
        if (org.telegram.ui.ActionBar.i6.f21012p0 == null) {
            org.telegram.ui.ActionBar.i6.Q(context);
        }
        boolean z11 = this.f24112r;
        if (z11) {
            i10 = org.telegram.ui.ActionBar.i6.f21180y5;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.Y6;
        }
        this.f24113s = i10;
        if (z11) {
            i11 = org.telegram.ui.ActionBar.i6.f21145w5;
        } else {
            i11 = org.telegram.ui.ActionBar.i6.W6;
        }
        this.v = i11;
        if (z11) {
            i12 = org.telegram.ui.ActionBar.i6.f21164x5;
        } else {
            i12 = org.telegram.ui.ActionBar.i6.X6;
        }
        this.f24114w = i12;
        this.f24106a = new RectF();
        Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Bitmap.Config.ARGB_4444);
        this.f24107b = createBitmap;
        this.f24108c = new Canvas(createBitmap);
        this.f24112r = z10;
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.h) {
            return;
        }
        this.h = z10;
        float f7 = 0.0f;
        if (this.f24110f && z11) {
            if (z10) {
                f7 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f7);
            this.f24109e = ofFloat;
            ofFloat.setDuration(300L);
            this.f24109e.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f24109e;
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
        this.f24110f = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24110f = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        int i10;
        if (getVisibility() != 0) {
            return;
        }
        int i11 = this.f24113s;
        org.telegram.ui.ActionBar.e6 e6Var = this.f24115x;
        int w02 = org.telegram.ui.ActionBar.i6.w0(i11, e6Var);
        int w03 = org.telegram.ui.ActionBar.i6.w0(this.v, e6Var);
        float f11 = this.d;
        if (f11 <= 0.5f) {
            f10 = f11 / 0.5f;
            org.telegram.ui.ActionBar.i6.f21012p0.setColor(Color.rgb(Color.red(w02) + ((int) ((Color.red(w03) - Color.red(w02)) * f10)), Color.green(w02) + ((int) ((Color.green(w03) - Color.green(w02)) * f10)), Color.blue(w02) + ((int) ((Color.blue(w03) - Color.blue(w02)) * f10))));
            f7 = f10;
        } else {
            org.telegram.ui.ActionBar.i6.f21012p0.setColor(w03);
            f7 = 2.0f - (f11 / 0.5f);
            f10 = 1.0f;
        }
        if (this.f24111n) {
            Paint paint = org.telegram.ui.ActionBar.i6.f21012p0;
            if (this.f24112r) {
                i10 = org.telegram.ui.ActionBar.i6.f21198z5;
            } else {
                i10 = org.telegram.ui.ActionBar.i6.Z6;
            }
            paint.setColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        }
        float dp = AndroidUtilities.dp(1.0f) * f7;
        RectF rectF = this.f24106a;
        rectF.set(dp, dp, AndroidUtilities.dp(18.0f) - dp, AndroidUtilities.dp(18.0f) - dp);
        Bitmap bitmap = this.f24107b;
        bitmap.eraseColor(0);
        Paint paint2 = org.telegram.ui.ActionBar.i6.f21012p0;
        Canvas canvas2 = this.f24108c;
        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
        if (f10 != 1.0f) {
            float min = Math.min(AndroidUtilities.dp(7.0f), (AndroidUtilities.dp(7.0f) * f10) + dp);
            rectF.set(AndroidUtilities.dp(1.33f) + min, AndroidUtilities.dp(1.33f) + min, AndroidUtilities.dp(16.66f) - min, AndroidUtilities.dp(16.66f) - min);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.i6.f20976n0);
        }
        if (this.d > 0.5f) {
            org.telegram.ui.ActionBar.i6.f20994o0.setColor(org.telegram.ui.ActionBar.i6.w0(this.f24114w, e6Var));
            float f12 = 1.0f - f7;
            canvas2.drawLine(AndroidUtilities.dp(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) (AndroidUtilities.dp(7.0f) - (AndroidUtilities.dp(3.0f) * f12)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(3.0f) * f12)), org.telegram.ui.ActionBar.i6.f20994o0);
            canvas2.drawLine((int) AndroidUtilities.dpf2(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) ((AndroidUtilities.dp(7.0f) * f12) + AndroidUtilities.dpf2(7.0f)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(7.0f) * f12)), org.telegram.ui.ActionBar.i6.f20994o0);
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void setDisabled(boolean z10) {
        this.f24111n = z10;
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
