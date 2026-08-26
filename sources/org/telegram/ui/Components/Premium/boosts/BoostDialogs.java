package org.telegram.ui.Components.Premium.boosts;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.EffectsTextView;
import org.telegram.ui.Components.NumberPicker;
import org.telegram.ui.Components.PasscodeView$9$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.ProfileGooeyView$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda15;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.QrActivity$$ExternalSyntheticLambda15;

public abstract class BoostDialogs {

    public final class AnonymousClass1 extends NumberPicker {
        @Override
        public final CharSequence getContentDescription(int i) {
            return LocaleController.formatPluralString("Hours", i, new Object[0]);
        }
    }

    public final class AnonymousClass2 extends NumberPicker {
        @Override
        public final CharSequence getContentDescription(int i) {
            return LocaleController.formatPluralString("Minutes", i, new Object[0]);
        }
    }

    public final class AnonymousClass4 extends TextView {
        @Override
        public final CharSequence getAccessibilityClassName() {
            return Button.class.getName();
        }
    }

    public static void applyDialogStyle(AlertDialog alertDialog, boolean z) {
        SpoilersTextView spoilersTextView = alertDialog.titleTextView;
        if (spoilersTextView != null) {
            spoilersTextView.setTextSize(1, 20);
        }
        EffectsTextView effectsTextView = alertDialog.messageTextView;
        if (effectsTextView != null) {
            effectsTextView.setTextSize(1, 14);
        }
        EffectsTextView effectsTextView2 = alertDialog.messageTextView;
        if (effectsTextView2 != null) {
            effectsTextView2.setLineSpacing(AndroidUtilities.dp(2.5f), 1.0f);
        }
        if (z) {
            return;
        }
        ((ViewGroup.MarginLayoutParams) alertDialog.buttonsLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(-14.0f);
    }

    public static void processApplyGiftCodeError(TLRPC.TL_error tL_error, FrameLayout frameLayout, Theme.ResourcesProvider resourcesProvider, Runnable runnable) {
        String str;
        if (tL_error == null || (str = tL_error.text) == null) {
            return;
        }
        if (!str.contains("PREMIUM_SUB_ACTIVE_UNTIL_")) {
            showToastError(frameLayout.getContext(), tL_error);
            return;
        }
        String str2 = LocaleController.getInstance().getFormatterBoostExpired().format(new Date(Long.parseLong(tL_error.text.replace("PREMIUM_SUB_ACTIVE_UNTIL_", "")) * 1000));
        SpannableStringBuilder spannableStringBuilderReplaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumActivateErrorText", R.string.GiftPremiumActivateErrorText), Theme.key_undo_cancelColor, 0, runnable);
        BulletinFactory bulletinFactory = new BulletinFactory(frameLayout, resourcesProvider);
        int i = R.raw.chats_infotip;
        bulletinFactory.createSimpleBulletin(LocaleController.getString(R.string.GiftPremiumActivateErrorTitle), AndroidUtilities.replaceCharSequence("%1$s", spannableStringBuilderReplaceSingleTag, AndroidUtilities.replaceTags("**" + str2 + "**")), i).show();
        try {
            frameLayout.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void showAbout(boolean z, String str, TLRPC.TL_payments_giveawayInfo tL_payments_giveawayInfo, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, Activity activity, Theme.ResourcesProvider resourcesProvider) {
        char c;
        int i = tL_messageMediaGiveaway.quantity;
        String pluralString = LocaleController.formatPluralString("BoldMonths", tL_messageMediaGiveaway.months, new Object[0]);
        String str2 = LocaleController.getInstance().getFormatterGiveawayMonthDay().format(new Date(((long) tL_messageMediaGiveaway.until_date) * 1000));
        String str3 = LocaleController.getInstance().getFormatterDay().format(new Date(((long) tL_payments_giveawayInfo.start_date) * 1000));
        String str4 = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(((long) tL_payments_giveawayInfo.start_date) * 1000));
        boolean z2 = tL_messageMediaGiveaway.channels.size() > 1;
        boolean z3 = (tL_messageMediaGiveaway.flags & 32) != 0;
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, 0, resourcesProvider);
        String string = LocaleController.getString("BoostingGiveAwayAbout", R.string.BoostingGiveAwayAbout);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z3) {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z ? "BoostingStarsGiveawayHowItWorksText" : "BoostingStarsGiveawayHowItWorksTextGroup", (int) tL_messageMediaGiveaway.stars, str)));
            c = 0;
        } else {
            c = 0;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString(z ? "BoostingGiveawayHowItWorksText" : "BoostingGiveawayHowItWorksTextGroup", i, str, Integer.valueOf(i), pluralString)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        String str5 = tL_messageMediaGiveaway.prize_description;
        if (str5 != null && !str5.isEmpty()) {
            String str6 = tL_messageMediaGiveaway.prize_description;
            Object[] objArr = new Object[2];
            objArr[c] = str;
            objArr[1] = str6;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksIncludeText", i, objArr)));
            spannableStringBuilder.append((CharSequence) "\n\n");
        }
        if (tL_messageMediaGiveaway.only_new_subscribers) {
            if (z2) {
                int size = tL_messageMediaGiveaway.channels.size() - 1;
                Object[] objArr2 = new Object[2];
                objArr2[c] = str3;
                objArr2[1] = str4;
                String pluralString2 = LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextDateSeveral2", size, objArr2);
                Integer numValueOf = Integer.valueOf(i);
                Object[] objArr3 = new Object[4];
                objArr3[c] = str2;
                objArr3[1] = numValueOf;
                objArr3[2] = str;
                objArr3[3] = pluralString2;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextDateSeveral1", i, objArr3)));
            } else {
                Integer numValueOf2 = Integer.valueOf(i);
                Object[] objArr4 = new Object[5];
                objArr4[c] = str2;
                objArr4[1] = numValueOf2;
                objArr4[2] = str;
                objArr4[3] = str3;
                objArr4[4] = str4;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextDate", i, objArr4)));
            }
        } else if (z2) {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextSeveral1", i, str2, Integer.valueOf(i), str, LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextSeveral2", tL_messageMediaGiveaway.channels.size() - 1, new Object[0]))));
        } else {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubText", i, str2, Integer.valueOf(i), str)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        if (!tL_payments_giveawayInfo.participating) {
            String str7 = tL_payments_giveawayInfo.disallowed_country;
            if (str7 != null && !str7.isEmpty()) {
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString("BoostingGiveawayNotEligibleCountry", R.string.BoostingGiveawayNotEligibleCountry)));
            } else if (tL_payments_giveawayInfo.admin_disallowed_chat_id != 0) {
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(tL_payments_giveawayInfo.admin_disallowed_chat_id));
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(z ? R.string.BoostingGiveawayNotEligibleAdmin : R.string.BoostingGiveawayNotEligibleAdminGroup, chat != null ? chat.title : "")));
            } else if (tL_payments_giveawayInfo.joined_too_early_date != 0) {
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("BoostingGiveawayNotEligible", R.string.BoostingGiveawayNotEligible, LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(((long) tL_payments_giveawayInfo.joined_too_early_date) * 1000)))));
            } else if (z2) {
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayTakePartMultiPlural", tL_messageMediaGiveaway.channels.size() - 1, str, str2)));
            } else {
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("BoostingGiveawayTakePart", R.string.BoostingGiveawayTakePart, str, str2)));
            }
        } else if (z2) {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayParticipantMultiPlural", tL_messageMediaGiveaway.channels.size() - 1, str)));
        } else {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("BoostingGiveawayParticipant", R.string.BoostingGiveawayParticipant, str)));
        }
        alertDialog.message = spannableStringBuilder;
        builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), new ShareAlert$$ExternalSyntheticLambda15(24));
        applyDialogStyle(builder.show(), false);
    }

    public static void showAboutEnd(boolean z, String str, TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, Activity activity, Theme.ResourcesProvider resourcesProvider) {
        char c;
        String string;
        if (tL_messageMediaGiveaway.until_date == 0) {
            tL_messageMediaGiveaway.until_date = tL_payments_giveawayInfoResults.finish_date;
        }
        int i = tL_messageMediaGiveaway.quantity;
        String pluralString = LocaleController.formatPluralString("BoldMonths", tL_messageMediaGiveaway.months, new Object[0]);
        String str2 = LocaleController.getInstance().getFormatterGiveawayMonthDay().format(new Date(((long) tL_messageMediaGiveaway.until_date) * 1000));
        String str3 = LocaleController.getInstance().getFormatterDay().format(new Date(((long) tL_payments_giveawayInfoResults.start_date) * 1000));
        String str4 = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(((long) tL_payments_giveawayInfoResults.start_date) * 1000));
        boolean z2 = tL_messageMediaGiveaway.channels.size() > 1;
        boolean z3 = (tL_messageMediaGiveaway.flags & 32) != 0;
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, 0, resourcesProvider);
        String string2 = LocaleController.getString("BoostingGiveawayEnd", R.string.BoostingGiveawayEnd);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z3) {
            spannableStringBuilder = spannableStringBuilder;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z ? "BoostingStarsGiveawayHowItWorksTextEnd" : "BoostingStarsGiveawayHowItWorksTextEndGroup", (int) tL_messageMediaGiveaway.stars, str)));
            c = 1;
        } else {
            c = 1;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString(z ? "BoostingGiveawayHowItWorksTextEnd" : "BoostingGiveawayHowItWorksTextEndGroup", i, str, Integer.valueOf(i), pluralString)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        String str5 = tL_messageMediaGiveaway.prize_description;
        if (str5 != null && !str5.isEmpty()) {
            String str6 = tL_messageMediaGiveaway.prize_description;
            Object[] objArr = new Object[2];
            objArr[0] = str;
            objArr[c] = str6;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksIncludeText", i, objArr)));
            spannableStringBuilder.append((CharSequence) "\n\n");
        }
        if (tL_messageMediaGiveaway.only_new_subscribers) {
            if (z2) {
                int size = tL_messageMediaGiveaway.channels.size() - 1;
                Object[] objArr2 = new Object[2];
                objArr2[0] = str3;
                objArr2[c] = str4;
                String pluralString2 = LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextDateSeveral2", size, objArr2);
                Integer numValueOf = Integer.valueOf(i);
                Object[] objArr3 = new Object[4];
                objArr3[0] = str2;
                objArr3[c] = numValueOf;
                objArr3[2] = str;
                objArr3[3] = pluralString2;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextDateSeveralEnd1", i, objArr3)));
            } else {
                Integer numValueOf2 = Integer.valueOf(i);
                Object[] objArr4 = new Object[5];
                objArr4[0] = str2;
                objArr4[c] = numValueOf2;
                objArr4[2] = str;
                objArr4[3] = str3;
                objArr4[4] = str4;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextDateEnd", i, objArr4)));
            }
        } else if (z2) {
            String pluralString3 = LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextSeveral2", tL_messageMediaGiveaway.channels.size() - 1, new Object[0]);
            Integer numValueOf3 = Integer.valueOf(i);
            Object[] objArr5 = new Object[4];
            objArr5[0] = str2;
            objArr5[c] = numValueOf3;
            objArr5[2] = str;
            objArr5[3] = pluralString3;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextSeveralEnd1", i, objArr5)));
        } else {
            Integer numValueOf4 = Integer.valueOf(i);
            Object[] objArr6 = new Object[3];
            objArr6[0] = str2;
            objArr6[c] = numValueOf4;
            objArr6[2] = str;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextEnd", i, objArr6)));
        }
        spannableStringBuilder.append((CharSequence) " ");
        int i2 = tL_payments_giveawayInfoResults.activated_count;
        if (i2 > 0) {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayUsedLinksPlural", i2, new Object[0])));
        }
        if (tL_payments_giveawayInfoResults.refunded) {
            String string3 = LocaleController.getString("BoostingGiveawayCanceledByPayment", R.string.BoostingGiveawayCanceledByPayment);
            TextView textViewM = RichMessageLayout$$ExternalSyntheticOutline0.m(activity, 1, 14.0f);
            textViewM.setTypeface(AndroidUtilities.bold());
            textViewM.setGravity(17);
            textViewM.setText(string3);
            int i3 = Theme.key_text_RedRegular;
            textViewM.setTextColor(Theme.getColor(i3, resourcesProvider));
            textViewM.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Theme.multAlpha(0.1f, Theme.getColor(i3, resourcesProvider))));
            textViewM.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            alertDialog.bottomView = textViewM;
            alertDialog.message = spannableStringBuilder;
            builder.setPositiveButton(LocaleController.getString("Close", R.string.Close), new ShareAlert$$ExternalSyntheticLambda15(24));
            applyDialogStyle(builder.show(), true);
            return;
        }
        alertDialog.message = spannableStringBuilder;
        if (tL_payments_giveawayInfoResults.winner) {
            string = LocaleController.getString(R.string.BoostingGiveawayYouWon);
            if ((tL_payments_giveawayInfoResults.flags & 16) == 0) {
                builder.setPositiveButton(LocaleController.getString("BoostingGiveawayViewPrize", R.string.BoostingGiveawayViewPrize), new ProfileGooeyView$$ExternalSyntheticLambda0(tL_payments_giveawayInfoResults, 18));
            }
            builder.setNegativeButton(LocaleController.getString("Close", R.string.Close), new ShareAlert$$ExternalSyntheticLambda15(24));
        } else {
            string = LocaleController.getString("BoostingGiveawayYouNotWon", R.string.BoostingGiveawayYouNotWon);
            builder.setPositiveButton(LocaleController.getString("Close", R.string.Close), new ShareAlert$$ExternalSyntheticLambda15(24));
        }
        EffectsTextView effectsTextView = new EffectsTextView(activity);
        NotificationCenter.listenEmojiLoading(effectsTextView);
        effectsTextView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
        effectsTextView.setTextSize(1, 14.0f);
        effectsTextView.setGravity(17);
        effectsTextView.setText(string);
        effectsTextView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Theme.getColor(Theme.key_profile_actionPressedBackground, resourcesProvider)));
        effectsTextView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(9.0f));
        alertDialog.aboveMessageView = effectsTextView;
        applyDialogStyle(builder.show(), false);
    }

    public static void showBulletin(BaseFragment baseFragment, TLRPC.Chat chat, boolean z) {
        if (baseFragment == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda15(BulletinFactory.of(baseFragment), z, chat, baseFragment.getResourceProvider(), 14), 300L);
    }

    public static void showFloodWait(int i) {
        String pluralString;
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null) {
            return;
        }
        if (i < 60) {
            pluralString = LocaleController.formatPluralString("Seconds", i, new Object[0]);
        } else if (i < 3600) {
            pluralString = LocaleController.formatPluralString("Minutes", i / 60, new Object[0]);
        } else {
            int i2 = (i / 60) / 60;
            if (i2 > 2) {
                pluralString = LocaleController.formatPluralString("Hours", i2, new Object[0]);
            } else {
                pluralString = LocaleController.formatPluralString("Hours", i2, new Object[0]) + " " + LocaleController.formatPluralString("Minutes", i % 60, new Object[0]);
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(lastFragment.getContext(), 0, lastFragment.getResourceProvider());
        String string = LocaleController.getString(R.string.CantBoostTooOften);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString("CantBoostTooOftenDescription", R.string.CantBoostTooOftenDescription, pluralString));
        builder.setPositiveButton(LocaleController.getString(R.string.OK), new ShareAlert$$ExternalSyntheticLambda15(25));
        builder.show();
    }

    public static void showGiftLinkForwardedBulletin(long j) {
        SpannableStringBuilder spannableStringBuilderReplaceTags;
        if (j == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingGiftLinkForwardedToSavedMsg));
        } else if (DialogObject.isChatDialog(j)) {
            spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("BoostingGiftLinkForwardedTo", R.string.BoostingGiftLinkForwardedTo, MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j)).title));
        } else {
            spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("BoostingGiftLinkForwardedTo", R.string.BoostingGiftLinkForwardedTo, UserObject.getFirstName(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j)))));
        }
        AndroidUtilities.runOnUIThread(new PasscodeView$9$$ExternalSyntheticLambda0(spannableStringBuilderReplaceTags, 19), 450L);
    }

    public static void showMoreBoostsNeeded(long j, LimitReachedBottomSheet limitReachedBottomSheet) {
        int i = 0;
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j));
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(lastFragment.getContext(), 0, lastFragment.getResourceProvider());
        String string = LocaleController.getString(R.string.BoostingMoreBoostsNeeded);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGetMoreBoostByGiftingCount", (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift, chat.title));
        builder.setNegativeButton(LocaleController.getString("GiftPremium", R.string.GiftPremium), new BoostDialogs$$ExternalSyntheticLambda10(limitReachedBottomSheet, i));
        builder.setPositiveButton(LocaleController.getString("Close", R.string.Close), new ShareAlert$$ExternalSyntheticLambda15(24));
        builder.show();
    }

    public static void showToastError(Context context, TLRPC.TL_error tL_error) {
        String str;
        if (tL_error == null || (str = tL_error.text) == null || TextUtils.isEmpty(str)) {
            return;
        }
        Toast.makeText(context, tL_error.text, 1).show();
    }
}
