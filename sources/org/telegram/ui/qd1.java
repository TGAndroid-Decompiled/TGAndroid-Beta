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
public final class qd1 extends View {
    public org.telegram.ui.Components.t01 f36028a;
    public org.telegram.ui.Components.t01 f36029b;
    public boolean f36030c;
    public final org.telegram.ui.Components.d6 d;
    public final org.telegram.ui.Cells.z e;
    public final ColorMatrixColorFilter f36031f;
    public final Paint h;
    public final Paint f36032n;
    public final ae1 f36033r;

    public qd1(Context context, ae1 ae1Var) {
        super(context);
        this.f36033r = ae1Var;
        this.d = new org.telegram.ui.Components.d6(this, 0L, 350L, org.telegram.ui.Components.wr.h);
        org.telegram.ui.Cells.z Y = org.telegram.ui.ActionBar.j6.Y(285212671, 8, 8);
        this.e = Y;
        this.h = new Paint(1);
        this.f36032n = new Paint(1);
        Y.setCallback(this);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.35f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
        this.f36031f = new ColorMatrixColorFilter(colorMatrix);
    }

    public final CharSequence b() {
        org.telegram.ui.Components.t01 t01Var = this.f36028a;
        if (t01Var != null) {
            return t01Var.k();
        }
        return null;
    }

    public final void c(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        boolean z11;
        if (spannableStringBuilder != null) {
            this.f36029b = new org.telegram.ui.Components.t01(spannableStringBuilder, 12.0f, null);
        }
        if (spannableStringBuilder != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f36030c = z11;
        if (!z10) {
            this.d.f(z11, true);
        }
        invalidate();
    }

    public final void d(CharSequence charSequence) {
        this.f36028a = new org.telegram.ui.Components.t01(charSequence, 14.0f, AndroidUtilities.bold());
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float height = getHeight() / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        ae1 ae1Var = this.f36033r;
        pd1 pd1Var = ae1Var.f30976x0;
        ad1 ad1Var = ae1Var.f30914a;
        org.telegram.ui.ActionBar.j6.s(this, pd1Var, ad1Var);
        Paint F = ad1Var.F("paintChatActionBackground");
        ColorFilter colorFilter = F.getColorFilter();
        F.setColorFilter(this.f36031f);
        canvas.drawRoundRect(rectF, height, height, F);
        F.setColorFilter(colorFilter);
        if (ae1Var.M1) {
            float f7 = ae1Var.f30953n1;
            if (f7 > 0.0f) {
                int k10 = i0.a.k(-16777216, (int) (f7 * 255.0f * ae1Var.f30955o1));
                Paint paint = this.f36032n;
                paint.setColor(k10);
                canvas.drawRoundRect(rectF, height, height, paint);
            }
        }
        Paint paint2 = this.h;
        paint2.setColor(520093695);
        canvas.drawRoundRect(rectF, height, height, paint2);
        float e = this.d.e(this.f36030c);
        org.telegram.ui.Components.t01 t01Var = this.f36028a;
        if (t01Var != null) {
            t01Var.f27257p = getWidth() - AndroidUtilities.dp(14.0f);
            t01Var.c((getWidth() - this.f36028a.l()) / 2.0f, ((AndroidUtilities.dp(24.0f) * 0.0f) + (getHeight() / 2.0f)) - (AndroidUtilities.dp(7.0f) * e), 1.0f, -1, canvas);
        }
        if (this.f36029b != null) {
            canvas.save();
            canvas.scale(e, e, getWidth() / 2.0f, (getHeight() / 2.0f) + AndroidUtilities.dp(11.0f));
            org.telegram.ui.Components.t01 t01Var2 = this.f36029b;
            t01Var2.f27257p = getWidth() - AndroidUtilities.dp(14.0f);
            float dp = 0.0f * AndroidUtilities.dp(24.0f);
            t01Var2.c((getWidth() - this.f36029b.l()) / 2.0f, AndroidUtilities.dp(11.0f) + dp + (getHeight() / 2.0f), 1.0f, org.telegram.ui.ActionBar.j6.l1(0.75f, -1), canvas);
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
