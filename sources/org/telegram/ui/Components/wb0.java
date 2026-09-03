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
public final class wb0 extends View {
    public final j6 f30202a;
    public final sb0 f30203b;
    public boolean f30204c;
    public boolean d;
    public final String e;
    public final String f30205f;
    public final int h;

    public wb0(Context context, int i10, String str, int i11, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f30204c = true;
        this.e = str;
        this.f30205f = str2;
        setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19971i6, f6Var), 2, -1));
        j6 j6Var = new j6(true, true, true, false);
        this.f30202a = j6Var;
        j6Var.k(0.35f, 300L, mr.h);
        j6Var.t(AndroidUtilities.dp(16.0f));
        j6Var.r(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var));
        j6Var.setCallback(this);
        j6Var.n(!LocaleController.isRTL);
        if (LocaleController.isRTL) {
            j6Var.f25847b = 5;
        }
        TextPaint textPaint = j6Var.f25846a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + AndroidUtilities.dp(77.0f));
        this.h = max;
        j6Var.G = max;
        sb0 sb0Var = new sb0(0);
        gj0 gj0Var = new gj0(i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        sb0Var.f28720c = gj0Var;
        gj0Var.f25176s0 = this;
        gj0Var.H(true);
        gj0Var.h = true;
        gj0Var.I(0);
        gj0 gj0Var2 = new gj0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        sb0Var.d = gj0Var2;
        gj0Var2.f25176s0 = this;
        gj0Var2.H(true);
        gj0Var2.h = true;
        gj0Var2.I(0);
        sb0Var.e = gj0Var;
        this.f30203b = sb0Var;
        sb0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, f6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void a(boolean z4, boolean z10) {
        String str;
        boolean z11;
        gj0 gj0Var;
        if (!this.f30204c && z4 == this.d) {
            return;
        }
        this.d = z4;
        if (z4) {
            str = this.e;
        } else {
            str = this.f30205f;
        }
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        j6 j6Var = this.f30202a;
        j6Var.q(str, z11, true);
        sb0 sb0Var = this.f30203b;
        gj0 gj0Var2 = (gj0) sb0Var.d;
        gj0 gj0Var3 = (gj0) sb0Var.f28720c;
        sb0Var.f28719b = z4;
        if (z10) {
            if (z4) {
                gj0Var = gj0Var3;
            } else {
                gj0Var = gj0Var2;
            }
            sb0Var.e = gj0Var;
            gj0Var3.K(0);
            gj0Var2.K(0);
            ((gj0) sb0Var.e).start();
        } else {
            if (z4) {
                gj0Var2 = gj0Var3;
            }
            sb0Var.e = gj0Var2;
            gj0Var2.K(gj0Var2.e[0] - 1);
        }
        this.f30204c = false;
        setContentDescription(j6Var.f25850g);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z4 = LocaleController.isRTL;
        j6 j6Var = this.f30202a;
        sb0 sb0Var = this.f30203b;
        if (z4) {
            sb0Var.setBounds(getMeasuredWidth() - AndroidUtilities.dp(41.0f), org.telegram.ui.b.x(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - AndroidUtilities.dp(17.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            j6Var.setBounds(0, 0, getMeasuredWidth() - AndroidUtilities.dp(59.0f), getMeasuredHeight());
        } else {
            sb0Var.setBounds(AndroidUtilities.dp(17.0f), org.telegram.ui.b.x(24.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(41.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            j6Var.setBounds(AndroidUtilities.dp(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        j6Var.draw(canvas);
        sb0Var.draw(canvas);
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
        if (drawable != this.f30202a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
