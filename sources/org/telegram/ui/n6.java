package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public class n6 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final l0 f47894a;
    public final org.telegram.ui.Components.g6 f47895b;
    public final org.telegram.ui.Components.g6 f47896c;

    public n6(Context context) {
        super(context);
        l0 l0Var = new l0(3, context, this);
        this.f47894a = l0Var;
        int i3 = org.telegram.ui.ActionBar.k6.Ci;
        l0Var.setBackground(org.telegram.ui.ActionBar.y5.f(i3, 24.0f));
        l0Var.setImportantForAccessibility(1);
        b8.pf.b(l0Var, 0.02f, 1.2f);
        if (org.telegram.messenger.bd.f21784a0) {
            TextView textView = new TextView(context);
            textView.setText(org.telegram.messenger.bd.M0(2131752098, null));
            textView.setGravity(17);
            k2.p1.t(textView, 1, 14.0f);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Gi, null);
            l0Var.addView(textView, b8.mf.e(-2, -1, 17));
        }
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(true, true, true);
        this.f47895b = g6Var;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        g6Var.n(0.25f, 300L, xqVar);
        g6Var.setCallback(l0Var);
        g6Var.w(org.telegram.messenger.g0.L(14.0f));
        g6Var.t(org.telegram.messenger.bd.M0(2131752098, null), true, true);
        g6Var.f33983b = 5;
        g6Var.x(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.k6.Gi;
        g6Var.u(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        org.telegram.ui.Components.g6 g6Var2 = new org.telegram.ui.Components.g6(true, true, true);
        this.f47896c = g6Var2;
        g6Var2.n(0.25f, 300L, xqVar);
        g6Var2.setCallback(l0Var);
        g6Var2.w(org.telegram.messenger.g0.L(14.0f));
        g6Var2.x(org.telegram.messenger.g0.o());
        g6Var2.u(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.x0(null, i3, false), org.telegram.ui.ActionBar.k6.r1(0.7f, org.telegram.ui.ActionBar.k6.x0(null, i10, false))));
        g6Var2.t("", true, true);
        l0Var.setContentDescription(TextUtils.concat(g6Var.f33989i, "\t", g6Var2.f33989i));
        addView(l0Var, b8.mf.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
    }

    public final void a(long j10, boolean z10) {
        String M0;
        String i02;
        boolean z11;
        if (z10) {
            M0 = org.telegram.messenger.bd.M0(2131752098, null);
        } else {
            M0 = org.telegram.messenger.bd.M0(2131752050, null);
        }
        org.telegram.ui.Components.g6 g6Var = this.f47895b;
        g6Var.t(M0, true, true);
        int i3 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i3 <= 0) {
            i02 = "";
        } else {
            i02 = org.telegram.messenger.g0.i0(j10, false, false);
        }
        org.telegram.ui.Components.g6 g6Var2 = this.f47896c;
        g6Var2.t(i02, true, true);
        if (i3 <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        setDisabled(z11);
        l0 l0Var = this.f47894a;
        l0Var.invalidate();
        l0Var.setContentDescription(TextUtils.concat(g6Var.f33989i, "\t", g6Var2.f33989i));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ci));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i10);
    }

    public void setDisabled(boolean z10) {
        float f10;
        l0 l0Var = this.f47894a;
        l0Var.animate().cancel();
        ViewPropertyAnimator animate = l0Var.animate();
        if (z10) {
            f10 = 0.65f;
        } else {
            f10 = 1.0f;
        }
        animate.alpha(f10).start();
        l0Var.setClickable(!z10);
    }

    @Override
    public final void updateColors() {
        try {
            org.telegram.ui.Components.g6 g6Var = this.f47895b;
            if (g6Var != null) {
                g6Var.u(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false));
            }
            org.telegram.ui.Components.g6 g6Var2 = this.f47896c;
            if (g6Var2 != null) {
                g6Var2.u(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false), org.telegram.ui.ActionBar.k6.r1(0.7f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false))));
            }
            l0 l0Var = this.f47894a;
            if (l0Var != null) {
                l0Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
