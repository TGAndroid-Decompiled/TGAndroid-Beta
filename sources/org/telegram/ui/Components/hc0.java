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
public final class hc0 extends View {
    public final o6 f24808a;
    public final dc0 f24809b;
    public boolean f24810c;
    public boolean d;
    public final String e;
    public final String f24811f;
    public final int h;

    public hc0(Context context, int i10, String str, int i11, String str2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f24810c = true;
        this.e = str;
        this.f24811f = str2;
        setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19165i6, d6Var), 2, -1));
        o6 o6Var = new o6(true, true, true, false);
        this.f24808a = o6Var;
        o6Var.k(0.35f, 300L, tr.h);
        o6Var.t(AndroidUtilities.dp(16.0f));
        o6Var.r(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, d6Var));
        o6Var.setCallback(this);
        o6Var.n(!LocaleController.isRTL);
        if (LocaleController.isRTL) {
            o6Var.f26991b = 5;
        }
        TextPaint textPaint = o6Var.f26990a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + AndroidUtilities.dp(77.0f));
        this.h = max;
        o6Var.G = max;
        dc0 dc0Var = new dc0(0);
        lj0 lj0Var = new lj0(i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        dc0Var.f23608c = lj0Var;
        lj0Var.R(this);
        lj0Var.J(true);
        lj0Var.h = true;
        lj0Var.K(0);
        lj0 lj0Var2 = new lj0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        dc0Var.d = lj0Var2;
        lj0Var2.R(this);
        lj0Var2.J(true);
        lj0Var2.h = true;
        lj0Var2.K(0);
        dc0Var.e = lj0Var;
        this.f24809b = dc0Var;
        dc0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.F8, d6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void a(boolean z10, boolean z11) {
        String str;
        boolean z12;
        lj0 lj0Var;
        if (!this.f24810c && z10 == this.d) {
            return;
        }
        this.d = z10;
        if (z10) {
            str = this.e;
        } else {
            str = this.f24811f;
        }
        if (z11 && !LocaleController.isRTL) {
            z12 = true;
        } else {
            z12 = false;
        }
        o6 o6Var = this.f24808a;
        o6Var.q(str, z12, true);
        dc0 dc0Var = this.f24809b;
        lj0 lj0Var2 = (lj0) dc0Var.d;
        lj0 lj0Var3 = (lj0) dc0Var.f23608c;
        dc0Var.f23607b = z10;
        if (z11) {
            if (z10) {
                lj0Var = lj0Var3;
            } else {
                lj0Var = lj0Var2;
            }
            dc0Var.e = lj0Var;
            lj0Var3.M(0);
            lj0Var2.M(0);
            ((lj0) dc0Var.e).start();
        } else {
            if (z10) {
                lj0Var2 = lj0Var3;
            }
            dc0Var.e = lj0Var2;
            lj0Var2.M(lj0Var2.e[0] - 1);
        }
        this.f24810c = false;
        setContentDescription(o6Var.f26994g);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = LocaleController.isRTL;
        o6 o6Var = this.f24808a;
        dc0 dc0Var = this.f24809b;
        if (z10) {
            dc0Var.setBounds(getMeasuredWidth() - AndroidUtilities.dp(41.0f), org.telegram.messenger.ok.A(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - AndroidUtilities.dp(17.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            o6Var.setBounds(0, 0, getMeasuredWidth() - AndroidUtilities.dp(59.0f), getMeasuredHeight());
        } else {
            dc0Var.setBounds(AndroidUtilities.dp(17.0f), org.telegram.messenger.ok.A(24.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(41.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            o6Var.setBounds(AndroidUtilities.dp(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        o6Var.draw(canvas);
        dc0Var.draw(canvas);
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
        if (drawable != this.f24808a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
