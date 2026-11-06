package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class am0 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final TextView f43679a;
    public org.telegram.ui.Components.ly0 f43680b;
    public final org.telegram.ui.Components.g5 f43681c;
    public final bm0 d;

    public am0(bm0 bm0Var, Context context) {
        super(context);
        int i7;
        int i10;
        this.d = bm0Var;
        int i11 = org.telegram.ui.ActionBar.k6.f27848d6;
        hm0 hm0Var = bm0Var.f44431p0;
        org.telegram.ui.ActionBar.r6.i(i11, this, hm0Var.getResourceProvider());
        TextView textView = new TextView(context);
        this.f43679a = textView;
        textView.setTextSize(1, 16.0f);
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        boolean z9 = hm0Var.f46430a;
        org.telegram.ui.ActionBar.r6.V(textView, i12, hm0Var.getResourceProvider());
        if (bm0Var.m0 == 1) {
            if (z9) {
                i10 = 2131752312;
            } else {
                i10 = 2131743731;
            }
            textView.setText(org.telegram.messenger.hd.M0(i10, null));
        } else {
            if (z9) {
                i7 = 2131752321;
            } else {
                i7 = 2131743734;
            }
            textView.setText(org.telegram.messenger.hd.M0(i7, null));
        }
        addView(textView, c8.ha.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.f43681c = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(24.0f), 13, this, false);
    }

    public final int a() {
        int i7;
        org.telegram.messenger.gp gpVar;
        org.telegram.messenger.fp d;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        org.telegram.ui.ActionBar.f6 f6Var4;
        bm0 bm0Var = this.d;
        hm0 hm0Var = bm0Var.f44431p0;
        int i11 = bm0Var.h;
        if (i11 < 0) {
            int i12 = org.telegram.ui.ActionBar.k6.f28128s8;
            if (org.telegram.messenger.g0.B(hm0Var.getThemedColor(i12)) > 0.8f) {
                int i13 = org.telegram.ui.ActionBar.k6.f28030n6;
                f6Var4 = ((org.telegram.ui.ActionBar.f2) hm0Var).resourceProvider;
                return org.telegram.ui.ActionBar.k6.w0(i13, f6Var4);
            } else if (org.telegram.messenger.g0.B(hm0Var.getThemedColor(i12)) < 0.2f) {
                int i14 = org.telegram.ui.ActionBar.k6.A8;
                f6Var3 = ((org.telegram.ui.ActionBar.f2) hm0Var).resourceProvider;
                return org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.w0(i14, f6Var3));
            } else {
                int i15 = org.telegram.ui.ActionBar.k6.f27848d6;
                f6Var = ((org.telegram.ui.ActionBar.f2) hm0Var).resourceProvider;
                int w02 = org.telegram.ui.ActionBar.k6.w0(i15, f6Var);
                f6Var2 = ((org.telegram.ui.ActionBar.f2) hm0Var).resourceProvider;
                return org.telegram.ui.ActionBar.k6.w(w02, org.telegram.ui.ActionBar.k6.r1(0.7f, hm0.B0(org.telegram.ui.ActionBar.k6.w0(i12, f6Var2))));
            }
        } else if (i11 < 7) {
            return hm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f28109r8[i11]);
        } else {
            if (bm0Var.m0 == 1) {
                i10 = ((org.telegram.ui.ActionBar.f2) hm0Var).currentAccount;
                gpVar = org.telegram.messenger.qp.s1(i10).f24859q4;
            } else {
                i7 = ((org.telegram.ui.ActionBar.f2) hm0Var).currentAccount;
                gpVar = org.telegram.messenger.qp.s1(i7).f24869r4;
            }
            if (gpVar != null && (d = gpVar.d(bm0Var.h)) != null) {
                return d.f();
            }
            return hm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f28109r8[0]);
        }
    }

    public final void b(boolean z9) {
        int i7;
        bm0 bm0Var = this.d;
        long j3 = bm0Var.f44428n;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        org.telegram.ui.Components.g5 g5Var = this.f43681c;
        if (i10 != 0) {
            g5Var.j(j3, z9);
            this.f43680b = null;
            return;
        }
        g5Var.g(null, z9);
        if (this.f43680b == null) {
            if (bm0Var.f44431p0.f46430a) {
                i7 = 2131752311;
            } else {
                i7 = 2131743730;
            }
            this.f43680b = new org.telegram.ui.Components.ly0(org.telegram.messenger.hd.M0(i7, null), 16.0f, null);
        }
    }

    public final void c() {
        int width;
        int width2;
        boolean z9 = org.telegram.messenger.hd.f22871a0;
        org.telegram.ui.Components.g5 g5Var = this.f43681c;
        if (z9) {
            width = org.telegram.messenger.g0.L(21.0f);
        } else {
            width = (getWidth() - g5Var.f33861s) - org.telegram.messenger.g0.L(21.0f);
        }
        int height = (getHeight() - g5Var.f33861s) / 2;
        if (org.telegram.messenger.hd.f22871a0) {
            width2 = org.telegram.messenger.g0.L(21.0f) + g5Var.f33861s;
        } else {
            width2 = getWidth() - org.telegram.messenger.g0.L(21.0f);
        }
        g5Var.setBounds(width, height, width2, (getHeight() + g5Var.f33861s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.g5 g5Var = this.f43681c;
        g5Var.k(valueOf);
        org.telegram.ui.Components.ly0 ly0Var = this.f43680b;
        if (ly0Var != null) {
            ly0Var.c((getMeasuredWidth() - this.f43680b.k()) - org.telegram.messenger.g0.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.f44431p0.getThemedColor(org.telegram.ui.ActionBar.k6.f28088q6), canvas);
        } else {
            g5Var.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43681c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f43681c.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        bm0 bm0Var = this.d;
        setBackgroundColor(bm0Var.f44431p0.getThemedColor(org.telegram.ui.ActionBar.k6.f27848d6));
        this.f43679a.setTextColor(bm0Var.f44431p0.getThemedColor(org.telegram.ui.ActionBar.k6.G6));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
