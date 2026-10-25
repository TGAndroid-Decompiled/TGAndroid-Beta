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
public final class m31 extends org.telegram.ui.Components.bb {
    public final LinearLayout X;
    public org.telegram.ui.Components.j71 Y;

    public m31(Context context, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.Components.t90 t90Var) {
        super(context, null, false, false, u6Var);
        int i10;
        fixNavigationBar();
        this.v = 0.2f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i11 = org.telegram.ui.ActionBar.y6.Oh;
        paint.setColor(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.X = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_ads_info);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
        imageView.setBackground(K);
        org.telegram.ui.ActionBar.f7.k(imageView, K, N, null, u6Var);
        frameLayout.addView(imageView, org.telegram.ui.Components.gb1.h(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout, org.telegram.ui.Components.gb1.o(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.SearchAdsAboutTitle));
        textView.setTypeface(AndroidUtilities.bold());
        int i12 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(textView, i12, u6Var);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        TextView e = org.telegram.messenger.vh.e(linearLayout, textView, org.telegram.ui.Components.gb1.x(-2, -2, 1, 22, 14, 22, 0), context);
        e.setText(LocaleController.getString(R.string.SearchAdsAboutSubtitle));
        org.telegram.ui.ActionBar.f7.V(e, i12, u6Var);
        e.setTextSize(1, 14.0f);
        e.setGravity(1);
        linearLayout.addView(e, org.telegram.ui.Components.gb1.x(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new di.i4(this, context, R.drawable.menu_privacy, LocaleController.getString(R.string.SearchAdsAbout1Title), LocaleController.getString(R.string.SearchAdsAbout1Subtitle)), org.telegram.ui.Components.gb1.t(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        boolean isPremium = UserConfig.getInstance(this.currentAccount).isPremium();
        int i13 = R.drawable.menu_feature_noads;
        String string = LocaleController.getString(R.string.SearchAdsAbout2Title);
        if (isPremium) {
            i10 = R.string.SearchAdsAbout2SubtitlePremium;
        } else {
            i10 = R.string.SearchAdsAbout2Subtitle;
        }
        linearLayout.addView(new di.i4(this, context, i13, string, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i10), new d80(this, isPremium, t90Var, 10)), true)), org.telegram.ui.Components.gb1.t(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23355d7, view, u6Var);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(LocaleController.getString(R.string.SearchAdsAboutLaunchTitle));
        textView2.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.f7.V(textView2, i12, u6Var);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, org.telegram.ui.Components.gb1.x(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder replaceCharSequence = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.SearchAdsAboutLaunchSubtitle)), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SearchAdsAboutLaunchLearnMore), new my0(this, 13)), true));
        org.telegram.ui.Components.z90 z90Var = new org.telegram.ui.Components.z90(context, null);
        z90Var.setText(replaceCharSequence);
        org.telegram.ui.ActionBar.f7.V(z90Var, i12, u6Var);
        org.telegram.ui.ActionBar.f7.H(z90Var, org.telegram.ui.ActionBar.y6.gc, u6Var);
        z90Var.setTextSize(1, 14.0f);
        z90Var.setGravity(1);
        z90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(z90Var, org.telegram.ui.Components.gb1.x(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.Sh, u6Var);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.SearchAdsAboutUnderstood));
        org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.o6.e(new float[]{24.0f}, org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i11);
        org.telegram.ui.ActionBar.b7 f7 = org.telegram.ui.ActionBar.f7.f(i11);
        textView3.setBackground(e10);
        org.telegram.ui.ActionBar.f7.k(textView3, e10, N2, f7, u6Var);
        textView3.setOnClickListener(new t21(this, 3));
        linearLayout.addView(textView3, org.telegram.ui.Components.gb1.x(-1, 48, 0, 14, 22, 14, 14));
        this.Y.O(false);
    }

    public static void P(m31 m31Var, boolean z10, org.telegram.ui.Components.t90 t90Var) {
        if (z10) {
            MessagesController.getInstance(m31Var.currentAccount).disableAds(true);
            t90Var.run();
        } else {
            org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
            if (U == null) {
                return;
            }
            U.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.m0(3)));
        }
        m31Var.dismiss();
    }

    @Override
    public final org.telegram.ui.Components.lm0 v(org.telegram.ui.Components.mm0 mm0Var) {
        org.telegram.ui.Components.j71 j71Var = new org.telegram.ui.Components.j71(mm0Var, getContext(), this.currentAccount, 0, true, new e5(this, 21), this.resourcesProvider);
        this.Y = j71Var;
        return j71Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.AboutRevenueSharingAds);
    }
}
