package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class vc0 extends View {
    public final q6 f31739a;
    public final rc0 f31740b;
    public boolean f31741c;
    public boolean d;
    public final String f31742e;
    public final String f31743f;
    public final int h;

    public vc0(Context context, int i10, String str, int i11, String str2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f31741c = true;
        this.f31742e = str;
        this.f31743f = str2;
        setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20877i6, d6Var), 2, -1));
        q6 q6Var = new q6(true, true, true);
        this.f31739a = q6Var;
        q6Var.n(0.35f, 300L, is.h);
        q6Var.w(AndroidUtilities.dp(16.0f));
        q6Var.u(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, d6Var));
        q6Var.setCallback(this);
        q6Var.q(!LocaleController.isRTL);
        if (LocaleController.isRTL) {
            q6Var.f30019b = 5;
        }
        TextPaint textPaint = q6Var.f30017a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + AndroidUtilities.dp(77.0f));
        this.h = max;
        q6Var.M = max;
        rc0 rc0Var = new rc0(0);
        ek0 ek0Var = new ek0(i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        rc0Var.f30441c = ek0Var;
        ek0Var.R(this);
        ek0Var.J(true);
        ek0Var.h = true;
        ek0Var.K(0);
        ek0 ek0Var2 = new ek0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        rc0Var.d = ek0Var2;
        ek0Var2.R(this);
        ek0Var2.J(true);
        ek0Var2.h = true;
        ek0Var2.K(0);
        rc0Var.f30442e = ek0Var;
        this.f31740b = rc0Var;
        rc0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.F8, d6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void a(boolean z10, boolean z11) {
        String str;
        boolean z12;
        ek0 ek0Var;
        if (!this.f31741c && z10 == this.d) {
            return;
        }
        this.d = z10;
        if (z10) {
            str = this.f31742e;
        } else {
            str = this.f31743f;
        }
        if (z11 && !LocaleController.isRTL) {
            z12 = true;
        } else {
            z12 = false;
        }
        q6 q6Var = this.f31739a;
        q6Var.t(str, z12, true);
        rc0 rc0Var = this.f31740b;
        ek0 ek0Var2 = (ek0) rc0Var.d;
        ek0 ek0Var3 = (ek0) rc0Var.f30441c;
        rc0Var.f30440b = z10;
        if (z11) {
            if (z10) {
                ek0Var = ek0Var3;
            } else {
                ek0Var = ek0Var2;
            }
            rc0Var.f30442e = ek0Var;
            ek0Var3.M(0);
            ek0Var2.M(0);
            ((ek0) rc0Var.f30442e).start();
        } else {
            if (z10) {
                ek0Var2 = ek0Var3;
            }
            rc0Var.f30442e = ek0Var2;
            ek0Var2.M(ek0Var2.f26043e[0] - 1);
        }
        this.f31741c = false;
        setContentDescription(q6Var.f30025i);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = LocaleController.isRTL;
        q6 q6Var = this.f31739a;
        rc0 rc0Var = this.f31740b;
        if (z10) {
            rc0Var.setBounds(getMeasuredWidth() - AndroidUtilities.dp(41.0f), org.telegram.messenger.ai.A(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - AndroidUtilities.dp(17.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            q6Var.setBounds(0, 0, getMeasuredWidth() - AndroidUtilities.dp(59.0f), getMeasuredHeight());
        } else {
            rc0Var.setBounds(AndroidUtilities.dp(17.0f), org.telegram.messenger.ai.A(24.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(41.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            q6Var.setBounds(AndroidUtilities.dp(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        q6Var.draw(canvas);
        rc0Var.draw(canvas);
    }

    public boolean getState() {
        return this.d;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int min;
        int mode = View.MeasureSpec.getMode(i10);
        int i12 = this.h;
        if (mode == 1073741824) {
            min = Math.max(View.MeasureSpec.getSize(i10), i12);
        } else {
            min = Math.min(View.MeasureSpec.getSize(i10), i12);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, mode), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getVisibility() == 0 && getAlpha() >= 0.5f) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f31739a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
