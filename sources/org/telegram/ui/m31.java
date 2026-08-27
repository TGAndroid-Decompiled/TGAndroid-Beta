package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

public final class m31 extends org.telegram.ui.Components.qa {
    public final LinearLayout T;
    public org.telegram.ui.Components.b51 U;

    public m31(Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.lg0 lg0Var) {
        super(context, null, false, false, false, 1, c6Var);
        fixNavigationBar();
        this.v = 0.2f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.T = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(getContext());
        ri0Var.setScaleType(ImageView.ScaleType.CENTER);
        ri0Var.setImageResource(R.drawable.large_ads_info);
        ri0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ri0Var.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.v0(i10, c6Var)));
        frameLayout.addView(ri0Var, h7.z5.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout, h7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.SearchAdsAboutTitle));
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.messenger.rl.l(i11, c6Var, textView, 1, 20.0f);
        textView.setGravity(1);
        TextView textViewI = org.telegram.ui.Cells.pa.i(linearLayout, textView, h7.z5.t(-2, -2, 1, 22, 14, 22, 0), context);
        textViewI.setText(LocaleController.getString(R.string.SearchAdsAboutSubtitle));
        textViewI.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        textViewI.setTextSize(1, 14.0f);
        textViewI.setGravity(1);
        linearLayout.addView(textViewI, h7.z5.t(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new ag.d(this, context, R.drawable.menu_privacy, LocaleController.getString(R.string.SearchAdsAbout1Title), LocaleController.getString(R.string.SearchAdsAbout1Subtitle)), h7.z5.p(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        boolean zIsPremium = UserConfig.getInstance(this.currentAccount).isPremium();
        linearLayout.addView(new ag.d(this, context, R.drawable.menu_feature_noads, LocaleController.getString(R.string.SearchAdsAbout2Title), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(zIsPremium ? R.string.SearchAdsAbout2SubtitlePremium : R.string.SearchAdsAbout2Subtitle), new op0(this, zIsPremium, lg0Var, 5)), true)), h7.z5.p(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23054d7, c6Var));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(LocaleController.getString(R.string.SearchAdsAboutLaunchTitle));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, h7.z5.t(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder spannableStringBuilderReplaceCharSequence = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.SearchAdsAboutLaunchSubtitle)), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SearchAdsAboutLaunchLearnMore), new ky0(this, 12)), true));
        org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(context, null);
        p80Var.setText(spannableStringBuilderReplaceCharSequence);
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        p80Var.setTextSize(1, 14.0f);
        p80Var.setGravity(1);
        p80Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(p80Var, h7.z5.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sh, c6Var));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.SearchAdsAboutUnderstood));
        textView3.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{24.0f}, org.telegram.ui.ActionBar.g6.v0(i10, c6Var)));
        textView3.setOnClickListener(new v21(this, 3));
        linearLayout.addView(textView3, h7.z5.t(-1, 48, 0, 14, 22, 14, 14));
        this.U.N(false);
    }

    public static void P(m31 m31Var, boolean z10, org.telegram.ui.Components.lg0 lg0Var) {
        if (z10) {
            MessagesController.getInstance(m31Var.currentAccount).disableAds(true);
            lg0Var.run();
        } else {
            org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
            if (n2VarU == null) {
                return;
            } else {
                n2VarU.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(3)));
            }
        }
        m31Var.dismiss();
    }

    @Override
    public final org.telegram.ui.Components.yk0 w(org.telegram.ui.Components.zk0 zk0Var) {
        org.telegram.ui.Components.b51 b51Var = new org.telegram.ui.Components.b51(zk0Var, getContext(), this.currentAccount, 0, true, new b5(this, 21), this.resourcesProvider);
        this.U = b51Var;
        return b51Var;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.AboutRevenueSharingAds);
    }
}
