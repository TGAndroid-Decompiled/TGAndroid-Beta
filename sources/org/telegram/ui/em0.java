package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class em0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final TextView f47325a;
    public org.telegram.ui.Components.xy0 f47326b;
    public final org.telegram.ui.Components.n5 f47327c;
    public final fm0 d;

    public em0(fm0 fm0Var, Context context) {
        super(context);
        int i7;
        int i10;
        this.d = fm0Var;
        int i11 = org.telegram.ui.ActionBar.m6.f29378d6;
        lm0 lm0Var = fm0Var.f47782q0;
        org.telegram.ui.ActionBar.t6.h(i11, this, lm0Var.getResourceProvider());
        TextView textView = new TextView(context);
        this.f47325a = textView;
        textView.setTextSize(1, 16.0f);
        int i12 = org.telegram.ui.ActionBar.m6.G6;
        boolean z10 = lm0Var.f49642a;
        org.telegram.ui.ActionBar.t6.U(textView, i12, lm0Var.getResourceProvider());
        if (fm0Var.f47779n0 == 1) {
            if (z10) {
                i10 = 2131752300;
            } else {
                i10 = 2131743487;
            }
            textView.setText(org.telegram.messenger.gd.N0(i10, null));
        } else {
            if (z10) {
                i7 = 2131752309;
            } else {
                i7 = 2131743490;
            }
            textView.setText(org.telegram.messenger.gd.N0(i7, null));
        }
        addView(textView, c8.ma.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.f47327c = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(24.0f), 13, this, false);
    }

    public final int a() {
        int i7;
        org.telegram.messenger.cp cpVar;
        org.telegram.messenger.bp d;
        int i10;
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.ActionBar.h6 h6Var2;
        org.telegram.ui.ActionBar.h6 h6Var3;
        org.telegram.ui.ActionBar.h6 h6Var4;
        fm0 fm0Var = this.d;
        lm0 lm0Var = fm0Var.f47782q0;
        int i11 = fm0Var.h;
        if (i11 < 0) {
            int i12 = org.telegram.ui.ActionBar.m6.f29658s8;
            if (org.telegram.messenger.g0.B(lm0Var.getThemedColor(i12)) > 0.8f) {
                int i13 = org.telegram.ui.ActionBar.m6.f29560n6;
                h6Var4 = ((org.telegram.ui.ActionBar.g2) lm0Var).resourceProvider;
                return org.telegram.ui.ActionBar.m6.w0(i13, h6Var4);
            } else if (org.telegram.messenger.g0.B(lm0Var.getThemedColor(i12)) < 0.2f) {
                int i14 = org.telegram.ui.ActionBar.m6.A8;
                h6Var3 = ((org.telegram.ui.ActionBar.g2) lm0Var).resourceProvider;
                return org.telegram.ui.ActionBar.m6.r1(0.5f, org.telegram.ui.ActionBar.m6.w0(i14, h6Var3));
            } else {
                int i15 = org.telegram.ui.ActionBar.m6.f29378d6;
                h6Var = ((org.telegram.ui.ActionBar.g2) lm0Var).resourceProvider;
                int w02 = org.telegram.ui.ActionBar.m6.w0(i15, h6Var);
                h6Var2 = ((org.telegram.ui.ActionBar.g2) lm0Var).resourceProvider;
                return org.telegram.ui.ActionBar.m6.w(w02, org.telegram.ui.ActionBar.m6.r1(0.7f, lm0.B0(org.telegram.ui.ActionBar.m6.w0(i12, h6Var2))));
            }
        } else if (i11 < 7) {
            return lm0Var.getThemedColor(org.telegram.ui.ActionBar.m6.f29639r8[i11]);
        } else {
            if (fm0Var.f47779n0 == 1) {
                i10 = ((org.telegram.ui.ActionBar.g2) lm0Var).currentAccount;
                cpVar = org.telegram.messenger.mp.u1(i10).f25795t4;
            } else {
                i7 = ((org.telegram.ui.ActionBar.g2) lm0Var).currentAccount;
                cpVar = org.telegram.messenger.mp.u1(i7).f25803u4;
            }
            if (cpVar != null && (d = cpVar.d(fm0Var.h)) != null) {
                return d.f();
            }
            return lm0Var.getThemedColor(org.telegram.ui.ActionBar.m6.f29639r8[0]);
        }
    }

    public final void b(boolean z10) {
        int i7;
        fm0 fm0Var = this.d;
        long j3 = fm0Var.f47778n;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        org.telegram.ui.Components.n5 n5Var = this.f47327c;
        if (i10 != 0) {
            n5Var.j(j3, z10);
            this.f47326b = null;
            return;
        }
        n5Var.g(null, z10);
        if (this.f47326b == null) {
            if (fm0Var.f47782q0.f49642a) {
                i7 = 2131752299;
            } else {
                i7 = 2131743486;
            }
            this.f47326b = new org.telegram.ui.Components.xy0(org.telegram.messenger.gd.N0(i7, null), 16.0f, null);
        }
    }

    public final void c() {
        int width;
        int width2;
        boolean z10 = org.telegram.messenger.gd.f24241a0;
        org.telegram.ui.Components.n5 n5Var = this.f47327c;
        if (z10) {
            width = org.telegram.messenger.g0.L(21.0f);
        } else {
            width = (getWidth() - n5Var.f37776s) - org.telegram.messenger.g0.L(21.0f);
        }
        int height = (getHeight() - n5Var.f37776s) / 2;
        if (org.telegram.messenger.gd.f24241a0) {
            width2 = org.telegram.messenger.g0.L(21.0f) + n5Var.f37776s;
        } else {
            width2 = getWidth() - org.telegram.messenger.g0.L(21.0f);
        }
        n5Var.setBounds(width, height, width2, (getHeight() + n5Var.f37776s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.n5 n5Var = this.f47327c;
        n5Var.k(valueOf);
        org.telegram.ui.Components.xy0 xy0Var = this.f47326b;
        if (xy0Var != null) {
            xy0Var.c((getMeasuredWidth() - this.f47326b.k()) - org.telegram.messenger.g0.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.f47782q0.getThemedColor(org.telegram.ui.ActionBar.m6.f29618q6), canvas);
        } else {
            n5Var.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f47327c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f47327c.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        fm0 fm0Var = this.d;
        setBackgroundColor(fm0Var.f47782q0.getThemedColor(org.telegram.ui.ActionBar.m6.f29378d6));
        this.f47325a.setTextColor(fm0Var.f47782q0.getThemedColor(org.telegram.ui.ActionBar.m6.G6));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
