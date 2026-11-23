package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class ba0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 f33721a;
    public final m6 f33722b;
    public final m6 f33723c;

    public ba0(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f33721a = i6Var;
        m6 m6Var = new m6(true, true, true);
        this.f33722b = m6Var;
        kr krVar = kr.h;
        m6Var.n(0.3f, 430L, krVar);
        m6Var.x(org.telegram.messenger.g0.o());
        m6Var.u(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.A8, i6Var));
        m6Var.w(org.telegram.messenger.g0.L(18.0f));
        m6Var.q(!org.telegram.messenger.gd.f24314a0);
        m6Var.setCallback(this);
        Point point = org.telegram.messenger.g0.f24226q;
        m6Var.N = point.x;
        m6 m6Var2 = new m6(true, true, true);
        this.f33723c = m6Var2;
        m6Var2.n(0.3f, 430L, krVar);
        m6Var2.u(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.B8, i6Var));
        m6Var2.w(org.telegram.messenger.g0.L(14.0f));
        m6Var2.q(!org.telegram.messenger.gd.f24314a0);
        m6Var2.setCallback(this);
        m6Var2.N = point.x;
    }

    public final void a(CharSequence charSequence, boolean z10) {
        boolean z11;
        if (z10 && !org.telegram.messenger.gd.f24314a0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f33723c.t(charSequence, z11, true);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B8));
    }

    public final void b(CharSequence charSequence, boolean z10) {
        boolean z11;
        if (z10 && !org.telegram.messenger.gd.f24314a0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f33722b.t(charSequence, z11, true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(29.0f);
        int L2 = org.telegram.messenger.g0.L(18.83f);
        m6 m6Var = this.f33723c;
        int paddingLeft = getPaddingLeft();
        int L3 = r0 - org.telegram.messenger.g0.L(32.0f);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int L4 = org.telegram.messenger.g0.L(32.0f) + r0;
        m6 m6Var2 = this.f33722b;
        m6Var2.setBounds(paddingLeft, L3, measuredWidth, L4);
        m6Var2.draw(canvas);
        m6Var.setBounds(getPaddingLeft(), r0 - org.telegram.messenger.g0.L(32.0f), getMeasuredWidth() - getPaddingRight(), org.telegram.messenger.g0.L(32.0f) + r0);
        m6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
        setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
    }

    @Override
    public final void updateColors() {
        try {
            m6 m6Var = this.f33722b;
            org.telegram.ui.ActionBar.i6 i6Var = this.f33721a;
            if (m6Var != null) {
                m6Var.u(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.A8, i6Var));
            }
            m6 m6Var2 = this.f33723c;
            if (m6Var2 != null) {
                m6Var2.u(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.B8, i6Var));
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f33722b != drawable && this.f33723c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
