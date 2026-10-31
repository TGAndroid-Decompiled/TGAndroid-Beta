package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
public final class za0 extends View implements org.telegram.ui.ActionBar.k6 {
    public final e6 f32992a;
    public final org.telegram.ui.ActionBar.p6 f32993b;
    public final va0 f32994c;
    public boolean d;
    public boolean e;
    public final String f32995f;
    public final String h;
    public final int f32996n;

    public za0(Context context, int i10, String str, int i11, String str2, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.d = true;
        this.f32995f = str;
        this.h = str2;
        this.f32993b = p6Var;
        int i12 = org.telegram.ui.ActionBar.t6.f21020i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i12, p6Var), 2, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(this, h02, null, N, p6Var);
        e6 e6Var = new e6(true, true, true);
        this.f32992a = e6Var;
        e6Var.n(0.35f, 300L, gr.h);
        e6Var.w(org.telegram.messenger.i0.L(16.0f));
        e6Var.u(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, p6Var));
        e6Var.setCallback(this);
        e6Var.q(!org.telegram.messenger.cd.X);
        if (org.telegram.messenger.cd.X) {
            e6Var.f25695b = 5;
        }
        TextPaint textPaint = e6Var.f25693a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + org.telegram.messenger.i0.L(77.0f));
        this.f32996n = max;
        e6Var.M = max;
        va0 va0Var = new va0(0);
        bi0 bi0Var = new bi0(i10, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f));
        va0Var.f31205c = bi0Var;
        bi0Var.R(this);
        bi0Var.J(true);
        bi0Var.h = true;
        bi0Var.K(0);
        bi0 bi0Var2 = new bi0(i11, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f));
        va0Var.d = bi0Var2;
        bi0Var2.R(this);
        bi0Var2.J(true);
        bi0Var2.h = true;
        bi0Var2.K(0);
        va0Var.e = bi0Var;
        this.f32994c = va0Var;
        org.telegram.ui.ActionBar.a7.y(this, va0Var, org.telegram.ui.ActionBar.t6.F8, p6Var, PorterDuff.Mode.SRC_IN);
    }

    public final void a(boolean z10, boolean z11) {
        String str;
        boolean z12;
        bi0 bi0Var;
        if (!this.d && z10 == this.e) {
            return;
        }
        this.e = z10;
        if (z10) {
            str = this.f32995f;
        } else {
            str = this.h;
        }
        if (z11 && !org.telegram.messenger.cd.X) {
            z12 = true;
        } else {
            z12 = false;
        }
        e6 e6Var = this.f32992a;
        e6Var.t(str, z12, true);
        va0 va0Var = this.f32994c;
        bi0 bi0Var2 = (bi0) va0Var.d;
        bi0 bi0Var3 = (bi0) va0Var.f31205c;
        va0Var.f31204b = z10;
        if (z11) {
            if (z10) {
                bi0Var = bi0Var3;
            } else {
                bi0Var = bi0Var2;
            }
            va0Var.e = bi0Var;
            bi0Var3.M(0);
            bi0Var2.M(0);
            ((bi0) va0Var.e).start();
        } else {
            if (z10) {
                bi0Var2 = bi0Var3;
            }
            va0Var.e = bi0Var2;
            bi0Var2.M(bi0Var2.e[0] - 1);
        }
        this.d = false;
        setContentDescription(e6Var.f25700i);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.E8));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = org.telegram.messenger.cd.X;
        e6 e6Var = this.f32992a;
        va0 va0Var = this.f32994c;
        if (z10) {
            va0Var.setBounds(getMeasuredWidth() - org.telegram.messenger.i0.L(41.0f), org.telegram.messenger.z20.y(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - org.telegram.messenger.i0.L(17.0f), (org.telegram.messenger.i0.L(24.0f) + getMeasuredHeight()) / 2);
            e6Var.setBounds(0, 0, getMeasuredWidth() - org.telegram.messenger.i0.L(59.0f), getMeasuredHeight());
        } else {
            va0Var.setBounds(org.telegram.messenger.i0.L(17.0f), org.telegram.messenger.z20.y(24.0f, getMeasuredHeight(), 2), org.telegram.messenger.i0.L(41.0f), (org.telegram.messenger.i0.L(24.0f) + getMeasuredHeight()) / 2);
            e6Var.setBounds(org.telegram.messenger.i0.L(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        e6Var.draw(canvas);
        va0Var.draw(canvas);
    }

    public boolean getState() {
        return this.e;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int min;
        int mode = View.MeasureSpec.getMode(i10);
        int i12 = this.f32996n;
        if (mode == 1073741824) {
            min = Math.max(View.MeasureSpec.getSize(i10), i12);
        } else {
            min = Math.min(View.MeasureSpec.getSize(i10), i12);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, mode), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), 1073741824));
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
            e6 e6Var = this.f32992a;
            if (e6Var != null) {
                e6Var.u(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, this.f32993b));
                invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f32992a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
