package org.telegram.ui;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_language_id_common.zzij;
import com.google.android.gms.internal.mlkit_language_id_common.zzil;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public abstract class FragmentUsernameBottomSheet {
    public static void open(Activity activity, int i, String str, TLObject tLObject, TL_fragment.TL_collectibleInfo tL_collectibleInfo, Theme.ResourcesProvider resourcesProvider) {
        String str2;
        String userName;
        String currency;
        String currency2;
        String strM;
        String str3;
        String strM2;
        String string;
        Theme.ResourcesProvider resourcesProvider2;
        BottomSheet bottomSheet;
        OAuthSheet$$ExternalSyntheticLambda2 oAuthSheet$$ExternalSyntheticLambda2;
        int i2;
        String strM3;
        BottomSheet bottomSheet2 = new BottomSheet(activity, resourcesProvider, false, false);
        bottomSheet2.fixNavigationBar(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(80.0f), Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider)));
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(80, 80, 1, 0, 16, 0, 16));
        RLottieImageView rLottieImageView = new RLottieImageView(activity);
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        int i3 = i == 0 ? 70 : 78;
        rLottieImageView.setAnimation(i == 0 ? R.raw.fragment_username : R.raw.fragment, i3, i3, null);
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
                String string2 = LocaleController.formatString(R.string.FragmentUsernameTitle, zzil.m("@", str));
                int i4 = R.string.FragmentUsernameMessage;
                String shortDateTime = LocaleController.formatShortDateTime(tL_collectibleInfo.purchase_date);
                if (TextUtils.isEmpty(currency)) {
                    strM3 = "";
                } else {
                    strM3 = zzij.m("(", currency, ")");
                }
                str3 = string2;
                string = LocaleController.formatString(i4, shortDateTime, currency2, strM3);
                strM2 = SurfaceContainer$$ExternalSyntheticOutline0.m(MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix, "/", str, new StringBuilder());
            } else {
                if (i == 1) {
                    return;
                }
                String string3 = LocaleController.formatString(R.string.FragmentPhoneTitle, PhoneFormat.getInstance().format("+" + str));
                int i5 = R.string.FragmentPhoneMessage;
                String shortDateTime2 = LocaleController.formatShortDateTime((long) tL_collectibleInfo.purchase_date);
                if (TextUtils.isEmpty(currency)) {
                    strM = "";
                } else {
                    strM = zzij.m("(", currency, ")");
                }
                String string4 = LocaleController.formatString(i5, shortDateTime2, currency2, strM);
                str3 = string3;
                strM2 = PhoneFormat.getInstance().format("+" + str);
                string = string4;
            }
            if (strM2 != null) {
                BottomSheet bottomSheet3 = bottomSheet2;
                resourcesProvider2 = resourcesProvider;
                oAuthSheet$$ExternalSyntheticLambda2 = new OAuthSheet$$ExternalSyntheticLambda2(strM2, i, bottomSheet3, resourcesProvider2, 3);
                bottomSheet = bottomSheet3;
            } else {
                resourcesProvider2 = resourcesProvider;
                bottomSheet = bottomSheet2;
                oAuthSheet$$ExternalSyntheticLambda2 = null;
            }
            SpannableStringBuilder spannableStringBuilderReplaceSingleTag = AndroidUtilities.replaceSingleTag(str3, oAuthSheet$$ExternalSyntheticLambda2);
            SpannableString spannableString = new SpannableString("TON");
            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_gram_16);
            coloredImageSpan.setWidth(AndroidUtilities.dp(13.0f));
            spannableString.setSpan(coloredImageSpan, 0, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilderReplaceCharSequence = AndroidUtilities.replaceCharSequence("TON", AndroidUtilities.replaceTags(string), spannableString);
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(activity, null);
            linksTextView.setTypeface(AndroidUtilities.bold());
            linksTextView.setGravity(17);
            int i6 = Theme.key_dialogTextBlack;
            linksTextView.setTextColor(Theme.getColor(i6, resourcesProvider2));
            linksTextView.setLinkTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText2, resourcesProvider2));
            linksTextView.setTextSize(1, 16.0f);
            linksTextView.setText(spannableStringBuilderReplaceSingleTag);
            linearLayout.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 1, 42, 0, 42, 0));
            FrameLayout frameLayout2 = new FrameLayout(activity);
            frameLayout2.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), Theme.getColor(Theme.key_groupcreate_spanBackground, resourcesProvider2)));
            BackupImageView backupImageView = new BackupImageView(activity);
            backupImageView.setRoundRadius(AndroidUtilities.dp(28.0f));
            AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
            avatarDrawable.setInfo(tLObject);
            backupImageView.imageReceiver.setForUserOrChat(tLObject, avatarDrawable);
            backupImageView.onNewImageSet();
            frameLayout2.addView(backupImageView, LayoutHelper.createFrame(28, 28, 51));
            TextView textView = new TextView(activity);
            textView.setTextColor(Theme.getColor(i6, resourcesProvider2));
            textView.setTextSize(1, 13.0f);
            textView.setSingleLine();
            textView.setText(Emoji.replaceEmoji(str2, textView.getPaint().getFontMetricsInt(), false));
            frameLayout2.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
            linearLayout.addView(frameLayout2, LayoutHelper.createLinear(-2, 28, 1, 42, 10, 42, 18));
            TextView textView2 = new TextView(activity);
            textView2.setGravity(17);
            OKLCH.m(i6, resourcesProvider2, textView2, 14.0f);
            textView2.setText(spannableStringBuilderReplaceCharSequence);
            linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 19));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(activity, resourcesProvider2, true);
            buttonWithCounterView.setRoundRadius(24);
            buttonWithCounterView.setText(LocaleController.getString(R.string.FragmentUsernameOpen), false, true);
            buttonWithCounterView.setOnClickListener(new IntroActivity$$ExternalSyntheticLambda1(9, activity, tL_collectibleInfo));
            linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
            if (oAuthSheet$$ExternalSyntheticLambda2 != null) {
                ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(activity, resourcesProvider2, true);
                buttonWithCounterView2.setRoundRadius(24);
                buttonWithCounterView2.setNeutral();
                if (i == 0) {
                    i2 = R.string.FragmentUsernameCopy;
                } else {
                    i2 = R.string.FragmentPhoneCopy;
                }
                buttonWithCounterView2.setText(LocaleController.getString(i2), false, true);
                buttonWithCounterView2.setOnClickListener(new IntroActivity$$ExternalSyntheticLambda1(10, oAuthSheet$$ExternalSyntheticLambda2, bottomSheet));
                linearLayout.addView(buttonWithCounterView2, LayoutHelper.createLinear(6.0f, 6.0f, 6.0f, 0.0f, -1, 48));
            }
            bottomSheet.setCustomView(linearLayout);
            bottomSheet.show();
        }
        userName = UserObject.getUserName((TLRPC.User) tLObject);
        str2 = userName;
        currency = BillingController.getInstance().formatCurrency(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
        currency2 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
        if (i == 0) {
            String string5 = LocaleController.formatString(R.string.FragmentUsernameTitle, zzil.m("@", str));
            int i7 = R.string.FragmentUsernameMessage;
            String shortDateTime3 = LocaleController.formatShortDateTime(tL_collectibleInfo.purchase_date);
            if (TextUtils.isEmpty(currency)) {
                strM3 = "";
            } else {
                strM3 = zzij.m("(", currency, ")");
            }
            str3 = string5;
            string = LocaleController.formatString(i7, shortDateTime3, currency2, strM3);
            strM2 = SurfaceContainer$$ExternalSyntheticOutline0.m(MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix, "/", str, new StringBuilder());
        } else {
            if (i == 1) {
                return;
            }
            String string6 = LocaleController.formatString(R.string.FragmentPhoneTitle, PhoneFormat.getInstance().format("+" + str));
            int i8 = R.string.FragmentPhoneMessage;
            String shortDateTime4 = LocaleController.formatShortDateTime((long) tL_collectibleInfo.purchase_date);
            if (TextUtils.isEmpty(currency)) {
                strM = "";
            } else {
                strM = zzij.m("(", currency, ")");
            }
            String string7 = LocaleController.formatString(i8, shortDateTime4, currency2, strM);
            str3 = string6;
            strM2 = PhoneFormat.getInstance().format("+" + str);
            string = string7;
        }
        if (strM2 != null) {
            BottomSheet bottomSheet4 = bottomSheet2;
            resourcesProvider2 = resourcesProvider;
            oAuthSheet$$ExternalSyntheticLambda2 = new OAuthSheet$$ExternalSyntheticLambda2(strM2, i, bottomSheet4, resourcesProvider2, 3);
            bottomSheet = bottomSheet4;
        } else {
            resourcesProvider2 = resourcesProvider;
            bottomSheet = bottomSheet2;
            oAuthSheet$$ExternalSyntheticLambda2 = null;
        }
        SpannableStringBuilder spannableStringBuilderReplaceSingleTag2 = AndroidUtilities.replaceSingleTag(str3, oAuthSheet$$ExternalSyntheticLambda2);
        SpannableString spannableString2 = new SpannableString("TON");
        ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(R.drawable.mini_gram_16);
        coloredImageSpan2.setWidth(AndroidUtilities.dp(13.0f));
        spannableString2.setSpan(coloredImageSpan2, 0, spannableString2.length(), 33);
        SpannableStringBuilder spannableStringBuilderReplaceCharSequence2 = AndroidUtilities.replaceCharSequence("TON", AndroidUtilities.replaceTags(string), spannableString2);
        LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(activity, null);
        linksTextView2.setTypeface(AndroidUtilities.bold());
        linksTextView2.setGravity(17);
        int i9 = Theme.key_dialogTextBlack;
        linksTextView2.setTextColor(Theme.getColor(i9, resourcesProvider2));
        linksTextView2.setLinkTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText2, resourcesProvider2));
        linksTextView2.setTextSize(1, 16.0f);
        linksTextView2.setText(spannableStringBuilderReplaceSingleTag2);
        linearLayout.addView(linksTextView2, LayoutHelper.createLinear(-1, -2, 1, 42, 0, 42, 0));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        frameLayout3.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), Theme.getColor(Theme.key_groupcreate_spanBackground, resourcesProvider2)));
        BackupImageView backupImageView2 = new BackupImageView(activity);
        backupImageView2.setRoundRadius(AndroidUtilities.dp(28.0f));
        AvatarDrawable avatarDrawable2 = new AvatarDrawable((Theme.ResourcesProvider) null);
        avatarDrawable2.setInfo(tLObject);
        backupImageView2.imageReceiver.setForUserOrChat(tLObject, avatarDrawable2);
        backupImageView2.onNewImageSet();
        frameLayout3.addView(backupImageView2, LayoutHelper.createFrame(28, 28, 51));
        TextView textView3 = new TextView(activity);
        textView3.setTextColor(Theme.getColor(i9, resourcesProvider2));
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine();
        textView3.setText(Emoji.replaceEmoji(str2, textView3.getPaint().getFontMetricsInt(), false));
        frameLayout3.addView(textView3, LayoutHelper.createFrame(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
        linearLayout.addView(frameLayout3, LayoutHelper.createLinear(-2, 28, 1, 42, 10, 42, 18));
        TextView textView4 = new TextView(activity);
        textView4.setGravity(17);
        OKLCH.m(i9, resourcesProvider2, textView4, 14.0f);
        textView4.setText(spannableStringBuilderReplaceCharSequence2);
        linearLayout.addView(textView4, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 19));
        ButtonWithCounterView buttonWithCounterView3 = new ButtonWithCounterView(activity, resourcesProvider2, true);
        buttonWithCounterView3.setRoundRadius(24);
        buttonWithCounterView3.setText(LocaleController.getString(R.string.FragmentUsernameOpen), false, true);
        buttonWithCounterView3.setOnClickListener(new IntroActivity$$ExternalSyntheticLambda1(9, activity, tL_collectibleInfo));
        linearLayout.addView(buttonWithCounterView3, LayoutHelper.createLinear(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
        if (oAuthSheet$$ExternalSyntheticLambda2 != null) {
            ButtonWithCounterView buttonWithCounterView4 = new ButtonWithCounterView(activity, resourcesProvider2, true);
            buttonWithCounterView4.setRoundRadius(24);
            buttonWithCounterView4.setNeutral();
            if (i == 0) {
                i2 = R.string.FragmentUsernameCopy;
            } else {
                i2 = R.string.FragmentPhoneCopy;
            }
            buttonWithCounterView4.setText(LocaleController.getString(i2), false, true);
            buttonWithCounterView4.setOnClickListener(new IntroActivity$$ExternalSyntheticLambda1(10, oAuthSheet$$ExternalSyntheticLambda2, bottomSheet));
            linearLayout.addView(buttonWithCounterView4, LayoutHelper.createLinear(6.0f, 6.0f, 6.0f, 0.0f, -1, 48));
        }
        bottomSheet.setCustomView(linearLayout);
        bottomSheet.show();
    }
}
