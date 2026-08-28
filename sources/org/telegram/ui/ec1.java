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
public final class ec1 extends View {
    public org.telegram.ui.Components.nz0 f37899a;
    public org.telegram.ui.Components.nz0 f37900b;
    public boolean f37901c;
    public final org.telegram.ui.Components.y5 d;
    public final org.telegram.ui.Cells.z f37902e;
    public final ColorMatrixColorFilter f37903f;
    public final Paint h;
    public final Paint f37904n;
    public final oc1 f37905r;

    public ec1(Context context, oc1 oc1Var) {
        super(context);
        this.f37905r = oc1Var;
        this.d = new org.telegram.ui.Components.y5(this, 0L, 350L, org.telegram.ui.Components.gr.h);
        org.telegram.ui.Cells.z Y = org.telegram.ui.ActionBar.f6.Y(285212671, 8, 8);
        this.f37902e = Y;
        this.h = new Paint(1);
        this.f37904n = new Paint(1);
        Y.setCallback(this);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.35f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
        this.f37903f = new ColorMatrixColorFilter(colorMatrix);
    }

    public final CharSequence b() {
        org.telegram.ui.Components.nz0 nz0Var = this.f37899a;
        if (nz0Var != null) {
            return nz0Var.k();
        }
        return null;
    }

    public final void c(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        boolean z11;
        if (spannableStringBuilder != null) {
            this.f37900b = new org.telegram.ui.Components.nz0(spannableStringBuilder, 12.0f, null);
        }
        if (spannableStringBuilder != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f37901c = z11;
        if (!z10) {
            this.d.f(z11, true);
        }
        invalidate();
    }

    public final void d(CharSequence charSequence) {
        this.f37899a = new org.telegram.ui.Components.nz0(charSequence, 14.0f, AndroidUtilities.bold());
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float height = getHeight() / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        oc1 oc1Var = this.f37905r;
        dc1 dc1Var = oc1Var.f41105t0;
        ob1 ob1Var = oc1Var.f41056a;
        org.telegram.ui.ActionBar.f6.s(this, dc1Var, ob1Var);
        Paint O = ob1Var.O("paintChatActionBackground");
        ColorFilter colorFilter = O.getColorFilter();
        O.setColorFilter(this.f37903f);
        canvas.drawRoundRect(rectF, height, height, O);
        O.setColorFilter(colorFilter);
        if (oc1Var.I1) {
            float f10 = oc1Var.f41085j1;
            if (f10 > 0.0f) {
                int k10 = i0.a.k(-16777216, (int) (f10 * 255.0f * oc1Var.f41087k1));
                Paint paint = this.f37904n;
                paint.setColor(k10);
                canvas.drawRoundRect(rectF, height, height, paint);
            }
        }
        Paint paint2 = this.h;
        paint2.setColor(520093695);
        canvas.drawRoundRect(rectF, height, height, paint2);
        float e10 = this.d.e(this.f37901c);
        org.telegram.ui.Components.nz0 nz0Var = this.f37899a;
        if (nz0Var != null) {
            nz0Var.f31234p = getWidth() - AndroidUtilities.dp(14.0f);
            nz0Var.c((getWidth() - this.f37899a.l()) / 2.0f, ((AndroidUtilities.dp(24.0f) * 0.0f) + (getHeight() / 2.0f)) - (AndroidUtilities.dp(7.0f) * e10), 1.0f, -1, canvas);
        }
        if (this.f37900b != null) {
            canvas.save();
            canvas.scale(e10, e10, getWidth() / 2.0f, (getHeight() / 2.0f) + AndroidUtilities.dp(11.0f));
            org.telegram.ui.Components.nz0 nz0Var2 = this.f37900b;
            nz0Var2.f31234p = getWidth() - AndroidUtilities.dp(14.0f);
            float dp = 0.0f * AndroidUtilities.dp(24.0f);
            nz0Var2.c((getWidth() - this.f37900b.l()) / 2.0f, AndroidUtilities.dp(11.0f) + dp + (getHeight() / 2.0f), 1.0f, org.telegram.ui.ActionBar.f6.l1(0.75f, -1), canvas);
            canvas.restore();
        }
        int width = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Cells.z zVar = this.f37902e;
        zVar.setBounds(0, 0, width, height2);
        zVar.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.z zVar = this.f37902e;
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
        if (drawable != this.f37902e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
