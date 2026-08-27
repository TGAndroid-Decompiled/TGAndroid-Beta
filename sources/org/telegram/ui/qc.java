package org.telegram.ui;

import android.app.Activity;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;

public final class qc extends FrameLayout implements org.telegram.ui.ActionBar.x5 {

    public final jo0 f41628a;

    public final pc f41629b;

    public final org.telegram.ui.ActionBar.h5 f41630c;
    public final TextView d;

    public final TextView f41631e;

    public final LinearLayout f41632f;
    public final xc h;

    public qc(xc xcVar, Activity activity) {
        super(activity);
        this.h = xcVar;
        jo0 jo0Var = new jo0(getContext(), ((org.telegram.ui.ActionBar.n2) xcVar).resourceProvider);
        this.f41628a = jo0Var;
        jo0Var.setProgressToGradient(1.0f);
        jo0Var.A = true;
        addView(jo0Var, h7.z5.e(-1, -1, 119));
        pc pcVar = new pc(this, getContext(), ((org.telegram.ui.ActionBar.n2) xcVar).currentAccount, xcVar.f44380a, ((org.telegram.ui.ActionBar.n2) xcVar).resourceProvider);
        this.f41629b = pcVar;
        boolean z10 = xcVar.d;
        addView(pcVar, h7.z5.d(-1, z10 ? 230.0f : 190.0f, 80, 0.0f, 0.0f, 0.0f, z10 ? 24.0f : 0.0f));
        if (xcVar instanceof c60) {
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
            this.f41630c = h5Var;
            h5Var.setGravity(19);
            int i10 = org.telegram.ui.ActionBar.g6.A8;
            h5Var.setTextColor(xcVar.getThemedColor(i10));
            h5Var.setTypeface(AndroidUtilities.bold());
            h5Var.l(LocaleController.getString(R.string.ChangeChannelNameColor2), false);
            h5Var.setAlpha(0.0f);
            a();
            addView(h5Var, h7.z5.d(-1, -2.0f, 80, 72.0f, 0.0f, 0.0f, 16.0f));
            LinearLayout linearLayout = new LinearLayout(activity);
            this.f41632f = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.l1(0.065f, -16777216), -16777216));
            linearLayout.setGravity(17);
            linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            TextView textView = new TextView(activity);
            this.d = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(pcVar.h.getTextColor());
            TextView textView2 = new TextView(activity);
            this.f41631e = textView2;
            textView2.setTextSize(1, 12.0f);
            textView2.setTextColor((xcVar.d && xcVar.f44404s == -1) ? xcVar.getThemedColor(i10) : -1);
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = xcVar.f44384c;
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", tL_premium_boostsStatus != null ? tL_premium_boostsStatus.boosts : 0, new Object[0])));
            textView2.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
            linearLayout.addView(textView);
            linearLayout.addView(textView2, h7.z5.k(3.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, h7.z5.e(-1, -2, 80));
        }
    }

    public final void a() {
        float f10;
        boolean z10 = getResources().getConfiguration().orientation == 2;
        int i10 = (AndroidUtilities.isTablet() || !z10) ? 20 : 18;
        org.telegram.ui.ActionBar.h5 h5Var = this.f41630c;
        h5Var.setTextSize(i10);
        if (AndroidUtilities.isTablet()) {
            f10 = -2.0f;
        } else {
            f10 = z10 ? 4 : 0;
        }
        h5Var.setTranslationY(AndroidUtilities.dp(f10));
    }

    @Override
    public final void d() {
        org.telegram.ui.ActionBar.h5 h5Var = this.f41630c;
        if (h5Var != null) {
            xc xcVar = this.h;
            int themedColor = -1;
            h5Var.setTextColor((!xcVar.d || xcVar.f44404s == -1) ? xcVar.getThemedColor(org.telegram.ui.ActionBar.g6.A8) : -1);
            if (xcVar.d && xcVar.f44404s == -1) {
                themedColor = xcVar.getThemedColor(org.telegram.ui.ActionBar.g6.A8);
            }
            this.f41631e.setTextColor(themedColor);
        }
    }

    public int[] getColorKeys() {
        return null;
    }
}
