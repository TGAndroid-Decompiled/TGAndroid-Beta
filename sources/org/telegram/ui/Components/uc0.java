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
    public final r6 f29638a;
    public final qc0 f29639b;
    public boolean f29640c;
    public boolean d;
    public final String e;
    public final String f29641f;
    public final int h;

    public uc0(Context context, int i10, String str, int i11, String str2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f29640c = true;
        this.e = str;
        this.f29641f = str2;
        setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19990i6, c6Var), 2, -1));
        r6 r6Var = new r6(true, true, true);
        this.f29638a = r6Var;
        r6Var.n(0.35f, 300L, es.h);
        r6Var.w(AndroidUtilities.dp(16.0f));
        r6Var.u(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E8, c6Var));
        r6Var.setCallback(this);
        r6Var.q(!LocaleController.isRTL);
        if (LocaleController.isRTL) {
            r6Var.f28748b = 5;
        }
        TextPaint textPaint = r6Var.f28746a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + AndroidUtilities.dp(77.0f));
        this.h = max;
        r6Var.M = max;
        qc0 qc0Var = new qc0(0);
        yj0 yj0Var = new yj0(i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        qc0Var.f28581c = yj0Var;
        yj0Var.R(this);
        yj0Var.J(true);
        yj0Var.h = true;
        yj0Var.K(0);
        yj0 yj0Var2 = new yj0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        qc0Var.d = yj0Var2;
        yj0Var2.R(this);
        yj0Var2.J(true);
        yj0Var2.h = true;
        yj0Var2.K(0);
        qc0Var.e = yj0Var;
        this.f29639b = qc0Var;
        qc0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.F8, c6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void a(boolean z10, boolean z11) {
        String str;
        boolean z12;
        yj0 yj0Var;
        if (!this.f29640c && z10 == this.d) {
            return;
        }
        this.d = z10;
        if (z10) {
            str = this.e;
        } else {
            str = this.f29641f;
        }
        if (z11 && !LocaleController.isRTL) {
            z12 = true;
        } else {
            z12 = false;
        }
        r6 r6Var = this.f29638a;
        r6Var.t(str, z12, true);
        qc0 qc0Var = this.f29639b;
        yj0 yj0Var2 = (yj0) qc0Var.d;
        yj0 yj0Var3 = (yj0) qc0Var.f28581c;
        qc0Var.f28580b = z10;
        if (z11) {
            if (z10) {
                yj0Var = yj0Var3;
            } else {
                yj0Var = yj0Var2;
            }
            qc0Var.e = yj0Var;
            yj0Var3.M(0);
            yj0Var2.M(0);
            ((yj0) qc0Var.e).start();
        } else {
            if (z10) {
                yj0Var2 = yj0Var3;
            }
            qc0Var.e = yj0Var2;
            yj0Var2.M(yj0Var2.e[0] - 1);
        }
        this.f29640c = false;
        setContentDescription(r6Var.f28753i);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = LocaleController.isRTL;
        r6 r6Var = this.f29638a;
        qc0 qc0Var = this.f29639b;
        if (z10) {
            qc0Var.setBounds(getMeasuredWidth() - AndroidUtilities.dp(41.0f), org.telegram.messenger.yh.B(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - AndroidUtilities.dp(17.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            r6Var.setBounds(0, 0, getMeasuredWidth() - AndroidUtilities.dp(59.0f), getMeasuredHeight());
        } else {
            qc0Var.setBounds(AndroidUtilities.dp(17.0f), org.telegram.messenger.yh.B(24.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(41.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            r6Var.setBounds(AndroidUtilities.dp(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        r6Var.draw(canvas);
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
        if (drawable != this.f29638a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
