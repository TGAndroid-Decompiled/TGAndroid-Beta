package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
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
public final class k31 extends org.telegram.ui.Components.za {
    public final LinearLayout X;
    public org.telegram.ui.Components.a71 Y;

    public k31(Context context, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.jo0 jo0Var) {
        super(context, null, false, false, g6Var);
        int i10;
        fixNavigationBar();
        this.v = 0.2f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i11 = org.telegram.ui.ActionBar.k6.Oh;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.X = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_ads_info);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ShapeDrawable K = org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i11);
        imageView.setBackground(K);
        org.telegram.ui.ActionBar.r6.k(imageView, K, O, null, g6Var);
        frameLayout.addView(imageView, w7.z5.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.SearchAdsAboutTitle));
        textView.setTypeface(AndroidUtilities.bold());
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.W(textView, i12, g6Var);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        TextView f7 = org.telegram.messenger.tl.f(linearLayout, textView, w7.z5.t(-2, -2, 1, 22, 14, 22, 0), context);
        f7.setText(LocaleController.getString(R.string.SearchAdsAboutSubtitle));
        org.telegram.ui.ActionBar.r6.W(f7, i12, g6Var);
        f7.setTextSize(1, 14.0f);
        f7.setGravity(1);
        linearLayout.addView(f7, w7.z5.t(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new ci.h4(this, context, R.drawable.menu_privacy, LocaleController.getString(R.string.SearchAdsAbout1Title), LocaleController.getString(R.string.SearchAdsAbout1Subtitle)), w7.z5.p(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        boolean isPremium = UserConfig.getInstance(this.currentAccount).isPremium();
        int i13 = R.drawable.menu_feature_noads;
        String string = LocaleController.getString(R.string.SearchAdsAbout2Title);
        if (isPremium) {
            i10 = R.string.SearchAdsAbout2SubtitlePremium;
        } else {
            i10 = R.string.SearchAdsAbout2Subtitle;
        }
        linearLayout.addView(new ci.h4(this, context, i13, string, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i10), new v90(this, isPremium, jo0Var, 9)), true)), w7.z5.p(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21185d7, view, g6Var);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(LocaleController.getString(R.string.SearchAdsAboutLaunchTitle));
        textView2.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.r6.W(textView2, i12, g6Var);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, w7.z5.t(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder replaceCharSequence = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.SearchAdsAboutLaunchSubtitle)), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SearchAdsAboutLaunchLearnMore), new ly0(this, 12)), true));
        org.telegram.ui.Components.w90 w90Var = new org.telegram.ui.Components.w90(context, null);
        w90Var.setText(replaceCharSequence);
        org.telegram.ui.ActionBar.r6.W(w90Var, i12, g6Var);
        org.telegram.ui.ActionBar.r6.I(w90Var, org.telegram.ui.ActionBar.k6.f21243gc, g6Var);
        w90Var.setTextSize(1, 14.0f);
        w90Var.setGravity(1);
        w90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(w90Var, w7.z5.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.r6.W(textView3, org.telegram.ui.ActionBar.k6.Sh, g6Var);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.SearchAdsAboutUnderstood));
        org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.a6.e(new float[]{24.0f}, org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i11);
        org.telegram.ui.ActionBar.n6 f10 = org.telegram.ui.ActionBar.r6.f(i11);
        textView3.setBackground(e);
        org.telegram.ui.ActionBar.r6.k(textView3, e, O2, f10, g6Var);
        textView3.setOnClickListener(new f31(this, 1));
        linearLayout.addView(textView3, w7.z5.t(-1, 48, 0, 14, 22, 14, 14));
        this.Y.N(false);
    }

    public static void P(k31 k31Var, boolean z10, org.telegram.ui.Components.jo0 jo0Var) {
        if (z10) {
            MessagesController.getInstance(k31Var.currentAccount).disableAds(true);
            jo0Var.run();
        } else {
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U == null) {
                return;
            }
            U.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(3)));
        }
        k31Var.dismiss();
    }

    @Override
    public final org.telegram.ui.Components.km0 w(org.telegram.ui.Components.lm0 lm0Var) {
        org.telegram.ui.Components.a71 a71Var = new org.telegram.ui.Components.a71(lm0Var, getContext(), this.currentAccount, 0, true, new f5(this, 21), this.resourcesProvider);
        this.Y = a71Var;
        return a71Var;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.AboutRevenueSharingAds);
    }
}
