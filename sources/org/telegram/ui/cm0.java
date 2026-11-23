package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class cm0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final TextView f46827a;
    public org.telegram.ui.Components.wy0 f46828b;
    public final org.telegram.ui.Components.m5 f46829c;
    public final dm0 d;

    public cm0(dm0 dm0Var, Context context) {
        super(context);
        int i7;
        int i10;
        this.d = dm0Var;
        int i11 = org.telegram.ui.ActionBar.n6.f29451d6;
        jm0 jm0Var = dm0Var.f47185q0;
        org.telegram.ui.ActionBar.u6.h(i11, this, jm0Var.getResourceProvider());
        TextView textView = new TextView(context);
        this.f46827a = textView;
        textView.setTextSize(1, 16.0f);
        int i12 = org.telegram.ui.ActionBar.n6.G6;
        boolean z10 = jm0Var.f49154a;
        org.telegram.ui.ActionBar.u6.U(textView, i12, jm0Var.getResourceProvider());
        if (dm0Var.f47182n0 == 1) {
            if (z10) {
                i10 = 2131752300;
            } else {
                i10 = 2131743483;
            }
            textView.setText(org.telegram.messenger.gd.N0(i10, null));
        } else {
            if (z10) {
                i7 = 2131752309;
            } else {
                i7 = 2131743486;
            }
            textView.setText(org.telegram.messenger.gd.N0(i7, null));
        }
        addView(textView, c8.na.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.f46829c = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(24.0f), 13, this, false);
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
        dm0 dm0Var = this.d;
        jm0 jm0Var = dm0Var.f47185q0;
        int i11 = dm0Var.h;
        if (i11 < 0) {
            int i12 = org.telegram.ui.ActionBar.n6.f29731s8;
            if (org.telegram.messenger.g0.B(jm0Var.getThemedColor(i12)) > 0.8f) {
                int i13 = org.telegram.ui.ActionBar.n6.f29633n6;
                i6Var4 = ((org.telegram.ui.ActionBar.g2) jm0Var).resourceProvider;
                return org.telegram.ui.ActionBar.n6.w0(i13, i6Var4);
            } else if (org.telegram.messenger.g0.B(jm0Var.getThemedColor(i12)) < 0.2f) {
                int i14 = org.telegram.ui.ActionBar.n6.A8;
                i6Var3 = ((org.telegram.ui.ActionBar.g2) jm0Var).resourceProvider;
                return org.telegram.ui.ActionBar.n6.r1(0.5f, org.telegram.ui.ActionBar.n6.w0(i14, i6Var3));
            } else {
                int i15 = org.telegram.ui.ActionBar.n6.f29451d6;
                i6Var = ((org.telegram.ui.ActionBar.g2) jm0Var).resourceProvider;
                int w02 = org.telegram.ui.ActionBar.n6.w0(i15, i6Var);
                i6Var2 = ((org.telegram.ui.ActionBar.g2) jm0Var).resourceProvider;
                return org.telegram.ui.ActionBar.n6.w(w02, org.telegram.ui.ActionBar.n6.r1(0.7f, jm0.B0(org.telegram.ui.ActionBar.n6.w0(i12, i6Var2))));
            }
        } else if (i11 < 7) {
            return jm0Var.getThemedColor(org.telegram.ui.ActionBar.n6.f29712r8[i11]);
        } else {
            if (dm0Var.f47182n0 == 1) {
                i10 = ((org.telegram.ui.ActionBar.g2) jm0Var).currentAccount;
                cpVar = org.telegram.messenger.mp.u1(i10).f25862t4;
            } else {
                i7 = ((org.telegram.ui.ActionBar.g2) jm0Var).currentAccount;
                cpVar = org.telegram.messenger.mp.u1(i7).f25870u4;
            }
            if (cpVar != null && (d = cpVar.d(dm0Var.h)) != null) {
                return d.f();
            }
            return jm0Var.getThemedColor(org.telegram.ui.ActionBar.n6.f29712r8[0]);
        }
    }

    public final void b(boolean z10) {
        int i7;
        dm0 dm0Var = this.d;
        long j3 = dm0Var.f47181n;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        org.telegram.ui.Components.m5 m5Var = this.f46829c;
        if (i10 != 0) {
            m5Var.j(j3, z10);
            this.f46828b = null;
            return;
        }
        m5Var.g(null, z10);
        if (this.f46828b == null) {
            if (dm0Var.f47185q0.f49154a) {
                i7 = 2131752299;
            } else {
                i7 = 2131743482;
            }
            this.f46828b = new org.telegram.ui.Components.wy0(org.telegram.messenger.gd.N0(i7, null), 16.0f, null);
        }
    }

    public final void c() {
        int width;
        int width2;
        boolean z10 = org.telegram.messenger.gd.f24314a0;
        org.telegram.ui.Components.m5 m5Var = this.f46829c;
        if (z10) {
            width = org.telegram.messenger.g0.L(21.0f);
        } else {
            width = (getWidth() - m5Var.f37379s) - org.telegram.messenger.g0.L(21.0f);
        }
        int height = (getHeight() - m5Var.f37379s) / 2;
        if (org.telegram.messenger.gd.f24314a0) {
            width2 = org.telegram.messenger.g0.L(21.0f) + m5Var.f37379s;
        } else {
            width2 = getWidth() - org.telegram.messenger.g0.L(21.0f);
        }
        m5Var.setBounds(width, height, width2, (getHeight() + m5Var.f37379s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.m5 m5Var = this.f46829c;
        m5Var.k(valueOf);
        org.telegram.ui.Components.wy0 wy0Var = this.f46828b;
        if (wy0Var != null) {
            wy0Var.c((getMeasuredWidth() - this.f46828b.k()) - org.telegram.messenger.g0.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.f47185q0.getThemedColor(org.telegram.ui.ActionBar.n6.f29691q6), canvas);
        } else {
            m5Var.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f46829c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f46829c.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        dm0 dm0Var = this.d;
        setBackgroundColor(dm0Var.f47185q0.getThemedColor(org.telegram.ui.ActionBar.n6.f29451d6));
        this.f46827a.setTextColor(dm0Var.f47185q0.getThemedColor(org.telegram.ui.ActionBar.n6.G6));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
