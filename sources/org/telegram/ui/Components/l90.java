package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class l90 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f35635a;
    public final g6 f35636b;
    public final g6 f35637c;

    public l90(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f35635a = e6Var;
        g6 g6Var = new g6(true, true, true);
        this.f35636b = g6Var;
        xq xqVar = xq.h;
        g6Var.n(0.3f, 430L, xqVar);
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, e6Var));
        g6Var.w(org.telegram.messenger.g0.L(18.0f));
        g6Var.q(!org.telegram.messenger.bd.f21784a0);
        g6Var.setCallback(this);
        Point point = org.telegram.messenger.g0.f22608q;
        g6Var.M = point.x;
        g6 g6Var2 = new g6(true, true, true);
        this.f35637c = g6Var2;
        g6Var2.n(0.3f, 430L, xqVar);
        g6Var2.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, e6Var));
        g6Var2.w(org.telegram.messenger.g0.L(14.0f));
        g6Var2.q(!org.telegram.messenger.bd.f21784a0);
        g6Var2.setCallback(this);
        g6Var2.M = point.x;
    }

    public final void a(CharSequence charSequence, boolean z10) {
        boolean z11;
        if (z10 && !org.telegram.messenger.bd.f21784a0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f35637c.t(charSequence, z11, true);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B8));
    }

    public final void b(CharSequence charSequence, boolean z10) {
        boolean z11;
        if (z10 && !org.telegram.messenger.bd.f21784a0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f35636b.t(charSequence, z11, true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(29.0f);
        int L2 = org.telegram.messenger.g0.L(18.83f);
        g6 g6Var = this.f35637c;
        int paddingLeft = getPaddingLeft();
        int L3 = r0 - org.telegram.messenger.g0.L(32.0f);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int L4 = org.telegram.messenger.g0.L(32.0f) + r0;
        g6 g6Var2 = this.f35636b;
        g6Var2.setBounds(paddingLeft, L3, measuredWidth, L4);
        g6Var2.draw(canvas);
        g6Var.setBounds(getPaddingLeft(), r0 - org.telegram.messenger.g0.L(32.0f), getMeasuredWidth() - getPaddingRight(), org.telegram.messenger.g0.L(32.0f) + r0);
        g6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
        setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
    }

    @Override
    public final void updateColors() {
        try {
            g6 g6Var = this.f35636b;
            org.telegram.ui.ActionBar.e6 e6Var = this.f35635a;
            if (g6Var != null) {
                g6Var.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, e6Var));
            }
            g6 g6Var2 = this.f35637c;
            if (g6Var2 != null) {
                g6Var2.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, e6Var));
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f35636b != drawable && this.f35637c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
