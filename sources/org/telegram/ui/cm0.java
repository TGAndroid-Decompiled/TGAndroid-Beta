package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class cm0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final TextView f44364a;
    public org.telegram.ui.Components.ny0 f44365b;
    public final org.telegram.ui.Components.g5 f44366c;
    public final dm0 d;

    public cm0(dm0 dm0Var, Context context) {
        super(context);
        int i7;
        int i10;
        this.d = dm0Var;
        int i11 = org.telegram.ui.ActionBar.l6.f27865d6;
        jm0 jm0Var = dm0Var.f45078p0;
        org.telegram.ui.ActionBar.s6.h(i11, this, jm0Var.getResourceProvider());
        TextView textView = new TextView(context);
        this.f44364a = textView;
        textView.setTextSize(1, 16.0f);
        int i12 = org.telegram.ui.ActionBar.l6.G6;
        boolean z9 = jm0Var.f47036a;
        org.telegram.ui.ActionBar.s6.U(textView, i12, jm0Var.getResourceProvider());
        if (dm0Var.m0 == 1) {
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
        this.f44366c = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(24.0f), 13, this, false);
    }

    public final int a() {
        int i7;
        org.telegram.messenger.gp gpVar;
        org.telegram.messenger.fp d;
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        org.telegram.ui.ActionBar.g6 g6Var4;
        dm0 dm0Var = this.d;
        jm0 jm0Var = dm0Var.f45078p0;
        int i11 = dm0Var.h;
        if (i11 < 0) {
            int i12 = org.telegram.ui.ActionBar.l6.f28145s8;
            if (org.telegram.messenger.g0.B(jm0Var.getThemedColor(i12)) > 0.8f) {
                int i13 = org.telegram.ui.ActionBar.l6.f28047n6;
                g6Var4 = ((org.telegram.ui.ActionBar.f2) jm0Var).resourceProvider;
                return org.telegram.ui.ActionBar.l6.w0(i13, g6Var4);
            } else if (org.telegram.messenger.g0.B(jm0Var.getThemedColor(i12)) < 0.2f) {
                int i14 = org.telegram.ui.ActionBar.l6.A8;
                g6Var3 = ((org.telegram.ui.ActionBar.f2) jm0Var).resourceProvider;
                return org.telegram.ui.ActionBar.l6.r1(0.5f, org.telegram.ui.ActionBar.l6.w0(i14, g6Var3));
            } else {
                int i15 = org.telegram.ui.ActionBar.l6.f27865d6;
                g6Var = ((org.telegram.ui.ActionBar.f2) jm0Var).resourceProvider;
                int w02 = org.telegram.ui.ActionBar.l6.w0(i15, g6Var);
                g6Var2 = ((org.telegram.ui.ActionBar.f2) jm0Var).resourceProvider;
                return org.telegram.ui.ActionBar.l6.w(w02, org.telegram.ui.ActionBar.l6.r1(0.7f, jm0.B0(org.telegram.ui.ActionBar.l6.w0(i12, g6Var2))));
            }
        } else if (i11 < 7) {
            return jm0Var.getThemedColor(org.telegram.ui.ActionBar.l6.f28126r8[i11]);
        } else {
            if (dm0Var.m0 == 1) {
                i10 = ((org.telegram.ui.ActionBar.f2) jm0Var).currentAccount;
                gpVar = org.telegram.messenger.qp.s1(i10).f24874q4;
            } else {
                i7 = ((org.telegram.ui.ActionBar.f2) jm0Var).currentAccount;
                gpVar = org.telegram.messenger.qp.s1(i7).f24884r4;
            }
            if (gpVar != null && (d = gpVar.d(dm0Var.h)) != null) {
                return d.f();
            }
            return jm0Var.getThemedColor(org.telegram.ui.ActionBar.l6.f28126r8[0]);
        }
    }

    public final void b(boolean z9) {
        int i7;
        dm0 dm0Var = this.d;
        long j3 = dm0Var.f45075n;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        org.telegram.ui.Components.g5 g5Var = this.f44366c;
        if (i10 != 0) {
            g5Var.j(j3, z9);
            this.f44365b = null;
            return;
        }
        g5Var.g(null, z9);
        if (this.f44365b == null) {
            if (dm0Var.f45078p0.f47036a) {
                i7 = 2131752311;
            } else {
                i7 = 2131743729;
            }
            this.f44365b = new org.telegram.ui.Components.ny0(org.telegram.messenger.id.M0(i7, null), 16.0f, null);
        }
    }

    public final void c() {
        int width;
        int width2;
        boolean z9 = org.telegram.messenger.id.f23157a0;
        org.telegram.ui.Components.g5 g5Var = this.f44366c;
        if (z9) {
            width = org.telegram.messenger.g0.L(21.0f);
        } else {
            width = (getWidth() - g5Var.f33869s) - org.telegram.messenger.g0.L(21.0f);
        }
        int height = (getHeight() - g5Var.f33869s) / 2;
        if (org.telegram.messenger.id.f23157a0) {
            width2 = org.telegram.messenger.g0.L(21.0f) + g5Var.f33869s;
        } else {
            width2 = getWidth() - org.telegram.messenger.g0.L(21.0f);
        }
        g5Var.setBounds(width, height, width2, (getHeight() + g5Var.f33869s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.g5 g5Var = this.f44366c;
        g5Var.k(valueOf);
        org.telegram.ui.Components.ny0 ny0Var = this.f44365b;
        if (ny0Var != null) {
            ny0Var.c((getMeasuredWidth() - this.f44365b.k()) - org.telegram.messenger.g0.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.f45078p0.getThemedColor(org.telegram.ui.ActionBar.l6.f28105q6), canvas);
        } else {
            g5Var.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f44366c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f44366c.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        dm0 dm0Var = this.d;
        setBackgroundColor(dm0Var.f45078p0.getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6));
        this.f44364a.setTextColor(dm0Var.f45078p0.getThemedColor(org.telegram.ui.ActionBar.l6.G6));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
