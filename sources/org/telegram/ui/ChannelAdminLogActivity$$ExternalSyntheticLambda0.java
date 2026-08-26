package org.telegram.ui;

import androidx.collection.LongSparseArray;
import org.telegram.messenger.utils.OnPostDrawView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.AdminLogFilterAlert2;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;

public final class ChannelAdminLogActivity$$ExternalSyntheticLambda0 implements OnPostDrawView.InvalidateCallback, AdminLogFilterAlert2.AdminLogFilterAlertDelegate, RecyclerAnimationScrollHelper.ScrollListener {
    public final ChannelAdminLogActivity f$0;

    public ChannelAdminLogActivity$$ExternalSyntheticLambda0(ChannelAdminLogActivity channelAdminLogActivity) {
        this.f$0 = channelAdminLogActivity;
    }

    @Override
    public void didSelectRights(TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter, LongSparseArray longSparseArray) {
        this.f$0.lambda$createView$8(tL_channelAdminLogEventsFilter, longSparseArray);
    }

    @Override
    public void onPostDraw(int i) {
        this.f$0.invalidateMergedVisibleBlurredPositionsAndSourcesImpl(i);
    }

    @Override
    public void onScroll() {
        this.f$0.updateMessagesVisiblePart();
    }
}
