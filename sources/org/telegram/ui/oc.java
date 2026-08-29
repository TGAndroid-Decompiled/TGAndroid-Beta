package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class oc extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final ho0 f41084a;
    public final nc f41085b;
    public final org.telegram.ui.ActionBar.h5 f41086c;
    public final TextView d;
    public final TextView f41087e;
    public final LinearLayout f41088f;
    public final vc h;

    public oc(vc vcVar, Activity activity) {
        super(activity);
        org.telegram.ui.ActionBar.c6 c6Var;
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var2;
        float f9;
        float f10;
        int i11;
        int i12;
        this.h = vcVar;
        Context context = getContext();
        c6Var = ((org.telegram.ui.ActionBar.o2) vcVar).resourceProvider;
        ho0 ho0Var = new ho0(context, c6Var);
        this.f41084a = ho0Var;
        ho0Var.setProgressToGradient(1.0f);
        ho0Var.A = true;
        addView(ho0Var, i7.f6.e(-1, -1, 119));
        Context context2 = getContext();
        i10 = ((org.telegram.ui.ActionBar.o2) vcVar).currentAccount;
        long j10 = vcVar.f43502a;
        c6Var2 = ((org.telegram.ui.ActionBar.o2) vcVar).resourceProvider;
        nc ncVar = new nc(this, context2, i10, j10, c6Var2);
        this.f41085b = ncVar;
        boolean z10 = vcVar.d;
        if (z10) {
            f9 = 230.0f;
        } else {
            f9 = 190.0f;
        }
        if (z10) {
            f10 = 24.0f;
        } else {
            f10 = 0.0f;
        }
        addView(ncVar, i7.f6.d(-1, f9, 80, 0.0f, 0.0f, 0.0f, f10));
        if (vcVar instanceof a60) {
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
            this.f41086c = h5Var;
            h5Var.setGravity(19);
            int i13 = org.telegram.ui.ActionBar.g6.A8;
            h5Var.setTextColor(vcVar.getThemedColor(i13));
            h5Var.setTypeface(AndroidUtilities.bold());
            h5Var.l(LocaleController.getString(R.string.ChangeChannelNameColor2), false);
            h5Var.setAlpha(0.0f);
            a();
            addView(h5Var, i7.f6.d(-1, -2.0f, 80, 72.0f, 0.0f, 0.0f, 16.0f));
            LinearLayout linearLayout = new LinearLayout(activity);
            this.f41088f = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.l1(0.065f, -16777216), -16777216));
            linearLayout.setGravity(17);
            linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            TextView textView = new TextView(activity);
            this.d = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(ncVar.h.getTextColor());
            TextView textView2 = new TextView(activity);
            this.f41087e = textView2;
            textView2.setTextSize(1, 12.0f);
            if (vcVar.d && vcVar.f43526s == -1) {
                i11 = vcVar.getThemedColor(i13);
            } else {
                i11 = -1;
            }
            textView2.setTextColor(i11);
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = vcVar.f43506c;
            if (tL_premium_boostsStatus != null) {
                i12 = tL_premium_boostsStatus.boosts;
            } else {
                i12 = 0;
            }
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", i12, new Object[0])));
            textView2.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
            linearLayout.addView(textView);
            linearLayout.addView(textView2, i7.f6.k(3.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, i7.f6.e(-1, -2, 80));
        }
    }

    public final void a() {
        boolean z10;
        int i10;
        float f9;
        int i11 = 0;
        if (getResources().getConfiguration().orientation == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!AndroidUtilities.isTablet() && z10) {
            i10 = 18;
        } else {
            i10 = 20;
        }
        org.telegram.ui.ActionBar.h5 h5Var = this.f41086c;
        h5Var.setTextSize(i10);
        if (AndroidUtilities.isTablet()) {
            f9 = -2.0f;
        } else {
            if (z10) {
                i11 = 4;
            }
            f9 = i11;
        }
        h5Var.setTranslationY(AndroidUtilities.dp(f9));
    }

    @Override
    public final void e() {
        int themedColor;
        org.telegram.ui.ActionBar.h5 h5Var = this.f41086c;
        if (h5Var != null) {
            vc vcVar = this.h;
            int i10 = -1;
            if (vcVar.d && vcVar.f43526s != -1) {
                themedColor = -1;
            } else {
                themedColor = vcVar.getThemedColor(org.telegram.ui.ActionBar.g6.A8);
            }
            h5Var.setTextColor(themedColor);
            if (vcVar.d && vcVar.f43526s == -1) {
                i10 = vcVar.getThemedColor(org.telegram.ui.ActionBar.g6.A8);
            }
            this.f41087e.setTextColor(i10);
        }
    }

    public int[] getColorKeys() {
        return null;
    }
}
