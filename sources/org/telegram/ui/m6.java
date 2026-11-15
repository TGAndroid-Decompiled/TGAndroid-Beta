package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public class m6 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final k0 f49132a;
    public final org.telegram.ui.Components.g6 f49133b;
    public final org.telegram.ui.Components.g6 f49134c;

    public m6(Context context) {
        super(context);
        k0 k0Var = new k0(3, context, this);
        this.f49132a = k0Var;
        int i7 = org.telegram.ui.ActionBar.j6.Fi;
        k0Var.setBackground(org.telegram.ui.ActionBar.y5.f(i7, 24.0f));
        k0Var.setImportantForAccessibility(1);
        c8.na.b(k0Var, 0.02f, 1.2f);
        if (org.telegram.messenger.hd.f24104a0) {
            TextView textView = new TextView(context);
            textView.setText(org.telegram.messenger.hd.M0(2131752098, null));
            textView.setGravity(17);
            i5.c.v(textView, 1, 14.0f);
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.Ji, null);
            k0Var.addView(textView, c8.ja.e(-2, -1, 17));
        }
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(true, true, true);
        this.f49133b = g6Var;
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        g6Var.n(0.25f, 300L, erVar);
        g6Var.setCallback(k0Var);
        g6Var.w(org.telegram.messenger.g0.L(14.0f));
        g6Var.t(org.telegram.messenger.hd.M0(2131752098, null), true, true);
        g6Var.f34833b = 5;
        g6Var.x(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.j6.Ji;
        g6Var.u(org.telegram.ui.ActionBar.j6.x0(null, i10, false));
        org.telegram.ui.Components.g6 g6Var2 = new org.telegram.ui.Components.g6(true, true, true);
        this.f49134c = g6Var2;
        g6Var2.n(0.25f, 300L, erVar);
        g6Var2.setCallback(k0Var);
        g6Var2.w(org.telegram.messenger.g0.L(14.0f));
        g6Var2.x(org.telegram.messenger.g0.o());
        g6Var2.u(org.telegram.ui.ActionBar.j6.w(org.telegram.ui.ActionBar.j6.x0(null, i7, false), org.telegram.ui.ActionBar.j6.r1(0.7f, org.telegram.ui.ActionBar.j6.x0(null, i10, false))));
        g6Var2.t("", true, true);
        k0Var.setContentDescription(TextUtils.concat(g6Var.f34840i, "\t", g6Var2.f34840i));
        addView(k0Var, c8.ja.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
    }

    public final void a(long j3, boolean z10) {
        String M0;
        String i02;
        boolean z11;
        if (z10) {
            M0 = org.telegram.messenger.hd.M0(2131752098, null);
        } else {
            M0 = org.telegram.messenger.hd.M0(2131752050, null);
        }
        org.telegram.ui.Components.g6 g6Var = this.f49133b;
        g6Var.t(M0, true, true);
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i7 <= 0) {
            i02 = "";
        } else {
            i02 = org.telegram.messenger.g0.i0(j3, false, false);
        }
        org.telegram.ui.Components.g6 g6Var2 = this.f49134c;
        g6Var2.t(i02, true, true);
        if (i7 <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        setDisabled(z11);
        k0 k0Var = this.f49132a;
        k0Var.invalidate();
        k0Var.setContentDescription(TextUtils.concat(g6Var.f34840i, "\t", g6Var2.f34840i));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Fi));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    public void setDisabled(boolean z10) {
        float f10;
        k0 k0Var = this.f49132a;
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
            org.telegram.ui.Components.g6 g6Var = this.f49133b;
            if (g6Var != null) {
                g6Var.u(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ji, false));
            }
            org.telegram.ui.Components.g6 g6Var2 = this.f49134c;
            if (g6Var2 != null) {
                g6Var2.u(org.telegram.ui.ActionBar.j6.w(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Fi, false), org.telegram.ui.ActionBar.j6.r1(0.7f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ji, false))));
            }
            k0 k0Var = this.f49132a;
            if (k0Var != null) {
                k0Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
