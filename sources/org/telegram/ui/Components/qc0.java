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
public final class qc0 extends View implements org.telegram.ui.ActionBar.b6 {
    public final p6 f29844a;
    public final org.telegram.ui.ActionBar.g6 f29845b;
    public final mc0 f29846c;
    public boolean d;
    public boolean e;
    public final String f29847f;
    public final String h;
    public final int f29848n;

    public qc0(Context context, int i10, String str, int i11, String str2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.d = true;
        this.f29847f = str;
        this.h = str2;
        this.f29845b = g6Var;
        int i12 = org.telegram.ui.ActionBar.k6.f21272i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i12, g6Var), 2, -1);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
        setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(this, g02, null, O, g6Var);
        p6 p6Var = new p6(true, true, true);
        this.f29844a = p6Var;
        p6Var.n(0.35f, 300L, bs.h);
        p6Var.w(AndroidUtilities.dp(16.0f));
        p6Var.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, g6Var));
        p6Var.setCallback(this);
        p6Var.q(!LocaleController.isRTL);
        if (LocaleController.isRTL) {
            p6Var.f29437b = 5;
        }
        TextPaint textPaint = p6Var.f29435a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + AndroidUtilities.dp(77.0f));
        this.f29848n = max;
        p6Var.M = max;
        mc0 mc0Var = new mc0(0);
        yj0 yj0Var = new yj0(i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        mc0Var.f28636c = yj0Var;
        yj0Var.R(this);
        yj0Var.J(true);
        yj0Var.h = true;
        yj0Var.K(0);
        yj0 yj0Var2 = new yj0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        mc0Var.d = yj0Var2;
        yj0Var2.R(this);
        yj0Var2.J(true);
        yj0Var2.h = true;
        yj0Var2.K(0);
        mc0Var.e = yj0Var;
        this.f29846c = mc0Var;
        org.telegram.ui.ActionBar.r6.z(this, mc0Var, org.telegram.ui.ActionBar.k6.F8, g6Var, PorterDuff.Mode.SRC_IN);
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
            str = this.f29847f;
        } else {
            str = this.h;
        }
        if (z11 && !LocaleController.isRTL) {
            z12 = true;
        } else {
            z12 = false;
        }
        p6 p6Var = this.f29844a;
        p6Var.t(str, z12, true);
        mc0 mc0Var = this.f29846c;
        yj0 yj0Var2 = (yj0) mc0Var.d;
        yj0 yj0Var3 = (yj0) mc0Var.f28636c;
        mc0Var.f28635b = z10;
        if (z11) {
            if (z10) {
                yj0Var = yj0Var3;
            } else {
                yj0Var = yj0Var2;
            }
            mc0Var.e = yj0Var;
            yj0Var3.M(0);
            yj0Var2.M(0);
            ((yj0) mc0Var.e).start();
        } else {
            if (z10) {
                yj0Var2 = yj0Var3;
            }
            mc0Var.e = yj0Var2;
            yj0Var2.M(yj0Var2.e[0] - 1);
        }
        this.d = false;
        setContentDescription(p6Var.f29442i);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E8));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = LocaleController.isRTL;
        p6 p6Var = this.f29844a;
        mc0 mc0Var = this.f29846c;
        if (z10) {
            mc0Var.setBounds(getMeasuredWidth() - AndroidUtilities.dp(41.0f), org.telegram.messenger.sl.A(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - AndroidUtilities.dp(17.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            p6Var.setBounds(0, 0, getMeasuredWidth() - AndroidUtilities.dp(59.0f), getMeasuredHeight());
        } else {
            mc0Var.setBounds(AndroidUtilities.dp(17.0f), org.telegram.messenger.sl.A(24.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(41.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            p6Var.setBounds(AndroidUtilities.dp(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        p6Var.draw(canvas);
        mc0Var.draw(canvas);
    }

    public boolean getState() {
        return this.e;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int min;
        int mode = View.MeasureSpec.getMode(i10);
        int i12 = this.f29848n;
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
            p6 p6Var = this.f29844a;
            if (p6Var != null) {
                p6Var.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, this.f29845b));
                invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f29844a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
