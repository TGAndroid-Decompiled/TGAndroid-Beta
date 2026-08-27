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

public final class dc1 extends View {

    public org.telegram.ui.Components.pz0 f37353a;

    public org.telegram.ui.Components.pz0 f37354b;

    public boolean f37355c;
    public final org.telegram.ui.Components.y5 d;

    public final org.telegram.ui.Cells.z f37356e;

    public final ColorMatrixColorFilter f37357f;
    public final Paint h;

    public final Paint f37358n;

    public final nc1 f37359r;

    public dc1(Context context, nc1 nc1Var) {
        super(context);
        this.f37359r = nc1Var;
        this.d = new org.telegram.ui.Components.y5(this, 0L, 350L, org.telegram.ui.Components.er.h);
        org.telegram.ui.Cells.z zVarY = org.telegram.ui.ActionBar.g6.Y(285212671, 8, 8);
        this.f37356e = zVarY;
        this.h = new Paint(1);
        this.f37358n = new Paint(1);
        zVarY.setCallback(this);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.35f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
        this.f37357f = new ColorMatrixColorFilter(colorMatrix);
    }

    public final CharSequence b() {
        org.telegram.ui.Components.pz0 pz0Var = this.f37353a;
        if (pz0Var != null) {
            return pz0Var.k();
        }
        return null;
    }

    public final void c(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        if (spannableStringBuilder != null) {
            this.f37354b = new org.telegram.ui.Components.pz0(spannableStringBuilder, 12.0f, null);
        }
        boolean z11 = spannableStringBuilder != null;
        this.f37355c = z11;
        if (!z10) {
            this.d.f(z11, true);
        }
        invalidate();
    }

    public final void d(CharSequence charSequence) {
        this.f37353a = new org.telegram.ui.Components.pz0(charSequence, 14.0f, AndroidUtilities.bold());
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float height = getHeight() / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        nc1 nc1Var = this.f37359r;
        cc1 cc1Var = nc1Var.f40784t0;
        mb1 mb1Var = nc1Var.f40735a;
        org.telegram.ui.ActionBar.g6.s(this, cc1Var, mb1Var);
        Paint paintN = mb1Var.N("paintChatActionBackground");
        ColorFilter colorFilter = paintN.getColorFilter();
        paintN.setColorFilter(this.f37357f);
        canvas.drawRoundRect(rectF, height, height, paintN);
        paintN.setColorFilter(colorFilter);
        if (nc1Var.I1) {
            float f10 = nc1Var.f40764j1;
            if (f10 > 0.0f) {
                int iK = i0.b.k(-16777216, (int) (f10 * 255.0f * nc1Var.f40766k1));
                Paint paint = this.f37358n;
                paint.setColor(iK);
                canvas.drawRoundRect(rectF, height, height, paint);
            }
        }
        Paint paint2 = this.h;
        paint2.setColor(520093695);
        canvas.drawRoundRect(rectF, height, height, paint2);
        float fE = this.d.e(this.f37355c);
        org.telegram.ui.Components.pz0 pz0Var = this.f37353a;
        if (pz0Var != null) {
            pz0Var.f31708p = getWidth() - AndroidUtilities.dp(14.0f);
            pz0Var.c((getWidth() - this.f37353a.l()) / 2.0f, ((AndroidUtilities.dp(24.0f) * 0.0f) + (getHeight() / 2.0f)) - (AndroidUtilities.dp(7.0f) * fE), 1.0f, -1, canvas);
        }
        if (this.f37354b != null) {
            canvas.save();
            canvas.scale(fE, fE, getWidth() / 2.0f, (getHeight() / 2.0f) + AndroidUtilities.dp(11.0f));
            org.telegram.ui.Components.pz0 pz0Var2 = this.f37354b;
            pz0Var2.f31708p = getWidth() - AndroidUtilities.dp(14.0f);
            pz0Var2.c((getWidth() - this.f37354b.l()) / 2.0f, AndroidUtilities.dp(11.0f) + (0.0f * AndroidUtilities.dp(24.0f)) + (getHeight() / 2.0f), 1.0f, org.telegram.ui.ActionBar.g6.l1(0.75f, -1), canvas);
            canvas.restore();
        }
        int width = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Cells.z zVar = this.f37356e;
        zVar.setBounds(0, 0, width, height2);
        zVar.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.z zVar = this.f37356e;
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
        return super.onTouchEvent(motionEvent) || z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f37356e || super.verifyDrawable(drawable);
    }
}
