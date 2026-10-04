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
public final class hd1 extends View {
    public org.telegram.ui.Components.e11 f37040a;
    public org.telegram.ui.Components.e11 f37041b;
    public boolean f37042c;
    public final org.telegram.ui.Components.e6 d;
    public final org.telegram.ui.Cells.z f37043e;
    public final ColorMatrixColorFilter f37044f;
    public final Paint h;
    public final Paint f37045n;
    public final rd1 f37046r;

    public hd1(Context context, rd1 rd1Var) {
        super(context);
        this.f37046r = rd1Var;
        this.d = new org.telegram.ui.Components.e6(this, 0L, 350L, org.telegram.ui.Components.tr.h);
        org.telegram.ui.Cells.z Y = org.telegram.ui.ActionBar.i6.Y(285212671, 8, 8);
        this.f37043e = Y;
        this.h = new Paint(1);
        this.f37045n = new Paint(1);
        Y.setCallback(this);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.35f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
        this.f37044f = new ColorMatrixColorFilter(colorMatrix);
    }

    public final CharSequence b() {
        org.telegram.ui.Components.e11 e11Var = this.f37040a;
        if (e11Var != null) {
            return e11Var.k();
        }
        return null;
    }

    public final void c(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        boolean z11;
        if (spannableStringBuilder != null) {
            this.f37041b = new org.telegram.ui.Components.e11(spannableStringBuilder, 12.0f, null);
        }
        if (spannableStringBuilder != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f37042c = z11;
        if (!z10) {
            this.d.f(z11, true);
        }
        invalidate();
    }

    public final void d(CharSequence charSequence) {
        this.f37040a = new org.telegram.ui.Components.e11(charSequence, 14.0f, AndroidUtilities.bold());
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float height = getHeight() / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        rd1 rd1Var = this.f37046r;
        gd1 gd1Var = rd1Var.f40094x0;
        rc1 rc1Var = rd1Var.f40031a;
        org.telegram.ui.ActionBar.i6.s(this, gd1Var, rc1Var);
        Paint H = rc1Var.H("paintChatActionBackground");
        ColorFilter colorFilter = H.getColorFilter();
        H.setColorFilter(this.f37044f);
        canvas.drawRoundRect(rectF, height, height, H);
        H.setColorFilter(colorFilter);
        if (rd1Var.M1) {
            float f7 = rd1Var.f40071n1;
            if (f7 > 0.0f) {
                int k10 = i0.a.k(-16777216, (int) (f7 * 255.0f * rd1Var.f40073o1));
                Paint paint = this.f37045n;
                paint.setColor(k10);
                canvas.drawRoundRect(rectF, height, height, paint);
            }
        }
        Paint paint2 = this.h;
        paint2.setColor(520093695);
        canvas.drawRoundRect(rectF, height, height, paint2);
        float e7 = this.d.e(this.f37042c);
        org.telegram.ui.Components.e11 e11Var = this.f37040a;
        if (e11Var != null) {
            e11Var.f25889p = getWidth() - AndroidUtilities.dp(14.0f);
            e11Var.c((getWidth() - this.f37040a.l()) / 2.0f, ((AndroidUtilities.dp(24.0f) * 0.0f) + (getHeight() / 2.0f)) - (AndroidUtilities.dp(7.0f) * e7), 1.0f, -1, canvas);
        }
        if (this.f37041b != null) {
            canvas.save();
            canvas.scale(e7, e7, getWidth() / 2.0f, (getHeight() / 2.0f) + AndroidUtilities.dp(11.0f));
            org.telegram.ui.Components.e11 e11Var2 = this.f37041b;
            e11Var2.f25889p = getWidth() - AndroidUtilities.dp(14.0f);
            float dp = 0.0f * AndroidUtilities.dp(24.0f);
            e11Var2.c((getWidth() - this.f37041b.l()) / 2.0f, AndroidUtilities.dp(11.0f) + dp + (getHeight() / 2.0f), 1.0f, org.telegram.ui.ActionBar.i6.l1(0.75f, -1), canvas);
            canvas.restore();
        }
        int width = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Cells.z zVar = this.f37043e;
        zVar.setBounds(0, 0, width, height2);
        zVar.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.z zVar = this.f37043e;
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
        if (drawable != this.f37043e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
