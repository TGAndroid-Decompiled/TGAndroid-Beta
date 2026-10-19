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
    public final p6 f28750a;
    public final jc0 f28751b;
    public boolean f28752c;
    public boolean d;
    public final String e;
    public final String f28753f;
    public final int h;

    public nc0(Context context, int i10, String str, int i11, String str2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f28752c = true;
        this.e = str;
        this.f28753f = str2;
        setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21078i6, d6Var), 2, -1));
        p6 p6Var = new p6(true, true, true);
        this.f28750a = p6Var;
        p6Var.n(0.35f, 300L, bs.h);
        p6Var.w(AndroidUtilities.dp(16.0f));
        p6Var.u(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, d6Var));
        p6Var.setCallback(this);
        p6Var.q(!LocaleController.isRTL);
        if (LocaleController.isRTL) {
            p6Var.f29182b = 5;
        }
        TextPaint textPaint = p6Var.f29180a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + AndroidUtilities.dp(77.0f));
        this.h = max;
        p6Var.M = max;
        jc0 jc0Var = new jc0(0);
        uj0 uj0Var = new uj0(i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        jc0Var.f27507c = uj0Var;
        uj0Var.R(this);
        uj0Var.J(true);
        uj0Var.h = true;
        uj0Var.K(0);
        uj0 uj0Var2 = new uj0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        jc0Var.d = uj0Var2;
        uj0Var2.R(this);
        uj0Var2.J(true);
        uj0Var2.h = true;
        uj0Var2.K(0);
        jc0Var.e = uj0Var;
        this.f28751b = jc0Var;
        jc0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.F8, d6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void a(boolean z10, boolean z11) {
        String str;
        boolean z12;
        uj0 uj0Var;
        if (!this.f28752c && z10 == this.d) {
            return;
        }
        this.d = z10;
        if (z10) {
            str = this.e;
        } else {
            str = this.f28753f;
        }
        if (z11 && !LocaleController.isRTL) {
            z12 = true;
        } else {
            z12 = false;
        }
        p6 p6Var = this.f28750a;
        p6Var.t(str, z12, true);
        jc0 jc0Var = this.f28751b;
        uj0 uj0Var2 = (uj0) jc0Var.d;
        uj0 uj0Var3 = (uj0) jc0Var.f27507c;
        jc0Var.f27506b = z10;
        if (z11) {
            if (z10) {
                uj0Var = uj0Var3;
            } else {
                uj0Var = uj0Var2;
            }
            jc0Var.e = uj0Var;
            uj0Var3.M(0);
            uj0Var2.M(0);
            ((uj0) jc0Var.e).start();
        } else {
            if (z10) {
                uj0Var2 = uj0Var3;
            }
            jc0Var.e = uj0Var2;
            uj0Var2.M(uj0Var2.e[0] - 1);
        }
        this.f28752c = false;
        setContentDescription(p6Var.f29187i);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = LocaleController.isRTL;
        p6 p6Var = this.f28750a;
        jc0 jc0Var = this.f28751b;
        if (z10) {
            jc0Var.setBounds(getMeasuredWidth() - AndroidUtilities.dp(41.0f), org.telegram.messenger.lk.A(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - AndroidUtilities.dp(17.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            p6Var.setBounds(0, 0, getMeasuredWidth() - AndroidUtilities.dp(59.0f), getMeasuredHeight());
        } else {
            jc0Var.setBounds(AndroidUtilities.dp(17.0f), org.telegram.messenger.lk.A(24.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(41.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
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
        if (drawable != this.f28750a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
