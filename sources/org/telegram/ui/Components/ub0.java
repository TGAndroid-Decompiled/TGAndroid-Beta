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
    public final m6 f28327a;
    public final qb0 f28328b;
    public boolean f28329c;
    public boolean d;
    public final String e;
    public final String f28330f;
    public final int h;

    public ub0(Context context, int i10, String str, int i11, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f28329c = true;
        this.e = str;
        this.f28330f = str2;
        setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18923i6, e6Var), 2, -1));
        m6 m6Var = new m6(true, true, true, false);
        this.f28327a = m6Var;
        m6Var.k(0.35f, 300L, qr.h);
        m6Var.t(AndroidUtilities.dp(16.0f));
        m6Var.r(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, e6Var));
        m6Var.setCallback(this);
        m6Var.n(!LocaleController.isRTL);
        if (LocaleController.isRTL) {
            m6Var.f26085b = 5;
        }
        TextPaint textPaint = m6Var.f26084a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + AndroidUtilities.dp(77.0f));
        this.h = max;
        m6Var.G = max;
        qb0 qb0Var = new qb0(0);
        xi0 xi0Var = new xi0(i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        qb0Var.f27301c = xi0Var;
        xi0Var.R(this);
        xi0Var.J(true);
        xi0Var.h = true;
        xi0Var.K(0);
        xi0 xi0Var2 = new xi0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        qb0Var.d = xi0Var2;
        xi0Var2.R(this);
        xi0Var2.J(true);
        xi0Var2.h = true;
        xi0Var2.K(0);
        qb0Var.e = xi0Var;
        this.f28328b = qb0Var;
        qb0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.F8, e6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void a(boolean z10, boolean z11) {
        String str;
        boolean z12;
        xi0 xi0Var;
        if (!this.f28329c && z10 == this.d) {
            return;
        }
        this.d = z10;
        if (z10) {
            str = this.e;
        } else {
            str = this.f28330f;
        }
        if (z11 && !LocaleController.isRTL) {
            z12 = true;
        } else {
            z12 = false;
        }
        m6 m6Var = this.f28327a;
        m6Var.q(str, z12, true);
        qb0 qb0Var = this.f28328b;
        xi0 xi0Var2 = (xi0) qb0Var.d;
        xi0 xi0Var3 = (xi0) qb0Var.f27301c;
        qb0Var.f27300b = z10;
        if (z11) {
            if (z10) {
                xi0Var = xi0Var3;
            } else {
                xi0Var = xi0Var2;
            }
            qb0Var.e = xi0Var;
            xi0Var3.M(0);
            xi0Var2.M(0);
            ((xi0) qb0Var.e).start();
        } else {
            if (z10) {
                xi0Var2 = xi0Var3;
            }
            qb0Var.e = xi0Var2;
            xi0Var2.M(xi0Var2.e[0] - 1);
        }
        this.f28329c = false;
        setContentDescription(m6Var.f26088g);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = LocaleController.isRTL;
        m6 m6Var = this.f28327a;
        qb0 qb0Var = this.f28328b;
        if (z10) {
            qb0Var.setBounds(getMeasuredWidth() - AndroidUtilities.dp(41.0f), org.telegram.messenger.vl.y(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - AndroidUtilities.dp(17.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            m6Var.setBounds(0, 0, getMeasuredWidth() - AndroidUtilities.dp(59.0f), getMeasuredHeight());
        } else {
            qb0Var.setBounds(AndroidUtilities.dp(17.0f), org.telegram.messenger.vl.y(24.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(41.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
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
        if (drawable != this.f28327a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
