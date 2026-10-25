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
public final class jc1 extends View {
    public org.telegram.ui.Components.q11 f40555a;
    public org.telegram.ui.Components.q11 f40556b;
    public boolean f40557c;
    public final org.telegram.ui.Components.h6 d;
    public final org.telegram.ui.Cells.y e;
    public final ColorMatrixColorFilter f40558f;
    public final Paint h;
    public final Paint f40559n;
    public final tc1 f40560r;

    public jc1(Context context, tc1 tc1Var) {
        super(context);
        this.f40560r = tc1Var;
        this.d = new org.telegram.ui.Components.h6(this, 0L, 350L, org.telegram.ui.Components.ds.h);
        org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.y6.Z(285212671, 8, 8);
        this.e = Z;
        this.h = new Paint(1);
        this.f40559n = new Paint(1);
        Z.setCallback(this);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.35f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
        this.f40558f = new ColorMatrixColorFilter(colorMatrix);
    }

    public final CharSequence b() {
        org.telegram.ui.Components.q11 q11Var = this.f40555a;
        if (q11Var != null) {
            return q11Var.k();
        }
        return null;
    }

    public final void c(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        boolean z11;
        if (spannableStringBuilder != null) {
            this.f40556b = new org.telegram.ui.Components.q11(spannableStringBuilder, 12.0f, null);
        }
        if (spannableStringBuilder != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f40557c = z11;
        if (!z10) {
            this.d.f(z11, true);
        }
        invalidate();
    }

    public final void d(CharSequence charSequence) {
        this.f40555a = new org.telegram.ui.Components.q11(charSequence, 14.0f, AndroidUtilities.bold());
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float height = getHeight() / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        tc1 tc1Var = this.f40560r;
        ic1 ic1Var = tc1Var.f43799y0;
        sb1 sb1Var = tc1Var.f43733a;
        org.telegram.ui.ActionBar.y6.s(this, ic1Var, sb1Var);
        Paint d = sb1Var.d("paintChatActionBackground");
        ColorFilter colorFilter = d.getColorFilter();
        d.setColorFilter(this.f40558f);
        canvas.drawRoundRect(rectF, height, height, d);
        d.setColorFilter(colorFilter);
        if (tc1Var.N1) {
            float f7 = tc1Var.f43775o1;
            if (f7 > 0.0f) {
                int o10 = i0.a.o(-16777216, (int) (f7 * 255.0f * tc1Var.f43777p1));
                Paint paint = this.f40559n;
                paint.setColor(o10);
                canvas.drawRoundRect(rectF, height, height, paint);
            }
        }
        Paint paint2 = this.h;
        paint2.setColor(520093695);
        canvas.drawRoundRect(rectF, height, height, paint2);
        float e = this.d.e(this.f40557c);
        org.telegram.ui.Components.q11 q11Var = this.f40555a;
        if (q11Var != null) {
            q11Var.f31798p = getWidth() - AndroidUtilities.dp(14.0f);
            q11Var.c((getWidth() - this.f40555a.l()) / 2.0f, ((AndroidUtilities.dp(24.0f) * 0.0f) + (getHeight() / 2.0f)) - (AndroidUtilities.dp(7.0f) * e), 1.0f, -1, canvas);
        }
        if (this.f40556b != null) {
            canvas.save();
            canvas.scale(e, e, getWidth() / 2.0f, (getHeight() / 2.0f) + AndroidUtilities.dp(11.0f));
            org.telegram.ui.Components.q11 q11Var2 = this.f40556b;
            q11Var2.f31798p = getWidth() - AndroidUtilities.dp(14.0f);
            float dp = 0.0f * AndroidUtilities.dp(24.0f);
            q11Var2.c((getWidth() - this.f40556b.l()) / 2.0f, AndroidUtilities.dp(11.0f) + dp + (getHeight() / 2.0f), 1.0f, org.telegram.ui.ActionBar.y6.o1(0.75f, -1), canvas);
            canvas.restore();
        }
        int width = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Cells.y yVar = this.e;
        yVar.setBounds(0, 0, width, height2);
        yVar.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.y yVar = this.e;
        if (action == 0) {
            yVar.setHotspot(motionEvent.getX(), motionEvent.getY());
            yVar.setState(new int[]{16842910, 16842919});
            z10 = true;
        } else {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                yVar.setState(StateSet.NOTHING);
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
