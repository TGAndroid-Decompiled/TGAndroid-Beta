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
public final class gc1 extends View {
    public org.telegram.ui.Components.zz0 f38554a;
    public org.telegram.ui.Components.zz0 f38555b;
    public boolean f38556c;
    public final org.telegram.ui.Components.d6 d;
    public final org.telegram.ui.Cells.z f38557e;
    public final ColorMatrixColorFilter f38558f;
    public final Paint h;
    public final Paint f38559n;
    public final qc1 f38560r;

    public gc1(Context context, qc1 qc1Var) {
        super(context);
        this.f38560r = qc1Var;
        this.d = new org.telegram.ui.Components.d6(this, 0L, 350L, org.telegram.ui.Components.jr.h);
        org.telegram.ui.Cells.z Y = org.telegram.ui.ActionBar.g6.Y(285212671, 8, 8);
        this.f38557e = Y;
        this.h = new Paint(1);
        this.f38559n = new Paint(1);
        Y.setCallback(this);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.35f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
        this.f38558f = new ColorMatrixColorFilter(colorMatrix);
    }

    public final CharSequence b() {
        org.telegram.ui.Components.zz0 zz0Var = this.f38554a;
        if (zz0Var != null) {
            return zz0Var.k();
        }
        return null;
    }

    public final void c(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        boolean z11;
        if (spannableStringBuilder != null) {
            this.f38555b = new org.telegram.ui.Components.zz0(spannableStringBuilder, 12.0f, null);
        }
        if (spannableStringBuilder != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f38556c = z11;
        if (!z10) {
            this.d.f(z11, true);
        }
        invalidate();
    }

    public final void d(CharSequence charSequence) {
        this.f38554a = new org.telegram.ui.Components.zz0(charSequence, 14.0f, AndroidUtilities.bold());
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float height = getHeight() / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        qc1 qc1Var = this.f38560r;
        fc1 fc1Var = qc1Var.f41672t0;
        pb1 pb1Var = qc1Var.f41623a;
        org.telegram.ui.ActionBar.g6.s(this, fc1Var, pb1Var);
        Paint G = pb1Var.G("paintChatActionBackground");
        ColorFilter colorFilter = G.getColorFilter();
        G.setColorFilter(this.f38558f);
        canvas.drawRoundRect(rectF, height, height, G);
        G.setColorFilter(colorFilter);
        if (qc1Var.I1) {
            float f9 = qc1Var.f41652j1;
            if (f9 > 0.0f) {
                int k9 = i0.a.k(-16777216, (int) (f9 * 255.0f * qc1Var.f41654k1));
                Paint paint = this.f38559n;
                paint.setColor(k9);
                canvas.drawRoundRect(rectF, height, height, paint);
            }
        }
        Paint paint2 = this.h;
        paint2.setColor(520093695);
        canvas.drawRoundRect(rectF, height, height, paint2);
        float e10 = this.d.e(this.f38556c);
        org.telegram.ui.Components.zz0 zz0Var = this.f38554a;
        if (zz0Var != null) {
            zz0Var.f35473p = getWidth() - AndroidUtilities.dp(14.0f);
            zz0Var.c((getWidth() - this.f38554a.l()) / 2.0f, ((AndroidUtilities.dp(24.0f) * 0.0f) + (getHeight() / 2.0f)) - (AndroidUtilities.dp(7.0f) * e10), 1.0f, -1, canvas);
        }
        if (this.f38555b != null) {
            canvas.save();
            canvas.scale(e10, e10, getWidth() / 2.0f, (getHeight() / 2.0f) + AndroidUtilities.dp(11.0f));
            org.telegram.ui.Components.zz0 zz0Var2 = this.f38555b;
            zz0Var2.f35473p = getWidth() - AndroidUtilities.dp(14.0f);
            float dp = 0.0f * AndroidUtilities.dp(24.0f);
            zz0Var2.c((getWidth() - this.f38555b.l()) / 2.0f, AndroidUtilities.dp(11.0f) + dp + (getHeight() / 2.0f), 1.0f, org.telegram.ui.ActionBar.g6.l1(0.75f, -1), canvas);
            canvas.restore();
        }
        int width = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Cells.z zVar = this.f38557e;
        zVar.setBounds(0, 0, width, height2);
        zVar.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.z zVar = this.f38557e;
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
        if (drawable != this.f38557e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
