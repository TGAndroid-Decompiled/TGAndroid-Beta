package org.telegram.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.browser.Browser;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.RLottieImageView;

public class RevenueSharingAdsInfoBottomSheet extends BottomSheet {
    private final Paint topIconBgPaint;

    @SuppressLint({"UseCompatLoadingForDrawables"})
    public RevenueSharingAdsInfoBottomSheet(final BaseFragment baseFragment, Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, false, resourcesProvider);
        fixNavigationBar();
        Paint paint = new Paint(1);
        this.topIconBgPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        int i = Theme.key_featuredStickers_addButton;
        paint.setColor(Theme.getColor(i, resourcesProvider));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        RLottieImageView rLottieImageView = new RLottieImageView(getContext());
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        rLottieImageView.setImageResource(R.drawable.large_ads_info);
        rLottieImageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        rLottieImageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(80.0f), Theme.getColor(i, resourcesProvider)));
        linearLayout.addView(rLottieImageView, LayoutHelper.createLinear(80, 80, 1, 0, 28, 0, 0));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString("AboutRevenueSharingAds", R.string.AboutRevenueSharingAds));
        textView.setTypeface(AndroidUtilities.bold());
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 1, 22, 14, 22, 0));
        TextView textView2 = new TextView(context);
        textView2.setText(LocaleController.getString("RevenueSharingAdsAlertSubtitle", R.string.RevenueSharingAdsAlertSubtitle));
        textView2.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new FeatureCell(this, context, R.drawable.menu_privacy, LocaleController.getString("RevenueSharingAdsInfo1Title", R.string.RevenueSharingAdsInfo1Title), LocaleController.getString("RevenueSharingAdsInfo1Subtitle", R.string.RevenueSharingAdsInfo1Subtitle)), LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        linearLayout.addView(new FeatureCell(this, context, R.drawable.menu_feature_split, LocaleController.getString("RevenueSharingAdsInfo2Title", R.string.RevenueSharingAdsInfo2Title), LocaleController.getString("RevenueSharingAdsInfo2Subtitle", R.string.RevenueSharingAdsInfo2Subtitle)), LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        String formatString = LocaleController.formatString("RevenueSharingAdsInfo3Subtitle", R.string.RevenueSharingAdsInfo3Subtitle, Integer.valueOf(MessagesController.getInstance(baseFragment.getCurrentAccount()).channelRestrictSponsoredLevelMin));
        int i3 = Theme.key_chat_messageLinkIn;
        linearLayout.addView(new FeatureCell(this, context, R.drawable.menu_feature_noads, LocaleController.getString("RevenueSharingAdsInfo3Title", R.string.RevenueSharingAdsInfo3Title), AndroidUtilities.replaceSingleTag(formatString, i3, 0, new Runnable() {
            @Override
            public final void run() {
                RevenueSharingAdsInfoBottomSheet.this.lambda$new$0(baseFragment);
            }
        })), LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        view.setBackgroundColor(Theme.getColor(Theme.key_divider, resourcesProvider));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView3 = new TextView(context);
        textView3.setText(LocaleController.getString("RevenueSharingAdsInfo4Title", R.string.RevenueSharingAdsInfo4Title));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView3.setTextSize(1, 20.0f);
        textView3.setTextAlignment(4);
        linearLayout.addView(textView3, LayoutHelper.createLinear(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.RevenueSharingAdsInfo4Subtitle2));
        SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.RevenueSharingAdsInfo4SubtitleLearnMore), i3, 0, new Runnable() {
            @Override
            public final void run() {
                RevenueSharingAdsInfoBottomSheet.this.lambda$new$1();
            }
        });
        SpannableString spannableString = new SpannableString(">");
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.attach_arrow_right);
        coloredImageSpan.setOverrideColor(Theme.getColor(i3));
        coloredImageSpan.setScale(0.7f, 0.7f);
        coloredImageSpan.setWidth(AndroidUtilities.dp(12.0f));
        coloredImageSpan.setTranslateY(1.0f);
        spannableString.setSpan(coloredImageSpan, 0, spannableString.length(), 33);
        SpannableStringBuilder replaceCharSequence = AndroidUtilities.replaceCharSequence(">", AndroidUtilities.replaceCharSequence("%1$s", replaceTags, replaceSingleTag), spannableString);
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
        linksTextView.setText(replaceCharSequence);
        linksTextView.setTextColor(Theme.getColor(i2, resourcesProvider));
        linksTextView.setTextSize(1, 14.0f);
        linksTextView.setGravity(1);
        linksTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(linksTextView, LayoutHelper.createLinear(-2, -2, 1, 26, 8, 26, 0));
        TextView textView4 = new TextView(context);
        textView4.setLines(1);
        textView4.setSingleLine(true);
        textView4.setGravity(17);
        textView4.setEllipsize(TextUtils.TruncateAt.END);
        textView4.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider));
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setTextSize(1, 14.0f);
        textView4.setText(LocaleController.getString("RevenueSharingAdsAlertButton", R.string.RevenueSharingAdsAlertButton));
        textView4.setBackground(Theme.AdaptiveRipple.filledRect(Theme.getColor(i, resourcesProvider), 6.0f));
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                RevenueSharingAdsInfoBottomSheet.this.lambda$new$2(view2);
            }
        });
        linearLayout.addView(textView4, LayoutHelper.createLinear(-1, 48, 0, 14, 22, 14, 14));
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
    }

    public void lambda$new$0(BaseFragment baseFragment) {
        baseFragment.presentFragment(new PremiumPreviewFragment(PremiumPreviewFragment.featureTypeToServerString(3)));
        dismiss();
    }

    public void lambda$new$1() {
        Browser.openUrl(getContext(), LocaleController.getString("PromoteUrl", R.string.PromoteUrl));
    }

    public void lambda$new$2(View view) {
        dismiss();
    }

    public static RevenueSharingAdsInfoBottomSheet showAlert(Context context, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        RevenueSharingAdsInfoBottomSheet revenueSharingAdsInfoBottomSheet = new RevenueSharingAdsInfoBottomSheet(baseFragment, context, resourcesProvider);
        if (baseFragment != null) {
            if (baseFragment.getParentActivity() != null) {
                baseFragment.showDialog(revenueSharingAdsInfoBottomSheet);
            }
        } else {
            revenueSharingAdsInfoBottomSheet.show();
        }
        return revenueSharingAdsInfoBottomSheet;
    }

    private class FeatureCell extends FrameLayout {
        public FeatureCell(RevenueSharingAdsInfoBottomSheet revenueSharingAdsInfoBottomSheet, Context context, int i, CharSequence charSequence, CharSequence charSequence2) {
            super(context);
            boolean z = LocaleController.isRTL;
            ImageView imageView = new ImageView(getContext());
            Drawable mutate = getContext().getResources().getDrawable(i).mutate();
            int i2 = Theme.key_windowBackgroundWhiteBlackText;
            mutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, ((BottomSheet) revenueSharingAdsInfoBottomSheet).resourcesProvider), PorterDuff.Mode.MULTIPLY));
            imageView.setImageDrawable(mutate);
            addView(imageView, LayoutHelper.createFrame(24, 24.0f, z ? 5 : 3, z ? 0.0f : 27.0f, 6.0f, z ? 27.0f : 0.0f, 0.0f));
            TextView textView = new TextView(getContext());
            textView.setText(charSequence);
            textView.setTextColor(Theme.getColor(i2, ((BottomSheet) revenueSharingAdsInfoBottomSheet).resourcesProvider));
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            addView(textView, LayoutHelper.createFrame(-2, -2.0f, z ? 5 : 3, z ? 27.0f : 68.0f, 0.0f, z ? 68.0f : 27.0f, 0.0f));
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(getContext());
            linksTextView.setText(charSequence2);
            linksTextView.setTextSize(1, 14.0f);
            linksTextView.setTextColor(Theme.getColor(Theme.key_player_actionBarSubtitle, ((BottomSheet) revenueSharingAdsInfoBottomSheet).resourcesProvider));
            linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, ((BottomSheet) revenueSharingAdsInfoBottomSheet).resourcesProvider));
            linksTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(linksTextView, LayoutHelper.createFrame(-2, -2.0f, z ? 5 : 3, z ? 27.0f : 68.0f, 18.0f, z ? 68.0f : 27.0f, 0.0f));
        }
    }
}
