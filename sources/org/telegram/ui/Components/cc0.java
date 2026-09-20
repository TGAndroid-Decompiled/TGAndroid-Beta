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
public final class cc0 extends View {
    public final n6 f23232a;
    public final yb0 f23233b;
    public boolean f23234c;
    public boolean d;
    public final String e;
    public final String f23235f;
    public final int h;

    public cc0(Context context, int i10, String str, int i11, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f23234c = true;
        this.e = str;
        this.f23235f = str2;
        setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19184i6, f6Var), 2, -1));
        n6 n6Var = new n6(true, true, true, false);
        this.f23232a = n6Var;
        n6Var.k(0.35f, 300L, qr.h);
        n6Var.t(AndroidUtilities.dp(16.0f));
        n6Var.r(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var));
        n6Var.setCallback(this);
        n6Var.n(!LocaleController.isRTL);
        if (LocaleController.isRTL) {
            n6Var.f26575b = 5;
        }
        TextPaint textPaint = n6Var.f26574a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + AndroidUtilities.dp(77.0f));
        this.h = max;
        n6Var.G = max;
        yb0 yb0Var = new yb0(0);
        hj0 hj0Var = new hj0(i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        yb0Var.f30495c = hj0Var;
        hj0Var.R(this);
        hj0Var.J(true);
        hj0Var.h = true;
        hj0Var.K(0);
        hj0 hj0Var2 = new hj0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        yb0Var.d = hj0Var2;
        hj0Var2.R(this);
        hj0Var2.J(true);
        hj0Var2.h = true;
        hj0Var2.K(0);
        yb0Var.e = hj0Var;
        this.f23233b = yb0Var;
        yb0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, f6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void a(boolean z10, boolean z11) {
        String str;
        boolean z12;
        hj0 hj0Var;
        if (!this.f23234c && z10 == this.d) {
            return;
        }
        this.d = z10;
        if (z10) {
            str = this.e;
        } else {
            str = this.f23235f;
        }
        if (z11 && !LocaleController.isRTL) {
            z12 = true;
        } else {
            z12 = false;
        }
        n6 n6Var = this.f23232a;
        n6Var.q(str, z12, true);
        yb0 yb0Var = this.f23233b;
        hj0 hj0Var2 = (hj0) yb0Var.d;
        hj0 hj0Var3 = (hj0) yb0Var.f30495c;
        yb0Var.f30494b = z10;
        if (z11) {
            if (z10) {
                hj0Var = hj0Var3;
            } else {
                hj0Var = hj0Var2;
            }
            yb0Var.e = hj0Var;
            hj0Var3.M(0);
            hj0Var2.M(0);
            ((hj0) yb0Var.e).start();
        } else {
            if (z10) {
                hj0Var2 = hj0Var3;
            }
            yb0Var.e = hj0Var2;
            hj0Var2.M(hj0Var2.e[0] - 1);
        }
        this.f23234c = false;
        setContentDescription(n6Var.f26578g);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = LocaleController.isRTL;
        n6 n6Var = this.f23232a;
        yb0 yb0Var = this.f23233b;
        if (z10) {
            yb0Var.setBounds(getMeasuredWidth() - AndroidUtilities.dp(41.0f), org.telegram.messenger.rk.z(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - AndroidUtilities.dp(17.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            n6Var.setBounds(0, 0, getMeasuredWidth() - AndroidUtilities.dp(59.0f), getMeasuredHeight());
        } else {
            yb0Var.setBounds(AndroidUtilities.dp(17.0f), org.telegram.messenger.rk.z(24.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(41.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            n6Var.setBounds(AndroidUtilities.dp(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        n6Var.draw(canvas);
        yb0Var.draw(canvas);
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
        if (drawable != this.f23232a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
