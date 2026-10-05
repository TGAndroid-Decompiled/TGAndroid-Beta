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
    public org.telegram.ui.Components.f11 f36275a;
    public org.telegram.ui.Components.f11 f36276b;
    public boolean f36277c;
    public final org.telegram.ui.Components.e6 d;
    public final org.telegram.ui.Cells.z f36278e;
    public final ColorMatrixColorFilter f36279f;
    public final Paint h;
    public final Paint f36280n;
    public final pd1 f36281r;

    public fd1(Context context, pd1 pd1Var) {
        super(context);
        this.f36281r = pd1Var;
        this.d = new org.telegram.ui.Components.e6(this, 0L, 350L, org.telegram.ui.Components.tr.h);
        org.telegram.ui.Cells.z Y = org.telegram.ui.ActionBar.i6.Y(285212671, 8, 8);
        this.f36278e = Y;
        this.h = new Paint(1);
        this.f36280n = new Paint(1);
        Y.setCallback(this);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.35f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
        this.f36279f = new ColorMatrixColorFilter(colorMatrix);
    }

    public final CharSequence b() {
        org.telegram.ui.Components.f11 f11Var = this.f36275a;
        if (f11Var != null) {
            return f11Var.k();
        }
        return null;
    }

    public final void c(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        boolean z11;
        if (spannableStringBuilder != null) {
            this.f36276b = new org.telegram.ui.Components.f11(spannableStringBuilder, 12.0f, null);
        }
        if (spannableStringBuilder != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f36277c = z11;
        if (!z10) {
            this.d.f(z11, true);
        }
        invalidate();
    }

    public final void d(CharSequence charSequence) {
        this.f36275a = new org.telegram.ui.Components.f11(charSequence, 14.0f, AndroidUtilities.bold());
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float height = getHeight() / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        pd1 pd1Var = this.f36281r;
        ed1 ed1Var = pd1Var.f39550x0;
        pc1 pc1Var = pd1Var.f39487a;
        org.telegram.ui.ActionBar.i6.s(this, ed1Var, pc1Var);
        Paint H = pc1Var.H("paintChatActionBackground");
        ColorFilter colorFilter = H.getColorFilter();
        H.setColorFilter(this.f36279f);
        canvas.drawRoundRect(rectF, height, height, H);
        H.setColorFilter(colorFilter);
        if (pd1Var.M1) {
            float f7 = pd1Var.f39527n1;
            if (f7 > 0.0f) {
                int k10 = i0.a.k(-16777216, (int) (f7 * 255.0f * pd1Var.f39529o1));
                Paint paint = this.f36280n;
                paint.setColor(k10);
                canvas.drawRoundRect(rectF, height, height, paint);
            }
        }
        Paint paint2 = this.h;
        paint2.setColor(520093695);
        canvas.drawRoundRect(rectF, height, height, paint2);
        float e7 = this.d.e(this.f36277c);
        org.telegram.ui.Components.f11 f11Var = this.f36275a;
        if (f11Var != null) {
            f11Var.f26277p = getWidth() - AndroidUtilities.dp(14.0f);
            f11Var.c((getWidth() - this.f36275a.l()) / 2.0f, ((AndroidUtilities.dp(24.0f) * 0.0f) + (getHeight() / 2.0f)) - (AndroidUtilities.dp(7.0f) * e7), 1.0f, -1, canvas);
        }
        if (this.f36276b != null) {
            canvas.save();
            canvas.scale(e7, e7, getWidth() / 2.0f, (getHeight() / 2.0f) + AndroidUtilities.dp(11.0f));
            org.telegram.ui.Components.f11 f11Var2 = this.f36276b;
            f11Var2.f26277p = getWidth() - AndroidUtilities.dp(14.0f);
            float dp = 0.0f * AndroidUtilities.dp(24.0f);
            f11Var2.c((getWidth() - this.f36276b.l()) / 2.0f, AndroidUtilities.dp(11.0f) + dp + (getHeight() / 2.0f), 1.0f, org.telegram.ui.ActionBar.i6.l1(0.75f, -1), canvas);
            canvas.restore();
        }
        int width = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Cells.z zVar = this.f36278e;
        zVar.setBounds(0, 0, width, height2);
        zVar.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.z zVar = this.f36278e;
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
        if (drawable != this.f36278e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
