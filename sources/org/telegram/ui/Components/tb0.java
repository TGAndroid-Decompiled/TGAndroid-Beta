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
public final class tb0 extends View {
    public final o6 f28140a;
    public final pb0 f28141b;
    public boolean f28142c;
    public boolean d;
    public final String e;
    public final String f28143f;
    public final int h;

    public tb0(Context context, int i10, String str, int i11, String str2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f28142c = true;
        this.e = str;
        this.f28143f = str2;
        setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18878i6, d6Var), 2, -1));
        o6 o6Var = new o6(true, true, true, false);
        this.f28140a = o6Var;
        o6Var.k(0.35f, 300L, rr.h);
        o6Var.t(AndroidUtilities.dp(16.0f));
        o6Var.r(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, d6Var));
        o6Var.setCallback(this);
        o6Var.n(!LocaleController.isRTL);
        if (LocaleController.isRTL) {
            o6Var.f26614b = 5;
        }
        TextPaint textPaint = o6Var.f26613a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + AndroidUtilities.dp(77.0f));
        this.h = max;
        o6Var.G = max;
        pb0 pb0Var = new pb0(0);
        yi0 yi0Var = new yi0(i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        pb0Var.f26998c = yi0Var;
        yi0Var.R(this);
        yi0Var.J(true);
        yi0Var.h = true;
        yi0Var.K(0);
        yi0 yi0Var2 = new yi0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        pb0Var.d = yi0Var2;
        yi0Var2.R(this);
        yi0Var2.J(true);
        yi0Var2.h = true;
        yi0Var2.K(0);
        pb0Var.e = yi0Var;
        this.f28141b = pb0Var;
        pb0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.F8, d6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void a(boolean z10, boolean z11) {
        String str;
        boolean z12;
        yi0 yi0Var;
        if (!this.f28142c && z10 == this.d) {
            return;
        }
        this.d = z10;
        if (z10) {
            str = this.e;
        } else {
            str = this.f28143f;
        }
        if (z11 && !LocaleController.isRTL) {
            z12 = true;
        } else {
            z12 = false;
        }
        o6 o6Var = this.f28140a;
        o6Var.q(str, z12, true);
        pb0 pb0Var = this.f28141b;
        yi0 yi0Var2 = (yi0) pb0Var.d;
        yi0 yi0Var3 = (yi0) pb0Var.f26998c;
        pb0Var.f26997b = z10;
        if (z11) {
            if (z10) {
                yi0Var = yi0Var3;
            } else {
                yi0Var = yi0Var2;
            }
            pb0Var.e = yi0Var;
            yi0Var3.M(0);
            yi0Var2.M(0);
            ((yi0) pb0Var.e).start();
        } else {
            if (z10) {
                yi0Var2 = yi0Var3;
            }
            pb0Var.e = yi0Var2;
            yi0Var2.M(yi0Var2.e[0] - 1);
        }
        this.f28142c = false;
        setContentDescription(o6Var.f26617g);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = LocaleController.isRTL;
        o6 o6Var = this.f28140a;
        pb0 pb0Var = this.f28141b;
        if (z10) {
            pb0Var.setBounds(getMeasuredWidth() - AndroidUtilities.dp(41.0f), org.telegram.messenger.ul.y(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - AndroidUtilities.dp(17.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            o6Var.setBounds(0, 0, getMeasuredWidth() - AndroidUtilities.dp(59.0f), getMeasuredHeight());
        } else {
            pb0Var.setBounds(AndroidUtilities.dp(17.0f), org.telegram.messenger.ul.y(24.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(41.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            o6Var.setBounds(AndroidUtilities.dp(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        o6Var.draw(canvas);
        pb0Var.draw(canvas);
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
        if (drawable != this.f28140a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
