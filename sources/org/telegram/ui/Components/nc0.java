package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
public final class nc0 extends View implements org.telegram.ui.ActionBar.p6 {
    public final r6 f30861a;
    public final org.telegram.ui.ActionBar.u6 f30862b;
    public final jc0 f30863c;
    public boolean d;
    public boolean e;
    public final String f30864f;
    public final String h;
    public final int f30865n;

    public nc0(Context context, int i10, String str, int i11, String str2, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.d = true;
        this.f30864f = str;
        this.h = str2;
        this.f30862b = u6Var;
        int i12 = org.telegram.ui.ActionBar.y6.f23449i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i12, u6Var), 2, -1);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(this, g02, null, N, u6Var);
        r6 r6Var = new r6(true, true, true);
        this.f30861a = r6Var;
        r6Var.n(0.35f, 300L, ds.h);
        r6Var.w(AndroidUtilities.dp(16.0f));
        r6Var.u(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.E8, u6Var));
        r6Var.setCallback(this);
        r6Var.q(!LocaleController.isRTL);
        if (LocaleController.isRTL) {
            r6Var.f32142b = 5;
        }
        TextPaint textPaint = r6Var.f32140a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + AndroidUtilities.dp(77.0f));
        this.f30865n = max;
        r6Var.M = max;
        jc0 jc0Var = new jc0(0);
        yj0 yj0Var = new yj0(i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        jc0Var.f29643c = yj0Var;
        yj0Var.R(this);
        yj0Var.J(true);
        yj0Var.h = true;
        yj0Var.K(0);
        yj0 yj0Var2 = new yj0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        jc0Var.d = yj0Var2;
        yj0Var2.R(this);
        yj0Var2.J(true);
        yj0Var2.h = true;
        yj0Var2.K(0);
        jc0Var.e = yj0Var;
        this.f30863c = jc0Var;
        org.telegram.ui.ActionBar.f7.y(this, jc0Var, org.telegram.ui.ActionBar.y6.F8, u6Var, PorterDuff.Mode.SRC_IN);
    }

    public final void a(boolean z10, boolean z11) {
        String str;
        boolean z12;
        yj0 yj0Var;
        if (!this.d && z10 == this.e) {
            return;
        }
        this.e = z10;
        if (z10) {
            str = this.f30864f;
        } else {
            str = this.h;
        }
        if (z11 && !LocaleController.isRTL) {
            z12 = true;
        } else {
            z12 = false;
        }
        r6 r6Var = this.f30861a;
        r6Var.t(str, z12, true);
        jc0 jc0Var = this.f30863c;
        yj0 yj0Var2 = (yj0) jc0Var.d;
        yj0 yj0Var3 = (yj0) jc0Var.f29643c;
        jc0Var.f29642b = z10;
        if (z11) {
            if (z10) {
                yj0Var = yj0Var3;
            } else {
                yj0Var = yj0Var2;
            }
            jc0Var.e = yj0Var;
            yj0Var3.M(0);
            yj0Var2.M(0);
            ((yj0) jc0Var.e).start();
        } else {
            if (z10) {
                yj0Var2 = yj0Var3;
            }
            jc0Var.e = yj0Var2;
            yj0Var2.M(yj0Var2.e[0] - 1);
        }
        this.d = false;
        setContentDescription(r6Var.f32147i);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.E8));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = LocaleController.isRTL;
        r6 r6Var = this.f30861a;
        jc0 jc0Var = this.f30863c;
        if (z10) {
            jc0Var.setBounds(getMeasuredWidth() - AndroidUtilities.dp(41.0f), org.telegram.messenger.wh.B(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - AndroidUtilities.dp(17.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            r6Var.setBounds(0, 0, getMeasuredWidth() - AndroidUtilities.dp(59.0f), getMeasuredHeight());
        } else {
            jc0Var.setBounds(AndroidUtilities.dp(17.0f), org.telegram.messenger.wh.B(24.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(41.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            r6Var.setBounds(AndroidUtilities.dp(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        r6Var.draw(canvas);
        jc0Var.draw(canvas);
    }

    public boolean getState() {
        return this.e;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int min;
        int mode = View.MeasureSpec.getMode(i10);
        int i12 = this.f30865n;
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
    public final void updateColors() {
        try {
            r6 r6Var = this.f30861a;
            if (r6Var != null) {
                r6Var.u(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.E8, this.f30862b));
                invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f30861a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
