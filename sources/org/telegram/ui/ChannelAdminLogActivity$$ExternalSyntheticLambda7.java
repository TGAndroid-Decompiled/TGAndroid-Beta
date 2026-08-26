package org.telegram.ui;

import android.os.Build;
import org.telegram.messenger.utils.OnPostDrawView;

public final class ChannelAdminLogActivity$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final ChannelAdminLogActivity f$0;

    public ChannelAdminLogActivity$$ExternalSyntheticLambda7(ChannelAdminLogActivity channelAdminLogActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = channelAdminLogActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ChannelAdminLogActivity channelAdminLogActivity = this.f$0;
                if (Build.VERSION.SDK_INT < 31) {
                    channelAdminLogActivity.getClass();
                    break;
                } else if (channelAdminLogActivity.scrollableViewNoiseSuppressor != null) {
                    OnPostDrawView onPostDrawView = channelAdminLogActivity.invalidateBlurredSourcesView;
                    if (onPostDrawView.invalidateFlags == 0) {
                        onPostDrawView.invalidate();
                    }
                    onPostDrawView.invalidateFlags |= 2;
                    break;
                }
                break;
            case 1:
                ChannelAdminLogActivity channelAdminLogActivity2 = this.f$0;
                channelAdminLogActivity2.highlightMessageId = Integer.MAX_VALUE;
                channelAdminLogActivity2.highlightMessageQuoteOffset = -1;
                channelAdminLogActivity2.updateVisibleRows();
                channelAdminLogActivity2.unselectRunnable = null;
                break;
            case 2:
                ChannelAdminLogActivity channelAdminLogActivity3 = this.f$0;
                channelAdminLogActivity3.saveScrollPosition(false);
                channelAdminLogActivity3.chatAdapter.notifyDataSetChanged();
                break;
            default:
                this.f$0.reloadLastMessages();
                break;
        }
    }
}
