package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stories;
public final class ic extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final jl0 f46233a;
    public final hc f46234b;
    public final org.telegram.ui.ActionBar.k5 f46235c;
    public final TextView d;
    public final TextView f46236e;
    public final LinearLayout f46237f;
    public final pc h;

    public ic(pc pcVar, Activity activity) {
        super(activity);
        org.telegram.ui.ActionBar.e6 e6Var;
        int i3;
        org.telegram.ui.ActionBar.e6 e6Var2;
        float f10;
        float f11;
        int i10;
        int i11;
        this.h = pcVar;
        Context context = getContext();
        e6Var = ((org.telegram.ui.ActionBar.d2) pcVar).resourceProvider;
        jl0 jl0Var = new jl0(context, e6Var);
        this.f46233a = jl0Var;
        jl0Var.setProgressToGradient(1.0f);
        jl0Var.G = true;
        addView(jl0Var, b8.mf.e(-1, -1, 119));
        Context context2 = getContext();
        i3 = ((org.telegram.ui.ActionBar.d2) pcVar).currentAccount;
        long j10 = pcVar.f48510a;
        e6Var2 = ((org.telegram.ui.ActionBar.d2) pcVar).resourceProvider;
        hc hcVar = new hc(this, context2, i3, j10, e6Var2);
        this.f46234b = hcVar;
        boolean z10 = pcVar.d;
        if (z10) {
            f10 = 230.0f;
        } else {
            f10 = 190.0f;
        }
        float f12 = f10;
        if (z10) {
            f11 = 24.0f;
        } else {
            f11 = 0.0f;
        }
        addView(hcVar, b8.mf.d(-1, f12, 80, 0.0f, 0.0f, 0.0f, f11));
        if (pcVar instanceof e40) {
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(getContext());
            this.f46235c = k5Var;
            k5Var.setGravity(19);
            int i12 = org.telegram.ui.ActionBar.k6.A8;
            k5Var.setTextColor(pcVar.getThemedColor(i12));
            k5Var.setTypeface(org.telegram.messenger.g0.o());
            k5Var.l(org.telegram.messenger.bd.M0(2131752551, null), false);
            k5Var.setAlpha(0.0f);
            a();
            addView(k5Var, b8.mf.d(-1, -2.0f, 80, 72.0f, 0.0f, 0.0f, 16.0f));
            LinearLayout linearLayout = new LinearLayout(activity);
            this.f46237f = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(org.telegram.ui.ActionBar.k6.i0(org.telegram.ui.ActionBar.k6.r1(0.065f, -16777216), -16777216));
            linearLayout.setGravity(17);
            linearLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            TextView textView = new TextView(activity);
            this.d = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(hcVar.h.getTextColor());
            TextView textView2 = new TextView(activity);
            this.f46236e = textView2;
            textView2.setTextSize(1, 12.0f);
            if (pcVar.d && pcVar.f48534s == -1) {
                i10 = pcVar.getThemedColor(i12);
            } else {
                i10 = -1;
            }
            textView2.setTextColor(i10);
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = pcVar.f48514c;
            if (tL_premium_boostsStatus != null) {
                i11 = tL_premium_boostsStatus.boosts;
            } else {
                i11 = 0;
            }
            textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(i11, "BoostingGroupBoostCount", new Object[0])));
            textView2.setText(org.telegram.messenger.bd.M0(2131753353, null));
            linearLayout.addView(textView);
            linearLayout.addView(textView2, b8.mf.k(3.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, b8.mf.e(-1, -2, 80));
        }
    }

    public final void a() {
        boolean z10;
        int i3;
        float f10;
        int i10 = 0;
        if (getResources().getConfiguration().orientation == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!org.telegram.messenger.g0.Q1() && z10) {
            i3 = 18;
        } else {
            i3 = 20;
        }
        org.telegram.ui.ActionBar.k5 k5Var = this.f46235c;
        k5Var.setTextSize(i3);
        if (org.telegram.messenger.g0.Q1()) {
            f10 = -2.0f;
        } else {
            if (z10) {
                i10 = 4;
            }
            f10 = i10;
        }
        k5Var.setTranslationY(org.telegram.messenger.g0.L(f10));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
    }

    @Override
    public final void updateColors() {
        int themedColor;
        org.telegram.ui.ActionBar.k5 k5Var = this.f46235c;
        if (k5Var != null) {
            pc pcVar = this.h;
            int i3 = -1;
            if (pcVar.d && pcVar.f48534s != -1) {
                themedColor = -1;
            } else {
                themedColor = pcVar.getThemedColor(org.telegram.ui.ActionBar.k6.A8);
            }
            k5Var.setTextColor(themedColor);
            if (pcVar.d && pcVar.f48534s == -1) {
                i3 = pcVar.getThemedColor(org.telegram.ui.ActionBar.k6.A8);
            }
            this.f46236e.setTextColor(i3);
        }
    }
}
