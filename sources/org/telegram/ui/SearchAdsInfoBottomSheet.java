package org.telegram.ui;

import android.app.Activity;
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
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda29;
import org.telegram.ui.Components.UniversalAdapter;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda8;

public final class SearchAdsInfoBottomSheet extends BottomSheetWithRecyclerListView {
    public UniversalAdapter adapter;
    public final LinearLayout customView;

    public SearchAdsInfoBottomSheet(Activity activity, Theme.ResourcesProvider resourcesProvider, ShareAlert$$ExternalSyntheticLambda29 shareAlert$$ExternalSyntheticLambda29) {
        super(activity, null, false, false, false, resourcesProvider);
        fixNavigationBar();
        this.topPadding = 0.2f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i = Theme.key_featuredStickers_addButton;
        paint.setColor(Theme.getColor(i, resourcesProvider));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.customView = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        RLottieImageView rLottieImageView = new RLottieImageView(getContext());
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        rLottieImageView.setImageResource(R.drawable.large_ads_info);
        rLottieImageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        rLottieImageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(80.0f), Theme.getColor(i, resourcesProvider)));
        frameLayout.addView(rLottieImageView, LayoutHelper.createFrame(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(activity);
        textView.setText(LocaleController.getString(R.string.SearchAdsAboutTitle));
        textView.setTypeface(AndroidUtilities.bold());
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        OKLCH.m(i2, resourcesProvider, textView, 20.0f);
        textView.setGravity(1);
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 1, 22, 14, 22, 0));
        TextView textView2 = new TextView(activity);
        textView2.setText(LocaleController.getString(R.string.SearchAdsAboutSubtitle));
        textView2.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new TopicsFragment.AnonymousClass14(this, activity, R.drawable.menu_privacy, LocaleController.getString(R.string.SearchAdsAbout1Title), LocaleController.getString(R.string.SearchAdsAbout1Subtitle)), LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        boolean zIsPremium = UserConfig.getInstance(this.currentAccount).isPremium();
        linearLayout.addView(new TopicsFragment.AnonymousClass14(this, activity, R.drawable.menu_feature_noads, LocaleController.getString(R.string.SearchAdsAbout2Title), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(zIsPremium ? R.string.SearchAdsAbout2SubtitlePremium : R.string.SearchAdsAbout2Subtitle), new EglRenderer$$ExternalSyntheticLambda8(this, zIsPremium, shareAlert$$ExternalSyntheticLambda29, 3)), true)), LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        view.setBackgroundColor(Theme.getColor(Theme.key_divider, resourcesProvider));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView3 = new TextView(activity);
        textView3.setText(LocaleController.getString(R.string.SearchAdsAboutLaunchTitle));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView3.setTextSize(1, 20.0f);
        textView3.setTextAlignment(4);
        textView3.setGravity(17);
        linearLayout.addView(textView3, LayoutHelper.createLinear(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder spannableStringBuilderReplaceCharSequence = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.SearchAdsAboutLaunchSubtitle)), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SearchAdsAboutLaunchLearnMore), new ProfileActivity$9$$ExternalSyntheticLambda1(this, 9)), true));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(activity, null);
        linksTextView.setText(spannableStringBuilderReplaceCharSequence);
        linksTextView.setTextColor(Theme.getColor(i2, resourcesProvider));
        linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
        linksTextView.setTextSize(1, 14.0f);
        linksTextView.setGravity(1);
        linksTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(linksTextView, LayoutHelper.createLinear(-2, -2, 1, 26, 8, 26, 0));
        TextView textView4 = new TextView(activity);
        textView4.setLines(1);
        textView4.setSingleLine(true);
        textView4.setGravity(17);
        textView4.setEllipsize(TextUtils.TruncateAt.END);
        textView4.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider));
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setTextSize(1, 14.0f);
        textView4.setText(LocaleController.getString(R.string.SearchAdsAboutUnderstood));
        int color = Theme.getColor(i, resourcesProvider);
        textView4.setBackground(Theme.AdaptiveRipple.createRect(new float[]{24.0f}, color, Theme.AdaptiveRipple.calcRippleColor(color)));
        textView4.setOnClickListener(new TodoItemMenu$$ExternalSyntheticLambda13(this, 2));
        linearLayout.addView(textView4, LayoutHelper.createLinear(-1, 48, 0, 14, 22, 14, 14));
        this.adapter.update(false);
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, true, new LinkManager$$ExternalSyntheticLambda1(this, 8), this.resourcesProvider);
        this.adapter = universalAdapter;
        return universalAdapter;
    }

    @Override
    public final CharSequence getTitle() {
        return LocaleController.getString(R.string.AboutRevenueSharingAds);
    }

    public final void lambda$new$0(boolean z, ShareAlert$$ExternalSyntheticLambda29 shareAlert$$ExternalSyntheticLambda29) {
        if (z) {
            MessagesController.getInstance(this.currentAccount).disableAds(true);
            shareAlert$$ExternalSyntheticLambda29.run();
        } else {
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment == null) {
                return;
            } else {
                safeLastFragment.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.featureTypeToServerString(3)));
            }
        }
        lambda$showGiftOfferSheet$15();
    }
}
