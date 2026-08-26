package org.telegram.ui.Stars;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.bots.BotShareSheet$$ExternalSyntheticLambda7;

public final class GiftOfferSheet$$ExternalSyntheticLambda0 implements ListenerSet.Event, AlertDialog.OnButtonClickListener {
    public final int f$0;
    public final int f$1;
    public final Object f$2;

    public GiftOfferSheet$$ExternalSyntheticLambda0(int i, int i2, BaseFragment baseFragment) {
        this.f$0 = i;
        this.f$1 = i2;
        this.f$2 = baseFragment;
    }

    @Override
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).onSurfaceSizeChanged((AnalyticsListener.EventTime) this.f$2, this.f$0, this.f$1);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        Browser.Progress progressMakeButtonLoading = alertDialog.makeButtonLoading(-1, true, true);
        progressMakeButtonLoading.init();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.f$0;
        int i2 = this.f$1;
        ConnectionsManager.getInstance(i2).sendRequestTyped(tL_resolveStarGiftOffer, new BotShareSheet$$ExternalSyntheticLambda7(i2, (BaseFragment) this.f$2, progressMakeButtonLoading, alertDialog));
    }

    public GiftOfferSheet$$ExternalSyntheticLambda0(AnalyticsListener.EventTime eventTime, int i, int i2) {
        this.f$2 = eventTime;
        this.f$0 = i;
        this.f$1 = i2;
    }
}
