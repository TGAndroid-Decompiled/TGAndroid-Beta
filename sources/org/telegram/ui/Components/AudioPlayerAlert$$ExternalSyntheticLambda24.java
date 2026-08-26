package org.telegram.ui.Components;

import android.graphics.Bitmap;
import org.telegram.messenger.Utilities;

public final class AudioPlayerAlert$$ExternalSyntheticLambda24 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final AudioPlayerAlert f$0;

    public AudioPlayerAlert$$ExternalSyntheticLambda24(AudioPlayerAlert audioPlayerAlert, int i) {
        this.$r8$classId = i;
        this.f$0 = audioPlayerAlert;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showAlbumCover$20((Bitmap) obj, (Bitmap) obj2);
                break;
            default:
                this.f$0.lambda$new$2((Float) obj, (Boolean) obj2);
                break;
        }
    }
}
