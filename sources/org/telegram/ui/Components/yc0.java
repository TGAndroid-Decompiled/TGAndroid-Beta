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
public final class yc0 extends View {
    public final q6 f33045a;
    public final uc0 f33046b;
    public boolean f33047c;
    public boolean d;
    public final String f33048e;
    public final String f33049f;
    public final int h;

    public yc0(Context context, int i10, String str, int i11, String str2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f33047c = true;
        this.f33048e = str;
        this.f33049f = str2;
        setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20651i6, c6Var), 2, -1));
        q6 q6Var = new q6(true, true, true);
        this.f33045a = q6Var;
        q6Var.n(0.35f, 300L, js.h);
        q6Var.w(AndroidUtilities.dp(16.0f));
        q6Var.u(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, c6Var));
        q6Var.setCallback(this);
        q6Var.q(!LocaleController.isRTL);
        if (LocaleController.isRTL) {
            q6Var.f29690b = 5;
        }
        TextPaint textPaint = q6Var.f29688a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + AndroidUtilities.dp(77.0f));
        this.h = max;
        q6Var.M = max;
        uc0 uc0Var = new uc0(0);
        fk0 fk0Var = new fk0(i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        uc0Var.f31136c = fk0Var;
        fk0Var.R(this);
        fk0Var.J(true);
        fk0Var.h = true;
        fk0Var.K(0);
        fk0 fk0Var2 = new fk0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        uc0Var.d = fk0Var2;
        fk0Var2.R(this);
        fk0Var2.J(true);
        fk0Var2.h = true;
        fk0Var2.K(0);
        uc0Var.f31137e = fk0Var;
        this.f33046b = uc0Var;
        uc0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.F8, c6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void a(boolean z10, boolean z11) {
        String str;
        boolean z12;
        fk0 fk0Var;
        if (!this.f33047c && z10 == this.d) {
            return;
        }
        this.d = z10;
        if (z10) {
            str = this.f33048e;
        } else {
            str = this.f33049f;
        }
        if (z11 && !LocaleController.isRTL) {
            z12 = true;
        } else {
            z12 = false;
        }
        q6 q6Var = this.f33045a;
        q6Var.t(str, z12, true);
        uc0 uc0Var = this.f33046b;
        fk0 fk0Var2 = (fk0) uc0Var.d;
        fk0 fk0Var3 = (fk0) uc0Var.f31136c;
        uc0Var.f31135b = z10;
        if (z11) {
            if (z10) {
                fk0Var = fk0Var3;
            } else {
                fk0Var = fk0Var2;
            }
            uc0Var.f31137e = fk0Var;
            fk0Var3.M(0);
            fk0Var2.M(0);
            ((fk0) uc0Var.f31137e).start();
        } else {
            if (z10) {
                fk0Var2 = fk0Var3;
            }
            uc0Var.f31137e = fk0Var2;
            fk0Var2.M(fk0Var2.f26109e[0] - 1);
        }
        this.f33047c = false;
        setContentDescription(q6Var.f29696i);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = LocaleController.isRTL;
        q6 q6Var = this.f33045a;
        uc0 uc0Var = this.f33046b;
        if (z10) {
            uc0Var.setBounds(getMeasuredWidth() - AndroidUtilities.dp(41.0f), org.telegram.messenger.am.A(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - AndroidUtilities.dp(17.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            q6Var.setBounds(0, 0, getMeasuredWidth() - AndroidUtilities.dp(59.0f), getMeasuredHeight());
        } else {
            uc0Var.setBounds(AndroidUtilities.dp(17.0f), org.telegram.messenger.am.A(24.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(41.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            q6Var.setBounds(AndroidUtilities.dp(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        q6Var.draw(canvas);
        uc0Var.draw(canvas);
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
        if (drawable != this.f33045a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
