package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stories;
public final class kc extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final ol0 f47162a;
    public final jc f47163b;
    public final org.telegram.ui.ActionBar.k5 f47164c;
    public final TextView d;
    public final TextView f47165e;
    public final LinearLayout f47166f;
    public final rc h;

    public kc(rc rcVar, Activity activity) {
        super(activity);
        org.telegram.ui.ActionBar.f6 f6Var;
        int i7;
        org.telegram.ui.ActionBar.f6 f6Var2;
        float f10;
        float f11;
        int i10;
        int i11;
        this.h = rcVar;
        Context context = getContext();
        f6Var = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
        ol0 ol0Var = new ol0(context, f6Var);
        this.f47162a = ol0Var;
        ol0Var.setProgressToGradient(1.0f);
        ol0Var.F = true;
        addView(ol0Var, c8.ha.e(-1, -1, 119));
        Context context2 = getContext();
        i7 = ((org.telegram.ui.ActionBar.f2) rcVar).currentAccount;
        long j3 = rcVar.f49447a;
        f6Var2 = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
        jc jcVar = new jc(this, context2, i7, j3, f6Var2);
        this.f47163b = jcVar;
        boolean z9 = rcVar.d;
        if (z9) {
            f10 = 230.0f;
        } else {
            f10 = 190.0f;
        }
        float f12 = f10;
        if (z9) {
            f11 = 24.0f;
        } else {
            f11 = 0.0f;
        }
        addView(jcVar, c8.ha.d(-1, f12, 80, 0.0f, 0.0f, 0.0f, f11));
        if (rcVar instanceof j40) {
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(getContext());
            this.f47164c = k5Var;
            k5Var.setGravity(19);
            int i12 = org.telegram.ui.ActionBar.k6.A8;
            k5Var.setTextColor(rcVar.getThemedColor(i12));
            k5Var.setTypeface(org.telegram.messenger.g0.o());
            k5Var.l(org.telegram.messenger.hd.M0(2131752551, null), false);
            k5Var.setAlpha(0.0f);
            a();
            addView(k5Var, c8.ha.d(-1, -2.0f, 80, 72.0f, 0.0f, 0.0f, 16.0f));
            LinearLayout linearLayout = new LinearLayout(activity);
            this.f47166f = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(org.telegram.ui.ActionBar.k6.i0(org.telegram.ui.ActionBar.k6.r1(0.065f, -16777216), -16777216));
            linearLayout.setGravity(17);
            linearLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            TextView textView = new TextView(activity);
            this.d = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(jcVar.h.getTextColor());
            TextView textView2 = new TextView(activity);
            this.f47165e = textView2;
            textView2.setTextSize(1, 12.0f);
            if (rcVar.d && rcVar.f49471s == -1) {
                i10 = rcVar.getThemedColor(i12);
            } else {
                i10 = -1;
            }
            textView2.setTextColor(i10);
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = rcVar.f49451c;
            if (tL_premium_boostsStatus != null) {
                i11 = tL_premium_boostsStatus.boosts;
            } else {
                i11 = 0;
            }
            textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(i11, "BoostingGroupBoostCount", new Object[0])));
            textView2.setText(org.telegram.messenger.hd.M0(2131753353, null));
            linearLayout.addView(textView);
            linearLayout.addView(textView2, c8.ha.k(3.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, c8.ha.e(-1, -2, 80));
        }
    }

    public final void a() {
        boolean z9;
        int i7;
        float f10;
        int i10 = 0;
        if (getResources().getConfiguration().orientation == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!org.telegram.messenger.g0.Q1() && z9) {
            i7 = 18;
        } else {
            i7 = 20;
        }
        org.telegram.ui.ActionBar.k5 k5Var = this.f47164c;
        k5Var.setTextSize(i7);
        if (org.telegram.messenger.g0.Q1()) {
            f10 = -2.0f;
        } else {
            if (z9) {
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
        org.telegram.ui.ActionBar.k5 k5Var = this.f47164c;
        if (k5Var != null) {
            rc rcVar = this.h;
            int i7 = -1;
            if (rcVar.d && rcVar.f49471s != -1) {
                themedColor = -1;
            } else {
                themedColor = rcVar.getThemedColor(org.telegram.ui.ActionBar.k6.A8);
            }
            k5Var.setTextColor(themedColor);
            if (rcVar.d && rcVar.f49471s == -1) {
                i7 = rcVar.getThemedColor(org.telegram.ui.ActionBar.k6.A8);
            }
            this.f47165e.setTextColor(i7);
        }
    }
}
