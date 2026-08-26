package org.telegram.ui.Components;

import android.net.Uri;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

public final class AudioPlayerAlert$$ExternalSyntheticLambda6 implements Utilities.Callback {
    public final int $r8$classId;
    public final AudioPlayerAlert f$0;

    public AudioPlayerAlert$$ExternalSyntheticLambda6(AudioPlayerAlert audioPlayerAlert, int i) {
        this.$r8$classId = i;
        this.f$0 = audioPlayerAlert;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onSubItemClick$19((MessageObject) obj);
                break;
            default:
                this.f$0.lambda$saveToMusic$52((Uri) obj);
                break;
        }
    }
}
