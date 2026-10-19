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
public final class ac1 extends View {
    public org.telegram.ui.Components.e11 f35335a;
    public org.telegram.ui.Components.e11 f35336b;
    public boolean f35337c;
    public final org.telegram.ui.Components.f6 d;
    public final org.telegram.ui.Cells.z e;
    public final ColorMatrixColorFilter f35338f;
    public final Paint h;
    public final Paint f35339n;
    public final kc1 f35340r;

    public ac1(Context context, kc1 kc1Var) {
        super(context);
        this.f35340r = kc1Var;
        this.d = new org.telegram.ui.Components.f6(this, 0L, 350L, org.telegram.ui.Components.bs.h);
        org.telegram.ui.Cells.z Z = org.telegram.ui.ActionBar.h6.Z(285212671, 8, 8);
        this.e = Z;
        this.h = new Paint(1);
        this.f35339n = new Paint(1);
        Z.setCallback(this);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.35f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
        this.f35338f = new ColorMatrixColorFilter(colorMatrix);
    }

    public final CharSequence b() {
        org.telegram.ui.Components.e11 e11Var = this.f35335a;
        if (e11Var != null) {
            return e11Var.k();
        }
        return null;
    }

    public final void c(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        boolean z11;
        if (spannableStringBuilder != null) {
            this.f35336b = new org.telegram.ui.Components.e11(spannableStringBuilder, 12.0f, null);
        }
        if (spannableStringBuilder != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f35337c = z11;
        if (!z10) {
            this.d.f(z11, true);
        }
        invalidate();
    }

    public final void d(CharSequence charSequence) {
        this.f35335a = new org.telegram.ui.Components.e11(charSequence, 14.0f, AndroidUtilities.bold());
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float height = getHeight() / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        kc1 kc1Var = this.f35340r;
        zb1 zb1Var = kc1Var.f38572x0;
        kb1 kb1Var = kc1Var.f38510a;
        org.telegram.ui.ActionBar.h6.s(this, zb1Var, kb1Var);
        Paint n10 = kb1Var.n("paintChatActionBackground");
        ColorFilter colorFilter = n10.getColorFilter();
        n10.setColorFilter(this.f35338f);
        canvas.drawRoundRect(rectF, height, height, n10);
        n10.setColorFilter(colorFilter);
        if (kc1Var.M1) {
            float f7 = kc1Var.f38549n1;
            if (f7 > 0.0f) {
                int o10 = i0.a.o(-16777216, (int) (f7 * 255.0f * kc1Var.f38551o1));
                Paint paint = this.f35339n;
                paint.setColor(o10);
                canvas.drawRoundRect(rectF, height, height, paint);
            }
        }
        Paint paint2 = this.h;
        paint2.setColor(520093695);
        canvas.drawRoundRect(rectF, height, height, paint2);
        float e = this.d.e(this.f35337c);
        org.telegram.ui.Components.e11 e11Var = this.f35335a;
        if (e11Var != null) {
            e11Var.f25738p = getWidth() - AndroidUtilities.dp(14.0f);
            e11Var.c((getWidth() - this.f35335a.l()) / 2.0f, ((AndroidUtilities.dp(24.0f) * 0.0f) + (getHeight() / 2.0f)) - (AndroidUtilities.dp(7.0f) * e), 1.0f, -1, canvas);
        }
        if (this.f35336b != null) {
            canvas.save();
            canvas.scale(e, e, getWidth() / 2.0f, (getHeight() / 2.0f) + AndroidUtilities.dp(11.0f));
            org.telegram.ui.Components.e11 e11Var2 = this.f35336b;
            e11Var2.f25738p = getWidth() - AndroidUtilities.dp(14.0f);
            float dp = 0.0f * AndroidUtilities.dp(24.0f);
            e11Var2.c((getWidth() - this.f35336b.l()) / 2.0f, AndroidUtilities.dp(11.0f) + dp + (getHeight() / 2.0f), 1.0f, org.telegram.ui.ActionBar.h6.m1(0.75f, -1), canvas);
            canvas.restore();
        }
        int width = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Cells.z zVar = this.e;
        zVar.setBounds(0, 0, width, height2);
        zVar.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.z zVar = this.e;
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
        if (drawable != this.e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
