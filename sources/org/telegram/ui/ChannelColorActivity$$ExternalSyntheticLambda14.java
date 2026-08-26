package org.telegram.ui;

import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.R;
import org.telegram.ui.Components.BulletinFactory;

public final class ChannelColorActivity$$ExternalSyntheticLambda14 implements Runnable {
    public final int $r8$classId;
    public final ChannelColorActivity f$0;

    public ChannelColorActivity$$ExternalSyntheticLambda14(ChannelColorActivity channelColorActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = channelColorActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$toggleTheme$17();
                break;
            default:
                ChannelColorActivity channelColorActivity = this.f$0;
                channelColorActivity.getClass();
                FactCheckController$$ExternalSyntheticOutline0.m(R.string.ChannelWallpaperUpdated, BulletinFactory.of(channelColorActivity), R.raw.done, 36);
                break;
        }
    }
}
