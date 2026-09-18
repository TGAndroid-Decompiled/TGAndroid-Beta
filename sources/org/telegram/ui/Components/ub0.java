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
public final class ub0 extends View {
    public final m6 f28320a;
    public final qb0 f28321b;
    public boolean f28322c;
    public boolean d;
    public final String e;
    public final String f28323f;
    public final int h;

    public ub0(Context context, int i10, String str, int i11, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f28322c = true;
        this.e = str;
        this.f28323f = str2;
        setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18953i6, f6Var), 2, -1));
        m6 m6Var = new m6(true, true, true, false);
        this.f28320a = m6Var;
        m6Var.k(0.35f, 300L, qr.h);
        m6Var.t(AndroidUtilities.dp(16.0f));
        m6Var.r(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var));
        m6Var.setCallback(this);
        m6Var.n(!LocaleController.isRTL);
        if (LocaleController.isRTL) {
            m6Var.f26070b = 5;
        }
        TextPaint textPaint = m6Var.f26069a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + AndroidUtilities.dp(77.0f));
        this.h = max;
        m6Var.G = max;
        qb0 qb0Var = new qb0(0);
        yi0 yi0Var = new yi0(i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        qb0Var.f27263c = yi0Var;
        yi0Var.R(this);
        yi0Var.J(true);
        yi0Var.h = true;
        yi0Var.K(0);
        yi0 yi0Var2 = new yi0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        qb0Var.d = yi0Var2;
        yi0Var2.R(this);
        yi0Var2.J(true);
        yi0Var2.h = true;
        yi0Var2.K(0);
        qb0Var.e = yi0Var;
        this.f28321b = qb0Var;
        qb0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, f6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void a(boolean z10, boolean z11) {
        String str;
        boolean z12;
        yi0 yi0Var;
        if (!this.f28322c && z10 == this.d) {
            return;
        }
        this.d = z10;
        if (z10) {
            str = this.e;
        } else {
            str = this.f28323f;
        }
        if (z11 && !LocaleController.isRTL) {
            z12 = true;
        } else {
            z12 = false;
        }
        m6 m6Var = this.f28320a;
        m6Var.q(str, z12, true);
        qb0 qb0Var = this.f28321b;
        yi0 yi0Var2 = (yi0) qb0Var.d;
        yi0 yi0Var3 = (yi0) qb0Var.f27263c;
        qb0Var.f27262b = z10;
        if (z11) {
            if (z10) {
                yi0Var = yi0Var3;
            } else {
                yi0Var = yi0Var2;
            }
            qb0Var.e = yi0Var;
            yi0Var3.M(0);
            yi0Var2.M(0);
            ((yi0) qb0Var.e).start();
        } else {
            if (z10) {
                yi0Var2 = yi0Var3;
            }
            qb0Var.e = yi0Var2;
            yi0Var2.M(yi0Var2.e[0] - 1);
        }
        this.f28322c = false;
        setContentDescription(m6Var.f26073g);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = LocaleController.isRTL;
        m6 m6Var = this.f28320a;
        qb0 qb0Var = this.f28321b;
        if (z10) {
            qb0Var.setBounds(getMeasuredWidth() - AndroidUtilities.dp(41.0f), org.telegram.messenger.wl.y(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - AndroidUtilities.dp(17.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            m6Var.setBounds(0, 0, getMeasuredWidth() - AndroidUtilities.dp(59.0f), getMeasuredHeight());
        } else {
            qb0Var.setBounds(AndroidUtilities.dp(17.0f), org.telegram.messenger.wl.y(24.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(41.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            m6Var.setBounds(AndroidUtilities.dp(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        m6Var.draw(canvas);
        qb0Var.draw(canvas);
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
        if (drawable != this.f28320a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
