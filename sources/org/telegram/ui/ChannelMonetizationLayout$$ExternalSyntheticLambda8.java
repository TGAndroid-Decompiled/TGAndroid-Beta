package org.telegram.ui;

import android.text.SpannableStringBuilder;
import com.google.android.gms.internal.mlkit_vision_common.zzko;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.web.WebActionBar;

public final class ChannelMonetizationLayout$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final ChannelMonetizationLayout f$0;
    public final int f$1;

    public ChannelMonetizationLayout$$ExternalSyntheticLambda8(ChannelMonetizationLayout channelMonetizationLayout, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = channelMonetizationLayout;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        int i = this.f$1;
        ChannelMonetizationLayout channelMonetizationLayout = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                channelMonetizationLayout.getClass();
                int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
                boolean z = channelMonetizationLayout.starsBalanceEditTextValue > 0 || channelMonetizationLayout.starsBalanceBlockedUntil > currentTime;
                ChannelMonetizationLayout.AnonymousClass6 anonymousClass6 = channelMonetizationLayout.starsBalanceButton;
                anonymousClass6.setEnabled(z);
                if (currentTime >= channelMonetizationLayout.starsBalanceBlockedUntil) {
                    anonymousClass6.setSubText(null, true);
                    anonymousClass6.setText(StarsIntroActivity.replaceStars(false, channelMonetizationLayout.starsBalanceEditTextAll ? LocaleController.getString(R.string.MonetizationStarsWithdrawAll) : LocaleController.formatPluralStringSpaced("MonetizationStarsWithdraw", (int) channelMonetizationLayout.starsBalanceEditTextValue), channelMonetizationLayout.starRef), true, true);
                } else {
                    anonymousClass6.setText(LocaleController.getString(R.string.MonetizationStarsWithdrawUntil), true, true);
                    if (channelMonetizationLayout.lock == null) {
                        channelMonetizationLayout.lock = new SpannableStringBuilder("l");
                        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_switch_lock);
                        coloredImageSpan.setTopOffset(1);
                        channelMonetizationLayout.lock.setSpan(coloredImageSpan, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) channelMonetizationLayout.lock).append((CharSequence) BotStarsActivity.untilString(channelMonetizationLayout.starsBalanceBlockedUntil - currentTime));
                    anonymousClass6.setSubText(spannableStringBuilder, true);
                    Bulletin bulletin = channelMonetizationLayout.withdrawalBulletin;
                    if (bulletin != null) {
                        Bulletin.Layout layout = bulletin.layout;
                        if ((layout instanceof Bulletin.LottieLayout) && layout.isAttachedToWindow()) {
                            zzko.m(R.string.BotStarsWithdrawalToast, new Object[]{BotStarsActivity.untilString(channelMonetizationLayout.starsBalanceBlockedUntil - currentTime)}, ((Bulletin.LottieLayout) channelMonetizationLayout.withdrawalBulletin.layout).textView);
                        }
                    }
                    ChannelMonetizationLayout$$ExternalSyntheticLambda8 channelMonetizationLayout$$ExternalSyntheticLambda8 = channelMonetizationLayout.setStarsBalanceButtonText;
                    AndroidUtilities.cancelRunOnUIThread(channelMonetizationLayout$$ExternalSyntheticLambda8);
                    AndroidUtilities.runOnUIThread(channelMonetizationLayout$$ExternalSyntheticLambda8, 1000L);
                }
                break;
            case 1:
                Browser.openUrl(channelMonetizationLayout.getContext(), LocaleController.getString(i));
                break;
            default:
                Bulletin bulletin2 = Bulletin.visibleBulletin;
                if (bulletin2 != null) {
                    channelMonetizationLayout.getClass();
                    bulletin2.hide();
                }
                if (channelMonetizationLayout.starsBalance.amount < MessagesController.getInstance(i).starsRevenueWithdrawalMin) {
                    channelMonetizationLayout.starsBalanceEditTextAll = true;
                    channelMonetizationLayout.starsBalanceEditTextValue = channelMonetizationLayout.starsBalance.amount;
                } else {
                    channelMonetizationLayout.starsBalanceEditTextAll = false;
                    channelMonetizationLayout.starsBalanceEditTextValue = MessagesController.getInstance(i).starsRevenueWithdrawalMin;
                }
                channelMonetizationLayout.starsBalanceEditTextIgnore = true;
                String string = Long.toString(channelMonetizationLayout.starsBalanceEditTextValue);
                WebActionBar.AnonymousClass4 anonymousClass4 = channelMonetizationLayout.starsBalanceEditText;
                anonymousClass4.setText(string);
                anonymousClass4.setSelection(anonymousClass4.getText().length());
                channelMonetizationLayout.starsBalanceEditTextIgnore = false;
                ChannelMonetizationLayout$$ExternalSyntheticLambda8 channelMonetizationLayout$$ExternalSyntheticLambda9 = channelMonetizationLayout.setStarsBalanceButtonText;
                AndroidUtilities.cancelRunOnUIThread(channelMonetizationLayout$$ExternalSyntheticLambda9);
                channelMonetizationLayout$$ExternalSyntheticLambda9.run();
                break;
        }
    }
}
