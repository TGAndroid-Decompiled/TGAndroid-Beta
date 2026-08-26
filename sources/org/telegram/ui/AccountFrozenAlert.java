package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticOutline0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Stars.ExplainStarsSheet;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class AccountFrozenAlert {
    public static boolean shown;

    public static boolean isSpamBot(int i, TLRPC.User user) {
        String publicUsername;
        if (user == null || (publicUsername = UserObject.getPublicUsername(user)) == null) {
            return false;
        }
        try {
            Matcher matcher = Pattern.compile("t\\.me/([a-zA-Z0-9]+)/?").matcher(MessagesController.getInstance(i).freezeAppealUrl);
            return matcher.find() && publicUsername.equalsIgnoreCase(matcher.group(1));
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    public static void lambda$show$0(int i, Context context, BottomSheet[] bottomSheetArr) {
        String strConcat = MessagesController.getInstance(i).freezeAppealUrl;
        if (!strConcat.startsWith("http://") && !strConcat.startsWith("https://")) {
            strConcat = "https://".concat(strConcat);
        }
        Browser.openUrl(context, strConcat);
        bottomSheetArr[0].lambda$showGiftOfferSheet$15();
    }

    public static void lambda$show$2(BottomSheet[] bottomSheetArr, View view) {
        bottomSheetArr[0].lambda$showGiftOfferSheet$15();
    }

    public static void show(int i) {
        if (!shown && UserConfig.selectedAccount == i) {
            Context context = LaunchActivity.instance;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            if (context == null) {
                return;
            }
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            show(context, i, safeLastFragment != null ? safeLastFragment.getResourceProvider() : null);
        }
    }

    public static void show(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        int i2 = 1;
        if (shown) {
            return;
        }
        BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context, false, false, resourcesProvider);
        TodoItemMenu$$ExternalSyntheticLambda2 todoItemMenu$$ExternalSyntheticLambda2 = new TodoItemMenu$$ExternalSyntheticLambda2(i, context, bottomSheetArr, 11);
        LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context);
        linearLayoutM.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        linearLayoutM.setClipChildren(false);
        linearLayoutM.setClipToPadding(false);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        rLottieImageView.setAnimation(R.raw.media_forbidden, AndroidUtilities.dp(115.0f), AndroidUtilities.dp(115.0f));
        rLottieImageView.playAnimation();
        linearLayoutM.addView(rLottieImageView, LayoutHelper.createLinear(115, 115, 17, 0, 0, 0, 9));
        TextView textView = new TextView(context);
        AccountFrozenAlert$$ExternalSyntheticOutline1.m(20.0f, 1, textView);
        textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        textView.setText(LocaleController.getString(R.string.AccountFrozenTitle));
        textView.setGravity(17);
        linearLayoutM.addView(textView, LayoutHelper.createLinear(-1, -2, 17, 0, 0, 0, 23));
        ExplainStarsSheet.FeatureCell featureCell = new ExplainStarsSheet.FeatureCell(context, 1, resourcesProvider);
        featureCell.set(R.drawable.msg_block2, LocaleController.getString(R.string.AccountFrozen1Title), LocaleController.getString(R.string.AccountFrozen1Text));
        linearLayoutM.addView(featureCell, LayoutHelper.createLinear(-1, -2, 17, 0, 0, 0, 0));
        ExplainStarsSheet.FeatureCell featureCell2 = new ExplainStarsSheet.FeatureCell(context, 1, resourcesProvider);
        featureCell2.set(R.drawable.menu_privacy, LocaleController.getString(R.string.AccountFrozen2Title), LocaleController.getString(R.string.AccountFrozen2Text));
        linearLayoutM.addView(featureCell2, LayoutHelper.createLinear(-1, -2, 17, 0, 0, 0, 0));
        ExplainStarsSheet.FeatureCell featureCell3 = new ExplainStarsSheet.FeatureCell(context, 1, resourcesProvider);
        featureCell3.set(R.drawable.menu_feature_hourglass, LocaleController.getString(R.string.AccountFrozen3Title), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.AccountFrozen3Text, LocaleController.formatYearMonthDay(MessagesController.getInstance(i).freezeUntilDate, true)), new VoIPFragment$8$$ExternalSyntheticLambda1(todoItemMenu$$ExternalSyntheticLambda2, 20)));
        linearLayoutM.addView(featureCell3, LayoutHelper.createLinear(-1, -2, 17, 0, 0, 0, 0));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, true, resourcesProvider);
        buttonWithCounterView.setText(LocaleController.getString(R.string.AccountFrozenButtonAppeal), false);
        buttonWithCounterView.setOnClickListener(new PollItemMenu$4$$ExternalSyntheticLambda0(todoItemMenu$$ExternalSyntheticLambda2, 27));
        linearLayoutM.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 7, 0, 13, 0, 4));
        ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, false, resourcesProvider);
        buttonWithCounterView2.setText(LocaleController.getString(R.string.AccountFrozenButtonUnderstood), false);
        buttonWithCounterView2.setOnClickListener(new PollItemMenu$4$$ExternalSyntheticLambda0(bottomSheetArr, 28));
        linearLayoutM.addView(buttonWithCounterView2, LayoutHelper.createLinear(-1, 48, 7, 0, 0, 0, 0));
        bottomSheetM.customView = linearLayoutM;
        BottomSheet[] bottomSheetArr = {bottomSheetM};
        bottomSheetM.useBackgroundTopPadding = false;
        bottomSheetM.fixNavigationBar();
        shown = true;
        bottomSheetArr[0].show();
        bottomSheetArr[0].setOnDismissListener(new SettingsActivity$$ExternalSyntheticLambda4(i2));
    }
}
