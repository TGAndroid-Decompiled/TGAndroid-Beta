package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkb;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;

public class RevenueSharingAdsInfoBottomSheet extends BottomSheetWithRecyclerListView {
    private static final int ICON_SIZE = 24;
    private static final int ITEM_HORIZONTAL_PADDING = 27;
    private static final int ITEM_TEXT_PADDING = 68;
    private UniversalAdapter adapter;
    private final LinearLayout customView;
    private final Paint topIconBgPaint;

    public class FeatureCell extends FrameLayout {
        public FeatureCell(Context context, int i, CharSequence charSequence, CharSequence charSequence2) {
            super(context);
            boolean z = LocaleController.isRTL;
            ImageView imageView = new ImageView(getContext());
            Drawable drawableMutate = getContext().getResources().getDrawable(i).mutate();
            int i2 = Theme.key_windowBackgroundWhiteBlackText;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, ((BottomSheet) RevenueSharingAdsInfoBottomSheet.this).resourcesProvider), PorterDuff.Mode.MULTIPLY));
            imageView.setImageDrawable(drawableMutate);
            addView(imageView, LayoutHelper.createFrame(24, 24.0f, z ? 5 : 3, z ? 0.0f : 27.0f, 6.0f, z ? 27.0f : 0.0f, 0.0f));
            TextView textView = new TextView(getContext());
            textView.setText(charSequence);
            textView.setTextColor(Theme.getColor(i2, ((BottomSheet) RevenueSharingAdsInfoBottomSheet.this).resourcesProvider));
            zzkb.m(14.0f, 1, textView);
            addView(textView, LayoutHelper.createFrame(-2, -2.0f, z ? 5 : 3, z ? 27.0f : 68.0f, 0.0f, z ? 68.0f : 27.0f, 0.0f));
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(getContext());
            linksTextView.setText(charSequence2);
            linksTextView.setTextSize(1, 14.0f);
            linksTextView.setTextColor(Theme.getColor(Theme.key_player_actionBarSubtitle, ((BottomSheet) RevenueSharingAdsInfoBottomSheet.this).resourcesProvider));
            linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, ((BottomSheet) RevenueSharingAdsInfoBottomSheet.this).resourcesProvider));
            linksTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(linksTextView, LayoutHelper.createFrame(-2, -2.0f, z ? 5 : 3, z ? 27.0f : 68.0f, 18.0f, z ? 68.0f : 27.0f, 0.0f));
        }
    }

    public RevenueSharingAdsInfoBottomSheet(Context context, boolean z, Theme.ResourcesProvider resourcesProvider, Utilities.Callback<ItemOptions> callback) {
        super(context, null, false, false, false, resourcesProvider);
        fixNavigationBar();
        this.topPadding = 0.2f;
        final int i = 1;
        Paint paint = new Paint(1);
        this.topIconBgPaint = paint;
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
        if (callback != null) {
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
            imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            imageView.setScaleType(scaleType);
            imageView.setColorFilter(Theme.getColor(null, Theme.key_dialogTextGray3, false));
            imageView.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 1, -1));
            imageView.setOnClickListener(new CallLogActivity$$ExternalSyntheticLambda46(this, callback, resourcesProvider, imageView));
            frameLayout.addView(imageView, LayoutHelper.createFrame(24, 24.0f, 53, 12.0f, 14.0f, 14.0f, 12.0f));
        }
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, 100, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.AboutRevenueSharingAds));
        textView.setTypeface(AndroidUtilities.bold());
        int i4 = Theme.key_windowBackgroundWhiteBlackText;
        OKLCH.m(i4, resourcesProvider, textView, 20.0f);
        textView.setGravity(1);
        TextView textViewM = Theme.ResourcesProvider.CC.m(linearLayout, textView, LayoutHelper.createLinear(-2, -2, 1, 22, 14, 22, 0), context);
        textViewM.setText(LocaleController.getString(R.string.RevenueSharingAdsAlertSubtitle));
        textViewM.setTextColor(Theme.getColor(i4, resourcesProvider));
        textViewM.setTextSize(1, 14.0f);
        textViewM.setGravity(1);
        linearLayout.addView(textViewM, LayoutHelper.createLinear(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new FeatureCell(context, R.drawable.menu_privacy, LocaleController.getString(z ? R.string.RevenueSharingAdsInfo1TitleBot : R.string.RevenueSharingAdsInfo1Title), LocaleController.getString(z ? R.string.RevenueSharingAdsInfo1SubtitleBot : R.string.RevenueSharingAdsInfo1Subtitle)), LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        linearLayout.addView(new FeatureCell(context, R.drawable.menu_feature_split, LocaleController.getString(z ? R.string.RevenueSharingAdsInfo2TitleBot : R.string.RevenueSharingAdsInfo2Title), LocaleController.getString(z ? R.string.RevenueSharingAdsInfo2SubtitleBot : R.string.RevenueSharingAdsInfo2Subtitle)), LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        String string = LocaleController.formatString(z ? R.string.RevenueSharingAdsInfo3SubtitleBot : R.string.RevenueSharingAdsInfo3Subtitle, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).channelRestrictSponsoredLevelMin));
        int i5 = Theme.key_chat_messageLinkIn;
        linearLayout.addView(new FeatureCell(context, R.drawable.menu_feature_noads, LocaleController.getString(R.string.RevenueSharingAdsInfo3Title), AndroidUtilities.replaceSingleTag(string, i5, 0, new Runnable(this) {
            public final RevenueSharingAdsInfoBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i3) {
                    case 0:
                        this.f$0.lambda$new$1();
                        break;
                    default:
                        this.f$0.lambda$new$2();
                        break;
                }
            }
        })), LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        view.setBackgroundColor(Theme.getColor(Theme.key_divider, resourcesProvider));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(LocaleController.getString(z ? R.string.RevenueSharingAdsInfo4TitleBot : R.string.RevenueSharingAdsInfo4Title));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(Theme.getColor(i4, resourcesProvider));
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
                        this.f$0.lambda$new$1();
                        break;
                    default:
                        this.f$0.lambda$new$2();
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
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
        linksTextView.setText(spannableStringBuilderReplaceCharSequence);
        linksTextView.setTextColor(Theme.getColor(i4, resourcesProvider));
        linksTextView.setTextSize(1, 14.0f);
        linksTextView.setGravity(1);
        linksTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(linksTextView, LayoutHelper.createLinear(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.RevenueSharingAdsAlertButton));
        int color = Theme.getColor(i2, resourcesProvider);
        textView3.setBackground(Theme.AdaptiveRipple.createRect(new float[]{6.0f}, color, Theme.AdaptiveRipple.calcRippleColor(color)));
        textView3.setOnClickListener(new PollItemMenu$$ExternalSyntheticLambda14(this, 6));
        linearLayout.addView(textView3, LayoutHelper.createLinear(-1, 48, 0, 14, 22, 14, 14));
        this.adapter.update(false);
    }

    public void lambda$new$0(Utilities.Callback callback, Theme.ResourcesProvider resourcesProvider, ImageView imageView, View view) {
        callback.run(ItemOptions.makeOptions((ViewGroup) this.container, resourcesProvider, (View) imageView, true).setGravity(5).setDrawScrim(false).translate(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(-32.0f)));
    }

    public void lambda$new$1() {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        safeLastFragment.presentFragment(new PremiumPreviewFragment(PremiumPreviewFragment.featureTypeToServerString(3)));
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$new$2() {
        lambda$showGiftOfferSheet$15();
        Browser.openUrl(getContext(), LocaleController.getString(R.string.PromoteUrl));
    }

    public void lambda$new$3(View view) {
        lambda$showGiftOfferSheet$15();
    }

    public static RevenueSharingAdsInfoBottomSheet showAlert(Context context, BaseFragment baseFragment, boolean z, Theme.ResourcesProvider resourcesProvider) {
        return showAlert(context, baseFragment, z, resourcesProvider, null);
    }

    @Override
    public RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, true, new LinkManager$$ExternalSyntheticLambda6(this, 21), this.resourcesProvider);
        this.adapter = universalAdapter;
        return universalAdapter;
    }

    public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
        arrayList.add(UItem.asCustom(this.customView));
    }

    @Override
    public CharSequence getTitle() {
        return LocaleController.getString(R.string.AboutRevenueSharingAds);
    }

    @Override
    public void setLastVisible(boolean z) {
    }

    public static RevenueSharingAdsInfoBottomSheet showAlert(Context context, BaseFragment baseFragment, boolean z, Theme.ResourcesProvider resourcesProvider, Utilities.Callback<ItemOptions> callback) {
        RevenueSharingAdsInfoBottomSheet revenueSharingAdsInfoBottomSheet = new RevenueSharingAdsInfoBottomSheet(context, z, resourcesProvider, callback);
        if (baseFragment == null) {
            revenueSharingAdsInfoBottomSheet.show();
            return revenueSharingAdsInfoBottomSheet;
        }
        if (baseFragment.getParentActivity() != null) {
            baseFragment.showDialog(revenueSharingAdsInfoBottomSheet);
        }
        return revenueSharingAdsInfoBottomSheet;
    }
}
