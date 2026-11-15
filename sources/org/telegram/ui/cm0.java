package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class cm0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final TextView f46176a;
    public org.telegram.ui.Components.oy0 f46177b;
    public final org.telegram.ui.Components.e5 f46178c;
    public final dm0 d;

    public cm0(dm0 dm0Var, Context context) {
        super(context);
        int i7;
        int i10;
        this.d = dm0Var;
        int i11 = org.telegram.ui.ActionBar.j6.f28849d6;
        jm0 jm0Var = dm0Var.f46419q0;
        org.telegram.ui.ActionBar.q6.h(i11, this, jm0Var.getResourceProvider());
        TextView textView = new TextView(context);
        this.f46176a = textView;
        textView.setTextSize(1, 16.0f);
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        boolean z10 = jm0Var.f48368a;
        org.telegram.ui.ActionBar.q6.U(textView, i12, jm0Var.getResourceProvider());
        if (dm0Var.f46416n0 == 1) {
            if (z10) {
                i10 = 2131752312;
            } else {
                i10 = 2131743730;
            }
            textView.setText(org.telegram.messenger.hd.M0(i10, null));
        } else {
            if (z10) {
                i7 = 2131752321;
            } else {
                i7 = 2131743733;
            }
            textView.setText(org.telegram.messenger.hd.M0(i7, null));
        }
        addView(textView, c8.ja.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.f46178c = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(24.0f), 13, this, false);
    }

    public final int a() {
        int i7;
        org.telegram.messenger.dp dpVar;
        org.telegram.messenger.cp d;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        org.telegram.ui.ActionBar.e6 e6Var4;
        dm0 dm0Var = this.d;
        jm0 jm0Var = dm0Var.f46419q0;
        int i11 = dm0Var.h;
        if (i11 < 0) {
            int i12 = org.telegram.ui.ActionBar.j6.f29129s8;
            if (org.telegram.messenger.g0.B(jm0Var.getThemedColor(i12)) > 0.8f) {
                int i13 = org.telegram.ui.ActionBar.j6.f29031n6;
                e6Var4 = ((org.telegram.ui.ActionBar.e2) jm0Var).resourceProvider;
                return org.telegram.ui.ActionBar.j6.w0(i13, e6Var4);
            } else if (org.telegram.messenger.g0.B(jm0Var.getThemedColor(i12)) < 0.2f) {
                int i14 = org.telegram.ui.ActionBar.j6.A8;
                e6Var3 = ((org.telegram.ui.ActionBar.e2) jm0Var).resourceProvider;
                return org.telegram.ui.ActionBar.j6.r1(0.5f, org.telegram.ui.ActionBar.j6.w0(i14, e6Var3));
            } else {
                int i15 = org.telegram.ui.ActionBar.j6.f28849d6;
                e6Var = ((org.telegram.ui.ActionBar.e2) jm0Var).resourceProvider;
                int w02 = org.telegram.ui.ActionBar.j6.w0(i15, e6Var);
                e6Var2 = ((org.telegram.ui.ActionBar.e2) jm0Var).resourceProvider;
                return org.telegram.ui.ActionBar.j6.w(w02, org.telegram.ui.ActionBar.j6.r1(0.7f, jm0.B0(org.telegram.ui.ActionBar.j6.w0(i12, e6Var2))));
            }
        } else if (i11 < 7) {
            return jm0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f29110r8[i11]);
        } else {
            if (dm0Var.f46416n0 == 1) {
                i10 = ((org.telegram.ui.ActionBar.e2) jm0Var).currentAccount;
                dpVar = org.telegram.messenger.np.s1(i10).f25383r4;
            } else {
                i7 = ((org.telegram.ui.ActionBar.e2) jm0Var).currentAccount;
                dpVar = org.telegram.messenger.np.s1(i7).f25393s4;
            }
            if (dpVar != null && (d = dpVar.d(dm0Var.h)) != null) {
                return d.f();
            }
            return jm0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f29110r8[0]);
        }
    }

    public final void b(boolean z10) {
        int i7;
        dm0 dm0Var = this.d;
        long j3 = dm0Var.f46415n;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        org.telegram.ui.Components.e5 e5Var = this.f46178c;
        if (i10 != 0) {
            e5Var.j(j3, z10);
            this.f46177b = null;
            return;
        }
        e5Var.g(null, z10);
        if (this.f46177b == null) {
            if (dm0Var.f46419q0.f48368a) {
                i7 = 2131752311;
            } else {
                i7 = 2131743729;
            }
            this.f46177b = new org.telegram.ui.Components.oy0(org.telegram.messenger.hd.M0(i7, null), 16.0f, null);
        }
    }

    public final void c() {
        int width;
        int width2;
        boolean z10 = org.telegram.messenger.hd.f24104a0;
        org.telegram.ui.Components.e5 e5Var = this.f46178c;
        if (z10) {
            width = org.telegram.messenger.g0.L(21.0f);
        } else {
            width = (getWidth() - e5Var.f34184s) - org.telegram.messenger.g0.L(21.0f);
        }
        int height = (getHeight() - e5Var.f34184s) / 2;
        if (org.telegram.messenger.hd.f24104a0) {
            width2 = org.telegram.messenger.g0.L(21.0f) + e5Var.f34184s;
        } else {
            width2 = getWidth() - org.telegram.messenger.g0.L(21.0f);
        }
        e5Var.setBounds(width, height, width2, (getHeight() + e5Var.f34184s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.e5 e5Var = this.f46178c;
        e5Var.k(valueOf);
        org.telegram.ui.Components.oy0 oy0Var = this.f46177b;
        if (oy0Var != null) {
            oy0Var.c((getMeasuredWidth() - this.f46177b.k()) - org.telegram.messenger.g0.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.f46419q0.getThemedColor(org.telegram.ui.ActionBar.j6.f29089q6), canvas);
        } else {
            e5Var.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f46178c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f46178c.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        dm0 dm0Var = this.d;
        setBackgroundColor(dm0Var.f46419q0.getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6));
        this.f46176a.setTextColor(dm0Var.f46419q0.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
