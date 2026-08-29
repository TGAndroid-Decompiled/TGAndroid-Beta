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
public final class qb0 extends View {
    public final n6 f31886a;
    public final mb0 f31887b;
    public boolean f31888c;
    public boolean d;
    public final String f31889e;
    public final String f31890f;
    public final int h;

    public qb0(Context context, int i10, String str, int i11, String str2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f31888c = true;
        this.f31889e = str;
        this.f31890f = str2;
        setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, c6Var), 2, -1));
        n6 n6Var = new n6(true, true, true, false);
        this.f31886a = n6Var;
        n6Var.k(0.35f, 300L, jr.h);
        n6Var.t(AndroidUtilities.dp(16.0f));
        n6Var.r(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var));
        n6Var.setCallback(this);
        n6Var.n(!LocaleController.isRTL);
        if (LocaleController.isRTL) {
            n6Var.f30862b = 5;
        }
        TextPaint textPaint = n6Var.f30861a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + AndroidUtilities.dp(77.0f));
        this.h = max;
        n6Var.G = max;
        mb0 mb0Var = new mb0(0);
        xi0 xi0Var = new xi0(i10, AndroidUtilities.dp(24.0f), j7.l1.k(i10, ""), AndroidUtilities.dp(24.0f));
        mb0Var.f30642c = xi0Var;
        xi0Var.f34753r0 = this;
        xi0Var.H(true);
        xi0Var.h = true;
        xi0Var.I(0);
        xi0 xi0Var2 = new xi0(i11, AndroidUtilities.dp(24.0f), j7.l1.k(i11, ""), AndroidUtilities.dp(24.0f));
        mb0Var.d = xi0Var2;
        xi0Var2.f34753r0 = this;
        xi0Var2.H(true);
        xi0Var2.h = true;
        xi0Var2.I(0);
        mb0Var.f30643e = xi0Var;
        this.f31887b = mb0Var;
        mb0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.F8, c6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void a(boolean z10, boolean z11) {
        String str;
        boolean z12;
        xi0 xi0Var;
        if (!this.f31888c && z10 == this.d) {
            return;
        }
        this.d = z10;
        if (z10) {
            str = this.f31889e;
        } else {
            str = this.f31890f;
        }
        if (z11 && !LocaleController.isRTL) {
            z12 = true;
        } else {
            z12 = false;
        }
        n6 n6Var = this.f31886a;
        n6Var.q(str, z12, true);
        mb0 mb0Var = this.f31887b;
        xi0 xi0Var2 = (xi0) mb0Var.d;
        xi0 xi0Var3 = (xi0) mb0Var.f30642c;
        mb0Var.f30641b = z10;
        if (z11) {
            if (z10) {
                xi0Var = xi0Var3;
            } else {
                xi0Var = xi0Var2;
            }
            mb0Var.f30643e = xi0Var;
            xi0Var3.K(0);
            xi0Var2.K(0);
            ((xi0) mb0Var.f30643e).start();
        } else {
            if (z10) {
                xi0Var2 = xi0Var3;
            }
            mb0Var.f30643e = xi0Var2;
            xi0Var2.K(xi0Var2.f34737e[0] - 1);
        }
        this.f31888c = false;
        setContentDescription(n6Var.f30866g);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = LocaleController.isRTL;
        n6 n6Var = this.f31886a;
        mb0 mb0Var = this.f31887b;
        if (z10) {
            mb0Var.setBounds(getMeasuredWidth() - AndroidUtilities.dp(41.0f), org.telegram.ui.b.x(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - AndroidUtilities.dp(17.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            n6Var.setBounds(0, 0, getMeasuredWidth() - AndroidUtilities.dp(59.0f), getMeasuredHeight());
        } else {
            mb0Var.setBounds(AndroidUtilities.dp(17.0f), org.telegram.ui.b.x(24.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(41.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            n6Var.setBounds(AndroidUtilities.dp(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        n6Var.draw(canvas);
        mb0Var.draw(canvas);
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
        if (drawable != this.f31886a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
