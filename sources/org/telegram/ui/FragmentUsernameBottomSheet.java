package org.telegram.ui;

import android.content.Context;
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
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_language_id_common.zzig;
import com.google.android.gms.internal.mlkit_language_id_common.zzii;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class FragmentUsernameBottomSheet {
    public static final int TYPE_PHONE = 1;
    public static final int TYPE_USERNAME = 0;

    public static void lambda$open$0(String str, int i, BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider) {
        AndroidUtilities.addToClipboard(str);
        if (i == 1) {
            ArticleViewer$21$$ExternalSyntheticOutline0.m(BulletinFactory.of(bottomSheet.getContainer(), resourcesProvider), R.string.PhoneCopied);
        } else {
            BulletinFactory.of(bottomSheet.getContainer(), resourcesProvider).createCopyLinkBulletin().show();
        }
    }

    public static void lambda$open$1(Context context, TL_fragment.TL_collectibleInfo tL_collectibleInfo, View view) {
        Browser.openUrl(context, tL_collectibleInfo.url);
    }

    public static void lambda$open$2(Runnable runnable, BottomSheet bottomSheet, View view) {
        runnable.run();
        bottomSheet.lambda$showGiftOfferSheet$15();
    }

    public static void open(Context context, int i, String str, TLObject tLObject, TL_fragment.TL_collectibleInfo tL_collectibleInfo, Theme.ResourcesProvider resourcesProvider) {
        String str2;
        String userName;
        String currency;
        String currency2;
        String string;
        String string2;
        String strM;
        String str3;
        BottomSheet bottomSheet;
        OAuthSheet$$ExternalSyntheticLambda9 oAuthSheet$$ExternalSyntheticLambda9;
        int i2;
        BottomSheet bottomSheet2 = new BottomSheet(context, false, false, resourcesProvider);
        bottomSheet2.fixNavigationBar(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(80.0f), Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider)));
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(80, 80, 1, 0, 16, 0, 16));
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        int i3 = i == 0 ? 70 : 78;
        rLottieImageView.setAnimation(i == 0 ? R.raw.fragment_username : R.raw.fragment, i3, i3);
        rLottieImageView.playAnimation();
        rLottieImageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        if (i == 0) {
            rLottieImageView.setScaleX(0.86f);
            rLottieImageView.setScaleY(0.86f);
        } else {
            rLottieImageView.setTranslationY(AndroidUtilities.dp(2.0f));
        }
        frameLayout.addView(rLottieImageView, LayoutHelper.createLinear(-1, -1, 17));
        if (!(tLObject instanceof TLRPC.User)) {
            if (tLObject instanceof TLRPC.Chat) {
                userName = ((TLRPC.Chat) tLObject).title;
            } else {
                str2 = "";
            }
            currency = BillingController.getInstance().formatCurrency(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
            currency2 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
            if (i == 0) {
                string = LocaleController.formatString(R.string.FragmentUsernameTitle, zzii.m("@", str));
                string2 = LocaleController.formatString(R.string.FragmentUsernameMessage, LocaleController.formatShortDateTime(tL_collectibleInfo.purchase_date), currency2, TextUtils.isEmpty(currency) ? "" : zzig.m("(", currency, ")"));
                strM = Fragment$$ExternalSyntheticOutline0.m(MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix, "/", str, new StringBuilder());
            } else {
                if (i == 1) {
                    return;
                }
                string = LocaleController.formatString(R.string.FragmentPhoneTitle, PhoneFormat.getInstance().format("+" + str));
                string2 = LocaleController.formatString(R.string.FragmentPhoneMessage, LocaleController.formatShortDateTime(tL_collectibleInfo.purchase_date), currency2, TextUtils.isEmpty(currency) ? "" : zzig.m("(", currency, ")"));
                strM = PhoneFormat.getInstance().format("+" + str);
            }
            String str4 = string2;
            String str5 = string;
            str3 = strM;
            if (str3 != null) {
                BottomSheet bottomSheet3 = bottomSheet2;
                oAuthSheet$$ExternalSyntheticLambda9 = new OAuthSheet$$ExternalSyntheticLambda9(str3, i, bottomSheet3, resourcesProvider, 10);
                bottomSheet = bottomSheet3;
            } else {
                bottomSheet = bottomSheet2;
                oAuthSheet$$ExternalSyntheticLambda9 = null;
            }
            SpannableStringBuilder spannableStringBuilderReplaceSingleTag = AndroidUtilities.replaceSingleTag(str5, oAuthSheet$$ExternalSyntheticLambda9);
            SpannableString spannableString = new SpannableString("TON");
            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_gram_16);
            coloredImageSpan.setWidth(AndroidUtilities.dp(13.0f));
            spannableString.setSpan(coloredImageSpan, 0, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilderReplaceCharSequence = AndroidUtilities.replaceCharSequence("TON", AndroidUtilities.replaceTags(str4), spannableString);
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
            linksTextView.setTypeface(AndroidUtilities.bold());
            linksTextView.setGravity(17);
            int i4 = Theme.key_dialogTextBlack;
            linksTextView.setTextColor(Theme.getColor(i4, resourcesProvider));
            linksTextView.setLinkTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText2, resourcesProvider));
            linksTextView.setTextSize(1, 16.0f);
            linksTextView.setText(spannableStringBuilderReplaceSingleTag);
            linearLayout.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 1, 42, 0, 42, 0));
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), Theme.getColor(Theme.key_groupcreate_spanBackground, resourcesProvider)));
            BackupImageView backupImageView = new BackupImageView(context);
            backupImageView.setRoundRadius(AndroidUtilities.dp(28.0f));
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setInfo(tLObject);
            backupImageView.setForUserOrChat(tLObject, avatarDrawable);
            frameLayout2.addView(backupImageView, LayoutHelper.createFrame(28, 28, 51));
            TextView textView = new TextView(context);
            textView.setTextColor(Theme.getColor(i4, resourcesProvider));
            textView.setTextSize(1, 13.0f);
            textView.setSingleLine();
            textView.setText(Emoji.replaceEmoji(str2, textView.getPaint().getFontMetricsInt(), false));
            frameLayout2.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
            linearLayout.addView(frameLayout2, LayoutHelper.createLinear(-2, 28, 1, 42, 10, 42, 18));
            TextView textView2 = new TextView(context);
            textView2.setGravity(17);
            OKLCH.m(i4, resourcesProvider, textView2, 14.0f);
            textView2.setText(spannableStringBuilderReplaceCharSequence);
            linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 19));
            ButtonWithCounterView round = new ButtonWithCounterView(context, true, resourcesProvider).setRound();
            round.setText(LocaleController.getString(R.string.FragmentUsernameOpen), false);
            round.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda91(2, context, tL_collectibleInfo));
            linearLayout.addView(round, LayoutHelper.createLinear(-1, 48, 6.0f, 0.0f, 6.0f, 0.0f));
            if (oAuthSheet$$ExternalSyntheticLambda9 != null) {
                ButtonWithCounterView neutral = new ButtonWithCounterView(context, true, resourcesProvider).setRound().setNeutral();
                if (i == 0) {
                    i2 = R.string.FragmentUsernameCopy;
                } else {
                    i2 = R.string.FragmentPhoneCopy;
                }
                neutral.setText(LocaleController.getString(i2), false);
                neutral.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda91(3, oAuthSheet$$ExternalSyntheticLambda9, bottomSheet));
                linearLayout.addView(neutral, LayoutHelper.createLinear(-1, 48, 6.0f, 6.0f, 6.0f, 0.0f));
            }
            bottomSheet.setCustomView(linearLayout);
            bottomSheet.show();
        }
        userName = UserObject.getUserName((TLRPC.User) tLObject);
        str2 = userName;
        currency = BillingController.getInstance().formatCurrency(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
        currency2 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
        if (i == 0) {
            string = LocaleController.formatString(R.string.FragmentUsernameTitle, zzii.m("@", str));
            string2 = LocaleController.formatString(R.string.FragmentUsernameMessage, LocaleController.formatShortDateTime(tL_collectibleInfo.purchase_date), currency2, TextUtils.isEmpty(currency) ? "" : zzig.m("(", currency, ")"));
            strM = Fragment$$ExternalSyntheticOutline0.m(MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix, "/", str, new StringBuilder());
        } else {
            if (i == 1) {
                return;
            }
            string = LocaleController.formatString(R.string.FragmentPhoneTitle, PhoneFormat.getInstance().format("+" + str));
            string2 = LocaleController.formatString(R.string.FragmentPhoneMessage, LocaleController.formatShortDateTime(tL_collectibleInfo.purchase_date), currency2, TextUtils.isEmpty(currency) ? "" : zzig.m("(", currency, ")"));
            strM = PhoneFormat.getInstance().format("+" + str);
        }
        String str6 = string2;
        String str7 = string;
        str3 = strM;
        if (str3 != null) {
            BottomSheet bottomSheet4 = bottomSheet2;
            oAuthSheet$$ExternalSyntheticLambda9 = new OAuthSheet$$ExternalSyntheticLambda9(str3, i, bottomSheet4, resourcesProvider, 10);
            bottomSheet = bottomSheet4;
        } else {
            bottomSheet = bottomSheet2;
            oAuthSheet$$ExternalSyntheticLambda9 = null;
        }
        SpannableStringBuilder spannableStringBuilderReplaceSingleTag2 = AndroidUtilities.replaceSingleTag(str7, oAuthSheet$$ExternalSyntheticLambda9);
        SpannableString spannableString2 = new SpannableString("TON");
        ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(R.drawable.mini_gram_16);
        coloredImageSpan2.setWidth(AndroidUtilities.dp(13.0f));
        spannableString2.setSpan(coloredImageSpan2, 0, spannableString2.length(), 33);
        SpannableStringBuilder spannableStringBuilderReplaceCharSequence2 = AndroidUtilities.replaceCharSequence("TON", AndroidUtilities.replaceTags(str6), spannableString2);
        LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context);
        linksTextView2.setTypeface(AndroidUtilities.bold());
        linksTextView2.setGravity(17);
        int i5 = Theme.key_dialogTextBlack;
        linksTextView2.setTextColor(Theme.getColor(i5, resourcesProvider));
        linksTextView2.setLinkTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText2, resourcesProvider));
        linksTextView2.setTextSize(1, 16.0f);
        linksTextView2.setText(spannableStringBuilderReplaceSingleTag2);
        linearLayout.addView(linksTextView2, LayoutHelper.createLinear(-1, -2, 1, 42, 0, 42, 0));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), Theme.getColor(Theme.key_groupcreate_spanBackground, resourcesProvider)));
        BackupImageView backupImageView2 = new BackupImageView(context);
        backupImageView2.setRoundRadius(AndroidUtilities.dp(28.0f));
        AvatarDrawable avatarDrawable2 = new AvatarDrawable();
        avatarDrawable2.setInfo(tLObject);
        backupImageView2.setForUserOrChat(tLObject, avatarDrawable2);
        frameLayout3.addView(backupImageView2, LayoutHelper.createFrame(28, 28, 51));
        TextView textView3 = new TextView(context);
        textView3.setTextColor(Theme.getColor(i5, resourcesProvider));
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine();
        textView3.setText(Emoji.replaceEmoji(str2, textView3.getPaint().getFontMetricsInt(), false));
        frameLayout3.addView(textView3, LayoutHelper.createFrame(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
        linearLayout.addView(frameLayout3, LayoutHelper.createLinear(-2, 28, 1, 42, 10, 42, 18));
        TextView textView4 = new TextView(context);
        textView4.setGravity(17);
        OKLCH.m(i5, resourcesProvider, textView4, 14.0f);
        textView4.setText(spannableStringBuilderReplaceCharSequence2);
        linearLayout.addView(textView4, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 19));
        ButtonWithCounterView round2 = new ButtonWithCounterView(context, true, resourcesProvider).setRound();
        round2.setText(LocaleController.getString(R.string.FragmentUsernameOpen), false);
        round2.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda91(2, context, tL_collectibleInfo));
        linearLayout.addView(round2, LayoutHelper.createLinear(-1, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        if (oAuthSheet$$ExternalSyntheticLambda9 != null) {
            ButtonWithCounterView neutral2 = new ButtonWithCounterView(context, true, resourcesProvider).setRound().setNeutral();
            if (i == 0) {
                i2 = R.string.FragmentUsernameCopy;
            } else {
                i2 = R.string.FragmentPhoneCopy;
            }
            neutral2.setText(LocaleController.getString(i2), false);
            neutral2.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda91(3, oAuthSheet$$ExternalSyntheticLambda9, bottomSheet));
            linearLayout.addView(neutral2, LayoutHelper.createLinear(-1, 48, 6.0f, 6.0f, 6.0f, 0.0f));
        }
        bottomSheet.setCustomView(linearLayout);
        bottomSheet.show();
    }
}
