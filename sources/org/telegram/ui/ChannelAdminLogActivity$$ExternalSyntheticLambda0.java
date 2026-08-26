package org.telegram.ui;

import org.telegram.messenger.utils.OnPostDrawView;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;

public final class ChannelAdminLogActivity$$ExternalSyntheticLambda0 implements OnPostDrawView.InvalidateCallback, RecyclerAnimationScrollHelper.ScrollListener {
    public final ChannelAdminLogActivity f$0;

    public ChannelAdminLogActivity$$ExternalSyntheticLambda0(ChannelAdminLogActivity channelAdminLogActivity) {
        this.f$0 = channelAdminLogActivity;
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
