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
public final class xb0 extends View {
    public final j6 f33017a;
    public final tb0 f33018b;
    public boolean f33019c;
    public boolean d;
    public final String f33020e;
    public final String f33021f;
    public final int h;

    public xb0(Context context, int i10, String str, int i11, String str2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f33019c = true;
        this.f33020e = str;
        this.f33021f = str2;
        setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21750i6, g6Var), 2, -1));
        j6 j6Var = new j6(true, true, true, false);
        this.f33017a = j6Var;
        j6Var.k(0.35f, 300L, pr.h);
        j6Var.t(AndroidUtilities.dp(16.0f));
        j6Var.r(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.E8, g6Var));
        j6Var.setCallback(this);
        j6Var.n(!LocaleController.isRTL);
        if (LocaleController.isRTL) {
            j6Var.f28029b = 5;
        }
        TextPaint textPaint = j6Var.f28028a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + AndroidUtilities.dp(77.0f));
        this.h = max;
        j6Var.G = max;
        tb0 tb0Var = new tb0(0);
        ij0 ij0Var = new ij0(i10, AndroidUtilities.dp(24.0f), l.d.j(i10, ""), AndroidUtilities.dp(24.0f));
        tb0Var.f31314c = ij0Var;
        ij0Var.f27835s0 = this;
        ij0Var.H(true);
        ij0Var.h = true;
        ij0Var.I(0);
        ij0 ij0Var2 = new ij0(i11, AndroidUtilities.dp(24.0f), l.d.j(i11, ""), AndroidUtilities.dp(24.0f));
        tb0Var.d = ij0Var2;
        ij0Var2.f27835s0 = this;
        ij0Var2.H(true);
        ij0Var2.h = true;
        ij0Var2.I(0);
        tb0Var.f31315e = ij0Var;
        this.f33018b = tb0Var;
        tb0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.F8, g6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void a(boolean z4, boolean z10) {
        String str;
        boolean z11;
        ij0 ij0Var;
        if (!this.f33019c && z4 == this.d) {
            return;
        }
        this.d = z4;
        if (z4) {
            str = this.f33020e;
        } else {
            str = this.f33021f;
        }
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        j6 j6Var = this.f33017a;
        j6Var.q(str, z11, true);
        tb0 tb0Var = this.f33018b;
        ij0 ij0Var2 = (ij0) tb0Var.d;
        ij0 ij0Var3 = (ij0) tb0Var.f31314c;
        tb0Var.f31313b = z4;
        if (z10) {
            if (z4) {
                ij0Var = ij0Var3;
            } else {
                ij0Var = ij0Var2;
            }
            tb0Var.f31315e = ij0Var;
            ij0Var3.K(0);
            ij0Var2.K(0);
            ((ij0) tb0Var.f31315e).start();
        } else {
            if (z4) {
                ij0Var2 = ij0Var3;
            }
            tb0Var.f31315e = ij0Var2;
            ij0Var2.K(ij0Var2.f27817e[0] - 1);
        }
        this.f33019c = false;
        setContentDescription(j6Var.f28033g);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z4 = LocaleController.isRTL;
        j6 j6Var = this.f33017a;
        tb0 tb0Var = this.f33018b;
        if (z4) {
            tb0Var.setBounds(getMeasuredWidth() - AndroidUtilities.dp(41.0f), org.telegram.ui.b.x(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - AndroidUtilities.dp(17.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            j6Var.setBounds(0, 0, getMeasuredWidth() - AndroidUtilities.dp(59.0f), getMeasuredHeight());
        } else {
            tb0Var.setBounds(AndroidUtilities.dp(17.0f), org.telegram.ui.b.x(24.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(41.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            j6Var.setBounds(AndroidUtilities.dp(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        j6Var.draw(canvas);
        tb0Var.draw(canvas);
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
        if (drawable != this.f33017a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
