package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class em0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final TextView f47300a;
    public org.telegram.ui.Components.vy0 f47301b;
    public final org.telegram.ui.Components.m5 f47302c;
    public final fm0 d;

    public em0(fm0 fm0Var, Context context) {
        super(context);
        int i7;
        int i10;
        this.d = fm0Var;
        int i11 = org.telegram.ui.ActionBar.n6.f29396d6;
        lm0 lm0Var = fm0Var.f47751q0;
        org.telegram.ui.ActionBar.u6.h(i11, this, lm0Var.getResourceProvider());
        TextView textView = new TextView(context);
        this.f47300a = textView;
        textView.setTextSize(1, 16.0f);
        int i12 = org.telegram.ui.ActionBar.n6.G6;
        boolean z10 = lm0Var.f49632a;
        org.telegram.ui.ActionBar.u6.U(textView, i12, lm0Var.getResourceProvider());
        if (fm0Var.f47748n0 == 1) {
            if (z10) {
                i10 = 2131752301;
            } else {
                i10 = 2131743493;
            }
            textView.setText(org.telegram.messenger.gd.M0(i10, null));
        } else {
            if (z10) {
                i7 = 2131752310;
            } else {
                i7 = 2131743496;
            }
            textView.setText(org.telegram.messenger.gd.M0(i7, null));
        }
        addView(textView, c8.ma.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.f47302c = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(24.0f), 13, this, false);
    }

    public final int a() {
        int i7;
        org.telegram.messenger.cp cpVar;
        org.telegram.messenger.bp d;
        int i10;
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.ActionBar.i6 i6Var2;
        org.telegram.ui.ActionBar.i6 i6Var3;
        org.telegram.ui.ActionBar.i6 i6Var4;
        fm0 fm0Var = this.d;
        lm0 lm0Var = fm0Var.f47751q0;
        int i11 = fm0Var.h;
        if (i11 < 0) {
            int i12 = org.telegram.ui.ActionBar.n6.f29676s8;
            if (org.telegram.messenger.g0.B(lm0Var.getThemedColor(i12)) > 0.8f) {
                int i13 = org.telegram.ui.ActionBar.n6.f29578n6;
                i6Var4 = ((org.telegram.ui.ActionBar.h2) lm0Var).resourceProvider;
                return org.telegram.ui.ActionBar.n6.w0(i13, i6Var4);
            } else if (org.telegram.messenger.g0.B(lm0Var.getThemedColor(i12)) < 0.2f) {
                int i14 = org.telegram.ui.ActionBar.n6.A8;
                i6Var3 = ((org.telegram.ui.ActionBar.h2) lm0Var).resourceProvider;
                return org.telegram.ui.ActionBar.n6.r1(0.5f, org.telegram.ui.ActionBar.n6.w0(i14, i6Var3));
            } else {
                int i15 = org.telegram.ui.ActionBar.n6.f29396d6;
                i6Var = ((org.telegram.ui.ActionBar.h2) lm0Var).resourceProvider;
                int w02 = org.telegram.ui.ActionBar.n6.w0(i15, i6Var);
                i6Var2 = ((org.telegram.ui.ActionBar.h2) lm0Var).resourceProvider;
                return org.telegram.ui.ActionBar.n6.w(w02, org.telegram.ui.ActionBar.n6.r1(0.7f, lm0.B0(org.telegram.ui.ActionBar.n6.w0(i12, i6Var2))));
            }
        } else if (i11 < 7) {
            return lm0Var.getThemedColor(org.telegram.ui.ActionBar.n6.f29657r8[i11]);
        } else {
            if (fm0Var.f47748n0 == 1) {
                i10 = ((org.telegram.ui.ActionBar.h2) lm0Var).currentAccount;
                cpVar = org.telegram.messenger.mp.u1(i10).f25769t4;
            } else {
                i7 = ((org.telegram.ui.ActionBar.h2) lm0Var).currentAccount;
                cpVar = org.telegram.messenger.mp.u1(i7).f25777u4;
            }
            if (cpVar != null && (d = cpVar.d(fm0Var.h)) != null) {
                return d.f();
            }
            return lm0Var.getThemedColor(org.telegram.ui.ActionBar.n6.f29657r8[0]);
        }
    }

    public final void b(boolean z10) {
        int i7;
        fm0 fm0Var = this.d;
        long j3 = fm0Var.f47747n;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        org.telegram.ui.Components.m5 m5Var = this.f47302c;
        if (i10 != 0) {
            m5Var.j(j3, z10);
            this.f47301b = null;
            return;
        }
        m5Var.g(null, z10);
        if (this.f47301b == null) {
            if (fm0Var.f47751q0.f49632a) {
                i7 = 2131752300;
            } else {
                i7 = 2131743492;
            }
            this.f47301b = new org.telegram.ui.Components.vy0(org.telegram.messenger.gd.M0(i7, null), 16.0f, null);
        }
    }

    public final void c() {
        int width;
        int width2;
        boolean z10 = org.telegram.messenger.gd.f24216a0;
        org.telegram.ui.Components.m5 m5Var = this.f47302c;
        if (z10) {
            width = org.telegram.messenger.g0.L(21.0f);
        } else {
            width = (getWidth() - m5Var.f37364s) - org.telegram.messenger.g0.L(21.0f);
        }
        int height = (getHeight() - m5Var.f37364s) / 2;
        if (org.telegram.messenger.gd.f24216a0) {
            width2 = org.telegram.messenger.g0.L(21.0f) + m5Var.f37364s;
        } else {
            width2 = getWidth() - org.telegram.messenger.g0.L(21.0f);
        }
        m5Var.setBounds(width, height, width2, (getHeight() + m5Var.f37364s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.m5 m5Var = this.f47302c;
        m5Var.k(valueOf);
        org.telegram.ui.Components.vy0 vy0Var = this.f47301b;
        if (vy0Var != null) {
            vy0Var.c((getMeasuredWidth() - this.f47301b.k()) - org.telegram.messenger.g0.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.f47751q0.getThemedColor(org.telegram.ui.ActionBar.n6.f29636q6), canvas);
        } else {
            m5Var.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f47302c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f47302c.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        fm0 fm0Var = this.d;
        setBackgroundColor(fm0Var.f47751q0.getThemedColor(org.telegram.ui.ActionBar.n6.f29396d6));
        this.f47300a.setTextColor(fm0Var.f47751q0.getThemedColor(org.telegram.ui.ActionBar.n6.G6));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
