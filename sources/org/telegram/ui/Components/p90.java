package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class p90 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.h6 f36877a;
    public final h6 f36878b;
    public final h6 f36879c;

    public p90(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f36877a = h6Var;
        h6 h6Var2 = new h6(true, true, true);
        this.f36878b = h6Var2;
        wq wqVar = wq.h;
        h6Var2.n(0.3f, 430L, wqVar);
        h6Var2.x(org.telegram.messenger.g0.o());
        h6Var2.u(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A8, h6Var));
        h6Var2.w(org.telegram.messenger.g0.L(18.0f));
        h6Var2.q(!org.telegram.messenger.id.f23161a0);
        h6Var2.setCallback(this);
        Point point = org.telegram.messenger.g0.f22567q;
        h6Var2.M = point.x;
        h6 h6Var3 = new h6(true, true, true);
        this.f36879c = h6Var3;
        h6Var3.n(0.3f, 430L, wqVar);
        h6Var3.u(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.B8, h6Var));
        h6Var3.w(org.telegram.messenger.g0.L(14.0f));
        h6Var3.q(!org.telegram.messenger.id.f23161a0);
        h6Var3.setCallback(this);
        h6Var3.M = point.x;
    }

    public final void a(CharSequence charSequence, boolean z9) {
        boolean z10;
        if (z9 && !org.telegram.messenger.id.f23161a0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f36879c.t(charSequence, z10, true);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B8));
    }

    public final void b(CharSequence charSequence, boolean z9) {
        boolean z10;
        if (z9 && !org.telegram.messenger.id.f23161a0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f36878b.t(charSequence, z10, true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(29.0f);
        int L2 = org.telegram.messenger.g0.L(18.83f);
        h6 h6Var = this.f36879c;
        int paddingLeft = getPaddingLeft();
        int L3 = r0 - org.telegram.messenger.g0.L(32.0f);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int L4 = org.telegram.messenger.g0.L(32.0f) + r0;
        h6 h6Var2 = this.f36878b;
        h6Var2.setBounds(paddingLeft, L3, measuredWidth, L4);
        h6Var2.draw(canvas);
        h6Var.setBounds(getPaddingLeft(), r0 - org.telegram.messenger.g0.L(32.0f), getMeasuredWidth() - getPaddingRight(), org.telegram.messenger.g0.L(32.0f) + r0);
        h6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
        setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
    }

    @Override
    public final void updateColors() {
        try {
            h6 h6Var = this.f36878b;
            org.telegram.ui.ActionBar.h6 h6Var2 = this.f36877a;
            if (h6Var != null) {
                h6Var.u(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A8, h6Var2));
            }
            h6 h6Var3 = this.f36879c;
            if (h6Var3 != null) {
                h6Var3.u(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.B8, h6Var2));
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f36878b != drawable && this.f36879c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
