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
public final class nd1 extends View {
    public org.telegram.ui.Components.l11 f40178a;
    public org.telegram.ui.Components.l11 f40179b;
    public boolean f40180c;
    public final org.telegram.ui.Components.g6 d;
    public final org.telegram.ui.Cells.z f40181e;
    public final ColorMatrixColorFilter f40182f;
    public final Paint h;
    public final Paint f40183n;
    public final xd1 f40184r;

    public nd1(Context context, xd1 xd1Var) {
        super(context);
        this.f40184r = xd1Var;
        this.d = new org.telegram.ui.Components.g6(this, 0L, 350L, org.telegram.ui.Components.hs.h);
        org.telegram.ui.Cells.z Z = org.telegram.ui.ActionBar.i6.Z(285212671, 8, 8);
        this.f40181e = Z;
        this.h = new Paint(1);
        this.f40183n = new Paint(1);
        Z.setCallback(this);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.35f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
        this.f40182f = new ColorMatrixColorFilter(colorMatrix);
    }

    public final CharSequence b() {
        org.telegram.ui.Components.l11 l11Var = this.f40178a;
        if (l11Var != null) {
            return l11Var.k();
        }
        return null;
    }

    public final void c(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        boolean z11;
        if (spannableStringBuilder != null) {
            this.f40179b = new org.telegram.ui.Components.l11(spannableStringBuilder, 12.0f, null);
        }
        if (spannableStringBuilder != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f40180c = z11;
        if (!z10) {
            this.d.f(z11, true);
        }
        invalidate();
    }

    public final void d(CharSequence charSequence) {
        this.f40178a = new org.telegram.ui.Components.l11(charSequence, 14.0f, AndroidUtilities.bold());
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float height = getHeight() / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        xd1 xd1Var = this.f40184r;
        md1 md1Var = xd1Var.f43998x0;
        xc1 xc1Var = xd1Var.f43935a;
        org.telegram.ui.ActionBar.i6.s(this, md1Var, xc1Var);
        Paint F = xc1Var.F("paintChatActionBackground");
        ColorFilter colorFilter = F.getColorFilter();
        F.setColorFilter(this.f40182f);
        canvas.drawRoundRect(rectF, height, height, F);
        F.setColorFilter(colorFilter);
        if (xd1Var.M1) {
            float f7 = xd1Var.f43975n1;
            if (f7 > 0.0f) {
                int k10 = i0.a.k(-16777216, (int) (f7 * 255.0f * xd1Var.f43977o1));
                Paint paint = this.f40183n;
                paint.setColor(k10);
                canvas.drawRoundRect(rectF, height, height, paint);
            }
        }
        Paint paint2 = this.h;
        paint2.setColor(520093695);
        canvas.drawRoundRect(rectF, height, height, paint2);
        float e7 = this.d.e(this.f40180c);
        org.telegram.ui.Components.l11 l11Var = this.f40178a;
        if (l11Var != null) {
            l11Var.f28233p = getWidth() - AndroidUtilities.dp(14.0f);
            l11Var.c((getWidth() - this.f40178a.l()) / 2.0f, ((AndroidUtilities.dp(24.0f) * 0.0f) + (getHeight() / 2.0f)) - (AndroidUtilities.dp(7.0f) * e7), 1.0f, -1, canvas);
        }
        if (this.f40179b != null) {
            canvas.save();
            canvas.scale(e7, e7, getWidth() / 2.0f, (getHeight() / 2.0f) + AndroidUtilities.dp(11.0f));
            org.telegram.ui.Components.l11 l11Var2 = this.f40179b;
            l11Var2.f28233p = getWidth() - AndroidUtilities.dp(14.0f);
            float dp = 0.0f * AndroidUtilities.dp(24.0f);
            l11Var2.c((getWidth() - this.f40179b.l()) / 2.0f, AndroidUtilities.dp(11.0f) + dp + (getHeight() / 2.0f), 1.0f, org.telegram.ui.ActionBar.i6.m1(0.75f, -1), canvas);
            canvas.restore();
        }
        int width = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Cells.z zVar = this.f40181e;
        zVar.setBounds(0, 0, width, height2);
        zVar.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.z zVar = this.f40181e;
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
        if (drawable != this.f40181e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
