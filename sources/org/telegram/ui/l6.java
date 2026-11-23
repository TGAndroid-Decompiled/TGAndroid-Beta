package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public class l6 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final k0 f49482a;
    public final org.telegram.ui.Components.n6 f49483b;
    public final org.telegram.ui.Components.n6 f49484c;

    public l6(Context context) {
        super(context);
        k0 k0Var = new k0(3, context, this);
        this.f49482a = k0Var;
        int i7 = org.telegram.ui.ActionBar.m6.Fi;
        k0Var.setBackground(org.telegram.ui.ActionBar.a6.f(i7, 24.0f));
        k0Var.setImportantForAccessibility(1);
        c8.sa.b(k0Var, 0.02f, 1.2f);
        if (org.telegram.messenger.hd.f24408a0) {
            TextView textView = new TextView(context);
            textView.setText(org.telegram.messenger.hd.N0(2131752086, null));
            textView.setGravity(17);
            i5.c.x(textView, 1, 14.0f);
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Ji, null);
            k0Var.addView(textView, c8.na.e(-2, -1, 17));
        }
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(true, true, true);
        this.f49483b = n6Var;
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
        n6Var.n(0.25f, 300L, nrVar);
        n6Var.setCallback(k0Var);
        n6Var.w(org.telegram.messenger.g0.L(14.0f));
        n6Var.t(org.telegram.messenger.hd.N0(2131752086, null), true, true);
        n6Var.f37751b = 5;
        n6Var.x(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.m6.Ji;
        n6Var.u(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(true, true, true);
        this.f49484c = n6Var2;
        n6Var2.n(0.25f, 300L, nrVar);
        n6Var2.setCallback(k0Var);
        n6Var2.w(org.telegram.messenger.g0.L(14.0f));
        n6Var2.x(org.telegram.messenger.g0.o());
        n6Var2.u(org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.x0(null, i7, false), org.telegram.ui.ActionBar.m6.r1(0.7f, org.telegram.ui.ActionBar.m6.x0(null, i10, false))));
        n6Var2.t("", true, true);
        k0Var.setContentDescription(TextUtils.concat(n6Var.f37758i, "\t", n6Var2.f37758i));
        addView(k0Var, c8.na.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
    }

    public final void a(long j3, boolean z10) {
        String N0;
        String i02;
        boolean z11;
        if (z10) {
            N0 = org.telegram.messenger.hd.N0(2131752086, null);
        } else {
            N0 = org.telegram.messenger.hd.N0(2131752038, null);
        }
        org.telegram.ui.Components.n6 n6Var = this.f49483b;
        n6Var.t(N0, true, true);
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i7 <= 0) {
            i02 = "";
        } else {
            i02 = org.telegram.messenger.g0.i0(j3, false, false);
        }
        org.telegram.ui.Components.n6 n6Var2 = this.f49484c;
        n6Var2.t(i02, true, true);
        if (i7 <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        setDisabled(z11);
        k0 k0Var = this.f49482a;
        k0Var.invalidate();
        k0Var.setContentDescription(TextUtils.concat(n6Var.f37758i, "\t", n6Var2.f37758i));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Fi));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    public void setDisabled(boolean z10) {
        float f10;
        k0 k0Var = this.f49482a;
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
            org.telegram.ui.Components.n6 n6Var = this.f49483b;
            if (n6Var != null) {
                n6Var.u(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ji, false));
            }
            org.telegram.ui.Components.n6 n6Var2 = this.f49484c;
            if (n6Var2 != null) {
                n6Var2.u(org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Fi, false), org.telegram.ui.ActionBar.m6.r1(0.7f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ji, false))));
            }
            k0 k0Var = this.f49482a;
            if (k0Var != null) {
                k0Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
