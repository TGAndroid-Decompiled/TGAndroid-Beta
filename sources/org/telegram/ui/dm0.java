package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class dm0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final TextView f45010a;
    public org.telegram.ui.Components.my0 f45011b;
    public final org.telegram.ui.Components.f5 f45012c;
    public final em0 d;

    public dm0(em0 em0Var, Context context) {
        super(context);
        int i7;
        int i10;
        this.d = em0Var;
        int i11 = org.telegram.ui.ActionBar.m6.f27890d6;
        km0 km0Var = em0Var.f45401p0;
        org.telegram.ui.ActionBar.t6.h(i11, this, km0Var.getResourceProvider());
        TextView textView = new TextView(context);
        this.f45010a = textView;
        textView.setTextSize(1, 16.0f);
        int i12 = org.telegram.ui.ActionBar.m6.G6;
        boolean z9 = km0Var.f47367a;
        org.telegram.ui.ActionBar.t6.U(textView, i12, km0Var.getResourceProvider());
        if (em0Var.m0 == 1) {
            if (z9) {
                i10 = 2131752312;
            } else {
                i10 = 2131743730;
            }
            textView.setText(org.telegram.messenger.id.M0(i10, null));
        } else {
            if (z9) {
                i7 = 2131752321;
            } else {
                i7 = 2131743733;
            }
            textView.setText(org.telegram.messenger.id.M0(i7, null));
        }
        addView(textView, c8.ha.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.f45012c = new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(24.0f), 13, this, false);
    }

    public final int a() {
        int i7;
        org.telegram.messenger.gp gpVar;
        org.telegram.messenger.fp d;
        int i10;
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.ActionBar.h6 h6Var2;
        org.telegram.ui.ActionBar.h6 h6Var3;
        org.telegram.ui.ActionBar.h6 h6Var4;
        em0 em0Var = this.d;
        km0 km0Var = em0Var.f45401p0;
        int i11 = em0Var.h;
        if (i11 < 0) {
            int i12 = org.telegram.ui.ActionBar.m6.f28170s8;
            if (org.telegram.messenger.g0.B(km0Var.getThemedColor(i12)) > 0.8f) {
                int i13 = org.telegram.ui.ActionBar.m6.f28072n6;
                h6Var4 = ((org.telegram.ui.ActionBar.f2) km0Var).resourceProvider;
                return org.telegram.ui.ActionBar.m6.w0(i13, h6Var4);
            } else if (org.telegram.messenger.g0.B(km0Var.getThemedColor(i12)) < 0.2f) {
                int i14 = org.telegram.ui.ActionBar.m6.A8;
                h6Var3 = ((org.telegram.ui.ActionBar.f2) km0Var).resourceProvider;
                return org.telegram.ui.ActionBar.m6.r1(0.5f, org.telegram.ui.ActionBar.m6.w0(i14, h6Var3));
            } else {
                int i15 = org.telegram.ui.ActionBar.m6.f27890d6;
                h6Var = ((org.telegram.ui.ActionBar.f2) km0Var).resourceProvider;
                int w02 = org.telegram.ui.ActionBar.m6.w0(i15, h6Var);
                h6Var2 = ((org.telegram.ui.ActionBar.f2) km0Var).resourceProvider;
                return org.telegram.ui.ActionBar.m6.w(w02, org.telegram.ui.ActionBar.m6.r1(0.7f, km0.B0(org.telegram.ui.ActionBar.m6.w0(i12, h6Var2))));
            }
        } else if (i11 < 7) {
            return km0Var.getThemedColor(org.telegram.ui.ActionBar.m6.f28151r8[i11]);
        } else {
            if (em0Var.m0 == 1) {
                i10 = ((org.telegram.ui.ActionBar.f2) km0Var).currentAccount;
                gpVar = org.telegram.messenger.qp.s1(i10).f24878q4;
            } else {
                i7 = ((org.telegram.ui.ActionBar.f2) km0Var).currentAccount;
                gpVar = org.telegram.messenger.qp.s1(i7).f24888r4;
            }
            if (gpVar != null && (d = gpVar.d(em0Var.h)) != null) {
                return d.f();
            }
            return km0Var.getThemedColor(org.telegram.ui.ActionBar.m6.f28151r8[0]);
        }
    }

    public final void b(boolean z9) {
        int i7;
        em0 em0Var = this.d;
        long j3 = em0Var.f45398n;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        org.telegram.ui.Components.f5 f5Var = this.f45012c;
        if (i10 != 0) {
            f5Var.j(j3, z9);
            this.f45011b = null;
            return;
        }
        f5Var.g(null, z9);
        if (this.f45011b == null) {
            if (em0Var.f45401p0.f47367a) {
                i7 = 2131752311;
            } else {
                i7 = 2131743729;
            }
            this.f45011b = new org.telegram.ui.Components.my0(org.telegram.messenger.id.M0(i7, null), 16.0f, null);
        }
    }

    public final void c() {
        int width;
        int width2;
        boolean z9 = org.telegram.messenger.id.f23161a0;
        org.telegram.ui.Components.f5 f5Var = this.f45012c;
        if (z9) {
            width = org.telegram.messenger.g0.L(21.0f);
        } else {
            width = (getWidth() - f5Var.f33467s) - org.telegram.messenger.g0.L(21.0f);
        }
        int height = (getHeight() - f5Var.f33467s) / 2;
        if (org.telegram.messenger.id.f23161a0) {
            width2 = org.telegram.messenger.g0.L(21.0f) + f5Var.f33467s;
        } else {
            width2 = getWidth() - org.telegram.messenger.g0.L(21.0f);
        }
        f5Var.setBounds(width, height, width2, (getHeight() + f5Var.f33467s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.f5 f5Var = this.f45012c;
        f5Var.k(valueOf);
        org.telegram.ui.Components.my0 my0Var = this.f45011b;
        if (my0Var != null) {
            my0Var.c((getMeasuredWidth() - this.f45011b.k()) - org.telegram.messenger.g0.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.f45401p0.getThemedColor(org.telegram.ui.ActionBar.m6.f28130q6), canvas);
        } else {
            f5Var.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f45012c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45012c.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        em0 em0Var = this.d;
        setBackgroundColor(em0Var.f45401p0.getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6));
        this.f45010a.setTextColor(em0Var.f45401p0.getThemedColor(org.telegram.ui.ActionBar.m6.G6));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
