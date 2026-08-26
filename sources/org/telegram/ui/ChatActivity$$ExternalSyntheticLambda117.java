package org.telegram.ui;

import android.view.View;
import com.google.android.exoplayer2.util.Consumer;

public final class ChatActivity$$ExternalSyntheticLambda117 implements Consumer {
    public final int $r8$classId;

    public ChatActivity$$ExternalSyntheticLambda117(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity.lambda$didReceivedNotification5$182((View) obj);
                break;
            case 1:
                NewContactBottomSheet.AnonymousClass7.lambda$didFindQr$1((Long) obj);
                break;
            case 2:
                ChatActivity.lambda$didReceivedNotification5$180((View) obj);
                break;
            case 3:
                ProfileActivity.lambda$checkCanSendStoryForPosting$48((Boolean) obj);
                break;
            default:
                SelectAnimatedEmojiDialog.lambda$setEnterAnimationInProgress$40((View) obj);
                break;
        }
    }
}
