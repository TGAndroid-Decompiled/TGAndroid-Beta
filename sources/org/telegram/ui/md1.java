package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class md1 extends View {
    public org.telegram.ui.Components.f01 f38669a;
    public org.telegram.ui.Components.f01 f38670b;
    public boolean f38671c;
    public final org.telegram.ui.Components.e6 d;
    public final org.telegram.ui.Cells.z f38672e;
    public final ColorMatrixColorFilter f38673f;
    public final Paint h;
    public final Paint f38674n;
    public final wd1 f38675r;

    public md1(Context context, wd1 wd1Var) {
        super(context);
        this.f38675r = wd1Var;
        this.d = new org.telegram.ui.Components.e6(this, 0L, 350L, org.telegram.ui.Components.pr.h);
        org.telegram.ui.Cells.z Y = org.telegram.ui.ActionBar.j6.Y(285212671, 8, 8);
        this.f38672e = Y;
        this.h = new Paint(1);
        this.f38674n = new Paint(1);
        Y.setCallback(this);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.35f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
        this.f38673f = new ColorMatrixColorFilter(colorMatrix);
    }

    public final CharSequence b() {
        org.telegram.ui.Components.f01 f01Var = this.f38669a;
        if (f01Var != null) {
            return f01Var.k();
        }
        return null;
    }

    public final void c(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        boolean z11;
        if (spannableStringBuilder != null) {
            this.f38670b = new org.telegram.ui.Components.f01(spannableStringBuilder, 12.0f, null);
        }
        if (spannableStringBuilder != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f38671c = z11;
        if (!z10) {
            this.d.f(z11, true);
        }
        invalidate();
    }

    public final void d(CharSequence charSequence) {
        this.f38669a = new org.telegram.ui.Components.f01(charSequence, 14.0f, AndroidUtilities.bold());
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float height = getHeight() / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        wd1 wd1Var = this.f38675r;
        ld1 ld1Var = wd1Var.f41977x0;
        wc1 wc1Var = wd1Var.f41914a;
        org.telegram.ui.ActionBar.j6.s(this, ld1Var, wc1Var);
        Paint G = wc1Var.G("paintChatActionBackground");
        ColorFilter colorFilter = G.getColorFilter();
        G.setColorFilter(this.f38673f);
        canvas.drawRoundRect(rectF, height, height, G);
        G.setColorFilter(colorFilter);
        if (wd1Var.M1) {
            float f7 = wd1Var.f41954n1;
            if (f7 > 0.0f) {
                int k10 = i0.a.k(-16777216, (int) (f7 * 255.0f * wd1Var.f41956o1));
                Paint paint = this.f38674n;
                paint.setColor(k10);
                canvas.drawRoundRect(rectF, height, height, paint);
            }
        }
        Paint paint2 = this.h;
        paint2.setColor(520093695);
        canvas.drawRoundRect(rectF, height, height, paint2);
        float e7 = this.d.e(this.f38671c);
        org.telegram.ui.Components.f01 f01Var = this.f38669a;
        if (f01Var != null) {
            f01Var.f25858p = getWidth() - AndroidUtilities.dp(14.0f);
            f01Var.c((getWidth() - this.f38669a.l()) / 2.0f, ((AndroidUtilities.dp(24.0f) * 0.0f) + (getHeight() / 2.0f)) - (AndroidUtilities.dp(7.0f) * e7), 1.0f, -1, canvas);
        }
        if (this.f38670b != null) {
            canvas.save();
            canvas.scale(e7, e7, getWidth() / 2.0f, (getHeight() / 2.0f) + AndroidUtilities.dp(11.0f));
            org.telegram.ui.Components.f01 f01Var2 = this.f38670b;
            f01Var2.f25858p = getWidth() - AndroidUtilities.dp(14.0f);
            float dp = 0.0f * AndroidUtilities.dp(24.0f);
            f01Var2.c((getWidth() - this.f38670b.l()) / 2.0f, AndroidUtilities.dp(11.0f) + dp + (getHeight() / 2.0f), 1.0f, org.telegram.ui.ActionBar.j6.l1(0.75f, -1), canvas);
            canvas.restore();
        }
        int width = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Cells.z zVar = this.f38672e;
        zVar.setBounds(0, 0, width, height2);
        zVar.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.z zVar = this.f38672e;
        if (action == 0) {
            zVar.setHotspot(motionEvent.getX(), motionEvent.getY());
            zVar.setState(new int[]{16842910, 16842919});
            z10 = true;
        } else {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                zVar.setState(StateSet.NOTHING);
            }
            z10 = false;
        }
        if (super.onTouchEvent(motionEvent) || z10) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f38672e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
