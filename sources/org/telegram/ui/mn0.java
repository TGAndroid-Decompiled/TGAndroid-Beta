package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class mn0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final TextView f39738a;
    public org.telegram.ui.Components.qz0 f39739b;
    public final org.telegram.ui.Components.d5 f39740c;
    public final nn0 d;

    public mn0(nn0 nn0Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.d = nn0Var;
        int i12 = org.telegram.ui.ActionBar.t6.f20929d6;
        tn0 tn0Var = nn0Var.f40001p0;
        org.telegram.ui.ActionBar.a7.i(i12, this, tn0Var.getResourceProvider());
        TextView textView = new TextView(context);
        this.f39738a = textView;
        textView.setTextSize(1, 16.0f);
        int i13 = org.telegram.ui.ActionBar.t6.G6;
        boolean z10 = tn0Var.f41868a;
        org.telegram.ui.ActionBar.a7.V(textView, i13, tn0Var.getResourceProvider());
        if (nn0Var.m0 == 1) {
            if (z10) {
                i11 = 2131752312;
            } else {
                i11 = 2131743756;
            }
            textView.setText(org.telegram.messenger.cd.L0(i11, null));
        } else {
            if (z10) {
                i10 = 2131752321;
            } else {
                i10 = 2131743759;
            }
            textView.setText(org.telegram.messenger.cd.L0(i10, null));
        }
        addView(textView, w7.b6.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.f39740c = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(24.0f), 13, this, false);
    }

    public final int a() {
        int i10;
        org.telegram.messenger.lp lpVar;
        org.telegram.messenger.kp d;
        int i11;
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.ActionBar.p6 p6Var2;
        org.telegram.ui.ActionBar.p6 p6Var3;
        org.telegram.ui.ActionBar.p6 p6Var4;
        nn0 nn0Var = this.d;
        tn0 tn0Var = nn0Var.f40001p0;
        int i12 = nn0Var.h;
        if (i12 < 0) {
            int i13 = org.telegram.ui.ActionBar.t6.f21206s8;
            if (org.telegram.messenger.i0.B(tn0Var.getThemedColor(i13)) > 0.8f) {
                int i14 = org.telegram.ui.ActionBar.t6.f21115n6;
                p6Var4 = ((org.telegram.ui.ActionBar.k2) tn0Var).resourceProvider;
                return org.telegram.ui.ActionBar.t6.w0(i14, p6Var4);
            } else if (org.telegram.messenger.i0.B(tn0Var.getThemedColor(i13)) < 0.2f) {
                int i15 = org.telegram.ui.ActionBar.t6.A8;
                p6Var3 = ((org.telegram.ui.ActionBar.k2) tn0Var).resourceProvider;
                return org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.w0(i15, p6Var3));
            } else {
                int i16 = org.telegram.ui.ActionBar.t6.f20929d6;
                p6Var = ((org.telegram.ui.ActionBar.k2) tn0Var).resourceProvider;
                int w02 = org.telegram.ui.ActionBar.t6.w0(i16, p6Var);
                p6Var2 = ((org.telegram.ui.ActionBar.k2) tn0Var).resourceProvider;
                return org.telegram.ui.ActionBar.t6.w(w02, org.telegram.ui.ActionBar.t6.r1(0.7f, tn0.A0(org.telegram.ui.ActionBar.t6.w0(i13, p6Var2))));
            }
        } else if (i12 < 7) {
            return tn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.f21188r8[i12]);
        } else {
            if (nn0Var.m0 == 1) {
                i11 = ((org.telegram.ui.ActionBar.k2) tn0Var).currentAccount;
                lpVar = org.telegram.messenger.vp.r1(i11).f18888r4;
            } else {
                i10 = ((org.telegram.ui.ActionBar.k2) tn0Var).currentAccount;
                lpVar = org.telegram.messenger.vp.r1(i10).f18898s4;
            }
            if (lpVar != null && (d = lpVar.d(nn0Var.h)) != null) {
                return d.f();
            }
            return tn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.f21188r8[0]);
        }
    }

    public final void b(boolean z10) {
        int i10;
        nn0 nn0Var = this.d;
        long j10 = nn0Var.f39998n;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.Components.d5 d5Var = this.f39740c;
        if (i11 != 0) {
            d5Var.j(j10, z10);
            this.f39739b = null;
            return;
        }
        d5Var.g(null, z10);
        if (this.f39739b == null) {
            if (nn0Var.f40001p0.f41868a) {
                i10 = 2131752311;
            } else {
                i10 = 2131743755;
            }
            this.f39739b = new org.telegram.ui.Components.qz0(org.telegram.messenger.cd.L0(i10, null), 16.0f, null);
        }
    }

    public final void c() {
        int width;
        int width2;
        boolean z10 = org.telegram.messenger.cd.X;
        org.telegram.ui.Components.d5 d5Var = this.f39740c;
        if (z10) {
            width = org.telegram.messenger.i0.L(21.0f);
        } else {
            width = (getWidth() - d5Var.f25304s) - org.telegram.messenger.i0.L(21.0f);
        }
        int height = (getHeight() - d5Var.f25304s) / 2;
        if (org.telegram.messenger.cd.X) {
            width2 = org.telegram.messenger.i0.L(21.0f) + d5Var.f25304s;
        } else {
            width2 = getWidth() - org.telegram.messenger.i0.L(21.0f);
        }
        d5Var.setBounds(width, height, width2, (getHeight() + d5Var.f25304s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.d5 d5Var = this.f39740c;
        d5Var.k(valueOf);
        org.telegram.ui.Components.qz0 qz0Var = this.f39739b;
        if (qz0Var != null) {
            qz0Var.c((getMeasuredWidth() - this.f39739b.k()) - org.telegram.messenger.i0.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.f40001p0.getThemedColor(org.telegram.ui.ActionBar.t6.q6), canvas);
        } else {
            d5Var.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39740c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39740c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        nn0 nn0Var = this.d;
        setBackgroundColor(nn0Var.f40001p0.getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6));
        this.f39738a.setTextColor(nn0Var.f40001p0.getThemedColor(org.telegram.ui.ActionBar.t6.G6));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
