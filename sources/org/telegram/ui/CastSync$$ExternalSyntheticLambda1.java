package org.telegram.ui;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

public final class CastSync$$ExternalSyntheticLambda1 implements PendingResult.StatusListener {
    public final int $r8$classId;

    public CastSync$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final void onComplete(Status status) {
        switch (this.$r8$classId) {
            case 0:
                CastSync.lambda$setPlaying$2(status);
                break;
            case 1:
                CastSync.lambda$setPlaying$3(status);
                break;
            case 2:
                CastSync.lambda$setVolume$1(status);
                break;
            case 3:
                CastSync.lambda$seekTo$0(status);
                break;
            default:
                CastSync.lambda$setSpeed$4(status);
                break;
        }
    }
}
