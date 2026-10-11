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
    public org.telegram.ui.Components.n11 f39913a;
    public org.telegram.ui.Components.n11 f39914b;
    public boolean f39915c;
    public final org.telegram.ui.Components.g6 d;
    public final org.telegram.ui.Cells.z f39916e;
    public final ColorMatrixColorFilter f39917f;
    public final Paint h;
    public final Paint f39918n;
    public final wd1 f39919r;

    public md1(Context context, wd1 wd1Var) {
        super(context);
        this.f39919r = wd1Var;
        this.d = new org.telegram.ui.Components.g6(this, 0L, 350L, org.telegram.ui.Components.is.h);
        org.telegram.ui.Cells.z Z = org.telegram.ui.ActionBar.h6.Z(285212671, 8, 8);
        this.f39916e = Z;
        this.h = new Paint(1);
        this.f39918n = new Paint(1);
        Z.setCallback(this);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.35f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
        this.f39917f = new ColorMatrixColorFilter(colorMatrix);
    }

    public final CharSequence b() {
        org.telegram.ui.Components.n11 n11Var = this.f39913a;
        if (n11Var != null) {
            return n11Var.k();
        }
        return null;
    }

    public final void c(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        boolean z11;
        if (spannableStringBuilder != null) {
            this.f39914b = new org.telegram.ui.Components.n11(spannableStringBuilder, 12.0f, null);
        }
        if (spannableStringBuilder != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f39915c = z11;
        if (!z10) {
            this.d.f(z11, true);
        }
        invalidate();
    }

    public final void d(CharSequence charSequence) {
        this.f39913a = new org.telegram.ui.Components.n11(charSequence, 14.0f, AndroidUtilities.bold());
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float height = getHeight() / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        wd1 wd1Var = this.f39919r;
        ld1 ld1Var = wd1Var.f43388x0;
        wc1 wc1Var = wd1Var.f43325a;
        org.telegram.ui.ActionBar.h6.s(this, ld1Var, wc1Var);
        Paint F = wc1Var.F("paintChatActionBackground");
        ColorFilter colorFilter = F.getColorFilter();
        F.setColorFilter(this.f39917f);
        canvas.drawRoundRect(rectF, height, height, F);
        F.setColorFilter(colorFilter);
        if (wd1Var.M1) {
            float f7 = wd1Var.f43365n1;
            if (f7 > 0.0f) {
                int k10 = i0.a.k(-16777216, (int) (f7 * 255.0f * wd1Var.f43367o1));
                Paint paint = this.f39918n;
                paint.setColor(k10);
                canvas.drawRoundRect(rectF, height, height, paint);
            }
        }
        Paint paint2 = this.h;
        paint2.setColor(520093695);
        canvas.drawRoundRect(rectF, height, height, paint2);
        float e7 = this.d.e(this.f39915c);
        org.telegram.ui.Components.n11 n11Var = this.f39913a;
        if (n11Var != null) {
            n11Var.f28913p = getWidth() - AndroidUtilities.dp(14.0f);
            n11Var.c((getWidth() - this.f39913a.l()) / 2.0f, ((AndroidUtilities.dp(24.0f) * 0.0f) + (getHeight() / 2.0f)) - (AndroidUtilities.dp(7.0f) * e7), 1.0f, -1, canvas);
        }
        if (this.f39914b != null) {
            canvas.save();
            canvas.scale(e7, e7, getWidth() / 2.0f, (getHeight() / 2.0f) + AndroidUtilities.dp(11.0f));
            org.telegram.ui.Components.n11 n11Var2 = this.f39914b;
            n11Var2.f28913p = getWidth() - AndroidUtilities.dp(14.0f);
            float dp = 0.0f * AndroidUtilities.dp(24.0f);
            n11Var2.c((getWidth() - this.f39914b.l()) / 2.0f, AndroidUtilities.dp(11.0f) + dp + (getHeight() / 2.0f), 1.0f, org.telegram.ui.ActionBar.h6.m1(0.75f, -1), canvas);
            canvas.restore();
        }
        int width = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Cells.z zVar = this.f39916e;
        zVar.setBounds(0, 0, width, height2);
        zVar.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.z zVar = this.f39916e;
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
        if (drawable != this.f39916e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
