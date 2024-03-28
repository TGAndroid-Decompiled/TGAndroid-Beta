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
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.tl.TL_fragment$TL_collectibleInfo;
import org.telegram.ui.ActionBar.BottomSheet;
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
    public static void open(final Context context, final int i, String str, TLObject tLObject, final TL_fragment$TL_collectibleInfo tL_fragment$TL_collectibleInfo, final Theme.ResourcesProvider resourcesProvider) {
        String str2;
        LinearLayout linearLayout;
        String str3;
        String formatString;
        String str4;
        String formatString2;
        final String format;
        final BottomSheet bottomSheet = new BottomSheet(context, false, resourcesProvider);
        bottomSheet.fixNavigationBar(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        int i2 = i == 0 ? 70 : 78;
        rLottieImageView.setAnimation(i == 0 ? R.raw.fragment_username : R.raw.fragment_phone, i2, i2);
        rLottieImageView.playAnimation();
        rLottieImageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        rLottieImageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(80.0f), Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider)));
        linearLayout2.addView(rLottieImageView, LayoutHelper.createLinear(80, 80, 1, 0, 16, 0, 16));
        if (tLObject instanceof TLRPC$User) {
            str2 = UserObject.getUserName((TLRPC$User) tLObject);
        } else {
            str2 = tLObject instanceof TLRPC$Chat ? ((TLRPC$Chat) tLObject).title : "";
        }
        String formatCurrency = BillingController.getInstance().formatCurrency(tL_fragment$TL_collectibleInfo.amount, tL_fragment$TL_collectibleInfo.currency);
        String formatCurrency2 = BillingController.getInstance().formatCurrency(tL_fragment$TL_collectibleInfo.crypto_amount, tL_fragment$TL_collectibleInfo.crypto_currency);
        if (i == 0) {
            int i3 = R.string.FragmentUsernameTitle;
            String str5 = "";
            StringBuilder sb = new StringBuilder();
            str3 = str2;
            sb.append("@");
            sb.append(str);
            String formatString3 = LocaleController.formatString(i3, sb.toString());
            int i4 = R.string.FragmentUsernameMessage;
            Object[] objArr = new Object[3];
            linearLayout = linearLayout2;
            objArr[0] = LocaleController.formatShortDateTime(tL_fragment$TL_collectibleInfo.purchase_date);
            objArr[1] = formatCurrency2;
            if (!TextUtils.isEmpty(formatCurrency)) {
                str5 = "(" + formatCurrency + ")";
            }
            objArr[2] = str5;
            formatString2 = LocaleController.formatString(i4, objArr);
            format = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/" + str;
            formatString = formatString3;
        } else {
            linearLayout = linearLayout2;
            str3 = str2;
            if (i != 1) {
                return;
            }
            formatString = LocaleController.formatString(R.string.FragmentPhoneTitle, PhoneFormat.getInstance().format("+" + str));
            int i5 = R.string.FragmentPhoneMessage;
            Object[] objArr2 = new Object[3];
            objArr2[0] = LocaleController.formatShortDateTime((long) tL_fragment$TL_collectibleInfo.purchase_date);
            objArr2[1] = formatCurrency2;
            if (TextUtils.isEmpty(formatCurrency)) {
                str4 = "";
            } else {
                str4 = "(" + formatCurrency + ")";
            }
            objArr2[2] = str4;
            formatString2 = LocaleController.formatString(i5, objArr2);
            format = PhoneFormat.getInstance().format("+" + str);
        }
        final Runnable runnable = format != null ? new Runnable() {
            @Override
            public final void run() {
                FragmentUsernameBottomSheet.lambda$open$0(format, i, bottomSheet, resourcesProvider);
            }
        } : null;
        SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(formatString, runnable);
        SpannableString spannableString = new SpannableString("TON");
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_ton);
        coloredImageSpan.setWidth(AndroidUtilities.dp(13.0f));
        spannableString.setSpan(coloredImageSpan, 0, spannableString.length(), 33);
        SpannableStringBuilder replaceCharSequence = AndroidUtilities.replaceCharSequence("TON", AndroidUtilities.replaceTags(formatString2), spannableString);
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
        linksTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        linksTextView.setGravity(17);
        int i6 = Theme.key_dialogTextBlack;
        linksTextView.setTextColor(Theme.getColor(i6, resourcesProvider));
        linksTextView.setLinkTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText2, resourcesProvider));
        linksTextView.setTextSize(1, 16.0f);
        linksTextView.setText(replaceSingleTag);
        LinearLayout linearLayout3 = linearLayout;
        linearLayout3.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 1, 42, 0, 42, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), Theme.getColor(Theme.key_groupcreate_spanBackground, resourcesProvider)));
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setRoundRadius(AndroidUtilities.dp(28.0f));
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        avatarDrawable.setInfo(tLObject);
        backupImageView.setForUserOrChat(tLObject, avatarDrawable);
        frameLayout.addView(backupImageView, LayoutHelper.createFrame(28, 28, 51));
        TextView textView = new TextView(context);
        textView.setTextColor(Theme.getColor(i6, resourcesProvider));
        textView.setTextSize(1, 13.0f);
        textView.setSingleLine();
        textView.setText(Emoji.replaceEmoji(str3, textView.getPaint().getFontMetricsInt(), false));
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
        linearLayout3.addView(frameLayout, LayoutHelper.createLinear(-2, 28, 1, 42, 10, 42, 18));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextColor(Theme.getColor(i6, resourcesProvider));
        textView2.setTextSize(1, 14.0f);
        textView2.setText(replaceCharSequence);
        linearLayout3.addView(textView2, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 19));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
        buttonWithCounterView.setText(LocaleController.getString(R.string.FragmentUsernameOpen), false);
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                FragmentUsernameBottomSheet.lambda$open$1(context, tL_fragment$TL_collectibleInfo, view);
            }
        });
        linearLayout3.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        if (runnable != null) {
            ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, false, resourcesProvider);
            buttonWithCounterView2.setText(LocaleController.getString(i == 0 ? R.string.FragmentUsernameCopy : R.string.FragmentPhoneCopy), false);
            buttonWithCounterView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    FragmentUsernameBottomSheet.lambda$open$2(runnable, bottomSheet, view);
                }
            });
            linearLayout3.addView(buttonWithCounterView2, LayoutHelper.createLinear(-1, 48, 6.0f, 6.0f, 6.0f, 0.0f));
        }
        bottomSheet.setCustomView(linearLayout3);
        bottomSheet.show();
    }

    public static void lambda$open$0(String str, int i, BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider) {
        AndroidUtilities.addToClipboard(str);
        if (i == 1) {
            BulletinFactory.of(bottomSheet.getContainer(), resourcesProvider).createCopyBulletin(LocaleController.getString(R.string.PhoneCopied)).show();
        } else {
            BulletinFactory.of(bottomSheet.getContainer(), resourcesProvider).createCopyLinkBulletin().show();
        }
    }

    public static void lambda$open$1(Context context, TL_fragment$TL_collectibleInfo tL_fragment$TL_collectibleInfo, View view) {
        Browser.openUrl(context, tL_fragment$TL_collectibleInfo.url);
    }

    public static void lambda$open$2(Runnable runnable, BottomSheet bottomSheet, View view) {
        runnable.run();
        bottomSheet.dismiss();
    }
}
