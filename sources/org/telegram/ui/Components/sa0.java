package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
public final class sa0 extends View implements org.telegram.ui.ActionBar.c6 {
    public final m6 f39547a;
    public final org.telegram.ui.ActionBar.i6 f39548b;
    public final oa0 f39549c;
    public boolean d;
    public boolean f39550e;
    public final String f39551f;
    public final String h;
    public final int f39552n;

    public sa0(Context context, int i7, String str, int i10, String str2, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.d = true;
        this.f39551f = str;
        this.h = str2;
        this.f39548b = i6Var;
        int i11 = org.telegram.ui.ActionBar.n6.f29543i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i11, i6Var), 2, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
        setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(this, h02, null, M, i6Var);
        m6 m6Var = new m6(true, true, true);
        this.f39547a = m6Var;
        m6Var.n(0.35f, 300L, kr.h);
        m6Var.w(org.telegram.messenger.g0.L(16.0f));
        m6Var.u(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.E8, i6Var));
        m6Var.setCallback(this);
        m6Var.q(!org.telegram.messenger.gd.f24314a0);
        if (org.telegram.messenger.gd.f24314a0) {
            m6Var.f37394b = 5;
        }
        TextPaint textPaint = m6Var.f37392a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + org.telegram.messenger.g0.L(77.0f));
        this.f39552n = max;
        m6Var.N = max;
        oa0 oa0Var = new oa0(0);
        nh0 nh0Var = new nh0(i7, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
        oa0Var.f38080c = nh0Var;
        nh0Var.R(this);
        nh0Var.J(true);
        nh0Var.h = true;
        nh0Var.K(0);
        nh0 nh0Var2 = new nh0(i10, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
        oa0Var.d = nh0Var2;
        nh0Var2.R(this);
        nh0Var2.J(true);
        nh0Var2.h = true;
        nh0Var2.K(0);
        oa0Var.f38081e = nh0Var;
        this.f39549c = oa0Var;
        org.telegram.ui.ActionBar.u6.x(this, oa0Var, org.telegram.ui.ActionBar.n6.F8, i6Var, PorterDuff.Mode.SRC_IN);
    }

    public final void a(boolean z10, boolean z11) {
        String str;
        boolean z12;
        nh0 nh0Var;
        if (!this.d && z10 == this.f39550e) {
            return;
        }
        this.f39550e = z10;
        if (z10) {
            str = this.f39551f;
        } else {
            str = this.h;
        }
        if (z11 && !org.telegram.messenger.gd.f24314a0) {
            z12 = true;
        } else {
            z12 = false;
        }
        m6 m6Var = this.f39547a;
        m6Var.t(str, z12, true);
        oa0 oa0Var = this.f39549c;
        nh0 nh0Var2 = (nh0) oa0Var.d;
        nh0 nh0Var3 = (nh0) oa0Var.f38080c;
        oa0Var.f38079b = z10;
        if (z11) {
            if (z10) {
                nh0Var = nh0Var3;
            } else {
                nh0Var = nh0Var2;
            }
            oa0Var.f38081e = nh0Var;
            nh0Var3.M(0);
            nh0Var2.M(0);
            ((nh0) oa0Var.f38081e).start();
        } else {
            if (z10) {
                nh0Var2 = nh0Var3;
            }
            oa0Var.f38081e = nh0Var2;
            nh0Var2.M(nh0Var2.f37805e[0] - 1);
        }
        this.d = false;
        setContentDescription(m6Var.f37401i);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.E8));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = org.telegram.messenger.gd.f24314a0;
        m6 m6Var = this.f39547a;
        oa0 oa0Var = this.f39549c;
        if (z10) {
            oa0Var.setBounds(getMeasuredWidth() - org.telegram.messenger.g0.L(41.0f), org.telegram.messenger.m10.z(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - org.telegram.messenger.g0.L(17.0f), (org.telegram.messenger.g0.L(24.0f) + getMeasuredHeight()) / 2);
            m6Var.setBounds(0, 0, getMeasuredWidth() - org.telegram.messenger.g0.L(59.0f), getMeasuredHeight());
        } else {
            oa0Var.setBounds(org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.m10.z(24.0f, getMeasuredHeight(), 2), org.telegram.messenger.g0.L(41.0f), (org.telegram.messenger.g0.L(24.0f) + getMeasuredHeight()) / 2);
            m6Var.setBounds(org.telegram.messenger.g0.L(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        m6Var.draw(canvas);
        oa0Var.draw(canvas);
    }

    public boolean getState() {
        return this.f39550e;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int min;
        int mode = View.MeasureSpec.getMode(i7);
        int i11 = this.f39552n;
        if (mode == 1073741824) {
            min = Math.max(View.MeasureSpec.getSize(i7), i11);
        } else {
            min = Math.min(View.MeasureSpec.getSize(i7), i11);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, mode), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
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
            m6 m6Var = this.f39547a;
            if (m6Var != null) {
                m6Var.u(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.E8, this.f39548b));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f39547a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
