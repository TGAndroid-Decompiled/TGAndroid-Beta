package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ChannelMonetizationLayout;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda208;
import org.telegram.ui.MessageSeenView$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class AlertsCreator$$ExternalSyntheticLambda26 implements View.OnClickListener {
    public final int $r8$classId = 0;
    public final int f$0;
    public final FrameLayout f$1;
    public final Object f$2;
    public final long f$3;

    public AlertsCreator$$ExternalSyntheticLambda26(int i, ButtonWithCounterView buttonWithCounterView, BottomSheet bottomSheet, long j) {
        this.f$0 = i;
        this.f$1 = buttonWithCounterView;
        this.f$2 = bottomSheet;
        this.f$3 = j;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.random.nextInt();
                int i = this.f$0;
                ConnectionsManager.getInstance(i).sendRequest(createconferencecall, new MessageSeenView$$ExternalSyntheticLambda0(i, (ButtonWithCounterView) this.f$1, (BottomSheet) this.f$2, this.f$3));
                break;
            default:
                ChannelMonetizationLayout channelMonetizationLayout = (ChannelMonetizationLayout) this.f$1;
                channelMonetizationLayout.getClass();
                if (view.isEnabled()) {
                    ButtonWithCounterView buttonWithCounterView = channelMonetizationLayout.starsAdsButton;
                    if (!buttonWithCounterView.loading) {
                        buttonWithCounterView.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i2 = this.f$0;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(i2).getInputPeer(this.f$3);
                        ConnectionsManager.getInstance(i2).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new ChatActivity$$ExternalSyntheticLambda208(15, channelMonetizationLayout, (Activity) this.f$2));
                        break;
                    }
                }
                break;
        }
    }

    public AlertsCreator$$ExternalSyntheticLambda26(ChannelMonetizationLayout channelMonetizationLayout, int i, long j, Activity activity) {
        this.f$1 = channelMonetizationLayout;
        this.f$0 = i;
        this.f$3 = j;
        this.f$2 = activity;
    }
}
