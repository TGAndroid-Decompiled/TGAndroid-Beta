package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

public final class ChatActivity$$ExternalSyntheticLambda57 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final ChatActivity f$0;

    public ChatActivity$$ExternalSyntheticLambda57(ChatActivity chatActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createTopicsTabs$98((Integer) obj, (Boolean) obj2);
                break;
            case 1:
                this.f$0.lambda$dimBehindView$109((Bitmap) obj, (Bitmap) obj2);
                break;
            case 2:
                this.f$0.lambda$updateScrimSourceBitmap$120((Bitmap) obj, (Bitmap) obj2);
                break;
            default:
                this.f$0.lambda$createTopicsTabs$99((Long) obj, (Boolean) obj2);
                break;
        }
    }
}
