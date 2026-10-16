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
public final class b51 extends org.telegram.ui.Components.db {
    public final LinearLayout X;
    public org.telegram.ui.Components.a71 Y;

    public b51(Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.g90 g90Var) {
        super(context, null, false, false, c6Var);
        int i10;
        fixNavigationBar();
        this.v = 0.2f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i11 = org.telegram.ui.ActionBar.g6.Oh;
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.X = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_ads_info);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.w0(i11, c6Var)));
        frameLayout.addView(imageView, w7.z5.a(80.0f, 0.0f, 20.0f, 0.0f, 0.0f, 80, 1));
        linearLayout.addView(frameLayout, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.SearchAdsAboutTitle));
        textView.setTypeface(AndroidUtilities.bold());
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.messenger.sk.o(i12, c6Var, textView, 1, 20.0f);
        textView.setGravity(1);
        TextView i13 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, w7.z5.t(-2, -2, 1, 22, 14, 22, 0), context);
        i13.setText(LocaleController.getString(R.string.SearchAdsAboutSubtitle));
        i13.setTextColor(org.telegram.ui.ActionBar.g6.w0(i12, c6Var));
        i13.setTextSize(1, 14.0f);
        i13.setGravity(1);
        linearLayout.addView(i13, w7.z5.t(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new bi.i5(this, context, R.drawable.menu_privacy, LocaleController.getString(R.string.SearchAdsAbout1Title), LocaleController.getString(R.string.SearchAdsAbout1Subtitle)), w7.z5.p(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        boolean isPremium = UserConfig.getInstance(this.currentAccount).isPremium();
        int i14 = R.drawable.menu_feature_noads;
        String string = LocaleController.getString(R.string.SearchAdsAbout2Title);
        if (isPremium) {
            i10 = R.string.SearchAdsAbout2SubtitlePremium;
        } else {
            i10 = R.string.SearchAdsAbout2Subtitle;
        }
        linearLayout.addView(new bi.i5(this, context, i14, string, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i10), new gm0(this, isPremium, g90Var, 7)), true)), w7.z5.p(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19602d7, c6Var));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(LocaleController.getString(R.string.SearchAdsAboutLaunchTitle));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i12, c6Var));
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, w7.z5.t(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder replaceCharSequence = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.SearchAdsAboutLaunchSubtitle)), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SearchAdsAboutLaunchLearnMore), new tz0(this, 11)), true));
        org.telegram.ui.Components.da0 da0Var = new org.telegram.ui.Components.da0(context, null);
        da0Var.setText(replaceCharSequence);
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i12, c6Var));
        da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19660gc, c6Var));
        da0Var.setTextSize(1, 14.0f);
        da0Var.setGravity(1);
        da0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(da0Var, w7.z5.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Sh, c6Var));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.SearchAdsAboutUnderstood));
        textView3.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{24.0f}, org.telegram.ui.ActionBar.g6.w0(i11, c6Var)));
        textView3.setOnClickListener(new v41(this, 1));
        linearLayout.addView(textView3, w7.z5.t(-1, 48, 0, 14, 22, 14, 14));
        this.Y.N(false);
    }

    public static void Q(b51 b51Var, boolean z10, org.telegram.ui.Components.g90 g90Var) {
        if (z10) {
            MessagesController.getInstance(b51Var.currentAccount).disableAds(true);
            g90Var.run();
        } else {
            org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
            if (U == null) {
                return;
            }
            U.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(3)));
        }
        b51Var.dismiss();
    }

    @Override
    public final CharSequence B() {
        return LocaleController.getString(R.string.AboutRevenueSharingAds);
    }

    @Override
    public final org.telegram.ui.Components.lm0 x(org.telegram.ui.Components.mm0 mm0Var) {
        org.telegram.ui.Components.a71 a71Var = new org.telegram.ui.Components.a71(mm0Var, getContext(), this.currentAccount, 0, true, new f5(this, 21), this.resourcesProvider);
        this.Y = a71Var;
        return a71Var;
    }
}
