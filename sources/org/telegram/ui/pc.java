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
public final class pc extends FrameLayout implements org.telegram.ui.ActionBar.w5 {
    public final io0 f41436a;
    public final oc f41437b;
    public final org.telegram.ui.ActionBar.h5 f41438c;
    public final TextView d;
    public final TextView f41439e;
    public final LinearLayout f41440f;
    public final xc h;

    public pc(xc xcVar, Activity activity) {
        super(activity);
        org.telegram.ui.ActionBar.b6 b6Var;
        int i9;
        org.telegram.ui.ActionBar.b6 b6Var2;
        float f10;
        float f11;
        int i10;
        int i11;
        this.h = xcVar;
        Context context = getContext();
        b6Var = ((org.telegram.ui.ActionBar.o2) xcVar).resourceProvider;
        io0 io0Var = new io0(context, b6Var);
        this.f41436a = io0Var;
        io0Var.setProgressToGradient(1.0f);
        io0Var.A = true;
        addView(io0Var, g7.e6.e(-1, -1, 119));
        Context context2 = getContext();
        i9 = ((org.telegram.ui.ActionBar.o2) xcVar).currentAccount;
        long j10 = xcVar.f44460a;
        b6Var2 = ((org.telegram.ui.ActionBar.o2) xcVar).resourceProvider;
        oc ocVar = new oc(this, context2, i9, j10, b6Var2);
        this.f41437b = ocVar;
        boolean z10 = xcVar.d;
        if (z10) {
            f10 = 230.0f;
        } else {
            f10 = 190.0f;
        }
        if (z10) {
            f11 = 24.0f;
        } else {
            f11 = 0.0f;
        }
        addView(ocVar, g7.e6.d(-1, f10, 80, 0.0f, 0.0f, 0.0f, f11));
        if (xcVar instanceof y50) {
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
            this.f41438c = h5Var;
            h5Var.setGravity(19);
            int i12 = org.telegram.ui.ActionBar.f6.A8;
            h5Var.setTextColor(xcVar.getThemedColor(i12));
            h5Var.setTypeface(AndroidUtilities.bold());
            h5Var.l(LocaleController.getString(R.string.ChangeChannelNameColor2), false);
            h5Var.setAlpha(0.0f);
            a();
            addView(h5Var, g7.e6.d(-1, -2.0f, 80, 72.0f, 0.0f, 0.0f, 16.0f));
            LinearLayout linearLayout = new LinearLayout(activity);
            this.f41440f = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(org.telegram.ui.ActionBar.f6.g0(org.telegram.ui.ActionBar.f6.l1(0.065f, -16777216), -16777216));
            linearLayout.setGravity(17);
            linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            TextView textView = new TextView(activity);
            this.d = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(ocVar.h.getTextColor());
            TextView textView2 = new TextView(activity);
            this.f41439e = textView2;
            textView2.setTextSize(1, 12.0f);
            if (xcVar.d && xcVar.f44484s == -1) {
                i10 = xcVar.getThemedColor(i12);
            } else {
                i10 = -1;
            }
            textView2.setTextColor(i10);
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = xcVar.f44464c;
            if (tL_premium_boostsStatus != null) {
                i11 = tL_premium_boostsStatus.boosts;
            } else {
                i11 = 0;
            }
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", i11, new Object[0])));
            textView2.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
            linearLayout.addView(textView);
            linearLayout.addView(textView2, g7.e6.k(3.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, g7.e6.e(-1, -2, 80));
        }
    }

    public final void a() {
        boolean z10;
        int i9;
        float f10;
        int i10 = 0;
        if (getResources().getConfiguration().orientation == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!AndroidUtilities.isTablet() && z10) {
            i9 = 18;
        } else {
            i9 = 20;
        }
        org.telegram.ui.ActionBar.h5 h5Var = this.f41438c;
        h5Var.setTextSize(i9);
        if (AndroidUtilities.isTablet()) {
            f10 = -2.0f;
        } else {
            if (z10) {
                i10 = 4;
            }
            f10 = i10;
        }
        h5Var.setTranslationY(AndroidUtilities.dp(f10));
    }

    @Override
    public final void d() {
        int themedColor;
        org.telegram.ui.ActionBar.h5 h5Var = this.f41438c;
        if (h5Var != null) {
            xc xcVar = this.h;
            int i9 = -1;
            if (xcVar.d && xcVar.f44484s != -1) {
                themedColor = -1;
            } else {
                themedColor = xcVar.getThemedColor(org.telegram.ui.ActionBar.f6.A8);
            }
            h5Var.setTextColor(themedColor);
            if (xcVar.d && xcVar.f44484s == -1) {
                i9 = xcVar.getThemedColor(org.telegram.ui.ActionBar.f6.A8);
            }
            this.f41439e.setTextColor(i9);
        }
    }

    public int[] getColorKeys() {
        return null;
    }
}
