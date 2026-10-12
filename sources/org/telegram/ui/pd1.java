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
public final class pd1 extends View {
    public org.telegram.ui.Components.r11 f40926a;
    public org.telegram.ui.Components.r11 f40927b;
    public boolean f40928c;
    public final org.telegram.ui.Components.g6 d;
    public final org.telegram.ui.Cells.z f40929e;
    public final ColorMatrixColorFilter f40930f;
    public final Paint h;
    public final Paint f40931n;
    public final zd1 f40932r;

    public pd1(Context context, zd1 zd1Var) {
        super(context);
        this.f40932r = zd1Var;
        this.d = new org.telegram.ui.Components.g6(this, 0L, 350L, org.telegram.ui.Components.js.h);
        org.telegram.ui.Cells.z Z = org.telegram.ui.ActionBar.h6.Z(285212671, 8, 8);
        this.f40929e = Z;
        this.h = new Paint(1);
        this.f40931n = new Paint(1);
        Z.setCallback(this);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.35f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
        this.f40930f = new ColorMatrixColorFilter(colorMatrix);
    }

    public final CharSequence b() {
        org.telegram.ui.Components.r11 r11Var = this.f40926a;
        if (r11Var != null) {
            return r11Var.k();
        }
        return null;
    }

    public final void c(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        boolean z11;
        if (spannableStringBuilder != null) {
            this.f40927b = new org.telegram.ui.Components.r11(spannableStringBuilder, 12.0f, null);
        }
        if (spannableStringBuilder != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f40928c = z11;
        if (!z10) {
            this.d.f(z11, true);
        }
        invalidate();
    }

    public final void d(CharSequence charSequence) {
        this.f40926a = new org.telegram.ui.Components.r11(charSequence, 14.0f, AndroidUtilities.bold());
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float height = getHeight() / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        zd1 zd1Var = this.f40932r;
        od1 od1Var = zd1Var.f44797x0;
        zc1 zc1Var = zd1Var.f44734a;
        org.telegram.ui.ActionBar.h6.s(this, od1Var, zc1Var);
        Paint G = zc1Var.G("paintChatActionBackground");
        ColorFilter colorFilter = G.getColorFilter();
        G.setColorFilter(this.f40930f);
        canvas.drawRoundRect(rectF, height, height, G);
        G.setColorFilter(colorFilter);
        if (zd1Var.M1) {
            float f7 = zd1Var.f44774n1;
            if (f7 > 0.0f) {
                int k10 = i0.a.k(-16777216, (int) (f7 * 255.0f * zd1Var.f44776o1));
                Paint paint = this.f40931n;
                paint.setColor(k10);
                canvas.drawRoundRect(rectF, height, height, paint);
            }
        }
        Paint paint2 = this.h;
        paint2.setColor(520093695);
        canvas.drawRoundRect(rectF, height, height, paint2);
        float e7 = this.d.e(this.f40928c);
        org.telegram.ui.Components.r11 r11Var = this.f40926a;
        if (r11Var != null) {
            r11Var.f30000p = getWidth() - AndroidUtilities.dp(14.0f);
            r11Var.c((getWidth() - this.f40926a.l()) / 2.0f, ((AndroidUtilities.dp(24.0f) * 0.0f) + (getHeight() / 2.0f)) - (AndroidUtilities.dp(7.0f) * e7), 1.0f, -1, canvas);
        }
        if (this.f40927b != null) {
            canvas.save();
            canvas.scale(e7, e7, getWidth() / 2.0f, (getHeight() / 2.0f) + AndroidUtilities.dp(11.0f));
            org.telegram.ui.Components.r11 r11Var2 = this.f40927b;
            r11Var2.f30000p = getWidth() - AndroidUtilities.dp(14.0f);
            float dp = 0.0f * AndroidUtilities.dp(24.0f);
            r11Var2.c((getWidth() - this.f40927b.l()) / 2.0f, AndroidUtilities.dp(11.0f) + dp + (getHeight() / 2.0f), 1.0f, org.telegram.ui.ActionBar.h6.m1(0.75f, -1), canvas);
            canvas.restore();
        }
        int width = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Cells.z zVar = this.f40929e;
        zVar.setBounds(0, 0, width, height2);
        zVar.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.z zVar = this.f40929e;
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
        if (drawable != this.f40929e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
