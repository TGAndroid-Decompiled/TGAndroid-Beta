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
public final class fc0 extends View {
    public final o6 f24208a;
    public final bc0 f24209b;
    public boolean f24210c;
    public boolean d;
    public final String e;
    public final String f24211f;
    public final int h;

    public fc0(Context context, int i10, String str, int i11, String str2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f24210c = true;
        this.e = str;
        this.f24211f = str2;
        setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19148i6, d6Var), 2, -1));
        o6 o6Var = new o6(true, true, true, false);
        this.f24208a = o6Var;
        o6Var.k(0.35f, 300L, sr.h);
        o6Var.t(AndroidUtilities.dp(16.0f));
        o6Var.r(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, d6Var));
        o6Var.setCallback(this);
        o6Var.n(!LocaleController.isRTL);
        if (LocaleController.isRTL) {
            o6Var.f26962b = 5;
        }
        TextPaint textPaint = o6Var.f26961a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + AndroidUtilities.dp(77.0f));
        this.h = max;
        o6Var.G = max;
        bc0 bc0Var = new bc0(0);
        jj0 jj0Var = new jj0(i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        bc0Var.f22971c = jj0Var;
        jj0Var.R(this);
        jj0Var.J(true);
        jj0Var.h = true;
        jj0Var.K(0);
        jj0 jj0Var2 = new jj0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        bc0Var.d = jj0Var2;
        jj0Var2.R(this);
        jj0Var2.J(true);
        jj0Var2.h = true;
        jj0Var2.K(0);
        bc0Var.e = jj0Var;
        this.f24209b = bc0Var;
        bc0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.F8, d6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void a(boolean z10, boolean z11) {
        String str;
        boolean z12;
        jj0 jj0Var;
        if (!this.f24210c && z10 == this.d) {
            return;
        }
        this.d = z10;
        if (z10) {
            str = this.e;
        } else {
            str = this.f24211f;
        }
        if (z11 && !LocaleController.isRTL) {
            z12 = true;
        } else {
            z12 = false;
        }
        o6 o6Var = this.f24208a;
        o6Var.q(str, z12, true);
        bc0 bc0Var = this.f24209b;
        jj0 jj0Var2 = (jj0) bc0Var.d;
        jj0 jj0Var3 = (jj0) bc0Var.f22971c;
        bc0Var.f22970b = z10;
        if (z11) {
            if (z10) {
                jj0Var = jj0Var3;
            } else {
                jj0Var = jj0Var2;
            }
            bc0Var.e = jj0Var;
            jj0Var3.M(0);
            jj0Var2.M(0);
            ((jj0) bc0Var.e).start();
        } else {
            if (z10) {
                jj0Var2 = jj0Var3;
            }
            bc0Var.e = jj0Var2;
            jj0Var2.M(jj0Var2.e[0] - 1);
        }
        this.f24210c = false;
        setContentDescription(o6Var.f26965g);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = LocaleController.isRTL;
        o6 o6Var = this.f24208a;
        bc0 bc0Var = this.f24209b;
        if (z10) {
            bc0Var.setBounds(getMeasuredWidth() - AndroidUtilities.dp(41.0f), org.telegram.messenger.ok.A(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - AndroidUtilities.dp(17.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            o6Var.setBounds(0, 0, getMeasuredWidth() - AndroidUtilities.dp(59.0f), getMeasuredHeight());
        } else {
            bc0Var.setBounds(AndroidUtilities.dp(17.0f), org.telegram.messenger.ok.A(24.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(41.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            o6Var.setBounds(AndroidUtilities.dp(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        o6Var.draw(canvas);
        bc0Var.draw(canvas);
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
        if (drawable != this.f24208a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
