package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UniversalRecyclerView;

public final class ChannelMonetizationLayout$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final ChannelMonetizationLayout f$0;

    public ChannelMonetizationLayout$$ExternalSyntheticLambda3(ChannelMonetizationLayout channelMonetizationLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = channelMonetizationLayout;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ChannelMonetizationLayout channelMonetizationLayout = this.f$0;
                channelMonetizationLayout.getClass();
                try {
                    RecyclerListView currentListView = channelMonetizationLayout.transactionsLayout.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().notifyDataSetChanged();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 1:
                Browser.openUrl(this.f$0.getContext(), LocaleController.getString(R.string.MonetizationBalanceInfoLink));
                break;
            case 2:
                Browser.openUrl(this.f$0.getContext(), LocaleController.getString(R.string.MonetizationStarsInfoLink));
                break;
            case 3:
                UniversalRecyclerView universalRecyclerView = this.f$0.listView;
                if (universalRecyclerView != null) {
                    universalRecyclerView.adapter.update(true);
                }
                break;
            case 4:
                ChannelMonetizationLayout channelMonetizationLayout2 = this.f$0;
                channelMonetizationLayout2.initialSwitchOffValue = channelMonetizationLayout2.switchOffValue;
                break;
            case 5:
                this.f$0.starsAdsButton.setLoading(false);
                break;
            case 6:
                this.f$0.progress.setVisibility(8);
                break;
            case 7:
                this.f$0.progress.setVisibility(8);
                break;
            default:
                ChannelMonetizationLayout channelMonetizationLayout3 = this.f$0;
                AndroidUtilities.cancelRunOnUIThread(channelMonetizationLayout3.sendCpmUpdateRunnable);
                if (channelMonetizationLayout3.switchOffValue != channelMonetizationLayout3.initialSwitchOffValue) {
                    TLRPC.TL_channels_restrictSponsoredMessages tL_channels_restrictSponsoredMessages = new TLRPC.TL_channels_restrictSponsoredMessages();
                    int i = channelMonetizationLayout3.currentAccount;
                    tL_channels_restrictSponsoredMessages.channel = MessagesController.getInstance(i).getInputChannel(-channelMonetizationLayout3.dialogId);
                    tL_channels_restrictSponsoredMessages.restricted = channelMonetizationLayout3.switchOffValue;
                    ConnectionsManager.getInstance(i).sendRequest(tL_channels_restrictSponsoredMessages, new ChannelMonetizationLayout$$ExternalSyntheticLambda29(channelMonetizationLayout3, 0));
                    break;
                }
                break;
        }
    }
}
