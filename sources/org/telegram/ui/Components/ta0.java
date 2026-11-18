package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
public final class ta0 extends View implements org.telegram.ui.ActionBar.c6 {
    public final m6 f39958a;
    public final org.telegram.ui.ActionBar.i6 f39959b;
    public final pa0 f39960c;
    public boolean d;
    public boolean f39961e;
    public final String f39962f;
    public final String h;
    public final int f39963n;

    public ta0(Context context, int i7, String str, int i10, String str2, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.d = true;
        this.f39962f = str;
        this.h = str2;
        this.f39959b = i6Var;
        int i11 = org.telegram.ui.ActionBar.n6.f29488i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i11, i6Var), 2, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
        setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(this, h02, null, M, i6Var);
        m6 m6Var = new m6(true, true, true);
        this.f39958a = m6Var;
        m6Var.n(0.35f, 300L, lr.h);
        m6Var.w(org.telegram.messenger.g0.L(16.0f));
        m6Var.u(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.E8, i6Var));
        m6Var.setCallback(this);
        m6Var.q(!org.telegram.messenger.gd.f24216a0);
        if (org.telegram.messenger.gd.f24216a0) {
            m6Var.f37377b = 5;
        }
        TextPaint textPaint = m6Var.f37375a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + org.telegram.messenger.g0.L(77.0f));
        this.f39963n = max;
        m6Var.N = max;
        pa0 pa0Var = new pa0(0);
        mh0 mh0Var = new mh0(i7, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
        pa0Var.f38333c = mh0Var;
        mh0Var.R(this);
        mh0Var.J(true);
        mh0Var.h = true;
        mh0Var.K(0);
        mh0 mh0Var2 = new mh0(i10, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
        pa0Var.d = mh0Var2;
        mh0Var2.R(this);
        mh0Var2.J(true);
        mh0Var2.h = true;
        mh0Var2.K(0);
        pa0Var.f38334e = mh0Var;
        this.f39960c = pa0Var;
        org.telegram.ui.ActionBar.u6.x(this, pa0Var, org.telegram.ui.ActionBar.n6.F8, i6Var, PorterDuff.Mode.SRC_IN);
    }

    public final void a(boolean z10, boolean z11) {
        String str;
        boolean z12;
        mh0 mh0Var;
        if (!this.d && z10 == this.f39961e) {
            return;
        }
        this.f39961e = z10;
        if (z10) {
            str = this.f39962f;
        } else {
            str = this.h;
        }
        if (z11 && !org.telegram.messenger.gd.f24216a0) {
            z12 = true;
        } else {
            z12 = false;
        }
        m6 m6Var = this.f39958a;
        m6Var.t(str, z12, true);
        pa0 pa0Var = this.f39960c;
        mh0 mh0Var2 = (mh0) pa0Var.d;
        mh0 mh0Var3 = (mh0) pa0Var.f38333c;
        pa0Var.f38332b = z10;
        if (z11) {
            if (z10) {
                mh0Var = mh0Var3;
            } else {
                mh0Var = mh0Var2;
            }
            pa0Var.f38334e = mh0Var;
            mh0Var3.M(0);
            mh0Var2.M(0);
            ((mh0) pa0Var.f38334e).start();
        } else {
            if (z10) {
                mh0Var2 = mh0Var3;
            }
            pa0Var.f38334e = mh0Var2;
            mh0Var2.M(mh0Var2.f37486e[0] - 1);
        }
        this.d = false;
        setContentDescription(m6Var.f37384i);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.E8));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = org.telegram.messenger.gd.f24216a0;
        m6 m6Var = this.f39958a;
        pa0 pa0Var = this.f39960c;
        if (z10) {
            pa0Var.setBounds(getMeasuredWidth() - org.telegram.messenger.g0.L(41.0f), org.telegram.messenger.n10.z(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - org.telegram.messenger.g0.L(17.0f), (org.telegram.messenger.g0.L(24.0f) + getMeasuredHeight()) / 2);
            m6Var.setBounds(0, 0, getMeasuredWidth() - org.telegram.messenger.g0.L(59.0f), getMeasuredHeight());
        } else {
            pa0Var.setBounds(org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.n10.z(24.0f, getMeasuredHeight(), 2), org.telegram.messenger.g0.L(41.0f), (org.telegram.messenger.g0.L(24.0f) + getMeasuredHeight()) / 2);
            m6Var.setBounds(org.telegram.messenger.g0.L(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        m6Var.draw(canvas);
        pa0Var.draw(canvas);
    }

    public boolean getState() {
        return this.f39961e;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int min;
        int mode = View.MeasureSpec.getMode(i7);
        int i11 = this.f39963n;
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
            m6 m6Var = this.f39958a;
            if (m6Var != null) {
                m6Var.u(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.E8, this.f39959b));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f39958a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
