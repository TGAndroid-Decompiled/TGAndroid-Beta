package org.telegram.ui.Gifts;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.Premium.GiftPremiumBottomSheet$GiftTier;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;

public final class SendGiftSheet$$ExternalSyntheticLambda0 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final SendGiftSheet f$0;

    public SendGiftSheet$$ExternalSyntheticLambda0(SendGiftSheet sendGiftSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = sendGiftSheet;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        int i;
        FrameLayout frameLayout;
        CharSequence charSequenceReplaceArrows;
        SendGiftSheet sendGiftSheet = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                int i2 = sendGiftSheet.currentAccount;
                MessagesController messagesController = MessagesController.getInstance(i2);
                long j = sendGiftSheet.dialogId;
                long sendPaidMessagesStars = messagesController.getSendPaidMessagesStars(j);
                arrayList.add(UItem.asCustom(-1, sendGiftSheet.chatView));
                if (sendPaidMessagesStars <= 0) {
                    arrayList.add(UItem.asCustom(-2, sendGiftSheet.messageEdit));
                    int iDp = AndroidUtilities.dp(12.0f);
                    UItem uItem = new UItem(28);
                    uItem.intValue = iDp;
                    arrayList.add(uItem);
                }
                TL_stars.StarGift starGift = sendGiftSheet.starGift;
                String str = sendGiftSheet.name;
                if (starGift != null) {
                    boolean z = starGift.can_upgrade;
                    boolean z2 = sendGiftSheet.self;
                    if (!z || z2) {
                        arrayList.add(UItem.asShadow(-5, null));
                    } else {
                        arrayList.add(UItem.asShadow(-3, null));
                        UItem uItemAsCheck = UItem.asCheck(2, StarsIntroActivity.replaceStarsWithPlain(false, LocaleController.formatString(z2 ? R.string.Gift2UpgradeSelf : R.string.Gift2Upgrade, Integer.valueOf((int) starGift.upgrade_stars)), 0.78f, null));
                        sendGiftSheet = sendGiftSheet;
                        uItemAsCheck.setChecked(sendGiftSheet.upgrade);
                        arrayList.add(uItemAsCheck);
                        boolean z3 = sendGiftSheet.forceUpgrade;
                        boolean z4 = sendGiftSheet.forceNotUpgrade;
                        if (z4) {
                            charSequenceReplaceArrows = LocaleController.formatString(j < 0 ? R.string.Gift2NoUpgradeChannelForcedInfo : R.string.Gift2NoUpgradeForcedInfo, str);
                        } else if (z3) {
                            charSequenceReplaceArrows = LocaleController.formatString(j < 0 ? R.string.Gift2UpgradeChannelForcedInfo : R.string.Gift2UpgradeForcedInfo, str);
                        } else {
                            charSequenceReplaceArrows = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(z2 ? LocaleController.getString(R.string.Gift2UpgradeSelfInfo) : LocaleController.formatString(j >= 0 ? R.string.Gift2UpgradeInfo : R.string.Gift2UpgradeChannelInfo, str), new SendGiftSheet$$ExternalSyntheticLambda3(sendGiftSheet, 3)), true);
                        }
                        UItem uItemAsShadow = UItem.asShadow(-5, charSequenceReplaceArrows);
                        uItemAsShadow.enabled = (z3 || z4) ? false : true;
                        arrayList.add(uItemAsShadow);
                    }
                    UItem uItemAsCheck2 = UItem.asCheck(1, LocaleController.getString(z2 ? R.string.Gift2HideSelf : R.string.Gift2Hide));
                    uItemAsCheck2.setChecked(sendGiftSheet.anonymous);
                    arrayList.add(uItemAsCheck2);
                    if (z2) {
                        i = R.string.Gift2HideSelfInfo;
                    } else {
                        if (j < 0) {
                            i = R.string.Gift2HideChannelInfo;
                        } else {
                            string = LocaleController.formatString(R.string.Gift2HideInfo, str);
                        }
                        arrayList.add(UItem.asShadow(-6, string));
                        frameLayout = sendGiftSheet.limitContainerWrapper;
                        if (frameLayout != null) {
                            int i3 = starGift.gifts_per_round;
                            CharSequence charSequenceReplaceArrows2 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("Gift2AuctionInfoLearnMore2", i3, Integer.valueOf(i3)), new SendGiftSheet$$ExternalSyntheticLambda3(sendGiftSheet, 4)), true);
                            arrayList.add(UItem.asCustom(-43, frameLayout));
                            arrayList.add(UItem.asShadow(-44, charSequenceReplaceArrows2));
                        }
                    }
                    string = LocaleController.getString(i);
                    arrayList.add(UItem.asShadow(-6, string));
                    frameLayout = sendGiftSheet.limitContainerWrapper;
                    if (frameLayout != null) {
                        int i4 = starGift.gifts_per_round;
                        CharSequence charSequenceReplaceArrows3 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("Gift2AuctionInfoLearnMore2", i4, Integer.valueOf(i4)), new SendGiftSheet$$ExternalSyntheticLambda3(sendGiftSheet, 4)), true);
                        arrayList.add(UItem.asCustom(-43, frameLayout));
                        arrayList.add(UItem.asShadow(-44, charSequenceReplaceArrows3));
                    }
                } else {
                    if (sendPaidMessagesStars <= 0) {
                        arrayList.add(UItem.asShadow(-3, LocaleController.formatString(R.string.Gift2MessagePremiumInfo, str)));
                    }
                    GiftPremiumBottomSheet$GiftTier giftPremiumBottomSheet$GiftTier = sendGiftSheet.premiumTier;
                    if (giftPremiumBottomSheet$GiftTier != null) {
                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = giftPremiumBottomSheet$GiftTier.starsCodeOption;
                        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = giftPremiumBottomSheet$GiftTier.starsOption;
                        if (tL_premiumGiftOption != null || tL_premiumGiftCodeOption != null) {
                            UItem uItemAsCheck3 = UItem.asCheck(3, StarsIntroActivity.replaceStarsWithPlain(false, LocaleController.formatString(R.string.Gift2MessageStars, Integer.valueOf((int) (tL_premiumGiftOption != null ? tL_premiumGiftOption.amount : tL_premiumGiftCodeOption != null ? tL_premiumGiftCodeOption.amount : 0L))), 0.78f, null));
                            uItemAsCheck3.setChecked(sendGiftSheet.useStars);
                            arrayList.add(uItemAsCheck3);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatNumber(StarsController.getInstance(i2, false).getBalance().amount, ','));
                            spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                            arrayList.add(UItem.asShadow(-7, TextUtils.concat(StarsIntroActivity.replaceStarsWithPlain(false, LocaleController.formatSpannable(R.string.Gift2MessageStarsInfo, spannableStringBuilder), 0.66f, null), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new SendGiftSheet$$ExternalSyntheticLambda3(sendGiftSheet, 5)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)))));
                        }
                    }
                }
                if (sendGiftSheet.reverseLayout) {
                    Collections.reverse(arrayList);
                }
                break;
            default:
                String str2 = (String) obj2;
                sendGiftSheet.getClass();
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                SendGiftSheet.AnonymousClass3 anonymousClass3 = sendGiftSheet.messageEdit;
                if (!zBooleanValue) {
                    boolean zEqualsIgnoreCase = "STARGIFT_USAGE_LIMITED".equalsIgnoreCase(str2);
                    TL_stars.StarGift starGift2 = sendGiftSheet.starGift;
                    if (zEqualsIgnoreCase) {
                        AndroidUtilities.hideKeyboard(anonymousClass3);
                        sendGiftSheet.lambda$showGiftOfferSheet$15();
                        StarsController starsController = StarsController.getInstance(sendGiftSheet.currentAccount, false);
                        if (starGift2 != null && starsController.giftsLoaded) {
                            starGift2.availability_remains = 0;
                            starsController.saveStarGiftsCached(starsController.giftsHash, starsController.giftsRemoteTime, starsController.gifts);
                            NotificationCenter.getInstance(starsController.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftSoldOut, starGift2);
                            break;
                        }
                    } else if ("STARGIFT_USER_USAGE_LIMITED".equalsIgnoreCase(str2)) {
                        AndroidUtilities.hideKeyboard(anonymousClass3);
                        sendGiftSheet.lambda$showGiftOfferSheet$15();
                        BulletinFactory parentBulletinFactory = sendGiftSheet.getParentBulletinFactory();
                        if (parentBulletinFactory != null && starGift2 != null && starGift2.limited_per_user) {
                            parentBulletinFactory.createSimpleMultiBulletin(starGift2.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PerUserLimit", starGift2.per_user_total))).show();
                            break;
                        }
                    }
                } else {
                    Runnable runnable = sendGiftSheet.closeParentSheet;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.hideKeyboard(anonymousClass3);
                    sendGiftSheet.lambda$showGiftOfferSheet$15();
                }
                sendGiftSheet.button.setLoading(false);
                break;
        }
    }
}
