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
public final class uc0 extends View {
    public final q6 f31521a;
    public final qc0 f31522b;
    public boolean f31523c;
    public boolean d;
    public final String f31524e;
    public final String f31525f;
    public final int h;

    public uc0(Context context, int i10, String str, int i11, String str2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f31523c = true;
        this.f31524e = str;
        this.f31525f = str2;
        setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20913i6, d6Var), 2, -1));
        q6 q6Var = new q6(true, true, true);
        this.f31521a = q6Var;
        q6Var.n(0.35f, 300L, is.h);
        q6Var.w(AndroidUtilities.dp(16.0f));
        q6Var.u(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, d6Var));
        q6Var.setCallback(this);
        q6Var.q(!LocaleController.isRTL);
        if (LocaleController.isRTL) {
            q6Var.f30134b = 5;
        }
        TextPaint textPaint = q6Var.f30132a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + AndroidUtilities.dp(77.0f));
        this.h = max;
        q6Var.M = max;
        qc0 qc0Var = new qc0(0);
        dk0 dk0Var = new dk0(i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        qc0Var.f30230c = dk0Var;
        dk0Var.R(this);
        dk0Var.J(true);
        dk0Var.h = true;
        dk0Var.K(0);
        dk0 dk0Var2 = new dk0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        qc0Var.d = dk0Var2;
        dk0Var2.R(this);
        dk0Var2.J(true);
        dk0Var2.h = true;
        dk0Var2.K(0);
        qc0Var.f30231e = dk0Var;
        this.f31522b = qc0Var;
        qc0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.F8, d6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void a(boolean z10, boolean z11) {
        String str;
        boolean z12;
        dk0 dk0Var;
        if (!this.f31523c && z10 == this.d) {
            return;
        }
        this.d = z10;
        if (z10) {
            str = this.f31524e;
        } else {
            str = this.f31525f;
        }
        if (z11 && !LocaleController.isRTL) {
            z12 = true;
        } else {
            z12 = false;
        }
        q6 q6Var = this.f31521a;
        q6Var.t(str, z12, true);
        qc0 qc0Var = this.f31522b;
        dk0 dk0Var2 = (dk0) qc0Var.d;
        dk0 dk0Var3 = (dk0) qc0Var.f30230c;
        qc0Var.f30229b = z10;
        if (z11) {
            if (z10) {
                dk0Var = dk0Var3;
            } else {
                dk0Var = dk0Var2;
            }
            qc0Var.f30231e = dk0Var;
            dk0Var3.M(0);
            dk0Var2.M(0);
            ((dk0) qc0Var.f30231e).start();
        } else {
            if (z10) {
                dk0Var2 = dk0Var3;
            }
            qc0Var.f30231e = dk0Var2;
            dk0Var2.M(dk0Var2.f25810e[0] - 1);
        }
        this.f31523c = false;
        setContentDescription(q6Var.f30140i);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = LocaleController.isRTL;
        q6 q6Var = this.f31521a;
        qc0 qc0Var = this.f31522b;
        if (z10) {
            qc0Var.setBounds(getMeasuredWidth() - AndroidUtilities.dp(41.0f), org.telegram.messenger.ai.A(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - AndroidUtilities.dp(17.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            q6Var.setBounds(0, 0, getMeasuredWidth() - AndroidUtilities.dp(59.0f), getMeasuredHeight());
        } else {
            qc0Var.setBounds(AndroidUtilities.dp(17.0f), org.telegram.messenger.ai.A(24.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(41.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            q6Var.setBounds(AndroidUtilities.dp(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        q6Var.draw(canvas);
        qc0Var.draw(canvas);
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
        if (drawable != this.f31521a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
