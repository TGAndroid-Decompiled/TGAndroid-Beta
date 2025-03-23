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
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;

public class SearchAdsInfoBottomSheet extends BottomSheetWithRecyclerListView {
    private UniversalAdapter adapter;
    private final LinearLayout customView;
    private final Paint topIconBgPaint;

    private class FeatureCell extends FrameLayout {
        public FeatureCell(Context context, int i, CharSequence charSequence, CharSequence charSequence2) {
            super(context);
            boolean z = LocaleController.isRTL;
            ImageView imageView = new ImageView(getContext());
            Drawable mutate = getContext().getResources().getDrawable(i).mutate();
            int i2 = Theme.key_windowBackgroundWhiteBlackText;
            mutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, ((BottomSheet) SearchAdsInfoBottomSheet.this).resourcesProvider), PorterDuff.Mode.MULTIPLY));
            imageView.setImageDrawable(mutate);
            addView(imageView, LayoutHelper.createFrame(24, 24.0f, z ? 5 : 3, z ? 0.0f : 27.0f, 6.0f, z ? 27.0f : 0.0f, 0.0f));
            TextView textView = new TextView(getContext());
            textView.setText(charSequence);
            textView.setTextColor(Theme.getColor(i2, ((BottomSheet) SearchAdsInfoBottomSheet.this).resourcesProvider));
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
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

    public SearchAdsInfoBottomSheet(Context context, Theme.ResourcesProvider resourcesProvider, final Runnable runnable) {
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
        linearLayout.setPadding(this.backgroundPaddingLeft + AndroidUtilities.dp(6.0f), 0, this.backgroundPaddingLeft + AndroidUtilities.dp(6.0f), 0);
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
        textView.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 1, 22, 14, 22, 0));
        TextView textView2 = new TextView(context);
        textView2.setText(LocaleController.getString(R.string.SearchAdsAboutSubtitle));
        textView2.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new FeatureCell(context, R.drawable.menu_privacy, LocaleController.getString(R.string.SearchAdsAbout1Title), LocaleController.getString(R.string.RevenueSharingAdsInfo1Subtitle)), LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        final boolean isPremium = UserConfig.getInstance(this.currentAccount).isPremium();
        linearLayout.addView(new FeatureCell(context, R.drawable.menu_feature_noads, LocaleController.getString(R.string.SearchAdsAbout2Title), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(isPremium ? R.string.SearchAdsAbout2SubtitlePremium : R.string.SearchAdsAbout2Subtitle), new Runnable() {
            @Override
            public final void run() {
                SearchAdsInfoBottomSheet.this.lambda$new$0(isPremium, runnable);
            }
        }), true)), LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        view.setBackgroundColor(Theme.getColor(Theme.key_divider, resourcesProvider));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView3 = new TextView(context);
        textView3.setText(LocaleController.getString(R.string.SearchAdsAboutLaunchTitle));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView3.setTextSize(1, 20.0f);
        textView3.setTextAlignment(4);
        textView3.setGravity(17);
        linearLayout.addView(textView3, LayoutHelper.createLinear(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder replaceCharSequence = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.SearchAdsAboutLaunchSubtitle)), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SearchAdsAboutLaunchLearnMore), new Runnable() {
            @Override
            public final void run() {
                SearchAdsInfoBottomSheet.this.lambda$new$1();
            }
        }), true));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
        linksTextView.setText(replaceCharSequence);
        linksTextView.setTextColor(Theme.getColor(i2, resourcesProvider));
        linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
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
        textView4.setText(LocaleController.getString(R.string.SearchAdsAboutUnderstood));
        textView4.setBackground(Theme.AdaptiveRipple.filledRect(Theme.getColor(i, resourcesProvider), 6.0f));
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                SearchAdsInfoBottomSheet.this.lambda$new$2(view2);
            }
        });
        linearLayout.addView(textView4, LayoutHelper.createLinear(-1, 48, 0, 14, 22, 14, 14));
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
        lambda$new$0();
    }

    public void lambda$new$1() {
        lambda$new$0();
        Browser.openUrl(getContext(), LocaleController.getString(R.string.PromoteUrl));
    }

    public void lambda$new$2(View view) {
        lambda$new$0();
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, true, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                SearchAdsInfoBottomSheet.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, this.resourcesProvider);
        this.adapter = universalAdapter;
        return universalAdapter;
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        arrayList.add(UItem.asCustom(this.customView));
    }

    @Override
    protected CharSequence getTitle() {
        return LocaleController.getString(R.string.AboutRevenueSharingAds);
    }
}
