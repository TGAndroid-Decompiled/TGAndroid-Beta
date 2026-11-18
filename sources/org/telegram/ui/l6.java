package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public class l6 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final k0 f49462a;
    public final org.telegram.ui.Components.m6 f49463b;
    public final org.telegram.ui.Components.m6 f49464c;

    public l6(Context context) {
        super(context);
        k0 k0Var = new k0(3, context, this);
        this.f49462a = k0Var;
        int i7 = org.telegram.ui.ActionBar.n6.Fi;
        k0Var.setBackground(org.telegram.ui.ActionBar.b6.f(i7, 24.0f));
        k0Var.setImportantForAccessibility(1);
        c8.ra.b(k0Var, 0.02f, 1.2f);
        if (org.telegram.messenger.gd.f24213a0) {
            TextView textView = new TextView(context);
            textView.setText(org.telegram.messenger.gd.M0(2131752087, null));
            textView.setGravity(17);
            i5.c.x(textView, 1, 14.0f);
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Ji, null);
            k0Var.addView(textView, c8.ma.e(-2, -1, 17));
        }
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(true, true, true);
        this.f49463b = m6Var;
        org.telegram.ui.Components.lr lrVar = org.telegram.ui.Components.lr.h;
        m6Var.n(0.25f, 300L, lrVar);
        m6Var.setCallback(k0Var);
        m6Var.w(org.telegram.messenger.g0.L(14.0f));
        m6Var.t(org.telegram.messenger.gd.M0(2131752087, null), true, true);
        m6Var.f37377b = 5;
        m6Var.x(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.n6.Ji;
        m6Var.u(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
        org.telegram.ui.Components.m6 m6Var2 = new org.telegram.ui.Components.m6(true, true, true);
        this.f49464c = m6Var2;
        m6Var2.n(0.25f, 300L, lrVar);
        m6Var2.setCallback(k0Var);
        m6Var2.w(org.telegram.messenger.g0.L(14.0f));
        m6Var2.x(org.telegram.messenger.g0.o());
        m6Var2.u(org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.x0(null, i7, false), org.telegram.ui.ActionBar.n6.r1(0.7f, org.telegram.ui.ActionBar.n6.x0(null, i10, false))));
        m6Var2.t("", true, true);
        k0Var.setContentDescription(TextUtils.concat(m6Var.f37384i, "\t", m6Var2.f37384i));
        addView(k0Var, c8.ma.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
    }

    public final void a(long j3, boolean z10) {
        String M0;
        String i02;
        boolean z11;
        if (z10) {
            M0 = org.telegram.messenger.gd.M0(2131752087, null);
        } else {
            M0 = org.telegram.messenger.gd.M0(2131752039, null);
        }
        org.telegram.ui.Components.m6 m6Var = this.f49463b;
        m6Var.t(M0, true, true);
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i7 <= 0) {
            i02 = "";
        } else {
            i02 = org.telegram.messenger.g0.i0(j3, false, false);
        }
        org.telegram.ui.Components.m6 m6Var2 = this.f49464c;
        m6Var2.t(i02, true, true);
        if (i7 <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        setDisabled(z11);
        k0 k0Var = this.f49462a;
        k0Var.invalidate();
        k0Var.setContentDescription(TextUtils.concat(m6Var.f37384i, "\t", m6Var2.f37384i));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Fi));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    public void setDisabled(boolean z10) {
        float f10;
        k0 k0Var = this.f49462a;
        k0Var.animate().cancel();
        ViewPropertyAnimator animate = k0Var.animate();
        if (z10) {
            f10 = 0.65f;
        } else {
            f10 = 1.0f;
        }
        animate.alpha(f10).start();
        k0Var.setClickable(!z10);
    }

    @Override
    public final void updateColors() {
        try {
            org.telegram.ui.Components.m6 m6Var = this.f49463b;
            if (m6Var != null) {
                m6Var.u(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ji, false));
            }
            org.telegram.ui.Components.m6 m6Var2 = this.f49464c;
            if (m6Var2 != null) {
                m6Var2.u(org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fi, false), org.telegram.ui.ActionBar.n6.r1(0.7f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ji, false))));
            }
            k0 k0Var = this.f49462a;
            if (k0Var != null) {
                k0Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
