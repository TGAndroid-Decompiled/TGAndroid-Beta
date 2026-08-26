package org.telegram.ui.Stars;

import android.text.SpannableStringBuilder;
import com.google.android.gms.internal.mlkit_vision_common.zzko;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.browser.Browser;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.ColoredImageSpan;

public final class BotStarsActivity$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final BotStarsActivity f$0;

    public BotStarsActivity$$ExternalSyntheticLambda1(BotStarsActivity botStarsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = botStarsActivity;
    }

    @Override
    public final void run() {
        BotStarsActivity botStarsActivity = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                int currentTime = botStarsActivity.getConnectionsManager().getCurrentTime();
                botStarsActivity.balanceButton.setEnabled(botStarsActivity.balanceEditTextValue > 0 || botStarsActivity.balanceBlockedUntil > currentTime);
                if (currentTime >= botStarsActivity.balanceBlockedUntil) {
                    botStarsActivity.balanceButton.setSubText(null, true);
                    botStarsActivity.balanceButton.setText(StarsIntroActivity.replaceStars(false, botStarsActivity.balanceEditTextAll ? LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll) : LocaleController.formatPluralStringSpaced("BotStarsButtonWithdrawShort", (int) botStarsActivity.balanceEditTextValue), botStarsActivity.starRef), true, true);
                } else {
                    botStarsActivity.balanceButton.setText(LocaleController.getString(R.string.BotStarsButtonWithdrawShortUntil), true, true);
                    if (botStarsActivity.lock == null) {
                        botStarsActivity.lock = new SpannableStringBuilder("l");
                        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_switch_lock);
                        coloredImageSpan.setTopOffset(1);
                        botStarsActivity.lock.setSpan(coloredImageSpan, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) botStarsActivity.lock).append((CharSequence) BotStarsActivity.untilString(botStarsActivity.balanceBlockedUntil - currentTime));
                    botStarsActivity.balanceButton.setSubText(spannableStringBuilder, true);
                    Bulletin bulletin = botStarsActivity.withdrawalBulletin;
                    if (bulletin != null) {
                        Bulletin.Layout layout = bulletin.layout;
                        if ((layout instanceof Bulletin.LottieLayout) && layout.isAttachedToWindow()) {
                            zzko.m(R.string.BotStarsWithdrawalToast, new Object[]{BotStarsActivity.untilString(botStarsActivity.balanceBlockedUntil - currentTime)}, ((Bulletin.LottieLayout) botStarsActivity.withdrawalBulletin.layout).textView);
                        }
                    }
                    BotStarsActivity$$ExternalSyntheticLambda1 botStarsActivity$$ExternalSyntheticLambda1 = botStarsActivity.setBalanceButtonText;
                    AndroidUtilities.cancelRunOnUIThread(botStarsActivity$$ExternalSyntheticLambda1);
                    AndroidUtilities.runOnUIThread(botStarsActivity$$ExternalSyntheticLambda1, 1000L);
                }
                break;
            case 1:
                botStarsActivity.lambda$fillItems$14();
                break;
            case 2:
                Browser.openUrl(botStarsActivity.getParentActivity(), LocaleController.getString(R.string.BotMonetizationBalanceInfoLink));
                break;
            case 3:
                botStarsActivity.lambda$withdraw$11();
                break;
            case 4:
                botStarsActivity.adsButton.setLoading(false);
                break;
            default:
                Browser.openUrl(botStarsActivity.getParentActivity(), LocaleController.getString(R.string.BotStarsWithdrawInfoLink));
                break;
        }
    }
}
