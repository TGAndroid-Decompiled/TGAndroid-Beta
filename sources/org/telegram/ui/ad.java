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
public final class ad extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final mp0 f34181a;
    public final zc f34182b;
    public final org.telegram.ui.ActionBar.h5 f34183c;
    public final TextView d;
    public final TextView e;
    public final LinearLayout f34184f;
    public final hd h;

    public ad(hd hdVar, Activity activity) {
        super(activity);
        org.telegram.ui.ActionBar.c6 c6Var;
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var2;
        float f7;
        float f10;
        int i11;
        int i12;
        this.h = hdVar;
        Context context = getContext();
        c6Var = ((org.telegram.ui.ActionBar.m2) hdVar).resourceProvider;
        mp0 mp0Var = new mp0(context, c6Var);
        this.f34181a = mp0Var;
        mp0Var.setProgressToGradient(1.0f);
        mp0Var.F = true;
        addView(mp0Var, w7.a6.e(-1, -1, 119));
        Context context2 = getContext();
        i10 = ((org.telegram.ui.ActionBar.m2) hdVar).currentAccount;
        long j10 = hdVar.f36724a;
        c6Var2 = ((org.telegram.ui.ActionBar.m2) hdVar).resourceProvider;
        zc zcVar = new zc(this, context2, i10, j10, c6Var2);
        this.f34182b = zcVar;
        boolean z10 = hdVar.d;
        if (z10) {
            f7 = 230.0f;
        } else {
            f7 = 190.0f;
        }
        float f11 = f7;
        if (z10) {
            f10 = 24.0f;
        } else {
            f10 = 0.0f;
        }
        addView(zcVar, w7.a6.a(f11, 0.0f, 0.0f, 0.0f, f10, -1, 80));
        if (hdVar instanceof x60) {
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
            this.f34183c = h5Var;
            h5Var.setGravity(19);
            int i13 = org.telegram.ui.ActionBar.g6.A8;
            h5Var.setTextColor(hdVar.getThemedColor(i13));
            h5Var.setTypeface(AndroidUtilities.bold());
            h5Var.l(LocaleController.getString(R.string.ChangeChannelNameColor2), false);
            h5Var.setAlpha(0.0f);
            a();
            addView(h5Var, w7.a6.a(-2.0f, 72.0f, 0.0f, 0.0f, 16.0f, -1, 80));
            LinearLayout linearLayout = new LinearLayout(activity);
            this.f34184f = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(org.telegram.ui.ActionBar.g6.h0(org.telegram.ui.ActionBar.g6.m1(0.065f, -16777216), -16777216));
            linearLayout.setGravity(17);
            linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            TextView textView = new TextView(activity);
            this.d = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(zcVar.h.getTextColor());
            TextView textView2 = new TextView(activity);
            this.e = textView2;
            textView2.setTextSize(1, 12.0f);
            if (hdVar.d && hdVar.f36747s == -1) {
                i11 = hdVar.getThemedColor(i13);
            } else {
                i11 = -1;
            }
            textView2.setTextColor(i11);
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = hdVar.f36728c;
            if (tL_premium_boostsStatus != null) {
                i12 = tL_premium_boostsStatus.boosts;
            } else {
                i12 = 0;
            }
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", i12, new Object[0])));
            textView2.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
            linearLayout.addView(textView);
            linearLayout.addView(textView2, w7.a6.k(3.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, w7.a6.e(-1, -2, 80));
        }
    }

    public final void a() {
        boolean z10;
        int i10;
        float f7;
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
        org.telegram.ui.ActionBar.h5 h5Var = this.f34183c;
        h5Var.setTextSize(i10);
        if (AndroidUtilities.isTablet()) {
            f7 = -2.0f;
        } else {
            if (z10) {
                i11 = 4;
            }
            f7 = i11;
        }
        h5Var.setTranslationY(AndroidUtilities.dp(f7));
    }

    @Override
    public final void d() {
        int themedColor;
        org.telegram.ui.ActionBar.h5 h5Var = this.f34183c;
        if (h5Var != null) {
            hd hdVar = this.h;
            int i10 = -1;
            if (hdVar.d && hdVar.f36747s != -1) {
                themedColor = -1;
            } else {
                themedColor = hdVar.getThemedColor(org.telegram.ui.ActionBar.g6.A8);
            }
            h5Var.setTextColor(themedColor);
            if (hdVar.d && hdVar.f36747s == -1) {
                i10 = hdVar.getThemedColor(org.telegram.ui.ActionBar.g6.A8);
            }
            this.e.setTextColor(i10);
        }
    }

    public int[] getColorKeys() {
        return null;
    }
}
