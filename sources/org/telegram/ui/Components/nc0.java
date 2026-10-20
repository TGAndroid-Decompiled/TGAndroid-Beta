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
public final class nc0 extends View {
    public final p6 f28776a;
    public final jc0 f28777b;
    public boolean f28778c;
    public boolean d;
    public final String e;
    public final String f28779f;
    public final int h;

    public nc0(Context context, int i10, String str, int i11, String str2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f28778c = true;
        this.e = str;
        this.f28779f = str2;
        setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21079i6, d6Var), 2, -1));
        p6 p6Var = new p6(true, true, true);
        this.f28776a = p6Var;
        p6Var.n(0.35f, 300L, bs.h);
        p6Var.w(AndroidUtilities.dp(16.0f));
        p6Var.u(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, d6Var));
        p6Var.setCallback(this);
        p6Var.q(!LocaleController.isRTL);
        if (LocaleController.isRTL) {
            p6Var.f29225b = 5;
        }
        TextPaint textPaint = p6Var.f29223a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + AndroidUtilities.dp(77.0f));
        this.h = max;
        p6Var.M = max;
        jc0 jc0Var = new jc0(0);
        vj0 vj0Var = new vj0(i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        jc0Var.f27501c = vj0Var;
        vj0Var.R(this);
        vj0Var.J(true);
        vj0Var.h = true;
        vj0Var.K(0);
        vj0 vj0Var2 = new vj0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        jc0Var.d = vj0Var2;
        vj0Var2.R(this);
        vj0Var2.J(true);
        vj0Var2.h = true;
        vj0Var2.K(0);
        jc0Var.e = vj0Var;
        this.f28777b = jc0Var;
        jc0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.F8, d6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void a(boolean z10, boolean z11) {
        String str;
        boolean z12;
        vj0 vj0Var;
        if (!this.f28778c && z10 == this.d) {
            return;
        }
        this.d = z10;
        if (z10) {
            str = this.e;
        } else {
            str = this.f28779f;
        }
        if (z11 && !LocaleController.isRTL) {
            z12 = true;
        } else {
            z12 = false;
        }
        p6 p6Var = this.f28776a;
        p6Var.t(str, z12, true);
        jc0 jc0Var = this.f28777b;
        vj0 vj0Var2 = (vj0) jc0Var.d;
        vj0 vj0Var3 = (vj0) jc0Var.f27501c;
        jc0Var.f27500b = z10;
        if (z11) {
            if (z10) {
                vj0Var = vj0Var3;
            } else {
                vj0Var = vj0Var2;
            }
            jc0Var.e = vj0Var;
            vj0Var3.M(0);
            vj0Var2.M(0);
            ((vj0) jc0Var.e).start();
        } else {
            if (z10) {
                vj0Var2 = vj0Var3;
            }
            jc0Var.e = vj0Var2;
            vj0Var2.M(vj0Var2.e[0] - 1);
        }
        this.f28778c = false;
        setContentDescription(p6Var.f29230i);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = LocaleController.isRTL;
        p6 p6Var = this.f28776a;
        jc0 jc0Var = this.f28777b;
        if (z10) {
            jc0Var.setBounds(getMeasuredWidth() - AndroidUtilities.dp(41.0f), org.telegram.messenger.mk.A(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - AndroidUtilities.dp(17.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            p6Var.setBounds(0, 0, getMeasuredWidth() - AndroidUtilities.dp(59.0f), getMeasuredHeight());
        } else {
            jc0Var.setBounds(AndroidUtilities.dp(17.0f), org.telegram.messenger.mk.A(24.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(41.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            p6Var.setBounds(AndroidUtilities.dp(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        p6Var.draw(canvas);
        jc0Var.draw(canvas);
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
        if (drawable != this.f28776a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
