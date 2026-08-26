package org.telegram.ui;

import android.view.View;

public final class ChannelCreateActivity$$ExternalSyntheticLambda17 implements View.OnClickListener {
    public final int $r8$classId;
    public final ChannelCreateActivity f$0;

    public ChannelCreateActivity$$ExternalSyntheticLambda17(ChannelCreateActivity channelCreateActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = channelCreateActivity;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createView$8(view);
                break;
            case 1:
                this.f$0.lambda$createView$11(view);
                break;
            case 2:
                this.f$0.lambda$createView$12(view);
                break;
            default:
                this.f$0.lambda$loadAdminedChannels$19(view);
                break;
        }
    }
}
