package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
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
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;

public class SearchAdsInfoBottomSheet extends BottomSheetWithRecyclerListView {
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
            drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, ((BottomSheet) SearchAdsInfoBottomSheet.this).resourcesProvider), PorterDuff.Mode.MULTIPLY));
            imageView.setImageDrawable(drawableMutate);
            addView(imageView, LayoutHelper.createFrame(24, 24.0f, z ? 5 : 3, z ? 0.0f : 27.0f, 6.0f, z ? 27.0f : 0.0f, 0.0f));
            TextView textView = new TextView(getContext());
            textView.setText(charSequence);
            textView.setTextColor(Theme.getColor(i2, ((BottomSheet) SearchAdsInfoBottomSheet.this).resourcesProvider));
            zzkb.m(14.0f, 1, textView);
            addView(textView, LayoutHelper.createFrame(-2, -2.0f, z ? 5 : 3, z ? 27.0f : 68.0f, 0.0f, z ? 68.0f : 27.0f, 0.0f));
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(getContext());
            linksTextView.setText(charSequence2);
            linksTextView.setTextSize(1, 14.0f);
            linksTextView.setTextColor(Theme.getColor(Theme.key_player_actionBarSubtitle, ((BottomSheet) SearchAdsInfoBottomSheet.this).resourcesProvider));
            linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, ((BottomSheet) SearchAdsInfoBottomSheet.this).resourcesProvider));
            linksTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            linksTextView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            addView(linksTextView, LayoutHelper.createFrame(-2, -2.0f, z ? 5 : 3, (z ? 27 : 68) - 4, 18.0f, (z ? 68 : 27) - 4, 0.0f));
        }
    }

    public SearchAdsInfoBottomSheet(Context context, Theme.ResourcesProvider resourcesProvider, Runnable runnable) {
        super(context, null, false, false, false, resourcesProvider);
        fixNavigationBar();
        this.topPadding = 0.2f;
        Paint paint = new Paint(1);
        this.topIconBgPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        int i = Theme.key_featuredStickers_addButton;
        paint.setColor(Theme.getColor(i, resourcesProvider));
        LinearLayout linearLayout = new LinearLayout(context);
        this.customView = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        RLottieImageView rLottieImageView = new RLottieImageView(getContext());
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        rLottieImageView.setImageResource(R.drawable.large_ads_info);
        rLottieImageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        rLottieImageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(80.0f), Theme.getColor(i, resourcesProvider)));
        frameLayout.addView(rLottieImageView, LayoutHelper.createFrame(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, 100, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.SearchAdsAboutTitle));
        textView.setTypeface(AndroidUtilities.bold());
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        OKLCH.m(i2, resourcesProvider, textView, 20.0f);
        textView.setGravity(1);
        TextView textViewM = Theme.ResourcesProvider.CC.m(linearLayout, textView, LayoutHelper.createLinear(-2, -2, 1, 22, 14, 22, 0), context);
        textViewM.setText(LocaleController.getString(R.string.SearchAdsAboutSubtitle));
        textViewM.setTextColor(Theme.getColor(i2, resourcesProvider));
        textViewM.setTextSize(1, 14.0f);
        textViewM.setGravity(1);
        linearLayout.addView(textViewM, LayoutHelper.createLinear(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new FeatureCell(context, R.drawable.menu_privacy, LocaleController.getString(R.string.SearchAdsAbout1Title), LocaleController.getString(R.string.SearchAdsAbout1Subtitle)), LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        boolean zIsPremium = UserConfig.getInstance(this.currentAccount).isPremium();
        linearLayout.addView(new FeatureCell(context, R.drawable.menu_feature_noads, LocaleController.getString(R.string.SearchAdsAbout2Title), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(zIsPremium ? R.string.SearchAdsAbout2SubtitlePremium : R.string.SearchAdsAbout2Subtitle), new PhotoViewer$$ExternalSyntheticLambda28(this, zIsPremium, runnable, 19)), true)), LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        view.setBackgroundColor(Theme.getColor(Theme.key_divider, resourcesProvider));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(LocaleController.getString(R.string.SearchAdsAboutLaunchTitle));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder spannableStringBuilderReplaceCharSequence = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.SearchAdsAboutLaunchSubtitle)), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SearchAdsAboutLaunchLearnMore), new MainTabsLayout$$ExternalSyntheticLambda0(this, 23)), true));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
        linksTextView.setText(spannableStringBuilderReplaceCharSequence);
        linksTextView.setTextColor(Theme.getColor(i2, resourcesProvider));
        linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
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
        textView3.setText(LocaleController.getString(R.string.SearchAdsAboutUnderstood));
        int color = Theme.getColor(i, resourcesProvider);
        textView3.setBackground(Theme.AdaptiveRipple.createRect(new float[]{24.0f}, color, Theme.AdaptiveRipple.calcRippleColor(color)));
        textView3.setOnClickListener(new PollItemMenu$$ExternalSyntheticLambda14(this, 8));
        linearLayout.addView(textView3, LayoutHelper.createLinear(-1, 48, 0, 14, 22, 14, 14));
        this.adapter.update(false);
    }

    public void lambda$new$0(boolean z, Runnable runnable) {
        if (z) {
            MessagesController.getInstance(this.currentAccount).disableAds(true);
            runnable.run();
        } else {
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment == null) {
                return;
            } else {
                safeLastFragment.presentFragment(new PremiumPreviewFragment(PremiumPreviewFragment.featureTypeToServerString(3)));
            }
        }
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$new$1() {
        lambda$showGiftOfferSheet$15();
        Browser.openUrl(getContext(), LocaleController.getString(R.string.PromoteUrl));
    }

    public void lambda$new$2(View view) {
        lambda$showGiftOfferSheet$15();
    }

    public static RevenueSharingAdsInfoBottomSheet showAlert(Context context, BaseFragment baseFragment, boolean z, Theme.ResourcesProvider resourcesProvider) {
        return showAlert(context, baseFragment, z, resourcesProvider, null);
    }

    @Override
    public RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, true, new LinkManager$$ExternalSyntheticLambda6(this, 22), this.resourcesProvider);
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
