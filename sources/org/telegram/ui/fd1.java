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
public final class fd1 extends View {
    public org.telegram.ui.Components.v01 f33521a;
    public org.telegram.ui.Components.v01 f33522b;
    public boolean f33523c;
    public final org.telegram.ui.Components.e6 d;
    public final org.telegram.ui.Cells.z e;
    public final ColorMatrixColorFilter f33524f;
    public final Paint h;
    public final Paint f33525n;
    public final pd1 f33526r;

    public fd1(Context context, pd1 pd1Var) {
        super(context);
        this.f33526r = pd1Var;
        this.d = new org.telegram.ui.Components.e6(this, 0L, 350L, org.telegram.ui.Components.sr.h);
        org.telegram.ui.Cells.z Y = org.telegram.ui.ActionBar.i6.Y(285212671, 8, 8);
        this.e = Y;
        this.h = new Paint(1);
        this.f33525n = new Paint(1);
        Y.setCallback(this);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.35f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
        this.f33524f = new ColorMatrixColorFilter(colorMatrix);
    }

    public final CharSequence b() {
        org.telegram.ui.Components.v01 v01Var = this.f33521a;
        if (v01Var != null) {
            return v01Var.k();
        }
        return null;
    }

    public final void c(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        boolean z11;
        if (spannableStringBuilder != null) {
            this.f33522b = new org.telegram.ui.Components.v01(spannableStringBuilder, 12.0f, null);
        }
        if (spannableStringBuilder != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f33523c = z11;
        if (!z10) {
            this.d.f(z11, true);
        }
        invalidate();
    }

    public final void d(CharSequence charSequence) {
        this.f33521a = new org.telegram.ui.Components.v01(charSequence, 14.0f, AndroidUtilities.bold());
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float height = getHeight() / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        pd1 pd1Var = this.f33526r;
        ed1 ed1Var = pd1Var.f36452x0;
        pc1 pc1Var = pd1Var.f36390a;
        org.telegram.ui.ActionBar.i6.s(this, ed1Var, pc1Var);
        Paint G = pc1Var.G("paintChatActionBackground");
        ColorFilter colorFilter = G.getColorFilter();
        G.setColorFilter(this.f33524f);
        canvas.drawRoundRect(rectF, height, height, G);
        G.setColorFilter(colorFilter);
        if (pd1Var.M1) {
            float f7 = pd1Var.f36429n1;
            if (f7 > 0.0f) {
                int k10 = i0.a.k(-16777216, (int) (f7 * 255.0f * pd1Var.f36431o1));
                Paint paint = this.f33525n;
                paint.setColor(k10);
                canvas.drawRoundRect(rectF, height, height, paint);
            }
        }
        Paint paint2 = this.h;
        paint2.setColor(520093695);
        canvas.drawRoundRect(rectF, height, height, paint2);
        float e = this.d.e(this.f33523c);
        org.telegram.ui.Components.v01 v01Var = this.f33521a;
        if (v01Var != null) {
            v01Var.f28997p = getWidth() - AndroidUtilities.dp(14.0f);
            v01Var.c((getWidth() - this.f33521a.l()) / 2.0f, ((AndroidUtilities.dp(24.0f) * 0.0f) + (getHeight() / 2.0f)) - (AndroidUtilities.dp(7.0f) * e), 1.0f, -1, canvas);
        }
        if (this.f33522b != null) {
            canvas.save();
            canvas.scale(e, e, getWidth() / 2.0f, (getHeight() / 2.0f) + AndroidUtilities.dp(11.0f));
            org.telegram.ui.Components.v01 v01Var2 = this.f33522b;
            v01Var2.f28997p = getWidth() - AndroidUtilities.dp(14.0f);
            float dp = 0.0f * AndroidUtilities.dp(24.0f);
            v01Var2.c((getWidth() - this.f33522b.l()) / 2.0f, AndroidUtilities.dp(11.0f) + dp + (getHeight() / 2.0f), 1.0f, org.telegram.ui.ActionBar.i6.l1(0.75f, -1), canvas);
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
