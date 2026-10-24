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
public final class oc0 extends View implements org.telegram.ui.ActionBar.b6 {
    public final n6 f29215a;
    public final org.telegram.ui.ActionBar.g6 f29216b;
    public final kc0 f29217c;
    public boolean d;
    public boolean e;
    public final String f29218f;
    public final String h;
    public final int f29219n;

    public oc0(Context context, int i10, String str, int i11, String str2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.d = true;
        this.f29218f = str;
        this.h = str2;
        this.f29216b = g6Var;
        int i12 = org.telegram.ui.ActionBar.k6.f21273i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i12, g6Var), 2, -1);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
        setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(this, g02, null, O, g6Var);
        n6 n6Var = new n6(true, true, true);
        this.f29215a = n6Var;
        n6Var.n(0.35f, 300L, zr.h);
        n6Var.w(AndroidUtilities.dp(16.0f));
        n6Var.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, g6Var));
        n6Var.setCallback(this);
        n6Var.q(!LocaleController.isRTL);
        if (LocaleController.isRTL) {
            n6Var.f28797b = 5;
        }
        TextPaint textPaint = n6Var.f28795a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + AndroidUtilities.dp(77.0f));
        this.f29219n = max;
        n6Var.M = max;
        kc0 kc0Var = new kc0(0);
        xj0 xj0Var = new xj0(i10, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        kc0Var.f28005c = xj0Var;
        xj0Var.R(this);
        xj0Var.J(true);
        xj0Var.h = true;
        xj0Var.K(0);
        xj0 xj0Var2 = new xj0(i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        kc0Var.d = xj0Var2;
        xj0Var2.R(this);
        xj0Var2.J(true);
        xj0Var2.h = true;
        xj0Var2.K(0);
        kc0Var.e = xj0Var;
        this.f29217c = kc0Var;
        org.telegram.ui.ActionBar.r6.z(this, kc0Var, org.telegram.ui.ActionBar.k6.F8, g6Var, PorterDuff.Mode.SRC_IN);
    }

    public final void a(boolean z10, boolean z11) {
        String str;
        boolean z12;
        xj0 xj0Var;
        if (!this.d && z10 == this.e) {
            return;
        }
        this.e = z10;
        if (z10) {
            str = this.f29218f;
        } else {
            str = this.h;
        }
        if (z11 && !LocaleController.isRTL) {
            z12 = true;
        } else {
            z12 = false;
        }
        n6 n6Var = this.f29215a;
        n6Var.t(str, z12, true);
        kc0 kc0Var = this.f29217c;
        xj0 xj0Var2 = (xj0) kc0Var.d;
        xj0 xj0Var3 = (xj0) kc0Var.f28005c;
        kc0Var.f28004b = z10;
        if (z11) {
            if (z10) {
                xj0Var = xj0Var3;
            } else {
                xj0Var = xj0Var2;
            }
            kc0Var.e = xj0Var;
            xj0Var3.M(0);
            xj0Var2.M(0);
            ((xj0) kc0Var.e).start();
        } else {
            if (z10) {
                xj0Var2 = xj0Var3;
            }
            kc0Var.e = xj0Var2;
            xj0Var2.M(xj0Var2.e[0] - 1);
        }
        this.d = false;
        setContentDescription(n6Var.f28802i);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E8));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = LocaleController.isRTL;
        n6 n6Var = this.f29215a;
        kc0 kc0Var = this.f29217c;
        if (z10) {
            kc0Var.setBounds(getMeasuredWidth() - AndroidUtilities.dp(41.0f), org.telegram.messenger.tl.A(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - AndroidUtilities.dp(17.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            n6Var.setBounds(0, 0, getMeasuredWidth() - AndroidUtilities.dp(59.0f), getMeasuredHeight());
        } else {
            kc0Var.setBounds(AndroidUtilities.dp(17.0f), org.telegram.messenger.tl.A(24.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(41.0f), (AndroidUtilities.dp(24.0f) + getMeasuredHeight()) / 2);
            n6Var.setBounds(AndroidUtilities.dp(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        n6Var.draw(canvas);
        kc0Var.draw(canvas);
    }

    public boolean getState() {
        return this.e;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int min;
        int mode = View.MeasureSpec.getMode(i10);
        int i12 = this.f29219n;
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
            n6 n6Var = this.f29215a;
            if (n6Var != null) {
                n6Var.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, this.f29216b));
                invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f29215a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
