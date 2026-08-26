package org.telegram.ui.Stars;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.TelegramMediaSession$$ExternalSyntheticOutline0;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.FireworksOverlay;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.Gifts.SendGiftSheet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda60;

public final class StarGiftSheet$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final StarGiftSheet f$0;

    public StarGiftSheet$$ExternalSyntheticLambda4(StarGiftSheet starGiftSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = starGiftSheet;
    }

    @Override
    public final void run() {
        String strM;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        StarGiftSheet.Roller.Attr attr;
        StarGiftSheet starGiftSheet = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                new ExplainStarsSheet(starGiftSheet.getContext()).show();
                break;
            case 1:
                starGiftSheet.openUpgradePrices();
                break;
            case 2:
                starGiftSheet.lambda$showGiftOfferSheet$15();
                break;
            case 3:
                starGiftSheet.button.setLoading(false);
                starGiftSheet.switchPage(0, true, null);
                break;
            case 4:
                new ExplainStarsSheet(starGiftSheet.getContext()).show();
                break;
            case 5:
                starGiftSheet.lambda$doUpgrade$128();
                break;
            case 6:
                starGiftSheet.tickUpgradePrice();
                break;
            case 7:
                starGiftSheet.lambda$openCrafting$8();
                break;
            case 8:
                starGiftSheet.lambda$onMenuPressed$10();
                break;
            case 9:
                starGiftSheet.openCrafting(true);
                break;
            case 10:
                starGiftSheet.onUpdatePriceClick();
                break;
            case 11:
                starGiftSheet.onSharePressed$1();
                break;
            case 12:
                starGiftSheet.showGiftOfferSheet();
                break;
            case 13:
                starGiftSheet.lambda$showGiftOfferSheet$15();
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                TL_stars.TL_starGiftUnique uniqueGift = starGiftSheet.getUniqueGift();
                if (safeLastFragment != null && uniqueGift != null) {
                    DialogsActivity dialogsActivity = new DialogsActivity(TelegramMediaSession$$ExternalSyntheticOutline0.m("onlySelect", "dialogsType", 4, true));
                    dialogsActivity.setDelegate(new RichEditor$$ExternalSyntheticLambda60(starGiftSheet, uniqueGift, dialogsActivity, 11));
                    safeLastFragment.presentFragment(dialogsActivity);
                    break;
                }
                break;
            case 14:
                starGiftSheet.openTransfer();
                break;
            case 15:
                long dialogId$1 = starGiftSheet.getDialogId$1();
                if (dialogId$1 != 0) {
                    starGiftSheet.openProfile(dialogId$1);
                    break;
                }
                break;
            case 16:
                starGiftSheet.toggleShow();
                break;
            case 17:
                starGiftSheet.lambda$openCrafting$8();
                break;
            case 18:
                starGiftSheet.getBulletinFactory().createSimpleBulletin(R.raw.copy, LocaleController.getString(R.string.WalletAddressCopied)).show(false);
                break;
            case 19:
                if (starGiftSheet.getGift() != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(starGiftSheet.getGift().title);
                    sb.append(" #");
                    strM = BillingController$$ExternalSyntheticOutline0.m(starGiftSheet.getGift().num, ',', sb);
                } else {
                    strM = "";
                }
                starGiftSheet.getBulletinFactory().createSimpleBulletin(R.raw.gift_upgrade, LocaleController.getString(R.string.Gift2UpgradedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2UpgradedText, strM))).setDuration(5000).ignoreDetach().show();
                FireworksOverlay fireworksOverlay = starGiftSheet.fireworksOverlay;
                if (fireworksOverlay != null) {
                    fireworksOverlay.start(true);
                }
                break;
            case 20:
                starGiftSheet.lambda$set$65();
                break;
            case 21:
                starGiftSheet.getBulletinFactory().createSimpleBulletin(R.raw.copy, LocaleController.getString(R.string.WalletAddressCopied)).show(false);
                break;
            case 22:
                StarGiftSheet.Roller.AttrRoller attrRoller = starGiftSheet.roller.modelRoller;
                ImageReceiver imageReceiver = (attrRoller == null || (attr = attrRoller.current) == null) ? null : ((StarGiftSheet.Roller.Sticker) attr).imageReceiver;
                StarGiftSheet.TopView topView = starGiftSheet.topView;
                BackupImageView backupImageView = topView.imageView[0];
                if (imageReceiver != null && backupImageView != null && backupImageView.getImageReceiver() != null) {
                    RLottieDrawable lottieAnimation = imageReceiver.getLottieAnimation();
                    RLottieDrawable lottieAnimation2 = backupImageView.getImageReceiver().getLottieAnimation();
                    if (lottieAnimation2 != null && lottieAnimation != null) {
                        lottieAnimation2.setProgress(lottieAnimation.getProgress(), false);
                    } else if (lottieAnimation2 == null && lottieAnimation != null) {
                        imageReceiver.clearImage();
                        backupImageView.setImageDrawable(lottieAnimation);
                    }
                }
                topView.imageLayout.setAlpha(1.0f);
                topView.imagesRollView.setAlpha(0.0f);
                boolean z = starGiftSheet.upgradedOnce;
                ButtonWithCounterView buttonWithCounterView = starGiftSheet.button;
                if (z && starGiftSheet.viewPager != null && starGiftSheet.giftsList != null && starGiftSheet.getListPosition$1() >= 0 && starGiftSheet.giftsList.findGiftToUpgrade(starGiftSheet.getListPosition$1()) >= 0) {
                    buttonWithCounterView.setFilled(false);
                    int iFindGiftToUpgrade = starGiftSheet.giftsList.findGiftToUpgrade(starGiftSheet.getListPosition$1());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                    Object obj = starGiftSheet.giftsList.get(iFindGiftToUpgrade);
                    if ((obj instanceof TL_stars.SavedStarGift) && (starGift = ((TL_stars.SavedStarGift) obj).gift) != null && (document = starGift.getDocument()) != null) {
                        spannableStringBuilder.append((CharSequence) " e");
                        spannableStringBuilder.setSpan(new AnimatedEmojiSpan(document, buttonWithCounterView.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    }
                    buttonWithCounterView.setText(spannableStringBuilder, true);
                    buttonWithCounterView.setSubText(null, true);
                    buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda10(starGiftSheet, iFindGiftToUpgrade, 1));
                } else {
                    buttonWithCounterView.setFilled(true);
                    buttonWithCounterView.setText(LocaleController.getString(R.string.OK), true);
                    buttonWithCounterView.setSubText(null, true);
                    buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda9(starGiftSheet, 2));
                }
                break;
            case 23:
                starGiftSheet.getClass();
                SendGiftSheet.AnonymousClass8 anonymousClass8 = new SendGiftSheet.AnonymousClass8(starGiftSheet, 3);
                new PremiumFeatureBottomSheet(anonymousClass8, starGiftSheet.getContext(), anonymousClass8.getCurrentAccount(), false, 12, false, null).show();
                break;
            default:
                starGiftSheet.convert();
                break;
        }
    }
}
