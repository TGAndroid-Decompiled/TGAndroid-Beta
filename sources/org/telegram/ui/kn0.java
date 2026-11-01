package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class kn0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final TextView f38943a;
    public org.telegram.ui.Components.rz0 f38944b;
    public final org.telegram.ui.Components.d5 f38945c;
    public final ln0 d;

    public kn0(ln0 ln0Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.d = ln0Var;
        int i12 = org.telegram.ui.ActionBar.t6.f20930d6;
        rn0 rn0Var = ln0Var.f39334p0;
        org.telegram.ui.ActionBar.a7.i(i12, this, rn0Var.getResourceProvider());
        TextView textView = new TextView(context);
        this.f38943a = textView;
        textView.setTextSize(1, 16.0f);
        int i13 = org.telegram.ui.ActionBar.t6.G6;
        boolean z10 = rn0Var.f41110a;
        org.telegram.ui.ActionBar.a7.V(textView, i13, rn0Var.getResourceProvider());
        if (ln0Var.m0 == 1) {
            if (z10) {
                i11 = 2131752312;
            } else {
                i11 = 2131743756;
            }
            textView.setText(org.telegram.messenger.dd.L0(i11, null));
        } else {
            if (z10) {
                i10 = 2131752321;
            } else {
                i10 = 2131743759;
            }
            textView.setText(org.telegram.messenger.dd.L0(i10, null));
        }
        addView(textView, w7.b6.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.f38945c = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(24.0f), 13, this, false);
    }

    public final int a() {
        int i10;
        org.telegram.messenger.mp mpVar;
        org.telegram.messenger.lp d;
        int i11;
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.ActionBar.p6 p6Var2;
        org.telegram.ui.ActionBar.p6 p6Var3;
        org.telegram.ui.ActionBar.p6 p6Var4;
        ln0 ln0Var = this.d;
        rn0 rn0Var = ln0Var.f39334p0;
        int i12 = ln0Var.h;
        if (i12 < 0) {
            int i13 = org.telegram.ui.ActionBar.t6.f21207s8;
            if (org.telegram.messenger.i0.B(rn0Var.getThemedColor(i13)) > 0.8f) {
                int i14 = org.telegram.ui.ActionBar.t6.f21116n6;
                p6Var4 = ((org.telegram.ui.ActionBar.k2) rn0Var).resourceProvider;
                return org.telegram.ui.ActionBar.t6.w0(i14, p6Var4);
            } else if (org.telegram.messenger.i0.B(rn0Var.getThemedColor(i13)) < 0.2f) {
                int i15 = org.telegram.ui.ActionBar.t6.A8;
                p6Var3 = ((org.telegram.ui.ActionBar.k2) rn0Var).resourceProvider;
                return org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.w0(i15, p6Var3));
            } else {
                int i16 = org.telegram.ui.ActionBar.t6.f20930d6;
                p6Var = ((org.telegram.ui.ActionBar.k2) rn0Var).resourceProvider;
                int w02 = org.telegram.ui.ActionBar.t6.w0(i16, p6Var);
                p6Var2 = ((org.telegram.ui.ActionBar.k2) rn0Var).resourceProvider;
                return org.telegram.ui.ActionBar.t6.w(w02, org.telegram.ui.ActionBar.t6.r1(0.7f, rn0.B0(org.telegram.ui.ActionBar.t6.w0(i13, p6Var2))));
            }
        } else if (i12 < 7) {
            return rn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.f21189r8[i12]);
        } else {
            if (ln0Var.m0 == 1) {
                i11 = ((org.telegram.ui.ActionBar.k2) rn0Var).currentAccount;
                mpVar = org.telegram.messenger.wp.r1(i11).f19231r4;
            } else {
                i10 = ((org.telegram.ui.ActionBar.k2) rn0Var).currentAccount;
                mpVar = org.telegram.messenger.wp.r1(i10).f19241s4;
            }
            if (mpVar != null && (d = mpVar.d(ln0Var.h)) != null) {
                return d.f();
            }
            return rn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.f21189r8[0]);
        }
    }

    public final void b(boolean z10) {
        int i10;
        ln0 ln0Var = this.d;
        long j10 = ln0Var.f39331n;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.Components.d5 d5Var = this.f38945c;
        if (i11 != 0) {
            d5Var.j(j10, z10);
            this.f38944b = null;
            return;
        }
        d5Var.g(null, z10);
        if (this.f38944b == null) {
            if (ln0Var.f39334p0.f41110a) {
                i10 = 2131752311;
            } else {
                i10 = 2131743755;
            }
            this.f38944b = new org.telegram.ui.Components.rz0(org.telegram.messenger.dd.L0(i10, null), 16.0f, null);
        }
    }

    public final void c() {
        int width;
        int width2;
        boolean z10 = org.telegram.messenger.dd.X;
        org.telegram.ui.Components.d5 d5Var = this.f38945c;
        if (z10) {
            width = org.telegram.messenger.i0.L(21.0f);
        } else {
            width = (getWidth() - d5Var.f25375s) - org.telegram.messenger.i0.L(21.0f);
        }
        int height = (getHeight() - d5Var.f25375s) / 2;
        if (org.telegram.messenger.dd.X) {
            width2 = org.telegram.messenger.i0.L(21.0f) + d5Var.f25375s;
        } else {
            width2 = getWidth() - org.telegram.messenger.i0.L(21.0f);
        }
        d5Var.setBounds(width, height, width2, (getHeight() + d5Var.f25375s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.d5 d5Var = this.f38945c;
        d5Var.k(valueOf);
        org.telegram.ui.Components.rz0 rz0Var = this.f38944b;
        if (rz0Var != null) {
            rz0Var.c((getMeasuredWidth() - this.f38944b.k()) - org.telegram.messenger.i0.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.f39334p0.getThemedColor(org.telegram.ui.ActionBar.t6.q6), canvas);
        } else {
            d5Var.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38945c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38945c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        ln0 ln0Var = this.d;
        setBackgroundColor(ln0Var.f39334p0.getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6));
        this.f38943a.setTextColor(ln0Var.f39334p0.getThemedColor(org.telegram.ui.ActionBar.t6.G6));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
