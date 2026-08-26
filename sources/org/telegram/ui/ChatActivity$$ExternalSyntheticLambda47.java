package org.telegram.ui;

import android.view.View;
import com.google.android.exoplayer2.util.Consumer;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

public final class ChatActivity$$ExternalSyntheticLambda47 implements Consumer {
    public final int $r8$classId;
    public final ChatActivity f$0;

    public ChatActivity$$ExternalSyntheticLambda47(ChatActivity chatActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createTopicsTabs$95((View) obj);
                break;
            case 1:
                this.f$0.lambda$didReceivedNotification4$177((TL_stories.TL_premium_boostsStatus) obj);
                break;
            default:
                this.f$0.lambda$didReceivedNotification4$176((ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
