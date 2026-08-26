package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableString;
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
import org.telegram.messenger.browser.Browser;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda2;

public final class RevenueSharingAdsInfoBottomSheet extends BottomSheetWithRecyclerListView {
    public UniversalAdapter adapter;
    public final LinearLayout customView;

    public RevenueSharingAdsInfoBottomSheet(Context context, boolean z, Theme.ResourcesProvider resourcesProvider, ArticleViewer$$ExternalSyntheticLambda21 articleViewer$$ExternalSyntheticLambda21) {
        super(context, null, false, false, false, resourcesProvider);
        fixNavigationBar();
        this.topPadding = 0.2f;
        final int i = 1;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i2 = Theme.key_featuredStickers_addButton;
        paint.setColor(Theme.getColor(i2, resourcesProvider));
        LinearLayout linearLayout = new LinearLayout(context);
        this.customView = linearLayout;
        final int i3 = 0;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        RLottieImageView rLottieImageView = new RLottieImageView(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        rLottieImageView.setScaleType(scaleType);
        rLottieImageView.setImageResource(R.drawable.large_ads_info);
        rLottieImageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        rLottieImageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(80.0f), Theme.getColor(i2, resourcesProvider)));
        frameLayout.addView(rLottieImageView, LayoutHelper.createFrame(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        if (articleViewer$$ExternalSyntheticLambda21 != null) {
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
            imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            imageView.setScaleType(scaleType);
            imageView.setColorFilter(Theme.getColor(null, Theme.key_dialogTextGray3, false));
            imageView.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 1, -1));
            imageView.setOnClickListener(new BotAdView$$ExternalSyntheticLambda2(this, articleViewer$$ExternalSyntheticLambda21, resourcesProvider, imageView, 13));
            frameLayout.addView(imageView, LayoutHelper.createFrame(24, 24.0f, 53, 12.0f, 14.0f, 14.0f, 12.0f));
        }
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.AboutRevenueSharingAds));
        textView.setTypeface(AndroidUtilities.bold());
        int i4 = Theme.key_windowBackgroundWhiteBlackText;
        OKLCH.m(i4, (Theme.ResourcesProvider) r3, textView, 20.0f);
        textView.setGravity(1);
        TextView textViewM = ArticleViewer.IBlock.CC.m(linearLayout, textView, LayoutHelper.createLinear(-2, -2, 1, 22, 14, 22, 0), context);
        textViewM.setText(LocaleController.getString(R.string.RevenueSharingAdsAlertSubtitle));
        textViewM.setTextColor(Theme.getColor(i4, r3));
        textViewM.setTextSize(1, 14.0f);
        textViewM.setGravity(1);
        linearLayout.addView(textViewM, LayoutHelper.createLinear(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new PhotoViewer.AnonymousClass19(this, context, R.drawable.menu_privacy, LocaleController.getString(z ? R.string.RevenueSharingAdsInfo1TitleBot : R.string.RevenueSharingAdsInfo1Title), LocaleController.getString(z ? R.string.RevenueSharingAdsInfo1SubtitleBot : R.string.RevenueSharingAdsInfo1Subtitle)), LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        linearLayout.addView(new PhotoViewer.AnonymousClass19(this, context, R.drawable.menu_feature_split, LocaleController.getString(z ? R.string.RevenueSharingAdsInfo2TitleBot : R.string.RevenueSharingAdsInfo2Title), LocaleController.getString(z ? R.string.RevenueSharingAdsInfo2SubtitleBot : R.string.RevenueSharingAdsInfo2Subtitle)), LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        String string = LocaleController.formatString(z ? R.string.RevenueSharingAdsInfo3SubtitleBot : R.string.RevenueSharingAdsInfo3Subtitle, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).channelRestrictSponsoredLevelMin));
        int i5 = Theme.key_chat_messageLinkIn;
        linearLayout.addView(new PhotoViewer.AnonymousClass19(this, context, R.drawable.menu_feature_noads, LocaleController.getString(R.string.RevenueSharingAdsInfo3Title), AndroidUtilities.replaceSingleTag(string, i5, 0, new Runnable(this) {
            public final RevenueSharingAdsInfoBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i3) {
                    case 0:
                        RevenueSharingAdsInfoBottomSheet revenueSharingAdsInfoBottomSheet = this.f$0;
                        revenueSharingAdsInfoBottomSheet.getClass();
                        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                        if (safeLastFragment != null) {
                            safeLastFragment.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.featureTypeToServerString(3)));
                            revenueSharingAdsInfoBottomSheet.lambda$showGiftOfferSheet$15();
                            break;
                        }
                        break;
                    default:
                        RevenueSharingAdsInfoBottomSheet revenueSharingAdsInfoBottomSheet2 = this.f$0;
                        revenueSharingAdsInfoBottomSheet2.lambda$showGiftOfferSheet$15();
                        Browser.openUrl(revenueSharingAdsInfoBottomSheet2.getContext(), LocaleController.getString(R.string.PromoteUrl));
                        break;
                }
            }
        })), LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        view.setBackgroundColor(Theme.getColor(Theme.key_divider, r3));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(LocaleController.getString(z ? R.string.RevenueSharingAdsInfo4TitleBot : R.string.RevenueSharingAdsInfo4Title));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(Theme.getColor(i4, r3));
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(z ? R.string.RevenueSharingAdsInfo4Subtitle2Bot : R.string.RevenueSharingAdsInfo4Subtitle2));
        SpannableStringBuilder spannableStringBuilderReplaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.RevenueSharingAdsInfo4SubtitleLearnMore), i5, 0, new Runnable(this) {
            public final RevenueSharingAdsInfoBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i) {
                    case 0:
                        RevenueSharingAdsInfoBottomSheet revenueSharingAdsInfoBottomSheet = this.f$0;
                        revenueSharingAdsInfoBottomSheet.getClass();
                        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                        if (safeLastFragment != null) {
                            safeLastFragment.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.featureTypeToServerString(3)));
                            revenueSharingAdsInfoBottomSheet.lambda$showGiftOfferSheet$15();
                            break;
                        }
                        break;
                    default:
                        RevenueSharingAdsInfoBottomSheet revenueSharingAdsInfoBottomSheet2 = this.f$0;
                        revenueSharingAdsInfoBottomSheet2.lambda$showGiftOfferSheet$15();
                        Browser.openUrl(revenueSharingAdsInfoBottomSheet2.getContext(), LocaleController.getString(R.string.PromoteUrl));
                        break;
                }
            }
        });
        SpannableString spannableString = new SpannableString(">");
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.attach_arrow_right);
        coloredImageSpan.setOverrideColor(Theme.getColor(null, i5, false));
        coloredImageSpan.setScale(0.7f, 0.7f);
        coloredImageSpan.setWidth(AndroidUtilities.dp(12.0f));
        coloredImageSpan.setTranslateY(1.0f);
        spannableString.setSpan(coloredImageSpan, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilderReplaceCharSequence = AndroidUtilities.replaceCharSequence(">", AndroidUtilities.replaceCharSequence("%1$s", spannableStringBuilderReplaceTags, spannableStringBuilderReplaceSingleTag), spannableString);
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, null);
        linksTextView.setText(spannableStringBuilderReplaceCharSequence);
        linksTextView.setTextColor(Theme.getColor(i4, r3));
        linksTextView.setTextSize(1, 14.0f);
        linksTextView.setGravity(1);
        linksTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(linksTextView, LayoutHelper.createLinear(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText, r3));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.RevenueSharingAdsAlertButton));
        int color = Theme.getColor(i2, resourcesProvider);
        textView3.setBackground(Theme.AdaptiveRipple.createRect(new float[]{6.0f}, color, Theme.AdaptiveRipple.calcRippleColor(color)));
        textView3.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda4(this, 29));
        linearLayout.addView(textView3, LayoutHelper.createLinear(-1, 48, 0, 14, 22, 14, 14));
        this.adapter.update(false);
    }

    public static void showAlert(Context context, Theme.ResourcesProvider resourcesProvider, ChatActivity chatActivity) {
        RevenueSharingAdsInfoBottomSheet revenueSharingAdsInfoBottomSheet = new RevenueSharingAdsInfoBottomSheet(context, false, resourcesProvider, null);
        if (chatActivity.getParentActivity() != null) {
            chatActivity.showDialog(revenueSharingAdsInfoBottomSheet);
        }
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, true, new LinkManager$$ExternalSyntheticLambda1(this, 7), this.resourcesProvider);
        this.adapter = universalAdapter;
        return universalAdapter;
    }

    @Override
    public final CharSequence getTitle() {
        return LocaleController.getString(R.string.AboutRevenueSharingAds);
    }
}
