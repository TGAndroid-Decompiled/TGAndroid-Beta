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
    public final j6 f33011a;
    public final tb0 f33012b;
    public boolean f33013c;
    public boolean d;
    public final String f33014e;
    public final String f33015f;
    public final int h;

    public xb0(Context context, int i10, String str, int i11, String str2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f33013c = true;
        this.f33014e = str;
        this.f33015f = str2;
        setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21752i6, g6Var), 2, -1));
        j6 j6Var = new j6(true, true, true, false);
        this.f33011a = j6Var;
        j6Var.k(0.35f, 300L, pr.h);
        j6Var.t(AndroidUtilities.dp(16.0f));
        j6Var.r(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.E8, g6Var));
        j6Var.setCallback(this);
        j6Var.n(!LocaleController.isRTL);
        if (LocaleController.isRTL) {
            j6Var.f27999b = 5;
        }
        TextPaint textPaint = j6Var.f27998a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + AndroidUtilities.dp(77.0f));
        this.h = max;
        j6Var.G = max;
        tb0 tb0Var = new tb0(0);
        hj0 hj0Var = new hj0(i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        tb0Var.f31329c = hj0Var;
        hj0Var.f27542s0 = this;
        hj0Var.H(true);
        hj0Var.h = true;
        hj0Var.I(0);
        hj0 hj0Var2 = new hj0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        tb0Var.d = hj0Var2;
        hj0Var2.f27542s0 = this;
        hj0Var2.H(true);
        hj0Var2.h = true;
        hj0Var2.I(0);
        tb0Var.f31330e = hj0Var;
        this.f33012b = tb0Var;
        tb0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.F8, g6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void a(boolean z4, boolean z10) {
        String str;
        boolean z11;
        hj0 hj0Var;
        if (!this.f33013c && z4 == this.d) {
            return;
        }
        this.d = z4;
        if (z4) {
            str = this.f33014e;
        } else {
            str = this.f33015f;
        }
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        j6 j6Var = this.f33011a;
        j6Var.q(str, z11, true);
        tb0 tb0Var = this.f33012b;
        hj0 hj0Var2 = (hj0) tb0Var.d;
        hj0 hj0Var3 = (hj0) tb0Var.f31329c;
        tb0Var.f31328b = z4;
        if (z10) {
            if (z4) {
                hj0Var = hj0Var3;
            } else {
                hj0Var = hj0Var2;
            }
            tb0Var.f31330e = hj0Var;
            hj0Var3.K(0);
            hj0Var2.K(0);
            ((hj0) tb0Var.f31330e).start();
        } else {
            if (z4) {
                hj0Var2 = hj0Var3;
            }
            tb0Var.f31330e = hj0Var2;
            hj0Var2.K(hj0Var2.f27524e[0] - 1);
        }
        this.f33013c = false;
        setContentDescription(j6Var.f28003g);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z4 = LocaleController.isRTL;
        j6 j6Var = this.f33011a;
        tb0 tb0Var = this.f33012b;
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
        if (drawable != this.f33011a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
