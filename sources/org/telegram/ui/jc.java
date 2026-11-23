package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stories;
public final class jc extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final ql0 f49085a;
    public final ic f49086b;
    public final org.telegram.ui.ActionBar.n5 f49087c;
    public final TextView d;
    public final TextView f49088e;
    public final LinearLayout f49089f;
    public final qc h;

    public jc(qc qcVar, Activity activity) {
        super(activity);
        org.telegram.ui.ActionBar.i6 i6Var;
        int i7;
        org.telegram.ui.ActionBar.i6 i6Var2;
        float f10;
        float f11;
        int i10;
        int i11;
        this.h = qcVar;
        Context context = getContext();
        i6Var = ((org.telegram.ui.ActionBar.g2) qcVar).resourceProvider;
        ql0 ql0Var = new ql0(context, i6Var);
        this.f49085a = ql0Var;
        ql0Var.setProgressToGradient(1.0f);
        ql0Var.G = true;
        addView(ql0Var, c8.na.e(-1, -1, 119));
        Context context2 = getContext();
        i7 = ((org.telegram.ui.ActionBar.g2) qcVar).currentAccount;
        long j3 = qcVar.f51401a;
        i6Var2 = ((org.telegram.ui.ActionBar.g2) qcVar).resourceProvider;
        ic icVar = new ic(this, context2, i7, j3, i6Var2);
        this.f49086b = icVar;
        boolean z10 = qcVar.d;
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
        addView(icVar, c8.na.d(-1, f12, 80, 0.0f, 0.0f, 0.0f, f11));
        if (qcVar instanceof l40) {
            org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(getContext());
            this.f49087c = n5Var;
            n5Var.setGravity(19);
            int i12 = org.telegram.ui.ActionBar.n6.A8;
            n5Var.setTextColor(qcVar.getThemedColor(i12));
            n5Var.setTypeface(org.telegram.messenger.g0.o());
            n5Var.l(org.telegram.messenger.gd.N0(2131752539, null), false);
            n5Var.setAlpha(0.0f);
            a();
            addView(n5Var, c8.na.d(-1, -2.0f, 80, 72.0f, 0.0f, 0.0f, 16.0f));
            LinearLayout linearLayout = new LinearLayout(activity);
            this.f49089f = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(org.telegram.ui.ActionBar.n6.i0(org.telegram.ui.ActionBar.n6.r1(0.065f, -16777216), -16777216));
            linearLayout.setGravity(17);
            linearLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            TextView textView = new TextView(activity);
            this.d = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(icVar.h.getTextColor());
            TextView textView2 = new TextView(activity);
            this.f49088e = textView2;
            textView2.setTextSize(1, 12.0f);
            if (qcVar.d && qcVar.f51425s == -1) {
                i10 = qcVar.getThemedColor(i12);
            } else {
                i10 = -1;
            }
            textView2.setTextColor(i10);
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = qcVar.f51405c;
            if (tL_premium_boostsStatus != null) {
                i11 = tL_premium_boostsStatus.boosts;
            } else {
                i11 = 0;
            }
            textView.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(i11, "BoostingGroupBoostCount", new Object[0])));
            textView2.setText(org.telegram.messenger.gd.N0(2131753350, null));
            linearLayout.addView(textView);
            linearLayout.addView(textView2, c8.na.k(3.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, c8.na.e(-1, -2, 80));
        }
    }

    public final void a() {
        boolean z10;
        int i7;
        float f10;
        int i10 = 0;
        if (getResources().getConfiguration().orientation == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!org.telegram.messenger.g0.Q1() && z10) {
            i7 = 18;
        } else {
            i7 = 20;
        }
        org.telegram.ui.ActionBar.n5 n5Var = this.f49087c;
        n5Var.setTextSize(i7);
        if (org.telegram.messenger.g0.Q1()) {
            f10 = -2.0f;
        } else {
            if (z10) {
                i10 = 4;
            }
            f10 = i10;
        }
        n5Var.setTranslationY(org.telegram.messenger.g0.L(f10));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
    }

    @Override
    public final void updateColors() {
        int themedColor;
        org.telegram.ui.ActionBar.n5 n5Var = this.f49087c;
        if (n5Var != null) {
            qc qcVar = this.h;
            int i7 = -1;
            if (qcVar.d && qcVar.f51425s != -1) {
                themedColor = -1;
            } else {
                themedColor = qcVar.getThemedColor(org.telegram.ui.ActionBar.n6.A8);
            }
            n5Var.setTextColor(themedColor);
            if (qcVar.d && qcVar.f51425s == -1) {
                i7 = qcVar.getThemedColor(org.telegram.ui.ActionBar.n6.A8);
            }
            this.f49088e.setTextColor(i7);
        }
    }
}
